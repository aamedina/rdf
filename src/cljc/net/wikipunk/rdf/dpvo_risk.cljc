(ns net.wikipunk.rdf.dpvo-risk
  "Risk Extension for DPV-OWL"
  {:dcterms/abstract "Risk Extension for DPV-OWL",
   :dcterms/contributor ["Julian Flake"
                         "Paul Ryan"
                         "Beatriz Esteves"
                         "Harshvardhan J. Pandit"
                         "Georg P Krog"],
   :dcterms/created #inst "2022-08-14T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The Risk extension to Data Privacy Vocabulary provides terms (classes and properties) related to risk management, assessment, and consequences.",
   :dcterms/license "https://www.w3.org/Consortium/Legal/2015/doc-license",
   :dcterms/modified #inst "2022-10-06T00:00:00.000-04:00",
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :dcterms/title "Risk Extension for DPV-OWL",
   :owl/imports "https://w3id.org/dpv/dpv-owl",
   :owl/versionInfo "0.8.2",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "dpvo" "https://w3id.org/dpv/dpv-owl#",
                       "dpvo-risk" "https://w3id.org/dpv/dpv-owl/risk#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vann" "http://purl.org/vocab/vann/",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "dpvo-risk",
   :rdfa/uri "https://w3id.org/dpv/dpv-owl/risk",
   :vann/preferredNamespacePrefix "dpvs-risk",
   :vann/preferredNamespaceUri "https://w3id.org/dpv/dpv-owl/risk#"})

(def ACSC-ISM
  "The Australian Cyber Security Centre (ACSC) published the Australian Government Information Security Manual (ISM) which adopts the use of a risk management framework that draws from NIST 800-37, and includes six steps: define the system, select security controls, implement security controls, assess security controls, authorise the system and monitor the system"
  {:db/ident :dpvo-risk/ACSC-ISM,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The Australian Cyber Security Centre (ACSC) published the Australian Government Information Security Manual (ISM) which adopts the use of a risk management framework that draws from NIST 800-37, and includes six steps: define the system, select security controls, implement security controls, assess security controls, authorise the system and monitor the system",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "ACSC-ISM",
   :vs/term_status "accepted"})

(def ALARA
  "As Low as Resonably Achievable (ALARP) - A criteria for deciding significance of risk and means of evaluating tolerability of risk"
  {:db/ident :dpvo-risk/ALARA,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "As Low as Resonably Achievable (ALARP) - A criteria for deciding significance of risk and means of evaluating tolerability of risk",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "ALARA",
   :vs/term_status "accepted"})

(def ALARP
  "As Low as Resonably Possible (ALARP) - A criteria for deciding significance of risk and means of evaluating tolerability of risk"
  {:db/ident :dpvo-risk/ALARP,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "As Low as Resonably Possible (ALARP) - A criteria for deciding significance of risk and means of evaluating tolerability of risk",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "ALARP",
   :vs/term_status "accepted"})

(def ANSI-ISA-62443-3‑2-2020
  "ANSI/ISA-62443-3-2-2020 standard, entitled ‘Security for industrial automation and control systems, Part 3-2: Security risk assessment for system design’, from the International Society of Automation (ISA), dedicates an entire part to the assessment of security risk for system design targeting Security and IT professionals"
  {:db/ident :dpvo-risk/ANSI-ISA-62443-3‑2-2020,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "ANSI/ISA-62443-3-2-2020 standard, entitled ‘Security for industrial automation and control systems, Part 3-2: Security risk assessment for system design’, from the International Society of Automation (ISA), dedicates an entire part to the assessment of security risk for system design targeting Security and IT professionals",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "ANSI/ISA-62443-3‑2-2020",
   :vs/term_status "accepted"})

(def AbusiveContentUtilisation
  ""
  {:db/ident :dpvo-risk/AbusiveContentUtilisation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Abusive Content Utilisation",
   :rdfs/subClassOf [:dpvo/Harm :dpvo-risk/AbusiveContentUtilisation],
   :vs/term_status "accepted"})

(def AttackonPrivateLife
  ""
  {:db/ident            :dpvo-risk/AttackonPrivateLife,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Attack on Private Life",
   :rdfs/subClassOf     [:dpvo/Harm :dpvo-risk/AttackonPrivateLife],
   :vs/term_status      "accepted"})

(def AuthorisationFailure
  ""
  {:db/ident :dpvo-risk/AuthorisationFailure,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/trust-services-security-incidents-2021",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Authorisation Failure",
   :rdfs/subClassOf [:dpvo/Detriment :dpvo-risk/AuthorisationFailure],
   :vs/term_status "accepted"})

(def AvoidSource
  "Risk Control that avoids the risk source"
  {:db/ident            :dpvo-risk/AvoidSource,
   :dcterms/created     #inst "2022-08-21T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Risk Control that avoids the risk source",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Avoid Source",
   :rdfs/subClassOf     [:dpvo-risk/ControlRiskSource
                         :dpvo-risk/AvoidSource
                         :dpvo/RiskMitigationMeasure],
   :vs/term_status      "accepted"})

(def BSI-200-2
  "The BSI-Standard 200-2 (‘IT-Grundschutz Methodology’) provides a methodology for the management of information security which can be adapted to the requirements of organisations of various types and sizes"
  {:db/ident :dpvo-risk/BSI-200-2,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The BSI-Standard 200-2 (‘IT-Grundschutz Methodology’) provides a methodology for the management of information security which can be adapted to the requirements of organisations of various types and sizes",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/RiskManagementMethodology
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "BSI Standard 200-2",
   :vs/term_status "accepted"})

(def BayesianAnalysis
  "A means of making inference about model parameters using Bayes' theorem which has the capability of incorporating empirical data into prior judgements about probabilities"
  {:db/ident :dpvo-risk/BayesianAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A means of making inference about model parameters using Bayes' theorem which has the capability of incorporating empirical data into prior judgements about probabilities",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Bayesian Analysis",
   :vs/term_status "accepted"})

(def BayesianNetworks
  "A graphical model of variables and their cause-effect relationships expressed using probabilities"
  {:db/ident :dpvo-risk/BayesianNetworks,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A graphical model of variables and their cause-effect relationships expressed using probabilities",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Bayesian Networks",
   :vs/term_status "accepted"})

(def Blackmail
  ""
  {:db/ident            :dpvo-risk/Blackmail,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Blackmail",
   :rdfs/subClassOf     [:dpvo/Harm :dpvo-risk/Blackmail],
   :vs/term_status      "accepted"})

(def BowTie
  "A diagrammatic way of describing the pathways from sources of risk to outcomes, and of reviewing controls"
  {:db/ident :dpvo-risk/BowTie,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A diagrammatic way of describing the pathways from sources of risk to outcomes, and of reviewing controls",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Bow Tie Analysis",
   :vs/term_status "accepted"})

(def Brainstorming
  "Technique used in workshops to encourage imaginative thinking"
  {:db/ident :dpvo-risk/Brainstorming,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Technique used in workshops to encourage imaginative thinking",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Brainstorming",
   :vs/term_status "accepted"})

(def BruteForceAuthorisations
  ""
  {:db/ident :dpvo-risk/BruteForceAuthorisations,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Brute Force Authorisations",
   :rdfs/subClassOf [:dpvo/Detriment :dpvo-risk/BruteForceAuthorisations],
   :vs/term_status "accepted"})

(def BusinessImpact
  ""
  {:db/ident :dpvo-risk/BusinessImpact,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Business impact",
   :rdfs/subClassOf [:dpvo/Impact :dpvo-risk/BusinessImpact],
   :vs/term_status "accepted"})

(def BusinessImpactAnalysis
  "A process that analyses the consequences of a disruptive incident on the organization which determines the recovery priorities of an organization's products and services and, thereby, the priorities of the activities and resources which deliver them"
  {:db/ident :dpvo-risk/BusinessImpactAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A process that analyses the consequences of a disruptive incident on the organization which determines the recovery priorities of an organization's products and services and, thereby, the priorities of the activities and resources which deliver them",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Business Impact Analysis",
   :vs/term_status "accepted"})

(def BusinessPerformanceImpairment
  ""
  {:db/ident            :dpvo-risk/BusinessPerformanceImpairment,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Business Performance Impairment",
   :rdfs/subClassOf     [:dpvo/Detriment
                         :dpvo-risk/BusinessPerformanceImpairment],
   :vs/term_status      "accepted"})

(def Businessdisruption
  ""
  {:db/ident            :dpvo-risk/Businessdisruption,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Business disruption",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/Businessdisruption],
   :vs/term_status      "accepted"})

(def CCRACII
  "The Guide to Conducting Cybersecurity Risk Assessment for Critical Information Infrastructure (CCRACII) defines commonly used terms such as threat event, vulnerability, likelihood, impact and risk, roles, and responsibilities, in addition to a range for risk levels, ranging from low to very high with different level of risk toleranc"
  {:db/ident :dpvo-risk/CCRACII,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The Guide to Conducting Cybersecurity Risk Assessment for Critical Information Infrastructure (CCRACII) defines commonly used terms such as threat event, vulnerability, likelihood, impact and risk, roles, and responsibilities, in addition to a range for risk levels, ranging from low to very high with different level of risk toleranc",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "CCRACII",
   :vs/term_status "accepted"})

(def CORAS
  "The CORAS method was developed and is supported by SourceForge. It is a method for conducting the analysis and management of security risk. It provides a customised language for modelling threats and risks as well as detailed guidelines explaining how the language should be used to capture and model relevant information during the various stages of the security analysis"
  {:db/ident :dpvo-risk/CORAS,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The CORAS method was developed and is supported by SourceForge. It is a method for conducting the analysis and management of security risk. It provides a customised language for modelling threats and risks as well as detailed guidelines explaining how the language should be used to capture and model relevant information during the various stages of the security analysis",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "CORAS",
   :vs/term_status "accepted"})

(def CRAMM
  "CCTA Risk Assessment and Management Methodology (CRAMM) is a method that an analyst or group of analysts may use to evaluate the security and risk level of an organisation by analysing and combining the diverse knowledge distributed in the local corporate environment"
  {:db/ident :dpvo-risk/CRAMM,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "CCTA Risk Assessment and Management Methodology (CRAMM) is a method that an analyst or group of analysts may use to evaluate the security and risk level of an organisation by analysing and combining the diverse knowledge distributed in the local corporate environment",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "CRAMM",
   :vs/term_status "accepted"})

(def CVaR
  "A measure of the expected loss from a financial portfolio in the worst a % of cases. Also called expected shortfall (ES)"
  {:db/ident :dpvo-risk/CVaR,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A measure of the expected loss from a financial portfolio in the worst a % of cases. Also called expected shortfall (ES)",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Conditional Value at Risk (CVaR)",
   :vs/term_status "accepted"})

(def CausalMapping
  "A network diagram representing events, causes and effects and their relationships."
  {:db/ident :dpvo-risk/CausalMapping,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A network diagram representing events, causes and effects and their relationships.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Causal Mapping",
   :vs/term_status "accepted"})

(def CauseConsequenceAnalysis
  "A combination of fault and event tree analysis that allows inclusion of time delays. Both causes and consequences of an initiating event are considered."
  {:db/ident :dpvo-risk/CauseConsequenceAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A combination of fault and event tree analysis that allows inclusion of time delays. Both causes and consequences of an initiating event are considered.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Cause-Consequence Analysis",
   :vs/term_status "accepted"})

(def ChangeConsequence
  "Risk Control that changes Consequence"
  {:db/ident            :dpvo-risk/ChangeConsequence,
   :dcterms/created     #inst "2022-08-25T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Risk Control that changes Consequence",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Change Consequence",
   :rdfs/subClassOf     [:dpvo-risk/ControlConsequence
                         :dpvo-risk/ChangeConsequence
                         :dpvo/RiskMitigationMeasure],
   :vs/term_status      "accepted"})

(def ChangeImpact
  "Risk Control that changes Impact"
  {:db/ident            :dpvo-risk/ChangeImpact,
   :dcterms/created     #inst "2022-08-26T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Risk Control that changes Impact",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Change Impact",
   :rdfs/subClassOf     [:dpvo-risk/ControlConsequence
                         :dpvo-risk/ChangeImpact
                         :dpvo/RiskMitigationMeasure],
   :vs/term_status      "accepted"})

(def Checklists
  "A checklist based on experience or on concepts and models that can be used to help identify risks or controls."
  {:db/ident :dpvo-risk/Checklists,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A checklist based on experience or on concepts and models that can be used to help identify risks or controls.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Checklists",
   :vs/term_status "accepted"})

(def ChildViolence
  ""
  {:db/ident :dpvo-risk/ChildViolence,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Child Violence",
   :rdfs/subClassOf [:dpvo/Harm :dpvo-risk/ChildViolence],
   :vs/term_status "accepted"})

(def Cindynic
  "Considers goals, values, rules, data and models of stakeholders and identifies inconsistencies, ambiguities, omissions and ignorance. These form systemic sources and drivers of risk."
  {:db/ident :dpvo-risk/Cindynic,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Considers goals, values, rules, data and models of stakeholders and identifies inconsistencies, ambiguities, omissions and ignorance. These form systemic sources and drivers of risk.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Cindynic Approach",
   :vs/term_status "accepted"})

(def CitizensImpact
  ""
  {:db/ident :dpvo-risk/CitizensImpact,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Citizens impact",
   :rdfs/subClassOf [:dpvo/Impact :dpvo-risk/CitizensImpact],
   :vs/term_status "accepted"})

(def Classifications
  "A classification list based on experience or on concepts and models that can be used to help identify risks or controls."
  {:db/ident :dpvo-risk/Classifications,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A classification list based on experience or on concepts and models that can be used to help identify risks or controls.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Classifications",
   :vs/term_status "accepted"})

(def Coercion
  ""
  {:db/ident :dpvo-risk/Coercion,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Coercion",
   :rdfs/subClassOf [:dpvo/Harm :dpvo-risk/Coercion],
   :vs/term_status "accepted"})

(def ComplianceImpact
  ""
  {:db/ident :dpvo-risk/ComplianceImpact,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Compliance impact",
   :rdfs/subClassOf [:dpvo/Impact :dpvo-risk/ComplianceImpact],
   :vs/term_status "accepted"})

(def CompromiseAccount
  ""
  {:db/ident :dpvo-risk/CompromiseAccount,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Compromise Account",
   :rdfs/subClassOf [:dpvo/Harm :dpvo-risk/CompromiseAccount],
   :vs/term_status "accepted"})

(def CompromiseAccountCredentials
  ""
  {:db/ident :dpvo-risk/CompromiseAccountCredentials,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Compromise Account Credentials",
   :rdfs/subClassOf [:dpvo/Harm :dpvo-risk/CompromiseAccountCredentials],
   :vs/term_status "accepted"})

(def CompromiseAccountSecurity
  ""
  {:db/ident :dpvo-risk/CompromiseAccountSecurity,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Compromise Account Security",
   :rdfs/subClassOf [:dpvo/NonMaterialDamage
                     :dpvo-risk/CompromiseAccountSecurity],
   :vs/term_status "accepted"})

(def ConfidentialityBreach
  ""
  {:db/ident            :dpvo-risk/ConfidentialityBreach,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Confidentiality Breach",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/ConfidentialityBreach],
   :vs/term_status      "accepted"})

(def ConsequenceForDataSubject
  ""
  {:db/ident            :dpvo-risk/ConsequenceForDataSubject,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description "",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Consequence for Data Subject",
   :rdfs/subClassOf     [:dpvo/Consequence
                         :dpvo-risk/ConsequenceForDataSubject],
   :vs/term_status      "accepted"})

(def ConsequenceOnDataSecurity
  ""
  {:db/ident            :dpvo-risk/ConsequenceOnDataSecurity,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description "",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Consequence on Data Security",
   :rdfs/subClassOf     [:dpvo/Consequence
                         :dpvo-risk/ConsequenceOnDataSecurity],
   :vs/term_status      "accepted"})

(def ControlConsequence
  "Risk Mitigation Measure that controls the Consequences and Impacts"
  {:db/ident :dpvo-risk/ControlConsequence,
   :dcterms/created #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Risk Mitigation Measure that controls the Consequences and Impacts",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Control Consequence",
   :rdfs/subClassOf [:dpvo/RiskMitigationMeasure :dpvo-risk/ControlConsequence],
   :vs/term_status "accepted"})

(def ControlMonitors
  "Risk Mitigation Measure that uses controls to monitor events"
  {:db/ident :dpvo-risk/ControlMonitors,
   :dcterms/created #inst "2022-08-30T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Risk Mitigation Measure that uses controls to monitor events",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Monitoring can be associated with characteristics such as assessing or detecting whether something is active, operational, performant, effective, has potential to materialise, is materialising, or has already materialised.",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Control Monitors",
   :rdfs/subClassOf [:dpvo/RiskMitigationMeasure :dpvo-risk/ControlMonitors],
   :vs/term_status "accepted"})

(def ControlRiskSource
  "Risk Mitigation Measure that controls the Risk Source"
  {:db/ident            :dpvo-risk/ControlRiskSource,
   :dcterms/created     #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Risk Mitigation Measure that controls the Risk Source",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Control Risk Source",
   :rdfs/subClassOf     [:dpvo/RiskMitigationMeasure
                         :dpvo-risk/ControlRiskSource],
   :vs/term_status      "accepted"})

(def CopyrightViolation
  ""
  {:db/ident :dpvo-risk/CopyrightViolation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Copyright Violation",
   :rdfs/subClassOf [:dpvo/NonMaterialDamage :dpvo-risk/CopyrightViolation],
   :vs/term_status "accepted"})

(def CorruptionData
  ""
  {:db/ident            :dpvo-risk/CorruptionData,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Corruption of Data",
   :rdfs/subClassOf     [:dpvo/Damage :dpvo-risk/CorruptionData],
   :vs/term_status      "accepted"})

(def CostAcquisition
  ""
  {:db/ident            :dpvo-risk/CostAcquisition,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Cost of Acquisition",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/CostAcquisition],
   :vs/term_status      "accepted"})

(def CostBackup
  ""
  {:db/ident            :dpvo-risk/CostBackup,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Cost of Backup",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/CostBackup],
   :vs/term_status      "accepted"})

(def CostBenefitAnalysis
  "Uses money as a scale for estimating positive and negative, tangible and intangible, consequences of different options."
  {:db/ident :dpvo-risk/CostBenefitAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Uses money as a scale for estimating positive and negative, tangible and intangible, consequences of different options.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Cost/benefit Analysis",
   :vs/term_status "accepted"})

(def CostConfiguration
  ""
  {:db/ident            :dpvo-risk/CostConfiguration,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Cost of Configuration",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/CostConfiguration],
   :vs/term_status      "accepted"})

(def CostInstallation
  ""
  {:db/ident            :dpvo-risk/CostInstallation,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Cost of Installation",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/CostInstallation],
   :vs/term_status      "accepted"})

(def CostJudicialPenalties
  ""
  {:db/ident            :dpvo-risk/CostJudicialPenalties,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Cost of Judicial Penalties",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/CostJudicialPenalties],
   :vs/term_status      "accepted"})

(def CostJudicialProceedings
  ""
  {:db/ident            :dpvo-risk/CostJudicialProceedings,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Cost of Judicial Proceedings",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/CostJudicialProceedings],
   :vs/term_status      "accepted"})

(def CostOperationInterruption
  ""
  {:db/ident            :dpvo-risk/CostOperationInterruption,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Cost of Operation Interruption",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/CostOperationInterruption],
   :vs/term_status      "accepted"})

(def CostSuspendedOperations
  ""
  {:db/ident            :dpvo-risk/CostSuspendedOperations,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Cost of Suspended Operations",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/CostSuspendedOperations],
   :vs/term_status      "accepted"})

(def CrossImpactAnalysis
  "Evaluates changes in the probability of the occurrence of a given set of events consequent on the actual occurrence of one of them."
  {:db/ident :dpvo-risk/CrossImpactAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Evaluates changes in the probability of the occurrence of a given set of events consequent on the actual occurrence of one of them.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Cross Impact Analysis",
   :vs/term_status "accepted"})

(def Cryptojacking
  "Cryptojacking or hidden cryptomining is a type of cybercrime where a criminal secretly uses a victim’s computing power to generate cryptocurrency"
  {:db/ident :dpvo-risk/Cryptojacking,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Cryptojacking or hidden cryptomining is a type of cybercrime where a criminal secretly uses a victim’s computing power to generate cryptocurrency",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/enisa-threat-landscape-2021",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Cryptojacking",
   :rdfs/subClassOf [:dpvo/Detriment :dpvo-risk/Cryptojacking],
   :vs/term_status "accepted"})

(def CyberSpying
  ""
  {:db/ident            :dpvo-risk/CyberSpying,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Cyber Spying",
   :rdfs/subClassOf     [:dpvo/NonMaterialDamage :dpvo-risk/CyberSpying],
   :vs/term_status      "accepted"})

(def CyberStalking
  ""
  {:db/ident            :dpvo-risk/CyberStalking,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Cyber Stalking",
   :rdfs/subClassOf     [:dpvo/NonMaterialDamage :dpvo-risk/CyberStalking],
   :vs/term_status      "accepted"})

(def DPIA
  "Analyses how incidents and events could affect the protection of data and its effects on persons and identifies and quantifies the capabilities that would be needed to manage it."
  {:db/ident :dpvo-risk/DPIA,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Analyses how incidents and events could affect the protection of data and its effects on persons and identifies and quantifies the capabilities that would be needed to manage it.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Data Protection Impact Assessment (DPIA)",
   :vs/term_status "accepted"})

(def DamageByThirdParty
  ""
  {:db/ident :dpvo-risk/DamageByThirdParty,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Damage by Third Party",
   :rdfs/subClassOf [:dpvo/Damage :dpvo-risk/DamageByThirdParty],
   :vs/term_status "accepted"})

(def DangertoCustomers
  ""
  {:db/ident            :dpvo-risk/DangertoCustomers,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Danger to Customers",
   :rdfs/subClassOf     [:dpvo/Harm :dpvo-risk/DangertoCustomers],
   :vs/term_status      "accepted"})

(def DangertoPersonnel
  ""
  {:db/ident            :dpvo-risk/DangertoPersonnel,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Danger to Personnel",
   :rdfs/subClassOf     [:dpvo/Harm :dpvo-risk/DangertoPersonnel],
   :vs/term_status      "accepted"})

(def DataBreach
  ""
  {:db/ident            :dpvo-risk/DataBreach,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Data Breach",
   :rdfs/subClassOf     [:dpvo/Damage :dpvo-risk/DataBreach],
   :vs/term_status      "accepted"})

(def DecisionTreeAnalysis
  "Uses a tree-like representation or model of decisions and their possible consequences. Outcomes are usually expressed in monetary terms or in terms of utility."
  {:db/ident :dpvo-risk/DecisionTreeAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Uses a tree-like representation or model of decisions and their possible consequences. Outcomes are usually expressed in monetary terms or in terms of utility.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Decision Tree Analysis",
   :vs/term_status "accepted"})

(def DelphiTechnique
  "Collects judgements through a set of sequential questionnaires. People participate individually but receive feedback on the responses of others after each set of questions."
  {:db/ident :dpvo-risk/DelphiTechnique,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Collects judgements through a set of sequential questionnaires. People participate individually but receive feedback on the responses of others after each set of questions.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Delphi Technique",
   :vs/term_status "accepted"})

(def DenialServiceAttack
  ""
  {:db/ident            :dpvo-risk/DenialServiceAttack,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Denial of Service Attack (DoS)",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/DenialServiceAttack],
   :vs/term_status      "accepted"})

(def DetrimentToRecovery
  ""
  {:db/ident :dpvo-risk/DetrimentToRecovery,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Detriment to Recovery",
   :rdfs/subClassOf [:dpvo/Detriment :dpvo-risk/DetrimentToRecovery],
   :vs/term_status "accepted"})

(def Discrimination
  ""
  {:db/ident            :dpvo-risk/Discrimination,
   :dcterms/created     #inst "2022-08-19T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description "",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Discrimination",
   :rdfs/subClassOf     [:dpvo/Harm :dpvo-risk/Discrimination],
   :vs/term_status      "accepted"})

(def DistributedDenialServiceAttack
  ""
  {:db/ident            :dpvo-risk/DistributedDenialServiceAttack,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Distributed Denial of Service Attack (DDoS)",
   :rdfs/subClassOf     [:dpvo/Detriment
                         :dpvo-risk/DistributedDenialServiceAttack],
   :vs/term_status      "accepted"})

(def EBIOS
  "Expression des Besoins et Identification des Objectifs de Sécurité (EBIOS) Risk Manager is an information security risk management method, created under the French General Secretariat of National Defence, consistent with ISO 31000 and ISO/IEC 27005, and enables the risk management requirements of ISO/IEC 27001 to be met"
  {:db/ident :dpvo-risk/EBIOS,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Expression des Besoins et Identification des Objectifs de Sécurité (EBIOS) Risk Manager is an information security risk management method, created under the French General Secretariat of National Defence, consistent with ISO 31000 and ISO/IEC 27005, and enables the risk management requirements of ISO/IEC 27001 to be met",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/RiskManagementMethodology
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "EBIOS",
   :vs/term_status "accepted"})

(def ERM-IF
  "Enterprise Risk Management - Integrated Framework (ERM-IF) defines the essential components of enterprise risk management. It is based on a set of principles and concepts for the enterprise and has as its objective to offer a common language for enterprise risk"
  {:db/ident :dpvo-risk/ERM-IF,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Enterprise Risk Management - Integrated Framework (ERM-IF) defines the essential components of enterprise risk management. It is based on a set of principles and concepts for the enterprise and has as its objective to offer a common language for enterprise risk",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "ERM-IF",
   :vs/term_status "accepted"})

(def ETSI-TS-102-165-1
  "ETSI TS 102 165-1 offers methodology and pro-forma for threat, vulnerability and risk analysis (TVRA). According to ETSI TS 102 165-1, threat vulnerability and risk analysis (TVRA) is used to identify risk to an information system based upon the product of the likelihood of an attack and the impact that such an attack will have on the system"
  {:db/ident :dpvo-risk/ETSI-TS-102-165-1,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "ETSI TS 102 165-1 offers methodology and pro-forma for threat, vulnerability and risk analysis (TVRA). According to ETSI TS 102 165-1, threat vulnerability and risk analysis (TVRA) is used to identify risk to an information system based upon the product of the likelihood of an attack and the impact that such an attack will have on the system",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "ETSI TS 102 165-1",
   :vs/term_status "accepted"})

(def EU-ITSRM
  "ITSRM² IT Security Risk Management Methodology is a methodology provided by DG DIGIT and the European Commission as part of a set of standards for information security"
  {:db/ident :dpvo-risk/EU-ITSRM,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "ITSRM² IT Security Risk Management Methodology is a methodology provided by DG DIGIT and the European Commission as part of a set of standards for information security",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "ITSRM²",
   :vs/term_status "accepted"})

(def Eavesdropping
  ""
  {:db/ident            :dpvo-risk/Eavesdropping,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Eavesdropping",
   :rdfs/subClassOf     [:dpvo/NonMaterialDamage :dpvo-risk/Eavesdropping],
   :vs/term_status      "accepted"})

(def EconomicDisadvantage
  ""
  {:db/ident            :dpvo-risk/EconomicDisadvantage,
   :dcterms/created     #inst "2022-08-19T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description "",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Economic Disadvantage",
   :rdfs/subClassOf     [:dpvo/Impact :dpvo-risk/EconomicDisadvantage],
   :vs/term_status      "accepted"})

(def EnvironmentalSafetyEndangerment
  ""
  {:db/ident            :dpvo-risk/EnvironmentalSafetyEndangerment,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Environmental Safety Endangerment",
   :rdfs/subClassOf     [:dpvo/Harm :dpvo-risk/EnvironmentalSafetyEndangerment],
   :vs/term_status      "accepted"})

(def EquipmentFailure
  ""
  {:db/ident            :dpvo-risk/EquipmentFailure,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Equipment Failure",
   :rdfs/subClassOf     [:dpvo/Damage :dpvo-risk/EquipmentFailure],
   :vs/term_status      "accepted"})

(def EquipmentMalfunction
  ""
  {:db/ident            :dpvo-risk/EquipmentMalfunction,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Equipment Malfunction",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/EquipmentMalfunction],
   :vs/term_status      "accepted"})

(def ErrornousSystemUse
  ""
  {:db/ident            :dpvo-risk/ErrornousSystemUse,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Errornous System Use",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/ErrornousSystemUse],
   :vs/term_status      "accepted"})

(def EventTreeAnalysis
  "Models the possible outcomes from a given initiating event and the status of controls thus analysing the frequency or probability of the various possible outcomes."
  {:db/ident :dpvo-risk/EventTreeAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Models the possible outcomes from a given initiating event and the status of controls thus analysing the frequency or probability of the various possible outcomes.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Event Tree Analysis",
   :vs/term_status "accepted"})

(def Extorsion
  ""
  {:db/ident :dpvo-risk/Extorsion,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Extorsion",
   :rdfs/subClassOf [:dpvo/Harm :dpvo-risk/Extorsion],
   :vs/term_status "accepted"})

(def ExtremelyHighLikelihood
  "Level where Likelihood is Extremely High"
  {:db/ident :dpvo-risk/ExtremelyHighLikelihood,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Level where Likelihood is Extremely High",
   :rdf/type
   [:owl/NamedIndividual :dpvo/Likelihood :dpvo-risk/|7LikelihoodLevels|],
   :rdf/value 0.99M,
   :rdfs/comment
   "The suggested quantitative value for this concept is 0.99 on a scale of 0 to 1",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Extremely High Likelihood",
   :vs/term_status "accepted"})

(def ExtremelyHighRisk
  "Level where Risk is Extremely High"
  {:db/ident :dpvo-risk/ExtremelyHighRisk,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Level where Risk is Extremely High",
   :rdf/type [:dpvo-risk/|7RiskLevels| :owl/NamedIndividual :dpvo/RiskLevel],
   :rdf/value 0.99M,
   :rdfs/comment
   "The suggested quantitative value for this concept is 0.99 on a scale of 0 to 1",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Extremely High Risk",
   :vs/term_status "accepted"})

(def ExtremelyHighSeverity
  "Level where Severity is Extremely High"
  {:db/ident :dpvo-risk/ExtremelyHighSeverity,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Level where Severity is Extremely High",
   :rdf/type [:dpvo-risk/|7SeverityLevels| :dpvo/Severity :owl/NamedIndividual],
   :rdf/value 0.99M,
   :rdfs/comment
   "The suggested quantitative value for this concept is 0.99 on a scale of 0 to 1",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Extremely High Severity",
   :vs/term_status "accepted"})

(def ExtremelyLowLikelihood
  "Level where Likelihood is Extremely Low"
  {:db/ident :dpvo-risk/ExtremelyLowLikelihood,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Level where Likelihood is Extremely Low",
   :rdf/type
   [:dpvo-risk/|7LikelihoodLevels| :dpvo/Likelihood :owl/NamedIndividual],
   :rdf/value 0.01M,
   :rdfs/comment
   "The suggested quantitative value for this concept is 0.01 on a scale of 0 to 1",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Extremely Low Likelihood",
   :vs/term_status "accepted"})

(def ExtremelyLowRisk
  "Level where Risk is Extremely Low"
  {:db/ident :dpvo-risk/ExtremelyLowRisk,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Level where Risk is Extremely Low",
   :rdf/type [:dpvo/RiskLevel :dpvo-risk/|7RiskLevels| :owl/NamedIndividual],
   :rdf/value 0.01M,
   :rdfs/comment
   "The suggested quantitative value for this concept is 0.01 on a scale of 0 to 1",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Extremely Low Risk",
   :vs/term_status "accepted"})

(def ExtremelyLowSeverity
  "Level where Severity is Extremely Low"
  {:db/ident :dpvo-risk/ExtremelyLowSeverity,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Level where Severity is Extremely Low",
   :rdf/type [:owl/NamedIndividual :dpvo-risk/|7SeverityLevels| :dpvo/Severity],
   :rdf/value 0.01M,
   :rdfs/comment
   "The suggested quantitative value for this concept is 0.01 on a scale of 0 to 1",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Extremely Low Severity",
   :vs/term_status "accepted"})

(def FAIR
  "The purpose of the FAIR (Factor Analysis of Information Risk) model is to help organisations understand, analyse, and measure information risk. The model provides an approach to quantify risk and defines the necessary building blocks for implementing effective cyber risk management programmes"
  {:db/ident :dpvo-risk/FAIR,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The purpose of the FAIR (Factor Analysis of Information Risk) model is to help organisations understand, analyse, and measure information risk. The model provides an approach to quantify risk and defines the necessary building blocks for implementing effective cyber risk management programmes",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/RiskManagementMethodology
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "FAIR",
   :vs/term_status "accepted"})

(def FAIR-Privacy
  "Factors Analysis in Information Risk (FAIR Privacy) is a quantitative privacy risk framework based on FAIR (Factors Analysis in Information Risk) that examines personal privacy risks (to individuals), not organisational risks"
  {:db/ident :dpvo-risk/FAIR-Privacy,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Factors Analysis in Information Risk (FAIR Privacy) is a quantitative privacy risk framework based on FAIR (Factors Analysis in Information Risk) that examines personal privacy risks (to individuals), not organisational risks",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "FAIR Privacy",
   :vs/term_status "accepted"})

(def FMEA
  "Considers the ways in which each component of a system might fail and the failure causes and effects."
  {:db/ident :dpvo-risk/FMEA,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Considers the ways in which each component of a system might fail and the failure causes and effects.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Failure Modes And Effects Analysis (FMEA)",
   :vs/term_status "accepted"})

(def FMECA
  "Considers the ways in which each component of a system might fail and the failure causes and effects. FMEA followed by a criticality analysis which defines the significance of each failure mode (FMECA)."
  {:db/ident :dpvo-risk/FMECA,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Considers the ways in which each component of a system might fail and the failure causes and effects. FMEA followed by a criticality analysis which defines the significance of each failure mode (FMECA).",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Failure Modes And Effects And Criticality Analysis (FMECA)",
   :vs/term_status "accepted"})

(def FNDiagrams
  "Special case of quantitative consequence/likelihood graph applied to consideration of tolerability of risk to human life."
  {:db/ident :dpvo-risk/FNDiagrams,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Special case of quantitative consequence/likelihood graph applied to consideration of tolerability of risk to human life.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "F-N Diagrams",
   :vs/term_status "accepted"})

(def FaultTreeAnalysis
  "Analyses causes of a focus event using Boolean logic to describe combinations of faults. Variations include a success tree where the top event is desired and a cause tree used to investigate past events."
  {:db/ident :dpvo-risk/FaultTreeAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Analyses causes of a focus event using Boolean logic to describe combinations of faults. Variations include a success tree where the top event is desired and a cause tree used to investigate past events.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Fault Tree Analysis",
   :vs/term_status "accepted"})

(def FinancialEquipmentCosts
  ""
  {:db/ident            :dpvo-risk/FinancialEquipmentCosts,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Financial Equipment Costs",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/FinancialEquipmentCosts],
   :vs/term_status      "accepted"})

(def FinancialInvestigationCosts
  ""
  {:db/ident            :dpvo-risk/FinancialInvestigationCosts,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Financial Investigation Costs",
   :rdfs/subClassOf     [:dpvo/Detriment
                         :dpvo-risk/FinancialInvestigationCosts],
   :vs/term_status      "accepted"})

(def FinancialLoss
  ""
  {:db/ident            :dpvo-risk/FinancialLoss,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Financial Loss",
   :rdfs/subClassOf     [:dpvo/Damage :dpvo-risk/FinancialLoss],
   :vs/term_status      "accepted"})

(def FinancialPersonnelCosts
  ""
  {:db/ident            :dpvo-risk/FinancialPersonnelCosts,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Financial Personnel Costs",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/FinancialPersonnelCosts],
   :vs/term_status      "accepted"})

(def FinancialRepairCosts
  ""
  {:db/ident            :dpvo-risk/FinancialRepairCosts,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Financial Repair Costs",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/FinancialRepairCosts],
   :vs/term_status      "accepted"})

(def Fishbone
  "Identifies contributory factors to a defined outcome (wanted or unwanted). Contributory factors are usually divided into predefined categories and displayed in a tree structure or a fishbone diagram."
  {:db/ident :dpvo-risk/Fishbone,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Identifies contributory factors to a defined outcome (wanted or unwanted). Contributory factors are usually divided into predefined categories and displayed in a tree structure or a fishbone diagram.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Ishikawa (Fishbone)",
   :vs/term_status "accepted"})

(def Fraud
  ""
  {:db/ident            :dpvo-risk/Fraud,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Fraud",
   :rdfs/subClassOf     [:dpvo/Harm :dpvo-risk/Fraud],
   :vs/term_status      "accepted"})

(def GCSOS
  "The Guidelines on Cyber Security Onboard Ships (GCSOS) guidelines explain why and how cyber risks should be managed in a shipping context. They outline the risk assessment process with an explanation of the part played by each component of cyber risk and offer advice on how to respond to and recover from cyber incidents"
  {:db/ident :dpvo-risk/GCSOS,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The Guidelines on Cyber Security Onboard Ships (GCSOS) guidelines explain why and how cyber risks should be managed in a shipping context. They outline the risk assessment process with an explanation of the part played by each component of cyber risk and offer advice on how to respond to and recover from cyber incidents",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "GCSOS",
   :vs/term_status "accepted"})

(def GameTheory
  "The study of strategic decision making to model the impact of the decisions of different players involved in the game. Example application area can be risk based pricing."
  {:db/ident :dpvo-risk/GameTheory,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The study of strategic decision making to model the impact of the decisions of different players involved in the game. Example application area can be risk based pricing.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Game Theory",
   :vs/term_status "accepted"})

(def GovernmentCrisis
  ""
  {:db/ident            :dpvo-risk/GovernmentCrisis,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Government Crisis",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/GovernmentCrisis],
   :vs/term_status      "accepted"})

(def HACCP
  "Analyses the risk reduction that can be achieved by various layers of protection."
  {:db/ident :dpvo-risk/HACCP,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Analyses the risk reduction that can be achieved by various layers of protection.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Hazard Analysis And Critical Control Points (HACCP)",
   :vs/term_status "accepted"})

(def HAZOP
  "A structured and systematic examination of a planned or existing process or operation in order to identify and evaluate problems that might represent risk to personnel or equipment, or prevent efficient operation"
  {:db/ident :dpvo-risk/HAZOP,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A structured and systematic examination of a planned or existing process or operation in order to identify and evaluate problems that might represent risk to personnel or equipment, or prevent efficient operation",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Hazard And Operability Studies (HAZOP)",
   :vs/term_status "accepted"})

(def HITRUST-CSF
  "The HITRUST Cyber-Security Framework (CSF) is a framework created by security industry experts to safeguard sensitive information and manage information risk for organisations across all industries and throughout the third-party supply chain"
  {:db/ident :dpvo-risk/HITRUST-CSF,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The HITRUST Cyber-Security Framework (CSF) is a framework created by security industry experts to safeguard sensitive information and manage information risk for organisations across all industries and throughout the third-party supply chain",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/RiskManagementMethodology
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "HITRUST-CSF",
   :vs/term_status "accepted"})

(def HaltSource
  "Risk Control that halts the risk source or prevents it from materialising"
  {:db/ident :dpvo-risk/HaltSource,
   :dcterms/created #inst "2022-08-19T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Risk Control that halts the risk source or prevents it from materialising",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Halt Source",
   :rdfs/subClassOf [:dpvo-risk/ControlRiskSource
                     :dpvo-risk/HaltSource
                     :dpvo/RiskMitigationMeasure],
   :vs/term_status "accepted"})

(def HarmfulSpeech
  ""
  {:db/ident :dpvo-risk/HarmfulSpeech,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Harmful Spech",
   :rdfs/subClassOf [:dpvo/Harm :dpvo-risk/HarmfulSpeech],
   :vs/term_status "accepted"})

(def HealthLifeImpact
  ""
  {:db/ident :dpvo-risk/HealthLifeImpact,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Health and life impact",
   :rdfs/subClassOf [:dpvo/Impact :dpvo-risk/HealthLifeImpact],
   :vs/term_status "accepted"})

(def HighLikelihood
  "Level where Likelihood is High"
  {:db/ident :dpvo-risk/HighLikelihood,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Level where Likelihood is High",
   :rdf/type [:dpvo-risk/|3LikelihoodLevels|
              :dpvo-risk/|5LikelihoodLevels|
              :owl/NamedIndividual
              :dpvo/Likelihood
              :dpvo-risk/|7LikelihoodLevels|],
   :rdf/value 0.75M,
   :rdfs/comment
   "The suggested quantitative value for this concept is 0.75 on a scale of 0 to 1",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "High Likelihood",
   :vs/term_status "accepted"})

(def HighRisk
  "Level where Risk is High"
  {:db/ident :dpvo-risk/HighRisk,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Level where Risk is High",
   :rdf/type [:owl/NamedIndividual
              :dpvo/RiskLevel
              :dpvo-risk/|5RiskLevels|
              :dpvo-risk/|7RiskLevels|
              :dpvo-risk/|3RiskLevels|],
   :rdf/value 0.75M,
   :rdfs/comment
   "The suggested quantitative value for this concept is 0.75 on a scale of 0 to 1",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "High Risk",
   :vs/term_status "accepted"})

(def HighSeverity
  "Level where Severity is High"
  {:db/ident :dpvo-risk/HighSeverity,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Level where Severity is High",
   :rdf/type [:dpvo/Severity
              :dpvo-risk/|5SeverityLevels|
              :dpvo-risk/|7SeverityLevels|
              :dpvo-risk/|3SeverityLevels|
              :owl/NamedIndividual],
   :rdf/value 0.75M,
   :rdfs/comment
   "The suggested quantitative value for this concept is 0.75 on a scale of 0 to 1",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "High Severity",
   :vs/term_status "accepted"})

(def HumanErrors
  ""
  {:db/ident :dpvo-risk/HumanErrors,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Human Errors",
   :rdfs/subClassOf [:dpvo/Detriment :dpvo-risk/HumanErrors],
   :vs/term_status "accepted"})

(def HumanReliabilityAnalysis
  "A set of techniques for identifying the potential for human error and estimating the likelihood of failure."
  {:db/ident :dpvo-risk/HumanReliabilityAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A set of techniques for identifying the potential for human error and estimating the likelihood of failure.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Human Reliability Analysis",
   :vs/term_status "accepted"})

(def IMO-MSC-FAL1-CIRC3
  "The official International Maritime Organization guidelines IMO MSC-FAL.1/CIRC.3 provide a high-level approach to the management pf maritime cyber risk which refers to the extent a technology asset is exposed to risks during an event that could result in shipping-related operational failure"
  {:db/ident :dpvo-risk/IMO-MSC-FAL1-CIRC3,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The official International Maritime Organization guidelines IMO MSC-FAL.1/CIRC.3 provide a high-level approach to the management pf maritime cyber risk which refers to the extent a technology asset is exposed to risks during an event that could result in shipping-related operational failure",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/RiskManagementMethodology
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "IMO MSC-FAL.1/CIRC.3",
   :vs/term_status "accepted"})

(def IRAM2
  "Information Risk Assessment Methodology (IRAM2) supports risk assessment and treatment and entails a six-phase process, and is is implemented by an automated toolset"
  {:db/ident :dpvo-risk/IRAM2,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Information Risk Assessment Methodology (IRAM2) supports risk assessment and treatment and entails a six-phase process, and is is implemented by an automated toolset",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "IRAM2",
   :vs/term_status "accepted"})

(def IS-BM
  "The IS risk analysis method is based on a business model using a quantitative approach. The values of IS assets come from their importance towards operational continuity, as well as from their replacement costs"
  {:db/ident :dpvo-risk/IS-BM,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The IS risk analysis method is based on a business model using a quantitative approach. The values of IS assets come from their importance towards operational continuity, as well as from their replacement costs",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "IS-BM",
   :vs/term_status "accepted"})

(def ISACA-RISK-IT
  "The ISACA Risk IT Framework provides a set of guiding principles and supporting practices for enterprise management, combined to deliver a comprehensive process model for governing and managing IT risk"
  {:db/ident :dpvo-risk/ISACA-RISK-IT,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The ISACA Risk IT Framework provides a set of guiding principles and supporting practices for enterprise management, combined to deliver a comprehensive process model for governing and managing IT risk",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "ISACA-RISK-IT",
   :vs/term_status "accepted"})

(def ISAMM
  "Information Security Assessment and Monitoring Method (ISAMM) is a quantitative type of risk management methodology that can be applied by various organisations such as governmental agencies, large companies and small and medium size enterprises"
  {:db/ident :dpvo-risk/ISAMM,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Information Security Assessment and Monitoring Method (ISAMM) is a quantitative type of risk management methodology that can be applied by various organisations such as governmental agencies, large companies and small and medium size enterprises",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "ISAMM",
   :vs/term_status "accepted"})

(def ISO-IEC-27005-2018
  "ISO/IEC 27005:2018 ‘Information technology — Security techniques — Information security risk management’ is a risk management framework applicable to all types of organisations (e.g. commercial enterprises, government agencies, non-profit organisations) which intend to manage risks that could compromise the organisation’s information security"
  {:db/ident :dpvo-risk/ISO-IEC-27005-2018,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "ISO/IEC 27005:2018 ‘Information technology — Security techniques — Information security risk management’ is a risk management framework applicable to all types of organisations (e.g. commercial enterprises, government agencies, non-profit organisations) which intend to manage risks that could compromise the organisation’s information security",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "ISO/IEC 27005:2018",
   :vs/term_status "accepted"})

(def ISRAM
  "ISRAM is a quantitative, paper-based risk analysis method that is designed to allow effective participation of managers and staff in the process"
  {:db/ident :dpvo-risk/ISRAM,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "ISRAM is a quantitative, paper-based risk analysis method that is designed to allow effective participation of managers and staff in the process",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "ISRAM",
   :vs/term_status "accepted"})

(def IT-Grundschutz
  "IT-Grundschutz has been developed by the Federal Office for Information Security in Germany. IT-Grundschutz provides a configuration for the establishment of an integrated and effective IT security managemen"
  {:db/ident :dpvo-risk/IT-Grundschutz,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "IT-Grundschutz has been developed by the Federal Office for Information Security in Germany. IT-Grundschutz provides a configuration for the establishment of an integrated and effective IT security managemen",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "IT-Grundschutz",
   :vs/term_status "accepted"})

(def IdentityDispute
  ""
  {:db/ident            :dpvo-risk/IdentityDispute,
   :dcterms/created     #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Identity Dispute",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/IdentityDispute],
   :vs/term_status      "accepted"})

(def IdentityFraud
  ""
  {:db/ident :dpvo-risk/IdentityFraud,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Identity Fraud",
   :rdfs/subClassOf [:dpvo/Harm :dpvo-risk/IdentityFraud],
   :vs/term_status "accepted"})

(def IdentityTheft
  ""
  {:db/ident :dpvo-risk/IdentityTheft,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Identity Theft",
   :rdfs/subClassOf [:dpvo/Harm :dpvo-risk/IdentityTheft],
   :vs/term_status "accepted"})

(def IllegalProcessingData
  ""
  {:db/ident            :dpvo-risk/IllegalProcessingData,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Illegal Processing of Data",
   :rdfs/subClassOf     [:dpvo/Damage :dpvo-risk/IllegalProcessingData],
   :vs/term_status      "accepted"})

(def ImpactOnDataSubject
  ""
  {:db/ident            :dpvo-risk/ImpactOnDataSubject,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description "",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Impact on Data Subject",
   :rdfs/subClassOf     [:dpvo/Impact :dpvo-risk/ImpactOnDataSubject],
   :vs/term_status      "accepted"})

(def ImpacttoRights
  ""
  {:db/ident            :dpvo-risk/ImpacttoRights,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Impact to Rights",
   :rdfs/subClassOf     [:dpvo/Impact :dpvo-risk/ImpacttoRights],
   :vs/term_status      "accepted"})

(def IncreaseInternalCost
  ""
  {:db/ident            :dpvo-risk/IncreaseInternalCost,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Increase Internal Cost",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/IncreaseInternalCost],
   :vs/term_status      "accepted"})

(def IndustrialCrisis
  ""
  {:db/ident            :dpvo-risk/IndustrialCrisis,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Industrial Crisis",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/IndustrialCrisis],
   :vs/term_status      "accepted"})

(def InfluenceDiagrams
  "An extended version of Bayesian networks that includes variables representing uncertainties, consequences and actions"
  {:db/ident :dpvo-risk/InfluenceDiagrams,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "An extended version of Bayesian networks that includes variables representing uncertainties, consequences and actions",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Influence Diagrams",
   :vs/term_status "accepted"})

(def Injury
  ""
  {:db/ident            :dpvo-risk/Injury,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Injury",
   :rdfs/subClassOf     [:dpvo/Harm :dpvo-risk/Injury],
   :vs/term_status      "accepted"})

(def InterceptionCommunications
  ""
  {:db/ident            :dpvo-risk/InterceptionCommunications,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Interception of Communications",
   :rdfs/subClassOf     [:dpvo/Damage :dpvo-risk/InterceptionCommunications],
   :vs/term_status      "accepted"})

(def InternalOperationDisruption
  ""
  {:db/ident            :dpvo-risk/InternalOperationDisruption,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Internal Operation Disruption",
   :rdfs/subClassOf     [:dpvo/Detriment
                         :dpvo-risk/InternalOperationDisruption],
   :vs/term_status      "accepted"})

(def Interviews
  "Structured or semi- structured one-to-one conversations to elicit views."
  {:db/ident :dpvo-risk/Interviews,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Structured or semi- structured one-to-one conversations to elicit views.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Interviews",
   :vs/term_status "accepted"})

(def KnownVulnerabilityExploited
  ""
  {:db/ident :dpvo-risk/KnownVulnerabilityExploited,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Known Vulnerability Exploited",
   :rdfs/subClassOf [:dpvo/Detriment :dpvo-risk/KnownVulnerabilityExploited],
   :vs/term_status "accepted"})

(def LOPA
  "Analyses the risk reduction that can be achieved by various layers of protection."
  {:db/ident :dpvo-risk/LOPA,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Analyses the risk reduction that can be achieved by various layers of protection.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Layer Protection Analysis (LOPA)",
   :vs/term_status "accepted"})

(def LawEnforcementAdverseEffects
  ""
  {:db/ident            :dpvo-risk/LawEnforcementAdverseEffects,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Law Enforcement Adverse Effects",
   :rdfs/subClassOf     [:dpvo/Detriment
                         :dpvo-risk/LawEnforcementAdverseEffects],
   :vs/term_status      "accepted"})

(def LimitationOfRights
  ""
  {:db/ident            :dpvo-risk/LimitationOfRights,
   :dcterms/created     #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description "",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Limitation of Rights",
   :rdfs/subClassOf     [:dpvo/Harm :dpvo-risk/LimitationOfRights],
   :vs/term_status      "accepted"})

(def LossAssets
  ""
  {:db/ident            :dpvo-risk/LossAssets,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Loss of Assets",
   :rdfs/subClassOf     [:dpvo/MaterialDamage :dpvo-risk/LossAssets],
   :vs/term_status      "accepted"})

(def LossCompetitiveAdvantage
  ""
  {:db/ident            :dpvo-risk/LossCompetitiveAdvantage,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Loss of Competitive Advantage",
   :rdfs/subClassOf     [:dpvo/NonMaterialDamage
                         :dpvo-risk/LossCompetitiveAdvantage],
   :vs/term_status      "accepted"})

(def LossControlOverData
  ""
  {:db/ident            :dpvo-risk/LossControlOverData,
   :dcterms/created     #inst "2022-08-19T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description "",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Loss of Control over Data",
   :rdfs/subClassOf     [:dpvo/NonMaterialDamage
                         :dpvo-risk/LossControlOverData],
   :vs/term_status      "accepted"})

(def LossCredibility
  ""
  {:db/ident            :dpvo-risk/LossCredibility,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Loss of Credibility",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/LossCredibility],
   :vs/term_status      "accepted"})

(def LossCustomerConfidence
  ""
  {:db/ident            :dpvo-risk/LossCustomerConfidence,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Loss of Customer Confidence",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/LossCustomerConfidence],
   :vs/term_status      "accepted"})

(def LossCustomers
  ""
  {:db/ident            :dpvo-risk/LossCustomers,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Loss of Customers",
   :rdfs/subClassOf     [:dpvo/NonMaterialDamage :dpvo-risk/LossCustomers],
   :vs/term_status      "accepted"})

(def LossData
  ""
  {:db/ident :dpvo-risk/LossData,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Loss of Data",
   :rdfs/subClassOf [:dpvo/NonMaterialDamage :dpvo-risk/LossData],
   :vs/term_status "accepted"})

(def LossFunds
  ""
  {:db/ident            :dpvo-risk/LossFunds,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Loss of Funds",
   :rdfs/subClassOf     [:dpvo/MaterialDamage :dpvo-risk/LossFunds],
   :vs/term_status      "accepted"})

(def LossGoods
  ""
  {:db/ident            :dpvo-risk/LossGoods,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Loss of Goods",
   :rdfs/subClassOf     [:dpvo/MaterialDamage :dpvo-risk/LossGoods],
   :vs/term_status      "accepted"})

(def LossGoodwill
  ""
  {:db/ident            :dpvo-risk/LossGoodwill,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Loss of Goodwill",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/LossGoodwill],
   :vs/term_status      "accepted"})

(def LossNegotiatingCapacity
  ""
  {:db/ident            :dpvo-risk/LossNegotiatingCapacity,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Loss of Negotiating Capacity",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/LossNegotiatingCapacity],
   :vs/term_status      "accepted"})

(def LossOpportunity
  ""
  {:db/ident            :dpvo-risk/LossOpportunity,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Loss of Opportunity",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/LossOpportunity],
   :vs/term_status      "accepted"})

(def LossProprietaryInformation
  ""
  {:db/ident            :dpvo-risk/LossProprietaryInformation,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Loss of Proprietary Information",
   :rdfs/subClassOf     [:dpvo/NonMaterialDamage
                         :dpvo-risk/LossProprietaryInformation],
   :vs/term_status      "accepted"})

(def LossReputation
  ""
  {:db/ident            :dpvo-risk/LossReputation,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Loss of Reputation",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/LossReputation],
   :vs/term_status      "accepted"})

(def LossResources
  ""
  {:db/ident :dpvo-risk/LossResources,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Loss of Resources",
   :rdfs/subClassOf [:dpvo/NonMaterialDamage :dpvo-risk/LossResources],
   :vs/term_status "accepted"})

(def LossSuppliers
  ""
  {:db/ident            :dpvo-risk/LossSuppliers,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Loss of Suppliers",
   :rdfs/subClassOf     [:dpvo/NonMaterialDamage :dpvo-risk/LossSuppliers],
   :vs/term_status      "accepted"})

(def LossTechnologicalAdvantage
  ""
  {:db/ident            :dpvo-risk/LossTechnologicalAdvantage,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Loss of Technological Advantage",
   :rdfs/subClassOf     [:dpvo/NonMaterialDamage
                         :dpvo-risk/LossTechnologicalAdvantage],
   :vs/term_status      "accepted"})

(def LossTrust
  ""
  {:db/ident            :dpvo-risk/LossTrust,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Loss of Trust",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/LossTrust],
   :vs/term_status      "accepted"})

(def LowLikelihood
  "Level where Likelihood is Low"
  {:db/ident :dpvo-risk/LowLikelihood,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Level where Likelihood is Low",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/|7LikelihoodLevels|
              :dpvo/Likelihood
              :dpvo-risk/|5LikelihoodLevels|
              :dpvo-risk/|3LikelihoodLevels|],
   :rdf/value 0.25M,
   :rdfs/comment
   "The suggested quantitative value for this concept is 0.25 on a scale of 0 to 1",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Low Likelihood",
   :vs/term_status "accepted"})

(def LowRisk
  "Level where Risk is Low"
  {:db/ident :dpvo-risk/LowRisk,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Level where Risk is Low",
   :rdf/type [:dpvo-risk/|3RiskLevels|
              :dpvo-risk/|5RiskLevels|
              :dpvo/RiskLevel
              :owl/NamedIndividual
              :dpvo-risk/|7RiskLevels|],
   :rdf/value 0.25M,
   :rdfs/comment
   "The suggested quantitative value for this concept is 0.25 on a scale of 0 to 1",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Low Risk",
   :vs/term_status "accepted"})

(def LowSeverity
  "Level where Severity is Low"
  {:db/ident :dpvo-risk/LowSeverity,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Level where Severity is Low",
   :rdf/type [:dpvo-risk/|5SeverityLevels|
              :dpvo-risk/|3SeverityLevels|
              :dpvo-risk/|7SeverityLevels|
              :dpvo/Severity
              :owl/NamedIndividual],
   :rdf/value 0.25M,
   :rdfs/comment
   "The suggested quantitative value for this concept is 0.25 on a scale of 0 to 1",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Low Severity",
   :vs/term_status "accepted"})

(def MAGERIT
  "Method for the Harmonised Analysis of Risk (MAGERIT) is an open methodology for risk analysis and management developed by the Spanish Higher Council for Electronic Government and offered as a framework and guide to the public administration"
  {:db/ident :dpvo-risk/MAGERIT,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Method for the Harmonised Analysis of Risk (MAGERIT) is an open methodology for risk analysis and management developed by the Spanish Higher Council for Electronic Government and offered as a framework and guide to the public administration",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "MAGERIT",
   :vs/term_status "accepted"})

(def MCA
  "Compares options in a way that makes trade-offs explicit. Provides an alternative to cost/benefit analysis that does not need a monetary value to be allocated to all inputs."
  {:db/ident :dpvo-risk/MCA,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Compares options in a way that makes trade-offs explicit. Provides an alternative to cost/benefit analysis that does not need a monetary value to be allocated to all inputs.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Multi-criteria Analysis (MCA)",
   :vs/term_status "accepted"})

(def MEHARI
  "MEHARI is a free of charge qualitative risk analysis and management method developed by CLUSIF (Club for the Security of Information in France/Club de la Sécurité de l'Information Français)"
  {:db/ident :dpvo-risk/MEHARI,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "MEHARI is a free of charge qualitative risk analysis and management method developed by CLUSIF (Club for the Security of Information in France/Club de la Sécurité de l'Information Français)",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/RiskManagementMethodology
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "MEHARI",
   :vs/term_status "accepted"})

(def MONARC
  "MONARC (Méthode Optimisée d’analyse des risques CASES – ‘Method for an Optimised Analysis of Risks by CASES’ is a tool and a method allowing precise and repeatable risk assessments to take place"
  {:db/ident :dpvo-risk/MONARC,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "MONARC (Méthode Optimisée d’analyse des risques CASES – ‘Method for an Optimised Analysis of Risks by CASES’ is a tool and a method allowing precise and repeatable risk assessments to take place",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "MONARC",
   :vs/term_status "accepted"})

(def MaliciousCodeAttack
  "Intentional use of software by including or inserting in a system for a harmful purpose"
  {:db/ident :dpvo-risk/MaliciousCodeAttack,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Intentional use of software by including or inserting in a system for a harmful purpose",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Malicious Code Attack",
   :rdfs/subClassOf [:dpvo/Detriment :dpvo-risk/MaliciousCodeAttack],
   :vs/term_status "accepted"})

(def MalwareAttack
  "Malware is software or firmware intended to perform an unauthorised process that will have an adverse impact on the confidentiality, integrity, or availability of a system"
  {:db/ident :dpvo-risk/MalwareAttack,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Malware is software or firmware intended to perform an unauthorised process that will have an adverse impact on the confidentiality, integrity, or availability of a system",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Malware Attack",
   :rdfs/subClassOf [:dpvo/Detriment :dpvo-risk/MalwareAttack],
   :vs/term_status "accepted"})

(def MarkovAnalysis
  "Calculates the probability that a system that has the capacity to be in one of a number of states will be in a particular state at a time t in the future."
  {:db/ident :dpvo-risk/MarkovAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Calculates the probability that a system that has the capacity to be in one of a number of states will be in a particular state at a time t in the future.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Markov Analysis",
   :vs/term_status "accepted"})

(def MisinformationDisinformation
  "Information that is untrue, misleading, or false and used intentionally (disinformation) or unintentionally (misinformation)"
  {:db/ident :dpvo-risk/MisinformationDisinformation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Information that is untrue, misleading, or false and used intentionally (disinformation) or unintentionally (misinformation)",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/enisa-threat-landscape-2021",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "MisinformationDisinformation",
   :rdfs/subClassOf [:dpvo/Detriment :dpvo-risk/MisinformationDisinformation],
   :vs/term_status "accepted"})

(def MisuseBreachedInformation
  ""
  {:db/ident            :dpvo-risk/MisuseBreachedInformation,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Misuse of Breached Information",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/MisuseBreachedInformation],
   :vs/term_status      "accepted"})

(def ModerateLikelihood
  "Level where Likelihood is Moderate"
  {:db/ident :dpvo-risk/ModerateLikelihood,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Level where Likelihood is Moderate",
   :rdf/type [:dpvo-risk/|5LikelihoodLevels|
              :dpvo/Likelihood
              :dpvo-risk/|3LikelihoodLevels|
              :dpvo-risk/|7LikelihoodLevels|
              :owl/NamedIndividual],
   :rdf/value 0.5M,
   :rdfs/comment
   "The suggested quantitative value for this concept is 0.5 on a scale of 0 to 1",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Moderate Likelihood",
   :vs/term_status "accepted"})

(def ModerateRisk
  "Level where Risk is Moderate"
  {:db/ident :dpvo-risk/ModerateRisk,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Level where Risk is Moderate",
   :rdf/type [:dpvo-risk/|3RiskLevels|
              :dpvo-risk/|7RiskLevels|
              :dpvo/RiskLevel
              :owl/NamedIndividual
              :dpvo-risk/|5RiskLevels|],
   :rdf/value 0.5M,
   :rdfs/comment
   "The suggested quantitative value for this concept is 0.5 on a scale of 0 to 1",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Moderate Risk",
   :vs/term_status "accepted"})

(def ModerateSeverity
  "Level where Severity is Moderate"
  {:db/ident :dpvo-risk/ModerateSeverity,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Level where Severity is Moderate",
   :rdf/type [:dpvo/Severity
              :dpvo-risk/|5SeverityLevels|
              :dpvo-risk/|3SeverityLevels|
              :dpvo-risk/|7SeverityLevels|
              :owl/NamedIndividual],
   :rdf/value 0.5M,
   :rdfs/comment
   "The suggested quantitative value for this concept is 0.5 on a scale of 0 to 1",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Moderate Severity",
   :vs/term_status "accepted"})

(def MonitorConsequence
  "Risk Control that monitors a Risk Consequence"
  {:db/ident            :dpvo-risk/MonitorConsequence,
   :dcterms/created     #inst "2022-09-03T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Risk Control that monitors a Risk Consequence",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Monitor Consequence",
   :rdfs/subClassOf     [:dpvo-risk/ControlMonitors
                         :dpvo-risk/MonitorConsequence
                         :dpvo/RiskMitigationMeasure],
   :vs/term_status      "accepted"})

(def MonitorImpact
  "Risk Control that monitors a Risk Impact"
  {:db/ident            :dpvo-risk/MonitorImpact,
   :dcterms/created     #inst "2022-09-04T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Risk Control that monitors a Risk Impact",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Monitor Impact",
   :rdfs/subClassOf     [:dpvo-risk/ControlMonitors
                         :dpvo-risk/MonitorImpact
                         :dpvo/RiskMitigationMeasure],
   :vs/term_status      "accepted"})

(def MonitorRisk
  "Risk Control that monitors a Risk"
  {:db/ident            :dpvo-risk/MonitorRisk,
   :dcterms/created     #inst "2022-08-31T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Risk Control that monitors a Risk",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Monitor Risk",
   :rdfs/subClassOf     [:dpvo-risk/ControlMonitors
                         :dpvo-risk/MonitorRisk
                         :dpvo/RiskMitigationMeasure],
   :vs/term_status      "accepted"})

(def MonitorRiskControl
  "Risk Control that monitors another Risk Control"
  {:db/ident            :dpvo-risk/MonitorRiskControl,
   :dcterms/created     #inst "2022-09-05T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Risk Control that monitors another Risk Control",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Monitor Risk Control",
   :rdfs/subClassOf     [:dpvo-risk/ControlMonitors
                         :dpvo-risk/MonitorRiskControl
                         :dpvo/RiskMitigationMeasure],
   :vs/term_status      "accepted"})

(def MonitorRiskSource
  "Risk Control that monitors a Risk Source"
  {:db/ident            :dpvo-risk/MonitorRiskSource,
   :dcterms/created     #inst "2022-09-01T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Risk Control that monitors a Risk Source",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Monitor Risk Source",
   :rdfs/subClassOf     [:dpvo-risk/ControlMonitors
                         :dpvo-risk/MonitorRiskSource
                         :dpvo/RiskMitigationMeasure],
   :vs/term_status      "accepted"})

(def MonitorVulnerabilities
  "Risk Control that monitors a Risk Vulnerability"
  {:db/ident            :dpvo-risk/MonitorVulnerabilities,
   :dcterms/created     #inst "2022-09-02T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Risk Control that monitors a Risk Vulnerability",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Monitor Vulnerabilities",
   :rdfs/subClassOf     [:dpvo-risk/ControlMonitors
                         :dpvo-risk/MonitorVulnerabilities
                         :dpvo/RiskMitigationMeasure],
   :vs/term_status      "accepted"})

(def MonteCarloSimulation
  "Calculates the probability of outcomes by running multiple simulations using random variables."
  {:db/ident :dpvo-risk/MonteCarloSimulation,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Calculates the probability of outcomes by running multiple simulations using random variables.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Monte Carlo Simulation",
   :vs/term_status "accepted"})

(def NIST-SP-800-30
  "NIST 800-30 is a free guide that provides a foundation for the development of an effective risk management programme, containing both the definitions and the practical guidance necessary for assessing and mitigating risks identified within IT systems"
  {:db/ident :dpvo-risk/NIST-SP-800-30,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "NIST 800-30 is a free guide that provides a foundation for the development of an effective risk management programme, containing both the definitions and the practical guidance necessary for assessing and mitigating risks identified within IT systems",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/RiskManagementMethodology
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "NIST SP 800-30",
   :vs/term_status "accepted"})

(def NIST-SP-800-37
  "NIST SP 800-37 Rev. 2 is an asset-based RMF which comprises 7 steps, namely Prepare, Categorise, Select, Implement, Assess, Authorise and Monitor. It does not adopt a specific risk assessment methodology, although the NIST 800-30 guide is extensively referenced"
  {:db/ident :dpvo-risk/NIST-SP-800-37,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "NIST SP 800-37 Rev. 2 is an asset-based RMF which comprises 7 steps, namely Prepare, Categorise, Select, Implement, Assess, Authorise and Monitor. It does not adopt a specific risk assessment methodology, although the NIST 800-30 guide is extensively referenced",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "NIST SP 800-37",
   :vs/term_status "accepted"})

(def NIST-SP-800-39
  "The purpose of NIST SP 800-39 is to provide a structured, yet flexible approach for an integrated, enterprise-wide programme for managing the risk to information security of organisational operations (i.e. mission, functions, image, and reputation) and assets, individuals, other organisations etc. on an ongoing basis"
  {:db/ident :dpvo-risk/NIST-SP-800-39,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The purpose of NIST SP 800-39 is to provide a structured, yet flexible approach for an integrated, enterprise-wide programme for managing the risk to information security of organisational operations (i.e. mission, functions, image, and reputation) and assets, individuals, other organisations etc. on an ongoing basis",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "NIST SP 800–39",
   :vs/term_status "accepted"})

(def NIST-SP-800-82
  "NIST SP 800-82 Rev. 2 (Stouffer, et al., 2015), entitled ‘Guide to industrial control systems (ISC) security’, is an Industrial Control Systems Security Guide"
  {:db/ident :dpvo-risk/NIST-SP-800-82,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "NIST SP 800-82 Rev. 2 (Stouffer, et al., 2015), entitled ‘Guide to industrial control systems (ISC) security’, is an Industrial Control Systems Security Guide",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "NIST SP 800–82",
   :vs/term_status "accepted"})

(def NominalGroupTechnique
  "Technique for eliciting views from a group of people where initial participation is as individuals with no interaction, then group discussion of ideas follows."
  {:db/ident :dpvo-risk/NominalGroupTechnique,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Technique for eliciting views from a group of people where initial participation is as individuals with no interaction, then group discussion of ideas follows.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Nominal Group Technique",
   :vs/term_status "accepted"})

(def O-RA
  "The Open Group Standard for Risk Analysis (O-RA) provides a set of standards for various aspects of information security risk analysis that is based on the Open FAIR framework and can be applied to any risk scenario"
  {:db/ident :dpvo-risk/O-RA,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The Open Group Standard for Risk Analysis (O-RA) provides a set of standards for various aspects of information security risk analysis that is based on the Open FAIR framework and can be applied to any risk scenario",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "O-RA",
   :vs/term_status "accepted"})

(def OCTAVE
  "Operationally Critical Threat, Asset, and Vulnerability Evaluation (OCTAVE) is a free of charge approach to evaluations of information security risk that is comprehensive, systematic, context-driven, and self-directed"
  {:db/ident :dpvo-risk/OCTAVE,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Operationally Critical Threat, Asset, and Vulnerability Evaluation (OCTAVE) is a free of charge approach to evaluations of information security risk that is comprehensive, systematic, context-driven, and self-directed",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "OCTAVE",
   :vs/term_status "accepted"})

(def OCTAVE-ALLEGRO
  "OCTAVE Allegro is designed to allow broad assessment of an organisation’s operational risk environment, with the goal of producing robust results without the need for extensive knowledge of risk assessment"
  {:db/ident :dpvo-risk/OCTAVE-ALLEGRO,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "OCTAVE Allegro is designed to allow broad assessment of an organisation’s operational risk environment, with the goal of producing robust results without the need for extensive knowledge of risk assessment",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/RiskManagementMethodology
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "OCTAVE ALLEGRO",
   :vs/term_status "accepted"})

(def OCTAVE-FORTE
  "The OCTAVE FORTE process model was developed to support organisations in evaluating their security risks. It applies Enterprise Risk Management (ERM) principles to bridge the gap between executives and practitioners acting as decision makers"
  {:db/ident :dpvo-risk/OCTAVE-FORTE,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The OCTAVE FORTE process model was developed to support organisations in evaluating their security risks. It applies Enterprise Risk Management (ERM) principles to bridge the gap between executives and practitioners acting as decision makers",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "OCTAVE FORTE",
   :vs/term_status "accepted"})

(def OCTAVE-S
  "The OCTAVE-S is based on the OCTAVE approach and is a self-directed approach, meaning that people from an organisation assume responsibility for setting the organisation’s security strategy"
  {:db/ident :dpvo-risk/OCTAVE-S,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The OCTAVE-S is based on the OCTAVE approach and is a self-directed approach, meaning that people from an organisation assume responsibility for setting the organisation’s security strategy",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "OCTAVE-S",
   :vs/term_status "accepted"})

(def OrganisationDisruption
  ""
  {:db/ident            :dpvo-risk/OrganisationDisruption,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Organisation Disruption",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/OrganisationDisruption],
   :vs/term_status      "accepted"})

(def PIA
  "Analyses how incidents and events could affect a person's privacy and identifies and quantifies the capabilities that would be needed to manage it."
  {:db/ident :dpvo-risk/PIA,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Analyses how incidents and events could affect a person's privacy and identifies and quantifies the capabilities that would be needed to manage it.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Privacy Impact Analysis (PIA)",
   :vs/term_status "accepted"})

(def ParetoCharts
  "The Pareto principle (the 80–20 rule) states that, for many events, roughly 80 % of the effects come from 20 % of the causes."
  {:db/ident :dpvo-risk/ParetoCharts,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "The Pareto principle (the 80–20 rule) states that, for many events, roughly 80 % of the effects come from 20 % of the causes.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Pareto Charts",
   :vs/term_status "accepted"})

(def PersonalSafetyEndangerment
  ""
  {:db/ident            :dpvo-risk/PersonalSafetyEndangerment,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Personal Safety Endangerment",
   :rdfs/subClassOf     [:dpvo/Harm :dpvo-risk/PersonalSafetyEndangerment],
   :vs/term_status      "accepted"})

(def PersonnelAbsence
  ""
  {:db/ident :dpvo-risk/PersonnelAbsence,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Personnel Absence",
   :rdfs/subClassOf [:dpvo/NonMaterialDamage :dpvo-risk/PersonnelAbsence],
   :vs/term_status "accepted"})

(def PhishingScam
  "A type of social engineering attack involving deceptive messages intended to reveal sensitive information"
  {:db/ident :dpvo-risk/PhishingScam,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A type of social engineering attack involving deceptive messages intended to reveal sensitive information",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/enisa-threat-landscape-for-ransomware-attacks",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Phishing Scam",
   :rdfs/subClassOf [:dpvo/Harm :dpvo-risk/PhishingScam],
   :vs/term_status "accepted"})

(def PhysicalAssault
  ""
  {:db/ident            :dpvo-risk/PhysicalAssault,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Physical Assault",
   :rdfs/subClassOf     [:dpvo/Harm :dpvo-risk/PhysicalAssault],
   :vs/term_status      "accepted"})

(def PhysicalSpying
  ""
  {:db/ident            :dpvo-risk/PhysicalSpying,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Physical Spying",
   :rdfs/subClassOf     [:dpvo/NonMaterialDamage :dpvo-risk/PhysicalSpying],
   :vs/term_status      "accepted"})

(def PhysicalStalking
  ""
  {:db/ident            :dpvo-risk/PhysicalStalking,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Physical Stalking",
   :rdfs/subClassOf     [:dpvo/NonMaterialDamage :dpvo-risk/PhysicalStalking],
   :vs/term_status      "accepted"})

(def PreventExercisingOfRights
  ""
  {:db/ident            :dpvo-risk/PreventExercisingOfRights,
   :dcterms/created     #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description "",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Prevent Exercising of Rights",
   :rdfs/subClassOf     [:dpvo/Harm :dpvo-risk/PreventExercisingOfRights],
   :vs/term_status      "accepted"})

(def PrivacyImpact
  ""
  {:db/ident :dpvo-risk/PrivacyImpact,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Privacy impact",
   :rdfs/subClassOf [:dpvo/Impact :dpvo-risk/PrivacyImpact],
   :vs/term_status "accepted"})

(def PsychologicalHarm
  ""
  {:db/ident :dpvo-risk/PsychologicalHarm,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Psychological Harm",
   :rdfs/subClassOf [:dpvo/Harm :dpvo-risk/PsychologicalHarm],
   :vs/term_status "accepted"})

(def PublicOrderBreach
  ""
  {:db/ident            :dpvo-risk/PublicOrderBreach,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Public Order Breach",
   :rdfs/subClassOf     [:dpvo/Damage :dpvo-risk/PublicOrderBreach],
   :vs/term_status      "accepted"})

(def QualitativeRiskAssessmentTechnique
  "A risk assessment technique that uses qualitative methods"
  {:db/ident :dpvo-risk/QualitativeRiskAssessmentTechnique,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A risk assessment technique that uses qualitative methods",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Qualitative Risk Assessment Technique",
   :rdfs/subClassOf [:dpvo-risk/RiskAssessmentTechnique
                     :dpvo-risk/QualitativeRiskAssessmentTechnique
                     :dpvo/RiskManagementProcedure],
   :vs/term_status "accepted"})

(def QuantitativeRiskAssessmentTechnique
  "A risk assessment technique that uses quantitative methods"
  {:db/ident :dpvo-risk/QuantitativeRiskAssessmentTechnique,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A risk assessment technique that uses quantitative methods",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Quantitative Risk Assessment Technique",
   :rdfs/subClassOf [:dpvo-risk/RiskAssessmentTechnique
                     :dpvo-risk/QuantitativeRiskAssessmentTechnique
                     :dpvo/RiskManagementProcedure],
   :vs/term_status "accepted"})

(def RM3x3S1L1
  "Node in a 3x3 Risk Matrix with Risk Severity: Low; Likelihood: Low; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM3x3S1L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 3x3 Risk Matrix with Risk Severity: Low; Likelihood: Low; and Risk Level: Low",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix3x3 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.11M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Low Risk (RM3x3 S:1 L:1)",
   :vs/term_status "accepted"})

(def RM3x3S1L2
  "Node in a 3x3 Risk Matrix with Risk Severity: Low; Likelihood: Moderate; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM3x3S1L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 3x3 Risk Matrix with Risk Severity: Low; Likelihood: Moderate; and Risk Level: Low",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix3x3 :dpvo-risk/RiskMatrix],
   :rdf/value 0.22M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Low Risk (RM3x3 S:1 L:2)",
   :vs/term_status "accepted"})

(def RM3x3S1L3
  "Node in a 3x3 Risk Matrix with Risk Severity: Low; Likelihood: High; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM3x3S1L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 3x3 Risk Matrix with Risk Severity: Low; Likelihood: High; and Risk Level: Moderate",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix3x3 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.33M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Moderate Risk (RM3x3 S:1 L:3)",
   :vs/term_status "accepted"})

(def RM3x3S2L1
  "Node in a 3x3 Risk Matrix with Risk Severity: Moderate; Likelihood: Low; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM3x3S2L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 3x3 Risk Matrix with Risk Severity: Moderate; Likelihood: Low; and Risk Level: Low",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix3x3 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.22M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Low Risk (RM3x3 S:2 L:1)",
   :vs/term_status "accepted"})

(def RM3x3S2L2
  "Node in a 3x3 Risk Matrix with Risk Severity: Moderate; Likelihood: Moderate; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM3x3S2L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 3x3 Risk Matrix with Risk Severity: Moderate; Likelihood: Moderate; and Risk Level: Moderate",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix3x3 :dpvo-risk/RiskMatrix],
   :rdf/value 0.44M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Moderate Risk (RM3x3 S:2 L:2)",
   :vs/term_status "accepted"})

(def RM3x3S2L3
  "Node in a 3x3 Risk Matrix with Risk Severity: Moderate; Likelihood: High; and Risk Level: High"
  {:db/ident :dpvo-risk/RM3x3S2L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 3x3 Risk Matrix with Risk Severity: Moderate; Likelihood: High; and Risk Level: High",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix3x3 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.67M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "High Risk (RM3x3 S:2 L:3)",
   :vs/term_status "accepted"})

(def RM3x3S3L1
  "Node in a 3x3 Risk Matrix with Risk Severity: High; Likelihood: Low; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM3x3S3L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 3x3 Risk Matrix with Risk Severity: High; Likelihood: Low; and Risk Level: Moderate",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix3x3 :dpvo-risk/RiskMatrix],
   :rdf/value 0.33M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Moderate Risk (RM3x3 S:3 L:1)",
   :vs/term_status "accepted"})

(def RM3x3S3L2
  "Node in a 3x3 Risk Matrix with Risk Severity: High; Likelihood: Moderate; and Risk Level: High"
  {:db/ident :dpvo-risk/RM3x3S3L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 3x3 Risk Matrix with Risk Severity: High; Likelihood: Moderate; and Risk Level: High",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix3x3 :dpvo-risk/RiskMatrix],
   :rdf/value 0.67M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "High Risk (RM3x3 S:3 L:2)",
   :vs/term_status "accepted"})

(def RM3x3S3L3
  "Node in a 3x3 Risk Matrix with Risk Severity: High; Likelihood: High; and Risk Level: High"
  {:db/ident :dpvo-risk/RM3x3S3L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 3x3 Risk Matrix with Risk Severity: High; Likelihood: High; and Risk Level: High",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix3x3 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 1,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "High Risk (RM3x3 S:3 L:3)",
   :vs/term_status "accepted"})

(def RM5x5S1L1
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryLow; and Risk Level: VeryLow"
  {:db/ident :dpvo-risk/RM5x5S1L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryLow; and Risk Level: VeryLow",
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.04M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very Low Risk (RM5x5 S:1 L:1)",
   :vs/term_status "accepted"})

(def RM5x5S1L2
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: Low; and Risk Level: VeryLow"
  {:db/ident :dpvo-risk/RM5x5S1L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: Low; and Risk Level: VeryLow",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.08M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very Low Risk (RM5x5 S:1 L:2)",
   :vs/term_status "accepted"})

(def RM5x5S1L3
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: Moderate; and Risk Level: VeryLow"
  {:db/ident :dpvo-risk/RM5x5S1L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: Moderate; and Risk Level: VeryLow",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.12M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very Low Risk (RM5x5 S:1 L:3)",
   :vs/term_status "accepted"})

(def RM5x5S1L4
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: High; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM5x5S1L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: High; and Risk Level: Low",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.16M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Low Risk (RM5x5 S:1 L:4)",
   :vs/term_status "accepted"})

(def RM5x5S1L5
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryHigh; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM5x5S1L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryHigh; and Risk Level: Low",
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5 :dpvo-risk/RiskMatrix],
   :rdf/value 0.2M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Low Risk (RM5x5 S:1 L:5)",
   :vs/term_status "accepted"})

(def RM5x5S2L1
  "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: VeryLow; and Risk Level: VeryLow"
  {:db/ident :dpvo-risk/RM5x5S2L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: VeryLow; and Risk Level: VeryLow",
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5 :dpvo-risk/RiskMatrix],
   :rdf/value 0.08M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very Low Risk (RM5x5 S:2 L:1)",
   :vs/term_status "accepted"})

(def RM5x5S2L2
  "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: Low; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM5x5S2L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: Low; and Risk Level: Low",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5 :dpvo-risk/RiskMatrix],
   :rdf/value 0.16M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Low Risk (RM5x5 S:2 L:2)",
   :vs/term_status "accepted"})

(def RM5x5S2L3
  "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: Moderate; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM5x5S2L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: Moderate; and Risk Level: Moderate",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.24M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Moderate Risk (RM5x5 S:2 L:3)",
   :vs/term_status "accepted"})

(def RM5x5S2L4
  "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: High; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM5x5S2L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: High; and Risk Level: Moderate",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5 :dpvo-risk/RiskMatrix],
   :rdf/value 0.32M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Moderate Risk (RM5x5 S:2 L:4)",
   :vs/term_status "accepted"})

(def RM5x5S2L5
  "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: VeryHigh; and Risk Level: High"
  {:db/ident :dpvo-risk/RM5x5S2L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: VeryHigh; and Risk Level: High",
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5 :dpvo-risk/RiskMatrix],
   :rdf/value 0.4M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "High Risk (RM5x5 S:2 L:5)",
   :vs/term_status "accepted"})

(def RM5x5S3L1
  "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryLow; and Risk Level: VeryLow"
  {:db/ident :dpvo-risk/RM5x5S3L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryLow; and Risk Level: VeryLow",
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.12M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very Low Risk (RM5x5 S:3 L:1)",
   :vs/term_status "accepted"})

(def RM5x5S3L2
  "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: Low; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM5x5S3L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: Low; and Risk Level: Moderate",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5 :dpvo-risk/RiskMatrix],
   :rdf/value 0.24M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Moderate Risk (RM5x5 S:3 L:2)",
   :vs/term_status "accepted"})

(def RM5x5S3L3
  "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: Moderate; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM5x5S3L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: Moderate; and Risk Level: Moderate",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.36M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Moderate Risk (RM5x5 S:3 L:3)",
   :vs/term_status "accepted"})

(def RM5x5S3L4
  "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: High; and Risk Level: High"
  {:db/ident :dpvo-risk/RM5x5S3L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: High; and Risk Level: High",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.48M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "High Risk (RM5x5 S:3 L:4)",
   :vs/term_status "accepted"})

(def RM5x5S3L5
  "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryHigh; and Risk Level: VeryHigh"
  {:db/ident :dpvo-risk/RM5x5S3L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryHigh; and Risk Level: VeryHigh",
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.6M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very High Risk (RM5x5 S:3 L:5)",
   :vs/term_status "accepted"})

(def RM5x5S4L1
  "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: VeryLow; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM5x5S4L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: VeryLow; and Risk Level: Low",
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.16M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Low Risk (RM5x5 S:4 L:1)",
   :vs/term_status "accepted"})

(def RM5x5S4L2
  "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: Low; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM5x5S4L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: Low; and Risk Level: Moderate",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5 :dpvo-risk/RiskMatrix],
   :rdf/value 0.32M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Moderate Risk (RM5x5 S:4 L:2)",
   :vs/term_status "accepted"})

(def RM5x5S4L3
  "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: Moderate; and Risk Level: High"
  {:db/ident :dpvo-risk/RM5x5S4L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: Moderate; and Risk Level: High",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5 :dpvo-risk/RiskMatrix],
   :rdf/value 0.48M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "High Risk (RM5x5 S:4 L:3)",
   :vs/term_status "accepted"})

(def RM5x5S4L4
  "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: High; and Risk Level: VeryHigh"
  {:db/ident :dpvo-risk/RM5x5S4L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: High; and Risk Level: VeryHigh",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.64M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very High Risk (RM5x5 S:4 L:4)",
   :vs/term_status "accepted"})

(def RM5x5S4L5
  "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: VeryHigh; and Risk Level: VeryHigh"
  {:db/ident :dpvo-risk/RM5x5S4L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: VeryHigh; and Risk Level: VeryHigh",
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5 :dpvo-risk/RiskMatrix],
   :rdf/value 0.8M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very High Risk (RM5x5 S:4 L:5)",
   :vs/term_status "accepted"})

(def RM5x5S5L1
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryLow; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM5x5S5L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryLow; and Risk Level: Low",
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.2M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Low Risk (RM5x5 S:5 L:1)",
   :vs/term_status "accepted"})

(def RM5x5S5L2
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Low; and Risk Level: High"
  {:db/ident :dpvo-risk/RM5x5S5L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Low; and Risk Level: High",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5 :dpvo-risk/RiskMatrix],
   :rdf/value 0.4M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "High Risk (RM5x5 S:5 L:2)",
   :vs/term_status "accepted"})

(def RM5x5S5L3
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Moderate; and Risk Level: High"
  {:db/ident :dpvo-risk/RM5x5S5L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Moderate; and Risk Level: High",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.6M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "High Risk (RM5x5 S:5 L:3)",
   :vs/term_status "accepted"})

(def RM5x5S5L4
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: High; and Risk Level: VeryHigh"
  {:db/ident :dpvo-risk/RM5x5S5L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: High; and Risk Level: VeryHigh",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.8M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very High Risk (RM5x5 S:5 L:4)",
   :vs/term_status "accepted"})

(def RM5x5S5L5
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryHigh; and Risk Level: VeryHigh"
  {:db/ident :dpvo-risk/RM5x5S5L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryHigh; and Risk Level: VeryHigh",
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5 :dpvo-risk/RiskMatrix],
   :rdf/value 1,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very High Risk (RM5x5 S:5 L:5)",
   :vs/term_status "accepted"})

(def RM7x7S1L1
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow"
  {:db/ident :dpvo-risk/RM7x7S1L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value 0.02M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Extremely Low Risk (RM7x7 S:1 L:1)",
   :vs/term_status "accepted"})

(def RM7x7S1L2
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: VeryLow; and Risk Level: ExtremelyLow"
  {:db/ident :dpvo-risk/RM7x7S1L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: VeryLow; and Risk Level: ExtremelyLow",
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value 0.04M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Extremely Low Risk (RM7x7 S:1 L:2)",
   :vs/term_status "accepted"})

(def RM7x7S1L3
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: Low; and Risk Level: ExtremelyLow"
  {:db/ident :dpvo-risk/RM7x7S1L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: Low; and Risk Level: ExtremelyLow",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.06M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Extremely Low Risk (RM7x7 S:1 L:3)",
   :vs/term_status "accepted"})

(def RM7x7S1L4
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: Moderate; and Risk Level: VeryLow"
  {:db/ident :dpvo-risk/RM7x7S1L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: Moderate; and Risk Level: VeryLow",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value 0.08M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very Low Risk (RM7x7 S:1 L:4)",
   :vs/term_status "accepted"})

(def RM7x7S1L5
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: High; and Risk Level: VeryLow"
  {:db/ident :dpvo-risk/RM7x7S1L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: High; and Risk Level: VeryLow",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value 0.1M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very Low Risk (RM7x7 S:1 L:5)",
   :vs/term_status "accepted"})

(def RM7x7S1L6
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: VeryHigh; and Risk Level: VeryLow"
  {:db/ident :dpvo-risk/RM7x7S1L6,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: VeryHigh; and Risk Level: VeryLow",
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value 0.12M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very Low Risk (RM7x7 S:1 L:6)",
   :vs/term_status "accepted"})

(def RM7x7S1L7
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: ExtremelyHigh; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM7x7S1L7,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: ExtremelyHigh; and Risk Level: Low",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value 0.14M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Low Risk (RM7x7 S:1 L:7)",
   :vs/term_status "accepted"})

(def RM7x7S2L1
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow"
  {:db/ident :dpvo-risk/RM7x7S2L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value 0.04M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Extremely Low Risk (RM7x7 S:2 L:1)",
   :vs/term_status "accepted"})

(def RM7x7S2L2
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryLow; and Risk Level: ExtremelyLow"
  {:db/ident :dpvo-risk/RM7x7S2L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryLow; and Risk Level: ExtremelyLow",
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.08M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Extremely Low Risk (RM7x7 S:2 L:2)",
   :vs/term_status "accepted"})

(def RM7x7S2L3
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: Low; and Risk Level: VeryLow"
  {:db/ident :dpvo-risk/RM7x7S2L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: Low; and Risk Level: VeryLow",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.12M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very Low Risk (RM7x7 S:2 L:3)",
   :vs/term_status "accepted"})

(def RM7x7S2L4
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: Moderate; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM7x7S2L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: Moderate; and Risk Level: Low",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.16M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Low Risk (RM7x7 S:2 L:4)",
   :vs/term_status "accepted"})

(def RM7x7S2L5
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: High; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM7x7S2L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: High; and Risk Level: Low",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.2M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Low Risk (RM7x7 S:2 L:5)",
   :vs/term_status "accepted"})

(def RM7x7S2L6
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryHigh; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM7x7S2L6,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryHigh; and Risk Level: Moderate",
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.24M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Moderate Risk (RM7x7 S:2 L:6)",
   :vs/term_status "accepted"})

(def RM7x7S2L7
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: ExtremelyHigh; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM7x7S2L7,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: ExtremelyHigh; and Risk Level: Moderate",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.29M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Moderate Risk (RM7x7 S:2 L:7)",
   :vs/term_status "accepted"})

(def RM7x7S3L1
  "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow"
  {:db/ident :dpvo-risk/RM7x7S3L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.06M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Extremely Low Risk (RM7x7 S:3 L:1)",
   :vs/term_status "accepted"})

(def RM7x7S3L2
  "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: VeryLow; and Risk Level: VeryLow"
  {:db/ident :dpvo-risk/RM7x7S3L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: VeryLow; and Risk Level: VeryLow",
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.12M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very Low Risk (RM7x7 S:3 L:2)",
   :vs/term_status "accepted"})

(def RM7x7S3L3
  "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: Low; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM7x7S3L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: Low; and Risk Level: Low",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value 0.18M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Low Risk (RM7x7 S:3 L:3)",
   :vs/term_status "accepted"})

(def RM7x7S3L4
  "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: Moderate; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM7x7S3L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: Moderate; and Risk Level: Moderate",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value 0.24M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Moderate Risk (RM7x7 S:3 L:4)",
   :vs/term_status "accepted"})

(def RM7x7S3L5
  "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: High; and Risk Level: High"
  {:db/ident :dpvo-risk/RM7x7S3L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: High; and Risk Level: High",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.31M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "High Risk (RM7x7 S:3 L:5)",
   :vs/term_status "accepted"})

(def RM7x7S3L6
  "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: VeryHigh; and Risk Level: High"
  {:db/ident :dpvo-risk/RM7x7S3L6,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: VeryHigh; and Risk Level: High",
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.37M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "High Risk (RM7x7 S:3 L:6)",
   :vs/term_status "accepted"})

(def RM7x7S3L7
  "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: ExtremelyHigh; and Risk Level: VeryHigh"
  {:db/ident :dpvo-risk/RM7x7S3L7,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: ExtremelyHigh; and Risk Level: VeryHigh",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.43M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very High Risk (RM7x7 S:3 L:7)",
   :vs/term_status "accepted"})

(def RM7x7S4L1
  "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow"
  {:db/ident :dpvo-risk/RM7x7S4L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.08M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Extremely Low Risk (RM7x7 S:4 L:1)",
   :vs/term_status "accepted"})

(def RM7x7S4L2
  "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryLow; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM7x7S4L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryLow; and Risk Level: Low",
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value 0.16M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Low Risk (RM7x7 S:4 L:2)",
   :vs/term_status "accepted"})

(def RM7x7S4L3
  "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: Low; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM7x7S4L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: Low; and Risk Level: Moderate",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value 0.24M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Moderate Risk (RM7x7 S:4 L:3)",
   :vs/term_status "accepted"})

(def RM7x7S4L4
  "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: Moderate; and Risk Level: High"
  {:db/ident :dpvo-risk/RM7x7S4L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: Moderate; and Risk Level: High",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value 0.33M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "High Risk (RM7x7 S:4 L:4)",
   :vs/term_status "accepted"})

(def RM7x7S4L5
  "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: High; and Risk Level: High"
  {:db/ident :dpvo-risk/RM7x7S4L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: High; and Risk Level: High",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.41M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "High Risk (RM7x7 S:4 L:5)",
   :vs/term_status "accepted"})

(def RM7x7S4L6
  "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryHigh; and Risk Level: VeryHigh"
  {:db/ident :dpvo-risk/RM7x7S4L6,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryHigh; and Risk Level: VeryHigh",
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value 0.49M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very High Risk (RM7x7 S:4 L:6)",
   :vs/term_status "accepted"})

(def RM7x7S4L7
  "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: ExtremelyHigh; and Risk Level: VeryHigh"
  {:db/ident :dpvo-risk/RM7x7S4L7,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: ExtremelyHigh; and Risk Level: VeryHigh",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.57M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very High Risk (RM7x7 S:4 L:7)",
   :vs/term_status "accepted"})

(def RM7x7S5L1
  "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: ExtremelyLow; and Risk Level: VeryLow"
  {:db/ident :dpvo-risk/RM7x7S5L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: ExtremelyLow; and Risk Level: VeryLow",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.1M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very Low Risk (RM7x7 S:5 L:1)",
   :vs/term_status "accepted"})

(def RM7x7S5L2
  "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: VeryLow; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM7x7S5L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: VeryLow; and Risk Level: Low",
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.2M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Low Risk (RM7x7 S:5 L:2)",
   :vs/term_status "accepted"})

(def RM7x7S5L3
  "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: Low; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM7x7S5L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: Low; and Risk Level: Moderate",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value 0.31M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Moderate Risk (RM7x7 S:5 L:3)",
   :vs/term_status "accepted"})

(def RM7x7S5L4
  "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: Moderate; and Risk Level: High"
  {:db/ident :dpvo-risk/RM7x7S5L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: Moderate; and Risk Level: High",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value 0.41M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "High Risk (RM7x7 S:5 L:4)",
   :vs/term_status "accepted"})

(def RM7x7S5L5
  "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: High; and Risk Level: VeryHigh"
  {:db/ident :dpvo-risk/RM7x7S5L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: High; and Risk Level: VeryHigh",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.51M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very High Risk (RM7x7 S:5 L:5)",
   :vs/term_status "accepted"})

(def RM7x7S5L6
  "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: VeryHigh; and Risk Level: ExtremelyHigh"
  {:db/ident :dpvo-risk/RM7x7S5L6,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: VeryHigh; and Risk Level: ExtremelyHigh",
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.61M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Extremely High Risk (RM7x7 S:5 L:6)",
   :vs/term_status "accepted"})

(def RM7x7S5L7
  "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: ExtremelyHigh; and Risk Level: ExtremelyHigh"
  {:db/ident :dpvo-risk/RM7x7S5L7,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: ExtremelyHigh; and Risk Level: ExtremelyHigh",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.71M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Extremely High Risk (RM7x7 S:5 L:7)",
   :vs/term_status "accepted"})

(def RM7x7S6L1
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: ExtremelyLow; and Risk Level: VeryLow"
  {:db/ident :dpvo-risk/RM7x7S6L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: ExtremelyLow; and Risk Level: VeryLow",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.12M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very Low Risk (RM7x7 S:6 L:1)",
   :vs/term_status "accepted"})

(def RM7x7S6L2
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryLow; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM7x7S6L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryLow; and Risk Level: Moderate",
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value 0.24M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Moderate Risk (RM7x7 S:6 L:2)",
   :vs/term_status "accepted"})

(def RM7x7S6L3
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Low; and Risk Level: High"
  {:db/ident :dpvo-risk/RM7x7S6L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Low; and Risk Level: High",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value 0.37M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "High Risk (RM7x7 S:6 L:3)",
   :vs/term_status "accepted"})

(def RM7x7S6L4
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Moderate; and Risk Level: VeryHigh"
  {:db/ident :dpvo-risk/RM7x7S6L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Moderate; and Risk Level: VeryHigh",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.49M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very High Risk (RM7x7 S:6 L:4)",
   :vs/term_status "accepted"})

(def RM7x7S6L5
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: High; and Risk Level: VeryHigh"
  {:db/ident :dpvo-risk/RM7x7S6L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: High; and Risk Level: VeryHigh",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value 0.61M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very High Risk (RM7x7 S:6 L:5)",
   :vs/term_status "accepted"})

(def RM7x7S6L6
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryHigh; and Risk Level: ExtremelyHigh"
  {:db/ident :dpvo-risk/RM7x7S6L6,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryHigh; and Risk Level: ExtremelyHigh",
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value 0.73M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Extremely High Risk (RM7x7 S:6 L:6)",
   :vs/term_status "accepted"})

(def RM7x7S6L7
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: ExtremelyHigh; and Risk Level: ExtremelyHigh"
  {:db/ident :dpvo-risk/RM7x7S6L7,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: ExtremelyHigh; and Risk Level: ExtremelyHigh",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value 0.86M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Extremely High Risk (RM7x7 S:6 L:7)",
   :vs/term_status "accepted"})

(def RM7x7S7L1
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: ExtremelyLow; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM7x7S7L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: ExtremelyLow; and Risk Level: Low",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value 0.14M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Low Risk (RM7x7 S:7 L:1)",
   :vs/term_status "accepted"})

(def RM7x7S7L2
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: VeryLow; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM7x7S7L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: VeryLow; and Risk Level: Moderate",
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value 0.29M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Moderate Risk (RM7x7 S:7 L:2)",
   :vs/term_status "accepted"})

(def RM7x7S7L3
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: Low; and Risk Level: High"
  {:db/ident :dpvo-risk/RM7x7S7L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: Low; and Risk Level: High",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value 0.43M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "High Risk (RM7x7 S:7 L:3)",
   :vs/term_status "accepted"})

(def RM7x7S7L4
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: Moderate; and Risk Level: VeryHigh"
  {:db/ident :dpvo-risk/RM7x7S7L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: Moderate; and Risk Level: VeryHigh",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value 0.57M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very High Risk (RM7x7 S:7 L:4)",
   :vs/term_status "accepted"})

(def RM7x7S7L5
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: High; and Risk Level: ExtremelyHigh"
  {:db/ident :dpvo-risk/RM7x7S7L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: High; and Risk Level: ExtremelyHigh",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value 0.71M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Extremely High Risk (RM7x7 S:7 L:5)",
   :vs/term_status "accepted"})

(def RM7x7S7L6
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: VeryHigh; and Risk Level: ExtremelyHigh"
  {:db/ident :dpvo-risk/RM7x7S7L6,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: VeryHigh; and Risk Level: ExtremelyHigh",
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value 0.86M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Extremely High Risk (RM7x7 S:7 L:6)",
   :vs/term_status "accepted"})

(def RM7x7S7L7
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: ExtremelyHigh; and Risk Level: ExtremelyHigh"
  {:db/ident :dpvo-risk/RM7x7S7L7,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: ExtremelyHigh; and Risk Level: ExtremelyHigh",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value 1,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Extremely High Risk (RM7x7 S:7 L:7)",
   :vs/term_status "accepted"})

(def RansomwareAttack
  "Ransomware is a type of attack where threat actors take control of a target’s assets and demand a ransom in exchange for the return of the asset’s availability and confidentiality"
  {:db/ident :dpvo-risk/RansomwareAttack,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Ransomware is a type of attack where threat actors take control of a target’s assets and demand a ransom in exchange for the return of the asset’s availability and confidentiality",
   :dcterms/source
   ["https://www.enisa.europa.eu/publications/enisa-threat-landscape-for-ransomware-attacks"
    "https://www.iso.org/standard/75281.html"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "RansomwareAttack",
   :rdfs/subClassOf [:dpvo/NonMaterialDamage :dpvo-risk/RansomwareAttack],
   :vs/term_status "accepted"})

(def ReduceLikelihood
  "Risk Control that reduces the likelihood of an event"
  {:db/ident            :dpvo-risk/ReduceLikelihood,
   :dcterms/created     #inst "2022-08-22T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Risk Control that reduces the likelihood of an event",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Reduce Likelihood",
   :rdfs/subClassOf     [:dpvo/RiskMitigationMeasure
                         :dpvo-risk/ReduceLikelihood],
   :vs/term_status      "accepted"})

(def ReduceSeverity
  "Risk Control that reduces the severity of an event"
  {:db/ident            :dpvo-risk/ReduceSeverity,
   :dcterms/created     #inst "2022-08-23T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Risk Control that reduces the severity of an event",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Reduce Severity",
   :rdfs/subClassOf     [:dpvo/RiskMitigationMeasure :dpvo-risk/ReduceSeverity],
   :vs/term_status      "accepted"})

(def ReliabilityCentredMaintenance
  "A risk based assessment used to identify the appropriate maintenance tasks for a system and its components."
  {:db/ident :dpvo-risk/ReliabilityCentredMaintenance,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A risk based assessment used to identify the appropriate maintenance tasks for a system and its components.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Reliability Centred Maintenance",
   :vs/term_status "accepted"})

(def RemoteSpying
  ""
  {:db/ident            :dpvo-risk/RemoteSpying,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Remote Spying",
   :rdfs/subClassOf     [:dpvo/NonMaterialDamage :dpvo-risk/RemoteSpying],
   :vs/term_status      "accepted"})

(def RemoveConsequence
  "Risk Control that removes Consequence i.e. prevents it from materialising"
  {:db/ident :dpvo-risk/RemoveConsequence,
   :dcterms/created #inst "2022-08-27T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Risk Control that removes Consequence i.e. prevents it from materialising",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Remove Consequence",
   :rdfs/subClassOf [:dpvo-risk/ControlConsequence
                     :dpvo-risk/RemoveConsequence
                     :dpvo/RiskMitigationMeasure],
   :vs/term_status "accepted"})

(def RemoveImpact
  "Risk Control that removes Impact i.e. prevents it from materialising"
  {:db/ident :dpvo-risk/RemoveImpact,
   :dcterms/created #inst "2022-08-28T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Risk Control that removes Impact i.e. prevents it from materialising",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Remove Impact",
   :rdfs/subClassOf [:dpvo-risk/ControlConsequence
                     :dpvo-risk/RemoveImpact
                     :dpvo/RiskMitigationMeasure],
   :vs/term_status "accepted"})

(def RemoveSource
  "Risk Control that removes the risk source"
  {:db/ident            :dpvo-risk/RemoveSource,
   :dcterms/created     #inst "2022-08-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Risk Control that removes the risk source",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Remove Source",
   :rdfs/subClassOf     [:dpvo-risk/ControlRiskSource
                         :dpvo-risk/RemoveSource
                         :dpvo/RiskMitigationMeasure],
   :vs/term_status      "accepted"})

(def ReplacementCosts
  ""
  {:db/ident            :dpvo-risk/ReplacementCosts,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Replacement Costs",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/ReplacementCosts],
   :vs/term_status      "accepted"})

(def ReputationTrustImpact
  ""
  {:db/ident :dpvo-risk/ReputationTrustImpact,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Reputation and trust impact",
   :rdfs/subClassOf [:dpvo/Impact :dpvo-risk/ReputationTrustImpact],
   :vs/term_status "accepted"})

(def RetrievalDeletedData
  ""
  {:db/ident            :dpvo-risk/RetrievalDeletedData,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Retrieval of Deleted Data",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/RetrievalDeletedData],
   :vs/term_status      "accepted"})

(def RetrievalDiscardedEquipment
  ""
  {:db/ident            :dpvo-risk/RetrievalDiscardedEquipment,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Retrieval of Discarded Equipment",
   :rdfs/subClassOf     [:dpvo/Detriment
                         :dpvo-risk/RetrievalDiscardedEquipment],
   :vs/term_status      "accepted"})

(def RiskAssessmentTechnique
  "A technique or method used to analyse and identify risk levels, sources, likelihoods, severities, and other necessary information required to conduct risk management procedures"
  {:db/ident :dpvo-risk/RiskAssessmentTechnique,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A technique or method used to analyse and identify risk levels, sources, likelihoods, severities, and other necessary information required to conduct risk management procedures",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Risk Assessment Technique",
   :rdfs/subClassOf [:dpvo/RiskManagementProcedure
                     :dpvo-risk/RiskAssessmentTechnique],
   :vs/term_status "accepted"})

(def RiskIndices
  "Rates the significance of risks based on ratings applied to factors which are believed to influence the magnitude of the risk."
  {:db/ident :dpvo-risk/RiskIndices,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Rates the significance of risks based on ratings applied to factors which are believed to influence the magnitude of the risk.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Risk Indices",
   :vs/term_status "accepted"})

(def RiskManagementMethodology
  "A risk management framework or methodology addresses the main functional components related to identification, assessment, treatment, and monitoring regarding risks"
  {:db/ident :dpvo-risk/RiskManagementMethodology,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A risk management framework or methodology addresses the main functional components related to identification, assessment, treatment, and monitoring regarding risks",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Risk Management Methodology",
   :rdfs/subClassOf [:dpvo/RiskManagementProcedure
                     :dpvo-risk/RiskManagementMethodology],
   :vs/term_status "accepted"})

(def RiskMatrix
  "Compares individual risks by selecting a consequence/ likelihood pair and displaying them on a matrix with consequence on one axis and likelihood on the other."
  {:db/ident :dpvo-risk/RiskMatrix,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Compares individual risks by selecting a consequence/ likelihood pair and displaying them on a matrix with consequence on one axis and likelihood on the other.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Risk Matrix",
   :rdfs/subClassOf :dpvo-risk/RiskMatrix,
   :vs/term_status "accepted"})

(def RiskMatrix3x3
  "A Risk Matrix with 3 Likelihood, 3 Severity, and 3 Risk Level types"
  {:db/ident :dpvo-risk/RiskMatrix3x3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A Risk Matrix with 3 Likelihood, 3 Severity, and 3 Risk Level types",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Risk Matrix 3x3",
   :rdfs/subClassOf [:dpvo-risk/RiskMatrix :dpvo-risk/RiskMatrix3x3],
   :vs/term_status "accepted"})

(def RiskMatrix5x5
  "A Risk Matrix with 5 Likelihood, 5 Severity, and 5 Risk Level types"
  {:db/ident :dpvo-risk/RiskMatrix5x5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A Risk Matrix with 5 Likelihood, 5 Severity, and 5 Risk Level types",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Risk Matrix 5x5",
   :rdfs/subClassOf [:dpvo-risk/RiskMatrix :dpvo-risk/RiskMatrix5x5],
   :vs/term_status "accepted"})

(def RiskMatrix7x7
  "A Risk Matrix with 7 Likelihood, 7 Severity, and 7 Risk Level types"
  {:db/ident :dpvo-risk/RiskMatrix7x7,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A Risk Matrix with 7 Likelihood, 7 Severity, and 7 Risk Level types",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Risk Matrix 7x7",
   :rdfs/subClassOf [:dpvo-risk/RiskMatrix :dpvo-risk/RiskMatrix7x7],
   :vs/term_status "accepted"})

(def RiskRegisters
  "A means of recording information about risks and tracking actions."
  {:db/ident :dpvo-risk/RiskRegisters,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A means of recording information about risks and tracking actions.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Risk Registers",
   :vs/term_status "accepted"})

(def SCurves
  "A means of displaying the relationship between consequences and their likelihood plotted as a cumulative distribution function (S-curve)."
  {:db/ident :dpvo-risk/SCurves,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A means of displaying the relationship between consequences and their likelihood plotted as a cumulative distribution function (S-curve).",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "S-curves",
   :vs/term_status "accepted"})

(def SFAIRP
  "So far as is Resonably Practiceable (ALARP) - A criteria for deciding significance of risk and means of evaluating tolerability of risk"
  {:db/ident :dpvo-risk/SFAIRP,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "So far as is Resonably Practiceable (ALARP) - A criteria for deciding significance of risk and means of evaluating tolerability of risk",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "SFAIRP",
   :vs/term_status "accepted"})

(def SWIFT
  "A simpler form of HAZOP with prompts of \"what if\" to identify deviations from the expected."
  {:db/ident :dpvo-risk/SWIFT,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A simpler form of HAZOP with prompts of \"what if\" to identify deviations from the expected.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Structured \"What If?\" (SWIFT)",
   :vs/term_status "accepted"})

(def Sabotage
  ""
  {:db/ident :dpvo-risk/Sabotage,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Sabotage",
   :rdfs/subClassOf [:dpvo/Harm :dpvo-risk/Sabotage],
   :vs/term_status "accepted"})

(def Scam
  ""
  {:db/ident            :dpvo-risk/Scam,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Scam",
   :rdfs/subClassOf     [:dpvo/Harm :dpvo-risk/Scam],
   :vs/term_status      "accepted"})

(def ScenarioAnalysis
  "Identifies possible future scenarios through imagination, extrapolation from the present or modelling. Risk is then considered for each of these scenarios."
  {:db/ident :dpvo-risk/ScenarioAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Identifies possible future scenarios through imagination, extrapolation from the present or modelling. Risk is then considered for each of these scenarios.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Scenario Analysis",
   :vs/term_status "accepted"})

(def SecurityBreach
  ""
  {:db/ident            :dpvo-risk/SecurityBreach,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Security Breach",
   :rdfs/subClassOf     [:dpvo/Consequence :dpvo-risk/SecurityBreach],
   :vs/term_status      "accepted"})

(def ServiceInterruption
  ""
  {:db/ident            :dpvo-risk/ServiceInterruption,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Service Interruption",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/ServiceInterruption],
   :vs/term_status      "accepted"})

(def SexualViolence
  ""
  {:db/ident :dpvo-risk/SexualViolence,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Sexual Violence",
   :rdfs/subClassOf [:dpvo/Harm :dpvo-risk/SexualViolence],
   :vs/term_status "accepted"})

(def ShareRisk
  "Risk Mitigation Measure that shares Risk e.g. amongst stakeholders"
  {:db/ident :dpvo-risk/ShareRisk,
   :dcterms/created #inst "2022-08-29T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Risk Mitigation Measure that shares Risk e.g. amongst stakeholders",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Share Risk",
   :rdfs/subClassOf [:dpvo/RiskMitigationMeasure :dpvo-risk/ShareRisk],
   :vs/term_status "accepted"})

(def SocialDisadvantage
  ""
  {:db/ident            :dpvo-risk/SocialDisadvantage,
   :dcterms/created     #inst "2022-08-19T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description "",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Social Disadvantage",
   :rdfs/subClassOf     [:dpvo/Impact :dpvo-risk/SocialDisadvantage],
   :vs/term_status      "accepted"})

(def Spam
  ""
  {:db/ident :dpvo-risk/Spam,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Spam",
   :rdfs/subClassOf [:dpvo/Harm :dpvo-risk/Spam],
   :vs/term_status "accepted"})

(def Spoofing
  ""
  {:db/ident            :dpvo-risk/Spoofing,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Spoofing",
   :rdfs/subClassOf     [:dpvo/Harm :dpvo-risk/Spoofing],
   :vs/term_status      "accepted"})

(def Spying
  ""
  {:db/ident            :dpvo-risk/Spying,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Spying",
   :rdfs/subClassOf     [:dpvo/NonMaterialDamage :dpvo-risk/Spying],
   :vs/term_status      "accepted"})

(def Stalking
  ""
  {:db/ident            :dpvo-risk/Stalking,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Stalking",
   :rdfs/subClassOf     [:dpvo/NonMaterialDamage :dpvo-risk/Stalking],
   :vs/term_status      "accepted"})

(def Surveys
  "Paper- or computer-based questionnaires to elicit views."
  {:db/ident :dpvo-risk/Surveys,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Paper- or computer-based questionnaires to elicit views.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Surveys",
   :vs/term_status "accepted"})

(def SystemFailure
  ""
  {:db/ident :dpvo-risk/SystemFailure,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/enisa-threat-landscape-for-ransomware-attacks",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "System Failure",
   :rdfs/subClassOf [:dpvo/Detriment :dpvo-risk/SystemFailure],
   :vs/term_status "accepted"})

(def SystemIntrusion
  ""
  {:db/ident :dpvo-risk/SystemIntrusion,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "System Intrusion",
   :rdfs/subClassOf [:dpvo/Detriment :dpvo-risk/SystemIntrusion],
   :vs/term_status "accepted"})

(def SystemMalfunction
  ""
  {:db/ident            :dpvo-risk/SystemMalfunction,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "System Malfunction",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/SystemMalfunction],
   :vs/term_status      "accepted"})

(def Taxonomies
  "A taxonomy based on experience or on concepts and models that can be used to help identify risks or controls."
  {:db/ident :dpvo-risk/Taxonomies,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A taxonomy based on experience or on concepts and models that can be used to help identify risks or controls.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Taxonomies",
   :vs/term_status "accepted"})

(def Terrorism
  ""
  {:db/ident            :dpvo-risk/Terrorism,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Terrorism",
   :rdfs/subClassOf     [:dpvo/Harm :dpvo-risk/Terrorism],
   :vs/term_status      "accepted"})

(def Theft
  ""
  {:db/ident            :dpvo-risk/Theft,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Theft",
   :rdfs/subClassOf     [:dpvo/MaterialDamage :dpvo-risk/Theft],
   :vs/term_status      "accepted"})

(def TheftEquipment
  ""
  {:db/ident            :dpvo-risk/TheftEquipment,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Theft of Equipment",
   :rdfs/subClassOf     [:dpvo/MaterialDamage :dpvo-risk/TheftEquipment],
   :vs/term_status      "accepted"})

(def TheftMedia
  ""
  {:db/ident            :dpvo-risk/TheftMedia,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Theft of Media",
   :rdfs/subClassOf     [:dpvo/MaterialDamage :dpvo-risk/TheftMedia],
   :vs/term_status      "accepted"})

(def ThirdPartyOperationDisruption
  ""
  {:db/ident            :dpvo-risk/ThirdPartyOperationDisruption,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Third Party Operation Disruption",
   :rdfs/subClassOf     [:dpvo/Detriment
                         :dpvo-risk/ThirdPartyOperationDisruption],
   :vs/term_status      "accepted"})

(def Toxicological
  "A series of steps taken to obtain a measure for the risk to humans or ecological systems due to exposure to chemicals."
  {:db/ident :dpvo-risk/Toxicological,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "A series of steps taken to obtain a measure for the risk to humans or ecological systems due to exposure to chemicals.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Toxicological Risk Assessment",
   :vs/term_status "accepted"})

(def UnauthorisedAccesstoPremises
  ""
  {:db/ident            :dpvo-risk/UnauthorisedAccesstoPremises,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Unauthorised Access to Premises",
   :rdfs/subClassOf     [:dpvo/Detriment
                         :dpvo-risk/UnauthorisedAccesstoPremises],
   :vs/term_status      "accepted"})

(def UnauthorisedCodeAccess
  ""
  {:db/ident :dpvo-risk/UnauthorisedCodeAccess,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Unauthorised Code Access",
   :rdfs/subClassOf [:dpvo/Detriment :dpvo-risk/UnauthorisedCodeAccess],
   :vs/term_status "accepted"})

(def UnauthorisedCodeDisclosure
  ""
  {:db/ident :dpvo-risk/UnauthorisedCodeDisclosure,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Unauthorised Code Disclosure",
   :rdfs/subClassOf [:dpvo/Detriment :dpvo-risk/UnauthorisedCodeDisclosure],
   :vs/term_status "accepted"})

(def UnauthorisedCodeModification
  ""
  {:db/ident :dpvo-risk/UnauthorisedCodeModification,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Unauthorised Code Modification",
   :rdfs/subClassOf [:dpvo/Damage :dpvo-risk/UnauthorisedCodeModification],
   :vs/term_status "accepted"})

(def UnauthorisedDataAccess
  ""
  {:db/ident :dpvo-risk/UnauthorisedDataAccess,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Unauthorised Data Access",
   :rdfs/subClassOf [:dpvo/Detriment :dpvo-risk/UnauthorisedDataAccess],
   :vs/term_status "accepted"})

(def UnauthorisedDataDisclosure
  ""
  {:db/ident            :dpvo-risk/UnauthorisedDataDisclosure,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Unauthorised Data Disclosure",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/UnauthorisedDataDisclosure],
   :vs/term_status      "accepted"})

(def UnauthorisedDataModification
  ""
  {:db/ident :dpvo-risk/UnauthorisedDataModification,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Unauthorised Data Modification",
   :rdfs/subClassOf [:dpvo/NonMaterialDamage
                     :dpvo-risk/UnauthorisedDataModification],
   :vs/term_status "accepted"})

(def UnauthorisedImpersonation
  ""
  {:db/ident            :dpvo-risk/UnauthorisedImpersonation,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Unauthorised Impersonation",
   :rdfs/subClassOf     [:dpvo/NonMaterialDamage
                         :dpvo-risk/UnauthorisedImpersonation],
   :vs/term_status      "accepted"})

(def UnauthorisedInformationDisclosure
  ""
  {:db/ident :dpvo-risk/UnauthorisedInformationDisclosure,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Unauthorised Information Disclosure",
   :rdfs/subClassOf [:dpvo/Detriment
                     :dpvo-risk/UnauthorisedInformationDisclosure],
   :vs/term_status "accepted"})

(def UnauthorisedReIdentification
  ""
  {:db/ident            :dpvo-risk/UnauthorisedReIdentification,
   :dcterms/created     #inst "2022-08-19T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description "",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Unauthorised Re-Identification",
   :rdfs/subClassOf     [:dpvo/Consequence
                         :dpvo-risk/UnauthorisedReIdentification],
   :vs/term_status      "accepted"})

(def UnauthorisedResourceUse
  ""
  {:db/ident            :dpvo-risk/UnauthorisedResourceUse,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Unauthorised Resource Use",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/UnauthorisedResourceUse],
   :vs/term_status      "accepted"})

(def UnauthorisedSystemAccess
  ""
  {:db/ident            :dpvo-risk/UnauthorisedSystemAccess,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Unauthorised System Access",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/UnauthorisedSystemAccess],
   :vs/term_status      "accepted"})

(def UnauthorisedSystemModification
  ""
  {:db/ident :dpvo-risk/UnauthorisedSystemModification,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Unauthorised System Modification",
   :rdfs/subClassOf [:dpvo/Damage :dpvo-risk/UnauthorisedSystemModification],
   :vs/term_status "accepted"})

(def UnknownVulnerabilityExploited
  ""
  {:db/ident :dpvo-risk/UnknownVulnerabilityExploited,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Unknown Vulnerability Exploited",
   :rdfs/subClassOf [:dpvo/Detriment :dpvo-risk/UnknownVulnerabilityExploited],
   :vs/term_status "accepted"})

(def UnwantedCodeDeletion
  ""
  {:db/ident :dpvo-risk/UnwantedCodeDeletion,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Unwanted Code Deletion",
   :rdfs/subClassOf [:dpvo/Damage :dpvo-risk/UnwantedCodeDeletion],
   :vs/term_status "accepted"})

(def UnwantedDataDeletion
  ""
  {:db/ident            :dpvo-risk/UnwantedDataDeletion,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Unwanted Data Deletion",
   :rdfs/subClassOf     [:dpvo/Damage :dpvo-risk/UnwantedDataDeletion],
   :vs/term_status      "accepted"})

(def UnwantedDisclosureData
  ""
  {:db/ident            :dpvo-risk/UnwantedDisclosureData,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Unwanted Disclosure of Data",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/UnwantedDisclosureData],
   :vs/term_status      "accepted"})

(def VaR
  "Financial measure of risk that uses an assumed probability distribution of losses in a stable market condition to calculate the value of a loss that might occur with a specified probability within a defined time span."
  {:db/ident :dpvo-risk/VaR,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Financial measure of risk that uses an assumed probability distribution of losses in a stable market condition to calculate the value of a loss that might occur with a specified probability within a defined time span.",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcedure],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Value At Risk (VaR)",
   :vs/term_status "accepted"})

(def Vandalism
  ""
  {:db/ident :dpvo-risk/Vandalism,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Vandalism",
   :rdfs/subClassOf [:dpvo/Damage :dpvo-risk/Vandalism],
   :vs/term_status "accepted"})

(def VeryHighLikelihood
  "Level where Likelihood is Very High"
  {:db/ident :dpvo-risk/VeryHighLikelihood,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Level where Likelihood is Very High",
   :rdf/type [:dpvo-risk/|7LikelihoodLevels|
              :dpvo-risk/|5LikelihoodLevels|
              :owl/NamedIndividual
              :dpvo/Likelihood],
   :rdf/value 0.9M,
   :rdfs/comment
   "The suggested quantitative value for this concept is 0.9 on a scale of 0 to 1",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very High Likelihood",
   :vs/term_status "accepted"})

(def VeryHighRisk
  "Level where Risk is Very High"
  {:db/ident :dpvo-risk/VeryHighRisk,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Level where Risk is Very High",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/|7RiskLevels|
              :dpvo/RiskLevel
              :dpvo-risk/|5RiskLevels|],
   :rdf/value 0.9M,
   :rdfs/comment
   "The suggested quantitative value for this concept is 0.9 on a scale of 0 to 1",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very High Risk",
   :vs/term_status "accepted"})

(def VeryHighSeverity
  "Level where Severity is Very High"
  {:db/ident :dpvo-risk/VeryHighSeverity,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Level where Severity is Very High",
   :rdf/type [:dpvo-risk/|7SeverityLevels|
              :dpvo/Severity
              :dpvo-risk/|5SeverityLevels|
              :owl/NamedIndividual],
   :rdf/value 0.9M,
   :rdfs/comment
   "The suggested quantitative value for this concept is 0.9 on a scale of 0 to 1",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very High Severity",
   :vs/term_status "accepted"})

(def VeryLowLikelihood
  "Level where Likelihood is Very Low"
  {:db/ident :dpvo-risk/VeryLowLikelihood,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Level where Likelihood is Very Low",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/|7LikelihoodLevels|
              :dpvo-risk/|5LikelihoodLevels|
              :dpvo/Likelihood],
   :rdf/value 0.1M,
   :rdfs/comment
   "The suggested quantitative value for this concept is 0.1 on a scale of 0 to 1",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very Low Likelihood",
   :vs/term_status "accepted"})

(def VeryLowRisk
  "Level where Risk is Very Low"
  {:db/ident :dpvo-risk/VeryLowRisk,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Level where Risk is Very Low",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/|7RiskLevels|
              :dpvo/RiskLevel
              :dpvo-risk/|5RiskLevels|],
   :rdf/value 0.1M,
   :rdfs/comment
   "The suggested quantitative value for this concept is 0.1 on a scale of 0 to 1",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very Low Risk",
   :vs/term_status "accepted"})

(def VeryLowSeverity
  "Level where Severity is Very Low"
  {:db/ident :dpvo-risk/VeryLowSeverity,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "Level where Severity is Very Low",
   :rdf/type [:owl/NamedIndividual
              :dpvo/Severity
              :dpvo-risk/|5SeverityLevels|
              :dpvo-risk/|7SeverityLevels|],
   :rdf/value 0.1M,
   :rdfs/comment
   "The suggested quantitative value for this concept is 0.1 on a scale of 0 to 1",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Very Low Severity",
   :vs/term_status "accepted"})

(def ViolationCodeConduct
  ""
  {:db/ident            :dpvo-risk/ViolationCodeConduct,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Violation of Code of Conduct",
   :rdfs/subClassOf     [:dpvo/Damage :dpvo-risk/ViolationCodeConduct],
   :vs/term_status      "accepted"})

(def ViolationContractualObligations
  ""
  {:db/ident            :dpvo-risk/ViolationContractualObligations,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Violation of Contractual Obligations",
   :rdfs/subClassOf     [:dpvo/Damage
                         :dpvo-risk/ViolationContractualObligations],
   :vs/term_status      "accepted"})

(def ViolationEthicalCode
  ""
  {:db/ident            :dpvo-risk/ViolationEthicalCode,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Violation of Ethical Code",
   :rdfs/subClassOf     [:dpvo/Damage :dpvo-risk/ViolationEthicalCode],
   :vs/term_status      "accepted"})

(def ViolationOfRights
  ""
  {:db/ident            :dpvo-risk/ViolationOfRights,
   :dcterms/created     #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description "",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Violation of Rights",
   :rdfs/subClassOf     [:dpvo/Harm :dpvo-risk/ViolationOfRights],
   :vs/term_status      "accepted"})

(def ViolationRegulatoryObligations
  ""
  {:db/ident            :dpvo-risk/ViolationRegulatoryObligations,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Violation of Regulatory Obligations",
   :rdfs/subClassOf     [:dpvo/Damage
                         :dpvo-risk/ViolationRegulatoryObligations],
   :vs/term_status      "accepted"})

(def ViolationStatutoryObligations
  ""
  {:db/ident            :dpvo-risk/ViolationStatutoryObligations,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Violation of Statutory Obligations",
   :rdfs/subClassOf     [:dpvo/Damage :dpvo-risk/ViolationStatutoryObligations],
   :vs/term_status      "accepted"})

(def VulnerabilityCreated
  ""
  {:db/ident            :dpvo-risk/VulnerabilityCreated,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "Vulnerability Created",
   :rdfs/subClassOf     [:dpvo/Detriment :dpvo-risk/VulnerabilityCreated],
   :vs/term_status      "accepted"})

(def VulnerabilityExploited
  ""
  {:db/ident :dpvo-risk/VulnerabilityExploited,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description "",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "Vulnerability Exploited",
   :rdfs/subClassOf [:dpvo/Detriment :dpvo-risk/VulnerabilityExploited],
   :vs/term_status "accepted"})

(def |3LikelihoodLevels|
  "Scale with 3 Likelihood Levels from High to Low"
  {:db/ident            :dpvo-risk/|3LikelihoodLevels|,
   :dcterms/created     #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Scale with 3 Likelihood Levels from High to Low",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "3 Likelihood Levels",
   :rdfs/subClassOf     [:dpvo/Likelihood :dpvo-risk/|3LikelihoodLevels|],
   :vs/term_status      "accepted"})

(def |3RiskLevels|
  "Scale with 3 Risk Levels from High to Low"
  {:db/ident            :dpvo-risk/|3RiskLevels|,
   :dcterms/created     #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Scale with 3 Risk Levels from High to Low",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "3 Risk Levels",
   :rdfs/subClassOf     [:dpvo/RiskLevel :dpvo-risk/|3RiskLevels|],
   :vs/term_status      "accepted"})

(def |3SeverityLevels|
  "Scale with 3 Severity Levels from High to Low"
  {:db/ident            :dpvo-risk/|3SeverityLevels|,
   :dcterms/created     #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Scale with 3 Severity Levels from High to Low",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "3 Severity Levels",
   :rdfs/subClassOf     [:dpvo/Severity :dpvo-risk/|3SeverityLevels|],
   :vs/term_status      "accepted"})

(def |5LikelihoodLevels|
  "Scale with 5 Likelihood Levels from Very High to Very Low"
  {:db/ident :dpvo-risk/|5LikelihoodLevels|,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Scale with 5 Likelihood Levels from Very High to Very Low",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "5 Likelihood Levels",
   :rdfs/subClassOf [:dpvo/Likelihood :dpvo-risk/|5LikelihoodLevels|],
   :vs/term_status "accepted"})

(def |5RiskLevels|
  "Scale with 5 Risk Levels from Very High to Very Low"
  {:db/ident            :dpvo-risk/|5RiskLevels|,
   :dcterms/created     #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Scale with 5 Risk Levels from Very High to Very Low",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          "5 Risk Levels",
   :rdfs/subClassOf     [:dpvo/RiskLevel :dpvo-risk/|5RiskLevels|],
   :vs/term_status      "accepted"})

(def |5SeverityLevels|
  "Scale with 5 Severity Levels from Very High to Very Low"
  {:db/ident :dpvo-risk/|5SeverityLevels|,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Scale with 5 Severity Levels from Very High to Very Low",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "5 Severity Levels",
   :rdfs/subClassOf [:dpvo/Severity :dpvo-risk/|5SeverityLevels|],
   :vs/term_status "accepted"})

(def |7LikelihoodLevels|
  "Scale with 7 Likelihood Levels from Extremely High to Extremely Low"
  {:db/ident :dpvo-risk/|7LikelihoodLevels|,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Scale with 7 Likelihood Levels from Extremely High to Extremely Low",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "7 Likelihood Levels",
   :rdfs/subClassOf [:dpvo/Likelihood :dpvo-risk/|7LikelihoodLevels|],
   :vs/term_status "accepted"})

(def |7RiskLevels|
  "Scale with 7 Risk Levels from Extremely High to Extremely Low"
  {:db/ident :dpvo-risk/|7RiskLevels|,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Scale with 7 Risk Levels from Extremely High to Extremely Low",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "7 Risk Levels",
   :rdfs/subClassOf [:dpvo/RiskLevel :dpvo-risk/|7RiskLevels|],
   :vs/term_status "accepted"})

(def |7SeverityLevels|
  "Scale with 7 Severity Levels from Extremely High to Extremely Low"
  {:db/ident :dpvo-risk/|7SeverityLevels|,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Scale with 7 Severity Levels from Extremely High to Extremely Low",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label "7 Severity Levels",
   :rdfs/subClassOf [:dpvo/Severity :dpvo-risk/|7SeverityLevels|],
   :vs/term_status "accepted"})

(def ^{:private true} Consequence
  {:db/ident        :dpvo/Consequence,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :dpvo/Consequence})

(def ^{:private true} Damage
  {:db/ident        :dpvo/Damage,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :dpvo/Damage})

(def ^{:private true} Detriment
  {:db/ident        :dpvo/Detriment,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :dpvo/Detriment})

(def ^{:private true} Harm
  {:db/ident        :dpvo/Harm,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :dpvo/Harm})

(def ^{:private true} Impact
  {:db/ident        :dpvo/Impact,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :dpvo/Impact})

(def ^{:private true} Likelihood
  {:db/ident        :dpvo/Likelihood,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :dpvo/Likelihood})

(def ^{:private true} MaterialDamage
  {:db/ident        :dpvo/MaterialDamage,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :dpvo/MaterialDamage})

(def ^{:private true} NonMaterialDamage
  {:db/ident        :dpvo/NonMaterialDamage,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :dpvo/NonMaterialDamage})

(def ^{:private true} RiskLevel
  {:db/ident        :dpvo/RiskLevel,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :dpvo/RiskLevel})

(def ^{:private true} RiskManagementProcedure
  {:db/ident        :dpvo/RiskManagementProcedure,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :dpvo/RiskManagementProcedure})

(def ^{:private true} RiskMitigationMeasure
  {:db/ident        :dpvo/RiskMitigationMeasure,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :dpvo/RiskMitigationMeasure})

(def ^{:private true} Severity
  {:db/ident        :dpvo/Severity,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :dpvo/Severity})