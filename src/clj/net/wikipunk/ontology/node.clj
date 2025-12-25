(ns net.wikipunk.ontology.node
  "Canonical RDF node constructors and coercions with flyweight caching."
  (:require
   [clojure.string :as str])
  (:import
   (java.util.concurrent ConcurrentHashMap)))

(set! *warn-on-reflection* true)

;; -----------------------------------------------------------------------------
;; Datatype IRIs

(def xsd-integer "http://www.w3.org/2001/XMLSchema#integer")
(def xsd-decimal "http://www.w3.org/2001/XMLSchema#decimal")
(def xsd-double  "http://www.w3.org/2001/XMLSchema#double")
(def xsd-string  "http://www.w3.org/2001/XMLSchema#string")
(def xsd-float   "http://www.w3.org/2001/XMLSchema#float")
(def xsd-boolean "http://www.w3.org/2001/XMLSchema#boolean")
(def rdf-lang-string "http://www.w3.org/1999/02/22-rdf-syntax-ns#langString")
(def rdf-string "http://www.w3.org/2001/XMLSchema#string")

;; -----------------------------------------------------------------------------
;; Flyweight caches

(def ^{:doc "Flyweight cache for canonical IRI nodes."}
  ^ConcurrentHashMap iri-cache (ConcurrentHashMap.))
(def ^{:doc "Flyweight cache for canonical literal nodes."}
  ^ConcurrentHashMap literal-cache (ConcurrentHashMap.))
(def ^{:doc "Flyweight cache for canonical variable nodes."}
  ^ConcurrentHashMap var-cache (ConcurrentHashMap.))

(defn- cache-get ^Object [^ConcurrentHashMap cache key]
  (.get cache key))

(defn- cache-put-if-absent! ^Object [^ConcurrentHashMap cache key value]
  (let [prev (.putIfAbsent cache key value)]
    (if prev prev value)))

;; -----------------------------------------------------------------------------
;; Literal coercion

(def ^:private numeric-datatypes
  #{xsd-integer xsd-decimal xsd-double})

(defn literal->value
  "Convert a literal map {:lex .. :dt .. :lang ..} into a Clojure value."
  [{:keys [lex dt lang]}]
  (cond
    (some? lang)                                 lex
    (nil? dt)                                   lex
    (= dt xsd-integer)                          (Long/parseLong lex)
    (= dt xsd-decimal)                          (bigdec lex)
    (= dt xsd-double)                           (Double/parseDouble lex)
    (= dt xsd-boolean)                          (contains? #{"true" "1"} (str/lower-case lex))
    (= dt rdf-lang-string)                      lex
    (= dt rdf-string)                           lex
    :else                                       lex))

(defn- literal-map
  ([lex] (literal-map lex nil nil))
  ([lex dt lang]
   (let [dt* (or dt (when lang rdf-lang-string))]
     (cond-> {:lex lex}
       dt* (assoc :dt dt*)
       lang (assoc :lang lang)))))

(defn literal-node
  "Return canonical literal node vector [:literal {:lex .. :dt .. :lang .. :value ..}]."
  ([lex] (literal-node lex nil nil))
  ([lex dt lang]
   (let [key (vector lex dt lang)]
     (if-some [cached (cache-get literal-cache key)]
       cached
       (let [info (literal-map lex dt lang)
             value (literal->value info)
             node [:literal (assoc info :value value)]]
         (cache-put-if-absent! literal-cache key node))))))

;; -----------------------------------------------------------------------------
;; IRIs / Vars / BNodes

(defn iri-node
  "Return canonical [:iri string] node (cached)."
  [iri]
  (if (vector? iri)
    iri
    (if-some [cached (cache-get iri-cache iri)]
      cached
      (cache-put-if-absent! iri-cache iri [:iri iri]))))

(defn var-node
  "Return canonical [:var name] node (cached)."
  [var-name]
  (let [k (keyword var-name)]
    (if-some [cached (cache-get var-cache k)]
      cached
      (cache-put-if-absent! var-cache k [:var (clojure.core/name k)]))))

(defn bnode-node
  "Return [:bnode id] without caching (scoped externally)."
  [id]
  [:bnode id])

(defn node?
  "True when v is a canonical RDF node vector."
  [v]
  (and (vector? v)
       (keyword? (first v))))

(defn literal-node?
  "True when v is a literal node vector."
  [v]
  (= :literal (first v)))

(defn iri-node?
  "True when v is an IRI node vector."
  [v]
  (= :iri (first v)))

(defn var-node?
  "True when v is a variable node vector."
  [v]
  (= :var (first v)))

(defn bnode-node?
  "True when v is a blank-node vector."
  [v]
  (= :bnode (first v)))

(defn literal-value
  "Return the parsed value stored in a literal node."
  [node]
  (when (literal-node? node)
    (get (second node) :value)))

;; -----------------------------------------------------------------------------
;; Primitive coercion helpers

(defn- ->literal-components [value]
  (cond
    (instance? java.math.BigDecimal value)
    [(.toPlainString ^java.math.BigDecimal value) xsd-decimal nil]

    (instance? java.math.BigInteger value)
    [(.toString ^java.math.BigInteger value) xsd-integer nil]

    (instance? Long value)
    [(Long/toString ^long value) xsd-integer nil]

    (instance? Integer value)
    [(Integer/toString ^int value) xsd-integer nil]

    (instance? Short value)
    [(Short/toString ^short value) xsd-integer nil]

    (instance? Byte value)
    [(Byte/toString ^byte value) xsd-integer nil]

    (instance? Double value)
    [(Double/toString ^double value) xsd-double nil]

    (instance? Float value)
    [(Float/toString ^float value) xsd-double nil]

    (instance? Number value)
    (let [bd (bigdec value)]
      [(.toPlainString ^java.math.BigDecimal bd) xsd-decimal nil])

    (instance? Boolean value)
    [(if value "true" "false") xsd-boolean nil]

    :else
    [(str value) nil nil]))

(defn ensure-node
  "Coerce value into canonical RDF node vector.
   position is one of :subject :predicate :object."
  ([position value]
   (ensure-node position value nil))
  ([position value lang]
   (cond
     (node? value) value

     (map? value)
     (if (contains? value :lex)
       (let [{:keys [lex dt lang] :as info} value
             node (literal-node lex dt lang)]
         (if (contains? info :value)
           [:literal (assoc info :value (literal->value info))]
           node))
       [:node value])

     (keyword? value)
     (iri-node (name value))

     (instance? java.net.URI value)
     (iri-node (str value))

     (instance? java.util.UUID value)
     (iri-node (str value))

     (instance? Boolean value)
     (let [[lex dt lang*] (->literal-components value)]
       (literal-node lex dt lang*))

     (instance? Number value)
     (let [[lex dt lang*] (->literal-components value)]
       (literal-node lex dt lang*))

     (string? value)
     (case position
       :predicate (iri-node value)
       :subject (if (or (str/starts-with? value "http://")
                        (str/starts-with? value "https://"))
                  (iri-node value)
                  (iri-node value))
       :object (if (or (str/starts-with? value "http://")
                       (str/starts-with? value "https://"))
                 (iri-node value)
                 (literal-node value nil lang))
       (literal-node value nil lang))

     (= position :predicate)
     (iri-node (str value))

     (= position :subject)
     (iri-node (str value))

     :else
     (let [[lex dt lang*] (->literal-components value)]
       (literal-node lex dt (or lang lang*))))))

;; -----------------------------------------------------------------------------
;; Triple + dataset canonicalisation

(defn canonical-triple
  "Ensure triple map {:graph .. :s .. :p .. :o ..} uses canonical nodes."
  [{:keys [graph s p o] :as triple}]
  (let [graph' (cond
                 (nil? graph) :default
                 (keyword? graph) graph
                 (node? graph) graph
                 (= graph :default) :default
                 (= graph :union) :union
                 :else (iri-node (str graph)))]
    {:graph graph'
     :s (ensure-node :subject s)
     :p (ensure-node :predicate p)
     :o (ensure-node :object o)}))

(defn canonical-dataset
  "Canonicalize dataset {:triples #{...}} once (idempotent)."
  [{:keys [triples] :as dataset}]
  (cond
    (nil? dataset) {:triples #{} :canonical? true}
    (:canonical? dataset) dataset
    :else
    (let [triples' (into #{} (map canonical-triple) triples)]
      (assoc dataset :triples triples' :canonical? true))))

(defn literal-lex
  "Return the lexical form for a literal node."
  [node]
  (when (literal-node? node)
    (get-in node [1 :lex])))

(defn literal-dt
  "Return the datatype IRI for a literal node."
  [node]
  (when (literal-node? node)
    (get-in node [1 :dt])))

(defn literal-lang
  "Return the language tag for a literal node."
  [node]
  (when (literal-node? node)
    (get-in node [1 :lang])))

(defn literal-info
  "Return the full literal info map for a literal node."
  [node]
  (when (literal-node? node)
    (second node)))
