(ns user
  {:clojure.tools.namespace.repl/load false}
  (:require
   [clojure.edn]
   [clojure.repl]
   [clojure.tools.namespace.repl]
   [ont-app.vocabulary.lstr]
   [clojure.tools.reader]
   [com.stuartsierra.component.user-helpers :refer [dev go reset]]))

(alter-var-root #'*default-data-reader-fn* (constantly tagged-literal))

(defmethod print-dup clojure.lang.TaggedLiteral
  [x ^java.io.Writer w]
  (.write w (str "#" (:tag x) " " (pr-str (:form x)))))

;; tools.namespace reads Clojure code using tools.reader which binds
;; *data-readers* separately from the standard Clojure reader
(alter-var-root #'clojure.tools.reader/*data-readers* (constantly *data-readers*))
(alter-var-root #'clojure.tools.reader/*default-data-reader-fn* (constantly tagged-literal))

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
