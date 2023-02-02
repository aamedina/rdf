(ns net.wikipunk.rdf.bflc
  "BIBFRAME vocabulary with LC extensions"
  {:cc/license        "https://creativecommons.org/publicdomain/zero/1.0/",
   :dcterms/creator   "",
   :dcterms/issued    #inst "2022-10-06T17:00:00.000-00:00",
   :dcterms/modified  "2022-10-07T12:17:40.528-04:00",
   :dcterms/publisher "",
   :dcterms/rights    "https://creativecommons.org/publicdomain/zero/1.0/",
   :owl/imports       ["http://id.loc.gov/vocabulary/relators"
                       "http://id.loc.gov/ontologies/bibframe"],
   :owl/ontologyIRI   "http://id.loc.gov/ontologies/bflc/",
   :owl/priorVersion  "http://id.loc.gov/ontologies/bflc-1-2-0/",
   :owl/versionIRI    "http://id.loc.gov/ontologies/bflc-2-2-0/",
   :owl/versionInfo   "2.2.0",
   :rdf/ns-prefix-map {"bflc" "http://id.loc.gov/ontologies/bflc/"},
   :rdf/type          :owl/Ontology,
   :rdf/uri           "http://id.loc.gov/ontologies/bflc/",
   :rdfa/prefix       "bflc",
   :rdfa/uri          "http://id.loc.gov/ontologies/bflc/",
   :rdfs/label        "BIBFRAME vocabulary with LC extensions"})

(def AppliesTo
  "The component of a resource to which a characteristic applies."
  {:db/ident :bflc/AppliesTo,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Applies to",
   :skos/definition
   "The component of a resource to which a characteristic applies."})

(def CaptureStorage
  "Specifies the sound capture and storage technique used on a sound recording resource."
  {:db/ident :bflc/CaptureStorage,
   :dcterms/modified "2019-05-20 (New [GH16])",
   :rdf/type :owl/Class,
   :rdfs/label "Capture and Storage Technique",
   :rdfs/subClassOf :bf/SoundCharacteristic,
   :skos/definition
   "Specifies the sound capture and storage technique used on a sound recording resource."})

(def CreatorCharacteristic
  "Category to which the creators of the resource belong."
  {:db/ident         :bflc/CreatorCharacteristic,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Creator characteristic",
   :skos/definition  "Category to which the creators of the resource belong."})

(def DemographicGroup
  "Characteristics of a group of agents."
  {:db/ident         :bflc/DemographicGroup,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Demographic group",
   :skos/definition  "Characteristics of a group of agents."})

(def DeprecatedClass
  "The resource has been deprecated"
  {:db/ident         :bflc/Deprecated,
   :dcterms/modified "2022-10-03 (New [GH6])",
   :rdf/type         :owl/Class,
   :rdfs/label       "Deprecated",
   :skos/definition  "The resource has been deprecated"})

(def EncodingLevel
  "Designation of the fullness of the bibliographic description."
  {:db/ident :bflc/EncodingLevel,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Encoding level",
   :skos/definition
   "Designation of the fullness of the bibliographic description."})

(def GovernmentPubType
  "Information recording that the resource is published or produced by or for an international, national, state, provincial, or local government agency, or by any subdivision of such a body."
  {:db/ident :bflc/GovernmentPubType,
   :dcterms/modified "2020-03-09 (New [GH10])",
   :rdf/type :owl/Class,
   :rdfs/label "Government Publication Type",
   :skos/definition
   "Information recording that the resource is published or produced by or for an international, national, state, provincial, or local government agency, or by any subdivision of such a body."})

(def GrooveCutting
  "Kind of cutting of the grooves used on a disc whose sound reproduction process involves a cutting head inscribing a modulated groove into the surface of a rotating cylinder or disc."
  {:db/ident :bflc/GrooveCutting,
   :dcterms/modified "2018-07-12 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Groove cutting",
   :rdfs/subClassOf :bf/SoundCharacteristic,
   :skos/definition
   "Kind of cutting of the grooves used on a disc whose sound reproduction process involves a cutting head inscribing a modulated groove into the surface of a rotating cylinder or disc."})

(def ImageBitDepth
  "The number of bits used to represent each pixel in an image."
  {:db/ident :bflc/ImageBitDepth,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Image bit depth",
   :rdfs/subClassOf :bf/DigitalCharacteristic,
   :skos/definition
   "The number of bits used to represent each pixel in an image."})

(def MachineModel
  "Model of the computing device on which the resource operates."
  {:db/ident :bflc/MachineModel,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Model",
   :rdfs/subClassOf :bf/SystemRequirement,
   :skos/definition
   "Model of the computing device on which the resource operates."})

(def MetadataLicensor
  "Organization that licenses the intellectual property rights to the data contained in the description."
  {:db/ident :bflc/MetadataLicensor,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Metadata licensor",
   :rdfs/subClassOf :bf/Agent,
   :skos/definition
   "Organization that licenses the intellectual property rights to the data contained in the description."})

(def MovingImageTechnique
  "Specifies the technique used in creating motion in motion pictures or videorecordings."
  {:db/ident :bflc/MovingImageTechnique,
   :dcterms/modified "2020-02-13 (New [GH9])",
   :rdf/type :owl/Class,
   :rdfs/label "Moving Image Technique",
   :skos/definition
   "Specifies the technique used in creating motion in motion pictures or videorecordings."})

(def OperatingSystem
  "Software that directly operates a system's hardware and serves as a platform for applications."
  {:db/ident :bflc/OperatingSystem,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Operating system",
   :rdfs/subClassOf :bf/SystemRequirement,
   :skos/definition
   "Software that directly operates a system's hardware and serves as a platform for applications."})

(def PrimaryContribution
  "Contribution for which the agent is the name chosen as the name part of the name and title access point."
  {:db/ident :bflc/PrimaryContribution,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Primary contribution",
   :rdfs/subClassOf :bf/Contribution,
   :skos/definition
   "Contribution for which the agent is the name chosen as the name part of the name and title access point."})

(def ProgrammingLanguage
  "Name of the programming language associated with the data comprising the resource."
  {:db/ident :bflc/ProgrammingLanguage,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Programming language",
   :rdfs/subClassOf :bf/SystemRequirement,
   :skos/definition
   "Name of the programming language associated with the data comprising the resource."})

(def Relation
  "Connection between resources."
  {:db/ident         :bflc/Relation,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Relation",
   :skos/definition  "Connection between resources."})

(def Relationship
  "Resource and its connection to another resource."
  {:db/ident         :bflc/Relationship,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Relationship",
   :skos/definition  "Resource and its connection to another resource."})

(def Relief
  "Relief term specified on a cartographic resource"
  {:db/ident         :bflc/Relief,
   :dcterms/modified "2019-05-07 (New [GH13])",
   :rdf/type         :owl/Class,
   :rdfs/label       "Relief",
   :skos/definition  "Relief term specified on a cartographic resource"})

(def SerialPubType
  "Information recording the type of continuing resource."
  {:db/ident         :bflc/SerialPubType,
   :dcterms/modified "2020-03-18 (New [GH11])",
   :rdf/type         :owl/Class,
   :rdfs/label       "Serial Publication Type",
   :skos/definition  "Information recording the type of continuing resource."})

(def SeriesAnalysis
  "A specific organization's analysis practice for a series named in the bf:title field for a work. May also contain the volumes/dates and/or the institution/copy identification to which the practice applies."
  {:db/ident :bflc/SeriesAnalysis,
   :dcterms/modified "2018-10-12 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Series analysis",
   :rdfs/subClassOf :bflc/SeriesTreatment,
   :skos/definition
   "A specific organization's analysis practice for a series named in the bf:title field for a work. May also contain the volumes/dates and/or the institution/copy identification to which the practice applies."})

(def SeriesClassification
  "A specific organization's classification practice for a series named in the bf:title field for a work. May also contain the volumes/dates and/or the institution/copy identification to which the practice applies."
  {:db/ident :bflc/SeriesClassification,
   :dcterms/modified "2018-10-12 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Series classification",
   :rdfs/subClassOf :bflc/SeriesTreatment,
   :skos/definition
   "A specific organization's classification practice for a series named in the bf:title field for a work. May also contain the volumes/dates and/or the institution/copy identification to which the practice applies."})

(def SeriesNumbering
  "Sequential designation or numbering used in the bf:title field for a work."
  {:db/ident :bflc/SeriesNumbering,
   :dcterms/modified "2018-10-12 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Series numbering",
   :rdfs/subClassOf :bflc/SeriesTreatment,
   :skos/definition
   "Sequential designation or numbering used in the bf:title field for a work."})

(def SeriesNumberingPeculiarities
  "Listing of irregularities in the report year coverage and/or numbering used in the bf:title field for a work. May also include a citation for the source of information."
  {:db/ident :bflc/SeriesNumberingPeculiarities,
   :dcterms/modified "2018-10-12 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Series numbering peculiarities",
   :rdfs/subClassOf :bflc/SeriesTreatment,
   :skos/definition
   "Listing of irregularities in the report year coverage and/or numbering used in the bf:title field for a work. May also include a citation for the source of information."})

(def SeriesProvider
  "Place of publication and the name of the publisher/issuing body used in the bf:title field for a work."
  {:db/ident :bflc/SeriesProvider,
   :dcterms/modified "2018-10-12 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Series provider",
   :rdfs/subClassOf :bflc/SeriesTreatment,
   :skos/definition
   "Place of publication and the name of the publisher/issuing body used in the bf:title field for a work."})

(def SeriesSequentialDesignation
  "Beginning/ending date(s) of publication and/or sequential designations used in the bf:title field for a work. May also include a citation for the source of information."
  {:db/ident :bflc/SeriesSequentialDesignation,
   :dcterms/modified "2018-10-12 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Series sequential designation",
   :rdfs/subClassOf :bflc/SeriesTreatment,
   :skos/definition
   "Beginning/ending date(s) of publication and/or sequential designations used in the bf:title field for a work. May also include a citation for the source of information."})

(def SeriesTracing
  "A specific organization's tracing practice for a series named in the bf:title field for a work. May also contain the volumes/dates and/or the institution/copy identification to which the practice applies."
  {:db/ident :bflc/SeriesTracing,
   :dcterms/modified "2018-10-12 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Series tracing",
   :rdfs/subClassOf :bflc/SeriesTreatment,
   :skos/definition
   "A specific organization's tracing practice for a series named in the bf:title field for a work. May also contain the volumes/dates and/or the institution/copy identification to which the practice applies."})

(def SeriesTreatment
  "Technical specification relating to the encoding of series data in a resource"
  {:db/ident :bflc/SeriesTreatment,
   :dcterms/modified "2018-10-12 (New)",
   :rdf/type :owl/Class,
   :rdfs/label "Series treatment",
   :skos/definition
   "Technical specification relating to the encoding of series data in a resource"})

(def TransliteratedTitle
  "Title transliterated from one script to another."
  {:db/ident         :bflc/TransliteratedTitle,
   :dcterms/modified "2018-07-12 (New)",
   :rdf/type         :owl/Class,
   :rdfs/label       "Transliterated title",
   :rdfs/subClassOf  :bf/VariantTitle,
   :skos/definition  "Title transliterated from one script to another."})

(def Uncontrolled
  "Component of the resource that is not under authority control"
  {:db/ident :bflc/Uncontrolled,
   :dcterms/modified "2021-11-02 (New [GH15])",
   :rdf/type :owl/Class,
   :rdfs/label "Uncontrolled",
   :skos/definition
   "Component of the resource that is not under authority control"})

(def aap
  "A text string that represents the label of the resource. It could be a name/title combination, but could also include additional fields to make it unique within the catalog."
  {:db/ident :bflc/aap,
   :dcterms/modified "2021-11-02 (New [GH2])",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Used with Work, Instance or Item",
   :rdfs/label "Authorized access point",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "A text string that represents the label of the resource. It could be a name/title combination, but could also include additional fields to make it unique within the catalog."})

(def aap-normalized
  "Normalized version of the authorized access point with spaces, capitalization, and punctuation removed."
  {:db/ident :bflc/aap-normalized,
   :dcterms/modified "2021-11-02 (New [GH2])",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Used with Work, Instance or Item",
   :rdfs/label "Normalized authorized access point",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Normalized version of the authorized access point with spaces, capitalization, and punctuation removed."})

(def applicableInstitution
  "Institutional location of a resource to which a particular piece of description applies."
  {:db/ident :bflc/applicableInstitution,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Used with Work, Instance or Item",
   :rdfs/label "Applicable institution",
   :rdfs/range :bf/Agent,
   :skos/definition
   "Institutional location of a resource to which a particular piece of description applies."})

(def appliesTo
  "The component of a resource to which a characteristic applies."
  {:db/ident :bflc/appliesTo,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Used with Work, Instance or Item",
   :rdfs/label "Applies to",
   :rdfs/range :bflc/AppliesTo,
   :skos/definition
   "The component of a resource to which a characteristic applies."})

(def catalogerId
  "ID of the cataloger who created or edited the description."
  {:db/ident :bflc/catalogerId,
   :dcterms/modified "2018-07-12 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bflc/bf:AdminMetadata,
   :rdfs/label "Cataloger ID",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "ID of the cataloger who created or edited the description."})

(def creatorCharacteristic
  "Category to which the creators of the resource belong."
  {:db/ident         :bflc/creatorCharacteristic,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Used with Work, Instance or Item",
   :rdfs/label       "Creator characteristic",
   :rdfs/range       :bflc/CreatorCharacteristic,
   :skos/definition  "Category to which the creators of the resource belong."})

(def demographicGroup
  "Characteristics of a group of agents."
  {:db/ident         :bflc/demographicGroup,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Used with Work, Instance or Item",
   :rdfs/label       "Demographic group",
   :rdfs/range       :bflc/DemographicGroup,
   :skos/definition  "Characteristics of a group of agents."})

(def distributionStatement
  "Statement related to the distribution of the resource; usually transcribed."
  {:db/ident :bflc/distributionStatement,
   :dcterms/modified "2022-10-04 (New [GH18])",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Used with Work, Instance or Item",
   :rdfs/label "Distribution statement",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :bflc/provisionActivityStatement,
   :skos/definition
   "Statement related to the distribution of the resource; usually transcribed."})

(def encodingLevel
  "Designation of the fullness of the bibliographic description."
  {:db/ident :bflc/encodingLevel,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bflc/bf:AdminMetadata,
   :rdfs/label "Encoding level",
   :rdfs/range :bflc/EncodingLevel,
   :skos/definition
   "Designation of the fullness of the bibliographic description."})

(def governmentPubType
  "Information recording that the resource is published or produced by or for an international, national, state, provincial, or local government agency, or by any subdivision of such a body."
  {:db/ident :bflc/governmentPubType,
   :dcterms/modified "2020-03-09 (New [GH10])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Used with Work, Instance or Item",
   :rdfs/label "Government publication type",
   :rdfs/range :bflc/GovernmentPubType,
   :skos/definition
   "Information recording that the resource is published or produced by or for an international, national, state, provincial, or local government agency, or by any subdivision of such a body."})

(def indexedIn
  "Citation to the resource where the material being described is indexed."
  {:db/ident :bflc/indexedIn,
   :dcterms/modified "2018-07-12 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Used with Work, Instance or Item",
   :rdfs/label "Indexed in",
   :skos/definition
   "Citation to the resource where the material being described is indexed."})

(def manufactureStatement
  "Statement related to the manufacture of the resource; usually transcribed."
  {:db/ident :bflc/manufactureStatement,
   :dcterms/modified "2022-10-04 (New [GH18])",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Used with Work, Instance or Item",
   :rdfs/label "Manufacture statement",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :bflc/provisionActivityStatement,
   :skos/definition
   "Statement related to the manufacture of the resource; usually transcribed."})

(def marcKey
  "String to store MARC data"
  {:db/ident         :bflc/marcKey,
   :dcterms/modified "2022-10-03 (New [GH7])",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "Used with Work, Instance or Item",
   :rdfs/label       "MARC key for headings",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "String to store MARC data"})

(def metadataLicensor
  "Organization that licenses the intellectual property rights to the data contained in the description."
  {:db/ident :bflc/metadataLicensor,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :bflc/bf:AdminMetadata,
   :rdfs/label "Metadata licensor",
   :rdfs/range :bflc/MetadataLicensor,
   :skos/definition
   "Organization that licenses the intellectual property rights to the data contained in the description."})

(def movingImageTechnique
  "Information recording the technique used in creating motion in motion pictures or videorecordings."
  {:db/ident :bflc/movingImageTechnique,
   :dcterms/modified "2020-02-13 (New [GH9])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Used with Work, Instance or Item",
   :rdfs/label "Moving Image Technique",
   :rdfs/range :bflc/MovingImageTechnique,
   :skos/definition
   "Information recording the technique used in creating motion in motion pictures or videorecordings."})

(def name00MarcKey
  "String for personal name matching."
  {:db/ident         :bflc/name00MarcKey,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "Used with Work, Instance or Item",
   :rdfs/label       "MARC key for X00 Names",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "String for personal name matching."})

(def name00MatchKey
  "String for name matching."
  {:db/ident         :bflc/name00MatchKey,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "Used with Work, Instance or Item",
   :rdfs/label       "Match key for X00 Name",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "String for name matching."})

(def name10MarcKey
  "String for name matching."
  {:db/ident         :bflc/name10MarcKey,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "Used with Work, Instance or Item",
   :rdfs/label       "MARC key for X10 Names",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "String for name matching."})

(def name10MatchKey
  "String for name matching."
  {:db/ident         :bflc/name10MatchKey,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "Used with Work, Instance or Item",
   :rdfs/label       "Match key for X10 Name",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "String for name matching."})

(def name11MarcKey
  "String for name matching."
  {:db/ident         :bflc/name11MarcKey,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "Used with Work, Instance or Item",
   :rdfs/label       "MARC key for X11 Names",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "String for name matching."})

(def name11MatchKey
  "String for name matching."
  {:db/ident         :bflc/name11MatchKey,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "Used with Work, Instance or Item",
   :rdfs/label       "Match key for X11 Name",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "String for name matching."})

(def nonSortNum
  "Number of characters at the start of a label that should be skipped for indexing and sorting."
  {:db/ident :bflc/nonSortNum,
   :dcterms/modified "2022-10-04 (New [GH17])",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Used with Work, Instance or Item",
   :rdfs/label "Non-sort character count",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Number of characters at the start of a label that should be skipped for indexing and sorting."})

(def primaryContributorName00MatchKey
  "String for entry name matching."
  {:db/ident         :bflc/primaryContributorName00MatchKey,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "Used with Work, Instance or Item",
   :rdfs/label       "Primary X00 Name Match key",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "String for entry name matching."})

(def primaryContributorName10MatchKey
  "String for entry name matching."
  {:db/ident         :bflc/primaryContributorName10MatchKey,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "Used with Work, Instance or Item",
   :rdfs/label       "Primary X10 Name Match key",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "String for entry name matching."})

(def primaryContributorName11MatchKey
  "String for entry name matching."
  {:db/ident         :bflc/primaryContributorName11MatchKey,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "Used with Work, Instance or Item",
   :rdfs/label       "Primary X11 Name Match key",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "String for entry name matching."})

(def procInfo
  "System-supplied processing information for the BIBFRAME description (e.g. \"ibc update\")."
  {:db/ident :bflc/procInfo,
   :dcterms/modified "2018-07-12 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bflc/bf:AdminMetadata,
   :rdfs/label "Processing Info",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "System-supplied processing information for the BIBFRAME description (e.g. \"ibc update\")."})

(def productionStatement
  "Statement related to the production of the resource; usually transcribed."
  {:db/ident :bflc/productionStatement,
   :dcterms/modified "2022-10-04 (New [GH18])",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Used with Work, Instance or Item",
   :rdfs/label "Production statement",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :bflc/provisionActivityStatement,
   :skos/definition
   "Statement related to the production of the resource; usually transcribed."})

(def profile
  "Name of the BIBFRAME editor profile used to create or edit the description."
  {:db/ident :bflc/profile,
   :dcterms/modified "2018-07-12 (New)",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :bflc/bf:AdminMetadata,
   :rdfs/label "LC Editor profile",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Name of the BIBFRAME editor profile used to create or edit the description."})

(def projectedProvisionDate
  "Projected date of publication of the resource."
  {:db/ident         :bflc/projectedProvisionDate,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Used with Work, Instance or Item",
   :rdfs/label       "Projected publication date",
   :rdfs/range       :bflc/date,
   :skos/definition  "Projected date of publication of the resource."})

(def publicationStatement
  "Statement related to the publication of the resource; ususally transcribed."
  {:db/ident :bflc/publicationStatement,
   :dcterms/modified "2022-10-04 (New [GH18])",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Used with Work, Instance or Item",
   :rdfs/label "Publication statement",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :bflc/provisionActivityStatement,
   :skos/definition
   "Statement related to the publication of the resource; ususally transcribed."})

(def readMarc382
  "String representing the medium of performance information located in the 382 field of the original MARC record"
  {:db/ident :bflc/readMarc382,
   :dcterms/modified "2021-11-02 (New [GH12])",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Used with Work, Instance or Item",
   :rdfs/label "Read-only 382 field",
   :skos/definition
   "String representing the medium of performance information located in the 382 field of the original MARC record"})

(def relation
  "Connection between resources."
  {:db/ident         :bflc/relation,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Used with Work, Instance or Item",
   :rdfs/label       "Specific relationship",
   :rdfs/range       :bflc/Relation,
   :skos/definition  "Connection between resources."})

(def relationship
  "Resource and its connection to another resource."
  {:db/ident         :bflc/relationship,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Used with Work, Instance or Item",
   :rdfs/label       "Related resource and relationship",
   :rdfs/range       :bflc/Relationship,
   :skos/definition  "Resource and its connection to another resource."})

(def relief
  "Relief term specified on a cartographic resource"
  {:db/ident         :bflc/relief,
   :dcterms/modified "2019-05-07 (New [GH13])",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Used with Work, Instance or Item",
   :rdfs/label       "Relief",
   :rdfs/range       :bflc/Relief,
   :skos/definition  "Relief term specified on a cartographic resource"})

(def serialPubType
  "Information recording the type of continuing resource."
  {:db/ident         :bflc/serialPubType,
   :dcterms/modified "2020-03-18 (New [GH11])",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Used with Work, Instance or Item",
   :rdfs/label       "Serial publication type",
   :rdfs/range       :bflc/SerialPubType,
   :skos/definition  "Information recording the type of continuing resource."})

(def seriesTreatment
  "Information concerning the treatment of a series in a resource"
  {:db/ident :bflc/seriesTreatment,
   :dcterms/modified "2018-10-12 (New)",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Used with Work, Instance or Item",
   :rdfs/label "Series treatment",
   :rdfs/range :bflc/SeriesTreatment,
   :skos/definition
   "Information concerning the treatment of a series in a resource"})

(def simpleAgent
  "Name of publisher, distributor, manufacturer or producer as transcribed from the resource"
  {:db/ident :bflc/simpleAgent,
   :dcterms/modified "2022-10-03 (New [GH14])",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Used with Work, Instance or Item",
   :rdfs/label "Agent",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Name of publisher, distributor, manufacturer or producer as transcribed from the resource"})

(def simpleDate
  "Date of publication, distribution, manufacture or production as transcribed from the resource"
  {:db/ident :bflc/simpleDate,
   :dcterms/modified "2022-10-03 (New [GH14])",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Used with Work, Instance or Item",
   :rdfs/label "Date",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Date of publication, distribution, manufacture or production as transcribed from the resource"})

(def simplePlace
  "Location of publication, distribution, manufacture or production as transcribed from the resource"
  {:db/ident :bflc/simplePlace,
   :dcterms/modified "2022-10-03 (New [GH14])",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Used with Work, Instance or Item",
   :rdfs/label "Place",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "Location of publication, distribution, manufacture or production as transcribed from the resource"})

(def title00MarcKey
  "String for title matching."
  {:db/ident         :bflc/title00MarcKey,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "Used with Work, Instance or Item",
   :rdfs/label       "title00MarcKey",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "String for title matching."})

(def title00MatchKey
  "String for title matching."
  {:db/ident         :bflc/title00MatchKey,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "Used with Work, Instance or Item",
   :rdfs/label       "Match key for Title X00",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "String for title matching."})

(def title10MarcKey
  "String for title matching."
  {:db/ident         :bflc/title10MarcKey,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "Used with Work, Instance or Item",
   :rdfs/label       "title10MarcKey",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "String for title matching."})

(def title10MatchKey
  "String for title matching."
  {:db/ident         :bflc/title10MatchKey,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "Used with Work, Instance or Item",
   :rdfs/label       "Match key for Title X10",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "String for title matching."})

(def title11MarcKey
  "String for title matching."
  {:db/ident         :bflc/title11MarcKey,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "Used with Work, Instance or Item",
   :rdfs/label       "title11MarcKey",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "String for title matching."})

(def title11MatchKey
  "String for title matching."
  {:db/ident         :bflc/title11MatchKey,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "Used with Work, Instance or Item",
   :rdfs/label       "Match key for Title X11",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "String for title matching."})

(def title30MarcKey
  "String for title matching."
  {:db/ident         :bflc/title30MarcKey,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "Used with Work, Instance or Item",
   :rdfs/label       "title30MarcKey",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "String for title matching."})

(def title30MatchKey
  "String for title matching."
  {:db/ident         :bflc/title30MatchKey,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "Used with Work, Instance or Item",
   :rdfs/label       "title30MatchKey",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "String for title matching."})

(def title40MatchKey
  "String for title matching."
  {:db/ident         :bflc/title40MatchKey,
   :dcterms/modified "2017-02-02 (New)",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "Used with Work, Instance or Item",
   :rdfs/label       "title40MatchKey",
   :rdfs/range       :rdfs/Literal,
   :skos/definition  "String for title matching."})