(ns net.wikipunk.rdf.mf
  ^{:base       "http://www.w3.org/2001/sw/DataAccess/tests/test-manifest#",
    :namespaces {"dc11" "http://purl.org/dc/elements/1.1/",
                 "mf"
                 "http://www.w3.org/2001/sw/DataAccess/tests/test-manifest#",
                 "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
    :prefix     "mf",
    :source     "http://www.w3.org/2001/sw/DataAccess/tests/test-manifest#"}
  {:dc11/creator "Andy Seaborne",
   :dc11/date "2004-07",
   :dc11/description "Test case manifest vocabulary",
   :dc11/format "RDF",
   :dc11/publisher "W3C RDF Data Access Working Group",
   :dc11/subject "",
   :dc11/title "Test case manifest vocabulary",
   :rdf/type :owl/Ontology,
   :rdfs/comment "Manifest vocabulary for test cases",
   :xsd/anyURI "http://www.w3.org/2001/sw/DataAccess/tests/test-manifest#"}
  (:refer-clojure :exclude [name]))

(def IllFormedLiterals
  {:db/ident :mf/IllFormedLiterals,
   :rdf/type :mf/Notable,
   :rdfs/comment
   "Tests that involve lexical forms which are illegal for the datatype"})

(def KnownTypesDefault2Neq
  {:db/ident     :mf/KnownTypesDefault2Neq,
   :rdf/type     :mf/Requirement,
   :rdfs/comment "Values in disjoint value spaces are not equal"})

(def LangTagAwareness
  {:db/ident     :mf/LangTagAwareness,
   :rdf/type     :mf/Requirement,
   :rdfs/comment "Tests that require langauge tag handling in FILTERs"})

(def LaxCardinality
  {:db/ident :mf/LaxCardinality,
   :rdf/type :mf/ResultCardinality,
   :rdfs/comment
   "The given mf:result for a test with an mf:resultCardinality of mf:ReducedCardinalityTest \nis the results as if the REDUCED keyword were omitted. To pass such\na test, an implementation must produce a result set \nwith each solution in the expected results appearing at least once and \nno more than the number of times it appears in the expected results. Of \ncourse, there must also be no results produced that are not in the \nexpected results."})

(def Manifest
  {:db/ident     :mf/Manifest,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "The class of manifests"})

(def ManifestEntry
  {:db/ident     :mf/ManifestEntry,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "One entry in rdf:type list of entries"})

(def NegativeSyntaxTest
  {:db/ident :mf/NegativeSyntaxTest,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A type of test specifically for syntax testing. Syntax tests are not required to have an associated result, only an action. Negative syntax tests are tests of which the result should be a parser error.",
   :rdfs/label "Negative Syntax Test"})

(def NegativeSyntaxTest11
  {:db/ident :mf/NegativeSyntaxTest11,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A type of test specifically for syntax testing of new features in the SPARQL1.1 Query Language. Syntax tests are not required to have an associated result, only an action. Negative syntax tests are tests of which the result should be a parser error.",
   :rdfs/label "Negative Syntax Test for SPARQL1.1 Query"})

(def NegativeUpdateSyntaxTest11
  {:db/ident :mf/NegativeUpdateSyntaxTest11,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A type of test specifically for syntax testing of SPARQL1.1 Update. Syntax tests are not required to have an associated result, only an action. Negative syntax tests are tests of which the result should be a parser error.",
   :rdfs/label "Negative Syntax Test for SPARQL1.1 Update"})

(def Notable
  {:db/ident     :mf/Notable,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "Requirements for a  particular test"})

(def PositiveSyntaxTest
  {:db/ident :mf/PositiveSyntaxTest,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A type of test specifically for syntax testing. Syntax tests are not required to have an associated result, only an action.",
   :rdfs/label "Positive Syntax Test"})

(def PositiveSyntaxTest11
  {:db/ident :mf/PositiveSyntaxTest11,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A type of test specifically for syntax testing of new features in the SPARQL1.1 Query Language. Syntax tests are not required to have an associated result, only an action.",
   :rdfs/label "Positive Syntax Test for SPARQL1.1 Query"})

(def PositiveUpdateSyntaxTest11
  {:db/ident :mf/PositiveUpdateSyntaxTest11,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A type of test specifically for syntax testing of SPARQL1.1 Update. Syntax tests are not required to have an associated result, only an action.",
   :rdfs/label "Positive Syntax Test for SPARQL1.1 Update"})

(def QueryEvaluationTest
  {:db/ident :mf/QueryEvaluationTest,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A type of test specifically for query evaluation testing. Query evaluation tests are required to have an associated input dataset, a query, and an expected output dataset.",
   :rdfs/label "Query Evaluation Test"})

(def Requirement
  {:db/ident     :mf/Requirement,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "Requirements for a  particular test"})

(def ResultCardinality
  {:db/ident :mf/ResultCardinality,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Potential modes of evaluating a test's results with respect to solution cardinality"})

(def StringSimpleLiteralCmp
  {:db/ident :mf/StringSimpleLiteralCmp,
   :rdf/type :mf/Requirement,
   :rdfs/comment
   "Tests that require simple literal is the same value as an xsd:string of the same lexicial form"})

(def TestStatus
  {:db/ident     :mf/TestStatus,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "Statuses a test can have"})

(def UpdateEvaluationTest
  {:db/ident     :mf/UpdateEvaluationTest,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "The class of all SPARQL 1.1 Update evaluation tests",
   :rdfs/label   "Update Evaluation Test"})

(def XsdDateOperations
  {:db/ident     :mf/XsdDateOperations,
   :rdf/type     :mf/Requirement,
   :rdfs/comment "Tests that require xsd:date operations"})

(def accepted
  {:db/ident   :mf/accepted,
   :rdf/type   :mf/TestStatus,
   :rdfs/label "accepted"})

(def action
  {:db/ident     :mf/action,
   :rdf/type     :rdf/Property,
   :rdfs/comment "Action to perform",
   :rdfs/domain  :mf/ManifestEntry})

(def entries
  {:db/ident     :mf/entries,
   :rdf/type     :rdf/Property,
   :rdfs/comment "Connects the manifest resource to rdf:type list of entries",
   :rdfs/domain  :mf/Manifest,
   :rdfs/range   :rdf/List})

(def include
  {:db/ident     :mf/include,
   :rdf/type     :rdf/Property,
   :rdfs/comment "Connects the manifest resource to rdf:type list of manifests",
   :rdfs/domain  :mf/Manifest,
   :rdfs/range   :rdf/List})

(def name
  {:db/ident     :mf/name,
   :rdf/type     :rdf/Property,
   :rdfs/comment "Optional name of this entry",
   :rdfs/domain  :mf/ManifestEntry,
   :rdfs/range   :rdfs/Literal})

(def notable
  {:db/ident     :mf/notable,
   :rdf/type     :rdf/Property,
   :rdfs/comment "Notable feature of this test (advisory)",
   :rdfs/domain  :mf/ManifestEntry})

(def proposed
  {:db/ident   :mf/proposed,
   :rdf/type   :mf/TestStatus,
   :rdfs/label "proposed"})

(def rejected
  {:db/ident   :mf/rejected,
   :rdf/type   :mf/TestStatus,
   :rdfs/label "rejected"})

(def requires
  {:db/ident     :mf/requires,
   :rdf/type     :rdf/Property,
   :rdfs/comment "Required functionality for execution of this test",
   :rdfs/domain  :mf/ManifestEntry,
   :rdfs/range   :mf/Requirement})

(def result
  {:db/ident     :mf/result,
   :rdf/type     :rdf/Property,
   :rdfs/comment "The expected outcome",
   :rdfs/domain  :mf/ManifestEntry})

(def resultCardinality
  {:db/ident :mf/resultCardinality,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Specifies whether passing the test requires strict or lax cardinality adherence",
   :rdfs/domain :mf/ManifestEntry,
   :rdfs/range :mf/ResultCardinality})

(def status
  {:db/ident     :mf/status,
   :rdf/type     :rdf/Property,
   :rdfs/comment "The test status",
   :rdfs/domain  :mf/ManifestEntry,
   :rdfs/range   :mf/TestStatus})

(def urn:uuid:117acc28-3ec0-5286-848a-8998e57d897c
  {:dc11/creator "Andy Seaborne",
   :dc11/date "2004-07",
   :dc11/description "Test case manifest vocabulary",
   :dc11/format "RDF",
   :dc11/publisher "W3C RDF Data Access Working Group",
   :dc11/subject "",
   :dc11/title "Test case manifest vocabulary",
   :rdfs/comment "Manifest vocabulary for test cases",
   :xsd/anyURI "http://www.w3.org/2001/sw/DataAccess/tests/test-manifest#"})