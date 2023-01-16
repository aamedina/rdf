(ns net.wikipunk.rdf.fressian
  "Datomic RDF vocabulary: fressian"
  {:rdf/type :owl/Ontology})

(def tag
  "Keyword-valued attribute of a value type that specifies the underlying fressian type used for serialization."
  {:db/cardinality :db.cardinality/one,
   :db/doc
   "Keyword-valued attribute of a value type that specifies the underlying fressian type used for serialization.",
   :db/ident :fressian/tag,
   :db/valueType :db.type/keyword})