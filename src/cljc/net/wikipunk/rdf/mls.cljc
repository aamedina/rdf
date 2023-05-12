(ns net.wikipunk.rdf.mls
  "ML-Schema is a collaborative, community effort with a mission to develop, maintain, and promote standard schemas for data mining and machine learning algorithms, datasets, and experiments"
  {:dcterms/description
   "ML-Schema is a collaborative, community effort with a mission to develop, maintain, and promote standard schemas for data mining and machine learning algorithms, datasets, and experiments",
   :dcterms/hasVersion 1,
   :dcterms/title "Machine Learning Schema",
   :owl/versionIRI "http://www.w3.org/2016/03/mls#",
   :rdf/ns-prefix-map {"mls"  "http://www.w3.org/ns/mls#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xml"  "http://www.w3.org/XML/1998/namespace",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "mls",
   :rdfa/uri "http://www.w3.org/ns/mls#",
   "http://protege.stanford.edu/plugins/owl/protege#defaultLanguage" "EN"})

(def Algorithm
  "The algorithm regardless software implementation."
  {:db/ident            :mls/Algorithm,
   :dcterms/description "The algorithm regardless software implementation.",
   :rdf/type            :owl/Class,
   :rdfs/comment        "The algorithm regardless software implementation.",
   :rdfs/subClassOf     [:mls/InformationEntity :mls/Algorithm]})

(def Data
  "Data is a data item composed of data examples and it may be of a various level of granularity and complexity. With regard to granularity, it can be a whole dataset (for instance, one main table and possibly other tables), or only a single table, or only a feature (e.g., a column of a table), or only an instance (e.g., row of a table), or a single feature-value pair. With regard to complexity, data examples are characterized by their datatype, which may be arbitrarily complex (e.g., instead of a table it can be an arbitrary graph)."
  {:db/ident :mls/Data,
   :dcterms/description
   "Data is a data item composed of data examples and it may be of a various level of granularity and complexity. \nWith regard to granularity, it can be a whole dataset (for instance, one main table and possibly other tables), or only a single table, or only a feature (e.g., a column of a table), or only an instance (e.g., row of a table), or a single feature-value pair. \nWith regard to complexity, data examples are characterized by their datatype, which may be arbitrarily complex (e.g., instead of a table it can be an arbitrary graph).",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Data is a data item composed of data examples and it may be of a various level of granularity and complexity. \nWith regard to granularity, it can be a whole dataset (for instance, one main table and possibly other tables), or only a single table, or only a feature (e.g., a column of a table), or only an instance (e.g., row of a table), or a single feature-value pair. \nWith regard to complexity, data examples are characterized by their datatype, which may be arbitrarily complex (e.g., instead of a table it can be an arbitrary graph).",
   :rdfs/subClassOf [{:owl/onProperty     :mls/hasQuality,
                      :owl/someValuesFrom :mls/DataCharacteristic,
                      :rdf/type           :owl/Restriction}
                     :mls/InformationEntity
                     :mls/Data]})

(def DataCharacteristic
  "DataCharacteristic is a distinguishing quality or property that distinguish one data from another. Such characteristics are often statistical ones (e.g., the number of instances or the number of features of a data set). They may be also informationtheoretic measures (e.g., class entropy of a categorical data set) or geometric measures of data complexity (e.g., the highest discriminatory power of any single feature in the data set)."
  {:db/ident :mls/DataCharacteristic,
   :dcterms/description
   "DataCharacteristic is a distinguishing quality or property that distinguish one data from another.\nSuch characteristics are often statistical ones (e.g., the number of instances\nor the number of features of a data set). They may be also informationtheoretic measures (e.g., class entropy of a categorical data set) or geometric measures of data complexity (e.g., the highest discriminatory power of any single feature in the data set).",
   :rdf/type :owl/Class,
   :rdfs/comment
   "DataCharacteristic is a distinguishing quality or property that distinguish one data from another.\nSuch characteristics are often statistical ones (e.g., the number of instances\nor the number of features of a data set). They may be also informationtheoretic measures (e.g., class entropy of a categorical data set) or geometric measures of data complexity (e.g., the highest discriminatory power of any single feature in the data set).",
   :rdfs/subClassOf [:mls/Quality :mls/DataCharacteristic]})

(def Dataset
  {:db/ident        :mls/Dataset,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:mls/Data
                     :mls/Dataset
                     {:owl/onProperty     :mls/hasQuality,
                      :owl/someValuesFrom :mls/DataCharacteristic,
                      :rdf/type           :owl/Restriction}
                     :mls/InformationEntity]})

(def DatasetCharacteristic
  {:db/ident        :mls/DatasetCharacteristic,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:mls/DataCharacteristic
                     :mls/DatasetCharacteristic
                     :mls/Quality]})

(def EvaluationMeasure
  "EvaluationMeasure is a measure to assess the performance of the model generated by the process that realizes the task. Examples are predictive accuracy or f-measure."
  {:db/ident :mls/EvaluationMeasure,
   :dcterms/description
   "EvaluationMeasure is a measure to assess the performance of the model generated by the process that realizes the task. Examples are predictive accuracy or f-measure.",
   :rdf/type :owl/Class,
   :rdfs/comment
   "EvaluationMeasure is a measure to assess the performance of the model generated by the process that realizes the task. Examples are predictive accuracy or f-measure.",
   :rdfs/subClassOf [:mls/InformationEntity :mls/EvaluationMeasure]})

(def EvaluationProcedure
  "EvaluationProcedure is a technique to evaluate machine learning models. Examples are cross-validation and leave-one-out."
  {:db/ident :mls/EvaluationProcedure,
   :dcterms/description
   "EvaluationProcedure is a technique to evaluate machine learning models. Examples are cross-validation and leave-one-out.",
   :rdf/type :owl/Class,
   :rdfs/comment
   "EvaluationProcedure is a technique to evaluate machine learning models. Examples are cross-validation and leave-one-out.",
   :rdfs/subClassOf [:mls/InformationEntity :mls/EvaluationProcedure]})

(def EvaluationSpecification
  "EvaluationSpecification is a specification of an evaluation measure and an evaluation procedure to assess the performance of the process that realizes the task."
  {:db/ident :mls/EvaluationSpecification,
   :dcterms/description
   "EvaluationSpecification is a specification of an evaluation measure and an evaluation procedure to assess the performance of the process that realizes the task.",
   :rdf/type :owl/Class,
   :rdfs/comment
   "EvaluationProcedure is a technique to evaluate machine learning models. Examples are cross-validation and leave-one-out.",
   :rdfs/subClassOf [{:owl/onProperty     :mls/hasPart,
                      :owl/someValuesFrom :mls/EvaluationMeasure,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :mls/defines,
                      :owl/someValuesFrom :mls/Task,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :mls/hasPart,
                      :owl/someValuesFrom :mls/EvaluationProcedure,
                      :rdf/type           :owl/Restriction}
                     :mls/InformationEntity
                     :mls/EvaluationSpecification]})

(def Experiment
  "Experiment is a collection of runs."
  {:db/ident            :mls/Experiment,
   :dcterms/description "Experiment is a collection of runs.",
   :rdf/type            :owl/Class,
   :rdfs/comment        "Experiment is a collection of runs.",
   :rdfs/subClassOf     [{:owl/onProperty     :mls/hasPart,
                          :owl/someValuesFrom :mls/Run,
                          :rdf/type           :owl/Restriction}
                         :mls/Process
                         :mls/Experiment]})

(def Feature
  {:db/ident        :mls/Feature,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:mls/Data
                     :mls/Feature
                     {:owl/onProperty     :mls/hasQuality,
                      :owl/someValuesFrom :mls/DataCharacteristic,
                      :rdf/type           :owl/Restriction}
                     :mls/InformationEntity]})

(def FeatureCharacteristic
  {:db/ident        :mls/FeatureCharacteristic,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:mls/DataCharacteristic
                     :mls/FeatureCharacteristic
                     :mls/Quality]})

(def HyperParameter
  "Hyperparameter is a prior parameter of an implementation, i.e., a parameter which is set before its execution (e.g. C, the complexity parameter, in weka.SMO)."
  {:db/ident :mls/HyperParameter,
   :dcterms/description
   "Hyperparameter is a prior parameter of an implementation, i.e., a parameter which is set before its execution (e.g. C, the complexity parameter, in weka.SMO).",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Hyperparameter is a prior parameter of an implementation, i.e., a parameter which is set before its execution (e.g. C, the complexity parameter, in weka.SMO).",
   :rdfs/subClassOf [:mls/InformationEntity :mls/HyperParameter]})

(def HyperParameterSetting
  "HyperParameterSetting is an entity which connects a hyperparameter and its value that is being set before an implementation execution."
  {:db/ident :mls/HyperParameterSetting,
   :dcterms/description
   "HyperParameterSetting is an entity which connects a hyperparameter and its value that is being set before an implementation execution.",
   :rdf/type :owl/Class,
   :rdfs/comment
   "HyperParameterSetting is an entity which connects a hyperparameter and its value that is being set before an implementation execution.",
   :rdfs/subClassOf [{:owl/onProperty     :mls/specifiedBy,
                      :owl/someValuesFrom :mls/HyperParameter,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :mls/hasValue,
                      :owl/someValuesFrom :rdfs/Literal,
                      :rdf/type           :owl/Restriction}
                     :mls/InformationEntity
                     :mls/HyperParameterSetting]})

(def Implementation
  "Implementation is an executable implementation of a machine learning algorithm, a script, or a workflow. It is versioned, and sometimes belongs to a library (e.g. WEKA)."
  {:db/ident :mls/Implementation,
   :dcterms/description
   "Implementation is an executable implementation of a machine learning algorithm, a script, or a workflow. It is versioned, and sometimes belongs to a library (e.g. WEKA).",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Implementation is an executable implementation of a machine learning algorithm, a script, or a workflow. It is versioned, and sometimes belongs to a library (e.g. WEKA).",
   :rdfs/subClassOf [{:owl/onProperty     :mls/implements,
                      :owl/someValuesFrom :mls/Algorithm,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :mls/hasQuality,
                      :owl/someValuesFrom :mls/ImplementationCharacteristic,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :mls/hasHyperParameter,
                      :owl/someValuesFrom :mls/HyperParameter,
                      :rdf/type           :owl/Restriction}
                     :mls/InformationEntity
                     :mls/Implementation]})

(def ImplementationCharacteristic
  "ImplementationCharacteristic is a distinguishing quality or property that distinguish one implementation from another."
  {:db/ident :mls/ImplementationCharacteristic,
   :dcterms/description
   "ImplementationCharacteristic is a distinguishing quality or property that distinguish one implementation from another.",
   :rdf/type :owl/Class,
   :rdfs/comment
   "ImplementationCharacteristic is a distinguishing quality or property that distinguish one implementation from another.",
   :rdfs/subClassOf [:mls/Quality :mls/ImplementationCharacteristic]})

(def InformationEntity
  {:db/ident        :mls/InformationEntity,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :mls/InformationEntity})

(def Model
  "Model is a generalization of a set of training data able to predict values for unseen instances. It is an output from an execution of a data mining algorithm implementation. Models have a dual nature. They can be treated as data structures and as such represented, stored and manipulated. On the other hand, they act as functions and are executed, taking as input data examples and giving as output the result of applying the function to a data example. Models can also be divided into global or local ones. A global model has global coverage of a data set, i.e., it generalizes the whole data set. A local model, such as a pattern set, is a set of local hypotheses, i.e. each applies to a limited region of the data set."
  {:db/ident :mls/Model,
   :dcterms/description
   "Model is a generalization of a set of training data able to predict values for unseen instances. It is an output from an execution of a data mining algorithm implementation. Models have a dual nature. They can be treated as data structures and as such represented, stored and manipulated. On the other hand, they act as functions and are executed, taking as input data examples and giving as output the result of applying the function to a data example. Models can also be divided into global or local ones. A global model has global coverage of a data set, i.e., it generalizes the whole data set. A local model, such as a pattern set, is a set of local hypotheses, i.e. each applies to a limited region of the data set.",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Model is a generalization of a set of training data able to predict values for unseen instances. It is an output from an execution of a data mining algorithm implementation. Models have a dual nature. They can be treated as data structures and as such represented, stored and manipulated. On the other hand, they act as functions and are executed, taking as input data examples and giving as output the result of applying the function to a data example. Models can also be divided into global or local ones. A global model has global coverage of a data set, i.e., it generalizes the whole data set. A local model, such as a pattern set, is a set of local hypotheses, i.e. each applies to a limited region of the data set.",
   :rdfs/subClassOf [{:owl/onProperty     :mls/hasQuality,
                      :owl/someValuesFrom :mls/ModelCharacteristic,
                      :rdf/type           :owl/Restriction}
                     :mls/InformationEntity
                     :mls/Model]})

(def ModelCharacteristic
  "ModelCharacteristic is a distinguishing quality or property that distinguish one model from another. An example model characetristic may be interpretabilty or a complexity of the model."
  {:db/ident :mls/ModelCharacteristic,
   :dcterms/description
   "ModelCharacteristic is a distinguishing quality or property that distinguish one model from another. An example model characetristic may be interpretabilty or a complexity of the model.",
   :rdf/type :owl/Class,
   :rdfs/comment
   "ModelCharacteristic is a distinguishing quality or property that distinguish one model from another. An example model characetristic may be interpretabilty or a complexity of the model.",
   :rdfs/subClassOf [:mls/Quality :mls/ModelCharacteristic]})

(def ModelEvaluation
  "ModelEvaluation is a setting of a value of the performance measure specified by the evaluation specification. It connects a measure specification with its value."
  {:db/ident :mls/ModelEvaluation,
   :dcterms/description
   "ModelEvaluation is a setting of a value of the performance measure  specified by the evaluation specification. It connects a measure specification with its value.",
   :rdf/type :owl/Class,
   :rdfs/comment
   "ModelEvaluation is a setting of a value of the performance measure  specified by the evaluation specification. It connects a measure specification with its value.",
   :rdfs/subClassOf [{:owl/onProperty     :mls/specifiedBy,
                      :owl/someValuesFrom :mls/EvaluationMeasure,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :mls/hasValue,
                      :owl/someValuesFrom :rdfs/Literal,
                      :rdf/type           :owl/Restriction}
                     :mls/InformationEntity
                     :mls/ModelEvaluation]})

(def ProcessClass
  "Process"
  {:db/ident        :mls/Process,
   :rdf/type        :owl/Class,
   :rdfs/label      "Process",
   :rdfs/subClassOf :mls/Process})

(def Quality
  {:db/ident        :mls/Quality,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :mls/Quality})

(def Run
  "Run is an execution of an implementation on a machine (computer). It is limited in time (has a start and end point), can be successful or failed."
  {:db/ident :mls/Run,
   :dcterms/description
   "Run is an execution of an implementation on a machine (computer). It is limited in time (has a start and end point), can be successful or failed.",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Run is an execution of an implementation on a machine (computer). It is limited in time (has a start and end point), can be successful or failed.",
   :rdfs/subClassOf [{:owl/onProperty     :mls/hasOutput,
                      :owl/someValuesFrom :mls/Model,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :mls/hasOutput,
                      :owl/someValuesFrom :mls/ModelEvaluation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :mls/executes,
                      :owl/someValuesFrom :mls/Implementation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :mls/hasInput,
                      :owl/someValuesFrom :mls/HyperParameterSetting,
                      :rdf/type           :owl/Restriction}
                     :mls/Process
                     {:owl/onProperty     :mls/achieves,
                      :owl/someValuesFrom :mls/Task,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :mls/realizes,
                      :owl/someValuesFrom :mls/Algorithm,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :mls/hasInput,
                      :owl/someValuesFrom :mls/Data,
                      :rdf/type           :owl/Restriction}
                     :mls/Run]})

(def Software
  "Software is implemented computer programs, procedures, scripts or rules with associated documentation, possibly constituting an organized environment, stored in read/write memory for the purpose of being executed within a computer system."
  {:db/ident :mls/Software,
   :dcterms/description
   "Software is implemented computer programs, procedures, scripts or rules with associated documentation, possibly constituting an organized environment, stored in read/write memory for the purpose of being executed within a computer system.",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Software is implemented computer programs, procedures, scripts or rules with associated documentation, possibly constituting an organized environment, stored in read/write memory for the purpose of being executed within a computer system.",
   :rdfs/subClassOf [{:owl/onProperty     :mls/hasPart,
                      :owl/someValuesFrom :mls/Implementation,
                      :rdf/type           :owl/Restriction}
                     :mls/InformationEntity
                     :mls/Software]})

(def Study
  "Study is a collection of runs that belong together to do some kind of analysis on its results. This analysis can be general or very specific (e.g. a hypothesis test). Can be linked to files, data, that belong to it."
  {:db/ident :mls/Study,
   :dcterms/description
   "Study is a collection of runs that belong together to do some kind of analysis on its results. This analysis can be general or very specific (e.g. a hypothesis test). Can be linked to files, data, that belong to it.",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Study is a collection of runs that belong together to do some kind of analysis on its results. This analysis can be general or very specific (e.g. a hypothesis test). Can be linked to files, data, that belong to it.",
   :rdfs/subClassOf [{:owl/onProperty     :mls/hasPart,
                      :owl/someValuesFrom :mls/Experiment,
                      :rdf/type           :owl/Restriction}
                     :mls/Process
                     :mls/Study]})

(def Task
  "Task is a formal description of a process that needs to be completed (e.g. based on inputs and outputs). A Task is any piece of work that needs to be addressed in the data mining process. In ML Schema, it is defined based on data."
  {:db/ident :mls/Task,
   :dcterms/description
   "Task is a formal description of a process that needs to be completed (e.g. based on inputs and outputs). A Task is any piece of work that needs to be addressed in the data mining process. In ML Schema, it is defined based on data.",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Task is a formal description of a process that needs to be completed (e.g. based on inputs and outputs). A Task is any piece of work that needs to be addressed in the data mining process. In ML Schema, it is defined based on data.",
   :rdfs/subClassOf [{:owl/onProperty     :mls/definedOn,
                      :owl/someValuesFrom :mls/Data,
                      :rdf/type           :owl/Restriction}
                     :mls/InformationEntity
                     :mls/Task]})

(def achieves
  "A relation between a run and a task, where the run achieves specifications formulated by the task."
  {:db/ident :mls/achieves,
   :dcterms/description
   "A relation between a run and a task, where the run achieves specifications formulated by the task.",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between a run and a task, where the run achieves specifications formulated by the task."})

(def definedOn
  "A relation between a task and either the data or an evaluation specification pertinent to this task."
  {:db/ident :mls/definedOn,
   :dcterms/description
   "A relation between a task and either the data or an evaluation specification pertinent to this task.",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between a task and either the data or an evaluation specification pertinent to this task.",
   :rdfs/label "definedOn",
   :rdfs/subPropertyOf [:owl/topObjectProperty :mls/definedOn]})

(def defines
  {:db/ident      :mls/defines,
   :owl/inverseOf :mls/definedOn,
   :rdf/type      :owl/ObjectProperty})

(def executes
  "A relation between a run and an implemantation that is being executed during the run."
  {:db/ident :mls/executes,
   :dcterms/description
   "A relation between a run and an implemantation that is being executed during the run.",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between a run and an implemantation that is being executed during the run.",
   :rdfs/subPropertyOf [:owl/topObjectProperty :mls/executes]})

(def hasHyperParameter
  "A relation between an implementation of a machine learning algorithm and its hyperparameter."
  {:db/ident :mls/hasHyperParameter,
   :dcterms/description
   "A relation between an implementation of a machine learning algorithm and its hyperparameter.",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between an implementation of a machine learning algorithm and its hyperparameter.",
   :rdfs/label "hasHyperParameter",
   :rdfs/subPropertyOf [:owl/topObjectProperty :mls/hasHyperParameter]})

(def hasInput
  "A relation between a run and data that is taken as input to the run."
  {:db/ident :mls/hasInput,
   :dcterms/description
   "A relation between a run and data that is taken as input to the run.",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between a run and data that is taken as input to the run.",
   :rdfs/label "hasInput",
   :rdfs/subPropertyOf [:owl/topObjectProperty :mls/hasInput]})

(def hasOutput
  "A relation between a run and either a model or model evaluation that is produced on it’s output."
  {:db/ident :mls/hasOutput,
   :dcterms/description
   "A relation between a run and either a model or model evaluation that is produced on it’s output.",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between a run and either a model or model evaluation that is produced on it’s output."})

(def hasPart
  "A relation which represents a part-whole relationship holding between an entity and its part."
  {:db/ident :mls/hasPart,
   :dcterms/description
   "A relation which represents a part-whole relationship holding between an entity and its part.",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation which represents a part-whole relationship holding between an entity and its part.",
   :rdfs/label "hasPart"})

(def hasQuality
  "A relation between entities and their various characteristics."
  {:db/ident :mls/hasQuality,
   :dcterms/description
   "A relation between entities and their various characteristics.",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between entities and their various characteristics."})

(def hasValue
  {:db/ident :mls/hasValue,
   :rdf/type :owl/DatatypeProperty})

(def implements
  "A relation between an information entity and a specification that it conforms to."
  {:db/ident :mls/implements,
   :dcterms/description
   "A relation between an information entity and a specification that it conforms to.",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between an information entity and a specification that it conforms to.",
   :rdfs/label "implements"})

(def realizes
  "A relation between a run and an algorithm, where the run realizes specifications formulated by the algorithm."
  {:db/ident :mls/realizes,
   :dcterms/description
   "A relation between a run and an algorithm, where the run realizes specifications formulated by the algorithm.",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between a run and an algorithm, where the run realizes specifications formulated by the algorithm.",
   :rdfs/subPropertyOf [:owl/topObjectProperty :mls/realizes]})

(def specifiedBy
  "A relation between an entity and the information content entity that specifies it."
  {:db/ident :mls/specifiedBy,
   :dcterms/description
   "A relation between an entity and the information content entity that specifies it.",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between an entity and the information content entity that specifies it."})

(def ^{:private true} note
  {:db/ident :skos/note,
   :rdf/type :owl/AnnotationProperty})