(ns net.wikipunk.rdf.bibframe
  "The Bibframe vocabulary consists of RDF classes and properties used for the description of items cataloged principally by libraries, but may also be used to describe items cataloged by museums and archives. Classes include the three core classes - Work, Instance, and Item - in addition to many more classes to support description. Properties describe characteristics of the resource being described as well as relationships among resources. For example: one Work might be a \"translation of\" another Work; an Instance may be an \"instance of\" a particular Bibframe Work. Other properties describe attributes of Works and Instances. For example: the Bibframe property \"subject\" expresses an important attribute of a Work (what the Work is about), and the property \"extent\" (e.g. number of pages) expresses an attribute of an Instance."
  {:cc/license "https://creativecommons.org/publicdomain/zero/1.0/",
   :dcat/downloadURL "https://id.loc.gov/ontologies/bibframe.rdf",
   :dcterms/creator {:rdfs/resource
                     "http://id.loc.gov/vocabulary/organizations/dlc"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Bibframe vocabulary consists of RDF classes and properties used for the description of \n            items cataloged principally by libraries, but may also be used to describe items cataloged by museums and archives. \n            Classes include the three core classes - Work, Instance, and Item - in addition to many more \n            classes to support description. Properties describe characteristics of the resource being \n            described as well as relationships among resources. For example: one Work\n            might be a \"translation of\" another Work; an Instance may be an \n            \"instance of\" a particular Bibframe Work.  Other properties describe attributes of Works and Instances.  For\n            example: the Bibframe property \"subject\" expresses an important attribute of a Work \n            (what the Work is about), and the property \"extent\" (e.g. number of pages) expresses an\n            attribute of an Instance."},
   :dcterms/issued #inst "2022-10-06T17:00:00.000-00:00",
   :dcterms/modified #inst "2022-10-18T19:48:05.075-00:00",
   :dcterms/publisher {:rdfs/resource
                       "http://id.loc.gov/vocabulary/organizations/dlcmrc"},
   :dcterms/rights "https://creativecommons.org/publicdomain/zero/1.0/",
   :owl/priorVersion "http://id.loc.gov/ontologies/bibframe-2-1-0/",
   :owl/versionIRI "http://id.loc.gov/ontologies/bibframe-2-2-0/",
   :owl/versionInfo "2.2.0",
   :rdf/ns-prefix-map {"bf"       "http://id.loc.gov/ontologies/bibframe/",
                       "bflc"     "http://id.loc.gov/ontologies/bflc/",
                       "bibframe" "http://id.loc.gov/ontologies/bibframe/",
                       "cc"       "http://creativecommons.org/ns#",
                       "dcterms"  "http://purl.org/dc/terms/",
                       "foaf"     "http://xmlns.com/foaf/0.1/",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "skos"     "http://www.w3.org/2004/02/skos/core#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://id.loc.gov/ontologies/bibframe/",
   :rdfa/prefix "bibframe",
   :rdfa/uri "http://id.loc.gov/ontologies/bibframe/",
   :rdfs/label "BIBFRAME vocabulary"}
  (:refer-clojure :exclude [agent binding count]))

(def AbbreviatedTitle
  "Title as abbreviated for citation, indexing, and/or identification."
  {:db/ident :bibframe/AbbreviatedTitle,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Abbreviated title",
   :rdfs/subClassOf :bibframe/VariantTitle,
   :skos/definition
   "Title as abbreviated for citation, indexing, and/or identification."})

(def AccessPolicy
  "Access restrictions and allowances regarding access to a resource, e.g., lending policy, access restrictions, embargos."
  {:db/ident :bibframe/AccessPolicy,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Access policy",
   :rdfs/subClassOf :bibframe/UsageAndAccessPolicy,
   :skos/definition
   "Access restrictions and allowances regarding access to a resource, e.g., lending policy, access restrictions, embargos."})

(def AccessionNumber
  "Accession Number"
  {:db/ident         :bibframe/AccessionNumber,
   :dcterms/modified "2021-06-09 (New [GH11])",
   :rdf/type         :owl/Class,
   :rdfs/label       "Accession number",
   :rdfs/subClassOf  :bibframe/Identifier,
   :skos/definition  "Accession Number"})

(def AcquisitionSource
  "Information about an organization, person, etc., from which a resource may be obtained."
  {:db/ident :bibframe/AcquisitionSource,
   :dcterms/modified "2017-02-06 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Acquisition source",
   :skos/definition
   "Information about an organization, person, etc., from which a resource may be obtained."})

(def AdminMetadata
  "Metadata about the metadata, especially provenance information."
  {:db/ident :bibframe/AdminMetadata,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Administrative metadata",
   :skos/definition
   "Metadata about the metadata, especially provenance information."})

(def Agent
  "Entity having a role in a resource, such as a person or organization."
  {:db/ident :bibframe/Agent,
   :dcterms/modified ["2016-05-13 (New subclass)" "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Agent",
   :rdfs/subClassOf :foaf/Agent,
   :skos/definition
   "Entity having a role in a resource, such as a person or organization."})

(def Ansi
  "American National Standards Institute identifier."
  {:db/ident         :bibframe/Ansi,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "ANSI number",
   :rdfs/subClassOf  :bibframe/Identifier,
   :skos/definition  "American National Standards Institute identifier."})

(def AppliedMaterial
  "Physical or chemical substance applied to a base material of a resource."
  {:db/ident :bibframe/AppliedMaterial,
   :dcterms/modified ["2021-06-09 (Changed subclass to Material [GH28])"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Applied material",
   :rdfs/subClassOf :bibframe/Material,
   :skos/definition
   "Physical or chemical substance applied to a base material of a resource."})

(def Archival
  "Resources organically created, accumulated, and/or used by a person, family, or organization in the course of conduct of affairs and preserved because of their continuing value."
  {:db/ident :bibframe/Archival,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Archival controlled",
   :rdfs/subClassOf :bibframe/Instance,
   :skos/definition
   "Resources organically created, accumulated, and/or used by a person, family, or organization in the course of conduct of affairs and preserved because of their continuing value."})

(def Arrangement
  "Resource that represents an arrangement of another resource."
  {:db/ident :bibframe/Arrangement,
   :dcterms/modified ["2021-06-09 (Redefined [GH77])" "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Arrangement",
   :rdfs/subClassOf :bibframe/Work,
   :skos/definition
   "Resource that represents an arrangement of another resource."})

(def AspectRatio
  "Proportional relationship between an image's width and its height."
  {:db/ident :bibframe/AspectRatio,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Aspect ratio",
   :skos/definition
   "Proportional relationship between an image's width and its height."})

(def Audio
  "Resources expressed in an audible form, including music or other sounds."
  {:db/ident :bibframe/Audio,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Audio",
   :rdfs/subClassOf :bibframe/Work,
   :skos/definition
   "Resources expressed in an audible form, including music or other sounds."})

(def AudioIssueNumber
  "Number assigned by publishers of sound recordings to identify the issue designation, or serial identification, of the resource."
  {:db/ident :bibframe/AudioIssueNumber,
   :dcterms/modified ["2017-02-03 (Revised property name and definition)"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Audio issue number",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "Number assigned by publishers of sound recordings to identify the issue designation, or serial identification, of the resource."})

(def AudioTake
  "Identifier assigned to the smallest identifiable unit of a recording session, e.g., a specific recording of an individual song."
  {:db/ident :bibframe/AudioTake,
   :dcterms/modified "2017-02-03 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Audio recording take",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "Identifier assigned to the smallest identifiable unit of a recording session, e.g., a specific recording of an individual song."})

(def Barcode
  "Optical machine-readable representation of data relating to the item to which it is attached."
  {:db/ident :bibframe/Barcode,
   :dcterms/modified
   ["2017-02-03 (Moved to Identifier class group from Item group)"
    "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Barcode",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "Optical machine-readable representation of data relating to the item to which it is attached."})

(def BaseMaterial
  "Underlying physical material of a resource."
  {:db/ident         :bibframe/BaseMaterial,
   :dcterms/modified ["2021-06-09 (Changed subclass to Material [GH28])"
                      "2016-04-21 (New)"],
   :rdf/type         :owl/Class,
   :rdfs/label       "Base material",
   :rdfs/subClassOf  :bibframe/Material,
   :skos/definition  "Underlying physical material of a resource."})

(def Binding
  "Information about methods used to bind a published or unpublished resource, or other binding information."
  {:db/ident :bibframe/Binding,
   :dcterms/modified "2022-10-03 (New [GH91])",
   :rdf/type :owl/Class,
   :rdfs/label "Binding method",
   :skos/definition
   "Information about methods used to bind a published or unpublished resource, or other binding information."})

(def BookFormat
  "Result of folding a printed sheet to form a gathering of leaves."
  {:db/ident :bibframe/BookFormat,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Book format",
   :skos/definition
   "Result of folding a printed sheet to form a gathering of leaves."})

(def BroadcastStandard
  "System used to format a video resource for television broadcast, e.g., HDTV, PAL."
  {:db/ident :bibframe/BroadcastStandard,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Broadcast standard",
   :rdfs/subClassOf :bibframe/VideoCharacteristic,
   :skos/definition
   "System used to format a video resource for television broadcast, e.g., HDTV, PAL."})

(def Capture
  "Information about place and date associated with the capture (i.e., recording, filming, etc.) of the content of a resource."
  {:db/ident :bibframe/Capture,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Capture of content",
   :skos/definition
   "Information about place and date associated with the capture (i.e., recording, filming, etc.) of the content of a resource."})

(def Carrier
  "Categorization reflecting the format of the storage medium and housing of a carrier."
  {:db/ident :bibframe/Carrier,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Carrier type",
   :skos/definition
   "Categorization reflecting the format of the storage medium and housing of a carrier."})

(def Cartographic
  "Content that represents the whole or part of the earth, any celestial body, or imaginary place at any scale."
  {:db/ident :bibframe/Cartographic,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Cartographic information",
   :skos/definition
   "Content that represents the whole or part of the earth, any celestial body, or imaginary place at any scale."})

(def CartographicDataType
  "Data type for encoding of geospatial information in a cartographic resource, e.g., raster, vector, point."
  {:db/ident :bibframe/CartographicDataType,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Digital cartographic data type",
   :rdfs/subClassOf :bibframe/DigitalCharacteristic,
   :skos/definition
   "Data type for encoding of geospatial information in a cartographic resource, e.g., raster, vector, point."})

(def CartographicObjectType
  "Object type for encoding of geospatial information in a cartographic resource, e.g., point, line, polygon."
  {:db/ident :bibframe/CartographicObjectType,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Digital cartographic object type",
   :rdfs/subClassOf :bibframe/DigitalCharacteristic,
   :skos/definition
   "Object type for encoding of geospatial information in a cartographic resource, e.g., point, line, polygon."})

(def Cartography
  "Resource that shows spatial information, including maps, atlases, globes, digital, and other cartographic resources."
  {:db/ident :bibframe/Cartography,
   :dcterms/modified "2016-04-25 (fixed typo in definition)",
   :rdf/type :owl/Class,
   :rdfs/label "Cartography",
   :rdfs/subClassOf :bibframe/Work,
   :skos/definition
   "Resource that shows spatial information, including maps, atlases, globes, digital, and other cartographic resources."})

(def Chronology
  "Dates associated with issues or items held."
  {:db/ident         :bibframe/Chronology,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Chronology",
   :rdfs/subClassOf  :bibframe/EnumerationAndChronology,
   :skos/definition  "Dates associated with issues or items held."})

(def Classification
  "System of coding and organizing materials according to their subject."
  {:db/ident :bibframe/Classification,
   :dcterms/modified ["2021-06-09 (Added editorial note [GH55])"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Classification entity",
   :skos/definition
   "System of coding and organizing materials according to their subject.",
   :skos/editorialNote
   "Any entry from the Classification Schemes vocabulary at ID may be used; all have been defined as a bf:Classification"})

(def ClassificationDdc
  "Dewey Decimal Classification number used for subject access."
  {:db/ident :bibframe/ClassificationDdc,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "DDC Classification",
   :rdfs/subClassOf :bibframe/Classification,
   :skos/definition
   "Dewey Decimal Classification number used for subject access."})

(def ClassificationLcc
  "Library of Congress Classification number used for subject access."
  {:db/ident :bibframe/ClassificationLcc,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "LCC Classification",
   :rdfs/subClassOf :bibframe/Classification,
   :skos/definition
   "Library of Congress Classification number used for subject access."})

(def ClassificationNlm
  "National Library of Medicine Classification number used for subject access"
  {:db/ident :bibframe/ClassificationNlm,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "NLM classification",
   :rdfs/subClassOf :bibframe/Classification,
   :skos/definition
   "National Library of Medicine Classification number used for subject access"})

(def ClassificationUdc
  "Universal Decimal Classification number used for subject access."
  {:db/ident :bibframe/ClassificationUdc,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "UDC Classification",
   :rdfs/subClassOf :bibframe/Classification,
   :skos/definition
   "Universal Decimal Classification number used for subject access."})

(def Coden
  "Identifier for scientific and technical periodical titles assigned by the International CODEN Section of Chemical Abstracts Service."
  {:db/ident :bibframe/Coden,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "CODEN",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "Identifier for scientific and technical periodical titles assigned by the International CODEN Section of Chemical Abstracts Service."})

(def Collection
  "Aggregation of resources, generally gathered together artificially."
  {:db/ident :bibframe/Collection,
   :dcterms/modified ["2022-10-03 (changed subClassOf [GH92])"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Collection",
   :rdfs/subClassOf :bibframe/Work,
   :skos/definition
   "Aggregation of resources, generally gathered together artificially."})

(def CollectionArrangement
  "Information about the organization and arrangement of a collection of items. For instance, for computer files, organization and arrangement information may be the file structure and sort sequence of a file; for visual materials, this information may be how a collection is arranged."
  {:db/ident :bibframe/CollectionArrangement,
   :dcterms/modified "2021-06-09 (New [GH77])",
   :rdf/type :owl/Class,
   :rdfs/label "Organization of materials information",
   :skos/definition
   "Information about the organization and arrangement of a collection of items. For instance, for computer files, organization and arrangement information may be the file structure and sort sequence of a file; for visual materials, this information may be how a collection is arranged."})

(def CollectiveTitle
  "Title for a compilation of resources."
  {:db/ident         :bibframe/CollectiveTitle,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Collective title",
   :rdfs/subClassOf  :bibframe/VariantTitle,
   :skos/definition  "Title for a compilation of resources."})

(def ColorContent
  "Color characteristics of a resource, e.g., black and white, multicolored, etc."
  {:db/ident :bibframe/ColorContent,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Color content",
   :skos/definition
   "Color characteristics of a resource, e.g., black and white, multicolored, etc."})

(def Content
  "Categorization reflecting the fundamental form of communication in which the content is expressed and the human sense through which it is intended to be perceived."
  {:db/ident :bibframe/Content,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Content type",
   :skos/definition
   "Categorization reflecting the fundamental form of communication in which the content is expressed and the human sense through which it is intended to be perceived."})

(def ContentAccessibility
  "Information that assists those with a sensory impairment for greater understanding of content, e.g., captions."
  {:db/ident :bibframe/ContentAccessibility,
   :dcterms/modified "2017-02-07 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Content accessibility information",
   :skos/definition
   "Information that assists those with a sensory impairment for greater understanding of content, e.g., captions."})

(def Contribution
  "Agent and role with respect to the resource being described."
  {:db/ident :bibframe/Contribution,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Contribution",
   :skos/definition
   "Agent and role with respect to the resource being described."})

(def CopyrightNumber
  "Identifier assigned to a copyright registration or legal deposit."
  {:db/ident :bibframe/CopyrightNumber,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Copyright-legal deposit number",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "Identifier assigned to a copyright registration or legal deposit."})

(def CopyrightRegistration
  "Copyright or Legal Deposit registration information"
  {:db/ident         :bibframe/CopyrightRegistration,
   :dcterms/modified ["2016-05-04 (Class name corrected)" "2016-04-21 (New)"],
   :rdf/type         :owl/Class,
   :rdfs/label       "Copyright registration",
   :skos/definition  "Copyright or Legal Deposit registration information"})

(def CoverArt
  "Cover illustration of a resource."
  {:db/ident         :bibframe/CoverArt,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Cover art",
   :skos/definition  "Cover illustration of a resource."})

(def Dataset
  "Data encoded in a defined structure. Includes numeric data, environmental data,etc., used by applications software to calculate averages, correlations, etc., or to produce models, etc., but not normally displayed in its raw form."
  {:db/ident :bibframe/Dataset,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Dataset",
   :rdfs/subClassOf :bibframe/Work,
   :skos/definition
   "Data encoded in a defined structure. Includes numeric data, environmental data,etc., used by applications software to calculate averages, correlations, etc., or to produce models, etc., but not normally displayed in its raw form."})

(def DescriptionAuthentication
  "Indication of specific types of reviews that have been carried out on the description information."
  {:db/ident :bibframe/DescriptionAuthentication,
   :dcterms/modified ["2022-10-03 (removed subClassOf [GH90])"
                      "2016-04-29 (fixed class name)"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Metadata authentication",
   :skos/definition
   "Indication of specific types of reviews that have been carried out on the description information."})

(def DescriptionConventions
  "Rules used for the descriptive content of the resource description."
  {:db/ident :bibframe/DescriptionConventions,
   :dcterms/modified ["2022-10-03 (removed subClassOf [GH90])"
                      "2016-04-24 (fixed class name)"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Description conventions",
   :skos/definition
   "Rules used for the descriptive content of the resource description."})

(def DescriptionLevel
  "Designation of the descriptive content of the metadata."
  {:db/ident         :bibframe/DescriptionLevel,
   :dcterms/modified "2022-10-03 (New [GH43])",
   :rdf/type         :owl/Class,
   :rdfs/label       "Description level",
   :skos/definition  "Designation of the descriptive content of the metadata."})

(def DigitalCharacteristic
  "Technical specification relating to the digital encoding of text, image, audio, video, and other types of data in a resource."
  {:db/ident :bibframe/DigitalCharacteristic,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Digital characteristic",
   :skos/definition
   "Technical specification relating to the digital encoding of text, image, audio, video, and other types of data in a resource."})

(def Dissertation
  "Information about a work presented as part of the formal requirements for an academic degree."
  {:db/ident :bibframe/Dissertation,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Dissertation information",
   :skos/definition
   "Information about a work presented as part of the formal requirements for an academic degree."})

(def DissertationIdentifier
  "Identifier assigned to a thesis or dissertation for identification purposes ."
  {:db/ident :bibframe/DissertationIdentifier,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Dissertation Identifier",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "Identifier assigned to a thesis or dissertation for identification purposes ."})

(def Distribution
  "Information relating to distribution of a resource."
  {:db/ident         :bibframe/Distribution,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Distributor",
   :rdfs/subClassOf  :bibframe/ProvisionActivity,
   :skos/definition  "Information relating to distribution of a resource."})

(def Doi
  "Digital Object Identifier."
  {:db/ident         :bibframe/Doi,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "DOI",
   :rdfs/subClassOf  :bibframe/Identifier,
   :skos/definition  "Digital Object Identifier."})

(def Ean
  "International Article Identifier."
  {:db/ident         :bibframe/Ean,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "EAN",
   :rdfs/subClassOf  :bibframe/Identifier,
   :skos/definition  "International Article Identifier."})

(def Eidr
  "Entertainment Identifier Registry"
  {:db/ident         :bibframe/Eidr,
   :dcterms/modified "2021-06-09 (New [GH78])",
   :rdf/type         :owl/Class,
   :rdfs/label       "EIDR",
   :rdfs/subClassOf  :bibframe/Identifier,
   :skos/definition  "Entertainment Identifier Registry"})

(def Electronic
  "Resource that is intended for manipulation by a computer, accessed either directly or remotely."
  {:db/ident :bibframe/Electronic,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Electronic",
   :rdfs/subClassOf :bibframe/Instance,
   :skos/definition
   "Resource that is intended for manipulation by a computer, accessed either directly or remotely."})

(def Emulsion
  "Suspension of light-sensitive chemicals used as a coating on a microfilm or microfiche, e.g., silver halide."
  {:db/ident :bibframe/Emulsion,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Emulsion",
   :skos/definition
   "Suspension of light-sensitive chemicals used as a coating on a microfilm or microfiche, e.g., silver halide."})

(def EncodedBitrate
  "Speed at which streaming audio, video, etc., is designed to play, e.g., 32 kbps."
  {:db/ident :bibframe/EncodedBitrate,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Encoded bitrate",
   :rdfs/subClassOf :bibframe/DigitalCharacteristic,
   :skos/definition
   "Speed at which streaming audio, video, etc., is designed to play, e.g., 32 kbps."})

(def EncodingFormat
  "Schema, standard, etc., used to encode the digital content of a resource, e.g., MP3, XML, JPEG."
  {:db/ident :bibframe/EncodingFormat,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Encoding format",
   :rdfs/subClassOf :bibframe/DigitalCharacteristic,
   :skos/definition
   "Schema, standard, etc., used to encode the digital content of a resource, e.g., MP3, XML, JPEG."})

(def Ensemble
  "Ensemble"
  {:db/ident         :bibframe/Ensemble,
   :dcterms/modified "2021-06-09 (New [GH56])",
   :rdf/type         :owl/Class,
   :rdfs/label       "Ensemble",
   :skos/definition  "Ensemble"})

(def Enumeration
  "Numbering or other enumeration associated with issues or items held."
  {:db/ident :bibframe/Enumeration,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Enumeration",
   :rdfs/subClassOf :bibframe/EnumerationAndChronology,
   :skos/definition
   "Numbering or other enumeration associated with issues or items held."})

(def EnumerationAndChronology
  "Numbering or other enumeration and dates associated with issues or items held."
  {:db/ident :bibframe/EnumerationAndChronology,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Enumeration and chronology",
   :skos/definition
   "Numbering or other enumeration and dates associated with issues or items held."})

(def Event
  "Something that happens at a certain time and location, such as a performance, speech, or athletic event."
  {:db/ident :bibframe/Event,
   :dcterms/modified ["2021-06-09 (Broaden definition [GH12])"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Event entity",
   :skos/definition
   "Something that happens at a certain time and location, such as a performance, speech, or athletic event."})

(def Extent
  "Number and type of units and/or subunits making up a resource."
  {:db/ident :bibframe/Extent,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Extent",
   :skos/definition
   "Number and type of units and/or subunits making up a resource."})

(def Family
  "Two or more persons related by birth, marriage, adoption, civil union, or similar legal status, or who otherwise present themselves as a family."
  {:db/ident :bibframe/Family,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Family",
   :rdfs/subClassOf :bibframe/Agent,
   :skos/definition
   "Two or more persons related by birth, marriage, adoption, civil union, or similar legal status, or who otherwise present themselves as a family."})

(def FileSize
  "Number of bytes in a digital file, e.g., 162 KB."
  {:db/ident         :bibframe/FileSize,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "File size",
   :rdfs/subClassOf  :bibframe/DigitalCharacteristic,
   :skos/definition  "Number of bytes in a digital file, e.g., 162 KB."})

(def FileType
  "General type of data content encoded in a computer file, e.g., text file, audio file."
  {:db/ident :bibframe/FileType,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "File type",
   :rdfs/subClassOf :bibframe/DigitalCharacteristic,
   :skos/definition
   "General type of data content encoded in a computer file, e.g., text file, audio file."})

(def Fingerprint
  "Identifier that is used to assist in the identification of antiquarian books by recording information comprising groups of characters taken from specified positions on specified pages of the book."
  {:db/ident :bibframe/Fingerprint,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Fingerprint identifier",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "Identifier that is used to assist in the identification of antiquarian books by recording information comprising groups of characters taken from specified positions on specified pages of the book."})

(def FontSize
  "Size of the type used to represent the characters and symbols in a resource."
  {:db/ident :bibframe/FontSize,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Font size",
   :skos/definition
   "Size of the type used to represent the characters and symbols in a resource."})

(def Frequency
  "Information about intervals at which the parts of a serially produced resource or the updates to an integrating resource are issued."
  {:db/ident :bibframe/Frequency,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Frequency",
   :skos/definition
   "Information about intervals at which the parts of a serially produced resource or the updates to an integrating resource are issued."})

(def Generation
  "Relationship between an original carrier and the carrier of a reproduction made from the original."
  {:db/ident :bibframe/Generation,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Generation",
   :skos/definition
   "Relationship between an original carrier and the carrier of a reproduction made from the original."})

(def GenerationProcess
  "Indication of the program or process used to generate the description by application of a particular transformation."
  {:db/ident :bibframe/GenerationProcess,
   :dcterms/modified ["2022-10-03 (removed subClassOf [GH90])"
                      "2016-04-24 (fixed class name)"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Generation process",
   :skos/definition
   "Indication of the program or process used to generate the description by application of a particular transformation."})

(def GenreForm
  "Form category or genre to which a resource belongs."
  {:db/ident         :bibframe/GenreForm,
   :dcterms/modified ["2021-06-09 (Broaden definition [GH17])"
                      "2016-04-21 (New)"],
   :rdf/type         :owl/Class,
   :rdfs/label       "Genre/form",
   :skos/definition  "Form category or genre to which a resource belongs."})

(def GeographicCoverage
  "Geographic coverage of the content of the resource."
  {:db/ident         :bibframe/GeographicCoverage,
   :dcterms/modified "2017-02-06 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Geographic coverage",
   :skos/definition  "Geographic coverage of the content of the resource."})

(def GrooveCharacteristic
  "Groove width of an analog disc or the groove pitch of an analog cylinder, e.g., coarse groove, microgroove"
  {:db/ident :bibframe/GrooveCharacteristic,
   :dcterms/modified ["2017-02-03 (Fixed name of property)"
                      "2016-04-26 (fixed typo in definition)"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Groove characteristic",
   :rdfs/subClassOf :bibframe/SoundCharacteristic,
   :skos/definition
   "Groove width of an analog disc or the groove pitch of an analog cylinder, e.g., coarse groove, microgroove"})

(def Gtin14Number
  "14 digit number assigned to identify trade items as various packaging levels. GTIN-14 encompasses EAN/UCC-128 and ITF-14."
  {:db/ident :bibframe/Gtin14Number,
   :dcterms/modified "2017-02-03 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Global Trade Item Number 14",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "14 digit number assigned to identify trade items as various packaging levels. GTIN-14 encompasses EAN/UCC-128 and ITF-14."})

(def Hdl
  "Unique and persistent identifier for digital objects developed by the Corporation for National Research Initiatives."
  {:db/ident :bibframe/Hdl,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Handle",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "Unique and persistent identifier for digital objects developed by the Corporation for National Research Initiatives."})

(def Hub
  "An abstract resource that functions as a bridge between two Works."
  {:db/ident :bibframe/Hub,
   :dcterms/modified "2021-06-09 (New [GH75])",
   :rdf/type :owl/Class,
   :rdfs/label "Hub",
   :rdfs/subClassOf :bibframe/Work,
   :skos/definition
   "An abstract resource that functions as a bridge between two Works."})

(def Identifier
  "Token or name that is associated with a resource, such as a URI or an ISBN."
  {:db/ident :bibframe/Identifier,
   :dcterms/modified ["2021-06-09 (Added editorial note [GH44])"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Identifier",
   :skos/definition
   "Token or name that is associated with a resource, such as a URI or an ISBN.",
   :skos/editorialNote
   "Any entry from the Standard Identifiers vocabulary at ID may be used; all have been defined as a bf:Identifier"})

(def Illustration
  "Information about content intended to illustrate a resource."
  {:db/ident :bibframe/Illustration,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Illustrative content",
   :skos/definition
   "Information about content intended to illustrate a resource."})

(def ImmediateAcquisition
  "Information about the circumstances, e.g., source, date, method, under which the resource was directly acquired."
  {:db/ident :bibframe/ImmediateAcquisition,
   :dcterms/modified "2017-02-06 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Immediate acquisition",
   :skos/definition
   "Information about the circumstances, e.g., source, date, method, under which the resource was directly acquired."})

(def Instance
  "Resource reflecting an individual, material embodiment of a Work."
  {:db/ident :bibframe/Instance,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Instance",
   :skos/definition
   "Resource reflecting an individual, material embodiment of a Work."})

(def Integrating
  "Resource that is added to or changed by updates that do not remain discrete but are integrated into the whole."
  {:db/ident :bibframe/Integrating,
   :dcterms/modified "2022-10-03 (New [GH91])",
   :rdf/type :owl/Class,
   :rdfs/label "Integrating resource",
   :rdfs/subClassOf :bibframe/Work,
   :skos/definition
   "Resource that is added to or changed by updates that do not remain discrete but are integrated into the whole."})

(def IntendedAudience
  "Information that identifies the specific intended or target audience or intellectual level for which the content described is considered appropriate. Also used to record interest and motivation levels and special learner characteristics."
  {:db/ident :bibframe/IntendedAudience,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Intended audience information",
   :skos/definition
   "Information that identifies the specific intended or target audience or intellectual level for which the content described is considered appropriate. Also used to record interest and motivation levels and special learner characteristics."})

(def Isan
  "International Standard Audiovisual Number."
  {:db/ident         :bibframe/Isan,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "ISAN",
   :rdfs/subClassOf  :bibframe/Identifier,
   :skos/definition  "International Standard Audiovisual Number."})

(def Isbn
  "International Standard Book Number."
  {:db/ident         :bibframe/Isbn,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "ISBN",
   :rdfs/subClassOf  :bibframe/Identifier,
   :skos/definition  "International Standard Book Number."})

(def Ismn
  "International Standard Music Number."
  {:db/ident         :bibframe/Ismn,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "ISMN",
   :rdfs/subClassOf  :bibframe/Identifier,
   :skos/definition  "International Standard Music Number."})

(def Isni
  "International Standard Name Identifier, a unique, persistent reference number for the identities of contributors to creative works."
  {:db/ident :bibframe/Isni,
   :dcterms/modified "2017-02-03 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "ISNI",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "International Standard Name Identifier, a unique, persistent reference number for the identities of contributors to creative works."})

(def Iso
  "International Organization for Standardization standard number."
  {:db/ident :bibframe/Iso,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "ISO number",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "International Organization for Standardization standard number."})

(def Isrc
  "International Standard Recording Code."
  {:db/ident         :bibframe/Isrc,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "ISRC",
   :rdfs/subClassOf  :bibframe/Identifier,
   :skos/definition  "International Standard Recording Code."})

(def Issn
  "International Standard Serial Number."
  {:db/ident         :bibframe/Issn,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "ISSN",
   :rdfs/subClassOf  :bibframe/Identifier,
   :skos/definition  "International Standard Serial Number."})

(def IssnL
  "International Standard Serial Number that links together various media versions of a continuing resource."
  {:db/ident :bibframe/IssnL,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "ISSN-L",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "International Standard Serial Number that links together various media versions of a continuing resource."})

(def Issuance
  "Information about whether a resource is issued in one or more parts, the way it is updated, and its intended termination."
  {:db/ident :bibframe/Issuance,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Mode of issuance",
   :skos/definition
   "Information about whether a resource is issued in one or more parts, the way it is updated, and its intended termination."})

(def Istc
  "International Standard Text Code, a numbering system developed to enable the unique identification of textual works."
  {:db/ident :bibframe/Istc,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "ISTC",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "International Standard Text Code, a numbering system developed to enable the unique identification of textual works."})

(def Iswc
  "International Standard Musical Work Code, a unique, persistent reference number for the identification of musical works."
  {:db/ident :bibframe/Iswc,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "ISWC",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "International Standard Musical Work Code, a unique, persistent reference number for the identification of musical works."})

(def Item
  "Single example of an Instance."
  {:db/ident         :bibframe/Item,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Item",
   :skos/definition  "Single example of an Instance."})

(def Jurisdiction
  "Legal or political unit administering a geographic area."
  {:db/ident :bibframe/Jurisdiction,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Jurisdiction",
   :rdfs/subClassOf :bibframe/Agent,
   :skos/definition "Legal or political unit administering a geographic area."})

(def KeyTitle
  "Unique title for a continuing resource that is assigned by the ISSN International Center in conjunction with an ISSN."
  {:db/ident :bibframe/KeyTitle,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Key title",
   :rdfs/subClassOf :bibframe/VariantTitle,
   :skos/definition
   "Unique title for a continuing resource that is assigned by the ISSN International Center in conjunction with an ISSN."})

(def Kit
  "Resource that contains a mixture of various components issued as a unit and intended primarily for instructional purposes."
  {:db/ident :bibframe/Kit,
   :dcterms/modified "2022-10-03 (New [GH91])",
   :rdf/type :owl/Class,
   :rdfs/label "Kit",
   :rdfs/subClassOf :bibframe/MixedMaterial,
   :skos/definition
   "Resource that contains a mixture of various components issued as a unit and intended primarily for instructional purposes."})

(def Language
  "Language entity."
  {:db/ident         :bibframe/Language,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Language entity",
   :skos/definition  "Language entity."})

(def Layout
  "Arrangement of text, images, tactile notation, etc., in a resource."
  {:db/ident :bibframe/Layout,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Layout",
   :skos/definition
   "Arrangement of text, images, tactile notation, etc., in a resource."})

(def LcOverseasAcq
  "Identification number assigned by the Library of Congress to works acquired through one of its collaborative overseas acquisition programs."
  {:db/ident :bibframe/LcOverseasAcq,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "LC acquisition program",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "Identification number assigned by the Library of Congress to works acquired through one of its collaborative overseas acquisition programs."})

(def Lccn
  "Library of Congress Control Number that identifies a resource description."
  {:db/ident :bibframe/Lccn,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "LCCN",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "Library of Congress Control Number that identifies a resource description."})

(def Local
  "Identifier established locally and not a standard number."
  {:db/ident :bibframe/Local,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Local identifier",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "Identifier established locally and not a standard number."})

(def Manufacture
  "Information relating to manufacture of a resource."
  {:db/ident         :bibframe/Manufacture,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Manufacturer",
   :rdfs/subClassOf  :bibframe/ProvisionActivity,
   :skos/definition  "Information relating to manufacture of a resource."})

(def Manuscript
  "Resource which is written in handwriting or typescript. These are generally unique resources."
  {:db/ident :bibframe/Manuscript,
   :dcterms/modified ["2022-10-03 (changed subClassOf [GH92])"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Manuscript",
   :rdfs/subClassOf :bibframe/Work,
   :skos/definition
   "Resource which is written in handwriting or typescript. These are generally unique resources."})

(def Material
  "Substance or composition of the resource."
  {:db/ident         :bibframe/Material,
   :dcterms/modified "2021-06-09 (New [GH28])",
   :rdf/type         :owl/Class,
   :rdfs/label       "Material",
   :skos/definition  "Substance or composition of the resource."})

(def MatrixNumber
  "Matrix identifier assigned to the master from which a specific sound recording was pressed."
  {:db/ident :bibframe/MatrixNumber,
   :dcterms/modified ["2017-02-03 (Revised definition)" "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Audio matrix number",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "Matrix identifier assigned to the master from which a specific sound recording was pressed."})

(def Media
  "Categorization reflecting the general type of intermediation device required to view, play, run, etc., the content of a resource."
  {:db/ident :bibframe/Media,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Media type",
   :skos/definition
   "Categorization reflecting the general type of intermediation device required to view, play, run, etc., the content of a resource."})

(def Meeting
  "Gathering of individuals or representatives of various bodies for the purpose of discussing and/or acting on topics of common interest."
  {:db/ident :bibframe/Meeting,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Meeting",
   :rdfs/subClassOf :bibframe/Agent,
   :skos/definition
   "Gathering of individuals or representatives of various bodies for the purpose of discussing and/or acting on topics of common interest."})

(def MixedMaterial
  "Resource comprised of multiple types which is not driven by software. For instance, an archival collection of text, photographs and sound recordings."
  {:db/ident :bibframe/MixedMaterial,
   :dcterms/modified ["2022-10-03 (revised definition [GH92])"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Mixed material",
   :rdfs/subClassOf :bibframe/Work,
   :skos/definition
   "Resource comprised of multiple types which is not driven by software. For instance, an archival collection of text, photographs and sound recordings."})

(def Modification
  "Information relating to modification of a resource."
  {:db/ident         :bibframe/Modification,
   :dcterms/modified "2022-10-03 (New [GH69])",
   :rdf/type         :owl/Class,
   :rdfs/label       "Modification",
   :rdfs/subClassOf  :bibframe/ProvisionActivity,
   :skos/definition  "Information relating to modification of a resource."})

(def Monograph
  "Resource that is issued as a single physical unit or intangible single logical unit."
  {:db/ident :bibframe/Monograph,
   :dcterms/modified "2022-10-03 (New [GH91])",
   :rdf/type :owl/Class,
   :rdfs/label "Monograph",
   :rdfs/subClassOf :bibframe/Work,
   :skos/definition
   "Resource that is issued as a single physical unit or intangible single logical unit."})

(def Mount
  "Physical material or object used for the support or backing to which the base material of a resource has been attached."
  {:db/ident :bibframe/Mount,
   :dcterms/modified ["2021-06-09 (Amended definition [GH29])"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Mount",
   :skos/definition
   "Physical material or object used for the support or backing to which the base material of a resource has been attached."})

(def MovementNotation
  "Information on the symbol system used to convey the content of a movement resource."
  {:db/ident :bibframe/MovementNotation,
   :dcterms/modified ["2021-06-09 (Modified label [GH67])" "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Movement notation",
   :rdfs/subClassOf :bibframe/Notation,
   :skos/definition
   "Information on the symbol system used to convey the content of a movement resource."})

(def MovingImage
  "Images intended to be perceived as moving, including motion pictures (using liveaction and/or animation), video recordings of performances, events,etc."
  {:db/ident :bibframe/MovingImage,
   :dcterms/modified ["2016-04-26 (fixed typo in definition)"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Moving image",
   :rdfs/subClassOf :bibframe/Work,
   :skos/definition
   "Images intended to be perceived as moving, including motion pictures (using liveaction and/or animation), video recordings of performances, events,etc."})

(def Multimedia
  "Electronic resource which is a computer program or consists of multiple media types that are software driven, such as videogames."
  {:db/ident :bibframe/Multimedia,
   :dcterms/modified ["2022-10-03 (revised definition [GH92])"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Software or multimedia",
   :rdfs/subClassOf :bibframe/Work,
   :skos/definition
   "Electronic resource which is a computer program or consists of multiple media types that are software driven, such as videogames."})

(def MusicAudio
  "Music resource expressed in an audible form."
  {:db/ident         :bibframe/MusicAudio,
   :dcterms/modified "2022-10-03 (New [GH91])",
   :rdf/type         :owl/Class,
   :rdfs/label       "Music audio",
   :rdfs/subClassOf  :bibframe/Audio,
   :skos/definition  "Music resource expressed in an audible form."})

(def MusicDistributorNumber
  "Identifier appearing on a resource assigned by a distributor to a specific audio recording, notated music publication, music-related publication, or videorecording."
  {:db/ident :bibframe/MusicDistributorNumber,
   :dcterms/modified "2017-02-07 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Music distributor number",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "Identifier appearing on a resource assigned by a distributor to a specific audio recording, notated music publication, music-related publication, or videorecording."})

(def MusicEnsemble
  "Ensemble for which a musical work is appropriate."
  {:db/ident         :bibframe/MusicEnsemble,
   :dcterms/modified ["2021-06-09 (Changed subclass to Ensemble [GH56])"
                      "2016-04-21 (New)"],
   :rdf/type         :owl/Class,
   :rdfs/label       "Music ensemble",
   :rdfs/subClassOf  :bibframe/Ensemble,
   :skos/definition  "Ensemble for which a musical work is appropriate."})

(def MusicFormat
  "Layout for content of a resource that is presented in the form of musical notation."
  {:db/ident :bibframe/MusicFormat,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Notated music format",
   :skos/definition
   "Layout for content of a resource that is presented in the form of musical notation."})

(def MusicInstrument
  "Instrument for which a musical work is appropriate."
  {:db/ident         :bibframe/MusicInstrument,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Musical instrument",
   :skos/definition  "Instrument for which a musical work is appropriate."})

(def MusicMedium
  "Summary statement of the medium for a musical work."
  {:db/ident         :bibframe/MusicMedium,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Music medium information",
   :skos/definition  "Summary statement of the medium for a musical work."})

(def MusicNotation
  "Information on the symbol system used to convey the content of a music resource."
  {:db/ident :bibframe/MusicNotation,
   :dcterms/modified ["2021-06-09 (Modified label [GH67])" "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Music notation",
   :rdfs/subClassOf :bibframe/Notation,
   :skos/definition
   "Information on the symbol system used to convey the content of a music resource."})

(def MusicPlate
  "Identifiers assigned by a music publisher or printer to the printing plates for the notated portion of a notated music publication, or an identifier that emulates the printing plate tradition in contemporary publications."
  {:db/ident :bibframe/MusicPlate,
   :dcterms/modified ["2017-02-03 (Revised definition)" "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Music plate number",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "Identifiers assigned by a music publisher or printer to the printing plates for the notated portion of a notated music publication, or an identifier that emulates the printing plate tradition in contemporary publications."})

(def MusicPublisherNumber
  "Identifier assigned to a notated music publication other than an issue, matrix, or plate number."
  {:db/ident :bibframe/MusicPublisherNumber,
   :dcterms/modified ["2017-02-03 (Revised definition)" "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Music publisher number",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "Identifier assigned to a notated music publication other than an issue, matrix, or plate number."})

(def MusicVoice
  "Voice for which a musical work is appropriate."
  {:db/ident         :bibframe/MusicVoice,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Music voice",
   :skos/definition  "Voice for which a musical work is appropriate."})

(def Nbn
  "National Bibliography Number that identifies a resource description."
  {:db/ident :bibframe/Nbn,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "NBN",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "National Bibliography Number that identifies a resource description."})

(def NonMusicAudio
  "Resource expressed in an audible form, including spoken word and other non-musical sounds."
  {:db/ident :bibframe/NonMusicAudio,
   :dcterms/modified "2022-10-03 (New [GH91])",
   :rdf/type :owl/Class,
   :rdfs/label "Non-music audio",
   :rdfs/subClassOf :bibframe/Audio,
   :skos/definition
   "Resource expressed in an audible form, including spoken word and other non-musical sounds."})

(def NotatedMovement
  "Graphic, non-realized representations of movement intended to be perceived visually, e.g. dance."
  {:db/ident :bibframe/NotatedMovement,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Notated movement",
   :rdfs/subClassOf :bibframe/Work,
   :skos/definition
   "Graphic, non-realized representations of movement intended to be perceived visually, e.g. dance."})

(def NotatedMusic
  "Graphic, non-realized representations of musical works intended to be perceived visually."
  {:db/ident :bibframe/NotatedMusic,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Notated music",
   :rdfs/subClassOf :bibframe/Work,
   :skos/definition
   "Graphic, non-realized representations of musical works intended to be perceived visually."})

(def Notation
  "Information on the alphabet, script, or symbol system used to convey the content of the resource, including specialized scripts, typefaces, tactile notation, movement notation, and musical notation."
  {:db/ident :bibframe/Notation,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Notation",
   :skos/definition
   "Information on the alphabet, script, or symbol system used to convey the content of the resource, including specialized scripts, typefaces, tactile notation, movement notation, and musical notation."})

(def Note
  "Information, usually in textual form, on attributes of a resource or some aspect of a resource."
  {:db/ident :bibframe/Note,
   :dcterms/modified ["2021-06-09 (Added editorial note [GH35])"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Note",
   :skos/definition
   "Information, usually in textual form, on attributes of a resource or some aspect of a resource.",
   :skos/editorialNote
   "Any entry from the Note Types vocabulary at ID may be used; all have been defined as a bf:Note"})

(def ObjectClass
  "Resource in a form intended to be perceived visually in three-dimensions. Includes man-made objects such as models, sculptures, clothing, and toys, as well as naturally occurring objects such as specimens mounted for viewing."
  {:db/ident :bibframe/Object,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Three-dimensional object",
   :rdfs/subClassOf :bibframe/Work,
   :skos/definition
   "Resource in a form intended to be perceived visually in three-dimensions. Includes man-made objects such as models, sculptures, clothing, and toys, as well as naturally occurring objects such as specimens mounted for viewing."})

(def ObjectCount
  "Number of objects in encoded geospatial information in a cartographic resource."
  {:db/ident :bibframe/ObjectCount,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Digital cartographic object count",
   :rdfs/subClassOf :bibframe/DigitalCharacteristic,
   :skos/definition
   "Number of objects in encoded geospatial information in a cartographic resource."})

(def Organization
  "Corporation or group of persons and/or organizations that acts, or may act, as a unit."
  {:db/ident :bibframe/Organization,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Organization",
   :rdfs/subClassOf :bibframe/Agent,
   :skos/definition
   "Corporation or group of persons and/or organizations that acts, or may act, as a unit."})

(def ParallelTitle
  "Title in another language and/or script."
  {:db/ident         :bibframe/ParallelTitle,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Parallel title proper",
   :rdfs/subClassOf  :bibframe/VariantTitle,
   :skos/definition  "Title in another language and/or script."})

(def Person
  "Individual or identity established by an individual (either alone or in collaboration with one or more other individuals)."
  {:db/ident :bibframe/Person,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Person",
   :rdfs/subClassOf [:bibframe/Agent :foaf/Person],
   :skos/definition
   "Individual or identity established by an individual (either alone or in collaboration with one or more other individuals)."})

(def Place
  "Geographic location."
  {:db/ident         :bibframe/Place,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Place",
   :skos/definition  "Geographic location."})

(def PlaybackChannels
  "Configuration/number of sound channels used to make a recording, such as one channel for a monophonic recording, e.g., mono, stereo, quadraphonic, surround."
  {:db/ident :bibframe/PlaybackChannels,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Configuration of playback channels",
   :rdfs/subClassOf :bibframe/SoundCharacteristic,
   :skos/definition
   "Configuration/number of sound channels used to make a recording, such as one channel for a monophonic recording, e.g., mono, stereo, quadraphonic, surround."})

(def PlaybackCharacteristic
  "Equalization system, noise reduction system, etc., used in making an audio recording, e.g., CCIR standard, CX encoded, Dolby."
  {:db/ident :bibframe/PlaybackCharacteristic,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Special playback characteristics",
   :rdfs/subClassOf :bibframe/SoundCharacteristic,
   :skos/definition
   "Equalization system, noise reduction system, etc., used in making an audio recording, e.g., CCIR standard, CX encoded, Dolby."})

(def PlayingSpeed
  "Speed at which an audio carrier must be operated to produce the sound intended, e.g., 78 rpm, 19 cm/s."
  {:db/ident :bibframe/PlayingSpeed,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Playing speed",
   :rdfs/subClassOf :bibframe/SoundCharacteristic,
   :skos/definition
   "Speed at which an audio carrier must be operated to produce the sound intended, e.g., 78 rpm, 19 cm/s."})

(def Polarity
  "Relationship of the colors and tones in an image to the colors and tones of the object reproduced."
  {:db/ident :bibframe/Polarity,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Polarity",
   :skos/definition
   "Relationship of the colors and tones in an image to the colors and tones of the object reproduced."})

(def PostalRegistration
  "Number assigned to a publication for which the specified postal service permits the use of a special mailing class privilege."
  {:db/ident :bibframe/PostalRegistration,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Postal registration number",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "Number assigned to a publication for which the specified postal service permits the use of a special mailing class privilege."})

(def PresentationFormat
  "Format used in the production of a projected image, e.g., Cinerama, IMAX."
  {:db/ident :bibframe/PresentationFormat,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Presentation format",
   :rdfs/subClassOf :bibframe/ProjectionCharacteristic,
   :skos/definition
   "Format used in the production of a projected image, e.g., Cinerama, IMAX."})

(def Print
  "Resource that is printed."
  {:db/ident         :bibframe/Print,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Printed",
   :rdfs/subClassOf  :bibframe/Instance,
   :skos/definition  "Resource that is printed."})

(def Production
  "Information relating to production of a resource."
  {:db/ident         :bibframe/Production,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Producer",
   :rdfs/subClassOf  :bibframe/ProvisionActivity,
   :skos/definition  "Information relating to production of a resource."})

(def ProductionMethod
  "Process used to produce a resource"
  {:db/ident         :bibframe/ProductionMethod,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Production method",
   :skos/definition  "Process used to produce a resource"})

(def Projection
  "Method or system used to represent the surface of the earth or of a celestial sphere on a plane."
  {:db/ident :bibframe/Projection,
   :dcterms/modified "2017-02-03 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Projection",
   :skos/definition
   "Method or system used to represent the surface of the earth or of a celestial sphere on a plane."})

(def ProjectionCharacteristic
  "Technical specification relating to the projection of a motion picture film."
  {:db/ident :bibframe/ProjectionCharacteristic,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Projection characteristic",
   :skos/definition
   "Technical specification relating to the projection of a motion picture film."})

(def ProjectionSpeed
  "Speed at which a projected carrier must be operated to produce the moving image intended, e.g., 20 fps."
  {:db/ident :bibframe/ProjectionSpeed,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Projection speed",
   :rdfs/subClassOf :bibframe/ProjectionCharacteristic,
   :skos/definition
   "Speed at which a projected carrier must be operated to produce the moving image intended, e.g., 20 fps."})

(def ProvisionActivity
  "Information about the agent or place relating to the publication, printing, distribution, issue, release, or production of a resource."
  {:db/ident :bibframe/ProvisionActivity,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Provider entity",
   :skos/definition
   "Information about the agent or place relating to the publication, printing, distribution, issue, release, or production of a resource."})

(def PubFrequency
  "Information about the publication frequency of a resource."
  {:db/ident :bibframe/PubFrequency,
   :dcterms/modified "2021-06-09 (New [GH76])",
   :rdf/type :owl/Class,
   :rdfs/label "Publication Frequency",
   :skos/definition
   "Information about the publication frequency of a resource."})

(def Publication
  "Information relating to publication of a resource."
  {:db/ident         :bibframe/Publication,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Publisher",
   :rdfs/subClassOf  :bibframe/ProvisionActivity,
   :skos/definition  "Information relating to publication of a resource."})

(def PublisherNumber
  "Number assigned by a publisher that is not one of the specific defined types."
  {:db/ident :bibframe/PublisherNumber,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Publisher number",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "Number assigned by a publisher that is not one of the specific defined types."})

(def RecordingMedium
  "Type of medium used to record sound on an audio carrier, e.g., magnetic, optical."
  {:db/ident :bibframe/RecordingMedium,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Recording medium",
   :rdfs/subClassOf :bibframe/SoundCharacteristic,
   :skos/definition
   "Type of medium used to record sound on an audio carrier, e.g., magnetic, optical."})

(def RecordingMethod
  "Method used to encode audio content for playback, e.g., analog, digital."
  {:db/ident :bibframe/RecordingMethod,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Type of recording",
   :rdfs/subClassOf :bibframe/SoundCharacteristic,
   :skos/definition
   "Method used to encode audio content for playback, e.g., analog, digital."})

(def ReductionRatio
  "Size of a micro-image in relation to the original from which it was produced."
  {:db/ident :bibframe/ReductionRatio,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Reduction ratio",
   :skos/definition
   "Size of a micro-image in relation to the original from which it was produced."})

(def RegionalEncoding
  "Identification of the region of the world for which a videodisc has been encoded, e.g., region 4."
  {:db/ident :bibframe/RegionalEncoding,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Regional encoding",
   :rdfs/subClassOf :bibframe/DigitalCharacteristic,
   :skos/definition
   "Identification of the region of the world for which a videodisc has been encoded, e.g., region 4."})

(def ReportNumber
  "Identification number of a technical report that is not a Standard Technical Report Number."
  {:db/ident :bibframe/ReportNumber,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Technical report number",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "Identification number of a technical report that is not a Standard Technical Report Number."})

(def Resolution
  "Clarity or fineness of detail in a digital image, expressed by the measurement of the image in pixels, etc., e.g., 3.1 megapixels."
  {:db/ident :bibframe/Resolution,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Resolution",
   :rdfs/subClassOf :bibframe/DigitalCharacteristic,
   :skos/definition
   "Clarity or fineness of detail in a digital image, expressed by the measurement of the image in pixels, etc., e.g., 3.1 megapixels."})

(def RetentionPolicy
  "Policy of holding institution for retaining resource."
  {:db/ident         :bibframe/RetentionPolicy,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Retention policy",
   :rdfs/subClassOf  :bibframe/UsageAndAccessPolicy,
   :skos/definition  "Policy of holding institution for retaining resource."})

(def Review
  "Review of a resource."
  {:db/ident         :bibframe/Review,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Review",
   :skos/definition  "Review of a resource."})

(def Role
  "Function played or provided by a contributor, e.g., author, illustrator, etc."
  {:db/ident :bibframe/Role,
   :dcterms/modified "2017-02-03 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Role",
   :skos/definition
   "Function played or provided by a contributor, e.g., author, illustrator, etc."})

(def Scale
  "Ratio of the dimensions of a form contained or embodied in a resource to the dimensions of the entity it represents, e.g., for images or cartographic resources."
  {:db/ident :bibframe/Scale,
   :dcterms/modified "2017-02-03 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Scale",
   :skos/definition
   "Ratio of the dimensions of a form contained or embodied in a resource to the dimensions of the entity it represents, e.g., for images or cartographic resources."})

(def Script
  "Information on the script, or symbol system used to convey the content of a text resource."
  {:db/ident :bibframe/Script,
   :dcterms/modified ["2021-06-09 (Modified label [GH67])" "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Script",
   :rdfs/subClassOf :bibframe/Notation,
   :skos/definition
   "Information on the script, or symbol system used to convey the content of a text resource."})

(def Serial
  "Resource that is issued in successive parts, usually numbered, that has no predetermined conclusion."
  {:db/ident :bibframe/Serial,
   :dcterms/modified "2022-10-03 (New [GH91])",
   :rdf/type :owl/Class,
   :rdfs/label "Serial",
   :rdfs/subClassOf :bibframe/Work,
   :skos/definition
   "Resource that is issued in successive parts, usually numbered, that has no predetermined conclusion."})

(def Series
  "Resource with a collective title that applies to a group of separate resources, each of which also has its own title."
  {:db/ident :bibframe/Series,
   :dcterms/modified "2022-10-03 (New [GH91])",
   :rdf/type :owl/Class,
   :rdfs/label "Series",
   :rdfs/subClassOf :bibframe/Work,
   :skos/definition
   "Resource with a collective title that applies to a group of separate resources, each of which also has its own title."})

(def ShelfMark
  "Piece/item identifier, such as a call or other type of number."
  {:db/ident :bibframe/ShelfMark,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Shelf location",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "Piece/item identifier, such as a call or other type of number."})

(def ShelfMarkDdc
  "Shelf mark based on Dewey Decimal Classification."
  {:db/ident         :bibframe/ShelfMarkDdc,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "DDC call number",
   :rdfs/subClassOf  :bibframe/ShelfMark,
   :skos/definition  "Shelf mark based on Dewey Decimal Classification."})

(def ShelfMarkLcc
  "Shelf mark based on Library of Congress Classification."
  {:db/ident         :bibframe/ShelfMarkLcc,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "LCC call number",
   :rdfs/subClassOf  :bibframe/ShelfMark,
   :skos/definition  "Shelf mark based on Library of Congress Classification."})

(def ShelfMarkNlm
  "Shelf mark based on National Library of Medicine Classification."
  {:db/ident :bibframe/ShelfMarkNlm,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "NLM call number",
   :rdfs/subClassOf :bibframe/ShelfMark,
   :skos/definition
   "Shelf mark based on National Library of Medicine Classification."})

(def ShelfMarkUdc
  "Shelf mark based on Universal Decimal Classification."
  {:db/ident         :bibframe/ShelfMarkUdc,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "UDC call number",
   :rdfs/subClassOf  :bibframe/ShelfMark,
   :skos/definition  "Shelf mark based on Universal Decimal Classification."})

(def Sici
  "Serial Item and Contribution Identifier."
  {:db/ident         :bibframe/Sici,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "SICI",
   :rdfs/subClassOf  :bibframe/Identifier,
   :skos/definition  "Serial Item and Contribution Identifier."})

(def SoundCharacteristic
  "Technical specification relating to the encoding of sound in a resource."
  {:db/ident :bibframe/SoundCharacteristic,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Sound characteristic",
   :skos/definition
   "Technical specification relating to the encoding of sound in a resource."})

(def SoundContent
  "Indication of whether the production of sound is an integral part of the resource."
  {:db/ident :bibframe/SoundContent,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Sound content",
   :skos/definition
   "Indication of whether the production of sound is an integral part of the resource."})

(def Source
  "Resource from which value or label came or was derived."
  {:db/ident         :bibframe/Source,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Source",
   :skos/definition  "Resource from which value or label came or was derived."})

(def Status
  "Designation of the validity or position of something, e.g., whether something is incorrect or available."
  {:db/ident :bibframe/Status,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Status",
   :skos/definition
   "Designation of the validity or position of something, e.g., whether something is incorrect or available."})

(def StillImage
  "Resource expressed through line, shape, shading, etc., intended to be perceived visually as a still image or images in two dimensions. Includes two-dimensional images and slides and transparencies."
  {:db/ident :bibframe/StillImage,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Still image",
   :rdfs/subClassOf :bibframe/Work,
   :skos/definition
   "Resource expressed through line, shape, shading, etc., intended to be perceived visually as a still image or images in two dimensions. Includes two-dimensional images and slides and transparencies."})

(def StockNumber
  "Identification number used for stock purposes and assigned by agencies such as distributors, publishers, or vendors."
  {:db/ident :bibframe/StockNumber,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Stock number",
   :rdfs/subClassOf :bibframe/Identifier,
   :skos/definition
   "Identification number used for stock purposes and assigned by agencies such as distributors, publishers, or vendors."})

(def Strn
  "Standard Technical Report Number."
  {:db/ident         :bibframe/Strn,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "STRN",
   :rdfs/subClassOf  :bibframe/Identifier,
   :skos/definition  "Standard Technical Report Number."})

(def StudyNumber
  "Identification number for a computer data file."
  {:db/ident         :bibframe/StudyNumber,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Study number",
   :rdfs/subClassOf  :bibframe/Identifier,
   :skos/definition  "Identification number for a computer data file."})

(def Sublocation
  "Specific place within the holding entity where the item is located or made available."
  {:db/ident :bibframe/Sublocation,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Sublocation",
   :skos/definition
   "Specific place within the holding entity where the item is located or made available."})

(def Summary
  "Description of the content of a resource, such as an abstract, summary, etc.."
  {:db/ident :bibframe/Summary,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Summary",
   :skos/definition
   "Description of the content of a resource, such as an abstract, summary, etc.."})

(def SupplementaryContent
  "Index, bibliography, appendix, etc. intended to supplement the primary content of a resource."
  {:db/ident :bibframe/SupplementaryContent,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Supplementary material",
   :skos/definition
   "Index, bibliography, appendix, etc. intended to supplement the primary content of a resource."})

(def SystemRequirement
  "Equipment or system requirements beyond what is normal and obvious for the type of carrier or type of file, such as make and model of equipment or hardware, operating system, amount of memory, programming language, other necessary software, any plug-ins or peripherals required to play, view, or run the resource, etc."
  {:db/ident :bibframe/SystemRequirement,
   :dcterms/modified "2017-02-06 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "System Requirement",
   :skos/definition
   "Equipment or system requirements beyond what is normal and obvious for the type of carrier or type of file, such as make and model of equipment or hardware, operating system, amount of memory, programming language, other necessary software, any plug-ins or peripherals required to play, view, or run the resource, etc."})

(def TableOfContents
  "Table of contents of a resource."
  {:db/ident         :bibframe/TableOfContents,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Table of contents",
   :skos/definition  "Table of contents of a resource."})

(def Tactile
  "Resource that is intended to be perceived by touch."
  {:db/ident         :bibframe/Tactile,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Tactile material",
   :rdfs/subClassOf  :bibframe/Instance,
   :skos/definition  "Resource that is intended to be perceived by touch."})

(def TactileNotation
  "Information on the symbol system used to convey the content of a tactile resource."
  {:db/ident :bibframe/TactileNotation,
   :dcterms/modified ["2021-06-09 (Modified label [GH67])" "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Tactile notation",
   :rdfs/subClassOf :bibframe/Notation,
   :skos/definition
   "Information on the symbol system used to convey the content of a tactile resource."})

(def TapeConfig
  "Number of tracks on an audiotape, e.g., 12 track."
  {:db/ident         :bibframe/TapeConfig,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Tape configuration",
   :rdfs/subClassOf  :bibframe/SoundCharacteristic,
   :skos/definition  "Number of tracks on an audiotape, e.g., 12 track."})

(def Temporal
  "Chronological period."
  {:db/ident         :bibframe/Temporal,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Temporal concept",
   :skos/definition  "Chronological period."})

(def Text
  "Resource intended to be perceived visually and understood through the use of language in written or spoken form."
  {:db/ident :bibframe/Text,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Text",
   :rdfs/subClassOf :bibframe/Work,
   :skos/definition
   "Resource intended to be perceived visually and understood through the use of language in written or spoken form."})

(def Title
  "Title information relating to a resource: work title, preferred title, instance title, transcribed title, translated title, variant form of title, etc."
  {:db/ident :bibframe/Title,
   :dcterms/modified ["2017-02-03 (Definition changed)" "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Title entity",
   :skos/definition
   "Title information relating to a resource: work title, preferred title, instance title, transcribed title, translated title, variant form of title, etc."})

(def Topic
  "Concept or area of knowledge."
  {:db/ident         :bibframe/Topic,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Topic",
   :skos/definition  "Concept or area of knowledge."})

(def TrackConfig
  "Configuration of the audio track on a sound-track film, e.g., center track, edge track."
  {:db/ident :bibframe/TrackConfig,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Track configuration",
   :rdfs/subClassOf :bibframe/SoundCharacteristic,
   :skos/definition
   "Configuration of the audio track on a sound-track film, e.g., center track, edge track."})

(def Unit
  "Units in which a value is expressed."
  {:db/ident         :bibframe/Unit,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Unit",
   :skos/definition  "Units in which a value is expressed."})

(def Upc
  "Universal Product Code."
  {:db/ident         :bibframe/Upc,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "UPC",
   :rdfs/subClassOf  :bibframe/Identifier,
   :skos/definition  "Universal Product Code."})

(def Urn
  "Uniform Resource Name."
  {:db/ident         :bibframe/Urn,
   :dcterms/modified ["2021-06-09 (Corrected definition [GH51])"
                      "2016-04-21 (New)"],
   :rdf/type         :owl/Class,
   :rdfs/label       "URN",
   :rdfs/subClassOf  :bibframe/Identifier,
   :skos/definition  "Uniform Resource Name."})

(def UsageAndAccessPolicy
  "General statement of allowances and restrictions on access to a resource, including retention, reproduction, access, and lending."
  {:db/ident :bibframe/UsageAndAccessPolicy,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Use and access conditions",
   :skos/definition
   "General statement of allowances and restrictions on access to a resource, including retention, reproduction, access, and lending."})

(def UsePolicy
  "Usage limitations placed on a resource with respect to reproduction, publication, exhibition, etc.."
  {:db/ident :bibframe/UsePolicy,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Use policy",
   :rdfs/subClassOf :bibframe/UsageAndAccessPolicy,
   :skos/definition
   "Usage limitations placed on a resource with respect to reproduction, publication, exhibition, etc.."})

(def VariantTitle
  "Title associated with the resource that is different from the Work or Instance title."
  {:db/ident :bibframe/VariantTitle,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Title variation",
   :rdfs/subClassOf :bibframe/Title,
   :skos/definition
   "Title associated with the resource that is different from the Work or Instance title."})

(def VideoCharacteristic
  "Technical specification relating to the encoding of video images in a resource."
  {:db/ident :bibframe/VideoCharacteristic,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Video characteristic",
   :skos/definition
   "Technical specification relating to the encoding of video images in a resource."})

(def VideoFormat
  "Standard, etc., used to encode the analog video content of a resource, e.g., Beta, 8mm."
  {:db/ident :bibframe/VideoFormat,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Video format",
   :rdfs/subClassOf :bibframe/VideoCharacteristic,
   :skos/definition
   "Standard, etc., used to encode the analog video content of a resource, e.g., Beta, 8mm."})

(def VideoRecordingNumber
  "Number assigned by a publisher to a video recording."
  {:db/ident         :bibframe/VideoRecordingNumber,
   :dcterms/modified ["2017-02-03 (Corrected case in class name)"
                      "2016-04-21 (New)"],
   :rdf/type         :owl/Class,
   :rdfs/label       "Video recording number",
   :rdfs/subClassOf  :bibframe/Identifier,
   :skos/definition  "Number assigned by a publisher to a video recording."})

(def Work
  "Resource reflecting a conceptual essence of a cataloging resource."
  {:db/ident :bibframe/Work,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Work",
   :skos/definition
   "Resource reflecting a conceptual essence of a cataloging resource."})

(def absorbed
  "Resource that has been incorporated into another resource."
  {:db/ident :bibframe/absorbed,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/absorbedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Absorption of",
   :rdfs/subPropertyOf :bibframe/precededBy,
   :skos/definition
   "Resource that has been incorporated into another resource."})

(def absorbedBy
  "Resource that incorporates another resource."
  {:db/ident           :bibframe/absorbedBy,
   :dcterms/modified   ["2016-04-29 (added inverse, updated range)"
                        "2016-04-21 (New)"],
   :owl/inverseOf      :bibframe/absorbed,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       ["Suggested value - Work or Instance"
                        "Suggested use - With Work or Instance"],
   :rdfs/label         "Absorbed by",
   :rdfs/subPropertyOf :bibframe/succeededBy,
   :skos/definition    "Resource that incorporates another resource."})

(def accompaniedBy
  "Resource that accompanies the described resource."
  {:db/ident           :bibframe/accompaniedBy,
   :dcterms/modified   ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf      :bibframe/accompanies,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       ["Suggested value - Work, Instance or Item"
                        "Suggested use - With Work, Instance or Item"],
   :rdfs/label         "Accompanied by",
   :rdfs/subPropertyOf :bibframe/relatedTo,
   :skos/definition    "Resource that accompanies the described resource."})

(def accompanies
  "Resource that adds to or is issued with the described resource."
  {:db/ident :bibframe/accompanies,
   :dcterms/modified ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/accompaniedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work, Instance or Item"
                  "Suggested use - With Work, Instance or Item"],
   :rdfs/label "Accompanies",
   :rdfs/subPropertyOf :bibframe/relatedTo,
   :skos/definition
   "Resource that adds to or is issued with the described resource."})

(def acquisitionSource
  "Information about an organization, person, etc., from which a resource may be obtained."
  {:db/ident :bibframe/acquisitionSource,
   :dcterms/modified
   ["2021-06-09 (Removed range [GH63])"
    "2017-02-06 (Changed from data to object property, slight change to definition)"
    "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Source of acquisition",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Information about an organization, person, etc., from which a resource may be obtained."})

(def acquisitionTerms
  "Conditions under which the publisher, distributor, etc., will normally supply a resource, e.g., price of a resource."
  {:db/ident :bibframe/acquisitionTerms,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Terms of acquisition",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Conditions under which the publisher, distributor, etc., will normally supply a resource, e.g., price of a resource."})

(def adminMetadata
  "Metadata about the metadata, especially provenance information."
  {:db/ident :bibframe/adminMetadata,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Administrative metadata",
   :rdfs/range :bibframe/AdminMetadata,
   :skos/definition
   "Metadata about the metadata, especially provenance information."})

(def adminMetadataFor
  "Relates an Administrative metadata resource to the resource it captures information about."
  {:db/ident :bibframe/adminMetadataFor,
   :dcterms/modified "2021-06-09 (New [GH59])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/AdminMetadata,
   :rdfs/label "Administrative metadata for",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Relates an Administrative metadata resource to the resource it captures information about."})

(def agent
  "Entity associated with a resource or element of description, such as the name of the entity responsible for the content or of the publication, printing, distribution, issue, release or production of a resource."
  {:db/ident :bibframe/agent,
   :dcterms/modified ["2021-06-09 (Removed range [GH63])" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Associated agent",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Entity associated with a resource or element of description, such as the name of the entity responsible for the content or of the publication, printing, distribution, issue, release or production of a resource."})

(def agentOf
  "Property relating an agent, such as an entity responsible for the content or of the publication, printing, distribution, issue, release or production, to another resource."
  {:db/ident :bibframe/agentOf,
   :dcterms/modified "2021-06-09 (New [GH3])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Associated agent of",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Property relating an agent, such as an entity responsible for the content or of the publication, printing, distribution, issue, release or production, to another resource."})

(def appliedMaterial
  "Physical or chemical substance applied to a base material of a resource."
  {:db/ident :bibframe/appliedMaterial,
   :dcterms/modified
   ["2021-06-09 (Removed range [GH24], Broadened domain, Made subproperty of material [GH26])"
    "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work, Instance or Item",
   :rdfs/label "Applied material",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :bibframe/material,
   :skos/definition
   "Physical or chemical substance applied to a base material of a resource."})

(def appliedMaterialOf
  "Relates a Material resource to that which it is the applied material of."
  {:db/ident :bibframe/appliedMaterialOf,
   :dcterms/modified "2021-06-09 (New [GH25])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Appllied material of",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :bibframe/materialOf,
   :skos/definition
   "Relates a Material resource to that which it is the applied material of."})

(def arrangement
  "Relates one resource to another of which it is an arrangement of the first."
  {:db/ident :bibframe/arrangement,
   :dcterms/modified ["2021-06-09 (Redefined [GH77])" "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/arrangementOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Work,
   :rdfs/label "Arrangement",
   :rdfs/range :bibframe/Work,
   :rdfs/subPropertyOf :bibframe/relatedTo,
   :skos/definition
   "Relates one resource to another of which it is an arrangement of the first."})

(def arrangementOf
  "Relates an arrangement to the resource of which it is an arrangement."
  {:db/ident :bibframe/arrangementOf,
   :dcterms/modified "2021-06-09 (New [GH77])",
   :owl/inverseOf :bibframe/arrangement,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Work,
   :rdfs/label "Arrangement of",
   :rdfs/range :bibframe/Work,
   :rdfs/subPropertyOf :bibframe/relatedTo,
   :skos/definition
   "Relates an arrangement to the resource of which it is an arrangement."})

(def ascensionAndDeclination
  "System for identifying the location of a celestial object in the sky covered by the cartographic content of a resource using the angles of right ascension and declination."
  {:db/ident :bibframe/ascensionAndDeclination,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Cartographic,
   :rdfs/label "Cartographic ascension and declination",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "System for identifying the location of a celestial object in the sky covered by the cartographic content of a resource using the angles of right ascension and declination."})

(def aspectRatio
  "Proportional relationship between an image's width and its height."
  {:db/ident :bibframe/aspectRatio,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Aspect ratio",
   :rdfs/range :bibframe/AspectRatio,
   :skos/definition
   "Proportional relationship between an image's width and its height."})

(def assigner
  "Entity that assigned the metadata, such as the entity that assigned a classification number, entity that assigned a name, entity that assigned an identifier."
  {:db/ident :bibframe/assigner,
   :dcterms/modified ["2021-06-09 (Broaden domain [GH60], Removed range [GH63])"
                      "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Assigner",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Entity that assigned the metadata, such as the entity that assigned a classification number, entity that assigned a name, entity that assigned an identifier."})

(def awards
  "Information on awards associated with the described resource."
  {:db/ident :bibframe/awards,
   :dcterms/modified ["2021-06-09 (Added note [GH37])" "2016-04-21 (New)"],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Award note",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Information on awards associated with the described resource.",
   :skos/editorialNote
   "See also the ARM Ontology for strategies to model this information in greater detail."})

(def baseMaterial
  "Underlying physical material of a resource."
  {:db/ident :bibframe/baseMaterial,
   :dcterms/modified
   ["2021-06-09 (Removed range [GH24], Broadened domain, Made subproperty of material [GH26])"
    "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work, Instance or Item",
   :rdfs/label "Base material",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :bibframe/material,
   :skos/definition "Underlying physical material of a resource."})

(def baseMaterialOf
  "Relates a Material resource to that which it is the base material of."
  {:db/ident :bibframe/baseMaterialOf,
   :dcterms/modified "2021-06-09 (New [GH25])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Base material of",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :bibframe/materialOf,
   :skos/definition
   "Relates a Material resource to that which it is the base material of."})

(def binding
  "A method used to bind a published or unpublished resource,or other binding information."
  {:db/ident :bibframe/binding,
   :dcterms/modified "2022-10-03 (New [GH91])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Binding method",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "A method used to bind a published or unpublished resource,or other binding information."})

(def bookFormat
  "Result of folding a printed sheet to form a gathering of leaves."
  {:db/ident :bibframe/bookFormat,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Book format",
   :rdfs/range :bibframe/BookFormat,
   :skos/definition
   "Result of folding a printed sheet to form a gathering of leaves."})

(def capture
  "Information about place and date associated with the capture (e.g., recording, filming) of the content of a resource."
  {:db/ident :bibframe/capture,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Capture of content",
   :rdfs/range :bibframe/Capture,
   :skos/definition
   "Information about place and date associated with the capture (e.g., recording, filming) of the content of a resource."})

(def carrier
  "Categorization reflecting the format of the storage medium and housing of a carrier."
  {:db/ident :bibframe/carrier,
   :dcterms/modified ["2022-10-03 (Removed range [GH72])" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Carrier type",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Categorization reflecting the format of the storage medium and housing of a carrier."})

(def cartographicAttributes
  "Cartographic data that identifies characteristics of the resource, such as coordinates, projection, etc."
  {:db/ident :bibframe/cartographicAttributes,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Cartographic data",
   :rdfs/range :bibframe/Cartographic,
   :skos/definition
   "Cartographic data that identifies characteristics of the resource, such as coordinates, projection, etc."})

(def changeDate
  "Date or date and time on which the metadata was modified."
  {:db/ident :bibframe/changeDate,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/AdminMetadata,
   :rdfs/label "Description change date",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :bibframe/date,
   :skos/definition
   "Date or date and time on which the metadata was modified."})

(def classification
  "Classification number in any scheme."
  {:db/ident         :bibframe/classification,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Suggested use - With Work, Instance or Item",
   :rdfs/label       "Classification",
   :rdfs/range       :bibframe/Classification,
   :skos/definition  "Classification number in any scheme."})

(def classificationPortion
  "Classification number (single class number or beginning number of a span) that indicates the subject by applying a formal system of coding and organizing resources."
  {:db/ident :bibframe/classificationPortion,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Classification,
   :rdfs/label "Classification number",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Classification number (single class number or beginning number of a span) that indicates the subject by applying a formal system of coding and organizing resources."})

(def code
  "String of characters that serves as a code representing information."
  {:db/ident :bibframe/code,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Code",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "String of characters that serves as a code representing information."})

(def collectionArrangement
  "Information about the organization and arrangement of a collection of resources."
  {:db/ident :bibframe/collectionArrangement,
   :dcterms/modified "2021-06-09 (New [GH77])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Collection Organization and arrangement",
   :rdfs/range :bibframe/CollectionArrangement,
   :skos/definition
   "Information about the organization and arrangement of a collection of resources."})

(def collectionArrangementOf
  "Relates an Arrangement resource to that which it describes."
  {:db/ident :bibframe/collectionArrangementOf,
   :dcterms/modified "2021-06-09 (New [GH77])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested value - Work or Instance",
   :rdfs/domain :bibframe/CollectionArrangement,
   :rdfs/label "Organization and arrangement of Collection",
   :skos/definition
   "Relates an Arrangement resource to that which it describes."})

(def collectionOrganization
  "Manner in which the resource is divided into smaller units."
  {:db/ident :bibframe/collectionOrganization,
   :dcterms/modified "2021-06-09 (New [GH77])",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/CollectionArrangement,
   :rdfs/label "Organization of material",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Manner in which the resource is divided into smaller units."})

(def colorContent
  "Color characteristics, e.g., black and white, multicolored."
  {:db/ident :bibframe/colorContent,
   :dcterms/modified ["2021-06-09 (Broaden range [GH31])" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work, Instance or Item",
   :rdfs/label "Color content",
   :rdfs/range :bibframe/ColorContent,
   :skos/definition
   "Color characteristics, e.g., black and white, multicolored."})

(def content
  "Categorization reflecting the fundamental form of communication in which the content is expressed and the human sense through which it is intended to be perceived."
  {:db/ident :bibframe/content,
   :dcterms/modified ["2022-10-03 (Removed range [GH71])" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Work,
   :rdfs/label "Content type",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Categorization reflecting the fundamental form of communication in which the content is expressed and the human sense through which it is intended to be perceived."})

(def contentAccessibility
  "Information that assists those with a sensory impairment for greater understanding of content, e.g., captions."
  {:db/ident :bibframe/contentAccessibility,
   :dcterms/modified ["2017-03-15 (fixed typo in range)"
                      "2017-02-03 (changed from data to object property)"
                      "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Content accessibility information",
   :rdfs/range :bibframe/ContentAccessibility,
   :skos/definition
   "Information that assists those with a sensory impairment for greater understanding of content, e.g., captions."})

(def continuedBy
  "Resource whose content continues an earlier resource under a new title."
  {:db/ident :bibframe/continuedBy,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/continues,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Continued by",
   :rdfs/subPropertyOf :bibframe/succeededBy,
   :skos/definition
   "Resource whose content continues an earlier resource under a new title."})

(def continuedInPartBy
  "Resource part of whose content separated from an earlier resource to form a new resource."
  {:db/ident :bibframe/continuedInPartBy,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/separatedFrom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Continued in part by",
   :rdfs/subPropertyOf :bibframe/succeededBy,
   :skos/definition
   "Resource part of whose content separated from an earlier resource to form a new resource."})

(def continues
  "Resource that is continued by the content of a later resource under a new title."
  {:db/ident :bibframe/continues,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/continuedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Continuation of",
   :rdfs/subPropertyOf :bibframe/precededBy,
   :skos/definition
   "Resource that is continued by the content of a later resource under a new title."})

(def continuesInPart
  "Resource that split into two or more separate resources with new titles."
  {:db/ident :bibframe/continuesInPart,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/splitInto,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Continuation in part of",
   :rdfs/subPropertyOf :bibframe/precededBy,
   :skos/definition
   "Resource that split into two or more separate resources with new titles."})

(def contribution
  "Agent and its role in relation to the resource."
  {:db/ident         :bibframe/contribution,
   :dcterms/modified ["2017-02-03 (Corrected label)" "2016-04-21 (New)"],
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Suggested use - With Work, Instance or Item",
   :rdfs/label       "Contributor and role",
   :rdfs/range       :bibframe/Contribution,
   :skos/definition  "Agent and its role in relation to the resource."})

(def contributionOf
  "Relates a contribution resource, which associates an Agent and Role together, to the relevant resource."
  {:db/ident :bibframe/contributionOf,
   :dcterms/modified "2021-06-09 (New [GH4])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested value - Work, Instance or Item",
   :rdfs/domain :bibframe/Contribution,
   :rdfs/label "Contribution of",
   :skos/definition
   "Relates a contribution resource, which associates an Agent and Role together, to the relevant resource."})

(def coordinates
  "Mathematical system for identifying the area covered by the cartographic content of a resource, expressed either by means of longitude and latitude on the surface of planets or by the angles of right ascension and declination for celestial cartographic content."
  {:db/ident :bibframe/coordinates,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Cartographic,
   :rdfs/label "Cartographic coordinates",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Mathematical system for identifying the area covered by the cartographic content of a resource, expressed either by means of longitude and latitude on the surface of planets or by the angles of right ascension and declination for celestial cartographic content."})

(def copyrightDate
  "Date associated with a claim of protection under copyright or a similar regime."
  {:db/ident :bibframe/copyrightDate,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Copyright date",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :bibframe/date,
   :skos/definition
   "Date associated with a claim of protection under copyright or a similar regime."})

(def copyrightRegistration
  "Copyright and Legal Deposit registration information"
  {:db/ident         :bibframe/copyrightRegistration,
   :dcterms/modified ["2016-05-04 (Corrected expected value)"
                      "2016-04-21 (New)"],
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Suggested use - With Work or Instance",
   :rdfs/label       "Copyright registration information",
   :rdfs/range       :bibframe/CopyrightRegistration,
   :skos/definition  "Copyright and Legal Deposit registration information"})

(def count
  "Number associated with a measure of units, such as the number of units and/or subunits making up a resource."
  {:db/ident :bibframe/count,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Number of units",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Number associated with a measure of units, such as the number of units and/or subunits making up a resource."})

(def coverArt
  "Cover art image of a resource."
  {:db/ident         :bibframe/coverArt,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Suggested use - With Work or Instance",
   :rdfs/label       "Cover art",
   :rdfs/range       :bibframe/CoverArt,
   :skos/definition  "Cover art image of a resource."})

(def creationDate
  "Date or date and time on which the original metadata first created."
  {:db/ident :bibframe/creationDate,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/AdminMetadata,
   :rdfs/label "Description creation date",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :bibframe/date,
   :skos/definition
   "Date or date and time on which the original metadata first created."})

(def credits
  "Information in note form of credits for persons or organizations who have participated in the creation and/or production of the resource."
  {:db/ident :bibframe/credits,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Credits note",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Information in note form of credits for persons or organizations who have participated in the creation and/or production of the resource."})

(def custodialHistory
  "Information about the provenance, such as origin, ownership and custodial history (chain of custody), of a resource."
  {:db/ident :bibframe/custodialHistory,
   :dcterms/modified ["2021-06-09 (Added note [GH38])" "2016-04-21 (New)"],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Suggested use - With Work, Instance or Item",
   :rdfs/label "Custodial history",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Information about the provenance, such as origin, ownership and custodial history (chain of custody), of a resource.",
   :skos/editorialNote
   "See also the ARM Ontology for strategies to model this information in greater detail."})

(def dataSource
  "Resource that is a data source to which the described resource is related. It may contain information about other files, printed sources, or collection procedures."
  {:db/ident :bibframe/dataSource,
   :dcterms/modified ["2016-04-29 (updated range)" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Data source",
   :rdfs/subPropertyOf :bibframe/relatedTo,
   :skos/definition
   "Resource that is a data source to which the described resource is related. It may contain information about other files, printed sources, or collection procedures."})

(def date
  "Date designation associated with a resource or element of description, such as date of title variation; year a degree was awarded; date associated with the publication, printing, distribution, issue, release or production of a resource. May be date typed."
  {:db/ident :bibframe/date,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Date",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Date designation associated with a resource or element of description, such as date of title variation; year a degree was awarded; date associated with the publication, printing, distribution, issue, release or production of a resource. May be date typed."})

(def degree
  "Degree for which author was a candidate."
  {:db/ident         :bibframe/degree,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :bibframe/Dissertation,
   :rdfs/label       "Degree",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "Degree for which author was a candidate."})

(def derivativeOf
  "Source work from which the described resource is derived."
  {:db/ident :bibframe/derivativeOf,
   :dcterms/modified ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/hasDerivative,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Is derivative of",
   :rdfs/subPropertyOf :bibframe/relatedTo,
   :skos/definition
   "Source work from which the described resource is derived."})

(def derivedFrom
  "Link to the metadata that was the source of the data."
  {:db/ident         :bibframe/derivedFrom,
   :dcterms/modified ["2021-06-09 (Removed range [GH41])" "2016-04-21 (New)"],
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :bibframe/AdminMetadata,
   :rdfs/label       "Source metadata",
   :rdfs/range       :rdfs/Resource,
   :skos/definition  "Link to the metadata that was the source of the data."})

(def descriptionAuthentication
  "Indication of specific types of reviews that have been carried out on the description information."
  {:db/ident :bibframe/descriptionAuthentication,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/AdminMetadata,
   :rdfs/label "Description authentication",
   :rdfs/range :bibframe/DescriptionAuthentication,
   :skos/definition
   "Indication of specific types of reviews that have been carried out on the description information."})

(def descriptionConventions
  "Rules used for the descriptive content of the resource description."
  {:db/ident :bibframe/descriptionConventions,
   :dcterms/modified ["2016-04-24 (fixed domain name)" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/AdminMetadata,
   :rdfs/label "Description conventions",
   :rdfs/range :bibframe/DescriptionConventions,
   :skos/definition
   "Rules used for the descriptive content of the resource description."})

(def descriptionLanguage
  "Language used for the metadata."
  {:db/ident         :bibframe/descriptionLanguage,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :bibframe/AdminMetadata,
   :rdfs/label       "Description language",
   :rdfs/range       :bibframe/Language,
   :skos/definition  "Language used for the metadata."})

(def descriptionLevel
  "Designation of the descriptive content of the metadata."
  {:db/ident         :bibframe/descriptionLevel,
   :dcterms/modified "2022-10-03 (New [GH43])",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :bibframe/AdminMetadata,
   :rdfs/label       "Description level",
   :rdfs/range       :bibframe/DescriptionLevel,
   :skos/definition  "Designation of the descriptive content of the metadata."})

(def descriptionModifier
  "Agency that modified a description."
  {:db/ident         :bibframe/descriptionModifier,
   :dcterms/modified ["2021-06-09 (Removed range [GH63])" "2016-04-21 (New)"],
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :bibframe/AdminMetadata,
   :rdfs/label       "Description modifier",
   :rdfs/range       :rdfs/Resource,
   :skos/definition  "Agency that modified a description."})

(def digitalCharacteristic
  "Technical specification relating to the digital encoding of text, image, audio, video, and other types of data in a resource."
  {:db/ident :bibframe/digitalCharacteristic,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Digital characteristic",
   :rdfs/range :bibframe/DigitalCharacteristic,
   :skos/definition
   "Technical specification relating to the digital encoding of text, image, audio, video, and other types of data in a resource."})

(def dimensions
  "Measurements of the carrier or carriers and/or the container of a resource."
  {:db/ident :bibframe/dimensions,
   :dcterms/modified ["2021-06-09 (Added note [GH39])" "2016-04-21 (New)"],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Dimensions",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Measurements of the carrier or carriers and/or the container of a resource.",
   :skos/editorialNote
   "See also the ARM Ontology for strategies to model this information in greater detail."})

(def dissertation
  "Work presented as part of the formal requirements for an academic degree."
  {:db/ident :bibframe/dissertation,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Dissertation Information",
   :rdfs/range :bibframe/Dissertation,
   :skos/definition
   "Work presented as part of the formal requirements for an academic degree."})

(def duration
  "Information about the playing time, running time, etc. of a resource."
  {:db/ident :bibframe/duration,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Duration",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Information about the playing time, running time, etc. of a resource."})

(def edition
  "Edition of the classification scheme, such as full, abridged or a number, when a classification scheme designates editions."
  {:db/ident :bibframe/edition,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Classification,
   :rdfs/label "Classification scheme edition",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Edition of the classification scheme, such as full, abridged or a number, when a classification scheme designates editions."})

(def editionEnumeration
  "Enumeration of the edition; usually transcribed."
  {:db/ident         :bibframe/editionEnumeration,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :bibframe/Instance,
   :rdfs/label       "Edition enumeration",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "Enumeration of the edition; usually transcribed."})

(def editionStatement
  "Information identifying the edition or version of the resource and associated statements of responsibility for the edition; usually transcribed."
  {:db/ident :bibframe/editionStatement,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Edition statement",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Information identifying the edition or version of the resource and associated statements of responsibility for the edition; usually transcribed."})

(def electronicLocator
  "Electronic location from which the resource is available."
  {:db/ident :bibframe/electronicLocator,
   :dcterms/modified ["2021-06-09 (Removed domain [GH66])" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Electronic location",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Electronic location from which the resource is available."})

(def emulsion
  "Suspension of light-sensitive chemicals used as a coating on a microfilm or microfiche, e.g., silver halide."
  {:db/ident :bibframe/emulsion,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Emulsion",
   :rdfs/range :bibframe/Emulsion,
   :skos/definition
   "Suspension of light-sensitive chemicals used as a coating on a microfilm or microfiche, e.g., silver halide."})

(def ensemble
  "Ensemble applicable to the Work."
  {:db/ident :bibframe/ensemble,
   :dcterms/modified
   ["2021-06-09 (Changed domain [GH56], Modified definition [GH56])"
    "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Work,
   :rdfs/label "Ensemble",
   :rdfs/range :bibframe/Ensemble,
   :skos/definition "Ensemble applicable to the Work."})

(def ensembleType
  "Specific type of ensemble, such as orchestra, band, guitar ensemble."
  {:db/ident :bibframe/ensembleType,
   :dcterms/modified ["2021-06-09 (Changed domain [GH56])" "2016-04-21 (New)"],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Ensemble,
   :rdfs/label "Ensemble type",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Specific type of ensemble, such as orchestra, band, guitar ensemble."})

(def enumerationAndChronology
  "Numbering and dates of issues or items held."
  {:db/ident :bibframe/enumerationAndChronology,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Item,
   :rdfs/label
   "Numbering or other enumeration and dates associated with issues or items held.",
   :rdfs/range :bibframe/EnumerationAndChronology,
   :skos/definition "Numbering and dates of issues or items held."})

(def equinox
  "One of two points of intersection of the ecliptic and the celestial equator, occupied by the sun when its declination is 0 degrees."
  {:db/ident :bibframe/equinox,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Cartographic,
   :rdfs/label "Cartographic equinox",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "One of two points of intersection of the ecliptic and the celestial equator, occupied by the sun when its declination is 0 degrees."})

(def eventContent
  "Work whose content is the described event."
  {:db/ident           :bibframe/eventContent,
   :dcterms/modified   ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf      :bibframe/eventContentOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :bibframe/Event,
   :rdfs/label         "Event content",
   :rdfs/range         :bibframe/Work,
   :rdfs/subPropertyOf :bibframe/relatedTo,
   :skos/definition    "Work whose content is the described event."})

(def eventContentOf
  "Event that is the content of the described work."
  {:db/ident           :bibframe/eventContentOf,
   :dcterms/modified   ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf      :bibframe/eventContent,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :bibframe/Work,
   :rdfs/label         "Has event content",
   :rdfs/range         :bibframe/Event,
   :rdfs/subPropertyOf :bibframe/relatedTo,
   :skos/definition    "Event that is the content of the described work."})

(def exclusionGRing
  "Coordinate pairs that identify the closed non-intersecting boundary of the area contained within the G-polygon outer ring that is excluded."
  {:db/ident :bibframe/exclusionGRing,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Cartographic,
   :rdfs/label "Cartographic G ring area excluded",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Coordinate pairs that identify the closed non-intersecting boundary of the area contained within the G-polygon outer ring that is excluded."})

(def expressionOf
  "Work that the described Work is an expression of. Use to connect Works under LRM/RDA guidelines or similar implementations."
  {:db/ident :bibframe/expressionOf,
   :dcterms/modified ["2016-04-29 (added inverse)"
                      "2021-06-09 (Modified definition [GH8])"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/hasExpression,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Work,
   :rdfs/label "Expression of",
   :rdfs/range :bibframe/Work,
   :rdfs/subPropertyOf :bibframe/relatedTo,
   :skos/definition
   "Work that the described Work is an expression of. Use to connect Works under LRM/RDA guidelines or similar implementations."})

(def extent
  "Number and type of units and/or subunits making up a resource."
  {:db/ident :bibframe/extent,
   :dcterms/modified ["2021-06-09 (Broadened range [GH30])" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Extent",
   :rdfs/range :bibframe/Extent,
   :skos/definition
   "Number and type of units and/or subunits making up a resource."})

(def findingAid
  "Relationship for archival, visual, and manuscript resources to a finding aid or similar control materials."
  {:db/ident :bibframe/findingAid,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/findingAidOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Finding aid",
   :rdfs/subPropertyOf :bibframe/accompaniedBy,
   :skos/definition
   "Relationship for archival, visual, and manuscript resources to a finding aid or similar control materials."})

(def findingAidOf
  "Finding aid or similar control materials for archival, visual, and manuscript resources."
  {:db/ident :bibframe/findingAidOf,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/findingAid,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Finding aid for",
   :rdfs/subPropertyOf :bibframe/accompanies,
   :skos/definition
   "Finding aid or similar control materials for archival, visual, and manuscript resources."})

(def firstIssue
  "Beginning date of a resource and/or the sequential designations."
  {:db/ident :bibframe/firstIssue,
   :dcterms/modified ["2021-06-09 (Removed domain [GH76])" "2016-04-21 (New)"],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Multipart first issue",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Beginning date of a resource and/or the sequential designations."})

(def fontSize
  "Size of the type used to represent the characters and symbols in a resource."
  {:db/ident :bibframe/fontSize,
   :dcterms/modified ["2021-06-09 (Added note [GH40])" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Font size",
   :rdfs/range :bibframe/FontSize,
   :skos/definition
   "Size of the type used to represent the characters and symbols in a resource.",
   :skos/editorialNote
   "See also the ARM Ontology for strategies to model this information in greater detail."})

(def frequency
  "Intervals at which the parts of a serially produced resource or the updates to an integrating resource are issued."
  {:db/ident :bibframe/frequency,
   :dcterms/modified ["2021-06-09 (Removed domain [GH76])" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Frequency",
   :rdfs/range :bibframe/Frequency,
   :skos/definition
   "Intervals at which the parts of a serially produced resource or the updates to an integrating resource are issued."})

(def generation
  "Relationship between an original carrier and the carrier of a reproduction made from the original."
  {:db/ident :bibframe/generation,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Generation",
   :rdfs/range :bibframe/Generation,
   :skos/definition
   "Relationship between an original carrier and the carrier of a reproduction made from the original."})

(def generationDate
  "Date of conversion of the metadata from another format."
  {:db/ident :bibframe/generationDate,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/AdminMetadata,
   :rdfs/label "Date generated",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :bibframe/date,
   :skos/definition "Date of conversion of the metadata from another format."})

(def generationProcess
  "Indication of the program or process used to generate the description by application of a particular transformation."
  {:db/ident :bibframe/generationProcess,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/AdminMetadata,
   :rdfs/label "Description generation",
   :rdfs/range :bibframe/GenerationProcess,
   :skos/definition
   "Indication of the program or process used to generate the description by application of a particular transformation."})

(def genreForm
  "Form category or genre to which a resource belongs"
  {:db/ident         :bibframe/genreForm,
   :dcterms/modified ["2021-06-09 (Removed range [GH16])" "2016-04-21 (New)"],
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Suggested use - With Work, Instance or Item",
   :rdfs/label       "Genre/form",
   :rdfs/range       :rdfs/Resource,
   :skos/definition  "Form category or genre to which a resource belongs"})

(def geographicCoverage
  "Geographic coverage of the content of the resource."
  {:db/ident         :bibframe/geographicCoverage,
   :dcterms/modified ["2021-06-09 (Removed domain [GH15])"
                      "2017-02-06 (Changed from data to object property)"
                      "2016-04-21 (New)"],
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :rdfs/Resource,
   :rdfs/label       "Geographic coverage",
   :rdfs/range       :bibframe/GeographicCoverage,
   :skos/definition  "Geographic coverage of the content of the resource."})

(def grantingInstitution
  "Name of degree granting institution."
  {:db/ident         :bibframe/grantingInstitution,
   :dcterms/modified ["2021-06-09 (Removed range [GH63])" "2016-04-21 (New)"],
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :bibframe/Dissertation,
   :rdfs/label       "Degree issuing institution",
   :rdfs/range       :rdfs/Resource,
   :skos/definition  "Name of degree granting institution."})

(def hasDerivative
  "Resource that is a modification of the described work."
  {:db/ident :bibframe/hasDerivative,
   :dcterms/modified ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/derivativeOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Has derivative",
   :rdfs/subPropertyOf :bibframe/relatedTo,
   :skos/definition "Resource that is a modification of the described work."})

(def hasEquivalent
  "Resource embodies the same content as the described resource."
  {:db/ident :bibframe/hasEquivalent,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/SymmetricProperty,
   :rdfs/comment ["Suggested value - Work, Instance or Item"
                  "Suggested use - With Work, Instance or Item"],
   :rdfs/label "Equivalence",
   :rdfs/subPropertyOf :bibframe/relatedTo,
   :skos/definition
   "Resource embodies the same content as the described resource."})

(def hasExpression
  "Work that is an expression of a described Work. Use to relate Works under LRM/RDA guidelines or similar implementations."
  {:db/ident :bibframe/hasExpression,
   :dcterms/modified ["2021-06-09 (Modified definition [GH8])"
                      "2016-04-29 (added inverse)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/expressionOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Work,
   :rdfs/label "Expressed as",
   :rdfs/range :bibframe/Work,
   :rdfs/subPropertyOf :bibframe/relatedTo,
   :skos/definition
   "Work that is an expression of a described Work. Use to relate Works under LRM/RDA guidelines or similar implementations."})

(def hasInstance
  "Instance is related to described Work. For use to connect Works to Instances in the BIBFRAME structure."
  {:db/ident :bibframe/hasInstance,
   :dcterms/modified ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/instanceOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Work,
   :rdfs/label "Instance of Work",
   :rdfs/range :bibframe/Instance,
   :rdfs/subPropertyOf :bibframe/relatedTo,
   :skos/definition
   "Instance is related to described Work. For use to connect Works to Instances in the BIBFRAME structure."})

(def hasItem
  "Item which is an example of the described Instance."
  {:db/ident           :bibframe/hasItem,
   :dcterms/modified   ["2017-02-07 (slight revision of definition)"
                        "2016-04-21 (New)"
                        "2016-04-29 (added inverse)"],
   :owl/inverseOf      :bibframe/itemOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :bibframe/Instance,
   :rdfs/label         "Has holding",
   :rdfs/range         :bibframe/Item,
   :rdfs/subPropertyOf :bibframe/relatedTo,
   :skos/definition    "Item which is an example of the described Instance."})

(def hasPart
  "Resource that is included either physically or logically in the described resource"
  {:db/ident :bibframe/hasPart,
   :dcterms/modified ["2021-06-09 (Use with Event also [GH9])"
                      "2016-04-21 (New)"
                      "2016-04-29 (added inverse)"],
   :owl/inverseOf :bibframe/partOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work, Instance, Item or Event"
                  "Suggested use - With Work, Instance, Item or Event"],
   :rdfs/label "Has part",
   :rdfs/subPropertyOf :bibframe/relatedTo,
   :skos/definition
   "Resource that is included either physically or logically in the described resource"})

(def hasReproduction
  "Resource that reproduces another Resource."
  {:db/ident           :bibframe/hasReproduction,
   :dcterms/modified   ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf      :bibframe/reproductionOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :bibframe/Instance,
   :rdfs/label         "Reproduced as",
   :rdfs/range         :bibframe/Instance,
   :rdfs/subPropertyOf :bibframe/hasEquivalent,
   :skos/definition    "Resource that reproduces another Resource."})

(def hasSeries
  "Resource in which the part has been issued; the title of the larger resource appears on the part."
  {:db/ident :bibframe/hasSeries,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/seriesOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "In series",
   :rdfs/subPropertyOf :bibframe/partOf,
   :skos/definition
   "Resource in which the part has been issued; the title of the larger resource appears on the part."})

(def hasSubseries
  "series resource that is part of another series."
  {:db/ident           :bibframe/hasSubseries,
   :dcterms/modified   ["2016-04-29 (added inverse, updated range)"
                        "2016-04-21 (New)"],
   :owl/inverseOf      :bibframe/subseriesOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       ["Suggested value - Work or Instance"
                        "Suggested use - With Work or Instance"],
   :rdfs/label         "Subseries",
   :rdfs/subPropertyOf :bibframe/partOf,
   :skos/definition    "series resource that is part of another series."})

(def heldBy
  "Entity holding the item or from which it is available."
  {:db/ident         :bibframe/heldBy,
   :dcterms/modified ["2021-06-09 (Removed range [GH63])" "2016-04-21 (New)"],
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :bibframe/Item,
   :rdfs/label       "Held by",
   :rdfs/range       :rdfs/Resource,
   :skos/definition  "Entity holding the item or from which it is available."})

(def hierarchicalLevel
  "Hierarchical position of the described materials relative to other material from the same source."
  {:db/ident :bibframe/hierarchicalLevel,
   :dcterms/modified ["2021-06-09 (Modified range [GH77])" "2016-04-21 (New)"],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/CollectionArrangement,
   :rdfs/label "Hierarchical level of material",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Hierarchical position of the described materials relative to other material from the same source."})

(def historyOfWork
  "Information about the history of a Work."
  {:db/ident         :bibframe/historyOfWork,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :bibframe/Work,
   :rdfs/label       "History of the work",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "Information about the history of a Work."})

(def identifiedBy
  "Character string associated with a resource that serves to differentiate that resource from other resources, i.e., that uniquely identifies an entity."
  {:db/ident :bibframe/identifiedBy,
   :dcterms/modified ["2017-05-04 (New inverse)" "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/identifies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Identifier",
   :rdfs/range :bibframe/Identifier,
   :skos/definition
   "Character string associated with a resource that serves to differentiate that resource from other resources, i.e., that uniquely identifies an entity."})

(def identifies
  "Resource that is associated with a character string that serves to differentiate one resource from another."
  {:db/ident :bibframe/identifies,
   :dcterms/modified "2017-02-03 (New inverse)",
   :owl/inverseOf :bibframe/identifiedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Identifier,
   :rdfs/label "Resource identified",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Resource that is associated with a character string that serves to differentiate one resource from another."})

(def illustrativeContent
  "Information about content intended to illustrate a resource."
  {:db/ident :bibframe/illustrativeContent,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Illustrative content information",
   :rdfs/range :bibframe/Illustration,
   :skos/definition
   "Information about content intended to illustrate a resource."})

(def immediateAcquisition
  "Information about the circumstances, e.g., source, date, method, under which the resource was directly acquired."
  {:db/ident :bibframe/immediateAcquisition,
   :dcterms/modified ["2017-02-06 (Changed from data to object property)"
                      "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Item,
   :rdfs/label "Immediate acquisition",
   :rdfs/range :bibframe/ImmediateAcquisition,
   :skos/definition
   "Information about the circumstances, e.g., source, date, method, under which the resource was directly acquired."})

(def index
  "Resource has an accompanying index"
  {:db/ident           :bibframe/index,
   :dcterms/modified   ["2017-02-03 (corrected label)"
                        "2016-04-29 (added inverse, updated range)"
                        "2016-04-21 (New)"],
   :owl/inverseOf      :bibframe/indexOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       ["Suggested value - Work or Instance"
                        "Suggested use - With Work or Instance"],
   :rdfs/label         "Has index",
   :rdfs/subPropertyOf :bibframe/accompaniedBy,
   :skos/definition    "Resource has an accompanying index"})

(def indexOf
  "Index that accompanies a resource."
  {:db/ident           :bibframe/indexOf,
   :dcterms/modified   ["2016-04-29 (added inverse, updated range)"
                        "2016-04-21 (New)"],
   :owl/inverseOf      :bibframe/index,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       ["Suggested value - Work or Instance"
                        "Suggested use - With Work or Instance"],
   :rdfs/label         "Index to",
   :rdfs/subPropertyOf :bibframe/accompanies,
   :skos/definition    "Index that accompanies a resource."})

(def instanceOf
  "Work the Instance described instantiates or manifests. For use to connect Instances to Works in the BIBFRAME structure."
  {:db/ident :bibframe/instanceOf,
   :dcterms/modified ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/hasInstance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Instance of",
   :rdfs/range :bibframe/Work,
   :rdfs/subPropertyOf :bibframe/relatedTo,
   :skos/definition
   "Work the Instance described instantiates or manifests. For use to connect Instances to Works in the BIBFRAME structure."})

(def instrument
  "Instrument for which a musical Work is appropriate."
  {:db/ident         :bibframe/instrument,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :bibframe/Work,
   :rdfs/label       "Instrument",
   :rdfs/range       :bibframe/MusicInstrument,
   :skos/definition  "Instrument for which a musical Work is appropriate."})

(def instrumentalType
  "Specific role of instrument, such as alternate, doubling, solo, ensemble."
  {:db/ident :bibframe/instrumentalType,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/MusicInstrument,
   :rdfs/label "Instrument role",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Specific role of instrument, such as alternate, doubling, solo, ensemble."})

(def intendedAudience
  "Information that identifies the specific audience or intellectual level for which the content of the resource is considered appropriate."
  {:db/ident :bibframe/intendedAudience,
   :dcterms/modified ["2022-10-03 (Removed range [GH74])" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Intended audience",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Information that identifies the specific audience or intellectual level for which the content of the resource is considered appropriate."})

(def issuance
  "Categorization reflecting whether a resource is issued in one or more parts, the way it is updated, and its intended termination."
  {:db/ident :bibframe/issuance,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Mode of issuance",
   :rdfs/range :bibframe/Issuance,
   :skos/definition
   "Categorization reflecting whether a resource is issued in one or more parts, the way it is updated, and its intended termination."})

(def issuedWith
  "Resource that is issued on the same carrier as the resource being described."
  {:db/ident :bibframe/issuedWith,
   :dcterms/modified
   ["2021-06-09 (Removed range [GH62], Broadened domain [GH62])"
    "2016-04-21 (New)"],
   :rdf/type :owl/SymmetricProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Issued with",
   :rdfs/subPropertyOf :bibframe/accompanies,
   :skos/definition
   "Resource that is issued on the same carrier as the resource being described."})

(def itemOf
  "Instance for which the described Item is an example."
  {:db/ident           :bibframe/itemOf,
   :dcterms/modified   ["2017-02-07 (slight revision of definition)"
                        "2016-04-21 (New)"
                        "2016-04-29 (added inverse)"],
   :owl/inverseOf      :bibframe/hasItem,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :bibframe/Item,
   :rdfs/label         "Holding for",
   :rdfs/range         :bibframe/Instance,
   :rdfs/subPropertyOf :bibframe/relatedTo,
   :skos/definition    "Instance for which the described Item is an example."})

(def itemPortion
  "Number attached to a classification string that indicates a particular item."
  {:db/ident :bibframe/itemPortion,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Classification,
   :rdfs/label "Classification item number",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Number attached to a classification string that indicates a particular item."})

(def language
  "Language associated with a resource or its parts."
  {:db/ident         :bibframe/language,
   :dcterms/modified ["2022-10-03 (Removed range [GH70])" "2016-04-21 (New)"],
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :rdfs/Resource,
   :rdfs/label       "Language information",
   :rdfs/range       :rdfs/Resource,
   :skos/definition  "Language associated with a resource or its parts."})

(def lastIssue
  "Ending date of a resource and/or the sequential designations."
  {:db/ident :bibframe/lastIssue,
   :dcterms/modified ["2021-06-09 (Removed domain [GH76])" "2016-04-21 (New)"],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Multipart last issue",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Ending date of a resource and/or the sequential designations."})

(def layout
  "Arrangement of text, images, tactile notation, etc., in a resource."
  {:db/ident :bibframe/layout,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Layout",
   :rdfs/range :bibframe/Layout,
   :skos/definition
   "Arrangement of text, images, tactile notation, etc., in a resource."})

(def legalDate
  "Date of legal work, or promulgation of a law, or signing of a treaty."
  {:db/ident :bibframe/legalDate,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Work,
   :rdfs/label "Date of legal work",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :bibframe/date,
   :skos/definition
   "Date of legal work, or promulgation of a law, or signing of a treaty."})

(def mainTitle
  "Title being addressed. Possible title component."
  {:db/ident         :bibframe/mainTitle,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :bibframe/Title,
   :rdfs/label       "Main title",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "Title being addressed. Possible title component."})

(def material
  "Resource uses, is composed of, integrates, etc. the related material."
  {:db/ident :bibframe/material,
   :dcterms/modified "2021-06-09 (New [GH26])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work, Instance or Item",
   :rdfs/label "Material",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Resource uses, is composed of, integrates, etc. the related material."})

(def materialOf
  "This material is related to a resource."
  {:db/ident         :bibframe/materialOf,
   :dcterms/modified "2021-06-09 (New [GH26])",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Suggested use - With Work, Instance or Item",
   :rdfs/label       "Material of",
   :rdfs/range       :rdfs/Resource,
   :skos/definition  "This material is related to a resource."})

(def media
  "Categorization reflecting the general type of intermediation device required to view, play, run, etc., the content of a resource."
  {:db/ident :bibframe/media,
   :dcterms/modified ["2022-10-03 (Removed range [GH73])" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Media type",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Categorization reflecting the general type of intermediation device required to view, play, run, etc., the content of a resource."})

(def mergedToForm
  "One of two or more resources that come together to form a new resource."
  {:db/ident :bibframe/mergedToForm,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/mergerOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Merged to form",
   :rdfs/subPropertyOf :bibframe/succeededBy,
   :skos/definition
   "One of two or more resources that come together to form a new resource."})

(def mergerOf
  "One of two or more resources which came together to form a new resource."
  {:db/ident :bibframe/mergerOf,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/mergedToForm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Merger of",
   :rdfs/subPropertyOf :bibframe/precededBy,
   :skos/definition
   "One of two or more resources which came together to form a new resource."})

(def mount
  "Physical material or object used for the support or backing to which the base material of a resource has been attached."
  {:db/ident :bibframe/mount,
   :dcterms/modified ["2021-06-09 (Modified label [GH29])" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Mount material or object",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Physical material or object used for the support or backing to which the base material of a resource has been attached."})

(def musicFormat
  "Layout for content of a resource that is presented in the form of musical notation, such as full score, condensed score, vocal score, etc."
  {:db/ident :bibframe/musicFormat,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Format of notated music",
   :rdfs/range :bibframe/MusicFormat,
   :skos/definition
   "Layout for content of a resource that is presented in the form of musical notation, such as full score, condensed score, vocal score, etc."})

(def musicKey
  "Pitch and mode for music."
  {:db/ident         :bibframe/musicKey,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :bibframe/Work,
   :rdfs/label       "Music key",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "Pitch and mode for music."})

(def musicMedium
  "Instrumental, vocal, and/or other medium of performance for which a musical resource was originally conceived, written or performed."
  {:db/ident :bibframe/musicMedium,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Work,
   :rdfs/label "Music medium of performance",
   :rdfs/range :bibframe/MusicMedium,
   :skos/definition
   "Instrumental, vocal, and/or other medium of performance for which a musical resource was originally conceived, written or performed."})

(def musicOpusNumber
  "Numeric designation of a musical work assigned by a composer, publisher, or a musicologist."
  {:db/ident :bibframe/musicOpusNumber,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Work,
   :rdfs/label "Music opus number",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Numeric designation of a musical work assigned by a composer, publisher, or a musicologist."})

(def musicSerialNumber
  "Numeric designation for musical works consecutively numbered in music reference sources."
  {:db/ident :bibframe/musicSerialNumber,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Work,
   :rdfs/label "Music serial number",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Numeric designation for musical works consecutively numbered in music reference sources."})

(def musicThematicNumber
  "Numeric designation for a musical work as found in a thematic index for the composer."
  {:db/ident :bibframe/musicThematicNumber,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Work,
   :rdfs/label "Music thematic number",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Numeric designation for a musical work as found in a thematic index for the composer."})

(def natureOfContent
  "Characterization that epitomizes the primary content of a resource, e.g., field recording of birdsong; combined time series analysis and graph plotting system."
  {:db/ident :bibframe/natureOfContent,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Content nature",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Characterization that epitomizes the primary content of a resource, e.g., field recording of birdsong; combined time series analysis and graph plotting system."})

(def notation
  "Alphabet, script, or symbol system used to convey the content of the resource, including specialized scripts, typefaces, tactile notation, movement notation, and musical notation."
  {:db/ident :bibframe/notation,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Notation system",
   :rdfs/range :bibframe/Notation,
   :skos/definition
   "Alphabet, script, or symbol system used to convey the content of the resource, including specialized scripts, typefaces, tactile notation, movement notation, and musical notation."})

(def note
  "General textual information relating to a resource, such as Information about a specific copy of a resource or information about a particular attribute of a resource."
  {:db/ident :bibframe/note,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Note",
   :rdfs/range :bibframe/Note,
   :skos/definition
   "General textual information relating to a resource, such as Information about a specific copy of a resource or information about a particular attribute of a resource."})

(def noteFor
  "Relates a Note resource to the resource to which the note pertains."
  {:db/ident :bibframe/noteFor,
   :dcterms/modified "2021-06-09 (New [GH34])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Note,
   :rdfs/label "Note for",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Relates a Note resource to the resource to which the note pertains."})

(def noteType
  "Type of note."
  {:db/ident         :bibframe/noteType,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :bibframe/Note,
   :rdfs/label       "Note type",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "Type of note."})

(def originDate
  "Date or date range associated with the creation of a Work."
  {:db/ident :bibframe/originDate,
   :dcterms/modified
   ["2021-06-09 (Better align definition with property name [GH50])"
    "2016-04-21 (New)"],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Work,
   :rdfs/label "Origin date",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :bibframe/date,
   :skos/definition
   "Date or date range associated with the creation of a Work."})

(def originPlace
  "Place from which the creation of the resource originated."
  {:db/ident :bibframe/originPlace,
   :dcterms/modified
   ["2022-10-03 (updated domain [GH83])"
    "2021-06-09 (Better align definition with property name [GH50], Removed range [GH19])"
    "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Origin place",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :bibframe/place,
   :skos/definition
   "Place from which the creation of the resource originated."})

(def originalVersion
  "Resource is the original version of which this resource is a reproduction."
  {:db/ident :bibframe/originalVersion,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/originalVersionOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Original version",
   :rdfs/subPropertyOf :bibframe/derivativeOf,
   :skos/definition
   "Resource is the original version of which this resource is a reproduction."})

(def originalVersionOf
  "Original version of a resource."
  {:db/ident           :bibframe/originalVersionOf,
   :dcterms/modified   ["2016-04-29 (added inverse, updated range)"
                        "2016-04-21 (New)"],
   :owl/inverseOf      :bibframe/originalVersion,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       ["Suggested value - Work or Instance"
                        "Suggested use - With Work or Instance"],
   :rdfs/label         "Original version of",
   :rdfs/subPropertyOf :bibframe/hasDerivative,
   :skos/definition    "Original version of a resource."})

(def otherEdition
  "Resource has other available editions, for example simultaneously published language editions or reprints."
  {:db/ident :bibframe/otherEdition,
   :dcterms/modified ["2021-06-09 (Change subproperty to relatedTo [GH61])"
                      "2016-05-13 (symmetrical)"
                      "2016-04-21 (New)"],
   :rdf/type :owl/SymmetricProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Other edition",
   :rdfs/subPropertyOf :bibframe/relatedTo,
   :skos/definition
   "Resource has other available editions, for example simultaneously published language editions or reprints."})

(def otherPhysicalFormat
  "Resource that is manifested in another physical carrier."
  {:db/ident :bibframe/otherPhysicalFormat,
   :dcterms/modified ["2021-06-09 (Broadened domain [GH79])"
                      "2016-04-21 (New)"],
   :rdf/type :owl/SymmetricProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Has other physical format",
   :rdfs/range :bibframe/Instance,
   :rdfs/subPropertyOf :bibframe/hasEquivalent,
   :skos/definition "Resource that is manifested in another physical carrier."})

(def outerGRing
  "Coordinate pairs that identify the closed non-intersecting boundary of the area covered."
  {:db/ident :bibframe/outerGRing,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Cartographic,
   :rdfs/label "Cartographic outer G ring area covered",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Coordinate pairs that identify the closed non-intersecting boundary of the area covered."})

(def part
  "Part of a resource to which information applies."
  {:db/ident         :bibframe/part,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :rdfs/Resource,
   :rdfs/label       "Part",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "Part of a resource to which information applies."})

(def partName
  "Part or section name of a title. Possible title component."
  {:db/ident :bibframe/partName,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Title,
   :rdfs/label "Part title",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Part or section name of a title. Possible title component."})

(def partNumber
  "Part or section enumeration of a title. Possible title component."
  {:db/ident :bibframe/partNumber,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Title,
   :rdfs/label "Part number",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Part or section enumeration of a title. Possible title component."})

(def partOf
  "Resource in which the described resource is physically or logically contained."
  {:db/ident :bibframe/partOf,
   :dcterms/modified ["2016-04-29 (added inverse)"
                      "2016-04-21 (New)"
                      "2021-06-09 (Use with Event also [GH9])"],
   :owl/inverseOf :bibframe/hasPart,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work, Instance, Item or Event"
                  "Suggested use - With Work, Instance, Item or Event"],
   :rdfs/label "Is part of",
   :rdfs/subPropertyOf :bibframe/relatedTo,
   :skos/definition
   "Resource in which the described resource is physically or logically contained."})

(def pattern
  "Pattern of arrangement of materials within a unit."
  {:db/ident         :bibframe/pattern,
   :dcterms/modified ["2021-06-09 (Modified range [GH77])" "2016-04-21 (New)"],
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :bibframe/CollectionArrangement,
   :rdfs/label       "Arrangement of material",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "Pattern of arrangement of materials within a unit."})

(def physicalLocation
  "Location in the holding agency where the item is shelved or stored."
  {:db/ident :bibframe/physicalLocation,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Item,
   :rdfs/label "Storing or shelving location",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Location in the holding agency where the item is shelved or stored."})

(def place
  "Geographic location or place entity associated with a resource or element of description, such as the place associated with the publication, printing, distribution, issue, release or production of a resource, place of an event."
  {:db/ident :bibframe/place,
   :dcterms/modified ["2021-06-09 (Removed range [GH19])" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Place",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Geographic location or place entity associated with a resource or element of description, such as the place associated with the publication, printing, distribution, issue, release or production of a resource, place of an event."})

(def polarity
  "Relationship of the colors and tones in an image to the colors and tones of the object reproduced."
  {:db/ident :bibframe/polarity,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Polarity",
   :rdfs/range :bibframe/Polarity,
   :skos/definition
   "Relationship of the colors and tones in an image to the colors and tones of the object reproduced."})

(def precededBy
  "Resource that precedes the resource being described, e.g., is earlier in time or before in narrative."
  {:db/ident :bibframe/precededBy,
   :dcterms/modified ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/succeededBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Preceded by",
   :rdfs/subPropertyOf :bibframe/relatedTo,
   :skos/definition
   "Resource that precedes the resource being described, e.g., is earlier in time or before in narrative."})

(def preferredCitation
  "Citation to the resource preferred by its custodian of the resource."
  {:db/ident :bibframe/preferredCitation,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Preferred citation",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Citation to the resource preferred by its custodian of the resource."})

(def productionMethod
  "Process used to produce a resource."
  {:db/ident         :bibframe/productionMethod,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :bibframe/Instance,
   :rdfs/label       "Production method",
   :rdfs/range       :bibframe/ProductionMethod,
   :skos/definition  "Process used to produce a resource."})

(def projection
  "Method or system used to represent the surface of the earth or of a celestial sphere on a plane."
  {:db/ident :bibframe/projection,
   :dcterms/modified ["2017-02-03 (changed from data to object property)"
                      "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Cartographic,
   :rdfs/label "Cartographic projection",
   :rdfs/range :bibframe/Projection,
   :skos/definition
   "Method or system used to represent the surface of the earth or of a celestial sphere on a plane."})

(def projectionCharacteristic
  "Technical specification relating to the projection of a motion picture film."
  {:db/ident :bibframe/projectionCharacteristic,
   :dcterms/modified ["2017-02-03 (fixed typo in property name)"
                      "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Projection characteristic",
   :rdfs/range :bibframe/ProjectionCharacteristic,
   :skos/definition
   "Technical specification relating to the projection of a motion picture film."})

(def provisionActivity
  "Place, name, and/or date information relating to the publication, printing, distribution, issue, release, production, etc. of a resource."
  {:db/ident :bibframe/provisionActivity,
   :dcterms/modified
   ["2017-02-03 (revised label and slightly revised definition)"
    "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Provision activity",
   :rdfs/range :bibframe/ProvisionActivity,
   :skos/definition
   "Place, name, and/or date information relating to the publication, printing, distribution, issue, release, production, etc. of a resource."})

(def provisionActivityStatement
  "Statement relating to providers of a resource; usually transcribed."
  {:db/ident :bibframe/provisionActivityStatement,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Provider statement",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Statement relating to providers of a resource; usually transcribed."})

(def pubFrequency
  "Relates a resource to a publication frequency resource to capture such details as first issue, last issue, status, etc."
  {:db/ident :bibframe/pubFrequency,
   :dcterms/modified "2021-06-09 (New [GH76])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Publication frequency",
   :rdfs/range :bibframe/PubFrequency,
   :skos/definition
   "Relates a resource to a publication frequency resource to capture such details as first issue, last issue, status, etc."})

(def qualifier
  "Qualifier of information, such as an addition to a title to make it unique or qualifying information associated with an identifier."
  {:db/ident :bibframe/qualifier,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Qualifier",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Qualifier of information, such as an addition to a title to make it unique or qualifying information associated with an identifier."})

(def reductionRatio
  "Size of a micro-image in relation to the original from which it was produced."
  {:db/ident :bibframe/reductionRatio,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Reduction ratio",
   :rdfs/range :bibframe/ReductionRatio,
   :skos/definition
   "Size of a micro-image in relation to the original from which it was produced."})

(def referencedBy
  "Resource that references the described resource"
  {:db/ident           :bibframe/referencedBy,
   :dcterms/modified   ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf      :bibframe/references,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       ["Suggested value - Work, Instance or Item"
                        "Suggested use - With Work, Instance or Item"],
   :rdfs/label         "Referenced by",
   :rdfs/subPropertyOf :bibframe/relatedTo,
   :skos/definition    "Resource that references the described resource"})

(def references
  "Resource that is referenced by the described resource."
  {:db/ident :bibframe/references,
   :dcterms/modified ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/referencedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work, Instance or Item"
                  "Suggested use - With Work, Instance or Item"],
   :rdfs/label "References",
   :rdfs/subPropertyOf :bibframe/relatedTo,
   :skos/definition "Resource that is referenced by the described resource."})

(def relatedTo
  "Any relationship between Work, Instance, Item, and Event resources."
  {:db/ident :bibframe/relatedTo,
   :dcterms/modified ["2021-06-09 (Modified definition [GH2])"
                      "2016-04-21 (New)"],
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Related resource",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Any relationship between Work, Instance, Item, and Event resources."})

(def replacedBy
  "Later resource used in place of an earlier resource, usually because the later resource contains updated or new information."
  {:db/ident :bibframe/replacedBy,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2022-10-03 (corrected label [GH85])"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/replacementOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested use - With Work or Instance"
                  "Suggested value - Work or Instance"],
   :rdfs/label "Replaced by",
   :rdfs/subPropertyOf :bibframe/succeededBy,
   :skos/definition
   "Later resource used in place of an earlier resource, usually because the later resource contains updated or new information."})

(def replacementOf
  "Earlier resource whose content has been replaced by a later resource, usually because the later resource contains updated or new information."
  {:db/ident :bibframe/replacementOf,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2022-10-03 (corrected label [GH85])"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/replacedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested use - With Work or Instance"
                  "Suggested value - Work or Instance"],
   :rdfs/label "Replacement of",
   :rdfs/subPropertyOf :bibframe/precededBy,
   :skos/definition
   "Earlier resource whose content has been replaced by a later resource, usually because the later resource contains updated or new information."})

(def reproductionOf
  "Resource that is a reproduction of another Resource."
  {:db/ident           :bibframe/reproductionOf,
   :dcterms/modified   ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf      :bibframe/hasReproduction,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :bibframe/Instance,
   :rdfs/label         "Reproduction of",
   :rdfs/range         :bibframe/Instance,
   :rdfs/subPropertyOf :bibframe/hasEquivalent,
   :skos/definition    "Resource that is a reproduction of another Resource."})

(def responsibilityStatement
  "Statement relating to any persons, families, or corporate bodies responsible for the creation of, or contributing to the content of a resource; usually transcribed."
  {:db/ident :bibframe/responsibilityStatement,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Creative responsibility statement",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Statement relating to any persons, families, or corporate bodies responsible for the creation of, or contributing to the content of a resource; usually transcribed."})

(def review
  "Review of a resource."
  {:db/ident         :bibframe/review,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Suggested use - With Work or Instance",
   :rdfs/label       "Review content",
   :rdfs/range       :bibframe/Review,
   :skos/definition  "Review of a resource."})

(def role
  "Function provided by a contributor, e.g., author, illustrator, etc."
  {:db/ident :bibframe/role,
   :dcterms/modified
   ["2017-02-03 (Changed from data to object property, adjusted label and definition)"
    "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Contribution,
   :rdfs/label "Contributor role",
   :rdfs/range :bibframe/Role,
   :skos/definition
   "Function provided by a contributor, e.g., author, illustrator, etc."})

(def scale
  "Ratio of the dimensions of a form contained or embodied in a resource to the dimensions of the entity it represents, e.g., for images or cartographic resources."
  {:db/ident :bibframe/scale,
   :dcterms/modified ["2017-02-03 (changed from data to object property)"
                      "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Scale",
   :rdfs/range :bibframe/Scale,
   :skos/definition
   "Ratio of the dimensions of a form contained or embodied in a resource to the dimensions of the entity it represents, e.g., for images or cartographic resources."})

(def schedulePart
  "Designates whether the classification number is from the standard or optional part of a schedule or table."
  {:db/ident :bibframe/schedulePart,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Classification,
   :rdfs/label "Classification designation",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Designates whether the classification number is from the standard or optional part of a schedule or table."})

(def separatedFrom
  "Resource that spun off a part of its content to form a new resource."
  {:db/ident :bibframe/separatedFrom,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/continuedInPartBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Separated from",
   :rdfs/subPropertyOf :bibframe/precededBy,
   :skos/definition
   "Resource that spun off a part of its content to form a new resource."})

(def seriesEnumeration
  "Series enumeration of the resource; usually transcribed."
  {:db/ident :bibframe/seriesEnumeration,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Series enumeration",
   :rdfs/range :rdfs/Literal,
   :skos/definition "Series enumeration of the resource; usually transcribed."})

(def seriesOf
  "Resource that is a part of a larger resource."
  {:db/ident           :bibframe/seriesOf,
   :dcterms/modified   ["2016-04-29 (added inverse, updated range)"
                        "2016-04-21 (New)"],
   :owl/inverseOf      :bibframe/hasSeries,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       ["Suggested value - Work or Instance"
                        "Suggested use - With Work or Instance"],
   :rdfs/label         "Series container of",
   :rdfs/subPropertyOf :bibframe/hasPart,
   :skos/definition    "Resource that is a part of a larger resource."})

(def seriesStatement
  "Statement of the series the resource is in; usually transcribed; includes the ISSN if applicable."
  {:db/ident :bibframe/seriesStatement,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Series statement",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Statement of the series the resource is in; usually transcribed; includes the ISSN if applicable."})

(def shelfMark
  "Piece identifier, such as a call or other type of number."
  {:db/ident :bibframe/shelfMark,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Item,
   :rdfs/label "Shelf mark",
   :rdfs/range :bibframe/ShelfMark,
   :skos/definition
   "Piece identifier, such as a call or other type of number."})

(def soundCharacteristic
  "Technical specification relating to the encoding of sound in a resource."
  {:db/ident :bibframe/soundCharacteristic,
   :dcterms/modified ["2016-04-21 (fixed name and range typos)"
                      "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Sound characteristic",
   :rdfs/range :bibframe/SoundCharacteristic,
   :skos/definition
   "Technical specification relating to the encoding of sound in a resource."})

(def soundContent
  "Indication of whether the production of sound is an integral part of the resource."
  {:db/ident :bibframe/soundContent,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Sound content",
   :rdfs/range :bibframe/SoundContent,
   :skos/definition
   "Indication of whether the production of sound is an integral part of the resource."})

(def source
  "Resource from which value or label came or was derived, such as the formal source/scheme from which a classification number is taken or derived, list from which an agent name is taken or derived, source within which an identifier is unique."
  {:db/ident :bibframe/source,
   :dcterms/modified ["2021-06-09 (Removed range [GH63])" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Source",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Resource from which value or label came or was derived, such as the formal source/scheme from which a classification number is taken or derived, list from which an agent name is taken or derived, source within which an identifier is unique."})

(def spanEnd
  "Ending number of classification number span."
  {:db/ident         :bibframe/spanEnd,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :bibframe/Classification,
   :rdfs/label       "Classification number span end",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "Ending number of classification number span."})

(def splitInto
  "One of two or more resources resulting from the division of an earlier resource into separate resources."
  {:db/ident :bibframe/splitInto,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/continuesInPart,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Split into",
   :rdfs/subPropertyOf :bibframe/succeededBy,
   :skos/definition
   "One of two or more resources resulting from the division of an earlier resource into separate resources."})

(def status
  "Designation of the validity or position of something, such as indication that the classification number is canceled or invalid, circulation availability of an item, indication of whether the identifier is canceled or invalid."
  {:db/ident :bibframe/status,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Status",
   :rdfs/range :bibframe/Status,
   :skos/definition
   "Designation of the validity or position of something, such as indication that the classification number is canceled or invalid, circulation availability of an item, indication of whether the identifier is canceled or invalid."})

(def subject
  "Subject term(s) describing a resource."
  {:db/ident         :bibframe/subject,
   :dcterms/modified ["2021-06-09 (Broadened domain [GH21])"
                      "2016-04-21 (New)"],
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Suggested use - With Work, Instance, Item or Event",
   :rdfs/label       "Subject",
   :rdfs/range       :rdfs/Resource,
   :skos/definition  "Subject term(s) describing a resource."})

(def subjectOf
  "Relates a subject to that which it describes."
  {:db/ident         :bibframe/subjectOf,
   :dcterms/modified "2021-06-09 (New [GH20])",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Suggested value - Work, Instance, Item or Event",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/label       "Subject of",
   :skos/definition  "Relates a subject to that which it describes."})

(def sublocation
  "Specific place within the holding entity where the item is located or made available."
  {:db/ident :bibframe/sublocation,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Item,
   :rdfs/label "Held in sublocation",
   :rdfs/range :bibframe/Sublocation,
   :skos/definition
   "Specific place within the holding entity where the item is located or made available."})

(def subseriesEnumeration
  "Subseries enumeration of the resource; usually transcribed."
  {:db/ident :bibframe/subseriesEnumeration,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Subseries enumeration",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Subseries enumeration of the resource; usually transcribed."})

(def subseriesOf
  "Series resource of which the described resource is a part."
  {:db/ident :bibframe/subseriesOf,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/hasSubseries,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Subseries of",
   :rdfs/subPropertyOf :bibframe/hasPart,
   :skos/definition
   "Series resource of which the described resource is a part."})

(def subseriesStatement
  "Statement of the subseries the resource is in; usually transcribed; includes the ISSN if applicable."
  {:db/ident :bibframe/subseriesStatement,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Subseries statement",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Statement of the subseries the resource is in; usually transcribed; includes the ISSN if applicable."})

(def subtitle
  "Word, character, or group of words and/or characters that contains the remainder of the title after the main title. Possible title component."
  {:db/ident :bibframe/subtitle,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Title,
   :rdfs/label "Subtitle",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Word, character, or group of words and/or characters that contains the remainder of the title after the main title. Possible title component."})

(def succeededBy
  "Resource that succeeds the resource being described, e.g., later in time or after in a narrative."
  {:db/ident :bibframe/succeededBy,
   :dcterms/modified ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/precededBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Succeeded by",
   :rdfs/subPropertyOf :bibframe/relatedTo,
   :skos/definition
   "Resource that succeeds the resource being described, e.g., later in time or after in a narrative."})

(def summary
  "Summary or abstract of the resource described."
  {:db/ident         :bibframe/summary,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Suggested use - With Work or Instance",
   :rdfs/label       "Summary content",
   :rdfs/range       :bibframe/Summary,
   :skos/definition  "Summary or abstract of the resource described."})

(def supplement
  "Resource that updates or otherwise complements the predominant resource."
  {:db/ident :bibframe/supplement,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/supplementTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Supplement",
   :rdfs/subPropertyOf :bibframe/accompaniedBy,
   :skos/definition
   "Resource that updates or otherwise complements the predominant resource."})

(def supplementTo
  "Resource that is updated or otherwise complemented by the augmenting resource."
  {:db/ident :bibframe/supplementTo,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/supplement,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Supplement to",
   :rdfs/subPropertyOf :bibframe/accompanies,
   :skos/definition
   "Resource that is updated or otherwise complemented by the augmenting resource."})

(def supplementaryContent
  "Material such as an index, bibliography, appendix intended to supplement the primary content of a resource."
  {:db/ident :bibframe/supplementaryContent,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Supplementary material",
   :rdfs/range :bibframe/SupplementaryContent,
   :skos/definition
   "Material such as an index, bibliography, appendix intended to supplement the primary content of a resource."})

(def systemRequirement
  "Equipment or system requirement beyond what is normal and obvious for the type of carrier or type of file, such as make and model of equipment or hardware, operating system, amount of memory, programming language, other necessary software, any plug-ins or peripherals required to play, view, or run the resource, etc."
  {:db/ident :bibframe/systemRequirement,
   :dcterms/modified
   ["2017-02-06 (Changed from data to object property, changed property name from plural to singular)"
    "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Equipment or system requirements",
   :rdfs/range :bibframe/SystemRequirement,
   :skos/definition
   "Equipment or system requirement beyond what is normal and obvious for the type of carrier or type of file, such as make and model of equipment or hardware, operating system, amount of memory, programming language, other necessary software, any plug-ins or peripherals required to play, view, or run the resource, etc."})

(def table
  "Number of the table from which the classification number in a subdivision entry is taken, e.g., a DDC table."
  {:db/ident :bibframe/table,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Classification,
   :rdfs/label "Classification table identification",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Number of the table from which the classification number in a subdivision entry is taken, e.g., a DDC table."})

(def tableOfContents
  "Table of contents of the described resource."
  {:db/ident         :bibframe/tableOfContents,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Suggested use - With Work or Instance",
   :rdfs/label       "Table of contents content",
   :rdfs/range       :bibframe/TableOfContents,
   :skos/definition  "Table of contents of the described resource."})

(def tableSeq
  "Sequence number or other identifier for an internal classification sub arrangement or add in a classification scheme."
  {:db/ident :bibframe/tableSeq,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Classification,
   :rdfs/label "Classification table sequence number",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Sequence number or other identifier for an internal classification sub arrangement or add in a classification scheme."})

(def temporalCoverage
  "Time period coverage of the content of the resource."
  {:db/ident         :bibframe/temporalCoverage,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :bibframe/Work,
   :rdfs/label       "Temporal coverage",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "Time period coverage of the content of the resource."})

(def title
  "Name given to a resource."
  {:db/ident         :bibframe/title,
   :dcterms/modified ["2021-06-09 (Broadened domain [GH23])"
                      "2016-04-21 (New)"],
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Suggested use - With Work, Instance, Item or Event",
   :rdfs/label       "Title resource",
   :rdfs/range       :bibframe/Title,
   :skos/definition  "Name given to a resource."})

(def titleOf
  "Relates a title resource to that which it is the title of."
  {:db/ident :bibframe/titleOf,
   :dcterms/modified "2021-06-09 (New [GH22])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested value - Work, Instance, Item or Event",
   :rdfs/domain :bibframe/Title,
   :rdfs/label "Title of",
   :skos/definition
   "Relates a title resource to that which it is the title of."})

(def translation
  "Resource that translates the text of the source entity into a language different from that of the original."
  {:db/ident :bibframe/translation,
   :dcterms/modified ["2017-02-03 (corrected subproperty)"
                      "2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/translationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Translation as",
   :rdfs/subPropertyOf :bibframe/hasDerivative,
   :skos/definition
   "Resource that translates the text of the source entity into a language different from that of the original."})

(def translationOf
  "Resource that has been translated, i.e., the text is expressed in a language different from that of the original resource."
  {:db/ident :bibframe/translationOf,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2017-02-03 (corrected subproperty)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bibframe/translation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Translation of",
   :rdfs/subPropertyOf :bibframe/derivativeOf,
   :skos/definition
   "Resource that has been translated, i.e., the text is expressed in a language different from that of the original resource."})

(def unit
  "Units in which a value is expressed, such as the physical or logical constituent of a resource (e.g., a volume, audiocassette, film reel, a map, a digital file)."
  {:db/ident :bibframe/unit,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Type of unit",
   :rdfs/range :bibframe/Unit,
   :skos/definition
   "Units in which a value is expressed, such as the physical or logical constituent of a resource (e.g., a volume, audiocassette, film reel, a map, a digital file)."})

(def usageAndAccessPolicy
  "General statement of allowances and restrictions on access to a resource, including retention, reproduction, access, and lending."
  {:db/ident :bibframe/usageAndAccessPolicy,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work, Instance or Item",
   :rdfs/label "Use and access condition",
   :rdfs/range :bibframe/UsageAndAccessPolicy,
   :skos/definition
   "General statement of allowances and restrictions on access to a resource, including retention, reproduction, access, and lending."})

(def validDate
  "The date or date range during which the resource is accurate."
  {:db/ident :bibframe/validDate,
   :dcterms/modified "2022-10-03 (New [GH68])",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Work,
   :rdfs/label "Valid date",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :bibframe/date,
   :skos/definition
   "The date or date range during which the resource is accurate."})

(def variantType
  "Type of title variation, e.g., acronym, cover, spine, earlier, later, series version."
  {:db/ident :bibframe/variantType,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/VariantTitle,
   :rdfs/label "Variant title type",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Type of title variation, e.g., acronym, cover, spine, earlier, later, series version."})

(def version
  "Term or terms that identify works such as arranged for music, vulgate for religious work, etc."
  {:db/ident :bibframe/version,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bibframe/Work,
   :rdfs/label "Version",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Term or terms that identify works such as arranged for music, vulgate for religious work, etc."})

(def videoCharacteristic
  "Technical specification relating to the encoding of video images in a resource"
  {:db/ident :bibframe/videoCharacteristic,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Instance,
   :rdfs/label "Video characteristic",
   :rdfs/range :bibframe/VideoCharacteristic,
   :skos/definition
   "Technical specification relating to the encoding of video images in a resource"})

(def voice
  "Voice for which a musical work is appropriate, such as soprano, tenor, mixed."
  {:db/ident :bibframe/voice,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bibframe/Work,
   :rdfs/label "Voice",
   :rdfs/range :bibframe/MusicVoice,
   :skos/definition
   "Voice for which a musical work is appropriate, such as soprano, tenor, mixed."})

(def voiceType
  "Specific type of voice group, such as chorus, solo."
  {:db/ident         :bibframe/voiceType,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :bibframe/MusicVoice,
   :rdfs/label       "Type of voice",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "Specific type of voice group, such as chorus, solo."})