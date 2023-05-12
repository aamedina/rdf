(ns net.wikipunk.rdf.label
  "Term definitions for singular and plural label properties, and their inverses, for RDF terms Definitioner for relationer mellem en term, dens inverse, og dens navn i entals- og flertalsform Definiciones de etiquetas plurales y singulares de términos RDF"
  {:cc/license "http://creativecommons.org/licenses/by/1.0/",
   :dcat/downloadURL
   "https://lov.linkeddata.es/dataset/lov/vocabs/label/versions/2004-03-28.n3",
   :dcterms/created "2004-03-28",
   :foaf/maker {:foaf/homepage     "http://www.wasab.dk/morten/",
                :foaf/mbox_sha1sum "65b983bb397fb71849da910996741752ace8369b",
                :foaf/name         "Morten Høybye Frederiksen",
                :rdf/type          :foaf/Person},
   :owl/imports ["http://www.w3.org/2002/07/owl"
                 "http://www.w3.org/2000/01/rdf-schema"],
   :rdf/ns-prefix-map {"cc"      "http://web.resource.org/cc/",
                       "dc11"    "http://purl.org/dc/elements/1.1/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "label"   "http://purl.org/net/vocab/2004/03/label#",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "vann"    "http://purl.org/vocab/vann/"},
   :rdf/type [:owl/Ontology :cc/Work],
   :rdfa/prefix "label",
   :rdfa/uri "http://purl.org/net/vocab/2004/03/label",
   :rdfs/comment
   ["Term definitions for singular and plural label properties, and their inverses, for RDF terms"
    "Definitioner for relationer mellem en term, dens inverse, og dens navn i entals- og flertalsform"
    "Definiciones de etiquetas plurales y singulares de términos RDF"],
   :rdfs/label "label"})

(def inversePlural
  "En relation mellem en term og dens inverses navn i flertalsform A relation between a term and the label of its inverse in literal plural form"
  {:db/ident :label/inversePlural,
   :label/plural ["plural forms of inverses" "flertalsformer for inverse"],
   :label/singular ["flertalsform for invers" "plural form of inverse"],
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   ["En relation mellem en term og dens inverses navn i flertalsform"
    "A relation between a term and the label of its inverse in literal plural form"],
   :rdfs/isDefinedBy "http://purl.org/net/vocab/2004/03/label",
   :rdfs/label ["inverse plural"
                "inverst flertal"
                "flertalsform for invers"
                "plural form of inverse"
                "plural forms of inverses"
                "flertalsformer for inverse"],
   :rdfs/subPropertyOf [:rdfs/label :label/inversePlural]})

(def inverseSingular
  "En relation mellem en term og dens inverses navn i entalsform A relation between a term and the label of its inverse in literal singular form"
  {:db/ident :label/inverseSingular,
   :label/plural ["singular forms of inverses" "entalsformer for inverse"],
   :label/singular ["singular form of inverse" "entalsform for invers"],
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   ["En relation mellem en term og dens inverses navn i entalsform"
    "A relation between a term and the label of its inverse in literal singular form"],
   :rdfs/isDefinedBy "http://purl.org/net/vocab/2004/03/label",
   :rdfs/label ["inverse singular"
                "inverst ental"
                "singular form of inverse"
                "entalsform for invers"
                "singular forms of inverses"
                "entalsformer for inverse"],
   :rdfs/subPropertyOf [:rdfs/label :label/inverseSingular]})

(def plural
  "Una relación entre un término y su etiqueta en forma plural A relation between a term and its label in literal plural form En relation mellem en term og dens navn i flertalsform"
  {:db/ident :label/plural,
   :label/plural ["plural forms" "formas plurales" "flertalsformer"],
   :label/singular ["flertalsform" "forma plural" "plural form"],
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   ["Una relación entre un término y su etiqueta en forma plural"
    "A relation between a term and its label in literal plural form"
    "En relation mellem en term og dens navn i flertalsform"],
   :rdfs/isDefinedBy "http://purl.org/net/vocab/2004/03/label",
   :rdfs/label ["flertal"
                "plural"
                "plural"
                "flertalsform"
                "forma plural"
                "plural form"
                "plural forms"
                "flertalsformer"
                "formas plurales"],
   :rdfs/subPropertyOf [:rdfs/label :label/plural]})

(def singular
  "Una relación entre un término y su etiqueta en forma singular A relation between a term and its label in literal singular form En relation mellem en term og dens navn i entalsform"
  {:db/ident :label/singular,
   :label/plural ["singular forms" "entalsformer" "formas singulares"],
   :label/singular ["forma singular" "singular form" "entalsform"],
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   ["Una relación entre un término y su etiqueta en forma singular"
    "A relation between a term and its label in literal singular form"
    "En relation mellem en term og dens navn i entalsform"],
   :rdfs/isDefinedBy "http://purl.org/net/vocab/2004/03/label",
   :rdfs/label ["singular"
                "singular"
                "ental"
                "forma singular"
                "singular form"
                "entalsform"
                "singular forms"
                "entalsformer"
                "formas singulares"],
   :rdfs/subPropertyOf [:rdfs/label :label/singular]})