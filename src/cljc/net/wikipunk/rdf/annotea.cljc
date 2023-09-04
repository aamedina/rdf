(ns net.wikipunk.rdf.annotea
  {:namespaces  {"annotea" "http://www.w3.org/2002/01/bookmark#",
                 "dc11"    "http://purl.org/dc/elements/1.1/",
                 "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs"    "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "annotea",
   :rdfa/uri    "http://www.w3.org/2002/01/bookmark#"})

(def Bookmark
  {:db/ident     :annotea/Bookmark,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "The class to which all bookmarks belong.",
   :rdfs/label   "Bookmark"})

(def Shortcut
  {:db/ident :annotea/Shortcut,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Specifies a behavior; when the\n                object of type 'Shortcut' is activated, the\n                client follows the 'recalls' property and\n                activates the object at the end of that\n                'recalls' property.  The target object may\n                be another Bookmark or may be a Topic.",
   :rdfs/label "Shortcut"})

(def Topic
  {:db/ident   :annotea/Topic,
   :rdf/type   :rdfs/Class,
   :rdfs/label "Topic"})

(def bookmarks
  {:db/ident :annotea/bookmarks,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "This corresponds to XBEL:href an\n                object of type Bookmark is expected to have a\n                'recalls' relationship to the document being\n                bookmarked.  The 'bookmarks' property is an older\n                name for the 'recalls' relationship.",
   :rdfs/label "bookmarks"})

(def hasTopic
  {:db/ident :annotea/hasTopic,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "relates a bookmark to a topic.\n                A bookmark must have at least one hasTopic property.\n                The typical user operation of following a bookmark link\n                will use the value of the b:recalls property. This property\n                corresponds to XBEL:href property.",
   :rdfs/label "hasTopic"})

(def leadsTo
  {:db/ident :annotea/leadsTo,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "connects a Shortcut to the bookmark or topic that is\nbeing included by reference in some other topic"}})

(def recalls
  {:db/ident :annotea/recalls,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Relates a bookmark with the resource that\n                has been bookmarked.  This corresponds to XBEL:href;\n                an object of type Bookmark is expected to have a\n                'recalls' relationship to the document being\n                bookmarked ",
   :rdfs/label "recalls"})

(def subTopicOf
  {:db/ident :annotea/subTopicOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Describes a relationship between Topics.\n        When a topic T is a sub-topic of a topic U then all\n        bookmarks that have topic T are also considered to have\n        topic U. A topic may be a sub-topic of one or more\n        topics; trivially, every topic is a sub-topic of itself.\n        More formally; for all B, T, and U: b b:hasTopic T,\n        T b:subTopicOf U implies B b:hasTopic U.",
   :rdfs/label "subTopicOf"})