(ns net.wikipunk.rdf.http-methods
  {:dcat/downloadURL "net/wikipunk/ext/http-methods.rdf",
   :namespaces       {"dcterms" "http://purl.org/dc/terms/",
                      "http" "http://www.w3.org/2011/http#",
                      "http-methods" "http://www.w3.org/2011/http-methods#",
                      "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                      "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "http-methods",
   :rdfa/uri         "http://www.w3.org/2011/http-methods#"})

(def CONNECT
  {:db/ident :http-methods/CONNECT,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The CONNECT method is reserved for use with a proxy that can dynamically switch to being a tunnel."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "CONNECT"},
   :rdf/type :http/Method,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}})

(def DELETE
  {:db/ident :http-methods/DELETE,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The DELETE method requests that the origin server delete the resource identified by the Request-URI."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "DELETE"},
   :rdf/type :http/Method,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}})

(def GET
  {:db/ident :http-methods/GET,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The GET method means retrieve whatever information (in the form of an entity) is identified by the Request-URI."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "GET"},
   :rdf/type :http/Method,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}})

(def HEAD
  {:db/ident :http-methods/HEAD,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The HEAD method is identical to GET except that the server MUST NOT return a message-body in the response."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "HEAD"},
   :rdf/type :http/Method,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}})

(def OPTIONS
  {:db/ident :http-methods/OPTIONS,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The OPTIONS method represents a request for information about the communication options available on the request/response chain identified by the Request-URI."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "OPTIONS"},
   :rdf/type :http/Method,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}})

(def PATCH
  {:db/ident :http-methods/PATCH,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The PATCH method requests that a set of changes described in the request entity be applied to the resource identified by the Request-URI."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "PATCH"},
   :rdf/type :http/Method,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc5789.txt"}})

(def POST
  {:db/ident :http-methods/POST,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The POST method is used to request that the origin server accept the entity enclosed in the request as a new subordinate of the resource identified by the Request-URI in the Request-Line."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "POST"},
   :rdf/type :http/Method,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}})

(def PUT
  {:db/ident :http-methods/PUT,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The PUT method requests that the enclosed entity be stored under the supplied Request-URI."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "PUT"},
   :rdf/type :http/Method,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}})

(def TRACE
  {:db/ident :http-methods/TRACE,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The TRACE method is used to invoke a remote, application-layer loop-back of the request message."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "TRACE"},
   :rdf/type :http/Method,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"}})