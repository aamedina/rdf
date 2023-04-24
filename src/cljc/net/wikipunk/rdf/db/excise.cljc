(ns net.wikipunk.rdf.db.excise
  "Datomic RDF vocabulary: db.excise"
  {:rdf/type :owl/Ontology})

(def attrs
  {:db/cardinality :db.cardinality/many,
   :db/ident       :db.excise/attrs,
   :db/valueType   :db.type/ref})

(def before
  {:db/cardinality :db.cardinality/one,
   :db/ident       :db.excise/before,
   :db/valueType   :db.type/instant})

(def beforeT
  {:db/cardinality :db.cardinality/one,
   :db/ident       :db.excise/beforeT,
   :db/valueType   :db.type/long})