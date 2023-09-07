(ns net.wikipunk.rdf.cc
  ^{:base       "http://creativecommons.org/ns#",
    :namespaces {"cc"   "http://creativecommons.org/ns#",
                 "owl"  "http://www.w3.org/2002/07/owl#",
                 "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
    :prefix     "cc",
    :source     "https://creativecommons.org/schema.rdf"}
  {:rdf/type :owl/Ontology})

(def Attribution
  {:db/ident     :cc/Attribution,
   :rdf/type     :cc/Requirement,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value
                  "credit be given to\n\t\t    copyright holder and/or author"},
   :rdfs/label   {:rdf/language "en-US",
                  :rdf/value    "Attribution"}})

(def CommercialUse
  {:db/ident     :cc/CommercialUse,
   :rdf/type     :cc/Prohibition,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value
                  "exercising rights for\n\t\t    commercial purposes"},
   :rdfs/label   {:rdf/language "en-US",
                  :rdf/value    "Commercial Use"}})

(def Copyleft
  {:db/ident :cc/Copyleft,
   :rdf/type :cc/Requirement,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "derivative and\n\t\t    combined works must be licensed under specified\n\t\t    terms, similar to those on the original\n\t\t    work"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "Copyleft"}})

(def DerivativeWorks
  {:db/ident     :cc/DerivativeWorks,
   :rdf/type     :cc/Permission,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value    "distribution of\n\t\t    derivative works"},
   :rdfs/label   {:rdf/language "en-US",
                  :rdf/value    "Derivative Works"}})

(def Distribution
  {:db/ident :cc/Distribution,
   :rdf/type :cc/Permission,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "distribution, public\n\t\t    display, and publicly performance"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "Distribution"}})

(def HighIncomeNationUse
  {:db/ident     :cc/HighIncomeNationUse,
   :rdf/type     :cc/Prohibition,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value    "use in a\n\t\t    non-developing country"},
   :rdfs/label   {:rdf/language "en-US",
                  :rdf/value    "High Income Nation Use"}})

(def Jurisdiction
  {:db/ident     :cc/Jurisdiction,
   :rdf/type     :rdfs/Class,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value    "the legal jurisdiction\n\t\t    of a license"},
   :rdfs/label   {:rdf/language "en-US",
                  :rdf/value    "Jurisdiction"}})

(def LesserCopyleft
  {:db/ident :cc/LesserCopyleft,
   :rdf/type :cc/Requirement,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "derivative works must\n\t\t    be licensed under specified terms, with at least\n\t\t    the same conditions as the original work;\n\t\t    combinations with the work may be licensed under\n\t\t    different terms"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "Lesser Copyleft"}})

(def License
  {:db/ident :cc/License,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "a set of\n\t\t    requests/permissions to users of a Work, e.g. a\n\t\t    copyright license, the public domain, information\n\t\t    for distributors"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "License"},
   :rdfs/subClassOf :dcterms/LicenseDocument})

(def Notice
  {:db/ident     :cc/Notice,
   :rdf/type     :cc/Requirement,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value
                  "copyright and license\n\t\t    notices be kept intact"},
   :rdfs/label   {:rdf/language "en-US",
                  :rdf/value    "Notice"}})

(def Permission
  {:db/ident :cc/Permission,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value "an action that may or\n\t\t    may not be allowed or desired"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "Permission"}})

(def Prohibition
  {:db/ident     :cc/Prohibition,
   :rdf/type     :rdfs/Class,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value "something you may be\n\t\t    asked not to do"},
   :rdfs/label   {:rdf/language "en-US",
                  :rdf/value    "Prohibition"}})

(def Reproduction
  {:db/ident     :cc/Reproduction,
   :rdf/type     :cc/Permission,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value    "making multiple\n\t\t    copies"},
   :rdfs/label   {:rdf/language "en-US",
                  :rdf/value    "Reproduction"}})

(def Requirement
  {:db/ident     :cc/Requirement,
   :rdf/type     :rdfs/Class,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value
                  "an action that may or\n\t\t    may not be requested of you"},
   :rdfs/label   {:rdf/language "en-US",
                  :rdf/value    "Requirement"}})

(def ShareAlike
  {:db/ident :cc/ShareAlike,
   :rdf/type :cc/Requirement,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "derivative works be\n\t\t    licensed under the same terms or compatible terms\n\t\t    as the original work"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "Share Alike"}})

(def Sharing
  {:db/ident :cc/Sharing,
   :rdf/type :cc/Permission,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "permits commercial\n\t\t    derivatives, but only non-commercial\n\t\t    distribution"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "Sharing"}})

(def SourceCode
  {:db/ident :cc/SourceCode,
   :rdf/type :cc/Requirement,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "source code (the\n\t\t    preferred form for making modifications) must be\n\t\t    provided when exercising some rights granted by\n\t\t    the license."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "Source Code"}})

(def Work
  {:db/ident     :cc/Work,
   :rdf/type     :rdfs/Class,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value    "a potentially\n\t\t    copyrightable work"},
   :rdfs/label   {:rdf/language "en-US",
                  :rdf/value    "Work"}})

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
  {:db/ident    :cc/deprecatedOn,
   :rdf/type    :rdf/Property,
   :rdfs/domain :cc/License,
   :rdfs/label  {:rdf/language "en-US",
                 :rdf/value    "deprecated\n\t\t  on"},
   :rdfs/range  {:xsd/anyURI
                 "http://www.w3.org/2001/XMLSchema-datatypes#date"}})

(def jurisdiction
  {:db/ident    :cc/jurisdiction,
   :rdf/type    :rdf/Property,
   :rdfs/domain :cc/License,
   :rdfs/label  {:rdf/language "en-US",
                 :rdf/value    "jurisdiction"},
   :rdfs/range  :cc/Jurisdiction})

(def legalcode
  {:db/ident    :cc/legalcode,
   :rdf/type    :rdf/Property,
   :rdfs/domain :cc/License,
   :rdfs/range  :rdfs/Resource})

(def license
  {:db/ident           :cc/license,
   :owl/sameAs         :xhv/license,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :cc/Work,
   :rdfs/label         {:rdf/language "en-US",
                        :rdf/value    "has\n\t\t  license"},
   :rdfs/range         :cc/License,
   :rdfs/subPropertyOf :dcterms/license})

(def morePermissions
  {:db/ident           :cc/morePermissions,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :cc/Work,
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :dcterms/relation})

(def permits
  {:db/ident    :cc/permits,
   :rdf/type    :rdf/Property,
   :rdfs/domain :cc/License,
   :rdfs/label  {:rdf/language "en-US",
                 :rdf/value    "permits"},
   :rdfs/range  :cc/Permission})

(def prohibits
  {:db/ident    :cc/prohibits,
   :rdf/type    :rdf/Property,
   :rdfs/domain :cc/License,
   :rdfs/label  {:rdf/language "en-US",
                 :rdf/value    "prohibits"},
   :rdfs/range  :cc/Prohibition})

(def requires
  {:db/ident    :cc/requires,
   :rdf/type    :rdf/Property,
   :rdfs/domain :cc/License,
   :rdfs/label  {:rdf/language "en-US",
                 :rdf/value    "requires"},
   :rdfs/range  :cc/Requirement})

(def useGuidelines
  {:db/ident           :cc/useGuidelines,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :cc/Work,
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :dcterms/relation})

(def urn:uuid:f440d123-0e89-52f4-b5dd-44c2fbc42450112329
  {:owl/equivalentProperty :cc/permits,
   :xsd/anyURI "http://web.resource.org/cc/permits"})

(def urn:uuid:da8307f2-fda1-5c88-b194-4afafbf616dd112330
  {:owl/equivalentClass :cc/Reproduction,
   :xsd/anyURI "http://web.resource.org/cc/Reproduction"})

(def urn:uuid:00c752e3-c40f-51fa-8e97-8559002073ef112331
  {:owl/equivalentClass :cc/Requirement,
   :xsd/anyURI "http://web.resource.org/cc/Requirement"})

(def urn:uuid:967cabf5-5b22-518a-a57e-81ef4e4991b5112332
  {:owl/equivalentClass :cc/SourceCode,
   :xsd/anyURI "http://web.resource.org/cc/SourceCode"})

(def urn:uuid:b7ffbe4b-f0ce-57f3-a5ee-277cb122a8d3112333
  {:owl/equivalentProperty :cc/prohibits,
   :xsd/anyURI "http://web.resource.org/cc/prohibits"})

(def urn:uuid:ad6f584f-2168-57ef-9bc5-a223516fa09c112334
  {:owl/equivalentClass :cc/Work,
   :xsd/anyURI "http://web.resource.org/cc/Work"})

(def urn:uuid:7123a465-47a8-5b40-b310-7ca6386d81af112335
  {:owl/equivalentProperty :cc/requires,
   :xsd/anyURI "http://web.resource.org/cc/requires"})

(def urn:uuid:c23d8c8c-2d32-5784-b1f5-bc3d349f970b112336
  {:owl/equivalentClass :cc/Attribution,
   :xsd/anyURI "http://web.resource.org/cc/Attribution"})

(def urn:uuid:65099f7f-7a24-5a9a-a0bb-bf3939d7968a112337
  {:owl/equivalentClass :cc/Permission,
   :xsd/anyURI "http://web.resource.org/cc/Permission"})

(def urn:uuid:42dc02fd-267e-555e-ad1a-7522cb5793c9112338
  {:owl/equivalentClass :cc/ShareAlike,
   :xsd/anyURI "http://web.resource.org/cc/ShareAlike"})

(def urn:uuid:869ae3d6-e8c7-56d1-bdc1-9ffb04964e8f112339
  {:owl/equivalentClass :cc/Prohibition,
   :xsd/anyURI "http://web.resource.org/cc/Prohibition"})

(def urn:uuid:10cdcd7e-2948-5f92-8d89-7e420076324f112340
  {:owl/equivalentClass :cc/License,
   :xsd/anyURI "http://web.resource.org/cc/License"})

(def urn:uuid:4de3d9c7-eb67-5dd7-b840-e0db9afcfe6b112341
  {:owl/equivalentClass :cc/Notice,
   :xsd/anyURI "http://web.resource.org/cc/Notice"})

(def urn:uuid:a87b1422-e4b0-5fe1-92ff-a221a971d398112342
  {:owl/equivalentProperty :cc/license,
   :xsd/anyURI "http://web.resource.org/cc/license"})

(def urn:uuid:50bab3e1-270c-50a6-beed-c6cc2cbe0781112343
  {:owl/equivalentClass :cc/CommercialUse,
   :xsd/anyURI "http://web.resource.org/cc/CommercialUse"})

(def urn:uuid:c52ca849-b9b6-5b4b-aea9-26b45283880a112344
  {:owl/equivalentClass :cc/DerivativeWorks,
   :xsd/anyURI "http://web.resource.org/cc/DerivativeWorks"})

(def urn:uuid:cdca4452-ea1c-578d-886a-adfa5eb96e2d112345
  {:owl/equivalentClass :cc/Distribution,
   :xsd/anyURI "http://web.resource.org/cc/Distribution"})