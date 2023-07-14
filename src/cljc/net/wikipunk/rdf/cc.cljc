(ns net.wikipunk.rdf.cc
  {:dcat/downloadURL "https://creativecommons.org/schema.rdf",
   :rdf/ns-prefix-map {"cc"   "http://creativecommons.org/ns#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cc",
   :rdfa/uri "http://creativecommons.org/ns#",
   :rdfs/isDefinedBy
   {:rdfa/uri "http://www.w3.org/Submission/2008/SUBM-ccREL-20080501/"}})

(def Attribution
  "credit be given to\n\t\t    copyright holder and/or author"
  {:db/ident :cc/Attribution,
   :rdf/type [:cc/Requirement :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "credit be given to\n\t\t    copyright holder and/or author@en-US",
   :rdfs/label #xsd/langString "Attribution@en-US"})

(def CommercialUse
  "exercising rights for\n\t\t    commercial purposes"
  {:db/ident     :cc/CommercialUse,
   :rdf/type     [:cc/Prohibition :rdfs/Resource],
   :rdfs/comment #xsd/langString
                  "exercising rights for\n\t\t    commercial purposes@en-US",
   :rdfs/label   #xsd/langString "Commercial Use@en-US"})

(def Copyleft
  "derivative and\n\t\t    combined works must be licensed under specified\n\t\t    terms, similar to those on the original\n\t\t    work"
  {:db/ident :cc/Copyleft,
   :rdf/type [:cc/Requirement :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "derivative and\n\t\t    combined works must be licensed under specified\n\t\t    terms, similar to those on the original\n\t\t    work@en-US",
   :rdfs/label #xsd/langString "Copyleft@en-US"})

(def DerivativeWorks
  "distribution of\n\t\t    derivative works"
  {:db/ident     :cc/DerivativeWorks,
   :rdf/type     [:cc/Permission :rdfs/Resource],
   :rdfs/comment #xsd/langString
                  "distribution of\n\t\t    derivative works@en-US",
   :rdfs/label   #xsd/langString "Derivative Works@en-US"})

(def Distribution
  "distribution, public\n\t\t    display, and publicly performance"
  {:db/ident :cc/Distribution,
   :rdf/type [:cc/Permission :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "distribution, public\n\t\t    display, and publicly performance@en-US",
   :rdfs/label #xsd/langString "Distribution@en-US"})

(def HighIncomeNationUse
  "use in a\n\t\t    non-developing country"
  {:db/ident     :cc/HighIncomeNationUse,
   :rdf/type     [:cc/Prohibition :rdfs/Resource],
   :rdfs/comment #xsd/langString
                  "use in a\n\t\t    non-developing country@en-US",
   :rdfs/label   #xsd/langString "High Income Nation Use@en-US"})

(def Jurisdiction
  "the legal jurisdiction\n\t\t    of a license"
  {:db/ident        :cc/Jurisdiction,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/langString
                     "the legal jurisdiction\n\t\t    of a license@en-US",
   :rdfs/label      #xsd/langString "Jurisdiction@en-US",
   :rdfs/subClassOf :rdfs/Resource})

(def LesserCopyleft
  "derivative works must\n\t\t    be licensed under specified terms, with at least\n\t\t    the same conditions as the original work;\n\t\t    combinations with the work may be licensed under\n\t\t    different terms"
  {:db/ident :cc/LesserCopyleft,
   :rdf/type [:cc/Requirement :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "derivative works must\n\t\t    be licensed under specified terms, with at least\n\t\t    the same conditions as the original work;\n\t\t    combinations with the work may be licensed under\n\t\t    different terms@en-US",
   :rdfs/label #xsd/langString "Lesser Copyleft@en-US"})

(def License
  "a set of\n\t\t    requests/permissions to users of a Work, e.g. a\n\t\t    copyright license, the public domain, information\n\t\t    for distributors"
  {:db/ident :cc/License,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "a set of\n\t\t    requests/permissions to users of a Work, e.g. a\n\t\t    copyright license, the public domain, information\n\t\t    for distributors@en-US",
   :rdfs/label #xsd/langString "License@en-US",
   :rdfs/subClassOf [:rdfs/Resource :dcterms/LicenseDocument]})

(def Notice
  "copyright and license\n\t\t    notices be kept intact"
  {:db/ident     :cc/Notice,
   :rdf/type     [:cc/Requirement :rdfs/Resource],
   :rdfs/comment #xsd/langString
                  "copyright and license\n\t\t    notices be kept intact@en-US",
   :rdfs/label   #xsd/langString "Notice@en-US"})

(def Permission
  "an action that may or\n\t\t    may not be allowed or desired"
  {:db/ident :cc/Permission,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "an action that may or\n\t\t    may not be allowed or desired@en-US",
   :rdfs/label #xsd/langString "Permission@en-US",
   :rdfs/subClassOf :rdfs/Resource})

(def Prohibition
  "something you may be\n\t\t    asked not to do"
  {:db/ident        :cc/Prohibition,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/langString
                     "something you may be\n\t\t    asked not to do@en-US",
   :rdfs/label      #xsd/langString "Prohibition@en-US",
   :rdfs/subClassOf :rdfs/Resource})

(def Reproduction
  "making multiple\n\t\t    copies"
  {:db/ident     :cc/Reproduction,
   :rdf/type     [:cc/Permission :rdfs/Resource],
   :rdfs/comment #xsd/langString "making multiple\n\t\t    copies@en-US",
   :rdfs/label   #xsd/langString "Reproduction@en-US"})

(def Requirement
  "an action that may or\n\t\t    may not be requested of you"
  {:db/ident :cc/Requirement,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "an action that may or\n\t\t    may not be requested of you@en-US",
   :rdfs/label #xsd/langString "Requirement@en-US",
   :rdfs/subClassOf :rdfs/Resource})

(def ShareAlike
  "derivative works be\n\t\t    licensed under the same terms or compatible terms\n\t\t    as the original work"
  {:db/ident :cc/ShareAlike,
   :rdf/type [:cc/Requirement :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "derivative works be\n\t\t    licensed under the same terms or compatible terms\n\t\t    as the original work@en-US",
   :rdfs/label #xsd/langString "Share Alike@en-US"})

(def Sharing
  "permits commercial\n\t\t    derivatives, but only non-commercial\n\t\t    distribution"
  {:db/ident :cc/Sharing,
   :rdf/type [:cc/Permission :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "permits commercial\n\t\t    derivatives, but only non-commercial\n\t\t    distribution@en-US",
   :rdfs/label #xsd/langString "Sharing@en-US"})

(def SourceCode
  "source code (the\n\t\t    preferred form for making modifications) must be\n\t\t    provided when exercising some rights granted by\n\t\t    the license."
  {:db/ident :cc/SourceCode,
   :rdf/type [:cc/Requirement :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "source code (the\n\t\t    preferred form for making modifications) must be\n\t\t    provided when exercising some rights granted by\n\t\t    the license.@en-US",
   :rdfs/label #xsd/langString "Source Code@en-US"})

(def Work
  "a potentially\n\t\t    copyrightable work"
  {:db/ident        :cc/Work,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/langString
                     "a potentially\n\t\t    copyrightable work@en-US",
   :rdfs/label      #xsd/langString "Work@en-US",
   :rdfs/subClassOf :rdfs/Resource})

(def attributionName
  {:db/ident    :cc/attributionName,
   :rdf/type    :rdf/Property,
   :rdfs/domain :cc/Work,
   :rdfs/range  :rdfs/Literal})

(def attributionURL
  {:db/ident    :cc/attributionURL,
   :rdf/type    :rdf/Property,
   :rdfs/domain :cc/Work,
   :rdfs/range  :rdfs/Resource})

(def deprecatedOn
  "deprecated\n\t\t  on"
  {:db/ident    :cc/deprecatedOn,
   :rdf/type    :rdf/Property,
   :rdfs/domain :cc/License,
   :rdfs/label  #xsd/langString "deprecated\n\t\t  on@en-US",
   :rdfs/range  {:rdfa/uri "http://www.w3.org/2001/XMLSchema-datatypes#date"}})

(def jurisdiction
  "jurisdiction"
  {:db/ident    :cc/jurisdiction,
   :rdf/type    :rdf/Property,
   :rdfs/domain :cc/License,
   :rdfs/label  #xsd/langString "jurisdiction@en-US",
   :rdfs/range  :cc/Jurisdiction})

(def legalcode
  {:db/ident    :cc/legalcode,
   :rdf/type    :rdf/Property,
   :rdfs/domain :cc/License,
   :rdfs/range  :rdfs/Resource})

(def license
  "has\n\t\t  license"
  {:db/ident           :cc/license,
   :owl/sameAs         :xhv/license,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :cc/Work,
   :rdfs/label         #xsd/langString "has\n\t\t  license@en-US",
   :rdfs/range         :cc/License,
   :rdfs/subPropertyOf :dcterms/license})

(def morePermissions
  {:db/ident           :cc/morePermissions,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :cc/Work,
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :dcterms/relation})

(def permits
  "permits"
  {:db/ident    :cc/permits,
   :rdf/type    :rdf/Property,
   :rdfs/domain :cc/License,
   :rdfs/label  #xsd/langString "permits@en-US",
   :rdfs/range  :cc/Permission})

(def prohibits
  "prohibits"
  {:db/ident    :cc/prohibits,
   :rdf/type    :rdf/Property,
   :rdfs/domain :cc/License,
   :rdfs/label  #xsd/langString "prohibits@en-US",
   :rdfs/range  :cc/Prohibition})

(def requires
  "requires"
  {:db/ident    :cc/requires,
   :rdf/type    :rdf/Property,
   :rdfs/domain :cc/License,
   :rdfs/label  #xsd/langString "requires@en-US",
   :rdfs/range  :cc/Requirement})

(def useGuidelines
  {:db/ident           :cc/useGuidelines,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :cc/Work,
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :dcterms/relation})