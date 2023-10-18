(ns net.wikipunk.rdf.http-headers
  {:dcat/downloadURL "net/wikipunk/ext/http-headers.rdf",
   :namespaces       {"dcterms" "http://purl.org/dc/terms/",
                      "http" "http://www.w3.org/2011/http#",
                      "http-headers" "http://www.w3.org/2011/http-headers#",
                      "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                      "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type         :owl/Ontology,
   :rdfa/prefix      "http-headers",
   :rdfa/uri         "http://www.w3.org/2011/http-headers#"}
  (:refer-clojure :exclude [range]))

(def a-im
  {:db/ident :http-headers/a-im,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The A-IM header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "A-IM"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc3229.txt"}}})

(def accept
  {:db/ident :http-headers/accept,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Accept header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Accept"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def accept-additions
  {:db/ident :http-headers/accept-additions,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Accept-Additions header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Accept-Additions"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2324.txt"}}})

(def accept-charset
  {:db/ident :http-headers/accept-charset,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Accept-Charset header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Accept-Charset"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def accept-encoding
  {:db/ident :http-headers/accept-encoding,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Accept-Encoding header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Accept-Encoding"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def accept-features
  {:db/ident :http-headers/accept-features,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Accept-Features header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Accept-Features"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2295.txt"}}})

(def accept-language
  {:db/ident :http-headers/accept-language,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Accept-Language header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Accept-Language"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def accept-ranges
  {:db/ident :http-headers/accept-ranges,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Accept-Ranges header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Accept-Ranges"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def access-control
  {:db/ident :http-headers/access-control,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Access-Control header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Access-Control"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}
     {:xsd/anyURI "http://www.w3.org/2006/appformats/"}}})

(def access-control-allow-credentials
  {:db/ident :http-headers/access-control-allow-credentials,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Access-Control-Allow-Credentials header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Access-Control-Allow-Credentials"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}
     {:xsd/anyURI "http://www.w3.org/2006/appformats/"}}})

(def access-control-allow-headers
  {:db/ident :http-headers/access-control-allow-headers,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Access-Control-Allow-Headers header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Access-Control-Allow-Headers"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}
     {:xsd/anyURI "http://www.w3.org/2006/appformats/"}}})

(def access-control-allow-methods
  {:db/ident :http-headers/access-control-allow-methods,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Access-Control-Allow-Methods header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Access-Control-Allow-Methods"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}
     {:xsd/anyURI "http://www.w3.org/2006/appformats/"}}})

(def access-control-allow-origin
  {:db/ident :http-headers/access-control-allow-origin,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Access-Control-Allow-Origin header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Access-Control-Allow-Origin"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}
     {:xsd/anyURI "http://www.w3.org/2006/appformats/"}}})

(def access-control-max-age
  {:db/ident :http-headers/access-control-max-age,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Access-Control-Max-Age header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Access-Control-Max-Age"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}
     {:xsd/anyURI "http://www.w3.org/2006/appformats/"}}})

(def access-control-request-headers
  {:db/ident :http-headers/access-control-request-headers,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Access-Control-Request-Headers header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Access-Control-Request-Headers"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}
     {:xsd/anyURI "http://www.w3.org/2006/appformats/"}}})

(def access-control-request-method
  {:db/ident :http-headers/access-control-request-method,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Access-Control-Request-Method header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Access-Control-Request-Method"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}
     {:xsd/anyURI "http://www.w3.org/2006/appformats/"}}})

(def age
  {:db/ident :http-headers/age,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Age header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Age"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def allow
  {:db/ident :http-headers/allow,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Allow header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Allow"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def alternates
  {:db/ident :http-headers/alternates,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The alternates header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Alternates"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2295.txt"}}})

(def apply-to-redirect-ref
  {:db/ident :http-headers/apply-to-redirect-ref,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Apply-To-Redirect-Ref header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Apply-To-Redirect-Ref"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc4437.txt"}}})

(def authentication-info
  {:db/ident :http-headers/authentication-info,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Authentication-Info header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Authentication-Info"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2617.txt"}}})

(def authorization
  {:db/ident :http-headers/authorization,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Authorization header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Authorization"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def c-ext
  {:db/ident :http-headers/c-ext,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The C-Ext header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "C-Ext"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2774.txt"}}})

(def c-man
  {:db/ident :http-headers/c-man,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The C-Man header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "C-Man"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2774.txt"}}})

(def c-opt
  {:db/ident :http-headers/c-opt,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The C-Opt header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "C-Opt"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2774.txt"}}})

(def c-pep
  {:db/ident :http-headers/c-pep,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The C-PEP header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "C-PEP"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "http://www.w3.org/TR/WD-http-pep"}
     {:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}}})

(def c-pep-info
  {:db/ident :http-headers/c-pep-info,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The C-PEP-Info header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "C-PEP-Info"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "http://www.w3.org/TR/WD-http-pep"}
     {:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}}})

(def cache-control
  {:db/ident :http-headers/cache-control,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Cache-Control header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Cache-Control"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def compliance
  {:db/ident :http-headers/compliance,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Compliance header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Compliance"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.watersprings.org/pub/id/draft-ietf-http-options-02.txt"}
     {:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}}})

(def connection
  {:db/ident :http-headers/connection,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Connection header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Connection"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def content-base
  {:db/ident :http-headers/content-base,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Content-Base header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Content-Base"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2068.txt"}}})

(def content-disposition
  {:db/ident :http-headers/content-disposition,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Content-Disposition header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Content-Disposition"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def content-encoding
  {:db/ident :http-headers/content-encoding,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Content-Encoding header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Content-Encoding"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def content-id
  {:db/ident :http-headers/content-id,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Content-ID header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Content-ID"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.w3.org/TR/NOTE-drp-19970825"}}})

(def content-language
  {:db/ident :http-headers/content-language,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Content-Language header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Content-Language"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def content-length
  {:db/ident :http-headers/content-length,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Content-Length header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Content-Length"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def content-location
  {:db/ident :http-headers/content-location,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Content-Location header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Content-Location"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def content-md5
  {:db/ident :http-headers/content-md5,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Content-MD5 header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Content-MD5"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def content-range
  {:db/ident :http-headers/content-range,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Content-Range header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Content-Range"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def content-script-type
  {:db/ident :http-headers/content-script-type,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Content-Script-Type header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Content-Script-Type"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.w3.org/TR/1999/REC-html401-19991224/"}}})

(def content-style-type
  {:db/ident :http-headers/content-style-type,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Content-Style-Type header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Content-Style-Type"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.w3.org/TR/1999/REC-html401-19991224/"}}})

(def content-transfer-encoding
  {:db/ident :http-headers/content-transfer-encoding,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Content-Transfer-Encoding header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Content-Transfer-Encoding"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "http://www.w3.org/Protocols/HTTP/Object_Headers.html"}
     {:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}}})

(def content-type
  {:db/ident :http-headers/content-type,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Content-Type header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Content-Type"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def content-version
  {:db/ident :http-headers/content-version,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Content-Version header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Content-Version"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2068.txt"}}})

(def cookie
  {:db/ident :http-headers/cookie,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Cookie header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Cookie"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2965.txt"}}})

(def cookie2
  {:db/ident :http-headers/cookie2,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Cookie2 header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Cookie2"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2965.txt"}}})

(def cost
  {:db/ident :http-headers/cost,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Cost header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Cost"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "http://www.w3.org/Protocols/HTTP/Object_Headers.html"}
     {:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}}})

(def dasl
  {:db/ident :http-headers/dasl,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The DASL header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "DASL"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc5323.txt"}}})

(def date
  {:db/ident :http-headers/date,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Date header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Date"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def dav
  {:db/ident :http-headers/dav,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The DAV header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "DAV"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "http://www.ietf.org/rfc/rfc2518.txt"}
     {:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}}})

(def default-style
  {:db/ident :http-headers/default-style,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Default-Style header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Default-Style"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.w3.org/TR/1999/REC-html401-19991224/"}}})

(def delta-base
  {:db/ident :http-headers/delta-base,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Delta-Base header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Delta-Base"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc3229.txt"}}})

(def depth
  {:db/ident :http-headers/depth,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Depth header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Depth"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "http://www.ietf.org/rfc/rfc2518.txt"}
     {:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}}})

(def derived-from
  {:db/ident :http-headers/derived-from,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Derived-From header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Derived-From"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2068.txt"}}})

(def destination
  {:db/ident :http-headers/destination,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Destination header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Destination"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "http://www.ietf.org/rfc/rfc2518.txt"}
     {:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}}})

(def differential-id
  {:db/ident :http-headers/differential-id,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Differential-ID header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Differential-ID"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.w3.org/TR/NOTE-drp-19970825"}}})

(def digest
  {:db/ident :http-headers/digest,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Digest header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Digest"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc3230.txt"}}})

(def etag
  {:db/ident :http-headers/etag,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The ETag header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "ETag"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def expect
  {:db/ident :http-headers/expect,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Expect header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Expect"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def expires
  {:db/ident :http-headers/expires,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Expires header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Expires"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def ext
  {:db/ident :http-headers/ext,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Ext header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Ext"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2774.txt"}}})

(def from
  {:db/ident :http-headers/from,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The From header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "From"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def getprofile
  {:db/ident :http-headers/getprofile,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The GetProfile header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "GetProfile"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.w3.org/TR/NOTE-OPS-OverHTTP"}}})

(def host
  {:db/ident :http-headers/host,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Host header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Host"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def if
  {:db/ident :http-headers/if,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The If header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "If"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "http://www.ietf.org/rfc/rfc2518.txt"}
     {:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}}})

(def if-match
  {:db/ident :http-headers/if-match,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The If-Match header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "If-Match"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def if-modified-since
  {:db/ident :http-headers/if-modified-since,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The If-Modified-Since header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "If-Modified-Since"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def if-none-match
  {:db/ident :http-headers/if-none-match,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The If-None-Match header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "If-None-Match"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def if-range
  {:db/ident :http-headers/if-range,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The If-Range header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "If-Range"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def if-unmodified-since
  {:db/ident :http-headers/if-unmodified-since,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The If-Unmodified-Since header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "If-Unmodified-Since"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def im
  {:db/ident :http-headers/im,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The IM header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "IM"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc3229.txt"}}})

(def keep-alive
  {:db/ident :http-headers/keep-alive,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Keep-Alive header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Keep-Alive"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2068.txt"}}})

(def label
  {:db/ident :http-headers/label,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Label header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Label"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc3253.txt"}}})

(def last-modified
  {:db/ident :http-headers/last-modified,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Last-Modified header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Last-Modified"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def link
  {:db/ident :http-headers/link,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Link header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Link"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2068.txt"}}})

(def location
  {:db/ident :http-headers/location,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Location header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Location"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def lock-token
  {:db/ident :http-headers/lock-token,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Lock-Token header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Lock-Token"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "http://www.ietf.org/rfc/rfc2518.txt"}
     {:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}}})

(def man
  {:db/ident :http-headers/man,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Man header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Man"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2774.txt"}}})

(def max-forwards
  {:db/ident :http-headers/max-forwards,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Max-Forwards header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Max-Forwards"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def message-id
  {:db/ident :http-headers/message-id,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Message-ID header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Message-ID"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "http://www.w3.org/Protocols/HTTP/Object_Headers.html"}
     {:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}}})

(def meter
  {:db/ident :http-headers/meter,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Meter header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Meter"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2227.txt"}}})

(def method-check
  {:db/ident :http-headers/method-check,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Method-Check header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Method-Check"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}
     {:xsd/anyURI "http://www.w3.org/2006/appformats/"}}})

(def method-check-expires
  {:db/ident :http-headers/method-check-expires,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Method-Check-Expires header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Method-Check-Expires"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}
     {:xsd/anyURI "http://www.w3.org/2006/appformats/"}}})

(def mime-version
  {:db/ident :http-headers/mime-version,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The MIME-Version header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "MIME-Version"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def negotiate
  {:db/ident :http-headers/negotiate,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Negotiate header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Negotiate"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2295.txt"}}})

(def non-compliance
  {:db/ident :http-headers/non-compliance,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Non-Compliance header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Non-Compliance"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "http://www.w3.org/Protocols/HTTP/Object_Headers.html"}
     {:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}}})

(def opt
  {:db/ident :http-headers/opt,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Opt header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Opt"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2774.txt"}}})

(def optional
  {:db/ident :http-headers/optional,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Optional header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Optional"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}
     {:xsd/anyURI
      "http://www3.ietf.org/proceedings/98dec/I-D/draft-girod-w3-id-res-ext-00.txt"}}})

(def ordering-type
  {:db/ident :http-headers/ordering-type,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Ordering-Type header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Ordering-Type"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc3648.txt"}}})

(def origin
  {:db/ident :http-headers/origin,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Origin header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Origin"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}
     {:xsd/anyURI "http://www.w3.org/2006/appformats/"}}})

(def overwrite
  {:db/ident :http-headers/overwrite,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The overwrite header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Overwrite"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "http://www.ietf.org/rfc/rfc2518.txt"}
     {:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}}})

(def p3p
  {:db/ident :http-headers/p3p,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The P3P header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "P3P"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.w3.org/TR/2002/REC-P3P-20020416/"}}})

(def pep
  {:db/ident :http-headers/pep,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The PEP header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "PEP"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "http://www.w3.org/TR/WD-http-pep"}
     {:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}}})

(def pep-info
  {:db/ident :http-headers/pep-info,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Pep-Info header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Pep-Info"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "http://www.w3.org/TR/WD-http-pep"}
     {:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}}})

(def pics-label
  {:db/ident :http-headers/pics-label,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The PICS-Label header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "PICS-Label"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.w3.org/TR/REC-PICS-labels-961031"}}})

(def position
  {:db/ident :http-headers/position,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Position header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Position"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc3648.txt"}}})

(def pragma
  {:db/ident :http-headers/pragma,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Pragma header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Pragma"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def profileobject
  {:db/ident :http-headers/profileobject,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The ProfileObject header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "ProfileObject"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.w3.org/TR/NOTE-OPS-OverHTTP"}}})

(def protocol
  {:db/ident :http-headers/protocol,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Protocol header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Protocol"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.w3.org/TR/REC-PICS-labels-961031"}}})

(def protocol-info
  {:db/ident :http-headers/protocol-info,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Protocol-Info header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Protocol-Info"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.w3.org/TR/NOTE-jepi-970519"}}})

(def protocol-query
  {:db/ident :http-headers/protocol-query,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Protocol-Query header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Protocol-Query"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.w3.org/TR/NOTE-jepi-970519"}}})

(def protocol-request
  {:db/ident :http-headers/protocol-request,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Protocol-Request header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Protocol-Request"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.w3.org/TR/REC-PICS-labels-961031"}}})

(def proxy-authenticate
  {:db/ident :http-headers/proxy-authenticate,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Proxy-Authenticate header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Proxy-Authenticate"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def proxy-authentication-info
  {:db/ident :http-headers/proxy-authentication-info,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Proxy-Authentication-Info header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Proxy-Authentication-Info"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2617.txt"}}})

(def proxy-authorization
  {:db/ident :http-headers/proxy-authorization,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Proxy-Authorization header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Proxy-Authorization"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def proxy-features
  {:db/ident :http-headers/proxy-features,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Proxy-Features header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Proxy-Features"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.w3.org/TR/WD-proxy-960221"}}})

(def proxy-instruction
  {:db/ident :http-headers/proxy-instruction,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Proxy-Instruction header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Proxy-Instruction"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.w3.org/TR/WD-proxy-960221"}}})

(def public
  {:db/ident :http-headers/public,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Public header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Public"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2068.txt"}}})

(def range
  {:db/ident :http-headers/range,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Range header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Range"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def redirect-ref
  {:db/ident :http-headers/redirect-ref,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Redirect-Ref header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Redirect-Ref"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc4437.txt"}}})

(def referer
  {:db/ident :http-headers/referer,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Referer header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Referer"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def referer-root
  {:db/ident :http-headers/referer-root,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Referer-Root header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Referer-Root"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}
     {:xsd/anyURI "http://www.w3.org/2006/appformats/"}}})

(def resolution-hint
  {:db/ident :http-headers/resolution-hint,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Resolution-Hint header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Resolution-Hint"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}
     {:xsd/anyURI
      "http://www3.ietf.org/proceedings/98dec/I-D/draft-girod-w3-id-res-ext-00.txt"}}})

(def resolver-location
  {:db/ident :http-headers/resolver-location,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Resolver-Location header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Resolver-Location"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}
     {:xsd/anyURI
      "http://www3.ietf.org/proceedings/98dec/I-D/draft-girod-w3-id-res-ext-00.txt"}}})

(def retry-after
  {:db/ident :http-headers/retry-after,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Retry-After header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Retry-After"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def safe
  {:db/ident :http-headers/safe,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Safe header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Safe"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2310.txt"}}})

(def security-scheme
  {:db/ident :http-headers/security-scheme,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Security-Scheme header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Security-Scheme"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2660.txt"}}})

(def server
  {:db/ident :http-headers/server,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Server header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Server"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def set-cookie
  {:db/ident :http-headers/set-cookie,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Set-Cookie header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Set-Cookie"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2109.txt"}}})

(def set-cookie2
  {:db/ident :http-headers/set-cookie2,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Set-Cookie2 header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Set-Cookie2"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2965.txt"}}})

(def setprofile
  {:db/ident :http-headers/setprofile,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The SetProfile header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "SetProfile"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.w3.org/TR/NOTE-OPS-OverHTTP"}}})

(def slug
  {:db/ident :http-headers/slug,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The SLUG header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "SLUG"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI
      "http://tools.ietf.org/html/draft-ietf-atompub-protocol-17"}}})

(def soapaction
  {:db/ident :http-headers/soapaction,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The SoapAction header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "SoapAction"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.w3.org/TR/2000/NOTE-SOAP-20000508/"}}})

(def status-uri
  {:db/ident :http-headers/status-uri,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Status-URI header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Status-URI"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "http://www.ietf.org/rfc/rfc2518.txt"}
     {:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}}})

(def subok
  {:db/ident :http-headers/subok,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The SubOK header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "SubOK"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}
     {:xsd/anyURI
      "http://www3.ietf.org/proceedings/98dec/I-D/draft-mogul-http-dupsup-00.txt"}}})

(def subst
  {:db/ident :http-headers/subst,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Subst header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Subst"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}
     {:xsd/anyURI
      "http://www3.ietf.org/proceedings/98dec/I-D/draft-mogul-http-dupsup-00.txt"}}})

(def surrogate-capability
  {:db/ident :http-headers/surrogate-capability,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Surrogate-Capability header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Surrogate-Capability"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.w3.org/TR/2001/NOTE-edge-arch-20010804"}}})

(def surrogate-control
  {:db/ident :http-headers/surrogate-control,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Surrogate-Control header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Surrogate-Control"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.w3.org/TR/2001/NOTE-edge-arch-20010804"}}})

(def tcn
  {:db/ident :http-headers/tcn,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The TCN header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "TCN"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2295.txt"}}})

(def te
  {:db/ident :http-headers/te,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The TE header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "TE"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def timeout
  {:db/ident :http-headers/timeout,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Timeout header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Timeout"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "http://www.ietf.org/rfc/rfc2518.txt"}
     {:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}}})

(def title
  {:db/ident :http-headers/title,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Title header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Title"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "http://www.w3.org/Protocols/HTTP/Object_Headers.html"}
     {:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}}})

(def trailer
  {:db/ident :http-headers/trailer,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Trailer header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Trailer"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def transfer-encoding
  {:db/ident :http-headers/transfer-encoding,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Transfer-Encoding header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Transfer-Encoding"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def ua-color
  {:db/ident :http-headers/ua-color,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The UA-Color header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "UA-Color"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}
     {:xsd/anyURI
      "http://www.watersprings.org/pub/id/draft-mutz-http-attributes-00.txt"}}})

(def ua-media
  {:db/ident :http-headers/ua-media,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The UA-Media header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "UA-Media"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}
     {:xsd/anyURI
      "http://www.watersprings.org/pub/id/draft-mutz-http-attributes-00.txt"}}})

(def ua-pixels
  {:db/ident :http-headers/ua-pixels,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The UA-Pixels header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "UA-Pixels"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}
     {:xsd/anyURI
      "http://www.watersprings.org/pub/id/draft-mutz-http-attributes-00.txt"}}})

(def ua-resolution
  {:db/ident :http-headers/ua-resolution,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The UA-Resolution header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "UA-Resolution"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}
     {:xsd/anyURI
      "http://www.watersprings.org/pub/id/draft-mutz-http-attributes-00.txt"}}})

(def ua-windowpixels
  {:db/ident :http-headers/ua-windowpixels,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The  header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    ""},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}
     {:xsd/anyURI
      "http://www.watersprings.org/pub/id/draft-mutz-http-attributes-00.txt"}}})

(def upgrade
  {:db/ident :http-headers/upgrade,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Upgrade header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Upgrade"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def uri
  {:db/ident :http-headers/uri,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The URI header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "URI"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2068.txt"}}})

(def user-agent
  {:db/ident :http-headers/user-agent,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The User-Agent header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "User-Agent"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def variant-vary
  {:db/ident :http-headers/variant-vary,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Variant-Vary header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Variant-Vary"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2295.txt"}}})

(def vary
  {:db/ident :http-headers/vary,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Vary header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Vary"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def version
  {:db/ident :http-headers/version,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Version header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Version"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "http://www.w3.org/Protocols/HTTP/Object_Headers.html"}
     {:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}}})

(def via
  {:db/ident :http-headers/via,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Via header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Via"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def want-digest
  {:db/ident :http-headers/want-digest,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Want-Digest header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Want-Digest"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc3230.txt"}}})

(def warning
  {:db/ident :http-headers/warning,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Warning header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Warning"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def www-authenticate
  {:db/ident :http-headers/www-authenticate,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The WWW-Authenticate header, as defined in the Permanent HTTP Header Field Registrations."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "WWW-Authenticate"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/perm-headers.html"}
     {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}}})

(def x-device-accept
  {:db/ident :http-headers/x-device-accept,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The X-Device-Accept header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "X-Device-Accept"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "http://www.w3.org/2005/MWI/BPWG/"}
     {:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}}})

(def x-device-accept-charset
  {:db/ident :http-headers/x-device-accept-charset,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The X-Device-Accept-Charset header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "X-Device-Accept-Charset"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "http://www.w3.org/2005/MWI/BPWG/"}
     {:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}}})

(def x-device-accept-encoding
  {:db/ident :http-headers/x-device-accept-encoding,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The X-Device-Accept-Encoding header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "X-Device-Accept-Encoding"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "http://www.w3.org/2005/MWI/BPWG/"}
     {:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}}})

(def x-device-accept-language
  {:db/ident :http-headers/x-device-accept-language,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The X-Device-Accept-Language header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "X-Device-Accept-Language"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "http://www.w3.org/2005/MWI/BPWG/"}
     {:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}}})

(def x-device-user-agent
  {:db/ident :http-headers/x-device-user-agent,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The X-Device-User-Agent header, as defined in the Provisional HTTP Header Field Submissions."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "X-Device-User-Agent"},
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "http://www.w3.org/2005/MWI/BPWG/"}
     {:xsd/anyURI
      "http://www.iana.org/assignments/message-headers/prov-headers.html"}}})

(def urn:uuid:e307d4d8-b018-5e3c-977f-704bfac39b36
  {:dcterms/identifier "http://www.w3.org/TR/2002/REC-P3P-20020416/",
   :dcterms/title
   {:rdf/language "en",
    :rdf/value
    "The Platform for Privacy Preferences 1.0 (P3P1.0) Specification"},
   :xsd/anyURI "http://www.w3.org/TR/2002/REC-P3P-20020416/"})

(def urn:uuid:c65f8f01-04bc-564d-a27c-b889851ac7f1
  {:dcterms/identifier "http://www.ietf.org/rfc/rfc2227.txt",
   :dcterms/title      {:rdf/language "en",
                        :rdf/value
                        "Simple Hit-Metering and Usage-Limiting for HTTP"},
   :xsd/anyURI         "http://www.ietf.org/rfc/rfc2227.txt"})

(def urn:uuid:3235fdc7-818a-5ad5-81ef-3e11974112c8
  {:dcterms/identifier
   "http://tools.ietf.org/html/draft-ietf-atompub-protocol-17",
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "The Atom Publishing Protocol"},
   :xsd/anyURI "http://tools.ietf.org/html/draft-ietf-atompub-protocol-17"})

(def urn:uuid:49e02493-2b3d-56d6-80ae-434c68351d7e
  {:dcterms/identifier "http://www.w3.org/TR/2000/NOTE-SOAP-20000508/",
   :dcterms/title      {:rdf/language "en",
                        :rdf/value "Simple Object Access Protocol (SOAP) 1.1"},
   :xsd/anyURI         "http://www.w3.org/TR/2000/NOTE-SOAP-20000508/"})

(def urn:uuid:d7da764b-0074-52af-b328-26ccecbcf007
  {:dcterms/identifier "http://www.ietf.org/rfc/rfc3253.txt",
   :dcterms/title
   {:rdf/language "en",
    :rdf/value
    "Versioning Extensions to WebDAV (Web Distributed Authoring and Versioning)"},
   :xsd/anyURI "http://www.ietf.org/rfc/rfc3253.txt"})

(def urn:uuid:7634cdca-b604-5456-94a7-3f468a53be14
  {:dcterms/identifier "http://www.ietf.org/rfc/rfc3648.txt",
   :dcterms/title
   {:rdf/language "en",
    :rdf/value
    "Web Distributed Authoring and Versioning (WebDAV) Redirect Reference Resources"},
   :xsd/anyURI "http://www.ietf.org/rfc/rfc4437.txt"})

(def urn:uuid:a2c7860c-975a-5a52-be8e-3728df3bfdad
  {:dcterms/identifier "http://www.ietf.org/rfc/rfc3229.txt",
   :dcterms/title      {:rdf/language "en",
                        :rdf/value    "Delta encoding in HTTP"},
   :xsd/anyURI         "http://www.ietf.org/rfc/rfc3229.txt"})

(def urn:uuid:7601aeab-91a2-5b79-806f-b2f198042393
  {:dcterms/identifier "http://www.ietf.org/rfc/rfc2616.txt",
   :dcterms/title      {:rdf/language "en",
                        :rdf/value "Hypertext Transfer Protocol -- HTTP/1.1"},
   :xsd/anyURI         "http://www.ietf.org/rfc/rfc2616.txt"})

(def urn:uuid:8059c754-d124-5846-aaad-d6e830ed6fb2
  {:dcterms/identifier "http://www.ietf.org/rfc/rfc2617.txt",
   :dcterms/title
   {:rdf/language "en",
    :rdf/value "HTTP Authentication: Basic and Digest Access Authentication"},
   :xsd/anyURI "http://www.ietf.org/rfc/rfc2617.txt"})

(def urn:uuid:b2cee6e4-1cfc-5c5d-9b1a-21718d610d37
  {:dcterms/identifier "http://www.ietf.org/rfc/rfc5323.txt",
   :dcterms/title {:rdf/language "en",
                   :rdf/value
                   "Web Distributed Authoring and Versioning (WebDAV) SEARCH"},
   :xsd/anyURI "http://www.ietf.org/rfc/rfc5323.txt"})

(def urn:uuid:22e6f9c1-65de-51f1-9be9-8fe6d2271798
  {:dcterms/identifier "http://www.ietf.org/rfc/rfc2774.txt",
   :dcterms/title      {:rdf/language "en",
                        :rdf/value    "An HTTP Extension Framework"},
   :xsd/anyURI         "http://www.ietf.org/rfc/rfc2774.txt"})

(def urn:uuid:5c2d7eaf-035a-5444-a728-f7175ec0405d
  {:dcterms/identifier "http://www.ietf.org/rfc/rfc2518.txt",
   :dcterms/title      {:rdf/language "en",
                        :rdf/value
                        "HTTP Extensions for Distributed Authoring -- WEBDAV"},
   :xsd/anyURI         "http://www.ietf.org/rfc/rfc2518.txt"})

(def urn:uuid:bcc10544-3e99-5602-b0dd-e4697d574ec9
  {:dcterms/identifier
   "http://www.watersprings.org/pub/id/draft-mutz-http-attributes-00.txt",
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "User-Agent Display Attributes Headers"},
   :xsd/anyURI
   "http://www.watersprings.org/pub/id/draft-mutz-http-attributes-00.txt"})

(def urn:uuid:0e610fc0-6e23-5409-8eb8-3e5505721f12
  {:dcterms/identifier "http://www.ietf.org/rfc/rfc2310.txt",
   :dcterms/title      {:rdf/language "en",
                        :rdf/value    "The Safe Response Header Field"},
   :xsd/anyURI         "http://www.ietf.org/rfc/rfc2310.txt"})

(def urn:uuid:3da20e68-b99b-5d3c-a828-9b9cd69fbb3b
  {:dcterms/identifier
   "http://www3.ietf.org/proceedings/98dec/I-D/draft-girod-w3-id-res-ext-00.txt",
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "WIRE - W3 Identifier Resolution Extensions"},
   :xsd/anyURI
   "http://www3.ietf.org/proceedings/98dec/I-D/draft-girod-w3-id-res-ext-00.txt"})

(def urn:uuid:f5c9c58c-dc8b-586d-8c88-a05a490b8bd6
  {:dcterms/identifier "http://www.ietf.org/rfc/rfc3648.txt",
   :dcterms/title
   {:rdf/language "en",
    :rdf/value
    "Web Distributed Authoring and Versioning (WebDAV) Ordered Collections Protocol"},
   :xsd/anyURI "http://www.ietf.org/rfc/rfc3648.txt"})

(def urn:uuid:f3c0b7e8-ddac-59d7-8b95-4c7bcc9ac227
  {:dcterms/identifier "http://www.ietf.org/rfc/rfc2109.txt",
   :dcterms/title      {:rdf/language "en",
                        :rdf/value    "HTTP State Management Mechanism"},
   :xsd/anyURI         "http://www.ietf.org/rfc/rfc2109.txt"})

(def urn:uuid:bf734810-18ff-51b2-82ba-fc2d1bc0fa65
  {:dcterms/identifier "http://www.w3.org/Protocols/HTTP/Object_Headers.html",
   :dcterms/title      {:rdf/language "en",
                        :rdf/value    "Object Header lines in HTTP"},
   :xsd/anyURI         "http://www.w3.org/Protocols/HTTP/Object_Headers.html"})

(def urn:uuid:21786d33-3f4a-53ee-a16e-4bf5d9cc91d3
  {:dcterms/identifier "http://www.ietf.org/rfc/rfc2324.txt",
   :dcterms/title      {:rdf/language "en",
                        :rdf/value
                        "Hyper Text Coffee Pot Control Protocol (HTCPCP/1.0)"},
   :xsd/anyURI         "http://www.ietf.org/rfc/rfc2324.txt"})

(def urn:uuid:3fd2a84b-c2d2-5900-bd54-4a3bb9f474b0
  {:dcterms/identifier "http://www.w3.org/TR/NOTE-drp-19970825",
   :dcterms/title      {:rdf/language "en",
                        :rdf/value
                        "The HTTP Distribution and Replication Protocol"},
   :xsd/anyURI         "http://www.w3.org/TR/NOTE-drp-19970825"})

(def urn:uuid:c9c94c37-a399-54a6-b7a9-f385e231de83
  {:dcterms/identifier "http://www.w3.org/2006/appformats/",
   :dcterms/title      {:rdf/language "en",
                        :rdf/value
                        "Web Application Formats (WAF) Working Group"},
   :xsd/anyURI         "http://www.w3.org/2006/appformats/"})

(def urn:uuid:317bb722-0779-5a04-83ee-24c2b78c3455
  {:dcterms/identifier "http://www.w3.org/TR/WD-proxy-960221",
   :dcterms/title      {:rdf/language "en",
                        :rdf/value    "Notification for Proxy Caches"},
   :xsd/anyURI         "http://www.w3.org/TR/WD-proxy-960221"})

(def urn:uuid:f3baa85b-e538-59ae-baca-eb7615be9dae
  {:dcterms/identifier
   "http://www3.ietf.org/proceedings/98dec/I-D/draft-mogul-http-dupsup-00.txt",
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Duplicate Suppression in HTTP"},
   :xsd/anyURI
   "http://www3.ietf.org/proceedings/98dec/I-D/draft-mogul-http-dupsup-00.txt"})

(def urn:uuid:1d8db4d9-0e29-5ebe-b232-efd4fdc77826
  {:dcterms/identifier "http://www.w3.org/TR/REC-PICS-labels-961031",
   :dcterms/title
   {:rdf/language "en",
    :rdf/value
    "PICS 1.1 Label Distribution -- Label Syntax and Communication Protocols"},
   :xsd/anyURI "http://www.w3.org/TR/REC-PICS-labels-961031"})

(def urn:uuid:141f4e0a-a7cb-548f-8b03-45f7a027c765
  {:dcterms/identifier "http://www.w3.org/TR/WD-http-pep",
   :dcterms/title      {:rdf/language "en",
                        :rdf/value
                        "PEP Specification: an Extension Mechanism for HTTP"},
   :xsd/anyURI         "http://www.w3.org/TR/WD-http-pep"})

(def urn:uuid:f2dd9671-75ce-5f91-941b-0bc04ccf0ed1
  {:dcterms/identifier "http://www.ietf.org/rfc/rfc2068.txt",
   :dcterms/title      {:rdf/language "en",
                        :rdf/value "Hypertext Transfer Protocol -- HTTP/1.1"},
   :xsd/anyURI         "http://www.ietf.org/rfc/rfc2068.txt"})

(def urn:uuid:f3ea0ca8-45d5-52c4-b161-5b6ba8080e77
  {:dcterms/identifier "http://www.ietf.org/rfc/rfc2660.txt",
   :dcterms/title      {:rdf/language "en",
                        :rdf/value    "The Secure HyperText Transfer Protocol"},
   :xsd/anyURI         "http://www.ietf.org/rfc/rfc2660.txt"})

(def urn:uuid:56954da0-7cff-5a92-a11d-137522f0c4e7
  {:dcterms/identifier "http://www.ietf.org/rfc/rfc2965.txt",
   :dcterms/title      {:rdf/language "en",
                        :rdf/value    "HTTP State Management Mechanism"},
   :xsd/anyURI         "http://www.ietf.org/rfc/rfc2965.txt"})

(def urn:uuid:b989a818-7680-5813-91e4-39ea8e594d16
  {:dcterms/identifier "http://www.w3.org/TR/2001/NOTE-edge-arch-20010804",
   :dcterms/title      {:rdf/language "en",
                        :rdf/value    "Edge Architecture Specification"},
   :xsd/anyURI         "http://www.w3.org/TR/2001/NOTE-edge-arch-20010804"})

(def urn:uuid:0bed71a1-4bb7-5fb6-b24e-39980fca4294
  {:dcterms/identifier "http://www.ietf.org/rfc/rfc2295.txt",
   :dcterms/title      {:rdf/language "en",
                        :rdf/value "Transparent Content Negotiation in HTTP"},
   :xsd/anyURI         "http://www.ietf.org/rfc/rfc2295.txt"})

(def urn:uuid:1038432f-502b-5258-8462-f7f47418b0a4
  {:dcterms/identifier "http://www.w3.org/TR/NOTE-jepi-970519",
   :dcterms/title      {:rdf/language "en",
                        :rdf/value
                        "White Paper: Joint Electronic Payment Initiative"},
   :xsd/anyURI         "http://www.w3.org/TR/NOTE-jepi-970519"})

(def urn:uuid:7c2255bf-0ac5-52d1-88a3-709e198d9a73
  {:dcterms/identifier "http://www.ietf.org/rfc/rfc3230.txt",
   :dcterms/title      {:rdf/language "en",
                        :rdf/value    "Instance Digests in HTTP"},
   :xsd/anyURI         "http://www.ietf.org/rfc/rfc3230.txt"})

(def urn:uuid:8861c653-2550-5830-9ab3-5d96dcdb36ed
  {:dcterms/identifier "http://www.w3.org/2005/MWI/BPWG/",
   :dcterms/title      {:rdf/language "en",
                        :rdf/value "Mobile Web Best Practices Working Group"},
   :xsd/anyURI         "http://www.w3.org/2005/MWI/BPWG/"})

(def urn:uuid:3fbfa3d0-474b-5aa1-87d7-e85f6bb4168e
  {:dcterms/identifier "http://www.w3.org/TR/NOTE-OPS-OverHTTP",
   :dcterms/title      {:rdf/language "en",
                        :rdf/value    "Implementation of OPS Over HTTP"},
   :xsd/anyURI         "http://www.w3.org/TR/NOTE-OPS-OverHTTP"})

(def urn:uuid:44a0004a-c300-58af-a147-b6a194b4526f
  {:dcterms/identifier "http://www.w3.org/TR/1999/REC-html401-19991224/",
   :dcterms/title      {:rdf/language "en",
                        :rdf/value    "HTML 4.01 Specification"},
   :xsd/anyURI         "http://www.w3.org/TR/1999/REC-html401-19991224/"})

(def urn:uuid:2a8cb392-9288-5559-b1d5-7039a930a929
  {:dcterms/identifier
   "http://www.watersprings.org/pub/id/draft-ietf-http-options-02.txt",
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Specification of HTTP/1.1 OPTIONS messages"},
   :xsd/anyURI
   "http://www.watersprings.org/pub/id/draft-ietf-http-options-02.txt"})