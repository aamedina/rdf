(ns net.wikipunk.rdf.rdfa
  ^{:base       "http://www.w3.org/ns/rdfa#",
    :namespaces {"dcterms" "http://purl.org/dc/terms/",
                 "foaf"    "http://xmlns.com/foaf/0.1/",
                 "owl"     "http://www.w3.org/2002/07/owl#",
                 "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfa"    "http://www.w3.org/ns/rdfa#",
                 "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                 "xsd"     "http://www.w3.org/2001/XMLSchema#"},
    :prefix     "rdfa",
    :source     "http://www.w3.org/ns/rdfa#"}
  {:dcterms/creator {:xsd/anyURI "http://www.ivan-herman.net/foaf#me"},
   :dcterms/date "2013-01-18",
   :dcterms/description
   "This document describes the RDFa Vocabulary for Term and Prefix Assignment. The Vocabulary is used to modify RDFa 1.1 processing behavior.",
   :dcterms/publisher {:xsd/anyURI "http://www.w3.org/data#W3C"},
   :dcterms/title
   "RDFa Vocabulary for Term and Prefix Assignment, and for Processor Graph Reporting",
   :owl/versionInfo "$Date: 2013-03-11 07:54:23 $",
   :rdf/type :owl/Ontology,
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/TR/rdfa-core/#s_initialcontexts"},
   :xsd/anyURI "http://www.w3.org/ns/rdfa#"})

(def DocumentError
  {:db/ident        :rdfa/DocumentError,
   :dcterms/description
   "error condition; to be used when the document fails to be fully processed as a result of non-conformant host language markup",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :rdfa/Error})

(def ErrorClass
  {:db/ident        :rdfa/Error,
   :dcterms/description "is the class for all error conditions",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :rdfa/PGClass})

(def Info
  {:db/ident        :rdfa/Info,
   :dcterms/description "is the class for all informations",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :rdfa/PGClass})

(def PGClass
  {:db/ident :rdfa/PGClass,
   :dcterms/description "is the top level class of the hierarchy",
   :rdf/type #{:rdfs/Class :owl/Class}})

(def Pattern
  {:db/ident :rdfa/Pattern,
   :dcterms/description
   "Class to identify an (RDF) resource whose properties are to be copied to another resource",
   :rdf/type #{:rdfs/Class :owl/Class}})

(def PrefixMapping
  {:db/ident        :rdfa/PrefixMapping,
   :dcterms/description "is the class for prefix mappings",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :rdfa/PrefixOrTermMapping})

(def PrefixOrTermMapping
  {:db/ident :rdfa/PrefixOrTermMapping,
   :dcterms/description "is the top level class for prefix or term mappings",
   :rdf/type #{:rdfs/Class :owl/Class}})

(def PrefixRedefinition
  {:db/ident        :rdfa/PrefixRedefinition,
   :dcterms/description
   "warning; to be used when a prefix, either from the initial context or inherited from an ancestor node, is redefined in an element",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :rdfa/Warning})

(def TermMapping
  {:db/ident        :rdfa/TermMapping,
   :dcterms/description "is the class for term mappings",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :rdfa/PrefixOrTermMapping})

(def UnresolvedCURIE
  {:db/ident        :rdfa/UnresolvedCURIE,
   :dcterms/description
   "warning; to be used when a CURIE prefix fails to be resolved",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :rdfa/Warning})

(def UnresolvedTerm
  {:db/ident        :rdfa/UnresolvedTerm,
   :dcterms/description "warning; to be used when a Term fails to be resolved",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :rdfa/Warning})

(def VocabReferenceError
  {:db/ident        :rdfa/VocabReferenceError,
   :dcterms/description
   "warning; to be used when the value of a @vocab attribute cannot be dereferenced, hence the vocabulary expansion cannot be completed",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :rdfa/Warning})

(def Warning
  {:db/ident        :rdfa/Warning,
   :dcterms/description "is the class for all warnings",
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :rdfa/PGClass})

(def context
  {:db/ident    :rdfa/context,
   :dcterms/description
   "provides extra context for the error, eg, http response, an XPointer/XPath information, or simply the URI that created the error",
   :rdf/type    #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :rdfa/PGClass})

(def copy
  {:db/ident :rdfa/copy,
   :dcterms/description
   "identifies the resource (i.e., pattern) whose properties and values should be copied to replace the current triple (retaining the subject of the triple).",
   :rdf/type #{:owl/ObjectProperty :rdf/Property}})

(def prefix
  {:db/ident    :rdfa/prefix,
   :dcterms/description
   "defines a prefix mapping for a URI; the value is supposed to be a NMTOKEN",
   :rdf/type    #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain :rdfa/PrefixMapping})

(def term
  {:db/ident    :rdfa/term,
   :dcterms/description
   "defines a term mapping for a URI; the value is supposed to be a NMTOKEN",
   :rdf/type    #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain :rdfa/TermMapping})

(def uri
  {:db/ident    :rdfa/uri,
   :dcterms/description
   "defines the URI for either a prefix or a term mapping; the value is supposed to be an absolute URI",
   :rdf/type    #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain :rdfa/PrefixOrTermMapping})

(def usesVocabulary
  {:db/ident :rdfa/usesVocabulary,
   :dcterms/description
   "provides a relationship between the host document and a vocabulary\n\tdefined using the @vocab facility of RDFa1.1",
   :rdf/type #{:owl/ObjectProperty :rdf/Property}})

(def vocabulary
  {:db/ident :rdfa/vocabulary,
   :dcterms/description
   "defines an absolute URI to be used as a default vocabulary; the value is can be any string; for documentation purposes it is advised to use the string 'true' or 'True'.",
   :rdf/type #{:owl/DatatypeProperty :rdf/Property}})

(def urn:uuid:97f67f5b-c96e-5a90-a695-928826cf9824
  {:dcterms/creator {:xsd/anyURI "http://www.ivan-herman.net/foaf#me"},
   :dcterms/date "2013-01-18",
   :dcterms/description
   "This document describes the RDFa Vocabulary for Term and Prefix Assignment. The Vocabulary is used to modify RDFa 1.1 processing behavior.",
   :dcterms/publisher {:xsd/anyURI "http://www.w3.org/data#W3C"},
   :dcterms/title
   "RDFa Vocabulary for Term and Prefix Assignment, and for Processor Graph Reporting",
   :owl/versionInfo "$Date: 2013-03-11 07:54:23 $",
   :rdf/type :owl/Ontology,
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/TR/rdfa-core/#s_initialcontexts"},
   :xsd/anyURI "http://www.w3.org/ns/rdfa#"})

(def urn:uuid:5fb8adee-1455-54c1-95d6-adb6a1f04945
  {:foaf/mbox              {:xsd/anyURI "mailto:ivan@w3.org"},
   :foaf/name              "Ivan Herman",
   :foaf/title             "Semantic Web Activity Lead",
   :foaf/workplaceHomepage {:xsd/anyURI "http://www.w3.org"},
   :rdf/type               :foaf/Person,
   :rdfs/seeAlso           {:xsd/anyURI "http://www.ivan-herman.net/foaf"},
   :xsd/anyURI             "http://www.ivan-herman.net/foaf#me"})