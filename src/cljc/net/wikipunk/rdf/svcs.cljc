(ns net.wikipunk.rdf.svcs
  ^{:base       "http://rdfs.org/sioc/services#",
    :namespaces {"dcterms" "http://purl.org/dc/terms/",
                 "owl"     "http://www.w3.org/2002/07/owl#",
                 "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                 "sioc"    "http://rdfs.org/sioc/ns#",
                 "svcs"    "http://rdfs.org/sioc/services#"},
    :prefix     "svcs",
    :source     "http://rdfs.org/sioc/services#"}
  {:dcterms/description
   "Extends the SIOC Core Ontology (Semantically-Interlinked Online Communities) by defining basic information on community-related web services.",
   :dcterms/title "SIOC Services Ontology Module Namespace",
   :owl/imports {:xsd/anyURI "http://rdfs.org/sioc/ns#"},
   :rdf/type #{:owl/Thing :owl/Ontology},
   :rdfs/seeAlso {:xsd/anyURI "http://rdfs.org/sioc/spec/#sec-modules"},
   :xsd/anyURI "http://rdfs.org/sioc/services#"})

(def Service
  {:db/ident :svcs/Service,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Service is web service associated with a Site or part of it."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/services#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Service"}})

(def has_service
  {:db/ident         :svcs/has_service,
   :owl/inverseOf    :svcs/service_of,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "A Service associated with this SIOC object."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/services#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has service"},
   :rdfs/range       :svcs/Service})

(def max_results
  {:db/ident :svcs/max_results,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Maximum number of results results returned by a web service."},
   :rdfs/domain :svcs/Service,
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/services#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "max results"},
   :rdfs/range :xsd/integer})

(def results_format
  {:db/ident         :svcs/results_format,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Format of results returned by a web service."},
   :rdfs/domain      :svcs/Service,
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/services#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "results format"}})

(def service_definition
  {:db/ident :svcs/service_definition,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Links to a web service definition of this sioc:Service."},
   :rdfs/domain :svcs/Service,
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/services#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "service definition"}})

(def service_endpoint
  {:db/ident         :svcs/service_endpoint,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "URL of a web service endpoint."},
   :rdfs/domain      :svcs/Service,
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/services#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "service endpoint"}})

(def service_of
  {:db/ident         :svcs/service_of,
   :owl/inverseOf    :svcs/has_service,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A SIOC object this Service is associated with."},
   :rdfs/domain      :svcs/Service,
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/services#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "service of"}})

(def service_protocol
  {:db/ident :svcs/service_protocol,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A protocol used by a web service. Possible protocol values include SOAP, REST, SPARQL-QUERY, GData and OpenSearch. These will be added to this module later."},
   :rdfs/domain :svcs/Service,
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/services#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "service protocol"}})

(def urn:uuid:2bd7074c-2eb8-5301-a6fe-d92a12f97c80
  {:dcterms/description
   "Extends the SIOC Core Ontology (Semantically-Interlinked Online Communities) by defining basic information on community-related web services.",
   :dcterms/title "SIOC Services Ontology Module Namespace",
   :owl/imports {:xsd/anyURI "http://rdfs.org/sioc/ns#"},
   :rdf/type #{:owl/Thing :owl/Ontology},
   :rdfs/seeAlso {:xsd/anyURI "http://rdfs.org/sioc/spec/#sec-modules"},
   :xsd/anyURI "http://rdfs.org/sioc/services#"})