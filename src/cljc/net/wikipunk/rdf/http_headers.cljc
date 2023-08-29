(ns net.wikipunk.rdf.http-headers
  {:dcat/downloadURL  "resources/http-headers.rdf",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "http" "http://www.w3.org/2011/http#",
                       "http-headers" "http://www.w3.org/2011/http-headers#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "http-headers",
   :rdfa/uri          "http://www.w3.org/2011/http-headers#"}
  (:refer-clojure :exclude [range]))

(def a-im
  "The A-IM header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/a-im,
   :dcterms/description
   #rdf/langString
    "The A-IM header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "A-IM@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc3229.txt"}]})

(def accept
  "The Accept header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/accept,
   :dcterms/description
   #rdf/langString
    "The Accept header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Accept@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def accept-additions
  "The Accept-Additions header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/accept-additions,
   :dcterms/description
   #rdf/langString
    "The Accept-Additions header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Accept-Additions@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2324.txt"}]})

(def accept-charset
  "The Accept-Charset header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/accept-charset,
   :dcterms/description
   #rdf/langString
    "The Accept-Charset header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Accept-Charset@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def accept-encoding
  "The Accept-Encoding header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/accept-encoding,
   :dcterms/description
   #rdf/langString
    "The Accept-Encoding header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Accept-Encoding@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def accept-features
  "The Accept-Features header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/accept-features,
   :dcterms/description
   #rdf/langString
    "The Accept-Features header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Accept-Features@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2295.txt"}]})

(def accept-language
  "The Accept-Language header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/accept-language,
   :dcterms/description
   #rdf/langString
    "The Accept-Language header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Accept-Language@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def accept-ranges
  "The Accept-Ranges header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/accept-ranges,
   :dcterms/description
   #rdf/langString
    "The Accept-Ranges header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Accept-Ranges@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def access-control
  "The Access-Control header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/access-control,
   :dcterms/description
   #rdf/langString
    "The Access-Control header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "Access-Control@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri "http://www.w3.org/2006/appformats/"}]})

(def access-control-allow-credentials
  "The Access-Control-Allow-Credentials header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/access-control-allow-credentials,
   :dcterms/description
   #rdf/langString
    "The Access-Control-Allow-Credentials header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "Access-Control-Allow-Credentials@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri "http://www.w3.org/2006/appformats/"}]})

(def access-control-allow-headers
  "The Access-Control-Allow-Headers header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/access-control-allow-headers,
   :dcterms/description
   #rdf/langString
    "The Access-Control-Allow-Headers header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "Access-Control-Allow-Headers@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri "http://www.w3.org/2006/appformats/"}]})

(def access-control-allow-methods
  "The Access-Control-Allow-Methods header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/access-control-allow-methods,
   :dcterms/description
   #rdf/langString
    "The Access-Control-Allow-Methods header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "Access-Control-Allow-Methods@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri "http://www.w3.org/2006/appformats/"}]})

(def access-control-allow-origin
  "The Access-Control-Allow-Origin header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/access-control-allow-origin,
   :dcterms/description
   #rdf/langString
    "The Access-Control-Allow-Origin header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "Access-Control-Allow-Origin@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri "http://www.w3.org/2006/appformats/"}]})

(def access-control-max-age
  "The Access-Control-Max-Age header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/access-control-max-age,
   :dcterms/description
   #rdf/langString
    "The Access-Control-Max-Age header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "Access-Control-Max-Age@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri "http://www.w3.org/2006/appformats/"}]})

(def access-control-request-headers
  "The Access-Control-Request-Headers header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/access-control-request-headers,
   :dcterms/description
   #rdf/langString
    "The Access-Control-Request-Headers header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "Access-Control-Request-Headers@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri "http://www.w3.org/2006/appformats/"}]})

(def access-control-request-method
  "The Access-Control-Request-Method header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/access-control-request-method,
   :dcterms/description
   #rdf/langString
    "The Access-Control-Request-Method header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "Access-Control-Request-Method@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri "http://www.w3.org/2006/appformats/"}]})

(def age
  "The Age header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/age,
   :dcterms/description
   #rdf/langString
    "The Age header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Age@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def allow
  "The Allow header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/allow,
   :dcterms/description
   #rdf/langString
    "The Allow header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Allow@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def alternates
  "The alternates header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/alternates,
   :dcterms/description
   #rdf/langString
    "The alternates header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Alternates@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2295.txt"}]})

(def apply-to-redirect-ref
  "The Apply-To-Redirect-Ref header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/apply-to-redirect-ref,
   :dcterms/description
   #rdf/langString
    "The Apply-To-Redirect-Ref header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Apply-To-Redirect-Ref@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc4437.txt"}]})

(def authentication-info
  "The Authentication-Info header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/authentication-info,
   :dcterms/description
   #rdf/langString
    "The Authentication-Info header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Authentication-Info@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2617.txt"}]})

(def authorization
  "The Authorization header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/authorization,
   :dcterms/description
   #rdf/langString
    "The Authorization header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Authorization@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def c-ext
  "The C-Ext header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/c-ext,
   :dcterms/description
   #rdf/langString
    "The C-Ext header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "C-Ext@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2774.txt"}]})

(def c-man
  "The C-Man header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/c-man,
   :dcterms/description
   #rdf/langString
    "The C-Man header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "C-Man@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2774.txt"}]})

(def c-opt
  "The C-Opt header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/c-opt,
   :dcterms/description
   #rdf/langString
    "The C-Opt header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "C-Opt@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2774.txt"}]})

(def c-pep
  "The C-PEP header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/c-pep,
   :dcterms/description
   #rdf/langString
    "The C-PEP header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "C-PEP@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.w3.org/TR/WD-http-pep"}]})

(def c-pep-info
  "The C-PEP-Info header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/c-pep-info,
   :dcterms/description
   #rdf/langString
    "The C-PEP-Info header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "C-PEP-Info@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.w3.org/TR/WD-http-pep"}]})

(def cache-control
  "The Cache-Control header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/cache-control,
   :dcterms/description
   #rdf/langString
    "The Cache-Control header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Cache-Control@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def compliance
  "The Compliance header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/compliance,
   :dcterms/description
   #rdf/langString
    "The Compliance header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "Compliance@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri
     "http://www.watersprings.org/pub/id/draft-ietf-http-options-02.txt"}]})

(def connection
  "The Connection header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/connection,
   :dcterms/description
   #rdf/langString
    "The Connection header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Connection@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def content-base
  "The Content-Base header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/content-base,
   :dcterms/description
   #rdf/langString
    "The Content-Base header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Content-Base@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2068.txt"}]})

(def content-disposition
  "The Content-Disposition header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/content-disposition,
   :dcterms/description
   #rdf/langString
    "The Content-Disposition header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Content-Disposition@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def content-encoding
  "The Content-Encoding header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/content-encoding,
   :dcterms/description
   #rdf/langString
    "The Content-Encoding header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Content-Encoding@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def content-id
  "The Content-ID header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/content-id,
   :dcterms/description
   #rdf/langString
    "The Content-ID header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Content-ID@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.w3.org/TR/NOTE-drp-19970825"}]})

(def content-language
  "The Content-Language header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/content-language,
   :dcterms/description
   #rdf/langString
    "The Content-Language header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Content-Language@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def content-length
  "The Content-Length header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/content-length,
   :dcterms/description
   #rdf/langString
    "The Content-Length header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Content-Length@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def content-location
  "The Content-Location header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/content-location,
   :dcterms/description
   #rdf/langString
    "The Content-Location header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Content-Location@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def content-md5
  "The Content-MD5 header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/content-md5,
   :dcterms/description
   #rdf/langString
    "The Content-MD5 header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Content-MD5@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def content-range
  "The Content-Range header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/content-range,
   :dcterms/description
   #rdf/langString
    "The Content-Range header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Content-Range@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def content-script-type
  "The Content-Script-Type header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/content-script-type,
   :dcterms/description
   #rdf/langString
    "The Content-Script-Type header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Content-Script-Type@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.w3.org/TR/1999/REC-html401-19991224/"}]})

(def content-style-type
  "The Content-Style-Type header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/content-style-type,
   :dcterms/description
   #rdf/langString
    "The Content-Style-Type header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Content-Style-Type@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.w3.org/TR/1999/REC-html401-19991224/"}]})

(def content-transfer-encoding
  "The Content-Transfer-Encoding header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/content-transfer-encoding,
   :dcterms/description
   #rdf/langString
    "The Content-Transfer-Encoding header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "Content-Transfer-Encoding@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri "http://www.w3.org/Protocols/HTTP/Object_Headers.html"}]})

(def content-type
  "The Content-Type header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/content-type,
   :dcterms/description
   #rdf/langString
    "The Content-Type header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Content-Type@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def content-version
  "The Content-Version header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/content-version,
   :dcterms/description
   #rdf/langString
    "The Content-Version header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Content-Version@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2068.txt"}]})

(def cookie
  "The Cookie header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/cookie,
   :dcterms/description
   #rdf/langString
    "The Cookie header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Cookie@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2965.txt"}]})

(def cookie2
  "The Cookie2 header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/cookie2,
   :dcterms/description
   #rdf/langString
    "The Cookie2 header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Cookie2@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2965.txt"}]})

(def cost
  "The Cost header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/cost,
   :dcterms/description
   #rdf/langString
    "The Cost header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "Cost@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri "http://www.w3.org/Protocols/HTTP/Object_Headers.html"}]})

(def dasl
  "The DASL header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/dasl,
   :dcterms/description
   #rdf/langString
    "The DASL header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "DASL@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc5323.txt"}]})

(def date
  "The Date header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/date,
   :dcterms/description
   #rdf/langString
    "The Date header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Date@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def dav
  "The DAV header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/dav,
   :dcterms/description
   #rdf/langString
    "The DAV header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "DAV@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2518.txt"}]})

(def default-style
  "The Default-Style header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/default-style,
   :dcterms/description
   #rdf/langString
    "The Default-Style header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Default-Style@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.w3.org/TR/1999/REC-html401-19991224/"}]})

(def delta-base
  "The Delta-Base header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/delta-base,
   :dcterms/description
   #rdf/langString
    "The Delta-Base header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Delta-Base@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc3229.txt"}]})

(def depth
  "The Depth header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/depth,
   :dcterms/description
   #rdf/langString
    "The Depth header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Depth@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2518.txt"}]})

(def derived-from
  "The Derived-From header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/derived-from,
   :dcterms/description
   #rdf/langString
    "The Derived-From header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Derived-From@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2068.txt"}]})

(def destination
  "The Destination header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/destination,
   :dcterms/description
   #rdf/langString
    "The Destination header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Destination@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2518.txt"}]})

(def differential-id
  "The Differential-ID header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/differential-id,
   :dcterms/description
   #rdf/langString
    "The Differential-ID header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Differential-ID@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.w3.org/TR/NOTE-drp-19970825"}]})

(def digest
  "The Digest header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/digest,
   :dcterms/description
   #rdf/langString
    "The Digest header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Digest@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc3230.txt"}]})

(def etag
  "The ETag header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/etag,
   :dcterms/description
   #rdf/langString
    "The ETag header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "ETag@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def expect
  "The Expect header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/expect,
   :dcterms/description
   #rdf/langString
    "The Expect header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Expect@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def expires
  "The Expires header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/expires,
   :dcterms/description
   #rdf/langString
    "The Expires header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Expires@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def ext
  "The Ext header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/ext,
   :dcterms/description
   #rdf/langString
    "The Ext header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Ext@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2774.txt"}]})

(def from
  "The From header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/from,
   :dcterms/description
   #rdf/langString
    "The From header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "From@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def getprofile
  "The GetProfile header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/getprofile,
   :dcterms/description
   #rdf/langString
    "The GetProfile header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "GetProfile@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.w3.org/TR/NOTE-OPS-OverHTTP"}]})

(def host
  "The Host header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/host,
   :dcterms/description
   #rdf/langString
    "The Host header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Host@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def if
  "The If header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/if,
   :dcterms/description
   #rdf/langString
    "The If header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "If@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2518.txt"}]})

(def if-match
  "The If-Match header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/if-match,
   :dcterms/description
   #rdf/langString
    "The If-Match header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "If-Match@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def if-modified-since
  "The If-Modified-Since header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/if-modified-since,
   :dcterms/description
   #rdf/langString
    "The If-Modified-Since header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "If-Modified-Since@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def if-none-match
  "The If-None-Match header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/if-none-match,
   :dcterms/description
   #rdf/langString
    "The If-None-Match header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "If-None-Match@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def if-range
  "The If-Range header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/if-range,
   :dcterms/description
   #rdf/langString
    "The If-Range header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "If-Range@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def if-unmodified-since
  "The If-Unmodified-Since header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/if-unmodified-since,
   :dcterms/description
   #rdf/langString
    "The If-Unmodified-Since header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "If-Unmodified-Since@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def im
  "The IM header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/im,
   :dcterms/description
   #rdf/langString
    "The IM header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "IM@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc3229.txt"}]})

(def keep-alive
  "The Keep-Alive header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/keep-alive,
   :dcterms/description
   #rdf/langString
    "The Keep-Alive header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Keep-Alive@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2068.txt"}]})

(def label
  "The Label header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/label,
   :dcterms/description
   #rdf/langString
    "The Label header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Label@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc3253.txt"}]})

(def last-modified
  "The Last-Modified header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/last-modified,
   :dcterms/description
   #rdf/langString
    "The Last-Modified header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Last-Modified@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def link
  "The Link header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/link,
   :dcterms/description
   #rdf/langString
    "The Link header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Link@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2068.txt"}]})

(def location
  "The Location header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/location,
   :dcterms/description
   #rdf/langString
    "The Location header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Location@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def lock-token
  "The Lock-Token header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/lock-token,
   :dcterms/description
   #rdf/langString
    "The Lock-Token header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Lock-Token@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2518.txt"}]})

(def man
  "The Man header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/man,
   :dcterms/description
   #rdf/langString
    "The Man header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Man@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2774.txt"}]})

(def max-forwards
  "The Max-Forwards header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/max-forwards,
   :dcterms/description
   #rdf/langString
    "The Max-Forwards header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Max-Forwards@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def message-id
  "The Message-ID header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/message-id,
   :dcterms/description
   #rdf/langString
    "The Message-ID header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "Message-ID@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri "http://www.w3.org/Protocols/HTTP/Object_Headers.html"}]})

(def meter
  "The Meter header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/meter,
   :dcterms/description
   #rdf/langString
    "The Meter header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Meter@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2227.txt"}]})

(def method-check
  "The Method-Check header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/method-check,
   :dcterms/description
   #rdf/langString
    "The Method-Check header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "Method-Check@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri "http://www.w3.org/2006/appformats/"}]})

(def method-check-expires
  "The Method-Check-Expires header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/method-check-expires,
   :dcterms/description
   #rdf/langString
    "The Method-Check-Expires header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "Method-Check-Expires@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri "http://www.w3.org/2006/appformats/"}]})

(def mime-version
  "The MIME-Version header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/mime-version,
   :dcterms/description
   #rdf/langString
    "The MIME-Version header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "MIME-Version@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def negotiate
  "The Negotiate header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/negotiate,
   :dcterms/description
   #rdf/langString
    "The Negotiate header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Negotiate@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2295.txt"}]})

(def non-compliance
  "The Non-Compliance header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/non-compliance,
   :dcterms/description
   #rdf/langString
    "The Non-Compliance header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "Non-Compliance@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri "http://www.w3.org/Protocols/HTTP/Object_Headers.html"}]})

(def opt
  "The Opt header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/opt,
   :dcterms/description
   #rdf/langString
    "The Opt header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Opt@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2774.txt"}]})

(def optional
  "The Optional header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/optional,
   :dcterms/description
   #rdf/langString
    "The Optional header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "Optional@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri
     "http://www3.ietf.org/proceedings/98dec/I-D/draft-girod-w3-id-res-ext-00.txt"}]})

(def ordering-type
  "The Ordering-Type header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/ordering-type,
   :dcterms/description
   #rdf/langString
    "The Ordering-Type header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Ordering-Type@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc3648.txt"}]})

(def origin
  "The Origin header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/origin,
   :dcterms/description
   #rdf/langString
    "The Origin header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "Origin@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri "http://www.w3.org/2006/appformats/"}]})

(def overwrite
  "The overwrite header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/overwrite,
   :dcterms/description
   #rdf/langString
    "The overwrite header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Overwrite@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2518.txt"}]})

(def p3p
  "The P3P header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/p3p,
   :dcterms/description
   #rdf/langString
    "The P3P header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "P3P@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.w3.org/TR/2002/REC-P3P-20020416/"}]})

(def pep
  "The PEP header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/pep,
   :dcterms/description
   #rdf/langString
    "The PEP header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "PEP@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.w3.org/TR/WD-http-pep"}]})

(def pep-info
  "The Pep-Info header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/pep-info,
   :dcterms/description
   #rdf/langString
    "The Pep-Info header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Pep-Info@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.w3.org/TR/WD-http-pep"}]})

(def pics-label
  "The PICS-Label header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/pics-label,
   :dcterms/description
   #rdf/langString
    "The PICS-Label header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "PICS-Label@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.w3.org/TR/REC-PICS-labels-961031"}]})

(def position
  "The Position header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/position,
   :dcterms/description
   #rdf/langString
    "The Position header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Position@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc3648.txt"}]})

(def pragma
  "The Pragma header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/pragma,
   :dcterms/description
   #rdf/langString
    "The Pragma header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Pragma@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def profileobject
  "The ProfileObject header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/profileobject,
   :dcterms/description
   #rdf/langString
    "The ProfileObject header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "ProfileObject@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.w3.org/TR/NOTE-OPS-OverHTTP"}]})

(def protocol
  "The Protocol header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/protocol,
   :dcterms/description
   #rdf/langString
    "The Protocol header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Protocol@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.w3.org/TR/REC-PICS-labels-961031"}]})

(def protocol-info
  "The Protocol-Info header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/protocol-info,
   :dcterms/description
   #rdf/langString
    "The Protocol-Info header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Protocol-Info@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.w3.org/TR/NOTE-jepi-970519"}]})

(def protocol-query
  "The Protocol-Query header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/protocol-query,
   :dcterms/description
   #rdf/langString
    "The Protocol-Query header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Protocol-Query@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.w3.org/TR/NOTE-jepi-970519"}]})

(def protocol-request
  "The Protocol-Request header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/protocol-request,
   :dcterms/description
   #rdf/langString
    "The Protocol-Request header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Protocol-Request@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.w3.org/TR/REC-PICS-labels-961031"}]})

(def proxy-authenticate
  "The Proxy-Authenticate header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/proxy-authenticate,
   :dcterms/description
   #rdf/langString
    "The Proxy-Authenticate header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Proxy-Authenticate@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def proxy-authentication-info
  "The Proxy-Authentication-Info header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/proxy-authentication-info,
   :dcterms/description
   #rdf/langString
    "The Proxy-Authentication-Info header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Proxy-Authentication-Info@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2617.txt"}]})

(def proxy-authorization
  "The Proxy-Authorization header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/proxy-authorization,
   :dcterms/description
   #rdf/langString
    "The Proxy-Authorization header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Proxy-Authorization@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def proxy-features
  "The Proxy-Features header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/proxy-features,
   :dcterms/description
   #rdf/langString
    "The Proxy-Features header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Proxy-Features@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.w3.org/TR/WD-proxy-960221"}]})

(def proxy-instruction
  "The Proxy-Instruction header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/proxy-instruction,
   :dcterms/description
   #rdf/langString
    "The Proxy-Instruction header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Proxy-Instruction@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.w3.org/TR/WD-proxy-960221"}]})

(def public
  "The Public header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/public,
   :dcterms/description
   #rdf/langString
    "The Public header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Public@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2068.txt"}]})

(def range
  "The Range header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/range,
   :dcterms/description
   #rdf/langString
    "The Range header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Range@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def redirect-ref
  "The Redirect-Ref header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/redirect-ref,
   :dcterms/description
   #rdf/langString
    "The Redirect-Ref header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Redirect-Ref@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc4437.txt"}]})

(def referer
  "The Referer header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/referer,
   :dcterms/description
   #rdf/langString
    "The Referer header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Referer@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def referer-root
  "The Referer-Root header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/referer-root,
   :dcterms/description
   #rdf/langString
    "The Referer-Root header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "Referer-Root@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri "http://www.w3.org/2006/appformats/"}]})

(def resolution-hint
  "The Resolution-Hint header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/resolution-hint,
   :dcterms/description
   #rdf/langString
    "The Resolution-Hint header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "Resolution-Hint@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri
     "http://www3.ietf.org/proceedings/98dec/I-D/draft-girod-w3-id-res-ext-00.txt"}]})

(def resolver-location
  "The Resolver-Location header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/resolver-location,
   :dcterms/description
   #rdf/langString
    "The Resolver-Location header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "Resolver-Location@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri
     "http://www3.ietf.org/proceedings/98dec/I-D/draft-girod-w3-id-res-ext-00.txt"}]})

(def retry-after
  "The Retry-After header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/retry-after,
   :dcterms/description
   #rdf/langString
    "The Retry-After header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Retry-After@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def safe
  "The Safe header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/safe,
   :dcterms/description
   #rdf/langString
    "The Safe header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Safe@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2310.txt"}]})

(def security-scheme
  "The Security-Scheme header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/security-scheme,
   :dcterms/description
   #rdf/langString
    "The Security-Scheme header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Security-Scheme@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2660.txt"}]})

(def server
  "The Server header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/server,
   :dcterms/description
   #rdf/langString
    "The Server header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Server@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def set-cookie
  "The Set-Cookie header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/set-cookie,
   :dcterms/description
   #rdf/langString
    "The Set-Cookie header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Set-Cookie@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2109.txt"}]})

(def set-cookie2
  "The Set-Cookie2 header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/set-cookie2,
   :dcterms/description
   #rdf/langString
    "The Set-Cookie2 header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Set-Cookie2@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2965.txt"}]})

(def setprofile
  "The SetProfile header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/setprofile,
   :dcterms/description
   #rdf/langString
    "The SetProfile header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "SetProfile@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.w3.org/TR/NOTE-OPS-OverHTTP"}]})

(def slug
  "The SLUG header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/slug,
   :dcterms/description
   #rdf/langString
    "The SLUG header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "SLUG@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://tools.ietf.org/html/draft-ietf-atompub-protocol-17"}]})

(def soapaction
  "The SoapAction header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/soapaction,
   :dcterms/description
   #rdf/langString
    "The SoapAction header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "SoapAction@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.w3.org/TR/2000/NOTE-SOAP-20000508/"}]})

(def status-uri
  "The Status-URI header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/status-uri,
   :dcterms/description
   #rdf/langString
    "The Status-URI header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Status-URI@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2518.txt"}]})

(def subok
  "The SubOK header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/subok,
   :dcterms/description
   #rdf/langString
    "The SubOK header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "SubOK@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri
     "http://www3.ietf.org/proceedings/98dec/I-D/draft-mogul-http-dupsup-00.txt"}]})

(def subst
  "The Subst header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/subst,
   :dcterms/description
   #rdf/langString
    "The Subst header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "Subst@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri
     "http://www3.ietf.org/proceedings/98dec/I-D/draft-mogul-http-dupsup-00.txt"}]})

(def surrogate-capability
  "The Surrogate-Capability header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/surrogate-capability,
   :dcterms/description
   #rdf/langString
    "The Surrogate-Capability header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Surrogate-Capability@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.w3.org/TR/2001/NOTE-edge-arch-20010804"}]})

(def surrogate-control
  "The Surrogate-Control header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/surrogate-control,
   :dcterms/description
   #rdf/langString
    "The Surrogate-Control header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Surrogate-Control@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.w3.org/TR/2001/NOTE-edge-arch-20010804"}]})

(def tcn
  "The TCN header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/tcn,
   :dcterms/description
   #rdf/langString
    "The TCN header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "TCN@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2295.txt"}]})

(def te
  "The TE header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/te,
   :dcterms/description
   #rdf/langString
    "The TE header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "TE@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def timeout
  "The Timeout header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/timeout,
   :dcterms/description
   #rdf/langString
    "The Timeout header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Timeout@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2518.txt"}]})

(def title
  "The Title header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/title,
   :dcterms/description
   #rdf/langString
    "The Title header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "Title@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri "http://www.w3.org/Protocols/HTTP/Object_Headers.html"}]})

(def trailer
  "The Trailer header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/trailer,
   :dcterms/description
   #rdf/langString
    "The Trailer header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Trailer@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def transfer-encoding
  "The Transfer-Encoding header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/transfer-encoding,
   :dcterms/description
   #rdf/langString
    "The Transfer-Encoding header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Transfer-Encoding@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def ua-color
  "The UA-Color header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/ua-color,
   :dcterms/description
   #rdf/langString
    "The UA-Color header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "UA-Color@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri
     "http://www.watersprings.org/pub/id/draft-mutz-http-attributes-00.txt"}]})

(def ua-media
  "The UA-Media header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/ua-media,
   :dcterms/description
   #rdf/langString
    "The UA-Media header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "UA-Media@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri
     "http://www.watersprings.org/pub/id/draft-mutz-http-attributes-00.txt"}]})

(def ua-pixels
  "The UA-Pixels header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/ua-pixels,
   :dcterms/description
   #rdf/langString
    "The UA-Pixels header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "UA-Pixels@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri
     "http://www.watersprings.org/pub/id/draft-mutz-http-attributes-00.txt"}]})

(def ua-resolution
  "The UA-Resolution header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/ua-resolution,
   :dcterms/description
   #rdf/langString
    "The UA-Resolution header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "UA-Resolution@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri
     "http://www.watersprings.org/pub/id/draft-mutz-http-attributes-00.txt"}]})

(def ua-windowpixels
  "The  header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/ua-windowpixels,
   :dcterms/description
   #rdf/langString
    "The  header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri
     "http://www.watersprings.org/pub/id/draft-mutz-http-attributes-00.txt"}]})

(def upgrade
  "The Upgrade header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/upgrade,
   :dcterms/description
   #rdf/langString
    "The Upgrade header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Upgrade@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def uri
  "The URI header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/uri,
   :dcterms/description
   #rdf/langString
    "The URI header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "URI@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2068.txt"}]})

(def user-agent
  "The User-Agent header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/user-agent,
   :dcterms/description
   #rdf/langString
    "The User-Agent header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "User-Agent@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def variant-vary
  "The Variant-Vary header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/variant-vary,
   :dcterms/description
   #rdf/langString
    "The Variant-Vary header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Variant-Vary@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2295.txt"}]})

(def vary
  "The Vary header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/vary,
   :dcterms/description
   #rdf/langString
    "The Vary header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Vary@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def version
  "The Version header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/version,
   :dcterms/description
   #rdf/langString
    "The Version header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "Version@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri "http://www.w3.org/Protocols/HTTP/Object_Headers.html"}]})

(def via
  "The Via header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/via,
   :dcterms/description
   #rdf/langString
    "The Via header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Via@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def want-digest
  "The Want-Digest header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/want-digest,
   :dcterms/description
   #rdf/langString
    "The Want-Digest header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Want-Digest@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc3230.txt"}]})

(def warning
  "The Warning header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/warning,
   :dcterms/description
   #rdf/langString
    "The Warning header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "Warning@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def www-authenticate
  "The WWW-Authenticate header, as defined in the Permanent HTTP Header Field Registrations."
  {:db/ident :http-headers/www-authenticate,
   :dcterms/description
   #rdf/langString
    "The WWW-Authenticate header, as defined in the Permanent HTTP Header Field Registrations.@en",
   :dcterms/title #rdf/langString "WWW-Authenticate@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/perm-headers.html"}
    {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}]})

(def x-device-accept
  "The X-Device-Accept header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/x-device-accept,
   :dcterms/description
   #rdf/langString
    "The X-Device-Accept header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "X-Device-Accept@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri "http://www.w3.org/2005/MWI/BPWG/"}]})

(def x-device-accept-charset
  "The X-Device-Accept-Charset header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/x-device-accept-charset,
   :dcterms/description
   #rdf/langString
    "The X-Device-Accept-Charset header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "X-Device-Accept-Charset@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri "http://www.w3.org/2005/MWI/BPWG/"}]})

(def x-device-accept-encoding
  "The X-Device-Accept-Encoding header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/x-device-accept-encoding,
   :dcterms/description
   #rdf/langString
    "The X-Device-Accept-Encoding header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "X-Device-Accept-Encoding@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri "http://www.w3.org/2005/MWI/BPWG/"}]})

(def x-device-accept-language
  "The X-Device-Accept-Language header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/x-device-accept-language,
   :dcterms/description
   #rdf/langString
    "The X-Device-Accept-Language header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "X-Device-Accept-Language@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri "http://www.w3.org/2005/MWI/BPWG/"}]})

(def x-device-user-agent
  "The X-Device-User-Agent header, as defined in the Provisional HTTP Header Field Submissions."
  {:db/ident :http-headers/x-device-user-agent,
   :dcterms/description
   #rdf/langString
    "The X-Device-User-Agent header, as defined in the Provisional HTTP Header Field Submissions.@en",
   :dcterms/title #rdf/langString "X-Device-User-Agent@en",
   :rdf/type :http/HeaderName,
   :rdfs/isDefinedBy
   [{:rdfa/uri
     "http://www.iana.org/assignments/message-headers/prov-headers.html"}
    {:rdfa/uri "http://www.w3.org/2005/MWI/BPWG/"}]})
