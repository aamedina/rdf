(ns net.wikipunk.rdf.rev
  {:cc/license {:rdfa/uri "http://creativecommons.org/licenses/by/1.0/"},
   :dc11/type :dcmitype/Text,
   :dcat/downloadURL
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
   :rdf/type :cc/Work,
   :rdfa/prefix "rev",
   :rdfa/uri "http://purl.org/stuff/rev",
   :rdfs/isDefinedBy {:rdfa/uri "http://vocab.org/review/terms.html"}}
  (:refer-clojure :exclude [type]))

(def Comment
  "A comment on a review"
  {:db/ident         :rev/Comment,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     #xsd/string "A comment on a review",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       #xsd/string "Comment",
   :rdfs/subClassOf  :rdfs/Resource,
   :vs/moreinfo      #xsd/string "proposed by iterating.com",
   :vs/term_status   #xsd/string "deprecated"})

(def Feedback
  "Feedback on the review. Expresses whether the review was useful or not"
  {:db/ident :rev/Feedback,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/string
    "Feedback on the review. Expresses whether the review was useful or not",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label #xsd/string "Feedback",
   :rdfs/subClassOf :rdfs/Resource,
   :vs/moreinfo #xsd/string "proposed by iterating.com",
   :vs/term_status [#xsd/string "deprecated" #xsd/string "testing"]})

(def Review
  {:db/ident         :rev/Review,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     #xsd/langString "A review of an work@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       #xsd/langString "Review@en",
   :rdfs/subClassOf  :rdfs/Resource,
   :vs/moreinfo      #xsd/string "core term",
   :vs/term_status   #xsd/string "stable"})

(def commenter
  "The commenter on the review"
  {:db/ident         :rev/commenter,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment     #xsd/string "The commenter on the review",
   :rdfs/domain      [:rev/Feedback :rev/Comment],
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       #xsd/string "commenter",
   :rdfs/range       :foaf/Agent,
   :vs/moreinfo      #xsd/string "proposed by iterating.com",
   :vs/term_status   #xsd/string "deprecated"})

(def hasComment
  "Used to associate a review with a comment on the review"
  {:db/ident         :rev/hasComment,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     #xsd/string
                      "Used to associate a review with a comment on the review",
   :rdfs/domain      :rev/Review,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       #xsd/string "hasComment",
   :rdfs/range       :rev/Comment,
   :vs/moreinfo      #xsd/string "proposed by iterating.com",
   :vs/term_status   #xsd/string "deprecated"})

(def hasFeedback
  "Associates a review with a feedback on the review"
  {:db/ident         :rev/hasFeedback,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     #xsd/string
                      "Associates a review with a feedback on the review",
   :rdfs/domain      :rev/Review,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       #xsd/string "hasFeedback",
   :rdfs/range       :rev/Feedback,
   :vs/moreinfo      #xsd/string "proposed by iterating.com",
   :vs/term_status   #xsd/string "deprecated"})

(def hasReview
  {:db/ident         :rev/hasReview,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     #xsd/langString "Associates a work with a a review@en",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       #xsd/langString "has Review@en",
   :rdfs/range       :rev/Review,
   :vs/moreinfo      #xsd/string "core term",
   :vs/term_status   #xsd/string "stable"})

(def maxRating
  {:db/ident         :rev/maxRating,
   :dc11/description #xsd/langString "Maximum value for rating property@en",
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString "A numeric value@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       #xsd/langString "max Rating@en",
   :vs/moreinfo      #xsd/string "Introduced by request of Revyu.com",
   :vs/term_status   #xsd/string "stable"})

(def minRating
  {:db/ident         :rev/minRating,
   :dc11/description #xsd/langString "Minimum value for rating property@en",
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString "A numeric value@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       #xsd/langString "min Rating@en",
   :vs/moreinfo      #xsd/string "Introduced by request of Revyu.com",
   :vs/term_status   #xsd/string "stable"})

(def positiveVotes
  "Number of positive usefulness votes (integer)"
  {:db/ident         :rev/positiveVotes,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment     #xsd/string
                      "Number of positive usefulness votes (integer)",
   :rdfs/domain      :rev/Review,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       #xsd/string "positiveVotes",
   :rdfs/range       :rdfs/Literal,
   :vs/moreinfo      #xsd/string "proposed by iterating.com",
   :vs/term_status   #xsd/string "deprecated"})

(def rating
  {:db/ident         :rev/rating,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment     #xsd/langString "A numeric value@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       #xsd/langString "rating@en",
   :vs/moreinfo      #xsd/string "core term",
   :vs/term_status   #xsd/string "stable"})

(def reviewer
  {:db/ident         :rev/reviewer,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     #xsd/langString
                      "The person that has written the review@en",
   :rdfs/domain      :rev/Review,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       #xsd/langString "reviewer@en",
   :rdfs/range       :foaf/Person,
   :vs/moreinfo      #xsd/string "core term",
   :vs/term_status   #xsd/string "stable"})

(def text
  {:db/ident         :rev/text,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment     #xsd/langString "The text of the review@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       #xsd/langString "text@en",
   :vs/moreinfo      #xsd/string "core term",
   :vs/term_status   #xsd/string "stable"})

(def title
  "The title of the review"
  {:db/ident           :rev/title,
   :rdf/type           [:rdf/Property :owl/DatatypeProperty],
   :rdfs/comment       #xsd/string "The title of the review",
   :rdfs/domain        :rev/Review,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label         #xsd/string "title",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :dc11/title,
   :vs/moreinfo        #xsd/string "proposed by iterating.com",
   :vs/term_status     #xsd/string "deprecated"})

(def totalVotes
  "Number of usefulness votes (integer)"
  {:db/ident         :rev/totalVotes,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment     #xsd/string "Number of usefulness votes (integer)",
   :rdfs/domain      :rev/Review,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       #xsd/string "totalVotes",
   :rdfs/range       :rdfs/Literal,
   :vs/moreinfo      #xsd/string "proposed by iterating.com",
   :vs/term_status   #xsd/string "deprecated"})

(def type
  "The type of media of a work under review"
  {:db/ident         :rev/type,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment     #xsd/string "The type of media of a work under review",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/stuff/rev#"},
   :rdfs/label       #xsd/string "type",
   :vs/moreinfo      #xsd/string "core term",
   :vs/term_status   #xsd/string "deprecated"})