(ns net.wikipunk.rdf.wo
  "http://purl.org/ontology/wo/core#"
  {:dc11/creator "http://foaf.me/zazi#me",
   :dc11/date #inst "2010-09-14T10:40:52.000-00:00",
   :dc11/description
   {:rdf/language "en",
    :rdf/value
    "A vocabulary for describing weightings and their referenced scales."},
   :dc11/title {:rdf/language "en",
                :rdf/value    "Weighting Ontology"},
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
   :vann/preferredNamespaceUri "http://purl.org/ontology/wo/core#"})

(def Scale
  "A concept for describing scales for weights."
  {:db/ident         :wo/Scale,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A concept for describing scales for weights."},
   :rdfs/isDefinedBy "http://purl.org/ontology/wo/core#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Scale"},
   :rdfs/subClassOf  :scovo/Dimension,
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "unstable"}})

(def Weight
  "A weight class to enable timestamped (etc.) weights."
  {:db/ident :wo/Weight,
   :owl/equivalentClass {:owl/cardinality 1,
                         :owl/onProperty  :wo/weight_value,
                         :rdf/type        :owl/Restriction},
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "A weight class to enable timestamped (etc.) weights."},
   :rdfs/isDefinedBy "http://purl.org/ontology/wo/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Weight"},
   :rdfs/subClassOf :scovo/Item,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "testing"}})

(def max_weight
  "A maximum weight of a scale."
  {:db/ident           :wo/max_weight,
   :rdf/type           [:rdf/Property
                        :owl/FunctionalProperty
                        :owl/DatatypeProperty],
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "A maximum weight of a scale."},
   :rdfs/domain        :wo/Scale,
   :rdfs/isDefinedBy   "http://purl.org/ontology/wo/core#",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has max weight"},
   :rdfs/range         :xsd/decimal,
   :rdfs/subPropertyOf [:rev/maxRating :scovo/max],
   :vs/term_status     {:rdf/language "en",
                        :rdf/value    "unstable"}})

(def min_weight
  "A minimum weight of a scale."
  {:db/ident           :wo/min_weight,
   :rdf/type           [:rdf/Property
                        :owl/DatatypeProperty
                        :owl/FunctionalProperty],
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "A minimum weight of a scale."},
   :rdfs/domain        :wo/Scale,
   :rdfs/isDefinedBy   "http://purl.org/ontology/wo/core#",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has min weight"},
   :rdfs/range         :xsd/decimal,
   :rdfs/subPropertyOf [:rev/minRating :scovo/min],
   :vs/term_status     {:rdf/language "en",
                        :rdf/value    "unstable"}})

(def scale
  "A scale for the weighting of some relation."
  {:db/ident           :wo/scale,
   :rdf/type           [:owl/FunctionalProperty
                        :rdf/Property
                        :owl/ObjectProperty],
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "A scale for the weighting of some relation."},
   :rdfs/domain        :wo/Weight,
   :rdfs/isDefinedBy   "http://purl.org/ontology/wo/core#",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has scale"},
   :rdfs/range         :wo/Scale,
   :rdfs/subPropertyOf :scovo/dimension,
   :vs/term_status     {:rdf/language "en",
                        :rdf/value    "unstable"}})

(def step_size
  "A predefined step size for weight of a specific scale."
  {:db/ident         :wo/step_size,
   :rdf/type         [:owl/DatatypeProperty
                      :rdf/Property
                      :owl/FunctionalProperty],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A predefined step size for weight of a specific scale."},
   :rdfs/domain      :wo/Scale,
   :rdfs/isDefinedBy "http://purl.org/ontology/wo/core#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has step size"},
   :rdfs/range       :xsd/decimal,
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "unstable"}})

(def weight
  "The weight on some relation, e.g. a interest in a topic, or of an interest that is valid for a specific period of time or was raised up in a specific period of time."
  {:db/ident :wo/weight,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The weight on some relation, e.g. a interest in a topic, or of an interest that is valid for a specific period of time or was raised up in a specific period of time."},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "http://purl.org/ontology/wo/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has weight"},
   :rdfs/range :wo/Weight,
   :rdfs/subPropertyOf :event/factor,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "unstable"}})

(def weight_value
  "The specific value of a weight."
  {:db/ident         :wo/weight_value,
   :rdf/type         [:owl/FunctionalProperty
                      :owl/DatatypeProperty
                      :rdf/Property],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The specific value of a weight."},
   :rdfs/domain      :wo/Weight,
   :rdfs/isDefinedBy "http://purl.org/ontology/wo/core#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has weight value"},
   :rdfs/range       :xsd/decimal,
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "testing"}})