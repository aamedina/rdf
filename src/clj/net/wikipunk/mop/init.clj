(ns net.wikipunk.mop.init
  "The Metaobject Initialization Protocol"
  (:require
   [xtdb.api :as xt]
   [clojure.datafy :refer [datafy]]
   [clojure.set :as set]
   [clojure.string :as str]
   [clojure.walk :as walk]
   [net.wikipunk.mop :as mop :refer [isa? ancestors descendants parents]]
   [net.wikipunk.rdf :as rdf]
   [net.wikipunk.boot]
   [net.wikipunk.ext]
   [taoensso.nippy :as nippy])
  (:refer-clojure :exclude [isa? ancestors descendants parents]))

(defmethod mop/find-class-using-env :default
  [ident env]
  (rdf/find-ns-metaobject ident))

(defmethod mop/find-class-using-env [clojure.lang.Keyword xtdb.node.XtdbNode]
  [ident env]
  (or (xt/entity (xt/db env) ident)
      (rdf/find-ns-metaobject ident)))

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
            :when              (not (some #(= % initarg) init-slots))]
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

(defmethod mop/class-precedence-list :rdfs/Class
  [class]
  (:mop/class-precedence-list class (mop/compute-class-precedence-list class)))

(defmethod mop/class-direct-default-initargs :rdfs/Class
  [class]
  (:mop/class-direct-default-initargs class {}))

(defmethod mop/class-direct-default-initargs :default
  [class]
  nil)

#_(into #{}
        (comp
          (map first)
          (map mop/find-class))
        (xt/q (xt/db mop/*env*)
              '{:find  [?e]
                :in    [$ ?class]
                :where [[?e :rdfs/domain ?domain]
                        (or-join [?domain ?class]
                                 [(== ?domain ?class)]
                                 (and [(get ?domain :owl/unionOf) ?unionOf]
                                      [(some? ?unionOf)]                              
                                      [(identity ?unionOf) [?unionClass ...]]
                                      [(== ?unionClass ?class)]))]}
              (:db/ident class)))

(defmethod mop/class-direct-slots clojure.lang.IPersistentMap
  [class]
  nil)

(defmethod mop/class-direct-slots :owl/Restriction
  [{:owl/keys [onProperty
               minCardinality
               maxCardinality
               allValuesFrom
               someValuesFrom]
    :as class}]
  ;; TODO: figure out the following restrictions...
  
  ;; The value constraint owl:allValuesFrom is a built-in OWL property
  ;; that links a restriction class to either a class description or a
  ;; data range. A restriction containing an owl:allValuesFrom
  ;; constraint is used to describe a class of all individuals for
  ;; which all values of the property under consideration are either
  ;; members of the class extension of the class description or are
  ;; data values within the specified data range. In other words, it
  ;; defines a class of individuals x for which holds that if the pair
  ;; (x,y) is an instance of P (the property concerned), then y should
  ;; be an instance of the class description or a value in the data
  ;; range, respectively.

  ;; This example describes an anonymous OWL class of all individuals
  ;; for which the hasParent property only has values of class
  ;; Human. Note that this class description does not state that the
  ;; property always has values of this class; just that this is true
  ;; for individuals that belong to the class extension of the
  ;; anonymous restriction class.

  ;; NOTE: In OWL Lite the only type of class description allowed as
  ;; object of owl:allValuesFrom is a class name.

  ;; An owl:allValuesFrom constraint is analogous to the universal
  ;; (for-all) quantifier of Predicate logic - for each instance of
  ;; the class that is being described, every value for P must fulfill
  ;; the constraint. Also notice that the correspondence of
  ;; owl:allValuesFrom with the universal quantifier means that an
  ;; owl:allValuesFrom constraint for a property P is trivially
  ;; satisfied for an individual that has no value for property P at
  ;; all. To see why this is so, observe that the owl:allValuesFrom
  ;; constraint demands that all values of P should be of type T, and
  ;; if no such values exist, the constraint is trivially true.

  ;;   A simple example:

  ;; {:rdf/type :owl/Restriction
  ;;  :owl/onProperty :hasParent
  ;;  :owl/allValuesFrom :Human}


  ;; The value constraint owl:someValuesFrom is a built-in OWL
  ;; property that links a restriction class to a class description or
  ;; a data range. A restriction containing an owl:someValuesFrom
  ;; constraint describes a class of all individuals for which at
  ;; least one value of the property concerned is an instance of the
  ;; class description or a data value in the data range. In other
  ;; words, it defines a class of individuals x for which there is at
  ;; least one y (either an instance of the class description or value
  ;; of the data range) such that the pair (x,y) is an instance of
  ;; P. This does not exclude that there are other instances (x,y') of
  ;; P for which y' does not belong to the class description or data
  ;; range.

  ;;   The following example defines a class of individuals which have
  ;;   at least one parent who is a physician:

  ;; {:rdf/type :owl/Restriction
  ;;  :owl/onProperty :hasParent
  ;;  :owl/someValuesFrom :Physician}

  ;; The owl:someValuesFrom constraint is analogous to the existential
  ;; quantifier of Predicate logic - for each instance of the class
  ;; that is being defined, there exists at least one value for P that
  ;; fulfills the constraint.

  ;; NOTE: In OWL Lite the only type of class description allowed as
  ;; object of owl:someValuesFrom is a class name.

  [(cond-> {:db/ident onProperty}
     allValuesFrom (update :rdfs/range (fnil conj #{}) allValuesFrom)
     someValuesFrom (update :rdfs/range (fnil conj #{}) someValuesFrom)
     minCardinality (assoc :owl/minCardinality minCardinality)
     maxCardinality (assoc :owl/maxCardinality maxCardinality))])

(defmethod mop/class-direct-slots :rdfs/Class
  [{:db/keys [ident]
    :mop/keys [class-direct-slots]
    :rdfs/keys [subClassOf]
    :owl/keys [intersectionOf unionOf]
    :as class}]
  (or (not-empty (:mop/class-direct-slots class))
      (not-empty (into [] (concat (and ident (get-in rdf/*indexes* [:slots/by-domain ident]))
                                  (some->> (filter map? (concat intersectionOf
                                                                unionOf
                                                                (when-not (keyword? subClassOf)
                                                                  subClassOf)))
                                           (mapcat mop/class-direct-slots)
                                           (map rdf/direct-slot-definition)
                                           (group-by :db/ident)
                                           (vals)
                                           (reduce (fn [slots maps]
                                                     (conj slots (update (reduce merge maps)
                                                                         :rdfs/domain (fnil conj #{})
                                                                         ident)))
                                                   [])))))))

(defmethod mop/class-default-initargs :rdfs/Class
  [class]
  (:mop/class-default-initargs class {}))

(defmethod mop/class-slots :rdfs/Class
  [class]
  (:mop/class-slots class (mop/compute-slots class)))

(defmethod mop/add-direct-subclass [:rdfs/Class :rdfs/Class]
  [superclass subclass]
  (xt/submit-tx mop/*env*
                [[::xt/put (update subclass
                                   :rdfs/subClassOf
                                   conj
                                   (:db/ident superclass))]
                 [::xt/put (update superclass
                                   :mop/class-direct-subclasses
                                   conj
                                   (:db/ident subclass))]]))

(defmethod mop/remove-direct-subclass [:rdfs/Class :rdfs/Class]
  [superclass subclass]
  (xt/submit-tx mop/*env*
                [[::xt/put (update subclass
                                   :rdfs/subClassOf
                                   #(into [] (remove #{%2}) %1)
                                   (:db/ident superclass))]
                 [::xt/put (update superclass
                                   :mop/class-direct-subclasses
                                   disj
                                   (:db/ident subclass))]]))

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
  (let [class (assoc class
                     :mop/class-direct-slots
                     (mop/class-direct-slots class))
        class (assoc class
                     :mop/class-direct-default-initargs
                     (let [d (filter :sh/defaultValue (:mop/class-direct-slots class))]
                       (zipmap (map :db/ident d)
                               (map :sh/defaultValue d))))
        class (assoc class
                     :mop/class-precedence-list
                     (mop/compute-class-precedence-list class))
        class (assoc class
                     :mop/class-slots
                     (mop/compute-slots class))
        class (assoc class
                     :mop/class-default-initargs
                     (mop/compute-default-initargs class))
        class (assoc class
                     :mop/class-direct-subclasses
                     (mop/class-direct-subclasses class))]
    (mop/intern-class-using-env class mop/*env*)))

(defmethod mop/intern-class-using-env [:rdfs/Class xtdb.node.XtdbNode]
  [class env]
  (try
    (xt/submit-tx env [[::xt/put (rdf/freezable class)]])
    #_(xt/sync env)
    (catch Throwable ex
      (throw (ex-info (.getMessage ex) {:class class} ex)))))

(defmethod mop/compute-default-initargs :rdfs/Class
  [{:mop/keys [class-precedence-list
               class-direct-default-initargs]}]
  (reduce into
          class-direct-default-initargs
          (map mop/class-direct-default-initargs
               (keep mop/find-class (rest class-precedence-list)))))
(comment
  (xt/q (xt/db mop/*env*)
        '{:find  [?class-direct-slots]
          :in    [$ ?class]
          :where [[?class :rdfs/subClassOf ?e]
                  [?e :mop/class-direct-slots ?class-direct-slots]
                  [?e :mop/class-direct-subclasses ?class-direct-subclasses]]}
        :schema/Movie))

(defmethod mop/compute-slots :rdfs/Class
  [{:mop/keys  [class-precedence-list
                class-direct-slots]
    :db/keys   [ident]
    :rdf/keys  [type]
    :rdfs/keys [subClassOf]
    :owl/keys  [deprecated equivalentClass]
    :as        class}]
  (->> (filter keyword? (concat (take-while (complement (cond
                                                          (isa? ident :owl/NamedIndividual)
                                                          #{:owl/NamedIndividual :owl/ObjectProperty :rdf/Propert}

                                                          (isa? ident :owl/Class)
                                                          #{:owl/Class :owl/ObjectProperty :rdf/Property}

                                                          (identical? ident :rdfs/Class)
                                                          #{}

                                                          :else
                                                          #{:rdfs/Class :owl/ObjectProperty :rdf/Property}))
                                            (or class-precedence-list
                                                (mop/compute-class-precedence-list class)))
                                subClassOf
                                equivalentClass))
       (mapcat mop/class-direct-slots)
       (remove (fn [{:db/keys [ident] :rdf/keys [type]}] (some #(isa? % :owl/AnnotationProperty) type)))
       (filter (fn [{:rdfs/keys [domain] :as slot}]
                 (some #(isa? ident %) domain)))
       (group-by :db/ident)
       (mapv #(mop/compute-effective-slot-definition class (key %) (val %)))))

(defmethod mop/slot-definition-initfunction :rdfs/Class
  [slot]
  (:mop/slot-initfunction slot nil))

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
  ;; Should this be rethought completely since RDF has no conflicting
  ;; slot names? It does have inheritance of property
  ;; semantics. Should effective slot definitions incorporate all of
  ;; that computed property precedence information? Probably? I think
  ;; so...?
  (reduce merge direct-slot-definitions)
  #_(reduce (fn [effective-slot-def direct-slot-def]
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
          {:db/ident slot}
          direct-slot-definitions))

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
                                 :owl/Thing
                                 :owl/NamedIndividual
                                 :oboInOwl/ObsoleteClass
                                 :oboInOwl/ObsoleteProperty))))

(defmethod mop/class-direct-superclasses :rdfs/Class
  [{:rdfs/keys [subClassOf]}]
  (filter keyword? subClassOf))

(defmethod mop/class-direct-subclasses :rdfs/Class
  [{:db/keys [ident]
    :mop/keys [class-direct-subclasses]}]
  (or class-direct-subclasses
      (into #{}
            (map first)
            (xt/q (xt/db mop/*env*)
                  '{:find  [?e]
                    :in    [$ ?class]
                    :where [[?e :rdfs/subClassOf ?class]]}
                  ident))))

(defmethod mop/compute-class-precedence-list :default
  [_]
  nil)
