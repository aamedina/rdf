(ns net.wikipunk.rdf.madsrdf
  "This document describes the MADS/RDF (Metadata Authority Description Schema in RDF) vocabulary, a data model for authority and vocabulary data used within the library and information science (LIS) community, which is inclusive of museums, archives, and other cultural institutions. It is presented as an OWL ontology. MADS/RDF is a knowledge organization system (KOS) designed for use with controlled values for names (personal, corporate, geographic, etc.), thesauri, taxonomies, subject heading systems, and other controlled value lists. It is closely related to SKOS, the Simple Knowledge Organization System and a widely supported and adopted RDF vocabulary. Given the close relationship between the aim of MADS/RDF and the aim of SKOS, the MADS ontology has been fully mapped to SKOS. Unlike SKOS, however, which is very broad in its application, MADS/RDF is designed specifically to support authority data as used by and needed in the LIS community and its technology systems. For example, MADS/RDF provides a means to record data from the Machine Readable Cataloging (MARC) Authorities format in RDF for use in semantic applications and Linked Data projects. MADS/RDF is designed to support the description of cultural and bibliographic resources. Data described using MADS/RDF, therefore, assists with identifying and annotating bibliographic and cultural resources. MADS/RDF is not focused on the description of Real World Objects. Although a MADS/RDF description may contain information specific to the Real World Object associated with the MADS/RDF authoritative label, the MADS/RDF ontology distinguishes between these two entities – the RWO and the Authority. Updated: 29 October 2015. Addition of new properties, madsrdf:activityEndDate, madsrdf:activityStartDate, madsrdf:associatedLanguage, madsrdf:associatedLocale, madsrdf:birthDate, madsrdf:birthPlace, madsrdf:deathDate, madsrdf:deathPlace, madsrdf:entityDescriptor, madsrdf:establishDate, madsrdf:fieldOfActivity, madsrdf:gender, madsrdf:hasAffiliation, madsrdf:honoraryTitle, madsrdf:isIdentifiedByAuthority, madsrdf:occupation, madsrdf:prominentFamilyMember, madsrdf:terminateDate, madsrdf:fullerName, madsrdf:creationDateStart, madsrdf:creationDateEnd, madsrdf:workOrigin, madsrdf:hasChararacteristic. The MADS/RDF to SKOS/RDF mapping was done by Antoine Isaac. The MADS/RDF model and ontology benefited significantly as a result of the fruitful discussions surrounding his effort to map the MADS/RDF ontology to SKOS."
  {:dcat/downloadURL "resources/mads.rdf",
   :dcterms/modified "2019-01-04T17:01:03.065-05:00",
   :owl/ontologyIRI "http://www.loc.gov/mads/rdf/v1#",
   :owl/priorVersion "http://id.loc.gov/ontologies/madsrdf/v1-3-1",
   :owl/versionIRI "http://id.loc.gov/ontologies/madsrdf/v1-4-0",
   :owl/versionInfo "1.4.0",
   :rdf/ns-prefix-map {"bf"      "http://id.loc.gov/ontologies/bibframe/",
                       "bflc"    "http://id.loc.gov/ontologies/bflc/",
                       "cc"      "http://creativecommons.org/ns#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://www.loc.gov/mads/rdf/v1",
   :rdfa/prefix "madsrdf",
   :rdfa/uri "http://www.loc.gov/mads/rdf/v1#",
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This document describes the MADS/RDF (Metadata Authority Description Schema in RDF) vocabulary, a data model for authority and vocabulary data used within the library and information science (LIS) community, which is inclusive of museums, archives, and other cultural institutions. It is presented as an OWL ontology. \n      \n      \n      MADS/RDF is a knowledge organization system (KOS) designed for use with controlled values for names (personal, corporate, geographic, etc.), thesauri, taxonomies, subject heading systems, and other controlled value lists. It is closely related to SKOS, the Simple Knowledge Organization System and a widely supported and adopted RDF vocabulary. Given the close relationship between the aim of MADS/RDF and the aim of SKOS, the MADS ontology has been fully mapped to SKOS. \n      \n      \n      Unlike SKOS, however, which is very broad in its application, MADS/RDF is designed specifically to support authority data as used by and needed in the LIS community and its technology systems. For example, MADS/RDF provides a means to record data from the Machine Readable Cataloging (MARC) Authorities format in RDF for use in semantic applications and Linked Data projects. \n      \n      \n      MADS/RDF is designed to support the description of cultural and bibliographic resources. Data described using MADS/RDF, therefore, assists with identifying and annotating bibliographic and cultural resources. MADS/RDF is not focused on the description of Real World Objects. Although a MADS/RDF description may contain information specific to the Real World Object associated with the MADS/RDF authoritative label, the MADS/RDF ontology distinguishes between these two entities – the RWO and the Authority. \n      \n      \n      Updated: 29 October 2015. Addition of new properties, madsrdf:activityEndDate, madsrdf:activityStartDate, madsrdf:associatedLanguage, madsrdf:associatedLocale, madsrdf:birthDate, madsrdf:birthPlace, madsrdf:deathDate, madsrdf:deathPlace, madsrdf:entityDescriptor, madsrdf:establishDate, madsrdf:fieldOfActivity, madsrdf:gender, madsrdf:hasAffiliation, madsrdf:honoraryTitle, madsrdf:isIdentifiedByAuthority, madsrdf:occupation, madsrdf:prominentFamilyMember, madsrdf:terminateDate, madsrdf:fullerName, madsrdf:creationDateStart, madsrdf:creationDateEnd, madsrdf:workOrigin, madsrdf:hasChararacteristic.  \n      \n      \n      The MADS/RDF to SKOS/RDF mapping was done by Antoine Isaac. The MADS/RDF model and ontology benefited significantly as a result of the fruitful discussions surrounding his effort to map the MADS/RDF ontology to SKOS. "},
   :rdfs/label "MADS/RDF (Metadata Authority Description Schema in RDF)"})

(def Address
  "Address"
  {:db/ident   :madsrdf/Address,
   :rdf/type   :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Address"}})

(def Affiliation
  "A resource that describes an individual's affiliation with an organization or group, such as the nature of the affiliation and the active dates."
  {:db/ident :madsrdf/Affiliation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A resource that describes an individual's affiliation with an organization or group, such as the nature of the affiliation and the active dates."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Affiliation"}})

(def Area
  "Describes a resource whose label is a non-jurisdictional geographic entity."
  {:db/ident :madsrdf/Area,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a resource whose label is a non-jurisdictional geographic entity.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Area Type"},
   :rdfs/subClassOf :madsrdf/Geographic})

(def Authority
  "A concept with a controlled label."
  {:db/ident         :madsrdf/Authority,
   :owl/disjointWith [:madsrdf/Variant
                      :madsrdf/MADSScheme
                      :madsrdf/MADSCollection
                      :madsrdf/DeprecatedAuthority],
   :rdf/type         :owl/Class,
   :rdfs/comment     "A concept with a controlled label.",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Authority"},
   :rdfs/subClassOf  [:skos/Concept :owl/Thing]})

(def City
  "Describes a resource whose label is an inhabited place incorporated as a city, town, etc."
  {:db/ident :madsrdf/City,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a resource whose label is an inhabited place incorporated as a city, town, etc.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "City Type"},
   :rdfs/subClassOf :madsrdf/Geographic})

(def CitySection
  "Describes a resource whose label is a smaller unit within a populated place, e.g., a neighborhood, park, or street."
  {:db/ident :madsrdf/CitySection,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a resource whose label is a smaller unit within a populated place, e.g., a neighborhood, park, or street.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "City Section Type"},
   :rdfs/subClassOf :madsrdf/Geographic})

(def ComplexSubject
  "The label of a madsrdf:ComplexSubject is the concatenation of labels from two or more madsrdf:SimpleType descriptions, except that the combination of madsrdf:SimpleType labels for the madsrdf:ComplexSubject does not meet the conditions to be the label of a madsrdf:NameTitle resource or madsrdf:HierarchicalGeographic resource."
  {:db/ident :madsrdf/ComplexSubject,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The label of a madsrdf:ComplexSubject is the concatenation of labels from two or more madsrdf:SimpleType descriptions, except that the combination of madsrdf:SimpleType labels for the madsrdf:ComplexSubject does not meet the conditions to be the label of a madsrdf:NameTitle resource or madsrdf:HierarchicalGeographic resource."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Complex Subject Type"},
   :rdfs/subClassOf :madsrdf/ComplexType})

(def ComplexType
  "madsrdf:ComplexType is a resource whose label is the concatenation of labels from two or more Authority descriptions or two or more Variant descriptions or some combination of Authority and Variant descriptions, each of a madsrdf:SimpleType."
  {:db/ident :madsrdf/ComplexType,
   :owl/disjointUnionOf
   [:madsrdf/HierarchicalGeographic :madsrdf/ComplexSubject :madsrdf/NameTitle],
   :owl/disjointWith :madsrdf/SimpleType,
   :owl/equivalentClass {:owl/cardinality 1,
                         :owl/onProperty  :madsrdf/componentList,
                         :rdf/type        :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "madsrdf:ComplexType is a resource whose label is the concatenation of labels from two or more Authority descriptions or two or more Variant descriptions or some combination of Authority and Variant descriptions, each of a madsrdf:SimpleType."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Complex Type"},
   :rdfs/subClassOf :madsrdf/MADSType})

(def ConferenceName
  "Describes a resource whose label represents a conference name."
  {:db/ident :madsrdf/ConferenceName,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a resource whose label represents a conference name.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Conference Name Type"},
   :rdfs/subClassOf :madsrdf/Name})

(def Continent
  "Describes a resource whose label is one of seven large landmasses on Earth. These are: Asia, Africa, Europe, North America, South America, Australia, and Antarctica."
  {:db/ident :madsrdf/Continent,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a resource whose label is one of seven large landmasses on Earth. These are: Asia, Africa, Europe, North America, South America, Australia, and Antarctica.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Continent Type"},
   :rdfs/subClassOf :madsrdf/Geographic})

(def CorporateName
  "Describes a resource whose label is the name of a corporate entity, which may include political or ecclesiastical entities."
  {:db/ident :madsrdf/CorporateName,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a resource whose label is the name of a corporate entity, which may include political or ecclesiastical entities.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Corporate Name Type"},
   :rdfs/subClassOf :madsrdf/Name})

(def Country
  "Describes a resource whose label is a country, i.e. a political entity considered a country."
  {:db/ident :madsrdf/Country,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a resource whose label is a country, i.e. a political entity considered a country. ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Country Type"},
   :rdfs/subClassOf :madsrdf/Geographic})

(def County
  "Describes a resource whose label is the largest local administrative unit, e.g. Warwickshire, in a country, e.g. England."
  {:db/ident :madsrdf/County,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a resource whose label is the largest local administrative unit, e.g. Warwickshire, in a country, e.g. England.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "County Type"},
   :rdfs/subClassOf :madsrdf/Geographic})

(def DateNameElement
  "Date Name Element"
  {:db/ident        :madsrdf/DateNameElement,
   :rdf/type        :owl/Class,
   :rdfs/label      "Date Name Element",
   :rdfs/subClassOf :madsrdf/NameElement})

(def DeprecatedAuthority
  "A former Authority."
  {:db/ident         :madsrdf/DeprecatedAuthority,
   :owl/disjointWith [:madsrdf/MADSScheme
                      :madsrdf/MADSCollection
                      :madsrdf/Authority],
   :rdf/type         :owl/Class,
   :rdfs/comment     "A former Authority.",
   :rdfs/label       "Deprecated Authority",
   :rdfs/subClassOf  :owl/Thing})

(def Element
  "madsrdf:Element types describe the various parts of labels."
  {:db/ident :madsrdf/Element,
   :owl/equivalentClass {:owl/cardinality 1,
                         :owl/onProperty  :madsrdf/elementValue,
                         :rdf/type        :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/comment "madsrdf:Element types describe the various parts of labels.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Element"}})

(def ExtraterrestrialArea
  "Describes a resource whose label is any extraterrestrial entity or space, including a solar system, a galaxy, a star system, and a planet, including a geographic feature of an individual planet."
  {:db/ident :madsrdf/ExtraterrestrialArea,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a resource whose label is any extraterrestrial entity or space, including a solar system, a galaxy, a star system, and a planet, including a geographic feature of an individual planet.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extraterrestrial Area Type"},
   :rdfs/subClassOf :madsrdf/Geographic})

(def FamilyName
  "Describes a resource whose label represents a family name."
  {:db/ident :madsrdf/FamilyName,
   :rdf/type :owl/Class,
   :rdfs/comment "Describes a resource whose label represents a family name.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Family Name Type"},
   :rdfs/subClassOf :madsrdf/Name})

(def FamilyNameElement
  "Family Name Element"
  {:db/ident        :madsrdf/FamilyNameElement,
   :rdf/type        :owl/Class,
   :rdfs/label      "Family Name Element",
   :rdfs/subClassOf :madsrdf/NameElement})

(def FullNameElement
  "Fullname Element"
  {:db/ident        :madsrdf/FullNameElement,
   :rdf/type        :owl/Class,
   :rdfs/label      "Fullname Element",
   :rdfs/subClassOf :madsrdf/NameElement})

(def GenreForm
  "Describes a resource whose label is a genre or form term. Genre terms for textual materials designate specific kinds of materials distinguished by the style or technique of their intellectual contents; for example, biographies, catechisms, essays, hymns, or reviews. Form terms designate historically and functionally specific kinds of materials as distinguished by an examination of their physical character, characteristics of their intellectual content, or the order of information within them; for example, daybooks, diaries, directories, journals, memoranda, questionnaires, syllabi, or time sheets. In the context of graphic materials, genre headings denote categories of material distinguished by vantage point, intended purpose, characteristics of the creator, publication status, or method of representation."
  {:db/ident :madsrdf/GenreForm,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a resource whose label is a genre or form term. Genre terms for textual materials designate specific kinds of materials distinguished by the style or technique of their intellectual contents; for example, biographies, catechisms, essays, hymns, or reviews. Form terms designate historically and functionally specific kinds of materials as distinguished by an examination of their physical character, characteristics of their intellectual content, or the order of information within them; for example, daybooks, diaries, directories, journals, memoranda, questionnaires, syllabi, or time sheets. In the context of graphic materials, genre headings denote categories of material distinguished by vantage point, intended purpose, characteristics of the creator, publication status, or method of representation."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Genre/Form Type"},
   :rdfs/subClassOf :madsrdf/SimpleType})

(def GenreFormElement
  "Genre/Form Element"
  {:db/ident        :madsrdf/GenreFormElement,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Genre/Form Element"},
   :rdfs/subClassOf :madsrdf/Element})

(def Geographic
  "Describes a resource whose label represents a geographic place or feature, especially when a more precise geographic determination (City, Country, Region, etc.) cannot be made."
  {:db/ident :madsrdf/Geographic,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a resource whose label represents a geographic place or feature, especially when a more precise geographic determination (City, Country, Region, etc.) cannot be made."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Geographic Authority"},
   :rdfs/subClassOf :madsrdf/SimpleType})

(def GeographicElement
  "Geographic Element"
  {:db/ident        :madsrdf/GeographicElement,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Geographic Element"},
   :rdfs/subClassOf :madsrdf/Element})

(def GivenNameElement
  "Given Name Element"
  {:db/ident        :madsrdf/GivenNameElement,
   :rdf/type        :owl/Class,
   :rdfs/label      "Given Name Element",
   :rdfs/subClassOf :madsrdf/NameElement})

(def HierarchicalGeographic
  "A madsrdf:HierarchicalGeographic indicates that its label is the concatenation of labels from a sequence of madsrdf:Geographic types taken from one of the madsrdf:Geographic sub-classes such as madsrdf:City, madsrdf:Country, madsrdf:State, madsrdf:Region, madsrdf:Area, etc. The madsrdf:Geographic resources that constitute the madsrdf:HierarchicalGeographic should have a broader to narrower hierarchical relationship between them."
  {:db/ident :madsrdf/HierarchicalGeographic,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A madsrdf:HierarchicalGeographic indicates that its label is the concatenation of labels from a sequence of madsrdf:Geographic types taken from one of the madsrdf:Geographic sub-classes such as madsrdf:City, madsrdf:Country, madsrdf:State, madsrdf:Region, madsrdf:Area, etc. The madsrdf:Geographic resources that constitute the madsrdf:HierarchicalGeographic should have a broader to narrower hierarchical relationship between them."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Hierarchical Geographic Type"},
   :rdfs/subClassOf :madsrdf/ComplexType})

(def Identifier
  "A madsrdf:Identifier resource describes an identifier by associating the identifier value with its type. To be used to record identifiers for a resource in the absence of URIs."
  {:db/ident :madsrdf/Identifier,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A madsrdf:Identifier resource describes an identifier by associating the identifier value with its type. To be used to record identifiers for a resource in the absence of URIs.",
   :rdfs/label "Other Identifier"})

(def Island
  "Describes a resource whose label is a tract of land surrounded by water and smaller than a continent but is not itself a separate country."
  {:db/ident :madsrdf/Island,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a resource whose label is a tract of land surrounded by water and smaller than a continent but is not itself a separate country. ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Island Type"},
   :rdfs/subClassOf :madsrdf/Geographic})

(def Language
  "Describes a resource whose label represents a language."
  {:db/ident :madsrdf/Language,
   :owl/equivalentClass :dcterms/LinguisticSystem,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Describes a resource whose label represents a language."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Language Type"},
   :rdfs/subClassOf :madsrdf/SimpleType})

(def LanguageElement
  "Language Element"
  {:db/ident        :madsrdf/LanguageElement,
   :rdf/type        :owl/Class,
   :rdfs/label      "Language Element",
   :rdfs/subClassOf :madsrdf/Element})

(def MADSCollection
  "A madsrdf:Collection is an organizational unit, members of which will have some form of intellectually unifying theme but not to the extent that it defines an independent knowledge organization system. It aggregates madsrdf:Authority descriptions or other madsrdf:MADSCollection resources."
  {:db/ident :madsrdf/MADSCollection,
   :owl/disjointWith [:madsrdf/Variant :madsrdf/MADSScheme :madsrdf/Authority],
   :rdf/type :owl/Class,
   :rdfs/comment
   "A madsrdf:Collection is an organizational unit, members of which will have some form of intellectually unifying theme but not to the extent that it defines an independent knowledge organization system. It aggregates madsrdf:Authority descriptions or other madsrdf:MADSCollection resources.",
   :rdfs/label "MADS Collection",
   :rdfs/subClassOf :skos/Collection})

(def MADSScheme
  "MADS Scheme is an organizational unit that describes a knowledge organization system. It aggregates madsrdf:Authority descriptions and/or madsrdf:MADSCollection resources included in the knowledge organization system. Including a madsrdf:MADSCollection within a madsrdf:MADSScheme should be done with care; when a madsrdf:MADSCollection is part of a madsrdf:MADSScheme, then any madsrdf:Authority within that madsrdf:MADSCollection is effectively also in the madsrdf:MADSScheme."
  {:db/ident :madsrdf/MADSScheme,
   :owl/disjointWith
   [:madsrdf/Variant :madsrdf/MADSCollection :madsrdf/Authority],
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "MADS Scheme is an organizational unit that describes a knowledge organization system. It aggregates madsrdf:Authority descriptions and/or madsrdf:MADSCollection resources included in the knowledge organization system. Including a madsrdf:MADSCollection within a madsrdf:MADSScheme should be done with care; when a madsrdf:MADSCollection is part of a madsrdf:MADSScheme, then any madsrdf:Authority within that madsrdf:MADSCollection is effectively also in the madsrdf:MADSScheme."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MADS Scheme"},
   :rdfs/subClassOf :skos/ConceptScheme})

(def MADSType
  "MADS Type"
  {:db/ident         :madsrdf/MADSType,
   :owl/disjointWith [:madsrdf/MADSScheme :madsrdf/MADSCollection],
   :rdf/type         :owl/Class,
   :rdfs/label       "MADS Type"})

(def MainTitleElement
  "Main Title Element"
  {:db/ident        :madsrdf/MainTitleElement,
   :rdf/type        :owl/Class,
   :rdfs/label      "Main Title Element",
   :rdfs/subClassOf :madsrdf/TitleElement})

(def Name
  "Describes a resource whose label represents a name, especially when a more precise Name type (madsrdf:ConferenceName, masdrdf:FamilyName, etc.) cannot be identified."
  {:db/ident :madsrdf/Name,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a resource whose label represents a name, especially when a more precise Name type (madsrdf:ConferenceName, masdrdf:FamilyName, etc.) cannot be identified."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Name Type"},
   :rdfs/subClassOf :madsrdf/SimpleType})

(def NameElement
  "Name Element"
  {:db/ident        :madsrdf/NameElement,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Name Element"},
   :rdfs/subClassOf :madsrdf/Element})

(def NameTitle
  "The label of a madsrdf:NameTitle resource is the concatenation of a label of a madsrdf:Name description and the label of a madsrdf:Title description. Both description types (madsrdf:Name and madsrdf:Title) are of madsrdf:SimpleType types."
  {:db/ident :madsrdf/NameTitle,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The label of a madsrdf:NameTitle resource is the concatenation of a label of a madsrdf:Name description and the label of a madsrdf:Title description. Both description types (madsrdf:Name and madsrdf:Title) are of madsrdf:SimpleType types."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Name/Title Type"},
   :rdfs/subClassOf :madsrdf/ComplexType})

(def NonSortElement
  "Non-sort Element"
  {:db/ident        :madsrdf/NonSortElement,
   :rdf/type        :owl/Class,
   :rdfs/label      "Non-sort Element",
   :rdfs/subClassOf :madsrdf/TitleElement})

(def Occupation
  "Describes a resource whose label represents an occcupation."
  {:db/ident :madsrdf/Occupation,
   :rdf/type :owl/Class,
   :rdfs/comment "Describes a resource whose label represents an occcupation.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Occupation Type"},
   :rdfs/subClassOf :madsrdf/SimpleType})

(def PartNameElement
  "Part Name Element"
  {:db/ident        :madsrdf/PartNameElement,
   :rdf/type        :owl/Class,
   :rdfs/label      "Part Name Element",
   :rdfs/subClassOf :madsrdf/TitleElement})

(def PartNumberElement
  "Part Number Element"
  {:db/ident        :madsrdf/PartNumberElement,
   :rdf/type        :owl/Class,
   :rdfs/label      "Part Number Element",
   :rdfs/subClassOf :madsrdf/TitleElement})

(def PersonalName
  "Describes a resource whose label represents a personal name."
  {:db/ident :madsrdf/PersonalName,
   :rdf/type :owl/Class,
   :rdfs/comment "Describes a resource whose label represents a personal name.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personal Name Type"},
   :rdfs/subClassOf :madsrdf/Name})

(def Province
  "Describes a resource whose label is a first order political division, e.g. Ontario, within a country, e.g. Canada."
  {:db/ident :madsrdf/Province,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a resource whose label is a first order political division, e.g. Ontario, within a country, e.g. Canada. ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Province Type"},
   :rdfs/subClassOf :madsrdf/Geographic})

(def RWO
  "A madsrdf:RWO is an abstract entity and identifies a Real World Object (RWO) identified by the label of a madsrdf:Authority or madsrdf:DeprecatedAuthority."
  {:db/ident :madsrdf/RWO,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A madsrdf:RWO is an abstract entity and identifies a Real World Object (RWO) identified by the label of a madsrdf:Authority or madsrdf:DeprecatedAuthority.",
   :rdfs/label "Real World Object",
   :rdfs/subClassOf :owl/Thing})

(def Region
  "Describes a resource whose label is an area that has the status of a jurisdiction, usually incorporating more than one first level jurisdiction."
  {:db/ident :madsrdf/Region,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a resource whose label is an area that has the status of a jurisdiction, usually incorporating more than one first level jurisdiction. ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Region Type"},
   :rdfs/subClassOf :madsrdf/Geographic})

(def SimpleType
  "madsrdf:SimpleType is a resource with a label constituting a single word or phrase."
  {:db/ident :madsrdf/SimpleType,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "madsrdf:SimpleType is a resource with a label constituting a single word or phrase."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Simple Type"},
   :rdfs/subClassOf :madsrdf/MADSType})

(def Source
  "A resource that represents the source of information about another resource. madsrdf:Source is a type of citation."
  {:db/ident :madsrdf/Source,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A resource that represents the source of information about another resource. madsrdf:Source is a type of citation.",
   :rdfs/label "Source"})

(def State
  "Describes a resource whose label is a first order political division, e.g. Montana, within a country, e.g. U.S."
  {:db/ident :madsrdf/State,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a resource whose label is a first order political division, e.g. Montana, within a country, e.g. U.S.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "State Type"},
   :rdfs/subClassOf :madsrdf/Geographic})

(def SubTitleElement
  "Subtitle Element"
  {:db/ident        :madsrdf/SubTitleElement,
   :rdf/type        :owl/Class,
   :rdfs/label      "Subtitle Element",
   :rdfs/subClassOf :madsrdf/TitleElement})

(def Temporal
  "Describes a resource whose label represents a time-based notion."
  {:db/ident :madsrdf/Temporal,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a resource whose label represents a time-based notion.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Temporal Type"},
   :rdfs/subClassOf :madsrdf/SimpleType})

(def TemporalElement
  "Temporal Element"
  {:db/ident        :madsrdf/TemporalElement,
   :rdf/type        :owl/Class,
   :rdfs/label      "Temporal Element",
   :rdfs/subClassOf :madsrdf/Element})

(def TermsOfAddressNameElement
  "Terms of Address Element"
  {:db/ident        :madsrdf/TermsOfAddressNameElement,
   :rdf/type        :owl/Class,
   :rdfs/label      "Terms of Address Element",
   :rdfs/subClassOf :madsrdf/NameElement})

(def Territory
  "Describes a resource whose label is a geographical area belonging to or under the jurisdiction of a governmental authority."
  {:db/ident :madsrdf/Territory,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a resource whose label is a geographical area belonging to or under the jurisdiction of a governmental authority. ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Territory Type"},
   :rdfs/subClassOf :madsrdf/Geographic})

(def Title
  "Describes a resource whose label represents a title."
  {:db/ident        :madsrdf/Title,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Describes a resource whose label represents a title.",
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Title Type"},
   :rdfs/subClassOf :madsrdf/SimpleType})

(def TitleElement
  "Title Element"
  {:db/ident        :madsrdf/TitleElement,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Title Element"},
   :rdfs/subClassOf :madsrdf/Element})

(def Topic
  "Describes a resource whose label represents a topic."
  {:db/ident        :madsrdf/Topic,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Describes a resource whose label represents a topic.",
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Topic Type"},
   :rdfs/subClassOf :madsrdf/SimpleType})

(def TopicElement
  "Topic Element"
  {:db/ident        :madsrdf/TopicElement,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Topic Element"},
   :rdfs/subClassOf :madsrdf/Element})

(def Variant
  "A resource whose label is the alternate form of an Authority or Deprecated Authority."
  {:db/ident :madsrdf/Variant,
   :owl/disjointWith
   [:madsrdf/MADSScheme :madsrdf/MADSCollection :madsrdf/Authority],
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A resource whose label is the alternate form of an Authority or Deprecated Authority."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Variant"},
   :rdfs/subClassOf [:skosxl/Label :owl/Thing]})

(def activityEndDate
  "Latest date in a period of activity."
  {:db/ident     :madsrdf/activityEndDate,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "Latest date in a period of activity. ",
   :rdfs/domain  :madsrdf/RWO,
   :rdfs/label   "Activity End"})

(def activityStartDate
  "Earliest date in a period of activity."
  {:db/ident     :madsrdf/activityStartDate,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "Earliest date in a period of activity. ",
   :rdfs/domain  :madsrdf/RWO,
   :rdfs/label   "Activity Start"})

(def adminMetadata
  "This relates an Authority or Variant to its administrative metadata, which is, minimimally, a Class defined outside of the MADS/RDF namespace. The RecordInfo Class from the RecordInfo ontology is recommended."
  {:db/ident :madsrdf/adminMetadata,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This relates an Authority or Variant to its administrative metadata, which is, minimimally, a Class defined outside of the MADS/RDF namespace. The RecordInfo Class from the RecordInfo ontology is recommended."},
   :rdfs/domain {:owl/unionOf [:madsrdf/Authority
                               :madsrdf/DeprecatedAuthority
                               :madsrdf/Variant],
                 :rdf/type    :owl/Class},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Administrative Metadata"}})

(def affiliationEnd
  "The date an individual ceased to be affiliated with an organization."
  {:db/ident :madsrdf/affiliationEnd,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The date an individual ceased to be affiliated with an organization.",
   :rdfs/domain :madsrdf/Affiliation,
   :rdfs/label "Affiliation Ended",
   :rdfs/range :xsd/date})

(def affiliationStart
  "The date an individual established an affiliation with an organization."
  {:db/ident :madsrdf/affiliationStart,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The date an individual established an affiliation with an organization.",
   :rdfs/domain :madsrdf/Affiliation,
   :rdfs/label "Affiliation Started",
   :rdfs/range :xsd/date})

(def associatedLanguage
  "Language that a person, organization, or family uses for publication, communication, etc., or in which a work is expressed."
  {:db/ident :madsrdf/associatedLanguage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Language that a person, organization, or family uses for publication, communication, etc., or in which a work is expressed. ",
   :rdfs/domain :madsrdf/RWO,
   :rdfs/label "Associated Language",
   :rdfs/range :madsrdf/Language})

(def associatedLocale
  "A town, city, province, state, and/or country associated with persons, corporate bodies, families, works, and expressions."
  {:db/ident :madsrdf/associatedLocale,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A town, city, province, state, and/or country associated with persons, corporate bodies, families, works, and expressions.",
   :rdfs/domain :madsrdf/RWO,
   :rdfs/label "Associated Locale",
   :rdfs/range :madsrdf/Geographic})

(def authoritativeLabel
  "A lexical string representing a controlled, curated label for the Authority."
  {:db/ident :madsrdf/authoritativeLabel,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A lexical string representing a controlled, curated label for the Authority."},
   :rdfs/domain :madsrdf/Authority,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Authoritative Label"},
   :rdfs/subPropertyOf [:skos/prefLabel :rdfs/label]})

(def birthDate
  "The year a person was born. Date of birth may also include the month and day of the person’s birth. (RDA 9.3.2.1)"
  {:db/ident :madsrdf/birthDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The year a person was born. Date of birth may also include the month and day of the person’s birth. (RDA 9.3.2.1)",
   :rdfs/domain :madsrdf/RWO,
   :rdfs/label "Birth Date"})

(def birthPlace
  "The town, city, province, state, and/or country in which a person was born."
  {:db/ident :madsrdf/birthPlace,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The town, city, province, state, and/or country in which a person was born.",
   :rdfs/domain :madsrdf/RWO,
   :rdfs/label "Place of Birth",
   :rdfs/range :madsrdf/Geographic})

(def changeNote
  "A note detailing a modification to an Authority or Variant."
  {:db/ident :madsrdf/changeNote,
   :owl/equivalentProperty :skos/changeNote,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "A note detailing a modification to an Authority or Variant."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Change Note"},
   :rdfs/subPropertyOf :madsrdf/note})

(def citationNote
  "A note about how the madsrdf:Source relates to the resource about which the madsrdf:Source is the information source."
  {:db/ident :madsrdf/citationNote,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A note about how the madsrdf:Source relates to the resource about which the madsrdf:Source is the information source."},
   :rdfs/domain :madsrdf/Source,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Citation Note"}})

(def citationSource
  "The cited resource."
  {:db/ident     :madsrdf/citationSource,
   :rdf/type     :owl/AnnotationProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The cited resource."},
   :rdfs/domain  :madsrdf/Source,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Citation Source"}})

(def citationStatus
  "Should use a standard term - such as 'found' or 'not found' - to indicate whether the cited resource yielded information about the resource related to the madsrdf:Source."
  {:db/ident :madsrdf/citationStatus,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Should use a standard term - such as 'found' or 'not found' - to indicate whether the cited resource yielded information about the resource related to the madsrdf:Source."},
   :rdfs/domain :madsrdf/Source,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Citation Status"},
   :rdfs/range :xsd/string})

(def city
  "The city component of an address."
  {:db/ident     :madsrdf/city,
   :rdf/type     :owl/AnnotationProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The city component of an address."},
   :rdfs/domain  :madsrdf/Address,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "City"}})

(def classification
  "The classification code associated with a madsrdf:Authority."
  {:db/ident :madsrdf/classification,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The classification code associated with a madsrdf:Authority."},
   :rdfs/domain :madsrdf/Authority,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Classification"},
   :rdfs/subPropertyOf :skos/semanticRelation})

(def code
  "A code is a string of characters associated with a the authoritative or deprecated label. It may record an historical notation once used to uniquely identify a concept."
  {:db/ident :madsrdf/code,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A code is a string of characters associated with a the authoritative or deprecated label. It may record an historical notation once used to uniquely identify a concept.",
   :rdfs/domain {:owl/unionOf [:madsrdf/Authority :madsrdf/DeprecatedAuthority],
                 :rdf/type    :owl/Class},
   :rdfs/label "Code",
   :rdfs/subPropertyOf :skos/notation})

(def componentList
  "madsrdf:componentList organizes the madsrdf:SimpleType resources whose labels are represented in the label of the associated madsrdf:ComplexType resource."
  {:db/ident :madsrdf/componentList,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "madsrdf:componentList organizes the madsrdf:SimpleType resources whose labels are represented in the label of the associated madsrdf:ComplexType resource.",
   :rdfs/domain :madsrdf/ComplexType,
   :rdfs/label "Component List",
   :rdfs/range {:owl/unionOf [:rdf/List :rdf/Seq],
                :rdf/type    :owl/Class}})

(def country
  "Country associated with an address."
  {:db/ident     :madsrdf/country,
   :rdf/type     :owl/AnnotationProperty,
   :rdfs/comment "Country associated with an address.",
   :rdfs/domain  :madsrdf/Address,
   :rdfs/label   "Country"})

(def creationDateEnd
  "Ending date of the date range for which the beginning date is recorded in madsrdf:creationDateStart."
  {:db/ident :madsrdf/creationDateEnd,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Ending date of the date range for which the beginning date is recorded in madsrdf:creationDateStart.",
   :rdfs/label "Work end"})

(def creationDateStart
  "For a work, earliest date (normally the year) associated with a work; that date may be the date the work was created or first published or released. For an expression, the earliest date (normally the year) associated with an expression; that date may be the date of the earliest known manifestation of that expression. In both cases the date may be the starting date of a range or a single date."
  {:db/ident :madsrdf/creationDateStart,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "For a work, earliest date (normally the year) associated with a work; that date may be the date the work was created or first published or released. For an expression, the earliest date (normally the year) associated with an expression; that date may be the date of the earliest known manifestation of that expression. In both cases the date may be the starting date of a range or a single date.",
   :rdfs/label "Work begun"})

(def deathDate
  "The year a person died. Date of death may also include the month and day of the person’s death. (RDA 9.3.3.1)"
  {:db/ident :madsrdf/deathDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The year a person died. Date of death may also include the month and day of the person’s death. (RDA 9.3.3.1)",
   :rdfs/domain :madsrdf/RWO,
   :rdfs/label "Death Date"})

(def deathPlace
  "The town, city, province, state, and/or country in which a person died."
  {:db/ident :madsrdf/deathPlace,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The town, city, province, state, and/or country in which a person died.",
   :rdfs/domain :madsrdf/RWO,
   :rdfs/label "Place of Death",
   :rdfs/range :madsrdf/Geographic})

(def definitionNote
  "An explanation of the meaning of an Authority, DeprecatedAuthority, or Variant description."
  {:db/ident :madsrdf/definitionNote,
   :owl/equivalentProperty :skos/definition,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An explanation of the meaning of an Authority, DeprecatedAuthority, or Variant description."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Definition Note"},
   :rdfs/subPropertyOf :madsrdf/note})

(def deletionNote
  "A note pertaining to the deletion of a resource."
  {:db/ident           :madsrdf/deletionNote,
   :rdf/type           :owl/AnnotationProperty,
   :rdfs/comment       "A note pertaining to the deletion of a resource.",
   :rdfs/label         "Deletion Note",
   :rdfs/subPropertyOf :madsrdf/changeNote})

(def deprecatedLabel
  "A label once considered authoritative (controlled and curated) but which is no longer."
  {:db/ident :madsrdf/deprecatedLabel,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "A label once considered authoritative (controlled and curated) but which is no longer.",
   :rdfs/domain :madsrdf/DeprecatedAuthority,
   :rdfs/label "Deprecated Label",
   :rdfs/subPropertyOf [:skos/hiddenLabel :rdfs/label]})

(def editorialNote
  "A note pertaining to the management of the label associated with the resource."
  {:db/ident :madsrdf/editorialNote,
   :owl/equivalentProperty :skos/editorialNote,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "A note pertaining to the management of the label associated with the resource.",
   :rdfs/label "Editorial Note",
   :rdfs/subPropertyOf :madsrdf/note})

(def elementList
  "The madsrdf:elementList property is used to organize the various parts of labels."
  {:db/ident :madsrdf/elementList,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The madsrdf:elementList property is used to organize the various parts of labels."},
   :rdfs/label "Element List",
   :rdfs/range {:owl/unionOf [:rdf/List :rdf/Seq],
                :rdf/type    :owl/Class}})

(def elementValue
  "Element Value"
  {:db/ident    :madsrdf/elementValue,
   :rdf/type    :owl/DatatypeProperty,
   :rdfs/domain :madsrdf/Element,
   :rdfs/label  "Element Value",
   :rdfs/range  :xsd/string})

(def email
  "Email"
  {:db/ident    :madsrdf/email,
   :rdf/type    :owl/DatatypeProperty,
   :rdfs/domain :madsrdf/Affiliation,
   :rdfs/label  "Email"})

(def entityDescriptor
  "Any attribute that serves to characterize a person, family or corporate body or that may be needed for differentiation from other persons. families or corporate bodies and for which separate content designation is not already defined.Or"
  {:db/ident :madsrdf/entityDescriptor,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Any attribute that serves to characterize a person, family or corporate body or that may be needed for differentiation from other persons. families or corporate bodies and for which separate content designation is not already defined.Or ",
   :rdfs/domain :madsrdf/RWO,
   :rdfs/label "Entity Descriptor"})

(def establishDate
  "The year a corporate body was established. Date of establishment may also include the month and day of the corporate body’s establishment."
  {:db/ident :madsrdf/establishDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The year a corporate body was established. Date of establishment may also include the month and day of the corporate body’s establishment. ",
   :rdfs/domain :madsrdf/RWO,
   :rdfs/label "Established"})

(def exampleNote
  "A example of how the resource might be used."
  {:db/ident           :madsrdf/exampleNote,
   :owl/equivalentProperty :skos/example,
   :rdf/type           :owl/AnnotationProperty,
   :rdfs/comment       "A example of how the resource might be used.",
   :rdfs/label         "Example Note",
   :rdfs/subPropertyOf :madsrdf/note})

(def extendedAddress
  "The second address line, if needed."
  {:db/ident     :madsrdf/extendedAddress,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "The second address line, if needed.",
   :rdfs/domain  :madsrdf/Address,
   :rdfs/label   "Extended Address"})

(def extension
  "Extension"
  {:db/ident   :madsrdf/extension,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "Extension"})

(def fax
  "Fax number"
  {:db/ident     :madsrdf/fax,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "Fax number",
   :rdfs/domain  :madsrdf/Affiliation,
   :rdfs/label   "Fax"})

(def fieldOfActivity
  "The field of activity associated with an individual."
  {:db/ident     :madsrdf/fieldOfActivity,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "The field of activity associated with an individual.",
   :rdfs/domain  :madsrdf/RWO,
   :rdfs/label   "Field of Activity"})

(def fullerName
  "Full form of name needed to distinguish a person from another person with the same preferred name."
  {:db/ident :madsrdf/fullerName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Full form of name needed to distinguish a person from another person with the same preferred name.",
   :rdfs/label "Fuller Name",
   :rdfs/range :madsrdf/PersonalName})

(def gender
  "The gender with which a person identifies."
  {:db/ident     :madsrdf/gender,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "The gender with which a person identifies. ",
   :rdfs/domain  :madsrdf/RWO,
   :rdfs/label   "Gender"})

(def hasAbbreviationVariant
  "Has Abbreviation Variant"
  {:db/ident           :madsrdf/hasAbbreviationVariant,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "Has Abbreviation Variant",
   :rdfs/subPropertyOf :madsrdf/hasVariant})

(def hasAcronymVariant
  "Has Acronym Variant"
  {:db/ident           :madsrdf/hasAcronymVariant,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "Has Acronym Variant",
   :rdfs/subPropertyOf :madsrdf/hasVariant})

(def hasAffiliation
  "Property to associate an individual, such as a foaf:Agent, to a group or organization with which an individual is or has been affiliated."
  {:db/ident :madsrdf/hasAffiliation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Property to associate an individual, such as a foaf:Agent, to a group or organization with which an individual is or has been affiliated.",
   :rdfs/domain :madsrdf/RWO,
   :rdfs/label "Has Affiliation",
   :rdfs/range :madsrdf/Affiliation})

(def hasAffiliationAddress
  "The address of the group or organization with which an individual is associated."
  {:db/ident :madsrdf/hasAffiliationAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The address of the group or organization with which an individual is associated.",
   :rdfs/domain :madsrdf/Affiliation,
   :rdfs/label "Has Affiliation Address",
   :rdfs/range :madsrdf/Address})

(def hasBroaderAuthority
  "Has Broader Authority"
  {:db/ident           :madsrdf/hasBroaderAuthority,
   :owl/inverseOf      :madsrdf/hasNarrowerAuthority,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "Has Broader Authority",
   :rdfs/subPropertyOf [:skos/broader :madsrdf/hasRelatedAuthority]})

(def hasBroaderExternalAuthority
  "Creates a direct relationship between an Authority and a more broadly defined Authority from a different MADS Scheme."
  {:db/ident :madsrdf/hasBroaderExternalAuthority,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Creates a direct relationship between an Authority and a more broadly defined Authority from a different MADS Scheme.",
   :rdfs/label "Has Broader External Authority",
   :rdfs/subPropertyOf [:skos/broadMatch :madsrdf/hasBroaderAuthority]})

(def hasChararacteristic
  "A term that specifies a characteristic that differentiates a work or expression from another one."
  {:db/ident :madsrdf/hasChararacteristic,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A term that specifies a characteristic that differentiates a work or expression from another one. ",
   :rdfs/label "Other characteristic"})

(def hasCloseExternalAuthority
  "Records a relationship between an Authority and one that is closely related from a different MADS Scheme."
  {:db/ident :madsrdf/hasCloseExternalAuthority,
   :rdf/type [:owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/comment
   "Records a relationship between an Authority and one that is closely related from a different MADS Scheme.",
   :rdfs/label "Has Close External Authority",
   :rdfs/subPropertyOf [:skos/closeMatch :madsrdf/hasRelatedAuthority]})

(def hasCorporateParentAuthority
  "Establishes a relationship between a CorporateName Authority and one of the same that is more broadly defined."
  {:db/ident :madsrdf/hasCorporateParentAuthority,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Establishes a relationship between a CorporateName Authority and one of the same that is more broadly defined.",
   :rdfs/domain :madsrdf/CorporateName,
   :rdfs/label "Has Parent Organization",
   :rdfs/range :madsrdf/CorporateName,
   :rdfs/subPropertyOf :madsrdf/hasRelatedAuthority})

(def hasCorporateSubsidiaryAuthority
  "Establishes a relationship between a CorporateName Authority and one of the same that is more narrowly defined."
  {:db/ident :madsrdf/hasCorporateSubsidiaryAuthority,
   :owl/inverseOf :madsrdf/hasCorporateParentAuthority,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Establishes a relationship between a CorporateName Authority and one of the same that is more narrowly defined.",
   :rdfs/domain :madsrdf/CorporateName,
   :rdfs/label "Is Parent Organization Of",
   :rdfs/range :madsrdf/CorporateName,
   :rdfs/subPropertyOf :madsrdf/hasRelatedAuthority})

(def hasDemonym
  "Establishes a relationship between an Authority that represents the demonym - Japanese or Greek, for example - and an Authority that represents the Geographic place - Japan or Greece, respectively - associated with the demonym."
  {:db/ident :madsrdf/hasDemonym,
   :owl/inverseOf :madsrdf/isDemonymFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Establishes a relationship between an Authority that represents the demonym - Japanese or Greek, for example - and an Authority that represents the Geographic place - Japan or Greece, respectively - associated with the demonym.",
   :rdfs/label "Has Demonym"})

(def hasEarlierEstablishedForm
  "Used to reference a resource that was an earlier form. This is Related type='earlier' in MADS XML."
  {:db/ident :madsrdf/hasEarlierEstablishedForm,
   :owl/inverseOf :madsrdf/hasLaterEstablishedForm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to reference a resource that was an earlier form. This is Related type='earlier' in MADS XML."},
   :rdfs/label "Has Earlier Established Form",
   :rdfs/subPropertyOf :madsrdf/see})

(def hasExactExternalAuthority
  "Records a relationship between an Authority and one to which it matches exactly but from a different MADS Scheme."
  {:db/ident :madsrdf/hasExactExternalAuthority,
   :rdf/type
   [:owl/TransitiveProperty :owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/comment
   "Records a relationship between an Authority and one to which it matches exactly but from a different MADS Scheme.",
   :rdfs/label "Has Exact External Authority",
   :rdfs/subPropertyOf [:skos/exactMatch :madsrdf/hasCloseExternalAuthority]})

(def hasExpansionVariant
  "Has Expansion Variant"
  {:db/ident           :madsrdf/hasExpansionVariant,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "Has Expansion Variant",
   :rdfs/subPropertyOf :madsrdf/hasVariant})

(def hasHiddenVariant
  "Use for variants that are searchable, but not necessarily for display."
  {:db/ident :madsrdf/hasHiddenVariant,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Use for variants that are searchable, but not necessarily for display."},
   :rdfs/domain :madsrdf/Authority,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Has Hidden Variant"},
   :rdfs/range :madsrdf/Variant,
   :rdfs/subPropertyOf :skosxl/hiddenLabel})

(def hasIdentifier
  "Associates a resource with a madsrdf:Identifier."
  {:db/ident     :madsrdf/hasIdentifier,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Associates a resource with a madsrdf:Identifier.",
   :rdfs/label   "Has Identifier",
   :rdfs/range   :madsrdf/Identifier})

(def hasLaterEstablishedForm
  "Use to reference the later form of a resource. This is Related type='later' in MADS XML."
  {:db/ident :madsrdf/hasLaterEstablishedForm,
   :owl/inverseOf :madsrdf/hasEarlierEstablishedForm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Use to reference the later form of a resource. This is Related type='later' in MADS XML."},
   :rdfs/label "Has Later Established Form",
   :rdfs/subPropertyOf :madsrdf/see})

(def hasMADSCollectionMember
  "Associates an Authority or other Collection with a madsrdf:MADSCollection."
  {:db/ident :madsrdf/hasMADSCollectionMember,
   :owl/inverseOf :madsrdf/isMemberOfMADSCollection,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Associates an Authority or other Collection with a madsrdf:MADSCollection."},
   :rdfs/domain :madsrdf/MADSCollection,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Has MADSCollection Member"},
   :rdfs/range {:owl/unionOf [:madsrdf/Authority :madsrdf/MADSCollection],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :skos/member})

(def hasMADSSchemeMember
  "Associates an Authority or Collection with a madsrdf:MADSScheme."
  {:db/ident :madsrdf/hasMADSSchemeMember,
   :owl/inverseOf :madsrdf/isMemberOfMADSScheme,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Associates an Authority or Collection with a madsrdf:MADSScheme."},
   :rdfs/domain :madsrdf/MADSScheme,
   :rdfs/label "Has MADS Scheme Member",
   :rdfs/range {:owl/unionOf [:madsrdf/Authority :madsrdf/MADSCollection],
                :rdf/type    :owl/Class}})

(def hasNarrowerAuthority
  "Creates a direct relationship between an Authority and one that is more narrowly defined."
  {:db/ident :madsrdf/hasNarrowerAuthority,
   :owl/inverseOf :madsrdf/hasBroaderAuthority,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Creates a direct relationship between an Authority and one that is more narrowly defined.",
   :rdfs/label "Has Narrower Authority",
   :rdfs/subPropertyOf [:skos/narrower :madsrdf/hasRelatedAuthority]})

(def hasNarrowerExternalAuthority
  "Creates a direct relationship between an Authority and a more narrowly defined Authority from a different MADS Scheme."
  {:db/ident :madsrdf/hasNarrowerExternalAuthority,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Creates a direct relationship between an Authority and a more narrowly defined Authority from a different MADS Scheme.",
   :rdfs/label "Has Narrower External Authority",
   :rdfs/subPropertyOf [:skos/narrowMatch :madsrdf/hasNarrowerAuthority]})

(def hasReciprocalAuthority
  "Establishes a relationship between two Authority resources. It is reciprocal, so the relationship must be shared. This is Related type='equivalent' in MADS XML."
  {:db/ident :madsrdf/hasReciprocalAuthority,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Establishes a relationship between two Authority resources. It is reciprocal, so the relationship must be shared. This is Related type='equivalent' in MADS XML."},
   :rdfs/label "Has Reciprocal Authority",
   :rdfs/subPropertyOf [:skos/related :madsrdf/hasRelatedAuthority]})

(def hasReciprocalExternalAuthority
  "Establishes a relationship between an Authority and one from a different MADS Scheme. It is reciprocal, so the relationship must be shared."
  {:db/ident :madsrdf/hasReciprocalExternalAuthority,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/comment
   "Establishes a relationship between an Authority and one from a different MADS Scheme. It is reciprocal, so the relationship must be shared.",
   :rdfs/label "Has Reciprocal External Authority",
   :rdfs/subPropertyOf [:skos/relatedMatch :madsrdf/hasReciprocalAuthority]})

(def hasRelatedAuthority
  "Unless the relationship can be more specifically identified, use 'hasRelatedAuthority.'"
  {:db/ident :madsrdf/hasRelatedAuthority,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Unless the relationship can be more specifically identified, use 'hasRelatedAuthority.'"},
   :rdfs/domain :madsrdf/Authority,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Has Related Authority"},
   :rdfs/range :madsrdf/Authority,
   :rdfs/subPropertyOf :skos/semanticRelation})

(def hasSource
  "Associates a resource description with its Source."
  {:db/ident     :madsrdf/hasSource,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Associates a resource description with its Source."},
   :rdfs/label   "Has Source",
   :rdfs/range   :madsrdf/Source})

(def hasTopMemberOfMADSScheme
  "Identifies an Authority that is at the top of the hierarchy of authorities within the MADS Scheme."
  {:db/ident :madsrdf/hasTopMemberOfMADSScheme,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Identifies an Authority that is at the top of the hierarchy of authorities within the MADS Scheme.",
   :rdfs/domain :madsrdf/MADSScheme,
   :rdfs/label "Has Top Member of MADS Scheme",
   :rdfs/range :madsrdf/Authority,
   :rdfs/subPropertyOf [:skos/hasTopConcept :madsrdf/hasMADSSchemeMember]})

(def hasTranslationVariant
  "A Variant whose label represents a translation of that of the authoritative label."
  {:db/ident :madsrdf/hasTranslationVariant,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A Variant whose label represents a translation of that of the authoritative label.",
   :rdfs/label "Has Translation Variant",
   :rdfs/subPropertyOf :madsrdf/hasVariant})

(def hasVariant
  "Associates a Variant with an Authority or Deprecrated Authority. Unless the variant type can be more specifically identified, use 'hasVariant.'"
  {:db/ident :madsrdf/hasVariant,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Associates a Variant with an Authority or Deprecrated Authority. Unless the variant type can be more specifically identified, use 'hasVariant.'"},
   :rdfs/domain :madsrdf/Authority,
   :rdfs/label "Has Variant",
   :rdfs/range :madsrdf/Variant,
   :rdfs/subPropertyOf :skosxl/altLabel})

(def hiddenLabel
  "A label entered for discovery purposes but not shown."
  {:db/ident           :madsrdf/hiddenLabel,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       "A label entered for discovery purposes but not shown.",
   :rdfs/domain        :madsrdf/Variant,
   :rdfs/label         "Hidden Label",
   :rdfs/subPropertyOf :skosxl/literalForm})

(def historyNote
  "A note pertaining to the history of the resource."
  {:db/ident           :madsrdf/historyNote,
   :owl/equivalentProperty :skos/historyNote,
   :rdf/type           :owl/AnnotationProperty,
   :rdfs/comment       "A note pertaining to the history of the resource.",
   :rdfs/label         "History Note",
   :rdfs/subPropertyOf :madsrdf/note})

(def honoraryTitle
  "Designation indicative of royalty, nobility, or ecclesiastical rank or office, or a term of address for a person of religious vocation."
  {:db/ident :madsrdf/honoraryTitle,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Designation indicative of royalty, nobility, or ecclesiastical rank or office, or a term of address for a person of religious vocation.",
   :rdfs/domain :madsrdf/RWO,
   :rdfs/label "Honorary Title"})

(def hours
  "Hours"
  {:db/ident    :madsrdf/hours,
   :rdf/type    :owl/DatatypeProperty,
   :rdfs/domain :madsrdf/Affiliation,
   :rdfs/label  "Hours"})

(def idScheme
  "The scheme associated with the identifier. For example, \"LCCN\" would be used when the Identifier Value (madsrdf:idValue) is a LC Control Number."
  {:db/ident :madsrdf/idScheme,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "The scheme associated with the identifier. For example, \"LCCN\" would be used when the Identifier Value (madsrdf:idValue) is a LC Control Number.",
   :rdfs/domain :madsrdf/Identifier,
   :rdfs/label "Identifier Scheme"})

(def idValue
  "The value of the identifier conforming to the Identifier Scheme syntax."
  {:db/ident :madsrdf/idValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The value of the identifier conforming to the Identifier Scheme syntax.",
   :rdfs/domain :madsrdf/Identifier,
   :rdfs/label "Identifier Value",
   :rdfs/range :xsd/string})

(def identifiesRWO
  "Associates a madsrdf:Authority with the Real World Object that is the subject of the authority's label."
  {:db/ident :madsrdf/identifiesRWO,
   :owl/inverseOf :madsrdf/isIdentifiedByAuthority,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Associates a madsrdf:Authority with the Real World Object that is the subject of the authority's label.",
   :rdfs/domain :madsrdf/Authority,
   :rdfs/label "Identifies RWO",
   :rdfs/range :madsrdf/RWO,
   :rdfs/subPropertyOf :foaf/focus})

(def isDemonymFor
  "Establishes a relationship between an Authority that represents a Geographic place - Japan or Greece, for example - and an Authority that represents the demonym - Japanese or Greek, respectively - associated with the place."
  {:db/ident :madsrdf/isDemonymFor,
   :owl/inverseOf :madsrdf/hasDemonym,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Establishes a relationship between an Authority that represents a Geographic place - Japan or Greece, for example - and an Authority that represents the demonym - Japanese or Greek, respectively - associated with the place.",
   :rdfs/label "Is Demonym For"})

(def isIdentifiedByAuthority
  "Associates a Real World Object with its Authority description."
  {:db/ident :madsrdf/isIdentifiedByAuthority,
   :owl/inverseOf :madsrdf/identifiesRWO,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Associates a Real World Object with its Authority description.",
   :rdfs/domain :madsrdf/RWO,
   :rdfs/label "Is Identified By Authority",
   :rdfs/range :madsrdf/Authority})

(def isMemberOfMADSCollection
  "Associates a Collection with a madsrdf:Authority or another madsrdf:MADSCollection."
  {:db/ident :madsrdf/isMemberOfMADSCollection,
   :owl/inverseOf :madsrdf/hasMADSCollectionMember,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Associates a Collection with a madsrdf:Authority or another madsrdf:MADSCollection."},
   :rdfs/domain {:owl/unionOf [:madsrdf/Authority :madsrdf/MADSCollection],
                 :rdf/type    :owl/Class},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Is Member Of MADSCollection"},
   :rdfs/range :madsrdf/MADSCollection})

(def isMemberOfMADSScheme
  "Is Member of MADS Scheme"
  {:db/ident           :madsrdf/isMemberOfMADSScheme,
   :owl/inverseOf      :madsrdf/hasMADSSchemeMember,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:madsrdf/Authority
                                      :madsrdf/MADSCollection],
                        :rdf/type    :owl/Class},
   :rdfs/label         "Is Member of MADS Scheme",
   :rdfs/range         :madsrdf/MADSScheme,
   :rdfs/subPropertyOf :skos/inScheme})

(def isTopMemberOfMADSScheme
  "Identifies a MADS Scheme in which the Authority is at the top of the hierarchy."
  {:db/ident :madsrdf/isTopMemberOfMADSScheme,
   :owl/inverseOf :madsrdf/hasTopMemberOfMADSScheme,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Identifies a MADS Scheme in which the Authority is at the top of the hierarchy.",
   :rdfs/domain {:owl/unionOf [:madsrdf/Authority :madsrdf/MADSCollection],
                 :rdf/type    :owl/Class},
   :rdfs/label "Is Top Member of MADS Scheme",
   :rdfs/range :madsrdf/MADSScheme,
   :rdfs/subPropertyOf [:skos/topConceptOf :madsrdf/isMemberOfMADSScheme]})

(def natureOfAffiliation
  "Records the individual's role or position in the organization with which the individual is affiliated. A \"job title\" might be appropriate."
  {:db/ident :madsrdf/natureOfAffiliation,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "Records the individual's role or position in the organization with which the individual is affiliated. A \"job title\" might be appropriate.",
   :rdfs/domain :madsrdf/Affiliation,
   :rdfs/label "Nature of Affiliation"})

(def note
  "A note about the resource."
  {:db/ident     :madsrdf/note,
   :owl/equivalentProperty :skos/note,
   :rdf/type     :owl/AnnotationProperty,
   :rdfs/comment "A note about the resource.",
   :rdfs/label   "Note"})

(def occupation
  "A profession or occupation in which the person works or has worked."
  {:db/ident :madsrdf/occupation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A profession or occupation in which the person works or has worked.",
   :rdfs/domain :madsrdf/RWO,
   :rdfs/label "Occupation",
   :rdfs/range :madsrdf/Occupation})

(def organization
  "The group or organization with which an individual is associated."
  {:db/ident :madsrdf/organization,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "The group or organization with which an individual is associated.",
   :rdfs/domain :madsrdf/Affiliation,
   :rdfs/label "Organization or Group"})

(def phone
  "Phone"
  {:db/ident    :madsrdf/phone,
   :rdf/type    :owl/DatatypeProperty,
   :rdfs/domain :madsrdf/Affiliation,
   :rdfs/label  "Phone"})

(def postcode
  "Post Code / Zip Code"
  {:db/ident    :madsrdf/postcode,
   :rdf/type    :owl/DatatypeProperty,
   :rdfs/domain :madsrdf/Address,
   :rdfs/label  "Post Code / Zip Code"})

(def prominentFamilyMember
  "A well-known individual who is a member of the family."
  {:db/ident     :madsrdf/prominentFamilyMember,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "A well-known individual who is a member of the family.",
   :rdfs/domain  :madsrdf/RWO,
   :rdfs/label   "Prominent Family Member"})

(def scopeNote
  "Scope Note"
  {:db/ident           :madsrdf/scopeNote,
   :owl/equivalentProperty :skos/scopeNote,
   :rdf/type           :owl/AnnotationProperty,
   :rdfs/label         "Scope Note",
   :rdfs/subPropertyOf :madsrdf/note})

(def see
  "Denotes a relationship between an Authority and/or DeprecatedAuthority. The relationship may or may or may not be reciprocated and there is no certainty that the related resource will further illuminate the original resource."
  {:db/ident :madsrdf/see,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Denotes a relationship between an Authority and/or DeprecatedAuthority. The relationship may or may or may not be reciprocated and there is no certainty that the related resource will further illuminate the original resource.",
   :rdfs/domain {:owl/unionOf [:madsrdf/Authority :madsrdf/DeprecatedAuthority],
                 :rdf/type    :owl/Class},
   :rdfs/label "See Also",
   :rdfs/range {:owl/unionOf [:madsrdf/Authority :madsrdf/DeprecatedAuthority],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def state
  "The state associated with an address."
  {:db/ident     :madsrdf/state,
   :rdf/type     :owl/AnnotationProperty,
   :rdfs/comment "The state associated with an address.",
   :rdfs/domain  :madsrdf/Address,
   :rdfs/label   "State"})

(def streetAddress
  "First line of address. For second line, use madsrdf:extendedAddress."
  {:db/ident :madsrdf/streetAddress,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "First line of address. For second line, use madsrdf:extendedAddress.",
   :rdfs/domain :madsrdf/Address,
   :rdfs/label "Street Address"})

(def terminateDate
  "The year a corporate body was terminated. Date of termination may also include the month and day of the corporate body’s termination."
  {:db/ident :madsrdf/terminateDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The year a corporate body was terminated. Date of termination may also include the month and day of the corporate body’s termination. ",
   :rdfs/domain :madsrdf/RWO,
   :rdfs/label "Terminated"})

(def useFor
  "\"Use [This Resource] For.\" Traditional \"USE FOR\" reference."
  {:db/ident :madsrdf/useFor,
   :owl/inverseOf :madsrdf/useInstead,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\"Use [This Resource] For.\" Traditional \"USE FOR\" reference.",
   :rdfs/label "Use For",
   :rdfs/subPropertyOf :madsrdf/see})

(def useInstead
  "\"Use [This Other Resource] Instead.\" Traditional \"USE\" reference."
  {:db/ident :madsrdf/useInstead,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\"Use [This Other Resource] Instead.\" Traditional \"USE\" reference.",
   :rdfs/label "Use Instead",
   :rdfs/subPropertyOf :madsrdf/see})

(def variantLabel
  "The lexical, variant form of an authoritative label."
  {:db/ident           :madsrdf/variantLabel,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       "The lexical, variant form of an authoritative label.",
   :rdfs/domain        :madsrdf/Variant,
   :rdfs/label         "Variant Label",
   :rdfs/subPropertyOf :skosxl/literalForm})

(def workOrigin
  "The country or other territorial jurisdiction from which a work originated."
  {:db/ident :madsrdf/workOrigin,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The country or other territorial jurisdiction from which a work originated.",
   :rdfs/label "Work locale",
   :rdfs/range :madsrdf/Geographic})