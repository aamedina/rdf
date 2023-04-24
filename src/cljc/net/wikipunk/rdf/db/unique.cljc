(ns net.wikipunk.rdf.db.unique
  "Datomic RDF vocabulary: db.unique"
  {:rdf/type :owl/Ontology}
  (:refer-clojure :exclude [identity]))

(def identity
  "Specifies that an attribute's value is unique. Attempts to create a new entity with a colliding value for a :db.unique/value will become upserts."
  {:db/doc
   "Specifies that an attribute's value is unique. Attempts to create a new entity with a colliding value for a :db.unique/value will become upserts.",
   :db/ident :db.unique/identity})

(def value
  "Specifies that an attribute's value is unique. Attempts to create a new entity with a colliding value for a :db.unique/value will fail."
  {:db/doc
   "Specifies that an attribute's value is unique. Attempts to create a new entity with a colliding value for a :db.unique/value will fail.",
   :db/ident :db.unique/value})