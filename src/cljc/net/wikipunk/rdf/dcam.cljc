(ns net.wikipunk.rdf.dcam
  {:dcat/downloadURL
   "https://www.dublincore.org/specifications/dublin-core/dcmi-terms/dublin_core_abstract_model.ttl",
   :rdf/ns-prefix-map {"dcam"    "http://purl.org/dc/dcam/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#"},
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "dcam",
   :rdfa/uri "http://purl.org/dc/dcam/"})

(def VocabularyEncodingScheme
  "An enumerated set of resources."
  {:db/ident :dcam/VocabularyEncodingScheme,
   :dcterms/issued #xsd/date #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment #rdf/langString "An enumerated set of resources.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/dc/dcam/"},
   :rdfs/label #rdf/langString "Vocabulary Encoding Scheme@en",
   :rdfs/seeAlso
   {:rdfa/uri
    "https://www.dublincore.org/specifications/dublin-core/2007/06/04/abstract-model/"},
   :rdfs/subClassOf :rdfs/Resource})

(def domainIncludes
  "A suggested class for subjects of this property."
  {:db/ident         :dcam/domainIncludes,
   :dcterms/issued   #xsd/date #inst "2020-01-20T00:00:00.000-05:00",
   :rdf/type         :rdf/Property,
   :rdfs/comment     #rdf/langString
                      "A suggested class for subjects of this property.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/dc/dcam/"},
   :rdfs/label       #rdf/langString "Domain Includes@en"})

(def memberOf
  "A relationship between a resource and a vocabulary encoding scheme which indicates that the resource is a member of a set."
  {:db/ident :dcam/memberOf,
   :dcterms/issued #xsd/date #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A relationship between a resource and a vocabulary encoding scheme which indicates that the resource is a member of a set.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/dc/dcam/"},
   :rdfs/label #rdf/langString "Member Of@en",
   :rdfs/range :dcam/VocabularyEncodingScheme,
   :rdfs/seeAlso
   {:rdfa/uri
    "https://www.dublincore.org/specifications/dublin-core/2007/06/04/abstract-model/"}})

(def rangeIncludes
  "A suggested class for values of this property."
  {:db/ident         :dcam/rangeIncludes,
   :dcterms/issued   #xsd/date #inst "2020-01-20T00:00:00.000-05:00",
   :rdf/type         :rdf/Property,
   :rdfs/comment     #rdf/langString
                      "A suggested class for values of this property.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/dc/dcam/"},
   :rdfs/label       #rdf/langString "Range Includes@en"})
