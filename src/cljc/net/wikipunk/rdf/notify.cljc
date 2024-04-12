(ns net.wikipunk.rdf.notify
  {:dcat/downloadURL "net/wikipunk/ext/notifications.ttl",
   :dcterms/issued #inst "2022-12-31T00:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI
                     "https://creativecommons.org/publicdomain/zero/1.0/"},
   :namespaces {"dcterms" "http://purl.org/dc/terms/",
                "notify"  "http://www.w3.org/ns/solid/notifications#",
                "owl"     "http://www.w3.org/2002/07/owl#",
                "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                "vann"    "http://purl.org/vocab/vann/",
                "vs"      "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "notify",
   :rdfa/uri "http://www.w3.org/ns/solid/notifications#",
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The vocabulary used by the Solid Notifications Protocol specification."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Solid Notifications"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://solidproject.org/TR/notifications-protocol"},
   :vann/preferredNamespacePrefix "notify",
   :vann/preferredNamespaceUri {:xsd/anyURI
                                "http://www.w3.org/ns/solid/notifications#"},
   :xsd/anyURI "http://www.w3.org/ns/solid/notifications#"})

(def EventSourceChannel2023
  {:db/ident :notify/EventSourceChannel2023,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A notification channel type that uses the EventSource Web API."},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://solid.github.io/notifications/eventsource-channel-2023"},
   :rdfs/label "EventSourceChannel2023",
   :vs/term_status "testing"})

(def LDNChannel2023
  {:db/ident :notify/LDNChannel2023,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A notification channel type that uses the Linked Data Notifications protocol."},
   :rdfs/isDefinedBy {:xsd/anyURI
                      "https://solid.github.io/notifications/ldn-channel-2023"},
   :rdfs/label "LDNChannel2023",
   :vs/term_status "testing"})

(def StreamingHTTPChannel2023
  {:db/ident :notify/StreamingHTTPChannel2023,
   :rdf/type :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "A notification channel type that uses the Fetch API."},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://solid.github.io/notifications/streaming-http-channel-2023"},
   :rdfs/label "StreamingHTTPChannel2023",
   :vs/term_status "testing"})

(def WebSocketChannel2023
  {:db/ident :notify/WebSocketChannel2023,
   :rdf/type :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "A notification channel type that uses the WebSocket API."},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://solid.github.io/notifications/websocket-channel-2023"},
   :rdfs/label "WebSocketChannel2023",
   :vs/term_status "testing"})

(def WebhookChannel2023
  {:db/ident :notify/WebhookChannel2023,
   :rdf/type :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value "A notification channel type that uses Webhooks."},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://solid.github.io/notifications/webhook-channel-2023"},
   :rdfs/label "WebhookChannel2023",
   :vs/term_status "testing"})

(def accept
  {:db/ident :notify/accept,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The media types that are acceptable by the recipient of a notification with value corresponding to the HTTP Accept header value [RFC7231]."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/notifications#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "accept"},
   :vs/term_status "testing"})

(def channel
  {:db/ident :notify/channel,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A property used to indicate an available notification channel."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/notifications#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "notification channel"},
   :vs/term_status "testing"})

(def channelType
  {:db/ident :notify/channelType,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "A property used to indicate the notification channel type."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/notifications#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "notification channel type"},
   :vs/term_status "testing"})

(def endAt
  {:db/ident :notify/endAt,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The proposed or actual ending date and time of a notification channel with value represented in the xsd:dateTime datatype."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/notifications#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "end at"},
   :vs/term_status "testing"})

(def feature
  {:db/ident :notify/feature,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A property used to describe the features supported by a particular notification channel."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/notifications#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "feature"},
   :vs/term_status "testing"})

(def rate
  {:db/ident :notify/rate,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The minimum amount of time to elapse between notifications sent to receiver with value represented in the xsd:duration datatype."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/notifications#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "rate"},
   :vs/term_status "testing"})

(def receiveFrom
  {:db/ident :notify/receiveFrom,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The property used to identify the resource that can be used to establish a connection to receive notifications."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/notifications#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "receive from"},
   :vs/term_status "testing"})

(def sendTo
  {:db/ident :notify/sendTo,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The property used to identify the resource that can accept notifications."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/notifications#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "send to"},
   :vs/term_status "testing"})

(def sender
  {:db/ident :notify/sender,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The property used to identify the party that sends notifications."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/notifications#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "sender"},
   :vs/term_status "testing"})

(def startAt
  {:db/ident :notify/startAt,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The proposed or actual starting date and time of a notification channel with value represented in the xsd:dateTime datatype."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/notifications#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "start at"},
   :vs/term_status "testing"})

(def state
  {:db/ident :notify/state,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The last known state of a resource (topic) with value represented in the xsd:string datatype."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/notifications#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "state"},
   :vs/term_status "testing"})

(def subscription
  {:db/ident :notify/subscription,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A property used to indicate an available subscription service."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/notifications#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subscription"},
   :vs/term_status "testing"})

(def topic
  {:db/ident :notify/topic,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The IRI of a resource about which a client would like to receive notifications."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/notifications#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "topic"},
   :vs/term_status "testing"})

(def urn:uuid:484b76e9-375c-5c2d-86b5-4c0de8024f7d
  {:dcterms/issued #inst "2022-12-31T00:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI
                     "https://creativecommons.org/publicdomain/zero/1.0/"},
   :rdf/type :owl/Ontology,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The vocabulary used by the Solid Notifications Protocol specification."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Solid Notifications"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://solidproject.org/TR/notifications-protocol"},
   :vann/preferredNamespacePrefix "notify",
   :vann/preferredNamespaceUri {:xsd/anyURI
                                "http://www.w3.org/ns/solid/notifications#"},
   :xsd/anyURI "http://www.w3.org/ns/solid/notifications#"})