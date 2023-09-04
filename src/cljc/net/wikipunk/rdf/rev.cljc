(ns net.wikipunk.rdf.rev
  {:dcat/downloadURL
   "https://raw.githubusercontent.com/iand/vocabdotorg/main/www/src/review/review.rdf",
   :namespaces {"cc"    "http://web.resource.org/cc/",
                "dc11"  "http://purl.org/dc/elements/1.1/",
                "foaf"  "http://xmlns.com/foaf/0.1/",
                "grddl" "http://www.w3.org/2003/g/data-view#",
                "owl"   "http://www.w3.org/2002/07/owl#",
                "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                "rev"   "http://purl.org/stuff/rev#",
                "vann"  "http://purl.org/vocab/vann/",
                "vs"    "http://www.w3.org/2003/06/sw-vocab-status/ns#"},
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "rev",
   :rdfa/uri "http://purl.org/stuff/rev#",
   :rdfs/isDefinedBy {:xsd/anyURI "http://vocab.org/review/terms.html"}}
  (:refer-clojure :exclude [type]))

(def Comment
  {:db/ident         :rev/Comment,
   :rdf/type         #{:rdfs/Class :owl/Class},
   :rdfs/comment     "A comment on a review",
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/stuff/rev#"},
   :rdfs/label       "Comment",
   :vs/moreinfo      "proposed by iterating.com",
   :vs/term_status   "deprecated"})

(def Feedback
  {:db/ident :rev/Feedback,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   "Feedback on the review. Expresses whether the review was useful or not",
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/stuff/rev#"},
   :rdfs/label "Feedback",
   :vs/moreinfo "proposed by iterating.com",
   :vs/term_status #{"testing" "deprecated"}})

(def Review
  {:db/ident         :rev/Review,
   :rdf/type         #{:rdfs/Class :owl/Class},
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A review of an work"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/stuff/rev#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Review"},
   :vs/moreinfo      "core term",
   :vs/term_status   "stable"})

(def commenter
  {:db/ident         :rev/commenter,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     "The commenter on the review",
   :rdfs/domain      #{:rev/Comment :rev/Feedback},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/stuff/rev#"},
   :rdfs/label       "commenter",
   :rdfs/range       :foaf/Agent,
   :vs/moreinfo      "proposed by iterating.com",
   :vs/term_status   "deprecated"})

(def hasComment
  {:db/ident         :rev/hasComment,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     "Used to associate a review with a comment on the review",
   :rdfs/domain      :rev/Review,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/stuff/rev#"},
   :rdfs/label       "hasComment",
   :rdfs/range       :rev/Comment,
   :vs/moreinfo      "proposed by iterating.com",
   :vs/term_status   "deprecated"})

(def hasFeedback
  {:db/ident         :rev/hasFeedback,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     "Associates a review with a feedback on the review",
   :rdfs/domain      :rev/Review,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/stuff/rev#"},
   :rdfs/label       "hasFeedback",
   :rdfs/range       :rev/Feedback,
   :vs/moreinfo      "proposed by iterating.com",
   :vs/term_status   "deprecated"})

(def hasReview
  {:db/ident         :rev/hasReview,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Associates a work with a a review"},
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/stuff/rev#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has Review"},
   :rdfs/range       :rev/Review,
   :vs/moreinfo      "core term",
   :vs/term_status   "stable"})

(def maxRating
  {:db/ident         :rev/maxRating,
   :dc11/description {:rdf/language "en",
                      :rdf/value    "Maximum value for rating property"},
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A numeric value"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/stuff/rev#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "max Rating"},
   :vs/moreinfo      "Introduced by request of Revyu.com",
   :vs/term_status   "stable"})

(def minRating
  {:db/ident         :rev/minRating,
   :dc11/description {:rdf/language "en",
                      :rdf/value    "Minimum value for rating property"},
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A numeric value"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/stuff/rev#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "min Rating"},
   :vs/moreinfo      "Introduced by request of Revyu.com",
   :vs/term_status   "stable"})

(def positiveVotes
  {:db/ident         :rev/positiveVotes,
   :rdf/type         #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment     "Number of positive usefulness votes (integer)",
   :rdfs/domain      :rev/Review,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/stuff/rev#"},
   :rdfs/label       "positiveVotes",
   :rdfs/range       :rdfs/Literal,
   :vs/moreinfo      "proposed by iterating.com",
   :vs/term_status   "deprecated"})

(def rating
  {:db/ident         :rev/rating,
   :rdf/type         #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A numeric value"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/stuff/rev#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "rating"},
   :vs/moreinfo      "core term",
   :vs/term_status   "stable"})

(def reviewer
  {:db/ident         :rev/reviewer,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The person that has written the review"},
   :rdfs/domain      :rev/Review,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/stuff/rev#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "reviewer"},
   :rdfs/range       :foaf/Person,
   :vs/moreinfo      "core term",
   :vs/term_status   "stable"})

(def text
  {:db/ident         :rev/text,
   :rdf/type         #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The text of the review"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/stuff/rev#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "text"},
   :vs/moreinfo      "core term",
   :vs/term_status   "stable"})

(def title
  {:db/ident           :rev/title,
   :rdf/type           #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment       "The title of the review",
   :rdfs/domain        :rev/Review,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/stuff/rev#"},
   :rdfs/label         "title",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :dc11/title,
   :vs/moreinfo        "proposed by iterating.com",
   :vs/term_status     "deprecated"})

(def totalVotes
  {:db/ident         :rev/totalVotes,
   :rdf/type         #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment     "Number of usefulness votes (integer)",
   :rdfs/domain      :rev/Review,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/stuff/rev#"},
   :rdfs/label       "totalVotes",
   :rdfs/range       :rdfs/Literal,
   :vs/moreinfo      "proposed by iterating.com",
   :vs/term_status   "deprecated"})

(def type
  {:db/ident         :rev/type,
   :rdf/type         #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment     "The type of media of a work under review",
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/stuff/rev#"},
   :rdfs/label       "type",
   :vs/moreinfo      "core term",
   :vs/term_status   "deprecated"})