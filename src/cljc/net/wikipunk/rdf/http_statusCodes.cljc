(ns net.wikipunk.rdf.http-statusCodes
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
   :http/statusCodeNumber #xsd/int 202,
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Accepted@en"})

(def BadGateway
  "Bad Gateway"
  {:db/ident         :http-statusCodes/BadGateway,
   :http/statusCodeNumber #xsd/int 502,
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Bad Gateway@en"})

(def BadRequest
  "Bad Request"
  {:db/ident         :http-statusCodes/BadRequest,
   :http/statusCodeNumber #xsd/int 400,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Bad Request@en"})

(def Conflict
  "Conflict"
  {:db/ident         :http-statusCodes/Conflict,
   :http/statusCodeNumber #xsd/int 409,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Conflict@en"})

(def Continue
  "Continue"
  {:db/ident         :http-statusCodes/Continue,
   :http/statusCodeNumber #xsd/int 100,
   :rdf/type         [:http-statusCodes/StatusCode1xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Continue@en"})

(def Created
  "Created"
  {:db/ident         :http-statusCodes/Created,
   :http/statusCodeNumber #xsd/int 201,
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Created@en"})

(def ExpectationFailed
  "Expectation Failed"
  {:db/ident         :http-statusCodes/ExpectationFailed,
   :http/statusCodeNumber #xsd/int 417,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Expectation Failed@en"})

(def FailedDependency
  "Failed Dependency"
  {:db/ident         :http-statusCodes/FailedDependency,
   :http/statusCodeNumber #xsd/int 424,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc4918.txt"},
   :rdfs/label       #xsd/langString "Failed Dependency@en"})

(def Forbidden
  "Forbidden"
  {:db/ident         :http-statusCodes/Forbidden,
   :http/statusCodeNumber #xsd/int 403,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Forbidden@en"})

(def Found
  "Found"
  {:db/ident         :http-statusCodes/Found,
   :http/statusCodeNumber #xsd/int 302,
   :rdf/type         [:http-statusCodes/StatusCode3xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Found@en"})

(def GatewayTimeout
  "Gateway Timeout"
  {:db/ident         :http-statusCodes/GatewayTimeout,
   :http/statusCodeNumber #xsd/int 504,
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Gateway Timeout@en"})

(def Gone
  "Gone"
  {:db/ident         :http-statusCodes/Gone,
   :http/statusCodeNumber #xsd/int 410,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Gone@en"})

(def HTTPVersionNotSupported
  "HTTP Version Not Supported"
  {:db/ident         :http-statusCodes/HTTPVersionNotSupported,
   :http/statusCodeNumber #xsd/int 505,
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "HTTP Version Not Supported@en"})

(def IMUsed
  "IM Used"
  {:db/ident         :http-statusCodes/IMUsed,
   :http/statusCodeNumber #xsd/int 226,
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc3229.txt"},
   :rdfs/label       #xsd/langString "IM Used@en"})

(def InsufficientStorage
  "Insufficient Storage"
  {:db/ident         :http-statusCodes/InsufficientStorage,
   :http/statusCodeNumber #xsd/int 507,
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc4918.txt"},
   :rdfs/label       #xsd/langString "Insufficient Storage@en"})

(def InternalServerError
  "Internal Server Error"
  {:db/ident         :http-statusCodes/InternalServerError,
   :http/statusCodeNumber #xsd/int 500,
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Internal Server Error@en"})

(def LengthRequired
  "Length Required"
  {:db/ident         :http-statusCodes/LengthRequired,
   :http/statusCodeNumber #xsd/int 411,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Length Required@en"})

(def Locked
  "Locked"
  {:db/ident         :http-statusCodes/Locked,
   :http/statusCodeNumber #xsd/int 423,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc4918.txt"},
   :rdfs/label       #xsd/langString "Locked@en"})

(def MethodNotAllowed
  "Method Not Allowed"
  {:db/ident         :http-statusCodes/MethodNotAllowed,
   :http/statusCodeNumber #xsd/int 405,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Method Not Allowed@en"})

(def MovedPermanently
  "Moved Permanently"
  {:db/ident         :http-statusCodes/MovedPermanently,
   :http/statusCodeNumber #xsd/int 301,
   :rdf/type         [:http-statusCodes/StatusCode3xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Moved Permanently@en"})

(def MultiStatus
  "Multi-Status"
  {:db/ident         :http-statusCodes/MultiStatus,
   :http/statusCodeNumber #xsd/int 207,
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc4918.txt"},
   :rdfs/label       #xsd/langString "Multi-Status@en"})

(def MultipleChoices
  "Multiple Choices"
  {:db/ident         :http-statusCodes/MultipleChoices,
   :http/statusCodeNumber #xsd/int 300,
   :rdf/type         [:http-statusCodes/StatusCode3xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Multiple Choices@en"})

(def NoContent
  "No Content"
  {:db/ident         :http-statusCodes/NoContent,
   :http/statusCodeNumber #xsd/int 204,
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "No Content@en"})

(def NonAuthoritativeInformation
  "Non-Authoritative Information"
  {:db/ident         :http-statusCodes/NonAuthoritativeInformation,
   :http/statusCodeNumber #xsd/int 203,
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Non-Authoritative Information@en"})

(def NotAcceptable
  "Not Acceptable"
  {:db/ident         :http-statusCodes/NotAcceptable,
   :http/statusCodeNumber #xsd/int 406,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Not Acceptable@en"})

(def NotExtended
  "Not Extended"
  {:db/ident         :http-statusCodes/NotExtended,
   :http/statusCodeNumber #xsd/int 510,
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2774.txt"},
   :rdfs/label       #xsd/langString "Not Extended@en"})

(def NotFound
  "Not Found"
  {:db/ident         :http-statusCodes/NotFound,
   :http/statusCodeNumber #xsd/int 404,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Not Found@en"})

(def NotImplemented
  "Not Implemented"
  {:db/ident         :http-statusCodes/NotImplemented,
   :http/statusCodeNumber #xsd/int 501,
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Not Implemented@en"})

(def NotModified
  "Not Modified"
  {:db/ident         :http-statusCodes/NotModified,
   :http/statusCodeNumber #xsd/int 304,
   :rdf/type         [:http-statusCodes/StatusCode3xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Not Modified@en"})

(def OK
  "OK"
  {:db/ident         :http-statusCodes/OK,
   :http/statusCodeNumber #xsd/int 200,
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "OK@en"})

(def PartialContent
  "Partial Content"
  {:db/ident         :http-statusCodes/PartialContent,
   :http/statusCodeNumber #xsd/int 206,
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Partial Content@en"})

(def PaymentRequired
  "Payment Required"
  {:db/ident         :http-statusCodes/PaymentRequired,
   :http/statusCodeNumber #xsd/int 402,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Payment Required@en"})

(def PreconditionFailed
  "Precondition Failed"
  {:db/ident         :http-statusCodes/PreconditionFailed,
   :http/statusCodeNumber #xsd/int 412,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Precondition Failed@en"})

(def Processing
  "Processing"
  {:db/ident         :http-statusCodes/Processing,
   :http/statusCodeNumber #xsd/int 102,
   :rdf/type         [:http-statusCodes/StatusCode1xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2518.txt"},
   :rdfs/label       #xsd/langString "Processing@en"})

(def ProxyAuthenticationRequired
  "Proxy Authentication Required"
  {:db/ident         :http-statusCodes/ProxyAuthenticationRequired,
   :http/statusCodeNumber #xsd/int 407,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Proxy Authentication Required@en"})

(def RequestEntityTooLarge
  "Request Entity Too Large"
  {:db/ident         :http-statusCodes/RequestEntityTooLarge,
   :http/statusCodeNumber #xsd/int 413,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Request Entity Too Large@en"})

(def RequestTimeout
  "Request Timeout"
  {:db/ident         :http-statusCodes/RequestTimeout,
   :http/statusCodeNumber #xsd/int 408,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Request Timeout@en"})

(def RequestURITooLong
  "Request-URI Too Long"
  {:db/ident         :http-statusCodes/RequestURITooLong,
   :http/statusCodeNumber #xsd/int 414,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Request-URI Too Long@en"})

(def RequestedRangeNotSatisfiable
  "Requested Range Not Satisfiable"
  {:db/ident         :http-statusCodes/RequestedRangeNotSatisfiable,
   :http/statusCodeNumber #xsd/int 416,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Requested Range Not Satisfiable@en"})

(def Reserved
  "(Reserved)"
  {:db/ident         :http-statusCodes/Reserved,
   :http/statusCodeNumber #xsd/int 306,
   :rdf/type         [:http-statusCodes/StatusCode3xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "(Reserved)@en"})

(def ResetContent
  "Reset Content"
  {:db/ident         :http-statusCodes/ResetContent,
   :http/statusCodeNumber #xsd/int 205,
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Reset Content@en"})

(def SeeOther
  "See Other"
  {:db/ident         :http-statusCodes/SeeOther,
   :http/statusCodeNumber #xsd/int 303,
   :rdf/type         [:http-statusCodes/StatusCode3xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "See Other@en"})

(def ServiceUnavailable
  "Service Unavailable"
  {:db/ident         :http-statusCodes/ServiceUnavailable,
   :http/statusCodeNumber #xsd/int 503,
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Service Unavailable@en"})

(def StatusCode1xx
  "A status code starting with 1"
  {:db/ident        :http-statusCodes/StatusCode1xx,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/langString "A status code starting with 1@en",
   :rdfs/label      #xsd/langString "Informational@en",
   :rdfs/subClassOf :rdfs/Resource})

(def StatusCode2xx
  "A status code starting with 2"
  {:db/ident        :http-statusCodes/StatusCode2xx,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/langString "A status code starting with 2@en",
   :rdfs/label      #xsd/langString "Successful@en",
   :rdfs/subClassOf :rdfs/Resource})

(def StatusCode3xx
  "A status code starting with 3"
  {:db/ident        :http-statusCodes/StatusCode3xx,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/langString "A status code starting with 3@en",
   :rdfs/label      #xsd/langString "Redirection@en",
   :rdfs/subClassOf :rdfs/Resource})

(def StatusCode4xx
  "A status code starting with 4"
  {:db/ident        :http-statusCodes/StatusCode4xx,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/langString "A status code starting with 4@en",
   :rdfs/label      #xsd/langString "Client Error@en",
   :rdfs/subClassOf :rdfs/Resource})

(def StatusCode5xx
  "A status code starting with 5"
  {:db/ident        :http-statusCodes/StatusCode5xx,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/langString "A status code starting with 5@en",
   :rdfs/label      #xsd/langString "Server Error@en",
   :rdfs/subClassOf :rdfs/Resource})

(def SwitchingProtocols
  "Switching Protocols"
  {:db/ident         :http-statusCodes/SwitchingProtocols,
   :http/statusCodeNumber #xsd/int 101,
   :rdf/type         [:http-statusCodes/StatusCode1xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Switching Protocols@en"})

(def TemporaryRedirect
  "Temporary Redirect"
  {:db/ident         :http-statusCodes/TemporaryRedirect,
   :http/statusCodeNumber #xsd/int 307,
   :rdf/type         [:http-statusCodes/StatusCode3xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Temporary Redirect@en"})

(def Unauthorized
  "Unauthorized"
  {:db/ident         :http-statusCodes/Unauthorized,
   :http/statusCodeNumber #xsd/int 401,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Unauthorized@en"})

(def UnprocessableEntity
  "Unprocessable Entity"
  {:db/ident         :http-statusCodes/UnprocessableEntity,
   :http/statusCodeNumber #xsd/int 422,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc4918.txt"},
   :rdfs/label       #xsd/langString "Unprocessable Entity@en"})

(def UnsupportedMediaType
  "Unsupported Media Type"
  {:db/ident         :http-statusCodes/UnsupportedMediaType,
   :http/statusCodeNumber #xsd/int 415,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Unsupported Media Type@en"})

(def UpgradeRequired
  "Upgrade Required"
  {:db/ident         :http-statusCodes/UpgradeRequired,
   :http/statusCodeNumber #xsd/int 426,
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2817.txt"},
   :rdfs/label       #xsd/langString "Upgrade Required@en"})

(def UseProxy
  "Use Proxy"
  {:db/ident         :http-statusCodes/UseProxy,
   :http/statusCodeNumber #xsd/int 305,
   :rdf/type         [:http-statusCodes/StatusCode3xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2616.txt"},
   :rdfs/label       #xsd/langString "Use Proxy@en"})

(def VariantAlsoNegotiates
  "Variant Also Negotiates (Experimental)"
  {:db/ident         :http-statusCodes/VariantAlsoNegotiates,
   :http/statusCodeNumber #xsd/int 506,
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.ietf.org/rfc/rfc2295.txt"},
   :rdfs/label       #xsd/langString
                      "Variant Also Negotiates (Experimental)@en"})