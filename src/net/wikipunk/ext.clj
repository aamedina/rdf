(ns net.wikipunk.ext
  "Beyond the RDFa 1.1 / JSON-LD initial context."
  {:rdf/type :jsonld/Context})

(def event
  {:dcat/downloadURL "https://purl.org/NET/c4dm/event.owl"
   :rdfa/uri         "http://purl.org/NET/c4dm/event.owl#"
   :rdfa/prefix      "event"
   :rdf/type         :rdfa/PrefixMapping})

(def ao
  {:dcat/downloadURL "https://purl.org/ontology/ao/associationontology.owl"
   :rdfa/uri         "http://purl.org/ontology/ao/core#"
   :rdfa/prefix      "ao"
   :rdf/type         :rdfa/PrefixMapping})
