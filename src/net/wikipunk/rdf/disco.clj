(ns net.wikipunk.rdf.disco
  "This specification defines the DDI Discovery Vocabulary, an RDF Schema vocabulary that enables discovery of research and survey data on the Web. It is based on DDI (Data Documentation Initiative) XML formats."
  {:dcterms/contributor
   ["Benjamin Zapilko" "Thomas Bosch" "Richard Cyganiak" "Joachim Wackerow"],
   :dcterms/creator ["Benjamin Zapilko"
                     "Sarven Capadisli"
                     "Franck Cotton"
                     "Olof Olsson"
                     "Arofan Gregory"
                     "Joachim Wackerow"
                     "Benedikt Kämpgen"
                     "Heiko Paulheim"
                     "Thomas Bosch"
                     "Richard Cyganiak"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "This specification defines the DDI Discovery Vocabulary, an RDF Schema vocabulary that enables discovery of research and survey data on the Web. It is based on DDI (Data Documentation Initiative) XML formats."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "DDI-RDF Discovery Vocabulary"},
   :owl/versionInfo "Version 0.6 - 2013-09-30",
   :rdf/about "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdf/ns-prefix-map {"adms" "http://www.w3.org/ns/adms#",
                       "dcat" "http://www.w3.org/ns/dcat#",
                       "dcmitype" "http://purl.org/dc/terms/DCMIType",
                       "dcterms" "http://purl.org/dc/elements/1.1/",
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
   :rdfa/uri "http://rdf-vocabulary.ddialliance.org/discovery#",
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This specification defines the DDI Discovery Vocabulary, an RDF Schema vocabulary that enables discovery of research and survey data on the Web. It is based on DDI (Data Documentation Initiative) XML formats."}})

(def AnalysisUnit
  "The process collecting data is focusing on the analysis of a particular type of subject. If, for example, the adult population of Finland is being studied, the AnalysisUnit would be individuals or persons."
  {:rdf/about :disco/AnalysisUnit,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The process collecting data is focusing on the analysis of a particular type of subject. If, for example, the adult population of Finland is being studied, the AnalysisUnit would be individuals or persons."},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "Analyseeinheit"}
                {:rdf/language "en",
                 :rdf/value    "Analysis Unit"}],
   :rdfs/subClassOf :skos/Concept})

(def CategoryStatistics
  "For CategoryStatistics, frequencies, percentages, and weighted percentages can be defined."
  {:rdf/about :disco/CategoryStatistics,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For CategoryStatistics, frequencies, percentages, and weighted percentages can be defined."},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Category statistics"},
   :rdfs/subClassOf :disco/DescriptiveStatistics})

(def DataFile
  "The class DataFile, which is also a dcmitype:Dataset, represents all the data files containing the microdata datasets."
  {:rdf/about :disco/DataFile,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The class DataFile, which is also a dcmitype:Dataset, represents all the data files containing the microdata datasets."},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Fichier de données"}
                {:rdf/language "en",
                 :rdf/value    "Data file"}],
   :rdfs/subClassOf [:dcmitype/Dataset :dcat/Distribution]})

(def DescriptiveStatistics
  "SummaryStatistics pointing to variables and CategoryStatistics pointing to categories and codes are both DescriptiveStatistics."
  {:rdf/about :disco/DescriptiveStatistics,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "SummaryStatistics pointing to variables and CategoryStatistics pointing to categories and codes are both DescriptiveStatistics."},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Statistique descriptive"}
                {:rdf/language "en",
                 :rdf/value    "Descriptive statistics"}]})

(def Instrument
  "The data for the study are collected by an Instrument. The purpose of an Instrument, i.e. an interview, a questionnaire or another entity used as a means of data collection, is in the case of a survey to record the flow of a questionnaire, its use of questions, and additional component parts. A questionnaire contains a flow of questions."
  {:rdf/about :disco/Instrument,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The data for the study are collected by an Instrument. The purpose of an Instrument, i.e. an interview, a questionnaire or another entity used as a means of data collection, is in the case of a survey to record the flow of a questionnaire, its use of questions, and additional component parts. A questionnaire contains a flow of questions."},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Instrument de collecte"}
                {:rdf/language "en",
                 :rdf/value    "Instrument"}]})

(def LogicalDataSet
  "Each study has a set of logical metadata associated with the processing of data, at the time of collection or later during cleaning, and re-coding. LogicalDataSet represents the microdata dataset."
  {:rdf/about :disco/LogicalDataSet,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Each study has a set of logical metadata associated with the processing of data, at the time of collection or later during cleaning, and re-coding. LogicalDataSet represents the microdata dataset."},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Ensemble de données"}
                {:rdf/language "en",
                 :rdf/value    "LogicalDataSet"}],
   :rdfs/subClassOf [:skos/Concept :dcat/Dataset]})

(def Mapping
  "This class is for representing mappings betwenn DDI-RDF and DDI-XML. See Section 10 in the specification for more details and examples."
  {:rdf/about :disco/Mapping,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This class is for representing mappings betwenn DDI-RDF and DDI-XML. See Section 10 in the specification for more details and examples."},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mapping"}})

(def Question
  "A Question is designed to get information upon a subject, or sequence of subjects, from a respondent."
  {:rdf/about :disco/Question,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Question is designed to get information upon a subject, or sequence of subjects, from a respondent."},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Question"}
                {:rdf/language "en",
                 :rdf/value    "Question"}],
   :rdfs/subClassOf :skos/Concept})

(def Questionnaire
  "A questionnaire contains a flow of questions. Questionnaires must contain 1 to n questions using the object property question. Particular questions may be contained in 0 to n questionnaires."
  {:rdf/about :disco/Questionnaire,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A questionnaire contains a flow of questions. Questionnaires must contain 1 to n questions using the object property question. Particular questions may be contained in 0 to n questionnaires."},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "Fragebogen"}
                {:rdf/language "en",
                 :rdf/value    "Questionnaire"}],
   :rdfs/subClassOf :disco/Instrument})

(def Representation
  "Representation of a variable or question definition."
  {:rdf/about        :disco/Representation,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Representation of a variable or question definition."},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value
                      "Representation of a variable or question definition."},
   :rdfs/subClassOf  {:owl/unionOf [:rdfs/Datatype
                                    :skos/ConceptScheme
                                    :skos/OrderedCollection],
                      :rdf/type    :owl/Class}})

(def RepresentedVariable
  "RepresentedVariables encompasse study-independent, re-usable parts of variables like occupation classification."
  {:rdf/about :disco/RepresentedVariable,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "RepresentedVariables encompasse study-independent, re-usable parts of variables like occupation classification."},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Élément de donnée"}
                {:rdf/language "en",
                 :rdf/value    "Data element"}]})

(def Study
  "A Study represents the process by which a data set was generated or collected."
  {:rdf/about :disco/Study,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Study represents the process by which a data set was generated or collected."},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Étude"}
                {:rdf/language "en",
                 :rdf/value    "Study"}]})

(def StudyGroup
  "In some cases, where data collection is cyclic or on-going, data sets may be released as a StudyGroup, where each cycle or wave of the data collection activity produces one or more data sets. This is typical for longitudinal studies, panel studies, and other types of series (to use the DDI term). In this case, a number of Study objects would be collected into a single StudyGroup."
  {:rdf/about :disco/StudyGroup,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "In some cases, where data collection is cyclic or on-going, data sets may be released as a StudyGroup, where each cycle or wave of the data collection activity produces one or more data sets. This is typical for longitudinal studies, panel studies, and other types of series (to use the DDI term). In this case, a number of Study objects would be collected into a single StudyGroup."},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "Studiengruppe"}
                {:rdf/language "en",
                 :rdf/value    "Study Group"}]})

(def SummaryStatistics
  "For SummaryStatistics, maximum values, minimum values, and standard deviations can be defined."
  {:rdf/about :disco/SummaryStatistics,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For SummaryStatistics, maximum values, minimum values, and standard deviations can be defined."},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Summary statistics"},
   :rdfs/subClassOf :disco/DescriptiveStatistics})

(def Universe
  "A Universe is the total membership or population of a defined class of people, objects or events."
  {:rdf/about :disco/Universe,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Universe is the total membership or population of a defined class of people, objects or events."},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Univers"}
                {:rdf/language "en",
                 :rdf/value    "Universe"}],
   :rdfs/subClassOf :skos/Concept})

(def Variable
  "Variables provide a definition of the column in a rectangular data file. Variable is a characteristic of a unit being observed. A variable might be the answer of a question, have an administrative source, or be derived from other variables."
  {:owl/equivalentClass "http://semanticscience.org/resource/SIO_000367",
   :rdf/about :disco/Variable,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Variables provide a definition of the column in a rectangular data file. Variable is a characteristic of a unit being observed. A variable might be the answer of a question, have an administrative source, or be derived from other variables."},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Variable"}
                {:rdf/language "en",
                 :rdf/value    "Variable"}],
   :rdfs/subClassOf :skos/Concept})

(def aggregation
  "This property points to the aggregated data set of a microdata data set. The aggregated data set is a qb:DataSet of the RDF Data Cube Vocabulary."
  {:rdf/about :disco/aggregation,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property points to the aggregated data set of a microdata data set. The aggregated data set is a qb:DataSet of the RDF Data Cube Vocabulary."},
   :rdfs/domain :disco/LogicalDataSet,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "aggregation"},
   :rdfs/range :qb/DataSet})

(def analysisUnit
  "This property links to the analysis unit of a Study, a StudyGroup, or a Variable."
  {:rdf/about :disco/analysisUnit,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property links to the analysis unit of a Study, a StudyGroup, or a Variable."},
   :rdfs/domain {:owl/unionOf [:disco/Study :disco/StudyGroup :disco/Variable],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "Analyseeinheit"}
                {:rdf/language "en",
                 :rdf/value    "analysis unit"}],
   :rdfs/range :disco/AnalysisUnit})

(def basedOn
  "This property points to the RepresentedVariable the Variable is based on."
  {:rdf/about :disco/basedOn,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property points to the RepresentedVariable the Variable is based on."},
   :rdfs/domain :disco/Variable,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "utilise l'élément de donnée"}
                {:rdf/language "en",
                 :rdf/value    "based on"}],
   :rdfs/range :disco/RepresentedVariable})

(def caseQuantity
  "This property is used for representing the case quantity of a DataFile."
  {:rdf/about :disco/caseQuantity,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property is used for representing the case quantity of a DataFile."},
   :rdfs/domain :disco/DataFile,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "nombre d'observations"}
                {:rdf/language "en",
                 :rdf/value    "number of cases"}],
   :rdfs/range :xsd/nonNegativeInteger})

(def collectionMode
  "This property points to the mode of collection of a Questionnaire which is a skos:Concept."
  {:rdf/about :disco/collectionMode,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property points to the mode of collection of a Questionnaire which is a skos:Concept."},
   :rdfs/domain :disco/Questionnaire,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "Datenerfassungsmodus"}
                {:rdf/language "en",
                 :rdf/value    "collection mode"}],
   :rdfs/range :skos/Concept})

(def computationBase
  "computationBase expresses if the cases - which are the basis of the computation of a statistics value - are valid, invalid or the total of both. The usage of computationBase for frequency differs from the usage for the percentage statistics and the summary statistics. A distinction regarding computationBase doesn’t apply to frequency as category statistic. Please find more details in Section 6.3 of the specification."
  {:rdf/about :disco/computationBase,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "computationBase expresses if the cases - which are the basis of the computation of a statistics value - are valid, invalid or the total of both. The usage of computationBase for frequency differs from the usage for the percentage statistics and the summary statistics. A distinction regarding computationBase doesn’t apply to frequency as category statistic. Please find more details in Section 6.3 of the specification."},
   :rdfs/domain :disco/CategoryStatistics,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "pourcentage"}
                {:rdf/language "en",
                 :rdf/value    "computation base"}],
   :rdfs/range :rdf/langString})

(def concept
  "This property points to the DDI concept of a RepresentedVariable, a Variable, or a Question"
  {:rdf/about :disco/concept,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property points to the DDI concept of a RepresentedVariable, a Variable, or a Question"},
   :rdfs/domain
   {:owl/unionOf [:disco/RepresentedVariable :disco/Question :disco/Variable],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "a pour concept"}
                {:rdf/language "en",
                 :rdf/value    "concept"}],
   :rdfs/range :skos/Concept})

(def context
  "context specifies conditions which have to be fulfilled for particular mappings. Context information can be either a SPARQL query or an informal description as plain literal."
  {:rdf/about :disco/context,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "context specifies conditions which have to be fulfilled for particular mappings. Context information can be either a SPARQL query or an informal description as plain literal."},
   :rdfs/domain :disco/Mapping,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label
   {:rdf/language "en",
    :rdf/value
    "context specifies conditions which have to be fulfilled for specific mappings"},
   :rdfs/range :rdf/langString})

(def cumulativePercentage
  "This property is used to describe the cumulative percentages within category statistics. See Sections 6 and 7 more more details and examples."
  {:rdf/about :disco/cumulativePercentage,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property is used to describe the cumulative percentages within category statistics. See Sections 6 and 7 more more details and examples."},
   :rdfs/domain :disco/CategoryStatistics,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cumulative percentage"},
   :rdfs/range :xsd/double})

(def dataFile
  "This property points to the DataFile of a Study or a LogicalDataSet."
  {:rdf/about :disco/dataFile,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property points to the DataFile of a Study or a LogicalDataSet."},
   :rdfs/domain {:owl/unionOf [:disco/Study :disco/LogicalDataSet],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "a pour fichier de données"}
                {:rdf/language "en",
                 :rdf/value    "data file"}],
   :rdfs/range :disco/DataFile})

(def ddifile
  "This property points from a Study or a StudyGroup to the original DDI file which is a foaf:Document."
  {:rdf/about :disco/ddifile,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property points from a Study or a StudyGroup to the original DDI file which is a foaf:Document."},
   :rdfs/domain {:owl/unionOf [:disco/Study :disco/StudyGroup],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "DDI-Datei"}
                {:rdf/language "en",
                 :rdf/value    "DDI file"}],
   :rdfs/range :foaf/Document})

(def endDate
  "Defines the end date of a period of time. Please note that this property is a feature at risk, since the domain is not a class of Disco. Maintainers of the domain ontology may define their own property."
  {:rdf/about :disco/endDate,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Defines the end date of a period of time. Please note that this property is a feature at risk, since the domain is not a class of Disco. Maintainers of the domain ontology may define their own property."},
   :rdfs/domain :dcterms/PeriodOfTime,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "end date"},
   :rdfs/range :xsd/date})

(def externalDocumentation
  "This property points from an Instrument to a foaf:Document which is the external documentation of the Instrument."
  {:rdf/about :disco/externalDocumentation,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property points from an Instrument to a foaf:Document which is the external documentation of the Instrument."},
   :rdfs/domain :disco/Instrument,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "externe Dokumentation"}
                {:rdf/language "en",
                 :rdf/value    "external documentation"}],
   :rdfs/range :foaf/Document})

(def frequency
  "This property is used to describe the frequencies within category statistics. See Sections 6 and 7 more more details and examples."
  {:rdf/about :disco/frequency,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property is used to describe the frequencies within category statistics. See Sections 6 and 7 more more details and examples."},
   :rdfs/domain :disco/CategoryStatistics,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "fréquence"}
                {:rdf/language "en",
                 :rdf/value    "frequency"}],
   :rdfs/range :xsd/nonNegativeInteger})

(def fundedBy
  "This property points from a Study or a StudyGroup to the funding foaf:Agent which is either a foaf:Person or a org:Organization."
  {:rdf/about :disco/fundedBy,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property points from a Study or a StudyGroup to the funding foaf:Agent which is either a foaf:Person or a org:Organization."},
   :rdfs/domain {:owl/unionOf [:disco/Study :disco/StudyGroup],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "funded by"},
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf :dcterms/contributor})

(def hadRole
  "This property indicates the role of an Agent, e.g. analyst, data modeler, programmer, co-investigator or others."
  {:rdf/about :disco/hadRole,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property indicates the role of an Agent, e.g. analyst, data modeler, programmer, co-investigator or others."},
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "had role"},
   :rdfs/range :skos/Concept})

(def inGroup
  "This property points from a Study to the StudyGroup which contains the Study."
  {:rdf/about :disco/inGroup,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property points from a Study to the StudyGroup which contains the Study."},
   :rdfs/domain :disco/Study,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "in group"},
   :rdfs/range :disco/StudyGroup})

(def inputVariable
  "This property indicates the original Variable of an aggregated qb:DataSet. Please note that this property is a feature at risk, since the domain is not a class of Disco. Maintainers of the domain ontology may define their own property."
  {:rdf/about :disco/inputVariable,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property indicates the original Variable of an aggregated qb:DataSet. Please note that this property is a feature at risk, since the domain is not a class of Disco. Maintainers of the domain ontology may define their own property."},
   :rdfs/domain :qb/DataSet,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "variable en entrée"}
                {:rdf/language "en",
                 :rdf/value    "input variable"}],
   :rdfs/range :disco/Variable})

(def instrument
  "This property indicates the Instrument of a Study or a LogicalDataSet."
  {:rdf/about :disco/instrument,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property indicates the Instrument of a Study or a LogicalDataSet."},
   :rdfs/domain {:owl/unionOf [:disco/Study :disco/LogicalDataSet],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "a comme instrument"}
                {:rdf/language "en",
                 :rdf/value    "instrument"}],
   :rdfs/range :disco/Instrument})

(def isPublic
  "This property is used as a flag indicating if the microdata dataset is publicly available. The value true indicates that the dataset can be accessed (usually downloaded) by anyone."
  {:rdf/about :disco/isPublic,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property is used as a flag indicating if the microdata dataset is publicly available. The value true indicates that the dataset can be accessed (usually downloaded) by anyone."},
   :rdfs/domain :disco/LogicalDataSet,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "ist öffentlich"}
                {:rdf/language "en",
                 :rdf/value    "is public"}],
   :rdfs/range :xsd/boolean})

(def isValid
  "Indicates if the code (represented by skos:Concept) is valid or missing. Please note that this property is a feature at risk, since the domain is not a class of Disco. Maintainers of the domain ontology may define their own property."
  {:rdf/about :disco/isValid,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicates if the code (represented by skos:Concept) is valid or missing. Please note that this property is a feature at risk, since the domain is not a class of Disco. Maintainers of the domain ontology may define their own property."},
   :rdfs/domain :skos/Concept,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is valid"},
   :rdfs/range :xsd/boolean})

(def kindOfData
  "The general kind of data (e.g. geospatial, register, survey) collected in this study, given either as a skos:Concept, or as a blank node with attached free-text rdfs:label."
  {:rdf/about :disco/kindOfData,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "The general kind of data (e.g. geospatial, register, survey) collected in this study, given either as a skos:Concept, or as a blank node with attached free-text rdfs:label.",
   :rdfs/domain {:owl/unionOf [:disco/Study :disco/StudyGroup],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "kind of data"},
   :rdfs/range :skos/Concept})

(def mappingDDI-C
  "Mapping from and to DDI-C. See Section 10 in the specification for more details and examples."
  {:rdf/about :disco/mappingDDI-C,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Mapping from and to DDI-C. See Section 10 in the specification for more details and examples."},
   :rdfs/domain :disco/Mapping,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mapping from and to DDI-C"},
   :rdfs/range :rdf/langString})

(def mappingDDI-L
  "Mapping from and to DDI-L. See Section 10 in the specification for more details and examples."
  {:rdf/about :disco/mappingDDI-L,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Mapping from and to DDI-L. See Section 10 in the specification for more details and examples."},
   :rdfs/domain :disco/Mapping,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mapping from and to DDI-L"},
   :rdfs/range :rdf/langString})

(def percentage
  "This property is used to describe the percentages within category statistics. See Sections 6 and 7 more more details and examples."
  {:rdf/about :disco/percentage,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property is used to describe the percentages within category statistics. See Sections 6 and 7 more more details and examples."},
   :rdfs/domain :disco/CategoryStatistics,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "pourcentage"}
                {:rdf/language "en",
                 :rdf/value    "percentage"}],
   :rdfs/range :xsd/double})

(def product
  "This property indicates the LogicalDataSets of a Study."
  {:rdf/about :disco/product,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "This property indicates the LogicalDataSets of a Study."},
   :rdfs/domain :disco/Study,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "Produkt"}
                {:rdf/language "en",
                 :rdf/value    "product"}],
   :rdfs/range :qb/LogicalDataSet})

(def purpose
  "The purpose of a Study of a StudyGroup."
  {:rdf/about        :disco/purpose,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The purpose of a Study of a StudyGroup."},
   :rdfs/domain      {:owl/unionOf [:disco/Study :disco/StudyGroup],
                      :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label       [{:rdf/language "de",
                       :rdf/value    "Grund"}
                      {:rdf/language "en",
                       :rdf/value    "purpose"}],
   :rdfs/range       :rdf/langString})

(def question
  "This property indicates the Questions associated to Variables or contained in Questionnaires."
  {:rdf/about :disco/question,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property indicates the Questions associated to Variables or contained in Questionnaires."},
   :rdfs/domain {:owl/unionOf [:disco/Variable :disco/Questionnaire],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "a comme question"}
                {:rdf/language "en",
                 :rdf/value    "question"}],
   :rdfs/range :disco/Question})

(def questionText
  "This property contains the actual text of a question as string. See Section 8.2 for examples."
  {:rdf/about :disco/questionText,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property contains the actual text of a question as string. See Section 8.2 for examples."},
   :rdfs/domain :disco/Question,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "Fragetext"}
                {:rdf/language "en",
                 :rdf/value    "question text"}],
   :rdfs/range :rdf/langString})

(def representation
  "RepresentedVariables and Variables can have a Representation whose individuals are either of the class rdfs:Datatype (to represent values) or skos:ConceptScheme (to represent code lists)."
  {:rdf/about :disco/representation,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "RepresentedVariables and Variables can have a Representation whose individuals are either of the class rdfs:Datatype (to represent values) or skos:ConceptScheme (to represent code lists)."},
   :rdfs/domain
   {:owl/unionOf [:disco/RepresentedVariable :disco/Variable :disco/Question],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "a pour représentation"}
                {:rdf/language "en",
                 :rdf/value    "representation"}],
   :rdfs/range {:owl/unionOf [:skos/ConceptScheme :rdfs/Datatype],
                :rdf/type    :owl/Class}})

(def responseDomain
  "The response domain of questions. The response domain has to be an instance of the class Representation."
  {:rdf/about :disco/responseDomain,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The response domain of questions. The response domain has to be an instance of the class Representation."},
   :rdfs/domain :disco/Question,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "responseDomain"},
   :rdfs/range :disco/Representation})

(def startDate
  "Defines the start date of a period of time. Please note that this property is a feature at risk, since the domain is not a class of Disco. Maintainers of the domain ontology may define their own property."
  {:rdf/about :disco/startDate,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Defines the start date of a period of time. Please note that this property is a feature at risk, since the domain is not a class of Disco. Maintainers of the domain ontology may define their own property."},
   :rdfs/domain :dcterms/PeriodOfTime,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "start date"},
   :rdfs/range :xsd/date})

(def statisticsCategory
  "This property points to the skos:Concept (representing codes and categories) of a specific CategoryStatistics individual."
  {:rdf/about :disco/statisticsCategory,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property points to the skos:Concept (representing codes and categories) of a specific CategoryStatistics individual."},
   :rdfs/domain :disco/CategoryStatistics,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "a pour concept statistique"}
                {:rdf/language "en",
                 :rdf/value    "statistics category"}],
   :rdfs/range :skos/Concept})

(def statisticsDataFile
  "This property indicates the DataFile of a specific DesciptiveStatistics individual. DescriptiveStatistics may have statisticsDataFile relations to 0 to n data files (DataFile) and data files (DataFile) may be in 0 to n statisticsDataFile relations to DescriptiveStatistics individuals."
  {:rdf/about :disco/statisticsDataFile,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property indicates the DataFile of a specific DesciptiveStatistics individual. DescriptiveStatistics may have statisticsDataFile relations to 0 to n data files (DataFile) and data files (DataFile) may be in 0 to n statisticsDataFile relations to DescriptiveStatistics individuals."},
   :rdfs/domain :disco/DescriptiveStatistics,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "a pour fichier statistique"}
                {:rdf/language "en",
                 :rdf/value    "statistics data file"}],
   :rdfs/range :disco/DataFile})

(def statisticsVariable
  "This property indicates the Variable of a specific SummaryStatistics individual. SummaryStatistics point to 0 to n variables (Variable) using the object property statisticsVariable."
  {:rdf/about :disco/statisticsVariable,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property indicates the Variable of a specific SummaryStatistics individual. SummaryStatistics point to 0 to n variables (Variable) using the object property statisticsVariable."},
   :rdfs/domain :disco/SummaryStatistics,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "a pour variable statistique"}
                {:rdf/language "en",
                 :rdf/value    "statistics variable"}],
   :rdfs/range :disco/Variable})

(def subtitle
  "The sub-title of a Study of a StudyGroup."
  {:rdf/about        :disco/subtitle,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "The sub-title of a Study of a StudyGroup."},
   :rdfs/domain      {:owl/unionOf [:disco/Study :disco/StudyGroup],
                      :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label       [{:rdf/language "de",
                       :rdf/value    "Untertitel"}
                      {:rdf/language "en",
                       :rdf/value    "subtitle"}],
   :rdfs/range       :rdf/langString})

(def summaryStatisticsType
  "This property points to the summary statistics type of a Questionnaire which is a skos:Concept."
  {:rdf/about :disco/summaryStatisticsType,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property points to the summary statistics type of a Questionnaire which is a skos:Concept."},
   :rdfs/domain :disco/SummaryStatistics,
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "summary statistics type"},
   :rdfs/range :skos/Concept})

(def universe
  "This property indicates the Universe(s) of Studies, StudyGrous, RepresentedVariables, Variables, Questions, and LogicalDataSets."
  {:rdf/about :disco/universe,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property indicates the Universe(s) of Studies, StudyGrous, RepresentedVariables, Variables, Questions, and LogicalDataSets."},
   :rdfs/domain {:owl/unionOf [:disco/Study
                               :disco/StudyGroup
                               :disco/RepresentedVariable
                               :disco/Variable
                               :disco/Question
                               :disco/LogicalDataSet],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "a comme univers"}
                {:rdf/language "en",
                 :rdf/value    "universe"}],
   :rdfs/range :disco/Universe})

(def variable
  "This property indicates the Variable of a Study and points to Variable contained in the LogicalDataSet."
  {:rdf/about :disco/variable,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property indicates the Variable of a Study and points to Variable contained in the LogicalDataSet."},
   :rdfs/domain {:owl/unionOf [:disco/Study :disco/LogicalDataSet],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "Variable"}
                {:rdf/language "en",
                 :rdf/value    "variable"}],
   :rdfs/range :disco/Variable})

(def variableQuantity
  "This property can be used when (1) no variable level information is available and when (2) only a stub of the RDF is requested e.g when returning basic information on a study of file, no information on potentially hundreds or thousands of variables references or metadata has to be returned."
  {:rdf/about :disco/variableQuantity,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property can be used when (1) no variable level information is available and when (2) only a stub of the RDF is requested e.g when returning basic information on a study of file, no information on potentially hundreds or thousands of variables references or metadata has to be returned."},
   :rdfs/domain {:owl/unionOf [:disco/LogicalDataSet :disco/DataFile],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "variable quantity"},
   :rdfs/range :xsd/nonNegativeInteger})

(def weightedBy
  "SummaryStatistics or CategoryStatistics resources may be weighted by a specific Variable."
  {:rdf/about :disco/weightedBy,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "SummaryStatistics or CategoryStatistics resources may be weighted by a specific Variable."},
   :rdfs/domain {:owl/unionOf [:disco/SummaryStatistics
                               :disco/CategoryStatistics],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://rdf-vocabulary.ddialliance.org/discovery",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    ""}
                {:rdf/language "en",
                 :rdf/value    "weighted by"}],
   :rdfs/range :disco/Variable})