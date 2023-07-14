(ns net.wikipunk.rdf.http
  "A namespace for describing HTTP messages (http://www.w3.org/Protocols/rfc2616/rfc2616.html)"
  {:dcat/downloadURL "resources/http.rdf",
   :owl/imports [{:rdfa/uri "http://www.w3.org/2011/content#"}
                 {:rdfa/uri "http://purl.org/dc/terms/"}],
   :owl/versionInfo #xsd/langString "Working Draft 29 April 2011@en",
   :rdf/ns-prefix-map {"http" "http://www.w3.org/2011/http#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "http",
   :rdfa/uri "http://www.w3.org/2011/http",
   :rdfs/comment
   #xsd/langString
    "A namespace for describing HTTP messages (http://www.w3.org/Protocols/rfc2616/rfc2616.html)@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/HTTP-in-RDF/"},
   :rdfs/label #xsd/langString "HTTP in RDF@en",
   :rdfs/seeAlso [{:rdfa/uri "http://www.w3.org/TR/Content-in-RDF/"}
                  {:rdfa/uri "http://www.w3.org/WAI/intro/earl"}]})

(def Connection
  "A connection used for HTTP transfer."
  {:db/ident         :http/Connection,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     #xsd/langString "A connection used for HTTP transfer.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Connection@en",
   :rdfs/subClassOf  :rdfs/Resource})

(def EntityHeader
  "An entity header in an HTTP message."
  {:db/ident        :http/EntityHeader,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    #xsd/langString "An entity header in an HTTP message.@en",
   :rdfs/label      #xsd/langString "Entity Header@en",
   :rdfs/subClassOf [:rdfs/Resource :http/MessageHeader]})

(def GeneralHeader
  "A general header in an HTTP message."
  {:db/ident        :http/GeneralHeader,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    #xsd/langString "A general header in an HTTP message.@en",
   :rdfs/label      #xsd/langString "General Header@en",
   :rdfs/subClassOf [:http/MessageHeader :rdfs/Resource]})

(def HeaderElement
  "A part of a deconstructed header value."
  {:db/ident        :http/HeaderElement,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    #xsd/langString
                     "A part of a deconstructed header value.@en",
   :rdfs/label      #xsd/langString "Header Element@en",
   :rdfs/subClassOf :rdfs/Resource})

(def HeaderName
  "A header name."
  {:db/ident        :http/HeaderName,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    #xsd/langString "A header name.@en",
   :rdfs/label      #xsd/langString "Header Name@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Message
  "An HTTP message."
  {:db/ident         :http/Message,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     #xsd/langString "An HTTP message.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Message@en",
   :rdfs/subClassOf  :rdfs/Resource})

(def MessageHeader
  "A header in an HTTP message."
  {:db/ident        :http/MessageHeader,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    #xsd/langString "A header in an HTTP message.@en",
   :rdfs/label      #xsd/langString "Message Header@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Method
  "The HTTP method used for the request."
  {:db/ident         :http/Method,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     #xsd/langString "The HTTP method used for the request.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Method@en",
   :rdfs/subClassOf  :rdfs/Resource})

(def Parameter
  "A parameter for a part of a header value."
  {:db/ident        :http/Parameter,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    #xsd/langString
                     "A parameter for a part of a header value.@en",
   :rdfs/label      #xsd/langString "Parameter@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Request
  "An HTTP request."
  {:db/ident         :http/Request,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     #xsd/langString "An HTTP request.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Request@en",
   :rdfs/subClassOf  [:http/Message :rdfs/Resource]})

(def RequestHeader
  "A header in an HTTP request message."
  {:db/ident        :http/RequestHeader,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    #xsd/langString "A header in an HTTP request message.@en",
   :rdfs/label      #xsd/langString "Request Header@en",
   :rdfs/subClassOf [:http/MessageHeader :rdfs/Resource]})

(def Response
  "An HTTP response."
  {:db/ident         :http/Response,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     #xsd/langString "An HTTP response.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Response@en",
   :rdfs/subClassOf  [:rdfs/Resource :http/Message]})

(def ResponseHeader
  "A header in an HTTP response message."
  {:db/ident        :http/ResponseHeader,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    #xsd/langString "A header in an HTTP response message.@en",
   :rdfs/label      #xsd/langString "Response Header@en",
   :rdfs/subClassOf [:http/MessageHeader :rdfs/Resource]})

(def StatusCode
  "The status code of an HTTP response."
  {:db/ident         :http/StatusCode,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     #xsd/langString "The status code of an HTTP response.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Status code@en",
   :rdfs/subClassOf  :rdfs/Resource})

(def absolutePath
  "The absolute path sort of request URI."
  {:db/ident           :http/absolutePath,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString
                        "The absolute path sort of request URI.@en",
   :rdfs/label         #xsd/langString "Absolute path@en",
   :rdfs/subPropertyOf :http/requestURI})

(def absoluteURI
  "The absolute request URI."
  {:db/ident           :http/absoluteURI,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString "The absolute request URI.@en",
   :rdfs/label         #xsd/langString "Absolute URI@en",
   :rdfs/subPropertyOf :http/requestURI})

(def authority
  "The authority sort of request URI."
  {:db/ident           :http/authority,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString "The authority sort of request URI.@en",
   :rdfs/label         #xsd/langString "Authority@en",
   :rdfs/subPropertyOf :http/requestURI})

(def body
  "The entity body of an HTTP message."
  {:db/ident         :http/body,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     #xsd/langString "The entity body of an HTTP message.@en",
   :rdfs/domain      :http/Message,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Entity Body@en",
   :rdfs/range       :cnt/ContentAsBase64})

(def connectionAuthority
  "The authority of a connection used for the HTTP transfer."
  {:db/ident :http/connectionAuthority,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "The authority of a connection used for the HTTP transfer.@en",
   :rdfs/domain :http/Connection,
   :rdfs/label #xsd/langString "Connection authority@en",
   :rdfs/range :rdfs/Literal})

(def elementName
  "The name of a header element."
  {:db/ident     :http/elementName,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment #xsd/langString "The name of a header element.@en",
   :rdfs/domain  :http/HeaderElement,
   :rdfs/label   #xsd/langString "Header element name@en",
   :rdfs/range   :rdfs/Literal})

(def elementValue
  "The value of a header element."
  {:db/ident     :http/elementValue,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment #xsd/langString "The value of a header element.@en",
   :rdfs/domain  :http/HeaderElement,
   :rdfs/label   #xsd/langString "Header element value@en",
   :rdfs/range   :rdfs/Literal})

(def fieldName
  "The name of an HTTP header field."
  {:db/ident     :http/fieldName,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment #xsd/langString "The name of an HTTP header field.@en",
   :rdfs/domain  :http/MessageHeader,
   :rdfs/label   #xsd/langString "Field name@en",
   :rdfs/range   :rdfs/Literal})

(def fieldValue
  "The value of an HTTP header field."
  {:db/ident     :http/fieldValue,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment #xsd/langString "The value of an HTTP header field.@en",
   :rdfs/domain  :http/MessageHeader,
   :rdfs/label   #xsd/langString "Field value@en",
   :rdfs/range   :rdfs/Literal})

(def hdrName
  "The name of an HTTP header."
  {:db/ident     :http/hdrName,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment #xsd/langString "The name of an HTTP header.@en",
   :rdfs/domain  :http/MessageHeader,
   :rdfs/label   #xsd/langString "Header name@en",
   :rdfs/range   :http/HeaderName})

(def headerElements
  "The deconstructed parts of an HTTP header value."
  {:db/ident     :http/headerElements,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment #xsd/langString
                  "The deconstructed parts of an HTTP header value.@en",
   :rdfs/domain  :http/MessageHeader,
   :rdfs/label   #xsd/langString "Header elements@en"})

(def headers
  "The headers in an HTTP message."
  {:db/ident         :http/headers,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     #xsd/langString "The headers in an HTTP message.@en",
   :rdfs/domain      :http/Message,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Headers@en"})

(def httpVersion
  "The HTTP version of an HTTP message."
  {:db/ident         :http/httpVersion,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     #xsd/langString "The HTTP version of an HTTP message.@en",
   :rdfs/domain      :http/Message,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "HTTP version@en",
   :rdfs/range       :rdfs/Literal})

(def methodName
  "The HTTP method name used for the HTTP request."
  {:db/ident         :http/methodName,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     #xsd/langString
                      "The HTTP method name used for the HTTP request.@en",
   :rdfs/domain      :http/Request,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Method name@en",
   :rdfs/range       :rdfs/Literal})

(def mthd
  "The HTTP method used for the HTTP request."
  {:db/ident         :http/mthd,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     #xsd/langString
                      "The HTTP method used for the HTTP request.@en",
   :rdfs/domain      :http/Request,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Method@en",
   :rdfs/range       :http/Method})

(def paramName
  "The name of a parameter in a part of a deconstructed HTTP header value."
  {:db/ident :http/paramName,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "The name of a parameter in a part of a deconstructed HTTP header value.@en",
   :rdfs/domain :http/Parameter,
   :rdfs/label #xsd/langString "Parameter name@en",
   :rdfs/range :rdfs/Literal})

(def paramValue
  "The value of a parameter in a part of a deconstructed HTTP header value."
  {:db/ident :http/paramValue,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "The value of a parameter in a part of a deconstructed HTTP header value.@en",
   :rdfs/domain :http/Parameter,
   :rdfs/label #xsd/langString "Parameter value@en",
   :rdfs/range :rdfs/Literal})

(def params
  "The parameters in a part of a deconstructed HTTP header value."
  {:db/ident :http/params,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "The parameters in a part of a deconstructed HTTP header value.@en",
   :rdfs/domain :http/HeaderElement,
   :rdfs/label #xsd/langString "Header parameters@en"})

(def reasonPhrase
  "The reason phrase (status text) of an HTTP response."
  {:db/ident         :http/reasonPhrase,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     #xsd/langString
                      "The reason phrase (status text) of an HTTP response.@en",
   :rdfs/domain      :http/Response,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Reason phrase@en",
   :rdfs/range       :rdfs/Literal})

(def requestURI
  "The request URI of an HTTP request."
  {:db/ident         :http/requestURI,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     #xsd/langString "The request URI of an HTTP request.@en",
   :rdfs/domain      :http/Request,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Request URI@en",
   :rdfs/range       :rdfs/Literal})

(def requests
  "The HTTP requests made via a connection."
  {:db/ident         :http/requests,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     #xsd/langString
                      "The HTTP requests made via a connection.@en",
   :rdfs/domain      :http/Connection,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Requests@en"})

(def resp
  "The HTTP response sent in answer to an HTTP request."
  {:db/ident         :http/resp,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     #xsd/langString
                      "The HTTP response sent in answer to an HTTP request.@en",
   :rdfs/domain      :http/Request,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Response@en",
   :rdfs/range       :http/Response})

(def sc
  "The status code of an HTTP response."
  {:db/ident         :http/sc,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     #xsd/langString "The status code of an HTTP response.@en",
   :rdfs/domain      :http/Response,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Status code@en",
   :rdfs/range       :http/StatusCode})

(def statusCodeNumber
  "The status code number."
  {:db/ident           :http/statusCodeNumber,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       #xsd/langString "The status code number.@en",
   :rdfs/domain        :http/StatusCode,
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label         #xsd/langString "Status code@en",
   :rdfs/range         :xsd/int,
   :rdfs/subPropertyOf :dcterms/identifier})

(def statusCodeValue
  "The status code value of an HTTP response."
  {:db/ident         :http/statusCodeValue,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     #xsd/langString
                      "The status code value of an HTTP response.@en",
   :rdfs/domain      :http/Response,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Status code@en",
   :rdfs/range       :rdfs/Literal})