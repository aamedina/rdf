(ns net.wikipunk.mop.init
  "The Metaobject Initialization Protocol"
  (:require
   [clojure.datafy :refer [datafy]]
   [clojure.set :as set]
   [net.wikipunk.mop :as mop :refer [isa? ancestors descendants parents]]
   [net.wikipunk.rdf :as rdf])
  (:refer-clojure :exclude [isa? ancestors descendants parents]))

(defmethod mop/find-class-using-env :default
  [ident env]
  (rdf/find-metaobject ident))

(defmethod mop/make-instance clojure.lang.Keyword
  [class & {:as initargs}]
  (mop/make-instance (mop/find-class class) initargs))

(defmethod mop/make-instance :rdfs/Class
  [class & {:as initargs}]
  (when-not (mop/class-finalized? class)
    (mop/finalize-inheritance class))
  (let [initargs (merge (mop/class-default-initargs class) initargs)
        instance (mop/allocate-instance class initargs)]
    (mop/initialize-instance instance initargs)
    instance))

(defmethod mop/initialize-instance :default
  [instance & {:as initargs}]
  (mop/shared-initialize instance true initargs))

(defmethod mop/reinitialize-instance :default
  [instance & {:as initargs}]
  (let [class (mop/class-of instance)]
    (mop/shared-initialize instance nil initargs)
    instance))

(defmethod mop/update-instance-for-different-class [Object Object]
  [previous current & {:as initargs}]
  (let [current-slots       (mop/class-slots (mop/class-of current))
        previous-slot-names (map mop/slot-definition-name
                                 (mop/class-slots (mop/class-of previous)))
        added-slots         (reduce (fn [added-slots slot]
                                      (let [n (mop/slot-definition-name slot)]
                                        (if (and (not (contains? previous-slot-names n))
                                                 (identical? (mop/slot-definition-allocation slot) :instance))
                                          (conj added-slots n)
                                          added-slots)))
                                    []
                                    current-slots)]
    
    (mop/shared-initialize current added-slots initargs)))

(defmethod mop/update-instance-for-redefined-class Object
  [instance added-slots discarded-slots property-list & {:as initargs}]
  (mop/shared-initialize instance added-slots initargs))

(defn alter-instance
  [instance f & args]
  (cond
    (instance? clojure.lang.Ref instance)
    (dosync
      (apply alter instance f args))
    
    (instance? clojure.lang.Atom instance)
    (apply swap! instance f args)

    (instance? clojure.lang.Agent instance)
    (apply send instance f args)

    (instance? clojure.lang.Namespace instance)
    (apply alter-meta! instance f args)

    (instance? clojure.lang.Var instance)
    (apply alter-var-root instance f args)

    :else (when-some [var (:var (meta instance))]
            (apply alter-instance var f args))))

(defmethod mop/shared-initialize :rdfs/Class
  [instance slot-names & {:as initargs}]
  (let [class      (mop/class-of instance)
        all-slots  (mop/class-slots class)
        init-slots (cond
                     (true? slot-names)
                     all-slots

                     (nil? slot-names)
                     nil

                     :else (filter #((set slot-names) (:db/ident %)) all-slots))]
    (doseq [[initarg initform] initargs
            :when              initarg
            :when              (not (some #(= (:db/ident %) initarg) init-slots))]
      (mop/slot-missing class instance initarg))
    (alter-instance instance
                    (fn [obj]
                      (reduce
                        (fn [obj effective-slot]
                          (if-some [v (get initargs (:db/ident effective-slot))]
                            (assoc obj (:db/ident effective-slot) v)
                            obj))
                        initargs
                        init-slots)))
    instance))

(defmethod mop/allocate-instance :rdfs/Class
  [class & {:as initargs}]
  (when-not (mop/class-finalized? class)
    (mop/finalize-inheritance class))
  (ref {} :meta {:type (:db/ident class)}))

(defmethod mop/slot-value-using-class [:rdfs/Class :rdf/Property]
  [class object slot]
  (get @object (:db/ident slot)))

(defmethod mop/slot-bound-using-class? [:rdfs/Class :rdf/Property]
  [class object slot]
  (contains? @object (:db/ident slot)))

(defmethod mop/slot-makunbound-using-class [:rdfs/Class :rdf/Property]
  [class object slot]
  (alter-instance object dissoc (:db/ident slot)))

(defmethod mop/slot-missing :default
  [class object slot-name & {:as info-map}]
  (throw (ex-info (format "The slot %s is missing from the object %s." slot-name (pr-str object))
                  (merge {:class     class
                          :object    object
                          :slot-name slot-name}
                         info-map))))

(defmethod mop/slot-unbound :default
  [class object slot-name]
  (throw (ex-info (format "The slot %s is unbound in the object %s." slot-name (pr-str object))
                  {:class     class
                   :object    object
                   :slot-name slot-name})))

(defmethod mop/class-finalized? :rdfs/Class
  [class]
  (boolean (:mop/class-precedence-list class)))

(defmethod mop/class-prototype :rdfs/Class
  [class]  
  (or (:mop/class-prototype (meta class))
      (alter-instance (:var (meta (meta class))) assoc :mop/class-prototype (mop/allocate-instance class))))

(defmethod mop/class-direct-default-initargs :rdfs/Class
  [class]
  (:mop/class-direct-default-initargs class {}))

(defmethod mop/class-direct-slots :rdfs/Class
  [class]
  (not-empty (:mop/class-direct-slots class)))

(defmethod mop/class-default-initargs :rdfs/Class
  [class]
  (:mop/class-default-initargs class {}))

(defmethod mop/class-slots :rdfs/Class
  [class]
  (:mop/class-slots class []))

(defmethod mop/add-direct-subclass [:rdfs/Class :rdfs/Class]
  [superclass subclass]
  (alter-instance superclass update :mop/class-direct-subclasses (fnil conj #{}) subclass))

(defmethod mop/remove-direct-subclass [:rdfs/Class :rdfs/Class]
  [superclass subclass]
  (alter-instance superclass update :mop/class-direct-subclasses (fnil disj #{}) subclass))

(defmethod mop/ensure-class-using-class nil
  [class class-name & {:keys [direct-default-initargs
                              direct-slots
                              direct-superclasses
                              metaclass]
                       :as   initargs}]
  (let [instance (mop/make-instance metaclass (dissoc initargs
                                                      :direct-default-initargs
                                                      :direct-slots
                                                      :direct-superclasses
                                                      :metaclass))]
    (intern *ns* (with-meta class-name {:initargs initargs}) instance)))

(defmethod mop/ensure-class-using-class :rdfs/Class
  [class class-name & {:keys [direct-default-initargs
                              direct-slots
                              direct-superclasses
                              metaclass]
                       :as   initargs}]
  (when-not (identical? (mop/class-of class) metaclass)
    (mop/change-class class metaclass))
  (intern *ns*
          (with-meta class-name {:initargs initargs})
          (mop/reinitialize-instance class (dissoc initargs
                                                   :direct-default-initargs
                                                   :direct-slots
                                                   :direct-superclasses
                                                   :metaclass))))

(defmethod mop/finalize-inheritance nil
  [class]
  nil)

(defmethod mop/finalize-inheritance clojure.lang.Keyword
  [class]
  (some-> (mop/find-class class) (mop/finalize-inheritance)))

(defmethod mop/finalize-inheritance :rdfs/Class
  [class]
  (let [{:keys [ns name]} (meta (:var (meta class)))
        class             (assoc class
                                 :mop/class-direct-slots                                 
                                 (get-in @(requiring-resolve 'net.wikipunk.rdf/*indexes*)
                                         [:slots/by-domain (:db/ident class)] []))
        direct-slots      (:mop/class-direct-slots class)
        class             (assoc class
                                 :mop/class-direct-default-initargs
                                 (let [d (filter :sh/defaultValue direct-slots)]
                                   (zipmap (map :db/ident d)
                                           (map :sh/defaultValue d))))
        class             (assoc class
                                 :mop/class-precedence-list
                                 (mop/compute-class-precedence-list class))
        class             (assoc class
                                 :mop/class-slots
                                 (mop/compute-slots class))
        class             (assoc class
                                 :mop/class-default-initargs
                                 (mop/compute-default-initargs class))]
    (intern ns name class)))

(defmethod mop/compute-default-initargs :rdfs/Class
  [{:mop/keys [class-precedence-list
               class-direct-default-initargs]}]
  (reduce into
          class-direct-default-initargs
          (map mop/class-direct-default-initargs
               (keep mop/find-class (rest class-precedence-list)))))

(defmethod mop/compute-slots :rdfs/Class
  [{:mop/keys [class-precedence-list
               class-direct-slots]
    :db/keys  [ident]
    :as       class}]
  (if (contains? #{:owl/Class
                   :rdfs/Class
                   :owl/Thing
                   :owl/NamedIndividual}
                 ident)
    class-direct-slots
    (transduce
      (comp
        (keep mop/find-class)
        (map mop/class-direct-slots)
        (mapcat (fn [dslots]
                  (sort-by :db/ident
                           isa?
                           (remove #(some #{:owl/Class
                                            :rdfs/Class
                                            :owl/Thing
                                            :owl/NamedIndividual}
                                          (:rdfs/domain %))
                                   dslots)))))
      (completing
        (fn [effective-slots slot]
          (if (some #(identical? (:db/ident slot)
                                 (:db/ident %))
                    effective-slots)
            effective-slots
            (conj effective-slots
                  (mop/compute-effective-slot-definition class
                                                         slot
                                                         class-direct-slots)))))
      class-direct-slots
      class-precedence-list)))

(defmethod mop/slot-definition-initfunction clojure.lang.Keyword
  [slot]
  (mop/slot-definition-initfunction (mop/find-class slot)))

(defmethod mop/slot-definition-initfunction :rdfs/Class
  [slot]
  (:mop/slot-initfunction slot (constantly nil)))

(defmethod mop/slot-definition-name :rdfs/Class
  [slot]
  (:db/ident slot))

(defmethod mop/slot-definition-initargs :rdfs/Class
  [class]
  (:mop/slot-initargs class #{}))

(defmethod mop/slot-definition-initform :rdfs/Class
  [class]
  (:mop/slot-initform class))

(defmethod mop/slot-definition-allocation :rdfs/Class
  [class]
  (:mop/slot-allocation class :mop/instance))

(defmethod mop/slot-definition-type :rdfs/Class
  [class]
  (:rdfs/range class))

(defmethod mop/compute-effective-slot-definition :rdfs/Class
  [class slot direct-slot-definitions]
  (reduce (fn [effective-slot-def direct-slot-def]
            (cond-> (-> effective-slot-def
                        (update :mop/slot-initargs
                                (fnil into #{})
                                (mop/slot-definition-initargs direct-slot-def)))
              (nil? (:db/ident effective-slot-def))
              (assoc :db/ident (mop/slot-definition-name direct-slot-def))

              (nil? (:mop/slot-initform effective-slot-def))
              (assoc :mop/slot-initform (mop/slot-definition-initform direct-slot-def)
                     :mop/slot-initfunction (mop/slot-definition-initfunction direct-slot-def))

              (nil? (:mop/slot-allocation effective-slot-def))
              (assoc :mop/slot-allocation (mop/slot-definition-allocation direct-slot-def))))
          slot
          direct-slot-definitions))

(def T (mop/find-class :rdfs/Class))

(defmethod mop/validate-superclass [:rdfs/Class :rdfs/Class]
  [class superclass]
  (or (identical? superclass T)
      (identical? (mop/class-of class) (mop/class-of superclass))))

(defmethod mop/make-instances-obsolete :rdfs/Class
  [class]
  (throw (ex-info "make-instances-obsolete is unimplemented." {:class class})))

(defmethod mop/change-class [Object :rdfs/Class]
  [instance new-class & {:as initargs}]
  (let [old-class (mop/class-of instance)
        copy      @instance
        guts      (mop/allocate-instance new-class)
        old-slots (keys copy)
        new-slots (keys @guts)]
    (alter-instance instance merge-with (fn [a b] a) @guts)
    (mop/update-instance-for-different-class copy instance initargs)
    instance))

(defmethod mop/change-class [Object clojure.lang.Keyword]
  [instance new-class & {:as initargs}]
  (mop/change-class instance (mop/find-class new-class) initargs))

(defmethod mop/add-dependent :rdfs/Class
  [metaobject dependent]
  (alter-instance metaobject update :mop/dependents (fnil conj #{}) dependent))

(defmethod mop/remove-dependent :rdfs/Class
  [metaobject dependent]
  (alter-instance metaobject update :mop/dependents (fnil disj #{}) dependent))

(defmethod mop/map-dependents :rdfs/Class
  [metaobject f]
  (map f (:mop/dependents metaobject)))

(defmethod mop/compute-class-precedence-list :rdfs/Class
  [{:db/keys [ident]}]
  (into [ident] (sort isa? (disj (ancestors ident)
                                 :sh/NodeShape
                                 :sh/Shape
                                 :owl/Thing
                                 :oboInOwl/ObsoleteClass
                                 :oboInOwl/ObsoleteProperty
                                 :schema/Thing
                                 :rdfs/Resource))))

(defmethod mop/compute-class-precedence-list clojure.lang.Keyword
  [class]
  (mop/compute-class-precedence-list (mop/find-class class)))

(defmethod mop/make-instances-obsolete clojure.lang.Keyword
  [class]
  (mop/make-instances-obsolete (mop/find-class class)))

(defmethod mop/class-direct-default-initargs clojure.lang.Keyword
  [class]
  (mop/class-direct-default-initargs (mop/find-class class)))

(defmethod mop/class-direct-slots clojure.lang.Keyword
  [class]
  (mop/class-direct-slots (mop/find-class class)))

(defmethod mop/class-default-initargs clojure.lang.Keyword
  [class]
  (mop/class-default-initargs (mop/find-class class)))

(defmethod mop/compute-slots clojure.lang.Keyword
  [class]
  (mop/compute-slots (mop/find-class class)))

(defmethod mop/class-slots clojure.lang.Keyword
  [class]
  (mop/class-slots (mop/find-class class)))
