(ns net.wikipunk.rdf.rev
  {:dcat/downloadURL
   "https://raw.githubusercontent.com/iand/vocabdotorg/main/www/src/review/review.rdf",
   :rdf/ns-prefix-map {"cc"    "http://web.resource.org/cc/",
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
   :rdfs/isDefinedBy {:rdfa/uri "http://vocab.org/review/terms.html"}}
  (:refer-clojure :exclude [type]))

(def Comment
  "A comment on a review"
  {:db/ident         :rev/Comment,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "A comment on a review",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       "Comment",
   :rdfs/subClassOf  :rdfs/Resource,
   :vs/moreinfo      "proposed by iterating.com",
   :vs/term_status   "deprecated"})

(def Feedback
  "Feedback on the review. Expresses whether the review was useful or not"
  {:db/ident :rev/Feedback,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "Feedback on the review. Expresses whether the review was useful or not",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label "Feedback",
   :rdfs/subClassOf :rdfs/Resource,
   :vs/moreinfo "proposed by iterating.com",
   :vs/term_status ["deprecated" "testing"]})

(def Review
  "A review of an work"
  {:db/ident         :rev/Review,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     #rdf/langString "A review of an work@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       #rdf/langString "Review@en",
   :rdfs/subClassOf  :rdfs/Resource,
   :vs/moreinfo      "core term",
   :vs/term_status   "stable"})

(def commenter
  "The commenter on the review"
  {:db/ident         :rev/commenter,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment     "The commenter on the review",
   :rdfs/domain      [:rev/Feedback :rev/Comment],
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       "commenter",
   :rdfs/range       :foaf/Agent,
   :vs/moreinfo      "proposed by iterating.com",
   :vs/term_status   "deprecated"})

(def hasComment
  "Used to associate a review with a comment on the review"
  {:db/ident         :rev/hasComment,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     "Used to associate a review with a comment on the review",
   :rdfs/domain      :rev/Review,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       "hasComment",
   :rdfs/range       :rev/Comment,
   :vs/moreinfo      "proposed by iterating.com",
   :vs/term_status   "deprecated"})

(def hasFeedback
  "Associates a review with a feedback on the review"
  {:db/ident         :rev/hasFeedback,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     "Associates a review with a feedback on the review",
   :rdfs/domain      :rev/Review,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       "hasFeedback",
   :rdfs/range       :rev/Feedback,
   :vs/moreinfo      "proposed by iterating.com",
   :vs/term_status   "deprecated"})

(def hasReview
  "Associates a work with a a review"
  {:db/ident         :rev/hasReview,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     #rdf/langString "Associates a work with a a review@en",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       #rdf/langString "has Review@en",
   :rdfs/range       :rev/Review,
   :vs/moreinfo      "core term",
   :vs/term_status   "stable"})

(def maxRating
  "Maximum value for rating property"
  {:db/ident         :rev/maxRating,
   :dc11/description #rdf/langString "Maximum value for rating property@en",
   :rdf/type         :rdf/Property,
   :rdfs/comment     #rdf/langString "A numeric value@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       #rdf/langString "max Rating@en",
   :vs/moreinfo      "Introduced by request of Revyu.com",
   :vs/term_status   "stable"})

(def minRating
  "Minimum value for rating property"
  {:db/ident         :rev/minRating,
   :dc11/description #rdf/langString "Minimum value for rating property@en",
   :rdf/type         :rdf/Property,
   :rdfs/comment     #rdf/langString "A numeric value@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       #rdf/langString "min Rating@en",
   :vs/moreinfo      "Introduced by request of Revyu.com",
   :vs/term_status   "stable"})

(def positiveVotes
  "Number of positive usefulness votes (integer)"
  {:db/ident         :rev/positiveVotes,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment     "Number of positive usefulness votes (integer)",
   :rdfs/domain      :rev/Review,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       "positiveVotes",
   :rdfs/range       :rdfs/Literal,
   :vs/moreinfo      "proposed by iterating.com",
   :vs/term_status   "deprecated"})

(def rating
  "A numeric value"
  {:db/ident         :rev/rating,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment     #rdf/langString "A numeric value@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       #rdf/langString "rating@en",
   :vs/moreinfo      "core term",
   :vs/term_status   "stable"})

(def reviewer
  "The person that has written the review"
  {:db/ident         :rev/reviewer,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     #rdf/langString
                      "The person that has written the review@en",
   :rdfs/domain      :rev/Review,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       #rdf/langString "reviewer@en",
   :rdfs/range       :foaf/Person,
   :vs/moreinfo      "core term",
   :vs/term_status   "stable"})

(def text
  "The text of the review"
  {:db/ident         :rev/text,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment     #rdf/langString "The text of the review@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       #rdf/langString "text@en",
   :vs/moreinfo      "core term",
   :vs/term_status   "stable"})

(def title
  "The title of the review"
  {:db/ident           :rev/title,
   :rdf/type           [:rdf/Property :owl/DatatypeProperty],
   :rdfs/comment       "The title of the review",
   :rdfs/domain        :rev/Review,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label         "title",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :dc11/title,
   :vs/moreinfo        "proposed by iterating.com",
   :vs/term_status     "deprecated"})

(def totalVotes
  "Number of usefulness votes (integer)"
  {:db/ident         :rev/totalVotes,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment     "Number of usefulness votes (integer)",
   :rdfs/domain      :rev/Review,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       "totalVotes",
   :rdfs/range       :rdfs/Literal,
   :vs/moreinfo      "proposed by iterating.com",
   :vs/term_status   "deprecated"})

(def type
  "The type of media of a work under review"
  {:db/ident         :rev/type,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment     "The type of media of a work under review",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       "type",
   :vs/moreinfo      "core term",
   :vs/term_status   "deprecated"})
