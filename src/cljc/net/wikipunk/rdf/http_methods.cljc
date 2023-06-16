(ns net.wikipunk.rdf.http-methods
  "Hypertext Transfer Protocol -- HTTP/1.1"
  {:dcat/downloadURL   "resources/http-methods.rdf",
   :dcterms/identifier "http://www.ietf.org/rfc/rfc2616.txt",
   :dcterms/title      #voc/lstr "Hypertext Transfer Protocol -- HTTP/1.1@en",
   :rdf/ns-prefix-map  {"dcterms" "http://purl.org/dc/terms/",
                        "http" "http://www.w3.org/2011/http#",
                        "http-methods" "http://www.w3.org/2011/http-methods#",
                        "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                        "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type           :rdfa/PrefixMapping,
   :rdfa/prefix        "http-methods",
   :rdfa/uri           "http://www.ietf.org/rfc/rfc2616.txt"})

(def CONNECT
  "The CONNECT method is reserved for use with a proxy that can dynamically switch to being a tunnel."
  {:db/ident :http-methods/CONNECT,
   :dcterms/description
   #voc/lstr
    "The CONNECT method is reserved for use with a proxy that can dynamically switch to being a tunnel.@en",
   :dcterms/title #voc/lstr "CONNECT@en",
   :rdf/type :http/Method,
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def DELETE
  "The DELETE method requests that the origin server delete the resource identified by the Request-URI."
  {:db/ident :http-methods/DELETE,
   :dcterms/description
   #voc/lstr
    "The DELETE method requests that the origin server delete the resource identified by the Request-URI.@en",
   :dcterms/title #voc/lstr "DELETE@en",
   :rdf/type :http/Method,
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def GET
  "The GET method means retrieve whatever information (in the form of an entity) is identified by the Request-URI."
  {:db/ident :http-methods/GET,
   :dcterms/description
   #voc/lstr
    "The GET method means retrieve whatever information (in the form of an entity) is identified by the Request-URI.@en",
   :dcterms/title #voc/lstr "GET@en",
   :rdf/type :http/Method,
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def HEAD
  "The HEAD method is identical to GET except that the server MUST NOT return a message-body in the response."
  {:db/ident :http-methods/HEAD,
   :dcterms/description
   #voc/lstr
    "The HEAD method is identical to GET except that the server MUST NOT return a message-body in the response.@en",
   :dcterms/title #voc/lstr "HEAD@en",
   :rdf/type :http/Method,
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def OPTIONS
  "The OPTIONS method represents a request for information about the communication options available on the request/response chain identified by the Request-URI."
  {:db/ident :http-methods/OPTIONS,
   :dcterms/description
   #voc/lstr
    "The OPTIONS method represents a request for information about the communication options available on the request/response chain identified by the Request-URI.@en",
   :dcterms/title #voc/lstr "OPTIONS@en",
   :rdf/type :http/Method,
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def PATCH
  "The PATCH method requests that a set of changes described in the request entity be applied to the resource identified by the Request-URI."
  {:db/ident :http-methods/PATCH,
   :dcterms/description
   #voc/lstr
    "The PATCH method requests that a set of changes described in the request entity be applied to the resource identified by the Request-URI.@en",
   :dcterms/title #voc/lstr "PATCH@en",
   :rdf/type :http/Method,
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc5789.txt"})

(def POST
  "The POST method is used to request that the origin server accept the entity enclosed in the request as a new subordinate of the resource identified by the Request-URI in the Request-Line."
  {:db/ident :http-methods/POST,
   :dcterms/description
   #voc/lstr
    "The POST method is used to request that the origin server accept the entity enclosed in the request as a new subordinate of the resource identified by the Request-URI in the Request-Line.@en",
   :dcterms/title #voc/lstr "POST@en",
   :rdf/type :http/Method,
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def PUT
  "The PUT method requests that the enclosed entity be stored under the supplied Request-URI."
  {:db/ident :http-methods/PUT,
   :dcterms/description
   #voc/lstr
    "The PUT method requests that the enclosed entity be stored under the supplied Request-URI.@en",
   :dcterms/title #voc/lstr "PUT@en",
   :rdf/type :http/Method,
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def TRACE
  "The TRACE method is used to invoke a remote, application-layer loop-back of the request message."
  {:db/ident :http-methods/TRACE,
   :dcterms/description
   #voc/lstr
    "The TRACE method is used to invoke a remote, application-layer loop-back of the request message.@en",
   :dcterms/title #voc/lstr "TRACE@en",
   :rdf/type :http/Method,
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})