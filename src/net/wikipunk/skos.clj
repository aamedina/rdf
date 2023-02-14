(ns net.wikipunk.skos
  "The Simple Knowledge Organization System"
  (:require
   [clojure.core.memoize :as memo]
   [clojure.edn :as edn]
   [clojure.set :as set]
   [clojure.string :as str]
   [clojure.tools.logging :as log]
   [com.stuartsierra.component :as com]
   [net.wikipunk.rdf.skos :as skos]))

(def ^:dynamic *skos*
  "A Clojure multimethod hierarchy for :skos/Concept,
  :skos/ConceptScheme, and :skos/Collection."
  (make-hierarchy))

(def ^:dynamic *keys*
  {:skos/broader
   :skos/narrower
   :skos/inScheme
   :skos/member})

(defrecord SKOS [vocab]
  com/Lifecycle
  (start [this]
    (let []
      this))
  (stop [this]
    this))

#_(defn make-skos-hierarchy
  [metaobjects]
  (reduce
    (fn [h {:db/keys   [ident]
            :skos/keys [broader narrower inScheme member]
            :as        entity}]
      (cond-> h
        (seq (filter keyword? broader))
        (deriving entity (filter keyword? broader))

        (seq (filter keyword? inScheme))
        (deriving entity (filter keyword? inScheme))

        (seq (filter keyword? member))
        (as-> h
            (reduce (fn [h member]
                      (try
                        (derive h member ident)
                        (catch Throwable ex
                          h)))
                    h (filter keyword? member)))

        #_ (seq (filter keyword? narrower))
        #_ (as-> h
               (reduce (fn [h child]
                         (try
                           (derive h child ident)
                           (catch Throwable ex
                             h)))
                       h (filter keyword? narrower)))))
    (make-hierarchy)
    (->> (descendants metaobjects :skos/Concept)
         (map find-metaobject)
         (pmap (fn [v]
                 (reduce (fn [entity term]
                           (update entity term #(if (coll? %) % [%])))
                         v +props+))))))
