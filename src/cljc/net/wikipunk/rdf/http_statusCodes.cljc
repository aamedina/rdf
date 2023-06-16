(ns net.wikipunk.rdf.http-statusCodes
  "Delta encoding in HTTP"
  {:dcat/downloadURL   "resources/http-statusCodes.rdf",
   :dcterms/identifier "http://www.ietf.org/rfc/rfc3229.txt",
   :dcterms/title      #voc/lstr "Delta encoding in HTTP@en",
   :rdf/ns-prefix-map  {"dcterms" "http://purl.org/dc/terms/",
                        "http"    "http://www.w3.org/2011/http#",
                        "http-statusCodes"
                        "http://www.w3.org/2011/http-statusCodes#",
                        "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                        "rdfs"    "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type           :rdfa/PrefixMapping,
   :rdfa/prefix        "http-statusCodes",
   :rdfa/uri           "http://www.ietf.org/rfc/rfc3229.txt"})

(def Accepted
  {:db/ident         :http-statusCodes/Accepted,
   :dcterms/title    #voc/lstr "Accepted@en",
   :http/statusCodeNumber "202",
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def BadGateway
  {:db/ident         :http-statusCodes/BadGateway,
   :dcterms/title    #voc/lstr "Bad Gateway@en",
   :http/statusCodeNumber "502",
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def BadRequest
  {:db/ident         :http-statusCodes/BadRequest,
   :dcterms/title    #voc/lstr "Bad Request@en",
   :http/statusCodeNumber "400",
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def Conflict
  {:db/ident         :http-statusCodes/Conflict,
   :dcterms/title    #voc/lstr "Conflict@en",
   :http/statusCodeNumber "409",
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def Continue
  {:db/ident         :http-statusCodes/Continue,
   :dcterms/title    #voc/lstr "Continue@en",
   :http/statusCodeNumber "100",
   :rdf/type         [:http-statusCodes/StatusCode1xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def Created
  {:db/ident         :http-statusCodes/Created,
   :dcterms/title    #voc/lstr "Created@en",
   :http/statusCodeNumber "201",
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def ExpectationFailed
  {:db/ident         :http-statusCodes/ExpectationFailed,
   :dcterms/title    #voc/lstr "Expectation Failed@en",
   :http/statusCodeNumber "417",
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def FailedDependency
  {:db/ident         :http-statusCodes/FailedDependency,
   :dcterms/title    #voc/lstr "Failed Dependency@en",
   :http/statusCodeNumber "424",
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc4918.txt"})

(def Forbidden
  {:db/ident         :http-statusCodes/Forbidden,
   :dcterms/title    #voc/lstr "Forbidden@en",
   :http/statusCodeNumber "403",
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def Found
  {:db/ident         :http-statusCodes/Found,
   :dcterms/title    #voc/lstr "Found@en",
   :http/statusCodeNumber "302",
   :rdf/type         [:http-statusCodes/StatusCode3xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def GatewayTimeout
  {:db/ident         :http-statusCodes/GatewayTimeout,
   :dcterms/title    #voc/lstr "Gateway Timeout@en",
   :http/statusCodeNumber "504",
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def Gone
  {:db/ident         :http-statusCodes/Gone,
   :dcterms/title    #voc/lstr "Gone@en",
   :http/statusCodeNumber "410",
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def HTTPVersionNotSupported
  {:db/ident         :http-statusCodes/HTTPVersionNotSupported,
   :dcterms/title    #voc/lstr "HTTP Version Not Supported@en",
   :http/statusCodeNumber "505",
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def IMUsed
  {:db/ident         :http-statusCodes/IMUsed,
   :dcterms/title    #voc/lstr "IM Used@en",
   :http/statusCodeNumber "226",
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc3229.txt"})

(def InsufficientStorage
  {:db/ident         :http-statusCodes/InsufficientStorage,
   :dcterms/title    #voc/lstr "Insufficient Storage@en",
   :http/statusCodeNumber "507",
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc4918.txt"})

(def InternalServerError
  {:db/ident         :http-statusCodes/InternalServerError,
   :dcterms/title    #voc/lstr "Internal Server Error@en",
   :http/statusCodeNumber "500",
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def LengthRequired
  {:db/ident         :http-statusCodes/LengthRequired,
   :dcterms/title    #voc/lstr "Length Required@en",
   :http/statusCodeNumber "411",
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def Locked
  {:db/ident         :http-statusCodes/Locked,
   :dcterms/title    #voc/lstr "Locked@en",
   :http/statusCodeNumber "423",
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc4918.txt"})

(def MethodNotAllowed
  {:db/ident         :http-statusCodes/MethodNotAllowed,
   :dcterms/title    #voc/lstr "Method Not Allowed@en",
   :http/statusCodeNumber "405",
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def MovedPermanently
  {:db/ident         :http-statusCodes/MovedPermanently,
   :dcterms/title    #voc/lstr "Moved Permanently@en",
   :http/statusCodeNumber "301",
   :rdf/type         [:http-statusCodes/StatusCode3xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def MultiStatus
  {:db/ident         :http-statusCodes/MultiStatus,
   :dcterms/title    #voc/lstr "Multi-Status@en",
   :http/statusCodeNumber "207",
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc4918.txt"})

(def MultipleChoices
  {:db/ident         :http-statusCodes/MultipleChoices,
   :dcterms/title    #voc/lstr "Multiple Choices@en",
   :http/statusCodeNumber "300",
   :rdf/type         [:http-statusCodes/StatusCode3xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def NoContent
  {:db/ident         :http-statusCodes/NoContent,
   :dcterms/title    #voc/lstr "No Content@en",
   :http/statusCodeNumber "204",
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def NonAuthoritativeInformation
  {:db/ident         :http-statusCodes/NonAuthoritativeInformation,
   :dcterms/title    #voc/lstr "Non-Authoritative Information@en",
   :http/statusCodeNumber "203",
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def NotAcceptable
  {:db/ident         :http-statusCodes/NotAcceptable,
   :dcterms/title    #voc/lstr "Not Acceptable@en",
   :http/statusCodeNumber "406",
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def NotExtended
  {:db/ident         :http-statusCodes/NotExtended,
   :dcterms/title    #voc/lstr "Not Extended@en",
   :http/statusCodeNumber "510",
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2774.txt"})

(def NotFound
  {:db/ident         :http-statusCodes/NotFound,
   :dcterms/title    #voc/lstr "Not Found@en",
   :http/statusCodeNumber "404",
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def NotImplemented
  {:db/ident         :http-statusCodes/NotImplemented,
   :dcterms/title    #voc/lstr "Not Implemented@en",
   :http/statusCodeNumber "501",
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def NotModified
  {:db/ident         :http-statusCodes/NotModified,
   :dcterms/title    #voc/lstr "Not Modified@en",
   :http/statusCodeNumber "304",
   :rdf/type         [:http-statusCodes/StatusCode3xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def OK
  {:db/ident         :http-statusCodes/OK,
   :dcterms/title    #voc/lstr "OK@en",
   :http/statusCodeNumber "200",
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def PartialContent
  {:db/ident         :http-statusCodes/PartialContent,
   :dcterms/title    #voc/lstr "Partial Content@en",
   :http/statusCodeNumber "206",
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def PaymentRequired
  {:db/ident         :http-statusCodes/PaymentRequired,
   :dcterms/title    #voc/lstr "Payment Required@en",
   :http/statusCodeNumber "402",
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def PreconditionFailed
  {:db/ident         :http-statusCodes/PreconditionFailed,
   :dcterms/title    #voc/lstr "Precondition Failed@en",
   :http/statusCodeNumber "412",
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def Processing
  {:db/ident         :http-statusCodes/Processing,
   :dcterms/title    #voc/lstr "Processing@en",
   :http/statusCodeNumber "102",
   :rdf/type         [:http-statusCodes/StatusCode1xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2518.txt"})

(def ProxyAuthenticationRequired
  {:db/ident         :http-statusCodes/ProxyAuthenticationRequired,
   :dcterms/title    #voc/lstr "Proxy Authentication Required@en",
   :http/statusCodeNumber "407",
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def RequestEntityTooLarge
  {:db/ident         :http-statusCodes/RequestEntityTooLarge,
   :dcterms/title    #voc/lstr "Request Entity Too Large@en",
   :http/statusCodeNumber "413",
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def RequestTimeout
  {:db/ident         :http-statusCodes/RequestTimeout,
   :dcterms/title    #voc/lstr "Request Timeout@en",
   :http/statusCodeNumber "408",
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def RequestURITooLong
  {:db/ident         :http-statusCodes/RequestURITooLong,
   :dcterms/title    #voc/lstr "Request-URI Too Long@en",
   :http/statusCodeNumber "414",
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def RequestedRangeNotSatisfiable
  {:db/ident         :http-statusCodes/RequestedRangeNotSatisfiable,
   :dcterms/title    #voc/lstr "Requested Range Not Satisfiable@en",
   :http/statusCodeNumber "416",
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def Reserved
  {:db/ident         :http-statusCodes/Reserved,
   :dcterms/title    #voc/lstr "(Reserved)@en",
   :http/statusCodeNumber "306",
   :rdf/type         [:http-statusCodes/StatusCode3xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def ResetContent
  {:db/ident         :http-statusCodes/ResetContent,
   :dcterms/title    #voc/lstr "Reset Content@en",
   :http/statusCodeNumber "205",
   :rdf/type         [:http-statusCodes/StatusCode2xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def SeeOther
  {:db/ident         :http-statusCodes/SeeOther,
   :dcterms/title    #voc/lstr "See Other@en",
   :http/statusCodeNumber "303",
   :rdf/type         [:http-statusCodes/StatusCode3xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def ServiceUnavailable
  {:db/ident         :http-statusCodes/ServiceUnavailable,
   :dcterms/title    #voc/lstr "Service Unavailable@en",
   :http/statusCodeNumber "503",
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

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
  {:db/ident         :http-statusCodes/SwitchingProtocols,
   :dcterms/title    #voc/lstr "Switching Protocols@en",
   :http/statusCodeNumber "101",
   :rdf/type         [:http-statusCodes/StatusCode1xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def TemporaryRedirect
  {:db/ident         :http-statusCodes/TemporaryRedirect,
   :dcterms/title    #voc/lstr "Temporary Redirect@en",
   :http/statusCodeNumber "307",
   :rdf/type         [:http-statusCodes/StatusCode3xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def Unauthorized
  {:db/ident         :http-statusCodes/Unauthorized,
   :dcterms/title    #voc/lstr "Unauthorized@en",
   :http/statusCodeNumber "401",
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def UnprocessableEntity
  {:db/ident         :http-statusCodes/UnprocessableEntity,
   :dcterms/title    #voc/lstr "Unprocessable Entity@en",
   :http/statusCodeNumber "422",
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc4918.txt"})

(def UnsupportedMediaType
  {:db/ident         :http-statusCodes/UnsupportedMediaType,
   :dcterms/title    #voc/lstr "Unsupported Media Type@en",
   :http/statusCodeNumber "415",
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def UpgradeRequired
  {:db/ident         :http-statusCodes/UpgradeRequired,
   :dcterms/title    #voc/lstr "Upgrade Required@en",
   :http/statusCodeNumber "426",
   :rdf/type         [:http-statusCodes/StatusCode4xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2817.txt"})

(def UseProxy
  {:db/ident         :http-statusCodes/UseProxy,
   :dcterms/title    #voc/lstr "Use Proxy@en",
   :http/statusCodeNumber "305",
   :rdf/type         [:http-statusCodes/StatusCode3xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2616.txt"})

(def VariantAlsoNegotiates
  {:db/ident         :http-statusCodes/VariantAlsoNegotiates,
   :dcterms/title    #voc/lstr "Variant Also Negotiates (Experimental)@en",
   :http/statusCodeNumber "506",
   :rdf/type         [:http-statusCodes/StatusCode5xx
                      :http/StatusCode
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.ietf.org/rfc/rfc2295.txt"})