(ns net.wikipunk.rdf.dcam
  {:dcat/downloadURL
   "https://www.dublincore.org/specifications/dublin-core/dcmi-terms/dublin_core_abstract_model.ttl",
   :dcterms/modified #inst "2012-06-14T00:00:00.000-00:00",
   :dcterms/publisher {:xsd/anyURI "http://purl.org/dc/aboutdcmi#DCMI"},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Metadata terms for vocabulary description"},
   :namespaces {"dcam"    "http://purl.org/dc/dcam/",
                "dcterms" "http://purl.org/dc/terms/",
                "owl"     "http://www.w3.org/2002/07/owl#",
                "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                "skos"    "http://www.w3.org/2004/02/skos/core#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "dcam",
   :rdfa/uri "http://purl.org/dc/dcam/",
   :xsd/anyURI "http://purl.org/dc/dcam/"})

(def VocabularyEncodingScheme
  {:db/ident :dcam/VocabularyEncodingScheme,
   :dcterms/issued #inst "2008-01-14T00:00:00.000-00:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "An enumerated set of resources."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/dc/dcam/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vocabulary Encoding Scheme"},
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.dublincore.org/specifications/dublin-core/2007/06/04/abstract-model/"}})

(def domainIncludes
  {:db/ident         :dcam/domainIncludes,
   :dcterms/issued   #inst "2020-01-20T00:00:00.000-00:00",
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A suggested class for subjects of this property."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/dc/dcam/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Domain Includes"}})

(def memberOf
  {:db/ident :dcam/memberOf,
   :dcterms/issued #inst "2008-01-14T00:00:00.000-00:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A relationship between a resource and a vocabulary encoding scheme which indicates that the resource is a member of a set."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/dc/dcam/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Member Of"},
   :rdfs/range :dcam/VocabularyEncodingScheme,
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.dublincore.org/specifications/dublin-core/2007/06/04/abstract-model/"}})

(def rangeIncludes
  {:db/ident         :dcam/rangeIncludes,
   :dcterms/issued   #inst "2020-01-20T00:00:00.000-00:00",
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A suggested class for values of this property."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/dc/dcam/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Range Includes"}})

(def urn:uuid:a6d9685f-3f14-541e-87c6-86786f44ed46
  {:dcterms/modified  #inst "2012-06-14T00:00:00.000-00:00",
   :dcterms/publisher {:xsd/anyURI "http://purl.org/dc/aboutdcmi#DCMI"},
   :dcterms/title     {:rdf/language "en",
                       :rdf/value "Metadata terms for vocabulary description"},
   :xsd/anyURI        "http://purl.org/dc/dcam/"})