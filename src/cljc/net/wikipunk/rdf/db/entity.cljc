(ns net.wikipunk.rdf.db.entity
  "Datomic RDF vocabulary: db.entity"
  {:rdf/type :owl/Ontology})

(def attrs
  {:db/cardinality :db.cardinality/many,
   :db/ident       :db.entity/attrs,
   :db/valueType   :db.type/keyword})

(def preds
  {:db/cardinality :db.cardinality/many,
   :db/ident       :db.entity/preds,
   :db/valueType   :db.type/symbol})