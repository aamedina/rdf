(ns net.wikipunk.datomic.boot
  "Initialized to some WIP functions used to install RDF facts into a
  Datomic dev-local database based on the state of the system."
  (:require
   [asami.core :as asami]
   [arachne.aristotle.graph :as g]
   [clojure.datafy :refer [datafy]]
   [clojure.tools.logging :as log]
   [clojure.set :as set]
   [clojure.string :as str]
   [clojure.walk :as walk]
   [datomic.client.api :as d]
   [net.wikipunk.boot]
   [net.wikipunk.ext]
   [net.wikipunk.rdf :as rdf]   
   [net.wikipunk.mop :as mop]
   [net.wikipunk.rdf.annotea]
   [net.wikipunk.rdf.annotation]
   [net.wikipunk.rdf.as]
   [net.wikipunk.rdf.ao]
   [net.wikipunk.rdf.bibo]
   [net.wikipunk.rdf.bio]
   [net.wikipunk.rdf.cc]
   [net.wikipunk.rdf.csvw]
   [net.wikipunk.rdf.ctag]
   [net.wikipunk.rdf.daq]
   [net.wikipunk.rdf.dc11]
   [net.wikipunk.rdf.dcat]
   [net.wikipunk.rdf.dcam]
   [net.wikipunk.rdf.dcterms]
   [net.wikipunk.rdf.dcmitype]
   [net.wikipunk.rdf.dqv]
   [net.wikipunk.rdf.duv]
   [net.wikipunk.rdf.doap]
   [net.wikipunk.rdf.event]
   [net.wikipunk.rdf.exif]
   [net.wikipunk.rdf.formats]
   [net.wikipunk.rdf.foaf]
   [net.wikipunk.rdf.frbr]
   [net.wikipunk.rdf.keys]
   [net.wikipunk.rdf.geo]
   [net.wikipunk.rdf.gr]
   [net.wikipunk.rdf.greg]
   [net.wikipunk.rdf.grddl]
   [net.wikipunk.rdf.cal]
   [net.wikipunk.rdf.jsonld]   
   [net.wikipunk.rdf.ldp]
   [net.wikipunk.rdf.ma]
   [net.wikipunk.rdf.mop]
   [net.wikipunk.rdf.mo]
   [net.wikipunk.rdf.oa]
   [net.wikipunk.rdf.odrl]
   [net.wikipunk.rdf.og]
   [net.wikipunk.rdf.ogc]
   [net.wikipunk.rdf.org]
   [net.wikipunk.rdf.owl]
   [net.wikipunk.rdf.prov]
   [net.wikipunk.rdf.qb]
   [net.wikipunk.rdf.rdf]
   [net.wikipunk.rdf.rdfa]
   [net.wikipunk.rdf.rdfg]
   [net.wikipunk.rdf.rdfs]
   [net.wikipunk.rdf.rel]
   [net.wikipunk.rdf.rev]
   [net.wikipunk.rdf.rr]
   [net.wikipunk.rdf.schema]
   [net.wikipunk.rdf.scovo]
   [net.wikipunk.rdf.sd]
   [net.wikipunk.rdf.sh]
   [net.wikipunk.rdf.sim]
   [net.wikipunk.rdf.sioc]
   [net.wikipunk.rdf.sioc.types]
   [net.wikipunk.rdf.skos]
   [net.wikipunk.rdf.skosxl]
   [net.wikipunk.rdf.sosa]
   [net.wikipunk.rdf.ssn]
   [net.wikipunk.rdf.time]
   [net.wikipunk.rdf.vs]
   [net.wikipunk.rdf.vcard]
   [net.wikipunk.rdf.void]
   [net.wikipunk.rdf.wdrs]
   [net.wikipunk.rdf.xhv]
   [net.wikipunk.rdf.xsd]))

(defprotocol Seed
  "Helper protocol to bootstrap attributes from loaded metaobjects."
  (select-attributes [x]))

(def ^:dynamic *schema* nil)

(defn unroll-blank
  "used to add :db/id's to blank nodes"
  [form]
  (if (and (map? form)
           (and (not (contains? form :xsd/anyURI))
                (not (contains? form :db/ident))
                (not (contains? form :db/id))))
    (assoc form :db/id (str (random-uuid)))
    form))

(extend-protocol Seed
  clojure.lang.Sequential
  (select-attributes [xs] xs)
  
  clojure.lang.Namespace
  (select-attributes [ns]
    (when (isa? (mop/type-of (meta ns)) :owl/Ontology)
      (pmap select-attributes (vals (ns-publics ns)))))

  clojure.lang.Var
  (select-attributes [v]
    (when (map? @v)
      (select-attributes @v)))

  clojure.lang.Named
  (select-attributes [ident]
    (some-> (datafy ident)
            (select-attributes)))

  clojure.lang.IPersistentMap
  (select-attributes [m]
    (some->> (reduce-kv (fn [m k v]
                          (if (or (isa? k :rdf/Property)
                                  (contains? #{:db/add
                                               :db/affinity
                                               :db/cardinality
                                               :db/cas
                                               :db/doc
                                               :db/ensure
                                               :db/excise
                                               :db/fulltext
                                               :db/id
                                               :db/ident
                                               :db/isComponent
                                               :db/noHistory
                                               :db/retract
                                               :db/retractEntity
                                               :db/system-tx
                                               :db/tupleAttrs
                                               :db/tupleType
                                               :db/tupleTypes
                                               :db/txInstant
                                               :db/txUUID
                                               :db/unique
                                               :db/valueType}
                                             k))
                            m
                            (dissoc m k)))
                        m m)
             #_(walk/prewalk rdf/unroll-langString)
             #_(walk/prewalk rdf/box-values)
             (walk/postwalk (fn [form]
                              (cond
                                (and (map-entry? form)
                                     (isa? (key form) :rdf/Property))
                                (let [k (key form)
                                      v (val form)
                                      v (if (tagged-literal? v)
                                          (:form v)
                                          v)
                                      v' (try
                                           (case (rdf/infer-datomic-type k)
                                             :db.type/string (letfn [(f [v]
                                                                       (cond
                                                                         (map? v)
                                                                         (or (:xsd/anyURI v)
                                                                             (:xsd/string v)
                                                                             (:rdf/value v)
                                                                             (pr-str v))
                                                                         
                                                                         (coll? v)
                                                                         v
                                                                         
                                                                         :else
                                                                         (str v)))]
                                                               (if (set? v)
                                                                 (into #{} (map f) v)
                                                                 (f v)))
                                             :db.type/long    (if (coll? v)
                                                                (into #{} (map long) v)
                                                                (long v))
                                             :db.type/double  (double v)
                                             :db.type/instant (if (string? v)
                                                                (clojure.instant/read-instant-date v)
                                                                v)
                                             :db.type/ref     (if (isa? (:rdfs/range rdf/*metaobjects*)
                                                                        k :rdf/List)
                                                                (g/rdf-list (cond
                                                                              (and (set? v) (coll? (first v)))
                                                                              (first v)

                                                                              (set? v)
                                                                              (vec v)
                                                                              
                                                                              (sequential? v)
                                                                              v

                                                                              :else [v]))
                                                                (into (if (and (coll? v) (not (map? v)))
                                                                        (empty v)
                                                                        #{})
                                                                      (map (fn [v]
                                                                             (if (not (or (map? v) (keyword? v)))
                                                                               (rdf/box v)
                                                                               v)))
                                                                      (if (and (coll? v) (not (map? v)))
                                                                        v
                                                                        #{v})))
                                             
                                             :db.type/bigint (bigint v)
                                             :db.type/bigdec (bigdec v)
                                             v)
                                           (catch Throwable ex
                                             (throw (ex-info (.getMessage ex) m ex))))
                                      v' (if (identical? (rdf/infer-datomic-cardinality k)
                                                         :db.cardinality/one)
                                           ;; need to account for vectors when the schema is one
                                           (if (and (coll? v') (not (map? v')))
                                             (do
                                               (when (> (count v') 1)
                                                 (log/warn "multiple values for cardinality one attribute detected" k v'))
                                               (first v'))
                                             v')
                                           v')]
                                  [k v'])
                                :else form)))
             (walk/prewalk unroll-blank)
             #_(walk/prewalk rdf/box-values)
             (walk/prewalk (fn [form]
                             (if (and (string? form)
                                      (>= (count form) 4096))
                               (subs form 0 4096)
                               form))))))

(defmethod rdf/infer-datomic-cardinality :default
  [_]
  :db.cardinality/many)

(defmethod rdf/infer-datomic-unique :default
  [_]
  nil)

(defmethod rdf/infer-datomic-cardinality :owl/FunctionalProperty [_] :db.cardinality/one)

(defmethod rdf/infer-datomic-type :rdfa/uri [_] :db.type/string)
(defmethod rdf/infer-datomic-cardinality :rdfa/uri [_] :db.cardinality/one)
(defmethod rdf/infer-datomic-unique :rdfa/uri [_] :db.unique/identity)

(defmethod rdf/infer-datomic-type :jsonld/id [_] :db.type/string)
(defmethod rdf/infer-datomic-cardinality :jsonld/id [_] :db.cardinality/one)
(defmethod rdf/infer-datomic-unique :jsonld/id [_] :db.unique/identity)

(defmethod rdf/infer-datomic-cardinality :rdf/first [_] :db.cardinality/one)
(defmethod rdf/infer-datomic-cardinality :rdf/rest [_] :db.cardinality/one)

(defmethod rdf/infer-datomic-type :rdf/value [_] :db.type/string)
(defmethod rdf/infer-datomic-cardinality :rdf/value [_] :db.cardinality/one)

(defmethod rdf/infer-datomic-type :rdf/language [_] :db.type/string)
(defmethod rdf/infer-datomic-cardinality :rdf/language [_] :db.cardinality/one)

(defmethod rdf/infer-datomic-cardinality :owl/propertyChainAxiom [_] :db.cardinality/one)

(defmethod rdf/infer-datomic-type :rdf/Property
  [ident]
  (let [{:rdfs/keys   [range]
         :schema/keys [rangeIncludes]
         :db/keys     [valueType]
         :as          e}
        (datafy ident)]
    (or valueType                       ; use explicit type if present
        (some rdf/infer-datomic-type
              (concat (when range
                        (if (and (coll? range) (not (map? range)))
                          range
                          [range]))
                      (when rangeIncludes
                        (if (and (coll? rangeIncludes) (not (map? rangeIncludes)))
                          rangeIncludes
                          [rangeIncludes]))))
        :db.type/ref)))

(defmethod rdf/infer-datomic-type :rdfs/Datatype
  [ident]
  (let [{:owl/keys [onDatatype]} (datafy ident)]
    (when onDatatype
      (rdf/infer-datomic-type onDatatype))))

(defmethod rdf/infer-datomic-type :rdfs/Class
  [ident]
  (let [{:owl/keys [unionOf]} (datafy ident)]
    (when unionOf
      (some rdf/infer-datomic-type unionOf))))

(defmethod rdf/infer-datomic-type :rdfs/Literal [_] :db.type/string)

(prefer-method rdf/infer-datomic-type :rdfs/Literal :rdfs/Datatype)
(defmethod rdf/infer-datomic-type :rdfs/seeAlso [_] :db.type/ref)
(prefer-method rdf/infer-datomic-type :rdfs/seeAlso :owl/AnnotationProperty)

(defmethod rdf/infer-datomic-type :rdfa/term [_] :db.type/string)
(defmethod rdf/infer-datomic-type :rdfa/prefix [_] :db.type/string)

(defmethod rdf/infer-datomic-type :owl/AnnotationProperty [_] :db.type/string)
(defmethod rdf/infer-datomic-type :owl/real [_] :db.type/bigdec)
(defmethod rdf/infer-datomic-type :owl/deprecated [_] :db.type/boolean)
(defmethod rdf/infer-datomic-type :owl/versionInfo [_] :db.type/string)
(defmethod rdf/infer-datomic-type :owl/topDataProperty [_] :db.type/ref)
#_(defmethod rdf/infer-datomic-type :owl/topObjectProperty [_] :db.type/ref)

(defmethod rdf/infer-datomic-type :xsd/base64Binary [_] :db.type/string)
(defmethod rdf/infer-datomic-type :xsd/boolean [_] :db.type/boolean)
(defmethod rdf/infer-datomic-type :xsd/byte [_] :db.type/long)
(defmethod rdf/infer-datomic-type :xsd/date [_] :db.type/instant)
(defmethod rdf/infer-datomic-type :xsd/dateTime [_] :db.type/instant)
(defmethod rdf/infer-datomic-type :xsd/dateTimeStamp [_] :db.type/instant)
(defmethod rdf/infer-datomic-type :xsd/dayTimeDuration [_] :db.type/string)
(defmethod rdf/infer-datomic-type :xsd/decimal [_] :db.type/bigdec)
(defmethod rdf/infer-datomic-type :xsd/double [_] :db.type/double)
(defmethod rdf/infer-datomic-type :xsd/duration [_] :db.type/string)
(defmethod rdf/infer-datomic-type :xsd/float [_] :db.type/float)
(defmethod rdf/infer-datomic-type :xsd/gDay [_] :db.type/instant)
(defmethod rdf/infer-datomic-type :xsd/gMonth [_] :db.type/instant)
(defmethod rdf/infer-datomic-type :xsd/gMonthDay [_] :db.type/instant)
(defmethod rdf/infer-datomic-type :xsd/gYear [_] :db.type/instant)
(defmethod rdf/infer-datomic-type :xsd/gYearMonth [_] :db.type/instant)
(defmethod rdf/infer-datomic-type :xsd/hexBinary [_] :db.type/string)
(defmethod rdf/infer-datomic-type :xsd/int [_] :db.type/long)
(defmethod rdf/infer-datomic-type :xsd/integer [_] :db.type/bigint)
(defmethod rdf/infer-datomic-type :xsd/language [_] :db.type/string)
(defmethod rdf/infer-datomic-type :xsd/length [_] :db.type/long)
(defmethod rdf/infer-datomic-type :xsd/long [_] :db.type/long)
(defmethod rdf/infer-datomic-type :xsd/negativeInteger [_] :db.type/long)
(defmethod rdf/infer-datomic-type :xsd/nonNegativeInteger [_] :db.type/long)
(defmethod rdf/infer-datomic-type :xsd/nonPositiveInteger [_] :db.type/long)
(defmethod rdf/infer-datomic-type :xsd/normalizedString [_] :db.type/string)
(defmethod rdf/infer-datomic-type :xsd/positiveInteger [_] :db.type/long)
(defmethod rdf/infer-datomic-type :xsd/short [_] :db.type/long)
(defmethod rdf/infer-datomic-type :xsd/string [_] :db.type/string)
(defmethod rdf/infer-datomic-type :xsd/time [_] :db.type/instant)
(defmethod rdf/infer-datomic-type :xsd/token [_] :db.type/string)
(defmethod rdf/infer-datomic-type :xsd/unsignedByte [_] :db.type/long)
(defmethod rdf/infer-datomic-type :xsd/unsignedInt [_] :db.type/long)
(defmethod rdf/infer-datomic-type :xsd/unsignedLong [_] :db.type/long)
(defmethod rdf/infer-datomic-type :xsd/unsignedShort [_] :db.type/long)
(defmethod rdf/infer-datomic-type :xsd/yearMonthDuration [_] :db.type/string)

(defmethod rdf/infer-datomic-type :schema/Boolean [_] :db.type/boolean)
(defmethod rdf/infer-datomic-type :schema/Float [_] :db.type/double)
(defmethod rdf/infer-datomic-type :schema/Integer [_] :db.type/long)
(defmethod rdf/infer-datomic-type :schema/Text [_] :db.type/string)
(defmethod rdf/infer-datomic-type :schema/Date [_] :db.type/instant)
(defmethod rdf/infer-datomic-type :schema/DateTime [_] :db.type/instant)
(defmethod rdf/infer-datomic-type :schema/Number [_] :db.type/bigdec)
(defmethod rdf/infer-datomic-type :schema/Time [_] :db.type/instant)
(defmethod rdf/infer-datomic-type :schema/URL [_] :db.type/ref)

(defmethod rdf/infer-datomic-type :dc11/creator [_] :db.type/ref)
(defmethod rdf/infer-datomic-type :dcterms/creator [_] :db.type/ref)
(defmethod rdf/infer-datomic-type :dc11/date [_] :db.type/instant)
(defmethod rdf/infer-datomic-type :dc11/description [_] :db.type/ref)
(defmethod rdf/infer-datomic-type :dc11/title [_] :db.type/ref)
(defmethod rdf/infer-datomic-type :dcterms/created [_] :db.type/instant)

(defmethod rdf/infer-datomic-type :vs/term_status [_] :db.type/ref)
(defmethod rdf/infer-datomic-type :vs/moreinfo [_] :db.type/string)

(defmethod rdf/infer-datomic-type :time/month [_] :db.type/instant)

(defmethod rdf/infer-datomic-type :voag/width [_] :db.type/string)
(defmethod rdf/infer-datomic-type :voag/height [_] :db.type/string)
(defmethod rdf/infer-datomic-type :voag/image [_] :db.type/ref)
(defmethod rdf/infer-datomic-type :voag/url [_] :db.type/ref)

(defmethod rdf/infer-datomic-type :sh/maxCount [_] :db.type/long)

(defmethod rdf/infer-datomic-type :vaem/url [_] :db.type/ref)
(defmethod rdf/infer-datomic-type :vaem/acronym [_] :db.type/string)
(defmethod rdf/infer-datomic-type :vaem/logo [_] :db.type/ref)
(defmethod rdf/infer-datomic-type :vaem/usesNonImportedResource [_] :db.type/ref)

(defmethod rdf/infer-datomic-type :org/roleProperty [_] :db.type/ref)

(defmethod rdf/infer-datomic-type :prov/sharesDefinitionWith [_] :db.type/ref)
(defmethod rdf/infer-datomic-type :prov/qualifiedForm [_] :db.type/ref)
(defmethod rdf/infer-datomic-type :prov/unqualifiedForm [_] :db.type/ref)

(defmethod rdf/infer-datomic-type :d3f/has-link [_] :db.type/ref)
(defmethod rdf/infer-datomic-type :d3f/display-order [_] :db.type/long)
(defmethod rdf/infer-datomic-type :d3f/display-priority [_] :db.type/long)
;; (defmethod rdf/infer-datomic-type :d3f/d3fend-annotation [_] :db.type/string)
;; (defmethod rdf/infer-datomic-type :d3f/release-date [_] :db.type/instant)
(defmethod rdf/infer-datomic-type :d3f/d3fend-kb-data-property [_] :db.type/string)
;; (defmethod rdf/infer-datomic-type :d3f/d3fend-data-property [_] :db.type/ref)
(defmethod rdf/infer-datomic-type :d3f/identifier [_] :db.type/string)
(defmethod rdf/infer-datomic-type :d3f/text [_] :db.type/string)
(defmethod rdf/infer-datomic-type :d3f/date [_] :db.type/instant)
#_(defmethod rdf/infer-datomic-type :d3f/created [_] :db.type/instant)
(defmethod rdf/infer-datomic-type :d3f/d3fend-id [_] :db.type/string)
(defmethod rdf/infer-datomic-type :d3f/kb-reference-title [_] :db.type/string)

(defmethod rdf/infer-datomic-type :gr/displayPosition [_] :db.type/long)

(defmethod rdf/infer-datomic-type :mo/level [_] :db.type/string)

(defmethod rdf/infer-datomic-type :prov/component [_] :db.type/string)
(defmethod rdf/infer-datomic-type :prov/category [_] :db.type/string)
(defmethod rdf/infer-datomic-type :prov/inverse [_] :db.type/string)
(defmethod rdf/infer-datomic-type :prov/editorialNote [_] :db.type/string)

(defmethod rdf/infer-datomic-type :lv2.pg/harmonicDegree [_] :db.type/long)
(defmethod rdf/infer-datomic-type :lv2.pg/harmonicIndex [_] :db.type/long)
(defmethod rdf/infer-datomic-type :lv2/minimum [_] :db.type/long)

(defmethod rdf/infer-datomic-type :keys/mode [_] :db.type/string)

(defmethod rdf/infer-datomic-type :vann/example [_] :db.type/ref)
(defmethod rdf/infer-datomic-type :vann/usageNote [_] :db.type/ref)

(defmethod rdf/infer-datomic-type :exif/tag_number [_] :db.type/string)

(defmethod rdf/infer-datomic-type :skos/historyNote [_] :db.type/ref)

(defmethod rdf/infer-datomic-cardinality :owl/unionOf [_] :db.cardinality/one)
(defmethod rdf/infer-datomic-cardinality :owl/intersectionOf [_] :db.cardinality/one)
(defmethod rdf/infer-datomic-cardinality :mop/classPrecedenceList [_] :db.cardinality/one)

(defmethod rdf/infer-datomic-cardinality :owl/oneOf [_] :db.cardinality/one)
(defmethod rdf/infer-datomic-cardinality :owl/onProperty [_] :db.cardinality/one)
(defmethod rdf/infer-datomic-cardinality :owl/InverseFunctionalProperty [_] :db.cardinality/one)
(defmethod rdf/infer-datomic-unique :owl/InverseFunctionalProperty [_] :db.unique/identity)

(defmethod rdf/infer-datomic-type :default
  [x]
  (cond
    (or (isa? x :rdfs/Resource)
        (map? x))
    nil
    (and (qualified-keyword? x)
         (or (clojure.string/starts-with? (namespace x) "db")
             (clojure.string/starts-with? (namespace x) "xt")))
    nil
    
    :else (throw (ex-info (str (pr-str x) " was not found. Cannot infer datomic type for unknown RDF properties. Has the RDF namespace containing the property been loaded by the Universal Translator component during system start? Try calling datafy on it in a REPL and once you can datafy the ident and return the metaobject, try again.") {:x x}))))

(defn bootstrap-attributes
  "Given a set of namespace names require them and "
  ([]
   (bootstrap-attributes mop/*env* (map identity)))
  ([env]
   (bootstrap-attributes env (map identity)))
  ([env xf]
   (into []
         (comp
           (map #(assoc (asami/entity env %) :db/ident %))
           xf           
           (keep (fn [{:rdfs/keys [range domain subPropertyOf]
                       :db/keys   [ident]
                       :rdf/keys  [type]
                       :as        e}]
                   (cond-> (select-keys e [:db/ident
                                           :db/cardinality
                                           :db/valueType
                                           :db/isComponent
                                           :db/tupleAttrs
                                           :db/tupleType
                                           :db/tupleTypes
                                           :db/fulltext
                                           :db/unique])
                     (nil? (:db/cardinality e))
                     (assoc :db/cardinality :db.cardinality/many)
                     (nil? (:db/valueType e))
                     (assoc :db/valueType (rdf/infer-datomic-type (:db/ident e)))
                     (nil? (:db/cardinality e))
                     (assoc :db/cardinality (rdf/infer-datomic-cardinality (:db/ident e)))
                     (rdf/infer-datomic-unique (:db/ident e))
                     (assoc :db/unique (rdf/infer-datomic-unique (:db/ident e)))))))
         (reduce set/union
                 (set (asami/q '[:find [?ident ...]
                                 :where
                                 [?e :db/ident ?ident]
                                 [?e :db/cardinality _]
                                 [?e :db/valueType _]]
                               env))
                 (into [(descendants (:rdf/Property rdf/*metaobjects*) :rdf/Property)]
                       (map #(descendants (:rdf/Property rdf/*metaobjects*) %))
                       (descendants (:rdfs/Class rdf/*metaobjects*) :rdf/Property))))))

(defn bootstrap-idents
  ([]
   (bootstrap-idents mop/*env*))
  ([env]   
   (into []
         (map #(hash-map :db/ident %))
         (asami/q '[:find [?ident ...]
                    :where
                    [?e :db/ident ?ident]]
                  env))))

(defn bootstrap-individuals
  ([]
   (bootstrap-individuals mop/*env*))
  ([env]
   (->> (asami/q '[:find [?ident ...]
                   :where
                   [?e :db/ident ?ident]]
                 env)
        (pmap #(asami/entity env %))
        (pmap select-attributes))))

(defn test-bootstrap
  "Tests importing Asami entities into Datomic."
  ([conn]
   (test-bootstrap @#'clojure.core/global-hierarchy mop/*env* *schema* conn))
  ([h env schema conn]
   (binding [*schema*         schema]
     (let [rf         (fn [db tx-data]
                        (try
                          (:db-after (d/with db {:tx-data [tx-data]}))
                          (catch Throwable ex
                            (throw (ex-info (.getMessage ex) {:tx-data tx-data} ex)))))
           attrs      (bootstrap-attributes env)
           _          (set! *schema* attrs)]
       (as-> (reduce rf (d/with-db conn) *schema*) db
         (reduce rf db attrs)
         (reduce rf db (bootstrap-idents env))
         (reduce rf db (bootstrap-individuals env)))))))

(defmacro with-db
  "Evaluates body with mop/*env* bound to the return value of the db
  expression."
  [db & body]
  `(binding [mop/*env* ~db]
     (when-not (satisfies? datomic.client.api.protocols/Db mop/*env*)
       (throw (ex-info "*env* is not a datomic database" {:env mop/*env*})))
     ~@body))

(defn bootstrap
  "warning: very experimental

  requires datomic.client.api on the classpath"
  ([conn] (bootstrap @#'clojure.core/global-hierarchy mop/*env* *schema* conn))
  ([conn boot-db]
   (bootstrap @#'clojure.core/global-hierarchy mop/*env* *schema* conn boot-db))
  ([h env schema conn]
   (bootstrap h env schema conn (test-bootstrap h env schema conn)))
  ([h env schema conn boot-db]
   (binding [*schema* (or schema
                          (->> (d/q '[:find (pull ?i [:db/ident
                                                      :db/cardinality
                                                      :db/valueType
                                                      :db/isComponent
                                                      :db/tupleAttrs
                                                      :db/tupleType
                                                      :db/tupleTypes
                                                      :db/fulltext
                                                      :db/unique])
                                      :where
                                      [?e :db/ident ?i]
                                      [?e :db/cardinality ?c]
                                      [?e :db/valueType ?t]]
                                    boot-db)
                               (map first)
                               (mapv #(update-vals % (fn [val] (or (:db/ident val) val))))))]
     (let []
       (doseq [part (partition-all 512 *schema*)]
         (d/transact conn {:tx-data part}))
       (doseq [part (partition-all 512 (bootstrap-idents env))]
         (d/transact conn {:tx-data part}))
       (doseq [part (partition-all 128 (bootstrap-individuals env))]
         (d/transact conn {:tx-data part}))
       (d/db conn)))))
