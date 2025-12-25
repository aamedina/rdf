(ns net.wikipunk.ontology.extract-test
  (:require
   [clojure.test :refer [deftest is testing]]
   [net.wikipunk.ontology.extract :as sut]))

(deftest relative-import-target-same-directory
  (is (= "child.ttl"
         (#'sut/relative-import-target
           "resources/net/wikipunk/boot/base.ttl"
           "resources/net/wikipunk/boot/child.ttl"))))

(deftest relative-import-target-nested-directory
  (is (= "../deps/dep.ttl"
         (#'sut/relative-import-target
           "resources/net/wikipunk/modules/module.ttl"
           "resources/net/wikipunk/deps/dep.ttl"))))
