(ns net.wikipunk.rdf.cnt
  "Representing Content in RDF as defined by http://www.w3.org/TR/Content-in-RDF/"
  {:owl/imports "http://purl.org/dc/terms/",
   :owl/versionInfo "Working Draft 29 April 2011",
   :rdf/ns-prefix-map {"cnt"     "http://www.w3.org/2011/content#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "cnt",
   :rdfa/uri "http://www.w3.org/2011/content",
   :rdfs/comment
   "Representing Content in RDF as defined by http://www.w3.org/TR/Content-in-RDF/",
   :rdfs/isDefinedBy "http://www.w3.org/TR/Content-in-RDF/",
   :rdfs/label "Representing Content in RDF",
   :rdfs/seeAlso ["http://www.w3.org/WAI/intro/earl"]}
  (:refer-clojure :exclude [bytes chars rest]))

(def Content
  "The content."
  {:db/ident        :cnt/Content,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "The content.",
   :rdfs/label      "Content",
   :rdfs/subClassOf [:rdfs/Resource :cnt/Content]})

(def ContentAsBase64
  "The base64 encoded content (can be used for binary content)."
  {:db/ident :cnt/ContentAsBase64,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment "The base64 encoded content (can be used for binary content).",
   :rdfs/label "Base64 content",
   :rdfs/subClassOf [:cnt/Content :cnt/ContentAsBase64 :rdfs/Resource]})

(def ContentAsText
  "The text content (can be used for text content)."
  {:db/ident        :cnt/ContentAsText,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "The text content (can be used for text content).",
   :rdfs/label      "Text content",
   :rdfs/subClassOf [:cnt/Content :cnt/ContentAsText :rdfs/Resource]})

(def ContentAsXML
  "The XML content (can only be used for XML-wellformed content)."
  {:db/ident :cnt/ContentAsXML,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "The XML content (can only be used for XML-wellformed content).",
   :rdfs/label "XML content",
   :rdfs/subClassOf [:cnt/Content :cnt/ContentAsXML :rdfs/Resource]})

(def DoctypeDecl
  "The document type declaration."
  {:db/ident        :cnt/DoctypeDecl,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "The document type declaration.",
   :rdfs/label      "Document type declaration",
   :rdfs/subClassOf [:rdfs/Resource :cnt/DoctypeDecl]})

(def bytes
  "The Base64 encoded byte sequence of the content."
  {:db/ident           :cnt/bytes,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The Base64 encoded byte sequence of the content.",
   :rdfs/domain        :cnt/ContentAsBase64,
   :rdfs/label         "Base64 encoded byte sequence",
   :rdfs/range         :xsd/base64Binary,
   :rdfs/subPropertyOf :cnt/bytes})

(def characterEncoding
  "The character encoding used to create a character sequence from a byte sequence or vice versa."
  {:db/ident :cnt/characterEncoding,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "The character encoding used to create a character sequence from a byte sequence or vice versa.",
   :rdfs/domain :cnt/Content,
   :rdfs/label "Character encoding",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :cnt/characterEncoding})

(def chars
  "The character sequence of the text content."
  {:db/ident           :cnt/chars,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The character sequence of the text content.",
   :rdfs/domain        :cnt/ContentAsText,
   :rdfs/label         "Character sequence",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :cnt/chars})

(def declaredEncoding
  "The character encoding declared in the XML declaration."
  {:db/ident :cnt/declaredEncoding,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The character encoding declared in the XML declaration.",
   :rdfs/domain :cnt/ContentAsXML,
   :rdfs/label "XML character encoding",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :cnt/declaredEncoding})

(def doctypeName
  "The document type name."
  {:db/ident           :cnt/doctypeName,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The document type name.",
   :rdfs/domain        :cnt/DoctypeDecl,
   :rdfs/label         "Document type name",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :cnt/doctypeName})

(def dtDecl
  "The document type declaration."
  {:db/ident           :cnt/dtDecl,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The document type declaration.",
   :rdfs/domain        :cnt/ContentAsXML,
   :rdfs/label         "Document type declaration",
   :rdfs/range         :cnt/DoctypeDecl,
   :rdfs/subPropertyOf :cnt/dtDecl})

(def internalSubset
  "The internal document type definition subset within the document type declarations."
  {:db/ident :cnt/internalSubset,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "The internal document type definition subset within the document type declarations.",
   :rdfs/domain :cnt/DoctypeDecl,
   :rdfs/label "Internal DTD subset",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :cnt/internalSubset})

(def leadingMisc
  "The XML content preceding the document type declaration."
  {:db/ident :cnt/leadingMisc,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The XML content preceding the document type declaration.",
   :rdfs/domain :cnt/ContentAsXML,
   :rdfs/label "XML leading misc",
   :rdfs/range :rdfs/XMLLiteral,
   :rdfs/subPropertyOf :cnt/leadingMisc})

(def publicId
  "The document type declarations's public identifier."
  {:db/ident           :cnt/publicId,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The document type declarations's public identifier.",
   :rdfs/domain        :cnt/DoctypeDecl,
   :rdfs/label         "Public ID",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :cnt/publicId})

(def rest
  "The XML content following the document type declaration."
  {:db/ident :cnt/rest,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The XML content following the document type declaration.",
   :rdfs/domain :cnt/ContentAsXML,
   :rdfs/label "XML rest",
   :rdfs/range :rdfs/XMLLiteral,
   :rdfs/subPropertyOf :cnt/rest})

(def standalone
  "The standalone declaration in the XML declaration."
  {:db/ident           :cnt/standalone,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The standalone declaration in the XML declaration.",
   :rdfs/domain        :cnt/ContentAsXML,
   :rdfs/label         "XML standalone document declaration",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :cnt/standalone})

(def systemId
  "The document type declarations's system identifier (typed: xsd:anyURI)"
  {:db/ident :cnt/systemId,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "The document type declarations's system identifier (typed: xsd:anyURI)",
   :rdfs/domain :cnt/DoctypeDecl,
   :rdfs/label "System ID",
   :rdfs/range :xsd/anyURI,
   :rdfs/subPropertyOf :cnt/systemId})

(def version
  "The XML version declared in the XML declaration."
  {:db/ident           :cnt/version,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The XML version declared in the XML declaration.",
   :rdfs/domain        :cnt/ContentAsXML,
   :rdfs/label         "XML version",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :cnt/version})