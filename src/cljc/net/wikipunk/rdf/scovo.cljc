(ns net.wikipunk.rdf.scovo
  {:dcat/downloadURL
   "https://lov.linkeddata.es/dataset/lov/vocabs/scovo/versions/2012-08-09.n3",
   :rdf/ns-prefix-map {"adms"    "http://www.w3.org/ns/adms#",
                       "dc11"    "http://purl.org/dc/elements/1.1/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "scovo"   "http://purl.org/NET/scovo#",
                       "vann"    "http://purl.org/vocab/vann/",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "scovo",
   :rdfa/uri "http://purl.org/NET/scovo#"}
  (:refer-clojure :exclude [max min]))

(def Dataset
  "a statistical dataset"
  {:db/ident        :scovo/Dataset,
   :rdf/type        [:rdfs/Class :owl/Class],
   :rdfs/comment    #xsd/string "a statistical dataset",
   :rdfs/label      #xsd/string "Dataset",
   :rdfs/subClassOf :rdfs/Resource})

(def Dimension
  "a dimension of a statistical data item"
  {:db/ident        :scovo/Dimension,
   :rdf/type        [:rdfs/Class :owl/Class],
   :rdfs/comment    #xsd/string "a dimension of a statistical data item",
   :rdfs/label      #xsd/string "Dimension",
   :rdfs/subClassOf :rdfs/Resource})

(def Item
  "a statistical data item"
  {:db/ident        :scovo/Item,
   :rdf/type        [:rdfs/Class :owl/Class],
   :rdfs/comment    #xsd/string "a statistical data item",
   :rdfs/label      #xsd/string "Item",
   :rdfs/subClassOf :rdfs/Resource})

(def dataset
  "belongs to dataset"
  {:db/ident    :scovo/dataset,
   :rdf/type    :rdf/Property,
   :rdfs/domain :scovo/Item,
   :rdfs/label  #xsd/string "belongs to dataset",
   :rdfs/range  :scovo/Dataset})

(def datasetOf
  "is the dataset of"
  {:db/ident    :scovo/datasetOf,
   :rdf/type    :rdf/Property,
   :rdfs/domain :scovo/Dataset,
   :rdfs/label  #xsd/string "is the dataset of",
   :rdfs/range  :scovo/Item})

(def dimension
  "has a dimension"
  {:db/ident    :scovo/dimension,
   :rdf/type    :rdf/Property,
   :rdfs/domain :scovo/Item,
   :rdfs/label  #xsd/string "has a dimension",
   :rdfs/range  :scovo/Dimension})

(def max
  "has a maximum range value"
  {:db/ident    :scovo/max,
   :rdf/type    :rdf/Property,
   :rdfs/domain :scovo/Dimension,
   :rdfs/label  #xsd/string "has a maximum range value"})

(def min
  "has a minimum range value"
  {:db/ident    :scovo/min,
   :rdf/type    :rdf/Property,
   :rdfs/domain :scovo/Dimension,
   :rdfs/label  #xsd/string "has a minimum range value"})