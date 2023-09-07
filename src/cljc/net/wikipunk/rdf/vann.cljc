(ns net.wikipunk.rdf.vann
  ^{:base       "http://purl.org/vocab/vann/",
    :namespaces {"bio"    "http://purl.org/vocab/bio/0.1/",
                 "cc"     "http://web.resource.org/cc/",
                 "dc11"   "http://purl.org/dc/terms/",
                 "dcterm" "http://purl.org/dc/terms/",
                 "foaf"   "http://xmlns.com/foaf/0.1/",
                 "owl"    "http://www.w3.org/2002/07/owl#",
                 "rdf"    "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs"   "http://www.w3.org/2000/01/rdf-schema#",
                 "vann"   "http://purl.org/vocab/vann/"},
    :prefix     "vann",
    :source     "https://vocab.org/vann/vann-vocab-20100607.rdf"}
  {:dc11/creator {:xsd/anyURI "http://iandavis.com/id/me"},
   :dc11/date "2010-06-07",
   :dc11/description
   {:rdf/language "en",
    :rdf/value
    "This document describes a vocabulary for annotating descriptions of vocabularies with examples and usage notes."},
   :dc11/identifier "http://purl.org/vocab/vann/vann-vocab-20050401",
   :dc11/replaces :vann/vann-vocab-20040305,
   :dc11/rights "Copyright © 2005 Ian Davis",
   :dc11/title {:rdf/language "en",
                :rdf/value
                "VANN: A vocabulary for annotating vocabulary descriptions"},
   :rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "vann",
   :vann/preferredNamespaceUri "http://purl.org/vocab/vann/",
   :xsd/anyURI "http://purl.org/vocab/vann/"})

(def changes
  {:db/ident :vann/changes,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A reference to a resource that describes changes between this version of a vocabulary and the previous."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/vann/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Changes"},
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def example
  {:db/ident :vann/example,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A reference to a resource that provides an example of how this resource can be used."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/vann/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Example"},
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def preferredNamespacePrefix
  {:db/ident :vann/preferredNamespacePrefix,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The preferred namespace prefix to use when using terms from this vocabulary in an XML document."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/vann/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Preferred Namespace Prefix"}})

(def preferredNamespaceUri
  {:db/ident :vann/preferredNamespaceUri,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The preferred namespace URI to use when using terms from this vocabulary in an XML document."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/vann/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Preferred Namespace Uri"}})

(def termGroup
  {:db/ident         :vann/termGroup,
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "A group of related terms in a vocabulary."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/vann/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Term Group"}})

(def usageNote
  {:db/ident :vann/usageNote,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A reference to a resource that provides information on how this resource is to be used."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/vann/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Usage Note"},
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def urn:uuid:dd97a5b3-2848-58ea-8e41-00128ad8dca9
  {:dc11/creator {:xsd/anyURI "http://iandavis.com/id/me"},
   :dc11/date "2010-06-07",
   :dc11/description
   {:rdf/language "en",
    :rdf/value
    "This document describes a vocabulary for annotating descriptions of vocabularies with examples and usage notes."},
   :dc11/identifier "http://purl.org/vocab/vann/vann-vocab-20050401",
   :dc11/replaces :vann/vann-vocab-20040305,
   :dc11/rights "Copyright © 2005 Ian Davis",
   :dc11/title {:rdf/language "en",
                :rdf/value
                "VANN: A vocabulary for annotating vocabulary descriptions"},
   :rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "vann",
   :vann/preferredNamespaceUri "http://purl.org/vocab/vann/",
   :xsd/anyURI "http://purl.org/vocab/vann/"})

(def urn:uuid:479d880d-ee01-59f6-810f-82b5fd3e4b27
  {:cc/license {:xsd/anyURI "http://creativecommons.org/licenses/by/1.0/"},
   :dc11/type  :dcmitype/Text,
   :rdf/type   :cc/Work,
   :xsd/anyURI "https://vocab.org/vann/vann-vocab-20100607.rdf"})

(def urn:uuid:9defd8b2-38dc-5571-bb27-757d3c3d4d31
  {:cc/permits  #{:cc/Reproduction :cc/Distribution :cc/DerivativeWorks},
   :cc/requires #{:cc/Notice :cc/Attribution},
   :rdf/type    :cc/License,
   :xsd/anyURI  "http://creativecommons.org/licenses/by/1.0/"})

(def urn:uuid:af127918-c803-5fba-98c2-af1e164a64b6
  {:foaf/name  "Ian Davis",
   :rdf/type   :foaf/Person,
   :xsd/anyURI "http://iandavis.com/id/me"})