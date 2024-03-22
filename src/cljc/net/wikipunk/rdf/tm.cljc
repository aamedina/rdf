(ns net.wikipunk.rdf.tm
  {:dc11/publisher {:rdf/type    :schema/Organization,
                    :schema/name {:rdf/language "en",
                                  :rdf/value "W3C Web of Things Working Group"},
                    :schema/url  {:xsd/anyURI "https://www.w3.org/WoT/WG/"}},
   :dc11/title {:rdf/language "en",
                :rdf/value    "Thing Model Ontology"},
   :dcat/downloadURL
   "https://github.com/w3c/wot-thing-description/raw/main/ontology/tm.ttl",
   :dcterms/author #{"Mahda Noura (Siemens)" "Sebastian Kaebisch (Siemens)"},
   :dcterms/contributor {:xsd/anyURI "https://vcharpenay.link/#me"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "This ontology describes Thing Model concepts"},
   :dcterms/license {:xsd/anyURI "http://purl.org/NET/rdflicense/cc-by4.0"},
   :namespaces {"dc11"    "http://purl.org/dc/elements/1.1/",
                "dcterms" "http://purl.org/dc/terms/",
                "foaf"    "http://xmlns.com/foaf/0.1/",
                "hctl"    "https://www.w3.org/2019/wot/hypermedia#",
                "owl"     "http://www.w3.org/2002/07/owl#",
                "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                "schema"  "http://schema.org/",
                "td"      "https://www.w3.org/2019/wot/td#",
                "tm"      "https://www.w3.org/2019/wot/tm#",
                "vann"    "http://purl.org/vocab/vann/",
                "xml"     "http://www.w3.org/XML/1998/namespace",
                "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :owl/versionInfo "1.1.0",
   :rdf/type :owl/Ontology,
   :rdfa/prefix "tm",
   :rdfa/uri "https://www.w3.org/2019/wot/tm#",
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This ontology aims to model the Web of Things Thing Model according to the W3C Working Group (https://www.w3.org/wot/)"},
   :vann/preferredNamespacePrefix "tm",
   :vann/preferredNamespaceUri "https://www.w3.org/2019/wot/tm#",
   :xsd/anyURI "https://www.w3.org/2019/wot/tm"}
  (:refer-clojure :exclude [ref]))

(def ThingModel
  {:db/ident :tm/ThingModel,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Thing Model is a description for a class of Things that have the same capabilities. It describes the Properties, Actions, and Events and common metadata that are shared for an entire group of Things. Compared to a Thing Description, a Thing Model does not contain enough information to identify or interact with a Thing instance."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/tm#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ThingModel"}})

(def Version
  {:db/ident :tm/Version,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The Version is a container that provides versioning information for the Thing Model definition."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/tm#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Version"}})

(def hasVersion
  {:db/ident :tm/hasVersion,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Provides the relation between a Thing Model and its version."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/tm#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "hasVersion"},
   :schema/domainIncludes :tm/ThingModel,
   :schema/rangeIncludes :tm/Version})

(def model
  {:db/ident             :tm/model,
   :rdf/type             :owl/DatatypeProperty,
   :rdfs/comment         {:rdf/language "en",
                          :rdf/value
                          "Provides a version indicator of the underlying TM."},
   :rdfs/isDefinedBy     {:xsd/anyURI "https://www.w3.org/2019/wot/tm#"},
   :rdfs/label           {:rdf/language "en",
                          :rdf/value    "model"},
   :schema/domainIncludes :tm/Version,
   :schema/rangeIncludes :schema/Text})

(def optional
  {:db/ident :tm/optional,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Constraint that provides references to declarations in the Thing Model that are optional and do not necessarily need to be implemented when Thing Description instances are derived from this Thing Model. The value of tm:optional MUST provide JSON Pointer [RFC6901] references to the required interaction model definitions."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/tm#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "optional"},
   :schema/domainIncludes :tm/ThingModel,
   :schema/rangeIncludes :schema/Text})

(def ref
  {:db/ident :tm/ref,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Provides a reference to an existing (external or local) definition that is copied into a newly defined definition. The reference value is based on three parts: an (optional) URI-reference (used for external reference), '#' sign, and JSON Pointer [RFC6901] value."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/tm#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ref"},
   :rdfs/seeAlso :schema/contactPoint,
   :schema/domainIncludes :td/InteractionAffordance,
   :schema/rangeIncludes :schema/Text})

(def required
  {:db/ident :tm/required,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Constraint that provides references to declarations in the Thing Model that are mandatory and must be present when Thing Description instances are derived from this Thing Model. The reference value is a JSON Pointer [RFC6901]."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/tm#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "required"},
   :schema/domainIncludes :tm/ThingModel,
   :schema/rangeIncludes :schema/Text})

(def versionInfo
  {:db/ident         :tm/versionInfo,
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Provides version information of the TM ontology."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/tm#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "versionInfo"},
   :rdfs/seeAlso     :schema/version})

(def urn:uuid:f4e7e751-fdbf-5ebe-b37c-a60d5c8568b6
  {:dc11/publisher {:rdf/type    :schema/Organization,
                    :schema/name {:rdf/language "en",
                                  :rdf/value "W3C Web of Things Working Group"},
                    :schema/url  {:xsd/anyURI "https://www.w3.org/WoT/WG/"}},
   :dc11/title {:rdf/language "en",
                :rdf/value    "Thing Model Ontology"},
   :dcterms/author #{"Mahda Noura (Siemens)" "Sebastian Kaebisch (Siemens)"},
   :dcterms/contributor {:xsd/anyURI "https://vcharpenay.link/#me"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "This ontology describes Thing Model concepts"},
   :dcterms/license {:xsd/anyURI "http://purl.org/NET/rdflicense/cc-by4.0"},
   :owl/versionInfo "1.1.0",
   :rdf/type :owl/Ontology,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This ontology aims to model the Web of Things Thing Model according to the W3C Working Group (https://www.w3.org/wot/)"},
   :vann/preferredNamespacePrefix "tm",
   :vann/preferredNamespaceUri "https://www.w3.org/2019/wot/tm#",
   :xsd/anyURI "https://www.w3.org/2019/wot/tm"})