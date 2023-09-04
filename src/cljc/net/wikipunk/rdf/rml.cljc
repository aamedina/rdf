(ns net.wikipunk.rdf.rml
  "Generic Mapping Language for RDF (RDB/CSV/TSV/XML/JSON/... to RDF) - Vocabulary description"
  {:cc/license {:xsd/anyURI "http://creativecommons.org/licenses/by/3.0/"},
   :dcat/downloadURL "net/wikipunk/ext/rml.ttl",
   :dcterms/creator #{{:foaf/name "Miel Vander Sande"}
                      {:foaf/name "Anastasia Dimou"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Generic Mapping Language for RDF (RDB/CSV/TSV/XML/JSON/... to RDF) - Vocabulary description"},
   :dcterms/issued #inst "2013-07-01T00:00:00.000-00:00",
   :dcterms/modified #inst "2014-09-10T00:00:00.000-00:00",
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "RML: Generic Mapping Language for RDF"},
   :namespaces {"cc"      "http://creativecommons.org/ns#",
                "dcterms" "http://purl.org/dc/terms/",
                "foaf"    "http://xmlns.com/foaf/0.1/",
                "owl"     "http://www.w3.org/2002/07/owl#",
                "ql"      "http://semweb.mmlab.be/ns/ql#",
                "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                "rml"     "http://semweb.mmlab.be/ns/rml#",
                "rmlt"    "http://semweb.mmlab.be/ns/rml-target#",
                "rr"      "http://www.w3.org/ns/r2rml#",
                "vann"    "http://purl.org/vocab/vann/",
                "xml"     "http://www.w3.org/XML/1998/namespace",
                "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports {:xsd/anyURI "http://www.w3.org/ns/r2rml#"},
   :rdf/type #{:owl/Ontology :voaf/Vocabulary},
   :rdfa/prefix "rml",
   :rdfa/uri "http://semweb.mmlab.be/ns/rml#",
   :vann/preferredNamespacePrefix "rml",
   :vann/preferredNamespaceUri "http://semweb.mmlab.be/ns/rml#",
   :xsd/anyURI "http://semweb.mmlab.be/ns/rml"})

(def BaseSource
  {:db/ident        :rml/BaseSource,
   :rdf/type        :owl/Class,
   :rdfs/comment    #{"Base Source"
                      {:rdf/language "en",
                       :rdf/value    "Represents a base source."}},
   :rdfs/label      "Base Source",
   :rdfs/subClassOf :rml/LogicalSource})

(def LogicalSource
  {:db/ident        :rml/LogicalSource,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Represents a logical source."},
   :rdfs/label      "Logical Source",
   :rdfs/subClassOf #{{:owl/maxQualifiedCardinality 1,
                       :owl/onProperty :rml/iterator,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 1,
                       :owl/onProperty :rml/source,
                       :rdf/type       :owl/Restriction} :owl/Thing
                      {:owl/onProperty :rml/referenceFormulation,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}}})

(def ReferenceFormulation
  {:db/ident     :rml/ReferenceFormulation,
   :rdf/type     :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Represents a Reference Formulation."},
   :rdfs/label   "Reference Formulation"})

(def TriplesMap
  {:db/ident        :rml/TriplesMap,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Represents a triples map."},
   :rdfs/subClassOf #{:owl/Thing
                      {:owl/minQualifiedCardinality 1,
                       :owl/onClass    :rml/LogicalSource,
                       :owl/onProperty :rml/logicalSource,
                       :rdf/type       :owl/Restriction}
                      {:owl/onClass    :rr/SubjectMap,
                       :owl/onProperty :rr/subjectMap,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}}})

(def iterator
  {:db/ident :rml/iterator,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "an expression qualified according to the reference formulation specified for pointing to an extract of the source data. "},
   :rdfs/domain :rml/LogicalSource,
   :rdfs/label "iterator",
   :rdfs/range :xsd/string})

(def logicalSource
  {:db/ident :rml/logicalSource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Represents the logical source to be mapped. This can be a pointer to any dataset."},
   :rdfs/domain :rr/TriplesMap,
   :rdfs/label "logical source",
   :rdfs/range :rml/LogicalSource})

(def logicalTarget
  {:db/ident :rml/logicalTarget,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Represents the logical target to where triples are exported to. This can be a pointer to any dataset."},
   :rdfs/domain :rr/TriplesMap,
   :rdfs/label "logical target"})

(def query
  {:db/ident     :rml/query,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A valid query."},
   :rdfs/domain  :rml/LogicalSource})

(def reference
  {:db/ident :rml/reference,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A valid expression that selects values from the source data. The reference should confront to the syntax rules/grammar of the specified Reference Formulation. "},
   :rdfs/domain :rr/TermMap,
   :rdfs/label "reference",
   :rdfs/range :xsd/string})

(def referenceFormulation
  {:db/ident :rml/referenceFormulation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The reference formulation used to refer to extracts of the source data. "},
   :rdfs/domain :rml/LogicalSource,
   :rdfs/label "reference formulation",
   :rdfs/range :rml/ReferenceFormulation})

(def source
  {:db/ident     :rml/source,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "qualified name of the source data."},
   :rdfs/domain  :rml/LogicalSource,
   :rdfs/label   "source"})

(def version
  {:db/ident     :rml/version,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "It defines the version of the reference Formulation used. "},
   :rdfs/domain  :rml/LogicalSource,
   :rdfs/label   "version",
   :rdfs/range   :xsd/string})