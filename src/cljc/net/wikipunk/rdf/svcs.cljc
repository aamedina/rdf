(ns net.wikipunk.rdf.svcs
  {:rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "sioc"    "http://rdfs.org/sioc/ns#",
                       "svcs"    "http://rdfs.org/sioc/services#"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "svcs",
   :rdfa/uri          "http://rdfs.org/sioc/services#"})

(def Service
  "A Service is web service associated with a Site or part of it."
  {:db/ident :svcs/Service,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #rdf/langString
    "A Service is web service associated with a Site or part of it.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/services#"},
   :rdfs/label #rdf/langString "Service@en",
   :rdfs/subClassOf :rdfs/Resource})

(def has_service
  "A Service associated with this SIOC object."
  {:db/ident         :svcs/has_service,
   :owl/inverseOf    :svcs/service_of,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     #rdf/langString
                      "A Service associated with this SIOC object.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/services#"},
   :rdfs/label       #rdf/langString "has service@en",
   :rdfs/range       :svcs/Service})

(def max_results
  "Maximum number of results results returned by a web service."
  {:db/ident :svcs/max_results,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   #rdf/langString
    "Maximum number of results results returned by a web service.@en",
   :rdfs/domain :svcs/Service,
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/services#"},
   :rdfs/label #rdf/langString "max results@en",
   :rdfs/range :xsd/integer})

(def results_format
  "Format of results returned by a web service."
  {:db/ident         :svcs/results_format,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     #rdf/langString
                      "Format of results returned by a web service.@en",
   :rdfs/domain      :svcs/Service,
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/services#"},
   :rdfs/label       #rdf/langString "results format@en"})

(def service_definition
  "Links to a web service definition of this sioc:Service."
  {:db/ident :svcs/service_definition,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment #rdf/langString
                  "Links to a web service definition of this sioc:Service.@en",
   :rdfs/domain :svcs/Service,
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/services#"},
   :rdfs/label #rdf/langString "service definition@en"})

(def service_endpoint
  "URL of a web service endpoint."
  {:db/ident         :svcs/service_endpoint,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     #rdf/langString "URL of a web service endpoint.@en",
   :rdfs/domain      :svcs/Service,
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/services#"},
   :rdfs/label       #rdf/langString "service endpoint@en"})

(def service_of
  "A SIOC object this Service is associated with."
  {:db/ident         :svcs/service_of,
   :owl/inverseOf    :svcs/has_service,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     #rdf/langString
                      "A SIOC object this Service is associated with.@en",
   :rdfs/domain      :svcs/Service,
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/services#"},
   :rdfs/label       #rdf/langString "service of@en"})

(def service_protocol
  "A protocol used by a web service. Possible protocol values include SOAP, REST, SPARQL-QUERY, GData and OpenSearch. These will be added to this module later."
  {:db/ident :svcs/service_protocol,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #rdf/langString
    "A protocol used by a web service. Possible protocol values include SOAP, REST, SPARQL-QUERY, GData and OpenSearch. These will be added to this module later.@en",
   :rdfs/domain :svcs/Service,
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/services#"},
   :rdfs/label #rdf/langString "service protocol@en"})
