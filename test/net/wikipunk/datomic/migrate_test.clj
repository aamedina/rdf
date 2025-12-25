(ns net.wikipunk.datomic.migrate-test
  (:require [clojure.string :as str]
            [clojure.test :refer :all]
            [com.stuartsierra.component.repl :as repl]
            [com.walmartlabs.schematic :as sc]
            [datomic.client.api :as d]
            [net.wikipunk.datomic.migrate :as m]
            [net.wikipunk.test-fixtures :refer [use-test-system]]))

(use-fixtures :once use-test-system)

(defn- canonical-import-path [p]
  (#'m/canonical-path (str p)))

(defn- canonical-import-id [& paths]
  (#'m/import-id (mapv canonical-import-path paths)))

(defn- label-values [v]
  (cond
    (nil? v) #{}
    (string? v) #{v}
    (sequential? v) (set v)
    :else #{v}))

(defn- label= [expected v]
  (contains? (label-values v) expected))

(deftest resolve-import-path-joins-directory
  (let [base   (canonical-import-path "resources/net/wikipunk/boot/base.ttl")
        target (canonical-import-path "resources/net/wikipunk/boot/child.ttl")
        actual (#'m/resolve-import-path base "child.ttl")]
    (is (= target actual))))


(deftest migrator-imports-multiple-ttl-files
  (let [sys   repl/system
        conn  (get-in sys [:db :conn])
        _     (is conn)
        f1    (doto (java.io.File/createTempFile "wp-ont-a-" ".ttl") (.deleteOnExit))
        f2    (doto (java.io.File/createTempFile "wp-ont-b-" ".ttl") (.deleteOnExit))
        p1    (.getAbsolutePath f1)
        p2    (.getAbsolutePath f2)
        ttl-a (str
                "@prefix test: <https://wikipunk.net/test/> .\n"
                "@prefix owl:  <http://www.w3.org/2002/07/owl#> .\n"
                "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n"
                "test:Foo a owl:Class ; rdfs:label \"Foo\" .\n")
        ttl-b (str
                "@prefix test: <https://wikipunk.net/test/> .\n"
                "@prefix owl:  <http://www.w3.org/2002/07/owl#> .\n"
                "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n"
                "test:Bar a owl:Class ; rdfs:label \"Bar\" .\n")
        _     (spit f1 ttl-a)
        _     (spit f2 ttl-b)
        _     (#'m/import-ontologies-once! conn [p1 p2])
        db    (d/db conn)]
    (is (ffirst (d/q '[:find ?e :where [?e :db/ident :test/Foo]] db)))
    (is (ffirst (d/q '[:find ?e :where [?e :db/ident :test/Bar]] db)))))

(deftest iri-attribute-installed
  (let [sys    repl/system
        dbc (get-in sys [:db :conn])
        _      (is dbc)
        adb    (d/db dbc)]
    ;; Attribute exists
    (is (ffirst (d/q '[:find ?e :where [?e :db/ident :punk/iri]] adb)))
    ;; valueType is string
    (is (= :db.type/string
           (ffirst (d/q '[:find ?ident :in $ :where
                          [?e :db/ident :punk/iri]
                          [?e :db/valueType ?vt]
                          [?vt :db/ident ?ident]] adb))))
    ;; cardinality one
    (is (= :db.cardinality/one
           (ffirst (d/q '[:find ?ident :in $ :where
                          [?e :db/ident :punk/iri]
                          [?e :db/cardinality ?c]
                          [?c :db/ident ?ident]] adb))))
    ;; unique identity
    (is (= :db.unique/identity
           (ffirst (d/q '[:find ?ident :in $ :where
                          [?e :db/ident :punk/iri]
                          [?e :db/unique ?u]
                          [?u :db/ident ?ident]] adb))))))


(deftest ontology-reimport-by-content-digest
  ;; Verify that changing TTL content produces a new migration marker
  ;; and newly imported entities without reinstalling everything.
  (let [sys    repl/system
        conn   (get-in sys [:db :conn])
        _      (is conn)
        tmp    (doto (java.io.File/createTempFile "wp-ont-" ".ttl") (.deleteOnExit))
        path   (.getAbsolutePath tmp)
        ;; initial TTL: define test:Foo
        ttl-a  (str
                 "@prefix test: <https://wikipunk.net/test/> .\n"
                 "@prefix owl:  <http://www.w3.org/2002/07/owl#> .\n"
                 "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n"
                 "test:Foo a owl:Class ; rdfs:label \"Foo\" .\n")
        ;; modified TTL: add test:Bar too
        ttl-b  (str ttl-a "test:Bar a owl:Class ; rdfs:label \"Bar\" .\n")
        _      (spit tmp ttl-a)
        _      (#'m/import-ontologies-once! conn [path])
        id-a   (canonical-import-id path)
        db     (d/db conn)]
    ;; import A and assert marker + entity
    (is (ffirst (d/q '[:find ?e :in $ ?id :where [?e :punk.migration/id ?id]] db id-a)))
    (is (ffirst (d/q '[:find ?e :where [?e :db/ident :test/Foo]] db)))
    ;; change file contents, re-import, assert new marker + new class
    (spit tmp ttl-b)
    (#'m/import-ontologies-once! conn [path])
    (let [id-b (canonical-import-id path)
          db2  (d/db conn)]
      (is (not= id-a id-b)) ; id depends on content
      (is (ffirst (d/q '[:find ?e :in $ ?id :where [?e :punk.migration/id ?id]] db2 id-b)))
      (is (ffirst (d/q '[:find ?e :where [?e :db/ident :test/Bar]] db2))))))

(deftest duplicate-triples-dont-create-duplicate-entities
  (let [sys    repl/system
        conn   (get-in sys [:db :conn])
        _      (is conn)
        f1     (doto (java.io.File/createTempFile "wp-dup-a-" ".ttl") (.deleteOnExit))
        f2     (doto (java.io.File/createTempFile "wp-dup-b-" ".ttl") (.deleteOnExit))
        p1     (.getAbsolutePath f1)
        p2     (.getAbsolutePath f2)
        ttl    (str
                 "@prefix test: <https://wikipunk.net/test/> .\n"
                 "@prefix owl:  <http://www.w3.org/2002/07/owl#> .\n"
                 "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n"
                 "test:Foo a owl:Class ; rdfs:label \"Foo\" .\n")
        _      (spit f1 ttl)
        _      (spit f2 ttl)]
    ;; Import both files in one pass — same triples appear twice
    (#'m/import-ontologies-once! conn [p1 p2])
    (let [db (d/db conn)]
      ;; Only one entity with :db/ident :test/Foo
      (is (= 1 (count (d/q '[:find ?e :where [?e :db/ident :test/Foo]] db)))))))

(deftest ontology-import-cycle-produces-clear-error
  (let [sys    repl/system
        conn   (get-in sys [:db :conn])
        _      (is conn)
        tmp-a  (doto (java.io.File/createTempFile "wp-cycle-a-" ".ttl") (.deleteOnExit))
        tmp-b  (doto (java.io.File/createTempFile "wp-cycle-b-" ".ttl") (.deleteOnExit))
        path-a (.getAbsolutePath tmp-a)
        path-b (.getAbsolutePath tmp-b)
        iri-a  (canonical-import-path path-a)
        iri-b  (canonical-import-path path-b)
        ttl-a  (format (str "@prefix owl: <http://www.w3.org/2002/07/owl#> .\n"
                            "@prefix ex:  <https://wikipunk.net/test/> .\n\n"
                            "ex:CycleA a owl:Ontology ; owl:imports <%s> .\n")
                       iri-b)
        ttl-b  (format (str "@prefix owl: <http://www.w3.org/2002/07/owl#> .\n"
                            "@prefix ex:  <https://wikipunk.net/test/> .\n\n"
                            "ex:CycleB a owl:Ontology ; owl:imports <%s> .\n")
                       iri-a)]
    (spit tmp-a ttl-a)
    (spit tmp-b ttl-b)
    (try
      (#'m/import-ontologies-once! conn [path-a])
      (is false "Expected cycle detection to throw an exception")
      (catch clojure.lang.ExceptionInfo ex
        (let [msg   (.getMessage ex)
              data  (ex-data ex)
              cycle (:cycle data)]
          (is (str/includes? msg "Cycle detected in ontology imports"))
          (is (vector? cycle))
          (is (<= 2 (count cycle)))
          (is (some #(= iri-a %) cycle))
          (is (some #(= iri-b %) cycle)))))))

(deftest owl-imports-respect-dependency-order
  (let [sys     repl/system
        conn    (get-in sys [:db :conn])
        _       (is conn)
        tempdir (java.nio.file.Files/createTempDirectory "wikipunk-import" (make-array java.nio.file.attribute.FileAttribute 0))
        base    (.toFile (.resolve tempdir "base.ttl"))
        child   (.toFile (.resolve tempdir "child.ttl"))
        base-str  (str "@prefix test: <https://wikipunk.net/test/> .\n"
                       "@prefix owl:  <http://www.w3.org/2002/07/owl#> .\n"
                       "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n"
                       "test:Base a owl:Class ; rdfs:label \"Base\" .\n")
        child-str (str "@prefix test: <https://wikipunk.net/test/> .\n"
                       "@prefix owl:  <http://www.w3.org/2002/07/owl#> .\n"
                       "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n"
                       "[] a owl:Ontology ; owl:imports <" (.getName base) "> .\n\n"
                       "test:Child a owl:Class ; rdfs:label \"Child\" ; rdfs:subClassOf test:Base .\n")]
    (try
      (spit base base-str)
      (spit child child-str)
      (#'m/import-ontologies-once! conn [(.getAbsolutePath child)])
      (let [db (d/db conn)
            base-id (canonical-import-id (.getCanonicalPath base))
            child-id (canonical-import-id (.getCanonicalPath child))]
        (is (ffirst (d/q '[:find ?e :where [?e :db/ident :test/Base]] db)))
        (is (ffirst (d/q '[:find ?e :where [?e :db/ident :test/Child]] db)))
        (is (ffirst (d/q '[:find ?e :in $ ?id :where [?e :punk.migration/id ?id]] db base-id)))
        (is (ffirst (d/q '[:find ?e :in $ ?id :where [?e :punk.migration/id ?id]] db child-id))))
      (finally
        (java.nio.file.Files/deleteIfExists (.toPath child))
        (java.nio.file.Files/deleteIfExists (.toPath base))
        (java.nio.file.Files/deleteIfExists tempdir)))))

(deftest ontology-reimport-on-imported-change
  (let [sys  repl/system
        conn (get-in sys [:db :conn])
        _    (is conn)
        ;; create imported TTL
        imp  (doto (java.io.File/createTempFile "wp-imp-" ".ttl") (.deleteOnExit))
        impP (.getAbsolutePath imp)
        impU (str "file:" impP)
        agg  (doto (java.io.File/createTempFile "wp-agg-" ".ttl") (.deleteOnExit))
        aggP (.getAbsolutePath agg)
        ttl-imp-a (str
                    "@prefix test: <https://wikipunk.net/test/> .\n"
                    "@prefix owl:  <http://www.w3.org/2002/07/owl#> .\n"
                    "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n"
                    "test:Imported a owl:Class ; rdfs:label \"Imported\" .\n")
        ttl-imp-b (str ttl-imp-a "test:Imported2 a owl:Class ; rdfs:label \"Imported2\" .\n")
        ttl-agg   (str
                    "@prefix owl:  <http://www.w3.org/2002/07/owl#> .\n\n"
                    "<" impU "> a owl:Ontology .\n"
                    "<" impU "> owl:imports <" impU "> .\n")]
    (spit imp ttl-imp-a)
    (spit agg ttl-agg)
    ;; Import aggregator + imported (pass both so digest includes both)
    (#'m/import-ontologies-once! conn [aggP impU])
    (let [id-a (canonical-import-id aggP impU)
          db   (d/db conn)]
      (is (ffirst (d/q '[:find ?e :in $ ?id :where [?e :punk.migration/id ?id]] db id-a)))
      (is (ffirst (d/q '[:find ?e :where [?e :db/ident :test/Imported]] db)))
      ;; Change only the imported file; re-import should pick it up
      (spit imp ttl-imp-b)
      (#'m/import-ontologies-once! conn [aggP impU])
      (let [id-b (canonical-import-id aggP impU)
            db2  (d/db conn)]
        (is (not= id-a id-b))
        (is (ffirst (d/q '[:find ?e :in $ ?id :where [?e :punk.migration/id ?id]] db2 id-b)))
        (is (ffirst (d/q '[:find ?e :where [?e :db/ident :test/Imported2]] db2)))))))

(deftest expand-imports-transitive-reimport
  (let [sys      repl/system
        conn     (get-in sys [:db :conn])
        _        (is conn)
        tempdir  (java.nio.file.Files/createTempDirectory "wikipunk-transitive" (make-array java.nio.file.attribute.FileAttribute 0))
        root-f   (.toFile (.resolve tempdir "root.ttl"))
        mid-f    (.toFile (.resolve tempdir "mid.ttl"))
        leaf-f   (.toFile (.resolve tempdir "leaf.ttl"))
        root-p   (.getAbsolutePath root-f)
        mid-p    (.getAbsolutePath mid-f)
        leaf-p   (.getAbsolutePath leaf-f)
        root-u   (str "file:" root-p)
        mid-u    (str "file:" mid-p)
        leaf-u   (str "file:" leaf-p)
        ttl-leaf-a (str "@prefix test: <https://wikipunk.net/test/> .\n"
                        "@prefix owl:  <http://www.w3.org/2002/07/owl#> .\n"
                        "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n"
                        "test:Leaf a owl:Class ; rdfs:label \"Leaf\" .\n")
        ttl-leaf-b (str ttl-leaf-a "test:Leaf2 a owl:Class ; rdfs:label \"Leaf2\" .\n")
        ttl-mid  (str "@prefix owl: <http://www.w3.org/2002/07/owl#> .\n\n"
                      "[] a owl:Ontology ; owl:imports <" leaf-u "> .\n")
        ttl-root (str "@prefix owl: <http://www.w3.org/2002/07/owl#> .\n\n"
                       "[] a owl:Ontology ; owl:imports <" mid-u "> .\n")]
    (try
      (do
        (spit leaf-f ttl-leaf-a)
        (spit mid-f ttl-mid)
        (spit root-f ttl-root)
        ;; ensure expand-imports walks transitive closure
        (let [expanded (#'m/expand-imports [root-p])]
          (is (= #{(canonical-import-path root-p)
                   (canonical-import-path mid-p)
                   (canonical-import-path leaf-p)}
                 (set expanded))))
        ;; Initial import via root path only
        (#'m/import-ontologies-once! conn [root-p])
        (let [db      (d/db conn)
              root-id (canonical-import-id root-p)
              mid-id  (canonical-import-id mid-p)
              leaf-id (canonical-import-id leaf-p)]
          (is (ffirst (d/q '[:find ?e :in $ ?id :where [?e :punk.migration/id ?id]] db root-id)))
          (is (ffirst (d/q '[:find ?e :in $ ?id :where [?e :punk.migration/id ?id]] db mid-id)))
          (is (ffirst (d/q '[:find ?e :in $ ?id :where [?e :punk.migration/id ?id]] db leaf-id)))
          (is (ffirst (d/q '[:find ?e :where [?e :db/ident :test/Leaf]] db)))
          ;; Modify only the leaf TTL and re-import; expect only the leaf marker to change
          (spit leaf-f ttl-leaf-b)
          (#'m/import-ontologies-once! conn [root-p])
          (let [db2        (d/db conn)
                root-count (count (d/q '[:find ?e :in $ ?id :where [?e :punk.migration/id ?id]] db2 root-id))
                mid-count  (count (d/q '[:find ?e :in $ ?id :where [?e :punk.migration/id ?id]] db2 mid-id))
                leaf-new   (canonical-import-id leaf-p)
                leaf-count (count (d/q '[:find ?e :in $ ?id :where [?e :punk.migration/id ?id]] db2 leaf-new))]
            (is (= 1 root-count))
            (is (= 1 mid-count))
            (is (not= leaf-id leaf-new))
            (is (= 1 leaf-count))
            (is (ffirst (d/q '[:find ?e :where [?e :db/ident :test/Leaf2]] db2))))))
      (finally
        (java.nio.file.Files/deleteIfExists (.toPath root-f))
        (java.nio.file.Files/deleteIfExists (.toPath mid-f))
        (java.nio.file.Files/deleteIfExists (.toPath leaf-f))
        (java.nio.file.Files/deleteIfExists tempdir)))))

(deftest ontology-import-retractions-remove-stale-entities
  (let [sys    repl/system
        conn   (get-in sys [:db :conn])
        _      (is conn)
        tmp    (doto (java.io.File/createTempFile "wp-retract-" ".ttl") (.deleteOnExit))
        path   (.getAbsolutePath tmp)
        canon  (canonical-import-path path)
        suffix (subs (str (java.util.UUID/randomUUID)) 0 8)
        foo-kw (keyword "test" (str "Foo" suffix))
        bar-kw (keyword "test" (str "Bar" suffix))
        ttl-a  (str "@prefix test: <https://wikipunk.net/test/> .\n"
                    "@prefix owl:  <http://www.w3.org/2002/07/owl#> .\n"
                    "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n"
                    "test:Foo" suffix " a owl:Class ; rdfs:label \"Foo\" .\n"
                    "test:Bar" suffix " a owl:Class ; rdfs:label \"Bar\" .\n")
        ttl-b  (str "@prefix test: <https://wikipunk.net/test/> .\n"
                    "@prefix owl:  <http://www.w3.org/2002/07/owl#> .\n"
                    "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n"
                    "test:Foo" suffix " a owl:Class ; rdfs:label \"Foo\" .\n")
        ttl-c ttl-a]
    (spit tmp ttl-a)
    (#'m/import-ontologies-once! conn [path])
    (let [db (d/db conn)]
      (is (ffirst (d/q '[:find ?e :in $ ?ident :where [?e :db/ident ?ident]] db foo-kw)))
      (is (ffirst (d/q '[:find ?e :in $ ?ident :where [?e :db/ident ?ident]] db bar-kw)))
      (let [{:keys [start end id]} (#'m/latest-migration-meta conn canon)
            txs (seq (d/tx-range conn {:start (inc (long start))
                                       :end   (inc (long end))}))]
        (is id)
        (is (number? start))
        (is (number? end))
        (is (< start end))
        (is (seq txs))
        (is (some (fn [tx]
                    (some (fn [datom]
                            (and (.added datom)
                                 (= (:db/ident (d/pull (d/db conn) '[:db/ident] (.a datom)))
                                    :db/ident)
                                 (= (.v datom) bar-kw)))
                          (:data tx)))
                  txs))))
    (spit tmp ttl-b)
    (let [{:keys [tx-data entities]} (#'m/migration-retractions conn canon)
          bar-eid (ffirst (d/q '[:find ?e :in $ ?ident :where [?e :db/ident ?ident]]
                               (d/db conn) bar-kw))]
      (is (seq tx-data))
      (is (contains? entities bar-eid)))
    (#'m/import-ontologies-once! conn [path])
    (let [db2 (d/db conn)]
      (is (ffirst (d/q '[:find ?e :in $ ?ident :where [?e :db/ident ?ident]] db2 foo-kw)))
      (is (empty? (d/q '[:find ?e :in $ ?ident :where [?e :db/ident ?ident]] db2 bar-kw))))
    (spit tmp ttl-c)
    (#'m/import-ontologies-once! conn [path])
    (let [db3 (d/db conn)]
      (is (ffirst (d/q '[:find ?e :in $ ?ident :where [?e :db/ident ?ident]] db3 foo-kw)))
      (is (ffirst (d/q '[:find ?e :in $ ?ident :where [?e :db/ident ?ident]] db3 bar-kw))))))

(deftest ontology-reimport-removes-stale-property
  (let [sys    repl/system
        conn   (get-in sys [:db :conn])
        _      (is conn)
        tmp    (doto (java.io.File/createTempFile "wp-retract-prop-" ".ttl") (.deleteOnExit))
        path   (.getAbsolutePath tmp)
        canon  (canonical-import-path path)
        suffix (subs (str (java.util.UUID/randomUUID)) 0 8)
        class-kw (keyword "test" (str "Owner" suffix))
        prop-kw  (keyword "test" (str "gone-prop" suffix))
        ttl-a  (format (str "@prefix test: <https://wikipunk.net/test/> .\n"
                            "@prefix owl:  <http://www.w3.org/2002/07/owl#> .\n"
                            "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n"
                            "@prefix xsd:  <http://www.w3.org/2001/XMLSchema#> .\n\n"
                            "test:%s a owl:Class ; rdfs:label \"Owner\" .\n"
                            "test:%s a owl:DatatypeProperty ; rdfs:domain test:%s ; rdfs:range xsd:string ; rdfs:label \"Gone Prop\" .\n")
                     (name class-kw) (name prop-kw) (name class-kw))
        ttl-b  (format (str "@prefix test: <https://wikipunk.net/test/> .\n"
                            "@prefix owl:  <http://www.w3.org/2002/07/owl#> .\n"
                            "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n"
                            "test:%s a owl:Class ; rdfs:label \"Owner\" .\n")
                     (name class-kw))]
    (spit tmp ttl-a)
    (#'m/import-ontologies-once! conn [path])
    (let [db (d/db conn)]
      (is (ffirst (d/q '[:find ?e :in $ ?ident :where [?e :db/ident ?ident]] db class-kw)))
      (is (ffirst (d/q '[:find ?e :in $ ?ident :where [?e :db/ident ?ident]] db prop-kw))))
    (spit tmp ttl-b)
    (let [{:keys [tx-data]} (#'m/migration-retractions conn canon)]
      (is (seq tx-data))
      (is (some (fn [op]
                  (and (= :db/retract (first op))
                       (= :db/ident (nth op 2))
                       (= prop-kw (nth op 3))))
                tx-data)))
    (#'m/import-ontologies-once! conn [path])
    (let [db2 (d/db conn)]
      (is (ffirst (d/q '[:find ?e :in $ ?ident :where [?e :db/ident ?ident]] db2 class-kw)))
      (is (empty? (d/q '[:find ?e :in $ ?ident :where [?e :db/ident ?ident]] db2 prop-kw))))
    ;; ensure the property can be restored on re-import to avoid false positives
    (spit tmp ttl-a)
    (#'m/import-ontologies-once! conn [path])
    (let [db3 (d/db conn)]
      (is (ffirst (d/q '[:find ?e :in $ ?ident :where [?e :db/ident ?ident]] db3 prop-kw))))))

(deftest ontology-import-retires-orphaned-ttl
  (let [sys    repl/system
        conn   (get-in sys [:db :conn])
        _      (is conn)
        tmpdir (java.nio.file.Files/createTempDirectory "wp-retire" (make-array java.nio.file.attribute.FileAttribute 0))
        child  (.toFile (.resolve tmpdir "child.ttl"))
        root   (.toFile (.resolve tmpdir "root.ttl"))
        child-path (.getAbsolutePath child)
        root-path  (.getAbsolutePath root)
        child-iri  (str "file:" child-path)
        suffix     (subs (str (java.util.UUID/randomUUID)) 0 8)
        class-name (str "RetiredClass" suffix)
        prop-name  (str "retired-prop" suffix)
        class-kw   (keyword "test" class-name)
        prop-kw    (keyword "test" prop-name)
        child-ttl  (format (str "@prefix test: <https://wikipunk.net/test/> .\n"
                                "@prefix owl:  <http://www.w3.org/2002/07/owl#> .\n"
                                "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n"
                                "@prefix xsd:  <http://www.w3.org/2001/XMLSchema#> .\n\n"
                                "test:%s a owl:Class ; rdfs:label \"Retired\" .\n"
                                "test:%s a owl:DatatypeProperty ; rdfs:domain test:%s ; rdfs:range xsd:string .\n")
                              class-name prop-name class-name)
        root-with-import (format (str "@prefix owl: <http://www.w3.org/2002/07/owl#> .\n\n"
                                      "[] a owl:Ontology ; owl:imports <%s> .\n")
                                 child-iri)
        root-without-import "@prefix owl: <http://www.w3.org/2002/07/owl#> .\n\n# no imports\n"]
    (try
      (spit child child-ttl)
      (spit root root-with-import)
      (#'m/import-ontologies-once! conn [root-path] {:annotation-properties? false})
      (let [db (d/db conn)]
        (is (ffirst (d/q '[:find ?e :in $ ?ident :where [?e :db/ident ?ident]] db class-kw)))
        (is (ffirst (d/q '[:find ?e :in $ ?ident :where [?e :db/ident ?ident]] db prop-kw))))
      (spit root root-without-import)
      (#'m/import-ontologies-once! conn [root-path] {:annotation-properties? false})
      (let [db (d/db conn)]
        (is (empty? (d/q '[:find ?e :in $ ?ident :where [?e :db/ident ?ident]] db class-kw)))
        (is (empty? (d/q '[:find ?e :in $ ?ident :where [?e :db/ident ?ident]] db prop-kw))))
      (finally
        (java.nio.file.Files/deleteIfExists (.toPath child))
        (java.nio.file.Files/deleteIfExists (.toPath root))
        (java.nio.file.Files/deleteIfExists tmpdir)))))

(deftest ontology-reimport-preserves-unchanged-assertions
  (let [sys    repl/system
        conn   (get-in sys [:db :conn])
        _      (is conn)
        tmp    (doto (java.io.File/createTempFile "wp-preserve-" ".ttl") (.deleteOnExit))
        path   (.getAbsolutePath tmp)
        canon  (canonical-import-path path)
        suffix (subs (str (java.util.UUID/randomUUID)) 0 8)
        foo-kw (keyword "test" (str "Foo" suffix))
        base-ttl (str "@prefix test: <https://wikipunk.net/test/> .\n"
                      "@prefix owl:  <http://www.w3.org/2002/07/owl#> .\n"
                      "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n"
                      "test:Foo" suffix " a owl:Class ; rdfs:label \"Foo\" .\n")
        reformatted (str "@prefix test: <https://wikipunk.net/test/> .\n"
                          "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n"
                          "@prefix owl:  <http://www.w3.org/2002/07/owl#> .\n\n"
                          "# reordered prefixes but assert the same class\n"
                          "test:Foo" suffix " a owl:Class ;\n"
                          "    rdfs:label \"Foo\" .\n")]
    (spit tmp base-ttl)
    (#'m/import-ontologies-once! conn [path])
    (is (ffirst (d/q '[:find ?e :in $ ?ident :where [?e :db/ident ?ident]] (d/db conn) foo-kw)))
    (spit tmp reformatted)
    (let [{:keys [tx-data]} (#'m/migration-retractions conn canon)]
      (is (every? (fn [[_ _ attr & _]]
                    (not (#{:rdfs/label :rdfs/subClassOf} attr)))
                  tx-data)))
    (#'m/import-ontologies-once! conn [path])
    (let [db (d/db conn)]
      (is (label= "Foo" (:rdfs/label (d/pull db '[:rdfs/label] [:db/ident foo-kw])))))))

(deftest ontology-reimport-retains-subclass-for-custom-prefix
  (let [sys    repl/system
        conn   (get-in sys [:db :conn])
        _      (is conn)
        tmp    (doto (java.io.File/createTempFile "wp-prefix-" ".ttl") (.deleteOnExit))
        path   (.getAbsolutePath tmp)
        suffix (subs (str (java.util.UUID/randomUUID)) 0 8)
        base-kw (keyword "foo" (str "Base" suffix))
        child-kw (keyword "foo" (str "Derived" suffix))
        ttl-a  (str "@prefix foo: <https://example.org/> .\n"
                    "@prefix owl:  <http://www.w3.org/2002/07/owl#> .\n"
                    "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n"
                    "foo:Base" suffix " a owl:Class ;\n"
                    "    rdfs:label \"Base\" .\n"
                    "foo:Derived" suffix " a owl:Class ;\n"
                    "    rdfs:subClassOf foo:Base" suffix " ;\n"
                    "    rdfs:label \"Derived\" .\n")
        ttl-b  (str "@prefix foo: <https://example.org/> .\n"
                    "@prefix owl:  <http://www.w3.org/2002/07/owl#> .\n"
                    "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n"
                    "# tweak label but keep subclass assertion intact\n"
                    "foo:Base" suffix " a owl:Class ;\n"
                    "    rdfs:label \"Base Updated\" .\n"
                    "foo:Derived" suffix " a owl:Class ;\n"
                    "    rdfs:subClassOf foo:Base" suffix " ;\n"
                    "    rdfs:label \"Derived Updated\" .\n")]
    (spit tmp ttl-a)
    (#'m/import-ontologies-once! conn [path])
    (let [db (d/db conn)]
      (is (seq (d/q '[:find ?sup
                      :in $ ?child-ident ?sup-ident
                      :where
                      [?child :db/ident ?child-ident]
                      [?child :rdfs/subClassOf ?sup]
                      [?sup :db/ident ?sup-ident]]
                    db child-kw base-kw))))
    (spit tmp ttl-b)
    (#'m/import-ontologies-once! conn [path])
    (let [db (d/db conn)]
      (is (seq (d/q '[:find ?sup
                      :in $ ?child-ident ?sup-ident
                      :where
                      [?child :db/ident ?child-ident]
                      [?child :rdfs/subClassOf ?sup]
                      [?sup :db/ident ?sup-ident]]
                    db child-kw base-kw))))
    (java.nio.file.Files/deleteIfExists (.toPath tmp))))

(deftest ontology-reimport-renames-dont-leak-axioms
  (let [sys    repl/system
        conn   (get-in sys [:db :conn])
        _      (is conn)
        tmp    (doto (java.io.File/createTempFile "wp-rename-" ".ttl") (.deleteOnExit))
        path   (.getAbsolutePath tmp)
        canon  (canonical-import-path path)
        render (fn [suffix]
                 (str "@prefix test: <https://wikipunk.net/test/> .\n"
                      "@prefix owl:  <http://www.w3.org/2002/07/owl#> .\n"
                      "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n"
                      "test:Foo" suffix " a owl:Class ; rdfs:label \"Foo\" .\n"
                      "test:Bar" suffix " a owl:Class ; rdfs:label \"Bar\" .\n"))]
    (loop [suffixes []]
      (let [suffix (subs (str (java.util.UUID/randomUUID)) 0 8)
            foo-kw (keyword "test" (str "Foo" suffix))
            bar-kw (keyword "test" (str "Bar" suffix))]
        (spit tmp (render suffix))
        (#'m/import-ontologies-once! conn [path])
        (let [db (d/db conn)]
          ;; new classes are fully realized
          (is (label= "Foo" (:rdfs/label (d/pull db '[:rdfs/label] [:db/ident foo-kw]))))
          (is (label= "Bar" (:rdfs/label (d/pull db '[:rdfs/label] [:db/ident bar-kw]))))
          ;; prior suffixes retain only their ident stubs (no stray axioms)
          (doseq [prev suffixes
                  :let [foo-prev (keyword "test" (str "Foo" prev))
                        bar-prev (keyword "test" (str "Bar" prev))
                        foo-entity (d/pull db '[:db/id :db/ident :rdfs/label :rdf/type] [:db/ident foo-prev])
                        bar-entity (d/pull db '[:db/id :db/ident :rdfs/label :rdf/type] [:db/ident bar-prev])]]
            (when foo-entity
              (is (= #{:db/id :db/ident}
                     (set (keys foo-entity)))))
            (when bar-entity
              (is (= #{:db/id :db/ident}
                     (set (keys bar-entity)))))))
        (when (< (count suffixes) 4)
          (recur (conj suffixes suffix)))))))

(deftest ontology-transitive-leaf-change
  (let [sys repl/system
        conn (get-in sys [:db :conn])
        _   (is conn)
        tempdir (java.nio.file.Files/createTempDirectory "wp-transitive-tests" (make-array java.nio.file.attribute.FileAttribute 0))
        root   (.toFile (.resolve tempdir "root.ttl"))
        mid    (.toFile (.resolve tempdir "mid.ttl"))
        leaf   (.toFile (.resolve tempdir "leaf.ttl"))
        root-p (.getAbsolutePath root)
        mid-p  (.getAbsolutePath mid)
        leaf-p (.getAbsolutePath leaf)
        leaf-u (str "file:" leaf-p)
        mid-u  (str "file:" mid-p)
        render-leaf (fn [suffix]
                      (str "@prefix test: <https://wikipunk.net/test/> .\n"
                           "@prefix owl:  <http://www.w3.org/2002/07/owl#> .\n"
                           "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n"
                           "test:Leaf" suffix " a owl:Class ; rdfs:label \"Leaf\" .\n"))
        mid-content (str "@prefix owl: <http://www.w3.org/2002/07/owl#> .\n\n"
                         "[] a owl:Ontology ; owl:imports <" leaf-u "> .\n")
        root-content (str "@prefix owl: <http://www.w3.org/2002/07/owl#> .\n\n"
                          "[] a owl:Ontology ; owl:imports <" mid-u "> .\n")]
    (try
      (spit root root-content)
      (spit mid mid-content)
      (spit leaf (render-leaf "A"))
      (#'m/import-ontologies-once! conn [root-p])
      (let [db (d/db conn)]
        (is (ffirst (d/q '[:find ?e :where [?e :db/ident :test/LeafA]] db))))
      (spit leaf (render-leaf "B"))
      (#'m/import-ontologies-once! conn [root-p])
      (let [db (d/db conn)
            old (d/pull db '[:db/id :db/ident :rdfs/label :rdf/type] [:db/ident :test/LeafA])]
        (is (= #{:db/id :db/ident}
               (set (keys old))))
        (is (label= "Leaf" (:rdfs/label (d/pull db '[:rdfs/label] [:db/ident :test/LeafB])))))
      (finally
        (java.nio.file.Files/deleteIfExists (.toPath leaf))
        (java.nio.file.Files/deleteIfExists (.toPath mid))
        (java.nio.file.Files/deleteIfExists (.toPath root))
        (java.nio.file.Files/deleteIfExists tempdir)))))

(deftest ontology-shrink-and-expand
  (let [sys  repl/system
        conn (get-in sys [:db :conn])
        _    (is conn)
        tmp  (doto (java.io.File/createTempFile "wp-shrink-" ".ttl") (.deleteOnExit))
        path (.getAbsolutePath tmp)
        render (fn [idents]
                 (str "@prefix test: <https://wikipunk.net/test/> .\n"
                      "@prefix owl:  <http://www.w3.org/2002/07/owl#> .\n"
                      "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n"
                      (apply str (for [id idents]
                                   (format "test:%s a owl:Class ; rdfs:label \"%s\" .\n" id id)))))]
    (spit tmp (render ["Alpha" "Beta" "Gamma"]))
    (#'m/import-ontologies-once! conn [path])
    (let [db (d/db conn)]
      (doseq [id ["Alpha" "Beta" "Gamma"]]
        (is (label= id (:rdfs/label (d/pull db '[:rdfs/label] [:db/ident (keyword "test" id)]))))))
    (spit tmp (render ["Alpha"]))
    (#'m/import-ontologies-once! conn [path])
    (let [db (d/db conn)]
      (is (label= "Alpha" (:rdfs/label (d/pull db '[:rdfs/label] [:db/ident :test/Alpha]))))
      (doseq [id [:test/Beta :test/Gamma]]
        (is (empty? (label-values (:rdfs/label (d/pull db '[:rdfs/label] [:db/ident id])))))))
    (spit tmp (render ["Alpha" "Delta"]))
    (#'m/import-ontologies-once! conn [path])
    (let [db (d/db conn)]
      (is (label= "Alpha" (:rdfs/label (d/pull db '[:rdfs/label] [:db/ident :test/Alpha]))))
      (is (label= "Delta" (:rdfs/label (d/pull db '[:rdfs/label] [:db/ident :test/Delta]))))
      (doseq [id [:test/Beta :test/Gamma]]
        (is (empty? (label-values (:rdfs/label (d/pull db '[:rdfs/label] [:db/ident id])))))))))

(deftest ontology-shared-namespace-isolated
  (let [sys repl/system
        conn (get-in sys [:db :conn])
        _   (is conn)
        a   (doto (java.io.File/createTempFile "wp-ns-a-" ".ttl") (.deleteOnExit))
        b   (doto (java.io.File/createTempFile "wp-ns-b-" ".ttl") (.deleteOnExit))
        pa  (.getAbsolutePath a)
        pb  (.getAbsolutePath b)
        ns-id (subs (str (java.util.UUID/randomUUID)) 0 8)
        prefix (format "https://wikipunk.net/test/%s/" ns-id)
        temp-prefix (format "tmp%s" ns-id)
        ttl-a (format "@prefix %s: <%s> .\n@prefix owl: <http://www.w3.org/2002/07/owl#> .\n@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n%s:Foo a owl:Class ; rdfs:label \"Foo\" .\n" temp-prefix prefix temp-prefix)
        ttl-b1 (format "@prefix %s: <%s> .\n@prefix owl: <http://www.w3.org/2002/07/owl#> .\n@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n%s:Bar a owl:Class ; rdfs:label \"Bar\" .\n" temp-prefix prefix temp-prefix)
        ttl-b2 (format "@prefix %s: <%s> .\n@prefix owl: <http://www.w3.org/2002/07/owl#> .\n@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n" temp-prefix prefix)
        foo-ident (keyword temp-prefix "Foo")
        bar-ident (keyword temp-prefix "Bar")]
    (spit a ttl-a)
    (spit b ttl-b1)
    (#'m/import-ontologies-once! conn [pa pb])
    (let [db (d/db conn)]
      (is (label= "Foo" (:rdfs/label (d/pull db '[:rdfs/label] [:db/ident foo-ident]))))
      (is (label= "Bar" (:rdfs/label (d/pull db '[:rdfs/label] [:db/ident bar-ident])))))
    (spit b ttl-b2)
    (#'m/import-ontologies-once! conn [pb])
    (let [db (d/db conn)]
      (is (label= "Foo" (:rdfs/label (d/pull db '[:rdfs/label] [:db/ident foo-ident]))))
      (is (= #{:db/id :db/ident}
             (set (keys (d/pull db '[:db/id :db/ident :rdfs/label :rdf/type] [:db/ident bar-ident]))))))))

(deftest retiring-imported-module-retracts-entities
  (let [sys   repl/system
        conn  (get-in sys [:db :conn])
        _     (is conn)
        dir   (java.nio.file.Files/createTempDirectory
                "wp-retire-import-"
                (into-array java.nio.file.attribute.FileAttribute []))
        root  (doto (java.io.File. (.toFile dir) "root.ttl") (.deleteOnExit))
        child (doto (java.io.File. (.toFile dir) "bounty.ttl") (.deleteOnExit))
        root-path  (.getAbsolutePath root)
        prefix-id  (subs (str (java.util.UUID/randomUUID)) 0 8)
        prefix-ns  (format "https://wikipunk.net/test/%s/" prefix-id)
        prefix     (str "ret" prefix-id)
        bounty-ident (keyword prefix "Bounty")
        render-root (fn [with-import?]
                      (format "@prefix %s: <%s> .\n@prefix owl: <http://www.w3.org/2002/07/owl#> .\n@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n%s:Anchor a owl:Class ; rdfs:label \"Anchor\" .\n%s"
                              prefix prefix-ns prefix
                              (if with-import?
                                "[] a owl:Ontology ; owl:imports <bounty.ttl> .\n"
                                "[] a owl:Ontology .\n")))
        child-ttl   (format "@prefix %s: <%s> .\n@prefix owl: <http://www.w3.org/2002/07/owl#> .\n@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n%s:Bounty a owl:Class ; rdfs:label \"Bounty\" .\n"
                            prefix prefix-ns prefix)]
    (spit child child-ttl)
    (spit root (render-root true))
    (#'m/import-ontologies-once! conn [root-path])
    (let [db (d/db conn)]
      (is (label= "Bounty" (:rdfs/label (d/pull db '[:rdfs/label] [:db/ident bounty-ident])))))
    ;; Remove the import statement and re-import; the child class should retract.
    (spit root (render-root false))
    (#'m/import-ontologies-once! conn [root-path])
    (let [db (d/db conn)]
      (is (nil? (d/pull db '[:rdfs/label] [:db/ident bounty-ident]))))))

(deftest ontology-annotation-update
  (let [sys  repl/system
        conn (get-in sys [:db :conn])
        _    (is conn)
        tmp  (doto (java.io.File/createTempFile "wp-annot-" ".ttl") (.deleteOnExit))
        path (.getAbsolutePath tmp)
        render (fn [comment]
                 (str "@prefix test: <https://wikipunk.net/test/> .\n"
                      "@prefix owl:  <http://www.w3.org/2002/07/owl#> .\n"
                      "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n"
                      "test:Note a owl:Class ; rdfs:label \"Note\" ; rdfs:comment \"" comment "\" .\n"))]
    (spit tmp (render "Initial"))
    (#'m/import-ontologies-once! conn [path])
    (spit tmp (render "Updated"))
    (#'m/import-ontologies-once! conn [path])
    (let [db (d/db conn)]
      (is (= #{"Updated"}
             (set (map first (d/q '[:find ?c :where [:test/Note :rdfs/comment ?c]] db))))))))

(deftest ontology-annotation-toggle
  (let [sys          repl/system
        conn         (get-in sys [:db :conn])
        _            (is conn)
        tmp          (doto (java.io.File/createTempFile "wp-annot-toggle-" ".ttl") (.deleteOnExit))
        path         (.getAbsolutePath tmp)
        suffix       (subs (str (java.util.UUID/randomUUID)) 0 8)
        prefix-name  (str "annt" suffix)
        prefix-iri   (format "https://wikipunk.net/test/%s/" prefix-name)
        ident        (keyword prefix-name "Foo")
        render       (fn [label comment]
                       (format "@prefix %s: <%s> .\n@prefix owl:  <http://www.w3.org/2002/07/owl#> .\n@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n%s:Foo a owl:Class ; rdfs:label \"%s\" ; rdfs:comment \"%s\" .\n"
                               prefix-name prefix-iri prefix-name label comment))]
    (spit tmp (render "Disabled Label" "Disabled Comment"))
    (#'m/import-ontologies-once! conn [path] {:annotation-properties? false})
    (let [db     (d/db conn)
          pulled (d/pull db '[:db/id :rdfs/label :rdfs/comment {:rdf/type [:db/ident]}] [:db/ident ident])]
      (is (contains? (set (map :db/ident (:rdf/type pulled))) :owl/Class)
          "Entity is installed with expected class type")
      (is (nil? (:rdfs/label pulled)) "Label is absent when annotations disabled")
      (is (nil? (:rdfs/comment pulled)) "Comment is absent when annotations disabled"))
    (spit tmp (render "Enabled Label" "Enabled Comment"))
    (#'m/import-ontologies-once! conn [path] {:annotation-properties? true})
    (let [db (d/db conn)
          pulled (d/pull db '[:rdfs/label :rdfs/comment] [:db/ident ident])]
      (is (label= "Enabled Label" (:rdfs/label pulled)))
      (is (= ["Enabled Comment"]
             (vec (:rdfs/comment pulled)))))))

(deftest annotation-property-range-infers-datomic-type
  (let [sys  repl/system
        conn (get-in sys [:db :conn])
        _    (is conn)
        tmp  (doto (java.io.File/createTempFile "wp-annot-range-" ".ttl") (.deleteOnExit))
        path (.getAbsolutePath tmp)
        ttl  (str "@prefix ex: <https://wikipunk.net/test/> .\n"
                  "@prefix owl: <http://www.w3.org/2002/07/owl#> .\n"
                  "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n"
                  "@prefix xsd: <http://www.w3.org/2001/XMLSchema#> .\n"
                  "@prefix dcterms: <http://purl.org/dc/terms/> .\n\n"
                  "ex:BooleanAnn a owl:AnnotationProperty ; rdfs:range xsd:boolean .\n"
                  "ex:LicenseRef a owl:AnnotationProperty ; rdfs:range dcterms:LicenseDocument .\n"
                  "ex:LiteralAnn a owl:AnnotationProperty ; rdfs:range rdfs:Literal .\n")]
    (spit tmp ttl)
    (#'m/import-ontologies-once! conn [path])
    (let [db (d/db conn)
          vt (fn [attr]
               (ffirst (d/q '[:find ?ident
                              :in $ ?attr
                              :where
                              [?e :db/ident ?attr]
                              [?e :db/valueType ?vt]
                              [?vt :db/ident ?ident]]
                            db attr)))]
      (is (= :db.type/boolean (vt :ex/BooleanAnn)))
      (is (= :db.type/ref (vt :ex/LicenseRef)))
      (is (= :db.type/string (vt :ex/LiteralAnn)))))) 

(deftest ontology-noop-reimport
  (let [sys  repl/system
        conn (get-in sys [:db :conn])
        _    (is conn)
        tmp  (doto (java.io.File/createTempFile "wp-noop-" ".ttl") (.deleteOnExit))
        path (.getAbsolutePath tmp)
        ttl  (str "@prefix test: <https://wikipunk.net/test/> .\n"
                  "@prefix owl:  <http://www.w3.org/2002/07/owl#> .\n"
                  "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n"
                  "test:Stable a owl:Class ; rdfs:label \"Stable\" .\n")]
    (spit tmp ttl)
    (#'m/import-ontologies-once! conn [path])
    (let [db (d/db conn)
          id (canonical-import-id path)]
      (is (= 1 (count (d/q '[:find ?e :in $ ?id :where [?e :punk.migration/id ?id]] db id)))))
    (#'m/import-ontologies-once! conn [path])
    (let [db (d/db conn)
          id (canonical-import-id path)]
      (is (= 1 (count (d/q '[:find ?e :in $ ?id :where [?e :punk.migration/id ?id]] db id)))))))
