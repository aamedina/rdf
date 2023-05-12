(ns net.wikipunk.rdf.spin
  "An RDF Schema that can be used to attach constraints and rules to RDFS classes, and to encapsulate reusable SPARQL queries into functions and templates."
  {:owl/imports "http://spinrdf.org/sp",
   :owl/versionInfo "1.4",
   :rdf/ns-prefix-map {"arg"  "http://spinrdf.org/arg#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "sp"   "http://spinrdf.org/sp#",
                       "spin" "http://spinrdf.org/spin#",
                       "spl"  "http://spinrdf.org/spl#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "spin",
   :rdfa/uri "http://spinrdf.org/spin",
   :rdfs/comment
   "An RDF Schema that can be used to attach constraints and rules to RDFS classes, and to encapsulate reusable SPARQL queries into functions and templates.",
   :rdfs/label "SPIN Modeling Vocabulary"}
  (:refer-clojure :exclude [eval symbol update]))

(def AskTemplate
  "A SPIN template that wraps an ASK query."
  {:db/ident :spin/AskTemplate,
   :rdf/type :rdfs/Class,
   :rdfs/comment "A SPIN template that wraps an ASK query.",
   :rdfs/label "Ask template",
   :rdfs/subClassOf
   [:spin/Template :spin/AskTemplate :rdfs/Class :rdfs/Resource :spin/Module],
   :spin/command {:rdf/type      [:spl/Attribute :sp/Command :sp/Query],
                  :rdfs/comment  "The ASK query wrapped by this template.",
                  :spl/maxCount  1,
                  :spl/minCount  0,
                  :spl/predicate :spin/body,
                  :spl/valueType :sp/Ask},
   :spin/constraint {:rdf/type      [:spl/Attribute :sp/Command :sp/Query],
                     :rdfs/comment  "The ASK query wrapped by this template.",
                     :spl/maxCount  1,
                     :spl/minCount  0,
                     :spl/predicate :spin/body,
                     :spl/valueType :sp/Ask},
   :spin/query {:rdf/type      [:spl/Attribute :sp/Command :sp/Query],
                :rdfs/comment  "The ASK query wrapped by this template.",
                :spl/maxCount  1,
                :spl/minCount  0,
                :spl/predicate :spin/body,
                :spl/valueType :sp/Ask}})

(def AskTemplates
  "Suggested abstract base class for all AskTemplates."
  {:db/ident :spin/AskTemplates,
   :rdf/type
   [:spin/AskTemplate :spin/Module :rdfs/Class :spin/Template :rdfs/Resource],
   :rdfs/comment "Suggested abstract base class for all AskTemplates.",
   :rdfs/label "Ask templates",
   :rdfs/subClassOf
   [:spin/Templates :spin/AskTemplates :spin/Modules :rdfs/Resource],
   :spin/abstract true,
   :spin/systemProperty true})

(def Column
  "Provides metadata about a column in the result set of a (SPARQL) query, for example of the body queries of SPIN templates. Columns can define human-readable labels that serve as column titles, using rdfs:label."
  {:db/ident :spin/Column,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Provides metadata about a column in the result set of a (SPARQL) query, for example of the body queries of SPIN templates. Columns can define human-readable labels that serve as column titles, using rdfs:label.",
   :rdfs/label "Column",
   :rdfs/subClassOf [:rdfs/Resource :spin/Column]})

(def ConstraintViolation
  "An object that can be created by spin:constraints to provide information about a constraint violation."
  {:db/ident :spin/ConstraintViolation,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An object that can be created by spin:constraints to provide information about a constraint violation.",
   :rdfs/label "Constraint violation",
   :rdfs/subClassOf [:rdfs/Resource :spin/ConstraintViolation]})

(def ConstraintViolationLevel
  "The type of the supported levels of constraint violations, including spin:Error and spin:Warning."
  {:db/ident :spin/ConstraintViolationLevel,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The type of the supported levels of constraint violations, including spin:Error and spin:Warning.",
   :rdfs/label "Constraint violation level",
   :rdfs/subClassOf [:rdfs/Resource :spin/ConstraintViolationLevel]})

(def ConstructTemplate
  "Construct template"
  {:db/ident        :spin/ConstructTemplate,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Construct template",
   :rdfs/subClassOf [:spin/Template
                     :spin/ConstructTemplate
                     :rdfs/Class
                     :rdfs/Resource
                     :spin/Module],
   :spin/command    {:rdf/type [:spl/Attribute :sp/Command :sp/Query],
                     :rdfs/comment
                     "The CONSTRUCT query wrapped by this template.",
                     :spl/maxCount 1,
                     :spl/minCount 0,
                     :spl/predicate :spin/body,
                     :spl/valueType :sp/Construct},
   :spin/constraint {:rdf/type [:spl/Attribute :sp/Command :sp/Query],
                     :rdfs/comment
                     "The CONSTRUCT query wrapped by this template.",
                     :spl/maxCount 1,
                     :spl/minCount 0,
                     :spl/predicate :spin/body,
                     :spl/valueType :sp/Construct},
   :spin/query      {:rdf/type [:spl/Attribute :sp/Command :sp/Query],
                     :rdfs/comment
                     "The CONSTRUCT query wrapped by this template.",
                     :spl/maxCount 1,
                     :spl/minCount 0,
                     :spl/predicate :spin/body,
                     :spl/valueType :sp/Construct}})

(def ConstructTemplates
  "Suggested abstract base class for all ConstructTemplates."
  {:db/ident :spin/ConstructTemplates,
   :rdf/type [:spin/ConstructTemplate
              :spin/Module
              :spin/Template
              :rdfs/Resource
              :rdfs/Class],
   :rdfs/comment "Suggested abstract base class for all ConstructTemplates.",
   :rdfs/label "Construct templates",
   :rdfs/subClassOf
   [:spin/Templates :spin/ConstructTemplates :spin/Modules :rdfs/Resource],
   :spin/abstract true,
   :spin/systemProperty true})

(def ErrorClass
  "Indicates that the associated constraint violation is an error that should be fixed."
  {:db/ident :spin/Error,
   :rdf/type [:spin/ConstraintViolationLevel :rdfs/Resource],
   :rdfs/comment
   "Indicates that the associated constraint violation is an error that should be fixed.",
   :rdfs/label "Error"})

(def Fatal
  "Indicates that the associated constraint violation is a severe error that must be fixed. Constraint checking engines may decide to stop further evaluation once a fatal error has been detected."
  {:db/ident :spin/Fatal,
   :rdf/type [:spin/ConstraintViolationLevel :rdfs/Resource],
   :rdfs/comment
   "Indicates that the associated constraint violation is a severe error that must be fixed. Constraint checking engines may decide to stop further evaluation once a fatal error has been detected.",
   :rdfs/label "Fatal"})

(def Function
  "Metaclass for functions that can be used in SPARQL expressions (e.g. FILTER or BIND). The function themselves are classes that are instances of this metaclass. Function calls are instances of the function classes, with property values for the arguments."
  {:db/ident :spin/Function,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Metaclass for functions that can be used in SPARQL expressions (e.g. FILTER or BIND). The function themselves are classes that are instances of this metaclass. Function calls are instances of the function classes, with property values for the arguments.",
   :rdfs/label "Function",
   :rdfs/subClassOf [:spin/Module :spin/Function :rdfs/Class :rdfs/Resource],
   :spin/command {:rdf/type      [:spl/Attribute :sp/Command :sp/Query],
                  :rdfs/comment  "the body of the function",
                  :spl/maxCount  1,
                  :spl/minCount  0,
                  :spl/predicate :spin/body},
   :spin/constraint {:rdf/type      [:spl/Attribute :sp/Command :sp/Query],
                     :rdfs/comment  "the body of the function",
                     :spl/maxCount  1,
                     :spl/minCount  0,
                     :spl/predicate :spin/body},
   :spin/query {:rdf/type      [:spl/Attribute :sp/Command :sp/Query],
                :rdfs/comment  "the body of the function",
                :spl/maxCount  1,
                :spl/minCount  0,
                :spl/predicate :spin/body}})

(def Functions
  "An abstract base class for all defined functions. This class mainly serves as a shared root so that the various instances of the Function metaclass are grouped together."
  {:db/ident :spin/Functions,
   :rdf/type [:spin/Function :spin/Module :rdfs/Resource :rdfs/Class],
   :rdfs/comment
   "An abstract base class for all defined functions. This class mainly serves as a shared root so that the various instances of the Function metaclass are grouped together.",
   :rdfs/label "Functions",
   :rdfs/subClassOf [:spin/Modules :spin/Functions :rdfs/Resource],
   :spin/abstract true,
   :spin/systemProperty true})

(def Info
  "Indicates that the associated constraint violation is a not a problem. This level can be used for diagnostic and debugging purposes."
  {:db/ident :spin/Info,
   :rdf/type [:spin/ConstraintViolationLevel :rdfs/Resource],
   :rdfs/comment
   "Indicates that the associated constraint violation is a not a problem. This level can be used for diagnostic and debugging purposes.",
   :rdfs/label "Info"})

(def LibraryOntology
  "A marker class that can be attached to base URIs (ontologies) to instruct SPIN engines that this ontology only contains a library of SPIN declarations. Library Ontologies should be ignored by SPIN inference engines even if they have been imported by a domain model. For example, a SPIN version of OWL RL may contain all the OWL RL axioms, attached to owl:Thing, but nothing else. However, when executed, these axioms should not be executed over themselves, because we don't want the system to reason about the SPIN triples to speed up things."
  {:db/ident :spin/LibraryOntology,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A marker class that can be attached to base URIs (ontologies) to instruct SPIN engines that this ontology only contains a library of SPIN declarations. Library Ontologies should be ignored by SPIN inference engines even if they have been imported by a domain model. For example, a SPIN version of OWL RL may contain all the OWL RL axioms, attached to owl:Thing, but nothing else. However, when executed, these axioms should not be executed over themselves, because we don't want the system to reason about the SPIN triples to speed up things.",
   :rdfs/label "Library ontology",
   :rdfs/subClassOf [:rdfs/Resource :owl/Ontology :spin/LibraryOntology]})

(def MagicProperties
  "An abstract superclass that can be used to group all spin:MagicProperty instances under a single parent class."
  {:db/ident :spin/MagicProperties,
   :rdf/type [:spin/MagicProperty
              :spin/Module
              :rdfs/Resource
              :rdf/Property
              :rdfs/Class
              :spin/Function],
   :rdfs/comment
   "An abstract superclass that can be used to group all spin:MagicProperty instances under a single parent class.",
   :rdfs/label "Magic properties",
   :rdfs/subClassOf
   [:spin/Functions :spin/MagicProperties :spin/Modules :rdfs/Resource],
   :rdfs/subPropertyOf [:spin/systemProperty :spin/MagicProperties],
   :spin/abstract true,
   :spin/systemProperty true})

(def MagicProperty
  "Magic property"
  {:db/ident        :spin/MagicProperty,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Magic property",
   :rdfs/subClassOf [:spin/Function
                     :rdf/Property
                     :spin/MagicProperty
                     :rdfs/Class
                     :rdfs/Resource
                     :spin/Module]})

(def Module
  "An abstract building block of a SPARQL system. A Module can take Arguments as input and applies them on an input RDF Graph. The Arguments should be declared as spin:constraints."
  {:db/ident :spin/Module,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An abstract building block of a SPARQL system. A Module can take Arguments as input and applies them on an input RDF Graph. The Arguments should be declared as spin:constraints.",
   :rdfs/label "Module",
   :rdfs/subClassOf [:rdfs/Resource :rdfs/Class :spin/Module]})

(def Modules
  "An \"artificial\" parent class for all Functions and Templates."
  {:db/ident :spin/Modules,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An \"artificial\" parent class for all Functions and Templates.",
   :rdfs/label "Modules",
   :rdfs/subClassOf [:rdfs/Resource :spin/Modules],
   :spin/command {:rdf/type [:spl/ConstructDefaultValues
                             :spin/Rule
                             :sp/Command
                             :rdfs/Resource]},
   :spin/constructor {:rdf/type [:spl/ConstructDefaultValues
                                 :spin/Rule
                                 :sp/Command
                                 :rdfs/Resource]}})

(def Rule
  "Groups together the kinds of SPARQL commands that can appear as SPIN rules and constructors: CONSTRUCT, DELETE WHERE and DELETE/INSERT. This class is never to be instantiated directly."
  {:db/ident :spin/Rule,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Groups together the kinds of SPARQL commands that can appear as SPIN rules and constructors: CONSTRUCT, DELETE WHERE and DELETE/INSERT. This class is never to be instantiated directly.",
   :rdfs/label "Rule",
   :rdfs/subClassOf [:rdfs/Resource :sp/Command :spin/Rule]})

(def RuleProperty
  "The metaclass of spin:rule and its subproperties. spin:RuleProperties can have additional metadata attached to them."
  {:db/ident :spin/RuleProperty,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The metaclass of spin:rule and its subproperties. spin:RuleProperties can have additional metadata attached to them.",
   :rdfs/label "Rule property",
   :rdfs/subClassOf [:rdfs/Resource :rdf/Property :spin/RuleProperty]})

(def SelectTemplate
  "A SPIN template that wraps a SELECT query."
  {:db/ident        :spin/SelectTemplate,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A SPIN template that wraps a SELECT query.",
   :rdfs/label      "Select template",
   :rdfs/subClassOf [:spin/TableDataProvider
                     :spin/Template
                     :spin/SelectTemplate
                     :rdfs/Class
                     :rdfs/Resource
                     :spin/Module],
   :spin/command    {:rdf/type [:spl/Attribute :sp/Command :sp/Query],
                     :rdfs/comment "The SELECT query wrapped by this template.",
                     :spl/maxCount 1,
                     :spl/minCount 0,
                     :spl/predicate :spin/body,
                     :spl/valueType :sp/Select},
   :spin/constraint {:rdf/type [:spl/Attribute :sp/Command :sp/Query],
                     :rdfs/comment "The SELECT query wrapped by this template.",
                     :spl/maxCount 1,
                     :spl/minCount 0,
                     :spl/predicate :spin/body,
                     :spl/valueType :sp/Select},
   :spin/query      {:rdf/type [:spl/Attribute :sp/Command :sp/Query],
                     :rdfs/comment "The SELECT query wrapped by this template.",
                     :spl/maxCount 1,
                     :spl/minCount 0,
                     :spl/predicate :spin/body,
                     :spl/valueType :sp/Select}})

(def SelectTemplates
  "Suggested abstract base class for all SelectTemplates."
  {:db/ident :spin/SelectTemplates,
   :rdf/type [:spin/SelectTemplate
              :spin/Module
              :rdfs/Resource
              :spin/Template
              :rdfs/Class
              :spin/TableDataProvider],
   :rdfs/comment "Suggested abstract base class for all SelectTemplates.",
   :rdfs/label "Select templates",
   :rdfs/subClassOf
   [:spin/Templates :spin/SelectTemplates :spin/Modules :rdfs/Resource],
   :spin/abstract true,
   :spin/systemProperty true})

(def TableDataProvider
  "An abstraction of objects that can produce tabular data. This serves as a base class of spin:SelectTemplate, because SELECT queries can produce tables with columns for each result variable. However, other types of TableDataProviders are conceivable by other frameworks, and this class may prove as a useful shared foundation. TableDataProviders can link to definitions of columns via spin:column, and these definitions can inform rendering engines."
  {:db/ident :spin/TableDataProvider,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An abstraction of objects that can produce tabular data. This serves as a base class of spin:SelectTemplate, because SELECT queries can produce tables with columns for each result variable. However, other types of TableDataProviders are conceivable by other frameworks, and this class may prove as a useful shared foundation.\n\nTableDataProviders can link to definitions of columns via spin:column, and these definitions can inform rendering engines.",
   :rdfs/label "Table data provider",
   :rdfs/subClassOf [:rdfs/Resource :rdfs/Class :spin/TableDataProvider]})

(def Template
  "The metaclass of SPIN templates. Templates are classes that are instances of this class. A template represents a reusable SPARQL query or update request that can be parameterized with arguments. Templates can be instantiated in places where normally a SPARQL query or update request is used, in particular as spin:rules and spin:constraints."
  {:db/ident :spin/Template,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The metaclass of SPIN templates. Templates are classes that are instances of this class. A template represents a reusable SPARQL query or update request that can be parameterized with arguments. Templates can be instantiated in places where normally a SPARQL query or update request is used, in particular as spin:rules and spin:constraints.",
   :rdfs/label "Template",
   :rdfs/subClassOf [:spin/Module :spin/Template :rdfs/Class :rdfs/Resource],
   :spin/command {:rdf/type      [:spl/Attribute :sp/Command :sp/Query],
                  :rdfs/comment  "the body of the Template",
                  :spl/maxCount  1,
                  :spl/minCount  0,
                  :spl/predicate :spin/body},
   :spin/constraint {:rdf/type      [:spl/Attribute :sp/Command :sp/Query],
                     :rdfs/comment  "the body of the Template",
                     :spl/maxCount  1,
                     :spl/minCount  0,
                     :spl/predicate :spin/body},
   :spin/query {:rdf/type      [:spl/Attribute :sp/Command :sp/Query],
                :rdfs/comment  "the body of the Template",
                :spl/maxCount  1,
                :spl/minCount  0,
                :spl/predicate :spin/body}})

(def Templates
  "Suggested abstract base class for all Templates."
  {:db/ident            :spin/Templates,
   :rdf/type            [:spin/Template
                         :spin/Module
                         :rdfs/Class
                         :rdfs/Resource],
   :rdfs/comment        "Suggested abstract base class for all Templates.",
   :rdfs/label          "Templates",
   :rdfs/subClassOf     [:spin/Modules :spin/Templates :rdfs/Resource],
   :spin/abstract       true,
   :spin/systemProperty true})

(def UpdateTemplate
  "A SPIN template that has an UPDATE command as its body."
  {:db/ident        :spin/UpdateTemplate,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A SPIN template that has an UPDATE command as its body.",
   :rdfs/label      "Update template",
   :rdfs/subClassOf [:spin/Template
                     :spin/UpdateTemplate
                     :rdfs/Class
                     :rdfs/Resource
                     :spin/Module],
   :spin/command    {:rdf/type [:spl/Attribute :sp/Command :sp/Query],
                     :rdfs/comment
                     "The UPDATE command wrapped by this template.",
                     :spl/maxCount 1,
                     :spl/minCount 0,
                     :spl/predicate :spin/body,
                     :spl/valueType :sp/Update},
   :spin/constraint {:rdf/type [:spl/Attribute :sp/Command :sp/Query],
                     :rdfs/comment
                     "The UPDATE command wrapped by this template.",
                     :spl/maxCount 1,
                     :spl/minCount 0,
                     :spl/predicate :spin/body,
                     :spl/valueType :sp/Update},
   :spin/query      {:rdf/type [:spl/Attribute :sp/Command :sp/Query],
                     :rdfs/comment
                     "The UPDATE command wrapped by this template.",
                     :spl/maxCount 1,
                     :spl/minCount 0,
                     :spl/predicate :spin/body,
                     :spl/valueType :sp/Update}})

(def UpdateTemplates
  "Suggested abstract base class for all UpdateTemplates."
  {:db/ident :spin/UpdateTemplates,
   :rdf/type [:spin/UpdateTemplate
              :spin/Module
              :spin/Template
              :rdfs/Resource
              :rdfs/Class],
   :rdfs/comment "Suggested abstract base class for all UpdateTemplates.",
   :rdfs/label "Update templates",
   :rdfs/subClassOf
   [:spin/Templates :spin/UpdateTemplates :spin/Modules :rdfs/Resource],
   :spin/abstract true,
   :spin/systemProperty true})

(def Warning
  "Indicates that the associated constraint violation is a problem that may not have to be fixed but may lead to issues in the future."
  {:db/ident :spin/Warning,
   :rdf/type [:spin/ConstraintViolationLevel :rdfs/Resource],
   :rdfs/comment
   "Indicates that the associated constraint violation is a problem that may not have to be fixed but may lead to issues in the future.",
   :rdfs/label "Warning"})

(def _arg1
  {:db/ident   :spin/_arg1,
   :rdf/type   :sp/Variable,
   :sp/varName "arg1"})

(def _arg2
  {:db/ident   :spin/_arg2,
   :rdf/type   :sp/Variable,
   :sp/varName "arg2"})

(def _arg3
  {:db/ident   :spin/_arg3,
   :rdf/type   :sp/Variable,
   :sp/varName "arg3"})

(def _arg4
  {:db/ident   :spin/_arg4,
   :rdf/type   :sp/Variable,
   :sp/varName "arg4"})

(def _arg5
  {:db/ident   :spin/_arg5,
   :rdf/type   :sp/Variable,
   :sp/varName "arg5"})

(def _this
  "A system variable representing the current context instance in a rule or constraint."
  {:db/ident :spin/_this,
   :rdf/type :sp/Variable,
   :rdfs/comment
   "A system variable representing the current context instance in a rule or constraint.",
   :rdfs/label "_this",
   :sp/varName "this"})

(def abstract
  "Can be set to true to indicate that this module shall not be instantiated. Abstract modules are only there to organize other modules into hierarchies."
  {:db/ident :spin/abstract,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Can be set to true to indicate that this module shall not be instantiated. Abstract modules are only there to organize other modules into hierarchies.",
   :rdfs/domain :spin/Module,
   :rdfs/label "abstract",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf [:spin/systemProperty :spin/abstract]})

(def ask
  "Executes a given ASK query and returns its boolean result. The first argument must point to an sp:Ask or a SPIN template call that has an ASK query as its body. All subsequent argument can come in pairs, with the first one being a variable name and the second its binding. Example: BIND (spin:ask(?query, \"this\", owl:Thing) AS ?result) . will execute the sp:Ask behind ?query with the variable ?this pre-bound to owl:Thing."
  {:db/ident :spin/ask,
   :rdf/type [:spin/Function :rdfs/Resource :spin/Module :rdfs/Class],
   :rdfs/comment
   "Executes a given ASK query and returns its boolean result. The first argument must point to an sp:Ask or a SPIN template call that has an ASK query as its body. All subsequent argument can come in pairs, with the first one being a variable name and the second its binding.\n\nExample:\n\n    BIND (spin:ask(?query, \"this\", owl:Thing) AS ?result) .\n\nwill execute the sp:Ask behind ?query with the variable ?this pre-bound to owl:Thing.",
   :rdfs/label "ask",
   :rdfs/subClassOf [:spin/Functions :spin/ask :spin/Modules :rdfs/Resource]})

(def body
  "The body of a Function or Template. This points to a Query instance. For Functions, this is limited to either ASK or SELECT type queries. If the body is the ASK function then the return value is xsd:boolean. Otherwise, the SELECT query must have a single return variable. The first binding of this SELECT query will be returned as result of the function call."
  {:db/ident :spin/body,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The body of a Function or Template. This points to a Query instance. For Functions, this is limited to either ASK or SELECT type queries. If the body is the ASK function then the return value is xsd:boolean. Otherwise, the SELECT query must have a single return variable. The first binding of this SELECT query will be returned as result of the function call.",
   :rdfs/label "body",
   :rdfs/range :sp/Command,
   :rdfs/subPropertyOf [:spin/systemProperty :spin/body]})

(def cachable
  "Can be set to true to instruct the SPIN engine that it may cache the results of all calls to the associated function. Functions should only be marked as cachable if the same combination of input arguments always returns the same result. Functions that query a graph or other background data that may change over time should not be cached. Caching can significantly improve performance of frequently needed functions."
  {:db/ident :spin/cachable,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Can be set to true to instruct the SPIN engine that it may cache the results of all calls to the associated function. Functions should only be marked as cachable if the same combination of input arguments always returns the same result. Functions that query a graph or other background data that may change over time should not be cached. Caching can significantly improve performance of frequently needed functions.",
   :rdfs/domain :spin/Function,
   :rdfs/label "cachable",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf [:spin/systemProperty :spin/cachable]})

(def cachableForOntologies
  "Can be set to true to instruct the SPIN engine that the outcome of the function does not depend on any instances/indivuduals in the current query graph, but only on the definitions of classes, properties and shapes. Engines may cache the results of all calls to the associated function. Functions should only be marked as cachable if the same combination of input arguments always returns the same result."
  {:db/ident :spin/cachableForOntologies,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Can be set to true to instruct the SPIN engine that the outcome of the function does not depend on any instances/indivuduals in the current query graph, but only on the definitions of classes, properties and shapes. Engines may cache the results of all calls to the associated function. Functions should only be marked as cachable if the same combination of input arguments always returns the same result.",
   :rdfs/domain :spin/Function,
   :rdfs/label "cachable for ontologies",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf [:spin/systemProperty :spin/cachableForOntologies]})

(def column
  "Can link a TableDataProvider (esp. SelectTemplate) with one or more columns that provide metadata for rendering purposes. Columns can be sorted by their spin:columnIndex (which must align with the ordering of variables in the SELECT query starting with 0). Not all result variables of the underlying query need to have a matching spin:Column."
  {:db/ident :spin/column,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Can link a TableDataProvider (esp. SelectTemplate) with one or more columns that provide metadata for rendering purposes. Columns can be sorted by their spin:columnIndex (which must align with the ordering of variables in the SELECT query starting with 0). Not all result variables of the underlying query need to have a matching spin:Column.",
   :rdfs/domain :spin/TableDataProvider,
   :rdfs/label "column",
   :rdfs/range :spin/Column,
   :rdfs/subPropertyOf [:spin/systemProperty :spin/column]})

(def columnIndex
  "The index of a column (from left to right) starting at 0."
  {:db/ident :spin/columnIndex,
   :rdf/type :rdf/Property,
   :rdfs/comment "The index of a column (from left to right) starting at 0.",
   :rdfs/domain :spin/Column,
   :rdfs/label "column index",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf [:spin/systemProperty :spin/columnIndex]})

(def columnType
  "The datatype or resource type of a spin:Column. For example this is useful as metadata to inform a rendering engine that numeric columns (e.g. xsd:float) need to be right-aligned."
  {:db/ident :spin/columnType,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The datatype or resource type of a spin:Column. For example this is useful as metadata to inform a rendering engine that numeric columns (e.g. xsd:float) need to be right-aligned.",
   :rdfs/domain :spin/Column,
   :rdfs/label "column type",
   :rdfs/range :rdfs/Class,
   :rdfs/subPropertyOf [:spin/systemProperty :spin/columnType]})

(def columnWidth
  "The preferred width of the associated Column, for display purposes. Values in pixels (rendering engines may multiply the values depending on resolution)."
  {:db/ident :spin/columnWidth,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The preferred width of the associated Column, for display purposes. Values in pixels (rendering engines may multiply the values depending on resolution).",
   :rdfs/domain :spin/Column,
   :rdfs/label "column width",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf [:spin/systemProperty :spin/columnWidth]})

(def command
  "Can be used to link a resource with a SPARQL query or update request (sp:Command)."
  {:db/ident :spin/command,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Can be used to link a resource with a SPARQL query or update request (sp:Command).",
   :rdfs/label "command",
   :rdfs/range :sp/Command,
   :rdfs/subPropertyOf :spin/command})

(def constraint
  "Links a class with constraints on its instances. The values of this property are \"axioms\" expressed as CONSTRUCT or ASK queries where the variable ?this refers to the instances of the surrounding class. ASK queries must evaluate to false for each member of this class - returning true means that the instance ?this violates the constraint. CONSTRUCT queries must create instances of spin:ConstraintViolation to provide details on the reason for the violation."
  {:db/ident :spin/constraint,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Links a class with constraints on its instances. The values of this property are \"axioms\" expressed as CONSTRUCT or ASK queries where the variable ?this refers to the instances of the surrounding class. ASK queries must evaluate to false for each member of this class - returning true means that the instance ?this violates the constraint. CONSTRUCT queries must create instances of spin:ConstraintViolation to provide details on the reason for the violation.",
   :rdfs/domain :rdfs/Class,
   :rdfs/label "constraint",
   :rdfs/subPropertyOf [:spin/query :spin/constraint :spin/command]})

(def construct
  "Evaluates a given sp:Construct or SPIN template call (first argument on the left hand side) and binds the resulting triples to the variables on the right hand side. Example: (?query \"this\" owl:Thing) spin:construct (?s ?p ?o) will execute the sp:Construct ?query using the binding of owl:Thing to ?this. The resulting triples will be bound to ?s, ?p and ?o. If any of ?s ?p ?o are bound, it will only return the matching triples."
  {:db/ident :spin/construct,
   :rdf/type [:spin/MagicProperty
              :rdfs/Resource
              :rdf/Property
              :rdfs/Class
              :spin/Function
              :spin/Module],
   :rdfs/comment
   "Evaluates a given sp:Construct or SPIN template call (first argument on the left hand side) and binds the resulting triples to the variables on the right hand side.\n\nExample:\n\n    (?query \"this\" owl:Thing) spin:construct (?s ?p ?o)\n\nwill execute the sp:Construct ?query using the binding of owl:Thing to ?this. The resulting triples will be bound to ?s, ?p and ?o. If any of ?s ?p ?o are bound, it will only return the matching triples.",
   :rdfs/label "construct",
   :rdfs/subClassOf [:spin/MagicProperties
                     :spin/construct
                     :spin/Modules
                     :rdfs/Resource
                     :spin/Functions]})

(def constructViolations
  "Takes an instance (?arg1) and a class definition (?arg2) and returns all constraint violations for that instance as triples. This magic property basically runs its own constraint checker for defining meta-constraints, and can also be used to classify instances. Example: CONSTRUCT { ?s ?p ?o . } WHERE { (my:Person my:OldPerson) spin:constructViolations (?s ?p ?o) . }"
  {:db/ident :spin/constructViolations,
   :rdf/type [:spin/MagicProperty
              :rdfs/Class
              :rdfs/Resource
              :rdf/Property
              :spin/Function
              :spin/Module],
   :rdfs/comment
   "Takes an instance (?arg1) and a class definition (?arg2) and returns all constraint violations for that instance as triples. This magic property basically runs its own constraint checker for defining meta-constraints, and can also be used to classify instances.\n\nExample:\n\n    CONSTRUCT {\n        ?s ?p ?o .\n    }\n    WHERE {\n        (my:Person my:OldPerson) spin:constructViolations (?s ?p ?o) .\n    }",
   :rdfs/label "construct violations",
   :rdfs/subClassOf [:spin/MagicProperties
                     :spin/constructViolations
                     :spin/Modules
                     :rdfs/Resource
                     :spin/Functions],
   :spin/command [{:rdf/type      [:spl/Argument :sp/Command :sp/Query],
                   :rdfs/comment  "The instance to check.",
                   :spl/predicate :sp/arg1,
                   :spl/valueType :rdfs/Resource}
                  {:rdf/type [:spl/Argument :sp/Command :sp/Query],
                   :rdfs/comment
                   "The class that this type is validated against.",
                   :spl/predicate :sp/arg2,
                   :spl/valueType :rdfs/Class}],
   :spin/constraint [{:rdf/type      [:spl/Argument :sp/Command :sp/Query],
                      :rdfs/comment  "The instance to check.",
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdfs/Resource}
                     {:rdf/type [:spl/Argument :sp/Command :sp/Query],
                      :rdfs/comment
                      "The class that this type is validated against.",
                      :spl/predicate :sp/arg2,
                      :spl/valueType :rdfs/Class}],
   :spin/query [{:rdf/type      [:spl/Argument :sp/Command :sp/Query],
                 :rdfs/comment  "The instance to check.",
                 :spl/predicate :sp/arg1,
                 :spl/valueType :rdfs/Resource}
                {:rdf/type [:spl/Argument :sp/Command :sp/Query],
                 :rdfs/comment "The class that this type is validated against.",
                 :spl/predicate :sp/arg2,
                 :spl/valueType :rdfs/Class}]})

(def constructor
  "Can be used to attach a \"constructor\" to a class. A constructor is a SPARQL CONSTRUCT query or INSERT/DELETE Update operation that can add initial values to the current instance. At execution time, the variable ?this is bound to the current instance. Tools can call constructors of a class and its superclasses when an instance of a class has been created. Constructors will also be used to initialize resources that have received a new rdf:type triple as a result of spin:rules firing."
  {:db/ident :spin/constructor,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Can be used to attach a \"constructor\" to a class. A constructor is a SPARQL CONSTRUCT query or INSERT/DELETE Update operation that can add initial values to the current instance. At execution time, the variable ?this is bound to the current instance. Tools can call constructors of a class and its superclasses when an instance of a class has been created. Constructors will also be used to initialize resources that have received a new rdf:type triple as a result of spin:rules firing.",
   :rdfs/domain :rdfs/Class,
   :rdfs/label "constructor",
   :rdfs/range :spin/Rule,
   :rdfs/subPropertyOf [:spin/command :spin/constructor]})

(def eval
  "Evaluates a given SPIN expression or SELECT or ASK query, and returns its result. The first argument must be the expression in SPIN RDF syntax. All other arguments must come in pairs: first a property name, and then a value. These name/value pairs will be pre-bound variables for the execution of the expression."
  {:db/ident :spin/eval,
   :rdf/type [:spin/Function :rdfs/Resource :spin/Module :rdfs/Class],
   :rdfs/comment
   "Evaluates a given SPIN expression or SELECT or ASK query, and returns its result. The first argument must be the expression in SPIN RDF syntax. All other arguments must come in pairs: first a property name, and then a value. These name/value pairs will be pre-bound variables for the execution of the expression.",
   :rdfs/label "eval",
   :rdfs/subClassOf [:spin/Functions :spin/eval :spin/Modules :rdfs/Resource]})

(def evalInGraph
  "Evaluates a given SPIN expression or SELECT or ASK query, and returns its result. The first argument must be the expression in SPIN RDF syntax. This RDF representation of this expression is expected to be in the currently active query graph. The second argument is the URI of a graph that the actual query shall be evaluated against. All other arguments must come in pairs: first a property name, and then a value. These name/value pairs will be pre-bound variables for the execution of the expression."
  {:db/ident :spin/evalInGraph,
   :rdf/type [:spin/Function :rdfs/Resource :spin/Module :rdfs/Class],
   :rdfs/comment
   "Evaluates a given SPIN expression or SELECT or ASK query, and returns its result. The first argument must be the expression in SPIN RDF syntax. This RDF representation of this expression is expected to be in the currently active query graph. The second argument is the URI of a graph that the actual query shall be evaluated against. All other arguments must come in pairs: first a property name, and then a value. These name/value pairs will be pre-bound variables for the execution of the expression.",
   :rdfs/label "eval in graph",
   :rdfs/subClassOf
   [:spin/Functions :spin/evalInGraph :spin/Modules :rdfs/Resource]})

(def fix
  "Can be used to link a ConstraintViolation with one or more UPDATE Templates that would help fix the violation."
  {:db/ident :spin/fix,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Can be used to link a ConstraintViolation with one or more UPDATE Templates that would help fix the violation.",
   :rdfs/domain :spin/ConstraintViolation,
   :rdfs/label "fix",
   :rdfs/range :spin/UpdateTemplate,
   :rdfs/subPropertyOf [:spin/systemProperty :spin/fix]})

(def imports
  "Can be used to link an RDF graph (usually the instance of owl:Ontology) with a SPIN library to define constraints. SPIN-aware tools should include the definitions from those libraries for constraint checking. Using such libraries is a simpler alternative than explicitly importing them using owl:imports, because it does not force all the SPIN triples into the RDF model."
  {:db/ident :spin/imports,
   :rdf/type :owl/OntologyProperty,
   :rdfs/comment
   "Can be used to link an RDF graph (usually the instance of owl:Ontology) with a SPIN library to define constraints. SPIN-aware tools should include the definitions from those libraries for constraint checking. Using such libraries is a simpler alternative than explicitly importing them using owl:imports, because it does not force all the SPIN triples into the RDF model.",
   :rdfs/domain :owl/Ontology,
   :rdfs/label "imports",
   :rdfs/range :owl/Ontology,
   :rdfs/subPropertyOf [:spin/systemProperty :spin/imports]})

(def inverseBody
  "The inverse body of a magic property - used to provide a more optimized query if there is one result variable (on the right). The values must be instances of Select and must return SELECT ?arg1 etc. The WHERE clause can access the variable ?object to refer to the provided value on the right hand side of the magic property."
  {:db/ident :spin/inverseBody,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The inverse body of a magic property - used to provide a more optimized query if there is one result variable (on the right). The values must be instances of Select and must return SELECT ?arg1 etc. The WHERE clause can access the variable ?object to refer to the provided value on the right hand side of the magic property.",
   :rdfs/domain :spin/MagicProperty,
   :rdfs/label "inverse body",
   :rdfs/range :sp/Select,
   :rdfs/subPropertyOf [:spin/systemProperty :spin/inverseBody]})

(def labelTemplate
  "A template string for displaying instantiations of a module in human-readable form. The template may contain the argument variable names in curly braces to support substitution. For example, \"The number of values of the {?arg1} property.\""
  {:db/ident :spin/labelTemplate,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A template string for displaying instantiations of a module in human-readable form. The template may contain the argument variable names in curly braces to support substitution. For example, \"The number of values of the {?arg1} property.\"",
   :rdfs/domain :spin/Template,
   :rdfs/label "label template",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf [:spin/systemProperty :spin/labelTemplate]})

(def nextRuleProperty
  "Can be used to link two sub-properties of spin:rule (or spin:rule itself) to instruct the SPIN engine to execute one set of rules before another one. The values of the subject property will be executed before those of the object property."
  {:db/ident :spin/nextRuleProperty,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Can be used to link two sub-properties of spin:rule (or spin:rule itself) to instruct the SPIN engine to execute one set of rules before another one. The values of the subject property will be executed before those of the object property.",
   :rdfs/domain :spin/RuleProperty,
   :rdfs/label "next rule property",
   :rdfs/range :spin/RuleProperty,
   :rdfs/subPropertyOf [:spin/systemProperty :spin/nextRuleProperty]})

(def private
  "Can be set to true to indicate that a SPIN function or template is only meant to be used as a helper of other modules, but not directly. Among others, this allows user interfaces to filter out private modules. Furthermore, it tells potential users of this module that they should avoid using this module, as it may not be stable."
  {:db/ident :spin/private,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Can be set to true to indicate that a SPIN function or template is only meant to be used as a helper of other modules, but not directly. Among others, this allows user interfaces to filter out private modules. Furthermore, it tells potential users of this module that they should avoid using this module, as it may not be stable.",
   :rdfs/domain :spin/Module,
   :rdfs/label "private",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf [:spin/systemProperty :spin/private]})

(def query
  "Can be used to point from any resource to a Query."
  {:db/ident           :spin/query,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Can be used to point from any resource to a Query.",
   :rdfs/label         "query",
   :rdfs/range         :sp/Query,
   :rdfs/subPropertyOf [:spin/command :spin/query]})

(def returnType
  "The return type of a Function, e.g. xsd:string."
  {:db/ident           :spin/returnType,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The return type of a Function, e.g. xsd:string.",
   :rdfs/domain        :spin/Function,
   :rdfs/label         "return type",
   :rdfs/range         :rdfs/Class,
   :rdfs/subPropertyOf [:spin/systemProperty :spin/returnType]})

(def rule
  "An inferencing rule attached to a class. Rules are expressed as CONSTRUCT queries or INSERT/DELETE operations where the variable ?this will be bound to the current instance of the class. These inferences can be used to derive new values from existing values at the instance."
  {:db/ident :spin/rule,
   :rdf/type [:spin/RuleProperty :rdfs/Resource :rdf/Property],
   :rdfs/comment
   "An inferencing rule attached to a class. Rules are expressed as CONSTRUCT queries or INSERT/DELETE operations where the variable ?this will be bound to the current instance of the class. These inferences can be used to derive new values from existing values at the instance.",
   :rdfs/domain :rdfs/Class,
   :rdfs/label "rule",
   :rdfs/range :spin/Rule,
   :rdfs/subPropertyOf [:spin/command :spin/rule]})

(def rulePropertyMaxIterationCount
  "Can be attached to spin:rule (or subclasses thereof) to instruct a SPIN rules engine that it shall only execute the rules max times. If no value is specified, then the rules will be executed with no specific limit."
  {:db/ident :spin/rulePropertyMaxIterationCount,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Can be attached to spin:rule (or subclasses thereof) to instruct a SPIN rules engine that it shall only execute the rules max times. If no value is specified, then the rules will be executed with no specific limit.",
   :rdfs/domain :spin/RuleProperty,
   :rdfs/label "rule property max iteration count",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf [:spin/systemProperty
                        :spin/rulePropertyMaxIterationCount]})

(def select
  "Executes a given SELECT or ASK query (or a corresponding SPIN template call) and binds its result rows to the variables specified on the right hand side. May also pre-bind variables for the query execution, using name-value pairs on the left hand side. Example: (?query \"this\" owl:Thing) spin:select (?a ?b) will execute the sp:Select or sp:Ask that ?query points to and pre-bind ?this with the value of owl:Thing for the execution of the query. The first result variable of the query's result set will be bound to ?a, the second to ?b etc. If the nodes on the right are bound (or constants) then it will match with the values from the result set. Note that the first argument on the left hand side can be an instance of a SPIN template (but not the template itself). If you need to execute a template, retrieve its spin:body first."
  {:db/ident :spin/select,
   :rdf/type [:spin/MagicProperty
              :rdfs/Resource
              :rdf/Property
              :rdfs/Class
              :spin/Function
              :spin/Module],
   :rdfs/comment
   "Executes a given SELECT or ASK query (or a corresponding SPIN template call) and binds its result rows to the variables specified on the right hand side. May also pre-bind variables for the query execution, using name-value pairs on the left hand side.\n\nExample:\n\n    (?query \"this\" owl:Thing) spin:select (?a ?b)\n\nwill execute the sp:Select or sp:Ask that ?query points to and pre-bind ?this with the value of owl:Thing for the execution of the query. The first result variable of the query's result set will be bound to ?a, the second to ?b etc. If the nodes on the right are bound (or constants) then it will match with the values from the result set.\n\nNote that the first argument on the left hand side can be an instance of a SPIN template (but not the template itself). If you need to execute a template, retrieve its spin:body first.",
   :rdfs/label "select",
   :rdfs/subClassOf [:spin/MagicProperties
                     :spin/select
                     :spin/Modules
                     :rdfs/Resource
                     :spin/Functions]})

(def symbol
  "The symbol of a function, e.g. \"=\" for the eq function."
  {:db/ident :spin/symbol,
   :rdf/type :rdf/Property,
   :rdfs/comment "The symbol of a function, e.g. \"=\" for the eq function.",
   :rdfs/domain :spin/Function,
   :rdfs/label "symbol",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf [:spin/systemProperty :spin/symbol]})

(def systemProperty
  "An \"abstract\" base property that groups together those system properties that the user will hardly ever need to see in property trees. This property may be dropped in future versions of this ontology - right now it's mainly here for convenience."
  {:db/ident :spin/systemProperty,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An \"abstract\" base property that groups together those system properties that the user will hardly ever need to see in property trees. This property may be dropped in future versions of this ontology - right now it's mainly here for convenience.",
   :rdfs/label "system property",
   :rdfs/subPropertyOf :spin/systemProperty})

(def thisUnbound
  "Can be set to true for SPIN rules and constraints that do not require pre-binding the variable ?this with all members of the associated class. This flag should only be set to true if the WHERE clause is sufficiently strong to only bind instances of the associated class, or its subclasses. In those cases, the engine can greatly improve performance of query execution, because it does not need to add clauses to narrow down the WHERE clause."
  {:db/ident :spin/thisUnbound,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Can be set to true for SPIN rules and constraints that do not require pre-binding the variable ?this with all members of the associated class. This flag should only be set to true if the WHERE clause is sufficiently strong to only bind instances of the associated class, or its subclasses. In those cases, the engine can greatly improve performance of query execution, because it does not need to add clauses to narrow down the WHERE clause.",
   :rdfs/domain :sp/Construct,
   :rdfs/label "this unbound",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf [:spin/systemProperty :spin/thisUnbound]})

(def update
  "Can be used to point from any resource to an Update."
  {:db/ident           :spin/update,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Can be used to point from any resource to an Update.",
   :rdfs/label         "update",
   :rdfs/range         :sp/Update,
   :rdfs/subPropertyOf [:spin/command :spin/update]})

(def violatesConstraints
  "Checks whether a given instance (?arg1) violates any of the constraints defined for a given class (?arg2)."
  {:db/ident :spin/violatesConstraints,
   :rdf/type [:spin/Function :rdfs/Resource :spin/Module :rdfs/Class],
   :rdfs/comment
   "Checks whether a given instance (?arg1) violates any of the constraints defined for a given class (?arg2).",
   :rdfs/label "violates constraints",
   :rdfs/subClassOf
   [:spin/Functions :spin/violatesConstraints :spin/Modules :rdfs/Resource],
   :spin/returnType :xsd/boolean,
   :spin/systemProperty :xsd/boolean})

(def violationDetail
  "Links a (parent) spin:ConstraintViolation with one or more (child) spin:ConstraintViolations that provide details on the parent violation. This is commonly used in conjunction with spin:constructViolations to indicate that certain violations have triggered the parent violation."
  {:db/ident :spin/violationDetail,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Links a (parent) spin:ConstraintViolation with one or more (child) spin:ConstraintViolations that provide details on the parent violation. This is commonly used in conjunction with spin:constructViolations to indicate that certain violations have triggered the parent violation.",
   :rdfs/domain :spin/ConstraintViolation,
   :rdfs/label "violation detail",
   :rdfs/range :spin/ConstraintViolation,
   :rdfs/subPropertyOf [:spin/systemProperty :spin/violationDetail]})

(def violationLevel
  "An optional attribute of ConstraintViolations to point at a violation level (such as Error and Warning). Defaults to spin:Error."
  {:db/ident :spin/violationLevel,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An optional attribute of ConstraintViolations to point at a violation level (such as Error and Warning). Defaults to spin:Error.",
   :rdfs/domain :spin/ConstraintViolation,
   :rdfs/label "violation level",
   :rdfs/range :spin/ConstraintViolationLevel,
   :rdfs/subPropertyOf [:spin/systemProperty :spin/violationLevel]})

(def violationPath
  "An optional attribute of ConstraintViolations to provide a path expression from the root resource to the value that is invalid. If this is a URI then the path represents the predicate of a subject/predicate combination. Otherwise it should be a blank node of type sp:Path."
  {:db/ident :spin/violationPath,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An optional attribute of ConstraintViolations to provide a path expression from the root resource to the value that is invalid. If this is a URI then the path represents the predicate of a subject/predicate combination. Otherwise it should be a blank node of type sp:Path.",
   :rdfs/domain :spin/ConstraintViolation,
   :rdfs/label "violation path",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf [:spin/systemProperty :spin/violationPath]})

(def violationRoot
  "The root resource of the violation (often ?this in the constraint body)."
  {:db/ident :spin/violationRoot,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The root resource of the violation (often ?this in the constraint body).",
   :rdfs/domain :spin/ConstraintViolation,
   :rdfs/label "violation root",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf [:spin/systemProperty :spin/violationRoot]})

(def violationSource
  "Can be used to link a spin:ConstraintViolation with the query or template call that caused it. This property is typically filled in automatically by the constraint checking engine and does not need to be set manually. However, it can be useful to learn more about the origin of a violation."
  {:db/ident :spin/violationSource,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Can be used to link a spin:ConstraintViolation with the query or template call that caused it. This property is typically filled in automatically by the constraint checking engine and does not need to be set manually. However, it can be useful to learn more about the origin of a violation.",
   :rdfs/domain :spin/ConstraintViolation,
   :rdfs/label "violation source",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf [:spin/systemProperty :spin/violationSource]})

(def violationValue
  "An optional attribute of ConstraintViolations to point at a specific RDF node that caused the violation. Should be accessible from the root via the violationPath."
  {:db/ident :spin/violationValue,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An optional attribute of ConstraintViolations to point at a specific RDF node that caused the violation. Should be accessible from the root via the violationPath.",
   :rdfs/domain :spin/ConstraintViolation,
   :rdfs/label "violation value",
   :rdfs/subPropertyOf [:spin/systemProperty :spin/violationValue]})

(def ^{:private true} Command
  {:db/ident        :sp/Command,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :sp/Command})

(def ^{:private true} Construct
  {:db/ident        :sp/Construct,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf [:spin/Rule :sp/Construct :rdfs/Resource :sp/Command]})

(def ^{:private true} DeleteWhere
  {:db/ident        :sp/DeleteWhere,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf [:spin/Rule :sp/DeleteWhere :rdfs/Resource :sp/Command]})

(def ^{:private true} Modify
  {:db/ident        :sp/Modify,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf [:spin/Rule :sp/Modify :rdfs/Resource :sp/Command]})