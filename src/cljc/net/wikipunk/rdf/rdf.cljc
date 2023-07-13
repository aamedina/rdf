(ns net.wikipunk.rdf.rdf
  "This is the RDF Schema for the RDF vocabulary terms in the RDF Namespace, defined in RDF 1.1 Concepts."
  {:dc11/date #xsd/string "2019-12-16",
   :dc11/description
   #xsd/string
    "This is the RDF Schema for the RDF vocabulary terms in the RDF Namespace, defined in RDF 1.1 Concepts.",
   :dc11/title #xsd/string "The RDF Concepts Vocabulary (RDF)",
   :rdf/ns-prefix-map {"dc11" "http://purl.org/dc/elements/1.1/",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type [:owl/Ontology :rdfs/Resource],
   :rdfa/prefix "rdf",
   :rdfa/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfs/isDefinedBy {:rdfa/uri
                      "http://www.w3.org/TR/2004/REC-rdf-mt-20040210/"}}
  (:refer-clojure :exclude [first rest type]))

(def Alt
  "The class of containers of alternatives."
  {:db/ident         :rdf/Alt,
   :rdf/type         [:rdfs/Class :rdfs/Resource],
   :rdfs/comment     #xsd/string "The class of containers of alternatives.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       #xsd/string "Alt",
   :rdfs/subClassOf  [:rdfs/Resource :rdfs/Container]})

(def Bag
  "The class of unordered containers."
  {:db/ident         :rdf/Bag,
   :rdf/type         [:rdfs/Class :rdfs/Resource],
   :rdfs/comment     #xsd/string "The class of unordered containers.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       #xsd/string "Bag",
   :rdfs/subClassOf  [:rdfs/Resource :rdfs/Container]})

(def CompoundLiteral
  "A class representing a compound literal."
  {:db/ident :rdf/CompoundLiteral,
   :rdf/type [:rdfs/Class :rdfs/Resource],
   :rdfs/comment #xsd/string "A class representing a compound literal.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label #xsd/string "CompoundLiteral",
   :rdfs/seeAlso
   {:rdfa/uri
    "https://www.w3.org/TR/json-ld11/#the-rdf-compoundliteral-class-and-the-rdf-language-and-rdf-direction-properties"},
   :rdfs/subClassOf :rdfs/Resource})

(def HTML
  "The datatype of RDF literals storing fragments of HTML content"
  {:db/ident :rdf/HTML,
   :rdf/type [:rdfs/Datatype :rdfs/Resource],
   :rdfs/comment
   #xsd/string "The datatype of RDF literals storing fragments of HTML content",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label #xsd/string "HTML",
   :rdfs/seeAlso {:rdfa/uri
                  "http://www.w3.org/TR/rdf11-concepts/#section-html"},
   :rdfs/subClassOf :rdfs/Literal})

(def JSON
  "The datatype of RDF literals storing JSON content."
  {:db/ident         :rdf/JSON,
   :rdf/type         [:rdfs/Datatype :rdfs/Resource],
   :rdfs/comment     #xsd/string
                      "The datatype of RDF literals storing JSON content.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       #xsd/string "JSON",
   :rdfs/seeAlso     {:rdfa/uri
                      "https://www.w3.org/TR/json-ld11/#the-rdf-json-datatype"},
   :rdfs/subClassOf  :rdfs/Literal})

(def List
  "The class of RDF Lists."
  {:db/ident         :rdf/List,
   :rdf/type         [:rdfs/Class :rdfs/Resource],
   :rdfs/comment     #xsd/string "The class of RDF Lists.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       #xsd/string "List",
   :rdfs/subClassOf  :rdfs/Resource})

(def PlainLiteral
  "The class of plain (i.e. untyped) literal values, as used in RIF and OWL 2"
  {:db/ident :rdf/PlainLiteral,
   :rdf/type [:rdfs/Datatype :rdfs/Resource],
   :rdfs/comment
   #xsd/string
    "The class of plain (i.e. untyped) literal values, as used in RIF and OWL 2",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label #xsd/string "PlainLiteral",
   :rdfs/seeAlso {:rdfa/uri "http://www.w3.org/TR/rdf-plain-literal/"},
   :rdfs/subClassOf :rdfs/Literal})

(def Property
  "The class of RDF properties."
  {:db/ident         :rdf/Property,
   :rdf/type         [:rdfs/Class :rdfs/Resource],
   :rdfs/comment     #xsd/string "The class of RDF properties.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       #xsd/string "Property",
   :rdfs/subClassOf  :rdfs/Resource})

(def Seq
  "The class of ordered containers."
  {:db/ident         :rdf/Seq,
   :rdf/type         [:rdfs/Class :rdfs/Resource],
   :rdfs/comment     #xsd/string "The class of ordered containers.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       #xsd/string "Seq",
   :rdfs/subClassOf  [:rdfs/Resource :rdfs/Container]})

(def Statement
  "The class of RDF statements."
  {:db/ident         :rdf/Statement,
   :rdf/type         [:rdfs/Class :rdfs/Resource],
   :rdfs/comment     #xsd/string "The class of RDF statements.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       #xsd/string "Statement",
   :rdfs/subClassOf  :rdfs/Resource})

(def XMLLiteral
  "The datatype of XML literal values."
  {:db/ident         :rdf/XMLLiteral,
   :rdf/type         [:rdfs/Datatype :rdfs/Resource],
   :rdfs/comment     #xsd/string "The datatype of XML literal values.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       #xsd/string "XMLLiteral",
   :rdfs/subClassOf  :rdfs/Literal})

(def direction
  "The base direction component of a CompoundLiteral."
  {:db/ident :rdf/direction,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment #xsd/string
                  "The base direction component of a CompoundLiteral.",
   :rdfs/domain :rdf/CompoundLiteral,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label #xsd/string "direction",
   :rdfs/seeAlso
   {:rdfa/uri
    "https://www.w3.org/TR/json-ld11/#the-rdf-compoundliteral-class-and-the-rdf-language-and-rdf-direction-properties"}})

(def first
  "The first item in the subject RDF list."
  {:db/ident         :rdf/first,
   :rdf/type         [:rdf/Property :rdfs/Resource],
   :rdfs/comment     #xsd/string "The first item in the subject RDF list.",
   :rdfs/domain      :rdf/List,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       #xsd/string "first",
   :rdfs/range       :rdfs/Resource})

(def langString
  "The datatype of language-tagged string values"
  {:db/ident :rdf/langString,
   :rdf/type [:rdfs/Datatype :rdfs/Resource],
   :rdfs/comment #xsd/string "The datatype of language-tagged string values",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label #xsd/string "langString",
   :rdfs/seeAlso {:rdfa/uri
                  "http://www.w3.org/TR/rdf11-concepts/#section-Graph-Literal"},
   :rdfs/subClassOf :rdfs/Literal})

(def language
  "The language component of a CompoundLiteral."
  {:db/ident :rdf/language,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment #xsd/string "The language component of a CompoundLiteral.",
   :rdfs/domain :rdf/CompoundLiteral,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label #xsd/string "language",
   :rdfs/seeAlso
   {:rdfa/uri
    "https://www.w3.org/TR/json-ld11/#the-rdf-compoundliteral-class-and-the-rdf-language-and-rdf-direction-properties"}})

(def null
  "The empty list, with no items in it. If the rest of a list is nil then the list has no more items in it."
  {:db/ident :rdf/nil,
   :rdf/type [:rdf/List :rdfs/Resource],
   :rdfs/comment
   #xsd/string
    "The empty list, with no items in it. If the rest of a list is nil then the list has no more items in it.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label #xsd/string "nil"})

(def object
  "The object of the subject RDF statement."
  {:db/ident         :rdf/object,
   :rdf/type         [:rdf/Property :rdfs/Resource],
   :rdfs/comment     #xsd/string "The object of the subject RDF statement.",
   :rdfs/domain      :rdf/Statement,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       #xsd/string "object",
   :rdfs/range       :rdfs/Resource})

(def predicate
  "The predicate of the subject RDF statement."
  {:db/ident         :rdf/predicate,
   :rdf/type         [:rdf/Property :rdfs/Resource],
   :rdfs/comment     #xsd/string "The predicate of the subject RDF statement.",
   :rdfs/domain      :rdf/Statement,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       #xsd/string "predicate",
   :rdfs/range       :rdfs/Resource})

(def rest
  "The rest of the subject RDF list after the first item."
  {:db/ident         :rdf/rest,
   :rdf/type         [:rdf/Property :rdfs/Resource],
   :rdfs/comment     #xsd/string
                      "The rest of the subject RDF list after the first item.",
   :rdfs/domain      :rdf/List,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       #xsd/string "rest",
   :rdfs/range       :rdf/List})

(def subject
  "The subject of the subject RDF statement."
  {:db/ident         :rdf/subject,
   :rdf/type         [:rdf/Property :rdfs/Resource],
   :rdfs/comment     #xsd/string "The subject of the subject RDF statement.",
   :rdfs/domain      :rdf/Statement,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       #xsd/string "subject",
   :rdfs/range       :rdfs/Resource})

(def type
  "The subject is an instance of a class."
  {:db/ident         :rdf/type,
   :rdf/type         [:rdf/Property :rdfs/Resource],
   :rdfs/comment     #xsd/string "The subject is an instance of a class.",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       #xsd/string "type",
   :rdfs/range       :rdfs/Class})

(def value
  "Idiomatic property used for structured values."
  {:db/ident         :rdf/value,
   :rdf/type         [:rdf/Property :rdfs/Resource],
   :rdfs/comment     #xsd/string
                      "Idiomatic property used for structured values.",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       #xsd/string "value",
   :rdfs/range       :rdfs/Resource})