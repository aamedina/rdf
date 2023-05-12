(ns net.wikipunk.rdf.disco
  "This specification defines the DDI Discovery Vocabulary, an RDF Schema vocabulary that enables discovery of research and survey data on the Web. It is based on DDI (Data Documentation Initiative) XML formats."
  {:dc11/contributor
   ["Benjamin Zapilko" "Thomas Bosch" "Richard Cyganiak" "Joachim Wackerow"],
   :dc11/creator ["Benjamin Zapilko"
                  "Sarven Capadisli"
                  "Franck Cotton"
                  "Olof Olsson"
                  "Arofan Gregory"
                  "Joachim Wackerow"
                  "Benedikt Kämpgen"
                  "Heiko Paulheim"
                  "Thomas Bosch"
                  "Richard Cyganiak"],
   :dc11/description
   "This specification defines the DDI Discovery Vocabulary, an RDF Schema vocabulary that enables discovery of research and survey data on the Web. It is based on DDI (Data Documentation Initiative) XML formats.",
   :dc11/title "DDI-RDF Discovery Vocabulary",
   :owl/versionInfo "Version 0.6 - 2013-09-30",
   :rdf/ns-prefix-map {"adms" "http://www.w3.org/ns/adms#",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "dcat" "http://www.w3.org/ns/dcat#",
                       "dcmitype" "http://purl.org/dc/terms/DCMIType",
                       "dcterms" "http://purl.org/dc/terms/",
                       "disco"
                       "http://rdf-vocabulary.ddialliance.org/discovery#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "org" "http://www.w3.org/ns/org#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "prov" "http://www.w3.org/ns/prov#",
                       "qb" "http://purl.org/linked-data/cube#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xkos" "http://purl.org/linked-data/xkos#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "disco",
   :rdfa/uri "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/comment
   "This specification defines the DDI Discovery Vocabulary, an RDF Schema vocabulary that enables discovery of research and survey data on the Web. It is based on DDI (Data Documentation Initiative) XML formats."})

(def AnalysisUnit
  "The process collecting data is focusing on the analysis of a particular type of subject. If, for example, the adult population of Finland is being studied, the AnalysisUnit would be individuals or persons."
  {:db/ident :disco/AnalysisUnit,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "The process collecting data is focusing on the analysis of a particular type of subject. If, for example, the adult population of Finland is being studied, the AnalysisUnit would be individuals or persons.",
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["Analyseeinheit" "Analysis Unit"],
   :rdfs/subClassOf [:rdfs/Resource :skos/Concept :disco/AnalysisUnit]})

(def CategoryStatistics
  "For CategoryStatistics, frequencies, percentages, and weighted percentages can be defined."
  {:db/ident :disco/CategoryStatistics,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "For CategoryStatistics, frequencies, percentages, and weighted percentages can be defined.",
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label "Category statistics",
   :rdfs/subClassOf
   [:rdfs/Resource :disco/DescriptiveStatistics :disco/CategoryStatistics]})

(def DataFile
  "The class DataFile, which is also a dcmitype:Dataset, represents all the data files containing the microdata datasets."
  {:db/ident :disco/DataFile,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "The class DataFile, which is also a dcmitype:Dataset, represents all the data files containing the microdata datasets.",
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["Fichier de données" "Data file"],
   :rdfs/subClassOf
   [:rdfs/Resource :dcmitype/Dataset :dcat/Distribution :disco/DataFile]})

(def DescriptiveStatistics
  "SummaryStatistics pointing to variables and CategoryStatistics pointing to categories and codes are both DescriptiveStatistics."
  {:db/ident :disco/DescriptiveStatistics,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "SummaryStatistics pointing to variables and CategoryStatistics pointing to categories and codes are both DescriptiveStatistics.",
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["Statistique descriptive" "Descriptive statistics"],
   :rdfs/subClassOf [:rdfs/Resource :disco/DescriptiveStatistics]})

(def Instrument
  "The data for the study are collected by an Instrument. The purpose of an Instrument, i.e. an interview, a questionnaire or another entity used as a means of data collection, is in the case of a survey to record the flow of a questionnaire, its use of questions, and additional component parts. A questionnaire contains a flow of questions."
  {:db/ident :disco/Instrument,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "The data for the study are collected by an Instrument. The purpose of an Instrument, i.e. an interview, a questionnaire or another entity used as a means of data collection, is in the case of a survey to record the flow of a questionnaire, its use of questions, and additional component parts. A questionnaire contains a flow of questions.",
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["Instrument de collecte" "Instrument"],
   :rdfs/subClassOf [:rdfs/Resource :disco/Instrument]})

(def LogicalDataSet
  "Each study has a set of logical metadata associated with the processing of data, at the time of collection or later during cleaning, and re-coding. LogicalDataSet represents the microdata dataset."
  {:db/ident :disco/LogicalDataSet,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "Each study has a set of logical metadata associated with the processing of data, at the time of collection or later during cleaning, and re-coding. LogicalDataSet represents the microdata dataset.",
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["Ensemble de données" "LogicalDataSet"],
   :rdfs/subClassOf
   [:rdfs/Resource :skos/Concept :dcat/Dataset :disco/LogicalDataSet]})

(def Mapping
  "This class is for representing mappings betwenn DDI-RDF and DDI-XML. See Section 10 in the specification for more details and examples."
  {:db/ident :disco/Mapping,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "This class is for representing mappings betwenn DDI-RDF and DDI-XML. See Section 10 in the specification for more details and examples.",
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label "Mapping",
   :rdfs/subClassOf [:rdfs/Resource :disco/Mapping]})

(def Question
  "A Question is designed to get information upon a subject, or sequence of subjects, from a respondent."
  {:db/ident :disco/Question,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "A Question is designed to get information upon a subject, or sequence of subjects, from a respondent.",
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["Question" "Question"],
   :rdfs/subClassOf [:rdfs/Resource :skos/Concept :disco/Question]})

(def Questionnaire
  "A questionnaire contains a flow of questions. Questionnaires must contain 1 to n questions using the object property question. Particular questions may be contained in 0 to n questionnaires."
  {:db/ident :disco/Questionnaire,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "A questionnaire contains a flow of questions. Questionnaires must contain 1 to n questions using the object property question. Particular questions may be contained in 0 to n questionnaires.",
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["Fragebogen" "Questionnaire"],
   :rdfs/subClassOf [:rdfs/Resource :disco/Instrument :disco/Questionnaire]})

(def Representation
  "Representation of a variable or question definition."
  {:db/ident         :disco/Representation,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "Representation of a variable or question definition.",
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label       "Representation of a variable or question definition.",
   :rdfs/subClassOf  [:rdfs/Resource
                      {:owl/unionOf [:rdfs/Datatype
                                     :skos/ConceptScheme
                                     :skos/OrderedCollection],
                       :rdf/type    :owl/Class}
                      :disco/Representation]})

(def RepresentedVariable
  "RepresentedVariables encompasse study-independent, re-usable parts of variables like occupation classification."
  {:db/ident :disco/RepresentedVariable,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "RepresentedVariables encompasse study-independent, re-usable parts of variables like occupation classification.",
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["Élément de donnée" "Data element"],
   :rdfs/subClassOf [:rdfs/Resource :disco/RepresentedVariable]})

(def Study
  "A Study represents the process by which a data set was generated or collected."
  {:db/ident :disco/Study,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "A Study represents the process by which a data set was generated or collected.",
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["Étude" "Study"],
   :rdfs/subClassOf [:rdfs/Resource :disco/Study]})

(def StudyGroup
  "In some cases, where data collection is cyclic or on-going, data sets may be released as a StudyGroup, where each cycle or wave of the data collection activity produces one or more data sets. This is typical for longitudinal studies, panel studies, and other types of series (to use the DDI term). In this case, a number of Study objects would be collected into a single StudyGroup."
  {:db/ident :disco/StudyGroup,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "In some cases, where data collection is cyclic or on-going, data sets may be released as a StudyGroup, where each cycle or wave of the data collection activity produces one or more data sets. This is typical for longitudinal studies, panel studies, and other types of series (to use the DDI term). In this case, a number of Study objects would be collected into a single StudyGroup.",
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["Studiengruppe" "Study Group"],
   :rdfs/subClassOf [:rdfs/Resource :disco/StudyGroup]})

(def SummaryStatistics
  "For SummaryStatistics, maximum values, minimum values, and standard deviations can be defined."
  {:db/ident :disco/SummaryStatistics,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "For SummaryStatistics, maximum values, minimum values, and standard deviations can be defined.",
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label "Summary statistics",
   :rdfs/subClassOf
   [:disco/DescriptiveStatistics :disco/SummaryStatistics :rdfs/Resource]})

(def Universe
  "A Universe is the total membership or population of a defined class of people, objects or events."
  {:db/ident :disco/Universe,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "A Universe is the total membership or population of a defined class of people, objects or events.",
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["Univers" "Universe"],
   :rdfs/subClassOf [:rdfs/Resource :skos/Concept :disco/Universe]})

(def Variable
  "Variables provide a definition of the column in a rectangular data file. Variable is a characteristic of a unit being observed. A variable might be the answer of a question, have an administrative source, or be derived from other variables."
  {:db/ident :disco/Variable,
   :owl/equivalentClass "http://semanticscience.org/resource/SIO_000367",
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "Variables provide a definition of the column in a rectangular data file. Variable is a characteristic of a unit being observed. A variable might be the answer of a question, have an administrative source, or be derived from other variables.",
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["Variable" "Variable"],
   :rdfs/subClassOf [:rdfs/Resource :skos/Concept :disco/Variable]})

(def aggregation
  "This property points to the aggregated data set of a microdata data set. The aggregated data set is a qb:DataSet of the RDF Data Cube Vocabulary."
  {:db/ident :disco/aggregation,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "This property points to the aggregated data set of a microdata data set. The aggregated data set is a qb:DataSet of the RDF Data Cube Vocabulary.",
   :rdfs/domain :disco/LogicalDataSet,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label "aggregation",
   :rdfs/range :qb/DataSet,
   :rdfs/subPropertyOf :disco/aggregation})

(def analysisUnit
  "This property links to the analysis unit of a Study, a StudyGroup, or a Variable."
  {:db/ident :disco/analysisUnit,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "This property links to the analysis unit of a Study, a StudyGroup, or a Variable.",
   :rdfs/domain {:owl/unionOf [:disco/Study :disco/StudyGroup :disco/Variable],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["Analyseeinheit" "analysis unit"],
   :rdfs/range :disco/AnalysisUnit,
   :rdfs/subPropertyOf :disco/analysisUnit})

(def basedOn
  "This property points to the RepresentedVariable the Variable is based on."
  {:db/ident :disco/basedOn,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "This property points to the RepresentedVariable the Variable is based on.",
   :rdfs/domain :disco/Variable,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["utilise l'élément de donnée" "based on"],
   :rdfs/range :disco/RepresentedVariable,
   :rdfs/subPropertyOf :disco/basedOn})

(def caseQuantity
  "This property is used for representing the case quantity of a DataFile."
  {:db/ident :disco/caseQuantity,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "This property is used for representing the case quantity of a DataFile.",
   :rdfs/domain :disco/DataFile,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["nombre d'observations" "number of cases"],
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf :disco/caseQuantity})

(def collectionMode
  "This property points to the mode of collection of a Questionnaire which is a skos:Concept."
  {:db/ident :disco/collectionMode,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "This property points to the mode of collection of a Questionnaire which is a skos:Concept.",
   :rdfs/domain :disco/Questionnaire,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["Datenerfassungsmodus" "collection mode"],
   :rdfs/range :skos/Concept,
   :rdfs/subPropertyOf :disco/collectionMode})

(def computationBase
  "computationBase expresses if the cases - which are the basis of the computation of a statistics value - are valid, invalid or the total of both. The usage of computationBase for frequency differs from the usage for the percentage statistics and the summary statistics. A distinction regarding computationBase doesn’t apply to frequency as category statistic. Please find more details in Section 6.3 of the specification."
  {:db/ident :disco/computationBase,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "computationBase expresses if the cases - which are the basis of the computation of a statistics value - are valid, invalid or the total of both. The usage of computationBase for frequency differs from the usage for the percentage statistics and the summary statistics. A distinction regarding computationBase doesn’t apply to frequency as category statistic. Please find more details in Section 6.3 of the specification.",
   :rdfs/domain :disco/CategoryStatistics,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["pourcentage" "computation base"],
   :rdfs/range :rdf/langString,
   :rdfs/subPropertyOf :disco/computationBase})

(def concept
  "This property points to the DDI concept of a RepresentedVariable, a Variable, or a Question"
  {:db/ident :disco/concept,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "This property points to the DDI concept of a RepresentedVariable, a Variable, or a Question",
   :rdfs/domain
   {:owl/unionOf [:disco/RepresentedVariable :disco/Question :disco/Variable],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["a pour concept" "concept"],
   :rdfs/range :skos/Concept,
   :rdfs/subPropertyOf :disco/concept})

(def context
  "context specifies conditions which have to be fulfilled for particular mappings. Context information can be either a SPARQL query or an informal description as plain literal."
  {:db/ident :disco/context,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "context specifies conditions which have to be fulfilled for particular mappings. Context information can be either a SPARQL query or an informal description as plain literal.",
   :rdfs/domain :disco/Mapping,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label
   "context specifies conditions which have to be fulfilled for specific mappings",
   :rdfs/range :rdf/langString,
   :rdfs/subPropertyOf :disco/context})

(def cumulativePercentage
  "This property is used to describe the cumulative percentages within category statistics. See Sections 6 and 7 more more details and examples."
  {:db/ident :disco/cumulativePercentage,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "This property is used to describe the cumulative percentages within category statistics. See Sections 6 and 7 more more details and examples.",
   :rdfs/domain :disco/CategoryStatistics,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label "cumulative percentage",
   :rdfs/range :xsd/double,
   :rdfs/subPropertyOf :disco/cumulativePercentage})

(def dataFile
  "This property points to the DataFile of a Study or a LogicalDataSet."
  {:db/ident :disco/dataFile,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "This property points to the DataFile of a Study or a LogicalDataSet.",
   :rdfs/domain {:owl/unionOf [:disco/Study :disco/LogicalDataSet],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["a pour fichier de données" "data file"],
   :rdfs/range :disco/DataFile,
   :rdfs/subPropertyOf :disco/dataFile})

(def ddifile
  "This property points from a Study or a StudyGroup to the original DDI file which is a foaf:Document."
  {:db/ident :disco/ddifile,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "This property points from a Study or a StudyGroup to the original DDI file which is a foaf:Document.",
   :rdfs/domain {:owl/unionOf [:disco/Study :disco/StudyGroup],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["DDI-Datei" "DDI file"],
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :disco/ddifile})

(def endDate
  "Defines the end date of a period of time. Please note that this property is a feature at risk, since the domain is not a class of Disco. Maintainers of the domain ontology may define their own property."
  {:db/ident :disco/endDate,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "Defines the end date of a period of time. Please note that this property is a feature at risk, since the domain is not a class of Disco. Maintainers of the domain ontology may define their own property.",
   :rdfs/domain :dcterms/PeriodOfTime,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label "end date",
   :rdfs/range :xsd/date,
   :rdfs/subPropertyOf :disco/endDate})

(def externalDocumentation
  "This property points from an Instrument to a foaf:Document which is the external documentation of the Instrument."
  {:db/ident :disco/externalDocumentation,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "This property points from an Instrument to a foaf:Document which is the external documentation of the Instrument.",
   :rdfs/domain :disco/Instrument,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["externe Dokumentation" "external documentation"],
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :disco/externalDocumentation})

(def frequency
  "This property is used to describe the frequencies within category statistics. See Sections 6 and 7 more more details and examples."
  {:db/ident :disco/frequency,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "This property is used to describe the frequencies within category statistics. See Sections 6 and 7 more more details and examples.",
   :rdfs/domain :disco/CategoryStatistics,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["fréquence" "frequency"],
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf :disco/frequency})

(def fundedBy
  "This property points from a Study or a StudyGroup to the funding foaf:Agent which is either a foaf:Person or a org:Organization."
  {:db/ident :disco/fundedBy,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "This property points from a Study or a StudyGroup to the funding foaf:Agent which is either a foaf:Person or a org:Organization.",
   :rdfs/domain {:owl/unionOf [:disco/Study :disco/StudyGroup],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label "funded by",
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf [:dcterms/contributor :disco/fundedBy]})

(def hadRole
  "This property indicates the role of an Agent, e.g. analyst, data modeler, programmer, co-investigator or others."
  {:db/ident :disco/hadRole,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "This property indicates the role of an Agent, e.g. analyst, data modeler, programmer, co-investigator or others.",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label "had role",
   :rdfs/range :skos/Concept,
   :rdfs/subPropertyOf :disco/hadRole})

(def inGroup
  "This property points from a Study to the StudyGroup which contains the Study."
  {:db/ident :disco/inGroup,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "This property points from a Study to the StudyGroup which contains the Study.",
   :rdfs/domain :disco/Study,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label "in group",
   :rdfs/range :disco/StudyGroup,
   :rdfs/subPropertyOf :disco/inGroup})

(def inputVariable
  "This property indicates the original Variable of an aggregated qb:DataSet. Please note that this property is a feature at risk, since the domain is not a class of Disco. Maintainers of the domain ontology may define their own property."
  {:db/ident :disco/inputVariable,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "This property indicates the original Variable of an aggregated qb:DataSet. Please note that this property is a feature at risk, since the domain is not a class of Disco. Maintainers of the domain ontology may define their own property.",
   :rdfs/domain :qb/DataSet,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["variable en entrée" "input variable"],
   :rdfs/range :disco/Variable,
   :rdfs/subPropertyOf :disco/inputVariable})

(def instrument
  "This property indicates the Instrument of a Study or a LogicalDataSet."
  {:db/ident :disco/instrument,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "This property indicates the Instrument of a Study or a LogicalDataSet.",
   :rdfs/domain {:owl/unionOf [:disco/Study :disco/LogicalDataSet],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["a comme instrument" "instrument"],
   :rdfs/range :disco/Instrument,
   :rdfs/subPropertyOf :disco/instrument})

(def isPublic
  "This property is used as a flag indicating if the microdata dataset is publicly available. The value true indicates that the dataset can be accessed (usually downloaded) by anyone."
  {:db/ident :disco/isPublic,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "This property is used as a flag indicating if the microdata dataset is publicly available. The value true indicates that the dataset can be accessed (usually downloaded) by anyone.",
   :rdfs/domain :disco/LogicalDataSet,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["ist öffentlich" "is public"],
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :disco/isPublic})

(def isValid
  "Indicates if the code (represented by skos:Concept) is valid or missing. Please note that this property is a feature at risk, since the domain is not a class of Disco. Maintainers of the domain ontology may define their own property."
  {:db/ident :disco/isValid,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "Indicates if the code (represented by skos:Concept) is valid or missing. Please note that this property is a feature at risk, since the domain is not a class of Disco. Maintainers of the domain ontology may define their own property.",
   :rdfs/domain :skos/Concept,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label "is valid",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :disco/isValid})

(def kindOfData
  "The general kind of data (e.g. geospatial, register, survey) collected in this study, given either as a skos:Concept, or as a blank node with attached free-text rdfs:label."
  {:db/ident :disco/kindOfData,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "The general kind of data (e.g. geospatial, register, survey) collected in this study, given either as a skos:Concept, or as a blank node with attached free-text rdfs:label.",
   :rdfs/domain {:owl/unionOf [:disco/Study :disco/StudyGroup],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label "kind of data",
   :rdfs/range :skos/Concept,
   :rdfs/subPropertyOf :disco/kindOfData})

(def mappingDDI-C
  "Mapping from and to DDI-C. See Section 10 in the specification for more details and examples."
  {:db/ident :disco/mappingDDI-C,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "Mapping from and to DDI-C. See Section 10 in the specification for more details and examples.",
   :rdfs/domain :disco/Mapping,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label "Mapping from and to DDI-C",
   :rdfs/range :rdf/langString,
   :rdfs/subPropertyOf :disco/mappingDDI-C})

(def mappingDDI-L
  "Mapping from and to DDI-L. See Section 10 in the specification for more details and examples."
  {:db/ident :disco/mappingDDI-L,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "Mapping from and to DDI-L. See Section 10 in the specification for more details and examples.",
   :rdfs/domain :disco/Mapping,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label "Mapping from and to DDI-L",
   :rdfs/range :rdf/langString,
   :rdfs/subPropertyOf :disco/mappingDDI-L})

(def percentage
  "This property is used to describe the percentages within category statistics. See Sections 6 and 7 more more details and examples."
  {:db/ident :disco/percentage,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "This property is used to describe the percentages within category statistics. See Sections 6 and 7 more more details and examples.",
   :rdfs/domain :disco/CategoryStatistics,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["pourcentage" "percentage"],
   :rdfs/range :xsd/double,
   :rdfs/subPropertyOf :disco/percentage})

(def product
  "This property indicates the LogicalDataSets of a Study."
  {:db/ident :disco/product,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "This property indicates the LogicalDataSets of a Study.",
   :rdfs/domain :disco/Study,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["Produkt" "product"],
   :rdfs/range :qb/LogicalDataSet,
   :rdfs/subPropertyOf :disco/product})

(def purpose
  "The purpose of a Study of a StudyGroup."
  {:db/ident           :disco/purpose,
   :rdf/type           [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment       "The purpose of a Study of a StudyGroup.",
   :rdfs/domain        {:owl/unionOf [:disco/Study :disco/StudyGroup],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label         ["Grund" "purpose"],
   :rdfs/range         :rdf/langString,
   :rdfs/subPropertyOf :disco/purpose})

(def question
  "This property indicates the Questions associated to Variables or contained in Questionnaires."
  {:db/ident :disco/question,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "This property indicates the Questions associated to Variables or contained in Questionnaires.",
   :rdfs/domain {:owl/unionOf [:disco/Variable :disco/Questionnaire],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["a comme question" "question"],
   :rdfs/range :disco/Question,
   :rdfs/subPropertyOf :disco/question})

(def questionText
  "This property contains the actual text of a question as string. See Section 8.2 for examples."
  {:db/ident :disco/questionText,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "This property contains the actual text of a question as string. See Section 8.2 for examples.",
   :rdfs/domain :disco/Question,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["Fragetext" "question text"],
   :rdfs/range :rdf/langString,
   :rdfs/subPropertyOf :disco/questionText})

(def representation
  "RepresentedVariables and Variables can have a Representation whose individuals are either of the class rdfs:Datatype (to represent values) or skos:ConceptScheme (to represent code lists)."
  {:db/ident :disco/representation,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "RepresentedVariables and Variables can have a Representation whose individuals are either of the class rdfs:Datatype (to represent values) or skos:ConceptScheme (to represent code lists).",
   :rdfs/domain
   {:owl/unionOf [:disco/RepresentedVariable :disco/Variable :disco/Question],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["a pour représentation" "representation"],
   :rdfs/range {:owl/unionOf [:skos/ConceptScheme :rdfs/Datatype],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :disco/representation})

(def responseDomain
  "The response domain of questions. The response domain has to be an instance of the class Representation."
  {:db/ident :disco/responseDomain,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "The response domain of questions. The response domain has to be an instance of the class Representation.",
   :rdfs/domain :disco/Question,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label "responseDomain",
   :rdfs/range :disco/Representation,
   :rdfs/subPropertyOf :disco/responseDomain})

(def startDate
  "Defines the start date of a period of time. Please note that this property is a feature at risk, since the domain is not a class of Disco. Maintainers of the domain ontology may define their own property."
  {:db/ident :disco/startDate,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "Defines the start date of a period of time. Please note that this property is a feature at risk, since the domain is not a class of Disco. Maintainers of the domain ontology may define their own property.",
   :rdfs/domain :dcterms/PeriodOfTime,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label "start date",
   :rdfs/range :xsd/date,
   :rdfs/subPropertyOf :disco/startDate})

(def statisticsCategory
  "This property points to the skos:Concept (representing codes and categories) of a specific CategoryStatistics individual."
  {:db/ident :disco/statisticsCategory,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "This property points to the skos:Concept (representing codes and categories) of a specific CategoryStatistics individual.",
   :rdfs/domain :disco/CategoryStatistics,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["a pour concept statistique" "statistics category"],
   :rdfs/range :skos/Concept,
   :rdfs/subPropertyOf :disco/statisticsCategory})

(def statisticsDataFile
  "This property indicates the DataFile of a specific DesciptiveStatistics individual. DescriptiveStatistics may have statisticsDataFile relations to 0 to n data files (DataFile) and data files (DataFile) may be in 0 to n statisticsDataFile relations to DescriptiveStatistics individuals."
  {:db/ident :disco/statisticsDataFile,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "This property indicates the DataFile of a specific DesciptiveStatistics individual. DescriptiveStatistics may have statisticsDataFile relations to 0 to n data files (DataFile) and data files (DataFile) may be in 0 to n statisticsDataFile relations to DescriptiveStatistics individuals.",
   :rdfs/domain :disco/DescriptiveStatistics,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["a pour fichier statistique" "statistics data file"],
   :rdfs/range :disco/DataFile,
   :rdfs/subPropertyOf :disco/statisticsDataFile})

(def statisticsVariable
  "This property indicates the Variable of a specific SummaryStatistics individual. SummaryStatistics point to 0 to n variables (Variable) using the object property statisticsVariable."
  {:db/ident :disco/statisticsVariable,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "This property indicates the Variable of a specific SummaryStatistics individual. SummaryStatistics point to 0 to n variables (Variable) using the object property statisticsVariable.",
   :rdfs/domain :disco/SummaryStatistics,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["a pour variable statistique" "statistics variable"],
   :rdfs/range :disco/Variable,
   :rdfs/subPropertyOf :disco/statisticsVariable})

(def subtitle
  "The sub-title of a Study of a StudyGroup."
  {:db/ident           :disco/subtitle,
   :rdf/type           [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment       "The sub-title of a Study of a StudyGroup.",
   :rdfs/domain        {:owl/unionOf [:disco/Study :disco/StudyGroup],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label         ["Untertitel" "subtitle"],
   :rdfs/range         :rdf/langString,
   :rdfs/subPropertyOf :disco/subtitle})

(def summaryStatisticsType
  "This property points to the summary statistics type of a Questionnaire which is a skos:Concept."
  {:db/ident :disco/summaryStatisticsType,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "This property points to the summary statistics type of a Questionnaire which is a skos:Concept.",
   :rdfs/domain :disco/SummaryStatistics,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label "summary statistics type",
   :rdfs/range :skos/Concept,
   :rdfs/subPropertyOf :disco/summaryStatisticsType})

(def universe
  "This property indicates the Universe(s) of Studies, StudyGrous, RepresentedVariables, Variables, Questions, and LogicalDataSets."
  {:db/ident :disco/universe,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "This property indicates the Universe(s) of Studies, StudyGrous, RepresentedVariables, Variables, Questions, and LogicalDataSets.",
   :rdfs/domain {:owl/unionOf [:disco/Study
                               :disco/StudyGroup
                               :disco/RepresentedVariable
                               :disco/Variable
                               :disco/Question
                               :disco/LogicalDataSet],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["a comme univers" "universe"],
   :rdfs/range :disco/Universe,
   :rdfs/subPropertyOf :disco/universe})

(def variable
  "This property indicates the Variable of a Study and points to Variable contained in the LogicalDataSet."
  {:db/ident :disco/variable,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "This property indicates the Variable of a Study and points to Variable contained in the LogicalDataSet.",
   :rdfs/domain {:owl/unionOf [:disco/Study :disco/LogicalDataSet],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["Variable" "variable"],
   :rdfs/range :disco/Variable,
   :rdfs/subPropertyOf :disco/variable})

(def variableQuantity
  "This property can be used when (1) no variable level information is available and when (2) only a stub of the RDF is requested e.g when returning basic information on a study of file, no information on potentially hundreds or thousands of variables references or metadata has to be returned."
  {:db/ident :disco/variableQuantity,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "This property can be used when (1) no variable level information is available and when (2) only a stub of the RDF is requested e.g when returning basic information on a study of file, no information on potentially hundreds or thousands of variables references or metadata has to be returned.",
   :rdfs/domain {:owl/unionOf [:disco/LogicalDataSet :disco/DataFile],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label "variable quantity",
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf :disco/variableQuantity})

(def weightedBy
  "SummaryStatistics or CategoryStatistics resources may be weighted by a specific Variable."
  {:db/ident :disco/weightedBy,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "SummaryStatistics or CategoryStatistics resources may be weighted by a specific Variable.",
   :rdfs/domain {:owl/unionOf [:disco/SummaryStatistics
                               :disco/CategoryStatistics],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label ["" "weighted by"],
   :rdfs/range :disco/Variable,
   :rdfs/subPropertyOf :disco/weightedBy})

(def ^{:private true} Dataset
  {:db/ident        :dcat/Dataset,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :dcat/Dataset})

(def ^{:private true} Distribution
  {:db/ident        :dcat/Distribution,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :dcat/Distribution})

(def ^{:private true} Dataset
  {:db/ident        :dcmitype/Dataset,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :dcmitype/Dataset})

(def ^{:private true} Concept
  {:db/ident        :skos/Concept,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :skos/Concept})