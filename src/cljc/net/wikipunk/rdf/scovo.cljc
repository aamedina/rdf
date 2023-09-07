(ns net.wikipunk.rdf.scovo
  ^{:base       "http://purl.org/NET/scovo#",
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
    :prefix     "scovo",
    :source     "net/wikipunk/ext/scovo_2012-08-09.n3"}
  {:rdf/type :owl/Ontology}
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

(def urn:uuid:55267b89-7640-5608-b92f-09fd138f0e9e
  {:foaf/homepage {:xsd/anyURI "http://www.joanneum.at/en/digital/iis.html"},
   :foaf/member   {:xsd/anyURI "http://vocab.deri.ie/scovo#whalb"},
   :foaf/name     "JOANNEUM RESEARCH",
   :rdf/type      :dcterms/Agent,
   :xsd/anyURI    "http://vocab.deri.ie/scovo#JOANNEUM%20RESEARCH"})

(def urn:uuid:8721a916-ce31-51c2-945f-1b05e2939fcb
  {:foaf/homepage {:xsd/anyURI "http://vocab.deri.ie/scovo"},
   :foaf/name     "Tom Heath",
   :rdf/type      :foaf/Person,
   :xsd/anyURI    "http://vocab.deri.ie/scovo#theath"})

(def urn:uuid:89ee2158-0509-596b-946b-e2fdc1a4f0b5
  {:adms/accessURL     "http://vocab.deri.ie/scovo.ttl",
   :adms/status        {:xsd/anyURI "http://purl.org/adms/status/Completed"},
   :dcterms/FileFormat {:xsd/anyURI "http://vocab.deri.ie/scovo"},
   :rdf/type           :adms/AssetDistribution,
   :xsd/anyURI         "http://vocab.deri.ie/scovo#ttl"})

(def urn:uuid:2f3f0d5c-8ade-5c5b-aaef-77fbf9a3f682
  {:dc11/creator #{{:xsd/anyURI "http://vocab.deri.ie/scovo#dayers"}
                   {:xsd/anyURI "http://vocab.deri.ie/scovo#lfeigenbaum"}
                   {:xsd/anyURI
                    "http://vocab.deri.ie/scovo#Michael%20Hausenblas"}
                   {:xsd/anyURI "http://vocab.deri.ie/scovo#yraimond"}
                   {:xsd/anyURI "http://vocab.deri.ie/scovo#theath"}
                   {:xsd/anyURI "http://vocab.deri.ie/scovo#whalb"}},
   :dcterms/created #inst "2010-01-26T00:00:00.000-00:00",
   :dcterms/description
   "A vocabulary for representing statistical data on the Web.\r\n\r\n<div style=\"border: 2px solid red; padding: 0.4em 0.7em; background: #fcc\">Note: The SCOVO vocabulary is deprecated. We strongly advise to use the <a href=\"http://www.w3.org/TR/vocab-data-cube/\">Data Cube Vocabulary</a> instead.</div>",
   :dcterms/modified #inst "2012-08-09T00:00:00.000-00:00",
   :dcterms/partOf {:xsd/anyURI "http://vocab.deri.ie"},
   :dcterms/publisher "http://vocab.deri.ie/scovo#LiDRC",
   :dcterms/status {:xsd/anyURI "http://purl.org/adms/status/UnderDevelopment"},
   :dcterms/title "The Statistical Core Vocabulary (SCOVO)",
   :dcterms/type {:xsd/anyURI "http://purl.org/adms/assettype/Ontology"},
   :foaf/homepage {:xsd/anyURI "http://vocab.deri.ie/scovo.html"},
   :rdf/type #{:owl/Ontology :adms/Asset},
   :vann/preferredNamespacePrefix "scovo",
   :vann/preferredNamespaceUri "http://purl.org/NET/scovo#",
   :xsd/anyURI "http://vocab.deri.ie/scovo"})

(def urn:uuid:3f51d6ce-0b26-531b-8a5a-7b9bb898e1e5
  {:foaf/homepage {:xsd/anyURI "http://vocab.deri.ie/scovo"},
   :foaf/name     "Danny Ayers",
   :rdf/type      :foaf/Person,
   :xsd/anyURI    "http://vocab.deri.ie/scovo#dayers"})

(def urn:uuid:c0ebc84a-b75c-5481-99de-744a34816fd2
  {:adms/accessURL     "http://vocab.deri.ie/scovo.rdf",
   :adms/status        {:xsd/anyURI "http://purl.org/adms/status/Completed"},
   :dcterms/FileFormat {:xsd/anyURI "http://vocab.deri.ie/scovo"},
   :rdf/type           :adms/AssetDistribution,
   :xsd/anyURI         "http://vocab.deri.ie/scovo#rdf"})

(def urn:uuid:85bcbdf1-1eeb-5f7d-a165-6239f09a4a5f
  {:foaf/homepage {:xsd/anyURI "http://linkeddata.deri.ie/"},
   :foaf/member   {:xsd/anyURI
                   "http://vocab.deri.ie/scovo#Michael%20Hausenblas"},
   :foaf/name     "LiDRC",
   :rdf/type      :dcterms/Agent,
   :xsd/anyURI    "http://vocab.deri.ie/scovo#LiDRC"})

(def urn:uuid:9d40c74e-27d1-53fb-9103-e24bfb54ec2c
  {:foaf/homepage {:xsd/anyURI "http://vocab.deri.ie/scovo"},
   :foaf/name     "Wolfgang Halb",
   :rdf/type      :foaf/Person,
   :xsd/anyURI    "http://vocab.deri.ie/scovo#whalb"})

(def urn:uuid:0d6a67e6-bb24-52eb-b51a-101a34c2e652
  {:foaf/homepage {:xsd/anyURI "http://sw-app.org/about.html"},
   :foaf/mbox     {:xsd/anyURI "mailto:michael.hausenblas@deri.org"},
   :foaf/name     "Michael Hausenblas",
   :rdf/type      :foaf/Person,
   :xsd/anyURI    "http://vocab.deri.ie/scovo#Michael%20Hausenblas"})

(def urn:uuid:3d711d6f-226c-5f4c-8f57-f3ebecf26994
  {:foaf/homepage {:xsd/anyURI "http://vocab.deri.ie/scovo"},
   :foaf/name     "Yves Raimond",
   :rdf/type      :foaf/Person,
   :xsd/anyURI    "http://vocab.deri.ie/scovo#yraimond"})

(def urn:uuid:1e1edc7a-2d1c-5621-80cb-d595ca2839a9
  {:foaf/homepage {:xsd/anyURI "http://vocab.deri.ie/scovo"},
   :foaf/name     "Lee Feigenbaum",
   :rdf/type      :foaf/Person,
   :xsd/anyURI    "http://vocab.deri.ie/scovo#lfeigenbaum"})