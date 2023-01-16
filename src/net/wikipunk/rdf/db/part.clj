(ns net.wikipunk.rdf.db.part
  "Datomic RDF vocabulary: db.part"
  {:rdf/type :owl/Ontology})

(def db
  "Name of the system partition. The system partition includes the core of datomic, as well as user schemas: type definitions, attribute definitions, partition definitions, and data function definitions."
  {:db.install/attribute [:db/system-tx
                          :db/ident
                          :db.install/partition
                          :db.install/valueType
                          :db.install/attribute
                          :db/excise
                          :db.excise/attrs
                          :db.excise/beforeT
                          :db.excise/before
                          :db.alter/attribute
                          :fressian/tag
                          :db/valueType
                          :db/cardinality
                          :db/unique
                          :db/isComponent
                          :db/noHistory
                          :db/txInstant
                          :db/fulltext
                          :db/txUUID
                          :db/doc
                          :db/tupleType
                          :db/tupleTypes
                          :db/tupleAttrs
                          :db/ensure
                          :db.entity/attrs
                          :db.entity/preds
                          :db.attr/preds],
   :db.install/partition [:db.part/db :db.part/tx :db.part/user],
   :db.install/valueType [:db.type/ref
                          :db.type/keyword
                          :db.type/long
                          :db.type/string
                          :db.type/boolean
                          :db.type/instant
                          :db.type/fn
                          :db.type/uuid
                          :db.type/double
                          :db.type/float
                          :db.type/uri
                          :db.type/bigint
                          :db.type/bigdec
                          :db.type/tuple
                          :db.type/symbol],
   :db/doc
   "Name of the system partition. The system partition includes the core of datomic, as well as user schemas: type definitions, attribute definitions, partition definitions, and data function definitions.",
   :db/ident :db.part/db})

(def tx
  "Partition used to store data about transactions. Transaction data always includes a :db/txInstant which is the transaction's timestamp, and can be extended to store other information at transaction granularity."
  {:db/doc
   "Partition used to store data about transactions. Transaction data always includes a :db/txInstant which is the transaction's timestamp, and can be extended to store other information at transaction granularity.",
   :db/ident :db.part/tx})

(def user
  "Name of the user partition. The user partition is analogous to the default namespace in a programming language, and should be used as a temporary home for data during interactive development."
  {:db/doc
   "Name of the user partition. The user partition is analogous to the default namespace in a programming language, and should be used as a temporary home for data during interactive development.",
   :db/ident :db.part/user})