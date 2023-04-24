(ns net.wikipunk.rdf.rdfg
  "http://www.w3.org/2004/03/trix/rdfg-1/"
  {:rdf/ns-prefix-map {"rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfg" "http://www.w3.org/2004/03/trix/rdfg-1/",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "rdfg",
   :rdfa/uri          "http://www.w3.org/2004/03/trix/rdfg-1/"})

(def Graph
  "An RDF graph (with intensional semantics)."
  {:db/ident     :rdfg/Graph,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "\nAn RDF graph (with intensional semantics).\n      ",
   :rdfs/label   "Graph"})

(def equivalentGraph
  "The graphs associated with the subject and object are equivalent."
  {:db/ident :rdfg/equivalentGraph,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "\nThe graphs associated with the subject and object are equivalent.\n      ",
   :rdfs/domain :rdfg/Graph,
   :rdfs/label "equivalent graph",
   :rdfs/range :rdfg/Graph})

(def subGraphOf
  "The graph associated with the subject is a subgraph of a graph equivalent to that associated with the object."
  {:db/ident :rdfg/subGraphOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "\nThe graph associated with the subject is a subgraph of a graph equivalent\nto that associated with the object.\n      ",
   :rdfs/domain :rdfg/Graph,
   :rdfs/label "subgraph of",
   :rdfs/range :rdfg/Graph})