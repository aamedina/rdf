(ns net.wikipunk.turtle
  "Clojure functions for parsing Turtle."
  {:rdfs/seeAlso {:xsd/anyURI "https://github.com/quoll/michelangelo/blob/main/src/michelangelo/core.clj"}}
  (:require
   [clojure.java.io :as io]
   [clojure.string :as str]
   [donatello.ttl :as ttl]
   [net.wikipunk.rdf :as rdf]
   [net.wikipunk.mop :as mop]
   [quoll.raphael.core :as raphael]
   [tiara.data :refer [ordered-map ordered-set EMPTY_MAP]]))

(defrecord RoundTripGenerator [counter bnode-cache namespaces]
  raphael/NodeGenerator
  (new-node [this]
    [(update this :counter inc) (ttl/->BlankNode counter)])
  (new-node [this label]    
    (if-let [node (get bnode-cache label)]
      [this node]
      (let [node (ttl/->BlankNode counter)]
        [(-> this
             (update :counter inc)
             (update :bnode-cache assoc label node))
         node])))
  (add-base [this iri]
    (update this :namespaces assoc :base (or (:xsd/anyURI iri) (str iri))))
  (add-prefix [this prefix iri]    
    (update this :namespaces assoc prefix (or (:xsd/anyURI iri) (str iri))))
  (iri-for [this prefix]
    (get namespaces prefix))
  (get-namespaces [this]
    (dissoc namespaces :base))
  (get-base [this]
    (:base namespaces))
  (new-qname [this prefix local]
    (rdf/kw (rdf/iri (keyword prefix local))))
  (new-iri [this iri]
    (if-some [k (rdf/kw iri)]
      k
      {:xsd/anyURI iri}))
  (new-literal [this s]
    (try
      (java.net.URL. s)
      {:xsd/anyURI s}
      (catch java.net.MalformedURLException _
        (if (str/starts-with? s "pkg:")
          (try
            (com.github.packageurl.PackageURL. s)
            {:xsd/anyURI s}
            (catch com.github.packageurl.MalformedPackageURLException ex
              (throw (ex-info (.getMessage ex) {:xsd/string s}))))
          {:rdf/value s}))))
  (new-literal [this s t]
    (case t
      :xsd/anyURI
      {:xsd/anyURI s}
      
      (:xsd/dateTime :xsd/date :xsd/dateTimeStamp)
      (clojure.instant/read-instant-date s)
      
      (:xsd/integer :xsd/nonNegativeInteger :xsd/nonPositiveInteger :xsd/positiveInteger :xsd/negativeInteger)
      (bigint s)
      
      :xsd/decimal
      (bigdec s)
      
      (:xsd/long :xsd/int :xsd/short :xsd/byte)
      (Long/parseLong s)
      
      :xsd/float
      (Float/parseFloat s)
      
      :xsd/double
      (Double/parseDouble s)
      
      (:xsd/string :xsd/normalizedString :xsd/token :xsd/language)
      {:rdf/value s}
      
      :xsd/boolean
      (Boolean/parseBoolean s)
      
      ;; else
      {:rdf/value s :rdf/type t}))
  (new-lang-string [this s lang]
    {:rdf/value s :rdf/language lang})
  (rdf-type [this] :rdf/type)
  (rdf-first [this] :rdf/first)
  (rdf-rest [this] :rdf/rest)
  (rdf-nil [this] :rdf/nil))

(def xsd-datatypes
  "OWL RL datatypes + more"
  #{:rdf/PlainLiteral
    :rdf/XMLLiteral
    :rdf/JSON
    :rdf/HTML
    :xsd/decimal
    :xsd/integer
    :xsd/nonNegativeInteger
    :xsd/nonPositiveInteger
    :xsd/positiveInteger
    :xsd/negativeInteger
    :xsd/long
    :xsd/int
    :xsd/short
    :xsd/byte
    :xsd/unsignedByte
    :xsd/unsignedShort
    :xsd/unsignedInt
    :xsd/unsignedLong
    :xsd/float
    :xsd/double
    :xsd/string
    :xsd/normalizedString
    :xsd/token
    :xsd/language
    :xsd/boolean
    :xsd/hexBinary
    :xsd/base64Binary
    :xsd/anyURI
    :xsd/dateTime
    :xsd/dateTimeStamp})

(def xsd-value
  "Returns the value contained in a map encapsulating XSD values."
  (apply some-fn xsd-datatypes))

(defmulti serialize
  "Extends `donatello.ttl/serialize` to dispatch on :rdf/type."
  mop/type-of)

(defmethod ttl/serialize clojure.lang.IPersistentMap
  [m]
  (cond
    (and (:rdf/language m) (:rdf/value m)) ; langString?
    (str \" (ttl/escape (str (:rdf/value m))) "\"@" (:rdf/language m))

    (:xsd/anyURI m)                     ; anyURI?
    (ttl/serialize (java.net.URI. (:xsd/anyURI m)))

    (and (:rdf/value m) (:rdf/type m))  ; typed literal?
    (str \" (ttl/escape (str (:rdf/value m))) "\"^^" (ttl/serialize (:rdf/type m)))

    (:rdf/value m)                      ; plain literal?
    (:rdf/value m)

    (:rdf/type m)
    (serialize m)

    :else
    (if-some [value (xsd-value m)]
      (ttl/serialize value)
      (throw (ex-info "Unsure how to serialize the map as Turtle.")))))

(defmethod ttl/serialize clojure.lang.TaggedLiteral
  [{:keys [tag form]}]
  (str \" (ttl/escape (str form)) "\"^^" (ttl/serialize (keyword tag))))

(defn round-trip-generator
  "Creates a new RoundTripGenerator"
  []
  (->RoundTripGenerator 0 {} EMPTY_MAP))

(defn index-add
  "Merges a single triple into a nested map"
  [idx [a b c]]
  (if-let [idxb (get idx a)]
    (if-let [idxc (get idxb b)]
      (if (set? idxc)
        (if (get idxc c)
          idx
          (assoc idx a (assoc idxb b (conj idxc c))))
        (assoc idx a (assoc idxb b (ordered-set idxc c))))
      (assoc idx a (assoc idxb b c)))
    (assoc idx a (ordered-map b c))))

(defn add-all
  "Inserts all triples in a sequence into a nested map"
  [idx st]
  (reduce index-add idx st))

(defn simple-graph
  "Creates a nested-map version of a graph from a sequence of triples"
  [triples]
  (add-all (ordered-map) triples))

(defn parsed-graph
  "Converts a graph parsed by Raphael into a nested map, with metadata for the prefixes and base."
  [{:keys [base namespaces triples] :as parsed}]
  (with-meta (simple-graph triples) {:namespaces namespaces :base base}))

(defn parse
  "Parses TTL input and creates a graph"
  [s]
  (let [s (if (str/starts-with? s "http")
            (slurp s)
            (or (some-> (io/resource s) (slurp))
                s))]
    (parsed-graph (raphael/parse s (round-trip-generator)))))
