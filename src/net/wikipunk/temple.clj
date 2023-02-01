(ns net.wikipunk.temple
  "The Temple of EDN: A Metaobject Protocol for Clojure."
  {:rdfs/seeAlso    ["http://www.lispworks.com/documentation/lw80/MOP/mop/index.html"]
   :dcterms/creator "Adrian Medina"}  
  (:require
   [clojure.set :as set]
   [com.stuartsierra.component :as com]))

(def ^:dynamic *tree-of-life*
  "A Clojure multimethod hierarchy combining rdf/*classes*,
  rdf/*properties*, and instances of :owl/NamedIndividual."
  (make-hierarchy))

(defrecord Temple [vocab rdf]
  com/Lifecycle
  (start [this]
    (let []
      #_(alter-var-root #'*tree-of-life* (constantly rdf/*metaobjects*))
      (when-some [conn (:conn rdf)]
        ((requiring-resolve 'net.wikipunk.rdf/bootstrap) *tree-of-life* conn :force? false))
      this))
  (stop [this]
    (alter-var-root #'*tree-of-life* (constantly (make-hierarchy)))
    this))
