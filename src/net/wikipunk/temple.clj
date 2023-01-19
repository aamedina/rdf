(ns net.wikipunk.temple
  "The Temple of EDN: A Metaobject Protocol for Clojure."
  {:rdfs/seeAlso    ["http://www.lispworks.com/documentation/lw80/MOP/mop/index.html"]
   :dcterms/creator "Adrian Medina"}  
  (:require
   [clojure.set :as set]
   [com.stuartsierra.component :as com]
   [net.wikipunk.boot]
   [net.wikipunk.ext]
   [net.wikipunk.rdf :as rdf]))

(def ^:dynamic *tree-of-life*
  "A Clojure multimethod hierarchy combining rdf/*classes*,
  rdf/*properties*, and instances of :owl/NamedIndividual."
  (make-hierarchy))

(def ^:dynamic *indexes*
  "A map of useful indexes maintained by agents called priests."
  {})

(defrecord Temple [vocab rdf init-ns]
  com/Lifecycle
  (start [this]
    (require init-ns :reload)
    (let [metaobjects ((ns-resolve init-ns 'setup-canvas))
          indexes     ((ns-resolve init-ns 'setup-indexes))]
      (alter-var-root #'*tree-of-life* (constantly metaobjects))
      (alter-var-root #'*indexes* (constantly indexes))
      ((ns-resolve init-ns 'finalize))
      (when-some [conn (:conn rdf)]
        (rdf/bootstrap conn))
      (assoc this :metaobjects metaobjects :indexes indexes)))
  (stop [this]
    (alter-var-root #'*tree-of-life* (constantly (make-hierarchy)))
    (alter-var-root #'*indexes* (constantly {}))
    (assoc this :metaobjects nil :indexes nil)))
