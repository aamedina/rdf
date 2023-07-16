(ns net.wikipunk.rdf.rml
  "Generic Mapping Language for RDF (RDB/CSV/TSV/XML/JSON/... to RDF) - Vocabulary description"
  {:cc/license {:rdfa/uri "http://creativecommons.org/licenses/by/3.0/"},
   :dcterms/creator [{:foaf/name "Anastasia Dimou"}
                     {:foaf/name "Miel Vander Sande"}],
   :dcterms/description
   #xsd/langString
    "Generic Mapping Language for RDF (RDB/CSV/TSV/XML/JSON/... to RDF) - Vocabulary description@en",
   :dcterms/issued #xsd/date #inst "2013-07-01T00:00:00.000-04:00",
   :dcterms/modified #xsd/date #inst "2014-09-10T00:00:00.000-04:00",
   :dcterms/title #xsd/langString "RML: Generic Mapping Language for RDF@en",
   :owl/imports {:rdfa/uri "http://www.w3.org/ns/r2rml#"},
   :rdf/ns-prefix-map {"cc"      "http://creativecommons.org/ns#",
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
   :rdf/type [:voaf/Vocabulary :owl/Ontology],
   :rdfa/prefix "rml",
   :rdfa/uri "http://semweb.mmlab.be/ns/rml",
   :vann/preferredNamespacePrefix "rml",
   :vann/preferredNamespaceUri "http://semweb.mmlab.be/ns/rml#"})

(def BaseSource
  "Base Source"
  {:db/ident        :rml/BaseSource,
   :rdf/type        :owl/Class,
   :rdfs/comment    [#xsd/langString "Represents a base source.@en"
                     "Base Source"],
   :rdfs/label      "Base Source",
   :rdfs/subClassOf [:rml/LogicalSource
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty :rml/source,
                      :rdf/type       :owl/Restriction}
                     :owl/Thing
                     {:owl/onProperty :rml/referenceFormulation,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty :rml/iterator,
                      :rdf/type       :owl/Restriction}]})

(def LogicalSource
  "Represents a logical source."
  {:db/ident        :rml/LogicalSource,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "Represents a logical source.@en",
   :rdfs/label      "Logical Source",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty :rml/source,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty :rml/iterator,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty :rml/referenceFormulation,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     :owl/Thing]})

(def ReferenceFormulation
  "Represents a Reference Formulation."
  {:db/ident     :rml/ReferenceFormulation,
   :rdf/type     :owl/Class,
   :rdfs/comment #xsd/langString "Represents a Reference Formulation.@en",
   :rdfs/label   "Reference Formulation"})

(def TriplesMap
  "Represents a triples map."
  {:db/ident        :rml/TriplesMap,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/langString "Represents a triples map.@en",
   :rdfs/subClassOf [{:owl/onClass    :rr/SubjectMap,
                      :owl/onProperty :rr/subjectMap,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onClass    :rml/LogicalSource,
                      :owl/onProperty :rml/logicalSource,
                      :rdf/type       :owl/Restriction}
                     :owl/Thing]})

(def iterator
  "an expression qualified according to the reference formulation specified for pointing to an extract of the source data. "
  {:db/ident :rml/iterator,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "an expression qualified according to the reference formulation specified for pointing to an extract of the source data. @en",
   :rdfs/domain :rml/LogicalSource,
   :rdfs/label "iterator",
   :rdfs/range :xsd/string})

(def logicalSource
  "Represents the logical source to be mapped. This can be a pointer to any dataset."
  {:db/ident :rml/logicalSource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Represents the logical source to be mapped. This can be a pointer to any dataset.@en",
   :rdfs/domain :rr/TriplesMap,
   :rdfs/label "logical source",
   :rdfs/range :rml/LogicalSource})

(def logicalTarget
  "Represents the logical target to where triples are exported to. This can be a pointer to any dataset."
  {:db/ident :rml/logicalTarget,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Represents the logical target to where triples are exported to. This can be a pointer to any dataset.@en",
   :rdfs/domain :rr/TriplesMap,
   :rdfs/label "logical target",
   :rdfs/range [:void/Dataset :dcat/Dataset]})

(def query
  "A valid query."
  {:db/ident     :rml/query,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/langString "A valid query.@en",
   :rdfs/domain  :rml/LogicalSource})

(def reference
  "A valid expression that selects values from the source data. The reference should confront to the syntax rules/grammar of the specified Reference Formulation. "
  {:db/ident :rml/reference,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "A valid expression that selects values from the source data. The reference should confront to the syntax rules/grammar of the specified Reference Formulation. @en",
   :rdfs/domain :rr/TermMap,
   :rdfs/label "reference",
   :rdfs/range :xsd/string})

(def referenceFormulation
  "The reference formulation used to refer to extracts of the source data. "
  {:db/ident :rml/referenceFormulation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "The reference formulation used to refer to extracts of the source data. @en",
   :rdfs/domain :rml/LogicalSource,
   :rdfs/label "reference formulation",
   :rdfs/range :rml/ReferenceFormulation})

(def source
  "qualified name of the source data."
  {:db/ident     :rml/source,
   :rdf/type     :rdf/Property,
   :rdfs/comment #xsd/langString "qualified name of the source data.@en",
   :rdfs/domain  :rml/LogicalSource,
   :rdfs/label   "source"})

(def version
  "It defines the version of the reference Formulation used. "
  {:db/ident :rml/version,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "It defines the version of the reference Formulation used. @en",
   :rdfs/domain :rml/LogicalSource,
   :rdfs/label "version",
   :rdfs/range :xsd/string})
