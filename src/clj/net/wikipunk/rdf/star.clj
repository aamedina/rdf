(ns net.wikipunk.rdf.star
  "RDF* functions"
  (:require
   [clojure.string :as str]
   [net.wikipunk.rdf :as rdf]
   [zprint.core :as zprint]))

(defn parse-rdf*
  "Parse RDF* metadata from x."
  [x]
  (let [model (rdf/parse x)]
    (->> (group-by (comp :rdf/subject :db/ident) model)
         (reduce-kv (fn [forms k v]
                      (conj forms (reduce (fn [m x]
                                            (-> m
                                                (assoc (:rdf/predicate (:db/ident x))
                                                       (:rdf/object (:db/ident x)))
                                                (vary-meta assoc
                                                           [(:rdf/subject (:db/ident x))
                                                            (:rdf/predicate (:db/ident x))
                                                            (:rdf/object (:db/ident x))]
                                                           (dissoc x :db/ident))))
                                          {:db/ident k}
                                          v)))
                    (with-meta [] (meta model))))))

(defn emit-rdf*
  "Emit Clojure namespace with subjects annotated with metadata using
  RDF*.

  You may have to add :refer-clojure :exclude [exclusions] to
  generated ns metadata."
  [x & {:as arg-map}]
  (let [model (parse-rdf* x)
        md    (meta model)]
    (if-some [prefix (or (:prefix arg-map)
                         (:rdfa/prefix md)
                         (:vann/preferredNamespacePrefix md))]
      (spit (str (or (:target arg-map) rdf/*target*)
                 (namespace-munge (str/replace prefix #"\." "/"))
                 ".cljc")
            (binding [*print-namespace-maps* nil
                      *print-meta*           true]
              (let [forms (cons `(~'ns ~(symbol (str rdf/*ns-prefix* prefix))
                                  ~(or (:doc md) "RDF*")
                                  ~(merge md arg-map))
                                (map (fn [m]
                                       (list 'def (with-meta (symbol (name (:db/ident m))) (meta m)) m))
                                     model))]
                (with-out-str
                  (doseq [form forms]
                    (zprint/zprint form {:map    {:justify?      true
                                                  :nl-separator? false
                                                  :hang?         true
                                                  :indent        0
                                                  :sort-in-code? true
                                                  :force-nl?     true}
                                         :vector {:wrap? false}})
                    (newline))))))
      (zprint/zprint model))))
