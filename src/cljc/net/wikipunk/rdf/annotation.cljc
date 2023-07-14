(ns net.wikipunk.rdf.annotation
  {:rdf/ns-prefix-map {"annotation" "http://www.w3.org/2000/10/annotation-ns#",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "annotation",
   :rdfa/uri          "http://www.w3.org/2000/10/annotation-ns#"})

(def Annotation
  "The target type of a annotation resource."
  {:db/ident         :annotation/Annotation,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #xsd/string "The target type of a annotation resource.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2000/10/annotation-ns#"},
   :rdfs/label       #xsd/langString "Annotation@en",
   :rdfs/subClassOf  :rdfs/Resource})

(def annotates
  "Relates an Annotation to the resource to which the Annotation applies.  The inverse relation is 'hasAnnotation'"
  {:db/ident :annotation/annotates,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Relates an Annotation to the resource to which the Annotation applies.  The inverse relation is 'hasAnnotation'",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2000/10/annotation-ns#"},
   :rdfs/label #xsd/langString "annotates@en"})

(def author
  "The name of the person or organization most responsible for creating the Annotation."
  {:db/ident :annotation/author,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The name of the person or organization most responsible for creating the Annotation.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2000/10/annotation-ns#"},
   :rdfs/label #xsd/langString "author@en",
   :rdfs/subPropertyOf :dc11/creator})

(def body
  "Relates the resource representing the 'content' of an Annotation to the Annotation resource"
  {:db/ident :annotation/body,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Relates the resource representing the 'content' of an Annotation to the Annotation resource",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2000/10/annotation-ns#"},
   :rdfs/label #xsd/langString "body@en",
   :rdfs/subPropertyOf :annotation/related})

(def context
  "The context within the resource named in 'annotates' to which the Annotation most directly applies."
  {:db/ident :annotation/context,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The context within the resource named in 'annotates' to which the Annotation most directly applies.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2000/10/annotation-ns#"},
   :rdfs/label #xsd/langString "context@en"})

(def created
  "The date and time on which the Annotation was created.  yyyy-mm-ddThh:mm:ssZ format recommended."
  {:db/ident :annotation/created,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The date and time on which the Annotation was created.  yyyy-mm-ddThh:mm:ssZ format recommended.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2000/10/annotation-ns#"},
   :rdfs/label #xsd/langString "created@en",
   :rdfs/subPropertyOf :dc11/date})

(def modified
  "modified"
  {:db/ident :annotation/modified,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/string
     "Annotations currently use http://purl.org/dc/elements/1.1/date directly"
    #xsd/string
     "The date and time on which the Annotation was modified.  yyyy-mm-ddThh:mm:ssZ format recommended."],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2000/10/annotation-ns#"},
   :rdfs/label #xsd/langString "modified@en",
   :rdfs/subPropertyOf :dc11/date})

(def related
  "A relationship between an annotation and additional resources that is less specific than 'body'.  The 'related' property is expected to be\n subclassed by more specific relationships."
  {:db/ident :annotation/related,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "A relationship between an annotation and additional resources that is less specific than 'body'.  The 'related' property is expected to be\n subclassed by more specific relationships.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2000/10/annotation-ns#"},
   :rdfs/label #xsd/langString "related@en"})