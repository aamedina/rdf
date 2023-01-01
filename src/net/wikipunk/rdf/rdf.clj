(ns net.wikipunk.rdf.rdf
  "This is the RDF Schema for the RDF vocabulary terms in the RDF Namespace, defined in RDF 1.1 Concepts."
  {:dcterms/date "2019-12-16",
   :dcterms/description
   "This is the RDF Schema for the RDF vocabulary terms in the RDF Namespace, defined in RDF 1.1 Concepts.",
   :dcterms/title "The RDF Concepts Vocabulary (RDF)",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/elements/1.1/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfa/prefix "rdf",
   :rdfa/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfs/isDefinedBy {:rdf/uri
                      "http://www.w3.org/TR/2004/REC-rdf-mt-20040210/"}}
  (:refer-clojure :exclude [first rest type]))

(def Alt
  "The class of containers of alternatives."
  {:db/ident         :rdf/Alt,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of containers of alternatives.",
   :rdfs/isDefinedBy "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfs/label       "Alt",
   :rdfs/subClassOf  :rdfs/Container})

(def Bag
  "The class of unordered containers."
  {:db/ident         :rdf/Bag,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of unordered containers.",
   :rdfs/isDefinedBy "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfs/label       "Bag",
   :rdfs/subClassOf  :rdfs/Container})

(def CompoundLiteral
  "A class representing a compound literal."
  {:db/ident :rdf/CompoundLiteral,
   :rdf/type :rdfs/Class,
   :rdfs/comment "A class representing a compound literal.",
   :rdfs/isDefinedBy "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfs/label "CompoundLiteral",
   :rdfs/seeAlso
   "https://www.w3.org/TR/json-ld11/#the-rdf-compoundliteral-class-and-the-rdf-language-and-rdf-direction-properties",
   :rdfs/subClassOf :rdfs/Resource})

(def HTML
  "The datatype of RDF literals storing fragments of HTML content"
  {:db/ident :rdf/HTML,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "The datatype of RDF literals storing fragments of HTML content",
   :rdfs/isDefinedBy "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfs/label "HTML",
   :rdfs/seeAlso "http://www.w3.org/TR/rdf11-concepts/#section-html",
   :rdfs/subClassOf :rdfs/Literal})

(def JSON
  "The datatype of RDF literals storing JSON content."
  {:db/ident         :rdf/JSON,
   :rdf/type         :rdfs/Datatype,
   :rdfs/comment     "The datatype of RDF literals storing JSON content.",
   :rdfs/isDefinedBy "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfs/label       "JSON",
   :rdfs/seeAlso     "https://www.w3.org/TR/json-ld11/#the-rdf-json-datatype",
   :rdfs/subClassOf  :rdfs/Literal})

(def List
  "The class of RDF Lists."
  {:db/ident         :rdf/List,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of RDF Lists.",
   :rdfs/isDefinedBy "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfs/label       "List",
   :rdfs/subClassOf  :rdfs/Resource})

(def PlainLiteral
  "The class of plain (i.e. untyped) literal values, as used in RIF and OWL 2"
  {:db/ident :rdf/PlainLiteral,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "The class of plain (i.e. untyped) literal values, as used in RIF and OWL 2",
   :rdfs/isDefinedBy "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfs/label "PlainLiteral",
   :rdfs/seeAlso "http://www.w3.org/TR/rdf-plain-literal/",
   :rdfs/subClassOf :rdfs/Literal})

(def Property
  "The class of RDF properties."
  {:db/ident         :rdf/Property,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of RDF properties.",
   :rdfs/isDefinedBy "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfs/label       "Property",
   :rdfs/subClassOf  :rdfs/Resource})

(def Seq
  "The class of ordered containers."
  {:db/ident         :rdf/Seq,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of ordered containers.",
   :rdfs/isDefinedBy "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfs/label       "Seq",
   :rdfs/subClassOf  :rdfs/Container})

(def Statement
  "The class of RDF statements."
  {:db/ident         :rdf/Statement,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of RDF statements.",
   :rdfs/isDefinedBy "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfs/label       "Statement",
   :rdfs/subClassOf  :rdfs/Resource})

(def XMLLiteral
  "The datatype of XML literal values."
  {:db/ident         :rdf/XMLLiteral,
   :rdf/type         :rdfs/Datatype,
   :rdfs/comment     "The datatype of XML literal values.",
   :rdfs/isDefinedBy "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfs/label       "XMLLiteral",
   :rdfs/subClassOf  :rdfs/Literal})

(def direction
  "The base direction component of a CompoundLiteral."
  {:db/ident :rdf/direction,
   :rdf/type :rdf/Property,
   :rdfs/comment "The base direction component of a CompoundLiteral.",
   :rdfs/domain :rdf/CompoundLiteral,
   :rdfs/isDefinedBy "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfs/label "direction",
   :rdfs/seeAlso
   "https://www.w3.org/TR/json-ld11/#the-rdf-compoundliteral-class-and-the-rdf-language-and-rdf-direction-properties"})

(def first
  "The first item in the subject RDF list."
  {:db/ident         :rdf/first,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "The first item in the subject RDF list.",
   :rdfs/domain      :rdf/List,
   :rdfs/isDefinedBy "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfs/label       "first",
   :rdfs/range       :rdfs/Resource})

(def langString
  "The datatype of language-tagged string values"
  {:db/ident :rdf/langString,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment "The datatype of language-tagged string values",
   :rdfs/isDefinedBy "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfs/label "langString",
   :rdfs/seeAlso "http://www.w3.org/TR/rdf11-concepts/#section-Graph-Literal",
   :rdfs/subClassOf :rdfs/Literal})

(def language
  "The language component of a CompoundLiteral."
  {:db/ident :rdf/language,
   :rdf/type :rdf/Property,
   :rdfs/comment "The language component of a CompoundLiteral.",
   :rdfs/domain :rdf/CompoundLiteral,
   :rdfs/isDefinedBy "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfs/label "language",
   :rdfs/seeAlso
   "https://www.w3.org/TR/json-ld11/#the-rdf-compoundliteral-class-and-the-rdf-language-and-rdf-direction-properties"})

(def null
  "The empty list, with no items in it. If the rest of a list is nil then the list has no more items in it."
  {:db/ident :rdf/nil,
   :rdf/type :rdf/List,
   :rdfs/comment
   "The empty list, with no items in it. If the rest of a list is nil then the list has no more items in it.",
   :rdfs/isDefinedBy "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfs/label "nil"})

(def object
  "The object of the subject RDF statement."
  {:db/ident         :rdf/object,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "The object of the subject RDF statement.",
   :rdfs/domain      :rdf/Statement,
   :rdfs/isDefinedBy "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfs/label       "object",
   :rdfs/range       :rdfs/Resource})

(def predicate
  "The predicate of the subject RDF statement."
  {:db/ident         :rdf/predicate,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "The predicate of the subject RDF statement.",
   :rdfs/domain      :rdf/Statement,
   :rdfs/isDefinedBy "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfs/label       "predicate",
   :rdfs/range       :rdfs/Resource})

(def rest
  "The rest of the subject RDF list after the first item."
  {:db/ident         :rdf/rest,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "The rest of the subject RDF list after the first item.",
   :rdfs/domain      :rdf/List,
   :rdfs/isDefinedBy "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfs/label       "rest",
   :rdfs/range       :rdf/List})

(def subject
  "The subject of the subject RDF statement."
  {:db/ident         :rdf/subject,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "The subject of the subject RDF statement.",
   :rdfs/domain      :rdf/Statement,
   :rdfs/isDefinedBy "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfs/label       "subject",
   :rdfs/range       :rdfs/Resource})

(def type
  "The subject is an instance of a class."
  {:db/ident         :rdf/type,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "The subject is an instance of a class.",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfs/label       "type",
   :rdfs/range       :rdfs/Class})

(def value
  "Idiomatic property used for structured values."
  {:db/ident         :rdf/value,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "Idiomatic property used for structured values.",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfs/label       "value",
   :rdfs/range       :rdfs/Resource})