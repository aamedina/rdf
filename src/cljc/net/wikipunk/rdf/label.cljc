(ns net.wikipunk.rdf.label
  {:dcat/downloadURL
   "https://lov.linkeddata.es/dataset/lov/vocabs/label/versions/2004-03-28.n3",
   :rdf/ns-prefix-map {"cc"      "http://web.resource.org/cc/",
                       "dc11"    "http://purl.org/dc/elements/1.1/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "label"   "http://purl.org/net/vocab/2004/03/label#",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "vann"    "http://purl.org/vocab/vann/"},
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "label",
   :rdfa/uri "http://purl.org/net/vocab/2004/03/label#"})

(def inversePlural
  "En relation mellem en term og dens inverses navn i flertalsform"
  {:db/ident :label/inversePlural,
   :label/plural #{{:rdf/language "da",
                    :rdf/value    "flertalsformer for inverse"}
                   {:rdf/language "en",
                    :rdf/value    "plural forms of inverses"}},
   :label/singular #{{:rdf/language "da",
                      :rdf/value    "flertalsform for invers"}
                     {:rdf/language "en",
                      :rdf/value    "plural form of inverse"}},
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #{{:rdf/language "da",
      :rdf/value
      "En relation mellem en term og dens inverses navn i flertalsform"}
     {:rdf/language "en",
      :rdf/value
      "A relation between a term and the label of its inverse in literal plural form"}},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/net/vocab/2004/03/label"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "inverse plural"}
                 {:rdf/language "da",
                  :rdf/value    "inverst flertal"}},
   :rdfs/subPropertyOf :rdfs/label})

(def inverseSingular
  "En relation mellem en term og dens inverses navn i entalsform"
  {:db/ident :label/inverseSingular,
   :label/plural #{{:rdf/language "en",
                    :rdf/value    "singular forms of inverses"}
                   {:rdf/language "da",
                    :rdf/value    "entalsformer for inverse"}},
   :label/singular #{{:rdf/language "da",
                      :rdf/value    "entalsform for invers"}
                     {:rdf/language "en",
                      :rdf/value    "singular form of inverse"}},
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #{{:rdf/language "da",
      :rdf/value
      "En relation mellem en term og dens inverses navn i entalsform"}
     {:rdf/language "en",
      :rdf/value
      "A relation between a term and the label of its inverse in literal singular form"}},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/net/vocab/2004/03/label"},
   :rdfs/label #{{:rdf/language "da",
                  :rdf/value    "inverst ental"}
                 {:rdf/language "en",
                  :rdf/value    "inverse singular"}},
   :rdfs/subPropertyOf :rdfs/label})

(def plural
  "A relation between a term and its label in literal plural form"
  {:db/ident :label/plural,
   :label/plural #{{:rdf/language "da",
                    :rdf/value    "flertalsformer"}
                   {:rdf/language "es",
                    :rdf/value    "formas plurales"}
                   {:rdf/language "en",
                    :rdf/value    "plural forms"}},
   :label/singular #{{:rdf/language "da",
                      :rdf/value    "flertalsform"}
                     {:rdf/language "en",
                      :rdf/value    "plural form"}
                     {:rdf/language "es",
                      :rdf/value    "forma plural"}},
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "A relation between a term and its label in literal plural form"}
     {:rdf/language "da",
      :rdf/value    "En relation mellem en term og dens navn i flertalsform"}
     {:rdf/language "es",
      :rdf/value
      "Una relación entre un término y su etiqueta en forma plural"}},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/net/vocab/2004/03/label"},
   :rdfs/label #{{:rdf/language "da",
                  :rdf/value    "flertal"}
                 {:rdf/language "es",
                  :rdf/value    "plural"}
                 {:rdf/language "en",
                  :rdf/value    "plural"}},
   :rdfs/subPropertyOf :rdfs/label})

(def singular
  "Una relación entre un término y su etiqueta en forma singular"
  {:db/ident :label/singular,
   :label/plural #{{:rdf/language "da",
                    :rdf/value    "entalsformer"}
                   {:rdf/language "en",
                    :rdf/value    "singular forms"}
                   {:rdf/language "es",
                    :rdf/value    "formas singulares"}},
   :label/singular #{{:rdf/language "es",
                      :rdf/value    "forma singular"}
                     {:rdf/language "da",
                      :rdf/value    "entalsform"}
                     {:rdf/language "en",
                      :rdf/value    "singular form"}},
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #{{:rdf/language "es",
      :rdf/value
      "Una relación entre un término y su etiqueta en forma singular"}
     {:rdf/language "da",
      :rdf/value    "En relation mellem en term og dens navn i entalsform"}
     {:rdf/language "en",
      :rdf/value
      "A relation between a term and its label in literal singular form"}},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/net/vocab/2004/03/label"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "singular"}
                 {:rdf/language "da",
                  :rdf/value    "ental"}
                 {:rdf/language "es",
                  :rdf/value    "singular"}},
   :rdfs/subPropertyOf :rdfs/label})