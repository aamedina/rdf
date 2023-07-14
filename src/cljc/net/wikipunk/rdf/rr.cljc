(ns net.wikipunk.rdf.rr
  "Richard Cyganiak"
  {:foaf/name         #xsd/string "Richard Cyganiak",
   :rdf/ns-prefix-map {"cc"    "http://creativecommons.org/ns#",
                       "dc11"  "http://purl.org/dc/elements/1.1/",
                       "foaf"  "http://xmlns.com/foaf/0.1/",
                       "owl"   "http://www.w3.org/2002/07/owl#",
                       "r2rml" "http://www.w3.org/ns/r2rml#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "rr"    "http://www.w3.org/ns/r2rml#",
                       "vaem"  "http://www.linkedmodel.org/schema/vaem#",
                       "vann"  "http://purl.org/vocab/vann/",
                       "xml"   "http://www.w3.org/XML/1998/namespace",
                       "xsd"   "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :foaf/Person,
   :rdfa/prefix       "rr",
   :rdfa/uri          "http://richard.cyganiak.de/foaf.rdf#cygri",
   :rdfs/isDefinedBy  {:rdfa/uri
                       "http://www.w3.org/TR/2012/REC-r2rml-20120927/"}}
  (:refer-clojure :exclude [class]))

(def BaseTableOrView
  {:db/ident        :rr/BaseTableOrView,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:rr/LogicalTable :owl/Thing]})

(def BlankNode
  {:db/ident     :rr/BlankNode,
   :rdf/type     :owl/Class,
   :rdfs/comment #xsd/langString "Denotes a blank node, used with termType@en"})

(def GraphMap
  {:db/ident        :rr/GraphMap,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "Represents a graph map.@en",
   :rdfs/subClassOf :rr/TermMap})

(def IRI
  {:db/ident     :rr/IRI,
   :rdf/type     :owl/Class,
   :rdfs/comment #xsd/langString "Denotes an IRI, used with termpType.@en"})

(def Join
  {:db/ident        :rr/Join,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "Represents a join condition.@en",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rr/child,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rr/child,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rr/parent,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rr/parent,
                      :rdf/type        :owl/Restriction}
                     :owl/Thing]})

(def Literal
  {:db/ident        :rr/Literal,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "Denotes a Literal, used with termType.@en",
   :rdfs/subClassOf :owl/Thing})

(def LogicalTable
  {:db/ident        :rr/LogicalTable,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "Represents a logical table.@en",
   :rdfs/subClassOf :owl/Thing})

(def ObjectMap
  {:db/ident        :rr/ObjectMap,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "Represents an object map.@en",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :rdfs/Datatype,
                      :owl/onProperty :rr/datatype,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rr/language,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onClass    :rdfs/Resource,
                      :owl/onProperty :rr/object,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :rdfs/Resource,
                      :owl/onProperty :rr/object,
                      :rdf/type       :owl/Restriction}
                     :rr/TermMap
                     :owl/Thing]})

(def PredicateMap
  {:db/ident        :rr/PredicateMap,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "Represents a predicate map.@en",
   :rdfs/subClassOf [{:owl/onClass    :rdf/Property,
                      :owl/onProperty :rr/predicate,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     :rr/TermMap
                     :owl/Thing]})

(def PredicateObjectMap
  {:db/ident        :rr/PredicateObjectMap,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "Represents a predicate-object map.@en",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onClass    :rr/PredicateMap,
                      :owl/onProperty :rr/predicateMap,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :rr/ObjectMap,
                      :owl/onProperty :rr/objectMap,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     :owl/Thing]})

(def R2RMLView
  {:db/ident        :rr/R2RMLView,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:rr/LogicalTable :owl/Thing]})

(def RefObjectMap
  {:db/ident        :rr/RefObjectMap,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "Denotes a reference to an object map.@en",
   :rdfs/subClassOf :owl/Thing})

(def SQL2008
  {:db/ident     :rr/SQL2008,
   :rdf/type     :owl/NamedIndividual,
   :rdfs/comment #xsd/langString "Core SQL 2008@en"})

(def SubjectMap
  {:db/ident        :rr/SubjectMap,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "Represents a subject map.@en",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :rdfs/Class,
                      :owl/onProperty :rr/class,
                      :rdf/type       :owl/Restriction}
                     :rr/TermMap
                     :owl/Thing]})

(def TermMap
  {:db/ident :rr/TermMap,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A function that generates an RDF term from a logical table row.@en",
   :rdfs/label #xsd/langString "Term Map@en"})

(def TriplesMap
  {:db/ident        :rr/TriplesMap,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "Represents a triples map.@en",
   :rdfs/subClassOf [{:owl/onClass    :rr/SubjectMap,
                      :owl/onProperty :rr/subjectMap,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :rr/LogicalTable,
                      :owl/onProperty :rr/logicalTable,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     :owl/Thing]})

(def child
  {:db/ident     :rr/child,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/langString
                  "Names a column in the child table of a join.@en",
   :rdfs/domain  :rr/Join,
   :rdfs/range   :xsd/string})

(def class
  {:db/ident :rr/class,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "The subject value generated for a logical table row will be asserted as an instance of this RDFS class.@en",
   :rdfs/domain :rr/SubjectMap,
   :rdfs/range :rdfs/Class})

(def column
  {:db/ident :rr/column,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "Name of a column in the logical table. When generating RDF triples from a logical table row, value from the specified column is used as the subject, predicate, or object (based upon the specific domain).@en",
   :rdfs/domain :rr/TermMap,
   :rdfs/range :xsd/string})

(def constant
  {:db/ident :rr/constant,
   :rdf/type :owl/ObjectProperty})

(def datatype
  {:db/ident :rr/datatype,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Specifies the datatype of the object component for the generated triple from a logical table row.@en",
   :rdfs/domain :rr/ObjectMap,
   :rdfs/range :rdfs/Datatype})

(def defaultGraph
  {:db/ident     :rr/defaultGraph,
   :rdf/type     :owl/NamedIndividual,
   :rdfs/comment #xsd/langString "Denotes a default graph@en"})

(def graph
  {:db/ident :rr/graph,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "An IRI reference for use as the graph name of all triples generated with the GraphMap.@en",
   :rdfs/domain {:owl/intersectionOf [:rr/GraphMap
                                      {:owl/maxQualifiedCardinality
                                       #xsd/nonNegativeInteger 0,
                                       :owl/onDataRange :xsd/string,
                                       :owl/onProperty  :rr/template,
                                       :rdf/type        :owl/Restriction}],
                 :rdf/type :owl/Class}})

(def graphMap
  {:db/ident :rr/graphMap,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Specifies a GraphMap. When used with a SubjectMap element, all the RDF triples generated from a logical row will be stored in the specified named graph. Otherwise, the RDF triple generated using the (predicate, object) pair will be stored in the specified named graph.@en",
   :rdfs/domain {:owl/unionOf [:rr/PredicateObjectMap :rr/SubjectMap],
                 :rdf/type    :owl/Class},
   :rdfs/range :rr/GraphMap})

(def inverseExpression
  {:db/ident :rr/inverseExpression,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "An expression that allows, at query processing time, use of index-based access to the the (underlying) relational tables, instead of simply retrieving the table rows first and then applying a filter. This property is useful for retrieval based on conditions involving subject, predicate, or object generated from logical table column(s) and involves some transformation.@en",
   :rdfs/domain :rr/TermMap,
   :rdfs/range :xsd/string})

(def joinCondition
  {:db/ident :rr/joinCondition,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Specifies the join condition for joining the child logical table with the parent logical table of the foreign key constraint.@en",
   :rdfs/domain :rr/RefObjectMap,
   :rdfs/range :rr/Join})

(def language
  {:db/ident :rr/language,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "Specified the language for the object component for the generated triple from a logical table row.@en",
   :rdfs/domain :rr/ObjectMap,
   :rdfs/range :xsd/string})

(def logicalTable
  {:db/ident     :rr/logicalTable,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment #xsd/langString "Definition of logical table to be mapped.@en",
   :rdfs/domain  :rr/TriplesMap,
   :rdfs/range   :rr/LogicalTable})

(def object
  {:db/ident :rr/object,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Specifies the object for the generated triple from the logical table row.@en",
   :rdfs/domain {:owl/intersectionOf [:rr/ObjectMap
                                      {:owl/maxQualifiedCardinality
                                       #xsd/nonNegativeInteger 0,
                                       :owl/onDataRange :xsd/string,
                                       :owl/onProperty  :rr/column,
                                       :rdf/type        :owl/Restriction}],
                 :rdf/type :owl/Class},
   :rdfs/range :rdfs/Resource})

(def objectMap
  {:db/ident :rr/objectMap,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "An ObjectMap element to generate the object component of the (predicate, object) pair from a logical table row.@en",
   :rdfs/domain :rr/PredicateObjectMap,
   :rdfs/range {:owl/unionOf [:rr/ObjectMap :rr/RefObjectMap],
                :rdf/type    :owl/Class}})

(def parent
  {:db/ident     :rr/parent,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/langString
                  "Names a column in the parent table of a join.@en",
   :rdfs/domain  :rr/Join,
   :rdfs/range   :xsd/string})

(def parentTriplesMap
  {:db/ident :rr/parentTriplesMap,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Specifies the TriplesMap element corresponding to the parent logical table of the foreign key constraint.@en",
   :rdfs/domain :rr/RefObjectMap,
   :rdfs/range :rr/TriplesMap})

(def predicate
  {:db/ident :rr/predicate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Specifies the predicate for the generated triple from the logical table row.@en",
   :rdfs/domain {:owl/intersectionOf [:rr/PredicateMap
                                      {:owl/maxQualifiedCardinality
                                       #xsd/nonNegativeInteger 0,
                                       :owl/onDataRange :xsd/string,
                                       :owl/onProperty  :rr/column,
                                       :rdf/type        :owl/Restriction}],
                 :rdf/type :owl/Class},
   :rdfs/range :rdf/Property})

(def predicateMap
  {:db/ident :rr/predicateMap,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "A PredicateMap element to generate the predicate component of the (predicate, object) pair from a logical table row.@en",
   :rdfs/domain :rr/PredicateObjectMap,
   :rdfs/range :rr/PredicateMap})

(def predicateObjectMap
  {:db/ident :rr/predicateObjectMap,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "A PredicateObjectMap element to generate (predicate, object) pair from a logical table row.@en",
   :rdfs/range :rr/PredicateObjectMap})

(def sqlQuery
  {:db/ident     :rr/sqlQuery,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/langString "A valid SQL query.@en",
   :rdfs/domain  :rr/R2RMLView,
   :rdfs/range   :xsd/string})

(def sqlVersion
  {:db/ident     :rr/sqlVersion,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment #xsd/langString "An identifier for a SQL version.@en",
   :rdfs/domain  :rr/R2RMLView})

(def subject
  {:db/ident :rr/subject,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "An IRI reference for use as subject for all the RDF triples generated from a logical table row.@en",
   :rdfs/domain {:owl/intersectionOf [:rr/SubjectMap
                                      {:owl/maxQualifiedCardinality
                                       #xsd/nonNegativeInteger 0,
                                       :owl/onDataRange :xsd/string,
                                       :owl/onProperty  :rr/column,
                                       :rdf/type        :owl/Restriction}],
                 :rdf/type :owl/Class}})

(def subjectMap
  {:db/ident :rr/subjectMap,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "A SubjectMap element to generate a subject from a logical table row.@en",
   :rdfs/domain :rr/TriplesMap,
   :rdfs/range :rr/SubjectMap})

(def tableName
  {:db/ident     :rr/tableName,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/langString "Schema-qualified name of a table or view.@en",
   :rdfs/domain  :rr/BaseTableOrView,
   :rdfs/range   :xsd/string})

(def template
  {:db/ident :rr/template,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "A template (format string) to specify how to generate a value for a subject, predicate, or object, using one or more columns from a logical table row.@en",
   :rdfs/domain :rr/TermMap,
   :rdfs/range :xsd/string})

(def termType
  {:db/ident :rr/termType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "A string indicating whether subject or object generated using the value from column name specified for rr:column should be an IRI reference, blank node, or a literal.@en",
   :rdfs/domain :rr/TermMap,
   :rdfs/range {:owl/unionOf [:rr/BlankNode :rr/IRI :rr/Literal],
                :rdf/type    :owl/Class}})