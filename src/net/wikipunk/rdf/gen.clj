(ns net.wikipunk.rdf.gen
  "http://www.w3.org/2006/gen/ont#"
  {:rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/elements/1.1/",
                       "doc"     "http://www.w3.org/2000/10/swap/pim/doc#",
                       "gen"     "http://www.w3.org/2006/gen/ont#",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "gen",
   :rdfa/uri          "http://www.w3.org/2006/gen/ont#"})

(def ContentTypeGenericResource
  "A resource which may have representations in     many different Content-Types."
  {:rdf/about :gen/ContentTypeGenericResource,
   :rdfs/comment
   "A resource which may have representations in\n    many different Content-Types.",
   :rdfs/label "Content-Type-generic resource",
   :rdfs/subClassOf :gen/InformationResource})

(def ContentTypeSpecificResource
  "A resource of which all representations are in the   same Internet media type, or 'Content-Type'."
  {:rdf/about :gen/ContentTypeSpecificResource,
   :rdfs/comment
   "A resource of which all representations are in the\n\t\tsame Internet media type, or 'Content-Type'.",
   :rdfs/label "Content-Type-specific resource",
   :rdfs/subClassOf :gen/InformationResource})

(def FixedResource
  "A resource whose representation type and content will not      change under any circumstances."
  {:rdf/about :gen/FixedResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A resource whose representation type and content will not\n\t    change under any circumstances.",
   :rdfs/label "fixed resource",
   :rdfs/subClassOf [:gen/timeSpecificResource
                     :gen/contentTypeSpecificResource
                     :gen/LanguageSpecificResource]})

(def InformationResource
  "An Information Resource is defined by the Architecture of      the WWW."
  {:rdf/about :gen/InformationResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An Information Resource is defined by the Architecture of\n\t    the WWW.",
   :rdfs/label "information resource"})

(def LanguageGenericResource
  "A resource defiend without constraint as to  the particular natural language in which it         maight be expressed."
  {:rdf/about :gen/LanguageGenericResource,
   :rdfs/comment
   "A resource defiend without constraint as to\n\tthe particular natural language in which it\n        maight be expressed.",
   :rdfs/label "language-generic resource",
   :rdfs/subClassOf :gen/InformationResource})

(def LanguageSpecificResource
  "A resource of which all representations are in the   same natural language."
  {:rdf/about :gen/LanguageSpecificResource,
   :rdfs/comment
   "A resource of which all representations are in the\n\t\tsame natural language.",
   :rdfs/label "language-specific resource",
   :rdfs/subClassOf :gen/InformationResource})

(def TimeGenericResource
  "A Information Resource which may have many versions,     and therfore representations of the resource at different times may vary."
  {:rdf/about :gen/TimeGenericResource,
   :rdfs/comment
   "A Information Resource which may have many versions,\n    and therfore representations of the resource at different times may vary.",
   :rdfs/label "Time-generic resource",
   :rdfs/subClassOf :gen/InformationResource})

(def TimeSpecificResource
  "A resource of which all representations are in the   same version.  Representations of the resource will                 not change as a result of th resource neing updated to a                 version with time.  The dates of creation and                 of last modification of such a resource would be                 expected to be the same."
  {:rdf/about :gen/TimeSpecificResource,
   :rdfs/comment
   "A resource of which all representations are in the\n\t\tsame version.  Representations of the resource will\n                not change as a result of th resource neing updated to a\n                version with time.  The dates of creation and\n                of last modification of such a resource would be\n                expected to be the same.",
   :rdfs/label "version",
   :rdfs/subClassOf :gen/InformationResource})

(def contentTypeGeneric
  {:rdf/about          :gen/contentTypeGeneric,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :gen/ContentTypeSpecificResource,
   :rdfs/label         "Content-Type generic",
   :rdfs/range         :gen/ContentTypeGenericResource,
   :rdfs/subPropertyOf :gen/sameWorkAs})

(def contentTypeSpecific
  {:owl/inverseOf      :gen/ContentTypeGeneric,
   :rdf/about          :gen/contentTypeSpecific,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :gen/ContentTypeGenericResource,
   :rdfs/label         "Content-Type specific",
   :rdfs/range         :gen/ContentTypeSpecificResource,
   :rdfs/subPropertyOf :gen/sameWorkAs})

(def fixedResource
  "A relation between a generic resource and a fixedResource     which is an everything-specific version of it."
  {:rdf/about :gen/fixedResource,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A relation between a generic resource and a fixedResource\n    which is an everything-specific version of it.",
   :rdfs/domain :gen/InformationResource,
   :rdfs/label "Content-Type specific",
   :rdfs/range :gen/FixedResource,
   :rdfs/subPropertyOf
   [:gen/timeSpecific :gen/languageSpecific :gen/contentTypeSpecific]})

(def languageGeneric
  {:rdf/about          :gen/languageGeneric,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :gen/LanguageSpecificResource,
   :rdfs/label         "language generic",
   :rdfs/range         :gen/LanguageGenericResource,
   :rdfs/subPropertyOf :gen/sameWorkAs})

(def languageSpecific
  {:owl/inverseOf      :gen/languageGeneric,
   :rdf/about          :gen/languageSpecific,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :gen/LanguageGenericResource,
   :rdfs/label         "language specific",
   :rdfs/range         :gen/LanguageSpecificResource,
   :rdfs/subPropertyOf :gen/sameWorkAs})

(def sameWorkAs
  "The equivalence relation linking all versions of a work,             specific or generic along various axes."
  {:rdf/about :gen/sameWorkAs,
   :rdf/type [:owl/SymmetricProperty :rdf/Property],
   :rdfs/comment
   "The equivalence relation linking all versions of a work,\n            specific or generic along various axes.",
   :rdfs/domain :gen/InformationResource,
   :rdfs/label "same work as",
   :rdfs/range :gen/InformationResource})

(def timeGeneric
  "The related resource which for this time-sepcific resource             is the related time-generic resource.             A representation of the time-generic resource may be expected to be             the most recent time-specific resource at the time of             the representation."
  {:rdf/about :gen/timeGeneric,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The related resource which for this time-sepcific resource\n            is the related time-generic resource.\n            A representation of the time-generic resource may be expected to be\n            the most recent time-specific resource at the time of\n            the representation.",
   :rdfs/domain :gen/TimeSpecificResource,
   :rdfs/label "time generic",
   :rdfs/range :gen/TimeGenericResource,
   :rdfs/subPropertyOf :gen/sameWorkAs})

(def timeSpecific
  {:owl/inverseOf      :gen/timeGeneric,
   :rdf/about          :gen/timeSpecific,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :gen/TimeGenericResource,
   :rdfs/label         "version",
   :rdfs/range         :gen/TimeSpecificResource,
   :rdfs/subPropertyOf :gen/sameWorkAs})