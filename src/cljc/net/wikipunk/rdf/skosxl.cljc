(ns net.wikipunk.rdf.skosxl
  {:dcterms/contributor
   #xsd/string "Participants in W3C's Semantic Web Deployment Working Group.",
   :dcterms/creator [#xsd/string "Sean Bechhofer" #xsd/string "Alistair Miles"],
   :dcterms/description
   #xsd/langString
    "An RDF vocabulary extending SKOS and allowing the description and linking of lexical entities.@en",
   :dcterms/title #xsd/langString "SKOS XL Vocabulary@en",
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
  {:db/ident         :skosxl/Label,
   :owl/disjointWith [:skos/ConceptScheme :skos/Collection :skos/Concept],
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2008/05/skos-xl"},
   :rdfs/label       #xsd/langString "Label@en",
   :rdfs/subClassOf  {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :skosxl/literalForm,
                      :rdf/type        :owl/Restriction},
   :skos/definition  #xsd/langString "A special class of lexical entities.@en"})

(def altLabel
  {:db/ident :skosxl/altLabel,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #xsd/langString
    "If C skosxl:altLabel L and L skosxl:literalForm V, then X skos:altLabel V.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2008/05/skos-xl"},
   :rdfs/label #xsd/langString "alternative label@en",
   :rdfs/range :skosxl/Label,
   :rdfs/seeAlso :skos/altLabel,
   :skos/definition
   #xsd/langString
    "The property skosxl:altLabel is used to associate an skosxl:Label with a skos:Concept. The property is analogous to skos:altLabel.@en"})

(def hiddenLabel
  {:db/ident :skosxl/hiddenLabel,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #xsd/langString
    "If C skosxl:hiddenLabel L and L skosxl:literalForm V, then C skos:hiddenLabel V.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2008/05/skos-xl"},
   :rdfs/label #xsd/langString "hidden label@en",
   :rdfs/range :skosxl/Label,
   :rdfs/seeAlso :skos/hiddenLabel,
   :skos/definition
   #xsd/langString
    "The property skosxl:hiddenLabel is used to associate an skosxl:Label with a skos:Concept. The property is analogous to skos:hiddenLabel.@en"})

(def labelRelation
  {:db/ident :skosxl/labelRelation,
   :rdf/type [:rdf/Property :owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/domain :skosxl/Label,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2008/05/skos-xl"},
   :rdfs/label #xsd/langString "label relation@en",
   :rdfs/range :skosxl/Label,
   :skos/definition
   #xsd/langString
    "The property skosxl:labelRelation is used for representing binary ('direct') relations between instances of the class skosxl:Label.@en",
   :skos/scopeNote
   #xsd/langString
    "skosxl:labelRelation is not intended to be used directly, but rather as the basis for a design pattern which can be refined for more specific labeling scenarios.@en"})

(def literalForm
  {:db/ident :skosxl/literalForm,
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/comment
   [#xsd/langString
     "The range of skosxl:literalForm is the class of RDF plain literals.@en"
    #xsd/langString
     "If two instances of the class skosxl:Label have the same literal form, they are not necessarily the same resource.@en"],
   :rdfs/domain :skosxl/Label,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2008/05/skos-xl"},
   :rdfs/label #xsd/langString "literal form@en",
   :skos/definition
   #xsd/langString
    "The property skosxl:literalForm is used to give the literal form of an skosxl:Label.@en"})

(def prefLabel
  {:db/ident :skosxl/prefLabel,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #xsd/langString
    "If C skosxl:prefLabel L and L skosxl:literalForm V, then X skos:prefLabel V.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2008/05/skos-xl"},
   :rdfs/label #xsd/langString "preferred label@en",
   :rdfs/range :skosxl/Label,
   :rdfs/seeAlso :skos/prefLabel,
   :skos/definition
   #xsd/langString
    "The property skosxl:prefLabel is used to associate an skosxl:Label with a skos:Concept. The property is analogous to skos:prefLabel.@en"})