(ns net.wikipunk.rdf.rr
  ^{:base       "http://www.w3.org/ns/r2rml#",
    :namespaces {"cc"    "http://creativecommons.org/ns#",
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
    :prefix     "rr",
    :source     "http://www.w3.org/ns/r2rml#"}
  {:cc/license       {:xsd/anyURI
                      "http://creativecommons.org/licenses/by/3.0/"},
   :dc11/contributor #{{:xsd/anyURI "http://www.w3.org/People/Ivan/"}
                       {:xsd/anyURI "http://boris.villazon.terrazas.name"}},
   :dc11/creator     {:xsd/anyURI "http://richard.cyganiak.de/foaf.rdf#cygri"},
   :dc11/description {:rdf/language "en",
                      :rdf/value    "RDB to RDF Mapping Language - Vocabulary"},
   :dc11/issued      #inst "2012-01-24T00:00:00.000-00:00",
   :dc11/modified    #inst "2012-07-16T00:00:00.000-00:00",
   :dc11/publisher   {:xsd/anyURI "http://www.w3.org/"},
   :dc11/title       {:rdf/language "en",
                      :rdf/value    "R2RML vocabulary"},
   :rdf/type         #{:owl/Ontology :voaf/Vocabulary},
   :vann/preferredNamespacePrefix "rr",
   :vann/preferredNamespaceUri "http://www.w3.org/ns/r2rml#",
   :xsd/anyURI       "http://www.w3.org/ns/r2rml#"}
  (:refer-clojure :exclude [class]))

(def BaseTableOrView
  {:db/ident        :rr/BaseTableOrView,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :rr/LogicalTable})

(def BlankNode
  {:db/ident     :rr/BlankNode,
   :rdf/type     :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Denotes a blank node, used with termType"}})

(def GraphMap
  {:db/ident        :rr/GraphMap,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Represents a graph map."},
   :rdfs/subClassOf :rr/TermMap})

(def IRI
  {:db/ident     :rr/IRI,
   :rdf/type     :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Denotes an IRI, used with termpType."}})

(def Join
  {:db/ident        :rr/Join,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Represents a join condition."},
   :rdfs/subClassOf #{:owl/Thing
                      {:owl/minQualifiedCardinality 1,
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
                       :rdf/type        :owl/Restriction}}})

(def Literal
  {:db/ident        :rr/Literal,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Denotes a Literal, used with termType."},
   :rdfs/subClassOf :owl/Thing})

(def LogicalTable
  {:db/ident        :rr/LogicalTable,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Represents a logical table."},
   :rdfs/subClassOf :owl/Thing})

(def ObjectMap
  {:db/ident        :rr/ObjectMap,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Represents an object map."},
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onDataRange :xsd/string,
                       :owl/onProperty  :rr/language,
                       :rdf/type        :owl/Restriction} :rr/TermMap
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :rdfs/Datatype,
                       :owl/onProperty :rr/datatype,
                       :rdf/type       :owl/Restriction} :owl/Thing
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onClass    :rdfs/Resource,
                       :owl/onProperty :rr/object,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :rdfs/Resource,
                       :owl/onProperty :rr/object,
                       :rdf/type       :owl/Restriction}}})

(def PredicateMap
  {:db/ident        :rr/PredicateMap,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Represents a predicate map."},
   :rdfs/subClassOf #{:rr/TermMap :owl/Thing
                      {:owl/onClass    :rdf/Property,
                       :owl/onProperty :rr/predicate,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}}})

(def PredicateObjectMap
  {:db/ident        :rr/PredicateObjectMap,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Represents a predicate-object map."},
   :rdfs/subClassOf #{:owl/Thing
                      {:owl/onClass    :rr/ObjectMap,
                       :owl/onProperty :rr/objectMap,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 1,
                       :owl/onClass    :rr/PredicateMap,
                       :owl/onProperty :rr/predicateMap,
                       :rdf/type       :owl/Restriction}}})

(def R2RMLView
  {:db/ident        :rr/R2RMLView,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :rr/LogicalTable})

(def RefObjectMap
  {:db/ident        :rr/RefObjectMap,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Denotes a reference to an object map."},
   :rdfs/subClassOf :owl/Thing})

(def SQL2008
  {:db/ident     :rr/SQL2008,
   :rdf/type     :owl/NamedIndividual,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Core SQL 2008"}})

(def SubjectMap
  {:db/ident        :rr/SubjectMap,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Represents a subject map."},
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :rdfs/Class,
                       :owl/onProperty :rr/class,
                       :rdf/type       :owl/Restriction} :rr/TermMap
                      :owl/Thing}})

(def TermMap
  {:db/ident :rr/TermMap,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A function that generates an RDF term from a logical table row."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Term Map"}})

(def TriplesMap
  {:db/ident        :rr/TriplesMap,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Represents a triples map."},
   :rdfs/subClassOf #{{:owl/onClass    :rr/LogicalTable,
                       :owl/onProperty :rr/logicalTable,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction} :owl/Thing
                      {:owl/onClass    :rr/SubjectMap,
                       :owl/onProperty :rr/subjectMap,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}}})

(def child
  {:db/ident     :rr/child,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Names a column in the child table of a join."},
   :rdfs/domain  :rr/Join,
   :rdfs/range   :xsd/string})

(def class
  {:db/ident :rr/class,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The subject value generated for a logical table row will be asserted as an instance of this RDFS class."},
   :rdfs/domain :rr/SubjectMap,
   :rdfs/range :rdfs/Class})

(def column
  {:db/ident :rr/column,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Name of a column in the logical table. When generating RDF triples from a logical table row, value from the specified column is used as the subject, predicate, or object (based upon the specific domain)."},
   :rdfs/domain :rr/TermMap,
   :rdfs/range :xsd/string})

(def constant
  {:db/ident :rr/constant,
   :rdf/type :owl/ObjectProperty})

(def datatype
  {:db/ident :rr/datatype,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies the datatype of the object component for the generated triple from a logical table row."},
   :rdfs/domain :rr/ObjectMap,
   :rdfs/range :rdfs/Datatype})

(def defaultGraph
  {:db/ident     :rr/defaultGraph,
   :rdf/type     :owl/NamedIndividual,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Denotes a default graph"}})

(def graph
  {:db/ident :rr/graph,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An IRI reference for use as the graph name of all triples generated with the GraphMap."},
   :rdfs/domain {:owl/intersectionOf [:rr/GraphMap
                                      {:owl/maxQualifiedCardinality 0,
                                       :owl/onDataRange :xsd/string,
                                       :owl/onProperty  :rr/template,
                                       :rdf/type        :owl/Restriction}],
                 :rdf/type :owl/Class}})

(def graphMap
  {:db/ident :rr/graphMap,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies a GraphMap. When used with a SubjectMap element, all the RDF triples generated from a logical row will be stored in the specified named graph. Otherwise, the RDF triple generated using the (predicate, object) pair will be stored in the specified named graph."},
   :rdfs/domain {:owl/unionOf [:rr/PredicateObjectMap :rr/SubjectMap],
                 :rdf/type    :owl/Class},
   :rdfs/range :rr/GraphMap})

(def inverseExpression
  {:db/ident :rr/inverseExpression,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An expression that allows, at query processing time, use of index-based access to the the (underlying) relational tables, instead of simply retrieving the table rows first and then applying a filter. This property is useful for retrieval based on conditions involving subject, predicate, or object generated from logical table column(s) and involves some transformation."},
   :rdfs/domain :rr/TermMap,
   :rdfs/range :xsd/string})

(def joinCondition
  {:db/ident :rr/joinCondition,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies the join condition for joining the child logical table with the parent logical table of the foreign key constraint."},
   :rdfs/domain :rr/RefObjectMap,
   :rdfs/range :rr/Join})

(def language
  {:db/ident :rr/language,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specified the language for the object component for the generated triple from a logical table row."},
   :rdfs/domain :rr/ObjectMap,
   :rdfs/range :xsd/string})

(def logicalTable
  {:db/ident     :rr/logicalTable,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Definition of logical table to be mapped."},
   :rdfs/domain  :rr/TriplesMap,
   :rdfs/range   :rr/LogicalTable})

(def object
  {:db/ident :rr/object,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies the object for the generated triple from the logical table row."},
   :rdfs/domain {:owl/intersectionOf [:rr/ObjectMap
                                      {:owl/maxQualifiedCardinality 0,
                                       :owl/onDataRange :xsd/string,
                                       :owl/onProperty  :rr/column,
                                       :rdf/type        :owl/Restriction}],
                 :rdf/type :owl/Class},
   :rdfs/range :rdfs/Resource})

(def objectMap
  {:db/ident :rr/objectMap,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An ObjectMap element to generate the object component of the (predicate, object) pair from a logical table row."},
   :rdfs/domain :rr/PredicateObjectMap,
   :rdfs/range {:owl/unionOf [:rr/ObjectMap :rr/RefObjectMap],
                :rdf/type    :owl/Class}})

(def parent
  {:db/ident     :rr/parent,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value "Names a column in the parent table of a join."},
   :rdfs/domain  :rr/Join,
   :rdfs/range   :xsd/string})

(def parentTriplesMap
  {:db/ident :rr/parentTriplesMap,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies the TriplesMap element corresponding to the parent logical table of the foreign key constraint."},
   :rdfs/domain :rr/RefObjectMap,
   :rdfs/range :rr/TriplesMap})

(def predicate
  {:db/ident :rr/predicate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies the predicate for the generated triple from the logical table row."},
   :rdfs/domain {:owl/intersectionOf [:rr/PredicateMap
                                      {:owl/maxQualifiedCardinality 0,
                                       :owl/onDataRange :xsd/string,
                                       :owl/onProperty  :rr/column,
                                       :rdf/type        :owl/Restriction}],
                 :rdf/type :owl/Class},
   :rdfs/range :rdf/Property})

(def predicateMap
  {:db/ident :rr/predicateMap,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A PredicateMap element to generate the predicate component of the (predicate, object) pair from a logical table row."},
   :rdfs/domain :rr/PredicateObjectMap,
   :rdfs/range :rr/PredicateMap})

(def predicateObjectMap
  {:db/ident :rr/predicateObjectMap,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A PredicateObjectMap element to generate (predicate, object) pair from a logical table row."},
   :rdfs/range :rr/PredicateObjectMap})

(def sqlQuery
  {:db/ident     :rr/sqlQuery,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A valid SQL query."},
   :rdfs/domain  :rr/R2RMLView,
   :rdfs/range   :xsd/string})

(def sqlVersion
  {:db/ident     :rr/sqlVersion,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "An identifier for a SQL version."},
   :rdfs/domain  :rr/R2RMLView})

(def subject
  {:db/ident :rr/subject,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An IRI reference for use as subject for all the RDF triples generated from a logical table row."},
   :rdfs/domain {:owl/intersectionOf [:rr/SubjectMap
                                      {:owl/maxQualifiedCardinality 0,
                                       :owl/onDataRange :xsd/string,
                                       :owl/onProperty  :rr/column,
                                       :rdf/type        :owl/Restriction}],
                 :rdf/type :owl/Class}})

(def subjectMap
  {:db/ident :rr/subjectMap,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A SubjectMap element to generate a subject from a logical table row."},
   :rdfs/domain :rr/TriplesMap,
   :rdfs/range :rr/SubjectMap})

(def tableName
  {:db/ident     :rr/tableName,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Schema-qualified name of a table or view."},
   :rdfs/domain  :rr/BaseTableOrView,
   :rdfs/range   :xsd/string})

(def template
  {:db/ident :rr/template,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A template (format string) to specify how to generate a value for a subject, predicate, or object, using one or more columns from a logical table row."},
   :rdfs/domain :rr/TermMap,
   :rdfs/range :xsd/string})

(def termType
  {:db/ident :rr/termType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A string indicating whether subject or object generated using the value from column name specified for rr:column should be an IRI reference, blank node, or a literal."},
   :rdfs/domain :rr/TermMap,
   :rdfs/range {:owl/unionOf [:rr/BlankNode :rr/IRI :rr/Literal],
                :rdf/type    :owl/Class}})

(def urn:uuid:9f4224d7-fe19-569f-a4d6-b010ff87f140112353
  {:cc/license       {:xsd/anyURI
                      "http://creativecommons.org/licenses/by/3.0/"},
   :dc11/contributor #{{:xsd/anyURI "http://www.w3.org/People/Ivan/"}
                       {:xsd/anyURI "http://boris.villazon.terrazas.name"}},
   :dc11/creator     {:xsd/anyURI "http://richard.cyganiak.de/foaf.rdf#cygri"},
   :dc11/description {:rdf/language "en",
                      :rdf/value    "RDB to RDF Mapping Language - Vocabulary"},
   :dc11/issued      #inst "2012-01-24T00:00:00.000-00:00",
   :dc11/modified    #inst "2012-07-16T00:00:00.000-00:00",
   :dc11/publisher   {:xsd/anyURI "http://www.w3.org/"},
   :dc11/title       {:rdf/language "en",
                      :rdf/value    "R2RML vocabulary"},
   :rdf/type         #{:owl/Ontology :voaf/Vocabulary},
   :vann/preferredNamespacePrefix "rr",
   :vann/preferredNamespaceUri "http://www.w3.org/ns/r2rml#",
   :xsd/anyURI       "http://www.w3.org/ns/r2rml#"})

(def urn:uuid:630fdb58-a074-594b-8dce-5065de571bb6112354
  {:rdf/type     :foaf/Organization,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "The World Wide Web Consortium (W3C)"},
   :vaem/acronym "W3C",
   :xsd/anyURI   "http://www.w3.org/"})

(def urn:uuid:49f3671e-14ef-5e83-832d-2b50f6338c9b112355
  {:foaf/name  "Boris Villazon-Terrazas",
   :rdf/type   :foaf/Person,
   :xsd/anyURI "http://boris.villazon.terrazas.name"})

(def urn:uuid:d5253eba-acd4-5220-b62f-f4cf8470abec112356
  {:foaf/name  "Ivan Herman",
   :rdf/type   :foaf/Person,
   :xsd/anyURI "http://www.w3.org/People/Ivan/"})

(def urn:uuid:09fc25bc-0c96-58bb-a2a7-f1c490bee7a0112357
  {:foaf/name  "Richard Cyganiak",
   :rdf/type   :foaf/Person,
   :xsd/anyURI "http://richard.cyganiak.de/foaf.rdf#cygri"})