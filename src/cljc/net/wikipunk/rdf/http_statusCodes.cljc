(ns net.wikipunk.rdf.http-statusCodes
  {:dcat/downloadURL "net/wikipunk/ext/http-statusCodes.rdf",
   :namespaces       {"dcterms" "http://purl.org/dc/terms/",
                      "http"    "http://www.w3.org/2011/http#",
                      "http-statusCodes"
                      "http://www.w3.org/2011/http-statusCodes#",
                      "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                      "rdfs"    "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type         :owl/Ontology,
   :rdfa/prefix      "http-statusCodes",
   :rdfa/uri         "http://www.w3.org/2011/http-statusCodes#"})

(def Accepted
  {:db/ident         :http-statusCodes/Accepted,
   :http/statusCodeNumber 202,
   :rdf/type         #{:http-statusCodes/StatusCode2xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Accepted"}})

(def BadGateway
  {:db/ident         :http-statusCodes/BadGateway,
   :http/statusCodeNumber 502,
   :rdf/type         #{:http-statusCodes/StatusCode5xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Bad Gateway"}})

(def BadRequest
  {:db/ident         :http-statusCodes/BadRequest,
   :http/statusCodeNumber 400,
   :rdf/type         #{:http-statusCodes/StatusCode4xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Bad Request"}})

(def Conflict
  {:db/ident         :http-statusCodes/Conflict,
   :http/statusCodeNumber 409,
   :rdf/type         #{:http-statusCodes/StatusCode4xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Conflict"}})

(def Continue
  {:db/ident         :http-statusCodes/Continue,
   :http/statusCodeNumber 100,
   :rdf/type         #{:http-statusCodes/StatusCode1xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Continue"}})

(def Created
  {:db/ident         :http-statusCodes/Created,
   :http/statusCodeNumber 201,
   :rdf/type         #{:http-statusCodes/StatusCode2xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Created"}})

(def ExpectationFailed
  {:db/ident         :http-statusCodes/ExpectationFailed,
   :http/statusCodeNumber 417,
   :rdf/type         #{:http-statusCodes/StatusCode4xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Expectation Failed"}})

(def FailedDependency
  {:db/ident         :http-statusCodes/FailedDependency,
   :http/statusCodeNumber 424,
   :rdf/type         #{:http-statusCodes/StatusCode4xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc4918.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Failed Dependency"}})

(def Forbidden
  {:db/ident         :http-statusCodes/Forbidden,
   :http/statusCodeNumber 403,
   :rdf/type         #{:http-statusCodes/StatusCode4xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Forbidden"}})

(def Found
  {:db/ident         :http-statusCodes/Found,
   :http/statusCodeNumber 302,
   :rdf/type         #{:http-statusCodes/StatusCode3xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Found"}})

(def GatewayTimeout
  {:db/ident         :http-statusCodes/GatewayTimeout,
   :http/statusCodeNumber 504,
   :rdf/type         #{:http-statusCodes/StatusCode5xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Gateway Timeout"}})

(def Gone
  {:db/ident         :http-statusCodes/Gone,
   :http/statusCodeNumber 410,
   :rdf/type         #{:http-statusCodes/StatusCode4xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Gone"}})

(def HTTPVersionNotSupported
  {:db/ident         :http-statusCodes/HTTPVersionNotSupported,
   :http/statusCodeNumber 505,
   :rdf/type         #{:http-statusCodes/StatusCode5xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "HTTP Version Not Supported"}})

(def IMUsed
  {:db/ident         :http-statusCodes/IMUsed,
   :http/statusCodeNumber 226,
   :rdf/type         #{:http-statusCodes/StatusCode2xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc3229.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "IM Used"}})

(def InsufficientStorage
  {:db/ident         :http-statusCodes/InsufficientStorage,
   :http/statusCodeNumber 507,
   :rdf/type         #{:http-statusCodes/StatusCode5xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc4918.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Insufficient Storage"}})

(def InternalServerError
  {:db/ident         :http-statusCodes/InternalServerError,
   :http/statusCodeNumber 500,
   :rdf/type         #{:http-statusCodes/StatusCode5xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Internal Server Error"}})

(def LengthRequired
  {:db/ident         :http-statusCodes/LengthRequired,
   :http/statusCodeNumber 411,
   :rdf/type         #{:http-statusCodes/StatusCode4xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Length Required"}})

(def Locked
  {:db/ident         :http-statusCodes/Locked,
   :http/statusCodeNumber 423,
   :rdf/type         #{:http-statusCodes/StatusCode4xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc4918.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Locked"}})

(def MethodNotAllowed
  {:db/ident         :http-statusCodes/MethodNotAllowed,
   :http/statusCodeNumber 405,
   :rdf/type         #{:http-statusCodes/StatusCode4xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Method Not Allowed"}})

(def MovedPermanently
  {:db/ident         :http-statusCodes/MovedPermanently,
   :http/statusCodeNumber 301,
   :rdf/type         #{:http-statusCodes/StatusCode3xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Moved Permanently"}})

(def MultiStatus
  {:db/ident         :http-statusCodes/MultiStatus,
   :http/statusCodeNumber 207,
   :rdf/type         #{:http-statusCodes/StatusCode2xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc4918.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Multi-Status"}})

(def MultipleChoices
  {:db/ident         :http-statusCodes/MultipleChoices,
   :http/statusCodeNumber 300,
   :rdf/type         #{:http-statusCodes/StatusCode3xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Multiple Choices"}})

(def NoContent
  {:db/ident         :http-statusCodes/NoContent,
   :http/statusCodeNumber 204,
   :rdf/type         #{:http-statusCodes/StatusCode2xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "No Content"}})

(def NonAuthoritativeInformation
  {:db/ident         :http-statusCodes/NonAuthoritativeInformation,
   :http/statusCodeNumber 203,
   :rdf/type         #{:http-statusCodes/StatusCode2xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Non-Authoritative Information"}})

(def NotAcceptable
  {:db/ident         :http-statusCodes/NotAcceptable,
   :http/statusCodeNumber 406,
   :rdf/type         #{:http-statusCodes/StatusCode4xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Not Acceptable"}})

(def NotExtended
  {:db/ident         :http-statusCodes/NotExtended,
   :http/statusCodeNumber 510,
   :rdf/type         #{:http-statusCodes/StatusCode5xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2774.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Not Extended"}})

(def NotFound
  {:db/ident         :http-statusCodes/NotFound,
   :http/statusCodeNumber 404,
   :rdf/type         #{:http-statusCodes/StatusCode4xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Not Found"}})

(def NotImplemented
  {:db/ident         :http-statusCodes/NotImplemented,
   :http/statusCodeNumber 501,
   :rdf/type         #{:http-statusCodes/StatusCode5xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Not Implemented"}})

(def NotModified
  {:db/ident         :http-statusCodes/NotModified,
   :http/statusCodeNumber 304,
   :rdf/type         #{:http-statusCodes/StatusCode3xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Not Modified"}})

(def OK
  {:db/ident         :http-statusCodes/OK,
   :http/statusCodeNumber 200,
   :rdf/type         #{:http-statusCodes/StatusCode2xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "OK"}})

(def PartialContent
  {:db/ident         :http-statusCodes/PartialContent,
   :http/statusCodeNumber 206,
   :rdf/type         #{:http-statusCodes/StatusCode2xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Partial Content"}})

(def PaymentRequired
  {:db/ident         :http-statusCodes/PaymentRequired,
   :http/statusCodeNumber 402,
   :rdf/type         #{:http-statusCodes/StatusCode4xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Payment Required"}})

(def PreconditionFailed
  {:db/ident         :http-statusCodes/PreconditionFailed,
   :http/statusCodeNumber 412,
   :rdf/type         #{:http-statusCodes/StatusCode4xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Precondition Failed"}})

(def Processing
  {:db/ident         :http-statusCodes/Processing,
   :http/statusCodeNumber 102,
   :rdf/type         #{:http-statusCodes/StatusCode1xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2518.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Processing"}})

(def ProxyAuthenticationRequired
  {:db/ident         :http-statusCodes/ProxyAuthenticationRequired,
   :http/statusCodeNumber 407,
   :rdf/type         #{:http-statusCodes/StatusCode4xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Proxy Authentication Required"}})

(def RequestEntityTooLarge
  {:db/ident         :http-statusCodes/RequestEntityTooLarge,
   :http/statusCodeNumber 413,
   :rdf/type         #{:http-statusCodes/StatusCode4xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Request Entity Too Large"}})

(def RequestTimeout
  {:db/ident         :http-statusCodes/RequestTimeout,
   :http/statusCodeNumber 408,
   :rdf/type         #{:http-statusCodes/StatusCode4xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Request Timeout"}})

(def RequestURITooLong
  {:db/ident         :http-statusCodes/RequestURITooLong,
   :http/statusCodeNumber 414,
   :rdf/type         #{:http-statusCodes/StatusCode4xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Request-URI Too Long"}})

(def RequestedRangeNotSatisfiable
  {:db/ident         :http-statusCodes/RequestedRangeNotSatisfiable,
   :http/statusCodeNumber 416,
   :rdf/type         #{:http-statusCodes/StatusCode4xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Requested Range Not Satisfiable"}})

(def Reserved
  {:db/ident         :http-statusCodes/Reserved,
   :http/statusCodeNumber 306,
   :rdf/type         #{:http-statusCodes/StatusCode3xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "(Reserved)"}})

(def ResetContent
  {:db/ident         :http-statusCodes/ResetContent,
   :http/statusCodeNumber 205,
   :rdf/type         #{:http-statusCodes/StatusCode2xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Reset Content"}})

(def SeeOther
  {:db/ident         :http-statusCodes/SeeOther,
   :http/statusCodeNumber 303,
   :rdf/type         #{:http-statusCodes/StatusCode3xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "See Other"}})

(def ServiceUnavailable
  {:db/ident         :http-statusCodes/ServiceUnavailable,
   :http/statusCodeNumber 503,
   :rdf/type         #{:http-statusCodes/StatusCode5xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Service Unavailable"}})

(def StatusCode1xx
  {:db/ident     :http-statusCodes/StatusCode1xx,
   :rdf/type     :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A status code starting with 1"},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Informational"}})

(def StatusCode2xx
  {:db/ident     :http-statusCodes/StatusCode2xx,
   :rdf/type     :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A status code starting with 2"},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Successful"}})

(def StatusCode3xx
  {:db/ident     :http-statusCodes/StatusCode3xx,
   :rdf/type     :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A status code starting with 3"},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Redirection"}})

(def StatusCode4xx
  {:db/ident     :http-statusCodes/StatusCode4xx,
   :rdf/type     :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A status code starting with 4"},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Client Error"}})

(def StatusCode5xx
  {:db/ident     :http-statusCodes/StatusCode5xx,
   :rdf/type     :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A status code starting with 5"},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Server Error"}})

(def SwitchingProtocols
  {:db/ident         :http-statusCodes/SwitchingProtocols,
   :http/statusCodeNumber 101,
   :rdf/type         #{:http-statusCodes/StatusCode1xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Switching Protocols"}})

(def TemporaryRedirect
  {:db/ident         :http-statusCodes/TemporaryRedirect,
   :http/statusCodeNumber 307,
   :rdf/type         #{:http-statusCodes/StatusCode3xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Temporary Redirect"}})

(def Unauthorized
  {:db/ident         :http-statusCodes/Unauthorized,
   :http/statusCodeNumber 401,
   :rdf/type         #{:http-statusCodes/StatusCode4xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Unauthorized"}})

(def UnprocessableEntity
  {:db/ident         :http-statusCodes/UnprocessableEntity,
   :http/statusCodeNumber 422,
   :rdf/type         #{:http-statusCodes/StatusCode4xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc4918.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Unprocessable Entity"}})

(def UnsupportedMediaType
  {:db/ident         :http-statusCodes/UnsupportedMediaType,
   :http/statusCodeNumber 415,
   :rdf/type         #{:http-statusCodes/StatusCode4xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Unsupported Media Type"}})

(def UpgradeRequired
  {:db/ident         :http-statusCodes/UpgradeRequired,
   :http/statusCodeNumber 426,
   :rdf/type         #{:http-statusCodes/StatusCode4xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2817.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Upgrade Required"}})

(def UseProxy
  {:db/ident         :http-statusCodes/UseProxy,
   :http/statusCodeNumber 305,
   :rdf/type         #{:http-statusCodes/StatusCode3xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Use Proxy"}})

(def VariantAlsoNegotiates
  {:db/ident         :http-statusCodes/VariantAlsoNegotiates,
   :http/statusCodeNumber 506,
   :rdf/type         #{:http-statusCodes/StatusCode5xx :http/StatusCode},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.ietf.org/rfc/rfc2295.txt"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Variant Also Negotiates (Experimental)"}})