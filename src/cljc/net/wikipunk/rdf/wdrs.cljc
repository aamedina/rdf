(ns net.wikipunk.rdf.wdrs
  "This file specifies the set of classes and properties used in the RDF/OWL version of POWDER documents."
  {:dcterms/issued #xsd/string "2009-09-01",
   :dcterms/modified [#xsd/string "2010-11-08" #xsd/string "2017-06-02"],
   :owl/versionInfo #xsd/string "2 June 2017",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "vann"    "http://purl.org/vocab/vann/",
                       "voaf"    "http://purl.org/vocommons/voaf#",
                       "wdrs"    "http://www.w3.org/2007/05/powder-s#",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type [:owl/Ontology :voaf/Vocabulary],
   :rdfa/prefix "wdrs",
   :rdfa/uri "http://www.w3.org/2007/05/powder-s",
   :rdfs/comment
   #xsd/string
    "This file specifies the set of classes and properties used in the RDF/OWL version of POWDER documents.",
   :rdfs/isDefinedBy {:rdfa/uri
                      "http://www.w3.org/TR/2009/REC-powder-formal-20090901/"},
   :rdfs/label #xsd/string "POWDER-S Vocabulary",
   :vann/preferredNamespacePrefix #xsd/string "wdrs",
   :vann/preferredNamespaceUri #xsd/string
                                "http://www.w3.org/2007/05/powder-s#"})

(def Document
  "A POWDER document."
  {:db/ident         :wdrs/Document,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #xsd/langString "A POWDER document.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/powder-dr/#structure"},
   :rdfs/label       #xsd/langString "POWDER document@en",
   :rdfs/subClassOf  [:rdfs/Resource :owl/Ontology]})

(def Processor
  "A software agent able to process POWDER documents."
  {:db/ident         :wdrs/Processor,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #xsd/langString
                      "A software agent able to process POWDER documents.@en",
   :rdfs/isDefinedBy {:rdfa/uri
                      "http://www.w3.org/TR/powder-dr/#powderprocessor"},
   :rdfs/label       #xsd/langString "POWDER processor@en",
   :rdfs/subClassOf  [:rdfs/Resource :dcterms/Agent]})

(def authenticate
  "A pointer to a document that describes how Description Resources created by a FOAF Agent or a DC Terms Agent may be authenticated"
  {:db/ident :wdrs/authenticate,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A pointer to a document that describes how Description Resources created by a FOAF Agent or a DC Terms Agent may be authenticated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/powder-dr/#discover"},
   :rdfs/label #xsd/langString "authenticate@en"})

(def certified
  "A property that takes a Boolean value to declare whether the author of the data certifies the described resource."
  {:db/ident :wdrs/certified,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A property that takes a Boolean value to declare whether the author of the data certifies the described resource.@en",
   :rdfs/isDefinedBy {:rdfa/uri
                      "http://www.w3.org/TR/powder-dr/#certification"},
   :rdfs/label #xsd/langString "certified@en",
   :rdfs/range :xsd/boolean})

(def certifiedby
  "A property that links a resource to a POWDER document that certifies it."
  {:db/ident :wdrs/certifiedby,
   :rdf/type [:owl/AnnotationProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "A property that links a resource to a POWDER document that certifies it.@en",
   :rdfs/isDefinedBy {:rdfa/uri
                      "http://www.w3.org/TR/powder-dr/#certification"},
   :rdfs/label #xsd/langString "certified by@en"})

(def data_error
  "A property denoting a description of the specific error found in a given POWDER document."
  {:db/ident :wdrs/data_error,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A property denoting a description of the specific error found in a given POWDER document.@en",
   :rdfs/domain :wdrs/Document,
   :rdfs/isDefinedBy {:rdfa/uri
                      "http://www.w3.org/TR/powder-dr/#ppErrorhandling"},
   :rdfs/label #xsd/langString "data error@en"})

(def describedby
  "An RDF property to exactly match the describedby relationship type introduced in http://www.w3.org/TR/powder-dr/#assoc-linking and formally defined in appendix D of the same document, i.e. the relationship A 'describedby' B asserts that resource B provides a description of resource A. There are no constraints on the format or representation of either A or B, neither are there any further constraints on either resource."
  {:db/ident :wdrs/describedby,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An RDF property to exactly match the describedby relationship type introduced in http://www.w3.org/TR/powder-dr/#assoc-linking and formally defined in appendix D of the same document, i.e. the relationship A 'describedby' B asserts that resource B provides a description of resource A. There are no constraints on the format or representation of either A or B, neither are there any further constraints on either resource.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/powder-dr/#semlink"},
   :rdfs/label #xsd/langString "described by@en"})

(def error_code
  "A property denoting the code of any error encountered by the POWDER processor."
  {:db/ident :wdrs/error_code,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A property denoting the code of any error encountered by the POWDER processor.@en",
   :rdfs/isDefinedBy {:rdfa/uri
                      "http://www.w3.org/TR/powder-dr/#ppErrorhandling"},
   :rdfs/label #xsd/langString "error code@en",
   :rdfs/range :xsd/nonNegativeInteger})

(def hasIRI
  "This property is meant to be used in OWL2 instead of wdrs:matchesregex. It denotes the string data range corresponding to a set of IRIs."
  {:db/ident :wdrs/hasIRI,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "This property is meant to be used in OWL2 instead of wdrs:matchesregex. It denotes the string data range corresponding to a set of IRIs.@en",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy {:rdfa/uri
                      "http://www.w3.org/TR/powder-formal/#oxRegexSemantics"},
   :rdfs/label #xsd/langString "has IRI@en",
   :rdfs/range :xsd/anyURI})

(def issuedby
  "This property denotes the author of a POWDER document."
  {:db/ident :wdrs/issuedby,
   :rdf/type [:owl/AnnotationProperty :rdf/Property],
   :rdfs/comment #xsd/langString
                  "This property denotes the author of a POWDER document.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/powder-dr/#line3"},
   :rdfs/label #xsd/langString "issued by@en"})

(def logo
  "Points to a graphic summary for the resources in a given class. Typically, it is a logo denoting conformance of a given (set of) resource(s) to a given set of criteria."
  {:db/ident :wdrs/logo,
   :rdf/type [:owl/AnnotationProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "Points to a graphic summary for the resources in a given class. Typically, it is a logo denoting conformance of a given (set of) resource(s) to a given set of criteria.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/powder-dr/#line13"},
   :rdfs/label #xsd/langString "logo@en"})

(def matchesregex
  "This is the key 'include' property for IRI set definitions in POWDER-S. It is necessary to take account of the POWDER Semantic Extension to process this fully. The value is a regular expression that is matched against an IRI."
  {:db/ident :wdrs/matchesregex,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "This is the key 'include' property for IRI set definitions in POWDER-S. It is necessary to take account of the POWDER Semantic Extension to process this fully. The value is a regular expression that is matched against an IRI.@en",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy {:rdfa/uri
                      "http://www.w3.org/TR/powder-formal/#regexSemantics"},
   :rdfs/label #xsd/langString "matches regular expression@en",
   :rdfs/range :xsd/string,
   :rdfs/seeAlso {:rdfa/uri
                  "http://www.w3.org/TR/xpath-functions/#regex-syntax"}})

(def notknownto
  "Property used in results returned from a POWDER Processor that has no data about the candidate resource. The value is the IRI of the processor."
  {:db/ident :wdrs/notknownto,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Property used in results returned from a POWDER Processor that has no data about the candidate resource. The value is the IRI of the processor.@en",
   :rdfs/isDefinedBy {:rdfa/uri
                      "http://www.w3.org/TR/powder-dr/#powderprocessor"},
   :rdfs/label #xsd/langString "not known to@en",
   :rdfs/range :wdrs/Processor})

(def notmatchesregex
  "This is the key 'exclude' property for IRI set definitions in POWDER-S. It is necessary to take account of the POWDER Semantic Extension to process this fully. The value is a regular expression that is matched against an IRI."
  {:db/ident :wdrs/notmatchesregex,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "This is the key 'exclude' property for IRI set definitions in POWDER-S. It is necessary to take account of the POWDER Semantic Extension to process this fully. The value is a regular expression that is matched against an IRI.@en",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy {:rdfa/uri
                      "http://www.w3.org/TR/powder-formal/#regexSemantics"},
   :rdfs/label #xsd/langString "matches regular expression@en",
   :rdfs/range :xsd/string,
   :rdfs/seeAlso {:rdfa/uri
                  "http://www.w3.org/TR/xpath-functions/#regex-syntax"}})

(def proc_error
  "A property denoting a description of the specific software error."
  {:db/ident :wdrs/proc_error,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A property denoting a description of the specific software error.@en",
   :rdfs/domain :wdrs/Processor,
   :rdfs/isDefinedBy {:rdfa/uri
                      "http://www.w3.org/TR/powder-dr/#ppErrorhandling"},
   :rdfs/label #xsd/langString "processing error@en"})

(def sha1sum
  "Links to a Base64-encoded binary SHA-1 hash of the described resource. May be used by POWDER Processors when assessing trustworthiness of a DR."
  {:db/ident :wdrs/sha1sum,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Links to a Base64-encoded binary SHA-1 hash of the described resource. May be used by POWDER Processors when assessing trustworthiness of a DR.@en",
   :rdfs/isDefinedBy {:rdfa/uri
                      "http://www.w3.org/TR/powder-dr/#certification"},
   :rdfs/label #xsd/langString "SHA-1 sum@en",
   :rdfs/range :xsd/base64Binary})

(def supportedby
  "A property that links a POWDER document to some other data source that supports the descriptions provided."
  {:db/ident :wdrs/supportedby,
   :rdf/type [:owl/AnnotationProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "A property that links a POWDER document to some other data source that supports the descriptions provided.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/powder-dr/#supportedBy"},
   :rdfs/label #xsd/langString "supported by@en"})

(def tag
  "Property linking to a free-text tag which may include spaces."
  {:db/ident :wdrs/tag,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "Property linking to a free-text tag which may include spaces.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/powder-dr/#tags"},
   :rdfs/label #xsd/langString "tag@en",
   :rdfs/range :xsd/token})

(def text
  "This property provides a summary of the descriptorset that it annotates, suitable for display to end users."
  {:db/ident :wdrs/text,
   :rdf/type [:owl/AnnotationProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "This property provides a summary of the descriptorset that it annotates, suitable for display to end users.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/powder-dr/#line13"},
   :rdfs/label #xsd/langString "text that may be displayed@en"})

(def validfrom
  "Provides a timestamp that a POWDER Processor may use when assessing trustworthiness of a POWDER document. Informally, a POWDER Processor should normally ignore data in the document before the given date."
  {:db/ident :wdrs/validfrom,
   :rdf/type [:owl/AnnotationProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "Provides a timestamp that a POWDER Processor may use when assessing trustworthiness of a POWDER document. Informally, a POWDER Processor should normally ignore data in the document before the given date.@en",
   :rdfs/isDefinedBy {:rdfa/uri
                      "http://www.w3.org/TR/powder-dr/#certification"},
   :rdfs/label #xsd/langString "valid from@en"})

(def validuntil
  "Provides a timestamp that a POWDER Processor may use when assessing trustworthiness of a POWDER document. Informally, a POWDER Processor should normally ignore data in the document after the given date."
  {:db/ident :wdrs/validuntil,
   :rdf/type [:owl/AnnotationProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "Provides a timestamp that a POWDER Processor may use when assessing trustworthiness of a POWDER document. Informally, a POWDER Processor should normally ignore data in the document after the given date.@en",
   :rdfs/isDefinedBy {:rdfa/uri
                      "http://www.w3.org/TR/powder-dr/#certification"},
   :rdfs/label #xsd/langString "valid until@en"})