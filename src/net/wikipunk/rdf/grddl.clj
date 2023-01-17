(ns net.wikipunk.rdf.grddl
  "http://www.w3.org/2003/g/data-view#"
  {:rdfs/label
   "definition in Architecture of the World Wide Web, Volume One",
   :rdf/ns-prefix-map {"admin" "http://webns.net/mvcb/",
                       "owl"   "http://www.w3.org/2002/07/owl#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "foaf"  "http://xmlns.com/foaf/0.1/",
                       "doap"  "http://usefulinc.com/ns/doap#",
                       "dc11"  "http://purl.org/dc/elements/1.1/",
                       "grddl" "http://www.rddl.org/purposes#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdf/type          :owl/Ontology,
   :rdf/uri
   "http://www.w3.org/TR/2004/REC-webarch-20041215/#def-information-resource",
   :rdfa/prefix       "grddl",
   :rdfa/uri          "http://www.w3.org/2003/g/data-view#",
   :rdfs/isDefinedBy  "http://www.w3.org/TR/2007/REC-grddl-20070911/"})

(def InformationResource
  {:db/ident   :grddl/InformationResource,
   :rdfs/comment
   "A resource which has the property that all of its essential characteristics can be conveyed in a message",
   :rdfs/isDefinedBy
   "http://www.w3.org/TR/2004/REC-webarch-20041215/#def-information-resource",
   :rdfs/label "InformationResource",
   :rdf/type   :rdfs/Class})

(def RDFGraph
  {:db/ident     :grddl/RDFGraph,
   :rdfs/comment "a\n    set of RDF triples",
   :rdfs/isDefinedBy
   "http://www.w3.org/TR/2004/REC-rdf-concepts-20040210/#dfn-rdf-graph",
   :rdfs/label   ["RDFGraph" "RDF graphs"],
   :rdf/type     :rdfs/Class})

(def RootNode
  {:db/ident     :grddl/RootNode,
   :rdfs/comment "the root of the tree in the XPath data\n    model",
   :rdfs/isDefinedBy
   "http://www.w3.org/TR/1999/REC-xpath-19991116#root-node",
   :rdfs/label   ["XML document root nodes" "RootNode"],
   :rdf/type     :rdfs/Class})

(def Transformation
  {:db/ident           :grddl/Transformation,
   :owl/onProperty     :grddl/transformationProperty,
   :owl/someValuesFrom :grddl/TransformationProperty,
   :rdfs/comment
   "an InformationResource that specifies\n    a transformation from a set of XML documents to RDF graphs",
   :rdfs/label         "Transformation",
   :rdfs/subClassOf    :grddl/InformationResource,
   :rdf/type           :rdfs/Class})

(def TransformationProperty
  {:db/ident        :grddl/TransformationProperty,
   :rdfs/comment
   "a FunctionalProperty that relates\n    XML document root nodes to\n    RDF graphs",
   :rdfs/domain     :grddl/RootNode,
   :rdfs/label      "TransformationProperty",
   :rdfs/range      :grddl/RDFGraph,
   :rdfs/subClassOf :owl/FunctionalProperty,
   :rdf/type        :rdfs/Class})

(def danc
  {:db/ident      :grddl/danc,
   :foaf/homepage "http://www.w3.org/People/Connolly/",
   :foaf/name     "Dan Connolly"})

(def grddl-wg
  {:db/ident      :grddl/grddl-wg,
   :foaf/homepage "http://www.w3.org/2001/sw-grddl-wg/"})

(def grddlProject
  {:db/ident      :grddl/grddlProject,
   :doap/homepage "http://www.w3.org/2003/g/data-view",
   :doap/mailing-list
   "http://lists.w3.org/Archives/Public/public-grddl-comments/",
   :doap/shortdesc
   "GRDDL\n    is a technique for gleaning resource\n    descriptions from dialects of\n    languages. It's a way of extracting Semantic Web\n    data in RDF from XML formats (especially\n    XHTML dialects or microformats) via\n    transformations identified by URIs and typically expressed in\n    XSLT."})

(def namespaceTransformation
  {:db/ident   :grddl/namespaceTransformation,
   :rdfs/comment
   "relates a namespace to a transformation for\n    all documents in that namespace",
   :rdfs/label "namespaceTransformation",
   :rdfs/range :grddl/Transformation,
   :rdf/type   :rdf/Property})

(def profileTransformation
  {:db/ident   :grddl/profileTransformation,
   :rdfs/comment
   "relates a profile document to a\n    transformation for all documents bearing that profile",
   :rdfs/label "profileTransformation",
   :rdfs/range :grddl/Transformation,
   :rdf/type   :rdf/Property})

(def result
  {:db/ident    :grddl/result,
   :rdfs/comment
   "an\n    RDF graph obtained from an information resource by directly\n    parsing a representation in the standard RDF/XML syntax or\n    indirectly by parsing some other dialect using a transformation\n    nominated by the document",
   :rdfs/domain :grddl/InformationResource,
   :rdfs/label  "result",
   :rdfs/range  :grddl/RDFGraph,
   :rdf/type    :rdf/Property})

(def transformation
  {:db/ident    :grddl/transformation,
   :rdfs/comment
   "relates a source document to a\n    transformation, usually represented in XSLT, that relates the source document syntax\n    to the RDF graph syntax",
   :rdfs/domain :grddl/RootNode,
   :rdfs/label  "transformation",
   :rdfs/range  :grddl/Transformation,
   :rdf/type    :rdf/Property})

(def transformationProperty
  {:db/ident    :grddl/transformationProperty,
   :rdfs/comment
   "relates a transformation to the algorithm\n    specified by the property that computes an RDF graph from an XML\n    document node",
   :rdfs/domain :grddl/Transformation,
   :rdfs/label  "transformationProperty",
   :rdfs/range  :grddl/TransformationProperty,
   :rdf/type    :owl/FunctionalProperty})
