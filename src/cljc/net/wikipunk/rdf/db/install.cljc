(ns net.wikipunk.rdf.db.install
  "Datomic RDF vocabulary: db.install"
  {:rdf/type :owl/Ontology}
  (:refer-clojure :exclude [partition]))

(def attribute
  "System attribute with type :db.type/ref. Asserting this attribute on :db.part/db with value v will install v as an attribute."
  {:db/cardinality :db.cardinality/many,
   :db/doc
   "System attribute with type :db.type/ref. Asserting this attribute on :db.part/db with value v will install v as an attribute.",
   :db/ident :db.install/attribute,
   :db/valueType :db.type/ref})

(def partition
  "System attribute with type :db.type/ref. Asserting this attribute on :db.part/db with value v will install v as a partition."
  {:db/cardinality :db.cardinality/many,
   :db/doc
   "System attribute with type :db.type/ref. Asserting this attribute on :db.part/db with value v will install v as a partition.",
   :db/ident :db.install/partition,
   :db/valueType :db.type/ref})

(def valueType
  "System attribute with type :db.type/ref. Asserting this attribute on :db.part/db with value v will install v as a value type."
  {:db/cardinality :db.cardinality/many,
   :db/doc
   "System attribute with type :db.type/ref. Asserting this attribute on :db.part/db with value v will install v as a value type.",
   :db/ident :db.install/valueType,
   :db/valueType :db.type/ref})