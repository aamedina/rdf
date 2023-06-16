(ns net.wikipunk.rdf.http-headers
  "The Platform for Privacy Preferences 1.0 (P3P1.0) Specification"
  {:dcat/downloadURL "resources/http-headers.rdf",
   :dcterms/identifier "http://www.w3.org/TR/2002/REC-P3P-20020416/",
   :dcterms/title
   #voc/lstr
    "The Platform for Privacy Preferences 1.0 (P3P1.0) Specification@en",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "http" "http://www.w3.org/2011/http#",
                       "http-headers" "http://www.w3.org/2011/http-headers#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "http-headers",
   :rdfa/uri "http://www.w3.org/TR/2002/REC-P3P-20020416/"}
  (:refer-clojure :exclude [range]))

(def a-im
  "The A-IM header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/a-im,
   :dcterms/description
   #voc/lstr
    "The A-IM header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "A-IM@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc3229.txt"]})

(def accept
  "The Accept header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/accept,
   :dcterms/description
   #voc/lstr
    "The Accept header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Accept@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def accept-additions
  "The Accept-Additions header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/accept-additions,
   :dcterms/description
   #voc/lstr
    "The Accept-Additions header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Accept-Additions@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2324.txt"]})

(def accept-charset
  "The Accept-Charset header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/accept-charset,
   :dcterms/description
   #voc/lstr
    "The Accept-Charset header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Accept-Charset@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def accept-encoding
  "The Accept-Encoding header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/accept-encoding,
   :dcterms/description
   #voc/lstr
    "The Accept-Encoding header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Accept-Encoding@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def accept-features
  "The Accept-Features header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/accept-features,
   :dcterms/description
   #voc/lstr
    "The Accept-Features header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Accept-Features@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2295.txt"]})

(def accept-language
  "The Accept-Language header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/accept-language,
   :dcterms/description
   #voc/lstr
    "The Accept-Language header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Accept-Language@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def accept-ranges
  "The Accept-Ranges header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/accept-ranges,
   :dcterms/description
   #voc/lstr
    "The Accept-Ranges header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Accept-Ranges@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def access-control
  "The Access-Control header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/access-control,
   :dcterms/description
   #voc/lstr
    "The Access-Control header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "Access-Control@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.w3.org/2006/appformats/"]})

(def access-control-allow-credentials
  "The Access-Control-Allow-Credentials header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/access-control-allow-credentials,
   :dcterms/description
   #voc/lstr
    "The Access-Control-Allow-Credentials header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "Access-Control-Allow-Credentials@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.w3.org/2006/appformats/"]})

(def access-control-allow-headers
  "The Access-Control-Allow-Headers header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/access-control-allow-headers,
   :dcterms/description
   #voc/lstr
    "The Access-Control-Allow-Headers header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "Access-Control-Allow-Headers@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.w3.org/2006/appformats/"]})

(def access-control-allow-methods
  "The Access-Control-Allow-Methods header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/access-control-allow-methods,
   :dcterms/description
   #voc/lstr
    "The Access-Control-Allow-Methods header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "Access-Control-Allow-Methods@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.w3.org/2006/appformats/"]})

(def access-control-allow-origin
  "The Access-Control-Allow-Origin header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/access-control-allow-origin,
   :dcterms/description
   #voc/lstr
    "The Access-Control-Allow-Origin header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "Access-Control-Allow-Origin@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.w3.org/2006/appformats/"]})

(def access-control-max-age
  "The Access-Control-Max-Age header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/access-control-max-age,
   :dcterms/description
   #voc/lstr
    "The Access-Control-Max-Age header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "Access-Control-Max-Age@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.w3.org/2006/appformats/"]})

(def access-control-request-headers
  "The Access-Control-Request-Headers header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/access-control-request-headers,
   :dcterms/description
   #voc/lstr
    "The Access-Control-Request-Headers header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "Access-Control-Request-Headers@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.w3.org/2006/appformats/"]})

(def access-control-request-method
  "The Access-Control-Request-Method header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/access-control-request-method,
   :dcterms/description
   #voc/lstr
    "The Access-Control-Request-Method header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "Access-Control-Request-Method@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.w3.org/2006/appformats/"]})

(def age
  "The Age header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/age,
   :dcterms/description
   #voc/lstr
    "The Age header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Age@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def allow
  "The Allow header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/allow,
   :dcterms/description
   #voc/lstr
    "The Allow header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Allow@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def alternates
  "The alternates header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/alternates,
   :dcterms/description
   #voc/lstr
    "The alternates header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Alternates@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2295.txt"]})

(def apply-to-redirect-ref
  "The Apply-To-Redirect-Ref header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/apply-to-redirect-ref,
   :dcterms/description
   #voc/lstr
    "The Apply-To-Redirect-Ref header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Apply-To-Redirect-Ref@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc4437.txt"]})

(def authentication-info
  "The Authentication-Info header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/authentication-info,
   :dcterms/description
   #voc/lstr
    "The Authentication-Info header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Authentication-Info@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2617.txt"]})

(def authorization
  "The Authorization header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/authorization,
   :dcterms/description
   #voc/lstr
    "The Authorization header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Authorization@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def c-ext
  "The C-Ext header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/c-ext,
   :dcterms/description
   #voc/lstr
    "The C-Ext header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "C-Ext@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2774.txt"]})

(def c-man
  "The C-Man header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/c-man,
   :dcterms/description
   #voc/lstr
    "The C-Man header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "C-Man@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2774.txt"]})

(def c-opt
  "The C-Opt header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/c-opt,
   :dcterms/description
   #voc/lstr
    "The C-Opt header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "C-Opt@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2774.txt"]})

(def c-pep
  "The C-PEP header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/c-pep,
   :dcterms/description
   #voc/lstr
    "The C-PEP header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "C-PEP@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.w3.org/TR/WD-http-pep"]})

(def c-pep-info
  "The C-PEP-Info header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/c-pep-info,
   :dcterms/description
   #voc/lstr
    "The C-PEP-Info header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "C-PEP-Info@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.w3.org/TR/WD-http-pep"]})

(def cache-control
  "The Cache-Control header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/cache-control,
   :dcterms/description
   #voc/lstr
    "The Cache-Control header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Cache-Control@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def compliance
  "The Compliance header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/compliance,
   :dcterms/description
   #voc/lstr
    "The Compliance header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "Compliance@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.watersprings.org/pub/id/draft-ietf-http-options-02.txt"]})

(def connection
  "The Connection header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/connection,
   :dcterms/description
   #voc/lstr
    "The Connection header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Connection@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def content-base
  "The Content-Base header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/content-base,
   :dcterms/description
   #voc/lstr
    "The Content-Base header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Content-Base@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2068.txt"]})

(def content-disposition
  "The Content-Disposition header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/content-disposition,
   :dcterms/description
   #voc/lstr
    "The Content-Disposition header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Content-Disposition@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def content-encoding
  "The Content-Encoding header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/content-encoding,
   :dcterms/description
   #voc/lstr
    "The Content-Encoding header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Content-Encoding@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def content-id
  "The Content-ID header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/content-id,
   :dcterms/description
   #voc/lstr
    "The Content-ID header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Content-ID@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.w3.org/TR/NOTE-drp-19970825"]})

(def content-language
  "The Content-Language header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/content-language,
   :dcterms/description
   #voc/lstr
    "The Content-Language header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Content-Language@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def content-length
  "The Content-Length header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/content-length,
   :dcterms/description
   #voc/lstr
    "The Content-Length header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Content-Length@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def content-location
  "The Content-Location header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/content-location,
   :dcterms/description
   #voc/lstr
    "The Content-Location header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Content-Location@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def content-md5
  "The Content-MD5 header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/content-md5,
   :dcterms/description
   #voc/lstr
    "The Content-MD5 header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Content-MD5@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def content-range
  "The Content-Range header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/content-range,
   :dcterms/description
   #voc/lstr
    "The Content-Range header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Content-Range@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def content-script-type
  "The Content-Script-Type header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/content-script-type,
   :dcterms/description
   #voc/lstr
    "The Content-Script-Type header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Content-Script-Type@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.w3.org/TR/1999/REC-html401-19991224/"]})

(def content-style-type
  "The Content-Style-Type header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/content-style-type,
   :dcterms/description
   #voc/lstr
    "The Content-Style-Type header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Content-Style-Type@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.w3.org/TR/1999/REC-html401-19991224/"]})

(def content-transfer-encoding
  "The Content-Transfer-Encoding header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/content-transfer-encoding,
   :dcterms/description
   #voc/lstr
    "The Content-Transfer-Encoding header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "Content-Transfer-Encoding@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.w3.org/Protocols/HTTP/Object_Headers.html"]})

(def content-type
  "The Content-Type header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/content-type,
   :dcterms/description
   #voc/lstr
    "The Content-Type header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Content-Type@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def content-version
  "The Content-Version header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/content-version,
   :dcterms/description
   #voc/lstr
    "The Content-Version header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Content-Version@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2068.txt"]})

(def cookie
  "The Cookie header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/cookie,
   :dcterms/description
   #voc/lstr
    "The Cookie header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Cookie@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2965.txt"]})

(def cookie2
  "The Cookie2 header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/cookie2,
   :dcterms/description
   #voc/lstr
    "The Cookie2 header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Cookie2@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2965.txt"]})

(def cost
  "The Cost header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/cost,
   :dcterms/description
   #voc/lstr
    "The Cost header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "Cost@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.w3.org/Protocols/HTTP/Object_Headers.html"]})

(def dasl
  "The DASL header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/dasl,
   :dcterms/description
   #voc/lstr
    "The DASL header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "DASL@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc5323.txt"]})

(def date
  "The Date header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/date,
   :dcterms/description
   #voc/lstr
    "The Date header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Date@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def dav
  "The DAV header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/dav,
   :dcterms/description
   #voc/lstr
    "The DAV header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "DAV@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2518.txt"]})

(def default-style
  "The Default-Style header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/default-style,
   :dcterms/description
   #voc/lstr
    "The Default-Style header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Default-Style@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.w3.org/TR/1999/REC-html401-19991224/"]})

(def delta-base
  "The Delta-Base header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/delta-base,
   :dcterms/description
   #voc/lstr
    "The Delta-Base header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Delta-Base@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc3229.txt"]})

(def depth
  "The Depth header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/depth,
   :dcterms/description
   #voc/lstr
    "The Depth header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Depth@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2518.txt"]})

(def derived-from
  "The Derived-From header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/derived-from,
   :dcterms/description
   #voc/lstr
    "The Derived-From header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Derived-From@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2068.txt"]})

(def destination
  "The Destination header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/destination,
   :dcterms/description
   #voc/lstr
    "The Destination header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Destination@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2518.txt"]})

(def differential-id
  "The Differential-ID header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/differential-id,
   :dcterms/description
   #voc/lstr
    "The Differential-ID header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Differential-ID@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.w3.org/TR/NOTE-drp-19970825"]})

(def digest
  "The Digest header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/digest,
   :dcterms/description
   #voc/lstr
    "The Digest header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Digest@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc3230.txt"]})

(def etag
  "The ETag header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/etag,
   :dcterms/description
   #voc/lstr
    "The ETag header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "ETag@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def expect
  "The Expect header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/expect,
   :dcterms/description
   #voc/lstr
    "The Expect header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Expect@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def expires
  "The Expires header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/expires,
   :dcterms/description
   #voc/lstr
    "The Expires header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Expires@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def ext
  "The Ext header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/ext,
   :dcterms/description
   #voc/lstr
    "The Ext header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Ext@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2774.txt"]})

(def from
  "The From header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/from,
   :dcterms/description
   #voc/lstr
    "The From header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "From@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def getprofile
  "The GetProfile header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/getprofile,
   :dcterms/description
   #voc/lstr
    "The GetProfile header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "GetProfile@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.w3.org/TR/NOTE-OPS-OverHTTP"]})

(def host
  "The Host header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/host,
   :dcterms/description
   #voc/lstr
    "The Host header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Host@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def if
  "The If header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/if,
   :dcterms/description
   #voc/lstr
    "The If header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "If@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2518.txt"]})

(def if-match
  "The If-Match header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/if-match,
   :dcterms/description
   #voc/lstr
    "The If-Match header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "If-Match@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def if-modified-since
  "The If-Modified-Since header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/if-modified-since,
   :dcterms/description
   #voc/lstr
    "The If-Modified-Since header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "If-Modified-Since@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def if-none-match
  "The If-None-Match header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/if-none-match,
   :dcterms/description
   #voc/lstr
    "The If-None-Match header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "If-None-Match@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def if-range
  "The If-Range header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/if-range,
   :dcterms/description
   #voc/lstr
    "The If-Range header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "If-Range@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def if-unmodified-since
  "The If-Unmodified-Since header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/if-unmodified-since,
   :dcterms/description
   #voc/lstr
    "The If-Unmodified-Since header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "If-Unmodified-Since@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def im
  "The IM header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/im,
   :dcterms/description
   #voc/lstr
    "The IM header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "IM@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc3229.txt"]})

(def keep-alive
  "The Keep-Alive header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/keep-alive,
   :dcterms/description
   #voc/lstr
    "The Keep-Alive header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Keep-Alive@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2068.txt"]})

(def label
  "The Label header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/label,
   :dcterms/description
   #voc/lstr
    "The Label header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Label@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc3253.txt"]})

(def last-modified
  "The Last-Modified header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/last-modified,
   :dcterms/description
   #voc/lstr
    "The Last-Modified header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Last-Modified@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def link
  "The Link header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/link,
   :dcterms/description
   #voc/lstr
    "The Link header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Link@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2068.txt"]})

(def location
  "The Location header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/location,
   :dcterms/description
   #voc/lstr
    "The Location header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Location@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def lock-token
  "The Lock-Token header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/lock-token,
   :dcterms/description
   #voc/lstr
    "The Lock-Token header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Lock-Token@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2518.txt"]})

(def man
  "The Man header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/man,
   :dcterms/description
   #voc/lstr
    "The Man header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Man@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2774.txt"]})

(def max-forwards
  "The Max-Forwards header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/max-forwards,
   :dcterms/description
   #voc/lstr
    "The Max-Forwards header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Max-Forwards@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def message-id
  "The Message-ID header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/message-id,
   :dcterms/description
   #voc/lstr
    "The Message-ID header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "Message-ID@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.w3.org/Protocols/HTTP/Object_Headers.html"]})

(def meter
  "The Meter header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/meter,
   :dcterms/description
   #voc/lstr
    "The Meter header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Meter@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2227.txt"]})

(def method-check
  "The Method-Check header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/method-check,
   :dcterms/description
   #voc/lstr
    "The Method-Check header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "Method-Check@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.w3.org/2006/appformats/"]})

(def method-check-expires
  "The Method-Check-Expires header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/method-check-expires,
   :dcterms/description
   #voc/lstr
    "The Method-Check-Expires header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "Method-Check-Expires@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.w3.org/2006/appformats/"]})

(def mime-version
  "The MIME-Version header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/mime-version,
   :dcterms/description
   #voc/lstr
    "The MIME-Version header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "MIME-Version@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def negotiate
  "The Negotiate header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/negotiate,
   :dcterms/description
   #voc/lstr
    "The Negotiate header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Negotiate@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2295.txt"]})

(def non-compliance
  "The Non-Compliance header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/non-compliance,
   :dcterms/description
   #voc/lstr
    "The Non-Compliance header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "Non-Compliance@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.w3.org/Protocols/HTTP/Object_Headers.html"]})

(def opt
  "The Opt header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/opt,
   :dcterms/description
   #voc/lstr
    "The Opt header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Opt@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2774.txt"]})

(def optional
  "The Optional header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/optional,
   :dcterms/description
   #voc/lstr
    "The Optional header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "Optional@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www3.ietf.org/proceedings/98dec/I-D/draft-girod-w3-id-res-ext-00.txt"]})

(def ordering-type
  "The Ordering-Type header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/ordering-type,
   :dcterms/description
   #voc/lstr
    "The Ordering-Type header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Ordering-Type@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc3648.txt"]})

(def origin
  "The Origin header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/origin,
   :dcterms/description
   #voc/lstr
    "The Origin header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "Origin@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.w3.org/2006/appformats/"]})

(def overwrite
  "The overwrite header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/overwrite,
   :dcterms/description
   #voc/lstr
    "The overwrite header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Overwrite@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2518.txt"]})

(def p3p
  "The P3P header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/p3p,
   :dcterms/description
   #voc/lstr
    "The P3P header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "P3P@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.w3.org/TR/2002/REC-P3P-20020416/"]})

(def pep
  "The PEP header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/pep,
   :dcterms/description
   #voc/lstr
    "The PEP header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "PEP@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.w3.org/TR/WD-http-pep"]})

(def pep-info
  "The Pep-Info header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/pep-info,
   :dcterms/description
   #voc/lstr
    "The Pep-Info header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Pep-Info@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.w3.org/TR/WD-http-pep"]})

(def pics-label
  "The PICS-Label header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/pics-label,
   :dcterms/description
   #voc/lstr
    "The PICS-Label header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "PICS-Label@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.w3.org/TR/REC-PICS-labels-961031"]})

(def position
  "The Position header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/position,
   :dcterms/description
   #voc/lstr
    "The Position header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Position@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc3648.txt"]})

(def pragma
  "The Pragma header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/pragma,
   :dcterms/description
   #voc/lstr
    "The Pragma header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Pragma@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def profileobject
  "The ProfileObject header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/profileobject,
   :dcterms/description
   #voc/lstr
    "The ProfileObject header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "ProfileObject@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.w3.org/TR/NOTE-OPS-OverHTTP"]})

(def protocol
  "The Protocol header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/protocol,
   :dcterms/description
   #voc/lstr
    "The Protocol header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Protocol@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.w3.org/TR/REC-PICS-labels-961031"]})

(def protocol-info
  "The Protocol-Info header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/protocol-info,
   :dcterms/description
   #voc/lstr
    "The Protocol-Info header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Protocol-Info@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.w3.org/TR/NOTE-jepi-970519"]})

(def protocol-query
  "The Protocol-Query header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/protocol-query,
   :dcterms/description
   #voc/lstr
    "The Protocol-Query header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Protocol-Query@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.w3.org/TR/NOTE-jepi-970519"]})

(def protocol-request
  "The Protocol-Request header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/protocol-request,
   :dcterms/description
   #voc/lstr
    "The Protocol-Request header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Protocol-Request@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.w3.org/TR/REC-PICS-labels-961031"]})

(def proxy-authenticate
  "The Proxy-Authenticate header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/proxy-authenticate,
   :dcterms/description
   #voc/lstr
    "The Proxy-Authenticate header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Proxy-Authenticate@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def proxy-authentication-info
  "The Proxy-Authentication-Info header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/proxy-authentication-info,
   :dcterms/description
   #voc/lstr
    "The Proxy-Authentication-Info header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Proxy-Authentication-Info@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2617.txt"]})

(def proxy-authorization
  "The Proxy-Authorization header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/proxy-authorization,
   :dcterms/description
   #voc/lstr
    "The Proxy-Authorization header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Proxy-Authorization@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def proxy-features
  "The Proxy-Features header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/proxy-features,
   :dcterms/description
   #voc/lstr
    "The Proxy-Features header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Proxy-Features@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.w3.org/TR/WD-proxy-960221"]})

(def proxy-instruction
  "The Proxy-Instruction header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/proxy-instruction,
   :dcterms/description
   #voc/lstr
    "The Proxy-Instruction header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Proxy-Instruction@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.w3.org/TR/WD-proxy-960221"]})

(def public
  "The Public header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/public,
   :dcterms/description
   #voc/lstr
    "The Public header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Public@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2068.txt"]})

(def range
  "The Range header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/range,
   :dcterms/description
   #voc/lstr
    "The Range header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Range@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def redirect-ref
  "The Redirect-Ref header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/redirect-ref,
   :dcterms/description
   #voc/lstr
    "The Redirect-Ref header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Redirect-Ref@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc4437.txt"]})

(def referer
  "The Referer header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/referer,
   :dcterms/description
   #voc/lstr
    "The Referer header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Referer@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def referer-root
  "The Referer-Root header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/referer-root,
   :dcterms/description
   #voc/lstr
    "The Referer-Root header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "Referer-Root@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.w3.org/2006/appformats/"]})

(def resolution-hint
  "The Resolution-Hint header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/resolution-hint,
   :dcterms/description
   #voc/lstr
    "The Resolution-Hint header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "Resolution-Hint@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www3.ietf.org/proceedings/98dec/I-D/draft-girod-w3-id-res-ext-00.txt"]})

(def resolver-location
  "The Resolver-Location header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/resolver-location,
   :dcterms/description
   #voc/lstr
    "The Resolver-Location header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "Resolver-Location@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www3.ietf.org/proceedings/98dec/I-D/draft-girod-w3-id-res-ext-00.txt"]})

(def retry-after
  "The Retry-After header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/retry-after,
   :dcterms/description
   #voc/lstr
    "The Retry-After header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Retry-After@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def safe
  "The Safe header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/safe,
   :dcterms/description
   #voc/lstr
    "The Safe header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Safe@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2310.txt"]})

(def security-scheme
  "The Security-Scheme header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/security-scheme,
   :dcterms/description
   #voc/lstr
    "The Security-Scheme header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Security-Scheme@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2660.txt"]})

(def server
  "The Server header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/server,
   :dcterms/description
   #voc/lstr
    "The Server header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Server@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def set-cookie
  "The Set-Cookie header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/set-cookie,
   :dcterms/description
   #voc/lstr
    "The Set-Cookie header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Set-Cookie@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2109.txt"]})

(def set-cookie2
  "The Set-Cookie2 header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/set-cookie2,
   :dcterms/description
   #voc/lstr
    "The Set-Cookie2 header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Set-Cookie2@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2965.txt"]})

(def setprofile
  "The SetProfile header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/setprofile,
   :dcterms/description
   #voc/lstr
    "The SetProfile header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "SetProfile@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.w3.org/TR/NOTE-OPS-OverHTTP"]})

(def slug
  "The SLUG header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/slug,
   :dcterms/description
   #voc/lstr
    "The SLUG header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "SLUG@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://tools.ietf.org/html/draft-ietf-atompub-protocol-17"]})

(def soapaction
  "The SoapAction header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/soapaction,
   :dcterms/description
   #voc/lstr
    "The SoapAction header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "SoapAction@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.w3.org/TR/2000/NOTE-SOAP-20000508/"]})

(def status-uri
  "The Status-URI header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/status-uri,
   :dcterms/description
   #voc/lstr
    "The Status-URI header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Status-URI@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2518.txt"]})

(def subok
  "The SubOK header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/subok,
   :dcterms/description
   #voc/lstr
    "The SubOK header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "SubOK@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www3.ietf.org/proceedings/98dec/I-D/draft-mogul-http-dupsup-00.txt"]})

(def subst
  "The Subst header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/subst,
   :dcterms/description
   #voc/lstr
    "The Subst header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "Subst@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www3.ietf.org/proceedings/98dec/I-D/draft-mogul-http-dupsup-00.txt"]})

(def surrogate-capability
  "The Surrogate-Capability header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/surrogate-capability,
   :dcterms/description
   #voc/lstr
    "The Surrogate-Capability header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Surrogate-Capability@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.w3.org/TR/2001/NOTE-edge-arch-20010804"]})

(def surrogate-control
  "The Surrogate-Control header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/surrogate-control,
   :dcterms/description
   #voc/lstr
    "The Surrogate-Control header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Surrogate-Control@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.w3.org/TR/2001/NOTE-edge-arch-20010804"]})

(def tcn
  "The TCN header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/tcn,
   :dcterms/description
   #voc/lstr
    "The TCN header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "TCN@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2295.txt"]})

(def te
  "The TE header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/te,
   :dcterms/description
   #voc/lstr
    "The TE header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "TE@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def timeout
  "The Timeout header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/timeout,
   :dcterms/description
   #voc/lstr
    "The Timeout header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Timeout@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2518.txt"]})

(def title
  "The Title header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/title,
   :dcterms/description
   #voc/lstr
    "The Title header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "Title@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.w3.org/Protocols/HTTP/Object_Headers.html"]})

(def trailer
  "The Trailer header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/trailer,
   :dcterms/description
   #voc/lstr
    "The Trailer header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Trailer@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def transfer-encoding
  "The Transfer-Encoding header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/transfer-encoding,
   :dcterms/description
   #voc/lstr
    "The Transfer-Encoding header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Transfer-Encoding@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def ua-color
  "The UA-Color header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/ua-color,
   :dcterms/description
   #voc/lstr
    "The UA-Color header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "UA-Color@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.watersprings.org/pub/id/draft-mutz-http-attributes-00.txt"]})

(def ua-media
  "The UA-Media header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/ua-media,
   :dcterms/description
   #voc/lstr
    "The UA-Media header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "UA-Media@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.watersprings.org/pub/id/draft-mutz-http-attributes-00.txt"]})

(def ua-pixels
  "The UA-Pixels header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/ua-pixels,
   :dcterms/description
   #voc/lstr
    "The UA-Pixels header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "UA-Pixels@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.watersprings.org/pub/id/draft-mutz-http-attributes-00.txt"]})

(def ua-resolution
  "The UA-Resolution header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/ua-resolution,
   :dcterms/description
   #voc/lstr
    "The UA-Resolution header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "UA-Resolution@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.watersprings.org/pub/id/draft-mutz-http-attributes-00.txt"]})

(def ua-windowpixels
  "The header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/ua-windowpixels,
   :dcterms/description
   #voc/lstr
    "The  header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.watersprings.org/pub/id/draft-mutz-http-attributes-00.txt"]})

(def upgrade
  "The Upgrade header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/upgrade,
   :dcterms/description
   #voc/lstr
    "The Upgrade header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Upgrade@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def uri
  "The URI header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/uri,
   :dcterms/description
   #voc/lstr
    "The URI header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "URI@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2068.txt"]})

(def user-agent
  "The User-Agent header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/user-agent,
   :dcterms/description
   #voc/lstr
    "The User-Agent header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "User-Agent@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def variant-vary
  "The Variant-Vary header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/variant-vary,
   :dcterms/description
   #voc/lstr
    "The Variant-Vary header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Variant-Vary@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2295.txt"]})

(def vary
  "The Vary header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/vary,
   :dcterms/description
   #voc/lstr
    "The Vary header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Vary@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def version
  "The Version header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/version,
   :dcterms/description
   #voc/lstr
    "The Version header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "Version@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.w3.org/Protocols/HTTP/Object_Headers.html"]})

(def via
  "The Via header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/via,
   :dcterms/description
   #voc/lstr
    "The Via header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Via@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def want-digest
  "The Want-Digest header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/want-digest,
   :dcterms/description
   #voc/lstr
    "The Want-Digest header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Want-Digest@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc3230.txt"]})

(def warning
  "The Warning header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/warning,
   :dcterms/description
   #voc/lstr
    "The Warning header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "Warning@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def www-authenticate
  "The WWW-Authenticate header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/www-authenticate,
   :dcterms/description
   #voc/lstr
    "The WWW-Authenticate header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #voc/lstr "WWW-Authenticate@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/perm-headers.html"
    "http://www.ietf.org/rfc/rfc2616.txt"]})

(def x-device-accept
  "The X-Device-Accept header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/x-device-accept,
   :dcterms/description
   #voc/lstr
    "The X-Device-Accept header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "X-Device-Accept@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.w3.org/2005/MWI/BPWG/"]})

(def x-device-accept-charset
  "The X-Device-Accept-Charset header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/x-device-accept-charset,
   :dcterms/description
   #voc/lstr
    "The X-Device-Accept-Charset header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "X-Device-Accept-Charset@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.w3.org/2005/MWI/BPWG/"]})

(def x-device-accept-encoding
  "The X-Device-Accept-Encoding header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/x-device-accept-encoding,
   :dcterms/description
   #voc/lstr
    "The X-Device-Accept-Encoding header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "X-Device-Accept-Encoding@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.w3.org/2005/MWI/BPWG/"]})

(def x-device-accept-language
  "The X-Device-Accept-Language header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/x-device-accept-language,
   :dcterms/description
   #voc/lstr
    "The X-Device-Accept-Language header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "X-Device-Accept-Language@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.w3.org/2005/MWI/BPWG/"]})

(def x-device-user-agent
  "The X-Device-User-Agent header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/x-device-user-agent,
   :dcterms/description
   #voc/lstr
    "The X-Device-User-Agent header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #voc/lstr "X-Device-User-Agent@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   ["http://www.iana.org/assignments/message-headers/prov-headers.html"
    "http://www.w3.org/2005/MWI/BPWG/"]})