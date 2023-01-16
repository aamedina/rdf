(ns net.wikipunk.rdf.db
  "Datomic RDF vocabulary: db"
  {:rdf/type :owl/Ontology}
  (:refer-clojure :exclude [ensure]))

(def add
  "Primitive assertion. All transactions eventually reduce to a collection of primitive assertions and retractions of facts, e.g. [:db/add fred :age 42]."
  {:db/doc
   "Primitive assertion. All transactions eventually reduce to a collection of primitive assertions and retractions of facts, e.g. [:db/add fred :age 42].",
   :db/ident :db/add})

(def affinity {:db/ident :db/affinity})

(def cardinality
  "Property of an attribute. Two possible values: :db.cardinality/one for single-valued attributes, and :db.cardinality/many for many-valued attributes. Defaults to :db.cardinality/one."
  {:db/cardinality :db.cardinality/one,
   :db/doc
   "Property of an attribute. Two possible values: :db.cardinality/one for single-valued attributes, and :db.cardinality/many for many-valued attributes. Defaults to :db.cardinality/one.",
   :db/ident :db/cardinality,
   :db/valueType :db.type/ref})

(def cas
  "Compare and swap the value of an entity's attribute."
  {:db/doc   "Compare and swap the value of an entity's attribute.",
   :db/ident :db/cas})

(def doc
  "Documentation string for an entity."
  {:db/cardinality :db.cardinality/one,
   :db/doc         "Documentation string for an entity.",
   :db/fulltext    true,
   :db/ident       :db/doc,
   :db/valueType   :db.type/string})

(def ensure
  {:db/cardinality :db.cardinality/many,
   :db/ident       :db/ensure,
   :db/valueType   :db.type/ref})

(def excise
  {:db/cardinality :db.cardinality/one,
   :db/ident       :db/excise,
   :db/valueType   :db.type/ref})

(def fulltext
  "Property of an attribute. If true, create a fulltext search index for the attribute. Defaults to false."
  {:db/cardinality :db.cardinality/one,
   :db/doc
   "Property of an attribute. If true, create a fulltext search index for the attribute. Defaults to false.",
   :db/ident :db/fulltext,
   :db/valueType :db.type/boolean})

(def ident
  "Attribute used to uniquely name an entity."
  {:db/cardinality :db.cardinality/one,
   :db/doc         "Attribute used to uniquely name an entity.",
   :db/ident       :db/ident,
   :db/unique      :db.unique/identity,
   :db/valueType   :db.type/keyword})

(def isComponent
  "Property of attribute whose vtype is :db.type/ref. If true, then the attribute is a component of the entity referencing it. When you query for an entire entity, components are fetched automatically. Defaults to nil."
  {:db/cardinality :db.cardinality/one,
   :db/doc
   "Property of attribute whose vtype is :db.type/ref. If true, then the attribute is a component of the entity referencing it. When you query for an entire entity, components are fetched automatically. Defaults to nil.",
   :db/ident :db/isComponent,
   :db/valueType :db.type/boolean})

(def noHistory
  "Property of an attribute. If true, past values of the attribute are not retained after indexing. Defaults to false."
  {:db/cardinality :db.cardinality/one,
   :db/doc
   "Property of an attribute. If true, past values of the attribute are not retained after indexing. Defaults to false.",
   :db/ident :db/noHistory,
   :db/valueType :db.type/boolean})

(def retract
  "Primitive retraction. All transactions eventually reduce to a collection of assertions and retractions of facts, e.g. [:db/retract fred :age 42]."
  {:db/doc
   "Primitive retraction. All transactions eventually reduce to a collection of assertions and retractions of facts, e.g. [:db/retract fred :age 42].",
   :db/ident :db/retract})

(def retractEntity
  "Retract all facts about an entity, including references from other entities and component attributes recursively."
  {:db/doc
   "Retract all facts about an entity, including references from other entities and component attributes recursively.",
   :db/ident :db/retractEntity})

(def system-tx
  {:db/cardinality :db.cardinality/many,
   :db/ident       :db/system-tx,
   :db/valueType   :db.type/keyword})

(def tupleAttrs
  {:db/cardinality :db.cardinality/one,
   :db/ident       :db/tupleAttrs,
   :db/tupleType   :db.type/keyword,
   :db/valueType   :db.type/tuple})

(def tupleType
  {:db/cardinality :db.cardinality/one,
   :db/ident       :db/tupleType,
   :db/valueType   :db.type/keyword})

(def tupleTypes
  {:db/cardinality :db.cardinality/one,
   :db/ident       :db/tupleTypes,
   :db/tupleType   :db.type/keyword,
   :db/valueType   :db.type/tuple})

(def txInstant
  "Attribute whose value is a :db.type/instant. A :db/txInstant is recorded automatically with every transaction."
  {:db/cardinality :db.cardinality/one,
   :db/doc
   "Attribute whose value is a :db.type/instant. A :db/txInstant is recorded automatically with every transaction.",
   :db/ident :db/txInstant,
   :db/valueType :db.type/instant})

(def txUUID
  "Unique id of transaction."
  {:db/cardinality :db.cardinality/one,
   :db/doc         "Unique id of transaction.",
   :db/ident       :db/txUUID,
   :db/valueType   :db.type/uuid})

(def unique
  "Property of an attribute. If value is :db.unique/value, then attribute value is unique to each entity. Attempts to insert a duplicate value for a temporary entity id will fail. If value is :db.unique/identity, then attribute value is unique, and upsert is enabled. Attempting to insert a duplicate value for a temporary entity id will cause all attributes associated with that temporary id to be merged with the entity already in the database. Defaults to nil."
  {:db/cardinality :db.cardinality/one,
   :db/doc
   "Property of an attribute. If value is :db.unique/value, then attribute value is unique to each entity. Attempts to insert a duplicate value for a temporary entity id will fail. If value is :db.unique/identity, then attribute value is unique, and upsert is enabled. Attempting to insert a duplicate value for a temporary entity id will cause all attributes associated with that temporary id to be merged with the entity already in the database. Defaults to nil.",
   :db/ident :db/unique,
   :db/valueType :db.type/ref})

(def valueType
  "Property of an attribute that specifies the attribute's value type. Built-in value types include, :db.type/keyword, :db.type/string, :db.type/ref, :db.type/instant, :db.type/long, :db.type/bigdec, :db.type/boolean, :db.type/float, :db.type/uuid, :db.type/double, :db.type/bigint,  :db.type/uri."
  {:db/cardinality :db.cardinality/one,
   :db/doc
   "Property of an attribute that specifies the attribute's value type. Built-in value types include, :db.type/keyword, :db.type/string, :db.type/ref, :db.type/instant, :db.type/long, :db.type/bigdec, :db.type/boolean, :db.type/float, :db.type/uuid, :db.type/double, :db.type/bigint,  :db.type/uri.",
   :db/ident :db/valueType,
   :db/valueType :db.type/ref})