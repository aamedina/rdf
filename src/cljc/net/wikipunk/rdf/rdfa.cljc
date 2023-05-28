(ns net.wikipunk.rdf.rdfa
  "This document describes the RDFa Vocabulary for Term and Prefix Assignment. The Vocabulary is used to modify RDFa 1.1 processing behavior."
  {:dcterms/creator "http://www.ivan-herman.net/foaf#me",
   :dcterms/date "2013-01-18",
   :dcterms/description
   "This document describes the RDFa Vocabulary for Term and Prefix Assignment. The Vocabulary is used to modify RDFa 1.1 processing behavior.",
   :dcterms/publisher "http://www.w3.org/data#W3C",
   :dcterms/title
   "RDFa Vocabulary for Term and Prefix Assignment, and for Processor Graph Reporting",
   :owl/versionInfo "$Date: 2013-03-11 07:54:23 $",
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
   :rdfs/isDefinedBy "http://www.w3.org/TR/rdfa-core/#s_initialcontexts"})

(def DocumentError
  "error condition; to be used when the document fails to be fully processed as a result of non-conformant host language markup"
  {:db/ident        :rdfa/DocumentError,
   :dcterms/description
   "error condition; to be used when the document fails to be fully processed as a result of non-conformant host language markup",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf [:rdfa/Error
                     :rdfa/DocumentError
                     :rdfa/PGClass
                     :rdfs/Resource]})

(def ErrorClass
  "is the class for all error conditions"
  {:db/ident        :rdfa/Error,
   :dcterms/description "is the class for all error conditions",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf [:rdfa/PGClass :rdfa/Error :rdfs/Resource]})

(def Info
  "is the class for all informations"
  {:db/ident        :rdfa/Info,
   :dcterms/description "is the class for all informations",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf [:rdfa/PGClass :rdfa/Info :rdfs/Resource]})

(def PGClass
  "is the top level class of the hierarchy"
  {:db/ident        :rdfa/PGClass,
   :dcterms/description "is the top level class of the hierarchy",
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/subClassOf [:rdfs/Resource :rdfa/PGClass]})

(def Pattern
  "Class to identify an (RDF) resource whose properties are to be copied to another resource"
  {:db/ident        :rdfa/Pattern,
   :dcterms/description
   "Class to identify an (RDF) resource whose properties are to be copied to another resource",
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/subClassOf [:rdfs/Resource :rdfa/Pattern]})

(def PrefixMapping
  "is the class for prefix mappings"
  {:db/ident        :rdfa/PrefixMapping,
   :dcterms/description "is the class for prefix mappings",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf [:rdfa/PrefixOrTermMapping
                     :rdfa/PrefixMapping
                     :rdfs/Resource]})

(def PrefixOrTermMapping
  "is the top level class for prefix or term mappings"
  {:db/ident        :rdfa/PrefixOrTermMapping,
   :dcterms/description "is the top level class for prefix or term mappings",
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/subClassOf [:rdfs/Resource :rdfa/PrefixOrTermMapping]})

(def PrefixRedefinition
  "warning; to be used when a prefix, either from the initial context or inherited from an ancestor node, is redefined in an element"
  {:db/ident        :rdfa/PrefixRedefinition,
   :dcterms/description
   "warning; to be used when a prefix, either from the initial context or inherited from an ancestor node, is redefined in an element",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf [:rdfa/Warning
                     :rdfa/PrefixRedefinition
                     :rdfa/PGClass
                     :rdfs/Resource]})

(def TermMapping
  "is the class for term mappings"
  {:db/ident        :rdfa/TermMapping,
   :dcterms/description "is the class for term mappings",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf [:rdfa/PrefixOrTermMapping
                     :rdfa/TermMapping
                     :rdfs/Resource]})

(def UnresolvedCURIE
  "warning; to be used when a CURIE prefix fails to be resolved"
  {:db/ident        :rdfa/UnresolvedCURIE,
   :dcterms/description
   "warning; to be used when a CURIE prefix fails to be resolved",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf [:rdfa/Warning
                     :rdfa/UnresolvedCURIE
                     :rdfa/PGClass
                     :rdfs/Resource]})

(def UnresolvedTerm
  "warning; to be used when a Term fails to be resolved"
  {:db/ident        :rdfa/UnresolvedTerm,
   :dcterms/description "warning; to be used when a Term fails to be resolved",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf [:rdfa/Warning
                     :rdfa/UnresolvedTerm
                     :rdfa/PGClass
                     :rdfs/Resource]})

(def VocabReferenceError
  "warning; to be used when the value of a @vocab attribute cannot be dereferenced, hence the vocabulary expansion cannot be completed"
  {:db/ident        :rdfa/VocabReferenceError,
   :dcterms/description
   "warning; to be used when the value of a @vocab attribute cannot be dereferenced, hence the vocabulary expansion cannot be completed",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf [:rdfa/Warning
                     :rdfa/VocabReferenceError
                     :rdfa/PGClass
                     :rdfs/Resource]})

(def Warning
  "is the class for all warnings"
  {:db/ident        :rdfa/Warning,
   :dcterms/description "is the class for all warnings",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf [:rdfa/PGClass :rdfa/Warning :rdfs/Resource]})

(def context
  "provides extra context for the error, eg, http response, an XPointer/XPath information, or simply the URI that created the error"
  {:db/ident           :rdfa/context,
   :dcterms/description
   "provides extra context for the error, eg, http response, an XPointer/XPath information, or simply the URI that created the error",
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain        :rdfa/PGClass,
   :rdfs/subPropertyOf :rdfa/context})

(def copy
  "identifies the resource (i.e., pattern) whose properties and values should be copied to replace the current triple (retaining the subject of the triple)."
  {:db/ident :rdfa/copy,
   :dcterms/description
   "identifies the resource (i.e., pattern) whose properties and values should be copied to replace the current triple (retaining the subject of the triple).",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/subPropertyOf :rdfa/copy})

(def prefix
  "defines a prefix mapping for a URI; the value is supposed to be a NMTOKEN"
  {:db/ident           :rdfa/prefix,
   :db/cardinality     :db.cardinality/one
   :db/valueType       :db.type/string
   :dcterms/description
   "defines a prefix mapping for a URI; the value is supposed to be a NMTOKEN",
   :rdf/type           [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain        :rdfa/PrefixMapping,
   :rdfs/subPropertyOf :rdfa/prefix})

(def term
  "defines a term mapping for a URI; the value is supposed to be a NMTOKEN"
  {:db/ident           :rdfa/term,
   :dcterms/description
   "defines a term mapping for a URI; the value is supposed to be a NMTOKEN",
   :rdf/type           [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain        :rdfa/TermMapping,
   :rdfs/subPropertyOf :rdfa/term})

(def uri
  "defines the URI for either a prefix or a term mapping; the value is supposed to be an absolute URI"
  {:db/ident           :rdfa/uri,
   :db/cardinality     :db.cardinality/one
   :db/valueType       :db.type/string
   :db/unique          :db.unique/identity
   :dcterms/description
   "defines the URI for either a prefix or a term mapping; the value is supposed to be an absolute URI",
   :rdf/type           [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain        :rdfa/PrefixOrTermMapping,
   :rdfs/subPropertyOf :rdfa/uri})

(def usesVocabulary
  "provides a relationship between the host document and a vocabulary defined using the @vocab facility of RDFa1.1"
  {:db/ident :rdfa/usesVocabulary,
   :dcterms/description
   "provides a relationship between the host document and a vocabulary\n\tdefined using the @vocab facility of RDFa1.1",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/subPropertyOf :rdfa/usesVocabulary})

(def vocabulary
  "defines an absolute URI to be used as a default vocabulary; the value is can be any string; for documentation purposes it is advised to use the string 'true' or 'True'."
  {:db/ident :rdfa/vocabulary,
   :dcterms/description
   "defines an absolute URI to be used as a default vocabulary; the value is can be any string; for documentation purposes it is advised to use the string 'true' or 'True'.",
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/subPropertyOf :rdfa/vocabulary})
