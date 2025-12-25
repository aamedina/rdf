(ns net.wikipunk.mop
  "Metaobject Protocol (MOP) helpers backed by Datomic.

  Provides class/property navigation utilities over RDF/OWL data."
  (:require
   [clojure.set :as set]
   [datomic.client.api :as d]
   [datomic.client.api.protocols :as impl]
   [net.wikipunk.rdf :as rdf]))

(def ^:dynamic *env*
  "Optional dynamic binding for the default Datomic env/db used by MOP helpers."
  nil)

(defn- default-env
  []
  (or *env* (rdf/current-db)))

(defn- as-db
  "Accepts either a Datomic db value or a Connection; returns a db value."
  [conn-or-db]
  (cond
    (nil? conn-or-db) nil
    (satisfies? impl/Connection conn-or-db) (d/db conn-or-db)
    :else conn-or-db))

(defn class-direct-superclasses
  "Returns a set of the direct superclasses of the named
  metaobject. The elements of this set are metaobjects that are
  mentioned by this class or property among their direct subclasses or
  subproperties."
  ([ident] (class-direct-superclasses ident (default-env)))
  ([ident env]
   (if-let [db (as-db env)]
     (into #{}
           (comp
             (map first)
             (map :db/ident))
           (d/q '[:find (pull ?parent [:db/ident])
                  :in $ ?class
                  :where
                  (or (and [?class :rdfs/subClassOf ?parent]
                           [?parent :db/ident _])
                      (and [?class :rdfs/subPropertyOf ?parent]
                           [?parent :db/ident _]))]
                db ident))
     #{})))

(defn class-direct-subclasses
  "Returns a set of the direct subclasses of the named metaobject. The
  elements of this set are metaobjects that all mention this class or
  property among their direct superclasses or superproperties."
  ([ident] (class-direct-subclasses ident (default-env)))
  ([ident env]
   (if-let [db (as-db env)]
     (into #{}
           (comp
             (map first)
             (map :db/ident))
           (d/q '[:find (pull ?child [:db/ident])
                  :in $ ?class
                  :where
                  (or (and [?child :rdfs/subClassOf ?class]
                           [?child :db/ident _])
                      (and [?child :rdfs/subPropertyOf ?class]
                           [?child :db/ident _]))]
                db ident))
     #{})))

(defn compute-class-precedence-list
  "Determine the class precedence list of a class or property.
  The result is a list which contains each of the class and its
  superclasses once and only once."
  ([ident] (compute-class-precedence-list ident (default-env)))
  ([ident env]
   (letfn [(compute-cpl [cls]
             (let [parents (class-direct-superclasses cls env)]
               (if (empty? parents)
                 [cls]
                 (into [cls] (sort isa? (distinct (mapcat compute-cpl parents)))))))]
     (->> (compute-cpl ident)
          distinct
          (sort isa?)
          (into [])))))

(defn class-direct-slots
  "Compute the properties on a class directly either through
  rdfs:domain or OWL restrictions."
  ([ident] (class-direct-slots ident (default-env)))
  ([ident env]
   (when-let [db (as-db env)]
     (let [domain-h   (:rdfs/domain rdf/*metaobjects*)
           domain-set (if domain-h
                        (descendants domain-h ident)
                        #{})]
       (not-empty (set/union domain-set
                             (into #{}
                                   (comp
                                     (map first)
                                     (map :db/ident))
                                   (d/q '[:find (pull ?p [:db/ident])
                                          :in $ ?class
                                          :where
                                          [?class :rdfs/subClassOf ?restriction]
                                          [?restriction :rdf/type :owl/Restriction]
                                          [?restriction :owl/onProperty ?p]]
                                        db ident))))))))

(defn compute-slots
  "Compute the properties of a class and its superclasses."
  [ident]
  (case ident
    :rdfs/Class
    (class-direct-slots :rdfs/Class)

    :owl/Class
    (set/union (class-direct-slots :rdfs/Class)
               (class-direct-slots :owl/Class))

    (->> (compute-class-precedence-list ident)
         (take-while (complement #{:owl/Class :rdfs/Class}))
         (map class-direct-slots)
         (reduce set/union))))

(defn class-slots
  "Alias for compute-slots." 
  [ident]
  (compute-slots ident))
