(ns net.wikipunk.rdf.rdf
  "This is the RDF Schema for the RDF vocabulary terms in the RDF Namespace, defined in RDF 1.1 Concepts."
  {:dc11/date "2019-12-16",
   :dc11/description
   "This is the RDF Schema for the RDF vocabulary terms in the RDF Namespace, defined in RDF 1.1 Concepts.",
   :dc11/title "The RDF Concepts Vocabulary (RDF)",
   :namespaces {"dc11" "http://purl.org/dc/elements/1.1/",
                "owl"  "http://www.w3.org/2002/07/owl#",
                "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "rdf",
   :rdfa/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/TR/2004/REC-rdf-mt-20040210/"},
   :xsd/anyURI "http://www.w3.org/1999/02/22-rdf-syntax-ns#"}
  (:refer-clojure :exclude [first rest type]))

(def Alt
  {:db/ident         :rdf/Alt,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of containers of alternatives.",
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "Alt",
   :rdfs/subClassOf  :rdfs/Container})

(def Bag
  {:db/ident         :rdf/Bag,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of unordered containers.",
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "Bag",
   :rdfs/subClassOf  :rdfs/Container})

(def CompoundLiteral
  {:db/ident :rdf/CompoundLiteral,
   :rdf/type :rdfs/Class,
   :rdfs/comment "A class representing a compound literal.",
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label "CompoundLiteral",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.w3.org/TR/json-ld11/#the-rdf-compoundliteral-class-and-the-rdf-language-and-rdf-direction-properties"},
   :rdfs/subClassOf :rdfs/Resource})

(def HTML
  {:db/ident :rdf/HTML,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "The datatype of RDF literals storing fragments of HTML content",
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label "HTML",
   :rdfs/seeAlso {:xsd/anyURI
                  "http://www.w3.org/TR/rdf11-concepts/#section-html"},
   :rdfs/subClassOf :rdfs/Literal})

(def JSON
  {:db/ident         :rdf/JSON,
   :rdf/type         :rdfs/Datatype,
   :rdfs/comment     "The datatype of RDF literals storing JSON content.",
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "JSON",
   :rdfs/seeAlso     {:xsd/anyURI
                      "https://www.w3.org/TR/json-ld11/#the-rdf-json-datatype"},
   :rdfs/subClassOf  :rdfs/Literal})

(def List
  {:db/ident         :rdf/List,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of RDF Lists.",
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "List",
   :rdfs/subClassOf  :rdfs/Resource})

(def PlainLiteral
  {:db/ident :rdf/PlainLiteral,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "The class of plain (i.e. untyped) literal values, as used in RIF and OWL 2",
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label "PlainLiteral",
   :rdfs/seeAlso {:xsd/anyURI "http://www.w3.org/TR/rdf-plain-literal/"},
   :rdfs/subClassOf :rdfs/Literal})

(def Property
  {:db/ident         :rdf/Property,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of RDF properties.",
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "Property",
   :rdfs/subClassOf  :rdfs/Resource})

(def Seq
  {:db/ident         :rdf/Seq,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of ordered containers.",
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "Seq",
   :rdfs/subClassOf  :rdfs/Container})

(def Statement
  {:db/ident         :rdf/Statement,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of RDF statements.",
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "Statement",
   :rdfs/subClassOf  :rdfs/Resource})

(def XMLLiteral
  {:db/ident         :rdf/XMLLiteral,
   :rdf/type         :rdfs/Datatype,
   :rdfs/comment     "The datatype of XML literal values.",
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "XMLLiteral",
   :rdfs/subClassOf  :rdfs/Literal})

(def direction
  {:db/ident :rdf/direction,
   :rdf/type :rdf/Property,
   :rdfs/comment "The base direction component of a CompoundLiteral.",
   :rdfs/domain :rdf/CompoundLiteral,
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label "direction",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.w3.org/TR/json-ld11/#the-rdf-compoundliteral-class-and-the-rdf-language-and-rdf-direction-properties"}})

(def first
  {:db/ident         :rdf/first,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "The first item in the subject RDF list.",
   :rdfs/domain      :rdf/List,
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "first",
   :rdfs/range       :rdfs/Resource})

(def langString
  {:db/ident :rdf/langString,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment "The datatype of language-tagged string values",
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label "langString",
   :rdfs/seeAlso {:xsd/anyURI
                  "http://www.w3.org/TR/rdf11-concepts/#section-Graph-Literal"},
   :rdfs/subClassOf :rdfs/Literal})

(def language
  {:db/ident :rdf/language,
   :rdf/type :rdf/Property,
   :rdfs/comment "The language component of a CompoundLiteral.",
   :rdfs/domain :rdf/CompoundLiteral,
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label "language",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.w3.org/TR/json-ld11/#the-rdf-compoundliteral-class-and-the-rdf-language-and-rdf-direction-properties"}})

(def null
  {:db/ident :rdf/nil,
   :rdf/type :rdf/List,
   :rdfs/comment
   "The empty list, with no items in it. If the rest of a list is nil then the list has no more items in it.",
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label "nil"})

(def object
  {:db/ident         :rdf/object,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "The object of the subject RDF statement.",
   :rdfs/domain      :rdf/Statement,
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "object",
   :rdfs/range       :rdfs/Resource})

(def predicate
  {:db/ident         :rdf/predicate,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "The predicate of the subject RDF statement.",
   :rdfs/domain      :rdf/Statement,
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "predicate",
   :rdfs/range       :rdfs/Resource})

(def rest
  {:db/ident         :rdf/rest,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "The rest of the subject RDF list after the first item.",
   :rdfs/domain      :rdf/List,
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "rest",
   :rdfs/range       :rdf/List})

(def subject
  {:db/ident         :rdf/subject,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "The subject of the subject RDF statement.",
   :rdfs/domain      :rdf/Statement,
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "subject",
   :rdfs/range       :rdfs/Resource})

(def type
  {:db/ident         :rdf/type,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "The subject is an instance of a class.",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "type",
   :rdfs/range       :rdfs/Class})

(def value
  {:db/ident         :rdf/value,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "Idiomatic property used for structured values.",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "value",
   :rdfs/range       :rdfs/Resource})