(ns net.wikipunk.rdf.db.cardinality
  "Datomic RDF vocabulary: db.cardinality"
  {:rdf/type :owl/Ontology})

(def many
  "One of two legal values for the :db/cardinality attribute. Specify :db.cardinality/one for single-valued attributes, and :db.cardinality/many for many-valued attributes."
  {:db/doc
   "One of two legal values for the :db/cardinality attribute. Specify :db.cardinality/one for single-valued attributes, and :db.cardinality/many for many-valued attributes.",
   :db/ident :db.cardinality/many})

(def one
  "One of two legal values for the :db/cardinality attribute. Specify :db.cardinality/one for single-valued attributes, and :db.cardinality/many for many-valued attributes."
  {:db/doc
   "One of two legal values for the :db/cardinality attribute. Specify :db.cardinality/one for single-valued attributes, and :db.cardinality/many for many-valued attributes.",
   :db/ident :db.cardinality/one})