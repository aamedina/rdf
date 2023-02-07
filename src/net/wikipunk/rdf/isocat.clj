(ns net.wikipunk.rdf.isocat
  "Obsolete vocabulary made for compatibility with Wordnet."
  {:rdf/type :owl/Ontology,
   :rdfa/prefix "isocat",
   :rdfa/uri "http://www.isocat.org/ns/dcr.rdf#"})

(def datcat
  {:db/ident :isocat/datcat,
   :rdf/type :owl/AnnotationProperty})
