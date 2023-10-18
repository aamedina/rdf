(ns net.wikipunk.rdf.dpvo-risk
  {:dcat/downloadURL "net/wikipunk/ext/dpv-owl/risk/risk.ttl",
   :dcterms/abstract {:rdf/language "en",
                      :rdf/value    "Risk Extension for DPV-OWL"},
   :dcterms/contributor #{"Georg P Krog" "Harshvardhan J. Pandit"
                          "Beatriz Esteves" "Julian Flake" "Paul Ryan"},
   :dcterms/created #inst "2022-08-14T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Risk extension to Data Privacy Vocabulary provides terms (classes and properties) related to risk management, assessment, and consequences."},
   :dcterms/license {:xsd/anyURI
                     "https://www.w3.org/Consortium/Legal/2015/doc-license"},
   :dcterms/modified #inst "2022-10-06T00:00:00.000-00:00",
   :dcterms/source {:xsd/anyURI "https://www.w3.org/community/dpvcg/"},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Risk Extension for DPV-OWL"},
   :namespaces {"dcterms"   "http://purl.org/dc/terms/",
                "dpvo"      "https://w3id.org/dpv/dpv-owl#",
                "dpvo-risk" "https://w3id.org/dpv/dpv-owl/risk#",
                "owl"       "http://www.w3.org/2002/07/owl#",
                "rdf"       "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs"      "http://www.w3.org/2000/01/rdf-schema#",
                "vann"      "http://purl.org/vocab/vann/",
                "vs"        "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                "xsd"       "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports {:xsd/anyURI "https://w3id.org/dpv/dpv-owl"},
   :owl/versionInfo "0.8.2",
   :rdf/type :owl/Ontology,
   :rdfa/prefix "dpvo-risk",
   :rdfa/uri "https://w3id.org/dpv/dpv-owl/risk#",
   :vann/preferredNamespacePrefix "dpvs-risk",
   :vann/preferredNamespaceUri "https://w3id.org/dpv/dpv-owl/risk#",
   :xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk"})

(def ACSC-ISM
  {:db/ident :dpvo-risk/ACSC-ISM,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Australian Cyber Security Centre (ACSC) published the Australian Government Information Security Manual (ISM) which adopts the use of a risk management framework that draws from NIST 800-37, and includes six steps: define the system, select security controls, implement security controls, assess security controls, authorise the system and monitor the system"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ACSC-ISM"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ALARA
  {:db/ident :dpvo-risk/ALARA,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "As Low as Resonably Achievable (ALARP) - A criteria for deciding significance of risk and means of evaluating tolerability of risk"},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ALARA"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ALARP
  {:db/ident :dpvo-risk/ALARP,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "As Low as Resonably Possible (ALARP) - A criteria for deciding significance of risk and means of evaluating tolerability of risk"},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ALARP"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ANSI-ISA-62443-3‑2-2020
  {:db/ident :dpvo-risk/ANSI-ISA-62443-3‑2-2020,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "ANSI/ISA-62443-3-2-2020 standard, entitled ‘Security for industrial automation and control systems, Part 3-2: Security risk assessment for system design’, from the International Society of Automation (ISA), dedicates an entire part to the assessment of security risk for system design targeting Security and IT professionals"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ANSI/ISA-62443-3‑2-2020"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AbusiveContentUtilisation
  {:db/ident :dpvo-risk/AbusiveContentUtilisation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Abusive Content Utilisation"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AttackonPrivateLife
  {:db/ident            :dpvo-risk/AttackonPrivateLife,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Attack on Private Life"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def AuthorisationFailure
  {:db/ident :dpvo-risk/AuthorisationFailure,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/trust-services-security-incidents-2021"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Authorisation Failure"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AvoidSource
  {:db/ident            :dpvo-risk/AvoidSource,
   :dcterms/created     #inst "2022-08-21T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Risk Control that avoids the risk source"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Avoid Source"},
   :rdfs/subClassOf     :dpvo-risk/ControlRiskSource,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def BSI-200-2
  {:db/ident :dpvo-risk/BSI-200-2,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The BSI-Standard 200-2 (‘IT-Grundschutz Methodology’) provides a methodology for the management of information security which can be adapted to the requirements of organisations of various types and sizes"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "BSI Standard 200-2"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BayesianAnalysis
  {:db/ident :dpvo-risk/BayesianAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A means of making inference about model parameters using Bayes' theorem which has the capability of incorporating empirical data into prior judgements about probabilities"},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Bayesian Analysis"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BayesianNetworks
  {:db/ident :dpvo-risk/BayesianNetworks,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A graphical model of variables and their cause-effect relationships expressed using probabilities"},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Bayesian Networks"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Blackmail
  {:db/ident            :dpvo-risk/Blackmail,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Blackmail"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def BowTie
  {:db/ident :dpvo-risk/BowTie,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A diagrammatic way of describing the pathways from sources of risk to outcomes, and of reviewing controls"},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Bow Tie Analysis"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Brainstorming
  {:db/ident :dpvo-risk/Brainstorming,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Technique used in workshops to encourage imaginative thinking"},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Brainstorming"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BruteForceAuthorisations
  {:db/ident :dpvo-risk/BruteForceAuthorisations,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Brute Force Authorisations"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BusinessImpact
  {:db/ident :dpvo-risk/BusinessImpact,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Business impact"},
   :rdfs/subClassOf :dpvo/Impact,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BusinessImpactAnalysis
  {:db/ident :dpvo-risk/BusinessImpactAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A process that analyses the consequences of a disruptive incident on the organization which determines the recovery priorities of an organization's products and services and, thereby, the priorities of the activities and resources which deliver them"},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Business Impact Analysis"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BusinessPerformanceImpairment
  {:db/ident            :dpvo-risk/BusinessPerformanceImpairment,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Business Performance Impairment"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Businessdisruption
  {:db/ident            :dpvo-risk/Businessdisruption,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Business disruption"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CCRACII
  {:db/ident :dpvo-risk/CCRACII,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Guide to Conducting Cybersecurity Risk Assessment for Critical Information Infrastructure (CCRACII) defines commonly used terms such as threat event, vulnerability, likelihood, impact and risk, roles, and responsibilities, in addition to a range for risk levels, ranging from low to very high with different level of risk toleranc"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CCRACII"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CORAS
  {:db/ident :dpvo-risk/CORAS,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The CORAS method was developed and is supported by SourceForge. It is a method for conducting the analysis and management of security risk. It provides a customised language for modelling threats and risks as well as detailed guidelines explaining how the language should be used to capture and model relevant information during the various stages of the security analysis"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CORAS"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CRAMM
  {:db/ident :dpvo-risk/CRAMM,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "CCTA Risk Assessment and Management Methodology (CRAMM) is a method that an analyst or group of analysts may use to evaluate the security and risk level of an organisation by analysing and combining the diverse knowledge distributed in the local corporate environment"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/risk-management-standards"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CRAMM"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CVaR
  {:db/ident :dpvo-risk/CVaR,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A measure of the expected loss from a financial portfolio in the worst a % of cases. Also called expected shortfall (ES)"},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Conditional Value at Risk (CVaR)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CausalMapping
  {:db/ident :dpvo-risk/CausalMapping,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A network diagram representing events, causes and effects and their relationships."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Causal Mapping"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CauseConsequenceAnalysis
  {:db/ident :dpvo-risk/CauseConsequenceAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A combination of fault and event tree analysis that allows inclusion of time delays. Both causes and consequences of an initiating event are considered."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cause-Consequence Analysis"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ChangeConsequence
  {:db/ident            :dpvo-risk/ChangeConsequence,
   :dcterms/created     #inst "2022-08-25T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Risk Control that changes Consequence"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Change Consequence"},
   :rdfs/subClassOf     :dpvo-risk/ControlConsequence,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ChangeImpact
  {:db/ident            :dpvo-risk/ChangeImpact,
   :dcterms/created     #inst "2022-08-26T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Risk Control that changes Impact"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Change Impact"},
   :rdfs/subClassOf     :dpvo-risk/ControlConsequence,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Checklists
  {:db/ident :dpvo-risk/Checklists,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A checklist based on experience or on concepts and models that can be used to help identify risks or controls."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Checklists"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ChildViolence
  {:db/ident :dpvo-risk/ChildViolence,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Child Violence"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Cindynic
  {:db/ident :dpvo-risk/Cindynic,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Considers goals, values, rules, data and models of stakeholders and identifies inconsistencies, ambiguities, omissions and ignorance. These form systemic sources and drivers of risk."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cindynic Approach"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CitizensImpact
  {:db/ident :dpvo-risk/CitizensImpact,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Citizens impact"},
   :rdfs/subClassOf :dpvo/Impact,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Classifications
  {:db/ident :dpvo-risk/Classifications,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A classification list based on experience or on concepts and models that can be used to help identify risks or controls."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Classifications"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Coercion
  {:db/ident :dpvo-risk/Coercion,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Coercion"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ComplianceImpact
  {:db/ident :dpvo-risk/ComplianceImpact,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Compliance impact"},
   :rdfs/subClassOf :dpvo/Impact,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CompromiseAccount
  {:db/ident :dpvo-risk/CompromiseAccount,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Compromise Account"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CompromiseAccountCredentials
  {:db/ident :dpvo-risk/CompromiseAccountCredentials,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Compromise Account Credentials"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CompromiseAccountSecurity
  {:db/ident :dpvo-risk/CompromiseAccountSecurity,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Compromise Account Security"},
   :rdfs/subClassOf :dpvo/NonMaterialDamage,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConfidentialityBreach
  {:db/ident            :dpvo-risk/ConfidentialityBreach,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Confidentiality Breach"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ConsequenceForDataSubject
  {:db/ident            :dpvo-risk/ConsequenceForDataSubject,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Consequence for Data Subject"},
   :rdfs/subClassOf     :dpvo/Consequence,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ConsequenceOnDataSecurity
  {:db/ident            :dpvo-risk/ConsequenceOnDataSecurity,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Consequence on Data Security"},
   :rdfs/subClassOf     :dpvo/Consequence,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ControlConsequence
  {:db/ident :dpvo-risk/ControlConsequence,
   :dcterms/created #inst "2022-08-24T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Risk Mitigation Measure that controls the Consequences and Impacts"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Control Consequence"},
   :rdfs/subClassOf :dpvo/RiskMitigationMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ControlMonitors
  {:db/ident :dpvo-risk/ControlMonitors,
   :dcterms/created #inst "2022-08-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Risk Mitigation Measure that uses controls to monitor events"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Monitoring can be associated with characteristics such as assessing or detecting whether something is active, operational, performant, effective, has potential to materialise, is materialising, or has already materialised."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Control Monitors"},
   :rdfs/subClassOf :dpvo/RiskMitigationMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ControlRiskSource
  {:db/ident :dpvo-risk/ControlRiskSource,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Risk Mitigation Measure that controls the Risk Source"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Control Risk Source"},
   :rdfs/subClassOf :dpvo/RiskMitigationMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CopyrightViolation
  {:db/ident :dpvo-risk/CopyrightViolation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Copyright Violation"},
   :rdfs/subClassOf :dpvo/NonMaterialDamage,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CorruptionData
  {:db/ident            :dpvo-risk/CorruptionData,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Corruption of Data"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CostAcquisition
  {:db/ident            :dpvo-risk/CostAcquisition,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Cost of Acquisition"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CostBackup
  {:db/ident            :dpvo-risk/CostBackup,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Cost of Backup"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CostBenefitAnalysis
  {:db/ident :dpvo-risk/CostBenefitAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Uses money as a scale for estimating positive and negative, tangible and intangible, consequences of different options."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cost/benefit Analysis"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CostConfiguration
  {:db/ident            :dpvo-risk/CostConfiguration,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Cost of Configuration"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CostInstallation
  {:db/ident            :dpvo-risk/CostInstallation,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Cost of Installation"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CostJudicialPenalties
  {:db/ident            :dpvo-risk/CostJudicialPenalties,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Cost of Judicial Penalties"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CostJudicialProceedings
  {:db/ident            :dpvo-risk/CostJudicialProceedings,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Cost of Judicial Proceedings"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CostOperationInterruption
  {:db/ident            :dpvo-risk/CostOperationInterruption,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Cost of Operation Interruption"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CostSuspendedOperations
  {:db/ident            :dpvo-risk/CostSuspendedOperations,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Cost of Suspended Operations"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CrossImpactAnalysis
  {:db/ident :dpvo-risk/CrossImpactAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Evaluates changes in the probability of the occurrence of a given set of events consequent on the actual occurrence of one of them."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cross Impact Analysis"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Cryptojacking
  {:db/ident :dpvo-risk/Cryptojacking,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Cryptojacking or hidden cryptomining is a type of cybercrime where a criminal secretly uses a victim’s computing power to generate cryptocurrency"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/enisa-threat-landscape-2021"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cryptojacking"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CyberSpying
  {:db/ident            :dpvo-risk/CyberSpying,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Cyber Spying"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CyberStalking
  {:db/ident            :dpvo-risk/CyberStalking,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Cyber Stalking"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DPIA
  {:db/ident :dpvo-risk/DPIA,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Analyses how incidents and events could affect the protection of data and its effects on persons and identifies and quantifies the capabilities that would be needed to manage it."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Protection Impact Assessment (DPIA)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DamageByThirdParty
  {:db/ident :dpvo-risk/DamageByThirdParty,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Damage by Third Party"},
   :rdfs/subClassOf :dpvo/Damage,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DangertoCustomers
  {:db/ident            :dpvo-risk/DangertoCustomers,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Danger to Customers"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DangertoPersonnel
  {:db/ident            :dpvo-risk/DangertoPersonnel,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Danger to Personnel"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DataBreach
  {:db/ident            :dpvo-risk/DataBreach,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Data Breach"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DecisionTreeAnalysis
  {:db/ident :dpvo-risk/DecisionTreeAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Uses a tree-like representation or model of decisions and their possible consequences. Outcomes are usually expressed in monetary terms or in terms of utility."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Decision Tree Analysis"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DelphiTechnique
  {:db/ident :dpvo-risk/DelphiTechnique,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Collects judgements through a set of sequential questionnaires. People participate individually but receive feedback on the responses of others after each set of questions."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Delphi Technique"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DenialServiceAttack
  {:db/ident            :dpvo-risk/DenialServiceAttack,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Denial of Service Attack (DoS)"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DetrimentToRecovery
  {:db/ident :dpvo-risk/DetrimentToRecovery,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Detriment to Recovery"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Discrimination
  {:db/ident            :dpvo-risk/Discrimination,
   :dcterms/created     #inst "2022-08-19T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Georg P Krog"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Discrimination"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DistributedDenialServiceAttack
  {:db/ident            :dpvo-risk/DistributedDenialServiceAttack,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value
                         "Distributed Denial of Service Attack (DDoS)"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def EBIOS
  {:db/ident :dpvo-risk/EBIOS,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Expression des Besoins et Identification des Objectifs de Sécurité (EBIOS) Risk Manager is an information security risk management method, created under the French General Secretariat of National Defence, consistent with ISO 31000 and ISO/IEC 27005, and enables the risk management requirements of ISO/IEC 27001 to be met"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/risk-management-standards"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EBIOS"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ERM-IF
  {:db/ident :dpvo-risk/ERM-IF,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Enterprise Risk Management - Integrated Framework (ERM-IF) defines the essential components of enterprise risk management. It is based on a set of principles and concepts for the enterprise and has as its objective to offer a common language for enterprise risk"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ERM-IF"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ETSI-TS-102-165-1
  {:db/ident :dpvo-risk/ETSI-TS-102-165-1,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "ETSI TS 102 165-1 offers methodology and pro-forma for threat, vulnerability and risk analysis (TVRA). According to ETSI TS 102 165-1, threat vulnerability and risk analysis (TVRA) is used to identify risk to an information system based upon the product of the likelihood of an attack and the impact that such an attack will have on the system"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ETSI TS 102 165-1"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EU-ITSRM
  {:db/ident :dpvo-risk/EU-ITSRM,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "ITSRM² IT Security Risk Management Methodology is a methodology provided by DG DIGIT and the European Commission as part of a set of standards for information security"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ITSRM²"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Eavesdropping
  {:db/ident            :dpvo-risk/Eavesdropping,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Eavesdropping"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def EconomicDisadvantage
  {:db/ident            :dpvo-risk/EconomicDisadvantage,
   :dcterms/created     #inst "2022-08-19T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Georg P Krog"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Economic Disadvantage"},
   :rdfs/subClassOf     :dpvo/Impact,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def EnvironmentalSafetyEndangerment
  {:db/ident            :dpvo-risk/EnvironmentalSafetyEndangerment,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Environmental Safety Endangerment"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def EquipmentFailure
  {:db/ident            :dpvo-risk/EquipmentFailure,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Equipment Failure"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def EquipmentMalfunction
  {:db/ident            :dpvo-risk/EquipmentMalfunction,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Equipment Malfunction"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ErrornousSystemUse
  {:db/ident            :dpvo-risk/ErrornousSystemUse,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Errornous System Use"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def EventTreeAnalysis
  {:db/ident :dpvo-risk/EventTreeAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Models the possible outcomes from a given initiating event and the status of controls thus analysing the frequency or probability of the various possible outcomes."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Event Tree Analysis"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Extorsion
  {:db/ident :dpvo-risk/Extorsion,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extorsion"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ExtremelyHighLikelihood
  {:db/ident :dpvo-risk/ExtremelyHighLikelihood,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Level where Likelihood is Extremely High"},
   :rdf/type #{:dpvo/Likelihood :owl/NamedIndividual
               :dpvo-risk/|7LikelihoodLevels|},
   :rdf/value 0.99M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.99 on a scale of 0 to 1"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely High Likelihood"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ExtremelyHighRisk
  {:db/ident :dpvo-risk/ExtremelyHighRisk,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Risk is Extremely High"},
   :rdf/type #{:dpvo-risk/|7RiskLevels| :dpvo/RiskLevel :owl/NamedIndividual},
   :rdf/value 0.99M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.99 on a scale of 0 to 1"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely High Risk"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ExtremelyHighSeverity
  {:db/ident :dpvo-risk/ExtremelyHighSeverity,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Level where Severity is Extremely High"},
   :rdf/type #{:dpvo/Severity :dpvo-risk/|7SeverityLevels|
               :owl/NamedIndividual},
   :rdf/value 0.99M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.99 on a scale of 0 to 1"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely High Severity"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ExtremelyLowLikelihood
  {:db/ident :dpvo-risk/ExtremelyLowLikelihood,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Level where Likelihood is Extremely Low"},
   :rdf/type #{:dpvo/Likelihood :owl/NamedIndividual
               :dpvo-risk/|7LikelihoodLevels|},
   :rdf/value 0.01M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.01 on a scale of 0 to 1"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely Low Likelihood"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ExtremelyLowRisk
  {:db/ident :dpvo-risk/ExtremelyLowRisk,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Risk is Extremely Low"},
   :rdf/type #{:dpvo-risk/|7RiskLevels| :dpvo/RiskLevel :owl/NamedIndividual},
   :rdf/value 0.01M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.01 on a scale of 0 to 1"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely Low Risk"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ExtremelyLowSeverity
  {:db/ident :dpvo-risk/ExtremelyLowSeverity,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Severity is Extremely Low"},
   :rdf/type #{:dpvo/Severity :dpvo-risk/|7SeverityLevels|
               :owl/NamedIndividual},
   :rdf/value 0.01M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.01 on a scale of 0 to 1"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely Low Severity"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FAIR
  {:db/ident :dpvo-risk/FAIR,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The purpose of the FAIR (Factor Analysis of Information Risk) model is to help organisations understand, analyse, and measure information risk. The model provides an approach to quantify risk and defines the necessary building blocks for implementing effective cyber risk management programmes"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FAIR"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FAIR-Privacy
  {:db/ident :dpvo-risk/FAIR-Privacy,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Factors Analysis in Information Risk (FAIR Privacy) is a quantitative privacy risk framework based on FAIR (Factors Analysis in Information Risk) that examines personal privacy risks (to individuals), not organisational risks"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/risk-management-standards"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FAIR Privacy"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FMEA
  {:db/ident :dpvo-risk/FMEA,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Considers the ways in which each component of a system might fail and the failure causes and effects."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Failure Modes And Effects Analysis (FMEA)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FMECA
  {:db/ident :dpvo-risk/FMECA,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Considers the ways in which each component of a system might fail and the failure causes and effects. FMEA followed by a criticality analysis which defines the significance of each failure mode (FMECA)."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "Failure Modes And Effects And Criticality Analysis (FMECA)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FNDiagrams
  {:db/ident :dpvo-risk/FNDiagrams,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Special case of quantitative consequence/likelihood graph applied to consideration of tolerability of risk to human life."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "F-N Diagrams"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FaultTreeAnalysis
  {:db/ident :dpvo-risk/FaultTreeAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Analyses causes of a focus event using Boolean logic to describe combinations of faults. Variations include a success tree where the top event is desired and a cause tree used to investigate past events."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fault Tree Analysis"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FinancialEquipmentCosts
  {:db/ident            :dpvo-risk/FinancialEquipmentCosts,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Financial Equipment Costs"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def FinancialInvestigationCosts
  {:db/ident            :dpvo-risk/FinancialInvestigationCosts,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Financial Investigation Costs"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def FinancialLoss
  {:db/ident            :dpvo-risk/FinancialLoss,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Financial Loss"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def FinancialPersonnelCosts
  {:db/ident            :dpvo-risk/FinancialPersonnelCosts,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Financial Personnel Costs"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def FinancialRepairCosts
  {:db/ident            :dpvo-risk/FinancialRepairCosts,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Financial Repair Costs"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Fishbone
  {:db/ident :dpvo-risk/Fishbone,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Identifies contributory factors to a defined outcome (wanted or unwanted). Contributory factors are usually divided into predefined categories and displayed in a tree structure or a fishbone diagram."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ishikawa (Fishbone)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Fraud
  {:db/ident            :dpvo-risk/Fraud,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Fraud"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def GCSOS
  {:db/ident :dpvo-risk/GCSOS,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Guidelines on Cyber Security Onboard Ships (GCSOS) guidelines explain why and how cyber risks should be managed in a shipping context. They outline the risk assessment process with an explanation of the part played by each component of cyber risk and offer advice on how to respond to and recover from cyber incidents"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GCSOS"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def GameTheory
  {:db/ident :dpvo-risk/GameTheory,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The study of strategic decision making to model the impact of the decisions of different players involved in the game. Example application area can be risk based pricing."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Game Theory"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def GovernmentCrisis
  {:db/ident            :dpvo-risk/GovernmentCrisis,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Government Crisis"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def HACCP
  {:db/ident :dpvo-risk/HACCP,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Analyses the risk reduction that can be achieved by various layers of protection."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "Hazard Analysis And Critical Control Points (HACCP)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HAZOP
  {:db/ident :dpvo-risk/HAZOP,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A structured and systematic examination of a planned or existing process or operation in order to identify and evaluate problems that might represent risk to personnel or equipment, or prevent efficient operation"},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Hazard And Operability Studies (HAZOP)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HITRUST-CSF
  {:db/ident :dpvo-risk/HITRUST-CSF,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The HITRUST Cyber-Security Framework (CSF) is a framework created by security industry experts to safeguard sensitive information and manage information risk for organisations across all industries and throughout the third-party supply chain"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "HITRUST-CSF"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HaltSource
  {:db/ident :dpvo-risk/HaltSource,
   :dcterms/created #inst "2022-08-19T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Risk Control that halts the risk source or prevents it from materialising"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Halt Source"},
   :rdfs/subClassOf :dpvo-risk/ControlRiskSource,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HarmfulSpeech
  {:db/ident :dpvo-risk/HarmfulSpeech,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Harmful Spech"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HealthLifeImpact
  {:db/ident :dpvo-risk/HealthLifeImpact,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Health and life impact"},
   :rdfs/subClassOf :dpvo/Impact,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HighLikelihood
  {:db/ident :dpvo-risk/HighLikelihood,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Likelihood is High"},
   :rdf/type #{:dpvo/Likelihood :dpvo-risk/|3LikelihoodLevels|
               :dpvo-risk/|5LikelihoodLevels| :owl/NamedIndividual
               :dpvo-risk/|7LikelihoodLevels|},
   :rdf/value 0.75M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.75 on a scale of 0 to 1"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Likelihood"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HighRisk
  {:db/ident :dpvo-risk/HighRisk,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Risk is High"},
   :rdf/type #{:dpvo-risk/|7RiskLevels| :dpvo/RiskLevel :dpvo-risk/|3RiskLevels|
               :owl/NamedIndividual :dpvo-risk/|5RiskLevels|},
   :rdf/value 0.75M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.75 on a scale of 0 to 1"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HighSeverity
  {:db/ident :dpvo-risk/HighSeverity,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Severity is High"},
   :rdf/type #{:dpvo/Severity :dpvo-risk/|7SeverityLevels|
               :dpvo-risk/|3SeverityLevels| :dpvo-risk/|5SeverityLevels|
               :owl/NamedIndividual},
   :rdf/value 0.75M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.75 on a scale of 0 to 1"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Severity"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HumanErrors
  {:db/ident :dpvo-risk/HumanErrors,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Human Errors"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HumanReliabilityAnalysis
  {:db/ident :dpvo-risk/HumanReliabilityAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A set of techniques for identifying the potential for human error and estimating the likelihood of failure."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Human Reliability Analysis"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IMO-MSC-FAL1-CIRC3
  {:db/ident :dpvo-risk/IMO-MSC-FAL1-CIRC3,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The official International Maritime Organization guidelines IMO MSC-FAL.1/CIRC.3 provide a high-level approach to the management pf maritime cyber risk which refers to the extent a technology asset is exposed to risks during an event that could result in shipping-related operational failure"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IMO MSC-FAL.1/CIRC.3"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IRAM2
  {:db/ident :dpvo-risk/IRAM2,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information Risk Assessment Methodology (IRAM2) supports risk assessment and treatment and entails a six-phase process, and is is implemented by an automated toolset"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IRAM2"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IS-BM
  {:db/ident :dpvo-risk/IS-BM,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The IS risk analysis method is based on a business model using a quantitative approach. The values of IS assets come from their importance towards operational continuity, as well as from their replacement costs"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IS-BM"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ISACA-RISK-IT
  {:db/ident :dpvo-risk/ISACA-RISK-IT,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The ISACA Risk IT Framework provides a set of guiding principles and supporting practices for enterprise management, combined to deliver a comprehensive process model for governing and managing IT risk"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ISACA-RISK-IT"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ISAMM
  {:db/ident :dpvo-risk/ISAMM,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information Security Assessment and Monitoring Method (ISAMM) is a quantitative type of risk management methodology that can be applied by various organisations such as governmental agencies, large companies and small and medium size enterprises"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/risk-management-standards"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ISAMM"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ISO-IEC-27005-2018
  {:db/ident :dpvo-risk/ISO-IEC-27005-2018,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "ISO/IEC 27005:2018 ‘Information technology — Security techniques — Information security risk management’ is a risk management framework applicable to all types of organisations (e.g. commercial enterprises, government agencies, non-profit organisations) which intend to manage risks that could compromise the organisation’s information security"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ISO/IEC 27005:2018"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ISRAM
  {:db/ident :dpvo-risk/ISRAM,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "ISRAM is a quantitative, paper-based risk analysis method that is designed to allow effective participation of managers and staff in the process"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ISRAM"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IT-Grundschutz
  {:db/ident :dpvo-risk/IT-Grundschutz,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "IT-Grundschutz has been developed by the Federal Office for Information Security in Germany. IT-Grundschutz provides a configuration for the establishment of an integrated and effective IT security managemen"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/risk-management-standards"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IT-Grundschutz"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IdentityDispute
  {:db/ident            :dpvo-risk/IdentityDispute,
   :dcterms/created     #inst "2022-08-24T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Identity Dispute"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def IdentityFraud
  {:db/ident :dpvo-risk/IdentityFraud,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Identity Fraud"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IdentityTheft
  {:db/ident :dpvo-risk/IdentityTheft,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Identity Theft"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IllegalProcessingData
  {:db/ident            :dpvo-risk/IllegalProcessingData,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Illegal Processing of Data"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ImpactOnDataSubject
  {:db/ident            :dpvo-risk/ImpactOnDataSubject,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Impact on Data Subject"},
   :rdfs/subClassOf     :dpvo/Impact,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ImpacttoRights
  {:db/ident            :dpvo-risk/ImpacttoRights,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Impact to Rights"},
   :rdfs/subClassOf     :dpvo/Impact,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def IncreaseInternalCost
  {:db/ident            :dpvo-risk/IncreaseInternalCost,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Increase Internal Cost"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def IndustrialCrisis
  {:db/ident            :dpvo-risk/IndustrialCrisis,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Industrial Crisis"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def InfluenceDiagrams
  {:db/ident :dpvo-risk/InfluenceDiagrams,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An extended version of Bayesian networks that includes variables representing uncertainties, consequences and actions"},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Influence Diagrams"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Injury
  {:db/ident            :dpvo-risk/Injury,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Injury"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def InterceptionCommunications
  {:db/ident            :dpvo-risk/InterceptionCommunications,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Interception of Communications"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def InternalOperationDisruption
  {:db/ident            :dpvo-risk/InternalOperationDisruption,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Internal Operation Disruption"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Interviews
  {:db/ident :dpvo-risk/Interviews,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Structured or semi- structured one-to-one conversations to elicit views."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Interviews"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def KnownVulnerabilityExploited
  {:db/ident :dpvo-risk/KnownVulnerabilityExploited,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Known Vulnerability Exploited"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LOPA
  {:db/ident :dpvo-risk/LOPA,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Analyses the risk reduction that can be achieved by various layers of protection."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Layer Protection Analysis (LOPA)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LawEnforcementAdverseEffects
  {:db/ident            :dpvo-risk/LawEnforcementAdverseEffects,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Law Enforcement Adverse Effects"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LimitationOfRights
  {:db/ident            :dpvo-risk/LimitationOfRights,
   :dcterms/created     #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Limitation of Rights"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossAssets
  {:db/ident            :dpvo-risk/LossAssets,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Assets"},
   :rdfs/subClassOf     :dpvo/MaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossCompetitiveAdvantage
  {:db/ident            :dpvo-risk/LossCompetitiveAdvantage,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Competitive Advantage"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossControlOverData
  {:db/ident            :dpvo-risk/LossControlOverData,
   :dcterms/created     #inst "2022-08-19T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Control over Data"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossCredibility
  {:db/ident            :dpvo-risk/LossCredibility,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Credibility"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossCustomerConfidence
  {:db/ident            :dpvo-risk/LossCustomerConfidence,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Customer Confidence"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossCustomers
  {:db/ident            :dpvo-risk/LossCustomers,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Customers"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossData
  {:db/ident :dpvo-risk/LossData,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Loss of Data"},
   :rdfs/subClassOf :dpvo/NonMaterialDamage,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LossFunds
  {:db/ident            :dpvo-risk/LossFunds,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Funds"},
   :rdfs/subClassOf     :dpvo/MaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossGoods
  {:db/ident            :dpvo-risk/LossGoods,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Goods"},
   :rdfs/subClassOf     :dpvo/MaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossGoodwill
  {:db/ident            :dpvo-risk/LossGoodwill,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Goodwill"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossNegotiatingCapacity
  {:db/ident            :dpvo-risk/LossNegotiatingCapacity,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Negotiating Capacity"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossOpportunity
  {:db/ident            :dpvo-risk/LossOpportunity,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Opportunity"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossProprietaryInformation
  {:db/ident            :dpvo-risk/LossProprietaryInformation,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Proprietary Information"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossReputation
  {:db/ident            :dpvo-risk/LossReputation,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Reputation"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossResources
  {:db/ident :dpvo-risk/LossResources,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Loss of Resources"},
   :rdfs/subClassOf :dpvo/NonMaterialDamage,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LossSuppliers
  {:db/ident            :dpvo-risk/LossSuppliers,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Suppliers"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossTechnologicalAdvantage
  {:db/ident            :dpvo-risk/LossTechnologicalAdvantage,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Technological Advantage"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossTrust
  {:db/ident            :dpvo-risk/LossTrust,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Trust"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LowLikelihood
  {:db/ident :dpvo-risk/LowLikelihood,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Likelihood is Low"},
   :rdf/type #{:dpvo/Likelihood :dpvo-risk/|3LikelihoodLevels|
               :dpvo-risk/|5LikelihoodLevels| :owl/NamedIndividual
               :dpvo-risk/|7LikelihoodLevels|},
   :rdf/value 0.25M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.25 on a scale of 0 to 1"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Likelihood"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LowRisk
  {:db/ident :dpvo-risk/LowRisk,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Risk is Low"},
   :rdf/type #{:dpvo-risk/|7RiskLevels| :dpvo/RiskLevel :dpvo-risk/|3RiskLevels|
               :owl/NamedIndividual :dpvo-risk/|5RiskLevels|},
   :rdf/value 0.25M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.25 on a scale of 0 to 1"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LowSeverity
  {:db/ident :dpvo-risk/LowSeverity,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Severity is Low"},
   :rdf/type #{:dpvo/Severity :dpvo-risk/|7SeverityLevels|
               :dpvo-risk/|3SeverityLevels| :dpvo-risk/|5SeverityLevels|
               :owl/NamedIndividual},
   :rdf/value 0.25M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.25 on a scale of 0 to 1"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Severity"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MAGERIT
  {:db/ident :dpvo-risk/MAGERIT,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Method for the Harmonised Analysis of Risk (MAGERIT) is an open methodology for risk analysis and management developed by the Spanish Higher Council for Electronic Government and offered as a framework and guide to the public administration"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/risk-management-standards"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MAGERIT"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MCA
  {:db/ident :dpvo-risk/MCA,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Compares options in a way that makes trade-offs explicit. Provides an alternative to cost/benefit analysis that does not need a monetary value to be allocated to all inputs."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Multi-criteria Analysis (MCA)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MEHARI
  {:db/ident :dpvo-risk/MEHARI,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "MEHARI is a free of charge qualitative risk analysis and management method developed by CLUSIF (Club for the Security of Information in France/Club de la Sécurité de l'Information Français)"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/risk-management-standards"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MEHARI"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MONARC
  {:db/ident :dpvo-risk/MONARC,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "MONARC (Méthode Optimisée d’analyse des risques CASES – ‘Method for an Optimised Analysis of Risks by CASES’ is a tool and a method allowing precise and repeatable risk assessments to take place"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MONARC"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MaliciousCodeAttack
  {:db/ident :dpvo-risk/MaliciousCodeAttack,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Intentional use of software by including or inserting in a system for a harmful purpose"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Malicious Code Attack"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MalwareAttack
  {:db/ident :dpvo-risk/MalwareAttack,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Malware is software or firmware intended to perform an unauthorised process that will have an adverse impact on the confidentiality, integrity, or availability of a system"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Malware Attack"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MarkovAnalysis
  {:db/ident :dpvo-risk/MarkovAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Calculates the probability that a system that has the capacity to be in one of a number of states will be in a particular state at a time t in the future."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Markov Analysis"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MisinformationDisinformation
  {:db/ident :dpvo-risk/MisinformationDisinformation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information that is untrue, misleading, or false and used intentionally (disinformation) or unintentionally (misinformation)"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/enisa-threat-landscape-2021"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MisinformationDisinformation"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MisuseBreachedInformation
  {:db/ident            :dpvo-risk/MisuseBreachedInformation,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Misuse of Breached Information"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ModerateLikelihood
  {:db/ident :dpvo-risk/ModerateLikelihood,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Likelihood is Moderate"},
   :rdf/type #{:dpvo/Likelihood :dpvo-risk/|3LikelihoodLevels|
               :dpvo-risk/|5LikelihoodLevels| :owl/NamedIndividual
               :dpvo-risk/|7LikelihoodLevels|},
   :rdf/value 0.5M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.5 on a scale of 0 to 1"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Likelihood"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ModerateRisk
  {:db/ident :dpvo-risk/ModerateRisk,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Risk is Moderate"},
   :rdf/type #{:dpvo-risk/|7RiskLevels| :dpvo/RiskLevel :dpvo-risk/|3RiskLevels|
               :owl/NamedIndividual :dpvo-risk/|5RiskLevels|},
   :rdf/value 0.5M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.5 on a scale of 0 to 1"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ModerateSeverity
  {:db/ident :dpvo-risk/ModerateSeverity,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Severity is Moderate"},
   :rdf/type #{:dpvo/Severity :dpvo-risk/|7SeverityLevels|
               :dpvo-risk/|3SeverityLevels| :dpvo-risk/|5SeverityLevels|
               :owl/NamedIndividual},
   :rdf/value 0.5M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.5 on a scale of 0 to 1"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Severity"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MonitorConsequence
  {:db/ident            :dpvo-risk/MonitorConsequence,
   :dcterms/created     #inst "2022-09-03T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Risk Control that monitors a Risk Consequence"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Monitor Consequence"},
   :rdfs/subClassOf     :dpvo-risk/ControlMonitors,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def MonitorImpact
  {:db/ident            :dpvo-risk/MonitorImpact,
   :dcterms/created     #inst "2022-09-04T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Risk Control that monitors a Risk Impact"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Monitor Impact"},
   :rdfs/subClassOf     :dpvo-risk/ControlMonitors,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def MonitorRisk
  {:db/ident            :dpvo-risk/MonitorRisk,
   :dcterms/created     #inst "2022-08-31T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Risk Control that monitors a Risk"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Monitor Risk"},
   :rdfs/subClassOf     :dpvo-risk/ControlMonitors,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def MonitorRiskControl
  {:db/ident            :dpvo-risk/MonitorRiskControl,
   :dcterms/created     #inst "2022-09-05T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Risk Control that monitors another Risk Control"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Monitor Risk Control"},
   :rdfs/subClassOf     :dpvo-risk/ControlMonitors,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def MonitorRiskSource
  {:db/ident            :dpvo-risk/MonitorRiskSource,
   :dcterms/created     #inst "2022-09-01T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Risk Control that monitors a Risk Source"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Monitor Risk Source"},
   :rdfs/subClassOf     :dpvo-risk/ControlMonitors,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def MonitorVulnerabilities
  {:db/ident            :dpvo-risk/MonitorVulnerabilities,
   :dcterms/created     #inst "2022-09-02T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Risk Control that monitors a Risk Vulnerability"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Monitor Vulnerabilities"},
   :rdfs/subClassOf     :dpvo-risk/ControlMonitors,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def MonteCarloSimulation
  {:db/ident :dpvo-risk/MonteCarloSimulation,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Calculates the probability of outcomes by running multiple simulations using random variables."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Monte Carlo Simulation"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NIST-SP-800-30
  {:db/ident :dpvo-risk/NIST-SP-800-30,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "NIST 800-30 is a free guide that provides a foundation for the development of an effective risk management programme, containing both the definitions and the practical guidance necessary for assessing and mitigating risks identified within IT systems"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/risk-management-standards"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "NIST SP 800-30"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NIST-SP-800-37
  {:db/ident :dpvo-risk/NIST-SP-800-37,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "NIST SP 800-37 Rev. 2 is an asset-based RMF which comprises 7 steps, namely Prepare, Categorise, Select, Implement, Assess, Authorise and Monitor. It does not adopt a specific risk assessment methodology, although the NIST 800-30 guide is extensively referenced"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/risk-management-standards"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "NIST SP 800-37"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NIST-SP-800-39
  {:db/ident :dpvo-risk/NIST-SP-800-39,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The purpose of NIST SP 800-39 is to provide a structured, yet flexible approach for an integrated, enterprise-wide programme for managing the risk to information security of organisational operations (i.e. mission, functions, image, and reputation) and assets, individuals, other organisations etc. on an ongoing basis"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/risk-management-standards"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "NIST SP 800–39"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NIST-SP-800-82
  {:db/ident :dpvo-risk/NIST-SP-800-82,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "NIST SP 800-82 Rev. 2 (Stouffer, et al., 2015), entitled ‘Guide to industrial control systems (ISC) security’, is an Industrial Control Systems Security Guide"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "NIST SP 800–82"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NominalGroupTechnique
  {:db/ident :dpvo-risk/NominalGroupTechnique,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Technique for eliciting views from a group of people where initial participation is as individuals with no interaction, then group discussion of ideas follows."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Nominal Group Technique"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def O-RA
  {:db/ident :dpvo-risk/O-RA,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Open Group Standard for Risk Analysis (O-RA) provides a set of standards for various aspects of information security risk analysis that is based on the Open FAIR framework and can be applied to any risk scenario"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "O-RA"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OCTAVE
  {:db/ident :dpvo-risk/OCTAVE,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Operationally Critical Threat, Asset, and Vulnerability Evaluation (OCTAVE) is a free of charge approach to evaluations of information security risk that is comprehensive, systematic, context-driven, and self-directed"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/risk-management-standards"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "OCTAVE"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OCTAVE-ALLEGRO
  {:db/ident :dpvo-risk/OCTAVE-ALLEGRO,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "OCTAVE Allegro is designed to allow broad assessment of an organisation’s operational risk environment, with the goal of producing robust results without the need for extensive knowledge of risk assessment"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "OCTAVE ALLEGRO"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OCTAVE-FORTE
  {:db/ident :dpvo-risk/OCTAVE-FORTE,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The OCTAVE FORTE process model was developed to support organisations in evaluating their security risks. It applies Enterprise Risk Management (ERM) principles to bridge the gap between executives and practitioners acting as decision makers"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "OCTAVE FORTE"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OCTAVE-S
  {:db/ident :dpvo-risk/OCTAVE-S,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The OCTAVE-S is based on the OCTAVE approach and is a self-directed approach, meaning that people from an organisation assume responsibility for setting the organisation’s security strategy"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks"},
   :rdf/type #{:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "OCTAVE-S"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OrganisationDisruption
  {:db/ident            :dpvo-risk/OrganisationDisruption,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Organisation Disruption"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def PIA
  {:db/ident :dpvo-risk/PIA,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Analyses how incidents and events could affect a person's privacy and identifies and quantifies the capabilities that would be needed to manage it."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Privacy Impact Analysis (PIA)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ParetoCharts
  {:db/ident :dpvo-risk/ParetoCharts,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Pareto principle (the 80–20 rule) states that, for many events, roughly 80 % of the effects come from 20 % of the causes."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Pareto Charts"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PersonalSafetyEndangerment
  {:db/ident            :dpvo-risk/PersonalSafetyEndangerment,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Personal Safety Endangerment"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def PersonnelAbsence
  {:db/ident :dpvo-risk/PersonnelAbsence,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personnel Absence"},
   :rdfs/subClassOf :dpvo/NonMaterialDamage,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PhishingScam
  {:db/ident :dpvo-risk/PhishingScam,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A type of social engineering attack involving deceptive messages intended to reveal sensitive information"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/enisa-threat-landscape-for-ransomware-attacks"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Phishing Scam"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PhysicalAssault
  {:db/ident            :dpvo-risk/PhysicalAssault,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Physical Assault"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def PhysicalSpying
  {:db/ident            :dpvo-risk/PhysicalSpying,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Physical Spying"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def PhysicalStalking
  {:db/ident            :dpvo-risk/PhysicalStalking,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Physical Stalking"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def PreventExercisingOfRights
  {:db/ident            :dpvo-risk/PreventExercisingOfRights,
   :dcterms/created     #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Prevent Exercising of Rights"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def PrivacyImpact
  {:db/ident :dpvo-risk/PrivacyImpact,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Privacy impact"},
   :rdfs/subClassOf :dpvo/Impact,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PsychologicalHarm
  {:db/ident :dpvo-risk/PsychologicalHarm,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Psychological Harm"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PublicOrderBreach
  {:db/ident            :dpvo-risk/PublicOrderBreach,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Public Order Breach"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def QualitativeRiskAssessmentTechnique
  {:db/ident :dpvo-risk/QualitativeRiskAssessmentTechnique,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "A risk assessment technique that uses qualitative methods"},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Qualitative Risk Assessment Technique"},
   :rdfs/subClassOf :dpvo-risk/RiskAssessmentTechnique,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def QuantitativeRiskAssessmentTechnique
  {:db/ident :dpvo-risk/QuantitativeRiskAssessmentTechnique,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "A risk assessment technique that uses quantitative methods"},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Quantitative Risk Assessment Technique"},
   :rdfs/subClassOf :dpvo-risk/RiskAssessmentTechnique,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM3x3S1L1
  {:db/ident :dpvo-risk/RM3x3S1L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 3x3 Risk Matrix with Risk Severity: Low; Likelihood: Low; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type #{:owl/NamedIndividual :dpvo-risk/RiskMatrix3x3},
   :rdf/value 0.11M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM3x3 S:1 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM3x3S1L2
  {:db/ident :dpvo-risk/RM3x3S1L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 3x3 Risk Matrix with Risk Severity: Low; Likelihood: Moderate; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type #{:owl/NamedIndividual :dpvo-risk/RiskMatrix3x3},
   :rdf/value 0.22M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM3x3 S:1 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM3x3S1L3
  {:db/ident :dpvo-risk/RM3x3S1L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 3x3 Risk Matrix with Risk Severity: Low; Likelihood: High; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type #{:owl/NamedIndividual :dpvo-risk/RiskMatrix3x3},
   :rdf/value 0.33M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM3x3 S:1 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM3x3S2L1
  {:db/ident :dpvo-risk/RM3x3S2L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 3x3 Risk Matrix with Risk Severity: Moderate; Likelihood: Low; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type #{:owl/NamedIndividual :dpvo-risk/RiskMatrix3x3},
   :rdf/value 0.22M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM3x3 S:2 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM3x3S2L2
  {:db/ident :dpvo-risk/RM3x3S2L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 3x3 Risk Matrix with Risk Severity: Moderate; Likelihood: Moderate; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type #{:owl/NamedIndividual :dpvo-risk/RiskMatrix3x3},
   :rdf/value 0.44M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM3x3 S:2 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM3x3S2L3
  {:db/ident :dpvo-risk/RM3x3S2L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 3x3 Risk Matrix with Risk Severity: Moderate; Likelihood: High; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type #{:owl/NamedIndividual :dpvo-risk/RiskMatrix3x3},
   :rdf/value 0.67M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM3x3 S:2 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM3x3S3L1
  {:db/ident :dpvo-risk/RM3x3S3L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 3x3 Risk Matrix with Risk Severity: High; Likelihood: Low; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type #{:owl/NamedIndividual :dpvo-risk/RiskMatrix3x3},
   :rdf/value 0.33M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM3x3 S:3 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM3x3S3L2
  {:db/ident :dpvo-risk/RM3x3S3L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 3x3 Risk Matrix with Risk Severity: High; Likelihood: Moderate; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type #{:owl/NamedIndividual :dpvo-risk/RiskMatrix3x3},
   :rdf/value 0.67M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM3x3 S:3 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM3x3S3L3
  {:db/ident :dpvo-risk/RM3x3S3L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 3x3 Risk Matrix with Risk Severity: High; Likelihood: High; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type #{:owl/NamedIndividual :dpvo-risk/RiskMatrix3x3},
   :rdf/value 1,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM3x3 S:3 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S1L1
  {:db/ident :dpvo-risk/RM5x5S1L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryLow; and Risk Level: VeryLow"},
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual},
   :rdf/value 0.04M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Risk (RM5x5 S:1 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S1L2
  {:db/ident :dpvo-risk/RM5x5S1L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: Low; and Risk Level: VeryLow"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual},
   :rdf/value 0.08M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Risk (RM5x5 S:1 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S1L3
  {:db/ident :dpvo-risk/RM5x5S1L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: Moderate; and Risk Level: VeryLow"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual},
   :rdf/value 0.12M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Risk (RM5x5 S:1 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S1L4
  {:db/ident :dpvo-risk/RM5x5S1L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: High; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual},
   :rdf/value 0.16M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM5x5 S:1 L:4)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S1L5
  {:db/ident :dpvo-risk/RM5x5S1L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryHigh; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual},
   :rdf/value 0.2M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM5x5 S:1 L:5)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S2L1
  {:db/ident :dpvo-risk/RM5x5S2L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: VeryLow; and Risk Level: VeryLow"},
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual},
   :rdf/value 0.08M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Risk (RM5x5 S:2 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S2L2
  {:db/ident :dpvo-risk/RM5x5S2L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: Low; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual},
   :rdf/value 0.16M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM5x5 S:2 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S2L3
  {:db/ident :dpvo-risk/RM5x5S2L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: Moderate; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual},
   :rdf/value 0.24M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM5x5 S:2 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S2L4
  {:db/ident :dpvo-risk/RM5x5S2L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: High; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual},
   :rdf/value 0.32M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM5x5 S:2 L:4)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S2L5
  {:db/ident :dpvo-risk/RM5x5S2L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: VeryHigh; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual},
   :rdf/value 0.4M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM5x5 S:2 L:5)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S3L1
  {:db/ident :dpvo-risk/RM5x5S3L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryLow; and Risk Level: VeryLow"},
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual},
   :rdf/value 0.12M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Risk (RM5x5 S:3 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S3L2
  {:db/ident :dpvo-risk/RM5x5S3L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: Low; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual},
   :rdf/value 0.24M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM5x5 S:3 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S3L3
  {:db/ident :dpvo-risk/RM5x5S3L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: Moderate; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual},
   :rdf/value 0.36M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM5x5 S:3 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S3L4
  {:db/ident :dpvo-risk/RM5x5S3L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: High; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual},
   :rdf/value 0.48M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM5x5 S:3 L:4)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S3L5
  {:db/ident :dpvo-risk/RM5x5S3L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryHigh; and Risk Level: VeryHigh"},
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual},
   :rdf/value 0.6M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Risk (RM5x5 S:3 L:5)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S4L1
  {:db/ident :dpvo-risk/RM5x5S4L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: VeryLow; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual},
   :rdf/value 0.16M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM5x5 S:4 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S4L2
  {:db/ident :dpvo-risk/RM5x5S4L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: Low; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual},
   :rdf/value 0.32M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM5x5 S:4 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S4L3
  {:db/ident :dpvo-risk/RM5x5S4L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: Moderate; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual},
   :rdf/value 0.48M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM5x5 S:4 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S4L4
  {:db/ident :dpvo-risk/RM5x5S4L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: High; and Risk Level: VeryHigh"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual},
   :rdf/value 0.64M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Risk (RM5x5 S:4 L:4)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S4L5
  {:db/ident :dpvo-risk/RM5x5S4L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: VeryHigh; and Risk Level: VeryHigh"},
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual},
   :rdf/value 0.8M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Risk (RM5x5 S:4 L:5)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S5L1
  {:db/ident :dpvo-risk/RM5x5S5L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryLow; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual},
   :rdf/value 0.2M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM5x5 S:5 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S5L2
  {:db/ident :dpvo-risk/RM5x5S5L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Low; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual},
   :rdf/value 0.4M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM5x5 S:5 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S5L3
  {:db/ident :dpvo-risk/RM5x5S5L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Moderate; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual},
   :rdf/value 0.6M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM5x5 S:5 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S5L4
  {:db/ident :dpvo-risk/RM5x5S5L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: High; and Risk Level: VeryHigh"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual},
   :rdf/value 0.8M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Risk (RM5x5 S:5 L:4)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S5L5
  {:db/ident :dpvo-risk/RM5x5S5L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryHigh; and Risk Level: VeryHigh"},
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual},
   :rdf/value 1,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Risk (RM5x5 S:5 L:5)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S1L1
  {:db/ident :dpvo-risk/RM7x7S1L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.02M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely Low Risk (RM7x7 S:1 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S1L2
  {:db/ident :dpvo-risk/RM7x7S1L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: VeryLow; and Risk Level: ExtremelyLow"},
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.04M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely Low Risk (RM7x7 S:1 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S1L3
  {:db/ident :dpvo-risk/RM7x7S1L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: Low; and Risk Level: ExtremelyLow"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.06M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely Low Risk (RM7x7 S:1 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S1L4
  {:db/ident :dpvo-risk/RM7x7S1L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: Moderate; and Risk Level: VeryLow"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.08M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Risk (RM7x7 S:1 L:4)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S1L5
  {:db/ident :dpvo-risk/RM7x7S1L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: High; and Risk Level: VeryLow"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.1M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Risk (RM7x7 S:1 L:5)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S1L6
  {:db/ident :dpvo-risk/RM7x7S1L6,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: VeryHigh; and Risk Level: VeryLow"},
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.12M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Risk (RM7x7 S:1 L:6)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S1L7
  {:db/ident :dpvo-risk/RM7x7S1L7,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: ExtremelyHigh; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.14M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM7x7 S:1 L:7)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S2L1
  {:db/ident :dpvo-risk/RM7x7S2L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.04M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely Low Risk (RM7x7 S:2 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S2L2
  {:db/ident :dpvo-risk/RM7x7S2L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryLow; and Risk Level: ExtremelyLow"},
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.08M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely Low Risk (RM7x7 S:2 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S2L3
  {:db/ident :dpvo-risk/RM7x7S2L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: Low; and Risk Level: VeryLow"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.12M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Risk (RM7x7 S:2 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S2L4
  {:db/ident :dpvo-risk/RM7x7S2L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: Moderate; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.16M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM7x7 S:2 L:4)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S2L5
  {:db/ident :dpvo-risk/RM7x7S2L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: High; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.2M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM7x7 S:2 L:5)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S2L6
  {:db/ident :dpvo-risk/RM7x7S2L6,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryHigh; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.24M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM7x7 S:2 L:6)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S2L7
  {:db/ident :dpvo-risk/RM7x7S2L7,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: ExtremelyHigh; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.29M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM7x7 S:2 L:7)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S3L1
  {:db/ident :dpvo-risk/RM7x7S3L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.06M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely Low Risk (RM7x7 S:3 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S3L2
  {:db/ident :dpvo-risk/RM7x7S3L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: VeryLow; and Risk Level: VeryLow"},
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.12M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Risk (RM7x7 S:3 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S3L3
  {:db/ident :dpvo-risk/RM7x7S3L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: Low; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.18M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM7x7 S:3 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S3L4
  {:db/ident :dpvo-risk/RM7x7S3L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: Moderate; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.24M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM7x7 S:3 L:4)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S3L5
  {:db/ident :dpvo-risk/RM7x7S3L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: High; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.31M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM7x7 S:3 L:5)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S3L6
  {:db/ident :dpvo-risk/RM7x7S3L6,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: VeryHigh; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.37M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM7x7 S:3 L:6)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S3L7
  {:db/ident :dpvo-risk/RM7x7S3L7,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: ExtremelyHigh; and Risk Level: VeryHigh"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.43M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Risk (RM7x7 S:3 L:7)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S4L1
  {:db/ident :dpvo-risk/RM7x7S4L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.08M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely Low Risk (RM7x7 S:4 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S4L2
  {:db/ident :dpvo-risk/RM7x7S4L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryLow; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.16M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM7x7 S:4 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S4L3
  {:db/ident :dpvo-risk/RM7x7S4L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: Low; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.24M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM7x7 S:4 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S4L4
  {:db/ident :dpvo-risk/RM7x7S4L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: Moderate; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.33M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM7x7 S:4 L:4)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S4L5
  {:db/ident :dpvo-risk/RM7x7S4L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: High; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.41M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM7x7 S:4 L:5)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S4L6
  {:db/ident :dpvo-risk/RM7x7S4L6,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryHigh; and Risk Level: VeryHigh"},
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.49M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Risk (RM7x7 S:4 L:6)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S4L7
  {:db/ident :dpvo-risk/RM7x7S4L7,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: ExtremelyHigh; and Risk Level: VeryHigh"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.57M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Risk (RM7x7 S:4 L:7)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S5L1
  {:db/ident :dpvo-risk/RM7x7S5L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: ExtremelyLow; and Risk Level: VeryLow"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.1M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Risk (RM7x7 S:5 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S5L2
  {:db/ident :dpvo-risk/RM7x7S5L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: VeryLow; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.2M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM7x7 S:5 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S5L3
  {:db/ident :dpvo-risk/RM7x7S5L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: Low; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.31M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM7x7 S:5 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S5L4
  {:db/ident :dpvo-risk/RM7x7S5L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: Moderate; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.41M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM7x7 S:5 L:4)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S5L5
  {:db/ident :dpvo-risk/RM7x7S5L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: High; and Risk Level: VeryHigh"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.51M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Risk (RM7x7 S:5 L:5)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S5L6
  {:db/ident :dpvo-risk/RM7x7S5L6,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: VeryHigh; and Risk Level: ExtremelyHigh"},
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.61M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely High Risk (RM7x7 S:5 L:6)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S5L7
  {:db/ident :dpvo-risk/RM7x7S5L7,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: ExtremelyHigh; and Risk Level: ExtremelyHigh"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.71M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely High Risk (RM7x7 S:5 L:7)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S6L1
  {:db/ident :dpvo-risk/RM7x7S6L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: ExtremelyLow; and Risk Level: VeryLow"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.12M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Risk (RM7x7 S:6 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S6L2
  {:db/ident :dpvo-risk/RM7x7S6L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryLow; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.24M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM7x7 S:6 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S6L3
  {:db/ident :dpvo-risk/RM7x7S6L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Low; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.37M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM7x7 S:6 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S6L4
  {:db/ident :dpvo-risk/RM7x7S6L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Moderate; and Risk Level: VeryHigh"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.49M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Risk (RM7x7 S:6 L:4)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S6L5
  {:db/ident :dpvo-risk/RM7x7S6L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: High; and Risk Level: VeryHigh"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.61M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Risk (RM7x7 S:6 L:5)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S6L6
  {:db/ident :dpvo-risk/RM7x7S6L6,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryHigh; and Risk Level: ExtremelyHigh"},
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.73M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely High Risk (RM7x7 S:6 L:6)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S6L7
  {:db/ident :dpvo-risk/RM7x7S6L7,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: ExtremelyHigh; and Risk Level: ExtremelyHigh"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.86M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely High Risk (RM7x7 S:6 L:7)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S7L1
  {:db/ident :dpvo-risk/RM7x7S7L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: ExtremelyLow; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.14M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM7x7 S:7 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S7L2
  {:db/ident :dpvo-risk/RM7x7S7L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: VeryLow; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.29M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM7x7 S:7 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S7L3
  {:db/ident :dpvo-risk/RM7x7S7L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: Low; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.43M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM7x7 S:7 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S7L4
  {:db/ident :dpvo-risk/RM7x7S7L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: Moderate; and Risk Level: VeryHigh"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.57M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Risk (RM7x7 S:7 L:4)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S7L5
  {:db/ident :dpvo-risk/RM7x7S7L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: High; and Risk Level: ExtremelyHigh"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.71M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely High Risk (RM7x7 S:7 L:5)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S7L6
  {:db/ident :dpvo-risk/RM7x7S7L6,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: VeryHigh; and Risk Level: ExtremelyHigh"},
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 0.86M,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely High Risk (RM7x7 S:7 L:6)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S7L7
  {:db/ident :dpvo-risk/RM7x7S7L7,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: ExtremelyHigh; and Risk Level: ExtremelyHigh"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/type #{:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual},
   :rdf/value 1,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely High Risk (RM7x7 S:7 L:7)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RansomwareAttack
  {:db/ident :dpvo-risk/RansomwareAttack,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Ransomware is a type of attack where threat actors take control of a target’s assets and demand a ransom in exchange for the return of the asset’s availability and confidentiality"},
   :dcterms/source
   #{{:xsd/anyURI "https://www.iso.org/standard/75281.html"}
     {:xsd/anyURI
      "https://www.enisa.europa.eu/publications/enisa-threat-landscape-for-ransomware-attacks"}},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "RansomwareAttack"},
   :rdfs/subClassOf :dpvo/NonMaterialDamage,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ReduceLikelihood
  {:db/ident :dpvo-risk/ReduceLikelihood,
   :dcterms/created #inst "2022-08-22T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Risk Control that reduces the likelihood of an event"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Reduce Likelihood"},
   :rdfs/subClassOf :dpvo/RiskMitigationMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ReduceSeverity
  {:db/ident            :dpvo-risk/ReduceSeverity,
   :dcterms/created     #inst "2022-08-23T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Risk Control that reduces the severity of an event"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Reduce Severity"},
   :rdfs/subClassOf     :dpvo/RiskMitigationMeasure,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ReliabilityCentredMaintenance
  {:db/ident :dpvo-risk/ReliabilityCentredMaintenance,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A risk based assessment used to identify the appropriate maintenance tasks for a system and its components."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Reliability Centred Maintenance"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RemoteSpying
  {:db/ident            :dpvo-risk/RemoteSpying,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Remote Spying"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def RemoveConsequence
  {:db/ident :dpvo-risk/RemoveConsequence,
   :dcterms/created #inst "2022-08-27T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Risk Control that removes Consequence i.e. prevents it from materialising"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Remove Consequence"},
   :rdfs/subClassOf :dpvo-risk/ControlConsequence,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RemoveImpact
  {:db/ident :dpvo-risk/RemoveImpact,
   :dcterms/created #inst "2022-08-28T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Risk Control that removes Impact i.e. prevents it from materialising"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Remove Impact"},
   :rdfs/subClassOf :dpvo-risk/ControlConsequence,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RemoveSource
  {:db/ident            :dpvo-risk/RemoveSource,
   :dcterms/created     #inst "2022-08-20T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Risk Control that removes the risk source"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Remove Source"},
   :rdfs/subClassOf     :dpvo-risk/ControlRiskSource,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ReplacementCosts
  {:db/ident            :dpvo-risk/ReplacementCosts,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Replacement Costs"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ReputationTrustImpact
  {:db/ident :dpvo-risk/ReputationTrustImpact,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Reputation and trust impact"},
   :rdfs/subClassOf :dpvo/Impact,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RetrievalDeletedData
  {:db/ident            :dpvo-risk/RetrievalDeletedData,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Retrieval of Deleted Data"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def RetrievalDiscardedEquipment
  {:db/ident            :dpvo-risk/RetrievalDiscardedEquipment,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Retrieval of Discarded Equipment"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def RiskAssessmentTechnique
  {:db/ident :dpvo-risk/RiskAssessmentTechnique,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A technique or method used to analyse and identify risk levels, sources, likelihoods, severities, and other necessary information required to conduct risk management procedures"},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk Assessment Technique"},
   :rdfs/subClassOf :dpvo/RiskManagementProcess,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RiskIndices
  {:db/ident :dpvo-risk/RiskIndices,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Rates the significance of risks based on ratings applied to factors which are believed to influence the magnitude of the risk."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk Indices"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RiskManagementMethodology
  {:db/ident :dpvo-risk/RiskManagementMethodology,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A risk management framework or methodology addresses the main functional components related to identification, assessment, treatment, and monitoring regarding risks"},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk Management Methodology"},
   :rdfs/subClassOf :dpvo/RiskManagementProcess,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RiskMatrix
  {:db/ident :dpvo-risk/RiskMatrix,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Compares individual risks by selecting a consequence/ likelihood pair and displaying them on a matrix with consequence on one axis and likelihood on the other."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk Matrix"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RiskMatrix3x3
  {:db/ident :dpvo-risk/RiskMatrix3x3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A Risk Matrix with 3 Likelihood, 3 Severity, and 3 Risk Level types"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk Matrix 3x3"},
   :rdfs/subClassOf :dpvo-risk/RiskMatrix,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RiskMatrix5x5
  {:db/ident :dpvo-risk/RiskMatrix5x5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A Risk Matrix with 5 Likelihood, 5 Severity, and 5 Risk Level types"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk Matrix 5x5"},
   :rdfs/subClassOf :dpvo-risk/RiskMatrix,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RiskMatrix7x7
  {:db/ident :dpvo-risk/RiskMatrix7x7,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A Risk Matrix with 7 Likelihood, 7 Severity, and 7 Risk Level types"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk Matrix 7x7"},
   :rdfs/subClassOf :dpvo-risk/RiskMatrix,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RiskRegisters
  {:db/ident :dpvo-risk/RiskRegisters,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A means of recording information about risks and tracking actions."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk Registers"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SCurves
  {:db/ident :dpvo-risk/SCurves,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A means of displaying the relationship between consequences and their likelihood plotted as a cumulative distribution function (S-curve)."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "S-curves"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SFAIRP
  {:db/ident :dpvo-risk/SFAIRP,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "So far as is Resonably Practiceable (ALARP) - A criteria for deciding significance of risk and means of evaluating tolerability of risk"},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SFAIRP"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SWIFT
  {:db/ident :dpvo-risk/SWIFT,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A simpler form of HAZOP with prompts of \"what if\" to identify deviations from the expected."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Structured \"What If?\" (SWIFT)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Sabotage
  {:db/ident :dpvo-risk/Sabotage,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sabotage"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Scam
  {:db/ident            :dpvo-risk/Scam,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Scam"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ScenarioAnalysis
  {:db/ident :dpvo-risk/ScenarioAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Identifies possible future scenarios through imagination, extrapolation from the present or modelling. Risk is then considered for each of these scenarios."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Scenario Analysis"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SecurityBreach
  {:db/ident            :dpvo-risk/SecurityBreach,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Security Breach"},
   :rdfs/subClassOf     :dpvo/Consequence,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ServiceInterruption
  {:db/ident            :dpvo-risk/ServiceInterruption,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Service Interruption"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def SexualViolence
  {:db/ident :dpvo-risk/SexualViolence,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sexual Violence"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ShareRisk
  {:db/ident :dpvo-risk/ShareRisk,
   :dcterms/created #inst "2022-08-29T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Risk Mitigation Measure that shares Risk e.g. amongst stakeholders"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Share Risk"},
   :rdfs/subClassOf :dpvo/RiskMitigationMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SocialDisadvantage
  {:db/ident            :dpvo-risk/SocialDisadvantage,
   :dcterms/created     #inst "2022-08-19T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Georg P Krog"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Social Disadvantage"},
   :rdfs/subClassOf     :dpvo/Impact,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Spam
  {:db/ident :dpvo-risk/Spam,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Spam"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Spoofing
  {:db/ident            :dpvo-risk/Spoofing,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Spoofing"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Spying
  {:db/ident            :dpvo-risk/Spying,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Spying"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Stalking
  {:db/ident            :dpvo-risk/Stalking,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Stalking"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Surveys
  {:db/ident :dpvo-risk/Surveys,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Paper- or computer-based questionnaires to elicit views."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Surveys"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SystemFailure
  {:db/ident :dpvo-risk/SystemFailure,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/enisa-threat-landscape-for-ransomware-attacks"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "System Failure"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SystemIntrusion
  {:db/ident :dpvo-risk/SystemIntrusion,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "System Intrusion"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SystemMalfunction
  {:db/ident            :dpvo-risk/SystemMalfunction,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "System Malfunction"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Taxonomies
  {:db/ident :dpvo-risk/Taxonomies,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A taxonomy based on experience or on concepts and models that can be used to help identify risks or controls."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QualitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Taxonomies"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Terrorism
  {:db/ident            :dpvo-risk/Terrorism,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Terrorism"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Theft
  {:db/ident            :dpvo-risk/Theft,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Theft"},
   :rdfs/subClassOf     :dpvo/MaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def TheftEquipment
  {:db/ident            :dpvo-risk/TheftEquipment,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Theft of Equipment"},
   :rdfs/subClassOf     :dpvo/MaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def TheftMedia
  {:db/ident            :dpvo-risk/TheftMedia,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Theft of Media"},
   :rdfs/subClassOf     :dpvo/MaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ThirdPartyOperationDisruption
  {:db/ident            :dpvo-risk/ThirdPartyOperationDisruption,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Third Party Operation Disruption"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Toxicological
  {:db/ident :dpvo-risk/Toxicological,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A series of steps taken to obtain a measure for the risk to humans or ecological systems due to exposure to chemicals."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Toxicological Risk Assessment"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UnauthorisedAccesstoPremises
  {:db/ident            :dpvo-risk/UnauthorisedAccesstoPremises,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Unauthorised Access to Premises"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def UnauthorisedCodeAccess
  {:db/ident :dpvo-risk/UnauthorisedCodeAccess,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unauthorised Code Access"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UnauthorisedCodeDisclosure
  {:db/ident :dpvo-risk/UnauthorisedCodeDisclosure,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unauthorised Code Disclosure"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UnauthorisedCodeModification
  {:db/ident :dpvo-risk/UnauthorisedCodeModification,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unauthorised Code Modification"},
   :rdfs/subClassOf :dpvo/Damage,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UnauthorisedDataAccess
  {:db/ident :dpvo-risk/UnauthorisedDataAccess,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unauthorised Data Access"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UnauthorisedDataDisclosure
  {:db/ident            :dpvo-risk/UnauthorisedDataDisclosure,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Unauthorised Data Disclosure"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def UnauthorisedDataModification
  {:db/ident :dpvo-risk/UnauthorisedDataModification,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unauthorised Data Modification"},
   :rdfs/subClassOf :dpvo/NonMaterialDamage,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UnauthorisedImpersonation
  {:db/ident            :dpvo-risk/UnauthorisedImpersonation,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Unauthorised Impersonation"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def UnauthorisedInformationDisclosure
  {:db/ident :dpvo-risk/UnauthorisedInformationDisclosure,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unauthorised Information Disclosure"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UnauthorisedReIdentification
  {:db/ident            :dpvo-risk/UnauthorisedReIdentification,
   :dcterms/created     #inst "2022-08-19T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Georg P Krog"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Unauthorised Re-Identification"},
   :rdfs/subClassOf     :dpvo/Consequence,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def UnauthorisedResourceUse
  {:db/ident            :dpvo-risk/UnauthorisedResourceUse,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Unauthorised Resource Use"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def UnauthorisedSystemAccess
  {:db/ident            :dpvo-risk/UnauthorisedSystemAccess,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Unauthorised System Access"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def UnauthorisedSystemModification
  {:db/ident :dpvo-risk/UnauthorisedSystemModification,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unauthorised System Modification"},
   :rdfs/subClassOf :dpvo/Damage,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UnknownVulnerabilityExploited
  {:db/ident :dpvo-risk/UnknownVulnerabilityExploited,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unknown Vulnerability Exploited"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UnwantedCodeDeletion
  {:db/ident :dpvo-risk/UnwantedCodeDeletion,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unwanted Code Deletion"},
   :rdfs/subClassOf :dpvo/Damage,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UnwantedDataDeletion
  {:db/ident            :dpvo-risk/UnwantedDataDeletion,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Unwanted Data Deletion"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def UnwantedDisclosureData
  {:db/ident            :dpvo-risk/UnwantedDisclosureData,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Unwanted Disclosure of Data"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def VaR
  {:db/ident :dpvo-risk/VaR,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Financial measure of risk that uses an assumed probability distribution of losses in a stable market condition to calculate the value of a loss that might occur with a specified probability within a defined time span."},
   :dcterms/source {:xsd/anyURI "https://www.iso.org/standard/72140.html"},
   :rdf/type #{:dpvo-risk/QuantitativeRiskAssessmentTechnique
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Value At Risk (VaR)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Vandalism
  {:db/ident :dpvo-risk/Vandalism,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vandalism"},
   :rdfs/subClassOf :dpvo/Damage,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VeryHighLikelihood
  {:db/ident :dpvo-risk/VeryHighLikelihood,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Likelihood is Very High"},
   :rdf/type #{:dpvo/Likelihood :dpvo-risk/|5LikelihoodLevels|
               :owl/NamedIndividual :dpvo-risk/|7LikelihoodLevels|},
   :rdf/value 0.9M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.9 on a scale of 0 to 1"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Likelihood"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VeryHighRisk
  {:db/ident :dpvo-risk/VeryHighRisk,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Risk is Very High"},
   :rdf/type #{:dpvo-risk/|7RiskLevels| :dpvo/RiskLevel :owl/NamedIndividual
               :dpvo-risk/|5RiskLevels|},
   :rdf/value 0.9M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.9 on a scale of 0 to 1"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Risk"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VeryHighSeverity
  {:db/ident :dpvo-risk/VeryHighSeverity,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Severity is Very High"},
   :rdf/type #{:dpvo/Severity :dpvo-risk/|7SeverityLevels|
               :dpvo-risk/|5SeverityLevels| :owl/NamedIndividual},
   :rdf/value 0.9M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.9 on a scale of 0 to 1"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Severity"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VeryLowLikelihood
  {:db/ident :dpvo-risk/VeryLowLikelihood,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Likelihood is Very Low"},
   :rdf/type #{:dpvo/Likelihood :dpvo-risk/|5LikelihoodLevels|
               :owl/NamedIndividual :dpvo-risk/|7LikelihoodLevels|},
   :rdf/value 0.1M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.1 on a scale of 0 to 1"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Likelihood"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VeryLowRisk
  {:db/ident :dpvo-risk/VeryLowRisk,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Risk is Very Low"},
   :rdf/type #{:dpvo-risk/|7RiskLevels| :dpvo/RiskLevel :owl/NamedIndividual
               :dpvo-risk/|5RiskLevels|},
   :rdf/value 0.1M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.1 on a scale of 0 to 1"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Risk"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VeryLowSeverity
  {:db/ident :dpvo-risk/VeryLowSeverity,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Severity is Very Low"},
   :rdf/type #{:dpvo/Severity :dpvo-risk/|7SeverityLevels|
               :dpvo-risk/|5SeverityLevels| :owl/NamedIndividual},
   :rdf/value 0.1M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.1 on a scale of 0 to 1"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Severity"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ViolationCodeConduct
  {:db/ident            :dpvo-risk/ViolationCodeConduct,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Violation of Code of Conduct"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ViolationContractualObligations
  {:db/ident            :dpvo-risk/ViolationContractualObligations,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Violation of Contractual Obligations"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ViolationEthicalCode
  {:db/ident            :dpvo-risk/ViolationEthicalCode,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Violation of Ethical Code"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ViolationOfRights
  {:db/ident            :dpvo-risk/ViolationOfRights,
   :dcterms/created     #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Violation of Rights"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ViolationRegulatoryObligations
  {:db/ident            :dpvo-risk/ViolationRegulatoryObligations,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Violation of Regulatory Obligations"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ViolationStatutoryObligations
  {:db/ident            :dpvo-risk/ViolationStatutoryObligations,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Violation of Statutory Obligations"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def VulnerabilityCreated
  {:db/ident            :dpvo-risk/VulnerabilityCreated,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      {:xsd/anyURI "https://www.iso.org/standard/75281.html"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Vulnerability Created"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def VulnerabilityExploited
  {:db/ident :dpvo-risk/VulnerabilityExploited,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   {:xsd/anyURI
    "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vulnerability Exploited"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def |3LikelihoodLevels|
  {:db/ident            :dpvo-risk/|3LikelihoodLevels|,
   :dcterms/created     #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Scale with 3 Likelihood Levels from High to Low"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "3 Likelihood Levels"},
   :rdfs/subClassOf     :dpvo/Likelihood,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def |3RiskLevels|
  {:db/ident            :dpvo-risk/|3RiskLevels|,
   :dcterms/created     #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Scale with 3 Risk Levels from High to Low"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "3 Risk Levels"},
   :rdfs/subClassOf     :dpvo/RiskLevel,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def |3SeverityLevels|
  {:db/ident            :dpvo-risk/|3SeverityLevels|,
   :dcterms/created     #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Scale with 3 Severity Levels from High to Low"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "3 Severity Levels"},
   :rdfs/subClassOf     :dpvo/Severity,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def |5LikelihoodLevels|
  {:db/ident :dpvo-risk/|5LikelihoodLevels|,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Scale with 5 Likelihood Levels from Very High to Very Low"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "5 Likelihood Levels"},
   :rdfs/subClassOf :dpvo/Likelihood,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def |5RiskLevels|
  {:db/ident            :dpvo-risk/|5RiskLevels|,
   :dcterms/created     #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Scale with 5 Risk Levels from Very High to Very Low"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "5 Risk Levels"},
   :rdfs/subClassOf     :dpvo/RiskLevel,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def |5SeverityLevels|
  {:db/ident :dpvo-risk/|5SeverityLevels|,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Scale with 5 Severity Levels from Very High to Very Low"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "5 Severity Levels"},
   :rdfs/subClassOf :dpvo/Severity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def |7LikelihoodLevels|
  {:db/ident :dpvo-risk/|7LikelihoodLevels|,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Scale with 7 Likelihood Levels from Extremely High to Extremely Low"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "7 Likelihood Levels"},
   :rdfs/subClassOf :dpvo/Likelihood,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def |7RiskLevels|
  {:db/ident :dpvo-risk/|7RiskLevels|,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Scale with 7 Risk Levels from Extremely High to Extremely Low"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "7 Risk Levels"},
   :rdfs/subClassOf :dpvo/RiskLevel,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def |7SeverityLevels|
  {:db/ident :dpvo-risk/|7SeverityLevels|,
   :dcterms/created #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Scale with 7 Severity Levels from Extremely High to Extremely Low"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "7 Severity Levels"},
   :rdfs/subClassOf :dpvo/Severity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def urn:uuid:d8c99962-10f9-5b8f-a167-f19b91cf7a6e
  {:dcterms/abstract {:rdf/language "en",
                      :rdf/value    "Risk Extension for DPV-OWL"},
   :dcterms/contributor #{"Georg P Krog" "Harshvardhan J. Pandit"
                          "Beatriz Esteves" "Julian Flake" "Paul Ryan"},
   :dcterms/created #inst "2022-08-14T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Risk extension to Data Privacy Vocabulary provides terms (classes and properties) related to risk management, assessment, and consequences."},
   :dcterms/license {:xsd/anyURI
                     "https://www.w3.org/Consortium/Legal/2015/doc-license"},
   :dcterms/modified #inst "2022-10-06T00:00:00.000-00:00",
   :dcterms/source {:xsd/anyURI "https://www.w3.org/community/dpvcg/"},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Risk Extension for DPV-OWL"},
   :owl/imports {:xsd/anyURI "https://w3id.org/dpv/dpv-owl"},
   :owl/versionInfo "0.8.2",
   :rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "dpvs-risk",
   :vann/preferredNamespaceUri "https://w3id.org/dpv/dpv-owl/risk#",
   :xsd/anyURI "https://w3id.org/dpv/dpv-owl/risk"})