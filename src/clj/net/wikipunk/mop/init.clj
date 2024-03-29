(ns net.wikipunk.mop.init
  "The Metaobject Initialization Protocol"
  (:require
   [clojure.datafy :refer [datafy]]
   [clojure.set :as set]
   [clojure.string :as str]
   [clojure.walk :as walk]
   [net.wikipunk.mop :as mop]
   [net.wikipunk.rdf :as rdf]
   [net.wikipunk.boot]
   [net.wikipunk.ext]))

(defmethod mop/find-class-using-env :default
  [ident env]
  (when (qualified-keyword? ident)
    (mop/find-class-using-env ident nil)))

(defmethod mop/make-instance :rdfs/Class
  [class & {:as initargs}]
  (when-not (mop/class-finalized? class)
    (mop/finalize-inheritance class))
  (let [initargs (merge (mop/class-default-initargs class) initargs)
        instance (mop/allocate-instance class initargs)]
    (mop/initialize-instance instance initargs)))

(defmethod mop/initialize-instance :default
  [instance & {:as initargs}]
  (mop/shared-initialize instance true initargs))

(defmethod mop/reinitialize-instance :default
  [instance & {:as initargs}]
  (let [class (mop/class-of instance)]
    (mop/shared-initialize instance nil initargs)))

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
                                    #{}
                                    current-slots)]
    
    (mop/shared-initialize current added-slots initargs)))

(defmethod mop/update-instance-for-redefined-class Object
  [instance added-slots discarded-slots property-list & {:as initargs}]
  (mop/shared-initialize instance added-slots initargs))

(defmethod mop/shared-initialize :rdfs/Class
  [instance slot-names & {:as initargs}]
  (let [class      (mop/class-of instance)
        all-slots  (mop/class-slots class)
        init-slots (cond
                     (true? slot-names)
                     all-slots

                     (nil? slot-names)
                     nil

                     :else (filter (set slot-names) all-slots))]
    (doseq [[initarg initform] initargs
            :when              initarg
            :when              (not (some #(= % initarg) init-slots))]
      (mop/slot-missing class instance initarg))
    (reduce
      (fn [obj effective-slot]
        (if-some [v (get initargs effective-slot)]
          (assoc obj effective-slot v)
          obj))
      instance
      init-slots)))

(defmethod mop/allocate-instance :rdfs/Class
  [class & {:as initargs}]
  (when-not (mop/class-finalized? class)
    (mop/finalize-inheritance class))
  (assoc initargs :rdf/type (:db/ident class)))

(defmethod mop/slot-value-using-class [:rdfs/Class :rdf/Property]
  [class object slot]
  (get object (:db/ident slot)))

(defmethod mop/slot-bound-using-class? [:rdfs/Class :rdf/Property]
  [class object slot]
  (contains? object (:db/ident slot)))

(defmethod mop/slot-makunbound-using-class [:rdfs/Class :rdf/Property]
  [class object slot]
  (dissoc object (:db/ident slot)))

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
  (boolean (:mop/classPrecedenceList class)))

(defmethod mop/class-prototype :rdfs/Class
  [class]  
  (or (:mop/classPrototype (meta class))
      (mop/allocate-instance class)))

(defmethod mop/class-precedence-list :rdfs/Class
  [class]
  (:mop/classPrecedenceList class (mop/compute-class-precedence-list class)))

(defmethod mop/class-direct-default-initargs :rdfs/Class
  [class]
  (:mop/classDirectDefaultInitargs class {}))

(defmethod mop/class-direct-default-initargs :default
  [class]
  nil)

(defmethod mop/class-direct-slots clojure.lang.IPersistentMap
  [class]
  nil)

(defmethod mop/class-direct-slots :owl/Restriction
  [{:owl/keys [onProperty
               minCardinality
               maxCardinality
               allValuesFrom
               someValuesFrom]
    :as       class}]
  (when (keyword? onProperty)
    #{onProperty})
  #_[(cond-> {:db/ident onProperty}
       allValuesFrom  (update :rdfs/range (fnil conj #{}) allValuesFrom)
       someValuesFrom (update :rdfs/range (fnil conj #{}) someValuesFrom)
       minCardinality (assoc :owl/minCardinality minCardinality)
       maxCardinality (assoc :owl/maxCardinality maxCardinality))])

;; To determine the direct slots of an :rdfs/Class:

;; 1. When the Universal Translator is started it assembles some
;; multimethod hierarchies of RDF metaobjects. The :rdfs/domain
;; hierarchy relates all properties that declare classes in either
;; :rdfs/domain or :schema/domainIncludes.

(defmethod mop/class-direct-slots :rdfs/Class
  [{:db/keys   [ident]
    :mop/keys  [classDirectSlots]
    :rdfs/keys [subClassOf]
    :owl/keys  [intersectionOf unionOf]
    :rdf/keys  [type]
    :as        class}]
  (or (not-empty classDirectSlots)
      (not-empty (set/union (descendants (:rdfs/domain rdf/*metaobjects*) ident)
                            (reduce set/union (map mop/class-direct-slots intersectionOf))
                            (reduce set/union (map mop/class-direct-slots unionOf))
                            (when (and (coll? subClassOf) (not (map? subClassOf)))
                              (reduce set/union (map mop/class-direct-slots (remove keyword? subClassOf))))
                            (when (and (coll? type) (not (map? type)))
                              (reduce set/union (map mop/class-direct-slots (remove keyword? type))))))))

(defmethod mop/class-default-initargs :rdfs/Class
  [class]
  (:mop/classDefaultInitargs class {}))

#_(defmethod mop/class-slots :owl/NamedIndividual
  [{:db/keys   [ident]
    :rdfs/keys [subClassOf]
    :owl/keys  [intersectionOf unionOf]
    :as        class}])

(defmethod mop/class-slots :rdfs/Class
  [{:mop/keys [classSlots] :as class}]
  (if (seq classSlots)
    (set classSlots)
    (mop/compute-slots class)))

(defmethod mop/add-direct-subclass [:rdfs/Class :rdfs/Class]
  [superclass subclass]
  (throw (ex-info "mop/add-direct-subclass is not implemented" {:superclass superclass
                                                                :subclass   subclass})))

(defmethod mop/remove-direct-subclass [:rdfs/Class :rdfs/Class]
  [superclass subclass]
  (throw (ex-info "mop/remove-direct-subclass is not implemented" {:superclass superclass
                                                                   :subclass   subclass})))

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
    (mop/intern-class-using-env instance mop/*env*)))

(defmethod mop/ensure-class-using-class :rdfs/Class
  [class class-name & {:keys [direct-default-initargs
                              direct-slots
                              direct-superclasses
                              metaclass]
                       :as   initargs}]
  (when-not (identical? (mop/class-of class) metaclass)
    (mop/change-class class metaclass))
  (mop/intern-class-using-env (mop/reinitialize-instance class (dissoc initargs
                                                                       :direct-default-initargs
                                                                       :direct-slots
                                                                       :direct-superclasses
                                                                       :metaclass))
                              mop/*env*))

(defmethod mop/finalize-inheritance :rdfs/Class
  [class]
  (let [subs   (mop/class-direct-subclasses class)
        class  (if (seq subs) (assoc class :mop/classDirectSubclasses subs) class)
        supers (mop/class-direct-superclasses class)
        class  (if (seq subs) (assoc class :mop/classDirectSuperclasses supers) class)
        cpl    (mop/compute-class-precedence-list class)
        class  (assoc class :mop/classPrecedenceList cpl)
        cds    (mop/class-direct-slots class)
        class  (if (seq cds) (assoc class :mop/classDirectSlots cds) class)]
    (mop/intern-class-using-env class mop/*env*)))

(defmethod mop/intern-class-using-env [:rdfs/Class nil]
  [class env]
  class)

(defmethod mop/compute-default-initargs :rdfs/Class
  [{:mop/keys [classPrecedenceList
               classDirectDefaultInitargs]}]
  (reduce into
          classDirectDefaultInitargs
          (map mop/class-direct-default-initargs
               (keep mop/find-class (rest classPrecedenceList)))))

;; To compute all slots for a class:

;; 1. Compute the direct slots for each class in its class-precedence-list.
;; 2. Combine all of the slots into a single set.

(defmethod mop/compute-slots :rdfs/Class
  [{:mop/keys  [classPrecedenceList
                classDirectSlots]
    :db/keys   [ident]
    :rdf/keys  [type]
    :rdfs/keys [subClassOf]
    :owl/keys  [deprecated equivalentClass]
    :as        class}]
  (case ident
    :rdfs/Class
    (mop/class-direct-slots :rdfs/Class)

    :owl/Class
    (set/union (mop/class-direct-slots :rdfs/Class)
               (mop/class-direct-slots :owl/Class))

    (:sh/Shape :sh/NodeShape)
    (mop/class-direct-slots :sh/Shape)

    (->> (mop/compute-class-precedence-list class) ;; compute the class precedence list
         ;; remove metaclasses from the list
         (take-while (complement #{:owl/Class :rdfs/Class :sh/Shape :sh/NodeShape}))
         (map mop/class-direct-slots) ;; get the direct slots of each class
         (reduce set/union) ;; combine them into a single set
         )))

(defmethod mop/slot-definition-initfunction :rdfs/Class
  [slot]
  (:mop/slotInitfunction slot nil))

(defmethod mop/slot-definition-name :rdfs/Class
  [slot]
  (:db/ident slot))

(defmethod mop/slot-definition-initargs :rdfs/Class
  [class]
  (:mop/slotInitargs class #{}))

(defmethod mop/slot-definition-initform :rdfs/Class
  [class]
  (:mop/slotInitform class))

(defmethod mop/slot-definition-allocation :rdfs/Class
  [class]
  (:mop/slotAllocation class :mop/instance))

(defmethod mop/slot-definition-type :rdfs/Class
  [class]
  (:rdfs/range class))

(defmethod mop/compute-effective-slot-definition :rdfs/Class
  [class slot direct-slot-definitions]
  ;; Should this be rethought completely since RDF has no conflicting
  ;; slot names? It does have inheritance of property
  ;; semantics. Should effective slot definitions incorporate all of
  ;; that computed property precedence information? Probably? I think
  ;; so...?
  (reduce merge direct-slot-definitions))

(defmethod mop/validate-superclass [:rdfs/Class :rdfs/Class]
  [class superclass]
  (or (identical? (:db/ident superclass) :rdfs/Class)
      (identical? (mop/class-of class) (mop/class-of superclass))))

(defmethod mop/make-instances-obsolete :rdfs/Class
  [class]
  (throw (ex-info "make-instances-obsolete is unimplemented." {:class class})))

(defmethod mop/change-class [Object :rdfs/Class]
  [instance new-class & {:as initargs}]
  (let [old-class (mop/class-of instance)
        guts      (mop/allocate-instance new-class)
        old-slots (keys instance)
        new-slots (keys guts)]
    (mop/update-instance-for-different-class instance (merge-with (fn [a b] a) instance guts) initargs)))

(defmethod mop/change-class [Object clojure.lang.Keyword]
  [instance new-class & {:as initargs}]
  (mop/change-class instance (mop/find-class new-class) initargs))

(defmethod mop/add-dependent :rdfs/Class
  [metaobject dependent]
  (update metaobject :mop/dependents (fnil conj #{}) dependent))

(defmethod mop/remove-dependent :rdfs/Class
  [metaobject dependent]
  (update metaobject :mop/dependents (fnil disj #{}) dependent))

(defmethod mop/map-dependents :rdfs/Class
  [metaobject f]
  (map f (:mop/dependents metaobject)))

(def ^:dynamic *metaclasses*
  "a set of metaclasses that are removed from the class precedence list"
  #{:owl/Thing
    :owl/NamedIndividual
    :oboInOwl/ObsoleteClass
    :oboInOwl/ObsoleteProperty
    :rdfs/Resource})

(defmethod mop/compute-class-precedence-list :rdfs/Class
  [{:db/keys [ident]}]
  (letfn [(compute-cpl [cls]
            (let [parents (mop/class-direct-superclasses cls)]
              (if (empty? parents)
                [cls]
                (into [cls] (sort isa? (distinct (mapcat compute-cpl parents)))))))]
    (let [cpl (->> (compute-cpl ident)
                   (remove *metaclasses*)
                   (distinct)
                   (sort isa?)
                   (into []))]
      (cond
        (and (isa? ident :owl/Class)
             (not (identical? ident :owl/Class)))
        (conj cpl :owl/Class)

        (and (isa? ident :owl/NamedIndividual)
             (not (identical? ident :owl/NamedIndividual)))
        (conj cpl :owl/NamedIndividual)

        (not (identical? ident :rdfs/Class))
        (conj cpl :rdfs/Class)

        :else cpl))))

(defmethod mop/compute-class-precedence-list :rdf/Property
  [{:db/keys [ident]}]
  (letfn [(compute-cpl [prop]
            (let [supers (:rdfs/subPropertyOf (mop/find-class prop))
                  parents (when supers
                            (if (coll? supers)
                              supers
                              #{supers}))]
              (if (empty? parents)
                [prop]
                (into [prop] (sort isa? (distinct (mapcat compute-cpl parents)))))))]
    (vec (sort isa? (distinct (compute-cpl ident))))))

(defmethod mop/class-direct-superclasses :rdfs/Class
  [{:rdfs/keys [subClassOf]
    :mop/keys  [classDirectSuperclasses]}]
  (or classDirectSuperclasses
      (->> (if (and (coll? subClassOf) (not (map? subClassOf)))
             subClassOf
             [subClassOf])
           (filter keyword?)
           ;; Everything is an :rdfs/Resource in this protocol and we are
           ;; not concerned with tautological inferences.
           (remove #{:rdfs/Resource})
           (into #{}))))

(defmethod mop/class-direct-subclasses :rdfs/Class
  [{:db/keys  [ident]
    :mop/keys [classDirectSubclasses]}]
  (or classDirectSubclasses
      (into #{}
            (comp
              (map datafy)
              (filter (fn [{:rdfs/keys [subClassOf]}]
                        (if (set? subClassOf)
                          (contains? subClassOf ident)
                          (identical? subClassOf ident))))
              (keep :db/ident))
            (descendants (:rdfs/Class rdf/*metaobjects*) ident))))

(defmethod mop/compute-class-precedence-list :default
  [_]
  nil)

(defmethod mop/add-dependent clojure.lang.Keyword
  [metaobject dependent]
  (some-> (mop/find-class metaobject)
          (mop/add-dependent dependent)))

(defmethod mop/add-direct-subclass [clojure.lang.Keyword clojure.lang.Keyword]
  [superclass subclass]
  (some-> (mop/find-class superclass)
          (mop/add-direct-subclass (mop/find-class subclass))))

(defmethod mop/allocate-instance clojure.lang.Keyword
  [class & {:as initargs}]
  (some-> (mop/find-class class)
          (mop/allocate-instance initargs)))

#_(defmethod mop/change-class clojure.lang.Keyword
    [instance new-class & {:as initargs}]
    (some-> (mop/find-class instance)
            (mop/change-class new-class initargs)))

(defmethod mop/class-default-initargs clojure.lang.Keyword
  [class]
  (some-> (mop/find-class class)
          (mop/class-default-initargs)))

(defmethod mop/class-direct-default-initargs clojure.lang.Keyword
  [class]
  (some-> (mop/find-class class)
          (mop/class-direct-default-initargs)))

(defmethod mop/class-direct-slots clojure.lang.Keyword
  [class]
  (some-> (mop/find-class class)
          (mop/class-direct-slots)))

(defmethod mop/class-direct-subclasses clojure.lang.Keyword
  [class]
  (some-> (mop/find-class class)
          (mop/class-direct-subclasses)))

(defmethod mop/class-direct-superclasses clojure.lang.Keyword
  [class]
  (some-> (mop/find-class class)
          (mop/class-direct-superclasses)))

(defmethod mop/class-finalized? clojure.lang.Keyword
  [class]
  (some-> (mop/find-class class)
          (mop/class-finalized?)))

(defmethod mop/class-name clojure.lang.Keyword
  [class]
  (some-> (mop/find-class class)
          (mop/class-name)))

(defmethod mop/class-precedence-list clojure.lang.Keyword
  [class]
  (some-> (mop/find-class class)
          (mop/class-precedence-list)))

(defmethod mop/class-prototype clojure.lang.Keyword
  [class]
  (some-> (mop/find-class class)
          (mop/class-prototype)))

(defmethod mop/class-slots clojure.lang.Keyword
  [class]
  (some-> (mop/find-class class)
          (mop/class-slots)))

(defmethod mop/compute-class-precedence-list clojure.lang.Keyword
  [class]
  (some-> (mop/find-class class)
          (mop/compute-class-precedence-list)))

(defmethod mop/compute-default-initargs clojure.lang.Keyword
  [class]
  (some-> (mop/find-class class)
          (mop/compute-default-initargs)))

(defmethod mop/compute-effective-slot-definition clojure.lang.Keyword
  [class slot direct-slot-definitions]
  (some-> (mop/find-class class)
          (mop/compute-effective-slot-definition slot direct-slot-definitions)))

(defmethod mop/compute-slots clojure.lang.Keyword
  [class]
  (some-> (mop/find-class class)
          (mop/compute-slots)))

(defmethod mop/direct-slot-definition-class clojure.lang.Keyword
  [class & {:as initargs}]
  (some-> (mop/find-class class)
          (mop/direct-slot-definition-class initargs)))

(defmethod mop/effective-slot-definition-class clojure.lang.Keyword
  [class & {:as initargs}]
  (some-> (mop/find-class class)
          (mop/effective-slot-definition-class initargs)))

(defmethod mop/ensure-class-using-class clojure.lang.Keyword
  [class class-name &
   {:keys [direct-default-initargs direct-slots direct-superclasses name
           metaclass],
    :as   initargs}]
  (some-> (mop/find-class class)
          (mop/ensure-class-using-class class-name initargs)))

(defmethod mop/finalize-inheritance clojure.lang.Keyword
  [class]
  (some-> (mop/find-class class)
          (mop/finalize-inheritance)))

(defmethod mop/initialize-instance clojure.lang.Keyword
  [instance & {:as initargs}]
  (some-> (mop/find-class instance)
          (mop/initialize-instance initargs)))

(defmethod mop/make-instance clojure.lang.Keyword
  [class & {:as initargs}]
  (some-> (mop/find-class class)
          (mop/make-instance initargs)))

(defmethod mop/make-instances-obsolete clojure.lang.Keyword
  [class]
  (some-> (mop/find-class class)
          (mop/make-instances-obsolete)))

(defmethod mop/map-dependents clojure.lang.Keyword
  [f metaobject]
  (some-> (mop/find-class f)
          (mop/map-dependents metaobject)))

(defmethod mop/reinitialize-instance clojure.lang.Keyword
  [instance & {:as initargs}]
  (some-> (mop/find-class instance)
          (mop/reinitialize-instance initargs)))

(defmethod mop/remove-dependent clojure.lang.Keyword
  [metaobject dependent]
  (some-> (mop/find-class metaobject)
          (mop/remove-dependent dependent)))

(defmethod mop/remove-direct-subclass [clojure.lang.Keyword clojure.lang.Keyword]
  [superclass subclass]
  (some-> (mop/find-class superclass)
          (mop/remove-direct-subclass (mop/find-class subclass))))

(defmethod mop/set-slot-value-using-class clojure.lang.Keyword
  [class object slot new-value]
  (some-> (mop/find-class class)
          (mop/set-slot-value-using-class object slot new-value)))

(defmethod mop/shared-initialize clojure.lang.Keyword
  [instance slot-names & {:as initargs}]
  (some-> (mop/find-class instance)
          (mop/shared-initialize slot-names initargs)))

(defmethod mop/slot-bound-using-class? clojure.lang.Keyword
  [class object slot]
  (some-> (mop/find-class class)
          (mop/slot-bound-using-class? object slot)))

(defmethod mop/slot-definition-allocation clojure.lang.Keyword
  [slot]
  (some-> (mop/find-class slot)
          (mop/slot-definition-allocation)))

(defmethod mop/slot-definition-initargs clojure.lang.Keyword
  [slot]
  (some-> (mop/find-class slot)
          (mop/slot-definition-initargs)))

(defmethod mop/slot-definition-initform clojure.lang.Keyword
  [slot]
  (some-> (mop/find-class slot)
          (mop/slot-definition-initform)))

(defmethod mop/slot-definition-initfunction clojure.lang.Keyword
  [slot]
  (some-> (mop/find-class slot)
          (mop/slot-definition-initfunction)))

(defmethod mop/slot-definition-location clojure.lang.Keyword
  [slot]
  (some-> (mop/find-class slot)
          (mop/slot-definition-location)))

(defmethod mop/slot-definition-name clojure.lang.Keyword
  [slot]
  (some-> (mop/find-class slot)
          (mop/slot-definition-name)))

(defmethod mop/slot-definition-readers clojure.lang.Keyword
  [slot]
  (some-> (mop/find-class slot)
          (mop/slot-definition-readers)))

(defmethod mop/slot-definition-type clojure.lang.Keyword
  [slot]
  (some-> (mop/find-class slot)
          (mop/slot-definition-type)))

(defmethod mop/slot-definition-writers clojure.lang.Keyword
  [slot]
  (some-> (mop/find-class slot)
          (mop/slot-definition-writers)))

(defmethod mop/slot-exists-using-class? clojure.lang.Keyword
  [class object slot-def]
  (some-> (mop/find-class class)
          (mop/slot-exists-using-class? object slot-def)))

(defmethod mop/slot-makunbound-using-class clojure.lang.Keyword
  [class instance slot-def]
  (some-> (mop/find-class class)
          (mop/slot-makunbound-using-class instance slot-def)))

(defmethod mop/slot-missing clojure.lang.Keyword
  [class object slot-name & {:as info}]
  (some-> (mop/find-class class)
          (mop/slot-missing object slot-name info)))

(defmethod mop/slot-unbound clojure.lang.Keyword
  [class object slot-name]
  (some-> (mop/find-class class)
          (mop/slot-unbound object slot-name)))

(defmethod mop/slot-value-using-class clojure.lang.Keyword
  [class object slot]
  (some-> (mop/find-class class)
          (mop/slot-value-using-class object slot)))

(defmethod mop/sniff clojure.lang.Keyword
  [x]
  (some-> (mop/find-class x)
          (mop/sniff)))

(defmethod mop/update-dependent clojure.lang.Keyword
  [class object slot-def]
  (some-> (mop/find-class class)
          (mop/update-dependent object slot-def)))

(defmethod mop/update-instance-for-different-class clojure.lang.Keyword
  [previous current & {:as initargs}]
  (some-> (mop/find-class previous)
          (mop/update-instance-for-different-class current initargs)))

(defmethod mop/update-instance-for-redefined-class clojure.lang.Keyword
  [instance added-slots discarded-slots property-list & {:as initargs}]
  (some-> (mop/find-class instance)
          (mop/update-instance-for-redefined-class added-slots
                                                   discarded-slots
                                                   property-list
                                                   initargs)))

(defmethod mop/validate-superclass clojure.lang.Keyword
  [class superclass]
  (some-> (mop/find-class class)
          (mop/validate-superclass superclass)))


