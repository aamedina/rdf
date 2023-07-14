(ns net.wikipunk.rdf.rdfa
  "This document describes the RDFa Vocabulary for Term and Prefix Assignment. The Vocabulary is used to modify RDFa 1.1 processing behavior."
  {:dcterms/creator {:rdfa/uri "http://www.ivan-herman.net/foaf#me"},
   :dcterms/date #xsd/string "2013-01-18",
   :dcterms/description
   #xsd/string
    "This document describes the RDFa Vocabulary for Term and Prefix Assignment. The Vocabulary is used to modify RDFa 1.1 processing behavior.",
   :dcterms/publisher {:rdfa/uri "http://www.w3.org/data#W3C"},
   :dcterms/title
   #xsd/string
    "RDFa Vocabulary for Term and Prefix Assignment, and for Processor Graph Reporting",
   :owl/versionInfo #xsd/string "$Date: 2013-03-11 07:54:23 $",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfa"    "http://www.w3.org/ns/rdfa#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "rdfa",
   :rdfa/uri "http://www.w3.org/ns/rdfa#",
   :rdfs/isDefinedBy {:rdfa/uri
                      "http://www.w3.org/TR/rdfa-core/#s_initialcontexts"}})

(def DocumentError
  "error condition; to be used when the document fails to be fully processed as a result of non-conformant host language markup"
  {:db/ident        :rdfa/DocumentError,
   :dcterms/description
   #xsd/string
    "error condition; to be used when the document fails to be fully processed as a result of non-conformant host language markup",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf [:rdfa/Error :rdfs/Resource :rdfa/PGClass]})

(def ErrorClass
  "is the class for all error conditions"
  {:db/ident        :rdfa/Error,
   :dcterms/description #xsd/string "is the class for all error conditions",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf [:rdfa/PGClass :rdfs/Resource]})

(def Info
  "is the class for all informations"
  {:db/ident        :rdfa/Info,
   :dcterms/description #xsd/string "is the class for all informations",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf [:rdfa/PGClass :rdfs/Resource]})

(def PGClass
  "is the top level class of the hierarchy"
  {:db/ident        :rdfa/PGClass,
   :dcterms/description #xsd/string "is the top level class of the hierarchy",
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/subClassOf :rdfs/Resource})

(def Pattern
  "Class to identify an (RDF) resource whose properties are to be copied to another resource"
  {:db/ident        :rdfa/Pattern,
   :dcterms/description
   #xsd/string
    "Class to identify an (RDF) resource whose properties are to be copied to another resource",
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/subClassOf :rdfs/Resource})

(def PrefixMapping
  "is the class for prefix mappings"
  {:db/ident        :rdfa/PrefixMapping,
   :dcterms/description #xsd/string "is the class for prefix mappings",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf [:rdfa/PrefixOrTermMapping :rdfs/Resource]})

(def PrefixOrTermMapping
  "is the top level class for prefix or term mappings"
  {:db/ident        :rdfa/PrefixOrTermMapping,
   :dcterms/description #xsd/string
                         "is the top level class for prefix or term mappings",
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/subClassOf :rdfs/Resource})

(def PrefixRedefinition
  "warning; to be used when a prefix, either from the initial context or inherited from an ancestor node, is redefined in an element"
  {:db/ident        :rdfa/PrefixRedefinition,
   :dcterms/description
   #xsd/string
    "warning; to be used when a prefix, either from the initial context or inherited from an ancestor node, is redefined in an element",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf [:rdfa/Warning :rdfs/Resource :rdfa/PGClass]})

(def TermMapping
  "is the class for term mappings"
  {:db/ident        :rdfa/TermMapping,
   :dcterms/description #xsd/string "is the class for term mappings",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf [:rdfa/PrefixOrTermMapping :rdfs/Resource]})

(def UnresolvedCURIE
  "warning; to be used when a CURIE prefix fails to be resolved"
  {:db/ident        :rdfa/UnresolvedCURIE,
   :dcterms/description
   #xsd/string "warning; to be used when a CURIE prefix fails to be resolved",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf [:rdfa/Warning :rdfs/Resource :rdfa/PGClass]})

(def UnresolvedTerm
  "warning; to be used when a Term fails to be resolved"
  {:db/ident        :rdfa/UnresolvedTerm,
   :dcterms/description #xsd/string
                         "warning; to be used when a Term fails to be resolved",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf [:rdfa/Warning :rdfs/Resource :rdfa/PGClass]})

(def VocabReferenceError
  "warning; to be used when the value of a @vocab attribute cannot be dereferenced, hence the vocabulary expansion cannot be completed"
  {:db/ident        :rdfa/VocabReferenceError,
   :dcterms/description
   #xsd/string
    "warning; to be used when the value of a @vocab attribute cannot be dereferenced, hence the vocabulary expansion cannot be completed",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf [:rdfa/Warning :rdfs/Resource :rdfa/PGClass]})

(def Warning
  "is the class for all warnings"
  {:db/ident        :rdfa/Warning,
   :dcterms/description #xsd/string "is the class for all warnings",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf [:rdfa/PGClass :rdfs/Resource]})

(def context
  "provides extra context for the error, eg, http response, an XPointer/XPath information, or simply the URI that created the error"
  {:db/ident    :rdfa/context,
   :dcterms/description
   #xsd/string
    "provides extra context for the error, eg, http response, an XPointer/XPath information, or simply the URI that created the error",
   :rdf/type    [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :rdfa/PGClass})

(def copy
  "identifies the resource (i.e., pattern) whose properties and values should be copied to replace the current triple (retaining the subject of the triple)."
  {:db/ident :rdfa/copy,
   :dcterms/description
   #xsd/string
    "identifies the resource (i.e., pattern) whose properties and values should be copied to replace the current triple (retaining the subject of the triple).",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def prefix
  "defines a prefix mapping for a URI; the value is supposed to be a NMTOKEN"
  {:db/ident    :rdfa/prefix,
   :dcterms/description
   #xsd/string
    "defines a prefix mapping for a URI; the value is supposed to be a NMTOKEN",
   :rdf/type    [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain :rdfa/PrefixMapping})

(def term
  "defines a term mapping for a URI; the value is supposed to be a NMTOKEN"
  {:db/ident    :rdfa/term,
   :dcterms/description
   #xsd/string
    "defines a term mapping for a URI; the value is supposed to be a NMTOKEN",
   :rdf/type    [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain :rdfa/TermMapping})

(def uri
  "defines the URI for either a prefix or a term mapping; the value is supposed to be an absolute URI"
  {:db/ident    :rdfa/uri,
   :dcterms/description
   #xsd/string
    "defines the URI for either a prefix or a term mapping; the value is supposed to be an absolute URI",
   :rdf/type    [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain :rdfa/PrefixOrTermMapping})

(def usesVocabulary
  "provides a relationship between the host document and a vocabulary\n\tdefined using the @vocab facility of RDFa1.1"
  {:db/ident :rdfa/usesVocabulary,
   :dcterms/description
   #xsd/string
    "provides a relationship between the host document and a vocabulary\n\tdefined using the @vocab facility of RDFa1.1",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def vocabulary
  "defines an absolute URI to be used as a default vocabulary; the value is can be any string; for documentation purposes it is advised to use the string 'true' or 'True'."
  {:db/ident :rdfa/vocabulary,
   :dcterms/description
   #xsd/string
    "defines an absolute URI to be used as a default vocabulary; the value is can be any string; for documentation purposes it is advised to use the string 'true' or 'True'.",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})