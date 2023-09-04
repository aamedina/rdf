(ns net.wikipunk.rdf.voag
  "Vocabulary Of Attribution and Governance"
  {:dc11/rights
   "The LinkedModel VOAG Ontology is issued under a Creative Commons Attribution Share Alike 3.0 United States License. Attribution should be made to <a href=\"http://www.topquadrant.com\">TopQuadrant, Inc.</a>.",
   :dc11/subject
   "Linked Models Vocabulary of Attribution and Governance (VOAG) Ontology",
   :dc11/title "Vocabulary Of Attribution and Governance",
   :dcat/downloadURL "net/wikipunk/ext/voag.ttl",
   :namespaces {"dc11"     "http://purl.org/dc/elements/1.1/",
                "dtype"    "http://www.linkedmodel.org/schema/dtype#",
                "omv"      "http://omv.ontoware.org/2005/05/ontology#",
                "ontology" "http://omv.ontoware.org/2005/05/ontology#",
                "owl"      "http://www.w3.org/2002/07/owl#",
                "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                "skos"     "http://www.w3.org/2004/02/skos/core#",
                "vaem"     "http://www.linkedmodel.org/schema/vaem#",
                "voag"     "http://voag.linkedmodel.org/schema/voag#",
                "voag-1.0" "http://voag.linkedmodel.org/1.0/schema/voag#",
                "void"     "http://rdfs.org/ns/void#",
                "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports #{{:xsd/anyURI "http://www.linkedmodel.org/1.2/schema/vaem"}
                  {:xsd/anyURI "http://rdfs.org/ns/void"}
                  {:xsd/anyURI "http://www.linkedmodel.org/1.0/schema/dtype"}},
   :owl/versionIRI {:xsd/anyURI
                    "http://www.linkedmodel.org/1.1/owl/schema/core"},
   :owl/versionInfo
   "$Id: OSG_voag-(v1.0).ttl 5095 2011-06-13 05:12:09Z RalphHodgson $",
   :rdf/type :owl/Ontology,
   :rdfa/prefix "voag",
   :rdfa/uri "http://voag.linkedmodel.org/schema/voag#",
   :rdfs/label "Vocabulary Of Attribution and Governance",
   :vaem/acronym "VOAG",
   :vaem/dateCreated #inst "2011-01-31T10:00:00.000-00:00",
   :vaem/description
   "VOAG stands for \"Vocabulary Of Attribution and Governance\". The ontology is intended to specify licensing, attribution, provenance and governance of an ontology. VOAG captures many common license types and their restrictions. Where a license requires attribution, VOAG provides resources that allow the attribution should be made. Provenance is defined in terms of source and pedigree. A miminal model of governance is provided based on how issues, releases and changes are managed. VOAG does not import, but makes uses of some concepts from VOID (http://vocab.deri.ie/void), notably void:Dataset.",
   :vaem/hasCatalogEntry {:xsd/anyURI "voag:VOAG_Catalog_Entry"},
   :vaem/lastUpdated
   "$LastChangedDate: 2011-06-12 22:12:09 -0700 (Sun, 12 Jun 2011) $",
   :vaem/namespace "http://voag.linkedmodel.org/schema/voag",
   :vaem/namespacePrefix "voag",
   :vaem/revisionNumber "1.0",
   :vaem/specificity #vaem/integer_1to5 "1",
   :vaem/url {:xsd/anyURI "http://voag.linkedmodel.org/1.0/owl/schema/voag"},
   :vaem/usesNonImportedResource #{:dc11/subject :dc11/title :dc11/rights},
   :voag/hasLicenseType :voag/CC-SHAREALIKE_3PT0-US,
   :voag/intent
   "Provides a basic vocabulary and schema for intellectual capital rights, attribution and governance. Includes some treatment of provenance.  Typical use of the ontology is to refer to its resources, as opposed to importing the ontology.",
   :xsd/anyURI "http://voag.linkedmodel.org/1.0/schema/voag"})

(def ACADEMIIC_FREE_LICENSE
  {:db/ident :voag/ACADEMIIC_FREE_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Academic Free License, all versions through 3.0",
   :vaem/acronym "AcademicFreeLicense",
   :vaem/description
   "The Academic Free License is a free software license, not copyleft, and incompatible with the GNU GPL. Recent versions contain contract clauses similar to the Open Software License, and should be avoided for the same reasons.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://opensource.org/licenses/academic.php"}})

(def ACDL_V1PT0
  {:db/ident :voag/ACDL_V1PT0,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Apple's Common Documentation License, Version 1.0",
   :vaem/acronym "ACDL",
   :vaem/description
   "This is a Free Documentation license that is incompatible with the GNU FDL. It is incompatible because Section (2c) says “You add no other terms or conditions to those of this License”, and the GNU FDL has additional terms not accounted for in the Common Documentation License.",
   :voag/url
   {:xsd/anyURI
    "http://fedoraproject.org/wiki/Licensing/Common_Documentation_License"}})

(def AGPL_V1PT0
  {:db/ident :voag/AGPL_V1PT0,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Affero General Public License version 1",
   :vaem/acronym "AGPLv1.0",
   :vaem/description
   "The Affero General Public License is a free software license, copyleft, and incompatible with the GNU GPL. It consists of the GNU GPL version 2, with one additional section that Affero added with FSF approval. The new section, 2(d), covers the distribution of application programs through web services or computer networks. This license has been succeeded by the GNU Affero General Public License version 3; please use that instead.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/supercededBy :voag/AGPL_V3PT0,
   :voag/url {:xsd/anyURI "http://www.affero.org/oagpl.html"}})

(def AGPL_V3PT0
  {:db/ident :voag/AGPL_V3PT0,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "GNU Affero General Public License (AGPL) version 3",
   :vaem/acronym "AGPLv3.0",
   :vaem/description
   "This is a free software, copyleft license. Its terms effectively consist of the terms of GPLv3, with an additional paragraph in section 13 to allow users who interact with the licensed software over a network to receive the source for that program. GNU AGPL v3.0 should be considered by Developers considering using the GNU AGPL for any software which will commonly be run over a network. Note that the GNU AGPL is not compatible with GPLv2. It is also technically not compatible with GPLv3 in a strict sense: you cannot take code released under the GNU AGPL and convey or modify it however you like under the terms of GPLv3, or vice versa. However, you are allowed to combine separate modules or source files released under both of those licenses in a single project, which will provide many programmers with all the permission they need to make the programs they want. ",
   :voag/incompatibleWith :voag/GNU-GPL_V2,
   :voag/supercedes :voag/AGPL_V1PT0,
   :voag/url {:xsd/anyURI "http://www.gnu.org/licenses/agpl.html"}})

(def APACHE_V1PT0
  {:db/ident :voag/APACHE_V1PT0,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Apache License, Version 1.0",
   :vaem/acronym "apache1",
   :vaem/description
   "This is a simple, permissive non-copyleft free software license with an advertising clause. This creates practical problems like those of the original BSD license, including incompatibility with the GNU GPL",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.apache.org/licenses/LICENSE-1.0"}})

(def APACHE_V1PT1
  {:db/ident :voag/APACHE_V1PT1,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Apache License, Version 1.1",
   :vaem/acronym "apache1.1",
   :vaem/description
   "This is a permissive non-copyleft free software license. It has a few requirements that render it incompatible with the GNU GPL, such as strong prohibitions on the use of Apache-related names.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/supercedes :voag/APACHE_V1PT0,
   :voag/url {:xsd/anyURI "http://www.apache.org/licenses/LICENSE-1.1"}})

(def APACHE_V2PT0
  {:db/ident     :voag/APACHE_V2PT0,
   :rdf/type     :voag/LicenseModel,
   :rdfs/label   "Apache License, Version 2.0",
   :vaem/acronym "apache2",
   :voag/url     {:xsd/anyURI "http://www.apache.org/licenses/LICENSE-2.0"}})

(def APSL_V1PT0
  {:db/ident :voag/APSL_V1PT0,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Apple's Common Documentation License, Version 1.0",
   :vaem/acronym "APSL",
   :vaem/description
   "This is a free software license, incompatible with the GNU GPL. We recommend that you not use this license for new software that you write, but it is ok to use and improve the software released under this license",
   :voag/url {:xsd/anyURI "http://www.opensource.apple.com/license/apsl/"}})

(def APSL_V1PTX
  {:db/ident :voag/APSL_V1PTX,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Apple Public Source License (APSL), version 1.x",
   :vaem/acronym "apsl1",
   :vaem/description
   "Versions 1.0, 1.1 and 1.2 are not free software licenses (follow the link for more explanation). Please don't use these licenses, and we urge you to avoid any software that has been released under them. Version 2.0 of the APSL is a free software license.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url
   {:xsd/anyURI
    "https://fedoraproject.org/wiki/Licensing/Apple_Public_Source_License_1.2"}})

(def APSL_V2
  {:db/ident     :voag/APSL_V2,
   :rdf/type     :voag/LicenseModel,
   :rdfs/label   "Apple Public Source License (APSL), version 2",
   :vaem/acronym "apsl2",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url     {:xsd/anyURI "http://www.opensource.apple.com/apsl"}})

(def ARPHIC_PUBLIC_LICENSE
  {:db/ident :voag/ARPHIC_PUBLIC_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Arphic Public License",
   :vaem/acronym "Arphic",
   :vaem/description
   "This is a copyleft free software license, incompatible with the GPL. Its normal use is for fonts, and in that use, the incompatibility does not cause a problem.",
   :voag/compatibleWith :voag/GNU-GPL,
   :voag/url {:xsd/anyURI
              "http://ftp.gnu.org/gnu/non-gnu/chinese-fonts-truetype/LICENSE"}})

(def ARTISTIC_LICENSE_2PT0
  {:db/ident :voag/ARTISTIC_LICENSE_2PT0,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Artistic License 2.0",
   :vaem/acronym "ArtisticLicense2",
   :vaem/description
   "This license is a free software license, compatible with the GPL thanks to the relicensing option in section 4(c)(ii).",
   :voag/url {:xsd/anyURI
              "http://www.perlfoundation.org/artistic_license_2_0"}})

(def Accredidation
  {:db/ident        :voag/Accredidation,
   :rdf/type        :owl/Class,
   :rdfs/label      "Accredidation",
   :rdfs/subClassOf :voag/Qualifier})

(def AdministrativeEvent
  {:db/ident         :voag/AdministrativeEvent,
   :rdf/type         :owl/Class,
   :rdfs/label       "Administrative Event",
   :rdfs/subClassOf  :voag/Event,
   :vaem/description "A \"Governance Event\".",
   :voag/shortDescription "A \"Governance Event\"."})

(def Annually
  {:db/ident    :voag/Annually,
   :dtype/value {:xsd/string "annual"},
   :rdf/type    :voag/ChangeFrequency,
   :rdfs/label  "Annually"})

(def AppendChange
  {:db/ident   :voag/AppendChange,
   :rdf/type   :voag/ChangeType,
   :rdfs/label "Append change"})

(def ApprovalEvent
  {:db/ident         :voag/ApprovalEvent,
   :owl/disjointWith :voag/RejectionEvent,
   :rdf/type         :owl/Class,
   :rdfs/label       "Approval Event",
   :rdfs/subClassOf  :voag/Event,
   :vaem/description "A \"Governance Event\"."})

(def ApprovalProcess
  {:db/ident         :voag/ApprovalProcess,
   :rdf/type         :owl/Class,
   :rdfs/label       "Approval Process",
   :rdfs/subClassOf  :voag/GovernanceProcess,
   :vaem/description "A \"Governance Process\"."})

(def ApprovedIssue
  {:db/ident    :voag/ApprovedIssue,
   :dtype/value {:xsd/string "approved"},
   :rdf/type    :voag/IssueStatus,
   :rdfs/label  "Approved Issue"})

(def AssignedRole
  {:db/ident         :voag/AssignedRole,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://voag.linkedmodel.org/schema/voag"},
   :rdfs/label       "Assigned role",
   :rdfs/subClassOf  :owl/Thing})

(def Attribution
  {:db/ident :voag/Attribution,
   :rdf/type :owl/Class,
   :rdfs/label "Attributed Source",
   :rdfs/subClassOf #{{:owl/cardinality 1,
                       :owl/onProperty  :vaem/name,
                       :rdf/type        :owl/Restriction}
                      {:owl/allValuesFrom :voag/AttributionLogo,
                       :owl/onProperty    :voag/hasLogo,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/hasLogo,
                       :rdf/type           :owl/Restriction} :voag/Qualifier
                      {:owl/allValuesFrom :xsd/string,
                       :owl/onProperty    :voag/pointOfContact,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/url,
                       :rdf/type           :owl/Restriction}},
   :vaem/definition
   "An 'Attribution' specifies how credit should be given when citing the creators of a piece of work. Attribution must use the specified attribution text and optionally use logos that are provided in the attribution details below., with the names of points of contact.",
   :voag/shortDescription "The name, url and other details of an attribution."})

(def AttributionLogo
  {:db/ident        :voag/AttributionLogo,
   :rdf/type        :owl/Class,
   :rdfs/label      "Attribution logo",
   :rdfs/subClassOf :voag/Logo})

(def BERKELEY_DATABASE_LICENSE
  {:db/ident :voag/BERKELEY_DATABASE_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Berkeley Database License",
   :vaem/acronym "BerkleyDB",
   :vaem/description
   "This is a free software license, compatible with the GNU GPL. It is also known as the \"Sleepycat Software Product License\".",
   :voag/url
   {:xsd/anyURI
    "http://www.oracle.com/technology/software/products/berkeley-db/htdocs/oslicense.html"}})

(def BITTORRENT_LICENSE
  {:db/ident :voag/BITTORRENT_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "BitTorrent Open Source License",
   :vaem/acronym "bittorrent",
   :vaem/description
   "This is a free software license, but incompatible with the GPL, for the same reasons as the Jabber Open Source License.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI
              "http://www.bittorrent.com/bittorrent-open-source-license"}})

(def BOOST_LICENSE
  {:db/ident :voag/BOOST_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Boost Software License",
   :vaem/acronym "boost",
   :vaem/description
   "This is a simple, permissive non-copyleft free software license, compatible with the GNU GPL.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.boost.org/LICENSE_1_0.txt"}})

(def BSD_ORIGINAL_LICENSE
  {:db/ident :voag/BSD_ORIGINAL_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Original BSD license",
   :vaem/acronym "OriginalBSD",
   :vaem/description
   "This is a simple, permissive non-copyleft free software license with a serious flaw: the “obnoxious BSD advertising clause”. The flaw is not fatal; that is, it does not render the software non-free. But it does cause practical problems, including incompatibility with the GNU GPL. If you want to use a simple, permissive non-copyleft free software license, it is much better to use the modified BSD license or the X11 license. However, there is no reason not to use programs that have been released under the original BSD license.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.xfree86.org/3.3.6/COPYRIGHT2.html#6"}})

(def BiMonthly
  {:db/ident    :voag/BiMonthly,
   :dtype/value {:xsd/string "bi-monthly"},
   :rdf/type    :voag/ChangeFrequency,
   :rdfs/label  "Bi monthly"})

(def BiQuarterly
  {:db/ident    :voag/BiQuarterly,
   :dtype/value {:xsd/string "bi-quarterly"},
   :rdf/type    :voag/ChangeFrequency,
   :rdfs/label  "Bi quarterly"})

(def BiWeekly
  {:db/ident    :voag/BiWeekly,
   :dtype/value {:xsd/string "bi-weekly"},
   :rdf/type    :voag/ChangeFrequency,
   :rdfs/label  "Bi-Weekly"})

(def CC-SHAREALIKE_3PT0-US
  {:db/ident :voag/CC-SHAREALIKE_3PT0-US,
   :rdf/type :voag/LicenseModel,
   :rdfs/label
   "Creative Commons Attribution-Share Alike 3.0 United States License",
   :voag/image {:xsd/anyURI
                "http://i.creativecommons.org/l/by-sa/3.0/us/88x31.png"},
   :voag/permits #{:voag/CCP_DerivativeWorks :voag/CCP_Distribution},
   :voag/requires #{:voag/Attribution :voag/CCR_ShareAlike},
   :voag/url {:xsd/anyURI "http://creativecommons.org/licenses/by-sa/3.0/us/"}})

(def CC0
  {:db/ident :voag/CC0,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "CC0",
   :vaem/acronym "CC0",
   :vaem/description
   "CC0 is a public domain dedication from Creative Commons. A work released under CC0 is dedicated to the public domain to the fullest extent permitted by law. If that is not possible for any reason, CC0 also provides a simple permissive license as a fallback. Both public domain works and the simple license provided by CC0 are compatible with the GNU GPL. If you want to release your work to the public domain, use CC0.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI
              "http://creativecommons.org/publicdomain/zero/1.0/legalcode"}})

(def CCBY-ND
  {:db/ident :voag/CCBY-ND,
   :rdf/type :voag/LicenseModel,
   :rdfs/label
   "Creative Commons Attribution-NoDerivs 3.0 license (a.k.a. CC BY-ND)",
   :vaem/acronym "ccbynd",
   :vaem/description
   "This is the license used throughout the FSF web site. This license provides much the same permissions as our verbatim copying license, but it's much more detailed. We particularly recommend it for audio and/or video works of opinion. Please be specific about which Creative Commons license is being used.",
   :voag/url {:xsd/anyURI
              "http://creativecommons.org/licenses/by-nd/3.0/legalcode"}})

(def CCBY-SA
  {:db/ident     :voag/CCBY-SA,
   :rdf/type     :voag/LicenseModel,
   :rdfs/label   "Creative Commons Attribution-Sharealike 2.0 license",
   :vaem/acronym "ccbysa",
   :voag/url     {:xsd/anyURI
                  "http://creativecommons.org/licenses/by-sa/2.0/legalcode"}})

(def CCBY_LICENSE
  {:db/ident     :voag/CCBY_LICENSE,
   :rdf/type     :voag/LicenseModel,
   :rdfs/label   "Creative Commons Attribution 2.0 license",
   :vaem/acronym "ccby",
   :voag/url     {:xsd/anyURI
                  "http://creativecommons.org/licenses/by/2.0/legalcode"}})

(def CCPH_CommercialUse
  {:db/ident         :voag/CCPH_CommercialUse,
   :rdf/type         :voag/CreativeCommonsProhibition,
   :rdfs/label       #{"Commercial use"
                       {:rdf/language "en-US",
                        :rdf/value    "Creative Commons Commercial Use"}},
   :vaem/description {:rdf/language "en-US",
                      :rdf/value "Exercising rights for commercial purposes"},
   :voag/shortDescription {:rdf/language "en-US",
                           :rdf/value
                           "Exercising rights for commercial purposes"}})

(def CCPH_HighIncomeNationUse
  {:db/ident         :voag/CCPH_HighIncomeNationUse,
   :rdf/type         :voag/CreativeCommonsProhibition,
   :rdfs/label       #{{:rdf/language "en-US",
                        :rdf/value    "Creative Commons High Income Nation Use"}
                       "High income nation use"},
   :vaem/description {:rdf/language "en-US",
                      :rdf/value    "Use in a non-developing country"},
   :voag/shortDescription {:rdf/language "en-US",
                           :rdf/value    "Use in a non-developing country"}})

(def CCP_DerivativeWorks
  {:db/ident         :voag/CCP_DerivativeWorks,
   :rdf/type         :voag/CreativeCommonsPermission,
   :rdfs/label       #{"Derivative works"
                       {:rdf/language "en-US",
                        :rdf/value    "Creative Commons Derivative Works"}},
   :vaem/description {:rdf/language "en-US",
                      :rdf/value    "Distribution of derivative works"},
   :voag/shortDescription {:rdf/language "en-US",
                           :rdf/value    "Distribution of derivative works"}})

(def CCP_Distribution
  {:db/ident :voag/CCP_Distribution,
   :rdf/type :voag/CreativeCommonsPermission,
   :rdfs/label #{"Distribution"
                 {:rdf/language "en-US",
                  :rdf/value    "Creative Commons Distribution"}},
   :vaem/description
   {:rdf/language "en-US",
    :rdf/value
    "Creative Commons - distribution, public display, and publicly performance"},
   :voag/shortDescription
   {:rdf/language "en-US",
    :rdf/value
    "Creative Commons - distribution, public display, and publicly performance"}})

(def CCP_Reproduction
  {:db/ident         :voag/CCP_Reproduction,
   :rdf/type         :voag/CreativeCommonsPermission,
   :rdfs/label       #{"Reproduction"
                       {:rdf/language "en-US",
                        :rdf/value    "Creative Commons Reproduction"}},
   :vaem/description {:rdf/language "en-US",
                      :rdf/value    "making multiple copies"},
   :voag/shortDescription {:rdf/language "en-US",
                           :rdf/value    "making multiple copies"}})

(def CCP_Sharing
  {:db/ident :voag/CCP_Sharing,
   :rdf/type :voag/CreativeCommonsPermission,
   :rdfs/label #{"Sharing"
                 {:rdf/language "en-US",
                  :rdf/value    "Creative Commons Sharing"}},
   :vaem/description
   {:rdf/language "en-US",
    :rdf/value
    "permits commercial derivatives, but only non-commercial distribution"},
   :voag/shortDescription
   {:rdf/language "en-US",
    :rdf/value
    "permits commercial derivatives, but only non-commercial distribution"}})

(def CCR_Attribution
  {:db/ident         :voag/CCR_Attribution,
   :rdf/type         :voag/CreativeCommonsRequirement,
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "Creative Commons Attribution"},
   :vaem/description {:rdf/language "en-US",
                      :rdf/value
                      "Credit to be given to copyright holder and/or author"}})

(def CCR_Copyleft
  {:db/ident :voag/CCR_Copyleft,
   :rdf/type :voag/CreativeCommonsRequirement,
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "Creative Commons Copyleft"},
   :vaem/description
   #{{:rdf/language "en-US",
      :rdf/value
      "combined works must be licensed under specified terms, similar to those on the original work"}
     "Copyleft is a general method for making a program (or other work) free, and requiring all modified and extended versions of the program to be free as well. The simplest way to make a program free software is to put it in the public domain, uncopyrighted. This allows people to share the program and their improvements, if they are so minded. But it also allows uncooperative people to convert the program into proprietary software. They can make changes, many or few, and distribute the result as a proprietary product. People who receive the program in that modified form do not have the freedom that the original author gave them; the middleman has stripped it away.  In the GNU project, Copyleft says that anyone who redistributes the software, with or without changes, must pass along the freedom to further copy and change it. Copyleft guarantees that every user has freedom."},
   :vaem/url {:xsd/anyURI "http://www.gnu.org/copyleft/copyleft.html"}})

(def CCR_LesserCopyleft
  {:db/ident :voag/CCR_LesserCopyleft,
   :rdf/type :voag/CreativeCommonsRequirement,
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "Creative Commons Lesser Copyleft"},
   :vaem/description
   {:rdf/language "en-US",
    :rdf/value
    "derivative works must be licensed under specified terms, with at least the same conditions as the original work; combinations with the work may be licensed under different terms"}})

(def CCR_Notice
  {:db/ident         :voag/CCR_Notice,
   :rdf/type         :voag/CreativeCommonsRequirement,
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "Creative Commons Notice"},
   :vaem/description {:rdf/language "en-US",
                      :rdf/value
                      "copyright and license notices be kept intact"}})

(def CCR_ShareAlike
  {:db/ident :voag/CCR_ShareAlike,
   :rdf/type :voag/CreativeCommonsRequirement,
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "Creative Commons Share Alike"},
   :vaem/description
   {:rdf/language "en-US",
    :rdf/value
    "derivative works be licensed under the same terms or compatible terms as the original work"}})

(def CCR_SourceCode
  {:db/ident :voag/CCR_SourceCode,
   :rdf/type :voag/CreativeCommonsRequirement,
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "Creative Commons Source Code"},
   :vaem/description
   {:rdf/language "en-US",
    :rdf/value
    "Source code (the preferred form for making modifications) must be provided when exercising some rights granted by the license."}})

(def CDDL_V1PT0
  {:db/ident :voag/CDDL_V1PT0,
   :rdf/type :voag/LicenseModel,
   :rdfs/label
   "Common Development and Distribution License (CDDL), version 1.0",
   :vaem/acronym "CDDL",
   :vaem/description
   "This is a free software license. It has a copyleft with a scope that's similar to the one in the Mozilla Public License, which makes it incompatible with the GNU GPL. This means a module covered by the GPL and a module covered by the CDDL cannot legally be linked together.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI
              "http://www.opensolaris.org/os/licensing/cddllicense.txt"}})

(def CECILL_V2
  {:db/ident :voag/CECILL_V2,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "CeCILL version 2",
   :vaem/acronym "CeCILL",
   :vaem/description
   "The CeCILL is a free software license, explicitly compatible with the GNU GPL. The text of the CeCILL uses a couple of biased terms that ought to be avoided: “intellectual property” (see this article) and “protection” (see this article); this decision was unfortunate, because reading the license tends to spread the presuppositions of those terms. However, this does not cause any particular problem for the programs released under the CeCILL. Section 9.4 of the CeCILL commits the program's developers to certain forms of cooperation with the users, if someone attacks the program with a patent. You might look at that as a problem for the developer; however, if you are sure you would want to cooperate with the users in those ways anyway, then it isn't a problem for you.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.cecill.info/licences.en.html"}})

(def CLEAR_BSD
  {:db/ident :voag/CLEAR_BSD,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "The Clear BSD License",
   :vaem/acronym "clearbsd",
   :vaem/description
   "This is a free software license, compatible with both GPLv2 and GPLv3. It is based on the modified BSD license, and adds a term expressly stating it does not grant you any patent licenses. Because of this, we encourage you to be careful about using software under this license; you should first consider whether the licensor might want to sue you for patent infringement. If the developer is disclaiming patent licenses to set up a trap for you, it would be wise to avoid the program.",
   :voag/compatibleWith #{:voag/GNU-GPL_V3 :voag/GNU-GPL_V2},
   :voag/url {:xsd/anyURI
              "http://labs.metacarta.com/license-explanation.html#license"}})

(def CL_None
  {:db/ident    :voag/CL_None,
   :dtype/code  0,
   :dtype/order 1,
   :dtype/value {:xsd/string "none"},
   :rdf/type    :voag/ConfidentialityLevel,
   :rdfs/label  "None"})

(def CL_Restricted
  {:db/ident :voag/CL_Restricted,
   :dtype/code 1,
   :dtype/order 2,
   :dtype/value {:xsd/string "restricted"},
   :rdf/type :voag/ConfidentialityLevel,
   :rdfs/label "Restricted",
   :vaem/description
   "During and before World War II, the U.S. had a category of classified information called restricted, which was below confidential. The U.S. no longer has a restricted classification, but many other nations and NATO do. The U.S. treats \"restricted\" information it receives from other governments as confidential. The U.S. does use the term restricted data in a completely different way to refer to nuclear secrets.",
   :voag/shortDescription
   "During and before World War II, the U.S. had a category of classified information called restricted, which was below confidential. The U.S. no longer has a restricted classification, but many other nations and NATO do. The U.S. treats \"restricted\" information it receives from other governments as confidential. The U.S. does use the term restricted data in a completely different way to refer to nuclear secrets."})

(def CL_Secret
  {:db/ident :voag/CL_Secret,
   :dtype/code 5,
   :dtype/order 6,
   :dtype/value {:xsd/string "secret"},
   :rdf/type :voag/ConfidentialityLevel,
   :rdfs/label "Secret",
   :vaem/description
   "\"Secret\" shall be applied to information, the unauthorized disclosure of which reasonably could be expected to cause serious damage to the national security that the original classification authority is able to identify or describe [US Executive Order 12958].",
   :voag/shortDescription
   "\"Secret\" shall be applied to information, the unauthorized disclosure of which reasonably could be expected to cause serious damage to the national security that the original classification authority is able to identify or describe [US Executive Order 12958]."})

(def CL_SensitiveButUnclassified
  {:db/ident :voag/CL_SensitiveButUnclassified,
   :dtype/code 3,
   :dtype/order 4,
   :dtype/value {:xsd/string "sbu"},
   :rdf/type :voag/ConfidentialityLevel,
   :rdfs/label "Sensitive but Unclassified",
   :vaem/description
   "Sensitive but Unclassified (SBU) information should not be disclosed but is not national security information and cannot be classified according to Executive Order (EO)12958, as amended. These materials must be: properly marked, locked up when not under the supervision of an authorized person, and encrypted while in transit over a non-secure network. Some examples are: trade secrets, proprietary information, financial information, personnel and medical records, procurement-sensitive information, IT system security plans, contingency plans, audit logs (recordings of exceptions and other security-related events), vulnerability reports, incident reports and Personally Identifiable Information (PII).",
   :voag/shortDescription
   "Sensitive but Unclassified (SBU) information should not be disclosed but is not national security information and cannot be classified according to Executive Order (EO)12958, as amended. These materials must be: properly marked, locked up when not under the supervision of an authorized person, and encrypted while in transit over a non-secure network. Some examples are: trade secrets, proprietary information, financial information, personnel and medical records, procurement-sensitive information, IT system security plans, contingency plans, audit logs (recordings of exceptions and other security-related events), vulnerability reports, incident reports and Personally Identifiable Information (PII)."})

(def CL_TopSecret
  {:db/ident :voag/CL_TopSecret,
   :dtype/code 6,
   :dtype/order 7,
   :dtype/value {:xsd/string "topsecret"},
   :rdf/type :voag/ConfidentialityLevel,
   :rdfs/label "Top secret",
   :vaem/description
   "\"Top Secret\" shall be applied to information, the unauthorized disclosure of which reasonably could be expected to cause exceptionally grave damage to the national security that the original classification authority is able to identify or describe [US Executive Order 12958].",
   :voag/shortDescription
   "\"Top Secret\" shall be applied to information, the unauthorized disclosure of which reasonably could be expected to cause exceptionally grave damage to the national security that the original classification authority is able to identify or describe [US Executive Order 12958]."})

(def CL_Unclassified
  {:db/ident :voag/CL_Unclassified,
   :dtype/code 2,
   :dtype/order 3,
   :dtype/value {:xsd/string "unclassified"},
   :rdf/type :voag/ConfidentialityLevel,
   :rdfs/label "Unclassified",
   :vaem/description
   "Unclassified is not technically a \"classification\"; this is the default, and refers to information that can be released to individuals without a clearance (Level 0). Information that is unclassified is sometimes restricted in its dissemination as SBU or FOUO. For example, the \"law enforcement bulletins\" often reported by the U.S. media when United States Department of Homeland Security raises the U.S. terror threat level are usually classified as \"U//LES\" or \"Unclassified - Law Enforcement Sensitive.\" This information is only supposed to be released to Law Enforcement groups (Sheriff, Police, etc.) Because the information is unclassified, however, it is sometimes released to the public as well. Information which is unclassified, but which the government does not believe should be subject to Freedom of Information Act requests is often classified as U//FOUO - \"Unclassified - For Official Use Only\". In addition to FOUO information, information can be categorized according to its availability to be distributed (Distribution D may only be released to approved Department of Defense and Government Contractor personnel). Also, the statement of NOFORN (meaning No Foreign Nationals) is applied to any information which may not be released to any non-US Citizen. NOFORN and Distribution statements are often used in conjunction with classified information or alone on SBU information. Documents subject to export controls have a specific warning to that effect.",
   :voag/shortDescription
   "Unclassified is not technically a \"classification\"; this is the default, and refers to information that can be released to individuals without a clearance (Level 0). Information that is unclassified is sometimes restricted in its dissemination as SBU or FOUO. For example, the \"law enforcement bulletins\" often reported by the U.S. media when United States Department of Homeland Security raises the U.S. terror threat level are usually classified as \"U//LES\" or \"Unclassified - Law Enforcement Sensitive.\" This information is only supposed to be released to Law Enforcement groups (Sheriff, Police, etc.) Because the information is unclassified, however, it is sometimes released to the public as well. Information which is unclassified, but which the government does not believe should be subject to Freedom of Information Act requests is often classified as U//FOUO - \"Unclassified - For Official Use Only\". In addition to FOUO information, information can be categorized according to its availability to be distributed (Distribution D may only be released to approved Department of Defense and Government Contractor personnel). Also, the statement of NOFORN (meaning No Foreign Nationals) is applied to any information which may not be released to any non-US Citizen. NOFORN and Distribution statements are often used in conjunction with classified information or alone on SBU information. Documents subject to export controls have a specific warning to that effect."})

(def COMMON_PUBLIC_LICENSE_V1PT0
  {:db/ident :voag/COMMON_PUBLIC_LICENSE_V1PT0,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Common Public License Version 1.0",
   :vaem/acronym "CommonPublicLicense10",
   :vaem/description
   "This is a free software license. Unfortunately, its weak copyleft and choice of law clause make it incompatible with the GNU GPL.",
   :voag/incompatibleWith #{:voag/GNU-GPL_V3 :voag/GNU-GPL_V2},
   :voag/url {:xsd/anyURI "http://www.eclipse.org/legal/cpl-v10.html"}})

(def CONDOR_PUBLIC_LICENSE
  {:db/ident :voag/CONDOR_PUBLIC_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Condor Public License",
   :vaem/acronym "Condor",
   :vaem/description
   "Recent versions of Condor (from 6.9.5 on) are released under the Apache License 2.0. Only older versions of Condor use this license. The Condor Public License is a free software license. It has a couple of requirements that make it incompatible with the GNU GPL, including strong restrictions on the use of Condor-related names, and a condition that you must comply with United States export laws.",
   :voag/incompatibleWith #{:voag/GNU-GPL_V3 :voag/GNU-GPL_V2},
   :voag/url
   {:xsd/anyURI
    "http://www.cs.wisc.edu/condor/condor-public-license.html#condor"}})

(def CPAL
  {:db/ident :voag/CPAL,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Common Public Attribution License 1.0 (CPAL)",
   :vaem/acronym "CPAL",
   :vaem/description
   "This is a free software license. It is based on the Mozilla Public License, and is incompatible with the GPL for the same reasons: it has several requirements for modified versions that do not exist in the GPL. It also requires you to publish the source of the program if you allow others to use it.",
   :voag/url {:xsd/anyURI "http://opensource.org/licenses/cpal_1.0"}})

(def CRYPTIX_GENERAL_LICENSE
  {:db/ident :voag/CRYPTIX_GENERAL_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Cryptix General License",
   :rdfs/seeAlso :voag/X11_LICENSE,
   :vaem/acronym "CryptixGeneralLicense",
   :vaem/description
   "This is a simple, permissive non-copyleft free software license, compatible with the GNU GPL. It is very similar to the X11 license.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.cryptix.org/LICENSE.TXT"}})

(def Catalog
  {:db/ident        :voag/Catalog,
   :rdf/type        :owl/Class,
   :rdfs/label      "Catalog",
   :rdfs/subClassOf #{:voag/GovernedObject
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/hasLogo,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :voag/GovernedObject,
                       :owl/onProperty    :voag/hasCatalogEntry,
                       :rdf/type          :owl/Restriction}},
   :vaem/definition "An index to a set of resources "})

(def ChangeFrequency
  {:db/ident        :voag/ChangeFrequency,
   :owl/oneOf       [:voag/Never
                     :voag/Daily
                     :voag/Weekly
                     :voag/BiWeekly
                     :voag/Monthly
                     :voag/BiMonthly
                     :voag/Quarterly
                     :voag/BiQuarterly
                     :voag/Annually
                     :voag/UncertainFrequency],
   :rdf/type        :owl/Class,
   :rdfs/label      "Change frequency",
   :rdfs/subClassOf :voag/EnumeratedValue})

(def ChangeManagementProcess
  {:db/ident         :voag/ChangeManagementProcess,
   :rdf/type         :owl/Class,
   :rdfs/label       "Change Management Process",
   :rdfs/subClassOf  :voag/GovernanceProcess,
   :vaem/description "A \"Governance Process\".",
   :voag/shortDescription "A \"Governance Process\"."})

(def ChangeType
  {:db/ident :voag/ChangeType,
   :rdf/type :owl/Class,
   :rdfs/label "Change type",
   :rdfs/subClassOf :voag/EnumeratedValue,
   :vaem/description
   "Change Type provides an indicator for how an artifact has or will change in the future. This indicator is important to understanding the stability of an ontology."})

(def ClosedIssue
  {:db/ident    :voag/ClosedIssue,
   :dtype/value {:xsd/string "closed"},
   :rdf/type    :voag/IssueStatus,
   :rdfs/label  "Closed"})

(def ConcurrenceEvent
  {:db/ident         :voag/ConcurrenceEvent,
   :owl/disjointWith :voag/NonConcurrenceEvent,
   :rdf/type         :owl/Class,
   :rdfs/label       "Concurrence event",
   :rdfs/subClassOf  :voag/Event,
   :vaem/description "A Governance Event.",
   :voag/shortDescription "A Governance Event."})

(def ConfidentialityLevel
  {:db/ident :voag/ConfidentialityLevel,
   :rdf/type :owl/Class,
   :rdfs/label "Confidentiality level",
   :rdfs/subClassOf :voag/EnumeratedValue,
   :vaem/description
   "An enumerated codelist for values thath pertain to the security of a set of resources, or a resource. In 'lmc' an ontology can carry a property to denote its confidentiality."})

(def CreativeCommonsJurisdiction
  {:db/ident         :voag/CreativeCommonsJurisdiction,
   :rdf/type         :owl/Class,
   :rdfs/label       #{{:rdf/language "en-US",
                        :rdf/value    "Creative Commons Jurisdiction"}
                       "Creative commons jurisdiction"},
   :rdfs/subClassOf  :owl/Thing,
   :vaem/description {:rdf/language "en-US",
                      :rdf/value    "the legal jurisdiction of a license"},
   :voag/shortDescription {:rdf/language "en-US",
                           :rdf/value "the legal jurisdiction of a license"}})

(def CreativeCommonsPermission
  {:db/ident         :voag/CreativeCommonsPermission,
   :rdf/type         :owl/Class,
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "Creative Commons Permission"},
   :rdfs/subClassOf  :voag/EnumeratedValue,
   :vaem/description {:rdf/language "en-US",
                      :rdf/value
                      "An action that may or may not be allowed or desired"},
   :voag/shortDescription
   {:rdf/language "en-US",
    :rdf/value    "An action that may or may not be allowed or desired"}})

(def CreativeCommonsProhibition
  {:db/ident         :voag/CreativeCommonsProhibition,
   :rdf/type         :owl/Class,
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "Creative Commons Prohibition"},
   :rdfs/subClassOf  :voag/EnumeratedValue,
   :vaem/description {:rdf/language "en-US",
                      :rdf/value    "something you may be asked not to do"},
   :voag/shortDescription {:rdf/language "en-US",
                           :rdf/value "something you may be asked not to do"}})

(def CreativeCommonsRequirement
  {:db/ident         :voag/CreativeCommonsRequirement,
   :rdf/type         :owl/Class,
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "Requirement"},
   :rdfs/subClassOf  :voag/EnumeratedValue,
   :vaem/description {:rdf/language "en-US",
                      :rdf/value
                      "An action that may or may not be requested of you"},
   :voag/shortDescription
   {:rdf/language "en-US",
    :rdf/value    "an action that may or may not be requested of you"}})

(def CreativeCommonsWork
  {:db/ident         :voag/CreativeCommonsWork,
   :rdf/type         :owl/Class,
   :rdfs/label       #{{:rdf/language "en-US",
                        :rdf/value    "Creative Commons Work"}
                       "Creative commons work"},
   :rdfs/subClassOf  #{:owl/Thing
                       {:owl/maxCardinality 1,
                        :owl/onProperty     :voag/url,
                        :rdf/type           :owl/Restriction}},
   :vaem/description {:rdf/language "en-US",
                      :rdf/value    "A potentially copyrightable work"},
   :voag/shortDescription {:rdf/language "en-US",
                           :rdf/value    "A potentially copyrightable work"}})

(def DSL_LICENSE
  {:db/ident     :voag/DSL_LICENSE,
   :rdf/type     :voag/LicenseModel,
   :rdfs/label   "Design Science License (DSL)",
   :vaem/acronym "dsl",
   :voag/url     {:xsd/anyURI "http://www.gnu.org/licenses/dsl.html"}})

(def Daily
  {:db/ident   :voag/Daily,
   :rdf/type   :voag/ChangeFrequency,
   :rdfs/label "Daily"})

(def DeferredIssue
  {:db/ident    :voag/DeferredIssue,
   :dtype/value {:xsd/string "deferred"},
   :rdf/type    :voag/IssueStatus,
   :rdfs/label  "Deferred"})

(def DeletionEvent
  {:db/ident         :voag/DeletionEvent,
   :rdf/type         :owl/Class,
   :rdfs/label       "Deletion Event",
   :rdfs/subClassOf  :voag/Event,
   :vaem/description "A \"Archival Event\".",
   :voag/shortDescription "A \"Archival Event\"."})

(def DesignatedGovernanceRole
  {:db/ident :voag/DesignatedGovernanceRole,
   :rdf/type :owl/Class,
   :rdfs/label "Designated Governance Role",
   :rdfs/subClassOf #{:voag/Event
                      {:owl/cardinality 1,
                       :owl/onProperty  :voag/performedBy,
                       :rdf/type        :owl/Restriction}},
   :vaem/description
   "A \"Assigned Role\" with the following instance(s): \"Assurer\", \"Project Management\", \"Resource & Process Policy\", \"Technical Definitions\", \"User\", \"Verifier\".",
   :voag/shortDescription
   "A \"Assigned Role\" with the following instance(s): \"Assurer\", \"Project Management\", \"Resource & Process Policy\", \"Technical Definitions\", \"User\", \"Verifier\"."})

(def DisapprovedIssue
  {:db/ident   :voag/DisapprovedIssue,
   :rdf/type   :voag/IssueStatus,
   :rdfs/label "Disapproved Issue"})

(def Document
  {:db/ident        :voag/Document,
   :rdf/type        :owl/Class,
   :rdfs/label      "Document",
   :rdfs/subClassOf :voag/GovernedObject})

(def DocumentationChange
  {:db/ident   :voag/DocumentationChange,
   :rdf/type   :voag/ChangeType,
   :rdfs/label "Documentation change"})

(def ECL_V2PT0
  {:db/ident :voag/ECL_V2PT0,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Educational Community License 2.0",
   :vaem/acronym "ECL2.0",
   :vaem/description
   "This is a free software license, and it is compatible with GPLv3. It is based on the Apache License 2.0; the scope of the patent license has changed so that when an organization's employee works on a project, the organization does not have to license all of its patents to recipients. This patent license and the indemnification clause in section 9 make this license incompatible with GPLv2.",
   :voag/basedOn :voag/APACHE_V2PT0,
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/incompatibleWith :voag/GNU-GPL_V2,
   :voag/url {:xsd/anyURI "http://www.opensource.org/licenses/ecl2.php"}})

(def ECOS_V2PT0
  {:db/ident :voag/ECOS_V2PT0,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "eCos license version 2.0",
   :vaem/acronym "eCos20",
   :vaem/description
   "The eCos license version 2.0 is a GPL-compatible free software license. It consists of the GPL, plus an exception allowing linking to software not under the GPL. This license has the same disadvantages as the LGPL.",
   :voag/url {:xsd/anyURI "http://www.gnu.org/licenses/ecos-license.html"}})

(def ECPAT_LICENSE
  {:db/ident :voag/ECPAT_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Expat License",
   :vaem/acronym "Expat",
   :vaem/description
   "This is a simple, permissive non-copyleft free software license, compatible with the GNU GPL. It is sometimes ambiguously referred to as the MIT License.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.jclark.com/xml/copying.txt"}})

(def EIFFEL_FORUM_LICENSE_V2
  {:db/ident     :voag/EIFFEL_FORUM_LICENSE_V2,
   :rdf/type     :voag/LicenseModel,
   :rdfs/label   "Eiffel Forum License, version 2",
   :vaem/acronym "Eiffel",
   :voag/url     {:xsd/anyURI
                  "http://www.gnu.org/licenses/eiffel-forum-license-2.html"}})

(def EPL_V1PT0
  {:db/ident :voag/EPL_V1PT0,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Eclipse Public License Version 1.0",
   :rdfs/seeAlso :voag/COMMON_PUBLIC_LICENSE_V1PT0,
   :vaem/acronym "EPL",
   :vaem/description
   "The Eclipse Public License is similar to the Common Public License. The only change is that the EPL removes the broader patent retaliation language regarding patent infringement suits specifically against Contributors to the EPL'd program.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.eclipse.org/legal/epl-v10.html"}})

(def EUPL_V1PT1
  {:db/ident :voag/EUPL_V1PT1,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "European Union Public License (EUPL) version 1.1",
   :vaem/acronym "EUPL",
   :vaem/description
   "This is a free software license. By itself, it has a copyleft comparable to the GPL's. However, it allows recipients to distribute the work under the terms of other selected licenses, and some of those—the Eclipse Public License and the Common Public License in particular—only provide a weaker copyleft. Thus, developers can't rely on this license to provide a strong copyleft. The EUPL is compatible with GPLv2, because that is listed as one of the alternative licenses that recipients may use. However, it is incompatible with GPLv3, because recipients are not given permission to use GPLv3's terms, and the EUPL's copyleft conflicts with GPLv3's.",
   :voag/compatibleWith :voag/GNU-GPL_V2,
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.osor.eu/eupl"}})

(def EU_DATAGRID_LICENSE
  {:db/ident :voag/EU_DATAGRID_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "EU DataGrid Software License",
   :vaem/acronym "EUDataGrid",
   :vaem/description
   "This is a simple, permissive non-copyleft free software license, compatible with the GNU GPL.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.opensource.org/licenses/eudatagrid.php"}})

(def EarlyAdoption
  {:db/ident   :voag/EarlyAdoption,
   :rdf/type   :voag/Maturity,
   :rdfs/label "Early adoption"})

(def EnumeratedValue
  {:db/ident         :voag/EnumeratedValue,
   :rdf/type         :owl/Class,
   :rdfs/label       "Metadata Enumerated value",
   :rdfs/subClassOf  :dtype/EnumeratedValue,
   :vaem/description "The base class in LMC for enumerated values",
   :voag/shortDescription "The base class in LMC for enumerated values"})

(def Event
  {:db/ident        :voag/Event,
   :rdf/type        :owl/Class,
   :rdfs/label      "Event",
   :rdfs/subClassOf #{{:owl/maxCardinality 1,
                       :owl/onProperty     :voag/eventDate,
                       :rdf/type           :owl/Restriction} :owl/Thing
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/endDate,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/instigatedBy,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :voag/Party,
                       :owl/onProperty    :voag/instigatedBy,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/name,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/startDate,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/id,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/shortDescription,
                       :rdf/type           :owl/Restriction}}})

(def Experimental
  {:db/ident   :voag/Experimental,
   :rdf/type   :voag/Maturity,
   :rdfs/label "Experimental"})

(def FREEBSD_DL
  {:db/ident :voag/FREEBSD_DL,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "FreeBSD Documentation License",
   :vaem/acronym "FreeBSDDL",
   :vaem/description
   "This is a permissive non-copyleft free documentation license that is compatible with the GNU FDL.",
   :voag/compatibleWith :voag/GNU-FDL,
   :voag/url {:xsd/anyURI
              "http://www.freebsd.org/copyright/freebsd-doc-license.html"}})

(def FREETYPE_PROJECT_LICENSE
  {:db/ident :voag/FREETYPE_PROJECT_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Freetype Project License",
   :vaem/acronym "freetype",
   :vaem/description
   "This is a free software license, and compatible with GPLv3. It has some attribution requirements which make it incompatible with GPLv2.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/incompatibleWith :voag/GNU-GPL_V2,
   :voag/url {:xsd/anyURI "http://freetype.fis.uniroma2.it/FTL.TXT"}})

(def FREE_ART_LICENSE
  {:db/ident     :voag/FREE_ART_LICENSE,
   :rdf/type     :voag/LicenseModel,
   :rdfs/label   "Free Art License",
   :vaem/acronym "FreeArt",
   :voag/url     {:xsd/anyURI "http://artlibre.org/licence/lalgb.html"}})

(def FREE_BSD_LICENSE
  {:db/ident :voag/FREE_BSD_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "FreeBSD license",
   :vaem/acronym "FreeBSD",
   :vaem/description
   "This is the original BSD license with the advertising clause and another clause removed. (It is also sometimes called the “2-clause BSD license”.) It is a simple, permissive non-copyleft free software license, compatible with the GNU GPL. If you want a simple, permissive non-copyleft free software license, the FreeBSD license is a reasonable choice. However, please don't call it a “BSD” or “BSD-style” license, because that is likely to cause confusion which could lead to use of the flawed original BSD license.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI
              "http://www.freebsd.org/copyright/freebsd-license.html"}})

(def Figure
  {:db/ident         :voag/Figure,
   :rdf/type         :owl/Class,
   :rdfs/label       "Figure",
   :rdfs/subClassOf  #{:voag/Image
                       {:owl/maxCardinality 1,
                        :owl/onProperty     :voag/imageMap,
                        :rdf/type           :owl/Restriction}},
   :vaem/description "An illustration of some kind."})

(def GNU-FDL
  {:db/ident     :voag/GNU-FDL,
   :rdf/type     :voag/LicenseModel,
   :rdfs/label   "GNU Free Documentation License",
   :vaem/acronym "FDL",
   :voag/url     {:xsd/anyURI "http://www.gnu.org/licenses/fdl.html"}})

(def GNU-GPL
  {:db/ident :voag/GNU-GPL,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "GNU General Public License (GPL)",
   :vaem/acronym "GPL",
   :vaem/description
   "The GNU GPL can be used for general data which is not software, as long as one can determine what the definition of “source code” refers to in the particular case. As it turns out, the DSL (see below) also requires that you determine what the “source code” is, using approximately the same definition that the GPL uses.",
   :voag/url {:xsd/anyURI "http://www.gnu.org/licenses/gpl.html"}})

(def GNU-GPL_V2
  {:db/ident     :voag/GNU-GPL_V2,
   :rdf/type     :voag/LicenseModel,
   :rdfs/label   "GNU General Public License (GPL) version 2",
   :vaem/acronym "GPLv2",
   :voag/url     {:xsd/anyURI
                  "http://www.gnu.org/licenses/old-licenses/gpl-2.0.html"}})

(def GNU-GPL_V3
  {:db/ident :voag/GNU-GPL_V3,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "GNU General Public License (GPL) version 3",
   :vaem/acronym "GNUGPL",
   :vaem/description
   "This is the latest version of the GNU GPL: a free software license, and a copyleft license. We recommend it for most software packages. GPLv3 is not compatible with GPLv2 by itself. However, most software released under GPLv2 allows you to use the terms of later versions of the GPL as well. When this is the case, you can use the code under GPLv3 to make the desired combination.",
   :voag/supercedes :voag/GNU-GPL_V2,
   :voag/url {:xsd/anyURI "http://www.gnu.org/licenses/gpl.html"}})

(def GNU-LGPL_V2PT1
  {:db/ident :voag/GNU-LGPL_V2PT1,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "GNU Lesser General Public License (LGPL) version 2.1",
   :vaem/acronym "LGPLv2.1",
   :vaem/description
   "This is the previous version of the LGPL: a free software license, but not a strong copyleft license, because it permits linking with non-free modules. It is compatible with GPLv2 and GPLv3.",
   :voag/supercededBy :voag/GNU-LGPL_V3,
   :voag/url {:xsd/anyURI
              "http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html"}})

(def GNU-LGPL_V3
  {:db/ident :voag/GNU-LGPL_V3,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "GNU Lesser General Public License (LGPL) version 3",
   :vaem/acronym "LGPL",
   :vaem/description
   "This is the latest version of the LGPL: a free software license, but not a strong copyleft license, because it permits linking with non-free modules. It is compatible with GPLv3. Note that LGPLv3 is not compatible with GPLv2 by itself. However, most software released under GPLv2 allows you to use the terms of later versions of the GPL as well. When this is the case, you can use the code under GPLv3 to make the desired combination. ",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.gnu.org/licenses/lgpl.html"}})

(def GNU_ALL_PERMISSIVE_LICENSE
  {:db/ident :voag/GNU_ALL_PERMISSIVE_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "GNU All-Permissive License",
   :vaem/acronym "GNUAllPermissive",
   :vaem/description
   "This is a simple permissive free software license, compatible with the GNU GPL, which we recommend GNU packages use for README and other small supporting files. All developers can feel free to use it in similar situations. ",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/url
   {:xsd/anyURI
    "http://www.gnu.org/prep/maintain/html_node/License-Notices-for-Other-Files.html"}})

(def GNU_VERBATIM_COPYING_LICENSE
  {:db/ident :voag/GNU_VERBATIM_COPYING_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "GNU Verbatim Copying License",
   :vaem/acronym "GNUVerbatim",
   :vaem/description
   "This is the license used throughout the GNU web site. It is very simple, and especially well-suited to written works.",
   :voag/url {:xsd/anyURI
              "http://www.gnu.org/licenses/licenses.html#VerbatimCopying"}})

(def GPLPA
  {:db/ident :voag/GPLPA,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "GPL for Computer Programs of the Public Administration",
   :vaem/acronym "GPL-PA",
   :vaem/description
   "The GPL-PA (whose original name in Portuguese is “Licença Pública Geral para Administração Pública”) is non-free for several reasons: (1) It permits use only in “normal circumstances”; (2) It does not allow distribution of source code without binaries; (3) Its permissions lapse after 50 years.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url
   {:xsd/anyURI
    "http://www.celepar.pr.gov.br/modules/conteudo/conteudo.php?conteudo=69"}})

(def GR_Authorizer
  {:db/ident    :voag/GR_Authorizer,
   :dtype/value {:xsd/string "authorizer"},
   :rdf/type    :voag/GovernanceRole,
   :rdfs/label  "Authorizer"})

(def GR_Steward
  {:db/ident    :voag/GR_Steward,
   :dtype/value {:xsd/string "steward"},
   :rdf/type    :voag/GovernanceRole,
   :rdfs/label  "Steward"})

(def GR_Submitter
  {:db/ident    :voag/GR_Submitter,
   :dtype/value {:xsd/string "submitter"},
   :rdf/type    :voag/GovernanceRole,
   :rdfs/label  "Submitter"})

(def Governance
  {:db/ident :voag/Governance,
   :rdf/type :owl/Class,
   :rdfs/label "Governance",
   :rdfs/subClassOf #{{:owl/cardinality 1,
                       :owl/onProperty  :voag/hasApprovalStatus,
                       :rdf/type        :owl/Restriction}
                      {:owl/allValuesFrom :voag/ConfidentialityLevel,
                       :owl/onProperty    :voag/hasConfidentiality,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :voag/LicenseModel,
                       :owl/onProperty    :voag/hasLicenseType,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :voag/Document,
                       :owl/onProperty    :voag/hasNormativeDocument,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :voag/AssignedRole,
                       :owl/onProperty    :voag/accountableEntityOf,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/hasConfidentiality,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/isFOSS,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :voag/ChangeFrequency,
                       :owl/onProperty    :voag/frequencyOfChange,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :voag/GovernanceEvent,
                       :owl/onProperty    :voag/hasGovernanceEvent,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :voag/Issue,
                       :owl/onProperty    :voag/hasIssue,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/hasLicenseType,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :voag/Document,
                       :owl/onProperty    :voag/hasApplicableDocument,
                       :rdf/type          :owl/Restriction} :voag/Qualifier
                      {:owl/cardinality 1,
                       :owl/onProperty  :voag/accountableEntityOf,
                       :rdf/type        :owl/Restriction}
                      {:owl/allValuesFrom :voag/Document,
                       :owl/onProperty    :voag/hasReferenceDocument,
                       :rdf/type          :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :voag/hasProtocol,
                       :rdf/type        :owl/Restriction}
                      {:owl/allValuesFrom :voag/Party,
                       :owl/onProperty    :voag/hasOwner,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/isITAR,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/hasOwner,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :voag/ChangeType,
                       :owl/onProperty    :voag/hasAnticipatedChangeType,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :voag/Governance,
                       :owl/onProperty    :voag/supercedes,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :voag/GovernanceProtocol,
                       :owl/onProperty    :voag/hasProtocol,
                       :rdf/type          :owl/Restriction}},
   :vaem/definition
   "Governance concerns how an artifact is provisioned and managed over its lifecycle. Governance also concerns the status tracking and processes that need to exist on information objects and services for a successful initiaitve, mission, program, or project. Such governance needs to outline the relationships between all internal and external groups involved, describe the proper flow of information regarding to all stakeholders, ensure the appropriate review of issues encountered and ensure that required approvals and direction are obtained at each appropriate stage.",
   :voag/shortDescription
   "Governance is about the status tracking and processes that need to exist on information objects and services for a successful initiaitve, mission, program, or project. Such governance needs to outline the relationships between all internal and external groups involved, describe the proper flow of information regarding to all stakeholders, ensure the appropriate review of issues encountered and ensure that required approvals and direction are obtained at each appropriate stage."})

(def GovernanceEvent
  {:db/ident         :voag/GovernanceEvent,
   :rdf/type         :owl/Class,
   :rdfs/label       "Governance Event",
   :rdfs/subClassOf  :voag/Event,
   :vaem/description "A \"Governance Event\".",
   :voag/shortDescription "A \"Governance Event\"."})

(def GovernanceProcess
  {:db/ident         :voag/GovernanceProcess,
   :rdf/type         :owl/Class,
   :rdfs/label       "Governance Process",
   :rdfs/subClassOf  :voag/Process,
   :vaem/description "A \"Process\".",
   :voag/shortDescription "A \"Process\"."})

(def GovernanceProtocol
  {:db/ident :voag/GovernanceProtocol,
   :owl/equivalentClass {:owl/intersectionOf
                         [{:owl/onProperty     :voag/isGovernedBy,
                           :owl/someValuesFrom :voag/StakeholderGroup,
                           :rdf/type           :owl/Restriction}
                          {:owl/onProperty     :voag/hasProcess,
                           :owl/someValuesFrom :voag/GovernanceProcess,
                           :rdf/type           :owl/Restriction}
                          {:owl/onProperty     :voag/hasNormativeDocument,
                           :owl/someValuesFrom :voag/Document,
                           :rdf/type           :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/label "Governance Protocol",
   :rdfs/subClassOf #{{:owl/onProperty     :voag/isGovernedBy,
                       :owl/someValuesFrom :voag/StakeholderGroup,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/hasChangeManagementProcess,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/hasApprovalProcess,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/hasIssueResolutionProcess,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :voag/IssueResolutionProcess,
                       :owl/onProperty    :voag/hasIssueResolutionProcess,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :voag/StakeholderGroup,
                       :owl/onProperty    :voag/reviewedBy,
                       :rdf/type          :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :voag/isGovernedBy,
                       :rdf/type        :owl/Restriction}
                      {:owl/allValuesFrom :voag/ApprovalProcess,
                       :owl/onProperty    :voag/hasApprovalProcess,
                       :rdf/type          :owl/Restriction}
                      {:owl/cardinality 3,
                       :owl/onProperty  :voag/hasProcess,
                       :rdf/type        :owl/Restriction}
                      {:owl/allValuesFrom :voag/StakeholderGroup,
                       :owl/onProperty    :voag/isInterestOf,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :voag/ChangeManagementProcess,
                       :owl/onProperty    :voag/hasChangeManagementProcess,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :voag/StakeholderGroup,
                       :owl/onProperty    :voag/isApprovedBy,
                       :rdf/type          :owl/Restriction} :voag/Qualifier
                      {:owl/allValuesFrom :voag/Organization,
                       :owl/onProperty    :voag/isGovernedBy,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/id,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :voag/hasNormativeDocument,
                       :owl/someValuesFrom :voag/Document,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :voag/StakeholderGroup,
                       :owl/onProperty    :voag/mayNeedConcurrenceFrom,
                       :rdf/type          :owl/Restriction}},
   :vaem/description
   "Governance is used  to mean the processes that need to exist for a successful initiaitve, mission, program, or project. Such governance needs to outline the relationships between all internal and external groups involved, describe the proper flow of information regarding to all stakeholders, ensure the appropriate review of issues encountered and ensure that required approvals and direction for a 'GovernedEntity' is obtained at each appropriate stage.",
   :voag/shortDescription
   "Governance is used  to mean the processes that need to exist for a successful initiaitve, mission, program, or project. Such governance needs to outline the relationships between all internal and external groups involved, describe the proper flow of information regarding to all stakeholders, ensure the appropriate review of issues encountered and ensure that required approvals and direction for a 'GovernedEntity' is obtained at each appropriate stage."})

(def GovernanceRole
  {:db/ident :voag/GovernanceRole,
   :rdf/type :owl/Class,
   :rdfs/label "Governance Role",
   :rdfs/subClassOf :voag/EnumeratedValue,
   :vaem/description
   "A \"Role\" with the following instance(s): \"authorizer\", \"steward\", \"submitter\".",
   :voag/shortDescription
   "A \"Role\" with the following instance(s): \"authorizer\", \"steward\", \"submitter\"."})

(def GovernedObject
  {:db/ident        :voag/GovernedObject,
   :rdf/type        :owl/Class,
   :rdfs/label      "Governed Object",
   :rdfs/subClassOf #{{:owl/maxCardinality 1,
                       :owl/onProperty     :voag/documentedAt,
                       :rdf/type           :owl/Restriction} :owl/Thing
                      {:owl/minCardinality 0,
                       :owl/onProperty     :voag/url,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/hasGovernance,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/hasProvenance,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :voag/Provenance,
                       :owl/onProperty    :voag/hasProvenance,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :voag/Governance,
                       :owl/onProperty    :voag/hasGovernance,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/name,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/longDescription,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/id,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/shortDescription,
                       :rdf/type           :owl/Restriction}},
   :vaem/definition "An abstract class for all governed entities"})

(def GovernedService
  {:db/ident        :voag/GovernedService,
   :rdf/type        :owl/Class,
   :rdfs/label      "Governed service",
   :rdfs/subClassOf :voag/Service})

(def Graph
  {:db/ident :voag/Graph,
   :rdf/type :owl/Class,
   :rdfs/label "Graph",
   :rdfs/subClassOf #{{:owl/maxCardinality 1,
                       :owl/onProperty     :voag/downloads,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :voag/ProductLogo,
                       :owl/onProperty    :voag/hasLogo,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :voag/Attribution,
                       :owl/onProperty    :voag/withAttributionTo,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/urlOfRDFfile,
                       :rdf/type           :owl/Restriction} :void/Dataset
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/urlOfTurtleFile,
                       :rdf/type           :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :vaem/namespace,
                       :rdf/type        :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :voag/curatedGraphURI,
                       :rdf/type        :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/hasLogo,
                       :rdf/type           :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :vaem/namespacePrefix,
                       :rdf/type        :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :voag/attributionText,
                       :rdf/type        :owl/Restriction}},
   :vaem/definition
   "A set of RDF triples in an ontology graph specified according to VOAG."})

(def HESSLA
  {:db/ident :voag/HESSLA,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Hacktivismo Enhanced-Source Software License Agreement",
   :vaem/acronym "HESSLA",
   :vaem/description
   "This is not a free software license, because it restricts what jobs people can use the software for, and restricts in substantive ways what jobs modified versions of the program can do.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.hacktivismo.com/about/hessla.php"}})

(def IBM_PUBLIC_LICENSE_V1PT0
  {:db/ident :voag/IBM_PUBLIC_LICENSE_V1PT0,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "IBM Public License, Version 1.0",
   :vaem/acronym "IBMPL",
   :vaem/description
   "This is a free software license. Unfortunately, it has a choice of law clause which makes it incompatible with the GNU GPL.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.opensource.org/licenses/ibmpl.php"}})

(def IJG_LICENSE
  {:db/ident :voag/IJG_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Independent JPEG Group License",
   :vaem/acronym "IJG",
   :vaem/description
   "This is a free software license, and compatible with the GNU GPL. The authors have assured us that developers who document changes as required by the GPL will also comply with the similar requirement in this license.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI
              "http://dev.w3.org/cvsweb/Amaya/libjpeg/Attic/README?rev=1.2"}})

(def IMATRIX_STANDARD_FUNCTION_LIBRARY_LICENSE
  {:db/ident         :voag/IMATRIX_STANDARD_FUNCTION_LIBRARY_LICENSE,
   :rdf/type         :voag/LicenseModel,
   :rdfs/label       "License of the iMatix Standard Function Library",
   :vaem/acronym     "iMatix",
   :vaem/description "This is a free software license and is GPL compatible.",
   :voag/url         {:xsd/anyURI
                      "http://legacy.imatix.com/html/sfl/sfl4.htm#license"}})

(def IMLIB2_LICENSE
  {:db/ident :voag/IMLIB2_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "License of imlib2",
   :vaem/acronym "imlib",
   :vaem/description
   "This is a free software license, and GPL-compatible. The author has explained to us that the GPL's options for providing source all mean the source has been \"made available publicly\" in their words.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI
              "http://trac.enlightenment.org/e/browser/trunk/imlib2/COPYING"}})

(def INTEL_OPEN_SOURCE_LICENSE
  {:db/ident :voag/INTEL_OPEN_SOURCE_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Intel Open Source License",
   :vaem/acronym "intel",
   :vaem/description
   "This is a Free Software license, compatible with the GNU GPL.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/url
   {:xsd/anyURI
    "http://www.opensource.org/licenses/intel-open-source-license.html"}})

(def IPL_V1PT0
  {:db/ident :voag/IPL_V1PT0,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Interbase Public License, Version 1.0",
   :vaem/acronym "IPL",
   :vaem/description
   "This is a free software license that is essentially the same as the Mozilla Public License, Version 1.1. Like the MPL, the IPL has some complex restrictions that make it incompatible with the GNU GPL. That is, a module covered by the GPL and a module covered by the IPL cannot legally be linked together.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url
   {:xsd/anyURI
    "http://www.borland.com/devsupport/interbase/opensource/IPL.html"}})

(def ISC_LICENSE
  {:db/ident :voag/ISC_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "ISC License",
   :vaem/acronym "ISC",
   :vaem/description
   "This license is sometimes also known as the OpenBSD License. It is a free software license, and compatible with the GNU GPL. This license does have an unfortunate wording choice: it provides recipients with \"Permission to use, copy, modify, and/or distribute this software....\" This is roughly the same language from the license of Pine that the University of Washington later claimed prohibited people from distributing modified versions of the software.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.isc.org/software/license"}})

(def Icon
  {:db/ident         :voag/Icon,
   :rdf/type         :owl/Class,
   :rdfs/label       "Icon",
   :rdfs/subClassOf  :voag/Image,
   :vaem/description "A logo of some kind"})

(def Image
  {:db/ident :voag/Image,
   :rdf/type :owl/Class,
   :rdfs/label "Image",
   :rdfs/subClassOf #{{:owl/maxCardinality 1,
                       :owl/onProperty     :voag/height,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/width,
                       :rdf/type           :owl/Restriction} :owl/Thing
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/caption,
                       :rdf/type           :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :voag/image,
                       :rdf/type        :owl/Restriction}},
   :vaem/description
   "Image is a class for figures, pictures, logos, and icons  of various kinds"})

(def InDevelopment
  {:db/ident   :voag/InDevelopment,
   :rdf/type   :voag/Maturity,
   :rdfs/label "In development"})

(def Issue
  {:db/ident :voag/Issue,
   :rdf/type :owl/Class,
   :rdfs/label "Issue",
   :rdfs/subClassOf #{{:owl/cardinality 1,
                       :owl/onProperty  :voag/disposition,
                       :rdf/type        :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :voag/userID,
                       :rdf/type        :owl/Restriction}
                      {:owl/allValuesFrom :voag/PriorityValue,
                       :owl/onProperty    :voag/priority,
                       :rdf/type          :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :voag/hasStatus,
                       :rdf/type        :owl/Restriction} :owl/Thing
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/priority,
                       :rdf/type           :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :voag/title,
                       :rdf/type        :owl/Restriction}
                      {:owl/allValuesFrom :voag/IssueStatus,
                       :owl/onProperty    :voag/hasStatus,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/longDescription,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/id,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/shortDescription,
                       :rdf/type           :owl/Restriction}},
   :vaem/description
   "captures issues such as raising of an issue related to a particular entity in a registry",
   :voag/shortDescription
   "captures issues such as raising of an issue related to a particular entity in a registry"})

(def IssueResolutionProcess
  {:db/ident         :voag/IssueResolutionProcess,
   :rdf/type         :owl/Class,
   :rdfs/label       "Issue Resolution Process",
   :rdfs/subClassOf  :voag/GovernanceProcess,
   :vaem/description "A \"Governance Process\".",
   :voag/shortDescription "A \"Governance Process\"."})

(def IssueStatus
  {:db/ident :voag/IssueStatus,
   :rdf/type :owl/Class,
   :rdfs/label "Issue Status",
   :rdfs/subClassOf :voag/EnumeratedValue,
   :vaem/description
   "The status of an issue: \"Closed\", \"Deferred\", \"Non issue\", \"Open\", \"Resolved\".",
   :voag/shortDescription
   "The status of an issue: \"Closed\", \"Deferred\", \"Non issue\", \"Open\", \"Resolved\"."})

(def JAHIA_COMMUNITY_SOURCE_LICENSE
  {:db/ident :voag/JAHIA_COMMUNITY_SOURCE_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Jahia Community Source License",
   :vaem/acronym "Jahia",
   :vaem/description
   "The Jahia Community Source License is not a free software license. Use of the source code is limited to research purposes.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.jahia.org/jahia/Jahia/pid/145"}})

(def JOSL_V1PT0
  {:db/ident :voag/JOSL_V1PT0,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Jabber Open Source License, Version 1.0",
   :vaem/acronym "josl",
   :vaem/description
   "The license is a free software license, incompatible with the GPL. It permits relicensing under a certain class of licenses, those which include all the requirements of the Jabber license. The GPL is not a member of that class, so the Jabber license does not permit relicensing under the GPL. Therefore, it is not compatible.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url
   {:xsd/anyURI
    "http://code.google.com/p/jabber-net/source/browse/branches/RELEASE_1_0/LICENSE.txt"}})

(def JSON_LICENSE
  {:db/ident :voag/JSON_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "The JSON License",
   :vaem/acronym "JSON",
   :vaem/description
   "This is the license of the original implementation of the JSON data interchange format. This license uses the Expat license as a base, but adds a clause mandating: “The Software shall be used for Good, not Evil.” This is a restriction on usage and thus conflicts with freedom 0. The restriction might be unenforcible, but we cannot presume that. Thus, the license is nonfree.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.json.org/license.html"}})

(def LPPL_V1PT2
  {:db/ident :voag/LPPL_V1PT2,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "LaTeX Project Public License 1.2",
   :vaem/acronym "LPPL-1.2",
   :vaem/description
   "This license is an incomplete statement of the distribution terms for LaTeX. As far as it goes, it is a free software license, but incompatible with the GPL because it has many requirements that are not in the GPL.  This license contains complex and annoying restrictions on how to publish a modified version, including one requirement that falls just barely on the good side of the line of what is acceptable: that any modified file must have a new name. The reason this requirement is acceptable for LaTeX is that TeX has a facility to allow you to map file names, to specify “use file bar when file foo is requested”. With this facility, the requirement is merely annoying; without the facility, the same requirement would be a serious obstacle, and we would have to conclude it makes the program non-free. This condition may cause trouble with some major modifications. For example, if you wanted to port an LPPL-covered work to another system that lacked a similar remapping facility, but still required users to request this file by name, you would need to implement a remapping facility too to keep this software free. That would be a nuisance, but the fact that a license would make code nonfree if transplanted into a very different context does not make it nonfree in the original context. The LPPL says that some files, in certain versions of LaTeX, may have additional restrictions, which could render them non-free. For this reason, it may take some careful checking to produce a version of LaTeX that is free software. The LPPL makes the controversial claim that simply having files on a machine where a few other people could log in and access them in itself constitutes distribution. We believe courts would not uphold this claim, but it is not good for people to start making the claim. Note: These comments are for version 1.2 (3 Sep 1999) of the LPPL.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.latex-project.org/lppl/lppl-1-2.txt"}})

(def LPPL_V1PT3A
  {:db/ident :voag/LPPL_V1PT3A,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "LaTeX Project Public License 1.3a",
   :vaem/acronym "LPPL-1.3a",
   :vaem/description
   "GNU have not written a full analysis of this license, but it is a free software license, with less stringent requirements on distribution than LPPL 1.2 (described next). It is still incompatible with the GPL because some modified versions must include a copy of or pointer to an unmodified version.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/supercedes :voag/LPPL_V1PT2,
   :voag/url {:xsd/anyURI "http://www.latex-project.org/lppl/lppl-1-3a.txt"}})

(def LUCENT_PUBLIC_LICENSE_V1PT02
  {:db/ident :voag/LUCENT_PUBLIC_LICENSE_V1PT02,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Lucent Public License Version 1.02 (Plan 9 license)",
   :vaem/acronym "lucent102",
   :vaem/description
   "This is a free software license, but it is incompatible with the GNU GPL because of its choice of law clause. We recommend that you not use this license for new software that you write, but it is ok to use and improve Plan 9 under this license.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://plan9.bell-labs.com/plan9dist/license.html"}})

(def LicenseModel
  {:db/ident :voag/LicenseModel,
   :rdf/type :owl/Class,
   :rdfs/label "License Model",
   :rdfs/subClassOf #{{:owl/allValuesFrom :voag/LicenseModel,
                       :owl/onProperty    :voag/compatibleWith,
                       :rdf/type          :owl/Restriction} :voag/GovernedObject
                      {:owl/allValuesFrom :voag/LicenseModel,
                       :owl/onProperty    :voag/basedOn,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/image,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :voag/LicenseModel,
                       :owl/onProperty    :voag/incompatibleWith,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/acronym,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/url,
                       :rdf/type           :owl/Restriction}},
   :vaem/definition
   "A License Model describes the licensing conditions associated with a software artifact."})

(def LinkedModelCatalog
  {:db/ident        :voag/LinkedModelCatalog,
   :rdf/type        :owl/Class,
   :rdfs/label      "Linked model catalog",
   :rdfs/subClassOf #{{:owl/allValuesFrom :voag/Figure,
                       :owl/onProperty    :voag/hasOntologyArchitectureDiagram,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/urlOfRDFfile,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/urlOfTurtleFile,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :voag/Graph,
                       :owl/onProperty    :voag/hasCatalogEntry,
                       :rdf/type          :owl/Restriction} :voag/Catalog
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/hasOntologyArchitectureDiagram,
                       :rdf/type           :owl/Restriction}}})

(def LinkedModelLogo-200x80
  {:db/ident :voag/LinkedModelLogo-200x80,
   :rdf/type :voag/Logo,
   :rdfs/label "LinkedModel ICON 200 x 80",
   :vaem/description "LinkedModel Logo",
   :voag/caption "LinkedModel Standard ICON",
   :voag/height "80",
   :voag/image
   {:xsd/anyURI
    "http://www.linkedmodel.org/lib/lm/images/logos/linkedmodels-logo.gif"},
   :voag/width "200"})

(def Logo
  {:db/ident         :voag/Logo,
   :rdf/type         :owl/Class,
   :rdfs/label       "Logo",
   :rdfs/subClassOf  :voag/Image,
   :vaem/description "Logo is ..."})

(def MODIFIED_BSD_LICENSE
  {:db/ident :voag/MODIFIED_BSD_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Modified BSD license",
   :rdfs/seeAlso :voag/BSD_ORIGINAL_LICENSE,
   :vaem/acronym "ModifiedBSD",
   :vaem/description
   "This is the original BSD license, modified by removal of the advertising clause. It is a simple, permissive non-copyleft free software license, compatible with the GNU GPL. If you want a simple, permissive non-copyleft free software license, the modified BSD license is a reasonable choice. However, it is risky to recommend use of “the BSD license”, because confusion could easily occur and lead to use of the flawed original BSD license. To avoid this risk, you can suggest the X11 license instead. The X11 license and the revised BSD license are more or less equivalent. This license is sometimes referred to as the 3-clause BSD license.",
   :voag/url {:xsd/anyURI "http://www.xfree86.org/3.3.6/COPYRIGHT2.html#5"}})

(def MPL
  {:db/ident :voag/MPL,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Mozilla Public License (MPL)",
   :vaem/acronym "MPL",
   :vaem/description
   "This is a free software license which is not a strong copyleft; unlike the X11 license, it has some complex restrictions that make it incompatible with the GNU GPL. That is, a module covered by the GPL and a module covered by the MPL cannot legally be linked together. GNU urge you not to use the MPL for this reason. However, MPL 1.1 has a provision (section 13) that allows a program (or parts of it) to offer a choice of another license as well. If part of a program allows the GNU GPL as an alternate choice, or any other GPL-compatible license as an alternate choice, that part of the program has a GPL-compatible license.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.mozilla.org/MPL/MPL-1.1.html"}})

(def MS-LPL
  {:db/ident :voag/MS-LPL,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Microsoft Limited Public License (Ms-LPL)",
   :vaem/acronym "Ms-LPL",
   :vaem/description
   "This license is non-free because of section 3(F), which requires that any modified software you make from the original code must run on Windows. The Microsoft Public License does not have this restriction.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url
   {:xsd/anyURI
    "http://www.microsoft.com/resources/sharedsource/licensingbasics/limitedpubliclicense.mspx"}})

(def MS-LRL
  {:db/ident :voag/MS-LRL,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Microsoft Limited Reciprocal License (Ms-LRL)",
   :vaem/acronym "Ms-LRL",
   :vaem/description
   "This license is non-free because of section 3(G), which requires that any modified software you make from the original code must run on Windows. The Microsoft Reciprocal License does not have this restriction.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url
   {:xsd/anyURI
    "http://www.microsoft.com/resources/sharedsource/licensingbasics/limitedreciprocallicense.mspx"}})

(def MS-PL
  {:db/ident :voag/MS-PL,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Microsoft Public License (Ms-PL)",
   :vaem/acronym "ms-pl",
   :vaem/description
   "This is a free software license; it has a copyleft that is not strong, but incompatible with the GNU GPL. GNU urge you not to use the Ms-PL for this reason.",
   :voag/url {:xsd/anyURI
              "http://www.microsoft.com/opensource/licenses.mspx#Ms-PL"}})

(def MS-RL
  {:db/ident :voag/MS-RL,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Microsoft Reciprocal License (Ms-RL)",
   :vaem/acronym "ms-rl",
   :vaem/description
   "This is a free software license. It's based on the Microsoft Public License, and has an additional clause to make the copyleft just a little bit stronger. It's also incompatible with the GNU GPL, and GNU urge you not to use the Ms-RL for this reason.",
   :voag/basedOn :voag/MS-PL,
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI
              "http://www.microsoft.com/opensource/licenses.mspx#Ms-RL"}})

(def MS-RRL
  {:db/ident :voag/MS-RRL,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Microsoft Reference License",
   :vaem/acronym "Ms-RL",
   :vaem/description
   "This is a non-free license: you are not allowed to modify the software at all, and you are only allowed to share it under very particular circumstances.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url
   {:xsd/anyURI
    "http://www.microsoft.com/resources/sharedsource/licensingbasics/referencelicense.mspx"}})

(def MS-SSL
  {:db/ident :voag/MS-SSL,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Microsoft's Shared Source CLI, C#, and Jscript License",
   :vaem/acronym "Ms-SS",
   :vaem/description
   "This license does not permit commercial distribution, and only allows commercial use under certain circumstances.  Microsoft has other licenses which it describes as “Shared Source”, some of which have different restrictions.",
   :voag/url
   {:xsd/anyURI
    "http://fedoraproject.org/wiki/Licensing/Microsoft_Shared_Source_License"}})

(def Maturity
  {:db/ident        :voag/Maturity,
   :owl/unionOf     [:voag/WidelyAdopted
                     :voag/SomeAdoption
                     :voag/EarlyAdoption
                     :voag/Proposed
                     :voag/UnknownMaturity
                     :voag/Experimental
                     :voag/InDevelopment],
   :rdf/type        :owl/Class,
   :rdfs/label      "Maturity",
   :rdfs/subClassOf :voag/EnumeratedValue})

(def ModificationChange
  {:db/ident   :voag/ModificationChange,
   :rdf/type   :voag/ChangeType,
   :rdfs/label "Modification change"})

(def Monthly
  {:db/ident   :voag/Monthly,
   :rdf/type   :voag/ChangeFrequency,
   :rdfs/label "Monthly"})

(def NASA_OPEN_SOURCE_AGREEMENT
  {:db/ident :voag/NASA_OPEN_SOURCE_AGREEMENT,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "NASA Open Source Agreement",
   :vaem/acronym "NASA",
   :vaem/description
   "The NASA Open Source Agreement, version 1.3, is not a free software license because it includes a provision requiring changes to be your “original creation”. Free software development depends on combining code from third parties, and the NASA license doesn't permit this. GNU urge you not to use this license. In addition, if you are a United States citizen, please write to NASA and call for the use of a truly free software license.",
   :voag/url {:xsd/anyURI "http://www.opensource.org/licenses/nasa1.3"}})

(def NCSA_LICENSE
  {:db/ident :voag/NCSA_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "NCSA/University of Illinois Open Source License",
   :vaem/acronym "NCSA",
   :vaem/description
   "This license is based on the terms of the Expat and modified BSD licenses. It is a simple, permissive non-copyleft free software license, compatible with the GNU GPL.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.opensource.org/licenses/UoI-NCSA.php"}})

(def NOKIA_OPEN_SOURCE_LICENSE
  {:db/ident :voag/NOKIA_OPEN_SOURCE_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Nokia Open Source License",
   :rdfs/seeAlso :voag/MPL,
   :vaem/acronym "Nokia",
   :vaem/description
   "This is similar to the Mozilla Public License: a free software license incompatible with the GNU GPL.",
   :voag/url {:xsd/anyURI "http://opensource.org/licenses/nokia.html"}})

(def NOSL_V1PT0
  {:db/ident :voag/NOSL_V1PT0,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Netizen Open Source License (NOSL), Version 1.0",
   :rdfs/seeAlso :voag/MPL,
   :vaem/acronym "NOSL",
   :vaem/description
   "This is a free software license that is essentially the same as the Mozilla Public License, Version 1.1. Like the MPL, the NOSL has some complex restrictions that make it incompatible with the GNU GPL. That is, a module covered by the GPL and a module covered by the NOSL cannot legally be linked together. GNU urge you not to use the NOSL for this reason.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://bits.netizen.com.au/licenses/NOSL/nosl.txt"}})

(def NPL
  {:db/ident :voag/NPL,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Netscape Public License (NPL)",
   :vaem/acronym "NPL",
   :vaem/description
   "This is a free software license, not a strong copyleft, and incompatible with the GNU GPL. It consists of the Mozilla Public License with an added clause that permits Netscape to use your added code even in their proprietary versions of the program. Of course, they do not give you permission to use their code in the analogous way. GNU urge you not to use the NPL.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.mozilla.org/NPL/NPL-1.1.html"}})

(def Never
  {:db/ident   :voag/Never,
   :rdf/type   :voag/ChangeFrequency,
   :rdfs/label "Never"})

(def NoAttributionSpecified
  {:db/ident   :voag/NoAttributionSpecified,
   :rdf/type   :voag/Attribution,
   :rdfs/label "No attribution specified"})

(def NoGovernanceSpecified
  {:db/ident   :voag/NoGovernanceSpecified,
   :rdf/type   :voag/Governance,
   :rdfs/label "No governance specified"})

(def NoPedigreeSpecified
  {:db/ident   :voag/NoPedigreeSpecified,
   :rdf/type   :voag/Pedigree,
   :rdfs/label "No pedigree specified"})

(def NoProvenanceSpecified
  {:db/ident   :voag/NoProvenanceSpecified,
   :rdf/type   :voag/Provenance,
   :rdfs/label "No provenance specified"})

(def NonConcurrenceEvent
  {:db/ident         :voag/NonConcurrenceEvent,
   :rdf/type         :owl/Class,
   :rdfs/label       "Non-Concurrence Event",
   :rdfs/subClassOf  :voag/GovernanceEvent,
   :vaem/description "A \"Governance Event\".",
   :voag/shortDescription "A \"Governance Event\"."})

(def NonIssue
  {:db/ident    :voag/NonIssue,
   :dtype/value {:xsd/string "non-issue"},
   :rdf/type    :voag/IssueStatus,
   :rdfs/label  "Non-issue"})

(def OCL
  {:db/ident :voag/OCL,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Open Content License, Version 1.0",
   :vaem/acronym "OCL",
   :vaem/description
   "This license does not qualify as free, because there are restrictions on charging money for copies. GNU recommend you do not use this license. Note that this license is not the same as the Open Publication License. The practice of abbreviating “Open Content License” as “OPL” leads to confusion between them. For clarity, it is better not to use the abbreviation “OPL” for either license. It is worth spelling their names in full to make sure people understand what you say.",
   :voag/incompatibleWith #{:voag/OPL :voag/GNU-FDL},
   :voag/url {:xsd/anyURI "http://opencontent.org/opl.shtml"}})

(def OPENLDAP_LICENSE_V2PT7
  {:db/ident :voag/OPENLDAP_LICENSE_V2PT7,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "OpenLDAP License, Version 2.7",
   :vaem/acronym "newOpenLDAP",
   :vaem/description
   "This is a permissive non-copyleft free software license that is compatible with the GNU GPL.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI
              "http://www.openldap.org/software/release/license.html"}})

(def OPEN_DIRECTORY_LICENSE
  {:db/ident :voag/OPEN_DIRECTORY_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Open Directory License (aka dmoz.org License)",
   :vaem/acronym "OpenDirectory",
   :vaem/description
   "This is not a free documentation license. The primary problems are that your right to redistribute any given version is not permanent and that it requires the user to keep checking back at that site, which is too restrictive of the user's freedom.",
   :voag/incompatibleWith :voag/GNU-FDL,
   :voag/url {:xsd/anyURI "http://dmoz.org/license.html"}})

(def OPEN_PUBLICATION_LICENSE_V1PT0
  {:db/ident :voag/OPEN_PUBLICATION_LICENSE_V1PT0,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Open Publication License, Version 1.0",
   :vaem/acronym "RealOPL",
   :vaem/description
   "This license can be used as a free documentation license. It is a copyleft free documentation license provided the copyright holder does not exercise any of the “LICENSE OPTIONS” listed in Section VI of the license. But if either of the options is invoked, the license becomes non-free. In any case, it is incompatible with the GNU FDL.  This creates a practical pitfall in using or recommending this license: if you recommend “Use the Open Publication License, Version 1.0 but don't enable the options”, it would be easy for the second half of that recommendation to get forgotten; someone might use the license with the options, making a manual non-free, and yet think he or she is following your advice. Likewise, if you use this license without either of the options to make your manual free, someone else might decide to imitate you, then change his or her mind about the options thinking that that is just a detail; the result would be that his or her manual is non-free. Thus, while manuals published under this license do qualify as free documentation if neither license option was used, it is better to use the GNU Free Documentation License and avoid the risk of leading someone else astray. Please note that this license is not the same as the Open Content License. These two licenses are frequently confused, as the Open Content License is often referred to as the “OPL”. For clarity, it is better not to use the abbreviation “OPL” for either license. It is worth spelling their names in full to make sure people understand what you say.",
   :voag/incompatibleWith :voag/GNU-FDL,
   :voag/url {:xsd/anyURI "http://opencontent.org/openpub/"}})

(def OPEN_SOFTWARE_LICENSE
  {:db/ident :voag/OPEN_SOFTWARE_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Open Software License, all versions through 3.0",
   :vaem/acronym "OSL",
   :vaem/description
   "The Open Software License is a free software license. It is incompatible with the GNU GPL in several ways. Recent versions of the Open Software License have a term which requires distributors to try to obtain explicit assent to the license. This means that distributing OSL software on ordinary FTP sites, sending patches to ordinary mailing lists, or storing the software in an ordinary version control system, is arguably a violation of the license and would subject you to possible termination of the license. Thus, the Open Software License makes it very difficult to develop software using the ordinary tools of free software development. For this reason, and because it is incompatible with the GPL, GNU recommend that no version of the OSL be used for any software.  GNU urge you not to use the Open Software License for software you write. However, there is no reason to avoid running programs that have been released under this license.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.opensource.org/licenses/osl-3.0.php"}})

(def OPEN_SSL_LICENSE
  {:db/ident :voag/OPEN_SSL_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "OpenSSL license",
   :vaem/acronym "OpenSSL",
   :vaem/description
   "The license of OpenSSL is a conjunction of two licenses, one of them being the license of SSLeay. You must follow both. The combination results in a copyleft free software license that is incompatible with the GNU GPL. It also has an advertising clause like the original BSD license and the Apache license. GNU recommend using GNUTLS instead of OpenSSL in software you write. However, there is no reason not to use OpenSSL and applications that work with OpenSSL.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.sdisw.com/openssl.htm"}})

(def OPL
  {:db/ident :voag/OPL,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Open Public License",
   :vaem/acronym "OPL",
   :vaem/description
   "This is not a free software license, because it requires sending every published modified version to a specific initial developer. There are also some other words in this license whose meaning we're not sure of that might also be problematic.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI
              "https://fedoraproject.org/wiki/Licensing/Open_Public_License"}})

(def OpenIssue
  {:db/ident         :voag/OpenIssue,
   :dtype/value      {:xsd/string "open"},
   :rdf/type         :voag/IssueStatus,
   :rdfs/label       "Open",
   :vaem/description "An issue with undetermined disposition,",
   :voag/shortDescription "An issue with undetermined disposition,"})

(def Organization
  {:db/ident        :voag/Organization,
   :rdf/type        :owl/Class,
   :rdfs/label      "Organization",
   :rdfs/subClassOf #{{:owl/minCardinality 0,
                       :owl/onProperty     :voag/url,
                       :rdf/type           :owl/Restriction} :voag/Party
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/hasLogo,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :voag/OrganizationLogo,
                       :owl/onProperty    :voag/hasLogo,
                       :rdf/type          :owl/Restriction}}})

(def OrganizationLogo
  {:db/ident         :voag/OrganizationLogo,
   :rdf/type         :owl/Class,
   :rdfs/label       "Organization logo",
   :rdfs/subClassOf  :voag/Logo,
   :vaem/description "A logo for an organization"})

(def PHORUM_LICENSE_V2PT0
  {:db/ident :voag/PHORUM_LICENSE_V2PT0,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Phorum License, Version 2.0",
   :vaem/acronym "Phorum",
   :vaem/description
   "This is a free software license but it is incompatible with the GPL. Section 5 makes the license incompatible with the GPL.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://phorum.org/license.txt"}})

(def PHP_LICENSE_V3PT01
  {:db/ident :voag/PHP_LICENSE_V3PT01,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "PHP License, Version 3.01",
   :vaem/acronym "PHP-3.01",
   :vaem/description
   "This license is used by most of PHP4. It is a non-copyleft free software license. It is incompatible with the GNU GPL because it includes strong restrictions on the use of “PHP” in the name of derived products. GNU recommend that you not use this license for anything except PHP add-ons.",
   :voag/url {:xsd/anyURI "http://www.php.net/license/3_01.txt"}})

(def PS_Draft
  {:db/ident    :voag/PS_Draft,
   :dtype/value {:xsd/string "draft"},
   :rdf/type    :voag/PublicationStatus,
   :rdfs/label  "Draft Status"})

(def PS_Final
  {:db/ident   :voag/PS_Final,
   :rdf/type   :voag/PublicationStatus,
   :rdfs/label "Final Status"})

(def PS_Interim
  {:db/ident    :voag/PS_Interim,
   :dtype/value {:xsd/string "interim"},
   :rdf/type    :voag/PublicationStatus,
   :rdfs/label  "Interim Status"})

(def PS_Obsolete
  {:db/ident    :voag/PS_Obsolete,
   :dtype/value {:xsd/string "obsolete"},
   :rdf/type    :voag/PublicationStatus,
   :rdfs/label  "Obsolete"})

(def PS_Review
  {:db/ident    :voag/PS_Review,
   :dtype/value {:xsd/string "review"},
   :rdf/type    :voag/PublicationStatus,
   :rdfs/label  "Review"})

(def PS_Unknown
  {:db/ident    :voag/PS_Unknown,
   :dtype/value {:xsd/string "unknown"},
   :rdf/type    :voag/PublicationStatus,
   :rdfs/label  "Unknown Status"})

(def PV_HighPriority
  {:db/ident    :voag/PV_HighPriority,
   :dtype/value {:xsd/string "high"},
   :rdf/type    :voag/PriorityValue,
   :rdfs/label  "High priority"})

(def PV_LowPriority
  {:db/ident    :voag/PV_LowPriority,
   :dtype/value {:xsd/string "low"},
   :rdf/type    :voag/PriorityValue,
   :rdfs/label  "Low priority"})

(def PV_MediumPriority
  {:db/ident    :voag/PV_MediumPriority,
   :dtype/value {:xsd/string "medium"},
   :rdf/type    :voag/PriorityValue,
   :rdfs/label  "Medium priority"})

(def PV_NotApplicable
  {:db/ident    :voag/PV_NotApplicable,
   :dtype/value {:xsd/string "na"},
   :rdf/type    :voag/PriorityValue,
   :rdfs/label  "Not Applicable"})

(def PV_ToBeDetermined
  {:db/ident    :voag/PV_ToBeDetermined,
   :dtype/value {:xsd/string "tbd"},
   :rdf/type    :voag/PriorityValue,
   :rdfs/label  "TBD"})

(def PYTHON_LICENSE_V1PT6B1_THROUGH_2PT0_AND_2PT1
  {:db/ident :voag/PYTHON_LICENSE_V1PT6B1_THROUGH_2PT0_AND_2PT1,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "License of Python 1.6b1 through 2.0 and 2.1",
   :vaem/acronym "PythonOld",
   :vaem/description
   "This is a free software license but is incompatible with the GNU GPL. The primary incompatibility is that this Python license is governed by the laws of the State of Virginia, in the USA, and the GPL does not permit this.",
   :voag/url {:xsd/anyURI
              "http://www.handle.net/python_licenses/python1.6_9-5-00.html"}})

(def PYTHON_LICENSE_V2PT0PT1_AND_OTHERS
  {:db/ident :voag/PYTHON_LICENSE_V2PT0PT1_AND_OTHERS,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "License of Python 2.0.1, 2.1.1, and newer versions",
   :vaem/acronym "Python",
   :vaem/description
   "This is a free software license and is compatible with the GNU GPL. Please note, however, that intermediate versions of Python (1.6b1, through 2.0 and 2.1) are under a different license.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.python.org/2.0.1/license.html"}})

(def Party
  {:db/ident        :voag/Party,
   :rdf/type        :owl/Class,
   :rdfs/label      "Party",
   :rdfs/subClassOf #{{:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/name,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/id,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/shortDescription,
                       :rdf/type           :owl/Restriction}}})

(def Pedigree
  {:db/ident :voag/Pedigree,
   :rdf/type :owl/Class,
   :rdfs/label "Pedigree",
   :rdfs/subClassOf #{{:owl/allValuesFrom :voag/Accredidation,
                       :owl/onProperty    :voag/hasAccredidation,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/usage,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/hasAccredidation,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :voag/Maturity,
                       :owl/onProperty    :voag/hasMaturity,
                       :rdf/type          :owl/Restriction} :voag/Qualifier
                      {:owl/allValuesFrom :voag/Party,
                       :owl/onProperty    :voag/usedBy,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/hasMaturity,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/shortDescription,
                       :rdf/type           :owl/Restriction}},
   :vaem/definition
   "Pedigree captures aspects of an artifact that have to do with maturity, quality, salience, and accredidation.",
   :voag/shortDescription
   "The origin or source of something. The primary purpose of provenance is to capture the time, place, and if appropriate the person responsible, for the creation, production or provisioning of some information object."})

(def Person
  {:db/ident        :voag/Person,
   :rdf/type        :owl/Class,
   :rdfs/label      "Person",
   :rdfs/subClassOf :voag/Party})

(def PriorityValue
  {:db/ident        :voag/PriorityValue,
   :rdf/type        :owl/Class,
   :rdfs/label      "Priority value",
   :rdfs/subClassOf :voag/EnumeratedValue})

(def ProcessClass
  {:db/ident        :voag/Process,
   :rdf/type        :owl/Class,
   :rdfs/label      "Process",
   :rdfs/subClassOf #{:owl/Thing
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/name,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/longDescription,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/id,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/shortDescription,
                       :rdf/type           :owl/Restriction}}})

(def ProductLogo
  {:db/ident         :voag/ProductLogo,
   :rdf/type         :owl/Class,
   :rdfs/label       "Product logo",
   :rdfs/subClassOf  :voag/Logo,
   :vaem/description "Product logo is used for products, solutions, etc."})

(def Proposed
  {:db/ident   :voag/Proposed,
   :rdf/type   :voag/Maturity,
   :rdfs/label "Proposed"})

(def Provenance
  {:db/ident :voag/Provenance,
   :rdf/type :owl/Class,
   :rdfs/label "Provenance",
   :rdfs/subClassOf #{{:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/lastUpdated,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :voag/ChangeType,
                       :owl/onProperty    :voag/hasChangeType,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/hasPedigree,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :voag/GovernedObject,
                       :owl/onProperty    :voag/supercededBy,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/revision,
                       :rdf/type           :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :voag/source,
                       :rdf/type        :owl/Restriction}
                      {:owl/allValuesFrom :voag/GovernedObject,
                       :owl/onProperty    :voag/supercedes,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :voag/Pedigree,
                       :owl/onProperty    :voag/hasPedigree,
                       :rdf/type          :owl/Restriction} :voag/Qualifier
                      {:owl/minCardinality 0,
                       :owl/onProperty     :voag/basedOn,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :voag/Party,
                       :owl/onProperty    :voag/source,
                       :rdf/type          :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :voag/timestamp,
                       :rdf/type        :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/shortDescription,
                       :rdf/type           :owl/Restriction}},
   :vaem/definition
   "Provenance specifies the origin or source of some artifact. The primary purpose of provenance is to capture the time, place, and if appropriate the person responsible, for the creation, production or provisioning of The artifact. Provenance also captures a record of how a version may have been superceded by another version of the artifact.",
   :voag/shortDescription
   "The origin or source of something. The primary purpose of provenance is to capture the time, place, and if appropriate the person responsible, for the creation, production or provisioning of some information object."})

(def PublicationStatus
  {:db/ident        :voag/PublicationStatus,
   :rdf/type        :owl/Class,
   :rdfs/label      "Publication Status",
   :rdfs/subClassOf :voag/EnumeratedValue})

(def QPL_LICENSE_V1PT0
  {:db/ident :voag/QPL_LICENSE_V1PT0,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Q Public License (QPL), Version 1.0",
   :vaem/acronym "QPL",
   :vaem/description
   "This is a non-copyleft free software license which is incompatible with the GNU GPL. It also causes major practical inconvenience, because modified sources can only be distributed as patches. GNU recommend that you avoid using the QPL for anything that you write, and use QPL-covered software packages only when absolutely necessary. However, this avoidance no longer applies to Qt itself, since Qt is now also released under the GNU GPL. Since the QPL is incompatible with the GNU GPL, you cannot take a GPL-covered program and QPL-covered program and link them together, no matter how.  However, if you have written a program that uses QPL-covered library (called FOO), and you want to release your program under the GNU GPL, you can easily do that, see GNU for more details.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://doc.trolltech.com/3.0/license.html"}})

(def Qualifier
  {:db/ident        :voag/Qualifier,
   :rdf/type        :owl/Class,
   :rdfs/label      "Qualifier",
   :rdfs/subClassOf #{:owl/Thing
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/name,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/longDescription,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/id,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/shortDescription,
                       :rdf/type           :owl/Restriction}}})

(def Quarterly
  {:db/ident   :voag/Quarterly,
   :rdf/type   :voag/ChangeFrequency,
   :rdfs/label "Quarterly"})

(def RDFIcon-32X35
  {:db/ident :voag/RDFIcon-32X35,
   :rdf/type :voag/Icon,
   :rdfs/label "RDF Icon 32 X 35",
   :vaem/description "RDF Standard",
   :voag/caption "RDF Standard ICON",
   :voag/height "35",
   :voag/image
   {:xsd/anyURI
    "http://www.linkedmodel.org/lib/lm/images/icons/rdf_w3c_icon.48.gif"},
   :voag/width "32"})

(def RPL
  {:db/ident :voag/RPL,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Reciprocal Public License",
   :vaem/acronym "RPL",
   :vaem/description
   "The Reciprocal Public License is a non-free license because of three problems. 1. It puts limits on prices charged for an initial copy. 2. It requires notification of the original developer for publication of a modified version. 3. It requires publication of any modified version that an organization uses, even privately.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.opensource.org/licenses/rpl.php"}})

(def RPSL_V1PT0
  {:db/ident :voag/RPSL_V1PT0,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "RealNetworks Public Source License (RPSL), Version 1.0",
   :vaem/acronym "RPSL",
   :vaem/description
   "The RPSL is a free software license that is GPL-incompatible for a number of reasons: it requires that derivative works be licensed under the terms of the RPSL, and mandates that any litigation take place in Seattle, Washington.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.opensource.org/licenses/real.php"}})

(def RUBY_LICENSE
  {:db/ident :voag/RUBY_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "License of Ruby",
   :vaem/acronym "RUBY",
   :vaem/description
   "This is a free software license, compatible with the GPL via an explicit dual-licensing clause. Ruby is copyrighted free software by Yukihiro Matsumoto <matz@netlab.co.jp>.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.ruby-lang.org/en/LICENSE.txt"}})

(def RefactoringChange
  {:db/ident   :voag/RefactoringChange,
   :rdf/type   :voag/ChangeType,
   :rdfs/label "Refactoring change"})

(def RejectionEvent
  {:db/ident         :voag/RejectionEvent,
   :rdf/type         :owl/Class,
   :rdfs/label       "Rejection Event",
   :rdfs/subClassOf  :voag/Event,
   :vaem/description "A \"Governance Event\".",
   :voag/shortDescription "A \"Governance Event\"."})

(def ResolvedIssue
  {:db/ident    :voag/ResolvedIssue,
   :dtype/value {:xsd/string "resolved"},
   :rdf/type    :voag/IssueStatus,
   :rdfs/label  "Resolved"})

(def RetreivalEvent
  {:db/ident         :voag/RetreivalEvent,
   :rdf/type         :owl/Class,
   :rdfs/label       "Retreival Event",
   :rdfs/subClassOf  :voag/Event,
   :vaem/description "A \"Archival Event\".",
   :voag/shortDescription "A \"Archival Event\"."})

(def ReviewEvent
  {:db/ident         :voag/ReviewEvent,
   :rdf/type         :owl/Class,
   :rdfs/label       "Review",
   :rdfs/subClassOf  #{:voag/GovernanceEvent
                       {:owl/allValuesFrom :voag/Organization,
                        :owl/onProperty    :voag/performedBy,
                        :rdf/type          :owl/Restriction}},
   :vaem/description "A \"Governance Event\".",
   :voag/shortDescription "A \"Governance Event\"."})

(def SGI_FREE_SOFTWARE_LICENSE_B_V2PT0
  {:db/ident :voag/SGI_FREE_SOFTWARE_LICENSE_B_V2PT0,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "SGI Free Software License B, version 2.0",
   :rdfs/seeAlso :voag/X11_LICENSE,
   :vaem/acronym "SGIFreeB",
   :vaem/description
   "The SGI Free Software License B version 2.0 is a free software license. It is essentially identical to the X11 License, with an optional alternative way of providing license notices. Previous versions of the SGI Free Software License B were not free software licenses, despite their name. However, they all included clauses that allow you to upgrade to new versions of the license, if you choose to do so. As a result, if a piece of software was released under any version of the SGI Free License B, you can use it under the terms of this free version.",
   :voag/url {:xsd/anyURI "http://oss.sgi.com/projects/FreeB/"}})

(def SIL-OFL_V1PT1
  {:db/ident :voag/SIL-OFL_V1PT1,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "SIL Open Font License 1.1",
   :vaem/acronym "SILOFL",
   :vaem/description
   "The Open Font License (including its original release, version 1.0) is a free copyleft license for fonts. Its only unusual requirement is that fonts be distributed with some computer program, rather than alone. Since a simple Hello World program will satisfy the requirement, it is harmless. Neither GNU nor SIL recommend the use of this license for anything other than fonts.",
   :voag/url {:xsd/anyURI "http://scripts.sil.org/OFL_web"}})

(def SISSL_V1PT0
  {:db/ident :voag/SISSL_V1PT0,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Sun Industry Standards Source License 1.0",
   :vaem/acronym "SISSL",
   :vaem/description
   "This is a free software license, not a strong copyleft, which is incompatible with the GNU GPL because of details rather than any major policy.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI
              "http://www.openoffice.org/licenses/sissl_license.html"}})

(def SML
  {:db/ident :voag/SML,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Simple Machines License",
   :vaem/acronym "SML",
   :vaem/description
   "Despite the name, this is a software license, and it's non-free for several reasons: (1) You must get the licensor's permission before distributing the software; (2) You cannot sell copies of the software; (3) It's possible that your license can be terminated if you received the software from someone who did not obey the license's terms.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.simplemachines.org/about/license.php"}})

(def SPARQLIcon-80X15
  {:db/ident :voag/SPARQLIcon-80X15,
   :rdf/type :voag/Icon,
   :rdfs/label "SPARQL ICON 80 X 15",
   :vaem/description "SPARQL Standard",
   :voag/caption "SPARQL Standard ICON",
   :voag/height "15",
   :voag/image
   {:xsd/anyURI
    "http://www.linkedmodel.org/lib/lm/images/icons/sw-sparql-blue.png"},
   :voag/width "80"})

(def SPL
  {:db/ident :voag/SPL,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Sun Public License",
   :rdfs/seeAlso :voag/MPL,
   :vaem/acronym "SPL",
   :vaem/description
   "This is essentially the same as the Mozilla Public License: a free software license incompatible with the GNU GPL. Do not confuse this with the Sun Community Source License which is not a free software license.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://java.sun.com/spl.html"}})

(def STANDARD_ML_OF_NJ_LICENSE
  {:db/ident :voag/STANDARD_ML_OF_NJ_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Standard ML of New Jersey Copyright License",
   :vaem/acronym "StandardMLofNJ",
   :vaem/description
   "This is a simple, permissive non-copyleft free software license, compatible with the GNU GPL.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI
              "http://cm.bell-labs.com/cm/cs/what/smlnj/license.html"}})

(def SYSTEMC_V3PT0
  {:db/ident :voag/SYSTEMC_V3PT0,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "SystemC \"Open Source\" License, Version 3.0",
   :vaem/acronym "SystemC-3.0",
   :vaem/description
   "This license requires all recipients to proactively help the licensor enforce its trademarks. This is an unreasonable condition to place on users' rights, so the license is non-free. It also has other practical problems: some of the requirements are vague, and it uses the term “intellectual property”.",
   :voag/url {:xsd/anyURI "http://www.systemc.org/about/org_docs/license/"}})

(def SchemaGraph
  {:db/ident        :voag/SchemaGraph,
   :rdf/type        :owl/Class,
   :rdfs/label      "Schema graph",
   :rdfs/subClassOf :voag/Graph})

(def Service
  {:db/ident        :voag/Service,
   :rdf/type        :owl/Class,
   :rdfs/label      "Service",
   :rdfs/subClassOf #{:owl/Thing
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/name,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/longDescription,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/id,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/shortDescription,
                       :rdf/type           :owl/Restriction}}})

(def SomeAdoption
  {:db/ident   :voag/SomeAdoption,
   :rdf/type   :voag/Maturity,
   :rdfs/label "Some adoption"})

(def StakeholderGroup
  {:db/ident :voag/StakeholderGroup,
   :owl/equivalentClass {:owl/onProperty     :voag/hasStakeholder,
                         :owl/someValuesFrom :voag/Person,
                         :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/label "Stakeholder Group",
   :rdfs/subClassOf #{{:owl/allValuesFrom :voag/Person,
                       :owl/onProperty    :voag/hasStakeholder,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :voag/hasStakeholder,
                       :rdf/type           :owl/Restriction} :voag/Party},
   :vaem/description
   "A Stakeholder Group is a party of people who have common interests and concerns.",
   :voag/shortDescription
   "A Stakeholder Group is a party of people who have common interests and concerns."})

(def Standard
  {:db/ident         :voag/Standard,
   :rdf/type         :owl/Class,
   :rdfs/label       "Standard",
   :rdfs/subClassOf  #{:voag/GovernedObject
                       {:owl/maxCardinality 1,
                        :owl/onProperty     :voag/hasLogo,
                        :rdf/type           :owl/Restriction}
                       {:owl/allValuesFrom :voag/Icon,
                        :owl/onProperty    :voag/hasLogo,
                        :rdf/type          :owl/Restriction}},
   :vaem/description "An industry, de facto or de jure standard"})

(def TopQuadrantAttribution
  {:db/ident            :voag/TopQuadrantAttribution,
   :rdf/type            :voag/Attribution,
   :rdfs/label          "TopQuadrant attribution",
   :vaem/name           "TopQuadrant, Inc.",
   :voag/hasLogo        :voag/TopQuadrantLogo-613x150,
   :voag/pointOfContact "Ralph Hodgson, TopQuadrant, Inc.",
   :voag/url            {:xsd/anyURI "http://www.topquadrant.com"}})

(def TopQuadrantLogo-613x150
  {:db/ident :voag/TopQuadrantLogo-613x150,
   :rdf/type #{:voag/AttributionLogo :voag/OrganizationLogo},
   :rdfs/label "TopQuadrant Logo 613 x 150",
   :vaem/description
   "TopQuadrant's logo - diamond with company name to the right",
   :voag/height "150",
   :voag/image
   {:xsd/anyURI
    "http://www.linkedmodel.org/lib/lm/images/logos/TQ_logo_C_2009_SM_print.jpg"},
   :voag/width "613"})

(def TurtleIcon-32bX35
  {:db/ident :voag/TurtleIcon-32bX35,
   :rdf/type :voag/Icon,
   :rdfs/label "Turtle Icon 32 X 35",
   :vaem/description "Turtle is a representation format for RDF/OWL.",
   :voag/caption "Turtle ICON",
   :voag/height "35",
   :voag/image
   {:xsd/anyURI
    "http://www.linkedmodel.org/lib/lm/images/icons/turtle_icon_32x35.jpg"},
   :voag/width "32"})

(def UNICODE_LICENSE
  {:db/ident :voag/UNICODE_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Unicode, Inc. License Agreement for Data Files and Software",
   :vaem/acronym "Unicode",
   :vaem/description
   "This is a license that Unicode, Inc. has applied to the Unicode Character Database—various data files that developers can use to help implement the Unicode standard in their own programs. It is a simple permissive license, compatible with all versions of the GPL. If you want to use files covered by this License Agreement in your own software, that shouldn't be any problem, but we recommend that you also include a full copy of its text. Some of the files contain alternative license terms which are nonfree, or no licensing information at all, so including a copy of the License Agreement will help avoid confusion when others want to distribute your software. Of course, you'll also need to follow the conditions in this License Agreement for distributing the files, but those are very straightforward.  Take care to ensure that the files you are using are covered by this License Agreement. Other files published by Unicode, Inc. are covered by the Unicode Terms of Use, a different, nonfree license that appears on the same page but covers different files. A short explanation at the top of this License Agreement details which files it covers. Do not use this License Agreement for your own software. If you want to use a simple permissive license for your project, please use the Expat license; it is by far more common, and widely recognized in the free software community.",
   :voag/url {:xsd/anyURI "http://www.unicode.org/copyright.html#Exhibit1"}})

(def UNLICENSE
  {:db/ident :voag/UNLICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "The Unlicense",
   :vaem/acronym "Unlicense",
   :vaem/description
   "The Unlicense is a public domain dedication. A work released under the Unlicense is dedicated to the public domain to the fullest extent permitted by law, and also comes with an additional simple license that helps cover any cases where the dedication is inadequate. Both public domain works and the simple license provided by the Unlicense are compatible with the GNU GPL. If you want to release your work to the public domain, we recommend you use CC0. CC0 also provides a public domain dedication with a fallback license, and is more thorough and mature than the Unlicense.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://unlicense.org/"}})

(def UncertainFrequency
  {:db/ident   :voag/UncertainFrequency,
   :rdf/type   :voag/ChangeFrequency,
   :rdfs/label "Uncertain frequency"})

(def UnknownMaturity
  {:db/ident   :voag/UnknownMaturity,
   :rdf/type   :voag/Maturity,
   :rdfs/label "Unknown maturity"})

(def UtahPublicLicense
  {:db/ident :voag/UtahPublicLicense,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "University of Utah Public License",
   :vaem/acronym "UtahPublicLicense",
   :vaem/description
   "The University of Utah Public License is a non-free license because it does not allow commercial redistribution. It also purports to restrict commercially running the software and even commercially giving consultation about it. Those restrictions are probably not legally enforceable under US copyright law, but they might be in some countries.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.cs.utah.edu/~gk/teem/txt/LICENSE.txt"}})

(def VIM_LICENSE_V6PT1_OR_LATER
  {:db/ident :voag/VIM_LICENSE_V6PT1_OR_LATER,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "License of Vim, Version 6.1 or later",
   :vaem/acronym "Vim",
   :vaem/description
   "This is a free software license, partially copyleft but not really. It is compatible with the GPL, by an explicit conversion clause.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.gnu.org/licenses/vim-license.txt"}})

(def VOAG-OntologyLogo_360x110
  {:db/ident :voag/VOAG-OntologyLogo_360x110,
   :rdf/type :voag/ProductLogo,
   :rdfs/label "VOAG Logo",
   :voag/caption "VOAG Logo",
   :voag/height "110",
   :voag/image
   {:xsd/anyURI
    "http://www.linkedmodel.org/lib/lm/images/logos/voag_logo_360x110.png"},
   :voag/width "360"})

(def VocabGraph
  {:db/ident        :voag/VocabGraph,
   :rdf/type        :owl/Class,
   :rdfs/label      "Vocab graph",
   :rdfs/subClassOf :voag/Graph})

(def W3C_SOFTWARE_LICENSE
  {:db/ident :voag/W3C_SOFTWARE_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "W3C Software Notice and License",
   :vaem/acronym "W3C",
   :vaem/description "This is a free software license and is GPL compatible.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/url
   {:xsd/anyURI
    "http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231"}})

(def WEBM_LICENSE
  {:db/ident :voag/WEBM_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "License of WebM",
   :vaem/acronym "WebM",
   :vaem/description
   "Google's WebM implementation is covered by the Modified BSD License. Google also provides a separate patent license (confusingly called an “Additional IP Rights Grant”) for patents that Google owns or controls that are necessarily infringed by their implementation of WebM. GPL-covered software can be distributed in compliance with this license's terms: it allows distributors to exercise all of the rights granted by the GPL, while fulfilling all its conditions. Thus, all of WebM's license is free and GPL-compatible. Like most BSD licenses, this license allows you to use the VP8 code with a minimum of restrictions on your use. You can use the code in proprietary software as well as open source software.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.webmproject.org/license/"}})

(def WTFPL_V2
  {:db/ident :voag/WTFPL_V2,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "WTFPL, Version 2",
   :vaem/acronym "WTFPL",
   :vaem/description
   "This is a free software license, very permissive and GPL-compatible.",
   :voag/url {:xsd/anyURI "http://sam.zoy.org/wtfpl/COPYING"}})

(def Weekly
  {:db/ident   :voag/Weekly,
   :rdf/type   :voag/ChangeFrequency,
   :rdfs/label "Weekly"})

(def WidelyAdopted
  {:db/ident   :voag/WidelyAdopted,
   :rdf/type   :voag/Maturity,
   :rdfs/label "Widely adopted"})

(def X11_LICENSE
  {:db/ident :voag/X11_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "X11 License",
   :vaem/acronym "X11License",
   :vaem/description
   "This is a simple, permissive non-copyleft free software license, compatible with the GNU GPL. Older versions of XFree86 used the same license, and some of the current variants of XFree86 also do. Later versions of XFree86 are distributed under the XFree86 1.1 license. This license is sometimes called the MIT license, but that term is misleading, since MIT has used many licenses for software.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.xfree86.org/3.3.6/COPYRIGHT2.html#3"}})

(def XFREE86_LICENSE_V1PT1
  {:db/ident :voag/XFREE86_LICENSE_V1PT1,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "XFree86 1.1 License",
   :vaem/acronym "XFree861.1License",
   :vaem/description
   "This is a simple, permissive non-copyleft free software license, compatible with version 3 of the GPL. Note that this license is incompatible with version 2 of the GPL, because of its requirements that apply to all documentation in the distribution that contain acknowledgements. There are currently several variants of XFree86, and only some of them use this license. Some continue to use the X11 license.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.xfree86.org/current/LICENSE4.html"}})

(def XINETD_LICENSE
  {:db/ident :voag/XINETD_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "License of xinetd",
   :vaem/acronym "xinetd",
   :vaem/description
   "This is a copyleft free software license, incompatible with the GPL. It is incompatible because it places extra restrictions on redistribution of modified versions that contradict the redistribution requirements in the GPL.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI
              "http://fedoraproject.org/wiki/Licensing/Xinetd_License"}})

(def YAHOO_PUBLIC_LICENSE_V1PT0
  {:db/ident :voag/YAHOO_PUBLIC_LICENSE_V1PT0,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Yahoo! Public License 1.0",
   :vaem/acronym "Yahoo",
   :vaem/description
   "This is a free software license. It has a copyleft similar to the one found in the Mozilla Public License. It also has a choice of law clause in section 7. These features both make the license GPL-incompatible. The license also unfortunately uses the term “intellectual property”.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/url
   {:xsd/anyURI
    "http://info.yahoo.com/legal/us/yahoo/publiclicense/publiclicense-1813.html"}})

(def ZEND_LICENSE_V2PT0
  {:db/ident :voag/ZEND_LICENSE_V2PT0,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Zend License, Version 2.0",
   :vaem/acronym "Zend",
   :vaem/description
   "This license is used by one part of PHP4. It is a non-copyleft free software license which is incompatible with the GNU GPL, and has practical problems like those of the original BSD license. GNU recommend that you not use this license for anything you write.",
   :voag/url {:xsd/anyURI "http://www.zend.com/license/2_00.txt"}})

(def ZLIB_LICENSE
  {:db/ident :voag/ZLIB_LICENSE,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "License of ZLib",
   :vaem/acronym "ZLib",
   :vaem/description
   "This is a free software license, and compatible with the GPL.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/url {:xsd/anyURI "http://www.gzip.org/zlib/zlib_license.html"}})

(def ZOPE_PUBLICE_LICENSE_V1
  {:db/ident :voag/ZOPE_PUBLICE_LICENSE_V1,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Zope Public License version 1",
   :rdfs/seeAlso :voag/ZOPE_PUBLIC_LICENSE_V2PT0,
   :vaem/acronym "Zope",
   :vaem/description
   "This is a simple, fairly permissive non-copyleft free software license with practical problems like those of the original BSD license, including incompatibility with the GNU GPL. GNU urge you not to use the ZPL version 1 for software you write. However, there is no reason to avoid running programs that have been released under this license, such as previous versions of Zope. Version 2.0 of the Zope Public License is GPL-compatible.",
   :voag/incompatibleWith :voag/GNU-GPL_V3,
   :voag/supercededBy :voag/ZOPE_PUBLIC_LICENSE_V2PT0,
   :voag/url {:xsd/anyURI "http://www.zope.org/Resources/ZPL"}})

(def ZOPE_PUBLIC_LICENSE_V2PT0
  {:db/ident :voag/ZOPE_PUBLIC_LICENSE_V2PT0,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Zope Public License, versions 2.0",
   :vaem/acronym "Zope20",
   :vaem/description
   "This is a simple, permissive non-copyleft free software license which is compatible with the GNU GPL.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/supercedes :voag/ZOPE_PUBLICE_LICENSE_V1,
   :voag/url {:xsd/anyURI "http://www.zope.org/Resources/ZPL"}})

(def ZOPE_PUBLIC_LICENSE_V2PT1
  {:db/ident :voag/ZOPE_PUBLIC_LICENSE_V2PT1,
   :rdf/type :voag/LicenseModel,
   :rdfs/label "Zope Public License, versions 2.1",
   :vaem/acronym "Zope20",
   :vaem/description
   "This is a simple, permissive non-copyleft free software license which is compatible with the GNU GPL.",
   :voag/compatibleWith :voag/GNU-GPL_V3,
   :voag/supercedes :voag/ZEND_LICENSE_V2PT0,
   :voag/url {:xsd/anyURI "http://www.zope.org/Resources/ZPL"}})

(def accountableEntityOf
  {:db/ident :voag/accountableEntityOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "accountable entity of",
   :vaem/description
   "A reference to who or which organization is accountable for an entity.",
   :voag/shortDescription
   "A reference to who or which organization is accountable for an entity."})

(def accountableFor
  {:db/ident :voag/accountableFor,
   :owl/inverseOf :voag/accountableEntityOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "accountable for",
   :vaem/description
   "An object property used in governance that refers a resource to the party that is accountable for it."})

(def approves
  {:db/ident :voag/approves,
   :owl/inverseOf :voag/isApprovedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "approves",
   :rdfs/subPropertyOf :voag/governs,
   :vaem/description
   "An object property that specifies that a party governs the approval of a resource.",
   :voag/shortDescription
   "An object property that specifies that a party governs the approval of a resource."})

(def attributionText
  {:db/ident   :voag/attributionText,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "attribution text",
   :rdfs/range :xsd/string})

(def basedOn
  {:db/ident   :voag/basedOn,
   :rdf/type   :rdf/Property,
   :rdfs/label "based on"})

(def caption
  {:db/ident :voag/caption,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "caption",
   :rdfs/range :xsd/string,
   :vaem/description
   "A short description, typically used on a table or a figure."})

(def compatibleWith
  {:db/ident   :voag/compatibleWith,
   :rdf/type   #{:owl/SymmetricProperty :owl/ObjectProperty},
   :rdfs/label "compatible with"})

(def curatedGraphURI
  {:db/ident :voag/curatedGraphURI,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "curated graph URI",
   :rdfs/range :xsd/anyURI,
   :vaem/definition
   "The property 'voag:curatedGraphURI' provides a means to specify the base URI of the specific version of the onotlogy that is being documented.  In each versioned graph the 'vaem:namespace' carries a URI without a version number."})

(def deprecated
  {:db/ident    :voag/deprecated,
   :rdf/type    #{:rdf/Property :owl/AnnotationProperty},
   :rdfs/domain :voag/LicenseModel,
   :rdfs/label  "deprecated on",
   :rdfs/range  :vaem/dateUnion})

(def description
  {:db/ident   :voag/description,
   :rdf/type   :owl/AnnotationProperty,
   :rdfs/label "description",
   :rdfs/range :xsd/string})

(def disposition
  {:db/ident :voag/disposition,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "used to connect to the text describing disposition of something, for example, a disposition of an issue",
   :rdfs/label "disposition",
   :rdfs/range :xsd/string})

(def dispositionStatus
  {:db/ident :voag/dispositionStatus,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "disposition status",
   :rdfs/subPropertyOf :voag/hasApprovalStatus,
   :vaem/description
   "An object propoert that denotes the state of a governance issue.",
   :voag/shortDescription
   "An object propoert that denotes the state of a governance issue."})

(def documentedAt
  {:db/ident :voag/documentedAt,
   :rdf/type :rdf/Property,
   :rdfs/label "documented at",
   :vaem/definition
   "The property 'vaem:documentedAt' is intended for general use as the name implies.  In some cases the property could have scalar values and in other cases may need to refer to a first class concept that holds more information about a documentation resource.  For this reason, the  type of this property is set as 'rdf:Property' and the property is rangeless."})

(def downloads
  {:db/ident   :voag/downloads,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "downloads",
   :rdfs/range :xsd/integer})

(def endDate
  {:db/ident   :voag/endDate,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "end date",
   :rdfs/range :vaem/dateUnion})

(def eventDate
  {:db/ident   :voag/eventDate,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "event date",
   :rdfs/range :vaem/dateUnion})

(def exclude
  {:db/ident   :voag/exclude,
   :rdf/type   :owl/AnnotationProperty,
   :rdfs/label "exclude",
   :rdfs/range :xsd/boolean})

(def frequencyOfChange
  {:db/ident   :voag/frequencyOfChange,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "frequency of change"})

(def givesConcurrenceFor
  {:db/ident :voag/givesConcurrenceFor,
   :owl/inverseOf :voag/mayNeedConcurrenceFrom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "gives concurrence for",
   :rdfs/subPropertyOf :voag/governs,
   :vaem/description
   "An object property that specifies what a party may need to give consent, in the form of agreement, either written or verbally for in the approval of some govenance concern. This is the inverse property of 'mayNeedConcurrenceFrom' and, as such, may be deprecated in the future.",
   :voag/shortDescription
   "An object property that specifies what a party may need to give consent, in the form of agreement, either written or verbally for in the approval of some govenance concern. This is the inverse property of 'mayNeedConcurrenceFrom' and, as such, may be deprecated in the future."})

(def governs
  {:db/ident :voag/governs,
   :owl/inverseOf :voag/isGovernedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "governs",
   :vaem/description
   "A super-property of governance properties: 'approves', 'gives concurrence for', 'reviews' and 'witness to'.",
   :voag/shortDescription
   "A super-property of governance properties: 'approves', 'gives concurrence for', 'reviews' and 'witness to'."})

(def hasAccredidation
  {:db/ident   :voag/hasAccredidation,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "has accredidation"})

(def hasAnticipatedChangeType
  {:db/ident   :voag/hasAnticipatedChangeType,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "has anticipated change type"})

(def hasApplicableDocument
  {:db/ident :voag/hasApplicableDocument,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has applicable document",
   :vaem/description
   "A document that is of help to application of the subject matter. Documents include specifications, models, standards, guidelines, handbooks and other special publications.",
   :voag/shortDescription
   "A document that is of help to application of the subject matter. Documents include specifications, models, standards, guidelines, handbooks and other special publications."})

(def hasApprovalProcess
  {:db/ident :voag/hasApprovalProcess,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has approval process",
   :vaem/description
   "An object property that specifies a process that is used for approval in a 'Governance Protocol'.",
   :voag/shortDescription
   "An object property that specifies a process that is used for approval in a 'Governance Protocol'."})

(def hasApprovalStatus
  {:db/ident :voag/hasApprovalStatus,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has approval status",
   :vaem/description
   "An object property that referes to an enumerated value that denotes the state of an approval.",
   :voag/shortDescription
   "An object property that referes to an enumerated value that denotes the state of an approval."})

(def hasCatalogEntry
  {:db/ident   :voag/hasCatalogEntry,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "has catalog entry"})

(def hasCategory
  {:db/ident   :voag/hasCategory,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "has category"})

(def hasChangeManagementProcess
  {:db/ident :voag/hasChangeManagementProcess,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has change management process",
   :rdfs/subPropertyOf :voag/hasProcess,
   :vaem/description
   "An object property that specifies a process that is used for managing change in a 'Governance Protocol'.",
   :voag/shortDescription
   "An object property that specifies a process that is used for managing change in a 'Governance Protocol'."})

(def hasChangeType
  {:db/ident   :voag/hasChangeType,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "has change type"})

(def hasConfidentiality
  {:db/ident :voag/hasConfidentiality,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has confidentiality",
   :vaem/description
   "An object property that specifies a level of confidentiality. Typicall the range of this property will be 'voag:Confidentiality'.",
   :voag/shortDescription
   "An object property that specifies a level of confidentiality. Typicall the range of this property will be 'voag:Confidentiality'."})

(def hasGovernance
  {:db/ident   :voag/hasGovernance,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "has governance"})

(def hasGovernanceEvent
  {:db/ident         :voag/hasGovernanceEvent,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/label       "has governance event",
   :vaem/description "An event associated with governance processes.",
   :voag/shortDescription "An event associated with governance processes."})

(def hasIdentifier
  {:db/ident   :voag/hasIdentifier,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "has identifier"})

(def hasIssue
  {:db/ident :voag/hasIssue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has issue",
   :rdfs/range :voag/Issue,
   :vaem/description
   "A pointer to an issue that exists on a subject of interest.",
   :voag/shortDescription
   "A pointer to an issue that exists on a subject of interest."})

(def hasIssueResolutionProcess
  {:db/ident           :voag/hasIssueResolutionProcess,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "has issue resolution process",
   :rdfs/subPropertyOf :voag/hasProcess})

(def hasLicenseType
  {:db/ident    :voag/hasLicenseType,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :voag/CreativeCommonsWork,
   :rdfs/label  {:rdf/language "en-US",
                 :rdf/value    "has license type"},
   :rdfs/range  :voag/LicenseModel})

(def hasLogo
  {:db/ident :voag/hasLogo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has logo",
   :rdfs/range :voag/Logo,
   :vaem/description
   "A property to reference an image that is used as a logo."})

(def hasMaturity
  {:db/ident   :voag/hasMaturity,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "has maturity"})

(def hasNormativeDocument
  {:db/ident   :voag/hasNormativeDocument,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "has normative document"})

(def hasOntologyArchitectureDiagram
  {:db/ident   :voag/hasOntologyArchitectureDiagram,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "has ontology architecture diagram"})

(def hasOwner
  {:db/ident   :voag/hasOwner,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "has owner"})

(def hasPedigree
  {:db/ident :voag/hasPedigree,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has pedigree",
   :vaem/description
   "A reference to a description about the pedigree of something."})

(def hasProcess
  {:db/ident         :voag/hasProcess,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/label       "has process",
   :vaem/description "A reference to a process description.",
   :voag/shortDescription "A reference to a process description."})

(def hasProtocol
  {:db/ident :voag/hasProtocol,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has protocol",
   :vaem/description
   "A pointer to a record that holds governance information for one or more governed entities. Often governance can be shared across entities.",
   :voag/shortDescription
   "A pointer to a record that holds governance information for one or more governed entities. Often governance can be shared across entities."})

(def hasProvenance
  {:db/ident :voag/hasProvenance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has provenance",
   :vaem/description
   "A pointer to a provenance record that details the source, version and time of some subject of interest.",
   :voag/shortDescription
   "A pointer to a provenance record that details the source, version and time of some subject of interest."})

(def hasReferenceDocument
  {:db/ident   :voag/hasReferenceDocument,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "has reference document"})

(def hasStakeholder
  {:db/ident   :voag/hasStakeholder,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "has stakeholder"})

(def hasStatus
  {:db/ident   :voag/hasStatus,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "has status"})

(def hasSteward
  {:db/ident         :voag/hasSteward,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/label       "has steward",
   :vaem/description "A pointer to the person that is a curator.",
   :voag/shortDescription "A pointer to the person that is a curator."})

(def hasValue
  {:db/ident   :voag/hasValue,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "has value",
   :rdfs/range :rdfs/Resource})

(def height
  {:db/ident :voag/height,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "height",
   :rdfs/range :xsd/string,
   :vaem/description
   "Height is typically used to specify an image's height attribute."})

(def id
  {:db/ident   :voag/id,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "id",
   :rdfs/range :xsd/anySimpleType})

(def image
  {:db/ident :voag/image,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "image",
   :rdfs/range :xsd/anyURI,
   :vaem/description
   "The property 'vaem:image' points  to an image using a URL. "})

(def imageMap
  {:db/ident   :voag/imageMap,
   :rdf/type   :rdf/Property,
   :rdfs/label "image map"})

(def incompatibleWith
  {:db/ident   :voag/incompatibleWith,
   :rdf/type   #{:owl/SymmetricProperty :owl/ObjectProperty},
   :rdfs/label "incompatible with"})

(def instigatedBy
  {:db/ident   :voag/instigatedBy,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "instigated by"})

(def instigatingEvent
  {:db/ident   :voag/instigatingEvent,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "instigating event"})

(def intent
  {:db/ident   :voag/intent,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "intent",
   :rdfs/range :xsd/string})

(def interestIn
  {:db/ident      :voag/interestIn,
   :owl/inverseOf :voag/isInterestOf,
   :rdf/type      :owl/ObjectProperty,
   :rdfs/label    "interest in"})

(def isApprovedBy
  {:db/ident           :voag/isApprovedBy,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "is approved by",
   :rdfs/subPropertyOf :voag/isGovernedBy,
   :vaem/description   "References to which parties approve an entity.",
   :voag/shortDescription "References to which parties approve an entity."})

(def isFOSS
  {:db/ident :voag/isFOSS,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "is FOSS",
   :rdfs/range :xsd/boolean,
   :vaem/description
   "A boolean property to specify whether or not software is free or open source. Free and open-source software (F/OSS, FOSS) or free/libre/open-source software (FLOSS) is software that is liberally licensed to grant the right of users to use, study, change, and improve its design through the availability of its source code."})

(def isGovernedBy
  {:db/ident :voag/isGovernedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is governed by",
   :vaem/description
   "A pointer to who is responsible for the governance of some entity of interest. This is a two-way reference with the inverse property 'governs'.",
   :voag/shortDescription
   "A pointer to who is responsible for the governance of some entity of interest. This is a two-way reference with the inverse property 'governs'."})

(def isITAR
  {:db/ident :voag/isITAR,
   :rdf/type #{:owl/DeprecatedProperty :owl/DatatypeProperty},
   :rdfs/label "is ITAR",
   :rdfs/range :xsd/boolean,
   :vaem/description
   "International Traffic in Arms Regulations (ITAR) is a set of United States government regulations that control the export and import of defense-related articles and services on the United States Munitions List. These regulations implement the provisions of the Arms Export Control Act, and are described in Title 22 (Foreign Relations), Chapter I (Department of State), Subchapter M of the Code of Federal Regulations. The Department of State interprets and enforces ITAR. Its goal is to advance national strategic objectives and U.S. foreign policy via the trade controls. For practical purposes, ITAR regulations dictate that information and material pertaining to defense and military related technologies may only be shared with US Persons unless approval from the Department of State is received or a special exemption is used.",
   :voag/shortDescription
   "International Traffic in Arms Regulations (ITAR) is a set of United States government regulations that control the export and import of defense-related articles and services on the United States Munitions List. These regulations implement the provisions of the Arms Export Control Act, and are described in Title 22 (Foreign Relations), Chapter I (Department of State), Subchapter M of the Code of Federal Regulations. The Department of State interprets and enforces ITAR. Its goal is to advance national strategic objectives and U.S. foreign policy via the trade controls. For practical purposes, ITAR regulations dictate that information and material pertaining to defense and military related technologies may only be shared with US Persons unless approval from the Department of State is received or a special exemption is used."})

(def isInterestOf
  {:db/ident :voag/isInterestOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "interest of",
   :vaem/description
   "A pointer to parties who have an interest in an entity. This is a two-way reference with the inverse property 'interestIn'.",
   :voag/shortDescription
   "A pointer to parties who have an interest in an entity. This is a two-way reference with the inverse property 'interestIn'."})

(def jurisdiction
  {:db/ident    :voag/jurisdiction,
   :rdf/type    #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :voag/LicenseModel,
   :rdfs/label  #{{:rdf/language "en-US",
                   :rdf/value    "jurisdiction"} "jurisdiction"},
   :rdfs/range  :voag/CreativeCommonsJurisdiction})

(def legalcode
  {:db/ident    :voag/legalcode,
   :rdf/type    #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :voag/LicenseModel,
   :rdfs/label  "legalcode",
   :rdfs/range  :rdfs/Resource})

(def licence
  {:db/ident   :voag/licence,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "licence",
   :rdfs/range :xsd/string})

(def longDescription
  {:db/ident   :voag/longDescription,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "long description",
   :rdfs/range :xsd/string})

(def mayNeedConcurrenceFrom
  {:db/ident :voag/mayNeedConcurrenceFrom,
   :owl/inverseOf :voag/givesConcurrenceFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "may need concurrence from",
   :rdfs/subPropertyOf :voag/isGovernedBy,
   :vaem/description
   "An object property that specifies that a party may need to give consent, in the form of agreement, either written or verbally to the approval of some govenance concern.",
   :voag/shortDescription
   "An object property that specifies that a party may need to give consent, in the form of agreement, either written or verbally to the approval of some govenance concern."})

(def morePermissions
  {:db/ident    :voag/morePermissions,
   :rdf/type    #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :voag/CreativeCommonsWork,
   :rdfs/label  "more permissions",
   :rdfs/range  :rdfs/Resource})

(def normativeReference
  {:db/ident   :voag/normativeReference,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "normative reference"})

(def obsoletedBy
  {:db/ident   :voag/obsoletedBy,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "obsoleted by"})

(def ownedBy
  {:db/ident   :voag/ownedBy,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "owned by",
   :rdfs/range :xsd/string})

(def owner
  {:db/ident   :voag/owner,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "owner"})

(def owns
  {:db/ident   :voag/owns,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "owns"})

(def participant
  {:db/ident   :voag/participant,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "participant"})

(def performedBy
  {:db/ident   :voag/performedBy,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "performed by"})

(def permits
  {:db/ident    :voag/permits,
   :rdf/type    #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :voag/LicenseModel,
   :rdfs/label  #{{:rdf/language "en-US",
                   :rdf/value    "permits"} "permits"},
   :rdfs/range  :voag/CreativeCommonsPermission})

(def pointOfContact
  {:db/ident   :voag/pointOfContact,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "point of contact",
   :rdfs/range :xsd/string})

(def preparedBy
  {:db/ident           :voag/preparedBy,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "prepared by",
   :rdfs/subPropertyOf :voag/isGovernedBy})

(def priority
  {:db/ident   :voag/priority,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "priority"})

(def prohibits
  {:db/ident    :voag/prohibits,
   :rdf/type    #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :voag/LicenseModel,
   :rdfs/label  #{"prohibits"
                  {:rdf/language "en-US",
                   :rdf/value    "prohibits"}},
   :rdfs/range  :voag/CreativeCommonsProhibition})

(def proprietary
  {:db/ident :voag/proprietary,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "proprietary",
   :rdfs/range :xsd/boolean,
   :vaem/description
   "A boolean flag to indicate if an information asset is propretary.",
   :voag/shortDescription
   "A boolean flag to indicate if an information asset is propretary."})

(def relatedIssue
  {:db/ident :voag/relatedIssue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "This property connects two issue events. Issues connected by this property must be about the same subject",
   :rdfs/domain :voag/Issue,
   :rdfs/label "related issue",
   :rdfs/range :voag/Issue})

(def relatedTo
  {:db/ident   :voag/relatedTo,
   :rdf/type   #{:owl/SymmetricProperty :owl/ObjectProperty},
   :rdfs/label "related to"})

(def releaseDate
  {:db/ident   :voag/releaseDate,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "release date",
   :rdfs/range :vaem/dateUnion})

(def requires
  {:db/ident    :voag/requires,
   :rdf/type    #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :voag/LicenseModel,
   :rdfs/label  #{{:rdf/language "en-US",
                   :rdf/value    "requires"} "requires"},
   :rdfs/range  :voag/CreativeCommonsRequirement})

(def reviewedBy
  {:db/ident :voag/reviewedBy,
   :owl/inverseOf :voag/reviews,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "reviewed by",
   :rdfs/subPropertyOf :voag/isGovernedBy,
   :vaem/description
   "References to which parties review a data or information asset.",
   :voag/shortDescription
   "References to which parties review a data or information asset."})

(def reviews
  {:db/ident           :voag/reviews,
   :owl/inverseOf      :voag/reviewedBy,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "reviews",
   :rdfs/subPropertyOf :voag/governs})

(def revision
  {:db/ident   :voag/revision,
   :rdf/type   #{:owl/DatatypeProperty :owl/AnnotationProperty},
   :rdfs/label "revision",
   :rdfs/range :xsd/string})

(def revisionNumber
  {:db/ident   :voag/revisionNumber,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "revision number",
   :rdfs/range :xsd/string})

(def rights
  {:db/ident   :voag/rights,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "subject",
   :rdfs/range :xsd/string})

(def shortDescription
  {:db/ident   :voag/shortDescription,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "short description",
   :rdfs/range :xsd/string})

(def source
  {:db/ident   :voag/source,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "source"})

(def startDate
  {:db/ident   :voag/startDate,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "start date",
   :rdfs/range :vaem/dateUnion})

(def subject
  {:db/ident   :voag/subject,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "subject",
   :rdfs/range :xsd/string})

(def submittedBy
  {:db/ident           :voag/submittedBy,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "submitted by",
   :rdfs/subPropertyOf :voag/isGovernedBy})

(def supercededBy
  {:db/ident :voag/supercededBy,
   :owl/inverseOf :voag/supercedes,
   :rdf/type #{:owl/TransitiveProperty :owl/ObjectProperty},
   :rdfs/label "superceded by",
   :vaem/description
   "A pointer to one or more 'GovernedEntities' that replace this entity.",
   :voag/shortDescription
   "A pointer to one or more 'GovernedEntities' that are replaced by this entity."})

(def supercedes
  {:db/ident :voag/supercedes,
   :owl/inverseOf :voag/supercededBy,
   :rdf/type #{:owl/TransitiveProperty :owl/ObjectProperty},
   :rdfs/label "supercedes",
   :vaem/description
   "A pointer to one or more 'GovernedEntities' that are replaced by this entity.",
   :voag/shortDescription
   "A pointer to one or more 'GovernedEntities' that are replaced by this entity."})

(def supervisedBy
  {:db/ident           :voag/supervisedBy,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "supervised by",
   :rdfs/subPropertyOf :voag/isGovernedBy})

(def timestamp
  {:db/ident   :voag/timestamp,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "timestamp",
   :rdfs/range :xsd/dateTime})

(def title
  {:db/ident   :voag/title,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "title",
   :rdfs/range :xsd/string})

(def url
  {:db/ident   :voag/url,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "url",
   :rdfs/range :xsd/anyURI})

(def urlForHTML
  {:db/ident   :voag/urlForHTML,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "url for HTML",
   :rdfs/range :xsd/anyURI})

(def urlOfRDFfile
  {:db/ident :voag/urlOfRDFfile,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "url address of RDF file",
   :rdfs/range :xsd/anyURI,
   :vaem/description
   "Used to refer to a an RDF XML representation of an ontology"})

(def urlOfTurtleFile
  {:db/ident :voag/urlOfTurtleFile,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "url of turtle file",
   :rdfs/range :xsd/anyURI,
   :vaem/description
   "Used to refer to a Turtle (N3) representation of an ontology"})

(def usage
  {:db/ident   :voag/usage,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "usage",
   :rdfs/range :xsd/string})

(def useGuidelines
  {:db/ident    :voag/useGuidelines,
   :rdf/type    :rdf/Property,
   :rdfs/domain :voag/CreativeCommonsWork,
   :rdfs/label  "use guidelines",
   :rdfs/range  :rdfs/Resource})

(def usedBy
  {:db/ident :voag/usedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "used by",
   :vaem/description
   "The property 'usedBy' is a general property to record a dependency. One use is in stating how a schema or a vocabulary is used by another ontology graph."})

(def userID
  {:db/ident   :voag/userID,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "user ID",
   :rdfs/range :xsd/anySimpleType})

(def width
  {:db/ident :voag/width,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "width",
   :vaem/description
   "Width is typically used to specify an image's width attribute."})

(def withAttributionTo
  {:db/ident   :voag/withAttributionTo,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "with attribution to"})

(def witnessTo
  {:db/ident           :voag/witnessTo,
   :owl/inverseOf      :voag/witnessedBy,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "witness to",
   :rdfs/subPropertyOf :voag/governs})

(def witnessedBy
  {:db/ident           :voag/witnessedBy,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "wintnessed by",
   :rdfs/subPropertyOf :voag/isGovernedBy})