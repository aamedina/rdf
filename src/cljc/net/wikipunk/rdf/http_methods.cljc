(ns net.wikipunk.rdf.http-methods
  {:dcat/downloadURL  "resources/http-methods.rdf",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "http" "http://www.w3.org/2011/http#",
                       "http-methods" "http://www.w3.org/2011/http-methods#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "http-methods",
   :rdfa/uri          "http://www.w3.org/2011/http-methods#"})

(def CONNECT
  "The CONNECT method is reserved for use with a proxy that can dynamically switch to being a tunnel."
  {:db/ident :http-methods/CONNECT,
   :dcterms/description
   #rdf/langString
    "The CONNECT method is reserved for use with a proxy that can dynamically switch to being a tunnel.@en",
   :dcterms/title #rdf/langString "CONNECT@en",
   :rdf/type :http/Method,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}})

(def DELETE
  "The DELETE method requests that the origin server delete the resource identified by the Request-URI."
  {:db/ident :http-methods/DELETE,
   :dcterms/description
   #rdf/langString
    "The DELETE method requests that the origin server delete the resource identified by the Request-URI.@en",
   :dcterms/title #rdf/langString "DELETE@en",
   :rdf/type :http/Method,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}})

(def GET
  "The GET method means retrieve whatever information (in the form of an entity) is identified by the Request-URI."
  {:db/ident :http-methods/GET,
   :dcterms/description
   #rdf/langString
    "The GET method means retrieve whatever information (in the form of an entity) is identified by the Request-URI.@en",
   :dcterms/title #rdf/langString "GET@en",
   :rdf/type :http/Method,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}})

(def HEAD
  "The HEAD method is identical to GET except that the server MUST NOT return a message-body in the response."
  {:db/ident :http-methods/HEAD,
   :dcterms/description
   #rdf/langString
    "The HEAD method is identical to GET except that the server MUST NOT return a message-body in the response.@en",
   :dcterms/title #rdf/langString "HEAD@en",
   :rdf/type :http/Method,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}})

(def OPTIONS
  "The OPTIONS method represents a request for information about the communication options available on the request/response chain identified by the Request-URI."
  {:db/ident :http-methods/OPTIONS,
   :dcterms/description
   #rdf/langString
    "The OPTIONS method represents a request for information about the communication options available on the request/response chain identified by the Request-URI.@en",
   :dcterms/title #rdf/langString "OPTIONS@en",
   :rdf/type :http/Method,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}})

(def PATCH
  "The PATCH method requests that a set of changes described in the request entity be applied to the resource identified by the Request-URI."
  {:db/ident :http-methods/PATCH,
   :dcterms/description
   #rdf/langString
    "The PATCH method requests that a set of changes described in the request entity be applied to the resource identified by the Request-URI.@en",
   :dcterms/title #rdf/langString "PATCH@en",
   :rdf/type :http/Method,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc5789.txt"}})

(def POST
  "The POST method is used to request that the origin server accept the entity enclosed in the request as a new subordinate of the resource identified by the Request-URI in the Request-Line."
  {:db/ident :http-methods/POST,
   :dcterms/description
   #rdf/langString
    "The POST method is used to request that the origin server accept the entity enclosed in the request as a new subordinate of the resource identified by the Request-URI in the Request-Line.@en",
   :dcterms/title #rdf/langString "POST@en",
   :rdf/type :http/Method,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}})

(def PUT
  "The PUT method requests that the enclosed entity be stored under the supplied Request-URI."
  {:db/ident :http-methods/PUT,
   :dcterms/description
   #rdf/langString
    "The PUT method requests that the enclosed entity be stored under the supplied Request-URI.@en",
   :dcterms/title #rdf/langString "PUT@en",
   :rdf/type :http/Method,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}})

(def TRACE
  "The TRACE method is used to invoke a remote, application-layer loop-back of the request message."
  {:db/ident :http-methods/TRACE,
   :dcterms/description
   #rdf/langString
    "The TRACE method is used to invoke a remote, application-layer loop-back of the request message.@en",
   :dcterms/title #rdf/langString "TRACE@en",
   :rdf/type :http/Method,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"}})
