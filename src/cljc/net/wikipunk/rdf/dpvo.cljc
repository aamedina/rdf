(ns net.wikipunk.rdf.dpvo
  "The Data Privacy Vocabulary (DPV) provides terms (classes and properties) to represent information about legally compliant personal data handling, which includes purposes, processing, personal data, technical and organisational measures."
  {:dcat/downloadURL "resources/dpv-owl/dpv.ttl",
   :dcterms/abstract
   #rdf/langString
    "The Data Privacy Vocabulary (DPV) provides terms (classes and properties) to represent information about legally compliant personal data handling, which includes purposes, processing, personal data, technical and organisational measures.@en",
   :dcterms/contributor ["Rigo Wenning"
                         "Georg P Krog"
                         "Simon Steyskal"
                         "Harshvardhan J. Pandit"
                         "Piero Bonatti"
                         "Paul Ryan"
                         "Elmar Kiesling"
                         "Bert Bos"
                         "Mark Lizar"
                         "Javier D. Fernández"
                         "Rob Brennan"
                         "Axel Polleres"
                         "Eva Schlehahn"
                         "Bud Bruegger"
                         "Beatriz Esteves"
                         "Ramisa Gachpaz Hamed"
                         "Julian Flake"
                         "Fajar J. Ekaputra"],
   :dcterms/created #xsd/date #inst "2019-06-18T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Axel Polleres"}],
   :dcterms/description
   #rdf/langString
    "The Data Privacy Vocabulary (DPV) provides terms (classes and properties) to represent information about legally compliant personal data handling, which includes purposes, processing, personal data, technical and organisational measures.@en",
   :dcterms/license {:rdfa/uri
                     "https://www.w3.org/Consortium/Legal/2015/doc-license"},
   :dcterms/modified #xsd/date #inst "2022-12-05T00:00:00.000-05:00",
   :dcterms/source {:rdfa/uri "https://www.w3.org/community/dpvcg/"},
   :dcterms/title #rdf/langString "Data Privacy Vocabulary@en",
   :owl/versionInfo "1",
   :rdf/ns-prefix-map {"dcat" "http://www.w3.org/ns/dcat#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "dpv" "https://w3id.org/dpv#",
                       "dpvo" "https://w3id.org/dpv/dpv-owl#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "vann" "http://purl.org/vocab/vann/",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "dpvo",
   :rdfa/uri "https://w3id.org/dpv/dpv-owl",
   :vann/preferredNamespacePrefix "dpvo",
   :vann/preferredNamespaceUri "https://w3id.org/dpv/dpv-owl#"})

(def AcademicResearch
  "Purposes associated with conducting or assisting with research conducted in an academic context e.g. within universities"
  {:db/ident :dpvo/AcademicResearch,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Axel Polleres"}
                     {:xsd/string "Simon Steyskal"}
                     {:xsd/string "Javier Fernandez"}
                     {:xsd/string "Elmar Kiesling"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with conducting or assisting with research conducted in an academic context e.g. within universities@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Academic Research@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/purposes#Education"},
   :rdfs/subClassOf [:dpvo/ResearchAndDevelopment :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def AcademicScientificOrganisation
  "Organisations related to academia or scientific pursuits e.g. Universities, Schools, Research Bodies"
  {:db/ident :dpvo/AcademicScientificOrganisation,
   :dcterms/created #xsd/date #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Organisations related to academia or scientific pursuits e.g. Universities, Schools, Research Bodies@en",
   :dcterms/modified #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :dcterms/source {:rdfa/uri "http://purl.org/adms"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Academic or Scientific Organisation@en",
   :rdfs/subClassOf [:dpvo/Organisation :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "modified@en"})

(def Access
  "to access data"
  {:db/ident            :dpvo/Access,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Georg P Krog"}],
   :dcterms/description #rdf/langString "to access data@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Access@en",
   :rdfs/subClassOf     [:dpvo/Use :dpvo/Processing],
   :vs/term_status      #rdf/langString "accepted@en"})

(def AccessControlMethod
  "Methods which restrict access to a place or resource"
  {:db/ident :dpvo/AccessControlMethod,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Axel Polleres"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Rob Brennan"}
                     {:xsd/string "Mark Lizar"}],
   :dcterms/description
   #rdf/langString "Methods which restrict access to a place or resource@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Access Control Method@en",
   :rdfs/subClassOf [:dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def AccountManagement
  "Account Management refers to purposes associated with account management, such as to create, provide, maintain, and manage accounts"
  {:db/ident :dpvo/AccountManagement,
   :dcterms/created #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Account Management refers to purposes associated with account management, such as to create, provide, maintain, and manage accounts@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Account Management@en",
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status #rdf/langString "accepted@en"})

(def Acquire
  "to come into possession or control of the data"
  {:db/ident :dpvo/Acquire,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #rdf/langString
                         "to come into possession or control of the data@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Acquire@en",
   :rdfs/subClassOf [:dpvo/Obtain :dpvo/Processing],
   :vs/term_status #rdf/langString "accepted@en"})

(def ActiveRight
  "The right(s) applicable, provided, or expected that need to be (actively) exercised"
  {:db/ident :dpvo/ActiveRight,
   :dcterms/created #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Harshvardhan J Pandit"}],
   :dcterms/description
   #rdf/langString
    "The right(s) applicable, provided, or expected that need to be (actively) exercised@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Active rights require the entity to expressly exercise them. For example, a Data Subject exercising their right to withdraw their consent.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Active Right@en",
   :rdfs/subClassOf :dpvo/Right,
   :vs/term_status #rdf/langString "accepted@en"})

(def ActivityCompleted
  "State of an activity that has completed i.e. is fully in the past"
  {:db/ident :dpvo/ActivityCompleted,
   :dcterms/created #xsd/date #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "State of an activity that has completed i.e. is fully in the past@en",
   :rdf/type
   [:dpvo/ActivityStatus :owl/NamedIndividual :dpvo/Context :dpvo/Status],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Activity Completed@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def ActivityHalted
  "State of an activity that was occuring in the past, and has been halted or paused or stoped"
  {:db/ident :dpvo/ActivityHalted,
   :dcterms/created #xsd/date #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "State of an activity that was occuring in the past, and has been halted or paused or stoped@en",
   :rdf/type
   [:dpvo/ActivityStatus :owl/NamedIndividual :dpvo/Context :dpvo/Status],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Activity Halted@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def ActivityMonitoring
  "Monitoring of activities including assessing whether they have been successfully initiated and completed"
  {:db/ident :dpvo/ActivityMonitoring,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Monitoring of activities including assessing whether they have been successfully initiated and completed@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Activity Monitoring@en",
   :rdfs/subClassOf [:dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def ActivityNotCompleted
  "State of an activity that could not be completed, but has reached some end state"
  {:db/ident :dpvo/ActivityNotCompleted,
   :dcterms/created #xsd/date #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "State of an activity that could not be completed, but has reached some end state@en",
   :rdf/type
   [:dpvo/ActivityStatus :owl/NamedIndividual :dpvo/Context :dpvo/Status],
   :rdfs/comment
   #rdf/langString
    "This relates to a 'Stop' state as distinct from a 'Halt' state. It makes no comments on whether the Acitivity can be resumed or continued towards completion.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Acitivity Not Completed@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def ActivityOngoing
  "State of an activity occuring in continuation i.e. currently ongoing"
  {:db/ident :dpvo/ActivityOngoing,
   :dcterms/created #xsd/date #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "State of an activity occuring in continuation i.e. currently ongoing@en",
   :rdf/type
   [:dpvo/ActivityStatus :owl/NamedIndividual :dpvo/Context :dpvo/Status],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Activity Ongoing@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def ActivityProposed
  "State of an activity being proposed or planned i.e. yet to occur"
  {:db/ident :dpvo/ActivityProposed,
   :dcterms/created #xsd/date #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "State of an activity being proposed or planned i.e. yet to occur@en",
   :rdf/type
   [:dpvo/ActivityStatus :owl/NamedIndividual :dpvo/Context :dpvo/Status],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Activity Proposed@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def ActivityStatus
  "Status associated with activity operations and lifecycles"
  {:db/ident :dpvo/ActivityStatus,
   :dcterms/created #xsd/date #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Status associated with activity operations and lifecycles@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Activity Status@en",
   :rdfs/subClassOf [:dpvo/Status :dpvo/Context],
   :vs/term_status #rdf/langString "accepted@en"})

(def Adapt
  "to modify the data, often rewritten into a new form for a new use"
  {:db/ident :dpvo/Adapt,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   #rdf/langString
    "to modify the data, often rewritten into a new form for a new use@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Adapt@en",
   :rdfs/subClassOf [:dpvo/Transform :dpvo/Processing],
   :vs/term_status #rdf/langString "accepted@en"})

(def Adult
  "A natural person that is not a child i.e. has attained some legally specified age of adulthood"
  {:db/ident :dpvo/Adult,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Georg Krog"},
   :dcterms/description
   #rdf/langString
    "A natural person that is not a child i.e. has attained some legally specified age of adulthood@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Adult@en",
   :rdfs/subClassOf
   [:dpvo/DataSubject :dpvo/NaturalPerson :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "accepted@en"})

(def Advertising
  "Purposes associated with conducting advertising i.e. process or artefact used to call attention to a product, service, etc. through announcements, notices, or other forms of communication"
  {:db/ident :dpvo/Advertising,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Beatriz Esteves"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with conducting advertising i.e. process or artefact used to call attention to a product, service, etc. through announcements, notices, or other forms of communication@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Advertising is a subset of Marketing. Advertising by itself does not indicate 'personalisation' i.e. personalised ads.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Advertising@en",
   :rdfs/subClassOf [:dpvo/Marketing :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def AlgorithmicLogic
  "The algorithmic logic applied or used"
  {:db/ident :dpvo/AlgorithmicLogic,
   :dcterms/created #xsd/date #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "The algorithmic logic applied or used@en",
   :dcterms/modified #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Algorithmic Logic is intended as a broad concept for explaining the use of algorithms and automated decisions making within Processing. To describe the actual algorithm, see the Algorithm concept.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Algorithmic Logic@en",
   :rdfs/subClassOf
   [:dpvo/AutomationOfProcessing :dpvo/Context :dpvo/ProcessingContext],
   :vs/term_status #rdf/langString "accepted@en"})

(def Align
  "to adjust the data to be in relation to another data"
  {:db/ident :dpvo/Align,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   #rdf/langString "to adjust the data to be in relation to another data@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Align@en",
   :rdfs/subClassOf [:dpvo/Transform :dpvo/Processing],
   :vs/term_status #rdf/langString "accepted@en"})

(def Alter
  "to change the data without changing it into something else"
  {:db/ident :dpvo/Alter,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   #rdf/langString
    "to change the data without changing it into something else@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Alter@en",
   :rdfs/subClassOf [:dpvo/Transform :dpvo/Processing],
   :vs/term_status #rdf/langString "accepted@en"})

(def Analyse
  "to study or examine the data in detail"
  {:db/ident :dpvo/Analyse,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #rdf/langString
                         "to study or examine the data in detail@en",
   :dcterms/source {:rdfa/uri
                    "https://specialprivacy.ercim.eu/vocabs/processing"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Analyse@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/processing#Analyse"},
   :rdfs/subClassOf [:dpvo/Use :dpvo/Processing],
   :vs/term_status #rdf/langString "accepted@en"})

(def Anonymisation
  "Anonymisation is the process by which data is irreversibly altered in such a way that a data subject can no longer be identified directly or indirectly, either by the entity holding the data alone or in collaboration with other entities and information sources"
  {:db/ident :dpvo/Anonymisation,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Rob Brennan"}
                     {:xsd/string "Mark Lizar"}
                     {:xsd/string "Axel Polleres"}],
   :dcterms/description
   #rdf/langString
    "Anonymisation is the process by which data is irreversibly altered in such a way that a data subject can no longer be identified directly or indirectly, either by the entity holding the data alone or in collaboration with other entities and information sources@en",
   :dcterms/modified #xsd/date #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source {:rdfa/uri "https://www.iso.org/standard/45123.html"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Anonymisation@en",
   :rdfs/subClassOf [:dpvo/Deidentification
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/DataSanitisationTechnique],
   :vs/term_status #rdf/langString "modified@en"})

(def Anonymise
  "to irreversibly alter personal data in such a way that an unique data subject can no longer be identified directly or indirectly or in combination with other data"
  {:db/ident :dpvo/Anonymise,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   #rdf/langString
    "to irreversibly alter personal data in such a way that an unique data subject can no longer be identified directly or indirectly or in combination with other data@en",
   :dcterms/source {:rdfa/uri
                    "https://specialprivacy.ercim.eu/vocabs/processing"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Anonymise@en",
   :rdfs/seeAlso
   {:rdfa/uri "https://specialprivacy.ercim.eu/vocabs/processing#Anonymise"},
   :rdfs/subClassOf [:dpvo/Transform :dpvo/Processing],
   :vs/term_status #rdf/langString "accepted@en"})

(def AnonymisedData
  "Personal Data that has been (fully and completely) anonymised so that it is no longer considered Personal Data"
  {:db/ident :dpvo/AnonymisedData,
   :dcterms/created #xsd/date #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Piero Bonatti"},
   :dcterms/description
   #rdf/langString
    "Personal Data that has been (fully and completely) anonymised so that it is no longer considered Personal Data@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "It is advised to carefully consider indicating data is fully or completely anonymised by determining whether the data by itself or in combination with other data can identify a person. Failing this condition, the data should be denoted as PseudonymisedData. To indicate data is anonymised only for a specified entity (e.g. within an organisation), the concept ContextuallyAnonymisedData (as subclass of PseudonymisedData) should be used instead of AnonymisedData.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Anonymised Data@en",
   :rdfs/subClassOf [:dpvo/NonPersonalData :dpvo/Data],
   :vs/term_status #rdf/langString "accepted@en"})

(def AntiTerrorismOperations
  "Purposes associated with activities that detect, prevent, mitigate, or perform other activities for anti-terrorism"
  {:db/ident :dpvo/AntiTerrorismOperations,
   :dcterms/created #xsd/date #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Purposes associated with activities that detect, prevent, mitigate, or perform other activities for anti-terrorism@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Anti-Terrorism Operations@en",
   :rdfs/subClassOf [:dpvo/EnforceSecurity :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def Applicant
  "Data subjects that are applicants in some context"
  {:db/ident            :dpvo/Applicant,
   :dcterms/created     #xsd/date #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Julian Flake"}
                         {:xsd/string "Paul Ryan"}
                         {:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Beatriz Esteves"}
                         {:xsd/string "Georg P. Krog"}],
   :dcterms/description #rdf/langString
                         "Data subjects that are applicants in some context@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Applicant@en",
   :rdfs/subClassOf     [:dpvo/DataSubject
                         :dpvo/NaturalPerson
                         :dpvo/LegalEntity
                         :dpvo/Entity],
   :vs/term_status      #rdf/langString "accepted@en"})

(def Assess
  "to assess data for some criteria"
  {:db/ident            :dpvo/Assess,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Georg P Krog"}],
   :dcterms/description #rdf/langString "to assess data for some criteria@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Assess@en",
   :rdfs/subClassOf     [:dpvo/Use :dpvo/Processing],
   :vs/term_status      #rdf/langString "accepted@en"})

(def Assessment
  "The document, plan, or process for assessment or determination towards a purpose e.g. assessment of legality or impact assessments"
  {:db/ident :dpvo/Assessment,
   :dcterms/created #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "The document, plan, or process for assessment or determination towards a purpose e.g. assessment of legality or impact assessments@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Assessment@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def AssetManagementProcedures
  "Procedures related to management of assets"
  {:db/ident :dpvo/AssetManagementProcedures,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Procedures related to management of assets@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Asset Management Procedures@en",
   :rdfs/subClassOf [:dpvo/GovernanceProcedures
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def AsylumSeeker
  "Data subjects that are asylum seekers"
  {:db/ident            :dpvo/AsylumSeeker,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Georg P Krog"},
   :dcterms/description #rdf/langString
                         "Data subjects that are asylum seekers@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Asylum Seeker@en",
   :rdfs/subClassOf     [:dpvo/VulnerableDataSubject
                         :dpvo/DataSubject
                         :dpvo/NaturalPerson
                         :dpvo/LegalEntity
                         :dpvo/Entity],
   :vs/term_status      #rdf/langString "accepted@en"})

(def AsymmetricCryptography
  "Use of public-key cryptography or asymmetric cryptography involving a public and private pair of keys"
  {:db/ident :dpvo/AsymmetricCryptography,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Use of public-key cryptography or asymmetric cryptography involving a public and private pair of keys@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Asymmetric Cryptography@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def AsymmetricEncryption
  "Use of asymmetric cryptography to encrypt data"
  {:db/ident :dpvo/AsymmetricEncryption,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Use of asymmetric cryptography to encrypt data@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Asymmetric Encryption@en",
   :rdfs/subClassOf [:dpvo/Encryption
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def AuditApproved
  "State of being approved through the audit"
  {:db/ident            :dpvo/AuditApproved,
   :dcterms/created     #xsd/date #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "State of being approved through the audit@en",
   :rdf/type            [:dpvo/AuditStatus
                         :owl/NamedIndividual
                         :dpvo/Status
                         :dpvo/Context],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Audit Approved@en",
   :vs/term_status      #rdf/langString "accepted@en"})

(def AuditConditionallyApproved
  "State of being conditionally approved through the audit"
  {:db/ident :dpvo/AuditConditionallyApproved,
   :dcterms/created #xsd/date #inst "2022-06-29T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Paul Ryan"},
   :dcterms/description
   #rdf/langString "State of being conditionally approved through the audit@en",
   :rdf/type
   [:dpvo/AuditStatus :owl/NamedIndividual :dpvo/Status :dpvo/Context],
   :rdfs/comment
   #rdf/langString
    "A \"conditional approval\" is intended to reflect states where the audit has identified further changes which must be implemented before considering the audit has been 'passed', without requiring another audit to validate them. This is distinct from the case where an audit has state 'rejected', which means changes must be made and submitted for review. The requirements of a 'conditional acceptance' are expected to be minor or not significant enough to warrant another audit to review them.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Audit Conditionally Approved@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def AuditNotRequired
  "State where an audit is determined as not being required"
  {:db/ident :dpvo/AuditNotRequired,
   :dcterms/created #xsd/date #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "State where an audit is determined as not being required@en",
   :rdf/type
   [:dpvo/AuditStatus :owl/NamedIndividual :dpvo/Status :dpvo/Context],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Audit Not Required@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def AuditRejected
  "State of not being approved or being rejected through the audit"
  {:db/ident :dpvo/AuditRejected,
   :dcterms/created #xsd/date #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "State of not being approved or being rejected through the audit@en",
   :rdf/type
   [:dpvo/AuditStatus :owl/NamedIndividual :dpvo/Status :dpvo/Context],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Audit Rejected@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def AuditRequested
  "State of an audit being requested whose outcome is not yet known"
  {:db/ident :dpvo/AuditRequested,
   :dcterms/created #xsd/date #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "State of an audit being requested whose outcome is not yet known@en",
   :rdf/type
   [:dpvo/AuditStatus :owl/NamedIndividual :dpvo/Status :dpvo/Context],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Audit Requested@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def AuditRequired
  "State where an audit is determined as being required but has not been conducted"
  {:db/ident :dpvo/AuditRequired,
   :dcterms/created #xsd/date #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "State where an audit is determined as being required but has not been conducted@en",
   :rdf/type
   [:dpvo/AuditStatus :owl/NamedIndividual :dpvo/Status :dpvo/Context],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Audit Required@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def AuditStatus
  "Status associated with Auditing or Investigation"
  {:db/ident            :dpvo/AuditStatus,
   :dcterms/created     #xsd/date #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Status associated with Auditing or Investigation@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Audit Status@en",
   :rdfs/subClassOf     [:dpvo/Status :dpvo/Context],
   :vs/term_status      #rdf/langString "accepted@en"})

(def Authentication-ABC
  "Use of Attribute Based Credentials (ABC) to perform and manage authentication"
  {:db/ident :dpvo/Authentication-ABC,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Use of Attribute Based Credentials (ABC) to perform and manage authentication@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/data-protection-engineering"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Authentication using ABC@en",
   :rdfs/subClassOf [:dpvo/CryptographicAuthentication
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/CryptographicMethods
                     :dpvo/AuthenticationProtocols],
   :vs/term_status #rdf/langString "accepted@en"})

(def Authentication-PABC
  "Use of Privacy-enhacing Attribute Based Credentials (ABC) to perform and manage authentication"
  {:db/ident :dpvo/Authentication-PABC,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Use of Privacy-enhacing Attribute Based Credentials (ABC) to perform and manage authentication@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/data-protection-engineering"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Authentication using PABC@en",
   :rdfs/subClassOf [:dpvo/CryptographicAuthentication
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/CryptographicMethods
                     :dpvo/AuthenticationProtocols],
   :vs/term_status #rdf/langString "accepted@en"})

(def AuthenticationProtocols
  "Protocols involving validation of identity i.e. authentication of a person or information"
  {:db/ident :dpvo/AuthenticationProtocols,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Rob Brennan"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Mark Lizar"}],
   :dcterms/description
   #rdf/langString
    "Protocols involving validation of identity i.e. authentication of a person or information@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Authentication Protocols@en",
   :rdfs/subClassOf [:dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def AuthorisationProcedure
  "Procedures for determining authorisation through permission or authority"
  {:db/ident :dpvo/AuthorisationProcedure,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Axel Polleres"}
                     {:xsd/string "Rob Brennan"}
                     {:xsd/string "Mark Lizar"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Procedures for determining authorisation through permission or authority@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "non-technical authorisation procedures: How is it described on an organisational level, who gets access to the data@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Authorisation Procedure@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def AuthorisationProtocols
  "Protocols involving authorisation of roles or profiles to determine permission, rights, or privileges"
  {:db/ident :dpvo/AuthorisationProtocols,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Protocols involving authorisation of roles or profiles to determine permission, rights, or privileges@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Authorisation Protocols@en",
   :rdfs/subClassOf [:dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Authority
  "An authority with the power to create or enforce laws, or determine their compliance."
  {:db/ident :dpvo/Authority,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan Pandit"}
                     {:xsd/string "Georg Krog"}],
   :dcterms/description
   #rdf/langString
    "An authority with the power to create or enforce laws, or determine their compliance.@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Authority@en",
   :rdfs/subClassOf [:dpvo/GovernmentalOrganisation
                     :dpvo/LegalEntity
                     :dpvo/Organisation
                     :dpvo/Entity],
   :vs/term_status #rdf/langString "accepted@en"})

(def AutomatedDecisionMaking
  "Processing that involves automated decision making"
  {:db/ident :dpvo/AutomatedDecisionMaking,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Piero Bonatti"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString "Processing that involves automated decision making@en",
   :dcterms/modified #xsd/date #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Automated decision making can be defined as “the ability to make decisions by technological means without human involvement.” (“Guidelines on Automated individual decision-making and Profiling for the purposes of Regulation 2016/679 (wp251rev.01)”, 2018, p. 8)@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Automated Decision Making@en",
   :rdfs/subClassOf [:dpvo/AutomationOfProcessing
                     :dpvo/DecisionMaking
                     :dpvo/Context
                     :dpvo/ProcessingContext],
   :vs/term_status #rdf/langString "modified@en"})

(def AutomatedProcessingWithHumanInput
  "Processing that is automated and involves inputs by Humans"
  {:db/ident :dpvo/AutomatedProcessingWithHumanInput,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Processing that is automated and involves inputs by Humans@en",
   :dcterms/modified #xsd/date #inst "2022-09-07T00:00:00.000-04:00",
   :rdf/type [:owl/NamedIndividual
              :dpvo/HumanInvolvementForInput
              :dpvo/AutomationOfProcessing
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/comment
   #rdf/langString
    "For example, an algorithm that takes inputs from humans and performs operations based on them@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Automated Processing with Human Input@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def AutomatedProcessingWithHumanOversight
  "Processing that is automated and involves oversight by Humans"
  {:db/ident :dpvo/AutomatedProcessingWithHumanOversight,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Processing that is automated and involves oversight by Humans@en",
   :dcterms/modified #xsd/date #inst "2022-09-07T00:00:00.000-04:00",
   :rdf/type [:dpvo/AutomationOfProcessing
              :dpvo/HumanInvolvementForOversight
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/comment
   #rdf/langString
    "For example, a human watching metrics to ensure correctness of procedural values and outputs as processing takes place@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Automated Processing with Human Oversight@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def AutomatedProcessingWithHumanReview
  "Processing that is automated and involves review by Humans"
  {:db/ident :dpvo/AutomatedProcessingWithHumanReview,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Processing that is automated and involves review by Humans@en",
   :dcterms/modified #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type [:dpvo/HumanInvolvementForVerification
              :owl/NamedIndividual
              :dpvo/AutomationOfProcessing
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/comment
   #rdf/langString
    "For example, a human verifying outputs of an algorithm for correctness or impact to individuals@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Automated Processing with Human Review@en",
   :vs/term_status #rdf/langString "modified@en"})

(def AutomationOfProcessing
  "Contextual information about the degree of automation and human involvement associated with Processing"
  {:db/ident :dpvo/AutomationOfProcessing,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Contextual information about the degree of automation and human involvement associated with Processing@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "It is difficult to provide a formal definition of automation since any and all processing may be considered automation. This concept instead is intended to explicitly signal the utilisation of automation and its extent towards some context - such as decision making, and to indicate the involvement of humans.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Automation of Processing@en",
   :rdfs/subClassOf [:dpvo/ProcessingContext :dpvo/Context],
   :vs/term_status #rdf/langString "accepted@en"})

(def BackgroundChecks
  "Procedure where the background of an entity is assessed to identity vulnerabilities and threats due to their current or intended role"
  {:db/ident :dpvo/BackgroundChecks,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Procedure where the background of an entity is assessed to identity vulnerabilities and threats due to their current or intended role@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Background Checks@en",
   :rdfs/subClassOf [:dpvo/SecurityProcedure
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Benefit
  "Impact(s) that acts as or causes benefits"
  {:db/ident            :dpvo/Benefit,
   :dcterms/created     #xsd/date #inst "2022-03-23T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Axel Polleres"}
                         {:xsd/string "Georg P Krog"}
                         {:xsd/string "Beatriz Esteves"}
                         {:xsd/string "Fajar Ekaputra"}
                         {:xsd/string "Julian Flake"}
                         {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Impact(s) that acts as or causes benefits@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Benefit@en",
   :rdfs/subClassOf     [:dpvo/Impact :dpvo/Consequence],
   :vs/term_status      #rdf/langString "accepted@en"})

(def BiometricAuthentication
  "Use of biometric data for authentication"
  {:db/ident :dpvo/BiometricAuthentication,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Use of biometric data for authentication@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Biometric Authentication@en",
   :rdfs/subClassOf [:dpvo/AuthenticationProtocols
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Certification
  "Certification mechanisms, seals, and marks for the purpose of demonstrating compliance"
  {:db/ident :dpvo/Certification,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Mark Lizar"}
                     {:xsd/string "Rob Brennan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Axel Polleres"}],
   :dcterms/description
   #rdf/langString
    "Certification mechanisms, seals, and marks for the purpose of demonstrating compliance@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Certification@en",
   :rdfs/subClassOf [:dpvo/CertificationSeal
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def CertificationSeal
  "Certifications, seals, and marks indicating compliance to regulations or practices"
  {:db/ident :dpvo/CertificationSeal,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Mark Lizar"}
                     {:xsd/string "Rob Brennan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Axel Polleres"}],
   :dcterms/description
   #rdf/langString
    "Certifications, seals, and marks indicating compliance to regulations or practices@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Certification and Seal@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Child
  "A 'child' is a natural legal person who is below a certain legal age depending on the legal jurisdiction."
  {:db/ident :dpvo/Child,
   :dcterms/created #xsd/date #inst "2020-11-25T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "A 'child' is a natural legal person who is below a certain legal age depending on the legal jurisdiction.@en",
   :dcterms/modified #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "The legality of age defining a child varies by jurisdiction. In addition, 'child' is distinct from a 'minor'. For example, the legal age for consumption of alcohol can be 21, which makes a person of age 20 a 'minor' in this context. In other cases, 'minor' and 'child' are used interchangeably to refer to a person below some legally defined age.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Child@en",
   :rdfs/subClassOf
   [:dpvo/DataSubject :dpvo/NaturalPerson :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "changed@en"})

(def Citizen
  "Data subjects that are citizens (for a jurisdiction)"
  {:db/ident :dpvo/Citizen,
   :dcterms/created #xsd/date #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Georg P. Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString "Data subjects that are citizens (for a jurisdiction)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Citizen@en",
   :rdfs/subClassOf
   [:dpvo/DataSubject :dpvo/NaturalPerson :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "accepted@en"})

(def City
  "A region consisting of urban population and commerce"
  {:db/ident :dpvo/City,
   :dcterms/created #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "A region consisting of urban population and commerce@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "City@en",
   :rdfs/subClassOf :dpvo/Location,
   :vs/term_status #rdf/langString "accepted@en"})

(def Client
  "Data subjects that are clients or recipients of services"
  {:db/ident :dpvo/Client,
   :dcterms/created #xsd/date #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P. Krog"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString
    "Data subjects that are clients or recipients of services@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Client@en",
   :rdfs/subClassOf [:dpvo/Customer
                     :dpvo/DataSubject
                     :dpvo/NaturalPerson
                     :dpvo/LegalEntity
                     :dpvo/Entity],
   :vs/term_status #rdf/langString "accepted@en"})

(def CloudLocation
  "Location that is in the 'cloud' i.e. a logical location operated over the internet"
  {:db/ident :dpvo/CloudLocation,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Location that is in the 'cloud' i.e. a logical location operated over the internet@en",
   :dcterms/modified #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Cloud Location@en",
   :rdfs/subClassOf
   [:dpvo/RemoteLocation :dpvo/LocationLocality :dpvo/Location],
   :vs/term_status #rdf/langString "modified@en"})

(def CodeOfConduct
  "A set of rules or procedures outlining the norms and practices for conducting activities"
  {:db/ident :dpvo/CodeOfConduct,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Axel Polleres"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Mark Lizar"}
                     {:xsd/string "Rob Brennan"}],
   :dcterms/description
   #rdf/langString
    "A set of rules or procedures outlining the norms and practices for conducting activities@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Code of Conduct@en",
   :rdfs/subClassOf [:dpvo/GuidelinesPrinciple
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Collect
  "to gather data from someone"
  {:db/ident :dpvo/Collect,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #rdf/langString "to gather data from someone@en",
   :dcterms/source
   [{:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"}
    {:rdfa/uri "https://specialprivacy.ercim.eu/vocabs/processing"}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Collect@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/processing#Collect"},
   :rdfs/subClassOf [:dpvo/Obtain :dpvo/Processing],
   :vs/term_status #rdf/langString "accepted@en"})

(def CollectedPersonalData
  "Personal Data that has been collected from another source such as the Data Subject"
  {:db/ident :dpvo/CollectedPersonalData,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Personal Data that has been collected from another source such as the Data Subject@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "To indicate the source of data, use the DataSource concept with the hasDataSource relation@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Collected Personal Data@en",
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo/Data],
   :vs/term_status #rdf/langString "accepted@en"})

(def Combine
  "to join or merge data"
  {:db/ident :dpvo/Combine,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #rdf/langString "to join or merge data@en",
   :dcterms/source
   [{:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"}
    {:rdfa/uri "https://specialprivacy.ercim.eu/vocabs/processing"}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Combine@en",
   :rdfs/seeAlso
   {:rdfa/uri "https://specialprivacy.ercim.eu/vocabs/processing#Aggregate"},
   :rdfs/subClassOf [:dpvo/Transform :dpvo/Processing],
   :vs/term_status #rdf/langString "accepted@en"})

(def CommercialResearch
  "Purposes associated with conducting research in a commercial setting or with intention to commercialise e.g. in a company or sponsored by a company"
  {:db/ident :dpvo/CommercialResearch,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Javier Fernandez"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Simon Steyskal"}
                     {:xsd/string "Elmar Kiesling"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with conducting research in a commercial setting or with intention to commercialise e.g. in a company or sponsored by a company@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Commercial Research@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/purposes#Develop"},
   :rdfs/subClassOf [:dpvo/ResearchAndDevelopment :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def CommunicationForCustomerCare
  "Customer Care Communication refers to purposes associated with communicating with customers for assisting them, resolving issues, ensuring satisfaction, etc. in relation to services provided"
  {:db/ident :dpvo/CommunicationForCustomerCare,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Customer Care Communication refers to purposes associated with communicating with customers for assisting them, resolving issues, ensuring satisfaction, etc. in relation to services provided@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Communication for Customer Care@en",
   :rdfs/subClassOf [:dpvo/CustomerCare
                     :dpvo/CommunicationManagement
                     :dpvo/Purpose
                     :dpvo/CustomerManagement],
   :vs/term_status #rdf/langString "accepted@en"})

(def CommunicationManagement
  "Communication Management refers to purposes associated with providing or managing communication activities e.g. to send an email for notifying some information"
  {:db/ident :dpvo/CommunicationManagement,
   :dcterms/created #xsd/date #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "David Hickey"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Communication Management refers to purposes associated with providing or managing communication activities e.g. to send an email for notifying some information@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This purpose by itself does not sufficiently and clearly indicate what the communication is about. As such, it is recommended to combine it with another purpose to indicate the application. For example, Communication of Payment.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Communication Management@en",
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status #rdf/langString "accepted@en"})

(def CompletelyManualProcessing
  "Processing that is completely un-automated or fully manual"
  {:db/ident :dpvo/CompletelyManualProcessing,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Processing that is completely un-automated or fully manual@en",
   :rdf/type [:dpvo/AutomationOfProcessing
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/comment
   #rdf/langString
    "For example, a human performing some processing operation@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Completely Manual Processing@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def ComplianceIndeterminate
  "State where the status of compliance has not been fully assessed, evaluated, or determined"
  {:db/ident :dpvo/ComplianceIndeterminate,
   :dcterms/created #xsd/date #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "State where the status of compliance has not been fully assessed, evaluated, or determined@en",
   :rdf/type
   [:dpvo/ComplianceStatus :owl/NamedIndividual :dpvo/Status :dpvo/Context],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Compliance Indeterminate@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def ComplianceMonitoring
  "Monitoring of compliance (e.g. internal policy, regulations)"
  {:db/ident :dpvo/ComplianceMonitoring,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Monitoring of compliance (e.g. internal policy, regulations)@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Compliance Monitoring@en",
   :rdfs/subClassOf [:dpvo/GovernanceProcedures
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def ComplianceStatus
  "Status associated with Compliance with some norms, objectives, or requirements"
  {:db/ident :dpvo/ComplianceStatus,
   :dcterms/created #xsd/date #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Status associated with Compliance with some norms, objectives, or requirements@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Compliance Status@en",
   :rdfs/subClassOf [:dpvo/Status :dpvo/Context],
   :vs/term_status #rdf/langString "accepted@en"})

(def ComplianceUnknown
  "State where the status of compliance is unknown"
  {:db/ident            :dpvo/ComplianceUnknown,
   :dcterms/created     #xsd/date #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "State where the status of compliance is unknown@en",
   :rdf/type            [:dpvo/ComplianceStatus
                         :owl/NamedIndividual
                         :dpvo/Status
                         :dpvo/Context],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Compliance Unknown@en",
   :vs/term_status      #rdf/langString "accepted@en"})

(def ComplianceViolation
  "State where compliance cannot be achieved due to requirements being violated"
  {:db/ident :dpvo/ComplianceViolation,
   :dcterms/created #xsd/date #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "State where compliance cannot be achieved due to requirements being violated@en",
   :dcterms/modified #xsd/date #inst "2022-09-07T00:00:00.000-04:00",
   :rdf/type
   [:dpvo/ComplianceStatus :owl/NamedIndividual :dpvo/Status :dpvo/Context],
   :rdfs/comment
   #rdf/langString
    "Changed from \"violation of compliance\" for consistency with other terms@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Compliance Violation@en",
   :vs/term_status #rdf/langString "changed@en"})

(def Compliant
  "State of being fully compliant"
  {:db/ident            :dpvo/Compliant,
   :dcterms/created     #xsd/date #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "State of being fully compliant@en",
   :rdf/type            [:dpvo/ComplianceStatus
                         :owl/NamedIndividual
                         :dpvo/Status
                         :dpvo/Context],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Compliant@en",
   :vs/term_status      #rdf/langString "accepted@en"})

(def ConformanceStatus
  "Status associated with conformance to a standard, guideline, code, or recommendation"
  {:db/ident :dpvo/ConformanceStatus,
   :dcterms/created #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Status associated with conformance to a standard, guideline, code, or recommendation@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Conformance Status@en",
   :rdfs/subClassOf [:dpvo/Status :dpvo/Context],
   :vs/term_status #rdf/langString "accepted@en"})

(def Conformant
  "State of being conformant"
  {:db/ident            :dpvo/Conformant,
   :dcterms/created     #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "State of being conformant@en",
   :rdf/type            [:dpvo/ConformanceStatus
                         :owl/NamedIndividual
                         :dpvo/Context
                         :dpvo/Status],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Conformant@en",
   :vs/term_status      #rdf/langString "accepted@en"})

(def Consent
  "Consent of the Data Subject for specified processing"
  {:db/ident :dpvo/Consent,
   :dcterms/created #xsd/date #inst "2021-04-07T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Consent of the Data Subject for specified processing@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Consent@en",
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status #rdf/langString "accepted@en"})

(def ConsentExpired
  "The state where the temporal or contextual validity of consent has 'expired'"
  {:db/ident :dpvo/ConsentExpired,
   :dcterms/created #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "The state where the temporal or contextual validity of consent has 'expired'@en",
   :dcterms/source {:rdfa/uri "https://w3id.org/GConsent"},
   :rdf/type [:owl/NamedIndividual
              :dpvo/ConsentStatusInvalidForProcessing
              :dpvo/Context
              :dpvo/Status
              :dpvo/ConsentStatus],
   :rdfs/comment
   #rdf/langString
    "An example of this state is when the obtained consent has been assigned a duration - which has lapsed or 'expired', making it invalid to be used further for processing data@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Consent Expired@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def ConsentGiven
  "The state where consent has been given"
  {:db/ident :dpvo/ConsentGiven,
   :dcterms/created #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}],
   :dcterms/description #rdf/langString
                         "The state where consent has been given@en",
   :dcterms/source {:rdfa/uri "https://w3id.org/GConsent"},
   :rdf/type [:owl/NamedIndividual
              :dpvo/ConsentStatusValidForProcessing
              :dpvo/Context
              :dpvo/Status
              :dpvo/ConsentStatus],
   :rdfs/comment
   #rdf/langString
    "An example of this state is when the individual clicks on a button, ticks a checkbox, verbally agrees - or any other form that communicates their decision agreeing to the processing of data@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Consent Given@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def ConsentInvalidated
  "The state where consent has been deemed to be invalid"
  {:db/ident :dpvo/ConsentInvalidated,
   :dcterms/created #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString "The state where consent has been deemed to be invalid@en",
   :dcterms/source {:rdfa/uri "https://w3id.org/GConsent"},
   :rdf/type [:owl/NamedIndividual
              :dpvo/ConsentStatusInvalidForProcessing
              :dpvo/Context
              :dpvo/Status
              :dpvo/ConsentStatus],
   :rdfs/comment
   #rdf/langString
    "An example of this state is where an investigating authority or a court finds the collected consent did not meet requirements, and 'invalidates' both prior and future uses of it to carry out processing@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Consent Invalidated@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def ConsentNotice
  "A Notice for information provision associated with Consent"
  {:db/ident :dpvo/ConsentNotice,
   :dcterms/created #xsd/date #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "A Notice for information provision associated with Consent@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Consent Notice@en",
   :rdfs/subClassOf [:dpvo/PrivacyNotice
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/Notice],
   :vs/term_status #rdf/langString "accepted@en"})

(def ConsentRecord
  "A Record of Consent or Consent related activities"
  {:db/ident            :dpvo/ConsentRecord,
   :dcterms/created     #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Julian Flake"}
                         {:xsd/string "Paul Ryan"}
                         {:xsd/string "Georg P Krog"}],
   :dcterms/description #rdf/langString
                         "A Record of Consent or Consent related activities@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Consent Record@en",
   :rdfs/subClassOf     [:dpvo/DataProcessingRecord
                         :dpvo/RecordsOfActivities
                         :dpvo/OrganisationalMeasure
                         :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status      #rdf/langString "accepted@en"})

(def ConsentRefused
  "The state where consent has been refused"
  {:db/ident :dpvo/ConsentRefused,
   :dcterms/created #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description #rdf/langString
                         "The state where consent has been refused@en",
   :dcterms/source {:rdfa/uri "https://w3id.org/GConsent"},
   :rdf/type [:dpvo/ConsentStatusInvalidForProcessing
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/Status
              :dpvo/ConsentStatus],
   :rdfs/comment
   #rdf/langString
    "An example of this state is when the individual clicks on a 'disagree' or 'reject' or 'refuse' button, or leaves a checkbox unticked@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Consent Refused@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def ConsentRequestDeferred
  "State where a request for consent has been deferred without a decision"
  {:db/ident :dpvo/ConsentRequestDeferred,
   :dcterms/created #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "State where a request for consent has been deferred without a decision@en",
   :dcterms/source {:rdfa/uri "https://w3id.org/GConsent"},
   :rdf/type [:owl/NamedIndividual
              :dpvo/ConsentStatusInvalidForProcessing
              :dpvo/Context
              :dpvo/Status
              :dpvo/ConsentStatus],
   :rdfs/comment
   #rdf/langString
    "An example of this state is when the individual closes or dismisses a notice without making a decision. This state is intended for making the distinction between a notice being provided (as a consent request) and the individual interacting with the notice without making a decision - where the 'ignoring of a notice' is taken as consent being neither given nor refused@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Consent Request Deferred@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def ConsentRequested
  "State where a request for consent has been made and is awaiting a decision"
  {:db/ident :dpvo/ConsentRequested,
   :dcterms/created #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}],
   :dcterms/description
   #rdf/langString
    "State where a request for consent has been made and is awaiting a decision@en",
   :dcterms/source {:rdfa/uri "https://w3id.org/GConsent"},
   :rdf/type [:owl/NamedIndividual
              :dpvo/ConsentStatusInvalidForProcessing
              :dpvo/Context
              :dpvo/Status
              :dpvo/ConsentStatus],
   :rdfs/comment
   #rdf/langString
    "An example of this state is when a notice has been presented to the individual but they have not made a decision@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Consent Requested@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def ConsentRevoked
  "The state where the consent is revoked by an entity other than the data subject and which prevents it from being further used as a valid state"
  {:db/ident :dpvo/ConsentRevoked,
   :dcterms/created #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "The state where the consent is revoked by an entity other than the data subject and which prevents it from being further used as a valid state@en",
   :dcterms/source {:rdfa/uri "https://w3id.org/GConsent"},
   :rdf/type [:dpvo/ConsentStatusInvalidForProcessing
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/Status
              :dpvo/ConsentStatus],
   :rdfs/comment
   #rdf/langString
    "An example of this state is when a Data Controller stops utilising previously obtaining consent, such as when that service no longer exists@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Consent Revoked@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def ConsentStatus
  "The state or status of 'consent' that provides information reflecting its operational status and validity for processing data"
  {:db/ident :dpvo/ConsentStatus,
   :dcterms/created #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "The state or status of 'consent' that provides information reflecting its operational status and validity for processing data@en",
   :dcterms/source {:rdfa/uri "https://w3id.org/GConsent"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "States are useful as information artefacts to implement them in controlling processing, and to reflect the process and flow of obtaining and maintaining consent. For example, a database table that stores consent states for specific processing and can be queried to obtain them in an efficient manner. States are also useful in investigations to determine the use and validity of consenting practices@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Consent Status@en",
   :rdfs/subClassOf [:dpvo/Status :dpvo/Context],
   :vs/term_status #rdf/langString "accepted@en"})

(def ConsentStatusInvalidForProcessing
  "States of consent that cannot be used as valid justifications for processing data"
  {:db/ident :dpvo/ConsentStatusInvalidForProcessing,
   :dcterms/created #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "States of consent that cannot be used as valid justifications for processing data@en",
   :dcterms/source {:rdfa/uri "https://w3id.org/GConsent"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This identifies the stages associated with consent that should not be used to process data@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Consent Status Invalid for Processing@en",
   :rdfs/subClassOf [:dpvo/ConsentStatus :dpvo/Status :dpvo/Context],
   :vs/term_status #rdf/langString "accepted@en"})

(def ConsentStatusValidForProcessing
  "States of consent that can be used as valid justifications for processing data"
  {:db/ident :dpvo/ConsentStatusValidForProcessing,
   :dcterms/created #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString
    "States of consent that can be used as valid justifications for processing data@en",
   :dcterms/source {:rdfa/uri "https://w3id.org/GConsent"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Practically, given consent is the only valid state for processing@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Consent Status Valid for Processing@en",
   :rdfs/subClassOf [:dpvo/ConsentStatus :dpvo/Status :dpvo/Context],
   :vs/term_status #rdf/langString "accepted@en"})

(def ConsentUnknown
  "State where information about consent is not available or is unknown"
  {:db/ident :dpvo/ConsentUnknown,
   :dcterms/created #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}],
   :dcterms/description
   #rdf/langString
    "State where information about consent is not available or is unknown@en",
   :dcterms/source {:rdfa/uri "https://w3id.org/GConsent"},
   :rdf/type [:dpvo/ConsentStatusInvalidForProcessing
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/Status
              :dpvo/ConsentStatus],
   :rdfs/comment
   #rdf/langString
    "Consent states can be unknown, for example, when information is not available, or cannot be trusted, or is known to be inaccurate@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Consent Unknown@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def ConsentWithdrawn
  "The state where the consent is withdrawn or revoked specifically by the data subject and which prevents it from being further used as a valid state"
  {:db/ident :dpvo/ConsentWithdrawn,
   :dcterms/created #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "The state where the consent is withdrawn or revoked specifically by the data subject and which prevents it from being further used as a valid state@en",
   :dcterms/source {:rdfa/uri "https://w3id.org/GConsent"},
   :rdf/type [:owl/NamedIndividual
              :dpvo/ConsentStatusInvalidForProcessing
              :dpvo/Context
              :dpvo/Status
              :dpvo/ConsentStatus],
   :rdfs/comment
   #rdf/langString
    "This state can be considered a form of 'revocation' of consent, where the revocation can only be performed by the data subject. Therefore we suggest using ConsentRevoked when it is a non-data-subject entity, and ConsentWithdrawn when it is the data subject@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Consent Withdrawn@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def Consequence
  "The consequence(s) possible or arising from specified context"
  {:db/ident :dpvo/Consequence,
   :dcterms/created #xsd/date #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "The consequence(s) possible or arising from specified context@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Consequence@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def ConsequenceAsSideEffect
  "The consequence(s) possible or arising as a side-effect of specified context"
  {:db/ident :dpvo/ConsequenceAsSideEffect,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "The consequence(s) possible or arising as a side-effect of specified context@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Consequence as Side-Effect@en",
   :rdfs/subClassOf :dpvo/Consequence,
   :vs/term_status #rdf/langString "accepted@en"})

(def ConsequenceOfFailure
  "The consequence(s) possible or arising from failure of specified context"
  {:db/ident :dpvo/ConsequenceOfFailure,
   :dcterms/created #xsd/date #inst "2022-03-23T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "The consequence(s) possible or arising from failure of specified context@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Consequence of Failure@en",
   :rdfs/subClassOf :dpvo/Consequence,
   :vs/term_status #rdf/langString "accepted@en"})

(def ConsequenceOfSuccess
  "The consequence(s) possible or arising from success of specified context"
  {:db/ident :dpvo/ConsequenceOfSuccess,
   :dcterms/created #xsd/date #inst "2022-03-23T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "The consequence(s) possible or arising from success of specified context@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Consequence of Success@en",
   :rdfs/subClassOf :dpvo/Consequence,
   :vs/term_status #rdf/langString "accepted@en"})

(def Consult
  "to consult or query data"
  {:db/ident :dpvo/Consult,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #rdf/langString "to consult or query data@en",
   :dcterms/source
   [{:rdfa/uri "https://specialprivacy.ercim.eu/vocabs/processing"}
    {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Consult@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/processing#Query"},
   :rdfs/subClassOf [:dpvo/Use :dpvo/Processing],
   :vs/term_status #rdf/langString "accepted@en"})

(def Consultation
  "Consultation is a process of receiving feedback, advice, or opinion from an external agency"
  {:db/ident :dpvo/Consultation,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString
    "Consultation is a process of receiving feedback, advice, or opinion from an external agency@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Consultation@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def ConsultationWithAuthority
  "Consultation with an authority or authoritative entity"
  {:db/ident :dpvo/ConsultationWithAuthority,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString "Consultation with an authority or authoritative entity@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Consultation with Authority@en",
   :rdfs/subClassOf [:dpvo/Consultation
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def ConsultationWithDPO
  "Consultation with Data Protection Officer(s)"
  {:db/ident            :dpvo/ConsultationWithDPO,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Georg P Krog"}],
   :dcterms/description #rdf/langString
                         "Consultation with Data Protection Officer(s)@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Consultation with DPO@en",
   :rdfs/subClassOf     [:dpvo/Consultation
                         :dpvo/OrganisationalMeasure
                         :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status      #rdf/langString "accepted@en"})

(def ConsultationWithDataSubject
  "Consultation with data subject(s) or their representative(s)"
  {:db/ident :dpvo/ConsultationWithDataSubject,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Consultation with data subject(s) or their representative(s)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Consultation with Data Subject@en",
   :rdfs/subClassOf [:dpvo/Consultation
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def ConsultationWithDataSubjectRepresentative
  "Consultation with representative of data subject(s)"
  {:db/ident :dpvo/ConsultationWithDataSubjectRepresentative,
   :dcterms/created #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString "Consultation with representative of data subject(s)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString
                "Consultation with Data Subject Representative@en",
   :rdfs/subClassOf [:dpvo/ConsultationWithDataSubject
                     :dpvo/Consultation
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Consumer
  "Data subjects that consume goods or services for direct use"
  {:db/ident :dpvo/Consumer,
   :dcterms/created #xsd/date #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P. Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Beatriz Esteves"}],
   :dcterms/description
   #rdf/langString
    "Data subjects that consume goods or services for direct use@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Consumer@en",
   :rdfs/subClassOf
   [:dpvo/DataSubject :dpvo/NaturalPerson :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "accepted@en"})

(def Context
  "Contextually relevant information not possible to represent through other core concepts"
  {:db/ident :dpvo/Context,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Axel Polleres"}
                     {:xsd/string "Javier Fernandez"}
                     {:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Simon Steyskal"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Elmar Kiesling"}],
   :dcterms/description
   #rdf/langString
    "Contextually relevant information not possible to represent through other core concepts@en",
   :dcterms/modified #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Context@en",
   :vs/term_status #rdf/langString "modified@en"})

(def ContinousFrequency
  "Frequency where occurences are continous"
  {:db/ident            :dpvo/ContinousFrequency,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Frequency where occurences are continous@en",
   :dcterms/modified    #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Continous Frequency@en",
   :rdfs/subClassOf     [:dpvo/Frequency :dpvo/Context],
   :vs/term_status      #rdf/langString "modified@en"})

(def Contract
  "Creation, completion, fulfilment, or performance of a contract involving specified processing"
  {:db/ident :dpvo/Contract,
   :dcterms/created #xsd/date #inst "2021-04-07T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Creation, completion, fulfilment, or performance of a contract involving specified processing@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Contract@en",
   :rdfs/subClassOf [:dpvo/LegalBasis
                     :dpvo/LegalAgreement
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def ContractPerformance
  "Fulfilment or performance of a contract involving specified processing"
  {:db/ident :dpvo/ContractPerformance,
   :dcterms/created #xsd/date #inst "2021-04-07T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString
    "Fulfilment or performance of a contract involving specified processing@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Contract Performance@en",
   :rdfs/subClassOf [:dpvo/Contract
                     :dpvo/LegalAgreement
                     :dpvo/LegalBasis
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def ContractualTerms
  "Contractual terms governing data handling within or with an entity"
  {:db/ident :dpvo/ContractualTerms,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Axel Polleres"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Mark Lizar"}
                     {:xsd/string "Rob Brennan"}],
   :dcterms/description
   #rdf/langString
    "Contractual terms governing data handling within or with an entity@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Contractual Terms@en",
   :rdfs/subClassOf [:dpvo/LegalAgreement
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def ControllerProcessorAgreement
  "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between a Data Controller and a Data Processor"
  {:db/ident :dpvo/ControllerProcessorAgreement,
   :dcterms/created #xsd/date #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Beatriz Esteves"}],
   :dcterms/description
   #rdf/langString
    "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between a Data Controller and a Data Processor@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Controller-Processor Agreement@en",
   :rdfs/subClassOf [:dpvo/DataProcessingAgreement
                     :dpvo/LegalAgreement
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Copy
  "to produce an exact reprodution of the data"
  {:db/ident :dpvo/Copy,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #rdf/langString
                         "to produce an exact reprodution of the data@en",
   :dcterms/source {:rdfa/uri
                    "https://specialprivacy.ercim.eu/vocabs/processing"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Copy@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/processing#Copy"},
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status #rdf/langString "accepted@en"})

(def CounterMoneyLaundering
  "Purposes associated with detection, prevention, and mitigation of mitigate money laundering"
  {:db/ident :dpvo/CounterMoneyLaundering,
   :dcterms/created #xsd/date #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Purposes associated with detection, prevention, and mitigation of mitigate money laundering@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Counter Money Laundering@en",
   :rdfs/subClassOf
   [:dpvo/FraudPreventionAndDetection :dpvo/EnforceSecurity :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def Country
  "A political entity indicative of a sovereign or non-sovereign territorial state comprising of distinct geographical areas"
  {:db/ident :dpvo/Country,
   :dcterms/created #xsd/date #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "A political entity indicative of a sovereign or non-sovereign territorial state comprising of distinct geographical areas@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "The definition of country is not intended for political interpretation. DPVCG welcomes alternate definitions based in existing sources with global scope, such as UN or ISO.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Country@en",
   :rdfs/subClassOf :dpvo/Location,
   :vs/term_status #rdf/langString "accepted@en"})

(def CredentialManagement
  "Management of credentials and their use in authorisations"
  {:db/ident :dpvo/CredentialManagement,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #rdf/langString
    "Management of credentials and their use in authorisations@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Credential Management@en",
   :rdfs/subClassOf [:dpvo/AuthorisationProcedure
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def CreditChecking
  "Purposes associated with monitoring, performing, or assessing credit worthiness or solvency"
  {:db/ident :dpvo/CreditChecking,
   :dcterms/created #xsd/date #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Purposes associated with monitoring, performing, or assessing credit worthiness or solvency@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Credit Checking@en",
   :rdfs/subClassOf
   [:dpvo/CustomerSolvencyMonitoring :dpvo/Purpose :dpvo/CustomerManagement],
   :vs/term_status #rdf/langString "accepted@en"})

(def CryptographicAuthentication
  "Use of cryptography for authentication"
  {:db/ident :dpvo/CryptographicAuthentication,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Use of cryptography for authentication@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Cryptographic Authentication@en",
   :rdfs/subClassOf [:dpvo/AuthenticationProtocols
                     :dpvo/CryptographicMethods
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def CryptographicKeyManagement
  "Management of cryptographic keys, including their generation, storage, assessment, and safekeeping"
  {:db/ident :dpvo/CryptographicKeyManagement,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Management of cryptographic keys, including their generation, storage, assessment, and safekeeping@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Cryptographic Key Management@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def CryptographicMethods
  "Use of cryptographic methods to perform tasks"
  {:db/ident :dpvo/CryptographicMethods,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Use of cryptographic methods to perform tasks@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Cryptographic Methods@en",
   :rdfs/subClassOf [:dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Customer
  "Data subjects that purchase goods or services"
  {:db/ident :dpvo/Customer,
   :dcterms/created #xsd/date #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Georg P. Krog"}],
   :dcterms/description #rdf/langString
                         "Data subjects that purchase goods or services@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "note: for B2B relations where customers are organisations, this concept only applies for data subjects@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Customer@en",
   :rdfs/subClassOf
   [:dpvo/DataSubject :dpvo/NaturalPerson :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "accepted@en"})

(def CustomerCare
  "Customer Care refers to purposes associated with purposes for providing assistance, resolving issues, ensuring satisfaction, etc. in relation to services provided"
  {:db/ident :dpvo/CustomerCare,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Axel Polleres"}
                     {:xsd/string "Simon Steyskal"}
                     {:xsd/string "Elmar Kiesling"}
                     {:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Javier Fernandez"}],
   :dcterms/description
   #rdf/langString
    "Customer Care refers to purposes associated with purposes for providing assistance, resolving issues, ensuring satisfaction, etc. in relation to services provided@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Customer Care@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/purposes#Feedback"},
   :rdfs/subClassOf [:dpvo/CustomerManagement :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def CustomerClaimsManagement
  "Customer Claims Management refers to purposes associated with managing claims, including repayment of monies owed"
  {:db/ident :dpvo/CustomerClaimsManagement,
   :dcterms/created #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Beatriz"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Customer Claims Management refers to purposes associated with managing claims, including repayment of monies owed@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Customer Claims Management@en",
   :rdfs/subClassOf [:dpvo/CustomerManagement :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def CustomerManagement
  "Customer Management refers to purposes associated with managing activities related with past, current, and future customers"
  {:db/ident :dpvo/CustomerManagement,
   :dcterms/created #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Beatriz"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Customer Management refers to purposes associated with managing activities related with past, current, and future customers@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Customer Management@en",
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status #rdf/langString "accepted@en"})

(def CustomerOrderManagement
  "Customer Order Management refers to purposes associated with managing customer orders i.e. processing of an order related to customer's purchase of good or services"
  {:db/ident :dpvo/CustomerOrderManagement,
   :dcterms/created #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Beatriz"}],
   :dcterms/description
   #rdf/langString
    "Customer Order Management refers to purposes associated with managing customer orders i.e. processing of an order related to customer's purchase of good or services@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Customer Order Management@en",
   :rdfs/subClassOf [:dpvo/CustomerManagement :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def CustomerRelationshipManagement
  "Customer Relationship Management refers to purposes associated with managing and analysing interactions with past, current, and potential customers"
  {:db/ident :dpvo/CustomerRelationshipManagement,
   :dcterms/created #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Beatriz"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Customer Relationship Management refers to purposes associated with managing and analysing interactions with past, current, and potential customers@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Customer Relationship Management@en",
   :rdfs/subClassOf [:dpvo/CustomerManagement :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def CustomerSolvencyMonitoring
  "Customer Solvency Monitoring refers to purposes associated with monitor solvency of customers for financial diligence"
  {:db/ident :dpvo/CustomerSolvencyMonitoring,
   :dcterms/created #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Beatriz"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Customer Solvency Monitoring refers to purposes associated with monitor solvency of customers for financial diligence@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Customer Solvency Monitoring@en",
   :rdfs/subClassOf [:dpvo/CustomerManagement :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def CybersecurityAssessment
  "Assessment of cybersecurity capabilities in terms of vulnerabilities and effectiveness of controls"
  {:db/ident :dpvo/CybersecurityAssessment,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Assessment of cybersecurity capabilities in terms of vulnerabilities and effectiveness of controls@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Cybersecurity Assessment@en",
   :rdfs/subClassOf [:dpvo/SecurityAssessment
                     :dpvo/Assessment
                     :dpvo/OrganisationalMeasure
                     :dpvo/SecurityProcedure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def CybersecurityTraining
  "Training methods related to cybersecurity"
  {:db/ident :dpvo/CybersecurityTraining,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Training methods related to cybersecurity@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Cybersecurity Training@en",
   :rdfs/subClassOf [:dpvo/StaffTraining
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def DPIA
  "A DPIA involves determining the potential and actual impact of processing activities on individuals or groups of individuals"
  {:db/ident :dpvo/DPIA,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "A DPIA involves determining the potential and actual impact of processing activities on individuals or groups of individuals@en",
   :rdf/type :owl/Class,
   :rdfs/comment #rdf/langString
                  "Top class: Impact Assessment, and DPIA is sub-class@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Data Protection Impact Assessment (DPIA)@en",
   :rdfs/subClassOf [:dpvo/ImpactAssessment
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/Assessment],
   :vs/term_status #rdf/langString "accepted@en"})

(def Damage
  "Impact that acts as or causes damages"
  {:db/ident            :dpvo/Damage,
   :dcterms/created     #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Impact that acts as or causes damages@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Damage@en",
   :rdfs/subClassOf     [:dpvo/Impact :dpvo/Consequence],
   :vs/term_status      #rdf/langString "accepted@en"})

(def Data
  "A broad concept representing  'data' or 'information'"
  {:db/ident :dpvo/Data,
   :dcterms/created #xsd/date #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "A broad concept representing  'data' or 'information'@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Data@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def DataBackupProtocols
  "Protocols or plans for backing up of data"
  {:db/ident            :dpvo/DataBackupProtocols,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Georg P Krog"},
   :dcterms/description #rdf/langString
                         "Protocols or plans for backing up of data@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Data Backup Protocols@en",
   :rdfs/subClassOf     [:dpvo/TechnicalMeasure
                         :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status      #rdf/langString "accepted@en"})

(def DataController
  "The individual or organisation that decides (or controls) the purpose(s) of processing personal data."
  {:db/ident :dpvo/DataController,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Axel Polleres"}
                     {:xsd/string "Javier Fernández"}],
   :dcterms/description
   #rdf/langString
    "The individual or organisation that decides (or controls) the purpose(s) of processing personal data.@en",
   :dcterms/modified #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_7/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "The terms 'Controller' is usually the more common form of indicating a Data Controller. In ISO/IEC the term 'PII Controller' is used.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Data Controller@en",
   :rdfs/subClassOf [:dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "accepted@en"})

(def DataExporter
  "An entity that 'exports' data where exporting is considered a form of data transfer"
  {:db/ident :dpvo/DataExporter,
   :dcterms/created #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan Pandit"}
                     {:xsd/string "David Hickey"}
                     {:xsd/string "Georg Krog"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString
    "An entity that 'exports' data where exporting is considered a form of data transfer@en",
   :dcterms/source
   {:rdfa/uri
    "https://edpb.europa.eu/our-work-tools/our-documents/recommendations/recommendations-012020-measures-supplement-transfer_en"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "The EU, in particular the EDPB, uses data exporter the context of cross-border data transfers/flows. These concepts are not bound by jurisdictional or geopolitical scopes within DPV and can thus be used for any notion of exporting@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Data Exporter@en",
   :rdfs/subClassOf [:dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "accepted@en"})

(def DataImporter
  "An entity that 'imports' data where importing is considered a form of data transfer"
  {:db/ident :dpvo/DataImporter,
   :dcterms/created #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "David Hickey"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan Pandit"}
                     {:xsd/string "Georg Krog"}],
   :dcterms/description
   #rdf/langString
    "An entity that 'imports' data where importing is considered a form of data transfer@en",
   :dcterms/source
   {:rdfa/uri
    "https://edpb.europa.eu/our-work-tools/our-documents/recommendations/recommendations-012020-measures-supplement-transfer_en"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "The EU, in particular the EDPB, uses data importing the context of cross-border data transfers/flows. These concepts are not bound by jurisdictional or geopolitical scopes within DPV and can thus be used for any notion of importing@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Data Importer@en",
   :rdfs/subClassOf [:dpvo/Recipient :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "accepted@en"})

(def DataProcessingAgreement
  "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data"
  {:db/ident :dpvo/DataProcessingAgreement,
   :dcterms/created #xsd/date #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "For specific role-based data processing agreements, see concepts for Processors and JointDataController agreements.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Data Processing Agreement@en",
   :rdfs/subClassOf [:dpvo/LegalAgreement
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def DataProcessingRecord
  "Record of personal data processing, whether ex-ante or ex-post"
  {:db/ident :dpvo/DataProcessingRecord,
   :dcterms/created #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Record of personal data processing, whether ex-ante or ex-post@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Data Processing Record@en",
   :rdfs/subClassOf [:dpvo/RecordsOfActivities
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def DataProcessor
  "A ‘processor’ means a natural or legal person, public authority, agency or other body which processes personal data on behalf of the controller."
  {:db/ident :dpvo/DataProcessor,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "A ‘processor’ means a natural or legal person, public authority, agency or other body which processes personal data on behalf of the controller.@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_8/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Data Processor@en",
   :rdfs/subClassOf [:dpvo/Recipient :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "accepted@en"})

(def DataProtectionAuthority
  "An authority tasked with overseeing legal compliance regarding privacy and data protection laws."
  {:db/ident :dpvo/DataProtectionAuthority,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan Pandit"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg Krog"}],
   :dcterms/description
   #rdf/langString
    "An authority tasked with overseeing legal compliance regarding privacy and data protection laws.@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Data Protection Authority@en",
   :rdfs/subClassOf [:dpvo/Authority
                     :dpvo/LegalEntity
                     :dpvo/Organisation
                     :dpvo/Entity
                     :dpvo/GovernmentalOrganisation],
   :vs/term_status #rdf/langString "accepted@en"})

(def DataProtectionOfficer
  "An entity within or authorised by an organisation to monitor internal compliance, inform and advise on data protection obligations and act as a contact point for data subjects and the supervisory authority."
  {:db/ident :dpvo/DataProtectionOfficer,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Georg Krog"} {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString
    "An entity within or authorised by an organisation to monitor internal compliance, inform and advise on data protection obligations and act as a contact point for data subjects and the supervisory authority.@en",
   :dcterms/modified #xsd/date #inst "2021-12-08T00:00:00.000-05:00",
   :dcterms/source {:rdfa/uri
                    "https://eur-lex.europa.eu/eli/reg/2016/679/art_37/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Data Protection Officer@en",
   :rdfs/subClassOf [:dpvo/Representative :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "modified@en"})

(def DataProtectionTraining
  "Training intended to increase knowledge regarding data protection"
  {:db/ident :dpvo/DataProtectionTraining,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Training intended to increase knowledge regarding data protection@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Data Protection Training@en",
   :rdfs/subClassOf [:dpvo/StaffTraining
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def DataPublishedByDataSubject
  "Data is published by the data subject"
  {:db/ident :dpvo/DataPublishedByDataSubject,
   :dcterms/created #xsd/date #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Julian Flake"},
   :dcterms/description #rdf/langString
                         "Data is published by the data subject@en",
   :rdf/type [:dpvo/DataSource
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/comment
   #rdf/langString
    "This refers to where that data was made publicly available by the data subject. An example of this would be a social media profile that the data subject has made publicly accessible.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Data published by Data Subject@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def DataRedaction
  "Removal of sensitive information from a data or document"
  {:db/ident :dpvo/DataRedaction,
   :dcterms/created #xsd/date #inst "2020-10-01T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Removal of sensitive information from a data or document@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Data Redaction@en",
   :rdfs/subClassOf [:dpvo/DataSanitisationTechnique
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def DataSanitisationTechnique
  "Cleaning or any removal or re-organisation of elements in data based on selective criteria"
  {:db/ident :dpvo/DataSanitisationTechnique,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Cleaning or any removal or re-organisation of elements in data based on selective criteria@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Data Sanitisation Technique@en",
   :rdfs/subClassOf [:dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def DataSource
  "The source or origin of data"
  {:db/ident :dpvo/DataSource,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description #rdf/langString "The source or origin of data@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Source' is the direct point of data collection; 'origin' would indicate the original/others points of where the data originates from.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Data Source@en",
   :rdfs/subClassOf [:dpvo/ProcessingContext :dpvo/Context],
   :vs/term_status #rdf/langString "accepted@en"})

(def DataSubProcessor
  "A 'sub-processor' is a processor engaged by another processor"
  {:db/ident :dpvo/DataSubProcessor,
   :dcterms/created #xsd/date #inst "2020-11-25T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "A 'sub-processor' is a processor engaged by another processor@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "sub-processor' is a commonly used term similar to 'sub-contractor' and does not have a specific legal definition@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Data Sub-Processor@en",
   :rdfs/subClassOf
   [:dpvo/DataProcessor :dpvo/Recipient :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "accepted@en"})

(def DataSubject
  "The individual (or category of individuals) whose personal data is being processed"
  {:db/ident :dpvo/DataSubject,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Axel Polleres"}
                     {:xsd/string "Javier Fernández"}],
   :dcterms/description
   #rdf/langString
    "The individual (or category of individuals) whose personal data is being processed@en",
   :dcterms/modified #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_1/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "The term 'data subject' is specific to the GDPR, but is functionally equivalent to the term 'individual' and the ISO/IEC term 'PII Principle'.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Data Subject@en",
   :rdfs/subClassOf [:dpvo/NaturalPerson :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "accepted@en"})

(def DataSubjectRight
  "The rights applicable or provided to a Data Subject"
  {:db/ident :dpvo/DataSubjectRight,
   :dcterms/created #xsd/date #inst "2020-11-18T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Harshvardhan Pandit"}],
   :dcterms/description
   #rdf/langString "The rights applicable or provided to a Data Subject@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Based on use of definitions, the notion of 'Data Subject Right' can be equivalent to 'Individual Right' or 'Right of a Person'@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Data Subject Right@en",
   :rdfs/subClassOf :dpvo/Right,
   :vs/term_status #rdf/langString "accepted@en"})

(def DataSubjectScale
  "Scale of Data Subject(s)"
  {:db/ident            :dpvo/DataSubjectScale,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Rana Saniei"}
                         {:xsd/string "Georg P Krog"}
                         {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Scale of Data Subject(s)@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Data Subject Scale@en",
   :rdfs/subClassOf     [:dpvo/Scale :dpvo/Context :dpvo/ProcessingContext],
   :vs/term_status      #rdf/langString "accepted@en"})

(def DataTransferImpactAssessment
  "Impact Assessment for conducting data transfers"
  {:db/ident            :dpvo/DataTransferImpactAssessment,
   :dcterms/created     #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Georg P Krog"}
                         {:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Paul Ryan"}],
   :dcterms/description #rdf/langString
                         "Impact Assessment for conducting data transfers@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Data Transfer Impact Assessment@en",
   :rdfs/subClassOf     [:dpvo/ImpactAssessment
                         :dpvo/OrganisationalMeasure
                         :dpvo/TechnicalOrganisationalMeasure
                         :dpvo/Assessment],
   :vs/term_status      #rdf/langString "accepted@en"})

(def DataTransferLegalBasis
  "Specific or special categories and instances of legal basis intended for justifying data transfers"
  {:db/ident :dpvo/DataTransferLegalBasis,
   :dcterms/created #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Georg P Krogg"}
                     {:xsd/string "David Hickey"}],
   :dcterms/description
   #rdf/langString
    "Specific or special categories and instances of legal basis intended for justifying data transfers@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Data Transfer Legal Basis@en",
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status #rdf/langString "accepted@en"})

(def DataVolume
  "Volume or Scale of Data"
  {:db/ident            :dpvo/DataVolume,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Rana Saniei"}
                         {:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Georg P Krog"}],
   :dcterms/description #rdf/langString "Volume or Scale of Data@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Data Volume@en",
   :rdfs/subClassOf     [:dpvo/Scale :dpvo/Context :dpvo/ProcessingContext],
   :vs/term_status      #rdf/langString "accepted@en"})

(def DecentralisedLocations
  "Location that is spread across multiple separate areas with no distinction between their importance"
  {:db/ident :dpvo/DecentralisedLocations,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Location that is spread across multiple separate areas with no distinction between their importance@en",
   :dcterms/modified #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Decentralised Locations@en",
   :rdfs/subClassOf :dpvo/LocationFixture,
   :vs/term_status #rdf/langString "modified@en"})

(def DecisionMaking
  "Processing that involves decision making"
  {:db/ident            :dpvo/DecisionMaking,
   :dcterms/created     #xsd/date #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Processing that involves decision making@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Decision Making@en",
   :rdfs/subClassOf     [:dpvo/ProcessingContext :dpvo/Context],
   :vs/term_status      #rdf/langString "accepted@en"})

(def Deidentification
  "Removal of identity or information to reduce identifiability"
  {:db/ident :dpvo/Deidentification,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Mark Lizar"}
                     {:xsd/string "Rob Brennan"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Removal of identity or information to reduce identifiability@en",
   :dcterms/modified #xsd/date #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source
   {:rdfa/uri "https://nvlpubs.nist.gov/nistpubs/ir/2015/NIST.IR.8053.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "De-Identification@en",
   :rdfs/subClassOf [:dpvo/DataSanitisationTechnique
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "modified@en"})

(def DeliveryOfGoods
  "Purposes associated with delivering goods and services requested or asked by consumer"
  {:db/ident :dpvo/DeliveryOfGoods,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling"}
                     {:xsd/string "Simon Steyskal"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Javier Fernandez"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with delivering goods and services requested or asked by consumer@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Delivery of Goods@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/purposes#Delivery"},
   :rdfs/subClassOf
   [:dpvo/RequestedServiceProvision :dpvo/ServiceProvision :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def Derive
  "to create new derivative data from the original data"
  {:db/ident :dpvo/Derive,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   #rdf/langString "to create new derivative data from the original data@en",
   :dcterms/source {:rdfa/uri
                    "https://specialprivacy.ercim.eu/vocabs/processing"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Derive indicates data is present or obtainable from existing data. For data that is created without such existence, see Infer.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Derive@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/processing#Derive"},
   :rdfs/subClassOf [:dpvo/Obtain :dpvo/Processing],
   :vs/term_status #rdf/langString "accepted@en"})

(def DerivedPersonalData
  "Personal Data that is obtained or derived from other data"
  {:db/ident :dpvo/DerivedPersonalData,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString
    "Personal Data that is obtained or derived from other data@en",
   :dcterms/modified #xsd/date #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/source {:rdfa/uri "https://www.w3.org/community/dpvcg/"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Derived Data is data that is obtained through processing of existing data, e.g. deriving first name from full name. To indicate data that is derived but which was not present or evident within the source data, InferredPersonalData should be used.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Derived Personal Data@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Derived"},
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo/Data],
   :vs/term_status #rdf/langString "accepted@en"})

(def DesignStandard
  "A set of rules or guidelines outlining criterias for design"
  {:db/ident :dpvo/DesignStandard,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Mark Lizar"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Rob Brennan"}],
   :dcterms/description
   #rdf/langString
    "A set of rules or guidelines outlining criterias for design@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Design Standard@en",
   :rdfs/subClassOf [:dpvo/GuidelinesPrinciple
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Destruct
  "to process data in a way it no longer exists or cannot be repaired"
  {:db/ident :dpvo/Destruct,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   #rdf/langString
    "to process data in a way it no longer exists or cannot be repaired@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Destruct@en",
   :rdfs/subClassOf [:dpvo/Remove :dpvo/Processing],
   :vs/term_status #rdf/langString "accepted@en"})

(def DeterministicPseudonymisation
  "Pseudonymisation achieved through a deterministic function"
  {:db/ident :dpvo/DeterministicPseudonymisation,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Pseudonymisation achieved through a deterministic function@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Deterministic Pseudonymisation@en",
   :rdfs/subClassOf [:dpvo/Pseudonymisation
                     :dpvo/TechnicalMeasure
                     :dpvo/Deidentification
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/DataSanitisationTechnique],
   :vs/term_status #rdf/langString "accepted@en"})

(def Detriment
  "Impact that acts as or causes detriments"
  {:db/ident            :dpvo/Detriment,
   :dcterms/created     #xsd/date #inst "2022-03-23T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Beatriz Esteves"}
                         {:xsd/string "Julian Flake"}
                         {:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Fajar Ekaputra"}
                         {:xsd/string "Georg P Krog"}],
   :dcterms/description #rdf/langString
                         "Impact that acts as or causes detriments@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Detriment@en",
   :rdfs/subClassOf     [:dpvo/Impact :dpvo/Consequence],
   :vs/term_status      #rdf/langString "accepted@en"})

(def DifferentialPrivacy
  "Utilisation of differential privacy where information is shared as patterns or groups to withold individual elements"
  {:db/ident :dpvo/DifferentialPrivacy,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Utilisation of differential privacy where information is shared as patterns or groups to withold individual elements@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/data-protection-engineering"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Differential Privacy@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def DigitalRightsManagement
  "Management of access, use, and other operations associated with digital content"
  {:db/ident :dpvo/DigitalRightsManagement,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Management of access, use, and other operations associated with digital content@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Digital Rights Management@en",
   :rdfs/subClassOf [:dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def DigitalSignatures
  "Expression and authentication of identity through digital information containing cryptographic signatures"
  {:db/ident :dpvo/DigitalSignatures,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Expression and authentication of identity through digital information containing cryptographic signatures@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Digital Signatures@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def DirectMarketing
  "Purposes associated with conducting direct marketing i.e. marketing communicated directly to the individual"
  {:db/ident :dpvo/DirectMarketing,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with conducting direct marketing i.e. marketing communicated directly to the individual@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Direct Marketing@en",
   :rdfs/subClassOf [:dpvo/Marketing :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def DisasterRecoveryProcedures
  "Procedures related to management of disasters and recovery"
  {:db/ident :dpvo/DisasterRecoveryProcedures,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Procedures related to management of disasters and recovery@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Disaster Recovery Procedures@en",
   :rdfs/subClassOf [:dpvo/GovernanceProcedures
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Disclose
  "to make data known"
  {:db/ident :dpvo/Disclose,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #rdf/langString "to make data known@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Disclose@en",
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status #rdf/langString "accepted@en"})

(def DiscloseByTransmission
  "to disclose data by means of transmission"
  {:db/ident :dpvo/DiscloseByTransmission,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #rdf/langString
                         "to disclose data by means of transmission@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Disclose by Transmission@en",
   :rdfs/subClassOf [:dpvo/Disclose :dpvo/Processing],
   :vs/term_status #rdf/langString "accepted@en"})

(def DisputeManagement
  "Purposes associated with activities that manage disputes by natural persons, private bodies, or public authorities relevant to organisation"
  {:db/ident :dpvo/DisputeManagement,
   :dcterms/created #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Beatriz Esteves"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with activities that manage disputes by natural persons, private bodies, or public authorities relevant to organisation@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Dispute Management@en",
   :rdfs/subClassOf [:dpvo/OrganisationGovernance :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def Disseminate
  "to spread data throughout"
  {:db/ident :dpvo/Disseminate,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #rdf/langString "to spread data throughout@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Disseminate@en",
   :rdfs/subClassOf [:dpvo/Disclose :dpvo/Processing],
   :vs/term_status #rdf/langString "accepted@en"})

(def DistributedSystemSecurity
  "Security implementations provided using or over a distributed system"
  {:db/ident :dpvo/DistributedSystemSecurity,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Security implementations provided using or over a distributed system@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Distributed System Security@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def DocumentRandomisedPseudonymisation
  "Use of randomised pseudonymisation where the same elements are assigned different values in the same document or database"
  {:db/ident :dpvo/DocumentRandomisedPseudonymisation,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Use of randomised pseudonymisation where the same elements are assigned different values in the same document or database@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Document Randomised Pseudonymisation@en",
   :rdfs/subClassOf [:dpvo/Pseudonymisation
                     :dpvo/TechnicalMeasure
                     :dpvo/Deidentification
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/DataSanitisationTechnique],
   :vs/term_status #rdf/langString "accepted@en"})

(def DocumentSecurity
  "Security measures enacted over documents to protect against tampering or restrict access"
  {:db/ident :dpvo/DocumentSecurity,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Security measures enacted over documents to protect against tampering or restrict access@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Document Security@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Duration
  "The duration or temporal limitation"
  {:db/ident            :dpvo/Duration,
   :dcterms/created     #xsd/date #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "The duration or temporal limitation@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Duration@en",
   :rdfs/subClassOf     :dpvo/Context,
   :vs/term_status      #rdf/langString "accepted@en"})

(def EconomicUnion
  "A political union of two or more countries based on economic or trade agreements"
  {:db/ident :dpvo/EconomicUnion,
   :dcterms/created #xsd/date #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "A political union of two or more countries based on economic or trade agreements@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Economic Union@en",
   :rdfs/subClassOf :dpvo/Location,
   :vs/term_status #rdf/langString "accepted@en"})

(def EducationalTraining
  "Training methods that are intended to provide education on topic(s)"
  {:db/ident :dpvo/EducationalTraining,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Training methods that are intended to provide education on topic(s)@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Educational Training@en",
   :rdfs/subClassOf [:dpvo/StaffTraining
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def EffectivenessDeterminationProcedures
  "Procedures intended to determine effectiveness of other measures"
  {:db/ident :dpvo/EffectivenessDeterminationProcedures,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Procedures intended to determine effectiveness of other measures@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Effectiveness Determination Procedures@en",
   :rdfs/subClassOf [:dpvo/Assessment
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def ElderlyDataSubject
  "Data subjects that are considered elderly (i.e. based on age)"
  {:db/ident :dpvo/ElderlyDataSubject,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #rdf/langString
    "Data subjects that are considered elderly (i.e. based on age)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Elderly Data Subject@en",
   :rdfs/subClassOf [:dpvo/VulnerableDataSubject
                     :dpvo/DataSubject
                     :dpvo/NaturalPerson
                     :dpvo/LegalEntity
                     :dpvo/Entity],
   :vs/term_status #rdf/langString "accepted@en"})

(def Employee
  "Data subjects that are employees"
  {:db/ident            :dpvo/Employee,
   :dcterms/created     #xsd/date #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Georg P. Krog"}
                         {:xsd/string "Julian Flake"}
                         {:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Beatriz Esteves"}
                         {:xsd/string "Paul Ryan"}],
   :dcterms/description #rdf/langString "Data subjects that are employees@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Employee@en",
   :rdfs/subClassOf     [:dpvo/DataSubject
                         :dpvo/NaturalPerson
                         :dpvo/LegalEntity
                         :dpvo/Entity],
   :vs/term_status      #rdf/langString "accepted@en"})

(def Encryption
  "Technical measures consisting of encryption"
  {:db/ident            :dpvo/Encryption,
   :dcterms/created     #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Rob Brennan"}
                         {:xsd/string "Axel Polleres"}
                         {:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Mark Lizar"}],
   :dcterms/description #rdf/langString
                         "Technical measures consisting of encryption@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Encryption@en",
   :rdfs/subClassOf     [:dpvo/TechnicalMeasure
                         :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status      #rdf/langString "accepted@en"})

(def EncryptionAtRest
  "Encryption of data when being stored (persistent encryption)"
  {:db/ident :dpvo/EncryptionAtRest,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Mark Lizar"}
                     {:xsd/string "Rob Brennan"}],
   :dcterms/description
   #rdf/langString
    "Encryption of data when being stored (persistent encryption)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Encryption at Rest@en",
   :rdfs/subClassOf [:dpvo/Encryption
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def EncryptionInTransfer
  "Encryption of data in transit e.g. when being transferred from one location to another, including sharing"
  {:db/ident :dpvo/EncryptionInTransfer,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Axel Polleres"}
                     {:xsd/string "Rob Brennan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Mark Lizar"}],
   :dcterms/description
   #rdf/langString
    "Encryption of data in transit e.g. when being transferred from one location to another, including sharing@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Encryption in Transfer@en",
   :rdfs/subClassOf [:dpvo/Encryption
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def EncryptionInUse
  "Encryption of data when it is being used"
  {:db/ident            :dpvo/EncryptionInUse,
   :dcterms/created     #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Encryption of data when it is being used@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Encryption in Use@en",
   :rdfs/subClassOf     [:dpvo/Encryption
                         :dpvo/TechnicalMeasure
                         :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status      #rdf/langString "accepted@en"})

(def EndToEndEncryption
  "Encrypted communications where data is encrypted by the sender and decrypted by the intended receiver to prevent access to any third party"
  {:db/ident :dpvo/EndToEndEncryption,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Encrypted communications where data is encrypted by the sender and decrypted by the intended receiver to prevent access to any third party@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/data-protection-engineering"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "End-to-End Encryption (E2EE)@en",
   :rdfs/subClassOf [:dpvo/Encryption
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def EndlessDuration
  "Duration that is (known or intended to be) open ended or without an end"
  {:db/ident :dpvo/EndlessDuration,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Duration that is (known or intended to be) open ended or without an end@en",
   :dcterms/modified #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type [:dpvo/Duration :owl/NamedIndividual :dpvo/Context],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Endless Duration@en",
   :vs/term_status #rdf/langString "modified@en"})

(def EnforceAccessControl
  "Purposes associated with conducting or enforcing access control as a form of security"
  {:db/ident :dpvo/EnforceAccessControl,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Javier Fernandez"}
                     {:xsd/string "Simon Steyskal"}
                     {:xsd/string "Elmar Kiesling"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with conducting or enforcing access control as a form of security@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Was previously \"Access Control\". Prefixed to distinguish from Technical Measure.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Enforce Access Control@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/purposes#Login"},
   :rdfs/subClassOf [:dpvo/EnforceSecurity :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def EnforceSecurity
  "Purposes associated with ensuring and enforcing security for data, personnel, or other related matters"
  {:db/ident :dpvo/EnforceSecurity,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Axel Polleres"}
                     {:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling"}
                     {:xsd/string "Javier Fernandez"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Simon Steyskal"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with ensuring and enforcing security for data, personnel, or other related matters@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Was previous \"Security\". Prefixed to distinguish from TechOrg measures.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Enforce Security@en",
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status #rdf/langString "accepted@en"})

(def EnterIntoContract
  "Processing necessary to enter into contract"
  {:db/ident            :dpvo/EnterIntoContract,
   :dcterms/created     #xsd/date #inst "2021-04-07T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Georg P Krog"}
                         {:xsd/string "Paul Ryan"}],
   :dcterms/description #rdf/langString
                         "Processing necessary to enter into contract@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Enter Into Contract@en",
   :rdfs/subClassOf     [:dpvo/Contract
                         :dpvo/LegalAgreement
                         :dpvo/LegalBasis
                         :dpvo/OrganisationalMeasure
                         :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status      #rdf/langString "accepted@en"})

(def Entity
  "A human or non-human 'thing' that constitutes as an entity"
  {:db/ident :dpvo/Entity,
   :dcterms/created #xsd/date #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "A human or non-human 'thing' that constitutes as an entity@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Entity@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def Erase
  "to delete data"
  {:db/ident :dpvo/Erase,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #rdf/langString "to delete data@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Erase@en",
   :rdfs/subClassOf [:dpvo/Remove :dpvo/Processing],
   :vs/term_status #rdf/langString "accepted@en"})

(def EstablishContractualAgreement
  "Purposes associated with carrying out data processing to establish an agreement, such as for entering into a contract"
  {:db/ident :dpvo/EstablishContractualAgreement,
   :dcterms/created #xsd/date #inst "2022-11-09T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with carrying out data processing to establish an agreement, such as for entering into a contract@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Establish Contractual Agreement@en",
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status #rdf/langString "accepted@en"})

(def EvaluationOfIndividuals
  "Processing that involves evaluation of individuals"
  {:db/ident :dpvo/EvaluationOfIndividuals,
   :dcterms/created #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Processing that involves evaluation of individuals@en",
   :dcterms/modified #xsd/date #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Evaluation of Individuals@en",
   :rdfs/subClassOf
   [:dpvo/EvaluationScoring :dpvo/Context :dpvo/ProcessingContext],
   :vs/term_status #rdf/langString "modified@en"})

(def EvaluationScoring
  "Processing that involves evaluation and scoring of individuals"
  {:db/ident :dpvo/EvaluationScoring,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Piero Bonatti"}],
   :dcterms/description
   #rdf/langString
    "Processing that involves evaluation and scoring of individuals@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Evaluation and Scoring@en",
   :rdfs/subClassOf [:dpvo/ProcessingContext :dpvo/Context],
   :vs/term_status #rdf/langString "accepted@en"})

(def ExplicitlyExpressedConsent
  "Consent that is expressed through an explicit action solely conveying a consenting decision"
  {:db/ident :dpvo/ExplicitlyExpressedConsent,
   :dcterms/created #xsd/date #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Consent that is expressed through an explicit action solely conveying a consenting decision@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Explicitly expressed consent is a more specific form of Expressed consent where the action taken must 'explicitly' relate to only the consent decision. Expressed consent where the consenting is part of other matters therefore cannot satisfy the requirements of explicitly expressed consent. An example of explicit action expressing the consenting decision is a button on a web form where the form only relates to consent, or it is accompanied with suitable text that reiterates what the consenting decision is about@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Explicitly Expressed Consent@en",
   :rdfs/subClassOf [:dpvo/ExpressedConsent
                     :dpvo/LegalBasis
                     :dpvo/InformedConsent
                     :dpvo/Consent],
   :vs/term_status #rdf/langString "accepted@en"})

(def ExpressedConsent
  "Consent that is expressed through an action intended to convey a consenting decision"
  {:db/ident :dpvo/ExpressedConsent,
   :dcterms/created #xsd/date #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}],
   :dcterms/description
   #rdf/langString
    "Consent that is expressed through an action intended to convey a consenting decision@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Expressed consent requires the individual take a specific and unambigious action that directly indicates their consent. This action may be a part of other processes such as setting preferences, or agreeing to a contract, or other matters not relating to consent. An example of expressed consent is interacting with a checkbox within a dashboard or clicking a button on a web form@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Expressed Consent@en",
   :rdfs/subClassOf [:dpvo/InformedConsent :dpvo/LegalBasis :dpvo/Consent],
   :vs/term_status #rdf/langString "accepted@en"})

(def FederatedLocations
  "Location that is federated across multiple separate areas with designation of a primary or central location"
  {:db/ident :dpvo/FederatedLocations,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Location that is federated across multiple separate areas with designation of a primary or central location@en",
   :dcterms/modified #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Federated Locations@en",
   :rdfs/subClassOf :dpvo/LocationFixture,
   :vs/term_status #rdf/langString "modified@en"})

(def FileSystemSecurity
  "Security implemented over a file system"
  {:db/ident :dpvo/FileSystemSecurity,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Security implemented over a file system@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "File System Security@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Filter
  "to filter or keep data for some criteria"
  {:db/ident            :dpvo/Filter,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Georg P Krog"}],
   :dcterms/description #rdf/langString
                         "to filter or keep data for some criteria@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Filter@en",
   :rdfs/subClassOf     [:dpvo/Transform :dpvo/Processing],
   :vs/term_status      #rdf/langString "accepted@en"})

(def FixedLocation
  "Location that is fixed i.e. known to occur at a specific place"
  {:db/ident :dpvo/FixedLocation,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Location that is fixed i.e. known to occur at a specific place@en",
   :dcterms/modified #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Fixed Location@en",
   :rdfs/subClassOf :dpvo/LocationFixture,
   :vs/term_status #rdf/langString "modified@en"})

(def FixedMultipleLocations
  "Location that is fixed with multiple places e.g. multiple cities"
  {:db/ident :dpvo/FixedMultipleLocations,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Location that is fixed with multiple places e.g. multiple cities@en",
   :dcterms/modified #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Fixed Multiple Locations@en",
   :rdfs/subClassOf [:dpvo/FixedLocation :dpvo/LocationFixture],
   :vs/term_status #rdf/langString "modified@en"})

(def FixedOccurencesDuration
  "Duration that takes place a fixed number of times e.g. 3 times"
  {:db/ident :dpvo/FixedOccurencesDuration,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Duration that takes place a fixed number of times e.g. 3 times@en",
   :dcterms/modified #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Fixed Occurences Duration@en",
   :rdfs/subClassOf [:dpvo/Duration :dpvo/Context],
   :vs/term_status #rdf/langString "modified@en"})

(def FixedSingularLocation
  "Location that is fixed at a specific place e.g. a city"
  {:db/ident :dpvo/FixedSingularLocation,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Location that is fixed at a specific place e.g. a city@en",
   :dcterms/modified #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Fixed Singular Location@en",
   :rdfs/subClassOf [:dpvo/FixedLocation :dpvo/LocationFixture],
   :vs/term_status #rdf/langString "modified@en"})

(def ForProfitOrganisation
  "An organisation that aims to achieve profit as its primary goal"
  {:db/ident :dpvo/ForProfitOrganisation,
   :dcterms/created #xsd/date #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "An organisation that aims to achieve profit as its primary goal@en",
   :dcterms/modified #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "For-Profit Organisation@en",
   :rdfs/subClassOf [:dpvo/Organisation :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "modified@en"})

(def FraudPreventionAndDetection
  "Purposes associated with fraud detection, prevention, and mitigation"
  {:db/ident :dpvo/FraudPreventionAndDetection,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Javier Fernandez"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Simon Steyskal"}
                     {:xsd/string "Elmar Kiesling"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with fraud detection, prevention, and mitigation@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Fraud Prevention and Detection@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/purposes#Government"},
   :rdfs/subClassOf [:dpvo/EnforceSecurity :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def Frequency
  "The frequency or information about periods and repetitions in terms of recurrence."
  {:db/ident :dpvo/Frequency,
   :dcterms/created #xsd/date #inst "2022-02-16T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "The frequency or information about periods and repetitions in terms of recurrence.@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Frequency@en",
   :rdfs/subClassOf :dpvo/Context,
   :vs/term_status #rdf/langString "accepted@en"})

(def FulfilmentOfContractualObligation
  "Purposes associated with carrying out data processing to fulfill a contractual obligation"
  {:db/ident :dpvo/FulfilmentOfContractualObligation,
   :dcterms/created #xsd/date #inst "2022-11-09T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with carrying out data processing to fulfill a contractual obligation@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Fulfilment of Contractual Obligation@en",
   :rdfs/subClassOf [:dpvo/FulfilmentOfObligation :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def FulfilmentOfObligation
  "Purposes associated with carrying out data processing to fulfill an obligation"
  {:db/ident :dpvo/FulfilmentOfObligation,
   :dcterms/created #xsd/date #inst "2022-11-09T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with carrying out data processing to fulfill an obligation@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Fulfilment of Obligation@en",
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status #rdf/langString "accepted@en"})

(def FullyAutomatedProcessing
  "Processing that is fully automated"
  {:db/ident            :dpvo/FullyAutomatedProcessing,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Processing that is fully automated@en",
   :rdf/type            [:dpvo/AutomationOfProcessing
                         :owl/NamedIndividual
                         :dpvo/Context
                         :dpvo/ProcessingContext],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Fully Automated Processing@en",
   :vs/term_status      #rdf/langString "accepted@en"})

(def FullyRandomisedPseudonymisation
  "Use of randomised pseudonymisation where the same elements are assigned different values each time they occur"
  {:db/ident :dpvo/FullyRandomisedPseudonymisation,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Use of randomised pseudonymisation where the same elements are assigned different values each time they occur@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Fully Randomised Pseudonymisation@en",
   :rdfs/subClassOf [:dpvo/Pseudonymisation
                     :dpvo/TechnicalMeasure
                     :dpvo/Deidentification
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/DataSanitisationTechnique],
   :vs/term_status #rdf/langString "accepted@en"})

(def Generate
  "to generate or create data"
  {:db/ident            :dpvo/Generate,
   :dcterms/created     #xsd/date #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "to generate or create data@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Generate@en",
   :rdfs/subClassOf     [:dpvo/Obtain :dpvo/Processing],
   :vs/term_status      #rdf/langString "accepted@en"})

(def GeneratedPersonalData
  "Personal Data that is generated or brought into existence without relation to existing data i.e. it is not derived or inferred from other data"
  {:db/ident :dpvo/GeneratedPersonalData,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Personal Data that is generated or brought into existence without relation to existing data i.e. it is not derived or inferred from other data@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Generated Data is used to indicate data that is produced and is not derived or inferred from other data@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Generated Personal Data@en",
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo/Data],
   :vs/term_status #rdf/langString "accepted@en"})

(def GeographicCoverage
  "Indicate of scale in terms of geographic coverage"
  {:db/ident            :dpvo/GeographicCoverage,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Paul Ryan"}
                         {:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Georg P Krog"}],
   :dcterms/description #rdf/langString
                         "Indicate of scale in terms of geographic coverage@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Geographic Coverage@en",
   :rdfs/subClassOf     [:dpvo/Scale :dpvo/Context :dpvo/ProcessingContext],
   :vs/term_status      #rdf/langString "accepted@en"})

(def GlobalScale
  "Geographic coverage spanning the entire globe"
  {:db/ident            :dpvo/GlobalScale,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Geographic coverage spanning the entire globe@en",
   :rdf/type            [:dpvo/GeographicCoverage
                         :owl/NamedIndividual
                         :dpvo/Context
                         :dpvo/Scale
                         :dpvo/ProcessingContext],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Global Scale@en",
   :vs/term_status      #rdf/langString "accepted@en"})

(def GovernanceProcedures
  "Procedures related to governance (e.g. organisation, unit, team, process, system)"
  {:db/ident :dpvo/GovernanceProcedures,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Procedures related to governance (e.g. organisation, unit, team, process, system)@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Governance Procedures@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def GovernmentalOrganisation
  "An organisation managed or part of government"
  {:db/ident            :dpvo/GovernmentalOrganisation,
   :dcterms/created     #xsd/date #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "An organisation managed or part of government@en",
   :dcterms/modified    #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Governmental Organisation@en",
   :rdfs/subClassOf     [:dpvo/Organisation :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status      #rdf/langString "modified@en"})

(def GuardianOfDataSubject
  "Guardian(s) of data subjects such as children"
  {:db/ident            :dpvo/GuardianOfDataSubject,
   :dcterms/created     #xsd/date #inst "2022-08-03T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Georg P Krog"},
   :dcterms/description #rdf/langString
                         "Guardian(s) of data subjects such as children@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Guardian(s) of Data Subject@en",
   :rdfs/subClassOf     [:dpvo/DataSubject
                         :dpvo/NaturalPerson
                         :dpvo/LegalEntity
                         :dpvo/Entity],
   :vs/term_status      #rdf/langString "accepted@en"})

(def GuidelinesPrinciple
  "Guidelines or Principles regarding processing and operational measures"
  {:db/ident :dpvo/GuidelinesPrinciple,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Axel Polleres"}
                     {:xsd/string "Mark Lizar"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Rob Brennan"}],
   :dcterms/description
   #rdf/langString
    "Guidelines or Principles regarding processing and operational measures@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "GuidelinesPrinciple@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def HardwareSecurityProtocols
  "Security protocols implemented at or within hardware"
  {:db/ident :dpvo/HardwareSecurityProtocols,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Security protocols implemented at or within hardware@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Hardware Security Protocols@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Harm
  "Impact that acts as or causes harms"
  {:db/ident            :dpvo/Harm,
   :dcterms/created     #xsd/date #inst "2022-08-13T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Beatriz Esteves"}
                         {:xsd/string "Georg P Krog"}
                         {:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Fajar Ekaputra"}
                         {:xsd/string "Julian Flake"}],
   :dcterms/description #rdf/langString
                         "Impact that acts as or causes harms@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Harm@en",
   :rdfs/subClassOf     [:dpvo/Damage :dpvo/Consequence :dpvo/Impact],
   :vs/term_status      #rdf/langString "changed@en"})

(def HashFunctions
  "Use of hash functions to map information or to retrieve a prior categorisation"
  {:db/ident :dpvo/HashFunctions,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Use of hash functions to map information or to retrieve a prior categorisation@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Hash Functions@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def HashMessageAuthenticationCode
  "Use of HMAC where message authentication code (MAC) utilise a cryptographic hash function and a secret cryptographic key"
  {:db/ident :dpvo/HashMessageAuthenticationCode,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Use of HMAC where message authentication code (MAC) utilise a cryptographic hash function and a secret cryptographic key@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString
                "Hash-based Message Authentication Code (HMAC)@en",
   :rdfs/subClassOf [:dpvo/CryptographicAuthentication
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/CryptographicMethods
                     :dpvo/AuthenticationProtocols],
   :vs/term_status #rdf/langString "accepted@en"})

(def HomomorphicEncryption
  "Use of Homomorphic encryption that permits computations on encrypted data without decrypting it"
  {:db/ident :dpvo/HomomorphicEncryption,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Use of Homomorphic encryption that permits computations on encrypted data without decrypting it@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Homomorphic Encryption@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def HugeDataVolume
  "Data volume that is considered huge or more than large within the context"
  {:db/ident :dpvo/HugeDataVolume,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Data volume that is considered huge or more than large within the context@en",
   :rdf/type [:dpvo/DataVolume
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/ProcessingContext
              :dpvo/Scale],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Huge Data Volume@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def HugeScaleOfDataSubjects
  "Scale of data subjects considered huge or more than large within the context"
  {:db/ident :dpvo/HugeScaleOfDataSubjects,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Scale of data subjects considered huge or more than large within the context@en",
   :rdf/type [:dpvo/DataSubjectScale
              :owl/NamedIndividual
              :dpvo/Scale
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Huge Scale Of Data Subjects@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def HumanInvolvement
  "The involvement of humans in specified context"
  {:db/ident :dpvo/HumanInvolvement,
   :dcterms/created #xsd/date #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "The involvement of humans in specified context@en",
   :dcterms/modified #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Human Involvement here broadly refers to any involvement by a human in the context of carrying out processing. This may include verification of outcomes, providing input data for making decisions, or overseeing activities.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Human Involvement@en",
   :rdfs/subClassOf
   [:dpvo/AutomationOfProcessing :dpvo/Context :dpvo/ProcessingContext],
   :vs/term_status #rdf/langString "accepted@en"})

(def HumanInvolvementForInput
  "Human involvement for the purposes of providing inputs"
  {:db/ident :dpvo/HumanInvolvementForInput,
   :dcterms/created #xsd/date #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Human involvement for the purposes of providing inputs@en",
   :rdf/type [:dpvo/HumanInvolvement
              :owl/NamedIndividual
              :dpvo/AutomationOfProcessing
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Human Involvement for Input@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def HumanInvolvementForOversight
  "Human involvement for the purposes of having oversight over a system, its operations, inputs, or outputs"
  {:db/ident :dpvo/HumanInvolvementForOversight,
   :dcterms/created #xsd/date #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Human involvement for the purposes of having oversight over a system, its operations, inputs, or outputs@en",
   :rdf/type [:dpvo/HumanInvolvement
              :owl/NamedIndividual
              :dpvo/AutomationOfProcessing
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Human Involvement for Oversight@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def HumanInvolvementForVerification
  "Human involvement for the purposes of verification of a system, its operations, inputs, or outputs"
  {:db/ident :dpvo/HumanInvolvementForVerification,
   :dcterms/created #xsd/date #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Human involvement for the purposes of verification of a system, its operations, inputs, or outputs@en",
   :rdf/type [:dpvo/HumanInvolvement
              :owl/NamedIndividual
              :dpvo/AutomationOfProcessing
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Human Involvement for Verification@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def HumanResourceManagement
  "Purposes associated with managing humans and 'human resources' within the organisation for effective and efficient operations."
  {:db/ident :dpvo/HumanResourceManagement,
   :dcterms/created #xsd/date #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "David Hickey"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with managing humans and 'human resources' within the organisation for effective and efficient operations.@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "HR is a broad concept. Its management includes, amongst others - recruiting employees and intermediaries e.g. brokers, independent representatives; payroll administration, remunerations, commissions, and wages; and application of social legislation.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Human Resource Management@en",
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status #rdf/langString "accepted@en"})

(def IdentityManagementMethod
  "Management of identity and identity-based processes"
  {:db/ident :dpvo/IdentityManagementMethod,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Management of identity and identity-based processes@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Identity Management Method@en",
   :rdfs/subClassOf [:dpvo/AuthorisationProcedure
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def IdentityVerification
  "Purposes associated with verifying or authorising identity as a form of security"
  {:db/ident :dpvo/IdentityVerification,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Simon Steyskal"}
                     {:xsd/string "Javier Fernandez"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with verifying or authorising identity as a form of security@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Identity Verification@en",
   :rdfs/subClassOf [:dpvo/EnforceSecurity :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def Immigrant
  "Data subjects that are immigrants (for a jurisdiction)"
  {:db/ident :dpvo/Immigrant,
   :dcterms/created #xsd/date #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Georg P. Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Julian Flake"}],
   :dcterms/description
   #rdf/langString "Data subjects that are immigrants (for a jurisdiction)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Immigrant@en",
   :rdfs/subClassOf
   [:dpvo/DataSubject :dpvo/NaturalPerson :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "accepted@en"})

(def Impact
  "The impact(s) possible or arising as a consequence from specified context"
  {:db/ident :dpvo/Impact,
   :dcterms/created #xsd/date #inst "2022-03-23T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "The impact(s) possible or arising as a consequence from specified context@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Impact is a stronger notion of consequence in terms of influence, change, or effect on something e.g. for impact assessments@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Impact@en",
   :rdfs/subClassOf :dpvo/Consequence,
   :vs/term_status #rdf/langString "accepted@en"})

(def ImpactAssessment
  "Calculating or determining the likelihood of impact of an existing or proposed process, which can involve risks or detriments."
  {:db/ident :dpvo/ImpactAssessment,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Calculating or determining the likelihood of impact of an existing or proposed process, which can involve risks or detriments.@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Impact Assessment@en",
   :rdfs/subClassOf [:dpvo/Assessment
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def ImpliedConsent
  "Consent that is implied indirectly through an action not associated solely with conveying a consenting decision"
  {:db/ident :dpvo/ImpliedConsent,
   :dcterms/created #xsd/date #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Julian Flake"}],
   :dcterms/description
   #rdf/langString
    "Consent that is implied indirectly through an action not associated solely with conveying a consenting decision@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Implied consent is expected to also be Informed Consent. An example is a CCTV notice outside a monitored area that informs the individuals that by walking in they would be consenting to the use of camera for surveillance.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Implied Consent@en",
   :rdfs/subClassOf [:dpvo/InformedConsent :dpvo/LegalBasis :dpvo/Consent],
   :vs/term_status #rdf/langString "accepted@en"})

(def Importance
  "An indication of 'importance' within a context"
  {:db/ident :dpvo/Importance,
   :dcterms/created #xsd/date #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description #rdf/langString
                         "An indication of 'importance' within a context@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Importance can be used to express importance, desirability, relevance, or significance as a context.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Importance@en",
   :rdfs/subClassOf :dpvo/Context,
   :vs/term_status #rdf/langString "accepted@en"})

(def ImproveExistingProductsAndServices
  "Purposes associated with improving existing products and services"
  {:db/ident :dpvo/ImproveExistingProductsAndServices,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling"}
                     {:xsd/string "Simon Steyskal"}
                     {:xsd/string "Javier Fernandez"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Axel Polleres"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with improving existing products and services@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Improve Existing Products and Services@en",
   :rdfs/subClassOf [:dpvo/OptimisationForController
                     :dpvo/ServiceProvision
                     :dpvo/Purpose
                     :dpvo/ServiceOptimisation],
   :vs/term_status #rdf/langString "accepted@en"})

(def ImproveInternalCRMProcesses
  "Purposes associated with improving customer-relationship management (CRM) processes"
  {:db/ident :dpvo/ImproveInternalCRMProcesses,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Simon Steyskal"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Elmar Kiesling"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Javier Fernandez"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with improving customer-relationship management (CRM) processes@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Improve Internal CRM Processes@en",
   :rdfs/subClassOf [:dpvo/OptimisationForController
                     :dpvo/CustomerRelationshipManagement
                     :dpvo/ServiceProvision
                     :dpvo/Purpose
                     :dpvo/CustomerManagement
                     :dpvo/ServiceOptimisation],
   :vs/term_status #rdf/langString "accepted@en"})

(def IncidentManagementProcedures
  "Procedures related to management of incidents"
  {:db/ident :dpvo/IncidentManagementProcedures,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Procedures related to management of incidents@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Incident Management Procedures@en",
   :rdfs/subClassOf [:dpvo/GovernanceProcedures
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def IncidentReportingCommunication
  "Procedures related to management of incident reporting"
  {:db/ident :dpvo/IncidentReportingCommunication,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Procedures related to management of incident reporting@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Incident Reporting Communication@en",
   :rdfs/subClassOf [:dpvo/GovernanceProcedures
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def IncorrectData
  "Data that is known to be incorrect or inconsistent with some quality requirements"
  {:db/ident :dpvo/IncorrectData,
   :dcterms/created #xsd/date #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Data that is known to be incorrect or inconsistent with some quality requirements@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Incorrect Data@en",
   :rdfs/subClassOf :dpvo/Data,
   :vs/term_status #rdf/langString "accepted@en"})

(def IncreaseServiceRobustness
  "Purposes associated with improving robustness and resilience of services"
  {:db/ident :dpvo/IncreaseServiceRobustness,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Simon Steyskal"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Elmar Kiesling"}
                     {:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Javier Fernandez"}
                     {:xsd/string "Axel Polleres"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with improving robustness and resilience of services@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Increase Service Robustness@en",
   :rdfs/subClassOf [:dpvo/OptimisationForController
                     :dpvo/ServiceProvision
                     :dpvo/Purpose
                     :dpvo/ServiceOptimisation],
   :vs/term_status #rdf/langString "accepted@en"})

(def IndeterminateDuration
  "Duration that is indeterminate or cannot be determined"
  {:db/ident :dpvo/IndeterminateDuration,
   :dcterms/created #xsd/date #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Duration that is indeterminate or cannot be determined@en",
   :rdf/type [:dpvo/Duration :owl/NamedIndividual :dpvo/Context],
   :rdfs/comment
   #rdf/langString
    "Indeterminate means (exact or otherwise) information about the duration cannot be determined, which is distinct from 'EndlessDuration' where it is known (or decided) that the duration is open-ended or without an end.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Indeterminate Duration@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def IndustryConsortium
  "A consortium established and comprising on industry organisations"
  {:db/ident :dpvo/IndustryConsortium,
   :dcterms/created #xsd/date #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "A consortium established and comprising on industry organisations@en",
   :dcterms/modified #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :dcterms/source {:rdfa/uri "http://purl.org/adms"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Industry Consortium@en",
   :rdfs/subClassOf [:dpvo/Organisation :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "modified@en"})

(def Infer
  "to infer data from existing data"
  {:db/ident :dpvo/Infer,
   :dcterms/created #xsd/date #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "to infer data from existing data@en",
   :dcterms/modified #xsd/date #inst "2022-10-14T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Infer indicates data that is derived without it being present or obtainable from existing data. For data that is presented, and is 'extracted' or 'obtained' from existing data, see Derive.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Infer@en",
   :rdfs/subClassOf [:dpvo/Derive :dpvo/Obtain :dpvo/Processing],
   :vs/term_status #rdf/langString "modified@en"})

(def InferredPersonalData
  "Personal Data that is obtained through inference from other data"
  {:db/ident :dpvo/InferredPersonalData,
   :dcterms/created #xsd/date #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Personal Data that is obtained through inference from other data@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Inferred Data is derived data generated from existing data, but which did not originally exist within it, e.g. inferring demographics from browsing history.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Inferred Personal Data@en",
   :rdfs/subClassOf [:dpvo/GeneratedPersonalData
                     :dpvo/DerivedPersonalData
                     :dpvo/Data
                     :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def InformationFlowControl
  "Use of measures to control information flows"
  {:db/ident :dpvo/InformationFlowControl,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Use of measures to control information flows@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Information Flow Control@en",
   :rdfs/subClassOf [:dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def InformationSecurityPolicy
  "Policy regarding security of information"
  {:db/ident :dpvo/InformationSecurityPolicy,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Policy regarding security of information@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Information Security Policy@en",
   :rdfs/subClassOf [:dpvo/Policy
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def InformedConsent
  "Consent that is informed i.e. with the requirement to provide sufficient information to make a consenting decision"
  {:db/ident :dpvo/InformedConsent,
   :dcterms/created #xsd/date #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Consent that is informed i.e. with the requirement to provide sufficient information to make a consenting decision@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "The specifics for what information should be provided or made available will depend on the context, use-case, or relevant legal requirements@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Informed Consent@en",
   :rdfs/subClassOf [:dpvo/Consent :dpvo/LegalBasis],
   :vs/term_status #rdf/langString "accepted@en"})

(def InnovativeUseOfNewTechnologies
  "Processing that involves use of innovative and new technologies"
  {:db/ident :dpvo/InnovativeUseOfNewTechnologies,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Piero Bonatti"}],
   :dcterms/description
   #rdf/langString
    "Processing that involves use of innovative and new technologies@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Innovative Use of New Technologies@en",
   :rdfs/subClassOf [:dpvo/ProcessingContext :dpvo/Context],
   :vs/term_status #rdf/langString "accepted@en"})

(def InternalResourceOptimisation
  "Purposes associated with optimisation of internal resource availability and usage for organisation"
  {:db/ident :dpvo/InternalResourceOptimisation,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Simon Steyskal"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Javier Fernandez"}
                     {:xsd/string "Elmar Kiesling"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with optimisation of internal resource availability and usage for organisation@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Internal Resource Optimisation@en",
   :rdfs/subClassOf [:dpvo/OptimisationForController
                     :dpvo/ServiceProvision
                     :dpvo/Purpose
                     :dpvo/ServiceOptimisation],
   :vs/term_status #rdf/langString "accepted@en"})

(def InternationalOrganisation
  "An organisation and its subordinate bodies governed by public international law, or any other body which is set up by, or on the basis of, an agreement between two or more countries"
  {:db/ident :dpvo/InternationalOrganisation,
   :dcterms/created #xsd/date #inst "2022-03-23T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Georg P. Krog"}],
   :dcterms/description
   #rdf/langString
    "An organisation and its subordinate bodies governed by public international law, or any other body which is set up by, or on the basis of, an agreement between two or more countries@en",
   :dcterms/modified #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_26/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "International Organisation@en",
   :rdfs/subClassOf [:dpvo/Organisation :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "modified@en"})

(def IntrusionDetectionSystem
  "Use of measures to detect intrusions and other unauthorised attempts to gain access to a system"
  {:db/ident :dpvo/IntrusionDetectionSystem,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Use of measures to detect intrusions and other unauthorised attempts to gain access to a system@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Intrusion Detection System@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def JobApplicant
  "Data subjects that apply for jobs or employments"
  {:db/ident            :dpvo/JobApplicant,
   :dcterms/created     #xsd/date #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Beatriz Esteves"}
                         {:xsd/string "Paul Ryan"}
                         {:xsd/string "Julian Flake"}
                         {:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Georg P. Krog"}],
   :dcterms/description #rdf/langString
                         "Data subjects that apply for jobs or employments@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Job Applicant@en",
   :rdfs/subClassOf     [:dpvo/Applicant
                         :dpvo/DataSubject
                         :dpvo/NaturalPerson
                         :dpvo/LegalEntity
                         :dpvo/Entity],
   :vs/term_status      #rdf/langString "accepted@en"})

(def JointDataControllers
  "A group of Data Controllers that jointly determine the purposes and means of processing"
  {:db/ident :dpvo/JointDataControllers,
   :dcterms/created #xsd/date #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Georg Krog"}
                     {:xsd/string "Harshvardhan Pandit"}],
   :dcterms/description
   #rdf/langString
    "A group of Data Controllers that jointly determine the purposes and means of processing@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "To indicate the membership, hasDataController may be used@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Joint Data Controllers@en",
   :rdfs/subClassOf [:dpvo/DataController :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "accepted@en"})

(def JointDataControllersAgreement
  "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between Controllers within a Joint Controllers relationship"
  {:db/ident :dpvo/JointDataControllersAgreement,
   :dcterms/created #xsd/date #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}],
   :dcterms/description
   #rdf/langString
    "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between Controllers within a Joint Controllers relationship@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Joint Data Controllers Agreement@en",
   :rdfs/subClassOf [:dpvo/DataProcessingAgreement
                     :dpvo/LegalAgreement
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Justification
  "A form of documentation providing reaosns, explanations, or justifications"
  {:db/ident :dpvo/Justification,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "A form of documentation providing reaosns, explanations, or justifications@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Justification@en",
   :rdfs/subClassOf :dpvo/Context,
   :vs/term_status #rdf/langString "accepted@en"})

(def LargeDataVolume
  "Data volume that is considered large within the context"
  {:db/ident :dpvo/LargeDataVolume,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Data volume that is considered large within the context@en",
   :rdf/type [:dpvo/DataVolume
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/ProcessingContext
              :dpvo/Scale],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Large Data Volume@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def LargeScaleOfDataSubjects
  "Scale of data subjects considered large within the context"
  {:db/ident :dpvo/LargeScaleOfDataSubjects,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Scale of data subjects considered large within the context@en",
   :rdf/type [:dpvo/DataSubjectScale
              :owl/NamedIndividual
              :dpvo/Scale
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Large Scale Of Data Subjects@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def LargeScaleProcessing
  "Processing that takes place at large scales (as specified by some criteria)"
  {:db/ident :dpvo/LargeScaleProcessing,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Piero Bonatti"}],
   :dcterms/description
   #rdf/langString
    "Processing that takes place at large scales (as specified by some criteria)@en",
   :dcterms/modified #xsd/date #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type [:owl/NamedIndividual
              :dpvo/ProcessingScale
              :dpvo/ProcessingContext
              :dpvo/Scale
              :dpvo/Context],
   :rdfs/comment
   #rdf/langString
    "The exact definition of what constitutes \"large scale\" depends on use of jurisdictional, domain-specific, or other forms of externally defined criterias. Where possible, this should be reflected by extending this term with the appropriate context.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Large Scale Processing@en",
   :vs/term_status #rdf/langString "modified@en"})

(def Law
  "A law is a set of rules created by government or authorities"
  {:db/ident :dpvo/Law,
   :dcterms/created #xsd/date #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "A law is a set of rules created by government or authorities@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Law@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def Lawful
  "State of being lawful or legally compliant"
  {:db/ident            :dpvo/Lawful,
   :dcterms/created     #xsd/date #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "State of being lawful or legally compliant@en",
   :rdf/type            [:dpvo/Lawfulness
                         :owl/NamedIndividual
                         :dpvo/Status
                         :dpvo/Context
                         :dpvo/ComplianceStatus],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Lawful@en",
   :vs/term_status      #rdf/langString "accepted@en"})

(def Lawfulness
  "Status associated with expressing lawfullness or legal compliance"
  {:db/ident :dpvo/Lawfulness,
   :dcterms/created #xsd/date #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Status associated with expressing lawfullness or legal compliance@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Lawfulness@en",
   :rdfs/subClassOf [:dpvo/ComplianceStatus :dpvo/Status :dpvo/Context],
   :vs/term_status #rdf/langString "accepted@en"})

(def LawfulnessUnkown
  "State of the lawfulness not being known"
  {:db/ident            :dpvo/LawfulnessUnkown,
   :dcterms/created     #xsd/date #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "State of the lawfulness not being known@en",
   :rdf/type            [:dpvo/Lawfulness
                         :owl/NamedIndividual
                         :dpvo/Status
                         :dpvo/Context
                         :dpvo/ComplianceStatus],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Lawfulness Unknown@en",
   :vs/term_status      #rdf/langString "accepted@en"})

(def LegalAgreement
  "A legally binding agreement"
  {:db/ident            :dpvo/LegalAgreement,
   :dcterms/created     #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Rob Brennan"}
                         {:xsd/string "Mark Lizar"}
                         {:xsd/string "Axel Polleres"}
                         {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "A legally binding agreement@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Legal Agreement@en",
   :rdfs/subClassOf     [:dpvo/OrganisationalMeasure
                         :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status      #rdf/langString "accepted@en"})

(def LegalBasis
  "The Legal basis used to justify processing of personal data"
  {:db/ident :dpvo/LegalBasis,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Axel Polleres"}
                     {:xsd/string "Javier Fernández"}],
   :dcterms/description
   #rdf/langString
    "The Legal basis used to justify processing of personal data@en",
   :dcterms/modified #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Legal basis (plural: legal bases) are defined by legislations and regulations, whose applicability is usually restricted to specific jurisdictions.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Legal Basis@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def LegalCompliance
  "Purposes associated with carrying out data processing to fulfill a legal or statutory obligation"
  {:db/ident :dpvo/LegalCompliance,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with carrying out data processing to fulfill a legal or statutory obligation@en",
   :dcterms/modified #xsd/date #inst "2022-11-09T00:00:00.000-05:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This purpose only refers to processing that is additionally required in order to fulfill the obligations and requirements associated with a law. For example, the use of consent would have its own separate purposes, with this purpose addressing a legal requirement for maintaining consent record (along with RecordManagement). This purpose will typically be used with Legal Obligation as the legal basis.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Legal Compliance@en",
   :rdfs/subClassOf [:dpvo/FulfilmentOfObligation :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def LegalEntity
  "A human or non-human 'thing' that constitutes as an entity and which is recognised and defined in law"
  {:db/ident :dpvo/LegalEntity,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "A human or non-human 'thing' that constitutes as an entity and which is recognised and defined in law@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Legal Entity@en",
   :rdfs/subClassOf :dpvo/Entity,
   :vs/term_status #rdf/langString "accepted@en"})

(def LegalObligation
  "Legal Obligation to conduct the specified processing"
  {:db/ident :dpvo/LegalObligation,
   :dcterms/created #xsd/date #inst "2021-04-07T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Legal Obligation to conduct the specified processing@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Legal Obligation@en",
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status #rdf/langString "accepted@en"})

(def LegitimateInterest
  "Legitimate Interests of a Party as justification for specified processing"
  {:db/ident :dpvo/LegitimateInterest,
   :dcterms/created #xsd/date #inst "2021-05-19T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Legitimate Interests of a Party as justification for specified processing@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Legitimate Interest@en",
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status #rdf/langString "accepted@en"})

(def LegitimateInterestAssessment
  "Indicates an assessment regarding the use of legitimate interest as a lawful basis by the data controller"
  {:db/ident :dpvo/LegitimateInterestAssessment,
   :dcterms/created #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Indicates an assessment regarding the use of legitimate interest as a lawful basis by the data controller@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Legitimate Interest Assessment@en",
   :rdfs/subClassOf [:dpvo/Assessment
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def LegitimateInterestOfController
  "Legitimate Interests of a Data Controller in conducting specified processing"
  {:db/ident :dpvo/LegitimateInterestOfController,
   :dcterms/created #xsd/date #inst "2021-05-19T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Legitimate Interests of a Data Controller in conducting specified processing@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Legitimate Interest of Controller@en",
   :rdfs/subClassOf [:dpvo/LegitimateInterest :dpvo/LegalBasis],
   :vs/term_status #rdf/langString "accepted@en"})

(def LegitimateInterestOfDataSubject
  "Legitimate Interests of the Data Subject in conducting specified processing"
  {:db/ident :dpvo/LegitimateInterestOfDataSubject,
   :dcterms/created #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #rdf/langString
    "Legitimate Interests of the Data Subject in conducting specified processing@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Legitimate Interest of Data Subject@en",
   :rdfs/subClassOf [:dpvo/LegitimateInterest :dpvo/LegalBasis],
   :vs/term_status #rdf/langString "accepted@en"})

(def LegitimateInterestOfThirdParty
  "Legitimate Interests of a Third Party in conducting specified processing"
  {:db/ident :dpvo/LegitimateInterestOfThirdParty,
   :dcterms/created #xsd/date #inst "2021-05-19T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Legitimate Interests of a Third Party in conducting specified processing@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Legitimate Interest of Third Party@en",
   :rdfs/subClassOf [:dpvo/LegitimateInterest :dpvo/LegalBasis],
   :vs/term_status #rdf/langString "accepted@en"})

(def Likelihood
  "The likelihood or probability or chance of something taking place or occuring"
  {:db/ident :dpvo/Likelihood,
   :dcterms/created #xsd/date #inst "2022-07-22T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "The likelihood or probability or chance of something taking place or occuring@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Likelihood can be expressed in a subjective manner, such as 'Unlikely', or in a quantitative manner such as \"Twice in a Day\" (frequency per period). The suggestion is to use quantitative values, or to associate them with subjective terms used so as to enable accurate interpretations and interoperability. See the concepts related to Frequency and Duration for possible uses as a combination to express Likelihood.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Likelihood@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def LocalEnvironmentScale
  "Geographic coverage spanning a specific environment within the locality"
  {:db/ident :dpvo/LocalEnvironmentScale,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Geographic coverage spanning a specific environment within the locality@en",
   :rdf/type [:dpvo/GeographicCoverage
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/Scale
              :dpvo/ProcessingContext],
   :rdfs/comment
   #rdf/langString
    "For example, geographic scale of an event take place in a specific building or room@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Local Environment Scale@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def LocalLocation
  "Location is local"
  {:db/ident            :dpvo/LocalLocation,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Location is local@en",
   :dcterms/modified    #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Local Location@en",
   :rdfs/subClassOf     [:dpvo/LocationLocality :dpvo/Location],
   :vs/term_status      #rdf/langString "modified@en"})

(def LocalityScale
  "Geographic coverage spanning a specific locality"
  {:db/ident :dpvo/LocalityScale,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Geographic coverage spanning a specific locality@en",
   :rdf/type [:dpvo/GeographicCoverage
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/Scale
              :dpvo/ProcessingContext],
   :rdfs/comment
   #rdf/langString
    "For example, geographic scale of a city or an area within a city@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Locality Scale@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def Location
  "A location is a position, site, or area where something is located"
  {:db/ident :dpvo/Location,
   :dcterms/created #xsd/date #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "A location is a position, site, or area where something is located@en",
   :rdf/type :owl/Class,
   :rdfs/comment #rdf/langString
                  "Location may be geographic, physical, or virtual.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Location@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def LocationFixture
  "The fixture of location refers to whether the location is fixed"
  {:db/ident :dpvo/LocationFixture,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "The fixture of location refers to whether the location is fixed@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Location Fixture@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def LocationLocality
  "Locality refers to whether the specified location is local within some context, e.g. for the user"
  {:db/ident :dpvo/LocationLocality,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Locality refers to whether the specified location is local within some context, e.g. for the user@en",
   :dcterms/modified #xsd/date #inst "2022-10-04T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Location Locality@en",
   :rdfs/subClassOf :dpvo/Location,
   :vs/term_status #rdf/langString "modified@en"})

(def LoggingPolicies
  "Policy for logging of information"
  {:db/ident :dpvo/LoggingPolicies,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Policy for logging of information@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Logging Policies@en",
   :rdfs/subClassOf [:dpvo/GovernanceProcedures
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def MaintainCreditCheckingDatabase
  "Purposes associated with maintaining a Credit Checking Database"
  {:db/ident :dpvo/MaintainCreditCheckingDatabase,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with maintaining a Credit Checking Database@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Maintain Credit Checking Database@en",
   :rdfs/subClassOf [:dpvo/CreditChecking
                     :dpvo/CustomerSolvencyMonitoring
                     :dpvo/Purpose
                     :dpvo/CustomerManagement],
   :vs/term_status #rdf/langString "accepted@en"})

(def MaintainCreditRatingDatabase
  "Purposes associated with maintaining a Credit Rating Database"
  {:db/ident :dpvo/MaintainCreditRatingDatabase,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with maintaining a Credit Rating Database@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Maintain Credit Rating Database@en",
   :rdfs/subClassOf [:dpvo/CreditChecking
                     :dpvo/CustomerSolvencyMonitoring
                     :dpvo/Purpose
                     :dpvo/CustomerManagement],
   :vs/term_status #rdf/langString "accepted@en"})

(def MaintainFraudDatabase
  "Purposes associated with maintaining a database related to identifying and identified fraud risks and fraud incidents"
  {:db/ident :dpvo/MaintainFraudDatabase,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with maintaining a database related to identifying and identified fraud risks and fraud incidents@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "MaintainFraudDatabase@en",
   :rdfs/subClassOf
   [:dpvo/FraudPreventionAndDetection :dpvo/EnforceSecurity :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def MakeAvailable
  "to transform or publish data to be used"
  {:db/ident :dpvo/MakeAvailable,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #rdf/langString
                         "to transform or publish data to be used@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Make Available@en",
   :rdfs/subClassOf [:dpvo/Disclose :dpvo/Processing],
   :vs/term_status #rdf/langString "accepted@en"})

(def Marketing
  "Purposes associated with conducting marketing in relation to organisation or products or services e.g. promoting, selling, and distributing"
  {:db/ident :dpvo/Marketing,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with conducting marketing in relation to organisation or products or services e.g. promoting, selling, and distributing@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Was commercial interest, changed to consider Marketing a separate Purpose category by itself@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Marketing@en",
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status #rdf/langString "accepted@en"})

(def Match
  "to combine, compare, or match data from different sources"
  {:db/ident :dpvo/Match,
   :dcterms/created #xsd/date #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "to combine, compare, or match data from different sources@en",
   :dcterms/source {:rdfa/uri
                    "https://ec.europa.eu/newsroom/article29/items/611236"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Match@en",
   :rdfs/subClassOf [:dpvo/Use :dpvo/Processing],
   :vs/term_status #rdf/langString "accepted@en"})

(def MaterialDamage
  "Impact that acts as or causes material damages"
  {:db/ident            :dpvo/MaterialDamage,
   :dcterms/created     #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Impact that acts as or causes material damages@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Material Damage@en",
   :rdfs/subClassOf     [:dpvo/Damage :dpvo/Consequence :dpvo/Impact],
   :vs/term_status      #rdf/langString "accepted@en"})

(def MediumDataVolume
  "Data volume that is considered medium i.e. neither large nor small within the context"
  {:db/ident :dpvo/MediumDataVolume,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString
    "Data volume that is considered medium i.e. neither large nor small within the context@en",
   :rdf/type [:dpvo/DataVolume
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/ProcessingContext
              :dpvo/Scale],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Medium Data Volume@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def MediumScaleOfDataSubjects
  "Scale of data subjects considered medium i.e. neither large nor small within the context"
  {:db/ident :dpvo/MediumScaleOfDataSubjects,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString
    "Scale of data subjects considered medium i.e. neither large nor small within the context@en",
   :rdf/type [:dpvo/DataSubjectScale
              :owl/NamedIndividual
              :dpvo/Scale
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Medium Scale Of Data Subjects@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def MediumScaleProcessing
  "Processing that takes place at medium scales (as specified by some criteria)"
  {:db/ident :dpvo/MediumScaleProcessing,
   :dcterms/created #xsd/date #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Processing that takes place at medium scales (as specified by some criteria)@en",
   :rdf/type [:dpvo/ProcessingScale
              :owl/NamedIndividual
              :dpvo/ProcessingContext
              :dpvo/Scale
              :dpvo/Context],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Medium Scale Processing@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def Member
  "Data subjects that are members of a group, organisation, or other collectives"
  {:db/ident :dpvo/Member,
   :dcterms/created #xsd/date #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P. Krog"}
                     {:xsd/string "Beatriz Esteves"}],
   :dcterms/description
   #rdf/langString
    "Data subjects that are members of a group, organisation, or other collectives@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Member@en",
   :rdfs/subClassOf
   [:dpvo/DataSubject :dpvo/NaturalPerson :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "accepted@en"})

(def MemberPartnerManagement
  "Purposes associated with maintaining a registry of shareholders, members, or partners for governance, administration, and management functions"
  {:db/ident :dpvo/MemberPartnerManagement,
   :dcterms/created #xsd/date #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "David Hickey"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with maintaining a registry of shareholders, members, or partners for governance, administration, and management functions@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Members and Partners Management@en",
   :rdfs/subClassOf [:dpvo/OrganisationGovernance :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def MentallyVulnerableDataSubject
  "Data subjects that are considered mentally vulnerable"
  {:db/ident :dpvo/MentallyVulnerableDataSubject,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #rdf/langString "Data subjects that are considered mentally vulnerable@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Mentally Vulnerable Data Subject@en",
   :rdfs/subClassOf [:dpvo/VulnerableDataSubject
                     :dpvo/DataSubject
                     :dpvo/NaturalPerson
                     :dpvo/LegalEntity
                     :dpvo/Entity],
   :vs/term_status #rdf/langString "accepted@en"})

(def MessageAuthenticationCodes
  "Use of cryptographic methods to authenticate messages"
  {:db/ident :dpvo/MessageAuthenticationCodes,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Use of cryptographic methods to authenticate messages@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Message Authentication Codes (MAC)@en",
   :rdfs/subClassOf [:dpvo/CryptographicAuthentication
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/CryptographicMethods
                     :dpvo/AuthenticationProtocols],
   :vs/term_status #rdf/langString "accepted@en"})

(def MobilePlatformSecurity
  "Security implemented over a mobile platform"
  {:db/ident :dpvo/MobilePlatformSecurity,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Security implemented over a mobile platform@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Mobile Platform Security@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Modify
  "to modify or change data"
  {:db/ident            :dpvo/Modify,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Georg P Krog"}],
   :dcterms/description #rdf/langString "to modify or change data@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Modify@en",
   :rdfs/subClassOf     [:dpvo/Alter :dpvo/Transform :dpvo/Processing],
   :vs/term_status      #rdf/langString "accepted@en"})

(def Monitor
  "to monitor data for some criteria"
  {:db/ident            :dpvo/Monitor,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Georg P Krog"}],
   :dcterms/description #rdf/langString "to monitor data for some criteria@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Monitor@en",
   :rdfs/subClassOf     [:dpvo/Consult :dpvo/Use :dpvo/Processing],
   :vs/term_status      #rdf/langString "accepted@en"})

(def MonitoringPolicies
  "Policy for monitoring (e.g. progress, performance)"
  {:db/ident :dpvo/MonitoringPolicies,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Policy for monitoring (e.g. progress, performance)@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Monitoring Policies@en",
   :rdfs/subClassOf [:dpvo/GovernanceProcedures
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def MonotonicCounterPseudonymisation
  "A simple pseudonymisation method where identifiers are substituted by a number chosen by a monotonic counter"
  {:db/ident :dpvo/MonotonicCounterPseudonymisation,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "A simple pseudonymisation method where identifiers are substituted by a number chosen by a monotonic counter@en",
   :dcterms/modified #xsd/date #inst "2022-10-13T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Monotonic Counter Pseudonymisation@en",
   :rdfs/subClassOf [:dpvo/Pseudonymisation
                     :dpvo/TechnicalMeasure
                     :dpvo/Deidentification
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/DataSanitisationTechnique],
   :vs/term_status #rdf/langString "modified@en"})

(def Move
  "to move data from one location to another including deleting the original copy"
  {:db/ident :dpvo/Move,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   #rdf/langString
    "to move data from one location to another including deleting the original copy@en",
   :dcterms/source {:rdfa/uri
                    "https://specialprivacy.ercim.eu/vocabs/processing"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Move@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/processing#Move"},
   :rdfs/subClassOf [:dpvo/Transfer :dpvo/Processing],
   :vs/term_status #rdf/langString "accepted@en"})

(def MultiFactorAuthentication
  "An authentication system that uses two or more methods to authenticate"
  {:db/ident :dpvo/MultiFactorAuthentication,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "An authentication system that uses two or more methods to authenticate@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Multi-Factor Authentication (MFA)@en",
   :rdfs/subClassOf [:dpvo/AuthenticationProtocols
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def MultiNationalScale
  "Geographic coverage spanning multiple nations"
  {:db/ident            :dpvo/MultiNationalScale,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Geographic coverage spanning multiple nations@en",
   :rdf/type            [:dpvo/GeographicCoverage
                         :owl/NamedIndividual
                         :dpvo/Context
                         :dpvo/Scale
                         :dpvo/ProcessingContext],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Multi National Scale@en",
   :vs/term_status      #rdf/langString "accepted@en"})

(def NDA
  "Non-disclosure Agreements e.g. preserving confidentiality of information"
  {:db/ident :dpvo/NDA,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Rob Brennan"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Mark Lizar"}],
   :dcterms/description
   #rdf/langString
    "Non-disclosure Agreements e.g. preserving confidentiality of information@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Non-Disclosure Agreement (NDA)@en",
   :rdfs/subClassOf [:dpvo/LegalAgreement
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def NationalAuthority
  "An authority tasked with overseeing legal compliance for a nation"
  {:db/ident :dpvo/NationalAuthority,
   :dcterms/created #xsd/date #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "An authority tasked with overseeing legal compliance for a nation@en",
   :dcterms/source {:rdfa/uri "http://purl.org/adms"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "National Authority@en",
   :rdfs/subClassOf [:dpvo/Authority
                     :dpvo/LegalEntity
                     :dpvo/Organisation
                     :dpvo/Entity
                     :dpvo/GovernmentalOrganisation],
   :vs/term_status #rdf/langString "accepted@en"})

(def NationalScale
  "Geographic coverage spanning a nation"
  {:db/ident            :dpvo/NationalScale,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Geographic coverage spanning a nation@en",
   :rdf/type            [:dpvo/GeographicCoverage
                         :owl/NamedIndividual
                         :dpvo/Context
                         :dpvo/Scale
                         :dpvo/ProcessingContext],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "National Scale@en",
   :vs/term_status      #rdf/langString "accepted@en"})

(def NaturalPerson
  "A human"
  {:db/ident            :dpvo/NaturalPerson,
   :dcterms/created     #xsd/date #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "A human@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Natural Person@en",
   :rdfs/subClassOf     :dpvo/Entity,
   :vs/term_status      #rdf/langString "accepted@en"})

(def NearlyGlobalScale
  "Geographic coverage nearly spanning the entire globe"
  {:db/ident :dpvo/NearlyGlobalScale,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Geographic coverage nearly spanning the entire globe@en",
   :rdf/type [:dpvo/GeographicCoverage
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/Scale
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Nearly Global Scale@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def Necessity
  "An indication of 'necessity' within a context"
  {:db/ident :dpvo/Necessity,
   :dcterms/created #xsd/date #inst "2022-02-12T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description #rdf/langString
                         "An indication of 'necessity' within a context@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Necessity can be used to express need, essentiality, requirement, or compulsion.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Necessity@en",
   :rdfs/subClassOf :dpvo/Context,
   :vs/term_status #rdf/langString "accepted@en"})

(def NetworkProxyRouting
  "Use of network routing using proxy"
  {:db/ident :dpvo/NetworkProxyRouting,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Use of network routing using proxy@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/data-protection-engineering"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Network Proxy Routing@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def NetworkSecurityProtocols
  "Security implemented at or over networks protocols"
  {:db/ident :dpvo/NetworkSecurityProtocols,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Security implemented at or over networks protocols@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Network Security Protocols@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def NonCitizen
  "Data subjects that are not citizens (for a jurisdiction)"
  {:db/ident :dpvo/NonCitizen,
   :dcterms/created #xsd/date #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Georg P. Krog"}],
   :dcterms/description
   #rdf/langString
    "Data subjects that are not citizens (for a jurisdiction)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Non-Citizen@en",
   :rdfs/subClassOf
   [:dpvo/DataSubject :dpvo/NaturalPerson :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "accepted@en"})

(def NonCommercialResearch
  "Purposes associated with conducting research in a non-commercial setting e.g. for a non-profit-organisation (NGO)"
  {:db/ident :dpvo/NonCommercialResearch,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Simon Steyskal"}
                     {:xsd/string "Elmar Kiesling"}
                     {:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Javier Fernandez"}
                     {:xsd/string "Axel Polleres"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with conducting research in a non-commercial setting e.g. for a non-profit-organisation (NGO)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Non-Commercial Research@en",
   :rdfs/subClassOf [:dpvo/ResearchAndDevelopment :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def NonCompliant
  "State of non-compliance where objectives have not been met, but have not been violated"
  {:db/ident :dpvo/NonCompliant,
   :dcterms/created #xsd/date #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "State of non-compliance where objectives have not been met, but have not been violated@en",
   :dcterms/modified #xsd/date #inst "2022-09-07T00:00:00.000-04:00",
   :rdf/type
   [:dpvo/ComplianceStatus :owl/NamedIndividual :dpvo/Status :dpvo/Context],
   :rdfs/comment
   #rdf/langString
    "Changed from not compliant for consistency in commonly used terms@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Non Compliant@en",
   :vs/term_status #rdf/langString "changed@en"})

(def NonConformant
  "State of being non-conformant"
  {:db/ident            :dpvo/NonConformant,
   :dcterms/created     #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "State of being non-conformant@en",
   :rdf/type            [:dpvo/ConformanceStatus
                         :owl/NamedIndividual
                         :dpvo/Context
                         :dpvo/Status],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "NonConformant@en",
   :vs/term_status      #rdf/langString "accepted@en"})

(def NonGovernmentalOrganisation
  "An organisation not part of or independent from the government"
  {:db/ident :dpvo/NonGovernmentalOrganisation,
   :dcterms/created #xsd/date #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "An organisation not part of or independent from the government@en",
   :dcterms/modified #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :dcterms/source {:rdfa/uri "http://purl.org/adms"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Non-Governmental Organisation@en",
   :rdfs/subClassOf [:dpvo/Organisation :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "modified@en"})

(def NonMaterialDamage
  "Impact that acts as or causes non-material damages"
  {:db/ident :dpvo/NonMaterialDamage,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Impact that acts as or causes non-material damages@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Non-Material Damage@en",
   :rdfs/subClassOf [:dpvo/Damage :dpvo/Consequence :dpvo/Impact],
   :vs/term_status #rdf/langString "accepted@en"})

(def NonPersonalData
  "Data that is not Personal Data"
  {:db/ident :dpvo/NonPersonalData,
   :dcterms/created #xsd/date #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Data that is not Personal Data@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "The term NonPersonalData is provided to distinguish between PersonalData and other data, e.g. for indicating which data is regulated by privacy laws. To specify personal data that has been anonymised, the concept AnonymisedData should be used.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Non-Personal Data@en",
   :rdfs/subClassOf :dpvo/Data,
   :vs/term_status #rdf/langString "accepted@en"})

(def NonProfitOrganisation
  "An organisation that does not aim to achieve profit as its primary goal"
  {:db/ident :dpvo/NonProfitOrganisation,
   :dcterms/created #xsd/date #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "An organisation that does not aim to achieve profit as its primary goal@en",
   :dcterms/modified #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :dcterms/source {:rdfa/uri "http://purl.org/adms"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Non-Profit Organisation@en",
   :rdfs/subClassOf [:dpvo/Organisation :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "modified@en"})

(def NonPublicDataSource
  "A source of data that is not publicly accessible or available"
  {:db/ident :dpvo/NonPublicDataSource,
   :dcterms/created #xsd/date #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Beatriz Esteves"}],
   :dcterms/description
   #rdf/langString
    "A source of data that is not publicly accessible or available@en",
   :rdf/type [:dpvo/DataSource
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Non-Public Data Source@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def NotRequired
  "Indication of neither being required nor optional i.e. not relevant or needed"
  {:db/ident :dpvo/NotRequired,
   :dcterms/created #xsd/date #inst "2022-02-15T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}],
   :dcterms/description
   #rdf/langString
    "Indication of neither being required nor optional i.e. not relevant or needed@en",
   :rdf/type [:owl/NamedIndividual :dpvo/Necessity :dpvo/Context],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Not Required@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def Notice
  "A notice is an artefact for providing information, choices, or controls"
  {:db/ident :dpvo/Notice,
   :dcterms/created #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "David Hickey"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString
    "A notice is an artefact for providing information, choices, or controls@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Notice@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Obligation
  "A rule describing an obligation for performing an activity"
  {:db/ident :dpvo/Obligation,
   :dcterms/created #xsd/date #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Beatriz Esteves"}],
   :dcterms/description
   #rdf/langString
    "A rule describing an obligation for performing an activity@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Obligation@en",
   :rdfs/subClassOf :dpvo/Rule,
   :vs/term_status #rdf/langString "accepted@en"})

(def Observe
  "to obtain data through observation"
  {:db/ident            :dpvo/Observe,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Georg P Krog"}],
   :dcterms/description #rdf/langString "to obtain data through observation@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Observe@en",
   :rdfs/subClassOf     [:dpvo/Obtain :dpvo/Processing],
   :vs/term_status      #rdf/langString "accepted@en"})

(def ObservedPersonalData
  "Personal Data that has been collected through observation of the Data Subject(s)"
  {:db/ident :dpvo/ObservedPersonalData,
   :dcterms/created #xsd/date #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #rdf/langString
    "Personal Data that has been collected through observation of the Data Subject(s)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Observed Personal Data@en",
   :rdfs/subClassOf [:dpvo/CollectedPersonalData :dpvo/Data :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Obtain
  "to solicit or gather data from someone"
  {:db/ident :dpvo/Obtain,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #rdf/langString
                         "to solicit or gather data from someone@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Obtain@en",
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status #rdf/langString "accepted@en"})

(def OfficialAuthorityOfController
  "Processing necessary or authorised through the official authority granted to or vested in the Data Controller"
  {:db/ident :dpvo/OfficialAuthorityOfController,
   :dcterms/created #xsd/date #inst "2021-05-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Processing necessary or authorised through the official authority granted to or vested in the Data Controller@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Official Authority of Controller@en",
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status #rdf/langString "accepted@en"})

(def OftenFrequency
  "Frequency where occurences are often or frequent, but not continous"
  {:db/ident :dpvo/OftenFrequency,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Frequency where occurences are often or frequent, but not continous@en",
   :dcterms/modified #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Often Frequency@en",
   :rdfs/subClassOf [:dpvo/Frequency :dpvo/Context],
   :vs/term_status #rdf/langString "modified@en"})

(def OperatingSystemSecurity
  "Security implemented at or through operating systems"
  {:db/ident :dpvo/OperatingSystemSecurity,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Security implemented at or through operating systems@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Operating System Security@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def OptimisationForConsumer
  "Purposes associated with optimisation of activities and services for consumer or user"
  {:db/ident :dpvo/OptimisationForConsumer,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Javier Fernandez"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Simon Steyskal"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with optimisation of activities and services for consumer or user@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "The term optmisation here refers to the efficiency of the service in terms of technical provision (or similar means) with benefits for everybody. Personalisation implies making changes that benefit the current user or persona.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Optimisation for Consumer@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/purposes#Custom"},
   :rdfs/subClassOf
   [:dpvo/ServiceOptimisation :dpvo/ServiceProvision :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def OptimisationForController
  "Purposes associated with optimisation of activities and services for provider or controller"
  {:db/ident :dpvo/OptimisationForController,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Javier Fernandez"}
                     {:xsd/string "Elmar Kiesling"}
                     {:xsd/string "Simon Steyskal"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with optimisation of activities and services for provider or controller@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Optimisation for Controller@en",
   :rdfs/subClassOf
   [:dpvo/ServiceOptimisation :dpvo/ServiceProvision :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def OptimiseUserInterface
  "Purposes associated with optimisation of interfaces presented to the user"
  {:db/ident :dpvo/OptimiseUserInterface,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Simon Steyskal"}
                     {:xsd/string "Elmar Kiesling"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Javier Fernandez"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with optimisation of interfaces presented to the user@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Optimise User Interface@en",
   :rdfs/subClassOf [:dpvo/OptimisationForConsumer
                     :dpvo/ServiceProvision
                     :dpvo/Purpose
                     :dpvo/ServiceOptimisation],
   :vs/term_status #rdf/langString "accepted@en"})

(def Optional
  "Indication of 'optional' or 'voluntary'"
  {:db/ident            :dpvo/Optional,
   :dcterms/created     #xsd/date #inst "2022-02-14T00:00:00.000-05:00",
   :dcterms/creator     [{:xsd/string "Julian Flake"}
                         {:xsd/string "Beatriz Esteves"}
                         {:xsd/string "Paul Ryan"}
                         {:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Georg P Krog"}],
   :dcterms/description #rdf/langString
                         "Indication of 'optional' or 'voluntary'@en",
   :rdf/type            [:dpvo/Necessity :owl/NamedIndividual :dpvo/Context],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Optional@en",
   :vs/term_status      #rdf/langString "accepted@en"})

(def Organisation
  "A general term reflecting a company or a business or a group acting as a unit"
  {:db/ident :dpvo/Organisation,
   :dcterms/created #xsd/date #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "A general term reflecting a company or a business or a group acting as a unit@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Organisation@en",
   :rdfs/subClassOf [:dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "accepted@en"})

(def OrganisationComplianceManagement
  "Purposes associated with managing compliance for organisation in relation to internal policies"
  {:db/ident :dpvo/OrganisationComplianceManagement,
   :dcterms/created #xsd/date #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "David Hickey"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with managing compliance for organisation in relation to internal policies@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Note that this concept relates to internal organisational compliance. The concept LegalCompliance should be used for external legal or regulatory compliance.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Organisation Compliance Management@en",
   :rdfs/subClassOf [:dpvo/OrganisationGovernance :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def OrganisationGovernance
  "Purposes associated with conducting activities and functions for governance of an organisation"
  {:db/ident :dpvo/OrganisationGovernance,
   :dcterms/created #xsd/date #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "David Hickey"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with conducting activities and functions for governance of an organisation@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Organisation Governance@en",
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status #rdf/langString "accepted@en"})

(def OrganisationRiskManagement
  "Purposes associated with managing risk for organisation's activities"
  {:db/ident :dpvo/OrganisationRiskManagement,
   :dcterms/created #xsd/date #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "David Hickey"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with managing risk for organisation's activities@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Organisation Risk Management@en",
   :rdfs/subClassOf [:dpvo/OrganisationGovernance :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def OrganisationalMeasure
  "Organisational measures required/followed when processing data of the declared category"
  {:db/ident :dpvo/OrganisationalMeasure,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Mark Lizar"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Rob Brennan"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Organisational measures required/followed when processing data of the declared category@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Organisational Measure@en",
   :rdfs/subClassOf :dpvo/TechnicalOrganisationalMeasure,
   :vs/term_status #rdf/langString "accepted@en"})

(def OrganisationalUnit
  "Entity within an organisation that does not constitute as a separate legal entity"
  {:db/ident :dpvo/OrganisationalUnit,
   :dcterms/created #xsd/date #inst "2022-03-23T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Entity within an organisation that does not constitute as a separate legal entity@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Organisational Unit@en",
   :rdfs/subClassOf :dpvo/Entity,
   :vs/term_status #rdf/langString "accepted@en"})

(def Organise
  "to organize data for arranging or classifying"
  {:db/ident :dpvo/Organise,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #rdf/langString
                         "to organize data for arranging or classifying@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Organise@en",
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status #rdf/langString "accepted@en"})

(def PIA
  "Carrying out an impact assessment regarding privacy risks"
  {:db/ident :dpvo/PIA,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Carrying out an impact assessment regarding privacy risks@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Privacy Impact Assessment@en",
   :rdfs/subClassOf [:dpvo/ImpactAssessment
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/Assessment],
   :vs/term_status #rdf/langString "accepted@en"})

(def ParentOfDataSubject
  "Parent(s) of data subjects such as children"
  {:db/ident            :dpvo/ParentOfDataSubject,
   :dcterms/created     #xsd/date #inst "2022-08-03T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Georg P Krog"},
   :dcterms/description #rdf/langString
                         "Parent(s) of data subjects such as children@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Parent(s) of Data Subject@en",
   :rdfs/subClassOf     [:dpvo/DataSubject
                         :dpvo/NaturalPerson
                         :dpvo/LegalEntity
                         :dpvo/Entity],
   :vs/term_status      #rdf/langString "accepted@en"})

(def PartiallyAutomatedProcessing
  "Processing that is partially automated or semi-automated"
  {:db/ident :dpvo/PartiallyAutomatedProcessing,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Processing that is partially automated or semi-automated@en",
   :rdf/type [:dpvo/AutomationOfProcessing
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/comment
   #rdf/langString
    "For example, a series of distinct processing operations that are automated individually or have some human involvement@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Partially Automated Processing@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def PartiallyCompliant
  "State of partially being compliant i.e. only some objectives have been met, and others have not been in violation"
  {:db/ident :dpvo/PartiallyCompliant,
   :dcterms/created #xsd/date #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "State of partially being compliant i.e. only some objectives have been met, and others have not been in violation@en",
   :rdf/type
   [:dpvo/ComplianceStatus :owl/NamedIndividual :dpvo/Status :dpvo/Context],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Partially Compliant@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def Participant
  "Data subjects that participate in some context such as volunteers in a function"
  {:db/ident :dpvo/Participant,
   :dcterms/created #xsd/date #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Georg P. Krog"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString
    "Data subjects that participate in some context such as volunteers in a function@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Participant@en",
   :rdfs/subClassOf
   [:dpvo/DataSubject :dpvo/NaturalPerson :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "accepted@en"})

(def PassiveRight
  "The right(s) applicable, provided, or expected that are always (passively) applicable"
  {:db/ident :dpvo/PassiveRight,
   :dcterms/created #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Harshvardhan J Pandit"}],
   :dcterms/description
   #rdf/langString
    "The right(s) applicable, provided, or expected that are always (passively) applicable@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Passive rights do not require the entity to request or exercise them. They are considered to be always applicable. For example, the Right to Privacy (in EU) does not require an exercise for it to be fulfilled.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Passive Right@en",
   :rdfs/subClassOf :dpvo/Right,
   :vs/term_status #rdf/langString "accepted@en"})

(def PasswordAuthentication
  "Use of passwords to perform authentication"
  {:db/ident :dpvo/PasswordAuthentication,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Use of passwords to perform authentication@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Password Authentication@en",
   :rdfs/subClassOf [:dpvo/AuthenticationProtocols
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Patient
  "Data subjects that receive medican attention, treatment, care, advice, or other health related services"
  {:db/ident :dpvo/Patient,
   :dcterms/created #xsd/date #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Georg P. Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Data subjects that receive medican attention, treatment, care, advice, or other health related services@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Patient@en",
   :rdfs/subClassOf
   [:dpvo/DataSubject :dpvo/NaturalPerson :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "accepted@en"})

(def PaymentManagement
  "Purposes associated with processing and managing payment in relation to service, including invoicing and records"
  {:db/ident :dpvo/PaymentManagement,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with processing and managing payment in relation to service, including invoicing and records@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Payment Management@en",
   :rdfs/subClassOf [:dpvo/ServiceProvision :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def PenetrationTestingMethods
  "Use of penetration testing to identity weaknessess and vulnerabilities through simulations"
  {:db/ident :dpvo/PenetrationTestingMethods,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Use of penetration testing to identity weaknessess and vulnerabilities through simulations@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Penetration Testing Methods@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Permission
  "A rule describing a permission to perform an activity"
  {:db/ident :dpvo/Permission,
   :dcterms/created #xsd/date #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString "A rule describing a permission to perform an activity@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Permission@en",
   :rdfs/subClassOf :dpvo/Rule,
   :vs/term_status #rdf/langString "accepted@en"})

(def PersonalData
  "Data directly or indirectly associated or related to an individual."
  {:db/ident :dpvo/PersonalData,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan Pandit"},
   :dcterms/description
   #rdf/langString
    "Data directly or indirectly associated or related to an individual.@en",
   :dcterms/modified #xsd/date #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_1/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This definition of personal data encompasses the concepts used in GDPR Art.4-1 for 'personal data' and ISO/IEC 2700 for 'personally identifiable information (PII)'.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Personal Data@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/langs/usage-policy#AnyData"},
   :rdfs/subClassOf :dpvo/Data,
   :vs/term_status #rdf/langString "accepted@en"})

(def PersonalDataHandling
  "A high-level Class to describe 'data handling'. This can consist of personal data being processed for a purpose, involving entities, using technical and organisational measures, applicable risks, rights, and legal basis."
  {:db/ident :dpvo/PersonalDataHandling,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Javier Fernández"}
                     {:xsd/string "Axel Polleres"}],
   :dcterms/description
   #rdf/langString
    "A high-level Class to describe 'data handling'. This can consist of personal data being processed for a purpose, involving entities, using technical and organisational measures, applicable risks, rights, and legal basis.@en",
   :dcterms/modified #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Personal Data Handling@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def Personalisation
  "Purposes associated with creating and providing customisation based on attributes and/or needs of person(s) or context(s)."
  {:db/ident :dpvo/Personalisation,
   :dcterms/created #xsd/date #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Purposes associated with creating and providing customisation based on attributes and/or needs of person(s) or context(s).@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This term is a blanket purpose category for indicating personalisation of some other purpose, e.g. by creating a subclass of the other concept and Personalisation@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Personalisation@en",
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status #rdf/langString "accepted@en"})

(def PersonalisedAdvertising
  "Purposes associated with creating and providing personalised advertising"
  {:db/ident :dpvo/PersonalisedAdvertising,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with creating and providing personalised advertising@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Personalised Advertising@en",
   :rdfs/subClassOf
   [:dpvo/Personalisation :dpvo/Advertising :dpvo/Purpose :dpvo/Marketing],
   :vs/term_status #rdf/langString "accepted@en"})

(def PersonalisedBenefits
  "Purposes associated with creating and providing personalised benefits for a service"
  {:db/ident :dpvo/PersonalisedBenefits,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Simon Steyskal"}
                     {:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Javier Fernandez"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with creating and providing personalised benefits for a service@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Personalised Benefits@en",
   :rdfs/subClassOf [:dpvo/ServicePersonalisation
                     :dpvo/ServiceProvision
                     :dpvo/Purpose
                     :dpvo/Personalisation],
   :vs/term_status #rdf/langString "accepted@en"})

(def PersonnelHiring
  "Purposes associated with management and execution of hiring processes of personnel"
  {:db/ident :dpvo/PersonnelHiring,
   :dcterms/created #xsd/date #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Purposes associated with management and execution of hiring processes of personnel@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Personnel Hiring@en",
   :rdfs/subClassOf
   [:dpvo/PersonnelManagement :dpvo/HumanResourceManagement :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def PersonnelManagement
  "Purposes associated with management of personnel associated with the organisation e.g. evaluation and management of employees and intermediaries"
  {:db/ident :dpvo/PersonnelManagement,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with management of personnel associated with the organisation e.g. evaluation and management of employees and intermediaries@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Personnel Management@en",
   :rdfs/subClassOf [:dpvo/HumanResourceManagement :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def PersonnelPayment
  "Purposes associated with management and execution of payment of personnel"
  {:db/ident :dpvo/PersonnelPayment,
   :dcterms/created #xsd/date #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Purposes associated with management and execution of payment of personnel@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Personnel Payment@en",
   :rdfs/subClassOf
   [:dpvo/PersonnelManagement :dpvo/HumanResourceManagement :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def PhysicalAccessControlMethod
  "Access control applied for physical access e.g. premises or equipement"
  {:db/ident :dpvo/PhysicalAccessControlMethod,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #rdf/langString
    "Access control applied for physical access e.g. premises or equipement@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Physical Access Control Method@en",
   :rdfs/subClassOf [:dpvo/AccessControlMethod
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Policy
  "A guidance document outlining any of: procedures, plans, principles, decisions, intent, or protocols."
  {:db/ident :dpvo/Policy,
   :dcterms/created #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "David Hickey"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "A guidance document outlining any of: procedures, plans, principles, decisions, intent, or protocols.@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Policy@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def PostQuantumCryptography
  "Use of algorithms that are intended to be secure against cryptanalytic attack by a quantum computer"
  {:db/ident :dpvo/PostQuantumCryptography,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Use of algorithms that are intended to be secure against cryptanalytic attack by a quantum computer@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Post-Quantum Cryptography@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def PrimaryImportance
  "Indication of 'primary' or 'main' or 'core' importance"
  {:db/ident :dpvo/PrimaryImportance,
   :dcterms/created #xsd/date #inst "2022-02-10T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Beatriz Esteves"}],
   :dcterms/description
   #rdf/langString "Indication of 'primary' or 'main' or 'core' importance@en",
   :rdf/type [:dpvo/Importance :owl/NamedIndividual :dpvo/Context],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Primary Importance@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def PrivacyByDefault
  "Practices regarding selecting appropriate data protection and privacy measures as the 'default' in an activity or service"
  {:db/ident :dpvo/PrivacyByDefault,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Axel Polleres"}
                     {:xsd/string "Mark Lizar"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Rob Brennan"}],
   :dcterms/description
   #rdf/langString
    "Practices regarding selecting appropriate data protection and privacy measures as the 'default' in an activity or service@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Privacy by Default@en",
   :rdfs/subClassOf [:dpvo/GuidelinesPrinciple
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def PrivacyByDesign
  "Practices regarding incorporating data protection and privacy in the design of information and services"
  {:db/ident :dpvo/PrivacyByDesign,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Mark Lizar"}
                     {:xsd/string "Rob Brennan"}],
   :dcterms/description
   #rdf/langString
    "Practices regarding incorporating data protection and privacy in the design of information and services@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Privacy by Design@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def PrivacyNotice
  "Represents a notice or document outlining information regarding privacy"
  {:db/ident :dpvo/PrivacyNotice,
   :dcterms/created #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "David Hickey"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString
    "Represents a notice or document outlining information regarding privacy@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Privacy Notice@en",
   :rdfs/subClassOf [:dpvo/Notice
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def PrivacyPreservingProtocol
  "Use of protocols designed with the intention of provided additional guarentees regarding privacy"
  {:db/ident :dpvo/PrivacyPreservingProtocol,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Use of protocols designed with the intention of provided additional guarentees regarding privacy@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Privacy Preserving Protocol@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def PrivateInformationRetrieval
  "Use of cryptographic methods to retrieve a record from a system without revealing which record is retrieved"
  {:db/ident :dpvo/PrivateInformationRetrieval,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Use of cryptographic methods to retrieve a record from a system without revealing which record is retrieved@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/data-protection-engineering"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Private Information Retrieval@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def PrivateLocation
  "Location that is not or cannot be accessed by the public and is controlled as a private space"
  {:db/ident :dpvo/PrivateLocation,
   :dcterms/created #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Location that is not or cannot be accessed by the public and is controlled as a private space@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Private Location@en",
   :rdfs/subClassOf [:dpvo/LocalLocation :dpvo/LocationLocality :dpvo/Location],
   :vs/term_status #rdf/langString "accepted@en"})

(def Processing
  "The processing performed on personal data"
  {:db/ident :dpvo/Processing,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Axel Polleres"}
                     {:xsd/string "Javier Fernández"}],
   :dcterms/description #rdf/langString
                         "The processing performed on personal data@en",
   :dcterms/modified #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source {:rdfa/uri "https://specialprivacy.ercim.eu/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Processing@en",
   :rdfs/seeAlso
   {:rdfa/uri
    "https://specialprivacy.ercim.eu/langs/usage-policy#AnyProcessing"},
   :vs/term_status #rdf/langString "accepted@en"})

(def ProcessingContext
  "Context or conditions within which processing takes place"
  {:db/ident :dpvo/ProcessingContext,
   :dcterms/created #xsd/date #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Context or conditions within which processing takes place@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Processing Context@en",
   :rdfs/subClassOf :dpvo/Context,
   :vs/term_status #rdf/langString "accepted@en"})

(def ProcessingScale
  "Scale of Processing"
  {:db/ident :dpvo/ProcessingScale,
   :dcterms/created #xsd/date #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Piero Bonatti"}],
   :dcterms/description #rdf/langString "Scale of Processing@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "The exact definition of what constitutes \"scale\" depends on use of jurisdictional, domain-specific, or other forms of externally defined criterias. Where possible, this should be reflected by extending the scales provided with the appropriate context.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Processing Scale@en",
   :rdfs/subClassOf [:dpvo/Scale :dpvo/Context :dpvo/ProcessingContext],
   :vs/term_status #rdf/langString "accepted@en"})

(def ProfessionalTraining
  "Training methods that are intended to provide professional knowledge and expertise"
  {:db/ident :dpvo/ProfessionalTraining,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Training methods that are intended to provide professional knowledge and expertise@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Professional Training@en",
   :rdfs/subClassOf [:dpvo/StaffTraining
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Profiling
  "to create a profile that describes or represents a person"
  {:db/ident :dpvo/Profiling,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   #rdf/langString
    "to create a profile that describes or represents a person@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Profiling@en",
   :rdfs/subClassOf [:dpvo/Use :dpvo/Processing],
   :vs/term_status #rdf/langString "accepted@en"})

(def Prohibition
  "A rule describing a prohibition to perform an activity"
  {:db/ident :dpvo/Prohibition,
   :dcterms/created #xsd/date #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString "A rule describing a prohibition to perform an activity@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Prohibition@en",
   :rdfs/subClassOf :dpvo/Rule,
   :vs/term_status #rdf/langString "accepted@en"})

(def ProvideEventRecommendations
  "Purposes associated with creating and providing personalised recommendations for events"
  {:db/ident :dpvo/ProvideEventRecommendations,
   :dcterms/created #xsd/date #inst "2019-11-26T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Rudy Jacob"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with creating and providing personalised recommendations for events@en",
   :dcterms/modified #xsd/date #inst "2022-10-14T00:00:00.000-04:00",
   :dcterms/source {:rdfa/uri "https://specialprivacy.ercim.eu/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Provide Event Recommendations@en",
   :rdfs/subClassOf [:dpvo/ProvidePersonalisedRecommendations
                     :dpvo/ServicePersonalisation
                     :dpvo/ServiceProvision
                     :dpvo/Purpose
                     :dpvo/Personalisation],
   :vs/term_status #rdf/langString "accepted@en"})

(def ProvidePersonalisedRecommendations
  "Purposes associated with creating and providing personalised recommendations"
  {:db/ident :dpvo/ProvidePersonalisedRecommendations,
   :dcterms/created #xsd/date #inst "2019-11-26T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Rudy Jacob"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with creating and providing personalised recommendations@en",
   :dcterms/modified #xsd/date #inst "2022-10-14T00:00:00.000-04:00",
   :dcterms/source {:rdfa/uri "https://specialprivacy.ercim.eu/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Provide Personalised Recommendations@en",
   :rdfs/subClassOf [:dpvo/ServicePersonalisation
                     :dpvo/ServiceProvision
                     :dpvo/Purpose
                     :dpvo/Personalisation],
   :vs/term_status #rdf/langString "accepted@en"})

(def ProvideProductRecommendations
  "Purposes associated with creating and providing product recommendations e.g. suggest similar products"
  {:db/ident :dpvo/ProvideProductRecommendations,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Axel Polleres"}
                     {:xsd/string "Javier Fernandez"}
                     {:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Simon Steyskal"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Elmar Kiesling"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with creating and providing product recommendations e.g. suggest similar products@en",
   :dcterms/modified #xsd/date #inst "2022-10-14T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Provide Product Recommendations@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/purposes#Marketing"},
   :rdfs/subClassOf [:dpvo/ProvidePersonalisedRecommendations
                     :dpvo/ServicePersonalisation
                     :dpvo/ServiceProvision
                     :dpvo/Purpose
                     :dpvo/Personalisation],
   :vs/term_status #rdf/langString "accepted@en"})

(def Pseudonymisation
  "Pseudonymisation means the processing of personal data in such a manner that the personal data can no longer be attributed to a specific data subject without the use of additional information, provided that such additional information is kept separately and is subject to technical and organisational measures to ensure that the personal data are not attributed to an identified or identifiable natural person;"
  {:db/ident :dpvo/Pseudonymisation,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Rob Brennan"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Mark Lizar"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Pseudonymisation means the processing of personal data in such a manner that the personal data can no longer be attributed to a specific data subject without the use of additional information, provided that such additional information is kept separately and is subject to technical and organisational measures to ensure that the personal data are not attributed to an identified or identifiable natural person;@en",
   :dcterms/modified #xsd/date #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_5/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Pseudonymisation@en",
   :rdfs/subClassOf [:dpvo/Deidentification
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/DataSanitisationTechnique],
   :vs/term_status #rdf/langString "modified@en"})

(def Pseudonymise
  "to replace personal identifiable information by artificial identifiers"
  {:db/ident :dpvo/Pseudonymise,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "2022-10-14"},
   :dcterms/description
   #rdf/langString
    "to replace personal identifiable information by artificial identifiers@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Pseudonymise@en",
   :rdfs/subClassOf [:dpvo/Transform :dpvo/Processing],
   :vs/term_status #rdf/langString "modified@en"})

(def PseudonymisedData
  "Personal Data that has undergone a pseudonymisation process or a partial (incomplete) anonymisation process such that it is still considered Personal Data"
  {:db/ident :dpvo/PseudonymisedData,
   :dcterms/created #xsd/date #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Personal Data that has undergone a pseudonymisation process or a partial (incomplete) anonymisation process such that it is still considered Personal Data@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Pseudonymised Data@en",
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo/Data],
   :vs/term_status #rdf/langString "accepted@en"})

(def PublicDataSource
  "A source of data that is publicly accessible or available"
  {:db/ident :dpvo/PublicDataSource,
   :dcterms/created #xsd/date #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString
    "A source of data that is publicly accessible or available@en",
   :rdf/type [:owl/NamedIndividual
              :dpvo/DataSource
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/comment
   #rdf/langString
    "The term 'Public' is used here in a broad sense. Actual consideration of what is 'Public Data' can vary based on several contextual or jurisdictional factors such as  definition of open, methods of access, permissions and licenses.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Public Data Source@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def PublicInterest
  "Processing is necessary or beneficial for interest of the public or society at large"
  {:db/ident :dpvo/PublicInterest,
   :dcterms/created #xsd/date #inst "2021-04-21T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Processing is necessary or beneficial for interest of the public or society at large@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Public Interest@en",
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status #rdf/langString "accepted@en"})

(def PublicLocation
  "Location that is or can be accessed by the public"
  {:db/ident            :dpvo/PublicLocation,
   :dcterms/created     #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Georg P Krog"},
   :dcterms/description #rdf/langString
                         "Location that is or can be accessed by the public@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Public Location@en",
   :rdfs/subClassOf     [:dpvo/LocalLocation
                         :dpvo/LocationLocality
                         :dpvo/Location],
   :vs/term_status      #rdf/langString "accepted@en"})

(def PublicRelations
  "Purposes associated with managing and conducting public relations processes, including creating goodwill for the organisation"
  {:db/ident :dpvo/PublicRelations,
   :dcterms/created #xsd/date #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "David Hickey"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with managing and conducting public relations processes, including creating goodwill for the organisation@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Public Relations@en",
   :rdfs/subClassOf [:dpvo/Marketing :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def Purpose
  "The purpose of processing personal data"
  {:db/ident :dpvo/Purpose,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Javier Fernández"}
                     {:xsd/string "Axel Polleres"}],
   :dcterms/description #rdf/langString
                         "The purpose of processing personal data@en",
   :dcterms/modified #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source {:rdfa/uri "https://specialprivacy.ercim.eu/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Purpose@en",
   :rdfs/seeAlso
   {:rdfa/uri "https://specialprivacy.ercim.eu/langs/usage-policy#AnyPurpose"},
   :vann/example {:rdfa/uri "https://w3id.org/dpv/examples#E0004"},
   :vs/term_status #rdf/langString "accepted@en"})

(def QuantumCryptography
  "Cryptographic methods that utilise quantum mechanical properties to perform cryptographic tasks"
  {:db/ident :dpvo/QuantumCryptography,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Cryptographic methods that utilise quantum mechanical properties to perform cryptographic tasks@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Quantum Cryptography@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Query
  "to query or make enquiries over data"
  {:db/ident            :dpvo/Query,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "to query or make enquiries over data@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Query@en",
   :rdfs/subClassOf     [:dpvo/Consult :dpvo/Use :dpvo/Processing],
   :vs/term_status      #rdf/langString "accepted@en"})

(def RNGPseudonymisation
  "A pseudonymisation method where identifiers are substituted by a number chosen by a Random Number Generator (RNG)"
  {:db/ident :dpvo/RNGPseudonymisation,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "A pseudonymisation method where identifiers are substituted by a number chosen by a Random Number Generator (RNG)@en",
   :dcterms/modified #xsd/date #inst "2022-10-13T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "RNG Pseudonymisation@en",
   :rdfs/subClassOf [:dpvo/Pseudonymisation
                     :dpvo/TechnicalMeasure
                     :dpvo/Deidentification
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/DataSanitisationTechnique],
   :vs/term_status #rdf/langString "modified@en"})

(def RandomLocation
  "Location that is random or unknown"
  {:db/ident            :dpvo/RandomLocation,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Location that is random or unknown@en",
   :dcterms/modified    #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type            [:dpvo/LocationFixture :owl/NamedIndividual],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Random Location@en",
   :vs/term_status      #rdf/langString "modified@en"})

(def Recipient
  "Entities that receive personal data"
  {:db/ident :dpvo/Recipient,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Axel Polleres"}
                     {:xsd/string "Javier Fernández"}],
   :dcterms/description #rdf/langString
                         "Entities that receive personal data@en",
   :dcterms/modified #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source
   [{:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_9/oj"}
    {:rdfa/uri "https://specialprivacy.ercim.eu/"}],
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "A recipient of personal data can be used to indicate any entity that receives personal data. This can be a Third Party, Processor (GDPR), or even a Controller.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Recipient@en",
   :rdfs/seeAlso
   {:rdfa/uri
    "https://specialprivacy.ercim.eu/langs/usage-policy#AnyRecipient"},
   :rdfs/subClassOf [:dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "accepted@en"})

(def Record
  "to make a record (especially media)"
  {:db/ident :dpvo/Record,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #rdf/langString
                         "to make a record (especially media)@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Record@en",
   :rdfs/subClassOf [:dpvo/Obtain :dpvo/Processing],
   :vs/term_status #rdf/langString "accepted@en"})

(def RecordManagement
  "Purposes associated with manage creation, storage, and use of records relevant to operations, events, and processes e.g. to store logs or access requests"
  {:db/ident :dpvo/RecordManagement,
   :dcterms/created #xsd/date #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "David Hickey"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with manage creation, storage, and use of records relevant to operations, events, and processes e.g. to store logs or access requests@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This purpose relates specifiaclly for record creation and management. This can be combined or used along with other purposes to express intentions such as records for legal compliance or vendor payments.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Record Management@en",
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status #rdf/langString "accepted@en"})

(def RecordsOfActivities
  "Records of activities within some context such as maintainence tasks or governance functions"
  {:db/ident :dpvo/RecordsOfActivities,
   :dcterms/created #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Records of activities within some context such as maintainence tasks or governance functions@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Records of Activities@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Region
  "A region is an area or site that is considered a location"
  {:db/ident :dpvo/Region,
   :dcterms/created #xsd/date #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "A region is an area or site that is considered a location@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Region@en",
   :rdfs/subClassOf :dpvo/Location,
   :vs/term_status #rdf/langString "accepted@en"})

(def RegionalAuthority
  "An authority tasked with overseeing legal compliance for a region"
  {:db/ident :dpvo/RegionalAuthority,
   :dcterms/created #xsd/date #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "An authority tasked with overseeing legal compliance for a region@en",
   :dcterms/source {:rdfa/uri "http://purl.org/adms"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Regional Authority@en",
   :rdfs/subClassOf [:dpvo/Authority
                     :dpvo/LegalEntity
                     :dpvo/Organisation
                     :dpvo/Entity
                     :dpvo/GovernmentalOrganisation],
   :vs/term_status #rdf/langString "accepted@en"})

(def RegionalScale
  "Geographic coverage spanning a specific region or regions"
  {:db/ident :dpvo/RegionalScale,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Geographic coverage spanning a specific region or regions@en",
   :rdf/type [:dpvo/GeographicCoverage
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/Scale
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Regional Scale@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def RegisterOfProcessingActivities
  "A ROPA is a document maintained by Data Controllers detailing processing activities carried out under their responsibility"
  {:db/ident :dpvo/RegisterOfProcessingActivities,
   :dcterms/created #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString
    "A ROPA is a document maintained by Data Controllers detailing processing activities carried out under their responsibility@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Tied to compliance processes and documents, decide how to specify those@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Register of Processing Activities@en",
   :rdfs/subClassOf [:dpvo/DataProcessingRecord
                     :dpvo/RecordsOfActivities
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def RegularityOfRecertification
  "Policy regarding repetition or renewal of existing certification(s)"
  {:db/ident :dpvo/RegularityOfRecertification,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Rob Brennan"}
                     {:xsd/string "Mark Lizar"}],
   :dcterms/description
   #rdf/langString
    "Policy regarding repetition or renewal of existing certification(s)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Regularity of Re-certification@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def RemoteLocation
  "Location is remote i.e. not local"
  {:db/ident            :dpvo/RemoteLocation,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Location is remote i.e. not local@en",
   :dcterms/modified    #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Remote Location@en",
   :rdfs/subClassOf     [:dpvo/LocationLocality :dpvo/Location],
   :vs/term_status      #rdf/langString "modified@en"})

(def Remove
  "to destruct or erase data"
  {:db/ident :dpvo/Remove,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #rdf/langString "to destruct or erase data@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Remove@en",
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status #rdf/langString "accepted@en"})

(def RenewedConsentGiven
  "The state where a previously given consent has been 'renewed' or 'refreshed' or 'reaffirmed' to form a new instance of given consent"
  {:db/ident :dpvo/RenewedConsentGiven,
   :dcterms/created #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "The state where a previously given consent has been 'renewed' or 'refreshed' or 'reaffirmed' to form a new instance of given consent@en",
   :dcterms/source {:rdfa/uri "https://w3id.org/GConsent"},
   :rdf/type [:owl/NamedIndividual
              :dpvo/ConsentStatusValidForProcessing
              :dpvo/Context
              :dpvo/Status
              :dpvo/ConsentStatus],
   :rdfs/comment
   #rdf/langString
    "An example of this state is when a previously given consent has expired, and the individual is presented a notice regarding continuing associated processing operations - to which they agree. This state can be useful to keep track of 'reconfirmed' or 'refreshed' consent within consent records, assist notices and contextual agents to create better consenting dialogues, and assist with specific legal obligations related to subsequent consenting@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Renewed Consent Given@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def RepairImpairments
  "Purposes associated with identifying, rectifying, or otherwise undertaking activities intended to fix or repair impairments to existing functionalities"
  {:db/ident :dpvo/RepairImpairments,
   :dcterms/created #xsd/date #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Purposes associated with identifying, rectifying, or otherwise undertaking activities intended to fix or repair impairments to existing functionalities@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "An example of identifying and rectifying impairments is the process of finding and fixing errors in products, commonly referred to as debugging@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Repair Impairments@en",
   :rdfs/subClassOf [:dpvo/ServiceProvision :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def Representative
  "A representative of a legal entity"
  {:db/ident :dpvo/Representative,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Georg Krog"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Beatriz Esteves"}],
   :dcterms/description #rdf/langString "A representative of a legal entity@en",
   :dcterms/source {:rdfa/uri
                    "https://eur-lex.europa.eu/eli/reg/2016/679/art_27/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Representative@en",
   :rdfs/subClassOf [:dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "accepted@en"})

(def RequestAccepted
  "State of a request being accepted towards fulfilment"
  {:db/ident :dpvo/RequestAccepted,
   :dcterms/created #xsd/date #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "State of a request being accepted towards fulfilment@en",
   :rdf/type
   [:dpvo/RequestStatus :owl/NamedIndividual :dpvo/Context :dpvo/Status],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Request Accepted@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def RequestAcknowledged
  "State of a request being acknowledged"
  {:db/ident            :dpvo/RequestAcknowledged,
   :dcterms/created     #xsd/date #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "State of a request being acknowledged@en",
   :rdf/type            [:dpvo/RequestStatus
                         :owl/NamedIndividual
                         :dpvo/Context
                         :dpvo/Status],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Request Acknowledged@en",
   :vs/term_status      #rdf/langString "accepted@en"})

(def RequestActionDelayed
  "State of a request being delayed towards fulfilment"
  {:db/ident :dpvo/RequestActionDelayed,
   :dcterms/created #xsd/date #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "State of a request being delayed towards fulfilment@en",
   :rdf/type
   [:dpvo/RequestStatus :owl/NamedIndividual :dpvo/Context :dpvo/Status],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Request Action Delayed@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def RequestFulfilled
  "State of a request being fulfilled"
  {:db/ident            :dpvo/RequestFulfilled,
   :dcterms/created     #xsd/date #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "State of a request being fulfilled@en",
   :rdf/type            [:dpvo/RequestStatus
                         :owl/NamedIndividual
                         :dpvo/Context
                         :dpvo/Status],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Request Fulfilled@en",
   :vs/term_status      #rdf/langString "accepted@en"})

(def RequestInitiated
  "State of a request being initiated"
  {:db/ident            :dpvo/RequestInitiated,
   :dcterms/created     #xsd/date #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "State of a request being initiated@en",
   :rdf/type            [:dpvo/RequestStatus
                         :owl/NamedIndividual
                         :dpvo/Context
                         :dpvo/Status],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Request Initiated@en",
   :vs/term_status      #rdf/langString "accepted@en"})

(def RequestRejected
  "State of a request being rejected towards non-fulfilment"
  {:db/ident :dpvo/RequestRejected,
   :dcterms/created #xsd/date #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "State of a request being rejected towards non-fulfilment@en",
   :rdf/type
   [:dpvo/RequestStatus :owl/NamedIndividual :dpvo/Context :dpvo/Status],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Request Rejected@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def RequestRequiredActionPerformed
  "State of a request's required action having been performed by the other party"
  {:db/ident :dpvo/RequestRequiredActionPerformed,
   :dcterms/created #xsd/date #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "State of a request's required action having been performed by the other party@en",
   :rdf/type
   [:dpvo/RequestStatus :owl/NamedIndividual :dpvo/Context :dpvo/Status],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Request Required Action Performed@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def RequestRequiresAction
  "State of a request requiring an action to be performed from another party"
  {:db/ident :dpvo/RequestRequiresAction,
   :dcterms/created #xsd/date #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "State of a request requiring an action to be performed from another party@en",
   :rdf/type
   [:dpvo/RequestStatus :owl/NamedIndividual :dpvo/Context :dpvo/Status],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Request Requires Action@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def RequestStatus
  "Status associated with requests"
  {:db/ident            :dpvo/RequestStatus,
   :dcterms/created     #xsd/date #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Status associated with requests@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Request Status@en",
   :rdfs/subClassOf     [:dpvo/Status :dpvo/Context],
   :vs/term_status      #rdf/langString "accepted@en"})

(def RequestStatusQuery
  "State of a request's status being queried"
  {:db/ident            :dpvo/RequestStatusQuery,
   :dcterms/created     #xsd/date #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "State of a request's status being queried@en",
   :rdf/type            [:dpvo/RequestStatus
                         :owl/NamedIndividual
                         :dpvo/Context
                         :dpvo/Status],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Request Status Query@en",
   :vs/term_status      #rdf/langString "accepted@en"})

(def RequestUnfulfilled
  "State of a request being unfulfilled"
  {:db/ident            :dpvo/RequestUnfulfilled,
   :dcterms/created     #xsd/date #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "State of a request being unfulfilled@en",
   :rdf/type            [:dpvo/RequestStatus
                         :owl/NamedIndividual
                         :dpvo/Context
                         :dpvo/Status],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Request Unfulfilled@en",
   :vs/term_status      #rdf/langString "accepted@en"})

(def RequestedServiceProvision
  "Purposes associated with delivering services as requested by user or consumer"
  {:db/ident :dpvo/RequestedServiceProvision,
   :dcterms/created #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with delivering services as requested by user or consumer@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "The use of 'request' here includes where an user explicitly asks for the service and also when an established contract requires the provision of the service@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Requested Service Provision@en",
   :rdfs/subClassOf [:dpvo/ServiceProvision :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def Required
  "Indication of 'required' or 'necessary'"
  {:db/ident            :dpvo/Required,
   :dcterms/created     #xsd/date #inst "2022-02-13T00:00:00.000-05:00",
   :dcterms/creator     [{:xsd/string "Paul Ryan"}
                         {:xsd/string "Georg P Krog"}
                         {:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Julian Flake"}
                         {:xsd/string "Beatriz Esteves"}],
   :dcterms/description #rdf/langString
                         "Indication of 'required' or 'necessary'@en",
   :rdf/type            [:owl/NamedIndividual :dpvo/Necessity :dpvo/Context],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Required@en",
   :vs/term_status      #rdf/langString "accepted@en"})

(def ResearchAndDevelopment
  "Purposes associated with conducting research and development for new methods, products, or services"
  {:db/ident :dpvo/ResearchAndDevelopment,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Javier Fernandez"}
                     {:xsd/string "Simon Steyskal"}
                     {:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Elmar Kiesling"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with conducting research and development for new methods, products, or services@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Research and Development@en",
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status #rdf/langString "accepted@en"})

(def Restrict
  "to apply a restriction on the processsing of specific records"
  {:db/ident :dpvo/Restrict,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   #rdf/langString
    "to apply a restriction on the processsing of specific records@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Restrict@en",
   :rdfs/subClassOf [:dpvo/Transform :dpvo/Processing],
   :vs/term_status #rdf/langString "accepted@en"})

(def Retrieve
  "to retrieve data, often in an automated manner"
  {:db/ident :dpvo/Retrieve,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #rdf/langString
                         "to retrieve data, often in an automated manner@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Retrieve@en",
   :rdfs/subClassOf [:dpvo/Use :dpvo/Processing],
   :vs/term_status #rdf/langString "accepted@en"})

(def ReviewImpactAssessment
  "Procedures to review impact assessments in terms of continued validity, adequacy for intended purposes, and conformance of processes with findings"
  {:db/ident :dpvo/ReviewImpactAssessment,
   :dcterms/created #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Procedures to review impact assessments in terms of continued validity, adequacy for intended purposes, and conformance of processes with findings@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Review Impact Assessment@en",
   :rdfs/subClassOf [:dpvo/ReviewProcedure
                     :dpvo/ImpactAssessment
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure
                     :dpvo/Assessment],
   :vs/term_status #rdf/langString "accepted@en"})

(def ReviewProcedure
  "A procedure or process that reviews the correctness and validity of other measures and processes"
  {:db/ident :dpvo/ReviewProcedure,
   :dcterms/created #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "A procedure or process that reviews the correctness and validity of other measures and processes@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Review Procedure@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Right
  "A 'right' is a legal, social, or ethical principle of freedom or entitlement which dictate the norms regarding what is allowed or owed.. Rights as a concept encompass a broad area of norms and entities, and are not specific to Individuals or Data Protection / Privacy. For individual specific rights, see dpv:DataSubjectRight"
  {:db/ident :dpvo/Right,
   :dcterms/created #xsd/date #inst "2020-11-18T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J Pandit"}],
   :dcterms/description
   [#rdf/langString "The right(s) applicable, provided, or expected.@en"
    #rdf/langString "The right(s) applicable, provided, or expected@en"],
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "A 'right' is a legal, social, or ethical principle of freedom or entitlement which dictate the norms regarding what is allowed or owed.. Rights as a concept encompass a broad area of norms and entities, and are not specific to Individuals or Data Protection / Privacy. For individual specific rights, see dpv:DataSubjectRight@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Right@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def RightExerciseActivity
  "An activity representing an exercising of an active right"
  {:db/ident :dpvo/RightExerciseActivity,
   :dcterms/created #xsd/date #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J Pandit"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "An activity representing an exercising of an active right@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "There may be multiple activities associated with exercising and fulfilling rights. See the RightExerciseRecord concept for record-keeping of such activities in a cohesive manner.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Right Exercise Activity@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def RightExerciseNotice
  "Information associated with exercising of an active right"
  {:db/ident :dpvo/RightExerciseNotice,
   :dcterms/created #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Harshvardhan J Pandit"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString
    "Information associated with exercising of an active right@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This concept is intended for providing information regarding a right exercise. For specific instances of such exercises, see RightExerciseActivity and RightExerciseRecord.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Right Exercise Notice@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def RightExerciseRecord
  "Record of a Right being exercised"
  {:db/ident :dpvo/RightExerciseRecord,
   :dcterms/created #xsd/date #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J Pandit"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description #rdf/langString "Record of a Right being exercised@en",
   :rdf/type [:dpvo/Record :owl/NamedIndividual :dpvo/Obtain :dpvo/Processing],
   :rdfs/comment
   #rdf/langString
    "This concept represents a record of one or more right exercise activities, such as those associated with a single data subject or service or entity@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Right Exercise Record@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def RightFulfilmentNotice
  "Notice provided regarding fulfilment of a right"
  {:db/ident :dpvo/RightFulfilmentNotice,
   :dcterms/created #xsd/date #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Notice provided regarding fulfilment of a right@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This notice is associated with situations where information is provided with the intention of progressing the fulfilment of a right. For example, a notice asking for more information regarding the scope of the right, or providing information on where to access the data provided under a right.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Right Fulfilment Notice@en",
   :rdfs/subClassOf [:dpvo/Notice
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def RightNonFulfilmentNotice
  "Notice provided regarding non-fulfilment of a right"
  {:db/ident :dpvo/RightNonFulfilmentNotice,
   :dcterms/created #xsd/date #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString "Notice provided regarding non-fulfilment of a right@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This notice is associated with situations where information is provided with the intention of communicating non-fulfilment of a right. For example, to provide justifications on why a right could not be fulfilled or providing information about another entity  who should be approached for exercising this right.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Right Non-Fulfilment Notice@en",
   :rdfs/subClassOf [:dpvo/Notice
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Risk
  "A risk or possibility or uncertainty of negative effects, impacts, or consequences."
  {:db/ident :dpvo/Risk,
   :dcterms/created #xsd/date #inst "2020-11-18T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "A risk or possibility or uncertainty of negative effects, impacts, or consequences.@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Risks can be associated with one or more different concepts such as purpose, processing, personal data, technical or organisational measure.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Risk@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def RiskLevel
  "The magnitude of a risk expressed as an indication to aid in its management"
  {:db/ident :dpvo/RiskLevel,
   :dcterms/created #xsd/date #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "The magnitude of a risk expressed as an indication to aid in its management@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Risk Levels can be defined as a combination of different characteristics. For example, ISO 31073:2022 defines it as a combination of consequences and their likelihood. Another example would be the Risk Matrix where Risk Level is defined as a combination of Likelihood and Severity associated with the Risk.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Risk Level@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def RiskManagementPlan
  "A scheme within the risk management framework specifying the approach, the management components, and resources to be applied to the management of risk"
  {:db/ident :dpvo/RiskManagementPlan,
   :dcterms/created #xsd/date #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "A scheme within the risk management framework specifying the approach, the management components, and resources to be applied to the management of risk@en",
   :dcterms/source {:rdfa/uri "https://www.iso.org/standard/79637.html"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Risk Management Plan@en",
   :rdfs/subClassOf [:dpvo/SecurityProcedure
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def RiskManagementPolicy
  "A policy or statement of the overall intentions and direction of an organisation related to risk management"
  {:db/ident :dpvo/RiskManagementPolicy,
   :dcterms/created #xsd/date #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "A policy or statement of the overall intentions and direction of an organisation related to risk management@en",
   :dcterms/source {:rdfa/uri "https://www.iso.org/standard/79637.html"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Risk Management Policy@en",
   :rdfs/subClassOf [:dpvo/Policy
                     :dpvo/SecurityProcedure
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def RiskManagementProcess
  "The systematic application of management policies, procedures and practices to the activities of communicating, consulting, establishing the context, and identifying, analysing, evaluating, treating, monitoring, and reviewing risk"
  {:db/ident :dpvo/RiskManagementProcess,
   :dcterms/created #xsd/date #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "The systematic application of management policies, procedures and practices to the activities of communicating, consulting, establishing the context, and identifying, analysing, evaluating, treating, monitoring, and reviewing risk@en",
   :dcterms/source [{:rdfa/uri "https://www.iso.org/standard/79637.html"}
                    {:rdfa/uri
                     "https://www.iso.org/iso-31000-risk-management.html"}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Risk Management Process@en",
   :rdfs/subClassOf [:dpvo/SecurityProcedure
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def RiskMitigationMeasure
  "Measures intended to mitigate, minimise, or prevent risk."
  {:db/ident :dpvo/RiskMitigationMeasure,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Measures intended to mitigate, minimise, or prevent risk.@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Risk Mitigation Measure@en",
   :rdfs/subClassOf :dpvo/TechnicalOrganisationalMeasure,
   :vs/term_status #rdf/langString "accepted@en"})

(def Rule
  "A rule describing a process or control that directs or determines if and how an activity should be conducted"
  {:db/ident :dpvo/Rule,
   :dcterms/created #xsd/date #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "A rule describing a process or control that directs or determines if and how an activity should be conducted@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Rule@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def Safeguard
  "A safeguard is a precautionary measure for the protection against or mitigation of negative effects"
  {:db/ident :dpvo/Safeguard,
   :dcterms/created #xsd/date #inst "2021-09-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "David Hickey"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "A safeguard is a precautionary measure for the protection against or mitigation of negative effects@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This concept is relevant given the requirement to assert safeguards in cross-border data transfers@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Safeguard@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def SafeguardForDataTransfer
  "Represents a safeguard used for data transfer. Can include technical or organisational measures."
  {:db/ident :dpvo/SafeguardForDataTransfer,
   :dcterms/created #xsd/date #inst "2021-09-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "David Hickey"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Represents a safeguard used for data transfer. Can include technical or organisational measures.@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Safeguard for Data Transfer@en",
   :rdfs/subClassOf [:dpvo/Safeguard
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Scale
  "A measurement along some dimension"
  {:db/ident :dpvo/Scale,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Rana Saniei"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "A measurement along some dimension@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Scales are subjective concepts that need to be defined and interpreted within the context of their application. For example, what would be small within one context could be large within another.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Scale@en",
   :rdfs/subClassOf [:dpvo/ProcessingContext :dpvo/Context],
   :vs/term_status #rdf/langString "accepted@en"})

(def Scope
  "Indication of the extent or range or boundaries associated with(in) a context"
  {:db/ident :dpvo/Scope,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Indication of the extent or range or boundaries associated with(in) a context@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Scope@en",
   :rdfs/subClassOf :dpvo/Context,
   :vs/term_status #rdf/langString "accepted@en"})

(def ScoringOfIndividuals
  "Processing that involves scoring of individuals"
  {:db/ident :dpvo/ScoringOfIndividuals,
   :dcterms/created #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Processing that involves scoring of individuals@en",
   :dcterms/modified #xsd/date #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Scoring of Individuals@en",
   :rdfs/subClassOf
   [:dpvo/EvaluationScoring :dpvo/Context :dpvo/ProcessingContext],
   :vs/term_status #rdf/langString "modified@en"})

(def Screen
  "to remove data for some criteria"
  {:db/ident            :dpvo/Screen,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Georg P Krog"}],
   :dcterms/description #rdf/langString "to remove data for some criteria@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Screen@en",
   :rdfs/subClassOf     [:dpvo/Transform :dpvo/Processing],
   :vs/term_status      #rdf/langString "accepted@en"})

(def Seal
  "A seal or a mark indicating proof of certification to some certification or standard"
  {:db/ident :dpvo/Seal,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Mark Lizar"}
                     {:xsd/string "Rob Brennan"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "A seal or a mark indicating proof of certification to some certification or standard@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Seal@en",
   :rdfs/subClassOf [:dpvo/CertificationSeal
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def SearchFunctionalities
  "Purposes associated with providing searching, querying, or other forms of information retrieval related functionalities"
  {:db/ident :dpvo/SearchFunctionalities,
   :dcterms/created #xsd/date #inst "2022-11-09T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #rdf/langString
    "Purposes associated with providing searching, querying, or other forms of information retrieval related functionalities@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Search Functionalities@en",
   :rdfs/subClassOf [:dpvo/ServiceProvision :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def SecondaryImportance
  "Indication of 'secondary' or 'minor' or 'auxiliary' importance"
  {:db/ident :dpvo/SecondaryImportance,
   :dcterms/created #xsd/date #inst "2022-02-11T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Beatriz Esteves"}],
   :dcterms/description
   #rdf/langString
    "Indication of 'secondary' or 'minor' or 'auxiliary' importance@en",
   :rdf/type [:dpvo/Importance :owl/NamedIndividual :dpvo/Context],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Secondary Importance@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def SecretSharingSchemes
  "Use of secret sharing schemes where the secret can only be reconstructed through combination of sufficient number of individuals"
  {:db/ident :dpvo/SecretSharingSchemes,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Use of secret sharing schemes where the secret can only be reconstructed through combination of sufficient number of individuals@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Secret Sharing Schemes@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Sector
  "Sector describes the area of application or domain that indicates or restricts scope for interpretation and application of purpose e.g. Agriculture, Banking"
  {:db/ident :dpvo/Sector,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Simon Steyskal"}
                     {:xsd/string "Javier Fernandez"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString
    "Sector describes the area of application or domain that indicates or restricts scope for interpretation and application of purpose e.g. Agriculture, Banking@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "There are various sector codes used commonly to indicate the domain of an organisation or business. Examples include NACE (EU), ISIC (UN), SIC and NAICS (USA).@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Sector@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def SecureMultiPartyComputation
  "Use of cryptographic methods for entities to jointly compute functions without revealing inputs"
  {:db/ident :dpvo/SecureMultiPartyComputation,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Use of cryptographic methods for entities to jointly compute functions without revealing inputs@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Secure Multi-Party Computation@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def SecurityAssessment
  "Assessment of security intended to identity gaps, vulnerabilities, risks, and effectiveness of controls"
  {:db/ident :dpvo/SecurityAssessment,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Assessment of security intended to identity gaps, vulnerabilities, risks, and effectiveness of controls@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Security Assessment@en",
   :rdfs/subClassOf [:dpvo/SecurityProcedure
                     :dpvo/Assessment
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def SecurityKnowledgeTraining
  "Training intended to increase knowledge regarding security"
  {:db/ident :dpvo/SecurityKnowledgeTraining,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Training intended to increase knowledge regarding security@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Security Knowledge Training@en",
   :rdfs/subClassOf [:dpvo/StaffTraining
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def SecurityMethod
  "Methods that relate to creating and providing security"
  {:db/ident :dpvo/SecurityMethod,
   :dcterms/created #xsd/date #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Methods that relate to creating and providing security@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Security Method@en",
   :rdfs/subClassOf [:dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def SecurityProcedure
  "Procedures associated with assessing, implementing, and evaluating security"
  {:db/ident :dpvo/SecurityProcedure,
   :dcterms/created #xsd/date #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Procedures associated with assessing, implementing, and evaluating security@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Security Procedure@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def SecurityRoleProcedures
  "Procedures related to security roles"
  {:db/ident :dpvo/SecurityRoleProcedures,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Procedures related to security roles@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Security Role Procedures@en",
   :rdfs/subClassOf [:dpvo/SecurityProcedure
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def SellDataToThirdParties
  "Purposes associated with selling or sharing data or information to third parties"
  {:db/ident :dpvo/SellDataToThirdParties,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Simon Steyskal"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Elmar Kiesling"}
                     {:xsd/string "Javier Fernandez"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with selling or sharing data or information to third parties@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Sell here means exchange, submit, or provide in return for direct or indirect compensation. Was subclass of commercial interest, changed to reflect selling something@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Sell Data to Third Parties@en",
   :rdfs/subClassOf [:dpvo/SellProducts :dpvo/ServiceProvision :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def SellInsightsFromData
  "Purposes associated with selling or sharing insights obtained from analysis of data"
  {:db/ident :dpvo/SellInsightsFromData,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Simon Steyskal"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Elmar Kiesling"}
                     {:xsd/string "Javier Fernandez"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with selling or sharing insights obtained from analysis of data@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Sell here means exchange, submit, or provide in return for direct or indirect compensation. Was subclass of commercial interest, changed to reflect selling something@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Sell Insights from Data@en",
   :rdfs/subClassOf [:dpvo/SellProducts :dpvo/ServiceProvision :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def SellProducts
  "Purposes associated with selling products or services"
  {:db/ident :dpvo/SellProducts,
   :dcterms/created #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString "Purposes associated with selling products or services@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Sell here means exchange, submit, or provide in return for direct or indirect compensation.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Sell Products@en",
   :rdfs/subClassOf [:dpvo/ServiceProvision :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def SellProductsToDataSubject
  "Purposes associated with selling products or services to the user, consumer, or data subjects"
  {:db/ident :dpvo/SellProductsToDataSubject,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Simon Steyskal"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling"}
                     {:xsd/string "Javier Fernandez"}
                     {:xsd/string "Axel Polleres"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with selling products or services to the user, consumer, or data subjects@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Sell Products here refers to processing necessary to provide and complete a sale to customers. It should not be confused with providing services with a cost based on an established agreement.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Sell Products to Data Subject@en",
   :rdfs/subClassOf [:dpvo/SellProducts :dpvo/ServiceProvision :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def SensitivePersonalData
  "Personal data that is considered 'sensitive' in terms of privacy and/or impact, and therefore requires additional considerations and/or protection"
  {:db/ident :dpvo/SensitivePersonalData,
   :dcterms/created #xsd/date #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Personal data that is considered 'sensitive' in terms of privacy and/or impact, and therefore requires additional considerations and/or protection@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Sensitivity' is a matter of context, and may be defined within legal frameworks. For GDPR, Special categories of personal data are considered a subset of sensitive data. To illustrate the difference between the two, consider the situation where Location data is collected, and which is considered 'sensitive' but not 'special'. As a probable rule, sensitive data require additional considerations whereas special category data requires additional legal basis / justifications.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Sensitive Personal Data@en",
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo/Data],
   :vs/term_status #rdf/langString "accepted@en"})

(def ServiceOptimisation
  "Purposes associated with optimisation of services or activities"
  {:db/ident :dpvo/ServiceOptimisation,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Elmar Kiesling"}
                     {:xsd/string "Simon Steyskal"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Javier Fernandez"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with optimisation of services or activities@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Subclass of ServiceProvision since optimisation is usually considered part of providing services@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Service Optimisation@en",
   :rdfs/subClassOf [:dpvo/ServiceProvision :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def ServicePersonalisation
  "Purposes associated with providing personalisation within services or product or activities"
  {:db/ident :dpvo/ServicePersonalisation,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Elmar Kiesling"}
                     {:xsd/string "Simon Steyskal"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Javier Fernandez"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with providing personalisation within services or product or activities@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Service Personalisation@en",
   :rdfs/subClassOf
   [:dpvo/ServiceProvision :dpvo/Personalisation :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def ServiceProvision
  "Purposes associated with providing service or product or activities"
  {:db/ident :dpvo/ServiceProvision,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Axel Polleres"}
                     {:xsd/string "Elmar Kiesling"}
                     {:xsd/string "Simon Steyskal"}
                     {:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Javier Fernandez"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with providing service or product or activities@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Service Provision@en",
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status #rdf/langString "accepted@en"})

(def ServiceRegistration
  "Purposes associated with registering users and collecting information required for providing a service"
  {:db/ident :dpvo/ServiceRegistration,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Beatriz Esteves"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with registering users and collecting information required for providing a service@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "An example of service registration is to provide a form that collects information such as preferred language or media format for downloading a movie@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Service Registration@en",
   :rdfs/subClassOf [:dpvo/ServiceProvision :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def ServiceUsageAnalytics
  "Purposes associated with conducting analysis and reporting related to usage of services or products"
  {:db/ident :dpvo/ServiceUsageAnalytics,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with conducting analysis and reporting related to usage of services or products@en",
   :dcterms/modified #xsd/date #inst "2022-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Was \"UsageAnalytics\", prefixed with Service to better reflect scope@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Service Usage Analytics@en",
   :rdfs/subClassOf [:dpvo/ServiceProvision :dpvo/Purpose],
   :vs/term_status #rdf/langString "modified@en"})

(def Severity
  "The magnitude of being unwanted or having negative effects such as harmful impacts"
  {:db/ident :dpvo/Severity,
   :dcterms/created #xsd/date #inst "2022-07-21T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "The magnitude of being unwanted or having negative effects such as harmful impacts@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Severity can be associated with Risk, or its Consequences and Impacts@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Severity@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def Share
  "to give data (or a portion of it) to others"
  {:db/ident :dpvo/Share,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #rdf/langString
                         "to give data (or a portion of it) to others@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Share@en",
   :rdfs/subClassOf [:dpvo/Disclose :dpvo/Processing],
   :vs/term_status #rdf/langString "accepted@en"})

(def SingleSignOn
  "Use of credentials or processes that enable using one set of credentials to authenticate multiple contexts."
  {:db/ident :dpvo/SingleSignOn,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Use of credentials or processes that enable using one set of credentials to authenticate multiple contexts.@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Single Sign On@en",
   :rdfs/subClassOf [:dpvo/AuthenticationProtocols
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def SingularDataVolume
  "Data volume that is considered singular i.e. a specific instance or single item"
  {:db/ident :dpvo/SingularDataVolume,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Data volume that is considered singular i.e. a specific instance or single item@en",
   :rdf/type [:dpvo/DataVolume
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/ProcessingContext
              :dpvo/Scale],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Singular Data Volume@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def SingularFrequency
  "Frequency where occurences are singular i.e. they take place only once"
  {:db/ident :dpvo/SingularFrequency,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Frequency where occurences are singular i.e. they take place only once@en",
   :dcterms/modified #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Singular Frequency@en",
   :rdfs/subClassOf [:dpvo/Frequency :dpvo/Context],
   :vs/term_status #rdf/langString "modified@en"})

(def SingularScaleOfDataSubjects
  "Scale of data subjects considered singular i.e. a specific data subject"
  {:db/ident :dpvo/SingularScaleOfDataSubjects,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Scale of data subjects considered singular i.e. a specific data subject@en",
   :rdf/type [:dpvo/DataSubjectScale
              :owl/NamedIndividual
              :dpvo/Scale
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Singular Scale Of Data Subjects@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def SmallDataVolume
  "Data volume that is considered small or limited within the context"
  {:db/ident :dpvo/SmallDataVolume,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Data volume that is considered small or limited within the context@en",
   :rdf/type [:dpvo/DataVolume
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/ProcessingContext
              :dpvo/Scale],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Small Data Volume@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def SmallScaleOfDataSubjects
  "Scale of data subjects considered small or limited within the context"
  {:db/ident :dpvo/SmallScaleOfDataSubjects,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Scale of data subjects considered small or limited within the context@en",
   :rdf/type [:dpvo/DataSubjectScale
              :owl/NamedIndividual
              :dpvo/Scale
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Small Scale Of Data Subjects@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def SmallScaleProcessing
  "Processing that takes place at small scales (as specified by some criteria)"
  {:db/ident :dpvo/SmallScaleProcessing,
   :dcterms/created #xsd/date #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Processing that takes place at small scales (as specified by some criteria)@en",
   :rdf/type [:dpvo/ProcessingScale
              :owl/NamedIndividual
              :dpvo/ProcessingContext
              :dpvo/Scale
              :dpvo/Context],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Small Scale Processing@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def SocialMediaMarketing
  "Purposes associated with conducting marketing through social media"
  {:db/ident :dpvo/SocialMediaMarketing,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Beatriz Esteves"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with conducting marketing through social media@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Social Media Marketing@en",
   :rdfs/subClassOf [:dpvo/Marketing :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def SpecialCategoryPersonalData
  "Sensitive Personal Data whose use requires specific legal permission or justification"
  {:db/ident :dpvo/SpecialCategoryPersonalData,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Sensitive Personal Data whose use requires specific legal permission or justification@en",
   :dcterms/modified #xsd/date #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_9/par_1/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "The term 'special category' is based on GDPR Art.9, but should not be considered as exlusive to it. DPV considers all Special Categories to also be Sensitive, but whose use is either prohibited or regulated and therefore requires additional legal basis for justification.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Special Category Personal Data@en",
   :rdfs/subClassOf [:dpvo/SensitivePersonalData :dpvo/Data :dpvo/PersonalData],
   :vs/term_status #rdf/langString "modified@en"})

(def SporadicDataVolume
  "Data volume that is considered sporadic or sparse within the context"
  {:db/ident :dpvo/SporadicDataVolume,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Data volume that is considered sporadic or sparse within the context@en",
   :rdf/type [:dpvo/DataVolume
              :owl/NamedIndividual
              :dpvo/Context
              :dpvo/ProcessingContext
              :dpvo/Scale],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Sporadic Data Volume@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def SporadicFrequency
  "Frequency where occurences are sporadic or infrequent or sparse"
  {:db/ident :dpvo/SporadicFrequency,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Frequency where occurences are sporadic or infrequent or sparse@en",
   :dcterms/modified #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Sporadic Frequency@en",
   :rdfs/subClassOf [:dpvo/Frequency :dpvo/Context],
   :vs/term_status #rdf/langString "modified@en"})

(def SporadicScaleOfDataSubjects
  "Scale of data subjects considered sporadic or sparse within the context"
  {:db/ident :dpvo/SporadicScaleOfDataSubjects,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Scale of data subjects considered sporadic or sparse within the context@en",
   :rdf/type [:dpvo/DataSubjectScale
              :owl/NamedIndividual
              :dpvo/Scale
              :dpvo/Context
              :dpvo/ProcessingContext],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Sporadic Scale Of Data Subjects@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def StaffTraining
  "Practices and policies regarding training of staff members"
  {:db/ident :dpvo/StaffTraining,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Rob Brennan"}
                     {:xsd/string "Mark Lizar"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Practices and policies regarding training of staff members@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Staff Training@en",
   :rdfs/subClassOf [:dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Status
  "The status or state of something"
  {:db/ident            :dpvo/Status,
   :dcterms/created     #xsd/date #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "The status or state of something@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Status@en",
   :rdfs/subClassOf     :dpvo/Context,
   :vs/term_status      #rdf/langString "accepted@en"})

(def StorageCondition
  "Conditions required or followed regarding storage of data"
  {:db/ident :dpvo/StorageCondition,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Mark Lizar"}
                     {:xsd/string "Rob Brennan"}],
   :dcterms/description
   #rdf/langString
    "Conditions required or followed regarding storage of data@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Storage Condition@en",
   :rdfs/subClassOf [:dpvo/ProcessingContext :dpvo/Context],
   :vs/term_status #rdf/langString "accepted@en"})

(def StorageDeletion
  "Deletion or Erasure of data including any deletion guarantees"
  {:db/ident :dpvo/StorageDeletion,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Mark Lizar"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Rob Brennan"}],
   :dcterms/description
   #rdf/langString
    "Deletion or Erasure of data including any deletion guarantees@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Storage Deletion@en",
   :rdfs/subClassOf
   [:dpvo/StorageCondition :dpvo/Context :dpvo/ProcessingContext],
   :vs/term_status #rdf/langString "accepted@en"})

(def StorageDuration
  "Duration or temporal limitation on storage of personal data"
  {:db/ident :dpvo/StorageDuration,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Mark Lizar"}
                     {:xsd/string "Rob Brennan"}
                     {:xsd/string "Axel Polleres"}],
   :dcterms/description
   #rdf/langString
    "Duration or temporal limitation on storage of personal data@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Storage Duration@en",
   :rdfs/subClassOf [:dpvo/StorageCondition
                     :dpvo/Duration
                     :dpvo/Context
                     :dpvo/ProcessingContext],
   :vs/term_status #rdf/langString "accepted@en"})

(def StorageLocation
  "Location or geospatial scope where the data is stored"
  {:db/ident :dpvo/StorageLocation,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Rob Brennan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Mark Lizar"}],
   :dcterms/description
   #rdf/langString "Location or geospatial scope where the data is stored@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Storage Location@en",
   :rdfs/subClassOf [:dpvo/StorageCondition
                     :dpvo/Location
                     :dpvo/Context
                     :dpvo/ProcessingContext],
   :vs/term_status #rdf/langString "accepted@en"})

(def StorageRestoration
  "Regularity and temporal span of data restoration/backup mechanisms that guarantee that data is preserved"
  {:db/ident :dpvo/StorageRestoration,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Mark Lizar"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Rob Brennan"}],
   :dcterms/description
   #rdf/langString
    "Regularity and temporal span of data restoration/backup mechanisms that guarantee that data is preserved@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Storage Restoration@en",
   :rdfs/subClassOf
   [:dpvo/StorageCondition :dpvo/Context :dpvo/ProcessingContext],
   :vs/term_status #rdf/langString "accepted@en"})

(def Store
  "to keep data for future use"
  {:db/ident :dpvo/Store,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #rdf/langString "to keep data for future use@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Store@en",
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status #rdf/langString "accepted@en"})

(def Structure
  "to arrange data according to a structure"
  {:db/ident :dpvo/Structure,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #rdf/langString
                         "to arrange data according to a structure@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Structure@en",
   :rdfs/subClassOf [:dpvo/Organise :dpvo/Processing],
   :vs/term_status #rdf/langString "accepted@en"})

(def Student
  "Data subjects that are students"
  {:db/ident            :dpvo/Student,
   :dcterms/created     #xsd/date #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Beatriz Esteves"}
                         {:xsd/string "Georg P. Krog"}
                         {:xsd/string "Julian Flake"}
                         {:xsd/string "Paul Ryan"}
                         {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Data subjects that are students@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Student@en",
   :rdfs/subClassOf     [:dpvo/DataSubject
                         :dpvo/NaturalPerson
                         :dpvo/LegalEntity
                         :dpvo/Entity],
   :vs/term_status      #rdf/langString "accepted@en"})

(def SubProcessorAgreement
  "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between a Data Processor and a Data (Sub-)Processor"
  {:db/ident :dpvo/SubProcessorAgreement,
   :dcterms/created #xsd/date #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString
    "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between a Data Processor and a Data (Sub-)Processor@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Sub-Processor Agreement@en",
   :rdfs/subClassOf [:dpvo/DataProcessingAgreement
                     :dpvo/LegalAgreement
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Subscriber
  "Data subjects that subscribe to service(s)"
  {:db/ident            :dpvo/Subscriber,
   :dcterms/created     #xsd/date #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Beatriz Esteves"}
                         {:xsd/string "Julian Flake"}
                         {:xsd/string "Georg P. Krog"}
                         {:xsd/string "Paul Ryan"}],
   :dcterms/description #rdf/langString
                         "Data subjects that subscribe to service(s)@en",
   :rdf/type            :owl/Class,
   :rdfs/comment        #rdf/langString
                         "note: subscriber can be customer or consumer@en",
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Subscriber@en",
   :rdfs/subClassOf     [:dpvo/DataSubject
                         :dpvo/NaturalPerson
                         :dpvo/LegalEntity
                         :dpvo/Entity],
   :vs/term_status      #rdf/langString "accepted@en"})

(def SupraNationalAuthority
  "An authority tasked with overseeing legal compliance for a supra-national union e.g. EU"
  {:db/ident :dpvo/SupraNationalAuthority,
   :dcterms/created #xsd/date #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "An authority tasked with overseeing legal compliance for a supra-national union e.g. EU@en",
   :dcterms/source {:rdfa/uri "http://purl.org/adms"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Supra-National Authority@en",
   :rdfs/subClassOf [:dpvo/Authority
                     :dpvo/LegalEntity
                     :dpvo/Organisation
                     :dpvo/Entity
                     :dpvo/GovernmentalOrganisation],
   :vs/term_status #rdf/langString "accepted@en"})

(def SupraNationalUnion
  "A political union of two or more countries with an establishment of common authority"
  {:db/ident :dpvo/SupraNationalUnion,
   :dcterms/created #xsd/date #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "A political union of two or more countries with an establishment of common authority@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Supranational Union@en",
   :rdfs/subClassOf :dpvo/Location,
   :vs/term_status #rdf/langString "accepted@en"})

(def SymmetricCryptography
  "Use of cryptography where the same keys are utilised for encryption and descryption of information"
  {:db/ident :dpvo/SymmetricCryptography,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Use of cryptography where the same keys are utilised for encryption and descryption of information@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Symmetric Cryptography@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def SymmetricEncryption
  "Use of symmetric cryptography to encrypt data"
  {:db/ident :dpvo/SymmetricEncryption,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Use of symmetric cryptography to encrypt data@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Symmetric Encryption@en",
   :rdfs/subClassOf [:dpvo/Encryption
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def SyntheticData
  "Synthetic data reffers to artificially created data such that it is intended to resemble real data (personal or non-personal), but does not refer to any specific identified or identifiable individual, or to the real measure of an observable parameter in the case of non-personal data"
  {:db/ident :dpvo/SyntheticData,
   :dcterms/created #xsd/date #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Synthetic data reffers to artificially created data such that it is intended to resemble real data (personal or non-personal), but does not refer to any specific identified or identifiable individual, or to the real measure of an observable parameter in the case of non-personal data@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/data-protection-engineering"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Synthetic Data@en",
   :rdfs/subClassOf :dpvo/Data,
   :vs/term_status #rdf/langString "accepted@en"})

(def SystematicMonitoring
  "Processing that involves systematic monitoring of individuals"
  {:db/ident :dpvo/SystematicMonitoring,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Piero Bonatti"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Processing that involves systematic monitoring of individuals@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Systematic Monitoring@en",
   :rdfs/subClassOf [:dpvo/ProcessingContext :dpvo/Context],
   :vs/term_status #rdf/langString "accepted@en"})

(def TargetedAdvertising
  "Purposes associated with creating and providing pesonalised advertisement where the personalisation is targeted to a specific individual or group of individuals"
  {:db/ident :dpvo/TargetedAdvertising,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Purposes associated with creating and providing pesonalised advertisement where the personalisation is targeted to a specific individual or group of individuals@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Targeted Advertising@en",
   :rdfs/subClassOf [:dpvo/PersonalisedAdvertising
                     :dpvo/Advertising
                     :dpvo/Purpose
                     :dpvo/Personalisation
                     :dpvo/Marketing],
   :vs/term_status #rdf/langString "accepted@en"})

(def TechnicalMeasure
  "Technical measures required/followed when processing data of the declared category"
  {:db/ident :dpvo/TechnicalMeasure,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Rob Brennan"}
                     {:xsd/string "Mark Lizar"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Axel Polleres"}],
   :dcterms/description
   #rdf/langString
    "Technical measures required/followed when processing data of the declared category@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Technical Measure@en",
   :rdfs/subClassOf :dpvo/TechnicalOrganisationalMeasure,
   :vs/term_status #rdf/langString "accepted@en"})

(def TechnicalOrganisationalMeasure
  "The Technical and Organisational measures used."
  {:db/ident            :dpvo/TechnicalOrganisationalMeasure,
   :dcterms/created     #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Bud Bruegger"},
   :dcterms/description #rdf/langString
                         "The Technical and Organisational measures used.@en",
   :dcterms/modified    #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString
                         "Technical and Organisational Measure@en",
   :vs/term_status      #rdf/langString "accepted@en"})

(def TechnicalServiceProvision
  "Purposes associated with managing and providing technical processes and functions necessary for delivering services"
  {:db/ident :dpvo/TechnicalServiceProvision,
   :dcterms/created #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Purposes associated with managing and providing technical processes and functions necessary for delivering services@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Technical Service Provision@en",
   :rdfs/subClassOf [:dpvo/ServiceProvision :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def Technology
  "The technology, technological implementation, or any techniques, skills, methods, and processes used or applied"
  {:db/ident :dpvo/Technology,
   :dcterms/created #xsd/date #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "The technology, technological implementation, or any techniques, skills, methods, and processes used or applied@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Examples (non-exhaustive) include: Algorithm, Process, Method, Skill, Database, Cookies, Server, Device@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Technology@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def TemporalDuration
  "Duration that has a fixed temporal duration e.g. 6 months"
  {:db/ident :dpvo/TemporalDuration,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Duration that has a fixed temporal duration e.g. 6 months@en",
   :dcterms/modified #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Temporal Duration@en",
   :rdfs/subClassOf [:dpvo/Duration :dpvo/Context],
   :vs/term_status #rdf/langString "modified@en"})

(def ThirdCountry
  "Represents a country outside applicable or compatible jurisdiction as outlined in law"
  {:db/ident :dpvo/ThirdCountry,
   :dcterms/created #xsd/date #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Represents a country outside applicable or compatible jurisdiction as outlined in law@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Third Country@en",
   :rdfs/subClassOf [:dpvo/Country :dpvo/Location],
   :vs/term_status #rdf/langString "accepted@en"})

(def ThirdParty
  "A ‘third party’ means a natural or legal person, public authority, agency or body other than the data subject, controller, processor and people who, under the direct authority of the controller or processor, are authorised to process personal data."
  {:db/ident :dpvo/ThirdParty,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "A ‘third party’ means a natural or legal person, public authority, agency or body other than the data subject, controller, processor and people who, under the direct authority of the controller or processor, are authorised to process personal data.@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_10/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Third Party@en",
   :rdfs/subClassOf [:dpvo/Recipient :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "accepted@en"})

(def ThirdPartyAgreement
  "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between a Data Controller or Processor and a Third Party"
  {:db/ident :dpvo/ThirdPartyAgreement,
   :dcterms/created #xsd/date #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between a Data Controller or Processor and a Third Party@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Third-Party Agreement@en",
   :rdfs/subClassOf [:dpvo/DataProcessingAgreement
                     :dpvo/LegalAgreement
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def ThirdPartySecurityProcedures
  "Procedures related to security associated with Third Parties"
  {:db/ident :dpvo/ThirdPartySecurityProcedures,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Procedures related to security associated with Third Parties@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Third Party Security Procedures@en",
   :rdfs/subClassOf [:dpvo/SecurityProcedure
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Tourist
  "Data subjects that are tourists i.e. not citizens and not immigrants"
  {:db/ident :dpvo/Tourist,
   :dcterms/created #xsd/date #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Georg P. Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString
    "Data subjects that are tourists i.e. not citizens and not immigrants@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Tourist@en",
   :rdfs/subClassOf
   [:dpvo/DataSubject :dpvo/NaturalPerson :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "accepted@en"})

(def Transfer
  "to move data from one place to another"
  {:db/ident :dpvo/Transfer,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #rdf/langString
                         "to move data from one place to another@en",
   :dcterms/source {:rdfa/uri
                    "https://specialprivacy.ercim.eu/vocabs/processing"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Transfer@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/processing#Transfer"},
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status #rdf/langString "accepted@en"})

(def Transform
  "to change the form or nature of data"
  {:db/ident :dpvo/Transform,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #rdf/langString
                         "to change the form or nature of data@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Transform@en",
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status #rdf/langString "accepted@en"})

(def Transmit
  "to send out data"
  {:db/ident :dpvo/Transmit,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #rdf/langString "to send out data@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Transmit@en",
   :rdfs/subClassOf [:dpvo/Disclose :dpvo/Processing],
   :vs/term_status #rdf/langString "accepted@en"})

(def TrustedComputing
  "Use of cryptographic methods to restrict access and execution to trusted parties and code"
  {:db/ident :dpvo/TrustedComputing,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Use of cryptographic methods to restrict access and execution to trusted parties and code@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Trusted Computing@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def TrustedExecutionEnvironments
  "Use of cryptographic methods to restrict access and execution to trusted parties and code within a dedicated execution environment"
  {:db/ident :dpvo/TrustedExecutionEnvironments,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Use of cryptographic methods to restrict access and execution to trusted parties and code within a dedicated execution environment@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/data-protection-engineering"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Trusted Execution Environments@en",
   :rdfs/subClassOf [:dpvo/CryptographicMethods
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def TrustedThirdPartyUtilisation
  "Utilisation of a trusted third party to provide or carry out a measure"
  {:db/ident :dpvo/TrustedThirdPartyUtilisation,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Utilisation of a trusted third party to provide or carry out a measure@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Trusted Third Party Utilisation@en",
   :rdfs/subClassOf [:dpvo/SecurityProcedure
                     :dpvo/OrganisationalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def UninformedConsent
  "Consent that is uninformed i.e. without requirement to provide sufficient information to make a consenting decision"
  {:db/ident :dpvo/UninformedConsent,
   :dcterms/created #xsd/date #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString
    "Consent that is uninformed i.e. without requirement to provide sufficient information to make a consenting decision@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Uninformed Consent@en",
   :rdfs/subClassOf [:dpvo/Consent :dpvo/LegalBasis],
   :vs/term_status #rdf/langString "accepted@en"})

(def Unlawful
  "State of being unlawful or legally non-compliant"
  {:db/ident            :dpvo/Unlawful,
   :dcterms/created     #xsd/date #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "State of being unlawful or legally non-compliant@en",
   :rdf/type            [:dpvo/Lawfulness
                         :owl/NamedIndividual
                         :dpvo/Status
                         :dpvo/Context
                         :dpvo/ComplianceStatus],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Unlawful@en",
   :vs/term_status      #rdf/langString "accepted@en"})

(def UntilEventDuration
  "Duration that takes place until a specific event occurs e.g. Account Closure"
  {:db/ident :dpvo/UntilEventDuration,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Duration that takes place until a specific event occurs e.g. Account Closure@en",
   :dcterms/modified #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Until Event Duration@en",
   :rdfs/subClassOf [:dpvo/Duration :dpvo/Context],
   :vs/term_status #rdf/langString "modified@en"})

(def UntilTimeDuration
  "Duration that has a fixed end date e.g. 2022-12-31"
  {:db/ident :dpvo/UntilTimeDuration,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Duration that has a fixed end date e.g. 2022-12-31@en",
   :dcterms/modified #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Until Time Duration@en",
   :rdfs/subClassOf [:dpvo/Duration :dpvo/Context],
   :vs/term_status #rdf/langString "modified@en"})

(def UnverifiedData
  "Data that has not been verified in terms of accuracy, inconsistency, or quality"
  {:db/ident :dpvo/UnverifiedData,
   :dcterms/created #xsd/date #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Data that has not been verified in terms of accuracy, inconsistency, or quality@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Unverified Data@en",
   :rdfs/subClassOf :dpvo/Data,
   :vs/term_status #rdf/langString "accepted@en"})

(def UsageControl
  "Management of usage, which is intended to be broader than access control and may cover trust, digital rights, or other relevant controls"
  {:db/ident :dpvo/UsageControl,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Management of usage, which is intended to be broader than access control and may cover trust, digital rights, or other relevant controls@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Usage Control@en",
   :rdfs/subClassOf [:dpvo/AccessControlMethod
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Use
  "to use data"
  {:db/ident :dpvo/Use,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description #rdf/langString "to use data@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Use@en",
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status #rdf/langString "accepted@en"})

(def UseSyntheticData
  "Use of synthetic data to preserve privacy, security, or other effects and side-effects"
  {:db/ident :dpvo/UseSyntheticData,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Use of synthetic data to preserve privacy, security, or other effects and side-effects@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/data-protection-engineering"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Use of Synthetic Data@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def User
  "Data subjects that use service(s)"
  {:db/ident            :dpvo/User,
   :dcterms/created     #xsd/date #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Paul Ryan"}
                         {:xsd/string "Julian Flake"}
                         {:xsd/string "Beatriz Esteves"}
                         {:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Georg P. Krog"}],
   :dcterms/description #rdf/langString "Data subjects that use service(s)@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "User@en",
   :rdfs/subClassOf     [:dpvo/DataSubject
                         :dpvo/NaturalPerson
                         :dpvo/LegalEntity
                         :dpvo/Entity],
   :vs/term_status      #rdf/langString "accepted@en"})

(def UserInterfacePersonalisation
  "Purposes associated with personalisation of interfaces presented to the user"
  {:db/ident :dpvo/UserInterfacePersonalisation,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Simon Steyskal"}
                     {:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Elmar Kiesling"}
                     {:xsd/string "Javier Fernandez"}
                     {:xsd/string "Axel Polleres"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with personalisation of interfaces presented to the user@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Examples of user-interface personalisation include changing the language to match the locale@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "User Interface Personalisation@en",
   :rdfs/subClassOf [:dpvo/ServicePersonalisation
                     :dpvo/ServiceProvision
                     :dpvo/Purpose
                     :dpvo/Personalisation],
   :vs/term_status #rdf/langString "accepted@en"})

(def VariableLocation
  "Location that is known but is variable e.g. somewhere within a given area"
  {:db/ident :dpvo/VariableLocation,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Location that is known but is variable e.g. somewhere within a given area@en",
   :dcterms/modified #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Variable Location@en",
   :rdfs/subClassOf :dpvo/LocationFixture,
   :vs/term_status #rdf/langString "modified@en"})

(def VendorManagement
  "Purposes associated with manage orders, payment, evaluation, and prospecting related to vendors"
  {:db/ident :dpvo/VendorManagement,
   :dcterms/created #xsd/date #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "David Hickey"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with manage orders, payment, evaluation, and prospecting related to vendors@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Vendor Management@en",
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status #rdf/langString "accepted@en"})

(def VendorPayment
  "Purposes associated with managing payment of vendors"
  {:db/ident :dpvo/VendorPayment,
   :dcterms/created #xsd/date #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "David Hickey"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString "Purposes associated with managing payment of vendors@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Vendor Payment@en",
   :rdfs/subClassOf [:dpvo/VendorManagement :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def VendorRecordsManagement
  "Purposes associated with managing records and orders related to vendors"
  {:db/ident :dpvo/VendorRecordsManagement,
   :dcterms/created #xsd/date #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "David Hickey"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with managing records and orders related to vendors@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Vendor Records Management@en",
   :rdfs/subClassOf [:dpvo/VendorManagement :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def VendorSelectionAssessment
  "Purposes associated with managing selection, assessment, and evaluation related to vendors"
  {:db/ident :dpvo/VendorSelectionAssessment,
   :dcterms/created #xsd/date #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "David Hickey"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Purposes associated with managing selection, assessment, and evaluation related to vendors@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Vendor Selection Assessment@en",
   :rdfs/subClassOf [:dpvo/VendorManagement :dpvo/Purpose],
   :vs/term_status #rdf/langString "accepted@en"})

(def VerifiedData
  "Data that has been verified in terms of accuracy, inconsistency, or quality"
  {:db/ident :dpvo/VerifiedData,
   :dcterms/created #xsd/date #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Data that has been verified in terms of accuracy, inconsistency, or quality@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Verified Data@en",
   :rdfs/subClassOf :dpvo/Data,
   :vs/term_status #rdf/langString "accepted@en"})

(def VirtualisationSecurity
  "Security implemented at or through virtualised environments"
  {:db/ident :dpvo/VirtualisationSecurity,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Security implemented at or through virtualised environments@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Virtualisation Security@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def Visitor
  "Data subjects that are temporary visitors"
  {:db/ident            :dpvo/Visitor,
   :dcterms/created     #xsd/date #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Paul Ryan"}
                         {:xsd/string "Julian Flake"}
                         {:xsd/string "Georg P. Krog"}
                         {:xsd/string "Beatriz Esteves"}],
   :dcterms/description #rdf/langString
                         "Data subjects that are temporary visitors@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "Visitor@en",
   :rdfs/subClassOf     [:dpvo/DataSubject
                         :dpvo/NaturalPerson
                         :dpvo/LegalEntity
                         :dpvo/Entity],
   :vs/term_status      #rdf/langString "accepted@en"})

(def VitalInterest
  "Processing is necessary or required to protect vital interests of a data subject or other natural person"
  {:db/ident :dpvo/VitalInterest,
   :dcterms/created #xsd/date #inst "2021-04-21T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Processing is necessary or required to protect vital interests of a data subject or other natural person@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Vital Interest@en",
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status #rdf/langString "accepted@en"})

(def VitalInterestOfDataSubject
  "Processing is necessary or required to protect vital interests of a data subject"
  {:db/ident :dpvo/VitalInterestOfDataSubject,
   :dcterms/created #xsd/date #inst "2021-04-21T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Processing is necessary or required to protect vital interests of a data subject@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Vital Interest of Data Subject@en",
   :rdfs/subClassOf
   [:dpvo/VitalInterestOfNaturalPerson :dpvo/LegalBasis :dpvo/VitalInterest],
   :vs/term_status #rdf/langString "accepted@en"})

(def VitalInterestOfNaturalPerson
  "Processing is necessary or required to protect vital interests of a natural person"
  {:db/ident :dpvo/VitalInterestOfNaturalPerson,
   :dcterms/created #xsd/date #inst "2021-04-21T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Processing is necessary or required to protect vital interests of a natural person@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Vital Interest of Natural Person@en",
   :rdfs/subClassOf [:dpvo/VitalInterest :dpvo/LegalBasis],
   :vs/term_status #rdf/langString "accepted@en"})

(def VulnerabilityTestingMethods
  "Methods that assess or discover vulnerabilities in a system"
  {:db/ident :dpvo/VulnerabilityTestingMethods,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Methods that assess or discover vulnerabilities in a system@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Vulnerability Testing Methods@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def VulnerableDataSubject
  "Data Subjects which should be considered 'vulnerable' and therefore would require additional measures and safeguards"
  {:db/ident :dpvo/VulnerableDataSubject,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan Pandit"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg Krog"}],
   :dcterms/description
   #rdf/langString
    "Data Subjects which should be considered 'vulnerable' and therefore would require additional measures and safeguards@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This concept denotes a Data Subject or a group are vulnerable, but not what vulnerability they possess or its context. This information can be provided additionally as comments, or as separate concepts and relations. Proposals for this are welcome.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Vulnerable Data Subject@en",
   :rdfs/subClassOf
   [:dpvo/DataSubject :dpvo/NaturalPerson :dpvo/LegalEntity :dpvo/Entity],
   :vs/term_status #rdf/langString "accepted@en"})

(def WebBrowserSecurity
  "Security implemented at or over web browsers"
  {:db/ident :dpvo/WebBrowserSecurity,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Security implemented at or over web browsers@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "WebBrowser Security@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def WebSecurityProtocols
  "Security implemented at or over web-based protocols"
  {:db/ident :dpvo/WebSecurityProtocols,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Security implemented at or over web-based protocols@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Web Security Protocols@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def WirelessSecurityProtocols
  "Security implemented at or over wireless communication protocols"
  {:db/ident :dpvo/WirelessSecurityProtocols,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Security implemented at or over wireless communication protocols@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Wireless Security Protocols@en",
   :rdfs/subClassOf [:dpvo/SecurityMethod
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def WithinDevice
  "Location is local and entirely within a device, such as a smartphone"
  {:db/ident :dpvo/WithinDevice,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Location is local and entirely within a device, such as a smartphone@en",
   :dcterms/modified #xsd/date #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Within Device@en",
   :rdfs/subClassOf [:dpvo/LocalLocation :dpvo/LocationLocality :dpvo/Location],
   :vs/term_status #rdf/langString "modified@en"})

(def WithinPhysicalEnvironment
  "Location is local and entirely within a physical environment, such as a room"
  {:db/ident :dpvo/WithinPhysicalEnvironment,
   :dcterms/created #xsd/date #inst "2020-10-06T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Location is local and entirely within a physical environment, such as a room@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Within Physical Environment@en",
   :rdfs/subClassOf [:dpvo/LocalLocation :dpvo/LocationLocality :dpvo/Location],
   :vs/term_status #rdf/langString "accepted@en"})

(def WithinVirtualEnvironment
  "Location is local and entirely within a virtual environment, such as a shared network directory"
  {:db/ident :dpvo/WithinVirtualEnvironment,
   :dcterms/created #xsd/date #inst "2020-10-06T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Location is local and entirely within a virtual environment, such as a shared network directory@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Within Virtual Environment@en",
   :rdfs/subClassOf [:dpvo/LocalLocation :dpvo/LocationLocality :dpvo/Location],
   :vs/term_status #rdf/langString "accepted@en"})

(def ZeroKnowledgeAuthentication
  "Authentication using Zero-Knowledge proofs"
  {:db/ident :dpvo/ZeroKnowledgeAuthentication,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Authentication using Zero-Knowledge proofs@en",
   :dcterms/source
   {:rdfa/uri
    "https://www.enisa.europa.eu/publications/data-protection-engineering"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "Zero Knowledge Authentication@en",
   :rdfs/subClassOf [:dpvo/AuthenticationProtocols
                     :dpvo/CryptographicMethods
                     :dpvo/TechnicalMeasure
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def hasActivityStatus
  "Indicates the status of activity of specified concept"
  {:db/ident :dpvo/hasActivityStatus,
   :dcterms/created #xsd/date #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Indicates the status of activity of specified concept@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has activity status@en",
   :rdfs/range :dpvo/ActivityStatus,
   :rdfs/subPropertyOf :dpvo/hasStatus,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasAddress
  "Specifies address of a legal entity such as street address or pin code"
  {:db/ident :dpvo/hasAddress,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J.Pandit"}],
   :dcterms/description
   #rdf/langString
    "Specifies address of a legal entity such as street address or pin code@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Entity,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has address@en",
   :rdfs/range :owl/Thing,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasAlgorithmicLogic
  "Indicates the logic used in processing such as for automated decision making"
  {:db/ident :dpvo/hasAlgorithmicLogic,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Georg P. Krog"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Indicates the logic used in processing such as for automated decision making@en",
   :dcterms/modified #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has algorithmic logic@en",
   :rdfs/range :dpvo/AlgorithmicLogic,
   :vs/term_status #rdf/langString "changed@en"})

(def hasApplicableLaw
  "Indicates applicability of a Law"
  {:db/ident            :dpvo/hasApplicableLaw,
   :dcterms/created     #xsd/date #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Indicates applicability of a Law@en",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "has applicable law@en",
   :rdfs/range          :dpvo/Law,
   :vs/term_status      #rdf/langString "accepted@en"})

(def hasAuditStatus
  "Indicates the status of audit associated with specified concept"
  {:db/ident :dpvo/hasAuditStatus,
   :dcterms/created #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Indicates the status of audit associated with specified concept@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has audit status@en",
   :rdfs/range :dpvo/AuditStatus,
   :rdfs/subPropertyOf :dpvo/hasStatus,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasAuthority
  "Indicates applicability of authority for a jurisdiction"
  {:db/ident :dpvo/hasAuthority,
   :dcterms/created #xsd/date #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString "Indicates applicability of authority for a jurisdiction@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has authority@en",
   :rdfs/range :dpvo/Authority,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasComplianceStatus
  "Indicates the status of compliance of specified concept"
  {:db/ident :dpvo/hasComplianceStatus,
   :dcterms/created #xsd/date #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Indicates the status of compliance of specified concept@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has compliance status@en",
   :rdfs/range :dpvo/ComplianceStatus,
   :rdfs/subPropertyOf :dpvo/hasStatus,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasConsentStatus
  "Specifies the state or status of consent"
  {:db/ident            :dpvo/hasConsentStatus,
   :dcterms/created     #xsd/date #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Georg P Krog"}
                         {:xsd/string "Julian Flake"}
                         {:xsd/string "Paul Ryan"}
                         {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Specifies the state or status of consent@en",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "has consent status@en",
   :rdfs/range          :dpvo/ConsentStatus,
   :vs/term_status      #rdf/langString "accepted@en"})

(def hasConsequence
  "Indicates consenquence(s) possible or arising from specified concept"
  {:db/ident :dpvo/hasConsequence,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Beatriz Esteves"}],
   :dcterms/description
   #rdf/langString
    "Indicates consenquence(s) possible or arising from specified concept@en",
   :dcterms/modified #xsd/date #inst "2021-09-21T00:00:00.000-04:00",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment #rdf/langString "Removed plural suffix for consistency@en",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has consequence@en",
   :rdfs/range :dpvo/Consequence,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasConsequenceOn
  "Indicates the thing (e.g. plan, process, or entity) affected by a consequence"
  {:db/ident :dpvo/hasConsequenceOn,
   :dcterms/created #xsd/date #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Indicates the thing (e.g. plan, process, or entity) affected by a consequence@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :dpvo/Consequence,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has consequence on@en",
   :rdfs/range :owl/Thing,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasContact
  "Specifies contact details of a legal entity such as phone  or email"
  {:db/ident :dpvo/hasContact,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J.Pandit"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Specifies contact details of a legal entity such as phone  or email@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Entity,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has contact@en",
   :rdfs/range :owl/Thing,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasContext
  "Indicates a purpose is restricted to the specified context(s)"
  {:db/ident :dpvo/hasContext,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/description
   #rdf/langString
    "Indicates a purpose is restricted to the specified context(s)@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has context@en",
   :rdfs/range :dpvo/Context,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasCountry
  "Indicates applicability of specified country"
  {:db/ident            :dpvo/hasCountry,
   :dcterms/created     #xsd/date #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator     [{:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Georg P Krog"}],
   :dcterms/description #rdf/langString
                         "Indicates applicability of specified country@en",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "has country@en",
   :rdfs/range          :dpvo/Country,
   :rdfs/subPropertyOf  :dpvo/hasLocation,
   :vs/term_status      #rdf/langString "accepted@en"})

(def hasData
  "Indicates associated with Data (may or may not be personal)"
  {:db/ident :dpvo/hasData,
   :dcterms/created #xsd/date #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Indicates associated with Data (may or may not be personal)@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has data@en",
   :rdfs/range :dpvo/Data,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasDataController
  "Indicates association with Data Controller"
  {:db/ident            :dpvo/hasDataController,
   :dcterms/created     #xsd/date #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Javier Fernández"}
                         {:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Bud Bruegger"}
                         {:xsd/string "Mark Lizar"}
                         {:xsd/string "Axel Polleres"}],
   :dcterms/description #rdf/langString
                         "Indicates association with Data Controller@en",
   :dcterms/modified    #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "has data controller@en",
   :rdfs/range          [:dpvo/DataController :dpvo/LegalEntity],
   :rdfs/subPropertyOf  :dpvo/hasEntity,
   :vs/term_status      #rdf/langString "accepted@en"})

(def hasDataExporter
  "Indiciates inclusion or applicability of a LegalEntity in the role of Data Exporter"
  {:db/ident :dpvo/hasDataExporter,
   :dcterms/created #xsd/date #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P. Krog"}],
   :dcterms/description
   #rdf/langString
    "Indiciates inclusion or applicability of a LegalEntity in the role of Data Exporter@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has data exporter@en",
   :rdfs/range :dpvo/DataExporter,
   :rdfs/subPropertyOf :dpvo/hasEntity,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasDataImporter
  "Indiciates inclusion or applicability of a LegalEntity in the role of Data Importer"
  {:db/ident :dpvo/hasDataImporter,
   :dcterms/created #xsd/date #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P. Krog"}],
   :dcterms/description
   #rdf/langString
    "Indiciates inclusion or applicability of a LegalEntity in the role of Data Importer@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has data importer@en",
   :rdfs/range :dpvo/DataImporter,
   :rdfs/subPropertyOf [:dpvo/hasRecipient :dpvo/hasEntity],
   :vs/term_status #rdf/langString "accepted@en"})

(def hasDataProcessor
  "Indiciates inclusion or applicability of a Data Processor"
  {:db/ident :dpvo/hasDataProcessor,
   :dcterms/created #xsd/date #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P. Krog"}],
   :dcterms/description
   #rdf/langString
    "Indiciates inclusion or applicability of a Data Processor@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has data processor@en",
   :rdfs/range :dpvo/DataProcessor,
   :rdfs/subPropertyOf [:dpvo/hasRecipient :dpvo/hasEntity],
   :vs/term_status #rdf/langString "accepted@en"})

(def hasDataProtectionOfficer
  "Specifices an associated data protection officer"
  {:db/ident            :dpvo/hasDataProtectionOfficer,
   :dcterms/created     #xsd/date #inst "2022-03-02T00:00:00.000-05:00",
   :dcterms/creator     [{:xsd/string "Paul Ryan"} {:xsd/string "Rob Brennan"}],
   :dcterms/description #rdf/langString
                         "Specifices an associated data protection officer@en",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "has data protection officer@en",
   :rdfs/range          :dpvo/DataProtectionOfficer,
   :rdfs/subPropertyOf  [:dpvo/hasRepresentative :dpvo/hasEntity],
   :vs/term_status      #rdf/langString "accepted@en"})

(def hasDataSource
  "Indicates the source or origin of data being processed"
  {:db/ident :dpvo/hasDataSource,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P. Krog"}],
   :dcterms/description
   #rdf/langString "Indicates the source or origin of data being processed@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has data source@en",
   :rdfs/range :dpvo/DataSource,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasDataSubject
  "Indicates association with Data Subject"
  {:db/ident            :dpvo/hasDataSubject,
   :dcterms/created     #xsd/date #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Javier Fernández"}
                         {:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Axel Polleres"}
                         {:xsd/string "Bud Bruegger"}
                         {:xsd/string "Mark Lizar"}],
   :dcterms/description #rdf/langString
                         "Indicates association with Data Subject@en",
   :dcterms/modified    #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "has data subject@en",
   :rdfs/range          :dpvo/DataSubject,
   :rdfs/subPropertyOf  :dpvo/hasEntity,
   :vs/term_status      #rdf/langString "accepted@en"})

(def hasDataSubjectScale
  "Indicates the scale of data subjects"
  {:db/ident            :dpvo/hasDataSubjectScale,
   :dcterms/created     #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Indicates the scale of data subjects@en",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "has data subject scale@en",
   :rdfs/range          :dpvo/DataSubjectScale,
   :rdfs/subPropertyOf  :dpvo/hasScale,
   :vs/term_status      #rdf/langString "accepted@en"})

(def hasDataVolume
  "Indicates the volume of data"
  {:db/ident            :dpvo/hasDataVolume,
   :dcterms/created     #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Indicates the volume of data@en",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "has data volume@en",
   :rdfs/range          :dpvo/DataVolume,
   :rdfs/subPropertyOf  :dpvo/hasScale,
   :vs/term_status      #rdf/langString "accepted@en"})

(def hasDuration
  "Indicates information about duration"
  {:db/ident            :dpvo/hasDuration,
   :dcterms/created     #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Rob Brennan"}
                         {:xsd/string "Mark Lizar"}
                         {:xsd/string "Axel Polleres"}
                         {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Indicates information about duration@en",
   :dcterms/source      {:rdfa/uri "https://specialprivacy.ercim.eu/"},
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "has duration@en",
   :rdfs/range          :dpvo/Duration,
   :vs/term_status      #rdf/langString "accepted@en"})

(def hasEntity
  "Indicates inclusion or applicability of an entity to some concept"
  {:db/ident :dpvo/hasEntity,
   :dcterms/created #xsd/date #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Indicates inclusion or applicability of an entity to some concept@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #rdf/langString
    "parent property for controller, processor, data subject, authority, etc.?@en",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has entity@en",
   :rdfs/range :dpvo/Entity,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasFrequency
  "Indicates the frequency with which something takes place"
  {:db/ident :dpvo/hasFrequency,
   :dcterms/created #xsd/date #inst "2022-02-16T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Indicates the frequency with which something takes place@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has frequency@en",
   :rdfs/range :dpvo/Frequency,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasGeographicCoverage
  "Indicate the geographic coverage (of specified context)"
  {:db/ident :dpvo/hasGeographicCoverage,
   :dcterms/created #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Indicate the geographic coverage (of specified context)@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has geographic coverage@en",
   :rdfs/range :dpvo/GeographicCoverage,
   :rdfs/subPropertyOf :dpvo/hasScale,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasHumanInvolvement
  "Indicates Involvement of humans in processing such as within automated decision making process"
  {:db/ident :dpvo/hasHumanInvolvement,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P. Krog"}],
   :dcterms/description
   #rdf/langString
    "Indicates Involvement of humans in processing such as within automated decision making process@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #rdf/langString
    "Human involvement is also relevant to 'human in the loop'@en",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has human involvement@en",
   :rdfs/range :dpvo/HumanInvolvement,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasIdentifier
  "Indicates an identifier associated for identification or reference"
  {:db/ident :dpvo/hasIdentifier,
   :dcterms/created #xsd/date #inst "2020-11-25T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J.Pandit"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Beatriz Esteves"}],
   :dcterms/description
   #rdf/langString
    "Indicates an identifier associated for identification or reference@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has identifier@en",
   :rdfs/range :owl/Thing,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasImpact
  "Indicates impact(s) possible or arising as consequences from specified concept"
  {:db/ident :dpvo/hasImpact,
   :dcterms/created #xsd/date #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Julian Flake"}],
   :dcterms/description
   #rdf/langString
    "Indicates impact(s) possible or arising as consequences from specified concept@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has impact@en",
   :rdfs/range :dpvo/Impact,
   :rdfs/subPropertyOf :dpvo/hasConsequence,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasImpactOn
  "Indicates the thing (e.g. plan, process, or entity) affected by an impact"
  {:db/ident :dpvo/hasImpactOn,
   :dcterms/created #xsd/date #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Beatriz Esteves"}],
   :dcterms/description
   #rdf/langString
    "Indicates the thing (e.g. plan, process, or entity) affected by an impact@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :dpvo/Impact,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has impact on@en",
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf :dpvo/hasConsequenceOn,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasIndicationMethod
  "Specifies the method by which an entity has indicated the specific context"
  {:db/ident :dpvo/hasIndicationMethod,
   :dcterms/created #xsd/date #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}],
   :dcterms/description
   #rdf/langString
    "Specifies the method by which an entity has indicated the specific context@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has indication method@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def hasJointDataControllers
  "Indicates inclusion or applicability of a Joint Data Controller"
  {:db/ident :dpvo/hasJointDataControllers,
   :dcterms/created #xsd/date #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P. Krog"}],
   :dcterms/description
   #rdf/langString
    "Indicates inclusion or applicability of a Joint Data Controller@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has joint data controllers@en",
   :rdfs/range :dpvo/JointDataControllers,
   :rdfs/subPropertyOf [:dpvo/hasDataController :dpvo/hasEntity],
   :vs/term_status #rdf/langString "accepted@en"})

(def hasJurisdiction
  "Indicates applicability of specified jurisdiction"
  {:db/ident            :dpvo/hasJurisdiction,
   :dcterms/created     #xsd/date #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Indicates applicability of specified jurisdiction@en",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "has jurisdiction@en",
   :rdfs/range          :dpvo/Location,
   :vs/term_status      #rdf/langString "accepted@en"})

(def hasJustification
  "Indicates a justification for specified concept or context"
  {:db/ident :dpvo/hasJustification,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Indicates a justification for specified concept or context@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has justification@en",
   :rdfs/range :dpvo/Justification,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasLawfulness
  "Indicates the status of being lawful or legally compliant"
  {:db/ident :dpvo/hasLawfulness,
   :dcterms/created #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Indicates the status of being lawful or legally compliant@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has lawfulness@en",
   :rdfs/range :dpvo/Lawfulness,
   :rdfs/subPropertyOf [:dpvo/hasComplianceStatus :dpvo/hasStatus],
   :vs/term_status #rdf/langString "accepted@en"})

(def hasLegalBasis
  "Indicates use or applicability of a Legal Basis"
  {:db/ident            :dpvo/hasLegalBasis,
   :dcterms/created     #xsd/date #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Axel Polleres"}
                         {:xsd/string "Javier Fernández"}],
   :dcterms/description #rdf/langString
                         "Indicates use or applicability of a Legal Basis@en",
   :dcterms/modified    #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "has legal basis@en",
   :rdfs/range          :dpvo/LegalBasis,
   :vs/term_status      #rdf/langString "accepted@en"})

(def hasLikelihood
  "Indicates the likelihood associated with a concept"
  {:db/ident :dpvo/hasLikelihood,
   :dcterms/created #xsd/date #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString "Indicates the likelihood associated with a concept@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has likelihood@en",
   :rdfs/range :dpvo/Likelihood,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasLocation
  "Indicates information about location"
  {:db/ident            :dpvo/hasLocation,
   :dcterms/created     #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Mark Lizar"}
                         {:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Rob Brennan"}
                         {:xsd/string "Axel Polleres"}],
   :dcterms/description #rdf/langString
                         "Indicates information about location@en",
   :dcterms/source      {:rdfa/uri "https://specialprivacy.ercim.eu/"},
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "has location@en",
   :rdfs/range          :dpvo/Location,
   :vs/term_status      #rdf/langString "accepted@en"})

(def hasName
  "Specifies name of a legal entity"
  {:db/ident            :dpvo/hasName,
   :dcterms/created     #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator     [{:xsd/string "Harshvardhan J.Pandit"}
                         {:xsd/string "Georg P Krog"}
                         {:xsd/string "Beatriz Esteves"}
                         {:xsd/string "Paul Ryan"}],
   :dcterms/description #rdf/langString "Specifies name of a legal entity@en",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :dpvo/Entity,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "has name@en",
   :rdfs/range          :owl/Thing,
   :vs/term_status      #rdf/langString "accepted@en"})

(def hasNotice
  "Indicates the use or applicability of a Notice for the specified context"
  {:db/ident :dpvo/hasNotice,
   :dcterms/created #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Julian Flake"}],
   :dcterms/description
   #rdf/langString
    "Indicates the use or applicability of a Notice for the specified context@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has notice@en",
   :rdfs/range :dpvo/Notice,
   :rdfs/subPropertyOf [:dpvo/hasOrganisationalMeasure
                        :dpvo/hasTechnicalOrganisationalMeasure],
   :vs/term_status #rdf/langString "accepted@en"})

(def hasObligation
  "Specifying applicability or inclusion of an obligation rule within specified context"
  {:db/ident :dpvo/hasObligation,
   :dcterms/created #xsd/date #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Specifying applicability or inclusion of an obligation rule within specified context@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Context,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has obligation@en",
   :rdfs/range :dpvo/Obligation,
   :rdfs/subPropertyOf :dpvo/hasRule,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasOrganisationalMeasure
  "Indicates use or applicability of Organisational measure"
  {:db/ident :dpvo/hasOrganisationalMeasure,
   :dcterms/created #xsd/date #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Indicates use or applicability of Organisational measure@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has organisational measure@en",
   :rdfs/range :dpvo/OrganisationalMeasure,
   :rdfs/subPropertyOf :dpvo/hasTechnicalOrganisationalMeasure,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasOutcome
  "Indicates an outcome of specified concept or context"
  {:db/ident :dpvo/hasOutcome,
   :dcterms/created #xsd/date #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Indicates an outcome of specified concept or context@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has outcome@en",
   :rdfs/range :owl/Thing,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasPermission
  "Specifying applicability or inclusion of a permission rule within specified context"
  {:db/ident :dpvo/hasPermission,
   :dcterms/created #xsd/date #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Specifying applicability or inclusion of a permission rule within specified context@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Context,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has permission@en",
   :rdfs/range :dpvo/Permission,
   :rdfs/subPropertyOf :dpvo/hasRule,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasPersonalData
  "Indicates association with Personal Data"
  {:db/ident            :dpvo/hasPersonalData,
   :dcterms/created     #xsd/date #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Indicates association with Personal Data@en",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "has personal data@en",
   :rdfs/range          :dpvo/PersonalData,
   :rdfs/subPropertyOf  :dpvo/hasData,
   :vs/term_status      #rdf/langString "accepted@en"})

(def hasPersonalDataHandling
  "Indicates association with Personal Data Handling"
  {:db/ident            :dpvo/hasPersonalDataHandling,
   :dcterms/created     #xsd/date #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator     [{:xsd/string "Georg P Krog"}
                         {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Indicates association with Personal Data Handling@en",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "has personal data handling@en",
   :rdfs/range          :dpvo/PersonalDataHandling,
   :vs/term_status      #rdf/langString "accepted@en"})

(def hasPolicy
  "Indicates policy applicable or used"
  {:db/ident            :dpvo/hasPolicy,
   :dcterms/created     #xsd/date #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Indicates policy applicable or used@en",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "has policy@en",
   :rdfs/range          :dpvo/Policy,
   :rdfs/subPropertyOf  :dpvo/hasTechnicalOrganisationalMeasure,
   :vs/term_status      #rdf/langString "accepted@en"})

(def hasProcessing
  "Indicates association with Processing"
  {:db/ident            :dpvo/hasProcessing,
   :dcterms/created     #xsd/date #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Axel Polleres"}
                         {:xsd/string "Bud Bruegger"}
                         {:xsd/string "Javier Fernández"}
                         {:xsd/string "Mark Lizar"}
                         {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Indicates association with Processing@en",
   :dcterms/modified    #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source      {:rdfa/uri "https://specialprivacy.ercim.eu/"},
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "has processing@en",
   :rdfs/range          :dpvo/Processing,
   :vs/term_status      #rdf/langString "accepted@en"})

(def hasProcessingAutomation
  "Indicates the use or extent of automation associated with processing"
  {:db/ident :dpvo/hasProcessingAutomation,
   :dcterms/created #xsd/date #inst "2022-08-13T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Indicates the use or extent of automation associated with processing@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has processing automation@en",
   :rdfs/range :dpvo/AutomationOfProcessing,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasProhibition
  "Specifying applicability or inclusion of a prohibition rule within specified context"
  {:db/ident :dpvo/hasProhibition,
   :dcterms/created #xsd/date #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Specifying applicability or inclusion of a prohibition rule within specified context@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Context,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has prohibition@en",
   :rdfs/range :dpvo/Prohibition,
   :rdfs/subPropertyOf :dpvo/hasRule,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasPurpose
  "Indicates association with Purpose"
  {:db/ident            :dpvo/hasPurpose,
   :dcterms/created     #xsd/date #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Axel Polleres"}
                         {:xsd/string "Bud Bruegger"}
                         {:xsd/string "Mark Lizar"}
                         {:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Javier Fernández"}],
   :dcterms/description #rdf/langString "Indicates association with Purpose@en",
   :dcterms/modified    #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source      {:rdfa/uri "https://specialprivacy.ercim.eu/"},
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "has purpose@en",
   :rdfs/range          :dpvo/Purpose,
   :vs/term_status      #rdf/langString "accepted@en"})

(def hasRecipient
  "Indicates Recipient of Personal Data"
  {:db/ident            :dpvo/hasRecipient,
   :dcterms/created     #xsd/date #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Bud Bruegger"}
                         {:xsd/string "Javier Fernández"}
                         {:xsd/string "Axel Polleres"}
                         {:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Mark Lizar"}],
   :dcterms/description #rdf/langString
                         "Indicates Recipient of Personal Data@en",
   :dcterms/modified    #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source      {:rdfa/uri "https://specialprivacy.ercim.eu/"},
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "has recipient@en",
   :rdfs/range          :dpvo/Recipient,
   :rdfs/subPropertyOf  :dpvo/hasEntity,
   :vs/term_status      #rdf/langString "accepted@en"})

(def hasRecipientDataController
  "Indiciates inclusion or applicability of a Data Controller as a Recipient of persona data"
  {:db/ident :dpvo/hasRecipientDataController,
   :dcterms/created #xsd/date #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Georg P. Krog"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Indiciates inclusion or applicability of a Data Controller as a Recipient of persona data@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has recipient data controller@en",
   :rdfs/range :dpvo/DataController,
   :rdfs/subPropertyOf [:dpvo/hasRecipient :dpvo/hasEntity],
   :vs/term_status #rdf/langString "accepted@en"})

(def hasRecipientThirdParty
  "Indiciates inclusion or applicability of a Third Party as a Recipient of persona data"
  {:db/ident :dpvo/hasRecipientThirdParty,
   :dcterms/created #xsd/date #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P. Krog"}],
   :dcterms/description
   #rdf/langString
    "Indiciates inclusion or applicability of a Third Party as a Recipient of persona data@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has recipient third party@en",
   :rdfs/range :dpvo/ThirdParty,
   :rdfs/subPropertyOf [:dpvo/hasRecipient :dpvo/hasEntity],
   :vs/term_status #rdf/langString "accepted@en"})

(def hasRelationWithDataSubject
  "Indicates the relation between specified Entity and Data Subject"
  {:db/ident :dpvo/hasRelationWithDataSubject,
   :dcterms/created #xsd/date #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString
    "Indicates the relation between specified Entity and Data Subject@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :dpvo/Entity,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has relation with data subject@en",
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf :dpvo/hasEntity,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasRepresentative
  "Specifies representative of the legal entity"
  {:db/ident            :dpvo/hasRepresentative,
   :dcterms/created     #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator     [{:xsd/string "Beatriz Esteves"}
                         {:xsd/string "Paul Ryan"}
                         {:xsd/string "Georg P Krog"}
                         {:xsd/string "Harshvardhan J.Pandit"}],
   :dcterms/description #rdf/langString
                         "Specifies representative of the legal entity@en",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :dpvo/Entity,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "has representative@en",
   :rdfs/range          :dpvo/Representative,
   :rdfs/subPropertyOf  :dpvo/hasEntity,
   :vs/term_status      #rdf/langString "accepted@en"})

(def hasResidualRisk
  "Indicates the associated risk is the remaining or residual risk from applying mitigation measures or treatments to this risk"
  {:db/ident :dpvo/hasResidualRisk,
   :dcterms/created #xsd/date #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Indicates the associated risk is the remaining or residual risk from applying mitigation measures or treatments to this risk@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Risk,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has residual risk@en",
   :rdfs/range :dpvo/Risk,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasResponsibleEntity
  "Specifies the indicated entity is responsible within some context"
  {:db/ident :dpvo/hasResponsibleEntity,
   :dcterms/created #xsd/date #inst "2022-03-02T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Specifies the indicated entity is responsible within some context@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has responsible entity@en",
   :rdfs/range :dpvo/Entity,
   :rdfs/subPropertyOf :dpvo/hasEntity,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasRight
  "Indicates use or applicability of Right"
  {:db/ident            :dpvo/hasRight,
   :dcterms/created     #xsd/date #inst "2020-11-18T00:00:00.000-05:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Indicates use or applicability of Right@en",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "has right@en",
   :rdfs/range          :dpvo/Right,
   :vs/term_status      #rdf/langString "accepted@en"})

(def hasRisk
  "has risk"
  {:db/ident :dpvo/hasRisk,
   :dcterms/created #xsd/date #inst "2020-11-18T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   [#rdf/langString "Indicates applicability of Risk@en"
    #rdf/langString "Indicates applicability of Risk for this concept@en"],
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has risk@en",
   :rdfs/range :dpvo/Risk,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasRiskLevel
  "Indicates the associated risk level associated with a risk"
  {:db/ident :dpvo/hasRiskLevel,
   :dcterms/created #xsd/date #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}],
   :dcterms/description
   #rdf/langString
    "Indicates the associated risk level associated with a risk@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Risk,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has risk level@en",
   :rdfs/range :dpvo/RiskLevel,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasRule
  "Specifying applicability or inclusion of a rule within specified context"
  {:db/ident :dpvo/hasRule,
   :dcterms/created #xsd/date #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Specifying applicability or inclusion of a rule within specified context@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Context,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has rule@en",
   :rdfs/range :dpvo/Rule,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasScale
  "Indicates the scale of specified concept"
  {:db/ident            :dpvo/hasScale,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Indicates the scale of specified concept@en",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "has scale@en",
   :rdfs/range          :dpvo/Scale,
   :vs/term_status      #rdf/langString "accepted@en"})

(def hasScope
  "Indicates the scope of specified concept or context"
  {:db/ident :dpvo/hasScope,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Indicates the scope of specified concept or context@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has scope@en",
   :rdfs/range :dpvo/Scope,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasSector
  "Indicates the purpose is associated with activities in the indicated (Economic) Sector(s)"
  {:db/ident :dpvo/hasSector,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/description
   #rdf/langString
    "Indicates the purpose is associated with activities in the indicated (Economic) Sector(s)@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has sector@en",
   :rdfs/range :dpvo/Sector,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasSeverity
  "Indicates the severity associated with a concept"
  {:db/ident            :dpvo/hasSeverity,
   :dcterms/created     #xsd/date #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Julian Flake"}
                         {:xsd/string "Georg P Krog"}
                         {:xsd/string "Paul Ryan"}],
   :dcterms/description #rdf/langString
                         "Indicates the severity associated with a concept@en",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "has severity@en",
   :rdfs/range          :dpvo/Severity,
   :vs/term_status      #rdf/langString "accepted@en"})

(def hasStatus
  "Indicates the status of specified concept"
  {:db/ident            :dpvo/hasStatus,
   :dcterms/created     #xsd/date #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Indicates the status of specified concept@en",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "has status@en",
   :rdfs/range          :dpvo/Status,
   :vs/term_status      #rdf/langString "accepted@en"})

(def hasStorageCondition
  "Indicates information about storage condition"
  {:db/ident            :dpvo/hasStorageCondition,
   :dcterms/created     #xsd/date #inst "2022-08-13T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Mark Lizar"}
                         {:xsd/string "Axel Polleres"}
                         {:xsd/string "Rob Brennan"}],
   :dcterms/description #rdf/langString
                         "Indicates information about storage condition@en",
   :dcterms/source      {:rdfa/uri "https://specialprivacy.ercim.eu/"},
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "has storage condition@en",
   :rdfs/range          :dpvo/StorageCondition,
   :vs/term_status      #rdf/langString "changed@en"})

(def hasTechnicalMeasure
  "Indicates use or applicability of Technical measure"
  {:db/ident :dpvo/hasTechnicalMeasure,
   :dcterms/created #xsd/date #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Indicates use or applicability of Technical measure@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has technical measure@en",
   :rdfs/range :dpvo/TechnicalMeasure,
   :rdfs/subPropertyOf :dpvo/hasTechnicalOrganisationalMeasure,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasTechnicalOrganisationalMeasure
  "Indicates use or applicability of Technical or Organisational measure"
  {:db/ident :dpvo/hasTechnicalOrganisationalMeasure,
   :dcterms/created #xsd/date #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Mark Lizar"}
                     {:xsd/string "Axel Polleres"}
                     {:xsd/string "Javier Fernández"}
                     {:xsd/string "Bud Bruegger"}],
   :dcterms/description
   #rdf/langString
    "Indicates use or applicability of Technical or Organisational measure@en",
   :dcterms/modified #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has technical and organisational measure@en",
   :rdfs/range :dpvo/TechnicalOrganisationalMeasure,
   :vs/term_status #rdf/langString "accepted@en"})

(def hasThirdCountry
  "Indicates applicability or relevance of a 'third country'"
  {:db/ident :dpvo/hasThirdCountry,
   :dcterms/created #xsd/date #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Indicates applicability or relevance of a 'third country'@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "has third country@en",
   :rdfs/range :dpvo/ThirdCountry,
   :rdfs/subPropertyOf [:dpvo/hasCountry :dpvo/hasLocation],
   :vs/term_status #rdf/langString "accepted@en"})

(def isAfter
  "Indicates the specified concepts is 'after' this concept in some context"
  {:db/ident :dpvo/isAfter,
   :dcterms/created #xsd/date #inst "2022-03-02T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Georg P. Krog"}],
   :dcterms/description
   #rdf/langString
    "Indicates the specified concepts is 'after' this concept in some context@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "is after@en",
   :rdfs/range :owl/Thing,
   :vs/term_status #rdf/langString "accepted@en"})

(def isAuthorityFor
  "Indicates area, scope, or applicability of an Authority"
  {:db/ident :dpvo/isAuthorityFor,
   :dcterms/created #xsd/date #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString "Indicates area, scope, or applicability of an Authority@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :dpvo/Authority,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "is authority for@en",
   :rdfs/range :owl/Thing,
   :vs/term_status #rdf/langString "accepted@en"})

(def isBefore
  "Indicates the specified concepts is 'before' this concept in some context"
  {:db/ident :dpvo/isBefore,
   :dcterms/created #xsd/date #inst "2022-03-02T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Georg P. Krog"}],
   :dcterms/description
   #rdf/langString
    "Indicates the specified concepts is 'before' this concept in some context@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "is before@en",
   :rdfs/range :owl/Thing,
   :vs/term_status #rdf/langString "accepted@en"})

(def isExercisedAt
  "Indicates context or information about exercising a right"
  {:db/ident :dpvo/isExercisedAt,
   :dcterms/created #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Indicates context or information about exercising a right@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/ActiveRight,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "is exercised at@en",
   :rdfs/range :dpvo/RightExerciseNotice,
   :vs/term_status #rdf/langString "accepted@en"})

(def isImplementedByEntity
  "Indicates implementation details such as entities or agents"
  {:db/ident :dpvo/isImplementedByEntity,
   :dcterms/created #xsd/date #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Axel Polleres"}],
   :dcterms/description
   #rdf/langString
    "Indicates implementation details such as entities or agents@en",
   :dcterms/modified #xsd/date #inst "2022-01-26T00:00:00.000-05:00",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #rdf/langString
    "The use of 'entity' is inclusive of entities (e.g. Data Processor) as well as 'agent' (e.g. DPO). For indicating technological implementation, the property isImplementedByTechnology should be used.@en",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "is implemented by entity@en",
   :rdfs/range :dpvo/Entity,
   :vs/term_status #rdf/langString "changed@en"})

(def isImplementedUsingTechnology
  "Indicates implementation details such as technologies or processes"
  {:db/ident :dpvo/isImplementedUsingTechnology,
   :dcterms/created #xsd/date #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Beatriz Esteves"}],
   :dcterms/description
   #rdf/langString
    "Indicates implementation details such as technologies or processes@en",
   :dcterms/modified #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #rdf/langString
    "The term 'technology' is inclusive of technologies, processes, and methods.@en",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "is implemented using technology@en",
   :rdfs/range :dpvo/Technology,
   :vs/term_status #rdf/langString "changed@en"})

(def isIndicatedAtTime
  "Specifies the temporal information for when the entity has indicated the specific context"
  {:db/ident :dpvo/isIndicatedAtTime,
   :dcterms/created #xsd/date #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString
    "Specifies the temporal information for when the entity has indicated the specific context@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "is indicated at time@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def isIndicatedBy
  "Specifies entity who indicates the specific context"
  {:db/ident :dpvo/isIndicatedBy,
   :dcterms/created #xsd/date #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Julian Flake"}],
   :dcterms/description
   #rdf/langString "Specifies entity who indicates the specific context@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "is indicated by@en",
   :rdfs/range :dpvo/Entity,
   :vs/term_status #rdf/langString "accepted@en"})

(def isMitigatedByMeasure
  "Indicate a risk is mitigated by specified measure"
  {:db/ident            :dpvo/isMitigatedByMeasure,
   :dcterms/created     #xsd/date #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Indicate a risk is mitigated by specified measure@en",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :dpvo/Risk,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "is mitigated by measure@en",
   :rdfs/range          :dpvo/RiskMitigationMeasure,
   :rdfs/subPropertyOf  :dpvo/hasTechnicalOrganisationalMeasure,
   :vs/term_status      #rdf/langString "accepted@en"})

(def isPolicyFor
  "Indicates the context or application of policy"
  {:db/ident            :dpvo/isPolicyFor,
   :dcterms/created     #xsd/date #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Indicates the context or application of policy@en",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :dpvo/Policy,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "is policy for@en",
   :rdfs/range          :owl/Thing,
   :vs/term_status      #rdf/langString "accepted@en"})

(def isRepresentativeFor
  "Indicates the entity is a representative for specified entity"
  {:db/ident :dpvo/isRepresentativeFor,
   :dcterms/created #xsd/date #inst "2022-11-09T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Indicates the entity is a representative for specified entity@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Representative,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "is representative for@en",
   :rdfs/range :dpvo/Entity,
   :rdfs/subPropertyOf :dpvo/hasEntity,
   :vs/term_status #rdf/langString "accepted@en"})

(def isResidualRiskOf
  "Indicates this risk is the remaining or residual risk from applying mitigation measures or treatments to specified risk"
  {:db/ident :dpvo/isResidualRiskOf,
   :dcterms/created #xsd/date #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString
    "Indicates this risk is the remaining or residual risk from applying mitigation measures or treatments to specified risk@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Risk,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label #rdf/langString "is residual risk of@en",
   :rdfs/range :dpvo/Risk,
   :vs/term_status #rdf/langString "accepted@en"})

(def mitigatesRisk
  "Indicates risks mitigated by this concept"
  {:db/ident            :dpvo/mitigatesRisk,
   :dcterms/created     #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Indicates risks mitigated by this concept@en",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :dpvo/RiskMitigationMeasure,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          #rdf/langString "mitigates risk@en",
   :rdfs/range          :dpvo/Risk,
   :vs/term_status      #rdf/langString "accepted@en"})
