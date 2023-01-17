(ns net.wikipunk.rdf.http
  "A namespace for describing HTTP messages (http://www.w3.org/Protocols/rfc2616/rfc2616.html)"
  {:dcat/downloadURL
   "https://lov.linkeddata.es/dataset/lov/vocabs/http/versions/2011-04-29.n3",
   :owl/imports ["http://www.w3.org/2011/content#" "http://purl.org/dc/terms/"],
   :owl/versionInfo {:rdf/language "en",
                     :rdf/value    "Working Draft 29 April 2011"},
   :rdf/ns-prefix-map {"http" "http://www.w3.org/2011/http#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://www.w3.org/2011/http",
   :rdfa/prefix "http",
   :rdfa/uri "http://www.w3.org/2011/http#",
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A namespace for describing HTTP messages (http://www.w3.org/Protocols/rfc2616/rfc2616.html)"},
   :rdfs/isDefinedBy "http://www.w3.org/TR/HTTP-in-RDF/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "HTTP in RDF"},
   :rdfs/seeAlso ["http://www.w3.org/TR/Content-in-RDF/"
                  "http://www.w3.org/WAI/intro/earl"]})

(def Connection
  "A connection used for HTTP transfer."
  {:db/ident         :http/Connection,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A connection used for HTTP transfer."},
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Connection"}})

(def EntityHeader
  "An entity header in an HTTP message."
  {:db/ident        :http/EntityHeader,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "An entity header in an HTTP message."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Entity Header"},
   :rdfs/subClassOf :http/MessageHeader})

(def GeneralHeader
  "A general header in an HTTP message."
  {:db/ident        :http/GeneralHeader,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "A general header in an HTTP message."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "General Header"},
   :rdfs/subClassOf :http/MessageHeader})

(def HeaderElement
  "A part of a deconstructed header value."
  {:db/ident     :http/HeaderElement,
   :rdf/type     [:owl/Class :rdfs/Class],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A part of a deconstructed header value."},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Header Element"}})

(def HeaderName
  "A header name."
  {:db/ident     :http/HeaderName,
   :rdf/type     [:owl/Class :rdfs/Class],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A header name."},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Header Name"}})

(def Message
  "An HTTP message."
  {:db/ident         :http/Message,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "An HTTP message."},
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Message"}})

(def MessageHeader
  "A header in an HTTP message."
  {:db/ident     :http/MessageHeader,
   :rdf/type     [:owl/Class :rdfs/Class],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A header in an HTTP message."},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Message Header"}})

(def Method
  "The HTTP method used for the request."
  {:db/ident         :http/Method,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The HTTP method used for the request."},
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Method"}})

(def Parameter
  "A parameter for a part of a header value."
  {:db/ident     :http/Parameter,
   :rdf/type     [:owl/Class :rdfs/Class],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A parameter for a part of a header value."},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Parameter"}})

(def Request
  "An HTTP request."
  {:db/ident         :http/Request,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "An HTTP request."},
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Request"},
   :rdfs/subClassOf  :http/Message})

(def RequestHeader
  "A header in an HTTP request message."
  {:db/ident        :http/RequestHeader,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "A header in an HTTP request message."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Request Header"},
   :rdfs/subClassOf :http/MessageHeader})

(def Response
  "An HTTP response."
  {:db/ident         :http/Response,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "An HTTP response."},
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Response"},
   :rdfs/subClassOf  :http/Message})

(def ResponseHeader
  "A header in an HTTP response message."
  {:db/ident        :http/ResponseHeader,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "A header in an HTTP response message."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Response Header"},
   :rdfs/subClassOf :http/MessageHeader})

(def StatusCode
  "The status code of an HTTP response."
  {:db/ident         :http/StatusCode,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The status code of an HTTP response."},
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Status code"}})

(def absolutePath
  "The absolute path sort of request URI."
  {:db/ident           :http/absolutePath,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "The absolute path sort of request URI."},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Absolute path"},
   :rdfs/subPropertyOf :http/requestURI})

(def absoluteURI
  "The absolute request URI."
  {:db/ident           :http/absoluteURI,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "The absolute request URI."},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Absolute URI"},
   :rdfs/subPropertyOf :http/requestURI})

(def authority
  "The authority sort of request URI."
  {:db/ident           :http/authority,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "The authority sort of request URI."},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Authority"},
   :rdfs/subPropertyOf :http/requestURI})

(def body
  "The entity body of an HTTP message."
  {:db/ident         :http/body,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The entity body of an HTTP message."},
   :rdfs/domain      :http/Message,
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Entity Body"},
   :rdfs/range       :cnt/ContentAsBase64})

(def connectionAuthority
  "The authority of a connection used for the HTTP transfer."
  {:db/ident     :http/connectionAuthority,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The authority of a connection used for the HTTP transfer."},
   :rdfs/domain  :http/Connection,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Connection authority"},
   :rdfs/range   :rdfs/Literal})

(def elementName
  "The name of a header element."
  {:db/ident     :http/elementName,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The name of a header element."},
   :rdfs/domain  :http/HeaderElement,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Header element name"},
   :rdfs/range   :rdfs/Literal})

(def elementValue
  "The value of a header element."
  {:db/ident     :http/elementValue,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The value of a header element."},
   :rdfs/domain  :http/HeaderElement,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Header element value"},
   :rdfs/range   :rdfs/Literal})

(def fieldName
  "The name of an HTTP header field."
  {:db/ident     :http/fieldName,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The name of an HTTP header field."},
   :rdfs/domain  :http/MessageHeader,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Field name"},
   :rdfs/range   :rdfs/Literal})

(def fieldValue
  "The value of an HTTP header field."
  {:db/ident     :http/fieldValue,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The value of an HTTP header field."},
   :rdfs/domain  :http/MessageHeader,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Field value"},
   :rdfs/range   :rdfs/Literal})

(def hdrName
  "The name of an HTTP header."
  {:db/ident     :http/hdrName,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The name of an HTTP header."},
   :rdfs/domain  :http/MessageHeader,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Header name"},
   :rdfs/range   :http/HeaderName})

(def headerElements
  "The deconstructed parts of an HTTP header value."
  {:db/ident     :http/headerElements,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The deconstructed parts of an HTTP header value."},
   :rdfs/domain  :http/MessageHeader,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Header elements"}})

(def headers
  "The headers in an HTTP message."
  {:db/ident         :http/headers,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The headers in an HTTP message."},
   :rdfs/domain      :http/Message,
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Headers"}})

(def httpVersion
  "The HTTP version of an HTTP message."
  {:db/ident         :http/httpVersion,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The HTTP version of an HTTP message."},
   :rdfs/domain      :http/Message,
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "HTTP version"},
   :rdfs/range       :rdfs/Literal})

(def methodName
  "The HTTP method name used for the HTTP request."
  {:db/ident         :http/methodName,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The HTTP method name used for the HTTP request."},
   :rdfs/domain      :http/Request,
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Method name"},
   :rdfs/range       :rdfs/Literal})

(def mthd
  "The HTTP method used for the HTTP request."
  {:db/ident         :http/mthd,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "The HTTP method used for the HTTP request."},
   :rdfs/domain      :http/Request,
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Method"},
   :rdfs/range       :http/Method})

(def paramName
  "The name of a parameter in a part of a deconstructed HTTP header value."
  {:db/ident :http/paramName,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The name of a parameter in a part of a deconstructed HTTP header value."},
   :rdfs/domain :http/Parameter,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Parameter name"},
   :rdfs/range :rdfs/Literal})

(def paramValue
  "The value of a parameter in a part of a deconstructed HTTP header value."
  {:db/ident :http/paramValue,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The value of a parameter in a part of a deconstructed HTTP header value."},
   :rdfs/domain :http/Parameter,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Parameter value"},
   :rdfs/range :rdfs/Literal})

(def params
  "The parameters in a part of a deconstructed HTTP header value."
  {:db/ident :http/params,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The parameters in a part of a deconstructed HTTP header value."},
   :rdfs/domain :http/HeaderElement,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Header parameters"}})

(def reasonPhrase
  "The reason phrase (status text) of an HTTP response."
  {:db/ident         :http/reasonPhrase,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The reason phrase (status text) of an HTTP response."},
   :rdfs/domain      :http/Response,
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Reason phrase"},
   :rdfs/range       :rdfs/Literal})

(def requestURI
  "The request URI of an HTTP request."
  {:db/ident         :http/requestURI,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The request URI of an HTTP request."},
   :rdfs/domain      :http/Request,
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Request URI"},
   :rdfs/range       :rdfs/Literal})

(def requests
  "The HTTP requests made via a connection."
  {:db/ident         :http/requests,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The HTTP requests made via a connection."},
   :rdfs/domain      :http/Connection,
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Requests"}})

(def resp
  "The HTTP response sent in answer to an HTTP request."
  {:db/ident         :http/resp,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The HTTP response sent in answer to an HTTP request."},
   :rdfs/domain      :http/Request,
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Response"},
   :rdfs/range       :http/Response})

(def sc
  "The status code of an HTTP response."
  {:db/ident         :http/sc,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The status code of an HTTP response."},
   :rdfs/domain      :http/Response,
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Status code"},
   :rdfs/range       :http/StatusCode})

(def statusCodeNumber
  "The status code number."
  {:db/ident           :http/statusCodeNumber,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "The status code number."},
   :rdfs/domain        :http/StatusCode,
   :rdfs/isDefinedBy   "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Status code"},
   :rdfs/range         :xsd/int,
   :rdfs/subPropertyOf :dcterms/identifier})

(def statusCodeValue
  "The status code value of an HTTP response."
  {:db/ident         :http/statusCodeValue,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "The status code value of an HTTP response."},
   :rdfs/domain      :http/Response,
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Status code"},
   :rdfs/range       :rdfs/Literal})