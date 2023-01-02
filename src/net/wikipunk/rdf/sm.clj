(ns net.wikipunk.rdf.sm
  "Specification Metadata (SM) Vocabulary"
  {:dcterms/license :sm/MITLicense,
   :dcterms/source "http://www.omg.org/cgi-bin/doc?pp",
   :owl/imports "http://www.w3.org/2004/02/skos/core",
   :owl/versionIRI
   "http://www.omg.org/techprocess/ab/20140801/SpecificationMetadata/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
   :rdfa/prefix "sm",
   :rdfa/uri "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
   :rdfs/label "Specification Metadata (SM) Vocabulary",
   :skos/changeNote
   ["The ontology was revised in July, 2013, as follows:\n   (1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing and specifically for the Financial Industry Business Ontology (FIBO) and other forthcoming OMG ontology specifications  \n   (2) to introduce the use of version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n   (3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n   (4) to extend the file-level metadata to allow for cases such as FIBO, where the specification includes family, specification, spcification version, module, and ontology level detail that should be documented via annotations (e.g., family level of FIBO, specification level of Foundations, module level such as Utilities, and ontology level including annotation vocabulary, business types, and relations) \n   (5) to make other minor corrections in the metadata and definitions for clarification purposes"
    "The ontology was revised in August 2014 to:\n(1) clean up the metadata about this ontology to reflect current usage\n(2) add support for OMG issue resolution detail to facilitate change management and automated specification generation\n(3) modify the approach to inclusion of licensing information in model metadata to reference an individual of type dct:LicenseDocument, contained in this metadata ontology, rather than requiring the text to be repeated in any ontology published by the OMG"],
   :skos/historyNote
   "Revisions are managed per the process outlined in the Policies and Procedures for OMG standards, with the intent to maintain backwards compatibility to the degree possible.\n  \nThe RDF/XML serialized OWL corresponding to the ODM/OWL model has been checked for syntactic errors and logical consistency with Protege 4 (http://protege.stanford.edu/), HermiT 1.3.8 (http://www.hermit-reasoner.com/) and Pellet 2.2 (http://clarkparsia.com/pellet/).",
   :sm/addressForComments "http://www.omg.org/issues/",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright
   "Copyright (c) 2012-2014 Adaptive\nCopyright (c) 2012-2014 Object Management Group, Inc.\nCopyright (c) 2012-2014 Thematix Partners LLC",
   :sm/dependsOn ["http://www.w3.org/2004/02/skos/core.rdf"
                  "http://purl.org/dc/terms/"],
   :sm/filename "SpecificationMetadata.rdf",
   :sm/isNormative true,
   :sm/keyword "specification metadata",
   :sm/priorVersion
   ["http://www.omg.org/techprocess/ab/20130701/SpecificationMetadata/"
    "http://www.omg.org/techprocess/ab/20130301/SpecificationMetadata.owl"],
   :sm/publicationDate #inst "2014-08-18T22:00:00.000-00:00",
   :sm/relatedSpecification
   "http://www.metadata-standards.org/24706/index.html",
   :sm/responsibleTaskForce "http://www.omg.org/news/about/ab.htm",
   :sm/specificationAbbreviation "SM",
   :sm/specificationAbstract
   "This ontology provides a set of basic metadata annotations for use in describing Object Management Group (OMG) specifications, standards, and documents.  It was recommended for use by the OMG Architecture Board (AB) in OMG standard ontologies, vocabularies and other models at the March 2013 Reston meeting. \n\nThe annotations defined herein extend properties defined in the Dublin Core Metadata Terms Vocabulary and in the W3C Simple Knowledge Organization System (SKOS) Vocabulary, and have been customized to support the OMG specification development process.  Note that any of the original properties provided in Dublin Core and SKOS can be used in addition to the terms provided herein.  However, any Dublin Core terms that are not explicitly defined as OWL annotation properties below must be so declared in the ontologies that use them.",
   :sm/specificationTitle "Specification Metadata (SM) Ontology",
   :sm/specificationURL
   "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
   :sm/specificationVersionStatus "OMG Architecture Board Recommendation",
   :sm/specificationVersionURL
   "http://www.omg.org/techprocess/ab/20140801/SpecificationMetadata/",
   :sm/topicArea "analysis and design"}
  (:refer-clojure :exclude [format keyword]))

(def BibliographicCitation
  "a reference to an authoritative source for provenance or substatiation purposes; The form of bibliographic citation may be specific to a domain, publication, or community, thus specific properties to define the details are not provided. FRBR, ISO 690, and others provide reasonable approaches if none is explicitly required for a specification."
  {:db/ident :sm/BibliographicCitation,
   :rdf/type :owl/Class,
   :rdfs/label "bibliographic citation",
   :rdfs/subClassOf :skos/Concept,
   :skos/definition
   "a reference to an authoritative source for provenance or substatiation purposes; \n\nThe form of bibliographic citation may be specific to a domain, publication, or community, thus specific properties to define the details are not provided. FRBR, ISO 690, and others provide reasonable approaches if none is explicitly required for a specification."})

(def IssueResolution
  "An Issue is a report made to OMG of an error in an OMG Specification. An F/RTF Report lists the issues and comments received by the F/RTF against a specification, and the resolution, if any, for each comment (referred to by its Issue Number). For resolutions that involve changes to the models (machine readable artifacts) corresponding to the specification, an individual of type IssueResolution should be included in the administrative metadata for the version of the specification to which it applies, for each issue resolved, linking to the appropriate issue page in the OMG JIRA system where further information about the issue and how it was dealt with can be found."
  {:db/ident :sm/IssueResolution,
   :rdf/type :owl/Class,
   :rdfs/label "issue resolution",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/string,
                      :owl/onProperty  :sm/isIdentifiedBy,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :sm/hasIssueReference,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     :skos/Concept],
   :skos/definition
   "An Issue is a report made to OMG of an error in an OMG Specification. An F/RTF Report lists the issues and comments received by the F/RTF against a specification, and the resolution, if any, for each comment (referred to by its Issue Number).  \n\nFor resolutions that involve changes to the models (machine readable artifacts) corresponding to the specification, an individual of type IssueResolution should be included in the administrative metadata for the version of the specification to which it applies, for each issue resolved, linking to the appropriate issue page in the OMG JIRA system where further information about the issue and how it was dealt with can be found.\n"})

(def MITLicense
  "license document representing the actual text of the MIT License"
  {:db/ident :sm/MITLicense,
   :dcterms/rights
   ["http://opensource.org/licenses/mit-license.php"
    "The MIT License:  Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the \"Software\"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:\n\nThe copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.\n\nTHE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE\nAND NONINFRINGEMENT.  IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE."],
   :rdf/type [:dcterms/LicenseDocument :owl/NamedIndividual],
   :rdfs/label "The MIT License",
   :skos/definition
   "license document representing the actual text of the MIT License"})

(def MediaType
  "MIME media type as defined by the IANA standard"
  {:db/ident :sm/MediaType,
   :rdf/type :owl/Class,
   :rdfs/label "MIME MediaType",
   :rdfs/seeAlso
   "http://www.iana.org/assignments/media-types/media-types.xhtml",
   :rdfs/subClassOf :skos/Concept,
   :skos/definition "MIME media type as defined by the IANA standard"})

(def Module
  "Modularization of any engineering model involves principles of the model driven architecture methodology (MDA), including but not limited to separation of concerns, coherence, and establishing clear logical boundaries in order to increase reusability and maintainability. A module should be designed to reflect these principles, including a small number of models that have well-defined relationships with one another, that form a coherent and cohesive whole for some purpose, and that have clear boundaries or interfaces to other external modules."
  {:db/ident :sm/Module,
   :rdf/type :owl/Class,
   :rdfs/label "module",
   :rdfs/subClassOf :skos/Concept,
   :skos/definition
   "Modularization of any engineering model involves principles of the model driven architecture methodology (MDA), including but not limited to separation of concerns, coherence, and establishing clear logical boundaries in order to increase reusability and maintainability.  \n\nA module should be designed to reflect these principles, including a small number of models that have well-defined relationships with one another, that form a coherent and cohesive whole for some purpose, and that have clear boundaries or interfaces to other external modules."})

(def Organization
  "an entity, such as an institution or an association, that has a collective goal and is linked to an external environment"
  {:db/ident :sm/Organization,
   :dcterms/source "http://en.wikipedia.org/wiki/Organization",
   :rdf/type :owl/Class,
   :rdfs/label "organization",
   :rdfs/subClassOf :skos/Concept,
   :skos/definition
   "an entity, such as an institution or an association, that has a collective goal and is linked to an external environment"})

(def Specification
  "an explicit set of requirements to be satisfied by a material, product, or service"
  {:db/ident :sm/Specification,
   :dcterms/source "http://en.wikipedia.org/wiki/Specification",
   :rdf/type :owl/Class,
   :rdfs/label "specification",
   :rdfs/subClassOf :skos/Concept,
   :skos/altLabel "spec",
   :skos/definition
   "an explicit set of requirements to be satisfied by a material, product, or service"})

(def SpecificationFamily
  "a family of specifications, such as the OMG's Financial Industry Business Ontology (FIBO) or the Information Exchange Framework (IEF)"
  {:db/ident :sm/SpecificationFamily,
   :rdf/type :owl/Class,
   :rdfs/label "specification family",
   :rdfs/subClassOf :skos/Concept,
   :skos/definition
   "a family of specifications, such as the OMG's Financial Industry Business Ontology (FIBO) or the Information Exchange Framework (IEF)"})

(def SpecificationVersion
  "a formal revision of a given specification, produced through the efforts of a finalization or revision task force"
  {:db/ident :sm/SpecificationVersion,
   :rdf/type :owl/Class,
   :rdfs/label "specification version",
   :rdfs/subClassOf [{:owl/onClass    :sm/Specification,
                      :owl/onProperty :sm/isVersionOf,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :skos/Concept],
   :skos/definition
   "a formal revision of a given specification, produced through the efforts of a finalization or revision task force"})

(def TypeOfContent
  "the content type for the model or module, for example, MOF metamodel, UML profile, UML model, vocabulary, ontology, ruleset, etc. The actual content language for the module (for example, RDF Schema, OWL, or SBVR in the case of a vocabulary) should be specified using the contentLanguage annotation property. Valid values are specified as individuals."
  {:db/ident :sm/TypeOfContent,
   :rdf/type :owl/Class,
   :rdfs/label "content type",
   :rdfs/subClassOf :skos/Concept,
   :skos/definition
   "the content type for the model or module, for example, MOF metamodel, UML profile, UML model, vocabulary, ontology, ruleset, etc.  \n\nThe actual content language for the module (for example, RDF Schema, OWL, or SBVR in the case of a vocabulary) should be specified using the contentLanguage annotation property.  Valid values are specified as individuals."})

(def addressForComments
  "a link to a mailing list or web page where questions, discussion, and issues can be raised"
  {:db/ident :sm/addressForComments,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/domain :sm/SpecificationVersion,
   :rdfs/label "addressForComments",
   :rdfs/range :xsd/anyURI,
   :skos/definition
   "a link to a mailing list or web page where questions, discussion, and issues can be raised"})

(def affectsModelElement
  {:db/ident    :sm/affectsModelElement,
   :rdf/type    :owl/AnnotationProperty,
   :rdfs/domain :sm/IssueResolution,
   :rdfs/label  "affects model element"})

(def author
  "Author identifies an individual or organization that originated the model or specification (range can be a dct:Agent or string)."
  {:db/ident :sm/author,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "author",
   :rdfs/subPropertyOf :dcterms/creator,
   :skos/definition
   "Author identifies an individual or organization that originated the model or specification (range can be a dct:Agent or string)."})

(def contentLanguage
  "a link to the core language and/or specification of the model/electronic file, for example, UML, OWL, SysML, BPMN, including linking to the version of the language in question"
  {:db/ident :sm/contentLanguage,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "content language",
   :rdfs/range :xsd/anyURI,
   :rdfs/subPropertyOf :dcterms/type,
   :skos/definition
   "a link to the core language and/or specification of the model/electronic file, for example, UML, OWL, SysML, BPMN, including linking to the version of the language in question"})

(def contentType
  "indicates the content type, for example, MOF metamodel, UML profile, UML model, SBVR or RDF vocabulary, OWL or CL ontology"
  {:db/ident :sm/contentType,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "content type",
   :rdfs/range :sm/TypeOfContent,
   :skos/definition
   "indicates the content type, for example, MOF metamodel, UML profile, UML model, SBVR or RDF vocabulary, OWL or CL ontology"})

(def contributor
  "an organization or individual that has made a significant contribution to the specification"
  {:db/ident :sm/contributor,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "contributor",
   :rdfs/subPropertyOf :dcterms/contributor,
   :skos/definition
   "an organization or individual that has made a significant contribution to the specification"})

(def copyright
  "copyright statement for the specification version, content, or model/electronic file"
  {:db/ident :sm/copyright,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "copyright",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :dcterms/rights,
   :skos/definition
   "copyright statement for the specification version, content, or model/electronic file"})

(def dependsOn
  "a bibliographic reference for and/or URL of any electronic files or documents (e.g., document version URL if applicable) on which this specification or model depends; if the model contains multiple modules, then dependencies should reflect those of the model in question"
  {:db/ident :sm/dependsOn,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "depends on",
   :rdfs/subPropertyOf :rdfs/seeAlso,
   :skos/definition
   "a bibliographic reference for and/or URL of any electronic files or documents (e.g., document version URL if applicable) on which this specification or model depends; if the model contains multiple modules, then dependencies should reflect those of the model in question"})

(def directSource
  "reference used as a primary, direct source for content in developing this specification or model (range can be a string, URI, or BibliographicCitation)"
  {:db/ident :sm/directSource,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "direct source",
   :rdfs/subPropertyOf :dcterms/source,
   :skos/definition
   "reference used as a primary, direct source for content in developing this specification or model (range can be a string, URI, or BibliographicCitation)"})

(def documentNumber
  "OMG document number (for the document or file this metadata is associated with); note that a single OMG document number may be associated with many files, for example in the case of an archive containing all of the ontologies associated with a given FIBO specification"
  {:db/ident :sm/documentNumber,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "document number",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :dcterms/identifier,
   :skos/definition
   "OMG document number (for the document or file this metadata is associated with); note that a single OMG document number may be associated with many files, for example in the case of an archive containing all of the ontologies associated with a given FIBO specification"})

(def documentURL
  "document URL (for the specific document or model file this metadata is associated with)"
  {:db/ident :sm/documentURL,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "URL for the document",
   :rdfs/range :xsd/anyURI,
   :skos/definition
   "document URL (for the specific document or model file this metadata is associated with)"})

(def editor
  "an editor of the specification, which may include the primary contact organization, or RTF/FTF co-chair (organization), depending on where the specification is in the process"
  {:db/ident :sm/editor,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "editor",
   :rdfs/subPropertyOf :sm/contributor,
   :skos/definition
   "an editor of the specification, which may include the primary contact organization, or RTF/FTF co-chair (organization), depending on where the specification is in the process"})

(def familyAbbreviation
  "abbreviation or acronym for the specification family"
  {:db/ident           :sm/familyAbbreviation,
   :rdf/type           :owl/AnnotationProperty,
   :rdfs/domain        :sm/SpecificationFamily,
   :rdfs/label         "specification family abbreviation or acronym",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :skos/altLabel,
   :skos/definition    "abbreviation or acronym for the specification family"})

(def familyAbstract
  "a short textual description of the family of specifications"
  {:db/ident :sm/familyAbstract,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/domain :sm/SpecificationFamily,
   :rdfs/label "family abstract",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :dcterms/abstract,
   :skos/definition
   "a short textual description of the family of specifications"})

(def familyTitle
  "specification family title (for example, Financial Industry Business Ontology)"
  {:db/ident :sm/familyTitle,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/domain :sm/SpecificationFamily,
   :rdfs/label "specification family title",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf [:skos/prefLabel :dcterms/title],
   :skos/definition
   "specification family title (for example, Financial Industry Business Ontology)"})

(def familyURL
  "URL where the specification family is published"
  {:db/ident        :sm/familyURL,
   :rdf/type        :owl/AnnotationProperty,
   :rdfs/domain     :sm/SpecificationFamily,
   :rdfs/label      "specification family URL",
   :rdfs/range      :xsd/anyURI,
   :skos/definition "URL where the specification family is published"})

(def fileAbbreviation
  "abbreviation or acronym for the file, such as a namespace prefix, if distinct from that of the specification"
  {:db/ident :sm/fileAbbreviation,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "file-level abbreviation or acronym",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :skos/altLabel,
   :skos/definition
   "abbreviation or acronym for the file, such as a namespace prefix, if distinct from that of the specification"})

(def fileAbstract
  "a short textual description of the model or file"
  {:db/ident           :sm/fileAbstract,
   :rdf/type           :owl/AnnotationProperty,
   :rdfs/label         "file-level abstract",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :dcterms/abstract,
   :skos/definition    "a short textual description of the model or file"})

(def fileVersion
  "file version, if distinct from the specification or module version"
  {:db/ident :sm/fileVersion,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "file version",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :dcterms/hasVersion,
   :skos/definition
   "file version, if distinct from the specification or module version"})

(def filename
  "name of the electronic document or file this metadata is associated with"
  {:db/ident :sm/filename,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "electronic file name",
   :rdfs/range :xsd/string,
   :skos/definition
   "name of the electronic document or file this metadata is associated with"})

(def formalVersion
  "a link to the latest published formal specification (document)"
  {:db/ident :sm/formalVersion,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/domain :sm/Specification,
   :rdfs/label "formal version",
   :rdfs/range :xsd/anyURI,
   :rdfs/subPropertyOf :dcterms/hasVersion,
   :skos/definition
   "a link to the latest published formal specification (document)"})

(def format
  "serialization format for the file in terms of its MIME Type, such as xmi, rdf/xml, owl/xml, etc."
  {:db/ident :sm/format,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "format",
   :rdfs/range :sm/MediaType,
   :rdfs/subPropertyOf :dcterms/format,
   :skos/definition
   "serialization format for the file in terms of its MIME Type, such as xmi, rdf/xml, owl/xml, etc.\n"})

(def hasDescription
  {:db/ident    :sm/hasDescription,
   :rdf/type    :owl/DatatypeProperty,
   :rdfs/domain :sm/IssueResolution,
   :rdfs/label  "has description",
   :rdfs/range  :xsd/string})

(def hasIssueReference
  {:db/ident    :sm/hasIssueReference,
   :rdf/type    :owl/DatatypeProperty,
   :rdfs/domain :sm/IssueResolution,
   :rdfs/label  "has issue reference",
   :rdfs/range  :xsd/anyURI})

(def hasSpecificationVersion
  "relates a 'master' or umbrella specification to specific versions of that specification, created through a finalization or revision process"
  {:db/ident :sm/hasSpecificationVersion,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :sm/Specification,
   :rdfs/label "has specification version",
   :rdfs/range :sm/SpecificationVersion,
   :skos/definition
   "relates a 'master' or umbrella specification to specific versions of that specification, created through a finalization or revision process"})

(def informativeReference
  "informative reference, standard, or document"
  {:db/ident           :sm/informativeReference,
   :rdf/type           :owl/AnnotationProperty,
   :rdfs/domain        :sm/Specification,
   :rdfs/label         "informative reference",
   :rdfs/range         :sm/Specification,
   :rdfs/subPropertyOf :dcterms/references,
   :skos/definition    "informative reference, standard, or document"})

(def isIdentifiedBy
  {:db/ident    :sm/isIdentifiedBy,
   :rdf/type    [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/domain :sm/IssueResolution,
   :rdfs/label  "is identified by",
   :rdfs/range  :xsd/string})

(def isNormative
  "boolean value indicating whether or not the file is a normative component of a specification"
  {:db/ident :sm/isNormative,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "is normative",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "boolean value indicating whether or not the file is a normative component of a specification"})

(def isReflectedIn
  {:db/ident      :sm/isReflectedIn,
   :owl/inverseOf :sm/reflects,
   :rdf/type      :owl/ObjectProperty,
   :rdfs/domain   :sm/IssueResolution,
   :rdfs/label    "is reflected in",
   :rdfs/range    :sm/SpecificationVersion})

(def isVersionOf
  "relates a given version of a specification to the 'master' or original specification that it modifies"
  {:db/ident :sm/isVersionOf,
   :owl/inverseOf :sm/hasSpecificationVersion,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :sm/SpecificationVersion,
   :rdfs/label "is version of",
   :rdfs/range :sm/Specification,
   :skos/definition
   "relates a given version of a specification to the 'master' or original specification that it modifies"})

(def keyword
  "keyword relevant to the specification"
  {:db/ident           :sm/keyword,
   :rdf/type           :owl/AnnotationProperty,
   :rdfs/domain        :sm/Specification,
   :rdfs/label         "keyword",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :dcterms/subject,
   :skos/definition    "keyword relevant to the specification",
   :skos/editorialNote "may appear more than once, as appropriate"})

(def moduleAbbreviation
  "abbreviation or acronym for the module, if distinct from that of the specification"
  {:db/ident :sm/moduleAbbreviation,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/domain :sm/Module,
   :rdfs/label "module abbreviation or acronym",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :skos/altLabel,
   :skos/definition
   "abbreviation or acronym for the module, if distinct from that of the specification"})

(def moduleAbstract
  "a short textual description of the module"
  {:db/ident           :sm/moduleAbstract,
   :rdf/type           :owl/AnnotationProperty,
   :rdfs/domain        :sm/Module,
   :rdfs/label         "module abstract",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :dcterms/abstract,
   :skos/definition    "a short textual description of the module"})

(def moduleName
  "module name, if distinct from the specification title"
  {:db/ident           :sm/moduleName,
   :rdf/type           :owl/AnnotationProperty,
   :rdfs/domain        :sm/Module,
   :rdfs/label         "module name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :dcterms/title,
   :skos/definition    "module name, if distinct from the specification title"})

(def moduleShortTitle
  "a short title for the component or module"
  {:db/ident           :sm/moduleShortTitle,
   :rdf/type           :owl/AnnotationProperty,
   :rdfs/domain        :sm/Module,
   :rdfs/label         "module short title",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf [:skos/prefLabel :dcterms/title],
   :skos/definition    "a short title for the component or module"})

(def moduleVersion
  "module version, if distinct from the specification version"
  {:db/ident :sm/moduleVersion,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/domain :sm/Module,
   :rdfs/label "module version",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :dcterms/hasVersion,
   :skos/definition
   "module version, if distinct from the specification version"})

(def normativeReference
  "a normative reference or standard for the specification"
  {:db/ident :sm/normativeReference,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/domain :sm/Specification,
   :rdfs/label "normative reference",
   :rdfs/range :sm/Specification,
   :rdfs/subPropertyOf :dcterms/references,
   :skos/definition "a normative reference or standard for the specification"})

(def priorSpecificationVersion
  "a link to the immediately preceding OMG formal specification version"
  {:db/ident :sm/priorSpecificationVersion,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/domain :sm/SpecificationVersion,
   :rdfs/label "prior specification version",
   :rdfs/range :xsd/anyURI,
   :rdfs/subPropertyOf :dcterms/hasVersion,
   :skos/definition
   "a link to the immediately preceding OMG formal specification version"})

(def priorVersion
  "a link to the immediately preceding version at the file level"
  {:db/ident :sm/priorVersion,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "prior version",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :dcterms/hasVersion,
   :skos/definition
   "a link to the immediately preceding version at the file level"})

(def publicationDate
  "the date this version of the specification was published"
  {:db/ident :sm/publicationDate,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/domain :sm/SpecificationVersion,
   :rdfs/label "publication date",
   :rdfs/range :xsd/dateTime,
   :rdfs/subPropertyOf :dcterms/issued,
   :skos/definition "the date this version of the specification was published"})

(def reflects
  {:db/ident    :sm/reflects,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :sm/SpecificationVersion,
   :rdfs/label  "reflects",
   :rdfs/range  :sm/IssueResolution})

(def relatedSpecification
  "specification or standard (range can be xsd:string, xsd:anyURI, or BibliographicCitation)"
  {:db/ident :sm/relatedSpecification,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/domain :sm/Specification,
   :rdfs/label "related specification",
   :rdfs/range :sm/Specification,
   :rdfs/subPropertyOf :dcterms/references,
   :skos/definition
   "specification or standard (range can be xsd:string, xsd:anyURI, or BibliographicCitation)"})

(def responsibleTaskForce
  "task force or working group responsible for the original RFP/RFC and specification adoption"
  {:db/ident :sm/responsibleTaskForce,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/domain :sm/Specification,
   :rdfs/label "responsible task force",
   :rdfs/range :xsd/anyURI,
   :skos/definition
   "task force or working group responsible for the original RFP/RFC and specification adoption"})

(def revisedBy
  "task force or working group responsible for this revision of the specification"
  {:db/ident :sm/revisedBy,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "revised by",
   :skos/definition
   "task force or working group responsible for this revision of the specification"})

(def shortTitle
  "a short, commonly used, or preferred name, for a given specification or module"
  {:db/ident :sm/shortTitle,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/domain :sm/Specification,
   :rdfs/label "short name for the specification or module",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf [:skos/prefLabel :dcterms/title],
   :skos/definition
   "a short, commonly used, or preferred name, for a given specification or module"})

(def specificationAbbreviation
  "official abbreviation or acronym for the specification and related electronic files"
  {:db/ident :sm/specificationAbbreviation,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/domain :sm/Specification,
   :rdfs/label "specification abbreviation or acronym",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :skos/altLabel,
   :skos/definition
   "official abbreviation or acronym for the specification and related electronic files"})

(def specificationAbstract
  "a short textual description for the specification"
  {:db/ident           :sm/specificationAbstract,
   :rdf/type           :owl/AnnotationProperty,
   :rdfs/domain        :sm/Specification,
   :rdfs/label         "specification abstract",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :dcterms/abstract,
   :skos/definition    "a short textual description for the specification"})

(def specificationTitle
  "the full (complete) formal title of the specification, without abbreviations"
  {:db/ident :sm/specificationTitle,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/domain :sm/Specification,
   :rdfs/label "specification name or title",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :dcterms/title,
   :skos/definition
   "the full (complete) formal title of the specification, without abbreviations"})

(def specificationURL
  "URL for the specification directory on the OMG web site"
  {:db/ident        :sm/specificationURL,
   :rdf/type        :owl/AnnotationProperty,
   :rdfs/domain     :sm/Specification,
   :rdfs/label      "specification URL",
   :rdfs/range      :xsd/anyURI,
   :skos/definition "URL for the specification directory on the OMG web site"})

(def specificationVersionStatus
  "status of this version of the specification from a process perspective, including whether or not it has been formally adopted or superseded by a newer version"
  {:db/ident :sm/specificationVersionStatus,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/domain :sm/SpecificationVersion,
   :rdfs/label "specification version status",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :skos/note,
   :skos/definition
   "status of this version of the specification from a process perspective, including whether or not it has been formally adopted or superseded by a newer version"})

(def specificationVersionURL
  "explicit URI where the specification version is published"
  {:db/ident :sm/specificationVersionURL,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/domain :sm/SpecificationVersion,
   :rdfs/label "specification version URL",
   :rdfs/range :xsd/anyURI,
   :skos/definition
   "explicit URI where the specification version is published"})

(def submitter
  "a contributor that is an OMG member, identified member of the submission team, and filed the requisite LOI, responsible for the content of the specification or model"
  {:db/ident :sm/submitter,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/domain :sm/Specification,
   :rdfs/label "submitter",
   :rdfs/subPropertyOf :sm/contributor,
   :skos/definition
   "a contributor that is an OMG member, identified member of the submission team, and filed the requisite LOI, responsible for the content of the specification or model"})

(def taskForceReport
  "a link to the FTF or RTF report, if applicable"
  {:db/ident        :sm/taskForceReport,
   :rdf/type        :owl/AnnotationProperty,
   :rdfs/domain     :sm/SpecificationVersion,
   :rdfs/label      "task force report",
   :rdfs/range      :xsd/anyURI,
   :skos/definition "a link to the FTF or RTF report, if applicable"})

(def technologyArea
  "technology area relevant to the specification, for example, analysis and design, business process modeling, information exchange and interoperability, middleware, etc."
  {:db/ident :sm/technologyArea,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/domain :sm/Specification,
   :rdfs/label "technology area",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :dcterms/subject,
   :skos/definition
   "technology area relevant to the specification, for example, analysis and design, business process modeling, information exchange and interoperability, middleware, etc.",
   :skos/editorialNote "may appear more than once, as appropriate"})

(def thisVersion
  "the version identifier for this version of the specification"
  {:db/ident :sm/thisVersion,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/domain :sm/SpecificationVersion,
   :rdfs/label "this version",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :dcterms/hasVersion,
   :skos/definition
   "the version identifier for this version of the specification"})

(def topicArea
  "topic or area of interest that this particular specification relates to, for example, real time, robotics"
  {:db/ident :sm/topicArea,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/domain :sm/Specification,
   :rdfs/label "topic area",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :dcterms/subject,
   :skos/definition
   "topic or area of interest that this particular specification relates to, for example, real time, robotics",
   :skos/editorialNote "may appear more than once, as appropriate"})