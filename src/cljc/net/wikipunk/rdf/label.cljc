(ns net.wikipunk.rdf.label
  "label"
  {:cc/license {:rdfa/uri "http://creativecommons.org/licenses/by/1.0/"},
   :dcat/downloadURL
   "https://lov.linkeddata.es/dataset/lov/vocabs/label/versions/2004-03-28.n3",
   :dcterms/created #rdf/langString "2004-03-28@en",
   :foaf/maker {:foaf/homepage     {:rdfa/uri "http://www.wasab.dk/morten/"},
                :foaf/mbox_sha1sum "65b983bb397fb71849da910996741752ace8369b",
                :foaf/name         "Morten Høybye Frederiksen",
                :rdf/type          :foaf/Person},
   :owl/imports [{:rdfa/uri "http://www.w3.org/2002/07/owl"}
                 {:rdfa/uri "http://www.w3.org/2000/01/rdf-schema"}],
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
   [#rdf/langString
     "Term definitions for singular and plural label properties, and their inverses, for RDF terms@en"
    #rdf/langString
     "Definitioner for relationer mellem en term, dens inverse, og dens navn i entals- og flertalsform@da"
    #rdf/langString
     "Definiciones de etiquetas plurales y singulares de términos RDF@es"],
   :rdfs/label #rdf/langString "label@en"})

(def inversePlural
  {:db/ident :label/inversePlural,
   :label/plural [#rdf/langString "plural forms of inverses@en"
                  #rdf/langString "flertalsformer for inverse@da"],
   :label/singular [#rdf/langString "flertalsform for invers@da"
                    #rdf/langString "plural form of inverse@en"],
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   [#rdf/langString
     "En relation mellem en term og dens inverses navn i flertalsform@da"
    #rdf/langString
     "A relation between a term and the label of its inverse in literal plural form@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/net/vocab/2004/03/label"},
   :rdfs/label [#rdf/langString "inverse plural@en"
                #rdf/langString "inverst flertal@da"
                #rdf/langString "flertalsform for invers@da"
                #rdf/langString "plural form of inverse@en"
                #rdf/langString "plural forms of inverses@en"
                #rdf/langString "flertalsformer for inverse@da"],
   :rdfs/subPropertyOf :rdfs/label})

(def inverseSingular
  {:db/ident :label/inverseSingular,
   :label/plural [#rdf/langString "singular forms of inverses@en"
                  #rdf/langString "entalsformer for inverse@da"],
   :label/singular [#rdf/langString "singular form of inverse@en"
                    #rdf/langString "entalsform for invers@da"],
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   [#rdf/langString
     "En relation mellem en term og dens inverses navn i entalsform@da"
    #rdf/langString
     "A relation between a term and the label of its inverse in literal singular form@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/net/vocab/2004/03/label"},
   :rdfs/label [#rdf/langString "inverse singular@en"
                #rdf/langString "inverst ental@da"
                #rdf/langString "singular form of inverse@en"
                #rdf/langString "entalsform for invers@da"
                #rdf/langString "singular forms of inverses@en"
                #rdf/langString "entalsformer for inverse@da"],
   :rdfs/subPropertyOf :rdfs/label})

(def plural
  {:db/ident :label/plural,
   :label/plural [#rdf/langString "plural forms@en"
                  #rdf/langString "formas plurales@es"
                  #rdf/langString "flertalsformer@da"],
   :label/singular [#rdf/langString "flertalsform@da"
                    #rdf/langString "forma plural@es"
                    #rdf/langString "plural form@en"],
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   [#rdf/langString
     "Una relación entre un término y su etiqueta en forma plural@es"
    #rdf/langString
     "A relation between a term and its label in literal plural form@en"
    #rdf/langString
     "En relation mellem en term og dens navn i flertalsform@da"],
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/net/vocab/2004/03/label"},
   :rdfs/label [#rdf/langString "flertal@da"
                #rdf/langString "plural@en"
                #rdf/langString "plural@es"
                #rdf/langString "flertalsform@da"
                #rdf/langString "forma plural@es"
                #rdf/langString "plural form@en"
                #rdf/langString "plural forms@en"
                #rdf/langString "flertalsformer@da"
                #rdf/langString "formas plurales@es"],
   :rdfs/subPropertyOf :rdfs/label})

(def singular
  {:db/ident :label/singular,
   :label/plural [#rdf/langString "singular forms@en"
                  #rdf/langString "entalsformer@da"
                  #rdf/langString "formas singulares@es"],
   :label/singular [#rdf/langString "forma singular@es"
                    #rdf/langString "singular form@en"
                    #rdf/langString "entalsform@da"],
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   [#rdf/langString
     "Una relación entre un término y su etiqueta en forma singular@es"
    #rdf/langString
     "A relation between a term and its label in literal singular form@en"
    #rdf/langString "En relation mellem en term og dens navn i entalsform@da"],
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/net/vocab/2004/03/label"},
   :rdfs/label [#rdf/langString "singular@en"
                #rdf/langString "singular@es"
                #rdf/langString "ental@da"
                #rdf/langString "forma singular@es"
                #rdf/langString "singular form@en"
                #rdf/langString "entalsform@da"
                #rdf/langString "singular forms@en"
                #rdf/langString "entalsformer@da"
                #rdf/langString "formas singulares@es"],
   :rdfs/subPropertyOf :rdfs/label})
