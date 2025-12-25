(ns dev
  "REPL helpers for the RDF/ontology toolchain."
  (:require
   [clojure.datafy :refer [datafy]]
   [clojure.edn :as edn]
   [clojure.java.io :as io]
   [clojure.repl :refer [doc source]]
   [com.stuartsierra.component.repl :refer [reset set-init start stop system]]
   [com.walmartlabs.schematic :as sc]
   [net.wikipunk.rdf :as rdf]
   [net.wikipunk.mop :as mop]
   [net.wikipunk.ontology.explain :as explain]
   [net.wikipunk.ontology.owl-rl :as owl-rl]))

(set-init
  (fn [_]
    (set! *print-namespace-maps* nil)
    (if-let [r (io/resource "system.edn")]
      (-> r slurp edn/read-string sc/assemble-system)
      (throw (ex-info "system.edn is not on classpath" {})))))

(comment
  ;; (reset) to start the dev system
  ;; (rdf/prefixes) to inspect prefix mappings
  )
