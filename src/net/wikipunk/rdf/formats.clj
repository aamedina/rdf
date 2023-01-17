(ns net.wikipunk.rdf.formats
  "Information Resource for the SPARQL Results File Format in CSV"
  {:dcat/downloadURL "http://www.w3.org/ns/formats/SPARQL_Results_CSV",
   :dcterms/title
   "Information Resource for the SPARQL Results File Format in CSV",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "formats" "http://www.w3.org/ns/formats/",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://www.w3.org/ns/formats/data/SPARQL_Results_CSV.html",
   :rdfa/prefix "formats",
   :rdfa/uri "http://www.w3.org/ns/formats/"})

(def Format
  "A unique, top-level Class URI for specific file formats. Media types do not uniquely identify file formats (eg, serialization formats for various abstract concepts), because not all specific cases do have distinct media types, instances in this class can be used instead for proper identification.",
  {:db/ident            :formats/Format,
   :rdfs/subClassOf     :void/TechnicalFeature
   :dcterms/modified    "2013-03-25",
   :dcterms/description "A unique, top-level Class URI for specific file formats. Media types do not uniquely identify file formats (eg, serialization formats for various abstract concepts), because not all specific cases do have distinct media types, instances in this class can be used instead for proper identification.",
   :dcterms/creator     "http://www.ivan-herman.net/foaf#me",
   :dcterms/created     "2010-05-27",
   :rdf/type            :owl/Class})

(def JSON-LD
  "Unique identifier for the JSON-LD Syntax"
  {:db/ident :formats/JSON-LD,
   :dcterms/created "2013-03-27",
   :dcterms/creator "http://www.ivan-herman.net/foaf#me",
   :dcterms/description "Unique identifier for the JSON-LD Syntax",
   :dcterms/modified "2021-10-13",
   :formats/media_type "application/ld+json",
   :formats/preferred_suffix ".jsonld",
   :rdf/type :formats/Format,
   :rdfs/comment
   "JSON-LD is defined by the “JSON-LD Syntax 1.0: A Context-based JSON Serialization for Linking Data” W3C Recommendation.",
   :rdfs/isDefinedBy "http://www.w3.org/TR/json-ld-syntax/",
   :rdfs/seeAlso ["http://www.w3.org/TR/json-ld-syntax/#iana-considerations"]})

(def LD_Patch
  "Unique identifier for the LD Patch Format"
  {:db/ident :formats/LD_Patch,
   :dcterms/created "2015-02-07",
   :dcterms/creator "https://deiu.rww.io/profile/card#me",
   :dcterms/description "Unique identifier for the LD Patch Format",
   :dcterms/modified "2021-10-13",
   :formats/media_type "text/ldpatch",
   :formats/preferred_suffix ".ldp",
   :rdf/type :formats/Format,
   :rdfs/comment
   "LD Patch is defined by the “Linked Data Patch Format” W3C Candidate Recommendation.",
   :rdfs/isDefinedBy "http://www.w3.org/TR/ldpatch/",
   :rdfs/seeAlso ["http://www.w3.org/TR/ldpatch/#media-registration"]})

(def N-Quads
  "Unique identifier for the RDF Dataset serialization in N-Quads"
  {:db/ident :formats/N-Quads,
   :dcterms/created "2013-09-05",
   :dcterms/creator "http://www.ivan-herman.net/foaf#me",
   :dcterms/description
   "Unique identifier for the RDF Dataset serialization in N-Quads",
   :dcterms/modified "2014-12-23",
   :formats/media_type "application/n-quads",
   :formats/preferred_suffix ".nq",
   :rdf/type :formats/Format,
   :rdfs/comment
   "N-Quads is defined  the “N-Quads” W3C Recommendation. It uses the general media type: ‘application/n-quads’ and a preferred suffix: ‘.nq’.",
   :rdfs/isDefinedBy "http://www.w3.org/TR/n-quads/"})

(def N-Triples
  "Unique identifier for the RDF serialization in N-Triples"
  {:db/ident :formats/N-Triples,
   :dcterms/created "2010-05-04",
   :dcterms/creator "http://www.ivan-herman.net/foaf#me",
   :dcterms/description
   "Unique identifier for the RDF serialization in N-Triples",
   :dcterms/modified "2013-12-23",
   :formats/media_type "application/n-triples",
   :formats/preferred_suffix ".nt",
   :rdf/type :formats/Format,
   :rdfs/comment
   "N-Triples is defined  the “N-Triples” W3C Recommendation. It uses the general media type: ‘application/n-triples’ and a preferred suffix: ‘.nt’.",
   :rdfs/isDefinedBy "http://www.w3.org/TR/n-triples/"})

(def N3
  "Unique identifier for the N3 RDF syntax"
  {:db/ident :formats/N3,
   :dcterms/created "2010-05-04",
   :dcterms/creator "http://www.ivan-herman.net/foaf#me",
   :dcterms/description "Unique identifier for the N3 RDF syntax",
   :dcterms/modified "2013-03-25",
   :formats/media_type "text/rdf+n3",
   :rdf/type :formats/Format,
   :rdfs/comment
   "N3 is defined by the “Notation3 (N3): A readable RDF syntax” W3C Team Submission.",
   :rdfs/isDefinedBy "http://www.w3.org/TeamSubmission/n3/",
   :rdfs/seeAlso ["http://www.w3.org/TeamSubmission/n3/#mimetype"]})

(def OWL_Functional
  "Unique identifier for the OWL Serialization in Functional Syntax"
  {:db/ident :formats/OWL_Functional,
   :dcterms/created "2010-05-04",
   :dcterms/creator "http://www.ivan-herman.net/foaf#me",
   :dcterms/description
   "Unique identifier for the OWL Serialization in Functional Syntax",
   :dcterms/modified "2013-03-25",
   :formats/media_type "text/owl-functional",
   :formats/preferred_suffix ".ofn",
   :rdf/type :formats/Format,
   :rdfs/comment
   "OWL Functional Syntax is defined by the “OWL 2 Web Ontology Language, Structural Specification and Functional-Style Syntax” W3C Recommendation.",
   :rdfs/isDefinedBy "http://www.w3.org/TR/owl-syntax/",
   :rdfs/seeAlso
   ["http://www.w3.org/TR/owl-syntax/#Appendix:_Internet_Media_Type.2C_File_Extension.2C_and_Macintosh_File_Type"]})

(def OWL_Functional
  "Unique identifier for the OWL Serialization in Functional Syntax"
  {:db/ident :formats/OWL_Functional,
   :dcterms/created "2010-05-04",
   :dcterms/creator "http://www.ivan-herman.net/foaf#me",
   :dcterms/description
   "Unique identifier for the OWL Serialization in Functional Syntax",
   :dcterms/modified "2013-03-25",
   :formats/media_type "text/owl-functional",
   :formats/preferred_suffix ".ofn",
   :rdf/type :formats/Format,
   :rdfs/comment
   "OWL Functional Syntax is defined by the “OWL 2 Web Ontology Language, Structural Specification and Functional-Style Syntax” W3C Recommendation.",
   :rdfs/isDefinedBy "http://www.w3.org/TR/owl-syntax/",
   :rdfs/seeAlso
   ["http://www.w3.org/TR/owl-syntax/#Appendix:_Internet_Media_Type.2C_File_Extension.2C_and_Macintosh_File_Type"]})

(def OWL_XML
  "Unique identifier for the OWL Serialization in XML"
  {:db/ident :formats/OWL_XML,
   :dcterms/created "2010-05-04",
   :dcterms/creator "http://www.ivan-herman.net/foaf#me",
   :dcterms/description "Unique identifier for the OWL Serialization in XML",
   :dcterms/modified "2013-03-25",
   :formats/media_type "application/owl+xml",
   :formats/preferred_suffix ".owx",
   :rdf/type :formats/Format,
   :rdfs/comment
   "OWL XML is defined by the “OWL 2 Web Ontology Language, XML Serialization” W3C Recommendation.",
   :rdfs/isDefinedBy "http://www.w3.org/TR/owl-xml-serialization/",
   :rdfs/seeAlso
   ["http://www.w3.org/TR/owl-xml-serialization/#Appendix:_Internet_Media_Type.2C_File_Extension.2C_and_Macintosh_File_Type"]})

(def POWDER
  "Unique identifier for the POWDER file format"
  {:db/ident :formats/POWDER,
   :dcterms/created "2010-05-04",
   :dcterms/creator "http://www.ivan-herman.net/foaf#me",
   :dcterms/description "Unique identifier for the POWDER file format",
   :dcterms/modified "2013-03-25",
   :formats/media_type "powder+xml",
   :rdf/type :formats/Format,
   :rdfs/comment
   "POWDER is defined by the “Protocol for Web Description Resources (POWDER): Description Resources” W3C Recommendation.",
   :rdfs/isDefinedBy "http://www.w3.org/TR/powder-dr/",
   :rdfs/seeAlso ["http://www.w3.org/TR/powder-dr/#appB"]})

(def POWDER-S
  "Unique identifier for the POWDER-S file format"
  {:db/ident :formats/POWDER-S,
   :dcterms/created "2010-05-03",
   :dcterms/creator "http://www.ivan-herman.net/foaf#me",
   :dcterms/description "Unique identifier for the POWDER-S file format",
   :dcterms/modified "2013-03-25",
   :formats/media_type "powder-s+xml",
   :rdf/type :formats/Format,
   :rdfs/comment
   "POWDER-S is defined by the “Protocol for Web Description Resources (POWDER): Description Resources” W3C Recommendation.",
   :rdfs/isDefinedBy "http://www.w3.org/TR/powder-dr/",
   :rdfs/seeAlso ["http://www.w3.org/TR/powder-dr/#appC"]})

(def PROV-N
  "Unique identifier for the PROV-N Provenance Notation"
  {:db/ident :formats/PROV-N,
   :dcterms/created "2013-03-25",
   :dcterms/creator "http://www.ivan-herman.net/foaf#me",
   :dcterms/description "Unique identifier for the PROV-N Provenance Notation",
   :dcterms/modified "2013-03-25",
   :formats/media_type "text/provenance-notation",
   :formats/preferred_suffix ".provn",
   :rdf/type :formats/Format,
   :rdfs/comment
   "PROV-N is defined by the “PROV-N: The Provenance Notation” W3C Proposed Recommendation.",
   :rdfs/isDefinedBy "http://www.w3.org/TR/prov-n/",
   :rdfs/seeAlso ["http://www.w3.org/TR/prov-n/#media-type"]})

(def PROV-XML
  "Unique identifier for the PROV-XML Provenance Notation"
  {:db/ident :formats/PROV-XML,
   :dcterms/created "2013-03-25",
   :dcterms/creator "http://www.ivan-herman.net/foaf#me",
   :dcterms/description
   "Unique identifier for the PROV-XML Provenance Notation",
   :dcterms/modified "2013-03-25",
   :formats/media_type "application/provenance+xml",
   :formats/preferred_suffix ".provx",
   :rdf/type :formats/Format,
   :rdfs/comment
   "PROV-XML is defined by the “PROV-XML: The PROV XML Schema” W3C Working Draft.",
   :rdfs/isDefinedBy "http://www.w3.org/TR/prov-xml/",
   :rdfs/seeAlso ["http://www.w3.org/TR/prov-xml/#media-type"]})

(def RDF_JSON
  "Unique identifier for the RDF 1.1 JSON Alternate Serialization (RDF/JSON)"
  {:db/ident :formats/RDF_JSON,
   :dcterms/created "2013-11-09",
   :dcterms/creator "http://www.ivan-herman.net/foaf#me",
   :dcterms/description
   "Unique identifier for the RDF 1.1 JSON Alternate Serialization (RDF/JSON)",
   :dcterms/modified "2021-20-13",
   :formats/media_type "application/rdf+json",
   :formats/preferred_suffix ".rj",
   :rdf/type :formats/Format,
   :rdfs/comment
   "RDF/JSON is defined by the “RDF 1.1 JSON Alternate Serialization (RDF/JSON)” W3C Working Group Note.",
   :rdfs/isDefinedBy "http://www.w3.org/TR/rdf-json/",
   :rdfs/seeAlso ["http://www.w3.org/TR/rdf-json/#sec-mediaReg"]})

(def RDF_XML
  "Unique identifier for the RDF serialization in XML (RDF/XML)"
  {:db/ident :formats/RDF_XML,
   :dcterms/created "2010-05-04",
   :dcterms/creator "http://www.ivan-herman.net/foaf#me",
   :dcterms/description
   "Unique identifier for the RDF serialization in XML (RDF/XML)",
   :dcterms/modified "2013-03-25",
   :formats/media_type "application/rdf+xml",
   :formats/preferred_suffix ".rdf",
   :rdf/type :formats/Format,
   :rdfs/comment
   "RDF/XML is defined by the “RDF/XML Syntax Specification” W3C Recommendation.",
   :rdfs/isDefinedBy "http://www.w3.org/TR/rdf-syntax-grammar/",
   :rdfs/seeAlso
   ["http://www.w3.org/TR/rdf-syntax-grammar/#section-MIME-Type"]})

(def RDFa
  "Unique Identifier for the RDFa RDF Serialization Format"
  {:db/ident :formats/RDFa,
   :dcterms/created "2010-05-04",
   :dcterms/creator "http://www.ivan-herman.net/foaf#me",
   :dcterms/description
   "Unique Identifier for the RDFa RDF Serialization Format",
   :dcterms/modified "2021-10-13",
   :rdf/type :formats/Format,
   :rdfs/comment
   "RDFa is defined by the “RDFa Core 1.1: Syntax and processing rules for embedding RDF through attributes” W3C Recommendation.",
   :rdfs/isDefinedBy "http://www.w3.org/TR/rdfa-core/"})

(def RIF_XML
  "Unique identifier for the RIF XML file format"
  {:db/ident :formats/RIF_XML,
   :dcterms/creator "http://www.ivan-herman.net/foaf#me",
   :dcterms/date "2010-05-03",
   :dcterms/description "Unique identifier for the RIF XML file format",
   :formats/media_type "application/rif+xml",
   :formats/preferred_suffix ".rif",
   :rdf/type :formats/Format,
   :rdfs/comment
   "RIF XML syntax is defined by the “RIF Core Dialect” Proposed W3C Recommendation.",
   :rdfs/isDefinedBy "http://www.w3.org/TR/rif-core/",
   :rdfs/seeAlso
   ["http://www.w3.org/TR/rif-core/#Appendix:_RIF_Media_Type_Registration"]})

(def SPARQL_Results_CSV
  "Unique identifier for the SPARQL Results in CSV file format"
  {:db/ident :formats/SPARQL_Results_CSV,
   :dcterms/created "2011-10-19",
   :dcterms/creator "http://www.ivan-herman.net/foaf#me",
   :dcterms/description
   "Unique identifier for the SPARQL Results in CSV file format",
   :dcterms/modified "2021-10-13",
   :formats/media_type "text/csv",
   :formats/preferred_suffix ".csv",
   :rdf/type :formats/Format,
   :rdfs/comment
   "SPARQL Results in CSV is defined by the “SPARQL 1.1 Query Results CSV and TSV Formats” W3C Recommendation.",
   :rdfs/isDefinedBy "http://www.w3.org/TR/sparql11-results-csv-tsv/",
   :rdfs/seeAlso ["http://www.rfc-editor.org/rfc/rfc4180.txt"]})

(def SPARQL_Results_JSON
  "Unique identifier for the SPARQL Results in JSON file format"
  {:db/ident :formats/SPARQL_Results_JSON,
   :dcterms/created "2010-05-03",
   :dcterms/creator "http://www.ivan-herman.net/foaf#me",
   :dcterms/description
   "Unique identifier for the SPARQL Results in JSON file format",
   :dcterms/modified "2013-03-25",
   :formats/media_type "application/sparql-results+json",
   :formats/preferred_suffix ".srj",
   :rdf/type :formats/Format,
   :rdfs/comment
   "SPARQL Results in JSON is defined by the “SPARQL 1.1 Query Results JSON Format” W3C Recommendation.",
   :rdfs/isDefinedBy "http://www.w3.org/TR/sparql11-results-json/",
   :rdfs/seeAlso ["http://www.w3.org/TR/sparql11-results-json/#content-type"]})

(def SPARQL_Results_TSV
  "Unique identifier for the SPARQL Results in TSV file format"
  {:db/ident :formats/SPARQL_Results_TSV,
   :dcterms/created "2011-10-19",
   :dcterms/creator "http://www.ivan-herman.net/foaf#me",
   :dcterms/description
   "Unique identifier for the SPARQL Results in TSV file format",
   :dcterms/modified "2013-03-25",
   :formats/media_type "text/tab-separated-values",
   :rdf/type :formats/Format,
   :rdfs/comment
   "SPARQL Results in TSV is defined by the “SPARQL 1.1 Query Results CSV and TSV Formats” W3C Recommendation.",
   :rdfs/isDefinedBy "http://www.w3.org/TR/sparql11-results-csv-tsv/",
   :rdfs/seeAlso
   ["http://www.iana.org/assignments/media-types/text/tab-separated-values"]})

(def TriG
  "Unique identifier for the RDF Dataset Serialization in TriG"
  {:db/ident :formats/TriG,
   :dcterms/created "2013-10-28",
   :dcterms/creator "http://www.ivan-herman.net/foaf#me",
   :dcterms/description
   "Unique identifier for the RDF Dataset Serialization in TriG",
   :dcterms/modified "2014-13-23",
   :formats/media_type "application/trig",
   :formats/preferred_suffix ".trig",
   :rdf/type :formats/Format,
   :rdfs/comment
   "TriG is defined by the TriG - RDF Dataset Language” W3C Recommendation.",
   :rdfs/isDefinedBy "http://www.w3.org/TR/trig/",
   :rdfs/seeAlso ["http://www.w3.org/TR/trig/#sec-mediaReg"]})

(def Turtle
  "Unique identifier for the RDF Serialization in Turtle"
  {:db/ident :formats/Turtle,
   :dcterms/created "2010-05-03",
   :dcterms/creator "http://www.ivan-herman.net/foaf#me",
   :dcterms/description "Unique identifier for the RDF Serialization in Turtle",
   :dcterms/modified "2014-23-23",
   :formats/media_type "text/turtle",
   :formats/preferred_suffix ".ttl",
   :rdf/type :formats/Format,
   :rdfs/comment
   "Turtle is defined by the “Turtle - Terse RDF Triple Language” W3C Recommendation.",
   :rdfs/isDefinedBy "http://www.w3.org/TR/turtle/",
   :rdfs/seeAlso ["http://www.w3.org/TR/turtle/#sec-mediaReg"]})

(def microdata
  "Unique identifier for the Microdata Syntax"
  {:db/ident :formats/microdata,
   :dcterms/created "2014-12-23",
   :dcterms/creator "http://www.ivan-herman.net/foaf#me",
   :dcterms/description "Unique identifier for the Microdata Syntax",
   :dcterms/modified "2014-12-23",
   :rdf/type :formats/Format,
   :rdfs/comment
   "Microdata is defined by the “HTML Microdata” W3C Working Group Note. Its extraction and conversion to RDF is defined in the separate “Microdata to RDF – Second Edition” Interest Group Note.",
   :rdfs/isDefinedBy "http://www.w3.org/TR/microdata/",
   :rdfs/seeAlso ["http://www.w3.org/TR/microdata-rdf/"]})
