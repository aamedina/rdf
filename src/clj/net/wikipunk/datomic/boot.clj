(ns net.wikipunk.datomic.boot
  "Initialized to some WIP functions used to install RDF facts into a
  Datomic dev-local database based on the state of the system."
  (:require
   [clojure.datafy :refer [datafy]]
   [clojure.tools.logging :as log]
   [clojure.walk :as walk]
   [datomic.client.api :as d]
   [net.wikipunk.boot]
   [net.wikipunk.ext]
   [net.wikipunk.rdf :as rdf]   
   [net.wikipunk.mop :as mop]
   [net.wikipunk.rdf.as]
   [net.wikipunk.rdf.bibo]
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
   [net.wikipunk.rdf.event]
   [net.wikipunk.rdf.formats]
   [net.wikipunk.rdf.foaf]
   [net.wikipunk.rdf.geo]
   [net.wikipunk.rdf.gr]
   [net.wikipunk.rdf.greg]
   [net.wikipunk.rdf.grddl]
   [net.wikipunk.rdf.cal]
   [net.wikipunk.rdf.jsonld]   
   [net.wikipunk.rdf.ldp]
   [net.wikipunk.rdf.ma]
   [net.wikipunk.rdf.mop]
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
   [net.wikipunk.rdf.rev]
   [net.wikipunk.rdf.rr]
   [net.wikipunk.rdf.schema]
   [net.wikipunk.rdf.scovo]
   [net.wikipunk.rdf.sd]
   [net.wikipunk.rdf.sioc]
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
   [net.wikipunk.rdf.xsd]
   [xtdb.api :as xt]))

(defprotocol Seed
  "Helper protocol to bootstrap attributes from loaded metaobjects."
  (select-attributes [x]))

(def ^:dynamic *schema* nil)

(extend-protocol Seed
  clojure.lang.Namespace
  (select-attributes [ns]
    (when (isa? (:rdf/type (meta ns)) :owl/Ontology)
      (seq (keep select-attributes (vals (ns-publics ns))))))

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
    (let [attr (some->> (not-empty (select-keys m (into [:db/ident
                                                         :db/cardinality
                                                         :db/valueType
                                                         :db/isComponent
                                                         :db/tupleAttrs
                                                         :db/tupleType
                                                         :db/tupleTypes
                                                         :db/fulltext
                                                         :db/unique
                                                         :mop/classSlots
                                                         :mop/classDirectSlots
                                                         :mop/classDirectSubclasses]
                                                        (map :db/ident)
                                                        *schema*)))
                        (walk/prewalk rdf/unroll-langString)                            
                        (walk/prewalk rdf/box-values)
                        (walk/prewalk rdf/unroll-blank)
                        (walk/prewalk rdf/box-values)
                        (walk/prewalk (fn [form]
                                        (if (and (string? form)
                                                 (>= (count form) 4096))
                                          (subs form 0 4096)
                                          form))))
          ks   [:owl/sameAs :owl/equivalentClass :owl/equivalentDatatype :owl/equivalentProperty
                :schema/sameAs :vs/userdocs :skos/closeMatch :mop/classPrecedenceList
                :skos/historyNote :skos/changeNote]]
      (reduce-kv (fn [attr k v]
                   (if (or (some #(isa? k %) ks)
                           (and (coll? v) (empty? v))
                           (nil? v))
                     (dissoc attr k)
                     attr))
                 attr attr))))

(defmulti infer-datomic-type
  "Tries to infer the Datomic type of a property by looking at its
  declared range unless a type is provided in the RDF model. Defaults
  to :db.type/ref."
  (fn [x] (if (map? x) (mop/type-of x) x)))

(defmulti infer-datomic-cardinality
  "Tries to infer the Datomic cardinality by assuming it is a many
  attribute unless overridden."
  (fn [x] (if (map? x) (mop/type-of x) x)))

(defmulti infer-datomic-unique
  "Tries to infer the Datomic uniqueness. When it returns nothing
  there should be no uniqueness constraint."
  (fn [x] (if (map? x) (mop/type-of x) x)))

(defmethod infer-datomic-cardinality :default
  [_]
  :db.cardinality/many)

(defmethod infer-datomic-unique :default
  [_]
  nil)

(defmethod infer-datomic-type :rdfa/uri [_] :db.type/string)
(defmethod infer-datomic-cardinality :rdfa/uri [_] :db.cardinality/one)
(defmethod infer-datomic-unique :rdfa/uri [_] :db.unique/identity)

(defmethod db/infer-datomic-cardinality :jsonschema/exclusiveMinimum [_] :db.cardinality/one)
(defmethod db/infer-datomic-cardinality :jsonschema/exclusiveMaximum [_] :db.cardinality/one)
(defmethod db/infer-datomic-cardinality :jsonschema/propertyName [_] :db.cardinality/one)
(defmethod db/infer-datomic-cardinality :jsonschema/minimum [_] :db.cardinality/one)
(defmethod db/infer-datomic-cardinality :jsonschema/maximum [_] :db.cardinality/one)
(defmethod db/infer-datomic-cardinality :jsonschema/minItems [_] :db.cardinality/one)
(defmethod db/infer-datomic-cardinality :jsonschema/maxItems [_] :db.cardinality/one)
(defmethod db/infer-datomic-cardinality :jsonschema/minLength [_] :db.cardinality/one)
(defmethod db/infer-datomic-cardinality :jsonschema/maxLength [_] :db.cardinality/one)
(defmethod db/infer-datomic-cardinality :jsonschema/multipleOf [_] :db.cardinality/one)
(defmethod db/infer-datomic-cardinality :jsonschema/readOnly [_] :db.cardinality/one)
(defmethod db/infer-datomic-cardinality :jsonschema/uniqueItems [_] :db.cardinality/one)
(defmethod db/infer-datomic-cardinality :jsonschema/writeOnly [_] :db.cardinality/one)

(defmethod infer-datomic-type :rdf/Property
  [ident]
  (let [{:rdfs/keys   [range]
         :schema/keys [rangeIncludes]
         :db/keys     [valueType]
         :as          e}
        (datafy ident)]
    (or valueType                       ; use explicit type if present
        (some infer-datomic-type
              (concat (when range
                        (if (and (coll? range) (not (map? range)))
                          range
                          [range]))
                      (when rangeIncludes
                        (if (and (coll? rangeIncludes) (not (map? rangeIncludes)))
                          rangeIncludes
                          [rangeIncludes]))))
        :db.type/ref)))

(defmethod infer-datomic-type :rdfs/Datatype
  [ident]
  (let [{:owl/keys [onDatatype]} (datafy ident)]
    (when onDatatype
      (infer-datomic-type onDatatype))))

(defmethod infer-datomic-type :rdfs/Class
  [ident]
  (let [{:owl/keys [unionOf]} (datafy ident)]
    (when unionOf
      (some infer-datomic-type unionOf))))

(defmethod infer-datomic-type :rdfs/Literal [_] :db.type/string)

(prefer-method infer-datomic-type :rdfs/Literal :rdfs/Datatype)

(defmethod infer-datomic-type :rdfa/term [_] :db.type/string)
(defmethod infer-datomic-type :rdfa/prefix [_] :db.type/string)
(defmethod infer-datomic-type :owl/AnnotationProperty [_] :db.type/string)
(defmethod infer-datomic-type :owl/real [_] :db.type/bigdec)
(defmethod infer-datomic-type :xsd/base64Binary [_] :db.type/string)
(defmethod infer-datomic-type :xsd/boolean [_] :db.type/boolean)
(defmethod infer-datomic-type :xsd/byte [_] :db.type/long)
(defmethod infer-datomic-type :xsd/date [_] :db.type/instant)
(defmethod infer-datomic-type :xsd/dateTime [_] :db.type/instant)
(defmethod infer-datomic-type :xsd/dateTimeStamp [_] :db.type/instant)
(defmethod infer-datomic-type :xsd/dayTimeDuration [_] :db.type/string)
(defmethod infer-datomic-type :xsd/decimal [_] :db.type/bigdec)
(defmethod infer-datomic-type :xsd/double [_] :db.type/double)
(defmethod infer-datomic-type :xsd/duration [_] :db.type/string)
(defmethod infer-datomic-type :xsd/float [_] :db.type/float)
(defmethod infer-datomic-type :xsd/gDay [_] :db.type/string)
(defmethod infer-datomic-type :xsd/gMonth [_] :db.type/string)
(defmethod infer-datomic-type :xsd/gMonthDay [_] :db.type/string)
(defmethod infer-datomic-type :xsd/gYear [_] :db.type/string)
(defmethod infer-datomic-type :xsd/gYearMonth [_] :db.type/string)
(defmethod infer-datomic-type :xsd/hexBinary [_] :db.type/string)
(defmethod infer-datomic-type :xsd/int [_] :db.type/long)
(defmethod infer-datomic-type :xsd/integer [_] :db.type/bigint)
(defmethod infer-datomic-type :xsd/language [_] :db.type/string)
(defmethod infer-datomic-type :xsd/length [_] :db.type/long)
(defmethod infer-datomic-type :xsd/long [_] :db.type/long)
(defmethod infer-datomic-type :xsd/negativeInteger [_] :db.type/long)
(defmethod infer-datomic-type :xsd/nonNegativeInteger [_] :db.type/long)
(defmethod infer-datomic-type :xsd/nonPositiveInteger [_] :db.type/long)
(defmethod infer-datomic-type :xsd/normalizedString [_] :db.type/string)
(defmethod infer-datomic-type :xsd/positiveInteger [_] :db.type/long)
(defmethod infer-datomic-type :xsd/short [_] :db.type/long)
(defmethod infer-datomic-type :xsd/string [_] :db.type/string)
(defmethod infer-datomic-type :xsd/time [_] :db.type/instant)
(defmethod infer-datomic-type :xsd/token [_] :db.type/string)
(defmethod infer-datomic-type :xsd/unsignedByte [_] :db.type/long)
(defmethod infer-datomic-type :xsd/unsignedInt [_] :db.type/long)
(defmethod infer-datomic-type :xsd/unsignedLong [_] :db.type/long)
(defmethod infer-datomic-type :xsd/unsignedShort [_] :db.type/long)
(defmethod infer-datomic-type :xsd/yearMonthDuration [_] :db.type/string)
(defmethod infer-datomic-type :schema/Boolean [_] :db.type/boolean)
(defmethod infer-datomic-type :schema/Float [_] :db.type/double)
(defmethod infer-datomic-type :schema/Integer [_] :db.type/long)
(defmethod infer-datomic-type :schema/Text [_] :db.type/string)
(defmethod infer-datomic-type :schema/Date [_] :db.type/instant)
(defmethod infer-datomic-type :schema/DateTime [_] :db.type/instant)
(defmethod infer-datomic-type :schema/Number [_] :db.type/bigdec)
(defmethod infer-datomic-type :schema/Time [_] :db.type/instant)
(defmethod infer-datomic-type :schema/URL [_] :db.type/ref)
(defmethod infer-datomic-type :vs/term_status [_] :db.type/string)
(defmethod infer-datomic-type :dcterms/created [_] :db.type/instant)
(defmethod infer-datomic-type :dc11/creator [_] :db.type/ref)
(defmethod infer-datomic-type :dcterms/creator [_] :db.type/ref)
(defmethod infer-datomic-type :dc11/date [_] :db.type/instant)
(defmethod infer-datomic-type :dc11/description [_] :db.type/string)
(defmethod infer-datomic-type :dc11/title [_] :db.type/string)
(defmethod infer-datomic-type :time/month [_] :db.type/instant)
(defmethod infer-datomic-type :owl/deprecated [_] :db.type/boolean)
(defmethod infer-datomic-type :time/hours [_] :db.type/long)
(defmethod infer-datomic-type :time/minutes [_] :db.type/long)
(defmethod infer-datomic-type :time/weeks [_] :db.type/long)
(defmethod infer-datomic-type :time/days [_] :db.type/long)
(defmethod infer-datomic-type :time/months [_] :db.type/long)
(defmethod infer-datomic-type :time/years [_] :db.type/long)
(defmethod infer-datomic-type :time/seconds [_] :db.type/long)
(defmethod infer-datomic-type :voag/width [_] :db.type/string)
(defmethod infer-datomic-type :voag/height [_] :db.type/string)
(defmethod infer-datomic-type :voag/image [_] :db.type/ref)
(defmethod infer-datomic-type :sh/maxCount [_] :db.type/long)
(defmethod infer-datomic-type :vs/moreinfo [_] :db.type/string)
(defmethod infer-datomic-type :vaem/url [_] :db.type/ref)
(defmethod infer-datomic-type :vaem/acronym [_] :db.type/string)
(defmethod infer-datomic-type :vaem/logo [_] :db.type/ref)
(defmethod infer-datomic-type :voag/url [_] :db.type/ref)
(defmethod infer-datomic-type :org/roleProperty [_] :db.type/ref)
(defmethod infer-datomic-type :d3f/has-link [_] :db.type/ref)
(defmethod infer-datomic-type :d3f/display-order [_] :db.type/long)
(defmethod infer-datomic-type :d3f/display-priority [_] :db.type/long)
(defmethod infer-datomic-type :prov/sharesDefinitionWith [_] :db.type/ref)
(defmethod infer-datomic-type :prov/qualifiedForm [_] :db.type/ref)
(defmethod infer-datomic-type :prov/unqualifiedForm [_] :db.type/ref)
(defmethod infer-datomic-type :gr/displayPosition [_] :db.type/long)
(defmethod infer-datomic-type :d3f/d3fend-annotation [_] :db.type/string)
(defmethod infer-datomic-type :owl/versionInfo [_] :db.type/string)
(defmethod infer-datomic-type :mo/level [_] :db.type/string)
(defmethod infer-datomic-type :prov/component [_] :db.type/string)
(defmethod infer-datomic-type :prov/category [_] :db.type/string)
(defmethod infer-datomic-type :prov/inverse [_] :db.type/string)
(defmethod infer-datomic-type :d3f/release-date [_] :db.type/instant)
(defmethod infer-datomic-type :prov/editorialNote [_] :db.type/string)
(defmethod infer-datomic-type :d3f/d3fend-kb-data-property [_] :db.type/string)
(defmethod infer-datomic-type :lv2.pg/harmonicDegree [_] :db.type/long)
(defmethod infer-datomic-type :lv2.pg/harmonicIndex [_] :db.type/long)
(defmethod infer-datomic-type :lv2/minimum [_] :db.type/long)
(defmethod infer-datomic-type :jsonschema/minimum [_] :db.type/double)
(defmethod infer-datomic-type :jsonschema/maximum [_] :db.type/double)
(defmethod infer-datomic-type :jsonschema/exclusiveMaximum [_] :db.type/double)
(defmethod infer-datomic-type :jsonschema/exclusiveMinimum [_] :db.type/double)
(defmethod infer-datomic-type :jsonschema/multipleOf [_] :db.type/double)
(defmethod infer-datomic-type :keys/mode [_] :db.type/string)
(defmethod infer-datomic-type :vann/example [_] :db.type/ref)
(defmethod infer-datomic-type :vaem/usesNonImportedResource [_] :db.type/ref)
(defmethod infer-datomic-type :rdfs/seeAlso [_] :db.type/ref)
(prefer-method infer-datomic-type :rdfs/seeAlso :owl/AnnotationProperty)
(defmethod infer-datomic-type :vann/usageNote [_] :db.type/string)

(defmethod infer-datomic-type :default
  [x]
  (cond
    (or (isa? x :rdfs/Resource) (map? x))
    nil
    :else (throw (ex-info (str (pr-str x) " was not found. Cannot infer datomic type for unknown RDF properties. Has the RDF namespace containing the property been loaded by the Universal Translator component during system start? Try calling datafy on it in a REPL and once you can datafy the ident and return the metaobject, try again.") {:x x}))))

(defn bootstrap-attributes
  ([]
   (bootstrap-attributes mop/*env* (map identity)))
  ([env]
   (bootstrap-attributes env (map identity)))
  ([env xf]
   (into []
         (comp
           (map first)
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
                     (assoc :db/valueType (infer-datomic-type (:db/ident e)))
                     (nil? (:db/cardinality e))
                     (assoc :db/cardinality (infer-datomic-cardinality (:db/ident e)))
                     (infer-datomic-unique (:db/ident e))
                     (assoc :db/unique (infer-datomic-unique (:db/ident e)))))))
         (xt/q (xt/db env)
               '{:find    [(pull ?e [*])]
                 :in      [$ ?h]
                 :where   [[?e :rdf/type ?t]                          
                           (or [(isa? ?h ?t :rdf/Property)]
                               (and [?e :db/cardinality _]
                                    [?e :db/valueType _]))]
                 :timeout 180000}
               @#'clojure.core/global-hierarchy))))

(defn bootstrap-idents
  ([]
   (bootstrap-idents mop/*env*))
  ([env]   
   (into []
         (comp
           cat
           (map #(hash-map :db/ident %)))
         (xt/q (xt/db env)
               '{:find    [?id]
                 :where   [[?e :db/ident ?id]]
                 :timeout 180000}))))

(defn bootstrap-individuals
  ([]
   (bootstrap-individuals mop/*env*))
  ([env]
   (->> (xt/q (xt/db env)
              '{:find    [?e]
                :in      [$]
                :where   [[?e :rdf/type ?t]]
                :timeout 180000})
        (map first)
        (map datafy)
        (map select-attributes))))

(defn test-bootstrap
  "Tests importing XTDB documents into Datomic."
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
