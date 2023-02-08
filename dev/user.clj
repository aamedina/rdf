(ns user
  {:clojure.tools.namespace.repl/load false}
  (:require
   [clojure.edn]
   [clojure.repl]
   [clojure.tools.namespace.repl]
   [com.stuartsierra.component.user-helpers :refer [dev go reset]]))

(clojure.tools.namespace.repl/set-refresh-dirs "dev" "src")

(Thread/setDefaultUncaughtExceptionHandler
  (reify Thread$UncaughtExceptionHandler
    (uncaughtException [_ thread ex]
      (binding [*out* *err*]
        (let [msg (str "Uncaught exception on " (.getName thread))]
          (println msg)
          (clojure.repl/pst ex))))))

(def reveal
  (delay
    (doto ((requiring-resolve 'vlaaad.reveal/ui))
      (add-tap))))

(defn reset-reveal
  []
  ((requiring-resolve 'vlaaad.reveal/close-all-views))
  (alter-var-root #'reveal (constantly (delay
                                         (doto ((requiring-resolve 'vlaaad.reveal/ui))
                                           (add-tap))))))
