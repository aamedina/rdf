(ns net.wikipunk.rdf.gen
  {:dcat/downloadURL "net/wikipunk/ext/gen.rdf",
   :namespaces       {"dc11" "http://purl.org/dc/elements/1.1/",
                      "doc"  "http://www.w3.org/2000/10/swap/pim/doc#",
                      "gen"  "http://www.w3.org/2006/gen/ont#",
                      "owl"  "http://www.w3.org/2002/07/owl#",
                      "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                      "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type         :owl/Ontology,
   :rdfa/prefix      "gen",
   :rdfa/uri         "http://www.w3.org/2006/gen/ont#"})

(def ContentTypeGenericResource
  {:db/ident :gen/ContentTypeGenericResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A resource which may have representations in\n    many different Content-Types.",
   :rdfs/label "Content-Type-generic resource",
   :rdfs/subClassOf :gen/InformationResource})

(def ContentTypeSpecificResource
  {:db/ident :gen/ContentTypeSpecificResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A resource of which all representations are in the\n\t\tsame Internet media type, or 'Content-Type'.",
   :rdfs/label "Content-Type-specific resource",
   :rdfs/subClassOf :gen/InformationResource})

(def FixedResource
  {:db/ident :gen/FixedResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A resource whose representation type and content will not\n\t    change under any circumstances.",
   :rdfs/label "fixed resource",
   :rdfs/subClassOf #{:gen/ContentTypeSpecificResource :gen/TimeSpecificResource
                      :gen/LanguageSpecificResource}})

(def InformationResource
  {:db/ident :gen/InformationResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An Information Resource is defined by the Architecture of\n\t    the WWW.",
   :rdfs/label "information resource"})

(def LanguageGenericResource
  {:db/ident :gen/LanguageGenericResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A resource defiend without constraint as to\n\tthe particular natural language in which it\n        maight be expressed.",
   :rdfs/label "language-generic resource",
   :rdfs/subClassOf :gen/InformationResource})

(def LanguageSpecificResource
  {:db/ident :gen/LanguageSpecificResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A resource of which all representations are in the\n\t\tsame natural language.",
   :rdfs/label "language-specific resource",
   :rdfs/subClassOf :gen/InformationResource})

(def TimeGenericResource
  {:db/ident :gen/TimeGenericResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A Information Resource which may have many versions,\n    and therfore representations of the resource at different times may vary.",
   :rdfs/label "Time-generic resource",
   :rdfs/subClassOf :gen/InformationResource})

(def TimeSpecificResource
  {:db/ident :gen/TimeSpecificResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A resource of which all representations are in the\n\t\tsame version.  Representations of the resource will\n                not change as a result of th resource neing updated to a\n                version with time.  The dates of creation and\n                of last modification of such a resource would be\n                expected to be the same.",
   :rdfs/label "version",
   :rdfs/subClassOf :gen/InformationResource})

(def contentTypeGeneric
  {:db/ident           :gen/contentTypeGeneric,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :gen/ContentTypeSpecificResource,
   :rdfs/label         "Content-Type generic",
   :rdfs/range         :gen/ContentTypeGenericResource,
   :rdfs/subPropertyOf :gen/sameWorkAs})

(def contentTypeSpecific
  {:db/ident           :gen/contentTypeSpecific,
   :owl/inverseOf      :gen/contentTypeGeneric,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :gen/ContentTypeGenericResource,
   :rdfs/label         "Content-Type specific",
   :rdfs/range         :gen/ContentTypeSpecificResource,
   :rdfs/subPropertyOf :gen/sameWorkAs})

(def fixedResource
  {:db/ident :gen/fixedResource,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A relation between a generic resource and a fixedResource\n    which is an everything-specific version of it.",
   :rdfs/domain :gen/InformationResource,
   :rdfs/label "Content-Type specific",
   :rdfs/range :gen/FixedResource,
   :rdfs/subPropertyOf #{:gen/languageSpecific :gen/timeSpecific
                         :gen/contentTypeSpecific}})

(def languageGeneric
  {:db/ident           :gen/languageGeneric,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :gen/LanguageSpecificResource,
   :rdfs/label         "language generic",
   :rdfs/range         :gen/LanguageGenericResource,
   :rdfs/subPropertyOf :gen/sameWorkAs})

(def languageSpecific
  {:db/ident           :gen/languageSpecific,
   :owl/inverseOf      :gen/languageGeneric,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :gen/LanguageGenericResource,
   :rdfs/label         "language specific",
   :rdfs/range         :gen/LanguageSpecificResource,
   :rdfs/subPropertyOf :gen/sameWorkAs})

(def sameWorkAs
  {:db/ident :gen/sameWorkAs,
   :rdf/type #{:owl/SymmetricProperty :rdf/Property},
   :rdfs/comment
   "The equivalence relation linking all versions of a work,\n            specific or generic along various axes.",
   :rdfs/domain :gen/InformationResource,
   :rdfs/label "same work as",
   :rdfs/range :gen/InformationResource})

(def timeGeneric
  {:db/ident :gen/timeGeneric,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The related resource which for this time-sepcific resource\n            is the related time-generic resource.\n            A representation of the time-generic resource may be expected to be\n            the most recent time-specific resource at the time of\n            the representation.",
   :rdfs/domain :gen/TimeSpecificResource,
   :rdfs/label "time generic",
   :rdfs/range :gen/TimeGenericResource,
   :rdfs/subPropertyOf :gen/sameWorkAs})

(def timeSpecific
  {:db/ident           :gen/timeSpecific,
   :owl/inverseOf      :gen/timeGeneric,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :gen/TimeGenericResource,
   :rdfs/label         "version",
   :rdfs/range         :gen/TimeSpecificResource,
   :rdfs/subPropertyOf :gen/sameWorkAs})

(def urn:uuid:9132cae4-f2b7-5cf8-9787-20c7bac7dbfa
  {:dc11/title
   "An Ontology for Relating Generic and Specific Information Resources",
   :doc/creator {:xsd/anyURI "http://www.w3.org/People/Berners-Lee/card#i"},
   :doc/ipr {:xsd/anyURI "http://www.w3.org/2000/10/swap/LICENSE.n3"},
   :doc/version "$Id: ont.rdf,v 1.7 2009/04/20 10:12:30 timbl Exp $",
   :rdfs/comment
   "\n    This ontology implements concepts discussed in the Generic URIs 'DesignIsues' note.\n    It is also the topic of the W3C TAG issue and a related TAG finding.\n    This ontology does not model the fact that representations of a resource can be\n    customised as a function of things like user agent, target media,\n    the geographical position of the user,\n    the preferences of the user, etc.  These could be and can be added.\n    The FixedResource class is defined to be specific to ANY variation,\n    as is the fixedResource property.\n    ",
   :rdfs/seeAlso {:xsd/anyURI "http://www.w3.org/DesignIssues/Generic"},
   :xsd/anyURI "urn:uuid:9132cae4-f2b7-5cf8-9787-20c7bac7dbfa"})
