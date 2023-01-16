(ns net.wikipunk.rdf.db.type
  "Datomic RDF vocabulary: db.type"
  {:rdf/type :owl/Ontology}
  (:refer-clojure
    :exclude
    [ref keyword long boolean fn double float bigint bigdec symbol]))

(def bigdec
  "Value type for arbitrary precision floating point numbers. Maps to java.math.BigDecimal on the JVM."
  {:db/doc
   "Value type for arbitrary precision floating point numbers. Maps to java.math.BigDecimal on the JVM.",
   :db/ident :db.type/bigdec,
   :fressian/tag :bigdec})

(def bigint
  "Value type for arbitrary precision integers. Maps to java.math.BigInteger on the JVM."
  {:db/doc
   "Value type for arbitrary precision integers. Maps to java.math.BigInteger on the JVM.",
   :db/ident :db.type/bigint,
   :fressian/tag :bigint})

(def boolean
  "Boolean value type."
  {:db/doc       "Boolean value type.",
   :db/ident     :db.type/boolean,
   :fressian/tag :bool})

(def double
  "Floating point value type. Same semantics as a Java double: double-precision 64-bit IEEE 754 floating point."
  {:db/doc
   "Floating point value type. Same semantics as a Java double: double-precision 64-bit IEEE 754 floating point.",
   :db/ident :db.type/double,
   :fressian/tag :double})

(def float
  "Floating point value type. Same semantics as a Java float: single-precision 32-bit IEEE 754 floating point."
  {:db/doc
   "Floating point value type. Same semantics as a Java float: single-precision 32-bit IEEE 754 floating point.",
   :db/ident :db.type/float,
   :fressian/tag :float})

(def fn
  "Value type for database functions. See Javadoc for Peer.function."
  {:db/doc "Value type for database functions. See Javadoc for Peer.function.",
   :db/ident :db.type/fn,
   :fressian/tag :datomic/fn})

(def instant
  "Value type for instants in time. Stored internally as a number of milliseconds since midnight, January 1, 1970 UTC. Representation type will vary depending on the language you are using."
  {:db/doc
   "Value type for instants in time. Stored internally as a number of milliseconds since midnight, January 1, 1970 UTC. Representation type will vary depending on the language you are using.",
   :db/ident :db.type/instant,
   :fressian/tag :inst})

(def keyword
  "Value type for keywords. Keywords are used as names, and are interned for efficiency. Keywords map to the native interned-name type in languages that support them."
  {:db/doc
   "Value type for keywords. Keywords are used as names, and are interned for efficiency. Keywords map to the native interned-name type in languages that support them.",
   :db/ident :db.type/keyword,
   :fressian/tag :key})

(def long
  "Fixed integer value type. Same semantics as a Java long: 64 bits wide, two's complement binary representation."
  {:db/doc
   "Fixed integer value type. Same semantics as a Java long: 64 bits wide, two's complement binary representation.",
   :db/ident :db.type/long,
   :fressian/tag :int})

(def ref
  "Value type for references. All references from one entity to another are through attributes with this value type."
  {:db/doc
   "Value type for references. All references from one entity to another are through attributes with this value type.",
   :db/ident :db.type/ref,
   :fressian/tag :ref})

(def string
  "Value type for strings."
  {:db/doc       "Value type for strings.",
   :db/ident     :db.type/string,
   :fressian/tag :string})

(def symbol
  {:db/ident     :db.type/symbol,
   :fressian/tag :sym})

(def tuple
  {:db/ident     :db.type/tuple,
   :fressian/tag :list})

(def uri
  "Value type for URIs. Maps to java.net.URI on the JVM."
  {:db/doc       "Value type for URIs. Maps to java.net.URI on the JVM.",
   :db/ident     :db.type/uri,
   :fressian/tag :uri})

(def uuid
  "Value type for UUIDs. Maps to java.util.UUID on the JVM."
  {:db/doc       "Value type for UUIDs. Maps to java.util.UUID on the JVM.",
   :db/ident     :db.type/uuid,
   :fressian/tag :uuid})