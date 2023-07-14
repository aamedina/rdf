(ns net.wikipunk.rdf.test
  {:rdf/ns-prefix-map {"owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "test" "http://www.w3.org/2006/03/test-description#"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "test",
   :rdfa/uri          "http://www.w3.org/2006/03/test-description#"})

(def ReviewStatus
  "A particular stage in a review process"
  {:db/ident     :test/ReviewStatus,
   :rdf/type     :owl/Class,
   :rdfs/comment #xsd/string "A particular stage in a review process",
   :rdfs/label   #xsd/langString "Status in a review process@en"})

(def SimpleReviewStatus
  "A status for a simple review process containing 6 possible stages"
  {:db/ident :test/SimpleReviewStatus,
   :owl/oneOf [:test/unreviewed
               :test/accepted
               :test/assigned
               :test/approved
               :test/rejected
               :test/onhold],
   :rdf/type :owl/Class,
   :rdfs/label
   #xsd/langString
    "A status for a simple review process containing 6 possible stages@en",
   :rdfs/subClassOf :test/ReviewStatus})

(def SpecificationTestCase
  "A test case which relates to a requirement set in a specification"
  {:db/ident :test/SpecificationTestCase,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "A test case which relates to a requirement set in a specification",
   :rdfs/label #xsd/langString "A Test Case based on a specification@en",
   :rdfs/subClassOf [{:owl/minCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :test/specificationReference,
                      :rdf/type           :owl/Restriction}
                     :test/TestCase
                     {:owl/minCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :dc11/rights,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :dc11/title,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :dc11/title,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :dc11/description,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :test/purpose,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :test/purpose,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :dc11/contributor,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :test/reviewStatus,
                      :rdf/type           :owl/Restriction}]})

(def TestCase
  "A set of test inputs, execution conditions, and expected results developed for a particular objective, such as to exercise a particular program path or to verify compliance with a specific requirement"
  {:db/ident :test/TestCase,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "A set of test inputs, execution conditions, and expected results developed for a particular objective, such as to exercise a particular program path or to verify compliance with a specific requirement",
   :rdfs/label #xsd/langString "A Test Case@en",
   :rdfs/subClassOf [{:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :dc11/description,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :dc11/rights,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :dc11/title,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :dc11/contributor,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :dc11/title,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :test/purpose,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :test/reviewStatus,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :test/purpose,
                      :rdf/type           :owl/Restriction}]})

(def accepted
  "the item has gone through a first review, which shows it as valid for further processing"
  {:db/ident :test/accepted,
   :rdf/type :test/ReviewStatus,
   :rdfs/comment
   #xsd/string
    "the item has gone through a first review, which shows it as valid for further processing",
   :rdfs/label #xsd/langString "accepted@en"})

(def approved
  "the item has gone through the review process and was approved"
  {:db/ident :test/approved,
   :rdf/type :test/ReviewStatus,
   :rdfs/comment
   #xsd/string "the item has gone through the review process and was approved",
   :rdfs/label #xsd/langString "approved@en"})

(def assigned
  "a more specific review of the item has been assigned to someone"
  {:db/ident :test/assigned,
   :rdf/type :test/ReviewStatus,
   :rdfs/comment
   #xsd/string
    "a more specific review of the item has been assigned to someone",
   :rdfs/label #xsd/langString "assigned@en"})

(def expectedResults
  "The results that a conformant implementation is expected to produce when this test is executed"
  {:db/ident :test/expectedResults,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The results that a conformant implementation is expected to produce when this test is executed",
   :rdfs/domain :test/TestCase,
   :rdfs/label #xsd/langString "expected results@en"})

(def informationResourceInput
  "Information Resource (e.g. a file) used as input for the test case"
  {:db/ident :test/informationResourceInput,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Information Resource (e.g. a file) used as input for the test case@en",
   :rdfs/label #xsd/langString "information resource as input@en",
   :rdfs/range :gen/InformationResource,
   :rdfs/subPropertyOf :test/input})

(def informationResourceResults
  "Information Resource (e.g. a file) that contains the expected results for the test case"
  {:db/ident :test/informationResourceResults,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Information Resource (e.g. a file) that contains the expected results for the test case",
   :rdfs/label #xsd/langString "information resource as expected results@en",
   :rdfs/range :gen/InformationResource,
   :rdfs/subPropertyOf :test/expectedResults})

(def input
  "Parameters or data that are needed for the test execution."
  {:db/ident :test/input,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Parameters or data that are needed for the test execution.@en",
   :rdfs/domain :test/TestCase,
   :rdfs/label #xsd/langString "input@en"})

(def onhold
  "the item had already gone through the review process, but the results of the review need to be re-assessed due to new input"
  {:db/ident :test/onhold,
   :rdf/type :test/ReviewStatus,
   :rdfs/comment
   #xsd/string
    "the item had already gone through the review process, but the results of the review need to be re-assessed due to new input",
   :rdfs/label #xsd/string "on hold"})

(def preCondition
  "a condition that must be met before the test is executed"
  {:db/ident     :test/preCondition,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/langString
                  "a condition that must be met before the test is executed@en",
   :rdfs/domain  :test/TestCase,
   :rdfs/label   #xsd/langString "precondition@en",
   :rdfs/range   :rdfs/Literal})

(def purpose
  "purpose"
  {:db/ident    :test/purpose,
   :rdf/type    :owl/DatatypeProperty,
   :rdfs/domain :test/TestCase,
   :rdfs/label  #xsd/langString "purpose@en",
   :rdfs/range  :rdfs/Literal})

(def rejected
  "the item has gone through the review process and was rejected"
  {:db/ident :test/rejected,
   :rdf/type :test/ReviewStatus,
   :rdfs/comment
   #xsd/string "the item has gone through the review process and was rejected",
   :rdfs/label #xsd/langString "rejected@en"})

(def reviewStatus
  "status of review"
  {:db/ident   :test/reviewStatus,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label #xsd/langString "status of review@en",
   :rdfs/range :test/ReviewStatus})

(def specificationReference
  "a description or a link of what part of which specification lead to the creation of this test case"
  {:db/ident :test/specificationReference,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "a description or a link of what part of which specification lead to the creation of this test case@en",
   :rdfs/domain :test/TestCase,
   :rdfs/label #xsd/langString "reference in specification@en",
   :rdfs/range :rdfs/Literal})

(def unreviewed
  "the item has been proposed, but hasn't been reviewed (e.g. for completeness) yet"
  {:db/ident :test/unreviewed,
   :rdf/type :test/ReviewStatus,
   :rdfs/comment
   #xsd/string
    "the item has been proposed, but hasn't been reviewed (e.g. for completeness) yet",
   :rdfs/label #xsd/langString "unreviewed@en"})