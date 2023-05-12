(ns net.wikipunk.rdf.dcam
  "Metadata terms for vocabulary description"
  {:dcat/downloadURL
   "https://www.dublincore.org/specifications/dublin-core/dcmi-terms/dublin_core_abstract_model.ttl",
   :dcterms/modified #inst "2012-06-14T00:00:00.000-04:00",
   :dcterms/publisher "http://purl.org/dc/aboutdcmi#DCMI",
   :dcterms/title "Metadata terms for vocabulary description",
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
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment "An enumerated set of resources.",
   :rdfs/isDefinedBy "http://purl.org/dc/dcam/",
   :rdfs/label "Vocabulary Encoding Scheme",
   :rdfs/seeAlso
   ["https://www.dublincore.org/specifications/dublin-core/2007/06/04/abstract-model/"],
   :rdfs/subClassOf [:rdfs/Resource :dcam/VocabularyEncodingScheme]})

(def domainIncludes
  "A suggested class for subjects of this property."
  {:db/ident           :dcam/domainIncludes,
   :dcterms/issued     #inst "2020-01-20T00:00:00.000-05:00",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "A suggested class for subjects of this property.",
   :rdfs/isDefinedBy   "http://purl.org/dc/dcam/",
   :rdfs/label         "Domain Includes",
   :rdfs/subPropertyOf :dcam/domainIncludes})

(def memberOf
  "A relationship between a resource and a vocabulary encoding scheme which indicates that the resource is a member of a set."
  {:db/ident :dcam/memberOf,
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A relationship between a resource and a vocabulary encoding scheme which indicates that the resource is a member of a set.",
   :rdfs/isDefinedBy "http://purl.org/dc/dcam/",
   :rdfs/label "Member Of",
   :rdfs/range :dcam/VocabularyEncodingScheme,
   :rdfs/seeAlso
   ["https://www.dublincore.org/specifications/dublin-core/2007/06/04/abstract-model/"],
   :rdfs/subPropertyOf :dcam/memberOf})

(def rangeIncludes
  "A suggested class for values of this property."
  {:db/ident           :dcam/rangeIncludes,
   :dcterms/issued     #inst "2020-01-20T00:00:00.000-05:00",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "A suggested class for values of this property.",
   :rdfs/isDefinedBy   "http://purl.org/dc/dcam/",
   :rdfs/label         "Range Includes",
   :rdfs/subPropertyOf :dcam/rangeIncludes})