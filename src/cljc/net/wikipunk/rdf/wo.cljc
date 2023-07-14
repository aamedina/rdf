(ns net.wikipunk.rdf.wo
  "A vocabulary for describing weightings and their referenced scales."
  {:dc11/creator {:rdfa/uri "http://foaf.me/zazi#me"},
   :dc11/date #xsd/dateTime #inst "2010-09-14T10:40:52.000+00:00",
   :dc11/description
   #xsd/langString
    "A vocabulary for describing weightings and their referenced scales.@en",
   :dc11/title #xsd/langString "Weighting Ontology@en",
   :dcat/downloadURL "http://purl.org/ontology/wo/weightingontology.owl",
   :owl/imports [{:rdfa/uri "http://purl.org/NET/scovo"}
                 {:rdfa/uri "http://www.w3.org/2003/06/sw-vocab-status/ns"}
                 {:rdfa/uri "http://purl.org/stuff/rev"}
                 {:rdfa/uri "http://purl.org/NET/c4dm/event.owl"}
                 {:rdfa/uri "http://purl.org/vocab/vann/"}
                 {:rdfa/uri "http://purl.org/dc/elements/1.1/"}],
   :owl/versionInfo #xsd/decimal 0.1M,
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
   :vann/preferredNamespacePrefix #xsd/string "wo",
   :vann/preferredNamespaceUri #xsd/string "http://purl.org/ontology/wo/core#"})

(def Scale
  "A concept for describing scales for weights."
  {:db/ident         :wo/Scale,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     #xsd/langString
                      "A concept for describing scales for weights.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/wo/core#"},
   :rdfs/label       #xsd/langString "Scale@en",
   :rdfs/subClassOf  [:rdfs/Resource :scovo/Dimension],
   :vs/term_status   #xsd/langString "unstable@en"})

(def Weight
  "A weight class to enable timestamped (etc.) weights."
  {:db/ident :wo/Weight,
   :owl/equivalentClass {:owl/cardinality #xsd/nonNegativeInteger 1,
                         :owl/onProperty  :wo/weight_value,
                         :rdf/type        :owl/Restriction},
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment #xsd/langString
                  "A weight class to enable timestamped (etc.) weights.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/wo/core#"},
   :rdfs/label #xsd/langString "Weight@en",
   :rdfs/subClassOf [:rdfs/Resource :scovo/Item],
   :vs/term_status #xsd/langString "testing@en"})

(def max_weight
  "A maximum weight of a scale."
  {:db/ident           :wo/max_weight,
   :rdf/type           [:rdf/Property
                        :owl/FunctionalProperty
                        :owl/DatatypeProperty],
   :rdfs/comment       #xsd/langString "A maximum weight of a scale.@en",
   :rdfs/domain        :wo/Scale,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/wo/core#"},
   :rdfs/label         #xsd/langString "has max weight@en",
   :rdfs/range         :xsd/decimal,
   :rdfs/subPropertyOf [:rev/maxRating :scovo/max],
   :vs/term_status     #xsd/langString "unstable@en"})

(def min_weight
  "A minimum weight of a scale."
  {:db/ident           :wo/min_weight,
   :rdf/type           [:rdf/Property
                        :owl/DatatypeProperty
                        :owl/FunctionalProperty],
   :rdfs/comment       #xsd/langString "A minimum weight of a scale.@en",
   :rdfs/domain        :wo/Scale,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/wo/core#"},
   :rdfs/label         #xsd/langString "has min weight@en",
   :rdfs/range         :xsd/decimal,
   :rdfs/subPropertyOf [:rev/minRating :scovo/min],
   :vs/term_status     #xsd/langString "unstable@en"})

(def scale
  "A scale for the weighting of some relation."
  {:db/ident           :wo/scale,
   :rdf/type           [:owl/FunctionalProperty
                        :rdf/Property
                        :owl/ObjectProperty],
   :rdfs/comment       #xsd/langString
                        "A scale for the weighting of some relation.@en",
   :rdfs/domain        :wo/Weight,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/wo/core#"},
   :rdfs/label         #xsd/langString "has scale@en",
   :rdfs/range         :wo/Scale,
   :rdfs/subPropertyOf :scovo/dimension,
   :vs/term_status     #xsd/langString "unstable@en"})

(def step_size
  "A predefined step size for weight of a specific scale."
  {:db/ident :wo/step_size,
   :rdf/type [:owl/DatatypeProperty :rdf/Property :owl/FunctionalProperty],
   :rdfs/comment #xsd/langString
                  "A predefined step size for weight of a specific scale.@en",
   :rdfs/domain :wo/Scale,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/wo/core#"},
   :rdfs/label #xsd/langString "has step size@en",
   :rdfs/range :xsd/decimal,
   :vs/term_status #xsd/langString "unstable@en"})

(def weight
  "The weight on some relation, e.g. a interest in a topic, or of an interest that is valid for a specific period of time or was raised up in a specific period of time."
  {:db/ident :wo/weight,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #xsd/langString
    "The weight on some relation, e.g. a interest in a topic, or of an interest that is valid for a specific period of time or was raised up in a specific period of time.@en",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/wo/core#"},
   :rdfs/label #xsd/langString "has weight@en",
   :rdfs/range :wo/Weight,
   :rdfs/subPropertyOf :event/factor,
   :vs/term_status #xsd/langString "unstable@en"})

(def weight_value
  "The specific value of a weight."
  {:db/ident         :wo/weight_value,
   :rdf/type         [:owl/FunctionalProperty
                      :owl/DatatypeProperty
                      :rdf/Property],
   :rdfs/comment     #xsd/langString "The specific value of a weight.@en",
   :rdfs/domain      :wo/Weight,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/wo/core#"},
   :rdfs/label       #xsd/langString "has weight value@en",
   :rdfs/range       :xsd/decimal,
   :vs/term_status   #xsd/langString "testing@en"})