(ns net.wikipunk.rdf.db.attr
  "Datomic RDF vocabulary: db.attr"
  {:rdf/type :owl/Ontology})

(def preds
  {:db/cardinality :db.cardinality/many,
   :db/ident       :db.attr/preds,
   :db/valueType   :db.type/symbol})