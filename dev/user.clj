(ns user
  {:clojure.tools.namespace.repl/load false}
  (:require
   [clojure.tools.namespace.repl :as repl]
   [com.stuartsierra.component.user-helpers :refer [dev go reset]]))

(repl/set-refresh-dirs "dev" "src" "test")
