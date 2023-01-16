(ns net.wikipunk.rdf.scovo
  "A vocabulary for representing statistical data on the Web. <div style=\"border: 2px solid red; padding: 0.4em 0.7em; background: #fcc\">Note: The SCOVO vocabulary is deprecated. We strongly advise to use the <a href=\"http://www.w3.org/TR/vocab-data-cube/\">Data Cube Vocabulary</a> instead.</div>"
  {:dcat/downloadURL
   "https://lov.linkeddata.es/dataset/lov/vocabs/scovo/versions/2012-08-09.n3",
   :dcterms/created #inst "2010-01-26T00:00:00.000-05:00",
   :dcterms/creator ["http://vocab.deri.ie/scovo#yraimond"
                     "http://vocab.deri.ie/scovo#theath"
                     "http://vocab.deri.ie/scovo#Michael%20Hausenblas"
                     "http://vocab.deri.ie/scovo#lfeigenbaum"
                     "http://vocab.deri.ie/scovo#whalb"
                     "http://vocab.deri.ie/scovo#dayers"],
   :dcterms/description
   "A vocabulary for representing statistical data on the Web.\r\n\r\n<div style=\"border: 2px solid red; padding: 0.4em 0.7em; background: #fcc\">Note: The SCOVO vocabulary is deprecated. We strongly advise to use the <a href=\"http://www.w3.org/TR/vocab-data-cube/\">Data Cube Vocabulary</a> instead.</div>",
   :dcterms/modified #inst "2012-08-09T00:00:00.000-04:00",
   :dcterms/partOf "http://vocab.deri.ie",
   :dcterms/publisher "http://vocab.deri.ie/scovo#LiDRC",
   :dcterms/status "http://purl.org/adms/status/UnderDevelopment",
   :dcterms/title "The Statistical Core Vocabulary (SCOVO)",
   :dcterms/type "http://purl.org/adms/assettype/Ontology",
   :foaf/homepage "http://vocab.deri.ie/scovo.html",
   :rdf/ns-prefix-map {"adms"    "http://www.w3.org/ns/adms#",
                       "dcterms" "http://purl.org/dc/elements/1.1/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "scovo"   "http://purl.org/NET/scovo#",
                       "vann"    "http://purl.org/vocab/vann/",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://vocab.deri.ie/scovo",
   :rdfa/prefix "scovo",
   :rdfa/uri "http://purl.org/NET/scovo#",
   :vann/preferredNamespacePrefix "scovo",
   :vann/preferredNamespaceUri "http://purl.org/NET/scovo#"}
  (:refer-clojure :exclude [max min]))

(def Dataset
  "a statistical dataset"
  {:db/ident     :scovo/Dataset,
   :rdf/type     [:rdfs/Class :owl/Class],
   :rdfs/comment "a statistical dataset",
   :rdfs/label   "Dataset"})

(def Dimension
  "a dimension of a statistical data item"
  {:db/ident     :scovo/Dimension,
   :rdf/type     [:rdfs/Class :owl/Class],
   :rdfs/comment "a dimension of a statistical data item",
   :rdfs/label   "Dimension"})

(def Item
  "a statistical data item"
  {:db/ident     :scovo/Item,
   :rdf/type     [:rdfs/Class :owl/Class],
   :rdfs/comment "a statistical data item",
   :rdfs/label   "Item"})

(def dataset
  "belongs to dataset"
  {:db/ident    :scovo/dataset,
   :rdf/type    :rdf/Property,
   :rdfs/domain :scovo/Item,
   :rdfs/label  "belongs to dataset",
   :rdfs/range  :scovo/Dataset})

(def datasetOf
  "is the dataset of"
  {:db/ident    :scovo/datasetOf,
   :rdf/type    :rdf/Property,
   :rdfs/domain :scovo/Dataset,
   :rdfs/label  "is the dataset of",
   :rdfs/range  :scovo/Item})

(def dimension
  "has a dimension"
  {:db/ident    :scovo/dimension,
   :rdf/type    :rdf/Property,
   :rdfs/domain :scovo/Item,
   :rdfs/label  "has a dimension",
   :rdfs/range  :scovo/Dimension})

(def max
  "has a maximum range value"
  {:db/ident    :scovo/max,
   :rdf/type    :rdf/Property,
   :rdfs/domain :scovo/Dimension,
   :rdfs/label  "has a maximum range value"})

(def min
  "has a minimum range value"
  {:db/ident    :scovo/min,
   :rdf/type    :rdf/Property,
   :rdfs/domain :scovo/Dimension,
   :rdfs/label  "has a minimum range value"})