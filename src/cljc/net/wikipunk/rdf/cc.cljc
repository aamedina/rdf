(ns net.wikipunk.rdf.cc
  "http://web.resource.org/cc/permits"
  {:dcat/downloadURL "https://creativecommons.org/schema.rdf",
   :owl/equivalentProperty :cc/permits,
   :rdf/ns-prefix-map {"cc"   "http://creativecommons.org/ns#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cc",
   :rdfa/uri "http://web.resource.org/cc/permits",
   :rdfs/isDefinedBy
   {:rdf/uri "http://www.w3.org/Submission/2008/SUBM-ccREL-20080501/"}})

(def Attribution
  "credit be given to copyright holder and/or author"
  {:db/ident :cc/Attribution,
   :rdf/type [:cc/Requirement :rdfs/Resource],
   :rdfs/comment
   #voc/lstr "credit be given to\n\t\t    copyright holder and/or author@en-US",
   :rdfs/label #voc/lstr "Attribution@en-US"})

(def CommercialUse
  "exercising rights for commercial purposes"
  {:db/ident     :cc/CommercialUse,
   :rdf/type     [:cc/Prohibition :rdfs/Resource],
   :rdfs/comment #voc/lstr
                  "exercising rights for\n\t\t    commercial purposes@en-US",
   :rdfs/label   #voc/lstr "Commercial Use@en-US"})

(def Copyleft
  "derivative and combined works must be licensed under specified terms, similar to those on the original work"
  {:db/ident :cc/Copyleft,
   :rdf/type [:cc/Requirement :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "derivative and\n\t\t    combined works must be licensed under specified\n\t\t    terms, similar to those on the original\n\t\t    work@en-US",
   :rdfs/label #voc/lstr "Copyleft@en-US"})

(def DerivativeWorks
  "distribution of derivative works"
  {:db/ident     :cc/DerivativeWorks,
   :rdf/type     [:cc/Permission :rdfs/Resource],
   :rdfs/comment #voc/lstr "distribution of\n\t\t    derivative works@en-US",
   :rdfs/label   #voc/lstr "Derivative Works@en-US"})

(def Distribution
  "distribution, public display, and publicly performance"
  {:db/ident :cc/Distribution,
   :rdf/type [:cc/Permission :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "distribution, public\n\t\t    display, and publicly performance@en-US",
   :rdfs/label #voc/lstr "Distribution@en-US"})

(def HighIncomeNationUse
  "use in a non-developing country"
  {:db/ident     :cc/HighIncomeNationUse,
   :rdf/type     [:cc/Prohibition :rdfs/Resource],
   :rdfs/comment #voc/lstr "use in a\n\t\t    non-developing country@en-US",
   :rdfs/label   #voc/lstr "High Income Nation Use@en-US"})

(def Jurisdiction
  "the legal jurisdiction of a license"
  {:db/ident        :cc/Jurisdiction,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #voc/lstr
                     "the legal jurisdiction\n\t\t    of a license@en-US",
   :rdfs/label      #voc/lstr "Jurisdiction@en-US",
   :rdfs/subClassOf [:rdfs/Resource :cc/Jurisdiction]})

(def LesserCopyleft
  "derivative works must be licensed under specified terms, with at least the same conditions as the original work; combinations with the work may be licensed under different terms"
  {:db/ident :cc/LesserCopyleft,
   :rdf/type [:cc/Requirement :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "derivative works must\n\t\t    be licensed under specified terms, with at least\n\t\t    the same conditions as the original work;\n\t\t    combinations with the work may be licensed under\n\t\t    different terms@en-US",
   :rdfs/label #voc/lstr "Lesser Copyleft@en-US"})

(def License
  "a set of requests/permissions to users of a Work, e.g. a copyright license, the public domain, information for distributors"
  {:db/ident :cc/License,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "a set of\n\t\t    requests/permissions to users of a Work, e.g. a\n\t\t    copyright license, the public domain, information\n\t\t    for distributors@en-US",
   :rdfs/label #voc/lstr "License@en-US",
   :rdfs/subClassOf [:rdfs/Resource :dcterms/LicenseDocument :cc/License]})

(def Notice
  "copyright and license notices be kept intact"
  {:db/ident     :cc/Notice,
   :rdf/type     [:cc/Requirement :rdfs/Resource],
   :rdfs/comment #voc/lstr
                  "copyright and license\n\t\t    notices be kept intact@en-US",
   :rdfs/label   #voc/lstr "Notice@en-US"})

(def Permission
  "an action that may or may not be allowed or desired"
  {:db/ident :cc/Permission,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "an action that may or\n\t\t    may not be allowed or desired@en-US",
   :rdfs/label #voc/lstr "Permission@en-US",
   :rdfs/subClassOf [:rdfs/Resource :cc/Permission]})

(def Prohibition
  "something you may be asked not to do"
  {:db/ident        :cc/Prohibition,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #voc/lstr
                     "something you may be\n\t\t    asked not to do@en-US",
   :rdfs/label      #voc/lstr "Prohibition@en-US",
   :rdfs/subClassOf [:rdfs/Resource :cc/Prohibition]})

(def Reproduction
  "making multiple copies"
  {:db/ident     :cc/Reproduction,
   :rdf/type     [:cc/Permission :rdfs/Resource],
   :rdfs/comment #voc/lstr "making multiple\n\t\t    copies@en-US",
   :rdfs/label   #voc/lstr "Reproduction@en-US"})

(def Requirement
  "an action that may or may not be requested of you"
  {:db/ident :cc/Requirement,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr "an action that may or\n\t\t    may not be requested of you@en-US",
   :rdfs/label #voc/lstr "Requirement@en-US",
   :rdfs/subClassOf [:rdfs/Resource :cc/Requirement]})

(def ShareAlike
  "derivative works be licensed under the same terms or compatible terms as the original work"
  {:db/ident :cc/ShareAlike,
   :rdf/type [:cc/Requirement :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "derivative works be\n\t\t    licensed under the same terms or compatible terms\n\t\t    as the original work@en-US",
   :rdfs/label #voc/lstr "Share Alike@en-US"})

(def Sharing
  "permits commercial derivatives, but only non-commercial distribution"
  {:db/ident :cc/Sharing,
   :rdf/type [:cc/Permission :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "permits commercial\n\t\t    derivatives, but only non-commercial\n\t\t    distribution@en-US",
   :rdfs/label #voc/lstr "Sharing@en-US"})

(def SourceCode
  "source code (the preferred form for making modifications) must be provided when exercising some rights granted by the license."
  {:db/ident :cc/SourceCode,
   :rdf/type [:cc/Requirement :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "source code (the\n\t\t    preferred form for making modifications) must be\n\t\t    provided when exercising some rights granted by\n\t\t    the license.@en-US",
   :rdfs/label #voc/lstr "Source Code@en-US"})

(def Work
  "a potentially copyrightable work"
  {:db/ident        :cc/Work,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #voc/lstr "a potentially\n\t\t    copyrightable work@en-US",
   :rdfs/label      #voc/lstr "Work@en-US",
   :rdfs/subClassOf [:rdfs/Resource :cc/Work]})

(def attributionName
  {:db/ident           :cc/attributionName,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :cc/Work,
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :cc/attributionName})

(def attributionURL
  {:db/ident           :cc/attributionURL,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :cc/Work,
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :cc/attributionURL})

(def deprecatedOn
  "deprecated on"
  {:db/ident           :cc/deprecatedOn,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :cc/License,
   :rdfs/label         #voc/lstr "deprecated\n\t\t  on@en-US",
   :rdfs/range         "http://www.w3.org/2001/XMLSchema-datatypes#date",
   :rdfs/subPropertyOf :cc/deprecatedOn})

(def jurisdiction
  "jurisdiction"
  {:db/ident           :cc/jurisdiction,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :cc/License,
   :rdfs/label         #voc/lstr "jurisdiction@en-US",
   :rdfs/range         :cc/Jurisdiction,
   :rdfs/subPropertyOf :cc/jurisdiction})

(def legalcode
  {:db/ident           :cc/legalcode,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :cc/License,
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :cc/legalcode})

(def license
  "has license"
  {:db/ident           :cc/license,
   :owl/sameAs         :xhv/license,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :cc/Work,
   :rdfs/label         #voc/lstr "has\n\t\t  license@en-US",
   :rdfs/range         :cc/License,
   :rdfs/subPropertyOf [:dcterms/license :cc/license]})

(def morePermissions
  {:db/ident           :cc/morePermissions,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :cc/Work,
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf [:dcterms/relation :cc/morePermissions]})

(def permits
  "permits"
  {:db/ident           :cc/permits,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :cc/License,
   :rdfs/label         #voc/lstr "permits@en-US",
   :rdfs/range         :cc/Permission,
   :rdfs/subPropertyOf :cc/permits})

(def prohibits
  "prohibits"
  {:db/ident           :cc/prohibits,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :cc/License,
   :rdfs/label         #voc/lstr "prohibits@en-US",
   :rdfs/range         :cc/Prohibition,
   :rdfs/subPropertyOf :cc/prohibits})

(def requires
  "requires"
  {:db/ident           :cc/requires,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :cc/License,
   :rdfs/label         #voc/lstr "requires@en-US",
   :rdfs/range         :cc/Requirement,
   :rdfs/subPropertyOf :cc/requires})

(def useGuidelines
  {:db/ident           :cc/useGuidelines,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :cc/Work,
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf [:dcterms/relation :cc/useGuidelines]})