(ns net.wikipunk.rdf.grddl
  ^{:base       "http://www.w3.org/2003/g/data-view#",
    :namespaces {"admin" "http://webns.net/mvcb/",
                 "dc11"  "http://purl.org/dc/elements/1.1/",
                 "doap"  "http://usefulinc.com/ns/doap#",
                 "foaf"  "http://xmlns.com/foaf/0.1/",
                 "grddl" "http://www.rddl.org/purposes#",
                 "owl"   "http://www.w3.org/2002/07/owl#",
                 "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs"  "http://www.w3.org/2000/01/rdf-schema#"},
    :prefix     "grddl",
    :source     "http://www.w3.org/2003/g/data-view#"}
  {:rdf/type :owl/Ontology})

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

(def urn:uuid:15fe4857-8a1b-5c59-bf2d-58590b07b9e7112365
  {:rdfs/label "definition in Architecture of the World Wide Web, Volume One",
   :xsd/anyURI
   "http://www.w3.org/TR/2004/REC-webarch-20041215/#def-information-resource"})

(def urn:uuid:eee7ee82-4a58-5154-a47c-e315d77edd17112366
  {:rdfs/label "Dan Connolly",
   :xsd/anyURI "http://www.w3.org/People/Connolly/"})

(def urn:uuid:47c5db5b-93fd-539d-800d-eb86e7514719112367
  {:rdfs/label
   "definition\n    in Resource Description Framework (RDF): Concepts and\n    Abstract Syntax",
   :xsd/anyURI
   "http://www.w3.org/TR/2004/REC-rdf-concepts-20040210/#dfn-rdf-graph"})

(def urn:uuid:4a8bc1b3-e23b-561d-9ee3-71f55ba3098a112368
  {:rdfs/label
   "section\n    5.1 Root Node in XML Path Language (XPath) Version\n    1.0",
   :xsd/anyURI "http://www.w3.org/TR/1999/REC-xpath-19991116#root-node"})

(def urn:uuid:2ab345d3-d89b-5b01-8702-25f8242ab9c5112369
  {:rdfs/label "public-grddl-comments",
   :xsd/anyURI "http://lists.w3.org/Archives/Public/public-grddl-comments/"})

(def urn:uuid:6e06f7a9-aad4-5c39-bcbf-e3f596164c86112370
  {:dc11/date "2004-02-10",
   :dc11/title
   "Resource\n      Description Framework (RDF): Concepts and Abstract\n      Syntax",
   :rdfs/label
   "Resource\n      Description Framework (RDF): Concepts and Abstract\n      Syntax, 10\n      February 2004",
   :xsd/anyURI "http://www.w3.org/TR/rdf-concepts/"})

(def urn:uuid:80dbe0b4-11b0-5c18-86ec-2e8f30f803ef112371
  {:rdfs/label "the GRDDL Working Group",
   :xsd/anyURI "http://www.w3.org/2001/sw-grddl-wg/"})

(def urn:uuid:e4a1e529-6480-50c2-8a74-7fe152cc1f06112372
  {:admin/generatorAgent {:xsd/anyURI "http://purl.org/NET/erdf/extract"},
   :foaf/maker :grddl/grddl-wg,
   :grddl/normative-reference #{{:xsd/anyURI "http://www.w3.org/TR/xslt"}
                                {:xsd/anyURI "http://www.w3.org/TR/grddl/"}
                                {:xsd/anyURI
                                 "http://www.w3.org/TR/rdf-concepts/"}},
   :xsd/anyURI "http://www.w3.org/2003/g/data-view"})

(def urn:uuid:690a109c-32cc-55a6-b36c-612ed8f3bf3f112373
  {:dc11/date "2005-05-15",
   :dc11/title
   "Gleaning\n        Resource Descriptions from Dialects of Languages\n        (GRDDL)",
   :rdfs/label
   "Gleaning\n        Resource Descriptions from Dialects of Languages\n        (GRDDL), 16\n        May 2005",
   :xsd/anyURI "http://www.w3.org/TR/grddl/"})

(def urn:uuid:1775b6a9-66a2-562e-99c3-391491cdab53112374
  {:rdfs/label "XSLT",
   :xsd/anyURI "http://www.w3.org/TR/xslt"})