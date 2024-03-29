(ns net.wikipunk.rdf.sp
  {:namespaces {"owl"  "http://www.w3.org/2002/07/owl#",
                "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                "sp"   "http://spinrdf.org/sp#",
                "spin" "http://spinrdf.org/spin#",
                "spl"  "http://spinrdf.org/spl#",
                "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :owl/versionInfo "1.5.1",
   :rdf/type :owl/Ontology,
   :rdfa/prefix "sp",
   :rdfa/uri "http://spinrdf.org/sp#",
   :rdfs/comment
   "An RDF schema to syntactically represent SPARQL queries and update commands as RDF triples.",
   :rdfs/label "SPIN SPARQL Syntax",
   :xsd/anyURI "http://spinrdf.org/sp"}
  (:refer-clojure :exclude [distinct into reduced]))

(def Add
  {:db/ident :sp/Add,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A SPARQL UPDATE ADD operation. Uses sp:source and sp:target to represent \"from\" and \"to\" graphs, respectively. Also sp:silent may be true.",
   :rdfs/label "Add",
   :rdfs/seeAlso {:xsd/anyURI "https://www.w3.org/TR/sparql11-update/#add"},
   :rdfs/subClassOf :sp/Update})

(def Aggregation
  {:db/ident :sp/Aggregation,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Base class of aggregation types (not part of the SPARQL 1.0 standard but supported by ARQ and other engines).",
   :rdfs/label "Aggregation",
   :rdfs/subClassOf :sp/SystemClass})

(def AltPath
  {:db/ident :sp/AltPath,
   :rdf/type :rdfs/Class,
   :rdfs/comment "An alternative path with the union of sp:path1 and sp:path2.",
   :rdfs/label "Alt path",
   :rdfs/subClassOf :sp/Path})

(def Asc
  {:db/ident        :sp/Asc,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Marker to indicate ascending order.",
   :rdfs/label      "Asc",
   :rdfs/subClassOf :sp/OrderByCondition})

(def Ask
  {:db/ident :sp/Ask,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An ASK query that returns true if the condition in the body is met by at least one result set.",
   :rdfs/label "Ask",
   :rdfs/subClassOf :sp/Query})

(def Avg
  {:db/ident        :sp/Avg,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Represents AVG aggregations.",
   :rdfs/label      "AVG",
   :rdfs/subClassOf :sp/Aggregation})

(def Bind
  {:db/ident        :sp/Bind,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A BIND element.",
   :rdfs/label      "Bind",
   :rdfs/subClassOf :sp/Element})

(def Clear
  {:db/ident :sp/Clear,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An Update operation that removes all triples from a specified graph. Must specify the graph using sp:graphIRI, or sp:default, sp:named or sp:all. May have the SILENT flag, encoded using sp:silent.",
   :rdfs/label "Clear",
   :rdfs/subClassOf :sp/Update})

(def Command
  {:db/ident :sp/Command,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A shared superclass for sp:Query and sp:Update that can be used to specify that the range of property can be either one.",
   :rdfs/label "Command",
   :rdfs/subClassOf :sp/SystemClass})

(def Construct
  {:db/ident :sp/Construct,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A CONSTRUCT-type query that can be used to construct new triples from template triples (head) that use variable bindings from the match patterns (body).",
   :rdfs/label "Construct",
   :rdfs/subClassOf :sp/Query})

(def Count
  {:db/ident :sp/Count,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Counts the number of times a variable is used. The variable is stored in the variable property. This might be left blank to indicate COUNT(*).",
   :rdfs/label "COUNT",
   :rdfs/subClassOf :sp/Aggregation})

(def Create
  {:db/ident :sp/Create,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An Update operation that creates a new empty graph with a name specified by sp:graphIRI. May have sp:silent set to true.",
   :rdfs/label "Create",
   :rdfs/subClassOf :sp/Update})

(def Delete
  {:db/ident :sp/Delete,
   :rdf/type #{:owl/DeprecatedClass :rdfs/Class},
   :rdfs/comment
   "Deprecated - use sp:Modify instead.\n\nRepresents a DELETE FROM (part of SPARQL UPDATE language). The graph IRIs are stored in sp:graphIRI. The template patterns to delete are stored in sp:deletePattern. The WHERE clause is represented using sp:where.",
   :rdfs/label "Delete",
   :rdfs/subClassOf :sp/Modify})

(def DeleteData
  {:db/ident :sp/DeleteData,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An Update operation to delete specific triples. The graph triples are represented using sp:data, which points to an rdf:List of sp:Triples or sp:NamedGraphs.",
   :rdfs/label "Delete data",
   :rdfs/subClassOf :sp/Update})

(def DeleteWhere
  {:db/ident :sp/DeleteWhere,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An Update operation where the triples matched by the WHERE clause (sp:where) will be the triples deleted.",
   :rdfs/label "Delete where",
   :rdfs/subClassOf :sp/Update})

(def Desc
  {:db/ident        :sp/Desc,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Marker to indicate descending order.",
   :rdfs/label      "Desc",
   :rdfs/subClassOf :sp/OrderByCondition})

(def Describe
  {:db/ident        :sp/Describe,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A DESCRIBE-type Query.",
   :rdfs/label      "Describe",
   :rdfs/subClassOf :sp/Query})

(def Drop
  {:db/ident :sp/Drop,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An Update operation that removes a specified graph from the Graph Store. Must specify the graph using sp:graphIRI, or sp:default, sp:named or sp:all. May have the SILENT flag, encoded using sp:silent.",
   :rdfs/label "Drop",
   :rdfs/subClassOf :sp/Update})

(def Element
  {:db/ident        :sp/Element,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "An abstract base class for all pattern elements.",
   :rdfs/label      "Element",
   :rdfs/subClassOf :sp/SystemClass})

(def ElementGroup
  {:db/ident        :sp/ElementGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Abstract base class of group patterns.",
   :rdfs/label      "Element group",
   :rdfs/subClassOf :sp/Element})

(def ElementList
  {:db/ident :sp/ElementList,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A list of Elements. This class is never instantiated directly as SPIN will use plain rdf:Lists to store element lists.",
   :rdfs/label "Element list",
   :rdfs/subClassOf #{:rdf/List :sp/ElementGroup}})

(def Exists
  {:db/ident        :sp/Exists,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "An EXISTS element group.",
   :rdfs/label      "Exists",
   :rdfs/subClassOf :sp/ElementGroup})

(def Filter
  {:db/ident :sp/Filter,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A constraint element that evaluates a given expression to true or false.",
   :rdfs/label "Filter",
   :rdfs/subClassOf :sp/Element})

(def GroupConcat
  {:db/ident        :sp/GroupConcat,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Represents GROUP_CONCAT aggregations.",
   :rdfs/label      "GROUP_CONCAT",
   :rdfs/subClassOf :sp/Aggregation})

(def Insert
  {:db/ident :sp/Insert,
   :rdf/type #{:owl/DeprecatedClass :rdfs/Class},
   :rdfs/comment
   "Deprecated - use sp:Modify instead.\n\nRepresents a INSERT INTO (part of SPARQL UPDATE language). The graph IRIs are stored in sp:graphIRI. The template patterns to delete are stored in sp:insertPattern. The WHERE clause is represented using sp:where.",
   :rdfs/label "Insert",
   :rdfs/subClassOf :sp/Modify})

(def InsertData
  {:db/ident :sp/InsertData,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An Update operation to insert specific triples. The graph triples are represented using sp:data, which points to an rdf:List of sp:Triples or sp:NamedGraphs.",
   :rdfs/label "Insert data",
   :rdfs/subClassOf :sp/Update})

(def Let
  {:db/ident :sp/Let,
   :rdf/type #{:owl/DeprecatedClass :rdfs/Class},
   :rdfs/comment
   "Deprecated: use sp:Bind instead.\n\nA variable assignment (LET (?<varName> := <expression>)). Not part of the SPARQL 1.0 standard, but (for example) ARQ.",
   :rdfs/label "Let",
   :rdfs/subClassOf :sp/Bind})

(def Load
  {:db/ident :sp/Load,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A LOAD Update operation. The document to load is specified using sp:document, and the (optional) target graph using sp:into.",
   :rdfs/label "Load",
   :rdfs/subClassOf :sp/Update})

(def Max
  {:db/ident        :sp/Max,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Represents MAX aggregations.",
   :rdfs/label      "MAX",
   :rdfs/subClassOf :sp/Aggregation})

(def Min
  {:db/ident        :sp/Min,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Represents MIN aggregations.",
   :rdfs/label      "MIN",
   :rdfs/subClassOf :sp/Aggregation})

(def Minus
  {:db/ident        :sp/Minus,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A MINUS element group.",
   :rdfs/label      "Minus",
   :rdfs/subClassOf :sp/ElementGroup})

(def ModPath
  {:db/ident        :sp/ModPath,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A modified path such as rdfs:subClassOf*.",
   :rdfs/label      "Mod path",
   :rdfs/subClassOf :sp/Path})

(def Modify
  {:db/ident :sp/Modify,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Represents a MODIFY (part of SPARQL UPDATE language). The graph IRIs are stored in sp:graphIRI. The template patterns are stored in sp:deletePattern and sp:insertPattern. The WHERE clause is represented using sp:where.",
   :rdfs/label "Modify",
   :rdfs/subClassOf :sp/Update})

(def NamedGraph
  {:db/ident        :sp/NamedGraph,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A named Graph element such as GRAPH <uri> {...}.",
   :rdfs/label      "Named graph",
   :rdfs/subClassOf :sp/ElementGroup})

(def NotExists
  {:db/ident        :sp/NotExists,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A NOT EXISTS element group.",
   :rdfs/label      "Not exists",
   :rdfs/subClassOf :sp/ElementGroup})

(def Optional
  {:db/ident        :sp/Optional,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "An optional element in a query.",
   :rdfs/label      "Optional",
   :rdfs/subClassOf :sp/ElementGroup})

(def OrderByCondition
  {:db/ident :sp/OrderByCondition,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An abstract base class for ascending or descending order conditions. Instances of this class (typically bnodes) must have a value for expression to point to the actual values.",
   :rdfs/label "Order by condition",
   :rdfs/subClassOf :sp/SystemClass})

(def Path
  {:db/ident :sp/Path,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The base class of SPARQL property path expressions. Paths are used by sp:TriplePath triple paths.",
   :rdfs/label "Path",
   :rdfs/subClassOf :sp/SystemClass})

(def Query
  {:db/ident :sp/Query,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Abstract base class of the various types of supported queries. Common to all types of queries is that they can have a body (\"WHERE clause\").",
   :rdfs/label "Query",
   :rdfs/subClassOf :sp/Command})

(def ReverseLinkPath
  {:db/ident        :sp/ReverseLinkPath,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Reverse link path",
   :rdfs/subClassOf :sp/Path})

(def ReversePath
  {:db/ident        :sp/ReversePath,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A path with reversed direction.",
   :rdfs/label      "Reverse path",
   :rdfs/subClassOf :sp/Path})

(def Sample
  {:db/ident        :sp/Sample,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Represents SAMPLE aggregations",
   :rdfs/label      "SAMPLE",
   :rdfs/subClassOf :sp/Aggregation})

(def Select
  {:db/ident :sp/Select,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A SELECT-type query that returns variable bindings as its result.",
   :rdfs/label "Select query",
   :rdfs/subClassOf :sp/Query})

(def SeqPath
  {:db/ident        :sp/SeqPath,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A sequence of multiple paths.",
   :rdfs/label      "Seq path",
   :rdfs/subClassOf :sp/Path})

(def Service
  {:db/ident :sp/Service,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A SERVICE call that matches a nested sub-pattern against a SPARQL end point specified by a URI.",
   :rdfs/label "Service",
   :rdfs/subClassOf :sp/ElementGroup})

(def SubQuery
  {:db/ident :sp/SubQuery,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A nested SELECT query inside of an element list. The query is stored in sp:query.",
   :rdfs/label "Sub query",
   :rdfs/subClassOf :sp/Element})

(def Sum
  {:db/ident        :sp/Sum,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Represents sum aggregations, e.g. SELECT SUM(?varName)...",
   :rdfs/label      "SUM",
   :rdfs/subClassOf :sp/Aggregation})

(def SystemClass
  {:db/ident :sp/SystemClass,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An \"artificial\" root class that groups all SP classes. This makes them look much less overwhelming in UI tools. Typical end users don't need to see those classes anyway.",
   :rdfs/label "SP System class",
   :rdfs/subClassOf :rdfs/Resource})

(def Triple
  {:db/ident :sp/Triple,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A base class for TriplePattern and TripleTemplate. This basically specifies that subject, predicate and object must be present.",
   :rdfs/label "Triple",
   :rdfs/subClassOf :sp/Tuple})

(def TriplePath
  {:db/ident :sp/TriplePath,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Similar to a TriplePattern, but with a path expression as its predicate. For example, this can be used to express transitive sub-class relationships (?subClass rdfs:subClassOf* ?superClass).",
   :rdfs/label "Triple path",
   :rdfs/subClassOf #{:sp/Tuple :sp/Element}})

(def TriplePattern
  {:db/ident        :sp/TriplePattern,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A triple pattern used in the body of a query.",
   :rdfs/label      "Triple pattern",
   :rdfs/subClassOf #{:sp/Triple :sp/Element}})

(def TripleTemplate
  {:db/ident :sp/TripleTemplate,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A prototypical triple used as template in the head of a Construct query. May contain variables.",
   :rdfs/label "Triple template",
   :rdfs/subClassOf :sp/Triple})

(def Tuple
  {:db/ident :sp/Tuple,
   :rdf/type :rdfs/Class,
   :rdfs/comment "Abstract base class for things that have subject and object.",
   :rdfs/label "Tuple",
   :rdfs/subClassOf :sp/SystemClass})

(def Union
  {:db/ident        :sp/Union,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A UNION group.",
   :rdfs/label      "Union",
   :rdfs/subClassOf :sp/ElementGroup})

(def Update
  {:db/ident :sp/Update,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Abstract base class to group the various SPARQL UPDATE commands.",
   :rdfs/label "Update",
   :rdfs/subClassOf :sp/Command})

(def Values
  {:db/ident :sp/Values,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A VALUES element. sp:varNames points to an rdf:List of strings for the variables, sp:values to an rdf:List of rdf:Lists with nodes for each variable, in the order defined by the variables list.",
   :rdfs/label "Values",
   :rdfs/subClassOf :sp/Element})

(def Variable
  {:db/ident :sp/Variable,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A variable mentioned in a Triple or expression. Variables are often blank nodes with the variable name stored in ts:name. Variables can also be supplied with a URI in which case the system will attempt to reuse the same variable instance across multiple query definitions.",
   :rdfs/label "Variable",
   :rdfs/subClassOf :sp/SystemClass})

(def all
  {:db/ident           :sp/all,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Used in DROP and CLEAR.",
   :rdfs/label         "all",
   :rdfs/range         :xsd/boolean,
   :rdfs/subPropertyOf :sp/systemProperty})

(def arg
  {:db/ident     :sp/arg,
   :rdf/type     :rdf/Property,
   :rdfs/comment "Abstract superproperty for the enumerated arg1, arg2 etc.",
   :rdfs/label   "arg"})

(def arg1
  {:db/ident           :sp/arg1,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The first argument of a function call.",
   :rdfs/label         "arg1",
   :rdfs/subPropertyOf :sp/arg})

(def arg2
  {:db/ident           :sp/arg2,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The second argument of a function call.",
   :rdfs/label         "arg2",
   :rdfs/subPropertyOf :sp/arg})

(def arg3
  {:db/ident           :sp/arg3,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The third argument of a function call.",
   :rdfs/label         "arg3",
   :rdfs/subPropertyOf :sp/arg})

(def arg4
  {:db/ident           :sp/arg4,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The forth argument of a function call.",
   :rdfs/label         "arg4",
   :rdfs/subPropertyOf :sp/arg})

(def arg5
  {:db/ident :sp/arg5,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The fifth argument of a function call. Further arguments are not common in SPARQL, therefore no sp:arg6, etc are defined here. However, they can be created if needed.",
   :rdfs/label "arg5",
   :rdfs/subPropertyOf :sp/arg})

(def as
  {:db/ident :sp/as,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Points to a Variable used in an AS statement such as COUNT aggregates.",
   :rdfs/label "as",
   :rdfs/range :sp/Variable,
   :rdfs/subPropertyOf :sp/systemProperty})

(def bindings
  {:db/ident           :sp/bindings,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The actual bindings of a sp:Values element.",
   :rdfs/domain        :sp/Values,
   :rdfs/label         "bindings",
   :rdfs/range         :rdf/List,
   :rdfs/subPropertyOf :sp/systemProperty})

(def default
  {:db/ident           :sp/default,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Used in DROP and CLEAR.",
   :rdfs/label         "default",
   :rdfs/range         :xsd/boolean,
   :rdfs/subPropertyOf :sp/systemProperty})

(def deletePattern
  {:db/ident :sp/deletePattern,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Points to a list of sp:TripleTemplates and sp:NamedGraphs in a modify operation.",
   :rdfs/domain :sp/Update,
   :rdfs/label "delete pattern",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sp/systemProperty})

(def distinct
  {:db/ident :sp/distinct,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A marker property to indicate that a Select query is of type SELECT DISTINCT.",
   :rdfs/domain :sp/Select,
   :rdfs/label "distinct",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :sp/systemProperty})

(def document
  {:db/ident :sp/document,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The URI of the document to load using a LOAD Update operation.",
   :rdfs/domain :sp/Load,
   :rdfs/label "document",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :sp/systemProperty})

(def elements
  {:db/ident :sp/elements,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Points to an ElementList, for example in an Optional element.",
   :rdfs/label "elements",
   :rdfs/range :sp/ElementList,
   :rdfs/subPropertyOf :sp/systemProperty})

(def expression
  {:db/ident :sp/expression,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Points to an expression, for example in a Filter or Assignment.",
   :rdfs/label "expression",
   :rdfs/subPropertyOf :sp/systemProperty})

(def from
  {:db/ident :sp/from,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Specifies an RDF Dataset used by a Query (FROM syntax in SPARQL). Values of this property must be URI resources.",
   :rdfs/domain :sp/Query,
   :rdfs/label "from",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :sp/systemProperty})

(def fromNamed
  {:db/ident :sp/fromNamed,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Specifies a named RDF Dataset used by a Query (FROM NAMED syntax in SPARQL). Values of this property must be URI resources.",
   :rdfs/domain :sp/Query,
   :rdfs/label "from named",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :sp/systemProperty})

(def graphIRI
  {:db/ident :sp/graphIRI,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Points to graph names (IRIs) in various sp:Update operations.",
   :rdfs/label "graph IRI",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :sp/systemProperty})

(def graphNameNode
  {:db/ident           :sp/graphNameNode,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The name (URI or Variable) of a NamedGraph.",
   :rdfs/domain        :sp/NamedGraph,
   :rdfs/label         "graph name node",
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :sp/systemProperty})

(def groupBy
  {:db/ident :sp/groupBy,
   :rdf/type :rdf/Property,
   :rdfs/comment "Points from a Query to the list of GROUP BY expressions.",
   :rdfs/domain :sp/Select,
   :rdfs/label "group by",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sp/systemProperty})

(def having
  {:db/ident :sp/having,
   :rdf/type :rdf/Property,
   :rdfs/comment "Points from a SELECT query to a list of HAVING expressions.",
   :rdfs/domain :sp/Select,
   :rdfs/label "having",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sp/systemProperty})

(def insertPattern
  {:db/ident :sp/insertPattern,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Points to a list of sp:TripleTemplates or sp:NamedGraphs in a modify command.",
   :rdfs/domain :sp/Modify,
   :rdfs/label "insert pattern",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sp/systemProperty})

(def into
  {:db/ident           :sp/into,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The (optional) target of a LOAD Update operation.",
   :rdfs/domain        :sp/Load,
   :rdfs/label         "into",
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :sp/systemProperty})

(def limit
  {:db/ident           :sp/limit,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The LIMIT solution modifier of a Query.",
   :rdfs/domain        :sp/Query,
   :rdfs/label         "limit",
   :rdfs/range         :xsd/long,
   :rdfs/subPropertyOf :sp/systemProperty})

(def modMax
  {:db/ident           :sp/modMax,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :sp/ModPath,
   :rdfs/label         "mod max",
   :rdfs/range         :xsd/integer,
   :rdfs/subPropertyOf :sp/systemProperty})

(def modMin
  {:db/ident           :sp/modMin,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :sp/ModPath,
   :rdfs/label         "mod min",
   :rdfs/range         :xsd/integer,
   :rdfs/subPropertyOf :sp/systemProperty})

(def named
  {:db/ident           :sp/named,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Used in DROP and CLEAR.",
   :rdfs/label         "named",
   :rdfs/range         :xsd/boolean,
   :rdfs/subPropertyOf :sp/systemProperty})

(def node
  {:db/ident           :sp/node,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :sp/ReverseLinkPath,
   :rdfs/label         "node",
   :rdfs/subPropertyOf :sp/systemProperty})

(def object
  {:db/ident :sp/object,
   :rdf/type :rdf/Property,
   :rdfs/comment "An RDF Node or Variable describing the object of a triple.",
   :rdfs/domain :sp/Tuple,
   :rdfs/label "object",
   :rdfs/subPropertyOf :sp/systemProperty})

(def offset
  {:db/ident           :sp/offset,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The OFFSET solution modifier of a Query.",
   :rdfs/domain        :sp/Query,
   :rdfs/label         "offset",
   :rdfs/range         :xsd/long,
   :rdfs/subPropertyOf :sp/systemProperty})

(def orderBy
  {:db/ident :sp/orderBy,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Links a query with an ORDER BY clause where the values are rdf:List containing OrderByConditions or expressions. While the domain of this property is sp:Query, only Describe and Select queries can have values of it.",
   :rdfs/domain :sp/Query,
   :rdfs/label "order by",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sp/systemProperty})

(def path
  {:db/ident           :sp/path,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Points from a TriplePath to its path.",
   :rdfs/domain        :sp/TriplePath,
   :rdfs/label         "path",
   :rdfs/range         :sp/Path,
   :rdfs/subPropertyOf :sp/systemProperty})

(def path1
  {:db/ident :sp/path1,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The first child path of a property path. Used by sp:AltPath and sp:SeqPath.",
   :rdfs/label "path1",
   :rdfs/range :sp/Path,
   :rdfs/subPropertyOf :sp/systemProperty})

(def path2
  {:db/ident :sp/path2,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The second child path of a property path. Used by sp:AltPath and sp:SeqPath.",
   :rdfs/label "path2",
   :rdfs/range :sp/Path,
   :rdfs/subPropertyOf :sp/systemProperty})

(def predicate
  {:db/ident :sp/predicate,
   :rdf/type :rdf/Property,
   :rdfs/comment "A resource or Variable describing the predicate of a triple.",
   :rdfs/domain :sp/Triple,
   :rdfs/label "predicate",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :sp/systemProperty})

(def query
  {:db/ident           :sp/query,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Links a SubQuery resource with the nested Query.",
   :rdfs/domain        :sp/SubQuery,
   :rdfs/label         "query",
   :rdfs/range         :sp/Query,
   :rdfs/subPropertyOf :sp/systemProperty})

(def reduced
  {:db/ident :sp/reduced,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A property with true to indicate that a Select query has a REDUCED flag.",
   :rdfs/domain :sp/Select,
   :rdfs/label "reduced",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :sp/systemProperty})

(def resultNodes
  {:db/ident :sp/resultNodes,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Contains the result nodes (URI resources or Variables) of a Describe query.",
   :rdfs/domain :sp/Describe,
   :rdfs/label "result nodes",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sp/systemProperty})

(def resultVariables
  {:db/ident :sp/resultVariables,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An rdf:List of variables that are returned by a Select query.",
   :rdfs/domain :sp/Select,
   :rdfs/label "result variables",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sp/systemProperty})

(def separator
  {:db/ident :sp/separator,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Stores the separator=\"...\" value of a GROUP_CONCAT (sp:GroupConcat) aggregation.",
   :rdfs/domain :sp/GroupConcat,
   :rdfs/label "separator",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :sp/systemProperty})

(def serviceURI
  {:db/ident :sp/serviceURI,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Used by sp:Service to specify the URI of the SPARQL end point to invoke. Must point to a URI node.",
   :rdfs/domain :sp/Service,
   :rdfs/label "service URI",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :sp/systemProperty})

(def silent
  {:db/ident           :sp/silent,
   :rdf/type           :rdf/Property,
   :rdfs/label         "silent",
   :rdfs/range         :xsd/boolean,
   :rdfs/subPropertyOf :sp/systemProperty})

(def source
  {:db/ident           :sp/source,
   :rdf/type           :rdf/Property,
   :rdfs/label         "source",
   :rdfs/subPropertyOf :sp/systemProperty})

(def subPath
  {:db/ident :sp/subPath,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The child path of a property path expression. This is used by ReversePath and ModPath.",
   :rdfs/label "sub path",
   :rdfs/subPropertyOf :sp/systemProperty})

(def subject
  {:db/ident :sp/subject,
   :rdf/type :rdf/Property,
   :rdfs/comment "A resource or Variable describing the subject of a triple.",
   :rdfs/domain :sp/Tuple,
   :rdfs/label "subject",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :sp/systemProperty})

(def systemProperty
  {:db/ident :sp/systemProperty,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An abstract base proprerty that groups together the SP system properties. Users typically don't need to see them anyway.",
   :rdfs/label "SP system property"})

(def target
  {:db/ident           :sp/target,
   :rdf/type           :rdf/Property,
   :rdfs/label         "target",
   :rdfs/subPropertyOf :sp/systemProperty})

(def templates
  {:db/ident :sp/templates,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Points to a list of TripleTemplates that form the head of a Construct query.",
   :rdfs/domain :sp/Construct,
   :rdfs/label "templates",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sp/systemProperty})

(def text
  {:db/ident :sp/text,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Can be attached to sp:Queries to store a textual representation of the query. This can be useful for tools that do not have a complete SPIN Syntax parser available.",
   :rdfs/label "text",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :sp/systemProperty})

(def using
  {:db/ident           :sp/using,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :sp/Modify,
   :rdfs/label         "using",
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :sp/systemProperty})

(def usingNamed
  {:db/ident           :sp/usingNamed,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :sp/Modify,
   :rdfs/label         "using named",
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :sp/systemProperty})

(def values
  {:db/ident :sp/values,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The VALUES block at the end of a query. The object may just be an untyped blank node, i.e. the sp:Values type triple is optional.",
   :rdfs/domain :sp/Query,
   :rdfs/label "values",
   :rdfs/range :sp/Values,
   :rdfs/subPropertyOf :sp/systemProperty})

(def varName
  {:db/ident           :sp/varName,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The name of a Variable.",
   :rdfs/domain        :sp/Variable,
   :rdfs/label         "varName",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :sp/systemProperty})

(def varNames
  {:db/ident :sp/varNames,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The names of the variables (xsd:strings) of the variables declared for a VALUES element.",
   :rdfs/domain :sp/Values,
   :rdfs/label "var names",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sp/systemProperty})

(def variable
  {:db/ident           :sp/variable,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The variable of a Bind element.",
   :rdfs/domain        :sp/Bind,
   :rdfs/label         "variable",
   :rdfs/range         :sp/Variable,
   :rdfs/subPropertyOf :sp/systemProperty})

(def where
  {:db/ident           :sp/where,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The WHERE clause of a Query.",
   :rdfs/label         "where",
   :rdfs/range         :sp/ElementList,
   :rdfs/subPropertyOf :sp/systemProperty})

(def with
  {:db/ident           :sp/with,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :sp/Modify,
   :rdfs/label         "with",
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :sp/systemProperty})

(def urn:uuid:dc5b6d4d-3bf0-5457-8db2-5e552747c03f
  {:owl/versionInfo "1.5.1",
   :rdf/type :owl/Ontology,
   :rdfs/comment
   "An RDF schema to syntactically represent SPARQL queries and update commands as RDF triples.",
   :rdfs/label "SPIN SPARQL Syntax",
   :xsd/anyURI "http://spinrdf.org/sp"})