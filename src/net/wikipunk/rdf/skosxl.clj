(ns net.wikipunk.rdf.skosxl
  "An RDF vocabulary extending SKOS and allowing the description and linking of lexical entities."
  {:dcterms/contributor
   "Participants in W3C's Semantic Web Deployment Working Group.",
   :dcterms/creator ["Sean Bechhofer" "Alistair Miles"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An RDF vocabulary extending SKOS and allowing the description and linking of lexical entities."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "SKOS XL Vocabulary"},
   :owl/imports "http://www.w3.org/2004/02/skos/core",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#",
                       "skosxl"  "http://www.w3.org/2008/05/skos-xl#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://www.w3.org/2008/05/skos-xl",
   :rdfa/prefix "skosxl",
   :rdfa/uri "http://www.w3.org/2008/05/skos-xl#",
   :rdfs/isDefinedBy {:rdf/uri
                      "http://www.w3.org/TR/2009/REC-skos-reference-20090818/"},
   :rdfs/seeAlso "http://www.w3.org/2008/05/skos"})

(def Label
  "A special class of lexical entities."
  {:db/ident         :skosxl/Label,
   :owl/disjointWith [:skos/ConceptScheme :skos/Collection :skos/Concept],
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2008/05/skos-xl",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Label"},
   :rdfs/subClassOf  {:owl/cardinality 1,
                      :owl/onProperty  :skosxl/literalForm,
                      :rdf/type        :owl/Restriction},
   :skos/definition  {:rdf/language "en",
                      :rdf/value    "A special class of lexical entities."}})

(def altLabel
  "The property skosxl:altLabel is used to associate an skosxl:Label with a skos:Concept. The property is analogous to skos:altLabel."
  {:db/ident :skosxl/altLabel,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If C skosxl:altLabel L and L skosxl:literalForm V, then X skos:altLabel V."},
   :rdfs/isDefinedBy "http://www.w3.org/2008/05/skos-xl",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "alternative label"},
   :rdfs/range :skosxl/Label,
   :rdfs/seeAlso "http://www.w3.org/2004/02/skos/core#altLabel",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The property skosxl:altLabel is used to associate an skosxl:Label with a skos:Concept. The property is analogous to skos:altLabel."}})

(def hiddenLabel
  "The property skosxl:hiddenLabel is used to associate an skosxl:Label with a skos:Concept. The property is analogous to skos:hiddenLabel."
  {:db/ident :skosxl/hiddenLabel,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If C skosxl:hiddenLabel L and L skosxl:literalForm V, then C skos:hiddenLabel V."},
   :rdfs/isDefinedBy "http://www.w3.org/2008/05/skos-xl",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "hidden label"},
   :rdfs/range :skosxl/Label,
   :rdfs/seeAlso "http://www.w3.org/2004/02/skos/core#hiddenLabel"
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The property skosxl:hiddenLabel is used to associate an skosxl:Label with a skos:Concept. The property is analogous to skos:hiddenLabel."}})

(def labelRelation
  "The property skosxl:labelRelation is used for representing binary ('direct') relations between instances of the class skosxl:Label."
  {:db/ident :skosxl/labelRelation,
   :rdf/type [:rdf/Property :owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/domain :skosxl/Label,
   :rdfs/isDefinedBy "http://www.w3.org/2008/05/skos-xl",
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
  "The property skosxl:literalForm is used to give the literal form of an skosxl:Label."
  {:db/ident :skosxl/literalForm,
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The range of skosxl:literalForm is the class of RDF plain literals."}
    {:rdf/language "en",
     :rdf/value
     "If two instances of the class skosxl:Label have the same literal form, they are not necessarily the same resource."}],
   :rdfs/domain :skosxl/Label,
   :rdfs/isDefinedBy "http://www.w3.org/2008/05/skos-xl",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "literal form"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The property skosxl:literalForm is used to give the literal form of an skosxl:Label."}})

(def prefLabel
  "The property skosxl:prefLabel is used to associate an skosxl:Label with a skos:Concept. The property is analogous to skos:prefLabel."
  {:db/ident :skosxl/prefLabel,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If C skosxl:prefLabel L and L skosxl:literalForm V, then X skos:prefLabel V."},
   :rdfs/isDefinedBy "http://www.w3.org/2008/05/skos-xl",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "preferred label"},
   :rdfs/range :skosxl/Label,
   :rdfs/seeAlso "http://www.w3.org/2004/02/skos/core#prefLabel",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The property skosxl:prefLabel is used to associate an skosxl:Label with a skos:Concept. The property is analogous to skos:prefLabel."}})
