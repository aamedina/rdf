(ns net.wikipunk.rdf.http-statusCodes
  "http://www.w3.org/2011/http-statusCodes#"
  {:dcat/downloadURL  "resources/http-statusCodes.rdf",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "http"    "http://www.w3.org/2011/http#",
                       "http-statusCodes"
                       "http://www.w3.org/2011/http-statusCodes#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "http-statusCodes",
   :rdfa/uri          "http://www.w3.org/2011/http-statusCodes#"})

(def Accepted
  "Accepted"
  {:db/ident         :http-statusCodes/Accepted,
   :http/statusCodeNumber 202,
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Accepted@en"})

(def BadGateway
  "Bad Gateway"
  {:db/ident         :http-statusCodes/BadGateway,
   :http/statusCodeNumber 502,
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Bad Gateway@en"})

(def BadRequest
  "Bad Request"
  {:db/ident         :http-statusCodes/BadRequest,
   :http/statusCodeNumber 400,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Bad Request@en"})

(def Conflict
  "Conflict"
  {:db/ident         :http-statusCodes/Conflict,
   :http/statusCodeNumber 409,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Conflict@en"})

(def Continue
  "Continue"
  {:db/ident         :http-statusCodes/Continue,
   :http/statusCodeNumber 100,
   :rdf/type         [:http-statusCodes/StatusCode1xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Continue@en"})

(def Created
  "Created"
  {:db/ident         :http-statusCodes/Created,
   :http/statusCodeNumber 201,
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Created@en"})

(def ExpectationFailed
  "Expectation Failed"
  {:db/ident         :http-statusCodes/ExpectationFailed,
   :http/statusCodeNumber 417,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Expectation Failed@en"})

(def FailedDependency
  "Failed Dependency"
  {:db/ident         :http-statusCodes/FailedDependency,
   :http/statusCodeNumber 424,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc4918.txt",
   :rdfs/label       #voc/lstr "Failed Dependency@en"})

(def Forbidden
  "Forbidden"
  {:db/ident         :http-statusCodes/Forbidden,
   :http/statusCodeNumber 403,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Forbidden@en"})

(def Found
  "Found"
  {:db/ident         :http-statusCodes/Found,
   :http/statusCodeNumber 302,
   :rdf/type         [:http-statusCodes/StatusCode3xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Found@en"})

(def GatewayTimeout
  "Gateway Timeout"
  {:db/ident         :http-statusCodes/GatewayTimeout,
   :http/statusCodeNumber 504,
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Gateway Timeout@en"})

(def Gone
  "Gone"
  {:db/ident         :http-statusCodes/Gone,
   :http/statusCodeNumber 410,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Gone@en"})

(def HTTPVersionNotSupported
  "HTTP Version Not Supported"
  {:db/ident         :http-statusCodes/HTTPVersionNotSupported,
   :http/statusCodeNumber 505,
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "HTTP Version Not Supported@en"})

(def IMUsed
  "IM Used"
  {:db/ident         :http-statusCodes/IMUsed,
   :http/statusCodeNumber 226,
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc3229.txt",
   :rdfs/label       #voc/lstr "IM Used@en"})

(def InsufficientStorage
  "Insufficient Storage"
  {:db/ident         :http-statusCodes/InsufficientStorage,
   :http/statusCodeNumber 507,
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc4918.txt",
   :rdfs/label       #voc/lstr "Insufficient Storage@en"})

(def InternalServerError
  "Internal Server Error"
  {:db/ident         :http-statusCodes/InternalServerError,
   :http/statusCodeNumber 500,
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Internal Server Error@en"})

(def LengthRequired
  "Length Required"
  {:db/ident         :http-statusCodes/LengthRequired,
   :http/statusCodeNumber 411,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Length Required@en"})

(def Locked
  "Locked"
  {:db/ident         :http-statusCodes/Locked,
   :http/statusCodeNumber 423,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc4918.txt",
   :rdfs/label       #voc/lstr "Locked@en"})

(def MethodNotAllowed
  "Method Not Allowed"
  {:db/ident         :http-statusCodes/MethodNotAllowed,
   :http/statusCodeNumber 405,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Method Not Allowed@en"})

(def MovedPermanently
  "Moved Permanently"
  {:db/ident         :http-statusCodes/MovedPermanently,
   :http/statusCodeNumber 301,
   :rdf/type         [:http-statusCodes/StatusCode3xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Moved Permanently@en"})

(def MultiStatus
  "Multi-Status"
  {:db/ident         :http-statusCodes/MultiStatus,
   :http/statusCodeNumber 207,
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc4918.txt",
   :rdfs/label       #voc/lstr "Multi-Status@en"})

(def MultipleChoices
  "Multiple Choices"
  {:db/ident         :http-statusCodes/MultipleChoices,
   :http/statusCodeNumber 300,
   :rdf/type         [:http-statusCodes/StatusCode3xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Multiple Choices@en"})

(def NoContent
  "No Content"
  {:db/ident         :http-statusCodes/NoContent,
   :http/statusCodeNumber 204,
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "No Content@en"})

(def NonAuthoritativeInformation
  "Non-Authoritative Information"
  {:db/ident         :http-statusCodes/NonAuthoritativeInformation,
   :http/statusCodeNumber 203,
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Non-Authoritative Information@en"})

(def NotAcceptable
  "Not Acceptable"
  {:db/ident         :http-statusCodes/NotAcceptable,
   :http/statusCodeNumber 406,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Not Acceptable@en"})

(def NotExtended
  "Not Extended"
  {:db/ident         :http-statusCodes/NotExtended,
   :http/statusCodeNumber 510,
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2774.txt",
   :rdfs/label       #voc/lstr "Not Extended@en"})

(def NotFound
  "Not Found"
  {:db/ident         :http-statusCodes/NotFound,
   :http/statusCodeNumber 404,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Not Found@en"})

(def NotImplemented
  "Not Implemented"
  {:db/ident         :http-statusCodes/NotImplemented,
   :http/statusCodeNumber 501,
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Not Implemented@en"})

(def NotModified
  "Not Modified"
  {:db/ident         :http-statusCodes/NotModified,
   :http/statusCodeNumber 304,
   :rdf/type         [:http-statusCodes/StatusCode3xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Not Modified@en"})

(def OK
  "OK"
  {:db/ident         :http-statusCodes/OK,
   :http/statusCodeNumber 200,
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "OK@en"})

(def PartialContent
  "Partial Content"
  {:db/ident         :http-statusCodes/PartialContent,
   :http/statusCodeNumber 206,
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Partial Content@en"})

(def PaymentRequired
  "Payment Required"
  {:db/ident         :http-statusCodes/PaymentRequired,
   :http/statusCodeNumber 402,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Payment Required@en"})

(def PreconditionFailed
  "Precondition Failed"
  {:db/ident         :http-statusCodes/PreconditionFailed,
   :http/statusCodeNumber 412,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Precondition Failed@en"})

(def Processing
  "Processing"
  {:db/ident         :http-statusCodes/Processing,
   :http/statusCodeNumber 102,
   :rdf/type         [:http-statusCodes/StatusCode1xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2518.txt",
   :rdfs/label       #voc/lstr "Processing@en"})

(def ProxyAuthenticationRequired
  "Proxy Authentication Required"
  {:db/ident         :http-statusCodes/ProxyAuthenticationRequired,
   :http/statusCodeNumber 407,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Proxy Authentication Required@en"})

(def RequestEntityTooLarge
  "Request Entity Too Large"
  {:db/ident         :http-statusCodes/RequestEntityTooLarge,
   :http/statusCodeNumber 413,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Request Entity Too Large@en"})

(def RequestTimeout
  "Request Timeout"
  {:db/ident         :http-statusCodes/RequestTimeout,
   :http/statusCodeNumber 408,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Request Timeout@en"})

(def RequestURITooLong
  "Request-URI Too Long"
  {:db/ident         :http-statusCodes/RequestURITooLong,
   :http/statusCodeNumber 414,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Request-URI Too Long@en"})

(def RequestedRangeNotSatisfiable
  "Requested Range Not Satisfiable"
  {:db/ident         :http-statusCodes/RequestedRangeNotSatisfiable,
   :http/statusCodeNumber 416,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Requested Range Not Satisfiable@en"})

(def Reserved
  "(Reserved)"
  {:db/ident         :http-statusCodes/Reserved,
   :http/statusCodeNumber 306,
   :rdf/type         [:http-statusCodes/StatusCode3xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "(Reserved)@en"})

(def ResetContent
  "Reset Content"
  {:db/ident         :http-statusCodes/ResetContent,
   :http/statusCodeNumber 205,
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Reset Content@en"})

(def SeeOther
  "See Other"
  {:db/ident         :http-statusCodes/SeeOther,
   :http/statusCodeNumber 303,
   :rdf/type         [:http-statusCodes/StatusCode3xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "See Other@en"})

(def ServiceUnavailable
  "Service Unavailable"
  {:db/ident         :http-statusCodes/ServiceUnavailable,
   :http/statusCodeNumber 503,
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Service Unavailable@en"})

(def StatusCode1xx
  "A status code starting with 1"
  {:db/ident        :http-statusCodes/StatusCode1xx,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #voc/lstr "A status code starting with 1@en",
   :rdfs/label      #voc/lstr "Informational@en",
   :rdfs/subClassOf :rdfs/Resource})

(def StatusCode2xx
  "A status code starting with 2"
  {:db/ident        :http-statusCodes/StatusCode2xx,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #voc/lstr "A status code starting with 2@en",
   :rdfs/label      #voc/lstr "Successful@en",
   :rdfs/subClassOf :rdfs/Resource})

(def StatusCode3xx
  "A status code starting with 3"
  {:db/ident        :http-statusCodes/StatusCode3xx,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #voc/lstr "A status code starting with 3@en",
   :rdfs/label      #voc/lstr "Redirection@en",
   :rdfs/subClassOf :rdfs/Resource})

(def StatusCode4xx
  "A status code starting with 4"
  {:db/ident        :http-statusCodes/StatusCode4xx,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #voc/lstr "A status code starting with 4@en",
   :rdfs/label      #voc/lstr "Client Error@en",
   :rdfs/subClassOf :rdfs/Resource})

(def StatusCode5xx
  "A status code starting with 5"
  {:db/ident        :http-statusCodes/StatusCode5xx,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #voc/lstr "A status code starting with 5@en",
   :rdfs/label      #voc/lstr "Server Error@en",
   :rdfs/subClassOf :rdfs/Resource})

(def SwitchingProtocols
  "Switching Protocols"
  {:db/ident         :http-statusCodes/SwitchingProtocols,
   :http/statusCodeNumber 101,
   :rdf/type         [:http-statusCodes/StatusCode1xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Switching Protocols@en"})

(def TemporaryRedirect
  "Temporary Redirect"
  {:db/ident         :http-statusCodes/TemporaryRedirect,
   :http/statusCodeNumber 307,
   :rdf/type         [:http-statusCodes/StatusCode3xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Temporary Redirect@en"})

(def Unauthorized
  "Unauthorized"
  {:db/ident         :http-statusCodes/Unauthorized,
   :http/statusCodeNumber 401,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Unauthorized@en"})

(def UnprocessableEntity
  "Unprocessable Entity"
  {:db/ident         :http-statusCodes/UnprocessableEntity,
   :http/statusCodeNumber 422,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc4918.txt",
   :rdfs/label       #voc/lstr "Unprocessable Entity@en"})

(def UnsupportedMediaType
  "Unsupported Media Type"
  {:db/ident         :http-statusCodes/UnsupportedMediaType,
   :http/statusCodeNumber 415,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Unsupported Media Type@en"})

(def UpgradeRequired
  "Upgrade Required"
  {:db/ident         :http-statusCodes/UpgradeRequired,
   :http/statusCodeNumber 426,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2817.txt",
   :rdfs/label       #voc/lstr "Upgrade Required@en"})

(def UseProxy
  "Use Proxy"
  {:db/ident         :http-statusCodes/UseProxy,
   :http/statusCodeNumber 305,
   :rdf/type         [:http-statusCodes/StatusCode3xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt",
   :rdfs/label       #voc/lstr "Use Proxy@en"})

(def VariantAlsoNegotiates
  "Variant Also Negotiates (Experimental)"
  {:db/ident         :http-statusCodes/VariantAlsoNegotiates,
   :http/statusCodeNumber 506,
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2295.txt",
   :rdfs/label       #voc/lstr "Variant Also Negotiates (Experimental)@en"})