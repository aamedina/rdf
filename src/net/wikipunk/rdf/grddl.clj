(ns net.wikipunk.rdf.grddl
  "http://www.w3.org/2003/g/data-view#"
  {:default87/label
   "definition in Architecture of the World Wide Web, Volume One",
   :rdf/ns-prefix-map {"admin" "http://webns.net/mvcb/",
                       "default73" "http://www.w3.org/2002/07/owl#",
                       "default87" "http://www.w3.org/2000/01/rdf-schema#",
                       "default90" "http://xmlns.com/foaf/0.1/",
                       "default91" "http://usefulinc.com/ns/doap#",
                       "default95" "http://purl.org/dc/elements/1.1/",
                       "grddl" "http://www.rddl.org/purposes#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "http://www.w3.org/TR/2004/REC-webarch-20041215/#def-information-resource",
   :rdfa/prefix "grddl",
   :rdfa/uri "http://www.w3.org/2003/g/data-view#",
   :rdfs/isDefinedBy {:rdf/uri
                      "http://www.w3.org/TR/2007/REC-grddl-20070911/"}})

(def InformationResource
  {:db/ident :grddl/InformationResource,
   :default87/comment
   "A resource which has the property that all of its essential characteristics can be conveyed in a message",
   :default87/isDefinedBy
   "http://www.w3.org/TR/2004/REC-webarch-20041215/#def-information-resource",
   :default87/label "InformationResource",
   :rdf/type :default87/Class})

(def RDFGraph
  {:db/ident          :grddl/RDFGraph,
   :default87/comment "a\n    set of RDF triples",
   :default87/isDefinedBy
   "http://www.w3.org/TR/2004/REC-rdf-concepts-20040210/#dfn-rdf-graph",
   :default87/label   ["RDFGraph" "RDF graphs"],
   :rdf/type          :default87/Class})

(def RootNode
  {:db/ident          :grddl/RootNode,
   :default87/comment "the root of the tree in the XPath data\n    model",
   :default87/isDefinedBy
   "http://www.w3.org/TR/1999/REC-xpath-19991116#root-node",
   :default87/label   ["XML document root nodes" "RootNode"],
   :rdf/type          :default87/Class})

(def Transformation
  {:db/ident :grddl/Transformation,
   :default73/onProperty :grddl/transformationProperty,
   :default73/someValuesFrom :grddl/TransformationProperty,
   :default87/comment
   "an InformationResource that specifies\n    a transformation from a set of XML documents to RDF graphs",
   :default87/label "Transformation",
   :default87/subClassOf :grddl/InformationResource,
   :rdf/type :default87/Class})

(def TransformationProperty
  {:db/ident :grddl/TransformationProperty,
   :default87/comment
   "a FunctionalProperty that relates\n    XML document root nodes to\n    RDF graphs",
   :default87/domain :grddl/RootNode,
   :default87/label "TransformationProperty",
   :default87/range :grddl/RDFGraph,
   :default87/subClassOf :default73/FunctionalProperty,
   :rdf/type :default87/Class})

(def danc
  {:db/ident           :grddl/danc,
   :default90/homepage "http://www.w3.org/People/Connolly/",
   :default90/name     "Dan Connolly"})

(def grddl-wg
  {:db/ident :grddl/grddl-wg,
   :default90/homepage "http://www.w3.org/2001/sw-grddl-wg/"})

(def grddlProject
  {:db/ident :grddl/grddlProject,
   :default91/homepage "http://www.w3.org/2003/g/data-view",
   :default91/mailing-list
   "http://lists.w3.org/Archives/Public/public-grddl-comments/",
   :default91/shortdesc
   "GRDDL\n    is a technique for gleaning resource\n    descriptions from dialects of\n    languages. It's a way of extracting Semantic Web\n    data in RDF from XML formats (especially\n    XHTML dialects or microformats) via\n    transformations identified by URIs and typically expressed in\n    XSLT."})

(def namespaceTransformation
  {:db/ident :grddl/namespaceTransformation,
   :default87/comment
   "relates a namespace to a transformation for\n    all documents in that namespace",
   :default87/label "namespaceTransformation",
   :default87/range :grddl/Transformation,
   :rdf/type :rdf/Property})

(def profileTransformation
  {:db/ident :grddl/profileTransformation,
   :default87/comment
   "relates a profile document to a\n    transformation for all documents bearing that profile",
   :default87/label "profileTransformation",
   :default87/range :grddl/Transformation,
   :rdf/type :rdf/Property})

(def result
  {:db/ident :grddl/result,
   :default87/comment
   "an\n    RDF graph obtained from an information resource by directly\n    parsing a representation in the standard RDF/XML syntax or\n    indirectly by parsing some other dialect using a transformation\n    nominated by the document",
   :default87/domain :grddl/InformationResource,
   :default87/label "result",
   :default87/range :grddl/RDFGraph,
   :rdf/type :rdf/Property})

(def transformation
  {:db/ident :grddl/transformation,
   :default87/comment
   "relates a source document to a\n    transformation, usually represented in XSLT, that relates the source document syntax\n    to the RDF graph syntax",
   :default87/domain :grddl/RootNode,
   :default87/label "transformation",
   :default87/range :grddl/Transformation,
   :rdf/type :rdf/Property})

(def transformationProperty
  {:db/ident :grddl/transformationProperty,
   :default87/comment
   "relates a transformation to the algorithm\n    specified by the property that computes an RDF graph from an XML\n    document node",
   :default87/domain :grddl/Transformation,
   :default87/label "transformationProperty",
   :default87/range :grddl/TransformationProperty,
   :rdf/type :default73/FunctionalProperty})