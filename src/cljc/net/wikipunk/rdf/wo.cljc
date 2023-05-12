(ns net.wikipunk.rdf.wo
  "http://purl.org/ontology/wo/core#"
  {:dc11/creator "http://foaf.me/zazi#me",
   :dc11/date #inst "2010-09-14T10:40:52.000-00:00",
   :dc11/description
   "A vocabulary for describing weightings and their referenced scales.",
   :dc11/title "Weighting Ontology",
   :dcat/downloadURL "http://purl.org/ontology/wo/weightingontology.owl",
   :owl/imports ["http://purl.org/NET/scovo"
                 "http://www.w3.org/2003/06/sw-vocab-status/ns"
                 "http://purl.org/stuff/rev"
                 "http://purl.org/NET/c4dm/event.owl"
                 "http://purl.org/vocab/vann/"
                 "http://purl.org/dc/elements/1.1/"],
   :owl/versionInfo 0.1M,
   :rdf/ns-prefix-map {"dc11"  "http://purl.org/dc/elements/1.1/",
                       "event" "http://purl.org/NET/c4dm/event.owl#",
                       "owl"   "http://www.w3.org/2002/07/owl#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "rev"   "http://purl.org/stuff/rev#",
                       "scovo" "http://purl.org/NET/scovo#",
                       "vann"  "http://purl.org/vocab/vann/",
                       "vs"    "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "wo"    "http://purl.org/ontology/wo/core#",
                       "xsd"   "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "wo",
   :rdfa/uri "http://purl.org/ontology/wo/core#",
   :vann/preferredNamespacePrefix "wo",
   :vann/preferredNamespaceUri "http://purl.org/ontology/wo/core#"}
  (:refer-clojure :exclude [max min]))

(def Scale
  "A concept for describing scales for weights."
  {:db/ident         :wo/Scale,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "A concept for describing scales for weights.",
   :rdfs/isDefinedBy "http://purl.org/ontology/wo/core#",
   :rdfs/label       "Scale",
   :rdfs/subClassOf  [:rdfs/Resource :scovo/Dimension :wo/Scale],
   :vs/term_status   "unstable"})

(def Weight
  "A weight class to enable timestamped (etc.) weights."
  {:db/ident            :wo/Weight,
   :owl/equivalentClass {:owl/cardinality 1,
                         :owl/onProperty  :wo/weight_value,
                         :rdf/type        :owl/Restriction},
   :rdf/type            [:owl/Class :rdfs/Class],
   :rdfs/comment        "A weight class to enable timestamped (etc.) weights.",
   :rdfs/isDefinedBy    "http://purl.org/ontology/wo/core#",
   :rdfs/label          "Weight",
   :rdfs/subClassOf     [:rdfs/Resource :scovo/Item :wo/Weight],
   :vs/term_status      "testing"})

(def max_weight
  "A maximum weight of a scale."
  {:db/ident           :wo/max_weight,
   :rdf/type           [:rdf/Property
                        :owl/FunctionalProperty
                        :owl/DatatypeProperty],
   :rdfs/comment       "A maximum weight of a scale.",
   :rdfs/domain        :wo/Scale,
   :rdfs/isDefinedBy   "http://purl.org/ontology/wo/core#",
   :rdfs/label         "has max weight",
   :rdfs/range         :xsd/decimal,
   :rdfs/subPropertyOf [:rev/maxRating :scovo/max :wo/max_weight],
   :vs/term_status     "unstable"})

(def min_weight
  "A minimum weight of a scale."
  {:db/ident           :wo/min_weight,
   :rdf/type           [:rdf/Property
                        :owl/DatatypeProperty
                        :owl/FunctionalProperty],
   :rdfs/comment       "A minimum weight of a scale.",
   :rdfs/domain        :wo/Scale,
   :rdfs/isDefinedBy   "http://purl.org/ontology/wo/core#",
   :rdfs/label         "has min weight",
   :rdfs/range         :xsd/decimal,
   :rdfs/subPropertyOf [:rev/minRating :scovo/min :wo/min_weight],
   :vs/term_status     "unstable"})

(def scale
  "A scale for the weighting of some relation."
  {:db/ident           :wo/scale,
   :rdf/type           [:owl/FunctionalProperty
                        :rdf/Property
                        :owl/ObjectProperty],
   :rdfs/comment       "A scale for the weighting of some relation.",
   :rdfs/domain        :wo/Weight,
   :rdfs/isDefinedBy   "http://purl.org/ontology/wo/core#",
   :rdfs/label         "has scale",
   :rdfs/range         :wo/Scale,
   :rdfs/subPropertyOf [:scovo/dimension :wo/scale],
   :vs/term_status     "unstable"})

(def step_size
  "A predefined step size for weight of a specific scale."
  {:db/ident           :wo/step_size,
   :rdf/type           [:owl/DatatypeProperty
                        :rdf/Property
                        :owl/FunctionalProperty],
   :rdfs/comment       "A predefined step size for weight of a specific scale.",
   :rdfs/domain        :wo/Scale,
   :rdfs/isDefinedBy   "http://purl.org/ontology/wo/core#",
   :rdfs/label         "has step size",
   :rdfs/range         :xsd/decimal,
   :rdfs/subPropertyOf :wo/step_size,
   :vs/term_status     "unstable"})

(def weight
  "The weight on some relation, e.g. a interest in a topic, or of an interest that is valid for a specific period of time or was raised up in a specific period of time."
  {:db/ident :wo/weight,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   "The weight on some relation, e.g. a interest in a topic, or of an interest that is valid for a specific period of time or was raised up in a specific period of time.",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "http://purl.org/ontology/wo/core#",
   :rdfs/label "has weight",
   :rdfs/range :wo/Weight,
   :rdfs/subPropertyOf [:event/factor :wo/weight],
   :vs/term_status "unstable"})

(def weight_value
  "The specific value of a weight."
  {:db/ident           :wo/weight_value,
   :rdf/type           [:owl/FunctionalProperty
                        :owl/DatatypeProperty
                        :rdf/Property],
   :rdfs/comment       "The specific value of a weight.",
   :rdfs/domain        :wo/Weight,
   :rdfs/isDefinedBy   "http://purl.org/ontology/wo/core#",
   :rdfs/label         "has weight value",
   :rdfs/range         :xsd/decimal,
   :rdfs/subPropertyOf :wo/weight_value,
   :vs/term_status     "testing"})

(def ^{:private true} factor
  {:db/ident :event/factor,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf :event/factor})

(def ^{:private true} maxRating
  {:db/ident :rev/maxRating,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf :rev/maxRating})

(def ^{:private true} minRating
  {:db/ident :rev/minRating,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf :rev/minRating})

(def ^{:private true} Dimension
  {:db/ident        :scovo/Dimension,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :scovo/Dimension})

(def ^{:private true} Item
  {:db/ident        :scovo/Item,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :scovo/Item})

(def ^{:private true} dimension
  {:db/ident :scovo/dimension,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf :scovo/dimension})

(def ^{:private true} max
  {:db/ident :scovo/max,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf :scovo/max})

(def ^{:private true} min
  {:db/ident :scovo/min,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf :scovo/min})