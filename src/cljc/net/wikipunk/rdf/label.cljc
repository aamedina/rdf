(ns net.wikipunk.rdf.label
  "label"
  {:cc/license {:rdfa/uri "http://creativecommons.org/licenses/by/1.0/"},
   :dcat/downloadURL
   "https://lov.linkeddata.es/dataset/lov/vocabs/label/versions/2004-03-28.n3",
   :dcterms/created #xsd/langString "2004-03-28@en",
   :foaf/maker {:foaf/homepage     {:rdfa/uri "http://www.wasab.dk/morten/"},
                :foaf/mbox_sha1sum #xsd/string
                                    "65b983bb397fb71849da910996741752ace8369b",
                :foaf/name         #xsd/string "Morten Høybye Frederiksen",
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
   [#xsd/langString
     "Term definitions for singular and plural label properties, and their inverses, for RDF terms@en"
    #xsd/langString
     "Definitioner for relationer mellem en term, dens inverse, og dens navn i entals- og flertalsform@da"
    #xsd/langString
     "Definiciones de etiquetas plurales y singulares de términos RDF@es"],
   :rdfs/label #xsd/langString "label@en"})

(def inversePlural
  {:db/ident :label/inversePlural,
   :label/plural [#xsd/langString "plural forms of inverses@en"
                  #xsd/langString "flertalsformer for inverse@da"],
   :label/singular [#xsd/langString "flertalsform for invers@da"
                    #xsd/langString "plural form of inverse@en"],
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   [#xsd/langString
     "En relation mellem en term og dens inverses navn i flertalsform@da"
    #xsd/langString
     "A relation between a term and the label of its inverse in literal plural form@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/net/vocab/2004/03/label"},
   :rdfs/label [#xsd/langString "inverse plural@en"
                #xsd/langString "inverst flertal@da"
                #xsd/langString "flertalsform for invers@da"
                #xsd/langString "plural form of inverse@en"
                #xsd/langString "plural forms of inverses@en"
                #xsd/langString "flertalsformer for inverse@da"],
   :rdfs/subPropertyOf :rdfs/label})

(def inverseSingular
  {:db/ident :label/inverseSingular,
   :label/plural [#xsd/langString "singular forms of inverses@en"
                  #xsd/langString "entalsformer for inverse@da"],
   :label/singular [#xsd/langString "singular form of inverse@en"
                    #xsd/langString "entalsform for invers@da"],
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   [#xsd/langString
     "En relation mellem en term og dens inverses navn i entalsform@da"
    #xsd/langString
     "A relation between a term and the label of its inverse in literal singular form@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/net/vocab/2004/03/label"},
   :rdfs/label [#xsd/langString "inverse singular@en"
                #xsd/langString "inverst ental@da"
                #xsd/langString "singular form of inverse@en"
                #xsd/langString "entalsform for invers@da"
                #xsd/langString "singular forms of inverses@en"
                #xsd/langString "entalsformer for inverse@da"],
   :rdfs/subPropertyOf :rdfs/label})

(def plural
  {:db/ident :label/plural,
   :label/plural [#xsd/langString "plural forms@en"
                  #xsd/langString "formas plurales@es"
                  #xsd/langString "flertalsformer@da"],
   :label/singular [#xsd/langString "flertalsform@da"
                    #xsd/langString "forma plural@es"
                    #xsd/langString "plural form@en"],
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   [#xsd/langString
     "Una relación entre un término y su etiqueta en forma plural@es"
    #xsd/langString
     "A relation between a term and its label in literal plural form@en"
    #xsd/langString
     "En relation mellem en term og dens navn i flertalsform@da"],
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/net/vocab/2004/03/label"},
   :rdfs/label [#xsd/langString "flertal@da"
                #xsd/langString "plural@en"
                #xsd/langString "plural@es"
                #xsd/langString "flertalsform@da"
                #xsd/langString "forma plural@es"
                #xsd/langString "plural form@en"
                #xsd/langString "plural forms@en"
                #xsd/langString "flertalsformer@da"
                #xsd/langString "formas plurales@es"],
   :rdfs/subPropertyOf :rdfs/label})

(def singular
  {:db/ident :label/singular,
   :label/plural [#xsd/langString "singular forms@en"
                  #xsd/langString "entalsformer@da"
                  #xsd/langString "formas singulares@es"],
   :label/singular [#xsd/langString "forma singular@es"
                    #xsd/langString "singular form@en"
                    #xsd/langString "entalsform@da"],
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   [#xsd/langString
     "Una relación entre un término y su etiqueta en forma singular@es"
    #xsd/langString
     "A relation between a term and its label in literal singular form@en"
    #xsd/langString "En relation mellem en term og dens navn i entalsform@da"],
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/net/vocab/2004/03/label"},
   :rdfs/label [#xsd/langString "singular@en"
                #xsd/langString "singular@es"
                #xsd/langString "ental@da"
                #xsd/langString "forma singular@es"
                #xsd/langString "singular form@en"
                #xsd/langString "entalsform@da"
                #xsd/langString "singular forms@en"
                #xsd/langString "entalsformer@da"
                #xsd/langString "formas singulares@es"],
   :rdfs/subPropertyOf :rdfs/label})