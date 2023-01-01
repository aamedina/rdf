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
