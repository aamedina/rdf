(ns net.wikipunk.rdf.annotation
  ^{:base       "http://www.w3.org/2000/10/annotation-ns#",
    :namespaces {"annotation" "http://www.w3.org/2000/10/annotation-ns#",
                 "dc11"       "http://purl.org/dc/elements/1.1/",
                 "rdf"        "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs"       "http://www.w3.org/2000/01/rdf-schema#"},
    :prefix     "annotation",
    :source     "http://www.w3.org/2000/10/annotation-ns#"}
  {:dc11/title   "Annotea Annotation Schema",
   :rdf/type     :owl/Ontology,
   :rdfs/comment #{"$Revision: 1.5 $ $Date: 2003/07/31 17:07:41 $"
                   "A namespace for describing annotations"},
   :rdfs/seeAlso #{{:xsd/anyURI
                    "http://www.w3.org/2000/02/Collaboration/Annotation/papers"}
                   {:xsd/anyURI
                    "http://www.w3.org/2001/Annotea/User/Protocol.html"}},
   :xsd/anyURI   "http://www.w3.org/2000/10/annotation-ns#"})

(def Annotation
  {:db/ident         :annotation/Annotation,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The target type of a annotation resource.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2000/10/annotation-ns#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Annotation"}})

(def annotates
  {:db/ident :annotation/annotates,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Relates an Annotation to the resource to which the Annotation applies.  The inverse relation is 'hasAnnotation'",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2000/10/annotation-ns#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "annotates"}})

(def author
  {:db/ident :annotation/author,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The name of the person or organization most responsible for creating the Annotation.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2000/10/annotation-ns#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "author"},
   :rdfs/subPropertyOf :dc11/creator})

(def body
  {:db/ident :annotation/body,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Relates the resource representing the 'content' of an Annotation to the Annotation resource",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2000/10/annotation-ns#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "body"},
   :rdfs/subPropertyOf :annotation/related})

(def context
  {:db/ident :annotation/context,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The context within the resource named in 'annotates' to which the Annotation most directly applies.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2000/10/annotation-ns#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "context"}})

(def created
  {:db/ident :annotation/created,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The date and time on which the Annotation was created.  yyyy-mm-ddThh:mm:ssZ format recommended.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2000/10/annotation-ns#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "created"},
   :rdfs/subPropertyOf :dc11/date})

(def modified
  {:db/ident :annotation/modified,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{"The date and time on which the Annotation was modified.  yyyy-mm-ddThh:mm:ssZ format recommended."
     "Annotations currently use http://purl.org/dc/elements/1.1/date directly"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2000/10/annotation-ns#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "modified"},
   :rdfs/subPropertyOf :dc11/date})

(def related
  {:db/ident :annotation/related,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A relationship between an annotation and additional resources that is less specific than 'body'.  The 'related' property is expected to be\n subclassed by more specific relationships.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2000/10/annotation-ns#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "related"}})

(def urn:uuid:dccaa2f2-b301-5a34-8ac4-328a189c1846
  {:dc11/title   "Annotea Annotation Schema",
   :rdfs/comment #{"$Revision: 1.5 $ $Date: 2003/07/31 17:07:41 $"
                   "A namespace for describing annotations"},
   :rdfs/seeAlso #{{:xsd/anyURI
                    "http://www.w3.org/2000/02/Collaboration/Annotation/papers"}
                   {:xsd/anyURI
                    "http://www.w3.org/2001/Annotea/User/Protocol.html"}},
   :xsd/anyURI   "http://www.w3.org/2000/10/annotation-ns#"})