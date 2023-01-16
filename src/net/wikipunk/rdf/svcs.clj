(ns net.wikipunk.rdf.svcs
  "Extends the SIOC Core Ontology (Semantically-Interlinked Online Communities) by defining basic information on community-related web services."
  {:dcterms/description
   "Extends the SIOC Core Ontology (Semantically-Interlinked Online Communities) by defining basic information on community-related web services.",
   :dcterms/title "SIOC Services Ontology Module Namespace",
   :owl/imports "http://rdfs.org/sioc/ns#",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "sioc"    "http://rdfs.org/sioc/ns#",
                       "svcs"    "http://rdfs.org/sioc/services#"},
   :rdf/type          :owl/Ontology
   :rdf/uri "http://rdfs.org/sioc/services#",
   :rdfa/prefix "svcs",
   :rdfa/uri "http://rdfs.org/sioc/services#",
   :rdfs/seeAlso "http://rdfs.org/sioc/spec/#sec-modules"})

(def Service
  "A Service is web service associated with a Site or part of it."
  {:db/ident :svcs/Service,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Service is web service associated with a Site or part of it."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/services#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Service"}})

(def has_service
  "A Service associated with this SIOC object."
  {:db/ident         :svcs/has_service,
   :owl/inverseOf    :svcs/service_of,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "A Service associated with this SIOC object."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/services#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has service"},
   :rdfs/range       :svcs/Service})

(def max_results
  "Maximum number of results results returned by a web service."
  {:db/ident :svcs/max_results,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Maximum number of results results returned by a web service."},
   :rdfs/domain :svcs/Service,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/services#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "max results"},
   :rdfs/range :xsd/integer})

(def results_format
  "Format of results returned by a web service."
  {:db/ident         :svcs/results_format,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Format of results returned by a web service."},
   :rdfs/domain      :svcs/Service,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/services#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "results format"}})

(def service_definition
  "Links to a web service definition of this sioc:Service."
  {:db/ident :svcs/service_definition,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Links to a web service definition of this sioc:Service."},
   :rdfs/domain :svcs/Service,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/services#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "service definition"}})

(def service_endpoint
  "URL of a web service endpoint."
  {:db/ident         :svcs/service_endpoint,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "URL of a web service endpoint."},
   :rdfs/domain      :svcs/Service,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/services#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "service endpoint"}})

(def service_of
  "A SIOC object this Service is associated with."
  {:db/ident         :svcs/service_of,
   :owl/inverseOf    :svcs/has_service,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A SIOC object this Service is associated with."},
   :rdfs/domain      :svcs/Service,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/services#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "service of"}})

(def service_protocol
  "A protocol used by a web service. Possible protocol values include SOAP, REST, SPARQL-QUERY, GData and OpenSearch. These will be added to this module later."
  {:db/ident :svcs/service_protocol,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A protocol used by a web service. Possible protocol values include SOAP, REST, SPARQL-QUERY, GData and OpenSearch. These will be added to this module later."},
   :rdfs/domain :svcs/Service,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/services#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "service protocol"}})
