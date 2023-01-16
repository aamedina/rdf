(ns net.wikipunk.rdf.db.alter
  "Datomic RDF vocabulary: db.alter"
  {:rdf/type :owl/Ontology})

(def attribute
  "System attribute with type :db.type/ref. Asserting this attribute on :db.part/db with value v will alter the definition of existing attribute v."
  {:db/cardinality :db.cardinality/many,
   :db/doc
   "System attribute with type :db.type/ref. Asserting this attribute on :db.part/db with value v will alter the definition of existing attribute v.",
   :db/ident :db.alter/attribute,
   :db/valueType :db.type/ref})