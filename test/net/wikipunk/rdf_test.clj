(ns net.wikipunk.rdf-test
  (:require
   [clojure.test :refer :all]
   [com.stuartsierra.component.repl :refer [system]]
   [net.wikipunk.mop :as mop :refer [isa? descendants ancestors parents]]
   [net.wikipunk.rdf :as rdf]
   [net.wikipunk.rdf.d3f])
  (:refer-clojure :exclude [isa? descendants ancestors parents]))

(use-fixtures :once
              (fn [f]
                (assert system "the system must be started before running tests")
                (binding [rdf/*slash* true]
                  (f))))

(deftest iri->kw
  (testing "IRIs such as http://d3fend.mitre.org/ontologies/d3fend.owl#Reference-EvictionGuidanceforNetworksAffectedbytheSolarWindsandActiveDirectory/M365Compromise-CISA have a slash in the name part that needs to be munged"
    (is (= (rdf/kw "http://d3fend.mitre.org/ontologies/d3fend.owl#Reference-EvictionGuidanceforNetworksAffectedbytheSolarWindsandActiveDirectory/M365Compromise-CISA")
           :d3f/Reference-EvictionGuidanceforNetworksAffectedbytheSolarWindsandActiveDirectory_SLASH_M365Compromise-CISA)
        "terms with slashes in their names are munged using _SLASH_")))

(deftest kw->iri
  (testing "IRIs such as http://d3fend.mitre.org/ontologies/d3fend.owl#Reference-EvictionGuidanceforNetworksAffectedbytheSolarWindsandActiveDirectory/M365Compromise-CISA has a slash in the name part that needs to be demunged"
    (is (= (rdf/iri :d3f/Reference-EvictionGuidanceforNetworksAffectedbytheSolarWindsandActiveDirectory_SLASH_M365Compromise-CISA)
           "http://d3fend.mitre.org/ontologies/d3fend.owl#Reference-EvictionGuidanceforNetworksAffectedbytheSolarWindsandActiveDirectory/M365Compromise-CISA")
        "Keywords containing _SLASH_ are demunged into a / character")))

