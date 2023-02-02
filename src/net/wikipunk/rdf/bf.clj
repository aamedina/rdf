(ns net.wikipunk.rdf.bf
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
   :rdf/ns-prefix-map {"bf"      "http://id.loc.gov/ontologies/bibframe/",
                       "bflc"    "http://id.loc.gov/ontologies/bflc/",
                       "cc"      "http://creativecommons.org/ns#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://id.loc.gov/ontologies/bibframe/",
   :rdfa/prefix "bf",
   :rdfa/uri "http://id.loc.gov/ontologies/bibframe/",
   :rdfs/label "BIBFRAME vocabulary"}
  (:refer-clojure :exclude [agent binding count]))

(def AbbreviatedTitle
  "Title as abbreviated for citation, indexing, and/or identification."
  {:db/ident :bf/AbbreviatedTitle,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Abbreviated title",
   :rdfs/subClassOf :bf/VariantTitle,
   :skos/definition
   "Title as abbreviated for citation, indexing, and/or identification."})

(def AccessPolicy
  "Access restrictions and allowances regarding access to a resource, e.g., lending policy, access restrictions, embargos."
  {:db/ident :bf/AccessPolicy,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Access policy",
   :rdfs/subClassOf :bf/UsageAndAccessPolicy,
   :skos/definition
   "Access restrictions and allowances regarding access to a resource, e.g., lending policy, access restrictions, embargos."})

(def AccessionNumber
  "Accession Number"
  {:db/ident         :bf/AccessionNumber,
   :dcterms/modified "2021-06-09 (New [GH11])",
   :rdf/type         :owl/Class,
   :rdfs/label       "Accession number",
   :rdfs/subClassOf  :bf/Identifier,
   :skos/definition  "Accession Number"})

(def AcquisitionSource
  "Information about an organization, person, etc., from which a resource may be obtained."
  {:db/ident :bf/AcquisitionSource,
   :dcterms/modified "2017-02-06 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Acquisition source",
   :skos/definition
   "Information about an organization, person, etc., from which a resource may be obtained."})

(def AdminMetadata
  "Metadata about the metadata, especially provenance information."
  {:db/ident :bf/AdminMetadata,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Administrative metadata",
   :skos/definition
   "Metadata about the metadata, especially provenance information."})

(def Agent
  "Entity having a role in a resource, such as a person or organization."
  {:db/ident :bf/Agent,
   :dcterms/modified ["2016-05-13 (New subclass)" "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Agent",
   :rdfs/subClassOf :foaf/Agent,
   :skos/definition
   "Entity having a role in a resource, such as a person or organization."})

(def Ansi
  "American National Standards Institute identifier."
  {:db/ident         :bf/Ansi,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "ANSI number",
   :rdfs/subClassOf  :bf/Identifier,
   :skos/definition  "American National Standards Institute identifier."})

(def AppliedMaterial
  "Physical or chemical substance applied to a base material of a resource."
  {:db/ident :bf/AppliedMaterial,
   :dcterms/modified ["2021-06-09 (Changed subclass to Material [GH28])"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Applied material",
   :rdfs/subClassOf :bf/Material,
   :skos/definition
   "Physical or chemical substance applied to a base material of a resource."})

(def Archival
  "Resources organically created, accumulated, and/or used by a person, family, or organization in the course of conduct of affairs and preserved because of their continuing value."
  {:db/ident :bf/Archival,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Archival controlled",
   :rdfs/subClassOf :bf/Instance,
   :skos/definition
   "Resources organically created, accumulated, and/or used by a person, family, or organization in the course of conduct of affairs and preserved because of their continuing value."})

(def Arrangement
  "Resource that represents an arrangement of another resource."
  {:db/ident :bf/Arrangement,
   :dcterms/modified ["2021-06-09 (Redefined [GH77])" "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Arrangement",
   :rdfs/subClassOf :bf/Work,
   :skos/definition
   "Resource that represents an arrangement of another resource."})

(def AspectRatio
  "Proportional relationship between an image's width and its height."
  {:db/ident :bf/AspectRatio,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Aspect ratio",
   :skos/definition
   "Proportional relationship between an image's width and its height."})

(def Audio
  "Resources expressed in an audible form, including music or other sounds."
  {:db/ident :bf/Audio,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Audio",
   :rdfs/subClassOf :bf/Work,
   :skos/definition
   "Resources expressed in an audible form, including music or other sounds."})

(def AudioIssueNumber
  "Number assigned by publishers of sound recordings to identify the issue designation, or serial identification, of the resource."
  {:db/ident :bf/AudioIssueNumber,
   :dcterms/modified ["2017-02-03 (Revised property name and definition)"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Audio issue number",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "Number assigned by publishers of sound recordings to identify the issue designation, or serial identification, of the resource."})

(def AudioTake
  "Identifier assigned to the smallest identifiable unit of a recording session, e.g., a specific recording of an individual song."
  {:db/ident :bf/AudioTake,
   :dcterms/modified "2017-02-03 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Audio recording take",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "Identifier assigned to the smallest identifiable unit of a recording session, e.g., a specific recording of an individual song."})

(def Barcode
  "Optical machine-readable representation of data relating to the item to which it is attached."
  {:db/ident :bf/Barcode,
   :dcterms/modified
   ["2017-02-03 (Moved to Identifier class group from Item group)"
    "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Barcode",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "Optical machine-readable representation of data relating to the item to which it is attached."})

(def BaseMaterial
  "Underlying physical material of a resource."
  {:db/ident         :bf/BaseMaterial,
   :dcterms/modified ["2021-06-09 (Changed subclass to Material [GH28])"
                      "2016-04-21 (New)"],
   :rdf/type         :owl/Class,
   :rdfs/label       "Base material",
   :rdfs/subClassOf  :bf/Material,
   :skos/definition  "Underlying physical material of a resource."})

(def Binding
  "Information about methods used to bind a published or unpublished resource, or other binding information."
  {:db/ident :bf/Binding,
   :dcterms/modified "2022-10-03 (New [GH91])",
   :rdf/type :owl/Class,
   :rdfs/label "Binding method",
   :skos/definition
   "Information about methods used to bind a published or unpublished resource, or other binding information."})

(def BookFormat
  "Result of folding a printed sheet to form a gathering of leaves."
  {:db/ident :bf/BookFormat,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Book format",
   :skos/definition
   "Result of folding a printed sheet to form a gathering of leaves."})

(def BroadcastStandard
  "System used to format a video resource for television broadcast, e.g., HDTV, PAL."
  {:db/ident :bf/BroadcastStandard,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Broadcast standard",
   :rdfs/subClassOf :bf/VideoCharacteristic,
   :skos/definition
   "System used to format a video resource for television broadcast, e.g., HDTV, PAL."})

(def Capture
  "Information about place and date associated with the capture (i.e., recording, filming, etc.) of the content of a resource."
  {:db/ident :bf/Capture,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Capture of content",
   :skos/definition
   "Information about place and date associated with the capture (i.e., recording, filming, etc.) of the content of a resource."})

(def Carrier
  "Categorization reflecting the format of the storage medium and housing of a carrier."
  {:db/ident :bf/Carrier,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Carrier type",
   :skos/definition
   "Categorization reflecting the format of the storage medium and housing of a carrier."})

(def Cartographic
  "Content that represents the whole or part of the earth, any celestial body, or imaginary place at any scale."
  {:db/ident :bf/Cartographic,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Cartographic information",
   :skos/definition
   "Content that represents the whole or part of the earth, any celestial body, or imaginary place at any scale."})

(def CartographicDataType
  "Data type for encoding of geospatial information in a cartographic resource, e.g., raster, vector, point."
  {:db/ident :bf/CartographicDataType,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Digital cartographic data type",
   :rdfs/subClassOf :bf/DigitalCharacteristic,
   :skos/definition
   "Data type for encoding of geospatial information in a cartographic resource, e.g., raster, vector, point."})

(def CartographicObjectType
  "Object type for encoding of geospatial information in a cartographic resource, e.g., point, line, polygon."
  {:db/ident :bf/CartographicObjectType,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Digital cartographic object type",
   :rdfs/subClassOf :bf/DigitalCharacteristic,
   :skos/definition
   "Object type for encoding of geospatial information in a cartographic resource, e.g., point, line, polygon."})

(def Cartography
  "Resource that shows spatial information, including maps, atlases, globes, digital, and other cartographic resources."
  {:db/ident :bf/Cartography,
   :dcterms/modified "2016-04-25 (fixed typo in definition)",
   :rdf/type :owl/Class,
   :rdfs/label "Cartography",
   :rdfs/subClassOf :bf/Work,
   :skos/definition
   "Resource that shows spatial information, including maps, atlases, globes, digital, and other cartographic resources."})

(def Chronology
  "Dates associated with issues or items held."
  {:db/ident         :bf/Chronology,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Chronology",
   :rdfs/subClassOf  :bf/EnumerationAndChronology,
   :skos/definition  "Dates associated with issues or items held."})

(def Classification
  "System of coding and organizing materials according to their subject."
  {:db/ident :bf/Classification,
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
  {:db/ident :bf/ClassificationDdc,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "DDC Classification",
   :rdfs/subClassOf :bf/Classification,
   :skos/definition
   "Dewey Decimal Classification number used for subject access."})

(def ClassificationLcc
  "Library of Congress Classification number used for subject access."
  {:db/ident :bf/ClassificationLcc,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "LCC Classification",
   :rdfs/subClassOf :bf/Classification,
   :skos/definition
   "Library of Congress Classification number used for subject access."})

(def ClassificationNlm
  "National Library of Medicine Classification number used for subject access"
  {:db/ident :bf/ClassificationNlm,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "NLM classification",
   :rdfs/subClassOf :bf/Classification,
   :skos/definition
   "National Library of Medicine Classification number used for subject access"})

(def ClassificationUdc
  "Universal Decimal Classification number used for subject access."
  {:db/ident :bf/ClassificationUdc,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "UDC Classification",
   :rdfs/subClassOf :bf/Classification,
   :skos/definition
   "Universal Decimal Classification number used for subject access."})

(def Coden
  "Identifier for scientific and technical periodical titles assigned by the International CODEN Section of Chemical Abstracts Service."
  {:db/ident :bf/Coden,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "CODEN",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "Identifier for scientific and technical periodical titles assigned by the International CODEN Section of Chemical Abstracts Service."})

(def Collection
  "Aggregation of resources, generally gathered together artificially."
  {:db/ident :bf/Collection,
   :dcterms/modified ["2022-10-03 (changed subClassOf [GH92])"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Collection",
   :rdfs/subClassOf :bf/Work,
   :skos/definition
   "Aggregation of resources, generally gathered together artificially."})

(def CollectionArrangement
  "Information about the organization and arrangement of a collection of items. For instance, for computer files, organization and arrangement information may be the file structure and sort sequence of a file; for visual materials, this information may be how a collection is arranged."
  {:db/ident :bf/CollectionArrangement,
   :dcterms/modified "2021-06-09 (New [GH77])",
   :rdf/type :owl/Class,
   :rdfs/label "Organization of materials information",
   :skos/definition
   "Information about the organization and arrangement of a collection of items. For instance, for computer files, organization and arrangement information may be the file structure and sort sequence of a file; for visual materials, this information may be how a collection is arranged."})

(def CollectiveTitle
  "Title for a compilation of resources."
  {:db/ident         :bf/CollectiveTitle,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Collective title",
   :rdfs/subClassOf  :bf/VariantTitle,
   :skos/definition  "Title for a compilation of resources."})

(def ColorContent
  "Color characteristics of a resource, e.g., black and white, multicolored, etc."
  {:db/ident :bf/ColorContent,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Color content",
   :skos/definition
   "Color characteristics of a resource, e.g., black and white, multicolored, etc."})

(def Content
  "Categorization reflecting the fundamental form of communication in which the content is expressed and the human sense through which it is intended to be perceived."
  {:db/ident :bf/Content,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Content type",
   :skos/definition
   "Categorization reflecting the fundamental form of communication in which the content is expressed and the human sense through which it is intended to be perceived."})

(def ContentAccessibility
  "Information that assists those with a sensory impairment for greater understanding of content, e.g., captions."
  {:db/ident :bf/ContentAccessibility,
   :dcterms/modified "2017-02-07 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Content accessibility information",
   :skos/definition
   "Information that assists those with a sensory impairment for greater understanding of content, e.g., captions."})

(def Contribution
  "Agent and role with respect to the resource being described."
  {:db/ident :bf/Contribution,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Contribution",
   :skos/definition
   "Agent and role with respect to the resource being described."})

(def CopyrightNumber
  "Identifier assigned to a copyright registration or legal deposit."
  {:db/ident :bf/CopyrightNumber,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Copyright-legal deposit number",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "Identifier assigned to a copyright registration or legal deposit."})

(def CopyrightRegistration
  "Copyright or Legal Deposit registration information"
  {:db/ident         :bf/CopyrightRegistration,
   :dcterms/modified ["2016-05-04 (Class name corrected)" "2016-04-21 (New)"],
   :rdf/type         :owl/Class,
   :rdfs/label       "Copyright registration",
   :skos/definition  "Copyright or Legal Deposit registration information"})

(def CoverArt
  "Cover illustration of a resource."
  {:db/ident         :bf/CoverArt,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Cover art",
   :skos/definition  "Cover illustration of a resource."})

(def Dataset
  "Data encoded in a defined structure. Includes numeric data, environmental data,etc., used by applications software to calculate averages, correlations, etc., or to produce models, etc., but not normally displayed in its raw form."
  {:db/ident :bf/Dataset,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Dataset",
   :rdfs/subClassOf :bf/Work,
   :skos/definition
   "Data encoded in a defined structure. Includes numeric data, environmental data,etc., used by applications software to calculate averages, correlations, etc., or to produce models, etc., but not normally displayed in its raw form."})

(def DescriptionAuthentication
  "Indication of specific types of reviews that have been carried out on the description information."
  {:db/ident :bf/DescriptionAuthentication,
   :dcterms/modified ["2022-10-03 (removed subClassOf [GH90])"
                      "2016-04-29 (fixed class name)"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Metadata authentication",
   :skos/definition
   "Indication of specific types of reviews that have been carried out on the description information."})

(def DescriptionConventions
  "Rules used for the descriptive content of the resource description."
  {:db/ident :bf/DescriptionConventions,
   :dcterms/modified ["2022-10-03 (removed subClassOf [GH90])"
                      "2016-04-24 (fixed class name)"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Description conventions",
   :skos/definition
   "Rules used for the descriptive content of the resource description."})

(def DescriptionLevel
  "Designation of the descriptive content of the metadata."
  {:db/ident         :bf/DescriptionLevel,
   :dcterms/modified "2022-10-03 (New [GH43])",
   :rdf/type         :owl/Class,
   :rdfs/label       "Description level",
   :skos/definition  "Designation of the descriptive content of the metadata."})

(def DigitalCharacteristic
  "Technical specification relating to the digital encoding of text, image, audio, video, and other types of data in a resource."
  {:db/ident :bf/DigitalCharacteristic,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Digital characteristic",
   :skos/definition
   "Technical specification relating to the digital encoding of text, image, audio, video, and other types of data in a resource."})

(def Dissertation
  "Information about a work presented as part of the formal requirements for an academic degree."
  {:db/ident :bf/Dissertation,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Dissertation information",
   :skos/definition
   "Information about a work presented as part of the formal requirements for an academic degree."})

(def DissertationIdentifier
  "Identifier assigned to a thesis or dissertation for identification purposes ."
  {:db/ident :bf/DissertationIdentifier,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Dissertation Identifier",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "Identifier assigned to a thesis or dissertation for identification purposes ."})

(def Distribution
  "Information relating to distribution of a resource."
  {:db/ident         :bf/Distribution,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Distributor",
   :rdfs/subClassOf  :bf/ProvisionActivity,
   :skos/definition  "Information relating to distribution of a resource."})

(def Doi
  "Digital Object Identifier."
  {:db/ident         :bf/Doi,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "DOI",
   :rdfs/subClassOf  :bf/Identifier,
   :skos/definition  "Digital Object Identifier."})

(def Ean
  "International Article Identifier."
  {:db/ident         :bf/Ean,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "EAN",
   :rdfs/subClassOf  :bf/Identifier,
   :skos/definition  "International Article Identifier."})

(def Eidr
  "Entertainment Identifier Registry"
  {:db/ident         :bf/Eidr,
   :dcterms/modified "2021-06-09 (New [GH78])",
   :rdf/type         :owl/Class,
   :rdfs/label       "EIDR",
   :rdfs/subClassOf  :bf/Identifier,
   :skos/definition  "Entertainment Identifier Registry"})

(def Electronic
  "Resource that is intended for manipulation by a computer, accessed either directly or remotely."
  {:db/ident :bf/Electronic,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Electronic",
   :rdfs/subClassOf :bf/Instance,
   :skos/definition
   "Resource that is intended for manipulation by a computer, accessed either directly or remotely."})

(def Emulsion
  "Suspension of light-sensitive chemicals used as a coating on a microfilm or microfiche, e.g., silver halide."
  {:db/ident :bf/Emulsion,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Emulsion",
   :skos/definition
   "Suspension of light-sensitive chemicals used as a coating on a microfilm or microfiche, e.g., silver halide."})

(def EncodedBitrate
  "Speed at which streaming audio, video, etc., is designed to play, e.g., 32 kbps."
  {:db/ident :bf/EncodedBitrate,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Encoded bitrate",
   :rdfs/subClassOf :bf/DigitalCharacteristic,
   :skos/definition
   "Speed at which streaming audio, video, etc., is designed to play, e.g., 32 kbps."})

(def EncodingFormat
  "Schema, standard, etc., used to encode the digital content of a resource, e.g., MP3, XML, JPEG."
  {:db/ident :bf/EncodingFormat,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Encoding format",
   :rdfs/subClassOf :bf/DigitalCharacteristic,
   :skos/definition
   "Schema, standard, etc., used to encode the digital content of a resource, e.g., MP3, XML, JPEG."})

(def Ensemble
  "Ensemble"
  {:db/ident         :bf/Ensemble,
   :dcterms/modified "2021-06-09 (New [GH56])",
   :rdf/type         :owl/Class,
   :rdfs/label       "Ensemble",
   :skos/definition  "Ensemble"})

(def Enumeration
  "Numbering or other enumeration associated with issues or items held."
  {:db/ident :bf/Enumeration,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Enumeration",
   :rdfs/subClassOf :bf/EnumerationAndChronology,
   :skos/definition
   "Numbering or other enumeration associated with issues or items held."})

(def EnumerationAndChronology
  "Numbering or other enumeration and dates associated with issues or items held."
  {:db/ident :bf/EnumerationAndChronology,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Enumeration and chronology",
   :skos/definition
   "Numbering or other enumeration and dates associated with issues or items held."})

(def Event
  "Something that happens at a certain time and location, such as a performance, speech, or athletic event."
  {:db/ident :bf/Event,
   :dcterms/modified ["2021-06-09 (Broaden definition [GH12])"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Event entity",
   :skos/definition
   "Something that happens at a certain time and location, such as a performance, speech, or athletic event."})

(def Extent
  "Number and type of units and/or subunits making up a resource."
  {:db/ident :bf/Extent,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Extent",
   :skos/definition
   "Number and type of units and/or subunits making up a resource."})

(def Family
  "Two or more persons related by birth, marriage, adoption, civil union, or similar legal status, or who otherwise present themselves as a family."
  {:db/ident :bf/Family,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Family",
   :rdfs/subClassOf :bf/Agent,
   :skos/definition
   "Two or more persons related by birth, marriage, adoption, civil union, or similar legal status, or who otherwise present themselves as a family."})

(def FileSize
  "Number of bytes in a digital file, e.g., 162 KB."
  {:db/ident         :bf/FileSize,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "File size",
   :rdfs/subClassOf  :bf/DigitalCharacteristic,
   :skos/definition  "Number of bytes in a digital file, e.g., 162 KB."})

(def FileType
  "General type of data content encoded in a computer file, e.g., text file, audio file."
  {:db/ident :bf/FileType,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "File type",
   :rdfs/subClassOf :bf/DigitalCharacteristic,
   :skos/definition
   "General type of data content encoded in a computer file, e.g., text file, audio file."})

(def Fingerprint
  "Identifier that is used to assist in the identification of antiquarian books by recording information comprising groups of characters taken from specified positions on specified pages of the book."
  {:db/ident :bf/Fingerprint,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Fingerprint identifier",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "Identifier that is used to assist in the identification of antiquarian books by recording information comprising groups of characters taken from specified positions on specified pages of the book."})

(def FontSize
  "Size of the type used to represent the characters and symbols in a resource."
  {:db/ident :bf/FontSize,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Font size",
   :skos/definition
   "Size of the type used to represent the characters and symbols in a resource."})

(def Frequency
  "Information about intervals at which the parts of a serially produced resource or the updates to an integrating resource are issued."
  {:db/ident :bf/Frequency,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Frequency",
   :skos/definition
   "Information about intervals at which the parts of a serially produced resource or the updates to an integrating resource are issued."})

(def Generation
  "Relationship between an original carrier and the carrier of a reproduction made from the original."
  {:db/ident :bf/Generation,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Generation",
   :skos/definition
   "Relationship between an original carrier and the carrier of a reproduction made from the original."})

(def GenerationProcess
  "Indication of the program or process used to generate the description by application of a particular transformation."
  {:db/ident :bf/GenerationProcess,
   :dcterms/modified ["2022-10-03 (removed subClassOf [GH90])"
                      "2016-04-24 (fixed class name)"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Generation process",
   :skos/definition
   "Indication of the program or process used to generate the description by application of a particular transformation."})

(def GenreForm
  "Form category or genre to which a resource belongs."
  {:db/ident         :bf/GenreForm,
   :dcterms/modified ["2021-06-09 (Broaden definition [GH17])"
                      "2016-04-21 (New)"],
   :rdf/type         :owl/Class,
   :rdfs/label       "Genre/form",
   :skos/definition  "Form category or genre to which a resource belongs."})

(def GeographicCoverage
  "Geographic coverage of the content of the resource."
  {:db/ident         :bf/GeographicCoverage,
   :dcterms/modified "2017-02-06 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Geographic coverage",
   :skos/definition  "Geographic coverage of the content of the resource."})

(def GrooveCharacteristic
  "Groove width of an analog disc or the groove pitch of an analog cylinder, e.g., coarse groove, microgroove"
  {:db/ident :bf/GrooveCharacteristic,
   :dcterms/modified ["2017-02-03 (Fixed name of property)"
                      "2016-04-26 (fixed typo in definition)"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Groove characteristic",
   :rdfs/subClassOf :bf/SoundCharacteristic,
   :skos/definition
   "Groove width of an analog disc or the groove pitch of an analog cylinder, e.g., coarse groove, microgroove"})

(def Gtin14Number
  "14 digit number assigned to identify trade items as various packaging levels. GTIN-14 encompasses EAN/UCC-128 and ITF-14."
  {:db/ident :bf/Gtin14Number,
   :dcterms/modified "2017-02-03 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Global Trade Item Number 14",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "14 digit number assigned to identify trade items as various packaging levels. GTIN-14 encompasses EAN/UCC-128 and ITF-14."})

(def Hdl
  "Unique and persistent identifier for digital objects developed by the Corporation for National Research Initiatives."
  {:db/ident :bf/Hdl,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Handle",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "Unique and persistent identifier for digital objects developed by the Corporation for National Research Initiatives."})

(def Hub
  "An abstract resource that functions as a bridge between two Works."
  {:db/ident :bf/Hub,
   :dcterms/modified "2021-06-09 (New [GH75])",
   :rdf/type :owl/Class,
   :rdfs/label "Hub",
   :rdfs/subClassOf :bf/Work,
   :skos/definition
   "An abstract resource that functions as a bridge between two Works."})

(def Identifier
  "Token or name that is associated with a resource, such as a URI or an ISBN."
  {:db/ident :bf/Identifier,
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
  {:db/ident :bf/Illustration,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Illustrative content",
   :skos/definition
   "Information about content intended to illustrate a resource."})

(def ImmediateAcquisition
  "Information about the circumstances, e.g., source, date, method, under which the resource was directly acquired."
  {:db/ident :bf/ImmediateAcquisition,
   :dcterms/modified "2017-02-06 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Immediate acquisition",
   :skos/definition
   "Information about the circumstances, e.g., source, date, method, under which the resource was directly acquired."})

(def Instance
  "Resource reflecting an individual, material embodiment of a Work."
  {:db/ident :bf/Instance,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Instance",
   :skos/definition
   "Resource reflecting an individual, material embodiment of a Work."})

(def Integrating
  "Resource that is added to or changed by updates that do not remain discrete but are integrated into the whole."
  {:db/ident :bf/Integrating,
   :dcterms/modified "2022-10-03 (New [GH91])",
   :rdf/type :owl/Class,
   :rdfs/label "Integrating resource",
   :rdfs/subClassOf :bf/Work,
   :skos/definition
   "Resource that is added to or changed by updates that do not remain discrete but are integrated into the whole."})

(def IntendedAudience
  "Information that identifies the specific intended or target audience or intellectual level for which the content described is considered appropriate. Also used to record interest and motivation levels and special learner characteristics."
  {:db/ident :bf/IntendedAudience,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Intended audience information",
   :skos/definition
   "Information that identifies the specific intended or target audience or intellectual level for which the content described is considered appropriate. Also used to record interest and motivation levels and special learner characteristics."})

(def Isan
  "International Standard Audiovisual Number."
  {:db/ident         :bf/Isan,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "ISAN",
   :rdfs/subClassOf  :bf/Identifier,
   :skos/definition  "International Standard Audiovisual Number."})

(def Isbn
  "International Standard Book Number."
  {:db/ident         :bf/Isbn,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "ISBN",
   :rdfs/subClassOf  :bf/Identifier,
   :skos/definition  "International Standard Book Number."})

(def Ismn
  "International Standard Music Number."
  {:db/ident         :bf/Ismn,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "ISMN",
   :rdfs/subClassOf  :bf/Identifier,
   :skos/definition  "International Standard Music Number."})

(def Isni
  "International Standard Name Identifier, a unique, persistent reference number for the identities of contributors to creative works."
  {:db/ident :bf/Isni,
   :dcterms/modified "2017-02-03 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "ISNI",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "International Standard Name Identifier, a unique, persistent reference number for the identities of contributors to creative works."})

(def Iso
  "International Organization for Standardization standard number."
  {:db/ident :bf/Iso,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "ISO number",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "International Organization for Standardization standard number."})

(def Isrc
  "International Standard Recording Code."
  {:db/ident         :bf/Isrc,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "ISRC",
   :rdfs/subClassOf  :bf/Identifier,
   :skos/definition  "International Standard Recording Code."})

(def Issn
  "International Standard Serial Number."
  {:db/ident         :bf/Issn,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "ISSN",
   :rdfs/subClassOf  :bf/Identifier,
   :skos/definition  "International Standard Serial Number."})

(def IssnL
  "International Standard Serial Number that links together various media versions of a continuing resource."
  {:db/ident :bf/IssnL,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "ISSN-L",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "International Standard Serial Number that links together various media versions of a continuing resource."})

(def Issuance
  "Information about whether a resource is issued in one or more parts, the way it is updated, and its intended termination."
  {:db/ident :bf/Issuance,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Mode of issuance",
   :skos/definition
   "Information about whether a resource is issued in one or more parts, the way it is updated, and its intended termination."})

(def Istc
  "International Standard Text Code, a numbering system developed to enable the unique identification of textual works."
  {:db/ident :bf/Istc,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "ISTC",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "International Standard Text Code, a numbering system developed to enable the unique identification of textual works."})

(def Iswc
  "International Standard Musical Work Code, a unique, persistent reference number for the identification of musical works."
  {:db/ident :bf/Iswc,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "ISWC",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "International Standard Musical Work Code, a unique, persistent reference number for the identification of musical works."})

(def Item
  "Single example of an Instance."
  {:db/ident         :bf/Item,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Item",
   :skos/definition  "Single example of an Instance."})

(def Jurisdiction
  "Legal or political unit administering a geographic area."
  {:db/ident :bf/Jurisdiction,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Jurisdiction",
   :rdfs/subClassOf :bf/Agent,
   :skos/definition "Legal or political unit administering a geographic area."})

(def KeyTitle
  "Unique title for a continuing resource that is assigned by the ISSN International Center in conjunction with an ISSN."
  {:db/ident :bf/KeyTitle,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Key title",
   :rdfs/subClassOf :bf/VariantTitle,
   :skos/definition
   "Unique title for a continuing resource that is assigned by the ISSN International Center in conjunction with an ISSN."})

(def Kit
  "Resource that contains a mixture of various components issued as a unit and intended primarily for instructional purposes."
  {:db/ident :bf/Kit,
   :dcterms/modified "2022-10-03 (New [GH91])",
   :rdf/type :owl/Class,
   :rdfs/label "Kit",
   :rdfs/subClassOf :bf/MixedMaterial,
   :skos/definition
   "Resource that contains a mixture of various components issued as a unit and intended primarily for instructional purposes."})

(def Language
  "Language entity."
  {:db/ident         :bf/Language,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Language entity",
   :skos/definition  "Language entity."})

(def Layout
  "Arrangement of text, images, tactile notation, etc., in a resource."
  {:db/ident :bf/Layout,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Layout",
   :skos/definition
   "Arrangement of text, images, tactile notation, etc., in a resource."})

(def LcOverseasAcq
  "Identification number assigned by the Library of Congress to works acquired through one of its collaborative overseas acquisition programs."
  {:db/ident :bf/LcOverseasAcq,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "LC acquisition program",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "Identification number assigned by the Library of Congress to works acquired through one of its collaborative overseas acquisition programs."})

(def Lccn
  "Library of Congress Control Number that identifies a resource description."
  {:db/ident :bf/Lccn,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "LCCN",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "Library of Congress Control Number that identifies a resource description."})

(def Local
  "Identifier established locally and not a standard number."
  {:db/ident :bf/Local,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Local identifier",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "Identifier established locally and not a standard number."})

(def Manufacture
  "Information relating to manufacture of a resource."
  {:db/ident         :bf/Manufacture,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Manufacturer",
   :rdfs/subClassOf  :bf/ProvisionActivity,
   :skos/definition  "Information relating to manufacture of a resource."})

(def Manuscript
  "Resource which is written in handwriting or typescript. These are generally unique resources."
  {:db/ident :bf/Manuscript,
   :dcterms/modified ["2022-10-03 (changed subClassOf [GH92])"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Manuscript",
   :rdfs/subClassOf :bf/Work,
   :skos/definition
   "Resource which is written in handwriting or typescript. These are generally unique resources."})

(def Material
  "Substance or composition of the resource."
  {:db/ident         :bf/Material,
   :dcterms/modified "2021-06-09 (New [GH28])",
   :rdf/type         :owl/Class,
   :rdfs/label       "Material",
   :skos/definition  "Substance or composition of the resource."})

(def MatrixNumber
  "Matrix identifier assigned to the master from which a specific sound recording was pressed."
  {:db/ident :bf/MatrixNumber,
   :dcterms/modified ["2017-02-03 (Revised definition)" "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Audio matrix number",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "Matrix identifier assigned to the master from which a specific sound recording was pressed."})

(def Media
  "Categorization reflecting the general type of intermediation device required to view, play, run, etc., the content of a resource."
  {:db/ident :bf/Media,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Media type",
   :skos/definition
   "Categorization reflecting the general type of intermediation device required to view, play, run, etc., the content of a resource."})

(def Meeting
  "Gathering of individuals or representatives of various bodies for the purpose of discussing and/or acting on topics of common interest."
  {:db/ident :bf/Meeting,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Meeting",
   :rdfs/subClassOf :bf/Agent,
   :skos/definition
   "Gathering of individuals or representatives of various bodies for the purpose of discussing and/or acting on topics of common interest."})

(def MixedMaterial
  "Resource comprised of multiple types which is not driven by software. For instance, an archival collection of text, photographs and sound recordings."
  {:db/ident :bf/MixedMaterial,
   :dcterms/modified ["2022-10-03 (revised definition [GH92])"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Mixed material",
   :rdfs/subClassOf :bf/Work,
   :skos/definition
   "Resource comprised of multiple types which is not driven by software. For instance, an archival collection of text, photographs and sound recordings."})

(def Modification
  "Information relating to modification of a resource."
  {:db/ident         :bf/Modification,
   :dcterms/modified "2022-10-03 (New [GH69])",
   :rdf/type         :owl/Class,
   :rdfs/label       "Modification",
   :rdfs/subClassOf  :bf/ProvisionActivity,
   :skos/definition  "Information relating to modification of a resource."})

(def Monograph
  "Resource that is issued as a single physical unit or intangible single logical unit."
  {:db/ident :bf/Monograph,
   :dcterms/modified "2022-10-03 (New [GH91])",
   :rdf/type :owl/Class,
   :rdfs/label "Monograph",
   :rdfs/subClassOf :bf/Work,
   :skos/definition
   "Resource that is issued as a single physical unit or intangible single logical unit."})

(def Mount
  "Physical material or object used for the support or backing to which the base material of a resource has been attached."
  {:db/ident :bf/Mount,
   :dcterms/modified ["2021-06-09 (Amended definition [GH29])"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Mount",
   :skos/definition
   "Physical material or object used for the support or backing to which the base material of a resource has been attached."})

(def MovementNotation
  "Information on the symbol system used to convey the content of a movement resource."
  {:db/ident :bf/MovementNotation,
   :dcterms/modified ["2021-06-09 (Modified label [GH67])" "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Movement notation",
   :rdfs/subClassOf :bf/Notation,
   :skos/definition
   "Information on the symbol system used to convey the content of a movement resource."})

(def MovingImage
  "Images intended to be perceived as moving, including motion pictures (using liveaction and/or animation), video recordings of performances, events,etc."
  {:db/ident :bf/MovingImage,
   :dcterms/modified ["2016-04-26 (fixed typo in definition)"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Moving image",
   :rdfs/subClassOf :bf/Work,
   :skos/definition
   "Images intended to be perceived as moving, including motion pictures (using liveaction and/or animation), video recordings of performances, events,etc."})

(def Multimedia
  "Electronic resource which is a computer program or consists of multiple media types that are software driven, such as videogames."
  {:db/ident :bf/Multimedia,
   :dcterms/modified ["2022-10-03 (revised definition [GH92])"
                      "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Software or multimedia",
   :rdfs/subClassOf :bf/Work,
   :skos/definition
   "Electronic resource which is a computer program or consists of multiple media types that are software driven, such as videogames."})

(def MusicAudio
  "Music resource expressed in an audible form."
  {:db/ident         :bf/MusicAudio,
   :dcterms/modified "2022-10-03 (New [GH91])",
   :rdf/type         :owl/Class,
   :rdfs/label       "Music audio",
   :rdfs/subClassOf  :bf/Audio,
   :skos/definition  "Music resource expressed in an audible form."})

(def MusicDistributorNumber
  "Identifier appearing on a resource assigned by a distributor to a specific audio recording, notated music publication, music-related publication, or videorecording."
  {:db/ident :bf/MusicDistributorNumber,
   :dcterms/modified "2017-02-07 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Music distributor number",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "Identifier appearing on a resource assigned by a distributor to a specific audio recording, notated music publication, music-related publication, or videorecording."})

(def MusicEnsemble
  "Ensemble for which a musical work is appropriate."
  {:db/ident         :bf/MusicEnsemble,
   :dcterms/modified ["2021-06-09 (Changed subclass to Ensemble [GH56])"
                      "2016-04-21 (New)"],
   :rdf/type         :owl/Class,
   :rdfs/label       "Music ensemble",
   :rdfs/subClassOf  :bf/Ensemble,
   :skos/definition  "Ensemble for which a musical work is appropriate."})

(def MusicFormat
  "Layout for content of a resource that is presented in the form of musical notation."
  {:db/ident :bf/MusicFormat,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Notated music format",
   :skos/definition
   "Layout for content of a resource that is presented in the form of musical notation."})

(def MusicInstrument
  "Instrument for which a musical work is appropriate."
  {:db/ident         :bf/MusicInstrument,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Musical instrument",
   :skos/definition  "Instrument for which a musical work is appropriate."})

(def MusicMedium
  "Summary statement of the medium for a musical work."
  {:db/ident         :bf/MusicMedium,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Music medium information",
   :skos/definition  "Summary statement of the medium for a musical work."})

(def MusicNotation
  "Information on the symbol system used to convey the content of a music resource."
  {:db/ident :bf/MusicNotation,
   :dcterms/modified ["2021-06-09 (Modified label [GH67])" "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Music notation",
   :rdfs/subClassOf :bf/Notation,
   :skos/definition
   "Information on the symbol system used to convey the content of a music resource."})

(def MusicPlate
  "Identifiers assigned by a music publisher or printer to the printing plates for the notated portion of a notated music publication, or an identifier that emulates the printing plate tradition in contemporary publications."
  {:db/ident :bf/MusicPlate,
   :dcterms/modified ["2017-02-03 (Revised definition)" "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Music plate number",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "Identifiers assigned by a music publisher or printer to the printing plates for the notated portion of a notated music publication, or an identifier that emulates the printing plate tradition in contemporary publications."})

(def MusicPublisherNumber
  "Identifier assigned to a notated music publication other than an issue, matrix, or plate number."
  {:db/ident :bf/MusicPublisherNumber,
   :dcterms/modified ["2017-02-03 (Revised definition)" "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Music publisher number",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "Identifier assigned to a notated music publication other than an issue, matrix, or plate number."})

(def MusicVoice
  "Voice for which a musical work is appropriate."
  {:db/ident         :bf/MusicVoice,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Music voice",
   :skos/definition  "Voice for which a musical work is appropriate."})

(def Nbn
  "National Bibliography Number that identifies a resource description."
  {:db/ident :bf/Nbn,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "NBN",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "National Bibliography Number that identifies a resource description."})

(def NonMusicAudio
  "Resource expressed in an audible form, including spoken word and other non-musical sounds."
  {:db/ident :bf/NonMusicAudio,
   :dcterms/modified "2022-10-03 (New [GH91])",
   :rdf/type :owl/Class,
   :rdfs/label "Non-music audio",
   :rdfs/subClassOf :bf/Audio,
   :skos/definition
   "Resource expressed in an audible form, including spoken word and other non-musical sounds."})

(def NotatedMovement
  "Graphic, non-realized representations of movement intended to be perceived visually, e.g. dance."
  {:db/ident :bf/NotatedMovement,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Notated movement",
   :rdfs/subClassOf :bf/Work,
   :skos/definition
   "Graphic, non-realized representations of movement intended to be perceived visually, e.g. dance."})

(def NotatedMusic
  "Graphic, non-realized representations of musical works intended to be perceived visually."
  {:db/ident :bf/NotatedMusic,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Notated music",
   :rdfs/subClassOf :bf/Work,
   :skos/definition
   "Graphic, non-realized representations of musical works intended to be perceived visually."})

(def Notation
  "Information on the alphabet, script, or symbol system used to convey the content of the resource, including specialized scripts, typefaces, tactile notation, movement notation, and musical notation."
  {:db/ident :bf/Notation,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Notation",
   :skos/definition
   "Information on the alphabet, script, or symbol system used to convey the content of the resource, including specialized scripts, typefaces, tactile notation, movement notation, and musical notation."})

(def Note
  "Information, usually in textual form, on attributes of a resource or some aspect of a resource."
  {:db/ident :bf/Note,
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
  {:db/ident :bf/Object,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Three-dimensional object",
   :rdfs/subClassOf :bf/Work,
   :skos/definition
   "Resource in a form intended to be perceived visually in three-dimensions. Includes man-made objects such as models, sculptures, clothing, and toys, as well as naturally occurring objects such as specimens mounted for viewing."})

(def ObjectCount
  "Number of objects in encoded geospatial information in a cartographic resource."
  {:db/ident :bf/ObjectCount,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Digital cartographic object count",
   :rdfs/subClassOf :bf/DigitalCharacteristic,
   :skos/definition
   "Number of objects in encoded geospatial information in a cartographic resource."})

(def Organization
  "Corporation or group of persons and/or organizations that acts, or may act, as a unit."
  {:db/ident :bf/Organization,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Organization",
   :rdfs/subClassOf :bf/Agent,
   :skos/definition
   "Corporation or group of persons and/or organizations that acts, or may act, as a unit."})

(def ParallelTitle
  "Title in another language and/or script."
  {:db/ident         :bf/ParallelTitle,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Parallel title proper",
   :rdfs/subClassOf  :bf/VariantTitle,
   :skos/definition  "Title in another language and/or script."})

(def Person
  "Individual or identity established by an individual (either alone or in collaboration with one or more other individuals)."
  {:db/ident :bf/Person,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Person",
   :rdfs/subClassOf [:bf/Agent :foaf/Person],
   :skos/definition
   "Individual or identity established by an individual (either alone or in collaboration with one or more other individuals)."})

(def Place
  "Geographic location."
  {:db/ident         :bf/Place,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Place",
   :skos/definition  "Geographic location."})

(def PlaybackChannels
  "Configuration/number of sound channels used to make a recording, such as one channel for a monophonic recording, e.g., mono, stereo, quadraphonic, surround."
  {:db/ident :bf/PlaybackChannels,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Configuration of playback channels",
   :rdfs/subClassOf :bf/SoundCharacteristic,
   :skos/definition
   "Configuration/number of sound channels used to make a recording, such as one channel for a monophonic recording, e.g., mono, stereo, quadraphonic, surround."})

(def PlaybackCharacteristic
  "Equalization system, noise reduction system, etc., used in making an audio recording, e.g., CCIR standard, CX encoded, Dolby."
  {:db/ident :bf/PlaybackCharacteristic,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Special playback characteristics",
   :rdfs/subClassOf :bf/SoundCharacteristic,
   :skos/definition
   "Equalization system, noise reduction system, etc., used in making an audio recording, e.g., CCIR standard, CX encoded, Dolby."})

(def PlayingSpeed
  "Speed at which an audio carrier must be operated to produce the sound intended, e.g., 78 rpm, 19 cm/s."
  {:db/ident :bf/PlayingSpeed,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Playing speed",
   :rdfs/subClassOf :bf/SoundCharacteristic,
   :skos/definition
   "Speed at which an audio carrier must be operated to produce the sound intended, e.g., 78 rpm, 19 cm/s."})

(def Polarity
  "Relationship of the colors and tones in an image to the colors and tones of the object reproduced."
  {:db/ident :bf/Polarity,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Polarity",
   :skos/definition
   "Relationship of the colors and tones in an image to the colors and tones of the object reproduced."})

(def PostalRegistration
  "Number assigned to a publication for which the specified postal service permits the use of a special mailing class privilege."
  {:db/ident :bf/PostalRegistration,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Postal registration number",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "Number assigned to a publication for which the specified postal service permits the use of a special mailing class privilege."})

(def PresentationFormat
  "Format used in the production of a projected image, e.g., Cinerama, IMAX."
  {:db/ident :bf/PresentationFormat,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Presentation format",
   :rdfs/subClassOf :bf/ProjectionCharacteristic,
   :skos/definition
   "Format used in the production of a projected image, e.g., Cinerama, IMAX."})

(def Print
  "Resource that is printed."
  {:db/ident         :bf/Print,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Printed",
   :rdfs/subClassOf  :bf/Instance,
   :skos/definition  "Resource that is printed."})

(def Production
  "Information relating to production of a resource."
  {:db/ident         :bf/Production,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Producer",
   :rdfs/subClassOf  :bf/ProvisionActivity,
   :skos/definition  "Information relating to production of a resource."})

(def ProductionMethod
  "Process used to produce a resource"
  {:db/ident         :bf/ProductionMethod,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Production method",
   :skos/definition  "Process used to produce a resource"})

(def Projection
  "Method or system used to represent the surface of the earth or of a celestial sphere on a plane."
  {:db/ident :bf/Projection,
   :dcterms/modified "2017-02-03 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Projection",
   :skos/definition
   "Method or system used to represent the surface of the earth or of a celestial sphere on a plane."})

(def ProjectionCharacteristic
  "Technical specification relating to the projection of a motion picture film."
  {:db/ident :bf/ProjectionCharacteristic,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Projection characteristic",
   :skos/definition
   "Technical specification relating to the projection of a motion picture film."})

(def ProjectionSpeed
  "Speed at which a projected carrier must be operated to produce the moving image intended, e.g., 20 fps."
  {:db/ident :bf/ProjectionSpeed,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Projection speed",
   :rdfs/subClassOf :bf/ProjectionCharacteristic,
   :skos/definition
   "Speed at which a projected carrier must be operated to produce the moving image intended, e.g., 20 fps."})

(def ProvisionActivity
  "Information about the agent or place relating to the publication, printing, distribution, issue, release, or production of a resource."
  {:db/ident :bf/ProvisionActivity,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Provider entity",
   :skos/definition
   "Information about the agent or place relating to the publication, printing, distribution, issue, release, or production of a resource."})

(def PubFrequency
  "Information about the publication frequency of a resource."
  {:db/ident :bf/PubFrequency,
   :dcterms/modified "2021-06-09 (New [GH76])",
   :rdf/type :owl/Class,
   :rdfs/label "Publication Frequency",
   :skos/definition
   "Information about the publication frequency of a resource."})

(def Publication
  "Information relating to publication of a resource."
  {:db/ident         :bf/Publication,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Publisher",
   :rdfs/subClassOf  :bf/ProvisionActivity,
   :skos/definition  "Information relating to publication of a resource."})

(def PublisherNumber
  "Number assigned by a publisher that is not one of the specific defined types."
  {:db/ident :bf/PublisherNumber,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Publisher number",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "Number assigned by a publisher that is not one of the specific defined types."})

(def RecordingMedium
  "Type of medium used to record sound on an audio carrier, e.g., magnetic, optical."
  {:db/ident :bf/RecordingMedium,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Recording medium",
   :rdfs/subClassOf :bf/SoundCharacteristic,
   :skos/definition
   "Type of medium used to record sound on an audio carrier, e.g., magnetic, optical."})

(def RecordingMethod
  "Method used to encode audio content for playback, e.g., analog, digital."
  {:db/ident :bf/RecordingMethod,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Type of recording",
   :rdfs/subClassOf :bf/SoundCharacteristic,
   :skos/definition
   "Method used to encode audio content for playback, e.g., analog, digital."})

(def ReductionRatio
  "Size of a micro-image in relation to the original from which it was produced."
  {:db/ident :bf/ReductionRatio,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Reduction ratio",
   :skos/definition
   "Size of a micro-image in relation to the original from which it was produced."})

(def RegionalEncoding
  "Identification of the region of the world for which a videodisc has been encoded, e.g., region 4."
  {:db/ident :bf/RegionalEncoding,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Regional encoding",
   :rdfs/subClassOf :bf/DigitalCharacteristic,
   :skos/definition
   "Identification of the region of the world for which a videodisc has been encoded, e.g., region 4."})

(def ReportNumber
  "Identification number of a technical report that is not a Standard Technical Report Number."
  {:db/ident :bf/ReportNumber,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Technical report number",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "Identification number of a technical report that is not a Standard Technical Report Number."})

(def Resolution
  "Clarity or fineness of detail in a digital image, expressed by the measurement of the image in pixels, etc., e.g., 3.1 megapixels."
  {:db/ident :bf/Resolution,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Resolution",
   :rdfs/subClassOf :bf/DigitalCharacteristic,
   :skos/definition
   "Clarity or fineness of detail in a digital image, expressed by the measurement of the image in pixels, etc., e.g., 3.1 megapixels."})

(def RetentionPolicy
  "Policy of holding institution for retaining resource."
  {:db/ident         :bf/RetentionPolicy,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Retention policy",
   :rdfs/subClassOf  :bf/UsageAndAccessPolicy,
   :skos/definition  "Policy of holding institution for retaining resource."})

(def Review
  "Review of a resource."
  {:db/ident         :bf/Review,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Review",
   :skos/definition  "Review of a resource."})

(def Role
  "Function played or provided by a contributor, e.g., author, illustrator, etc."
  {:db/ident :bf/Role,
   :dcterms/modified "2017-02-03 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Role",
   :skos/definition
   "Function played or provided by a contributor, e.g., author, illustrator, etc."})

(def Scale
  "Ratio of the dimensions of a form contained or embodied in a resource to the dimensions of the entity it represents, e.g., for images or cartographic resources."
  {:db/ident :bf/Scale,
   :dcterms/modified "2017-02-03 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Scale",
   :skos/definition
   "Ratio of the dimensions of a form contained or embodied in a resource to the dimensions of the entity it represents, e.g., for images or cartographic resources."})

(def Script
  "Information on the script, or symbol system used to convey the content of a text resource."
  {:db/ident :bf/Script,
   :dcterms/modified ["2021-06-09 (Modified label [GH67])" "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Script",
   :rdfs/subClassOf :bf/Notation,
   :skos/definition
   "Information on the script, or symbol system used to convey the content of a text resource."})

(def Serial
  "Resource that is issued in successive parts, usually numbered, that has no predetermined conclusion."
  {:db/ident :bf/Serial,
   :dcterms/modified "2022-10-03 (New [GH91])",
   :rdf/type :owl/Class,
   :rdfs/label "Serial",
   :rdfs/subClassOf :bf/Work,
   :skos/definition
   "Resource that is issued in successive parts, usually numbered, that has no predetermined conclusion."})

(def Series
  "Resource with a collective title that applies to a group of separate resources, each of which also has its own title."
  {:db/ident :bf/Series,
   :dcterms/modified "2022-10-03 (New [GH91])",
   :rdf/type :owl/Class,
   :rdfs/label "Series",
   :rdfs/subClassOf :bf/Work,
   :skos/definition
   "Resource with a collective title that applies to a group of separate resources, each of which also has its own title."})

(def ShelfMark
  "Piece/item identifier, such as a call or other type of number."
  {:db/ident :bf/ShelfMark,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Shelf location",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "Piece/item identifier, such as a call or other type of number."})

(def ShelfMarkDdc
  "Shelf mark based on Dewey Decimal Classification."
  {:db/ident         :bf/ShelfMarkDdc,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "DDC call number",
   :rdfs/subClassOf  :bf/ShelfMark,
   :skos/definition  "Shelf mark based on Dewey Decimal Classification."})

(def ShelfMarkLcc
  "Shelf mark based on Library of Congress Classification."
  {:db/ident         :bf/ShelfMarkLcc,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "LCC call number",
   :rdfs/subClassOf  :bf/ShelfMark,
   :skos/definition  "Shelf mark based on Library of Congress Classification."})

(def ShelfMarkNlm
  "Shelf mark based on National Library of Medicine Classification."
  {:db/ident :bf/ShelfMarkNlm,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "NLM call number",
   :rdfs/subClassOf :bf/ShelfMark,
   :skos/definition
   "Shelf mark based on National Library of Medicine Classification."})

(def ShelfMarkUdc
  "Shelf mark based on Universal Decimal Classification."
  {:db/ident         :bf/ShelfMarkUdc,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "UDC call number",
   :rdfs/subClassOf  :bf/ShelfMark,
   :skos/definition  "Shelf mark based on Universal Decimal Classification."})

(def Sici
  "Serial Item and Contribution Identifier."
  {:db/ident         :bf/Sici,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "SICI",
   :rdfs/subClassOf  :bf/Identifier,
   :skos/definition  "Serial Item and Contribution Identifier."})

(def SoundCharacteristic
  "Technical specification relating to the encoding of sound in a resource."
  {:db/ident :bf/SoundCharacteristic,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Sound characteristic",
   :skos/definition
   "Technical specification relating to the encoding of sound in a resource."})

(def SoundContent
  "Indication of whether the production of sound is an integral part of the resource."
  {:db/ident :bf/SoundContent,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Sound content",
   :skos/definition
   "Indication of whether the production of sound is an integral part of the resource."})

(def Source
  "Resource from which value or label came or was derived."
  {:db/ident         :bf/Source,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Source",
   :skos/definition  "Resource from which value or label came or was derived."})

(def Status
  "Designation of the validity or position of something, e.g., whether something is incorrect or available."
  {:db/ident :bf/Status,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Status",
   :skos/definition
   "Designation of the validity or position of something, e.g., whether something is incorrect or available."})

(def StillImage
  "Resource expressed through line, shape, shading, etc., intended to be perceived visually as a still image or images in two dimensions. Includes two-dimensional images and slides and transparencies."
  {:db/ident :bf/StillImage,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Still image",
   :rdfs/subClassOf :bf/Work,
   :skos/definition
   "Resource expressed through line, shape, shading, etc., intended to be perceived visually as a still image or images in two dimensions. Includes two-dimensional images and slides and transparencies."})

(def StockNumber
  "Identification number used for stock purposes and assigned by agencies such as distributors, publishers, or vendors."
  {:db/ident :bf/StockNumber,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Stock number",
   :rdfs/subClassOf :bf/Identifier,
   :skos/definition
   "Identification number used for stock purposes and assigned by agencies such as distributors, publishers, or vendors."})

(def Strn
  "Standard Technical Report Number."
  {:db/ident         :bf/Strn,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "STRN",
   :rdfs/subClassOf  :bf/Identifier,
   :skos/definition  "Standard Technical Report Number."})

(def StudyNumber
  "Identification number for a computer data file."
  {:db/ident         :bf/StudyNumber,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Study number",
   :rdfs/subClassOf  :bf/Identifier,
   :skos/definition  "Identification number for a computer data file."})

(def Sublocation
  "Specific place within the holding entity where the item is located or made available."
  {:db/ident :bf/Sublocation,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Sublocation",
   :skos/definition
   "Specific place within the holding entity where the item is located or made available."})

(def Summary
  "Description of the content of a resource, such as an abstract, summary, etc.."
  {:db/ident :bf/Summary,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Summary",
   :skos/definition
   "Description of the content of a resource, such as an abstract, summary, etc.."})

(def SupplementaryContent
  "Index, bibliography, appendix, etc. intended to supplement the primary content of a resource."
  {:db/ident :bf/SupplementaryContent,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Supplementary material",
   :skos/definition
   "Index, bibliography, appendix, etc. intended to supplement the primary content of a resource."})

(def SystemRequirement
  "Equipment or system requirements beyond what is normal and obvious for the type of carrier or type of file, such as make and model of equipment or hardware, operating system, amount of memory, programming language, other necessary software, any plug-ins or peripherals required to play, view, or run the resource, etc."
  {:db/ident :bf/SystemRequirement,
   :dcterms/modified "2017-02-06 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "System Requirement",
   :skos/definition
   "Equipment or system requirements beyond what is normal and obvious for the type of carrier or type of file, such as make and model of equipment or hardware, operating system, amount of memory, programming language, other necessary software, any plug-ins or peripherals required to play, view, or run the resource, etc."})

(def TableOfContents
  "Table of contents of a resource."
  {:db/ident         :bf/TableOfContents,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Table of contents",
   :skos/definition  "Table of contents of a resource."})

(def Tactile
  "Resource that is intended to be perceived by touch."
  {:db/ident         :bf/Tactile,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Tactile material",
   :rdfs/subClassOf  :bf/Instance,
   :skos/definition  "Resource that is intended to be perceived by touch."})

(def TactileNotation
  "Information on the symbol system used to convey the content of a tactile resource."
  {:db/ident :bf/TactileNotation,
   :dcterms/modified ["2021-06-09 (Modified label [GH67])" "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Tactile notation",
   :rdfs/subClassOf :bf/Notation,
   :skos/definition
   "Information on the symbol system used to convey the content of a tactile resource."})

(def TapeConfig
  "Number of tracks on an audiotape, e.g., 12 track."
  {:db/ident         :bf/TapeConfig,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Tape configuration",
   :rdfs/subClassOf  :bf/SoundCharacteristic,
   :skos/definition  "Number of tracks on an audiotape, e.g., 12 track."})

(def Temporal
  "Chronological period."
  {:db/ident         :bf/Temporal,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Temporal concept",
   :skos/definition  "Chronological period."})

(def Text
  "Resource intended to be perceived visually and understood through the use of language in written or spoken form."
  {:db/ident :bf/Text,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Text",
   :rdfs/subClassOf :bf/Work,
   :skos/definition
   "Resource intended to be perceived visually and understood through the use of language in written or spoken form."})

(def Title
  "Title information relating to a resource: work title, preferred title, instance title, transcribed title, translated title, variant form of title, etc."
  {:db/ident :bf/Title,
   :dcterms/modified ["2017-02-03 (Definition changed)" "2016-04-21 (New)"],
   :rdf/type :owl/Class,
   :rdfs/label "Title entity",
   :skos/definition
   "Title information relating to a resource: work title, preferred title, instance title, transcribed title, translated title, variant form of title, etc."})

(def Topic
  "Concept or area of knowledge."
  {:db/ident         :bf/Topic,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Topic",
   :skos/definition  "Concept or area of knowledge."})

(def TrackConfig
  "Configuration of the audio track on a sound-track film, e.g., center track, edge track."
  {:db/ident :bf/TrackConfig,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Track configuration",
   :rdfs/subClassOf :bf/SoundCharacteristic,
   :skos/definition
   "Configuration of the audio track on a sound-track film, e.g., center track, edge track."})

(def Unit
  "Units in which a value is expressed."
  {:db/ident         :bf/Unit,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Unit",
   :skos/definition  "Units in which a value is expressed."})

(def Upc
  "Universal Product Code."
  {:db/ident         :bf/Upc,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "UPC",
   :rdfs/subClassOf  :bf/Identifier,
   :skos/definition  "Universal Product Code."})

(def Urn
  "Uniform Resource Name."
  {:db/ident         :bf/Urn,
   :dcterms/modified ["2021-06-09 (Corrected definition [GH51])"
                      "2016-04-21 (New)"],
   :rdf/type         :owl/Class,
   :rdfs/label       "URN",
   :rdfs/subClassOf  :bf/Identifier,
   :skos/definition  "Uniform Resource Name."})

(def UsageAndAccessPolicy
  "General statement of allowances and restrictions on access to a resource, including retention, reproduction, access, and lending."
  {:db/ident :bf/UsageAndAccessPolicy,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Use and access conditions",
   :skos/definition
   "General statement of allowances and restrictions on access to a resource, including retention, reproduction, access, and lending."})

(def UsePolicy
  "Usage limitations placed on a resource with respect to reproduction, publication, exhibition, etc.."
  {:db/ident :bf/UsePolicy,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Use policy",
   :rdfs/subClassOf :bf/UsageAndAccessPolicy,
   :skos/definition
   "Usage limitations placed on a resource with respect to reproduction, publication, exhibition, etc.."})

(def VariantTitle
  "Title associated with the resource that is different from the Work or Instance title."
  {:db/ident :bf/VariantTitle,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Title variation",
   :rdfs/subClassOf :bf/Title,
   :skos/definition
   "Title associated with the resource that is different from the Work or Instance title."})

(def VideoCharacteristic
  "Technical specification relating to the encoding of video images in a resource."
  {:db/ident :bf/VideoCharacteristic,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Video characteristic",
   :skos/definition
   "Technical specification relating to the encoding of video images in a resource."})

(def VideoFormat
  "Standard, etc., used to encode the analog video content of a resource, e.g., Beta, 8mm."
  {:db/ident :bf/VideoFormat,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Video format",
   :rdfs/subClassOf :bf/VideoCharacteristic,
   :skos/definition
   "Standard, etc., used to encode the analog video content of a resource, e.g., Beta, 8mm."})

(def VideoRecordingNumber
  "Number assigned by a publisher to a video recording."
  {:db/ident         :bf/VideoRecordingNumber,
   :dcterms/modified ["2017-02-03 (Corrected case in class name)"
                      "2016-04-21 (New)"],
   :rdf/type         :owl/Class,
   :rdfs/label       "Video recording number",
   :rdfs/subClassOf  :bf/Identifier,
   :skos/definition  "Number assigned by a publisher to a video recording."})

(def Work
  "Resource reflecting a conceptual essence of a cataloging resource."
  {:db/ident :bf/Work,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Work",
   :skos/definition
   "Resource reflecting a conceptual essence of a cataloging resource."})

(def absorbed
  "Resource that has been incorporated into another resource."
  {:db/ident :bf/absorbed,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bf/absorbedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Absorption of",
   :rdfs/subPropertyOf :bf/precededBy,
   :skos/definition
   "Resource that has been incorporated into another resource."})

(def absorbedBy
  "Resource that incorporates another resource."
  {:db/ident           :bf/absorbedBy,
   :dcterms/modified   ["2016-04-29 (added inverse, updated range)"
                        "2016-04-21 (New)"],
   :owl/inverseOf      :bf/absorbed,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       ["Suggested value - Work or Instance"
                        "Suggested use - With Work or Instance"],
   :rdfs/label         "Absorbed by",
   :rdfs/subPropertyOf :bf/succeededBy,
   :skos/definition    "Resource that incorporates another resource."})

(def accompaniedBy
  "Resource that accompanies the described resource."
  {:db/ident           :bf/accompaniedBy,
   :dcterms/modified   ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf      :bf/accompanies,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       ["Suggested value - Work, Instance or Item"
                        "Suggested use - With Work, Instance or Item"],
   :rdfs/label         "Accompanied by",
   :rdfs/subPropertyOf :bf/relatedTo,
   :skos/definition    "Resource that accompanies the described resource."})

(def accompanies
  "Resource that adds to or is issued with the described resource."
  {:db/ident :bf/accompanies,
   :dcterms/modified ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf :bf/accompaniedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work, Instance or Item"
                  "Suggested use - With Work, Instance or Item"],
   :rdfs/label "Accompanies",
   :rdfs/subPropertyOf :bf/relatedTo,
   :skos/definition
   "Resource that adds to or is issued with the described resource."})

(def acquisitionSource
  "Information about an organization, person, etc., from which a resource may be obtained."
  {:db/ident :bf/acquisitionSource,
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
  {:db/ident :bf/acquisitionTerms,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Terms of acquisition",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Conditions under which the publisher, distributor, etc., will normally supply a resource, e.g., price of a resource."})

(def adminMetadata
  "Metadata about the metadata, especially provenance information."
  {:db/ident :bf/adminMetadata,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Administrative metadata",
   :rdfs/range :bf/AdminMetadata,
   :skos/definition
   "Metadata about the metadata, especially provenance information."})

(def adminMetadataFor
  "Relates an Administrative metadata resource to the resource it captures information about."
  {:db/ident :bf/adminMetadataFor,
   :dcterms/modified "2021-06-09 (New [GH59])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/AdminMetadata,
   :rdfs/label "Administrative metadata for",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Relates an Administrative metadata resource to the resource it captures information about."})

(def agent
  "Entity associated with a resource or element of description, such as the name of the entity responsible for the content or of the publication, printing, distribution, issue, release or production of a resource."
  {:db/ident :bf/agent,
   :dcterms/modified ["2021-06-09 (Removed range [GH63])" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Associated agent",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Entity associated with a resource or element of description, such as the name of the entity responsible for the content or of the publication, printing, distribution, issue, release or production of a resource."})

(def agentOf
  "Property relating an agent, such as an entity responsible for the content or of the publication, printing, distribution, issue, release or production, to another resource."
  {:db/ident :bf/agentOf,
   :dcterms/modified "2021-06-09 (New [GH3])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Associated agent of",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Property relating an agent, such as an entity responsible for the content or of the publication, printing, distribution, issue, release or production, to another resource."})

(def appliedMaterial
  "Physical or chemical substance applied to a base material of a resource."
  {:db/ident :bf/appliedMaterial,
   :dcterms/modified
   ["2021-06-09 (Removed range [GH24], Broadened domain, Made subproperty of material [GH26])"
    "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work, Instance or Item",
   :rdfs/label "Applied material",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :bf/material,
   :skos/definition
   "Physical or chemical substance applied to a base material of a resource."})

(def appliedMaterialOf
  "Relates a Material resource to that which it is the applied material of."
  {:db/ident :bf/appliedMaterialOf,
   :dcterms/modified "2021-06-09 (New [GH25])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Appllied material of",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :bf/materialOf,
   :skos/definition
   "Relates a Material resource to that which it is the applied material of."})

(def arrangement
  "Relates one resource to another of which it is an arrangement of the first."
  {:db/ident :bf/arrangement,
   :dcterms/modified ["2021-06-09 (Redefined [GH77])" "2016-04-21 (New)"],
   :owl/inverseOf :bf/arrangementOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Work,
   :rdfs/label "Arrangement",
   :rdfs/range :bf/Work,
   :rdfs/subPropertyOf :bf/relatedTo,
   :skos/definition
   "Relates one resource to another of which it is an arrangement of the first."})

(def arrangementOf
  "Relates an arrangement to the resource of which it is an arrangement."
  {:db/ident :bf/arrangementOf,
   :dcterms/modified "2021-06-09 (New [GH77])",
   :owl/inverseOf :bf/arrangement,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Work,
   :rdfs/label "Arrangement of",
   :rdfs/range :bf/Work,
   :rdfs/subPropertyOf :bf/relatedTo,
   :skos/definition
   "Relates an arrangement to the resource of which it is an arrangement."})

(def ascensionAndDeclination
  "System for identifying the location of a celestial object in the sky covered by the cartographic content of a resource using the angles of right ascension and declination."
  {:db/ident :bf/ascensionAndDeclination,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Cartographic,
   :rdfs/label "Cartographic ascension and declination",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "System for identifying the location of a celestial object in the sky covered by the cartographic content of a resource using the angles of right ascension and declination."})

(def aspectRatio
  "Proportional relationship between an image's width and its height."
  {:db/ident :bf/aspectRatio,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Aspect ratio",
   :rdfs/range :bf/AspectRatio,
   :skos/definition
   "Proportional relationship between an image's width and its height."})

(def assigner
  "Entity that assigned the metadata, such as the entity that assigned a classification number, entity that assigned a name, entity that assigned an identifier."
  {:db/ident :bf/assigner,
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
  {:db/ident :bf/awards,
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
  {:db/ident :bf/baseMaterial,
   :dcterms/modified
   ["2021-06-09 (Removed range [GH24], Broadened domain, Made subproperty of material [GH26])"
    "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work, Instance or Item",
   :rdfs/label "Base material",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :bf/material,
   :skos/definition "Underlying physical material of a resource."})

(def baseMaterialOf
  "Relates a Material resource to that which it is the base material of."
  {:db/ident :bf/baseMaterialOf,
   :dcterms/modified "2021-06-09 (New [GH25])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Base material of",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :bf/materialOf,
   :skos/definition
   "Relates a Material resource to that which it is the base material of."})

(def binding
  "A method used to bind a published or unpublished resource,or other binding information."
  {:db/ident :bf/binding,
   :dcterms/modified "2022-10-03 (New [GH91])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Binding method",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "A method used to bind a published or unpublished resource,or other binding information."})

(def bookFormat
  "Result of folding a printed sheet to form a gathering of leaves."
  {:db/ident :bf/bookFormat,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Book format",
   :rdfs/range :bf/BookFormat,
   :skos/definition
   "Result of folding a printed sheet to form a gathering of leaves."})

(def capture
  "Information about place and date associated with the capture (e.g., recording, filming) of the content of a resource."
  {:db/ident :bf/capture,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Capture of content",
   :rdfs/range :bf/Capture,
   :skos/definition
   "Information about place and date associated with the capture (e.g., recording, filming) of the content of a resource."})

(def carrier
  "Categorization reflecting the format of the storage medium and housing of a carrier."
  {:db/ident :bf/carrier,
   :dcterms/modified ["2022-10-03 (Removed range [GH72])" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Carrier type",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Categorization reflecting the format of the storage medium and housing of a carrier."})

(def cartographicAttributes
  "Cartographic data that identifies characteristics of the resource, such as coordinates, projection, etc."
  {:db/ident :bf/cartographicAttributes,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Cartographic data",
   :rdfs/range :bf/Cartographic,
   :skos/definition
   "Cartographic data that identifies characteristics of the resource, such as coordinates, projection, etc."})

(def changeDate
  "Date or date and time on which the metadata was modified."
  {:db/ident :bf/changeDate,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/AdminMetadata,
   :rdfs/label "Description change date",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :bf/date,
   :skos/definition
   "Date or date and time on which the metadata was modified."})

(def classification
  "Classification number in any scheme."
  {:db/ident         :bf/classification,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Suggested use - With Work, Instance or Item",
   :rdfs/label       "Classification",
   :rdfs/range       :bf/Classification,
   :skos/definition  "Classification number in any scheme."})

(def classificationPortion
  "Classification number (single class number or beginning number of a span) that indicates the subject by applying a formal system of coding and organizing resources."
  {:db/ident :bf/classificationPortion,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Classification,
   :rdfs/label "Classification number",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Classification number (single class number or beginning number of a span) that indicates the subject by applying a formal system of coding and organizing resources."})

(def code
  "String of characters that serves as a code representing information."
  {:db/ident :bf/code,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Code",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "String of characters that serves as a code representing information."})

(def collectionArrangement
  "Information about the organization and arrangement of a collection of resources."
  {:db/ident :bf/collectionArrangement,
   :dcterms/modified "2021-06-09 (New [GH77])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Collection Organization and arrangement",
   :rdfs/range :bf/CollectionArrangement,
   :skos/definition
   "Information about the organization and arrangement of a collection of resources."})

(def collectionArrangementOf
  "Relates an Arrangement resource to that which it describes."
  {:db/ident :bf/collectionArrangementOf,
   :dcterms/modified "2021-06-09 (New [GH77])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested value - Work or Instance",
   :rdfs/domain :bf/CollectionArrangement,
   :rdfs/label "Organization and arrangement of Collection",
   :skos/definition
   "Relates an Arrangement resource to that which it describes."})

(def collectionOrganization
  "Manner in which the resource is divided into smaller units."
  {:db/ident :bf/collectionOrganization,
   :dcterms/modified "2021-06-09 (New [GH77])",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/CollectionArrangement,
   :rdfs/label "Organization of material",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Manner in which the resource is divided into smaller units."})

(def colorContent
  "Color characteristics, e.g., black and white, multicolored."
  {:db/ident :bf/colorContent,
   :dcterms/modified ["2021-06-09 (Broaden range [GH31])" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work, Instance or Item",
   :rdfs/label "Color content",
   :rdfs/range :bf/ColorContent,
   :skos/definition
   "Color characteristics, e.g., black and white, multicolored."})

(def content
  "Categorization reflecting the fundamental form of communication in which the content is expressed and the human sense through which it is intended to be perceived."
  {:db/ident :bf/content,
   :dcterms/modified ["2022-10-03 (Removed range [GH71])" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Work,
   :rdfs/label "Content type",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Categorization reflecting the fundamental form of communication in which the content is expressed and the human sense through which it is intended to be perceived."})

(def contentAccessibility
  "Information that assists those with a sensory impairment for greater understanding of content, e.g., captions."
  {:db/ident :bf/contentAccessibility,
   :dcterms/modified ["2017-03-15 (fixed typo in range)"
                      "2017-02-03 (changed from data to object property)"
                      "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Content accessibility information",
   :rdfs/range :bf/ContentAccessibility,
   :skos/definition
   "Information that assists those with a sensory impairment for greater understanding of content, e.g., captions."})

(def continuedBy
  "Resource whose content continues an earlier resource under a new title."
  {:db/ident :bf/continuedBy,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bf/continues,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Continued by",
   :rdfs/subPropertyOf :bf/succeededBy,
   :skos/definition
   "Resource whose content continues an earlier resource under a new title."})

(def continuedInPartBy
  "Resource part of whose content separated from an earlier resource to form a new resource."
  {:db/ident :bf/continuedInPartBy,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bf/separatedFrom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Continued in part by",
   :rdfs/subPropertyOf :bf/succeededBy,
   :skos/definition
   "Resource part of whose content separated from an earlier resource to form a new resource."})

(def continues
  "Resource that is continued by the content of a later resource under a new title."
  {:db/ident :bf/continues,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bf/continuedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Continuation of",
   :rdfs/subPropertyOf :bf/precededBy,
   :skos/definition
   "Resource that is continued by the content of a later resource under a new title."})

(def continuesInPart
  "Resource that split into two or more separate resources with new titles."
  {:db/ident :bf/continuesInPart,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bf/splitInto,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Continuation in part of",
   :rdfs/subPropertyOf :bf/precededBy,
   :skos/definition
   "Resource that split into two or more separate resources with new titles."})

(def contribution
  "Agent and its role in relation to the resource."
  {:db/ident         :bf/contribution,
   :dcterms/modified ["2017-02-03 (Corrected label)" "2016-04-21 (New)"],
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Suggested use - With Work, Instance or Item",
   :rdfs/label       "Contributor and role",
   :rdfs/range       :bf/Contribution,
   :skos/definition  "Agent and its role in relation to the resource."})

(def contributionOf
  "Relates a contribution resource, which associates an Agent and Role together, to the relevant resource."
  {:db/ident :bf/contributionOf,
   :dcterms/modified "2021-06-09 (New [GH4])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested value - Work, Instance or Item",
   :rdfs/domain :bf/Contribution,
   :rdfs/label "Contribution of",
   :skos/definition
   "Relates a contribution resource, which associates an Agent and Role together, to the relevant resource."})

(def coordinates
  "Mathematical system for identifying the area covered by the cartographic content of a resource, expressed either by means of longitude and latitude on the surface of planets or by the angles of right ascension and declination for celestial cartographic content."
  {:db/ident :bf/coordinates,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Cartographic,
   :rdfs/label "Cartographic coordinates",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Mathematical system for identifying the area covered by the cartographic content of a resource, expressed either by means of longitude and latitude on the surface of planets or by the angles of right ascension and declination for celestial cartographic content."})

(def copyrightDate
  "Date associated with a claim of protection under copyright or a similar regime."
  {:db/ident :bf/copyrightDate,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Copyright date",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :bf/date,
   :skos/definition
   "Date associated with a claim of protection under copyright or a similar regime."})

(def copyrightRegistration
  "Copyright and Legal Deposit registration information"
  {:db/ident         :bf/copyrightRegistration,
   :dcterms/modified ["2016-05-04 (Corrected expected value)"
                      "2016-04-21 (New)"],
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Suggested use - With Work or Instance",
   :rdfs/label       "Copyright registration information",
   :rdfs/range       :bf/CopyrightRegistration,
   :skos/definition  "Copyright and Legal Deposit registration information"})

(def count
  "Number associated with a measure of units, such as the number of units and/or subunits making up a resource."
  {:db/ident :bf/count,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Number of units",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Number associated with a measure of units, such as the number of units and/or subunits making up a resource."})

(def coverArt
  "Cover art image of a resource."
  {:db/ident         :bf/coverArt,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Suggested use - With Work or Instance",
   :rdfs/label       "Cover art",
   :rdfs/range       :bf/CoverArt,
   :skos/definition  "Cover art image of a resource."})

(def creationDate
  "Date or date and time on which the original metadata first created."
  {:db/ident :bf/creationDate,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/AdminMetadata,
   :rdfs/label "Description creation date",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :bf/date,
   :skos/definition
   "Date or date and time on which the original metadata first created."})

(def credits
  "Information in note form of credits for persons or organizations who have participated in the creation and/or production of the resource."
  {:db/ident :bf/credits,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Credits note",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Information in note form of credits for persons or organizations who have participated in the creation and/or production of the resource."})

(def custodialHistory
  "Information about the provenance, such as origin, ownership and custodial history (chain of custody), of a resource."
  {:db/ident :bf/custodialHistory,
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
  {:db/ident :bf/dataSource,
   :dcterms/modified ["2016-04-29 (updated range)" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Data source",
   :rdfs/subPropertyOf :bf/relatedTo,
   :skos/definition
   "Resource that is a data source to which the described resource is related. It may contain information about other files, printed sources, or collection procedures."})

(def date
  "Date designation associated with a resource or element of description, such as date of title variation; year a degree was awarded; date associated with the publication, printing, distribution, issue, release or production of a resource. May be date typed."
  {:db/ident :bf/date,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Date",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Date designation associated with a resource or element of description, such as date of title variation; year a degree was awarded; date associated with the publication, printing, distribution, issue, release or production of a resource. May be date typed."})

(def degree
  "Degree for which author was a candidate."
  {:db/ident         :bf/degree,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :bf/Dissertation,
   :rdfs/label       "Degree",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "Degree for which author was a candidate."})

(def derivativeOf
  "Source work from which the described resource is derived."
  {:db/ident :bf/derivativeOf,
   :dcterms/modified ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf :bf/hasDerivative,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Is derivative of",
   :rdfs/subPropertyOf :bf/relatedTo,
   :skos/definition
   "Source work from which the described resource is derived."})

(def derivedFrom
  "Link to the metadata that was the source of the data."
  {:db/ident         :bf/derivedFrom,
   :dcterms/modified ["2021-06-09 (Removed range [GH41])" "2016-04-21 (New)"],
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :bf/AdminMetadata,
   :rdfs/label       "Source metadata",
   :rdfs/range       :rdfs/Resource,
   :skos/definition  "Link to the metadata that was the source of the data."})

(def descriptionAuthentication
  "Indication of specific types of reviews that have been carried out on the description information."
  {:db/ident :bf/descriptionAuthentication,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/AdminMetadata,
   :rdfs/label "Description authentication",
   :rdfs/range :bf/DescriptionAuthentication,
   :skos/definition
   "Indication of specific types of reviews that have been carried out on the description information."})

(def descriptionConventions
  "Rules used for the descriptive content of the resource description."
  {:db/ident :bf/descriptionConventions,
   :dcterms/modified ["2016-04-24 (fixed domain name)" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/AdminMetadata,
   :rdfs/label "Description conventions",
   :rdfs/range :bf/DescriptionConventions,
   :skos/definition
   "Rules used for the descriptive content of the resource description."})

(def descriptionLanguage
  "Language used for the metadata."
  {:db/ident         :bf/descriptionLanguage,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :bf/AdminMetadata,
   :rdfs/label       "Description language",
   :rdfs/range       :bf/Language,
   :skos/definition  "Language used for the metadata."})

(def descriptionLevel
  "Designation of the descriptive content of the metadata."
  {:db/ident         :bf/descriptionLevel,
   :dcterms/modified "2022-10-03 (New [GH43])",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :bf/AdminMetadata,
   :rdfs/label       "Description level",
   :rdfs/range       :bf/DescriptionLevel,
   :skos/definition  "Designation of the descriptive content of the metadata."})

(def descriptionModifier
  "Agency that modified a description."
  {:db/ident         :bf/descriptionModifier,
   :dcterms/modified ["2021-06-09 (Removed range [GH63])" "2016-04-21 (New)"],
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :bf/AdminMetadata,
   :rdfs/label       "Description modifier",
   :rdfs/range       :rdfs/Resource,
   :skos/definition  "Agency that modified a description."})

(def digitalCharacteristic
  "Technical specification relating to the digital encoding of text, image, audio, video, and other types of data in a resource."
  {:db/ident :bf/digitalCharacteristic,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Digital characteristic",
   :rdfs/range :bf/DigitalCharacteristic,
   :skos/definition
   "Technical specification relating to the digital encoding of text, image, audio, video, and other types of data in a resource."})

(def dimensions
  "Measurements of the carrier or carriers and/or the container of a resource."
  {:db/ident :bf/dimensions,
   :dcterms/modified ["2021-06-09 (Added note [GH39])" "2016-04-21 (New)"],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Dimensions",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Measurements of the carrier or carriers and/or the container of a resource.",
   :skos/editorialNote
   "See also the ARM Ontology for strategies to model this information in greater detail."})

(def dissertation
  "Work presented as part of the formal requirements for an academic degree."
  {:db/ident :bf/dissertation,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Dissertation Information",
   :rdfs/range :bf/Dissertation,
   :skos/definition
   "Work presented as part of the formal requirements for an academic degree."})

(def duration
  "Information about the playing time, running time, etc. of a resource."
  {:db/ident :bf/duration,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Duration",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Information about the playing time, running time, etc. of a resource."})

(def edition
  "Edition of the classification scheme, such as full, abridged or a number, when a classification scheme designates editions."
  {:db/ident :bf/edition,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Classification,
   :rdfs/label "Classification scheme edition",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Edition of the classification scheme, such as full, abridged or a number, when a classification scheme designates editions."})

(def editionEnumeration
  "Enumeration of the edition; usually transcribed."
  {:db/ident         :bf/editionEnumeration,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :bf/Instance,
   :rdfs/label       "Edition enumeration",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "Enumeration of the edition; usually transcribed."})

(def editionStatement
  "Information identifying the edition or version of the resource and associated statements of responsibility for the edition; usually transcribed."
  {:db/ident :bf/editionStatement,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Edition statement",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Information identifying the edition or version of the resource and associated statements of responsibility for the edition; usually transcribed."})

(def electronicLocator
  "Electronic location from which the resource is available."
  {:db/ident :bf/electronicLocator,
   :dcterms/modified ["2021-06-09 (Removed domain [GH66])" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Electronic location",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Electronic location from which the resource is available."})

(def emulsion
  "Suspension of light-sensitive chemicals used as a coating on a microfilm or microfiche, e.g., silver halide."
  {:db/ident :bf/emulsion,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Emulsion",
   :rdfs/range :bf/Emulsion,
   :skos/definition
   "Suspension of light-sensitive chemicals used as a coating on a microfilm or microfiche, e.g., silver halide."})

(def ensemble
  "Ensemble applicable to the Work."
  {:db/ident :bf/ensemble,
   :dcterms/modified
   ["2021-06-09 (Changed domain [GH56], Modified definition [GH56])"
    "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Work,
   :rdfs/label "Ensemble",
   :rdfs/range :bf/Ensemble,
   :skos/definition "Ensemble applicable to the Work."})

(def ensembleType
  "Specific type of ensemble, such as orchestra, band, guitar ensemble."
  {:db/ident :bf/ensembleType,
   :dcterms/modified ["2021-06-09 (Changed domain [GH56])" "2016-04-21 (New)"],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Ensemble,
   :rdfs/label "Ensemble type",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Specific type of ensemble, such as orchestra, band, guitar ensemble."})

(def enumerationAndChronology
  "Numbering and dates of issues or items held."
  {:db/ident :bf/enumerationAndChronology,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Item,
   :rdfs/label
   "Numbering or other enumeration and dates associated with issues or items held.",
   :rdfs/range :bf/EnumerationAndChronology,
   :skos/definition "Numbering and dates of issues or items held."})

(def equinox
  "One of two points of intersection of the ecliptic and the celestial equator, occupied by the sun when its declination is 0 degrees."
  {:db/ident :bf/equinox,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Cartographic,
   :rdfs/label "Cartographic equinox",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "One of two points of intersection of the ecliptic and the celestial equator, occupied by the sun when its declination is 0 degrees."})

(def eventContent
  "Work whose content is the described event."
  {:db/ident           :bf/eventContent,
   :dcterms/modified   ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf      :bf/eventContentOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :bf/Event,
   :rdfs/label         "Event content",
   :rdfs/range         :bf/Work,
   :rdfs/subPropertyOf :bf/relatedTo,
   :skos/definition    "Work whose content is the described event."})

(def eventContentOf
  "Event that is the content of the described work."
  {:db/ident           :bf/eventContentOf,
   :dcterms/modified   ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf      :bf/eventContent,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :bf/Work,
   :rdfs/label         "Has event content",
   :rdfs/range         :bf/Event,
   :rdfs/subPropertyOf :bf/relatedTo,
   :skos/definition    "Event that is the content of the described work."})

(def exclusionGRing
  "Coordinate pairs that identify the closed non-intersecting boundary of the area contained within the G-polygon outer ring that is excluded."
  {:db/ident :bf/exclusionGRing,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Cartographic,
   :rdfs/label "Cartographic G ring area excluded",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Coordinate pairs that identify the closed non-intersecting boundary of the area contained within the G-polygon outer ring that is excluded."})

(def expressionOf
  "Work that the described Work is an expression of. Use to connect Works under LRM/RDA guidelines or similar implementations."
  {:db/ident :bf/expressionOf,
   :dcterms/modified ["2016-04-29 (added inverse)"
                      "2021-06-09 (Modified definition [GH8])"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bf/hasExpression,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Work,
   :rdfs/label "Expression of",
   :rdfs/range :bf/Work,
   :rdfs/subPropertyOf :bf/relatedTo,
   :skos/definition
   "Work that the described Work is an expression of. Use to connect Works under LRM/RDA guidelines or similar implementations."})

(def extent
  "Number and type of units and/or subunits making up a resource."
  {:db/ident :bf/extent,
   :dcterms/modified ["2021-06-09 (Broadened range [GH30])" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Extent",
   :rdfs/range :bf/Extent,
   :skos/definition
   "Number and type of units and/or subunits making up a resource."})

(def findingAid
  "Relationship for archival, visual, and manuscript resources to a finding aid or similar control materials."
  {:db/ident :bf/findingAid,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bf/findingAidOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Finding aid",
   :rdfs/subPropertyOf :bf/accompaniedBy,
   :skos/definition
   "Relationship for archival, visual, and manuscript resources to a finding aid or similar control materials."})

(def findingAidOf
  "Finding aid or similar control materials for archival, visual, and manuscript resources."
  {:db/ident :bf/findingAidOf,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bf/findingAid,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Finding aid for",
   :rdfs/subPropertyOf :bf/accompanies,
   :skos/definition
   "Finding aid or similar control materials for archival, visual, and manuscript resources."})

(def firstIssue
  "Beginning date of a resource and/or the sequential designations."
  {:db/ident :bf/firstIssue,
   :dcterms/modified ["2021-06-09 (Removed domain [GH76])" "2016-04-21 (New)"],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Multipart first issue",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Beginning date of a resource and/or the sequential designations."})

(def fontSize
  "Size of the type used to represent the characters and symbols in a resource."
  {:db/ident :bf/fontSize,
   :dcterms/modified ["2021-06-09 (Added note [GH40])" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Font size",
   :rdfs/range :bf/FontSize,
   :skos/definition
   "Size of the type used to represent the characters and symbols in a resource.",
   :skos/editorialNote
   "See also the ARM Ontology for strategies to model this information in greater detail."})

(def frequency
  "Intervals at which the parts of a serially produced resource or the updates to an integrating resource are issued."
  {:db/ident :bf/frequency,
   :dcterms/modified ["2021-06-09 (Removed domain [GH76])" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Frequency",
   :rdfs/range :bf/Frequency,
   :skos/definition
   "Intervals at which the parts of a serially produced resource or the updates to an integrating resource are issued."})

(def generation
  "Relationship between an original carrier and the carrier of a reproduction made from the original."
  {:db/ident :bf/generation,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Generation",
   :rdfs/range :bf/Generation,
   :skos/definition
   "Relationship between an original carrier and the carrier of a reproduction made from the original."})

(def generationDate
  "Date of conversion of the metadata from another format."
  {:db/ident :bf/generationDate,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/AdminMetadata,
   :rdfs/label "Date generated",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :bf/date,
   :skos/definition "Date of conversion of the metadata from another format."})

(def generationProcess
  "Indication of the program or process used to generate the description by application of a particular transformation."
  {:db/ident :bf/generationProcess,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/AdminMetadata,
   :rdfs/label "Description generation",
   :rdfs/range :bf/GenerationProcess,
   :skos/definition
   "Indication of the program or process used to generate the description by application of a particular transformation."})

(def genreForm
  "Form category or genre to which a resource belongs"
  {:db/ident         :bf/genreForm,
   :dcterms/modified ["2021-06-09 (Removed range [GH16])" "2016-04-21 (New)"],
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Suggested use - With Work, Instance or Item",
   :rdfs/label       "Genre/form",
   :rdfs/range       :rdfs/Resource,
   :skos/definition  "Form category or genre to which a resource belongs"})

(def geographicCoverage
  "Geographic coverage of the content of the resource."
  {:db/ident         :bf/geographicCoverage,
   :dcterms/modified ["2021-06-09 (Removed domain [GH15])"
                      "2017-02-06 (Changed from data to object property)"
                      "2016-04-21 (New)"],
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :rdfs/Resource,
   :rdfs/label       "Geographic coverage",
   :rdfs/range       :bf/GeographicCoverage,
   :skos/definition  "Geographic coverage of the content of the resource."})

(def grantingInstitution
  "Name of degree granting institution."
  {:db/ident         :bf/grantingInstitution,
   :dcterms/modified ["2021-06-09 (Removed range [GH63])" "2016-04-21 (New)"],
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :bf/Dissertation,
   :rdfs/label       "Degree issuing institution",
   :rdfs/range       :rdfs/Resource,
   :skos/definition  "Name of degree granting institution."})

(def hasDerivative
  "Resource that is a modification of the described work."
  {:db/ident :bf/hasDerivative,
   :dcterms/modified ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf :bf/derivativeOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Has derivative",
   :rdfs/subPropertyOf :bf/relatedTo,
   :skos/definition "Resource that is a modification of the described work."})

(def hasEquivalent
  "Resource embodies the same content as the described resource."
  {:db/ident :bf/hasEquivalent,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/SymmetricProperty,
   :rdfs/comment ["Suggested value - Work, Instance or Item"
                  "Suggested use - With Work, Instance or Item"],
   :rdfs/label "Equivalence",
   :rdfs/subPropertyOf :bf/relatedTo,
   :skos/definition
   "Resource embodies the same content as the described resource."})

(def hasExpression
  "Work that is an expression of a described Work. Use to relate Works under LRM/RDA guidelines or similar implementations."
  {:db/ident :bf/hasExpression,
   :dcterms/modified ["2021-06-09 (Modified definition [GH8])"
                      "2016-04-29 (added inverse)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bf/expressionOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Work,
   :rdfs/label "Expressed as",
   :rdfs/range :bf/Work,
   :rdfs/subPropertyOf :bf/relatedTo,
   :skos/definition
   "Work that is an expression of a described Work. Use to relate Works under LRM/RDA guidelines or similar implementations."})

(def hasInstance
  "Instance is related to described Work. For use to connect Works to Instances in the BIBFRAME structure."
  {:db/ident :bf/hasInstance,
   :dcterms/modified ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf :bf/instanceOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Work,
   :rdfs/label "Instance of Work",
   :rdfs/range :bf/Instance,
   :rdfs/subPropertyOf :bf/relatedTo,
   :skos/definition
   "Instance is related to described Work. For use to connect Works to Instances in the BIBFRAME structure."})

(def hasItem
  "Item which is an example of the described Instance."
  {:db/ident           :bf/hasItem,
   :dcterms/modified   ["2017-02-07 (slight revision of definition)"
                        "2016-04-21 (New)"
                        "2016-04-29 (added inverse)"],
   :owl/inverseOf      :bf/itemOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :bf/Instance,
   :rdfs/label         "Has holding",
   :rdfs/range         :bf/Item,
   :rdfs/subPropertyOf :bf/relatedTo,
   :skos/definition    "Item which is an example of the described Instance."})

(def hasPart
  "Resource that is included either physically or logically in the described resource"
  {:db/ident :bf/hasPart,
   :dcterms/modified ["2021-06-09 (Use with Event also [GH9])"
                      "2016-04-21 (New)"
                      "2016-04-29 (added inverse)"],
   :owl/inverseOf :bf/partOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work, Instance, Item or Event"
                  "Suggested use - With Work, Instance, Item or Event"],
   :rdfs/label "Has part",
   :rdfs/subPropertyOf :bf/relatedTo,
   :skos/definition
   "Resource that is included either physically or logically in the described resource"})

(def hasReproduction
  "Resource that reproduces another Resource."
  {:db/ident           :bf/hasReproduction,
   :dcterms/modified   ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf      :bf/reproductionOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :bf/Instance,
   :rdfs/label         "Reproduced as",
   :rdfs/range         :bf/Instance,
   :rdfs/subPropertyOf :bf/hasEquivalent,
   :skos/definition    "Resource that reproduces another Resource."})

(def hasSeries
  "Resource in which the part has been issued; the title of the larger resource appears on the part."
  {:db/ident :bf/hasSeries,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bf/seriesOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "In series",
   :rdfs/subPropertyOf :bf/partOf,
   :skos/definition
   "Resource in which the part has been issued; the title of the larger resource appears on the part."})

(def hasSubseries
  "series resource that is part of another series."
  {:db/ident           :bf/hasSubseries,
   :dcterms/modified   ["2016-04-29 (added inverse, updated range)"
                        "2016-04-21 (New)"],
   :owl/inverseOf      :bf/subseriesOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       ["Suggested value - Work or Instance"
                        "Suggested use - With Work or Instance"],
   :rdfs/label         "Subseries",
   :rdfs/subPropertyOf :bf/partOf,
   :skos/definition    "series resource that is part of another series."})

(def heldBy
  "Entity holding the item or from which it is available."
  {:db/ident         :bf/heldBy,
   :dcterms/modified ["2021-06-09 (Removed range [GH63])" "2016-04-21 (New)"],
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :bf/Item,
   :rdfs/label       "Held by",
   :rdfs/range       :rdfs/Resource,
   :skos/definition  "Entity holding the item or from which it is available."})

(def hierarchicalLevel
  "Hierarchical position of the described materials relative to other material from the same source."
  {:db/ident :bf/hierarchicalLevel,
   :dcterms/modified ["2021-06-09 (Modified range [GH77])" "2016-04-21 (New)"],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/CollectionArrangement,
   :rdfs/label "Hierarchical level of material",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Hierarchical position of the described materials relative to other material from the same source."})

(def historyOfWork
  "Information about the history of a Work."
  {:db/ident         :bf/historyOfWork,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :bf/Work,
   :rdfs/label       "History of the work",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "Information about the history of a Work."})

(def identifiedBy
  "Character string associated with a resource that serves to differentiate that resource from other resources, i.e., that uniquely identifies an entity."
  {:db/ident :bf/identifiedBy,
   :dcterms/modified ["2017-05-04 (New inverse)" "2016-04-21 (New)"],
   :owl/inverseOf :bf/identifies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Identifier",
   :rdfs/range :bf/Identifier,
   :skos/definition
   "Character string associated with a resource that serves to differentiate that resource from other resources, i.e., that uniquely identifies an entity."})

(def identifies
  "Resource that is associated with a character string that serves to differentiate one resource from another."
  {:db/ident :bf/identifies,
   :dcterms/modified "2017-02-03 (New inverse)",
   :owl/inverseOf :bf/identifiedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Identifier,
   :rdfs/label "Resource identified",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Resource that is associated with a character string that serves to differentiate one resource from another."})

(def illustrativeContent
  "Information about content intended to illustrate a resource."
  {:db/ident :bf/illustrativeContent,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Illustrative content information",
   :rdfs/range :bf/Illustration,
   :skos/definition
   "Information about content intended to illustrate a resource."})

(def immediateAcquisition
  "Information about the circumstances, e.g., source, date, method, under which the resource was directly acquired."
  {:db/ident :bf/immediateAcquisition,
   :dcterms/modified ["2017-02-06 (Changed from data to object property)"
                      "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Item,
   :rdfs/label "Immediate acquisition",
   :rdfs/range :bf/ImmediateAcquisition,
   :skos/definition
   "Information about the circumstances, e.g., source, date, method, under which the resource was directly acquired."})

(def index
  "Resource has an accompanying index"
  {:db/ident           :bf/index,
   :dcterms/modified   ["2017-02-03 (corrected label)"
                        "2016-04-29 (added inverse, updated range)"
                        "2016-04-21 (New)"],
   :owl/inverseOf      :bf/indexOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       ["Suggested value - Work or Instance"
                        "Suggested use - With Work or Instance"],
   :rdfs/label         "Has index",
   :rdfs/subPropertyOf :bf/accompaniedBy,
   :skos/definition    "Resource has an accompanying index"})

(def indexOf
  "Index that accompanies a resource."
  {:db/ident           :bf/indexOf,
   :dcterms/modified   ["2016-04-29 (added inverse, updated range)"
                        "2016-04-21 (New)"],
   :owl/inverseOf      :bf/index,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       ["Suggested value - Work or Instance"
                        "Suggested use - With Work or Instance"],
   :rdfs/label         "Index to",
   :rdfs/subPropertyOf :bf/accompanies,
   :skos/definition    "Index that accompanies a resource."})

(def instanceOf
  "Work the Instance described instantiates or manifests. For use to connect Instances to Works in the BIBFRAME structure."
  {:db/ident :bf/instanceOf,
   :dcterms/modified ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf :bf/hasInstance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Instance of",
   :rdfs/range :bf/Work,
   :rdfs/subPropertyOf :bf/relatedTo,
   :skos/definition
   "Work the Instance described instantiates or manifests. For use to connect Instances to Works in the BIBFRAME structure."})

(def instrument
  "Instrument for which a musical Work is appropriate."
  {:db/ident         :bf/instrument,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :bf/Work,
   :rdfs/label       "Instrument",
   :rdfs/range       :bf/MusicInstrument,
   :skos/definition  "Instrument for which a musical Work is appropriate."})

(def instrumentalType
  "Specific role of instrument, such as alternate, doubling, solo, ensemble."
  {:db/ident :bf/instrumentalType,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/MusicInstrument,
   :rdfs/label "Instrument role",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Specific role of instrument, such as alternate, doubling, solo, ensemble."})

(def intendedAudience
  "Information that identifies the specific audience or intellectual level for which the content of the resource is considered appropriate."
  {:db/ident :bf/intendedAudience,
   :dcterms/modified ["2022-10-03 (Removed range [GH74])" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Intended audience",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Information that identifies the specific audience or intellectual level for which the content of the resource is considered appropriate."})

(def issuance
  "Categorization reflecting whether a resource is issued in one or more parts, the way it is updated, and its intended termination."
  {:db/ident :bf/issuance,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Mode of issuance",
   :rdfs/range :bf/Issuance,
   :skos/definition
   "Categorization reflecting whether a resource is issued in one or more parts, the way it is updated, and its intended termination."})

(def issuedWith
  "Resource that is issued on the same carrier as the resource being described."
  {:db/ident :bf/issuedWith,
   :dcterms/modified
   ["2021-06-09 (Removed range [GH62], Broadened domain [GH62])"
    "2016-04-21 (New)"],
   :rdf/type :owl/SymmetricProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Issued with",
   :rdfs/subPropertyOf :bf/accompanies,
   :skos/definition
   "Resource that is issued on the same carrier as the resource being described."})

(def itemOf
  "Instance for which the described Item is an example."
  {:db/ident           :bf/itemOf,
   :dcterms/modified   ["2017-02-07 (slight revision of definition)"
                        "2016-04-21 (New)"
                        "2016-04-29 (added inverse)"],
   :owl/inverseOf      :bf/hasItem,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :bf/Item,
   :rdfs/label         "Holding for",
   :rdfs/range         :bf/Instance,
   :rdfs/subPropertyOf :bf/relatedTo,
   :skos/definition    "Instance for which the described Item is an example."})

(def itemPortion
  "Number attached to a classification string that indicates a particular item."
  {:db/ident :bf/itemPortion,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Classification,
   :rdfs/label "Classification item number",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Number attached to a classification string that indicates a particular item."})

(def language
  "Language associated with a resource or its parts."
  {:db/ident         :bf/language,
   :dcterms/modified ["2022-10-03 (Removed range [GH70])" "2016-04-21 (New)"],
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :rdfs/Resource,
   :rdfs/label       "Language information",
   :rdfs/range       :rdfs/Resource,
   :skos/definition  "Language associated with a resource or its parts."})

(def lastIssue
  "Ending date of a resource and/or the sequential designations."
  {:db/ident :bf/lastIssue,
   :dcterms/modified ["2021-06-09 (Removed domain [GH76])" "2016-04-21 (New)"],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Multipart last issue",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Ending date of a resource and/or the sequential designations."})

(def layout
  "Arrangement of text, images, tactile notation, etc., in a resource."
  {:db/ident :bf/layout,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Layout",
   :rdfs/range :bf/Layout,
   :skos/definition
   "Arrangement of text, images, tactile notation, etc., in a resource."})

(def legalDate
  "Date of legal work, or promulgation of a law, or signing of a treaty."
  {:db/ident :bf/legalDate,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Work,
   :rdfs/label "Date of legal work",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :bf/date,
   :skos/definition
   "Date of legal work, or promulgation of a law, or signing of a treaty."})

(def mainTitle
  "Title being addressed. Possible title component."
  {:db/ident         :bf/mainTitle,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :bf/Title,
   :rdfs/label       "Main title",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "Title being addressed. Possible title component."})

(def material
  "Resource uses, is composed of, integrates, etc. the related material."
  {:db/ident :bf/material,
   :dcterms/modified "2021-06-09 (New [GH26])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work, Instance or Item",
   :rdfs/label "Material",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Resource uses, is composed of, integrates, etc. the related material."})

(def materialOf
  "This material is related to a resource."
  {:db/ident         :bf/materialOf,
   :dcterms/modified "2021-06-09 (New [GH26])",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Suggested use - With Work, Instance or Item",
   :rdfs/label       "Material of",
   :rdfs/range       :rdfs/Resource,
   :skos/definition  "This material is related to a resource."})

(def media
  "Categorization reflecting the general type of intermediation device required to view, play, run, etc., the content of a resource."
  {:db/ident :bf/media,
   :dcterms/modified ["2022-10-03 (Removed range [GH73])" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Media type",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Categorization reflecting the general type of intermediation device required to view, play, run, etc., the content of a resource."})

(def mergedToForm
  "One of two or more resources that come together to form a new resource."
  {:db/ident :bf/mergedToForm,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bf/mergerOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Merged to form",
   :rdfs/subPropertyOf :bf/succeededBy,
   :skos/definition
   "One of two or more resources that come together to form a new resource."})

(def mergerOf
  "One of two or more resources which came together to form a new resource."
  {:db/ident :bf/mergerOf,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bf/mergedToForm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Merger of",
   :rdfs/subPropertyOf :bf/precededBy,
   :skos/definition
   "One of two or more resources which came together to form a new resource."})

(def mount
  "Physical material or object used for the support or backing to which the base material of a resource has been attached."
  {:db/ident :bf/mount,
   :dcterms/modified ["2021-06-09 (Modified label [GH29])" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Mount material or object",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Physical material or object used for the support or backing to which the base material of a resource has been attached."})

(def musicFormat
  "Layout for content of a resource that is presented in the form of musical notation, such as full score, condensed score, vocal score, etc."
  {:db/ident :bf/musicFormat,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Format of notated music",
   :rdfs/range :bf/MusicFormat,
   :skos/definition
   "Layout for content of a resource that is presented in the form of musical notation, such as full score, condensed score, vocal score, etc."})

(def musicKey
  "Pitch and mode for music."
  {:db/ident         :bf/musicKey,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :bf/Work,
   :rdfs/label       "Music key",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "Pitch and mode for music."})

(def musicMedium
  "Instrumental, vocal, and/or other medium of performance for which a musical resource was originally conceived, written or performed."
  {:db/ident :bf/musicMedium,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Work,
   :rdfs/label "Music medium of performance",
   :rdfs/range :bf/MusicMedium,
   :skos/definition
   "Instrumental, vocal, and/or other medium of performance for which a musical resource was originally conceived, written or performed."})

(def musicOpusNumber
  "Numeric designation of a musical work assigned by a composer, publisher, or a musicologist."
  {:db/ident :bf/musicOpusNumber,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Work,
   :rdfs/label "Music opus number",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Numeric designation of a musical work assigned by a composer, publisher, or a musicologist."})

(def musicSerialNumber
  "Numeric designation for musical works consecutively numbered in music reference sources."
  {:db/ident :bf/musicSerialNumber,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Work,
   :rdfs/label "Music serial number",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Numeric designation for musical works consecutively numbered in music reference sources."})

(def musicThematicNumber
  "Numeric designation for a musical work as found in a thematic index for the composer."
  {:db/ident :bf/musicThematicNumber,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Work,
   :rdfs/label "Music thematic number",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Numeric designation for a musical work as found in a thematic index for the composer."})

(def natureOfContent
  "Characterization that epitomizes the primary content of a resource, e.g., field recording of birdsong; combined time series analysis and graph plotting system."
  {:db/ident :bf/natureOfContent,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Content nature",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Characterization that epitomizes the primary content of a resource, e.g., field recording of birdsong; combined time series analysis and graph plotting system."})

(def notation
  "Alphabet, script, or symbol system used to convey the content of the resource, including specialized scripts, typefaces, tactile notation, movement notation, and musical notation."
  {:db/ident :bf/notation,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Notation system",
   :rdfs/range :bf/Notation,
   :skos/definition
   "Alphabet, script, or symbol system used to convey the content of the resource, including specialized scripts, typefaces, tactile notation, movement notation, and musical notation."})

(def note
  "General textual information relating to a resource, such as Information about a specific copy of a resource or information about a particular attribute of a resource."
  {:db/ident :bf/note,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Note",
   :rdfs/range :bf/Note,
   :skos/definition
   "General textual information relating to a resource, such as Information about a specific copy of a resource or information about a particular attribute of a resource."})

(def noteFor
  "Relates a Note resource to the resource to which the note pertains."
  {:db/ident :bf/noteFor,
   :dcterms/modified "2021-06-09 (New [GH34])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Note,
   :rdfs/label "Note for",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Relates a Note resource to the resource to which the note pertains."})

(def noteType
  "Type of note."
  {:db/ident         :bf/noteType,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :bf/Note,
   :rdfs/label       "Note type",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "Type of note."})

(def originDate
  "Date or date range associated with the creation of a Work."
  {:db/ident :bf/originDate,
   :dcterms/modified
   ["2021-06-09 (Better align definition with property name [GH50])"
    "2016-04-21 (New)"],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Work,
   :rdfs/label "Origin date",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :bf/date,
   :skos/definition
   "Date or date range associated with the creation of a Work."})

(def originPlace
  "Place from which the creation of the resource originated."
  {:db/ident :bf/originPlace,
   :dcterms/modified
   ["2022-10-03 (updated domain [GH83])"
    "2021-06-09 (Better align definition with property name [GH50], Removed range [GH19])"
    "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Origin place",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :bf/place,
   :skos/definition
   "Place from which the creation of the resource originated."})

(def originalVersion
  "Resource is the original version of which this resource is a reproduction."
  {:db/ident :bf/originalVersion,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bf/originalVersionOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Original version",
   :rdfs/subPropertyOf :bf/derivativeOf,
   :skos/definition
   "Resource is the original version of which this resource is a reproduction."})

(def originalVersionOf
  "Original version of a resource."
  {:db/ident           :bf/originalVersionOf,
   :dcterms/modified   ["2016-04-29 (added inverse, updated range)"
                        "2016-04-21 (New)"],
   :owl/inverseOf      :bf/originalVersion,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       ["Suggested value - Work or Instance"
                        "Suggested use - With Work or Instance"],
   :rdfs/label         "Original version of",
   :rdfs/subPropertyOf :bf/hasDerivative,
   :skos/definition    "Original version of a resource."})

(def otherEdition
  "Resource has other available editions, for example simultaneously published language editions or reprints."
  {:db/ident :bf/otherEdition,
   :dcterms/modified ["2021-06-09 (Change subproperty to relatedTo [GH61])"
                      "2016-05-13 (symmetrical)"
                      "2016-04-21 (New)"],
   :rdf/type :owl/SymmetricProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Other edition",
   :rdfs/subPropertyOf :bf/relatedTo,
   :skos/definition
   "Resource has other available editions, for example simultaneously published language editions or reprints."})

(def otherPhysicalFormat
  "Resource that is manifested in another physical carrier."
  {:db/ident :bf/otherPhysicalFormat,
   :dcterms/modified ["2021-06-09 (Broadened domain [GH79])"
                      "2016-04-21 (New)"],
   :rdf/type :owl/SymmetricProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Has other physical format",
   :rdfs/range :bf/Instance,
   :rdfs/subPropertyOf :bf/hasEquivalent,
   :skos/definition "Resource that is manifested in another physical carrier."})

(def outerGRing
  "Coordinate pairs that identify the closed non-intersecting boundary of the area covered."
  {:db/ident :bf/outerGRing,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Cartographic,
   :rdfs/label "Cartographic outer G ring area covered",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Coordinate pairs that identify the closed non-intersecting boundary of the area covered."})

(def part
  "Part of a resource to which information applies."
  {:db/ident         :bf/part,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :rdfs/Resource,
   :rdfs/label       "Part",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "Part of a resource to which information applies."})

(def partName
  "Part or section name of a title. Possible title component."
  {:db/ident :bf/partName,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Title,
   :rdfs/label "Part title",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Part or section name of a title. Possible title component."})

(def partNumber
  "Part or section enumeration of a title. Possible title component."
  {:db/ident :bf/partNumber,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Title,
   :rdfs/label "Part number",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Part or section enumeration of a title. Possible title component."})

(def partOf
  "Resource in which the described resource is physically or logically contained."
  {:db/ident :bf/partOf,
   :dcterms/modified ["2016-04-29 (added inverse)"
                      "2016-04-21 (New)"
                      "2021-06-09 (Use with Event also [GH9])"],
   :owl/inverseOf :bf/hasPart,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work, Instance, Item or Event"
                  "Suggested use - With Work, Instance, Item or Event"],
   :rdfs/label "Is part of",
   :rdfs/subPropertyOf :bf/relatedTo,
   :skos/definition
   "Resource in which the described resource is physically or logically contained."})

(def pattern
  "Pattern of arrangement of materials within a unit."
  {:db/ident         :bf/pattern,
   :dcterms/modified ["2021-06-09 (Modified range [GH77])" "2016-04-21 (New)"],
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :bf/CollectionArrangement,
   :rdfs/label       "Arrangement of material",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "Pattern of arrangement of materials within a unit."})

(def physicalLocation
  "Location in the holding agency where the item is shelved or stored."
  {:db/ident :bf/physicalLocation,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Item,
   :rdfs/label "Storing or shelving location",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Location in the holding agency where the item is shelved or stored."})

(def place
  "Geographic location or place entity associated with a resource or element of description, such as the place associated with the publication, printing, distribution, issue, release or production of a resource, place of an event."
  {:db/ident :bf/place,
   :dcterms/modified ["2021-06-09 (Removed range [GH19])" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Place",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Geographic location or place entity associated with a resource or element of description, such as the place associated with the publication, printing, distribution, issue, release or production of a resource, place of an event."})

(def polarity
  "Relationship of the colors and tones in an image to the colors and tones of the object reproduced."
  {:db/ident :bf/polarity,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Polarity",
   :rdfs/range :bf/Polarity,
   :skos/definition
   "Relationship of the colors and tones in an image to the colors and tones of the object reproduced."})

(def precededBy
  "Resource that precedes the resource being described, e.g., is earlier in time or before in narrative."
  {:db/ident :bf/precededBy,
   :dcterms/modified ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf :bf/succeededBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Preceded by",
   :rdfs/subPropertyOf :bf/relatedTo,
   :skos/definition
   "Resource that precedes the resource being described, e.g., is earlier in time or before in narrative."})

(def preferredCitation
  "Citation to the resource preferred by its custodian of the resource."
  {:db/ident :bf/preferredCitation,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Preferred citation",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Citation to the resource preferred by its custodian of the resource."})

(def productionMethod
  "Process used to produce a resource."
  {:db/ident         :bf/productionMethod,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :bf/Instance,
   :rdfs/label       "Production method",
   :rdfs/range       :bf/ProductionMethod,
   :skos/definition  "Process used to produce a resource."})

(def projection
  "Method or system used to represent the surface of the earth or of a celestial sphere on a plane."
  {:db/ident :bf/projection,
   :dcterms/modified ["2017-02-03 (changed from data to object property)"
                      "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Cartographic,
   :rdfs/label "Cartographic projection",
   :rdfs/range :bf/Projection,
   :skos/definition
   "Method or system used to represent the surface of the earth or of a celestial sphere on a plane."})

(def projectionCharacteristic
  "Technical specification relating to the projection of a motion picture film."
  {:db/ident :bf/projectionCharacteristic,
   :dcterms/modified ["2017-02-03 (fixed typo in property name)"
                      "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Projection characteristic",
   :rdfs/range :bf/ProjectionCharacteristic,
   :skos/definition
   "Technical specification relating to the projection of a motion picture film."})

(def provisionActivity
  "Place, name, and/or date information relating to the publication, printing, distribution, issue, release, production, etc. of a resource."
  {:db/ident :bf/provisionActivity,
   :dcterms/modified
   ["2017-02-03 (revised label and slightly revised definition)"
    "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Provision activity",
   :rdfs/range :bf/ProvisionActivity,
   :skos/definition
   "Place, name, and/or date information relating to the publication, printing, distribution, issue, release, production, etc. of a resource."})

(def provisionActivityStatement
  "Statement relating to providers of a resource; usually transcribed."
  {:db/ident :bf/provisionActivityStatement,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Provider statement",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Statement relating to providers of a resource; usually transcribed."})

(def pubFrequency
  "Relates a resource to a publication frequency resource to capture such details as first issue, last issue, status, etc."
  {:db/ident :bf/pubFrequency,
   :dcterms/modified "2021-06-09 (New [GH76])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Publication frequency",
   :rdfs/range :bf/PubFrequency,
   :skos/definition
   "Relates a resource to a publication frequency resource to capture such details as first issue, last issue, status, etc."})

(def qualifier
  "Qualifier of information, such as an addition to a title to make it unique or qualifying information associated with an identifier."
  {:db/ident :bf/qualifier,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Qualifier",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Qualifier of information, such as an addition to a title to make it unique or qualifying information associated with an identifier."})

(def reductionRatio
  "Size of a micro-image in relation to the original from which it was produced."
  {:db/ident :bf/reductionRatio,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Reduction ratio",
   :rdfs/range :bf/ReductionRatio,
   :skos/definition
   "Size of a micro-image in relation to the original from which it was produced."})

(def referencedBy
  "Resource that references the described resource"
  {:db/ident           :bf/referencedBy,
   :dcterms/modified   ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf      :bf/references,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       ["Suggested value - Work, Instance or Item"
                        "Suggested use - With Work, Instance or Item"],
   :rdfs/label         "Referenced by",
   :rdfs/subPropertyOf :bf/relatedTo,
   :skos/definition    "Resource that references the described resource"})

(def references
  "Resource that is referenced by the described resource."
  {:db/ident :bf/references,
   :dcterms/modified ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf :bf/referencedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work, Instance or Item"
                  "Suggested use - With Work, Instance or Item"],
   :rdfs/label "References",
   :rdfs/subPropertyOf :bf/relatedTo,
   :skos/definition "Resource that is referenced by the described resource."})

(def relatedTo
  "Any relationship between Work, Instance, Item, and Event resources."
  {:db/ident :bf/relatedTo,
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
  {:db/ident :bf/replacedBy,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2022-10-03 (corrected label [GH85])"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bf/replacementOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested use - With Work or Instance"
                  "Suggested value - Work or Instance"],
   :rdfs/label "Replaced by",
   :rdfs/subPropertyOf :bf/succeededBy,
   :skos/definition
   "Later resource used in place of an earlier resource, usually because the later resource contains updated or new information."})

(def replacementOf
  "Earlier resource whose content has been replaced by a later resource, usually because the later resource contains updated or new information."
  {:db/ident :bf/replacementOf,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2022-10-03 (corrected label [GH85])"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bf/replacedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested use - With Work or Instance"
                  "Suggested value - Work or Instance"],
   :rdfs/label "Replacement of",
   :rdfs/subPropertyOf :bf/precededBy,
   :skos/definition
   "Earlier resource whose content has been replaced by a later resource, usually because the later resource contains updated or new information."})

(def reproductionOf
  "Resource that is a reproduction of another Resource."
  {:db/ident           :bf/reproductionOf,
   :dcterms/modified   ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf      :bf/hasReproduction,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :bf/Instance,
   :rdfs/label         "Reproduction of",
   :rdfs/range         :bf/Instance,
   :rdfs/subPropertyOf :bf/hasEquivalent,
   :skos/definition    "Resource that is a reproduction of another Resource."})

(def responsibilityStatement
  "Statement relating to any persons, families, or corporate bodies responsible for the creation of, or contributing to the content of a resource; usually transcribed."
  {:db/ident :bf/responsibilityStatement,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Creative responsibility statement",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Statement relating to any persons, families, or corporate bodies responsible for the creation of, or contributing to the content of a resource; usually transcribed."})

(def review
  "Review of a resource."
  {:db/ident         :bf/review,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Suggested use - With Work or Instance",
   :rdfs/label       "Review content",
   :rdfs/range       :bf/Review,
   :skos/definition  "Review of a resource."})

(def role
  "Function provided by a contributor, e.g., author, illustrator, etc."
  {:db/ident :bf/role,
   :dcterms/modified
   ["2017-02-03 (Changed from data to object property, adjusted label and definition)"
    "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Contribution,
   :rdfs/label "Contributor role",
   :rdfs/range :bf/Role,
   :skos/definition
   "Function provided by a contributor, e.g., author, illustrator, etc."})

(def scale
  "Ratio of the dimensions of a form contained or embodied in a resource to the dimensions of the entity it represents, e.g., for images or cartographic resources."
  {:db/ident :bf/scale,
   :dcterms/modified ["2017-02-03 (changed from data to object property)"
                      "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Scale",
   :rdfs/range :bf/Scale,
   :skos/definition
   "Ratio of the dimensions of a form contained or embodied in a resource to the dimensions of the entity it represents, e.g., for images or cartographic resources."})

(def schedulePart
  "Designates whether the classification number is from the standard or optional part of a schedule or table."
  {:db/ident :bf/schedulePart,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Classification,
   :rdfs/label "Classification designation",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Designates whether the classification number is from the standard or optional part of a schedule or table."})

(def separatedFrom
  "Resource that spun off a part of its content to form a new resource."
  {:db/ident :bf/separatedFrom,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bf/continuedInPartBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Separated from",
   :rdfs/subPropertyOf :bf/precededBy,
   :skos/definition
   "Resource that spun off a part of its content to form a new resource."})

(def seriesEnumeration
  "Series enumeration of the resource; usually transcribed."
  {:db/ident :bf/seriesEnumeration,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Series enumeration",
   :rdfs/range :rdfs/Literal,
   :skos/definition "Series enumeration of the resource; usually transcribed."})

(def seriesOf
  "Resource that is a part of a larger resource."
  {:db/ident           :bf/seriesOf,
   :dcterms/modified   ["2016-04-29 (added inverse, updated range)"
                        "2016-04-21 (New)"],
   :owl/inverseOf      :bf/hasSeries,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       ["Suggested value - Work or Instance"
                        "Suggested use - With Work or Instance"],
   :rdfs/label         "Series container of",
   :rdfs/subPropertyOf :bf/hasPart,
   :skos/definition    "Resource that is a part of a larger resource."})

(def seriesStatement
  "Statement of the series the resource is in; usually transcribed; includes the ISSN if applicable."
  {:db/ident :bf/seriesStatement,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Series statement",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Statement of the series the resource is in; usually transcribed; includes the ISSN if applicable."})

(def shelfMark
  "Piece identifier, such as a call or other type of number."
  {:db/ident :bf/shelfMark,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Item,
   :rdfs/label "Shelf mark",
   :rdfs/range :bf/ShelfMark,
   :skos/definition
   "Piece identifier, such as a call or other type of number."})

(def soundCharacteristic
  "Technical specification relating to the encoding of sound in a resource."
  {:db/ident :bf/soundCharacteristic,
   :dcterms/modified ["2016-04-21 (fixed name and range typos)"
                      "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Sound characteristic",
   :rdfs/range :bf/SoundCharacteristic,
   :skos/definition
   "Technical specification relating to the encoding of sound in a resource."})

(def soundContent
  "Indication of whether the production of sound is an integral part of the resource."
  {:db/ident :bf/soundContent,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Sound content",
   :rdfs/range :bf/SoundContent,
   :skos/definition
   "Indication of whether the production of sound is an integral part of the resource."})

(def source
  "Resource from which value or label came or was derived, such as the formal source/scheme from which a classification number is taken or derived, list from which an agent name is taken or derived, source within which an identifier is unique."
  {:db/ident :bf/source,
   :dcterms/modified ["2021-06-09 (Removed range [GH63])" "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Source",
   :rdfs/range :rdfs/Resource,
   :skos/definition
   "Resource from which value or label came or was derived, such as the formal source/scheme from which a classification number is taken or derived, list from which an agent name is taken or derived, source within which an identifier is unique."})

(def spanEnd
  "Ending number of classification number span."
  {:db/ident         :bf/spanEnd,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :bf/Classification,
   :rdfs/label       "Classification number span end",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "Ending number of classification number span."})

(def splitInto
  "One of two or more resources resulting from the division of an earlier resource into separate resources."
  {:db/ident :bf/splitInto,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bf/continuesInPart,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Split into",
   :rdfs/subPropertyOf :bf/succeededBy,
   :skos/definition
   "One of two or more resources resulting from the division of an earlier resource into separate resources."})

(def status
  "Designation of the validity or position of something, such as indication that the classification number is canceled or invalid, circulation availability of an item, indication of whether the identifier is canceled or invalid."
  {:db/ident :bf/status,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Status",
   :rdfs/range :bf/Status,
   :skos/definition
   "Designation of the validity or position of something, such as indication that the classification number is canceled or invalid, circulation availability of an item, indication of whether the identifier is canceled or invalid."})

(def subject
  "Subject term(s) describing a resource."
  {:db/ident         :bf/subject,
   :dcterms/modified ["2021-06-09 (Broadened domain [GH21])"
                      "2016-04-21 (New)"],
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Suggested use - With Work, Instance, Item or Event",
   :rdfs/label       "Subject",
   :rdfs/range       :rdfs/Resource,
   :skos/definition  "Subject term(s) describing a resource."})

(def subjectOf
  "Relates a subject to that which it describes."
  {:db/ident         :bf/subjectOf,
   :dcterms/modified "2021-06-09 (New [GH20])",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Suggested value - Work, Instance, Item or Event",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/label       "Subject of",
   :skos/definition  "Relates a subject to that which it describes."})

(def sublocation
  "Specific place within the holding entity where the item is located or made available."
  {:db/ident :bf/sublocation,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Item,
   :rdfs/label "Held in sublocation",
   :rdfs/range :bf/Sublocation,
   :skos/definition
   "Specific place within the holding entity where the item is located or made available."})

(def subseriesEnumeration
  "Subseries enumeration of the resource; usually transcribed."
  {:db/ident :bf/subseriesEnumeration,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Subseries enumeration",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Subseries enumeration of the resource; usually transcribed."})

(def subseriesOf
  "Series resource of which the described resource is a part."
  {:db/ident :bf/subseriesOf,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bf/hasSubseries,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Subseries of",
   :rdfs/subPropertyOf :bf/hasPart,
   :skos/definition
   "Series resource of which the described resource is a part."})

(def subseriesStatement
  "Statement of the subseries the resource is in; usually transcribed; includes the ISSN if applicable."
  {:db/ident :bf/subseriesStatement,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Subseries statement",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Statement of the subseries the resource is in; usually transcribed; includes the ISSN if applicable."})

(def subtitle
  "Word, character, or group of words and/or characters that contains the remainder of the title after the main title. Possible title component."
  {:db/ident :bf/subtitle,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Title,
   :rdfs/label "Subtitle",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Word, character, or group of words and/or characters that contains the remainder of the title after the main title. Possible title component."})

(def succeededBy
  "Resource that succeeds the resource being described, e.g., later in time or after in a narrative."
  {:db/ident :bf/succeededBy,
   :dcterms/modified ["2016-04-29 (added inverse)" "2016-04-21 (New)"],
   :owl/inverseOf :bf/precededBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Succeeded by",
   :rdfs/subPropertyOf :bf/relatedTo,
   :skos/definition
   "Resource that succeeds the resource being described, e.g., later in time or after in a narrative."})

(def summary
  "Summary or abstract of the resource described."
  {:db/ident         :bf/summary,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Suggested use - With Work or Instance",
   :rdfs/label       "Summary content",
   :rdfs/range       :bf/Summary,
   :skos/definition  "Summary or abstract of the resource described."})

(def supplement
  "Resource that updates or otherwise complements the predominant resource."
  {:db/ident :bf/supplement,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bf/supplementTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Supplement",
   :rdfs/subPropertyOf :bf/accompaniedBy,
   :skos/definition
   "Resource that updates or otherwise complements the predominant resource."})

(def supplementTo
  "Resource that is updated or otherwise complemented by the augmenting resource."
  {:db/ident :bf/supplementTo,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bf/supplement,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Supplement to",
   :rdfs/subPropertyOf :bf/accompanies,
   :skos/definition
   "Resource that is updated or otherwise complemented by the augmenting resource."})

(def supplementaryContent
  "Material such as an index, bibliography, appendix intended to supplement the primary content of a resource."
  {:db/ident :bf/supplementaryContent,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work or Instance",
   :rdfs/label "Supplementary material",
   :rdfs/range :bf/SupplementaryContent,
   :skos/definition
   "Material such as an index, bibliography, appendix intended to supplement the primary content of a resource."})

(def systemRequirement
  "Equipment or system requirement beyond what is normal and obvious for the type of carrier or type of file, such as make and model of equipment or hardware, operating system, amount of memory, programming language, other necessary software, any plug-ins or peripherals required to play, view, or run the resource, etc."
  {:db/ident :bf/systemRequirement,
   :dcterms/modified
   ["2017-02-06 (Changed from data to object property, changed property name from plural to singular)"
    "2016-04-21 (New)"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Equipment or system requirements",
   :rdfs/range :bf/SystemRequirement,
   :skos/definition
   "Equipment or system requirement beyond what is normal and obvious for the type of carrier or type of file, such as make and model of equipment or hardware, operating system, amount of memory, programming language, other necessary software, any plug-ins or peripherals required to play, view, or run the resource, etc."})

(def table
  "Number of the table from which the classification number in a subdivision entry is taken, e.g., a DDC table."
  {:db/ident :bf/table,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Classification,
   :rdfs/label "Classification table identification",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Number of the table from which the classification number in a subdivision entry is taken, e.g., a DDC table."})

(def tableOfContents
  "Table of contents of the described resource."
  {:db/ident         :bf/tableOfContents,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Suggested use - With Work or Instance",
   :rdfs/label       "Table of contents content",
   :rdfs/range       :bf/TableOfContents,
   :skos/definition  "Table of contents of the described resource."})

(def tableSeq
  "Sequence number or other identifier for an internal classification sub arrangement or add in a classification scheme."
  {:db/ident :bf/tableSeq,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Classification,
   :rdfs/label "Classification table sequence number",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Sequence number or other identifier for an internal classification sub arrangement or add in a classification scheme."})

(def temporalCoverage
  "Time period coverage of the content of the resource."
  {:db/ident         :bf/temporalCoverage,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :bf/Work,
   :rdfs/label       "Temporal coverage",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "Time period coverage of the content of the resource."})

(def title
  "Name given to a resource."
  {:db/ident         :bf/title,
   :dcterms/modified ["2021-06-09 (Broadened domain [GH23])"
                      "2016-04-21 (New)"],
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Suggested use - With Work, Instance, Item or Event",
   :rdfs/label       "Title resource",
   :rdfs/range       :bf/Title,
   :skos/definition  "Name given to a resource."})

(def titleOf
  "Relates a title resource to that which it is the title of."
  {:db/ident :bf/titleOf,
   :dcterms/modified "2021-06-09 (New [GH22])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested value - Work, Instance, Item or Event",
   :rdfs/domain :bf/Title,
   :rdfs/label "Title of",
   :skos/definition
   "Relates a title resource to that which it is the title of."})

(def translation
  "Resource that translates the text of the source entity into a language different from that of the original."
  {:db/ident :bf/translation,
   :dcterms/modified ["2017-02-03 (corrected subproperty)"
                      "2016-04-29 (added inverse, updated range)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bf/translationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Translation as",
   :rdfs/subPropertyOf :bf/hasDerivative,
   :skos/definition
   "Resource that translates the text of the source entity into a language different from that of the original."})

(def translationOf
  "Resource that has been translated, i.e., the text is expressed in a language different from that of the original resource."
  {:db/ident :bf/translationOf,
   :dcterms/modified ["2016-04-29 (added inverse, updated range)"
                      "2017-02-03 (corrected subproperty)"
                      "2016-04-21 (New)"],
   :owl/inverseOf :bf/translation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment ["Suggested value - Work or Instance"
                  "Suggested use - With Work or Instance"],
   :rdfs/label "Translation of",
   :rdfs/subPropertyOf :bf/derivativeOf,
   :skos/definition
   "Resource that has been translated, i.e., the text is expressed in a language different from that of the original resource."})

(def unit
  "Units in which a value is expressed, such as the physical or logical constituent of a resource (e.g., a volume, audiocassette, film reel, a map, a digital file)."
  {:db/ident :bf/unit,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "Type of unit",
   :rdfs/range :bf/Unit,
   :skos/definition
   "Units in which a value is expressed, such as the physical or logical constituent of a resource (e.g., a volume, audiocassette, film reel, a map, a digital file)."})

(def usageAndAccessPolicy
  "General statement of allowances and restrictions on access to a resource, including retention, reproduction, access, and lending."
  {:db/ident :bf/usageAndAccessPolicy,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Suggested use - With Work, Instance or Item",
   :rdfs/label "Use and access condition",
   :rdfs/range :bf/UsageAndAccessPolicy,
   :skos/definition
   "General statement of allowances and restrictions on access to a resource, including retention, reproduction, access, and lending."})

(def validDate
  "The date or date range during which the resource is accurate."
  {:db/ident :bf/validDate,
   :dcterms/modified "2022-10-03 (New [GH68])",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Work,
   :rdfs/label "Valid date",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :bf/date,
   :skos/definition
   "The date or date range during which the resource is accurate."})

(def variantType
  "Type of title variation, e.g., acronym, cover, spine, earlier, later, series version."
  {:db/ident :bf/variantType,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/VariantTitle,
   :rdfs/label "Variant title type",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Type of title variation, e.g., acronym, cover, spine, earlier, later, series version."})

(def version
  "Term or terms that identify works such as arranged for music, vulgate for religious work, etc."
  {:db/ident :bf/version,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bf/Work,
   :rdfs/label "Version",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Term or terms that identify works such as arranged for music, vulgate for religious work, etc."})

(def videoCharacteristic
  "Technical specification relating to the encoding of video images in a resource"
  {:db/ident :bf/videoCharacteristic,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Instance,
   :rdfs/label "Video characteristic",
   :rdfs/range :bf/VideoCharacteristic,
   :skos/definition
   "Technical specification relating to the encoding of video images in a resource"})

(def voice
  "Voice for which a musical work is appropriate, such as soprano, tenor, mixed."
  {:db/ident :bf/voice,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bf/Work,
   :rdfs/label "Voice",
   :rdfs/range :bf/MusicVoice,
   :skos/definition
   "Voice for which a musical work is appropriate, such as soprano, tenor, mixed."})

(def voiceType
  "Specific type of voice group, such as chorus, solo."
  {:db/ident         :bf/voiceType,
   :dcterms/modified "2016-04-21 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :bf/MusicVoice,
   :rdfs/label       "Type of voice",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "Specific type of voice group, such as chorus, solo."})