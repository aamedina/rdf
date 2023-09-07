(ns net.wikipunk.rdf.test
  ^{:base       "http://www.w3.org/2006/03/test-description#",
    :namespaces {"owl"  "http://www.w3.org/2002/07/owl#",
                 "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                 "test" "http://www.w3.org/2006/03/test-description#"},
    :prefix     "test",
    :source     "http://www.w3.org/2006/03/test-description#"}
  {:rdf/type     :owl/Ontology,
   :rdfs/seeAlso {:xsd/anyURI
                  "http://www.w3.org/TR/2005/NOTE-test-metadata-20050914/"},
   :xsd/anyURI   "http://www.w3.org/2006/03/test-description"})

(def ReviewStatus
  {:db/ident     :test/ReviewStatus,
   :rdf/type     :owl/Class,
   :rdfs/comment "A particular stage in a review process",
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Status in a review process"}})

(def SimpleReviewStatus
  {:db/ident :test/SimpleReviewStatus,
   :owl/oneOf [:test/unreviewed
               :test/accepted
               :test/assigned
               :test/approved
               :test/rejected
               :test/onhold],
   :rdf/type :owl/Class,
   :rdfs/label
   {:rdf/language "en",
    :rdf/value
    "A status for a simple review process containing 6 possible stages"},
   :rdfs/subClassOf :test/ReviewStatus})

(def SpecificationTestCase
  {:db/ident :test/SpecificationTestCase,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A test case which relates to a requirement set in a specification",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "A Test Case based on a specification"},
   :rdfs/subClassOf #{:test/TestCase
                      {:owl/minCardinality 1,
                       :owl/onProperty     :test/specificationReference,
                       :rdf/type           :owl/Restriction}}})

(def TestCase
  {:db/ident :test/TestCase,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A set of test inputs, execution conditions, and expected results developed for a particular objective, such as to exercise a particular program path or to verify compliance with a specific requirement",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "A Test Case"},
   :rdfs/subClassOf #{{:owl/minCardinality 1,
                       :owl/onProperty     :dc11/rights,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :dc11/title,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :dc11/title,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :dc11/description,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :dc11/contributor,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :test/reviewStatus,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :test/purpose,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :test/purpose,
                       :rdf/type           :owl/Restriction}}})

(def accepted
  {:db/ident :test/accepted,
   :rdf/type :test/ReviewStatus,
   :rdfs/comment
   "the item has gone through a first review, which shows it as valid for further processing",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "accepted"}})

(def approved
  {:db/ident :test/approved,
   :rdf/type :test/ReviewStatus,
   :rdfs/comment
   "the item has gone through the review process and was approved",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "approved"}})

(def assigned
  {:db/ident :test/assigned,
   :rdf/type :test/ReviewStatus,
   :rdfs/comment
   "a more specific review of the item has been assigned to someone",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "assigned"}})

(def expectedResults
  {:db/ident :test/expectedResults,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The results that a conformant implementation is expected to produce when this test is executed",
   :rdfs/domain :test/TestCase,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "expected results"}})

(def informationResourceInput
  {:db/ident :test/informationResourceInput,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Information Resource (e.g. a file) used as input for the test case"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "information resource as input"},
   :rdfs/range :gen/InformationResource,
   :rdfs/subPropertyOf :test/input})

(def informationResourceResults
  {:db/ident :test/informationResourceResults,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Information Resource (e.g. a file) that contains the expected results for the test case",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "information resource as expected results"},
   :rdfs/range :gen/InformationResource,
   :rdfs/subPropertyOf :test/expectedResults})

(def input
  {:db/ident     :test/input,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Parameters or data that are needed for the test execution."},
   :rdfs/domain  :test/TestCase,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "input"}})

(def onhold
  {:db/ident :test/onhold,
   :rdf/type :test/ReviewStatus,
   :rdfs/comment
   "the item had already gone through the review process, but the results of the review need to be re-assessed due to new input",
   :rdfs/label "on hold"})

(def preCondition
  {:db/ident     :test/preCondition,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "a condition that must be met before the test is executed"},
   :rdfs/domain  :test/TestCase,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "precondition"},
   :rdfs/range   :rdfs/Literal})

(def purpose
  {:db/ident    :test/purpose,
   :rdf/type    :owl/DatatypeProperty,
   :rdfs/domain :test/TestCase,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "purpose"},
   :rdfs/range  :rdfs/Literal})

(def rejected
  {:db/ident :test/rejected,
   :rdf/type :test/ReviewStatus,
   :rdfs/comment
   "the item has gone through the review process and was rejected",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "rejected"}})

(def reviewStatus
  {:db/ident   :test/reviewStatus,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "status of review"},
   :rdfs/range :test/ReviewStatus})

(def specificationReference
  {:db/ident :test/specificationReference,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "a description or a link of what part of which specification lead to the creation of this test case"},
   :rdfs/domain :test/TestCase,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "reference in specification"},
   :rdfs/range :rdfs/Literal})

(def unreviewed
  {:db/ident :test/unreviewed,
   :rdf/type :test/ReviewStatus,
   :rdfs/comment
   "the item has been proposed, but hasn't been reviewed (e.g. for completeness) yet",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "unreviewed"}})

(def urn:uuid:de647c08-3ad4-59b7-bbdb-4d3ca8d0be79
  {:rdfs/seeAlso {:xsd/anyURI
                  "http://www.w3.org/TR/2005/NOTE-test-metadata-20050914/"},
   :xsd/anyURI   "http://www.w3.org/2006/03/test-description"})