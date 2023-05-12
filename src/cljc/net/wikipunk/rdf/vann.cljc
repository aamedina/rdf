(ns net.wikipunk.rdf.vann
  "http://purl.org/vocab/vann/"
  {:dc11/creator "http://iandavis.com/id/me",
   :dc11/date "2010-06-07",
   :dc11/description
   "This document describes a vocabulary for annotating descriptions of vocabularies with examples and usage notes.",
   :dc11/identifier "http://purl.org/vocab/vann/vann-vocab-20050401",
   :dc11/isVersionOf "http://purl.org/vocab/vann/",
   :dc11/replaces :vann/vann-vocab-20040305,
   :dc11/rights "Copyright © 2005 Ian Davis",
   :dc11/title "VANN: A vocabulary for annotating vocabulary descriptions",
   :dcat/downloadURL "https://vocab.org/vann/vann-vocab-20100607.rdf",
   :rdf/ns-prefix-map {"bio"    "http://purl.org/vocab/bio/0.1/",
                       "cc"     "http://web.resource.org/cc/",
                       "dc11"   "http://purl.org/dc/terms/",
                       "dcterm" "http://purl.org/dc/terms/",
                       "foaf"   "http://xmlns.com/foaf/0.1/",
                       "owl"    "http://www.w3.org/2002/07/owl#",
                       "rdf"    "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"   "http://www.w3.org/2000/01/rdf-schema#",
                       "vann"   "http://purl.org/vocab/vann/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "vann",
   :rdfa/uri "http://purl.org/vocab/vann/",
   :vann/preferredNamespacePrefix "vann",
   :vann/preferredNamespaceUri "http://purl.org/vocab/vann/"})

(def changes
  "A reference to a resource that describes changes between this version of a vocabulary and the previous."
  {:db/ident :vann/changes,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "A reference to a resource that describes changes between this version of a vocabulary and the previous.",
   :rdfs/isDefinedBy "http://purl.org/vocab/vann/",
   :rdfs/label "Changes",
   :rdfs/subPropertyOf [:rdfs/seeAlso :vann/changes]})

(def example
  "A reference to a resource that provides an example of how this resource can be used."
  {:db/ident :vann/example,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "A reference to a resource that provides an example of how this resource can be used.",
   :rdfs/isDefinedBy "http://purl.org/vocab/vann/",
   :rdfs/label "Example",
   :rdfs/subPropertyOf [:rdfs/seeAlso :vann/example]})

(def preferredNamespacePrefix
  "The preferred namespace prefix to use when using terms from this vocabulary in an XML document."
  {:db/ident :vann/preferredNamespacePrefix,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "The preferred namespace prefix to use when using terms from this vocabulary in an XML document.",
   :rdfs/isDefinedBy "http://purl.org/vocab/vann/",
   :rdfs/label "Preferred Namespace Prefix"})

(def preferredNamespaceUri
  "The preferred namespace URI to use when using terms from this vocabulary in an XML document."
  {:db/ident :vann/preferredNamespaceUri,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "The preferred namespace URI to use when using terms from this vocabulary in an XML document.",
   :rdfs/isDefinedBy "http://purl.org/vocab/vann/",
   :rdfs/label "Preferred Namespace Uri"})

(def termGroup
  "A group of related terms in a vocabulary."
  {:db/ident         :vann/termGroup,
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/comment     "A group of related terms in a vocabulary.",
   :rdfs/isDefinedBy "http://purl.org/vocab/vann/",
   :rdfs/label       "Term Group"})

(def usageNote
  "A reference to a resource that provides information on how this resource is to be used."
  {:db/ident :vann/usageNote,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "A reference to a resource that provides information on how this resource is to be used.",
   :rdfs/isDefinedBy "http://purl.org/vocab/vann/",
   :rdfs/label "Usage Note",
   :rdfs/subPropertyOf [:rdfs/seeAlso :vann/usageNote]})