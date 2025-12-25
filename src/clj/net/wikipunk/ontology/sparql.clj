(ns net.wikipunk.ontology.sparql
  "Convert Jena SPARQL (SSE) into a lossless EDN form."
  (:require
   [clojure.string :as str]
   [net.wikipunk.ontology.compiler :as compiler]
   [net.wikipunk.ontology.node :as node])
  (:import
   (java.io StringWriter)
   (java.util List)
   (org.apache.jena.graph Node Triple)
   (org.apache.jena.sparql.core Quad)
   (org.apache.jena.sparql.modify.request Target UpdateAdd UpdateCopy UpdateDataDelete UpdateDataInsert UpdateDeleteWhere UpdateDrop UpdateClear UpdateCreate UpdateLoad UpdateModify UpdateMove)
   (org.apache.jena.sparql.sse Item ItemList SSE)
   (org.apache.jena.update Update UpdateFactory UpdateRequest)
   (org.apache.jena.query Query QueryFactory)
   (org.apache.jena.shared PrefixMapping)
   (org.apache.jena.sparql.algebra Op Algebra)))

(set! *warn-on-reflection* true)

(declare node->edn)

(def ^:private file-base
  (let [path (System/getProperty "user.dir")]
    (if (str/blank? path)
      nil
      (let [p (if (.endsWith path "/") path (str path "/"))]
        p))))

(defn- collapse-file-uri
  [^String uri]
  (try
    (let [^java.net.URI juri (java.net.URI. uri)]
      (if (= "file" (.getScheme juri))
        (let [path (.getPath juri)
              ^String base file-base]
          (if (and base (.startsWith path base))
            (subs path (count base))
            uri))
        uri))
    (catch Exception _ uri)))

(defn- triple->edn
  ^clojure.lang.PersistentVector [^Triple t]
  [:triple
   (node->edn (.getSubject t))
   (node->edn (.getPredicate t))
   (node->edn (.getObject t))])

(declare item->edn)

(defn- literal->edn
  [^Node node]
  (let [lex  (.getLiteralLexicalForm node)
        lang (.getLiteralLanguage node)
        dt   (.getLiteralDatatypeURI node)
        dt*  (when-not (str/blank? dt) dt)
        lang* (when-not (str/blank? lang) lang)]
    (node/literal-node lex dt* lang*)))

(defn node->edn
  "Convert a Jena Node into an EDN tagged tuple."
  ^clojure.lang.PersistentVector [^Node node]
  (cond
    (.isVariable node) (node/var-node (.getName node))
    (.isURI node)      (node/iri-node (collapse-file-uri (.getURI node)))
    (.isBlank node)    (node/bnode-node (.getBlankNodeLabel node))
    (.isLiteral node)  (literal->edn node)
    (.isNodeTriple node) [:triple-node (triple->edn (.getTriple node))]
    :else              [:node (str node)]))

(defn- itemlist->seq
  [^ItemList lst]
  (map item->edn (iterator-seq (.iterator lst))))

(defn item->edn
  "Convert a Jena SSE Item into a Clojure data structure."
  [^Item item]
  (cond
    (.isSymbol item) (keyword (.getSymbol item))
    (.isNode item)   (node->edn (.getNode item))
    (.isList item)   (vec (itemlist->seq (.getList item)))
    :else            (str item)))

(defn op->edn
  "Given a Jena algebra op (as string or Item/Op), return EDN S-expression."
  [op]
  (cond
    (nil? op) nil
    (instance? Item op) (item->edn op)
    (string? op) (-> (SSE/parse ^String op) item->edn)
    :else (let [^String s (str op)]
            (-> (SSE/parse s) item->edn))))

(defn quad->edn
  "Convert a Jena Quad into EDN."
  [^Quad quad]
  (let [graph-node (.getGraph quad)
        graph (cond
                (Quad/isDefaultGraph graph-node) :default
                (Quad/isUnionGraph graph-node) :union
                (Quad/isDefaultGraphGenerated graph-node) :default-generated
                :else (node->edn graph-node))]
    {:graph graph
     :triple (triple->edn (.asTriple quad))}))

(defn- quad-list->vec
  [quads]
  (when (seq quads)
    (vec (map quad->edn quads))))

(defn- target->edn
  [^Target target]
  (when target
    (let [graph (some-> (.getGraph target) node->edn)]
      (cond
        (.isAll target) {:type :all}
        (.isAllNamed target) {:type :all-named}
        (.isDefault target) {:type :default}
        (.isOneNamedGraph target) {:type :named :graph graph}
        graph {:type :graph :graph graph}
        :else {:type :unknown}))))

(defn update-op->edn
  "Convert a Jena Update operation into EDN."
  [^Update op]
  (cond
    (instance? UpdateModify op)
    (let [^UpdateModify modify op
          delete (quad-list->vec (.getDeleteQuads modify))
          insert (quad-list->vec (.getInsertQuads modify))
          where  (.getWherePattern modify)
          with   (.getWithIRI modify)
          using (some->> (.getUsing modify) (map node->edn) vec)
          using-named (some->> (.getUsingNamed modify) (map node->edn) vec)]
      (cond-> {:type :modify}
        with (assoc :with (node->edn with))
        (seq delete) (assoc :delete delete)
        (seq insert) (assoc :insert insert)
        where (assoc :where (op->edn (Algebra/compile where)))
        (seq using) (assoc :using using)
        (seq using-named) (assoc :using-named using-named)))

    (instance? UpdateDataInsert op)
    (let [quads (quad-list->vec (.getQuads ^UpdateDataInsert op))]
      (cond-> {:type :data-insert}
        (seq quads) (assoc :quads quads)))

    (instance? UpdateDataDelete op)
    (let [quads (quad-list->vec (.getQuads ^UpdateDataDelete op))]
      (cond-> {:type :data-delete}
        (seq quads) (assoc :quads quads)))

    (instance? UpdateDeleteWhere op)
    (let [quads (quad-list->vec (.getQuads ^UpdateDeleteWhere op))]
      (cond-> {:type :delete-where}
        (seq quads) (assoc :delete quads)))

    (instance? UpdateCreate op)
    (let [^UpdateCreate create op]
      {:type :create
       :graph (some-> (.getGraph create) node->edn)
       :silent (.isSilent create)})

    (instance? UpdateDrop op)
    (let [^UpdateDrop drop op]
      {:type :drop
       :silent (.isSilent drop)
       :target (-> drop .getTarget target->edn)})

    (instance? UpdateClear op)
    (let [^UpdateClear clear op]
      {:type :clear
       :silent (.isSilent clear)
       :target (-> clear .getTarget target->edn)})

    (instance? UpdateLoad op)
    (let [^UpdateLoad load op]
      {:type :load
       :silent (.isSilent load)
       :source (collapse-file-uri (.getSource load))
       :graph (some-> (.getDest load) node->edn)})

    (instance? UpdateAdd op)
    (let [^UpdateAdd add op]
      {:type :add
       :silent (.isSilent add)
       :src (-> add .getSrc target->edn)
       :dest (-> add .getDest target->edn)})

    (instance? UpdateCopy op)
    (let [^UpdateCopy copy op]
      {:type :copy
       :silent (.isSilent copy)
       :src (-> copy .getSrc target->edn)
       :dest (-> copy .getDest target->edn)})

    (instance? UpdateMove op)
    (let [^UpdateMove move op]
      {:type :move
       :silent (.isSilent move)
       :src (-> move .getSrc target->edn)
       :dest (-> move .getDest target->edn)})

    :else
    {:type (-> op class .getSimpleName (str/lower-case) keyword)
     :string (.toString op)}))

(defn query->map
  "Convert a parsed Jena Query into our canonical EDN map."
  (^clojure.lang.IPersistentMap [^Query q]
   (query->map q nil))
  (^clojure.lang.IPersistentMap [^Query q original]
   (let [form (cond
               (.isAskType q) :ask
               (.isSelectType q) :select
               (.isConstructType q) :construct
               (.isDescribeType q) :describe
               :else :unknown)
         ^PrefixMapping pm (.getPrefixMapping q)
         ^Op op (Algebra/compile q)]
     {:type     :query
      :form     form
      :prefixes (into {} (.getNsPrefixMap pm))
      :string   (or original (.toString q))
      :algebra  (op->edn op)})))

(defn update->map
  "Convert a SPARQL update string or UpdateRequest into canonical EDN."
  ([req]
   (update->map req nil))
  ([req original-string]
   (let [^UpdateRequest request (if (string? req)
                                  (UpdateFactory/create ^String req)
                                  ^UpdateRequest req)
         ^PrefixMapping pm (.getPrefixMapping request)
         ^List ops (.getOperations request)
         edn-ops (mapv update-op->edn ops)]
     {:type :update
      :prefixes (into {} (.getNsPrefixMap pm))
      :string (or original-string (.toString request))
      :algebra edn-ops})))

(defn parse-string
  "Parse a SPARQL query/update string into the canonical EDN IR."
  [sparql]
  (when (and sparql (not (str/blank? sparql)))
    (let [text (str/trim sparql)]
      (try
        (let [^Query q (QueryFactory/create text)]
          (query->map q text))
        (catch Exception e
          (do
            (when (System/getProperty "wikipunk.debug.sparql")
              (binding [*out* *err*]
                (println "[sparql] query parse failed" (.getMessage e))
                (.printStackTrace e)
                (println text)
                (println "[sparql] attempting update parse")))
            (try
              (let [^UpdateRequest req (UpdateFactory/create text)
                    result (update->map req text)]
                (when (System/getProperty "wikipunk.debug.sparql")
                  (binding [*out* *err*]
                    (println "[sparql] update parse succeeded")))
                result)
              (catch Exception update-ex
                (when (System/getProperty "wikipunk.debug.sparql")
                  (binding [*out* *err*]
                    (println "[sparql] update parse failed" (.getMessage update-ex))
                    (.printStackTrace update-ex)
                    (println text)))
                (throw update-ex)))))))))

;; -----------------------------------------------------------------------------
;; Compilation helpers

(defn compile-query-string
  "Parse and compile a SPARQL query string into an executable query map."
  [sparql]
  (let [parsed (parse-string sparql)]
    (when-not (= :query (:type parsed))
      (throw (ex-info "Provided SPARQL is not a query" {:type (:type parsed)})))
    (compiler/compile-query parsed)))

(defn compile-update-string
  "Parse and compile a SPARQL update string into an executable update map."
  [sparql]
  (let [parsed (parse-string sparql)]
    (when-not (= :update (:type parsed))
      (throw (ex-info "Provided SPARQL is not an update" {:type (:type parsed)})))
    (compiler/compile-update parsed)))
