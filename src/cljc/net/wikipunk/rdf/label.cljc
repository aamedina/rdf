(ns net.wikipunk.rdf.label
  ^{:base "http://purl.org/net/vocab/2004/03/label#",
    :namespaces {"cc"      "http://web.resource.org/cc/",
                 "dc11"    "http://purl.org/dc/elements/1.1/",
                 "dcterms" "http://purl.org/dc/terms/",
                 "foaf"    "http://xmlns.com/foaf/0.1/",
                 "label"   "http://purl.org/net/vocab/2004/03/label#",
                 "owl"     "http://www.w3.org/2002/07/owl#",
                 "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                 "vann"    "http://purl.org/vocab/vann/"},
    :prefix "label",
    :source
    "https://lov.linkeddata.es/dataset/lov/vocabs/label/versions/2004-03-28.n3"}
  {:cc/license {:xsd/anyURI "http://creativecommons.org/licenses/by/1.0/"},
   :dcterms/created {:rdf/language "en",
                     :rdf/value    "2004-03-28"},
   :foaf/maker {:foaf/homepage     {:xsd/anyURI "http://www.wasab.dk/morten/"},
                :foaf/mbox_sha1sum "65b983bb397fb71849da910996741752ace8369b",
                :foaf/name         "Morten Høybye Frederiksen",
                :rdf/type          :foaf/Person},
   :owl/imports #{{:xsd/anyURI "http://www.w3.org/2000/01/rdf-schema"}
                  {:xsd/anyURI "http://www.w3.org/2002/07/owl"}},
   :rdf/type #{:cc/Work :owl/Ontology},
   :rdfs/comment
   #{{:rdf/language "da",
      :rdf/value
      "Definitioner for relationer mellem en term, dens inverse, og dens navn i entals- og flertalsform"}
     {:rdf/language "en",
      :rdf/value
      "Term definitions for singular and plural label properties, and their inverses, for RDF terms"}
     {:rdf/language "es",
      :rdf/value
      "Definiciones de etiquetas plurales y singulares de términos RDF"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "label"},
   :xsd/anyURI "http://purl.org/net/vocab/2004/03/label"})

(def inversePlural
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
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/net/vocab/2004/03/label"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "inverse plural"}
                 {:rdf/language "da",
                  :rdf/value    "inverst flertal"}},
   :rdfs/subPropertyOf :rdfs/label})

(def inverseSingular
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
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/net/vocab/2004/03/label"},
   :rdfs/label #{{:rdf/language "da",
                  :rdf/value    "inverst ental"}
                 {:rdf/language "en",
                  :rdf/value    "inverse singular"}},
   :rdfs/subPropertyOf :rdfs/label})

(def plural
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
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/net/vocab/2004/03/label"},
   :rdfs/label #{{:rdf/language "da",
                  :rdf/value    "flertal"}
                 {:rdf/language "es",
                  :rdf/value    "plural"}
                 {:rdf/language "en",
                  :rdf/value    "plural"}},
   :rdfs/subPropertyOf :rdfs/label})

(def singular
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
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/net/vocab/2004/03/label"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "singular"}
                 {:rdf/language "da",
                  :rdf/value    "ental"}
                 {:rdf/language "es",
                  :rdf/value    "singular"}},
   :rdfs/subPropertyOf :rdfs/label})

(def urn:uuid:53482ab9-3108-569f-ab53-ffd1360f3a0c
  {:cc/license {:xsd/anyURI "http://creativecommons.org/licenses/by/1.0/"},
   :dcterms/created {:rdf/language "en",
                     :rdf/value    "2004-03-28"},
   :foaf/maker {:foaf/homepage     {:xsd/anyURI "http://www.wasab.dk/morten/"},
                :foaf/mbox_sha1sum "65b983bb397fb71849da910996741752ace8369b",
                :foaf/name         "Morten Høybye Frederiksen",
                :rdf/type          :foaf/Person},
   :owl/imports #{{:xsd/anyURI "http://www.w3.org/2000/01/rdf-schema"}
                  {:xsd/anyURI "http://www.w3.org/2002/07/owl"}},
   :rdf/type #{:cc/Work :owl/Ontology},
   :rdfs/comment
   #{{:rdf/language "da",
      :rdf/value
      "Definitioner for relationer mellem en term, dens inverse, og dens navn i entals- og flertalsform"}
     {:rdf/language "en",
      :rdf/value
      "Term definitions for singular and plural label properties, and their inverses, for RDF terms"}
     {:rdf/language "es",
      :rdf/value
      "Definiciones de etiquetas plurales y singulares de términos RDF"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "label"},
   :xsd/anyURI "http://purl.org/net/vocab/2004/03/label"})