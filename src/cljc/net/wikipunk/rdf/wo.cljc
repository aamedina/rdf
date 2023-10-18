(ns net.wikipunk.rdf.wo
  {:dc11/creator {:xsd/anyURI "http://foaf.me/zazi#me"},
   :dc11/date #inst "2010-09-14T10:40:52.000-00:00",
   :dc11/description
   {:rdf/language "en",
    :rdf/value
    "A vocabulary for describing weightings and their referenced scales."},
   :dc11/title {:rdf/language "en",
                :rdf/value    "Weighting Ontology"},
   :dcat/downloadURL "http://purl.org/ontology/wo/weightingontology.owl",
   :namespaces {"dc11"  "http://purl.org/dc/elements/1.1/",
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
   :owl/imports #{{:xsd/anyURI "http://purl.org/stuff/rev"}
                  {:xsd/anyURI "http://www.w3.org/2003/06/sw-vocab-status/ns"}
                  {:xsd/anyURI "http://purl.org/vocab/vann/"}
                  {:xsd/anyURI "http://purl.org/dc/elements/1.1/"}
                  {:xsd/anyURI "http://purl.org/NET/c4dm/event.owl"}
                  {:xsd/anyURI "http://purl.org/NET/scovo"}},
   :owl/versionInfo 0.1M,
   :rdf/type :owl/Ontology,
   :rdfa/prefix "wo",
   :rdfa/uri "http://purl.org/ontology/wo/core#",
   :vann/preferredNamespacePrefix "wo",
   :vann/preferredNamespaceUri "http://purl.org/ontology/wo/core#",
   :xsd/anyURI "http://purl.org/ontology/wo/core#"})

(def Scale
  {:db/ident         :wo/Scale,
   :rdf/type         #{:rdfs/Class :owl/Class},
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A concept for describing scales for weights."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/wo/core#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Scale"},
   :rdfs/subClassOf  :scovo/Dimension,
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "unstable"}})

(def Weight
  {:db/ident :wo/Weight,
   :owl/equivalentClass {:owl/cardinality 1,
                         :owl/onProperty  :wo/weight_value,
                         :rdf/type        :owl/Restriction},
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "A weight class to enable timestamped (etc.) weights."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/wo/core#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Weight"},
   :rdfs/subClassOf :scovo/Item,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "testing"}})

(def max_weight
  {:db/ident           :wo/max_weight,
   :rdf/type           #{:owl/DatatypeProperty :rdf/Property
                         :owl/FunctionalProperty},
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "A maximum weight of a scale."},
   :rdfs/domain        :wo/Scale,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/ontology/wo/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has max weight"},
   :rdfs/range         :xsd/decimal,
   :rdfs/subPropertyOf #{:rev/maxRating :scovo/max},
   :vs/term_status     {:rdf/language "en",
                        :rdf/value    "unstable"}})

(def min_weight
  {:db/ident           :wo/min_weight,
   :rdf/type           #{:owl/DatatypeProperty :rdf/Property
                         :owl/FunctionalProperty},
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "A minimum weight of a scale."},
   :rdfs/domain        :wo/Scale,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/ontology/wo/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has min weight"},
   :rdfs/range         :xsd/decimal,
   :rdfs/subPropertyOf #{:scovo/min :rev/minRating},
   :vs/term_status     {:rdf/language "en",
                        :rdf/value    "unstable"}})

(def scale
  {:db/ident           :wo/scale,
   :rdf/type           #{:owl/ObjectProperty :rdf/Property
                         :owl/FunctionalProperty},
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "A scale for the weighting of some relation."},
   :rdfs/domain        :wo/Weight,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/ontology/wo/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has scale"},
   :rdfs/range         :wo/Scale,
   :rdfs/subPropertyOf :scovo/dimension,
   :vs/term_status     {:rdf/language "en",
                        :rdf/value    "unstable"}})

(def step_size
  {:db/ident         :wo/step_size,
   :rdf/type         #{:owl/DatatypeProperty :rdf/Property
                       :owl/FunctionalProperty},
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A predefined step size for weight of a specific scale."},
   :rdfs/domain      :wo/Scale,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/wo/core#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has step size"},
   :rdfs/range       :xsd/decimal,
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "unstable"}})

(def weight
  {:db/ident :wo/weight,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The weight on some relation, e.g. a interest in a topic, or of an interest that is valid for a specific period of time or was raised up in a specific period of time."},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/wo/core#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has weight"},
   :rdfs/range :wo/Weight,
   :rdfs/subPropertyOf :event/factor,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "unstable"}})

(def weight_value
  {:db/ident         :wo/weight_value,
   :rdf/type         #{:owl/DatatypeProperty :rdf/Property
                       :owl/FunctionalProperty},
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The specific value of a weight."},
   :rdfs/domain      :wo/Weight,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/wo/core#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has weight value"},
   :rdfs/range       :xsd/decimal,
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "testing"}})

(def urn:uuid:033ebac6-9306-584f-8540-ec1aa027db87
  {:dc11/creator {:xsd/anyURI "http://foaf.me/zazi#me"},
   :dc11/date #inst "2010-09-14T10:40:52.000-00:00",
   :dc11/description
   {:rdf/language "en",
    :rdf/value
    "A vocabulary for describing weightings and their referenced scales."},
   :dc11/title {:rdf/language "en",
                :rdf/value    "Weighting Ontology"},
   :owl/imports #{{:xsd/anyURI "http://purl.org/stuff/rev"}
                  {:xsd/anyURI "http://www.w3.org/2003/06/sw-vocab-status/ns"}
                  {:xsd/anyURI "http://purl.org/vocab/vann/"}
                  {:xsd/anyURI "http://purl.org/dc/elements/1.1/"}
                  {:xsd/anyURI "http://purl.org/NET/c4dm/event.owl"}
                  {:xsd/anyURI "http://purl.org/NET/scovo"}},
   :owl/versionInfo 0.1M,
   :rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "wo",
   :vann/preferredNamespaceUri "http://purl.org/ontology/wo/core#",
   :xsd/anyURI "http://purl.org/ontology/wo/core#"})