(ns net.wikipunk.rdf.dpvo
  "The Data Privacy Vocabulary (DPV) provides terms (classes and properties) to represent information about legally compliant personal data handling, which includes purposes, processing, personal data, technical and organisational measures."
  {:dcterms/abstract
   "The Data Privacy Vocabulary (DPV) provides terms (classes and properties) to represent information about legally compliant personal data handling, which includes purposes, processing, personal data, technical and organisational measures.",
   :dcterms/contributor ["Rigo Wenning"
                         "Georg P Krog"
                         "Simon Steyskal"
                         "Harshvardhan J. Pandit"
                         "Piero Bonatti"
                         "Elmar Kiesling"
                         "Paul Ryan"
                         "Bert Bos"
                         "Javier D. Fernández"
                         "Mark Lizar"
                         "Rob Brennan"
                         "Axel Polleres"
                         "Eva Schlehahn"
                         "Bud Bruegger"
                         "Beatriz Esteves"
                         "Ramisa Gachpaz Hamed"
                         "Julian Flake"
                         "Fajar J. Ekaputra"],
   :dcterms/created #inst "2019-06-18T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Axel Polleres"],
   :dcterms/description
   "The Data Privacy Vocabulary (DPV) provides terms (classes and properties) to represent information about legally compliant personal data handling, which includes purposes, processing, personal data, technical and organisational measures.",
   :dcterms/license "https://www.w3.org/Consortium/Legal/2015/doc-license",
   :dcterms/modified #inst "2022-12-05T00:00:00.000-05:00",
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :dcterms/title "Data Privacy Vocabulary",
   :owl/versionInfo "1",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "dpvo" "https://w3id.org/dpv/dpv-owl#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "vann" "http://purl.org/vocab/vann/",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "dpvo",
   :rdfa/uri "https://w3id.org/dpv/dpv-owl",
   :vann/preferredNamespacePrefix "dpvo",
   :vann/preferredNamespaceUri "https://w3id.org/dpv/dpv-owl#"})

(def AcademicResearch
  "Purposes associated with conducting or assisting with research conducted in an academic context e.g. within universities"
  {:db/ident :dpvo/AcademicResearch,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres"
                     "Simon Steyskal"
                     "Javier Fernandez"
                     "Elmar Kiesling"
                     "Harshvardhan J. Pandit"
                     "Fajar Ekaputra"],
   :dcterms/description
   "Purposes associated with conducting or assisting with research conducted in an academic context e.g. within universities",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Academic Research",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/purposes#Education"],
   :rdfs/subClassOf
   [:dpvo/ResearchAndDevelopment :dpvo/AcademicResearch :dpvo/Purpose],
   :vs/term_status "accepted"})

(def AcademicScientificOrganisation
  "Organisations related to academia or scientific pursuits e.g. Universities, Schools, Research Bodies"
  {:db/ident :dpvo/AcademicScientificOrganisation,
   :dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Organisations related to academia or scientific pursuits e.g. Universities, Schools, Research Bodies",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :dcterms/source "http://purl.org/adms",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Academic or Scientific Organisation",
   :rdfs/subClassOf [:dpvo/Organisation
                     :dpvo/AcademicScientificOrganisation
                     :dpvo/Entity
                     :dpvo/LegalEntity],
   :vs/term_status "modified"})

(def Access
  "to access data"
  {:db/ident            :dpvo/Access,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description "to access data",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Access",
   :rdfs/subClassOf     [:dpvo/Use :dpvo/Access :dpvo/Processing],
   :vs/term_status      "accepted"})

(def AccessControlMethod
  "Methods which restrict access to a place or resource"
  {:db/ident            :dpvo/AccessControlMethod,
   :dcterms/created     #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator     ["Axel Polleres"
                         "Harshvardhan J. Pandit"
                         "Rob Brennan"
                         "Mark Lizar"],
   :dcterms/description "Methods which restrict access to a place or resource",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Access Control Method",
   :rdfs/subClassOf     [:dpvo/TechnicalMeasure
                         :dpvo/AccessControlMethod
                         :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status      "accepted"})

(def AccountManagement
  "Account Management refers to purposes associated with account management, such as to create, provide, maintain, and manage accounts"
  {:db/ident :dpvo/AccountManagement,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Beatriz Esteves" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   "Account Management refers to purposes associated with account management, such as to create, provide, maintain, and manage accounts",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Account Management",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/AccountManagement],
   :vs/term_status "accepted"})

(def Acquire
  "to come into possession or control of the data"
  {:db/ident :dpvo/Acquire,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description "to come into possession or control of the data",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Acquire",
   :rdfs/subClassOf [:dpvo/Obtain :dpvo/Acquire :dpvo/Processing],
   :vs/term_status "accepted"})

(def ActiveRight
  "The right(s) applicable, provided, or expected that need to be (actively) exercised"
  {:db/ident :dpvo/ActiveRight,
   :dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Paul Ryan" "Beatriz Esteves" "Harshvardhan J Pandit"],
   :dcterms/description
   "The right(s) applicable, provided, or expected that need to be (actively) exercised",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Active rights require the entity to expressly exercise them. For example, a Data Subject exercising their right to withdraw their consent.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Active Right",
   :rdfs/subClassOf [:dpvo/Right :dpvo/ActiveRight],
   :vs/term_status "accepted"})

(def ActivityCompleted
  "State of an activity that has completed i.e. is fully in the past"
  {:db/ident :dpvo/ActivityCompleted,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "State of an activity that has completed i.e. is fully in the past",
   :rdf/type
   [:owl/NamedIndividual :dpvo/ActivityStatus :dpvo/Status :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Activity Completed",
   :vs/term_status "accepted"})

(def ActivityHalted
  "State of an activity that was occuring in the past, and has been halted or paused or stoped"
  {:db/ident :dpvo/ActivityHalted,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "State of an activity that was occuring in the past, and has been halted or paused or stoped",
   :rdf/type
   [:owl/NamedIndividual :dpvo/ActivityStatus :dpvo/Status :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Activity Halted",
   :vs/term_status "accepted"})

(def ActivityMonitoring
  "Monitoring of activities including assessing whether they have been successfully initiated and completed"
  {:db/ident :dpvo/ActivityMonitoring,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Monitoring of activities including assessing whether they have been successfully initiated and completed",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Activity Monitoring",
   :rdfs/subClassOf [:dpvo/TechnicalMeasure
                     :dpvo/ActivityMonitoring
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def ActivityNotCompleted
  "State of an activity that could not be completed, but has reached some end state"
  {:db/ident :dpvo/ActivityNotCompleted,
   :dcterms/created #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "State of an activity that could not be completed, but has reached some end state",
   :rdf/type
   [:dpvo/ActivityStatus :owl/NamedIndividual :dpvo/Status :dpvo/Context],
   :rdfs/comment
   "This relates to a 'Stop' state as distinct from a 'Halt' state. It makes no comments on whether the Acitivity can be resumed or continued towards completion.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Acitivity Not Completed",
   :vs/term_status "accepted"})

(def ActivityOngoing
  "State of an activity occuring in continuation i.e. currently ongoing"
  {:db/ident :dpvo/ActivityOngoing,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "State of an activity occuring in continuation i.e. currently ongoing",
   :rdf/type
   [:owl/NamedIndividual :dpvo/ActivityStatus :dpvo/Status :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Activity Ongoing",
   :vs/term_status "accepted"})

(def ActivityProposed
  "State of an activity being proposed or planned i.e. yet to occur"
  {:db/ident :dpvo/ActivityProposed,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "State of an activity being proposed or planned i.e. yet to occur",
   :rdf/type
   [:dpvo/ActivityStatus :owl/NamedIndividual :dpvo/Status :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Activity Proposed",
   :vs/term_status "accepted"})

(def ActivityStatus
  "Status associated with activity operations and lifecycles"
  {:db/ident :dpvo/ActivityStatus,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Status associated with activity operations and lifecycles",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Activity Status",
   :rdfs/subClassOf [:dpvo/Status :dpvo/ActivityStatus :dpvo/Context],
   :vs/term_status "accepted"})

(def Adapt
  "to modify the data, often rewritten into a new form for a new use"
  {:db/ident :dpvo/Adapt,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   "to modify the data, often rewritten into a new form for a new use",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Adapt",
   :rdfs/subClassOf [:dpvo/Transform :dpvo/Adapt :dpvo/Processing],
   :vs/term_status "accepted"})

(def Adult
  "A natural person that is not a child i.e. has attained some legally specified age of adulthood"
  {:db/ident :dpvo/Adult,
   :dcterms/created #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator "Georg Krog",
   :dcterms/description
   "A natural person that is not a child i.e. has attained some legally specified age of adulthood",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Adult",
   :rdfs/subClassOf [:dpvo/DataSubject
                     :dpvo/Adult
                     :dpvo/Entity
                     :dpvo/NaturalPerson
                     :dpvo/LegalEntity],
   :vs/term_status "accepted"})

(def Advertising
  "Purposes associated with conducting advertising i.e. process or artefact used to call attention to a product, service, etc. through announcements, notices, or other forms of communication"
  {:db/ident :dpvo/Advertising,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog" "Beatriz Esteves"],
   :dcterms/description
   "Purposes associated with conducting advertising i.e. process or artefact used to call attention to a product, service, etc. through announcements, notices, or other forms of communication",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Advertising is a subset of Marketing. Advertising by itself does not indicate 'personalisation' i.e. personalised ads.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Advertising",
   :rdfs/subClassOf [:dpvo/Marketing :dpvo/Advertising :dpvo/Purpose],
   :vs/term_status "accepted"})

(def AlgorithmicLogic
  "The algorithmic logic applied or used"
  {:db/ident :dpvo/AlgorithmicLogic,
   :dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "The algorithmic logic applied or used",
   :dcterms/modified #inst "2022-06-15T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Algorithmic Logic is intended as a broad concept for explaining the use of algorithms and automated decisions making within Processing. To describe the actual algorithm, see the Algorithm concept.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Algorithmic Logic",
   :rdfs/subClassOf [:dpvo/AutomationOfProcessing
                     :dpvo/AlgorithmicLogic
                     :dpvo/Context
                     :dpvo/ProcessingContext],
   :vs/term_status "accepted"})

(def Align
  "to adjust the data to be in relation to another data"
  {:db/ident :dpvo/Align,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description "to adjust the data to be in relation to another data",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Align",
   :rdfs/subClassOf [:dpvo/Transform :dpvo/Align :dpvo/Processing],
   :vs/term_status "accepted"})

(def Alter
  "to change the data without changing it into something else"
  {:db/ident :dpvo/Alter,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   "to change the data without changing it into something else",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Alter",
   :rdfs/subClassOf [:dpvo/Transform :dpvo/Alter :dpvo/Processing],
   :vs/term_status "accepted"})

(def Analyse
  "to study or examine the data in detail"
  {:db/ident :dpvo/Analyse,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description "to study or examine the data in detail",
   :dcterms/source "https://specialprivacy.ercim.eu/vocabs/processing",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Analyse",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/processing#Analyse"],
   :rdfs/subClassOf [:dpvo/Use :dpvo/Analyse :dpvo/Processing],
   :vs/term_status "accepted"})

(def Anonymisation
  "Anonymisation is the process by which data is irreversibly altered in such a way that a data subject can no longer be identified directly or indirectly, either by the entity holding the data alone or in collaboration with other entities and information sources"
  {:db/ident :dpvo/Anonymisation,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Rob Brennan" "Mark Lizar" "Axel Polleres"],
   :dcterms/description
   "Anonymisation is the process by which data is irreversibly altered in such a way that a data subject can no longer be identified directly or indirectly, either by the entity holding the data alone or in collaboration with other entities and information sources",
   :dcterms/modified #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source "https://www.iso.org/standard/45123.html",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Anonymisation",
   :rdfs/subClassOf [:dpvo/Deidentification
                     :dpvo/Anonymisation
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure
                     :dpvo/DataSanitisationTechnique],
   :vs/term_status "modified"})

(def Anonymise
  "to irreversibly alter personal data in such a way that an unique data subject can no longer be identified directly or indirectly or in combination with other data"
  {:db/ident :dpvo/Anonymise,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   "to irreversibly alter personal data in such a way that an unique data subject can no longer be identified directly or indirectly or in combination with other data",
   :dcterms/source "https://specialprivacy.ercim.eu/vocabs/processing",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Anonymise",
   :rdfs/seeAlso
   ["https://specialprivacy.ercim.eu/vocabs/processing#Anonymise"],
   :rdfs/subClassOf [:dpvo/Transform :dpvo/Anonymise :dpvo/Processing],
   :vs/term_status "accepted"})

(def AnonymisedData
  "Personal Data that has been (fully and completely) anonymised so that it is no longer considered Personal Data"
  {:db/ident :dpvo/AnonymisedData,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Piero Bonatti",
   :dcterms/description
   "Personal Data that has been (fully and completely) anonymised so that it is no longer considered Personal Data",
   :rdf/type :owl/Class,
   :rdfs/comment
   "It is advised to carefully consider indicating data is fully or completely anonymised by determining whether the data by itself or in combination with other data can identify a person. Failing this condition, the data should be denoted as PseudonymisedData. To indicate data is anonymised only for a specified entity (e.g. within an organisation), the concept ContextuallyAnonymisedData (as subclass of PseudonymisedData) should be used instead of AnonymisedData.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Anonymised Data",
   :rdfs/subClassOf [:dpvo/NonPersonalData :dpvo/AnonymisedData :dpvo/Data],
   :vs/term_status "accepted"})

(def AntiTerrorismOperations
  "Purposes associated with activities that detect, prevent, mitigate, or perform other activities for anti-terrorism"
  {:db/ident :dpvo/AntiTerrorismOperations,
   :dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Purposes associated with activities that detect, prevent, mitigate, or perform other activities for anti-terrorism",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Anti-Terrorism Operations",
   :rdfs/subClassOf
   [:dpvo/EnforceSecurity :dpvo/AntiTerrorismOperations :dpvo/Purpose],
   :vs/term_status "accepted"})

(def Applicant
  "Data subjects that are applicants in some context"
  {:db/ident            :dpvo/Applicant,
   :dcterms/created     #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     ["Julian Flake"
                         "Paul Ryan"
                         "Harshvardhan J. Pandit"
                         "Beatriz Esteves"
                         "Georg P. Krog"],
   :dcterms/description "Data subjects that are applicants in some context",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Applicant",
   :rdfs/subClassOf     [:dpvo/DataSubject
                         :dpvo/Applicant
                         :dpvo/Entity
                         :dpvo/NaturalPerson
                         :dpvo/LegalEntity],
   :vs/term_status      "accepted"})

(def Assess
  "to assess data for some criteria"
  {:db/ident            :dpvo/Assess,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description "to assess data for some criteria",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Assess",
   :rdfs/subClassOf     [:dpvo/Use :dpvo/Assess :dpvo/Processing],
   :vs/term_status      "accepted"})

(def Assessment
  "The document, plan, or process for assessment or determination towards a purpose e.g. assessment of legality or impact assessments"
  {:db/ident :dpvo/Assessment,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The document, plan, or process for assessment or determination towards a purpose e.g. assessment of legality or impact assessments",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Assessment",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/Assessment
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def AssetManagementProcedures
  "Procedures related to management of assets"
  {:db/ident :dpvo/AssetManagementProcedures,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Procedures related to management of assets",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Asset Management Procedures",
   :rdfs/subClassOf [:dpvo/GovernanceProcedures
                     :dpvo/AssetManagementProcedures
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def AsylumSeeker
  "Data subjects that are asylum seekers"
  {:db/ident            :dpvo/AsylumSeeker,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description "Data subjects that are asylum seekers",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Asylum Seeker",
   :rdfs/subClassOf     [:dpvo/VulnerableDataSubject
                         :dpvo/AsylumSeeker
                         :dpvo/DataSubject
                         :dpvo/Entity
                         :dpvo/NaturalPerson
                         :dpvo/LegalEntity],
   :vs/term_status      "accepted"})

(def AsymmetricCryptography
  "Use of public-key cryptography or asymmetric cryptography involving a public and private pair of keys"
  {:db/ident :dpvo/AsymmetricCryptography,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Use of public-key cryptography or asymmetric cryptography involving a public and private pair of keys",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Asymmetric Cryptography",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/AsymmetricCryptography
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def AsymmetricEncryption
  "Use of asymmetric cryptography to encrypt data"
  {:db/ident :dpvo/AsymmetricEncryption,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Use of asymmetric cryptography to encrypt data",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Asymmetric Encryption",
   :rdfs/subClassOf [:dpvo/Encryption
                     :dpvo/AsymmetricEncryption
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def AuditApproved
  "State of being approved through the audit"
  {:db/ident            :dpvo/AuditApproved,
   :dcterms/created     #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "State of being approved through the audit",
   :rdf/type            [:dpvo/AuditStatus
                         :owl/NamedIndividual
                         :dpvo/Status
                         :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Audit Approved",
   :vs/term_status      "accepted"})

(def AuditConditionallyApproved
  "State of being conditionally approved through the audit"
  {:db/ident :dpvo/AuditConditionallyApproved,
   :dcterms/created #inst "2022-06-29T00:00:00.000-04:00",
   :dcterms/creator "Paul Ryan",
   :dcterms/description
   "State of being conditionally approved through the audit",
   :rdf/type
   [:dpvo/AuditStatus :owl/NamedIndividual :dpvo/Status :dpvo/Context],
   :rdfs/comment
   "A \"conditional approval\" is intended to reflect states where the audit has identified further changes which must be implemented before considering the audit has been 'passed', without requiring another audit to validate them. This is distinct from the case where an audit has state 'rejected', which means changes must be made and submitted for review. The requirements of a 'conditional acceptance' are expected to be minor or not significant enough to warrant another audit to review them.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Audit Conditionally Approved",
   :vs/term_status "accepted"})

(def AuditNotRequired
  "State where an audit is determined as not being required"
  {:db/ident :dpvo/AuditNotRequired,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "State where an audit is determined as not being required",
   :rdf/type
   [:dpvo/AuditStatus :owl/NamedIndividual :dpvo/Status :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Audit Not Required",
   :vs/term_status "accepted"})

(def AuditRejected
  "State of not being approved or being rejected through the audit"
  {:db/ident :dpvo/AuditRejected,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "State of not being approved or being rejected through the audit",
   :rdf/type
   [:owl/NamedIndividual :dpvo/AuditStatus :dpvo/Status :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Audit Rejected",
   :vs/term_status "accepted"})

(def AuditRequested
  "State of an audit being requested whose outcome is not yet known"
  {:db/ident :dpvo/AuditRequested,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "State of an audit being requested whose outcome is not yet known",
   :rdf/type
   [:dpvo/AuditStatus :owl/NamedIndividual :dpvo/Status :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Audit Requested",
   :vs/term_status "accepted"})

(def AuditRequired
  "State where an audit is determined as being required but has not been conducted"
  {:db/ident :dpvo/AuditRequired,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "State where an audit is determined as being required but has not been conducted",
   :rdf/type
   [:dpvo/AuditStatus :owl/NamedIndividual :dpvo/Status :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Audit Required",
   :vs/term_status "accepted"})

(def AuditStatus
  "Status associated with Auditing or Investigation"
  {:db/ident            :dpvo/AuditStatus,
   :dcterms/created     #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Status associated with Auditing or Investigation",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Audit Status",
   :rdfs/subClassOf     [:dpvo/Status :dpvo/AuditStatus :dpvo/Context],
   :vs/term_status      "accepted"})

(def Authentication-ABC
  "Use of Attribute Based Credentials (ABC) to perform and manage authentication"
  {:db/ident :dpvo/Authentication-ABC,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Use of Attribute Based Credentials (ABC) to perform and manage authentication",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Authentication using ABC",
   :rdfs/subClassOf [:dpvo/CryptographicAuthentication
                     :dpvo/Authentication-ABC
                     :dpvo/AuthenticationProtocols
                     :dpvo/CryptographicMethods
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def Authentication-PABC
  "Use of Privacy-enhacing Attribute Based Credentials (ABC) to perform and manage authentication"
  {:db/ident :dpvo/Authentication-PABC,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Use of Privacy-enhacing Attribute Based Credentials (ABC) to perform and manage authentication",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Authentication using PABC",
   :rdfs/subClassOf [:dpvo/CryptographicAuthentication
                     :dpvo/Authentication-PABC
                     :dpvo/AuthenticationProtocols
                     :dpvo/CryptographicMethods
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def AuthenticationProtocols
  "Protocols involving validation of identity i.e. authentication of a person or information"
  {:db/ident :dpvo/AuthenticationProtocols,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Rob Brennan" "Axel Polleres" "Harshvardhan J. Pandit" "Mark Lizar"],
   :dcterms/description
   "Protocols involving validation of identity i.e. authentication of a person or information",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Authentication Protocols",
   :rdfs/subClassOf [:dpvo/TechnicalMeasure
                     :dpvo/AuthenticationProtocols
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def AuthorisationProcedure
  "Procedures for determining authorisation through permission or authority"
  {:db/ident :dpvo/AuthorisationProcedure,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Axel Polleres" "Rob Brennan" "Mark Lizar" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Procedures for determining authorisation through permission or authority",
   :rdf/type :owl/Class,
   :rdfs/comment
   "non-technical authorisation procedures: How is it described on an organisational level, who gets access to the data",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Authorisation Procedure",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/AuthorisationProcedure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def AuthorisationProtocols
  "Protocols involving authorisation of roles or profiles to determine permission, rights, or privileges"
  {:db/ident :dpvo/AuthorisationProtocols,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Protocols involving authorisation of roles or profiles to determine permission, rights, or privileges",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Authorisation Protocols",
   :rdfs/subClassOf [:dpvo/TechnicalMeasure
                     :dpvo/AuthorisationProtocols
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def Authority
  "An authority with the power to create or enforce laws, or determine their compliance."
  {:db/ident :dpvo/Authority,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan Pandit" "Georg Krog"],
   :dcterms/description
   "An authority with the power to create or enforce laws, or determine their compliance.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Authority",
   :rdfs/subClassOf [:dpvo/GovernmentalOrganisation
                     :dpvo/LegalEntity
                     :dpvo/Authority
                     :dpvo/Organisation
                     :dpvo/Entity],
   :vs/term_status "accepted"})

(def AutomatedDecisionMaking
  "Processing that involves automated decision making"
  {:db/ident :dpvo/AutomatedDecisionMaking,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Piero Bonatti" "Harshvardhan J. Pandit"],
   :dcterms/description "Processing that involves automated decision making",
   :dcterms/modified #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Automated decision making can be defined as “the ability to make decisions by technological means without human involvement.” (“Guidelines on Automated individual decision-making and Profiling for the purposes of Regulation 2016/679 (wp251rev.01)”, 2018, p. 8)",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Automated Decision Making",
   :rdfs/subClassOf [:dpvo/AutomationOfProcessing
                     :dpvo/DecisionMaking
                     :dpvo/AutomatedDecisionMaking
                     :dpvo/Context
                     :dpvo/ProcessingContext],
   :vs/term_status "modified"})

(def AutomatedProcessingWithHumanInput
  "Processing that is automated and involves inputs by Humans"
  {:db/ident :dpvo/AutomatedProcessingWithHumanInput,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Processing that is automated and involves inputs by Humans",
   :dcterms/modified #inst "2022-09-07T00:00:00.000-04:00",
   :rdf/type [:owl/NamedIndividual
              :dpvo/HumanInvolvementForInput
              :dpvo/AutomationOfProcessing
              :dpvo/ProcessingContext
              :dpvo/Context],
   :rdfs/comment
   "For example, an algorithm that takes inputs from humans and performs operations based on them",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Automated Processing with Human Input",
   :vs/term_status "accepted"})

(def AutomatedProcessingWithHumanOversight
  "Processing that is automated and involves oversight by Humans"
  {:db/ident :dpvo/AutomatedProcessingWithHumanOversight,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Processing that is automated and involves oversight by Humans",
   :dcterms/modified #inst "2022-09-07T00:00:00.000-04:00",
   :rdf/type [:dpvo/AutomationOfProcessing
              :dpvo/HumanInvolvementForOversight
              :owl/NamedIndividual
              :dpvo/ProcessingContext
              :dpvo/Context],
   :rdfs/comment
   "For example, a human watching metrics to ensure correctness of procedural values and outputs as processing takes place",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Automated Processing with Human Oversight",
   :vs/term_status "accepted"})

(def AutomatedProcessingWithHumanReview
  "Processing that is automated and involves review by Humans"
  {:db/ident :dpvo/AutomatedProcessingWithHumanReview,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Processing that is automated and involves review by Humans",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type [:dpvo/HumanInvolvementForVerification
              :owl/NamedIndividual
              :dpvo/AutomationOfProcessing
              :dpvo/ProcessingContext
              :dpvo/Context],
   :rdfs/comment
   "For example, a human verifying outputs of an algorithm for correctness or impact to individuals",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Automated Processing with Human Review",
   :vs/term_status "modified"})

(def AutomationOfProcessing
  "Contextual information about the degree of automation and human involvement associated with Processing"
  {:db/ident :dpvo/AutomationOfProcessing,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Contextual information about the degree of automation and human involvement associated with Processing",
   :rdf/type :owl/Class,
   :rdfs/comment
   "It is difficult to provide a formal definition of automation since any and all processing may be considered automation. This concept instead is intended to explicitly signal the utilisation of automation and its extent towards some context - such as decision making, and to indicate the involvement of humans.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Automation of Processing",
   :rdfs/subClassOf
   [:dpvo/ProcessingContext :dpvo/AutomationOfProcessing :dpvo/Context],
   :vs/term_status "accepted"})

(def BackgroundChecks
  "Procedure where the background of an entity is assessed to identity vulnerabilities and threats due to their current or intended role"
  {:db/ident :dpvo/BackgroundChecks,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Procedure where the background of an entity is assessed to identity vulnerabilities and threats due to their current or intended role",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Background Checks",
   :rdfs/subClassOf [:dpvo/SecurityProcedure
                     :dpvo/BackgroundChecks
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def Benefit
  "Impact(s) that acts as or causes benefits"
  {:db/ident            :dpvo/Benefit,
   :dcterms/created     #inst "2022-03-23T00:00:00.000-04:00",
   :dcterms/creator     ["Axel Polleres"
                         "Georg P Krog"
                         "Beatriz Esteves"
                         "Fajar Ekaputra"
                         "Julian Flake"
                         "Harshvardhan J. Pandit"],
   :dcterms/description "Impact(s) that acts as or causes benefits",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Benefit",
   :rdfs/subClassOf     [:dpvo/Impact :dpvo/Benefit :dpvo/Consequence],
   :vs/term_status      "accepted"})

(def BiometricAuthentication
  "Use of biometric data for authentication"
  {:db/ident :dpvo/BiometricAuthentication,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Use of biometric data for authentication",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Biometric Authentication",
   :rdfs/subClassOf [:dpvo/AuthenticationProtocols
                     :dpvo/BiometricAuthentication
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def Certification
  "Certification mechanisms, seals, and marks for the purpose of demonstrating compliance"
  {:db/ident :dpvo/Certification,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Mark Lizar" "Rob Brennan" "Harshvardhan J. Pandit" "Axel Polleres"],
   :dcterms/description
   "Certification mechanisms, seals, and marks for the purpose of demonstrating compliance",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Certification",
   :rdfs/subClassOf [:dpvo/CertificationSeal
                     :dpvo/Certification
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def CertificationSeal
  "Certifications, seals, and marks indicating compliance to regulations or practices"
  {:db/ident :dpvo/CertificationSeal,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Mark Lizar" "Rob Brennan" "Harshvardhan J. Pandit" "Axel Polleres"],
   :dcterms/description
   "Certifications, seals, and marks indicating compliance to regulations or practices",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Certification and Seal",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/CertificationSeal
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def Child
  "A 'child' is a natural legal person who is below a certain legal age depending on the legal jurisdiction."
  {:db/ident :dpvo/Child,
   :dcterms/created #inst "2020-11-25T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A 'child' is a natural legal person who is below a certain legal age depending on the legal jurisdiction.",
   :dcterms/modified #inst "2022-06-22T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   "The legality of age defining a child varies by jurisdiction. In addition, 'child' is distinct from a 'minor'. For example, the legal age for consumption of alcohol can be 21, which makes a person of age 20 a 'minor' in this context. In other cases, 'minor' and 'child' are used interchangeably to refer to a person below some legally defined age.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Child",
   :rdfs/subClassOf [:dpvo/DataSubject
                     :dpvo/Child
                     :dpvo/Entity
                     :dpvo/NaturalPerson
                     :dpvo/LegalEntity],
   :vs/term_status "changed"})

(def Citizen
  "Data subjects that are citizens (for a jurisdiction)"
  {:db/ident            :dpvo/Citizen,
   :dcterms/created     #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     ["Paul Ryan"
                         "Beatriz Esteves"
                         "Julian Flake"
                         "Georg P. Krog"
                         "Harshvardhan J. Pandit"],
   :dcterms/description "Data subjects that are citizens (for a jurisdiction)",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Citizen",
   :rdfs/subClassOf     [:dpvo/DataSubject
                         :dpvo/Citizen
                         :dpvo/Entity
                         :dpvo/NaturalPerson
                         :dpvo/LegalEntity],
   :vs/term_status      "accepted"})

(def City
  "A region consisting of urban population and commerce"
  {:db/ident            :dpvo/City,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "A region consisting of urban population and commerce",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "City",
   :rdfs/subClassOf     [:dpvo/Location :dpvo/City],
   :vs/term_status      "accepted"})

(def Client
  "Data subjects that are clients or recipients of services"
  {:db/ident :dpvo/Client,
   :dcterms/created #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator ["Julian Flake"
                     "Beatriz Esteves"
                     "Harshvardhan J. Pandit"
                     "Georg P. Krog"
                     "Paul Ryan"],
   :dcterms/description
   "Data subjects that are clients or recipients of services",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Client",
   :rdfs/subClassOf [:dpvo/Customer
                     :dpvo/Client
                     :dpvo/DataSubject
                     :dpvo/Entity
                     :dpvo/NaturalPerson
                     :dpvo/LegalEntity],
   :vs/term_status "accepted"})

(def CloudLocation
  "Location that is in the 'cloud' i.e. a logical location operated over the internet"
  {:db/ident :dpvo/CloudLocation,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Location that is in the 'cloud' i.e. a logical location operated over the internet",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Cloud Location",
   :rdfs/subClassOf [:dpvo/RemoteLocation
                     :dpvo/CloudLocation
                     :dpvo/LocationLocality
                     :dpvo/Location],
   :vs/term_status "modified"})

(def CodeOfConduct
  "A set of rules or procedures outlining the norms and practices for conducting activities"
  {:db/ident :dpvo/CodeOfConduct,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Axel Polleres" "Harshvardhan J. Pandit" "Mark Lizar" "Rob Brennan"],
   :dcterms/description
   "A set of rules or procedures outlining the norms and practices for conducting activities",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Code of Conduct",
   :rdfs/subClassOf [:dpvo/GuidelinesPrinciple
                     :dpvo/CodeOfConduct
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def Collect
  "to gather data from someone"
  {:db/ident :dpvo/Collect,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description "to gather data from someone",
   :dcterms/source ["https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"
                    "https://specialprivacy.ercim.eu/vocabs/processing"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Collect",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/processing#Collect"],
   :rdfs/subClassOf [:dpvo/Obtain :dpvo/Collect :dpvo/Processing],
   :vs/term_status "accepted"})

(def CollectedPersonalData
  "Personal Data that has been collected from another source such as the Data Subject"
  {:db/ident :dpvo/CollectedPersonalData,
   :dcterms/created #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Personal Data that has been collected from another source such as the Data Subject",
   :rdf/type :owl/Class,
   :rdfs/comment
   "To indicate the source of data, use the DataSource concept with the hasDataSource relation",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Collected Personal Data",
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo/CollectedPersonalData :dpvo/Data],
   :vs/term_status "accepted"})

(def Combine
  "to join or merge data"
  {:db/ident :dpvo/Combine,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description "to join or merge data",
   :dcterms/source ["https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"
                    "https://specialprivacy.ercim.eu/vocabs/processing"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Combine",
   :rdfs/seeAlso
   ["https://specialprivacy.ercim.eu/vocabs/processing#Aggregate"],
   :rdfs/subClassOf [:dpvo/Transform :dpvo/Combine :dpvo/Processing],
   :vs/term_status "accepted"})

(def CommercialResearch
  "Purposes associated with conducting research in a commercial setting or with intention to commercialise e.g. in a company or sponsored by a company"
  {:db/ident :dpvo/CommercialResearch,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra"
                     "Javier Fernandez"
                     "Harshvardhan J. Pandit"
                     "Axel Polleres"
                     "Simon Steyskal"
                     "Elmar Kiesling"],
   :dcterms/description
   "Purposes associated with conducting research in a commercial setting or with intention to commercialise e.g. in a company or sponsored by a company",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Commercial Research",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/purposes#Develop"],
   :rdfs/subClassOf
   [:dpvo/ResearchAndDevelopment :dpvo/CommercialResearch :dpvo/Purpose],
   :vs/term_status "accepted"})

(def CommunicationForCustomerCare
  "Customer Care Communication refers to purposes associated with communicating with customers for assisting them, resolving issues, ensuring satisfaction, etc. in relation to services provided"
  {:db/ident :dpvo/CommunicationForCustomerCare,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Beatriz Esteves" "Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Customer Care Communication refers to purposes associated with communicating with customers for assisting them, resolving issues, ensuring satisfaction, etc. in relation to services provided",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Communication for Customer Care",
   :rdfs/subClassOf [:dpvo/CustomerCare
                     :dpvo/CommunicationManagement
                     :dpvo/CommunicationForCustomerCare
                     :dpvo/CustomerManagement
                     :dpvo/Purpose],
   :vs/term_status "accepted"})

(def CommunicationManagement
  "Communication Management refers to purposes associated with providing or managing communication activities e.g. to send an email for notifying some information"
  {:db/ident :dpvo/CommunicationManagement,
   :dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["David Hickey" "Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   "Communication Management refers to purposes associated with providing or managing communication activities e.g. to send an email for notifying some information",
   :rdf/type :owl/Class,
   :rdfs/comment
   "This purpose by itself does not sufficiently and clearly indicate what the communication is about. As such, it is recommended to combine it with another purpose to indicate the application. For example, Communication of Payment.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Communication Management",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/CommunicationManagement],
   :vs/term_status "accepted"})

(def CompletelyManualProcessing
  "Processing that is completely un-automated or fully manual"
  {:db/ident :dpvo/CompletelyManualProcessing,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Processing that is completely un-automated or fully manual",
   :rdf/type [:owl/NamedIndividual
              :dpvo/AutomationOfProcessing
              :dpvo/ProcessingContext
              :dpvo/Context],
   :rdfs/comment "For example, a human performing some processing operation",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Completely Manual Processing",
   :vs/term_status "accepted"})

(def ComplianceIndeterminate
  "State where the status of compliance has not been fully assessed, evaluated, or determined"
  {:db/ident :dpvo/ComplianceIndeterminate,
   :dcterms/created #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "State where the status of compliance has not been fully assessed, evaluated, or determined",
   :rdf/type
   [:owl/NamedIndividual :dpvo/ComplianceStatus :dpvo/Status :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Compliance Indeterminate",
   :vs/term_status "accepted"})

(def ComplianceMonitoring
  "Monitoring of compliance (e.g. internal policy, regulations)"
  {:db/ident :dpvo/ComplianceMonitoring,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Monitoring of compliance (e.g. internal policy, regulations)",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Compliance Monitoring",
   :rdfs/subClassOf [:dpvo/GovernanceProcedures
                     :dpvo/ComplianceMonitoring
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def ComplianceStatus
  "Status associated with Compliance with some norms, objectives, or requirements"
  {:db/ident :dpvo/ComplianceStatus,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Status associated with Compliance with some norms, objectives, or requirements",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Compliance Status",
   :rdfs/subClassOf [:dpvo/Status :dpvo/ComplianceStatus :dpvo/Context],
   :vs/term_status "accepted"})

(def ComplianceUnknown
  "State where the status of compliance is unknown"
  {:db/ident            :dpvo/ComplianceUnknown,
   :dcterms/created     #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "State where the status of compliance is unknown",
   :rdf/type            [:dpvo/ComplianceStatus
                         :owl/NamedIndividual
                         :dpvo/Status
                         :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Compliance Unknown",
   :vs/term_status      "accepted"})

(def ComplianceViolation
  "State where compliance cannot be achieved due to requirements being violated"
  {:db/ident :dpvo/ComplianceViolation,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "State where compliance cannot be achieved due to requirements being violated",
   :dcterms/modified #inst "2022-09-07T00:00:00.000-04:00",
   :rdf/type
   [:dpvo/ComplianceStatus :owl/NamedIndividual :dpvo/Status :dpvo/Context],
   :rdfs/comment
   "Changed from \"violation of compliance\" for consistency with other terms",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Compliance Violation",
   :vs/term_status "changed"})

(def Compliant
  "State of being fully compliant"
  {:db/ident            :dpvo/Compliant,
   :dcterms/created     #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "State of being fully compliant",
   :rdf/type            [:owl/NamedIndividual
                         :dpvo/ComplianceStatus
                         :dpvo/Status
                         :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Compliant",
   :vs/term_status      "accepted"})

(def ConformanceStatus
  "Status associated with conformance to a standard, guideline, code, or recommendation"
  {:db/ident :dpvo/ConformanceStatus,
   :dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Status associated with conformance to a standard, guideline, code, or recommendation",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Conformance Status",
   :rdfs/subClassOf [:dpvo/Status :dpvo/ConformanceStatus :dpvo/Context],
   :vs/term_status "accepted"})

(def Conformant
  "State of being conformant"
  {:db/ident            :dpvo/Conformant,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "State of being conformant",
   :rdf/type            [:dpvo/ConformanceStatus
                         :owl/NamedIndividual
                         :dpvo/Status
                         :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Conformant",
   :vs/term_status      "accepted"})

(def Consent
  "Consent of the Data Subject for specified processing"
  {:db/ident            :dpvo/Consent,
   :dcterms/created     #inst "2021-04-07T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Consent of the Data Subject for specified processing",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Consent",
   :rdfs/subClassOf     [:dpvo/LegalBasis :dpvo/Consent],
   :vs/term_status      "accepted"})

(def ConsentExpired
  "The state where the temporal or contextual validity of consent has 'expired'"
  {:db/ident :dpvo/ConsentExpired,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Julian Flake" "Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   "The state where the temporal or contextual validity of consent has 'expired'",
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/type [:owl/NamedIndividual
              :dpvo/ConsentStatusInvalidForProcessing
              :dpvo/ConsentStatus
              :dpvo/Status
              :dpvo/Context],
   :rdfs/comment
   "An example of this state is when the obtained consent has been assigned a duration - which has lapsed or 'expired', making it invalid to be used further for processing data",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Consent Expired",
   :vs/term_status "accepted"})

(def ConsentGiven
  "The state where consent has been given"
  {:db/ident :dpvo/ConsentGiven,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Paul Ryan" "Harshvardhan J. Pandit" "Julian Flake"],
   :dcterms/description "The state where consent has been given",
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/type [:owl/NamedIndividual
              :dpvo/ConsentStatusValidForProcessing
              :dpvo/Status
              :dpvo/ConsentStatus
              :dpvo/Context],
   :rdfs/comment
   "An example of this state is when the individual clicks on a button, ticks a checkbox, verbally agrees - or any other form that communicates their decision agreeing to the processing of data",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Consent Given",
   :vs/term_status "accepted"})

(def ConsentInvalidated
  "The state where consent has been deemed to be invalid"
  {:db/ident :dpvo/ConsentInvalidated,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Paul Ryan" "Julian Flake" "Georg P Krog"],
   :dcterms/description "The state where consent has been deemed to be invalid",
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/type [:owl/NamedIndividual
              :dpvo/ConsentStatusInvalidForProcessing
              :dpvo/ConsentStatus
              :dpvo/Status
              :dpvo/Context],
   :rdfs/comment
   "An example of this state is where an investigating authority or a court finds the collected consent did not meet requirements, and 'invalidates' both prior and future uses of it to carry out processing",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Consent Invalidated",
   :vs/term_status "accepted"})

(def ConsentNotice
  "A Notice for information provision associated with Consent"
  {:db/ident :dpvo/ConsentNotice,
   :dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Julian Flake" "Harshvardhan J. Pandit" "Paul Ryan" "Georg P Krog"],
   :dcterms/description
   "A Notice for information provision associated with Consent",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Consent Notice",
   :rdfs/subClassOf [:dpvo/PrivacyNotice
                     :dpvo/ConsentNotice
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/Notice],
   :vs/term_status "accepted"})

(def ConsentRecord
  "A Record of Consent or Consent related activities"
  {:db/ident            :dpvo/ConsentRecord,
   :dcterms/created     #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit"
                         "Julian Flake"
                         "Paul Ryan"
                         "Georg P Krog"],
   :dcterms/description "A Record of Consent or Consent related activities",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Consent Record",
   :rdfs/subClassOf     [:dpvo/DataProcessingRecord
                         :dpvo/ConsentRecord
                         :dpvo/OrganisationalMeasure
                         :dpvo/TechnicalOrganisationalMeasure
                         :dpvo/RecordsOfActivities],
   :vs/term_status      "accepted"})

(def ConsentRefused
  "The state where consent has been refused"
  {:db/ident :dpvo/ConsentRefused,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J. Pandit" "Julian Flake" "Georg P Krog"],
   :dcterms/description "The state where consent has been refused",
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/type [:dpvo/ConsentStatusInvalidForProcessing
              :owl/NamedIndividual
              :dpvo/ConsentStatus
              :dpvo/Status
              :dpvo/Context],
   :rdfs/comment
   "An example of this state is when the individual clicks on a 'disagree' or 'reject' or 'refuse' button, or leaves a checkbox unticked",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Consent Refused",
   :vs/term_status "accepted"})

(def ConsentRequestDeferred
  "State where a request for consent has been deferred without a decision"
  {:db/ident :dpvo/ConsentRequestDeferred,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Julian Flake" "Harshvardhan J. Pandit" "Paul Ryan" "Georg P Krog"],
   :dcterms/description
   "State where a request for consent has been deferred without a decision",
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/type [:owl/NamedIndividual
              :dpvo/ConsentStatusInvalidForProcessing
              :dpvo/ConsentStatus
              :dpvo/Status
              :dpvo/Context],
   :rdfs/comment
   "An example of this state is when the individual closes or dismisses a notice without making a decision. This state is intended for making the distinction between a notice being provided (as a consent request) and the individual interacting with the notice without making a decision - where the 'ignoring of a notice' is taken as consent being neither given nor refused",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Consent Request Deferred",
   :vs/term_status "accepted"})

(def ConsentRequested
  "State where a request for consent has been made and is awaiting a decision"
  {:db/ident :dpvo/ConsentRequested,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Paul Ryan" "Harshvardhan J. Pandit" "Julian Flake"],
   :dcterms/description
   "State where a request for consent has been made and is awaiting a decision",
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/type [:owl/NamedIndividual
              :dpvo/ConsentStatusInvalidForProcessing
              :dpvo/ConsentStatus
              :dpvo/Status
              :dpvo/Context],
   :rdfs/comment
   "An example of this state is when a notice has been presented to the individual but they have not made a decision",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Consent Requested",
   :vs/term_status "accepted"})

(def ConsentRevoked
  "The state where the consent is revoked by an entity other than the data subject and which prevents it from being further used as a valid state"
  {:db/ident :dpvo/ConsentRevoked,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Julian Flake" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   "The state where the consent is revoked by an entity other than the data subject and which prevents it from being further used as a valid state",
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/type [:dpvo/ConsentStatusInvalidForProcessing
              :owl/NamedIndividual
              :dpvo/ConsentStatus
              :dpvo/Status
              :dpvo/Context],
   :rdfs/comment
   "An example of this state is when a Data Controller stops utilising previously obtaining consent, such as when that service no longer exists",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Consent Revoked",
   :vs/term_status "accepted"})

(def ConsentStatus
  "The state or status of 'consent' that provides information reflecting its operational status and validity for processing data"
  {:db/ident :dpvo/ConsentStatus,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Julian Flake" "Harshvardhan J. Pandit"],
   :dcterms/description
   "The state or status of 'consent' that provides information reflecting its operational status and validity for processing data",
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/type :owl/Class,
   :rdfs/comment
   "States are useful as information artefacts to implement them in controlling processing, and to reflect the process and flow of obtaining and maintaining consent. For example, a database table that stores consent states for specific processing and can be queried to obtain them in an efficient manner. States are also useful in investigations to determine the use and validity of consenting practices",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Consent Status",
   :rdfs/subClassOf [:dpvo/Status :dpvo/ConsentStatus :dpvo/Context],
   :vs/term_status "accepted"})

(def ConsentStatusInvalidForProcessing
  "States of consent that cannot be used as valid justifications for processing data"
  {:db/ident :dpvo/ConsentStatusInvalidForProcessing,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Paul Ryan" "Julian Flake" "Georg P Krog"],
   :dcterms/description
   "States of consent that cannot be used as valid justifications for processing data",
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/type :owl/Class,
   :rdfs/comment
   "This identifies the stages associated with consent that should not be used to process data",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Consent Status Invalid for Processing",
   :rdfs/subClassOf [:dpvo/ConsentStatus
                     :dpvo/ConsentStatusInvalidForProcessing
                     :dpvo/Context
                     :dpvo/Status],
   :vs/term_status "accepted"})

(def ConsentStatusValidForProcessing
  "States of consent that can be used as valid justifications for processing data"
  {:db/ident :dpvo/ConsentStatusValidForProcessing,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Julian Flake" "Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description
   "States of consent that can be used as valid justifications for processing data",
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Practically, given consent is the only valid state for processing",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Consent Status Valid for Processing",
   :rdfs/subClassOf [:dpvo/ConsentStatus
                     :dpvo/ConsentStatusValidForProcessing
                     :dpvo/Context
                     :dpvo/Status],
   :vs/term_status "accepted"})

(def ConsentUnknown
  "State where information about consent is not available or is unknown"
  {:db/ident :dpvo/ConsentUnknown,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Harshvardhan J. Pandit" "Julian Flake"],
   :dcterms/description
   "State where information about consent is not available or is unknown",
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/type [:dpvo/ConsentStatusInvalidForProcessing
              :owl/NamedIndividual
              :dpvo/ConsentStatus
              :dpvo/Status
              :dpvo/Context],
   :rdfs/comment
   "Consent states can be unknown, for example, when information is not available, or cannot be trusted, or is known to be inaccurate",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Consent Unknown",
   :vs/term_status "accepted"})

(def ConsentWithdrawn
  "The state where the consent is withdrawn or revoked specifically by the data subject and which prevents it from being further used as a valid state"
  {:db/ident :dpvo/ConsentWithdrawn,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Julian Flake" "Harshvardhan J. Pandit"],
   :dcterms/description
   "The state where the consent is withdrawn or revoked specifically by the data subject and which prevents it from being further used as a valid state",
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/type [:owl/NamedIndividual
              :dpvo/ConsentStatusInvalidForProcessing
              :dpvo/ConsentStatus
              :dpvo/Status
              :dpvo/Context],
   :rdfs/comment
   "This state can be considered a form of 'revocation' of consent, where the revocation can only be performed by the data subject. Therefore we suggest using ConsentRevoked when it is a non-data-subject entity, and ConsentWithdrawn when it is the data subject",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Consent Withdrawn",
   :vs/term_status "accepted"})

(def Consequence
  "The consequence(s) possible or arising from specified context"
  {:db/ident :dpvo/Consequence,
   :dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The consequence(s) possible or arising from specified context",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Consequence",
   :rdfs/subClassOf :dpvo/Consequence,
   :vs/term_status "accepted"})

(def ConsequenceAsSideEffect
  "The consequence(s) possible or arising as a side-effect of specified context"
  {:db/ident :dpvo/ConsequenceAsSideEffect,
   :dcterms/created #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The consequence(s) possible or arising as a side-effect of specified context",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Consequence as Side-Effect",
   :rdfs/subClassOf [:dpvo/Consequence :dpvo/ConsequenceAsSideEffect],
   :vs/term_status "accepted"})

(def ConsequenceOfFailure
  "The consequence(s) possible or arising from failure of specified context"
  {:db/ident :dpvo/ConsequenceOfFailure,
   :dcterms/created #inst "2022-03-23T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   "The consequence(s) possible or arising from failure of specified context",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Consequence of Failure",
   :rdfs/subClassOf [:dpvo/Consequence :dpvo/ConsequenceOfFailure],
   :vs/term_status "accepted"})

(def ConsequenceOfSuccess
  "The consequence(s) possible or arising from success of specified context"
  {:db/ident :dpvo/ConsequenceOfSuccess,
   :dcterms/created #inst "2022-03-23T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   "The consequence(s) possible or arising from success of specified context",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Consequence of Success",
   :rdfs/subClassOf [:dpvo/Consequence :dpvo/ConsequenceOfSuccess],
   :vs/term_status "accepted"})

(def Consult
  "to consult or query data"
  {:db/ident :dpvo/Consult,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description "to consult or query data",
   :dcterms/source
   ["https://specialprivacy.ercim.eu/vocabs/processing"
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Consult",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/processing#Query"],
   :rdfs/subClassOf [:dpvo/Use :dpvo/Consult :dpvo/Processing],
   :vs/term_status "accepted"})

(def Consultation
  "Consultation is a process of receiving feedback, advice, or opinion from an external agency"
  {:db/ident :dpvo/Consultation,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog" "Paul Ryan"],
   :dcterms/description
   "Consultation is a process of receiving feedback, advice, or opinion from an external agency",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Consultation",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/Consultation
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def ConsultationWithAuthority
  "Consultation with an authority or authoritative entity"
  {:db/ident :dpvo/ConsultationWithAuthority,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description
   "Consultation with an authority or authoritative entity",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Consultation with Authority",
   :rdfs/subClassOf [:dpvo/Consultation
                     :dpvo/ConsultationWithAuthority
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def ConsultationWithDPO
  "Consultation with Data Protection Officer(s)"
  {:db/ident            :dpvo/ConsultationWithDPO,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description "Consultation with Data Protection Officer(s)",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Consultation with DPO",
   :rdfs/subClassOf     [:dpvo/Consultation
                         :dpvo/ConsultationWithDPO
                         :dpvo/OrganisationalMeasure
                         :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status      "accepted"})

(def ConsultationWithDataSubject
  "Consultation with data subject(s) or their representative(s)"
  {:db/ident :dpvo/ConsultationWithDataSubject,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   "Consultation with data subject(s) or their representative(s)",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Consultation with Data Subject",
   :rdfs/subClassOf [:dpvo/Consultation
                     :dpvo/ConsultationWithDataSubject
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def ConsultationWithDataSubjectRepresentative
  "Consultation with representative of data subject(s)"
  {:db/ident            :dpvo/ConsultationWithDataSubjectRepresentative,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description "Consultation with representative of data subject(s)",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Consultation with Data Subject Representative",
   :rdfs/subClassOf     [:dpvo/ConsultationWithDataSubject
                         :dpvo/ConsultationWithDataSubjectRepresentative
                         :dpvo/OrganisationalMeasure
                         :dpvo/Consultation
                         :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status      "accepted"})

(def Consumer
  "Data subjects that consume goods or services for direct use"
  {:db/ident :dpvo/Consumer,
   :dcterms/created #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator ["Julian Flake"
                     "Paul Ryan"
                     "Georg P. Krog"
                     "Harshvardhan J. Pandit"
                     "Beatriz Esteves"],
   :dcterms/description
   "Data subjects that consume goods or services for direct use",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Consumer",
   :rdfs/subClassOf [:dpvo/DataSubject
                     :dpvo/Consumer
                     :dpvo/Entity
                     :dpvo/NaturalPerson
                     :dpvo/LegalEntity],
   :vs/term_status "accepted"})

(def Context
  "Contextually relevant information not possible to represent through other core concepts"
  {:db/ident :dpvo/Context,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres"
                     "Javier Fernandez"
                     "Fajar Ekaputra"
                     "Simon Steyskal"
                     "Harshvardhan J. Pandit"
                     "Elmar Kiesling"],
   :dcterms/description
   "Contextually relevant information not possible to represent through other core concepts",
   :dcterms/modified #inst "2022-06-15T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Context",
   :rdfs/subClassOf :dpvo/Context,
   :vs/term_status "modified"})

(def ContinousFrequency
  "Frequency where occurences are continous"
  {:db/ident            :dpvo/ContinousFrequency,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Frequency where occurences are continous",
   :dcterms/modified    #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Continous Frequency",
   :rdfs/subClassOf     [:dpvo/Frequency
                         :dpvo/ContinousFrequency
                         :dpvo/Context],
   :vs/term_status      "modified"})

(def Contract
  "Creation, completion, fulfilment, or performance of a contract involving specified processing"
  {:db/ident :dpvo/Contract,
   :dcterms/created #inst "2021-04-07T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Creation, completion, fulfilment, or performance of a contract involving specified processing",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Contract",
   :rdfs/subClassOf [:dpvo/LegalBasis
                     :dpvo/LegalAgreement
                     :dpvo/Contract
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def ContractPerformance
  "Fulfilment or performance of a contract involving specified processing"
  {:db/ident :dpvo/ContractPerformance,
   :dcterms/created #inst "2021-04-07T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description
   "Fulfilment or performance of a contract involving specified processing",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Contract Performance",
   :rdfs/subClassOf [:dpvo/Contract
                     :dpvo/ContractPerformance
                     :dpvo/OrganisationalMeasure
                     :dpvo/LegalBasis
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/LegalAgreement],
   :vs/term_status "accepted"})

(def ContractualTerms
  "Contractual terms governing data handling within or with an entity"
  {:db/ident :dpvo/ContractualTerms,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Axel Polleres" "Harshvardhan J. Pandit" "Mark Lizar" "Rob Brennan"],
   :dcterms/description
   "Contractual terms governing data handling within or with an entity",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Contractual Terms",
   :rdfs/subClassOf [:dpvo/LegalAgreement
                     :dpvo/ContractualTerms
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def ControllerProcessorAgreement
  "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between a Data Controller and a Data Processor"
  {:db/ident :dpvo/ControllerProcessorAgreement,
   :dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog"
                     "Harshvardhan J. Pandit"
                     "Paul Ryan"
                     "Julian Flake"
                     "Beatriz Esteves"],
   :dcterms/description
   "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between a Data Controller and a Data Processor",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Controller-Processor Agreement",
   :rdfs/subClassOf [:dpvo/DataProcessingAgreement
                     :dpvo/ControllerProcessorAgreement
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/LegalAgreement],
   :vs/term_status "accepted"})

(def Copy
  "to produce an exact reprodution of the data"
  {:db/ident :dpvo/Copy,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description "to produce an exact reprodution of the data",
   :dcterms/source "https://specialprivacy.ercim.eu/vocabs/processing",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Copy",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/processing#Copy"],
   :rdfs/subClassOf [:dpvo/Processing :dpvo/Copy],
   :vs/term_status "accepted"})

(def CounterMoneyLaundering
  "Purposes associated with detection, prevention, and mitigation of mitigate money laundering"
  {:db/ident :dpvo/CounterMoneyLaundering,
   :dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Purposes associated with detection, prevention, and mitigation of mitigate money laundering",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Counter Money Laundering",
   :rdfs/subClassOf [:dpvo/FraudPreventionAndDetection
                     :dpvo/CounterMoneyLaundering
                     :dpvo/Purpose
                     :dpvo/EnforceSecurity],
   :vs/term_status "accepted"})

(def Country
  "A political entity indicative of a sovereign or non-sovereign territorial state comprising of distinct geographical areas"
  {:db/ident :dpvo/Country,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   "A political entity indicative of a sovereign or non-sovereign territorial state comprising of distinct geographical areas",
   :rdf/type :owl/Class,
   :rdfs/comment
   "The definition of country is not intended for political interpretation. DPVCG welcomes alternate definitions based in existing sources with global scope, such as UN or ISO.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Country",
   :rdfs/subClassOf [:dpvo/Location :dpvo/Country],
   :vs/term_status "accepted"})

(def CredentialManagement
  "Management of credentials and their use in authorisations"
  {:db/ident :dpvo/CredentialManagement,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   "Management of credentials and their use in authorisations",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Credential Management",
   :rdfs/subClassOf [:dpvo/AuthorisationProcedure
                     :dpvo/CredentialManagement
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def CreditChecking
  "Purposes associated with monitoring, performing, or assessing credit worthiness or solvency"
  {:db/ident :dpvo/CreditChecking,
   :dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Purposes associated with monitoring, performing, or assessing credit worthiness or solvency",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Credit Checking",
   :rdfs/subClassOf [:dpvo/CustomerSolvencyMonitoring
                     :dpvo/CreditChecking
                     :dpvo/CustomerManagement
                     :dpvo/Purpose],
   :vs/term_status "accepted"})

(def CryptographicAuthentication
  "Use of cryptography for authentication"
  {:db/ident :dpvo/CryptographicAuthentication,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Use of cryptography for authentication",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Cryptographic Authentication",
   :rdfs/subClassOf [:dpvo/AuthenticationProtocols
                     :dpvo/CryptographicMethods
                     :dpvo/CryptographicAuthentication
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def CryptographicKeyManagement
  "Management of cryptographic keys, including their generation, storage, assessment, and safekeeping"
  {:db/ident :dpvo/CryptographicKeyManagement,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Management of cryptographic keys, including their generation, storage, assessment, and safekeeping",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Cryptographic Key Management",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/CryptographicKeyManagement
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def CryptographicMethods
  "Use of cryptographic methods to perform tasks"
  {:db/ident :dpvo/CryptographicMethods,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Use of cryptographic methods to perform tasks",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Cryptographic Methods",
   :rdfs/subClassOf [:dpvo/TechnicalMeasure
                     :dpvo/CryptographicMethods
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def Customer
  "Data subjects that purchase goods or services"
  {:db/ident :dpvo/Customer,
   :dcterms/created #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator ["Paul Ryan"
                     "Harshvardhan J. Pandit"
                     "Julian Flake"
                     "Beatriz Esteves"
                     "Georg P. Krog"],
   :dcterms/description "Data subjects that purchase goods or services",
   :rdf/type :owl/Class,
   :rdfs/comment
   "note: for B2B relations where customers are organisations, this concept only applies for data subjects",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Customer",
   :rdfs/subClassOf [:dpvo/DataSubject
                     :dpvo/Customer
                     :dpvo/Entity
                     :dpvo/NaturalPerson
                     :dpvo/LegalEntity],
   :vs/term_status "accepted"})

(def CustomerCare
  "Customer Care refers to purposes associated with purposes for providing assistance, resolving issues, ensuring satisfaction, etc. in relation to services provided"
  {:db/ident :dpvo/CustomerCare,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres"
                     "Simon Steyskal"
                     "Elmar Kiesling"
                     "Fajar Ekaputra"
                     "Harshvardhan J. Pandit"
                     "Javier Fernandez"],
   :dcterms/description
   "Customer Care refers to purposes associated with purposes for providing assistance, resolving issues, ensuring satisfaction, etc. in relation to services provided",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Customer Care",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/purposes#Feedback"],
   :rdfs/subClassOf [:dpvo/CustomerManagement :dpvo/CustomerCare :dpvo/Purpose],
   :vs/term_status "accepted"})

(def CustomerClaimsManagement
  "Customer Claims Management refers to purposes associated with managing claims, including repayment of monies owed"
  {:db/ident :dpvo/CustomerClaimsManagement,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Beatriz" "Georg P Krog"],
   :dcterms/description
   "Customer Claims Management refers to purposes associated with managing claims, including repayment of monies owed",
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Customer Claims Management",
   :rdfs/subClassOf
   [:dpvo/CustomerManagement :dpvo/CustomerClaimsManagement :dpvo/Purpose],
   :vs/term_status "accepted"})

(def CustomerManagement
  "Customer Management refers to purposes associated with managing activities related with past, current, and future customers"
  {:db/ident :dpvo/CustomerManagement,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Beatriz" "Georg P Krog"],
   :dcterms/description
   "Customer Management refers to purposes associated with managing activities related with past, current, and future customers",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Customer Management",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/CustomerManagement],
   :vs/term_status "accepted"})

(def CustomerOrderManagement
  "Customer Order Management refers to purposes associated with managing customer orders i.e. processing of an order related to customer's purchase of good or services"
  {:db/ident :dpvo/CustomerOrderManagement,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog" "Beatriz"],
   :dcterms/description
   "Customer Order Management refers to purposes associated with managing customer orders i.e. processing of an order related to customer's purchase of good or services",
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Customer Order Management",
   :rdfs/subClassOf
   [:dpvo/CustomerManagement :dpvo/CustomerOrderManagement :dpvo/Purpose],
   :vs/term_status "accepted"})

(def CustomerRelationshipManagement
  "Customer Relationship Management refers to purposes associated with managing and analysing interactions with past, current, and potential customers"
  {:db/ident :dpvo/CustomerRelationshipManagement,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Beatriz" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   "Customer Relationship Management refers to purposes associated with managing and analysing interactions with past, current, and potential customers",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Customer Relationship Management",
   :rdfs/subClassOf [:dpvo/CustomerManagement
                     :dpvo/CustomerRelationshipManagement
                     :dpvo/Purpose],
   :vs/term_status "accepted"})

(def CustomerSolvencyMonitoring
  "Customer Solvency Monitoring refers to purposes associated with monitor solvency of customers for financial diligence"
  {:db/ident :dpvo/CustomerSolvencyMonitoring,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Beatriz" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Customer Solvency Monitoring refers to purposes associated with monitor solvency of customers for financial diligence",
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Customer Solvency Monitoring",
   :rdfs/subClassOf
   [:dpvo/CustomerManagement :dpvo/CustomerSolvencyMonitoring :dpvo/Purpose],
   :vs/term_status "accepted"})

(def CybersecurityAssessment
  "Assessment of cybersecurity capabilities in terms of vulnerabilities and effectiveness of controls"
  {:db/ident :dpvo/CybersecurityAssessment,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Assessment of cybersecurity capabilities in terms of vulnerabilities and effectiveness of controls",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Cybersecurity Assessment",
   :rdfs/subClassOf [:dpvo/SecurityAssessment
                     :dpvo/Assessment
                     :dpvo/CybersecurityAssessment
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/SecurityProcedure],
   :vs/term_status "accepted"})

(def CybersecurityTraining
  "Training methods related to cybersecurity"
  {:db/ident :dpvo/CybersecurityTraining,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Training methods related to cybersecurity",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Cybersecurity Training",
   :rdfs/subClassOf [:dpvo/StaffTraining
                     :dpvo/CybersecurityTraining
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def DPIA
  "A DPIA involves determining the potential and actual impact of processing activities on individuals or groups of individuals"
  {:db/ident :dpvo/DPIA,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   "A DPIA involves determining the potential and actual impact of processing activities on individuals or groups of individuals",
   :rdf/type :owl/Class,
   :rdfs/comment "Top class: Impact Assessment, and DPIA is sub-class",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Data Protection Impact Assessment (DPIA)",
   :rdfs/subClassOf [:dpvo/ImpactAssessment
                     :dpvo/DPIA
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/Assessment],
   :vs/term_status "accepted"})

(def Damage
  "Impact that acts as or causes damages"
  {:db/ident            :dpvo/Damage,
   :dcterms/created     #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Impact that acts as or causes damages",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Damage",
   :rdfs/subClassOf     [:dpvo/Impact :dpvo/Damage :dpvo/Consequence],
   :vs/term_status      "accepted"})

(def Data
  "A broad concept representing 'data' or 'information'"
  {:db/ident            :dpvo/Data,
   :dcterms/created     #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "A broad concept representing  'data' or 'information'",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Data",
   :rdfs/subClassOf     :dpvo/Data,
   :vs/term_status      "accepted"})

(def DataBackupProtocols
  "Protocols or plans for backing up of data"
  {:db/ident            :dpvo/DataBackupProtocols,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description "Protocols or plans for backing up of data",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Data Backup Protocols",
   :rdfs/subClassOf     [:dpvo/TechnicalMeasure
                         :dpvo/DataBackupProtocols
                         :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status      "accepted"})

(def DataController
  "The individual or organisation that decides (or controls) the purpose(s) of processing personal data."
  {:db/ident :dpvo/DataController,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres" "Javier Fernández"],
   :dcterms/description
   "The individual or organisation that decides (or controls) the purpose(s) of processing personal data.",
   :dcterms/modified #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_7/oj",
   :rdf/type :owl/Class,
   :rdfs/comment
   "The terms 'Controller' is usually the more common form of indicating a Data Controller. In ISO/IEC the term 'PII Controller' is used.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Data Controller",
   :rdfs/subClassOf [:dpvo/LegalEntity :dpvo/DataController :dpvo/Entity],
   :vs/term_status "accepted"})

(def DataExporter
  "An entity that 'exports' data where exporting is considered a form of data transfer"
  {:db/ident :dpvo/DataExporter,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan Pandit" "David Hickey" "Georg Krog" "Paul Ryan"],
   :dcterms/description
   "An entity that 'exports' data where exporting is considered a form of data transfer",
   :dcterms/source
   "https://edpb.europa.eu/our-work-tools/our-documents/recommendations/recommendations-012020-measures-supplement-transfer_en",
   :rdf/type :owl/Class,
   :rdfs/comment
   "The EU, in particular the EDPB, uses data exporter the context of cross-border data transfers/flows. These concepts are not bound by jurisdictional or geopolitical scopes within DPV and can thus be used for any notion of exporting",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Data Exporter",
   :rdfs/subClassOf [:dpvo/LegalEntity :dpvo/DataExporter :dpvo/Entity],
   :vs/term_status "accepted"})

(def DataImporter
  "An entity that 'imports' data where importing is considered a form of data transfer"
  {:db/ident :dpvo/DataImporter,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator
   ["David Hickey" "Paul Ryan" "Harshvardhan Pandit" "Georg Krog"],
   :dcterms/description
   "An entity that 'imports' data where importing is considered a form of data transfer",
   :dcterms/source
   "https://edpb.europa.eu/our-work-tools/our-documents/recommendations/recommendations-012020-measures-supplement-transfer_en",
   :rdf/type :owl/Class,
   :rdfs/comment
   "The EU, in particular the EDPB, uses data importing the context of cross-border data transfers/flows. These concepts are not bound by jurisdictional or geopolitical scopes within DPV and can thus be used for any notion of importing",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Data Importer",
   :rdfs/subClassOf
   [:dpvo/Recipient :dpvo/DataImporter :dpvo/Entity :dpvo/LegalEntity],
   :vs/term_status "accepted"})

(def DataProcessingAgreement
  "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data"
  {:db/ident :dpvo/DataProcessingAgreement,
   :dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator ["Paul Ryan"
                     "Julian Flake"
                     "Georg P Krog"
                     "Beatriz Esteves"
                     "Harshvardhan J. Pandit"],
   :dcterms/description
   "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data",
   :rdf/type :owl/Class,
   :rdfs/comment
   "For specific role-based data processing agreements, see concepts for Processors and JointDataController agreements.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Data Processing Agreement",
   :rdfs/subClassOf [:dpvo/LegalAgreement
                     :dpvo/DataProcessingAgreement
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def DataProcessingRecord
  "Record of personal data processing, whether ex-ante or ex-post"
  {:db/ident :dpvo/DataProcessingRecord,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Record of personal data processing, whether ex-ante or ex-post",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Data Processing Record",
   :rdfs/subClassOf [:dpvo/RecordsOfActivities
                     :dpvo/DataProcessingRecord
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def DataProcessor
  "A ‘processor’ means a natural or legal person, public authority, agency or other body which processes personal data on behalf of the controller."
  {:db/ident :dpvo/DataProcessor,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A ‘processor’ means a natural or legal person, public authority, agency or other body which processes personal data on behalf of the controller.",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_8/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Data Processor",
   :rdfs/subClassOf
   [:dpvo/Recipient :dpvo/DataProcessor :dpvo/Entity :dpvo/LegalEntity],
   :vs/term_status "accepted"})

(def DataProtectionAuthority
  "An authority tasked with overseeing legal compliance regarding privacy and data protection laws."
  {:db/ident :dpvo/DataProtectionAuthority,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan Pandit" "Paul Ryan" "Georg Krog"],
   :dcterms/description
   "An authority tasked with overseeing legal compliance regarding privacy and data protection laws.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Data Protection Authority",
   :rdfs/subClassOf [:dpvo/Authority
                     :dpvo/DataProtectionAuthority
                     :dpvo/GovernmentalOrganisation
                     :dpvo/Organisation
                     :dpvo/Entity
                     :dpvo/LegalEntity],
   :vs/term_status "accepted"})

(def DataProtectionOfficer
  "An entity within or authorised by an organisation to monitor internal compliance, inform and advise on data protection obligations and act as a contact point for data subjects and the supervisory authority."
  {:db/ident :dpvo/DataProtectionOfficer,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Georg Krog" "Paul Ryan"],
   :dcterms/description
   "An entity within or authorised by an organisation to monitor internal compliance, inform and advise on data protection obligations and act as a contact point for data subjects and the supervisory authority.",
   :dcterms/modified #inst "2021-12-08T00:00:00.000-05:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_37/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Data Protection Officer",
   :rdfs/subClassOf [:dpvo/Representative
                     :dpvo/DataProtectionOfficer
                     :dpvo/Entity
                     :dpvo/LegalEntity],
   :vs/term_status "modified"})

(def DataProtectionTraining
  "Training intended to increase knowledge regarding data protection"
  {:db/ident :dpvo/DataProtectionTraining,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Training intended to increase knowledge regarding data protection",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Data Protection Training",
   :rdfs/subClassOf [:dpvo/StaffTraining
                     :dpvo/DataProtectionTraining
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def DataPublishedByDataSubject
  "Data is published by the data subject"
  {:db/ident :dpvo/DataPublishedByDataSubject,
   :dcterms/created #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator "Julian Flake",
   :dcterms/description "Data is published by the data subject",
   :rdf/type [:dpvo/DataSource
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/comment
   "This refers to where that data was made publicly available by the data subject. An example of this would be a social media profile that the data subject has made publicly accessible.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Data published by Data Subject",
   :vs/term_status "accepted"})

(def DataRedaction
  "Removal of sensitive information from a data or document"
  {:db/ident :dpvo/DataRedaction,
   :dcterms/created #inst "2020-10-01T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Removal of sensitive information from a data or document",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Data Redaction",
   :rdfs/subClassOf [:dpvo/DataSanitisationTechnique
                     :dpvo/DataRedaction
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def DataSanitisationTechnique
  "Cleaning or any removal or re-organisation of elements in data based on selective criteria"
  {:db/ident :dpvo/DataSanitisationTechnique,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Cleaning or any removal or re-organisation of elements in data based on selective criteria",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Data Sanitisation Technique",
   :rdfs/subClassOf [:dpvo/TechnicalMeasure
                     :dpvo/DataSanitisationTechnique
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def DataSource
  "The source or origin of data"
  {:db/ident :dpvo/DataSource,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Beatriz Esteves" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description "The source or origin of data",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Source' is the direct point of data collection; 'origin' would indicate the original/others points of where the data originates from.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Data Source",
   :rdfs/subClassOf [:dpvo/ProcessingContext :dpvo/DataSource :dpvo/Context],
   :vs/term_status "accepted"})

(def DataSubProcessor
  "A 'sub-processor' is a processor engaged by another processor"
  {:db/ident :dpvo/DataSubProcessor,
   :dcterms/created #inst "2020-11-25T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A 'sub-processor' is a processor engaged by another processor",
   :rdf/type :owl/Class,
   :rdfs/comment
   "sub-processor' is a commonly used term similar to 'sub-contractor' and does not have a specific legal definition",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Data Sub-Processor",
   :rdfs/subClassOf [:dpvo/DataProcessor
                     :dpvo/DataSubProcessor
                     :dpvo/Entity
                     :dpvo/LegalEntity
                     :dpvo/Recipient],
   :vs/term_status "accepted"})

(def DataSubject
  "The individual (or category of individuals) whose personal data is being processed"
  {:db/ident :dpvo/DataSubject,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres" "Javier Fernández"],
   :dcterms/description
   "The individual (or category of individuals) whose personal data is being processed",
   :dcterms/modified #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_1/oj",
   :rdf/type :owl/Class,
   :rdfs/comment
   "The term 'data subject' is specific to the GDPR, but is functionally equivalent to the term 'individual' and the ISO/IEC term 'PII Principle'.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Data Subject",
   :rdfs/subClassOf
   [:dpvo/NaturalPerson :dpvo/LegalEntity :dpvo/DataSubject :dpvo/Entity],
   :vs/term_status "accepted"})

(def DataSubjectRight
  "The rights applicable or provided to a Data Subject"
  {:db/ident :dpvo/DataSubjectRight,
   :dcterms/created #inst "2020-11-18T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Beatriz Esteves" "Harshvardhan Pandit"],
   :dcterms/description "The rights applicable or provided to a Data Subject",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Based on use of definitions, the notion of 'Data Subject Right' can be equivalent to 'Individual Right' or 'Right of a Person'",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Data Subject Right",
   :rdfs/subClassOf [:dpvo/Right :dpvo/DataSubjectRight],
   :vs/term_status "accepted"})

(def DataSubjectScale
  "Scale of Data Subject(s)"
  {:db/ident            :dpvo/DataSubjectScale,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Rana Saniei" "Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description "Scale of Data Subject(s)",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Data Subject Scale",
   :rdfs/subClassOf     [:dpvo/Scale
                         :dpvo/DataSubjectScale
                         :dpvo/Context
                         :dpvo/ProcessingContext],
   :vs/term_status      "accepted"})

(def DataTransferImpactAssessment
  "Impact Assessment for conducting data transfers"
  {:db/ident            :dpvo/DataTransferImpactAssessment,
   :dcterms/created     #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description "Impact Assessment for conducting data transfers",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Data Transfer Impact Assessment",
   :rdfs/subClassOf     [:dpvo/ImpactAssessment
                         :dpvo/DataTransferImpactAssessment
                         :dpvo/OrganisationalMeasure
                         :dpvo/TechnicalOrganisationalMeasure
                         :dpvo/Assessment],
   :vs/term_status      "accepted"})

(def DataTransferLegalBasis
  "Specific or special categories and instances of legal basis intended for justifying data transfers"
  {:db/ident :dpvo/DataTransferLegalBasis,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["David Hickey" "Georg P Krogg"],
   :dcterms/description
   "Specific or special categories and instances of legal basis intended for justifying data transfers",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Data Transfer Legal Basis",
   :rdfs/subClassOf [:dpvo/LegalBasis :dpvo/DataTransferLegalBasis],
   :vs/term_status "accepted"})

(def DataVolume
  "Volume or Scale of Data"
  {:db/ident            :dpvo/DataVolume,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Rana Saniei" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description "Volume or Scale of Data",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Data Volume",
   :rdfs/subClassOf     [:dpvo/Scale
                         :dpvo/DataVolume
                         :dpvo/Context
                         :dpvo/ProcessingContext],
   :vs/term_status      "accepted"})

(def DecentralisedLocations
  "Location that is spread across multiple separate areas with no distinction between their importance"
  {:db/ident :dpvo/DecentralisedLocations,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Location that is spread across multiple separate areas with no distinction between their importance",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Decentralised Locations",
   :rdfs/subClassOf [:dpvo/LocationFixture :dpvo/DecentralisedLocations],
   :vs/term_status "modified"})

(def DecisionMaking
  "Processing that involves decision making"
  {:db/ident            :dpvo/DecisionMaking,
   :dcterms/created     #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Processing that involves decision making",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Decision Making",
   :rdfs/subClassOf     [:dpvo/ProcessingContext
                         :dpvo/DecisionMaking
                         :dpvo/Context],
   :vs/term_status      "accepted"})

(def Deidentification
  "Removal of identity or information to reduce identifiability"
  {:db/ident :dpvo/Deidentification,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Mark Lizar" "Rob Brennan" "Axel Polleres" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Removal of identity or information to reduce identifiability",
   :dcterms/modified #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source "https://nvlpubs.nist.gov/nistpubs/ir/2015/NIST.IR.8053.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "De-Identification",
   :rdfs/subClassOf [:dpvo/DataSanitisationTechnique
                     :dpvo/Deidentification
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "modified"})

(def DeliveryOfGoods
  "Purposes associated with delivering goods and services requested or asked by consumer"
  {:db/ident :dpvo/DeliveryOfGoods,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling"
                     "Simon Steyskal"
                     "Harshvardhan J. Pandit"
                     "Axel Polleres"
                     "Javier Fernandez"
                     "Fajar Ekaputra"],
   :dcterms/description
   "Purposes associated with delivering goods and services requested or asked by consumer",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Delivery of Goods",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/purposes#Delivery"],
   :rdfs/subClassOf [:dpvo/RequestedServiceProvision
                     :dpvo/DeliveryOfGoods
                     :dpvo/Purpose
                     :dpvo/ServiceProvision],
   :vs/term_status "accepted"})

(def Derive
  "to create new derivative data from the original data"
  {:db/ident :dpvo/Derive,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description "to create new derivative data from the original data",
   :dcterms/source "https://specialprivacy.ercim.eu/vocabs/processing",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Derive indicates data is present or obtainable from existing data. For data that is created without such existence, see Infer.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Derive",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/processing#Derive"],
   :rdfs/subClassOf [:dpvo/Obtain :dpvo/Derive :dpvo/Processing],
   :vs/term_status "accepted"})

(def DerivedPersonalData
  "Personal Data that is obtained or derived from other data"
  {:db/ident :dpvo/DerivedPersonalData,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   "Personal Data that is obtained or derived from other data",
   :dcterms/modified #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Derived Data is data that is obtained through processing of existing data, e.g. deriving first name from full name. To indicate data that is derived but which was not present or evident within the source data, InferredPersonalData should be used.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Derived Personal Data",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Derived"],
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo/DerivedPersonalData :dpvo/Data],
   :vs/term_status "accepted"})

(def DesignStandard
  "A set of rules or guidelines outlining criterias for design"
  {:db/ident :dpvo/DesignStandard,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Mark Lizar" "Axel Polleres" "Rob Brennan"],
   :dcterms/description
   "A set of rules or guidelines outlining criterias for design",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Design Standard",
   :rdfs/subClassOf [:dpvo/GuidelinesPrinciple
                     :dpvo/DesignStandard
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def Destruct
  "to process data in a way it no longer exists or cannot be repaired"
  {:db/ident :dpvo/Destruct,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   "to process data in a way it no longer exists or cannot be repaired",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Destruct",
   :rdfs/subClassOf [:dpvo/Remove :dpvo/Destruct :dpvo/Processing],
   :vs/term_status "accepted"})

(def DeterministicPseudonymisation
  "Pseudonymisation achieved through a deterministic function"
  {:db/ident :dpvo/DeterministicPseudonymisation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Pseudonymisation achieved through a deterministic function",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Deterministic Pseudonymisation",
   :rdfs/subClassOf [:dpvo/Pseudonymisation
                     :dpvo/DeterministicPseudonymisation
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure
                     :dpvo/DataSanitisationTechnique
                     :dpvo/Deidentification],
   :vs/term_status "accepted"})

(def Detriment
  "Impact that acts as or causes detriments"
  {:db/ident            :dpvo/Detriment,
   :dcterms/created     #inst "2022-03-23T00:00:00.000-04:00",
   :dcterms/creator     ["Beatriz Esteves"
                         "Julian Flake"
                         "Harshvardhan J. Pandit"
                         "Fajar Ekaputra"
                         "Georg P Krog"],
   :dcterms/description "Impact that acts as or causes detriments",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Detriment",
   :rdfs/subClassOf     [:dpvo/Impact :dpvo/Detriment :dpvo/Consequence],
   :vs/term_status      "accepted"})

(def DifferentialPrivacy
  "Utilisation of differential privacy where information is shared as patterns or groups to withold individual elements"
  {:db/ident :dpvo/DifferentialPrivacy,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Utilisation of differential privacy where information is shared as patterns or groups to withold individual elements",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Differential Privacy",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/DifferentialPrivacy
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def DigitalRightsManagement
  "Management of access, use, and other operations associated with digital content"
  {:db/ident :dpvo/DigitalRightsManagement,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Management of access, use, and other operations associated with digital content",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Digital Rights Management",
   :rdfs/subClassOf [:dpvo/TechnicalMeasure
                     :dpvo/DigitalRightsManagement
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def DigitalSignatures
  "Expression and authentication of identity through digital information containing cryptographic signatures"
  {:db/ident :dpvo/DigitalSignatures,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Expression and authentication of identity through digital information containing cryptographic signatures",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Digital Signatures",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/DigitalSignatures
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def DirectMarketing
  "Purposes associated with conducting direct marketing i.e. marketing communicated directly to the individual"
  {:db/ident :dpvo/DirectMarketing,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Beatriz Esteves" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   "Purposes associated with conducting direct marketing i.e. marketing communicated directly to the individual",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Direct Marketing",
   :rdfs/subClassOf [:dpvo/Marketing :dpvo/DirectMarketing :dpvo/Purpose],
   :vs/term_status "accepted"})

(def DisasterRecoveryProcedures
  "Procedures related to management of disasters and recovery"
  {:db/ident :dpvo/DisasterRecoveryProcedures,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Procedures related to management of disasters and recovery",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Disaster Recovery Procedures",
   :rdfs/subClassOf [:dpvo/GovernanceProcedures
                     :dpvo/DisasterRecoveryProcedures
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def Disclose
  "to make data known"
  {:db/ident :dpvo/Disclose,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description "to make data known",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Disclose",
   :rdfs/subClassOf [:dpvo/Processing :dpvo/Disclose],
   :vs/term_status "accepted"})

(def DiscloseByTransmission
  "to disclose data by means of transmission"
  {:db/ident :dpvo/DiscloseByTransmission,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description "to disclose data by means of transmission",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Disclose by Transmission",
   :rdfs/subClassOf
   [:dpvo/Disclose :dpvo/DiscloseByTransmission :dpvo/Processing],
   :vs/term_status "accepted"})

(def DisputeManagement
  "Purposes associated with activities that manage disputes by natural persons, private bodies, or public authorities relevant to organisation"
  {:db/ident :dpvo/DisputeManagement,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit" "Beatriz Esteves"],
   :dcterms/description
   "Purposes associated with activities that manage disputes by natural persons, private bodies, or public authorities relevant to organisation",
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Dispute Management",
   :rdfs/subClassOf
   [:dpvo/OrganisationGovernance :dpvo/DisputeManagement :dpvo/Purpose],
   :vs/term_status "accepted"})

(def Disseminate
  "to spread data throughout"
  {:db/ident :dpvo/Disseminate,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description "to spread data throughout",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Disseminate",
   :rdfs/subClassOf [:dpvo/Disclose :dpvo/Disseminate :dpvo/Processing],
   :vs/term_status "accepted"})

(def DistributedSystemSecurity
  "Security implementations provided using or over a distributed system"
  {:db/ident :dpvo/DistributedSystemSecurity,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Security implementations provided using or over a distributed system",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Distributed System Security",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/DistributedSystemSecurity
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def DocumentRandomisedPseudonymisation
  "Use of randomised pseudonymisation where the same elements are assigned different values in the same document or database"
  {:db/ident :dpvo/DocumentRandomisedPseudonymisation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Use of randomised pseudonymisation where the same elements are assigned different values in the same document or database",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Document Randomised Pseudonymisation",
   :rdfs/subClassOf [:dpvo/Pseudonymisation
                     :dpvo/DocumentRandomisedPseudonymisation
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure
                     :dpvo/DataSanitisationTechnique
                     :dpvo/Deidentification],
   :vs/term_status "accepted"})

(def DocumentSecurity
  "Security measures enacted over documents to protect against tampering or restrict access"
  {:db/ident :dpvo/DocumentSecurity,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Security measures enacted over documents to protect against tampering or restrict access",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Document Security",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/DocumentSecurity
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def Duration
  "The duration or temporal limitation"
  {:db/ident            :dpvo/Duration,
   :dcterms/created     #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "The duration or temporal limitation",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Duration",
   :rdfs/subClassOf     [:dpvo/Context :dpvo/Duration],
   :vs/term_status      "accepted"})

(def EconomicUnion
  "A political union of two or more countries based on economic or trade agreements"
  {:db/ident :dpvo/EconomicUnion,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A political union of two or more countries based on economic or trade agreements",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Economic Union",
   :rdfs/subClassOf [:dpvo/Location :dpvo/EconomicUnion],
   :vs/term_status "accepted"})

(def EducationalTraining
  "Training methods that are intended to provide education on topic(s)"
  {:db/ident :dpvo/EducationalTraining,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Training methods that are intended to provide education on topic(s)",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Educational Training",
   :rdfs/subClassOf [:dpvo/StaffTraining
                     :dpvo/EducationalTraining
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def EffectivenessDeterminationProcedures
  "Procedures intended to determine effectiveness of other measures"
  {:db/ident :dpvo/EffectivenessDeterminationProcedures,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Procedures intended to determine effectiveness of other measures",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Effectiveness Determination Procedures",
   :rdfs/subClassOf [:dpvo/Assessment
                     :dpvo/EffectivenessDeterminationProcedures
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def ElderlyDataSubject
  "Data subjects that are considered elderly (i.e. based on age)"
  {:db/ident :dpvo/ElderlyDataSubject,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   "Data subjects that are considered elderly (i.e. based on age)",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Elderly Data Subject",
   :rdfs/subClassOf [:dpvo/VulnerableDataSubject
                     :dpvo/ElderlyDataSubject
                     :dpvo/DataSubject
                     :dpvo/Entity
                     :dpvo/NaturalPerson
                     :dpvo/LegalEntity],
   :vs/term_status "accepted"})

(def Employee
  "Data subjects that are employees"
  {:db/ident            :dpvo/Employee,
   :dcterms/created     #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P. Krog"
                         "Julian Flake"
                         "Harshvardhan J. Pandit"
                         "Beatriz Esteves"
                         "Paul Ryan"],
   :dcterms/description "Data subjects that are employees",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Employee",
   :rdfs/subClassOf     [:dpvo/DataSubject
                         :dpvo/Employee
                         :dpvo/Entity
                         :dpvo/NaturalPerson
                         :dpvo/LegalEntity],
   :vs/term_status      "accepted"})

(def Encryption
  "Technical measures consisting of encryption"
  {:db/ident            :dpvo/Encryption,
   :dcterms/created     #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator     ["Rob Brennan"
                         "Axel Polleres"
                         "Harshvardhan J. Pandit"
                         "Mark Lizar"],
   :dcterms/description "Technical measures consisting of encryption",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Encryption",
   :rdfs/subClassOf     [:dpvo/TechnicalMeasure
                         :dpvo/Encryption
                         :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status      "accepted"})

(def EncryptionAtRest
  "Encryption of data when being stored (persistent encryption)"
  {:db/ident :dpvo/EncryptionAtRest,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Axel Polleres" "Mark Lizar" "Rob Brennan"],
   :dcterms/description
   "Encryption of data when being stored (persistent encryption)",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Encryption at Rest",
   :rdfs/subClassOf [:dpvo/Encryption
                     :dpvo/EncryptionAtRest
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def EncryptionInTransfer
  "Encryption of data in transit e.g. when being transferred from one location to another, including sharing"
  {:db/ident :dpvo/EncryptionInTransfer,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Axel Polleres" "Rob Brennan" "Harshvardhan J. Pandit" "Mark Lizar"],
   :dcterms/description
   "Encryption of data in transit e.g. when being transferred from one location to another, including sharing",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Encryption in Transfer",
   :rdfs/subClassOf [:dpvo/Encryption
                     :dpvo/EncryptionInTransfer
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def EncryptionInUse
  "Encryption of data when it is being used"
  {:db/ident            :dpvo/EncryptionInUse,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Encryption of data when it is being used",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Encryption in Use",
   :rdfs/subClassOf     [:dpvo/Encryption
                         :dpvo/EncryptionInUse
                         :dpvo/TechnicalOrganisationalMeasure
                         :dpvo/TechnicalMeasure],
   :vs/term_status      "accepted"})

(def EndToEndEncryption
  "Encrypted communications where data is encrypted by the sender and decrypted by the intended receiver to prevent access to any third party"
  {:db/ident :dpvo/EndToEndEncryption,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Encrypted communications where data is encrypted by the sender and decrypted by the intended receiver to prevent access to any third party",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "End-to-End Encryption (E2EE)",
   :rdfs/subClassOf [:dpvo/Encryption
                     :dpvo/EndToEndEncryption
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def EndlessDuration
  "Duration that is (known or intended to be) open ended or without an end"
  {:db/ident :dpvo/EndlessDuration,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Duration that is (known or intended to be) open ended or without an end",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type [:dpvo/Duration :owl/NamedIndividual :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Endless Duration",
   :vs/term_status "modified"})

(def EnforceAccessControl
  "Purposes associated with conducting or enforcing access control as a form of security"
  {:db/ident :dpvo/EnforceAccessControl,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra"
                     "Javier Fernandez"
                     "Simon Steyskal"
                     "Elmar Kiesling"
                     "Axel Polleres"
                     "Harshvardhan J. Pandit"],
   :dcterms/description
   "Purposes associated with conducting or enforcing access control as a form of security",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Was previously \"Access Control\". Prefixed to distinguish from Technical Measure.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Enforce Access Control",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/purposes#Login"],
   :rdfs/subClassOf
   [:dpvo/EnforceSecurity :dpvo/EnforceAccessControl :dpvo/Purpose],
   :vs/term_status "accepted"})

(def EnforceSecurity
  "Purposes associated with ensuring and enforcing security for data, personnel, or other related matters"
  {:db/ident :dpvo/EnforceSecurity,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres"
                     "Fajar Ekaputra"
                     "Elmar Kiesling"
                     "Javier Fernandez"
                     "Harshvardhan J. Pandit"
                     "Simon Steyskal"],
   :dcterms/description
   "Purposes associated with ensuring and enforcing security for data, personnel, or other related matters",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Was previous \"Security\". Prefixed to distinguish from TechOrg measures.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Enforce Security",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/EnforceSecurity],
   :vs/term_status "accepted"})

(def EnterIntoContract
  "Processing necessary to enter into contract"
  {:db/ident            :dpvo/EnterIntoContract,
   :dcterms/created     #inst "2021-04-07T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog" "Paul Ryan"],
   :dcterms/description "Processing necessary to enter into contract",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Enter Into Contract",
   :rdfs/subClassOf     [:dpvo/Contract
                         :dpvo/EnterIntoContract
                         :dpvo/OrganisationalMeasure
                         :dpvo/LegalBasis
                         :dpvo/TechnicalOrganisationalMeasure
                         :dpvo/LegalAgreement],
   :vs/term_status      "accepted"})

(def Entity
  "A human or non-human 'thing' that constitutes as an entity"
  {:db/ident :dpvo/Entity,
   :dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A human or non-human 'thing' that constitutes as an entity",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Entity",
   :rdfs/subClassOf :dpvo/Entity,
   :vs/term_status "accepted"})

(def Erase
  "to delete data"
  {:db/ident :dpvo/Erase,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description "to delete data",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Erase",
   :rdfs/subClassOf [:dpvo/Remove :dpvo/Erase :dpvo/Processing],
   :vs/term_status "accepted"})

(def EstablishContractualAgreement
  "Purposes associated with carrying out data processing to establish an agreement, such as for entering into a contract"
  {:db/ident :dpvo/EstablishContractualAgreement,
   :dcterms/created #inst "2022-11-09T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Purposes associated with carrying out data processing to establish an agreement, such as for entering into a contract",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Establish Contractual Agreement",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/EstablishContractualAgreement],
   :vs/term_status "accepted"})

(def EvaluationOfIndividuals
  "Processing that involves evaluation of individuals"
  {:db/ident :dpvo/EvaluationOfIndividuals,
   :dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Processing that involves evaluation of individuals",
   :dcterms/modified #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Evaluation of Individuals",
   :rdfs/subClassOf [:dpvo/EvaluationScoring
                     :dpvo/EvaluationOfIndividuals
                     :dpvo/Context
                     :dpvo/ProcessingContext],
   :vs/term_status "modified"})

(def EvaluationScoring
  "Processing that involves evaluation and scoring of individuals"
  {:db/ident :dpvo/EvaluationScoring,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Piero Bonatti" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Processing that involves evaluation and scoring of individuals",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Evaluation and Scoring",
   :rdfs/subClassOf
   [:dpvo/ProcessingContext :dpvo/EvaluationScoring :dpvo/Context],
   :vs/term_status "accepted"})

(def ExplicitlyExpressedConsent
  "Consent that is expressed through an explicit action solely conveying a consenting decision"
  {:db/ident :dpvo/ExplicitlyExpressedConsent,
   :dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J. Pandit" "Julian Flake" "Georg P Krog"],
   :dcterms/description
   "Consent that is expressed through an explicit action solely conveying a consenting decision",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Explicitly expressed consent is a more specific form of Expressed consent where the action taken must 'explicitly' relate to only the consent decision. Expressed consent where the consenting is part of other matters therefore cannot satisfy the requirements of explicitly expressed consent. An example of explicit action expressing the consenting decision is a button on a web form where the form only relates to consent, or it is accompanied with suitable text that reiterates what the consenting decision is about",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Explicitly Expressed Consent",
   :rdfs/subClassOf [:dpvo/ExpressedConsent
                     :dpvo/ExplicitlyExpressedConsent
                     :dpvo/Consent
                     :dpvo/LegalBasis
                     :dpvo/InformedConsent],
   :vs/term_status "accepted"})

(def ExpressedConsent
  "Consent that is expressed through an action intended to convey a consenting decision"
  {:db/ident :dpvo/ExpressedConsent,
   :dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Harshvardhan J. Pandit" "Julian Flake"],
   :dcterms/description
   "Consent that is expressed through an action intended to convey a consenting decision",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Expressed consent requires the individual take a specific and unambigious action that directly indicates their consent. This action may be a part of other processes such as setting preferences, or agreeing to a contract, or other matters not relating to consent. An example of expressed consent is interacting with a checkbox within a dashboard or clicking a button on a web form",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Expressed Consent",
   :rdfs/subClassOf [:dpvo/InformedConsent
                     :dpvo/ExpressedConsent
                     :dpvo/Consent
                     :dpvo/LegalBasis],
   :vs/term_status "accepted"})

(def FederatedLocations
  "Location that is federated across multiple separate areas with designation of a primary or central location"
  {:db/ident :dpvo/FederatedLocations,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Location that is federated across multiple separate areas with designation of a primary or central location",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Federated Locations",
   :rdfs/subClassOf [:dpvo/LocationFixture :dpvo/FederatedLocations],
   :vs/term_status "modified"})

(def FileSystemSecurity
  "Security implemented over a file system"
  {:db/ident :dpvo/FileSystemSecurity,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Security implemented over a file system",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "File System Security",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/FileSystemSecurity
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def Filter
  "to filter or keep data for some criteria"
  {:db/ident            :dpvo/Filter,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description "to filter or keep data for some criteria",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Filter",
   :rdfs/subClassOf     [:dpvo/Transform :dpvo/Filter :dpvo/Processing],
   :vs/term_status      "accepted"})

(def FixedLocation
  "Location that is fixed i.e. known to occur at a specific place"
  {:db/ident :dpvo/FixedLocation,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Location that is fixed i.e. known to occur at a specific place",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Fixed Location",
   :rdfs/subClassOf [:dpvo/LocationFixture :dpvo/FixedLocation],
   :vs/term_status "modified"})

(def FixedMultipleLocations
  "Location that is fixed with multiple places e.g. multiple cities"
  {:db/ident :dpvo/FixedMultipleLocations,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Location that is fixed with multiple places e.g. multiple cities",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Fixed Multiple Locations",
   :rdfs/subClassOf
   [:dpvo/FixedLocation :dpvo/FixedMultipleLocations :dpvo/LocationFixture],
   :vs/term_status "modified"})

(def FixedOccurencesDuration
  "Duration that takes place a fixed number of times e.g. 3 times"
  {:db/ident :dpvo/FixedOccurencesDuration,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Duration that takes place a fixed number of times e.g. 3 times",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Fixed Occurences Duration",
   :rdfs/subClassOf
   [:dpvo/Duration :dpvo/FixedOccurencesDuration :dpvo/Context],
   :vs/term_status "modified"})

(def FixedSingularLocation
  "Location that is fixed at a specific place e.g. a city"
  {:db/ident :dpvo/FixedSingularLocation,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Location that is fixed at a specific place e.g. a city",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Fixed Singular Location",
   :rdfs/subClassOf
   [:dpvo/FixedLocation :dpvo/FixedSingularLocation :dpvo/LocationFixture],
   :vs/term_status "modified"})

(def ForProfitOrganisation
  "An organisation that aims to achieve profit as its primary goal"
  {:db/ident :dpvo/ForProfitOrganisation,
   :dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "An organisation that aims to achieve profit as its primary goal",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "For-Profit Organisation",
   :rdfs/subClassOf [:dpvo/Organisation
                     :dpvo/ForProfitOrganisation
                     :dpvo/Entity
                     :dpvo/LegalEntity],
   :vs/term_status "modified"})

(def FraudPreventionAndDetection
  "Purposes associated with fraud detection, prevention, and mitigation"
  {:db/ident :dpvo/FraudPreventionAndDetection,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra"
                     "Javier Fernandez"
                     "Axel Polleres"
                     "Harshvardhan J. Pandit"
                     "Simon Steyskal"
                     "Elmar Kiesling"],
   :dcterms/description
   "Purposes associated with fraud detection, prevention, and mitigation",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Fraud Prevention and Detection",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/purposes#Government"],
   :rdfs/subClassOf
   [:dpvo/EnforceSecurity :dpvo/FraudPreventionAndDetection :dpvo/Purpose],
   :vs/term_status "accepted"})

(def Frequency
  "The frequency or information about periods and repetitions in terms of recurrence."
  {:db/ident :dpvo/Frequency,
   :dcterms/created #inst "2022-02-16T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The frequency or information about periods and repetitions in terms of recurrence.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Frequency",
   :rdfs/subClassOf [:dpvo/Context :dpvo/Frequency],
   :vs/term_status "accepted"})

(def FulfilmentOfContractualObligation
  "Purposes associated with carrying out data processing to fulfill a contractual obligation"
  {:db/ident :dpvo/FulfilmentOfContractualObligation,
   :dcterms/created #inst "2022-11-09T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Purposes associated with carrying out data processing to fulfill a contractual obligation",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Fulfilment of Contractual Obligation",
   :rdfs/subClassOf [:dpvo/FulfilmentOfObligation
                     :dpvo/FulfilmentOfContractualObligation
                     :dpvo/Purpose],
   :vs/term_status "accepted"})

(def FulfilmentOfObligation
  "Purposes associated with carrying out data processing to fulfill an obligation"
  {:db/ident :dpvo/FulfilmentOfObligation,
   :dcterms/created #inst "2022-11-09T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Purposes associated with carrying out data processing to fulfill an obligation",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Fulfilment of Obligation",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/FulfilmentOfObligation],
   :vs/term_status "accepted"})

(def FullyAutomatedProcessing
  "Processing that is fully automated"
  {:db/ident            :dpvo/FullyAutomatedProcessing,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Processing that is fully automated",
   :rdf/type            [:dpvo/AutomationOfProcessing
                         :owl/NamedIndividual
                         :dpvo/ProcessingContext
                         :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Fully Automated Processing",
   :vs/term_status      "accepted"})

(def FullyRandomisedPseudonymisation
  "Use of randomised pseudonymisation where the same elements are assigned different values each time they occur"
  {:db/ident :dpvo/FullyRandomisedPseudonymisation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Use of randomised pseudonymisation where the same elements are assigned different values each time they occur",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Fully Randomised Pseudonymisation",
   :rdfs/subClassOf [:dpvo/Pseudonymisation
                     :dpvo/FullyRandomisedPseudonymisation
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure
                     :dpvo/DataSanitisationTechnique
                     :dpvo/Deidentification],
   :vs/term_status "accepted"})

(def Generate
  "to generate or create data"
  {:db/ident            :dpvo/Generate,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "to generate or create data",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Generate",
   :rdfs/subClassOf     [:dpvo/Obtain :dpvo/Generate :dpvo/Processing],
   :vs/term_status      "accepted"})

(def GeneratedPersonalData
  "Personal Data that is generated or brought into existence without relation to existing data i.e. it is not derived or inferred from other data"
  {:db/ident :dpvo/GeneratedPersonalData,
   :dcterms/created #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Personal Data that is generated or brought into existence without relation to existing data i.e. it is not derived or inferred from other data",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Generated Data is used to indicate data that is produced and is not derived or inferred from other data",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Generated Personal Data",
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo/GeneratedPersonalData :dpvo/Data],
   :vs/term_status "accepted"})

(def GeographicCoverage
  "Indicate of scale in terms of geographic coverage"
  {:db/ident            :dpvo/GeographicCoverage,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description "Indicate of scale in terms of geographic coverage",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Geographic Coverage",
   :rdfs/subClassOf     [:dpvo/Scale
                         :dpvo/GeographicCoverage
                         :dpvo/Context
                         :dpvo/ProcessingContext],
   :vs/term_status      "accepted"})

(def GlobalScale
  "Geographic coverage spanning the entire globe"
  {:db/ident            :dpvo/GlobalScale,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Geographic coverage spanning the entire globe",
   :rdf/type            [:dpvo/GeographicCoverage
                         :owl/NamedIndividual
                         :dpvo/Scale
                         :dpvo/ProcessingContext
                         :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Global Scale",
   :vs/term_status      "accepted"})

(def GovernanceProcedures
  "Procedures related to governance (e.g. organisation, unit, team, process, system)"
  {:db/ident :dpvo/GovernanceProcedures,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Procedures related to governance (e.g. organisation, unit, team, process, system)",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Governance Procedures",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/GovernanceProcedures
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def GovernmentalOrganisation
  "An organisation managed or part of government"
  {:db/ident            :dpvo/GovernmentalOrganisation,
   :dcterms/created     #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "An organisation managed or part of government",
   :dcterms/modified    #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Governmental Organisation",
   :rdfs/subClassOf     [:dpvo/Organisation
                         :dpvo/GovernmentalOrganisation
                         :dpvo/Entity
                         :dpvo/LegalEntity],
   :vs/term_status      "modified"})

(def GuardianOfDataSubject
  "Guardian(s) of data subjects such as children"
  {:db/ident            :dpvo/GuardianOfDataSubject,
   :dcterms/created     #inst "2022-08-03T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description "Guardian(s) of data subjects such as children",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Guardian(s) of Data Subject",
   :rdfs/subClassOf     [:dpvo/DataSubject
                         :dpvo/GuardianOfDataSubject
                         :dpvo/Entity
                         :dpvo/NaturalPerson
                         :dpvo/LegalEntity],
   :vs/term_status      "accepted"})

(def GuidelinesPrinciple
  "Guidelines or Principles regarding processing and operational measures"
  {:db/ident :dpvo/GuidelinesPrinciple,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Axel Polleres" "Mark Lizar" "Harshvardhan J. Pandit" "Rob Brennan"],
   :dcterms/description
   "Guidelines or Principles regarding processing and operational measures",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "GuidelinesPrinciple",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/GuidelinesPrinciple
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def HardwareSecurityProtocols
  "Security protocols implemented at or within hardware"
  {:db/ident :dpvo/HardwareSecurityProtocols,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Security protocols implemented at or within hardware",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Hardware Security Protocols",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/HardwareSecurityProtocols
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def Harm
  "Impact that acts as or causes harms"
  {:db/ident            :dpvo/Harm,
   :dcterms/created     #inst "2022-08-13T00:00:00.000-04:00",
   :dcterms/creator     ["Beatriz Esteves"
                         "Georg P Krog"
                         "Harshvardhan J. Pandit"
                         "Julian Flake"
                         "Fajar Ekaputra"],
   :dcterms/description "Impact that acts as or causes harms",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Harm",
   :rdfs/subClassOf     [:dpvo/Damage
                         :dpvo/Harm
                         :dpvo/Consequence
                         :dpvo/Impact],
   :vs/term_status      "changed"})

(def HashFunctions
  "Use of hash functions to map information or to retrieve a prior categorisation"
  {:db/ident :dpvo/HashFunctions,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Use of hash functions to map information or to retrieve a prior categorisation",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Hash Functions",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/HashFunctions
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def HashMessageAuthenticationCode
  "Use of HMAC where message authentication code (MAC) utilise a cryptographic hash function and a secret cryptographic key"
  {:db/ident :dpvo/HashMessageAuthenticationCode,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Use of HMAC where message authentication code (MAC) utilise a cryptographic hash function and a secret cryptographic key",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Hash-based Message Authentication Code (HMAC)",
   :rdfs/subClassOf [:dpvo/CryptographicAuthentication
                     :dpvo/HashMessageAuthenticationCode
                     :dpvo/AuthenticationProtocols
                     :dpvo/CryptographicMethods
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def HomomorphicEncryption
  "Use of Homomorphic encryption that permits computations on encrypted data without decrypting it"
  {:db/ident :dpvo/HomomorphicEncryption,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Use of Homomorphic encryption that permits computations on encrypted data without decrypting it",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Homomorphic Encryption",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/HomomorphicEncryption
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def HugeDataVolume
  "Data volume that is considered huge or more than large within the context"
  {:db/ident :dpvo/HugeDataVolume,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Data volume that is considered huge or more than large within the context",
   :rdf/type [:owl/NamedIndividual
              :dpvo/DataVolume
              :dpvo/Scale
              :dpvo/ProcessingContext
              :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Huge Data Volume",
   :vs/term_status "accepted"})

(def HugeScaleOfDataSubjects
  "Scale of data subjects considered huge or more than large within the context"
  {:db/ident :dpvo/HugeScaleOfDataSubjects,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Scale of data subjects considered huge or more than large within the context",
   :rdf/type [:dpvo/DataSubjectScale
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/Scale
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Huge Scale Of Data Subjects",
   :vs/term_status "accepted"})

(def HumanInvolvement
  "The involvement of humans in specified context"
  {:db/ident :dpvo/HumanInvolvement,
   :dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "The involvement of humans in specified context",
   :dcterms/modified #inst "2022-06-15T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Human Involvement here broadly refers to any involvement by a human in the context of carrying out processing. This may include verification of outcomes, providing input data for making decisions, or overseeing activities.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Human Involvement",
   :rdfs/subClassOf [:dpvo/AutomationOfProcessing
                     :dpvo/HumanInvolvement
                     :dpvo/Context
                     :dpvo/ProcessingContext],
   :vs/term_status "accepted"})

(def HumanInvolvementForInput
  "Human involvement for the purposes of providing inputs"
  {:db/ident :dpvo/HumanInvolvementForInput,
   :dcterms/created #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Human involvement for the purposes of providing inputs",
   :rdf/type [:owl/NamedIndividual
              :dpvo/HumanInvolvement
              :dpvo/AutomationOfProcessing
              :dpvo/ProcessingContext
              :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Human Involvement for Input",
   :vs/term_status "accepted"})

(def HumanInvolvementForOversight
  "Human involvement for the purposes of having oversight over a system, its operations, inputs, or outputs"
  {:db/ident :dpvo/HumanInvolvementForOversight,
   :dcterms/created #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Human involvement for the purposes of having oversight over a system, its operations, inputs, or outputs",
   :rdf/type [:owl/NamedIndividual
              :dpvo/HumanInvolvement
              :dpvo/AutomationOfProcessing
              :dpvo/ProcessingContext
              :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Human Involvement for Oversight",
   :vs/term_status "accepted"})

(def HumanInvolvementForVerification
  "Human involvement for the purposes of verification of a system, its operations, inputs, or outputs"
  {:db/ident :dpvo/HumanInvolvementForVerification,
   :dcterms/created #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Human involvement for the purposes of verification of a system, its operations, inputs, or outputs",
   :rdf/type [:owl/NamedIndividual
              :dpvo/HumanInvolvement
              :dpvo/AutomationOfProcessing
              :dpvo/ProcessingContext
              :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Human Involvement for Verification",
   :vs/term_status "accepted"})

(def HumanResourceManagement
  "Purposes associated with managing humans and 'human resources' within the organisation for effective and efficient operations."
  {:db/ident :dpvo/HumanResourceManagement,
   :dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog"
                     "Paul Ryan"
                     "Harshvardhan J. Pandit"
                     "Beatriz Esteves"
                     "David Hickey"],
   :dcterms/description
   "Purposes associated with managing humans and 'human resources' within the organisation for effective and efficient operations.",
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/type :owl/Class,
   :rdfs/comment
   "HR is a broad concept. Its management includes, amongst others - recruiting employees and intermediaries e.g. brokers, independent representatives; payroll administration, remunerations, commissions, and wages; and application of social legislation.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Human Resource Management",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/HumanResourceManagement],
   :vs/term_status "accepted"})

(def IdentityManagementMethod
  "Management of identity and identity-based processes"
  {:db/ident :dpvo/IdentityManagementMethod,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Management of identity and identity-based processes",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Identity Management Method",
   :rdfs/subClassOf [:dpvo/AuthorisationProcedure
                     :dpvo/IdentityManagementMethod
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def IdentityVerification
  "Purposes associated with verifying or authorising identity as a form of security"
  {:db/ident :dpvo/IdentityVerification,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling"
                     "Axel Polleres"
                     "Harshvardhan J. Pandit"
                     "Fajar Ekaputra"
                     "Simon Steyskal"
                     "Javier Fernandez"],
   :dcterms/description
   "Purposes associated with verifying or authorising identity as a form of security",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Identity Verification",
   :rdfs/subClassOf
   [:dpvo/EnforceSecurity :dpvo/IdentityVerification :dpvo/Purpose],
   :vs/term_status "accepted"})

(def Immigrant
  "Data subjects that are immigrants (for a jurisdiction)"
  {:db/ident :dpvo/Immigrant,
   :dcterms/created #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator ["Beatriz Esteves"
                     "Georg P. Krog"
                     "Harshvardhan J. Pandit"
                     "Paul Ryan"
                     "Julian Flake"],
   :dcterms/description
   "Data subjects that are immigrants (for a jurisdiction)",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Immigrant",
   :rdfs/subClassOf [:dpvo/DataSubject
                     :dpvo/Immigrant
                     :dpvo/Entity
                     :dpvo/NaturalPerson
                     :dpvo/LegalEntity],
   :vs/term_status "accepted"})

(def Impact
  "The impact(s) possible or arising as a consequence from specified context"
  {:db/ident :dpvo/Impact,
   :dcterms/created #inst "2022-03-23T00:00:00.000-04:00",
   :dcterms/creator ["Beatriz Esteves"
                     "Julian Flake"
                     "Fajar Ekaputra"
                     "Georg P Krog"
                     "Harshvardhan J. Pandit"],
   :dcterms/description
   "The impact(s) possible or arising as a consequence from specified context",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Impact is a stronger notion of consequence in terms of influence, change, or effect on something e.g. for impact assessments",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Impact",
   :rdfs/subClassOf [:dpvo/Consequence :dpvo/Impact],
   :vs/term_status "accepted"})

(def ImpactAssessment
  "Calculating or determining the likelihood of impact of an existing or proposed process, which can involve risks or detriments."
  {:db/ident :dpvo/ImpactAssessment,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Calculating or determining the likelihood of impact of an existing or proposed process, which can involve risks or detriments.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Impact Assessment",
   :rdfs/subClassOf [:dpvo/Assessment
                     :dpvo/ImpactAssessment
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def ImpliedConsent
  "Consent that is implied indirectly through an action not associated solely with conveying a consenting decision"
  {:db/ident :dpvo/ImpliedConsent,
   :dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan" "Julian Flake"],
   :dcterms/description
   "Consent that is implied indirectly through an action not associated solely with conveying a consenting decision",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Implied consent is expected to also be Informed Consent. An example is a CCTV notice outside a monitored area that informs the individuals that by walking in they would be consenting to the use of camera for surveillance.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Implied Consent",
   :rdfs/subClassOf
   [:dpvo/InformedConsent :dpvo/ImpliedConsent :dpvo/Consent :dpvo/LegalBasis],
   :vs/term_status "accepted"})

(def Importance
  "An indication of 'importance' within a context"
  {:db/ident :dpvo/Importance,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator ["Beatriz Esteves"
                     "Georg P Krog"
                     "Julian Flake"
                     "Harshvardhan J. Pandit"
                     "Paul Ryan"],
   :dcterms/description "An indication of 'importance' within a context",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Importance can be used to express importance, desirability, relevance, or significance as a context.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Importance",
   :rdfs/subClassOf [:dpvo/Context :dpvo/Importance],
   :vs/term_status "accepted"})

(def ImproveExistingProductsAndServices
  "Purposes associated with improving existing products and services"
  {:db/ident :dpvo/ImproveExistingProductsAndServices,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra"
                     "Elmar Kiesling"
                     "Simon Steyskal"
                     "Javier Fernandez"
                     "Harshvardhan J. Pandit"
                     "Axel Polleres"],
   :dcterms/description
   "Purposes associated with improving existing products and services",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Improve Existing Products and Services",
   :rdfs/subClassOf [:dpvo/OptimisationForController
                     :dpvo/ImproveExistingProductsAndServices
                     :dpvo/Purpose
                     :dpvo/ServiceProvision
                     :dpvo/ServiceOptimisation],
   :vs/term_status "accepted"})

(def ImproveInternalCRMProcesses
  "Purposes associated with improving customer-relationship management (CRM) processes"
  {:db/ident :dpvo/ImproveInternalCRMProcesses,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra"
                     "Simon Steyskal"
                     "Axel Polleres"
                     "Elmar Kiesling"
                     "Harshvardhan J. Pandit"
                     "Javier Fernandez"],
   :dcterms/description
   "Purposes associated with improving customer-relationship management (CRM) processes",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Improve Internal CRM Processes",
   :rdfs/subClassOf [:dpvo/OptimisationForController
                     :dpvo/CustomerRelationshipManagement
                     :dpvo/ImproveInternalCRMProcesses
                     :dpvo/CustomerManagement
                     :dpvo/Purpose
                     :dpvo/ServiceProvision
                     :dpvo/ServiceOptimisation],
   :vs/term_status "accepted"})

(def IncidentManagementProcedures
  "Procedures related to management of incidents"
  {:db/ident :dpvo/IncidentManagementProcedures,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Procedures related to management of incidents",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Incident Management Procedures",
   :rdfs/subClassOf [:dpvo/GovernanceProcedures
                     :dpvo/IncidentManagementProcedures
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def IncidentReportingCommunication
  "Procedures related to management of incident reporting"
  {:db/ident :dpvo/IncidentReportingCommunication,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Procedures related to management of incident reporting",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Incident Reporting Communication",
   :rdfs/subClassOf [:dpvo/GovernanceProcedures
                     :dpvo/IncidentReportingCommunication
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def IncorrectData
  "Data that is known to be incorrect or inconsistent with some quality requirements"
  {:db/ident :dpvo/IncorrectData,
   :dcterms/created #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Data that is known to be incorrect or inconsistent with some quality requirements",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Incorrect Data",
   :rdfs/subClassOf [:dpvo/Data :dpvo/IncorrectData],
   :vs/term_status "accepted"})

(def IncreaseServiceRobustness
  "Purposes associated with improving robustness and resilience of services"
  {:db/ident :dpvo/IncreaseServiceRobustness,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Simon Steyskal"
                     "Harshvardhan J. Pandit"
                     "Elmar Kiesling"
                     "Fajar Ekaputra"
                     "Javier Fernandez"
                     "Axel Polleres"],
   :dcterms/description
   "Purposes associated with improving robustness and resilience of services",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Increase Service Robustness",
   :rdfs/subClassOf [:dpvo/OptimisationForController
                     :dpvo/IncreaseServiceRobustness
                     :dpvo/Purpose
                     :dpvo/ServiceProvision
                     :dpvo/ServiceOptimisation],
   :vs/term_status "accepted"})

(def IndeterminateDuration
  "Duration that is indeterminate or cannot be determined"
  {:db/ident :dpvo/IndeterminateDuration,
   :dcterms/created #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Duration that is indeterminate or cannot be determined",
   :rdf/type [:dpvo/Duration :owl/NamedIndividual :dpvo/Context],
   :rdfs/comment
   "Indeterminate means (exact or otherwise) information about the duration cannot be determined, which is distinct from 'EndlessDuration' where it is known (or decided) that the duration is open-ended or without an end.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Indeterminate Duration",
   :vs/term_status "accepted"})

(def IndustryConsortium
  "A consortium established and comprising on industry organisations"
  {:db/ident :dpvo/IndustryConsortium,
   :dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A consortium established and comprising on industry organisations",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :dcterms/source "http://purl.org/adms",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Industry Consortium",
   :rdfs/subClassOf
   [:dpvo/Organisation :dpvo/IndustryConsortium :dpvo/Entity :dpvo/LegalEntity],
   :vs/term_status "modified"})

(def Infer
  "to infer data from existing data"
  {:db/ident :dpvo/Infer,
   :dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "to infer data from existing data",
   :dcterms/modified #inst "2022-10-14T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Infer indicates data that is derived without it being present or obtainable from existing data. For data that is presented, and is 'extracted' or 'obtained' from existing data, see Derive.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Infer",
   :rdfs/subClassOf [:dpvo/Derive :dpvo/Infer :dpvo/Processing :dpvo/Obtain],
   :vs/term_status "modified"})

(def InferredPersonalData
  "Personal Data that is obtained through inference from other data"
  {:db/ident :dpvo/InferredPersonalData,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Personal Data that is obtained through inference from other data",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Inferred Data is derived data generated from existing data, but which did not originally exist within it, e.g. inferring demographics from browsing history.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Inferred Personal Data",
   :rdfs/subClassOf [:dpvo/GeneratedPersonalData
                     :dpvo/DerivedPersonalData
                     :dpvo/InferredPersonalData
                     :dpvo/Data
                     :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def InformationFlowControl
  "Use of measures to control information flows"
  {:db/ident :dpvo/InformationFlowControl,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Use of measures to control information flows",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Information Flow Control",
   :rdfs/subClassOf [:dpvo/TechnicalMeasure
                     :dpvo/InformationFlowControl
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def InformationSecurityPolicy
  "Policy regarding security of information"
  {:db/ident :dpvo/InformationSecurityPolicy,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Policy regarding security of information",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Information Security Policy",
   :rdfs/subClassOf [:dpvo/Policy
                     :dpvo/InformationSecurityPolicy
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def InformedConsent
  "Consent that is informed i.e. with the requirement to provide sufficient information to make a consenting decision"
  {:db/ident :dpvo/InformedConsent,
   :dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Julian Flake" "Harshvardhan J. Pandit" "Paul Ryan" "Georg P Krog"],
   :dcterms/description
   "Consent that is informed i.e. with the requirement to provide sufficient information to make a consenting decision",
   :rdf/type :owl/Class,
   :rdfs/comment
   "The specifics for what information should be provided or made available will depend on the context, use-case, or relevant legal requirements",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Informed Consent",
   :rdfs/subClassOf [:dpvo/Consent :dpvo/InformedConsent :dpvo/LegalBasis],
   :vs/term_status "accepted"})

(def InnovativeUseOfNewTechnologies
  "Processing that involves use of innovative and new technologies"
  {:db/ident :dpvo/InnovativeUseOfNewTechnologies,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Piero Bonatti"],
   :dcterms/description
   "Processing that involves use of innovative and new technologies",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Innovative Use of New Technologies",
   :rdfs/subClassOf
   [:dpvo/ProcessingContext :dpvo/InnovativeUseOfNewTechnologies :dpvo/Context],
   :vs/term_status "accepted"})

(def InternalResourceOptimisation
  "Purposes associated with optimisation of internal resource availability and usage for organisation"
  {:db/ident :dpvo/InternalResourceOptimisation,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Simon Steyskal"
                     "Axel Polleres"
                     "Javier Fernandez"
                     "Elmar Kiesling"
                     "Harshvardhan J. Pandit"
                     "Fajar Ekaputra"],
   :dcterms/description
   "Purposes associated with optimisation of internal resource availability and usage for organisation",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Internal Resource Optimisation",
   :rdfs/subClassOf [:dpvo/OptimisationForController
                     :dpvo/InternalResourceOptimisation
                     :dpvo/Purpose
                     :dpvo/ServiceProvision
                     :dpvo/ServiceOptimisation],
   :vs/term_status "accepted"})

(def InternationalOrganisation
  "An organisation and its subordinate bodies governed by public international law, or any other body which is set up by, or on the basis of, an agreement between two or more countries"
  {:db/ident :dpvo/InternationalOrganisation,
   :dcterms/created #inst "2022-03-23T00:00:00.000-04:00",
   :dcterms/creator ["Julian Flake" "Georg P. Krog"],
   :dcterms/description
   "An organisation and its subordinate bodies governed by public international law, or any other body which is set up by, or on the basis of, an agreement between two or more countries",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_26/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "International Organisation",
   :rdfs/subClassOf [:dpvo/Organisation
                     :dpvo/InternationalOrganisation
                     :dpvo/Entity
                     :dpvo/LegalEntity],
   :vs/term_status "modified"})

(def IntrusionDetectionSystem
  "Use of measures to detect intrusions and other unauthorised attempts to gain access to a system"
  {:db/ident :dpvo/IntrusionDetectionSystem,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Use of measures to detect intrusions and other unauthorised attempts to gain access to a system",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Intrusion Detection System",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/IntrusionDetectionSystem
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def JobApplicant
  "Data subjects that apply for jobs or employments"
  {:db/ident            :dpvo/JobApplicant,
   :dcterms/created     #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     ["Beatriz Esteves"
                         "Paul Ryan"
                         "Julian Flake"
                         "Harshvardhan J. Pandit"
                         "Georg P. Krog"],
   :dcterms/description "Data subjects that apply for jobs or employments",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Job Applicant",
   :rdfs/subClassOf     [:dpvo/Applicant
                         :dpvo/JobApplicant
                         :dpvo/DataSubject
                         :dpvo/Entity
                         :dpvo/NaturalPerson
                         :dpvo/LegalEntity],
   :vs/term_status      "accepted"})

(def JointDataControllers
  "A group of Data Controllers that jointly determine the purposes and means of processing"
  {:db/ident :dpvo/JointDataControllers,
   :dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator ["Georg Krog" "Harshvardhan Pandit"],
   :dcterms/description
   "A group of Data Controllers that jointly determine the purposes and means of processing",
   :rdf/type :owl/Class,
   :rdfs/comment "To indicate the membership, hasDataController may be used",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Joint Data Controllers",
   :rdfs/subClassOf [:dpvo/DataController
                     :dpvo/JointDataControllers
                     :dpvo/Entity
                     :dpvo/LegalEntity],
   :vs/term_status "accepted"})

(def JointDataControllersAgreement
  "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between Controllers within a Joint Controllers relationship"
  {:db/ident :dpvo/JointDataControllersAgreement,
   :dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog"
                     "Beatriz Esteves"
                     "Paul Ryan"
                     "Harshvardhan J. Pandit"
                     "Julian Flake"],
   :dcterms/description
   "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between Controllers within a Joint Controllers relationship",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Joint Data Controllers Agreement",
   :rdfs/subClassOf [:dpvo/DataProcessingAgreement
                     :dpvo/JointDataControllersAgreement
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/LegalAgreement],
   :vs/term_status "accepted"})

(def Justification
  "A form of documentation providing reaosns, explanations, or justifications"
  {:db/ident :dpvo/Justification,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A form of documentation providing reaosns, explanations, or justifications",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Justification",
   :rdfs/subClassOf [:dpvo/Context :dpvo/Justification],
   :vs/term_status "accepted"})

(def LargeDataVolume
  "Data volume that is considered large within the context"
  {:db/ident :dpvo/LargeDataVolume,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Data volume that is considered large within the context",
   :rdf/type [:dpvo/DataVolume
              :owl/NamedIndividual
              :dpvo/Scale
              :dpvo/ProcessingContext
              :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Large Data Volume",
   :vs/term_status "accepted"})

(def LargeScaleOfDataSubjects
  "Scale of data subjects considered large within the context"
  {:db/ident :dpvo/LargeScaleOfDataSubjects,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Scale of data subjects considered large within the context",
   :rdf/type [:dpvo/DataSubjectScale
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/Scale
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Large Scale Of Data Subjects",
   :vs/term_status "accepted"})

(def LargeScaleProcessing
  "Processing that takes place at large scales (as specified by some criteria)"
  {:db/ident :dpvo/LargeScaleProcessing,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Piero Bonatti"],
   :dcterms/description
   "Processing that takes place at large scales (as specified by some criteria)",
   :dcterms/modified #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type [:owl/NamedIndividual
              :dpvo/ProcessingScale
              :dpvo/Context
              :dpvo/ProcessingContext
              :dpvo/Scale],
   :rdfs/comment
   "The exact definition of what constitutes \"large scale\" depends on use of jurisdictional, domain-specific, or other forms of externally defined criterias. Where possible, this should be reflected by extending this term with the appropriate context.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Large Scale Processing",
   :vs/term_status "modified"})

(def Law
  "A law is a set of rules created by government or authorities"
  {:db/ident :dpvo/Law,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A law is a set of rules created by government or authorities",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Law",
   :vs/term_status "accepted"})

(def Lawful
  "State of being lawful or legally compliant"
  {:db/ident            :dpvo/Lawful,
   :dcterms/created     #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "State of being lawful or legally compliant",
   :rdf/type            [:owl/NamedIndividual
                         :dpvo/Lawfulness
                         :dpvo/ComplianceStatus
                         :dpvo/Status
                         :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Lawful",
   :vs/term_status      "accepted"})

(def Lawfulness
  "Status associated with expressing lawfullness or legal compliance"
  {:db/ident :dpvo/Lawfulness,
   :dcterms/created #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Status associated with expressing lawfullness or legal compliance",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Lawfulness",
   :rdfs/subClassOf
   [:dpvo/ComplianceStatus :dpvo/Lawfulness :dpvo/Context :dpvo/Status],
   :vs/term_status "accepted"})

(def LawfulnessUnkown
  "State of the lawfulness not being known"
  {:db/ident            :dpvo/LawfulnessUnkown,
   :dcterms/created     #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "State of the lawfulness not being known",
   :rdf/type            [:owl/NamedIndividual
                         :dpvo/Lawfulness
                         :dpvo/ComplianceStatus
                         :dpvo/Status
                         :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Lawfulness Unknown",
   :vs/term_status      "accepted"})

(def LegalAgreement
  "A legally binding agreement"
  {:db/ident            :dpvo/LegalAgreement,
   :dcterms/created     #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator     ["Rob Brennan"
                         "Mark Lizar"
                         "Axel Polleres"
                         "Harshvardhan J. Pandit"],
   :dcterms/description "A legally binding agreement",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Legal Agreement",
   :rdfs/subClassOf     [:dpvo/OrganisationalMeasure
                         :dpvo/LegalAgreement
                         :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status      "accepted"})

(def LegalBasis
  "The Legal basis used to justify processing of personal data"
  {:db/ident :dpvo/LegalBasis,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres" "Javier Fernández"],
   :dcterms/description
   "The Legal basis used to justify processing of personal data",
   :dcterms/modified #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Legal basis (plural: legal bases) are defined by legislations and regulations, whose applicability is usually restricted to specific jurisdictions.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Legal Basis",
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status "accepted"})

(def LegalCompliance
  "Purposes associated with carrying out data processing to fulfill a legal or statutory obligation"
  {:db/ident :dpvo/LegalCompliance,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Beatriz Esteves" "Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Purposes associated with carrying out data processing to fulfill a legal or statutory obligation",
   :dcterms/modified #inst "2022-11-09T00:00:00.000-05:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   "This purpose only refers to processing that is additionally required in order to fulfill the obligations and requirements associated with a law. For example, the use of consent would have its own separate purposes, with this purpose addressing a legal requirement for maintaining consent record (along with RecordManagement). This purpose will typically be used with Legal Obligation as the legal basis.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Legal Compliance",
   :rdfs/subClassOf
   [:dpvo/FulfilmentOfObligation :dpvo/LegalCompliance :dpvo/Purpose],
   :vs/term_status "accepted"})

(def LegalEntity
  "A human or non-human 'thing' that constitutes as an entity and which is recognised and defined in law"
  {:db/ident :dpvo/LegalEntity,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A human or non-human 'thing' that constitutes as an entity and which is recognised and defined in law",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Legal Entity",
   :rdfs/subClassOf [:dpvo/Entity :dpvo/LegalEntity],
   :vs/term_status "accepted"})

(def LegalObligation
  "Legal Obligation to conduct the specified processing"
  {:db/ident            :dpvo/LegalObligation,
   :dcterms/created     #inst "2021-04-07T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Legal Obligation to conduct the specified processing",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Legal Obligation",
   :rdfs/subClassOf     [:dpvo/LegalBasis :dpvo/LegalObligation],
   :vs/term_status      "accepted"})

(def LegitimateInterest
  "Legitimate Interests of a Party as justification for specified processing"
  {:db/ident :dpvo/LegitimateInterest,
   :dcterms/created #inst "2021-05-19T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Legitimate Interests of a Party as justification for specified processing",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Legitimate Interest",
   :rdfs/subClassOf [:dpvo/LegalBasis :dpvo/LegitimateInterest],
   :vs/term_status "accepted"})

(def LegitimateInterestAssessment
  "Indicates an assessment regarding the use of legitimate interest as a lawful basis by the data controller"
  {:db/ident :dpvo/LegitimateInterestAssessment,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   "Indicates an assessment regarding the use of legitimate interest as a lawful basis by the data controller",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Legitimate Interest Assessment",
   :rdfs/subClassOf [:dpvo/Assessment
                     :dpvo/LegitimateInterestAssessment
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def LegitimateInterestOfController
  "Legitimate Interests of a Data Controller in conducting specified processing"
  {:db/ident :dpvo/LegitimateInterestOfController,
   :dcterms/created #inst "2021-05-19T00:00:00.000-04:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   "Legitimate Interests of a Data Controller in conducting specified processing",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Legitimate Interest of Controller",
   :rdfs/subClassOf [:dpvo/LegitimateInterest
                     :dpvo/LegitimateInterestOfController
                     :dpvo/LegalBasis],
   :vs/term_status "accepted"})

(def LegitimateInterestOfDataSubject
  "Legitimate Interests of the Data Subject in conducting specified processing"
  {:db/ident :dpvo/LegitimateInterestOfDataSubject,
   :dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   "Legitimate Interests of the Data Subject in conducting specified processing",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Legitimate Interest of Data Subject",
   :rdfs/subClassOf [:dpvo/LegitimateInterest
                     :dpvo/LegitimateInterestOfDataSubject
                     :dpvo/LegalBasis],
   :vs/term_status "accepted"})

(def LegitimateInterestOfThirdParty
  "Legitimate Interests of a Third Party in conducting specified processing"
  {:db/ident :dpvo/LegitimateInterestOfThirdParty,
   :dcterms/created #inst "2021-05-19T00:00:00.000-04:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   "Legitimate Interests of a Third Party in conducting specified processing",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Legitimate Interest of Third Party",
   :rdfs/subClassOf [:dpvo/LegitimateInterest
                     :dpvo/LegitimateInterestOfThirdParty
                     :dpvo/LegalBasis],
   :vs/term_status "accepted"})

(def Likelihood
  "The likelihood or probability or chance of something taking place or occuring"
  {:db/ident :dpvo/Likelihood,
   :dcterms/created #inst "2022-07-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The likelihood or probability or chance of something taking place or occuring",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Likelihood can be expressed in a subjective manner, such as 'Unlikely', or in a quantitative manner such as \"Twice in a Day\" (frequency per period). The suggestion is to use quantitative values, or to associate them with subjective terms used so as to enable accurate interpretations and interoperability. See the concepts related to Frequency and Duration for possible uses as a combination to express Likelihood.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Likelihood",
   :vs/term_status "accepted"})

(def LocalEnvironmentScale
  "Geographic coverage spanning a specific environment within the locality"
  {:db/ident :dpvo/LocalEnvironmentScale,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Geographic coverage spanning a specific environment within the locality",
   :rdf/type [:owl/NamedIndividual
              :dpvo/GeographicCoverage
              :dpvo/Scale
              :dpvo/ProcessingContext
              :dpvo/Context],
   :rdfs/comment
   "For example, geographic scale of an event take place in a specific building or room",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Local Environment Scale",
   :vs/term_status "accepted"})

(def LocalLocation
  "Location is local"
  {:db/ident            :dpvo/LocalLocation,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Location is local",
   :dcterms/modified    #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Local Location",
   :rdfs/subClassOf     [:dpvo/LocationLocality
                         :dpvo/LocalLocation
                         :dpvo/Location],
   :vs/term_status      "modified"})

(def LocalityScale
  "Geographic coverage spanning a specific locality"
  {:db/ident :dpvo/LocalityScale,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Geographic coverage spanning a specific locality",
   :rdf/type [:dpvo/GeographicCoverage
              :owl/NamedIndividual
              :dpvo/Scale
              :dpvo/ProcessingContext
              :dpvo/Context],
   :rdfs/comment
   "For example, geographic scale of a city or an area within a city",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Locality Scale",
   :vs/term_status "accepted"})

(def Location
  "A location is a position, site, or area where something is located"
  {:db/ident :dpvo/Location,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   "A location is a position, site, or area where something is located",
   :rdf/type :owl/Class,
   :rdfs/comment "Location may be geographic, physical, or virtual.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Location",
   :rdfs/subClassOf :dpvo/Location,
   :vs/term_status "accepted"})

(def LocationFixture
  "The fixture of location refers to whether the location is fixed"
  {:db/ident :dpvo/LocationFixture,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The fixture of location refers to whether the location is fixed",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Location Fixture",
   :rdfs/subClassOf :dpvo/LocationFixture,
   :vs/term_status "accepted"})

(def LocationLocality
  "Locality refers to whether the specified location is local within some context, e.g. for the user"
  {:db/ident :dpvo/LocationLocality,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Locality refers to whether the specified location is local within some context, e.g. for the user",
   :dcterms/modified #inst "2022-10-04T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Location Locality",
   :rdfs/subClassOf [:dpvo/Location :dpvo/LocationLocality],
   :vs/term_status "modified"})

(def LoggingPolicies
  "Policy for logging of information"
  {:db/ident :dpvo/LoggingPolicies,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Policy for logging of information",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Logging Policies",
   :rdfs/subClassOf [:dpvo/GovernanceProcedures
                     :dpvo/LoggingPolicies
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def MaintainCreditCheckingDatabase
  "Purposes associated with maintaining a Credit Checking Database"
  {:db/ident :dpvo/MaintainCreditCheckingDatabase,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Purposes associated with maintaining a Credit Checking Database",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Maintain Credit Checking Database",
   :rdfs/subClassOf [:dpvo/CreditChecking
                     :dpvo/MaintainCreditCheckingDatabase
                     :dpvo/CustomerSolvencyMonitoring
                     :dpvo/CustomerManagement
                     :dpvo/Purpose],
   :vs/term_status "accepted"})

(def MaintainCreditRatingDatabase
  "Purposes associated with maintaining a Credit Rating Database"
  {:db/ident :dpvo/MaintainCreditRatingDatabase,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Purposes associated with maintaining a Credit Rating Database",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Maintain Credit Rating Database",
   :rdfs/subClassOf [:dpvo/CreditChecking
                     :dpvo/MaintainCreditRatingDatabase
                     :dpvo/CustomerSolvencyMonitoring
                     :dpvo/CustomerManagement
                     :dpvo/Purpose],
   :vs/term_status "accepted"})

(def MaintainFraudDatabase
  "Purposes associated with maintaining a database related to identifying and identified fraud risks and fraud incidents"
  {:db/ident :dpvo/MaintainFraudDatabase,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   "Purposes associated with maintaining a database related to identifying and identified fraud risks and fraud incidents",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "MaintainFraudDatabase",
   :rdfs/subClassOf [:dpvo/FraudPreventionAndDetection
                     :dpvo/MaintainFraudDatabase
                     :dpvo/Purpose
                     :dpvo/EnforceSecurity],
   :vs/term_status "accepted"})

(def MakeAvailable
  "to transform or publish data to be used"
  {:db/ident :dpvo/MakeAvailable,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description "to transform or publish data to be used",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Make Available",
   :rdfs/subClassOf [:dpvo/Disclose :dpvo/MakeAvailable :dpvo/Processing],
   :vs/term_status "accepted"})

(def Marketing
  "Purposes associated with conducting marketing in relation to organisation or products or services e.g. promoting, selling, and distributing"
  {:db/ident :dpvo/Marketing,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Beatriz Esteves" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Purposes associated with conducting marketing in relation to organisation or products or services e.g. promoting, selling, and distributing",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Was commercial interest, changed to consider Marketing a separate Purpose category by itself",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Marketing",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/Marketing],
   :vs/term_status "accepted"})

(def Match
  "to combine, compare, or match data from different sources"
  {:db/ident :dpvo/Match,
   :dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "to combine, compare, or match data from different sources",
   :dcterms/source "https://ec.europa.eu/newsroom/article29/items/611236",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Match",
   :rdfs/subClassOf [:dpvo/Use :dpvo/Match :dpvo/Processing],
   :vs/term_status "accepted"})

(def MaterialDamage
  "Impact that acts as or causes material damages"
  {:db/ident            :dpvo/MaterialDamage,
   :dcterms/created     #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Impact that acts as or causes material damages",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Material Damage",
   :rdfs/subClassOf     [:dpvo/Damage
                         :dpvo/MaterialDamage
                         :dpvo/Consequence
                         :dpvo/Impact],
   :vs/term_status      "accepted"})

(def MediumDataVolume
  "Data volume that is considered medium i.e. neither large nor small within the context"
  {:db/ident :dpvo/MediumDataVolume,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog" "Paul Ryan"],
   :dcterms/description
   "Data volume that is considered medium i.e. neither large nor small within the context",
   :rdf/type [:dpvo/DataVolume
              :owl/NamedIndividual
              :dpvo/Scale
              :dpvo/ProcessingContext
              :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Medium Data Volume",
   :vs/term_status "accepted"})

(def MediumScaleOfDataSubjects
  "Scale of data subjects considered medium i.e. neither large nor small within the context"
  {:db/ident :dpvo/MediumScaleOfDataSubjects,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog" "Paul Ryan"],
   :dcterms/description
   "Scale of data subjects considered medium i.e. neither large nor small within the context",
   :rdf/type [:dpvo/DataSubjectScale
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/Scale
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Medium Scale Of Data Subjects",
   :vs/term_status "accepted"})

(def MediumScaleProcessing
  "Processing that takes place at medium scales (as specified by some criteria)"
  {:db/ident :dpvo/MediumScaleProcessing,
   :dcterms/created #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Processing that takes place at medium scales (as specified by some criteria)",
   :rdf/type [:dpvo/ProcessingScale
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/ProcessingContext
              :dpvo/Scale],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Medium Scale Processing",
   :vs/term_status "accepted"})

(def Member
  "Data subjects that are members of a group, organisation, or other collectives"
  {:db/ident :dpvo/Member,
   :dcterms/created #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator ["Julian Flake"
                     "Paul Ryan"
                     "Harshvardhan J. Pandit"
                     "Georg P. Krog"
                     "Beatriz Esteves"],
   :dcterms/description
   "Data subjects that are members of a group, organisation, or other collectives",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Member",
   :rdfs/subClassOf [:dpvo/DataSubject
                     :dpvo/Member
                     :dpvo/Entity
                     :dpvo/NaturalPerson
                     :dpvo/LegalEntity],
   :vs/term_status "accepted"})

(def MemberPartnerManagement
  "Purposes associated with maintaining a registry of shareholders, members, or partners for governance, administration, and management functions"
  {:db/ident :dpvo/MemberPartnerManagement,
   :dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan" "David Hickey"],
   :dcterms/description
   "Purposes associated with maintaining a registry of shareholders, members, or partners for governance, administration, and management functions",
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Members and Partners Management",
   :rdfs/subClassOf
   [:dpvo/OrganisationGovernance :dpvo/MemberPartnerManagement :dpvo/Purpose],
   :vs/term_status "accepted"})

(def MentallyVulnerableDataSubject
  "Data subjects that are considered mentally vulnerable"
  {:db/ident            :dpvo/MentallyVulnerableDataSubject,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description "Data subjects that are considered mentally vulnerable",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Mentally Vulnerable Data Subject",
   :rdfs/subClassOf     [:dpvo/VulnerableDataSubject
                         :dpvo/MentallyVulnerableDataSubject
                         :dpvo/DataSubject
                         :dpvo/Entity
                         :dpvo/NaturalPerson
                         :dpvo/LegalEntity],
   :vs/term_status      "accepted"})

(def MessageAuthenticationCodes
  "Use of cryptographic methods to authenticate messages"
  {:db/ident :dpvo/MessageAuthenticationCodes,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Use of cryptographic methods to authenticate messages",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Message Authentication Codes (MAC)",
   :rdfs/subClassOf [:dpvo/CryptographicAuthentication
                     :dpvo/MessageAuthenticationCodes
                     :dpvo/AuthenticationProtocols
                     :dpvo/CryptographicMethods
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def MobilePlatformSecurity
  "Security implemented over a mobile platform"
  {:db/ident :dpvo/MobilePlatformSecurity,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Security implemented over a mobile platform",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Mobile Platform Security",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/MobilePlatformSecurity
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def Modify
  "to modify or change data"
  {:db/ident            :dpvo/Modify,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description "to modify or change data",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Modify",
   :rdfs/subClassOf     [:dpvo/Alter
                         :dpvo/Modify
                         :dpvo/Processing
                         :dpvo/Transform],
   :vs/term_status      "accepted"})

(def Monitor
  "to monitor data for some criteria"
  {:db/ident            :dpvo/Monitor,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description "to monitor data for some criteria",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Monitor",
   :rdfs/subClassOf     [:dpvo/Consult
                         :dpvo/Monitor
                         :dpvo/Processing
                         :dpvo/Use],
   :vs/term_status      "accepted"})

(def MonitoringPolicies
  "Policy for monitoring (e.g. progress, performance)"
  {:db/ident :dpvo/MonitoringPolicies,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Policy for monitoring (e.g. progress, performance)",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Monitoring Policies",
   :rdfs/subClassOf [:dpvo/GovernanceProcedures
                     :dpvo/MonitoringPolicies
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def MonotonicCounterPseudonymisation
  "A simple pseudonymisation method where identifiers are substituted by a number chosen by a monotonic counter"
  {:db/ident :dpvo/MonotonicCounterPseudonymisation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A simple pseudonymisation method where identifiers are substituted by a number chosen by a monotonic counter",
   :dcterms/modified #inst "2022-10-13T00:00:00.000-04:00",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Monotonic Counter Pseudonymisation",
   :rdfs/subClassOf [:dpvo/Pseudonymisation
                     :dpvo/MonotonicCounterPseudonymisation
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure
                     :dpvo/DataSanitisationTechnique
                     :dpvo/Deidentification],
   :vs/term_status "modified"})

(def Move
  "to move data from one location to another including deleting the original copy"
  {:db/ident :dpvo/Move,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   "to move data from one location to another including deleting the original copy",
   :dcterms/source "https://specialprivacy.ercim.eu/vocabs/processing",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Move",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/processing#Move"],
   :rdfs/subClassOf [:dpvo/Transfer :dpvo/Move :dpvo/Processing],
   :vs/term_status "accepted"})

(def MultiFactorAuthentication
  "An authentication system that uses two or more methods to authenticate"
  {:db/ident :dpvo/MultiFactorAuthentication,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "An authentication system that uses two or more methods to authenticate",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Multi-Factor Authentication (MFA)",
   :rdfs/subClassOf [:dpvo/AuthenticationProtocols
                     :dpvo/MultiFactorAuthentication
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def MultiNationalScale
  "Geographic coverage spanning multiple nations"
  {:db/ident            :dpvo/MultiNationalScale,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Geographic coverage spanning multiple nations",
   :rdf/type            [:dpvo/GeographicCoverage
                         :owl/NamedIndividual
                         :dpvo/Scale
                         :dpvo/ProcessingContext
                         :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Multi National Scale",
   :vs/term_status      "accepted"})

(def NDA
  "Non-disclosure Agreements e.g. preserving confidentiality of information"
  {:db/ident :dpvo/NDA,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Rob Brennan" "Axel Polleres" "Mark Lizar"],
   :dcterms/description
   "Non-disclosure Agreements e.g. preserving confidentiality of information",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Non-Disclosure Agreement (NDA)",
   :rdfs/subClassOf [:dpvo/LegalAgreement
                     :dpvo/NDA
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def NationalAuthority
  "An authority tasked with overseeing legal compliance for a nation"
  {:db/ident :dpvo/NationalAuthority,
   :dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "An authority tasked with overseeing legal compliance for a nation",
   :dcterms/source "http://purl.org/adms",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "National Authority",
   :rdfs/subClassOf [:dpvo/Authority
                     :dpvo/NationalAuthority
                     :dpvo/GovernmentalOrganisation
                     :dpvo/Organisation
                     :dpvo/Entity
                     :dpvo/LegalEntity],
   :vs/term_status "accepted"})

(def NationalScale
  "Geographic coverage spanning a nation"
  {:db/ident            :dpvo/NationalScale,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Geographic coverage spanning a nation",
   :rdf/type            [:owl/NamedIndividual
                         :dpvo/GeographicCoverage
                         :dpvo/Scale
                         :dpvo/ProcessingContext
                         :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "National Scale",
   :vs/term_status      "accepted"})

(def NaturalPerson
  "A human"
  {:db/ident            :dpvo/NaturalPerson,
   :dcterms/created     #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "A human",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Natural Person",
   :rdfs/subClassOf     [:dpvo/Entity :dpvo/NaturalPerson],
   :vs/term_status      "accepted"})

(def NearlyGlobalScale
  "Geographic coverage nearly spanning the entire globe"
  {:db/ident            :dpvo/NearlyGlobalScale,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Geographic coverage nearly spanning the entire globe",
   :rdf/type            [:owl/NamedIndividual
                         :dpvo/GeographicCoverage
                         :dpvo/Scale
                         :dpvo/ProcessingContext
                         :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Nearly Global Scale",
   :vs/term_status      "accepted"})

(def Necessity
  "An indication of 'necessity' within a context"
  {:db/ident :dpvo/Necessity,
   :dcterms/created #inst "2022-02-12T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog"
                     "Beatriz Esteves"
                     "Harshvardhan J. Pandit"
                     "Julian Flake"
                     "Paul Ryan"],
   :dcterms/description "An indication of 'necessity' within a context",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Necessity can be used to express need, essentiality, requirement, or compulsion.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Necessity",
   :rdfs/subClassOf [:dpvo/Context :dpvo/Necessity],
   :vs/term_status "accepted"})

(def NetworkProxyRouting
  "Use of network routing using proxy"
  {:db/ident :dpvo/NetworkProxyRouting,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Use of network routing using proxy",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Network Proxy Routing",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/NetworkProxyRouting
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def NetworkSecurityProtocols
  "Security implemented at or over networks protocols"
  {:db/ident :dpvo/NetworkSecurityProtocols,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Security implemented at or over networks protocols",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Network Security Protocols",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/NetworkSecurityProtocols
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def NonCitizen
  "Data subjects that are not citizens (for a jurisdiction)"
  {:db/ident :dpvo/NonCitizen,
   :dcterms/created #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator ["Beatriz Esteves"
                     "Harshvardhan J. Pandit"
                     "Paul Ryan"
                     "Julian Flake"
                     "Georg P. Krog"],
   :dcterms/description
   "Data subjects that are not citizens (for a jurisdiction)",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Non-Citizen",
   :rdfs/subClassOf [:dpvo/DataSubject
                     :dpvo/NonCitizen
                     :dpvo/Entity
                     :dpvo/NaturalPerson
                     :dpvo/LegalEntity],
   :vs/term_status "accepted"})

(def NonCommercialResearch
  "Purposes associated with conducting research in a non-commercial setting e.g. for a non-profit-organisation (NGO)"
  {:db/ident :dpvo/NonCommercialResearch,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit"
                     "Simon Steyskal"
                     "Elmar Kiesling"
                     "Fajar Ekaputra"
                     "Javier Fernandez"
                     "Axel Polleres"],
   :dcterms/description
   "Purposes associated with conducting research in a non-commercial setting e.g. for a non-profit-organisation (NGO)",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Non-Commercial Research",
   :rdfs/subClassOf
   [:dpvo/ResearchAndDevelopment :dpvo/NonCommercialResearch :dpvo/Purpose],
   :vs/term_status "accepted"})

(def NonCompliant
  "State of non-compliance where objectives have not been met, but have not been violated"
  {:db/ident :dpvo/NonCompliant,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "State of non-compliance where objectives have not been met, but have not been violated",
   :dcterms/modified #inst "2022-09-07T00:00:00.000-04:00",
   :rdf/type
   [:dpvo/ComplianceStatus :owl/NamedIndividual :dpvo/Status :dpvo/Context],
   :rdfs/comment
   "Changed from not compliant for consistency in commonly used terms",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Non Compliant",
   :vs/term_status "changed"})

(def NonConformant
  "State of being non-conformant"
  {:db/ident            :dpvo/NonConformant,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "State of being non-conformant",
   :rdf/type            [:dpvo/ConformanceStatus
                         :owl/NamedIndividual
                         :dpvo/Status
                         :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "NonConformant",
   :vs/term_status      "accepted"})

(def NonGovernmentalOrganisation
  "An organisation not part of or independent from the government"
  {:db/ident :dpvo/NonGovernmentalOrganisation,
   :dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "An organisation not part of or independent from the government",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :dcterms/source "http://purl.org/adms",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Non-Governmental Organisation",
   :rdfs/subClassOf [:dpvo/Organisation
                     :dpvo/NonGovernmentalOrganisation
                     :dpvo/Entity
                     :dpvo/LegalEntity],
   :vs/term_status "modified"})

(def NonMaterialDamage
  "Impact that acts as or causes non-material damages"
  {:db/ident            :dpvo/NonMaterialDamage,
   :dcterms/created     #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Impact that acts as or causes non-material damages",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Non-Material Damage",
   :rdfs/subClassOf     [:dpvo/Damage
                         :dpvo/NonMaterialDamage
                         :dpvo/Consequence
                         :dpvo/Impact],
   :vs/term_status      "accepted"})

(def NonPersonalData
  "Data that is not Personal Data"
  {:db/ident :dpvo/NonPersonalData,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Data that is not Personal Data",
   :rdf/type :owl/Class,
   :rdfs/comment
   "The term NonPersonalData is provided to distinguish between PersonalData and other data, e.g. for indicating which data is regulated by privacy laws. To specify personal data that has been anonymised, the concept AnonymisedData should be used.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Non-Personal Data",
   :rdfs/subClassOf [:dpvo/Data :dpvo/NonPersonalData],
   :vs/term_status "accepted"})

(def NonProfitOrganisation
  "An organisation that does not aim to achieve profit as its primary goal"
  {:db/ident :dpvo/NonProfitOrganisation,
   :dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "An organisation that does not aim to achieve profit as its primary goal",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :dcterms/source "http://purl.org/adms",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Non-Profit Organisation",
   :rdfs/subClassOf [:dpvo/Organisation
                     :dpvo/NonProfitOrganisation
                     :dpvo/Entity
                     :dpvo/LegalEntity],
   :vs/term_status "modified"})

(def NonPublicDataSource
  "A source of data that is not publicly accessible or available"
  {:db/ident :dpvo/NonPublicDataSource,
   :dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator ["Julian Flake"
                     "Paul Ryan"
                     "Harshvardhan J. Pandit"
                     "Georg P Krog"
                     "Beatriz Esteves"],
   :dcterms/description
   "A source of data that is not publicly accessible or available",
   :rdf/type [:dpvo/DataSource
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Non-Public Data Source",
   :vs/term_status "accepted"})

(def NotRequired
  "Indication of neither being required nor optional i.e. not relevant or needed"
  {:db/ident :dpvo/NotRequired,
   :dcterms/created #inst "2022-02-15T00:00:00.000-05:00",
   :dcterms/creator ["Beatriz Esteves"
                     "Paul Ryan"
                     "Georg P Krog"
                     "Harshvardhan J. Pandit"
                     "Julian Flake"],
   :dcterms/description
   "Indication of neither being required nor optional i.e. not relevant or needed",
   :rdf/type [:owl/NamedIndividual :dpvo/Necessity :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Not Required",
   :vs/term_status "accepted"})

(def Notice
  "A notice is an artefact for providing information, choices, or controls"
  {:db/ident :dpvo/Notice,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Georg P Krog" "David Hickey" "Paul Ryan"],
   :dcterms/description
   "A notice is an artefact for providing information, choices, or controls",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Notice",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/Notice
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def Obligation
  "A rule describing an obligation for performing an activity"
  {:db/ident :dpvo/Obligation,
   :dcterms/created #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Harshvardhan J. Pandit" "Beatriz Esteves"],
   :dcterms/description
   "A rule describing an obligation for performing an activity",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Obligation",
   :rdfs/subClassOf [:dpvo/Rule :dpvo/Obligation],
   :vs/term_status "accepted"})

(def Observe
  "to obtain data through observation"
  {:db/ident            :dpvo/Observe,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description "to obtain data through observation",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Observe",
   :rdfs/subClassOf     [:dpvo/Obtain :dpvo/Observe :dpvo/Processing],
   :vs/term_status      "accepted"})

(def ObservedPersonalData
  "Personal Data that has been collected through observation of the Data Subject(s)"
  {:db/ident :dpvo/ObservedPersonalData,
   :dcterms/created #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   "Personal Data that has been collected through observation of the Data Subject(s)",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Observed Personal Data",
   :rdfs/subClassOf [:dpvo/CollectedPersonalData
                     :dpvo/ObservedPersonalData
                     :dpvo/Data
                     :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def Obtain
  "to solicit or gather data from someone"
  {:db/ident :dpvo/Obtain,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description "to solicit or gather data from someone",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Obtain",
   :rdfs/subClassOf [:dpvo/Processing :dpvo/Obtain],
   :vs/term_status "accepted"})

(def OfficialAuthorityOfController
  "Processing necessary or authorised through the official authority granted to or vested in the Data Controller"
  {:db/ident :dpvo/OfficialAuthorityOfController,
   :dcterms/created #inst "2021-05-05T00:00:00.000-04:00",
   :dcterms/creator ["Paul Ryan" "Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Processing necessary or authorised through the official authority granted to or vested in the Data Controller",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Official Authority of Controller",
   :rdfs/subClassOf [:dpvo/LegalBasis :dpvo/OfficialAuthorityOfController],
   :vs/term_status "accepted"})

(def OftenFrequency
  "Frequency where occurences are often or frequent, but not continous"
  {:db/ident :dpvo/OftenFrequency,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Frequency where occurences are often or frequent, but not continous",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Often Frequency",
   :rdfs/subClassOf [:dpvo/Frequency :dpvo/OftenFrequency :dpvo/Context],
   :vs/term_status "modified"})

(def OperatingSystemSecurity
  "Security implemented at or through operating systems"
  {:db/ident :dpvo/OperatingSystemSecurity,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Security implemented at or through operating systems",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Operating System Security",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/OperatingSystemSecurity
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def OptimisationForConsumer
  "Purposes associated with optimisation of activities and services for consumer or user"
  {:db/ident :dpvo/OptimisationForConsumer,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra"
                     "Elmar Kiesling"
                     "Harshvardhan J. Pandit"
                     "Javier Fernandez"
                     "Axel Polleres"
                     "Simon Steyskal"],
   :dcterms/description
   "Purposes associated with optimisation of activities and services for consumer or user",
   :rdf/type :owl/Class,
   :rdfs/comment
   "The term optmisation here refers to the efficiency of the service in terms of technical provision (or similar means) with benefits for everybody. Personalisation implies making changes that benefit the current user or persona.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Optimisation for Consumer",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/purposes#Custom"],
   :rdfs/subClassOf [:dpvo/ServiceOptimisation
                     :dpvo/OptimisationForConsumer
                     :dpvo/Purpose
                     :dpvo/ServiceProvision],
   :vs/term_status "accepted"})

(def OptimisationForController
  "Purposes associated with optimisation of activities and services for provider or controller"
  {:db/ident :dpvo/OptimisationForController,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra"
                     "Axel Polleres"
                     "Javier Fernandez"
                     "Elmar Kiesling"
                     "Simon Steyskal"
                     "Harshvardhan J. Pandit"],
   :dcterms/description
   "Purposes associated with optimisation of activities and services for provider or controller",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Optimisation for Controller",
   :rdfs/subClassOf [:dpvo/ServiceOptimisation
                     :dpvo/OptimisationForController
                     :dpvo/Purpose
                     :dpvo/ServiceProvision],
   :vs/term_status "accepted"})

(def OptimiseUserInterface
  "Purposes associated with optimisation of interfaces presented to the user"
  {:db/ident :dpvo/OptimiseUserInterface,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit"
                     "Simon Steyskal"
                     "Elmar Kiesling"
                     "Axel Polleres"
                     "Fajar Ekaputra"
                     "Javier Fernandez"],
   :dcterms/description
   "Purposes associated with optimisation of interfaces presented to the user",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Optimise User Interface",
   :rdfs/subClassOf [:dpvo/OptimisationForConsumer
                     :dpvo/OptimiseUserInterface
                     :dpvo/Purpose
                     :dpvo/ServiceProvision
                     :dpvo/ServiceOptimisation],
   :vs/term_status "accepted"})

(def Optional
  "Indication of 'optional' or 'voluntary'"
  {:db/ident            :dpvo/Optional,
   :dcterms/created     #inst "2022-02-14T00:00:00.000-05:00",
   :dcterms/creator     ["Julian Flake"
                         "Beatriz Esteves"
                         "Paul Ryan"
                         "Harshvardhan J. Pandit"
                         "Georg P Krog"],
   :dcterms/description "Indication of 'optional' or 'voluntary'",
   :rdf/type            [:dpvo/Necessity :owl/NamedIndividual :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Optional",
   :vs/term_status      "accepted"})

(def Organisation
  "A general term reflecting a company or a business or a group acting as a unit"
  {:db/ident :dpvo/Organisation,
   :dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A general term reflecting a company or a business or a group acting as a unit",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Organisation",
   :rdfs/subClassOf [:dpvo/LegalEntity :dpvo/Organisation :dpvo/Entity],
   :vs/term_status "accepted"})

(def OrganisationComplianceManagement
  "Purposes associated with managing compliance for organisation in relation to internal policies"
  {:db/ident :dpvo/OrganisationComplianceManagement,
   :dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Georg P Krog" "Paul Ryan" "David Hickey"],
   :dcterms/description
   "Purposes associated with managing compliance for organisation in relation to internal policies",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Note that this concept relates to internal organisational compliance. The concept LegalCompliance should be used for external legal or regulatory compliance.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Organisation Compliance Management",
   :rdfs/subClassOf [:dpvo/OrganisationGovernance
                     :dpvo/OrganisationComplianceManagement
                     :dpvo/Purpose],
   :vs/term_status "accepted"})

(def OrganisationGovernance
  "Purposes associated with conducting activities and functions for governance of an organisation"
  {:db/ident :dpvo/OrganisationGovernance,
   :dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Paul Ryan" "Harshvardhan J. Pandit" "David Hickey"],
   :dcterms/description
   "Purposes associated with conducting activities and functions for governance of an organisation",
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Organisation Governance",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/OrganisationGovernance],
   :vs/term_status "accepted"})

(def OrganisationRiskManagement
  "Purposes associated with managing risk for organisation's activities"
  {:db/ident :dpvo/OrganisationRiskManagement,
   :dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "David Hickey" "Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Purposes associated with managing risk for organisation's activities",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Organisation Risk Management",
   :rdfs/subClassOf [:dpvo/OrganisationGovernance
                     :dpvo/OrganisationRiskManagement
                     :dpvo/Purpose],
   :vs/term_status "accepted"})

(def OrganisationalMeasure
  "Organisational measures required/followed when processing data of the declared category"
  {:db/ident :dpvo/OrganisationalMeasure,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Mark Lizar" "Axel Polleres" "Rob Brennan" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Organisational measures required/followed when processing data of the declared category",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Organisational Measure",
   :rdfs/subClassOf [:dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status "accepted"})

(def OrganisationalUnit
  "Entity within an organisation that does not constitute as a separate legal entity"
  {:db/ident :dpvo/OrganisationalUnit,
   :dcterms/created #inst "2022-03-23T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description
   "Entity within an organisation that does not constitute as a separate legal entity",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Organisational Unit",
   :rdfs/subClassOf [:dpvo/Entity :dpvo/OrganisationalUnit],
   :vs/term_status "accepted"})

(def Organise
  "to organize data for arranging or classifying"
  {:db/ident :dpvo/Organise,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description "to organize data for arranging or classifying",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Organise",
   :rdfs/subClassOf [:dpvo/Processing :dpvo/Organise],
   :vs/term_status "accepted"})

(def PIA
  "Carrying out an impact assessment regarding privacy risks"
  {:db/ident :dpvo/PIA,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Carrying out an impact assessment regarding privacy risks",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Privacy Impact Assessment",
   :rdfs/subClassOf [:dpvo/ImpactAssessment
                     :dpvo/PIA
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/Assessment],
   :vs/term_status "accepted"})

(def ParentOfDataSubject
  "Parent(s) of data subjects such as children"
  {:db/ident            :dpvo/ParentOfDataSubject,
   :dcterms/created     #inst "2022-08-03T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description "Parent(s) of data subjects such as children",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Parent(s) of Data Subject",
   :rdfs/subClassOf     [:dpvo/DataSubject
                         :dpvo/ParentOfDataSubject
                         :dpvo/Entity
                         :dpvo/NaturalPerson
                         :dpvo/LegalEntity],
   :vs/term_status      "accepted"})

(def PartiallyAutomatedProcessing
  "Processing that is partially automated or semi-automated"
  {:db/ident :dpvo/PartiallyAutomatedProcessing,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Processing that is partially automated or semi-automated",
   :rdf/type [:dpvo/AutomationOfProcessing
              :owl/NamedIndividual
              :dpvo/ProcessingContext
              :dpvo/Context],
   :rdfs/comment
   "For example, a series of distinct processing operations that are automated individually or have some human involvement",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Partially Automated Processing",
   :vs/term_status "accepted"})

(def PartiallyCompliant
  "State of partially being compliant i.e. only some objectives have been met, and others have not been in violation"
  {:db/ident :dpvo/PartiallyCompliant,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "State of partially being compliant i.e. only some objectives have been met, and others have not been in violation",
   :rdf/type
   [:dpvo/ComplianceStatus :owl/NamedIndividual :dpvo/Status :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Partially Compliant",
   :vs/term_status "accepted"})

(def Participant
  "Data subjects that participate in some context such as volunteers in a function"
  {:db/ident :dpvo/Participant,
   :dcterms/created #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit"
                     "Julian Flake"
                     "Georg P. Krog"
                     "Beatriz Esteves"
                     "Paul Ryan"],
   :dcterms/description
   "Data subjects that participate in some context such as volunteers in a function",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Participant",
   :rdfs/subClassOf [:dpvo/DataSubject
                     :dpvo/Participant
                     :dpvo/Entity
                     :dpvo/NaturalPerson
                     :dpvo/LegalEntity],
   :vs/term_status "accepted"})

(def PassiveRight
  "The right(s) applicable, provided, or expected that are always (passively) applicable"
  {:db/ident :dpvo/PassiveRight,
   :dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Beatriz Esteves" "Harshvardhan J Pandit"],
   :dcterms/description
   "The right(s) applicable, provided, or expected that are always (passively) applicable",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Passive rights do not require the entity to request or exercise them. They are considered to be always applicable. For example, the Right to Privacy (in EU) does not require an exercise for it to be fulfilled.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Passive Right",
   :rdfs/subClassOf [:dpvo/Right :dpvo/PassiveRight],
   :vs/term_status "accepted"})

(def PasswordAuthentication
  "Use of passwords to perform authentication"
  {:db/ident :dpvo/PasswordAuthentication,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Use of passwords to perform authentication",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Password Authentication",
   :rdfs/subClassOf [:dpvo/AuthenticationProtocols
                     :dpvo/PasswordAuthentication
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def Patient
  "Data subjects that receive medican attention, treatment, care, advice, or other health related services"
  {:db/ident :dpvo/Patient,
   :dcterms/created #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator ["Paul Ryan"
                     "Beatriz Esteves"
                     "Julian Flake"
                     "Georg P. Krog"
                     "Harshvardhan J. Pandit"],
   :dcterms/description
   "Data subjects that receive medican attention, treatment, care, advice, or other health related services",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Patient",
   :rdfs/subClassOf [:dpvo/DataSubject
                     :dpvo/Patient
                     :dpvo/Entity
                     :dpvo/NaturalPerson
                     :dpvo/LegalEntity],
   :vs/term_status "accepted"})

(def PaymentManagement
  "Purposes associated with processing and managing payment in relation to service, including invoicing and records"
  {:db/ident :dpvo/PaymentManagement,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Beatriz Esteves" "Georg P Krog"],
   :dcterms/description
   "Purposes associated with processing and managing payment in relation to service, including invoicing and records",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Payment Management",
   :rdfs/subClassOf
   [:dpvo/ServiceProvision :dpvo/PaymentManagement :dpvo/Purpose],
   :vs/term_status "accepted"})

(def PenetrationTestingMethods
  "Use of penetration testing to identity weaknessess and vulnerabilities through simulations"
  {:db/ident :dpvo/PenetrationTestingMethods,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Use of penetration testing to identity weaknessess and vulnerabilities through simulations",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Penetration Testing Methods",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/PenetrationTestingMethods
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def Permission
  "A rule describing a permission to perform an activity"
  {:db/ident            :dpvo/Permission,
   :dcterms/created     #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator     ["Paul Ryan"
                         "Beatriz Esteves"
                         "Georg P Krog"
                         "Harshvardhan J. Pandit"],
   :dcterms/description "A rule describing a permission to perform an activity",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Permission",
   :rdfs/subClassOf     [:dpvo/Rule :dpvo/Permission],
   :vs/term_status      "accepted"})

(def PersonalData
  "Data directly or indirectly associated or related to an individual."
  {:db/ident :dpvo/PersonalData,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan Pandit",
   :dcterms/description
   "Data directly or indirectly associated or related to an individual.",
   :dcterms/modified #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_1/oj",
   :rdf/type :owl/Class,
   :rdfs/comment
   "This definition of personal data encompasses the concepts used in GDPR Art.4-1 for 'personal data' and ISO/IEC 2700 for 'personally identifiable information (PII)'.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Personal Data",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/langs/usage-policy#AnyData"],
   :rdfs/subClassOf [:dpvo/Data :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def PersonalDataHandling
  "A high-level Class to describe 'data handling'. This can consist of personal data being processed for a purpose, involving entities, using technical and organisational measures, applicable risks, rights, and legal basis."
  {:db/ident :dpvo/PersonalDataHandling,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Javier Fernández" "Axel Polleres"],
   :dcterms/description
   "A high-level Class to describe 'data handling'. This can consist of personal data being processed for a purpose, involving entities, using technical and organisational measures, applicable risks, rights, and legal basis.",
   :dcterms/modified #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Personal Data Handling",
   :vs/term_status "accepted"})

(def Personalisation
  "Purposes associated with creating and providing customisation based on attributes and/or needs of person(s) or context(s)."
  {:db/ident :dpvo/Personalisation,
   :dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Purposes associated with creating and providing customisation based on attributes and/or needs of person(s) or context(s).",
   :rdf/type :owl/Class,
   :rdfs/comment
   "This term is a blanket purpose category for indicating personalisation of some other purpose, e.g. by creating a subclass of the other concept and Personalisation",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Personalisation",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/Personalisation],
   :vs/term_status "accepted"})

(def PersonalisedAdvertising
  "Purposes associated with creating and providing personalised advertising"
  {:db/ident :dpvo/PersonalisedAdvertising,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Beatriz Esteves" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   "Purposes associated with creating and providing personalised advertising",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Personalised Advertising",
   :rdfs/subClassOf [:dpvo/Personalisation
                     :dpvo/Advertising
                     :dpvo/PersonalisedAdvertising
                     :dpvo/Marketing
                     :dpvo/Purpose],
   :vs/term_status "accepted"})

(def PersonalisedBenefits
  "Purposes associated with creating and providing personalised benefits for a service"
  {:db/ident :dpvo/PersonalisedBenefits,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling"
                     "Axel Polleres"
                     "Simon Steyskal"
                     "Fajar Ekaputra"
                     "Harshvardhan J. Pandit"
                     "Javier Fernandez"],
   :dcterms/description
   "Purposes associated with creating and providing personalised benefits for a service",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Personalised Benefits",
   :rdfs/subClassOf [:dpvo/ServicePersonalisation
                     :dpvo/PersonalisedBenefits
                     :dpvo/Personalisation
                     :dpvo/Purpose
                     :dpvo/ServiceProvision],
   :vs/term_status "accepted"})

(def PersonnelHiring
  "Purposes associated with management and execution of hiring processes of personnel"
  {:db/ident :dpvo/PersonnelHiring,
   :dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Purposes associated with management and execution of hiring processes of personnel",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Personnel Hiring",
   :rdfs/subClassOf [:dpvo/PersonnelManagement
                     :dpvo/PersonnelHiring
                     :dpvo/HumanResourceManagement
                     :dpvo/Purpose],
   :vs/term_status "accepted"})

(def PersonnelManagement
  "Purposes associated with management of personnel associated with the organisation e.g. evaluation and management of employees and intermediaries"
  {:db/ident :dpvo/PersonnelManagement,
   :dcterms/created #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Purposes associated with management of personnel associated with the organisation e.g. evaluation and management of employees and intermediaries",
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Personnel Management",
   :rdfs/subClassOf
   [:dpvo/HumanResourceManagement :dpvo/PersonnelManagement :dpvo/Purpose],
   :vs/term_status "accepted"})

(def PersonnelPayment
  "Purposes associated with management and execution of payment of personnel"
  {:db/ident :dpvo/PersonnelPayment,
   :dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Purposes associated with management and execution of payment of personnel",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Personnel Payment",
   :rdfs/subClassOf [:dpvo/PersonnelManagement
                     :dpvo/PersonnelPayment
                     :dpvo/HumanResourceManagement
                     :dpvo/Purpose],
   :vs/term_status "accepted"})

(def PhysicalAccessControlMethod
  "Access control applied for physical access e.g. premises or equipement"
  {:db/ident :dpvo/PhysicalAccessControlMethod,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   "Access control applied for physical access e.g. premises or equipement",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Physical Access Control Method",
   :rdfs/subClassOf [:dpvo/AccessControlMethod
                     :dpvo/PhysicalAccessControlMethod
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def Policy
  "A guidance document outlining any of: procedures, plans, principles, decisions, intent, or protocols."
  {:db/ident :dpvo/Policy,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Paul Ryan" "David Hickey" "Georg P Krog"],
   :dcterms/description
   "A guidance document outlining any of: procedures, plans, principles, decisions, intent, or protocols.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Policy",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/Policy
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def PostQuantumCryptography
  "Use of algorithms that are intended to be secure against cryptanalytic attack by a quantum computer"
  {:db/ident :dpvo/PostQuantumCryptography,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Use of algorithms that are intended to be secure against cryptanalytic attack by a quantum computer",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Post-Quantum Cryptography",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/PostQuantumCryptography
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def PrimaryImportance
  "Indication of 'primary' or 'main' or 'core' importance"
  {:db/ident :dpvo/PrimaryImportance,
   :dcterms/created #inst "2022-02-10T00:00:00.000-05:00",
   :dcterms/creator ["Julian Flake"
                     "Harshvardhan J. Pandit"
                     "Paul Ryan"
                     "Georg P Krog"
                     "Beatriz Esteves"],
   :dcterms/description
   "Indication of 'primary' or 'main' or 'core' importance",
   :rdf/type [:dpvo/Importance :owl/NamedIndividual :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Primary Importance",
   :vs/term_status "accepted"})

(def PrivacyByDefault
  "Practices regarding selecting appropriate data protection and privacy measures as the 'default' in an activity or service"
  {:db/ident :dpvo/PrivacyByDefault,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Axel Polleres" "Mark Lizar" "Harshvardhan J. Pandit" "Rob Brennan"],
   :dcterms/description
   "Practices regarding selecting appropriate data protection and privacy measures as the 'default' in an activity or service",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Privacy by Default",
   :rdfs/subClassOf [:dpvo/GuidelinesPrinciple
                     :dpvo/PrivacyByDefault
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def PrivacyByDesign
  "Practices regarding incorporating data protection and privacy in the design of information and services"
  {:db/ident :dpvo/PrivacyByDesign,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Axel Polleres" "Mark Lizar" "Rob Brennan"],
   :dcterms/description
   "Practices regarding incorporating data protection and privacy in the design of information and services",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Privacy by Design",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/PrivacyByDesign
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def PrivacyNotice
  "Represents a notice or document outlining information regarding privacy"
  {:db/ident :dpvo/PrivacyNotice,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "David Hickey" "Georg P Krog" "Paul Ryan"],
   :dcterms/description
   "Represents a notice or document outlining information regarding privacy",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Privacy Notice",
   :rdfs/subClassOf [:dpvo/Notice
                     :dpvo/PrivacyNotice
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def PrivacyPreservingProtocol
  "Use of protocols designed with the intention of provided additional guarentees regarding privacy"
  {:db/ident :dpvo/PrivacyPreservingProtocol,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Use of protocols designed with the intention of provided additional guarentees regarding privacy",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Privacy Preserving Protocol",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/PrivacyPreservingProtocol
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def PrivateInformationRetrieval
  "Use of cryptographic methods to retrieve a record from a system without revealing which record is retrieved"
  {:db/ident :dpvo/PrivateInformationRetrieval,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Use of cryptographic methods to retrieve a record from a system without revealing which record is retrieved",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Private Information Retrieval",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/PrivateInformationRetrieval
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def PrivateLocation
  "Location that is not or cannot be accessed by the public and is controlled as a private space"
  {:db/ident :dpvo/PrivateLocation,
   :dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Location that is not or cannot be accessed by the public and is controlled as a private space",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Private Location",
   :rdfs/subClassOf [:dpvo/LocalLocation
                     :dpvo/PrivateLocation
                     :dpvo/LocationLocality
                     :dpvo/Location],
   :vs/term_status "accepted"})

(def Processing
  "The processing performed on personal data"
  {:db/ident :dpvo/Processing,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres" "Javier Fernández"],
   :dcterms/description "The processing performed on personal data",
   :dcterms/modified #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source "https://specialprivacy.ercim.eu/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Processing",
   :rdfs/seeAlso
   ["https://specialprivacy.ercim.eu/langs/usage-policy#AnyProcessing"],
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status "accepted"})

(def ProcessingContext
  "Context or conditions within which processing takes place"
  {:db/ident :dpvo/ProcessingContext,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Context or conditions within which processing takes place",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Processing Context",
   :rdfs/subClassOf [:dpvo/Context :dpvo/ProcessingContext],
   :vs/term_status "accepted"})

(def ProcessingScale
  "Scale of Processing"
  {:db/ident :dpvo/ProcessingScale,
   :dcterms/created #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Piero Bonatti"],
   :dcterms/description "Scale of Processing",
   :rdf/type :owl/Class,
   :rdfs/comment
   "The exact definition of what constitutes \"scale\" depends on use of jurisdictional, domain-specific, or other forms of externally defined criterias. Where possible, this should be reflected by extending the scales provided with the appropriate context.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Processing Scale",
   :rdfs/subClassOf
   [:dpvo/Scale :dpvo/ProcessingScale :dpvo/Context :dpvo/ProcessingContext],
   :vs/term_status "accepted"})

(def ProfessionalTraining
  "Training methods that are intended to provide professional knowledge and expertise"
  {:db/ident :dpvo/ProfessionalTraining,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Training methods that are intended to provide professional knowledge and expertise",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Professional Training",
   :rdfs/subClassOf [:dpvo/StaffTraining
                     :dpvo/ProfessionalTraining
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def Profiling
  "to create a profile that describes or represents a person"
  {:db/ident :dpvo/Profiling,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   "to create a profile that describes or represents a person",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Profiling",
   :rdfs/subClassOf [:dpvo/Use :dpvo/Profiling :dpvo/Processing],
   :vs/term_status "accepted"})

(def Prohibition
  "A rule describing a prohibition to perform an activity"
  {:db/ident :dpvo/Prohibition,
   :dcterms/created #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator
   ["Beatriz Esteves" "Harshvardhan J. Pandit" "Georg P Krog" "Paul Ryan"],
   :dcterms/description
   "A rule describing a prohibition to perform an activity",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Prohibition",
   :rdfs/subClassOf [:dpvo/Rule :dpvo/Prohibition],
   :vs/term_status "accepted"})

(def ProvideEventRecommendations
  "Purposes associated with creating and providing personalised recommendations for events"
  {:db/ident :dpvo/ProvideEventRecommendations,
   :dcterms/created #inst "2019-11-26T00:00:00.000-05:00",
   :dcterms/creator ["Rudy Jacob" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Purposes associated with creating and providing personalised recommendations for events",
   :dcterms/modified #inst "2022-10-14T00:00:00.000-04:00",
   :dcterms/source "https://specialprivacy.ercim.eu/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Provide Event Recommendations",
   :rdfs/subClassOf [:dpvo/ProvidePersonalisedRecommendations
                     :dpvo/ProvideEventRecommendations
                     :dpvo/Personalisation
                     :dpvo/Purpose
                     :dpvo/ServiceProvision
                     :dpvo/ServicePersonalisation],
   :vs/term_status "accepted"})

(def ProvidePersonalisedRecommendations
  "Purposes associated with creating and providing personalised recommendations"
  {:db/ident :dpvo/ProvidePersonalisedRecommendations,
   :dcterms/created #inst "2019-11-26T00:00:00.000-05:00",
   :dcterms/creator ["Rudy Jacob" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Purposes associated with creating and providing personalised recommendations",
   :dcterms/modified #inst "2022-10-14T00:00:00.000-04:00",
   :dcterms/source "https://specialprivacy.ercim.eu/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Provide Personalised Recommendations",
   :rdfs/subClassOf [:dpvo/ServicePersonalisation
                     :dpvo/ProvidePersonalisedRecommendations
                     :dpvo/Personalisation
                     :dpvo/Purpose
                     :dpvo/ServiceProvision],
   :vs/term_status "accepted"})

(def ProvideProductRecommendations
  "Purposes associated with creating and providing product recommendations e.g. suggest similar products"
  {:db/ident :dpvo/ProvideProductRecommendations,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres"
                     "Javier Fernandez"
                     "Fajar Ekaputra"
                     "Simon Steyskal"
                     "Harshvardhan J. Pandit"
                     "Elmar Kiesling"],
   :dcterms/description
   "Purposes associated with creating and providing product recommendations e.g. suggest similar products",
   :dcterms/modified #inst "2022-10-14T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Provide Product Recommendations",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/purposes#Marketing"],
   :rdfs/subClassOf [:dpvo/ProvidePersonalisedRecommendations
                     :dpvo/ProvideProductRecommendations
                     :dpvo/Personalisation
                     :dpvo/Purpose
                     :dpvo/ServiceProvision
                     :dpvo/ServicePersonalisation],
   :vs/term_status "accepted"})

(def Pseudonymisation
  "Pseudonymisation means the processing of personal data in such a manner that the personal data can no longer be attributed to a specific data subject without the use of additional information, provided that such additional information is kept separately and is subject to technical and organisational measures to ensure that the personal data are not attributed to an identified or identifiable natural person;"
  {:db/ident :dpvo/Pseudonymisation,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Rob Brennan" "Axel Polleres" "Mark Lizar" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Pseudonymisation means the processing of personal data in such a manner that the personal data can no longer be attributed to a specific data subject without the use of additional information, provided that such additional information is kept separately and is subject to technical and organisational measures to ensure that the personal data are not attributed to an identified or identifiable natural person;",
   :dcterms/modified #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_5/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Pseudonymisation",
   :rdfs/subClassOf [:dpvo/Deidentification
                     :dpvo/Pseudonymisation
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure
                     :dpvo/DataSanitisationTechnique],
   :vs/term_status "modified"})

(def Pseudonymise
  "to replace personal identifiable information by artificial identifiers"
  {:db/ident :dpvo/Pseudonymise,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/creator "2022-10-14",
   :dcterms/description
   "to replace personal identifiable information by artificial identifiers",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Pseudonymise",
   :rdfs/subClassOf [:dpvo/Transform :dpvo/Pseudonymise :dpvo/Processing],
   :vs/term_status "modified"})

(def PseudonymisedData
  "Personal Data that has undergone a pseudonymisation process or a partial (incomplete) anonymisation process such that it is still considered Personal Data"
  {:db/ident :dpvo/PseudonymisedData,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Personal Data that has undergone a pseudonymisation process or a partial (incomplete) anonymisation process such that it is still considered Personal Data",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Pseudonymised Data",
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo/PseudonymisedData :dpvo/Data],
   :vs/term_status "accepted"})

(def PublicDataSource
  "A source of data that is publicly accessible or available"
  {:db/ident :dpvo/PublicDataSource,
   :dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator ["Julian Flake"
                     "Harshvardhan J. Pandit"
                     "Beatriz Esteves"
                     "Georg P Krog"
                     "Paul Ryan"],
   :dcterms/description
   "A source of data that is publicly accessible or available",
   :rdf/type [:owl/NamedIndividual
              :dpvo/DataSource
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/comment
   "The term 'Public' is used here in a broad sense. Actual consideration of what is 'Public Data' can vary based on several contextual or jurisdictional factors such as  definition of open, methods of access, permissions and licenses.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Public Data Source",
   :vs/term_status "accepted"})

(def PublicInterest
  "Processing is necessary or beneficial for interest of the public or society at large"
  {:db/ident :dpvo/PublicInterest,
   :dcterms/created #inst "2021-04-21T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Processing is necessary or beneficial for interest of the public or society at large",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Public Interest",
   :rdfs/subClassOf [:dpvo/LegalBasis :dpvo/PublicInterest],
   :vs/term_status "accepted"})

(def PublicLocation
  "Location that is or can be accessed by the public"
  {:db/ident            :dpvo/PublicLocation,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description "Location that is or can be accessed by the public",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Public Location",
   :rdfs/subClassOf     [:dpvo/LocalLocation
                         :dpvo/PublicLocation
                         :dpvo/LocationLocality
                         :dpvo/Location],
   :vs/term_status      "accepted"})

(def PublicRelations
  "Purposes associated with managing and conducting public relations processes, including creating goodwill for the organisation"
  {:db/ident :dpvo/PublicRelations,
   :dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog" "David Hickey"],
   :dcterms/description
   "Purposes associated with managing and conducting public relations processes, including creating goodwill for the organisation",
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Public Relations",
   :rdfs/subClassOf [:dpvo/Marketing :dpvo/PublicRelations :dpvo/Purpose],
   :vs/term_status "accepted"})

(def Purpose
  "The purpose of processing personal data"
  {:db/ident :dpvo/Purpose,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Javier Fernández" "Axel Polleres"],
   :dcterms/description "The purpose of processing personal data",
   :dcterms/modified #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source "https://specialprivacy.ercim.eu/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Purpose",
   :rdfs/seeAlso
   ["https://specialprivacy.ercim.eu/langs/usage-policy#AnyPurpose"],
   :rdfs/subClassOf :dpvo/Purpose,
   :vann/example "https://w3id.org/dpv/examples#E0004",
   :vs/term_status "accepted"})

(def QuantumCryptography
  "Cryptographic methods that utilise quantum mechanical properties to perform cryptographic tasks"
  {:db/ident :dpvo/QuantumCryptography,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Cryptographic methods that utilise quantum mechanical properties to perform cryptographic tasks",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Quantum Cryptography",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/QuantumCryptography
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def Query
  "to query or make enquiries over data"
  {:db/ident            :dpvo/Query,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "to query or make enquiries over data",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Query",
   :rdfs/subClassOf     [:dpvo/Consult :dpvo/Query :dpvo/Processing :dpvo/Use],
   :vs/term_status      "accepted"})

(def RNGPseudonymisation
  "A pseudonymisation method where identifiers are substituted by a number chosen by a Random Number Generator (RNG)"
  {:db/ident :dpvo/RNGPseudonymisation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A pseudonymisation method where identifiers are substituted by a number chosen by a Random Number Generator (RNG)",
   :dcterms/modified #inst "2022-10-13T00:00:00.000-04:00",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "RNG Pseudonymisation",
   :rdfs/subClassOf [:dpvo/Pseudonymisation
                     :dpvo/RNGPseudonymisation
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure
                     :dpvo/DataSanitisationTechnique
                     :dpvo/Deidentification],
   :vs/term_status "modified"})

(def RandomLocation
  "Location that is random or unknown"
  {:db/ident            :dpvo/RandomLocation,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Location that is random or unknown",
   :dcterms/modified    #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type            [:dpvo/LocationFixture :owl/NamedIndividual],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Random Location",
   :vs/term_status      "modified"})

(def Recipient
  "Entities that receive personal data"
  {:db/ident :dpvo/Recipient,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres" "Javier Fernández"],
   :dcterms/description "Entities that receive personal data",
   :dcterms/modified #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source ["https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_9/oj"
                    "https://specialprivacy.ercim.eu/"],
   :rdf/type :owl/Class,
   :rdfs/comment
   "A recipient of personal data can be used to indicate any entity that receives personal data. This can be a Third Party, Processor (GDPR), or even a Controller.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Recipient",
   :rdfs/seeAlso
   ["https://specialprivacy.ercim.eu/langs/usage-policy#AnyRecipient"],
   :rdfs/subClassOf [:dpvo/LegalEntity :dpvo/Recipient :dpvo/Entity],
   :vs/term_status "accepted"})

(def Record
  "to make a record (especially media)"
  {:db/ident :dpvo/Record,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description "to make a record (especially media)",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Record",
   :rdfs/subClassOf [:dpvo/Obtain :dpvo/Record :dpvo/Processing],
   :vs/term_status "accepted"})

(def RecordManagement
  "Purposes associated with manage creation, storage, and use of records relevant to operations, events, and processes e.g. to store logs or access requests"
  {:db/ident :dpvo/RecordManagement,
   :dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["David Hickey" "Harshvardhan J. Pandit" "Georg P Krog" "Paul Ryan"],
   :dcterms/description
   "Purposes associated with manage creation, storage, and use of records relevant to operations, events, and processes e.g. to store logs or access requests",
   :rdf/type :owl/Class,
   :rdfs/comment
   "This purpose relates specifiaclly for record creation and management. This can be combined or used along with other purposes to express intentions such as records for legal compliance or vendor payments.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Record Management",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/RecordManagement],
   :vs/term_status "accepted"})

(def RecordsOfActivities
  "Records of activities within some context such as maintainence tasks or governance functions"
  {:db/ident :dpvo/RecordsOfActivities,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Records of activities within some context such as maintainence tasks or governance functions",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Records of Activities",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/RecordsOfActivities
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def Region
  "A region is an area or site that is considered a location"
  {:db/ident :dpvo/Region,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A region is an area or site that is considered a location",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Region",
   :rdfs/subClassOf [:dpvo/Location :dpvo/Region],
   :vs/term_status "accepted"})

(def RegionalAuthority
  "An authority tasked with overseeing legal compliance for a region"
  {:db/ident :dpvo/RegionalAuthority,
   :dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "An authority tasked with overseeing legal compliance for a region",
   :dcterms/source "http://purl.org/adms",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Regional Authority",
   :rdfs/subClassOf [:dpvo/Authority
                     :dpvo/RegionalAuthority
                     :dpvo/GovernmentalOrganisation
                     :dpvo/Organisation
                     :dpvo/Entity
                     :dpvo/LegalEntity],
   :vs/term_status "accepted"})

(def RegionalScale
  "Geographic coverage spanning a specific region or regions"
  {:db/ident :dpvo/RegionalScale,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Geographic coverage spanning a specific region or regions",
   :rdf/type [:owl/NamedIndividual
              :dpvo/GeographicCoverage
              :dpvo/Scale
              :dpvo/ProcessingContext
              :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Regional Scale",
   :vs/term_status "accepted"})

(def RegisterOfProcessingActivities
  "A ROPA is a document maintained by Data Controllers detailing processing activities carried out under their responsibility"
  {:db/ident :dpvo/RegisterOfProcessingActivities,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description
   "A ROPA is a document maintained by Data Controllers detailing processing activities carried out under their responsibility",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Tied to compliance processes and documents, decide how to specify those",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Register of Processing Activities",
   :rdfs/subClassOf [:dpvo/DataProcessingRecord
                     :dpvo/RegisterOfProcessingActivities
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/RecordsOfActivities],
   :vs/term_status "accepted"})

(def RegularityOfRecertification
  "Policy regarding repetition or renewal of existing certification(s)"
  {:db/ident :dpvo/RegularityOfRecertification,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Axel Polleres" "Rob Brennan" "Mark Lizar"],
   :dcterms/description
   "Policy regarding repetition or renewal of existing certification(s)",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Regularity of Re-certification",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/RegularityOfRecertification
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def RemoteLocation
  "Location is remote i.e. not local"
  {:db/ident            :dpvo/RemoteLocation,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Location is remote i.e. not local",
   :dcterms/modified    #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Remote Location",
   :rdfs/subClassOf     [:dpvo/LocationLocality
                         :dpvo/RemoteLocation
                         :dpvo/Location],
   :vs/term_status      "modified"})

(def Remove
  "to destruct or erase data"
  {:db/ident :dpvo/Remove,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description "to destruct or erase data",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Remove",
   :rdfs/subClassOf [:dpvo/Processing :dpvo/Remove],
   :vs/term_status "accepted"})

(def RenewedConsentGiven
  "The state where a previously given consent has been 'renewed' or 'refreshed' or 'reaffirmed' to form a new instance of given consent"
  {:db/ident :dpvo/RenewedConsentGiven,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Julian Flake" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   "The state where a previously given consent has been 'renewed' or 'refreshed' or 'reaffirmed' to form a new instance of given consent",
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/type [:owl/NamedIndividual
              :dpvo/ConsentStatusValidForProcessing
              :dpvo/Status
              :dpvo/ConsentStatus
              :dpvo/Context],
   :rdfs/comment
   "An example of this state is when a previously given consent has expired, and the individual is presented a notice regarding continuing associated processing operations - to which they agree. This state can be useful to keep track of 'reconfirmed' or 'refreshed' consent within consent records, assist notices and contextual agents to create better consenting dialogues, and assist with specific legal obligations related to subsequent consenting",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Renewed Consent Given",
   :vs/term_status "accepted"})

(def RepairImpairments
  "Purposes associated with identifying, rectifying, or otherwise undertaking activities intended to fix or repair impairments to existing functionalities"
  {:db/ident :dpvo/RepairImpairments,
   :dcterms/created #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Purposes associated with identifying, rectifying, or otherwise undertaking activities intended to fix or repair impairments to existing functionalities",
   :rdf/type :owl/Class,
   :rdfs/comment
   "An example of identifying and rectifying impairments is the process of finding and fixing errors in products, commonly referred to as debugging",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Repair Impairments",
   :rdfs/subClassOf
   [:dpvo/ServiceProvision :dpvo/RepairImpairments :dpvo/Purpose],
   :vs/term_status "accepted"})

(def Representative
  "A representative of a legal entity"
  {:db/ident            :dpvo/Representative,
   :dcterms/created     #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator     ["Georg Krog"
                         "Paul Ryan"
                         "Harshvardhan J. Pandit"
                         "Beatriz Esteves"],
   :dcterms/description "A representative of a legal entity",
   :dcterms/source      "https://eur-lex.europa.eu/eli/reg/2016/679/art_27/oj",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Representative",
   :rdfs/subClassOf     [:dpvo/LegalEntity :dpvo/Representative :dpvo/Entity],
   :vs/term_status      "accepted"})

(def RequestAccepted
  "State of a request being accepted towards fulfilment"
  {:db/ident            :dpvo/RequestAccepted,
   :dcterms/created     #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "State of a request being accepted towards fulfilment",
   :rdf/type            [:dpvo/RequestStatus
                         :owl/NamedIndividual
                         :dpvo/Context
                         :dpvo/Status],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Request Accepted",
   :vs/term_status      "accepted"})

(def RequestAcknowledged
  "State of a request being acknowledged"
  {:db/ident            :dpvo/RequestAcknowledged,
   :dcterms/created     #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "State of a request being acknowledged",
   :rdf/type            [:owl/NamedIndividual
                         :dpvo/RequestStatus
                         :dpvo/Context
                         :dpvo/Status],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Request Acknowledged",
   :vs/term_status      "accepted"})

(def RequestActionDelayed
  "State of a request being delayed towards fulfilment"
  {:db/ident            :dpvo/RequestActionDelayed,
   :dcterms/created     #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "State of a request being delayed towards fulfilment",
   :rdf/type            [:dpvo/RequestStatus
                         :owl/NamedIndividual
                         :dpvo/Context
                         :dpvo/Status],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Request Action Delayed",
   :vs/term_status      "accepted"})

(def RequestFulfilled
  "State of a request being fulfilled"
  {:db/ident            :dpvo/RequestFulfilled,
   :dcterms/created     #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "State of a request being fulfilled",
   :rdf/type            [:owl/NamedIndividual
                         :dpvo/RequestStatus
                         :dpvo/Context
                         :dpvo/Status],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Request Fulfilled",
   :vs/term_status      "accepted"})

(def RequestInitiated
  "State of a request being initiated"
  {:db/ident            :dpvo/RequestInitiated,
   :dcterms/created     #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "State of a request being initiated",
   :rdf/type            [:dpvo/RequestStatus
                         :owl/NamedIndividual
                         :dpvo/Context
                         :dpvo/Status],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Request Initiated",
   :vs/term_status      "accepted"})

(def RequestRejected
  "State of a request being rejected towards non-fulfilment"
  {:db/ident :dpvo/RequestRejected,
   :dcterms/created #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "State of a request being rejected towards non-fulfilment",
   :rdf/type
   [:owl/NamedIndividual :dpvo/RequestStatus :dpvo/Context :dpvo/Status],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Request Rejected",
   :vs/term_status "accepted"})

(def RequestRequiredActionPerformed
  "State of a request's required action having been performed by the other party"
  {:db/ident :dpvo/RequestRequiredActionPerformed,
   :dcterms/created #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "State of a request's required action having been performed by the other party",
   :rdf/type
   [:dpvo/RequestStatus :owl/NamedIndividual :dpvo/Context :dpvo/Status],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Request Required Action Performed",
   :vs/term_status "accepted"})

(def RequestRequiresAction
  "State of a request requiring an action to be performed from another party"
  {:db/ident :dpvo/RequestRequiresAction,
   :dcterms/created #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "State of a request requiring an action to be performed from another party",
   :rdf/type
   [:dpvo/RequestStatus :owl/NamedIndividual :dpvo/Context :dpvo/Status],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Request Requires Action",
   :vs/term_status "accepted"})

(def RequestStatus
  "Status associated with requests"
  {:db/ident            :dpvo/RequestStatus,
   :dcterms/created     #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Status associated with requests",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Request Status",
   :rdfs/subClassOf     [:dpvo/Status :dpvo/RequestStatus :dpvo/Context],
   :vs/term_status      "accepted"})

(def RequestStatusQuery
  "State of a request's status being queried"
  {:db/ident            :dpvo/RequestStatusQuery,
   :dcterms/created     #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "State of a request's status being queried",
   :rdf/type            [:dpvo/RequestStatus
                         :owl/NamedIndividual
                         :dpvo/Context
                         :dpvo/Status],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Request Status Query",
   :vs/term_status      "accepted"})

(def RequestUnfulfilled
  "State of a request being unfulfilled"
  {:db/ident            :dpvo/RequestUnfulfilled,
   :dcterms/created     #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "State of a request being unfulfilled",
   :rdf/type            [:dpvo/RequestStatus
                         :owl/NamedIndividual
                         :dpvo/Context
                         :dpvo/Status],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Request Unfulfilled",
   :vs/term_status      "accepted"})

(def RequestedServiceProvision
  "Purposes associated with delivering services as requested by user or consumer"
  {:db/ident :dpvo/RequestedServiceProvision,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Beatriz Esteves" "Georg P Krog"],
   :dcterms/description
   "Purposes associated with delivering services as requested by user or consumer",
   :rdf/type :owl/Class,
   :rdfs/comment
   "The use of 'request' here includes where an user explicitly asks for the service and also when an established contract requires the provision of the service",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Requested Service Provision",
   :rdfs/subClassOf
   [:dpvo/ServiceProvision :dpvo/RequestedServiceProvision :dpvo/Purpose],
   :vs/term_status "accepted"})

(def Required
  "Indication of 'required' or 'necessary'"
  {:db/ident            :dpvo/Required,
   :dcterms/created     #inst "2022-02-13T00:00:00.000-05:00",
   :dcterms/creator     ["Paul Ryan"
                         "Georg P Krog"
                         "Harshvardhan J. Pandit"
                         "Julian Flake"
                         "Beatriz Esteves"],
   :dcterms/description "Indication of 'required' or 'necessary'",
   :rdf/type            [:owl/NamedIndividual :dpvo/Necessity :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Required",
   :vs/term_status      "accepted"})

(def ResearchAndDevelopment
  "Purposes associated with conducting research and development for new methods, products, or services"
  {:db/ident :dpvo/ResearchAndDevelopment,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Javier Fernandez"
                     "Simon Steyskal"
                     "Fajar Ekaputra"
                     "Axel Polleres"
                     "Elmar Kiesling"
                     "Harshvardhan J. Pandit"],
   :dcterms/description
   "Purposes associated with conducting research and development for new methods, products, or services",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Research and Development",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/ResearchAndDevelopment],
   :vs/term_status "accepted"})

(def Restrict
  "to apply a restriction on the processsing of specific records"
  {:db/ident :dpvo/Restrict,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   "to apply a restriction on the processsing of specific records",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Restrict",
   :rdfs/subClassOf [:dpvo/Transform :dpvo/Restrict :dpvo/Processing],
   :vs/term_status "accepted"})

(def Retrieve
  "to retrieve data, often in an automated manner"
  {:db/ident :dpvo/Retrieve,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description "to retrieve data, often in an automated manner",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Retrieve",
   :rdfs/subClassOf [:dpvo/Use :dpvo/Retrieve :dpvo/Processing],
   :vs/term_status "accepted"})

(def ReviewImpactAssessment
  "Procedures to review impact assessments in terms of continued validity, adequacy for intended purposes, and conformance of processes with findings"
  {:db/ident :dpvo/ReviewImpactAssessment,
   :dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   "Procedures to review impact assessments in terms of continued validity, adequacy for intended purposes, and conformance of processes with findings",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Review Impact Assessment",
   :rdfs/subClassOf [:dpvo/ReviewProcedure
                     :dpvo/ImpactAssessment
                     :dpvo/ReviewImpactAssessment
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/Assessment],
   :vs/term_status "accepted"})

(def ReviewProcedure
  "A procedure or process that reviews the correctness and validity of other measures and processes"
  {:db/ident :dpvo/ReviewProcedure,
   :dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   "A procedure or process that reviews the correctness and validity of other measures and processes",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Review Procedure",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/ReviewProcedure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def Right
  "The right(s) applicable, provided, or expected. The right(s) applicable, provided, or expected"
  {:db/ident :dpvo/Right,
   :dcterms/created #inst "2020-11-18T00:00:00.000-05:00",
   :dcterms/creator ["Beatriz Esteves" "Georg P Krog" "Harshvardhan J Pandit"],
   :dcterms/description ["The right(s) applicable, provided, or expected."
                         "The right(s) applicable, provided, or expected"],
   :rdf/type :owl/Class,
   :rdfs/comment
   "A 'right' is a legal, social, or ethical principle of freedom or entitlement which dictate the norms regarding what is allowed or owed.. Rights as a concept encompass a broad area of norms and entities, and are not specific to Individuals or Data Protection / Privacy. For individual specific rights, see dpv:DataSubjectRight",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Right",
   :rdfs/subClassOf :dpvo/Right,
   :vs/term_status "accepted"})

(def RightExerciseActivity
  "An activity representing an exercising of an active right"
  {:db/ident :dpvo/RightExerciseActivity,
   :dcterms/created #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J Pandit" "Beatriz Esteves" "Georg P Krog"],
   :dcterms/description
   "An activity representing an exercising of an active right",
   :rdf/type :owl/Class,
   :rdfs/comment
   "There may be multiple activities associated with exercising and fulfilling rights. See the RightExerciseRecord concept for record-keeping of such activities in a cohesive manner.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Right Exercise Activity",
   :vs/term_status "accepted"})

(def RightExerciseNotice
  "Information associated with exercising of an active right"
  {:db/ident :dpvo/RightExerciseNotice,
   :dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Beatriz Esteves" "Harshvardhan J Pandit" "Georg P Krog" "Paul Ryan"],
   :dcterms/description
   "Information associated with exercising of an active right",
   :rdf/type :owl/Class,
   :rdfs/comment
   "This concept is intended for providing information regarding a right exercise. For specific instances of such exercises, see RightExerciseActivity and RightExerciseRecord.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Right Exercise Notice",
   :vs/term_status "accepted"})

(def RightExerciseRecord
  "Record of a Right being exercised"
  {:db/ident :dpvo/RightExerciseRecord,
   :dcterms/created #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Harshvardhan J Pandit" "Beatriz Esteves" "Paul Ryan"],
   :dcterms/description "Record of a Right being exercised",
   :rdf/type [:dpvo/Record :owl/NamedIndividual :dpvo/Processing :dpvo/Obtain],
   :rdfs/comment
   "This concept represents a record of one or more right exercise activities, such as those associated with a single data subject or service or entity",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Right Exercise Record",
   :vs/term_status "accepted"})

(def RightFulfilmentNotice
  "Notice provided regarding fulfilment of a right"
  {:db/ident :dpvo/RightFulfilmentNotice,
   :dcterms/created #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator ["Beatriz Esteves" "Harshvardhan J. Pandit"],
   :dcterms/description "Notice provided regarding fulfilment of a right",
   :rdf/type :owl/Class,
   :rdfs/comment
   "This notice is associated with situations where information is provided with the intention of progressing the fulfilment of a right. For example, a notice asking for more information regarding the scope of the right, or providing information on where to access the data provided under a right.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Right Fulfilment Notice",
   :rdfs/subClassOf [:dpvo/Notice
                     :dpvo/RightFulfilmentNotice
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def RightNonFulfilmentNotice
  "Notice provided regarding non-fulfilment of a right"
  {:db/ident :dpvo/RightNonFulfilmentNotice,
   :dcterms/created #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator ["Beatriz Esteves" "Harshvardhan J. Pandit"],
   :dcterms/description "Notice provided regarding non-fulfilment of a right",
   :rdf/type :owl/Class,
   :rdfs/comment
   "This notice is associated with situations where information is provided with the intention of communicating non-fulfilment of a right. For example, to provide justifications on why a right could not be fulfilled or providing information about another entity  who should be approached for exercising this right.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Right Non-Fulfilment Notice",
   :rdfs/subClassOf [:dpvo/Notice
                     :dpvo/RightNonFulfilmentNotice
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def Risk
  "A risk or possibility or uncertainty of negative effects, impacts, or consequences."
  {:db/ident :dpvo/Risk,
   :dcterms/created #inst "2020-11-18T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A risk or possibility or uncertainty of negative effects, impacts, or consequences.",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Risks can be associated with one or more different concepts such as purpose, processing, personal data, technical or organisational measure.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Risk",
   :vs/term_status "accepted"})

(def RiskLevel
  "The magnitude of a risk expressed as an indication to aid in its management"
  {:db/ident :dpvo/RiskLevel,
   :dcterms/created #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The magnitude of a risk expressed as an indication to aid in its management",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Risk Levels can be defined as a combination of different characteristics. For example, ISO 31073:2022 defines it as a combination of consequences and their likelihood. Another example would be the Risk Matrix where Risk Level is defined as a combination of Likelihood and Severity associated with the Risk.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Risk Level",
   :vs/term_status "accepted"})

(def RiskManagementPlan
  "A scheme within the risk management framework specifying the approach, the management components, and resources to be applied to the management of risk"
  {:db/ident :dpvo/RiskManagementPlan,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A scheme within the risk management framework specifying the approach, the management components, and resources to be applied to the management of risk",
   :dcterms/source "https://www.iso.org/standard/79637.html",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Risk Management Plan",
   :rdfs/subClassOf [:dpvo/SecurityProcedure
                     :dpvo/RiskManagementPlan
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def RiskManagementPolicy
  "A policy or statement of the overall intentions and direction of an organisation related to risk management"
  {:db/ident :dpvo/RiskManagementPolicy,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A policy or statement of the overall intentions and direction of an organisation related to risk management",
   :dcterms/source "https://www.iso.org/standard/79637.html",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Risk Management Policy",
   :rdfs/subClassOf [:dpvo/Policy
                     :dpvo/SecurityProcedure
                     :dpvo/RiskManagementPolicy
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def RiskManagementProcess
  "The systematic application of management policies, procedures and practices to the activities of communicating, consulting, establishing the context, and identifying, analysing, evaluating, treating, monitoring, and reviewing risk"
  {:db/ident :dpvo/RiskManagementProcess,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The systematic application of management policies, procedures and practices to the activities of communicating, consulting, establishing the context, and identifying, analysing, evaluating, treating, monitoring, and reviewing risk",
   :dcterms/source ["https://www.iso.org/standard/79637.html"
                    "https://www.iso.org/iso-31000-risk-management.html"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Risk Management Process",
   :rdfs/subClassOf [:dpvo/SecurityProcedure
                     :dpvo/RiskManagementProcess
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def RiskMitigationMeasure
  "Measures intended to mitigate, minimise, or prevent risk."
  {:db/ident :dpvo/RiskMitigationMeasure,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Paul Ryan" "Georg P Krog"],
   :dcterms/description
   "Measures intended to mitigate, minimise, or prevent risk.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Risk Mitigation Measure",
   :rdfs/subClassOf [:dpvo/TechnicalOrganisationalMeasure
                     :dpvo/RiskMitigationMeasure],
   :vs/term_status "accepted"})

(def Rule
  "A rule describing a process or control that directs or determines if and how an activity should be conducted"
  {:db/ident :dpvo/Rule,
   :dcterms/created #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator
   ["Beatriz Esteves" "Harshvardhan J. Pandit" "Paul Ryan" "Georg P Krog"],
   :dcterms/description
   "A rule describing a process or control that directs or determines if and how an activity should be conducted",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Rule",
   :rdfs/subClassOf :dpvo/Rule,
   :vs/term_status "accepted"})

(def Safeguard
  "A safeguard is a precautionary measure for the protection against or mitigation of negative effects"
  {:db/ident :dpvo/Safeguard,
   :dcterms/created #inst "2021-09-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J. Pandit" "David Hickey" "Georg P Krog"],
   :dcterms/description
   "A safeguard is a precautionary measure for the protection against or mitigation of negative effects",
   :rdf/type :owl/Class,
   :rdfs/comment
   "This concept is relevant given the requirement to assert safeguards in cross-border data transfers",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Safeguard",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/Safeguard
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def SafeguardForDataTransfer
  "Represents a safeguard used for data transfer. Can include technical or organisational measures."
  {:db/ident :dpvo/SafeguardForDataTransfer,
   :dcterms/created #inst "2021-09-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J. Pandit" "David Hickey" "Georg P Krog"],
   :dcterms/description
   "Represents a safeguard used for data transfer. Can include technical or organisational measures.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Safeguard for Data Transfer",
   :rdfs/subClassOf [:dpvo/Safeguard
                     :dpvo/SafeguardForDataTransfer
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def Scale
  "A measurement along some dimension"
  {:db/ident :dpvo/Scale,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator ["Rana Saniei" "Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description "A measurement along some dimension",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Scales are subjective concepts that need to be defined and interpreted within the context of their application. For example, what would be small within one context could be large within another.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Scale",
   :rdfs/subClassOf [:dpvo/ProcessingContext :dpvo/Scale :dpvo/Context],
   :vs/term_status "accepted"})

(def Scope
  "Indication of the extent or range or boundaries associated with(in) a context"
  {:db/ident :dpvo/Scope,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Indication of the extent or range or boundaries associated with(in) a context",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Scope",
   :rdfs/subClassOf [:dpvo/Context :dpvo/Scope],
   :vs/term_status "accepted"})

(def ScoringOfIndividuals
  "Processing that involves scoring of individuals"
  {:db/ident :dpvo/ScoringOfIndividuals,
   :dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Processing that involves scoring of individuals",
   :dcterms/modified #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Scoring of Individuals",
   :rdfs/subClassOf [:dpvo/EvaluationScoring
                     :dpvo/ScoringOfIndividuals
                     :dpvo/Context
                     :dpvo/ProcessingContext],
   :vs/term_status "modified"})

(def Screen
  "to remove data for some criteria"
  {:db/ident            :dpvo/Screen,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description "to remove data for some criteria",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Screen",
   :rdfs/subClassOf     [:dpvo/Transform :dpvo/Screen :dpvo/Processing],
   :vs/term_status      "accepted"})

(def Seal
  "A seal or a mark indicating proof of certification to some certification or standard"
  {:db/ident :dpvo/Seal,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Mark Lizar" "Rob Brennan" "Axel Polleres" "Harshvardhan J. Pandit"],
   :dcterms/description
   "A seal or a mark indicating proof of certification to some certification or standard",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Seal",
   :rdfs/subClassOf [:dpvo/CertificationSeal
                     :dpvo/Seal
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def SearchFunctionalities
  "Purposes associated with providing searching, querying, or other forms of information retrieval related functionalities"
  {:db/ident :dpvo/SearchFunctionalities,
   :dcterms/created #inst "2022-11-09T00:00:00.000-05:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   "Purposes associated with providing searching, querying, or other forms of information retrieval related functionalities",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Search Functionalities",
   :rdfs/subClassOf
   [:dpvo/ServiceProvision :dpvo/SearchFunctionalities :dpvo/Purpose],
   :vs/term_status "accepted"})

(def SecondaryImportance
  "Indication of 'secondary' or 'minor' or 'auxiliary' importance"
  {:db/ident :dpvo/SecondaryImportance,
   :dcterms/created #inst "2022-02-11T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog"
                     "Harshvardhan J. Pandit"
                     "Paul Ryan"
                     "Julian Flake"
                     "Beatriz Esteves"],
   :dcterms/description
   "Indication of 'secondary' or 'minor' or 'auxiliary' importance",
   :rdf/type [:dpvo/Importance :owl/NamedIndividual :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Secondary Importance",
   :vs/term_status "accepted"})

(def SecretSharingSchemes
  "Use of secret sharing schemes where the secret can only be reconstructed through combination of sufficient number of individuals"
  {:db/ident :dpvo/SecretSharingSchemes,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Use of secret sharing schemes where the secret can only be reconstructed through combination of sufficient number of individuals",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Secret Sharing Schemes",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/SecretSharingSchemes
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def Sector
  "Sector describes the area of application or domain that indicates or restricts scope for interpretation and application of purpose e.g. Agriculture, Banking"
  {:db/ident :dpvo/Sector,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling"
                     "Harshvardhan J. Pandit"
                     "Simon Steyskal"
                     "Javier Fernandez"
                     "Axel Polleres"
                     "Fajar Ekaputra"],
   :dcterms/description
   "Sector describes the area of application or domain that indicates or restricts scope for interpretation and application of purpose e.g. Agriculture, Banking",
   :rdf/type :owl/Class,
   :rdfs/comment
   "There are various sector codes used commonly to indicate the domain of an organisation or business. Examples include NACE (EU), ISIC (UN), SIC and NAICS (USA).",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Sector",
   :vs/term_status "accepted"})

(def SecureMultiPartyComputation
  "Use of cryptographic methods for entities to jointly compute functions without revealing inputs"
  {:db/ident :dpvo/SecureMultiPartyComputation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Use of cryptographic methods for entities to jointly compute functions without revealing inputs",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Secure Multi-Party Computation",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/SecureMultiPartyComputation
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def SecurityAssessment
  "Assessment of security intended to identity gaps, vulnerabilities, risks, and effectiveness of controls"
  {:db/ident :dpvo/SecurityAssessment,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Assessment of security intended to identity gaps, vulnerabilities, risks, and effectiveness of controls",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Security Assessment",
   :rdfs/subClassOf [:dpvo/SecurityProcedure
                     :dpvo/Assessment
                     :dpvo/SecurityAssessment
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def SecurityKnowledgeTraining
  "Training intended to increase knowledge regarding security"
  {:db/ident :dpvo/SecurityKnowledgeTraining,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Training intended to increase knowledge regarding security",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Security Knowledge Training",
   :rdfs/subClassOf [:dpvo/StaffTraining
                     :dpvo/SecurityKnowledgeTraining
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def SecurityMethod
  "Methods that relate to creating and providing security"
  {:db/ident :dpvo/SecurityMethod,
   :dcterms/created #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Methods that relate to creating and providing security",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Security Method",
   :rdfs/subClassOf [:dpvo/TechnicalMeasure
                     :dpvo/SecurityMethod
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def SecurityProcedure
  "Procedures associated with assessing, implementing, and evaluating security"
  {:db/ident :dpvo/SecurityProcedure,
   :dcterms/created #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Procedures associated with assessing, implementing, and evaluating security",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Security Procedure",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/SecurityProcedure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def SecurityRoleProcedures
  "Procedures related to security roles"
  {:db/ident :dpvo/SecurityRoleProcedures,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Procedures related to security roles",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Security Role Procedures",
   :rdfs/subClassOf [:dpvo/SecurityProcedure
                     :dpvo/SecurityRoleProcedures
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def SellDataToThirdParties
  "Purposes associated with selling or sharing data or information to third parties"
  {:db/ident :dpvo/SellDataToThirdParties,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Simon Steyskal"
                     "Harshvardhan J. Pandit"
                     "Fajar Ekaputra"
                     "Axel Polleres"
                     "Elmar Kiesling"
                     "Javier Fernandez"],
   :dcterms/description
   "Purposes associated with selling or sharing data or information to third parties",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Sell here means exchange, submit, or provide in return for direct or indirect compensation. Was subclass of commercial interest, changed to reflect selling something",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Sell Data to Third Parties",
   :rdfs/subClassOf [:dpvo/SellProducts
                     :dpvo/SellDataToThirdParties
                     :dpvo/Purpose
                     :dpvo/ServiceProvision],
   :vs/term_status "accepted"})

(def SellInsightsFromData
  "Purposes associated with selling or sharing insights obtained from analysis of data"
  {:db/ident :dpvo/SellInsightsFromData,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra"
                     "Harshvardhan J. Pandit"
                     "Simon Steyskal"
                     "Axel Polleres"
                     "Elmar Kiesling"
                     "Javier Fernandez"],
   :dcterms/description
   "Purposes associated with selling or sharing insights obtained from analysis of data",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Sell here means exchange, submit, or provide in return for direct or indirect compensation. Was subclass of commercial interest, changed to reflect selling something",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Sell Insights from Data",
   :rdfs/subClassOf [:dpvo/SellProducts
                     :dpvo/SellInsightsFromData
                     :dpvo/Purpose
                     :dpvo/ServiceProvision],
   :vs/term_status "accepted"})

(def SellProducts
  "Purposes associated with selling products or services"
  {:db/ident :dpvo/SellProducts,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Beatriz Esteves" "Georg P Krog"],
   :dcterms/description "Purposes associated with selling products or services",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Sell here means exchange, submit, or provide in return for direct or indirect compensation.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Sell Products",
   :rdfs/subClassOf [:dpvo/ServiceProvision :dpvo/SellProducts :dpvo/Purpose],
   :vs/term_status "accepted"})

(def SellProductsToDataSubject
  "Purposes associated with selling products or services to the user, consumer, or data subjects"
  {:db/ident :dpvo/SellProductsToDataSubject,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Simon Steyskal"
                     "Harshvardhan J. Pandit"
                     "Fajar Ekaputra"
                     "Elmar Kiesling"
                     "Javier Fernandez"
                     "Axel Polleres"],
   :dcterms/description
   "Purposes associated with selling products or services to the user, consumer, or data subjects",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Sell Products here refers to processing necessary to provide and complete a sale to customers. It should not be confused with providing services with a cost based on an established agreement.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Sell Products to Data Subject",
   :rdfs/subClassOf [:dpvo/SellProducts
                     :dpvo/SellProductsToDataSubject
                     :dpvo/Purpose
                     :dpvo/ServiceProvision],
   :vs/term_status "accepted"})

(def SensitivePersonalData
  "Personal data that is considered 'sensitive' in terms of privacy and/or impact, and therefore requires additional considerations and/or protection"
  {:db/ident :dpvo/SensitivePersonalData,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Personal data that is considered 'sensitive' in terms of privacy and/or impact, and therefore requires additional considerations and/or protection",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Sensitivity' is a matter of context, and may be defined within legal frameworks. For GDPR, Special categories of personal data are considered a subset of sensitive data. To illustrate the difference between the two, consider the situation where Location data is collected, and which is considered 'sensitive' but not 'special'. As a probable rule, sensitive data require additional considerations whereas special category data requires additional legal basis / justifications.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Sensitive Personal Data",
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo/SensitivePersonalData :dpvo/Data],
   :vs/term_status "accepted"})

(def ServiceOptimisation
  "Purposes associated with optimisation of services or activities"
  {:db/ident :dpvo/ServiceOptimisation,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra"
                     "Axel Polleres"
                     "Elmar Kiesling"
                     "Simon Steyskal"
                     "Harshvardhan J. Pandit"
                     "Javier Fernandez"],
   :dcterms/description
   "Purposes associated with optimisation of services or activities",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Subclass of ServiceProvision since optimisation is usually considered part of providing services",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Service Optimisation",
   :rdfs/subClassOf
   [:dpvo/ServiceProvision :dpvo/ServiceOptimisation :dpvo/Purpose],
   :vs/term_status "accepted"})

(def ServicePersonalisation
  "Purposes associated with providing personalisation within services or product or activities"
  {:db/ident :dpvo/ServicePersonalisation,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit"
                     "Elmar Kiesling"
                     "Simon Steyskal"
                     "Axel Polleres"
                     "Fajar Ekaputra"
                     "Javier Fernandez"],
   :dcterms/description
   "Purposes associated with providing personalisation within services or product or activities",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Service Personalisation",
   :rdfs/subClassOf [:dpvo/ServiceProvision
                     :dpvo/Personalisation
                     :dpvo/ServicePersonalisation
                     :dpvo/Purpose],
   :vs/term_status "accepted"})

(def ServiceProvision
  "Purposes associated with providing service or product or activities"
  {:db/ident :dpvo/ServiceProvision,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres"
                     "Elmar Kiesling"
                     "Simon Steyskal"
                     "Fajar Ekaputra"
                     "Javier Fernandez"
                     "Harshvardhan J. Pandit"],
   :dcterms/description
   "Purposes associated with providing service or product or activities",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Service Provision",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/ServiceProvision],
   :vs/term_status "accepted"})

(def ServiceRegistration
  "Purposes associated with registering users and collecting information required for providing a service"
  {:db/ident :dpvo/ServiceRegistration,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog" "Beatriz Esteves"],
   :dcterms/description
   "Purposes associated with registering users and collecting information required for providing a service",
   :rdf/type :owl/Class,
   :rdfs/comment
   "An example of service registration is to provide a form that collects information such as preferred language or media format for downloading a movie",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Service Registration",
   :rdfs/subClassOf
   [:dpvo/ServiceProvision :dpvo/ServiceRegistration :dpvo/Purpose],
   :vs/term_status "accepted"})

(def ServiceUsageAnalytics
  "Purposes associated with conducting analysis and reporting related to usage of services or products"
  {:db/ident :dpvo/ServiceUsageAnalytics,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Beatriz Esteves" "Georg P Krog"],
   :dcterms/description
   "Purposes associated with conducting analysis and reporting related to usage of services or products",
   :dcterms/modified #inst "2022-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Was \"UsageAnalytics\", prefixed with Service to better reflect scope",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Service Usage Analytics",
   :rdfs/subClassOf
   [:dpvo/ServiceProvision :dpvo/ServiceUsageAnalytics :dpvo/Purpose],
   :vs/term_status "modified"})

(def Severity
  "The magnitude of being unwanted or having negative effects such as harmful impacts"
  {:db/ident :dpvo/Severity,
   :dcterms/created #inst "2022-07-21T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The magnitude of being unwanted or having negative effects such as harmful impacts",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Severity can be associated with Risk, or its Consequences and Impacts",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Severity",
   :vs/term_status "accepted"})

(def Share
  "to give data (or a portion of it) to others"
  {:db/ident :dpvo/Share,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description "to give data (or a portion of it) to others",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Share",
   :rdfs/subClassOf [:dpvo/Disclose :dpvo/Share :dpvo/Processing],
   :vs/term_status "accepted"})

(def SingleSignOn
  "Use of credentials or processes that enable using one set of credentials to authenticate multiple contexts."
  {:db/ident :dpvo/SingleSignOn,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   "Use of credentials or processes that enable using one set of credentials to authenticate multiple contexts.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Single Sign On",
   :rdfs/subClassOf [:dpvo/AuthenticationProtocols
                     :dpvo/SingleSignOn
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def SingularDataVolume
  "Data volume that is considered singular i.e. a specific instance or single item"
  {:db/ident :dpvo/SingularDataVolume,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Data volume that is considered singular i.e. a specific instance or single item",
   :rdf/type [:owl/NamedIndividual
              :dpvo/DataVolume
              :dpvo/Scale
              :dpvo/ProcessingContext
              :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Singular Data Volume",
   :vs/term_status "accepted"})

(def SingularFrequency
  "Frequency where occurences are singular i.e. they take place only once"
  {:db/ident :dpvo/SingularFrequency,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Frequency where occurences are singular i.e. they take place only once",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Singular Frequency",
   :rdfs/subClassOf [:dpvo/Frequency :dpvo/SingularFrequency :dpvo/Context],
   :vs/term_status "modified"})

(def SingularScaleOfDataSubjects
  "Scale of data subjects considered singular i.e. a specific data subject"
  {:db/ident :dpvo/SingularScaleOfDataSubjects,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Scale of data subjects considered singular i.e. a specific data subject",
   :rdf/type [:dpvo/DataSubjectScale
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/Scale
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Singular Scale Of Data Subjects",
   :vs/term_status "accepted"})

(def SmallDataVolume
  "Data volume that is considered small or limited within the context"
  {:db/ident :dpvo/SmallDataVolume,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Data volume that is considered small or limited within the context",
   :rdf/type [:dpvo/DataVolume
              :owl/NamedIndividual
              :dpvo/Scale
              :dpvo/ProcessingContext
              :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Small Data Volume",
   :vs/term_status "accepted"})

(def SmallScaleOfDataSubjects
  "Scale of data subjects considered small or limited within the context"
  {:db/ident :dpvo/SmallScaleOfDataSubjects,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Scale of data subjects considered small or limited within the context",
   :rdf/type [:dpvo/DataSubjectScale
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/Scale
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Small Scale Of Data Subjects",
   :vs/term_status "accepted"})

(def SmallScaleProcessing
  "Processing that takes place at small scales (as specified by some criteria)"
  {:db/ident :dpvo/SmallScaleProcessing,
   :dcterms/created #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Processing that takes place at small scales (as specified by some criteria)",
   :rdf/type [:dpvo/ProcessingScale
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/ProcessingContext
              :dpvo/Scale],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Small Scale Processing",
   :vs/term_status "accepted"})

(def SocialMediaMarketing
  "Purposes associated with conducting marketing through social media"
  {:db/ident :dpvo/SocialMediaMarketing,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit" "Beatriz Esteves"],
   :dcterms/description
   "Purposes associated with conducting marketing through social media",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Social Media Marketing",
   :rdfs/subClassOf [:dpvo/Marketing :dpvo/SocialMediaMarketing :dpvo/Purpose],
   :vs/term_status "accepted"})

(def SpecialCategoryPersonalData
  "Sensitive Personal Data whose use requires specific legal permission or justification"
  {:db/ident :dpvo/SpecialCategoryPersonalData,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Sensitive Personal Data whose use requires specific legal permission or justification",
   :dcterms/modified #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_9/par_1/oj",
   :rdf/type :owl/Class,
   :rdfs/comment
   "The term 'special category' is based on GDPR Art.9, but should not be considered as exlusive to it. DPV considers all Special Categories to also be Sensitive, but whose use is either prohibited or regulated and therefore requires additional legal basis for justification.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Special Category Personal Data",
   :rdfs/subClassOf [:dpvo/SensitivePersonalData
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo/Data
                     :dpvo/PersonalData],
   :vs/term_status "modified"})

(def SporadicDataVolume
  "Data volume that is considered sporadic or sparse within the context"
  {:db/ident :dpvo/SporadicDataVolume,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Data volume that is considered sporadic or sparse within the context",
   :rdf/type [:owl/NamedIndividual
              :dpvo/DataVolume
              :dpvo/Scale
              :dpvo/ProcessingContext
              :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Sporadic Data Volume",
   :vs/term_status "accepted"})

(def SporadicFrequency
  "Frequency where occurences are sporadic or infrequent or sparse"
  {:db/ident :dpvo/SporadicFrequency,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Frequency where occurences are sporadic or infrequent or sparse",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Sporadic Frequency",
   :rdfs/subClassOf [:dpvo/Frequency :dpvo/SporadicFrequency :dpvo/Context],
   :vs/term_status "modified"})

(def SporadicScaleOfDataSubjects
  "Scale of data subjects considered sporadic or sparse within the context"
  {:db/ident :dpvo/SporadicScaleOfDataSubjects,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Scale of data subjects considered sporadic or sparse within the context",
   :rdf/type [:dpvo/DataSubjectScale
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/Scale
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Sporadic Scale Of Data Subjects",
   :vs/term_status "accepted"})

(def StaffTraining
  "Practices and policies regarding training of staff members"
  {:db/ident :dpvo/StaffTraining,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Rob Brennan" "Mark Lizar" "Axel Polleres" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Practices and policies regarding training of staff members",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Staff Training",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/StaffTraining
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def Status
  "The status or state of something"
  {:db/ident            :dpvo/Status,
   :dcterms/created     #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "The status or state of something",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Status",
   :rdfs/subClassOf     [:dpvo/Context :dpvo/Status],
   :vs/term_status      "accepted"})

(def StorageCondition
  "Conditions required or followed regarding storage of data"
  {:db/ident :dpvo/StorageCondition,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Axel Polleres" "Mark Lizar" "Rob Brennan"],
   :dcterms/description
   "Conditions required or followed regarding storage of data",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Storage Condition",
   :rdfs/subClassOf
   [:dpvo/ProcessingContext :dpvo/StorageCondition :dpvo/Context],
   :vs/term_status "accepted"})

(def StorageDeletion
  "Deletion or Erasure of data including any deletion guarantees"
  {:db/ident :dpvo/StorageDeletion,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Mark Lizar" "Axel Polleres" "Rob Brennan"],
   :dcterms/description
   "Deletion or Erasure of data including any deletion guarantees",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Storage Deletion",
   :rdfs/subClassOf [:dpvo/StorageCondition
                     :dpvo/StorageDeletion
                     :dpvo/Context
                     :dpvo/ProcessingContext],
   :vs/term_status "accepted"})

(def StorageDuration
  "Duration or temporal limitation on storage of personal data"
  {:db/ident :dpvo/StorageDuration,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Mark Lizar" "Rob Brennan" "Axel Polleres"],
   :dcterms/description
   "Duration or temporal limitation on storage of personal data",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Storage Duration",
   :rdfs/subClassOf [:dpvo/StorageCondition
                     :dpvo/Duration
                     :dpvo/StorageDuration
                     :dpvo/Context
                     :dpvo/ProcessingContext],
   :vs/term_status "accepted"})

(def StorageLocation
  "Location or geospatial scope where the data is stored"
  {:db/ident            :dpvo/StorageLocation,
   :dcterms/created     #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator     ["Rob Brennan"
                         "Harshvardhan J. Pandit"
                         "Axel Polleres"
                         "Mark Lizar"],
   :dcterms/description "Location or geospatial scope where the data is stored",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Storage Location",
   :rdfs/subClassOf     [:dpvo/StorageCondition
                         :dpvo/Location
                         :dpvo/StorageLocation
                         :dpvo/Context
                         :dpvo/ProcessingContext],
   :vs/term_status      "accepted"})

(def StorageRestoration
  "Regularity and temporal span of data restoration/backup mechanisms that guarantee that data is preserved"
  {:db/ident :dpvo/StorageRestoration,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Mark Lizar" "Axel Polleres" "Harshvardhan J. Pandit" "Rob Brennan"],
   :dcterms/description
   "Regularity and temporal span of data restoration/backup mechanisms that guarantee that data is preserved",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Storage Restoration",
   :rdfs/subClassOf [:dpvo/StorageCondition
                     :dpvo/StorageRestoration
                     :dpvo/Context
                     :dpvo/ProcessingContext],
   :vs/term_status "accepted"})

(def Store
  "to keep data for future use"
  {:db/ident :dpvo/Store,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description "to keep data for future use",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Store",
   :rdfs/subClassOf [:dpvo/Processing :dpvo/Store],
   :vs/term_status "accepted"})

(def Structure
  "to arrange data according to a structure"
  {:db/ident :dpvo/Structure,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description "to arrange data according to a structure",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Structure",
   :rdfs/subClassOf [:dpvo/Organise :dpvo/Structure :dpvo/Processing],
   :vs/term_status "accepted"})

(def Student
  "Data subjects that are students"
  {:db/ident            :dpvo/Student,
   :dcterms/created     #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     ["Beatriz Esteves"
                         "Georg P. Krog"
                         "Julian Flake"
                         "Paul Ryan"
                         "Harshvardhan J. Pandit"],
   :dcterms/description "Data subjects that are students",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Student",
   :rdfs/subClassOf     [:dpvo/DataSubject
                         :dpvo/Student
                         :dpvo/Entity
                         :dpvo/NaturalPerson
                         :dpvo/LegalEntity],
   :vs/term_status      "accepted"})

(def SubProcessorAgreement
  "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between a Data Processor and a Data (Sub-)Processor"
  {:db/ident :dpvo/SubProcessorAgreement,
   :dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator ["Julian Flake"
                     "Beatriz Esteves"
                     "Harshvardhan J. Pandit"
                     "Georg P Krog"
                     "Paul Ryan"],
   :dcterms/description
   "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between a Data Processor and a Data (Sub-)Processor",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Sub-Processor Agreement",
   :rdfs/subClassOf [:dpvo/DataProcessingAgreement
                     :dpvo/SubProcessorAgreement
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/LegalAgreement],
   :vs/term_status "accepted"})

(def Subscriber
  "Data subjects that subscribe to service(s)"
  {:db/ident            :dpvo/Subscriber,
   :dcterms/created     #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit"
                         "Beatriz Esteves"
                         "Julian Flake"
                         "Georg P. Krog"
                         "Paul Ryan"],
   :dcterms/description "Data subjects that subscribe to service(s)",
   :rdf/type            :owl/Class,
   :rdfs/comment        "note: subscriber can be customer or consumer",
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Subscriber",
   :rdfs/subClassOf     [:dpvo/DataSubject
                         :dpvo/Subscriber
                         :dpvo/Entity
                         :dpvo/NaturalPerson
                         :dpvo/LegalEntity],
   :vs/term_status      "accepted"})

(def SupraNationalAuthority
  "An authority tasked with overseeing legal compliance for a supra-national union e.g. EU"
  {:db/ident :dpvo/SupraNationalAuthority,
   :dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "An authority tasked with overseeing legal compliance for a supra-national union e.g. EU",
   :dcterms/source "http://purl.org/adms",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Supra-National Authority",
   :rdfs/subClassOf [:dpvo/Authority
                     :dpvo/SupraNationalAuthority
                     :dpvo/GovernmentalOrganisation
                     :dpvo/Organisation
                     :dpvo/Entity
                     :dpvo/LegalEntity],
   :vs/term_status "accepted"})

(def SupraNationalUnion
  "A political union of two or more countries with an establishment of common authority"
  {:db/ident :dpvo/SupraNationalUnion,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A political union of two or more countries with an establishment of common authority",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Supranational Union",
   :rdfs/subClassOf [:dpvo/Location :dpvo/SupraNationalUnion],
   :vs/term_status "accepted"})

(def SymmetricCryptography
  "Use of cryptography where the same keys are utilised for encryption and descryption of information"
  {:db/ident :dpvo/SymmetricCryptography,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Use of cryptography where the same keys are utilised for encryption and descryption of information",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Symmetric Cryptography",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/SymmetricCryptography
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def SymmetricEncryption
  "Use of symmetric cryptography to encrypt data"
  {:db/ident :dpvo/SymmetricEncryption,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Use of symmetric cryptography to encrypt data",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Symmetric Encryption",
   :rdfs/subClassOf [:dpvo/Encryption
                     :dpvo/SymmetricEncryption
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def SyntheticData
  "Synthetic data reffers to artificially created data such that it is intended to resemble real data (personal or non-personal), but does not refer to any specific identified or identifiable individual, or to the real measure of an observable parameter in the case of non-personal data"
  {:db/ident :dpvo/SyntheticData,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Synthetic data reffers to artificially created data such that it is intended to resemble real data (personal or non-personal), but does not refer to any specific identified or identifiable individual, or to the real measure of an observable parameter in the case of non-personal data",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Synthetic Data",
   :rdfs/subClassOf [:dpvo/Data :dpvo/SyntheticData],
   :vs/term_status "accepted"})

(def SystematicMonitoring
  "Processing that involves systematic monitoring of individuals"
  {:db/ident :dpvo/SystematicMonitoring,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Piero Bonatti" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Processing that involves systematic monitoring of individuals",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Systematic Monitoring",
   :rdfs/subClassOf
   [:dpvo/ProcessingContext :dpvo/SystematicMonitoring :dpvo/Context],
   :vs/term_status "accepted"})

(def TargetedAdvertising
  "Purposes associated with creating and providing pesonalised advertisement where the personalisation is targeted to a specific individual or group of individuals"
  {:db/ident :dpvo/TargetedAdvertising,
   :dcterms/created #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Purposes associated with creating and providing pesonalised advertisement where the personalisation is targeted to a specific individual or group of individuals",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Targeted Advertising",
   :rdfs/subClassOf [:dpvo/PersonalisedAdvertising
                     :dpvo/TargetedAdvertising
                     :dpvo/Marketing
                     :dpvo/Personalisation
                     :dpvo/Purpose
                     :dpvo/Advertising],
   :vs/term_status "accepted"})

(def TechnicalMeasure
  "Technical measures required/followed when processing data of the declared category"
  {:db/ident :dpvo/TechnicalMeasure,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Rob Brennan" "Mark Lizar" "Harshvardhan J. Pandit" "Axel Polleres"],
   :dcterms/description
   "Technical measures required/followed when processing data of the declared category",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Technical Measure",
   :rdfs/subClassOf [:dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def TechnicalOrganisationalMeasure
  "The Technical and Organisational measures used."
  {:db/ident            :dpvo/TechnicalOrganisationalMeasure,
   :dcterms/created     #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator     "Bud Bruegger",
   :dcterms/description "The Technical and Organisational measures used.",
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Technical and Organisational Measure",
   :rdfs/subClassOf     :dpvo/TechnicalOrganisationalMeasure,
   :vs/term_status      "accepted"})

(def TechnicalServiceProvision
  "Purposes associated with managing and providing technical processes and functions necessary for delivering services"
  {:db/ident :dpvo/TechnicalServiceProvision,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Purposes associated with managing and providing technical processes and functions necessary for delivering services",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Technical Service Provision",
   :rdfs/subClassOf
   [:dpvo/ServiceProvision :dpvo/TechnicalServiceProvision :dpvo/Purpose],
   :vs/term_status "accepted"})

(def Technology
  "The technology, technological implementation, or any techniques, skills, methods, and processes used or applied"
  {:db/ident :dpvo/Technology,
   :dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The technology, technological implementation, or any techniques, skills, methods, and processes used or applied",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Examples (non-exhaustive) include: Algorithm, Process, Method, Skill, Database, Cookies, Server, Device",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Technology",
   :vs/term_status "accepted"})

(def TemporalDuration
  "Duration that has a fixed temporal duration e.g. 6 months"
  {:db/ident :dpvo/TemporalDuration,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Duration that has a fixed temporal duration e.g. 6 months",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Temporal Duration",
   :rdfs/subClassOf [:dpvo/Duration :dpvo/TemporalDuration :dpvo/Context],
   :vs/term_status "modified"})

(def ThirdCountry
  "Represents a country outside applicable or compatible jurisdiction as outlined in law"
  {:db/ident :dpvo/ThirdCountry,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Represents a country outside applicable or compatible jurisdiction as outlined in law",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Third Country",
   :rdfs/subClassOf [:dpvo/Country :dpvo/ThirdCountry :dpvo/Location],
   :vs/term_status "accepted"})

(def ThirdParty
  "A ‘third party’ means a natural or legal person, public authority, agency or body other than the data subject, controller, processor and people who, under the direct authority of the controller or processor, are authorised to process personal data."
  {:db/ident :dpvo/ThirdParty,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A ‘third party’ means a natural or legal person, public authority, agency or body other than the data subject, controller, processor and people who, under the direct authority of the controller or processor, are authorised to process personal data.",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_10/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Third Party",
   :rdfs/subClassOf
   [:dpvo/Recipient :dpvo/ThirdParty :dpvo/Entity :dpvo/LegalEntity],
   :vs/term_status "accepted"})

(def ThirdPartyAgreement
  "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between a Data Controller or Processor and a Third Party"
  {:db/ident :dpvo/ThirdPartyAgreement,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between a Data Controller or Processor and a Third Party",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Third-Party Agreement",
   :rdfs/subClassOf [:dpvo/DataProcessingAgreement
                     :dpvo/ThirdPartyAgreement
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/LegalAgreement],
   :vs/term_status "accepted"})

(def ThirdPartySecurityProcedures
  "Procedures related to security associated with Third Parties"
  {:db/ident :dpvo/ThirdPartySecurityProcedures,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Procedures related to security associated with Third Parties",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Third Party Security Procedures",
   :rdfs/subClassOf [:dpvo/SecurityProcedure
                     :dpvo/ThirdPartySecurityProcedures
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def Tourist
  "Data subjects that are tourists i.e. not citizens and not immigrants"
  {:db/ident :dpvo/Tourist,
   :dcterms/created #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator ["Beatriz Esteves"
                     "Julian Flake"
                     "Georg P. Krog"
                     "Harshvardhan J. Pandit"
                     "Paul Ryan"],
   :dcterms/description
   "Data subjects that are tourists i.e. not citizens and not immigrants",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Tourist",
   :rdfs/subClassOf [:dpvo/DataSubject
                     :dpvo/Tourist
                     :dpvo/Entity
                     :dpvo/NaturalPerson
                     :dpvo/LegalEntity],
   :vs/term_status "accepted"})

(def Transfer
  "to move data from one place to another"
  {:db/ident :dpvo/Transfer,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description "to move data from one place to another",
   :dcterms/source "https://specialprivacy.ercim.eu/vocabs/processing",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Transfer",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/processing#Transfer"],
   :rdfs/subClassOf [:dpvo/Processing :dpvo/Transfer],
   :vs/term_status "accepted"})

(def Transform
  "to change the form or nature of data"
  {:db/ident :dpvo/Transform,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description "to change the form or nature of data",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Transform",
   :rdfs/subClassOf [:dpvo/Processing :dpvo/Transform],
   :vs/term_status "accepted"})

(def Transmit
  "to send out data"
  {:db/ident :dpvo/Transmit,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description "to send out data",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Transmit",
   :rdfs/subClassOf [:dpvo/Disclose :dpvo/Transmit :dpvo/Processing],
   :vs/term_status "accepted"})

(def TrustedComputing
  "Use of cryptographic methods to restrict access and execution to trusted parties and code"
  {:db/ident :dpvo/TrustedComputing,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Use of cryptographic methods to restrict access and execution to trusted parties and code",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Trusted Computing",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/TrustedComputing
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def TrustedExecutionEnvironments
  "Use of cryptographic methods to restrict access and execution to trusted parties and code within a dedicated execution environment"
  {:db/ident :dpvo/TrustedExecutionEnvironments,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Use of cryptographic methods to restrict access and execution to trusted parties and code within a dedicated execution environment",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Trusted Execution Environments",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/TrustedExecutionEnvironments
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def TrustedThirdPartyUtilisation
  "Utilisation of a trusted third party to provide or carry out a measure"
  {:db/ident :dpvo/TrustedThirdPartyUtilisation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Utilisation of a trusted third party to provide or carry out a measure",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Trusted Third Party Utilisation",
   :rdfs/subClassOf [:dpvo/SecurityProcedure
                     :dpvo/TrustedThirdPartyUtilisation
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def UninformedConsent
  "Consent that is uninformed i.e. without requirement to provide sufficient information to make a consenting decision"
  {:db/ident :dpvo/UninformedConsent,
   :dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Julian Flake" "Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description
   "Consent that is uninformed i.e. without requirement to provide sufficient information to make a consenting decision",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Uninformed Consent",
   :rdfs/subClassOf [:dpvo/Consent :dpvo/UninformedConsent :dpvo/LegalBasis],
   :vs/term_status "accepted"})

(def Unlawful
  "State of being unlawful or legally non-compliant"
  {:db/ident            :dpvo/Unlawful,
   :dcterms/created     #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "State of being unlawful or legally non-compliant",
   :rdf/type            [:owl/NamedIndividual
                         :dpvo/Lawfulness
                         :dpvo/ComplianceStatus
                         :dpvo/Status
                         :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Unlawful",
   :vs/term_status      "accepted"})

(def UntilEventDuration
  "Duration that takes place until a specific event occurs e.g. Account Closure"
  {:db/ident :dpvo/UntilEventDuration,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Duration that takes place until a specific event occurs e.g. Account Closure",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Until Event Duration",
   :rdfs/subClassOf [:dpvo/Duration :dpvo/UntilEventDuration :dpvo/Context],
   :vs/term_status "modified"})

(def UntilTimeDuration
  "Duration that has a fixed end date e.g. 2022-12-31"
  {:db/ident            :dpvo/UntilTimeDuration,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Duration that has a fixed end date e.g. 2022-12-31",
   :dcterms/modified    #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Until Time Duration",
   :rdfs/subClassOf     [:dpvo/Duration :dpvo/UntilTimeDuration :dpvo/Context],
   :vs/term_status      "modified"})

(def UnverifiedData
  "Data that has not been verified in terms of accuracy, inconsistency, or quality"
  {:db/ident :dpvo/UnverifiedData,
   :dcterms/created #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Data that has not been verified in terms of accuracy, inconsistency, or quality",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Unverified Data",
   :rdfs/subClassOf [:dpvo/Data :dpvo/UnverifiedData],
   :vs/term_status "accepted"})

(def UsageControl
  "Management of usage, which is intended to be broader than access control and may cover trust, digital rights, or other relevant controls"
  {:db/ident :dpvo/UsageControl,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Management of usage, which is intended to be broader than access control and may cover trust, digital rights, or other relevant controls",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Usage Control",
   :rdfs/subClassOf [:dpvo/AccessControlMethod
                     :dpvo/UsageControl
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def Use
  "to use data"
  {:db/ident :dpvo/Use,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description "to use data",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Use",
   :rdfs/subClassOf [:dpvo/Processing :dpvo/Use],
   :vs/term_status "accepted"})

(def UseSyntheticData
  "Use of synthetic data to preserve privacy, security, or other effects and side-effects"
  {:db/ident :dpvo/UseSyntheticData,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Use of synthetic data to preserve privacy, security, or other effects and side-effects",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Use of Synthetic Data",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/UseSyntheticData
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def User
  "Data subjects that use service(s)"
  {:db/ident            :dpvo/User,
   :dcterms/created     #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     ["Paul Ryan"
                         "Julian Flake"
                         "Beatriz Esteves"
                         "Harshvardhan J. Pandit"
                         "Georg P. Krog"],
   :dcterms/description "Data subjects that use service(s)",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "User",
   :rdfs/subClassOf     [:dpvo/DataSubject
                         :dpvo/User
                         :dpvo/Entity
                         :dpvo/NaturalPerson
                         :dpvo/LegalEntity],
   :vs/term_status      "accepted"})

(def UserInterfacePersonalisation
  "Purposes associated with personalisation of interfaces presented to the user"
  {:db/ident :dpvo/UserInterfacePersonalisation,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Simon Steyskal"
                     "Fajar Ekaputra"
                     "Harshvardhan J. Pandit"
                     "Elmar Kiesling"
                     "Javier Fernandez"
                     "Axel Polleres"],
   :dcterms/description
   "Purposes associated with personalisation of interfaces presented to the user",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Examples of user-interface personalisation include changing the language to match the locale",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "User Interface Personalisation",
   :rdfs/subClassOf [:dpvo/ServicePersonalisation
                     :dpvo/UserInterfacePersonalisation
                     :dpvo/Personalisation
                     :dpvo/Purpose
                     :dpvo/ServiceProvision],
   :vs/term_status "accepted"})

(def VariableLocation
  "Location that is known but is variable e.g. somewhere within a given area"
  {:db/ident :dpvo/VariableLocation,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Location that is known but is variable e.g. somewhere within a given area",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Variable Location",
   :rdfs/subClassOf [:dpvo/LocationFixture :dpvo/VariableLocation],
   :vs/term_status "modified"})

(def VendorManagement
  "Purposes associated with manage orders, payment, evaluation, and prospecting related to vendors"
  {:db/ident :dpvo/VendorManagement,
   :dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "David Hickey" "Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Purposes associated with manage orders, payment, evaluation, and prospecting related to vendors",
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Vendor Management",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/VendorManagement],
   :vs/term_status "accepted"})

(def VendorPayment
  "Purposes associated with managing payment of vendors"
  {:db/ident :dpvo/VendorPayment,
   :dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Paul Ryan" "David Hickey" "Georg P Krog"],
   :dcterms/description "Purposes associated with managing payment of vendors",
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Vendor Payment",
   :rdfs/subClassOf [:dpvo/VendorManagement :dpvo/VendorPayment :dpvo/Purpose],
   :vs/term_status "accepted"})

(def VendorRecordsManagement
  "Purposes associated with managing records and orders related to vendors"
  {:db/ident :dpvo/VendorRecordsManagement,
   :dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J. Pandit" "David Hickey" "Georg P Krog"],
   :dcterms/description
   "Purposes associated with managing records and orders related to vendors",
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Vendor Records Management",
   :rdfs/subClassOf
   [:dpvo/VendorManagement :dpvo/VendorRecordsManagement :dpvo/Purpose],
   :vs/term_status "accepted"})

(def VendorSelectionAssessment
  "Purposes associated with managing selection, assessment, and evaluation related to vendors"
  {:db/ident :dpvo/VendorSelectionAssessment,
   :dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "David Hickey" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Purposes associated with managing selection, assessment, and evaluation related to vendors",
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Vendor Selection Assessment",
   :rdfs/subClassOf
   [:dpvo/VendorManagement :dpvo/VendorSelectionAssessment :dpvo/Purpose],
   :vs/term_status "accepted"})

(def VerifiedData
  "Data that has been verified in terms of accuracy, inconsistency, or quality"
  {:db/ident :dpvo/VerifiedData,
   :dcterms/created #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Data that has been verified in terms of accuracy, inconsistency, or quality",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Verified Data",
   :rdfs/subClassOf [:dpvo/Data :dpvo/VerifiedData],
   :vs/term_status "accepted"})

(def VirtualisationSecurity
  "Security implemented at or through virtualised environments"
  {:db/ident :dpvo/VirtualisationSecurity,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Security implemented at or through virtualised environments",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Virtualisation Security",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/VirtualisationSecurity
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def Visitor
  "Data subjects that are temporary visitors"
  {:db/ident            :dpvo/Visitor,
   :dcterms/created     #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit"
                         "Paul Ryan"
                         "Julian Flake"
                         "Georg P. Krog"
                         "Beatriz Esteves"],
   :dcterms/description "Data subjects that are temporary visitors",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "Visitor",
   :rdfs/subClassOf     [:dpvo/DataSubject
                         :dpvo/Visitor
                         :dpvo/Entity
                         :dpvo/NaturalPerson
                         :dpvo/LegalEntity],
   :vs/term_status      "accepted"})

(def VitalInterest
  "Processing is necessary or required to protect vital interests of a data subject or other natural person"
  {:db/ident :dpvo/VitalInterest,
   :dcterms/created #inst "2021-04-21T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Processing is necessary or required to protect vital interests of a data subject or other natural person",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Vital Interest",
   :rdfs/subClassOf [:dpvo/LegalBasis :dpvo/VitalInterest],
   :vs/term_status "accepted"})

(def VitalInterestOfDataSubject
  "Processing is necessary or required to protect vital interests of a data subject"
  {:db/ident :dpvo/VitalInterestOfDataSubject,
   :dcterms/created #inst "2021-04-21T00:00:00.000-04:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   "Processing is necessary or required to protect vital interests of a data subject",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Vital Interest of Data Subject",
   :rdfs/subClassOf [:dpvo/VitalInterestOfNaturalPerson
                     :dpvo/VitalInterestOfDataSubject
                     :dpvo/LegalBasis
                     :dpvo/VitalInterest],
   :vs/term_status "accepted"})

(def VitalInterestOfNaturalPerson
  "Processing is necessary or required to protect vital interests of a natural person"
  {:db/ident :dpvo/VitalInterestOfNaturalPerson,
   :dcterms/created #inst "2021-04-21T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Processing is necessary or required to protect vital interests of a natural person",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Vital Interest of Natural Person",
   :rdfs/subClassOf
   [:dpvo/VitalInterest :dpvo/VitalInterestOfNaturalPerson :dpvo/LegalBasis],
   :vs/term_status "accepted"})

(def VulnerabilityTestingMethods
  "Methods that assess or discover vulnerabilities in a system"
  {:db/ident :dpvo/VulnerabilityTestingMethods,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Methods that assess or discover vulnerabilities in a system",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Vulnerability Testing Methods",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/VulnerabilityTestingMethods
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def VulnerableDataSubject
  "Data Subjects which should be considered 'vulnerable' and therefore would require additional measures and safeguards"
  {:db/ident :dpvo/VulnerableDataSubject,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan Pandit" "Paul Ryan" "Georg Krog"],
   :dcterms/description
   "Data Subjects which should be considered 'vulnerable' and therefore would require additional measures and safeguards",
   :rdf/type :owl/Class,
   :rdfs/comment
   "This concept denotes a Data Subject or a group are vulnerable, but not what vulnerability they possess or its context. This information can be provided additionally as comments, or as separate concepts and relations. Proposals for this are welcome.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Vulnerable Data Subject",
   :rdfs/subClassOf [:dpvo/DataSubject
                     :dpvo/VulnerableDataSubject
                     :dpvo/Entity
                     :dpvo/NaturalPerson
                     :dpvo/LegalEntity],
   :vs/term_status "accepted"})

(def WebBrowserSecurity
  "Security implemented at or over web browsers"
  {:db/ident :dpvo/WebBrowserSecurity,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Security implemented at or over web browsers",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "WebBrowser Security",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/WebBrowserSecurity
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def WebSecurityProtocols
  "Security implemented at or over web-based protocols"
  {:db/ident :dpvo/WebSecurityProtocols,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Security implemented at or over web-based protocols",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Web Security Protocols",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/WebSecurityProtocols
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def WirelessSecurityProtocols
  "Security implemented at or over wireless communication protocols"
  {:db/ident :dpvo/WirelessSecurityProtocols,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Security implemented at or over wireless communication protocols",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Wireless Security Protocols",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/WirelessSecurityProtocols
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def WithinDevice
  "Location is local and entirely within a device, such as a smartphone"
  {:db/ident :dpvo/WithinDevice,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Location is local and entirely within a device, such as a smartphone",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Within Device",
   :rdfs/subClassOf [:dpvo/LocalLocation
                     :dpvo/WithinDevice
                     :dpvo/LocationLocality
                     :dpvo/Location],
   :vs/term_status "modified"})

(def WithinPhysicalEnvironment
  "Location is local and entirely within a physical environment, such as a room"
  {:db/ident :dpvo/WithinPhysicalEnvironment,
   :dcterms/created #inst "2020-10-06T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Location is local and entirely within a physical environment, such as a room",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Within Physical Environment",
   :rdfs/subClassOf [:dpvo/LocalLocation
                     :dpvo/WithinPhysicalEnvironment
                     :dpvo/LocationLocality
                     :dpvo/Location],
   :vs/term_status "accepted"})

(def WithinVirtualEnvironment
  "Location is local and entirely within a virtual environment, such as a shared network directory"
  {:db/ident :dpvo/WithinVirtualEnvironment,
   :dcterms/created #inst "2020-10-06T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Location is local and entirely within a virtual environment, such as a shared network directory",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Within Virtual Environment",
   :rdfs/subClassOf [:dpvo/LocalLocation
                     :dpvo/WithinVirtualEnvironment
                     :dpvo/LocationLocality
                     :dpvo/Location],
   :vs/term_status "accepted"})

(def ZeroKnowledgeAuthentication
  "Authentication using Zero-Knowledge proofs"
  {:db/ident :dpvo/ZeroKnowledgeAuthentication,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Authentication using Zero-Knowledge proofs",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "Zero Knowledge Authentication",
   :rdfs/subClassOf [:dpvo/AuthenticationProtocols
                     :dpvo/CryptographicMethods
                     :dpvo/ZeroKnowledgeAuthentication
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status "accepted"})

(def hasActivityStatus
  "Indicates the status of activity of specified concept"
  {:db/ident            :dpvo/hasActivityStatus,
   :dcterms/created     #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Indicates the status of activity of specified concept",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has activity status",
   :rdfs/range          :dpvo/ActivityStatus,
   :rdfs/subPropertyOf  [:dpvo/hasStatus :dpvo/hasActivityStatus],
   :vs/term_status      "accepted"})

(def hasAddress
  "Specifies address of a legal entity such as street address or pin code"
  {:db/ident :dpvo/hasAddress,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator
   ["Beatriz Esteves" "Georg P Krog" "Paul Ryan" "Harshvardhan J.Pandit"],
   :dcterms/description
   "Specifies address of a legal entity such as street address or pin code",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Entity,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has address",
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf :dpvo/hasAddress,
   :vs/term_status "accepted"})

(def hasAlgorithmicLogic
  "Indicates the logic used in processing such as for automated decision making"
  {:db/ident :dpvo/hasAlgorithmicLogic,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Georg P. Krog" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Indicates the logic used in processing such as for automated decision making",
   :dcterms/modified #inst "2022-06-15T00:00:00.000-04:00",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has algorithmic logic",
   :rdfs/range :dpvo/AlgorithmicLogic,
   :rdfs/subPropertyOf :dpvo/hasAlgorithmicLogic,
   :vs/term_status "changed"})

(def hasApplicableLaw
  "Indicates applicability of a Law"
  {:db/ident            :dpvo/hasApplicableLaw,
   :dcterms/created     #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Indicates applicability of a Law",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has applicable law",
   :rdfs/range          :dpvo/Law,
   :rdfs/subPropertyOf  :dpvo/hasApplicableLaw,
   :vs/term_status      "accepted"})

(def hasAuditStatus
  "Indicates the status of audit associated with specified concept"
  {:db/ident :dpvo/hasAuditStatus,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Indicates the status of audit associated with specified concept",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has audit status",
   :rdfs/range :dpvo/AuditStatus,
   :rdfs/subPropertyOf [:dpvo/hasStatus :dpvo/hasAuditStatus],
   :vs/term_status "accepted"})

(def hasAuthority
  "Indicates applicability of authority for a jurisdiction"
  {:db/ident :dpvo/hasAuthority,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Indicates applicability of authority for a jurisdiction",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has authority",
   :rdfs/range :dpvo/Authority,
   :rdfs/subPropertyOf :dpvo/hasAuthority,
   :vs/term_status "accepted"})

(def hasComplianceStatus
  "Indicates the status of compliance of specified concept"
  {:db/ident :dpvo/hasComplianceStatus,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Indicates the status of compliance of specified concept",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has compliance status",
   :rdfs/range :dpvo/ComplianceStatus,
   :rdfs/subPropertyOf [:dpvo/hasStatus :dpvo/hasComplianceStatus],
   :vs/term_status "accepted"})

(def hasConsentStatus
  "Specifies the state or status of consent"
  {:db/ident            :dpvo/hasConsentStatus,
   :dcterms/created     #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog"
                         "Julian Flake"
                         "Paul Ryan"
                         "Harshvardhan J. Pandit"],
   :dcterms/description "Specifies the state or status of consent",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has consent status",
   :rdfs/range          :dpvo/ConsentStatus,
   :rdfs/subPropertyOf  :dpvo/hasConsentStatus,
   :vs/term_status      "accepted"})

(def hasConsequence
  "Indicates consenquence(s) possible or arising from specified concept"
  {:db/ident :dpvo/hasConsequence,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit"
                     "Julian Flake"
                     "Georg P Krog"
                     "Fajar Ekaputra"
                     "Beatriz Esteves"],
   :dcterms/description
   "Indicates consenquence(s) possible or arising from specified concept",
   :dcterms/modified #inst "2021-09-21T00:00:00.000-04:00",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "Removed plural suffix for consistency",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has consequence",
   :rdfs/range :dpvo/Consequence,
   :rdfs/subPropertyOf :dpvo/hasConsequence,
   :vs/term_status "accepted"})

(def hasConsequenceOn
  "Indicates the thing (e.g. plan, process, or entity) affected by a consequence"
  {:db/ident :dpvo/hasConsequenceOn,
   :dcterms/created #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   "Indicates the thing (e.g. plan, process, or entity) affected by a consequence",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :dpvo/Consequence,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has consequence on",
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf :dpvo/hasConsequenceOn,
   :vs/term_status "accepted"})

(def hasContact
  "Specifies contact details of a legal entity such as phone or email"
  {:db/ident :dpvo/hasContact,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J.Pandit" "Beatriz Esteves" "Georg P Krog"],
   :dcterms/description
   "Specifies contact details of a legal entity such as phone  or email",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Entity,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has contact",
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf :dpvo/hasContact,
   :vs/term_status "accepted"})

(def hasContext
  "Indicates a purpose is restricted to the specified context(s)"
  {:db/ident :dpvo/hasContext,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/description
   "Indicates a purpose is restricted to the specified context(s)",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has context",
   :rdfs/range :dpvo/Context,
   :rdfs/subPropertyOf :dpvo/hasContext,
   :vs/term_status "accepted"})

(def hasCountry
  "Indicates applicability of specified country"
  {:db/ident            :dpvo/hasCountry,
   :dcterms/created     #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description "Indicates applicability of specified country",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has country",
   :rdfs/range          :dpvo/Country,
   :rdfs/subPropertyOf  [:dpvo/hasLocation :dpvo/hasCountry],
   :vs/term_status      "accepted"})

(def hasData
  "Indicates associated with Data (may or may not be personal)"
  {:db/ident :dpvo/hasData,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Indicates associated with Data (may or may not be personal)",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has data",
   :rdfs/range :dpvo/Data,
   :rdfs/subPropertyOf :dpvo/hasData,
   :vs/term_status "accepted"})

(def hasDataController
  "Indicates association with Data Controller"
  {:db/ident            :dpvo/hasDataController,
   :dcterms/created     #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator     ["Javier Fernández"
                         "Harshvardhan J. Pandit"
                         "Bud Bruegger"
                         "Mark Lizar"
                         "Axel Polleres"],
   :dcterms/description "Indicates association with Data Controller",
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has data controller",
   :rdfs/range          [:dpvo/DataController :dpvo/LegalEntity],
   :rdfs/subPropertyOf  [:dpvo/hasEntity :dpvo/hasDataController],
   :vs/term_status      "accepted"})

(def hasDataExporter
  "Indiciates inclusion or applicability of a LegalEntity in the role of Data Exporter"
  {:db/ident :dpvo/hasDataExporter,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Paul Ryan" "Georg P. Krog"],
   :dcterms/description
   "Indiciates inclusion or applicability of a LegalEntity in the role of Data Exporter",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has data exporter",
   :rdfs/range :dpvo/DataExporter,
   :rdfs/subPropertyOf [:dpvo/hasEntity :dpvo/hasDataExporter],
   :vs/term_status "accepted"})

(def hasDataImporter
  "Indiciates inclusion or applicability of a LegalEntity in the role of Data Importer"
  {:db/ident :dpvo/hasDataImporter,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Paul Ryan" "Georg P. Krog"],
   :dcterms/description
   "Indiciates inclusion or applicability of a LegalEntity in the role of Data Importer",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has data importer",
   :rdfs/range :dpvo/DataImporter,
   :rdfs/subPropertyOf
   [:dpvo/hasRecipient :dpvo/hasDataImporter :dpvo/hasEntity],
   :vs/term_status "accepted"})

(def hasDataProcessor
  "Indiciates inclusion or applicability of a Data Processor"
  {:db/ident :dpvo/hasDataProcessor,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Paul Ryan" "Georg P. Krog"],
   :dcterms/description
   "Indiciates inclusion or applicability of a Data Processor",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has data processor",
   :rdfs/range :dpvo/DataProcessor,
   :rdfs/subPropertyOf
   [:dpvo/hasRecipient :dpvo/hasDataProcessor :dpvo/hasEntity],
   :vs/term_status "accepted"})

(def hasDataProtectionOfficer
  "Specifices an associated data protection officer"
  {:db/ident            :dpvo/hasDataProtectionOfficer,
   :dcterms/created     #inst "2022-03-02T00:00:00.000-05:00",
   :dcterms/creator     ["Paul Ryan" "Rob Brennan"],
   :dcterms/description "Specifices an associated data protection officer",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has data protection officer",
   :rdfs/range          :dpvo/DataProtectionOfficer,
   :rdfs/subPropertyOf  [:dpvo/hasRepresentative
                         :dpvo/hasDataProtectionOfficer
                         :dpvo/hasEntity],
   :vs/term_status      "accepted"})

(def hasDataSource
  "Indicates the source or origin of data being processed"
  {:db/ident :dpvo/hasDataSource,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Paul Ryan" "Georg P. Krog"],
   :dcterms/description
   "Indicates the source or origin of data being processed",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has data source",
   :rdfs/range :dpvo/DataSource,
   :rdfs/subPropertyOf :dpvo/hasDataSource,
   :vs/term_status "accepted"})

(def hasDataSubject
  "Indicates association with Data Subject"
  {:db/ident            :dpvo/hasDataSubject,
   :dcterms/created     #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator     ["Javier Fernández"
                         "Harshvardhan J. Pandit"
                         "Axel Polleres"
                         "Bud Bruegger"
                         "Mark Lizar"],
   :dcterms/description "Indicates association with Data Subject",
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has data subject",
   :rdfs/range          :dpvo/DataSubject,
   :rdfs/subPropertyOf  [:dpvo/hasEntity :dpvo/hasDataSubject],
   :vs/term_status      "accepted"})

(def hasDataSubjectScale
  "Indicates the scale of data subjects"
  {:db/ident            :dpvo/hasDataSubjectScale,
   :dcterms/created     #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Indicates the scale of data subjects",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has data subject scale",
   :rdfs/range          :dpvo/DataSubjectScale,
   :rdfs/subPropertyOf  [:dpvo/hasScale :dpvo/hasDataSubjectScale],
   :vs/term_status      "accepted"})

(def hasDataVolume
  "Indicates the volume of data"
  {:db/ident            :dpvo/hasDataVolume,
   :dcterms/created     #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Indicates the volume of data",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has data volume",
   :rdfs/range          :dpvo/DataVolume,
   :rdfs/subPropertyOf  [:dpvo/hasScale :dpvo/hasDataVolume],
   :vs/term_status      "accepted"})

(def hasDuration
  "Indicates information about duration"
  {:db/ident            :dpvo/hasDuration,
   :dcterms/created     #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator     ["Rob Brennan"
                         "Mark Lizar"
                         "Axel Polleres"
                         "Harshvardhan J. Pandit"],
   :dcterms/description "Indicates information about duration",
   :dcterms/source      "https://specialprivacy.ercim.eu/",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has duration",
   :rdfs/range          :dpvo/Duration,
   :rdfs/subPropertyOf  :dpvo/hasDuration,
   :vs/term_status      "accepted"})

(def hasEntity
  "Indicates inclusion or applicability of an entity to some concept"
  {:db/ident :dpvo/hasEntity,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Indicates inclusion or applicability of an entity to some concept",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "parent property for controller, processor, data subject, authority, etc.?",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has entity",
   :rdfs/range :dpvo/Entity,
   :rdfs/subPropertyOf :dpvo/hasEntity,
   :vs/term_status "accepted"})

(def hasFrequency
  "Indicates the frequency with which something takes place"
  {:db/ident :dpvo/hasFrequency,
   :dcterms/created #inst "2022-02-16T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Indicates the frequency with which something takes place",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has frequency",
   :rdfs/range :dpvo/Frequency,
   :rdfs/subPropertyOf :dpvo/hasFrequency,
   :vs/term_status "accepted"})

(def hasGeographicCoverage
  "Indicate the geographic coverage (of specified context)"
  {:db/ident :dpvo/hasGeographicCoverage,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Indicate the geographic coverage (of specified context)",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has geographic coverage",
   :rdfs/range :dpvo/GeographicCoverage,
   :rdfs/subPropertyOf [:dpvo/hasScale :dpvo/hasGeographicCoverage],
   :vs/term_status "accepted"})

(def hasHumanInvolvement
  "Indicates Involvement of humans in processing such as within automated decision making process"
  {:db/ident :dpvo/hasHumanInvolvement,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P. Krog"],
   :dcterms/description
   "Indicates Involvement of humans in processing such as within automated decision making process",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment "Human involvement is also relevant to 'human in the loop'",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has human involvement",
   :rdfs/range :dpvo/HumanInvolvement,
   :rdfs/subPropertyOf :dpvo/hasHumanInvolvement,
   :vs/term_status "accepted"})

(def hasIdentifier
  "Indicates an identifier associated for identification or reference"
  {:db/ident :dpvo/hasIdentifier,
   :dcterms/created #inst "2020-11-25T00:00:00.000-05:00",
   :dcterms/creator
   ["Harshvardhan J.Pandit" "Georg P Krog" "Paul Ryan" "Beatriz Esteves"],
   :dcterms/description
   "Indicates an identifier associated for identification or reference",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has identifier",
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf :dpvo/hasIdentifier,
   :vs/term_status "accepted"})

(def hasImpact
  "Indicates impact(s) possible or arising as consequences from specified concept"
  {:db/ident :dpvo/hasImpact,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog"
                     "Harshvardhan J. Pandit"
                     "Fajar Ekaputra"
                     "Beatriz Esteves"
                     "Julian Flake"],
   :dcterms/description
   "Indicates impact(s) possible or arising as consequences from specified concept",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has impact",
   :rdfs/range :dpvo/Impact,
   :rdfs/subPropertyOf [:dpvo/hasConsequence :dpvo/hasImpact],
   :vs/term_status "accepted"})

(def hasImpactOn
  "Indicates the thing (e.g. plan, process, or entity) affected by an impact"
  {:db/ident :dpvo/hasImpactOn,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog"
                     "Harshvardhan J. Pandit"
                     "Julian Flake"
                     "Fajar Ekaputra"
                     "Beatriz Esteves"],
   :dcterms/description
   "Indicates the thing (e.g. plan, process, or entity) affected by an impact",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :dpvo/Impact,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has impact on",
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf [:dpvo/hasConsequenceOn :dpvo/hasImpactOn],
   :vs/term_status "accepted"})

(def hasIndicationMethod
  "Specifies the method by which an entity has indicated the specific context"
  {:db/ident :dpvo/hasIndicationMethod,
   :dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Harshvardhan J. Pandit" "Julian Flake"],
   :dcterms/description
   "Specifies the method by which an entity has indicated the specific context",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has indication method",
   :rdfs/subPropertyOf :dpvo/hasIndicationMethod,
   :vs/term_status "accepted"})

(def hasJointDataControllers
  "Indicates inclusion or applicability of a Joint Data Controller"
  {:db/ident :dpvo/hasJointDataControllers,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P. Krog"],
   :dcterms/description
   "Indicates inclusion or applicability of a Joint Data Controller",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has joint data controllers",
   :rdfs/range :dpvo/JointDataControllers,
   :rdfs/subPropertyOf
   [:dpvo/hasDataController :dpvo/hasJointDataControllers :dpvo/hasEntity],
   :vs/term_status "accepted"})

(def hasJurisdiction
  "Indicates applicability of specified jurisdiction"
  {:db/ident            :dpvo/hasJurisdiction,
   :dcterms/created     #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Indicates applicability of specified jurisdiction",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has jurisdiction",
   :rdfs/range          :dpvo/Location,
   :rdfs/subPropertyOf  :dpvo/hasJurisdiction,
   :vs/term_status      "accepted"})

(def hasJustification
  "Indicates a justification for specified concept or context"
  {:db/ident :dpvo/hasJustification,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Indicates a justification for specified concept or context",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has justification",
   :rdfs/range :dpvo/Justification,
   :rdfs/subPropertyOf :dpvo/hasJustification,
   :vs/term_status "accepted"})

(def hasLawfulness
  "Indicates the status of being lawful or legally compliant"
  {:db/ident :dpvo/hasLawfulness,
   :dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Indicates the status of being lawful or legally compliant",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has lawfulness",
   :rdfs/range :dpvo/Lawfulness,
   :rdfs/subPropertyOf
   [:dpvo/hasComplianceStatus :dpvo/hasLawfulness :dpvo/hasStatus],
   :vs/term_status "accepted"})

(def hasLegalBasis
  "Indicates use or applicability of a Legal Basis"
  {:db/ident            :dpvo/hasLegalBasis,
   :dcterms/created     #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator     ["Axel Polleres" "Javier Fernández"],
   :dcterms/description "Indicates use or applicability of a Legal Basis",
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has legal basis",
   :rdfs/range          :dpvo/LegalBasis,
   :rdfs/subPropertyOf  :dpvo/hasLegalBasis,
   :vs/term_status      "accepted"})

(def hasLikelihood
  "Indicates the likelihood associated with a concept"
  {:db/ident            :dpvo/hasLikelihood,
   :dcterms/created     #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator     ["Paul Ryan"
                         "Julian Flake"
                         "Harshvardhan J. Pandit"
                         "Georg P Krog"],
   :dcterms/description "Indicates the likelihood associated with a concept",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has likelihood",
   :rdfs/range          :dpvo/Likelihood,
   :rdfs/subPropertyOf  :dpvo/hasLikelihood,
   :vs/term_status      "accepted"})

(def hasLocation
  "Indicates information about location"
  {:db/ident            :dpvo/hasLocation,
   :dcterms/created     #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator     ["Mark Lizar"
                         "Harshvardhan J. Pandit"
                         "Rob Brennan"
                         "Axel Polleres"],
   :dcterms/description "Indicates information about location",
   :dcterms/source      "https://specialprivacy.ercim.eu/",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has location",
   :rdfs/range          :dpvo/Location,
   :rdfs/subPropertyOf  :dpvo/hasLocation,
   :vs/term_status      "accepted"})

(def hasName
  "Specifies name of a legal entity"
  {:db/ident            :dpvo/hasName,
   :dcterms/created     #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator     ["Harshvardhan J.Pandit"
                         "Georg P Krog"
                         "Beatriz Esteves"
                         "Paul Ryan"],
   :dcterms/description "Specifies name of a legal entity",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :dpvo/Entity,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has name",
   :rdfs/range          :owl/Thing,
   :rdfs/subPropertyOf  :dpvo/hasName,
   :vs/term_status      "accepted"})

(def hasNotice
  "Indicates the use or applicability of a Notice for the specified context"
  {:db/ident :dpvo/hasNotice,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Paul Ryan" "Georg P Krog" "Julian Flake"],
   :dcterms/description
   "Indicates the use or applicability of a Notice for the specified context",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has notice",
   :rdfs/range :dpvo/Notice,
   :rdfs/subPropertyOf [:dpvo/hasOrganisationalMeasure
                        :dpvo/hasNotice
                        :dpvo/hasTechnicalOrganisationalMeasure],
   :vs/term_status "accepted"})

(def hasObligation
  "Specifying applicability or inclusion of an obligation rule within specified context"
  {:db/ident :dpvo/hasObligation,
   :dcterms/created #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Beatriz Esteves" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Specifying applicability or inclusion of an obligation rule within specified context",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Context,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has obligation",
   :rdfs/range :dpvo/Obligation,
   :rdfs/subPropertyOf [:dpvo/hasRule :dpvo/hasObligation],
   :vs/term_status "accepted"})

(def hasOrganisationalMeasure
  "Indicates use or applicability of Organisational measure"
  {:db/ident :dpvo/hasOrganisationalMeasure,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Indicates use or applicability of Organisational measure",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has organisational measure",
   :rdfs/range :dpvo/OrganisationalMeasure,
   :rdfs/subPropertyOf [:dpvo/hasTechnicalOrganisationalMeasure
                        :dpvo/hasOrganisationalMeasure],
   :vs/term_status "accepted"})

(def hasOutcome
  "Indicates an outcome of specified concept or context"
  {:db/ident            :dpvo/hasOutcome,
   :dcterms/created     #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Indicates an outcome of specified concept or context",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has outcome",
   :rdfs/range          :owl/Thing,
   :rdfs/subPropertyOf  :dpvo/hasOutcome,
   :vs/term_status      "accepted"})

(def hasPermission
  "Specifying applicability or inclusion of a permission rule within specified context"
  {:db/ident :dpvo/hasPermission,
   :dcterms/created #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Beatriz Esteves" "Paul Ryan" "Georg P Krog"],
   :dcterms/description
   "Specifying applicability or inclusion of a permission rule within specified context",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Context,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has permission",
   :rdfs/range :dpvo/Permission,
   :rdfs/subPropertyOf [:dpvo/hasRule :dpvo/hasPermission],
   :vs/term_status "accepted"})

(def hasPersonalData
  "Indicates association with Personal Data"
  {:db/ident            :dpvo/hasPersonalData,
   :dcterms/created     #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Indicates association with Personal Data",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has personal data",
   :rdfs/range          :dpvo/PersonalData,
   :rdfs/subPropertyOf  [:dpvo/hasData :dpvo/hasPersonalData],
   :vs/term_status      "accepted"})

(def hasPersonalDataHandling
  "Indicates association with Personal Data Handling"
  {:db/ident            :dpvo/hasPersonalDataHandling,
   :dcterms/created     #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description "Indicates association with Personal Data Handling",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has personal data handling",
   :rdfs/range          :dpvo/PersonalDataHandling,
   :rdfs/subPropertyOf  :dpvo/hasPersonalDataHandling,
   :vs/term_status      "accepted"})

(def hasPolicy
  "Indicates policy applicable or used"
  {:db/ident            :dpvo/hasPolicy,
   :dcterms/created     #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Indicates policy applicable or used",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has policy",
   :rdfs/range          :dpvo/Policy,
   :rdfs/subPropertyOf  [:dpvo/hasTechnicalOrganisationalMeasure
                         :dpvo/hasPolicy],
   :vs/term_status      "accepted"})

(def hasProcessing
  "Indicates association with Processing"
  {:db/ident            :dpvo/hasProcessing,
   :dcterms/created     #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator     ["Axel Polleres"
                         "Bud Bruegger"
                         "Javier Fernández"
                         "Mark Lizar"
                         "Harshvardhan J. Pandit"],
   :dcterms/description "Indicates association with Processing",
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source      "https://specialprivacy.ercim.eu/",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has processing",
   :rdfs/range          :dpvo/Processing,
   :rdfs/subPropertyOf  :dpvo/hasProcessing,
   :vs/term_status      "accepted"})

(def hasProcessingAutomation
  "Indicates the use or extent of automation associated with processing"
  {:db/ident :dpvo/hasProcessingAutomation,
   :dcterms/created #inst "2022-08-13T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Indicates the use or extent of automation associated with processing",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has processing automation",
   :rdfs/range :dpvo/AutomationOfProcessing,
   :rdfs/subPropertyOf :dpvo/hasProcessingAutomation,
   :vs/term_status "accepted"})

(def hasProhibition
  "Specifying applicability or inclusion of a prohibition rule within specified context"
  {:db/ident :dpvo/hasProhibition,
   :dcterms/created #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Beatriz Esteves" "Paul Ryan" "Georg P Krog"],
   :dcterms/description
   "Specifying applicability or inclusion of a prohibition rule within specified context",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Context,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has prohibition",
   :rdfs/range :dpvo/Prohibition,
   :rdfs/subPropertyOf [:dpvo/hasRule :dpvo/hasProhibition],
   :vs/term_status "accepted"})

(def hasPurpose
  "Indicates association with Purpose"
  {:db/ident            :dpvo/hasPurpose,
   :dcterms/created     #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator     ["Axel Polleres"
                         "Bud Bruegger"
                         "Mark Lizar"
                         "Harshvardhan J. Pandit"
                         "Javier Fernández"],
   :dcterms/description "Indicates association with Purpose",
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source      "https://specialprivacy.ercim.eu/",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has purpose",
   :rdfs/range          :dpvo/Purpose,
   :rdfs/subPropertyOf  :dpvo/hasPurpose,
   :vs/term_status      "accepted"})

(def hasRecipient
  "Indicates Recipient of Personal Data"
  {:db/ident            :dpvo/hasRecipient,
   :dcterms/created     #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator     ["Bud Bruegger"
                         "Javier Fernández"
                         "Axel Polleres"
                         "Harshvardhan J. Pandit"
                         "Mark Lizar"],
   :dcterms/description "Indicates Recipient of Personal Data",
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source      "https://specialprivacy.ercim.eu/",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has recipient",
   :rdfs/range          :dpvo/Recipient,
   :rdfs/subPropertyOf  [:dpvo/hasEntity :dpvo/hasRecipient],
   :vs/term_status      "accepted"})

(def hasRecipientDataController
  "Indiciates inclusion or applicability of a Data Controller as a Recipient of persona data"
  {:db/ident :dpvo/hasRecipientDataController,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator ["Georg P. Krog" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Indiciates inclusion or applicability of a Data Controller as a Recipient of persona data",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has recipient data controller",
   :rdfs/range :dpvo/DataController,
   :rdfs/subPropertyOf
   [:dpvo/hasRecipient :dpvo/hasRecipientDataController :dpvo/hasEntity],
   :vs/term_status "accepted"})

(def hasRecipientThirdParty
  "Indiciates inclusion or applicability of a Third Party as a Recipient of persona data"
  {:db/ident :dpvo/hasRecipientThirdParty,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P. Krog"],
   :dcterms/description
   "Indiciates inclusion or applicability of a Third Party as a Recipient of persona data",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has recipient third party",
   :rdfs/range :dpvo/ThirdParty,
   :rdfs/subPropertyOf
   [:dpvo/hasRecipient :dpvo/hasRecipientThirdParty :dpvo/hasEntity],
   :vs/term_status "accepted"})

(def hasRelationWithDataSubject
  "Indicates the relation between specified Entity and Data Subject"
  {:db/ident :dpvo/hasRelationWithDataSubject,
   :dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Julian Flake" "Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description
   "Indicates the relation between specified Entity and Data Subject",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :dpvo/Entity,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has relation with data subject",
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf [:dpvo/hasEntity :dpvo/hasRelationWithDataSubject],
   :vs/term_status "accepted"})

(def hasRepresentative
  "Specifies representative of the legal entity"
  {:db/ident            :dpvo/hasRepresentative,
   :dcterms/created     #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator     ["Beatriz Esteves"
                         "Paul Ryan"
                         "Georg P Krog"
                         "Harshvardhan J.Pandit"],
   :dcterms/description "Specifies representative of the legal entity",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :dpvo/Entity,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has representative",
   :rdfs/range          :dpvo/Representative,
   :rdfs/subPropertyOf  [:dpvo/hasEntity :dpvo/hasRepresentative],
   :vs/term_status      "accepted"})

(def hasResidualRisk
  "Indicates the associated risk is the remaining or residual risk from applying mitigation measures or treatments to this risk"
  {:db/ident :dpvo/hasResidualRisk,
   :dcterms/created #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J. Pandit" "Julian Flake" "Georg P Krog"],
   :dcterms/description
   "Indicates the associated risk is the remaining or residual risk from applying mitigation measures or treatments to this risk",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Risk,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has residual risk",
   :rdfs/range :dpvo/Risk,
   :rdfs/subPropertyOf :dpvo/hasResidualRisk,
   :vs/term_status "accepted"})

(def hasResponsibleEntity
  "Specifies the indicated entity is responsible within some context"
  {:db/ident :dpvo/hasResponsibleEntity,
   :dcterms/created #inst "2022-03-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Specifies the indicated entity is responsible within some context",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has responsible entity",
   :rdfs/range :dpvo/Entity,
   :rdfs/subPropertyOf [:dpvo/hasEntity :dpvo/hasResponsibleEntity],
   :vs/term_status "accepted"})

(def hasRight
  "Indicates use or applicability of Right"
  {:db/ident            :dpvo/hasRight,
   :dcterms/created     #inst "2020-11-18T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Indicates use or applicability of Right",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has right",
   :rdfs/range          :dpvo/Right,
   :rdfs/subPropertyOf  :dpvo/hasRight,
   :vs/term_status      "accepted"})

(def hasRisk
  "Indicates applicability of Risk Indicates applicability of Risk for this concept"
  {:db/ident            :dpvo/hasRisk,
   :dcterms/created     #inst "2020-11-18T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description ["Indicates applicability of Risk"
                         "Indicates applicability of Risk for this concept"],
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has risk",
   :rdfs/range          :dpvo/Risk,
   :rdfs/subPropertyOf  :dpvo/hasRisk,
   :vs/term_status      "accepted"})

(def hasRiskLevel
  "Indicates the associated risk level associated with a risk"
  {:db/ident :dpvo/hasRiskLevel,
   :dcterms/created #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Harshvardhan J. Pandit" "Julian Flake"],
   :dcterms/description
   "Indicates the associated risk level associated with a risk",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Risk,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has risk level",
   :rdfs/range :dpvo/RiskLevel,
   :rdfs/subPropertyOf :dpvo/hasRiskLevel,
   :vs/term_status "accepted"})

(def hasRule
  "Specifying applicability or inclusion of a rule within specified context"
  {:db/ident :dpvo/hasRule,
   :dcterms/created #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator
   ["Beatriz Esteves" "Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   "Specifying applicability or inclusion of a rule within specified context",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Context,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has rule",
   :rdfs/range :dpvo/Rule,
   :rdfs/subPropertyOf :dpvo/hasRule,
   :vs/term_status "accepted"})

(def hasScale
  "Indicates the scale of specified concept"
  {:db/ident            :dpvo/hasScale,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Indicates the scale of specified concept",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has scale",
   :rdfs/range          :dpvo/Scale,
   :rdfs/subPropertyOf  :dpvo/hasScale,
   :vs/term_status      "accepted"})

(def hasScope
  "Indicates the scope of specified concept or context"
  {:db/ident            :dpvo/hasScope,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Indicates the scope of specified concept or context",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has scope",
   :rdfs/range          :dpvo/Scope,
   :rdfs/subPropertyOf  :dpvo/hasScope,
   :vs/term_status      "accepted"})

(def hasSector
  "Indicates the purpose is associated with activities in the indicated (Economic) Sector(s)"
  {:db/ident :dpvo/hasSector,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/description
   "Indicates the purpose is associated with activities in the indicated (Economic) Sector(s)",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has sector",
   :rdfs/range :dpvo/Sector,
   :rdfs/subPropertyOf :dpvo/hasSector,
   :vs/term_status "accepted"})

(def hasSeverity
  "Indicates the severity associated with a concept"
  {:db/ident            :dpvo/hasSeverity,
   :dcterms/created     #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit"
                         "Julian Flake"
                         "Georg P Krog"
                         "Paul Ryan"],
   :dcterms/description "Indicates the severity associated with a concept",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has severity",
   :rdfs/range          :dpvo/Severity,
   :rdfs/subPropertyOf  :dpvo/hasSeverity,
   :vs/term_status      "accepted"})

(def hasStatus
  "Indicates the status of specified concept"
  {:db/ident            :dpvo/hasStatus,
   :dcterms/created     #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Indicates the status of specified concept",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has status",
   :rdfs/range          :dpvo/Status,
   :rdfs/subPropertyOf  :dpvo/hasStatus,
   :vs/term_status      "accepted"})

(def hasStorageCondition
  "Indicates information about storage condition"
  {:db/ident            :dpvo/hasStorageCondition,
   :dcterms/created     #inst "2022-08-13T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit"
                         "Mark Lizar"
                         "Axel Polleres"
                         "Rob Brennan"],
   :dcterms/description "Indicates information about storage condition",
   :dcterms/source      "https://specialprivacy.ercim.eu/",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has storage condition",
   :rdfs/range          :dpvo/StorageCondition,
   :rdfs/subPropertyOf  :dpvo/hasStorageCondition,
   :vs/term_status      "changed"})

(def hasTechnicalMeasure
  "Indicates use or applicability of Technical measure"
  {:db/ident            :dpvo/hasTechnicalMeasure,
   :dcterms/created     #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Indicates use or applicability of Technical measure",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "has technical measure",
   :rdfs/range          :dpvo/TechnicalMeasure,
   :rdfs/subPropertyOf  [:dpvo/hasTechnicalOrganisationalMeasure
                         :dpvo/hasTechnicalMeasure],
   :vs/term_status      "accepted"})

(def hasTechnicalOrganisationalMeasure
  "Indicates use or applicability of Technical or Organisational measure"
  {:db/ident :dpvo/hasTechnicalOrganisationalMeasure,
   :dcterms/created #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit"
                     "Mark Lizar"
                     "Axel Polleres"
                     "Javier Fernández"
                     "Bud Bruegger"],
   :dcterms/description
   "Indicates use or applicability of Technical or Organisational measure",
   :dcterms/modified #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has technical and organisational measure",
   :rdfs/range :dpvo/TechnicalOrganisationalMeasure,
   :rdfs/subPropertyOf :dpvo/hasTechnicalOrganisationalMeasure,
   :vs/term_status "accepted"})

(def hasThirdCountry
  "Indicates applicability or relevance of a 'third country'"
  {:db/ident :dpvo/hasThirdCountry,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   "Indicates applicability or relevance of a 'third country'",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "has third country",
   :rdfs/range :dpvo/ThirdCountry,
   :rdfs/subPropertyOf
   [:dpvo/hasCountry :dpvo/hasThirdCountry :dpvo/hasLocation],
   :vs/term_status "accepted"})

(def isAfter
  "Indicates the specified concepts is 'after' this concept in some context"
  {:db/ident :dpvo/isAfter,
   :dcterms/created #inst "2022-03-02T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Julian Flake" "Georg P. Krog"],
   :dcterms/description
   "Indicates the specified concepts is 'after' this concept in some context",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "is after",
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf :dpvo/isAfter,
   :vs/term_status "accepted"})

(def isAuthorityFor
  "Indicates area, scope, or applicability of an Authority"
  {:db/ident :dpvo/isAuthorityFor,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Indicates area, scope, or applicability of an Authority",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :dpvo/Authority,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "is authority for",
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf :dpvo/isAuthorityFor,
   :vs/term_status "accepted"})

(def isBefore
  "Indicates the specified concepts is 'before' this concept in some context"
  {:db/ident :dpvo/isBefore,
   :dcterms/created #inst "2022-03-02T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Julian Flake" "Georg P. Krog"],
   :dcterms/description
   "Indicates the specified concepts is 'before' this concept in some context",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "is before",
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf :dpvo/isBefore,
   :vs/term_status "accepted"})

(def isExercisedAt
  "Indicates context or information about exercising a right"
  {:db/ident :dpvo/isExercisedAt,
   :dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Indicates context or information about exercising a right",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/ActiveRight,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "is exercised at",
   :rdfs/range :dpvo/RightExerciseNotice,
   :rdfs/subPropertyOf :dpvo/isExercisedAt,
   :vs/term_status "accepted"})

(def isImplementedByEntity
  "Indicates implementation details such as entities or agents"
  {:db/ident :dpvo/isImplementedByEntity,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/creator ["Beatriz Esteves"
                     "Julian Flake"
                     "Harshvardhan J. Pandit"
                     "Paul Ryan"
                     "Axel Polleres"],
   :dcterms/description
   "Indicates implementation details such as entities or agents",
   :dcterms/modified #inst "2022-01-26T00:00:00.000-05:00",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   "The use of 'entity' is inclusive of entities (e.g. Data Processor) as well as 'agent' (e.g. DPO). For indicating technological implementation, the property isImplementedByTechnology should be used.",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "is implemented by entity",
   :rdfs/range :dpvo/Entity,
   :rdfs/subPropertyOf :dpvo/isImplementedByEntity,
   :vs/term_status "changed"})

(def isImplementedUsingTechnology
  "Indicates implementation details such as technologies or processes"
  {:db/ident :dpvo/isImplementedUsingTechnology,
   :dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator
   ["Julian Flake" "Harshvardhan J. Pandit" "Paul Ryan" "Beatriz Esteves"],
   :dcterms/description
   "Indicates implementation details such as technologies or processes",
   :dcterms/modified #inst "2022-06-15T00:00:00.000-04:00",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "The term 'technology' is inclusive of technologies, processes, and methods.",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "is implemented using technology",
   :rdfs/range :dpvo/Technology,
   :rdfs/subPropertyOf :dpvo/isImplementedUsingTechnology,
   :vs/term_status "changed"})

(def isIndicatedAtTime
  "Specifies the temporal information for when the entity has indicated the specific context"
  {:db/ident :dpvo/isIndicatedAtTime,
   :dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Georg P Krog" "Julian Flake" "Paul Ryan"],
   :dcterms/description
   "Specifies the temporal information for when the entity has indicated the specific context",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "is indicated at time",
   :rdfs/subPropertyOf :dpvo/isIndicatedAtTime,
   :vs/term_status "accepted"})

(def isIndicatedBy
  "Specifies entity who indicates the specific context"
  {:db/ident            :dpvo/isIndicatedBy,
   :dcterms/created     #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit"
                         "Georg P Krog"
                         "Paul Ryan"
                         "Julian Flake"],
   :dcterms/description "Specifies entity who indicates the specific context",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "is indicated by",
   :rdfs/range          :dpvo/Entity,
   :rdfs/subPropertyOf  :dpvo/isIndicatedBy,
   :vs/term_status      "accepted"})

(def isMitigatedByMeasure
  "Indicate a risk is mitigated by specified measure"
  {:db/ident            :dpvo/isMitigatedByMeasure,
   :dcterms/created     #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Indicate a risk is mitigated by specified measure",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :dpvo/Risk,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "is mitigated by measure",
   :rdfs/range          :dpvo/RiskMitigationMeasure,
   :rdfs/subPropertyOf  [:dpvo/hasTechnicalOrganisationalMeasure
                         :dpvo/isMitigatedByMeasure],
   :vs/term_status      "accepted"})

(def isPolicyFor
  "Indicates the context or application of policy"
  {:db/ident            :dpvo/isPolicyFor,
   :dcterms/created     #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Indicates the context or application of policy",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :dpvo/Policy,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "is policy for",
   :rdfs/range          :owl/Thing,
   :rdfs/subPropertyOf  :dpvo/isPolicyFor,
   :vs/term_status      "accepted"})

(def isRepresentativeFor
  "Indicates the entity is a representative for specified entity"
  {:db/ident :dpvo/isRepresentativeFor,
   :dcterms/created #inst "2022-11-09T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Indicates the entity is a representative for specified entity",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Representative,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "is representative for",
   :rdfs/range :dpvo/Entity,
   :rdfs/subPropertyOf [:dpvo/hasEntity :dpvo/isRepresentativeFor],
   :vs/term_status "accepted"})

(def isResidualRiskOf
  "Indicates this risk is the remaining or residual risk from applying mitigation measures or treatments to specified risk"
  {:db/ident :dpvo/isResidualRiskOf,
   :dcterms/created #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Julian Flake" "Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description
   "Indicates this risk is the remaining or residual risk from applying mitigation measures or treatments to specified risk",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Risk,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label "is residual risk of",
   :rdfs/range :dpvo/Risk,
   :rdfs/subPropertyOf :dpvo/isResidualRiskOf,
   :vs/term_status "accepted"})

(def mitigatesRisk
  "Indicates risks mitigated by this concept"
  {:db/ident            :dpvo/mitigatesRisk,
   :dcterms/created     #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Indicates risks mitigated by this concept",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :dpvo/RiskMitigationMeasure,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          "mitigates risk",
   :rdfs/range          :dpvo/Risk,
   :rdfs/subPropertyOf  :dpvo/mitigatesRisk,
   :vs/term_status      "accepted"})

(def ^{:private true} Resource
  "dcat:Resource"
  {:db/ident :dcat/Resource,
   :rdf/type :owl/Class,
   :rdfs/label "dcat:Resource",
   :skos/scopeNote
   "A dataset, data service, or any other resource associated with Right Exercise - such as for providing a copy of personal data"})

(def ^{:private true} page
  "foaf:page"
  {:db/ident :foaf/page,
   :rdf/type [:rdf/Property :owl/AnnotationProperty],
   :rdfs/label "foaf:page",
   :rdfs/subPropertyOf :foaf/page,
   :skos/scopeNote
   "Indicates a web page or document providing information or functionality associated with a Right Exercise"})