(ns net.wikipunk.rdf.dpvo-risk
  "Risk Extension for DPV-OWL"
  {:dcterms/abstract #voc/lstr "Risk Extension for DPV-OWL@en",
   :dcterms/contributor ["Julian Flake"
                         "Paul Ryan"
                         "Beatriz Esteves"
                         "Harshvardhan J. Pandit"
                         "Georg P Krog"],
   :dcterms/created #inst "2022-08-14T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "The Risk extension to Data Privacy Vocabulary provides terms (classes and properties) related to risk management, assessment, and consequences.@en",
   :dcterms/license "https://www.w3.org/Consortium/Legal/2015/doc-license",
   :dcterms/modified #inst "2022-10-06T00:00:00.000-04:00",
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :dcterms/title #voc/lstr "Risk Extension for DPV-OWL@en",
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
   #voc/lstr
    "The Australian Cyber Security Centre (ACSC) published the Australian Government Information Security Manual (ISM) which adopts the use of a risk management framework that draws from NIST 800-37, and includes six steps: define the system, select security controls, implement security controls, assess security controls, authorise the system and monitor the system@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "ACSC-ISM@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ALARA
  "As Low as Resonably Achievable (ALARP) - A criteria for deciding significance of risk and means of evaluating tolerability of risk"
  {:db/ident :dpvo-risk/ALARA,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "As Low as Resonably Achievable (ALARP) - A criteria for deciding significance of risk and means of evaluating tolerability of risk@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "ALARA@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ALARP
  "As Low as Resonably Possible (ALARP) - A criteria for deciding significance of risk and means of evaluating tolerability of risk"
  {:db/ident :dpvo-risk/ALARP,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "As Low as Resonably Possible (ALARP) - A criteria for deciding significance of risk and means of evaluating tolerability of risk@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "ALARP@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ANSI-ISA-62443-3‑2-2020
  "ANSI/ISA-62443-3-2-2020 standard, entitled ‘Security for industrial automation and control systems, Part 3-2: Security risk assessment for system design’, from the International Society of Automation (ISA), dedicates an entire part to the assessment of security risk for system design targeting Security and IT professionals"
  {:db/ident :dpvo-risk/ANSI-ISA-62443-3‑2-2020,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "ANSI/ISA-62443-3-2-2020 standard, entitled ‘Security for industrial automation and control systems, Part 3-2: Security risk assessment for system design’, from the International Society of Automation (ISA), dedicates an entire part to the assessment of security risk for system design targeting Security and IT professionals@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "ANSI/ISA-62443-3‑2-2020@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def AbusiveContentUtilisation
  ""
  {:db/ident :dpvo-risk/AbusiveContentUtilisation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Abusive Content Utilisation@en",
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status #voc/lstr "accepted@en"})

(def AttackonPrivateLife
  ""
  {:db/ident            :dpvo-risk/AttackonPrivateLife,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Attack on Private Life@en",
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      #voc/lstr "accepted@en"})

(def AuthorisationFailure
  ""
  {:db/ident :dpvo-risk/AuthorisationFailure,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/trust-services-security-incidents-2021",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Authorisation Failure@en",
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status #voc/lstr "accepted@en"})

(def AvoidSource
  "Risk Control that avoids the risk source"
  {:db/ident            :dpvo-risk/AvoidSource,
   :dcterms/created     #inst "2022-08-21T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Risk Control that avoids the risk source@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Avoid Source@en",
   :rdfs/subClassOf     [:dpvo-risk/ControlRiskSource
                         :dpvo/RiskMitigationMeasure],
   :vs/term_status      #voc/lstr "accepted@en"})

(def BSI-200-2
  "The BSI-Standard 200-2 (‘IT-Grundschutz Methodology’) provides a methodology for the management of information security which can be adapted to the requirements of organisations of various types and sizes"
  {:db/ident :dpvo-risk/BSI-200-2,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "The BSI-Standard 200-2 (‘IT-Grundschutz Methodology’) provides a methodology for the management of information security which can be adapted to the requirements of organisations of various types and sizes@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/RiskManagementMethodology
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "BSI Standard 200-2@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def BayesianAnalysis
  "A means of making inference about model parameters using Bayes' theorem which has the capability of incorporating empirical data into prior judgements about probabilities"
  {:db/ident :dpvo-risk/BayesianAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A means of making inference about model parameters using Bayes' theorem which has the capability of incorporating empirical data into prior judgements about probabilities@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Bayesian Analysis@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def BayesianNetworks
  "A graphical model of variables and their cause-effect relationships expressed using probabilities"
  {:db/ident :dpvo-risk/BayesianNetworks,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A graphical model of variables and their cause-effect relationships expressed using probabilities@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Bayesian Networks@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def Blackmail
  ""
  {:db/ident            :dpvo-risk/Blackmail,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Blackmail@en",
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      #voc/lstr "accepted@en"})

(def BowTie
  "A diagrammatic way of describing the pathways from sources of risk to outcomes, and of reviewing controls"
  {:db/ident :dpvo-risk/BowTie,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A diagrammatic way of describing the pathways from sources of risk to outcomes, and of reviewing controls@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Bow Tie Analysis@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def Brainstorming
  "Technique used in workshops to encourage imaginative thinking"
  {:db/ident :dpvo-risk/Brainstorming,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Technique used in workshops to encourage imaginative thinking@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo/RiskManagementProcess
              :dpvo-risk/RiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Brainstorming@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def BruteForceAuthorisations
  ""
  {:db/ident :dpvo-risk/BruteForceAuthorisations,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Brute Force Authorisations@en",
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status #voc/lstr "accepted@en"})

(def BusinessImpact
  ""
  {:db/ident :dpvo-risk/BusinessImpact,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Business impact@en",
   :rdfs/subClassOf :dpvo/Impact,
   :vs/term_status #voc/lstr "accepted@en"})

(def BusinessImpactAnalysis
  "A process that analyses the consequences of a disruptive incident on the organization which determines the recovery priorities of an organization's products and services and, thereby, the priorities of the activities and resources which deliver them"
  {:db/ident :dpvo-risk/BusinessImpactAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A process that analyses the consequences of a disruptive incident on the organization which determines the recovery priorities of an organization's products and services and, thereby, the priorities of the activities and resources which deliver them@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Business Impact Analysis@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def BusinessPerformanceImpairment
  ""
  {:db/ident            :dpvo-risk/BusinessPerformanceImpairment,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Business Performance Impairment@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def Businessdisruption
  ""
  {:db/ident            :dpvo-risk/Businessdisruption,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Business disruption@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def CCRACII
  "The Guide to Conducting Cybersecurity Risk Assessment for Critical Information Infrastructure (CCRACII) defines commonly used terms such as threat event, vulnerability, likelihood, impact and risk, roles, and responsibilities, in addition to a range for risk levels, ranging from low to very high with different level of risk toleranc"
  {:db/ident :dpvo-risk/CCRACII,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "The Guide to Conducting Cybersecurity Risk Assessment for Critical Information Infrastructure (CCRACII) defines commonly used terms such as threat event, vulnerability, likelihood, impact and risk, roles, and responsibilities, in addition to a range for risk levels, ranging from low to very high with different level of risk toleranc@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "CCRACII@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def CORAS
  "The CORAS method was developed and is supported by SourceForge. It is a method for conducting the analysis and management of security risk. It provides a customised language for modelling threats and risks as well as detailed guidelines explaining how the language should be used to capture and model relevant information during the various stages of the security analysis"
  {:db/ident :dpvo-risk/CORAS,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "The CORAS method was developed and is supported by SourceForge. It is a method for conducting the analysis and management of security risk. It provides a customised language for modelling threats and risks as well as detailed guidelines explaining how the language should be used to capture and model relevant information during the various stages of the security analysis@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "CORAS@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def CRAMM
  "CCTA Risk Assessment and Management Methodology (CRAMM) is a method that an analyst or group of analysts may use to evaluate the security and risk level of an organisation by analysing and combining the diverse knowledge distributed in the local corporate environment"
  {:db/ident :dpvo-risk/CRAMM,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "CCTA Risk Assessment and Management Methodology (CRAMM) is a method that an analyst or group of analysts may use to evaluate the security and risk level of an organisation by analysing and combining the diverse knowledge distributed in the local corporate environment@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "CRAMM@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def CVaR
  "A measure of the expected loss from a financial portfolio in the worst a % of cases. Also called expected shortfall (ES)"
  {:db/ident :dpvo-risk/CVaR,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A measure of the expected loss from a financial portfolio in the worst a % of cases. Also called expected shortfall (ES)@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Conditional Value at Risk (CVaR)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def CausalMapping
  "A network diagram representing events, causes and effects and their relationships."
  {:db/ident :dpvo-risk/CausalMapping,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A network diagram representing events, causes and effects and their relationships.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo/RiskManagementProcess
              :dpvo-risk/RiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Causal Mapping@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def CauseConsequenceAnalysis
  "A combination of fault and event tree analysis that allows inclusion of time delays. Both causes and consequences of an initiating event are considered."
  {:db/ident :dpvo-risk/CauseConsequenceAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A combination of fault and event tree analysis that allows inclusion of time delays. Both causes and consequences of an initiating event are considered.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Cause-Consequence Analysis@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ChangeConsequence
  "Risk Control that changes Consequence"
  {:db/ident            :dpvo-risk/ChangeConsequence,
   :dcterms/created     #inst "2022-08-25T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Risk Control that changes Consequence@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Change Consequence@en",
   :rdfs/subClassOf     [:dpvo-risk/ControlConsequence
                         :dpvo/RiskMitigationMeasure],
   :vs/term_status      #voc/lstr "accepted@en"})

(def ChangeImpact
  "Risk Control that changes Impact"
  {:db/ident            :dpvo-risk/ChangeImpact,
   :dcterms/created     #inst "2022-08-26T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Risk Control that changes Impact@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Change Impact@en",
   :rdfs/subClassOf     [:dpvo-risk/ControlConsequence
                         :dpvo/RiskMitigationMeasure],
   :vs/term_status      #voc/lstr "accepted@en"})

(def Checklists
  "A checklist based on experience or on concepts and models that can be used to help identify risks or controls."
  {:db/ident :dpvo-risk/Checklists,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A checklist based on experience or on concepts and models that can be used to help identify risks or controls.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess
              :dpvo-risk/RiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Checklists@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ChildViolence
  ""
  {:db/ident :dpvo-risk/ChildViolence,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Child Violence@en",
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status #voc/lstr "accepted@en"})

(def Cindynic
  "Considers goals, values, rules, data and models of stakeholders and identifies inconsistencies, ambiguities, omissions and ignorance. These form systemic sources and drivers of risk."
  {:db/ident :dpvo-risk/Cindynic,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Considers goals, values, rules, data and models of stakeholders and identifies inconsistencies, ambiguities, omissions and ignorance. These form systemic sources and drivers of risk.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo/RiskManagementProcess
              :dpvo-risk/RiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Cindynic Approach@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def CitizensImpact
  ""
  {:db/ident :dpvo-risk/CitizensImpact,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Citizens impact@en",
   :rdfs/subClassOf :dpvo/Impact,
   :vs/term_status #voc/lstr "accepted@en"})

(def Classifications
  "A classification list based on experience or on concepts and models that can be used to help identify risks or controls."
  {:db/ident :dpvo-risk/Classifications,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A classification list based on experience or on concepts and models that can be used to help identify risks or controls.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo/RiskManagementProcess
              :dpvo-risk/RiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Classifications@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def Coercion
  ""
  {:db/ident :dpvo-risk/Coercion,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Coercion@en",
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status #voc/lstr "accepted@en"})

(def ComplianceImpact
  ""
  {:db/ident :dpvo-risk/ComplianceImpact,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Compliance impact@en",
   :rdfs/subClassOf :dpvo/Impact,
   :vs/term_status #voc/lstr "accepted@en"})

(def CompromiseAccount
  ""
  {:db/ident :dpvo-risk/CompromiseAccount,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Compromise Account@en",
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status #voc/lstr "accepted@en"})

(def CompromiseAccountCredentials
  ""
  {:db/ident :dpvo-risk/CompromiseAccountCredentials,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Compromise Account Credentials@en",
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status #voc/lstr "accepted@en"})

(def CompromiseAccountSecurity
  ""
  {:db/ident :dpvo-risk/CompromiseAccountSecurity,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Compromise Account Security@en",
   :rdfs/subClassOf :dpvo/NonMaterialDamage,
   :vs/term_status #voc/lstr "accepted@en"})

(def ConfidentialityBreach
  ""
  {:db/ident            :dpvo-risk/ConfidentialityBreach,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Confidentiality Breach@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def ConsequenceForDataSubject
  ""
  {:db/ident            :dpvo-risk/ConsequenceForDataSubject,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Consequence for Data Subject@en",
   :rdfs/subClassOf     :dpvo/Consequence,
   :vs/term_status      #voc/lstr "accepted@en"})

(def ConsequenceOnDataSecurity
  ""
  {:db/ident            :dpvo-risk/ConsequenceOnDataSecurity,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Consequence on Data Security@en",
   :rdfs/subClassOf     :dpvo/Consequence,
   :vs/term_status      #voc/lstr "accepted@en"})

(def ControlConsequence
  "Risk Mitigation Measure that controls the Consequences and Impacts"
  {:db/ident :dpvo-risk/ControlConsequence,
   :dcterms/created #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Risk Mitigation Measure that controls the Consequences and Impacts@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Control Consequence@en",
   :rdfs/subClassOf :dpvo/RiskMitigationMeasure,
   :vs/term_status #voc/lstr "accepted@en"})

(def ControlMonitors
  "Risk Mitigation Measure that uses controls to monitor events"
  {:db/ident :dpvo-risk/ControlMonitors,
   :dcterms/created #inst "2022-08-30T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Risk Mitigation Measure that uses controls to monitor events@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Monitoring can be associated with characteristics such as assessing or detecting whether something is active, operational, performant, effective, has potential to materialise, is materialising, or has already materialised.@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Control Monitors@en",
   :rdfs/subClassOf :dpvo/RiskMitigationMeasure,
   :vs/term_status #voc/lstr "accepted@en"})

(def ControlRiskSource
  "Risk Mitigation Measure that controls the Risk Source"
  {:db/ident :dpvo-risk/ControlRiskSource,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Risk Mitigation Measure that controls the Risk Source@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Control Risk Source@en",
   :rdfs/subClassOf :dpvo/RiskMitigationMeasure,
   :vs/term_status #voc/lstr "accepted@en"})

(def CopyrightViolation
  ""
  {:db/ident :dpvo-risk/CopyrightViolation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Copyright Violation@en",
   :rdfs/subClassOf :dpvo/NonMaterialDamage,
   :vs/term_status #voc/lstr "accepted@en"})

(def CorruptionData
  ""
  {:db/ident            :dpvo-risk/CorruptionData,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Corruption of Data@en",
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def CostAcquisition
  ""
  {:db/ident            :dpvo-risk/CostAcquisition,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Cost of Acquisition@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def CostBackup
  ""
  {:db/ident            :dpvo-risk/CostBackup,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Cost of Backup@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def CostBenefitAnalysis
  "Uses money as a scale for estimating positive and negative, tangible and intangible, consequences of different options."
  {:db/ident :dpvo-risk/CostBenefitAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Uses money as a scale for estimating positive and negative, tangible and intangible, consequences of different options.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Cost/benefit Analysis@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def CostConfiguration
  ""
  {:db/ident            :dpvo-risk/CostConfiguration,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Cost of Configuration@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def CostInstallation
  ""
  {:db/ident            :dpvo-risk/CostInstallation,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Cost of Installation@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def CostJudicialPenalties
  ""
  {:db/ident            :dpvo-risk/CostJudicialPenalties,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Cost of Judicial Penalties@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def CostJudicialProceedings
  ""
  {:db/ident            :dpvo-risk/CostJudicialProceedings,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Cost of Judicial Proceedings@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def CostOperationInterruption
  ""
  {:db/ident            :dpvo-risk/CostOperationInterruption,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Cost of Operation Interruption@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def CostSuspendedOperations
  ""
  {:db/ident            :dpvo-risk/CostSuspendedOperations,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Cost of Suspended Operations@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def CrossImpactAnalysis
  "Evaluates changes in the probability of the occurrence of a given set of events consequent on the actual occurrence of one of them."
  {:db/ident :dpvo-risk/CrossImpactAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Evaluates changes in the probability of the occurrence of a given set of events consequent on the actual occurrence of one of them.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Cross Impact Analysis@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def Cryptojacking
  "Cryptojacking or hidden cryptomining is a type of cybercrime where a criminal secretly uses a victim’s computing power to generate cryptocurrency"
  {:db/ident :dpvo-risk/Cryptojacking,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Cryptojacking or hidden cryptomining is a type of cybercrime where a criminal secretly uses a victim’s computing power to generate cryptocurrency@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/enisa-threat-landscape-2021",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Cryptojacking@en",
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status #voc/lstr "accepted@en"})

(def CyberSpying
  ""
  {:db/ident            :dpvo-risk/CyberSpying,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Cyber Spying@en",
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def CyberStalking
  ""
  {:db/ident            :dpvo-risk/CyberStalking,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Cyber Stalking@en",
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def DPIA
  "Analyses how incidents and events could affect the protection of data and its effects on persons and identifies and quantifies the capabilities that would be needed to manage it."
  {:db/ident :dpvo-risk/DPIA,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Analyses how incidents and events could affect the protection of data and its effects on persons and identifies and quantifies the capabilities that would be needed to manage it.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo/RiskManagementProcess
              :dpvo-risk/RiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Data Protection Impact Assessment (DPIA)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def DamageByThirdParty
  ""
  {:db/ident :dpvo-risk/DamageByThirdParty,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Damage by Third Party@en",
   :rdfs/subClassOf :dpvo/Damage,
   :vs/term_status #voc/lstr "accepted@en"})

(def DangertoCustomers
  ""
  {:db/ident            :dpvo-risk/DangertoCustomers,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Danger to Customers@en",
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      #voc/lstr "accepted@en"})

(def DangertoPersonnel
  ""
  {:db/ident            :dpvo-risk/DangertoPersonnel,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Danger to Personnel@en",
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      #voc/lstr "accepted@en"})

(def DataBreach
  ""
  {:db/ident            :dpvo-risk/DataBreach,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Data Breach@en",
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def DecisionTreeAnalysis
  "Uses a tree-like representation or model of decisions and their possible consequences. Outcomes are usually expressed in monetary terms or in terms of utility."
  {:db/ident :dpvo-risk/DecisionTreeAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Uses a tree-like representation or model of decisions and their possible consequences. Outcomes are usually expressed in monetary terms or in terms of utility.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Decision Tree Analysis@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def DelphiTechnique
  "Collects judgements through a set of sequential questionnaires. People participate individually but receive feedback on the responses of others after each set of questions."
  {:db/ident :dpvo-risk/DelphiTechnique,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Collects judgements through a set of sequential questionnaires. People participate individually but receive feedback on the responses of others after each set of questions.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo/RiskManagementProcess
              :dpvo-risk/RiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Delphi Technique@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def DenialServiceAttack
  ""
  {:db/ident            :dpvo-risk/DenialServiceAttack,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Denial of Service Attack (DoS)@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def DetrimentToRecovery
  ""
  {:db/ident :dpvo-risk/DetrimentToRecovery,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Detriment to Recovery@en",
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status #voc/lstr "accepted@en"})

(def Discrimination
  ""
  {:db/ident            :dpvo-risk/Discrimination,
   :dcterms/created     #inst "2022-08-19T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description #voc/lstr "@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Discrimination@en",
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      #voc/lstr "accepted@en"})

(def DistributedDenialServiceAttack
  ""
  {:db/ident            :dpvo-risk/DistributedDenialServiceAttack,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr
                         "Distributed Denial of Service Attack (DDoS)@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def EBIOS
  "Expression des Besoins et Identification des Objectifs de Sécurité (EBIOS) Risk Manager is an information security risk management method, created under the French General Secretariat of National Defence, consistent with ISO 31000 and ISO/IEC 27005, and enables the risk management requirements of ISO/IEC 27001 to be met"
  {:db/ident :dpvo-risk/EBIOS,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Expression des Besoins et Identification des Objectifs de Sécurité (EBIOS) Risk Manager is an information security risk management method, created under the French General Secretariat of National Defence, consistent with ISO 31000 and ISO/IEC 27005, and enables the risk management requirements of ISO/IEC 27001 to be met@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/RiskManagementMethodology
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "EBIOS@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ERM-IF
  "Enterprise Risk Management - Integrated Framework (ERM-IF) defines the essential components of enterprise risk management. It is based on a set of principles and concepts for the enterprise and has as its objective to offer a common language for enterprise risk"
  {:db/ident :dpvo-risk/ERM-IF,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Enterprise Risk Management - Integrated Framework (ERM-IF) defines the essential components of enterprise risk management. It is based on a set of principles and concepts for the enterprise and has as its objective to offer a common language for enterprise risk@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "ERM-IF@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ETSI-TS-102-165-1
  "ETSI TS 102 165-1 offers methodology and pro-forma for threat, vulnerability and risk analysis (TVRA). According to ETSI TS 102 165-1, threat vulnerability and risk analysis (TVRA) is used to identify risk to an information system based upon the product of the likelihood of an attack and the impact that such an attack will have on the system"
  {:db/ident :dpvo-risk/ETSI-TS-102-165-1,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "ETSI TS 102 165-1 offers methodology and pro-forma for threat, vulnerability and risk analysis (TVRA). According to ETSI TS 102 165-1, threat vulnerability and risk analysis (TVRA) is used to identify risk to an information system based upon the product of the likelihood of an attack and the impact that such an attack will have on the system@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "ETSI TS 102 165-1@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def EU-ITSRM
  "ITSRM² IT Security Risk Management Methodology is a methodology provided by DG DIGIT and the European Commission as part of a set of standards for information security"
  {:db/ident :dpvo-risk/EU-ITSRM,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "ITSRM² IT Security Risk Management Methodology is a methodology provided by DG DIGIT and the European Commission as part of a set of standards for information security@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "ITSRM²@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def Eavesdropping
  ""
  {:db/ident            :dpvo-risk/Eavesdropping,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Eavesdropping@en",
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def EconomicDisadvantage
  ""
  {:db/ident            :dpvo-risk/EconomicDisadvantage,
   :dcterms/created     #inst "2022-08-19T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description #voc/lstr "@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Economic Disadvantage@en",
   :rdfs/subClassOf     :dpvo/Impact,
   :vs/term_status      #voc/lstr "accepted@en"})

(def EnvironmentalSafetyEndangerment
  ""
  {:db/ident            :dpvo-risk/EnvironmentalSafetyEndangerment,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Environmental Safety Endangerment@en",
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      #voc/lstr "accepted@en"})

(def EquipmentFailure
  ""
  {:db/ident            :dpvo-risk/EquipmentFailure,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Equipment Failure@en",
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def EquipmentMalfunction
  ""
  {:db/ident            :dpvo-risk/EquipmentMalfunction,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Equipment Malfunction@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def ErrornousSystemUse
  ""
  {:db/ident            :dpvo-risk/ErrornousSystemUse,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Errornous System Use@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def EventTreeAnalysis
  "Models the possible outcomes from a given initiating event and the status of controls thus analysing the frequency or probability of the various possible outcomes."
  {:db/ident :dpvo-risk/EventTreeAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Models the possible outcomes from a given initiating event and the status of controls thus analysing the frequency or probability of the various possible outcomes.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Event Tree Analysis@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def Extorsion
  ""
  {:db/ident :dpvo-risk/Extorsion,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Extorsion@en",
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status #voc/lstr "accepted@en"})

(def ExtremelyHighLikelihood
  "Level where Likelihood is Extremely High"
  {:db/ident :dpvo-risk/ExtremelyHighLikelihood,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Level where Likelihood is Extremely High@en",
   :rdf/type
   [:owl/NamedIndividual :dpvo/Likelihood :dpvo-risk/|7LikelihoodLevels|],
   :rdf/value {:xsd/decimal 0.99M},
   :rdfs/comment
   #voc/lstr
    "The suggested quantitative value for this concept is 0.99 on a scale of 0 to 1@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Extremely High Likelihood@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ExtremelyHighRisk
  "Level where Risk is Extremely High"
  {:db/ident :dpvo-risk/ExtremelyHighRisk,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Level where Risk is Extremely High@en",
   :rdf/type [:dpvo-risk/|7RiskLevels| :owl/NamedIndividual :dpvo/RiskLevel],
   :rdf/value {:xsd/decimal 0.99M},
   :rdfs/comment
   #voc/lstr
    "The suggested quantitative value for this concept is 0.99 on a scale of 0 to 1@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Extremely High Risk@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ExtremelyHighSeverity
  "Level where Severity is Extremely High"
  {:db/ident :dpvo-risk/ExtremelyHighSeverity,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Level where Severity is Extremely High@en",
   :rdf/type [:dpvo-risk/|7SeverityLevels| :dpvo/Severity :owl/NamedIndividual],
   :rdf/value {:xsd/decimal 0.99M},
   :rdfs/comment
   #voc/lstr
    "The suggested quantitative value for this concept is 0.99 on a scale of 0 to 1@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Extremely High Severity@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ExtremelyLowLikelihood
  "Level where Likelihood is Extremely Low"
  {:db/ident :dpvo-risk/ExtremelyLowLikelihood,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Level where Likelihood is Extremely Low@en",
   :rdf/type
   [:dpvo-risk/|7LikelihoodLevels| :dpvo/Likelihood :owl/NamedIndividual],
   :rdf/value {:xsd/decimal 0.01M},
   :rdfs/comment
   #voc/lstr
    "The suggested quantitative value for this concept is 0.01 on a scale of 0 to 1@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Extremely Low Likelihood@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ExtremelyLowRisk
  "Level where Risk is Extremely Low"
  {:db/ident :dpvo-risk/ExtremelyLowRisk,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Level where Risk is Extremely Low@en",
   :rdf/type [:dpvo/RiskLevel :dpvo-risk/|7RiskLevels| :owl/NamedIndividual],
   :rdf/value {:xsd/decimal 0.01M},
   :rdfs/comment
   #voc/lstr
    "The suggested quantitative value for this concept is 0.01 on a scale of 0 to 1@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Extremely Low Risk@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ExtremelyLowSeverity
  "Level where Severity is Extremely Low"
  {:db/ident :dpvo-risk/ExtremelyLowSeverity,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Level where Severity is Extremely Low@en",
   :rdf/type [:owl/NamedIndividual :dpvo-risk/|7SeverityLevels| :dpvo/Severity],
   :rdf/value {:xsd/decimal 0.01M},
   :rdfs/comment
   #voc/lstr
    "The suggested quantitative value for this concept is 0.01 on a scale of 0 to 1@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Extremely Low Severity@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def FAIR
  "The purpose of the FAIR (Factor Analysis of Information Risk) model is to help organisations understand, analyse, and measure information risk. The model provides an approach to quantify risk and defines the necessary building blocks for implementing effective cyber risk management programmes"
  {:db/ident :dpvo-risk/FAIR,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "The purpose of the FAIR (Factor Analysis of Information Risk) model is to help organisations understand, analyse, and measure information risk. The model provides an approach to quantify risk and defines the necessary building blocks for implementing effective cyber risk management programmes@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/RiskManagementMethodology
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "FAIR@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def FAIR-Privacy
  "Factors Analysis in Information Risk (FAIR Privacy) is a quantitative privacy risk framework based on FAIR (Factors Analysis in Information Risk) that examines personal privacy risks (to individuals), not organisational risks"
  {:db/ident :dpvo-risk/FAIR-Privacy,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Factors Analysis in Information Risk (FAIR Privacy) is a quantitative privacy risk framework based on FAIR (Factors Analysis in Information Risk) that examines personal privacy risks (to individuals), not organisational risks@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "FAIR Privacy@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def FMEA
  "Considers the ways in which each component of a system might fail and the failure causes and effects."
  {:db/ident :dpvo-risk/FMEA,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Considers the ways in which each component of a system might fail and the failure causes and effects.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Failure Modes And Effects Analysis (FMEA)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def FMECA
  "Considers the ways in which each component of a system might fail and the failure causes and effects. FMEA followed by a criticality analysis which defines the significance of each failure mode (FMECA)."
  {:db/ident :dpvo-risk/FMECA,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Considers the ways in which each component of a system might fail and the failure causes and effects. FMEA followed by a criticality analysis which defines the significance of each failure mode (FMECA).@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr
                "Failure Modes And Effects And Criticality Analysis (FMECA)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def FNDiagrams
  "Special case of quantitative consequence/likelihood graph applied to consideration of tolerability of risk to human life."
  {:db/ident :dpvo-risk/FNDiagrams,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Special case of quantitative consequence/likelihood graph applied to consideration of tolerability of risk to human life.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "F-N Diagrams@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def FaultTreeAnalysis
  "Analyses causes of a focus event using Boolean logic to describe combinations of faults. Variations include a success tree where the top event is desired and a cause tree used to investigate past events."
  {:db/ident :dpvo-risk/FaultTreeAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Analyses causes of a focus event using Boolean logic to describe combinations of faults. Variations include a success tree where the top event is desired and a cause tree used to investigate past events.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Fault Tree Analysis@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def FinancialEquipmentCosts
  ""
  {:db/ident            :dpvo-risk/FinancialEquipmentCosts,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Financial Equipment Costs@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def FinancialInvestigationCosts
  ""
  {:db/ident            :dpvo-risk/FinancialInvestigationCosts,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Financial Investigation Costs@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def FinancialLoss
  ""
  {:db/ident            :dpvo-risk/FinancialLoss,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Financial Loss@en",
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def FinancialPersonnelCosts
  ""
  {:db/ident            :dpvo-risk/FinancialPersonnelCosts,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Financial Personnel Costs@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def FinancialRepairCosts
  ""
  {:db/ident            :dpvo-risk/FinancialRepairCosts,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Financial Repair Costs@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def Fishbone
  "Identifies contributory factors to a defined outcome (wanted or unwanted). Contributory factors are usually divided into predefined categories and displayed in a tree structure or a fishbone diagram."
  {:db/ident :dpvo-risk/Fishbone,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Identifies contributory factors to a defined outcome (wanted or unwanted). Contributory factors are usually divided into predefined categories and displayed in a tree structure or a fishbone diagram.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess
              :dpvo-risk/RiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Ishikawa (Fishbone)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def Fraud
  ""
  {:db/ident            :dpvo-risk/Fraud,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Fraud@en",
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      #voc/lstr "accepted@en"})

(def GCSOS
  "The Guidelines on Cyber Security Onboard Ships (GCSOS) guidelines explain why and how cyber risks should be managed in a shipping context. They outline the risk assessment process with an explanation of the part played by each component of cyber risk and offer advice on how to respond to and recover from cyber incidents"
  {:db/ident :dpvo-risk/GCSOS,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "The Guidelines on Cyber Security Onboard Ships (GCSOS) guidelines explain why and how cyber risks should be managed in a shipping context. They outline the risk assessment process with an explanation of the part played by each component of cyber risk and offer advice on how to respond to and recover from cyber incidents@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "GCSOS@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def GameTheory
  "The study of strategic decision making to model the impact of the decisions of different players involved in the game. Example application area can be risk based pricing."
  {:db/ident :dpvo-risk/GameTheory,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "The study of strategic decision making to model the impact of the decisions of different players involved in the game. Example application area can be risk based pricing.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Game Theory@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def GovernmentCrisis
  ""
  {:db/ident            :dpvo-risk/GovernmentCrisis,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Government Crisis@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def HACCP
  "Analyses the risk reduction that can be achieved by various layers of protection."
  {:db/ident :dpvo-risk/HACCP,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Analyses the risk reduction that can be achieved by various layers of protection.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess
              :dpvo-risk/RiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr
                "Hazard Analysis And Critical Control Points (HACCP)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def HAZOP
  "A structured and systematic examination of a planned or existing process or operation in order to identify and evaluate problems that might represent risk to personnel or equipment, or prevent efficient operation"
  {:db/ident :dpvo-risk/HAZOP,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A structured and systematic examination of a planned or existing process or operation in order to identify and evaluate problems that might represent risk to personnel or equipment, or prevent efficient operation@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess
              :dpvo-risk/RiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Hazard And Operability Studies (HAZOP)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def HITRUST-CSF
  "The HITRUST Cyber-Security Framework (CSF) is a framework created by security industry experts to safeguard sensitive information and manage information risk for organisations across all industries and throughout the third-party supply chain"
  {:db/ident :dpvo-risk/HITRUST-CSF,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "The HITRUST Cyber-Security Framework (CSF) is a framework created by security industry experts to safeguard sensitive information and manage information risk for organisations across all industries and throughout the third-party supply chain@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/RiskManagementMethodology
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "HITRUST-CSF@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def HaltSource
  "Risk Control that halts the risk source or prevents it from materialising"
  {:db/ident :dpvo-risk/HaltSource,
   :dcterms/created #inst "2022-08-19T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Risk Control that halts the risk source or prevents it from materialising@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Halt Source@en",
   :rdfs/subClassOf [:dpvo-risk/ControlRiskSource :dpvo/RiskMitigationMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def HarmfulSpeech
  ""
  {:db/ident :dpvo-risk/HarmfulSpeech,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Harmful Spech@en",
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status #voc/lstr "accepted@en"})

(def HealthLifeImpact
  ""
  {:db/ident :dpvo-risk/HealthLifeImpact,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Health and life impact@en",
   :rdfs/subClassOf :dpvo/Impact,
   :vs/term_status #voc/lstr "accepted@en"})

(def HighLikelihood
  "Level where Likelihood is High"
  {:db/ident :dpvo-risk/HighLikelihood,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Level where Likelihood is High@en",
   :rdf/type [:dpvo-risk/|3LikelihoodLevels|
              :dpvo-risk/|5LikelihoodLevels|
              :owl/NamedIndividual
              :dpvo/Likelihood
              :dpvo-risk/|7LikelihoodLevels|],
   :rdf/value {:xsd/decimal 0.75M},
   :rdfs/comment
   #voc/lstr
    "The suggested quantitative value for this concept is 0.75 on a scale of 0 to 1@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "High Likelihood@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def HighRisk
  "Level where Risk is High"
  {:db/ident :dpvo-risk/HighRisk,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Level where Risk is High@en",
   :rdf/type [:owl/NamedIndividual
              :dpvo/RiskLevel
              :dpvo-risk/|5RiskLevels|
              :dpvo-risk/|7RiskLevels|
              :dpvo-risk/|3RiskLevels|],
   :rdf/value {:xsd/decimal 0.75M},
   :rdfs/comment
   #voc/lstr
    "The suggested quantitative value for this concept is 0.75 on a scale of 0 to 1@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "High Risk@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def HighSeverity
  "Level where Severity is High"
  {:db/ident :dpvo-risk/HighSeverity,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Level where Severity is High@en",
   :rdf/type [:dpvo/Severity
              :dpvo-risk/|5SeverityLevels|
              :dpvo-risk/|7SeverityLevels|
              :dpvo-risk/|3SeverityLevels|
              :owl/NamedIndividual],
   :rdf/value {:xsd/decimal 0.75M},
   :rdfs/comment
   #voc/lstr
    "The suggested quantitative value for this concept is 0.75 on a scale of 0 to 1@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "High Severity@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def HumanErrors
  ""
  {:db/ident :dpvo-risk/HumanErrors,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Human Errors@en",
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status #voc/lstr "accepted@en"})

(def HumanReliabilityAnalysis
  "A set of techniques for identifying the potential for human error and estimating the likelihood of failure."
  {:db/ident :dpvo-risk/HumanReliabilityAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A set of techniques for identifying the potential for human error and estimating the likelihood of failure.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Human Reliability Analysis@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def IMO-MSC-FAL1-CIRC3
  "The official International Maritime Organization guidelines IMO MSC-FAL.1/CIRC.3 provide a high-level approach to the management pf maritime cyber risk which refers to the extent a technology asset is exposed to risks during an event that could result in shipping-related operational failure"
  {:db/ident :dpvo-risk/IMO-MSC-FAL1-CIRC3,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "The official International Maritime Organization guidelines IMO MSC-FAL.1/CIRC.3 provide a high-level approach to the management pf maritime cyber risk which refers to the extent a technology asset is exposed to risks during an event that could result in shipping-related operational failure@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/RiskManagementMethodology
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "IMO MSC-FAL.1/CIRC.3@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def IRAM2
  "Information Risk Assessment Methodology (IRAM2) supports risk assessment and treatment and entails a six-phase process, and is is implemented by an automated toolset"
  {:db/ident :dpvo-risk/IRAM2,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Information Risk Assessment Methodology (IRAM2) supports risk assessment and treatment and entails a six-phase process, and is is implemented by an automated toolset@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "IRAM2@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def IS-BM
  "The IS risk analysis method is based on a business model using a quantitative approach. The values of IS assets come from their importance towards operational continuity, as well as from their replacement costs"
  {:db/ident :dpvo-risk/IS-BM,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "The IS risk analysis method is based on a business model using a quantitative approach. The values of IS assets come from their importance towards operational continuity, as well as from their replacement costs@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "IS-BM@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ISACA-RISK-IT
  "The ISACA Risk IT Framework provides a set of guiding principles and supporting practices for enterprise management, combined to deliver a comprehensive process model for governing and managing IT risk"
  {:db/ident :dpvo-risk/ISACA-RISK-IT,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "The ISACA Risk IT Framework provides a set of guiding principles and supporting practices for enterprise management, combined to deliver a comprehensive process model for governing and managing IT risk@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "ISACA-RISK-IT@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ISAMM
  "Information Security Assessment and Monitoring Method (ISAMM) is a quantitative type of risk management methodology that can be applied by various organisations such as governmental agencies, large companies and small and medium size enterprises"
  {:db/ident :dpvo-risk/ISAMM,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Information Security Assessment and Monitoring Method (ISAMM) is a quantitative type of risk management methodology that can be applied by various organisations such as governmental agencies, large companies and small and medium size enterprises@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "ISAMM@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ISO-IEC-27005-2018
  "ISO/IEC 27005:2018 ‘Information technology — Security techniques — Information security risk management’ is a risk management framework applicable to all types of organisations (e.g. commercial enterprises, government agencies, non-profit organisations) which intend to manage risks that could compromise the organisation’s information security"
  {:db/ident :dpvo-risk/ISO-IEC-27005-2018,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "ISO/IEC 27005:2018 ‘Information technology — Security techniques — Information security risk management’ is a risk management framework applicable to all types of organisations (e.g. commercial enterprises, government agencies, non-profit organisations) which intend to manage risks that could compromise the organisation’s information security@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "ISO/IEC 27005:2018@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ISRAM
  "ISRAM is a quantitative, paper-based risk analysis method that is designed to allow effective participation of managers and staff in the process"
  {:db/ident :dpvo-risk/ISRAM,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "ISRAM is a quantitative, paper-based risk analysis method that is designed to allow effective participation of managers and staff in the process@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "ISRAM@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def IT-Grundschutz
  "IT-Grundschutz has been developed by the Federal Office for Information Security in Germany. IT-Grundschutz provides a configuration for the establishment of an integrated and effective IT security managemen"
  {:db/ident :dpvo-risk/IT-Grundschutz,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "IT-Grundschutz has been developed by the Federal Office for Information Security in Germany. IT-Grundschutz provides a configuration for the establishment of an integrated and effective IT security managemen@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "IT-Grundschutz@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def IdentityDispute
  ""
  {:db/ident            :dpvo-risk/IdentityDispute,
   :dcterms/created     #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Identity Dispute@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def IdentityFraud
  ""
  {:db/ident :dpvo-risk/IdentityFraud,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Identity Fraud@en",
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status #voc/lstr "accepted@en"})

(def IdentityTheft
  ""
  {:db/ident :dpvo-risk/IdentityTheft,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Identity Theft@en",
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status #voc/lstr "accepted@en"})

(def IllegalProcessingData
  ""
  {:db/ident            :dpvo-risk/IllegalProcessingData,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Illegal Processing of Data@en",
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def ImpactOnDataSubject
  ""
  {:db/ident            :dpvo-risk/ImpactOnDataSubject,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description #voc/lstr "@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Impact on Data Subject@en",
   :rdfs/subClassOf     :dpvo/Impact,
   :vs/term_status      #voc/lstr "accepted@en"})

(def ImpacttoRights
  ""
  {:db/ident            :dpvo-risk/ImpacttoRights,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Impact to Rights@en",
   :rdfs/subClassOf     :dpvo/Impact,
   :vs/term_status      #voc/lstr "accepted@en"})

(def IncreaseInternalCost
  ""
  {:db/ident            :dpvo-risk/IncreaseInternalCost,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Increase Internal Cost@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def IndustrialCrisis
  ""
  {:db/ident            :dpvo-risk/IndustrialCrisis,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Industrial Crisis@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def InfluenceDiagrams
  "An extended version of Bayesian networks that includes variables representing uncertainties, consequences and actions"
  {:db/ident :dpvo-risk/InfluenceDiagrams,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "An extended version of Bayesian networks that includes variables representing uncertainties, consequences and actions@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Influence Diagrams@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def Injury
  ""
  {:db/ident            :dpvo-risk/Injury,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Injury@en",
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      #voc/lstr "accepted@en"})

(def InterceptionCommunications
  ""
  {:db/ident            :dpvo-risk/InterceptionCommunications,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Interception of Communications@en",
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def InternalOperationDisruption
  ""
  {:db/ident            :dpvo-risk/InternalOperationDisruption,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Internal Operation Disruption@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def Interviews
  "Structured or semi- structured one-to-one conversations to elicit views."
  {:db/ident :dpvo-risk/Interviews,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Structured or semi- structured one-to-one conversations to elicit views.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess
              :dpvo-risk/RiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Interviews@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def KnownVulnerabilityExploited
  ""
  {:db/ident :dpvo-risk/KnownVulnerabilityExploited,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Known Vulnerability Exploited@en",
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status #voc/lstr "accepted@en"})

(def LOPA
  "Analyses the risk reduction that can be achieved by various layers of protection."
  {:db/ident :dpvo-risk/LOPA,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Analyses the risk reduction that can be achieved by various layers of protection.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Layer Protection Analysis (LOPA)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def LawEnforcementAdverseEffects
  ""
  {:db/ident            :dpvo-risk/LawEnforcementAdverseEffects,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Law Enforcement Adverse Effects@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def LimitationOfRights
  ""
  {:db/ident            :dpvo-risk/LimitationOfRights,
   :dcterms/created     #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Limitation of Rights@en",
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      #voc/lstr "accepted@en"})

(def LossAssets
  ""
  {:db/ident            :dpvo-risk/LossAssets,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Loss of Assets@en",
   :rdfs/subClassOf     :dpvo/MaterialDamage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def LossCompetitiveAdvantage
  ""
  {:db/ident            :dpvo-risk/LossCompetitiveAdvantage,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Loss of Competitive Advantage@en",
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def LossControlOverData
  ""
  {:db/ident            :dpvo-risk/LossControlOverData,
   :dcterms/created     #inst "2022-08-19T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Loss of Control over Data@en",
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def LossCredibility
  ""
  {:db/ident            :dpvo-risk/LossCredibility,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Loss of Credibility@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def LossCustomerConfidence
  ""
  {:db/ident            :dpvo-risk/LossCustomerConfidence,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Loss of Customer Confidence@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def LossCustomers
  ""
  {:db/ident            :dpvo-risk/LossCustomers,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Loss of Customers@en",
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def LossData
  ""
  {:db/ident :dpvo-risk/LossData,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Loss of Data@en",
   :rdfs/subClassOf :dpvo/NonMaterialDamage,
   :vs/term_status #voc/lstr "accepted@en"})

(def LossFunds
  ""
  {:db/ident            :dpvo-risk/LossFunds,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Loss of Funds@en",
   :rdfs/subClassOf     :dpvo/MaterialDamage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def LossGoods
  ""
  {:db/ident            :dpvo-risk/LossGoods,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Loss of Goods@en",
   :rdfs/subClassOf     :dpvo/MaterialDamage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def LossGoodwill
  ""
  {:db/ident            :dpvo-risk/LossGoodwill,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Loss of Goodwill@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def LossNegotiatingCapacity
  ""
  {:db/ident            :dpvo-risk/LossNegotiatingCapacity,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Loss of Negotiating Capacity@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def LossOpportunity
  ""
  {:db/ident            :dpvo-risk/LossOpportunity,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Loss of Opportunity@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def LossProprietaryInformation
  ""
  {:db/ident            :dpvo-risk/LossProprietaryInformation,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Loss of Proprietary Information@en",
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def LossReputation
  ""
  {:db/ident            :dpvo-risk/LossReputation,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Loss of Reputation@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def LossResources
  ""
  {:db/ident :dpvo-risk/LossResources,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Loss of Resources@en",
   :rdfs/subClassOf :dpvo/NonMaterialDamage,
   :vs/term_status #voc/lstr "accepted@en"})

(def LossSuppliers
  ""
  {:db/ident            :dpvo-risk/LossSuppliers,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Loss of Suppliers@en",
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def LossTechnologicalAdvantage
  ""
  {:db/ident            :dpvo-risk/LossTechnologicalAdvantage,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Loss of Technological Advantage@en",
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def LossTrust
  ""
  {:db/ident            :dpvo-risk/LossTrust,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Loss of Trust@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def LowLikelihood
  "Level where Likelihood is Low"
  {:db/ident :dpvo-risk/LowLikelihood,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Level where Likelihood is Low@en",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/|7LikelihoodLevels|
              :dpvo/Likelihood
              :dpvo-risk/|5LikelihoodLevels|
              :dpvo-risk/|3LikelihoodLevels|],
   :rdf/value {:xsd/decimal 0.25M},
   :rdfs/comment
   #voc/lstr
    "The suggested quantitative value for this concept is 0.25 on a scale of 0 to 1@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Low Likelihood@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def LowRisk
  "Level where Risk is Low"
  {:db/ident :dpvo-risk/LowRisk,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Level where Risk is Low@en",
   :rdf/type [:dpvo-risk/|3RiskLevels|
              :dpvo-risk/|5RiskLevels|
              :dpvo/RiskLevel
              :owl/NamedIndividual
              :dpvo-risk/|7RiskLevels|],
   :rdf/value {:xsd/decimal 0.25M},
   :rdfs/comment
   #voc/lstr
    "The suggested quantitative value for this concept is 0.25 on a scale of 0 to 1@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Low Risk@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def LowSeverity
  "Level where Severity is Low"
  {:db/ident :dpvo-risk/LowSeverity,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Level where Severity is Low@en",
   :rdf/type [:dpvo-risk/|5SeverityLevels|
              :dpvo-risk/|3SeverityLevels|
              :dpvo-risk/|7SeverityLevels|
              :dpvo/Severity
              :owl/NamedIndividual],
   :rdf/value {:xsd/decimal 0.25M},
   :rdfs/comment
   #voc/lstr
    "The suggested quantitative value for this concept is 0.25 on a scale of 0 to 1@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Low Severity@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def MAGERIT
  "Method for the Harmonised Analysis of Risk (MAGERIT) is an open methodology for risk analysis and management developed by the Spanish Higher Council for Electronic Government and offered as a framework and guide to the public administration"
  {:db/ident :dpvo-risk/MAGERIT,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Method for the Harmonised Analysis of Risk (MAGERIT) is an open methodology for risk analysis and management developed by the Spanish Higher Council for Electronic Government and offered as a framework and guide to the public administration@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "MAGERIT@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def MCA
  "Compares options in a way that makes trade-offs explicit. Provides an alternative to cost/benefit analysis that does not need a monetary value to be allocated to all inputs."
  {:db/ident :dpvo-risk/MCA,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Compares options in a way that makes trade-offs explicit. Provides an alternative to cost/benefit analysis that does not need a monetary value to be allocated to all inputs.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo/RiskManagementProcess
              :dpvo-risk/RiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Multi-criteria Analysis (MCA)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def MEHARI
  "MEHARI is a free of charge qualitative risk analysis and management method developed by CLUSIF (Club for the Security of Information in France/Club de la Sécurité de l'Information Français)"
  {:db/ident :dpvo-risk/MEHARI,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "MEHARI is a free of charge qualitative risk analysis and management method developed by CLUSIF (Club for the Security of Information in France/Club de la Sécurité de l'Information Français)@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/RiskManagementMethodology
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "MEHARI@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def MONARC
  "MONARC (Méthode Optimisée d’analyse des risques CASES – ‘Method for an Optimised Analysis of Risks by CASES’ is a tool and a method allowing precise and repeatable risk assessments to take place"
  {:db/ident :dpvo-risk/MONARC,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "MONARC (Méthode Optimisée d’analyse des risques CASES – ‘Method for an Optimised Analysis of Risks by CASES’ is a tool and a method allowing precise and repeatable risk assessments to take place@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "MONARC@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def MaliciousCodeAttack
  "Intentional use of software by including or inserting in a system for a harmful purpose"
  {:db/ident :dpvo-risk/MaliciousCodeAttack,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Intentional use of software by including or inserting in a system for a harmful purpose@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Malicious Code Attack@en",
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status #voc/lstr "accepted@en"})

(def MalwareAttack
  "Malware is software or firmware intended to perform an unauthorised process that will have an adverse impact on the confidentiality, integrity, or availability of a system"
  {:db/ident :dpvo-risk/MalwareAttack,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Malware is software or firmware intended to perform an unauthorised process that will have an adverse impact on the confidentiality, integrity, or availability of a system@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Malware Attack@en",
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status #voc/lstr "accepted@en"})

(def MarkovAnalysis
  "Calculates the probability that a system that has the capacity to be in one of a number of states will be in a particular state at a time t in the future."
  {:db/ident :dpvo-risk/MarkovAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Calculates the probability that a system that has the capacity to be in one of a number of states will be in a particular state at a time t in the future.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Markov Analysis@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def MisinformationDisinformation
  "Information that is untrue, misleading, or false and used intentionally (disinformation) or unintentionally (misinformation)"
  {:db/ident :dpvo-risk/MisinformationDisinformation,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Information that is untrue, misleading, or false and used intentionally (disinformation) or unintentionally (misinformation)@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/enisa-threat-landscape-2021",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "MisinformationDisinformation@en",
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status #voc/lstr "accepted@en"})

(def MisuseBreachedInformation
  ""
  {:db/ident            :dpvo-risk/MisuseBreachedInformation,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Misuse of Breached Information@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def ModerateLikelihood
  "Level where Likelihood is Moderate"
  {:db/ident :dpvo-risk/ModerateLikelihood,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Level where Likelihood is Moderate@en",
   :rdf/type [:dpvo-risk/|5LikelihoodLevels|
              :dpvo/Likelihood
              :dpvo-risk/|3LikelihoodLevels|
              :dpvo-risk/|7LikelihoodLevels|
              :owl/NamedIndividual],
   :rdf/value {:xsd/decimal 0.5M},
   :rdfs/comment
   #voc/lstr
    "The suggested quantitative value for this concept is 0.5 on a scale of 0 to 1@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Moderate Likelihood@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ModerateRisk
  "Level where Risk is Moderate"
  {:db/ident :dpvo-risk/ModerateRisk,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Level where Risk is Moderate@en",
   :rdf/type [:dpvo-risk/|3RiskLevels|
              :dpvo-risk/|7RiskLevels|
              :dpvo/RiskLevel
              :owl/NamedIndividual
              :dpvo-risk/|5RiskLevels|],
   :rdf/value {:xsd/decimal 0.5M},
   :rdfs/comment
   #voc/lstr
    "The suggested quantitative value for this concept is 0.5 on a scale of 0 to 1@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Moderate Risk@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ModerateSeverity
  "Level where Severity is Moderate"
  {:db/ident :dpvo-risk/ModerateSeverity,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Level where Severity is Moderate@en",
   :rdf/type [:dpvo/Severity
              :dpvo-risk/|5SeverityLevels|
              :dpvo-risk/|3SeverityLevels|
              :dpvo-risk/|7SeverityLevels|
              :owl/NamedIndividual],
   :rdf/value {:xsd/decimal 0.5M},
   :rdfs/comment
   #voc/lstr
    "The suggested quantitative value for this concept is 0.5 on a scale of 0 to 1@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Moderate Severity@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def MonitorConsequence
  "Risk Control that monitors a Risk Consequence"
  {:db/ident            :dpvo-risk/MonitorConsequence,
   :dcterms/created     #inst "2022-09-03T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Risk Control that monitors a Risk Consequence@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Monitor Consequence@en",
   :rdfs/subClassOf     [:dpvo-risk/ControlMonitors
                         :dpvo/RiskMitigationMeasure],
   :vs/term_status      #voc/lstr "accepted@en"})

(def MonitorImpact
  "Risk Control that monitors a Risk Impact"
  {:db/ident            :dpvo-risk/MonitorImpact,
   :dcterms/created     #inst "2022-09-04T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Risk Control that monitors a Risk Impact@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Monitor Impact@en",
   :rdfs/subClassOf     [:dpvo-risk/ControlMonitors
                         :dpvo/RiskMitigationMeasure],
   :vs/term_status      #voc/lstr "accepted@en"})

(def MonitorRisk
  "Risk Control that monitors a Risk"
  {:db/ident            :dpvo-risk/MonitorRisk,
   :dcterms/created     #inst "2022-08-31T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Risk Control that monitors a Risk@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Monitor Risk@en",
   :rdfs/subClassOf     [:dpvo-risk/ControlMonitors
                         :dpvo/RiskMitigationMeasure],
   :vs/term_status      #voc/lstr "accepted@en"})

(def MonitorRiskControl
  "Risk Control that monitors another Risk Control"
  {:db/ident            :dpvo-risk/MonitorRiskControl,
   :dcterms/created     #inst "2022-09-05T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Risk Control that monitors another Risk Control@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Monitor Risk Control@en",
   :rdfs/subClassOf     [:dpvo-risk/ControlMonitors
                         :dpvo/RiskMitigationMeasure],
   :vs/term_status      #voc/lstr "accepted@en"})

(def MonitorRiskSource
  "Risk Control that monitors a Risk Source"
  {:db/ident            :dpvo-risk/MonitorRiskSource,
   :dcterms/created     #inst "2022-09-01T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Risk Control that monitors a Risk Source@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Monitor Risk Source@en",
   :rdfs/subClassOf     [:dpvo-risk/ControlMonitors
                         :dpvo/RiskMitigationMeasure],
   :vs/term_status      #voc/lstr "accepted@en"})

(def MonitorVulnerabilities
  "Risk Control that monitors a Risk Vulnerability"
  {:db/ident            :dpvo-risk/MonitorVulnerabilities,
   :dcterms/created     #inst "2022-09-02T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Risk Control that monitors a Risk Vulnerability@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Monitor Vulnerabilities@en",
   :rdfs/subClassOf     [:dpvo-risk/ControlMonitors
                         :dpvo/RiskMitigationMeasure],
   :vs/term_status      #voc/lstr "accepted@en"})

(def MonteCarloSimulation
  "Calculates the probability of outcomes by running multiple simulations using random variables."
  {:db/ident :dpvo-risk/MonteCarloSimulation,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Calculates the probability of outcomes by running multiple simulations using random variables.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Monte Carlo Simulation@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def NIST-SP-800-30
  "NIST 800-30 is a free guide that provides a foundation for the development of an effective risk management programme, containing both the definitions and the practical guidance necessary for assessing and mitigating risks identified within IT systems"
  {:db/ident :dpvo-risk/NIST-SP-800-30,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "NIST 800-30 is a free guide that provides a foundation for the development of an effective risk management programme, containing both the definitions and the practical guidance necessary for assessing and mitigating risks identified within IT systems@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/RiskManagementMethodology
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "NIST SP 800-30@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def NIST-SP-800-37
  "NIST SP 800-37 Rev. 2 is an asset-based RMF which comprises 7 steps, namely Prepare, Categorise, Select, Implement, Assess, Authorise and Monitor. It does not adopt a specific risk assessment methodology, although the NIST 800-30 guide is extensively referenced"
  {:db/ident :dpvo-risk/NIST-SP-800-37,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "NIST SP 800-37 Rev. 2 is an asset-based RMF which comprises 7 steps, namely Prepare, Categorise, Select, Implement, Assess, Authorise and Monitor. It does not adopt a specific risk assessment methodology, although the NIST 800-30 guide is extensively referenced@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "NIST SP 800-37@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def NIST-SP-800-39
  "The purpose of NIST SP 800-39 is to provide a structured, yet flexible approach for an integrated, enterprise-wide programme for managing the risk to information security of organisational operations (i.e. mission, functions, image, and reputation) and assets, individuals, other organisations etc. on an ongoing basis"
  {:db/ident :dpvo-risk/NIST-SP-800-39,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "The purpose of NIST SP 800-39 is to provide a structured, yet flexible approach for an integrated, enterprise-wide programme for managing the risk to information security of organisational operations (i.e. mission, functions, image, and reputation) and assets, individuals, other organisations etc. on an ongoing basis@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "NIST SP 800–39@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def NIST-SP-800-82
  "NIST SP 800-82 Rev. 2 (Stouffer, et al., 2015), entitled ‘Guide to industrial control systems (ISC) security’, is an Industrial Control Systems Security Guide"
  {:db/ident :dpvo-risk/NIST-SP-800-82,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "NIST SP 800-82 Rev. 2 (Stouffer, et al., 2015), entitled ‘Guide to industrial control systems (ISC) security’, is an Industrial Control Systems Security Guide@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "NIST SP 800–82@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def NominalGroupTechnique
  "Technique for eliciting views from a group of people where initial participation is as individuals with no interaction, then group discussion of ideas follows."
  {:db/ident :dpvo-risk/NominalGroupTechnique,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Technique for eliciting views from a group of people where initial participation is as individuals with no interaction, then group discussion of ideas follows.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo/RiskManagementProcess
              :dpvo-risk/RiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Nominal Group Technique@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def O-RA
  "The Open Group Standard for Risk Analysis (O-RA) provides a set of standards for various aspects of information security risk analysis that is based on the Open FAIR framework and can be applied to any risk scenario"
  {:db/ident :dpvo-risk/O-RA,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "The Open Group Standard for Risk Analysis (O-RA) provides a set of standards for various aspects of information security risk analysis that is based on the Open FAIR framework and can be applied to any risk scenario@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "O-RA@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def OCTAVE
  "Operationally Critical Threat, Asset, and Vulnerability Evaluation (OCTAVE) is a free of charge approach to evaluations of information security risk that is comprehensive, systematic, context-driven, and self-directed"
  {:db/ident :dpvo-risk/OCTAVE,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Operationally Critical Threat, Asset, and Vulnerability Evaluation (OCTAVE) is a free of charge approach to evaluations of information security risk that is comprehensive, systematic, context-driven, and self-directed@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "OCTAVE@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def OCTAVE-ALLEGRO
  "OCTAVE Allegro is designed to allow broad assessment of an organisation’s operational risk environment, with the goal of producing robust results without the need for extensive knowledge of risk assessment"
  {:db/ident :dpvo-risk/OCTAVE-ALLEGRO,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "OCTAVE Allegro is designed to allow broad assessment of an organisation’s operational risk environment, with the goal of producing robust results without the need for extensive knowledge of risk assessment@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/RiskManagementMethodology
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "OCTAVE ALLEGRO@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def OCTAVE-FORTE
  "The OCTAVE FORTE process model was developed to support organisations in evaluating their security risks. It applies Enterprise Risk Management (ERM) principles to bridge the gap between executives and practitioners acting as decision makers"
  {:db/ident :dpvo-risk/OCTAVE-FORTE,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "The OCTAVE FORTE process model was developed to support organisations in evaluating their security risks. It applies Enterprise Risk Management (ERM) principles to bridge the gap between executives and practitioners acting as decision makers@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "OCTAVE FORTE@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def OCTAVE-S
  "The OCTAVE-S is based on the OCTAVE approach and is a self-directed approach, meaning that people from an organisation assume responsibility for setting the organisation’s security strategy"
  {:db/ident :dpvo-risk/OCTAVE-S,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "The OCTAVE-S is based on the OCTAVE approach and is a self-directed approach, meaning that people from an organisation assume responsibility for setting the organisation’s security strategy@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type [:dpvo-risk/RiskManagementMethodology
              :owl/NamedIndividual
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "OCTAVE-S@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def OrganisationDisruption
  ""
  {:db/ident            :dpvo-risk/OrganisationDisruption,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Organisation Disruption@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def PIA
  "Analyses how incidents and events could affect a person's privacy and identifies and quantifies the capabilities that would be needed to manage it."
  {:db/ident :dpvo-risk/PIA,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Analyses how incidents and events could affect a person's privacy and identifies and quantifies the capabilities that would be needed to manage it.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo/RiskManagementProcess
              :dpvo-risk/RiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Privacy Impact Analysis (PIA)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ParetoCharts
  "The Pareto principle (the 80–20 rule) states that, for many events, roughly 80 % of the effects come from 20 % of the causes."
  {:db/ident :dpvo-risk/ParetoCharts,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "The Pareto principle (the 80–20 rule) states that, for many events, roughly 80 % of the effects come from 20 % of the causes.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Pareto Charts@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def PersonalSafetyEndangerment
  ""
  {:db/ident            :dpvo-risk/PersonalSafetyEndangerment,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Personal Safety Endangerment@en",
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      #voc/lstr "accepted@en"})

(def PersonnelAbsence
  ""
  {:db/ident :dpvo-risk/PersonnelAbsence,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Personnel Absence@en",
   :rdfs/subClassOf :dpvo/NonMaterialDamage,
   :vs/term_status #voc/lstr "accepted@en"})

(def PhishingScam
  "A type of social engineering attack involving deceptive messages intended to reveal sensitive information"
  {:db/ident :dpvo-risk/PhishingScam,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A type of social engineering attack involving deceptive messages intended to reveal sensitive information@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/enisa-threat-landscape-for-ransomware-attacks",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Phishing Scam@en",
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status #voc/lstr "accepted@en"})

(def PhysicalAssault
  ""
  {:db/ident            :dpvo-risk/PhysicalAssault,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Physical Assault@en",
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      #voc/lstr "accepted@en"})

(def PhysicalSpying
  ""
  {:db/ident            :dpvo-risk/PhysicalSpying,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Physical Spying@en",
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def PhysicalStalking
  ""
  {:db/ident            :dpvo-risk/PhysicalStalking,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Physical Stalking@en",
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def PreventExercisingOfRights
  ""
  {:db/ident            :dpvo-risk/PreventExercisingOfRights,
   :dcterms/created     #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Prevent Exercising of Rights@en",
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      #voc/lstr "accepted@en"})

(def PrivacyImpact
  ""
  {:db/ident :dpvo-risk/PrivacyImpact,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Privacy impact@en",
   :rdfs/subClassOf :dpvo/Impact,
   :vs/term_status #voc/lstr "accepted@en"})

(def PsychologicalHarm
  ""
  {:db/ident :dpvo-risk/PsychologicalHarm,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Psychological Harm@en",
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status #voc/lstr "accepted@en"})

(def PublicOrderBreach
  ""
  {:db/ident            :dpvo-risk/PublicOrderBreach,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Public Order Breach@en",
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def QualitativeRiskAssessmentTechnique
  "A risk assessment technique that uses qualitative methods"
  {:db/ident :dpvo-risk/QualitativeRiskAssessmentTechnique,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "A risk assessment technique that uses qualitative methods@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Qualitative Risk Assessment Technique@en",
   :rdfs/subClassOf [:dpvo-risk/RiskAssessmentTechnique
                     :dpvo/RiskManagementProcess],
   :vs/term_status #voc/lstr "accepted@en"})

(def QuantitativeRiskAssessmentTechnique
  "A risk assessment technique that uses quantitative methods"
  {:db/ident :dpvo-risk/QuantitativeRiskAssessmentTechnique,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "A risk assessment technique that uses quantitative methods@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Quantitative Risk Assessment Technique@en",
   :rdfs/subClassOf [:dpvo-risk/RiskAssessmentTechnique
                     :dpvo/RiskManagementProcess],
   :vs/term_status #voc/lstr "accepted@en"})

(def RM3x3S1L1
  "Node in a 3x3 Risk Matrix with Risk Severity: Low; Likelihood: Low; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM3x3S1L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 3x3 Risk Matrix with Risk Severity: Low; Likelihood: Low; and Risk Level: Low@en",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix3x3 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.11M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Low Risk (RM3x3 S:1 L:1)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM3x3S1L2
  "Node in a 3x3 Risk Matrix with Risk Severity: Low; Likelihood: Moderate; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM3x3S1L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 3x3 Risk Matrix with Risk Severity: Low; Likelihood: Moderate; and Risk Level: Low@en",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix3x3 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.22M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Low Risk (RM3x3 S:1 L:2)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM3x3S1L3
  "Node in a 3x3 Risk Matrix with Risk Severity: Low; Likelihood: High; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM3x3S1L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 3x3 Risk Matrix with Risk Severity: Low; Likelihood: High; and Risk Level: Moderate@en",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix3x3 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.33M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Moderate Risk (RM3x3 S:1 L:3)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM3x3S2L1
  "Node in a 3x3 Risk Matrix with Risk Severity: Moderate; Likelihood: Low; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM3x3S2L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 3x3 Risk Matrix with Risk Severity: Moderate; Likelihood: Low; and Risk Level: Low@en",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix3x3 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.22M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Low Risk (RM3x3 S:2 L:1)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM3x3S2L2
  "Node in a 3x3 Risk Matrix with Risk Severity: Moderate; Likelihood: Moderate; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM3x3S2L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 3x3 Risk Matrix with Risk Severity: Moderate; Likelihood: Moderate; and Risk Level: Moderate@en",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix3x3 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.44M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Moderate Risk (RM3x3 S:2 L:2)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM3x3S2L3
  "Node in a 3x3 Risk Matrix with Risk Severity: Moderate; Likelihood: High; and Risk Level: High"
  {:db/ident :dpvo-risk/RM3x3S2L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 3x3 Risk Matrix with Risk Severity: Moderate; Likelihood: High; and Risk Level: High@en",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix3x3 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.67M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "High Risk (RM3x3 S:2 L:3)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM3x3S3L1
  "Node in a 3x3 Risk Matrix with Risk Severity: High; Likelihood: Low; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM3x3S3L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 3x3 Risk Matrix with Risk Severity: High; Likelihood: Low; and Risk Level: Moderate@en",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix3x3 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.33M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Moderate Risk (RM3x3 S:3 L:1)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM3x3S3L2
  "Node in a 3x3 Risk Matrix with Risk Severity: High; Likelihood: Moderate; and Risk Level: High"
  {:db/ident :dpvo-risk/RM3x3S3L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 3x3 Risk Matrix with Risk Severity: High; Likelihood: Moderate; and Risk Level: High@en",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix3x3 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.67M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "High Risk (RM3x3 S:3 L:2)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM3x3S3L3
  "Node in a 3x3 Risk Matrix with Risk Severity: High; Likelihood: High; and Risk Level: High"
  {:db/ident :dpvo-risk/RM3x3S3L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 3x3 Risk Matrix with Risk Severity: High; Likelihood: High; and Risk Level: High@en",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix3x3 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/long 1},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "High Risk (RM3x3 S:3 L:3)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM5x5S1L1
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryLow; and Risk Level: VeryLow"
  {:db/ident :dpvo-risk/RM5x5S1L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryLow; and Risk Level: VeryLow@en",
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.04M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very Low Risk (RM5x5 S:1 L:1)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM5x5S1L2
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: Low; and Risk Level: VeryLow"
  {:db/ident :dpvo-risk/RM5x5S1L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: Low; and Risk Level: VeryLow@en",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.08M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very Low Risk (RM5x5 S:1 L:2)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM5x5S1L3
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: Moderate; and Risk Level: VeryLow"
  {:db/ident :dpvo-risk/RM5x5S1L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: Moderate; and Risk Level: VeryLow@en",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.12M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very Low Risk (RM5x5 S:1 L:3)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM5x5S1L4
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: High; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM5x5S1L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: High; and Risk Level: Low@en",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.16M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Low Risk (RM5x5 S:1 L:4)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM5x5S1L5
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryHigh; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM5x5S1L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryHigh; and Risk Level: Low@en",
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.2M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Low Risk (RM5x5 S:1 L:5)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM5x5S2L1
  "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: VeryLow; and Risk Level: VeryLow"
  {:db/ident :dpvo-risk/RM5x5S2L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: VeryLow; and Risk Level: VeryLow@en",
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.08M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very Low Risk (RM5x5 S:2 L:1)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM5x5S2L2
  "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: Low; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM5x5S2L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: Low; and Risk Level: Low@en",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.16M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Low Risk (RM5x5 S:2 L:2)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM5x5S2L3
  "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: Moderate; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM5x5S2L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: Moderate; and Risk Level: Moderate@en",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.24M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Moderate Risk (RM5x5 S:2 L:3)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM5x5S2L4
  "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: High; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM5x5S2L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: High; and Risk Level: Moderate@en",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.32M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Moderate Risk (RM5x5 S:2 L:4)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM5x5S2L5
  "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: VeryHigh; and Risk Level: High"
  {:db/ident :dpvo-risk/RM5x5S2L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: VeryHigh; and Risk Level: High@en",
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.4M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "High Risk (RM5x5 S:2 L:5)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM5x5S3L1
  "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryLow; and Risk Level: VeryLow"
  {:db/ident :dpvo-risk/RM5x5S3L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryLow; and Risk Level: VeryLow@en",
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.12M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very Low Risk (RM5x5 S:3 L:1)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM5x5S3L2
  "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: Low; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM5x5S3L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: Low; and Risk Level: Moderate@en",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.24M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Moderate Risk (RM5x5 S:3 L:2)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM5x5S3L3
  "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: Moderate; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM5x5S3L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: Moderate; and Risk Level: Moderate@en",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.36M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Moderate Risk (RM5x5 S:3 L:3)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM5x5S3L4
  "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: High; and Risk Level: High"
  {:db/ident :dpvo-risk/RM5x5S3L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: High; and Risk Level: High@en",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.48M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "High Risk (RM5x5 S:3 L:4)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM5x5S3L5
  "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryHigh; and Risk Level: VeryHigh"
  {:db/ident :dpvo-risk/RM5x5S3L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryHigh; and Risk Level: VeryHigh@en",
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.6M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very High Risk (RM5x5 S:3 L:5)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM5x5S4L1
  "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: VeryLow; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM5x5S4L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: VeryLow; and Risk Level: Low@en",
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.16M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Low Risk (RM5x5 S:4 L:1)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM5x5S4L2
  "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: Low; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM5x5S4L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: Low; and Risk Level: Moderate@en",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.32M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Moderate Risk (RM5x5 S:4 L:2)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM5x5S4L3
  "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: Moderate; and Risk Level: High"
  {:db/ident :dpvo-risk/RM5x5S4L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: Moderate; and Risk Level: High@en",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.48M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "High Risk (RM5x5 S:4 L:3)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM5x5S4L4
  "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: High; and Risk Level: VeryHigh"
  {:db/ident :dpvo-risk/RM5x5S4L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: High; and Risk Level: VeryHigh@en",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.64M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very High Risk (RM5x5 S:4 L:4)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM5x5S4L5
  "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: VeryHigh; and Risk Level: VeryHigh"
  {:db/ident :dpvo-risk/RM5x5S4L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: VeryHigh; and Risk Level: VeryHigh@en",
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.8M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very High Risk (RM5x5 S:4 L:5)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM5x5S5L1
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryLow; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM5x5S5L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryLow; and Risk Level: Low@en",
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.2M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Low Risk (RM5x5 S:5 L:1)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM5x5S5L2
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Low; and Risk Level: High"
  {:db/ident :dpvo-risk/RM5x5S5L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Low; and Risk Level: High@en",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.4M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "High Risk (RM5x5 S:5 L:2)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM5x5S5L3
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Moderate; and Risk Level: High"
  {:db/ident :dpvo-risk/RM5x5S5L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Moderate; and Risk Level: High@en",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.6M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "High Risk (RM5x5 S:5 L:3)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM5x5S5L4
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: High; and Risk Level: VeryHigh"
  {:db/ident :dpvo-risk/RM5x5S5L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: High; and Risk Level: VeryHigh@en",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.8M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very High Risk (RM5x5 S:5 L:4)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM5x5S5L5
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryHigh; and Risk Level: VeryHigh"
  {:db/ident :dpvo-risk/RM5x5S5L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryHigh; and Risk Level: VeryHigh@en",
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/long 1},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very High Risk (RM5x5 S:5 L:5)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S1L1
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow"
  {:db/ident :dpvo-risk/RM7x7S1L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow@en",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.02M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Extremely Low Risk (RM7x7 S:1 L:1)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S1L2
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: VeryLow; and Risk Level: ExtremelyLow"
  {:db/ident :dpvo-risk/RM7x7S1L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: VeryLow; and Risk Level: ExtremelyLow@en",
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.04M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Extremely Low Risk (RM7x7 S:1 L:2)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S1L3
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: Low; and Risk Level: ExtremelyLow"
  {:db/ident :dpvo-risk/RM7x7S1L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: Low; and Risk Level: ExtremelyLow@en",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.06M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Extremely Low Risk (RM7x7 S:1 L:3)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S1L4
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: Moderate; and Risk Level: VeryLow"
  {:db/ident :dpvo-risk/RM7x7S1L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: Moderate; and Risk Level: VeryLow@en",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.08M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very Low Risk (RM7x7 S:1 L:4)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S1L5
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: High; and Risk Level: VeryLow"
  {:db/ident :dpvo-risk/RM7x7S1L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: High; and Risk Level: VeryLow@en",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.1M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very Low Risk (RM7x7 S:1 L:5)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S1L6
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: VeryHigh; and Risk Level: VeryLow"
  {:db/ident :dpvo-risk/RM7x7S1L6,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: VeryHigh; and Risk Level: VeryLow@en",
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.12M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very Low Risk (RM7x7 S:1 L:6)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S1L7
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: ExtremelyHigh; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM7x7S1L7,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: ExtremelyHigh; and Risk Level: Low@en",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.14M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Low Risk (RM7x7 S:1 L:7)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S2L1
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow"
  {:db/ident :dpvo-risk/RM7x7S2L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow@en",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.04M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Extremely Low Risk (RM7x7 S:2 L:1)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S2L2
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryLow; and Risk Level: ExtremelyLow"
  {:db/ident :dpvo-risk/RM7x7S2L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryLow; and Risk Level: ExtremelyLow@en",
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.08M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Extremely Low Risk (RM7x7 S:2 L:2)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S2L3
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: Low; and Risk Level: VeryLow"
  {:db/ident :dpvo-risk/RM7x7S2L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: Low; and Risk Level: VeryLow@en",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.12M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very Low Risk (RM7x7 S:2 L:3)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S2L4
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: Moderate; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM7x7S2L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: Moderate; and Risk Level: Low@en",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.16M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Low Risk (RM7x7 S:2 L:4)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S2L5
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: High; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM7x7S2L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: High; and Risk Level: Low@en",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.2M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Low Risk (RM7x7 S:2 L:5)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S2L6
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryHigh; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM7x7S2L6,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryHigh; and Risk Level: Moderate@en",
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.24M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Moderate Risk (RM7x7 S:2 L:6)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S2L7
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: ExtremelyHigh; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM7x7S2L7,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: ExtremelyHigh; and Risk Level: Moderate@en",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.29M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Moderate Risk (RM7x7 S:2 L:7)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S3L1
  "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow"
  {:db/ident :dpvo-risk/RM7x7S3L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow@en",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.06M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Extremely Low Risk (RM7x7 S:3 L:1)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S3L2
  "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: VeryLow; and Risk Level: VeryLow"
  {:db/ident :dpvo-risk/RM7x7S3L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: VeryLow; and Risk Level: VeryLow@en",
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.12M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very Low Risk (RM7x7 S:3 L:2)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S3L3
  "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: Low; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM7x7S3L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: Low; and Risk Level: Low@en",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.18M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Low Risk (RM7x7 S:3 L:3)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S3L4
  "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: Moderate; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM7x7S3L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: Moderate; and Risk Level: Moderate@en",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.24M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Moderate Risk (RM7x7 S:3 L:4)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S3L5
  "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: High; and Risk Level: High"
  {:db/ident :dpvo-risk/RM7x7S3L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: High; and Risk Level: High@en",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.31M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "High Risk (RM7x7 S:3 L:5)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S3L6
  "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: VeryHigh; and Risk Level: High"
  {:db/ident :dpvo-risk/RM7x7S3L6,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: VeryHigh; and Risk Level: High@en",
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.37M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "High Risk (RM7x7 S:3 L:6)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S3L7
  "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: ExtremelyHigh; and Risk Level: VeryHigh"
  {:db/ident :dpvo-risk/RM7x7S3L7,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: ExtremelyHigh; and Risk Level: VeryHigh@en",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.43M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very High Risk (RM7x7 S:3 L:7)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S4L1
  "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow"
  {:db/ident :dpvo-risk/RM7x7S4L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow@en",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.08M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Extremely Low Risk (RM7x7 S:4 L:1)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S4L2
  "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryLow; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM7x7S4L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryLow; and Risk Level: Low@en",
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.16M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Low Risk (RM7x7 S:4 L:2)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S4L3
  "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: Low; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM7x7S4L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: Low; and Risk Level: Moderate@en",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.24M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Moderate Risk (RM7x7 S:4 L:3)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S4L4
  "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: Moderate; and Risk Level: High"
  {:db/ident :dpvo-risk/RM7x7S4L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: Moderate; and Risk Level: High@en",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.33M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "High Risk (RM7x7 S:4 L:4)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S4L5
  "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: High; and Risk Level: High"
  {:db/ident :dpvo-risk/RM7x7S4L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: High; and Risk Level: High@en",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.41M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "High Risk (RM7x7 S:4 L:5)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S4L6
  "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryHigh; and Risk Level: VeryHigh"
  {:db/ident :dpvo-risk/RM7x7S4L6,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryHigh; and Risk Level: VeryHigh@en",
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.49M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very High Risk (RM7x7 S:4 L:6)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S4L7
  "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: ExtremelyHigh; and Risk Level: VeryHigh"
  {:db/ident :dpvo-risk/RM7x7S4L7,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: ExtremelyHigh; and Risk Level: VeryHigh@en",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.57M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very High Risk (RM7x7 S:4 L:7)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S5L1
  "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: ExtremelyLow; and Risk Level: VeryLow"
  {:db/ident :dpvo-risk/RM7x7S5L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: ExtremelyLow; and Risk Level: VeryLow@en",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.1M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very Low Risk (RM7x7 S:5 L:1)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S5L2
  "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: VeryLow; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM7x7S5L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: VeryLow; and Risk Level: Low@en",
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.2M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Low Risk (RM7x7 S:5 L:2)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S5L3
  "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: Low; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM7x7S5L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: Low; and Risk Level: Moderate@en",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.31M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Moderate Risk (RM7x7 S:5 L:3)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S5L4
  "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: Moderate; and Risk Level: High"
  {:db/ident :dpvo-risk/RM7x7S5L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: Moderate; and Risk Level: High@en",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.41M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "High Risk (RM7x7 S:5 L:4)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S5L5
  "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: High; and Risk Level: VeryHigh"
  {:db/ident :dpvo-risk/RM7x7S5L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: High; and Risk Level: VeryHigh@en",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.51M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very High Risk (RM7x7 S:5 L:5)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S5L6
  "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: VeryHigh; and Risk Level: ExtremelyHigh"
  {:db/ident :dpvo-risk/RM7x7S5L6,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: VeryHigh; and Risk Level: ExtremelyHigh@en",
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.61M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Extremely High Risk (RM7x7 S:5 L:6)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S5L7
  "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: ExtremelyHigh; and Risk Level: ExtremelyHigh"
  {:db/ident :dpvo-risk/RM7x7S5L7,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: ExtremelyHigh; and Risk Level: ExtremelyHigh@en",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.71M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Extremely High Risk (RM7x7 S:5 L:7)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S6L1
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: ExtremelyLow; and Risk Level: VeryLow"
  {:db/ident :dpvo-risk/RM7x7S6L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: ExtremelyLow; and Risk Level: VeryLow@en",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.12M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very Low Risk (RM7x7 S:6 L:1)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S6L2
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryLow; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM7x7S6L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryLow; and Risk Level: Moderate@en",
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.24M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Moderate Risk (RM7x7 S:6 L:2)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S6L3
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Low; and Risk Level: High"
  {:db/ident :dpvo-risk/RM7x7S6L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Low; and Risk Level: High@en",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.37M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "High Risk (RM7x7 S:6 L:3)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S6L4
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Moderate; and Risk Level: VeryHigh"
  {:db/ident :dpvo-risk/RM7x7S6L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Moderate; and Risk Level: VeryHigh@en",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.49M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very High Risk (RM7x7 S:6 L:4)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S6L5
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: High; and Risk Level: VeryHigh"
  {:db/ident :dpvo-risk/RM7x7S6L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: High; and Risk Level: VeryHigh@en",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.61M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very High Risk (RM7x7 S:6 L:5)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S6L6
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryHigh; and Risk Level: ExtremelyHigh"
  {:db/ident :dpvo-risk/RM7x7S6L6,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryHigh; and Risk Level: ExtremelyHigh@en",
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.73M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Extremely High Risk (RM7x7 S:6 L:6)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S6L7
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: ExtremelyHigh; and Risk Level: ExtremelyHigh"
  {:db/ident :dpvo-risk/RM7x7S6L7,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: ExtremelyHigh; and Risk Level: ExtremelyHigh@en",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.86M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Extremely High Risk (RM7x7 S:6 L:7)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S7L1
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: ExtremelyLow; and Risk Level: Low"
  {:db/ident :dpvo-risk/RM7x7S7L1,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: ExtremelyLow; and Risk Level: Low@en",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.14M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Low Risk (RM7x7 S:7 L:1)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S7L2
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: VeryLow; and Risk Level: Moderate"
  {:db/ident :dpvo-risk/RM7x7S7L2,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: VeryLow; and Risk Level: Moderate@en",
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.29M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Moderate Risk (RM7x7 S:7 L:2)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S7L3
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: Low; and Risk Level: High"
  {:db/ident :dpvo-risk/RM7x7S7L3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: Low; and Risk Level: High@en",
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/type
   [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.43M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "High Risk (RM7x7 S:7 L:3)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S7L4
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: Moderate; and Risk Level: VeryHigh"
  {:db/ident :dpvo-risk/RM7x7S7L4,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: Moderate; and Risk Level: VeryHigh@en",
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.57M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very High Risk (RM7x7 S:7 L:4)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S7L5
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: High; and Risk Level: ExtremelyHigh"
  {:db/ident :dpvo-risk/RM7x7S7L5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: High; and Risk Level: ExtremelyHigh@en",
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.71M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Extremely High Risk (RM7x7 S:7 L:5)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S7L6
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: VeryHigh; and Risk Level: ExtremelyHigh"
  {:db/ident :dpvo-risk/RM7x7S7L6,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: VeryHigh; and Risk Level: ExtremelyHigh@en",
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/decimal 0.86M},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Extremely High Risk (RM7x7 S:7 L:6)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RM7x7S7L7
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: ExtremelyHigh; and Risk Level: ExtremelyHigh"
  {:db/ident :dpvo-risk/RM7x7S7L7,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: ExtremelyHigh; and Risk Level: ExtremelyHigh@en",
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/type
   [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7 :dpvo-risk/RiskMatrix],
   :rdf/value {:xsd/long 1},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Extremely High Risk (RM7x7 S:7 L:7)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RansomwareAttack
  "Ransomware is a type of attack where threat actors take control of a target’s assets and demand a ransom in exchange for the return of the asset’s availability and confidentiality"
  {:db/ident :dpvo-risk/RansomwareAttack,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Ransomware is a type of attack where threat actors take control of a target’s assets and demand a ransom in exchange for the return of the asset’s availability and confidentiality@en",
   :dcterms/source
   ["https://www.enisa.europa.eu/publications/enisa-threat-landscape-for-ransomware-attacks"
    "https://www.iso.org/standard/75281.html"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "RansomwareAttack@en",
   :rdfs/subClassOf :dpvo/NonMaterialDamage,
   :vs/term_status #voc/lstr "accepted@en"})

(def ReduceLikelihood
  "Risk Control that reduces the likelihood of an event"
  {:db/ident :dpvo-risk/ReduceLikelihood,
   :dcterms/created #inst "2022-08-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Risk Control that reduces the likelihood of an event@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Reduce Likelihood@en",
   :rdfs/subClassOf :dpvo/RiskMitigationMeasure,
   :vs/term_status #voc/lstr "accepted@en"})

(def ReduceSeverity
  "Risk Control that reduces the severity of an event"
  {:db/ident :dpvo-risk/ReduceSeverity,
   :dcterms/created #inst "2022-08-23T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Risk Control that reduces the severity of an event@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Reduce Severity@en",
   :rdfs/subClassOf :dpvo/RiskMitigationMeasure,
   :vs/term_status #voc/lstr "accepted@en"})

(def ReliabilityCentredMaintenance
  "A risk based assessment used to identify the appropriate maintenance tasks for a system and its components."
  {:db/ident :dpvo-risk/ReliabilityCentredMaintenance,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A risk based assessment used to identify the appropriate maintenance tasks for a system and its components.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Reliability Centred Maintenance@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RemoteSpying
  ""
  {:db/ident            :dpvo-risk/RemoteSpying,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Remote Spying@en",
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def RemoveConsequence
  "Risk Control that removes Consequence i.e. prevents it from materialising"
  {:db/ident :dpvo-risk/RemoveConsequence,
   :dcterms/created #inst "2022-08-27T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Risk Control that removes Consequence i.e. prevents it from materialising@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Remove Consequence@en",
   :rdfs/subClassOf [:dpvo-risk/ControlConsequence :dpvo/RiskMitigationMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def RemoveImpact
  "Risk Control that removes Impact i.e. prevents it from materialising"
  {:db/ident :dpvo-risk/RemoveImpact,
   :dcterms/created #inst "2022-08-28T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Risk Control that removes Impact i.e. prevents it from materialising@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Remove Impact@en",
   :rdfs/subClassOf [:dpvo-risk/ControlConsequence :dpvo/RiskMitigationMeasure],
   :vs/term_status #voc/lstr "accepted@en"})

(def RemoveSource
  "Risk Control that removes the risk source"
  {:db/ident            :dpvo-risk/RemoveSource,
   :dcterms/created     #inst "2022-08-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Risk Control that removes the risk source@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Remove Source@en",
   :rdfs/subClassOf     [:dpvo-risk/ControlRiskSource
                         :dpvo/RiskMitigationMeasure],
   :vs/term_status      #voc/lstr "accepted@en"})

(def ReplacementCosts
  ""
  {:db/ident            :dpvo-risk/ReplacementCosts,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Replacement Costs@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def ReputationTrustImpact
  ""
  {:db/ident :dpvo-risk/ReputationTrustImpact,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Reputation and trust impact@en",
   :rdfs/subClassOf :dpvo/Impact,
   :vs/term_status #voc/lstr "accepted@en"})

(def RetrievalDeletedData
  ""
  {:db/ident            :dpvo-risk/RetrievalDeletedData,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Retrieval of Deleted Data@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def RetrievalDiscardedEquipment
  ""
  {:db/ident            :dpvo-risk/RetrievalDiscardedEquipment,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Retrieval of Discarded Equipment@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def RiskAssessmentTechnique
  "A technique or method used to analyse and identify risk levels, sources, likelihoods, severities, and other necessary information required to conduct risk management procedures"
  {:db/ident :dpvo-risk/RiskAssessmentTechnique,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A technique or method used to analyse and identify risk levels, sources, likelihoods, severities, and other necessary information required to conduct risk management procedures@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Risk Assessment Technique@en",
   :rdfs/subClassOf :dpvo/RiskManagementProcess,
   :vs/term_status #voc/lstr "accepted@en"})

(def RiskIndices
  "Rates the significance of risks based on ratings applied to factors which are believed to influence the magnitude of the risk."
  {:db/ident :dpvo-risk/RiskIndices,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Rates the significance of risks based on ratings applied to factors which are believed to influence the magnitude of the risk.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Risk Indices@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RiskManagementMethodology
  "A risk management framework or methodology addresses the main functional components related to identification, assessment, treatment, and monitoring regarding risks"
  {:db/ident :dpvo-risk/RiskManagementMethodology,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A risk management framework or methodology addresses the main functional components related to identification, assessment, treatment, and monitoring regarding risks@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Risk Management Methodology@en",
   :rdfs/subClassOf :dpvo/RiskManagementProcess,
   :vs/term_status #voc/lstr "accepted@en"})

(def RiskMatrix
  "Compares individual risks by selecting a consequence/ likelihood pair and displaying them on a matrix with consequence on one axis and likelihood on the other."
  {:db/ident :dpvo-risk/RiskMatrix,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Compares individual risks by selecting a consequence/ likelihood pair and displaying them on a matrix with consequence on one axis and likelihood on the other.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Risk Matrix@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def RiskMatrix3x3
  "A Risk Matrix with 3 Likelihood, 3 Severity, and 3 Risk Level types"
  {:db/ident :dpvo-risk/RiskMatrix3x3,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A Risk Matrix with 3 Likelihood, 3 Severity, and 3 Risk Level types@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Risk Matrix 3x3@en",
   :rdfs/subClassOf :dpvo-risk/RiskMatrix,
   :vs/term_status #voc/lstr "accepted@en"})

(def RiskMatrix5x5
  "A Risk Matrix with 5 Likelihood, 5 Severity, and 5 Risk Level types"
  {:db/ident :dpvo-risk/RiskMatrix5x5,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A Risk Matrix with 5 Likelihood, 5 Severity, and 5 Risk Level types@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Risk Matrix 5x5@en",
   :rdfs/subClassOf :dpvo-risk/RiskMatrix,
   :vs/term_status #voc/lstr "accepted@en"})

(def RiskMatrix7x7
  "A Risk Matrix with 7 Likelihood, 7 Severity, and 7 Risk Level types"
  {:db/ident :dpvo-risk/RiskMatrix7x7,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A Risk Matrix with 7 Likelihood, 7 Severity, and 7 Risk Level types@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Risk Matrix 7x7@en",
   :rdfs/subClassOf :dpvo-risk/RiskMatrix,
   :vs/term_status #voc/lstr "accepted@en"})

(def RiskRegisters
  "A means of recording information about risks and tracking actions."
  {:db/ident :dpvo-risk/RiskRegisters,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A means of recording information about risks and tracking actions.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo/RiskManagementProcess
              :dpvo-risk/RiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Risk Registers@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def SCurves
  "A means of displaying the relationship between consequences and their likelihood plotted as a cumulative distribution function (S-curve)."
  {:db/ident :dpvo-risk/SCurves,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A means of displaying the relationship between consequences and their likelihood plotted as a cumulative distribution function (S-curve).@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "S-curves@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def SFAIRP
  "So far as is Resonably Practiceable (ALARP) - A criteria for deciding significance of risk and means of evaluating tolerability of risk"
  {:db/ident :dpvo-risk/SFAIRP,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "So far as is Resonably Practiceable (ALARP) - A criteria for deciding significance of risk and means of evaluating tolerability of risk@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "SFAIRP@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def SWIFT
  "A simpler form of HAZOP with prompts of \"what if\" to identify deviations from the expected."
  {:db/ident :dpvo-risk/SWIFT,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A simpler form of HAZOP with prompts of \"what if\" to identify deviations from the expected.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo/RiskManagementProcess
              :dpvo-risk/RiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Structured \"What If?\" (SWIFT)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def Sabotage
  ""
  {:db/ident :dpvo-risk/Sabotage,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Sabotage@en",
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status #voc/lstr "accepted@en"})

(def Scam
  ""
  {:db/ident            :dpvo-risk/Scam,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Scam@en",
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      #voc/lstr "accepted@en"})

(def ScenarioAnalysis
  "Identifies possible future scenarios through imagination, extrapolation from the present or modelling. Risk is then considered for each of these scenarios."
  {:db/ident :dpvo-risk/ScenarioAnalysis,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Identifies possible future scenarios through imagination, extrapolation from the present or modelling. Risk is then considered for each of these scenarios.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo/RiskManagementProcess
              :dpvo-risk/RiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Scenario Analysis@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def SecurityBreach
  ""
  {:db/ident            :dpvo-risk/SecurityBreach,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Security Breach@en",
   :rdfs/subClassOf     :dpvo/Consequence,
   :vs/term_status      #voc/lstr "accepted@en"})

(def ServiceInterruption
  ""
  {:db/ident            :dpvo-risk/ServiceInterruption,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Service Interruption@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def SexualViolence
  ""
  {:db/ident :dpvo-risk/SexualViolence,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Sexual Violence@en",
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status #voc/lstr "accepted@en"})

(def ShareRisk
  "Risk Mitigation Measure that shares Risk e.g. amongst stakeholders"
  {:db/ident :dpvo-risk/ShareRisk,
   :dcterms/created #inst "2022-08-29T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Risk Mitigation Measure that shares Risk e.g. amongst stakeholders@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Share Risk@en",
   :rdfs/subClassOf :dpvo/RiskMitigationMeasure,
   :vs/term_status #voc/lstr "accepted@en"})

(def SocialDisadvantage
  ""
  {:db/ident            :dpvo-risk/SocialDisadvantage,
   :dcterms/created     #inst "2022-08-19T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description #voc/lstr "@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Social Disadvantage@en",
   :rdfs/subClassOf     :dpvo/Impact,
   :vs/term_status      #voc/lstr "accepted@en"})

(def Spam
  ""
  {:db/ident :dpvo-risk/Spam,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Spam@en",
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status #voc/lstr "accepted@en"})

(def Spoofing
  ""
  {:db/ident            :dpvo-risk/Spoofing,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Spoofing@en",
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      #voc/lstr "accepted@en"})

(def Spying
  ""
  {:db/ident            :dpvo-risk/Spying,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Spying@en",
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def Stalking
  ""
  {:db/ident            :dpvo-risk/Stalking,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Stalking@en",
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def Surveys
  "Paper- or computer-based questionnaires to elicit views."
  {:db/ident :dpvo-risk/Surveys,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Paper- or computer-based questionnaires to elicit views.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo/RiskManagementProcess
              :dpvo-risk/RiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Surveys@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def SystemFailure
  ""
  {:db/ident :dpvo-risk/SystemFailure,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/enisa-threat-landscape-for-ransomware-attacks",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "System Failure@en",
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status #voc/lstr "accepted@en"})

(def SystemIntrusion
  ""
  {:db/ident :dpvo-risk/SystemIntrusion,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "System Intrusion@en",
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status #voc/lstr "accepted@en"})

(def SystemMalfunction
  ""
  {:db/ident            :dpvo-risk/SystemMalfunction,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "System Malfunction@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def Taxonomies
  "A taxonomy based on experience or on concepts and models that can be used to help identify risks or controls."
  {:db/ident :dpvo-risk/Taxonomies,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A taxonomy based on experience or on concepts and models that can be used to help identify risks or controls.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo/RiskManagementProcess
              :dpvo-risk/RiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Taxonomies@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def Terrorism
  ""
  {:db/ident            :dpvo-risk/Terrorism,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Terrorism@en",
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      #voc/lstr "accepted@en"})

(def Theft
  ""
  {:db/ident            :dpvo-risk/Theft,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Theft@en",
   :rdfs/subClassOf     :dpvo/MaterialDamage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def TheftEquipment
  ""
  {:db/ident            :dpvo-risk/TheftEquipment,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Theft of Equipment@en",
   :rdfs/subClassOf     :dpvo/MaterialDamage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def TheftMedia
  ""
  {:db/ident            :dpvo-risk/TheftMedia,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Theft of Media@en",
   :rdfs/subClassOf     :dpvo/MaterialDamage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def ThirdPartyOperationDisruption
  ""
  {:db/ident            :dpvo-risk/ThirdPartyOperationDisruption,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Third Party Operation Disruption@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def Toxicological
  "A series of steps taken to obtain a measure for the risk to humans or ecological systems due to exposure to chemicals."
  {:db/ident :dpvo-risk/Toxicological,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "A series of steps taken to obtain a measure for the risk to humans or ecological systems due to exposure to chemicals.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Toxicological Risk Assessment@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def UnauthorisedAccesstoPremises
  ""
  {:db/ident            :dpvo-risk/UnauthorisedAccesstoPremises,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Unauthorised Access to Premises@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def UnauthorisedCodeAccess
  ""
  {:db/ident :dpvo-risk/UnauthorisedCodeAccess,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Unauthorised Code Access@en",
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status #voc/lstr "accepted@en"})

(def UnauthorisedCodeDisclosure
  ""
  {:db/ident :dpvo-risk/UnauthorisedCodeDisclosure,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Unauthorised Code Disclosure@en",
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status #voc/lstr "accepted@en"})

(def UnauthorisedCodeModification
  ""
  {:db/ident :dpvo-risk/UnauthorisedCodeModification,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Unauthorised Code Modification@en",
   :rdfs/subClassOf :dpvo/Damage,
   :vs/term_status #voc/lstr "accepted@en"})

(def UnauthorisedDataAccess
  ""
  {:db/ident :dpvo-risk/UnauthorisedDataAccess,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Unauthorised Data Access@en",
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status #voc/lstr "accepted@en"})

(def UnauthorisedDataDisclosure
  ""
  {:db/ident            :dpvo-risk/UnauthorisedDataDisclosure,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Unauthorised Data Disclosure@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def UnauthorisedDataModification
  ""
  {:db/ident :dpvo-risk/UnauthorisedDataModification,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Unauthorised Data Modification@en",
   :rdfs/subClassOf :dpvo/NonMaterialDamage,
   :vs/term_status #voc/lstr "accepted@en"})

(def UnauthorisedImpersonation
  ""
  {:db/ident            :dpvo-risk/UnauthorisedImpersonation,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Unauthorised Impersonation@en",
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def UnauthorisedInformationDisclosure
  ""
  {:db/ident :dpvo-risk/UnauthorisedInformationDisclosure,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Unauthorised Information Disclosure@en",
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status #voc/lstr "accepted@en"})

(def UnauthorisedReIdentification
  ""
  {:db/ident            :dpvo-risk/UnauthorisedReIdentification,
   :dcterms/created     #inst "2022-08-19T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description #voc/lstr "@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Unauthorised Re-Identification@en",
   :rdfs/subClassOf     :dpvo/Consequence,
   :vs/term_status      #voc/lstr "accepted@en"})

(def UnauthorisedResourceUse
  ""
  {:db/ident            :dpvo-risk/UnauthorisedResourceUse,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Unauthorised Resource Use@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def UnauthorisedSystemAccess
  ""
  {:db/ident            :dpvo-risk/UnauthorisedSystemAccess,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Unauthorised System Access@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def UnauthorisedSystemModification
  ""
  {:db/ident :dpvo-risk/UnauthorisedSystemModification,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Unauthorised System Modification@en",
   :rdfs/subClassOf :dpvo/Damage,
   :vs/term_status #voc/lstr "accepted@en"})

(def UnknownVulnerabilityExploited
  ""
  {:db/ident :dpvo-risk/UnknownVulnerabilityExploited,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Unknown Vulnerability Exploited@en",
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status #voc/lstr "accepted@en"})

(def UnwantedCodeDeletion
  ""
  {:db/ident :dpvo-risk/UnwantedCodeDeletion,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Unwanted Code Deletion@en",
   :rdfs/subClassOf :dpvo/Damage,
   :vs/term_status #voc/lstr "accepted@en"})

(def UnwantedDataDeletion
  ""
  {:db/ident            :dpvo-risk/UnwantedDataDeletion,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Unwanted Data Deletion@en",
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def UnwantedDisclosureData
  ""
  {:db/ident            :dpvo-risk/UnwantedDisclosureData,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Unwanted Disclosure of Data@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def VaR
  "Financial measure of risk that uses an assumed probability distribution of losses in a stable market condition to calculate the value of a loss that might occur with a specified probability within a defined time span."
  {:db/ident :dpvo-risk/VaR,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Financial measure of risk that uses an assumed probability distribution of losses in a stable market condition to calculate the value of a loss that might occur with a specified probability within a defined time span.@en",
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/RiskAssessmentTechnique
              :dpvo/RiskManagementProcess],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Value At Risk (VaR)@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def Vandalism
  ""
  {:db/ident :dpvo-risk/Vandalism,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Vandalism@en",
   :rdfs/subClassOf :dpvo/Damage,
   :vs/term_status #voc/lstr "accepted@en"})

(def VeryHighLikelihood
  "Level where Likelihood is Very High"
  {:db/ident :dpvo-risk/VeryHighLikelihood,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Level where Likelihood is Very High@en",
   :rdf/type [:dpvo-risk/|7LikelihoodLevels|
              :dpvo-risk/|5LikelihoodLevels|
              :owl/NamedIndividual
              :dpvo/Likelihood],
   :rdf/value {:xsd/decimal 0.9M},
   :rdfs/comment
   #voc/lstr
    "The suggested quantitative value for this concept is 0.9 on a scale of 0 to 1@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very High Likelihood@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def VeryHighRisk
  "Level where Risk is Very High"
  {:db/ident :dpvo-risk/VeryHighRisk,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Level where Risk is Very High@en",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/|7RiskLevels|
              :dpvo/RiskLevel
              :dpvo-risk/|5RiskLevels|],
   :rdf/value {:xsd/decimal 0.9M},
   :rdfs/comment
   #voc/lstr
    "The suggested quantitative value for this concept is 0.9 on a scale of 0 to 1@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very High Risk@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def VeryHighSeverity
  "Level where Severity is Very High"
  {:db/ident :dpvo-risk/VeryHighSeverity,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Level where Severity is Very High@en",
   :rdf/type [:dpvo-risk/|7SeverityLevels|
              :dpvo/Severity
              :dpvo-risk/|5SeverityLevels|
              :owl/NamedIndividual],
   :rdf/value {:xsd/decimal 0.9M},
   :rdfs/comment
   #voc/lstr
    "The suggested quantitative value for this concept is 0.9 on a scale of 0 to 1@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very High Severity@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def VeryLowLikelihood
  "Level where Likelihood is Very Low"
  {:db/ident :dpvo-risk/VeryLowLikelihood,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Level where Likelihood is Very Low@en",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/|7LikelihoodLevels|
              :dpvo-risk/|5LikelihoodLevels|
              :dpvo/Likelihood],
   :rdf/value {:xsd/decimal 0.1M},
   :rdfs/comment
   #voc/lstr
    "The suggested quantitative value for this concept is 0.1 on a scale of 0 to 1@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very Low Likelihood@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def VeryLowRisk
  "Level where Risk is Very Low"
  {:db/ident :dpvo-risk/VeryLowRisk,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Level where Risk is Very Low@en",
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/|7RiskLevels|
              :dpvo/RiskLevel
              :dpvo-risk/|5RiskLevels|],
   :rdf/value {:xsd/decimal 0.1M},
   :rdfs/comment
   #voc/lstr
    "The suggested quantitative value for this concept is 0.1 on a scale of 0 to 1@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very Low Risk@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def VeryLowSeverity
  "Level where Severity is Very Low"
  {:db/ident :dpvo-risk/VeryLowSeverity,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Level where Severity is Very Low@en",
   :rdf/type [:owl/NamedIndividual
              :dpvo/Severity
              :dpvo-risk/|5SeverityLevels|
              :dpvo-risk/|7SeverityLevels|],
   :rdf/value {:xsd/decimal 0.1M},
   :rdfs/comment
   #voc/lstr
    "The suggested quantitative value for this concept is 0.1 on a scale of 0 to 1@en",
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Very Low Severity@en",
   :vs/term_status #voc/lstr "accepted@en"})

(def ViolationCodeConduct
  ""
  {:db/ident            :dpvo-risk/ViolationCodeConduct,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Violation of Code of Conduct@en",
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def ViolationContractualObligations
  ""
  {:db/ident            :dpvo-risk/ViolationContractualObligations,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Violation of Contractual Obligations@en",
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def ViolationEthicalCode
  ""
  {:db/ident            :dpvo-risk/ViolationEthicalCode,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Violation of Ethical Code@en",
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def ViolationOfRights
  ""
  {:db/ident            :dpvo-risk/ViolationOfRights,
   :dcterms/created     #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Violation of Rights@en",
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      #voc/lstr "accepted@en"})

(def ViolationRegulatoryObligations
  ""
  {:db/ident            :dpvo-risk/ViolationRegulatoryObligations,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Violation of Regulatory Obligations@en",
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def ViolationStatutoryObligations
  ""
  {:db/ident            :dpvo-risk/ViolationStatutoryObligations,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Violation of Statutory Obligations@en",
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      #voc/lstr "accepted@en"})

(def VulnerabilityCreated
  ""
  {:db/ident            :dpvo-risk/VulnerabilityCreated,
   :dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "Vulnerability Created@en",
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      #voc/lstr "accepted@en"})

(def VulnerabilityExploited
  ""
  {:db/ident :dpvo-risk/VulnerabilityExploited,
   :dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "@en",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "Vulnerability Exploited@en",
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status #voc/lstr "accepted@en"})

(def |3LikelihoodLevels|
  "Scale with 3 Likelihood Levels from High to Low"
  {:db/ident            :dpvo-risk/|3LikelihoodLevels|,
   :dcterms/created     #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Scale with 3 Likelihood Levels from High to Low@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "3 Likelihood Levels@en",
   :rdfs/subClassOf     :dpvo/Likelihood,
   :vs/term_status      #voc/lstr "accepted@en"})

(def |3RiskLevels|
  "Scale with 3 Risk Levels from High to Low"
  {:db/ident            :dpvo-risk/|3RiskLevels|,
   :dcterms/created     #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Scale with 3 Risk Levels from High to Low@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "3 Risk Levels@en",
   :rdfs/subClassOf     :dpvo/RiskLevel,
   :vs/term_status      #voc/lstr "accepted@en"})

(def |3SeverityLevels|
  "Scale with 3 Severity Levels from High to Low"
  {:db/ident            :dpvo-risk/|3SeverityLevels|,
   :dcterms/created     #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Scale with 3 Severity Levels from High to Low@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          #voc/lstr "3 Severity Levels@en",
   :rdfs/subClassOf     :dpvo/Severity,
   :vs/term_status      #voc/lstr "accepted@en"})

(def |5LikelihoodLevels|
  "Scale with 5 Likelihood Levels from Very High to Very Low"
  {:db/ident :dpvo-risk/|5LikelihoodLevels|,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Scale with 5 Likelihood Levels from Very High to Very Low@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "5 Likelihood Levels@en",
   :rdfs/subClassOf :dpvo/Likelihood,
   :vs/term_status #voc/lstr "accepted@en"})

(def |5RiskLevels|
  "Scale with 5 Risk Levels from Very High to Very Low"
  {:db/ident :dpvo-risk/|5RiskLevels|,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Scale with 5 Risk Levels from Very High to Very Low@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "5 Risk Levels@en",
   :rdfs/subClassOf :dpvo/RiskLevel,
   :vs/term_status #voc/lstr "accepted@en"})

(def |5SeverityLevels|
  "Scale with 5 Severity Levels from Very High to Very Low"
  {:db/ident :dpvo-risk/|5SeverityLevels|,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Scale with 5 Severity Levels from Very High to Very Low@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "5 Severity Levels@en",
   :rdfs/subClassOf :dpvo/Severity,
   :vs/term_status #voc/lstr "accepted@en"})

(def |7LikelihoodLevels|
  "Scale with 7 Likelihood Levels from Extremely High to Extremely Low"
  {:db/ident :dpvo-risk/|7LikelihoodLevels|,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Scale with 7 Likelihood Levels from Extremely High to Extremely Low@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "7 Likelihood Levels@en",
   :rdfs/subClassOf :dpvo/Likelihood,
   :vs/term_status #voc/lstr "accepted@en"})

(def |7RiskLevels|
  "Scale with 7 Risk Levels from Extremely High to Extremely Low"
  {:db/ident :dpvo-risk/|7RiskLevels|,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Scale with 7 Risk Levels from Extremely High to Extremely Low@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "7 Risk Levels@en",
   :rdfs/subClassOf :dpvo/RiskLevel,
   :vs/term_status #voc/lstr "accepted@en"})

(def |7SeverityLevels|
  "Scale with 7 Severity Levels from Extremely High to Extremely Low"
  {:db/ident :dpvo-risk/|7SeverityLevels|,
   :dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Scale with 7 Severity Levels from Extremely High to Extremely Low@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label #voc/lstr "7 Severity Levels@en",
   :rdfs/subClassOf :dpvo/Severity,
   :vs/term_status #voc/lstr "accepted@en"})
