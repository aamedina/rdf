(ns net.wikipunk.rdf.gen
  "This ontology implements concepts discussed in the Generic URIs 'DesignIsues' note. It is also the topic of the W3C TAG issue and a related TAG finding. This ontology does not model the fact that representations of a resource can be customised as a function of things like user agent, target media, the geographical position of the user, the preferences of the user, etc. These could be and can be added. The FixedResource class is defined to be specific to ANY variation, as is the fixedResource property."
  {:dc11/title
   "An Ontology for Relating Generic and Specific Information Resources",
   :doc/creator "http://www.w3.org/People/Berners-Lee/card#i",
   :doc/ipr "http://www.w3.org/2000/10/swap/LICENSE.n3",
   :doc/version "$Id: ont.rdf,v 1.7 2009/04/20 10:12:30 timbl Exp $",
   :rdf/ns-prefix-map {"dc11" "http://purl.org/dc/elements/1.1/",
                       "doc"  "http://www.w3.org/2000/10/swap/pim/doc#",
                       "gen"  "http://www.w3.org/2000/01/rdf-schema#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "gen",
   :rdfa/uri "http://www.w3.org/2006/gen/ont",
   :rdfs/comment
   "\n    This ontology implements concepts discussed in the Generic URIs 'DesignIsues' note.\n    It is also the topic of the W3C TAG issue and a related TAG finding.\n    This ontology does not model the fact that representations of a resource can be\n    customised as a function of things like user agent, target media,\n    the geographical position of the user,\n    the preferences of the user, etc.  These could be and can be added.\n    The FixedResource class is defined to be specific to ANY variation,\n    as is the fixedResource property.\n    ",
   :rdfs/seeAlso ["http://www.w3.org/DesignIssues/Generic"]})

(def ContentTypeGenericResource
  "A resource which may have representations in many different Content-Types."
  {:db/ident :gen/ContentTypeGenericResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A resource which may have representations in\n    many different Content-Types.",
   :rdfs/label "Content-Type-generic resource",
   :rdfs/subClassOf
   [:gen/InformationResource :gen/ContentTypeGenericResource :rdfs/Resource]})

(def ContentTypeSpecificResource
  "A resource of which all representations are in the same Internet media type, or 'Content-Type'."
  {:db/ident :gen/ContentTypeSpecificResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A resource of which all representations are in the\n\t\tsame Internet media type, or 'Content-Type'.",
   :rdfs/label "Content-Type-specific resource",
   :rdfs/subClassOf
   [:gen/InformationResource :gen/ContentTypeSpecificResource :rdfs/Resource]})

(def FixedResource
  "A resource whose representation type and content will not change under any circumstances."
  {:db/ident :gen/FixedResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A resource whose representation type and content will not\n\t    change under any circumstances.",
   :rdfs/label "fixed resource",
   :rdfs/subClassOf [:rdfs/Resource
                     :gen/timeSpecificResource
                     :gen/contentTypeSpecificResource
                     :gen/LanguageSpecificResource
                     :gen/FixedResource
                     :gen/InformationResource]})

(def InformationResource
  "An Information Resource is defined by the Architecture of the WWW."
  {:db/ident :gen/InformationResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An Information Resource is defined by the Architecture of\n\t    the WWW.",
   :rdfs/label "information resource",
   :rdfs/subClassOf [:rdfs/Resource :gen/InformationResource]})

(def LanguageGenericResource
  "A resource defiend without constraint as to the particular natural language in which it maight be expressed."
  {:db/ident :gen/LanguageGenericResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A resource defiend without constraint as to\n\tthe particular natural language in which it\n        maight be expressed.",
   :rdfs/label "language-generic resource",
   :rdfs/subClassOf
   [:gen/InformationResource :gen/LanguageGenericResource :rdfs/Resource]})

(def LanguageSpecificResource
  "A resource of which all representations are in the same natural language."
  {:db/ident :gen/LanguageSpecificResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A resource of which all representations are in the\n\t\tsame natural language.",
   :rdfs/label "language-specific resource",
   :rdfs/subClassOf
   [:gen/InformationResource :gen/LanguageSpecificResource :rdfs/Resource]})

(def TimeGenericResource
  "A Information Resource which may have many versions, and therfore representations of the resource at different times may vary."
  {:db/ident :gen/TimeGenericResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A Information Resource which may have many versions,\n    and therfore representations of the resource at different times may vary.",
   :rdfs/label "Time-generic resource",
   :rdfs/subClassOf
   [:gen/InformationResource :gen/TimeGenericResource :rdfs/Resource]})

(def TimeSpecificResource
  "A resource of which all representations are in the same version. Representations of the resource will not change as a result of th resource neing updated to a version with time. The dates of creation and of last modification of such a resource would be expected to be the same."
  {:db/ident :gen/TimeSpecificResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A resource of which all representations are in the\n\t\tsame version.  Representations of the resource will\n                not change as a result of th resource neing updated to a\n                version with time.  The dates of creation and\n                of last modification of such a resource would be\n                expected to be the same.",
   :rdfs/label "version",
   :rdfs/subClassOf
   [:gen/InformationResource :gen/TimeSpecificResource :rdfs/Resource]})

(def contentTypeGeneric
  "Content-Type generic"
  {:db/ident           :gen/contentTypeGeneric,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :gen/ContentTypeSpecificResource,
   :rdfs/label         "Content-Type generic",
   :rdfs/range         :gen/ContentTypeGenericResource,
   :rdfs/subPropertyOf [:gen/sameWorkAs :gen/contentTypeGeneric]})

(def contentTypeSpecific
  "Content-Type specific"
  {:db/ident           :gen/contentTypeSpecific,
   :owl/inverseOf      :gen/ContentTypeGeneric,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :gen/ContentTypeGenericResource,
   :rdfs/label         "Content-Type specific",
   :rdfs/range         :gen/ContentTypeSpecificResource,
   :rdfs/subPropertyOf [:gen/sameWorkAs :gen/contentTypeSpecific]})

(def contentTypeSpecificResource
  {:db/ident        :gen/contentTypeSpecificResource,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :gen/contentTypeSpecificResource})

(def fixedResource
  "A relation between a generic resource and a fixedResource which is an everything-specific version of it."
  {:db/ident :gen/fixedResource,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A relation between a generic resource and a fixedResource\n    which is an everything-specific version of it.",
   :rdfs/domain :gen/InformationResource,
   :rdfs/label "Content-Type specific",
   :rdfs/range :gen/FixedResource,
   :rdfs/subPropertyOf [:gen/timeSpecific
                        :gen/languageSpecific
                        :gen/contentTypeSpecific
                        :gen/fixedResource
                        :gen/sameWorkAs]})

(def languageGeneric
  "language generic"
  {:db/ident           :gen/languageGeneric,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :gen/LanguageSpecificResource,
   :rdfs/label         "language generic",
   :rdfs/range         :gen/LanguageGenericResource,
   :rdfs/subPropertyOf [:gen/sameWorkAs :gen/languageGeneric]})

(def languageSpecific
  "language specific"
  {:db/ident           :gen/languageSpecific,
   :owl/inverseOf      :gen/languageGeneric,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :gen/LanguageGenericResource,
   :rdfs/label         "language specific",
   :rdfs/range         :gen/LanguageSpecificResource,
   :rdfs/subPropertyOf [:gen/sameWorkAs :gen/languageSpecific]})

(def sameWorkAs
  "The equivalence relation linking all versions of a work, specific or generic along various axes."
  {:db/ident :gen/sameWorkAs,
   :rdf/type [:owl/SymmetricProperty :rdf/Property],
   :rdfs/comment
   "The equivalence relation linking all versions of a work,\n            specific or generic along various axes.",
   :rdfs/domain :gen/InformationResource,
   :rdfs/label "same work as",
   :rdfs/range :gen/InformationResource,
   :rdfs/subPropertyOf :gen/sameWorkAs})

(def timeGeneric
  "The related resource which for this time-sepcific resource is the related time-generic resource. A representation of the time-generic resource may be expected to be the most recent time-specific resource at the time of the representation."
  {:db/ident :gen/timeGeneric,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The related resource which for this time-sepcific resource\n            is the related time-generic resource.\n            A representation of the time-generic resource may be expected to be\n            the most recent time-specific resource at the time of\n            the representation.",
   :rdfs/domain :gen/TimeSpecificResource,
   :rdfs/label "time generic",
   :rdfs/range :gen/TimeGenericResource,
   :rdfs/subPropertyOf [:gen/sameWorkAs :gen/timeGeneric]})

(def timeSpecific
  "version"
  {:db/ident           :gen/timeSpecific,
   :owl/inverseOf      :gen/timeGeneric,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :gen/TimeGenericResource,
   :rdfs/label         "version",
   :rdfs/range         :gen/TimeSpecificResource,
   :rdfs/subPropertyOf [:gen/sameWorkAs :gen/timeSpecific]})

(def timeSpecificResource
  {:db/ident        :gen/timeSpecificResource,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :gen/timeSpecificResource})