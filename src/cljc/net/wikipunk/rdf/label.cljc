(ns net.wikipunk.rdf.label
  "Term definitions for singular and plural label properties, and their inverses, for RDF terms"
  {:cc/license "http://creativecommons.org/licenses/by/1.0/",
   :dcat/downloadURL
   "https://lov.linkeddata.es/dataset/lov/vocabs/label/versions/2004-03-28.n3",
   :dcterms/created #voc/lstr "2004-03-28@en",
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
   [#voc/lstr
     "Term definitions for singular and plural label properties, and their inverses, for RDF terms@en"
    #voc/lstr
     "Definitioner for relationer mellem en term, dens inverse, og dens navn i entals- og flertalsform@da"
    #voc/lstr
     "Definiciones de etiquetas plurales y singulares de términos RDF@es"],
   :rdfs/label #voc/lstr "label@en"})

(def inversePlural
  "A relation between a term and the label of its inverse in literal plural form"
  {:db/ident :label/inversePlural,
   :label/plural [#voc/lstr "plural forms of inverses@en"
                  #voc/lstr "flertalsformer for inverse@da"],
   :label/singular [#voc/lstr "flertalsform for invers@da"
                    #voc/lstr "plural form of inverse@en"],
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   [#voc/lstr
     "En relation mellem en term og dens inverses navn i flertalsform@da"
    #voc/lstr
     "A relation between a term and the label of its inverse in literal plural form@en"],
   :rdfs/isDefinedBy "http://purl.org/net/vocab/2004/03/label",
   :rdfs/label [#voc/lstr "inverse plural@en"
                #voc/lstr "inverst flertal@da"
                #voc/lstr "flertalsform for invers@da"
                #voc/lstr "plural form of inverse@en"
                #voc/lstr "plural forms of inverses@en"
                #voc/lstr "flertalsformer for inverse@da"],
   :rdfs/subPropertyOf [:rdfs/label :label/inversePlural]})

(def inverseSingular
  "A relation between a term and the label of its inverse in literal singular form"
  {:db/ident :label/inverseSingular,
   :label/plural [#voc/lstr "singular forms of inverses@en"
                  #voc/lstr "entalsformer for inverse@da"],
   :label/singular [#voc/lstr "singular form of inverse@en"
                    #voc/lstr "entalsform for invers@da"],
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   [#voc/lstr "En relation mellem en term og dens inverses navn i entalsform@da"
    #voc/lstr
     "A relation between a term and the label of its inverse in literal singular form@en"],
   :rdfs/isDefinedBy "http://purl.org/net/vocab/2004/03/label",
   :rdfs/label [#voc/lstr "inverse singular@en"
                #voc/lstr "inverst ental@da"
                #voc/lstr "singular form of inverse@en"
                #voc/lstr "entalsform for invers@da"
                #voc/lstr "singular forms of inverses@en"
                #voc/lstr "entalsformer for inverse@da"],
   :rdfs/subPropertyOf [:rdfs/label :label/inverseSingular]})

(def plural
  "A relation between a term and its label in literal plural form"
  {:db/ident :label/plural,
   :label/plural [#voc/lstr "plural forms@en"
                  #voc/lstr "formas plurales@es"
                  #voc/lstr "flertalsformer@da"],
   :label/singular [#voc/lstr "flertalsform@da"
                    #voc/lstr "forma plural@es"
                    #voc/lstr "plural form@en"],
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   [#voc/lstr "Una relación entre un término y su etiqueta en forma plural@es"
    #voc/lstr
     "A relation between a term and its label in literal plural form@en"
    #voc/lstr "En relation mellem en term og dens navn i flertalsform@da"],
   :rdfs/isDefinedBy "http://purl.org/net/vocab/2004/03/label",
   :rdfs/label [#voc/lstr "flertal@da"
                #voc/lstr "plural@en"
                #voc/lstr "plural@es"
                #voc/lstr "flertalsform@da"
                #voc/lstr "forma plural@es"
                #voc/lstr "plural form@en"
                #voc/lstr "plural forms@en"
                #voc/lstr "flertalsformer@da"
                #voc/lstr "formas plurales@es"],
   :rdfs/subPropertyOf [:rdfs/label :label/plural]})

(def singular
  "A relation between a term and its label in literal singular form"
  {:db/ident :label/singular,
   :label/plural [#voc/lstr "singular forms@en"
                  #voc/lstr "entalsformer@da"
                  #voc/lstr "formas singulares@es"],
   :label/singular [#voc/lstr "forma singular@es"
                    #voc/lstr "singular form@en"
                    #voc/lstr "entalsform@da"],
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   [#voc/lstr "Una relación entre un término y su etiqueta en forma singular@es"
    #voc/lstr
     "A relation between a term and its label in literal singular form@en"
    #voc/lstr "En relation mellem en term og dens navn i entalsform@da"],
   :rdfs/isDefinedBy "http://purl.org/net/vocab/2004/03/label",
   :rdfs/label [#voc/lstr "singular@en"
                #voc/lstr "singular@es"
                #voc/lstr "ental@da"
                #voc/lstr "forma singular@es"
                #voc/lstr "singular form@en"
                #voc/lstr "entalsform@da"
                #voc/lstr "singular forms@en"
                #voc/lstr "entalsformer@da"
                #voc/lstr "formas singulares@es"],
   :rdfs/subPropertyOf [:rdfs/label :label/singular]})