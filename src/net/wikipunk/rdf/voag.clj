(ns net.wikipunk.rdf.voag
  "Vocabulary Of Attribution and Governance"
  {:dcat/downloadURL
   "https://lov.linkeddata.es/dataset/lov/vocabs/voag/versions/2012-11-01.n3",
   :dcterms/author "Ralph Hodgson",
   :dcterms/subject "Licensing, Attribution and Governance",
   :dcterms/title "Vocabulary Of Attribution and Governance",
   :owl/imports ["http://www.w3.org/ns/20120724/prov"
                 "http://www.linkedmodel.org/1.2/schema/vaem-xics"
                 "http://www.linkedmodel.org/schema/vaem-xina"
                 "http://rdfs.org/ns/void"
                 "http://www.linkedmodel.org/schema/dtype"
                 "http://www.linkedmodel.org/schema/vaem"],
   :owl/versionIRI "http://voag.linkedmodel.org/schema/voag",
   :rdf/ns-prefix-map {"dcterms"  "http://purl.org/dc/elements/1.1/",
                       "dtype"    "http://www.linkedmodel.org/schema/dtype#",
                       "ontology" "http://omv.ontoware.org/2005/05/ontology#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "skos"     "http://www.w3.org/2004/02/skos/core#",
                       "vaem"     "http://www.linkedmodel.org/schema/vaem#",
                       "voag"     "http://voag.linkedmodel.org/voag#",
                       "void"     "http://rdfs.org/ns/void#",
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://voag.linkedmodel.org/schema/voag",
   :rdfa/prefix "voag",
   :rdfa/uri "http://voag.linkedmodel.org/voag#",
   :rdfs/label "Vocabulary Of Attribution and Governance",
   :vaem/dateCreated #inst "2011-01-31T15:00:00.000-00:00",
   :vaem/description
   "VOAG stands for \"Vocabulary Of Attribution and Governance\". The ontology is intended to specify licensing, attribution, provenance and governance of an ontology. VOAG captures many common license types and their restrictions. Where a license requires attribution, VOAG provides resources that allow the attribution should be made. Provenance is defined in terms of source and pedigree. A miminal model of governance is provided based on how issues, releases and changes are managed. VOAG does not import, but makes uses of some concepts from VOID (http://vocab.deri.ie/void), notably void:Dataset.",
   :vaem/hasCatalogEntry :voag/VOAG-CatalogEntry,
   :vaem/hasGraphRole :vaem/SchemaGraph,
   :vaem/lastUpdated #inst "2012-11-01T00:00:00.000-04:00",
   :vaem/name "VOAG",
   :vaem/namespace "http://voag.linkedmodel.org/voag",
   :vaem/namespacePrefix "voag",
   :vaem/revision "1.0",
   :vaem/url "http://voag.linkedmodel.org/1.0/owl/schema/voag",
   :vaem/usesNonImportedResource [:voag/TopQuadrantAttribution
                                  :dcterms/title
                                  :voag/VOAG-CatalogEntry
                                  :dcterms/subject
                                  :dcterms/contributor
                                  :dcterms/author
                                  :dcterms/description],
   :vaem/withAttributionTo :voag/TopQuadrantAttribution,
   :voag/intent
   "Provides a schema for intellectual capital rights, attribution and governance. Uses the PROVO ontology for provenance.  Typical use of the ontology is to refer to its resources, as opposed to importing the ontology."})

(def Accredidation
  "Accredidation"
  {:db/ident         :voag/Accredidation,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Accredidation",
   :rdfs/subClassOf  :voag/Qualifier})

(def AdministrativeEvent
  "An event that is associated with the admistration aspect of governance. Typically these are curation events."
  {:db/ident :voag/AdministrativeEvent,
   :dcterms/description
   "An event that is associated with the admistration aspect of governance. Typically these are curation events.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "Administrative Event",
   :rdfs/subClassOf :voag/Event})

(def Annually
  "Annually"
  {:db/ident         :voag/Annually,
   :dtype/value      "annual",
   :rdf/type         :voag/ChangeFrequency,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Annually"})

(def AppendChange
  "Append change"
  {:db/ident         :voag/AppendChange,
   :rdf/type         :voag/ChangeType,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Append change"})

(def ApprovalEvent
  "Approval Event"
  {:db/ident         :voag/ApprovalEvent,
   :owl/disjointWith :voag/RejectionEvent,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Approval Event",
   :rdfs/subClassOf  :voag/Event,
   :vaem/description "A \"Governance Event\"."})

(def ApprovalProcess
  "Approval Process"
  {:db/ident         :voag/ApprovalProcess,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Approval Process",
   :rdfs/subClassOf  :voag/GovernanceProcess,
   :vaem/description "A \"Governance Process\"."})

(def ApprovedIssue
  "Approved Issue"
  {:db/ident         :voag/ApprovedIssue,
   :dtype/value      "approved",
   :rdf/type         :voag/IssueStatus,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Approved Issue"})

(def AssignedRole
  "Assigned role"
  {:db/ident         :voag/AssignedRole,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Assigned role",
   :rdfs/subClassOf  :owl/Thing})

(def Attribution
  "An 'Attribution' specifies how credit should be given when citing the creators of a piece of work. Attribution must use the specified attribution text and optionally use logos that are provided in the attribution details below., with the names of points of contact. The name, url and other details of an attribution."
  {:db/ident :voag/Attribution,
   :dcterms/description
   ["An 'Attribution' specifies how credit should be given when citing the creators of a piece of work. Attribution must use the specified attribution text and optionally use logos that are provided in the attribution details below., with the names of points of contact."
    "The name, url and other details of an attribution."],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "Attributed Source",
   :rdfs/subClassOf [{:owl/allValuesFrom :voag/AttributionLogo,
                      :owl/onProperty    :voag/hasLogo,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :vaem/name,
                      :rdf/type        :owl/Restriction}
                     :voag/Qualifier
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :voag/url,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :xsd/string,
                      :owl/onProperty    :voag/pointOfContact,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :voag/hasLogo,
                      :rdf/type           :owl/Restriction}]})

(def AttributionLogo
  "Attribution logo"
  {:db/ident         :voag/AttributionLogo,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Attribution logo",
   :rdfs/subClassOf  :voag/Logo})

(def BiMonthly
  "Bi monthly"
  {:db/ident         :voag/BiMonthly,
   :dtype/value      "bi-monthly",
   :rdf/type         :voag/ChangeFrequency,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Bi monthly"})

(def BiQuarterly
  "Bi quarterly"
  {:db/ident         :voag/BiQuarterly,
   :dtype/value      "bi-quarterly",
   :rdf/type         :voag/ChangeFrequency,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Bi quarterly"})

(def BiWeekly
  "Bi-Weekly"
  {:db/ident         :voag/BiWeekly,
   :dtype/value      "bi-weekly",
   :rdf/type         :voag/ChangeFrequency,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Bi-Weekly"})

(def CC-SHAREALIKE_3PT0-US
  "Creative Commons Attribution-Share Alike 3.0 United States License"
  {:db/ident :voag/CC-SHAREALIKE_3PT0-US,
   :rdf/type :voag/LicenseModel,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label
   "Creative Commons Attribution-Share Alike 3.0 United States License"})

(def CCPH_CommercialUse
  "Creative Commons Commercial Use"
  {:db/ident         :voag/CCPH_CommercialUse,
   :rdf/type         :voag/CreativeCommonsProhibition,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       {:rdf/language "en-us",
                      :rdf/value    "Creative Commons Commercial Use"},
   :vaem/description {:rdf/language "en-us",
                      :rdf/value "Exercising rights for commercial purposes"}})

(def CCPH_HighIncomeNationUse
  "High income nation use"
  {:db/ident         :voag/CCPH_HighIncomeNationUse,
   :rdf/type         :voag/CreativeCommonsProhibition,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       [{:rdf/language "en-us",
                       :rdf/value    "Creative Commons High Income Nation Use"}
                      "High income nation use"],
   :vaem/description {:rdf/language "en-us",
                      :rdf/value    "Use in a non-developing country"}})

(def CCP_DerivativeWorks
  "Derivative works"
  {:db/ident         :voag/CCP_DerivativeWorks,
   :rdf/type         :voag/CreativeCommonsPermission,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       [{:rdf/language "en-us",
                       :rdf/value    "Creative Commons Derivative Works"}
                      "Derivative works"],
   :vaem/description {:rdf/language "en-us",
                      :rdf/value    "Distribution of derivative works"}})

(def CCP_Distribution
  "Distribution"
  {:db/ident :voag/CCP_Distribution,
   :rdf/type :voag/CreativeCommonsPermission,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label [{:rdf/language "en-us",
                 :rdf/value    "Creative Commons Distribution"}
                "Distribution"],
   :vaem/description
   {:rdf/language "en-us",
    :rdf/value
    "Creative Commons - distribution, public display, and publicly performance"}})

(def CCP_Reproduction
  "Reproduction"
  {:db/ident         :voag/CCP_Reproduction,
   :rdf/type         :voag/CreativeCommonsPermission,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       [{:rdf/language "en-us",
                       :rdf/value    "Creative Commons Reproduction"}
                      "Reproduction"],
   :vaem/description {:rdf/language "en-us",
                      :rdf/value    "making multiple copies"}})

(def CCP_Sharing
  "Sharing"
  {:db/ident :voag/CCP_Sharing,
   :rdf/type :voag/CreativeCommonsPermission,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label [{:rdf/language "en-us",
                 :rdf/value    "Creative Commons Sharing"}
                "Sharing"],
   :vaem/description
   {:rdf/language "en-us",
    :rdf/value
    "permits commercial derivatives, but only non-commercial distribution"}})

(def CCR_Attribution
  "Creative Commons Attribution"
  {:db/ident         :voag/CCR_Attribution,
   :rdf/type         :voag/CreativeCommonsRequirement,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       {:rdf/language "en-us",
                      :rdf/value    "Creative Commons Attribution"},
   :vaem/description {:rdf/language "en-us",
                      :rdf/value
                      "Credit to be given to copyright holder and/or author"}})

(def CCR_Copyleft
  "Creative Commons Copyleft"
  {:db/ident :voag/CCR_Copyleft,
   :rdf/type :voag/CreativeCommonsRequirement,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Creative Commons Copyleft"},
   :vaem/description
   ["Copyleft is a general method for making a program (or other work) free, and requiring all modified and extended versions of the program to be free as well. The simplest way to make a program free software is to put it in the public domain, uncopyrighted. This allows people to share the program and their improvements, if they are so minded. But it also allows uncooperative people to convert the program into proprietary software. They can make changes, many or few, and distribute the result as a proprietary product. People who receive the program in that modified form do not have the freedom that the original author gave them; the middleman has stripped it away.  In the GNU project, Copyleft says that anyone who redistributes the software, with or without changes, must pass along the freedom to further copy and change it. Copyleft guarantees that every user has freedom."
    {:rdf/language "en-us",
     :rdf/value
     "combined works must be licensed under specified terms, similar to those on the original work"}],
   :vaem/url "http://www.gnu.org/copyleft/copyleft.html"})

(def CCR_LesserCopyleft
  "Creative Commons Lesser Copyleft"
  {:db/ident :voag/CCR_LesserCopyleft,
   :rdf/type :voag/CreativeCommonsRequirement,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Creative Commons Lesser Copyleft"},
   :vaem/description
   {:rdf/language "en-us",
    :rdf/value
    "derivative works must be licensed under specified terms, with at least the same conditions as the original work; combinations with the work may be licensed under different terms"}})

(def CCR_Notice
  "Creative Commons Notice"
  {:db/ident         :voag/CCR_Notice,
   :rdf/type         :voag/CreativeCommonsRequirement,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       {:rdf/language "en-us",
                      :rdf/value    "Creative Commons Notice"},
   :vaem/description {:rdf/language "en-us",
                      :rdf/value
                      "copyright and license notices be kept intact"}})

(def CCR_ShareAlike
  "Creative Commons Share Alike"
  {:db/ident :voag/CCR_ShareAlike,
   :rdf/type :voag/CreativeCommonsRequirement,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Creative Commons Share Alike"},
   :vaem/description
   {:rdf/language "en-us",
    :rdf/value
    "derivative works be licensed under the same terms or compatible terms as the original work"}})

(def CCR_SourceCode
  "Creative Commons Source Code"
  {:db/ident :voag/CCR_SourceCode,
   :rdf/type :voag/CreativeCommonsRequirement,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Creative Commons Source Code"},
   :vaem/description
   {:rdf/language "en-us",
    :rdf/value
    "Source code (the preferred form for making modifications) must be provided when exercising some rights granted by the license."}})

(def CL_None
  "None"
  {:db/ident         :voag/CL_None,
   :dtype/code       0,
   :dtype/order      1,
   :dtype/value      "none",
   :rdf/type         :voag/ConfidentialityLevel,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "None"})

(def CL_Restricted
  "Restricted"
  {:db/ident :voag/CL_Restricted,
   :dtype/code 1,
   :dtype/order 2,
   :dtype/value "restricted",
   :rdf/type :voag/ConfidentialityLevel,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "Restricted",
   :vaem/description
   "During and before World War II, the U.S. had a category of classified information called restricted, which was below confidential. The U.S. no longer has a restricted classification, but many other nations and NATO do. The U.S. treats \"restricted\" information it receives from other governments as confidential. The U.S. does use the term restricted data in a completely different way to refer to nuclear secrets."})

(def CL_Secret
  "Secret"
  {:db/ident :voag/CL_Secret,
   :dtype/code 5,
   :dtype/order 6,
   :dtype/value "secret",
   :rdf/type :voag/ConfidentialityLevel,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "Secret",
   :vaem/description
   "\"Secret\" shall be applied to information, the unauthorized disclosure of which reasonably could be expected to cause serious damage to the national security that the original classification authority is able to identify or describe [US Executive Order 12958]."})

(def CL_SensitiveButUnclassified
  "Sensitive but Unclassified"
  {:db/ident :voag/CL_SensitiveButUnclassified,
   :dtype/code 3,
   :dtype/order 4,
   :dtype/value "sbu",
   :rdf/type :voag/ConfidentialityLevel,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "Sensitive but Unclassified",
   :vaem/description
   "Sensitive but Unclassified (SBU) information should not be disclosed but is not national security information and cannot be classified according to Executive Order (EO)12958, as amended. These materials must be: properly marked, locked up when not under the supervision of an authorized person, and encrypted while in transit over a non-secure network. Some examples are: trade secrets, proprietary information, financial information, personnel and medical records, procurement-sensitive information, IT system security plans, contingency plans, audit logs (recordings of exceptions and other security-related events), vulnerability reports, incident reports and Personally Identifiable Information (PII)."})

(def CL_TopSecret
  "Top secret"
  {:db/ident :voag/CL_TopSecret,
   :dtype/code 6,
   :dtype/order 7,
   :dtype/value "topsecret",
   :rdf/type :voag/ConfidentialityLevel,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "Top secret",
   :vaem/description
   "\"Top Secret\" shall be applied to information, the unauthorized disclosure of which reasonably could be expected to cause exceptionally grave damage to the national security that the original classification authority is able to identify or describe [US Executive Order 12958]."})

(def CL_Unclassified
  "Unclassified"
  {:db/ident :voag/CL_Unclassified,
   :dtype/code 2,
   :dtype/order 3,
   :dtype/value "unclassified",
   :rdf/type :voag/ConfidentialityLevel,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "Unclassified",
   :vaem/description
   "Unclassified is not technically a \"classification\"; this is the default, and refers to information that can be released to individuals without a clearance (Level 0). Information that is unclassified is sometimes restricted in its dissemination as SBU or FOUO. For example, the \"law enforcement bulletins\" often reported by the U.S. media when United States Department of Homeland Security raises the U.S. terror threat level are usually classified as \"U//LES\" or \"Unclassified - Law Enforcement Sensitive.\" This information is only supposed to be released to Law Enforcement groups (Sheriff, Police, etc.) Because the information is unclassified, however, it is sometimes released to the public as well. Information which is unclassified, but which the government does not believe should be subject to Freedom of Information Act requests is often classified as U//FOUO - \"Unclassified - For Official Use Only\". In addition to FOUO information, information can be categorized according to its availability to be distributed (Distribution D may only be released to approved Department of Defense and Government Contractor personnel). Also, the statement of NOFORN (meaning No Foreign Nationals) is applied to any information which may not be released to any non-US Citizen. NOFORN and Distribution statements are often used in conjunction with classified information or alone on SBU information. Documents subject to export controls have a specific warning to that effect."})

(def Catalog
  "Catalog"
  {:db/ident         :voag/Catalog,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Catalog",
   :rdfs/subClassOf  [:voag/GovernedObject
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/hasLogo,
                       :rdf/type           :owl/Restriction}],
   :vaem/description "An index to a set of resources"})

(def ChangeFrequency
  "Change frequency"
  {:db/ident         :voag/ChangeFrequency,
   :owl/oneOf        [:voag/Never
                      :voag/Daily
                      :voag/Weekly
                      :voag/BiWeekly
                      :voag/Monthly
                      :voag/BiMonthly
                      :voag/Quarterly
                      :voag/BiQuarterly
                      :voag/Annually
                      :voag/UncertainFrequency],
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Change frequency",
   :rdfs/subClassOf  :voag/EnumeratedValue})

(def ChangeManagementProcess
  "A \"Governance Process\"."
  {:db/ident            :voag/ChangeManagementProcess,
   :dcterms/description "A \"Governance Process\".",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label          "Change Management Process",
   :rdfs/subClassOf     :voag/GovernanceProcess})

(def ChangeType
  "Change type"
  {:db/ident :voag/ChangeType,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "Change type",
   :rdfs/subClassOf :voag/EnumeratedValue,
   :vaem/description
   "Change Type provides an indicator for how an artifact has or will change in the future. This indicator is important to understanding the stability of an ontology."})

(def ClosedIssue
  "Closed"
  {:db/ident         :voag/ClosedIssue,
   :dtype/value      "closed",
   :rdf/type         :voag/IssueStatus,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Closed"})

(def ConcurrenceEvent
  "A Governance Event."
  {:db/ident            :voag/ConcurrenceEvent,
   :dcterms/description "A Governance Event.",
   :owl/disjointWith    :voag/NonConcurrenceEvent,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label          "Concurrence event",
   :rdfs/subClassOf     :voag/Event})

(def ConfidentialityLevel
  "Confidentiality level"
  {:db/ident :voag/ConfidentialityLevel,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "Confidentiality level",
   :rdfs/subClassOf :voag/EnumeratedValue,
   :vaem/description
   "An enumerated codelist for values thath pertain to the security of a set of resources, or a resource. In 'lmc' an ontology can carry a property to denote its confidentiality."})

(def CreativeCommonsJurisdiction
  "the legal jurisdiction of a license"
  {:db/ident            :voag/CreativeCommonsJurisdiction,
   :dcterms/description {:rdf/language "en-us",
                         :rdf/value    "the legal jurisdiction of a license"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label          [{:rdf/language "en-us",
                          :rdf/value    "Creative Commons Jurisdiction"}
                         "Creative commons jurisdiction"],
   :rdfs/subClassOf     :owl/Thing})

(def CreativeCommonsPermission
  "An action that may or may not be allowed or desired"
  {:db/ident            :voag/CreativeCommonsPermission,
   :dcterms/description {:rdf/language "en-us",
                         :rdf/value
                         "An action that may or may not be allowed or desired"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label          {:rdf/language "en-us",
                         :rdf/value    "Creative Commons Permission"},
   :rdfs/subClassOf     :voag/EnumeratedValue})

(def CreativeCommonsProhibition
  "something you may be asked not to do"
  {:db/ident            :voag/CreativeCommonsProhibition,
   :dcterms/description {:rdf/language "en-us",
                         :rdf/value    "something you may be asked not to do"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label          {:rdf/language "en-us",
                         :rdf/value    "Creative Commons Prohibition"},
   :rdfs/subClassOf     :voag/EnumeratedValue})

(def CreativeCommonsRequirement
  "an action that may or may not be requested of you"
  {:db/ident            :voag/CreativeCommonsRequirement,
   :dcterms/description {:rdf/language "en-us",
                         :rdf/value
                         "an action that may or may not be requested of you"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label          {:rdf/language "en-us",
                         :rdf/value    "Requirement"},
   :rdfs/subClassOf     :voag/EnumeratedValue,
   :vaem/description    {:rdf/language "en-us",
                         :rdf/value
                         "An action that may or may not be requested of you"}})

(def CreativeCommonsWork
  "A potentially copyrightable work"
  {:db/ident            :voag/CreativeCommonsWork,
   :dcterms/description {:rdf/language "en-us",
                         :rdf/value    "A potentially copyrightable work"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label          [{:rdf/language "en-us",
                          :rdf/value    "Creative Commons Work"}
                         "Creative commons work"],
   :rdfs/subClassOf     [:owl/Thing
                         {:owl/maxCardinality 1,
                          :owl/onProperty     :voag/url,
                          :rdf/type           :owl/Restriction}]})

(def DTYPE-CatalogEntry
  {:db/ident         :voag/DTYPE-CatalogEntry,
   :rdf/type         :voag/SchemaGraph,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag"})

(def Daily
  "Daily"
  {:db/ident         :voag/Daily,
   :rdf/type         :voag/ChangeFrequency,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Daily"})

(def DeferredIssue
  "Deferred"
  {:db/ident         :voag/DeferredIssue,
   :dtype/value      "deferred",
   :rdf/type         :voag/IssueStatus,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Deferred"})

(def DeletionEvent
  "A \"Archival Event\"."
  {:db/ident            :voag/DeletionEvent,
   :dcterms/description "A \"Archival Event\".",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label          "Deletion Event",
   :rdfs/subClassOf     :voag/Event})

(def DesignatedGovernanceRole
  "A \"Assigned Role\" with the following instance(s): \"Assurer\", \"Project Management\", \"Resource & Process Policy\", \"Technical Definitions\", \"User\", \"Verifier\"."
  {:db/ident :voag/DesignatedGovernanceRole,
   :dcterms/description
   "A \"Assigned Role\" with the following instance(s): \"Assurer\", \"Project Management\", \"Resource & Process Policy\", \"Technical Definitions\", \"User\", \"Verifier\".",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "Designated Governance Role",
   :rdfs/subClassOf [:voag/Event
                     {:owl/allValuesFrom :voag/GovernanceRole,
                      :owl/onProperty    :vaem/hasGraphRole,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :voag/performedBy,
                      :rdf/type        :owl/Restriction}]})

(def DisapprovedIssue
  "Disapproved Issue"
  {:db/ident         :voag/DisapprovedIssue,
   :rdf/type         :voag/IssueStatus,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Disapproved Issue"})

(def Document
  "Document"
  {:db/ident         :voag/Document,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Document",
   :rdfs/subClassOf  [{:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/description,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/dateCreated,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/lastUpdated,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/name,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/title,
                       :rdf/type           :owl/Restriction}
                      :owl/Thing
                      {:owl/minCardinality 0,
                       :owl/onProperty     :voag/url,
                       :rdf/type           :owl/Restriction}]})

(def DocumentationChange
  "Documentation change"
  {:db/ident         :voag/DocumentationChange,
   :rdf/type         :voag/ChangeType,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Documentation change"})

(def EarlyAdoption
  "Early adoption"
  {:db/ident         :voag/EarlyAdoption,
   :rdf/type         :voag/Maturity,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Early adoption"})

(def EnumeratedValue
  "The base class in LMC for enumerated values"
  {:db/ident            :voag/EnumeratedValue,
   :dcterms/description "The base class in LMC for enumerated values",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label          "Metadata Enumerated value",
   :rdfs/subClassOf     :dtype/EnumeratedValue})

(def Event
  "Event"
  {:db/ident         :voag/Event,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Event",
   :rdfs/subClassOf  [{:owl/maxCardinality 1,
                       :owl/onProperty     :voag/id,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :voag/Party,
                       :owl/onProperty    :voag/instigatedBy,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/description,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/eventDate,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/endDate,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/name,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/instigatedBy,
                       :rdf/type           :owl/Restriction}
                      :owl/Thing
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/startDate,
                       :rdf/type           :owl/Restriction}]})

(def Experimental
  "Experimental"
  {:db/ident         :voag/Experimental,
   :rdf/type         :voag/Maturity,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Experimental"})

(def Figure
  "Figure"
  {:db/ident         :voag/Figure,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Figure",
   :rdfs/subClassOf  [:voag/Image
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/imageMap,
                       :rdf/type           :owl/Restriction}],
   :vaem/description "An illustration of some kind."})

(def GR_Authorizer
  "Authorizer"
  {:db/ident         :voag/GR_Authorizer,
   :dtype/value      "authorizer",
   :rdf/type         :voag/GovernanceRole,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Authorizer"})

(def GR_Steward
  "Steward"
  {:db/ident         :voag/GR_Steward,
   :dtype/value      "steward",
   :rdf/type         :voag/GovernanceRole,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Steward"})

(def GR_Submitter
  "Submitter"
  {:db/ident         :voag/GR_Submitter,
   :dtype/value      "submitter",
   :rdf/type         :voag/GovernanceRole,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Submitter"})

(def Governance
  "Governance is mainly concerned with how an artifact is provisioned and managed over its lifecycle. Governance also concerns the status tracking and processes that need to exist on information objects and services for a successful initiaitve, mission, program, or project. Such governance needs to outline the relationships between all internal and external groups involved, describe the proper flow of information regarding to all stakeholders, ensure the appropriate review of issues encountered and ensure that required approvals and direction are obtained at each appropriate stage."
  {:db/ident :voag/Governance,
   :dcterms/description
   "Governance is mainly concerned with how an artifact is provisioned and managed over its lifecycle. Governance also concerns the status tracking and processes that need to exist on information objects and services for a successful initiaitve, mission, program, or project. Such governance needs to outline the relationships between all internal and external groups involved, describe the proper flow of information regarding to all stakeholders, ensure the appropriate review of issues encountered and ensure that required approvals and direction are obtained at each appropriate stage.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "Governance",
   :rdfs/subClassOf [{:owl/allValuesFrom :voag/ChangeType,
                      :owl/onProperty    :voag/hasAnticipatedChangeType,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :voag/Party,
                      :owl/onProperty    :voag/hasOwner,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :voag/hasProtocol,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :voag/Issue,
                      :owl/onProperty    :voag/hasIssue,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :voag/GovernanceProtocol,
                      :owl/onProperty    :voag/hasProtocol,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :voag/isFOSS,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :voag/hasOwner,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :voag/Document,
                      :owl/onProperty    :voag/hasApplicableDocument,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :voag/GovernanceEvent,
                      :owl/onProperty    :voag/hasGovernanceEvent,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :voag/Document,
                      :owl/onProperty    :voag/hasNormativeDocument,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :voag/hasConfidentiality,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :voag/ChangeFrequency,
                      :owl/onProperty    :voag/frequencyOfChange,
                      :rdf/type          :owl/Restriction}
                     :voag/Qualifier
                     {:owl/cardinality 1,
                      :owl/onProperty  :voag/hasApprovalStatus,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :voag/Governance,
                      :owl/onProperty    :voag/supercedes,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :voag/Document,
                      :owl/onProperty    :voag/hasReferenceDocument,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :voag/ConfidentialityLevel,
                      :owl/onProperty    :voag/hasConfidentiality,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :voag/isITAR,
                      :rdf/type           :owl/Restriction}]})

(def GovernanceEvent
  "A \"Governance Event\"."
  {:db/ident            :voag/GovernanceEvent,
   :dcterms/description "A \"Governance Event\".",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label          "Governance Event",
   :rdfs/subClassOf     :voag/Event})

(def GovernanceProcess
  "A \"Process\"."
  {:db/ident            :voag/GovernanceProcess,
   :dcterms/description "A \"Process\".",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label          "Governance Process",
   :rdfs/subClassOf     :voag/Process})

(def GovernanceProtocol
  "Governance is used to mean the processes that need to exist for a successful initiaitve, mission, program, or project. Such governance needs to outline the relationships between all internal and external groups involved, describe the proper flow of information regarding to all stakeholders, ensure the appropriate review of issues encountered and ensure that required approvals and direction for a 'GovernedEntity' is obtained at each appropriate stage."
  {:db/ident         :voag/GovernanceProtocol,
   :dcterms/description
   "Governance is used  to mean the processes that need to exist for a successful initiaitve, mission, program, or project. Such governance needs to outline the relationships between all internal and external groups involved, describe the proper flow of information regarding to all stakeholders, ensure the appropriate review of issues encountered and ensure that required approvals and direction for a 'GovernedEntity' is obtained at each appropriate stage.",
   :owl/equivalentClass
   {:owl/intersectionOf [{:owl/onProperty     :voag/isGovernedBy,
                          :owl/someValuesFrom :voag/StakeholderGroup,
                          :rdf/type           :owl/Restriction}
                         {:owl/onProperty     :voag/hasProcess,
                          :owl/someValuesFrom :voag/GovernanceProcess,
                          :rdf/type           :owl/Restriction}
                         {:owl/onProperty     :voag/hasNormativeDocument,
                          :owl/someValuesFrom :voag/Document,
                          :rdf/type           :owl/Restriction}],
    :rdf/type           :owl/Class,
    :rdfs/isDefinedBy   "http://voag.linkedmodel.org/schema/voag"},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Governance Protocol",
   :rdfs/subClassOf  [{:owl/allValuesFrom :voag/StakeholderGroup,
                       :owl/onProperty    :voag/mayNeedConcurrenceFrom,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :voag/StakeholderGroup,
                       :owl/onProperty    :voag/reviewedBy,
                       :rdf/type          :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :voag/isGovernedBy,
                       :rdf/type        :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/hasIssueResolutionProcess,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/hasApprovalProcess,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :voag/hasNormativeDocument,
                       :owl/someValuesFrom :voag/Document,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :voag/ChangeManagementProcess,
                       :owl/onProperty    :voag/hasChangeManagementProcess,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :voag/Organization,
                       :owl/onProperty    :voag/isGovernedBy,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :voag/StakeholderGroup,
                       :owl/onProperty    :voag/isInterestOf,
                       :rdf/type          :owl/Restriction}
                      {:owl/cardinality 3,
                       :owl/onProperty  :voag/hasProcess,
                       :rdf/type        :owl/Restriction}
                      {:owl/allValuesFrom :voag/ApprovalProcess,
                       :owl/onProperty    :voag/hasApprovalProcess,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :voag/IssueResolutionProcess,
                       :owl/onProperty    :voag/hasIssueResolutionProcess,
                       :rdf/type          :owl/Restriction}
                      :voag/Qualifier
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/hasChangeManagementProcess,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :voag/StakeholderGroup,
                       :owl/onProperty    :voag/isApprovedBy,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/id,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :voag/isGovernedBy,
                       :owl/someValuesFrom :voag/StakeholderGroup,
                       :rdf/type           :owl/Restriction}]})

(def GovernanceRole
  "A \"Role\" with the following instance(s): \"authorizer\", \"steward\", \"submitter\"."
  {:db/ident :voag/GovernanceRole,
   :dcterms/description
   "A \"Role\" with the following instance(s): \"authorizer\", \"steward\", \"submitter\".",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "Governance Role",
   :rdfs/subClassOf :voag/EnumeratedValue})

(def GovernedObject
  "Governed Object"
  {:db/ident         :voag/GovernedObject,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Governed Object",
   :rdfs/subClassOf  [{:owl/allValuesFrom :voag/Provenance,
                       :owl/onProperty    :voag/hasProvenance,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/id,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/documentedAt,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :voag/Governance,
                       :owl/onProperty    :voag/hasGovernance,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/revision,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/hasProvenance,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :voag/url,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/lastUpdated,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/title,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/hasGovernance,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/dateCreated,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/normativeURL,
                       :rdf/type           :owl/Restriction}
                      :prov/Entity
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/description,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/name,
                       :rdf/type           :owl/Restriction}],
   :vaem/description "An abstract class for all governed entities"})

(def GovernedService
  "Governed service"
  {:db/ident         :voag/GovernedService,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Governed service",
   :rdfs/subClassOf  :voag/Service})

(def Graph
  "Graph"
  {:db/ident :voag/Graph,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "Graph",
   :rdfs/subClassOf [{:owl/allValuesFrom :voag/Attribution,
                      :owl/onProperty    :vaem/withAttributionTo,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :voag/LicenseModel,
                      :owl/onProperty    :vaem/hasLicenseType,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :vaem/namespace,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :voag/urlOfTurtleFile,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :voag/hasLogo,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :vaem/GraphRole,
                      :owl/onProperty    :vaem/hasGraphRole,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :vaem/Discipline,
                      :owl/onProperty    :vaem/disciplineScope,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :voag/downloads,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/hasLicenseType,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :vaem/namespacePrefix,
                      :rdf/type        :owl/Restriction}
                     :void/Dataset
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/hasGraphRole,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :voag/curatedGraphURI,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :voag/urlOfRDFfile,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :vaem/Viewpoint,
                      :owl/onProperty    :vaem/viewpointScope,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :voag/attributionText,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :vaem/Domain,
                      :owl/onProperty    :vaem/domainScope,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :voag/ProductLogo,
                      :owl/onProperty    :voag/hasLogo,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :vaem/Aspect,
                      :owl/onProperty    :vaem/aspectScope,
                      :rdf/type          :owl/Restriction}],
   :vaem/description
   "A set of RDF triples in an ontology graph specified according to VOAG."})

(def Icon
  "Icon"
  {:db/ident         :voag/Icon,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Icon",
   :rdfs/subClassOf  :voag/Image,
   :vaem/description "A logo of some kind"})

(def Image
  "Image"
  {:db/ident :voag/Image,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "Image",
   :rdfs/subClassOf [:owl/Thing
                     {:owl/cardinality 1,
                      :owl/onProperty  :voag/image,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :voag/caption,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :voag/height,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :voag/width,
                      :rdf/type           :owl/Restriction}],
   :vaem/description
   "Image is a class for figures, pictures, logos, and icons  of various kinds"})

(def InDevelopment
  "In development"
  {:db/ident         :voag/InDevelopment,
   :rdf/type         :voag/Maturity,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "In development"})

(def Issue
  "captures issues such as raising of an issue related to a particular entity in a registry"
  {:db/ident :voag/Issue,
   :dcterms/description
   "captures issues such as raising of an issue related to a particular entity in a registry",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "Issue",
   :rdfs/subClassOf [{:owl/allValuesFrom :voag/BoardDispositionStatus,
                      :owl/onProperty    :voag/dispositionStatus,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :voag/PriorityValue,
                      :owl/onProperty    :voag/priority,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :voag/disposition,
                      :rdf/type        :owl/Restriction}
                     :owl/Thing
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/description,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :voag/priority,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :voag/IssueStatus,
                      :owl/onProperty    :voag/hasStatus,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :voag/title,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :voag/id,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :voag/userID,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :voag/hasStatus,
                      :rdf/type        :owl/Restriction}]})

(def IssueResolutionProcess
  "A \"Governance Process\"."
  {:db/ident            :voag/IssueResolutionProcess,
   :dcterms/description "A \"Governance Process\".",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label          "Issue Resolution Process",
   :rdfs/subClassOf     :voag/GovernanceProcess})

(def IssueStatus
  "The status of an issue: \"Closed\", \"Deferred\", \"Non issue\", \"Open\", \"Resolved\"."
  {:db/ident :voag/IssueStatus,
   :dcterms/description
   "The status of an issue: \"Closed\", \"Deferred\", \"Non issue\", \"Open\", \"Resolved\".",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "Issue Status",
   :rdfs/subClassOf :voag/EnumeratedValue})

(def LicenseModel
  "License Model"
  {:db/ident :voag/LicenseModel,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "License Model",
   :rdfs/subClassOf [{:owl/allValuesFrom :voag/LicenseModel,
                      :owl/onProperty    :voag/incompatibleWith,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :voag/image,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :voag/url,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/acronym,
                      :rdf/type           :owl/Restriction}
                     :voag/GovernedObject
                     {:owl/allValuesFrom :voag/LicenseModel,
                      :owl/onProperty    :voag/compatibleWith,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :voag/LicenseModel,
                      :owl/onProperty    :voag/derivedFrom,
                      :rdf/type          :owl/Restriction}],
   :vaem/description
   "A License Model describes the licensing conditions associated with a software artifact."})

(def LinkedModelLogo-200x80
  "LinkedModel ICON 200 x 80"
  {:db/ident :voag/LinkedModelLogo-200x80,
   :rdf/type :voag/Logo,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "LinkedModel ICON 200 x 80",
   :vaem/description "LinkedModel Logo",
   :voag/caption "LinkedModel Standard ICON",
   :voag/height "80",
   :voag/image
   "http://www.linkedmodel.org/lib/lm/images/logos/linkedmodels-logo.gif",
   :voag/width "200"})

(def Logo
  "Logo"
  {:db/ident         :voag/Logo,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Logo",
   :rdfs/subClassOf  :voag/Image,
   :vaem/description "Logo is ..."})

(def Maturity
  "Maturity"
  {:db/ident         :voag/Maturity,
   :owl/unionOf      [:voag/WidelyAdopted
                      :voag/SomeAdoption
                      :voag/EarlyAdoption
                      :voag/Proposed
                      :voag/UnknownMaturity
                      :voag/Experimental
                      :voag/InDevelopment],
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Maturity",
   :rdfs/subClassOf  :voag/EnumeratedValue})

(def ModificationChange
  "Modification change"
  {:db/ident         :voag/ModificationChange,
   :rdf/type         :voag/ChangeType,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Modification change"})

(def Monthly
  "Monthly"
  {:db/ident         :voag/Monthly,
   :rdf/type         :voag/ChangeFrequency,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Monthly"})

(def Never
  "Never"
  {:db/ident         :voag/Never,
   :rdf/type         :voag/ChangeFrequency,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Never"})

(def NoAttributionSpecified
  "No attribution specified"
  {:db/ident         :voag/NoAttributionSpecified,
   :rdf/type         :voag/Attribution,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "No attribution specified"})

(def NoGovernanceSpecified
  "No governance specified"
  {:db/ident         :voag/NoGovernanceSpecified,
   :rdf/type         :voag/Governance,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "No governance specified"})

(def NoPedigreeSpecified
  "No pedigree specified"
  {:db/ident         :voag/NoPedigreeSpecified,
   :rdf/type         :voag/Pedigree,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "No pedigree specified"})

(def NoProvenanceSpecified
  "No provenance specified"
  {:db/ident         :voag/NoProvenanceSpecified,
   :rdf/type         :voag/Provenance,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "No provenance specified"})

(def NonConcurrenceEvent
  "A \"Governance Event\"."
  {:db/ident            :voag/NonConcurrenceEvent,
   :dcterms/description "A \"Governance Event\".",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label          "Non-Concurrence Event",
   :rdfs/subClassOf     :voag/GovernanceEvent})

(def NonIssue
  "Non-issue"
  {:db/ident         :voag/NonIssue,
   :dtype/value      "non-issue",
   :rdf/type         :voag/IssueStatus,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Non-issue"})

(def OpenIssue
  "Open"
  {:db/ident         :voag/OpenIssue,
   :dtype/value      "open",
   :rdf/type         :voag/IssueStatus,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Open",
   :vaem/description "An issue with undetermined disposition,"})

(def Organization
  "Organization"
  {:db/ident         :voag/Organization,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Organization",
   :rdfs/subClassOf  [:voag/Party
                      :prov/Organization
                      {:owl/allValuesFrom :voag/OrganizationLogo,
                       :owl/onProperty    :voag/hasLogo,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/hasLogo,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :voag/url,
                       :rdf/type           :owl/Restriction}]})

(def OrganizationLogo
  "Organization logo"
  {:db/ident         :voag/OrganizationLogo,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Organization logo",
   :rdfs/subClassOf  :voag/Logo,
   :vaem/description "A logo for an organization"})

(def PS_Draft
  "Draft Status"
  {:db/ident         :voag/PS_Draft,
   :dtype/value      "draft",
   :rdf/type         :voag/PublicationStatus,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Draft Status"})

(def PS_Final
  "Final Status"
  {:db/ident         :voag/PS_Final,
   :rdf/type         :voag/PublicationStatus,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Final Status"})

(def PS_Interim
  "Interim Status"
  {:db/ident         :voag/PS_Interim,
   :dtype/value      "interim",
   :rdf/type         :voag/PublicationStatus,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Interim Status"})

(def PS_Obsolete
  "Obsolete"
  {:db/ident         :voag/PS_Obsolete,
   :dtype/value      "obsolete",
   :rdf/type         :voag/PublicationStatus,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Obsolete"})

(def PS_Review
  "Review"
  {:db/ident         :voag/PS_Review,
   :dtype/value      "review",
   :rdf/type         :voag/PublicationStatus,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Review"})

(def PS_Unknown
  "Unknown Status"
  {:db/ident         :voag/PS_Unknown,
   :dtype/value      "unknown",
   :rdf/type         :voag/PublicationStatus,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Unknown Status"})

(def PV_HighPriority
  "High priority"
  {:db/ident         :voag/PV_HighPriority,
   :dtype/value      "high",
   :rdf/type         :voag/PriorityValue,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "High priority"})

(def PV_LowPriority
  "Low priority"
  {:db/ident         :voag/PV_LowPriority,
   :dtype/value      "low",
   :rdf/type         :voag/PriorityValue,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Low priority"})

(def PV_MediumPriority
  "Medium priority"
  {:db/ident         :voag/PV_MediumPriority,
   :dtype/value      "medium",
   :rdf/type         :voag/PriorityValue,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Medium priority"})

(def PV_NotApplicable
  "Not Applicable"
  {:db/ident         :voag/PV_NotApplicable,
   :dtype/value      "na",
   :rdf/type         :voag/PriorityValue,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Not Applicable"})

(def PV_ToBeDetermined
  "TBD"
  {:db/ident         :voag/PV_ToBeDetermined,
   :dtype/value      "tbd",
   :rdf/type         :voag/PriorityValue,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "TBD"})

(def Party
  "Party"
  {:db/ident         :voag/Party,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Party",
   :rdfs/subClassOf  [{:owl/maxCardinality 1,
                       :owl/onProperty     :voag/id,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/name,
                       :rdf/type           :owl/Restriction}]})

(def Pedigree
  "The origin or source of something. The primary purpose of provenance is to capture the time, place, and if appropriate the person responsible, for the creation, production or provisioning of some information object."
  {:db/ident :voag/Pedigree,
   :dcterms/description
   "The origin or source of something. The primary purpose of provenance is to capture the time, place, and if appropriate the person responsible, for the creation, production or provisioning of some information object.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "Pedigree",
   :rdfs/subClassOf [{:owl/allValuesFrom :voag/Party,
                      :owl/onProperty    :voag/usedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :voag/usage,
                      :rdf/type           :owl/Restriction}
                     :voag/Qualifier
                     {:owl/allValuesFrom :voag/Accredidation,
                      :owl/onProperty    :voag/hasAccredidation,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :voag/hasAccredidation,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :voag/hasMaturity,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :voag/Maturity,
                      :owl/onProperty    :voag/hasMaturity,
                      :rdf/type          :owl/Restriction}],
   :vaem/description
   "Pedigree captures aspects of an artifact that have to do with maturity, quality, salience, and accredidation."})

(def Person
  "Person"
  {:db/ident         :voag/Person,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Person",
   :rdfs/subClassOf  [:voag/Party :prov/Person]})

(def PriorityValue
  "Priority value"
  {:db/ident         :voag/PriorityValue,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Priority value",
   :rdfs/subClassOf  :voag/EnumeratedValue})

(def ProcessClass
  "Process"
  {:db/ident         :voag/Process,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Process",
   :rdfs/subClassOf  [:owl/Thing
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/id,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/name,
                       :rdf/type           :owl/Restriction}]})

(def ProductLogo
  "Product logo"
  {:db/ident         :voag/ProductLogo,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Product logo",
   :rdfs/subClassOf  :voag/Logo,
   :vaem/description "Product logo is used for products, solutions, etc."})

(def Proposed
  "Proposed"
  {:db/ident         :voag/Proposed,
   :rdf/type         :voag/Maturity,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Proposed"})

(def Provenance
  "The origin or source of something. The primary purpose of provenance is to capture the time, place, and if appropriate the person responsible, for the creation, production or provisioning of some information object."
  {:db/ident :voag/Provenance,
   :dcterms/description
   "The origin or source of something. The primary purpose of provenance is to capture the time, place, and if appropriate the person responsible, for the creation, production or provisioning of some information object.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "Provenance",
   :rdfs/subClassOf [{:owl/minCardinality 1,
                      :owl/onProperty     :voag/source,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :voag/GovernedObject,
                      :owl/onProperty    :voag/supercedes,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :voag/GovernedObject,
                      :owl/onProperty    :voag/supercededBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :voag/Pedigree,
                      :owl/onProperty    :voag/hasPedigree,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :voag/ChangeType,
                      :owl/onProperty    :voag/hasChangeType,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      {:owl/unionOf [:voag/Party :voag/Document],
                       :rdf/type :owl/Class,
                       :rdfs/isDefinedBy
                       "http://voag.linkedmodel.org/schema/voag"},
                      :owl/onProperty :voag/source,
                      :rdf/type :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :voag/derivedFrom,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/lastUpdated,
                      :rdf/type           :owl/Restriction}
                     :voag/Qualifier
                     {:owl/cardinality 1,
                      :owl/onProperty  :vaem/timestamp,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/revision,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :voag/hasPedigree,
                      :rdf/type           :owl/Restriction}],
   :vaem/description
   "Provenance specifies the origin or source of some artifact. The primary purpose of provenance is to capture the time, place, and if appropriate the person responsible, for the creation, production or provisioning of The artifact. Provenance also captures a record of how a version may have been superceded by another version of the artifact."})

(def PublicationStatus
  "Publication Status"
  {:db/ident         :voag/PublicationStatus,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Publication Status",
   :rdfs/subClassOf  :voag/EnumeratedValue})

(def Qualifier
  "Qualifier"
  {:db/ident         :voag/Qualifier,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Qualifier",
   :rdfs/subClassOf  [:owl/Thing
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/id,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/name,
                       :rdf/type           :owl/Restriction}]})

(def Quarterly
  "Quarterly"
  {:db/ident         :voag/Quarterly,
   :rdf/type         :voag/ChangeFrequency,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Quarterly"})

(def RDFIcon-32X35
  "RDF Icon 32 X 35"
  {:db/ident :voag/RDFIcon-32X35,
   :rdf/type :voag/Icon,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "RDF Icon 32 X 35",
   :vaem/description "RDF Standard",
   :voag/caption "RDF Standard ICON",
   :voag/height "35",
   :voag/image
   "http://www.linkedmodel.org/lib/lm/images/icons/rdf_w3c_icon.48.gif",
   :voag/width "32"})

(def RefactoringChange
  "Refactoring change"
  {:db/ident         :voag/RefactoringChange,
   :rdf/type         :voag/ChangeType,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Refactoring change"})

(def RejectionEvent
  "A \"Governance Event\"."
  {:db/ident            :voag/RejectionEvent,
   :dcterms/description "A \"Governance Event\".",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label          "Rejection Event",
   :rdfs/subClassOf     :voag/Event})

(def ResolvedIssue
  "Resolved"
  {:db/ident         :voag/ResolvedIssue,
   :dtype/value      "resolved",
   :rdf/type         :voag/IssueStatus,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Resolved"})

(def RetreivalEvent
  "A \"Archival Event\"."
  {:db/ident            :voag/RetreivalEvent,
   :dcterms/description "A \"Archival Event\".",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label          "Retreival Event",
   :rdfs/subClassOf     :voag/Event})

(def ReviewEvent
  "A \"Governance Event\"."
  {:db/ident            :voag/ReviewEvent,
   :dcterms/description "A \"Governance Event\".",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label          "Review",
   :rdfs/subClassOf     [:voag/GovernanceEvent
                         {:owl/allValuesFrom :voag/Organization,
                          :owl/onProperty    :voag/performedBy,
                          :rdf/type          :owl/Restriction}]})

(def SPARQLIcon-80X15
  "SPARQL ICON 80 X 15"
  {:db/ident :voag/SPARQLIcon-80X15,
   :rdf/type :voag/Icon,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "SPARQL ICON 80 X 15",
   :vaem/description "SPARQL Standard",
   :voag/caption "SPARQL Standard ICON",
   :voag/height "15",
   :voag/image
   "http://www.linkedmodel.org/lib/lm/images/icons/sw-sparql-blue.png",
   :voag/width "80"})

(def SchemaGraph
  "Schema graph"
  {:db/ident            :voag/SchemaGraph,
   :owl/equivalentClass {:owl/intersectionOf [:voag/Graph
                                              {:owl/hasValue :vaem/SchemaGraph,
                                               :owl/onProperty
                                               :vaem/hasGraphRole,
                                               :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class,
                         :rdfs/isDefinedBy
                         "http://voag.linkedmodel.org/schema/voag"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label          "Schema graph",
   :rdfs/subClassOf     [:voag/Graph
                         {:owl/hasValue   :vaem/SchemaGraph,
                          :owl/onProperty :vaem/hasGraphRole,
                          :rdf/type       :owl/Restriction}]})

(def Service
  "Service"
  {:db/ident         :voag/Service,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Service",
   :rdfs/subClassOf  [:owl/Thing
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/id,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/name,
                       :rdf/type           :owl/Restriction}]})

(def SomeAdoption
  "Some adoption"
  {:db/ident         :voag/SomeAdoption,
   :rdf/type         :voag/Maturity,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Some adoption"})

(def StakeholderGroup
  "A Stakeholder Group is a party of people who have common interests and concerns."
  {:db/ident         :voag/StakeholderGroup,
   :dcterms/description
   "A Stakeholder Group is a party of people who have common interests and concerns.",
   :owl/equivalentClass {:owl/onProperty     :voag/hasStakeholder,
                         :owl/someValuesFrom :voag/Person,
                         :rdf/type           :owl/Restriction},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Stakeholder Group",
   :rdfs/subClassOf  [:voag/Party
                      :prov/Organization
                      {:owl/allValuesFrom :voag/Person,
                       :owl/onProperty    :voag/hasStakeholder,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :voag/hasStakeholder,
                       :rdf/type           :owl/Restriction}]})

(def Standard
  "Standard"
  {:db/ident         :voag/Standard,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Standard",
   :rdfs/subClassOf  [:voag/GovernedObject
                      {:owl/allValuesFrom :voag/Icon,
                       :owl/onProperty    :voag/hasLogo,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :voag/hasLogo,
                       :rdf/type           :owl/Restriction}],
   :vaem/description "An industry, de facto or de jure standard"})

(def TopQuadrantAttribution
  "TopQuadrant attribution"
  {:db/ident            :voag/TopQuadrantAttribution,
   :rdf/type            :voag/Attribution,
   :rdfs/isDefinedBy    "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label          "TopQuadrant attribution",
   :vaem/name           "TopQuadrant, Inc.",
   :voag/hasLogo        :voag/TopQuadrantLogo-613x150,
   :voag/pointOfContact "Ralph Hodgson, TopQuadrant, Inc.",
   :voag/url            "http://www.topquadrant.com"})

(def TopQuadrantLogo-613x150
  "TopQuadrant Logo 613 x 150"
  {:db/ident :voag/TopQuadrantLogo-613x150,
   :rdf/type [:voag/AttributionLogo :voag/OrganizationLogo],
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "TopQuadrant Logo 613 x 150",
   :vaem/description
   "TopQuadrant's logo - diamond with company name to the right",
   :voag/height "150",
   :voag/image
   "http://www.linkedmodel.org/lib/lm/images/logos/TQ_logo_C_2009_SM_print.jpg",
   :voag/width "613"})

(def TurtleIcon-32bX35
  "Turtle Icon 32 X 35"
  {:db/ident :voag/TurtleIcon-32bX35,
   :rdf/type :voag/Icon,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "Turtle Icon 32 X 35",
   :vaem/description "Turtle is a representation format for RDF/OWL.",
   :voag/caption "Turtle ICON",
   :voag/height "35",
   :voag/image
   "http://www.linkedmodel.org/lib/lm/images/icons/turtle_icon_32x35.jpg",
   :voag/width "32"})

(def UncertainFrequency
  "Uncertain frequency"
  {:db/ident         :voag/UncertainFrequency,
   :rdf/type         :voag/ChangeFrequency,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Uncertain frequency"})

(def UnknownMaturity
  "Unknown maturity"
  {:db/ident         :voag/UnknownMaturity,
   :rdf/type         :voag/Maturity,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Unknown maturity"})

(def VAEM-CatalogEntry
  {:db/ident         :voag/VAEM-CatalogEntry,
   :rdf/type         :voag/SchemaGraph,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag"})

(def VAEM-XINA-CatalogEntry
  {:db/ident         :voag/VAEM-XINA-CatalogEntry,
   :rdf/type         :voag/SchemaGraph,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag"})

(def VOAG-CatalogEntry
  "VOAG Catalog Entry"
  {:db/ident         :voag/VOAG-CatalogEntry,
   :rdf/type         [:voag/SchemaGraph :vaem/CatalogEntry],
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "VOAG Catalog Entry"})

(def VOAG-OntologyLogo_360x110
  "VOAG Logo"
  {:db/ident :voag/VOAG-OntologyLogo_360x110,
   :rdf/type :voag/ProductLogo,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "VOAG Logo",
   :voag/caption "VOAG Logo",
   :voag/height "55",
   :voag/image
   "http://www.linkedmodel.org/lib/lm/images/logos/voag_logo_360x110.png",
   :voag/width "180"})

(def VocabGraph
  "Vocab graph"
  {:db/ident            :voag/VocabGraph,
   :owl/equivalentClass {:owl/intersectionOf [:voag/Graph
                                              {:owl/hasValue
                                               :vaem/VocabularyGraph,
                                               :owl/onProperty
                                               :vaem/hasGraphRole,
                                               :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class,
                         :rdfs/isDefinedBy
                         "http://voag.linkedmodel.org/schema/voag"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label          "Vocab graph",
   :rdfs/subClassOf     [:voag/Graph
                         {:owl/hasValue   :vaem/VocabularyGraph,
                          :owl/onProperty :vaem/hasGraphRole,
                          :rdf/type       :owl/Restriction}]})

(def Weekly
  "Weekly"
  {:db/ident         :voag/Weekly,
   :rdf/type         :voag/ChangeFrequency,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Weekly"})

(def WidelyAdopted
  "Widely adopted"
  {:db/ident         :voag/WidelyAdopted,
   :rdf/type         :voag/Maturity,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "Widely adopted"})

(def accountableFor
  "An object property used in governance that refers a resource to the party that is accountable for it."
  {:db/ident         :voag/accountableFor,
   :dcterms/description
   "An object property used in governance that refers a resource to the party that is accountable for it.",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "accountable for"})

(def approves
  "An object property that specifies that a party governs the approval of a resource."
  {:db/ident :voag/approves,
   :dcterms/description
   "An object property that specifies that a party governs the approval of a resource.",
   :owl/inverseOf :voag/isApprovedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "approves",
   :rdfs/subPropertyOf :voag/governs})

(def attributionText
  "attribution text"
  {:db/ident         :voag/attributionText,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "attribution text",
   :rdfs/range       :xsd/string})

(def caption
  "A short description, typically used on a table or a figure."
  {:db/ident :voag/caption,
   :dcterms/description
   "A short description, typically used on a table or a figure.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "caption",
   :rdfs/range :xsd/string})

(def compatibleWith
  "compatible with"
  {:db/ident         :voag/compatibleWith,
   :rdf/type         [:owl/ObjectProperty :owl/SymmetricProperty],
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "compatible with"})

(def curatedGraphURI
  "The property 'voag:curatedGraphURI' provides a means to specify the base URI of the specific version of the onotlogy that is being documented. In each versioned graph the 'vaem:namespace' carries a URI without a version number."
  {:db/ident :voag/curatedGraphURI,
   :dcterms/description
   "The property 'voag:curatedGraphURI' provides a means to specify the base URI of the specific version of the onotlogy that is being documented.  In each versioned graph the 'vaem:namespace' carries a URI without a version number.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "curated graph URI",
   :rdfs/range :xsd/anyURI})

(def deprecated
  "deprecated on"
  {:db/ident         :voag/deprecated,
   :rdf/type         [:rdf/Property :owl/AnnotationProperty],
   :rdfs/domain      :voag/LicenseModel,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "deprecated on",
   :rdfs/range       :vaem/date})

(def derivedFrom
  "derived from"
  {:db/ident         :voag/derivedFrom,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "derived from"})

(def disposition
  "used to connect to the text describing disposition of something, for example, a disposition of an issue"
  {:db/ident :voag/disposition,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "used to connect to the text describing disposition of something, for example, a disposition of an issue",
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "disposition",
   :rdfs/range :xsd/string})

(def dispositionStatus
  "An object propoert that denotes the state of a governance issue."
  {:db/ident           :voag/dispositionStatus,
   :dcterms/description
   "An object propoert that denotes the state of a governance issue.",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label         "disposition status",
   :rdfs/subPropertyOf :voag/hasApprovalStatus})

(def documentedAt
  "The property 'vaem:documentedAt' is intended for general use as the name implies. In some cases the property could have scalar values and in other cases may need to refer to a first class concept that holds more information about a documentation resource. For this reason, the type of this property is set as 'rdf:Property' and the property is rangeless."
  {:db/ident         :voag/documentedAt,
   :dcterms/description
   "The property 'vaem:documentedAt' is intended for general use as the name implies.  In some cases the property could have scalar values and in other cases may need to refer to a first class concept that holds more information about a documentation resource.  For this reason, the  type of this property is set as 'rdf:Property' and the property is rangeless.",
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "documented at"})

(def downloads
  "downloads"
  {:db/ident         :voag/downloads,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "downloads",
   :rdfs/range       :xsd/integer})

(def endDate
  "end date"
  {:db/ident         :voag/endDate,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "end date",
   :rdfs/range       :vaem/date})

(def eventDate
  "event date"
  {:db/ident         :voag/eventDate,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "event date",
   :rdfs/range       :vaem/date})

(def exclude
  "exclude"
  {:db/ident         :voag/exclude,
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "exclude",
   :rdfs/range       :xsd/boolean})

(def frequencyOfChange
  "frequency of change"
  {:db/ident         :voag/frequencyOfChange,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "frequency of change"})

(def givesConcurrenceFor
  "An object property that specifies what a party may need to give consent, in the form of agreement, either written or verbally for in the approval of some govenance concern. This is the inverse property of 'mayNeedConcurrenceFrom' and, as such, may be deprecated in the future."
  {:db/ident :voag/givesConcurrenceFor,
   :dcterms/description
   "An object property that specifies what a party may need to give consent, in the form of agreement, either written or verbally for in the approval of some govenance concern. This is the inverse property of 'mayNeedConcurrenceFrom' and, as such, may be deprecated in the future.",
   :owl/inverseOf :voag/mayNeedConcurrenceFrom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "gives concurrence for",
   :rdfs/subPropertyOf :voag/governs})

(def governs
  "A super-property of governance properties: 'approves', 'gives concurrence for', 'reviews' and 'witness to'."
  {:db/ident :voag/governs,
   :dcterms/description
   "A super-property of governance properties: 'approves', 'gives concurrence for', 'reviews' and 'witness to'.",
   :owl/inverseOf :voag/isGovernedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "governs"})

(def hasAccredidation
  "has accredidation"
  {:db/ident         :voag/hasAccredidation,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "has accredidation"})

(def hasAnticipatedChangeType
  "has anticipated change type"
  {:db/ident         :voag/hasAnticipatedChangeType,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "has anticipated change type"})

(def hasApplicableDocument
  "A document that is of help to application of the subject matter. Documents include specifications, models, standards, guidelines, handbooks and other special publications."
  {:db/ident         :voag/hasApplicableDocument,
   :dcterms/description
   "A document that is of help to application of the subject matter. Documents include specifications, models, standards, guidelines, handbooks and other special publications.",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "has applicable document"})

(def hasApprovalProcess
  "An object property that specifies a process that is used for approval in a 'Governance Protocol'."
  {:db/ident         :voag/hasApprovalProcess,
   :dcterms/description
   "An object property that specifies a process that is used for approval in a 'Governance Protocol'.",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "has approval process"})

(def hasApprovalStatus
  "An object property that referes to an enumerated value that denotes the state of an approval."
  {:db/ident         :voag/hasApprovalStatus,
   :dcterms/description
   "An object property that referes to an enumerated value that denotes the state of an approval.",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "has approval status"})

(def hasCategory
  "has category"
  {:db/ident         :voag/hasCategory,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "has category"})

(def hasChangeManagementProcess
  "An object property that specifies a process that is used for managing change in a 'Governance Protocol'."
  {:db/ident           :voag/hasChangeManagementProcess,
   :dcterms/description
   "An object property that specifies a process that is used for managing change in a 'Governance Protocol'.",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label         "has change management process",
   :rdfs/subPropertyOf :voag/hasProcess})

(def hasChangeType
  "has change type"
  {:db/ident         :voag/hasChangeType,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "has change type"})

(def hasConfidentiality
  "An object property that specifies a level of confidentiality. Typicall the range of this property will be 'voag:Confidentiality'."
  {:db/ident         :voag/hasConfidentiality,
   :dcterms/description
   "An object property that specifies a level of confidentiality. Typicall the range of this property will be 'voag:Confidentiality'.",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "has confidentiality"})

(def hasGovernance
  "has governance"
  {:db/ident         :voag/hasGovernance,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "has governance"})

(def hasGovernanceEvent
  "An event associated with governance processes."
  {:db/ident         :voag/hasGovernanceEvent,
   :dcterms/description "An event associated with governance processes.",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "has governance event"})

(def hasIdentifier
  "has identifier"
  {:db/ident         :voag/hasIdentifier,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "has identifier"})

(def hasIssue
  "A pointer to an issue that exists on a subject of interest."
  {:db/ident :voag/hasIssue,
   :dcterms/description
   "A pointer to an issue that exists on a subject of interest.",
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "has issue",
   :rdfs/range :voag/Issue})

(def hasIssueResolutionProcess
  "has issue resolution process"
  {:db/ident           :voag/hasIssueResolutionProcess,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label         "has issue resolution process",
   :rdfs/subPropertyOf :voag/hasProcess})

(def hasLogo
  "A property to reference an image that is used as a logo."
  {:db/ident :voag/hasLogo,
   :dcterms/description
   "A property to reference an image that is used as a logo.",
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "has logo",
   :rdfs/range :voag/Logo})

(def hasMaturity
  "has maturity"
  {:db/ident         :voag/hasMaturity,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "has maturity"})

(def hasNormativeDocument
  "has normative document"
  {:db/ident         :voag/hasNormativeDocument,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "has normative document"})

(def hasOntologyArchitectureDiagram
  "has ontology architecture diagram"
  {:db/ident         :voag/hasOntologyArchitectureDiagram,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "has ontology architecture diagram"})

(def hasOwner
  "has owner"
  {:db/ident         :voag/hasOwner,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "has owner"})

(def hasPedigree
  "A reference to a description about the pedigree of something."
  {:db/ident         :voag/hasPedigree,
   :dcterms/description
   "A reference to a description about the pedigree of something.",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "has pedigree"})

(def hasProcess
  "A reference to a process description."
  {:db/ident         :voag/hasProcess,
   :dcterms/description "A reference to a process description.",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "has process"})

(def hasProtocol
  "A pointer to a record that holds governance information for one or more governed entities. Often governance can be shared across entities."
  {:db/ident         :voag/hasProtocol,
   :dcterms/description
   "A pointer to a record that holds governance information for one or more governed entities. Often governance can be shared across entities.",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "has protocol"})

(def hasProvenance
  "A pointer to a provenance record that details the source, version and time of some subject of interest."
  {:db/ident         :voag/hasProvenance,
   :dcterms/description
   "A pointer to a provenance record that details the source, version and time of some subject of interest.",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "has provenance"})

(def hasReferenceDocument
  "has reference document"
  {:db/ident         :voag/hasReferenceDocument,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "has reference document"})

(def hasStakeholder
  "has stakeholder"
  {:db/ident         :voag/hasStakeholder,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "has stakeholder"})

(def hasStatus
  "has status"
  {:db/ident         :voag/hasStatus,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "has status"})

(def hasSteward
  "A pointer to the person that is a curator."
  {:db/ident         :voag/hasSteward,
   :dcterms/description "A pointer to the person that is a curator.",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "has steward"})

(def hasValue
  "has value"
  {:db/ident         :voag/hasValue,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "has value",
   :rdfs/range       :rdfs/Resource})

(def height
  "Height is typically used to specify an image's height attribute."
  {:db/ident :voag/height,
   :dcterms/description
   "Height is typically used to specify an image's height attribute.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "height",
   :rdfs/range :xsd/string})

(def id
  "id"
  {:db/ident         :voag/id,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "id",
   :rdfs/range       :xsd/anySimpleType})

(def image
  "The property 'vaem:image' points to an image using a URL."
  {:db/ident :voag/image,
   :dcterms/description
   "The property 'vaem:image' points  to an image using a URL.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "image",
   :rdfs/range :xsd/anyURI})

(def imageMap
  "image map"
  {:db/ident         :voag/imageMap,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "image map"})

(def incompatibleWith
  "incompatible with"
  {:db/ident         :voag/incompatibleWith,
   :rdf/type         [:owl/ObjectProperty :owl/SymmetricProperty],
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "incompatible with"})

(def instigatedBy
  "instigated by"
  {:db/ident         :voag/instigatedBy,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "instigated by"})

(def instigatingEvent
  "instigating event"
  {:db/ident         :voag/instigatingEvent,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "instigating event"})

(def intent
  "intent"
  {:db/ident         :voag/intent,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "intent",
   :rdfs/range       :xsd/string})

(def interestIn
  "interest in"
  {:db/ident         :voag/interestIn,
   :owl/inverseOf    :voag/isInterestOf,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "interest in"})

(def isApprovedBy
  "References to which parties approve an entity."
  {:db/ident           :voag/isApprovedBy,
   :dcterms/description "References to which parties approve an entity.",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label         "is approved by",
   :rdfs/subPropertyOf :voag/isGovernedBy})

(def isFOSS
  "A boolean property to specify whether or not software is free or open source. Free and open-source software (F/OSS, FOSS) or free/libre/open-source software (FLOSS) is software that is liberally licensed to grant the right of users to use, study, change, and improve its design through the availability of its source code."
  {:db/ident :voag/isFOSS,
   :dcterms/description
   "A boolean property to specify whether or not software is free or open source. Free and open-source software (F/OSS, FOSS) or free/libre/open-source software (FLOSS) is software that is liberally licensed to grant the right of users to use, study, change, and improve its design through the availability of its source code.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "is FOSS",
   :rdfs/range :xsd/boolean})

(def isGovernedBy
  "A pointer to who is responsible for the governance of some entity of interest. This is a two-way reference with the inverse property 'governs'."
  {:db/ident         :voag/isGovernedBy,
   :dcterms/description
   "A pointer to who is responsible for the governance of some entity of interest. This is a two-way reference with the inverse property 'governs'.",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "is governed by"})

(def isITAR
  "International Traffic in Arms Regulations (ITAR) is a set of United States government regulations that control the export and import of defense-related articles and services on the United States Munitions List. These regulations implement the provisions of the Arms Export Control Act, and are described in Title 22 (Foreign Relations), Chapter I (Department of State), Subchapter M of the Code of Federal Regulations. The Department of State interprets and enforces ITAR. Its goal is to advance national strategic objectives and U.S. foreign policy via the trade controls. For practical purposes, ITAR regulations dictate that information and material pertaining to defense and military related technologies may only be shared with US Persons unless approval from the Department of State is received or a special exemption is used."
  {:db/ident :voag/isITAR,
   :dcterms/description
   "International Traffic in Arms Regulations (ITAR) is a set of United States government regulations that control the export and import of defense-related articles and services on the United States Munitions List. These regulations implement the provisions of the Arms Export Control Act, and are described in Title 22 (Foreign Relations), Chapter I (Department of State), Subchapter M of the Code of Federal Regulations. The Department of State interprets and enforces ITAR. Its goal is to advance national strategic objectives and U.S. foreign policy via the trade controls. For practical purposes, ITAR regulations dictate that information and material pertaining to defense and military related technologies may only be shared with US Persons unless approval from the Department of State is received or a special exemption is used.",
   :rdf/type [:owl/DatatypeProperty :owl/DeprecatedProperty],
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "is ITAR",
   :rdfs/range :xsd/boolean})

(def isInterestOf
  "A pointer to parties who have an interest in an entity. This is a two-way reference with the inverse property 'interestIn'."
  {:db/ident         :voag/isInterestOf,
   :dcterms/description
   "A pointer to parties who have an interest in an entity. This is a two-way reference with the inverse property 'interestIn'.",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "interest of"})

(def jurisdiction
  "jurisdiction"
  {:db/ident         :voag/jurisdiction,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain      :voag/LicenseModel,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       [{:rdf/language "en-us",
                       :rdf/value    "jurisdiction"}
                      "jurisdiction"],
   :rdfs/range       :voag/CreativeCommonsJurisdiction})

(def legalcode
  "legalcode"
  {:db/ident         :voag/legalcode,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain      :voag/LicenseModel,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "legalcode",
   :rdfs/range       :rdfs/Resource})

(def licence
  "licence"
  {:db/ident         :voag/licence,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "licence",
   :rdfs/range       :xsd/string})

(def mayNeedConcurrenceFrom
  "An object property that specifies that a party may need to give consent, in the form of agreement, either written or verbally to the approval of some govenance concern."
  {:db/ident :voag/mayNeedConcurrenceFrom,
   :dcterms/description
   "An object property that specifies that a party may need to give consent, in the form of agreement, either written or verbally to the approval of some govenance concern.",
   :owl/inverseOf :voag/givesConcurrenceFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "may need concurrence from",
   :rdfs/subPropertyOf :voag/isGovernedBy})

(def morePermissions
  "more permissions"
  {:db/ident         :voag/morePermissions,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain      :voag/CreativeCommonsWork,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "more permissions",
   :rdfs/range       :rdfs/Resource})

(def normativeReference
  "normative reference"
  {:db/ident         :voag/normativeReference,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "normative reference"})

(def normativeURL
  "normative URL"
  {:db/ident         :voag/normativeURL,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "normative URL",
   :rdfs/range       :xsd/anyURI})

(def obsoletedBy
  "obsoleted by"
  {:db/ident         :voag/obsoletedBy,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "obsoleted by"})

(def ownedBy
  "owned by"
  {:db/ident         :voag/ownedBy,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "owned by",
   :rdfs/range       :xsd/string})

(def owner
  "owner"
  {:db/ident         :voag/owner,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "owner"})

(def owns
  "owns"
  {:db/ident         :voag/owns,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "owns"})

(def participant
  "participant"
  {:db/ident         :voag/participant,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "participant"})

(def performedBy
  "performed by"
  {:db/ident         :voag/performedBy,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "performed by"})

(def permits
  "permits"
  {:db/ident         :voag/permits,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain      :voag/LicenseModel,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       [{:rdf/language "en-us",
                       :rdf/value    "permits"}
                      "permits"],
   :rdfs/range       :voag/CreativeCommonsPermission})

(def pointOfContact
  "point of contact"
  {:db/ident         :voag/pointOfContact,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "point of contact",
   :rdfs/range       :xsd/string})

(def preparedBy
  "prepared by"
  {:db/ident           :voag/preparedBy,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label         "prepared by",
   :rdfs/subPropertyOf :voag/isGovernedBy})

(def priority
  "priority"
  {:db/ident         :voag/priority,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "priority"})

(def prohibits
  "prohibits"
  {:db/ident         :voag/prohibits,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain      :voag/LicenseModel,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       [{:rdf/language "en-us",
                       :rdf/value    "prohibits"}
                      "prohibits"],
   :rdfs/range       :voag/CreativeCommonsProhibition})

(def proprietary
  "A boolean flag to indicate if an information asset is propretary."
  {:db/ident :voag/proprietary,
   :dcterms/description
   "A boolean flag to indicate if an information asset is propretary.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "proprietary",
   :rdfs/range :xsd/boolean})

(def relatedIssue
  "This property connects two issue events. Issues connected by this property must be about the same subject"
  {:db/ident :voag/relatedIssue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "This property connects two issue events. Issues connected by this property must be about the same subject",
   :rdfs/domain :voag/Issue,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "related issue",
   :rdfs/range :voag/Issue})

(def relatedTo
  "related to"
  {:db/ident         :voag/relatedTo,
   :rdf/type         [:owl/ObjectProperty :owl/SymmetricProperty],
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "related to"})

(def releaseDate
  "release date"
  {:db/ident         :voag/releaseDate,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "release date",
   :rdfs/range       :vaem/date})

(def requires
  "requires"
  {:db/ident         :voag/requires,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain      :voag/LicenseModel,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       [{:rdf/language "en-us",
                       :rdf/value    "requires"}
                      "requires"],
   :rdfs/range       :voag/CreativeCommonsRequirement})

(def reviewedBy
  "References to which parties review a data or information asset."
  {:db/ident :voag/reviewedBy,
   :dcterms/description
   "References to which parties review a data or information asset.",
   :owl/inverseOf :voag/reviews,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "reviewed by",
   :rdfs/subPropertyOf :voag/isGovernedBy})

(def reviews
  "reviews"
  {:db/ident           :voag/reviews,
   :owl/inverseOf      :voag/reviewedBy,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label         "reviews",
   :rdfs/subPropertyOf :voag/governs})

(def rights
  "subject"
  {:db/ident         :voag/rights,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "subject",
   :rdfs/range       :xsd/string})

(def source
  "source"
  {:db/ident         :voag/source,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "source"})

(def startDate
  "start date"
  {:db/ident         :voag/startDate,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "start date",
   :rdfs/range       :vaem/date})

(def subject
  "subject"
  {:db/ident         :voag/subject,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "subject",
   :rdfs/range       :xsd/string})

(def submittedBy
  "submitted by"
  {:db/ident           :voag/submittedBy,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label         "submitted by",
   :rdfs/subPropertyOf :voag/isGovernedBy})

(def supercededBy
  "A pointer to one or more 'GovernedEntities' that replace this entity."
  {:db/ident :voag/supercededBy,
   :dcterms/description
   "A pointer to one or more 'GovernedEntities' that replace this entity.",
   :owl/inverseOf :voag/supercedes,
   :rdf/type [:owl/ObjectProperty :owl/TransitiveProperty],
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "superceded by"})

(def supercedes
  "A pointer to one or more 'GovernedEntities' that are replaced by this entity."
  {:db/ident :voag/supercedes,
   :dcterms/description
   "A pointer to one or more 'GovernedEntities' that are replaced by this entity.",
   :owl/inverseOf :voag/supercededBy,
   :rdf/type [:owl/ObjectProperty :owl/TransitiveProperty],
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "supercedes"})

(def supervisedBy
  "supervised by"
  {:db/ident           :voag/supervisedBy,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label         "supervised by",
   :rdfs/subPropertyOf :voag/isGovernedBy})

(def timestamp
  "timestamp"
  {:db/ident         :voag/timestamp,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "timestamp",
   :rdfs/range       :xsd/dateTime})

(def title
  "title"
  {:db/ident         :voag/title,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "title",
   :rdfs/range       :xsd/string})

(def url
  "url"
  {:db/ident         :voag/url,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "url",
   :rdfs/range       :xsd/anyURI})

(def urlForHTML
  "url for HTML"
  {:db/ident         :voag/urlForHTML,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "url for HTML",
   :rdfs/range       :xsd/anyURI})

(def urlOfRDFfile
  "Used to refer to a an RDF XML representation of an ontology"
  {:db/ident :voag/urlOfRDFfile,
   :dcterms/description
   "Used to refer to a an RDF XML representation of an ontology",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "url address of RDF file",
   :rdfs/range :xsd/anyURI})

(def urlOfTurtleFile
  "Used to refer to a Turtle (N3) representation of an ontology"
  {:db/ident :voag/urlOfTurtleFile,
   :dcterms/description
   "Used to refer to a Turtle (N3) representation of an ontology",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label "url of turtle file",
   :rdfs/range :xsd/anyURI})

(def usage
  "usage"
  {:db/ident         :voag/usage,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "usage",
   :rdfs/range       :xsd/string})

(def useGuidelines
  "use guidelines"
  {:db/ident         :voag/useGuidelines,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :voag/CreativeCommonsWork,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "use guidelines",
   :rdfs/range       :rdfs/Resource})

(def usedBy
  "The property 'usedBy' is a general property to record a dependency. One use is in stating how a schema or a vocabulary is used by another ontology graph."
  {:db/ident         :voag/usedBy,
   :dcterms/description
   "The property 'usedBy' is a general property to record a dependency. One use is in stating how a schema or a vocabulary is used by another ontology graph.",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "used by"})

(def userID
  "user ID"
  {:db/ident         :voag/userID,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "user ID",
   :rdfs/range       :xsd/anySimpleType})

(def width
  "Width is typically used to specify an image's width attribute."
  {:db/ident         :voag/width,
   :dcterms/description
   "Width is typically used to specify an image's width attribute.",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label       "width"})

(def witnessTo
  "witness to"
  {:db/ident           :voag/witnessTo,
   :owl/inverseOf      :voag/witnessedBy,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label         "witness to",
   :rdfs/subPropertyOf :voag/governs})

(def witnessedBy
  "wintnessed by"
  {:db/ident           :voag/witnessedBy,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://voag.linkedmodel.org/schema/voag",
   :rdfs/label         "wintnessed by",
   :rdfs/subPropertyOf :voag/isGovernedBy})
