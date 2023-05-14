(ns net.wikipunk.rdf.dpvo
  "The Data Privacy Vocabulary (DPV) provides terms (classes and properties) to represent information about legally compliant personal data handling, which includes purposes, processing, personal data, technical and organisational measures."
  {:dcterms/abstract
   #voc/lstr
    "The Data Privacy Vocabulary (DPV) provides terms (classes and properties) to represent information about legally compliant personal data handling, which includes purposes, processing, personal data, technical and organisational measures.@en",
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
   #voc/lstr
    "The Data Privacy Vocabulary (DPV) provides terms (classes and properties) to represent information about legally compliant personal data handling, which includes purposes, processing, personal data, technical and organisational measures.@en",
   :dcterms/license "https://www.w3.org/Consortium/Legal/2015/doc-license",
   :dcterms/modified #inst "2022-12-05T00:00:00.000-05:00",
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :dcterms/title #voc/lstr "Data Privacy Vocabulary@en",
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
   #voc/lstr
    "Purposes associated with conducting or assisting with research conducted in an academic context e.g. within universities@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Academic Research@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/purposes#Education"],
   :rdfs/subClassOf
   [:dpvo/ResearchAndDevelopment :dpvo/AcademicResearch :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def AcademicScientificOrganisation
  "Organisations related to academia or scientific pursuits e.g. Universities, Schools, Research Bodies"
  {:db/ident :dpvo/AcademicScientificOrganisation,
   :dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Organisations related to academia or scientific pursuits e.g. Universities, Schools, Research Bodies@en",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :dcterms/source "http://purl.org/adms",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Academic or Scientific Organisation@en",
   :rdfs/subClassOf [:dpvo/Organisation
                     :dpvo/AcademicScientificOrganisation
                     :dpvo/LegalEntity
                     :dpvo/Entity],
   :vs/term_status #voc/lstr "modified@en"})

(def Access
  "to access data"
  {:db/ident            :dpvo/Access,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "to access data@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Access@en",
   :rdfs/subClassOf     [:dpvo/Use :dpvo/Access :dpvo/Processing],
   :vs/term_status      #voc/lstr "accepted@en"})

(def AccessControlMethod
  "Methods which restrict access to a place or resource"
  {:db/ident :dpvo/AccessControlMethod,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Axel Polleres" "Harshvardhan J. Pandit" "Rob Brennan" "Mark Lizar"],
   :dcterms/description
   #voc/lstr "Methods which restrict access to a place or resource@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Access Control Method@en",
   :rdfs/subClassOf [:dpvo/TechnicalMeasure
                     :dpvo/AccessControlMethod
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def AccountManagement
  "Account Management refers to purposes associated with account management, such as to create, provide, maintain, and manage accounts"
  {:db/ident :dpvo/AccountManagement,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Beatriz Esteves" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Account Management refers to purposes associated with account management, such as to create, provide, maintain, and manage accounts@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Account Management@en",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/AccountManagement],
   :vs/term_status #voc/lstr "accepted@en"})

(def Acquire
  "to come into possession or control of the data"
  {:db/ident :dpvo/Acquire,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #voc/lstr
                         "to come into possession or control of the data@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Acquire@en",
   :rdfs/subClassOf [:dpvo/Obtain :dpvo/Acquire :dpvo/Processing],
   :vs/term_status #voc/lstr "accepted@en"})

(def ActiveRight
  "The right(s) applicable, provided, or expected that need to be (actively) exercised"
  {:db/ident :dpvo/ActiveRight,
   :dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Paul Ryan" "Beatriz Esteves" "Harshvardhan J Pandit"],
   :dcterms/description
   #voc/lstr
    "The right(s) applicable, provided, or expected that need to be (actively) exercised@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Active rights require the entity to expressly exercise them. For example, a Data Subject exercising their right to withdraw their consent.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Active Right@en",
   :rdfs/subClassOf [:dpvo/Right :dpvo/ActiveRight],
   :vs/term_status #voc/lstr "accepted@en"})

(def ActivityCompleted
  "State of an activity that has completed i.e. is fully in the past"
  {:db/ident :dpvo/ActivityCompleted,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "State of an activity that has completed i.e. is fully in the past@en",
   :rdf/type
   [:owl/NamedIndividual :dpvo/ActivityStatus :dpvo/Context :dpvo/Status],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Activity Completed@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ActivityHalted
  "State of an activity that was occuring in the past, and has been halted or paused or stoped"
  {:db/ident :dpvo/ActivityHalted,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "State of an activity that was occuring in the past, and has been halted or paused or stoped@en",
   :rdf/type
   [:owl/NamedIndividual :dpvo/ActivityStatus :dpvo/Context :dpvo/Status],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Activity Halted@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ActivityMonitoring
  "Monitoring of activities including assessing whether they have been successfully initiated and completed"
  {:db/ident :dpvo/ActivityMonitoring,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Monitoring of activities including assessing whether they have been successfully initiated and completed@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Activity Monitoring@en",
   :rdfs/subClassOf [:dpvo/TechnicalMeasure
                     :dpvo/ActivityMonitoring
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def ActivityNotCompleted
  "State of an activity that could not be completed, but has reached some end state"
  {:db/ident :dpvo/ActivityNotCompleted,
   :dcterms/created #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "State of an activity that could not be completed, but has reached some end state@en",
   :rdf/type
   [:dpvo/ActivityStatus :owl/NamedIndividual :dpvo/Context :dpvo/Status],
   :rdfs/comment
   #voc/lstr
    "This relates to a 'Stop' state as distinct from a 'Halt' state. It makes no comments on whether the Acitivity can be resumed or continued towards completion.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Acitivity Not Completed@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ActivityOngoing
  "State of an activity occuring in continuation i.e. currently ongoing"
  {:db/ident :dpvo/ActivityOngoing,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "State of an activity occuring in continuation i.e. currently ongoing@en",
   :rdf/type
   [:owl/NamedIndividual :dpvo/ActivityStatus :dpvo/Context :dpvo/Status],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Activity Ongoing@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ActivityProposed
  "State of an activity being proposed or planned i.e. yet to occur"
  {:db/ident :dpvo/ActivityProposed,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "State of an activity being proposed or planned i.e. yet to occur@en",
   :rdf/type
   [:dpvo/ActivityStatus :owl/NamedIndividual :dpvo/Context :dpvo/Status],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Activity Proposed@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ActivityStatus
  "Status associated with activity operations and lifecycles"
  {:db/ident :dpvo/ActivityStatus,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Status associated with activity operations and lifecycles@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Activity Status@en",
   :rdfs/subClassOf [:dpvo/Status :dpvo/ActivityStatus :dpvo/Context],
   :vs/term_status #voc/lstr "accepted@en"})

(def Adapt
  "to modify the data, often rewritten into a new form for a new use"
  {:db/ident :dpvo/Adapt,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "to modify the data, often rewritten into a new form for a new use@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Adapt@en",
   :rdfs/subClassOf [:dpvo/Transform :dpvo/Adapt :dpvo/Processing],
   :vs/term_status #voc/lstr "accepted@en"})

(def Adult
  "A natural person that is not a child i.e. has attained some legally specified age of adulthood"
  {:db/ident :dpvo/Adult,
   :dcterms/created #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator "Georg Krog",
   :dcterms/description
   #voc/lstr
    "A natural person that is not a child i.e. has attained some legally specified age of adulthood@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Adult@en",
   :rdfs/subClassOf [:dpvo/DataSubject
                     :dpvo/Adult
                     :dpvo/LegalEntity
                     :dpvo/Entity
                     :dpvo/NaturalPerson],
   :vs/term_status #voc/lstr "accepted@en"})

(def Advertising
  "Purposes associated with conducting advertising i.e. process or artefact used to call attention to a product, service, etc. through announcements, notices, or other forms of communication"
  {:db/ident :dpvo/Advertising,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog" "Beatriz Esteves"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with conducting advertising i.e. process or artefact used to call attention to a product, service, etc. through announcements, notices, or other forms of communication@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Advertising is a subset of Marketing. Advertising by itself does not indicate 'personalisation' i.e. personalised ads.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Advertising@en",
   :rdfs/subClassOf [:dpvo/Marketing :dpvo/Advertising :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def AlgorithmicLogic
  "The algorithmic logic applied or used"
  {:db/ident :dpvo/AlgorithmicLogic,
   :dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "The algorithmic logic applied or used@en",
   :dcterms/modified #inst "2022-06-15T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Algorithmic Logic is intended as a broad concept for explaining the use of algorithms and automated decisions making within Processing. To describe the actual algorithm, see the Algorithm concept.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Algorithmic Logic@en",
   :rdfs/subClassOf [:dpvo/AutomationOfProcessing
                     :dpvo/AlgorithmicLogic
                     :dpvo/ProcessingContext
                     :dpvo/Context],
   :vs/term_status #voc/lstr "accepted@en"})

(def Align
  "to adjust the data to be in relation to another data"
  {:db/ident :dpvo/Align,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr "to adjust the data to be in relation to another data@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Align@en",
   :rdfs/subClassOf [:dpvo/Transform :dpvo/Align :dpvo/Processing],
   :vs/term_status #voc/lstr "accepted@en"})

(def Alter
  "to change the data without changing it into something else"
  {:db/ident :dpvo/Alter,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr "to change the data without changing it into something else@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Alter@en",
   :rdfs/subClassOf [:dpvo/Transform :dpvo/Alter :dpvo/Processing],
   :vs/term_status #voc/lstr "accepted@en"})

(def Analyse
  "to study or examine the data in detail"
  {:db/ident :dpvo/Analyse,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #voc/lstr "to study or examine the data in detail@en",
   :dcterms/source "https://specialprivacy.ercim.eu/vocabs/processing",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Analyse@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/processing#Analyse"],
   :rdfs/subClassOf [:dpvo/Use :dpvo/Analyse :dpvo/Processing],
   :vs/term_status #voc/lstr "accepted@en"})

(def Anonymisation
  "Anonymisation is the process by which data is irreversibly altered in such a way that a data subject can no longer be identified directly or indirectly, either by the entity holding the data alone or in collaboration with other entities and information sources"
  {:db/ident :dpvo/Anonymisation,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Rob Brennan" "Mark Lizar" "Axel Polleres"],
   :dcterms/description
   #voc/lstr
    "Anonymisation is the process by which data is irreversibly altered in such a way that a data subject can no longer be identified directly or indirectly, either by the entity holding the data alone or in collaboration with other entities and information sources@en",
   :dcterms/modified #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source "https://www.iso.org/standard/45123.html",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Anonymisation@en",
   :rdfs/subClassOf [:dpvo/Deidentification
                     :dpvo/Anonymisation
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure
                     :dpvo/DataSanitisationTechnique],
   :vs/term_status #voc/lstr "modified@en"})

(def Anonymise
  "to irreversibly alter personal data in such a way that an unique data subject can no longer be identified directly or indirectly or in combination with other data"
  {:db/ident :dpvo/Anonymise,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "to irreversibly alter personal data in such a way that an unique data subject can no longer be identified directly or indirectly or in combination with other data@en",
   :dcterms/source "https://specialprivacy.ercim.eu/vocabs/processing",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Anonymise@en",
   :rdfs/seeAlso
   ["https://specialprivacy.ercim.eu/vocabs/processing#Anonymise"],
   :rdfs/subClassOf [:dpvo/Transform :dpvo/Anonymise :dpvo/Processing],
   :vs/term_status #voc/lstr "accepted@en"})

(def AnonymisedData
  "Personal Data that has been (fully and completely) anonymised so that it is no longer considered Personal Data"
  {:db/ident :dpvo/AnonymisedData,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Piero Bonatti",
   :dcterms/description
   #voc/lstr
    "Personal Data that has been (fully and completely) anonymised so that it is no longer considered Personal Data@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "It is advised to carefully consider indicating data is fully or completely anonymised by determining whether the data by itself or in combination with other data can identify a person. Failing this condition, the data should be denoted as PseudonymisedData. To indicate data is anonymised only for a specified entity (e.g. within an organisation), the concept ContextuallyAnonymisedData (as subclass of PseudonymisedData) should be used instead of AnonymisedData.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Anonymised Data@en",
   :rdfs/subClassOf [:dpvo/NonPersonalData :dpvo/AnonymisedData :dpvo/Data],
   :vs/term_status #voc/lstr "accepted@en"})

(def AntiTerrorismOperations
  "Purposes associated with activities that detect, prevent, mitigate, or perform other activities for anti-terrorism"
  {:db/ident :dpvo/AntiTerrorismOperations,
   :dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Purposes associated with activities that detect, prevent, mitigate, or perform other activities for anti-terrorism@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Anti-Terrorism Operations@en",
   :rdfs/subClassOf
   [:dpvo/EnforceSecurity :dpvo/AntiTerrorismOperations :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def Applicant
  "Data subjects that are applicants in some context"
  {:db/ident            :dpvo/Applicant,
   :dcterms/created     #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     ["Julian Flake"
                         "Paul Ryan"
                         "Harshvardhan J. Pandit"
                         "Beatriz Esteves"
                         "Georg P. Krog"],
   :dcterms/description #voc/lstr
                         "Data subjects that are applicants in some context@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Applicant@en",
   :rdfs/subClassOf     [:dpvo/DataSubject
                         :dpvo/Applicant
                         :dpvo/LegalEntity
                         :dpvo/Entity
                         :dpvo/NaturalPerson],
   :vs/term_status      #voc/lstr "accepted@en"})

(def Assess
  "to assess data for some criteria"
  {:db/ident            :dpvo/Assess,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description #voc/lstr "to assess data for some criteria@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Assess@en",
   :rdfs/subClassOf     [:dpvo/Use :dpvo/Assess :dpvo/Processing],
   :vs/term_status      #voc/lstr "accepted@en"})

(def Assessment
  "The document, plan, or process for assessment or determination towards a purpose e.g. assessment of legality or impact assessments"
  {:db/ident :dpvo/Assessment,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "The document, plan, or process for assessment or determination towards a purpose e.g. assessment of legality or impact assessments@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Assessment@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/Assessment
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def AssetManagementProcedures
  "Procedures related to management of assets"
  {:db/ident :dpvo/AssetManagementProcedures,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Procedures related to management of assets@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Asset Management Procedures@en",
   :rdfs/subClassOf [:dpvo/GovernanceProcedures
                     :dpvo/AssetManagementProcedures
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def AsylumSeeker
  "Data subjects that are asylum seekers"
  {:db/ident            :dpvo/AsylumSeeker,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description #voc/lstr "Data subjects that are asylum seekers@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Asylum Seeker@en",
   :rdfs/subClassOf     [:dpvo/VulnerableDataSubject
                         :dpvo/AsylumSeeker
                         :dpvo/LegalEntity
                         :dpvo/Entity
                         :dpvo/DataSubject
                         :dpvo/NaturalPerson],
   :vs/term_status      #voc/lstr "accepted@en"})

(def AsymmetricCryptography
  "Use of public-key cryptography or asymmetric cryptography involving a public and private pair of keys"
  {:db/ident :dpvo/AsymmetricCryptography,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Use of public-key cryptography or asymmetric cryptography involving a public and private pair of keys@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Asymmetric Cryptography@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/AsymmetricCryptography
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def AsymmetricEncryption
  "Use of asymmetric cryptography to encrypt data"
  {:db/ident :dpvo/AsymmetricEncryption,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Use of asymmetric cryptography to encrypt data@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Asymmetric Encryption@en",
   :rdfs/subClassOf [:dpvo/Encryption
                     :dpvo/AsymmetricEncryption
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def AuditApproved
  "State of being approved through the audit"
  {:db/ident            :dpvo/AuditApproved,
   :dcterms/created     #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "State of being approved through the audit@en",
   :rdf/type            [:dpvo/AuditStatus
                         :owl/NamedIndividual
                         :dpvo/Status
                         :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Audit Approved@en",
   :vs/term_status      #voc/lstr "accepted@en"})

(def AuditConditionallyApproved
  "State of being conditionally approved through the audit"
  {:db/ident :dpvo/AuditConditionallyApproved,
   :dcterms/created #inst "2022-06-29T00:00:00.000-04:00",
   :dcterms/creator "Paul Ryan",
   :dcterms/description
   #voc/lstr "State of being conditionally approved through the audit@en",
   :rdf/type
   [:dpvo/AuditStatus :owl/NamedIndividual :dpvo/Status :dpvo/Context],
   :rdfs/comment
   #voc/lstr
    "A \"conditional approval\" is intended to reflect states where the audit has identified further changes which must be implemented before considering the audit has been 'passed', without requiring another audit to validate them. This is distinct from the case where an audit has state 'rejected', which means changes must be made and submitted for review. The requirements of a 'conditional acceptance' are expected to be minor or not significant enough to warrant another audit to review them.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Audit Conditionally Approved@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def AuditNotRequired
  "State where an audit is determined as not being required"
  {:db/ident :dpvo/AuditNotRequired,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "State where an audit is determined as not being required@en",
   :rdf/type
   [:dpvo/AuditStatus :owl/NamedIndividual :dpvo/Status :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Audit Not Required@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def AuditRejected
  "State of not being approved or being rejected through the audit"
  {:db/ident :dpvo/AuditRejected,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "State of not being approved or being rejected through the audit@en",
   :rdf/type
   [:owl/NamedIndividual :dpvo/AuditStatus :dpvo/Status :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Audit Rejected@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def AuditRequested
  "State of an audit being requested whose outcome is not yet known"
  {:db/ident :dpvo/AuditRequested,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "State of an audit being requested whose outcome is not yet known@en",
   :rdf/type
   [:dpvo/AuditStatus :owl/NamedIndividual :dpvo/Status :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Audit Requested@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def AuditRequired
  "State where an audit is determined as being required but has not been conducted"
  {:db/ident :dpvo/AuditRequired,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "State where an audit is determined as being required but has not been conducted@en",
   :rdf/type
   [:dpvo/AuditStatus :owl/NamedIndividual :dpvo/Status :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Audit Required@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def AuditStatus
  "Status associated with Auditing or Investigation"
  {:db/ident            :dpvo/AuditStatus,
   :dcterms/created     #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Status associated with Auditing or Investigation@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Audit Status@en",
   :rdfs/subClassOf     [:dpvo/Status :dpvo/AuditStatus :dpvo/Context],
   :vs/term_status      #voc/lstr "accepted@en"})

(def Authentication-ABC
  "Use of Attribute Based Credentials (ABC) to perform and manage authentication"
  {:db/ident :dpvo/Authentication-ABC,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Use of Attribute Based Credentials (ABC) to perform and manage authentication@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Authentication using ABC@en",
   :rdfs/subClassOf [:dpvo/CryptographicAuthentication
                     :dpvo/Authentication-ABC
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure
                     :dpvo/CryptographicMethods
                     :dpvo/AuthenticationProtocols],
   :vs/term_status #voc/lstr "accepted@en"})

(def Authentication-PABC
  "Use of Privacy-enhacing Attribute Based Credentials (ABC) to perform and manage authentication"
  {:db/ident :dpvo/Authentication-PABC,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Use of Privacy-enhacing Attribute Based Credentials (ABC) to perform and manage authentication@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Authentication using PABC@en",
   :rdfs/subClassOf [:dpvo/CryptographicAuthentication
                     :dpvo/Authentication-PABC
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure
                     :dpvo/CryptographicMethods
                     :dpvo/AuthenticationProtocols],
   :vs/term_status #voc/lstr "accepted@en"})

(def AuthenticationProtocols
  "Protocols involving validation of identity i.e. authentication of a person or information"
  {:db/ident :dpvo/AuthenticationProtocols,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Rob Brennan" "Axel Polleres" "Harshvardhan J. Pandit" "Mark Lizar"],
   :dcterms/description
   #voc/lstr
    "Protocols involving validation of identity i.e. authentication of a person or information@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Authentication Protocols@en",
   :rdfs/subClassOf [:dpvo/TechnicalMeasure
                     :dpvo/AuthenticationProtocols
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def AuthorisationProcedure
  "Procedures for determining authorisation through permission or authority"
  {:db/ident :dpvo/AuthorisationProcedure,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Axel Polleres" "Rob Brennan" "Mark Lizar" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Procedures for determining authorisation through permission or authority@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "non-technical authorisation procedures: How is it described on an organisational level, who gets access to the data@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Authorisation Procedure@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/AuthorisationProcedure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def AuthorisationProtocols
  "Protocols involving authorisation of roles or profiles to determine permission, rights, or privileges"
  {:db/ident :dpvo/AuthorisationProtocols,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Protocols involving authorisation of roles or profiles to determine permission, rights, or privileges@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Authorisation Protocols@en",
   :rdfs/subClassOf [:dpvo/TechnicalMeasure
                     :dpvo/AuthorisationProtocols
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Authority
  "An authority with the power to create or enforce laws, or determine their compliance."
  {:db/ident :dpvo/Authority,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan Pandit" "Georg Krog"],
   :dcterms/description
   #voc/lstr
    "An authority with the power to create or enforce laws, or determine their compliance.@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Authority@en",
   :rdfs/subClassOf [:dpvo/GovernmentalOrganisation
                     :dpvo/LegalEntity
                     :dpvo/Authority
                     :dpvo/Organisation
                     :dpvo/Entity],
   :vs/term_status #voc/lstr "accepted@en"})

(def AutomatedDecisionMaking
  "Processing that involves automated decision making"
  {:db/ident :dpvo/AutomatedDecisionMaking,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Piero Bonatti" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr "Processing that involves automated decision making@en",
   :dcterms/modified #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Automated decision making can be defined as “the ability to make decisions by technological means without human involvement.” (“Guidelines on Automated individual decision-making and Profiling for the purposes of Regulation 2016/679 (wp251rev.01)”, 2018, p. 8)@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Automated Decision Making@en",
   :rdfs/subClassOf [:dpvo/AutomationOfProcessing
                     :dpvo/DecisionMaking
                     :dpvo/AutomatedDecisionMaking
                     :dpvo/ProcessingContext
                     :dpvo/Context],
   :vs/term_status #voc/lstr "modified@en"})

(def AutomatedProcessingWithHumanInput
  "Processing that is automated and involves inputs by Humans"
  {:db/ident :dpvo/AutomatedProcessingWithHumanInput,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Processing that is automated and involves inputs by Humans@en",
   :dcterms/modified #inst "2022-09-07T00:00:00.000-04:00",
   :rdf/type [:owl/NamedIndividual
              :dpvo/HumanInvolvementForInput
              :dpvo/AutomationOfProcessing
              :dpvo/ProcessingContext
              :dpvo/Context],
   :rdfs/comment
   #voc/lstr
    "For example, an algorithm that takes inputs from humans and performs operations based on them@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Automated Processing with Human Input@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def AutomatedProcessingWithHumanOversight
  "Processing that is automated and involves oversight by Humans"
  {:db/ident :dpvo/AutomatedProcessingWithHumanOversight,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Processing that is automated and involves oversight by Humans@en",
   :dcterms/modified #inst "2022-09-07T00:00:00.000-04:00",
   :rdf/type [:dpvo/AutomationOfProcessing
              :dpvo/HumanInvolvementForOversight
              :owl/NamedIndividual
              :dpvo/ProcessingContext
              :dpvo/Context],
   :rdfs/comment
   #voc/lstr
    "For example, a human watching metrics to ensure correctness of procedural values and outputs as processing takes place@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Automated Processing with Human Oversight@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def AutomatedProcessingWithHumanReview
  "Processing that is automated and involves review by Humans"
  {:db/ident :dpvo/AutomatedProcessingWithHumanReview,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Processing that is automated and involves review by Humans@en",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type [:dpvo/HumanInvolvementForVerification
              :owl/NamedIndividual
              :dpvo/AutomationOfProcessing
              :dpvo/ProcessingContext
              :dpvo/Context],
   :rdfs/comment
   #voc/lstr
    "For example, a human verifying outputs of an algorithm for correctness or impact to individuals@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Automated Processing with Human Review@en",
   :vs/term_status #voc/lstr "modified@en"})

(def AutomationOfProcessing
  "Contextual information about the degree of automation and human involvement associated with Processing"
  {:db/ident :dpvo/AutomationOfProcessing,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Contextual information about the degree of automation and human involvement associated with Processing@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "It is difficult to provide a formal definition of automation since any and all processing may be considered automation. This concept instead is intended to explicitly signal the utilisation of automation and its extent towards some context - such as decision making, and to indicate the involvement of humans.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Automation of Processing@en",
   :rdfs/subClassOf
   [:dpvo/ProcessingContext :dpvo/AutomationOfProcessing :dpvo/Context],
   :vs/term_status #voc/lstr "accepted@en"})

(def BackgroundChecks
  "Procedure where the background of an entity is assessed to identity vulnerabilities and threats due to their current or intended role"
  {:db/ident :dpvo/BackgroundChecks,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Procedure where the background of an entity is assessed to identity vulnerabilities and threats due to their current or intended role@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Background Checks@en",
   :rdfs/subClassOf [:dpvo/SecurityProcedure
                     :dpvo/BackgroundChecks
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

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
   :dcterms/description #voc/lstr
                         "Impact(s) that acts as or causes benefits@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Benefit@en",
   :rdfs/subClassOf     [:dpvo/Impact :dpvo/Benefit :dpvo/Consequence],
   :vs/term_status      #voc/lstr "accepted@en"})

(def BiometricAuthentication
  "Use of biometric data for authentication"
  {:db/ident :dpvo/BiometricAuthentication,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Use of biometric data for authentication@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Biometric Authentication@en",
   :rdfs/subClassOf [:dpvo/AuthenticationProtocols
                     :dpvo/BiometricAuthentication
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Certification
  "Certification mechanisms, seals, and marks for the purpose of demonstrating compliance"
  {:db/ident :dpvo/Certification,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Mark Lizar" "Rob Brennan" "Harshvardhan J. Pandit" "Axel Polleres"],
   :dcterms/description
   #voc/lstr
    "Certification mechanisms, seals, and marks for the purpose of demonstrating compliance@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Certification@en",
   :rdfs/subClassOf [:dpvo/CertificationSeal
                     :dpvo/Certification
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def CertificationSeal
  "Certifications, seals, and marks indicating compliance to regulations or practices"
  {:db/ident :dpvo/CertificationSeal,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Mark Lizar" "Rob Brennan" "Harshvardhan J. Pandit" "Axel Polleres"],
   :dcterms/description
   #voc/lstr
    "Certifications, seals, and marks indicating compliance to regulations or practices@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Certification and Seal@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/CertificationSeal
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Child
  "A 'child' is a natural legal person who is below a certain legal age depending on the legal jurisdiction."
  {:db/ident :dpvo/Child,
   :dcterms/created #inst "2020-11-25T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A 'child' is a natural legal person who is below a certain legal age depending on the legal jurisdiction.@en",
   :dcterms/modified #inst "2022-06-22T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The legality of age defining a child varies by jurisdiction. In addition, 'child' is distinct from a 'minor'. For example, the legal age for consumption of alcohol can be 21, which makes a person of age 20 a 'minor' in this context. In other cases, 'minor' and 'child' are used interchangeably to refer to a person below some legally defined age.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Child@en",
   :rdfs/subClassOf [:dpvo/DataSubject
                     :dpvo/Child
                     :dpvo/LegalEntity
                     :dpvo/Entity
                     :dpvo/NaturalPerson],
   :vs/term_status #voc/lstr "changed@en"})

(def Citizen
  "Data subjects that are citizens (for a jurisdiction)"
  {:db/ident :dpvo/Citizen,
   :dcterms/created #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator ["Paul Ryan"
                     "Beatriz Esteves"
                     "Julian Flake"
                     "Georg P. Krog"
                     "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr "Data subjects that are citizens (for a jurisdiction)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Citizen@en",
   :rdfs/subClassOf [:dpvo/DataSubject
                     :dpvo/Citizen
                     :dpvo/LegalEntity
                     :dpvo/Entity
                     :dpvo/NaturalPerson],
   :vs/term_status #voc/lstr "accepted@en"})

(def City
  "A region consisting of urban population and commerce"
  {:db/ident :dpvo/City,
   :dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "A region consisting of urban population and commerce@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "City@en",
   :rdfs/subClassOf [:dpvo/Location :dpvo/City],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr "Data subjects that are clients or recipients of services@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Client@en",
   :rdfs/subClassOf [:dpvo/Customer
                     :dpvo/Client
                     :dpvo/LegalEntity
                     :dpvo/Entity
                     :dpvo/DataSubject
                     :dpvo/NaturalPerson],
   :vs/term_status #voc/lstr "accepted@en"})

(def CloudLocation
  "Location that is in the 'cloud' i.e. a logical location operated over the internet"
  {:db/ident :dpvo/CloudLocation,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Location that is in the 'cloud' i.e. a logical location operated over the internet@en",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Cloud Location@en",
   :rdfs/subClassOf [:dpvo/RemoteLocation
                     :dpvo/CloudLocation
                     :dpvo/Location
                     :dpvo/LocationLocality],
   :vs/term_status #voc/lstr "modified@en"})

(def CodeOfConduct
  "A set of rules or procedures outlining the norms and practices for conducting activities"
  {:db/ident :dpvo/CodeOfConduct,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Axel Polleres" "Harshvardhan J. Pandit" "Mark Lizar" "Rob Brennan"],
   :dcterms/description
   #voc/lstr
    "A set of rules or procedures outlining the norms and practices for conducting activities@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Code of Conduct@en",
   :rdfs/subClassOf [:dpvo/GuidelinesPrinciple
                     :dpvo/CodeOfConduct
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Collect
  "to gather data from someone"
  {:db/ident :dpvo/Collect,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #voc/lstr "to gather data from someone@en",
   :dcterms/source ["https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"
                    "https://specialprivacy.ercim.eu/vocabs/processing"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Collect@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/processing#Collect"],
   :rdfs/subClassOf [:dpvo/Obtain :dpvo/Collect :dpvo/Processing],
   :vs/term_status #voc/lstr "accepted@en"})

(def CollectedPersonalData
  "Personal Data that has been collected from another source such as the Data Subject"
  {:db/ident :dpvo/CollectedPersonalData,
   :dcterms/created #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Personal Data that has been collected from another source such as the Data Subject@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "To indicate the source of data, use the DataSource concept with the hasDataSource relation@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Collected Personal Data@en",
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo/CollectedPersonalData :dpvo/Data],
   :vs/term_status #voc/lstr "accepted@en"})

(def Combine
  "to join or merge data"
  {:db/ident :dpvo/Combine,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #voc/lstr "to join or merge data@en",
   :dcterms/source ["https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"
                    "https://specialprivacy.ercim.eu/vocabs/processing"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Combine@en",
   :rdfs/seeAlso
   ["https://specialprivacy.ercim.eu/vocabs/processing#Aggregate"],
   :rdfs/subClassOf [:dpvo/Transform :dpvo/Combine :dpvo/Processing],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Purposes associated with conducting research in a commercial setting or with intention to commercialise e.g. in a company or sponsored by a company@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Commercial Research@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/purposes#Develop"],
   :rdfs/subClassOf
   [:dpvo/ResearchAndDevelopment :dpvo/CommercialResearch :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def CommunicationForCustomerCare
  "Customer Care Communication refers to purposes associated with communicating with customers for assisting them, resolving issues, ensuring satisfaction, etc. in relation to services provided"
  {:db/ident :dpvo/CommunicationForCustomerCare,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Beatriz Esteves" "Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Customer Care Communication refers to purposes associated with communicating with customers for assisting them, resolving issues, ensuring satisfaction, etc. in relation to services provided@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Communication for Customer Care@en",
   :rdfs/subClassOf [:dpvo/CustomerCare
                     :dpvo/CommunicationManagement
                     :dpvo/CommunicationForCustomerCare
                     :dpvo/Purpose
                     :dpvo/CustomerManagement],
   :vs/term_status #voc/lstr "accepted@en"})

(def CommunicationManagement
  "Communication Management refers to purposes associated with providing or managing communication activities e.g. to send an email for notifying some information"
  {:db/ident :dpvo/CommunicationManagement,
   :dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["David Hickey" "Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Communication Management refers to purposes associated with providing or managing communication activities e.g. to send an email for notifying some information@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "This purpose by itself does not sufficiently and clearly indicate what the communication is about. As such, it is recommended to combine it with another purpose to indicate the application. For example, Communication of Payment.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Communication Management@en",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/CommunicationManagement],
   :vs/term_status #voc/lstr "accepted@en"})

(def CompletelyManualProcessing
  "Processing that is completely un-automated or fully manual"
  {:db/ident :dpvo/CompletelyManualProcessing,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Processing that is completely un-automated or fully manual@en",
   :rdf/type [:owl/NamedIndividual
              :dpvo/AutomationOfProcessing
              :dpvo/ProcessingContext
              :dpvo/Context],
   :rdfs/comment
   #voc/lstr "For example, a human performing some processing operation@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Completely Manual Processing@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ComplianceIndeterminate
  "State where the status of compliance has not been fully assessed, evaluated, or determined"
  {:db/ident :dpvo/ComplianceIndeterminate,
   :dcterms/created #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "State where the status of compliance has not been fully assessed, evaluated, or determined@en",
   :rdf/type
   [:owl/NamedIndividual :dpvo/ComplianceStatus :dpvo/Context :dpvo/Status],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Compliance Indeterminate@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ComplianceMonitoring
  "Monitoring of compliance (e.g. internal policy, regulations)"
  {:db/ident :dpvo/ComplianceMonitoring,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Monitoring of compliance (e.g. internal policy, regulations)@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Compliance Monitoring@en",
   :rdfs/subClassOf [:dpvo/GovernanceProcedures
                     :dpvo/ComplianceMonitoring
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def ComplianceStatus
  "Status associated with Compliance with some norms, objectives, or requirements"
  {:db/ident :dpvo/ComplianceStatus,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Status associated with Compliance with some norms, objectives, or requirements@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Compliance Status@en",
   :rdfs/subClassOf [:dpvo/Status :dpvo/ComplianceStatus :dpvo/Context],
   :vs/term_status #voc/lstr "accepted@en"})

(def ComplianceUnknown
  "State where the status of compliance is unknown"
  {:db/ident            :dpvo/ComplianceUnknown,
   :dcterms/created     #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "State where the status of compliance is unknown@en",
   :rdf/type            [:dpvo/ComplianceStatus
                         :owl/NamedIndividual
                         :dpvo/Context
                         :dpvo/Status],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Compliance Unknown@en",
   :vs/term_status      #voc/lstr "accepted@en"})

(def ComplianceViolation
  "State where compliance cannot be achieved due to requirements being violated"
  {:db/ident :dpvo/ComplianceViolation,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "State where compliance cannot be achieved due to requirements being violated@en",
   :dcterms/modified #inst "2022-09-07T00:00:00.000-04:00",
   :rdf/type
   [:dpvo/ComplianceStatus :owl/NamedIndividual :dpvo/Context :dpvo/Status],
   :rdfs/comment
   #voc/lstr
    "Changed from \"violation of compliance\" for consistency with other terms@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Compliance Violation@en",
   :vs/term_status #voc/lstr "changed@en"})

(def Compliant
  "State of being fully compliant"
  {:db/ident            :dpvo/Compliant,
   :dcterms/created     #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "State of being fully compliant@en",
   :rdf/type            [:owl/NamedIndividual
                         :dpvo/ComplianceStatus
                         :dpvo/Context
                         :dpvo/Status],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Compliant@en",
   :vs/term_status      #voc/lstr "accepted@en"})

(def ConformanceStatus
  "Status associated with conformance to a standard, guideline, code, or recommendation"
  {:db/ident :dpvo/ConformanceStatus,
   :dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Status associated with conformance to a standard, guideline, code, or recommendation@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Conformance Status@en",
   :rdfs/subClassOf [:dpvo/Status :dpvo/ConformanceStatus :dpvo/Context],
   :vs/term_status #voc/lstr "accepted@en"})

(def Conformant
  "State of being conformant"
  {:db/ident            :dpvo/Conformant,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "State of being conformant@en",
   :rdf/type            [:dpvo/ConformanceStatus
                         :owl/NamedIndividual
                         :dpvo/Status
                         :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Conformant@en",
   :vs/term_status      #voc/lstr "accepted@en"})

(def Consent
  "Consent of the Data Subject for specified processing"
  {:db/ident :dpvo/Consent,
   :dcterms/created #inst "2021-04-07T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Consent of the Data Subject for specified processing@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Consent@en",
   :rdfs/subClassOf [:dpvo/LegalBasis :dpvo/Consent],
   :vs/term_status #voc/lstr "accepted@en"})

(def ConsentExpired
  "The state where the temporal or contextual validity of consent has 'expired'"
  {:db/ident :dpvo/ConsentExpired,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Julian Flake" "Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "The state where the temporal or contextual validity of consent has 'expired'@en",
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/type [:owl/NamedIndividual
              :dpvo/ConsentStatusInvalidForProcessing
              :dpvo/Context
              :dpvo/Status
              :dpvo/ConsentStatus],
   :rdfs/comment
   #voc/lstr
    "An example of this state is when the obtained consent has been assigned a duration - which has lapsed or 'expired', making it invalid to be used further for processing data@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Consent Expired@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ConsentGiven
  "The state where consent has been given"
  {:db/ident :dpvo/ConsentGiven,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Paul Ryan" "Harshvardhan J. Pandit" "Julian Flake"],
   :dcterms/description #voc/lstr "The state where consent has been given@en",
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/type [:owl/NamedIndividual
              :dpvo/ConsentStatusValidForProcessing
              :dpvo/ConsentStatus
              :dpvo/Status
              :dpvo/Context],
   :rdfs/comment
   #voc/lstr
    "An example of this state is when the individual clicks on a button, ticks a checkbox, verbally agrees - or any other form that communicates their decision agreeing to the processing of data@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Consent Given@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ConsentInvalidated
  "The state where consent has been deemed to be invalid"
  {:db/ident :dpvo/ConsentInvalidated,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Paul Ryan" "Julian Flake" "Georg P Krog"],
   :dcterms/description
   #voc/lstr "The state where consent has been deemed to be invalid@en",
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/type [:owl/NamedIndividual
              :dpvo/ConsentStatusInvalidForProcessing
              :dpvo/Context
              :dpvo/Status
              :dpvo/ConsentStatus],
   :rdfs/comment
   #voc/lstr
    "An example of this state is where an investigating authority or a court finds the collected consent did not meet requirements, and 'invalidates' both prior and future uses of it to carry out processing@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Consent Invalidated@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ConsentNotice
  "A Notice for information provision associated with Consent"
  {:db/ident :dpvo/ConsentNotice,
   :dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Julian Flake" "Harshvardhan J. Pandit" "Paul Ryan" "Georg P Krog"],
   :dcterms/description
   #voc/lstr "A Notice for information provision associated with Consent@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Consent Notice@en",
   :rdfs/subClassOf [:dpvo/PrivacyNotice
                     :dpvo/ConsentNotice
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/Notice
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def ConsentRecord
  "A Record of Consent or Consent related activities"
  {:db/ident            :dpvo/ConsentRecord,
   :dcterms/created     #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit"
                         "Julian Flake"
                         "Paul Ryan"
                         "Georg P Krog"],
   :dcterms/description #voc/lstr
                         "A Record of Consent or Consent related activities@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Consent Record@en",
   :rdfs/subClassOf     [:dpvo/DataProcessingRecord
                         :dpvo/ConsentRecord
                         :dpvo/TechnicalOrganisationalMeasure
                         :dpvo/RecordsOfActivities
                         :dpvo/OrganisationalMeasure],
   :vs/term_status      #voc/lstr "accepted@en"})

(def ConsentRefused
  "The state where consent has been refused"
  {:db/ident :dpvo/ConsentRefused,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J. Pandit" "Julian Flake" "Georg P Krog"],
   :dcterms/description #voc/lstr "The state where consent has been refused@en",
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/type [:dpvo/ConsentStatusInvalidForProcessing
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/Status
              :dpvo/ConsentStatus],
   :rdfs/comment
   #voc/lstr
    "An example of this state is when the individual clicks on a 'disagree' or 'reject' or 'refuse' button, or leaves a checkbox unticked@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Consent Refused@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ConsentRequestDeferred
  "State where a request for consent has been deferred without a decision"
  {:db/ident :dpvo/ConsentRequestDeferred,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Julian Flake" "Harshvardhan J. Pandit" "Paul Ryan" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "State where a request for consent has been deferred without a decision@en",
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/type [:owl/NamedIndividual
              :dpvo/ConsentStatusInvalidForProcessing
              :dpvo/Context
              :dpvo/Status
              :dpvo/ConsentStatus],
   :rdfs/comment
   #voc/lstr
    "An example of this state is when the individual closes or dismisses a notice without making a decision. This state is intended for making the distinction between a notice being provided (as a consent request) and the individual interacting with the notice without making a decision - where the 'ignoring of a notice' is taken as consent being neither given nor refused@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Consent Request Deferred@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ConsentRequested
  "State where a request for consent has been made and is awaiting a decision"
  {:db/ident :dpvo/ConsentRequested,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Paul Ryan" "Harshvardhan J. Pandit" "Julian Flake"],
   :dcterms/description
   #voc/lstr
    "State where a request for consent has been made and is awaiting a decision@en",
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/type [:owl/NamedIndividual
              :dpvo/ConsentStatusInvalidForProcessing
              :dpvo/Context
              :dpvo/Status
              :dpvo/ConsentStatus],
   :rdfs/comment
   #voc/lstr
    "An example of this state is when a notice has been presented to the individual but they have not made a decision@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Consent Requested@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ConsentRevoked
  "The state where the consent is revoked by an entity other than the data subject and which prevents it from being further used as a valid state"
  {:db/ident :dpvo/ConsentRevoked,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Julian Flake" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "The state where the consent is revoked by an entity other than the data subject and which prevents it from being further used as a valid state@en",
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/type [:dpvo/ConsentStatusInvalidForProcessing
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/Status
              :dpvo/ConsentStatus],
   :rdfs/comment
   #voc/lstr
    "An example of this state is when a Data Controller stops utilising previously obtaining consent, such as when that service no longer exists@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Consent Revoked@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ConsentStatus
  "The state or status of 'consent' that provides information reflecting its operational status and validity for processing data"
  {:db/ident :dpvo/ConsentStatus,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Julian Flake" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "The state or status of 'consent' that provides information reflecting its operational status and validity for processing data@en",
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "States are useful as information artefacts to implement them in controlling processing, and to reflect the process and flow of obtaining and maintaining consent. For example, a database table that stores consent states for specific processing and can be queried to obtain them in an efficient manner. States are also useful in investigations to determine the use and validity of consenting practices@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Consent Status@en",
   :rdfs/subClassOf [:dpvo/Status :dpvo/ConsentStatus :dpvo/Context],
   :vs/term_status #voc/lstr "accepted@en"})

(def ConsentStatusInvalidForProcessing
  "States of consent that cannot be used as valid justifications for processing data"
  {:db/ident :dpvo/ConsentStatusInvalidForProcessing,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Paul Ryan" "Julian Flake" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "States of consent that cannot be used as valid justifications for processing data@en",
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "This identifies the stages associated with consent that should not be used to process data@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Consent Status Invalid for Processing@en",
   :rdfs/subClassOf [:dpvo/ConsentStatus
                     :dpvo/ConsentStatusInvalidForProcessing
                     :dpvo/Status
                     :dpvo/Context],
   :vs/term_status #voc/lstr "accepted@en"})

(def ConsentStatusValidForProcessing
  "States of consent that can be used as valid justifications for processing data"
  {:db/ident :dpvo/ConsentStatusValidForProcessing,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Julian Flake" "Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description
   #voc/lstr
    "States of consent that can be used as valid justifications for processing data@en",
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Practically, given consent is the only valid state for processing@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Consent Status Valid for Processing@en",
   :rdfs/subClassOf [:dpvo/ConsentStatus
                     :dpvo/ConsentStatusValidForProcessing
                     :dpvo/Status
                     :dpvo/Context],
   :vs/term_status #voc/lstr "accepted@en"})

(def ConsentUnknown
  "State where information about consent is not available or is unknown"
  {:db/ident :dpvo/ConsentUnknown,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Harshvardhan J. Pandit" "Julian Flake"],
   :dcterms/description
   #voc/lstr
    "State where information about consent is not available or is unknown@en",
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/type [:dpvo/ConsentStatusInvalidForProcessing
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/Status
              :dpvo/ConsentStatus],
   :rdfs/comment
   #voc/lstr
    "Consent states can be unknown, for example, when information is not available, or cannot be trusted, or is known to be inaccurate@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Consent Unknown@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ConsentWithdrawn
  "The state where the consent is withdrawn or revoked specifically by the data subject and which prevents it from being further used as a valid state"
  {:db/ident :dpvo/ConsentWithdrawn,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Julian Flake" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "The state where the consent is withdrawn or revoked specifically by the data subject and which prevents it from being further used as a valid state@en",
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/type [:owl/NamedIndividual
              :dpvo/ConsentStatusInvalidForProcessing
              :dpvo/Context
              :dpvo/Status
              :dpvo/ConsentStatus],
   :rdfs/comment
   #voc/lstr
    "This state can be considered a form of 'revocation' of consent, where the revocation can only be performed by the data subject. Therefore we suggest using ConsentRevoked when it is a non-data-subject entity, and ConsentWithdrawn when it is the data subject@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Consent Withdrawn@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def Consequence
  "The consequence(s) possible or arising from specified context"
  {:db/ident :dpvo/Consequence,
   :dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "The consequence(s) possible or arising from specified context@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Consequence@en",
   :rdfs/subClassOf :dpvo/Consequence,
   :vs/term_status #voc/lstr "accepted@en"})

(def ConsequenceAsSideEffect
  "The consequence(s) possible or arising as a side-effect of specified context"
  {:db/ident :dpvo/ConsequenceAsSideEffect,
   :dcterms/created #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "The consequence(s) possible or arising as a side-effect of specified context@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Consequence as Side-Effect@en",
   :rdfs/subClassOf [:dpvo/Consequence :dpvo/ConsequenceAsSideEffect],
   :vs/term_status #voc/lstr "accepted@en"})

(def ConsequenceOfFailure
  "The consequence(s) possible or arising from failure of specified context"
  {:db/ident :dpvo/ConsequenceOfFailure,
   :dcterms/created #inst "2022-03-23T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "The consequence(s) possible or arising from failure of specified context@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Consequence of Failure@en",
   :rdfs/subClassOf [:dpvo/Consequence :dpvo/ConsequenceOfFailure],
   :vs/term_status #voc/lstr "accepted@en"})

(def ConsequenceOfSuccess
  "The consequence(s) possible or arising from success of specified context"
  {:db/ident :dpvo/ConsequenceOfSuccess,
   :dcterms/created #inst "2022-03-23T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "The consequence(s) possible or arising from success of specified context@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Consequence of Success@en",
   :rdfs/subClassOf [:dpvo/Consequence :dpvo/ConsequenceOfSuccess],
   :vs/term_status #voc/lstr "accepted@en"})

(def Consult
  "to consult or query data"
  {:db/ident :dpvo/Consult,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #voc/lstr "to consult or query data@en",
   :dcterms/source
   ["https://specialprivacy.ercim.eu/vocabs/processing"
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Consult@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/processing#Query"],
   :rdfs/subClassOf [:dpvo/Use :dpvo/Consult :dpvo/Processing],
   :vs/term_status #voc/lstr "accepted@en"})

(def Consultation
  "Consultation is a process of receiving feedback, advice, or opinion from an external agency"
  {:db/ident :dpvo/Consultation,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog" "Paul Ryan"],
   :dcterms/description
   #voc/lstr
    "Consultation is a process of receiving feedback, advice, or opinion from an external agency@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Consultation@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/Consultation
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def ConsultationWithAuthority
  "Consultation with an authority or authoritative entity"
  {:db/ident :dpvo/ConsultationWithAuthority,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description
   #voc/lstr "Consultation with an authority or authoritative entity@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Consultation with Authority@en",
   :rdfs/subClassOf [:dpvo/Consultation
                     :dpvo/ConsultationWithAuthority
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def ConsultationWithDPO
  "Consultation with Data Protection Officer(s)"
  {:db/ident            :dpvo/ConsultationWithDPO,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description #voc/lstr
                         "Consultation with Data Protection Officer(s)@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Consultation with DPO@en",
   :rdfs/subClassOf     [:dpvo/Consultation
                         :dpvo/ConsultationWithDPO
                         :dpvo/TechnicalOrganisationalMeasure
                         :dpvo/OrganisationalMeasure],
   :vs/term_status      #voc/lstr "accepted@en"})

(def ConsultationWithDataSubject
  "Consultation with data subject(s) or their representative(s)"
  {:db/ident :dpvo/ConsultationWithDataSubject,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   #voc/lstr "Consultation with data subject(s) or their representative(s)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Consultation with Data Subject@en",
   :rdfs/subClassOf [:dpvo/Consultation
                     :dpvo/ConsultationWithDataSubject
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def ConsultationWithDataSubjectRepresentative
  "Consultation with representative of data subject(s)"
  {:db/ident :dpvo/ConsultationWithDataSubjectRepresentative,
   :dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   #voc/lstr "Consultation with representative of data subject(s)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Consultation with Data Subject Representative@en",
   :rdfs/subClassOf [:dpvo/ConsultationWithDataSubject
                     :dpvo/ConsultationWithDataSubjectRepresentative
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/Consultation
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr "Data subjects that consume goods or services for direct use@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Consumer@en",
   :rdfs/subClassOf [:dpvo/DataSubject
                     :dpvo/Consumer
                     :dpvo/LegalEntity
                     :dpvo/Entity
                     :dpvo/NaturalPerson],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Contextually relevant information not possible to represent through other core concepts@en",
   :dcterms/modified #inst "2022-06-15T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Context@en",
   :rdfs/subClassOf :dpvo/Context,
   :vs/term_status #voc/lstr "modified@en"})

(def ContinousFrequency
  "Frequency where occurences are continous"
  {:db/ident            :dpvo/ContinousFrequency,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Frequency where occurences are continous@en",
   :dcterms/modified    #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Continous Frequency@en",
   :rdfs/subClassOf     [:dpvo/Frequency
                         :dpvo/ContinousFrequency
                         :dpvo/Context],
   :vs/term_status      #voc/lstr "modified@en"})

(def Contract
  "Creation, completion, fulfilment, or performance of a contract involving specified processing"
  {:db/ident :dpvo/Contract,
   :dcterms/created #inst "2021-04-07T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Creation, completion, fulfilment, or performance of a contract involving specified processing@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Contract@en",
   :rdfs/subClassOf [:dpvo/LegalBasis
                     :dpvo/LegalAgreement
                     :dpvo/Contract
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def ContractPerformance
  "Fulfilment or performance of a contract involving specified processing"
  {:db/ident :dpvo/ContractPerformance,
   :dcterms/created #inst "2021-04-07T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description
   #voc/lstr
    "Fulfilment or performance of a contract involving specified processing@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Contract Performance@en",
   :rdfs/subClassOf [:dpvo/Contract
                     :dpvo/ContractPerformance
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/LegalAgreement
                     :dpvo/LegalBasis
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def ContractualTerms
  "Contractual terms governing data handling within or with an entity"
  {:db/ident :dpvo/ContractualTerms,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Axel Polleres" "Harshvardhan J. Pandit" "Mark Lizar" "Rob Brennan"],
   :dcterms/description
   #voc/lstr
    "Contractual terms governing data handling within or with an entity@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Contractual Terms@en",
   :rdfs/subClassOf [:dpvo/LegalAgreement
                     :dpvo/ContractualTerms
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between a Data Controller and a Data Processor@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Controller-Processor Agreement@en",
   :rdfs/subClassOf [:dpvo/DataProcessingAgreement
                     :dpvo/ControllerProcessorAgreement
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/LegalAgreement
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Copy
  "to produce an exact reprodution of the data"
  {:db/ident :dpvo/Copy,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #voc/lstr
                         "to produce an exact reprodution of the data@en",
   :dcterms/source "https://specialprivacy.ercim.eu/vocabs/processing",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Copy@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/processing#Copy"],
   :rdfs/subClassOf [:dpvo/Processing :dpvo/Copy],
   :vs/term_status #voc/lstr "accepted@en"})

(def CounterMoneyLaundering
  "Purposes associated with detection, prevention, and mitigation of mitigate money laundering"
  {:db/ident :dpvo/CounterMoneyLaundering,
   :dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Purposes associated with detection, prevention, and mitigation of mitigate money laundering@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Counter Money Laundering@en",
   :rdfs/subClassOf [:dpvo/FraudPreventionAndDetection
                     :dpvo/CounterMoneyLaundering
                     :dpvo/Purpose
                     :dpvo/EnforceSecurity],
   :vs/term_status #voc/lstr "accepted@en"})

(def Country
  "A political entity indicative of a sovereign or non-sovereign territorial state comprising of distinct geographical areas"
  {:db/ident :dpvo/Country,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "A political entity indicative of a sovereign or non-sovereign territorial state comprising of distinct geographical areas@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The definition of country is not intended for political interpretation. DPVCG welcomes alternate definitions based in existing sources with global scope, such as UN or ISO.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Country@en",
   :rdfs/subClassOf [:dpvo/Location :dpvo/Country],
   :vs/term_status #voc/lstr "accepted@en"})

(def CredentialManagement
  "Management of credentials and their use in authorisations"
  {:db/ident :dpvo/CredentialManagement,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   #voc/lstr "Management of credentials and their use in authorisations@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Credential Management@en",
   :rdfs/subClassOf [:dpvo/AuthorisationProcedure
                     :dpvo/CredentialManagement
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def CreditChecking
  "Purposes associated with monitoring, performing, or assessing credit worthiness or solvency"
  {:db/ident :dpvo/CreditChecking,
   :dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Purposes associated with monitoring, performing, or assessing credit worthiness or solvency@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Credit Checking@en",
   :rdfs/subClassOf [:dpvo/CustomerSolvencyMonitoring
                     :dpvo/CreditChecking
                     :dpvo/Purpose
                     :dpvo/CustomerManagement],
   :vs/term_status #voc/lstr "accepted@en"})

(def CryptographicAuthentication
  "Use of cryptography for authentication"
  {:db/ident :dpvo/CryptographicAuthentication,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Use of cryptography for authentication@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Cryptographic Authentication@en",
   :rdfs/subClassOf [:dpvo/AuthenticationProtocols
                     :dpvo/CryptographicMethods
                     :dpvo/CryptographicAuthentication
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def CryptographicKeyManagement
  "Management of cryptographic keys, including their generation, storage, assessment, and safekeeping"
  {:db/ident :dpvo/CryptographicKeyManagement,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Management of cryptographic keys, including their generation, storage, assessment, and safekeeping@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Cryptographic Key Management@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/CryptographicKeyManagement
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def CryptographicMethods
  "Use of cryptographic methods to perform tasks"
  {:db/ident :dpvo/CryptographicMethods,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Use of cryptographic methods to perform tasks@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Cryptographic Methods@en",
   :rdfs/subClassOf [:dpvo/TechnicalMeasure
                     :dpvo/CryptographicMethods
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Customer
  "Data subjects that purchase goods or services"
  {:db/ident :dpvo/Customer,
   :dcterms/created #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator ["Paul Ryan"
                     "Harshvardhan J. Pandit"
                     "Julian Flake"
                     "Beatriz Esteves"
                     "Georg P. Krog"],
   :dcterms/description #voc/lstr
                         "Data subjects that purchase goods or services@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "note: for B2B relations where customers are organisations, this concept only applies for data subjects@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Customer@en",
   :rdfs/subClassOf [:dpvo/DataSubject
                     :dpvo/Customer
                     :dpvo/LegalEntity
                     :dpvo/Entity
                     :dpvo/NaturalPerson],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Customer Care refers to purposes associated with purposes for providing assistance, resolving issues, ensuring satisfaction, etc. in relation to services provided@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Customer Care@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/purposes#Feedback"],
   :rdfs/subClassOf [:dpvo/CustomerManagement :dpvo/CustomerCare :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def CustomerClaimsManagement
  "Customer Claims Management refers to purposes associated with managing claims, including repayment of monies owed"
  {:db/ident :dpvo/CustomerClaimsManagement,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Beatriz" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Customer Claims Management refers to purposes associated with managing claims, including repayment of monies owed@en",
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Customer Claims Management@en",
   :rdfs/subClassOf
   [:dpvo/CustomerManagement :dpvo/CustomerClaimsManagement :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def CustomerManagement
  "Customer Management refers to purposes associated with managing activities related with past, current, and future customers"
  {:db/ident :dpvo/CustomerManagement,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Beatriz" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Customer Management refers to purposes associated with managing activities related with past, current, and future customers@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Customer Management@en",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/CustomerManagement],
   :vs/term_status #voc/lstr "accepted@en"})

(def CustomerOrderManagement
  "Customer Order Management refers to purposes associated with managing customer orders i.e. processing of an order related to customer's purchase of good or services"
  {:db/ident :dpvo/CustomerOrderManagement,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog" "Beatriz"],
   :dcterms/description
   #voc/lstr
    "Customer Order Management refers to purposes associated with managing customer orders i.e. processing of an order related to customer's purchase of good or services@en",
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Customer Order Management@en",
   :rdfs/subClassOf
   [:dpvo/CustomerManagement :dpvo/CustomerOrderManagement :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def CustomerRelationshipManagement
  "Customer Relationship Management refers to purposes associated with managing and analysing interactions with past, current, and potential customers"
  {:db/ident :dpvo/CustomerRelationshipManagement,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Beatriz" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Customer Relationship Management refers to purposes associated with managing and analysing interactions with past, current, and potential customers@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Customer Relationship Management@en",
   :rdfs/subClassOf [:dpvo/CustomerManagement
                     :dpvo/CustomerRelationshipManagement
                     :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def CustomerSolvencyMonitoring
  "Customer Solvency Monitoring refers to purposes associated with monitor solvency of customers for financial diligence"
  {:db/ident :dpvo/CustomerSolvencyMonitoring,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Beatriz" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Customer Solvency Monitoring refers to purposes associated with monitor solvency of customers for financial diligence@en",
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Customer Solvency Monitoring@en",
   :rdfs/subClassOf
   [:dpvo/CustomerManagement :dpvo/CustomerSolvencyMonitoring :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def CybersecurityAssessment
  "Assessment of cybersecurity capabilities in terms of vulnerabilities and effectiveness of controls"
  {:db/ident :dpvo/CybersecurityAssessment,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Assessment of cybersecurity capabilities in terms of vulnerabilities and effectiveness of controls@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Cybersecurity Assessment@en",
   :rdfs/subClassOf [:dpvo/SecurityAssessment
                     :dpvo/Assessment
                     :dpvo/CybersecurityAssessment
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/SecurityProcedure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def CybersecurityTraining
  "Training methods related to cybersecurity"
  {:db/ident :dpvo/CybersecurityTraining,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Training methods related to cybersecurity@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Cybersecurity Training@en",
   :rdfs/subClassOf [:dpvo/StaffTraining
                     :dpvo/CybersecurityTraining
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def DPIA
  "A DPIA involves determining the potential and actual impact of processing activities on individuals or groups of individuals"
  {:db/ident :dpvo/DPIA,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "A DPIA involves determining the potential and actual impact of processing activities on individuals or groups of individuals@en",
   :rdf/type :owl/Class,
   :rdfs/comment #voc/lstr
                  "Top class: Impact Assessment, and DPIA is sub-class@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Data Protection Impact Assessment (DPIA)@en",
   :rdfs/subClassOf [:dpvo/ImpactAssessment
                     :dpvo/DPIA
                     :dpvo/Assessment
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Damage
  "Impact that acts as or causes damages"
  {:db/ident            :dpvo/Damage,
   :dcterms/created     #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Impact that acts as or causes damages@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Damage@en",
   :rdfs/subClassOf     [:dpvo/Impact :dpvo/Damage :dpvo/Consequence],
   :vs/term_status      #voc/lstr "accepted@en"})

(def Data
  "A broad concept representing 'data' or 'information'"
  {:db/ident :dpvo/Data,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "A broad concept representing  'data' or 'information'@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Data@en",
   :rdfs/subClassOf :dpvo/Data,
   :vs/term_status #voc/lstr "accepted@en"})

(def DataBackupProtocols
  "Protocols or plans for backing up of data"
  {:db/ident            :dpvo/DataBackupProtocols,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description #voc/lstr
                         "Protocols or plans for backing up of data@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Data Backup Protocols@en",
   :rdfs/subClassOf     [:dpvo/TechnicalMeasure
                         :dpvo/DataBackupProtocols
                         :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status      #voc/lstr "accepted@en"})

(def DataController
  "The individual or organisation that decides (or controls) the purpose(s) of processing personal data."
  {:db/ident :dpvo/DataController,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres" "Javier Fernández"],
   :dcterms/description
   #voc/lstr
    "The individual or organisation that decides (or controls) the purpose(s) of processing personal data.@en",
   :dcterms/modified #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_7/oj",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The terms 'Controller' is usually the more common form of indicating a Data Controller. In ISO/IEC the term 'PII Controller' is used.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Data Controller@en",
   :rdfs/subClassOf [:dpvo/LegalEntity :dpvo/DataController :dpvo/Entity],
   :vs/term_status #voc/lstr "accepted@en"})

(def DataExporter
  "An entity that 'exports' data where exporting is considered a form of data transfer"
  {:db/ident :dpvo/DataExporter,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan Pandit" "David Hickey" "Georg Krog" "Paul Ryan"],
   :dcterms/description
   #voc/lstr
    "An entity that 'exports' data where exporting is considered a form of data transfer@en",
   :dcterms/source
   "https://edpb.europa.eu/our-work-tools/our-documents/recommendations/recommendations-012020-measures-supplement-transfer_en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The EU, in particular the EDPB, uses data exporter the context of cross-border data transfers/flows. These concepts are not bound by jurisdictional or geopolitical scopes within DPV and can thus be used for any notion of exporting@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Data Exporter@en",
   :rdfs/subClassOf [:dpvo/LegalEntity :dpvo/DataExporter :dpvo/Entity],
   :vs/term_status #voc/lstr "accepted@en"})

(def DataImporter
  "An entity that 'imports' data where importing is considered a form of data transfer"
  {:db/ident :dpvo/DataImporter,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator
   ["David Hickey" "Paul Ryan" "Harshvardhan Pandit" "Georg Krog"],
   :dcterms/description
   #voc/lstr
    "An entity that 'imports' data where importing is considered a form of data transfer@en",
   :dcterms/source
   "https://edpb.europa.eu/our-work-tools/our-documents/recommendations/recommendations-012020-measures-supplement-transfer_en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The EU, in particular the EDPB, uses data importing the context of cross-border data transfers/flows. These concepts are not bound by jurisdictional or geopolitical scopes within DPV and can thus be used for any notion of importing@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Data Importer@en",
   :rdfs/subClassOf
   [:dpvo/Recipient :dpvo/DataImporter :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "For specific role-based data processing agreements, see concepts for Processors and JointDataController agreements.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Data Processing Agreement@en",
   :rdfs/subClassOf [:dpvo/LegalAgreement
                     :dpvo/DataProcessingAgreement
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def DataProcessingRecord
  "Record of personal data processing, whether ex-ante or ex-post"
  {:db/ident :dpvo/DataProcessingRecord,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Record of personal data processing, whether ex-ante or ex-post@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Data Processing Record@en",
   :rdfs/subClassOf [:dpvo/RecordsOfActivities
                     :dpvo/DataProcessingRecord
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def DataProcessor
  "A ‘processor’ means a natural or legal person, public authority, agency or other body which processes personal data on behalf of the controller."
  {:db/ident :dpvo/DataProcessor,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A ‘processor’ means a natural or legal person, public authority, agency or other body which processes personal data on behalf of the controller.@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_8/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Data Processor@en",
   :rdfs/subClassOf
   [:dpvo/Recipient :dpvo/DataProcessor :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #voc/lstr "accepted@en"})

(def DataProtectionAuthority
  "An authority tasked with overseeing legal compliance regarding privacy and data protection laws."
  {:db/ident :dpvo/DataProtectionAuthority,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan Pandit" "Paul Ryan" "Georg Krog"],
   :dcterms/description
   #voc/lstr
    "An authority tasked with overseeing legal compliance regarding privacy and data protection laws.@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Data Protection Authority@en",
   :rdfs/subClassOf [:dpvo/Authority
                     :dpvo/DataProtectionAuthority
                     :dpvo/LegalEntity
                     :dpvo/Organisation
                     :dpvo/Entity
                     :dpvo/GovernmentalOrganisation],
   :vs/term_status #voc/lstr "accepted@en"})

(def DataProtectionOfficer
  "An entity within or authorised by an organisation to monitor internal compliance, inform and advise on data protection obligations and act as a contact point for data subjects and the supervisory authority."
  {:db/ident :dpvo/DataProtectionOfficer,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Georg Krog" "Paul Ryan"],
   :dcterms/description
   #voc/lstr
    "An entity within or authorised by an organisation to monitor internal compliance, inform and advise on data protection obligations and act as a contact point for data subjects and the supervisory authority.@en",
   :dcterms/modified #inst "2021-12-08T00:00:00.000-05:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_37/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Data Protection Officer@en",
   :rdfs/subClassOf [:dpvo/Representative
                     :dpvo/DataProtectionOfficer
                     :dpvo/LegalEntity
                     :dpvo/Entity],
   :vs/term_status #voc/lstr "modified@en"})

(def DataProtectionTraining
  "Training intended to increase knowledge regarding data protection"
  {:db/ident :dpvo/DataProtectionTraining,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Training intended to increase knowledge regarding data protection@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Data Protection Training@en",
   :rdfs/subClassOf [:dpvo/StaffTraining
                     :dpvo/DataProtectionTraining
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def DataPublishedByDataSubject
  "Data is published by the data subject"
  {:db/ident :dpvo/DataPublishedByDataSubject,
   :dcterms/created #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator "Julian Flake",
   :dcterms/description #voc/lstr "Data is published by the data subject@en",
   :rdf/type [:dpvo/DataSource
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/comment
   #voc/lstr
    "This refers to where that data was made publicly available by the data subject. An example of this would be a social media profile that the data subject has made publicly accessible.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Data published by Data Subject@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def DataRedaction
  "Removal of sensitive information from a data or document"
  {:db/ident :dpvo/DataRedaction,
   :dcterms/created #inst "2020-10-01T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Removal of sensitive information from a data or document@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Data Redaction@en",
   :rdfs/subClassOf [:dpvo/DataSanitisationTechnique
                     :dpvo/DataRedaction
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def DataSanitisationTechnique
  "Cleaning or any removal or re-organisation of elements in data based on selective criteria"
  {:db/ident :dpvo/DataSanitisationTechnique,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Cleaning or any removal or re-organisation of elements in data based on selective criteria@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Data Sanitisation Technique@en",
   :rdfs/subClassOf [:dpvo/TechnicalMeasure
                     :dpvo/DataSanitisationTechnique
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def DataSource
  "The source or origin of data"
  {:db/ident :dpvo/DataSource,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Beatriz Esteves" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description #voc/lstr "The source or origin of data@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Source' is the direct point of data collection; 'origin' would indicate the original/others points of where the data originates from.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Data Source@en",
   :rdfs/subClassOf [:dpvo/ProcessingContext :dpvo/DataSource :dpvo/Context],
   :vs/term_status #voc/lstr "accepted@en"})

(def DataSubProcessor
  "A 'sub-processor' is a processor engaged by another processor"
  {:db/ident :dpvo/DataSubProcessor,
   :dcterms/created #inst "2020-11-25T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "A 'sub-processor' is a processor engaged by another processor@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "sub-processor' is a commonly used term similar to 'sub-contractor' and does not have a specific legal definition@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Data Sub-Processor@en",
   :rdfs/subClassOf [:dpvo/DataProcessor
                     :dpvo/DataSubProcessor
                     :dpvo/LegalEntity
                     :dpvo/Entity
                     :dpvo/Recipient],
   :vs/term_status #voc/lstr "accepted@en"})

(def DataSubject
  "The individual (or category of individuals) whose personal data is being processed"
  {:db/ident :dpvo/DataSubject,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres" "Javier Fernández"],
   :dcterms/description
   #voc/lstr
    "The individual (or category of individuals) whose personal data is being processed@en",
   :dcterms/modified #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_1/oj",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The term 'data subject' is specific to the GDPR, but is functionally equivalent to the term 'individual' and the ISO/IEC term 'PII Principle'.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Data Subject@en",
   :rdfs/subClassOf
   [:dpvo/NaturalPerson :dpvo/LegalEntity :dpvo/DataSubject :dpvo/Entity],
   :vs/term_status #voc/lstr "accepted@en"})

(def DataSubjectRight
  "The rights applicable or provided to a Data Subject"
  {:db/ident :dpvo/DataSubjectRight,
   :dcterms/created #inst "2020-11-18T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Beatriz Esteves" "Harshvardhan Pandit"],
   :dcterms/description
   #voc/lstr "The rights applicable or provided to a Data Subject@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Based on use of definitions, the notion of 'Data Subject Right' can be equivalent to 'Individual Right' or 'Right of a Person'@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Data Subject Right@en",
   :rdfs/subClassOf [:dpvo/Right :dpvo/DataSubjectRight],
   :vs/term_status #voc/lstr "accepted@en"})

(def DataSubjectScale
  "Scale of Data Subject(s)"
  {:db/ident            :dpvo/DataSubjectScale,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Rana Saniei" "Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Scale of Data Subject(s)@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Data Subject Scale@en",
   :rdfs/subClassOf     [:dpvo/Scale
                         :dpvo/DataSubjectScale
                         :dpvo/ProcessingContext
                         :dpvo/Context],
   :vs/term_status      #voc/lstr "accepted@en"})

(def DataTransferImpactAssessment
  "Impact Assessment for conducting data transfers"
  {:db/ident            :dpvo/DataTransferImpactAssessment,
   :dcterms/created     #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description #voc/lstr
                         "Impact Assessment for conducting data transfers@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Data Transfer Impact Assessment@en",
   :rdfs/subClassOf     [:dpvo/ImpactAssessment
                         :dpvo/DataTransferImpactAssessment
                         :dpvo/Assessment
                         :dpvo/TechnicalOrganisationalMeasure
                         :dpvo/OrganisationalMeasure],
   :vs/term_status      #voc/lstr "accepted@en"})

(def DataTransferLegalBasis
  "Specific or special categories and instances of legal basis intended for justifying data transfers"
  {:db/ident :dpvo/DataTransferLegalBasis,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["David Hickey" "Georg P Krogg"],
   :dcterms/description
   #voc/lstr
    "Specific or special categories and instances of legal basis intended for justifying data transfers@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Data Transfer Legal Basis@en",
   :rdfs/subClassOf [:dpvo/LegalBasis :dpvo/DataTransferLegalBasis],
   :vs/term_status #voc/lstr "accepted@en"})

(def DataVolume
  "Volume or Scale of Data"
  {:db/ident            :dpvo/DataVolume,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Rana Saniei" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description #voc/lstr "Volume or Scale of Data@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Data Volume@en",
   :rdfs/subClassOf     [:dpvo/Scale
                         :dpvo/DataVolume
                         :dpvo/ProcessingContext
                         :dpvo/Context],
   :vs/term_status      #voc/lstr "accepted@en"})

(def DecentralisedLocations
  "Location that is spread across multiple separate areas with no distinction between their importance"
  {:db/ident :dpvo/DecentralisedLocations,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Location that is spread across multiple separate areas with no distinction between their importance@en",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Decentralised Locations@en",
   :rdfs/subClassOf [:dpvo/LocationFixture :dpvo/DecentralisedLocations],
   :vs/term_status #voc/lstr "modified@en"})

(def DecisionMaking
  "Processing that involves decision making"
  {:db/ident            :dpvo/DecisionMaking,
   :dcterms/created     #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Processing that involves decision making@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Decision Making@en",
   :rdfs/subClassOf     [:dpvo/ProcessingContext
                         :dpvo/DecisionMaking
                         :dpvo/Context],
   :vs/term_status      #voc/lstr "accepted@en"})

(def Deidentification
  "Removal of identity or information to reduce identifiability"
  {:db/ident :dpvo/Deidentification,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Mark Lizar" "Rob Brennan" "Axel Polleres" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr "Removal of identity or information to reduce identifiability@en",
   :dcterms/modified #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source "https://nvlpubs.nist.gov/nistpubs/ir/2015/NIST.IR.8053.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "De-Identification@en",
   :rdfs/subClassOf [:dpvo/DataSanitisationTechnique
                     :dpvo/Deidentification
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "modified@en"})

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
   #voc/lstr
    "Purposes associated with delivering goods and services requested or asked by consumer@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Delivery of Goods@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/purposes#Delivery"],
   :rdfs/subClassOf [:dpvo/RequestedServiceProvision
                     :dpvo/DeliveryOfGoods
                     :dpvo/ServiceProvision
                     :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def Derive
  "to create new derivative data from the original data"
  {:db/ident :dpvo/Derive,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr "to create new derivative data from the original data@en",
   :dcterms/source "https://specialprivacy.ercim.eu/vocabs/processing",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Derive indicates data is present or obtainable from existing data. For data that is created without such existence, see Infer.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Derive@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/processing#Derive"],
   :rdfs/subClassOf [:dpvo/Obtain :dpvo/Derive :dpvo/Processing],
   :vs/term_status #voc/lstr "accepted@en"})

(def DerivedPersonalData
  "Personal Data that is obtained or derived from other data"
  {:db/ident :dpvo/DerivedPersonalData,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   #voc/lstr "Personal Data that is obtained or derived from other data@en",
   :dcterms/modified #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Derived Data is data that is obtained through processing of existing data, e.g. deriving first name from full name. To indicate data that is derived but which was not present or evident within the source data, InferredPersonalData should be used.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Derived Personal Data@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Derived"],
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo/DerivedPersonalData :dpvo/Data],
   :vs/term_status #voc/lstr "accepted@en"})

(def DesignStandard
  "A set of rules or guidelines outlining criterias for design"
  {:db/ident :dpvo/DesignStandard,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Mark Lizar" "Axel Polleres" "Rob Brennan"],
   :dcterms/description
   #voc/lstr "A set of rules or guidelines outlining criterias for design@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Design Standard@en",
   :rdfs/subClassOf [:dpvo/GuidelinesPrinciple
                     :dpvo/DesignStandard
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Destruct
  "to process data in a way it no longer exists or cannot be repaired"
  {:db/ident :dpvo/Destruct,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "to process data in a way it no longer exists or cannot be repaired@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Destruct@en",
   :rdfs/subClassOf [:dpvo/Remove :dpvo/Destruct :dpvo/Processing],
   :vs/term_status #voc/lstr "accepted@en"})

(def DeterministicPseudonymisation
  "Pseudonymisation achieved through a deterministic function"
  {:db/ident :dpvo/DeterministicPseudonymisation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Pseudonymisation achieved through a deterministic function@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Deterministic Pseudonymisation@en",
   :rdfs/subClassOf [:dpvo/Pseudonymisation
                     :dpvo/DeterministicPseudonymisation
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure
                     :dpvo/DataSanitisationTechnique
                     :dpvo/Deidentification],
   :vs/term_status #voc/lstr "accepted@en"})

(def Detriment
  "Impact that acts as or causes detriments"
  {:db/ident            :dpvo/Detriment,
   :dcterms/created     #inst "2022-03-23T00:00:00.000-04:00",
   :dcterms/creator     ["Beatriz Esteves"
                         "Julian Flake"
                         "Harshvardhan J. Pandit"
                         "Fajar Ekaputra"
                         "Georg P Krog"],
   :dcterms/description #voc/lstr "Impact that acts as or causes detriments@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Detriment@en",
   :rdfs/subClassOf     [:dpvo/Impact :dpvo/Detriment :dpvo/Consequence],
   :vs/term_status      #voc/lstr "accepted@en"})

(def DifferentialPrivacy
  "Utilisation of differential privacy where information is shared as patterns or groups to withold individual elements"
  {:db/ident :dpvo/DifferentialPrivacy,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Utilisation of differential privacy where information is shared as patterns or groups to withold individual elements@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Differential Privacy@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/DifferentialPrivacy
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def DigitalRightsManagement
  "Management of access, use, and other operations associated with digital content"
  {:db/ident :dpvo/DigitalRightsManagement,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Management of access, use, and other operations associated with digital content@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Digital Rights Management@en",
   :rdfs/subClassOf [:dpvo/TechnicalMeasure
                     :dpvo/DigitalRightsManagement
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def DigitalSignatures
  "Expression and authentication of identity through digital information containing cryptographic signatures"
  {:db/ident :dpvo/DigitalSignatures,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Expression and authentication of identity through digital information containing cryptographic signatures@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Digital Signatures@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/DigitalSignatures
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def DirectMarketing
  "Purposes associated with conducting direct marketing i.e. marketing communicated directly to the individual"
  {:db/ident :dpvo/DirectMarketing,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Beatriz Esteves" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with conducting direct marketing i.e. marketing communicated directly to the individual@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Direct Marketing@en",
   :rdfs/subClassOf [:dpvo/Marketing :dpvo/DirectMarketing :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def DisasterRecoveryProcedures
  "Procedures related to management of disasters and recovery"
  {:db/ident :dpvo/DisasterRecoveryProcedures,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Procedures related to management of disasters and recovery@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Disaster Recovery Procedures@en",
   :rdfs/subClassOf [:dpvo/GovernanceProcedures
                     :dpvo/DisasterRecoveryProcedures
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Disclose
  "to make data known"
  {:db/ident :dpvo/Disclose,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #voc/lstr "to make data known@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Disclose@en",
   :rdfs/subClassOf [:dpvo/Processing :dpvo/Disclose],
   :vs/term_status #voc/lstr "accepted@en"})

(def DiscloseByTransmission
  "to disclose data by means of transmission"
  {:db/ident :dpvo/DiscloseByTransmission,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #voc/lstr
                         "to disclose data by means of transmission@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Disclose by Transmission@en",
   :rdfs/subClassOf
   [:dpvo/Disclose :dpvo/DiscloseByTransmission :dpvo/Processing],
   :vs/term_status #voc/lstr "accepted@en"})

(def DisputeManagement
  "Purposes associated with activities that manage disputes by natural persons, private bodies, or public authorities relevant to organisation"
  {:db/ident :dpvo/DisputeManagement,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit" "Beatriz Esteves"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with activities that manage disputes by natural persons, private bodies, or public authorities relevant to organisation@en",
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Dispute Management@en",
   :rdfs/subClassOf
   [:dpvo/OrganisationGovernance :dpvo/DisputeManagement :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def Disseminate
  "to spread data throughout"
  {:db/ident :dpvo/Disseminate,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #voc/lstr "to spread data throughout@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Disseminate@en",
   :rdfs/subClassOf [:dpvo/Disclose :dpvo/Disseminate :dpvo/Processing],
   :vs/term_status #voc/lstr "accepted@en"})

(def DistributedSystemSecurity
  "Security implementations provided using or over a distributed system"
  {:db/ident :dpvo/DistributedSystemSecurity,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Security implementations provided using or over a distributed system@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Distributed System Security@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/DistributedSystemSecurity
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def DocumentRandomisedPseudonymisation
  "Use of randomised pseudonymisation where the same elements are assigned different values in the same document or database"
  {:db/ident :dpvo/DocumentRandomisedPseudonymisation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Use of randomised pseudonymisation where the same elements are assigned different values in the same document or database@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Document Randomised Pseudonymisation@en",
   :rdfs/subClassOf [:dpvo/Pseudonymisation
                     :dpvo/DocumentRandomisedPseudonymisation
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure
                     :dpvo/DataSanitisationTechnique
                     :dpvo/Deidentification],
   :vs/term_status #voc/lstr "accepted@en"})

(def DocumentSecurity
  "Security measures enacted over documents to protect against tampering or restrict access"
  {:db/ident :dpvo/DocumentSecurity,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Security measures enacted over documents to protect against tampering or restrict access@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Document Security@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/DocumentSecurity
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Duration
  "The duration or temporal limitation"
  {:db/ident            :dpvo/Duration,
   :dcterms/created     #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "The duration or temporal limitation@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Duration@en",
   :rdfs/subClassOf     [:dpvo/Context :dpvo/Duration],
   :vs/term_status      #voc/lstr "accepted@en"})

(def EconomicUnion
  "A political union of two or more countries based on economic or trade agreements"
  {:db/ident :dpvo/EconomicUnion,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A political union of two or more countries based on economic or trade agreements@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Economic Union@en",
   :rdfs/subClassOf [:dpvo/Location :dpvo/EconomicUnion],
   :vs/term_status #voc/lstr "accepted@en"})

(def EducationalTraining
  "Training methods that are intended to provide education on topic(s)"
  {:db/ident :dpvo/EducationalTraining,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Training methods that are intended to provide education on topic(s)@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Educational Training@en",
   :rdfs/subClassOf [:dpvo/StaffTraining
                     :dpvo/EducationalTraining
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def EffectivenessDeterminationProcedures
  "Procedures intended to determine effectiveness of other measures"
  {:db/ident :dpvo/EffectivenessDeterminationProcedures,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Procedures intended to determine effectiveness of other measures@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Effectiveness Determination Procedures@en",
   :rdfs/subClassOf [:dpvo/Assessment
                     :dpvo/EffectivenessDeterminationProcedures
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def ElderlyDataSubject
  "Data subjects that are considered elderly (i.e. based on age)"
  {:db/ident :dpvo/ElderlyDataSubject,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   #voc/lstr "Data subjects that are considered elderly (i.e. based on age)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Elderly Data Subject@en",
   :rdfs/subClassOf [:dpvo/VulnerableDataSubject
                     :dpvo/ElderlyDataSubject
                     :dpvo/LegalEntity
                     :dpvo/Entity
                     :dpvo/DataSubject
                     :dpvo/NaturalPerson],
   :vs/term_status #voc/lstr "accepted@en"})

(def Employee
  "Data subjects that are employees"
  {:db/ident            :dpvo/Employee,
   :dcterms/created     #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P. Krog"
                         "Julian Flake"
                         "Harshvardhan J. Pandit"
                         "Beatriz Esteves"
                         "Paul Ryan"],
   :dcterms/description #voc/lstr "Data subjects that are employees@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Employee@en",
   :rdfs/subClassOf     [:dpvo/DataSubject
                         :dpvo/Employee
                         :dpvo/LegalEntity
                         :dpvo/Entity
                         :dpvo/NaturalPerson],
   :vs/term_status      #voc/lstr "accepted@en"})

(def Encryption
  "Technical measures consisting of encryption"
  {:db/ident            :dpvo/Encryption,
   :dcterms/created     #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator     ["Rob Brennan"
                         "Axel Polleres"
                         "Harshvardhan J. Pandit"
                         "Mark Lizar"],
   :dcterms/description #voc/lstr
                         "Technical measures consisting of encryption@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Encryption@en",
   :rdfs/subClassOf     [:dpvo/TechnicalMeasure
                         :dpvo/Encryption
                         :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status      #voc/lstr "accepted@en"})

(def EncryptionAtRest
  "Encryption of data when being stored (persistent encryption)"
  {:db/ident :dpvo/EncryptionAtRest,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Axel Polleres" "Mark Lizar" "Rob Brennan"],
   :dcterms/description
   #voc/lstr "Encryption of data when being stored (persistent encryption)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Encryption at Rest@en",
   :rdfs/subClassOf [:dpvo/Encryption
                     :dpvo/EncryptionAtRest
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def EncryptionInTransfer
  "Encryption of data in transit e.g. when being transferred from one location to another, including sharing"
  {:db/ident :dpvo/EncryptionInTransfer,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Axel Polleres" "Rob Brennan" "Harshvardhan J. Pandit" "Mark Lizar"],
   :dcterms/description
   #voc/lstr
    "Encryption of data in transit e.g. when being transferred from one location to another, including sharing@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Encryption in Transfer@en",
   :rdfs/subClassOf [:dpvo/Encryption
                     :dpvo/EncryptionInTransfer
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def EncryptionInUse
  "Encryption of data when it is being used"
  {:db/ident            :dpvo/EncryptionInUse,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Encryption of data when it is being used@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Encryption in Use@en",
   :rdfs/subClassOf     [:dpvo/Encryption
                         :dpvo/EncryptionInUse
                         :dpvo/TechnicalOrganisationalMeasure
                         :dpvo/TechnicalMeasure],
   :vs/term_status      #voc/lstr "accepted@en"})

(def EndToEndEncryption
  "Encrypted communications where data is encrypted by the sender and decrypted by the intended receiver to prevent access to any third party"
  {:db/ident :dpvo/EndToEndEncryption,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Encrypted communications where data is encrypted by the sender and decrypted by the intended receiver to prevent access to any third party@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "End-to-End Encryption (E2EE)@en",
   :rdfs/subClassOf [:dpvo/Encryption
                     :dpvo/EndToEndEncryption
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def EndlessDuration
  "Duration that is (known or intended to be) open ended or without an end"
  {:db/ident :dpvo/EndlessDuration,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Duration that is (known or intended to be) open ended or without an end@en",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type [:dpvo/Duration :owl/NamedIndividual :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Endless Duration@en",
   :vs/term_status #voc/lstr "modified@en"})

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
   #voc/lstr
    "Purposes associated with conducting or enforcing access control as a form of security@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Was previously \"Access Control\". Prefixed to distinguish from Technical Measure.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Enforce Access Control@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/purposes#Login"],
   :rdfs/subClassOf
   [:dpvo/EnforceSecurity :dpvo/EnforceAccessControl :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Purposes associated with ensuring and enforcing security for data, personnel, or other related matters@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Was previous \"Security\". Prefixed to distinguish from TechOrg measures.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Enforce Security@en",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/EnforceSecurity],
   :vs/term_status #voc/lstr "accepted@en"})

(def EnterIntoContract
  "Processing necessary to enter into contract"
  {:db/ident            :dpvo/EnterIntoContract,
   :dcterms/created     #inst "2021-04-07T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog" "Paul Ryan"],
   :dcterms/description #voc/lstr
                         "Processing necessary to enter into contract@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Enter Into Contract@en",
   :rdfs/subClassOf     [:dpvo/Contract
                         :dpvo/EnterIntoContract
                         :dpvo/TechnicalOrganisationalMeasure
                         :dpvo/LegalAgreement
                         :dpvo/LegalBasis
                         :dpvo/OrganisationalMeasure],
   :vs/term_status      #voc/lstr "accepted@en"})

(def Entity
  "A human or non-human 'thing' that constitutes as an entity"
  {:db/ident :dpvo/Entity,
   :dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "A human or non-human 'thing' that constitutes as an entity@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Entity@en",
   :rdfs/subClassOf :dpvo/Entity,
   :vs/term_status #voc/lstr "accepted@en"})

(def Erase
  "to delete data"
  {:db/ident :dpvo/Erase,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #voc/lstr "to delete data@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Erase@en",
   :rdfs/subClassOf [:dpvo/Remove :dpvo/Erase :dpvo/Processing],
   :vs/term_status #voc/lstr "accepted@en"})

(def EstablishContractualAgreement
  "Purposes associated with carrying out data processing to establish an agreement, such as for entering into a contract"
  {:db/ident :dpvo/EstablishContractualAgreement,
   :dcterms/created #inst "2022-11-09T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with carrying out data processing to establish an agreement, such as for entering into a contract@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Establish Contractual Agreement@en",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/EstablishContractualAgreement],
   :vs/term_status #voc/lstr "accepted@en"})

(def EvaluationOfIndividuals
  "Processing that involves evaluation of individuals"
  {:db/ident :dpvo/EvaluationOfIndividuals,
   :dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Processing that involves evaluation of individuals@en",
   :dcterms/modified #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Evaluation of Individuals@en",
   :rdfs/subClassOf [:dpvo/EvaluationScoring
                     :dpvo/EvaluationOfIndividuals
                     :dpvo/ProcessingContext
                     :dpvo/Context],
   :vs/term_status #voc/lstr "modified@en"})

(def EvaluationScoring
  "Processing that involves evaluation and scoring of individuals"
  {:db/ident :dpvo/EvaluationScoring,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Piero Bonatti" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Processing that involves evaluation and scoring of individuals@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Evaluation and Scoring@en",
   :rdfs/subClassOf
   [:dpvo/ProcessingContext :dpvo/EvaluationScoring :dpvo/Context],
   :vs/term_status #voc/lstr "accepted@en"})

(def ExplicitlyExpressedConsent
  "Consent that is expressed through an explicit action solely conveying a consenting decision"
  {:db/ident :dpvo/ExplicitlyExpressedConsent,
   :dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J. Pandit" "Julian Flake" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Consent that is expressed through an explicit action solely conveying a consenting decision@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Explicitly expressed consent is a more specific form of Expressed consent where the action taken must 'explicitly' relate to only the consent decision. Expressed consent where the consenting is part of other matters therefore cannot satisfy the requirements of explicitly expressed consent. An example of explicit action expressing the consenting decision is a button on a web form where the form only relates to consent, or it is accompanied with suitable text that reiterates what the consenting decision is about@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Explicitly Expressed Consent@en",
   :rdfs/subClassOf [:dpvo/ExpressedConsent
                     :dpvo/ExplicitlyExpressedConsent
                     :dpvo/Consent
                     :dpvo/InformedConsent
                     :dpvo/LegalBasis],
   :vs/term_status #voc/lstr "accepted@en"})

(def ExpressedConsent
  "Consent that is expressed through an action intended to convey a consenting decision"
  {:db/ident :dpvo/ExpressedConsent,
   :dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Harshvardhan J. Pandit" "Julian Flake"],
   :dcterms/description
   #voc/lstr
    "Consent that is expressed through an action intended to convey a consenting decision@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Expressed consent requires the individual take a specific and unambigious action that directly indicates their consent. This action may be a part of other processes such as setting preferences, or agreeing to a contract, or other matters not relating to consent. An example of expressed consent is interacting with a checkbox within a dashboard or clicking a button on a web form@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Expressed Consent@en",
   :rdfs/subClassOf [:dpvo/InformedConsent
                     :dpvo/ExpressedConsent
                     :dpvo/Consent
                     :dpvo/LegalBasis],
   :vs/term_status #voc/lstr "accepted@en"})

(def FederatedLocations
  "Location that is federated across multiple separate areas with designation of a primary or central location"
  {:db/ident :dpvo/FederatedLocations,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Location that is federated across multiple separate areas with designation of a primary or central location@en",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Federated Locations@en",
   :rdfs/subClassOf [:dpvo/LocationFixture :dpvo/FederatedLocations],
   :vs/term_status #voc/lstr "modified@en"})

(def FileSystemSecurity
  "Security implemented over a file system"
  {:db/ident :dpvo/FileSystemSecurity,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Security implemented over a file system@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "File System Security@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/FileSystemSecurity
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Filter
  "to filter or keep data for some criteria"
  {:db/ident            :dpvo/Filter,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description #voc/lstr "to filter or keep data for some criteria@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Filter@en",
   :rdfs/subClassOf     [:dpvo/Transform :dpvo/Filter :dpvo/Processing],
   :vs/term_status      #voc/lstr "accepted@en"})

(def FixedLocation
  "Location that is fixed i.e. known to occur at a specific place"
  {:db/ident :dpvo/FixedLocation,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Location that is fixed i.e. known to occur at a specific place@en",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Fixed Location@en",
   :rdfs/subClassOf [:dpvo/LocationFixture :dpvo/FixedLocation],
   :vs/term_status #voc/lstr "modified@en"})

(def FixedMultipleLocations
  "Location that is fixed with multiple places e.g. multiple cities"
  {:db/ident :dpvo/FixedMultipleLocations,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Location that is fixed with multiple places e.g. multiple cities@en",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Fixed Multiple Locations@en",
   :rdfs/subClassOf
   [:dpvo/FixedLocation :dpvo/FixedMultipleLocations :dpvo/LocationFixture],
   :vs/term_status #voc/lstr "modified@en"})

(def FixedOccurencesDuration
  "Duration that takes place a fixed number of times e.g. 3 times"
  {:db/ident :dpvo/FixedOccurencesDuration,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Duration that takes place a fixed number of times e.g. 3 times@en",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Fixed Occurences Duration@en",
   :rdfs/subClassOf
   [:dpvo/Duration :dpvo/FixedOccurencesDuration :dpvo/Context],
   :vs/term_status #voc/lstr "modified@en"})

(def FixedSingularLocation
  "Location that is fixed at a specific place e.g. a city"
  {:db/ident :dpvo/FixedSingularLocation,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Location that is fixed at a specific place e.g. a city@en",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Fixed Singular Location@en",
   :rdfs/subClassOf
   [:dpvo/FixedLocation :dpvo/FixedSingularLocation :dpvo/LocationFixture],
   :vs/term_status #voc/lstr "modified@en"})

(def ForProfitOrganisation
  "An organisation that aims to achieve profit as its primary goal"
  {:db/ident :dpvo/ForProfitOrganisation,
   :dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "An organisation that aims to achieve profit as its primary goal@en",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "For-Profit Organisation@en",
   :rdfs/subClassOf [:dpvo/Organisation
                     :dpvo/ForProfitOrganisation
                     :dpvo/LegalEntity
                     :dpvo/Entity],
   :vs/term_status #voc/lstr "modified@en"})

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
   #voc/lstr
    "Purposes associated with fraud detection, prevention, and mitigation@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Fraud Prevention and Detection@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/purposes#Government"],
   :rdfs/subClassOf
   [:dpvo/EnforceSecurity :dpvo/FraudPreventionAndDetection :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def Frequency
  "The frequency or information about periods and repetitions in terms of recurrence."
  {:db/ident :dpvo/Frequency,
   :dcterms/created #inst "2022-02-16T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "The frequency or information about periods and repetitions in terms of recurrence.@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Frequency@en",
   :rdfs/subClassOf [:dpvo/Context :dpvo/Frequency],
   :vs/term_status #voc/lstr "accepted@en"})

(def FulfilmentOfContractualObligation
  "Purposes associated with carrying out data processing to fulfill a contractual obligation"
  {:db/ident :dpvo/FulfilmentOfContractualObligation,
   :dcterms/created #inst "2022-11-09T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with carrying out data processing to fulfill a contractual obligation@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Fulfilment of Contractual Obligation@en",
   :rdfs/subClassOf [:dpvo/FulfilmentOfObligation
                     :dpvo/FulfilmentOfContractualObligation
                     :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def FulfilmentOfObligation
  "Purposes associated with carrying out data processing to fulfill an obligation"
  {:db/ident :dpvo/FulfilmentOfObligation,
   :dcterms/created #inst "2022-11-09T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with carrying out data processing to fulfill an obligation@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Fulfilment of Obligation@en",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/FulfilmentOfObligation],
   :vs/term_status #voc/lstr "accepted@en"})

(def FullyAutomatedProcessing
  "Processing that is fully automated"
  {:db/ident            :dpvo/FullyAutomatedProcessing,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Processing that is fully automated@en",
   :rdf/type            [:dpvo/AutomationOfProcessing
                         :owl/NamedIndividual
                         :dpvo/ProcessingContext
                         :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Fully Automated Processing@en",
   :vs/term_status      #voc/lstr "accepted@en"})

(def FullyRandomisedPseudonymisation
  "Use of randomised pseudonymisation where the same elements are assigned different values each time they occur"
  {:db/ident :dpvo/FullyRandomisedPseudonymisation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Use of randomised pseudonymisation where the same elements are assigned different values each time they occur@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Fully Randomised Pseudonymisation@en",
   :rdfs/subClassOf [:dpvo/Pseudonymisation
                     :dpvo/FullyRandomisedPseudonymisation
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure
                     :dpvo/DataSanitisationTechnique
                     :dpvo/Deidentification],
   :vs/term_status #voc/lstr "accepted@en"})

(def Generate
  "to generate or create data"
  {:db/ident            :dpvo/Generate,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "to generate or create data@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Generate@en",
   :rdfs/subClassOf     [:dpvo/Obtain :dpvo/Generate :dpvo/Processing],
   :vs/term_status      #voc/lstr "accepted@en"})

(def GeneratedPersonalData
  "Personal Data that is generated or brought into existence without relation to existing data i.e. it is not derived or inferred from other data"
  {:db/ident :dpvo/GeneratedPersonalData,
   :dcterms/created #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Personal Data that is generated or brought into existence without relation to existing data i.e. it is not derived or inferred from other data@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Generated Data is used to indicate data that is produced and is not derived or inferred from other data@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Generated Personal Data@en",
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo/GeneratedPersonalData :dpvo/Data],
   :vs/term_status #voc/lstr "accepted@en"})

(def GeographicCoverage
  "Indicate of scale in terms of geographic coverage"
  {:db/ident            :dpvo/GeographicCoverage,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description #voc/lstr
                         "Indicate of scale in terms of geographic coverage@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Geographic Coverage@en",
   :rdfs/subClassOf     [:dpvo/Scale
                         :dpvo/GeographicCoverage
                         :dpvo/ProcessingContext
                         :dpvo/Context],
   :vs/term_status      #voc/lstr "accepted@en"})

(def GlobalScale
  "Geographic coverage spanning the entire globe"
  {:db/ident            :dpvo/GlobalScale,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Geographic coverage spanning the entire globe@en",
   :rdf/type            [:dpvo/GeographicCoverage
                         :owl/NamedIndividual
                         :dpvo/Scale
                         :dpvo/ProcessingContext
                         :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Global Scale@en",
   :vs/term_status      #voc/lstr "accepted@en"})

(def GovernanceProcedures
  "Procedures related to governance (e.g. organisation, unit, team, process, system)"
  {:db/ident :dpvo/GovernanceProcedures,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Procedures related to governance (e.g. organisation, unit, team, process, system)@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Governance Procedures@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/GovernanceProcedures
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def GovernmentalOrganisation
  "An organisation managed or part of government"
  {:db/ident            :dpvo/GovernmentalOrganisation,
   :dcterms/created     #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "An organisation managed or part of government@en",
   :dcterms/modified    #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Governmental Organisation@en",
   :rdfs/subClassOf     [:dpvo/Organisation
                         :dpvo/GovernmentalOrganisation
                         :dpvo/LegalEntity
                         :dpvo/Entity],
   :vs/term_status      #voc/lstr "modified@en"})

(def GuardianOfDataSubject
  "Guardian(s) of data subjects such as children"
  {:db/ident            :dpvo/GuardianOfDataSubject,
   :dcterms/created     #inst "2022-08-03T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description #voc/lstr
                         "Guardian(s) of data subjects such as children@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Guardian(s) of Data Subject@en",
   :rdfs/subClassOf     [:dpvo/DataSubject
                         :dpvo/GuardianOfDataSubject
                         :dpvo/LegalEntity
                         :dpvo/Entity
                         :dpvo/NaturalPerson],
   :vs/term_status      #voc/lstr "accepted@en"})

(def GuidelinesPrinciple
  "Guidelines or Principles regarding processing and operational measures"
  {:db/ident :dpvo/GuidelinesPrinciple,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Axel Polleres" "Mark Lizar" "Harshvardhan J. Pandit" "Rob Brennan"],
   :dcterms/description
   #voc/lstr
    "Guidelines or Principles regarding processing and operational measures@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "GuidelinesPrinciple@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/GuidelinesPrinciple
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def HardwareSecurityProtocols
  "Security protocols implemented at or within hardware"
  {:db/ident :dpvo/HardwareSecurityProtocols,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Security protocols implemented at or within hardware@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Hardware Security Protocols@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/HardwareSecurityProtocols
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Harm
  "Impact that acts as or causes harms"
  {:db/ident            :dpvo/Harm,
   :dcterms/created     #inst "2022-08-13T00:00:00.000-04:00",
   :dcterms/creator     ["Beatriz Esteves"
                         "Georg P Krog"
                         "Harshvardhan J. Pandit"
                         "Julian Flake"
                         "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Impact that acts as or causes harms@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Harm@en",
   :rdfs/subClassOf     [:dpvo/Damage
                         :dpvo/Harm
                         :dpvo/Consequence
                         :dpvo/Impact],
   :vs/term_status      #voc/lstr "changed@en"})

(def HashFunctions
  "Use of hash functions to map information or to retrieve a prior categorisation"
  {:db/ident :dpvo/HashFunctions,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Use of hash functions to map information or to retrieve a prior categorisation@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Hash Functions@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/HashFunctions
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def HashMessageAuthenticationCode
  "Use of HMAC where message authentication code (MAC) utilise a cryptographic hash function and a secret cryptographic key"
  {:db/ident :dpvo/HashMessageAuthenticationCode,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Use of HMAC where message authentication code (MAC) utilise a cryptographic hash function and a secret cryptographic key@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Hash-based Message Authentication Code (HMAC)@en",
   :rdfs/subClassOf [:dpvo/CryptographicAuthentication
                     :dpvo/HashMessageAuthenticationCode
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure
                     :dpvo/CryptographicMethods
                     :dpvo/AuthenticationProtocols],
   :vs/term_status #voc/lstr "accepted@en"})

(def HomomorphicEncryption
  "Use of Homomorphic encryption that permits computations on encrypted data without decrypting it"
  {:db/ident :dpvo/HomomorphicEncryption,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Use of Homomorphic encryption that permits computations on encrypted data without decrypting it@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Homomorphic Encryption@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/HomomorphicEncryption
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def HugeDataVolume
  "Data volume that is considered huge or more than large within the context"
  {:db/ident :dpvo/HugeDataVolume,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Data volume that is considered huge or more than large within the context@en",
   :rdf/type [:owl/NamedIndividual
              :dpvo/DataVolume
              :dpvo/ProcessingContext
              :dpvo/Context
              :dpvo/Scale],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Huge Data Volume@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def HugeScaleOfDataSubjects
  "Scale of data subjects considered huge or more than large within the context"
  {:db/ident :dpvo/HugeScaleOfDataSubjects,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Scale of data subjects considered huge or more than large within the context@en",
   :rdf/type [:dpvo/DataSubjectScale
              :owl/NamedIndividual
              :dpvo/Scale
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Huge Scale Of Data Subjects@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def HumanInvolvement
  "The involvement of humans in specified context"
  {:db/ident :dpvo/HumanInvolvement,
   :dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "The involvement of humans in specified context@en",
   :dcterms/modified #inst "2022-06-15T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Human Involvement here broadly refers to any involvement by a human in the context of carrying out processing. This may include verification of outcomes, providing input data for making decisions, or overseeing activities.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Human Involvement@en",
   :rdfs/subClassOf [:dpvo/AutomationOfProcessing
                     :dpvo/HumanInvolvement
                     :dpvo/ProcessingContext
                     :dpvo/Context],
   :vs/term_status #voc/lstr "accepted@en"})

(def HumanInvolvementForInput
  "Human involvement for the purposes of providing inputs"
  {:db/ident :dpvo/HumanInvolvementForInput,
   :dcterms/created #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Human involvement for the purposes of providing inputs@en",
   :rdf/type [:owl/NamedIndividual
              :dpvo/HumanInvolvement
              :dpvo/Context
              :dpvo/AutomationOfProcessing
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Human Involvement for Input@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def HumanInvolvementForOversight
  "Human involvement for the purposes of having oversight over a system, its operations, inputs, or outputs"
  {:db/ident :dpvo/HumanInvolvementForOversight,
   :dcterms/created #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Human involvement for the purposes of having oversight over a system, its operations, inputs, or outputs@en",
   :rdf/type [:owl/NamedIndividual
              :dpvo/HumanInvolvement
              :dpvo/Context
              :dpvo/AutomationOfProcessing
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Human Involvement for Oversight@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def HumanInvolvementForVerification
  "Human involvement for the purposes of verification of a system, its operations, inputs, or outputs"
  {:db/ident :dpvo/HumanInvolvementForVerification,
   :dcterms/created #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Human involvement for the purposes of verification of a system, its operations, inputs, or outputs@en",
   :rdf/type [:owl/NamedIndividual
              :dpvo/HumanInvolvement
              :dpvo/Context
              :dpvo/AutomationOfProcessing
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Human Involvement for Verification@en",
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Purposes associated with managing humans and 'human resources' within the organisation for effective and efficient operations.@en",
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "HR is a broad concept. Its management includes, amongst others - recruiting employees and intermediaries e.g. brokers, independent representatives; payroll administration, remunerations, commissions, and wages; and application of social legislation.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Human Resource Management@en",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/HumanResourceManagement],
   :vs/term_status #voc/lstr "accepted@en"})

(def IdentityManagementMethod
  "Management of identity and identity-based processes"
  {:db/ident :dpvo/IdentityManagementMethod,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Management of identity and identity-based processes@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Identity Management Method@en",
   :rdfs/subClassOf [:dpvo/AuthorisationProcedure
                     :dpvo/IdentityManagementMethod
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Purposes associated with verifying or authorising identity as a form of security@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Identity Verification@en",
   :rdfs/subClassOf
   [:dpvo/EnforceSecurity :dpvo/IdentityVerification :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr "Data subjects that are immigrants (for a jurisdiction)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Immigrant@en",
   :rdfs/subClassOf [:dpvo/DataSubject
                     :dpvo/Immigrant
                     :dpvo/LegalEntity
                     :dpvo/Entity
                     :dpvo/NaturalPerson],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "The impact(s) possible or arising as a consequence from specified context@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Impact is a stronger notion of consequence in terms of influence, change, or effect on something e.g. for impact assessments@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Impact@en",
   :rdfs/subClassOf [:dpvo/Consequence :dpvo/Impact],
   :vs/term_status #voc/lstr "accepted@en"})

(def ImpactAssessment
  "Calculating or determining the likelihood of impact of an existing or proposed process, which can involve risks or detriments."
  {:db/ident :dpvo/ImpactAssessment,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Calculating or determining the likelihood of impact of an existing or proposed process, which can involve risks or detriments.@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Impact Assessment@en",
   :rdfs/subClassOf [:dpvo/Assessment
                     :dpvo/ImpactAssessment
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def ImpliedConsent
  "Consent that is implied indirectly through an action not associated solely with conveying a consenting decision"
  {:db/ident :dpvo/ImpliedConsent,
   :dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan" "Julian Flake"],
   :dcterms/description
   #voc/lstr
    "Consent that is implied indirectly through an action not associated solely with conveying a consenting decision@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Implied consent is expected to also be Informed Consent. An example is a CCTV notice outside a monitored area that informs the individuals that by walking in they would be consenting to the use of camera for surveillance.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Implied Consent@en",
   :rdfs/subClassOf
   [:dpvo/InformedConsent :dpvo/ImpliedConsent :dpvo/Consent :dpvo/LegalBasis],
   :vs/term_status #voc/lstr "accepted@en"})

(def Importance
  "An indication of 'importance' within a context"
  {:db/ident :dpvo/Importance,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator ["Beatriz Esteves"
                     "Georg P Krog"
                     "Julian Flake"
                     "Harshvardhan J. Pandit"
                     "Paul Ryan"],
   :dcterms/description #voc/lstr
                         "An indication of 'importance' within a context@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Importance can be used to express importance, desirability, relevance, or significance as a context.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Importance@en",
   :rdfs/subClassOf [:dpvo/Context :dpvo/Importance],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Purposes associated with improving existing products and services@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Improve Existing Products and Services@en",
   :rdfs/subClassOf [:dpvo/OptimisationForController
                     :dpvo/ImproveExistingProductsAndServices
                     :dpvo/ServiceProvision
                     :dpvo/Purpose
                     :dpvo/ServiceOptimisation],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Purposes associated with improving customer-relationship management (CRM) processes@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Improve Internal CRM Processes@en",
   :rdfs/subClassOf [:dpvo/OptimisationForController
                     :dpvo/CustomerRelationshipManagement
                     :dpvo/ImproveInternalCRMProcesses
                     :dpvo/ServiceProvision
                     :dpvo/Purpose
                     :dpvo/ServiceOptimisation
                     :dpvo/CustomerManagement],
   :vs/term_status #voc/lstr "accepted@en"})

(def IncidentManagementProcedures
  "Procedures related to management of incidents"
  {:db/ident :dpvo/IncidentManagementProcedures,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Procedures related to management of incidents@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Incident Management Procedures@en",
   :rdfs/subClassOf [:dpvo/GovernanceProcedures
                     :dpvo/IncidentManagementProcedures
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def IncidentReportingCommunication
  "Procedures related to management of incident reporting"
  {:db/ident :dpvo/IncidentReportingCommunication,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Procedures related to management of incident reporting@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Incident Reporting Communication@en",
   :rdfs/subClassOf [:dpvo/GovernanceProcedures
                     :dpvo/IncidentReportingCommunication
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def IncorrectData
  "Data that is known to be incorrect or inconsistent with some quality requirements"
  {:db/ident :dpvo/IncorrectData,
   :dcterms/created #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Data that is known to be incorrect or inconsistent with some quality requirements@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Incorrect Data@en",
   :rdfs/subClassOf [:dpvo/Data :dpvo/IncorrectData],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Purposes associated with improving robustness and resilience of services@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Increase Service Robustness@en",
   :rdfs/subClassOf [:dpvo/OptimisationForController
                     :dpvo/IncreaseServiceRobustness
                     :dpvo/ServiceProvision
                     :dpvo/Purpose
                     :dpvo/ServiceOptimisation],
   :vs/term_status #voc/lstr "accepted@en"})

(def IndeterminateDuration
  "Duration that is indeterminate or cannot be determined"
  {:db/ident :dpvo/IndeterminateDuration,
   :dcterms/created #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Duration that is indeterminate or cannot be determined@en",
   :rdf/type [:dpvo/Duration :owl/NamedIndividual :dpvo/Context],
   :rdfs/comment
   #voc/lstr
    "Indeterminate means (exact or otherwise) information about the duration cannot be determined, which is distinct from 'EndlessDuration' where it is known (or decided) that the duration is open-ended or without an end.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Indeterminate Duration@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def IndustryConsortium
  "A consortium established and comprising on industry organisations"
  {:db/ident :dpvo/IndustryConsortium,
   :dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A consortium established and comprising on industry organisations@en",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :dcterms/source "http://purl.org/adms",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Industry Consortium@en",
   :rdfs/subClassOf
   [:dpvo/Organisation :dpvo/IndustryConsortium :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #voc/lstr "modified@en"})

(def Infer
  "to infer data from existing data"
  {:db/ident :dpvo/Infer,
   :dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "to infer data from existing data@en",
   :dcterms/modified #inst "2022-10-14T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Infer indicates data that is derived without it being present or obtainable from existing data. For data that is presented, and is 'extracted' or 'obtained' from existing data, see Derive.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Infer@en",
   :rdfs/subClassOf [:dpvo/Derive :dpvo/Infer :dpvo/Processing :dpvo/Obtain],
   :vs/term_status #voc/lstr "modified@en"})

(def InferredPersonalData
  "Personal Data that is obtained through inference from other data"
  {:db/ident :dpvo/InferredPersonalData,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Personal Data that is obtained through inference from other data@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Inferred Data is derived data generated from existing data, but which did not originally exist within it, e.g. inferring demographics from browsing history.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Inferred Personal Data@en",
   :rdfs/subClassOf [:dpvo/GeneratedPersonalData
                     :dpvo/DerivedPersonalData
                     :dpvo/InferredPersonalData
                     :dpvo/Data
                     :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def InformationFlowControl
  "Use of measures to control information flows"
  {:db/ident :dpvo/InformationFlowControl,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Use of measures to control information flows@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Information Flow Control@en",
   :rdfs/subClassOf [:dpvo/TechnicalMeasure
                     :dpvo/InformationFlowControl
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def InformationSecurityPolicy
  "Policy regarding security of information"
  {:db/ident :dpvo/InformationSecurityPolicy,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Policy regarding security of information@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Information Security Policy@en",
   :rdfs/subClassOf [:dpvo/Policy
                     :dpvo/InformationSecurityPolicy
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def InformedConsent
  "Consent that is informed i.e. with the requirement to provide sufficient information to make a consenting decision"
  {:db/ident :dpvo/InformedConsent,
   :dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Julian Flake" "Harshvardhan J. Pandit" "Paul Ryan" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Consent that is informed i.e. with the requirement to provide sufficient information to make a consenting decision@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The specifics for what information should be provided or made available will depend on the context, use-case, or relevant legal requirements@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Informed Consent@en",
   :rdfs/subClassOf [:dpvo/Consent :dpvo/InformedConsent :dpvo/LegalBasis],
   :vs/term_status #voc/lstr "accepted@en"})

(def InnovativeUseOfNewTechnologies
  "Processing that involves use of innovative and new technologies"
  {:db/ident :dpvo/InnovativeUseOfNewTechnologies,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Piero Bonatti"],
   :dcterms/description
   #voc/lstr
    "Processing that involves use of innovative and new technologies@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Innovative Use of New Technologies@en",
   :rdfs/subClassOf
   [:dpvo/ProcessingContext :dpvo/InnovativeUseOfNewTechnologies :dpvo/Context],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Purposes associated with optimisation of internal resource availability and usage for organisation@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Internal Resource Optimisation@en",
   :rdfs/subClassOf [:dpvo/OptimisationForController
                     :dpvo/InternalResourceOptimisation
                     :dpvo/ServiceProvision
                     :dpvo/Purpose
                     :dpvo/ServiceOptimisation],
   :vs/term_status #voc/lstr "accepted@en"})

(def InternationalOrganisation
  "An organisation and its subordinate bodies governed by public international law, or any other body which is set up by, or on the basis of, an agreement between two or more countries"
  {:db/ident :dpvo/InternationalOrganisation,
   :dcterms/created #inst "2022-03-23T00:00:00.000-04:00",
   :dcterms/creator ["Julian Flake" "Georg P. Krog"],
   :dcterms/description
   #voc/lstr
    "An organisation and its subordinate bodies governed by public international law, or any other body which is set up by, or on the basis of, an agreement between two or more countries@en",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_26/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "International Organisation@en",
   :rdfs/subClassOf [:dpvo/Organisation
                     :dpvo/InternationalOrganisation
                     :dpvo/LegalEntity
                     :dpvo/Entity],
   :vs/term_status #voc/lstr "modified@en"})

(def IntrusionDetectionSystem
  "Use of measures to detect intrusions and other unauthorised attempts to gain access to a system"
  {:db/ident :dpvo/IntrusionDetectionSystem,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Use of measures to detect intrusions and other unauthorised attempts to gain access to a system@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Intrusion Detection System@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/IntrusionDetectionSystem
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def JobApplicant
  "Data subjects that apply for jobs or employments"
  {:db/ident            :dpvo/JobApplicant,
   :dcterms/created     #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     ["Beatriz Esteves"
                         "Paul Ryan"
                         "Julian Flake"
                         "Harshvardhan J. Pandit"
                         "Georg P. Krog"],
   :dcterms/description #voc/lstr
                         "Data subjects that apply for jobs or employments@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Job Applicant@en",
   :rdfs/subClassOf     [:dpvo/Applicant
                         :dpvo/JobApplicant
                         :dpvo/LegalEntity
                         :dpvo/Entity
                         :dpvo/DataSubject
                         :dpvo/NaturalPerson],
   :vs/term_status      #voc/lstr "accepted@en"})

(def JointDataControllers
  "A group of Data Controllers that jointly determine the purposes and means of processing"
  {:db/ident :dpvo/JointDataControllers,
   :dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator ["Georg Krog" "Harshvardhan Pandit"],
   :dcterms/description
   #voc/lstr
    "A group of Data Controllers that jointly determine the purposes and means of processing@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr "To indicate the membership, hasDataController may be used@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Joint Data Controllers@en",
   :rdfs/subClassOf [:dpvo/DataController
                     :dpvo/JointDataControllers
                     :dpvo/LegalEntity
                     :dpvo/Entity],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between Controllers within a Joint Controllers relationship@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Joint Data Controllers Agreement@en",
   :rdfs/subClassOf [:dpvo/DataProcessingAgreement
                     :dpvo/JointDataControllersAgreement
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/LegalAgreement
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Justification
  "A form of documentation providing reaosns, explanations, or justifications"
  {:db/ident :dpvo/Justification,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A form of documentation providing reaosns, explanations, or justifications@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Justification@en",
   :rdfs/subClassOf [:dpvo/Context :dpvo/Justification],
   :vs/term_status #voc/lstr "accepted@en"})

(def LargeDataVolume
  "Data volume that is considered large within the context"
  {:db/ident :dpvo/LargeDataVolume,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Data volume that is considered large within the context@en",
   :rdf/type [:dpvo/DataVolume
              :owl/NamedIndividual
              :dpvo/ProcessingContext
              :dpvo/Context
              :dpvo/Scale],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Large Data Volume@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def LargeScaleOfDataSubjects
  "Scale of data subjects considered large within the context"
  {:db/ident :dpvo/LargeScaleOfDataSubjects,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Scale of data subjects considered large within the context@en",
   :rdf/type [:dpvo/DataSubjectScale
              :owl/NamedIndividual
              :dpvo/Scale
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Large Scale Of Data Subjects@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def LargeScaleProcessing
  "Processing that takes place at large scales (as specified by some criteria)"
  {:db/ident :dpvo/LargeScaleProcessing,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Piero Bonatti"],
   :dcterms/description
   #voc/lstr
    "Processing that takes place at large scales (as specified by some criteria)@en",
   :dcterms/modified #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type [:owl/NamedIndividual
              :dpvo/ProcessingScale
              :dpvo/Scale
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/comment
   #voc/lstr
    "The exact definition of what constitutes \"large scale\" depends on use of jurisdictional, domain-specific, or other forms of externally defined criterias. Where possible, this should be reflected by extending this term with the appropriate context.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Large Scale Processing@en",
   :vs/term_status #voc/lstr "modified@en"})

(def Law
  "A law is a set of rules created by government or authorities"
  {:db/ident :dpvo/Law,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "A law is a set of rules created by government or authorities@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Law@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def Lawful
  "State of being lawful or legally compliant"
  {:db/ident            :dpvo/Lawful,
   :dcterms/created     #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "State of being lawful or legally compliant@en",
   :rdf/type            [:owl/NamedIndividual
                         :dpvo/Lawfulness
                         :dpvo/Context
                         :dpvo/ComplianceStatus
                         :dpvo/Status],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Lawful@en",
   :vs/term_status      #voc/lstr "accepted@en"})

(def Lawfulness
  "Status associated with expressing lawfullness or legal compliance"
  {:db/ident :dpvo/Lawfulness,
   :dcterms/created #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Status associated with expressing lawfullness or legal compliance@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Lawfulness@en",
   :rdfs/subClassOf
   [:dpvo/ComplianceStatus :dpvo/Lawfulness :dpvo/Status :dpvo/Context],
   :vs/term_status #voc/lstr "accepted@en"})

(def LawfulnessUnkown
  "State of the lawfulness not being known"
  {:db/ident            :dpvo/LawfulnessUnkown,
   :dcterms/created     #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "State of the lawfulness not being known@en",
   :rdf/type            [:owl/NamedIndividual
                         :dpvo/Lawfulness
                         :dpvo/Context
                         :dpvo/ComplianceStatus
                         :dpvo/Status],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Lawfulness Unknown@en",
   :vs/term_status      #voc/lstr "accepted@en"})

(def LegalAgreement
  "A legally binding agreement"
  {:db/ident            :dpvo/LegalAgreement,
   :dcterms/created     #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator     ["Rob Brennan"
                         "Mark Lizar"
                         "Axel Polleres"
                         "Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "A legally binding agreement@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Legal Agreement@en",
   :rdfs/subClassOf     [:dpvo/OrganisationalMeasure
                         :dpvo/LegalAgreement
                         :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status      #voc/lstr "accepted@en"})

(def LegalBasis
  "The Legal basis used to justify processing of personal data"
  {:db/ident :dpvo/LegalBasis,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres" "Javier Fernández"],
   :dcterms/description
   #voc/lstr "The Legal basis used to justify processing of personal data@en",
   :dcterms/modified #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Legal basis (plural: legal bases) are defined by legislations and regulations, whose applicability is usually restricted to specific jurisdictions.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Legal Basis@en",
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status #voc/lstr "accepted@en"})

(def LegalCompliance
  "Purposes associated with carrying out data processing to fulfill a legal or statutory obligation"
  {:db/ident :dpvo/LegalCompliance,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Beatriz Esteves" "Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with carrying out data processing to fulfill a legal or statutory obligation@en",
   :dcterms/modified #inst "2022-11-09T00:00:00.000-05:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "This purpose only refers to processing that is additionally required in order to fulfill the obligations and requirements associated with a law. For example, the use of consent would have its own separate purposes, with this purpose addressing a legal requirement for maintaining consent record (along with RecordManagement). This purpose will typically be used with Legal Obligation as the legal basis.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Legal Compliance@en",
   :rdfs/subClassOf
   [:dpvo/FulfilmentOfObligation :dpvo/LegalCompliance :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def LegalEntity
  "A human or non-human 'thing' that constitutes as an entity and which is recognised and defined in law"
  {:db/ident :dpvo/LegalEntity,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A human or non-human 'thing' that constitutes as an entity and which is recognised and defined in law@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Legal Entity@en",
   :rdfs/subClassOf [:dpvo/Entity :dpvo/LegalEntity],
   :vs/term_status #voc/lstr "accepted@en"})

(def LegalObligation
  "Legal Obligation to conduct the specified processing"
  {:db/ident :dpvo/LegalObligation,
   :dcterms/created #inst "2021-04-07T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Legal Obligation to conduct the specified processing@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Legal Obligation@en",
   :rdfs/subClassOf [:dpvo/LegalBasis :dpvo/LegalObligation],
   :vs/term_status #voc/lstr "accepted@en"})

(def LegitimateInterest
  "Legitimate Interests of a Party as justification for specified processing"
  {:db/ident :dpvo/LegitimateInterest,
   :dcterms/created #inst "2021-05-19T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Legitimate Interests of a Party as justification for specified processing@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Legitimate Interest@en",
   :rdfs/subClassOf [:dpvo/LegalBasis :dpvo/LegitimateInterest],
   :vs/term_status #voc/lstr "accepted@en"})

(def LegitimateInterestAssessment
  "Indicates an assessment regarding the use of legitimate interest as a lawful basis by the data controller"
  {:db/ident :dpvo/LegitimateInterestAssessment,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Indicates an assessment regarding the use of legitimate interest as a lawful basis by the data controller@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Legitimate Interest Assessment@en",
   :rdfs/subClassOf [:dpvo/Assessment
                     :dpvo/LegitimateInterestAssessment
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def LegitimateInterestOfController
  "Legitimate Interests of a Data Controller in conducting specified processing"
  {:db/ident :dpvo/LegitimateInterestOfController,
   :dcterms/created #inst "2021-05-19T00:00:00.000-04:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Legitimate Interests of a Data Controller in conducting specified processing@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Legitimate Interest of Controller@en",
   :rdfs/subClassOf [:dpvo/LegitimateInterest
                     :dpvo/LegitimateInterestOfController
                     :dpvo/LegalBasis],
   :vs/term_status #voc/lstr "accepted@en"})

(def LegitimateInterestOfDataSubject
  "Legitimate Interests of the Data Subject in conducting specified processing"
  {:db/ident :dpvo/LegitimateInterestOfDataSubject,
   :dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   #voc/lstr
    "Legitimate Interests of the Data Subject in conducting specified processing@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Legitimate Interest of Data Subject@en",
   :rdfs/subClassOf [:dpvo/LegitimateInterest
                     :dpvo/LegitimateInterestOfDataSubject
                     :dpvo/LegalBasis],
   :vs/term_status #voc/lstr "accepted@en"})

(def LegitimateInterestOfThirdParty
  "Legitimate Interests of a Third Party in conducting specified processing"
  {:db/ident :dpvo/LegitimateInterestOfThirdParty,
   :dcterms/created #inst "2021-05-19T00:00:00.000-04:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Legitimate Interests of a Third Party in conducting specified processing@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Legitimate Interest of Third Party@en",
   :rdfs/subClassOf [:dpvo/LegitimateInterest
                     :dpvo/LegitimateInterestOfThirdParty
                     :dpvo/LegalBasis],
   :vs/term_status #voc/lstr "accepted@en"})

(def Likelihood
  "The likelihood or probability or chance of something taking place or occuring"
  {:db/ident :dpvo/Likelihood,
   :dcterms/created #inst "2022-07-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "The likelihood or probability or chance of something taking place or occuring@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Likelihood can be expressed in a subjective manner, such as 'Unlikely', or in a quantitative manner such as \"Twice in a Day\" (frequency per period). The suggestion is to use quantitative values, or to associate them with subjective terms used so as to enable accurate interpretations and interoperability. See the concepts related to Frequency and Duration for possible uses as a combination to express Likelihood.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Likelihood@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def LocalEnvironmentScale
  "Geographic coverage spanning a specific environment within the locality"
  {:db/ident :dpvo/LocalEnvironmentScale,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Geographic coverage spanning a specific environment within the locality@en",
   :rdf/type [:owl/NamedIndividual
              :dpvo/GeographicCoverage
              :dpvo/Scale
              :dpvo/ProcessingContext
              :dpvo/Context],
   :rdfs/comment
   #voc/lstr
    "For example, geographic scale of an event take place in a specific building or room@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Local Environment Scale@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def LocalLocation
  "Location is local"
  {:db/ident            :dpvo/LocalLocation,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Location is local@en",
   :dcterms/modified    #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Local Location@en",
   :rdfs/subClassOf     [:dpvo/LocationLocality
                         :dpvo/LocalLocation
                         :dpvo/Location],
   :vs/term_status      #voc/lstr "modified@en"})

(def LocalityScale
  "Geographic coverage spanning a specific locality"
  {:db/ident :dpvo/LocalityScale,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Geographic coverage spanning a specific locality@en",
   :rdf/type [:dpvo/GeographicCoverage
              :owl/NamedIndividual
              :dpvo/Scale
              :dpvo/ProcessingContext
              :dpvo/Context],
   :rdfs/comment
   #voc/lstr
    "For example, geographic scale of a city or an area within a city@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Locality Scale@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def Location
  "A location is a position, site, or area where something is located"
  {:db/ident :dpvo/Location,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "A location is a position, site, or area where something is located@en",
   :rdf/type :owl/Class,
   :rdfs/comment #voc/lstr
                  "Location may be geographic, physical, or virtual.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Location@en",
   :rdfs/subClassOf :dpvo/Location,
   :vs/term_status #voc/lstr "accepted@en"})

(def LocationFixture
  "The fixture of location refers to whether the location is fixed"
  {:db/ident :dpvo/LocationFixture,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "The fixture of location refers to whether the location is fixed@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Location Fixture@en",
   :rdfs/subClassOf :dpvo/LocationFixture,
   :vs/term_status #voc/lstr "accepted@en"})

(def LocationLocality
  "Locality refers to whether the specified location is local within some context, e.g. for the user"
  {:db/ident :dpvo/LocationLocality,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Locality refers to whether the specified location is local within some context, e.g. for the user@en",
   :dcterms/modified #inst "2022-10-04T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Location Locality@en",
   :rdfs/subClassOf [:dpvo/Location :dpvo/LocationLocality],
   :vs/term_status #voc/lstr "modified@en"})

(def LoggingPolicies
  "Policy for logging of information"
  {:db/ident :dpvo/LoggingPolicies,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Policy for logging of information@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Logging Policies@en",
   :rdfs/subClassOf [:dpvo/GovernanceProcedures
                     :dpvo/LoggingPolicies
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def MaintainCreditCheckingDatabase
  "Purposes associated with maintaining a Credit Checking Database"
  {:db/ident :dpvo/MaintainCreditCheckingDatabase,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with maintaining a Credit Checking Database@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Maintain Credit Checking Database@en",
   :rdfs/subClassOf [:dpvo/CreditChecking
                     :dpvo/MaintainCreditCheckingDatabase
                     :dpvo/Purpose
                     :dpvo/CustomerSolvencyMonitoring
                     :dpvo/CustomerManagement],
   :vs/term_status #voc/lstr "accepted@en"})

(def MaintainCreditRatingDatabase
  "Purposes associated with maintaining a Credit Rating Database"
  {:db/ident :dpvo/MaintainCreditRatingDatabase,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr "Purposes associated with maintaining a Credit Rating Database@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Maintain Credit Rating Database@en",
   :rdfs/subClassOf [:dpvo/CreditChecking
                     :dpvo/MaintainCreditRatingDatabase
                     :dpvo/Purpose
                     :dpvo/CustomerSolvencyMonitoring
                     :dpvo/CustomerManagement],
   :vs/term_status #voc/lstr "accepted@en"})

(def MaintainFraudDatabase
  "Purposes associated with maintaining a database related to identifying and identified fraud risks and fraud incidents"
  {:db/ident :dpvo/MaintainFraudDatabase,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with maintaining a database related to identifying and identified fraud risks and fraud incidents@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "MaintainFraudDatabase@en",
   :rdfs/subClassOf [:dpvo/FraudPreventionAndDetection
                     :dpvo/MaintainFraudDatabase
                     :dpvo/Purpose
                     :dpvo/EnforceSecurity],
   :vs/term_status #voc/lstr "accepted@en"})

(def MakeAvailable
  "to transform or publish data to be used"
  {:db/ident :dpvo/MakeAvailable,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #voc/lstr "to transform or publish data to be used@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Make Available@en",
   :rdfs/subClassOf [:dpvo/Disclose :dpvo/MakeAvailable :dpvo/Processing],
   :vs/term_status #voc/lstr "accepted@en"})

(def Marketing
  "Purposes associated with conducting marketing in relation to organisation or products or services e.g. promoting, selling, and distributing"
  {:db/ident :dpvo/Marketing,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Beatriz Esteves" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with conducting marketing in relation to organisation or products or services e.g. promoting, selling, and distributing@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Was commercial interest, changed to consider Marketing a separate Purpose category by itself@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Marketing@en",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/Marketing],
   :vs/term_status #voc/lstr "accepted@en"})

(def Match
  "to combine, compare, or match data from different sources"
  {:db/ident :dpvo/Match,
   :dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "to combine, compare, or match data from different sources@en",
   :dcterms/source "https://ec.europa.eu/newsroom/article29/items/611236",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Match@en",
   :rdfs/subClassOf [:dpvo/Use :dpvo/Match :dpvo/Processing],
   :vs/term_status #voc/lstr "accepted@en"})

(def MaterialDamage
  "Impact that acts as or causes material damages"
  {:db/ident            :dpvo/MaterialDamage,
   :dcterms/created     #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Impact that acts as or causes material damages@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Material Damage@en",
   :rdfs/subClassOf     [:dpvo/Damage
                         :dpvo/MaterialDamage
                         :dpvo/Consequence
                         :dpvo/Impact],
   :vs/term_status      #voc/lstr "accepted@en"})

(def MediumDataVolume
  "Data volume that is considered medium i.e. neither large nor small within the context"
  {:db/ident :dpvo/MediumDataVolume,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog" "Paul Ryan"],
   :dcterms/description
   #voc/lstr
    "Data volume that is considered medium i.e. neither large nor small within the context@en",
   :rdf/type [:dpvo/DataVolume
              :owl/NamedIndividual
              :dpvo/ProcessingContext
              :dpvo/Context
              :dpvo/Scale],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Medium Data Volume@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def MediumScaleOfDataSubjects
  "Scale of data subjects considered medium i.e. neither large nor small within the context"
  {:db/ident :dpvo/MediumScaleOfDataSubjects,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog" "Paul Ryan"],
   :dcterms/description
   #voc/lstr
    "Scale of data subjects considered medium i.e. neither large nor small within the context@en",
   :rdf/type [:dpvo/DataSubjectScale
              :owl/NamedIndividual
              :dpvo/Scale
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Medium Scale Of Data Subjects@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def MediumScaleProcessing
  "Processing that takes place at medium scales (as specified by some criteria)"
  {:db/ident :dpvo/MediumScaleProcessing,
   :dcterms/created #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Processing that takes place at medium scales (as specified by some criteria)@en",
   :rdf/type [:dpvo/ProcessingScale
              :owl/NamedIndividual
              :dpvo/Scale
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Medium Scale Processing@en",
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Data subjects that are members of a group, organisation, or other collectives@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Member@en",
   :rdfs/subClassOf [:dpvo/DataSubject
                     :dpvo/Member
                     :dpvo/LegalEntity
                     :dpvo/Entity
                     :dpvo/NaturalPerson],
   :vs/term_status #voc/lstr "accepted@en"})

(def MemberPartnerManagement
  "Purposes associated with maintaining a registry of shareholders, members, or partners for governance, administration, and management functions"
  {:db/ident :dpvo/MemberPartnerManagement,
   :dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan" "David Hickey"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with maintaining a registry of shareholders, members, or partners for governance, administration, and management functions@en",
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Members and Partners Management@en",
   :rdfs/subClassOf
   [:dpvo/OrganisationGovernance :dpvo/MemberPartnerManagement :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def MentallyVulnerableDataSubject
  "Data subjects that are considered mentally vulnerable"
  {:db/ident :dpvo/MentallyVulnerableDataSubject,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   #voc/lstr "Data subjects that are considered mentally vulnerable@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Mentally Vulnerable Data Subject@en",
   :rdfs/subClassOf [:dpvo/VulnerableDataSubject
                     :dpvo/MentallyVulnerableDataSubject
                     :dpvo/LegalEntity
                     :dpvo/Entity
                     :dpvo/DataSubject
                     :dpvo/NaturalPerson],
   :vs/term_status #voc/lstr "accepted@en"})

(def MessageAuthenticationCodes
  "Use of cryptographic methods to authenticate messages"
  {:db/ident :dpvo/MessageAuthenticationCodes,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Use of cryptographic methods to authenticate messages@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Message Authentication Codes (MAC)@en",
   :rdfs/subClassOf [:dpvo/CryptographicAuthentication
                     :dpvo/MessageAuthenticationCodes
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure
                     :dpvo/CryptographicMethods
                     :dpvo/AuthenticationProtocols],
   :vs/term_status #voc/lstr "accepted@en"})

(def MobilePlatformSecurity
  "Security implemented over a mobile platform"
  {:db/ident :dpvo/MobilePlatformSecurity,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Security implemented over a mobile platform@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Mobile Platform Security@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/MobilePlatformSecurity
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Modify
  "to modify or change data"
  {:db/ident            :dpvo/Modify,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description #voc/lstr "to modify or change data@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Modify@en",
   :rdfs/subClassOf     [:dpvo/Alter
                         :dpvo/Modify
                         :dpvo/Processing
                         :dpvo/Transform],
   :vs/term_status      #voc/lstr "accepted@en"})

(def Monitor
  "to monitor data for some criteria"
  {:db/ident            :dpvo/Monitor,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description #voc/lstr "to monitor data for some criteria@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Monitor@en",
   :rdfs/subClassOf     [:dpvo/Consult
                         :dpvo/Monitor
                         :dpvo/Processing
                         :dpvo/Use],
   :vs/term_status      #voc/lstr "accepted@en"})

(def MonitoringPolicies
  "Policy for monitoring (e.g. progress, performance)"
  {:db/ident :dpvo/MonitoringPolicies,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Policy for monitoring (e.g. progress, performance)@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Monitoring Policies@en",
   :rdfs/subClassOf [:dpvo/GovernanceProcedures
                     :dpvo/MonitoringPolicies
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def MonotonicCounterPseudonymisation
  "A simple pseudonymisation method where identifiers are substituted by a number chosen by a monotonic counter"
  {:db/ident :dpvo/MonotonicCounterPseudonymisation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A simple pseudonymisation method where identifiers are substituted by a number chosen by a monotonic counter@en",
   :dcterms/modified #inst "2022-10-13T00:00:00.000-04:00",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Monotonic Counter Pseudonymisation@en",
   :rdfs/subClassOf [:dpvo/Pseudonymisation
                     :dpvo/MonotonicCounterPseudonymisation
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure
                     :dpvo/DataSanitisationTechnique
                     :dpvo/Deidentification],
   :vs/term_status #voc/lstr "modified@en"})

(def Move
  "to move data from one location to another including deleting the original copy"
  {:db/ident :dpvo/Move,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "to move data from one location to another including deleting the original copy@en",
   :dcterms/source "https://specialprivacy.ercim.eu/vocabs/processing",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Move@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/processing#Move"],
   :rdfs/subClassOf [:dpvo/Transfer :dpvo/Move :dpvo/Processing],
   :vs/term_status #voc/lstr "accepted@en"})

(def MultiFactorAuthentication
  "An authentication system that uses two or more methods to authenticate"
  {:db/ident :dpvo/MultiFactorAuthentication,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "An authentication system that uses two or more methods to authenticate@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Multi-Factor Authentication (MFA)@en",
   :rdfs/subClassOf [:dpvo/AuthenticationProtocols
                     :dpvo/MultiFactorAuthentication
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def MultiNationalScale
  "Geographic coverage spanning multiple nations"
  {:db/ident            :dpvo/MultiNationalScale,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Geographic coverage spanning multiple nations@en",
   :rdf/type            [:dpvo/GeographicCoverage
                         :owl/NamedIndividual
                         :dpvo/Scale
                         :dpvo/ProcessingContext
                         :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Multi National Scale@en",
   :vs/term_status      #voc/lstr "accepted@en"})

(def NDA
  "Non-disclosure Agreements e.g. preserving confidentiality of information"
  {:db/ident :dpvo/NDA,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Rob Brennan" "Axel Polleres" "Mark Lizar"],
   :dcterms/description
   #voc/lstr
    "Non-disclosure Agreements e.g. preserving confidentiality of information@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Non-Disclosure Agreement (NDA)@en",
   :rdfs/subClassOf [:dpvo/LegalAgreement
                     :dpvo/NDA
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def NationalAuthority
  "An authority tasked with overseeing legal compliance for a nation"
  {:db/ident :dpvo/NationalAuthority,
   :dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "An authority tasked with overseeing legal compliance for a nation@en",
   :dcterms/source "http://purl.org/adms",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "National Authority@en",
   :rdfs/subClassOf [:dpvo/Authority
                     :dpvo/NationalAuthority
                     :dpvo/LegalEntity
                     :dpvo/Organisation
                     :dpvo/Entity
                     :dpvo/GovernmentalOrganisation],
   :vs/term_status #voc/lstr "accepted@en"})

(def NationalScale
  "Geographic coverage spanning a nation"
  {:db/ident            :dpvo/NationalScale,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Geographic coverage spanning a nation@en",
   :rdf/type            [:owl/NamedIndividual
                         :dpvo/GeographicCoverage
                         :dpvo/Scale
                         :dpvo/ProcessingContext
                         :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "National Scale@en",
   :vs/term_status      #voc/lstr "accepted@en"})

(def NaturalPerson
  "A human"
  {:db/ident            :dpvo/NaturalPerson,
   :dcterms/created     #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "A human@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Natural Person@en",
   :rdfs/subClassOf     [:dpvo/Entity :dpvo/NaturalPerson],
   :vs/term_status      #voc/lstr "accepted@en"})

(def NearlyGlobalScale
  "Geographic coverage nearly spanning the entire globe"
  {:db/ident :dpvo/NearlyGlobalScale,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Geographic coverage nearly spanning the entire globe@en",
   :rdf/type [:owl/NamedIndividual
              :dpvo/GeographicCoverage
              :dpvo/Scale
              :dpvo/ProcessingContext
              :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Nearly Global Scale@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def Necessity
  "An indication of 'necessity' within a context"
  {:db/ident :dpvo/Necessity,
   :dcterms/created #inst "2022-02-12T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog"
                     "Beatriz Esteves"
                     "Harshvardhan J. Pandit"
                     "Julian Flake"
                     "Paul Ryan"],
   :dcterms/description #voc/lstr
                         "An indication of 'necessity' within a context@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Necessity can be used to express need, essentiality, requirement, or compulsion.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Necessity@en",
   :rdfs/subClassOf [:dpvo/Context :dpvo/Necessity],
   :vs/term_status #voc/lstr "accepted@en"})

(def NetworkProxyRouting
  "Use of network routing using proxy"
  {:db/ident :dpvo/NetworkProxyRouting,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Use of network routing using proxy@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Network Proxy Routing@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/NetworkProxyRouting
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def NetworkSecurityProtocols
  "Security implemented at or over networks protocols"
  {:db/ident :dpvo/NetworkSecurityProtocols,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Security implemented at or over networks protocols@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Network Security Protocols@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/NetworkSecurityProtocols
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr "Data subjects that are not citizens (for a jurisdiction)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Non-Citizen@en",
   :rdfs/subClassOf [:dpvo/DataSubject
                     :dpvo/NonCitizen
                     :dpvo/LegalEntity
                     :dpvo/Entity
                     :dpvo/NaturalPerson],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Purposes associated with conducting research in a non-commercial setting e.g. for a non-profit-organisation (NGO)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Non-Commercial Research@en",
   :rdfs/subClassOf
   [:dpvo/ResearchAndDevelopment :dpvo/NonCommercialResearch :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def NonCompliant
  "State of non-compliance where objectives have not been met, but have not been violated"
  {:db/ident :dpvo/NonCompliant,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "State of non-compliance where objectives have not been met, but have not been violated@en",
   :dcterms/modified #inst "2022-09-07T00:00:00.000-04:00",
   :rdf/type
   [:dpvo/ComplianceStatus :owl/NamedIndividual :dpvo/Context :dpvo/Status],
   :rdfs/comment
   #voc/lstr
    "Changed from not compliant for consistency in commonly used terms@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Non Compliant@en",
   :vs/term_status #voc/lstr "changed@en"})

(def NonConformant
  "State of being non-conformant"
  {:db/ident            :dpvo/NonConformant,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "State of being non-conformant@en",
   :rdf/type            [:dpvo/ConformanceStatus
                         :owl/NamedIndividual
                         :dpvo/Status
                         :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "NonConformant@en",
   :vs/term_status      #voc/lstr "accepted@en"})

(def NonGovernmentalOrganisation
  "An organisation not part of or independent from the government"
  {:db/ident :dpvo/NonGovernmentalOrganisation,
   :dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "An organisation not part of or independent from the government@en",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :dcterms/source "http://purl.org/adms",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Non-Governmental Organisation@en",
   :rdfs/subClassOf [:dpvo/Organisation
                     :dpvo/NonGovernmentalOrganisation
                     :dpvo/LegalEntity
                     :dpvo/Entity],
   :vs/term_status #voc/lstr "modified@en"})

(def NonMaterialDamage
  "Impact that acts as or causes non-material damages"
  {:db/ident :dpvo/NonMaterialDamage,
   :dcterms/created #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Impact that acts as or causes non-material damages@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Non-Material Damage@en",
   :rdfs/subClassOf
   [:dpvo/Damage :dpvo/NonMaterialDamage :dpvo/Consequence :dpvo/Impact],
   :vs/term_status #voc/lstr "accepted@en"})

(def NonPersonalData
  "Data that is not Personal Data"
  {:db/ident :dpvo/NonPersonalData,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Data that is not Personal Data@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The term NonPersonalData is provided to distinguish between PersonalData and other data, e.g. for indicating which data is regulated by privacy laws. To specify personal data that has been anonymised, the concept AnonymisedData should be used.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Non-Personal Data@en",
   :rdfs/subClassOf [:dpvo/Data :dpvo/NonPersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def NonProfitOrganisation
  "An organisation that does not aim to achieve profit as its primary goal"
  {:db/ident :dpvo/NonProfitOrganisation,
   :dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "An organisation that does not aim to achieve profit as its primary goal@en",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :dcterms/source "http://purl.org/adms",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Non-Profit Organisation@en",
   :rdfs/subClassOf [:dpvo/Organisation
                     :dpvo/NonProfitOrganisation
                     :dpvo/LegalEntity
                     :dpvo/Entity],
   :vs/term_status #voc/lstr "modified@en"})

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
   #voc/lstr "A source of data that is not publicly accessible or available@en",
   :rdf/type [:dpvo/DataSource
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Non-Public Data Source@en",
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Indication of neither being required nor optional i.e. not relevant or needed@en",
   :rdf/type [:owl/NamedIndividual :dpvo/Necessity :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Not Required@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def Notice
  "A notice is an artefact for providing information, choices, or controls"
  {:db/ident :dpvo/Notice,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Georg P Krog" "David Hickey" "Paul Ryan"],
   :dcterms/description
   #voc/lstr
    "A notice is an artefact for providing information, choices, or controls@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Notice@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/Notice
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Obligation
  "A rule describing an obligation for performing an activity"
  {:db/ident :dpvo/Obligation,
   :dcterms/created #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Harshvardhan J. Pandit" "Beatriz Esteves"],
   :dcterms/description
   #voc/lstr "A rule describing an obligation for performing an activity@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Obligation@en",
   :rdfs/subClassOf [:dpvo/Rule :dpvo/Obligation],
   :vs/term_status #voc/lstr "accepted@en"})

(def Observe
  "to obtain data through observation"
  {:db/ident            :dpvo/Observe,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description #voc/lstr "to obtain data through observation@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Observe@en",
   :rdfs/subClassOf     [:dpvo/Obtain :dpvo/Observe :dpvo/Processing],
   :vs/term_status      #voc/lstr "accepted@en"})

(def ObservedPersonalData
  "Personal Data that has been collected through observation of the Data Subject(s)"
  {:db/ident :dpvo/ObservedPersonalData,
   :dcterms/created #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   #voc/lstr
    "Personal Data that has been collected through observation of the Data Subject(s)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Observed Personal Data@en",
   :rdfs/subClassOf [:dpvo/CollectedPersonalData
                     :dpvo/ObservedPersonalData
                     :dpvo/Data
                     :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def Obtain
  "to solicit or gather data from someone"
  {:db/ident :dpvo/Obtain,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #voc/lstr "to solicit or gather data from someone@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Obtain@en",
   :rdfs/subClassOf [:dpvo/Processing :dpvo/Obtain],
   :vs/term_status #voc/lstr "accepted@en"})

(def OfficialAuthorityOfController
  "Processing necessary or authorised through the official authority granted to or vested in the Data Controller"
  {:db/ident :dpvo/OfficialAuthorityOfController,
   :dcterms/created #inst "2021-05-05T00:00:00.000-04:00",
   :dcterms/creator ["Paul Ryan" "Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Processing necessary or authorised through the official authority granted to or vested in the Data Controller@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Official Authority of Controller@en",
   :rdfs/subClassOf [:dpvo/LegalBasis :dpvo/OfficialAuthorityOfController],
   :vs/term_status #voc/lstr "accepted@en"})

(def OftenFrequency
  "Frequency where occurences are often or frequent, but not continous"
  {:db/ident :dpvo/OftenFrequency,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Frequency where occurences are often or frequent, but not continous@en",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Often Frequency@en",
   :rdfs/subClassOf [:dpvo/Frequency :dpvo/OftenFrequency :dpvo/Context],
   :vs/term_status #voc/lstr "modified@en"})

(def OperatingSystemSecurity
  "Security implemented at or through operating systems"
  {:db/ident :dpvo/OperatingSystemSecurity,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Security implemented at or through operating systems@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Operating System Security@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/OperatingSystemSecurity
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Purposes associated with optimisation of activities and services for consumer or user@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The term optmisation here refers to the efficiency of the service in terms of technical provision (or similar means) with benefits for everybody. Personalisation implies making changes that benefit the current user or persona.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Optimisation for Consumer@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/purposes#Custom"],
   :rdfs/subClassOf [:dpvo/ServiceOptimisation
                     :dpvo/OptimisationForConsumer
                     :dpvo/ServiceProvision
                     :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Purposes associated with optimisation of activities and services for provider or controller@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Optimisation for Controller@en",
   :rdfs/subClassOf [:dpvo/ServiceOptimisation
                     :dpvo/OptimisationForController
                     :dpvo/ServiceProvision
                     :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Purposes associated with optimisation of interfaces presented to the user@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Optimise User Interface@en",
   :rdfs/subClassOf [:dpvo/OptimisationForConsumer
                     :dpvo/OptimiseUserInterface
                     :dpvo/ServiceProvision
                     :dpvo/Purpose
                     :dpvo/ServiceOptimisation],
   :vs/term_status #voc/lstr "accepted@en"})

(def Optional
  "Indication of 'optional' or 'voluntary'"
  {:db/ident            :dpvo/Optional,
   :dcterms/created     #inst "2022-02-14T00:00:00.000-05:00",
   :dcterms/creator     ["Julian Flake"
                         "Beatriz Esteves"
                         "Paul Ryan"
                         "Harshvardhan J. Pandit"
                         "Georg P Krog"],
   :dcterms/description #voc/lstr "Indication of 'optional' or 'voluntary'@en",
   :rdf/type            [:dpvo/Necessity :owl/NamedIndividual :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Optional@en",
   :vs/term_status      #voc/lstr "accepted@en"})

(def Organisation
  "A general term reflecting a company or a business or a group acting as a unit"
  {:db/ident :dpvo/Organisation,
   :dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A general term reflecting a company or a business or a group acting as a unit@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Organisation@en",
   :rdfs/subClassOf [:dpvo/LegalEntity :dpvo/Organisation :dpvo/Entity],
   :vs/term_status #voc/lstr "accepted@en"})

(def OrganisationComplianceManagement
  "Purposes associated with managing compliance for organisation in relation to internal policies"
  {:db/ident :dpvo/OrganisationComplianceManagement,
   :dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Georg P Krog" "Paul Ryan" "David Hickey"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with managing compliance for organisation in relation to internal policies@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Note that this concept relates to internal organisational compliance. The concept LegalCompliance should be used for external legal or regulatory compliance.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Organisation Compliance Management@en",
   :rdfs/subClassOf [:dpvo/OrganisationGovernance
                     :dpvo/OrganisationComplianceManagement
                     :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def OrganisationGovernance
  "Purposes associated with conducting activities and functions for governance of an organisation"
  {:db/ident :dpvo/OrganisationGovernance,
   :dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Paul Ryan" "Harshvardhan J. Pandit" "David Hickey"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with conducting activities and functions for governance of an organisation@en",
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Organisation Governance@en",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/OrganisationGovernance],
   :vs/term_status #voc/lstr "accepted@en"})

(def OrganisationRiskManagement
  "Purposes associated with managing risk for organisation's activities"
  {:db/ident :dpvo/OrganisationRiskManagement,
   :dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "David Hickey" "Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with managing risk for organisation's activities@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Organisation Risk Management@en",
   :rdfs/subClassOf [:dpvo/OrganisationGovernance
                     :dpvo/OrganisationRiskManagement
                     :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def OrganisationalMeasure
  "Organisational measures required/followed when processing data of the declared category"
  {:db/ident :dpvo/OrganisationalMeasure,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Mark Lizar" "Axel Polleres" "Rob Brennan" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Organisational measures required/followed when processing data of the declared category@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Organisational Measure@en",
   :rdfs/subClassOf [:dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def OrganisationalUnit
  "Entity within an organisation that does not constitute as a separate legal entity"
  {:db/ident :dpvo/OrganisationalUnit,
   :dcterms/created #inst "2022-03-23T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description
   #voc/lstr
    "Entity within an organisation that does not constitute as a separate legal entity@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Organisational Unit@en",
   :rdfs/subClassOf [:dpvo/Entity :dpvo/OrganisationalUnit],
   :vs/term_status #voc/lstr "accepted@en"})

(def Organise
  "to organize data for arranging or classifying"
  {:db/ident :dpvo/Organise,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #voc/lstr
                         "to organize data for arranging or classifying@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Organise@en",
   :rdfs/subClassOf [:dpvo/Processing :dpvo/Organise],
   :vs/term_status #voc/lstr "accepted@en"})

(def PIA
  "Carrying out an impact assessment regarding privacy risks"
  {:db/ident :dpvo/PIA,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr "Carrying out an impact assessment regarding privacy risks@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Privacy Impact Assessment@en",
   :rdfs/subClassOf [:dpvo/ImpactAssessment
                     :dpvo/PIA
                     :dpvo/Assessment
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def ParentOfDataSubject
  "Parent(s) of data subjects such as children"
  {:db/ident            :dpvo/ParentOfDataSubject,
   :dcterms/created     #inst "2022-08-03T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description #voc/lstr
                         "Parent(s) of data subjects such as children@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Parent(s) of Data Subject@en",
   :rdfs/subClassOf     [:dpvo/DataSubject
                         :dpvo/ParentOfDataSubject
                         :dpvo/LegalEntity
                         :dpvo/Entity
                         :dpvo/NaturalPerson],
   :vs/term_status      #voc/lstr "accepted@en"})

(def PartiallyAutomatedProcessing
  "Processing that is partially automated or semi-automated"
  {:db/ident :dpvo/PartiallyAutomatedProcessing,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Processing that is partially automated or semi-automated@en",
   :rdf/type [:dpvo/AutomationOfProcessing
              :owl/NamedIndividual
              :dpvo/ProcessingContext
              :dpvo/Context],
   :rdfs/comment
   #voc/lstr
    "For example, a series of distinct processing operations that are automated individually or have some human involvement@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Partially Automated Processing@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def PartiallyCompliant
  "State of partially being compliant i.e. only some objectives have been met, and others have not been in violation"
  {:db/ident :dpvo/PartiallyCompliant,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "State of partially being compliant i.e. only some objectives have been met, and others have not been in violation@en",
   :rdf/type
   [:dpvo/ComplianceStatus :owl/NamedIndividual :dpvo/Context :dpvo/Status],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Partially Compliant@en",
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Data subjects that participate in some context such as volunteers in a function@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Participant@en",
   :rdfs/subClassOf [:dpvo/DataSubject
                     :dpvo/Participant
                     :dpvo/LegalEntity
                     :dpvo/Entity
                     :dpvo/NaturalPerson],
   :vs/term_status #voc/lstr "accepted@en"})

(def PassiveRight
  "The right(s) applicable, provided, or expected that are always (passively) applicable"
  {:db/ident :dpvo/PassiveRight,
   :dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Beatriz Esteves" "Harshvardhan J Pandit"],
   :dcterms/description
   #voc/lstr
    "The right(s) applicable, provided, or expected that are always (passively) applicable@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Passive rights do not require the entity to request or exercise them. They are considered to be always applicable. For example, the Right to Privacy (in EU) does not require an exercise for it to be fulfilled.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Passive Right@en",
   :rdfs/subClassOf [:dpvo/Right :dpvo/PassiveRight],
   :vs/term_status #voc/lstr "accepted@en"})

(def PasswordAuthentication
  "Use of passwords to perform authentication"
  {:db/ident :dpvo/PasswordAuthentication,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Use of passwords to perform authentication@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Password Authentication@en",
   :rdfs/subClassOf [:dpvo/AuthenticationProtocols
                     :dpvo/PasswordAuthentication
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Data subjects that receive medican attention, treatment, care, advice, or other health related services@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Patient@en",
   :rdfs/subClassOf [:dpvo/DataSubject
                     :dpvo/Patient
                     :dpvo/LegalEntity
                     :dpvo/Entity
                     :dpvo/NaturalPerson],
   :vs/term_status #voc/lstr "accepted@en"})

(def PaymentManagement
  "Purposes associated with processing and managing payment in relation to service, including invoicing and records"
  {:db/ident :dpvo/PaymentManagement,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Beatriz Esteves" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with processing and managing payment in relation to service, including invoicing and records@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Payment Management@en",
   :rdfs/subClassOf
   [:dpvo/ServiceProvision :dpvo/PaymentManagement :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def PenetrationTestingMethods
  "Use of penetration testing to identity weaknessess and vulnerabilities through simulations"
  {:db/ident :dpvo/PenetrationTestingMethods,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Use of penetration testing to identity weaknessess and vulnerabilities through simulations@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Penetration Testing Methods@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/PenetrationTestingMethods
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Permission
  "A rule describing a permission to perform an activity"
  {:db/ident :dpvo/Permission,
   :dcterms/created #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Beatriz Esteves" "Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr "A rule describing a permission to perform an activity@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Permission@en",
   :rdfs/subClassOf [:dpvo/Rule :dpvo/Permission],
   :vs/term_status #voc/lstr "accepted@en"})

(def PersonalData
  "Data directly or indirectly associated or related to an individual."
  {:db/ident :dpvo/PersonalData,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan Pandit",
   :dcterms/description
   #voc/lstr
    "Data directly or indirectly associated or related to an individual.@en",
   :dcterms/modified #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_1/oj",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "This definition of personal data encompasses the concepts used in GDPR Art.4-1 for 'personal data' and ISO/IEC 2700 for 'personally identifiable information (PII)'.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Personal Data@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/langs/usage-policy#AnyData"],
   :rdfs/subClassOf [:dpvo/Data :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def PersonalDataHandling
  "A high-level Class to describe 'data handling'. This can consist of personal data being processed for a purpose, involving entities, using technical and organisational measures, applicable risks, rights, and legal basis."
  {:db/ident :dpvo/PersonalDataHandling,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Javier Fernández" "Axel Polleres"],
   :dcterms/description
   #voc/lstr
    "A high-level Class to describe 'data handling'. This can consist of personal data being processed for a purpose, involving entities, using technical and organisational measures, applicable risks, rights, and legal basis.@en",
   :dcterms/modified #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Personal Data Handling@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def Personalisation
  "Purposes associated with creating and providing customisation based on attributes and/or needs of person(s) or context(s)."
  {:db/ident :dpvo/Personalisation,
   :dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Purposes associated with creating and providing customisation based on attributes and/or needs of person(s) or context(s).@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "This term is a blanket purpose category for indicating personalisation of some other purpose, e.g. by creating a subclass of the other concept and Personalisation@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Personalisation@en",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/Personalisation],
   :vs/term_status #voc/lstr "accepted@en"})

(def PersonalisedAdvertising
  "Purposes associated with creating and providing personalised advertising"
  {:db/ident :dpvo/PersonalisedAdvertising,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Beatriz Esteves" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with creating and providing personalised advertising@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Personalised Advertising@en",
   :rdfs/subClassOf [:dpvo/Personalisation
                     :dpvo/Advertising
                     :dpvo/PersonalisedAdvertising
                     :dpvo/Marketing
                     :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Purposes associated with creating and providing personalised benefits for a service@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Personalised Benefits@en",
   :rdfs/subClassOf [:dpvo/ServicePersonalisation
                     :dpvo/PersonalisedBenefits
                     :dpvo/Personalisation
                     :dpvo/ServiceProvision
                     :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def PersonnelHiring
  "Purposes associated with management and execution of hiring processes of personnel"
  {:db/ident :dpvo/PersonnelHiring,
   :dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Purposes associated with management and execution of hiring processes of personnel@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Personnel Hiring@en",
   :rdfs/subClassOf [:dpvo/PersonnelManagement
                     :dpvo/PersonnelHiring
                     :dpvo/Purpose
                     :dpvo/HumanResourceManagement],
   :vs/term_status #voc/lstr "accepted@en"})

(def PersonnelManagement
  "Purposes associated with management of personnel associated with the organisation e.g. evaluation and management of employees and intermediaries"
  {:db/ident :dpvo/PersonnelManagement,
   :dcterms/created #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with management of personnel associated with the organisation e.g. evaluation and management of employees and intermediaries@en",
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Personnel Management@en",
   :rdfs/subClassOf
   [:dpvo/HumanResourceManagement :dpvo/PersonnelManagement :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def PersonnelPayment
  "Purposes associated with management and execution of payment of personnel"
  {:db/ident :dpvo/PersonnelPayment,
   :dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Purposes associated with management and execution of payment of personnel@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Personnel Payment@en",
   :rdfs/subClassOf [:dpvo/PersonnelManagement
                     :dpvo/PersonnelPayment
                     :dpvo/Purpose
                     :dpvo/HumanResourceManagement],
   :vs/term_status #voc/lstr "accepted@en"})

(def PhysicalAccessControlMethod
  "Access control applied for physical access e.g. premises or equipement"
  {:db/ident :dpvo/PhysicalAccessControlMethod,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   #voc/lstr
    "Access control applied for physical access e.g. premises or equipement@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Physical Access Control Method@en",
   :rdfs/subClassOf [:dpvo/AccessControlMethod
                     :dpvo/PhysicalAccessControlMethod
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Policy
  "A guidance document outlining any of: procedures, plans, principles, decisions, intent, or protocols."
  {:db/ident :dpvo/Policy,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Paul Ryan" "David Hickey" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "A guidance document outlining any of: procedures, plans, principles, decisions, intent, or protocols.@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Policy@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/Policy
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def PostQuantumCryptography
  "Use of algorithms that are intended to be secure against cryptanalytic attack by a quantum computer"
  {:db/ident :dpvo/PostQuantumCryptography,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Use of algorithms that are intended to be secure against cryptanalytic attack by a quantum computer@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Post-Quantum Cryptography@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/PostQuantumCryptography
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr "Indication of 'primary' or 'main' or 'core' importance@en",
   :rdf/type [:dpvo/Importance :owl/NamedIndividual :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Primary Importance@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def PrivacyByDefault
  "Practices regarding selecting appropriate data protection and privacy measures as the 'default' in an activity or service"
  {:db/ident :dpvo/PrivacyByDefault,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Axel Polleres" "Mark Lizar" "Harshvardhan J. Pandit" "Rob Brennan"],
   :dcterms/description
   #voc/lstr
    "Practices regarding selecting appropriate data protection and privacy measures as the 'default' in an activity or service@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Privacy by Default@en",
   :rdfs/subClassOf [:dpvo/GuidelinesPrinciple
                     :dpvo/PrivacyByDefault
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def PrivacyByDesign
  "Practices regarding incorporating data protection and privacy in the design of information and services"
  {:db/ident :dpvo/PrivacyByDesign,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Axel Polleres" "Mark Lizar" "Rob Brennan"],
   :dcterms/description
   #voc/lstr
    "Practices regarding incorporating data protection and privacy in the design of information and services@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Privacy by Design@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/PrivacyByDesign
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def PrivacyNotice
  "Represents a notice or document outlining information regarding privacy"
  {:db/ident :dpvo/PrivacyNotice,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "David Hickey" "Georg P Krog" "Paul Ryan"],
   :dcterms/description
   #voc/lstr
    "Represents a notice or document outlining information regarding privacy@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Privacy Notice@en",
   :rdfs/subClassOf [:dpvo/Notice
                     :dpvo/PrivacyNotice
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def PrivacyPreservingProtocol
  "Use of protocols designed with the intention of provided additional guarentees regarding privacy"
  {:db/ident :dpvo/PrivacyPreservingProtocol,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Use of protocols designed with the intention of provided additional guarentees regarding privacy@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Privacy Preserving Protocol@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/PrivacyPreservingProtocol
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def PrivateInformationRetrieval
  "Use of cryptographic methods to retrieve a record from a system without revealing which record is retrieved"
  {:db/ident :dpvo/PrivateInformationRetrieval,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Use of cryptographic methods to retrieve a record from a system without revealing which record is retrieved@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Private Information Retrieval@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/PrivateInformationRetrieval
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def PrivateLocation
  "Location that is not or cannot be accessed by the public and is controlled as a private space"
  {:db/ident :dpvo/PrivateLocation,
   :dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Location that is not or cannot be accessed by the public and is controlled as a private space@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Private Location@en",
   :rdfs/subClassOf [:dpvo/LocalLocation
                     :dpvo/PrivateLocation
                     :dpvo/Location
                     :dpvo/LocationLocality],
   :vs/term_status #voc/lstr "accepted@en"})

(def Processing
  "The processing performed on personal data"
  {:db/ident :dpvo/Processing,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres" "Javier Fernández"],
   :dcterms/description #voc/lstr
                         "The processing performed on personal data@en",
   :dcterms/modified #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source "https://specialprivacy.ercim.eu/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Processing@en",
   :rdfs/seeAlso
   ["https://specialprivacy.ercim.eu/langs/usage-policy#AnyProcessing"],
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status #voc/lstr "accepted@en"})

(def ProcessingContext
  "Context or conditions within which processing takes place"
  {:db/ident :dpvo/ProcessingContext,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Context or conditions within which processing takes place@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Processing Context@en",
   :rdfs/subClassOf [:dpvo/Context :dpvo/ProcessingContext],
   :vs/term_status #voc/lstr "accepted@en"})

(def ProcessingScale
  "Scale of Processing"
  {:db/ident :dpvo/ProcessingScale,
   :dcterms/created #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Piero Bonatti"],
   :dcterms/description #voc/lstr "Scale of Processing@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The exact definition of what constitutes \"scale\" depends on use of jurisdictional, domain-specific, or other forms of externally defined criterias. Where possible, this should be reflected by extending the scales provided with the appropriate context.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Processing Scale@en",
   :rdfs/subClassOf
   [:dpvo/Scale :dpvo/ProcessingScale :dpvo/ProcessingContext :dpvo/Context],
   :vs/term_status #voc/lstr "accepted@en"})

(def ProfessionalTraining
  "Training methods that are intended to provide professional knowledge and expertise"
  {:db/ident :dpvo/ProfessionalTraining,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Training methods that are intended to provide professional knowledge and expertise@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Professional Training@en",
   :rdfs/subClassOf [:dpvo/StaffTraining
                     :dpvo/ProfessionalTraining
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Profiling
  "to create a profile that describes or represents a person"
  {:db/ident :dpvo/Profiling,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr "to create a profile that describes or represents a person@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Profiling@en",
   :rdfs/subClassOf [:dpvo/Use :dpvo/Profiling :dpvo/Processing],
   :vs/term_status #voc/lstr "accepted@en"})

(def Prohibition
  "A rule describing a prohibition to perform an activity"
  {:db/ident :dpvo/Prohibition,
   :dcterms/created #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator
   ["Beatriz Esteves" "Harshvardhan J. Pandit" "Georg P Krog" "Paul Ryan"],
   :dcterms/description
   #voc/lstr "A rule describing a prohibition to perform an activity@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Prohibition@en",
   :rdfs/subClassOf [:dpvo/Rule :dpvo/Prohibition],
   :vs/term_status #voc/lstr "accepted@en"})

(def ProvideEventRecommendations
  "Purposes associated with creating and providing personalised recommendations for events"
  {:db/ident :dpvo/ProvideEventRecommendations,
   :dcterms/created #inst "2019-11-26T00:00:00.000-05:00",
   :dcterms/creator ["Rudy Jacob" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with creating and providing personalised recommendations for events@en",
   :dcterms/modified #inst "2022-10-14T00:00:00.000-04:00",
   :dcterms/source "https://specialprivacy.ercim.eu/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Provide Event Recommendations@en",
   :rdfs/subClassOf [:dpvo/ProvidePersonalisedRecommendations
                     :dpvo/ProvideEventRecommendations
                     :dpvo/Personalisation
                     :dpvo/ServiceProvision
                     :dpvo/Purpose
                     :dpvo/ServicePersonalisation],
   :vs/term_status #voc/lstr "accepted@en"})

(def ProvidePersonalisedRecommendations
  "Purposes associated with creating and providing personalised recommendations"
  {:db/ident :dpvo/ProvidePersonalisedRecommendations,
   :dcterms/created #inst "2019-11-26T00:00:00.000-05:00",
   :dcterms/creator ["Rudy Jacob" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with creating and providing personalised recommendations@en",
   :dcterms/modified #inst "2022-10-14T00:00:00.000-04:00",
   :dcterms/source "https://specialprivacy.ercim.eu/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Provide Personalised Recommendations@en",
   :rdfs/subClassOf [:dpvo/ServicePersonalisation
                     :dpvo/ProvidePersonalisedRecommendations
                     :dpvo/Personalisation
                     :dpvo/ServiceProvision
                     :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Purposes associated with creating and providing product recommendations e.g. suggest similar products@en",
   :dcterms/modified #inst "2022-10-14T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Provide Product Recommendations@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/purposes#Marketing"],
   :rdfs/subClassOf [:dpvo/ProvidePersonalisedRecommendations
                     :dpvo/ProvideProductRecommendations
                     :dpvo/Personalisation
                     :dpvo/ServiceProvision
                     :dpvo/Purpose
                     :dpvo/ServicePersonalisation],
   :vs/term_status #voc/lstr "accepted@en"})

(def Pseudonymisation
  "Pseudonymisation means the processing of personal data in such a manner that the personal data can no longer be attributed to a specific data subject without the use of additional information, provided that such additional information is kept separately and is subject to technical and organisational measures to ensure that the personal data are not attributed to an identified or identifiable natural person;"
  {:db/ident :dpvo/Pseudonymisation,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Rob Brennan" "Axel Polleres" "Mark Lizar" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Pseudonymisation means the processing of personal data in such a manner that the personal data can no longer be attributed to a specific data subject without the use of additional information, provided that such additional information is kept separately and is subject to technical and organisational measures to ensure that the personal data are not attributed to an identified or identifiable natural person;@en",
   :dcterms/modified #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_5/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Pseudonymisation@en",
   :rdfs/subClassOf [:dpvo/Deidentification
                     :dpvo/Pseudonymisation
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure
                     :dpvo/DataSanitisationTechnique],
   :vs/term_status #voc/lstr "modified@en"})

(def Pseudonymise
  "to replace personal identifiable information by artificial identifiers"
  {:db/ident :dpvo/Pseudonymise,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/creator "2022-10-14",
   :dcterms/description
   #voc/lstr
    "to replace personal identifiable information by artificial identifiers@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Pseudonymise@en",
   :rdfs/subClassOf [:dpvo/Transform :dpvo/Pseudonymise :dpvo/Processing],
   :vs/term_status #voc/lstr "modified@en"})

(def PseudonymisedData
  "Personal Data that has undergone a pseudonymisation process or a partial (incomplete) anonymisation process such that it is still considered Personal Data"
  {:db/ident :dpvo/PseudonymisedData,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Personal Data that has undergone a pseudonymisation process or a partial (incomplete) anonymisation process such that it is still considered Personal Data@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Pseudonymised Data@en",
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo/PseudonymisedData :dpvo/Data],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr "A source of data that is publicly accessible or available@en",
   :rdf/type [:owl/NamedIndividual
              :dpvo/DataSource
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/comment
   #voc/lstr
    "The term 'Public' is used here in a broad sense. Actual consideration of what is 'Public Data' can vary based on several contextual or jurisdictional factors such as  definition of open, methods of access, permissions and licenses.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Public Data Source@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def PublicInterest
  "Processing is necessary or beneficial for interest of the public or society at large"
  {:db/ident :dpvo/PublicInterest,
   :dcterms/created #inst "2021-04-21T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Processing is necessary or beneficial for interest of the public or society at large@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Public Interest@en",
   :rdfs/subClassOf [:dpvo/LegalBasis :dpvo/PublicInterest],
   :vs/term_status #voc/lstr "accepted@en"})

(def PublicLocation
  "Location that is or can be accessed by the public"
  {:db/ident            :dpvo/PublicLocation,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description #voc/lstr
                         "Location that is or can be accessed by the public@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Public Location@en",
   :rdfs/subClassOf     [:dpvo/LocalLocation
                         :dpvo/PublicLocation
                         :dpvo/Location
                         :dpvo/LocationLocality],
   :vs/term_status      #voc/lstr "accepted@en"})

(def PublicRelations
  "Purposes associated with managing and conducting public relations processes, including creating goodwill for the organisation"
  {:db/ident :dpvo/PublicRelations,
   :dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog" "David Hickey"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with managing and conducting public relations processes, including creating goodwill for the organisation@en",
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Public Relations@en",
   :rdfs/subClassOf [:dpvo/Marketing :dpvo/PublicRelations :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def Purpose
  "The purpose of processing personal data"
  {:db/ident :dpvo/Purpose,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Javier Fernández" "Axel Polleres"],
   :dcterms/description #voc/lstr "The purpose of processing personal data@en",
   :dcterms/modified #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source "https://specialprivacy.ercim.eu/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Purpose@en",
   :rdfs/seeAlso
   ["https://specialprivacy.ercim.eu/langs/usage-policy#AnyPurpose"],
   :rdfs/subClassOf :dpvo/Purpose,
   :vann/example "https://w3id.org/dpv/examples#E0004",
   :vs/term_status #voc/lstr "accepted@en"})

(def QuantumCryptography
  "Cryptographic methods that utilise quantum mechanical properties to perform cryptographic tasks"
  {:db/ident :dpvo/QuantumCryptography,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Cryptographic methods that utilise quantum mechanical properties to perform cryptographic tasks@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Quantum Cryptography@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/QuantumCryptography
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Query
  "to query or make enquiries over data"
  {:db/ident            :dpvo/Query,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "to query or make enquiries over data@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Query@en",
   :rdfs/subClassOf     [:dpvo/Consult :dpvo/Query :dpvo/Processing :dpvo/Use],
   :vs/term_status      #voc/lstr "accepted@en"})

(def RNGPseudonymisation
  "A pseudonymisation method where identifiers are substituted by a number chosen by a Random Number Generator (RNG)"
  {:db/ident :dpvo/RNGPseudonymisation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A pseudonymisation method where identifiers are substituted by a number chosen by a Random Number Generator (RNG)@en",
   :dcterms/modified #inst "2022-10-13T00:00:00.000-04:00",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "RNG Pseudonymisation@en",
   :rdfs/subClassOf [:dpvo/Pseudonymisation
                     :dpvo/RNGPseudonymisation
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure
                     :dpvo/DataSanitisationTechnique
                     :dpvo/Deidentification],
   :vs/term_status #voc/lstr "modified@en"})

(def RandomLocation
  "Location that is random or unknown"
  {:db/ident            :dpvo/RandomLocation,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Location that is random or unknown@en",
   :dcterms/modified    #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type            [:dpvo/LocationFixture :owl/NamedIndividual],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Random Location@en",
   :vs/term_status      #voc/lstr "modified@en"})

(def Recipient
  "Entities that receive personal data"
  {:db/ident :dpvo/Recipient,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres" "Javier Fernández"],
   :dcterms/description #voc/lstr "Entities that receive personal data@en",
   :dcterms/modified #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source ["https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_9/oj"
                    "https://specialprivacy.ercim.eu/"],
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A recipient of personal data can be used to indicate any entity that receives personal data. This can be a Third Party, Processor (GDPR), or even a Controller.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Recipient@en",
   :rdfs/seeAlso
   ["https://specialprivacy.ercim.eu/langs/usage-policy#AnyRecipient"],
   :rdfs/subClassOf [:dpvo/LegalEntity :dpvo/Recipient :dpvo/Entity],
   :vs/term_status #voc/lstr "accepted@en"})

(def Record
  "to make a record (especially media)"
  {:db/ident :dpvo/Record,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #voc/lstr "to make a record (especially media)@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Record@en",
   :rdfs/subClassOf [:dpvo/Obtain :dpvo/Record :dpvo/Processing],
   :vs/term_status #voc/lstr "accepted@en"})

(def RecordManagement
  "Purposes associated with manage creation, storage, and use of records relevant to operations, events, and processes e.g. to store logs or access requests"
  {:db/ident :dpvo/RecordManagement,
   :dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["David Hickey" "Harshvardhan J. Pandit" "Georg P Krog" "Paul Ryan"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with manage creation, storage, and use of records relevant to operations, events, and processes e.g. to store logs or access requests@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "This purpose relates specifiaclly for record creation and management. This can be combined or used along with other purposes to express intentions such as records for legal compliance or vendor payments.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Record Management@en",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/RecordManagement],
   :vs/term_status #voc/lstr "accepted@en"})

(def RecordsOfActivities
  "Records of activities within some context such as maintainence tasks or governance functions"
  {:db/ident :dpvo/RecordsOfActivities,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Records of activities within some context such as maintainence tasks or governance functions@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Records of Activities@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/RecordsOfActivities
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Region
  "A region is an area or site that is considered a location"
  {:db/ident :dpvo/Region,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "A region is an area or site that is considered a location@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Region@en",
   :rdfs/subClassOf [:dpvo/Location :dpvo/Region],
   :vs/term_status #voc/lstr "accepted@en"})

(def RegionalAuthority
  "An authority tasked with overseeing legal compliance for a region"
  {:db/ident :dpvo/RegionalAuthority,
   :dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "An authority tasked with overseeing legal compliance for a region@en",
   :dcterms/source "http://purl.org/adms",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Regional Authority@en",
   :rdfs/subClassOf [:dpvo/Authority
                     :dpvo/RegionalAuthority
                     :dpvo/LegalEntity
                     :dpvo/Organisation
                     :dpvo/Entity
                     :dpvo/GovernmentalOrganisation],
   :vs/term_status #voc/lstr "accepted@en"})

(def RegionalScale
  "Geographic coverage spanning a specific region or regions"
  {:db/ident :dpvo/RegionalScale,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Geographic coverage spanning a specific region or regions@en",
   :rdf/type [:owl/NamedIndividual
              :dpvo/GeographicCoverage
              :dpvo/Scale
              :dpvo/ProcessingContext
              :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Regional Scale@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RegisterOfProcessingActivities
  "A ROPA is a document maintained by Data Controllers detailing processing activities carried out under their responsibility"
  {:db/ident :dpvo/RegisterOfProcessingActivities,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description
   #voc/lstr
    "A ROPA is a document maintained by Data Controllers detailing processing activities carried out under their responsibility@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Tied to compliance processes and documents, decide how to specify those@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Register of Processing Activities@en",
   :rdfs/subClassOf [:dpvo/DataProcessingRecord
                     :dpvo/RegisterOfProcessingActivities
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/RecordsOfActivities
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def RegularityOfRecertification
  "Policy regarding repetition or renewal of existing certification(s)"
  {:db/ident :dpvo/RegularityOfRecertification,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Axel Polleres" "Rob Brennan" "Mark Lizar"],
   :dcterms/description
   #voc/lstr
    "Policy regarding repetition or renewal of existing certification(s)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Regularity of Re-certification@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/RegularityOfRecertification
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def RemoteLocation
  "Location is remote i.e. not local"
  {:db/ident            :dpvo/RemoteLocation,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Location is remote i.e. not local@en",
   :dcterms/modified    #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Remote Location@en",
   :rdfs/subClassOf     [:dpvo/LocationLocality
                         :dpvo/RemoteLocation
                         :dpvo/Location],
   :vs/term_status      #voc/lstr "modified@en"})

(def Remove
  "to destruct or erase data"
  {:db/ident :dpvo/Remove,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #voc/lstr "to destruct or erase data@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Remove@en",
   :rdfs/subClassOf [:dpvo/Processing :dpvo/Remove],
   :vs/term_status #voc/lstr "accepted@en"})

(def RenewedConsentGiven
  "The state where a previously given consent has been 'renewed' or 'refreshed' or 'reaffirmed' to form a new instance of given consent"
  {:db/ident :dpvo/RenewedConsentGiven,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Julian Flake" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "The state where a previously given consent has been 'renewed' or 'refreshed' or 'reaffirmed' to form a new instance of given consent@en",
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/type [:owl/NamedIndividual
              :dpvo/ConsentStatusValidForProcessing
              :dpvo/ConsentStatus
              :dpvo/Status
              :dpvo/Context],
   :rdfs/comment
   #voc/lstr
    "An example of this state is when a previously given consent has expired, and the individual is presented a notice regarding continuing associated processing operations - to which they agree. This state can be useful to keep track of 'reconfirmed' or 'refreshed' consent within consent records, assist notices and contextual agents to create better consenting dialogues, and assist with specific legal obligations related to subsequent consenting@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Renewed Consent Given@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RepairImpairments
  "Purposes associated with identifying, rectifying, or otherwise undertaking activities intended to fix or repair impairments to existing functionalities"
  {:db/ident :dpvo/RepairImpairments,
   :dcterms/created #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Purposes associated with identifying, rectifying, or otherwise undertaking activities intended to fix or repair impairments to existing functionalities@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "An example of identifying and rectifying impairments is the process of finding and fixing errors in products, commonly referred to as debugging@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Repair Impairments@en",
   :rdfs/subClassOf
   [:dpvo/ServiceProvision :dpvo/RepairImpairments :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def Representative
  "A representative of a legal entity"
  {:db/ident            :dpvo/Representative,
   :dcterms/created     #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator     ["Georg Krog"
                         "Paul Ryan"
                         "Harshvardhan J. Pandit"
                         "Beatriz Esteves"],
   :dcterms/description #voc/lstr "A representative of a legal entity@en",
   :dcterms/source      "https://eur-lex.europa.eu/eli/reg/2016/679/art_27/oj",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Representative@en",
   :rdfs/subClassOf     [:dpvo/LegalEntity :dpvo/Representative :dpvo/Entity],
   :vs/term_status      #voc/lstr "accepted@en"})

(def RequestAccepted
  "State of a request being accepted towards fulfilment"
  {:db/ident :dpvo/RequestAccepted,
   :dcterms/created #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "State of a request being accepted towards fulfilment@en",
   :rdf/type
   [:dpvo/RequestStatus :owl/NamedIndividual :dpvo/Status :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Request Accepted@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RequestAcknowledged
  "State of a request being acknowledged"
  {:db/ident            :dpvo/RequestAcknowledged,
   :dcterms/created     #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "State of a request being acknowledged@en",
   :rdf/type            [:owl/NamedIndividual
                         :dpvo/RequestStatus
                         :dpvo/Status
                         :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Request Acknowledged@en",
   :vs/term_status      #voc/lstr "accepted@en"})

(def RequestActionDelayed
  "State of a request being delayed towards fulfilment"
  {:db/ident :dpvo/RequestActionDelayed,
   :dcterms/created #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "State of a request being delayed towards fulfilment@en",
   :rdf/type
   [:dpvo/RequestStatus :owl/NamedIndividual :dpvo/Status :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Request Action Delayed@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RequestFulfilled
  "State of a request being fulfilled"
  {:db/ident            :dpvo/RequestFulfilled,
   :dcterms/created     #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "State of a request being fulfilled@en",
   :rdf/type            [:owl/NamedIndividual
                         :dpvo/RequestStatus
                         :dpvo/Status
                         :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Request Fulfilled@en",
   :vs/term_status      #voc/lstr "accepted@en"})

(def RequestInitiated
  "State of a request being initiated"
  {:db/ident            :dpvo/RequestInitiated,
   :dcterms/created     #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "State of a request being initiated@en",
   :rdf/type            [:dpvo/RequestStatus
                         :owl/NamedIndividual
                         :dpvo/Status
                         :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Request Initiated@en",
   :vs/term_status      #voc/lstr "accepted@en"})

(def RequestRejected
  "State of a request being rejected towards non-fulfilment"
  {:db/ident :dpvo/RequestRejected,
   :dcterms/created #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "State of a request being rejected towards non-fulfilment@en",
   :rdf/type
   [:owl/NamedIndividual :dpvo/RequestStatus :dpvo/Status :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Request Rejected@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RequestRequiredActionPerformed
  "State of a request's required action having been performed by the other party"
  {:db/ident :dpvo/RequestRequiredActionPerformed,
   :dcterms/created #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "State of a request's required action having been performed by the other party@en",
   :rdf/type
   [:dpvo/RequestStatus :owl/NamedIndividual :dpvo/Status :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Request Required Action Performed@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RequestRequiresAction
  "State of a request requiring an action to be performed from another party"
  {:db/ident :dpvo/RequestRequiresAction,
   :dcterms/created #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "State of a request requiring an action to be performed from another party@en",
   :rdf/type
   [:dpvo/RequestStatus :owl/NamedIndividual :dpvo/Status :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Request Requires Action@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RequestStatus
  "Status associated with requests"
  {:db/ident            :dpvo/RequestStatus,
   :dcterms/created     #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Status associated with requests@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Request Status@en",
   :rdfs/subClassOf     [:dpvo/Status :dpvo/RequestStatus :dpvo/Context],
   :vs/term_status      #voc/lstr "accepted@en"})

(def RequestStatusQuery
  "State of a request's status being queried"
  {:db/ident            :dpvo/RequestStatusQuery,
   :dcterms/created     #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "State of a request's status being queried@en",
   :rdf/type            [:dpvo/RequestStatus
                         :owl/NamedIndividual
                         :dpvo/Status
                         :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Request Status Query@en",
   :vs/term_status      #voc/lstr "accepted@en"})

(def RequestUnfulfilled
  "State of a request being unfulfilled"
  {:db/ident            :dpvo/RequestUnfulfilled,
   :dcterms/created     #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "State of a request being unfulfilled@en",
   :rdf/type            [:dpvo/RequestStatus
                         :owl/NamedIndividual
                         :dpvo/Status
                         :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Request Unfulfilled@en",
   :vs/term_status      #voc/lstr "accepted@en"})

(def RequestedServiceProvision
  "Purposes associated with delivering services as requested by user or consumer"
  {:db/ident :dpvo/RequestedServiceProvision,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Beatriz Esteves" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with delivering services as requested by user or consumer@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The use of 'request' here includes where an user explicitly asks for the service and also when an established contract requires the provision of the service@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Requested Service Provision@en",
   :rdfs/subClassOf
   [:dpvo/ServiceProvision :dpvo/RequestedServiceProvision :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def Required
  "Indication of 'required' or 'necessary'"
  {:db/ident            :dpvo/Required,
   :dcterms/created     #inst "2022-02-13T00:00:00.000-05:00",
   :dcterms/creator     ["Paul Ryan"
                         "Georg P Krog"
                         "Harshvardhan J. Pandit"
                         "Julian Flake"
                         "Beatriz Esteves"],
   :dcterms/description #voc/lstr "Indication of 'required' or 'necessary'@en",
   :rdf/type            [:owl/NamedIndividual :dpvo/Necessity :dpvo/Context],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Required@en",
   :vs/term_status      #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Purposes associated with conducting research and development for new methods, products, or services@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Research and Development@en",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/ResearchAndDevelopment],
   :vs/term_status #voc/lstr "accepted@en"})

(def Restrict
  "to apply a restriction on the processsing of specific records"
  {:db/ident :dpvo/Restrict,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr "to apply a restriction on the processsing of specific records@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Restrict@en",
   :rdfs/subClassOf [:dpvo/Transform :dpvo/Restrict :dpvo/Processing],
   :vs/term_status #voc/lstr "accepted@en"})

(def Retrieve
  "to retrieve data, often in an automated manner"
  {:db/ident :dpvo/Retrieve,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #voc/lstr
                         "to retrieve data, often in an automated manner@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Retrieve@en",
   :rdfs/subClassOf [:dpvo/Use :dpvo/Retrieve :dpvo/Processing],
   :vs/term_status #voc/lstr "accepted@en"})

(def ReviewImpactAssessment
  "Procedures to review impact assessments in terms of continued validity, adequacy for intended purposes, and conformance of processes with findings"
  {:db/ident :dpvo/ReviewImpactAssessment,
   :dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Procedures to review impact assessments in terms of continued validity, adequacy for intended purposes, and conformance of processes with findings@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Review Impact Assessment@en",
   :rdfs/subClassOf [:dpvo/ReviewProcedure
                     :dpvo/ImpactAssessment
                     :dpvo/ReviewImpactAssessment
                     :dpvo/Assessment
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def ReviewProcedure
  "A procedure or process that reviews the correctness and validity of other measures and processes"
  {:db/ident :dpvo/ReviewProcedure,
   :dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "A procedure or process that reviews the correctness and validity of other measures and processes@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Review Procedure@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/ReviewProcedure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Right
  "The right(s) applicable, provided, or expected."
  {:db/ident :dpvo/Right,
   :dcterms/created #inst "2020-11-18T00:00:00.000-05:00",
   :dcterms/creator ["Beatriz Esteves" "Georg P Krog" "Harshvardhan J Pandit"],
   :dcterms/description
   [#voc/lstr "The right(s) applicable, provided, or expected.@en"
    #voc/lstr "The right(s) applicable, provided, or expected@en"],
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A 'right' is a legal, social, or ethical principle of freedom or entitlement which dictate the norms regarding what is allowed or owed.. Rights as a concept encompass a broad area of norms and entities, and are not specific to Individuals or Data Protection / Privacy. For individual specific rights, see dpv:DataSubjectRight@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Right@en",
   :rdfs/subClassOf :dpvo/Right,
   :vs/term_status #voc/lstr "accepted@en"})

(def RightExerciseActivity
  "An activity representing an exercising of an active right"
  {:db/ident :dpvo/RightExerciseActivity,
   :dcterms/created #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J Pandit" "Beatriz Esteves" "Georg P Krog"],
   :dcterms/description
   #voc/lstr "An activity representing an exercising of an active right@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "There may be multiple activities associated with exercising and fulfilling rights. See the RightExerciseRecord concept for record-keeping of such activities in a cohesive manner.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Right Exercise Activity@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RightExerciseNotice
  "Information associated with exercising of an active right"
  {:db/ident :dpvo/RightExerciseNotice,
   :dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Beatriz Esteves" "Harshvardhan J Pandit" "Georg P Krog" "Paul Ryan"],
   :dcterms/description
   #voc/lstr "Information associated with exercising of an active right@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "This concept is intended for providing information regarding a right exercise. For specific instances of such exercises, see RightExerciseActivity and RightExerciseRecord.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Right Exercise Notice@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RightExerciseRecord
  "Record of a Right being exercised"
  {:db/ident :dpvo/RightExerciseRecord,
   :dcterms/created #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Harshvardhan J Pandit" "Beatriz Esteves" "Paul Ryan"],
   :dcterms/description #voc/lstr "Record of a Right being exercised@en",
   :rdf/type [:dpvo/Record :owl/NamedIndividual :dpvo/Obtain :dpvo/Processing],
   :rdfs/comment
   #voc/lstr
    "This concept represents a record of one or more right exercise activities, such as those associated with a single data subject or service or entity@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Right Exercise Record@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RightFulfilmentNotice
  "Notice provided regarding fulfilment of a right"
  {:db/ident :dpvo/RightFulfilmentNotice,
   :dcterms/created #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator ["Beatriz Esteves" "Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr
                         "Notice provided regarding fulfilment of a right@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "This notice is associated with situations where information is provided with the intention of progressing the fulfilment of a right. For example, a notice asking for more information regarding the scope of the right, or providing information on where to access the data provided under a right.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Right Fulfilment Notice@en",
   :rdfs/subClassOf [:dpvo/Notice
                     :dpvo/RightFulfilmentNotice
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def RightNonFulfilmentNotice
  "Notice provided regarding non-fulfilment of a right"
  {:db/ident :dpvo/RightNonFulfilmentNotice,
   :dcterms/created #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator ["Beatriz Esteves" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr "Notice provided regarding non-fulfilment of a right@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "This notice is associated with situations where information is provided with the intention of communicating non-fulfilment of a right. For example, to provide justifications on why a right could not be fulfilled or providing information about another entity  who should be approached for exercising this right.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Right Non-Fulfilment Notice@en",
   :rdfs/subClassOf [:dpvo/Notice
                     :dpvo/RightNonFulfilmentNotice
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Risk
  "A risk or possibility or uncertainty of negative effects, impacts, or consequences."
  {:db/ident :dpvo/Risk,
   :dcterms/created #inst "2020-11-18T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A risk or possibility or uncertainty of negative effects, impacts, or consequences.@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Risks can be associated with one or more different concepts such as purpose, processing, personal data, technical or organisational measure.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Risk@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RiskLevel
  "The magnitude of a risk expressed as an indication to aid in its management"
  {:db/ident :dpvo/RiskLevel,
   :dcterms/created #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "The magnitude of a risk expressed as an indication to aid in its management@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Risk Levels can be defined as a combination of different characteristics. For example, ISO 31073:2022 defines it as a combination of consequences and their likelihood. Another example would be the Risk Matrix where Risk Level is defined as a combination of Likelihood and Severity associated with the Risk.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Risk Level@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RiskManagementPlan
  "A scheme within the risk management framework specifying the approach, the management components, and resources to be applied to the management of risk"
  {:db/ident :dpvo/RiskManagementPlan,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A scheme within the risk management framework specifying the approach, the management components, and resources to be applied to the management of risk@en",
   :dcterms/source "https://www.iso.org/standard/79637.html",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Risk Management Plan@en",
   :rdfs/subClassOf [:dpvo/SecurityProcedure
                     :dpvo/RiskManagementPlan
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def RiskManagementPolicy
  "A policy or statement of the overall intentions and direction of an organisation related to risk management"
  {:db/ident :dpvo/RiskManagementPolicy,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A policy or statement of the overall intentions and direction of an organisation related to risk management@en",
   :dcterms/source "https://www.iso.org/standard/79637.html",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Risk Management Policy@en",
   :rdfs/subClassOf [:dpvo/Policy
                     :dpvo/SecurityProcedure
                     :dpvo/RiskManagementPolicy
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def RiskManagementProcess
  "The systematic application of management policies, procedures and practices to the activities of communicating, consulting, establishing the context, and identifying, analysing, evaluating, treating, monitoring, and reviewing risk"
  {:db/ident :dpvo/RiskManagementProcess,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "The systematic application of management policies, procedures and practices to the activities of communicating, consulting, establishing the context, and identifying, analysing, evaluating, treating, monitoring, and reviewing risk@en",
   :dcterms/source ["https://www.iso.org/standard/79637.html"
                    "https://www.iso.org/iso-31000-risk-management.html"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Risk Management Process@en",
   :rdfs/subClassOf [:dpvo/SecurityProcedure
                     :dpvo/RiskManagementProcess
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def RiskMitigationMeasure
  "Measures intended to mitigate, minimise, or prevent risk."
  {:db/ident :dpvo/RiskMitigationMeasure,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Paul Ryan" "Georg P Krog"],
   :dcterms/description
   #voc/lstr "Measures intended to mitigate, minimise, or prevent risk.@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Risk Mitigation Measure@en",
   :rdfs/subClassOf [:dpvo/TechnicalOrganisationalMeasure
                     :dpvo/RiskMitigationMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Rule
  "A rule describing a process or control that directs or determines if and how an activity should be conducted"
  {:db/ident :dpvo/Rule,
   :dcterms/created #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator
   ["Beatriz Esteves" "Harshvardhan J. Pandit" "Paul Ryan" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "A rule describing a process or control that directs or determines if and how an activity should be conducted@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Rule@en",
   :rdfs/subClassOf :dpvo/Rule,
   :vs/term_status #voc/lstr "accepted@en"})

(def Safeguard
  "A safeguard is a precautionary measure for the protection against or mitigation of negative effects"
  {:db/ident :dpvo/Safeguard,
   :dcterms/created #inst "2021-09-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J. Pandit" "David Hickey" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "A safeguard is a precautionary measure for the protection against or mitigation of negative effects@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "This concept is relevant given the requirement to assert safeguards in cross-border data transfers@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Safeguard@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/Safeguard
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def SafeguardForDataTransfer
  "Represents a safeguard used for data transfer. Can include technical or organisational measures."
  {:db/ident :dpvo/SafeguardForDataTransfer,
   :dcterms/created #inst "2021-09-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J. Pandit" "David Hickey" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Represents a safeguard used for data transfer. Can include technical or organisational measures.@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Safeguard for Data Transfer@en",
   :rdfs/subClassOf [:dpvo/Safeguard
                     :dpvo/SafeguardForDataTransfer
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Scale
  "A measurement along some dimension"
  {:db/ident :dpvo/Scale,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator ["Rana Saniei" "Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "A measurement along some dimension@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Scales are subjective concepts that need to be defined and interpreted within the context of their application. For example, what would be small within one context could be large within another.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Scale@en",
   :rdfs/subClassOf [:dpvo/ProcessingContext :dpvo/Scale :dpvo/Context],
   :vs/term_status #voc/lstr "accepted@en"})

(def Scope
  "Indication of the extent or range or boundaries associated with(in) a context"
  {:db/ident :dpvo/Scope,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Indication of the extent or range or boundaries associated with(in) a context@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Scope@en",
   :rdfs/subClassOf [:dpvo/Context :dpvo/Scope],
   :vs/term_status #voc/lstr "accepted@en"})

(def ScoringOfIndividuals
  "Processing that involves scoring of individuals"
  {:db/ident :dpvo/ScoringOfIndividuals,
   :dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Processing that involves scoring of individuals@en",
   :dcterms/modified #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Scoring of Individuals@en",
   :rdfs/subClassOf [:dpvo/EvaluationScoring
                     :dpvo/ScoringOfIndividuals
                     :dpvo/ProcessingContext
                     :dpvo/Context],
   :vs/term_status #voc/lstr "modified@en"})

(def Screen
  "to remove data for some criteria"
  {:db/ident            :dpvo/Screen,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description #voc/lstr "to remove data for some criteria@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Screen@en",
   :rdfs/subClassOf     [:dpvo/Transform :dpvo/Screen :dpvo/Processing],
   :vs/term_status      #voc/lstr "accepted@en"})

(def Seal
  "A seal or a mark indicating proof of certification to some certification or standard"
  {:db/ident :dpvo/Seal,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Mark Lizar" "Rob Brennan" "Axel Polleres" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "A seal or a mark indicating proof of certification to some certification or standard@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Seal@en",
   :rdfs/subClassOf [:dpvo/CertificationSeal
                     :dpvo/Seal
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def SearchFunctionalities
  "Purposes associated with providing searching, querying, or other forms of information retrieval related functionalities"
  {:db/ident :dpvo/SearchFunctionalities,
   :dcterms/created #inst "2022-11-09T00:00:00.000-05:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   #voc/lstr
    "Purposes associated with providing searching, querying, or other forms of information retrieval related functionalities@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Search Functionalities@en",
   :rdfs/subClassOf
   [:dpvo/ServiceProvision :dpvo/SearchFunctionalities :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Indication of 'secondary' or 'minor' or 'auxiliary' importance@en",
   :rdf/type [:dpvo/Importance :owl/NamedIndividual :dpvo/Context],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Secondary Importance@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def SecretSharingSchemes
  "Use of secret sharing schemes where the secret can only be reconstructed through combination of sufficient number of individuals"
  {:db/ident :dpvo/SecretSharingSchemes,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Use of secret sharing schemes where the secret can only be reconstructed through combination of sufficient number of individuals@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Secret Sharing Schemes@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/SecretSharingSchemes
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Sector describes the area of application or domain that indicates or restricts scope for interpretation and application of purpose e.g. Agriculture, Banking@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "There are various sector codes used commonly to indicate the domain of an organisation or business. Examples include NACE (EU), ISIC (UN), SIC and NAICS (USA).@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Sector@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def SecureMultiPartyComputation
  "Use of cryptographic methods for entities to jointly compute functions without revealing inputs"
  {:db/ident :dpvo/SecureMultiPartyComputation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Use of cryptographic methods for entities to jointly compute functions without revealing inputs@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Secure Multi-Party Computation@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/SecureMultiPartyComputation
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def SecurityAssessment
  "Assessment of security intended to identity gaps, vulnerabilities, risks, and effectiveness of controls"
  {:db/ident :dpvo/SecurityAssessment,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Assessment of security intended to identity gaps, vulnerabilities, risks, and effectiveness of controls@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Security Assessment@en",
   :rdfs/subClassOf [:dpvo/SecurityProcedure
                     :dpvo/Assessment
                     :dpvo/SecurityAssessment
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def SecurityKnowledgeTraining
  "Training intended to increase knowledge regarding security"
  {:db/ident :dpvo/SecurityKnowledgeTraining,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Training intended to increase knowledge regarding security@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Security Knowledge Training@en",
   :rdfs/subClassOf [:dpvo/StaffTraining
                     :dpvo/SecurityKnowledgeTraining
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def SecurityMethod
  "Methods that relate to creating and providing security"
  {:db/ident :dpvo/SecurityMethod,
   :dcterms/created #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Methods that relate to creating and providing security@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Security Method@en",
   :rdfs/subClassOf [:dpvo/TechnicalMeasure
                     :dpvo/SecurityMethod
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def SecurityProcedure
  "Procedures associated with assessing, implementing, and evaluating security"
  {:db/ident :dpvo/SecurityProcedure,
   :dcterms/created #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Procedures associated with assessing, implementing, and evaluating security@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Security Procedure@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/SecurityProcedure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def SecurityRoleProcedures
  "Procedures related to security roles"
  {:db/ident :dpvo/SecurityRoleProcedures,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Procedures related to security roles@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Security Role Procedures@en",
   :rdfs/subClassOf [:dpvo/SecurityProcedure
                     :dpvo/SecurityRoleProcedures
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Purposes associated with selling or sharing data or information to third parties@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Sell here means exchange, submit, or provide in return for direct or indirect compensation. Was subclass of commercial interest, changed to reflect selling something@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Sell Data to Third Parties@en",
   :rdfs/subClassOf [:dpvo/SellProducts
                     :dpvo/SellDataToThirdParties
                     :dpvo/ServiceProvision
                     :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Purposes associated with selling or sharing insights obtained from analysis of data@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Sell here means exchange, submit, or provide in return for direct or indirect compensation. Was subclass of commercial interest, changed to reflect selling something@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Sell Insights from Data@en",
   :rdfs/subClassOf [:dpvo/SellProducts
                     :dpvo/SellInsightsFromData
                     :dpvo/ServiceProvision
                     :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def SellProducts
  "Purposes associated with selling products or services"
  {:db/ident :dpvo/SellProducts,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Beatriz Esteves" "Georg P Krog"],
   :dcterms/description
   #voc/lstr "Purposes associated with selling products or services@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Sell here means exchange, submit, or provide in return for direct or indirect compensation.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Sell Products@en",
   :rdfs/subClassOf [:dpvo/ServiceProvision :dpvo/SellProducts :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Purposes associated with selling products or services to the user, consumer, or data subjects@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Sell Products here refers to processing necessary to provide and complete a sale to customers. It should not be confused with providing services with a cost based on an established agreement.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Sell Products to Data Subject@en",
   :rdfs/subClassOf [:dpvo/SellProducts
                     :dpvo/SellProductsToDataSubject
                     :dpvo/ServiceProvision
                     :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def SensitivePersonalData
  "Personal data that is considered 'sensitive' in terms of privacy and/or impact, and therefore requires additional considerations and/or protection"
  {:db/ident :dpvo/SensitivePersonalData,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Personal data that is considered 'sensitive' in terms of privacy and/or impact, and therefore requires additional considerations and/or protection@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Sensitivity' is a matter of context, and may be defined within legal frameworks. For GDPR, Special categories of personal data are considered a subset of sensitive data. To illustrate the difference between the two, consider the situation where Location data is collected, and which is considered 'sensitive' but not 'special'. As a probable rule, sensitive data require additional considerations whereas special category data requires additional legal basis / justifications.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Sensitive Personal Data@en",
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo/SensitivePersonalData :dpvo/Data],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Purposes associated with optimisation of services or activities@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Subclass of ServiceProvision since optimisation is usually considered part of providing services@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Service Optimisation@en",
   :rdfs/subClassOf
   [:dpvo/ServiceProvision :dpvo/ServiceOptimisation :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Purposes associated with providing personalisation within services or product or activities@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Service Personalisation@en",
   :rdfs/subClassOf [:dpvo/ServiceProvision
                     :dpvo/Personalisation
                     :dpvo/ServicePersonalisation
                     :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Purposes associated with providing service or product or activities@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Service Provision@en",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/ServiceProvision],
   :vs/term_status #voc/lstr "accepted@en"})

(def ServiceRegistration
  "Purposes associated with registering users and collecting information required for providing a service"
  {:db/ident :dpvo/ServiceRegistration,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog" "Beatriz Esteves"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with registering users and collecting information required for providing a service@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "An example of service registration is to provide a form that collects information such as preferred language or media format for downloading a movie@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Service Registration@en",
   :rdfs/subClassOf
   [:dpvo/ServiceProvision :dpvo/ServiceRegistration :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def ServiceUsageAnalytics
  "Purposes associated with conducting analysis and reporting related to usage of services or products"
  {:db/ident :dpvo/ServiceUsageAnalytics,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Beatriz Esteves" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with conducting analysis and reporting related to usage of services or products@en",
   :dcterms/modified #inst "2022-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Was \"UsageAnalytics\", prefixed with Service to better reflect scope@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Service Usage Analytics@en",
   :rdfs/subClassOf
   [:dpvo/ServiceProvision :dpvo/ServiceUsageAnalytics :dpvo/Purpose],
   :vs/term_status #voc/lstr "modified@en"})

(def Severity
  "The magnitude of being unwanted or having negative effects such as harmful impacts"
  {:db/ident :dpvo/Severity,
   :dcterms/created #inst "2022-07-21T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "The magnitude of being unwanted or having negative effects such as harmful impacts@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Severity can be associated with Risk, or its Consequences and Impacts@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Severity@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def Share
  "to give data (or a portion of it) to others"
  {:db/ident :dpvo/Share,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #voc/lstr
                         "to give data (or a portion of it) to others@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Share@en",
   :rdfs/subClassOf [:dpvo/Disclose :dpvo/Share :dpvo/Processing],
   :vs/term_status #voc/lstr "accepted@en"})

(def SingleSignOn
  "Use of credentials or processes that enable using one set of credentials to authenticate multiple contexts."
  {:db/ident :dpvo/SingleSignOn,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Use of credentials or processes that enable using one set of credentials to authenticate multiple contexts.@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Single Sign On@en",
   :rdfs/subClassOf [:dpvo/AuthenticationProtocols
                     :dpvo/SingleSignOn
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def SingularDataVolume
  "Data volume that is considered singular i.e. a specific instance or single item"
  {:db/ident :dpvo/SingularDataVolume,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Data volume that is considered singular i.e. a specific instance or single item@en",
   :rdf/type [:owl/NamedIndividual
              :dpvo/DataVolume
              :dpvo/ProcessingContext
              :dpvo/Context
              :dpvo/Scale],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Singular Data Volume@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def SingularFrequency
  "Frequency where occurences are singular i.e. they take place only once"
  {:db/ident :dpvo/SingularFrequency,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Frequency where occurences are singular i.e. they take place only once@en",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Singular Frequency@en",
   :rdfs/subClassOf [:dpvo/Frequency :dpvo/SingularFrequency :dpvo/Context],
   :vs/term_status #voc/lstr "modified@en"})

(def SingularScaleOfDataSubjects
  "Scale of data subjects considered singular i.e. a specific data subject"
  {:db/ident :dpvo/SingularScaleOfDataSubjects,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Scale of data subjects considered singular i.e. a specific data subject@en",
   :rdf/type [:dpvo/DataSubjectScale
              :owl/NamedIndividual
              :dpvo/Scale
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Singular Scale Of Data Subjects@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def SmallDataVolume
  "Data volume that is considered small or limited within the context"
  {:db/ident :dpvo/SmallDataVolume,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Data volume that is considered small or limited within the context@en",
   :rdf/type [:dpvo/DataVolume
              :owl/NamedIndividual
              :dpvo/ProcessingContext
              :dpvo/Context
              :dpvo/Scale],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Small Data Volume@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def SmallScaleOfDataSubjects
  "Scale of data subjects considered small or limited within the context"
  {:db/ident :dpvo/SmallScaleOfDataSubjects,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Scale of data subjects considered small or limited within the context@en",
   :rdf/type [:dpvo/DataSubjectScale
              :owl/NamedIndividual
              :dpvo/Scale
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Small Scale Of Data Subjects@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def SmallScaleProcessing
  "Processing that takes place at small scales (as specified by some criteria)"
  {:db/ident :dpvo/SmallScaleProcessing,
   :dcterms/created #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Processing that takes place at small scales (as specified by some criteria)@en",
   :rdf/type [:dpvo/ProcessingScale
              :owl/NamedIndividual
              :dpvo/Scale
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Small Scale Processing@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def SocialMediaMarketing
  "Purposes associated with conducting marketing through social media"
  {:db/ident :dpvo/SocialMediaMarketing,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit" "Beatriz Esteves"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with conducting marketing through social media@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Social Media Marketing@en",
   :rdfs/subClassOf [:dpvo/Marketing :dpvo/SocialMediaMarketing :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def SpecialCategoryPersonalData
  "Sensitive Personal Data whose use requires specific legal permission or justification"
  {:db/ident :dpvo/SpecialCategoryPersonalData,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Sensitive Personal Data whose use requires specific legal permission or justification@en",
   :dcterms/modified #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_9/par_1/oj",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The term 'special category' is based on GDPR Art.9, but should not be considered as exlusive to it. DPV considers all Special Categories to also be Sensitive, but whose use is either prohibited or regulated and therefore requires additional legal basis for justification.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Special Category Personal Data@en",
   :rdfs/subClassOf [:dpvo/SensitivePersonalData
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo/Data
                     :dpvo/PersonalData],
   :vs/term_status #voc/lstr "modified@en"})

(def SporadicDataVolume
  "Data volume that is considered sporadic or sparse within the context"
  {:db/ident :dpvo/SporadicDataVolume,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Data volume that is considered sporadic or sparse within the context@en",
   :rdf/type [:owl/NamedIndividual
              :dpvo/DataVolume
              :dpvo/ProcessingContext
              :dpvo/Context
              :dpvo/Scale],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Sporadic Data Volume@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def SporadicFrequency
  "Frequency where occurences are sporadic or infrequent or sparse"
  {:db/ident :dpvo/SporadicFrequency,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Frequency where occurences are sporadic or infrequent or sparse@en",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Sporadic Frequency@en",
   :rdfs/subClassOf [:dpvo/Frequency :dpvo/SporadicFrequency :dpvo/Context],
   :vs/term_status #voc/lstr "modified@en"})

(def SporadicScaleOfDataSubjects
  "Scale of data subjects considered sporadic or sparse within the context"
  {:db/ident :dpvo/SporadicScaleOfDataSubjects,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Scale of data subjects considered sporadic or sparse within the context@en",
   :rdf/type [:dpvo/DataSubjectScale
              :owl/NamedIndividual
              :dpvo/Scale
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Sporadic Scale Of Data Subjects@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def StaffTraining
  "Practices and policies regarding training of staff members"
  {:db/ident :dpvo/StaffTraining,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Rob Brennan" "Mark Lizar" "Axel Polleres" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr "Practices and policies regarding training of staff members@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Staff Training@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/StaffTraining
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Status
  "The status or state of something"
  {:db/ident            :dpvo/Status,
   :dcterms/created     #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "The status or state of something@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Status@en",
   :rdfs/subClassOf     [:dpvo/Context :dpvo/Status],
   :vs/term_status      #voc/lstr "accepted@en"})

(def StorageCondition
  "Conditions required or followed regarding storage of data"
  {:db/ident :dpvo/StorageCondition,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Axel Polleres" "Mark Lizar" "Rob Brennan"],
   :dcterms/description
   #voc/lstr "Conditions required or followed regarding storage of data@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Storage Condition@en",
   :rdfs/subClassOf
   [:dpvo/ProcessingContext :dpvo/StorageCondition :dpvo/Context],
   :vs/term_status #voc/lstr "accepted@en"})

(def StorageDeletion
  "Deletion or Erasure of data including any deletion guarantees"
  {:db/ident :dpvo/StorageDeletion,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Mark Lizar" "Axel Polleres" "Rob Brennan"],
   :dcterms/description
   #voc/lstr "Deletion or Erasure of data including any deletion guarantees@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Storage Deletion@en",
   :rdfs/subClassOf [:dpvo/StorageCondition
                     :dpvo/StorageDeletion
                     :dpvo/ProcessingContext
                     :dpvo/Context],
   :vs/term_status #voc/lstr "accepted@en"})

(def StorageDuration
  "Duration or temporal limitation on storage of personal data"
  {:db/ident :dpvo/StorageDuration,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Mark Lizar" "Rob Brennan" "Axel Polleres"],
   :dcterms/description
   #voc/lstr "Duration or temporal limitation on storage of personal data@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Storage Duration@en",
   :rdfs/subClassOf [:dpvo/StorageCondition
                     :dpvo/Duration
                     :dpvo/StorageDuration
                     :dpvo/ProcessingContext
                     :dpvo/Context],
   :vs/term_status #voc/lstr "accepted@en"})

(def StorageLocation
  "Location or geospatial scope where the data is stored"
  {:db/ident :dpvo/StorageLocation,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Rob Brennan" "Harshvardhan J. Pandit" "Axel Polleres" "Mark Lizar"],
   :dcterms/description
   #voc/lstr "Location or geospatial scope where the data is stored@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Storage Location@en",
   :rdfs/subClassOf [:dpvo/StorageCondition
                     :dpvo/Location
                     :dpvo/StorageLocation
                     :dpvo/ProcessingContext
                     :dpvo/Context],
   :vs/term_status #voc/lstr "accepted@en"})

(def StorageRestoration
  "Regularity and temporal span of data restoration/backup mechanisms that guarantee that data is preserved"
  {:db/ident :dpvo/StorageRestoration,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Mark Lizar" "Axel Polleres" "Harshvardhan J. Pandit" "Rob Brennan"],
   :dcterms/description
   #voc/lstr
    "Regularity and temporal span of data restoration/backup mechanisms that guarantee that data is preserved@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Storage Restoration@en",
   :rdfs/subClassOf [:dpvo/StorageCondition
                     :dpvo/StorageRestoration
                     :dpvo/ProcessingContext
                     :dpvo/Context],
   :vs/term_status #voc/lstr "accepted@en"})

(def Store
  "to keep data for future use"
  {:db/ident :dpvo/Store,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #voc/lstr "to keep data for future use@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Store@en",
   :rdfs/subClassOf [:dpvo/Processing :dpvo/Store],
   :vs/term_status #voc/lstr "accepted@en"})

(def Structure
  "to arrange data according to a structure"
  {:db/ident :dpvo/Structure,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #voc/lstr "to arrange data according to a structure@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Structure@en",
   :rdfs/subClassOf [:dpvo/Organise :dpvo/Structure :dpvo/Processing],
   :vs/term_status #voc/lstr "accepted@en"})

(def Student
  "Data subjects that are students"
  {:db/ident            :dpvo/Student,
   :dcterms/created     #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     ["Beatriz Esteves"
                         "Georg P. Krog"
                         "Julian Flake"
                         "Paul Ryan"
                         "Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Data subjects that are students@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Student@en",
   :rdfs/subClassOf     [:dpvo/DataSubject
                         :dpvo/Student
                         :dpvo/LegalEntity
                         :dpvo/Entity
                         :dpvo/NaturalPerson],
   :vs/term_status      #voc/lstr "accepted@en"})

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
   #voc/lstr
    "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between a Data Processor and a Data (Sub-)Processor@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Sub-Processor Agreement@en",
   :rdfs/subClassOf [:dpvo/DataProcessingAgreement
                     :dpvo/SubProcessorAgreement
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/LegalAgreement
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Subscriber
  "Data subjects that subscribe to service(s)"
  {:db/ident            :dpvo/Subscriber,
   :dcterms/created     #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit"
                         "Beatriz Esteves"
                         "Julian Flake"
                         "Georg P. Krog"
                         "Paul Ryan"],
   :dcterms/description #voc/lstr
                         "Data subjects that subscribe to service(s)@en",
   :rdf/type            :owl/Class,
   :rdfs/comment        #voc/lstr
                         "note: subscriber can be customer or consumer@en",
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Subscriber@en",
   :rdfs/subClassOf     [:dpvo/DataSubject
                         :dpvo/Subscriber
                         :dpvo/LegalEntity
                         :dpvo/Entity
                         :dpvo/NaturalPerson],
   :vs/term_status      #voc/lstr "accepted@en"})

(def SupraNationalAuthority
  "An authority tasked with overseeing legal compliance for a supra-national union e.g. EU"
  {:db/ident :dpvo/SupraNationalAuthority,
   :dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "An authority tasked with overseeing legal compliance for a supra-national union e.g. EU@en",
   :dcterms/source "http://purl.org/adms",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Supra-National Authority@en",
   :rdfs/subClassOf [:dpvo/Authority
                     :dpvo/SupraNationalAuthority
                     :dpvo/LegalEntity
                     :dpvo/Organisation
                     :dpvo/Entity
                     :dpvo/GovernmentalOrganisation],
   :vs/term_status #voc/lstr "accepted@en"})

(def SupraNationalUnion
  "A political union of two or more countries with an establishment of common authority"
  {:db/ident :dpvo/SupraNationalUnion,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A political union of two or more countries with an establishment of common authority@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Supranational Union@en",
   :rdfs/subClassOf [:dpvo/Location :dpvo/SupraNationalUnion],
   :vs/term_status #voc/lstr "accepted@en"})

(def SymmetricCryptography
  "Use of cryptography where the same keys are utilised for encryption and descryption of information"
  {:db/ident :dpvo/SymmetricCryptography,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Use of cryptography where the same keys are utilised for encryption and descryption of information@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Symmetric Cryptography@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/SymmetricCryptography
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def SymmetricEncryption
  "Use of symmetric cryptography to encrypt data"
  {:db/ident :dpvo/SymmetricEncryption,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Use of symmetric cryptography to encrypt data@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Symmetric Encryption@en",
   :rdfs/subClassOf [:dpvo/Encryption
                     :dpvo/SymmetricEncryption
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def SyntheticData
  "Synthetic data reffers to artificially created data such that it is intended to resemble real data (personal or non-personal), but does not refer to any specific identified or identifiable individual, or to the real measure of an observable parameter in the case of non-personal data"
  {:db/ident :dpvo/SyntheticData,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Synthetic data reffers to artificially created data such that it is intended to resemble real data (personal or non-personal), but does not refer to any specific identified or identifiable individual, or to the real measure of an observable parameter in the case of non-personal data@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Synthetic Data@en",
   :rdfs/subClassOf [:dpvo/Data :dpvo/SyntheticData],
   :vs/term_status #voc/lstr "accepted@en"})

(def SystematicMonitoring
  "Processing that involves systematic monitoring of individuals"
  {:db/ident :dpvo/SystematicMonitoring,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Piero Bonatti" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr "Processing that involves systematic monitoring of individuals@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Systematic Monitoring@en",
   :rdfs/subClassOf
   [:dpvo/ProcessingContext :dpvo/SystematicMonitoring :dpvo/Context],
   :vs/term_status #voc/lstr "accepted@en"})

(def TargetedAdvertising
  "Purposes associated with creating and providing pesonalised advertisement where the personalisation is targeted to a specific individual or group of individuals"
  {:db/ident :dpvo/TargetedAdvertising,
   :dcterms/created #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Purposes associated with creating and providing pesonalised advertisement where the personalisation is targeted to a specific individual or group of individuals@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Targeted Advertising@en",
   :rdfs/subClassOf [:dpvo/PersonalisedAdvertising
                     :dpvo/TargetedAdvertising
                     :dpvo/Personalisation
                     :dpvo/Marketing
                     :dpvo/Advertising
                     :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def TechnicalMeasure
  "Technical measures required/followed when processing data of the declared category"
  {:db/ident :dpvo/TechnicalMeasure,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Rob Brennan" "Mark Lizar" "Harshvardhan J. Pandit" "Axel Polleres"],
   :dcterms/description
   #voc/lstr
    "Technical measures required/followed when processing data of the declared category@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Technical Measure@en",
   :rdfs/subClassOf [:dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def TechnicalOrganisationalMeasure
  "The Technical and Organisational measures used."
  {:db/ident            :dpvo/TechnicalOrganisationalMeasure,
   :dcterms/created     #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator     "Bud Bruegger",
   :dcterms/description #voc/lstr
                         "The Technical and Organisational measures used.@en",
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Technical and Organisational Measure@en",
   :rdfs/subClassOf     :dpvo/TechnicalOrganisationalMeasure,
   :vs/term_status      #voc/lstr "accepted@en"})

(def TechnicalServiceProvision
  "Purposes associated with managing and providing technical processes and functions necessary for delivering services"
  {:db/ident :dpvo/TechnicalServiceProvision,
   :dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Purposes associated with managing and providing technical processes and functions necessary for delivering services@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Technical Service Provision@en",
   :rdfs/subClassOf
   [:dpvo/ServiceProvision :dpvo/TechnicalServiceProvision :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def Technology
  "The technology, technological implementation, or any techniques, skills, methods, and processes used or applied"
  {:db/ident :dpvo/Technology,
   :dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "The technology, technological implementation, or any techniques, skills, methods, and processes used or applied@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Examples (non-exhaustive) include: Algorithm, Process, Method, Skill, Database, Cookies, Server, Device@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Technology@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def TemporalDuration
  "Duration that has a fixed temporal duration e.g. 6 months"
  {:db/ident :dpvo/TemporalDuration,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Duration that has a fixed temporal duration e.g. 6 months@en",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Temporal Duration@en",
   :rdfs/subClassOf [:dpvo/Duration :dpvo/TemporalDuration :dpvo/Context],
   :vs/term_status #voc/lstr "modified@en"})

(def ThirdCountry
  "Represents a country outside applicable or compatible jurisdiction as outlined in law"
  {:db/ident :dpvo/ThirdCountry,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Represents a country outside applicable or compatible jurisdiction as outlined in law@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Third Country@en",
   :rdfs/subClassOf [:dpvo/Country :dpvo/ThirdCountry :dpvo/Location],
   :vs/term_status #voc/lstr "accepted@en"})

(def ThirdParty
  "A ‘third party’ means a natural or legal person, public authority, agency or body other than the data subject, controller, processor and people who, under the direct authority of the controller or processor, are authorised to process personal data."
  {:db/ident :dpvo/ThirdParty,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A ‘third party’ means a natural or legal person, public authority, agency or body other than the data subject, controller, processor and people who, under the direct authority of the controller or processor, are authorised to process personal data.@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_10/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Third Party@en",
   :rdfs/subClassOf
   [:dpvo/Recipient :dpvo/ThirdParty :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #voc/lstr "accepted@en"})

(def ThirdPartyAgreement
  "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between a Data Controller or Processor and a Third Party"
  {:db/ident :dpvo/ThirdPartyAgreement,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between a Data Controller or Processor and a Third Party@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Third-Party Agreement@en",
   :rdfs/subClassOf [:dpvo/DataProcessingAgreement
                     :dpvo/ThirdPartyAgreement
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/LegalAgreement
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def ThirdPartySecurityProcedures
  "Procedures related to security associated with Third Parties"
  {:db/ident :dpvo/ThirdPartySecurityProcedures,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Procedures related to security associated with Third Parties@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Third Party Security Procedures@en",
   :rdfs/subClassOf [:dpvo/SecurityProcedure
                     :dpvo/ThirdPartySecurityProcedures
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Data subjects that are tourists i.e. not citizens and not immigrants@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Tourist@en",
   :rdfs/subClassOf [:dpvo/DataSubject
                     :dpvo/Tourist
                     :dpvo/LegalEntity
                     :dpvo/Entity
                     :dpvo/NaturalPerson],
   :vs/term_status #voc/lstr "accepted@en"})

(def Transfer
  "to move data from one place to another"
  {:db/ident :dpvo/Transfer,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #voc/lstr "to move data from one place to another@en",
   :dcterms/source "https://specialprivacy.ercim.eu/vocabs/processing",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Transfer@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/processing#Transfer"],
   :rdfs/subClassOf [:dpvo/Processing :dpvo/Transfer],
   :vs/term_status #voc/lstr "accepted@en"})

(def Transform
  "to change the form or nature of data"
  {:db/ident :dpvo/Transform,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #voc/lstr "to change the form or nature of data@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Transform@en",
   :rdfs/subClassOf [:dpvo/Processing :dpvo/Transform],
   :vs/term_status #voc/lstr "accepted@en"})

(def Transmit
  "to send out data"
  {:db/ident :dpvo/Transmit,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #voc/lstr "to send out data@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Transmit@en",
   :rdfs/subClassOf [:dpvo/Disclose :dpvo/Transmit :dpvo/Processing],
   :vs/term_status #voc/lstr "accepted@en"})

(def TrustedComputing
  "Use of cryptographic methods to restrict access and execution to trusted parties and code"
  {:db/ident :dpvo/TrustedComputing,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Use of cryptographic methods to restrict access and execution to trusted parties and code@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Trusted Computing@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/TrustedComputing
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def TrustedExecutionEnvironments
  "Use of cryptographic methods to restrict access and execution to trusted parties and code within a dedicated execution environment"
  {:db/ident :dpvo/TrustedExecutionEnvironments,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Use of cryptographic methods to restrict access and execution to trusted parties and code within a dedicated execution environment@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Trusted Execution Environments@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/TrustedExecutionEnvironments
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def TrustedThirdPartyUtilisation
  "Utilisation of a trusted third party to provide or carry out a measure"
  {:db/ident :dpvo/TrustedThirdPartyUtilisation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Utilisation of a trusted third party to provide or carry out a measure@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Trusted Third Party Utilisation@en",
   :rdfs/subClassOf [:dpvo/SecurityProcedure
                     :dpvo/TrustedThirdPartyUtilisation
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/OrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def UninformedConsent
  "Consent that is uninformed i.e. without requirement to provide sufficient information to make a consenting decision"
  {:db/ident :dpvo/UninformedConsent,
   :dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Julian Flake" "Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description
   #voc/lstr
    "Consent that is uninformed i.e. without requirement to provide sufficient information to make a consenting decision@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Uninformed Consent@en",
   :rdfs/subClassOf [:dpvo/Consent :dpvo/UninformedConsent :dpvo/LegalBasis],
   :vs/term_status #voc/lstr "accepted@en"})

(def Unlawful
  "State of being unlawful or legally non-compliant"
  {:db/ident            :dpvo/Unlawful,
   :dcterms/created     #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "State of being unlawful or legally non-compliant@en",
   :rdf/type            [:owl/NamedIndividual
                         :dpvo/Lawfulness
                         :dpvo/Context
                         :dpvo/ComplianceStatus
                         :dpvo/Status],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Unlawful@en",
   :vs/term_status      #voc/lstr "accepted@en"})

(def UntilEventDuration
  "Duration that takes place until a specific event occurs e.g. Account Closure"
  {:db/ident :dpvo/UntilEventDuration,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Duration that takes place until a specific event occurs e.g. Account Closure@en",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Until Event Duration@en",
   :rdfs/subClassOf [:dpvo/Duration :dpvo/UntilEventDuration :dpvo/Context],
   :vs/term_status #voc/lstr "modified@en"})

(def UntilTimeDuration
  "Duration that has a fixed end date e.g. 2022-12-31"
  {:db/ident :dpvo/UntilTimeDuration,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Duration that has a fixed end date e.g. 2022-12-31@en",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Until Time Duration@en",
   :rdfs/subClassOf [:dpvo/Duration :dpvo/UntilTimeDuration :dpvo/Context],
   :vs/term_status #voc/lstr "modified@en"})

(def UnverifiedData
  "Data that has not been verified in terms of accuracy, inconsistency, or quality"
  {:db/ident :dpvo/UnverifiedData,
   :dcterms/created #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Data that has not been verified in terms of accuracy, inconsistency, or quality@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Unverified Data@en",
   :rdfs/subClassOf [:dpvo/Data :dpvo/UnverifiedData],
   :vs/term_status #voc/lstr "accepted@en"})

(def UsageControl
  "Management of usage, which is intended to be broader than access control and may cover trust, digital rights, or other relevant controls"
  {:db/ident :dpvo/UsageControl,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Management of usage, which is intended to be broader than access control and may cover trust, digital rights, or other relevant controls@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Usage Control@en",
   :rdfs/subClassOf [:dpvo/AccessControlMethod
                     :dpvo/UsageControl
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Use
  "to use data"
  {:db/ident :dpvo/Use,
   :dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #voc/lstr "to use data@en",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Use@en",
   :rdfs/subClassOf [:dpvo/Processing :dpvo/Use],
   :vs/term_status #voc/lstr "accepted@en"})

(def UseSyntheticData
  "Use of synthetic data to preserve privacy, security, or other effects and side-effects"
  {:db/ident :dpvo/UseSyntheticData,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Use of synthetic data to preserve privacy, security, or other effects and side-effects@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Use of Synthetic Data@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/UseSyntheticData
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def User
  "Data subjects that use service(s)"
  {:db/ident            :dpvo/User,
   :dcterms/created     #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     ["Paul Ryan"
                         "Julian Flake"
                         "Beatriz Esteves"
                         "Harshvardhan J. Pandit"
                         "Georg P. Krog"],
   :dcterms/description #voc/lstr "Data subjects that use service(s)@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "User@en",
   :rdfs/subClassOf     [:dpvo/DataSubject
                         :dpvo/User
                         :dpvo/LegalEntity
                         :dpvo/Entity
                         :dpvo/NaturalPerson],
   :vs/term_status      #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Purposes associated with personalisation of interfaces presented to the user@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Examples of user-interface personalisation include changing the language to match the locale@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "User Interface Personalisation@en",
   :rdfs/subClassOf [:dpvo/ServicePersonalisation
                     :dpvo/UserInterfacePersonalisation
                     :dpvo/Personalisation
                     :dpvo/ServiceProvision
                     :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def VariableLocation
  "Location that is known but is variable e.g. somewhere within a given area"
  {:db/ident :dpvo/VariableLocation,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Location that is known but is variable e.g. somewhere within a given area@en",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Variable Location@en",
   :rdfs/subClassOf [:dpvo/LocationFixture :dpvo/VariableLocation],
   :vs/term_status #voc/lstr "modified@en"})

(def VendorManagement
  "Purposes associated with manage orders, payment, evaluation, and prospecting related to vendors"
  {:db/ident :dpvo/VendorManagement,
   :dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "David Hickey" "Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with manage orders, payment, evaluation, and prospecting related to vendors@en",
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Vendor Management@en",
   :rdfs/subClassOf [:dpvo/Purpose :dpvo/VendorManagement],
   :vs/term_status #voc/lstr "accepted@en"})

(def VendorPayment
  "Purposes associated with managing payment of vendors"
  {:db/ident :dpvo/VendorPayment,
   :dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Paul Ryan" "David Hickey" "Georg P Krog"],
   :dcterms/description
   #voc/lstr "Purposes associated with managing payment of vendors@en",
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Vendor Payment@en",
   :rdfs/subClassOf [:dpvo/VendorManagement :dpvo/VendorPayment :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def VendorRecordsManagement
  "Purposes associated with managing records and orders related to vendors"
  {:db/ident :dpvo/VendorRecordsManagement,
   :dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J. Pandit" "David Hickey" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with managing records and orders related to vendors@en",
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Vendor Records Management@en",
   :rdfs/subClassOf
   [:dpvo/VendorManagement :dpvo/VendorRecordsManagement :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def VendorSelectionAssessment
  "Purposes associated with managing selection, assessment, and evaluation related to vendors"
  {:db/ident :dpvo/VendorSelectionAssessment,
   :dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "David Hickey" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Purposes associated with managing selection, assessment, and evaluation related to vendors@en",
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Vendor Selection Assessment@en",
   :rdfs/subClassOf
   [:dpvo/VendorManagement :dpvo/VendorSelectionAssessment :dpvo/Purpose],
   :vs/term_status #voc/lstr "accepted@en"})

(def VerifiedData
  "Data that has been verified in terms of accuracy, inconsistency, or quality"
  {:db/ident :dpvo/VerifiedData,
   :dcterms/created #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Data that has been verified in terms of accuracy, inconsistency, or quality@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Verified Data@en",
   :rdfs/subClassOf [:dpvo/Data :dpvo/VerifiedData],
   :vs/term_status #voc/lstr "accepted@en"})

(def VirtualisationSecurity
  "Security implemented at or through virtualised environments"
  {:db/ident :dpvo/VirtualisationSecurity,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Security implemented at or through virtualised environments@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Virtualisation Security@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/VirtualisationSecurity
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def Visitor
  "Data subjects that are temporary visitors"
  {:db/ident            :dpvo/Visitor,
   :dcterms/created     #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit"
                         "Paul Ryan"
                         "Julian Flake"
                         "Georg P. Krog"
                         "Beatriz Esteves"],
   :dcterms/description #voc/lstr
                         "Data subjects that are temporary visitors@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "Visitor@en",
   :rdfs/subClassOf     [:dpvo/DataSubject
                         :dpvo/Visitor
                         :dpvo/LegalEntity
                         :dpvo/Entity
                         :dpvo/NaturalPerson],
   :vs/term_status      #voc/lstr "accepted@en"})

(def VitalInterest
  "Processing is necessary or required to protect vital interests of a data subject or other natural person"
  {:db/ident :dpvo/VitalInterest,
   :dcterms/created #inst "2021-04-21T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Processing is necessary or required to protect vital interests of a data subject or other natural person@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Vital Interest@en",
   :rdfs/subClassOf [:dpvo/LegalBasis :dpvo/VitalInterest],
   :vs/term_status #voc/lstr "accepted@en"})

(def VitalInterestOfDataSubject
  "Processing is necessary or required to protect vital interests of a data subject"
  {:db/ident :dpvo/VitalInterestOfDataSubject,
   :dcterms/created #inst "2021-04-21T00:00:00.000-04:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Processing is necessary or required to protect vital interests of a data subject@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Vital Interest of Data Subject@en",
   :rdfs/subClassOf [:dpvo/VitalInterestOfNaturalPerson
                     :dpvo/VitalInterestOfDataSubject
                     :dpvo/LegalBasis
                     :dpvo/VitalInterest],
   :vs/term_status #voc/lstr "accepted@en"})

(def VitalInterestOfNaturalPerson
  "Processing is necessary or required to protect vital interests of a natural person"
  {:db/ident :dpvo/VitalInterestOfNaturalPerson,
   :dcterms/created #inst "2021-04-21T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Processing is necessary or required to protect vital interests of a natural person@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Vital Interest of Natural Person@en",
   :rdfs/subClassOf
   [:dpvo/VitalInterest :dpvo/VitalInterestOfNaturalPerson :dpvo/LegalBasis],
   :vs/term_status #voc/lstr "accepted@en"})

(def VulnerabilityTestingMethods
  "Methods that assess or discover vulnerabilities in a system"
  {:db/ident :dpvo/VulnerabilityTestingMethods,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Methods that assess or discover vulnerabilities in a system@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Vulnerability Testing Methods@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/VulnerabilityTestingMethods
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def VulnerableDataSubject
  "Data Subjects which should be considered 'vulnerable' and therefore would require additional measures and safeguards"
  {:db/ident :dpvo/VulnerableDataSubject,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan Pandit" "Paul Ryan" "Georg Krog"],
   :dcterms/description
   #voc/lstr
    "Data Subjects which should be considered 'vulnerable' and therefore would require additional measures and safeguards@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "This concept denotes a Data Subject or a group are vulnerable, but not what vulnerability they possess or its context. This information can be provided additionally as comments, or as separate concepts and relations. Proposals for this are welcome.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Vulnerable Data Subject@en",
   :rdfs/subClassOf [:dpvo/DataSubject
                     :dpvo/VulnerableDataSubject
                     :dpvo/LegalEntity
                     :dpvo/Entity
                     :dpvo/NaturalPerson],
   :vs/term_status #voc/lstr "accepted@en"})

(def WebBrowserSecurity
  "Security implemented at or over web browsers"
  {:db/ident :dpvo/WebBrowserSecurity,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Security implemented at or over web browsers@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "WebBrowser Security@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/WebBrowserSecurity
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def WebSecurityProtocols
  "Security implemented at or over web-based protocols"
  {:db/ident :dpvo/WebSecurityProtocols,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Security implemented at or over web-based protocols@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Web Security Protocols@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/WebSecurityProtocols
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def WirelessSecurityProtocols
  "Security implemented at or over wireless communication protocols"
  {:db/ident :dpvo/WirelessSecurityProtocols,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Security implemented at or over wireless communication protocols@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Wireless Security Protocols@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/WirelessSecurityProtocols
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def WithinDevice
  "Location is local and entirely within a device, such as a smartphone"
  {:db/ident :dpvo/WithinDevice,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Location is local and entirely within a device, such as a smartphone@en",
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Within Device@en",
   :rdfs/subClassOf [:dpvo/LocalLocation
                     :dpvo/WithinDevice
                     :dpvo/Location
                     :dpvo/LocationLocality],
   :vs/term_status #voc/lstr "modified@en"})

(def WithinPhysicalEnvironment
  "Location is local and entirely within a physical environment, such as a room"
  {:db/ident :dpvo/WithinPhysicalEnvironment,
   :dcterms/created #inst "2020-10-06T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Location is local and entirely within a physical environment, such as a room@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Within Physical Environment@en",
   :rdfs/subClassOf [:dpvo/LocalLocation
                     :dpvo/WithinPhysicalEnvironment
                     :dpvo/Location
                     :dpvo/LocationLocality],
   :vs/term_status #voc/lstr "accepted@en"})

(def WithinVirtualEnvironment
  "Location is local and entirely within a virtual environment, such as a shared network directory"
  {:db/ident :dpvo/WithinVirtualEnvironment,
   :dcterms/created #inst "2020-10-06T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Location is local and entirely within a virtual environment, such as a shared network directory@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Within Virtual Environment@en",
   :rdfs/subClassOf [:dpvo/LocalLocation
                     :dpvo/WithinVirtualEnvironment
                     :dpvo/Location
                     :dpvo/LocationLocality],
   :vs/term_status #voc/lstr "accepted@en"})

(def ZeroKnowledgeAuthentication
  "Authentication using Zero-Knowledge proofs"
  {:db/ident :dpvo/ZeroKnowledgeAuthentication,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Authentication using Zero-Knowledge proofs@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "Zero Knowledge Authentication@en",
   :rdfs/subClassOf [:dpvo/AuthenticationProtocols
                     :dpvo/CryptographicMethods
                     :dpvo/ZeroKnowledgeAuthentication
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/TechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def hasActivityStatus
  "Indicates the status of activity of specified concept"
  {:db/ident :dpvo/hasActivityStatus,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Indicates the status of activity of specified concept@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has activity status@en",
   :rdfs/range :dpvo/ActivityStatus,
   :rdfs/subPropertyOf [:dpvo/hasStatus :dpvo/hasActivityStatus],
   :vs/term_status #voc/lstr "accepted@en"})

(def hasAddress
  "Specifies address of a legal entity such as street address or pin code"
  {:db/ident :dpvo/hasAddress,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator
   ["Beatriz Esteves" "Georg P Krog" "Paul Ryan" "Harshvardhan J.Pandit"],
   :dcterms/description
   #voc/lstr
    "Specifies address of a legal entity such as street address or pin code@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Entity,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has address@en",
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf :dpvo/hasAddress,
   :vs/term_status #voc/lstr "accepted@en"})

(def hasAlgorithmicLogic
  "Indicates the logic used in processing such as for automated decision making"
  {:db/ident :dpvo/hasAlgorithmicLogic,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Georg P. Krog" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Indicates the logic used in processing such as for automated decision making@en",
   :dcterms/modified #inst "2022-06-15T00:00:00.000-04:00",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has algorithmic logic@en",
   :rdfs/range :dpvo/AlgorithmicLogic,
   :rdfs/subPropertyOf :dpvo/hasAlgorithmicLogic,
   :vs/term_status #voc/lstr "changed@en"})

(def hasApplicableLaw
  "Indicates applicability of a Law"
  {:db/ident            :dpvo/hasApplicableLaw,
   :dcterms/created     #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Indicates applicability of a Law@en",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "has applicable law@en",
   :rdfs/range          :dpvo/Law,
   :rdfs/subPropertyOf  :dpvo/hasApplicableLaw,
   :vs/term_status      #voc/lstr "accepted@en"})

(def hasAuditStatus
  "Indicates the status of audit associated with specified concept"
  {:db/ident :dpvo/hasAuditStatus,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Indicates the status of audit associated with specified concept@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has audit status@en",
   :rdfs/range :dpvo/AuditStatus,
   :rdfs/subPropertyOf [:dpvo/hasStatus :dpvo/hasAuditStatus],
   :vs/term_status #voc/lstr "accepted@en"})

(def hasAuthority
  "Indicates applicability of authority for a jurisdiction"
  {:db/ident :dpvo/hasAuthority,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr "Indicates applicability of authority for a jurisdiction@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has authority@en",
   :rdfs/range :dpvo/Authority,
   :rdfs/subPropertyOf :dpvo/hasAuthority,
   :vs/term_status #voc/lstr "accepted@en"})

(def hasComplianceStatus
  "Indicates the status of compliance of specified concept"
  {:db/ident :dpvo/hasComplianceStatus,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Indicates the status of compliance of specified concept@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has compliance status@en",
   :rdfs/range :dpvo/ComplianceStatus,
   :rdfs/subPropertyOf [:dpvo/hasStatus :dpvo/hasComplianceStatus],
   :vs/term_status #voc/lstr "accepted@en"})

(def hasConsentStatus
  "Specifies the state or status of consent"
  {:db/ident            :dpvo/hasConsentStatus,
   :dcterms/created     #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog"
                         "Julian Flake"
                         "Paul Ryan"
                         "Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Specifies the state or status of consent@en",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "has consent status@en",
   :rdfs/range          :dpvo/ConsentStatus,
   :rdfs/subPropertyOf  :dpvo/hasConsentStatus,
   :vs/term_status      #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Indicates consenquence(s) possible or arising from specified concept@en",
   :dcterms/modified #inst "2021-09-21T00:00:00.000-04:00",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment #voc/lstr "Removed plural suffix for consistency@en",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has consequence@en",
   :rdfs/range :dpvo/Consequence,
   :rdfs/subPropertyOf :dpvo/hasConsequence,
   :vs/term_status #voc/lstr "accepted@en"})

(def hasConsequenceOn
  "Indicates the thing (e.g. plan, process, or entity) affected by a consequence"
  {:db/ident :dpvo/hasConsequenceOn,
   :dcterms/created #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Indicates the thing (e.g. plan, process, or entity) affected by a consequence@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :dpvo/Consequence,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has consequence on@en",
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf :dpvo/hasConsequenceOn,
   :vs/term_status #voc/lstr "accepted@en"})

(def hasContact
  "Specifies contact details of a legal entity such as phone or email"
  {:db/ident :dpvo/hasContact,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J.Pandit" "Beatriz Esteves" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Specifies contact details of a legal entity such as phone  or email@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Entity,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has contact@en",
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf :dpvo/hasContact,
   :vs/term_status #voc/lstr "accepted@en"})

(def hasContext
  "Indicates a purpose is restricted to the specified context(s)"
  {:db/ident :dpvo/hasContext,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr "Indicates a purpose is restricted to the specified context(s)@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has context@en",
   :rdfs/range :dpvo/Context,
   :rdfs/subPropertyOf :dpvo/hasContext,
   :vs/term_status #voc/lstr "accepted@en"})

(def hasCountry
  "Indicates applicability of specified country"
  {:db/ident            :dpvo/hasCountry,
   :dcterms/created     #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description #voc/lstr
                         "Indicates applicability of specified country@en",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "has country@en",
   :rdfs/range          :dpvo/Country,
   :rdfs/subPropertyOf  [:dpvo/hasLocation :dpvo/hasCountry],
   :vs/term_status      #voc/lstr "accepted@en"})

(def hasData
  "Indicates associated with Data (may or may not be personal)"
  {:db/ident :dpvo/hasData,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Indicates associated with Data (may or may not be personal)@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has data@en",
   :rdfs/range :dpvo/Data,
   :rdfs/subPropertyOf :dpvo/hasData,
   :vs/term_status #voc/lstr "accepted@en"})

(def hasDataController
  "Indicates association with Data Controller"
  {:db/ident            :dpvo/hasDataController,
   :dcterms/created     #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator     ["Javier Fernández"
                         "Harshvardhan J. Pandit"
                         "Bud Bruegger"
                         "Mark Lizar"
                         "Axel Polleres"],
   :dcterms/description #voc/lstr
                         "Indicates association with Data Controller@en",
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "has data controller@en",
   :rdfs/range          [:dpvo/DataController :dpvo/LegalEntity],
   :rdfs/subPropertyOf  [:dpvo/hasEntity :dpvo/hasDataController],
   :vs/term_status      #voc/lstr "accepted@en"})

(def hasDataExporter
  "Indiciates inclusion or applicability of a LegalEntity in the role of Data Exporter"
  {:db/ident :dpvo/hasDataExporter,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Paul Ryan" "Georg P. Krog"],
   :dcterms/description
   #voc/lstr
    "Indiciates inclusion or applicability of a LegalEntity in the role of Data Exporter@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has data exporter@en",
   :rdfs/range :dpvo/DataExporter,
   :rdfs/subPropertyOf [:dpvo/hasEntity :dpvo/hasDataExporter],
   :vs/term_status #voc/lstr "accepted@en"})

(def hasDataImporter
  "Indiciates inclusion or applicability of a LegalEntity in the role of Data Importer"
  {:db/ident :dpvo/hasDataImporter,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Paul Ryan" "Georg P. Krog"],
   :dcterms/description
   #voc/lstr
    "Indiciates inclusion or applicability of a LegalEntity in the role of Data Importer@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has data importer@en",
   :rdfs/range :dpvo/DataImporter,
   :rdfs/subPropertyOf
   [:dpvo/hasRecipient :dpvo/hasDataImporter :dpvo/hasEntity],
   :vs/term_status #voc/lstr "accepted@en"})

(def hasDataProcessor
  "Indiciates inclusion or applicability of a Data Processor"
  {:db/ident :dpvo/hasDataProcessor,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Paul Ryan" "Georg P. Krog"],
   :dcterms/description
   #voc/lstr "Indiciates inclusion or applicability of a Data Processor@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has data processor@en",
   :rdfs/range :dpvo/DataProcessor,
   :rdfs/subPropertyOf
   [:dpvo/hasRecipient :dpvo/hasDataProcessor :dpvo/hasEntity],
   :vs/term_status #voc/lstr "accepted@en"})

(def hasDataProtectionOfficer
  "Specifices an associated data protection officer"
  {:db/ident            :dpvo/hasDataProtectionOfficer,
   :dcterms/created     #inst "2022-03-02T00:00:00.000-05:00",
   :dcterms/creator     ["Paul Ryan" "Rob Brennan"],
   :dcterms/description #voc/lstr
                         "Specifices an associated data protection officer@en",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "has data protection officer@en",
   :rdfs/range          :dpvo/DataProtectionOfficer,
   :rdfs/subPropertyOf  [:dpvo/hasRepresentative
                         :dpvo/hasDataProtectionOfficer
                         :dpvo/hasEntity],
   :vs/term_status      #voc/lstr "accepted@en"})

(def hasDataSource
  "Indicates the source or origin of data being processed"
  {:db/ident :dpvo/hasDataSource,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Paul Ryan" "Georg P. Krog"],
   :dcterms/description
   #voc/lstr "Indicates the source or origin of data being processed@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has data source@en",
   :rdfs/range :dpvo/DataSource,
   :rdfs/subPropertyOf :dpvo/hasDataSource,
   :vs/term_status #voc/lstr "accepted@en"})

(def hasDataSubject
  "Indicates association with Data Subject"
  {:db/ident            :dpvo/hasDataSubject,
   :dcterms/created     #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator     ["Javier Fernández"
                         "Harshvardhan J. Pandit"
                         "Axel Polleres"
                         "Bud Bruegger"
                         "Mark Lizar"],
   :dcterms/description #voc/lstr "Indicates association with Data Subject@en",
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "has data subject@en",
   :rdfs/range          :dpvo/DataSubject,
   :rdfs/subPropertyOf  [:dpvo/hasEntity :dpvo/hasDataSubject],
   :vs/term_status      #voc/lstr "accepted@en"})

(def hasDataSubjectScale
  "Indicates the scale of data subjects"
  {:db/ident            :dpvo/hasDataSubjectScale,
   :dcterms/created     #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Indicates the scale of data subjects@en",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "has data subject scale@en",
   :rdfs/range          :dpvo/DataSubjectScale,
   :rdfs/subPropertyOf  [:dpvo/hasScale :dpvo/hasDataSubjectScale],
   :vs/term_status      #voc/lstr "accepted@en"})

(def hasDataVolume
  "Indicates the volume of data"
  {:db/ident            :dpvo/hasDataVolume,
   :dcterms/created     #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Indicates the volume of data@en",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "has data volume@en",
   :rdfs/range          :dpvo/DataVolume,
   :rdfs/subPropertyOf  [:dpvo/hasScale :dpvo/hasDataVolume],
   :vs/term_status      #voc/lstr "accepted@en"})

(def hasDuration
  "Indicates information about duration"
  {:db/ident            :dpvo/hasDuration,
   :dcterms/created     #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator     ["Rob Brennan"
                         "Mark Lizar"
                         "Axel Polleres"
                         "Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Indicates information about duration@en",
   :dcterms/source      "https://specialprivacy.ercim.eu/",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "has duration@en",
   :rdfs/range          :dpvo/Duration,
   :rdfs/subPropertyOf  :dpvo/hasDuration,
   :vs/term_status      #voc/lstr "accepted@en"})

(def hasEntity
  "Indicates inclusion or applicability of an entity to some concept"
  {:db/ident :dpvo/hasEntity,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Indicates inclusion or applicability of an entity to some concept@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "parent property for controller, processor, data subject, authority, etc.?@en",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has entity@en",
   :rdfs/range :dpvo/Entity,
   :rdfs/subPropertyOf :dpvo/hasEntity,
   :vs/term_status #voc/lstr "accepted@en"})

(def hasFrequency
  "Indicates the frequency with which something takes place"
  {:db/ident :dpvo/hasFrequency,
   :dcterms/created #inst "2022-02-16T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Indicates the frequency with which something takes place@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has frequency@en",
   :rdfs/range :dpvo/Frequency,
   :rdfs/subPropertyOf :dpvo/hasFrequency,
   :vs/term_status #voc/lstr "accepted@en"})

(def hasGeographicCoverage
  "Indicate the geographic coverage (of specified context)"
  {:db/ident :dpvo/hasGeographicCoverage,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Indicate the geographic coverage (of specified context)@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has geographic coverage@en",
   :rdfs/range :dpvo/GeographicCoverage,
   :rdfs/subPropertyOf [:dpvo/hasScale :dpvo/hasGeographicCoverage],
   :vs/term_status #voc/lstr "accepted@en"})

(def hasHumanInvolvement
  "Indicates Involvement of humans in processing such as within automated decision making process"
  {:db/ident :dpvo/hasHumanInvolvement,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P. Krog"],
   :dcterms/description
   #voc/lstr
    "Indicates Involvement of humans in processing such as within automated decision making process@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #voc/lstr "Human involvement is also relevant to 'human in the loop'@en",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has human involvement@en",
   :rdfs/range :dpvo/HumanInvolvement,
   :rdfs/subPropertyOf :dpvo/hasHumanInvolvement,
   :vs/term_status #voc/lstr "accepted@en"})

(def hasIdentifier
  "Indicates an identifier associated for identification or reference"
  {:db/ident :dpvo/hasIdentifier,
   :dcterms/created #inst "2020-11-25T00:00:00.000-05:00",
   :dcterms/creator
   ["Harshvardhan J.Pandit" "Georg P Krog" "Paul Ryan" "Beatriz Esteves"],
   :dcterms/description
   #voc/lstr
    "Indicates an identifier associated for identification or reference@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has identifier@en",
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf :dpvo/hasIdentifier,
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Indicates impact(s) possible or arising as consequences from specified concept@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has impact@en",
   :rdfs/range :dpvo/Impact,
   :rdfs/subPropertyOf [:dpvo/hasConsequence :dpvo/hasImpact],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Indicates the thing (e.g. plan, process, or entity) affected by an impact@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :dpvo/Impact,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has impact on@en",
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf [:dpvo/hasConsequenceOn :dpvo/hasImpactOn],
   :vs/term_status #voc/lstr "accepted@en"})

(def hasIndicationMethod
  "Specifies the method by which an entity has indicated the specific context"
  {:db/ident :dpvo/hasIndicationMethod,
   :dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Harshvardhan J. Pandit" "Julian Flake"],
   :dcterms/description
   #voc/lstr
    "Specifies the method by which an entity has indicated the specific context@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has indication method@en",
   :rdfs/subPropertyOf :dpvo/hasIndicationMethod,
   :vs/term_status #voc/lstr "accepted@en"})

(def hasJointDataControllers
  "Indicates inclusion or applicability of a Joint Data Controller"
  {:db/ident :dpvo/hasJointDataControllers,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P. Krog"],
   :dcterms/description
   #voc/lstr
    "Indicates inclusion or applicability of a Joint Data Controller@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has joint data controllers@en",
   :rdfs/range :dpvo/JointDataControllers,
   :rdfs/subPropertyOf
   [:dpvo/hasDataController :dpvo/hasJointDataControllers :dpvo/hasEntity],
   :vs/term_status #voc/lstr "accepted@en"})

(def hasJurisdiction
  "Indicates applicability of specified jurisdiction"
  {:db/ident            :dpvo/hasJurisdiction,
   :dcterms/created     #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Indicates applicability of specified jurisdiction@en",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "has jurisdiction@en",
   :rdfs/range          :dpvo/Location,
   :rdfs/subPropertyOf  :dpvo/hasJurisdiction,
   :vs/term_status      #voc/lstr "accepted@en"})

(def hasJustification
  "Indicates a justification for specified concept or context"
  {:db/ident :dpvo/hasJustification,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Indicates a justification for specified concept or context@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has justification@en",
   :rdfs/range :dpvo/Justification,
   :rdfs/subPropertyOf :dpvo/hasJustification,
   :vs/term_status #voc/lstr "accepted@en"})

(def hasLawfulness
  "Indicates the status of being lawful or legally compliant"
  {:db/ident :dpvo/hasLawfulness,
   :dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Indicates the status of being lawful or legally compliant@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has lawfulness@en",
   :rdfs/range :dpvo/Lawfulness,
   :rdfs/subPropertyOf
   [:dpvo/hasComplianceStatus :dpvo/hasLawfulness :dpvo/hasStatus],
   :vs/term_status #voc/lstr "accepted@en"})

(def hasLegalBasis
  "Indicates use or applicability of a Legal Basis"
  {:db/ident            :dpvo/hasLegalBasis,
   :dcterms/created     #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator     ["Axel Polleres" "Javier Fernández"],
   :dcterms/description #voc/lstr
                         "Indicates use or applicability of a Legal Basis@en",
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "has legal basis@en",
   :rdfs/range          :dpvo/LegalBasis,
   :rdfs/subPropertyOf  :dpvo/hasLegalBasis,
   :vs/term_status      #voc/lstr "accepted@en"})

(def hasLikelihood
  "Indicates the likelihood associated with a concept"
  {:db/ident :dpvo/hasLikelihood,
   :dcterms/created #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Julian Flake" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   #voc/lstr "Indicates the likelihood associated with a concept@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has likelihood@en",
   :rdfs/range :dpvo/Likelihood,
   :rdfs/subPropertyOf :dpvo/hasLikelihood,
   :vs/term_status #voc/lstr "accepted@en"})

(def hasLocation
  "Indicates information about location"
  {:db/ident            :dpvo/hasLocation,
   :dcterms/created     #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator     ["Mark Lizar"
                         "Harshvardhan J. Pandit"
                         "Rob Brennan"
                         "Axel Polleres"],
   :dcterms/description #voc/lstr "Indicates information about location@en",
   :dcterms/source      "https://specialprivacy.ercim.eu/",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "has location@en",
   :rdfs/range          :dpvo/Location,
   :rdfs/subPropertyOf  :dpvo/hasLocation,
   :vs/term_status      #voc/lstr "accepted@en"})

(def hasName
  "Specifies name of a legal entity"
  {:db/ident            :dpvo/hasName,
   :dcterms/created     #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator     ["Harshvardhan J.Pandit"
                         "Georg P Krog"
                         "Beatriz Esteves"
                         "Paul Ryan"],
   :dcterms/description #voc/lstr "Specifies name of a legal entity@en",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :dpvo/Entity,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "has name@en",
   :rdfs/range          :owl/Thing,
   :rdfs/subPropertyOf  :dpvo/hasName,
   :vs/term_status      #voc/lstr "accepted@en"})

(def hasNotice
  "Indicates the use or applicability of a Notice for the specified context"
  {:db/ident :dpvo/hasNotice,
   :dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Paul Ryan" "Georg P Krog" "Julian Flake"],
   :dcterms/description
   #voc/lstr
    "Indicates the use or applicability of a Notice for the specified context@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has notice@en",
   :rdfs/range :dpvo/Notice,
   :rdfs/subPropertyOf [:dpvo/hasOrganisationalMeasure
                        :dpvo/hasNotice
                        :dpvo/hasTechnicalOrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def hasObligation
  "Specifying applicability or inclusion of an obligation rule within specified context"
  {:db/ident :dpvo/hasObligation,
   :dcterms/created #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Beatriz Esteves" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Specifying applicability or inclusion of an obligation rule within specified context@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Context,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has obligation@en",
   :rdfs/range :dpvo/Obligation,
   :rdfs/subPropertyOf [:dpvo/hasRule :dpvo/hasObligation],
   :vs/term_status #voc/lstr "accepted@en"})

(def hasOrganisationalMeasure
  "Indicates use or applicability of Organisational measure"
  {:db/ident :dpvo/hasOrganisationalMeasure,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Indicates use or applicability of Organisational measure@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has organisational measure@en",
   :rdfs/range :dpvo/OrganisationalMeasure,
   :rdfs/subPropertyOf [:dpvo/hasTechnicalOrganisationalMeasure
                        :dpvo/hasOrganisationalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def hasOutcome
  "Indicates an outcome of specified concept or context"
  {:db/ident :dpvo/hasOutcome,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Indicates an outcome of specified concept or context@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has outcome@en",
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf :dpvo/hasOutcome,
   :vs/term_status #voc/lstr "accepted@en"})

(def hasPermission
  "Specifying applicability or inclusion of a permission rule within specified context"
  {:db/ident :dpvo/hasPermission,
   :dcterms/created #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Beatriz Esteves" "Paul Ryan" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Specifying applicability or inclusion of a permission rule within specified context@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Context,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has permission@en",
   :rdfs/range :dpvo/Permission,
   :rdfs/subPropertyOf [:dpvo/hasRule :dpvo/hasPermission],
   :vs/term_status #voc/lstr "accepted@en"})

(def hasPersonalData
  "Indicates association with Personal Data"
  {:db/ident            :dpvo/hasPersonalData,
   :dcterms/created     #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Indicates association with Personal Data@en",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "has personal data@en",
   :rdfs/range          :dpvo/PersonalData,
   :rdfs/subPropertyOf  [:dpvo/hasData :dpvo/hasPersonalData],
   :vs/term_status      #voc/lstr "accepted@en"})

(def hasPersonalDataHandling
  "Indicates association with Personal Data Handling"
  {:db/ident            :dpvo/hasPersonalDataHandling,
   :dcterms/created     #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr
                         "Indicates association with Personal Data Handling@en",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "has personal data handling@en",
   :rdfs/range          :dpvo/PersonalDataHandling,
   :rdfs/subPropertyOf  :dpvo/hasPersonalDataHandling,
   :vs/term_status      #voc/lstr "accepted@en"})

(def hasPolicy
  "Indicates policy applicable or used"
  {:db/ident            :dpvo/hasPolicy,
   :dcterms/created     #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Indicates policy applicable or used@en",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "has policy@en",
   :rdfs/range          :dpvo/Policy,
   :rdfs/subPropertyOf  [:dpvo/hasTechnicalOrganisationalMeasure
                         :dpvo/hasPolicy],
   :vs/term_status      #voc/lstr "accepted@en"})

(def hasProcessing
  "Indicates association with Processing"
  {:db/ident            :dpvo/hasProcessing,
   :dcterms/created     #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator     ["Axel Polleres"
                         "Bud Bruegger"
                         "Javier Fernández"
                         "Mark Lizar"
                         "Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Indicates association with Processing@en",
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source      "https://specialprivacy.ercim.eu/",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "has processing@en",
   :rdfs/range          :dpvo/Processing,
   :rdfs/subPropertyOf  :dpvo/hasProcessing,
   :vs/term_status      #voc/lstr "accepted@en"})

(def hasProcessingAutomation
  "Indicates the use or extent of automation associated with processing"
  {:db/ident :dpvo/hasProcessingAutomation,
   :dcterms/created #inst "2022-08-13T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Indicates the use or extent of automation associated with processing@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has processing automation@en",
   :rdfs/range :dpvo/AutomationOfProcessing,
   :rdfs/subPropertyOf :dpvo/hasProcessingAutomation,
   :vs/term_status #voc/lstr "accepted@en"})

(def hasProhibition
  "Specifying applicability or inclusion of a prohibition rule within specified context"
  {:db/ident :dpvo/hasProhibition,
   :dcterms/created #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Beatriz Esteves" "Paul Ryan" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Specifying applicability or inclusion of a prohibition rule within specified context@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Context,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has prohibition@en",
   :rdfs/range :dpvo/Prohibition,
   :rdfs/subPropertyOf [:dpvo/hasRule :dpvo/hasProhibition],
   :vs/term_status #voc/lstr "accepted@en"})

(def hasPurpose
  "Indicates association with Purpose"
  {:db/ident            :dpvo/hasPurpose,
   :dcterms/created     #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator     ["Axel Polleres"
                         "Bud Bruegger"
                         "Mark Lizar"
                         "Harshvardhan J. Pandit"
                         "Javier Fernández"],
   :dcterms/description #voc/lstr "Indicates association with Purpose@en",
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source      "https://specialprivacy.ercim.eu/",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "has purpose@en",
   :rdfs/range          :dpvo/Purpose,
   :rdfs/subPropertyOf  :dpvo/hasPurpose,
   :vs/term_status      #voc/lstr "accepted@en"})

(def hasRecipient
  "Indicates Recipient of Personal Data"
  {:db/ident            :dpvo/hasRecipient,
   :dcterms/created     #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator     ["Bud Bruegger"
                         "Javier Fernández"
                         "Axel Polleres"
                         "Harshvardhan J. Pandit"
                         "Mark Lizar"],
   :dcterms/description #voc/lstr "Indicates Recipient of Personal Data@en",
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source      "https://specialprivacy.ercim.eu/",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "has recipient@en",
   :rdfs/range          :dpvo/Recipient,
   :rdfs/subPropertyOf  [:dpvo/hasEntity :dpvo/hasRecipient],
   :vs/term_status      #voc/lstr "accepted@en"})

(def hasRecipientDataController
  "Indiciates inclusion or applicability of a Data Controller as a Recipient of persona data"
  {:db/ident :dpvo/hasRecipientDataController,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator ["Georg P. Krog" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Indiciates inclusion or applicability of a Data Controller as a Recipient of persona data@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has recipient data controller@en",
   :rdfs/range :dpvo/DataController,
   :rdfs/subPropertyOf
   [:dpvo/hasRecipient :dpvo/hasRecipientDataController :dpvo/hasEntity],
   :vs/term_status #voc/lstr "accepted@en"})

(def hasRecipientThirdParty
  "Indiciates inclusion or applicability of a Third Party as a Recipient of persona data"
  {:db/ident :dpvo/hasRecipientThirdParty,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P. Krog"],
   :dcterms/description
   #voc/lstr
    "Indiciates inclusion or applicability of a Third Party as a Recipient of persona data@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has recipient third party@en",
   :rdfs/range :dpvo/ThirdParty,
   :rdfs/subPropertyOf
   [:dpvo/hasRecipient :dpvo/hasRecipientThirdParty :dpvo/hasEntity],
   :vs/term_status #voc/lstr "accepted@en"})

(def hasRelationWithDataSubject
  "Indicates the relation between specified Entity and Data Subject"
  {:db/ident :dpvo/hasRelationWithDataSubject,
   :dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Julian Flake" "Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description
   #voc/lstr
    "Indicates the relation between specified Entity and Data Subject@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :dpvo/Entity,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has relation with data subject@en",
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf [:dpvo/hasEntity :dpvo/hasRelationWithDataSubject],
   :vs/term_status #voc/lstr "accepted@en"})

(def hasRepresentative
  "Specifies representative of the legal entity"
  {:db/ident            :dpvo/hasRepresentative,
   :dcterms/created     #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator     ["Beatriz Esteves"
                         "Paul Ryan"
                         "Georg P Krog"
                         "Harshvardhan J.Pandit"],
   :dcterms/description #voc/lstr
                         "Specifies representative of the legal entity@en",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :dpvo/Entity,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "has representative@en",
   :rdfs/range          :dpvo/Representative,
   :rdfs/subPropertyOf  [:dpvo/hasEntity :dpvo/hasRepresentative],
   :vs/term_status      #voc/lstr "accepted@en"})

(def hasResidualRisk
  "Indicates the associated risk is the remaining or residual risk from applying mitigation measures or treatments to this risk"
  {:db/ident :dpvo/hasResidualRisk,
   :dcterms/created #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J. Pandit" "Julian Flake" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Indicates the associated risk is the remaining or residual risk from applying mitigation measures or treatments to this risk@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Risk,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has residual risk@en",
   :rdfs/range :dpvo/Risk,
   :rdfs/subPropertyOf :dpvo/hasResidualRisk,
   :vs/term_status #voc/lstr "accepted@en"})

(def hasResponsibleEntity
  "Specifies the indicated entity is responsible within some context"
  {:db/ident :dpvo/hasResponsibleEntity,
   :dcterms/created #inst "2022-03-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Specifies the indicated entity is responsible within some context@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has responsible entity@en",
   :rdfs/range :dpvo/Entity,
   :rdfs/subPropertyOf [:dpvo/hasEntity :dpvo/hasResponsibleEntity],
   :vs/term_status #voc/lstr "accepted@en"})

(def hasRight
  "Indicates use or applicability of Right"
  {:db/ident            :dpvo/hasRight,
   :dcterms/created     #inst "2020-11-18T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Indicates use or applicability of Right@en",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "has right@en",
   :rdfs/range          :dpvo/Right,
   :rdfs/subPropertyOf  :dpvo/hasRight,
   :vs/term_status      #voc/lstr "accepted@en"})

(def hasRisk
  "Indicates applicability of Risk"
  {:db/ident :dpvo/hasRisk,
   :dcterms/created #inst "2020-11-18T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   [#voc/lstr "Indicates applicability of Risk@en"
    #voc/lstr "Indicates applicability of Risk for this concept@en"],
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has risk@en",
   :rdfs/range :dpvo/Risk,
   :rdfs/subPropertyOf :dpvo/hasRisk,
   :vs/term_status #voc/lstr "accepted@en"})

(def hasRiskLevel
  "Indicates the associated risk level associated with a risk"
  {:db/ident :dpvo/hasRiskLevel,
   :dcterms/created #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Harshvardhan J. Pandit" "Julian Flake"],
   :dcterms/description
   #voc/lstr "Indicates the associated risk level associated with a risk@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Risk,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has risk level@en",
   :rdfs/range :dpvo/RiskLevel,
   :rdfs/subPropertyOf :dpvo/hasRiskLevel,
   :vs/term_status #voc/lstr "accepted@en"})

(def hasRule
  "Specifying applicability or inclusion of a rule within specified context"
  {:db/ident :dpvo/hasRule,
   :dcterms/created #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator
   ["Beatriz Esteves" "Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Specifying applicability or inclusion of a rule within specified context@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Context,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has rule@en",
   :rdfs/range :dpvo/Rule,
   :rdfs/subPropertyOf :dpvo/hasRule,
   :vs/term_status #voc/lstr "accepted@en"})

(def hasScale
  "Indicates the scale of specified concept"
  {:db/ident            :dpvo/hasScale,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Indicates the scale of specified concept@en",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "has scale@en",
   :rdfs/range          :dpvo/Scale,
   :rdfs/subPropertyOf  :dpvo/hasScale,
   :vs/term_status      #voc/lstr "accepted@en"})

(def hasScope
  "Indicates the scope of specified concept or context"
  {:db/ident :dpvo/hasScope,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Indicates the scope of specified concept or context@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has scope@en",
   :rdfs/range :dpvo/Scope,
   :rdfs/subPropertyOf :dpvo/hasScope,
   :vs/term_status #voc/lstr "accepted@en"})

(def hasSector
  "Indicates the purpose is associated with activities in the indicated (Economic) Sector(s)"
  {:db/ident :dpvo/hasSector,
   :dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "Indicates the purpose is associated with activities in the indicated (Economic) Sector(s)@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has sector@en",
   :rdfs/range :dpvo/Sector,
   :rdfs/subPropertyOf :dpvo/hasSector,
   :vs/term_status #voc/lstr "accepted@en"})

(def hasSeverity
  "Indicates the severity associated with a concept"
  {:db/ident            :dpvo/hasSeverity,
   :dcterms/created     #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit"
                         "Julian Flake"
                         "Georg P Krog"
                         "Paul Ryan"],
   :dcterms/description #voc/lstr
                         "Indicates the severity associated with a concept@en",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "has severity@en",
   :rdfs/range          :dpvo/Severity,
   :rdfs/subPropertyOf  :dpvo/hasSeverity,
   :vs/term_status      #voc/lstr "accepted@en"})

(def hasStatus
  "Indicates the status of specified concept"
  {:db/ident            :dpvo/hasStatus,
   :dcterms/created     #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Indicates the status of specified concept@en",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "has status@en",
   :rdfs/range          :dpvo/Status,
   :rdfs/subPropertyOf  :dpvo/hasStatus,
   :vs/term_status      #voc/lstr "accepted@en"})

(def hasStorageCondition
  "Indicates information about storage condition"
  {:db/ident            :dpvo/hasStorageCondition,
   :dcterms/created     #inst "2022-08-13T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit"
                         "Mark Lizar"
                         "Axel Polleres"
                         "Rob Brennan"],
   :dcterms/description #voc/lstr
                         "Indicates information about storage condition@en",
   :dcterms/source      "https://specialprivacy.ercim.eu/",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "has storage condition@en",
   :rdfs/range          :dpvo/StorageCondition,
   :rdfs/subPropertyOf  :dpvo/hasStorageCondition,
   :vs/term_status      #voc/lstr "changed@en"})

(def hasTechnicalMeasure
  "Indicates use or applicability of Technical measure"
  {:db/ident :dpvo/hasTechnicalMeasure,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Indicates use or applicability of Technical measure@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has technical measure@en",
   :rdfs/range :dpvo/TechnicalMeasure,
   :rdfs/subPropertyOf [:dpvo/hasTechnicalOrganisationalMeasure
                        :dpvo/hasTechnicalMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr
    "Indicates use or applicability of Technical or Organisational measure@en",
   :dcterms/modified #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has technical and organisational measure@en",
   :rdfs/range :dpvo/TechnicalOrganisationalMeasure,
   :rdfs/subPropertyOf :dpvo/hasTechnicalOrganisationalMeasure,
   :vs/term_status #voc/lstr "accepted@en"})

(def hasThirdCountry
  "Indicates applicability or relevance of a 'third country'"
  {:db/ident :dpvo/hasThirdCountry,
   :dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   #voc/lstr "Indicates applicability or relevance of a 'third country'@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "has third country@en",
   :rdfs/range :dpvo/ThirdCountry,
   :rdfs/subPropertyOf
   [:dpvo/hasCountry :dpvo/hasThirdCountry :dpvo/hasLocation],
   :vs/term_status #voc/lstr "accepted@en"})

(def isAfter
  "Indicates the specified concepts is 'after' this concept in some context"
  {:db/ident :dpvo/isAfter,
   :dcterms/created #inst "2022-03-02T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Julian Flake" "Georg P. Krog"],
   :dcterms/description
   #voc/lstr
    "Indicates the specified concepts is 'after' this concept in some context@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "is after@en",
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf :dpvo/isAfter,
   :vs/term_status #voc/lstr "accepted@en"})

(def isAuthorityFor
  "Indicates area, scope, or applicability of an Authority"
  {:db/ident :dpvo/isAuthorityFor,
   :dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr "Indicates area, scope, or applicability of an Authority@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :dpvo/Authority,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "is authority for@en",
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf :dpvo/isAuthorityFor,
   :vs/term_status #voc/lstr "accepted@en"})

(def isBefore
  "Indicates the specified concepts is 'before' this concept in some context"
  {:db/ident :dpvo/isBefore,
   :dcterms/created #inst "2022-03-02T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Julian Flake" "Georg P. Krog"],
   :dcterms/description
   #voc/lstr
    "Indicates the specified concepts is 'before' this concept in some context@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "is before@en",
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf :dpvo/isBefore,
   :vs/term_status #voc/lstr "accepted@en"})

(def isExercisedAt
  "Indicates context or information about exercising a right"
  {:db/ident :dpvo/isExercisedAt,
   :dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Indicates context or information about exercising a right@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/ActiveRight,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "is exercised at@en",
   :rdfs/range :dpvo/RightExerciseNotice,
   :rdfs/subPropertyOf :dpvo/isExercisedAt,
   :vs/term_status #voc/lstr "accepted@en"})

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
   #voc/lstr "Indicates implementation details such as entities or agents@en",
   :dcterms/modified #inst "2022-01-26T00:00:00.000-05:00",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #voc/lstr
    "The use of 'entity' is inclusive of entities (e.g. Data Processor) as well as 'agent' (e.g. DPO). For indicating technological implementation, the property isImplementedByTechnology should be used.@en",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "is implemented by entity@en",
   :rdfs/range :dpvo/Entity,
   :rdfs/subPropertyOf :dpvo/isImplementedByEntity,
   :vs/term_status #voc/lstr "changed@en"})

(def isImplementedUsingTechnology
  "Indicates implementation details such as technologies or processes"
  {:db/ident :dpvo/isImplementedUsingTechnology,
   :dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator
   ["Julian Flake" "Harshvardhan J. Pandit" "Paul Ryan" "Beatriz Esteves"],
   :dcterms/description
   #voc/lstr
    "Indicates implementation details such as technologies or processes@en",
   :dcterms/modified #inst "2022-06-15T00:00:00.000-04:00",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "The term 'technology' is inclusive of technologies, processes, and methods.@en",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "is implemented using technology@en",
   :rdfs/range :dpvo/Technology,
   :rdfs/subPropertyOf :dpvo/isImplementedUsingTechnology,
   :vs/term_status #voc/lstr "changed@en"})

(def isIndicatedAtTime
  "Specifies the temporal information for when the entity has indicated the specific context"
  {:db/ident :dpvo/isIndicatedAtTime,
   :dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Georg P Krog" "Julian Flake" "Paul Ryan"],
   :dcterms/description
   #voc/lstr
    "Specifies the temporal information for when the entity has indicated the specific context@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "is indicated at time@en",
   :rdfs/subPropertyOf :dpvo/isIndicatedAtTime,
   :vs/term_status #voc/lstr "accepted@en"})

(def isIndicatedBy
  "Specifies entity who indicates the specific context"
  {:db/ident :dpvo/isIndicatedBy,
   :dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Georg P Krog" "Paul Ryan" "Julian Flake"],
   :dcterms/description
   #voc/lstr "Specifies entity who indicates the specific context@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "is indicated by@en",
   :rdfs/range :dpvo/Entity,
   :rdfs/subPropertyOf :dpvo/isIndicatedBy,
   :vs/term_status #voc/lstr "accepted@en"})

(def isMitigatedByMeasure
  "Indicate a risk is mitigated by specified measure"
  {:db/ident            :dpvo/isMitigatedByMeasure,
   :dcterms/created     #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Indicate a risk is mitigated by specified measure@en",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :dpvo/Risk,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "is mitigated by measure@en",
   :rdfs/range          :dpvo/RiskMitigationMeasure,
   :rdfs/subPropertyOf  [:dpvo/hasTechnicalOrganisationalMeasure
                         :dpvo/isMitigatedByMeasure],
   :vs/term_status      #voc/lstr "accepted@en"})

(def isPolicyFor
  "Indicates the context or application of policy"
  {:db/ident            :dpvo/isPolicyFor,
   :dcterms/created     #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Indicates the context or application of policy@en",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :dpvo/Policy,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "is policy for@en",
   :rdfs/range          :owl/Thing,
   :rdfs/subPropertyOf  :dpvo/isPolicyFor,
   :vs/term_status      #voc/lstr "accepted@en"})

(def isRepresentativeFor
  "Indicates the entity is a representative for specified entity"
  {:db/ident :dpvo/isRepresentativeFor,
   :dcterms/created #inst "2022-11-09T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Indicates the entity is a representative for specified entity@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Representative,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "is representative for@en",
   :rdfs/range :dpvo/Entity,
   :rdfs/subPropertyOf [:dpvo/hasEntity :dpvo/isRepresentativeFor],
   :vs/term_status #voc/lstr "accepted@en"})

(def isResidualRiskOf
  "Indicates this risk is the remaining or residual risk from applying mitigation measures or treatments to specified risk"
  {:db/ident :dpvo/isResidualRiskOf,
   :dcterms/created #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Julian Flake" "Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description
   #voc/lstr
    "Indicates this risk is the remaining or residual risk from applying mitigation measures or treatments to specified risk@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Risk,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label #voc/lstr "is residual risk of@en",
   :rdfs/range :dpvo/Risk,
   :rdfs/subPropertyOf :dpvo/isResidualRiskOf,
   :vs/term_status #voc/lstr "accepted@en"})

(def mitigatesRisk
  "Indicates risks mitigated by this concept"
  {:db/ident            :dpvo/mitigatesRisk,
   :dcterms/created     #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Indicates risks mitigated by this concept@en",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :dpvo/RiskMitigationMeasure,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          #voc/lstr "mitigates risk@en",
   :rdfs/range          :dpvo/Risk,
   :rdfs/subPropertyOf  :dpvo/mitigatesRisk,
   :vs/term_status      #voc/lstr "accepted@en"})

(def ^{:private true} Resource
  "dcat:Resource"
  {:db/ident :dcat/Resource,
   :rdf/type :owl/Class,
   :rdfs/label #voc/lstr "dcat:Resource@en",
   :skos/scopeNote
   #voc/lstr
    "A dataset, data service, or any other resource associated with Right Exercise - such as for providing a copy of personal data@en"})

(def ^{:private true} page
  "foaf:page"
  {:db/ident :foaf/page,
   :rdf/type [:rdf/Property :owl/AnnotationProperty],
   :rdfs/label #voc/lstr "foaf:page@en",
   :rdfs/subPropertyOf :foaf/page,
   :skos/scopeNote
   #voc/lstr
    "Indicates a web page or document providing information or functionality associated with a Right Exercise@en"})