(ns net.wikipunk.rdf.rr
  "http://www.w3.org/ns/r2rml#"
  {:cc/license        "http://creativecommons.org/licenses/by/3.0/",
   :dc11/contributor  ["http://www.w3.org/People/Ivan/"
                       "http://boris.villazon.terrazas.name"],
   :dc11/creator      "http://richard.cyganiak.de/foaf.rdf#cygri",
   :dc11/description  #voc/lstr "RDB to RDF Mapping Language - Vocabulary@en",
   :dc11/issued       #inst "2012-01-24T00:00:00.000-05:00",
   :dc11/modified     #inst "2012-07-16T00:00:00.000-04:00",
   :dc11/publisher    "http://www.w3.org/",
   :dc11/title        #voc/lstr "R2RML vocabulary@en",
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
   :rdf/type          [:voaf/Vocabulary :owl/Ontology],
   :rdfa/prefix       "rr",
   :rdfa/uri          "http://www.w3.org/ns/r2rml#",
   :rdfs/isDefinedBy  {:rdf/uri
                       "http://www.w3.org/TR/2012/REC-r2rml-20120927/"},
   :vann/preferredNamespacePrefix "rr",
   :vann/preferredNamespaceUri "http://www.w3.org/ns/r2rml#"}
  (:refer-clojure :exclude [class]))

(def BaseTableOrView
  {:db/ident        :rr/BaseTableOrView,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:rr/LogicalTable :rr/BaseTableOrView :owl/Thing]})

(def BlankNode
  "Denotes a blank node, used with termType"
  {:db/ident     :rr/BlankNode,
   :rdf/type     :owl/Class,
   :rdfs/comment #voc/lstr "Denotes a blank node, used with termType@en"})

(def GraphMap
  "Represents a graph map."
  {:db/ident        :rr/GraphMap,
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "Represents a graph map.@en",
   :rdfs/subClassOf [:rr/TermMap :rr/GraphMap]})

(def IRI
  "Denotes an IRI, used with termpType."
  {:db/ident     :rr/IRI,
   :rdf/type     :owl/Class,
   :rdfs/comment #voc/lstr "Denotes an IRI, used with termpType.@en"})

(def Join
  "Represents a join condition."
  {:db/ident        :rr/Join,
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "Represents a join condition.@en",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rr/child,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rr/child,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rr/parent,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rr/parent,
                      :rdf/type        :owl/Restriction}
                     :owl/Thing
                     :rr/Join]})

(def Literal
  "Denotes a Literal, used with termType."
  {:db/ident        :rr/Literal,
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "Denotes a Literal, used with termType.@en",
   :rdfs/subClassOf [:owl/Thing :rr/Literal]})

(def LogicalTable
  "Represents a logical table."
  {:db/ident        :rr/LogicalTable,
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "Represents a logical table.@en",
   :rdfs/subClassOf [:owl/Thing :rr/LogicalTable]})

(def ObjectMap
  "Represents an object map."
  {:db/ident        :rr/ObjectMap,
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "Represents an object map.@en",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :rdfs/Datatype,
                      :owl/onProperty :rr/datatype,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rr/language,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :rdfs/Resource,
                      :owl/onProperty :rr/object,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :rdfs/Resource,
                      :owl/onProperty :rr/object,
                      :rdf/type       :owl/Restriction}
                     :rr/TermMap
                     :owl/Thing
                     :rr/ObjectMap]})

(def PredicateMap
  "Represents a predicate map."
  {:db/ident        :rr/PredicateMap,
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "Represents a predicate map.@en",
   :rdfs/subClassOf [{:owl/onClass    :rdf/Property,
                      :owl/onProperty :rr/predicate,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :rr/TermMap
                     :owl/Thing
                     :rr/PredicateMap]})

(def PredicateObjectMap
  "Represents a predicate-object map."
  {:db/ident        :rr/PredicateObjectMap,
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "Represents a predicate-object map.@en",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 1,
                      :owl/onClass    :rr/PredicateMap,
                      :owl/onProperty :rr/predicateMap,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :rr/ObjectMap,
                      :owl/onProperty :rr/objectMap,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :owl/Thing
                     :rr/PredicateObjectMap]})

(def R2RMLView
  {:db/ident        :rr/R2RMLView,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:rr/LogicalTable :rr/R2RMLView :owl/Thing]})

(def RefObjectMap
  "Denotes a reference to an object map."
  {:db/ident        :rr/RefObjectMap,
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "Denotes a reference to an object map.@en",
   :rdfs/subClassOf [:owl/Thing :rr/RefObjectMap]})

(def SQL2008
  "Core SQL 2008"
  {:db/ident     :rr/SQL2008,
   :rdf/type     :owl/NamedIndividual,
   :rdfs/comment #voc/lstr "Core SQL 2008@en"})

(def SubjectMap
  "Represents a subject map."
  {:db/ident        :rr/SubjectMap,
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "Represents a subject map.@en",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :rdfs/Class,
                      :owl/onProperty :rr/class,
                      :rdf/type       :owl/Restriction}
                     :rr/TermMap
                     :owl/Thing
                     :rr/SubjectMap]})

(def TermMap
  "A function that generates an RDF term from a logical table row."
  {:db/ident :rr/TermMap,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A function that generates an RDF term from a logical table row.@en",
   :rdfs/label #voc/lstr "Term Map@en",
   :rdfs/subClassOf :rr/TermMap})

(def TriplesMap
  "Represents a triples map."
  {:db/ident        :rr/TriplesMap,
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "Represents a triples map.@en",
   :rdfs/subClassOf [{:owl/onClass    :rr/SubjectMap,
                      :owl/onProperty :rr/subjectMap,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :rr/LogicalTable,
                      :owl/onProperty :rr/logicalTable,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :owl/Thing
                     :rr/TriplesMap]})

(def child
  "Names a column in the child table of a join."
  {:db/ident     :rr/child,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #voc/lstr "Names a column in the child table of a join.@en",
   :rdfs/domain  :rr/Join,
   :rdfs/range   :xsd/string})

(def class
  "The subject value generated for a logical table row will be asserted as an instance of this RDFS class."
  {:db/ident :rr/class,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "The subject value generated for a logical table row will be asserted as an instance of this RDFS class.@en",
   :rdfs/domain :rr/SubjectMap,
   :rdfs/range :rdfs/Class})

(def column
  "Name of a column in the logical table. When generating RDF triples from a logical table row, value from the specified column is used as the subject, predicate, or object (based upon the specific domain)."
  {:db/ident :rr/column,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "Name of a column in the logical table. When generating RDF triples from a logical table row, value from the specified column is used as the subject, predicate, or object (based upon the specific domain).@en",
   :rdfs/domain :rr/TermMap,
   :rdfs/range :xsd/string})

(def constant
  {:db/ident :rr/constant,
   :rdf/type :owl/ObjectProperty})

(def datatype
  "Specifies the datatype of the object component for the generated triple from a logical table row."
  {:db/ident :rr/datatype,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Specifies the datatype of the object component for the generated triple from a logical table row.@en",
   :rdfs/domain :rr/ObjectMap,
   :rdfs/range :rdfs/Datatype})

(def defaultGraph
  "Denotes a default graph"
  {:db/ident     :rr/defaultGraph,
   :rdf/type     :owl/NamedIndividual,
   :rdfs/comment #voc/lstr "Denotes a default graph@en"})

(def graph
  "An IRI reference for use as the graph name of all triples generated with the GraphMap."
  {:db/ident :rr/graph,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "An IRI reference for use as the graph name of all triples generated with the GraphMap.@en",
   :rdfs/domain {:owl/intersectionOf [:rr/GraphMap
                                      {:owl/maxQualifiedCardinality 0,
                                       :owl/onDataRange :xsd/string,
                                       :owl/onProperty  :rr/template,
                                       :rdf/type        :owl/Restriction}],
                 :rdf/type :owl/Class}})

(def graphMap
  "Specifies a GraphMap. When used with a SubjectMap element, all the RDF triples generated from a logical row will be stored in the specified named graph. Otherwise, the RDF triple generated using the (predicate, object) pair will be stored in the specified named graph."
  {:db/ident :rr/graphMap,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Specifies a GraphMap. When used with a SubjectMap element, all the RDF triples generated from a logical row will be stored in the specified named graph. Otherwise, the RDF triple generated using the (predicate, object) pair will be stored in the specified named graph.@en",
   :rdfs/domain {:owl/unionOf [:rr/PredicateObjectMap :rr/SubjectMap],
                 :rdf/type    :owl/Class},
   :rdfs/range :rr/GraphMap})

(def inverseExpression
  "An expression that allows, at query processing time, use of index-based access to the the (underlying) relational tables, instead of simply retrieving the table rows first and then applying a filter. This property is useful for retrieval based on conditions involving subject, predicate, or object generated from logical table column(s) and involves some transformation."
  {:db/ident :rr/inverseExpression,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "An expression that allows, at query processing time, use of index-based access to the the (underlying) relational tables, instead of simply retrieving the table rows first and then applying a filter. This property is useful for retrieval based on conditions involving subject, predicate, or object generated from logical table column(s) and involves some transformation.@en",
   :rdfs/domain :rr/TermMap,
   :rdfs/range :xsd/string})

(def joinCondition
  "Specifies the join condition for joining the child logical table with the parent logical table of the foreign key constraint."
  {:db/ident :rr/joinCondition,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Specifies the join condition for joining the child logical table with the parent logical table of the foreign key constraint.@en",
   :rdfs/domain :rr/RefObjectMap,
   :rdfs/range :rr/Join})

(def language
  "Specified the language for the object component for the generated triple from a logical table row."
  {:db/ident :rr/language,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "Specified the language for the object component for the generated triple from a logical table row.@en",
   :rdfs/domain :rr/ObjectMap,
   :rdfs/range :xsd/string})

(def logicalTable
  "Definition of logical table to be mapped."
  {:db/ident     :rr/logicalTable,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment #voc/lstr "Definition of logical table to be mapped.@en",
   :rdfs/domain  :rr/TriplesMap,
   :rdfs/range   :rr/LogicalTable})

(def object
  "Specifies the object for the generated triple from the logical table row."
  {:db/ident :rr/object,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Specifies the object for the generated triple from the logical table row.@en",
   :rdfs/domain {:owl/intersectionOf [:rr/ObjectMap
                                      {:owl/maxQualifiedCardinality 0,
                                       :owl/onDataRange :xsd/string,
                                       :owl/onProperty  :rr/column,
                                       :rdf/type        :owl/Restriction}],
                 :rdf/type :owl/Class},
   :rdfs/range :rdfs/Resource})

(def objectMap
  "An ObjectMap element to generate the object component of the (predicate, object) pair from a logical table row."
  {:db/ident :rr/objectMap,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "An ObjectMap element to generate the object component of the (predicate, object) pair from a logical table row.@en",
   :rdfs/domain :rr/PredicateObjectMap,
   :rdfs/range {:owl/unionOf [:rr/ObjectMap :rr/RefObjectMap],
                :rdf/type    :owl/Class}})

(def parent
  "Names a column in the parent table of a join."
  {:db/ident     :rr/parent,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #voc/lstr "Names a column in the parent table of a join.@en",
   :rdfs/domain  :rr/Join,
   :rdfs/range   :xsd/string})

(def parentTriplesMap
  "Specifies the TriplesMap element corresponding to the parent logical table of the foreign key constraint."
  {:db/ident :rr/parentTriplesMap,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Specifies the TriplesMap element corresponding to the parent logical table of the foreign key constraint.@en",
   :rdfs/domain :rr/RefObjectMap,
   :rdfs/range :rr/TriplesMap})

(def predicate
  "Specifies the predicate for the generated triple from the logical table row."
  {:db/ident :rr/predicate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Specifies the predicate for the generated triple from the logical table row.@en",
   :rdfs/domain {:owl/intersectionOf [:rr/PredicateMap
                                      {:owl/maxQualifiedCardinality 0,
                                       :owl/onDataRange :xsd/string,
                                       :owl/onProperty  :rr/column,
                                       :rdf/type        :owl/Restriction}],
                 :rdf/type :owl/Class},
   :rdfs/range :rdf/Property})

(def predicateMap
  "A PredicateMap element to generate the predicate component of the (predicate, object) pair from a logical table row."
  {:db/ident :rr/predicateMap,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "A PredicateMap element to generate the predicate component of the (predicate, object) pair from a logical table row.@en",
   :rdfs/domain :rr/PredicateObjectMap,
   :rdfs/range :rr/PredicateMap})

(def predicateObjectMap
  "A PredicateObjectMap element to generate (predicate, object) pair from a logical table row."
  {:db/ident :rr/predicateObjectMap,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "A PredicateObjectMap element to generate (predicate, object) pair from a logical table row.@en",
   :rdfs/range :rr/PredicateObjectMap})

(def sqlQuery
  "A valid SQL query."
  {:db/ident     :rr/sqlQuery,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #voc/lstr "A valid SQL query.@en",
   :rdfs/domain  :rr/R2RMLView,
   :rdfs/range   :xsd/string})

(def sqlVersion
  "An identifier for a SQL version."
  {:db/ident     :rr/sqlVersion,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment #voc/lstr "An identifier for a SQL version.@en",
   :rdfs/domain  :rr/R2RMLView})

(def subject
  "An IRI reference for use as subject for all the RDF triples generated from a logical table row."
  {:db/ident :rr/subject,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "An IRI reference for use as subject for all the RDF triples generated from a logical table row.@en",
   :rdfs/domain {:owl/intersectionOf [:rr/SubjectMap
                                      {:owl/maxQualifiedCardinality 0,
                                       :owl/onDataRange :xsd/string,
                                       :owl/onProperty  :rr/column,
                                       :rdf/type        :owl/Restriction}],
                 :rdf/type :owl/Class}})

(def subjectMap
  "A SubjectMap element to generate a subject from a logical table row."
  {:db/ident :rr/subjectMap,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "A SubjectMap element to generate a subject from a logical table row.@en",
   :rdfs/domain :rr/TriplesMap,
   :rdfs/range :rr/SubjectMap})

(def tableName
  "Schema-qualified name of a table or view."
  {:db/ident     :rr/tableName,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #voc/lstr "Schema-qualified name of a table or view.@en",
   :rdfs/domain  :rr/BaseTableOrView,
   :rdfs/range   :xsd/string})

(def template
  "A template (format string) to specify how to generate a value for a subject, predicate, or object, using one or more columns from a logical table row."
  {:db/ident :rr/template,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "A template (format string) to specify how to generate a value for a subject, predicate, or object, using one or more columns from a logical table row.@en",
   :rdfs/domain :rr/TermMap,
   :rdfs/range :xsd/string})

(def termType
  "A string indicating whether subject or object generated using the value from column name specified for rr:column should be an IRI reference, blank node, or a literal."
  {:db/ident :rr/termType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "A string indicating whether subject or object generated using the value from column name specified for rr:column should be an IRI reference, blank node, or a literal.@en",
   :rdfs/domain :rr/TermMap,
   :rdfs/range {:owl/unionOf [:rr/BlankNode :rr/IRI :rr/Literal],
                :rdf/type    :owl/Class}})