(ns net.wikipunk.rdf.cnt
  "Representing Content in RDF as defined by http://www.w3.org/TR/Content-in-RDF/"
  {:dcat/downloadURL "resources/content.rdf",
   :owl/imports {:rdfa/uri "http://purl.org/dc/terms/"},
   :owl/versionInfo #xsd/langString "Working Draft 29 April 2011@en",
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
   #xsd/langString
    "Representing Content in RDF as defined by http://www.w3.org/TR/Content-in-RDF/@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/Content-in-RDF/"},
   :rdfs/label #xsd/langString "Representing Content in RDF@en",
   :rdfs/seeAlso {:rdfa/uri "http://www.w3.org/WAI/intro/earl"}}
  (:refer-clojure :exclude [bytes chars rest]))

(def Content
  "The content."
  {:db/ident        :cnt/Content,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    #xsd/langString "The content.@en",
   :rdfs/label      #xsd/langString "Content@en",
   :rdfs/subClassOf :rdfs/Resource})

(def ContentAsBase64
  "The base64 encoded content (can be used for binary content)."
  {:db/ident :cnt/ContentAsBase64,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/langString
    "The base64 encoded content (can be used for binary content).@en",
   :rdfs/label #xsd/langString "Base64 content@en",
   :rdfs/subClassOf [:cnt/Content :rdfs/Resource]})

(def ContentAsText
  "The text content (can be used for text content)."
  {:db/ident        :cnt/ContentAsText,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    #xsd/langString
                     "The text content (can be used for text content).@en",
   :rdfs/label      #xsd/langString "Text content@en",
   :rdfs/subClassOf [:cnt/Content :rdfs/Resource]})

(def ContentAsXML
  "The XML content (can only be used for XML-wellformed content)."
  {:db/ident :cnt/ContentAsXML,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/langString
    "The XML content (can only be used for XML-wellformed content).@en",
   :rdfs/label #xsd/langString "XML content@en",
   :rdfs/subClassOf [:cnt/Content :rdfs/Resource]})

(def DoctypeDecl
  "The document type declaration."
  {:db/ident        :cnt/DoctypeDecl,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    #xsd/langString "The document type declaration.@en",
   :rdfs/label      #xsd/langString "Document type declaration@en",
   :rdfs/subClassOf :rdfs/Resource})

(def bytes
  "The Base64 encoded byte sequence of the content."
  {:db/ident     :cnt/bytes,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment #xsd/langString
                  "The Base64 encoded byte sequence of the content.@en",
   :rdfs/domain  :cnt/ContentAsBase64,
   :rdfs/label   #xsd/langString "Base64 encoded byte sequence@en",
   :rdfs/range   :xsd/base64Binary})

(def characterEncoding
  "The character encoding used to create a character sequence from a byte sequence or vice versa."
  {:db/ident :cnt/characterEncoding,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "The character encoding used to create a character sequence from a byte sequence or vice versa.@en",
   :rdfs/domain :cnt/Content,
   :rdfs/label #xsd/langString "Character encoding@en",
   :rdfs/range :rdfs/Literal})

(def chars
  "The character sequence of the text content."
  {:db/ident     :cnt/chars,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment #xsd/langString
                  "The character sequence of the text content.@en",
   :rdfs/domain  :cnt/ContentAsText,
   :rdfs/label   #xsd/langString "Character sequence@en",
   :rdfs/range   :rdfs/Literal})

(def declaredEncoding
  "The character encoding declared in the XML declaration."
  {:db/ident     :cnt/declaredEncoding,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment #xsd/langString
                  "The character encoding declared in the XML declaration.@en",
   :rdfs/domain  :cnt/ContentAsXML,
   :rdfs/label   #xsd/langString "XML character encoding@en",
   :rdfs/range   :rdfs/Literal})

(def doctypeName
  "The document type name."
  {:db/ident     :cnt/doctypeName,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment #xsd/langString "The document type name.@en",
   :rdfs/domain  :cnt/DoctypeDecl,
   :rdfs/label   #xsd/langString "Document type name@en",
   :rdfs/range   :rdfs/Literal})

(def dtDecl
  "The document type declaration."
  {:db/ident     :cnt/dtDecl,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment #xsd/langString "The document type declaration.@en",
   :rdfs/domain  :cnt/ContentAsXML,
   :rdfs/label   #xsd/langString "Document type declaration@en",
   :rdfs/range   :cnt/DoctypeDecl})

(def internalSubset
  "The internal document type definition subset within the document type declarations."
  {:db/ident :cnt/internalSubset,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "The internal document type definition subset within the document type declarations.@en",
   :rdfs/domain :cnt/DoctypeDecl,
   :rdfs/label #xsd/langString "Internal DTD subset@en",
   :rdfs/range :rdfs/Literal})

(def leadingMisc
  "The XML content preceding the document type declaration."
  {:db/ident     :cnt/leadingMisc,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment #xsd/langString
                  "The XML content preceding the document type declaration.@en",
   :rdfs/domain  :cnt/ContentAsXML,
   :rdfs/label   #xsd/langString "XML leading misc@en",
   :rdfs/range   :rdf/XMLLiteral})

(def publicId
  "The document type declarations's public identifier."
  {:db/ident     :cnt/publicId,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment #xsd/langString
                  "The document type declarations's public identifier.@en",
   :rdfs/domain  :cnt/DoctypeDecl,
   :rdfs/label   #xsd/langString "Public ID@en",
   :rdfs/range   :rdfs/Literal})

(def rest
  "The XML content following the document type declaration."
  {:db/ident     :cnt/rest,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment #xsd/langString
                  "The XML content following the document type declaration.@en",
   :rdfs/domain  :cnt/ContentAsXML,
   :rdfs/label   #xsd/langString "XML rest@en",
   :rdfs/range   :rdf/XMLLiteral})

(def standalone
  "The standalone declaration in the XML declaration."
  {:db/ident     :cnt/standalone,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment #xsd/langString
                  "The standalone declaration in the XML declaration.@en",
   :rdfs/domain  :cnt/ContentAsXML,
   :rdfs/label   #xsd/langString "XML standalone document declaration@en",
   :rdfs/range   :rdfs/Literal})

(def systemId
  "The document type declarations's system identifier (typed: xsd:anyURI)"
  {:db/ident :cnt/systemId,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "The document type declarations's system identifier (typed: xsd:anyURI)@en",
   :rdfs/domain :cnt/DoctypeDecl,
   :rdfs/label #xsd/langString "System ID@en",
   :rdfs/range :xsd/anyURI})

(def version
  "The XML version declared in the XML declaration."
  {:db/ident     :cnt/version,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment #xsd/langString
                  "The XML version declared in the XML declaration.@en",
   :rdfs/domain  :cnt/ContentAsXML,
   :rdfs/label   #xsd/langString "XML version@en",
   :rdfs/range   :rdfs/Literal})