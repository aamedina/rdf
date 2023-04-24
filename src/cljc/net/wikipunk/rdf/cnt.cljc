(ns net.wikipunk.rdf.cnt
  "Representing Content in RDF as defined by http://www.w3.org/TR/Content-in-RDF/"
  {:owl/imports "http://purl.org/dc/terms/",
   :owl/versionInfo {:rdf/language "en",
                     :rdf/value    "Working Draft 29 April 2011"},
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
   {:rdf/language "en",
    :rdf/value
    "Representing Content in RDF as defined by http://www.w3.org/TR/Content-in-RDF/"},
   :rdfs/isDefinedBy "http://www.w3.org/TR/Content-in-RDF/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Representing Content in RDF"},
   :rdfs/seeAlso ["http://www.w3.org/WAI/intro/earl"]}
  (:refer-clojure :exclude [bytes chars rest]))

(def Content
  "The content."
  {:db/ident     :cnt/Content,
   :rdf/type     [:owl/Class :rdfs/Class],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The content."},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Content"}})

(def ContentAsBase64
  "The base64 encoded content (can be used for binary content)."
  {:db/ident :cnt/ContentAsBase64,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The base64 encoded content (can be used for binary content)."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Base64 content"},
   :rdfs/subClassOf :cnt/Content})

(def ContentAsText
  "The text content (can be used for text content)."
  {:db/ident        :cnt/ContentAsText,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value
                     "The text content (can be used for text content)."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Text content"},
   :rdfs/subClassOf :cnt/Content})

(def ContentAsXML
  "The XML content (can only be used for XML-wellformed content)."
  {:db/ident :cnt/ContentAsXML,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The XML content (can only be used for XML-wellformed content)."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "XML content"},
   :rdfs/subClassOf :cnt/Content})

(def DoctypeDecl
  "The document type declaration."
  {:db/ident     :cnt/DoctypeDecl,
   :rdf/type     [:owl/Class :rdfs/Class],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The document type declaration."},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Document type declaration"}})

(def bytes
  "The Base64 encoded byte sequence of the content."
  {:db/ident     :cnt/bytes,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The Base64 encoded byte sequence of the content."},
   :rdfs/domain  :cnt/ContentAsBase64,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Base64 encoded byte sequence"},
   :rdfs/range   :xsd/base64Binary})

(def characterEncoding
  "The character encoding used to create a character sequence from a byte sequence or vice versa."
  {:db/ident :cnt/characterEncoding,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The character encoding used to create a character sequence from a byte sequence or vice versa."},
   :rdfs/domain :cnt/Content,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Character encoding"},
   :rdfs/range :rdfs/Literal})

(def chars
  "The character sequence of the text content."
  {:db/ident     :cnt/chars,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The character sequence of the text content."},
   :rdfs/domain  :cnt/ContentAsText,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Character sequence"},
   :rdfs/range   :rdfs/Literal})

(def declaredEncoding
  "The character encoding declared in the XML declaration."
  {:db/ident     :cnt/declaredEncoding,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The character encoding declared in the XML declaration."},
   :rdfs/domain  :cnt/ContentAsXML,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "XML character encoding"},
   :rdfs/range   :rdfs/Literal})

(def doctypeName
  "The document type name."
  {:db/ident     :cnt/doctypeName,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The document type name."},
   :rdfs/domain  :cnt/DoctypeDecl,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Document type name"},
   :rdfs/range   :rdfs/Literal})

(def dtDecl
  "The document type declaration."
  {:db/ident     :cnt/dtDecl,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The document type declaration."},
   :rdfs/domain  :cnt/ContentAsXML,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Document type declaration"},
   :rdfs/range   :cnt/DoctypeDecl})

(def internalSubset
  "The internal document type definition subset within the document type declarations."
  {:db/ident :cnt/internalSubset,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The internal document type definition subset within the document type declarations."},
   :rdfs/domain :cnt/DoctypeDecl,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Internal DTD subset"},
   :rdfs/range :rdfs/Literal})

(def leadingMisc
  "The XML content preceding the document type declaration."
  {:db/ident     :cnt/leadingMisc,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The XML content preceding the document type declaration."},
   :rdfs/domain  :cnt/ContentAsXML,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "XML leading misc"},
   :rdfs/range   :rdfs/XMLLiteral})

(def publicId
  "The document type declarations's public identifier."
  {:db/ident     :cnt/publicId,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The document type declarations's public identifier."},
   :rdfs/domain  :cnt/DoctypeDecl,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Public ID"},
   :rdfs/range   :rdfs/Literal})

(def rest
  "The XML content following the document type declaration."
  {:db/ident     :cnt/rest,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The XML content following the document type declaration."},
   :rdfs/domain  :cnt/ContentAsXML,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "XML rest"},
   :rdfs/range   :rdfs/XMLLiteral})

(def standalone
  "The standalone declaration in the XML declaration."
  {:db/ident     :cnt/standalone,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The standalone declaration in the XML declaration."},
   :rdfs/domain  :cnt/ContentAsXML,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "XML standalone document declaration"},
   :rdfs/range   :rdfs/Literal})

(def systemId
  "The document type declarations's system identifier (typed: xsd:anyURI)"
  {:db/ident :cnt/systemId,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The document type declarations's system identifier (typed: xsd:anyURI)"},
   :rdfs/domain :cnt/DoctypeDecl,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "System ID"},
   :rdfs/range :xsd/anyURI})

(def version
  "The XML version declared in the XML declaration."
  {:db/ident     :cnt/version,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The XML version declared in the XML declaration."},
   :rdfs/domain  :cnt/ContentAsXML,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "XML version"},
   :rdfs/range   :rdfs/Literal})