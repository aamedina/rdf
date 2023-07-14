(ns net.wikipunk.rdf.annotea
  {:rdf/ns-prefix-map {"annotea" "http://www.w3.org/2002/01/bookmark#",
                       "dc11"    "http://purl.org/dc/elements/1.1/",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "annotea",
   :rdfa/uri          "http://www.w3.org/2002/01/bookmark#"})

(def Bookmark
  "The class to which all bookmarks belong."
  {:db/ident        :annotea/Bookmark,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/string "The class to which all bookmarks belong.",
   :rdfs/label      #xsd/string "Bookmark",
   :rdfs/subClassOf :rdfs/Resource})

(def Shortcut
  "Specifies a behavior; when the\n                object of type 'Shortcut' is activated, the\n                client follows the 'recalls' property and\n                activates the object at the end of that\n                'recalls' property.  The target object may\n                be another Bookmark or may be a Topic."
  {:db/ident :annotea/Shortcut,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "Specifies a behavior; when the\n                object of type 'Shortcut' is activated, the\n                client follows the 'recalls' property and\n                activates the object at the end of that\n                'recalls' property.  The target object may\n                be another Bookmark or may be a Topic.",
   :rdfs/label #xsd/string "Shortcut",
   :rdfs/subClassOf :rdfs/Resource})

(def Topic
  "Topic"
  {:db/ident        :annotea/Topic,
   :rdf/type        :rdfs/Class,
   :rdfs/label      #xsd/string "Topic",
   :rdfs/subClassOf :rdfs/Resource})

(def bookmarks
  "This corresponds to XBEL:href an\n                object of type Bookmark is expected to have a\n                'recalls' relationship to the document being\n                bookmarked.  The 'bookmarks' property is an older\n                name for the 'recalls' relationship."
  {:db/ident :annotea/bookmarks,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "This corresponds to XBEL:href an\n                object of type Bookmark is expected to have a\n                'recalls' relationship to the document being\n                bookmarked.  The 'bookmarks' property is an older\n                name for the 'recalls' relationship.",
   :rdfs/label #xsd/string "bookmarks"})

(def hasTopic
  "relates a bookmark to a topic.\n                A bookmark must have at least one hasTopic property.\n                The typical user operation of following a bookmark link\n                will use the value of the b:recalls property. This property\n                corresponds to XBEL:href property."
  {:db/ident :annotea/hasTopic,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "relates a bookmark to a topic.\n                A bookmark must have at least one hasTopic property.\n                The typical user operation of following a bookmark link\n                will use the value of the b:recalls property. This property\n                corresponds to XBEL:href property.",
   :rdfs/label #xsd/string "hasTopic"})

(def leadsTo
  "connects a Shortcut to the bookmark or topic that is\nbeing included by reference in some other topic"
  {:db/ident :annotea/leadsTo,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "connects a Shortcut to the bookmark or topic that is\nbeing included by reference in some other topic@en"})

(def recalls
  "Relates a bookmark with the resource that\n                has been bookmarked.  This corresponds to XBEL:href;\n                an object of type Bookmark is expected to have a\n                'recalls' relationship to the document being\n                bookmarked "
  {:db/ident :annotea/recalls,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Relates a bookmark with the resource that\n                has been bookmarked.  This corresponds to XBEL:href;\n                an object of type Bookmark is expected to have a\n                'recalls' relationship to the document being\n                bookmarked ",
   :rdfs/label #xsd/string "recalls"})

(def subTopicOf
  "Describes a relationship between Topics.\n        When a topic T is a sub-topic of a topic U then all\n        bookmarks that have topic T are also considered to have\n        topic U. A topic may be a sub-topic of one or more\n        topics; trivially, every topic is a sub-topic of itself.\n        More formally; for all B, T, and U: b b:hasTopic T,\n        T b:subTopicOf U implies B b:hasTopic U."
  {:db/ident :annotea/subTopicOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Describes a relationship between Topics.\n        When a topic T is a sub-topic of a topic U then all\n        bookmarks that have topic T are also considered to have\n        topic U. A topic may be a sub-topic of one or more\n        topics; trivially, every topic is a sub-topic of itself.\n        More formally; for all B, T, and U: b b:hasTopic T,\n        T b:subTopicOf U implies B b:hasTopic U.",
   :rdfs/label #xsd/string "subTopicOf"})