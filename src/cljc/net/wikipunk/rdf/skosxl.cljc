(ns net.wikipunk.rdf.skosxl
  "An RDF vocabulary extending SKOS and allowing the description and linking of lexical entities."
  {:dcterms/contributor
   "Participants in W3C's Semantic Web Deployment Working Group.",
   :dcterms/creator #{"Alistair Miles" "Sean Bechhofer"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An RDF vocabulary extending SKOS and allowing the description and linking of lexical entities."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "SKOS XL Vocabulary"},
   :owl/imports {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#",
                       "skosxl"  "http://www.w3.org/2008/05/skos-xl#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "skosxl",
   :rdfa/uri "http://www.w3.org/2008/05/skos-xl",
   :rdfs/isDefinedBy {:rdfa/uri
                      "http://www.w3.org/TR/2009/REC-skos-reference-20090818/"},
   :rdfs/seeAlso {:rdfa/uri "http://www.w3.org/2008/05/skos"}})

(def Label
  "Label"
  {:db/ident         :skosxl/Label,
   :owl/disjointWith #{:skos/ConceptScheme :skos/Concept :skos/Collection},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2008/05/skos-xl"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Label"},
   :rdfs/subClassOf  {:owl/cardinality 1,
                      :owl/onProperty  :skosxl/literalForm,
                      :rdf/type        :owl/Restriction},
   :skos/definition  {:rdf/language "en",
                      :rdf/value    "A special class of lexical entities."}})

(def altLabel
  "If C skosxl:altLabel L and L skosxl:literalForm V, then X skos:altLabel V."
  {:db/ident :skosxl/altLabel,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If C skosxl:altLabel L and L skosxl:literalForm V, then X skos:altLabel V."},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2008/05/skos-xl"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "alternative label"},
   :rdfs/range :skosxl/Label,
   :rdfs/seeAlso :skos/altLabel,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The property skosxl:altLabel is used to associate an skosxl:Label with a skos:Concept. The property is analogous to skos:altLabel."}})

(def hiddenLabel
  "If C skosxl:hiddenLabel L and L skosxl:literalForm V, then C skos:hiddenLabel V."
  {:db/ident :skosxl/hiddenLabel,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If C skosxl:hiddenLabel L and L skosxl:literalForm V, then C skos:hiddenLabel V."},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2008/05/skos-xl"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "hidden label"},
   :rdfs/range :skosxl/Label,
   :rdfs/seeAlso :skos/hiddenLabel,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The property skosxl:hiddenLabel is used to associate an skosxl:Label with a skos:Concept. The property is analogous to skos:hiddenLabel."}})

(def labelRelation
  "label relation"
  {:db/ident :skosxl/labelRelation,
   :rdf/type #{:owl/SymmetricProperty :owl/ObjectProperty :rdf/Property},
   :rdfs/domain :skosxl/Label,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2008/05/skos-xl"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "label relation"},
   :rdfs/range :skosxl/Label,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The property skosxl:labelRelation is used for representing binary ('direct') relations between instances of the class skosxl:Label."},
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "skosxl:labelRelation is not intended to be used directly, but rather as the basis for a design pattern which can be refined for more specific labeling scenarios."}})

(def literalForm
  "The range of skosxl:literalForm is the class of RDF plain literals."
  {:db/ident :skosxl/literalForm,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The range of skosxl:literalForm is the class of RDF plain literals."}
     {:rdf/language "en",
      :rdf/value
      "If two instances of the class skosxl:Label have the same literal form, they are not necessarily the same resource."}},
   :rdfs/domain :skosxl/Label,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2008/05/skos-xl"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "literal form"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The property skosxl:literalForm is used to give the literal form of an skosxl:Label."}})

(def prefLabel
  "If C skosxl:prefLabel L and L skosxl:literalForm V, then X skos:prefLabel V."
  {:db/ident :skosxl/prefLabel,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If C skosxl:prefLabel L and L skosxl:literalForm V, then X skos:prefLabel V."},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2008/05/skos-xl"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "preferred label"},
   :rdfs/range :skosxl/Label,
   :rdfs/seeAlso :skos/prefLabel,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The property skosxl:prefLabel is used to associate an skosxl:Label with a skos:Concept. The property is analogous to skos:prefLabel."}})