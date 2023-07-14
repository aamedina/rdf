(ns net.wikipunk.rdf.sp
  "An RDF schema to syntactically represent SPARQL queries and update commands as RDF triples."
  {:owl/versionInfo #xsd/string "1.5.1",
   :rdf/ns-prefix-map {"owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "sp"   "http://spinrdf.org/sp#",
                       "spin" "http://spinrdf.org/spin#",
                       "spl"  "http://spinrdf.org/spl#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "sp",
   :rdfa/uri "http://spinrdf.org/sp",
   :rdfs/comment
   #xsd/string
    "An RDF schema to syntactically represent SPARQL queries and update commands as RDF triples.",
   :rdfs/label #xsd/string "SPIN SPARQL Syntax"}
  (:refer-clojure :exclude [distinct into reduced]))

(def Add
  "A SPARQL UPDATE ADD operation. Uses sp:source and sp:target to represent \"from\" and \"to\" graphs, respectively. Also sp:silent may be true."
  {:db/ident :sp/Add,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A SPARQL UPDATE ADD operation. Uses sp:source and sp:target to represent \"from\" and \"to\" graphs, respectively. Also sp:silent may be true.",
   :rdfs/label #xsd/string "Add",
   :rdfs/seeAlso {:rdfa/uri "https://www.w3.org/TR/sparql11-update/#add"},
   :rdfs/subClassOf [:sp/Update :sp/Command :rdfs/Resource :sp/SystemClass]})

(def Aggregation
  "Base class of aggregation types (not part of the SPARQL 1.0 standard but supported by ARQ and other engines)."
  {:db/ident :sp/Aggregation,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "Base class of aggregation types (not part of the SPARQL 1.0 standard but supported by ARQ and other engines).",
   :rdfs/label #xsd/string "Aggregation",
   :rdfs/subClassOf [:sp/SystemClass :rdfs/Resource]})

(def AltPath
  "An alternative path with the union of sp:path1 and sp:path2."
  {:db/ident :sp/AltPath,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string "An alternative path with the union of sp:path1 and sp:path2.",
   :rdfs/label #xsd/string "Alt path",
   :rdfs/subClassOf [:sp/Path :rdfs/Resource :sp/SystemClass]})

(def Asc
  "Marker to indicate ascending order."
  {:db/ident        :sp/Asc,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/string "Marker to indicate ascending order.",
   :rdfs/label      #xsd/string "Asc",
   :rdfs/subClassOf [:sp/OrderByCondition :rdfs/Resource :sp/SystemClass]})

(def Ask
  "An ASK query that returns true if the condition in the body is met by at least one result set."
  {:db/ident :sp/Ask,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "An ASK query that returns true if the condition in the body is met by at least one result set.",
   :rdfs/label #xsd/string "Ask",
   :rdfs/subClassOf [:sp/Query :sp/Command :rdfs/Resource :sp/SystemClass]})

(def Avg
  "Represents AVG aggregations."
  {:db/ident        :sp/Avg,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/string "Represents AVG aggregations.",
   :rdfs/label      #xsd/string "AVG",
   :rdfs/subClassOf [:sp/Aggregation :rdfs/Resource :sp/SystemClass]})

(def Bind
  "A BIND element."
  {:db/ident        :sp/Bind,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/string "A BIND element.",
   :rdfs/label      #xsd/string "Bind",
   :rdfs/subClassOf [:sp/Element :rdfs/Resource :sp/SystemClass]})

(def Clear
  "An Update operation that removes all triples from a specified graph. Must specify the graph using sp:graphIRI, or sp:default, sp:named or sp:all. May have the SILENT flag, encoded using sp:silent."
  {:db/ident :sp/Clear,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "An Update operation that removes all triples from a specified graph. Must specify the graph using sp:graphIRI, or sp:default, sp:named or sp:all. May have the SILENT flag, encoded using sp:silent.",
   :rdfs/label #xsd/string "Clear",
   :rdfs/subClassOf [:sp/Update :sp/Command :rdfs/Resource :sp/SystemClass]})

(def Command
  "A shared superclass for sp:Query and sp:Update that can be used to specify that the range of property can be either one."
  {:db/ident :sp/Command,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A shared superclass for sp:Query and sp:Update that can be used to specify that the range of property can be either one.",
   :rdfs/label #xsd/string "Command",
   :rdfs/subClassOf [:sp/SystemClass :rdfs/Resource]})

(def Construct
  "A CONSTRUCT-type query that can be used to construct new triples from template triples (head) that use variable bindings from the match patterns (body)."
  {:db/ident :sp/Construct,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A CONSTRUCT-type query that can be used to construct new triples from template triples (head) that use variable bindings from the match patterns (body).",
   :rdfs/label #xsd/string "Construct",
   :rdfs/subClassOf [:sp/Query :sp/Command :rdfs/Resource :sp/SystemClass]})

(def Count
  "Counts the number of times a variable is used. The variable is stored in the variable property. This might be left blank to indicate COUNT(*)."
  {:db/ident :sp/Count,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "Counts the number of times a variable is used. The variable is stored in the variable property. This might be left blank to indicate COUNT(*).",
   :rdfs/label #xsd/string "COUNT",
   :rdfs/subClassOf [:sp/Aggregation :rdfs/Resource :sp/SystemClass]})

(def Create
  "An Update operation that creates a new empty graph with a name specified by sp:graphIRI. May have sp:silent set to true."
  {:db/ident :sp/Create,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "An Update operation that creates a new empty graph with a name specified by sp:graphIRI. May have sp:silent set to true.",
   :rdfs/label #xsd/string "Create",
   :rdfs/subClassOf [:sp/Update :sp/Command :rdfs/Resource :sp/SystemClass]})

(def Delete
  "Deprecated - use sp:Modify instead.\n\nRepresents a DELETE FROM (part of SPARQL UPDATE language). The graph IRIs are stored in sp:graphIRI. The template patterns to delete are stored in sp:deletePattern. The WHERE clause is represented using sp:where."
  {:db/ident :sp/Delete,
   :rdf/type [:rdfs/Class :owl/DeprecatedClass],
   :rdfs/comment
   #xsd/string
    "Deprecated - use sp:Modify instead.\n\nRepresents a DELETE FROM (part of SPARQL UPDATE language). The graph IRIs are stored in sp:graphIRI. The template patterns to delete are stored in sp:deletePattern. The WHERE clause is represented using sp:where.",
   :rdfs/label #xsd/string "Delete",
   :rdfs/subClassOf
   [:sp/Modify :sp/Command :rdfs/Resource :sp/Update :sp/SystemClass]})

(def DeleteData
  "An Update operation to delete specific triples. The graph triples are represented using sp:data, which points to an rdf:List of sp:Triples or sp:NamedGraphs."
  {:db/ident :sp/DeleteData,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "An Update operation to delete specific triples. The graph triples are represented using sp:data, which points to an rdf:List of sp:Triples or sp:NamedGraphs.",
   :rdfs/label #xsd/string "Delete data",
   :rdfs/subClassOf [:sp/Update :sp/Command :rdfs/Resource :sp/SystemClass]})

(def DeleteWhere
  "An Update operation where the triples matched by the WHERE clause (sp:where) will be the triples deleted."
  {:db/ident :sp/DeleteWhere,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "An Update operation where the triples matched by the WHERE clause (sp:where) will be the triples deleted.",
   :rdfs/label #xsd/string "Delete where",
   :rdfs/subClassOf [:sp/Update :sp/Command :rdfs/Resource :sp/SystemClass]})

(def Desc
  "Marker to indicate descending order."
  {:db/ident        :sp/Desc,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/string "Marker to indicate descending order.",
   :rdfs/label      #xsd/string "Desc",
   :rdfs/subClassOf [:sp/OrderByCondition :rdfs/Resource :sp/SystemClass]})

(def Describe
  "A DESCRIBE-type Query."
  {:db/ident        :sp/Describe,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/string "A DESCRIBE-type Query.",
   :rdfs/label      #xsd/string "Describe",
   :rdfs/subClassOf [:sp/Query :sp/Command :rdfs/Resource :sp/SystemClass]})

(def Drop
  "An Update operation that removes a specified graph from the Graph Store. Must specify the graph using sp:graphIRI, or sp:default, sp:named or sp:all. May have the SILENT flag, encoded using sp:silent."
  {:db/ident :sp/Drop,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "An Update operation that removes a specified graph from the Graph Store. Must specify the graph using sp:graphIRI, or sp:default, sp:named or sp:all. May have the SILENT flag, encoded using sp:silent.",
   :rdfs/label #xsd/string "Drop",
   :rdfs/subClassOf [:sp/Update :sp/Command :rdfs/Resource :sp/SystemClass]})

(def Element
  "An abstract base class for all pattern elements."
  {:db/ident        :sp/Element,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/string
                     "An abstract base class for all pattern elements.",
   :rdfs/label      #xsd/string "Element",
   :rdfs/subClassOf [:sp/SystemClass :rdfs/Resource]})

(def ElementGroup
  "Abstract base class of group patterns."
  {:db/ident        :sp/ElementGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/string "Abstract base class of group patterns.",
   :rdfs/label      #xsd/string "Element group",
   :rdfs/subClassOf [:sp/Element :rdfs/Resource :sp/SystemClass]})

(def ElementList
  "A list of Elements. This class is never instantiated directly as SPIN will use plain rdf:Lists to store element lists."
  {:db/ident :sp/ElementList,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A list of Elements. This class is never instantiated directly as SPIN will use plain rdf:Lists to store element lists.",
   :rdfs/label #xsd/string "Element list",
   :rdfs/subClassOf
   [:sp/ElementGroup :rdf/List :sp/Element :rdfs/Resource :sp/SystemClass]})

(def Exists
  "An EXISTS element group."
  {:db/ident        :sp/Exists,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/string "An EXISTS element group.",
   :rdfs/label      #xsd/string "Exists",
   :rdfs/subClassOf [:sp/ElementGroup
                     :sp/Element
                     :rdfs/Resource
                     :sp/SystemClass]})

(def Filter
  "A constraint element that evaluates a given expression to true or false."
  {:db/ident :sp/Filter,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A constraint element that evaluates a given expression to true or false.",
   :rdfs/label #xsd/string "Filter",
   :rdfs/subClassOf [:sp/Element :rdfs/Resource :sp/SystemClass]})

(def GroupConcat
  "Represents GROUP_CONCAT aggregations."
  {:db/ident        :sp/GroupConcat,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/string "Represents GROUP_CONCAT aggregations.",
   :rdfs/label      #xsd/string "GROUP_CONCAT",
   :rdfs/subClassOf [:sp/Aggregation :rdfs/Resource :sp/SystemClass]})

(def Insert
  "Deprecated - use sp:Modify instead.\n\nRepresents a INSERT INTO (part of SPARQL UPDATE language). The graph IRIs are stored in sp:graphIRI. The template patterns to delete are stored in sp:insertPattern. The WHERE clause is represented using sp:where."
  {:db/ident :sp/Insert,
   :rdf/type [:rdfs/Class :owl/DeprecatedClass],
   :rdfs/comment
   #xsd/string
    "Deprecated - use sp:Modify instead.\n\nRepresents a INSERT INTO (part of SPARQL UPDATE language). The graph IRIs are stored in sp:graphIRI. The template patterns to delete are stored in sp:insertPattern. The WHERE clause is represented using sp:where.",
   :rdfs/label #xsd/string "Insert",
   :rdfs/subClassOf
   [:sp/Modify :sp/Command :rdfs/Resource :sp/Update :sp/SystemClass]})

(def InsertData
  "An Update operation to insert specific triples. The graph triples are represented using sp:data, which points to an rdf:List of sp:Triples or sp:NamedGraphs."
  {:db/ident :sp/InsertData,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "An Update operation to insert specific triples. The graph triples are represented using sp:data, which points to an rdf:List of sp:Triples or sp:NamedGraphs.",
   :rdfs/label #xsd/string "Insert data",
   :rdfs/subClassOf [:sp/Update :sp/Command :rdfs/Resource :sp/SystemClass]})

(def Let
  "Deprecated: use sp:Bind instead.\n\nA variable assignment (LET (?<varName> := <expression>)). Not part of the SPARQL 1.0 standard, but (for example) ARQ."
  {:db/ident :sp/Let,
   :rdf/type [:rdfs/Class :owl/DeprecatedClass],
   :rdfs/comment
   #xsd/string
    "Deprecated: use sp:Bind instead.\n\nA variable assignment (LET (?<varName> := <expression>)). Not part of the SPARQL 1.0 standard, but (for example) ARQ.",
   :rdfs/label #xsd/string "Let",
   :rdfs/subClassOf [:sp/Bind :sp/Element :rdfs/Resource :sp/SystemClass]})

(def Load
  "A LOAD Update operation. The document to load is specified using sp:document, and the (optional) target graph using sp:into."
  {:db/ident :sp/Load,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A LOAD Update operation. The document to load is specified using sp:document, and the (optional) target graph using sp:into.",
   :rdfs/label #xsd/string "Load",
   :rdfs/subClassOf [:sp/Update :sp/Command :rdfs/Resource :sp/SystemClass]})

(def Max
  "Represents MAX aggregations."
  {:db/ident        :sp/Max,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/string "Represents MAX aggregations.",
   :rdfs/label      #xsd/string "MAX",
   :rdfs/subClassOf [:sp/Aggregation :rdfs/Resource :sp/SystemClass]})

(def Min
  "Represents MIN aggregations."
  {:db/ident        :sp/Min,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/string "Represents MIN aggregations.",
   :rdfs/label      #xsd/string "MIN",
   :rdfs/subClassOf [:sp/Aggregation :rdfs/Resource :sp/SystemClass]})

(def Minus
  "A MINUS element group."
  {:db/ident        :sp/Minus,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/string "A MINUS element group.",
   :rdfs/label      #xsd/string "Minus",
   :rdfs/subClassOf [:sp/ElementGroup
                     :sp/Element
                     :rdfs/Resource
                     :sp/SystemClass]})

(def ModPath
  "A modified path such as rdfs:subClassOf*."
  {:db/ident        :sp/ModPath,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/string "A modified path such as rdfs:subClassOf*.",
   :rdfs/label      #xsd/string "Mod path",
   :rdfs/subClassOf [:sp/Path :rdfs/Resource :sp/SystemClass]})

(def Modify
  "Represents a MODIFY (part of SPARQL UPDATE language). The graph IRIs are stored in sp:graphIRI. The template patterns are stored in sp:deletePattern and sp:insertPattern. The WHERE clause is represented using sp:where."
  {:db/ident :sp/Modify,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "Represents a MODIFY (part of SPARQL UPDATE language). The graph IRIs are stored in sp:graphIRI. The template patterns are stored in sp:deletePattern and sp:insertPattern. The WHERE clause is represented using sp:where.",
   :rdfs/label #xsd/string "Modify",
   :rdfs/subClassOf [:sp/Update :sp/Command :rdfs/Resource :sp/SystemClass]})

(def NamedGraph
  "A named Graph element such as GRAPH <uri> {...}."
  {:db/ident        :sp/NamedGraph,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/string
                     "A named Graph element such as GRAPH <uri> {...}.",
   :rdfs/label      #xsd/string "Named graph",
   :rdfs/subClassOf [:sp/ElementGroup
                     :sp/Element
                     :rdfs/Resource
                     :sp/SystemClass]})

(def NotExists
  "A NOT EXISTS element group."
  {:db/ident        :sp/NotExists,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/string "A NOT EXISTS element group.",
   :rdfs/label      #xsd/string "Not exists",
   :rdfs/subClassOf [:sp/ElementGroup
                     :sp/Element
                     :rdfs/Resource
                     :sp/SystemClass]})

(def Optional
  "An optional element in a query."
  {:db/ident        :sp/Optional,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/string "An optional element in a query.",
   :rdfs/label      #xsd/string "Optional",
   :rdfs/subClassOf [:sp/ElementGroup
                     :sp/Element
                     :rdfs/Resource
                     :sp/SystemClass]})

(def OrderByCondition
  "An abstract base class for ascending or descending order conditions. Instances of this class (typically bnodes) must have a value for expression to point to the actual values."
  {:db/ident :sp/OrderByCondition,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "An abstract base class for ascending or descending order conditions. Instances of this class (typically bnodes) must have a value for expression to point to the actual values.",
   :rdfs/label #xsd/string "Order by condition",
   :rdfs/subClassOf [:sp/SystemClass :rdfs/Resource]})

(def Path
  "The base class of SPARQL property path expressions. Paths are used by sp:TriplePath triple paths."
  {:db/ident :sp/Path,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "The base class of SPARQL property path expressions. Paths are used by sp:TriplePath triple paths.",
   :rdfs/label #xsd/string "Path",
   :rdfs/subClassOf [:sp/SystemClass :rdfs/Resource]})

(def Query
  "Abstract base class of the various types of supported queries. Common to all types of queries is that they can have a body (\"WHERE clause\")."
  {:db/ident :sp/Query,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "Abstract base class of the various types of supported queries. Common to all types of queries is that they can have a body (\"WHERE clause\").",
   :rdfs/label #xsd/string "Query",
   :rdfs/subClassOf [:sp/Command :rdfs/Resource :sp/SystemClass]})

(def ReverseLinkPath
  "Reverse link path"
  {:db/ident        :sp/ReverseLinkPath,
   :rdf/type        :rdfs/Class,
   :rdfs/label      #xsd/string "Reverse link path",
   :rdfs/subClassOf [:sp/Path :rdfs/Resource :sp/SystemClass]})

(def ReversePath
  "A path with reversed direction."
  {:db/ident        :sp/ReversePath,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/string "A path with reversed direction.",
   :rdfs/label      #xsd/string "Reverse path",
   :rdfs/subClassOf [:sp/Path :rdfs/Resource :sp/SystemClass]})

(def Sample
  "Represents SAMPLE aggregations"
  {:db/ident        :sp/Sample,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/string "Represents SAMPLE aggregations",
   :rdfs/label      #xsd/string "SAMPLE",
   :rdfs/subClassOf [:sp/Aggregation :rdfs/Resource :sp/SystemClass]})

(def Select
  "A SELECT-type query that returns variable bindings as its result."
  {:db/ident :sp/Select,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A SELECT-type query that returns variable bindings as its result.",
   :rdfs/label #xsd/string "Select query",
   :rdfs/subClassOf [:sp/Query :sp/Command :rdfs/Resource :sp/SystemClass]})

(def SeqPath
  "A sequence of multiple paths."
  {:db/ident        :sp/SeqPath,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/string "A sequence of multiple paths.",
   :rdfs/label      #xsd/string "Seq path",
   :rdfs/subClassOf [:sp/Path :rdfs/Resource :sp/SystemClass]})

(def Service
  "A SERVICE call that matches a nested sub-pattern against a SPARQL end point specified by a URI."
  {:db/ident :sp/Service,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A SERVICE call that matches a nested sub-pattern against a SPARQL end point specified by a URI.",
   :rdfs/label #xsd/string "Service",
   :rdfs/subClassOf
   [:sp/ElementGroup :sp/Element :rdfs/Resource :sp/SystemClass]})

(def SubQuery
  "A nested SELECT query inside of an element list. The query is stored in sp:query."
  {:db/ident :sp/SubQuery,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A nested SELECT query inside of an element list. The query is stored in sp:query.",
   :rdfs/label #xsd/string "Sub query",
   :rdfs/subClassOf [:sp/Element :rdfs/Resource :sp/SystemClass]})

(def Sum
  "Represents sum aggregations, e.g. SELECT SUM(?varName)..."
  {:db/ident :sp/Sum,
   :rdf/type :rdfs/Class,
   :rdfs/comment #xsd/string
                  "Represents sum aggregations, e.g. SELECT SUM(?varName)...",
   :rdfs/label #xsd/string "SUM",
   :rdfs/subClassOf [:sp/Aggregation :rdfs/Resource :sp/SystemClass]})

(def SystemClass
  "An \"artificial\" root class that groups all SP classes. This makes them look much less overwhelming in UI tools. Typical end users don't need to see those classes anyway."
  {:db/ident :sp/SystemClass,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "An \"artificial\" root class that groups all SP classes. This makes them look much less overwhelming in UI tools. Typical end users don't need to see those classes anyway.",
   :rdfs/label #xsd/string "SP System class",
   :rdfs/subClassOf :rdfs/Resource})

(def Triple
  "A base class for TriplePattern and TripleTemplate. This basically specifies that subject, predicate and object must be present."
  {:db/ident :sp/Triple,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A base class for TriplePattern and TripleTemplate. This basically specifies that subject, predicate and object must be present.",
   :rdfs/label #xsd/string "Triple",
   :rdfs/subClassOf [:sp/Tuple :rdfs/Resource :sp/SystemClass]})

(def TriplePath
  "Similar to a TriplePattern, but with a path expression as its predicate. For example, this can be used to express transitive sub-class relationships (?subClass rdfs:subClassOf* ?superClass)."
  {:db/ident :sp/TriplePath,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "Similar to a TriplePattern, but with a path expression as its predicate. For example, this can be used to express transitive sub-class relationships (?subClass rdfs:subClassOf* ?superClass).",
   :rdfs/label #xsd/string "Triple path",
   :rdfs/subClassOf [:sp/Element :sp/Tuple :rdfs/Resource :sp/SystemClass]})

(def TriplePattern
  "A triple pattern used in the body of a query."
  {:db/ident :sp/TriplePattern,
   :rdf/type :rdfs/Class,
   :rdfs/comment #xsd/string "A triple pattern used in the body of a query.",
   :rdfs/label #xsd/string "Triple pattern",
   :rdfs/subClassOf
   [:sp/Element :sp/Triple :rdfs/Resource :sp/Tuple :sp/SystemClass]})

(def TripleTemplate
  "A prototypical triple used as template in the head of a Construct query. May contain variables."
  {:db/ident :sp/TripleTemplate,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A prototypical triple used as template in the head of a Construct query. May contain variables.",
   :rdfs/label #xsd/string "Triple template",
   :rdfs/subClassOf [:sp/Triple :rdfs/Resource :sp/Tuple :sp/SystemClass]})

(def Tuple
  "Abstract base class for things that have subject and object."
  {:db/ident :sp/Tuple,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string "Abstract base class for things that have subject and object.",
   :rdfs/label #xsd/string "Tuple",
   :rdfs/subClassOf [:sp/SystemClass :rdfs/Resource]})

(def Union
  "A UNION group."
  {:db/ident        :sp/Union,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/string "A UNION group.",
   :rdfs/label      #xsd/string "Union",
   :rdfs/subClassOf [:sp/ElementGroup
                     :sp/Element
                     :rdfs/Resource
                     :sp/SystemClass]})

(def Update
  "Abstract base class to group the various SPARQL UPDATE commands."
  {:db/ident :sp/Update,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "Abstract base class to group the various SPARQL UPDATE commands.",
   :rdfs/label #xsd/string "Update",
   :rdfs/subClassOf [:sp/Command :rdfs/Resource :sp/SystemClass]})

(def Values
  "A VALUES element. sp:varNames points to an rdf:List of strings for the variables, sp:values to an rdf:List of rdf:Lists with nodes for each variable, in the order defined by the variables list."
  {:db/ident :sp/Values,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A VALUES element. sp:varNames points to an rdf:List of strings for the variables, sp:values to an rdf:List of rdf:Lists with nodes for each variable, in the order defined by the variables list.",
   :rdfs/label #xsd/string "Values",
   :rdfs/subClassOf [:sp/Element :rdfs/Resource :sp/SystemClass]})

(def Variable
  "A variable mentioned in a Triple or expression. Variables are often blank nodes with the variable name stored in ts:name. Variables can also be supplied with a URI in which case the system will attempt to reuse the same variable instance across multiple query definitions."
  {:db/ident :sp/Variable,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A variable mentioned in a Triple or expression. Variables are often blank nodes with the variable name stored in ts:name. Variables can also be supplied with a URI in which case the system will attempt to reuse the same variable instance across multiple query definitions.",
   :rdfs/label #xsd/string "Variable",
   :rdfs/subClassOf [:sp/SystemClass :rdfs/Resource]})

(def all
  "Used in DROP and CLEAR."
  {:db/ident           :sp/all,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/string "Used in DROP and CLEAR.",
   :rdfs/label         #xsd/string "all",
   :rdfs/range         :xsd/boolean,
   :rdfs/subPropertyOf :sp/systemProperty})

(def arg
  "Abstract superproperty for the enumerated arg1, arg2 etc."
  {:db/ident     :sp/arg,
   :rdf/type     :rdf/Property,
   :rdfs/comment #xsd/string
                  "Abstract superproperty for the enumerated arg1, arg2 etc.",
   :rdfs/label   #xsd/string "arg"})

(def arg1
  "The first argument of a function call."
  {:db/ident           :sp/arg1,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/string "The first argument of a function call.",
   :rdfs/label         #xsd/string "arg1",
   :rdfs/subPropertyOf :sp/arg})

(def arg2
  "The second argument of a function call."
  {:db/ident           :sp/arg2,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/string "The second argument of a function call.",
   :rdfs/label         #xsd/string "arg2",
   :rdfs/subPropertyOf :sp/arg})

(def arg3
  "The third argument of a function call."
  {:db/ident           :sp/arg3,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/string "The third argument of a function call.",
   :rdfs/label         #xsd/string "arg3",
   :rdfs/subPropertyOf :sp/arg})

(def arg4
  "The forth argument of a function call."
  {:db/ident           :sp/arg4,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/string "The forth argument of a function call.",
   :rdfs/label         #xsd/string "arg4",
   :rdfs/subPropertyOf :sp/arg})

(def arg5
  "The fifth argument of a function call. Further arguments are not common in SPARQL, therefore no sp:arg6, etc are defined here. However, they can be created if needed."
  {:db/ident :sp/arg5,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The fifth argument of a function call. Further arguments are not common in SPARQL, therefore no sp:arg6, etc are defined here. However, they can be created if needed.",
   :rdfs/label #xsd/string "arg5",
   :rdfs/subPropertyOf :sp/arg})

(def as
  "Points to a Variable used in an AS statement such as COUNT aggregates."
  {:db/ident :sp/as,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Points to a Variable used in an AS statement such as COUNT aggregates.",
   :rdfs/label #xsd/string "as",
   :rdfs/range :sp/Variable,
   :rdfs/subPropertyOf :sp/systemProperty})

(def bindings
  "The actual bindings of a sp:Values element."
  {:db/ident           :sp/bindings,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/string
                        "The actual bindings of a sp:Values element.",
   :rdfs/domain        :sp/Values,
   :rdfs/label         #xsd/string "bindings",
   :rdfs/range         :rdf/List,
   :rdfs/subPropertyOf :sp/systemProperty})

(def default
  "Used in DROP and CLEAR."
  {:db/ident           :sp/default,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/string "Used in DROP and CLEAR.",
   :rdfs/label         #xsd/string "default",
   :rdfs/range         :xsd/boolean,
   :rdfs/subPropertyOf :sp/systemProperty})

(def deletePattern
  "Points to a list of sp:TripleTemplates and sp:NamedGraphs in a modify operation."
  {:db/ident :sp/deletePattern,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Points to a list of sp:TripleTemplates and sp:NamedGraphs in a modify operation.",
   :rdfs/domain :sp/Update,
   :rdfs/label #xsd/string "delete pattern",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sp/systemProperty})

(def distinct
  "A marker property to indicate that a Select query is of type SELECT DISTINCT."
  {:db/ident :sp/distinct,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "A marker property to indicate that a Select query is of type SELECT DISTINCT.",
   :rdfs/domain :sp/Select,
   :rdfs/label #xsd/string "distinct",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :sp/systemProperty})

(def document
  "The URI of the document to load using a LOAD Update operation."
  {:db/ident :sp/document,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string "The URI of the document to load using a LOAD Update operation.",
   :rdfs/domain :sp/Load,
   :rdfs/label #xsd/string "document",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :sp/systemProperty})

(def elements
  "Points to an ElementList, for example in an Optional element."
  {:db/ident :sp/elements,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string "Points to an ElementList, for example in an Optional element.",
   :rdfs/label #xsd/string "elements",
   :rdfs/range :sp/ElementList,
   :rdfs/subPropertyOf :sp/systemProperty})

(def expression
  "Points to an expression, for example in a Filter or Assignment."
  {:db/ident :sp/expression,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Points to an expression, for example in a Filter or Assignment.",
   :rdfs/label #xsd/string "expression",
   :rdfs/subPropertyOf :sp/systemProperty})

(def from
  "Specifies an RDF Dataset used by a Query (FROM syntax in SPARQL). Values of this property must be URI resources."
  {:db/ident :sp/from,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Specifies an RDF Dataset used by a Query (FROM syntax in SPARQL). Values of this property must be URI resources.",
   :rdfs/domain :sp/Query,
   :rdfs/label #xsd/string "from",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :sp/systemProperty})

(def fromNamed
  "Specifies a named RDF Dataset used by a Query (FROM NAMED syntax in SPARQL). Values of this property must be URI resources."
  {:db/ident :sp/fromNamed,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Specifies a named RDF Dataset used by a Query (FROM NAMED syntax in SPARQL). Values of this property must be URI resources.",
   :rdfs/domain :sp/Query,
   :rdfs/label #xsd/string "from named",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :sp/systemProperty})

(def graphIRI
  "Points to graph names (IRIs) in various sp:Update operations."
  {:db/ident :sp/graphIRI,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string "Points to graph names (IRIs) in various sp:Update operations.",
   :rdfs/label #xsd/string "graph IRI",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :sp/systemProperty})

(def graphNameNode
  "The name (URI or Variable) of a NamedGraph."
  {:db/ident           :sp/graphNameNode,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/string
                        "The name (URI or Variable) of a NamedGraph.",
   :rdfs/domain        :sp/NamedGraph,
   :rdfs/label         #xsd/string "graph name node",
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :sp/systemProperty})

(def groupBy
  "Points from a Query to the list of GROUP BY expressions."
  {:db/ident :sp/groupBy,
   :rdf/type :rdf/Property,
   :rdfs/comment #xsd/string
                  "Points from a Query to the list of GROUP BY expressions.",
   :rdfs/domain :sp/Select,
   :rdfs/label #xsd/string "group by",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sp/systemProperty})

(def having
  "Points from a SELECT query to a list of HAVING expressions."
  {:db/ident :sp/having,
   :rdf/type :rdf/Property,
   :rdfs/comment #xsd/string
                  "Points from a SELECT query to a list of HAVING expressions.",
   :rdfs/domain :sp/Select,
   :rdfs/label #xsd/string "having",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sp/systemProperty})

(def insertPattern
  "Points to a list of sp:TripleTemplates or sp:NamedGraphs in a modify command."
  {:db/ident :sp/insertPattern,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Points to a list of sp:TripleTemplates or sp:NamedGraphs in a modify command.",
   :rdfs/domain :sp/Modify,
   :rdfs/label #xsd/string "insert pattern",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sp/systemProperty})

(def into
  "The (optional) target of a LOAD Update operation."
  {:db/ident           :sp/into,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/string
                        "The (optional) target of a LOAD Update operation.",
   :rdfs/domain        :sp/Load,
   :rdfs/label         #xsd/string "into",
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :sp/systemProperty})

(def limit
  "The LIMIT solution modifier of a Query."
  {:db/ident           :sp/limit,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/string "The LIMIT solution modifier of a Query.",
   :rdfs/domain        :sp/Query,
   :rdfs/label         #xsd/string "limit",
   :rdfs/range         :xsd/long,
   :rdfs/subPropertyOf :sp/systemProperty})

(def modMax
  "mod max"
  {:db/ident           :sp/modMax,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :sp/ModPath,
   :rdfs/label         #xsd/string "mod max",
   :rdfs/range         :xsd/integer,
   :rdfs/subPropertyOf :sp/systemProperty})

(def modMin
  "mod min"
  {:db/ident           :sp/modMin,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :sp/ModPath,
   :rdfs/label         #xsd/string "mod min",
   :rdfs/range         :xsd/integer,
   :rdfs/subPropertyOf :sp/systemProperty})

(def named
  "Used in DROP and CLEAR."
  {:db/ident           :sp/named,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/string "Used in DROP and CLEAR.",
   :rdfs/label         #xsd/string "named",
   :rdfs/range         :xsd/boolean,
   :rdfs/subPropertyOf :sp/systemProperty})

(def node
  "node"
  {:db/ident           :sp/node,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :sp/ReverseLinkPath,
   :rdfs/label         #xsd/string "node",
   :rdfs/subPropertyOf :sp/systemProperty})

(def object
  "An RDF Node or Variable describing the object of a triple."
  {:db/ident :sp/object,
   :rdf/type :rdf/Property,
   :rdfs/comment #xsd/string
                  "An RDF Node or Variable describing the object of a triple.",
   :rdfs/domain :sp/Tuple,
   :rdfs/label #xsd/string "object",
   :rdfs/subPropertyOf :sp/systemProperty})

(def offset
  "The OFFSET solution modifier of a Query."
  {:db/ident           :sp/offset,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/string "The OFFSET solution modifier of a Query.",
   :rdfs/domain        :sp/Query,
   :rdfs/label         #xsd/string "offset",
   :rdfs/range         :xsd/long,
   :rdfs/subPropertyOf :sp/systemProperty})

(def orderBy
  "Links a query with an ORDER BY clause where the values are rdf:List containing OrderByConditions or expressions. While the domain of this property is sp:Query, only Describe and Select queries can have values of it."
  {:db/ident :sp/orderBy,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Links a query with an ORDER BY clause where the values are rdf:List containing OrderByConditions or expressions. While the domain of this property is sp:Query, only Describe and Select queries can have values of it.",
   :rdfs/domain :sp/Query,
   :rdfs/label #xsd/string "order by",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sp/systemProperty})

(def path
  "Points from a TriplePath to its path."
  {:db/ident           :sp/path,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/string "Points from a TriplePath to its path.",
   :rdfs/domain        :sp/TriplePath,
   :rdfs/label         #xsd/string "path",
   :rdfs/range         :sp/Path,
   :rdfs/subPropertyOf :sp/systemProperty})

(def path1
  "The first child path of a property path. Used by sp:AltPath and sp:SeqPath."
  {:db/ident :sp/path1,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The first child path of a property path. Used by sp:AltPath and sp:SeqPath.",
   :rdfs/label #xsd/string "path1",
   :rdfs/range :sp/Path,
   :rdfs/subPropertyOf :sp/systemProperty})

(def path2
  "The second child path of a property path. Used by sp:AltPath and sp:SeqPath."
  {:db/ident :sp/path2,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The second child path of a property path. Used by sp:AltPath and sp:SeqPath.",
   :rdfs/label #xsd/string "path2",
   :rdfs/range :sp/Path,
   :rdfs/subPropertyOf :sp/systemProperty})

(def predicate
  "A resource or Variable describing the predicate of a triple."
  {:db/ident :sp/predicate,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string "A resource or Variable describing the predicate of a triple.",
   :rdfs/domain :sp/Triple,
   :rdfs/label #xsd/string "predicate",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :sp/systemProperty})

(def query
  "Links a SubQuery resource with the nested Query."
  {:db/ident           :sp/query,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/string
                        "Links a SubQuery resource with the nested Query.",
   :rdfs/domain        :sp/SubQuery,
   :rdfs/label         #xsd/string "query",
   :rdfs/range         :sp/Query,
   :rdfs/subPropertyOf :sp/systemProperty})

(def reduced
  "A property with true to indicate that a Select query has a REDUCED flag."
  {:db/ident :sp/reduced,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "A property with true to indicate that a Select query has a REDUCED flag.",
   :rdfs/domain :sp/Select,
   :rdfs/label #xsd/string "reduced",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :sp/systemProperty})

(def resultNodes
  "Contains the result nodes (URI resources or Variables) of a Describe query."
  {:db/ident :sp/resultNodes,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Contains the result nodes (URI resources or Variables) of a Describe query.",
   :rdfs/domain :sp/Describe,
   :rdfs/label #xsd/string "result nodes",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sp/systemProperty})

(def resultVariables
  "An rdf:List of variables that are returned by a Select query."
  {:db/ident :sp/resultVariables,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string "An rdf:List of variables that are returned by a Select query.",
   :rdfs/domain :sp/Select,
   :rdfs/label #xsd/string "result variables",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sp/systemProperty})

(def separator
  "Stores the separator=\"...\" value of a GROUP_CONCAT (sp:GroupConcat) aggregation."
  {:db/ident :sp/separator,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Stores the separator=\"...\" value of a GROUP_CONCAT (sp:GroupConcat) aggregation.",
   :rdfs/domain :sp/GroupConcat,
   :rdfs/label #xsd/string "separator",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :sp/systemProperty})

(def serviceURI
  "Used by sp:Service to specify the URI of the SPARQL end point to invoke. Must point to a URI node."
  {:db/ident :sp/serviceURI,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Used by sp:Service to specify the URI of the SPARQL end point to invoke. Must point to a URI node.",
   :rdfs/domain :sp/Service,
   :rdfs/label #xsd/string "service URI",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :sp/systemProperty})

(def silent
  "silent"
  {:db/ident           :sp/silent,
   :rdf/type           :rdf/Property,
   :rdfs/label         #xsd/string "silent",
   :rdfs/range         :xsd/boolean,
   :rdfs/subPropertyOf :sp/systemProperty})

(def source
  "source"
  {:db/ident           :sp/source,
   :rdf/type           :rdf/Property,
   :rdfs/label         #xsd/string "source",
   :rdfs/subPropertyOf :sp/systemProperty})

(def subPath
  "The child path of a property path expression. This is used by ReversePath and ModPath."
  {:db/ident :sp/subPath,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The child path of a property path expression. This is used by ReversePath and ModPath.",
   :rdfs/label #xsd/string "sub path",
   :rdfs/subPropertyOf :sp/systemProperty})

(def subject
  "A resource or Variable describing the subject of a triple."
  {:db/ident :sp/subject,
   :rdf/type :rdf/Property,
   :rdfs/comment #xsd/string
                  "A resource or Variable describing the subject of a triple.",
   :rdfs/domain :sp/Tuple,
   :rdfs/label #xsd/string "subject",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :sp/systemProperty})

(def systemProperty
  "An abstract base proprerty that groups together the SP system properties. Users typically don't need to see them anyway."
  {:db/ident :sp/systemProperty,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "An abstract base proprerty that groups together the SP system properties. Users typically don't need to see them anyway.",
   :rdfs/label #xsd/string "SP system property"})

(def target
  "target"
  {:db/ident           :sp/target,
   :rdf/type           :rdf/Property,
   :rdfs/label         #xsd/string "target",
   :rdfs/subPropertyOf :sp/systemProperty})

(def templates
  "Points to a list of TripleTemplates that form the head of a Construct query."
  {:db/ident :sp/templates,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Points to a list of TripleTemplates that form the head of a Construct query.",
   :rdfs/domain :sp/Construct,
   :rdfs/label #xsd/string "templates",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sp/systemProperty})

(def text
  "Can be attached to sp:Queries to store a textual representation of the query. This can be useful for tools that do not have a complete SPIN Syntax parser available."
  {:db/ident :sp/text,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Can be attached to sp:Queries to store a textual representation of the query. This can be useful for tools that do not have a complete SPIN Syntax parser available.",
   :rdfs/label #xsd/string "text",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :sp/systemProperty})

(def using
  "using"
  {:db/ident           :sp/using,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :sp/Modify,
   :rdfs/label         #xsd/string "using",
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :sp/systemProperty})

(def usingNamed
  "using named"
  {:db/ident           :sp/usingNamed,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :sp/Modify,
   :rdfs/label         #xsd/string "using named",
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :sp/systemProperty})

(def values
  "The VALUES block at the end of a query. The object may just be an untyped blank node, i.e. the sp:Values type triple is optional."
  {:db/ident :sp/values,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The VALUES block at the end of a query. The object may just be an untyped blank node, i.e. the sp:Values type triple is optional.",
   :rdfs/domain :sp/Query,
   :rdfs/label #xsd/string "values",
   :rdfs/range :sp/Values,
   :rdfs/subPropertyOf :sp/systemProperty})

(def varName
  "The name of a Variable."
  {:db/ident           :sp/varName,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/string "The name of a Variable.",
   :rdfs/domain        :sp/Variable,
   :rdfs/label         #xsd/string "varName",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :sp/systemProperty})

(def varNames
  "The names of the variables (xsd:strings) of the variables declared for a VALUES element."
  {:db/ident :sp/varNames,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The names of the variables (xsd:strings) of the variables declared for a VALUES element.",
   :rdfs/domain :sp/Values,
   :rdfs/label #xsd/string "var names",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sp/systemProperty})

(def variable
  "The variable of a Bind element."
  {:db/ident           :sp/variable,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/string "The variable of a Bind element.",
   :rdfs/domain        :sp/Bind,
   :rdfs/label         #xsd/string "variable",
   :rdfs/range         :sp/Variable,
   :rdfs/subPropertyOf :sp/systemProperty})

(def where
  "The WHERE clause of a Query."
  {:db/ident           :sp/where,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/string "The WHERE clause of a Query.",
   :rdfs/label         #xsd/string "where",
   :rdfs/range         :sp/ElementList,
   :rdfs/subPropertyOf :sp/systemProperty})

(def with
  "with"
  {:db/ident           :sp/with,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :sp/Modify,
   :rdfs/label         #xsd/string "with",
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :sp/systemProperty})