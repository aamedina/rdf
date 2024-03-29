(ns net.wikipunk.rdf.dpvo
  {:dcat/downloadURL "net/wikipunk/ext/dpv-owl/dpv.ttl",
   :dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "The Data Privacy Vocabulary (DPV) provides terms (classes and properties) to represent information about legally compliant personal data handling, which includes purposes, processing, personal data, technical and organisational measures."},
   :dcterms/contributor
   #{"Fajar J. Ekaputra" "Rigo Wenning" "Georg P Krog" "Ramisa Gachpaz Hamed"
     "Axel Polleres" "Simon Steyskal" "Harshvardhan J. Pandit" "Beatriz Esteves"
     "Eva Schlehahn" "Rob Brennan" "Bert Bos" "Julian Flake" "Paul Ryan"
     "Bud Bruegger" "Piero Bonatti" "Elmar Kiesling" "Javier D. Fernández"
     "Mark Lizar"},
   :dcterms/created #inst "2019-06-18T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Data Privacy Vocabulary (DPV) provides terms (classes and properties) to represent information about legally compliant personal data handling, which includes purposes, processing, personal data, technical and organisational measures."},
   :dcterms/license {:xsd/anyURI
                     "https://www.w3.org/Consortium/Legal/2015/doc-license"},
   :dcterms/modified #inst "2022-12-05T00:00:00.000-00:00",
   :dcterms/source {:xsd/anyURI "https://www.w3.org/community/dpvcg/"},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Data Privacy Vocabulary"},
   :namespaces {"dcat"    "http://www.w3.org/ns/dcat#",
                "dcterms" "http://purl.org/dc/terms/",
                "dpv"     "https://w3id.org/dpv#",
                "dpvo"    "https://w3id.org/dpv/dpv-owl#",
                "foaf"    "http://xmlns.com/foaf/0.1/",
                "owl"     "http://www.w3.org/2002/07/owl#",
                "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                "skos"    "http://www.w3.org/2004/02/skos/core#",
                "vann"    "http://purl.org/vocab/vann/",
                "vs"      "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :owl/versionInfo "1",
   :rdf/type :owl/Ontology,
   :rdfa/prefix "dpvo",
   :rdfa/uri "https://w3id.org/dpv/dpv-owl#",
   :vann/preferredNamespacePrefix "dpvo",
   :vann/preferredNamespaceUri "https://w3id.org/dpv/dpv-owl#",
   :xsd/anyURI "https://w3id.org/dpv/dpv-owl"})

(def AcademicResearch
  {:db/ident :dpvo/AcademicResearch,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with conducting or assisting with research conducted in an academic context e.g. within universities"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Academic Research"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/purposes#Education"},
   :rdfs/subClassOf :dpvo/ResearchAndDevelopment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AcademicScientificOrganisation
  {:db/ident :dpvo/AcademicScientificOrganisation,
   :dcterms/created #inst "2022-02-02T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Organisations related to academia or scientific pursuits e.g. Universities, Schools, Research Bodies"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-00:00",
   :dcterms/source {:xsd/anyURI "http://purl.org/adms"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Academic or Scientific Organisation"},
   :rdfs/subClassOf :dpvo/Organisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def Access
  {:db/ident            :dpvo/Access,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to access data"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Access"},
   :rdfs/subClassOf     :dpvo/Use,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def AccessControlMethod
  {:db/ident :dpvo/AccessControlMethod,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Methods which restrict access to a place or resource"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Access Control Method"},
   :rdfs/subClassOf :dpvo/TechnicalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AccountManagement
  {:db/ident :dpvo/AccountManagement,
   :dcterms/created #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Account Management refers to purposes associated with account management, such as to create, provide, maintain, and manage accounts"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Account Management"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Acquire
  {:db/ident :dpvo/Acquire,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "to come into possession or control of the data"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Acquire"},
   :rdfs/subClassOf :dpvo/Obtain,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ActiveRight
  {:db/ident :dpvo/ActiveRight,
   :dcterms/created #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"} {:rdf/value "Georg P Krog"}
                      {:rdf/value "Harshvardhan J Pandit"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The right(s) applicable, provided, or expected that need to be (actively) exercised"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Active rights require the entity to expressly exercise them. For example, a Data Subject exercising their right to withdraw their consent."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Active Right"},
   :rdfs/subClassOf :dpvo/Right,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ActivityCompleted
  {:db/ident :dpvo/ActivityCompleted,
   :dcterms/created #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State of an activity that has completed i.e. is fully in the past"},
   :rdf/type #{:owl/NamedIndividual :dpvo/ActivityStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Activity Completed"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ActivityHalted
  {:db/ident :dpvo/ActivityHalted,
   :dcterms/created #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State of an activity that was occuring in the past, and has been halted or paused or stoped"},
   :rdf/type #{:owl/NamedIndividual :dpvo/ActivityStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Activity Halted"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ActivityMonitoring
  {:db/ident :dpvo/ActivityMonitoring,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Monitoring of activities including assessing whether they have been successfully initiated and completed"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Activity Monitoring"},
   :rdfs/subClassOf :dpvo/TechnicalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ActivityNotCompleted
  {:db/ident :dpvo/ActivityNotCompleted,
   :dcterms/created #inst "2022-11-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State of an activity that could not be completed, but has reached some end state"},
   :rdf/type #{:owl/NamedIndividual :dpvo/ActivityStatus},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This relates to a 'Stop' state as distinct from a 'Halt' state. It makes no comments on whether the Acitivity can be resumed or continued towards completion."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Acitivity Not Completed"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ActivityOngoing
  {:db/ident :dpvo/ActivityOngoing,
   :dcterms/created #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State of an activity occuring in continuation i.e. currently ongoing"},
   :rdf/type #{:owl/NamedIndividual :dpvo/ActivityStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Activity Ongoing"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ActivityProposed
  {:db/ident :dpvo/ActivityProposed,
   :dcterms/created #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State of an activity being proposed or planned i.e. yet to occur"},
   :rdf/type #{:owl/NamedIndividual :dpvo/ActivityStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Activity Proposed"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ActivityStatus
  {:db/ident :dpvo/ActivityStatus,
   :dcterms/created #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Status associated with activity operations and lifecycles"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Activity Status"},
   :rdfs/subClassOf :dpvo/Status,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Adapt
  {:db/ident :dpvo/Adapt,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "to modify the data, often rewritten into a new form for a new use"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Adapt"},
   :rdfs/subClassOf :dpvo/Transform,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Adult
  {:db/ident :dpvo/Adult,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Georg Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A natural person that is not a child i.e. has attained some legally specified age of adulthood"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Adult"},
   :rdfs/subClassOf :dpvo/DataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Advertising
  {:db/ident :dpvo/Advertising,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with conducting advertising i.e. process or artefact used to call attention to a product, service, etc. through announcements, notices, or other forms of communication"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Advertising is a subset of Marketing. Advertising by itself does not indicate 'personalisation' i.e. personalised ads."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Advertising"},
   :rdfs/subClassOf :dpvo/Marketing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AlgorithmicLogic
  {:db/ident :dpvo/AlgorithmicLogic,
   :dcterms/created #inst "2022-01-26T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "The algorithmic logic applied or used"},
   :dcterms/modified #inst "2022-06-15T00:00:00.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Algorithmic Logic is intended as a broad concept for explaining the use of algorithms and automated decisions making within Processing. To describe the actual algorithm, see the Algorithm concept."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Algorithmic Logic"},
   :rdfs/subClassOf :dpvo/AutomationOfProcessing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Align
  {:db/ident :dpvo/Align,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "to adjust the data to be in relation to another data"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Align"},
   :rdfs/subClassOf :dpvo/Transform,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Alter
  {:db/ident :dpvo/Alter,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "to change the data without changing it into something else"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Alter"},
   :rdfs/subClassOf :dpvo/Transform,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Analyse
  {:db/ident :dpvo/Analyse,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "to study or examine the data in detail"},
   :dcterms/source {:xsd/anyURI
                    "https://specialprivacy.ercim.eu/vocabs/processing"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Analyse"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/processing#Analyse"},
   :rdfs/subClassOf :dpvo/Use,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Anonymisation
  {:db/ident :dpvo/Anonymisation,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Anonymisation is the process by which data is irreversibly altered in such a way that a data subject can no longer be identified directly or indirectly, either by the entity holding the data alone or in collaboration with other entities and information sources"},
   :dcterms/modified #inst "2022-11-24T00:00:00.000-00:00",
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/45123.html"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Anonymisation"},
   :rdfs/subClassOf :dpvo/Deidentification,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def Anonymise
  {:db/ident :dpvo/Anonymise,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "to irreversibly alter personal data in such a way that an unique data subject can no longer be identified directly or indirectly or in combination with other data"},
   :dcterms/source {:xsd/anyURI
                    "https://specialprivacy.ercim.eu/vocabs/processing"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Anonymise"},
   :rdfs/seeAlso
   {:xsd/anyURI "https://specialprivacy.ercim.eu/vocabs/processing#Anonymise"},
   :rdfs/subClassOf :dpvo/Transform,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AnonymisedData
  {:db/ident :dpvo/AnonymisedData,
   :dcterms/created #inst "2022-01-19T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Piero Bonatti"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Personal Data that has been (fully and completely) anonymised so that it is no longer considered Personal Data"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "It is advised to carefully consider indicating data is fully or completely anonymised by determining whether the data by itself or in combination with other data can identify a person. Failing this condition, the data should be denoted as PseudonymisedData. To indicate data is anonymised only for a specified entity (e.g. within an organisation), the concept ContextuallyAnonymisedData (as subclass of PseudonymisedData) should be used instead of AnonymisedData."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Anonymised Data"},
   :rdfs/subClassOf :dpvo/NonPersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AntiTerrorismOperations
  {:db/ident :dpvo/AntiTerrorismOperations,
   :dcterms/created #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with activities that detect, prevent, mitigate, or perform other activities for anti-terrorism"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Anti-Terrorism Operations"},
   :rdfs/subClassOf :dpvo/EnforceSecurity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Applicant
  {:db/ident            :dpvo/Applicant,
   :dcterms/created     #inst "2022-04-06T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Beatriz Esteves"}
                          {:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Paul Ryan"} {:rdf/value "Georg P. Krog"}
                          {:rdf/value "Julian Flake"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Data subjects that are applicants in some context"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Applicant"},
   :rdfs/subClassOf     :dpvo/DataSubject,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Assess
  {:db/ident            :dpvo/Assess,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to assess data for some criteria"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Assess"},
   :rdfs/subClassOf     :dpvo/Use,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Assessment
  {:db/ident :dpvo/Assessment,
   :dcterms/created #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The document, plan, or process for assessment or determination towards a purpose e.g. assessment of legality or impact assessments"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Assessment"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AssetManagementProcedures
  {:db/ident :dpvo/AssetManagementProcedures,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Procedures related to management of assets"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Asset Management Procedures"},
   :rdfs/subClassOf :dpvo/GovernanceProcedures,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AsylumSeeker
  {:db/ident            :dpvo/AsylumSeeker,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Georg P Krog"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Data subjects that are asylum seekers"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Asylum Seeker"},
   :rdfs/subClassOf     :dpvo/VulnerableDataSubject,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def AsymmetricCryptography
  {:db/ident :dpvo/AsymmetricCryptography,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of public-key cryptography or asymmetric cryptography involving a public and private pair of keys"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Asymmetric Cryptography"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AsymmetricEncryption
  {:db/ident :dpvo/AsymmetricEncryption,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Use of asymmetric cryptography to encrypt data"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Asymmetric Encryption"},
   :rdfs/subClassOf :dpvo/Encryption,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AuditApproved
  {:db/ident            :dpvo/AuditApproved,
   :dcterms/created     #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "State of being approved through the audit"},
   :rdf/type            #{:owl/NamedIndividual :dpvo/AuditStatus},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Audit Approved"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def AuditConditionallyApproved
  {:db/ident :dpvo/AuditConditionallyApproved,
   :dcterms/created #inst "2022-06-29T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Paul Ryan"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "State of being conditionally approved through the audit"},
   :rdf/type #{:owl/NamedIndividual :dpvo/AuditStatus},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A \"conditional approval\" is intended to reflect states where the audit has identified further changes which must be implemented before considering the audit has been 'passed', without requiring another audit to validate them. This is distinct from the case where an audit has state 'rejected', which means changes must be made and submitted for review. The requirements of a 'conditional acceptance' are expected to be minor or not significant enough to warrant another audit to review them."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Audit Conditionally Approved"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AuditNotRequired
  {:db/ident :dpvo/AuditNotRequired,
   :dcterms/created #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "State where an audit is determined as not being required"},
   :rdf/type #{:owl/NamedIndividual :dpvo/AuditStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Audit Not Required"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AuditRejected
  {:db/ident :dpvo/AuditRejected,
   :dcterms/created #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State of not being approved or being rejected through the audit"},
   :rdf/type #{:owl/NamedIndividual :dpvo/AuditStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Audit Rejected"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AuditRequested
  {:db/ident :dpvo/AuditRequested,
   :dcterms/created #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State of an audit being requested whose outcome is not yet known"},
   :rdf/type #{:owl/NamedIndividual :dpvo/AuditStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Audit Requested"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AuditRequired
  {:db/ident :dpvo/AuditRequired,
   :dcterms/created #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State where an audit is determined as being required but has not been conducted"},
   :rdf/type #{:owl/NamedIndividual :dpvo/AuditStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Audit Required"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AuditStatus
  {:db/ident            :dpvo/AuditStatus,
   :dcterms/created     #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Status associated with Auditing or Investigation"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Audit Status"},
   :rdfs/subClassOf     :dpvo/Status,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Authentication-ABC
  {:db/ident :dpvo/Authentication-ABC,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of Attribute Based Credentials (ABC) to perform and manage authentication"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/data-protection-engineering"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Authentication using ABC"},
   :rdfs/subClassOf :dpvo/CryptographicAuthentication,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Authentication-PABC
  {:db/ident :dpvo/Authentication-PABC,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of Privacy-enhacing Attribute Based Credentials (ABC) to perform and manage authentication"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/data-protection-engineering"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Authentication using PABC"},
   :rdfs/subClassOf :dpvo/CryptographicAuthentication,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AuthenticationProtocols
  {:db/ident :dpvo/AuthenticationProtocols,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Protocols involving validation of identity i.e. authentication of a person or information"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Authentication Protocols"},
   :rdfs/subClassOf :dpvo/TechnicalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AuthorisationProcedure
  {:db/ident :dpvo/AuthorisationProcedure,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Procedures for determining authorisation through permission or authority"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "non-technical authorisation procedures: How is it described on an organisational level, who gets access to the data"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Authorisation Procedure"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AuthorisationProtocols
  {:db/ident :dpvo/AuthorisationProtocols,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Protocols involving authorisation of roles or profiles to determine permission, rights, or privileges"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Authorisation Protocols"},
   :rdfs/subClassOf :dpvo/TechnicalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Authority
  {:db/ident :dpvo/Authority,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Georg Krog"}
                      {:rdf/value "Harshvardhan Pandit"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An authority with the power to create or enforce laws, or determine their compliance."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Authority"},
   :rdfs/subClassOf #{:dpvo/LegalEntity :dpvo/GovernmentalOrganisation},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AutomatedDecisionMaking
  {:db/ident :dpvo/AutomatedDecisionMaking,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Piero Bonatti"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Processing that involves automated decision making"},
   :dcterms/modified #inst "2022-09-07T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Automated decision making can be defined as “the ability to make decisions by technological means without human involvement.” (“Guidelines on Automated individual decision-making and Profiling for the purposes of Regulation 2016/679 (wp251rev.01)”, 2018, p. 8)"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Automated Decision Making"},
   :rdfs/subClassOf #{:dpvo/AutomationOfProcessing :dpvo/DecisionMaking},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def AutomatedProcessingWithHumanInput
  {:db/ident :dpvo/AutomatedProcessingWithHumanInput,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Processing that is automated and involves inputs by Humans"},
   :dcterms/modified #inst "2022-09-07T00:00:00.000-00:00",
   :rdf/type #{:dpvo/AutomationOfProcessing :dpvo/HumanInvolvementForInput
               :owl/NamedIndividual},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For example, an algorithm that takes inputs from humans and performs operations based on them"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Automated Processing with Human Input"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AutomatedProcessingWithHumanOversight
  {:db/ident :dpvo/AutomatedProcessingWithHumanOversight,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Processing that is automated and involves oversight by Humans"},
   :dcterms/modified #inst "2022-09-07T00:00:00.000-00:00",
   :rdf/type #{:dpvo/AutomationOfProcessing :dpvo/HumanInvolvementForOversight
               :owl/NamedIndividual},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For example, a human watching metrics to ensure correctness of procedural values and outputs as processing takes place"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Automated Processing with Human Oversight"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AutomatedProcessingWithHumanReview
  {:db/ident :dpvo/AutomatedProcessingWithHumanReview,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Processing that is automated and involves review by Humans"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-00:00",
   :rdf/type #{:dpvo/AutomationOfProcessing
               :dpvo/HumanInvolvementForVerification :owl/NamedIndividual},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For example, a human verifying outputs of an algorithm for correctness or impact to individuals"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Automated Processing with Human Review"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def AutomationOfProcessing
  {:db/ident :dpvo/AutomationOfProcessing,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Contextual information about the degree of automation and human involvement associated with Processing"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "It is difficult to provide a formal definition of automation since any and all processing may be considered automation. This concept instead is intended to explicitly signal the utilisation of automation and its extent towards some context - such as decision making, and to indicate the involvement of humans."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Automation of Processing"},
   :rdfs/subClassOf :dpvo/ProcessingContext,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BackgroundChecks
  {:db/ident :dpvo/BackgroundChecks,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Procedure where the background of an entity is assessed to identity vulnerabilities and threats due to their current or intended role"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Background Checks"},
   :rdfs/subClassOf :dpvo/SecurityProcedure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Benefit
  {:db/ident            :dpvo/Benefit,
   :dcterms/created     #inst "2022-03-23T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Beatriz Esteves"}
                          {:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"}
                          {:rdf/value "Fajar Ekaputra"}
                          {:rdf/value "Axel Polleres"}
                          {:rdf/value "Julian Flake"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Impact(s) that acts as or causes benefits"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Benefit"},
   :rdfs/subClassOf     :dpvo/Impact,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def BiometricAuthentication
  {:db/ident :dpvo/BiometricAuthentication,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Use of biometric data for authentication"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Biometric Authentication"},
   :rdfs/subClassOf :dpvo/AuthenticationProtocols,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Certification
  {:db/ident :dpvo/Certification,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Certification mechanisms, seals, and marks for the purpose of demonstrating compliance"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Certification"},
   :rdfs/subClassOf :dpvo/CertificationSeal,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CertificationSeal
  {:db/ident :dpvo/CertificationSeal,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Certifications, seals, and marks indicating compliance to regulations or practices"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Certification and Seal"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Child
  {:db/ident :dpvo/Child,
   :dcterms/created #inst "2020-11-25T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A 'child' is a natural legal person who is below a certain legal age depending on the legal jurisdiction."},
   :dcterms/modified #inst "2022-06-22T00:00:00.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The legality of age defining a child varies by jurisdiction. In addition, 'child' is distinct from a 'minor'. For example, the legal age for consumption of alcohol can be 21, which makes a person of age 20 a 'minor' in this context. In other cases, 'minor' and 'child' are used interchangeably to refer to a person below some legally defined age."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Child"},
   :rdfs/subClassOf :dpvo/DataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def Citizen
  {:db/ident :dpvo/Citizen,
   :dcterms/created #inst "2022-04-06T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Paul Ryan"} {:rdf/value "Georg P. Krog"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Data subjects that are citizens (for a jurisdiction)"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Citizen"},
   :rdfs/subClassOf :dpvo/DataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def City
  {:db/ident :dpvo/City,
   :dcterms/created #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "A region consisting of urban population and commerce"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "City"},
   :rdfs/subClassOf :dpvo/Location,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Client
  {:db/ident :dpvo/Client,
   :dcterms/created #inst "2022-04-06T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Paul Ryan"} {:rdf/value "Georg P. Krog"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Data subjects that are clients or recipients of services"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Client"},
   :rdfs/subClassOf :dpvo/Customer,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CloudLocation
  {:db/ident :dpvo/CloudLocation,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Location that is in the 'cloud' i.e. a logical location operated over the internet"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cloud Location"},
   :rdfs/subClassOf :dpvo/RemoteLocation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def CodeOfConduct
  {:db/ident :dpvo/CodeOfConduct,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A set of rules or procedures outlining the norms and practices for conducting activities"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Code of Conduct"},
   :rdfs/subClassOf :dpvo/GuidelinesPrinciple,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Collect
  {:db/ident :dpvo/Collect,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to gather data from someone"},
   :dcterms/source
   #{{:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"}
     {:xsd/anyURI "https://specialprivacy.ercim.eu/vocabs/processing"}},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Collect"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/processing#Collect"},
   :rdfs/subClassOf :dpvo/Obtain,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CollectedPersonalData
  {:db/ident :dpvo/CollectedPersonalData,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Personal Data that has been collected from another source such as the Data Subject"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To indicate the source of data, use the DataSource concept with the hasDataSource relation"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Collected Personal Data"},
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Combine
  {:db/ident :dpvo/Combine,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to join or merge data"},
   :dcterms/source
   #{{:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"}
     {:xsd/anyURI "https://specialprivacy.ercim.eu/vocabs/processing"}},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Combine"},
   :rdfs/seeAlso
   {:xsd/anyURI "https://specialprivacy.ercim.eu/vocabs/processing#Aggregate"},
   :rdfs/subClassOf :dpvo/Transform,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CommercialResearch
  {:db/ident :dpvo/CommercialResearch,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with conducting research in a commercial setting or with intention to commercialise e.g. in a company or sponsored by a company"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Commercial Research"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/purposes#Develop"},
   :rdfs/subClassOf :dpvo/ResearchAndDevelopment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CommunicationForCustomerCare
  {:db/ident :dpvo/CommunicationForCustomerCare,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Customer Care Communication refers to purposes associated with communicating with customers for assisting them, resolving issues, ensuring satisfaction, etc. in relation to services provided"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Communication for Customer Care"},
   :rdfs/subClassOf #{:dpvo/CommunicationManagement :dpvo/CustomerCare},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CommunicationManagement
  {:db/ident :dpvo/CommunicationManagement,
   :dcterms/created #inst "2021-09-01T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "David Hickey"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Communication Management refers to purposes associated with providing or managing communication activities e.g. to send an email for notifying some information"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This purpose by itself does not sufficiently and clearly indicate what the communication is about. As such, it is recommended to combine it with another purpose to indicate the application. For example, Communication of Payment."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Communication Management"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CompletelyManualProcessing
  {:db/ident :dpvo/CompletelyManualProcessing,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Processing that is completely un-automated or fully manual"},
   :rdf/type #{:dpvo/AutomationOfProcessing :owl/NamedIndividual},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "For example, a human performing some processing operation"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Completely Manual Processing"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ComplianceIndeterminate
  {:db/ident :dpvo/ComplianceIndeterminate,
   :dcterms/created #inst "2022-09-07T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State where the status of compliance has not been fully assessed, evaluated, or determined"},
   :rdf/type #{:dpvo/ComplianceStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Compliance Indeterminate"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ComplianceMonitoring
  {:db/ident :dpvo/ComplianceMonitoring,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Monitoring of compliance (e.g. internal policy, regulations)"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Compliance Monitoring"},
   :rdfs/subClassOf :dpvo/GovernanceProcedures,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ComplianceStatus
  {:db/ident :dpvo/ComplianceStatus,
   :dcterms/created #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Status associated with Compliance with some norms, objectives, or requirements"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Compliance Status"},
   :rdfs/subClassOf :dpvo/Status,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ComplianceUnknown
  {:db/ident            :dpvo/ComplianceUnknown,
   :dcterms/created     #inst "2022-09-07T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "State where the status of compliance is unknown"},
   :rdf/type            #{:dpvo/ComplianceStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Compliance Unknown"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ComplianceViolation
  {:db/ident :dpvo/ComplianceViolation,
   :dcterms/created #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State where compliance cannot be achieved due to requirements being violated"},
   :dcterms/modified #inst "2022-09-07T00:00:00.000-00:00",
   :rdf/type #{:dpvo/ComplianceStatus :owl/NamedIndividual},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Changed from \"violation of compliance\" for consistency with other terms"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Compliance Violation"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def Compliant
  {:db/ident            :dpvo/Compliant,
   :dcterms/created     #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "State of being fully compliant"},
   :rdf/type            #{:dpvo/ComplianceStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Compliant"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ConformanceStatus
  {:db/ident :dpvo/ConformanceStatus,
   :dcterms/created #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Status associated with conformance to a standard, guideline, code, or recommendation"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Conformance Status"},
   :rdfs/subClassOf :dpvo/Status,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Conformant
  {:db/ident            :dpvo/Conformant,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "State of being conformant"},
   :rdf/type            #{:dpvo/ConformanceStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Conformant"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Consent
  {:db/ident :dpvo/Consent,
   :dcterms/created #inst "2021-04-07T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Consent of the Data Subject for specified processing"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent"},
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsentExpired
  {:db/ident :dpvo/ConsentExpired,
   :dcterms/created #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The state where the temporal or contextual validity of consent has 'expired'"},
   :dcterms/source {:xsd/anyURI "https://w3id.org/GConsent"},
   :rdf/type #{:dpvo/ConsentStatusInvalidForProcessing :owl/NamedIndividual},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An example of this state is when the obtained consent has been assigned a duration - which has lapsed or 'expired', making it invalid to be used further for processing data"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent Expired"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsentGiven
  {:db/ident :dpvo/ConsentGiven,
   :dcterms/created #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "The state where consent has been given"},
   :dcterms/source {:xsd/anyURI "https://w3id.org/GConsent"},
   :rdf/type #{:owl/NamedIndividual :dpvo/ConsentStatusValidForProcessing},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An example of this state is when the individual clicks on a button, ticks a checkbox, verbally agrees - or any other form that communicates their decision agreeing to the processing of data"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent Given"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsentInvalidated
  {:db/ident :dpvo/ConsentInvalidated,
   :dcterms/created #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "The state where consent has been deemed to be invalid"},
   :dcterms/source {:xsd/anyURI "https://w3id.org/GConsent"},
   :rdf/type #{:dpvo/ConsentStatusInvalidForProcessing :owl/NamedIndividual},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An example of this state is where an investigating authority or a court finds the collected consent did not meet requirements, and 'invalidates' both prior and future uses of it to carry out processing"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent Invalidated"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsentNotice
  {:db/ident :dpvo/ConsentNotice,
   :dcterms/created #inst "2022-06-21T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "A Notice for information provision associated with Consent"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent Notice"},
   :rdfs/subClassOf :dpvo/PrivacyNotice,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsentRecord
  {:db/ident            :dpvo/ConsentRecord,
   :dcterms/created     #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                          {:rdf/value "Julian Flake"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "A Record of Consent or Consent related activities"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Consent Record"},
   :rdfs/subClassOf     :dpvo/DataProcessingRecord,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ConsentRefused
  {:db/ident :dpvo/ConsentRefused,
   :dcterms/created #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "The state where consent has been refused"},
   :dcterms/source {:xsd/anyURI "https://w3id.org/GConsent"},
   :rdf/type #{:dpvo/ConsentStatusInvalidForProcessing :owl/NamedIndividual},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An example of this state is when the individual clicks on a 'disagree' or 'reject' or 'refuse' button, or leaves a checkbox unticked"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent Refused"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsentRequestDeferred
  {:db/ident :dpvo/ConsentRequestDeferred,
   :dcterms/created #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State where a request for consent has been deferred without a decision"},
   :dcterms/source {:xsd/anyURI "https://w3id.org/GConsent"},
   :rdf/type #{:dpvo/ConsentStatusInvalidForProcessing :owl/NamedIndividual},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An example of this state is when the individual closes or dismisses a notice without making a decision. This state is intended for making the distinction between a notice being provided (as a consent request) and the individual interacting with the notice without making a decision - where the 'ignoring of a notice' is taken as consent being neither given nor refused"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent Request Deferred"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsentRequested
  {:db/ident :dpvo/ConsentRequested,
   :dcterms/created #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State where a request for consent has been made and is awaiting a decision"},
   :dcterms/source {:xsd/anyURI "https://w3id.org/GConsent"},
   :rdf/type #{:dpvo/ConsentStatusInvalidForProcessing :owl/NamedIndividual},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An example of this state is when a notice has been presented to the individual but they have not made a decision"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent Requested"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsentRevoked
  {:db/ident :dpvo/ConsentRevoked,
   :dcterms/created #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The state where the consent is revoked by an entity other than the data subject and which prevents it from being further used as a valid state"},
   :dcterms/source {:xsd/anyURI "https://w3id.org/GConsent"},
   :rdf/type #{:dpvo/ConsentStatusInvalidForProcessing :owl/NamedIndividual},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An example of this state is when a Data Controller stops utilising previously obtaining consent, such as when that service no longer exists"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent Revoked"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsentStatus
  {:db/ident :dpvo/ConsentStatus,
   :dcterms/created #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The state or status of 'consent' that provides information reflecting its operational status and validity for processing data"},
   :dcterms/source {:xsd/anyURI "https://w3id.org/GConsent"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "States are useful as information artefacts to implement them in controlling processing, and to reflect the process and flow of obtaining and maintaining consent. For example, a database table that stores consent states for specific processing and can be queried to obtain them in an efficient manner. States are also useful in investigations to determine the use and validity of consenting practices"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent Status"},
   :rdfs/subClassOf :dpvo/Status,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsentStatusInvalidForProcessing
  {:db/ident :dpvo/ConsentStatusInvalidForProcessing,
   :dcterms/created #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "States of consent that cannot be used as valid justifications for processing data"},
   :dcterms/source {:xsd/anyURI "https://w3id.org/GConsent"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This identifies the stages associated with consent that should not be used to process data"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent Status Invalid for Processing"},
   :rdfs/subClassOf :dpvo/ConsentStatus,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsentStatusValidForProcessing
  {:db/ident :dpvo/ConsentStatusValidForProcessing,
   :dcterms/created #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "States of consent that can be used as valid justifications for processing data"},
   :dcterms/source {:xsd/anyURI "https://w3id.org/GConsent"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Practically, given consent is the only valid state for processing"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent Status Valid for Processing"},
   :rdfs/subClassOf :dpvo/ConsentStatus,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsentUnknown
  {:db/ident :dpvo/ConsentUnknown,
   :dcterms/created #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State where information about consent is not available or is unknown"},
   :dcterms/source {:xsd/anyURI "https://w3id.org/GConsent"},
   :rdf/type #{:dpvo/ConsentStatusInvalidForProcessing :owl/NamedIndividual},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Consent states can be unknown, for example, when information is not available, or cannot be trusted, or is known to be inaccurate"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent Unknown"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsentWithdrawn
  {:db/ident :dpvo/ConsentWithdrawn,
   :dcterms/created #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The state where the consent is withdrawn or revoked specifically by the data subject and which prevents it from being further used as a valid state"},
   :dcterms/source {:xsd/anyURI "https://w3id.org/GConsent"},
   :rdf/type #{:dpvo/ConsentStatusInvalidForProcessing :owl/NamedIndividual},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This state can be considered a form of 'revocation' of consent, where the revocation can only be performed by the data subject. Therefore we suggest using ConsentRevoked when it is a non-data-subject entity, and ConsentWithdrawn when it is the data subject"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent Withdrawn"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Consequence
  {:db/ident :dpvo/Consequence,
   :dcterms/created #inst "2022-01-26T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "The consequence(s) possible or arising from specified context"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consequence"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsequenceAsSideEffect
  {:db/ident :dpvo/ConsequenceAsSideEffect,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The consequence(s) possible or arising as a side-effect of specified context"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consequence as Side-Effect"},
   :rdfs/subClassOf :dpvo/Consequence,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsequenceOfFailure
  {:db/ident :dpvo/ConsequenceOfFailure,
   :dcterms/created #inst "2022-03-23T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The consequence(s) possible or arising from failure of specified context"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consequence of Failure"},
   :rdfs/subClassOf :dpvo/Consequence,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsequenceOfSuccess
  {:db/ident :dpvo/ConsequenceOfSuccess,
   :dcterms/created #inst "2022-03-23T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The consequence(s) possible or arising from success of specified context"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consequence of Success"},
   :rdfs/subClassOf :dpvo/Consequence,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Consult
  {:db/ident :dpvo/Consult,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to consult or query data"},
   :dcterms/source
   #{{:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"}
     {:xsd/anyURI "https://specialprivacy.ercim.eu/vocabs/processing"}},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consult"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/processing#Query"},
   :rdfs/subClassOf :dpvo/Use,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Consultation
  {:db/ident :dpvo/Consultation,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Consultation is a process of receiving feedback, advice, or opinion from an external agency"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consultation"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsultationWithAuthority
  {:db/ident :dpvo/ConsultationWithAuthority,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Consultation with an authority or authoritative entity"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consultation with Authority"},
   :rdfs/subClassOf :dpvo/Consultation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsultationWithDPO
  {:db/ident            :dpvo/ConsultationWithDPO,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Consultation with Data Protection Officer(s)"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Consultation with DPO"},
   :rdfs/subClassOf     :dpvo/Consultation,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ConsultationWithDataSubject
  {:db/ident :dpvo/ConsultationWithDataSubject,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Consultation with data subject(s) or their representative(s)"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consultation with Data Subject"},
   :rdfs/subClassOf :dpvo/Consultation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsultationWithDataSubjectRepresentative
  {:db/ident            :dpvo/ConsultationWithDataSubjectRepresentative,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Consultation with representative of data subject(s)"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value
                         "Consultation with Data Subject Representative"},
   :rdfs/subClassOf     :dpvo/ConsultationWithDataSubject,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Consumer
  {:db/ident :dpvo/Consumer,
   :dcterms/created #inst "2022-04-06T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Paul Ryan"} {:rdf/value "Georg P. Krog"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Data subjects that consume goods or services for direct use"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consumer"},
   :rdfs/subClassOf :dpvo/DataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Context
  {:db/ident :dpvo/Context,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Contextually relevant information not possible to represent through other core concepts"},
   :dcterms/modified #inst "2022-06-15T00:00:00.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Context"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def ContinousFrequency
  {:db/ident            :dpvo/ContinousFrequency,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Frequency where occurences are continous"},
   :dcterms/modified    #inst "2020-10-05T00:00:00.000-00:00",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Continous Frequency"},
   :rdfs/subClassOf     :dpvo/Frequency,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "modified"}})

(def Contract
  {:db/ident :dpvo/Contract,
   :dcterms/created #inst "2021-04-07T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Creation, completion, fulfilment, or performance of a contract involving specified processing"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Contract"},
   :rdfs/subClassOf #{:dpvo/LegalAgreement :dpvo/LegalBasis},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ContractPerformance
  {:db/ident :dpvo/ContractPerformance,
   :dcterms/created #inst "2021-04-07T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Fulfilment or performance of a contract involving specified processing"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Contract Performance"},
   :rdfs/subClassOf :dpvo/Contract,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ContractualTerms
  {:db/ident :dpvo/ContractualTerms,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Contractual terms governing data handling within or with an entity"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Contractual Terms"},
   :rdfs/subClassOf :dpvo/LegalAgreement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ControllerProcessorAgreement
  {:db/ident :dpvo/ControllerProcessorAgreement,
   :dcterms/created #inst "2022-01-26T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between a Data Controller and a Data Processor"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Controller-Processor Agreement"},
   :rdfs/subClassOf :dpvo/DataProcessingAgreement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Copy
  {:db/ident :dpvo/Copy,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "to produce an exact reprodution of the data"},
   :dcterms/source {:xsd/anyURI
                    "https://specialprivacy.ercim.eu/vocabs/processing"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Copy"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/processing#Copy"},
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CounterMoneyLaundering
  {:db/ident :dpvo/CounterMoneyLaundering,
   :dcterms/created #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with detection, prevention, and mitigation of mitigate money laundering"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Counter Money Laundering"},
   :rdfs/subClassOf :dpvo/FraudPreventionAndDetection,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Country
  {:db/ident :dpvo/Country,
   :dcterms/created #inst "2022-01-19T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A political entity indicative of a sovereign or non-sovereign territorial state comprising of distinct geographical areas"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The definition of country is not intended for political interpretation. DPVCG welcomes alternate definitions based in existing sources with global scope, such as UN or ISO."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Country"},
   :rdfs/subClassOf :dpvo/Location,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CredentialManagement
  {:db/ident :dpvo/CredentialManagement,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Management of credentials and their use in authorisations"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credential Management"},
   :rdfs/subClassOf :dpvo/AuthorisationProcedure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CreditChecking
  {:db/ident :dpvo/CreditChecking,
   :dcterms/created #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with monitoring, performing, or assessing credit worthiness or solvency"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Checking"},
   :rdfs/subClassOf :dpvo/CustomerSolvencyMonitoring,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CryptographicAuthentication
  {:db/ident :dpvo/CryptographicAuthentication,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Use of cryptography for authentication"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cryptographic Authentication"},
   :rdfs/subClassOf #{:dpvo/AuthenticationProtocols :dpvo/CryptographicMethods},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CryptographicKeyManagement
  {:db/ident :dpvo/CryptographicKeyManagement,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Management of cryptographic keys, including their generation, storage, assessment, and safekeeping"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cryptographic Key Management"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CryptographicMethods
  {:db/ident :dpvo/CryptographicMethods,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Use of cryptographic methods to perform tasks"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cryptographic Methods"},
   :rdfs/subClassOf :dpvo/TechnicalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Customer
  {:db/ident :dpvo/Customer,
   :dcterms/created #inst "2022-04-06T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Paul Ryan"} {:rdf/value "Georg P. Krog"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Data subjects that purchase goods or services"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "note: for B2B relations where customers are organisations, this concept only applies for data subjects"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Customer"},
   :rdfs/subClassOf :dpvo/DataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CustomerCare
  {:db/ident :dpvo/CustomerCare,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Customer Care refers to purposes associated with purposes for providing assistance, resolving issues, ensuring satisfaction, etc. in relation to services provided"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Customer Care"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/purposes#Feedback"},
   :rdfs/subClassOf :dpvo/CustomerManagement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CustomerClaimsManagement
  {:db/ident :dpvo/CustomerClaimsManagement,
   :dcterms/created #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Beatriz"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Customer Claims Management refers to purposes associated with managing claims, including repayment of monies owed"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Customer Claims Management"},
   :rdfs/subClassOf :dpvo/CustomerManagement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CustomerManagement
  {:db/ident :dpvo/CustomerManagement,
   :dcterms/created #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Beatriz"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Customer Management refers to purposes associated with managing activities related with past, current, and future customers"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Customer Management"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CustomerOrderManagement
  {:db/ident :dpvo/CustomerOrderManagement,
   :dcterms/created #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Beatriz"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Customer Order Management refers to purposes associated with managing customer orders i.e. processing of an order related to customer's purchase of good or services"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Customer Order Management"},
   :rdfs/subClassOf :dpvo/CustomerManagement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CustomerRelationshipManagement
  {:db/ident :dpvo/CustomerRelationshipManagement,
   :dcterms/created #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Beatriz"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Customer Relationship Management refers to purposes associated with managing and analysing interactions with past, current, and potential customers"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Customer Relationship Management"},
   :rdfs/subClassOf :dpvo/CustomerManagement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CustomerSolvencyMonitoring
  {:db/ident :dpvo/CustomerSolvencyMonitoring,
   :dcterms/created #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Beatriz"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Customer Solvency Monitoring refers to purposes associated with monitor solvency of customers for financial diligence"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Customer Solvency Monitoring"},
   :rdfs/subClassOf :dpvo/CustomerManagement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CybersecurityAssessment
  {:db/ident :dpvo/CybersecurityAssessment,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Assessment of cybersecurity capabilities in terms of vulnerabilities and effectiveness of controls"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cybersecurity Assessment"},
   :rdfs/subClassOf #{:dpvo/SecurityAssessment :dpvo/Assessment},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CybersecurityTraining
  {:db/ident :dpvo/CybersecurityTraining,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Training methods related to cybersecurity"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cybersecurity Training"},
   :rdfs/subClassOf :dpvo/StaffTraining,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPIA
  {:db/ident :dpvo/DPIA,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A DPIA involves determining the potential and actual impact of processing activities on individuals or groups of individuals"},
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Top class: Impact Assessment, and DPIA is sub-class"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Protection Impact Assessment (DPIA)"},
   :rdfs/subClassOf :dpvo/ImpactAssessment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Damage
  {:db/ident            :dpvo/Damage,
   :dcterms/created     #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Impact that acts as or causes damages"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Damage"},
   :rdfs/subClassOf     :dpvo/Impact,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Data
  {:db/ident :dpvo/Data,
   :dcterms/created #inst "2022-01-19T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "A broad concept representing  'data' or 'information'"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataBackupProtocols
  {:db/ident            :dpvo/DataBackupProtocols,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Georg P Krog"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Protocols or plans for backing up of data"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Data Backup Protocols"},
   :rdfs/subClassOf     :dpvo/TechnicalMeasure,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DataController
  {:db/ident :dpvo/DataController,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Axel Polleres"}
                      {:rdf/value "Javier Fernández"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The individual or organisation that decides (or controls) the purpose(s) of processing personal data."},
   :dcterms/modified #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_7/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The terms 'Controller' is usually the more common form of indicating a Data Controller. In ISO/IEC the term 'PII Controller' is used."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Controller"},
   :rdfs/subClassOf :dpvo/LegalEntity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataExporter
  {:db/ident :dpvo/DataExporter,
   :dcterms/created #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Georg Krog"} {:rdf/value "David Hickey"}
                      {:rdf/value "Harshvardhan Pandit"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An entity that 'exports' data where exporting is considered a form of data transfer"},
   :dcterms/source
   {:xsd/anyURI
    "https://edpb.europa.eu/our-work-tools/our-documents/recommendations/recommendations-012020-measures-supplement-transfer_en"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The EU, in particular the EDPB, uses data exporter the context of cross-border data transfers/flows. These concepts are not bound by jurisdictional or geopolitical scopes within DPV and can thus be used for any notion of exporting"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Exporter"},
   :rdfs/subClassOf :dpvo/LegalEntity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataImporter
  {:db/ident :dpvo/DataImporter,
   :dcterms/created #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Georg Krog"} {:rdf/value "David Hickey"}
                      {:rdf/value "Harshvardhan Pandit"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An entity that 'imports' data where importing is considered a form of data transfer"},
   :dcterms/source
   {:xsd/anyURI
    "https://edpb.europa.eu/our-work-tools/our-documents/recommendations/recommendations-012020-measures-supplement-transfer_en"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The EU, in particular the EDPB, uses data importing the context of cross-border data transfers/flows. These concepts are not bound by jurisdictional or geopolitical scopes within DPV and can thus be used for any notion of importing"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Importer"},
   :rdfs/subClassOf :dpvo/Recipient,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataProcessingAgreement
  {:db/ident :dpvo/DataProcessingAgreement,
   :dcterms/created #inst "2022-01-26T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For specific role-based data processing agreements, see concepts for Processors and JointDataController agreements."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Processing Agreement"},
   :rdfs/subClassOf :dpvo/LegalAgreement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataProcessingRecord
  {:db/ident :dpvo/DataProcessingRecord,
   :dcterms/created #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Record of personal data processing, whether ex-ante or ex-post"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Processing Record"},
   :rdfs/subClassOf :dpvo/RecordsOfActivities,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataProcessor
  {:db/ident :dpvo/DataProcessor,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A ‘processor’ means a natural or legal person, public authority, agency or other body which processes personal data on behalf of the controller."},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_8/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Processor"},
   :rdfs/subClassOf :dpvo/Recipient,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataProtectionAuthority
  {:db/ident :dpvo/DataProtectionAuthority,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Georg Krog"}
                      {:rdf/value "Harshvardhan Pandit"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An authority tasked with overseeing legal compliance regarding privacy and data protection laws."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Protection Authority"},
   :rdfs/subClassOf :dpvo/Authority,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataProtectionOfficer
  {:db/ident :dpvo/DataProtectionOfficer,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Georg Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An entity within or authorised by an organisation to monitor internal compliance, inform and advise on data protection obligations and act as a contact point for data subjects and the supervisory authority."},
   :dcterms/modified #inst "2021-12-08T00:00:00.000-00:00",
   :dcterms/source {:xsd/anyURI
                    "https://eur-lex.europa.eu/eli/reg/2016/679/art_37/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Protection Officer"},
   :rdfs/subClassOf :dpvo/Representative,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def DataProtectionTraining
  {:db/ident :dpvo/DataProtectionTraining,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Training intended to increase knowledge regarding data protection"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Protection Training"},
   :rdfs/subClassOf :dpvo/StaffTraining,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataPublishedByDataSubject
  {:db/ident :dpvo/DataPublishedByDataSubject,
   :dcterms/created #inst "2022-08-24T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Julian Flake"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Data is published by the data subject"},
   :rdf/type #{:dpvo/DataSource :owl/NamedIndividual},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This refers to where that data was made publicly available by the data subject. An example of this would be a social media profile that the data subject has made publicly accessible."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data published by Data Subject"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataRedaction
  {:db/ident :dpvo/DataRedaction,
   :dcterms/created #inst "2020-10-01T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Removal of sensitive information from a data or document"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Redaction"},
   :rdfs/subClassOf :dpvo/DataSanitisationTechnique,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataSanitisationTechnique
  {:db/ident :dpvo/DataSanitisationTechnique,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Cleaning or any removal or re-organisation of elements in data based on selective criteria"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Sanitisation Technique"},
   :rdfs/subClassOf :dpvo/TechnicalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataSource
  {:db/ident :dpvo/DataSource,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "The source or origin of data"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Source' is the direct point of data collection; 'origin' would indicate the original/others points of where the data originates from."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Source"},
   :rdfs/subClassOf :dpvo/ProcessingContext,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataSubProcessor
  {:db/ident :dpvo/DataSubProcessor,
   :dcterms/created #inst "2020-11-25T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "A 'sub-processor' is a processor engaged by another processor"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "sub-processor' is a commonly used term similar to 'sub-contractor' and does not have a specific legal definition"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Sub-Processor"},
   :rdfs/subClassOf :dpvo/DataProcessor,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataSubject
  {:db/ident :dpvo/DataSubject,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Axel Polleres"}
                      {:rdf/value "Javier Fernández"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The individual (or category of individuals) whose personal data is being processed"},
   :dcterms/modified #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_1/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The term 'data subject' is specific to the GDPR, but is functionally equivalent to the term 'individual' and the ISO/IEC term 'PII Principle'."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Subject"},
   :rdfs/subClassOf #{:dpvo/NaturalPerson :dpvo/LegalEntity},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataSubjectRight
  {:db/ident :dpvo/DataSubjectRight,
   :dcterms/created #inst "2020-11-18T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"} {:rdf/value "Georg P Krog"}
                      {:rdf/value "Harshvardhan Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "The rights applicable or provided to a Data Subject"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Based on use of definitions, the notion of 'Data Subject Right' can be equivalent to 'Individual Right' or 'Right of a Person'"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Subject Right"},
   :rdfs/subClassOf :dpvo/Right,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataSubjectScale
  {:db/ident            :dpvo/DataSubjectScale,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"}
                          {:rdf/value "Rana Saniei"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Scale of Data Subject(s)"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Data Subject Scale"},
   :rdfs/subClassOf     :dpvo/Scale,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DataTransferImpactAssessment
  {:db/ident            :dpvo/DataTransferImpactAssessment,
   :dcterms/created     #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Impact Assessment for conducting data transfers"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Data Transfer Impact Assessment"},
   :rdfs/subClassOf     :dpvo/ImpactAssessment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DataTransferLegalBasis
  {:db/ident :dpvo/DataTransferLegalBasis,
   :dcterms/created #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "David Hickey"} {:rdf/value "Georg P Krogg"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Specific or special categories and instances of legal basis intended for justifying data transfers"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Transfer Legal Basis"},
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataVolume
  {:db/ident            :dpvo/DataVolume,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"}
                          {:rdf/value "Rana Saniei"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Volume or Scale of Data"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Data Volume"},
   :rdfs/subClassOf     :dpvo/Scale,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DecentralisedLocations
  {:db/ident :dpvo/DecentralisedLocations,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Location that is spread across multiple separate areas with no distinction between their importance"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Decentralised Locations"},
   :rdfs/subClassOf :dpvo/LocationFixture,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def DecisionMaking
  {:db/ident            :dpvo/DecisionMaking,
   :dcterms/created     #inst "2022-09-07T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Processing that involves decision making"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Decision Making"},
   :rdfs/subClassOf     :dpvo/ProcessingContext,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Deidentification
  {:db/ident :dpvo/Deidentification,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Removal of identity or information to reduce identifiability"},
   :dcterms/modified #inst "2022-11-24T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI "https://nvlpubs.nist.gov/nistpubs/ir/2015/NIST.IR.8053.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "De-Identification"},
   :rdfs/subClassOf :dpvo/DataSanitisationTechnique,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def DeliveryOfGoods
  {:db/ident :dpvo/DeliveryOfGoods,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with delivering goods and services requested or asked by consumer"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Delivery of Goods"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/purposes#Delivery"},
   :rdfs/subClassOf :dpvo/RequestedServiceProvision,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Derive
  {:db/ident :dpvo/Derive,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "to create new derivative data from the original data"},
   :dcterms/source {:xsd/anyURI
                    "https://specialprivacy.ercim.eu/vocabs/processing"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Derive indicates data is present or obtainable from existing data. For data that is created without such existence, see Infer."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Derive"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/processing#Derive"},
   :rdfs/subClassOf :dpvo/Obtain,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DerivedPersonalData
  {:db/ident :dpvo/DerivedPersonalData,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Personal Data that is obtained or derived from other data"},
   :dcterms/modified #inst "2022-01-19T00:00:00.000-00:00",
   :dcterms/source {:xsd/anyURI "https://www.w3.org/community/dpvcg/"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Derived Data is data that is obtained through processing of existing data, e.g. deriving first name from full name. To indicate data that is derived but which was not present or evident within the source data, InferredPersonalData should be used."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Derived Personal Data"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/data#Derived"},
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DesignStandard
  {:db/ident :dpvo/DesignStandard,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "A set of rules or guidelines outlining criterias for design"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Design Standard"},
   :rdfs/subClassOf :dpvo/GuidelinesPrinciple,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Destruct
  {:db/ident :dpvo/Destruct,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "to process data in a way it no longer exists or cannot be repaired"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Destruct"},
   :rdfs/subClassOf :dpvo/Remove,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DeterministicPseudonymisation
  {:db/ident :dpvo/DeterministicPseudonymisation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Pseudonymisation achieved through a deterministic function"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Deterministic Pseudonymisation"},
   :rdfs/subClassOf :dpvo/Pseudonymisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Detriment
  {:db/ident            :dpvo/Detriment,
   :dcterms/created     #inst "2022-03-23T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Beatriz Esteves"}
                          {:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"}
                          {:rdf/value "Fajar Ekaputra"}
                          {:rdf/value "Julian Flake"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Impact that acts as or causes detriments"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Detriment"},
   :rdfs/subClassOf     :dpvo/Impact,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DifferentialPrivacy
  {:db/ident :dpvo/DifferentialPrivacy,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Utilisation of differential privacy where information is shared as patterns or groups to withold individual elements"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/data-protection-engineering"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Differential Privacy"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DigitalRightsManagement
  {:db/ident :dpvo/DigitalRightsManagement,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Management of access, use, and other operations associated with digital content"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Digital Rights Management"},
   :rdfs/subClassOf :dpvo/TechnicalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DigitalSignatures
  {:db/ident :dpvo/DigitalSignatures,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Expression and authentication of identity through digital information containing cryptographic signatures"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Digital Signatures"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DirectMarketing
  {:db/ident :dpvo/DirectMarketing,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with conducting direct marketing i.e. marketing communicated directly to the individual"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Direct Marketing"},
   :rdfs/subClassOf :dpvo/Marketing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DisasterRecoveryProcedures
  {:db/ident :dpvo/DisasterRecoveryProcedures,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Procedures related to management of disasters and recovery"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Disaster Recovery Procedures"},
   :rdfs/subClassOf :dpvo/GovernanceProcedures,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Disclose
  {:db/ident :dpvo/Disclose,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to make data known"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Disclose"},
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DiscloseByTransmission
  {:db/ident :dpvo/DiscloseByTransmission,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "to disclose data by means of transmission"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Disclose by Transmission"},
   :rdfs/subClassOf :dpvo/Disclose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DisputeManagement
  {:db/ident :dpvo/DisputeManagement,
   :dcterms/created #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with activities that manage disputes by natural persons, private bodies, or public authorities relevant to organisation"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Dispute Management"},
   :rdfs/subClassOf :dpvo/OrganisationGovernance,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Disseminate
  {:db/ident :dpvo/Disseminate,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to spread data throughout"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Disseminate"},
   :rdfs/subClassOf :dpvo/Disclose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DistributedSystemSecurity
  {:db/ident :dpvo/DistributedSystemSecurity,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Security implementations provided using or over a distributed system"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Distributed System Security"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DocumentRandomisedPseudonymisation
  {:db/ident :dpvo/DocumentRandomisedPseudonymisation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of randomised pseudonymisation where the same elements are assigned different values in the same document or database"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Document Randomised Pseudonymisation"},
   :rdfs/subClassOf :dpvo/Pseudonymisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DocumentSecurity
  {:db/ident :dpvo/DocumentSecurity,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Security measures enacted over documents to protect against tampering or restrict access"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Document Security"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Duration
  {:db/ident            :dpvo/Duration,
   :dcterms/created     #inst "2022-02-09T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "The duration or temporal limitation"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Duration"},
   :rdfs/subClassOf     :dpvo/Context,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def EconomicUnion
  {:db/ident :dpvo/EconomicUnion,
   :dcterms/created #inst "2022-01-19T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A political union of two or more countries based on economic or trade agreements"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Economic Union"},
   :rdfs/subClassOf :dpvo/Location,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EducationalTraining
  {:db/ident :dpvo/EducationalTraining,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Training methods that are intended to provide education on topic(s)"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Educational Training"},
   :rdfs/subClassOf :dpvo/StaffTraining,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EffectivenessDeterminationProcedures
  {:db/ident :dpvo/EffectivenessDeterminationProcedures,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Procedures intended to determine effectiveness of other measures"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Effectiveness Determination Procedures"},
   :rdfs/subClassOf :dpvo/Assessment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ElderlyDataSubject
  {:db/ident :dpvo/ElderlyDataSubject,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Data subjects that are considered elderly (i.e. based on age)"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Elderly Data Subject"},
   :rdfs/subClassOf :dpvo/VulnerableDataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Employee
  {:db/ident            :dpvo/Employee,
   :dcterms/created     #inst "2022-04-06T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Beatriz Esteves"}
                          {:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Paul Ryan"} {:rdf/value "Georg P. Krog"}
                          {:rdf/value "Julian Flake"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Data subjects that are employees"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Employee"},
   :rdfs/subClassOf     :dpvo/DataSubject,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Encryption
  {:db/ident            :dpvo/Encryption,
   :dcterms/created     #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Mark Lizar"}
                          {:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Axel Polleres"}
                          {:rdf/value "Rob Brennan"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Technical measures consisting of encryption"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Encryption"},
   :rdfs/subClassOf     :dpvo/TechnicalMeasure,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def EncryptionAtRest
  {:db/ident :dpvo/EncryptionAtRest,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Encryption of data when being stored (persistent encryption)"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Encryption at Rest"},
   :rdfs/subClassOf :dpvo/Encryption,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EncryptionInTransfer
  {:db/ident :dpvo/EncryptionInTransfer,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Encryption of data in transit e.g. when being transferred from one location to another, including sharing"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Encryption in Transfer"},
   :rdfs/subClassOf :dpvo/Encryption,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EncryptionInUse
  {:db/ident            :dpvo/EncryptionInUse,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Encryption of data when it is being used"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Encryption in Use"},
   :rdfs/subClassOf     :dpvo/Encryption,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def EndToEndEncryption
  {:db/ident :dpvo/EndToEndEncryption,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Encrypted communications where data is encrypted by the sender and decrypted by the intended receiver to prevent access to any third party"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/data-protection-engineering"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "End-to-End Encryption (E2EE)"},
   :rdfs/subClassOf :dpvo/Encryption,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EndlessDuration
  {:db/ident :dpvo/EndlessDuration,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Duration that is (known or intended to be) open ended or without an end"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-00:00",
   :rdf/type #{:owl/NamedIndividual :dpvo/Duration},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Endless Duration"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def EnforceAccessControl
  {:db/ident :dpvo/EnforceAccessControl,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with conducting or enforcing access control as a form of security"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Was previously \"Access Control\". Prefixed to distinguish from Technical Measure."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Enforce Access Control"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/purposes#Login"},
   :rdfs/subClassOf :dpvo/EnforceSecurity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EnforceSecurity
  {:db/ident :dpvo/EnforceSecurity,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with ensuring and enforcing security for data, personnel, or other related matters"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Was previous \"Security\". Prefixed to distinguish from TechOrg measures."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Enforce Security"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EnterIntoContract
  {:db/ident            :dpvo/EnterIntoContract,
   :dcterms/created     #inst "2021-04-07T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Processing necessary to enter into contract"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Enter Into Contract"},
   :rdfs/subClassOf     :dpvo/Contract,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Entity
  {:db/ident :dpvo/Entity,
   :dcterms/created #inst "2022-02-02T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "A human or non-human 'thing' that constitutes as an entity"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Entity"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Erase
  {:db/ident :dpvo/Erase,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to delete data"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Erase"},
   :rdfs/subClassOf :dpvo/Remove,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EstablishContractualAgreement
  {:db/ident :dpvo/EstablishContractualAgreement,
   :dcterms/created #inst "2022-11-09T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with carrying out data processing to establish an agreement, such as for entering into a contract"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Establish Contractual Agreement"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EvaluationOfIndividuals
  {:db/ident :dpvo/EvaluationOfIndividuals,
   :dcterms/created #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Processing that involves evaluation of individuals"},
   :dcterms/modified #inst "2022-11-30T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Evaluation of Individuals"},
   :rdfs/subClassOf :dpvo/EvaluationScoring,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def EvaluationScoring
  {:db/ident :dpvo/EvaluationScoring,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Piero Bonatti"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Processing that involves evaluation and scoring of individuals"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Evaluation and Scoring"},
   :rdfs/subClassOf :dpvo/ProcessingContext,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ExplicitlyExpressedConsent
  {:db/ident :dpvo/ExplicitlyExpressedConsent,
   :dcterms/created #inst "2022-06-21T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Consent that is expressed through an explicit action solely conveying a consenting decision"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Explicitly expressed consent is a more specific form of Expressed consent where the action taken must 'explicitly' relate to only the consent decision. Expressed consent where the consenting is part of other matters therefore cannot satisfy the requirements of explicitly expressed consent. An example of explicit action expressing the consenting decision is a button on a web form where the form only relates to consent, or it is accompanied with suitable text that reiterates what the consenting decision is about"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Explicitly Expressed Consent"},
   :rdfs/subClassOf :dpvo/ExpressedConsent,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ExpressedConsent
  {:db/ident :dpvo/ExpressedConsent,
   :dcterms/created #inst "2022-06-21T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Consent that is expressed through an action intended to convey a consenting decision"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Expressed consent requires the individual take a specific and unambigious action that directly indicates their consent. This action may be a part of other processes such as setting preferences, or agreeing to a contract, or other matters not relating to consent. An example of expressed consent is interacting with a checkbox within a dashboard or clicking a button on a web form"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Expressed Consent"},
   :rdfs/subClassOf :dpvo/InformedConsent,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FederatedLocations
  {:db/ident :dpvo/FederatedLocations,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Location that is federated across multiple separate areas with designation of a primary or central location"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Federated Locations"},
   :rdfs/subClassOf :dpvo/LocationFixture,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def FileSystemSecurity
  {:db/ident :dpvo/FileSystemSecurity,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Security implemented over a file system"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "File System Security"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Filter
  {:db/ident            :dpvo/Filter,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "to filter or keep data for some criteria"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Filter"},
   :rdfs/subClassOf     :dpvo/Transform,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def FixedLocation
  {:db/ident :dpvo/FixedLocation,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Location that is fixed i.e. known to occur at a specific place"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fixed Location"},
   :rdfs/subClassOf :dpvo/LocationFixture,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def FixedMultipleLocations
  {:db/ident :dpvo/FixedMultipleLocations,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Location that is fixed with multiple places e.g. multiple cities"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fixed Multiple Locations"},
   :rdfs/subClassOf :dpvo/FixedLocation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def FixedOccurencesDuration
  {:db/ident :dpvo/FixedOccurencesDuration,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Duration that takes place a fixed number of times e.g. 3 times"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fixed Occurences Duration"},
   :rdfs/subClassOf :dpvo/Duration,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def FixedSingularLocation
  {:db/ident :dpvo/FixedSingularLocation,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Location that is fixed at a specific place e.g. a city"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fixed Singular Location"},
   :rdfs/subClassOf :dpvo/FixedLocation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def ForProfitOrganisation
  {:db/ident :dpvo/ForProfitOrganisation,
   :dcterms/created #inst "2022-02-02T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An organisation that aims to achieve profit as its primary goal"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "For-Profit Organisation"},
   :rdfs/subClassOf :dpvo/Organisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def FraudPreventionAndDetection
  {:db/ident :dpvo/FraudPreventionAndDetection,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with fraud detection, prevention, and mitigation"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fraud Prevention and Detection"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/purposes#Government"},
   :rdfs/subClassOf :dpvo/EnforceSecurity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Frequency
  {:db/ident :dpvo/Frequency,
   :dcterms/created #inst "2022-02-16T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The frequency or information about periods and repetitions in terms of recurrence."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Frequency"},
   :rdfs/subClassOf :dpvo/Context,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FulfilmentOfContractualObligation
  {:db/ident :dpvo/FulfilmentOfContractualObligation,
   :dcterms/created #inst "2022-11-09T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with carrying out data processing to fulfill a contractual obligation"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fulfilment of Contractual Obligation"},
   :rdfs/subClassOf :dpvo/FulfilmentOfObligation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FulfilmentOfObligation
  {:db/ident :dpvo/FulfilmentOfObligation,
   :dcterms/created #inst "2022-11-09T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with carrying out data processing to fulfill an obligation"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fulfilment of Obligation"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FullyAutomatedProcessing
  {:db/ident            :dpvo/FullyAutomatedProcessing,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Processing that is fully automated"},
   :rdf/type            #{:dpvo/AutomationOfProcessing :owl/NamedIndividual},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Fully Automated Processing"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def FullyRandomisedPseudonymisation
  {:db/ident :dpvo/FullyRandomisedPseudonymisation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of randomised pseudonymisation where the same elements are assigned different values each time they occur"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fully Randomised Pseudonymisation"},
   :rdfs/subClassOf :dpvo/Pseudonymisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Generate
  {:db/ident            :dpvo/Generate,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to generate or create data"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Generate"},
   :rdfs/subClassOf     :dpvo/Obtain,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def GeneratedPersonalData
  {:db/ident :dpvo/GeneratedPersonalData,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Personal Data that is generated or brought into existence without relation to existing data i.e. it is not derived or inferred from other data"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Generated Data is used to indicate data that is produced and is not derived or inferred from other data"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Generated Personal Data"},
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def GeographicCoverage
  {:db/ident            :dpvo/GeographicCoverage,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicate of scale in terms of geographic coverage"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Geographic Coverage"},
   :rdfs/subClassOf     :dpvo/Scale,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def GlobalScale
  {:db/ident            :dpvo/GlobalScale,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Geographic coverage spanning the entire globe"},
   :rdf/type            #{:owl/NamedIndividual :dpvo/GeographicCoverage},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Global Scale"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def GovernanceProcedures
  {:db/ident :dpvo/GovernanceProcedures,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Procedures related to governance (e.g. organisation, unit, team, process, system)"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Governance Procedures"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def GovernmentalOrganisation
  {:db/ident            :dpvo/GovernmentalOrganisation,
   :dcterms/created     #inst "2022-02-02T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "An organisation managed or part of government"},
   :dcterms/modified    #inst "2020-10-05T00:00:00.000-00:00",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Governmental Organisation"},
   :rdfs/subClassOf     :dpvo/Organisation,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "modified"}})

(def GuardianOfDataSubject
  {:db/ident            :dpvo/GuardianOfDataSubject,
   :dcterms/created     #inst "2022-08-03T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Georg P Krog"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Guardian(s) of data subjects such as children"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Guardian(s) of Data Subject"},
   :rdfs/subClassOf     :dpvo/DataSubject,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def GuidelinesPrinciple
  {:db/ident :dpvo/GuidelinesPrinciple,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Guidelines or Principles regarding processing and operational measures"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GuidelinesPrinciple"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HardwareSecurityProtocols
  {:db/ident :dpvo/HardwareSecurityProtocols,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Security protocols implemented at or within hardware"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Hardware Security Protocols"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Harm
  {:db/ident            :dpvo/Harm,
   :dcterms/created     #inst "2022-08-13T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Beatriz Esteves"}
                          {:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"}
                          {:rdf/value "Fajar Ekaputra"}
                          {:rdf/value "Julian Flake"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Impact that acts as or causes harms"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Harm"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "changed"}})

(def HashFunctions
  {:db/ident :dpvo/HashFunctions,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of hash functions to map information or to retrieve a prior categorisation"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Hash Functions"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HashMessageAuthenticationCode
  {:db/ident :dpvo/HashMessageAuthenticationCode,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of HMAC where message authentication code (MAC) utilise a cryptographic hash function and a secret cryptographic key"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Hash-based Message Authentication Code (HMAC)"},
   :rdfs/subClassOf :dpvo/CryptographicAuthentication,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HomomorphicEncryption
  {:db/ident :dpvo/HomomorphicEncryption,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of Homomorphic encryption that permits computations on encrypted data without decrypting it"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Homomorphic Encryption"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HugeDataVolume
  {:db/ident :dpvo/HugeDataVolume,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data volume that is considered huge or more than large within the context"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataVolume},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Huge Data Volume"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HugeScaleOfDataSubjects
  {:db/ident :dpvo/HugeScaleOfDataSubjects,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Scale of data subjects considered huge or more than large within the context"},
   :rdf/type #{:dpvo/DataSubjectScale :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Huge Scale Of Data Subjects"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HumanInvolvement
  {:db/ident :dpvo/HumanInvolvement,
   :dcterms/created #inst "2022-01-26T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "The involvement of humans in specified context"},
   :dcterms/modified #inst "2022-06-15T00:00:00.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Human Involvement here broadly refers to any involvement by a human in the context of carrying out processing. This may include verification of outcomes, providing input data for making decisions, or overseeing activities."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Human Involvement"},
   :rdfs/subClassOf :dpvo/AutomationOfProcessing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HumanInvolvementForInput
  {:db/ident :dpvo/HumanInvolvementForInput,
   :dcterms/created #inst "2022-09-07T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Human involvement for the purposes of providing inputs"},
   :rdf/type #{:owl/NamedIndividual :dpvo/HumanInvolvement},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Human Involvement for Input"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HumanInvolvementForOversight
  {:db/ident :dpvo/HumanInvolvementForOversight,
   :dcterms/created #inst "2022-09-07T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Human involvement for the purposes of having oversight over a system, its operations, inputs, or outputs"},
   :rdf/type #{:owl/NamedIndividual :dpvo/HumanInvolvement},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Human Involvement for Oversight"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HumanInvolvementForVerification
  {:db/ident :dpvo/HumanInvolvementForVerification,
   :dcterms/created #inst "2022-09-07T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Human involvement for the purposes of verification of a system, its operations, inputs, or outputs"},
   :rdf/type #{:owl/NamedIndividual :dpvo/HumanInvolvement},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Human Involvement for Verification"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HumanResourceManagement
  {:db/ident :dpvo/HumanResourceManagement,
   :dcterms/created #inst "2021-09-01T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "David Hickey"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with managing humans and 'human resources' within the organisation for effective and efficient operations."},
   :dcterms/source
   {:xsd/anyURI
    "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "HR is a broad concept. Its management includes, amongst others - recruiting employees and intermediaries e.g. brokers, independent representatives; payroll administration, remunerations, commissions, and wages; and application of social legislation."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Human Resource Management"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IdentityManagementMethod
  {:db/ident :dpvo/IdentityManagementMethod,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Management of identity and identity-based processes"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Identity Management Method"},
   :rdfs/subClassOf :dpvo/AuthorisationProcedure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IdentityVerification
  {:db/ident :dpvo/IdentityVerification,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with verifying or authorising identity as a form of security"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Identity Verification"},
   :rdfs/subClassOf :dpvo/EnforceSecurity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Immigrant
  {:db/ident :dpvo/Immigrant,
   :dcterms/created #inst "2022-04-06T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Paul Ryan"} {:rdf/value "Georg P. Krog"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Data subjects that are immigrants (for a jurisdiction)"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Immigrant"},
   :rdfs/subClassOf :dpvo/DataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Impact
  {:db/ident :dpvo/Impact,
   :dcterms/created #inst "2022-03-23T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The impact(s) possible or arising as a consequence from specified context"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Impact is a stronger notion of consequence in terms of influence, change, or effect on something e.g. for impact assessments"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Impact"},
   :rdfs/subClassOf :dpvo/Consequence,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ImpactAssessment
  {:db/ident :dpvo/ImpactAssessment,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Calculating or determining the likelihood of impact of an existing or proposed process, which can involve risks or detriments."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Impact Assessment"},
   :rdfs/subClassOf :dpvo/Assessment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ImpliedConsent
  {:db/ident :dpvo/ImpliedConsent,
   :dcterms/created #inst "2022-06-21T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Consent that is implied indirectly through an action not associated solely with conveying a consenting decision"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Implied consent is expected to also be Informed Consent. An example is a CCTV notice outside a monitored area that informs the individuals that by walking in they would be consenting to the use of camera for surveillance."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Implied Consent"},
   :rdfs/subClassOf :dpvo/InformedConsent,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Importance
  {:db/ident :dpvo/Importance,
   :dcterms/created #inst "2022-02-09T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "An indication of 'importance' within a context"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Importance can be used to express importance, desirability, relevance, or significance as a context."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Importance"},
   :rdfs/subClassOf :dpvo/Context,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ImproveExistingProductsAndServices
  {:db/ident :dpvo/ImproveExistingProductsAndServices,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with improving existing products and services"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Improve Existing Products and Services"},
   :rdfs/subClassOf :dpvo/OptimisationForController,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ImproveInternalCRMProcesses
  {:db/ident :dpvo/ImproveInternalCRMProcesses,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with improving customer-relationship management (CRM) processes"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Improve Internal CRM Processes"},
   :rdfs/subClassOf #{:dpvo/OptimisationForController
                      :dpvo/CustomerRelationshipManagement},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IncidentManagementProcedures
  {:db/ident :dpvo/IncidentManagementProcedures,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Procedures related to management of incidents"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Incident Management Procedures"},
   :rdfs/subClassOf :dpvo/GovernanceProcedures,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IncidentReportingCommunication
  {:db/ident :dpvo/IncidentReportingCommunication,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Procedures related to management of incident reporting"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Incident Reporting Communication"},
   :rdfs/subClassOf :dpvo/GovernanceProcedures,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IncorrectData
  {:db/ident :dpvo/IncorrectData,
   :dcterms/created #inst "2022-11-02T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data that is known to be incorrect or inconsistent with some quality requirements"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Incorrect Data"},
   :rdfs/subClassOf :dpvo/Data,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IncreaseServiceRobustness
  {:db/ident :dpvo/IncreaseServiceRobustness,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with improving robustness and resilience of services"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Increase Service Robustness"},
   :rdfs/subClassOf :dpvo/OptimisationForController,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IndeterminateDuration
  {:db/ident :dpvo/IndeterminateDuration,
   :dcterms/created #inst "2022-11-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Duration that is indeterminate or cannot be determined"},
   :rdf/type #{:owl/NamedIndividual :dpvo/Duration},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indeterminate means (exact or otherwise) information about the duration cannot be determined, which is distinct from 'EndlessDuration' where it is known (or decided) that the duration is open-ended or without an end."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Indeterminate Duration"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IndustryConsortium
  {:db/ident :dpvo/IndustryConsortium,
   :dcterms/created #inst "2022-02-02T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A consortium established and comprising on industry organisations"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-00:00",
   :dcterms/source {:xsd/anyURI "http://purl.org/adms"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Industry Consortium"},
   :rdfs/subClassOf :dpvo/Organisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def Infer
  {:db/ident :dpvo/Infer,
   :dcterms/created #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to infer data from existing data"},
   :dcterms/modified #inst "2022-10-14T00:00:00.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Infer indicates data that is derived without it being present or obtainable from existing data. For data that is presented, and is 'extracted' or 'obtained' from existing data, see Derive."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Infer"},
   :rdfs/subClassOf :dpvo/Derive,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def InferredPersonalData
  {:db/ident :dpvo/InferredPersonalData,
   :dcterms/created #inst "2022-01-19T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Personal Data that is obtained through inference from other data"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Inferred Data is derived data generated from existing data, but which did not originally exist within it, e.g. inferring demographics from browsing history."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Inferred Personal Data"},
   :rdfs/subClassOf #{:dpvo/DerivedPersonalData :dpvo/GeneratedPersonalData},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def InformationFlowControl
  {:db/ident :dpvo/InformationFlowControl,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Use of measures to control information flows"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Information Flow Control"},
   :rdfs/subClassOf :dpvo/TechnicalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def InformationSecurityPolicy
  {:db/ident :dpvo/InformationSecurityPolicy,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Policy regarding security of information"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Information Security Policy"},
   :rdfs/subClassOf :dpvo/Policy,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def InformedConsent
  {:db/ident :dpvo/InformedConsent,
   :dcterms/created #inst "2022-06-21T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Consent that is informed i.e. with the requirement to provide sufficient information to make a consenting decision"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The specifics for what information should be provided or made available will depend on the context, use-case, or relevant legal requirements"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Informed Consent"},
   :rdfs/subClassOf :dpvo/Consent,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def InnovativeUseOfNewTechnologies
  {:db/ident :dpvo/InnovativeUseOfNewTechnologies,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Piero Bonatti"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Processing that involves use of innovative and new technologies"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Innovative Use of New Technologies"},
   :rdfs/subClassOf :dpvo/ProcessingContext,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def InternalResourceOptimisation
  {:db/ident :dpvo/InternalResourceOptimisation,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with optimisation of internal resource availability and usage for organisation"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Internal Resource Optimisation"},
   :rdfs/subClassOf :dpvo/OptimisationForController,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def InternationalOrganisation
  {:db/ident :dpvo/InternationalOrganisation,
   :dcterms/created #inst "2022-03-23T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Georg P. Krog"} {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An organisation and its subordinate bodies governed by public international law, or any other body which is set up by, or on the basis of, an agreement between two or more countries"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_26/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "International Organisation"},
   :rdfs/subClassOf :dpvo/Organisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def IntrusionDetectionSystem
  {:db/ident :dpvo/IntrusionDetectionSystem,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of measures to detect intrusions and other unauthorised attempts to gain access to a system"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Intrusion Detection System"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def JobApplicant
  {:db/ident            :dpvo/JobApplicant,
   :dcterms/created     #inst "2022-04-06T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Beatriz Esteves"}
                          {:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Paul Ryan"} {:rdf/value "Georg P. Krog"}
                          {:rdf/value "Julian Flake"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Data subjects that apply for jobs or employments"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Job Applicant"},
   :rdfs/subClassOf     :dpvo/Applicant,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def JointDataControllers
  {:db/ident :dpvo/JointDataControllers,
   :dcterms/created #inst "2022-02-02T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Georg Krog"}
                      {:rdf/value "Harshvardhan Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A group of Data Controllers that jointly determine the purposes and means of processing"},
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "To indicate the membership, hasDataController may be used"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Joint Data Controllers"},
   :rdfs/subClassOf :dpvo/DataController,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def JointDataControllersAgreement
  {:db/ident :dpvo/JointDataControllersAgreement,
   :dcterms/created #inst "2022-01-26T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between Controllers within a Joint Controllers relationship"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Joint Data Controllers Agreement"},
   :rdfs/subClassOf :dpvo/DataProcessingAgreement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Justification
  {:db/ident :dpvo/Justification,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A form of documentation providing reaosns, explanations, or justifications"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Justification"},
   :rdfs/subClassOf :dpvo/Context,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LargeDataVolume
  {:db/ident :dpvo/LargeDataVolume,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Data volume that is considered large within the context"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataVolume},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Large Data Volume"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LargeScaleOfDataSubjects
  {:db/ident :dpvo/LargeScaleOfDataSubjects,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Scale of data subjects considered large within the context"},
   :rdf/type #{:dpvo/DataSubjectScale :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Large Scale Of Data Subjects"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LargeScaleProcessing
  {:db/ident :dpvo/LargeScaleProcessing,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Piero Bonatti"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Processing that takes place at large scales (as specified by some criteria)"},
   :dcterms/modified #inst "2022-09-07T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type #{:dpvo/ProcessingScale :owl/NamedIndividual},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The exact definition of what constitutes \"large scale\" depends on use of jurisdictional, domain-specific, or other forms of externally defined criterias. Where possible, this should be reflected by extending this term with the appropriate context."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Large Scale Processing"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def Law
  {:db/ident :dpvo/Law,
   :dcterms/created #inst "2022-01-19T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "A law is a set of rules created by government or authorities"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Law"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Lawful
  {:db/ident            :dpvo/Lawful,
   :dcterms/created     #inst "2022-10-19T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "State of being lawful or legally compliant"},
   :rdf/type            #{:owl/NamedIndividual :dpvo/Lawfulness},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Lawful"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Lawfulness
  {:db/ident :dpvo/Lawfulness,
   :dcterms/created #inst "2022-10-19T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Status associated with expressing lawfullness or legal compliance"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Lawfulness"},
   :rdfs/subClassOf :dpvo/ComplianceStatus,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LawfulnessUnkown
  {:db/ident            :dpvo/LawfulnessUnkown,
   :dcterms/created     #inst "2022-10-19T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "State of the lawfulness not being known"},
   :rdf/type            #{:owl/NamedIndividual :dpvo/Lawfulness},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Lawfulness Unknown"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LegalAgreement
  {:db/ident            :dpvo/LegalAgreement,
   :dcterms/created     #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Mark Lizar"}
                          {:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Axel Polleres"}
                          {:rdf/value "Rob Brennan"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "A legally binding agreement"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Legal Agreement"},
   :rdfs/subClassOf     :dpvo/OrganisationalMeasure,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LegalBasis
  {:db/ident :dpvo/LegalBasis,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Axel Polleres"}
                      {:rdf/value "Javier Fernández"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "The Legal basis used to justify processing of personal data"},
   :dcterms/modified #inst "2020-11-04T00:00:00.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Legal basis (plural: legal bases) are defined by legislations and regulations, whose applicability is usually restricted to specific jurisdictions."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Legal Basis"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LegalCompliance
  {:db/ident :dpvo/LegalCompliance,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with carrying out data processing to fulfill a legal or statutory obligation"},
   :dcterms/modified #inst "2022-11-09T00:00:00.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This purpose only refers to processing that is additionally required in order to fulfill the obligations and requirements associated with a law. For example, the use of consent would have its own separate purposes, with this purpose addressing a legal requirement for maintaining consent record (along with RecordManagement). This purpose will typically be used with Legal Obligation as the legal basis."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Legal Compliance"},
   :rdfs/subClassOf :dpvo/FulfilmentOfObligation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LegalEntity
  {:db/ident :dpvo/LegalEntity,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A human or non-human 'thing' that constitutes as an entity and which is recognised and defined in law"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Legal Entity"},
   :rdfs/subClassOf :dpvo/Entity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LegalObligation
  {:db/ident :dpvo/LegalObligation,
   :dcterms/created #inst "2021-04-07T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Legal Obligation to conduct the specified processing"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Legal Obligation"},
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LegitimateInterest
  {:db/ident :dpvo/LegitimateInterest,
   :dcterms/created #inst "2021-05-19T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Legitimate Interests of a Party as justification for specified processing"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Legitimate Interest"},
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LegitimateInterestAssessment
  {:db/ident :dpvo/LegitimateInterestAssessment,
   :dcterms/created #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates an assessment regarding the use of legitimate interest as a lawful basis by the data controller"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Legitimate Interest Assessment"},
   :rdfs/subClassOf :dpvo/Assessment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LegitimateInterestOfController
  {:db/ident :dpvo/LegitimateInterestOfController,
   :dcterms/created #inst "2021-05-19T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Legitimate Interests of a Data Controller in conducting specified processing"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Legitimate Interest of Controller"},
   :rdfs/subClassOf :dpvo/LegitimateInterest,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LegitimateInterestOfDataSubject
  {:db/ident :dpvo/LegitimateInterestOfDataSubject,
   :dcterms/created #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Legitimate Interests of the Data Subject in conducting specified processing"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Legitimate Interest of Data Subject"},
   :rdfs/subClassOf :dpvo/LegitimateInterest,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LegitimateInterestOfThirdParty
  {:db/ident :dpvo/LegitimateInterestOfThirdParty,
   :dcterms/created #inst "2021-05-19T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Legitimate Interests of a Third Party in conducting specified processing"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Legitimate Interest of Third Party"},
   :rdfs/subClassOf :dpvo/LegitimateInterest,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Likelihood
  {:db/ident :dpvo/Likelihood,
   :dcterms/created #inst "2022-07-22T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The likelihood or probability or chance of something taking place or occuring"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Likelihood can be expressed in a subjective manner, such as 'Unlikely', or in a quantitative manner such as \"Twice in a Day\" (frequency per period). The suggestion is to use quantitative values, or to associate them with subjective terms used so as to enable accurate interpretations and interoperability. See the concepts related to Frequency and Duration for possible uses as a combination to express Likelihood."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Likelihood"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LocalEnvironmentScale
  {:db/ident :dpvo/LocalEnvironmentScale,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Geographic coverage spanning a specific environment within the locality"},
   :rdf/type #{:owl/NamedIndividual :dpvo/GeographicCoverage},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For example, geographic scale of an event take place in a specific building or room"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Local Environment Scale"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LocalLocation
  {:db/ident            :dpvo/LocalLocation,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Location is local"},
   :dcterms/modified    #inst "2020-10-05T00:00:00.000-00:00",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Local Location"},
   :rdfs/subClassOf     :dpvo/LocationLocality,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "modified"}})

(def LocalityScale
  {:db/ident :dpvo/LocalityScale,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Geographic coverage spanning a specific locality"},
   :rdf/type #{:owl/NamedIndividual :dpvo/GeographicCoverage},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For example, geographic scale of a city or an area within a city"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Locality Scale"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Location
  {:db/ident :dpvo/Location,
   :dcterms/created #inst "2022-01-19T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A location is a position, site, or area where something is located"},
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Location may be geographic, physical, or virtual."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Location"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LocationFixture
  {:db/ident :dpvo/LocationFixture,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The fixture of location refers to whether the location is fixed"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Location Fixture"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LocationLocality
  {:db/ident :dpvo/LocationLocality,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Locality refers to whether the specified location is local within some context, e.g. for the user"},
   :dcterms/modified #inst "2022-10-04T00:00:00.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Location Locality"},
   :rdfs/subClassOf :dpvo/Location,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def LoggingPolicies
  {:db/ident :dpvo/LoggingPolicies,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Policy for logging of information"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Logging Policies"},
   :rdfs/subClassOf :dpvo/GovernanceProcedures,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MaintainCreditCheckingDatabase
  {:db/ident :dpvo/MaintainCreditCheckingDatabase,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with maintaining a Credit Checking Database"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Maintain Credit Checking Database"},
   :rdfs/subClassOf :dpvo/CreditChecking,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MaintainCreditRatingDatabase
  {:db/ident :dpvo/MaintainCreditRatingDatabase,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Purposes associated with maintaining a Credit Rating Database"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Maintain Credit Rating Database"},
   :rdfs/subClassOf :dpvo/CreditChecking,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MaintainFraudDatabase
  {:db/ident :dpvo/MaintainFraudDatabase,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with maintaining a database related to identifying and identified fraud risks and fraud incidents"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MaintainFraudDatabase"},
   :rdfs/subClassOf :dpvo/FraudPreventionAndDetection,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MakeAvailable
  {:db/ident :dpvo/MakeAvailable,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "to transform or publish data to be used"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Make Available"},
   :rdfs/subClassOf :dpvo/Disclose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Marketing
  {:db/ident :dpvo/Marketing,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with conducting marketing in relation to organisation or products or services e.g. promoting, selling, and distributing"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Was commercial interest, changed to consider Marketing a separate Purpose category by itself"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Marketing"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Match
  {:db/ident :dpvo/Match,
   :dcterms/created #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "to combine, compare, or match data from different sources"},
   :dcterms/source {:xsd/anyURI
                    "https://ec.europa.eu/newsroom/article29/items/611236"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Match"},
   :rdfs/subClassOf :dpvo/Use,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MaterialDamage
  {:db/ident            :dpvo/MaterialDamage,
   :dcterms/created     #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Impact that acts as or causes material damages"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Material Damage"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def MediumDataVolume
  {:db/ident :dpvo/MediumDataVolume,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data volume that is considered medium i.e. neither large nor small within the context"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataVolume},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Medium Data Volume"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MediumScaleOfDataSubjects
  {:db/ident :dpvo/MediumScaleOfDataSubjects,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Scale of data subjects considered medium i.e. neither large nor small within the context"},
   :rdf/type #{:dpvo/DataSubjectScale :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Medium Scale Of Data Subjects"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MediumScaleProcessing
  {:db/ident :dpvo/MediumScaleProcessing,
   :dcterms/created #inst "2022-09-07T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Processing that takes place at medium scales (as specified by some criteria)"},
   :rdf/type #{:dpvo/ProcessingScale :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Medium Scale Processing"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Member
  {:db/ident :dpvo/Member,
   :dcterms/created #inst "2022-04-06T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Paul Ryan"} {:rdf/value "Georg P. Krog"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data subjects that are members of a group, organisation, or other collectives"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Member"},
   :rdfs/subClassOf :dpvo/DataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MemberPartnerManagement
  {:db/ident :dpvo/MemberPartnerManagement,
   :dcterms/created #inst "2021-09-01T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "David Hickey"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with maintaining a registry of shareholders, members, or partners for governance, administration, and management functions"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Members and Partners Management"},
   :rdfs/subClassOf :dpvo/OrganisationGovernance,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MentallyVulnerableDataSubject
  {:db/ident :dpvo/MentallyVulnerableDataSubject,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Data subjects that are considered mentally vulnerable"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mentally Vulnerable Data Subject"},
   :rdfs/subClassOf :dpvo/VulnerableDataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MessageAuthenticationCodes
  {:db/ident :dpvo/MessageAuthenticationCodes,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Use of cryptographic methods to authenticate messages"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Message Authentication Codes (MAC)"},
   :rdfs/subClassOf :dpvo/CryptographicAuthentication,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MobilePlatformSecurity
  {:db/ident :dpvo/MobilePlatformSecurity,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Security implemented over a mobile platform"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mobile Platform Security"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Modify
  {:db/ident            :dpvo/Modify,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to modify or change data"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Modify"},
   :rdfs/subClassOf     :dpvo/Alter,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Monitor
  {:db/ident            :dpvo/Monitor,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to monitor data for some criteria"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Monitor"},
   :rdfs/subClassOf     :dpvo/Consult,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def MonitoringPolicies
  {:db/ident :dpvo/MonitoringPolicies,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Policy for monitoring (e.g. progress, performance)"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Monitoring Policies"},
   :rdfs/subClassOf :dpvo/GovernanceProcedures,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MonotonicCounterPseudonymisation
  {:db/ident :dpvo/MonotonicCounterPseudonymisation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A simple pseudonymisation method where identifiers are substituted by a number chosen by a monotonic counter"},
   :dcterms/modified #inst "2022-10-13T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Monotonic Counter Pseudonymisation"},
   :rdfs/subClassOf :dpvo/Pseudonymisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def Move
  {:db/ident :dpvo/Move,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "to move data from one location to another including deleting the original copy"},
   :dcterms/source {:xsd/anyURI
                    "https://specialprivacy.ercim.eu/vocabs/processing"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Move"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/processing#Move"},
   :rdfs/subClassOf :dpvo/Transfer,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MultiFactorAuthentication
  {:db/ident :dpvo/MultiFactorAuthentication,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An authentication system that uses two or more methods to authenticate"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Multi-Factor Authentication (MFA)"},
   :rdfs/subClassOf :dpvo/AuthenticationProtocols,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MultiNationalScale
  {:db/ident            :dpvo/MultiNationalScale,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Geographic coverage spanning multiple nations"},
   :rdf/type            #{:owl/NamedIndividual :dpvo/GeographicCoverage},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Multi National Scale"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def NDA
  {:db/ident :dpvo/NDA,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Non-disclosure Agreements e.g. preserving confidentiality of information"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Non-Disclosure Agreement (NDA)"},
   :rdfs/subClassOf :dpvo/LegalAgreement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NationalAuthority
  {:db/ident :dpvo/NationalAuthority,
   :dcterms/created #inst "2022-02-02T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An authority tasked with overseeing legal compliance for a nation"},
   :dcterms/source {:xsd/anyURI "http://purl.org/adms"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "National Authority"},
   :rdfs/subClassOf :dpvo/Authority,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NationalScale
  {:db/ident            :dpvo/NationalScale,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Geographic coverage spanning a nation"},
   :rdf/type            #{:owl/NamedIndividual :dpvo/GeographicCoverage},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "National Scale"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def NaturalPerson
  {:db/ident            :dpvo/NaturalPerson,
   :dcterms/created     #inst "2022-02-09T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "A human"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Natural Person"},
   :rdfs/subClassOf     :dpvo/Entity,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def NearlyGlobalScale
  {:db/ident :dpvo/NearlyGlobalScale,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Geographic coverage nearly spanning the entire globe"},
   :rdf/type #{:owl/NamedIndividual :dpvo/GeographicCoverage},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Nearly Global Scale"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Necessity
  {:db/ident :dpvo/Necessity,
   :dcterms/created #inst "2022-02-12T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "An indication of 'necessity' within a context"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Necessity can be used to express need, essentiality, requirement, or compulsion."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Necessity"},
   :rdfs/subClassOf :dpvo/Context,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NetworkProxyRouting
  {:db/ident :dpvo/NetworkProxyRouting,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Use of network routing using proxy"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/data-protection-engineering"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Network Proxy Routing"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NetworkSecurityProtocols
  {:db/ident :dpvo/NetworkSecurityProtocols,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Security implemented at or over networks protocols"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Network Security Protocols"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NonCitizen
  {:db/ident :dpvo/NonCitizen,
   :dcterms/created #inst "2022-04-06T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Paul Ryan"} {:rdf/value "Georg P. Krog"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Data subjects that are not citizens (for a jurisdiction)"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Non-Citizen"},
   :rdfs/subClassOf :dpvo/DataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NonCommercialResearch
  {:db/ident :dpvo/NonCommercialResearch,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with conducting research in a non-commercial setting e.g. for a non-profit-organisation (NGO)"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Non-Commercial Research"},
   :rdfs/subClassOf :dpvo/ResearchAndDevelopment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NonCompliant
  {:db/ident :dpvo/NonCompliant,
   :dcterms/created #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State of non-compliance where objectives have not been met, but have not been violated"},
   :dcterms/modified #inst "2022-09-07T00:00:00.000-00:00",
   :rdf/type #{:dpvo/ComplianceStatus :owl/NamedIndividual},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Changed from not compliant for consistency in commonly used terms"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Non Compliant"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def NonConformant
  {:db/ident            :dpvo/NonConformant,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "State of being non-conformant"},
   :rdf/type            #{:dpvo/ConformanceStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "NonConformant"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def NonGovernmentalOrganisation
  {:db/ident :dpvo/NonGovernmentalOrganisation,
   :dcterms/created #inst "2022-02-02T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An organisation not part of or independent from the government"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-00:00",
   :dcterms/source {:xsd/anyURI "http://purl.org/adms"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Non-Governmental Organisation"},
   :rdfs/subClassOf :dpvo/Organisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def NonMaterialDamage
  {:db/ident            :dpvo/NonMaterialDamage,
   :dcterms/created     #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Impact that acts as or causes non-material damages"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Non-Material Damage"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def NonPersonalData
  {:db/ident :dpvo/NonPersonalData,
   :dcterms/created #inst "2022-01-19T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Data that is not Personal Data"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The term NonPersonalData is provided to distinguish between PersonalData and other data, e.g. for indicating which data is regulated by privacy laws. To specify personal data that has been anonymised, the concept AnonymisedData should be used."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Non-Personal Data"},
   :rdfs/subClassOf :dpvo/Data,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NonProfitOrganisation
  {:db/ident :dpvo/NonProfitOrganisation,
   :dcterms/created #inst "2022-02-02T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An organisation that does not aim to achieve profit as its primary goal"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-00:00",
   :dcterms/source {:xsd/anyURI "http://purl.org/adms"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Non-Profit Organisation"},
   :rdfs/subClassOf :dpvo/Organisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def NonPublicDataSource
  {:db/ident :dpvo/NonPublicDataSource,
   :dcterms/created #inst "2022-01-26T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "A source of data that is not publicly accessible or available"},
   :rdf/type #{:dpvo/DataSource :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Non-Public Data Source"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NotRequired
  {:db/ident :dpvo/NotRequired,
   :dcterms/created #inst "2022-02-15T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indication of neither being required nor optional i.e. not relevant or needed"},
   :rdf/type #{:dpvo/Necessity :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Not Required"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Notice
  {:db/ident :dpvo/Notice,
   :dcterms/created #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "David Hickey"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A notice is an artefact for providing information, choices, or controls"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Notice"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Obligation
  {:db/ident :dpvo/Obligation,
   :dcterms/created #inst "2022-10-19T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "A rule describing an obligation for performing an activity"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Obligation"},
   :rdfs/subClassOf :dpvo/Rule,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Observe
  {:db/ident            :dpvo/Observe,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to obtain data through observation"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Observe"},
   :rdfs/subClassOf     :dpvo/Obtain,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ObservedPersonalData
  {:db/ident :dpvo/ObservedPersonalData,
   :dcterms/created #inst "2022-08-24T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Personal Data that has been collected through observation of the Data Subject(s)"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Observed Personal Data"},
   :rdfs/subClassOf :dpvo/CollectedPersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Obtain
  {:db/ident :dpvo/Obtain,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "to solicit or gather data from someone"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Obtain"},
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OfficialAuthorityOfController
  {:db/ident :dpvo/OfficialAuthorityOfController,
   :dcterms/created #inst "2021-05-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Processing necessary or authorised through the official authority granted to or vested in the Data Controller"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Official Authority of Controller"},
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OftenFrequency
  {:db/ident :dpvo/OftenFrequency,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Frequency where occurences are often or frequent, but not continous"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Often Frequency"},
   :rdfs/subClassOf :dpvo/Frequency,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def OperatingSystemSecurity
  {:db/ident :dpvo/OperatingSystemSecurity,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Security implemented at or through operating systems"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Operating System Security"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OptimisationForConsumer
  {:db/ident :dpvo/OptimisationForConsumer,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with optimisation of activities and services for consumer or user"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The term optmisation here refers to the efficiency of the service in terms of technical provision (or similar means) with benefits for everybody. Personalisation implies making changes that benefit the current user or persona."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Optimisation for Consumer"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/purposes#Custom"},
   :rdfs/subClassOf :dpvo/ServiceOptimisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OptimisationForController
  {:db/ident :dpvo/OptimisationForController,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with optimisation of activities and services for provider or controller"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Optimisation for Controller"},
   :rdfs/subClassOf :dpvo/ServiceOptimisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OptimiseUserInterface
  {:db/ident :dpvo/OptimiseUserInterface,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with optimisation of interfaces presented to the user"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Optimise User Interface"},
   :rdfs/subClassOf :dpvo/OptimisationForConsumer,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Optional
  {:db/ident            :dpvo/Optional,
   :dcterms/created     #inst "2022-02-14T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Beatriz Esteves"}
                          {:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                          {:rdf/value "Julian Flake"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Indication of 'optional' or 'voluntary'"},
   :rdf/type            #{:dpvo/Necessity :owl/NamedIndividual},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Optional"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Organisation
  {:db/ident :dpvo/Organisation,
   :dcterms/created #inst "2022-02-02T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A general term reflecting a company or a business or a group acting as a unit"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Organisation"},
   :rdfs/subClassOf :dpvo/LegalEntity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OrganisationComplianceManagement
  {:db/ident :dpvo/OrganisationComplianceManagement,
   :dcterms/created #inst "2021-09-01T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "David Hickey"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with managing compliance for organisation in relation to internal policies"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Note that this concept relates to internal organisational compliance. The concept LegalCompliance should be used for external legal or regulatory compliance."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Organisation Compliance Management"},
   :rdfs/subClassOf :dpvo/OrganisationGovernance,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OrganisationGovernance
  {:db/ident :dpvo/OrganisationGovernance,
   :dcterms/created #inst "2021-09-01T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "David Hickey"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with conducting activities and functions for governance of an organisation"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Organisation Governance"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OrganisationRiskManagement
  {:db/ident :dpvo/OrganisationRiskManagement,
   :dcterms/created #inst "2021-09-01T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "David Hickey"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with managing risk for organisation's activities"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Organisation Risk Management"},
   :rdfs/subClassOf :dpvo/OrganisationGovernance,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OrganisationalMeasure
  {:db/ident :dpvo/OrganisationalMeasure,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Organisational measures required/followed when processing data of the declared category"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Organisational Measure"},
   :rdfs/subClassOf :dpvo/TechnicalOrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OrganisationalUnit
  {:db/ident :dpvo/OrganisationalUnit,
   :dcterms/created #inst "2022-03-23T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Entity within an organisation that does not constitute as a separate legal entity"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Organisational Unit"},
   :rdfs/subClassOf :dpvo/Entity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Organise
  {:db/ident :dpvo/Organise,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "to organize data for arranging or classifying"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Organise"},
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PIA
  {:db/ident :dpvo/PIA,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Carrying out an impact assessment regarding privacy risks"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Privacy Impact Assessment"},
   :rdfs/subClassOf :dpvo/ImpactAssessment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ParentOfDataSubject
  {:db/ident            :dpvo/ParentOfDataSubject,
   :dcterms/created     #inst "2022-08-03T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Georg P Krog"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Parent(s) of data subjects such as children"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Parent(s) of Data Subject"},
   :rdfs/subClassOf     :dpvo/DataSubject,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def PartiallyAutomatedProcessing
  {:db/ident :dpvo/PartiallyAutomatedProcessing,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Processing that is partially automated or semi-automated"},
   :rdf/type #{:dpvo/AutomationOfProcessing :owl/NamedIndividual},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For example, a series of distinct processing operations that are automated individually or have some human involvement"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Partially Automated Processing"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PartiallyCompliant
  {:db/ident :dpvo/PartiallyCompliant,
   :dcterms/created #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State of partially being compliant i.e. only some objectives have been met, and others have not been in violation"},
   :rdf/type #{:dpvo/ComplianceStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Partially Compliant"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Participant
  {:db/ident :dpvo/Participant,
   :dcterms/created #inst "2022-04-06T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Paul Ryan"} {:rdf/value "Georg P. Krog"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data subjects that participate in some context such as volunteers in a function"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Participant"},
   :rdfs/subClassOf :dpvo/DataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PassiveRight
  {:db/ident :dpvo/PassiveRight,
   :dcterms/created #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"} {:rdf/value "Georg P Krog"}
                      {:rdf/value "Harshvardhan J Pandit"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The right(s) applicable, provided, or expected that are always (passively) applicable"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Passive rights do not require the entity to request or exercise them. They are considered to be always applicable. For example, the Right to Privacy (in EU) does not require an exercise for it to be fulfilled."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Passive Right"},
   :rdfs/subClassOf :dpvo/Right,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PasswordAuthentication
  {:db/ident :dpvo/PasswordAuthentication,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Use of passwords to perform authentication"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Password Authentication"},
   :rdfs/subClassOf :dpvo/AuthenticationProtocols,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Patient
  {:db/ident :dpvo/Patient,
   :dcterms/created #inst "2022-04-06T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Paul Ryan"} {:rdf/value "Georg P. Krog"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data subjects that receive medican attention, treatment, care, advice, or other health related services"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Patient"},
   :rdfs/subClassOf :dpvo/DataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PaymentManagement
  {:db/ident :dpvo/PaymentManagement,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with processing and managing payment in relation to service, including invoicing and records"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Payment Management"},
   :rdfs/subClassOf :dpvo/ServiceProvision,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PenetrationTestingMethods
  {:db/ident :dpvo/PenetrationTestingMethods,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of penetration testing to identity weaknessess and vulnerabilities through simulations"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Penetration Testing Methods"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Permission
  {:db/ident :dpvo/Permission,
   :dcterms/created #inst "2022-10-19T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "A rule describing a permission to perform an activity"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Permission"},
   :rdfs/subClassOf :dpvo/Rule,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PersonalData
  {:db/ident :dpvo/PersonalData,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data directly or indirectly associated or related to an individual."},
   :dcterms/modified #inst "2022-01-19T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_1/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This definition of personal data encompasses the concepts used in GDPR Art.4-1 for 'personal data' and ISO/IEC 2700 for 'personally identifiable information (PII)'."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personal Data"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/langs/usage-policy#AnyData"},
   :rdfs/subClassOf :dpvo/Data,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PersonalDataHandling
  {:db/ident :dpvo/PersonalDataHandling,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Axel Polleres"}
                      {:rdf/value "Javier Fernández"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A high-level Class to describe 'data handling'. This can consist of personal data being processed for a purpose, involving entities, using technical and organisational measures, applicable risks, rights, and legal basis."},
   :dcterms/modified #inst "2020-11-04T00:00:00.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personal Data Handling"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Personalisation
  {:db/ident :dpvo/Personalisation,
   :dcterms/created #inst "2021-09-01T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with creating and providing customisation based on attributes and/or needs of person(s) or context(s)."},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This term is a blanket purpose category for indicating personalisation of some other purpose, e.g. by creating a subclass of the other concept and Personalisation"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personalisation"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PersonalisedAdvertising
  {:db/ident :dpvo/PersonalisedAdvertising,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with creating and providing personalised advertising"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personalised Advertising"},
   :rdfs/subClassOf #{:dpvo/Advertising :dpvo/Personalisation},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PersonalisedBenefits
  {:db/ident :dpvo/PersonalisedBenefits,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with creating and providing personalised benefits for a service"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personalised Benefits"},
   :rdfs/subClassOf :dpvo/ServicePersonalisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PersonnelHiring
  {:db/ident :dpvo/PersonnelHiring,
   :dcterms/created #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with management and execution of hiring processes of personnel"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personnel Hiring"},
   :rdfs/subClassOf :dpvo/PersonnelManagement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PersonnelManagement
  {:db/ident :dpvo/PersonnelManagement,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with management of personnel associated with the organisation e.g. evaluation and management of employees and intermediaries"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personnel Management"},
   :rdfs/subClassOf :dpvo/HumanResourceManagement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PersonnelPayment
  {:db/ident :dpvo/PersonnelPayment,
   :dcterms/created #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with management and execution of payment of personnel"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personnel Payment"},
   :rdfs/subClassOf :dpvo/PersonnelManagement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PhysicalAccessControlMethod
  {:db/ident :dpvo/PhysicalAccessControlMethod,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Access control applied for physical access e.g. premises or equipement"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Physical Access Control Method"},
   :rdfs/subClassOf :dpvo/AccessControlMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Policy
  {:db/ident :dpvo/Policy,
   :dcterms/created #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "David Hickey"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A guidance document outlining any of: procedures, plans, principles, decisions, intent, or protocols."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Policy"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PostQuantumCryptography
  {:db/ident :dpvo/PostQuantumCryptography,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of algorithms that are intended to be secure against cryptanalytic attack by a quantum computer"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Post-Quantum Cryptography"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PrimaryImportance
  {:db/ident :dpvo/PrimaryImportance,
   :dcterms/created #inst "2022-02-10T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indication of 'primary' or 'main' or 'core' importance"},
   :rdf/type #{:dpvo/Importance :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Primary Importance"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PrivacyByDefault
  {:db/ident :dpvo/PrivacyByDefault,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Practices regarding selecting appropriate data protection and privacy measures as the 'default' in an activity or service"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Privacy by Default"},
   :rdfs/subClassOf :dpvo/GuidelinesPrinciple,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PrivacyByDesign
  {:db/ident :dpvo/PrivacyByDesign,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Practices regarding incorporating data protection and privacy in the design of information and services"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Privacy by Design"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PrivacyNotice
  {:db/ident :dpvo/PrivacyNotice,
   :dcterms/created #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "David Hickey"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Represents a notice or document outlining information regarding privacy"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Privacy Notice"},
   :rdfs/subClassOf :dpvo/Notice,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PrivacyPreservingProtocol
  {:db/ident :dpvo/PrivacyPreservingProtocol,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of protocols designed with the intention of provided additional guarentees regarding privacy"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Privacy Preserving Protocol"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PrivateInformationRetrieval
  {:db/ident :dpvo/PrivateInformationRetrieval,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of cryptographic methods to retrieve a record from a system without revealing which record is retrieved"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/data-protection-engineering"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Private Information Retrieval"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PrivateLocation
  {:db/ident :dpvo/PrivateLocation,
   :dcterms/created #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Location that is not or cannot be accessed by the public and is controlled as a private space"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Private Location"},
   :rdfs/subClassOf :dpvo/LocalLocation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Processing
  {:db/ident :dpvo/Processing,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Axel Polleres"}
                      {:rdf/value "Javier Fernández"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "The processing performed on personal data"},
   :dcterms/modified #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/source {:xsd/anyURI "https://specialprivacy.ercim.eu/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Processing"},
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://specialprivacy.ercim.eu/langs/usage-policy#AnyProcessing"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ProcessingContext
  {:db/ident :dpvo/ProcessingContext,
   :dcterms/created #inst "2022-02-09T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Context or conditions within which processing takes place"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Processing Context"},
   :rdfs/subClassOf :dpvo/Context,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ProcessingScale
  {:db/ident :dpvo/ProcessingScale,
   :dcterms/created #inst "2022-09-07T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Piero Bonatti"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Scale of Processing"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The exact definition of what constitutes \"scale\" depends on use of jurisdictional, domain-specific, or other forms of externally defined criterias. Where possible, this should be reflected by extending the scales provided with the appropriate context."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Processing Scale"},
   :rdfs/subClassOf :dpvo/Scale,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ProfessionalTraining
  {:db/ident :dpvo/ProfessionalTraining,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Training methods that are intended to provide professional knowledge and expertise"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Professional Training"},
   :rdfs/subClassOf :dpvo/StaffTraining,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Profiling
  {:db/ident :dpvo/Profiling,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "to create a profile that describes or represents a person"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Profiling"},
   :rdfs/subClassOf :dpvo/Use,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Prohibition
  {:db/ident :dpvo/Prohibition,
   :dcterms/created #inst "2022-10-19T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "A rule describing a prohibition to perform an activity"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Prohibition"},
   :rdfs/subClassOf :dpvo/Rule,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ProvideEventRecommendations
  {:db/ident :dpvo/ProvideEventRecommendations,
   :dcterms/created #inst "2019-11-26T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Rudy Jacob"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with creating and providing personalised recommendations for events"},
   :dcterms/modified #inst "2022-10-14T00:00:00.000-00:00",
   :dcterms/source {:xsd/anyURI "https://specialprivacy.ercim.eu/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Provide Event Recommendations"},
   :rdfs/subClassOf :dpvo/ProvidePersonalisedRecommendations,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ProvidePersonalisedRecommendations
  {:db/ident :dpvo/ProvidePersonalisedRecommendations,
   :dcterms/created #inst "2019-11-26T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Rudy Jacob"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with creating and providing personalised recommendations"},
   :dcterms/modified #inst "2022-10-14T00:00:00.000-00:00",
   :dcterms/source {:xsd/anyURI "https://specialprivacy.ercim.eu/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Provide Personalised Recommendations"},
   :rdfs/subClassOf :dpvo/ServicePersonalisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ProvideProductRecommendations
  {:db/ident :dpvo/ProvideProductRecommendations,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with creating and providing product recommendations e.g. suggest similar products"},
   :dcterms/modified #inst "2022-10-14T00:00:00.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Provide Product Recommendations"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/purposes#Marketing"},
   :rdfs/subClassOf :dpvo/ProvidePersonalisedRecommendations,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Pseudonymisation
  {:db/ident :dpvo/Pseudonymisation,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Pseudonymisation means the processing of personal data in such a manner that the personal data can no longer be attributed to a specific data subject without the use of additional information, provided that such additional information is kept separately and is subject to technical and organisational measures to ensure that the personal data are not attributed to an identified or identifiable natural person;"},
   :dcterms/modified #inst "2022-11-24T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_5/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Pseudonymisation"},
   :rdfs/subClassOf :dpvo/Deidentification,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def Pseudonymise
  {:db/ident :dpvo/Pseudonymise,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "2022-10-14"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "to replace personal identifiable information by artificial identifiers"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Pseudonymise"},
   :rdfs/subClassOf :dpvo/Transform,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def PseudonymisedData
  {:db/ident :dpvo/PseudonymisedData,
   :dcterms/created #inst "2022-01-19T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Personal Data that has undergone a pseudonymisation process or a partial (incomplete) anonymisation process such that it is still considered Personal Data"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Pseudonymised Data"},
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PublicDataSource
  {:db/ident :dpvo/PublicDataSource,
   :dcterms/created #inst "2022-01-26T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "A source of data that is publicly accessible or available"},
   :rdf/type #{:dpvo/DataSource :owl/NamedIndividual},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The term 'Public' is used here in a broad sense. Actual consideration of what is 'Public Data' can vary based on several contextual or jurisdictional factors such as  definition of open, methods of access, permissions and licenses."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Public Data Source"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PublicInterest
  {:db/ident :dpvo/PublicInterest,
   :dcterms/created #inst "2021-04-21T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Processing is necessary or beneficial for interest of the public or society at large"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Public Interest"},
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PublicLocation
  {:db/ident            :dpvo/PublicLocation,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Georg P Krog"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Location that is or can be accessed by the public"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Public Location"},
   :rdfs/subClassOf     :dpvo/LocalLocation,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def PublicRelations
  {:db/ident :dpvo/PublicRelations,
   :dcterms/created #inst "2021-09-01T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "David Hickey"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with managing and conducting public relations processes, including creating goodwill for the organisation"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Public Relations"},
   :rdfs/subClassOf :dpvo/Marketing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Purpose
  {:db/ident :dpvo/Purpose,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Axel Polleres"}
                      {:rdf/value "Javier Fernández"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "The purpose of processing personal data"},
   :dcterms/modified #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/source {:xsd/anyURI "https://specialprivacy.ercim.eu/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Purpose"},
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://specialprivacy.ercim.eu/langs/usage-policy#AnyPurpose"},
   :vann/example {:xsd/anyURI "https://w3id.org/dpv/examples#E0004"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def QuantumCryptography
  {:db/ident :dpvo/QuantumCryptography,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Cryptographic methods that utilise quantum mechanical properties to perform cryptographic tasks"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Quantum Cryptography"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Query
  {:db/ident            :dpvo/Query,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to query or make enquiries over data"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Query"},
   :rdfs/subClassOf     :dpvo/Consult,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def RNGPseudonymisation
  {:db/ident :dpvo/RNGPseudonymisation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A pseudonymisation method where identifiers are substituted by a number chosen by a Random Number Generator (RNG)"},
   :dcterms/modified #inst "2022-10-13T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "RNG Pseudonymisation"},
   :rdfs/subClassOf :dpvo/Pseudonymisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def RandomLocation
  {:db/ident            :dpvo/RandomLocation,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Location that is random or unknown"},
   :dcterms/modified    #inst "2020-10-05T00:00:00.000-00:00",
   :rdf/type            #{:dpvo/LocationFixture :owl/NamedIndividual},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Random Location"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "modified"}})

(def Recipient
  {:db/ident :dpvo/Recipient,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Axel Polleres"}
                      {:rdf/value "Javier Fernández"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Entities that receive personal data"},
   :dcterms/modified #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/source
   #{{:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_9/oj"}
     {:xsd/anyURI "https://specialprivacy.ercim.eu/"}},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A recipient of personal data can be used to indicate any entity that receives personal data. This can be a Third Party, Processor (GDPR), or even a Controller."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Recipient"},
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://specialprivacy.ercim.eu/langs/usage-policy#AnyRecipient"},
   :rdfs/subClassOf :dpvo/LegalEntity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Record
  {:db/ident :dpvo/Record,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to make a record (especially media)"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Record"},
   :rdfs/subClassOf :dpvo/Obtain,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RecordManagement
  {:db/ident :dpvo/RecordManagement,
   :dcterms/created #inst "2021-09-01T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "David Hickey"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with manage creation, storage, and use of records relevant to operations, events, and processes e.g. to store logs or access requests"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This purpose relates specifiaclly for record creation and management. This can be combined or used along with other purposes to express intentions such as records for legal compliance or vendor payments."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Record Management"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RecordsOfActivities
  {:db/ident :dpvo/RecordsOfActivities,
   :dcterms/created #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Records of activities within some context such as maintainence tasks or governance functions"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Records of Activities"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Region
  {:db/ident :dpvo/Region,
   :dcterms/created #inst "2022-01-19T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "A region is an area or site that is considered a location"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Region"},
   :rdfs/subClassOf :dpvo/Location,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RegionalAuthority
  {:db/ident :dpvo/RegionalAuthority,
   :dcterms/created #inst "2022-02-02T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An authority tasked with overseeing legal compliance for a region"},
   :dcterms/source {:xsd/anyURI "http://purl.org/adms"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Regional Authority"},
   :rdfs/subClassOf :dpvo/Authority,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RegionalScale
  {:db/ident :dpvo/RegionalScale,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Geographic coverage spanning a specific region or regions"},
   :rdf/type #{:owl/NamedIndividual :dpvo/GeographicCoverage},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Regional Scale"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RegisterOfProcessingActivities
  {:db/ident :dpvo/RegisterOfProcessingActivities,
   :dcterms/created #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A ROPA is a document maintained by Data Controllers detailing processing activities carried out under their responsibility"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Tied to compliance processes and documents, decide how to specify those"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Register of Processing Activities"},
   :rdfs/subClassOf :dpvo/DataProcessingRecord,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RegularityOfRecertification
  {:db/ident :dpvo/RegularityOfRecertification,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Policy regarding repetition or renewal of existing certification(s)"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Regularity of Re-certification"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RemoteLocation
  {:db/ident            :dpvo/RemoteLocation,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Location is remote i.e. not local"},
   :dcterms/modified    #inst "2020-10-05T00:00:00.000-00:00",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Remote Location"},
   :rdfs/subClassOf     :dpvo/LocationLocality,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "modified"}})

(def Remove
  {:db/ident :dpvo/Remove,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to destruct or erase data"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Remove"},
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RenewedConsentGiven
  {:db/ident :dpvo/RenewedConsentGiven,
   :dcterms/created #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The state where a previously given consent has been 'renewed' or 'refreshed' or 'reaffirmed' to form a new instance of given consent"},
   :dcterms/source {:xsd/anyURI "https://w3id.org/GConsent"},
   :rdf/type #{:owl/NamedIndividual :dpvo/ConsentStatusValidForProcessing},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An example of this state is when a previously given consent has expired, and the individual is presented a notice regarding continuing associated processing operations - to which they agree. This state can be useful to keep track of 'reconfirmed' or 'refreshed' consent within consent records, assist notices and contextual agents to create better consenting dialogues, and assist with specific legal obligations related to subsequent consenting"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Renewed Consent Given"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RepairImpairments
  {:db/ident :dpvo/RepairImpairments,
   :dcterms/created #inst "2022-08-24T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with identifying, rectifying, or otherwise undertaking activities intended to fix or repair impairments to existing functionalities"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An example of identifying and rectifying impairments is the process of finding and fixing errors in products, commonly referred to as debugging"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Repair Impairments"},
   :rdfs/subClassOf :dpvo/ServiceProvision,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Representative
  {:db/ident :dpvo/Representative,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "A representative of a legal entity"},
   :dcterms/source {:xsd/anyURI
                    "https://eur-lex.europa.eu/eli/reg/2016/679/art_27/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Representative"},
   :rdfs/subClassOf :dpvo/LegalEntity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RequestAccepted
  {:db/ident :dpvo/RequestAccepted,
   :dcterms/created #inst "2022-11-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "State of a request being accepted towards fulfilment"},
   :rdf/type #{:dpvo/RequestStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Request Accepted"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RequestAcknowledged
  {:db/ident            :dpvo/RequestAcknowledged,
   :dcterms/created     #inst "2022-11-30T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "State of a request being acknowledged"},
   :rdf/type            #{:dpvo/RequestStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Request Acknowledged"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def RequestActionDelayed
  {:db/ident            :dpvo/RequestActionDelayed,
   :dcterms/created     #inst "2022-11-30T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "State of a request being delayed towards fulfilment"},
   :rdf/type            #{:dpvo/RequestStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Request Action Delayed"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def RequestFulfilled
  {:db/ident            :dpvo/RequestFulfilled,
   :dcterms/created     #inst "2022-11-30T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "State of a request being fulfilled"},
   :rdf/type            #{:dpvo/RequestStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Request Fulfilled"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def RequestInitiated
  {:db/ident            :dpvo/RequestInitiated,
   :dcterms/created     #inst "2022-11-30T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "State of a request being initiated"},
   :rdf/type            #{:dpvo/RequestStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Request Initiated"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def RequestRejected
  {:db/ident :dpvo/RequestRejected,
   :dcterms/created #inst "2022-11-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "State of a request being rejected towards non-fulfilment"},
   :rdf/type #{:dpvo/RequestStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Request Rejected"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RequestRequiredActionPerformed
  {:db/ident :dpvo/RequestRequiredActionPerformed,
   :dcterms/created #inst "2022-11-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State of a request's required action having been performed by the other party"},
   :rdf/type #{:dpvo/RequestStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Request Required Action Performed"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RequestRequiresAction
  {:db/ident :dpvo/RequestRequiresAction,
   :dcterms/created #inst "2022-11-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State of a request requiring an action to be performed from another party"},
   :rdf/type #{:dpvo/RequestStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Request Requires Action"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RequestStatus
  {:db/ident            :dpvo/RequestStatus,
   :dcterms/created     #inst "2022-11-30T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Status associated with requests"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Request Status"},
   :rdfs/subClassOf     :dpvo/Status,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def RequestStatusQuery
  {:db/ident            :dpvo/RequestStatusQuery,
   :dcterms/created     #inst "2022-11-30T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "State of a request's status being queried"},
   :rdf/type            #{:dpvo/RequestStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Request Status Query"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def RequestUnfulfilled
  {:db/ident            :dpvo/RequestUnfulfilled,
   :dcterms/created     #inst "2022-11-30T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "State of a request being unfulfilled"},
   :rdf/type            #{:dpvo/RequestStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Request Unfulfilled"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def RequestedServiceProvision
  {:db/ident :dpvo/RequestedServiceProvision,
   :dcterms/created #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with delivering services as requested by user or consumer"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The use of 'request' here includes where an user explicitly asks for the service and also when an established contract requires the provision of the service"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Requested Service Provision"},
   :rdfs/subClassOf :dpvo/ServiceProvision,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Required
  {:db/ident            :dpvo/Required,
   :dcterms/created     #inst "2022-02-13T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Beatriz Esteves"}
                          {:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                          {:rdf/value "Julian Flake"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Indication of 'required' or 'necessary'"},
   :rdf/type            #{:dpvo/Necessity :owl/NamedIndividual},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Required"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ResearchAndDevelopment
  {:db/ident :dpvo/ResearchAndDevelopment,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with conducting research and development for new methods, products, or services"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Research and Development"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Restrict
  {:db/ident :dpvo/Restrict,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "to apply a restriction on the processsing of specific records"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Restrict"},
   :rdfs/subClassOf :dpvo/Transform,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Retrieve
  {:db/ident :dpvo/Retrieve,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "to retrieve data, often in an automated manner"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Retrieve"},
   :rdfs/subClassOf :dpvo/Use,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ReviewImpactAssessment
  {:db/ident :dpvo/ReviewImpactAssessment,
   :dcterms/created #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Procedures to review impact assessments in terms of continued validity, adequacy for intended purposes, and conformance of processes with findings"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Review Impact Assessment"},
   :rdfs/subClassOf #{:dpvo/ReviewProcedure :dpvo/ImpactAssessment},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ReviewProcedure
  {:db/ident :dpvo/ReviewProcedure,
   :dcterms/created #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A procedure or process that reviews the correctness and validity of other measures and processes"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Review Procedure"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Right
  {:db/ident :dpvo/Right,
   :dcterms/created #inst "2020-11-18T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"} {:rdf/value "Georg P Krog"}
                      {:rdf/value "Harshvardhan J Pandit"}},
   :dcterms/description
   #{{:rdf/language "en",
      :rdf/value    "The right(s) applicable, provided, or expected."}
     {:rdf/language "en",
      :rdf/value    "The right(s) applicable, provided, or expected"}},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A 'right' is a legal, social, or ethical principle of freedom or entitlement which dictate the norms regarding what is allowed or owed.. Rights as a concept encompass a broad area of norms and entities, and are not specific to Individuals or Data Protection / Privacy. For individual specific rights, see dpv:DataSubjectRight"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Right"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RightExerciseActivity
  {:db/ident :dpvo/RightExerciseActivity,
   :dcterms/created #inst "2022-11-02T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"} {:rdf/value "Georg P Krog"}
                      {:rdf/value "Harshvardhan J Pandit"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "An activity representing an exercising of an active right"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "There may be multiple activities associated with exercising and fulfilling rights. See the RightExerciseRecord concept for record-keeping of such activities in a cohesive manner."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Right Exercise Activity"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RightExerciseNotice
  {:db/ident :dpvo/RightExerciseNotice,
   :dcterms/created #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"} {:rdf/value "Georg P Krog"}
                      {:rdf/value "Harshvardhan J Pandit"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information associated with exercising of an active right"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This concept is intended for providing information regarding a right exercise. For specific instances of such exercises, see RightExerciseActivity and RightExerciseRecord."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Right Exercise Notice"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RightExerciseRecord
  {:db/ident :dpvo/RightExerciseRecord,
   :dcterms/created #inst "2022-11-02T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"} {:rdf/value "Georg P Krog"}
                      {:rdf/value "Harshvardhan J Pandit"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Record of a Right being exercised"},
   :rdf/type #{:dpvo/Record :owl/NamedIndividual},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This concept represents a record of one or more right exercise activities, such as those associated with a single data subject or service or entity"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Right Exercise Record"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RightFulfilmentNotice
  {:db/ident :dpvo/RightFulfilmentNotice,
   :dcterms/created #inst "2022-11-02T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Notice provided regarding fulfilment of a right"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This notice is associated with situations where information is provided with the intention of progressing the fulfilment of a right. For example, a notice asking for more information regarding the scope of the right, or providing information on where to access the data provided under a right."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Right Fulfilment Notice"},
   :rdfs/subClassOf :dpvo/Notice,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RightNonFulfilmentNotice
  {:db/ident :dpvo/RightNonFulfilmentNotice,
   :dcterms/created #inst "2022-11-02T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Notice provided regarding non-fulfilment of a right"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This notice is associated with situations where information is provided with the intention of communicating non-fulfilment of a right. For example, to provide justifications on why a right could not be fulfilled or providing information about another entity  who should be approached for exercising this right."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Right Non-Fulfilment Notice"},
   :rdfs/subClassOf :dpvo/Notice,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Risk
  {:db/ident :dpvo/Risk,
   :dcterms/created #inst "2020-11-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A risk or possibility or uncertainty of negative effects, impacts, or consequences."},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Risks can be associated with one or more different concepts such as purpose, processing, personal data, technical or organisational measure."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RiskLevel
  {:db/ident :dpvo/RiskLevel,
   :dcterms/created #inst "2022-07-20T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The magnitude of a risk expressed as an indication to aid in its management"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Risk Levels can be defined as a combination of different characteristics. For example, ISO 31073:2022 defines it as a combination of consequences and their likelihood. Another example would be the Risk Matrix where Risk Level is defined as a combination of Likelihood and Severity associated with the Risk."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk Level"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RiskManagementPlan
  {:db/ident :dpvo/RiskManagementPlan,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A scheme within the risk management framework specifying the approach, the management components, and resources to be applied to the management of risk"},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/79637.html"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk Management Plan"},
   :rdfs/subClassOf :dpvo/SecurityProcedure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RiskManagementPolicy
  {:db/ident :dpvo/RiskManagementPolicy,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A policy or statement of the overall intentions and direction of an organisation related to risk management"},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/79637.html"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk Management Policy"},
   :rdfs/subClassOf #{:dpvo/Policy :dpvo/SecurityProcedure},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RiskManagementProcess
  {:db/ident :dpvo/RiskManagementProcess,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The systematic application of management policies, procedures and practices to the activities of communicating, consulting, establishing the context, and identifying, analysing, evaluating, treating, monitoring, and reviewing risk"},
   :dcterms/source #{{:xsd/anyURI
                      "https://www.iso.org/iso-31000-risk-management.html"}
                     {:xsd/anyURI "https://www.iso.org/standard/79637.html"}},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk Management Process"},
   :rdfs/subClassOf :dpvo/SecurityProcedure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RiskMitigationMeasure
  {:db/ident :dpvo/RiskMitigationMeasure,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Measures intended to mitigate, minimise, or prevent risk."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk Mitigation Measure"},
   :rdfs/subClassOf :dpvo/TechnicalOrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Rule
  {:db/ident :dpvo/Rule,
   :dcterms/created #inst "2022-10-19T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A rule describing a process or control that directs or determines if and how an activity should be conducted"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Rule"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Safeguard
  {:db/ident :dpvo/Safeguard,
   :dcterms/created #inst "2021-09-22T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "David Hickey"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A safeguard is a precautionary measure for the protection against or mitigation of negative effects"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This concept is relevant given the requirement to assert safeguards in cross-border data transfers"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Safeguard"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SafeguardForDataTransfer
  {:db/ident :dpvo/SafeguardForDataTransfer,
   :dcterms/created #inst "2021-09-22T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "David Hickey"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Represents a safeguard used for data transfer. Can include technical or organisational measures."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Safeguard for Data Transfer"},
   :rdfs/subClassOf :dpvo/Safeguard,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Scale
  {:db/ident :dpvo/Scale,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Rana Saniei"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "A measurement along some dimension"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Scales are subjective concepts that need to be defined and interpreted within the context of their application. For example, what would be small within one context could be large within another."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Scale"},
   :rdfs/subClassOf :dpvo/ProcessingContext,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Scope
  {:db/ident :dpvo/Scope,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indication of the extent or range or boundaries associated with(in) a context"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Scope"},
   :rdfs/subClassOf :dpvo/Context,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ScoringOfIndividuals
  {:db/ident :dpvo/ScoringOfIndividuals,
   :dcterms/created #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Processing that involves scoring of individuals"},
   :dcterms/modified #inst "2022-11-30T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Scoring of Individuals"},
   :rdfs/subClassOf :dpvo/EvaluationScoring,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def Screen
  {:db/ident            :dpvo/Screen,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to remove data for some criteria"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Screen"},
   :rdfs/subClassOf     :dpvo/Transform,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Seal
  {:db/ident :dpvo/Seal,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A seal or a mark indicating proof of certification to some certification or standard"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Seal"},
   :rdfs/subClassOf :dpvo/CertificationSeal,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SearchFunctionalities
  {:db/ident :dpvo/SearchFunctionalities,
   :dcterms/created #inst "2022-11-09T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with providing searching, querying, or other forms of information retrieval related functionalities"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Search Functionalities"},
   :rdfs/subClassOf :dpvo/ServiceProvision,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SecondaryImportance
  {:db/ident :dpvo/SecondaryImportance,
   :dcterms/created #inst "2022-02-11T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indication of 'secondary' or 'minor' or 'auxiliary' importance"},
   :rdf/type #{:dpvo/Importance :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Secondary Importance"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SecretSharingSchemes
  {:db/ident :dpvo/SecretSharingSchemes,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of secret sharing schemes where the secret can only be reconstructed through combination of sufficient number of individuals"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Secret Sharing Schemes"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Sector
  {:db/ident :dpvo/Sector,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Sector describes the area of application or domain that indicates or restricts scope for interpretation and application of purpose e.g. Agriculture, Banking"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "There are various sector codes used commonly to indicate the domain of an organisation or business. Examples include NACE (EU), ISIC (UN), SIC and NAICS (USA)."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sector"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SecureMultiPartyComputation
  {:db/ident :dpvo/SecureMultiPartyComputation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of cryptographic methods for entities to jointly compute functions without revealing inputs"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Secure Multi-Party Computation"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SecurityAssessment
  {:db/ident :dpvo/SecurityAssessment,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Assessment of security intended to identity gaps, vulnerabilities, risks, and effectiveness of controls"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Security Assessment"},
   :rdfs/subClassOf #{:dpvo/Assessment :dpvo/SecurityProcedure},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SecurityKnowledgeTraining
  {:db/ident :dpvo/SecurityKnowledgeTraining,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Training intended to increase knowledge regarding security"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Security Knowledge Training"},
   :rdfs/subClassOf :dpvo/StaffTraining,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SecurityMethod
  {:db/ident :dpvo/SecurityMethod,
   :dcterms/created #inst "2022-08-24T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Methods that relate to creating and providing security"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Security Method"},
   :rdfs/subClassOf :dpvo/TechnicalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SecurityProcedure
  {:db/ident :dpvo/SecurityProcedure,
   :dcterms/created #inst "2022-08-24T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Procedures associated with assessing, implementing, and evaluating security"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Security Procedure"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SecurityRoleProcedures
  {:db/ident :dpvo/SecurityRoleProcedures,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Procedures related to security roles"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Security Role Procedures"},
   :rdfs/subClassOf :dpvo/SecurityProcedure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SellDataToThirdParties
  {:db/ident :dpvo/SellDataToThirdParties,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with selling or sharing data or information to third parties"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Sell here means exchange, submit, or provide in return for direct or indirect compensation. Was subclass of commercial interest, changed to reflect selling something"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sell Data to Third Parties"},
   :rdfs/subClassOf :dpvo/SellProducts,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SellInsightsFromData
  {:db/ident :dpvo/SellInsightsFromData,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with selling or sharing insights obtained from analysis of data"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Sell here means exchange, submit, or provide in return for direct or indirect compensation. Was subclass of commercial interest, changed to reflect selling something"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sell Insights from Data"},
   :rdfs/subClassOf :dpvo/SellProducts,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SellProducts
  {:db/ident :dpvo/SellProducts,
   :dcterms/created #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Purposes associated with selling products or services"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Sell here means exchange, submit, or provide in return for direct or indirect compensation."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sell Products"},
   :rdfs/subClassOf :dpvo/ServiceProvision,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SellProductsToDataSubject
  {:db/ident :dpvo/SellProductsToDataSubject,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with selling products or services to the user, consumer, or data subjects"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Sell Products here refers to processing necessary to provide and complete a sale to customers. It should not be confused with providing services with a cost based on an established agreement."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sell Products to Data Subject"},
   :rdfs/subClassOf :dpvo/SellProducts,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SensitivePersonalData
  {:db/ident :dpvo/SensitivePersonalData,
   :dcterms/created #inst "2022-01-19T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Personal data that is considered 'sensitive' in terms of privacy and/or impact, and therefore requires additional considerations and/or protection"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Sensitivity' is a matter of context, and may be defined within legal frameworks. For GDPR, Special categories of personal data are considered a subset of sensitive data. To illustrate the difference between the two, consider the situation where Location data is collected, and which is considered 'sensitive' but not 'special'. As a probable rule, sensitive data require additional considerations whereas special category data requires additional legal basis / justifications."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sensitive Personal Data"},
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ServiceOptimisation
  {:db/ident :dpvo/ServiceOptimisation,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with optimisation of services or activities"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Subclass of ServiceProvision since optimisation is usually considered part of providing services"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Service Optimisation"},
   :rdfs/subClassOf :dpvo/ServiceProvision,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ServicePersonalisation
  {:db/ident :dpvo/ServicePersonalisation,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with providing personalisation within services or product or activities"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Service Personalisation"},
   :rdfs/subClassOf #{:dpvo/ServiceProvision :dpvo/Personalisation},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ServiceProvision
  {:db/ident :dpvo/ServiceProvision,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with providing service or product or activities"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Service Provision"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ServiceRegistration
  {:db/ident :dpvo/ServiceRegistration,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with registering users and collecting information required for providing a service"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An example of service registration is to provide a form that collects information such as preferred language or media format for downloading a movie"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Service Registration"},
   :rdfs/subClassOf :dpvo/ServiceProvision,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ServiceUsageAnalytics
  {:db/ident :dpvo/ServiceUsageAnalytics,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with conducting analysis and reporting related to usage of services or products"},
   :dcterms/modified #inst "2022-10-05T00:00:00.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Was \"UsageAnalytics\", prefixed with Service to better reflect scope"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Service Usage Analytics"},
   :rdfs/subClassOf :dpvo/ServiceProvision,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def Severity
  {:db/ident :dpvo/Severity,
   :dcterms/created #inst "2022-07-21T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The magnitude of being unwanted or having negative effects such as harmful impacts"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Severity can be associated with Risk, or its Consequences and Impacts"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Severity"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Share
  {:db/ident :dpvo/Share,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "to give data (or a portion of it) to others"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Share"},
   :rdfs/subClassOf :dpvo/Disclose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SingleSignOn
  {:db/ident :dpvo/SingleSignOn,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of credentials or processes that enable using one set of credentials to authenticate multiple contexts."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Single Sign On"},
   :rdfs/subClassOf :dpvo/AuthenticationProtocols,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SingularDataVolume
  {:db/ident :dpvo/SingularDataVolume,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data volume that is considered singular i.e. a specific instance or single item"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataVolume},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Singular Data Volume"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SingularFrequency
  {:db/ident :dpvo/SingularFrequency,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Frequency where occurences are singular i.e. they take place only once"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Singular Frequency"},
   :rdfs/subClassOf :dpvo/Frequency,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def SingularScaleOfDataSubjects
  {:db/ident :dpvo/SingularScaleOfDataSubjects,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Scale of data subjects considered singular i.e. a specific data subject"},
   :rdf/type #{:dpvo/DataSubjectScale :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Singular Scale Of Data Subjects"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SmallDataVolume
  {:db/ident :dpvo/SmallDataVolume,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data volume that is considered small or limited within the context"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataVolume},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Small Data Volume"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SmallScaleOfDataSubjects
  {:db/ident :dpvo/SmallScaleOfDataSubjects,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Scale of data subjects considered small or limited within the context"},
   :rdf/type #{:dpvo/DataSubjectScale :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Small Scale Of Data Subjects"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SmallScaleProcessing
  {:db/ident :dpvo/SmallScaleProcessing,
   :dcterms/created #inst "2022-09-07T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Processing that takes place at small scales (as specified by some criteria)"},
   :rdf/type #{:dpvo/ProcessingScale :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Small Scale Processing"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SocialMediaMarketing
  {:db/ident :dpvo/SocialMediaMarketing,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with conducting marketing through social media"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Social Media Marketing"},
   :rdfs/subClassOf :dpvo/Marketing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SpecialCategoryPersonalData
  {:db/ident :dpvo/SpecialCategoryPersonalData,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Sensitive Personal Data whose use requires specific legal permission or justification"},
   :dcterms/modified #inst "2022-01-19T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_9/par_1/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The term 'special category' is based on GDPR Art.9, but should not be considered as exlusive to it. DPV considers all Special Categories to also be Sensitive, but whose use is either prohibited or regulated and therefore requires additional legal basis for justification."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Special Category Personal Data"},
   :rdfs/subClassOf :dpvo/SensitivePersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def SporadicDataVolume
  {:db/ident :dpvo/SporadicDataVolume,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data volume that is considered sporadic or sparse within the context"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataVolume},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sporadic Data Volume"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SporadicFrequency
  {:db/ident :dpvo/SporadicFrequency,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Frequency where occurences are sporadic or infrequent or sparse"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sporadic Frequency"},
   :rdfs/subClassOf :dpvo/Frequency,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def SporadicScaleOfDataSubjects
  {:db/ident :dpvo/SporadicScaleOfDataSubjects,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Scale of data subjects considered sporadic or sparse within the context"},
   :rdf/type #{:dpvo/DataSubjectScale :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sporadic Scale Of Data Subjects"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def StaffTraining
  {:db/ident :dpvo/StaffTraining,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Practices and policies regarding training of staff members"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Staff Training"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Status
  {:db/ident            :dpvo/Status,
   :dcterms/created     #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "The status or state of something"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Status"},
   :rdfs/subClassOf     :dpvo/Context,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def StorageCondition
  {:db/ident :dpvo/StorageCondition,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Conditions required or followed regarding storage of data"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Storage Condition"},
   :rdfs/subClassOf :dpvo/ProcessingContext,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def StorageDeletion
  {:db/ident :dpvo/StorageDeletion,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Deletion or Erasure of data including any deletion guarantees"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Storage Deletion"},
   :rdfs/subClassOf :dpvo/StorageCondition,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def StorageDuration
  {:db/ident :dpvo/StorageDuration,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Duration or temporal limitation on storage of personal data"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Storage Duration"},
   :rdfs/subClassOf #{:dpvo/StorageCondition :dpvo/Duration},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def StorageLocation
  {:db/ident :dpvo/StorageLocation,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Location or geospatial scope where the data is stored"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Storage Location"},
   :rdfs/subClassOf #{:dpvo/StorageCondition :dpvo/Location},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def StorageRestoration
  {:db/ident :dpvo/StorageRestoration,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Regularity and temporal span of data restoration/backup mechanisms that guarantee that data is preserved"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Storage Restoration"},
   :rdfs/subClassOf :dpvo/StorageCondition,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Store
  {:db/ident :dpvo/Store,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to keep data for future use"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Store"},
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Structure
  {:db/ident :dpvo/Structure,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "to arrange data according to a structure"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Structure"},
   :rdfs/subClassOf :dpvo/Organise,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Student
  {:db/ident            :dpvo/Student,
   :dcterms/created     #inst "2022-04-06T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Beatriz Esteves"}
                          {:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Paul Ryan"} {:rdf/value "Georg P. Krog"}
                          {:rdf/value "Julian Flake"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Data subjects that are students"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Student"},
   :rdfs/subClassOf     :dpvo/DataSubject,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def SubProcessorAgreement
  {:db/ident :dpvo/SubProcessorAgreement,
   :dcterms/created #inst "2022-01-26T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between a Data Processor and a Data (Sub-)Processor"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sub-Processor Agreement"},
   :rdfs/subClassOf :dpvo/DataProcessingAgreement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Subscriber
  {:db/ident            :dpvo/Subscriber,
   :dcterms/created     #inst "2022-04-06T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Beatriz Esteves"}
                          {:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Paul Ryan"} {:rdf/value "Georg P. Krog"}
                          {:rdf/value "Julian Flake"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Data subjects that subscribe to service(s)"},
   :rdf/type            :owl/Class,
   :rdfs/comment        {:rdf/language "en",
                         :rdf/value
                         "note: subscriber can be customer or consumer"},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Subscriber"},
   :rdfs/subClassOf     :dpvo/DataSubject,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def SupraNationalAuthority
  {:db/ident :dpvo/SupraNationalAuthority,
   :dcterms/created #inst "2022-02-02T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An authority tasked with overseeing legal compliance for a supra-national union e.g. EU"},
   :dcterms/source {:xsd/anyURI "http://purl.org/adms"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Supra-National Authority"},
   :rdfs/subClassOf :dpvo/Authority,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SupraNationalUnion
  {:db/ident :dpvo/SupraNationalUnion,
   :dcterms/created #inst "2022-01-19T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A political union of two or more countries with an establishment of common authority"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Supranational Union"},
   :rdfs/subClassOf :dpvo/Location,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SymmetricCryptography
  {:db/ident :dpvo/SymmetricCryptography,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of cryptography where the same keys are utilised for encryption and descryption of information"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Symmetric Cryptography"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SymmetricEncryption
  {:db/ident :dpvo/SymmetricEncryption,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Use of symmetric cryptography to encrypt data"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Symmetric Encryption"},
   :rdfs/subClassOf :dpvo/Encryption,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SyntheticData
  {:db/ident :dpvo/SyntheticData,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Synthetic data reffers to artificially created data such that it is intended to resemble real data (personal or non-personal), but does not refer to any specific identified or identifiable individual, or to the real measure of an observable parameter in the case of non-personal data"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/data-protection-engineering"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Synthetic Data"},
   :rdfs/subClassOf :dpvo/Data,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SystematicMonitoring
  {:db/ident :dpvo/SystematicMonitoring,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Piero Bonatti"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Processing that involves systematic monitoring of individuals"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Systematic Monitoring"},
   :rdfs/subClassOf :dpvo/ProcessingContext,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TargetedAdvertising
  {:db/ident :dpvo/TargetedAdvertising,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with creating and providing pesonalised advertisement where the personalisation is targeted to a specific individual or group of individuals"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Targeted Advertising"},
   :rdfs/subClassOf :dpvo/PersonalisedAdvertising,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TechnicalMeasure
  {:db/ident :dpvo/TechnicalMeasure,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Rob Brennan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Technical measures required/followed when processing data of the declared category"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Technical Measure"},
   :rdfs/subClassOf :dpvo/TechnicalOrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TechnicalOrganisationalMeasure
  {:db/ident            :dpvo/TechnicalOrganisationalMeasure,
   :dcterms/created     #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Bud Bruegger"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "The Technical and Organisational measures used."},
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-00:00",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Technical and Organisational Measure"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def TechnicalServiceProvision
  {:db/ident :dpvo/TechnicalServiceProvision,
   :dcterms/created #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with managing and providing technical processes and functions necessary for delivering services"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Technical Service Provision"},
   :rdfs/subClassOf :dpvo/ServiceProvision,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Technology
  {:db/ident :dpvo/Technology,
   :dcterms/created #inst "2022-01-26T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The technology, technological implementation, or any techniques, skills, methods, and processes used or applied"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Examples (non-exhaustive) include: Algorithm, Process, Method, Skill, Database, Cookies, Server, Device"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Technology"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TemporalDuration
  {:db/ident :dpvo/TemporalDuration,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Duration that has a fixed temporal duration e.g. 6 months"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Temporal Duration"},
   :rdfs/subClassOf :dpvo/Duration,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def ThirdCountry
  {:db/ident :dpvo/ThirdCountry,
   :dcterms/created #inst "2022-02-09T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Represents a country outside applicable or compatible jurisdiction as outlined in law"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Third Country"},
   :rdfs/subClassOf :dpvo/Country,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ThirdParty
  {:db/ident :dpvo/ThirdParty,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A ‘third party’ means a natural or legal person, public authority, agency or body other than the data subject, controller, processor and people who, under the direct authority of the controller or processor, are authorised to process personal data."},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_10/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Third Party"},
   :rdfs/subClassOf :dpvo/Recipient,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ThirdPartyAgreement
  {:db/ident :dpvo/ThirdPartyAgreement,
   :dcterms/created #inst "2022-02-09T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between a Data Controller or Processor and a Third Party"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Third-Party Agreement"},
   :rdfs/subClassOf :dpvo/DataProcessingAgreement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ThirdPartySecurityProcedures
  {:db/ident :dpvo/ThirdPartySecurityProcedures,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Procedures related to security associated with Third Parties"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Third Party Security Procedures"},
   :rdfs/subClassOf :dpvo/SecurityProcedure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Tourist
  {:db/ident :dpvo/Tourist,
   :dcterms/created #inst "2022-04-06T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Paul Ryan"} {:rdf/value "Georg P. Krog"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data subjects that are tourists i.e. not citizens and not immigrants"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tourist"},
   :rdfs/subClassOf :dpvo/DataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Transfer
  {:db/ident :dpvo/Transfer,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "to move data from one place to another"},
   :dcterms/source {:xsd/anyURI
                    "https://specialprivacy.ercim.eu/vocabs/processing"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Transfer"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/processing#Transfer"},
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Transform
  {:db/ident :dpvo/Transform,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to change the form or nature of data"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Transform"},
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Transmit
  {:db/ident :dpvo/Transmit,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to send out data"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Transmit"},
   :rdfs/subClassOf :dpvo/Disclose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TrustedComputing
  {:db/ident :dpvo/TrustedComputing,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of cryptographic methods to restrict access and execution to trusted parties and code"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Trusted Computing"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TrustedExecutionEnvironments
  {:db/ident :dpvo/TrustedExecutionEnvironments,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of cryptographic methods to restrict access and execution to trusted parties and code within a dedicated execution environment"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/data-protection-engineering"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Trusted Execution Environments"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TrustedThirdPartyUtilisation
  {:db/ident :dpvo/TrustedThirdPartyUtilisation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Utilisation of a trusted third party to provide or carry out a measure"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Trusted Third Party Utilisation"},
   :rdfs/subClassOf :dpvo/SecurityProcedure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UninformedConsent
  {:db/ident :dpvo/UninformedConsent,
   :dcterms/created #inst "2022-06-21T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Consent that is uninformed i.e. without requirement to provide sufficient information to make a consenting decision"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Uninformed Consent"},
   :rdfs/subClassOf :dpvo/Consent,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Unlawful
  {:db/ident            :dpvo/Unlawful,
   :dcterms/created     #inst "2022-10-19T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "State of being unlawful or legally non-compliant"},
   :rdf/type            #{:owl/NamedIndividual :dpvo/Lawfulness},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Unlawful"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def UntilEventDuration
  {:db/ident :dpvo/UntilEventDuration,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Duration that takes place until a specific event occurs e.g. Account Closure"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Until Event Duration"},
   :rdfs/subClassOf :dpvo/Duration,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def UntilTimeDuration
  {:db/ident            :dpvo/UntilTimeDuration,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Duration that has a fixed end date e.g. 2022-12-31"},
   :dcterms/modified    #inst "2020-10-05T00:00:00.000-00:00",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Until Time Duration"},
   :rdfs/subClassOf     :dpvo/Duration,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "modified"}})

(def UnverifiedData
  {:db/ident :dpvo/UnverifiedData,
   :dcterms/created #inst "2022-11-02T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data that has not been verified in terms of accuracy, inconsistency, or quality"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unverified Data"},
   :rdfs/subClassOf :dpvo/Data,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UsageControl
  {:db/ident :dpvo/UsageControl,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Management of usage, which is intended to be broader than access control and may cover trust, digital rights, or other relevant controls"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Usage Control"},
   :rdfs/subClassOf :dpvo/AccessControlMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Use
  {:db/ident :dpvo/Use,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to use data"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Use"},
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UseSyntheticData
  {:db/ident :dpvo/UseSyntheticData,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of synthetic data to preserve privacy, security, or other effects and side-effects"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/data-protection-engineering"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Use of Synthetic Data"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def User
  {:db/ident            :dpvo/User,
   :dcterms/created     #inst "2022-04-06T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Beatriz Esteves"}
                          {:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Paul Ryan"} {:rdf/value "Georg P. Krog"}
                          {:rdf/value "Julian Flake"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Data subjects that use service(s)"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "User"},
   :rdfs/subClassOf     :dpvo/DataSubject,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def UserInterfacePersonalisation
  {:db/ident :dpvo/UserInterfacePersonalisation,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator
   #{{:rdf/value "Harshvardhan J. Pandit"} {:rdf/value "Fajar Ekaputra"}
     {:rdf/value "Elmar Kiesling"} {:rdf/value "Axel Polleres"}
     {:rdf/value "Simon Steyskal"} {:rdf/value "Javier Fernandez"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with personalisation of interfaces presented to the user"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Examples of user-interface personalisation include changing the language to match the locale"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "User Interface Personalisation"},
   :rdfs/subClassOf :dpvo/ServicePersonalisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VariableLocation
  {:db/ident :dpvo/VariableLocation,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Location that is known but is variable e.g. somewhere within a given area"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Variable Location"},
   :rdfs/subClassOf :dpvo/LocationFixture,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def VendorManagement
  {:db/ident :dpvo/VendorManagement,
   :dcterms/created #inst "2021-09-01T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "David Hickey"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with manage orders, payment, evaluation, and prospecting related to vendors"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vendor Management"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VendorPayment
  {:db/ident :dpvo/VendorPayment,
   :dcterms/created #inst "2021-09-01T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "David Hickey"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Purposes associated with managing payment of vendors"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vendor Payment"},
   :rdfs/subClassOf :dpvo/VendorManagement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VendorRecordsManagement
  {:db/ident :dpvo/VendorRecordsManagement,
   :dcterms/created #inst "2021-09-01T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "David Hickey"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with managing records and orders related to vendors"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vendor Records Management"},
   :rdfs/subClassOf :dpvo/VendorManagement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VendorSelectionAssessment
  {:db/ident :dpvo/VendorSelectionAssessment,
   :dcterms/created #inst "2021-09-01T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "David Hickey"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with managing selection, assessment, and evaluation related to vendors"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vendor Selection Assessment"},
   :rdfs/subClassOf :dpvo/VendorManagement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VerifiedData
  {:db/ident :dpvo/VerifiedData,
   :dcterms/created #inst "2022-11-02T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data that has been verified in terms of accuracy, inconsistency, or quality"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Verified Data"},
   :rdfs/subClassOf :dpvo/Data,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VirtualisationSecurity
  {:db/ident :dpvo/VirtualisationSecurity,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Security implemented at or through virtualised environments"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Virtualisation Security"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Visitor
  {:db/ident            :dpvo/Visitor,
   :dcterms/created     #inst "2022-04-06T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Beatriz Esteves"}
                          {:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Paul Ryan"} {:rdf/value "Georg P. Krog"}
                          {:rdf/value "Julian Flake"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Data subjects that are temporary visitors"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Visitor"},
   :rdfs/subClassOf     :dpvo/DataSubject,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def VitalInterest
  {:db/ident :dpvo/VitalInterest,
   :dcterms/created #inst "2021-04-21T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Processing is necessary or required to protect vital interests of a data subject or other natural person"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vital Interest"},
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VitalInterestOfDataSubject
  {:db/ident :dpvo/VitalInterestOfDataSubject,
   :dcterms/created #inst "2021-04-21T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Processing is necessary or required to protect vital interests of a data subject"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vital Interest of Data Subject"},
   :rdfs/subClassOf :dpvo/VitalInterestOfNaturalPerson,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VitalInterestOfNaturalPerson
  {:db/ident :dpvo/VitalInterestOfNaturalPerson,
   :dcterms/created #inst "2021-04-21T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Processing is necessary or required to protect vital interests of a natural person"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vital Interest of Natural Person"},
   :rdfs/subClassOf :dpvo/VitalInterest,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VulnerabilityTestingMethods
  {:db/ident :dpvo/VulnerabilityTestingMethods,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Methods that assess or discover vulnerabilities in a system"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vulnerability Testing Methods"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VulnerableDataSubject
  {:db/ident :dpvo/VulnerableDataSubject,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Georg Krog"}
                      {:rdf/value "Harshvardhan Pandit"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data Subjects which should be considered 'vulnerable' and therefore would require additional measures and safeguards"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This concept denotes a Data Subject or a group are vulnerable, but not what vulnerability they possess or its context. This information can be provided additionally as comments, or as separate concepts and relations. Proposals for this are welcome."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vulnerable Data Subject"},
   :rdfs/subClassOf :dpvo/DataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def WebBrowserSecurity
  {:db/ident :dpvo/WebBrowserSecurity,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Security implemented at or over web browsers"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "WebBrowser Security"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def WebSecurityProtocols
  {:db/ident :dpvo/WebSecurityProtocols,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Security implemented at or over web-based protocols"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Web Security Protocols"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def WirelessSecurityProtocols
  {:db/ident :dpvo/WirelessSecurityProtocols,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Security implemented at or over wireless communication protocols"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Wireless Security Protocols"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def WithinDevice
  {:db/ident :dpvo/WithinDevice,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Location is local and entirely within a device, such as a smartphone"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Within Device"},
   :rdfs/subClassOf :dpvo/LocalLocation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def WithinPhysicalEnvironment
  {:db/ident :dpvo/WithinPhysicalEnvironment,
   :dcterms/created #inst "2020-10-06T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Location is local and entirely within a physical environment, such as a room"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Within Physical Environment"},
   :rdfs/subClassOf :dpvo/LocalLocation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def WithinVirtualEnvironment
  {:db/ident :dpvo/WithinVirtualEnvironment,
   :dcterms/created #inst "2020-10-06T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Location is local and entirely within a virtual environment, such as a shared network directory"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Within Virtual Environment"},
   :rdfs/subClassOf :dpvo/LocalLocation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ZeroKnowledgeAuthentication
  {:db/ident :dpvo/ZeroKnowledgeAuthentication,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Authentication using Zero-Knowledge proofs"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/data-protection-engineering"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Zero Knowledge Authentication"},
   :rdfs/subClassOf #{:dpvo/AuthenticationProtocols :dpvo/CryptographicMethods},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasActivityStatus
  {:db/ident :dpvo/hasActivityStatus,
   :dcterms/created #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicates the status of activity of specified concept"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has activity status"},
   :rdfs/range :dpvo/ActivityStatus,
   :rdfs/subPropertyOf :dpvo/hasStatus,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasAddress
  {:db/ident :dpvo/hasAddress,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"} {:rdf/value "Georg P Krog"}
                      {:rdf/value "Harshvardhan J.Pandit"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Specifies address of a legal entity such as street address or pin code"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :dpvo/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has address"},
   :rdfs/range :owl/Thing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasAlgorithmicLogic
  {:db/ident :dpvo/hasAlgorithmicLogic,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Paul Ryan"} {:rdf/value "Georg P. Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates the logic used in processing such as for automated decision making"},
   :dcterms/modified #inst "2022-06-15T00:00:00.000-00:00",
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has algorithmic logic"},
   :rdfs/range :dpvo/AlgorithmicLogic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def hasApplicableLaw
  {:db/ident            :dpvo/hasApplicableLaw,
   :dcterms/created     #inst "2022-01-19T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates applicability of a Law"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has applicable law"},
   :rdfs/range          :dpvo/Law,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasAuditStatus
  {:db/ident :dpvo/hasAuditStatus,
   :dcterms/created #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates the status of audit associated with specified concept"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has audit status"},
   :rdfs/range :dpvo/AuditStatus,
   :rdfs/subPropertyOf :dpvo/hasStatus,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasAuthority
  {:db/ident :dpvo/hasAuthority,
   :dcterms/created #inst "2022-01-19T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicates applicability of authority for a jurisdiction"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has authority"},
   :rdfs/range :dpvo/Authority,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasComplianceStatus
  {:db/ident :dpvo/hasComplianceStatus,
   :dcterms/created #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicates the status of compliance of specified concept"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has compliance status"},
   :rdfs/range :dpvo/ComplianceStatus,
   :rdfs/subPropertyOf :dpvo/hasStatus,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasConsentStatus
  {:db/ident            :dpvo/hasConsentStatus,
   :dcterms/created     #inst "2022-06-21T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                          {:rdf/value "Julian Flake"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Specifies the state or status of consent"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has consent status"},
   :rdfs/range          :dpvo/ConsentStatus,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasConsequence
  {:db/ident :dpvo/hasConsequence,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates consenquence(s) possible or arising from specified concept"},
   :dcterms/modified #inst "2021-09-21T00:00:00.000-00:00",
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Removed plural suffix for consistency"},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has consequence"},
   :rdfs/range :dpvo/Consequence,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasConsequenceOn
  {:db/ident :dpvo/hasConsequenceOn,
   :dcterms/created #inst "2022-11-24T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates the thing (e.g. plan, process, or entity) affected by a consequence"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :dpvo/Consequence,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has consequence on"},
   :rdfs/range :owl/Thing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasContact
  {:db/ident :dpvo/hasContact,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"} {:rdf/value "Georg P Krog"}
                      {:rdf/value "Harshvardhan J.Pandit"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Specifies contact details of a legal entity such as phone  or email"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :dpvo/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has contact"},
   :rdfs/range :owl/Thing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasContext
  {:db/ident :dpvo/hasContext,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Indicates a purpose is restricted to the specified context(s)"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has context"},
   :rdfs/range :dpvo/Context,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasCountry
  {:db/ident            :dpvo/hasCountry,
   :dcterms/created     #inst "2022-01-19T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates applicability of specified country"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has country"},
   :rdfs/range          :dpvo/Country,
   :rdfs/subPropertyOf  :dpvo/hasLocation,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasData
  {:db/ident :dpvo/hasData,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Indicates associated with Data (may or may not be personal)"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has data"},
   :rdfs/range :dpvo/Data,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasDataController
  {:db/ident            :dpvo/hasDataController,
   :dcterms/created     #inst "2019-04-04T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Mark Lizar"}
                          {:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Bud Bruegger"}
                          {:rdf/value "Axel Polleres"}
                          {:rdf/value "Javier Fernández"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates association with Data Controller"},
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-00:00",
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has data controller"},
   :rdfs/range          #{:dpvo/LegalEntity :dpvo/DataController},
   :rdfs/subPropertyOf  :dpvo/hasEntity,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasDataExporter
  {:db/ident :dpvo/hasDataExporter,
   :dcterms/created #inst "2022-02-09T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Paul Ryan"} {:rdf/value "Georg P. Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indiciates inclusion or applicability of a LegalEntity in the role of Data Exporter"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has data exporter"},
   :rdfs/range :dpvo/DataExporter,
   :rdfs/subPropertyOf :dpvo/hasEntity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasDataImporter
  {:db/ident :dpvo/hasDataImporter,
   :dcterms/created #inst "2022-02-09T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Paul Ryan"} {:rdf/value "Georg P. Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indiciates inclusion or applicability of a LegalEntity in the role of Data Importer"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has data importer"},
   :rdfs/range :dpvo/DataImporter,
   :rdfs/subPropertyOf :dpvo/hasRecipient,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasDataProcessor
  {:db/ident :dpvo/hasDataProcessor,
   :dcterms/created #inst "2022-02-09T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Paul Ryan"} {:rdf/value "Georg P. Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indiciates inclusion or applicability of a Data Processor"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has data processor"},
   :rdfs/range :dpvo/DataProcessor,
   :rdfs/subPropertyOf :dpvo/hasRecipient,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasDataProtectionOfficer
  {:db/ident            :dpvo/hasDataProtectionOfficer,
   :dcterms/created     #inst "2022-03-02T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Rob Brennan"} {:rdf/value "Paul Ryan"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Specifices an associated data protection officer"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has data protection officer"},
   :rdfs/range          :dpvo/DataProtectionOfficer,
   :rdfs/subPropertyOf  :dpvo/hasRepresentative,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasDataSource
  {:db/ident :dpvo/hasDataSource,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Paul Ryan"} {:rdf/value "Georg P. Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicates the source or origin of data being processed"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has data source"},
   :rdfs/range :dpvo/DataSource,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasDataSubject
  {:db/ident            :dpvo/hasDataSubject,
   :dcterms/created     #inst "2019-04-04T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Mark Lizar"}
                          {:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Bud Bruegger"}
                          {:rdf/value "Axel Polleres"}
                          {:rdf/value "Javier Fernández"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Indicates association with Data Subject"},
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-00:00",
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has data subject"},
   :rdfs/range          :dpvo/DataSubject,
   :rdfs/subPropertyOf  :dpvo/hasEntity,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasDataSubjectScale
  {:db/ident            :dpvo/hasDataSubjectScale,
   :dcterms/created     #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates the scale of data subjects"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has data subject scale"},
   :rdfs/range          :dpvo/DataSubjectScale,
   :rdfs/subPropertyOf  :dpvo/hasScale,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasDataVolume
  {:db/ident            :dpvo/hasDataVolume,
   :dcterms/created     #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates the volume of data"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has data volume"},
   :rdfs/range          :dpvo/DataVolume,
   :rdfs/subPropertyOf  :dpvo/hasScale,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasDuration
  {:db/ident            :dpvo/hasDuration,
   :dcterms/created     #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Mark Lizar"}
                          {:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Axel Polleres"}
                          {:rdf/value "Rob Brennan"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates information about duration"},
   :dcterms/source      {:xsd/anyURI "https://specialprivacy.ercim.eu/"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has duration"},
   :rdfs/range          :dpvo/Duration,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasEntity
  {:db/ident :dpvo/hasEntity,
   :dcterms/created #inst "2022-02-09T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates inclusion or applicability of an entity to some concept"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "parent property for controller, processor, data subject, authority, etc.?"},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has entity"},
   :rdfs/range :dpvo/Entity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasFrequency
  {:db/ident :dpvo/hasFrequency,
   :dcterms/created #inst "2022-02-16T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicates the frequency with which something takes place"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has frequency"},
   :rdfs/range :dpvo/Frequency,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasGeographicCoverage
  {:db/ident :dpvo/hasGeographicCoverage,
   :dcterms/created #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicate the geographic coverage (of specified context)"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has geographic coverage"},
   :rdfs/range :dpvo/GeographicCoverage,
   :rdfs/subPropertyOf :dpvo/hasScale,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasHumanInvolvement
  {:db/ident :dpvo/hasHumanInvolvement,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Paul Ryan"} {:rdf/value "Georg P. Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates Involvement of humans in processing such as within automated decision making process"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Human involvement is also relevant to 'human in the loop'"},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has human involvement"},
   :rdfs/range :dpvo/HumanInvolvement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasIdentifier
  {:db/ident :dpvo/hasIdentifier,
   :dcterms/created #inst "2020-11-25T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"} {:rdf/value "Georg P Krog"}
                      {:rdf/value "Harshvardhan J.Pandit"}
                      {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates an identifier associated for identification or reference"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has identifier"},
   :rdfs/range :owl/Thing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasImpact
  {:db/ident :dpvo/hasImpact,
   :dcterms/created #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates impact(s) possible or arising as consequences from specified concept"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has impact"},
   :rdfs/range :dpvo/Impact,
   :rdfs/subPropertyOf :dpvo/hasConsequence,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasImpactOn
  {:db/ident :dpvo/hasImpactOn,
   :dcterms/created #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates the thing (e.g. plan, process, or entity) affected by an impact"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :dpvo/Impact,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has impact on"},
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf :dpvo/hasConsequenceOn,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasIndicationMethod
  {:db/ident :dpvo/hasIndicationMethod,
   :dcterms/created #inst "2022-06-21T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Specifies the method by which an entity has indicated the specific context"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has indication method"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasJointDataControllers
  {:db/ident :dpvo/hasJointDataControllers,
   :dcterms/created #inst "2022-02-09T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Paul Ryan"} {:rdf/value "Georg P. Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates inclusion or applicability of a Joint Data Controller"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has joint data controllers"},
   :rdfs/range :dpvo/JointDataControllers,
   :rdfs/subPropertyOf :dpvo/hasDataController,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasJurisdiction
  {:db/ident            :dpvo/hasJurisdiction,
   :dcterms/created     #inst "2022-01-19T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates applicability of specified jurisdiction"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has jurisdiction"},
   :rdfs/range          :dpvo/Location,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasJustification
  {:db/ident :dpvo/hasJustification,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicates a justification for specified concept or context"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has justification"},
   :rdfs/range :dpvo/Justification,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasLawfulness
  {:db/ident :dpvo/hasLawfulness,
   :dcterms/created #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicates the status of being lawful or legally compliant"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has lawfulness"},
   :rdfs/range :dpvo/Lawfulness,
   :rdfs/subPropertyOf :dpvo/hasComplianceStatus,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasLegalBasis
  {:db/ident            :dpvo/hasLegalBasis,
   :dcterms/created     #inst "2019-04-04T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Axel Polleres"}
                          {:rdf/value "Javier Fernández"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates use or applicability of a Legal Basis"},
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-00:00",
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has legal basis"},
   :rdfs/range          :dpvo/LegalBasis,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasLikelihood
  {:db/ident            :dpvo/hasLikelihood,
   :dcterms/created     #inst "2022-07-20T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                          {:rdf/value "Julian Flake"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates the likelihood associated with a concept"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has likelihood"},
   :rdfs/range          :dpvo/Likelihood,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasLocation
  {:db/ident            :dpvo/hasLocation,
   :dcterms/created     #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Mark Lizar"}
                          {:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Axel Polleres"}
                          {:rdf/value "Rob Brennan"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates information about location"},
   :dcterms/source      {:xsd/anyURI "https://specialprivacy.ercim.eu/"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has location"},
   :rdfs/range          :dpvo/Location,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasName
  {:db/ident            :dpvo/hasName,
   :dcterms/created     #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Beatriz Esteves"}
                          {:rdf/value "Georg P Krog"}
                          {:rdf/value "Harshvardhan J.Pandit"}
                          {:rdf/value "Paul Ryan"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Specifies name of a legal entity"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :dpvo/Entity,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has name"},
   :rdfs/range          :owl/Thing,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasNotice
  {:db/ident :dpvo/hasNotice,
   :dcterms/created #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates the use or applicability of a Notice for the specified context"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has notice"},
   :rdfs/range :dpvo/Notice,
   :rdfs/subPropertyOf :dpvo/hasOrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasObligation
  {:db/ident :dpvo/hasObligation,
   :dcterms/created #inst "2022-10-19T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Specifying applicability or inclusion of an obligation rule within specified context"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :dpvo/Context,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has obligation"},
   :rdfs/range :dpvo/Obligation,
   :rdfs/subPropertyOf :dpvo/hasRule,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasOrganisationalMeasure
  {:db/ident :dpvo/hasOrganisationalMeasure,
   :dcterms/created #inst "2022-02-09T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicates use or applicability of Organisational measure"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has organisational measure"},
   :rdfs/range :dpvo/OrganisationalMeasure,
   :rdfs/subPropertyOf :dpvo/hasTechnicalOrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasOutcome
  {:db/ident :dpvo/hasOutcome,
   :dcterms/created #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicates an outcome of specified concept or context"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has outcome"},
   :rdfs/range :owl/Thing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasPermission
  {:db/ident :dpvo/hasPermission,
   :dcterms/created #inst "2022-10-19T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Specifying applicability or inclusion of a permission rule within specified context"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :dpvo/Context,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has permission"},
   :rdfs/range :dpvo/Permission,
   :rdfs/subPropertyOf :dpvo/hasRule,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasPersonalData
  {:db/ident            :dpvo/hasPersonalData,
   :dcterms/created     #inst "2022-01-19T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Indicates association with Personal Data"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has personal data"},
   :rdfs/range          :dpvo/PersonalData,
   :rdfs/subPropertyOf  :dpvo/hasData,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasPersonalDataHandling
  {:db/ident            :dpvo/hasPersonalDataHandling,
   :dcterms/created     #inst "2022-01-19T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates association with Personal Data Handling"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has personal data handling"},
   :rdfs/range          :dpvo/PersonalDataHandling,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasPolicy
  {:db/ident            :dpvo/hasPolicy,
   :dcterms/created     #inst "2022-01-26T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates policy applicable or used"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has policy"},
   :rdfs/range          :dpvo/Policy,
   :rdfs/subPropertyOf  :dpvo/hasTechnicalOrganisationalMeasure,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasProcessing
  {:db/ident            :dpvo/hasProcessing,
   :dcterms/created     #inst "2019-04-04T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Mark Lizar"}
                          {:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Bud Bruegger"}
                          {:rdf/value "Axel Polleres"}
                          {:rdf/value "Javier Fernández"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates association with Processing"},
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/source      {:xsd/anyURI "https://specialprivacy.ercim.eu/"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has processing"},
   :rdfs/range          :dpvo/Processing,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasProcessingAutomation
  {:db/ident :dpvo/hasProcessingAutomation,
   :dcterms/created #inst "2022-08-13T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates the use or extent of automation associated with processing"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has processing automation"},
   :rdfs/range :dpvo/AutomationOfProcessing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasProhibition
  {:db/ident :dpvo/hasProhibition,
   :dcterms/created #inst "2022-10-19T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Specifying applicability or inclusion of a prohibition rule within specified context"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :dpvo/Context,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has prohibition"},
   :rdfs/range :dpvo/Prohibition,
   :rdfs/subPropertyOf :dpvo/hasRule,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasPurpose
  {:db/ident            :dpvo/hasPurpose,
   :dcterms/created     #inst "2019-04-04T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Mark Lizar"}
                          {:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Bud Bruegger"}
                          {:rdf/value "Axel Polleres"}
                          {:rdf/value "Javier Fernández"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates association with Purpose"},
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/source      {:xsd/anyURI "https://specialprivacy.ercim.eu/"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has purpose"},
   :rdfs/range          :dpvo/Purpose,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasRecipient
  {:db/ident            :dpvo/hasRecipient,
   :dcterms/created     #inst "2019-04-04T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Mark Lizar"}
                          {:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Bud Bruegger"}
                          {:rdf/value "Axel Polleres"}
                          {:rdf/value "Javier Fernández"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates Recipient of Personal Data"},
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/source      {:xsd/anyURI "https://specialprivacy.ercim.eu/"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has recipient"},
   :rdfs/range          :dpvo/Recipient,
   :rdfs/subPropertyOf  :dpvo/hasEntity,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasRecipientDataController
  {:db/ident :dpvo/hasRecipientDataController,
   :dcterms/created #inst "2022-02-09T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Paul Ryan"} {:rdf/value "Georg P. Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indiciates inclusion or applicability of a Data Controller as a Recipient of persona data"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has recipient data controller"},
   :rdfs/range :dpvo/DataController,
   :rdfs/subPropertyOf :dpvo/hasRecipient,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasRecipientThirdParty
  {:db/ident :dpvo/hasRecipientThirdParty,
   :dcterms/created #inst "2022-02-09T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Paul Ryan"} {:rdf/value "Georg P. Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indiciates inclusion or applicability of a Third Party as a Recipient of persona data"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has recipient third party"},
   :rdfs/range :dpvo/ThirdParty,
   :rdfs/subPropertyOf :dpvo/hasRecipient,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasRelationWithDataSubject
  {:db/ident :dpvo/hasRelationWithDataSubject,
   :dcterms/created #inst "2022-06-21T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates the relation between specified Entity and Data Subject"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :dpvo/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has relation with data subject"},
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf :dpvo/hasEntity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasRepresentative
  {:db/ident            :dpvo/hasRepresentative,
   :dcterms/created     #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Beatriz Esteves"}
                          {:rdf/value "Georg P Krog"}
                          {:rdf/value "Harshvardhan J.Pandit"}
                          {:rdf/value "Paul Ryan"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Specifies representative of the legal entity"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :dpvo/Entity,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has representative"},
   :rdfs/range          :dpvo/Representative,
   :rdfs/subPropertyOf  :dpvo/hasEntity,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasResidualRisk
  {:db/ident :dpvo/hasResidualRisk,
   :dcterms/created #inst "2022-07-20T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates the associated risk is the remaining or residual risk from applying mitigation measures or treatments to this risk"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :dpvo/Risk,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has residual risk"},
   :rdfs/range :dpvo/Risk,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasResponsibleEntity
  {:db/ident :dpvo/hasResponsibleEntity,
   :dcterms/created #inst "2022-03-02T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Specifies the indicated entity is responsible within some context"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has responsible entity"},
   :rdfs/range :dpvo/Entity,
   :rdfs/subPropertyOf :dpvo/hasEntity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasRight
  {:db/ident            :dpvo/hasRight,
   :dcterms/created     #inst "2020-11-18T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Indicates use or applicability of Right"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has right"},
   :rdfs/range          :dpvo/Right,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasRisk
  {:db/ident            :dpvo/hasRisk,
   :dcterms/created     #inst "2020-11-18T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description #{{:rdf/language "en",
                           :rdf/value
                           "Indicates applicability of Risk for this concept"}
                          {:rdf/language "en",
                           :rdf/value    "Indicates applicability of Risk"}},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has risk"},
   :rdfs/range          :dpvo/Risk,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasRiskLevel
  {:db/ident :dpvo/hasRiskLevel,
   :dcterms/created #inst "2022-07-20T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicates the associated risk level associated with a risk"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :dpvo/Risk,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has risk level"},
   :rdfs/range :dpvo/RiskLevel,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasRule
  {:db/ident :dpvo/hasRule,
   :dcterms/created #inst "2022-10-19T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Specifying applicability or inclusion of a rule within specified context"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :dpvo/Context,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has rule"},
   :rdfs/range :dpvo/Rule,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasScale
  {:db/ident            :dpvo/hasScale,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Indicates the scale of specified concept"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has scale"},
   :rdfs/range          :dpvo/Scale,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasScope
  {:db/ident            :dpvo/hasScope,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates the scope of specified concept or context"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has scope"},
   :rdfs/range          :dpvo/Scope,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasSector
  {:db/ident :dpvo/hasSector,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates the purpose is associated with activities in the indicated (Economic) Sector(s)"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has sector"},
   :rdfs/range :dpvo/Sector,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasSeverity
  {:db/ident            :dpvo/hasSeverity,
   :dcterms/created     #inst "2022-07-20T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                          {:rdf/value "Julian Flake"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates the severity associated with a concept"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has severity"},
   :rdfs/range          :dpvo/Severity,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasStatus
  {:db/ident            :dpvo/hasStatus,
   :dcterms/created     #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates the status of specified concept"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has status"},
   :rdfs/range          :dpvo/Status,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasStorageCondition
  {:db/ident            :dpvo/hasStorageCondition,
   :dcterms/created     #inst "2022-08-13T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Mark Lizar"}
                          {:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Axel Polleres"}
                          {:rdf/value "Rob Brennan"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates information about storage condition"},
   :dcterms/source      {:xsd/anyURI "https://specialprivacy.ercim.eu/"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has storage condition"},
   :rdfs/range          :dpvo/StorageCondition,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "changed"}})

(def hasTechnicalMeasure
  {:db/ident            :dpvo/hasTechnicalMeasure,
   :dcterms/created     #inst "2022-02-09T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates use or applicability of Technical measure"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has technical measure"},
   :rdfs/range          :dpvo/TechnicalMeasure,
   :rdfs/subPropertyOf  :dpvo/hasTechnicalOrganisationalMeasure,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasTechnicalOrganisationalMeasure
  {:db/ident :dpvo/hasTechnicalOrganisationalMeasure,
   :dcterms/created #inst "2019-04-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Mark Lizar"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Bud Bruegger"} {:rdf/value "Axel Polleres"}
                      {:rdf/value "Javier Fernández"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates use or applicability of Technical or Organisational measure"},
   :dcterms/modified #inst "2020-11-04T00:00:00.000-00:00",
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has technical and organisational measure"},
   :rdfs/range :dpvo/TechnicalOrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasThirdCountry
  {:db/ident :dpvo/hasThirdCountry,
   :dcterms/created #inst "2022-02-09T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicates applicability or relevance of a 'third country'"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has third country"},
   :rdfs/range :dpvo/ThirdCountry,
   :rdfs/subPropertyOf :dpvo/hasCountry,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def isAfter
  {:db/ident :dpvo/isAfter,
   :dcterms/created #inst "2022-03-02T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P. Krog"} {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates the specified concepts is 'after' this concept in some context"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is after"},
   :rdfs/range :owl/Thing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def isAuthorityFor
  {:db/ident :dpvo/isAuthorityFor,
   :dcterms/created #inst "2022-01-19T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicates area, scope, or applicability of an Authority"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :dpvo/Authority,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is authority for"},
   :rdfs/range :owl/Thing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def isBefore
  {:db/ident :dpvo/isBefore,
   :dcterms/created #inst "2022-03-02T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P. Krog"} {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates the specified concepts is 'before' this concept in some context"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is before"},
   :rdfs/range :owl/Thing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def isExercisedAt
  {:db/ident :dpvo/isExercisedAt,
   :dcterms/created #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicates context or information about exercising a right"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :dpvo/ActiveRight,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is exercised at"},
   :rdfs/range :dpvo/RightExerciseNotice,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def isImplementedByEntity
  {:db/ident :dpvo/isImplementedByEntity,
   :dcterms/created #inst "2019-05-07T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Indicates implementation details such as entities or agents"},
   :dcterms/modified #inst "2022-01-26T00:00:00.000-00:00",
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The use of 'entity' is inclusive of entities (e.g. Data Processor) as well as 'agent' (e.g. DPO). For indicating technological implementation, the property isImplementedByTechnology should be used."},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is implemented by entity"},
   :rdfs/range :dpvo/Entity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def isImplementedUsingTechnology
  {:db/ident :dpvo/isImplementedUsingTechnology,
   :dcterms/created #inst "2022-01-26T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Paul Ryan"} {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates implementation details such as technologies or processes"},
   :dcterms/modified #inst "2022-06-15T00:00:00.000-00:00",
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The term 'technology' is inclusive of technologies, processes, and methods."},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is implemented using technology"},
   :rdfs/range :dpvo/Technology,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def isIndicatedAtTime
  {:db/ident :dpvo/isIndicatedAtTime,
   :dcterms/created #inst "2022-06-21T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Specifies the temporal information for when the entity has indicated the specific context"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is indicated at time"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def isIndicatedBy
  {:db/ident            :dpvo/isIndicatedBy,
   :dcterms/created     #inst "2022-06-21T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                          {:rdf/value "Julian Flake"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Specifies entity who indicates the specific context"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "is indicated by"},
   :rdfs/range          :dpvo/Entity,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def isMitigatedByMeasure
  {:db/ident            :dpvo/isMitigatedByMeasure,
   :dcterms/created     #inst "2022-02-09T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicate a risk is mitigated by specified measure"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :dpvo/Risk,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "is mitigated by measure"},
   :rdfs/range          :dpvo/RiskMitigationMeasure,
   :rdfs/subPropertyOf  :dpvo/hasTechnicalOrganisationalMeasure,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def isPolicyFor
  {:db/ident            :dpvo/isPolicyFor,
   :dcterms/created     #inst "2022-01-26T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates the context or application of policy"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :dpvo/Policy,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "is policy for"},
   :rdfs/range          :owl/Thing,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def isRepresentativeFor
  {:db/ident :dpvo/isRepresentativeFor,
   :dcterms/created #inst "2022-11-09T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Indicates the entity is a representative for specified entity"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :dpvo/Representative,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is representative for"},
   :rdfs/range :dpvo/Entity,
   :rdfs/subPropertyOf :dpvo/hasEntity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def isResidualRiskOf
  {:db/ident :dpvo/isResidualRiskOf,
   :dcterms/created #inst "2022-07-20T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates this risk is the remaining or residual risk from applying mitigation measures or treatments to specified risk"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :dpvo/Risk,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is residual risk of"},
   :rdfs/range :dpvo/Risk,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def mitigatesRisk
  {:db/ident            :dpvo/mitigatesRisk,
   :dcterms/created     #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates risks mitigated by this concept"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :dpvo/RiskMitigationMeasure,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "mitigates risk"},
   :rdfs/range          :dpvo/Risk,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def urn:uuid:e3e84193-c4fd-55f1-8b85-a1870908ac13
  {:dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "The Data Privacy Vocabulary (DPV) provides terms (classes and properties) to represent information about legally compliant personal data handling, which includes purposes, processing, personal data, technical and organisational measures."},
   :dcterms/contributor
   #{"Fajar J. Ekaputra" "Rigo Wenning" "Georg P Krog" "Ramisa Gachpaz Hamed"
     "Axel Polleres" "Simon Steyskal" "Harshvardhan J. Pandit" "Beatriz Esteves"
     "Eva Schlehahn" "Rob Brennan" "Bert Bos" "Julian Flake" "Paul Ryan"
     "Bud Bruegger" "Piero Bonatti" "Elmar Kiesling" "Javier D. Fernández"
     "Mark Lizar"},
   :dcterms/created #inst "2019-06-18T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Data Privacy Vocabulary (DPV) provides terms (classes and properties) to represent information about legally compliant personal data handling, which includes purposes, processing, personal data, technical and organisational measures."},
   :dcterms/license {:xsd/anyURI
                     "https://www.w3.org/Consortium/Legal/2015/doc-license"},
   :dcterms/modified #inst "2022-12-05T00:00:00.000-00:00",
   :dcterms/source {:xsd/anyURI "https://www.w3.org/community/dpvcg/"},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Data Privacy Vocabulary"},
   :owl/versionInfo "1",
   :rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "dpvo",
   :vann/preferredNamespaceUri "https://w3id.org/dpv/dpv-owl#",
   :xsd/anyURI "https://w3id.org/dpv/dpv-owl"})