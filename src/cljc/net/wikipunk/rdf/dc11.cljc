(ns net.wikipunk.rdf.dc11
  "Dublin Core Metadata Element Set, Version 1.1"
  {:dcat/downloadURL
   "https://www.dublincore.org/specifications/dublin-core/dcmi-terms/dublin_core_elements.ttl",
   :dcterms/modified #inst "2012-06-14T00:00:00.000-04:00",
   :dcterms/publisher "http://purl.org/dc/aboutdcmi#DCMI",
   :dcterms/title #voc/lstr "Dublin Core Metadata Element Set, Version 1.1@en",
   :rdf/ns-prefix-map {"dc11"    "http://purl.org/dc/elements/1.1/",
                       "dcam"    "http://purl.org/dc/dcam/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#"},
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "dc11",
   :rdfa/uri "http://purl.org/dc/elements/1.1/",
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/elements/1.1/"}}
  (:refer-clojure :exclude [format type]))

(def contributor
  "The guidelines for using names of persons or organizations as creators also apply to contributors. Typically, the name of a Contributor should be used to indicate the entity."
  {:db/ident :dc11/contributor,
   :dcterms/description
   #voc/lstr
    "The guidelines for using names of persons or organizations as creators also apply to contributors.  Typically, the name of a Contributor should be used to indicate the entity.@en",
   :dcterms/issued #inst "1999-07-02T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "An entity responsible for making contributions to the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/elements/1.1/",
   :rdfs/label #voc/lstr "Contributor@en",
   :skos/note
   #voc/lstr
    "A [second property](/specifications/dublin-core/dcmi-terms/#http://purl.org/dc/terms/contributor) with the same name as this property has been declared in the [dcterms: namespace](http://purl.org/dc/terms/).  See the Introduction to the document [DCMI Metadata Terms](/specifications/dublin-core/dcmi-terms/) for an explanation.@en"})

(def coverage
  "Spatial topic and spatial applicability may be a named place or a location specified by its geographic coordinates. Temporal topic may be a named period, date, or date range. A jurisdiction may be a named administrative entity or a geographic place to which the resource applies. Recommended practice is to use a controlled vocabulary such as the Getty Thesaurus of Geographic Names [[TGN](https://www.getty.edu/research/tools/vocabulary/tgn/index.html)]. Where appropriate, named places or time periods may be used in preference to numeric identifiers such as sets of coordinates or date ranges."
  {:db/ident :dc11/coverage,
   :dcterms/description
   #voc/lstr
    "Spatial topic and spatial applicability may be a named place or a location specified by its geographic coordinates. Temporal topic may be a named period, date, or date range. A jurisdiction may be a named administrative entity or a geographic place to which the resource applies. Recommended practice is to use a controlled vocabulary such as the Getty Thesaurus of Geographic Names [[TGN](https://www.getty.edu/research/tools/vocabulary/tgn/index.html)]. Where appropriate, named places or time periods may be used in preference to numeric identifiers such as sets of coordinates or date ranges.@en",
   :dcterms/issued #inst "1999-07-02T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The spatial or temporal topic of the resource, spatial applicability of the resource, or jurisdiction under which the resource is relevant.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/elements/1.1/",
   :rdfs/label #voc/lstr "Coverage@en",
   :skos/note
   #voc/lstr
    "A [second property](/specifications/dublin-core/dcmi-terms/#http://purl.org/dc/terms/coverage) with the same name as this property has been declared in the [dcterms: namespace](http://purl.org/dc/terms/).  See the Introduction to the document [DCMI Metadata Terms](/specifications/dublin-core/dcmi-terms/) for an explanation.@en"})

(def creator
  "Examples of a Creator include a person, an organization, or a service. Typically, the name of a Creator should be used to indicate the entity."
  {:db/ident :dc11/creator,
   :dcterms/description
   #voc/lstr
    "Examples of a Creator include a person, an organization, or a service. Typically, the name of a Creator should be used to indicate the entity.@en",
   :dcterms/issued #inst "1999-07-02T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr
                  "An entity primarily responsible for making the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/elements/1.1/",
   :rdfs/label #voc/lstr "Creator@en",
   :skos/note
   #voc/lstr
    "A [second property](/specifications/dublin-core/dcmi-terms/#http://purl.org/dc/terms/creator) with the same name as this property has been declared in the [dcterms: namespace](http://purl.org/dc/terms/).  See the Introduction to the document [DCMI Metadata Terms](/specifications/dublin-core/dcmi-terms/) for an explanation.@en"})

(def date
  "Date may be used to express temporal information at any level of granularity. Recommended practice is to express the date, date/time, or period of time according to ISO 8601-1 [[ISO 8601-1](https://www.iso.org/iso-8601-date-and-time-format.html)] or a published profile of the ISO standard, such as the W3C Note on Date and Time Formats [[W3CDTF](https://www.w3.org/TR/NOTE-datetime)] or the Extended Date/Time Format Specification [[EDTF](http://www.loc.gov/standards/datetime/)]. If the full date is unknown, month and year (YYYY-MM) or just year (YYYY) may be used. Date ranges may be specified using ISO 8601 period of time specification in which start and end dates are separated by a '/' (slash) character. Either the start or end date may be missing."
  {:db/ident :dc11/date,
   :dcterms/description
   #voc/lstr
    "Date may be used to express temporal information at any level of granularity.  Recommended practice is to express the date, date/time, or period of time according to ISO 8601-1 [[ISO 8601-1](https://www.iso.org/iso-8601-date-and-time-format.html)] or a published profile of the ISO standard, such as the W3C Note on Date and Time Formats [[W3CDTF](https://www.w3.org/TR/NOTE-datetime)] or the Extended Date/Time Format Specification [[EDTF](http://www.loc.gov/standards/datetime/)].  If the full date is unknown, month and year (YYYY-MM) or just year (YYYY) may be used. Date ranges may be specified using ISO 8601 period of time specification in which start and end dates are separated by a '/' (slash) character.  Either the start or end date may be missing.@en",
   :dcterms/issued #inst "1999-07-02T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A point or period of time associated with an event in the lifecycle of the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/elements/1.1/",
   :rdfs/label #voc/lstr "Date@en",
   :skos/note
   #voc/lstr
    "A [second property](/specifications/dublin-core/dcmi-terms/#http://purl.org/dc/terms/date) with the same name as this property has been declared in the [dcterms: namespace](http://purl.org/dc/terms/).  See the Introduction to the document [DCMI Metadata Terms](/specifications/dublin-core/dcmi-terms/) for an explanation.@en"})

(def description
  "Description may include but is not limited to: an abstract, a table of contents, a graphical representation, or a free-text account of the resource."
  {:db/ident :dc11/description,
   :dcterms/description
   #voc/lstr
    "Description may include but is not limited to: an abstract, a table of contents, a graphical representation, or a free-text account of the resource.@en",
   :dcterms/issued #inst "1999-07-02T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr "An account of the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/elements/1.1/",
   :rdfs/label #voc/lstr "Description@en",
   :skos/note
   #voc/lstr
    "A [second property](/specifications/dublin-core/dcmi-terms/#http://purl.org/dc/terms/description) with the same name as this property has been declared in the [dcterms: namespace](http://purl.org/dc/terms/).  See the Introduction to the document [DCMI Metadata Terms](/specifications/dublin-core/dcmi-terms/) for an explanation.@en"})

(def format
  "Recommended practice is to use a controlled vocabulary where available. For example, for file formats one could use the list of Internet Media Types [[MIME](https://www.iana.org/assignments/media-types/media-types.xhtml)]."
  {:db/ident :dc11/format,
   :dcterms/description
   #voc/lstr
    "Recommended practice is to use a controlled vocabulary where available. For example, for file formats one could use the list of Internet Media Types [[MIME](https://www.iana.org/assignments/media-types/media-types.xhtml)].@en",
   :dcterms/issued #inst "1999-07-02T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The file format, physical medium, or dimensions of the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/elements/1.1/",
   :rdfs/label #voc/lstr "Format@en",
   :skos/note
   #voc/lstr
    "A [second property](/specifications/dublin-core/dcmi-terms/#http://purl.org/dc/terms/format) with the same name as this property has been declared in the [dcterms: namespace](http://purl.org/dc/terms/).  See the Introduction to the document [DCMI Metadata Terms](/specifications/dublin-core/dcmi-terms/) for an explanation.@en"})

(def identifier
  "Recommended practice is to identify the resource by means of a string conforming to an identification system."
  {:db/ident :dc11/identifier,
   :dcterms/description
   #voc/lstr
    "Recommended practice is to identify the resource by means of a string conforming to an identification system.@en",
   :dcterms/issued #inst "1999-07-02T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "An unambiguous reference to the resource within a given context.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/elements/1.1/",
   :rdfs/label #voc/lstr "Identifier@en",
   :skos/note
   #voc/lstr
    "A [second property](/specifications/dublin-core/dcmi-terms/#http://purl.org/dc/terms/identifier) with the same name as this property has been declared in the [dcterms: namespace](http://purl.org/dc/terms/).  See the Introduction to the document [DCMI Metadata Terms](/specifications/dublin-core/dcmi-terms/) for an explanation.@en"})

(def language
  "Recommended practice is to use either a non-literal value representing a language from a controlled vocabulary such as ISO 639-2 or ISO 639-3, or a literal value consisting of an IETF Best Current Practice 47 [[IETF-BCP47](https://tools.ietf.org/html/bcp47)] language tag."
  {:db/ident :dc11/language,
   :dcterms/description
   #voc/lstr
    "Recommended practice is to use either a non-literal value representing a language from a controlled vocabulary such as ISO 639-2 or ISO 639-3, or a literal value consisting of an IETF Best Current Practice 47 [[IETF-BCP47](https://tools.ietf.org/html/bcp47)] language tag.@en",
   :dcterms/issued #inst "1999-07-02T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr "A language of the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/elements/1.1/",
   :rdfs/label #voc/lstr "Language@en",
   :skos/note
   #voc/lstr
    "A [second property](/specifications/dublin-core/dcmi-terms/#http://purl.org/dc/terms/language) with the same name as this property has been declared in the [dcterms: namespace](http://purl.org/dc/terms/).  See the Introduction to the document [DCMI Metadata Terms](/specifications/dublin-core/dcmi-terms/) for an explanation.@en"})

(def publisher
  "Examples of a Publisher include a person, an organization, or a service. Typically, the name of a Publisher should be used to indicate the entity."
  {:db/ident :dc11/publisher,
   :dcterms/description
   #voc/lstr
    "Examples of a Publisher include a person, an organization, or a service. Typically, the name of a Publisher should be used to indicate the entity.@en",
   :dcterms/issued #inst "1999-07-02T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr
                  "An entity responsible for making the resource available.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/elements/1.1/",
   :rdfs/label #voc/lstr "Publisher@en",
   :skos/note
   #voc/lstr
    "A [second property](/specifications/dublin-core/dcmi-terms/#http://purl.org/dc/terms/publisher) with the same name as this property has been declared in the [dcterms: namespace](http://purl.org/dc/terms/).  See the Introduction to the document [DCMI Metadata Terms](/specifications/dublin-core/dcmi-terms/) for an explanation.@en"})

(def relation
  "Recommended practice is to identify the related resource by means of a URI. If this is not possible or feasible, a string conforming to a formal identification system may be provided."
  {:db/ident :dc11/relation,
   :dcterms/description
   #voc/lstr
    "Recommended practice is to identify the related resource by means of a URI. If this is not possible or feasible, a string conforming to a formal identification system may be provided.@en",
   :dcterms/issued #inst "1999-07-02T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr "A related resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/elements/1.1/",
   :rdfs/label #voc/lstr "Relation@en",
   :skos/note
   #voc/lstr
    "A [second property](/specifications/dublin-core/dcmi-terms/#http://purl.org/dc/terms/relation) with the same name as this property has been declared in the [dcterms: namespace](http://purl.org/dc/terms/).  See the Introduction to the document [DCMI Metadata Terms](/specifications/dublin-core/dcmi-terms/) for an explanation.@en"})

(def rights
  "Typically, rights information includes a statement about various property rights associated with the resource, including intellectual property rights."
  {:db/ident :dc11/rights,
   :dcterms/description
   #voc/lstr
    "Typically, rights information includes a statement about various property rights associated with the resource, including intellectual property rights.@en",
   :dcterms/issued #inst "1999-07-02T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr
                  "Information about rights held in and over the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/elements/1.1/",
   :rdfs/label #voc/lstr "Rights@en",
   :skos/note
   #voc/lstr
    "A [second property](/specifications/dublin-core/dcmi-terms/#http://purl.org/dc/terms/rights) with the same name as this property has been declared in the [dcterms: namespace](http://purl.org/dc/terms/).  See the Introduction to the document [DCMI Metadata Terms](/specifications/dublin-core/dcmi-terms/) for an explanation.@en"})

(def source
  "The described resource may be derived from the related resource in whole or in part. Recommended best practice is to identify the related resource by means of a string conforming to a formal identification system."
  {:db/ident :dc11/source,
   :dcterms/description
   #voc/lstr
    "The described resource may be derived from the related resource in whole or in part. Recommended best practice is to identify the related resource by means of a string conforming to a formal identification system.@en",
   :dcterms/issued #inst "1999-07-02T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A related resource from which the described resource is derived.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/elements/1.1/",
   :rdfs/label #voc/lstr "Source@en",
   :skos/note
   #voc/lstr
    "A [second property](/specifications/dublin-core/dcmi-terms/#http://purl.org/dc/terms/source) with the same name as this property has been declared in the [dcterms: namespace](http://purl.org/dc/terms/).  See the Introduction to the document [DCMI Metadata Terms](/specifications/dublin-core/dcmi-terms/) for an explanation.@en"})

(def subject
  "Typically, the subject will be represented using keywords, key phrases, or classification codes. Recommended best practice is to use a controlled vocabulary."
  {:db/ident :dc11/subject,
   :dcterms/description
   #voc/lstr
    "Typically, the subject will be represented using keywords, key phrases, or classification codes.  Recommended best practice is to use a controlled vocabulary.@en",
   :dcterms/issued #inst "1999-07-02T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr "The topic of the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/elements/1.1/",
   :rdfs/label #voc/lstr "Subject@en",
   :skos/note
   #voc/lstr
    "A [second property](/specifications/dublin-core/dcmi-terms/#http://purl.org/dc/terms/subject) with the same name as this property has been declared in the [dcterms: namespace](http://purl.org/dc/terms/).  See the Introduction to the document [DCMI Metadata Terms](/specifications/dublin-core/dcmi-terms/) for an explanation.@en"})

(def title
  "A name given to the resource."
  {:db/ident :dc11/title,
   :dcterms/issued #inst "1999-07-02T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr "A name given to the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/elements/1.1/",
   :rdfs/label #voc/lstr "Title@en",
   :skos/note
   #voc/lstr
    "A [second property](/specifications/dublin-core/dcmi-terms/#http://purl.org/dc/terms/title) with the same name as this property has been declared in the [dcterms: namespace](http://purl.org/dc/terms/).  See the Introduction to the document [DCMI Metadata Terms](/specifications/dublin-core/dcmi-terms/) for an explanation.@en"})

(def type
  "Recommended practice is to use a controlled vocabulary such as the DCMI Type Vocabulary [[DCMI-TYPE](http://dublincore.org/documents/dcmi-type-vocabulary/)]. To describe the file format, physical medium, or dimensions of the resource, use the Format element."
  {:db/ident :dc11/type,
   :dcterms/description
   #voc/lstr
    "Recommended practice is to use a controlled vocabulary such as the DCMI Type Vocabulary [[DCMI-TYPE](http://dublincore.org/documents/dcmi-type-vocabulary/)]. To describe the file format, physical medium, or dimensions of the resource, use the Format element.@en",
   :dcterms/issued #inst "1999-07-02T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr "The nature or genre of the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/elements/1.1/",
   :rdfs/label #voc/lstr "Type@en",
   :skos/note
   #voc/lstr
    "A [second property](/specifications/dublin-core/dcmi-terms/#http://purl.org/dc/terms/type) with the same name as this property has been declared in the [dcterms: namespace](http://purl.org/dc/terms/).  See the Introduction to the document [DCMI Metadata Terms](/specifications/dublin-core/dcmi-terms/) for an explanation.@en"})