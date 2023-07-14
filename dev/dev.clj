(ns dev
  "Tools for interactive development with the REPL. This file should
  not be included in a production build of the application.
  Call `(reset)` to reload modified code and (re)start the system.
  The system under development is `system`, referred from
  `com.stuartsierra.component.repl/system`.
  See also https://github.com/stuartsierra/component.repl"
  (:require
   [arachne.aristotle :as a]
   [arachne.aristotle.query :as q]
   [arachne.aristotle.registry :as reg]
   [arachne.aristotle.graph :as g]
   [clojure.core.async :as async]
   [clojure.datafy :refer [datafy]]
   [clojure.data.json :as json]
   [clojure.data.fressian :as fressian]
   [clojure.data.int-map :as int-map]
   [clojure.data.xml :as xml]
   [clojure.edn :as edn]
   [clojure.java.io :as io]
   [clojure.java.javadoc :refer [javadoc]]
   [clojure.java.shell :as sh :refer [sh]]
   [clojure.math.combinatorics :as math]
   [clojure.pprint :refer [pprint pp]]
   [clojure.reflect :refer [reflect]]
   [clojure.repl :refer [apropos dir find-doc pst source]]
   [clojure.set :as set]
   [clojure.string :as str]
   [clojure.tools.namespace.repl :refer [refresh refresh-all clear]]
   [clojure.tools.logging :as log]
   [clojure.walk :as walk]
   [com.stuartsierra.component :as com]
   [com.stuartsierra.component.repl :refer [reset set-init start stop system]]
   [com.walmartlabs.schematic :as sc]
   [ont-app.vocabulary.lstr :as lstr]
   [net.wikipunk.boot :as boot]
   [net.wikipunk.ext :as ext]
   [net.wikipunk.rdf :as rdf :refer [doc]]
   [net.wikipunk.mop :as mop]
   [taoensso.nippy :as nippy]
   [xtdb.api :as xt]
   [zprint.core :as zprint]
   [datomic.client.api :as d]
   [net.wikipunk.datomic :as datomic]
   [net.wikipunk.datomic.boot :as db]))

(set-init
  (fn [_]
    (set! *print-namespace-maps* false)
    (if-let [r (io/resource "system.edn")]
      (-> (slurp r)
          (edn/read-string)
          (sc/assemble-system))
      (throw (ex-info "system.edn is not on classpath" {})))))

(defmacro inspect
  "Evaluate forms in an implicit do and inspect the value of the last
  expression using Reveal."
  [& body]
  `(do (@user/reveal (do ~@body))
       true))

(comment
  (rdf/emit (:vocab system) nil))

(prefer-method db/infer-datomic-type :dc11/description :owl/AnnotationProperty)
(prefer-method db/infer-datomic-type :dcterms/source :owl/AnnotationProperty)
(defmethod db/infer-datomic-type :dcterms/source [_] :db.type/string)
(defmethod db/infer-datomic-type :dc11/rights [_] :db.type/string)
(defmethod db/infer-datomic-type :dc11/contributor [_] :db.type/string)
(prefer-method db/infer-datomic-type :dc11/contributor :owl/AnnotationProperty)
(prefer-method db/infer-datomic-type :dc11/contributor :dc11/creator)
(prefer-method db/infer-datomic-type :dc11/rights :owl/AnnotationProperty)
(prefer-method db/infer-datomic-type :dc11/date :owl/AnnotationProperty)
(prefer-method db/infer-datomic-type :dc11/title :owl/AnnotationProperty)
(prefer-method db/infer-datomic-type :dc11/creator :owl/AnnotationProperty)
(defmethod db/infer-datomic-type :cmns-txt/hasTextValue [_] :db.type/string)
(defmethod db/infer-datomic-type :lcc-lr/hasName [_] :db.type/string)
(defmethod db/infer-datomic-type :fibo-sec-sec-lst/hasListingDate [_] :db.type/string)
(defmethod db/infer-datomic-type :fibo-fnd-plc-adr/requiresSecondaryUnitRange [_] :db.type/boolean)
(defmethod db/infer-datomic-type :cmns-dt/hasObservedDateTime [_] :db.type/instant)
(defmethod db/infer-datomic-type :fibo-fnd-plc-loc/hasCityName [_] :db.type/string)
(defmethod db/infer-datomic-type :fibo-fnd-utl-alx/isCalculatedViaMethodology [_] :db.type/string)
(defmethod db/infer-datomic-type :fibo-fbc-fct-ra/hasRegistrationDate [_] :db.type/string)
(defmethod db/infer-datomic-type :fibo-fbc-fct-breg/hasRenewalDate [_] :db.type/instant)
(defmethod db/infer-datomic-type :fibo-fbc-fct-breg/hasRegistrationRevisionDate [_] :db.type/instant)
(defmethod db/infer-datomic-type :fibo-fbc-fct-breg/hasInitialRegistrationDate [_] :db.type/instant)
(defmethod db/infer-datomic-type :rdfs/label [_] :db.type/string)
(prefer-method db/infer-datomic-type :rdfs/label :owl/AnnotationProperty)
(prefer-method db/infer-datomic-type :dc11/title :rdfs/label)
(defmethod db/infer-datomic-type :qudt/elementTypeCount [_] :db.type/long)
(defmethod db/infer-datomic-type :xsd/integer [_] :db.type/long)
(defmethod db/infer-datomic-type :qudt/conversionMultiplier [_] :db.type/ref)
(defmethod db/infer-datomic-type :qudt/literal [_] :db.type/string)
(defmethod db/infer-datomic-type :qudt/omUnit [_] :db.type/string)
(defmethod db/infer-datomic-type :qudt/dimensionlessExponent [_] :db.type/long)
(defmethod db/infer-datomic-type :qudt/code [_] :db.type/long)
(defmethod db/infer-datomic-type :qudt/lowerBound [_] :db.type/ref)
(defmethod db/infer-datomic-type :qudt/upperBound [_] :db.type/ref)
(defmethod db/infer-datomic-type :qudt/rgbCode [_] :db.type/string)
(defmethod db/infer-datomic-type :qudt/numericValue [_] :db.type/double)
(defmethod db/infer-datomic-type :vaem/acronym [_] :db.type/string)
(defmethod db/infer-datomic-type :schema/keywords [_] :db.type/string)

#_(set! *data-readers* (assoc *data-readers* 'xsd/string (fn [form]
                                                         (with-meta {:rdf/type  :xsd/string
                                                                     :rdf/value (str form)}
                                                           {:type :xsd/string}))))

