(ns net.wikipunk.rdf.http
  "A namespace for describing HTTP messages (http://www.w3.org/Protocols/rfc2616/rfc2616.html)"
  {:dcat/downloadURL
   "https://lov.linkeddata.es/dataset/lov/vocabs/http/versions/2011-04-29.n3",
   :owl/imports ["http://www.w3.org/2011/content#" "http://purl.org/dc/terms/"],
   :owl/versionInfo "Working Draft 29 April 2011",
   :rdf/ns-prefix-map {"http" "http://www.w3.org/2011/http#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "http",
   :rdfa/uri "http://www.w3.org/2011/http",
   :rdfs/comment
   "A namespace for describing HTTP messages (http://www.w3.org/Protocols/rfc2616/rfc2616.html)",
   :rdfs/isDefinedBy "http://www.w3.org/TR/HTTP-in-RDF/",
   :rdfs/label "HTTP in RDF",
   :rdfs/seeAlso ["http://www.w3.org/TR/Content-in-RDF/"
                  "http://www.w3.org/WAI/intro/earl"]})

(def Connection
  "A connection used for HTTP transfer."
  {:db/ident         :http/Connection,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "A connection used for HTTP transfer.",
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       "Connection",
   :rdfs/subClassOf  [:rdfs/Resource :http/Connection]})

(def EntityHeader
  "An entity header in an HTTP message."
  {:db/ident        :http/EntityHeader,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "An entity header in an HTTP message.",
   :rdfs/label      "Entity Header",
   :rdfs/subClassOf [:rdfs/Resource :http/MessageHeader :http/EntityHeader]})

(def GeneralHeader
  "A general header in an HTTP message."
  {:db/ident        :http/GeneralHeader,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A general header in an HTTP message.",
   :rdfs/label      "General Header",
   :rdfs/subClassOf [:http/MessageHeader :http/GeneralHeader :rdfs/Resource]})

(def HeaderElement
  "A part of a deconstructed header value."
  {:db/ident        :http/HeaderElement,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A part of a deconstructed header value.",
   :rdfs/label      "Header Element",
   :rdfs/subClassOf [:rdfs/Resource :http/HeaderElement]})

(def HeaderName
  "A header name."
  {:db/ident        :http/HeaderName,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A header name.",
   :rdfs/label      "Header Name",
   :rdfs/subClassOf [:rdfs/Resource :http/HeaderName]})

(def Message
  "An HTTP message."
  {:db/ident         :http/Message,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "An HTTP message.",
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       "Message",
   :rdfs/subClassOf  [:rdfs/Resource :http/Message]})

(def MessageHeader
  "A header in an HTTP message."
  {:db/ident        :http/MessageHeader,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A header in an HTTP message.",
   :rdfs/label      "Message Header",
   :rdfs/subClassOf [:rdfs/Resource :http/MessageHeader]})

(def Method
  "The HTTP method used for the request."
  {:db/ident         :http/Method,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "The HTTP method used for the request.",
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       "Method",
   :rdfs/subClassOf  [:rdfs/Resource :http/Method]})

(def Parameter
  "A parameter for a part of a header value."
  {:db/ident        :http/Parameter,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A parameter for a part of a header value.",
   :rdfs/label      "Parameter",
   :rdfs/subClassOf [:rdfs/Resource :http/Parameter]})

(def Request
  "An HTTP request."
  {:db/ident         :http/Request,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "An HTTP request.",
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       "Request",
   :rdfs/subClassOf  [:http/Message :http/Request :rdfs/Resource]})

(def RequestHeader
  "A header in an HTTP request message."
  {:db/ident        :http/RequestHeader,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A header in an HTTP request message.",
   :rdfs/label      "Request Header",
   :rdfs/subClassOf [:http/MessageHeader :http/RequestHeader :rdfs/Resource]})

(def Response
  "An HTTP response."
  {:db/ident         :http/Response,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "An HTTP response.",
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       "Response",
   :rdfs/subClassOf  [:rdfs/Resource :http/Message :http/Response]})

(def ResponseHeader
  "A header in an HTTP response message."
  {:db/ident        :http/ResponseHeader,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A header in an HTTP response message.",
   :rdfs/label      "Response Header",
   :rdfs/subClassOf [:http/MessageHeader :http/ResponseHeader :rdfs/Resource]})

(def StatusCode
  "The status code of an HTTP response."
  {:db/ident         :http/StatusCode,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "The status code of an HTTP response.",
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       "Status code",
   :rdfs/subClassOf  [:rdfs/Resource :http/StatusCode]})

(def absolutePath
  "The absolute path sort of request URI."
  {:db/ident           :http/absolutePath,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The absolute path sort of request URI.",
   :rdfs/label         "Absolute path",
   :rdfs/subPropertyOf [:http/requestURI :http/absolutePath]})

(def absoluteURI
  "The absolute request URI."
  {:db/ident           :http/absoluteURI,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The absolute request URI.",
   :rdfs/label         "Absolute URI",
   :rdfs/subPropertyOf [:http/requestURI :http/absoluteURI]})

(def authority
  "The authority sort of request URI."
  {:db/ident           :http/authority,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The authority sort of request URI.",
   :rdfs/label         "Authority",
   :rdfs/subPropertyOf [:http/requestURI :http/authority]})

(def body
  "The entity body of an HTTP message."
  {:db/ident           :http/body,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The entity body of an HTTP message.",
   :rdfs/domain        :http/Message,
   :rdfs/isDefinedBy   "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label         "Entity Body",
   :rdfs/range         :cnt/ContentAsBase64,
   :rdfs/subPropertyOf :http/body})

(def connectionAuthority
  "The authority of a connection used for the HTTP transfer."
  {:db/ident :http/connectionAuthority,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The authority of a connection used for the HTTP transfer.",
   :rdfs/domain :http/Connection,
   :rdfs/label "Connection authority",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :http/connectionAuthority})

(def elementName
  "The name of a header element."
  {:db/ident           :http/elementName,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The name of a header element.",
   :rdfs/domain        :http/HeaderElement,
   :rdfs/label         "Header element name",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :http/elementName})

(def elementValue
  "The value of a header element."
  {:db/ident           :http/elementValue,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The value of a header element.",
   :rdfs/domain        :http/HeaderElement,
   :rdfs/label         "Header element value",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :http/elementValue})

(def fieldName
  "The name of an HTTP header field."
  {:db/ident           :http/fieldName,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The name of an HTTP header field.",
   :rdfs/domain        :http/MessageHeader,
   :rdfs/label         "Field name",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :http/fieldName})

(def fieldValue
  "The value of an HTTP header field."
  {:db/ident           :http/fieldValue,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The value of an HTTP header field.",
   :rdfs/domain        :http/MessageHeader,
   :rdfs/label         "Field value",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :http/fieldValue})

(def hdrName
  "The name of an HTTP header."
  {:db/ident           :http/hdrName,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The name of an HTTP header.",
   :rdfs/domain        :http/MessageHeader,
   :rdfs/label         "Header name",
   :rdfs/range         :http/HeaderName,
   :rdfs/subPropertyOf :http/hdrName})

(def headerElements
  "The deconstructed parts of an HTTP header value."
  {:db/ident           :http/headerElements,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The deconstructed parts of an HTTP header value.",
   :rdfs/domain        :http/MessageHeader,
   :rdfs/label         "Header elements",
   :rdfs/subPropertyOf :http/headerElements})

(def headers
  "The headers in an HTTP message."
  {:db/ident           :http/headers,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The headers in an HTTP message.",
   :rdfs/domain        :http/Message,
   :rdfs/isDefinedBy   "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label         "Headers",
   :rdfs/subPropertyOf :http/headers})

(def httpVersion
  "The HTTP version of an HTTP message."
  {:db/ident           :http/httpVersion,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The HTTP version of an HTTP message.",
   :rdfs/domain        :http/Message,
   :rdfs/isDefinedBy   "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label         "HTTP version",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :http/httpVersion})

(def methodName
  "The HTTP method name used for the HTTP request."
  {:db/ident           :http/methodName,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The HTTP method name used for the HTTP request.",
   :rdfs/domain        :http/Request,
   :rdfs/isDefinedBy   "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label         "Method name",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :http/methodName})

(def mthd
  "The HTTP method used for the HTTP request."
  {:db/ident           :http/mthd,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The HTTP method used for the HTTP request.",
   :rdfs/domain        :http/Request,
   :rdfs/isDefinedBy   "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label         "Method",
   :rdfs/range         :http/Method,
   :rdfs/subPropertyOf :http/mthd})

(def paramName
  "The name of a parameter in a part of a deconstructed HTTP header value."
  {:db/ident :http/paramName,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "The name of a parameter in a part of a deconstructed HTTP header value.",
   :rdfs/domain :http/Parameter,
   :rdfs/label "Parameter name",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :http/paramName})

(def paramValue
  "The value of a parameter in a part of a deconstructed HTTP header value."
  {:db/ident :http/paramValue,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "The value of a parameter in a part of a deconstructed HTTP header value.",
   :rdfs/domain :http/Parameter,
   :rdfs/label "Parameter value",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :http/paramValue})

(def params
  "The parameters in a part of a deconstructed HTTP header value."
  {:db/ident :http/params,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "The parameters in a part of a deconstructed HTTP header value.",
   :rdfs/domain :http/HeaderElement,
   :rdfs/label "Header parameters",
   :rdfs/subPropertyOf :http/params})

(def reasonPhrase
  "The reason phrase (status text) of an HTTP response."
  {:db/ident           :http/reasonPhrase,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The reason phrase (status text) of an HTTP response.",
   :rdfs/domain        :http/Response,
   :rdfs/isDefinedBy   "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label         "Reason phrase",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :http/reasonPhrase})

(def requestURI
  "The request URI of an HTTP request."
  {:db/ident           :http/requestURI,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The request URI of an HTTP request.",
   :rdfs/domain        :http/Request,
   :rdfs/isDefinedBy   "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label         "Request URI",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :http/requestURI})

(def requests
  "The HTTP requests made via a connection."
  {:db/ident           :http/requests,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The HTTP requests made via a connection.",
   :rdfs/domain        :http/Connection,
   :rdfs/isDefinedBy   "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label         "Requests",
   :rdfs/subPropertyOf :http/requests})

(def resp
  "The HTTP response sent in answer to an HTTP request."
  {:db/ident           :http/resp,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The HTTP response sent in answer to an HTTP request.",
   :rdfs/domain        :http/Request,
   :rdfs/isDefinedBy   "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label         "Response",
   :rdfs/range         :http/Response,
   :rdfs/subPropertyOf :http/resp})

(def sc
  "The status code of an HTTP response."
  {:db/ident           :http/sc,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The status code of an HTTP response.",
   :rdfs/domain        :http/Response,
   :rdfs/isDefinedBy   "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label         "Status code",
   :rdfs/range         :http/StatusCode,
   :rdfs/subPropertyOf :http/sc})

(def statusCodeNumber
  "The status code number."
  {:db/ident           :http/statusCodeNumber,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The status code number.",
   :rdfs/domain        :http/StatusCode,
   :rdfs/isDefinedBy   "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label         "Status code",
   :rdfs/range         :xsd/int,
   :rdfs/subPropertyOf [:dcterms/identifier :http/statusCodeNumber]})

(def statusCodeValue
  "The status code value of an HTTP response."
  {:db/ident           :http/statusCodeValue,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The status code value of an HTTP response.",
   :rdfs/domain        :http/Response,
   :rdfs/isDefinedBy   "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label         "Status code",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :http/statusCodeValue})