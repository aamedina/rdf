(ns net.wikipunk.rdf.spl
  "A collection of generally useful SPARQL functions (expressed as SPIN functions), and SPIN templates. Also provides a top-level classification of functions, and definitions of the standard SPARQL functions."
  {:owl/imports "http://spinrdf.org/spin",
   :owl/versionInfo "1.4.2",
   :rdf/ns-prefix-map {"afn"  "http://jena.hpl.hp.com/ARQ/function#",
                       "arg"  "http://spinrdf.org/arg#",
                       "fn"   "http://www.w3.org/2005/xpath-functions#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "sp"   "http://spinrdf.org/sp#",
                       "spif" "http://spinrdf.org/spif#",
                       "spin" "http://spinrdf.org/spin#",
                       "spl"  "http://spinrdf.org/spl#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type [:spin/LibraryOntology :owl/Ontology],
   :rdfa/prefix "spl",
   :rdfa/uri "http://spinrdf.org/spl",
   :rdfs/comment
   "A collection of generally useful SPARQL functions (expressed as SPIN functions), and SPIN templates. Also provides a top-level classification of functions, and definitions of the standard SPARQL functions.",
   :rdfs/label "SPIN Standard Library"}
  (:refer-clojure :exclude
                  [class
                   count
                   max
                   min
                   class
                   max
                   min
                   type
                   abs
                   and
                   concat
                   not
                   or
                   rand
                   replace
                   str
                   eval]))

(def AllArguments
  "Gets a list of all spl:Arguments declared at a given class and its superclasses."
  {:db/ident :spl/AllArguments,
   :rdf/type :spin/SelectTemplate,
   :rdfs/comment
   "Gets a list of all spl:Arguments declared at a given class and its superclasses.",
   :rdfs/label "All arguments",
   :rdfs/subClassOf [:spin/SelectTemplates :spl/AllArguments],
   :spin/body {:rdf/type :sp/Select,
               :sp/resultVariables [{:sp/varName "arg"}
                                    {:sp/varName "atClass"}],
               :sp/where [{:rdf/type   :sp/TriplePath,
                           :sp/object  {:sp/varName "atClass"},
                           :sp/path    {:rdf/type   :sp/ModPath,
                                        :sp/modMax  -2,
                                        :sp/modMin  0,
                                        :sp/subPath :rdfs/subClassOf},
                           :sp/subject {:sp/varName "class"}}
                          {:sp/object    {:sp/varName "arg"},
                           :sp/predicate :spin/constraint,
                           :sp/subject   {:sp/varName "atClass"}}
                          {:sp/object    :spl/Argument,
                           :sp/predicate :rdf/type,
                           :sp/subject   {:sp/varName "arg"}}]},
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The class to get the arguments of.",
                     :sp/arg        [:rdfs/Class :spl/class],
                     :spl/predicate :spl/class,
                     :spl/valueType :rdfs/Class},
   :spin/labelTemplate "All spl:Arguments of {?class}"})

(def Argument
  "Provides metadata about an argument of a SPIN Function or Template. Arguments wrap a given rdf:Property (predicate) and specify its value type and whether the argument is optional. When used as spin:constraint, the body of this template will verify that a non-optional value exists and that it has the specified value type. Arguments that have been declared spl:optional true become optional if the type of ?this is spl:UnionTemplate."
  {:db/ident :spl/Argument,
   :rdf/type :spin/ConstructTemplate,
   :rdfs/comment
   "Provides metadata about an argument of a SPIN Function or Template. Arguments wrap a given rdf:Property (predicate) and specify its value type and whether the argument is optional. When used as spin:constraint, the body of this template will verify that a non-optional value exists and that it has the specified value type. Arguments that have been declared spl:optional true become optional if the type of ?this is spl:UnionTemplate. ",
   :rdfs/label "Argument",
   :rdfs/subClassOf [:spin/ConstructTemplates :spl/Argument],
   :spin/body
   {:rdf/type :sp/Construct,
    :sp/templates [{:sp/object    :spin/ConstraintViolation,
                    :sp/predicate :rdf/type,
                    :sp/subject   :rdf/nil}
                   {:sp/object    :spin/_this,
                    :sp/predicate :spin/violationRoot,
                    :sp/subject   :rdf/nil}
                   {:sp/object    {:sp/varName "predicate"},
                    :sp/predicate :spin/violationPath,
                    :sp/subject   :rdf/nil}
                   {:sp/object    {:sp/varName "label"},
                    :sp/predicate :rdfs/label,
                    :sp/subject   :rdf/nil}],
    :sp/where
    [[{:rdf/type      :sp/Filter,
       :sp/expression {:rdf/type [:sp/isIRI
                                  :spin/Functions
                                  :spl/BooleanFunctions],
                       :sp/arg1  :spin/_this}}]
     {:rdf/type :sp/Union,
      :sp/elements
      [[[[{:rdf/type      :sp/Filter,
           :sp/expression {:rdf/type [:sp/or
                                      :spin/Functions
                                      :spl/BooleanFunctions],
                           :sp/arg1  {:rdf/type [:sp/not
                                                 :spin/Functions
                                                 :spl/BooleanFunctions],
                                      :sp/arg1  {:rdf/type
                                                 [:sp/bound
                                                  :spin/Functions
                                                  :spl/BooleanFunctions],
                                                 :sp/arg1 {:sp/varName
                                                           "optional"}}},
                           :sp/arg2  {:rdf/type [:sp/eq
                                                 :spl/BooleanFunctions
                                                 :spin/Functions],
                                      :sp/arg1  {:sp/varName "optional"},
                                      :sp/arg2  false}}}]
         {:rdf/type      :sp/Filter,
          :sp/expression {:rdf/type    [:sp/notExists
                                        :spl/BooleanFunctions
                                        :spin/Functions],
                          :sp/elements [{:sp/object    {:sp/varName "value"},
                                         :sp/predicate {:sp/varName
                                                        "predicate"},
                                         :sp/subject   :spin/_this}]}}
         {:rdf/type      :sp/Filter,
          :sp/expression {:rdf/type    [:sp/notExists
                                        :spl/BooleanFunctions
                                        :spin/Functions],
                          :sp/elements [{:sp/object    {:sp/varName "template"},
                                         :sp/predicate :rdf/type,
                                         :sp/subject   :spin/_this}
                                        {:rdf/type :sp/Filter,
                                         :sp/expression
                                         {:rdf/type [:spl/instanceOf
                                                     :spin/Functions
                                                     :spl/BooleanFunctions],
                                          :sp/arg1  {:sp/varName "template"},
                                          :sp/arg2  :spl/UnionTemplate}}]}}]
        {:rdf/type      :sp/Bind,
         :sp/expression {:rdf/type [:sp/concat
                                    :spl/StringFunctions
                                    :spin/Functions],
                         :sp/arg1  "Missing value for argument ",
                         :sp/arg2  {:rdf/type :afn/localname,
                                    :sp/arg1  {:sp/varName "predicate"}}},
         :sp/variable   {:sp/varName "label"}}]
       [[[{:rdf/type      :sp/Filter,
           :sp/expression {:rdf/type [:sp/bound
                                      :spin/Functions
                                      :spl/BooleanFunctions],
                           :sp/arg1  {:sp/varName "valueType"}}}]
         {:sp/object    {:sp/varName "value"},
          :sp/predicate {:sp/varName "predicate"},
          :sp/subject   :spin/_this}
         {:rdf/type      :sp/Filter,
          :sp/expression {:rdf/type [:sp/and
                                     :spin/Functions
                                     :spl/BooleanFunctions],
                          :sp/arg1  {:rdf/type [:sp/not
                                                :spin/Functions
                                                :spl/BooleanFunctions],
                                     :sp/arg1  {:rdf/type
                                                [:spl/instanceOf
                                                 :spin/Functions
                                                 :spl/BooleanFunctions],
                                                :sp/arg1 {:sp/varName "value"},
                                                :sp/arg2 {:sp/varName
                                                          "valueType"}}},
                          :sp/arg2  {:rdf/type [:sp/or
                                                :spin/Functions
                                                :spl/BooleanFunctions],
                                     :sp/arg1  {:rdf/type [:sp/ne
                                                           :spl/BooleanFunctions
                                                           :spin/Functions],
                                                :sp/arg1  {:sp/varName
                                                           "valueType"},
                                                :sp/arg2  :rdfs/Resource},
                                     :sp/arg2  {:rdf/type
                                                [:sp/isLiteral
                                                 :spin/Functions
                                                 :spl/BooleanFunctions],
                                                :sp/arg1 {:sp/varName
                                                          "value"}}}}}]
        {:rdf/type      :sp/Bind,
         :sp/expression {:rdf/type [:sp/concat
                                    :spl/StringFunctions
                                    :spin/Functions],
                         :sp/arg1  "Incorrect type of argument ",
                         :sp/arg2  {:rdf/type :afn/localname,
                                    :sp/arg1  {:sp/varName "predicate"}},
                         :sp/arg3  " (expected: ",
                         :sp/arg4  {:rdf/type :afn/localname,
                                    :sp/arg1  {:sp/varName "valueType"}},
                         :sp/arg5  ")"},
         :sp/variable   {:sp/varName "label"}}]]}]},
   :spin/constraint
   [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "a comment describing the argument",
     :sp/arg        [:xsd/string :rdfs/comment true],
     :spl/optional  true,
     :spl/predicate :rdfs/comment,
     :spl/valueType :xsd/string}
    {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "the default value for the argument",
     :sp/arg        [:spl/defaultValue true],
     :spl/optional  true,
     :spl/predicate :spl/defaultValue}
    {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "the value type of the argument",
     :sp/arg        [:rdfs/Class :spl/valueType true],
     :spl/optional  true,
     :spl/predicate :spl/valueType,
     :spl/valueType :rdfs/Class}
    {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "indicates whether the argument is optional",
     :sp/arg        [:xsd/boolean :spl/optional true],
     :spl/optional  true,
     :spl/predicate :spl/optional,
     :spl/valueType :xsd/boolean}
    {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "the property holding the values of each function call",
     :sp/arg        [:rdf/Property :spl/predicate],
     :spl/predicate :spl/predicate,
     :spl/valueType :rdf/Property}],
   :spin/labelTemplate "Argument {?predicate} : {?valueType}"})

(def Attribute
  "Defines an \"attribute\" of a class. Attribute definitions bundle common modeling patterns known from object-oriented languages like UML. Each attribute can have min and max cardinality, a value type and a default value. The attribute links a class with one RDF property. This template should be used as spin:constraints on a class to make sure that classes meet the expected cardinalities and valueType constraints. If a model wants to use spl:defaultValue, then it should instantiate the spl:ConstructDefaultValues as a spin:constructor at some root class, such as rdfs:Resource."
  {:db/ident :spl/Attribute,
   :rdf/type :spin/ConstructTemplate,
   :rdfs/comment
   "Defines an \"attribute\" of a class. Attribute definitions bundle common modeling patterns known from object-oriented languages like UML. Each attribute can have min and max cardinality, a value type and a default value. The attribute links a class with one RDF property. This template should be used as spin:constraints on a class to make sure that classes meet the expected cardinalities and valueType constraints.\nIf a model wants to use spl:defaultValue, then it should instantiate the spl:ConstructDefaultValues as a spin:constructor at some root class, such as rdfs:Resource.",
   :rdfs/label "Attribute",
   :rdfs/subClassOf [:spin/ConstructTemplates :spl/Attribute],
   :spin/body
   {:rdf/type :sp/Construct,
    :sp/templates [{:sp/object    :spin/ConstraintViolation,
                    :sp/predicate :rdf/type,
                    :sp/subject   :rdf/nil}
                   {:sp/object    :spin/_this,
                    :sp/predicate :spin/violationRoot,
                    :sp/subject   :rdf/nil}
                   {:sp/object    {:sp/varName "predicate"},
                    :sp/predicate :spin/violationPath,
                    :sp/subject   :rdf/nil}],
    :sp/where
    [{:rdf/type :sp/Filter,
      :sp/expression
      {:rdf/type [:sp/or :spin/Functions :spl/BooleanFunctions],
       :sp/arg1
       {:rdf/type [:sp/or :spin/Functions :spl/BooleanFunctions],
        :sp/arg1  {:rdf/type [:sp/and :spin/Functions :spl/BooleanFunctions],
                   :sp/arg1  {:rdf/type [:sp/bound
                                         :spin/Functions
                                         :spl/BooleanFunctions],
                              :sp/arg1  {:sp/varName "minCount"}},
                   :sp/arg2  {:rdf/type [:sp/lt
                                         :spin/Functions
                                         :spl/BooleanFunctions],
                              :sp/arg1  {:rdf/type [:spl/objectCount
                                                    :spl/OntologyFunctions
                                                    :spin/Functions],
                                         :sp/arg1  :spin/_this,
                                         :sp/arg2  {:sp/varName "predicate"}},
                              :sp/arg2  {:sp/varName "minCount"}}},
        :sp/arg2  {:rdf/type [:sp/and :spin/Functions :spl/BooleanFunctions],
                   :sp/arg1  {:rdf/type [:sp/bound
                                         :spin/Functions
                                         :spl/BooleanFunctions],
                              :sp/arg1  {:sp/varName "maxCount"}},
                   :sp/arg2  {:rdf/type [:sp/gt
                                         :spl/BooleanFunctions
                                         :spin/Functions],
                              :sp/arg1  {:rdf/type [:spl/objectCount
                                                    :spl/OntologyFunctions
                                                    :spin/Functions],
                                         :sp/arg1  :spin/_this,
                                         :sp/arg2  {:sp/varName "predicate"}},
                              :sp/arg2  {:sp/varName "maxCount"}}}},
       :sp/arg2
       {:rdf/type    [:sp/exists :spl/BooleanFunctions :spin/Functions],
        :sp/elements [[{:rdf/type      :sp/Filter,
                        :sp/expression {:rdf/type [:sp/bound
                                                   :spin/Functions
                                                   :spl/BooleanFunctions],
                                        :sp/arg1  {:sp/varName "valueType"}}}]
                      {:sp/object    {:sp/varName "value"},
                       :sp/predicate {:sp/varName "predicate"},
                       :sp/subject   :spin/_this}
                      {:rdf/type      :sp/Filter,
                       :sp/expression {:rdf/type [:sp/not
                                                  :spin/Functions
                                                  :spl/BooleanFunctions],
                                       :sp/arg1  {:rdf/type
                                                  [:spl/instanceOf
                                                   :spin/Functions
                                                   :spl/BooleanFunctions],
                                                  :sp/arg1 {:sp/varName
                                                            "value"},
                                                  :sp/arg2
                                                  {:sp/varName
                                                   "valueType"}}}}]}}}]},
   :spin/constraint
   [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "the minimum number of values permitted for the property",
     :sp/arg        [:xsd/integer :spl/minCount true],
     :spl/optional  true,
     :spl/predicate :spl/minCount,
     :spl/valueType :xsd/integer}
    {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "the maximum number of values permitted for the property",
     :sp/arg        [:xsd/integer :spl/maxCount true],
     :spl/optional  true,
     :spl/predicate :spl/maxCount,
     :spl/valueType :xsd/integer}
    {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "the default value of the attribute",
     :sp/arg        [:spl/defaultValue true],
     :spl/optional  true,
     :spl/predicate :spl/defaultValue}
    {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "the type that all values of the property must have",
     :sp/arg        [:rdfs/Class :spl/valueType true],
     :spl/optional  true,
     :spl/predicate :spl/valueType,
     :spl/valueType :rdfs/Class}
    {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "the RDF property holding the attribute value",
     :sp/arg        [:rdf/Property :spl/predicate],
     :spl/predicate :spl/predicate,
     :spl/valueType :rdf/Property}
    {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "a comment describing the meaning of this attribute",
     :sp/arg        [:xsd/string :rdfs/comment true],
     :spl/optional  true,
     :spl/predicate :rdfs/comment,
     :spl/valueType :xsd/string}],
   :spin/labelTemplate
   "Attribute {?predicate} : {?valueType} [{?minCount},{?maxCount}]"})

(def BooleanFunctions
  "A collection of functions that return a boolean value (true or false)."
  {:db/ident :spl/BooleanFunctions,
   :rdf/type :spin/Function,
   :rdfs/comment
   "A collection of functions that return a boolean value (true or false).",
   :rdfs/label "Boolean functions",
   :rdfs/subClassOf [:spin/Functions :spl/BooleanFunctions],
   :spin/abstract true})

(def ConstraintTemplate
  "Metaclass for CONSTRUCT templates that create spin:ConstraintViolations and can be used as values of spin:constraint."
  {:db/ident :spl/ConstraintTemplate,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Metaclass for CONSTRUCT templates that create spin:ConstraintViolations and can be used as values of spin:constraint.",
   :rdfs/label "Constraint template",
   :rdfs/subClassOf
   [:rdfs/Resource :spin/ConstructTemplate :spl/ConstraintTemplate]})

(def ConstraintTemplates
  "Abstract superclass of templates that can be used as spin:constraints. The subclasses are expected to construct spin:ConstraintViolations and use ?this to talk about the instances of the associated class."
  {:db/ident :spl/ConstraintTemplates,
   :rdf/type [:spl/ConstraintTemplate :spin/ConstructTemplate :rdfs/Resource],
   :rdfs/comment
   "Abstract superclass of templates that can be used as spin:constraints. The subclasses are expected to construct spin:ConstraintViolations and use ?this to talk about the instances of the associated class.",
   :rdfs/label "Constraint templates",
   :rdfs/subClassOf [:spin/ConstructTemplates :spl/ConstraintTemplates],
   :spin/abstract true})

(def ConstructDefaultValues
  "This template can be attached as spin:constructor to a root class such as rdfs:Resource to ensure that SPIN processors assign default values to certain properties. Looks for any templates attached as spin:constraints to the types of ?this and then assigns their declared spl:defaultValues."
  {:db/ident :spl/ConstructDefaultValues,
   :rdf/type :spin/ConstructTemplate,
   :rdfs/comment
   "This template can be attached as spin:constructor to a root class such as rdfs:Resource to ensure that SPIN processors assign default values to certain properties. Looks for any templates attached as spin:constraints to the types of ?this and then assigns their declared spl:defaultValues.",
   :rdfs/label "Construct default values",
   :rdfs/subClassOf [:spin/ConstructTemplates :spl/ConstructDefaultValues],
   :spin/body {:rdf/type     :sp/Construct,
               :sp/templates [{:sp/object    {:sp/varName "defaultValue"},
                               :sp/predicate {:sp/varName "predicate"},
                               :sp/subject   :spin/_this}],
               :sp/where     [{:sp/object    {:sp/varName "directType"},
                               :sp/predicate :rdf/type,
                               :sp/subject   :spin/_this}
                              {:rdf/type   :sp/TriplePath,
                               :sp/object  {:sp/varName "type"},
                               :sp/path    {:rdf/type   :sp/ModPath,
                                            :sp/modMax  -2,
                                            :sp/modMin  0,
                                            :sp/subPath :rdfs/subClassOf},
                               :sp/subject {:sp/varName "directType"}}
                              {:sp/object    {:sp/varName "attribute"},
                               :sp/predicate :spin/constraint,
                               :sp/subject   {:sp/varName "type"}}
                              {:sp/object    {:sp/varName "defaultValue"},
                               :sp/predicate :spl/defaultValue,
                               :sp/subject   {:sp/varName "attribute"}}
                              {:sp/object    {:sp/varName "predicate"},
                               :sp/predicate :spl/predicate,
                               :sp/subject   {:sp/varName "attribute"}}]},
   :spin/labelTemplate "Construct default values"})

(def CountPropertyConstraintTemplates
  "Abstract superclass of property constraints that compare the number of values with either min or max count."
  {:db/ident :spl/CountPropertyConstraintTemplates,
   :rdf/type [:spl/ConstraintTemplate :spin/ConstructTemplate :rdfs/Resource],
   :rdfs/comment
   "Abstract superclass of property constraints that compare the number of values with either min or max count.",
   :rdfs/label "Count property constraint templates",
   :rdfs/subClassOf [:spl/PropertyConstraintTemplates
                     :spl/CountPropertyConstraintTemplates
                     :spin/ConstructTemplates
                     :spl/ConstraintTemplates],
   :spin/abstract true,
   :spin/constraint
   [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "The maximum number of values that the property must have.",
     :sp/arg        [:xsd/integer :arg/maxCount true],
     :spl/optional  true,
     :spl/predicate :arg/maxCount,
     :spl/valueType :xsd/integer}
    {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "The minimum number of values that the property must have.",
     :sp/arg        [:xsd/integer :arg/minCount true],
     :spl/optional  true,
     :spl/predicate :arg/minCount,
     :spl/valueType :xsd/integer}]})

(def DateFunctions
  "A collection of functions that operate on date/time literals."
  {:db/ident :spl/DateFunctions,
   :rdf/type :spin/Function,
   :rdfs/comment
   "A collection of functions that operate on date/time literals.",
   :rdfs/label "Date functions",
   :rdfs/subClassOf [:spin/Functions :spl/DateFunctions],
   :spin/abstract true})

(def ExistencePropertyPairConstraint
  "Existence property pair constraint"
  {:db/ident :spl/ExistencePropertyPairConstraint,
   :rdf/type [:spl/ConstraintTemplate :spin/ConstructTemplate :rdfs/Resource],
   :rdfs/label "Existence property pair constraint",
   :rdfs/subClassOf [:spl/PropertyPairConstraintTemplates
                     :spl/ExistencePropertyPairConstraint
                     :spl/PropertyConstraintTemplates
                     :spin/ConstructTemplates
                     :spl/ConstraintTemplates],
   :spin/body
   {:rdf/type :sp/Construct,
    :sp/templates [{:sp/object    :spin/ConstraintViolation,
                    :sp/predicate :rdf/type,
                    :sp/subject   :rdf/nil}
                   {:sp/object    :spin/_this,
                    :sp/predicate :spin/violationRoot,
                    :sp/subject   :rdf/nil}
                   {:sp/object    {:sp/varName "property"},
                    :sp/predicate :spin/violationPath,
                    :sp/subject   :rdf/nil}
                   {:sp/object    {:sp/varName "message"},
                    :sp/predicate :rdfs/label,
                    :sp/subject   :rdf/nil}],
    :sp/where
    [{:rdf/type      :sp/Filter,
      :sp/expression {:rdf/type    [:sp/exists
                                    :spl/BooleanFunctions
                                    :spin/Functions],
                      :sp/elements [{:sp/object    {:sp/varName "someValue"},
                                     :sp/predicate {:sp/varName
                                                    "otherProperty"},
                                     :sp/subject   :spin/_this}]}}
     {:rdf/type      :sp/Filter,
      :sp/expression {:rdf/type    [:sp/notExists
                                    :spl/BooleanFunctions
                                    :spin/Functions],
                      :sp/elements [{:sp/object    {:sp/varName "object"},
                                     :sp/predicate {:sp/varName "property"},
                                     :sp/subject   :spin/_this}]}}
     {:rdf/type      :sp/Bind,
      :sp/expression {:rdf/type [:sp/concat
                                 :spl/StringFunctions
                                 :spin/Functions],
                      :sp/arg1  "Property ",
                      :sp/arg2  {:rdf/type [:sp/str
                                            :spl/StringFunctions
                                            :spin/Functions],
                                 :sp/arg1  {:sp/varName "property"}},
                      :sp/arg3  " must have a value because ",
                      :sp/arg4  {:rdf/type [:sp/str
                                            :spl/StringFunctions
                                            :spin/Functions],
                                 :sp/arg1  {:sp/varName "otherProperty"}},
                      :sp/arg5  " has"},
      :sp/variable   {:sp/varName "message"}}]},
   :spin/labelTemplate
   "The property {?property} must have a value whenever {?otherProperty} has a value"})

(def InferDefaultValue
  "Can be used to infer default values for a given subject/predicate combination. This is typically assigned as spin:rule to a class. If ?this does not already have a value for a given property {?predicate}, then this will infer the value {?defaultValue}."
  {:db/ident :spl/InferDefaultValue,
   :rdf/type :spin/ConstructTemplate,
   :rdfs/comment
   "Can be used to infer default values for a given subject/predicate combination. This is typically assigned as spin:rule to a class. If ?this does not already have a value for a given property {?predicate}, then this will infer the value {?defaultValue}.",
   :rdfs/label "Infer default value",
   :rdfs/subClassOf [:spin/ConstructTemplates :spl/InferDefaultValue],
   :spin/body
   {:rdf/type     :sp/Construct,
    :sp/templates [{:sp/object    {:sp/varName "defaultValue"},
                    :sp/predicate {:sp/varName "predicate"},
                    :sp/subject   :spin/_this}],
    :sp/where     [{:rdf/type    :sp/Optional,
                    :sp/elements [{:sp/object    {:sp/varName "anyValue"},
                                   :sp/predicate {:sp/varName "predicate"},
                                   :sp/subject   :spin/_this}]}
                   {:rdf/type      :sp/Filter,
                    :sp/expression {:rdf/type [:sp/not
                                               :spin/Functions
                                               :spl/BooleanFunctions],
                                    :sp/arg1  {:rdf/type
                                               [:sp/bound
                                                :spin/Functions
                                                :spl/BooleanFunctions],
                                               :sp/arg1 {:sp/varName
                                                         "anyValue"}}}}]},
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The default value to infer.",
                      :sp/arg        :spl/defaultValue,
                      :spl/predicate :spl/defaultValue}
                     {:rdf/type [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment
                      "The predicate to infer the default value of.",
                      :sp/arg [:rdf/Property :spl/predicate],
                      :spl/predicate :spl/predicate,
                      :spl/valueType :rdf/Property}],
   :spin/labelTemplate "Default value for {?predicate}: {?defaultValue}"})

(def LessThanOtherPropertyPairConstraint
  "Can be used to define a constraint between two properties (?property and ?otherProperty) enforcing the invariant that the values of ?property must be smaller than the values of ?otherProperty. For example this can be used to state that ex:startDate must be < ex:endDate."
  {:db/ident :spl/LessThanOtherPropertyPairConstraint,
   :rdf/type [:spl/ConstraintTemplate :spin/ConstructTemplate :rdfs/Resource],
   :rdfs/comment
   "Can be used to define a constraint between two properties (?property and ?otherProperty) enforcing the invariant that the values of ?property must be smaller than the values of ?otherProperty. For example this can be used to state that ex:startDate must be < ex:endDate.",
   :rdfs/label "Less than other property pair constraint",
   :rdfs/subClassOf [:spl/PropertyPairConstraintTemplates
                     :spl/LessThanOtherPropertyPairConstraint
                     :spl/PropertyConstraintTemplates
                     :spin/ConstructTemplates
                     :spl/ConstraintTemplates],
   :spin/body
   {:rdf/type :sp/Construct,
    :sp/templates [{:sp/object    :spin/ConstraintViolation,
                    :sp/predicate :rdf/type,
                    :sp/subject   :rdf/nil}
                   {:sp/object    {:sp/varName "property"},
                    :sp/predicate :spin/violationPath,
                    :sp/subject   :rdf/nil}
                   {:sp/object    {:sp/varName "value"},
                    :sp/predicate :spin/violationValue,
                    :sp/subject   :rdf/nil}
                   {:sp/object    :spin/_this,
                    :sp/predicate :spin/violationRoot,
                    :sp/subject   :rdf/nil}
                   {:sp/object    {:sp/varName "label"},
                    :sp/predicate :rdfs/label,
                    :sp/subject   :rdf/nil}],
    :sp/where
    [{:sp/object    {:sp/varName "value"},
      :sp/predicate {:sp/varName "property"},
      :sp/subject   :spin/_this}
     {:sp/object    {:sp/varName "otherValue"},
      :sp/predicate {:sp/varName "otherProperty"},
      :sp/subject   :spin/_this}
     {:rdf/type      :sp/Filter,
      :sp/expression {:rdf/type [:sp/ge :spin/Functions :spl/BooleanFunctions],
                      :sp/arg1  {:sp/varName "value"},
                      :sp/arg2  {:sp/varName "otherValue"}}}
     {:rdf/type      :sp/Bind,
      :sp/expression {:rdf/type [:sp/concat
                                 :spl/StringFunctions
                                 :spin/Functions],
                      :sp/arg1  "Value ",
                      :sp/arg2  {:rdf/type [:sp/str
                                            :spl/StringFunctions
                                            :spin/Functions],
                                 :sp/arg1  {:sp/varName "value"}},
                      :sp/arg3  " of ",
                      :sp/arg4  {:rdf/type [:sp/str
                                            :spl/StringFunctions
                                            :spin/Functions],
                                 :sp/arg1  {:sp/varName "property"}},
                      :sp/arg5  " must be less than ",
                      :sp/arg6  {:rdf/type [:sp/str
                                            :spl/StringFunctions
                                            :spin/Functions],
                                 :sp/arg1  {:sp/varName "otherValue"}},
                      :sp/arg7  " of ",
                      :sp/arg8  {:rdf/type [:sp/str
                                            :spl/StringFunctions
                                            :spin/Functions],
                                 :sp/arg1  {:sp/varName "otherProperty"}}},
      :sp/variable   {:sp/varName "label"}}]},
   :spin/labelTemplate
   "Values of {?property} must be less than the values of {?otherProperty}"})

(def MathematicalFunctions
  "A collection of functions operating on numbers."
  {:db/ident        :spl/MathematicalFunctions,
   :rdf/type        :spin/Function,
   :rdfs/comment    "A collection of functions operating on numbers.",
   :rdfs/label      "Mathematical functions",
   :rdfs/subClassOf [:spin/Functions :spl/MathematicalFunctions],
   :spin/abstract   true})

(def MiscFunctions
  "A collection of functions that are difficult to categorize."
  {:db/ident :spl/MiscFunctions,
   :rdf/type :spin/Function,
   :rdfs/comment "A collection of functions that are difficult to categorize.",
   :rdfs/label "Misc functions",
   :rdfs/subClassOf [:spin/Functions :spl/MiscFunctions],
   :spin/abstract true})

(def NonExistencePropertyPairConstraint
  "Non-existence property pair constraint"
  {:db/ident :spl/NonExistencePropertyPairConstraint,
   :rdf/type [:spl/ConstraintTemplate :spin/ConstructTemplate :rdfs/Resource],
   :rdfs/label "Non-existence property pair constraint",
   :rdfs/subClassOf [:spl/PropertyPairConstraintTemplates
                     :spl/NonExistencePropertyPairConstraint
                     :spl/PropertyConstraintTemplates
                     :spin/ConstructTemplates
                     :spl/ConstraintTemplates],
   :spin/body
   {:rdf/type :sp/Construct,
    :sp/templates [{:sp/object    :spin/ConstraintViolation,
                    :sp/predicate :rdf/type,
                    :sp/subject   :rdf/nil}
                   {:sp/object    :spin/_this,
                    :sp/predicate :spin/violationRoot,
                    :sp/subject   :rdf/nil}
                   {:sp/object    {:sp/varName "property"},
                    :sp/predicate :spin/violationPath,
                    :sp/subject   :rdf/nil}
                   {:sp/object    {:sp/varName "message"},
                    :sp/predicate :rdfs/label,
                    :sp/subject   :rdf/nil}],
    :sp/where
    [{:rdf/type      :sp/Filter,
      :sp/expression {:rdf/type    [:sp/notExists
                                    :spl/BooleanFunctions
                                    :spin/Functions],
                      :sp/elements [{:sp/object    {:sp/varName "someValue"},
                                     :sp/predicate {:sp/varName
                                                    "otherProperty"},
                                     :sp/subject   :spin/_this}]}}
     {:rdf/type      :sp/Filter,
      :sp/expression {:rdf/type    [:sp/exists
                                    :spl/BooleanFunctions
                                    :spin/Functions],
                      :sp/elements [{:sp/object    {:sp/varName "object"},
                                     :sp/predicate {:sp/varName "property"},
                                     :sp/subject   :spin/_this}]}}
     {:rdf/type      :sp/Bind,
      :sp/expression {:rdf/type [:sp/concat
                                 :spl/StringFunctions
                                 :spin/Functions],
                      :sp/arg1  "Property ",
                      :sp/arg2  {:rdf/type [:sp/str
                                            :spl/StringFunctions
                                            :spin/Functions],
                                 :sp/arg1  {:sp/varName "property"}},
                      :sp/arg3  " must have no values because ",
                      :sp/arg4  {:rdf/type [:sp/str
                                            :spl/StringFunctions
                                            :spin/Functions],
                                 :sp/arg1  {:sp/varName "otherProperty"}},
                      :sp/arg5  " has none"},
      :sp/variable   {:sp/varName "message"}}]},
   :spin/labelTemplate
   "The property {?property} must have no values as long as {?otherProperty} has none"})

(def ObjectCountPropertyConstraint
  "Represents a constraint that can be attached to a class to specify that a given property must have between min and max values."
  {:db/ident :spl/ObjectCountPropertyConstraint,
   :rdf/type [:spl/ConstraintTemplate :spin/ConstructTemplate :rdfs/Resource],
   :rdfs/comment
   "Represents a constraint that can be attached to a class to specify that a given property must have between min and max values.",
   :rdfs/label "Object count property constraint",
   :rdfs/subClassOf [:spl/CountPropertyConstraintTemplates
                     :spl/ObjectCountPropertyConstraint
                     :spl/PropertyConstraintTemplates
                     :spin/ConstructTemplates
                     :spl/ConstraintTemplates],
   :spin/body {:rdf/type :sp/Construct,
               :sp/templates [{:sp/object    :spin/ConstraintViolation,
                               :sp/predicate :rdf/type,
                               :sp/subject   :rdf/nil}
                              {:sp/object    :spin/_this,
                               :sp/predicate :spin/violationRoot,
                               :sp/subject   :rdf/nil}
                              {:sp/object    {:sp/varName "property"},
                               :sp/predicate :spin/violationPath,
                               :sp/subject   :rdf/nil}
                              {:sp/object    {:sp/varName "message"},
                               :sp/predicate :rdfs/label,
                               :sp/subject   :rdf/nil}],
               :sp/where
               [{:rdf/type      :sp/Bind,
                 :sp/expression {:rdf/type [:spl/objectCount
                                            :spl/OntologyFunctions
                                            :spin/Functions],
                                 :sp/arg1  :spin/_this,
                                 :sp/arg2  {:sp/varName "property"}},
                 :sp/variable   {:sp/varName "objectCount"}}
                {:rdf/type :sp/Filter,
                 :sp/expression
                 {:rdf/type [:sp/or :spin/Functions :spl/BooleanFunctions],
                  :sp/arg1  {:rdf/type [:sp/and
                                        :spin/Functions
                                        :spl/BooleanFunctions],
                             :sp/arg1  {:rdf/type [:sp/bound
                                                   :spin/Functions
                                                   :spl/BooleanFunctions],
                                        :sp/arg1  {:sp/varName "minCount"}},
                             :sp/arg2  {:rdf/type [:sp/lt
                                                   :spin/Functions
                                                   :spl/BooleanFunctions],
                                        :sp/arg1  {:sp/varName "objectCount"},
                                        :sp/arg2  {:sp/varName "minCount"}}},
                  :sp/arg2  {:rdf/type [:sp/and
                                        :spin/Functions
                                        :spl/BooleanFunctions],
                             :sp/arg1  {:rdf/type [:sp/bound
                                                   :spin/Functions
                                                   :spl/BooleanFunctions],
                                        :sp/arg1  {:sp/varName "maxCount"}},
                             :sp/arg2  {:rdf/type [:sp/gt
                                                   :spl/BooleanFunctions
                                                   :spin/Functions],
                                        :sp/arg1  {:sp/varName "objectCount"},
                                        :sp/arg2  {:sp/varName "maxCount"}}}}}
                {:rdf/type      :sp/Bind,
                 :sp/expression {:rdf/type [:sp/concat
                                            :spl/StringFunctions
                                            :spin/Functions],
                                 :sp/arg1  "Invalid number of values: ",
                                 :sp/arg2  {:rdf/type [:sp/str
                                                       :spl/StringFunctions
                                                       :spin/Functions],
                                            :sp/arg1  {:sp/varName
                                                       "objectCount"}}},
                 :sp/variable   {:sp/varName "message"}}]},
   :spin/labelTemplate
   "The property {?property} must have between {?minCount} and {?maxCount} values"})

(def OntologyFunctions
  "A collection of functions performing ontology-related operations."
  {:db/ident :spl/OntologyFunctions,
   :rdf/type :spin/Function,
   :rdfs/comment
   "A collection of functions performing ontology-related operations.",
   :rdfs/label "Ontology functions",
   :rdfs/subClassOf [:spin/Functions :spl/OntologyFunctions],
   :spin/abstract true})

(def PrimaryKeyPropertyConstraint
  "Specifies that the given property is a primary key for instances of the associated class (and its subclasses). If a property has been declared to be the primary key then each instance of the class must have exactly one value for that property. Furthermore, the URIs of those instances must start with a given string (arg:uriStart), followed by the URL-encoded primary key value. For example if arg:uriStart is \"http://example.org/country-\" and the primary key for an instance is \"de\" then the URI must be \"http://example.org/country-de\". Finally, as a result of the URI policy, there can not be any other instance with the same value under the same primary key policy."
  {:db/ident :spl/PrimaryKeyPropertyConstraint,
   :rdf/type [:spl/ConstraintTemplate :spin/ConstructTemplate :rdfs/Resource],
   :rdfs/comment
   "Specifies that the given property is a primary key for instances of the associated class (and its subclasses). If a property has been declared to be the primary key then each instance of the class must have exactly one value for that property. Furthermore, the URIs of those instances must start with a given string (arg:uriStart), followed by the URL-encoded primary key value. For example if arg:uriStart is \"http://example.org/country-\" and the primary key for an instance is \"de\" then the URI must be \"http://example.org/country-de\". Finally, as a result of the URI policy, there can not be any other instance with the same value under the same primary key policy.",
   :rdfs/label "Primary key property constraint",
   :rdfs/subClassOf [:spl/PropertyConstraintTemplates
                     :spl/PrimaryKeyPropertyConstraint
                     :spin/ConstructTemplates
                     :spl/ConstraintTemplates],
   :spin/body
   {:rdf/type :sp/Construct,
    :sp/templates [{:sp/object    :spin/ConstraintViolation,
                    :sp/predicate :rdf/type,
                    :sp/subject   :rdf/nil}
                   {:sp/object    {:sp/varName "label"},
                    :sp/predicate :rdfs/label,
                    :sp/subject   :rdf/nil}
                   {:sp/object    :spin/_this,
                    :sp/predicate :spin/violationRoot,
                    :sp/subject   :rdf/nil}
                   {:sp/object    {:sp/varName "property"},
                    :sp/predicate :spin/violationPath,
                    :sp/subject   :rdf/nil}],
    :sp/where
    [{:rdf/type :sp/Union,
      :sp/elements
      [[{:rdf/type      :sp/Filter,
         :sp/expression {:rdf/type    [:sp/notExists
                                       :spl/BooleanFunctions
                                       :spin/Functions],
                         :sp/elements [{:sp/object    {:sp/varName "any"},
                                        :sp/predicate {:sp/varName "property"},
                                        :sp/subject   :spin/_this}]}}
        {:rdf/type      :sp/Bind,
         :sp/expression "Missing value for primary key property",
         :sp/variable   {:sp/varName "label"}}]
       [{:rdf/type      :sp/Filter,
         :sp/expression {:rdf/type [:sp/gt
                                    :spl/BooleanFunctions
                                    :spin/Functions],
                         :sp/arg1  {:rdf/type [:spl/objectCount
                                               :spl/OntologyFunctions
                                               :spin/Functions],
                                    :sp/arg1  :spin/_this,
                                    :sp/arg2  {:sp/varName "property"}},
                         :sp/arg2  1}}
        {:rdf/type      :sp/Bind,
         :sp/expression "Multiple values of primary key property",
         :sp/variable   {:sp/varName "label"}}]
       [{:rdf/type      :sp/Filter,
         :sp/expression {:rdf/type [:sp/eq
                                    :spl/BooleanFunctions
                                    :spin/Functions],
                         :sp/arg1  {:rdf/type [:spl/objectCount
                                               :spl/OntologyFunctions
                                               :spin/Functions],
                                    :sp/arg1  :spin/_this,
                                    :sp/arg2  {:sp/varName "property"}},
                         :sp/arg2  1}}
        {:sp/object    {:sp/varName "value"},
         :sp/predicate {:sp/varName "property"},
         :sp/subject   :spin/_this}
        {:rdf/type      :sp/Bind,
         :sp/expression {:rdf/type [:sp/concat
                                    :spl/StringFunctions
                                    :spin/Functions],
                         :sp/arg1  {:sp/varName "uriStart"},
                         :sp/arg2  {:rdf/type [:sp/encode_for_uri
                                               :spin/Functions
                                               :spl/StringFunctions],
                                    :sp/arg1  {:rdf/type :xsd/string,
                                               :sp/arg1  {:sp/varName
                                                          "value"}}}},
         :sp/variable   {:sp/varName "uri"}}
        {:rdf/type      :sp/Filter,
         :sp/expression {:rdf/type [:sp/ne
                                    :spl/BooleanFunctions
                                    :spin/Functions],
                         :sp/arg1  {:rdf/type :xsd/string,
                                    :sp/arg1  :spin/_this},
                         :sp/arg2  {:sp/varName "uri"}}}
        {:rdf/type      :sp/Bind,
         :sp/expression {:rdf/type [:sp/concat
                                    :spl/StringFunctions
                                    :spin/Functions],
                         :sp/arg1  "Primary key value ",
                         :sp/arg2  {:rdf/type [:sp/str
                                               :spl/StringFunctions
                                               :spin/Functions],
                                    :sp/arg1  {:sp/varName "value"}},
                         :sp/arg3  " does not align with the expected URI ",
                         :sp/arg4  {:sp/varName "uri"}},
         :sp/variable   {:sp/varName "label"}}]]}]},
   :spin/constraint
   [{:rdf/type     :sp/Ask,
     :rdfs/comment "rdfs:label cannot be used as primary key",
     :sp/where     [{:sp/object    :rdfs/label,
                     :sp/predicate :arg/property,
                     :sp/subject   :spin/_this}]}
    {:rdf/type [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment
     "The start of the URIs of well-formed instances of the associated class.",
     :sp/arg [:xsd/string :arg/uriStart],
     :spl/predicate :arg/uriStart,
     :spl/valueType :xsd/string}],
   :spin/labelTemplate
   "The property {?property} is the primary key and URIs start with {?uriStart}"})

(def PropertyConstraintTemplates
  "Abstract superclass of constraint templates that constrain exactly one property."
  {:db/ident :spl/PropertyConstraintTemplates,
   :rdf/type [:spl/ConstraintTemplate :spin/ConstructTemplate :rdfs/Resource],
   :rdfs/comment
   "Abstract superclass of constraint templates that constrain exactly one property.",
   :rdfs/label "Property constraint templates",
   :rdfs/subClassOf [:spl/ConstraintTemplates
                     :spl/PropertyConstraintTemplates
                     :spin/ConstructTemplates],
   :spin/abstract true,
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The property being constrained.",
                     :sp/arg        [:rdf/Property :arg/property],
                     :spl/predicate :arg/property,
                     :spl/valueType :rdf/Property}})

(def PropertyPairConstraintTemplates
  "Abstract base class for templates that take two properties as arguments and establish a relationship between them."
  {:db/ident :spl/PropertyPairConstraintTemplates,
   :rdf/type [:spl/ConstraintTemplate :spin/ConstructTemplate :rdfs/Resource],
   :rdfs/comment
   "Abstract base class for templates that take two properties as arguments and establish a relationship between them.",
   :rdfs/label "Property pair constraint templates",
   :rdfs/subClassOf [:spl/PropertyConstraintTemplates
                     :spl/PropertyPairConstraintTemplates
                     :spin/ConstructTemplates
                     :spl/ConstraintTemplates],
   :spin/abstract true,
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The \"other\" property.",
                     :sp/arg        [:rdf/Property :arg/otherProperty],
                     :spl/predicate :arg/otherProperty,
                     :spl/valueType :rdf/Property}})

(def RangePropertyConstraint
  "Represents a constraint that narrows down a property by a minimum and maximum value compared by <= and >=."
  {:db/ident :spl/RangePropertyConstraint,
   :rdf/type [:spl/ConstraintTemplate :spin/ConstructTemplate :rdfs/Resource],
   :rdfs/comment
   "Represents a constraint that narrows down a property by a minimum and maximum value compared by <= and >=.",
   :rdfs/label "Range property constraint",
   :rdfs/subClassOf [:spl/PropertyConstraintTemplates
                     :spl/RangePropertyConstraint
                     :spin/ConstructTemplates
                     :spl/ConstraintTemplates],
   :spin/body {:rdf/type :sp/Construct,
               :sp/templates [{:sp/object    :spin/ConstraintViolation,
                               :sp/predicate :rdf/type,
                               :sp/subject   :rdf/nil}
                              {:sp/object    :spin/_this,
                               :sp/predicate :spin/violationRoot,
                               :sp/subject   :rdf/nil}
                              {:sp/object    {:sp/varName "property"},
                               :sp/predicate :spin/violationPath,
                               :sp/subject   :rdf/nil}
                              {:sp/object    {:sp/varName "object"},
                               :sp/predicate :spin/violationValue,
                               :sp/subject   :rdf/nil}
                              {:sp/object    {:sp/varName "message"},
                               :sp/predicate :rdfs/label,
                               :sp/subject   :rdf/nil}],
               :sp/where
               [{:sp/object    {:sp/varName "object"},
                 :sp/predicate {:sp/varName "property"},
                 :sp/subject   :spin/_this}
                {:rdf/type :sp/Filter,
                 :sp/expression
                 {:rdf/type [:sp/or :spin/Functions :spl/BooleanFunctions],
                  :sp/arg1  {:rdf/type [:sp/and
                                        :spin/Functions
                                        :spl/BooleanFunctions],
                             :sp/arg1  {:rdf/type [:sp/bound
                                                   :spin/Functions
                                                   :spl/BooleanFunctions],
                                        :sp/arg1  {:sp/varName "min"}},
                             :sp/arg2  {:rdf/type [:sp/lt
                                                   :spin/Functions
                                                   :spl/BooleanFunctions],
                                        :sp/arg1  {:sp/varName "object"},
                                        :sp/arg2  {:sp/varName "min"}}},
                  :sp/arg2  {:rdf/type [:sp/and
                                        :spin/Functions
                                        :spl/BooleanFunctions],
                             :sp/arg1  {:rdf/type [:sp/bound
                                                   :spin/Functions
                                                   :spl/BooleanFunctions],
                                        :sp/arg1  {:sp/varName "max"}},
                             :sp/arg2  {:rdf/type [:sp/gt
                                                   :spl/BooleanFunctions
                                                   :spin/Functions],
                                        :sp/arg1  {:sp/varName "object"},
                                        :sp/arg2  {:sp/varName "max"}}}}}
                {:rdf/type      :sp/Bind,
                 :sp/expression {:rdf/type [:sp/concat
                                            :spl/StringFunctions
                                            :spin/Functions],
                                 :sp/arg1  "Value ",
                                 :sp/arg2  {:rdf/type [:sp/str
                                                       :spl/StringFunctions
                                                       :spin/Functions],
                                            :sp/arg1  {:sp/varName "object"}},
                                 :sp/arg3  " must be in the interval [",
                                 :sp/arg4  {:rdf/type [:sp/str
                                                       :spl/StringFunctions
                                                       :spin/Functions],
                                            :sp/arg1  {:sp/varName "min"}},
                                 :sp/arg5  ", ",
                                 :sp/arg6  {:rdf/type [:sp/str
                                                       :spl/StringFunctions
                                                       :spin/Functions],
                                            :sp/arg1  {:sp/varName "max"}},
                                 :sp/arg7  "]"},
                 :sp/variable   {:sp/varName "message"}}]},
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The maximum value.",
                      :sp/arg        [:rdfs/Literal :arg/max true],
                      :spl/optional  true,
                      :spl/predicate :arg/max,
                      :spl/valueType :rdfs/Literal}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The minimum value.",
                      :sp/arg        [:rdfs/Literal :arg/min true],
                      :spl/optional  true,
                      :spl/predicate :arg/min,
                      :spl/valueType :rdfs/Literal}],
   :spin/labelTemplate
   "Values of {?property} must be within the interval [ {?min} , {?max} ]"})

(def RegexPropertyConstraint
  "Regex property constraint"
  {:db/ident :spl/RegexPropertyConstraint,
   :rdf/type [:spl/ConstraintTemplate :spin/ConstructTemplate :rdfs/Resource],
   :rdfs/label "Regex property constraint",
   :rdfs/subClassOf [:spl/PropertyConstraintTemplates
                     :spl/RegexPropertyConstraint
                     :spin/ConstructTemplates
                     :spl/ConstraintTemplates],
   :spin/body {:rdf/type :sp/Construct,
               :sp/templates [{:sp/object    :spin/ConstraintViolation,
                               :sp/predicate :rdf/type,
                               :sp/subject   :rdf/nil}
                              {:sp/object    :spin/_this,
                               :sp/predicate :spin/violationRoot,
                               :sp/subject   :rdf/nil}
                              {:sp/object    {:sp/varName "property"},
                               :sp/predicate :spin/violationPath,
                               :sp/subject   :rdf/nil}
                              {:sp/object    {:sp/varName "message"},
                               :sp/predicate :rdfs/label,
                               :sp/subject   :rdf/nil}],
               :sp/where
               [{:sp/object    {:sp/varName "object"},
                 :sp/predicate {:sp/varName "property"},
                 :sp/subject   :spin/_this}
                {:rdf/type      :sp/Filter,
                 :sp/expression {:rdf/type [:sp/not
                                            :spin/Functions
                                            :spl/BooleanFunctions],
                                 :sp/arg1  {:rdf/type [:sp/regex
                                                       :spin/Functions
                                                       :spl/StringFunctions],
                                            :sp/arg1  {:rdf/type :xsd/string,
                                                       :sp/arg1  {:sp/varName
                                                                  "object"}},
                                            :sp/arg2  {:sp/varName "pattern"}}}}
                {:rdf/type      :sp/Bind,
                 :sp/expression {:rdf/type [:sp/concat
                                            :spl/StringFunctions
                                            :spin/Functions],
                                 :sp/arg1 "Value ",
                                 :sp/arg2 {:rdf/type [:sp/str
                                                      :spl/StringFunctions
                                                      :spin/Functions],
                                           :sp/arg1  {:sp/varName "object"}},
                                 :sp/arg3
                                 " must match the regular expression \"",
                                 :sp/arg4 {:sp/varName "pattern"},
                                 :sp/arg5 "\""},
                 :sp/variable   {:sp/varName "message"}}]},
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The regular expression to match.",
                     :sp/arg        [:xsd/string :arg/pattern],
                     :spl/predicate :arg/pattern,
                     :spl/valueType :xsd/string},
   :spin/labelTemplate
   "Values of {?property} must match the regular expression {?pattern}"})

(def RunTestCases
  "Runs all spl:TestCases on the current model."
  {:db/ident :spl/RunTestCases,
   :rdf/type :spin/SelectTemplate,
   :rdfs/comment "Runs all spl:TestCases on the current model.",
   :rdfs/label "Run test cases",
   :rdfs/subClassOf [:spin/SelectTemplates :spl/RunTestCases],
   :spin/body
   {:rdf/type :sp/Select,
    :sp/resultVariables
    [{:sp/varName "testCase"} {:sp/varName "expected"} {:sp/varName "actual"}],
    :sp/where [{:sp/object    {:sp/varName "expr"},
                :sp/predicate :spl/testExpression,
                :sp/subject   {:sp/varName "testCase"}}
               {:rdf/type    :sp/Optional,
                :sp/elements [{:sp/object    {:sp/varName "expected"},
                               :sp/predicate :spl/testResult,
                               :sp/subject   {:sp/varName "testCase"}}]}
               {:rdf/type      :sp/Bind,
                :sp/expression {:rdf/type :spin/eval,
                                :sp/arg1  {:sp/varName "expr"}},
                :sp/variable   {:sp/varName "actual"}}
               {:rdf/type :sp/Filter,
                :sp/expression
                {:rdf/type [:sp/or :spin/Functions :spl/BooleanFunctions],
                 :sp/arg1  {:rdf/type [:sp/ne
                                       :spl/BooleanFunctions
                                       :spin/Functions],
                            :sp/arg1  {:rdf/type [:sp/bound
                                                  :spin/Functions
                                                  :spl/BooleanFunctions],
                                       :sp/arg1  {:sp/varName "expected"}},
                            :sp/arg2  {:rdf/type [:sp/bound
                                                  :spin/Functions
                                                  :spl/BooleanFunctions],
                                       :sp/arg1  {:sp/varName "actual"}}},
                 :sp/arg2  {:rdf/type [:sp/and
                                       :spin/Functions
                                       :spl/BooleanFunctions],
                            :sp/arg1  {:rdf/type [:sp/bound
                                                  :spin/Functions
                                                  :spl/BooleanFunctions],
                                       :sp/arg1  {:sp/varName "expected"}},
                            :sp/arg2  {:rdf/type [:sp/ne
                                                  :spl/BooleanFunctions
                                                  :spin/Functions],
                                       :sp/arg1  {:sp/varName "actual"},
                                       :sp/arg2  {:sp/varName
                                                  "expected"}}}}}]}})

(def SPINOverview
  "Finds all constraints and rules attached to classes in the current graph, using spin:constraint, spin:constructor, spin:rule or their sub-properties. The result set will contain the associated class, the predicate, and the SPIN rule."
  {:db/ident :spl/SPINOverview,
   :rdf/type :spin/SelectTemplate,
   :rdfs/comment
   "Finds all constraints and rules attached to classes in the current graph, using spin:constraint, spin:constructor, spin:rule or their sub-properties. The result set will contain the associated class, the predicate, and the SPIN rule.",
   :rdfs/label "SPIN Overview",
   :rdfs/subClassOf [:spin/SelectTemplates :spl/SPINOverview],
   :spin/body
   {:rdf/type :sp/Select,
    :sp/resultVariables
    [{:sp/varName "class"} {:sp/varName "property"} {:sp/varName "rule"}],
    :sp/where
    [[{:rdf/type    :sp/Union,
       :sp/elements [[{:rdf/type      :sp/Bind,
                       :sp/expression :spin/constraint,
                       :sp/variable   {:sp/varName "bp"}}]
                     [{:rdf/type      :sp/Bind,
                       :sp/expression :spin/constructor,
                       :sp/variable   {:sp/varName "bp"}}]
                     [{:rdf/type      :sp/Bind,
                       :sp/expression :spin/rule,
                       :sp/variable   {:sp/varName "bp"}}]]}]
     {:rdf/type   :sp/TriplePath,
      :sp/object  {:sp/varName "bp"},
      :sp/path    {:rdf/type   :sp/ModPath,
                   :sp/modMax  -2,
                   :sp/modMin  0,
                   :sp/subPath :rdfs/subPropertyOf},
      :sp/subject {:sp/varName "property"}}
     {:sp/object    {:sp/varName "rule"},
      :sp/predicate {:sp/varName "property"},
      :sp/subject   {:sp/varName "class"}}
     {:rdf/type      :sp/Filter,
      :sp/expression {:rdf/type [:sp/ne :spl/BooleanFunctions :spin/Functions],
                      :sp/arg1  {:sp/varName "class"},
                      :sp/arg2  :spin/Modules}}
     {:rdf/type      :sp/Filter,
      :sp/expression {:rdf/type    [:sp/notExists
                                    :spl/BooleanFunctions
                                    :spin/Functions],
                      :sp/elements [{:sp/object    :spl/Argument,
                                     :sp/predicate :rdf/type,
                                     :sp/subject   {:sp/varName "rule"}}]}}
     {:rdf/type      :sp/Filter,
      :sp/expression {:rdf/type    [:sp/notExists
                                    :spl/BooleanFunctions
                                    :spin/Functions],
                      :sp/elements [{:sp/object    :spl/Attribute,
                                     :sp/predicate :rdf/type,
                                     :sp/subject   {:sp/varName "rule"}}]}}]},
   :spin/labelTemplate "SPIN Overview"})

(def StringFunctions
  "A collection of functions that return strings."
  {:db/ident        :spl/StringFunctions,
   :rdf/type        :spin/Function,
   :rdfs/comment    "A collection of functions that return strings.",
   :rdfs/label      "String functions",
   :rdfs/subClassOf [:spin/Functions :spl/StringFunctions],
   :spin/abstract   true})

(def StringLengthPropertyConstraint
  "Represents a constraint that narrows down a property by a minimum and maximum length of the characters of the string representation of its values. This constraint is typically used for string literals, but may also be useful for integers (e.g. 4 digit numbers), and may even be used to limit the length of URIs."
  {:db/ident :spl/StringLengthPropertyConstraint,
   :rdf/type [:spl/ConstraintTemplate :spin/ConstructTemplate :rdfs/Resource],
   :rdfs/comment
   "Represents a constraint that narrows down a property by a minimum and maximum length of the characters of the string representation of its values. This constraint is typically used for string literals, but may also be useful for integers (e.g. 4 digit numbers), and may even be used to limit the length of URIs.",
   :rdfs/label "String length property constraint",
   :rdfs/subClassOf [:spl/PropertyConstraintTemplates
                     :spl/StringLengthPropertyConstraint
                     :spin/ConstructTemplates
                     :spl/ConstraintTemplates],
   :spin/body
   {:rdf/type :sp/Construct,
    :sp/templates [{:sp/object    :spin/ConstraintViolation,
                    :sp/predicate :rdf/type,
                    :sp/subject   :rdf/nil}
                   {:sp/object    :spin/_this,
                    :sp/predicate :spin/violationRoot,
                    :sp/subject   :rdf/nil}
                   {:sp/object    {:sp/varName "property"},
                    :sp/predicate :spin/violationPath,
                    :sp/subject   :rdf/nil}
                   {:sp/object    {:sp/varName "object"},
                    :sp/predicate :spin/violationValue,
                    :sp/subject   :rdf/nil}
                   {:sp/object    {:sp/varName "message"},
                    :sp/predicate :rdfs/label,
                    :sp/subject   :rdf/nil}],
    :sp/where [{:sp/object    {:sp/varName "object"},
                :sp/predicate {:sp/varName "property"},
                :sp/subject   :spin/_this}
               {:rdf/type      :sp/Bind,
                :sp/expression {:rdf/type [:sp/strlen
                                           :spl/StringFunctions
                                           :spin/Functions],
                                :sp/arg1  {:rdf/type [:sp/str
                                                      :spl/StringFunctions
                                                      :spin/Functions],
                                           :sp/arg1  {:sp/varName "object"}}},
                :sp/variable   {:sp/varName "length"}}
               {:rdf/type :sp/Filter,
                :sp/expression
                {:rdf/type [:sp/or :spin/Functions :spl/BooleanFunctions],
                 :sp/arg1  {:rdf/type [:sp/lt
                                       :spin/Functions
                                       :spl/BooleanFunctions],
                            :sp/arg1  {:sp/varName "length"},
                            :sp/arg2  {:rdf/type [:sp/coalesce
                                                  :spin/Functions
                                                  :spl/MiscFunctions],
                                       :sp/arg1  {:sp/varName "minLength"},
                                       :sp/arg2  0}},
                 :sp/arg2  {:rdf/type [:sp/and
                                       :spin/Functions
                                       :spl/BooleanFunctions],
                            :sp/arg1  {:rdf/type [:sp/bound
                                                  :spin/Functions
                                                  :spl/BooleanFunctions],
                                       :sp/arg1  {:sp/varName "maxLength"}},
                            :sp/arg2  {:rdf/type [:sp/gt
                                                  :spl/BooleanFunctions
                                                  :spin/Functions],
                                       :sp/arg1  {:sp/varName "length"},
                                       :sp/arg2  {:sp/varName "maxLength"}}}}}
               {:rdf/type      :sp/Bind,
                :sp/expression {:rdf/type [:sp/concat
                                           :spl/StringFunctions
                                           :spin/Functions],
                                :sp/arg1  "Value ",
                                :sp/arg2  {:rdf/type [:sp/str
                                                      :spl/StringFunctions
                                                      :spin/Functions],
                                           :sp/arg1  {:sp/varName "object"}},
                                :sp/arg3  " must have between ",
                                :sp/arg4  {:rdf/type [:sp/str
                                                      :spl/StringFunctions
                                                      :spin/Functions],
                                           :sp/arg1  {:sp/varName "minLength"}},
                                :sp/arg5  " and ",
                                :sp/arg6  {:rdf/type [:sp/str
                                                      :spl/StringFunctions
                                                      :spin/Functions],
                                           :sp/arg1  {:sp/varName "maxLength"}},
                                :sp/arg7  " characters"},
                :sp/variable   {:sp/varName "message"}}]},
   :spin/constraint
   [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "The maximum number of characters (defaults to unlimited).",
     :sp/arg        [:xsd/integer :arg/maxLength true],
     :spl/optional  true,
     :spl/predicate :arg/maxLength,
     :spl/valueType :xsd/integer}
    {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "The minimum number of characters (default to 0).",
     :sp/arg        [:xsd/integer :arg/minLength true],
     :spl/optional  true,
     :spl/predicate :arg/minLength,
     :spl/valueType :xsd/integer}],
   :spin/labelTemplate
   "Values of {?property} must have between {?minLength} and {?maxLength} characters"})

(def Test-instanceOf-lingualString
  {:db/ident       :spl/Test-instanceOf-lingualString,
   :rdf/type       [:spl/TestCase :rdfs/Resource],
   :sp/arg         [true
                    {:rdf/type [:spl/instanceOf
                                :spin/Functions
                                :spl/BooleanFunctions],
                     :sp/arg1  #voc/lstr "test@en",
                     :sp/arg2  :xsd/string}],
   :spl/testExpression
   {:rdf/type [:spl/instanceOf :spin/Functions :spl/BooleanFunctions],
    :sp/arg1  #voc/lstr "test@en",
    :sp/arg2  :xsd/string},
   :spl/testResult true})

(def Test-instanceOf-rdfsClass
  {:db/ident       :spl/Test-instanceOf-rdfsClass,
   :rdf/type       [:spl/TestCase :rdfs/Resource],
   :sp/arg         [true
                    {:rdf/type [:spl/instanceOf
                                :spin/Functions
                                :spl/BooleanFunctions],
                     :sp/arg1  :owl/Thing,
                     :sp/arg2  :rdfs/Class}],
   :spl/testExpression
   {:rdf/type [:spl/instanceOf :spin/Functions :spl/BooleanFunctions],
    :sp/arg1  :owl/Thing,
    :sp/arg2  :rdfs/Class},
   :spl/testResult true})

(def Test-instanceOf-rdfsClass-false
  {:db/ident       :spl/Test-instanceOf-rdfsClass-false,
   :rdf/type       [:spl/TestCase :rdfs/Resource],
   :sp/arg         [false
                    {:rdf/type [:spl/instanceOf
                                :spin/Functions
                                :spl/BooleanFunctions],
                     :sp/arg1  :owl/versionInfo,
                     :sp/arg2  :rdfs/Class}],
   :spl/testExpression
   {:rdf/type [:spl/instanceOf :spin/Functions :spl/BooleanFunctions],
    :sp/arg1  :owl/versionInfo,
    :sp/arg2  :rdfs/Class},
   :spl/testResult false})

(def Test-instanceOf-rdfsClassInheritance
  {:db/ident       :spl/Test-instanceOf-rdfsClassInheritance,
   :rdf/type       [:spl/TestCase :rdfs/Resource],
   :sp/arg         [true
                    {:rdf/type [:spl/instanceOf
                                :spin/Functions
                                :spl/BooleanFunctions],
                     :sp/arg1  :owl/Restriction,
                     :sp/arg2  :rdfs/Class}],
   :spl/testExpression
   {:rdf/type [:spl/instanceOf :spin/Functions :spl/BooleanFunctions],
    :sp/arg1  :owl/Restriction,
    :sp/arg2  :rdfs/Class},
   :spl/testResult true})

(def Test-instanceOf-rdfsLiteral
  {:db/ident       :spl/Test-instanceOf-rdfsLiteral,
   :rdf/type       [:spl/TestCase :rdfs/Resource],
   :sp/arg         [true
                    {:rdf/type [:spl/instanceOf
                                :spin/Functions
                                :spl/BooleanFunctions],
                     :sp/arg1  "test",
                     :sp/arg2  :rdfs/Literal}],
   :spl/testExpression
   {:rdf/type [:spl/instanceOf :spin/Functions :spl/BooleanFunctions],
    :sp/arg1  "test",
    :sp/arg2  :rdfs/Literal},
   :spl/testResult true})

(def Test-instanceOf-rdfsLiteral-false
  {:db/ident       :spl/Test-instanceOf-rdfsLiteral-false,
   :rdf/type       [:spl/TestCase :rdfs/Resource],
   :sp/arg         [false
                    {:rdf/type [:spl/instanceOf
                                :spin/Functions
                                :spl/BooleanFunctions],
                     :sp/arg1  :owl/Thing,
                     :sp/arg2  :rdfs/Literal}],
   :spl/testExpression
   {:rdf/type [:spl/instanceOf :spin/Functions :spl/BooleanFunctions],
    :sp/arg1  :owl/Thing,
    :sp/arg2  :rdfs/Literal},
   :spl/testResult false})

(def Test-instanceOf-typedString
  {:db/ident       :spl/Test-instanceOf-typedString,
   :rdf/type       [:spl/TestCase :rdfs/Resource],
   :sp/arg         [true
                    {:rdf/type [:spl/instanceOf
                                :spin/Functions
                                :spl/BooleanFunctions],
                     :sp/arg1  "test",
                     :sp/arg2  :xsd/string}],
   :spl/testExpression
   {:rdf/type [:spl/instanceOf :spin/Functions :spl/BooleanFunctions],
    :sp/arg1  "test",
    :sp/arg2  :xsd/string},
   :spl/testResult true})

(def Test-instanceOf-typedString-false
  {:db/ident       :spl/Test-instanceOf-typedString-false,
   :rdf/type       [:spl/TestCase :rdfs/Resource],
   :sp/arg         [false
                    {:rdf/type [:spl/instanceOf
                                :spin/Functions
                                :spl/BooleanFunctions],
                     :sp/arg1  "test",
                     :sp/arg2  :xsd/integer}],
   :spl/testExpression
   {:rdf/type [:spl/instanceOf :spin/Functions :spl/BooleanFunctions],
    :sp/arg1  "test",
    :sp/arg2  :xsd/integer},
   :spl/testResult false})

(def Test-instanceOf-untypedString
  {:db/ident       :spl/Test-instanceOf-untypedString,
   :rdf/type       [:spl/TestCase :rdfs/Resource],
   :sp/arg         [true
                    {:rdf/type [:spl/instanceOf
                                :spin/Functions
                                :spl/BooleanFunctions],
                     :sp/arg1  "test",
                     :sp/arg2  :xsd/string}],
   :spl/testExpression
   {:rdf/type [:spl/instanceOf :spin/Functions :spl/BooleanFunctions],
    :sp/arg1  "test",
    :sp/arg2  :xsd/string},
   :spl/testResult true})

(def Test-object-labelOfArgument
  {:db/ident       :spl/Test-object-labelOfArgument,
   :rdf/type       [:spl/TestCase :rdfs/Resource],
   :sp/arg         ["Argument"
                    {:rdf/type :sp/Select,
                     :sp/resultVariables [{:sp/varName "value"}],
                     :sp/where [{:rdf/type         :sp/NamedGraph,
                                 :sp/elements      [{:rdf/type :sp/Bind,
                                                     :sp/expression
                                                     {:rdf/type
                                                      [:spl/object
                                                       :spin/Functions
                                                       :spl/OntologyFunctions],
                                                      :sp/arg1 :spl/Argument,
                                                      :sp/arg2 :rdfs/label},
                                                     :sp/variable {:sp/varName
                                                                   "value"}}],
                                 :sp/graphNameNode "http://spinrdf.org/spl"}]}],
   :spl/testExpression
   {:rdf/type :sp/Select,
    :sp/resultVariables [{:sp/varName "value"}],
    :sp/where [{:rdf/type         :sp/NamedGraph,
                :sp/elements      [{:rdf/type      :sp/Bind,
                                    :sp/expression {:rdf/type
                                                    [:spl/object
                                                     :spin/Functions
                                                     :spl/OntologyFunctions],
                                                    :sp/arg1 :spl/Argument,
                                                    :sp/arg2 :rdfs/label},
                                    :sp/variable   {:sp/varName "value"}}],
                :sp/graphNameNode "http://spinrdf.org/spl"}]},
   :spl/testResult "Argument"})

(def Test-object-noValue
  {:db/ident :spl/Test-object-noValue,
   :rdf/type [:spl/TestCase :rdfs/Resource],
   :sp/arg   {:rdf/type [:spl/object :spin/Functions :spl/OntologyFunctions],
              :sp/arg1  :owl/versionInfo,
              :sp/arg2  :owl/versionInfo},
   :spl/testExpression
   {:rdf/type [:spl/object :spin/Functions :spl/OntologyFunctions],
    :sp/arg1  :owl/versionInfo,
    :sp/arg2  :owl/versionInfo}})

(def TestCase
  "A test to verify that a SPIN function or magic property works as expected, and to generate documentation of example uses of the function. Each TestCase consists of a SPARQL function call or an expression that can be executed with spin:eval, and an expected result. The test framework only needs to execute spin:eval on the expression and compare it with the expected result."
  {:db/ident :spl/TestCase,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A test to verify that a SPIN function or magic property works as expected, and to generate documentation of example uses of the function. Each TestCase consists of a SPARQL function call or an expression that can be executed with spin:eval, and an expected result. The test framework only needs to execute spin:eval on the expression and compare it with the expected result.",
   :rdfs/label "Test case",
   :rdfs/subClassOf [:rdfs/Resource :spl/TestCase],
   :spin/constraint
   [{:rdf/type [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment
     "The expected result of the test case, or nothing to indicate that an error is expected.",
     :sp/arg [:spl/testResult true],
     :spl/optional true,
     :spl/predicate :spl/testResult}
    {:rdf/type [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment
     "The test expression or SELECT query (anything that can be evaluated with spin:eval).",
     :sp/arg :spl/testExpression,
     :spl/predicate :spl/testExpression}]})

(def TypePropertyConstraint
  "Represents a constraint that narrows down the rdf:type of the values of a property."
  {:db/ident :spl/TypePropertyConstraint,
   :rdf/type [:spl/ConstraintTemplate :spin/ConstructTemplate :rdfs/Resource],
   :rdfs/comment
   "Represents a constraint that narrows down the rdf:type of the values of a property.",
   :rdfs/label "Type property constraint",
   :rdfs/subClassOf [:spl/PropertyConstraintTemplates
                     :spl/TypePropertyConstraint
                     :spin/ConstructTemplates
                     :spl/ConstraintTemplates],
   :spin/body {:rdf/type :sp/Construct,
               :sp/templates [{:sp/object    :spin/ConstraintViolation,
                               :sp/predicate :rdf/type,
                               :sp/subject   :rdf/nil}
                              {:sp/object    :spin/_this,
                               :sp/predicate :spin/violationRoot,
                               :sp/subject   :rdf/nil}
                              {:sp/object    {:sp/varName "property"},
                               :sp/predicate :spin/violationPath,
                               :sp/subject   :rdf/nil}
                              {:sp/object    {:sp/varName "object"},
                               :sp/predicate :spin/violationValue,
                               :sp/subject   :rdf/nil}
                              {:sp/object    {:sp/varName "message"},
                               :sp/predicate :rdfs/label,
                               :sp/subject   :rdf/nil}],
               :sp/where
               [{:sp/object    {:sp/varName "object"},
                 :sp/predicate {:sp/varName "property"},
                 :sp/subject   :spin/_this}
                {:rdf/type      :sp/Filter,
                 :sp/expression {:rdf/type [:sp/not
                                            :spin/Functions
                                            :spl/BooleanFunctions],
                                 :sp/arg1  {:rdf/type [:spl/instanceOf
                                                       :spin/Functions
                                                       :spl/BooleanFunctions],
                                            :sp/arg1  {:sp/varName "object"},
                                            :sp/arg2  {:sp/varName "type"}}}}
                {:rdf/type      :sp/Bind,
                 :sp/expression {:rdf/type [:sp/concat
                                            :spl/StringFunctions
                                            :spin/Functions],
                                 :sp/arg1  "Value ",
                                 :sp/arg2  {:rdf/type [:sp/str
                                                       :spl/StringFunctions
                                                       :spin/Functions],
                                            :sp/arg1  {:sp/varName "object"}},
                                 :sp/arg3  " must have the type ",
                                 :sp/arg4  {:rdf/type [:sp/str
                                                       :spl/StringFunctions
                                                       :spin/Functions],
                                            :sp/arg1  {:sp/varName "type"}}},
                 :sp/variable   {:sp/varName "message"}}]},
   :spin/constraint
   {:rdf/type [:spl/Argument :spin/ConstructTemplates],
    :rdfs/comment
    "The class that the values must have as their rdf:type (or a subclass thereof).",
    :sp/arg [:rdfs/Class :arg/type],
    :spl/predicate :arg/type,
    :spl/valueType :rdfs/Class},
   :spin/labelTemplate "Values of {?property} must have the type {?type}"})

(def URIFunctions
  "A collection of functions that create URI resources."
  {:db/ident        :spl/URIFunctions,
   :rdf/type        :spin/Function,
   :rdfs/comment    "A collection of functions that create URI resources.",
   :rdfs/label      "URI functions",
   :rdfs/subClassOf [:spin/Functions :spl/URIFunctions],
   :spin/abstract   true})

(def UnionTemplate
  "This type can be used for templates that serve as the union (or \"collector\") of other templates. Union templates differ from other templates in that all spl:Arguments are optional. This means that union templates can be declared as subclasses of multiple other templates, yet when instantiated, only some of the arguments defined by the superclasses need to be filled in."
  {:db/ident :spl/UnionTemplate,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "This type can be used for templates that serve as the union (or \"collector\") of other templates. Union templates differ from other templates in that all spl:Arguments are optional. This means that union templates can be declared as subclasses of multiple other templates, yet when instantiated, only some of the arguments defined by the superclasses need to be filled in.",
   :rdfs/label "Union template",
   :rdfs/subClassOf [:rdfs/Resource :spin/Template :spl/UnionTemplate]})

(def UniquePropertyValueConstraint
  "Reports an error if the given property has a value that is also used elsewhere, for the same property."
  {:db/ident :spl/UniquePropertyValueConstraint,
   :rdf/type [:spl/ConstraintTemplate :spin/ConstructTemplate :rdfs/Resource],
   :rdfs/comment
   "Reports an error if the given property has a value that is also used elsewhere, for the same property.",
   :rdfs/label "Unique property value constraint",
   :rdfs/subClassOf [:spl/PropertyConstraintTemplates
                     :spl/UniquePropertyValueConstraint
                     :spin/ConstructTemplates
                     :spl/ConstraintTemplates],
   :spin/body
   {:rdf/type :sp/Construct,
    :sp/templates [{:sp/object    :spin/ConstraintViolation,
                    :sp/predicate :rdf/type,
                    :sp/subject   :rdf/nil}
                   {:sp/object    {:sp/varName "label"},
                    :sp/predicate :rdfs/label,
                    :sp/subject   :rdf/nil}
                   {:sp/object    :spin/_this,
                    :sp/predicate :spin/violationRoot,
                    :sp/subject   :rdf/nil}
                   {:sp/object    {:sp/varName "property"},
                    :sp/predicate :spin/violationPath,
                    :sp/subject   :rdf/nil}
                   {:sp/object    {:sp/varName "value"},
                    :sp/predicate :spin/violationValue,
                    :sp/subject   :rdf/nil}],
    :sp/where
    [{:sp/object    {:sp/varName "value"},
      :sp/predicate {:sp/varName "property"},
      :sp/subject   :spin/_this}
     {:rdf/type      :sp/Filter,
      :sp/expression {:rdf/type    [:sp/exists
                                    :spl/BooleanFunctions
                                    :spin/Functions],
                      :sp/elements [{:sp/object    {:sp/varName "value"},
                                     :sp/predicate {:sp/varName "property"},
                                     :sp/subject   {:sp/varName "other"}}
                                    {:rdf/type      :sp/Filter,
                                     :sp/expression {:rdf/type
                                                     [:sp/ne
                                                      :spl/BooleanFunctions
                                                      :spin/Functions],
                                                     :sp/arg1 :spin/_this,
                                                     :sp/arg2 {:sp/varName
                                                               "other"}}}]}}
     {:rdf/type      :sp/Bind,
      :sp/expression {:rdf/type [:sp/concat
                                 :spl/StringFunctions
                                 :spin/Functions],
                      :sp/arg1  "Property must have a unique value, but ",
                      :sp/arg2  {:rdf/type [:sp/str
                                            :spl/StringFunctions
                                            :spin/Functions],
                                 :sp/arg1  {:sp/varName "value"}},
                      :sp/arg3  "  already exists elsewhere. "},
      :sp/variable   {:sp/varName "label"}}]},
   :spin/labelTemplate "Values of {?property} must be unique"})

(def UntypedObjectPropertyConstraint
  "A generic SPIN template that can be used to declare a constraint that all values of a given property must have an rdf:type."
  {:db/ident :spl/UntypedObjectPropertyConstraint,
   :rdf/type [:spl/ConstraintTemplate :spin/ConstructTemplate :rdfs/Resource],
   :rdfs/comment
   "A generic SPIN template that can be used to declare a constraint that all values of a given property must have an rdf:type.",
   :rdfs/label "Untyped object property constraint",
   :rdfs/subClassOf [:spl/PropertyConstraintTemplates
                     :spl/UntypedObjectPropertyConstraint
                     :spin/ConstructTemplates
                     :spl/ConstraintTemplates],
   :spin/body
   {:rdf/type     :sp/Construct,
    :sp/templates [{:sp/object    :spin/ConstraintViolation,
                    :sp/predicate :rdf/type,
                    :sp/subject   :rdf/nil}
                   {:sp/object    :spin/_this,
                    :sp/predicate :spin/violationRoot,
                    :sp/subject   :rdf/nil}
                   {:sp/object    {:sp/varName "property"},
                    :sp/predicate :spin/violationPath,
                    :sp/subject   :rdf/nil}
                   {:sp/object    {:sp/varName "message"},
                    :sp/predicate :rdfs/label,
                    :sp/subject   :rdf/nil}],
    :sp/where     [{:sp/object    {:sp/varName "object"},
                    :sp/predicate {:sp/varName "property"},
                    :sp/subject   :spin/_this}
                   {:rdf/type      :sp/Filter,
                    :sp/expression {:rdf/type    [:sp/notExists
                                                  :spl/BooleanFunctions
                                                  :spin/Functions],
                                    :sp/elements [{:sp/object    {:sp/varName
                                                                  "anyType"},
                                                   :sp/predicate :rdf/type,
                                                   :sp/subject   {:sp/varName
                                                                  "object"}}]}}
                   {:rdf/type      :sp/Bind,
                    :sp/expression {:rdf/type [:sp/concat
                                               :spl/StringFunctions
                                               :spin/Functions],
                                    :sp/arg1  "Value ",
                                    :sp/arg2  {:rdf/type [:sp/str
                                                          :spl/StringFunctions
                                                          :spin/Functions],
                                               :sp/arg1  {:sp/varName
                                                          "object"}},
                                    :sp/arg3  " must have a type"},
                    :sp/variable   {:sp/varName "message"}}]},
   :spin/labelTemplate "Values of {?property} must have a type"})

(def class
  "class"
  {:db/ident           :spl/class,
   :rdf/type           :rdf/Property,
   :rdfs/label         "class",
   :rdfs/subPropertyOf [:sp/arg :spl/class]})

(def count
  "count"
  {:db/ident           :spl/count,
   :rdf/type           :rdf/Property,
   :rdfs/label         "count",
   :rdfs/subPropertyOf [:sp/arg :spl/count]})

(def defaultValue
  "default value"
  {:db/ident           :spl/defaultValue,
   :rdf/type           :rdf/Property,
   :rdfs/label         "default value",
   :rdfs/subPropertyOf [:sp/arg :spl/defaultValue]})

(def hasArgument
  "Checks if a given module class (?module) has at least one declared spl:Argument."
  {:db/ident :spl/hasArgument,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Checks if a given module class (?module) has at least one declared spl:Argument.",
   :rdfs/label "has argument",
   :rdfs/subClassOf [:spl/BooleanFunctions :spl/hasArgument :spin/Functions],
   :spin/body {:rdf/type :sp/Ask,
               :sp/where [{:rdf/type   :sp/TriplePath,
                           :sp/object  {:sp/varName "superClass"},
                           :sp/path    {:rdf/type   :sp/ModPath,
                                        :sp/modMax  -2,
                                        :sp/modMin  0,
                                        :sp/subPath :rdfs/subClassOf},
                           :sp/subject {:sp/varName "class"}}
                          {:sp/object    {:sp/varName "con"},
                           :sp/predicate :spin/constraint,
                           :sp/subject   {:sp/varName "superClass"}}
                          {:sp/object    :spl/Argument,
                           :sp/predicate :rdf/type,
                           :sp/subject   {:sp/varName "con"}}]},
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The module class to check.",
                     :sp/arg        [:spin/Module :spl/class],
                     :spl/predicate :spl/class,
                     :spl/valueType :spin/Module},
   :spin/returnType :xsd/boolean})

(def hasPrimaryKey
  "Checks if a given class has a declared primary key, using spl:PrimaryKeyPropertyConstraint."
  {:db/ident :spl/hasPrimaryKey,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Checks if a given class has a declared primary key, using spl:PrimaryKeyPropertyConstraint.",
   :rdfs/label "has primary key",
   :rdfs/subClassOf [:spl/OntologyFunctions :spl/hasPrimaryKey :spin/Functions],
   :spin/body {:rdf/type :sp/Ask,
               :sp/where [{:rdf/type      :sp/Bind,
                           :sp/expression {:arg/class {:sp/varName "class"},
                                           :rdf/type  [:spl/primaryKeyProperty
                                                       :spl/OntologyFunctions
                                                       :spin/Functions],
                                           :sp/arg    {:sp/varName "class"}},
                           :sp/variable   {:sp/varName "primaryKey"}}
                          {:rdf/type      :sp/Filter,
                           :sp/expression {:rdf/type [:sp/bound
                                                      :spin/Functions
                                                      :spl/BooleanFunctions],
                                           :sp/arg1  {:sp/varName
                                                      "primaryKey"}}}]},
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The class to get the primary key of.",
                     :sp/arg        [:rdfs/Class :arg/class],
                     :spl/predicate :arg/class,
                     :spl/valueType :rdfs/Class},
   :spin/returnType :xsd/boolean})

(def hasValue
  "Checks whether a given resource (?arg1) has a given value (?arg3) for a given property (?arg2) or one of the sub-properties of it."
  {:db/ident :spl/hasValue,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Checks whether a given resource (?arg1) has a given value (?arg3) for a given property (?arg2) or one of the sub-properties of it.",
   :rdfs/label "hasValue",
   :rdfs/subClassOf [:spl/BooleanFunctions :spl/hasValue :spin/Functions],
   :spin/body {:rdf/type :sp/Ask,
               :sp/where [{:rdf/type   :sp/TriplePath,
                           :sp/object  :spin/_arg2,
                           :sp/path    {:rdf/type   :sp/ModPath,
                                        :sp/modMax  -2,
                                        :sp/modMin  0,
                                        :sp/subPath :rdfs/subPropertyOf},
                           :sp/subject {:sp/varName "p"}}
                          {:sp/object    :spin/_arg3,
                           :sp/predicate {:sp/varName "p"},
                           :sp/subject   :spin/_arg1}]},
   :spin/constraint
   [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "the subject that is expected to have the value",
     :sp/arg        [:rdfs/Resource :sp/arg1],
     :spl/predicate :sp/arg1,
     :spl/valueType :rdfs/Resource}
    {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "the property that is expected to hold the value",
     :sp/arg        [:rdf/Property :sp/arg2],
     :spl/predicate :sp/arg2,
     :spl/valueType :rdf/Property}
    {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "the expected value",
     :sp/arg        :sp/arg3,
     :spl/predicate :sp/arg3}],
   :spin/returnType :xsd/boolean})

(def hasValueOfType
  "Checks whether a given subject (?arg1) has at least one value of a given type (?arg3) for a given property (?arg2) or one of its sub-properties."
  {:db/ident :spl/hasValueOfType,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Checks whether a given subject (?arg1) has at least one value of a given type (?arg3) for a given property (?arg2) or one of its sub-properties.",
   :rdfs/label "hasValueOfType",
   :rdfs/subClassOf [:spl/BooleanFunctions :spl/hasValueOfType :spin/Functions],
   :spin/body {:rdf/type :sp/Ask,
               :sp/where [{:rdf/type   :sp/TriplePath,
                           :sp/object  :spin/_arg2,
                           :sp/path    {:rdf/type   :sp/ModPath,
                                        :sp/modMax  -2,
                                        :sp/modMin  0,
                                        :sp/subPath :rdfs/subPropertyOf},
                           :sp/subject {:sp/varName "p"}}
                          {:sp/object    {:sp/varName "value"},
                           :sp/predicate {:sp/varName "p"},
                           :sp/subject   :spin/_arg1}
                          {:rdf/type      :sp/Filter,
                           :sp/expression {:rdf/type [:spl/instanceOf
                                                      :spin/Functions
                                                      :spl/BooleanFunctions],
                                           :sp/arg1  {:sp/varName "value"},
                                           :sp/arg2  :spin/_arg3}}]},
   :spin/constraint [{:rdf/type [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment
                      "the subject that is expected to have the value",
                      :sp/arg [:rdfs/Resource :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdfs/Resource}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the expected property",
                      :sp/arg        [:rdf/Property :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :rdf/Property}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the type to match against",
                      :sp/arg        [:rdfs/Class :sp/arg3],
                      :spl/predicate :sp/arg3,
                      :spl/valueType :rdfs/Class}],
   :spin/returnType :xsd/boolean})

(def instance
  "instance"
  {:db/ident           :spl/instance,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :sp/ModuleCall,
   :rdfs/label         "instance",
   :rdfs/subPropertyOf [:sp/arg :spl/instance]})

(def instanceOf
  "Checks whether a given resource (?arg1) has a given type (?arg2). In order to fulfill this condition, there must either be a triple ?arg1 rdf:type ?arg2, or ?instance rdf:type ?subClass where ?subClass is a subclass of ?arg2. If the first argument is a literal, then the second argument must be the matching XSD datatype."
  {:db/ident :spl/instanceOf,
   :owl/versionInfo
   "Note that in TopBraid this function has been implemented in native Java code, for performance reasons.",
   :rdf/type :spin/Function,
   :rdfs/comment
   "Checks whether a given resource (?arg1) has a given type (?arg2). In order to fulfill this condition, there must either be a triple ?arg1 rdf:type ?arg2, or ?instance rdf:type ?subClass where ?subClass is a subclass of ?arg2. If the first argument is a literal, then the second argument must be the matching XSD datatype.",
   :rdfs/label "instanceOf",
   :rdfs/subClassOf [:spl/BooleanFunctions :spl/instanceOf :spin/Functions],
   :spin/body
   {:rdf/type :sp/Ask,
    :sp/where
    [{:rdf/type :sp/Union,
      :sp/elements
      [[[{:rdf/type      :sp/Filter,
          :sp/expression {:rdf/type [:sp/or
                                     :spin/Functions
                                     :spl/BooleanFunctions],
                          :sp/arg1  {:rdf/type [:sp/isIRI
                                                :spin/Functions
                                                :spl/BooleanFunctions],
                                     :sp/arg1  :spin/_arg1},
                          :sp/arg2  {:rdf/type [:sp/isBlank
                                                :spin/Functions
                                                :spl/BooleanFunctions],
                                     :sp/arg1  :spin/_arg1}}}]
        {:rdf/type   :sp/TriplePath,
         :sp/object  :spin/_arg2,
         :sp/path    {:rdf/type   :sp/ModPath,
                      :sp/modMax  -2,
                      :sp/modMin  0,
                      :sp/subPath :rdfs/subClassOf},
         :sp/subject {:sp/varName "class"}}
        {:sp/object    {:sp/varName "class"},
         :sp/predicate :rdf/type,
         :sp/subject   :spin/_arg1}]
       [[{:rdf/type      :sp/Filter,
          :sp/expression {:rdf/type [:sp/isLiteral
                                     :spin/Functions
                                     :spl/BooleanFunctions],
                          :sp/arg1  :spin/_arg1}}]
        {:rdf/type      :sp/Bind,
         :sp/expression {:rdf/type [:sp/datatype
                                    :spin/Functions
                                    :spl/OntologyFunctions],
                         :sp/arg1  :spin/_arg1},
         :sp/variable   {:sp/varName "datatype"}}
        {:rdf/type :sp/Filter,
         :sp/expression
         {:rdf/type [:sp/or :spin/Functions :spl/BooleanFunctions],
          :sp/arg1  {:rdf/type [:sp/or :spin/Functions :spl/BooleanFunctions],
                     :sp/arg1  {:rdf/type [:sp/eq
                                           :spl/BooleanFunctions
                                           :spin/Functions],
                                :sp/arg1  {:sp/varName "datatype"},
                                :sp/arg2  :spin/_arg2},
                     :sp/arg2  {:rdf/type [:sp/eq
                                           :spl/BooleanFunctions
                                           :spin/Functions],
                                :sp/arg1  :spin/_arg2,
                                :sp/arg2  :rdfs/Literal}},
          :sp/arg2  {:rdf/type [:sp/and :spin/Functions :spl/BooleanFunctions],
                     :sp/arg1  {:rdf/type [:sp/or
                                           :spin/Functions
                                           :spl/BooleanFunctions],
                                :sp/arg1  {:rdf/type [:sp/not
                                                      :spin/Functions
                                                      :spl/BooleanFunctions],
                                           :sp/arg1  {:rdf/type
                                                      [:sp/bound
                                                       :spin/Functions
                                                       :spl/BooleanFunctions],
                                                      :sp/arg1 {:sp/varName
                                                                "datatype"}}},
                                :sp/arg2  {:rdf/type [:sp/eq
                                                      :spl/BooleanFunctions
                                                      :spin/Functions],
                                           :sp/arg1  :rdf/langString,
                                           :sp/arg2  {:sp/varName "datatype"}}},
                     :sp/arg2  {:rdf/type [:sp/eq
                                           :spl/BooleanFunctions
                                           :spin/Functions],
                                :sp/arg1  :spin/_arg2,
                                :sp/arg2  :xsd/string}}}}]]}]},
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the type that the instance must have",
                      :sp/arg        [:rdfs/Class :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :rdfs/Class}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the instance being tested",
                      :sp/arg        [:rdfs/Resource :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdfs/Resource}],
   :spin/labelTemplate "{?arg1} instance of {?arg2}",
   :spin/returnType :xsd/boolean})

(def isPrimaryKeyPropertyOfInstance
  "Checks if a given property is the primary key of a given instance."
  {:db/ident :spl/isPrimaryKeyPropertyOfInstance,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Checks if a given property is the primary key of a given instance.",
   :rdfs/label "is primary key property of instance",
   :rdfs/subClassOf
   [:spl/OntologyFunctions :spl/isPrimaryKeyPropertyOfInstance :spin/Functions],
   :spin/body {:rdf/type :sp/Ask,
               :sp/where [{:sp/object    {:sp/varName "type"},
                           :sp/predicate :rdf/type,
                           :sp/subject   {:sp/varName "instance"}}
                          {:rdf/type      :sp/Bind,
                           :sp/expression {:arg/class {:sp/varName "type"},
                                           :rdf/type  [:spl/primaryKeyProperty
                                                       :spl/OntologyFunctions
                                                       :spin/Functions],
                                           :sp/arg    {:sp/varName "type"}},
                           :sp/variable   {:sp/varName "pk"}}
                          {:rdf/type      :sp/Filter,
                           :sp/expression {:rdf/type [:sp/eq
                                                      :spl/BooleanFunctions
                                                      :spin/Functions],
                                           :sp/arg1  {:sp/varName "property"},
                                           :sp/arg2  {:sp/varName "pk"}}}]},
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The instance to check.",
                      :sp/arg        [:rdfs/Resource :arg/instance],
                      :spl/predicate :arg/instance,
                      :spl/valueType :rdfs/Resource}
                     {:rdf/type [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment
                      "The property that may or may not be the primary key.",
                      :sp/arg [:rdf/Property :arg/property],
                      :spl/predicate :arg/property,
                      :spl/valueType :rdf/Property}],
   :spin/returnType :xsd/boolean})

(def isUntypedLiteral
  "Checks whether a given literal is untyped. This function was introduced because the built-in datatype operand in SPARQL casts untyped literals to xsd:string, making it impossible to check it this way. This function here uses a work-around using sameTerm instead."
  {:db/ident :spl/isUntypedLiteral,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Checks whether a given literal is untyped. This function was introduced because the built-in datatype operand in SPARQL casts untyped literals to xsd:string, making it impossible to check it this way. This function here uses a work-around using sameTerm instead.",
   :rdfs/label "isUntypedLiteral",
   :rdfs/subClassOf
   [:spl/BooleanFunctions :spl/isUntypedLiteral :spin/Functions],
   :spin/body
   {:rdf/type :sp/Ask,
    :sp/where [{:rdf/type      :sp/Filter,
                :sp/expression {:rdf/type [:sp/and
                                           :spin/Functions
                                           :spl/BooleanFunctions],
                                :sp/arg1  {:rdf/type [:sp/isLiteral
                                                      :spin/Functions
                                                      :spl/BooleanFunctions],
                                           :sp/arg1  :spin/_arg1},
                                :sp/arg2  {:rdf/type [:sp/not
                                                      :spin/Functions
                                                      :spl/BooleanFunctions],
                                           :sp/arg1  {:rdf/type
                                                      [:sp/sameTerm
                                                       :spin/Functions
                                                       :spl/BooleanFunctions],
                                                      :sp/arg1 :spin/_arg1,
                                                      :sp/arg2
                                                      {:rdf/type :xsd/string,
                                                       :sp/arg1
                                                       :spin/_arg1}}}}}]},
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The literal to test.",
                     :sp/arg        [:rdfs/Literal :sp/arg1],
                     :spl/predicate :sp/arg1,
                     :spl/valueType :rdfs/Literal},
   :spin/returnType :xsd/boolean})

(def max
  "Takes two arguments and returns the larger one of them."
  {:db/ident        :spl/max,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Takes two arguments and returns the larger one of them.",
   :rdfs/label      "max",
   :rdfs/subClassOf [:spl/MathematicalFunctions :spl/max :spin/Functions],
   :spin/body       {:rdf/type :sp/Select,
                     :sp/resultVariables [{:sp/varName "result"}],
                     :sp/where [{:rdf/type      :sp/Bind,
                                 :sp/expression {:rdf/type [:sp/if
                                                            :spin/Functions
                                                            :spl/MiscFunctions],
                                                 :sp/arg1
                                                 {:rdf/type
                                                  [:sp/gt
                                                   :spl/BooleanFunctions
                                                   :spin/Functions],
                                                  :sp/arg1 :spin/_arg1,
                                                  :sp/arg2 :spin/_arg2},
                                                 :sp/arg2 :spin/_arg1,
                                                 :sp/arg3 :spin/_arg2},
                                 :sp/variable   {:sp/varName "result"}}]},
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The first argument.",
                      :sp/arg        [:rdfs/Literal :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdfs/Literal}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The second argument.",
                      :sp/arg        [:rdfs/Literal :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :rdfs/Literal}],
   :spin/returnType :rdfs/Literal})

(def maxCount
  {:db/ident :spl/maxCount,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf [:spl/count :spl/maxCount :sp/arg]})

(def min
  "Takes two arguments and returns the smaller one of them."
  {:db/ident        :spl/min,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Takes two arguments and returns the smaller one of them.",
   :rdfs/label      "min",
   :rdfs/subClassOf [:spl/MathematicalFunctions :spl/min :spin/Functions],
   :spin/body       {:rdf/type :sp/Select,
                     :sp/resultVariables [{:sp/varName "result"}],
                     :sp/where [{:rdf/type      :sp/Bind,
                                 :sp/expression {:rdf/type [:sp/if
                                                            :spin/Functions
                                                            :spl/MiscFunctions],
                                                 :sp/arg1
                                                 {:rdf/type
                                                  [:sp/lt
                                                   :spin/Functions
                                                   :spl/BooleanFunctions],
                                                  :sp/arg1 :spin/_arg1,
                                                  :sp/arg2 :spin/_arg2},
                                                 :sp/arg2 :spin/_arg1,
                                                 :sp/arg3 :spin/_arg2},
                                 :sp/variable   {:sp/varName "result"}}]},
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The first argument.",
                      :sp/arg        [:rdfs/Literal :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdfs/Literal}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The second argument.",
                      :sp/arg        [:rdfs/Literal :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :rdfs/Literal}],
   :spin/returnType :rdfs/Literal})

(def minCount
  {:db/ident :spl/minCount,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf [:spl/count :spl/minCount :sp/arg]})

(def object
  "Gets the object of a given subject (?arg1) / predicate (?arg2) combination. Note that if multiple values are present then the result might be unpredictably random. Furthermore, if one of the arguments is unbound, it will return the first match of the resulting SPO pattern. These scenarios are strongly discouraged but remain left supported for backward compatibility reasons."
  {:db/ident :spl/object,
   :owl/versionInfo
   "Note that in TopBraid this function has been implemented in native Java code, for performance reasons.",
   :rdf/type :spin/Function,
   :rdfs/comment
   "Gets the object of a given subject (?arg1) / predicate (?arg2) combination.\n\nNote that if multiple values are present then the result might be unpredictably random. Furthermore, if one of the arguments is unbound, it will return the first match of the resulting SPO pattern. These scenarios are strongly discouraged but remain left supported for backward compatibility reasons.",
   :rdfs/label "object",
   :rdfs/subClassOf [:spl/OntologyFunctions :spl/object :spin/Functions],
   :spin/body {:rdf/type :sp/Select,
               :sp/resultVariables [{:sp/varName "object"}],
               :sp/where [{:sp/object    {:sp/varName "object"},
                           :sp/predicate :spin/_arg2,
                           :sp/subject   :spin/_arg1}]},
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The subject to get the object from.",
                      :sp/arg        [:rdfs/Resource :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdfs/Resource}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The predicate to get the object of.",
                      :sp/arg        [:rdf/Property :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :rdf/Property}]})

(def objectCount
  "Gets the number of values of a given property (?arg2) at a given subject (?arg1). The result is the number of matches of (?arg1, ?arg2, ?object)."
  {:db/ident :spl/objectCount,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Gets the number of values of a given property (?arg2) at a given subject (?arg1). The result is the number of matches of (?arg1, ?arg2, ?object).",
   :rdfs/label "objectCount",
   :rdfs/subClassOf [:spl/OntologyFunctions :spl/objectCount :spin/Functions],
   :spin/body {:rdf/type :sp/Select,
               :sp/resultVariables [{:sp/expression {:rdf/type      :sp/Count,
                                                     :sp/expression {:sp/varName
                                                                     "object"}},
                                     :sp/varName    "result"}],
               :sp/where [{:sp/object    {:sp/varName "object"},
                           :sp/predicate :spin/_arg2,
                           :sp/subject   :spin/_arg1}]},
   :spin/constraint
   [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "the subject to get the number of objects of",
     :sp/arg        [:rdfs/Resource :sp/arg1],
     :spl/predicate :sp/arg1,
     :spl/valueType :rdfs/Resource}
    {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "the property to get the number of values of",
     :sp/arg        [:rdf/Property :sp/arg2],
     :spl/predicate :sp/arg2,
     :spl/valueType :rdf/Property}],
   :spin/returnType :xsd/integer})

(def objectInGraph
  "Gets the object of a given subject (?arg1) / predicate (?arg2) combination in a given graph ?arg3. Note that if multiple values are present then the result might be unpredictably random."
  {:db/ident :spl/objectInGraph,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Gets the object of a given subject (?arg1) / predicate (?arg2) combination in a given graph ?arg3. Note that if multiple values are present then the result might be unpredictably random.",
   :rdfs/label "object in graph",
   :rdfs/subClassOf [:spl/OntologyFunctions :spl/objectInGraph :spin/Functions],
   :spin/body {:rdf/type :sp/Select,
               :sp/resultVariables [{:sp/varName "object"}],
               :sp/where [{:rdf/type         :sp/NamedGraph,
                           :sp/elements      [{:sp/object    {:sp/varName
                                                              "object"},
                                               :sp/predicate :spin/_arg2,
                                               :sp/subject   :spin/_arg1}],
                           :sp/graphNameNode :spin/_arg3}]},
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The subject to get the object from.",
                      :sp/arg        [:rdfs/Resource :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdfs/Resource}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The predicate to get the object of.",
                      :sp/arg        [:rdf/Property :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :rdf/Property}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The graph to query in.",
                      :sp/arg        [:rdfs/Resource :sp/arg3],
                      :spl/predicate :sp/arg3,
                      :spl/valueType :rdfs/Resource}]})

(def objectSubProp
  "Gets the object of a given subject (?arg1) / predicate (?arg2) combination, also taking the sub-properties of ?arg2 into account. Note that if multiple values are present then the result might be unpredictably random."
  {:db/ident :spl/objectSubProp,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Gets the object of a given subject (?arg1) / predicate (?arg2) combination, also taking the sub-properties of ?arg2 into account. Note that if multiple values are present then the result might be unpredictably random.",
   :rdfs/label "object sub prop",
   :rdfs/subClassOf [:spl/OntologyFunctions :spl/objectSubProp :spin/Functions],
   :spin/body {:rdf/type :sp/Select,
               :sp/resultVariables [{:sp/varName "object"}],
               :sp/where [{:rdf/type   :sp/TriplePath,
                           :sp/object  :spin/_arg2,
                           :sp/path    {:rdf/type   :sp/ModPath,
                                        :sp/modMax  -2,
                                        :sp/modMin  0,
                                        :sp/subPath :rdfs/subPropertyOf},
                           :sp/subject {:sp/varName "property"}}
                          {:sp/object    {:sp/varName "object"},
                           :sp/predicate {:sp/varName "property"},
                           :sp/subject   :spin/_arg1}]},
   :spin/constraint
   [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "The subject to get the object from.",
     :sp/arg        [:rdfs/Resource :sp/arg1],
     :spl/predicate :sp/arg1,
     :spl/valueType :rdfs/Resource}
    {:rdf/type [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment
     "The predicate to get the object of (including sub-properties of it).",
     :sp/arg [:rdf/Property :sp/arg2],
     :spl/predicate :sp/arg2,
     :spl/valueType :rdf/Property}]})

(def optional
  "optional"
  {:db/ident           :spl/optional,
   :rdf/type           :rdf/Property,
   :rdfs/label         "optional",
   :rdfs/range         :xsd/boolean,
   :rdfs/subPropertyOf [:sp/arg :spl/optional]})

(def predicate
  "predicate"
  {:db/ident           :spl/predicate,
   :rdf/type           :rdf/Property,
   :rdfs/label         "predicate",
   :rdfs/subPropertyOf [:sp/arg :spl/predicate]})

(def primaryKeyProperty
  "Gets the primary key property declared for a given class, using spl:PrimaryKeyPropertyConstraint."
  {:db/ident :spl/primaryKeyProperty,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Gets the primary key property declared for a given class, using spl:PrimaryKeyPropertyConstraint.",
   :rdfs/label "primary key property",
   :rdfs/subClassOf
   [:spl/OntologyFunctions :spl/primaryKeyProperty :spin/Functions],
   :spin/body {:rdf/type :sp/Select,
               :sp/resultVariables [{:sp/varName "property"}],
               :sp/where [{:rdf/type   :sp/TriplePath,
                           :sp/object  {:sp/varName "type"},
                           :sp/path    {:rdf/type   :sp/ModPath,
                                        :sp/modMax  -2,
                                        :sp/modMin  0,
                                        :sp/subPath :rdfs/subClassOf},
                           :sp/subject {:sp/varName "class"}}
                          {:sp/object    {:sp/varName "constraint"},
                           :sp/predicate :spin/constraint,
                           :sp/subject   {:sp/varName "type"}}
                          {:sp/object    :spl/PrimaryKeyPropertyConstraint,
                           :sp/predicate :rdf/type,
                           :sp/subject   {:sp/varName "constraint"}}
                          {:sp/object    {:sp/varName "property"},
                           :sp/predicate :arg/property,
                           :sp/subject   {:sp/varName "constraint"}}]},
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The class to get the primary key of.",
                     :sp/arg        [:rdfs/Class :arg/class],
                     :spl/predicate :arg/class,
                     :spl/valueType :rdfs/Class},
   :spin/returnType :rdf/Property})

(def primaryKeyURIStart
  "Gets the URI start declared as part of a primary key declaration for a given class, using spl:PrimaryKeyPropertyConstraint."
  {:db/ident :spl/primaryKeyURIStart,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Gets the URI start declared as part of a primary key declaration for a given class, using spl:PrimaryKeyPropertyConstraint.",
   :rdfs/label "primary key URI start",
   :rdfs/subClassOf
   [:spl/OntologyFunctions :spl/primaryKeyURIStart :spin/Functions],
   :spin/body {:rdf/type :sp/Select,
               :sp/resultVariables [{:sp/varName "result"}],
               :sp/where [{:rdf/type   :sp/TriplePath,
                           :sp/object  {:sp/varName "type"},
                           :sp/path    {:rdf/type   :sp/ModPath,
                                        :sp/modMax  -2,
                                        :sp/modMin  0,
                                        :sp/subPath :rdfs/subClassOf},
                           :sp/subject {:sp/varName "class"}}
                          {:sp/object    {:sp/varName "constraint"},
                           :sp/predicate :spin/constraint,
                           :sp/subject   {:sp/varName "type"}}
                          {:sp/object    :spl/PrimaryKeyPropertyConstraint,
                           :sp/predicate :rdf/type,
                           :sp/subject   {:sp/varName "constraint"}}
                          {:sp/object    {:sp/varName "result"},
                           :sp/predicate :arg/uriStart,
                           :sp/subject   {:sp/varName "constraint"}}]},
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The class to get the primary key of.",
                     :sp/arg        [:rdfs/Class :arg/class],
                     :spl/predicate :arg/class,
                     :spl/valueType :rdfs/Class},
   :spin/returnType :rdf/Property})

(def relevantPropertyAtClass
  "A magic property that establishes a relationship between properties (left) and classes (right) to determine which properties are \"relevant\" for the class. Relevant means that they have the class in their domain and/or restrictions, including superclasses and sub-properties (unless they define their own domain). Domains consisting of an owl:unionOf are also handled. Note that the performance of the body of this magic property has been optimized for the case in which the class is given, so ideally use this for queries such as ?property spl:relevantPropertyAtClass skos:Concept ."
  {:db/ident :spl/relevantPropertyAtClass,
   :rdf/type :spin/MagicProperty,
   :rdfs/comment
   "A magic property that establishes a relationship between properties (left) and classes (right) to determine which properties are \"relevant\" for the class. Relevant means that they have the class in their domain and/or restrictions, including superclasses and sub-properties (unless they define their own domain). Domains consisting of an owl:unionOf are also handled.\n\nNote that the performance of the body of this magic property has been optimized for the case in which the class is given, so ideally use this for queries such as  ?property spl:relevantPropertyAtClass skos:Concept .",
   :rdfs/label "relevant property at class",
   :rdfs/subClassOf [:spin/MagicProperties :spl/relevantPropertyAtClass],
   :spin/body
   {:rdf/type :sp/Select,
    :sp/distinct true,
    :sp/resultVariables [{:sp/varName "class"}],
    :sp/where
    [{:rdf/type   :sp/TriplePath,
      :sp/object  {:sp/varName "superClass"},
      :sp/path    {:rdf/type   :sp/ModPath,
                   :sp/modMax  -2,
                   :sp/modMin  0,
                   :sp/subPath :rdfs/subClassOf},
      :sp/subject {:sp/varName "class"}}
     {:rdf/type    :sp/Union,
      :sp/elements [[{:sp/object    {:sp/varName "superClass"},
                      :sp/predicate :rdfs/domain,
                      :sp/subject   {:sp/varName "property"}}]
                    [{:sp/object    {:sp/varName "property"},
                      :sp/predicate :owl/onProperty,
                      :sp/subject   {:sp/varName "superClass"}}]
                    [{:sp/object    {:sp/varName "superClass"},
                      :sp/predicate :rdf/first,
                      :sp/subject   {:sp/varName "listSegment"}}
                     {:rdf/type   :sp/TriplePath,
                      :sp/object  {:sp/varName "listSegment"},
                      :sp/path    {:rdf/type   :sp/ModPath,
                                   :sp/modMax  -2,
                                   :sp/modMin  0,
                                   :sp/subPath :rdf/rest},
                      :sp/subject {:sp/varName "list"}}
                     {:rdf/type   :sp/TriplePath,
                      :sp/object  {:sp/varName "list"},
                      :sp/path    {:rdf/type :sp/SeqPath,
                                   :sp/path1 :rdfs/domain,
                                   :sp/path2 :owl/unionOf},
                      :sp/subject {:sp/varName "property"}}]]}
     {:rdf/type   :sp/TriplePath,
      :sp/object  {:sp/varName "property"},
      :sp/path    {:rdf/type   :sp/ModPath,
                   :sp/modMax  -2,
                   :sp/modMin  0,
                   :sp/subPath :rdfs/subPropertyOf},
      :sp/subject :spin/_arg1}
     {:rdf/type      :sp/Filter,
      :sp/expression {:rdf/type [:sp/or :spin/Functions :spl/BooleanFunctions],
                      :sp/arg1  {:rdf/type [:sp/eq
                                            :spl/BooleanFunctions
                                            :spin/Functions],
                                 :sp/arg1  :spin/_arg1,
                                 :sp/arg2  {:sp/varName "property"}},
                      :sp/arg2  {:rdf/type    [:sp/notExists
                                               :spl/BooleanFunctions
                                               :spin/Functions],
                                 :sp/elements [{:sp/object    {:sp/varName
                                                               "anyDomain"},
                                                :sp/predicate :rdfs/domain,
                                                :sp/subject   :spin/_arg1}]}}}
     {:rdf/type      :sp/Filter,
      :sp/expression {:rdf/type [:sp/isIRI
                                 :spin/Functions
                                 :spl/BooleanFunctions],
                      :sp/arg1  {:sp/varName "class"}}}]},
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The property.",
                     :sp/arg        [:rdf/Property :sp/arg1],
                     :spl/predicate :sp/arg1,
                     :spl/valueType :rdf/Property},
   :spin/returnType :rdfs/Class})

(def subClassOf
  "Checks whether a given class (?arg1) is a (transitive) sub-class of another class (?arg2)."
  {:db/ident :spl/subClassOf,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Checks whether a given class (?arg1) is a (transitive) sub-class of another class (?arg2).",
   :rdfs/label "sub class of",
   :rdfs/subClassOf [:spl/OntologyFunctions :spl/subClassOf :spin/Functions],
   :spin/body {:rdf/type :sp/Ask,
               :sp/where [{:rdf/type   :sp/TriplePath,
                           :sp/object  :spin/_arg2,
                           :sp/path    {:rdf/type   :sp/ModPath,
                                        :sp/modMax  -2,
                                        :sp/modMin  0,
                                        :sp/subPath :rdfs/subClassOf},
                           :sp/subject :spin/_arg1}]},
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The potential sub-class.",
                      :sp/arg        [:rdfs/Class :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdfs/Class}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The potential super-class.",
                      :sp/arg        [:rdfs/Class :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :rdfs/Class}],
   :spin/returnType :xsd/boolean})

(def subPropertyOf
  "Checks whether a given property (?arg1) is a (transitive) sub-property of another property (?arg2)."
  {:db/ident :spl/subPropertyOf,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Checks whether a given property (?arg1) is a (transitive) sub-property of another property (?arg2).",
   :rdfs/label "sub property of",
   :rdfs/subClassOf [:spl/OntologyFunctions :spl/subPropertyOf :spin/Functions],
   :spin/body {:rdf/type :sp/Ask,
               :sp/where [{:rdf/type   :sp/TriplePath,
                           :sp/object  :spin/_arg2,
                           :sp/path    {:rdf/type   :sp/ModPath,
                                        :sp/modMax  -2,
                                        :sp/modMin  0,
                                        :sp/subPath :rdfs/subPropertyOf},
                           :sp/subject :spin/_arg1}]},
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The potential sub-property.",
                      :sp/arg        [:rdf/Property :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdf/Property}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The potential super-property.",
                      :sp/arg        [:rdf/Property :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :rdf/Property}],
   :spin/returnType :xsd/boolean})

(def subject
  "Gets the \"first\" subject of a given predicate (?arg1)/object (?arg2) combination. Note that if multiple values are present then the result might be unpredictably random."
  {:db/ident :spl/subject,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Gets the \"first\" subject of a given predicate (?arg1)/object (?arg2) combination. Note that if multiple values are present then the result might be unpredictably random.",
   :rdfs/label "subject",
   :rdfs/subClassOf [:spl/OntologyFunctions :spl/subject :spin/Functions],
   :spin/body {:rdf/type :sp/Select,
               :sp/resultVariables [{:sp/varName "subject"}],
               :sp/where [{:sp/object    :spin/_arg2,
                           :sp/predicate :spin/_arg1,
                           :sp/subject   {:sp/varName "subject"}}]},
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The predicate.",
                      :sp/arg        [:rdf/Property :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdf/Property}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The object.",
                      :sp/arg        :sp/arg2,
                      :spl/predicate :sp/arg2}]})

(def subjectCount
  "Gets the number of values of a given property (?arg1) at a given object (?arg2). The result is the number of matches of (?subject, ?arg1, ?arg2)."
  {:db/ident :spl/subjectCount,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Gets the number of values of a given property (?arg1) at a given object (?arg2). The result is the number of matches of (?subject, ?arg1, ?arg2).",
   :rdfs/label "subjectCount",
   :rdfs/subClassOf [:spl/OntologyFunctions :spl/subjectCount :spin/Functions],
   :spin/body {:rdf/type :sp/Select,
               :sp/resultVariables [{:sp/expression {:rdf/type :sp/Count,
                                                     :sp/expression
                                                     {:sp/varName "subject"}},
                                     :sp/varName    "result"}],
               :sp/where [{:sp/object    :spin/_arg2,
                           :sp/predicate :spin/_arg1,
                           :sp/subject   {:sp/varName "subject"}}]},
   :spin/constraint
   [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "the predicate to get the number of subjects of",
     :sp/arg        [:rdf/Property :sp/arg1],
     :spl/predicate :sp/arg1,
     :spl/valueType :rdf/Property}
    {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "the object to get the number of subjects of",
     :sp/arg        :sp/arg2,
     :spl/predicate :sp/arg2}],
   :spin/returnType :xsd/integer})

(def subjectInGraph
  "Gets the \"first\" subject of a given predicate (?arg1)/object (?arg2) combination in a given graph (?arg3). Note that if multiple values are present then the result might be unpredictably random."
  {:db/ident :spl/subjectInGraph,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Gets the \"first\" subject of a given predicate (?arg1)/object (?arg2) combination in a given graph (?arg3). Note that if multiple values are present then the result might be unpredictably random.",
   :rdfs/label "subject in graph",
   :rdfs/subClassOf
   [:spl/OntologyFunctions :spl/subjectInGraph :spin/Functions],
   :spin/body {:rdf/type :sp/Select,
               :sp/resultVariables [{:sp/varName "subject"}],
               :sp/where [{:rdf/type         :sp/NamedGraph,
                           :sp/elements      [{:sp/object    :spin/_arg2,
                                               :sp/predicate :spin/_arg1,
                                               :sp/subject   {:sp/varName
                                                              "subject"}}],
                           :sp/graphNameNode :spin/_arg3}]},
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The predicate.",
                      :sp/arg        [:rdf/Property :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdf/Property}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The object.",
                      :sp/arg        :sp/arg2,
                      :spl/predicate :sp/arg2}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The graph to operate on.",
                      :sp/arg        [:rdfs/Resource :sp/arg3],
                      :spl/predicate :sp/arg3,
                      :spl/valueType :rdfs/Resource}]})

(def testExpression
  "test expression"
  {:db/ident           :spl/testExpression,
   :rdf/type           :rdf/Property,
   :rdfs/label         "test expression",
   :rdfs/subPropertyOf [:sp/arg :spl/testExpression]})

(def testResult
  "testResult"
  {:db/ident           :spl/testResult,
   :rdf/type           :rdf/Property,
   :rdfs/label         "testResult",
   :rdfs/subPropertyOf [:sp/arg :spl/testResult]})

(def valueType
  "value type"
  {:db/ident           :spl/valueType,
   :rdf/type           :rdf/Property,
   :rdfs/label         "value type",
   :rdfs/subPropertyOf [:sp/arg :spl/valueType]})

(def ^{:private true} class
  {:db/ident :arg/class,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf [:sp/arg :arg/class]})

(def ^{:private true} instance
  {:db/ident :arg/instance,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf [:sp/arg :arg/instance]})

(def ^{:private true} max
  {:db/ident :arg/max,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf [:sp/arg :arg/max]})

(def ^{:private true} maxCount
  {:db/ident :arg/maxCount,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf [:sp/arg :arg/maxCount]})

(def ^{:private true} maxLength
  {:db/ident :arg/maxLength,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf [:sp/arg :arg/maxLength]})

(def ^{:private true} min
  {:db/ident :arg/min,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf [:sp/arg :arg/min]})

(def ^{:private true} minCount
  {:db/ident :arg/minCount,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf [:sp/arg :arg/minCount]})

(def ^{:private true} minLength
  {:db/ident :arg/minLength,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf [:sp/arg :arg/minLength]})

(def ^{:private true} otherProperty
  {:db/ident :arg/otherProperty,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf [:sp/arg :arg/otherProperty]})

(def ^{:private true} pattern
  {:db/ident :arg/pattern,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf [:sp/arg :arg/pattern]})

(def ^{:private true} property
  {:db/ident :arg/property,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf [:sp/arg :arg/property]})

(def ^{:private true} type
  {:db/ident :arg/type,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf [:sp/arg :arg/type]})

(def ^{:private true} uriStart
  {:db/ident :arg/uriStart,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf [:sp/arg :arg/uriStart]})

(def ^{:private true} UUID
  "Returns a fresh IRI from the UUID URN scheme. Each call of UUID() returns a different UUID. It must not be the \"nil\" UUID (all zeroes). The variant and version of the UUID is implementation dependent."
  {:db/ident :sp/UUID,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns a fresh IRI from the UUID URN scheme. Each call of UUID() returns a different UUID. It must not be the \"nil\" UUID (all zeroes). The variant and version of the UUID is implementation dependent.",
   :rdfs/label "UUID",
   :rdfs/subClassOf [:spl/URIFunctions :sp/UUID :spin/Functions],
   :spin/returnType :rdfs/Resource,
   :spin/symbol "UUID"})

(def ^{:private true} abs
  "Returns the absolute value of arg. An error is raised if arg is not a numeric value."
  {:db/ident :sp/abs,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns the absolute value of arg. An error is raised if arg is not a numeric value.",
   :rdfs/label "abs",
   :rdfs/seeAlso ["http://www.w3.org/TR/sparql11-query/#func-abs"],
   :rdfs/subClassOf [:spl/MathematicalFunctions :sp/abs :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The input value.",
                     :sp/arg        :sp/arg1,
                     :spl/predicate :sp/arg1},
   :spin/symbol "abs"})

(def ^{:private true} add
  "Returns the arithmetic sum of its operands."
  {:db/ident        :sp/add,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Returns the arithmetic sum of its operands.",
   :rdfs/label      "add",
   :rdfs/subClassOf [:spl/MathematicalFunctions :sp/add :spin/Functions],
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the first number",
                      :sp/arg        [:rdfs/Resource :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdfs/Resource}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the second number",
                      :sp/arg        [:rdfs/Resource :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :rdfs/Resource}],
   :spin/symbol     "+"})

(def ^{:private true} and
  "Return the logical AND between two (boolean) operands."
  {:db/ident        :sp/and,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Return the logical AND between two (boolean) operands.",
   :rdfs/label      "and",
   :rdfs/subClassOf [:spl/BooleanFunctions :sp/and :spin/Functions],
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the first operand of the intersection",
                      :sp/arg        [:xsd/boolean :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :xsd/boolean}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the second operand of the intersection",
                      :sp/arg        [:xsd/boolean :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :xsd/boolean}],
   :spin/returnType :xsd/boolean,
   :spin/symbol     "&&"})

(def ^{:private true} arg
  {:db/ident :sp/arg,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf :sp/arg})

(def ^{:private true} bnode
  "Constructs a blank node that is distinct from all blank nodes in the dataset being queried and distinct from all blank nodes created by calls to this constructor for other query solutions. If the no argument form is used, every call results in a distinct blank node. If the form with a simple literal is used, every call results in distinct blank nodes for different simple literals, and the same blank node for calls with the same simple literal within expressions for one solution mapping. This functionality is compatible with the treatment of blank nodes in SPARQL CONSTRUCT templates."
  {:db/ident :sp/bnode,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Constructs a blank node that is distinct from all blank nodes in the dataset being queried and distinct from all blank nodes created by calls to this constructor for other query solutions. If the no argument form is used, every call results in a distinct blank node. If the form with a simple literal is used, every call results in distinct blank nodes for different simple literals, and the same blank node for calls with the same simple literal within expressions for one solution mapping. This functionality is compatible with the treatment of blank nodes in SPARQL CONSTRUCT templates.",
   :rdfs/label "bnode",
   :rdfs/seeAlso ["http://www.w3.org/TR/sparql11-query/#func-bnode"],
   :rdfs/subClassOf [:spl/OntologyFunctions :sp/bnode :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "A literal input node.",
                     :sp/arg        [:sp/arg1 true],
                     :spl/optional  true,
                     :spl/predicate :sp/arg1},
   :spin/symbol "BNODE"})

(def ^{:private true} bound
  "Returns true if ?arg1 is bound to a value. Returns false otherwise. Variables with the value NaN or INF are considered bound."
  {:db/ident :sp/bound,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns true if ?arg1 is bound to a value. Returns false otherwise. Variables with the value NaN or INF are considered bound.",
   :rdfs/label "bound",
   :rdfs/subClassOf [:spl/BooleanFunctions :sp/bound :spin/Functions],
   :spin/constraint {:rdf/type [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment "the variable or expression that is checked",
                     :sp/arg :sp/arg1,
                     :spl/predicate :sp/arg1},
   :spin/returnType :xsd/boolean,
   :spin/symbol "bound"})

(def ^{:private true} ceil
  "Returns the smallest (closest to negative infinity) number with no fractional part that is not less than the value of arg. An error is raised if ?arg1 is not a numeric value."
  {:db/ident :sp/ceil,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns the smallest (closest to negative infinity) number with no fractional part that is not less than the value of arg. An error is raised if ?arg1 is not a numeric value.",
   :rdfs/label "ceil",
   :rdfs/seeAlso ["http://www.w3.org/TR/sparql11-query/#func-ceil"],
   :rdfs/subClassOf [:spl/MathematicalFunctions :sp/ceil :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The number to get the ceiling of.",
                     :sp/arg        :sp/arg1,
                     :spl/predicate :sp/arg1},
   :spin/symbol "ceil"})

(def ^{:private true} coalesce
  "Takes any number of arguments, and returns the first bound argument, starting at the left."
  {:db/ident :sp/coalesce,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Takes any number of arguments, and returns the first bound argument, starting at the left.",
   :rdfs/label "COALESCE",
   :rdfs/subClassOf [:spl/MiscFunctions :sp/coalesce :spin/Functions],
   :spin/symbol "COALESCE"})

(def ^{:private true} concat
  "The CONCAT built-in function. Creates a single string by concatenating all arguments from left to right. Note that if any one of the arguments is unbound (null) then the whole result string will be unbound."
  {:db/ident :sp/concat,
   :rdf/type :spin/Function,
   :rdfs/comment
   "The CONCAT built-in function. Creates a single string by concatenating all arguments from left to right. Note that if any one of the arguments is unbound (null) then the whole result string will be unbound.",
   :rdfs/label "concat",
   :rdfs/subClassOf [:spl/StringFunctions :sp/concat :spin/Functions],
   :spin/returnType :xsd/string,
   :spin/symbol "CONCAT"})

(def ^{:private true} contains
  "Returns an xsd:boolean indicating whether or not the value of ?arg1 contains (at the beginning, at the end, or anywhere within) at least one sequence of collation units that provides a minimal match to the collation units in the value of ?arg2, according to the collation that is used."
  {:db/ident :sp/contains,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns an xsd:boolean indicating whether or not the value of ?arg1 contains (at the beginning, at the end, or anywhere within) at least one sequence of collation units that provides a minimal match to the collation units in the value of ?arg2, according to the collation that is used.",
   :rdfs/label "contains",
   :rdfs/seeAlso ["http://www.w3.org/TR/sparql11-query/#func-contains"],
   :rdfs/subClassOf [:spl/StringFunctions :sp/contains :spin/Functions],
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The input string.",
                      :sp/arg        [:xsd/string :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :xsd/string}
                     {:rdf/type [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment
                      "The sub-string to search for in the input string.",
                      :sp/arg [:xsd/string :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :xsd/string}],
   :spin/symbol "CONTAINS"})

(def ^{:private true} datatype
  "Returns the datatype IRI of argument ?arg1; returns xsd:string if the parameter is a simple literal."
  {:db/ident :sp/datatype,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns the datatype IRI of argument ?arg1; returns xsd:string if the parameter is a simple literal.",
   :rdfs/label "datatype",
   :rdfs/subClassOf [:spl/OntologyFunctions :sp/datatype :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "the literal to get the datatype of",
                     :sp/arg        [:rdfs/Literal :sp/arg1],
                     :spl/predicate :sp/arg1,
                     :spl/valueType :rdfs/Literal},
   :spin/returnType :rdfs/Class,
   :spin/symbol "datatype"})

(def ^{:private true} day
  "Extracts the day from a date/time literal."
  {:db/ident        :sp/day,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Extracts the day from a date/time literal.",
   :rdfs/label      "day",
   :rdfs/subClassOf [:spl/DateFunctions :sp/day :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The date or dateTime argument.",
                     :sp/arg        [:rdfs/Literal :sp/arg1],
                     :spl/predicate :sp/arg1,
                     :spl/valueType :rdfs/Literal},
   :spin/returnType :xsd/integer,
   :spin/symbol     "day"})

(def ^{:private true} divide
  "Returns the arithmetic quotient of its operands."
  {:db/ident        :sp/divide,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Returns the arithmetic quotient of its operands.",
   :rdfs/label      "divide",
   :rdfs/subClassOf [:spl/MathematicalFunctions :sp/divide :spin/Functions],
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the first operand",
                      :sp/arg        [:rdfs/Literal :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdfs/Literal}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the second operand",
                      :sp/arg        [:rdfs/Literal :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :rdfs/Literal}],
   :spin/returnType :rdfs/Literal,
   :spin/symbol     "/"})

(def ^{:private true} encode_for_uri
  "encode_for_uri"
  {:db/ident        :sp/encode_for_uri,
   :rdf/type        :spin/Function,
   :rdfs/label      "encode_for_uri",
   :rdfs/subClassOf [:spl/StringFunctions :sp/encode_for_uri :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The string to convert.",
                     :sp/arg        [:xsd/string :sp/arg1],
                     :spl/predicate :sp/arg1,
                     :spl/valueType :xsd/string},
   :spin/returnType :xsd/string,
   :spin/symbol     "ENCODE_FOR_URI"})

(def ^{:private true} eq
  "Returns true if both arguments are equal."
  {:db/ident        :sp/eq,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Returns true if both arguments are equal.",
   :rdfs/label      "eq",
   :rdfs/subClassOf [:spl/BooleanFunctions :sp/eq :spin/Functions],
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the first value to compare",
                      :sp/arg        [:xsd/boolean :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :xsd/boolean}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the second value to compare",
                      :sp/arg        [:xsd/boolean :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :xsd/boolean}],
   :spin/returnType :xsd/boolean,
   :spin/symbol     "="})

(def ^{:private true} exists
  "The filter function EXISTS. The graph pattern is stored in sp:elements."
  {:db/ident :sp/exists,
   :rdf/type :spin/Function,
   :rdfs/comment
   "The filter function EXISTS. The graph pattern is stored in sp:elements.",
   :rdfs/label "EXISTS",
   :rdfs/subClassOf [:spl/BooleanFunctions :sp/exists :spin/Functions],
   :spin/returnType :xsd/boolean,
   :spin/symbol "EXISTS"})

(def ^{:private true} floor
  "Returns the largest (closest to positive infinity) number with no fractional part that is not greater than the value of ?arg1. An error is raised if ?arg1 is not a numeric value."
  {:db/ident :sp/floor,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns the largest (closest to positive infinity) number with no fractional part that is not greater than the value of ?arg1. An error is raised if ?arg1 is not a numeric value.",
   :rdfs/label "floor",
   :rdfs/seeAlso ["http://www.w3.org/TR/sparql11-query/#func-floor"],
   :rdfs/subClassOf [:spl/MathematicalFunctions :sp/floor :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The value to get the floor of.",
                     :sp/arg        :sp/arg1,
                     :spl/predicate :sp/arg1},
   :spin/symbol "floor"})

(def ^{:private true} ge
  "Returns true if ?arg1 >= ?arg2."
  {:db/ident        :sp/ge,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Returns true if ?arg1 >= ?arg2.",
   :rdfs/label      "ge",
   :rdfs/subClassOf [:spl/BooleanFunctions :sp/ge :spin/Functions],
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the first operand",
                      :sp/arg        [:rdfs/Literal :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdfs/Literal}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the second operand",
                      :sp/arg        [:rdfs/Literal :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :rdfs/Literal}],
   :spin/returnType :xsd/boolean,
   :spin/symbol     ">="})

(def ^{:private true} gt
  "Returns true if ?arg1 > arg2."
  {:db/ident        :sp/gt,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Returns true if ?arg1 > arg2.",
   :rdfs/label      "gt",
   :rdfs/subClassOf [:spl/BooleanFunctions :sp/gt :spin/Functions],
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the first operand",
                      :sp/arg        [:rdfs/Literal :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdfs/Literal}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the second operand",
                      :sp/arg        [:rdfs/Literal :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :rdfs/Literal}],
   :spin/returnType :xsd/boolean,
   :spin/symbol     ">"})

(def ^{:private true} hours
  "Extracts the hours from a date/time literal."
  {:db/ident        :sp/hours,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Extracts the hours from a date/time literal.",
   :rdfs/label      "hours",
   :rdfs/subClassOf [:spl/DateFunctions :sp/hours :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The dateTime or time argument.",
                     :sp/arg        [:rdfs/Literal :sp/arg1],
                     :spl/predicate :sp/arg1,
                     :spl/valueType :rdfs/Literal},
   :spin/returnType :xsd/integer,
   :spin/symbol     "hours"})

(def ^{:private true} if
  "The SPARQL 1.1 built-in function IF."
  {:db/ident :sp/if,
   :rdf/type :spin/Function,
   :rdfs/comment "The SPARQL 1.1 built-in function IF.",
   :rdfs/label "IF",
   :rdfs/subClassOf [:spl/MiscFunctions :sp/if :spin/Functions],
   :spin/constraint
   [{:rdf/type [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment
     "A condition to evaluate - if true then the ?arg2 will be returned, otherwise ?arg3.",
     :sp/arg [:xsd/boolean :sp/arg1],
     :spl/predicate :sp/arg1,
     :spl/valueType :xsd/boolean}
    {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "The function result if ?arg1 is true.",
     :sp/arg        :sp/arg2,
     :spl/predicate :sp/arg2}
    {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "The function result if ?arg1 is false.",
     :sp/arg        :sp/arg3,
     :spl/predicate :sp/arg3}],
   :spin/symbol "IF"})

(def ^{:private true} in
  "Checks whether the value on the left (?arg1) is one of the values on the right (?arg2, ?arg3 ...)."
  {:db/ident :sp/in,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Checks whether the value on the left (?arg1) is one of the values on the right (?arg2, ?arg3 ...).",
   :rdfs/label "IN",
   :rdfs/subClassOf [:spl/BooleanFunctions :sp/in :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The value to find.",
                     :sp/arg        :sp/arg1,
                     :spl/predicate :sp/arg1},
   :spin/returnType :xsd/boolean,
   :spin/symbol "IN"})

(def ^{:private true} iri
  "Creates a IRI resource (node) from a given IRI string (?arg1)."
  {:db/ident :sp/iri,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Creates a IRI resource (node) from a given IRI string (?arg1).",
   :rdfs/label "IRI",
   :rdfs/subClassOf [:spl/OntologyFunctions :sp/iri :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The IRI string to convert to a resource.",
                     :sp/arg        [:xsd/string :sp/arg1],
                     :spl/predicate :sp/arg1,
                     :spl/valueType :xsd/string},
   :spin/returnType :rdfs/Resource,
   :spin/symbol "IRI"})

(def ^{:private true} isBlank
  "Checks whether a given node is a blank node."
  {:db/ident        :sp/isBlank,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Checks whether a given node is a blank node.",
   :rdfs/label      "isBlank",
   :rdfs/subClassOf [:spl/BooleanFunctions :sp/isBlank :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "the node being checked",
                     :sp/arg        :sp/arg1,
                     :spl/predicate :sp/arg1},
   :spin/returnType :xsd/boolean,
   :spin/symbol     "isBlank"})

(def ^{:private true} isIRI
  "Checks whether a given node is a IRI node."
  {:db/ident        :sp/isIRI,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Checks whether a given node is a IRI node.",
   :rdfs/label      "isIRI",
   :rdfs/subClassOf [:spl/BooleanFunctions :sp/isIRI :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "the node being tested",
                     :sp/arg        :sp/arg1,
                     :spl/predicate :sp/arg1},
   :spin/returnType :xsd/boolean,
   :spin/symbol     "isIRI"})

(def ^{:private true} isLiteral
  "Checks whether a given node is a literal."
  {:db/ident        :sp/isLiteral,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Checks whether a given node is a literal.",
   :rdfs/label      "isLiteral",
   :rdfs/subClassOf [:spl/BooleanFunctions :sp/isLiteral :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "the node being tested",
                     :sp/arg        :sp/arg1,
                     :spl/predicate :sp/arg1},
   :spin/returnType :xsd/boolean,
   :spin/symbol     "isLiteral"})

(def ^{:private true} isNumeric
  "Returns true if arg1 is a numeric value. Returns false otherwise. term is numeric if it has an appropriate datatype (see the section Operand Data Types) and has a valid lexical form, making it a valid argument to functions and operators taking numeric arguments."
  {:db/ident :sp/isNumeric,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns true if arg1 is a numeric value. Returns false otherwise. term is numeric if it has an appropriate datatype (see the section Operand Data Types) and has a valid lexical form, making it a valid argument to functions and operators taking numeric arguments.",
   :rdfs/label "is numeric",
   :rdfs/seeAlso ["http://www.w3.org/TR/sparql11-query/#func-isNumeric"],
   :rdfs/subClassOf [:spl/BooleanFunctions :sp/isNumeric :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The node to check whether it's numeric.\n",
                     :sp/arg        :sp/arg1,
                     :spl/predicate :sp/arg1},
   :spin/symbol "isNumeric"})

(def ^{:private true} isURI
  "Checks whether a node is a URI."
  {:db/ident        :sp/isURI,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Checks whether a node is a URI.",
   :rdfs/label      "isURI",
   :rdfs/subClassOf [:spl/BooleanFunctions :sp/isURI :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "the node to check",
                     :sp/arg        :sp/arg1,
                     :spl/predicate :sp/arg1},
   :spin/returnType :xsd/boolean,
   :spin/symbol     "isURI"})

(def ^{:private true} lang
  "Returns the language tag of ?arg1, if it has one. It returns \"\" if the literal has no language tag. Node that the RDF data model does not include literals with an empty language tag."
  {:db/ident :sp/lang,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns the language tag of ?arg1, if it has one. It returns \"\" if the literal has no language tag. Node that the RDF data model does not include literals with an empty language tag.",
   :rdfs/label "lang",
   :rdfs/subClassOf [:spl/StringFunctions :sp/lang :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "the literal to get the language of",
                     :sp/arg        [:rdfs/Literal :sp/arg1],
                     :spl/predicate :sp/arg1,
                     :spl/valueType :rdfs/Literal},
   :spin/returnType :xsd/string,
   :spin/symbol "lang"})

(def ^{:private true} langMatches
  "Returns true if language-tag (first argument) matches language-range (second argument) per the basic filtering scheme defined in [RFC4647] section 3.3.1."
  {:db/ident :sp/langMatches,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns true if language-tag (first argument) matches language-range (second argument) per the basic filtering scheme defined in [RFC4647] section 3.3.1.",
   :rdfs/label "langMatches",
   :rdfs/subClassOf [:spl/StringFunctions :sp/langMatches :spin/Functions],
   :spin/constraint
   [{:rdf/type [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment "the literal that is expected to have ?arg2 as language tag",
     :sp/arg [:rdfs/Literal :sp/arg1],
     :spl/predicate :sp/arg1,
     :spl/valueType :rdfs/Literal}
    {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "the language tag that ?arg1 must have",
     :sp/arg        [:xsd/string :sp/arg2],
     :spl/predicate :sp/arg2,
     :spl/valueType :xsd/string}],
   :spin/returnType :xsd/boolean,
   :spin/symbol "langMatches"})

(def ^{:private true} lcase
  "Converts a string to lower case characters."
  {:db/ident        :sp/lcase,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Converts a string to lower case characters.",
   :rdfs/label      "LCASE",
   :rdfs/seeAlso    ["http://www.w3.org/TR/sparql11-query/#func-lcase"],
   :rdfs/subClassOf [:spl/StringFunctions :sp/lcase :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The input string.",
                     :sp/arg        [:xsd/string :sp/arg1],
                     :spl/predicate :sp/arg1,
                     :spl/valueType :xsd/string},
   :spin/returnType :xsd/string,
   :spin/symbol     "LCASE"})

(def ^{:private true} le
  "Returns true if ?arg1 <= ?arg2."
  {:db/ident        :sp/le,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Returns true if ?arg1 <= ?arg2.",
   :rdfs/label      "le",
   :rdfs/subClassOf [:spl/BooleanFunctions :sp/le :spin/Functions],
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the first operand",
                      :sp/arg        [:rdfs/Literal :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdfs/Literal}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the second operand",
                      :sp/arg        [:rdfs/Literal :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :rdfs/Literal}],
   :spin/returnType :xsd/boolean,
   :spin/symbol     "<="})

(def ^{:private true} lt
  "Returns true if ?arg1 < ?arg2."
  {:db/ident        :sp/lt,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Returns true if ?arg1 < ?arg2.",
   :rdfs/label      "lt",
   :rdfs/subClassOf [:spl/BooleanFunctions :sp/lt :spin/Functions],
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the first operand",
                      :sp/arg        [:rdfs/Literal :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdfs/Literal}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the second operand",
                      :sp/arg        [:rdfs/Literal :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :rdfs/Literal}],
   :spin/returnType :xsd/boolean,
   :spin/symbol     "<"})

(def ^{:private true} md5
  "Returns the MD5 checksum, as a hex digit string, calculated on the UTF-8 representation of the simple literal or lexical form of the xsd:string. Hex digits SHOULD be in lower case."
  {:db/ident :sp/md5,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns the MD5 checksum, as a hex digit string, calculated on the UTF-8 representation of the simple literal or lexical form of the xsd:string. Hex digits SHOULD be in lower case.",
   :rdfs/label "md5",
   :rdfs/seeAlso ["http://www.w3.org/TR/sparql11-query/#func-md5"],
   :rdfs/subClassOf [:spl/MiscFunctions :sp/md5 :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The input literal.",
                     :sp/arg        :sp/arg1,
                     :spl/predicate :sp/arg1},
   :spin/returnType :xsd/string,
   :spin/symbol "MD5"})

(def ^{:private true} minutes
  "Extracts the minutes from a date/time literal."
  {:db/ident        :sp/minutes,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Extracts the minutes from a date/time literal.",
   :rdfs/label      "minutes",
   :rdfs/subClassOf [:spl/DateFunctions :sp/minutes :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The dateTime or time argument.",
                     :sp/arg        [:rdfs/Literal :sp/arg1],
                     :spl/predicate :sp/arg1,
                     :spl/valueType :rdfs/Literal},
   :spin/returnType :xsd/integer,
   :spin/symbol     "minutes"})

(def ^{:private true} month
  "Extracts the month from a date/time literal."
  {:db/ident        :sp/month,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Extracts the month from a date/time literal.",
   :rdfs/label      "month",
   :rdfs/subClassOf [:spl/DateFunctions :sp/month :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The date or dateTime argument.",
                     :sp/arg        [:rdfs/Literal :sp/arg1],
                     :spl/predicate :sp/arg1,
                     :spl/valueType :rdfs/Literal},
   :spin/returnType :xsd/integer,
   :spin/symbol     "month"})

(def ^{:private true} mul
  "Returns the arithmetic product of its operands."
  {:db/ident        :sp/mul,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Returns the arithmetic product of its operands.",
   :rdfs/label      "mul",
   :rdfs/subClassOf [:spl/MathematicalFunctions :sp/mul :spin/Functions],
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the first operand",
                      :sp/arg        [:rdfs/Literal :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdfs/Literal}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the second operand",
                      :sp/arg        [:rdfs/Literal :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :rdfs/Literal}],
   :spin/symbol     "*"})

(def ^{:private true} ne
  "Returns true if ?arg1 != ?arg2."
  {:db/ident        :sp/ne,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Returns true if ?arg1 != ?arg2.",
   :rdfs/label      "ne",
   :rdfs/subClassOf [:spl/BooleanFunctions :sp/ne :spin/Functions],
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the first operand",
                      :sp/arg        :sp/arg1,
                      :spl/predicate :sp/arg1}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the second operand",
                      :sp/arg        :sp/arg2,
                      :spl/predicate :sp/arg2}],
   :spin/returnType :xsd/boolean,
   :spin/symbol     "!="})

(def ^{:private true} not
  "Returns the boolean negation of the argument."
  {:db/ident        :sp/not,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Returns the boolean negation of the argument.",
   :rdfs/label      "not",
   :rdfs/subClassOf [:spl/BooleanFunctions :sp/not :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "the operand to negate",
                     :sp/arg        [:xsd/boolean :sp/arg1],
                     :spl/predicate :sp/arg1,
                     :spl/valueType :xsd/boolean},
   :spin/returnType :xsd/boolean,
   :spin/symbol     "!"})

(def ^{:private true} notExists
  "The filter function NOT EXISTS. The graph pattern is stored in sp:elements."
  {:db/ident :sp/notExists,
   :rdf/type :spin/Function,
   :rdfs/comment
   "The filter function NOT EXISTS. The graph pattern is stored in sp:elements.",
   :rdfs/label "NOT EXISTS",
   :rdfs/subClassOf [:spl/BooleanFunctions :sp/notExists :spin/Functions],
   :spin/returnType :xsd/boolean,
   :spin/symbol "NOT EXISTS"})

(def ^{:private true} notIn
  "Checks whether the value on the left (?arg1) is none of the values on the right (?arg2, ?arg3 ...)."
  {:db/ident :sp/notIn,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Checks whether the value on the left (?arg1) is none of the values on the right (?arg2, ?arg3 ...).",
   :rdfs/label "NOT IN",
   :rdfs/subClassOf [:spl/BooleanFunctions :sp/notIn :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The value to find.",
                     :sp/arg        :sp/arg1,
                     :spl/predicate :sp/arg1},
   :spin/returnType :xsd/boolean,
   :spin/symbol "NOT IN"})

(def ^{:private true} now
  "Gets the current date and time as an xsd:dateTime literal."
  {:db/ident :sp/now,
   :rdf/type :spin/Function,
   :rdfs/comment "Gets the current date and time as an xsd:dateTime literal.",
   :rdfs/label "now",
   :rdfs/subClassOf [:spl/DateFunctions :sp/now :spin/Functions],
   :spin/returnType :xsd/dateTime,
   :spin/symbol "now"})

(def ^{:private true} or
  "Returns the logical OR between two (boolean) operands."
  {:db/ident        :sp/or,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Returns the logical OR between two (boolean) operands.",
   :rdfs/label      "or",
   :rdfs/subClassOf [:spl/BooleanFunctions :sp/or :spin/Functions],
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the first operand",
                      :sp/arg        [:xsd/boolean :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :xsd/boolean}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the second operand",
                      :sp/arg        [:xsd/boolean :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :xsd/boolean}],
   :spin/returnType :xsd/boolean,
   :spin/symbol     "||"})

(def ^{:private true} rand
  "Returns a number between 0 (inclusive) and 1.0e0 (exclusive). Different numbers can be produced every time this function is invoked. Numbers should be produced with approximately equal probability."
  {:db/ident :sp/rand,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns a number between 0 (inclusive) and 1.0e0 (exclusive). Different numbers can be produced every time this function is invoked. Numbers should be produced with approximately equal probability.",
   :rdfs/label "rand",
   :rdfs/seeAlso ["http://www.w3.org/TR/sparql11-query/#idp3722352"],
   :rdfs/subClassOf [:spl/MathematicalFunctions :sp/rand :spin/Functions],
   :spin/returnType :xsd/double,
   :spin/symbol "RAND"})

(def ^{:private true} regex
  "Returns true if a string (?arg1) matches the regular expression supplied as a pattern (?arg2) as influenced by the value of flags (?arg3), otherwise returns false."
  {:db/ident :sp/regex,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns true if a string (?arg1) matches the regular expression supplied as a pattern (?arg2) as influenced by the value of flags (?arg3), otherwise returns false.",
   :rdfs/label "regex",
   :rdfs/seeAlso ["http://www.w3.org/TR/sparql11-query/#func-regex"],
   :rdfs/subClassOf [:spl/StringFunctions :sp/regex :spin/Functions],
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the flags",
                      :sp/arg        [:xsd/string :sp/arg3 true],
                      :spl/optional  true,
                      :spl/predicate :sp/arg3,
                      :spl/valueType :xsd/string}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the match pattern",
                      :sp/arg        [:xsd/string :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :xsd/string}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the input string",
                      :sp/arg        [:xsd/string :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :xsd/string}],
   :spin/returnType :xsd/boolean,
   :spin/symbol "regex"})

(def ^{:private true} replace
  "Replaces each non-overlapping occurrence of a regular expression pattern with a replacement string. Regular expession matching may involve modifier flags."
  {:db/ident :sp/replace,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Replaces each non-overlapping occurrence of a regular expression pattern with a replacement string. Regular expession matching may involve modifier flags.",
   :rdfs/label "replace",
   :rdfs/seeAlso ["http://www.w3.org/TR/sparql11-query/#func-replace"],
   :rdfs/subClassOf [:spl/StringFunctions :sp/replace :spin/Functions],
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "Additional flags for the replacement.",
                      :sp/arg        [:xsd/string :sp/arg4 true],
                      :spl/optional  true,
                      :spl/predicate :sp/arg4,
                      :spl/valueType :xsd/string}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The pattern to replace.\n",
                      :sp/arg        [:xsd/string :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :xsd/string}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The input string.",
                      :sp/arg        [:xsd/string :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :xsd/string}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The replacement string.",
                      :sp/arg        [:xsd/string :sp/arg3],
                      :spl/predicate :sp/arg3,
                      :spl/valueType :xsd/string}],
   :spin/returnType :xsd/string,
   :spin/symbol "REPLACE"})

(def ^{:private true} round
  "Returns the number with no fractional part that is closest to the argument. If there are two such numbers, then the one that is closest to positive infinity is returned. An error is raised if ?arg1 is not a numeric value."
  {:db/ident :sp/round,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns the number with no fractional part that is closest to the argument. If there are two such numbers, then the one that is closest to positive infinity is returned. An error is raised if ?arg1 is not a numeric value.",
   :rdfs/label "round",
   :rdfs/seeAlso ["http://www.w3.org/TR/sparql11-query/#func-round"],
   :rdfs/subClassOf [:spl/MathematicalFunctions :sp/round :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The number to round.",
                     :sp/arg        :sp/arg1,
                     :spl/predicate :sp/arg1},
   :spin/symbol "round"})

(def ^{:private true} sameTerm
  "Returns TRUE if ?arg1 and ?arg2 are the same RDF term as defined in Resource Description Framework (RDF): Concepts and Abstract Syntax; returns FALSE otherwise."
  {:db/ident :sp/sameTerm,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns TRUE if ?arg1 and ?arg2 are the same RDF term as defined in Resource Description Framework (RDF): Concepts and Abstract Syntax; returns FALSE otherwise.",
   :rdfs/label "same term",
   :rdfs/seeAlso ["http://www.w3.org/TR/sparql11-query/#func-sameTerm"],
   :rdfs/subClassOf [:spl/BooleanFunctions :sp/sameTerm :spin/Functions],
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the first argument",
                      :sp/arg        :sp/arg1,
                      :spl/predicate :sp/arg1}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the second argument",
                      :sp/arg        :sp/arg2,
                      :spl/predicate :sp/arg2}],
   :spin/returnType :xsd/boolean,
   :spin/symbol "sameTerm"})

(def ^{:private true} seconds
  "Extracts the seconds from a date/time literal."
  {:db/ident        :sp/seconds,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Extracts the seconds from a date/time literal.",
   :rdfs/label      "seconds",
   :rdfs/subClassOf [:spl/DateFunctions :sp/seconds :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The dateTime or time argument.",
                     :sp/arg        [:rdfs/Literal :sp/arg1],
                     :spl/predicate :sp/arg1,
                     :spl/valueType :rdfs/Literal},
   :spin/returnType :xsd/integer,
   :spin/symbol     "seconds"})

(def ^{:private true} sha1
  "Returns the SHA1 checksum, as a hex digit string, calculated on the UTF-8 representation of the simple literal or lexical form of the xsd:string. Hex digits SHOULD be in lower case."
  {:db/ident :sp/sha1,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns the SHA1 checksum, as a hex digit string, calculated on the UTF-8 representation of the simple literal or lexical form of the xsd:string. Hex digits SHOULD be in lower case.",
   :rdfs/label "sha1",
   :rdfs/seeAlso ["http://www.w3.org/TR/sparql11-query/#func-sha1"],
   :rdfs/subClassOf [:spl/MiscFunctions :sp/sha1 :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The input literal.",
                     :sp/arg        :sp/arg1,
                     :spl/predicate :sp/arg1},
   :spin/returnType :xsd/string,
   :spin/symbol "SHA1"})

(def ^{:private true} sha256
  "Returns the SHA256 checksum, as a hex digit string, calculated on the UTF-8 representation of the simple literal or lexical form of the xsd:string. Hex digits SHOULD be in lower case."
  {:db/ident :sp/sha256,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns the SHA256 checksum, as a hex digit string, calculated on the UTF-8 representation of the simple literal or lexical form of the xsd:string. Hex digits SHOULD be in lower case.",
   :rdfs/label "sha256",
   :rdfs/seeAlso ["http://www.w3.org/TR/sparql11-query/#func-sha256"],
   :rdfs/subClassOf [:spl/MiscFunctions :sp/sha256 :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The input literal.",
                     :sp/arg        :sp/arg1,
                     :spl/predicate :sp/arg1},
   :spin/returnType :xsd/string,
   :spin/symbol "SHA256"})

(def ^{:private true} sha384
  "Returns the SHA384 checksum, as a hex digit string, calculated on the UTF-8 representation of the simple literal or lexical form of the xsd:string. Hex digits SHOULD be in lower case."
  {:db/ident :sp/sha384,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns the SHA384 checksum, as a hex digit string, calculated on the UTF-8 representation of the simple literal or lexical form of the xsd:string. Hex digits SHOULD be in lower case.",
   :rdfs/label "sha384",
   :rdfs/seeAlso ["http://www.w3.org/TR/sparql11-query/#func-sha384"],
   :rdfs/subClassOf [:spl/MiscFunctions :sp/sha384 :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The input literal.",
                     :sp/arg        :sp/arg1,
                     :spl/predicate :sp/arg1},
   :spin/returnType :xsd/string,
   :spin/symbol "SHA384"})

(def ^{:private true} sha512
  "Returns the SHA512 checksum, as a hex digit string, calculated on the UTF-8 representation of the simple literal or lexical form of the xsd:string. Hex digits SHOULD be in lower case."
  {:db/ident :sp/sha512,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns the SHA512 checksum, as a hex digit string, calculated on the UTF-8 representation of the simple literal or lexical form of the xsd:string. Hex digits SHOULD be in lower case.",
   :rdfs/label "sha512",
   :rdfs/seeAlso ["http://www.w3.org/TR/sparql11-query/#func-sha512"],
   :rdfs/subClassOf [:spl/MiscFunctions :sp/sha512 :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The input literal.",
                     :sp/arg        :sp/arg1,
                     :spl/predicate :sp/arg1},
   :spin/returnType :xsd/string,
   :spin/symbol "SHA512"})

(def ^{:private true} str
  "Returns the lexical form of ?arg1 (a literal); returns the codepoint representation of ?arg1 (an IRI). This is useful for examining parts of an IRI, for instance, the host-name."
  {:db/ident :sp/str,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns the lexical form of ?arg1 (a literal); returns the codepoint representation of ?arg1 (an IRI). This is useful for examining parts of an IRI, for instance, the host-name.",
   :rdfs/label "str",
   :rdfs/subClassOf [:spl/StringFunctions :sp/str :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "the node to convert to string",
                     :sp/arg        :sp/arg1,
                     :spl/predicate :sp/arg1},
   :spin/returnType :xsd/string,
   :spin/symbol "str"})

(def ^{:private true} strafter
  "Returns a literal of the same kind (simple literal, plain literal same language tag, xsd:string) as the first argument arg1. The lexical form of the result is the substring of the value of arg1 that proceeds in arg1 the first occurrence of the lexical form of arg2; otherwise the lexical form of the result is the empty string. If the lexical form of arg2 is the empty string, the lexical form of the result is the emprty string."
  {:db/ident :sp/strafter,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns a literal of the same kind (simple literal, plain literal same language tag, xsd:string) as the first argument arg1. The lexical form of the result is the substring of the value of arg1 that proceeds in arg1 the first occurrence of the lexical form of arg2; otherwise the lexical form of the result is the empty string. If the lexical form of arg2 is the empty string, the lexical form of the result is the emprty string.",
   :rdfs/label "strafter",
   :rdfs/seeAlso ["http://www.w3.org/TR/sparql11-query/#func-strafter"],
   :rdfs/subClassOf [:spl/StringFunctions :sp/strafter :spin/Functions],
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The input string.",
                      :sp/arg        [:xsd/string :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :xsd/string}
                     {:rdf/type [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment
                      "The pattern to find within the input string.",
                      :sp/arg [:xsd/string :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :xsd/string}],
   :spin/returnType :xsd/string,
   :spin/symbol "STRAFTER"})

(def ^{:private true} strbefore
  "Returns a literal of the same kind (simple literal, plain literal same language tag, xsd:string) as the first argument arg1. The lexical form of the result is the substring of the value of arg1 that precedes in arg1 the first occurrence of the lexical form of arg2; otherwise the lexical form of the result is the empty string. If the lexical form of arg2 is the empty string, the lexical form of the result is the emprty string."
  {:db/ident :sp/strbefore,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns a literal of the same kind (simple literal, plain literal same language tag, xsd:string) as the first argument arg1. The lexical form of the result is the substring of the value of arg1 that precedes in arg1 the first occurrence of the lexical form of arg2; otherwise the lexical form of the result is the empty string. If the lexical form of arg2 is the empty string, the lexical form of the result is the emprty string.",
   :rdfs/label "strbefore",
   :rdfs/seeAlso ["http://www.w3.org/TR/sparql11-query/#func-strbefore"],
   :rdfs/subClassOf [:spl/StringFunctions :sp/strbefore :spin/Functions],
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The input string.",
                      :sp/arg        [:xsd/string :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :xsd/string}
                     {:rdf/type [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment
                      "The pattern to find within the input string.",
                      :sp/arg [:xsd/string :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :xsd/string}],
   :spin/returnType :xsd/string,
   :spin/symbol "STRBEFORE"})

(def ^{:private true} strdt
  "Constructs a literal with lexical form and type as specified by the arguments."
  {:db/ident :sp/strdt,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Constructs a literal with lexical form and type as specified by the arguments.",
   :rdfs/label "strdt",
   :rdfs/seeAlso ["http://www.w3.org/TR/sparql11-query/#func-strdt"],
   :rdfs/subClassOf [:spl/OntologyFunctions :sp/strdt :spin/Functions],
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The lexical form of the new literal.",
                      :sp/arg        [:xsd/string :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :xsd/string}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The datatype of the new literal.",
                      :sp/arg        [:rdfs/Datatype :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :rdfs/Datatype}],
   :spin/symbol "STRDT"})

(def ^{:private true} strends
  "Returns true if the lexical form of ?arg1 ends with the lexical form of ?arg2, otherwise it returns false."
  {:db/ident :sp/strends,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns true if the lexical form of ?arg1 ends with the lexical form of ?arg2, otherwise it returns false.",
   :rdfs/label "strends",
   :rdfs/seeAlso ["http://www.w3.org/TR/sparql11-query/#func-ends"],
   :rdfs/subClassOf [:spl/StringFunctions :sp/strends :spin/Functions],
   :spin/constraint
   [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "The input string.",
     :sp/arg        [:xsd/string :sp/arg1],
     :spl/predicate :sp/arg1,
     :spl/valueType :xsd/string}
    {:rdf/type [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment
     "The sub-string that the input string is supposed to end with.",
     :sp/arg [:xsd/string :sp/arg2],
     :spl/predicate :sp/arg2,
     :spl/valueType :xsd/string}],
   :spin/returnType :xsd/boolean,
   :spin/symbol "STRENDS"})

(def ^{:private true} strlang
  "Takes a string (?arg1) and a language (?arg2) and constructs a literal with a corresponding language tag."
  {:db/ident :sp/strlang,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Takes a string (?arg1) and a language (?arg2) and constructs a literal with a corresponding language tag.",
   :rdfs/label "strlang",
   :rdfs/seeAlso ["http://www.w3.org/TR/sparql11-query/#func-strlang"],
   :rdfs/subClassOf [:spl/StringFunctions :sp/strlang :spin/Functions],
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The string value.",
                      :sp/arg        [:xsd/string :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :xsd/string}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The language tag, e.g. \"en-AU\".",
                      :sp/arg        [:xsd/string :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :xsd/string}],
   :spin/returnType :rdf/langString,
   :spin/symbol "STRLANG"})

(def ^{:private true} strlen
  "Computes the length of a given input string."
  {:db/ident        :sp/strlen,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Computes the length of a given input string.",
   :rdfs/label      "strlen",
   :rdfs/seeAlso    ["http://www.w3.org/TR/sparql11-query/#func-strlen"],
   :rdfs/subClassOf [:spl/StringFunctions :sp/strlen :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The input string.",
                     :sp/arg        [:xsd/string :sp/arg1],
                     :spl/predicate :sp/arg1,
                     :spl/valueType :xsd/string},
   :spin/returnType :xsd/integer,
   :spin/symbol     "STRLEN"})

(def ^{:private true} strstarts
  "Returns true if the lexical form of ?arg1 begins with the lexical form of ?arg2, otherwise it returns false."
  {:db/ident :sp/strstarts,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns true if the lexical form of ?arg1 begins with the lexical form of ?arg2, otherwise it returns false.",
   :rdfs/label "strstarts",
   :rdfs/seeAlso ["http://www.w3.org/TR/sparql11-query/#func-starts"],
   :rdfs/subClassOf [:spl/StringFunctions :sp/strstarts :spin/Functions],
   :spin/constraint
   [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment  "The input string.",
     :sp/arg        [:xsd/string :sp/arg1],
     :spl/predicate :sp/arg1,
     :spl/valueType :xsd/string}
    {:rdf/type [:spl/Argument :spin/ConstructTemplates],
     :rdfs/comment
     "The sub-string that the input string is supposed to begin with.",
     :sp/arg [:xsd/string :sp/arg2],
     :spl/predicate :sp/arg2,
     :spl/valueType :xsd/string}],
   :spin/returnType :xsd/boolean,
   :spin/symbol "STRSTARTS"})

(def ^{:private true} struuid
  "Returns a string that is the scheme specific part of UUID. That is, as a simple literal, the result of generating a UUID, converting to a simple literal and removing the initial urn:uuid:."
  {:db/ident :sp/struuid,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns a string that is the scheme specific part of UUID. That is, as a simple literal, the result of generating a UUID, converting to a simple literal and removing the initial urn:uuid:.",
   :rdfs/label "struuid",
   :rdfs/subClassOf [:spl/StringFunctions :sp/struuid :spin/Functions],
   :spin/returnType :xsd/string,
   :spin/symbol "STRUUID"})

(def ^{:private true} sub
  "Returns the arithmetic difference of its operands."
  {:db/ident        :sp/sub,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Returns the arithmetic difference of its operands.",
   :rdfs/label      "sub",
   :rdfs/subClassOf [:spl/MathematicalFunctions :sp/sub :spin/Functions],
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the first operand",
                      :sp/arg        [:rdfs/Literal :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdfs/Literal}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "the second operand",
                      :sp/arg        [:rdfs/Literal :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :rdfs/Literal}],
   :spin/symbol     "-"})

(def ^{:private true} substr
  "Gets the sub-string of a given string. The index of the first character is 1."
  {:db/ident :sp/substr,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Gets the sub-string of a given string. The index of the first character is 1.",
   :rdfs/label "substr",
   :rdfs/seeAlso ["http://www.w3.org/TR/sparql11-query/#func-substr"],
   :rdfs/subClassOf [:spl/StringFunctions :sp/substr :spin/Functions],
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The end index.",
                      :sp/arg        [:xsd/integer :sp/arg3 true],
                      :spl/optional  true,
                      :spl/predicate :sp/arg3,
                      :spl/valueType :xsd/integer}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The start index.",
                      :sp/arg        [:xsd/integer :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :xsd/integer}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The input string.",
                      :sp/arg        [:xsd/string :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :xsd/string}],
   :spin/returnType :xsd/string,
   :spin/symbol "SUBSTR"})

(def ^{:private true} timezone
  "Returns the timezone part of ?arg1 as an xsd:dayTimeDuration. Raises an error if there is no timezone."
  {:db/ident :sp/timezone,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns the timezone part of ?arg1 as an xsd:dayTimeDuration. Raises an error if there is no timezone.",
   :rdfs/label "timezone",
   :rdfs/seeAlso ["http://www.w3.org/TR/sparql11-query/#func-timezone"],
   :rdfs/subClassOf [:spl/DateFunctions :sp/timezone :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The input time.",
                     :sp/arg        [:xsd/dateTime :sp/arg1],
                     :spl/predicate :sp/arg1,
                     :spl/valueType :xsd/dateTime},
   :spin/returnType :xsd/duration,
   :spin/symbol "TIMEZONE"})

(def ^{:private true} tz
  "Returns the timezone part of ?arg1 as a simple literal. Returns the empty string if there is no timezone."
  {:db/ident :sp/tz,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns the timezone part of ?arg1 as a simple literal. Returns the empty string if there is no timezone.",
   :rdfs/label "tz",
   :rdfs/seeAlso ["http://www.w3.org/TR/sparql11-query/#func-tz"],
   :rdfs/subClassOf [:spl/DateFunctions :sp/tz :spin/Functions],
   :spin/symbol "TZ"})

(def ^{:private true} ucase
  "Converts a string to upper case characters."
  {:db/ident        :sp/ucase,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Converts a string to upper case characters.",
   :rdfs/label      "UCASE",
   :rdfs/seeAlso    ["http://www.w3.org/TR/sparql11-query/#func-ucase"],
   :rdfs/subClassOf [:spl/StringFunctions :sp/ucase :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The input string.",
                     :sp/arg        [:xsd/string :sp/arg1],
                     :spl/predicate :sp/arg1,
                     :spl/valueType :xsd/string},
   :spin/returnType :xsd/string,
   :spin/symbol     "UCASE"})

(def ^{:private true} unaryMinus
  "Returns the operand ?arg1 with the sign reversed. If ?arg1 is positive, its negative is returned; if it is negative, its positive is returned."
  {:db/ident :sp/unaryMinus,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns the operand ?arg1 with the sign reversed. If ?arg1 is positive, its negative is returned; if it is negative, its positive is returned.",
   :rdfs/label "unary minus",
   :rdfs/subClassOf [:spl/MathematicalFunctions :sp/unaryMinus :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "the operand",
                     :sp/arg        [:rdfs/Literal :sp/arg1],
                     :spl/predicate :sp/arg1,
                     :spl/valueType :rdfs/Literal},
   :spin/symbol "-"})

(def ^{:private true} unaryPlus
  "Returns the operand ?arg1 with the sign unchanged. Semantically, this operation performs no operation."
  {:db/ident :sp/unaryPlus,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Returns the operand ?arg1 with the sign unchanged. Semantically, this operation performs no operation.",
   :rdfs/label "unary plus",
   :rdfs/subClassOf [:spl/MathematicalFunctions :sp/unaryPlus :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "the operand",
                     :sp/arg        [:rdfs/Literal :sp/arg1],
                     :spl/predicate :sp/arg1,
                     :spl/valueType :rdfs/Literal},
   :spin/symbol "+"})

(def ^{:private true} uri
  "Equivalent to IRI."
  {:db/ident        :sp/uri,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Equivalent to IRI.",
   :rdfs/label      "URI",
   :rdfs/subClassOf [:spl/OntologyFunctions :sp/uri :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The IRI string to convert to a resource.",
                     :sp/arg        [:xsd/string :sp/arg1],
                     :spl/predicate :sp/arg1,
                     :spl/valueType :xsd/string},
   :spin/returnType :rdfs/Resource,
   :spin/symbol     "URI"})

(def ^{:private true} year
  "Extracts the year from a date/time literal."
  {:db/ident        :sp/year,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Extracts the year from a date/time literal.",
   :rdfs/label      "year",
   :rdfs/subClassOf [:spl/DateFunctions :sp/year :spin/Functions],
   :spin/constraint {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                     :rdfs/comment  "The date or dateTime argument.",
                     :sp/arg        [:rdfs/Literal :sp/arg1],
                     :spl/predicate :sp/arg1,
                     :spl/valueType :rdfs/Literal},
   :spin/returnType :xsd/integer,
   :spin/symbol     "year"})

(def ^{:private true} ConstructTemplate
  {:db/ident        :spin/ConstructTemplate,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :spin/ConstructTemplate})

(def ^{:private true} ConstructTemplates
  {:db/ident        :spin/ConstructTemplates,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :spin/ConstructTemplates})

(def ^{:private true} Functions
  {:db/ident        :spin/Functions,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :spin/Functions})

(def ^{:private true} MagicProperties
  {:db/ident        :spin/MagicProperties,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :spin/MagicProperties})

(def ^{:private true} SelectTemplates
  {:db/ident        :spin/SelectTemplates,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :spin/SelectTemplates})

(def ^{:private true} Template
  {:db/ident        :spin/Template,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :spin/Template})

(def ^{:private true} eval
  {:db/ident :spin/eval,
   :spin/constraint
   {:rdf/type [:spl/Argument :spin/ConstructTemplates],
    :rdfs/comment
    "The expression to evaluate. Should be a sp:Select, sp:Ask, a sp:Variable or an instance of a SPARQL function class, but may also be a simple RDF value.",
    :sp/arg :sp/arg1,
    :spl/predicate :sp/arg1}})

(def ^{:private true} violatesConstraints
  {:db/ident        :spin/violatesConstraints,
   :spin/constraint [{:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The instance to check.",
                      :sp/arg        [:rdfs/Resource :sp/arg1],
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdfs/Resource}
                     {:rdf/type      [:spl/Argument :spin/ConstructTemplates],
                      :rdfs/comment  "The class to get the constraints of.",
                      :sp/arg        [:rdfs/Class :sp/arg2],
                      :spl/predicate :sp/arg2,
                      :spl/valueType :rdfs/Class}]})
