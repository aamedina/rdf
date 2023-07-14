(ns net.wikipunk.rdf.adms
  {:dcat/downloadURL  "http://uri.semic.eu/w3c/ns/adms.ttl",
   :dcterms/issued    #xsd/string "2023-04-05",
   :dcterms/license   {:rdfa/uri
                       "https://creativecommons.org/licenses/by/4.0/"},
   :dcterms/mediator  {:foaf/homepage {:rdfa/uri "https://semic.eu"},
                       :foaf/name
                       #xsd/string
                        "Semantic Interoperability Community (SEMIC)"},
   :foaf/maker        {:foaf/firstName #xsd/string "Pavlina",
                       :foaf/lastName  #xsd/string "Fragkou",
                       :rdf/type       :foaf/Person,
                       {:rdfa/uri "https://schema.org/affiliation"}
                       {:foaf/name #xsd/string "SEMIC EU"}},
   :rdf/ns-prefix-map {"adms" "http://www.w3.org/ns/adms#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "adms",
   :rdfa/uri          "http://www.w3.org/ns/adms",
   :rdfs/label        [#xsd/langString "adms@nl" #xsd/langString "adms@en"],
   {:rdfa/uri "http://www.w3.org/2001/02pd/rec54#editor"}
   [{:foaf/firstName #xsd/string "Bert",
     :foaf/lastName  #xsd/string "Van Nuffelen",
     :foaf/mbox      {:rdfa/uri "mailto:bert.van.nuffelen@tenforce.com"},
     :rdf/type       :foaf/Person,
     {:rdfa/uri "https://schema.org/affiliation"} {:foaf/name #xsd/string
                                                               "TenForce"}}
    {:foaf/firstName #xsd/string "Natasa",
     :foaf/lastName  #xsd/string "Sofou",
     :rdf/type       :foaf/Person}
    {:foaf/firstName #xsd/string "Pavlina",
     :foaf/lastName  #xsd/string "Fragkou",
     :rdf/type       :foaf/Person,
     {:rdfa/uri "https://schema.org/affiliation"} {:foaf/name #xsd/string
                                                               "SEMIC EU"}}
    {:foaf/firstName #xsd/string "Makx",
     :foaf/lastName  #xsd/string "Dekkers",
     :rdf/type       :foaf/Person}]}
  (:refer-clojure :exclude [last next]))

(def Asset
  "An abstract entity that reflects the intellectual content of the asset and represents those characteristics of the asset that are independent of its physical embodiment. This abstract entity combines the FRBR entities work (a distinct intellectual or artistic creation) and expression (the intellectual or artistic realization of a work)"
  {:db/ident :adms/Asset,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "An abstract entity that reflects the intellectual content of the asset and represents those characteristics of the asset that are independent of its physical embodiment. This abstract entity combines the FRBR entities work (a distinct intellectual or artistic creation) and expression (the intellectual or artistic realization of a work)@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/adms"},
   :rdfs/label #xsd/langString "Asset@en"})

(def AssetDistribution
  "A particular physical embodiment of an Asset, which is an example of the FRBR entity manifestation (the physical embodiment of an expression of a work)."
  {:db/ident :adms/AssetDistribution,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A particular physical embodiment of an Asset, which is an example of the FRBR entity manifestation (the physical embodiment of an expression of a work).@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/adms"},
   :rdfs/label #xsd/langString "Asset Distribution@en"})

(def AssetRepository
  "A system or service that provides facilities for storage and maintenance of descriptions of Assets and Asset Distributions, and functionality that allows users to search and access these descriptions. An Asset Repository will typically contain descriptions of several Assets and related Asset Distributions."
  {:db/ident :adms/AssetRepository,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A system or service that provides facilities for storage and maintenance of descriptions of Assets and Asset Distributions, and functionality that allows users to search and access these descriptions. An Asset Repository will typically contain descriptions of several Assets and related Asset Distributions.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/adms"},
   :rdfs/label #xsd/langString "Asset repository@en"})

(def Identifier
  "This is based on the UN/CEFACT Identifier class."
  {:db/ident         :adms/Identifier,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString
                      "This is based on the UN/CEFACT Identifier class.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/adms"},
   :rdfs/label       #xsd/langString "Identifier@en"})

(def identifier
  "Links a resource to an adms:Identifier class."
  {:db/ident         :adms/identifier,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #xsd/langString
                      "Links a resource to an adms:Identifier class.@en",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/adms"},
   :rdfs/label       #xsd/langString "identifier@en",
   :rdfs/range       :adms/Identifier})

(def includedAsset
  "An Asset that is contained in the Asset being described, e.g. when there are several vocabularies defined in a single document."
  {:db/ident :adms/includedAsset,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "An Asset that is contained in the Asset being described, e.g. when there are several vocabularies defined in a single document.@en",
   :rdfs/domain :adms/Asset,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/adms"},
   :rdfs/label #xsd/langString "included asset@en",
   :rdfs/range :adms/Asset})

(def interoperabilityLevel
  "The interoperability level for which the Asset is relevant."
  {:db/ident :adms/interoperabilityLevel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "The interoperability level for which the Asset is relevant.@en",
   :rdfs/domain :adms/Asset,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/adms"},
   :rdfs/label #xsd/langString "interoperability level@en",
   :rdfs/range :skos/Concept})

(def last
  "A link to the current or latest version of the Asset."
  {:db/ident :adms/last,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment #xsd/langString
                  "A link to the current or latest version of the Asset.@en",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/adms"},
   :rdfs/label #xsd/langString "last@en",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :xhv/last})

(def next
  "A link to the next version of the Asset."
  {:db/ident           :adms/next,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       #xsd/langString
                        "A link to the next version of the Asset.@en",
   :rdfs/domain        :rdfs/Resource,
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/ns/adms"},
   :rdfs/label         #xsd/langString "next@en",
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :xhv/next})

(def prev
  "A link to the previous version of the Asset."
  {:db/ident           :adms/prev,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       #xsd/langString
                        "A link to the previous version of the Asset.@en",
   :rdfs/domain        :rdfs/Resource,
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/ns/adms"},
   :rdfs/label         #xsd/langString "prev@en",
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :xhv/prev})

(def representationTechnique
  "More information about the format in which an Asset Distribution is released. This is different from the file format as, for example, a ZIP file (file format) could contain an XML schema (representation technique)."
  {:db/ident :adms/representationTechnique,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "More information about the format in which an Asset Distribution is released. This is different from the file format as, for example, a ZIP file (file format) could contain an XML schema (representation technique).@en",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/adms"},
   :rdfs/label #xsd/langString "representation technique@en",
   :rdfs/range :skos/Concept})

(def sample
  "Links to a sample of an Asset (which is itself an Asset)."
  {:db/ident :adms/sample,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Links to a sample of an Asset (which is itself an Asset).@en",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/adms"},
   :rdfs/label #xsd/langString "sample@en",
   :rdfs/range :rdfs/Resource})

(def schemaAgency
  "The name of the agency that issued the identifier."
  {:db/ident         :adms/schemaAgency,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #xsd/langString
                      "The name of the agency that issued the identifier.@en",
   :rdfs/domain      :adms/Identifier,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/adms"},
   :rdfs/label       #xsd/langString "schema agency@en",
   :rdfs/range       :rdfs/Literal})

(def schemeAgency
  "schema agency"
  {:db/ident :adms/schemeAgency,
   :dcterms/isReplacedBy :adms/schemaAgency,
   :owl/deprecated true,
   :owl/equivalentProperty :adms/schemaAgency,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/langString "The name of the agency that issued the identifier.@en"
    #xsd/string
     "This property is deprecated because in in HTML specification another URI was used."],
   :rdfs/domain :adms/Identifier,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/adms"},
   :rdfs/label #xsd/langString "schema agency@en",
   :rdfs/range :rdfs/Literal})

(def status
  "The status of the Asset in the context of a particular workflow process."
  {:db/ident :adms/status,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "The status of the Asset in the context of a particular workflow process.@en",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/adms"},
   :rdfs/label #xsd/langString "status@en",
   :rdfs/range :skos/Concept})

(def supportedSchema
  "A schema according to which the Asset Repository can provide data about its content, e.g. ADMS."
  {:db/ident :adms/supportedSchema,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "A schema according to which the Asset Repository can provide data about its content, e.g. ADMS.@en",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/adms"},
   :rdfs/label #xsd/langString "supported schema@en",
   :rdfs/range :adms/Asset})

(def translation
  "Links Assets that are translations of each other."
  {:db/ident         :adms/translation,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #xsd/langString
                      "Links Assets that are translations of each other.@en",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/adms"},
   :rdfs/label       #xsd/langString "translation@en",
   :rdfs/range       :rdfs/Resource})

(def versionNotes
  "A description of changes between this version and the previous version of the Asset."
  {:db/ident :adms/versionNotes,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "A description of changes between this version and the previous version of the Asset.@en",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/adms"},
   :rdfs/label #xsd/langString "version notes@en",
   :rdfs/range :rdfs/Literal})