(ns net.wikipunk.rdf.annotation
  "$Revision: 1.5 $ $Date: 2003/07/31 17:07:41 $ A namespace for describing annotations"
  {:dc11/title "Annotea Annotation Schema",
   :rdf/ns-prefix-map {"annotation" "http://www.w3.org/2000/10/annotation-ns#",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "annotation",
   :rdfa/uri "http://www.w3.org/2000/10/annotation-ns#",
   :rdfs/comment ["$Revision: 1.5 $ $Date: 2003/07/31 17:07:41 $"
                  "A namespace for describing annotations"],
   :rdfs/seeAlso ["http://www.w3.org/2001/Annotea/User/Protocol.html"
                  "http://www.w3.org/2000/02/Collaboration/Annotation/papers"]})

(def Annotation
  "The target type of a annotation resource."
  {:db/ident         :annotation/Annotation,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The target type of a annotation resource.",
   :rdfs/isDefinedBy "http://www.w3.org/2000/10/annotation-ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Annotation"}})

(def annotates
  "Relates an Annotation to the resource to which the Annotation applies. The inverse relation is 'hasAnnotation'"
  {:db/ident :annotation/annotates,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Relates an Annotation to the resource to which the Annotation applies.  The inverse relation is 'hasAnnotation'",
   :rdfs/isDefinedBy "http://www.w3.org/2000/10/annotation-ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "annotates"}})

(def author
  "The name of the person or organization most responsible for creating the Annotation."
  {:db/ident :annotation/author,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The name of the person or organization most responsible for creating the Annotation.",
   :rdfs/isDefinedBy "http://www.w3.org/2000/10/annotation-ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "author"},
   :rdfs/subPropertyOf :dc11/creator})

(def body
  "Relates the resource representing the 'content' of an Annotation to the Annotation resource"
  {:db/ident :annotation/body,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Relates the resource representing the 'content' of an Annotation to the Annotation resource",
   :rdfs/isDefinedBy "http://www.w3.org/2000/10/annotation-ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "body"},
   :rdfs/subPropertyOf :annotation/related})

(def context
  "The context within the resource named in 'annotates' to which the Annotation most directly applies."
  {:db/ident :annotation/context,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The context within the resource named in 'annotates' to which the Annotation most directly applies.",
   :rdfs/isDefinedBy "http://www.w3.org/2000/10/annotation-ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "context"}})

(def created
  "The date and time on which the Annotation was created. yyyy-mm-ddThh:mm:ssZ format recommended."
  {:db/ident :annotation/created,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The date and time on which the Annotation was created.  yyyy-mm-ddThh:mm:ssZ format recommended.",
   :rdfs/isDefinedBy "http://www.w3.org/2000/10/annotation-ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "created"},
   :rdfs/subPropertyOf :dc11/date})

(def modified
  "Annotations currently use http://purl.org/dc/elements/1.1/date directly The date and time on which the Annotation was modified. yyyy-mm-ddThh:mm:ssZ format recommended."
  {:db/ident :annotation/modified,
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["Annotations currently use http://purl.org/dc/elements/1.1/date directly"
    "The date and time on which the Annotation was modified.  yyyy-mm-ddThh:mm:ssZ format recommended."],
   :rdfs/isDefinedBy "http://www.w3.org/2000/10/annotation-ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "modified"},
   :rdfs/subPropertyOf :dc11/date})

(def related
  "A relationship between an annotation and additional resources that is less specific than 'body'. The 'related' property is expected to be subclassed by more specific relationships."
  {:db/ident :annotation/related,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A relationship between an annotation and additional resources that is less specific than 'body'.  The 'related' property is expected to be\n subclassed by more specific relationships.",
   :rdfs/isDefinedBy "http://www.w3.org/2000/10/annotation-ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "related"}})