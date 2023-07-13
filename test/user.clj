(ns user
  {:clojure.tools.namespace.repl/load false}
  (:require
   [clojure.edn :as edn]
   [clojure.repl]
   [clojure.tools.namespace.repl]
   [ont-app.vocabulary.lstr]   
   [clojure.tools.reader]
   [clojure.java.io :as io]
   [com.stuartsierra.component.repl :refer [reset set-init]]
   [com.walmartlabs.schematic :as sc]
   [net.wikipunk.rdf]))

;; tools.namespace reads Clojure code using tools.reader which binds
;; *data-readers* separately from the standard Clojure reader
(alter-var-root #'clojure.tools.reader/*data-readers* (constantly *data-readers*))
(alter-var-root #'clojure.tools.reader/*default-data-reader-fn* (constantly tagged-literal))

(clojure.tools.namespace.repl/set-refresh-dirs "src" "test")

(Thread/setDefaultUncaughtExceptionHandler
  (reify Thread$UncaughtExceptionHandler
    (uncaughtException [_ thread ex]
      (binding [*out* *err*]
        (let [msg (str "Uncaught exception on " (.getName thread))]
          (println msg)
          (clojure.repl/pst ex))))))

(set-init
  (fn [_]    
    (if-let [r (io/resource "system.edn")]
      (-> (slurp r)
          (edn/read-string)
          (sc/assemble-system))
      (throw (ex-info "system.edn is not on classpath" {})))))

(reset)
