(ns net.wikipunk.rdf.adms
  "ADMS is a profile of DCAT, used to describe semantic assets (or just 'Assets'), defined as highly reusable metadata (e.g. xml schemata, generic data models) and reference data (e.g. code lists, taxonomies, dictionaries, vocabularies) that are used for eGovernment system development."
  {:dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "ADMS is a profile of DCAT, used to describe semantic assets (or just 'Assets'), defined as highly reusable metadata (e.g. xml schemata, generic data models) and reference data (e.g. code lists, taxonomies, dictionaries, vocabularies) that are used for eGovernment system development."},
   :dcterms/creator
   [{:foaf/homepage      "http://andrea-perego.name/",
     :foaf/name          "Andrea Perego",
     :rdfs/seeAlso       "http://andrea-perego.name/foaf/#me",
     :schema/affiliation {:foaf/homepage "http://ies.jrc.ec.europa.eu/DE",
                          :foaf/name
                          "European Commission, Joint Research Centre "}}
    {:foaf/homepage      "http://www.w3.org/People/all#phila",
     :foaf/name          "Phil Archer",
     :rdfs/seeAlso       "http://philarcher.org/foaf.rdf#me",
     :schema/affiliation "http://www.w3.org/data#W3C"}
    {:foaf/homepage "http://makxdekkers.com/",
     :foaf/name     "Makx Dekkers",
     :rdfs/seeAlso  "http://makxdekkers.com/makxdekkers.rdf#me"}],
   :dcterms/description
   "This is the RDF encoding of the Asset Description Metadata Schema, originally \n    developed under the European Union's ISA Programme and further developed by the W3C Government Linked Data Working Group.\n    It re-uses terms from several other vocabularies, notably Dublin Core, with elements of SKOS, FOAF and more. ",
   :dcterms/modified [#inst "2015-07-22T00:00:00.000-04:00"
                      #inst "2013-05-24T00:00:00.000-04:00"
                      #inst "2013-09-16T00:00:00.000-04:00"
                      #inst "2013-12-21T00:00:00.000-05:00"],
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Asset Description Metadata Schema (ADMS)"},
   :foaf/maker
   {:foaf/homepage "http://www.w3.org/2011/gld/",
    :foaf/name
    "Government Linked Data WG, based on output from the ADMS Working Group"},
   :rdf/ns-prefix-map {"adms"    "http://www.w3.org/ns/adms#",
                       "dcat"    "http://www.w3.org/ns/dcat#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "schema"  "http://schema.org/",
                       "skos"    "http://www.w3.org/2004/02/skos/core#",
                       "vann"    "http://purl.org/vocab/vann/",
                       "vcard"   "http://www.w3.org/2006/vcard/ns#",
                       "voaf"    "http://purl.org/vocommons/voaf#",
                       "wdrs"    "http://www.w3.org/2007/05/powder-s#",
                       "xhv"     "http://www.w3.org/1999/xhtml/vocab#",
                       "xml"     "http://www.w3.org/XML/1998/namespace",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology
   :rdf/uri "http://www.w3.org/ns/adms",
   :rdfa/prefix "adms",
   :rdfa/uri "http://www.w3.org/ns/adms#",
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This file specifies the set of RDF classes and properties used in ADMS"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Asset Description Metadata Schema (ADMS)"},
   :vann/preferredNamespacePrefix "adms",
   :vann/preferredNamespaceUri "http://www.w3.org/ns/adms#",
   :voaf/specializes "http://www.w3.org/ns/dcat#",
   :wdrs/describedby "http://www.w3.org/TR/vocab-adms"}
  (:refer-clojure :exclude [last next]))

(def Asset
  "An Asset is an abstract entity that reflects the intellectual content of the asset and represents those characteristics of the asset that are independent of its physical embodiment. This abstract entity combines the FRBR entities work (a distinct intellectual or artistic creation) and expression (the intellectual or artistic realization of a work). Assets can be versioned. Every time the intellectual content of an asset changes, the result is considered to be a new asset that can be linked to previous and next versions of the Asset. The physical embodiment of an Asset is called an Asset Distribution. A particular Asset may have zero or more Asset Distributions.."
  {:db/ident :adms/Asset,
   :dcterms/identifier "adms:Asset",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An Asset is an abstract entity that reflects the intellectual content of the asset and represents those characteristics of the asset that are independent of its physical embodiment. This abstract entity combines the FRBR entities work (a distinct intellectual or artistic creation) and expression (the intellectual or artistic realization of a work). Assets can be versioned. Every time the intellectual content of an asset changes, the result is considered to be a new asset that can be linked to previous and next versions of the Asset. The physical embodiment of an Asset is called an Asset Distribution. A particular Asset may have zero or more Asset Distributions.."},
   :rdfs/isDefinedBy "http://www.w3.org/TR/vocab-adms",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Asset"},
   :rdfs/subClassOf :dcat/Dataset})

(def AssetDistribution
  "An Asset Distribution represents a particular physical embodiment of an Asset, which is an example of the FRBR entity manifestation (the physical embodiment of an expression of a work). An Asset Distribution is typically a downloadable computer file (but in principle it could also be a paper document) that implements the intellectual content of an Asset. A particular Asset Distribution is associated with one and only one Asset, while all Distributions of an Asset share the same intellectual content in different physical formats. Asset Distributions themselves are not versioned."
  {:db/ident :adms/AssetDistribution,
   :dcterms/identifier "adms:AssetDistribution",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An Asset Distribution represents a particular physical embodiment of an Asset, which is an example of the FRBR entity manifestation (the physical embodiment of an expression of a work). An Asset Distribution is typically a downloadable computer file (but in principle it could also be a paper document) that implements the intellectual content of an Asset. A particular Asset Distribution is associated with one and only one Asset, while all Distributions of an Asset share the same intellectual content in different physical formats. Asset Distributions themselves are not versioned."},
   :rdfs/isDefinedBy "http://www.w3.org/TR/vocab-adms",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Asset Distribution"},
   :rdfs/subClassOf :dcat/Distribution})

(def AssetRepository
  "An Asset Repository is a system or service that provides facilities for storage and maintenance of descriptions of Assets and Asset Distributions, and functionality that allows users to search and access these descriptions. An Asset Repository will typically contain descriptions of several Assets and related Asset Distributions."
  {:db/ident :adms/AssetRepository,
   :dcterms/identifier "adms:AssetRepository",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An Asset Repository is a system or service that provides facilities for storage and maintenance of descriptions of Assets and Asset Distributions, and functionality that allows users to search and access these descriptions. An Asset Repository will typically contain descriptions of several Assets and related Asset Distributions."},
   :rdfs/isDefinedBy "http://www.w3.org/TR/vocab-adms",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Asset Repository"},
   :rdfs/subClassOf :dcat/Catalog})

(def Identifier
  "This class is based on the UN/CEFACT Identifier complex type defined in See Section 5.8 of Core Components Data Type Catalogue Version 3.1 (http://www.unece.org/fileadmin/DAM/cefact/codesfortrade/CCTS/CCTS-DTCatalogueVersion3p1.pdf) In RDF this is expressed using the following properties: - the content string should be provided using skos:notation, datatyped with the identifier scheme (inclduing the version number if appropriate); - use dcterms:creator to link to a class describing the agency that manages the identifier scheme or adms:schemaAgency to provide the name as a literal. Although not part of the ADMS conceptual model, it may be useful to provide further properties to the Identifier class such as dcterms:created to provide the date on which the identifier was issued."
  {:db/ident :adms/Identifier,
   :dcterms/identifier "adms:Identifier",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "This class is based on the UN/CEFACT Identifier complex type defined in See Section 5.8 of Core Components Data Type Catalogue Version 3.1 (http://www.unece.org/fileadmin/DAM/cefact/codesfortrade/CCTS/CCTS-DTCatalogueVersion3p1.pdf) In RDF this is expressed using the following properties: - the content string should be provided using skos:notation, datatyped with the identifier scheme (inclduing the version number if appropriate); - use dcterms:creator to link to a class describing the agency that manages the identifier scheme or adms:schemaAgency to provide the name as a literal. Although not part of the ADMS conceptual model, it may be useful to provide further properties to the Identifier class such as dcterms:created to provide the date on which the identifier was issued.",
   :rdfs/isDefinedBy "http://www.w3.org/TR/vocab-adms",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Identifier"}})

(def identifier
  "adms:identifier is used to link any resource to an instance of adms:Identifier which is its range. N.B. it is not appropriate to use dcterms:identifer to link to the Identifier class as its range is rdfs:Literal. ADMS uses this to provide any identifier for the Asset."
  {:db/ident :adms/identifier,
   :dcterms/identifier "adms:identifier",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "adms:identifier is used to link any resource to an instance of adms:Identifier which is its range. N.B. it is not appropriate to use dcterms:identifer to link to the Identifier class as its range is rdfs:Literal. ADMS uses this to provide any identifier for the Asset."},
   :rdfs/isDefinedBy "http://www.w3.org/TR/vocab-adms",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "identifier"},
   :rdfs/range :adms/Identifier})

(def includedAsset
  "Links to an Asset that is contained in the Asset being described, e.g. when there are several vocabularies defined in a single document."
  {:db/ident :adms/includedAsset,
   :dcterms/identifier "adms:includedAsset",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Links to an Asset that is contained in the Asset being described, e.g. when there are several vocabularies defined in a single document."},
   :rdfs/domain :adms/Asset,
   :rdfs/isDefinedBy "http://www.w3.org/TR/vocab-adms",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "included asset"},
   :rdfs/range :adms/Asset})

(def interoperabilityLevel
  "Links an Asset to its adms:InteroperabilityLevel. Since this is encoded using skos:Concept, that is the defined range for this property."
  {:db/ident :adms/interoperabilityLevel,
   :dcterms/identifier "adms:interoperabilityLevel",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Links an Asset to its adms:InteroperabilityLevel. Since this is encoded using skos:Concept, that is the defined range for this property."},
   :rdfs/domain :adms/Asset,
   :rdfs/isDefinedBy "http://www.w3.org/TR/vocab-adms",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "interoperability level"},
   :rdfs/range :skos/Concept})

(def last
  "A link to the current or latest version of the Asset."
  {:db/ident :adms/last,
   :dcterms/identifier "adms:last",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "A link to the current or latest version of the Asset."},
   :rdfs/isDefinedBy "http://www.w3.org/TR/vocab-adms",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "last"},
   :rdfs/subPropertyOf :xhv/last})

(def next
  "A link to the next version of the Asset."
  {:db/ident           :adms/next,
   :dcterms/identifier "adms:next",
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value "A link to the next version of the Asset."},
   :rdfs/isDefinedBy   "http://www.w3.org/TR/vocab-adms",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "next"},
   :rdfs/subPropertyOf :xhv/next})

(def prev
  "A link to the previous version of the Asset."
  {:db/ident           :adms/prev,
   :dcterms/identifier "adms:prev",
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "A link to the previous version of the Asset."},
   :rdfs/isDefinedBy   "http://www.w3.org/TR/vocab-adms",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "prev"},
   :rdfs/subPropertyOf :xhv/prev})

(def representationTechnique
  "Links an adms:AssetDistribution to a skos:Concept that is its adms:RepresentationTechnique."
  {:db/ident :adms/representationTechnique,
   :dcterms/identifier "adms:representationTechnique",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Links an adms:AssetDistribution to a skos:Concept that is its adms:RepresentationTechnique."},
   :rdfs/isDefinedBy "http://www.w3.org/TR/vocab-adms",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "representation technique"},
   :rdfs/range :skos/Concept})

(def sample
  "Links to a sample of an Asset (which is itself an Asset)."
  {:db/ident :adms/sample,
   :dcterms/identifier "adms:sample",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Links to a sample of an Asset (which is itself an Asset)."},
   :rdfs/domain :adms/Asset,
   :rdfs/isDefinedBy "http://www.w3.org/TR/vocab-adms",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "sample"},
   :rdfs/range :adms/Asset})

(def schemeAgency
  "The name of the agency responsible for issuing the identifier"
  {:db/ident :adms/schemeAgency,
   :dcterms/identifier "adms:schemeAgency",
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The name of the agency responsible for issuing the identifier"},
   :rdfs/domain :adms/Identifier,
   :rdfs/isDefinedBy "http://www.w3.org/TR/vocab-adms",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "scheme agency"},
   :rdfs/range :rdfs/Literal})

(def status
  "Links to the status of the Asset or Asset Distribution in the context of a particular workflow process. Since Status is defined using a skos:Concept, that is the defined range for this property."
  {:db/ident :adms/status,
   :dcterms/identifier "adms:status",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "Links to the status of the Asset or Asset Distribution in the context of a particular workflow process. Since Status is defined using a skos:Concept, that is the defined range for this property.",
   :rdfs/isDefinedBy "http://www.w3.org/TR/vocab-adms",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "status"},
   :rdfs/range :skos/Concept})

(def supportedSchema
  "A schema according to which the Asset Repository can provide data about its content, e.g. ADMS"
  {:db/ident :adms/supportedSchema,
   :dcterms/identifier "adms:supportedSchema",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A schema according to which the Asset Repository can provide data about its content, e.g. ADMS"},
   :rdfs/isDefinedBy "http://www.w3.org/TR/vocab-adms",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "supported schema"},
   :rdfs/range :adms/Asset})

(def translation
  "Links Assets that are translations of each other."
  {:db/ident           :adms/translation,
   :dcterms/identifier "adms:translation",
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "Links Assets that are translations of each other."},
   :rdfs/isDefinedBy   "http://www.w3.org/TR/vocab-adms",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "translation"}})

(def versionNotes
  "A description of changes between this version and the previous version of the Asset."
  {:db/ident :adms/versionNotes,
   :dcterms/identifier "adms:versionNotes",
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A description of changes between this version and the previous version of the Asset."},
   :rdfs/isDefinedBy "http://www.w3.org/TR/vocab-adms",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "version info"},
   :rdfs/range :rdfs/Literal})
