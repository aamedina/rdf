(ns net.wikipunk.rdf.grddl
  {:rdf/ns-prefix-map {"admin" "http://webns.net/mvcb/",
                       "dc11"  "http://purl.org/dc/elements/1.1/",
                       "doap"  "http://usefulinc.com/ns/doap#",
                       "foaf"  "http://xmlns.com/foaf/0.1/",
                       "grddl" "http://www.rddl.org/purposes#",
                       "owl"   "http://www.w3.org/2002/07/owl#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "grddl",
   :rdfa/uri          "http://www.w3.org/2003/g/data-view#",
   :rdfs/isDefinedBy  {:rdfa/uri
                       "http://www.w3.org/TR/2007/REC-grddl-20070911/"}})

(def InformationResource
  {:db/ident :grddl/InformationResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A resource which has the property that all of its essential characteristics can be conveyed in a message",
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "http://www.w3.org/TR/2004/REC-webarch-20041215/#def-information-resource"},
   :rdfs/label "InformationResource"})

(def RDFGraph
  {:db/ident :grddl/RDFGraph,
   :rdf/type :rdfs/Class,
   :rdfs/comment "a\n    set of RDF triples",
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "http://www.w3.org/TR/2004/REC-rdf-concepts-20040210/#dfn-rdf-graph"},
   :rdfs/label #{"RDF graphs" "RDFGraph"}})

(def RootNode
  {:db/ident         :grddl/RootNode,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "the root of the tree in the XPath data\n    model",
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/TR/1999/REC-xpath-19991116#root-node"},
   :rdfs/label       #{"XML document root nodes" "RootNode"}})

(def Transformation
  {:db/ident :grddl/Transformation,
   :owl/onProperty :grddl/transformationProperty,
   :owl/someValuesFrom :grddl/TransformationProperty,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "an InformationResource that specifies\n    a transformation from a set of XML documents to RDF graphs",
   :rdfs/label "Transformation",
   :rdfs/subClassOf :grddl/InformationResource})

(def TransformationProperty
  {:db/ident :grddl/TransformationProperty,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "a FunctionalProperty that relates\n    XML document root nodes to\n    RDF graphs",
   :rdfs/domain :grddl/RootNode,
   :rdfs/label "TransformationProperty",
   :rdfs/range :grddl/RDFGraph,
   :rdfs/subClassOf :owl/FunctionalProperty})

(def danc
  {:db/ident      :grddl/danc,
   :foaf/homepage {:xsd/anyURI "http://www.w3.org/People/Connolly/"},
   :foaf/name     "Dan Connolly"})

(def grddl-wg
  {:db/ident      :grddl/grddl-wg,
   :foaf/homepage {:xsd/anyURI "http://www.w3.org/2001/sw-grddl-wg/"}})

(def grddlProject
  {:db/ident :grddl/grddlProject,
   :doap/homepage {:xsd/anyURI "http://www.w3.org/2003/g/data-view"},
   :doap/mailing-list
   {:xsd/anyURI "http://lists.w3.org/Archives/Public/public-grddl-comments/"},
   :doap/shortdesc
   "GRDDL\n    is a technique for gleaning resource\n    descriptions from dialects of\n    languages. It's a way of extracting Semantic Web\n    data in RDF from XML formats (especially\n    XHTML dialects or microformats) via\n    transformations identified by URIs and typically expressed in\n    XSLT."})

(def namespaceTransformation
  {:db/ident :grddl/namespaceTransformation,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "relates a namespace to a transformation for\n    all documents in that namespace",
   :rdfs/label "namespaceTransformation",
   :rdfs/range :grddl/Transformation})

(def profileTransformation
  {:db/ident :grddl/profileTransformation,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "relates a profile document to a\n    transformation for all documents bearing that profile",
   :rdfs/label "profileTransformation",
   :rdfs/range :grddl/Transformation})

(def result
  {:db/ident :grddl/result,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "an\n    RDF graph obtained from an information resource by directly\n    parsing a representation in the standard RDF/XML syntax or\n    indirectly by parsing some other dialect using a transformation\n    nominated by the document",
   :rdfs/domain :grddl/InformationResource,
   :rdfs/label "result",
   :rdfs/range :grddl/RDFGraph})

(def transformation
  {:db/ident :grddl/transformation,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "relates a source document to a\n    transformation, usually represented in XSLT, that relates the source document syntax\n    to the RDF graph syntax",
   :rdfs/domain :grddl/RootNode,
   :rdfs/label "transformation",
   :rdfs/range :grddl/Transformation})

(def transformationProperty
  {:db/ident :grddl/transformationProperty,
   :rdf/type :owl/FunctionalProperty,
   :rdfs/comment
   "relates a transformation to the algorithm\n    specified by the property that computes an RDF graph from an XML\n    document node",
   :rdfs/domain :grddl/Transformation,
   :rdfs/label "transformationProperty",
   :rdfs/range :grddl/TransformationProperty})