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
   :rdf/type [:owl/Thing :owl/Ontology],
   :rdfa/prefix "svcs",
   :rdfa/uri "http://rdfs.org/sioc/services#",
   :rdfs/seeAlso ["http://rdfs.org/sioc/spec/#sec-modules"]})

(def Service
  "A Service is web service associated with a Site or part of it."
  {:db/ident :svcs/Service,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #voc/lstr
    "A Service is web service associated with a Site or part of it.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/services#",
   :rdfs/label #voc/lstr "Service@en",
   :rdfs/subClassOf [:rdfs/Resource :svcs/Service]})

(def has_service
  "A Service associated with this SIOC object."
  {:db/ident           :svcs/has_service,
   :owl/inverseOf      :svcs/service_of,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       #voc/lstr
                        "A Service associated with this SIOC object.@en",
   :rdfs/isDefinedBy   "http://rdfs.org/sioc/services#",
   :rdfs/label         #voc/lstr "has service@en",
   :rdfs/range         :svcs/Service,
   :rdfs/subPropertyOf :svcs/has_service})

(def max_results
  "Maximum number of results results returned by a web service."
  {:db/ident :svcs/max_results,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr "Maximum number of results results returned by a web service.@en",
   :rdfs/domain :svcs/Service,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/services#",
   :rdfs/label #voc/lstr "max results@en",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :svcs/max_results})

(def results_format
  "Format of results returned by a web service."
  {:db/ident           :svcs/results_format,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       #voc/lstr
                        "Format of results returned by a web service.@en",
   :rdfs/domain        :svcs/Service,
   :rdfs/isDefinedBy   "http://rdfs.org/sioc/services#",
   :rdfs/label         #voc/lstr "results format@en",
   :rdfs/subPropertyOf :svcs/results_format})

(def service_definition
  "Links to a web service definition of this sioc:Service."
  {:db/ident :svcs/service_definition,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment #voc/lstr
                  "Links to a web service definition of this sioc:Service.@en",
   :rdfs/domain :svcs/Service,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/services#",
   :rdfs/label #voc/lstr "service definition@en",
   :rdfs/subPropertyOf :svcs/service_definition})

(def service_endpoint
  "URL of a web service endpoint."
  {:db/ident           :svcs/service_endpoint,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       #voc/lstr "URL of a web service endpoint.@en",
   :rdfs/domain        :svcs/Service,
   :rdfs/isDefinedBy   "http://rdfs.org/sioc/services#",
   :rdfs/label         #voc/lstr "service endpoint@en",
   :rdfs/subPropertyOf :svcs/service_endpoint})

(def service_of
  "A SIOC object this Service is associated with."
  {:db/ident           :svcs/service_of,
   :owl/inverseOf      :svcs/has_service,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       #voc/lstr
                        "A SIOC object this Service is associated with.@en",
   :rdfs/domain        :svcs/Service,
   :rdfs/isDefinedBy   "http://rdfs.org/sioc/services#",
   :rdfs/label         #voc/lstr "service of@en",
   :rdfs/subPropertyOf :svcs/service_of})

(def service_protocol
  "A protocol used by a web service. Possible protocol values include SOAP, REST, SPARQL-QUERY, GData and OpenSearch. These will be added to this module later."
  {:db/ident :svcs/service_protocol,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "A protocol used by a web service. Possible protocol values include SOAP, REST, SPARQL-QUERY, GData and OpenSearch. These will be added to this module later.@en",
   :rdfs/domain :svcs/Service,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/services#",
   :rdfs/label #voc/lstr "service protocol@en",
   :rdfs/subPropertyOf :svcs/service_protocol})