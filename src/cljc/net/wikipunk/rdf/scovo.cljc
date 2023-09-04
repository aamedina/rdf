(ns net.wikipunk.rdf.scovo
  {:dcat/downloadURL
   "https://lov.linkeddata.es/dataset/lov/vocabs/scovo/versions/2012-08-09.n3",
   :namespaces {"adms"    "http://www.w3.org/ns/adms#",
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
  {:db/ident     :scovo/Dataset,
   :rdf/type     #{:rdfs/Class :owl/Class},
   :rdfs/comment "a statistical dataset",
   :rdfs/label   "Dataset"})

(def Dimension
  {:db/ident     :scovo/Dimension,
   :rdf/type     #{:rdfs/Class :owl/Class},
   :rdfs/comment "a dimension of a statistical data item",
   :rdfs/label   "Dimension"})

(def Item
  {:db/ident     :scovo/Item,
   :rdf/type     #{:rdfs/Class :owl/Class},
   :rdfs/comment "a statistical data item",
   :rdfs/label   "Item"})

(def dataset
  {:db/ident    :scovo/dataset,
   :rdf/type    :rdf/Property,
   :rdfs/domain :scovo/Item,
   :rdfs/label  "belongs to dataset",
   :rdfs/range  :scovo/Dataset})

(def datasetOf
  {:db/ident    :scovo/datasetOf,
   :rdf/type    :rdf/Property,
   :rdfs/domain :scovo/Dataset,
   :rdfs/label  "is the dataset of",
   :rdfs/range  :scovo/Item})

(def dimension
  {:db/ident    :scovo/dimension,
   :rdf/type    :rdf/Property,
   :rdfs/domain :scovo/Item,
   :rdfs/label  "has a dimension",
   :rdfs/range  :scovo/Dimension})

(def max
  {:db/ident    :scovo/max,
   :rdf/type    :rdf/Property,
   :rdfs/domain :scovo/Dimension,
   :rdfs/label  "has a maximum range value"})

(def min
  {:db/ident    :scovo/min,
   :rdf/type    :rdf/Property,
   :rdfs/domain :scovo/Dimension,
   :rdfs/label  "has a minimum range value"})