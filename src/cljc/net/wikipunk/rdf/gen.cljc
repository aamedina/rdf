(ns net.wikipunk.rdf.gen
  {:dcat/downloadURL  "resources/gen.rdf",
   :rdf/ns-prefix-map {"dc11" "http://purl.org/dc/elements/1.1/",
                       "doc"  "http://www.w3.org/2000/10/swap/pim/doc#",
                       "gen"  "http://www.w3.org/2000/01/rdf-schema#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "gen",
   :rdfa/uri          "http://www.w3.org/2006/gen/ont#"})

(def ContentTypeGenericResource
  "A resource which may have representations in\n    many different Content-Types."
  {:db/ident :gen/ContentTypeGenericResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A resource which may have representations in\n    many different Content-Types.",
   :rdfs/label #xsd/string "Content-Type-generic resource",
   :rdfs/subClassOf [:gen/InformationResource :rdfs/Resource]})

(def ContentTypeSpecificResource
  "A resource of which all representations are in the\n\t\tsame Internet media type, or 'Content-Type'."
  {:db/ident :gen/ContentTypeSpecificResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A resource of which all representations are in the\n\t\tsame Internet media type, or 'Content-Type'.",
   :rdfs/label #xsd/string "Content-Type-specific resource",
   :rdfs/subClassOf [:gen/InformationResource :rdfs/Resource]})

(def FixedResource
  "A resource whose representation type and content will not\n\t    change under any circumstances."
  {:db/ident :gen/FixedResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A resource whose representation type and content will not\n\t    change under any circumstances.",
   :rdfs/label #xsd/string "fixed resource",
   :rdfs/subClassOf [:rdfs/Resource
                     :gen/TimeSpecificResource
                     :gen/ContentTypeSpecificResource
                     :gen/LanguageSpecificResource
                     :gen/InformationResource]})

(def InformationResource
  "An Information Resource is defined by the Architecture of\n\t    the WWW."
  {:db/ident :gen/InformationResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "An Information Resource is defined by the Architecture of\n\t    the WWW.",
   :rdfs/label #xsd/string "information resource",
   :rdfs/subClassOf :rdfs/Resource})

(def LanguageGenericResource
  "A resource defiend without constraint as to\n\tthe particular natural language in which it\n        maight be expressed."
  {:db/ident :gen/LanguageGenericResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A resource defiend without constraint as to\n\tthe particular natural language in which it\n        maight be expressed.",
   :rdfs/label #xsd/string "language-generic resource",
   :rdfs/subClassOf [:gen/InformationResource :rdfs/Resource]})

(def LanguageSpecificResource
  "A resource of which all representations are in the\n\t\tsame natural language."
  {:db/ident :gen/LanguageSpecificResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A resource of which all representations are in the\n\t\tsame natural language.",
   :rdfs/label #xsd/string "language-specific resource",
   :rdfs/subClassOf [:gen/InformationResource :rdfs/Resource]})

(def TimeGenericResource
  "A Information Resource which may have many versions,\n    and therfore representations of the resource at different times may vary."
  {:db/ident :gen/TimeGenericResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A Information Resource which may have many versions,\n    and therfore representations of the resource at different times may vary.",
   :rdfs/label #xsd/string "Time-generic resource",
   :rdfs/subClassOf [:gen/InformationResource :rdfs/Resource]})

(def TimeSpecificResource
  "A resource of which all representations are in the\n\t\tsame version.  Representations of the resource will\n                not change as a result of th resource neing updated to a\n                version with time.  The dates of creation and\n                of last modification of such a resource would be\n                expected to be the same."
  {:db/ident :gen/TimeSpecificResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A resource of which all representations are in the\n\t\tsame version.  Representations of the resource will\n                not change as a result of th resource neing updated to a\n                version with time.  The dates of creation and\n                of last modification of such a resource would be\n                expected to be the same.",
   :rdfs/label #xsd/string "version",
   :rdfs/subClassOf [:gen/InformationResource :rdfs/Resource]})

(def contentTypeGeneric
  "Content-Type generic"
  {:db/ident           :gen/contentTypeGeneric,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :gen/ContentTypeSpecificResource,
   :rdfs/label         #xsd/string "Content-Type generic",
   :rdfs/range         :gen/ContentTypeGenericResource,
   :rdfs/subPropertyOf :gen/sameWorkAs})

(def contentTypeSpecific
  "Content-Type specific"
  {:db/ident           :gen/contentTypeSpecific,
   :owl/inverseOf      :gen/contentTypeGeneric,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :gen/ContentTypeGenericResource,
   :rdfs/label         #xsd/string "Content-Type specific",
   :rdfs/range         :gen/ContentTypeSpecificResource,
   :rdfs/subPropertyOf :gen/sameWorkAs})

(def fixedResource
  "A relation between a generic resource and a fixedResource\n    which is an everything-specific version of it."
  {:db/ident :gen/fixedResource,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "A relation between a generic resource and a fixedResource\n    which is an everything-specific version of it.",
   :rdfs/domain :gen/InformationResource,
   :rdfs/label #xsd/string "Content-Type specific",
   :rdfs/range :gen/FixedResource,
   :rdfs/subPropertyOf [:gen/timeSpecific
                        :gen/languageSpecific
                        :gen/contentTypeSpecific
                        :gen/sameWorkAs]})

(def languageGeneric
  "language generic"
  {:db/ident           :gen/languageGeneric,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :gen/LanguageSpecificResource,
   :rdfs/label         #xsd/string "language generic",
   :rdfs/range         :gen/LanguageGenericResource,
   :rdfs/subPropertyOf :gen/sameWorkAs})

(def languageSpecific
  "language specific"
  {:db/ident           :gen/languageSpecific,
   :owl/inverseOf      :gen/languageGeneric,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :gen/LanguageGenericResource,
   :rdfs/label         #xsd/string "language specific",
   :rdfs/range         :gen/LanguageSpecificResource,
   :rdfs/subPropertyOf :gen/sameWorkAs})

(def sameWorkAs
  "The equivalence relation linking all versions of a work,\n            specific or generic along various axes."
  {:db/ident :gen/sameWorkAs,
   :rdf/type [:owl/SymmetricProperty :rdf/Property],
   :rdfs/comment
   #xsd/string
    "The equivalence relation linking all versions of a work,\n            specific or generic along various axes.",
   :rdfs/domain :gen/InformationResource,
   :rdfs/label #xsd/string "same work as",
   :rdfs/range :gen/InformationResource})

(def timeGeneric
  "The related resource which for this time-sepcific resource\n            is the related time-generic resource.\n            A representation of the time-generic resource may be expected to be\n            the most recent time-specific resource at the time of\n            the representation."
  {:db/ident :gen/timeGeneric,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The related resource which for this time-sepcific resource\n            is the related time-generic resource.\n            A representation of the time-generic resource may be expected to be\n            the most recent time-specific resource at the time of\n            the representation.",
   :rdfs/domain :gen/TimeSpecificResource,
   :rdfs/label #xsd/string "time generic",
   :rdfs/range :gen/TimeGenericResource,
   :rdfs/subPropertyOf :gen/sameWorkAs})

(def timeSpecific
  "version"
  {:db/ident           :gen/timeSpecific,
   :owl/inverseOf      :gen/timeGeneric,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :gen/TimeGenericResource,
   :rdfs/label         #xsd/string "version",
   :rdfs/range         :gen/TimeSpecificResource,
   :rdfs/subPropertyOf :gen/sameWorkAs})