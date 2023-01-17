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
   :rdf/type :owl/Ontology,
   :rdf/uri "http://spinrdf.org/spl",
   :rdfa/prefix "spl",
   :rdfa/uri "http://spinrdf.org/spl#",
   :rdfs/comment
   "A collection of generally useful SPARQL functions (expressed as SPIN functions), and SPIN templates. Also provides a top-level classification of functions, and definitions of the standard SPARQL functions.",
   :rdfs/label "SPIN Standard Library"}
  (:refer-clojure :exclude [class count max min]))

(def AllArguments
  "Gets a list of all spl:Arguments declared at a given class and its superclasses."
  {:db/ident :spl/AllArguments,
   :rdf/type :spin/SelectTemplate,
   :rdfs/comment
   "Gets a list of all spl:Arguments declared at a given class and its superclasses.",
   :rdfs/label "All arguments",
   :rdfs/subClassOf :spin/SelectTemplates,
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
   :spin/constraint {:rdf/type      :spl/Argument,
                     :rdfs/comment  "The class to get the arguments of.",
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
   :rdfs/subClassOf :spin/ConstructTemplates,
   :spin/body
   {:rdf/type :sp/Construct,
    :sp/templates [{:sp/object    :spin/ConstraintViolation,
                    :sp/predicate :rdf/type,
                    :sp/subject   nil}
                   {:sp/object    :spin/_this,
                    :sp/predicate :spin/violationRoot,
                    :sp/subject   nil}
                   {:sp/object    {:sp/varName "predicate"},
                    :sp/predicate :spin/violationPath,
                    :sp/subject   nil}
                   {:sp/object    {:sp/varName "label"},
                    :sp/predicate :rdfs/label,
                    :sp/subject   nil}],
    :sp/where
    [[{:rdf/type      :sp/Filter,
       :sp/expression {:rdf/type :sp/isIRI,
                       :sp/arg1  :spin/_this}}]
     {:rdf/type :sp/Union,
      :sp/elements
      [[[[{:rdf/type      :sp/Filter,
           :sp/expression {:rdf/type :sp/or,
                           :sp/arg1  {:rdf/type :sp/not,
                                      :sp/arg1  {:rdf/type :sp/bound,
                                                 :sp/arg1  {:sp/varName
                                                            "optional"}}},
                           :sp/arg2  {:rdf/type :sp/eq,
                                      :sp/arg1  {:sp/varName "optional"},
                                      :sp/arg2  false}}}]
         {:rdf/type      :sp/Filter,
          :sp/expression {:rdf/type    :sp/notExists,
                          :sp/elements [{:sp/object    {:sp/varName "value"},
                                         :sp/predicate {:sp/varName
                                                        "predicate"},
                                         :sp/subject   :spin/_this}]}}
         {:rdf/type      :sp/Filter,
          :sp/expression {:rdf/type    :sp/notExists,
                          :sp/elements [{:sp/object    {:sp/varName "template"},
                                         :sp/predicate :rdf/type,
                                         :sp/subject   :spin/_this}
                                        {:rdf/type :sp/Filter,
                                         :sp/expression
                                         {:rdf/type :spl/instanceOf,
                                          :sp/arg1  {:sp/varName "template"},
                                          :sp/arg2  :spl/UnionTemplate}}]}}]
        {:rdf/type      :sp/Bind,
         :sp/expression {:rdf/type :sp/concat,
                         :sp/arg1  "Missing value for argument ",
                         :sp/arg2  {:rdf/type :afn/localname,
                                    :sp/arg1  {:sp/varName "predicate"}}},
         :sp/variable   {:sp/varName "label"}}]
       [[[{:rdf/type      :sp/Filter,
           :sp/expression {:rdf/type :sp/bound,
                           :sp/arg1  {:sp/varName "valueType"}}}]
         {:sp/object    {:sp/varName "value"},
          :sp/predicate {:sp/varName "predicate"},
          :sp/subject   :spin/_this}
         {:rdf/type      :sp/Filter,
          :sp/expression {:rdf/type :sp/and,
                          :sp/arg1  {:rdf/type :sp/not,
                                     :sp/arg1  {:rdf/type :spl/instanceOf,
                                                :sp/arg1  {:sp/varName "value"},
                                                :sp/arg2  {:sp/varName
                                                           "valueType"}}},
                          :sp/arg2  {:rdf/type :sp/or,
                                     :sp/arg1  {:rdf/type :sp/ne,
                                                :sp/arg1  {:sp/varName
                                                           "valueType"},
                                                :sp/arg2  :rdfs/Resource},
                                     :sp/arg2  {:rdf/type :sp/isLiteral,
                                                :sp/arg1  {:sp/varName
                                                           "value"}}}}}]
        {:rdf/type      :sp/Bind,
         :sp/expression {:rdf/type :sp/concat,
                         :sp/arg1  "Incorrect type of argument ",
                         :sp/arg2  {:rdf/type :afn/localname,
                                    :sp/arg1  {:sp/varName "predicate"}},
                         :sp/arg3  " (expected: ",
                         :sp/arg4  {:rdf/type :afn/localname,
                                    :sp/arg1  {:sp/varName "valueType"}},
                         :sp/arg5  ")"},
         :sp/variable   {:sp/varName "label"}}]]}]},
   :spin/constraint
   [{:rdf/type      :spl/Argument,
     :rdfs/comment  "the property holding the values of each function call",
     :spl/predicate :spl/predicate,
     :spl/valueType :rdf/Property}
    {:rdf/type      :spl/Argument,
     :rdfs/comment  "indicates whether the argument is optional",
     :spl/optional  true,
     :spl/predicate :spl/optional,
     :spl/valueType :xsd/boolean}
    {:rdf/type      :spl/Argument,
     :rdfs/comment  "the default value for the argument",
     :spl/optional  true,
     :spl/predicate :spl/defaultValue}
    {:rdf/type      :spl/Argument,
     :rdfs/comment  "a comment describing the argument",
     :spl/optional  true,
     :spl/predicate :rdfs/comment,
     :spl/valueType :xsd/string}
    {:rdf/type      :spl/Argument,
     :rdfs/comment  "the value type of the argument",
     :spl/optional  true,
     :spl/predicate :spl/valueType,
     :spl/valueType :rdfs/Class}],
   :spin/labelTemplate "Argument {?predicate} : {?valueType}"})

(def Attribute
  "Defines an \"attribute\" of a class. Attribute definitions bundle common modeling patterns known from object-oriented languages like UML. Each attribute can have min and max cardinality, a value type and a default value. The attribute links a class with one RDF property. This template should be used as spin:constraints on a class to make sure that classes meet the expected cardinalities and valueType constraints. If a model wants to use spl:defaultValue, then it should instantiate the spl:ConstructDefaultValues as a spin:constructor at some root class, such as rdfs:Resource."
  {:db/ident :spl/Attribute,
   :rdf/type :spin/ConstructTemplate,
   :rdfs/comment
   "Defines an \"attribute\" of a class. Attribute definitions bundle common modeling patterns known from object-oriented languages like UML. Each attribute can have min and max cardinality, a value type and a default value. The attribute links a class with one RDF property. This template should be used as spin:constraints on a class to make sure that classes meet the expected cardinalities and valueType constraints.\nIf a model wants to use spl:defaultValue, then it should instantiate the spl:ConstructDefaultValues as a spin:constructor at some root class, such as rdfs:Resource.",
   :rdfs/label "Attribute",
   :rdfs/subClassOf :spin/ConstructTemplates,
   :spin/body
   {:rdf/type :sp/Construct,
    :sp/templates [{:sp/object    :spin/ConstraintViolation,
                    :sp/predicate :rdf/type,
                    :sp/subject   nil}
                   {:sp/object    :spin/_this,
                    :sp/predicate :spin/violationRoot,
                    :sp/subject   nil}
                   {:sp/object    {:sp/varName "predicate"},
                    :sp/predicate :spin/violationPath,
                    :sp/subject   nil}],
    :sp/where
    [{:rdf/type :sp/Filter,
      :sp/expression
      {:rdf/type :sp/or,
       :sp/arg1  {:rdf/type :sp/or,
                  :sp/arg1  {:rdf/type :sp/and,
                             :sp/arg1  {:rdf/type :sp/bound,
                                        :sp/arg1  {:sp/varName "minCount"}},
                             :sp/arg2  {:rdf/type :sp/lt,
                                        :sp/arg1  {:rdf/type :spl/objectCount,
                                                   :sp/arg1  :spin/_this,
                                                   :sp/arg2  {:sp/varName
                                                              "predicate"}},
                                        :sp/arg2  {:sp/varName "minCount"}}},
                  :sp/arg2  {:rdf/type :sp/and,
                             :sp/arg1  {:rdf/type :sp/bound,
                                        :sp/arg1  {:sp/varName "maxCount"}},
                             :sp/arg2  {:rdf/type :sp/gt,
                                        :sp/arg1  {:rdf/type :spl/objectCount,
                                                   :sp/arg1  :spin/_this,
                                                   :sp/arg2  {:sp/varName
                                                              "predicate"}},
                                        :sp/arg2  {:sp/varName "maxCount"}}}},
       :sp/arg2  {:rdf/type    :sp/exists,
                  :sp/elements [[{:rdf/type      :sp/Filter,
                                  :sp/expression {:rdf/type :sp/bound,
                                                  :sp/arg1  {:sp/varName
                                                             "valueType"}}}]
                                {:sp/object    {:sp/varName "value"},
                                 :sp/predicate {:sp/varName "predicate"},
                                 :sp/subject   :spin/_this}
                                {:rdf/type      :sp/Filter,
                                 :sp/expression {:rdf/type :sp/not,
                                                 :sp/arg1
                                                 {:rdf/type :spl/instanceOf,
                                                  :sp/arg1 {:sp/varName
                                                            "value"},
                                                  :sp/arg2
                                                  {:sp/varName
                                                   "valueType"}}}}]}}}]},
   :spin/constraint
   [{:rdf/type      :spl/Argument,
     :rdfs/comment  "a comment describing the meaning of this attribute",
     :spl/optional  true,
     :spl/predicate :rdfs/comment,
     :spl/valueType :xsd/string}
    {:rdf/type      :spl/Argument,
     :rdfs/comment  "the minimum number of values permitted for the property",
     :spl/optional  true,
     :spl/predicate :spl/minCount,
     :spl/valueType :xsd/integer}
    {:rdf/type      :spl/Argument,
     :rdfs/comment  "the maximum number of values permitted for the property",
     :spl/optional  true,
     :spl/predicate :spl/maxCount,
     :spl/valueType :xsd/integer}
    {:rdf/type      :spl/Argument,
     :rdfs/comment  "the type that all values of the property must have",
     :spl/optional  true,
     :spl/predicate :spl/valueType,
     :spl/valueType :rdfs/Class}
    {:rdf/type      :spl/Argument,
     :rdfs/comment  "the RDF property holding the attribute value",
     :spl/predicate :spl/predicate,
     :spl/valueType :rdf/Property}
    {:rdf/type      :spl/Argument,
     :rdfs/comment  "the default value of the attribute",
     :spl/optional  true,
     :spl/predicate :spl/defaultValue}],
   :spin/labelTemplate
   "Attribute {?predicate} : {?valueType} [{?minCount},{?maxCount}]"})

(def BooleanFunctions
  "A collection of functions that return a boolean value (true or false)."
  {:db/ident :spl/BooleanFunctions,
   :rdf/type :spin/Function,
   :rdfs/comment
   "A collection of functions that return a boolean value (true or false).",
   :rdfs/label "Boolean functions",
   :rdfs/subClassOf :spin/Functions,
   :spin/abstract true})

(def ConstraintTemplate
  "Metaclass for CONSTRUCT templates that create spin:ConstraintViolations and can be used as values of spin:constraint."
  {:db/ident :spl/ConstraintTemplate,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Metaclass for CONSTRUCT templates that create spin:ConstraintViolations and can be used as values of spin:constraint.",
   :rdfs/label "Constraint template",
   :rdfs/subClassOf :spin/ConstructTemplate})

(def ConstraintTemplates
  "Abstract superclass of templates that can be used as spin:constraints. The subclasses are expected to construct spin:ConstraintViolations and use ?this to talk about the instances of the associated class."
  {:db/ident :spl/ConstraintTemplates,
   :rdf/type :spl/ConstraintTemplate,
   :rdfs/comment
   "Abstract superclass of templates that can be used as spin:constraints. The subclasses are expected to construct spin:ConstraintViolations and use ?this to talk about the instances of the associated class.",
   :rdfs/label "Constraint templates",
   :rdfs/subClassOf :spin/ConstructTemplates,
   :spin/abstract true})

(def ConstructDefaultValues
  "This template can be attached as spin:constructor to a root class such as rdfs:Resource to ensure that SPIN processors assign default values to certain properties. Looks for any templates attached as spin:constraints to the types of ?this and then assigns their declared spl:defaultValues."
  {:db/ident :spl/ConstructDefaultValues,
   :rdf/type :spin/ConstructTemplate,
   :rdfs/comment
   "This template can be attached as spin:constructor to a root class such as rdfs:Resource to ensure that SPIN processors assign default values to certain properties. Looks for any templates attached as spin:constraints to the types of ?this and then assigns their declared spl:defaultValues.",
   :rdfs/label "Construct default values",
   :rdfs/subClassOf :spin/ConstructTemplates,
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
   :rdf/type :spl/ConstraintTemplate,
   :rdfs/comment
   "Abstract superclass of property constraints that compare the number of values with either min or max count.",
   :rdfs/label "Count property constraint templates",
   :rdfs/subClassOf :spl/PropertyConstraintTemplates,
   :spin/abstract true,
   :spin/constraint
   [{:rdf/type      :spl/Argument,
     :rdfs/comment  "The maximum number of values that the property must have.",
     :spl/optional  true,
     :spl/predicate :spl/maxCount,
     :spl/valueType :xsd/integer}
    {:rdf/type      :spl/Argument,
     :rdfs/comment  "The minimum number of values that the property must have.",
     :spl/optional  true,
     :spl/predicate :spl/minCount,
     :spl/valueType :xsd/integer}]})

(def DateFunctions
  "A collection of functions that operate on date/time literals."
  {:db/ident :spl/DateFunctions,
   :rdf/type :spin/Function,
   :rdfs/comment
   "A collection of functions that operate on date/time literals.",
   :rdfs/label "Date functions",
   :rdfs/subClassOf :spin/Functions,
   :spin/abstract true})

(def ExistencePropertyPairConstraint
  "Existence property pair constraint"
  {:db/ident :spl/ExistencePropertyPairConstraint,
   :rdf/type :spl/ConstraintTemplate,
   :rdfs/label "Existence property pair constraint",
   :rdfs/subClassOf :spl/PropertyPairConstraintTemplates,
   :spin/body {:rdf/type :sp/Construct,
               :sp/templates [{:sp/object    :spin/ConstraintViolation,
                               :sp/predicate :rdf/type,
                               :sp/subject   nil}
                              {:sp/object    :spin/_this,
                               :sp/predicate :spin/violationRoot,
                               :sp/subject   nil}
                              {:sp/object    {:sp/varName "property"},
                               :sp/predicate :spin/violationPath,
                               :sp/subject   nil}
                              {:sp/object    {:sp/varName "message"},
                               :sp/predicate :rdfs/label,
                               :sp/subject   nil}],
               :sp/where
               [{:rdf/type      :sp/Filter,
                 :sp/expression {:rdf/type    :sp/exists,
                                 :sp/elements [{:sp/object    {:sp/varName
                                                               "someValue"},
                                                :sp/predicate {:sp/varName
                                                               "otherProperty"},
                                                :sp/subject   :spin/_this}]}}
                {:rdf/type      :sp/Filter,
                 :sp/expression {:rdf/type    :sp/notExists,
                                 :sp/elements [{:sp/object    {:sp/varName
                                                               "object"},
                                                :sp/predicate {:sp/varName
                                                               "property"},
                                                :sp/subject   :spin/_this}]}}
                {:rdf/type      :sp/Bind,
                 :sp/expression {:rdf/type :sp/concat,
                                 :sp/arg1  "Property ",
                                 :sp/arg2  {:rdf/type :sp/str,
                                            :sp/arg1  {:sp/varName "property"}},
                                 :sp/arg3  " must have a value because ",
                                 :sp/arg4  {:rdf/type :sp/str,
                                            :sp/arg1  {:sp/varName
                                                       "otherProperty"}},
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
   :rdfs/subClassOf :spin/ConstructTemplates,
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
                    :sp/expression {:rdf/type :sp/not,
                                    :sp/arg1  {:rdf/type :sp/bound,
                                               :sp/arg1  {:sp/varName
                                                          "anyValue"}}}}]},
   :spin/constraint [{:rdf/type      :spl/Argument,
                      :rdfs/comment  "The default value to infer.",
                      :spl/predicate :spl/defaultValue}
                     {:rdf/type :spl/Argument,
                      :rdfs/comment
                      "The predicate to infer the default value of.",
                      :spl/predicate :spl/predicate,
                      :spl/valueType :rdf/Property}],
   :spin/labelTemplate "Default value for {?predicate}: {?defaultValue}"})

(def LessThanOtherPropertyPairConstraint
  "Can be used to define a constraint between two properties (?property and ?otherProperty) enforcing the invariant that the values of ?property must be smaller than the values of ?otherProperty. For example this can be used to state that ex:startDate must be < ex:endDate."
  {:db/ident :spl/LessThanOtherPropertyPairConstraint,
   :rdf/type :spl/ConstraintTemplate,
   :rdfs/comment
   "Can be used to define a constraint between two properties (?property and ?otherProperty) enforcing the invariant that the values of ?property must be smaller than the values of ?otherProperty. For example this can be used to state that ex:startDate must be < ex:endDate.",
   :rdfs/label "Less than other property pair constraint",
   :rdfs/subClassOf :spl/PropertyPairConstraintTemplates,
   :spin/body {:rdf/type :sp/Construct,
               :sp/templates [{:sp/object    :spin/ConstraintViolation,
                               :sp/predicate :rdf/type,
                               :sp/subject   nil}
                              {:sp/object    {:sp/varName "property"},
                               :sp/predicate :spin/violationPath,
                               :sp/subject   nil}
                              {:sp/object    {:sp/varName "value"},
                               :sp/predicate :spin/violationValue,
                               :sp/subject   nil}
                              {:sp/object    :spin/_this,
                               :sp/predicate :spin/violationRoot,
                               :sp/subject   nil}
                              {:sp/object    {:sp/varName "label"},
                               :sp/predicate :rdfs/label,
                               :sp/subject   nil}],
               :sp/where
               [{:sp/object    {:sp/varName "value"},
                 :sp/predicate {:sp/varName "property"},
                 :sp/subject   :spin/_this}
                {:sp/object    {:sp/varName "otherValue"},
                 :sp/predicate {:sp/varName "otherProperty"},
                 :sp/subject   :spin/_this}
                {:rdf/type      :sp/Filter,
                 :sp/expression {:rdf/type :sp/ge,
                                 :sp/arg1  {:sp/varName "value"},
                                 :sp/arg2  {:sp/varName "otherValue"}}}
                {:rdf/type      :sp/Bind,
                 :sp/expression {:rdf/type :sp/concat,
                                 :sp/arg1  "Value ",
                                 :sp/arg2  {:rdf/type :sp/str,
                                            :sp/arg1  {:sp/varName "value"}},
                                 :sp/arg3  " of ",
                                 :sp/arg4  {:rdf/type :sp/str,
                                            :sp/arg1  {:sp/varName "property"}},
                                 :sp/arg5  " must be less than ",
                                 :sp/arg6  {:rdf/type :sp/str,
                                            :sp/arg1  {:sp/varName
                                                       "otherValue"}},
                                 :sp/arg7  " of ",
                                 :sp/arg8  {:rdf/type :sp/str,
                                            :sp/arg1  {:sp/varName
                                                       "otherProperty"}}},
                 :sp/variable   {:sp/varName "label"}}]},
   :spin/labelTemplate
   "Values of {?property} must be less than the values of {?otherProperty}"})

(def MathematicalFunctions
  "A collection of functions operating on numbers."
  {:db/ident        :spl/MathematicalFunctions,
   :rdf/type        :spin/Function,
   :rdfs/comment    "A collection of functions operating on numbers.",
   :rdfs/label      "Mathematical functions",
   :rdfs/subClassOf :spin/Functions,
   :spin/abstract   true})

(def MiscFunctions
  "A collection of functions that are difficult to categorize."
  {:db/ident :spl/MiscFunctions,
   :rdf/type :spin/Function,
   :rdfs/comment "A collection of functions that are difficult to categorize.",
   :rdfs/label "Misc functions",
   :rdfs/subClassOf :spin/Functions,
   :spin/abstract true})

(def NonExistencePropertyPairConstraint
  "Non-existence property pair constraint"
  {:db/ident :spl/NonExistencePropertyPairConstraint,
   :rdf/type :spl/ConstraintTemplate,
   :rdfs/label "Non-existence property pair constraint",
   :rdfs/subClassOf :spl/PropertyPairConstraintTemplates,
   :spin/body {:rdf/type :sp/Construct,
               :sp/templates [{:sp/object    :spin/ConstraintViolation,
                               :sp/predicate :rdf/type,
                               :sp/subject   nil}
                              {:sp/object    :spin/_this,
                               :sp/predicate :spin/violationRoot,
                               :sp/subject   nil}
                              {:sp/object    {:sp/varName "property"},
                               :sp/predicate :spin/violationPath,
                               :sp/subject   nil}
                              {:sp/object    {:sp/varName "message"},
                               :sp/predicate :rdfs/label,
                               :sp/subject   nil}],
               :sp/where
               [{:rdf/type      :sp/Filter,
                 :sp/expression {:rdf/type    :sp/notExists,
                                 :sp/elements [{:sp/object    {:sp/varName
                                                               "someValue"},
                                                :sp/predicate {:sp/varName
                                                               "otherProperty"},
                                                :sp/subject   :spin/_this}]}}
                {:rdf/type      :sp/Filter,
                 :sp/expression {:rdf/type    :sp/exists,
                                 :sp/elements [{:sp/object    {:sp/varName
                                                               "object"},
                                                :sp/predicate {:sp/varName
                                                               "property"},
                                                :sp/subject   :spin/_this}]}}
                {:rdf/type      :sp/Bind,
                 :sp/expression {:rdf/type :sp/concat,
                                 :sp/arg1  "Property ",
                                 :sp/arg2  {:rdf/type :sp/str,
                                            :sp/arg1  {:sp/varName "property"}},
                                 :sp/arg3  " must have no values because ",
                                 :sp/arg4  {:rdf/type :sp/str,
                                            :sp/arg1  {:sp/varName
                                                       "otherProperty"}},
                                 :sp/arg5  " has none"},
                 :sp/variable   {:sp/varName "message"}}]},
   :spin/labelTemplate
   "The property {?property} must have no values as long as {?otherProperty} has none"})

(def ObjectCountPropertyConstraint
  "Represents a constraint that can be attached to a class to specify that a given property must have between min and max values."
  {:db/ident :spl/ObjectCountPropertyConstraint,
   :rdf/type :spl/ConstraintTemplate,
   :rdfs/comment
   "Represents a constraint that can be attached to a class to specify that a given property must have between min and max values.",
   :rdfs/label "Object count property constraint",
   :rdfs/subClassOf :spl/CountPropertyConstraintTemplates,
   :spin/body
   {:rdf/type :sp/Construct,
    :sp/templates [{:sp/object    :spin/ConstraintViolation,
                    :sp/predicate :rdf/type,
                    :sp/subject   nil}
                   {:sp/object    :spin/_this,
                    :sp/predicate :spin/violationRoot,
                    :sp/subject   nil}
                   {:sp/object    {:sp/varName "property"},
                    :sp/predicate :spin/violationPath,
                    :sp/subject   nil}
                   {:sp/object    {:sp/varName "message"},
                    :sp/predicate :rdfs/label,
                    :sp/subject   nil}],
    :sp/where
    [{:rdf/type      :sp/Bind,
      :sp/expression {:rdf/type :spl/objectCount,
                      :sp/arg1  :spin/_this,
                      :sp/arg2  {:sp/varName "property"}},
      :sp/variable   {:sp/varName "objectCount"}}
     {:rdf/type      :sp/Filter,
      :sp/expression {:rdf/type :sp/or,
                      :sp/arg1  {:rdf/type :sp/and,
                                 :sp/arg1  {:rdf/type :sp/bound,
                                            :sp/arg1  {:sp/varName "minCount"}},
                                 :sp/arg2  {:rdf/type :sp/lt,
                                            :sp/arg1  {:sp/varName
                                                       "objectCount"},
                                            :sp/arg2  {:sp/varName
                                                       "minCount"}}},
                      :sp/arg2  {:rdf/type :sp/and,
                                 :sp/arg1  {:rdf/type :sp/bound,
                                            :sp/arg1  {:sp/varName "maxCount"}},
                                 :sp/arg2  {:rdf/type :sp/gt,
                                            :sp/arg1  {:sp/varName
                                                       "objectCount"},
                                            :sp/arg2  {:sp/varName
                                                       "maxCount"}}}}}
     {:rdf/type      :sp/Bind,
      :sp/expression {:rdf/type :sp/concat,
                      :sp/arg1  "Invalid number of values: ",
                      :sp/arg2  {:rdf/type :sp/str,
                                 :sp/arg1  {:sp/varName "objectCount"}}},
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
   :rdfs/subClassOf :spin/Functions,
   :spin/abstract true})

(def PrimaryKeyPropertyConstraint
  "Specifies that the given property is a primary key for instances of the associated class (and its subclasses). If a property has been declared to be the primary key then each instance of the class must have exactly one value for that property. Furthermore, the URIs of those instances must start with a given string (arg:uriStart), followed by the URL-encoded primary key value. For example if arg:uriStart is \"http://example.org/country-\" and the primary key for an instance is \"de\" then the URI must be \"http://example.org/country-de\". Finally, as a result of the URI policy, there can not be any other instance with the same value under the same primary key policy."
  {:db/ident :spl/PrimaryKeyPropertyConstraint,
   :rdf/type :spl/ConstraintTemplate,
   :rdfs/comment
   "Specifies that the given property is a primary key for instances of the associated class (and its subclasses). If a property has been declared to be the primary key then each instance of the class must have exactly one value for that property. Furthermore, the URIs of those instances must start with a given string (arg:uriStart), followed by the URL-encoded primary key value. For example if arg:uriStart is \"http://example.org/country-\" and the primary key for an instance is \"de\" then the URI must be \"http://example.org/country-de\". Finally, as a result of the URI policy, there can not be any other instance with the same value under the same primary key policy.",
   :rdfs/label "Primary key property constraint",
   :rdfs/subClassOf :spl/PropertyConstraintTemplates,
   :spin/body
   {:rdf/type :sp/Construct,
    :sp/templates [{:sp/object    :spin/ConstraintViolation,
                    :sp/predicate :rdf/type,
                    :sp/subject   nil}
                   {:sp/object    {:sp/varName "label"},
                    :sp/predicate :rdfs/label,
                    :sp/subject   nil}
                   {:sp/object    :spin/_this,
                    :sp/predicate :spin/violationRoot,
                    :sp/subject   nil}
                   {:sp/object    {:sp/varName "property"},
                    :sp/predicate :spin/violationPath,
                    :sp/subject   nil}],
    :sp/where
    [{:rdf/type :sp/Union,
      :sp/elements
      [[{:rdf/type      :sp/Filter,
         :sp/expression {:rdf/type    :sp/notExists,
                         :sp/elements [{:sp/object    {:sp/varName "any"},
                                        :sp/predicate {:sp/varName "property"},
                                        :sp/subject   :spin/_this}]}}
        {:rdf/type      :sp/Bind,
         :sp/expression "Missing value for primary key property",
         :sp/variable   {:sp/varName "label"}}]
       [{:rdf/type      :sp/Filter,
         :sp/expression {:rdf/type :sp/gt,
                         :sp/arg1  {:rdf/type :spl/objectCount,
                                    :sp/arg1  :spin/_this,
                                    :sp/arg2  {:sp/varName "property"}},
                         :sp/arg2  1}}
        {:rdf/type      :sp/Bind,
         :sp/expression "Multiple values of primary key property",
         :sp/variable   {:sp/varName "label"}}]
       [{:rdf/type      :sp/Filter,
         :sp/expression {:rdf/type :sp/eq,
                         :sp/arg1  {:rdf/type :spl/objectCount,
                                    :sp/arg1  :spin/_this,
                                    :sp/arg2  {:sp/varName "property"}},
                         :sp/arg2  1}}
        {:sp/object    {:sp/varName "value"},
         :sp/predicate {:sp/varName "property"},
         :sp/subject   :spin/_this}
        {:rdf/type      :sp/Bind,
         :sp/expression {:rdf/type :sp/concat,
                         :sp/arg1  {:sp/varName "uriStart"},
                         :sp/arg2  {:rdf/type :sp/encode_for_uri,
                                    :sp/arg1  {:rdf/type :xsd/string,
                                               :sp/arg1  {:sp/varName
                                                          "value"}}}},
         :sp/variable   {:sp/varName "uri"}}
        {:rdf/type      :sp/Filter,
         :sp/expression {:rdf/type :sp/ne,
                         :sp/arg1  {:rdf/type :xsd/string,
                                    :sp/arg1  :spin/_this},
                         :sp/arg2  {:sp/varName "uri"}}}
        {:rdf/type      :sp/Bind,
         :sp/expression {:rdf/type :sp/concat,
                         :sp/arg1  "Primary key value ",
                         :sp/arg2  {:rdf/type :sp/str,
                                    :sp/arg1  {:sp/varName "value"}},
                         :sp/arg3  " does not align with the expected URI ",
                         :sp/arg4  {:sp/varName "uri"}},
         :sp/variable   {:sp/varName "label"}}]]}]},
   :spin/constraint
   [{:rdf/type     :sp/Ask,
     :rdfs/comment "rdfs:label cannot be used as primary key",
     :sp/where     [{:sp/object    :rdfs/label,
                     :sp/predicate :sp/arg,
                     :sp/subject   :spin/_this}]}
    {:rdf/type :spl/Argument,
     :rdfs/comment
     "The start of the URIs of well-formed instances of the associated class.",
     :spl/predicate :sp/arg,
     :spl/valueType :xsd/string}],
   :spin/labelTemplate
   "The property {?property} is the primary key and URIs start with {?uriStart}"})

(def PropertyConstraintTemplates
  "Abstract superclass of constraint templates that constrain exactly one property."
  {:db/ident :spl/PropertyConstraintTemplates,
   :rdf/type :spl/ConstraintTemplate,
   :rdfs/comment
   "Abstract superclass of constraint templates that constrain exactly one property.",
   :rdfs/label "Property constraint templates",
   :rdfs/subClassOf :spl/ConstraintTemplates,
   :spin/abstract true,
   :spin/constraint {:rdf/type      :spl/Argument,
                     :rdfs/comment  "The property being constrained.",
                     :spl/predicate :sp/arg,
                     :spl/valueType :rdf/Property}})

(def PropertyPairConstraintTemplates
  "Abstract base class for templates that take two properties as arguments and establish a relationship between them."
  {:db/ident :spl/PropertyPairConstraintTemplates,
   :rdf/type :spl/ConstraintTemplate,
   :rdfs/comment
   "Abstract base class for templates that take two properties as arguments and establish a relationship between them.",
   :rdfs/label "Property pair constraint templates",
   :rdfs/subClassOf :spl/PropertyConstraintTemplates,
   :spin/abstract true,
   :spin/constraint {:rdf/type      :spl/Argument,
                     :rdfs/comment  "The \"other\" property.",
                     :spl/predicate :sp/arg/otherProperty,
                     :spl/valueType :rdf/Property}})

(def RangePropertyConstraint
  "Represents a constraint that narrows down a property by a minimum and maximum value compared by <= and >=."
  {:db/ident :spl/RangePropertyConstraint,
   :rdf/type :spl/ConstraintTemplate,
   :rdfs/comment
   "Represents a constraint that narrows down a property by a minimum and maximum value compared by <= and >=.",
   :rdfs/label "Range property constraint",
   :rdfs/subClassOf :spl/PropertyConstraintTemplates,
   :spin/body
   {:rdf/type :sp/Construct,
    :sp/templates [{:sp/object    :spin/ConstraintViolation,
                    :sp/predicate :rdf/type,
                    :sp/subject   nil}
                   {:sp/object    :spin/_this,
                    :sp/predicate :spin/violationRoot,
                    :sp/subject   nil}
                   {:sp/object    {:sp/varName "property"},
                    :sp/predicate :spin/violationPath,
                    :sp/subject   nil}
                   {:sp/object    {:sp/varName "object"},
                    :sp/predicate :spin/violationValue,
                    :sp/subject   nil}
                   {:sp/object    {:sp/varName "message"},
                    :sp/predicate :rdfs/label,
                    :sp/subject   nil}],
    :sp/where
    [{:sp/object    {:sp/varName "object"},
      :sp/predicate {:sp/varName "property"},
      :sp/subject   :spin/_this}
     {:rdf/type      :sp/Filter,
      :sp/expression {:rdf/type :sp/or,
                      :sp/arg1  {:rdf/type :sp/and,
                                 :sp/arg1  {:rdf/type :sp/bound,
                                            :sp/arg1  {:sp/varName "min"}},
                                 :sp/arg2  {:rdf/type :sp/lt,
                                            :sp/arg1  {:sp/varName "object"},
                                            :sp/arg2  {:sp/varName "min"}}},
                      :sp/arg2  {:rdf/type :sp/and,
                                 :sp/arg1  {:rdf/type :sp/bound,
                                            :sp/arg1  {:sp/varName "max"}},
                                 :sp/arg2  {:rdf/type :sp/gt,
                                            :sp/arg1  {:sp/varName "object"},
                                            :sp/arg2  {:sp/varName "max"}}}}}
     {:rdf/type      :sp/Bind,
      :sp/expression {:rdf/type :sp/concat,
                      :sp/arg1  "Value ",
                      :sp/arg2  {:rdf/type :sp/str,
                                 :sp/arg1  {:sp/varName "object"}},
                      :sp/arg3  " must be in the interval [",
                      :sp/arg4  {:rdf/type :sp/str,
                                 :sp/arg1  {:sp/varName "min"}},
                      :sp/arg5  ", ",
                      :sp/arg6  {:rdf/type :sp/str,
                                 :sp/arg1  {:sp/varName "max"}},
                      :sp/arg7  "]"},
      :sp/variable   {:sp/varName "message"}}]},
   :spin/constraint [{:rdf/type      :spl/Argument,
                      :rdfs/comment  "The maximum value.",
                      :spl/optional  true,
                      :spl/predicate :spl/max,
                      :spl/valueType :rdfs/Literal}
                     {:rdf/type      :spl/Argument,
                      :rdfs/comment  "The minimum value.",
                      :spl/optional  true,
                      :spl/predicate :spl/min,
                      :spl/valueType :rdfs/Literal}],
   :spin/labelTemplate
   "Values of {?property} must be within the interval [ {?min} , {?max} ]"})

(def RegexPropertyConstraint
  "Regex property constraint"
  {:db/ident :spl/RegexPropertyConstraint,
   :rdf/type :spl/ConstraintTemplate,
   :rdfs/label "Regex property constraint",
   :rdfs/subClassOf :spl/PropertyConstraintTemplates,
   :spin/body
   {:rdf/type     :sp/Construct,
    :sp/templates [{:sp/object    :spin/ConstraintViolation,
                    :sp/predicate :rdf/type,
                    :sp/subject   nil}
                   {:sp/object    :spin/_this,
                    :sp/predicate :spin/violationRoot,
                    :sp/subject   nil}
                   {:sp/object    {:sp/varName "property"},
                    :sp/predicate :spin/violationPath,
                    :sp/subject   nil}
                   {:sp/object    {:sp/varName "message"},
                    :sp/predicate :rdfs/label,
                    :sp/subject   nil}],
    :sp/where     [{:sp/object    {:sp/varName "object"},
                    :sp/predicate {:sp/varName "property"},
                    :sp/subject   :spin/_this}
                   {:rdf/type      :sp/Filter,
                    :sp/expression {:rdf/type :sp/not,
                                    :sp/arg1  {:rdf/type :sp/regex,
                                               :sp/arg1  {:rdf/type :xsd/string,
                                                          :sp/arg1  {:sp/varName
                                                                     "object"}},
                                               :sp/arg2  {:sp/varName
                                                          "pattern"}}}}
                   {:rdf/type      :sp/Bind,
                    :sp/expression {:rdf/type :sp/concat,
                                    :sp/arg1 "Value ",
                                    :sp/arg2 {:rdf/type :sp/str,
                                              :sp/arg1  {:sp/varName "object"}},
                                    :sp/arg3
                                    " must match the regular expression \"",
                                    :sp/arg4 {:sp/varName "pattern"},
                                    :sp/arg5 "\""},
                    :sp/variable   {:sp/varName "message"}}]},
   :spin/constraint {:rdf/type      :spl/Argument,
                     :rdfs/comment  "The regular expression to match.",
                     :spl/predicate :xsd/pattern,
                     :spl/valueType :xsd/string},
   :spin/labelTemplate
   "Values of {?property} must match the regular expression {?pattern}"})

(def RunTestCases
  "Runs all spl:TestCases on the current model."
  {:db/ident :spl/RunTestCases,
   :rdf/type :spin/SelectTemplate,
   :rdfs/comment "Runs all spl:TestCases on the current model.",
   :rdfs/label "Run test cases",
   :rdfs/subClassOf :spin/SelectTemplates,
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
               {:rdf/type      :sp/Filter,
                :sp/expression {:rdf/type :sp/or,
                                :sp/arg1  {:rdf/type :sp/ne,
                                           :sp/arg1  {:rdf/type :sp/bound,
                                                      :sp/arg1  {:sp/varName
                                                                 "expected"}},
                                           :sp/arg2  {:rdf/type :sp/bound,
                                                      :sp/arg1  {:sp/varName
                                                                 "actual"}}},
                                :sp/arg2  {:rdf/type :sp/and,
                                           :sp/arg1  {:rdf/type :sp/bound,
                                                      :sp/arg1  {:sp/varName
                                                                 "expected"}},
                                           :sp/arg2  {:rdf/type :sp/ne,
                                                      :sp/arg1 {:sp/varName
                                                                "actual"},
                                                      :sp/arg2
                                                      {:sp/varName
                                                       "expected"}}}}}]}})

(def SPINOverview
  "Finds all constraints and rules attached to classes in the current graph, using spin:constraint, spin:constructor, spin:rule or their sub-properties. The result set will contain the associated class, the predicate, and the SPIN rule."
  {:db/ident :spl/SPINOverview,
   :rdf/type :spin/SelectTemplate,
   :rdfs/comment
   "Finds all constraints and rules attached to classes in the current graph, using spin:constraint, spin:constructor, spin:rule or their sub-properties. The result set will contain the associated class, the predicate, and the SPIN rule.",
   :rdfs/label "SPIN Overview",
   :rdfs/subClassOf :spin/SelectTemplates,
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
      :sp/expression {:rdf/type :sp/ne,
                      :sp/arg1  {:sp/varName "class"},
                      :sp/arg2  :spin/Modules}}
     {:rdf/type      :sp/Filter,
      :sp/expression {:rdf/type    :sp/notExists,
                      :sp/elements [{:sp/object    :spl/Argument,
                                     :sp/predicate :rdf/type,
                                     :sp/subject   {:sp/varName "rule"}}]}}
     {:rdf/type      :sp/Filter,
      :sp/expression {:rdf/type    :sp/notExists,
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
   :rdfs/subClassOf :spin/Functions,
   :spin/abstract   true})

(def StringLengthPropertyConstraint
  "Represents a constraint that narrows down a property by a minimum and maximum length of the characters of the string representation of its values. This constraint is typically used for string literals, but may also be useful for integers (e.g. 4 digit numbers), and may even be used to limit the length of URIs."
  {:db/ident :spl/StringLengthPropertyConstraint,
   :rdf/type :spl/ConstraintTemplate,
   :rdfs/comment
   "Represents a constraint that narrows down a property by a minimum and maximum length of the characters of the string representation of its values. This constraint is typically used for string literals, but may also be useful for integers (e.g. 4 digit numbers), and may even be used to limit the length of URIs.",
   :rdfs/label "String length property constraint",
   :rdfs/subClassOf :spl/PropertyConstraintTemplates,
   :spin/body
   {:rdf/type :sp/Construct,
    :sp/templates [{:sp/object    :spin/ConstraintViolation,
                    :sp/predicate :rdf/type,
                    :sp/subject   nil}
                   {:sp/object    :spin/_this,
                    :sp/predicate :spin/violationRoot,
                    :sp/subject   nil}
                   {:sp/object    {:sp/varName "property"},
                    :sp/predicate :spin/violationPath,
                    :sp/subject   nil}
                   {:sp/object    {:sp/varName "object"},
                    :sp/predicate :spin/violationValue,
                    :sp/subject   nil}
                   {:sp/object    {:sp/varName "message"},
                    :sp/predicate :rdfs/label,
                    :sp/subject   nil}],
    :sp/where
    [{:sp/object    {:sp/varName "object"},
      :sp/predicate {:sp/varName "property"},
      :sp/subject   :spin/_this}
     {:rdf/type      :sp/Bind,
      :sp/expression {:rdf/type :sp/strlen,
                      :sp/arg1  {:rdf/type :sp/str,
                                 :sp/arg1  {:sp/varName "object"}}},
      :sp/variable   {:sp/varName "length"}}
     {:rdf/type      :sp/Filter,
      :sp/expression {:rdf/type :sp/or,
                      :sp/arg1  {:rdf/type :sp/lt,
                                 :sp/arg1  {:sp/varName "length"},
                                 :sp/arg2  {:rdf/type :sp/coalesce,
                                            :sp/arg1  {:sp/varName "minLength"},
                                            :sp/arg2  0}},
                      :sp/arg2  {:rdf/type :sp/and,
                                 :sp/arg1  {:rdf/type :sp/bound,
                                            :sp/arg1  {:sp/varName
                                                       "maxLength"}},
                                 :sp/arg2  {:rdf/type :sp/gt,
                                            :sp/arg1  {:sp/varName "length"},
                                            :sp/arg2  {:sp/varName
                                                       "maxLength"}}}}}
     {:rdf/type      :sp/Bind,
      :sp/expression {:rdf/type :sp/concat,
                      :sp/arg1  "Value ",
                      :sp/arg2  {:rdf/type :sp/str,
                                 :sp/arg1  {:sp/varName "object"}},
                      :sp/arg3  " must have between ",
                      :sp/arg4  {:rdf/type :sp/str,
                                 :sp/arg1  {:sp/varName "minLength"}},
                      :sp/arg5  " and ",
                      :sp/arg6  {:rdf/type :sp/str,
                                 :sp/arg1  {:sp/varName "maxLength"}},
                      :sp/arg7  " characters"},
      :sp/variable   {:sp/varName "message"}}]},
   :spin/constraint
   [{:rdf/type      :spl/Argument,
     :rdfs/comment  "The maximum number of characters (defaults to unlimited).",
     :spl/optional  true,
     :spl/predicate :spl/maxLength,
     :spl/valueType :xsd/integer}
    {:rdf/type      :spl/Argument,
     :rdfs/comment  "The minimum number of characters (default to 0).",
     :spl/optional  true,
     :spl/predicate :spl/minLength,
     :spl/valueType :xsd/integer}],
   :spin/labelTemplate
   "Values of {?property} must have between {?minLength} and {?maxLength} characters"})

(def Test-instanceOf-lingualString
  {:db/ident           :spl/Test-instanceOf-lingualString,
   :rdf/type           :spl/TestCase,
   :spl/testExpression {:rdf/type :spl/instanceOf,
                        :sp/arg1  {:rdf/language "en",
                                   :rdf/value    "test"},
                        :sp/arg2  :xsd/string},
   :spl/testResult     true})

(def Test-instanceOf-rdfsClass
  {:db/ident           :spl/Test-instanceOf-rdfsClass,
   :rdf/type           :spl/TestCase,
   :spl/testExpression {:rdf/type :spl/instanceOf,
                        :sp/arg1  :owl/Thing,
                        :sp/arg2  :rdfs/Class},
   :spl/testResult     true})

(def Test-instanceOf-rdfsClass-false
  {:db/ident           :spl/Test-instanceOf-rdfsClass-false,
   :rdf/type           :spl/TestCase,
   :spl/testExpression {:rdf/type :spl/instanceOf,
                        :sp/arg1  :owl/versionInfo,
                        :sp/arg2  :rdfs/Class},
   :spl/testResult     false})

(def Test-instanceOf-rdfsClassInheritance
  {:db/ident           :spl/Test-instanceOf-rdfsClassInheritance,
   :rdf/type           :spl/TestCase,
   :spl/testExpression {:rdf/type :spl/instanceOf,
                        :sp/arg1  :owl/Restriction,
                        :sp/arg2  :rdfs/Class},
   :spl/testResult     true})

(def Test-instanceOf-rdfsLiteral
  {:db/ident           :spl/Test-instanceOf-rdfsLiteral,
   :rdf/type           :spl/TestCase,
   :spl/testExpression {:rdf/type :spl/instanceOf,
                        :sp/arg1  "test",
                        :sp/arg2  :rdfs/Literal},
   :spl/testResult     true})

(def Test-instanceOf-rdfsLiteral-false
  {:db/ident           :spl/Test-instanceOf-rdfsLiteral-false,
   :rdf/type           :spl/TestCase,
   :spl/testExpression {:rdf/type :spl/instanceOf,
                        :sp/arg1  :owl/Thing,
                        :sp/arg2  :rdfs/Literal},
   :spl/testResult     false})

(def Test-instanceOf-typedString
  {:db/ident           :spl/Test-instanceOf-typedString,
   :rdf/type           :spl/TestCase,
   :spl/testExpression {:rdf/type :spl/instanceOf,
                        :sp/arg1  "test",
                        :sp/arg2  :xsd/string},
   :spl/testResult     true})

(def Test-instanceOf-typedString-false
  {:db/ident           :spl/Test-instanceOf-typedString-false,
   :rdf/type           :spl/TestCase,
   :spl/testExpression {:rdf/type :spl/instanceOf,
                        :sp/arg1  "test",
                        :sp/arg2  :xsd/integer},
   :spl/testResult     false})

(def Test-instanceOf-untypedString
  {:db/ident           :spl/Test-instanceOf-untypedString,
   :rdf/type           :spl/TestCase,
   :spl/testExpression {:rdf/type :spl/instanceOf,
                        :sp/arg1  "test",
                        :sp/arg2  :xsd/string},
   :spl/testResult     true})

(def Test-object-labelOfArgument
  {:db/ident           :spl/Test-object-labelOfArgument,
   :rdf/type           :spl/TestCase,
   :spl/testExpression {:rdf/type :sp/Select,
                        :sp/resultVariables [{:sp/varName "value"}],
                        :sp/where [{:rdf/type :sp/NamedGraph,
                                    :sp/elements [{:rdf/type :sp/Bind,
                                                   :sp/expression
                                                   {:rdf/type :spl/object,
                                                    :sp/arg1  :spl/Argument,
                                                    :sp/arg2  :rdfs/label},
                                                   :sp/variable {:sp/varName
                                                                 "value"}}],
                                    :sp/graphNameNode
                                    "http://spinrdf.org/spl"}]},
   :spl/testResult     "Argument"})

(def Test-object-noValue
  {:db/ident :spl/Test-object-noValue,
   :rdf/type :spl/TestCase,
   :spl/testExpression {:rdf/type :spl/object,
                        :sp/arg1  :owl/versionInfo,
                        :sp/arg2  :owl/versionInfo}})

(def TestCase
  "A test to verify that a SPIN function or magic property works as expected, and to generate documentation of example uses of the function. Each TestCase consists of a SPARQL function call or an expression that can be executed with spin:eval, and an expected result. The test framework only needs to execute spin:eval on the expression and compare it with the expected result."
  {:db/ident :spl/TestCase,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A test to verify that a SPIN function or magic property works as expected, and to generate documentation of example uses of the function. Each TestCase consists of a SPARQL function call or an expression that can be executed with spin:eval, and an expected result. The test framework only needs to execute spin:eval on the expression and compare it with the expected result.",
   :rdfs/label "Test case",
   :rdfs/subClassOf :rdfs/Resource,
   :spin/constraint
   [{:rdf/type :spl/Argument,
     :rdfs/comment
     "The expected result of the test case, or nothing to indicate that an error is expected.",
     :spl/optional true,
     :spl/predicate :spl/testResult}
    {:rdf/type :spl/Argument,
     :rdfs/comment
     "The test expression or SELECT query (anything that can be evaluated with spin:eval).",
     :spl/predicate :spl/testExpression}]})

(def TypePropertyConstraint
  "Represents a constraint that narrows down the rdf:type of the values of a property."
  {:db/ident :spl/TypePropertyConstraint,
   :rdf/type :spl/ConstraintTemplate,
   :rdfs/comment
   "Represents a constraint that narrows down the rdf:type of the values of a property.",
   :rdfs/label "Type property constraint",
   :rdfs/subClassOf :spl/PropertyConstraintTemplates,
   :spin/body
   {:rdf/type     :sp/Construct,
    :sp/templates [{:sp/object    :spin/ConstraintViolation,
                    :sp/predicate :rdf/type,
                    :sp/subject   nil}
                   {:sp/object    :spin/_this,
                    :sp/predicate :spin/violationRoot,
                    :sp/subject   nil}
                   {:sp/object    {:sp/varName "property"},
                    :sp/predicate :spin/violationPath,
                    :sp/subject   nil}
                   {:sp/object    {:sp/varName "object"},
                    :sp/predicate :spin/violationValue,
                    :sp/subject   nil}
                   {:sp/object    {:sp/varName "message"},
                    :sp/predicate :rdfs/label,
                    :sp/subject   nil}],
    :sp/where     [{:sp/object    {:sp/varName "object"},
                    :sp/predicate {:sp/varName "property"},
                    :sp/subject   :spin/_this}
                   {:rdf/type      :sp/Filter,
                    :sp/expression {:rdf/type :sp/not,
                                    :sp/arg1  {:rdf/type :spl/instanceOf,
                                               :sp/arg1  {:sp/varName "object"},
                                               :sp/arg2  {:sp/varName "type"}}}}
                   {:rdf/type      :sp/Bind,
                    :sp/expression {:rdf/type :sp/concat,
                                    :sp/arg1  "Value ",
                                    :sp/arg2  {:rdf/type :sp/str,
                                               :sp/arg1  {:sp/varName
                                                          "object"}},
                                    :sp/arg3  " must have the type ",
                                    :sp/arg4  {:rdf/type :sp/str,
                                               :sp/arg1  {:sp/varName "type"}}},
                    :sp/variable   {:sp/varName "message"}}]},
   :spin/constraint
   {:rdf/type :spl/Argument,
    :rdfs/comment
    "The class that the values must have as their rdf:type (or a subclass thereof).",
    :spl/predicate :rdf/type,
    :spl/valueType :rdfs/Class},
   :spin/labelTemplate "Values of {?property} must have the type {?type}"})

(def URIFunctions
  "A collection of functions that create URI resources."
  {:db/ident        :spl/URIFunctions,
   :rdf/type        :spin/Function,
   :rdfs/comment    "A collection of functions that create URI resources.",
   :rdfs/label      "URI functions",
   :rdfs/subClassOf :spin/Functions,
   :spin/abstract   true})

(def UnionTemplate
  "This type can be used for templates that serve as the union (or \"collector\") of other templates. Union templates differ from other templates in that all spl:Arguments are optional. This means that union templates can be declared as subclasses of multiple other templates, yet when instantiated, only some of the arguments defined by the superclasses need to be filled in."
  {:db/ident :spl/UnionTemplate,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "This type can be used for templates that serve as the union (or \"collector\") of other templates. Union templates differ from other templates in that all spl:Arguments are optional. This means that union templates can be declared as subclasses of multiple other templates, yet when instantiated, only some of the arguments defined by the superclasses need to be filled in.",
   :rdfs/label "Union template",
   :rdfs/subClassOf :spin/Template})

(def UniquePropertyValueConstraint
  "Reports an error if the given property has a value that is also used elsewhere, for the same property."
  {:db/ident :spl/UniquePropertyValueConstraint,
   :rdf/type :spl/ConstraintTemplate,
   :rdfs/comment
   "Reports an error if the given property has a value that is also used elsewhere, for the same property.",
   :rdfs/label "Unique property value constraint",
   :rdfs/subClassOf :spl/PropertyConstraintTemplates,
   :spin/body
   {:rdf/type     :sp/Construct,
    :sp/templates [{:sp/object    :spin/ConstraintViolation,
                    :sp/predicate :rdf/type,
                    :sp/subject   nil}
                   {:sp/object    {:sp/varName "label"},
                    :sp/predicate :rdfs/label,
                    :sp/subject   nil}
                   {:sp/object    :spin/_this,
                    :sp/predicate :spin/violationRoot,
                    :sp/subject   nil}
                   {:sp/object    {:sp/varName "property"},
                    :sp/predicate :spin/violationPath,
                    :sp/subject   nil}
                   {:sp/object    {:sp/varName "value"},
                    :sp/predicate :spin/violationValue,
                    :sp/subject   nil}],
    :sp/where     [{:sp/object    {:sp/varName "value"},
                    :sp/predicate {:sp/varName "property"},
                    :sp/subject   :spin/_this}
                   {:rdf/type      :sp/Filter,
                    :sp/expression {:rdf/type    :sp/exists,
                                    :sp/elements [{:sp/object    {:sp/varName
                                                                  "value"},
                                                   :sp/predicate {:sp/varName
                                                                  "property"},
                                                   :sp/subject   {:sp/varName
                                                                  "other"}}
                                                  {:rdf/type :sp/Filter,
                                                   :sp/expression
                                                   {:rdf/type :sp/ne,
                                                    :sp/arg1  :spin/_this,
                                                    :sp/arg2  {:sp/varName
                                                               "other"}}}]}}
                   {:rdf/type      :sp/Bind,
                    :sp/expression {:rdf/type :sp/concat,
                                    :sp/arg1
                                    "Property must have a unique value, but ",
                                    :sp/arg2 {:rdf/type :sp/str,
                                              :sp/arg1  {:sp/varName "value"}},
                                    :sp/arg3 "  already exists elsewhere. "},
                    :sp/variable   {:sp/varName "label"}}]},
   :spin/labelTemplate "Values of {?property} must be unique"})

(def UntypedObjectPropertyConstraint
  "A generic SPIN template that can be used to declare a constraint that all values of a given property must have an rdf:type."
  {:db/ident :spl/UntypedObjectPropertyConstraint,
   :rdf/type :spl/ConstraintTemplate,
   :rdfs/comment
   "A generic SPIN template that can be used to declare a constraint that all values of a given property must have an rdf:type.",
   :rdfs/label "Untyped object property constraint",
   :rdfs/subClassOf :spl/PropertyConstraintTemplates,
   :spin/body
   {:rdf/type     :sp/Construct,
    :sp/templates [{:sp/object    :spin/ConstraintViolation,
                    :sp/predicate :rdf/type,
                    :sp/subject   nil}
                   {:sp/object    :spin/_this,
                    :sp/predicate :spin/violationRoot,
                    :sp/subject   nil}
                   {:sp/object    {:sp/varName "property"},
                    :sp/predicate :spin/violationPath,
                    :sp/subject   nil}
                   {:sp/object    {:sp/varName "message"},
                    :sp/predicate :rdfs/label,
                    :sp/subject   nil}],
    :sp/where     [{:sp/object    {:sp/varName "object"},
                    :sp/predicate {:sp/varName "property"},
                    :sp/subject   :spin/_this}
                   {:rdf/type      :sp/Filter,
                    :sp/expression {:rdf/type    :sp/notExists,
                                    :sp/elements [{:sp/object    {:sp/varName
                                                                  "anyType"},
                                                   :sp/predicate :rdf/type,
                                                   :sp/subject   {:sp/varName
                                                                  "object"}}]}}
                   {:rdf/type      :sp/Bind,
                    :sp/expression {:rdf/type :sp/concat,
                                    :sp/arg1  "Value ",
                                    :sp/arg2  {:rdf/type :sp/str,
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
   :rdfs/subPropertyOf :sp/arg})

(def count
  "count"
  {:db/ident           :spl/count,
   :rdf/type           :rdf/Property,
   :rdfs/label         "count",
   :rdfs/subPropertyOf :sp/arg})

(def defaultValue
  "default value"
  {:db/ident           :spl/defaultValue,
   :rdf/type           :rdf/Property,
   :rdfs/label         "default value",
   :rdfs/subPropertyOf :sp/arg})

(def hasArgument
  "Checks if a given module class (?module) has at least one declared spl:Argument."
  {:db/ident :spl/hasArgument,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Checks if a given module class (?module) has at least one declared spl:Argument.",
   :rdfs/label "has argument",
   :rdfs/subClassOf :spl/BooleanFunctions,
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
   :spin/constraint {:rdf/type      :spl/Argument,
                     :rdfs/comment  "The module class to check.",
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
   :rdfs/subClassOf :spl/OntologyFunctions,
   :spin/body {:rdf/type :sp/Ask,
               :sp/where [{:rdf/type      :sp/Bind,
                           :sp/expression {:spl/class {:sp/varName "class"},
                                           :rdf/type  :spl/primaryKeyProperty},
                           :sp/variable   {:sp/varName "primaryKey"}}
                          {:rdf/type      :sp/Filter,
                           :sp/expression {:rdf/type :sp/bound,
                                           :sp/arg1  {:sp/varName
                                                      "primaryKey"}}}]},
   :spin/constraint {:rdf/type      :spl/Argument,
                     :rdfs/comment  "The class to get the primary key of.",
                     :spl/predicate :spl/class,
                     :spl/valueType :rdfs/Class},
   :spin/returnType :xsd/boolean})

(def hasValue
  "Checks whether a given resource (?arg1) has a given value (?arg3) for a given property (?arg2) or one of the sub-properties of it."
  {:db/ident :spl/hasValue,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Checks whether a given resource (?arg1) has a given value (?arg3) for a given property (?arg2) or one of the sub-properties of it.",
   :rdfs/label "hasValue",
   :rdfs/subClassOf :spl/BooleanFunctions,
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
   [{:rdf/type      :spl/Argument,
     :rdfs/comment  "the subject that is expected to have the value",
     :spl/predicate :sp/arg1,
     :spl/valueType :rdfs/Resource}
    {:rdf/type      :spl/Argument,
     :rdfs/comment  "the property that is expected to hold the value",
     :spl/predicate :sp/arg2,
     :spl/valueType :rdf/Property}
    {:rdf/type      :spl/Argument,
     :rdfs/comment  "the expected value",
     :spl/predicate :sp/arg3}],
   :spin/returnType :xsd/boolean})

(def hasValueOfType
  "Checks whether a given subject (?arg1) has at least one value of a given type (?arg3) for a given property (?arg2) or one of its sub-properties."
  {:db/ident :spl/hasValueOfType,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Checks whether a given subject (?arg1) has at least one value of a given type (?arg3) for a given property (?arg2) or one of its sub-properties.",
   :rdfs/label "hasValueOfType",
   :rdfs/subClassOf :spl/BooleanFunctions,
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
                           :sp/expression {:rdf/type :spl/instanceOf,
                                           :sp/arg1  {:sp/varName "value"},
                                           :sp/arg2  :spin/_arg3}}]},
   :spin/constraint [{:rdf/type :spl/Argument,
                      :rdfs/comment
                      "the subject that is expected to have the value",
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdfs/Resource}
                     {:rdf/type      :spl/Argument,
                      :rdfs/comment  "the expected property",
                      :spl/predicate :sp/arg2,
                      :spl/valueType :rdf/Property}
                     {:rdf/type      :spl/Argument,
                      :rdfs/comment  "the type to match against",
                      :spl/predicate :sp/arg3,
                      :spl/valueType :rdfs/Class}],
   :spin/returnType :xsd/boolean})

(def instance
  "instance"
  {:db/ident           :spl/instance,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :sp/Query,
   :rdfs/label         "instance",
   :rdfs/subPropertyOf :sp/arg})

(def instanceOf
  "Checks whether a given resource (?arg1) has a given type (?arg2). In order to fulfill this condition, there must either be a triple ?arg1 rdf:type ?arg2, or ?instance rdf:type ?subClass where ?subClass is a subclass of ?arg2. If the first argument is a literal, then the second argument must be the matching XSD datatype."
  {:db/ident :spl/instanceOf,
   :owl/versionInfo
   "Note that in TopBraid this function has been implemented in native Java code, for performance reasons.",
   :rdf/type :spin/Function,
   :rdfs/comment
   "Checks whether a given resource (?arg1) has a given type (?arg2). In order to fulfill this condition, there must either be a triple ?arg1 rdf:type ?arg2, or ?instance rdf:type ?subClass where ?subClass is a subclass of ?arg2. If the first argument is a literal, then the second argument must be the matching XSD datatype.",
   :rdfs/label "instanceOf",
   :rdfs/subClassOf :spl/BooleanFunctions,
   :spin/body
   {:rdf/type :sp/Ask,
    :sp/where
    [{:rdf/type    :sp/Union,
      :sp/elements [[[{:rdf/type      :sp/Filter,
                       :sp/expression {:rdf/type :sp/or,
                                       :sp/arg1  {:rdf/type :sp/isIRI,
                                                  :sp/arg1  :spin/_arg1},
                                       :sp/arg2  {:rdf/type :sp/isBlank,
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
                       :sp/expression {:rdf/type :sp/isLiteral,
                                       :sp/arg1  :spin/_arg1}}]
                     {:rdf/type      :sp/Bind,
                      :sp/expression {:rdf/type :sp/datatype,
                                      :sp/arg1  :spin/_arg1},
                      :sp/variable   {:sp/varName "datatype"}}
                     {:rdf/type :sp/Filter,
                      :sp/expression
                      {:rdf/type :sp/or,
                       :sp/arg1  {:rdf/type :sp/or,
                                  :sp/arg1  {:rdf/type :sp/eq,
                                             :sp/arg1  {:sp/varName "datatype"},
                                             :sp/arg2  :spin/_arg2},
                                  :sp/arg2  {:rdf/type :sp/eq,
                                             :sp/arg1  :spin/_arg2,
                                             :sp/arg2  :rdfs/Literal}},
                       :sp/arg2  {:rdf/type :sp/and,
                                  :sp/arg1  {:rdf/type :sp/or,
                                             :sp/arg1  {:rdf/type :sp/not,
                                                        :sp/arg1
                                                        {:rdf/type :sp/bound,
                                                         :sp/arg1
                                                         {:sp/varName
                                                          "datatype"}}},
                                             :sp/arg2  {:rdf/type :sp/eq,
                                                        :sp/arg1
                                                        :rdf/langString,
                                                        :sp/arg2 {:sp/varName
                                                                  "datatype"}}},
                                  :sp/arg2  {:rdf/type :sp/eq,
                                             :sp/arg1  :spin/_arg2,
                                             :sp/arg2  :xsd/string}}}}]]}]},
   :spin/constraint [{:rdf/type      :spl/Argument,
                      :rdfs/comment  "the type that the instance must have",
                      :spl/predicate :sp/arg2,
                      :spl/valueType :rdfs/Class}
                     {:rdf/type      :spl/Argument,
                      :rdfs/comment  "the instance being tested",
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
   :rdfs/subClassOf :spl/OntologyFunctions,
   :spin/body {:rdf/type :sp/Ask,
               :sp/where [{:sp/object    {:sp/varName "type"},
                           :sp/predicate :rdf/type,
                           :sp/subject   {:sp/varName "instance"}}
                          {:rdf/type      :sp/Bind,
                           :sp/expression {:spl/class {:sp/varName "type"},
                                           :rdf/type  :spl/primaryKeyProperty},
                           :sp/variable   {:sp/varName "pk"}}
                          {:rdf/type      :sp/Filter,
                           :sp/expression {:rdf/type :sp/eq,
                                           :sp/arg1  {:sp/varName "property"},
                                           :sp/arg2  {:sp/varName "pk"}}}]},
   :spin/constraint [{:rdf/type      :spl/Argument,
                      :rdfs/comment  "The instance to check.",
                      :spl/predicate :spl/instance,
                      :spl/valueType :rdfs/Resource}
                     {:rdf/type :spl/Argument,
                      :rdfs/comment
                      "The property that may or may not be the primary key.",
                      :spl/predicate :sp/arg,
                      :spl/valueType :rdf/Property}],
   :spin/returnType :xsd/boolean})

(def isUntypedLiteral
  "Checks whether a given literal is untyped. This function was introduced because the built-in datatype operand in SPARQL casts untyped literals to xsd:string, making it impossible to check it this way. This function here uses a work-around using sameTerm instead."
  {:db/ident :spl/isUntypedLiteral,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Checks whether a given literal is untyped. This function was introduced because the built-in datatype operand in SPARQL casts untyped literals to xsd:string, making it impossible to check it this way. This function here uses a work-around using sameTerm instead.",
   :rdfs/label "isUntypedLiteral",
   :rdfs/subClassOf :spl/BooleanFunctions,
   :spin/body {:rdf/type :sp/Ask,
               :sp/where [{:rdf/type      :sp/Filter,
                           :sp/expression {:rdf/type :sp/and,
                                           :sp/arg1  {:rdf/type :sp/isLiteral,
                                                      :sp/arg1  :spin/_arg1},
                                           :sp/arg2  {:rdf/type :sp/not,
                                                      :sp/arg1
                                                      {:rdf/type :sp/sameTerm,
                                                       :sp/arg1 :spin/_arg1,
                                                       :sp/arg2
                                                       {:rdf/type :xsd/string,
                                                        :sp/arg1
                                                        :spin/_arg1}}}}}]},
   :spin/constraint {:rdf/type      :spl/Argument,
                     :rdfs/comment  "The literal to test.",
                     :spl/predicate :sp/arg1,
                     :spl/valueType :rdfs/Literal},
   :spin/returnType :xsd/boolean})

(def max
  "Takes two arguments and returns the larger one of them."
  {:db/ident        :spl/max,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Takes two arguments and returns the larger one of them.",
   :rdfs/label      "max",
   :rdfs/subClassOf :spl/MathematicalFunctions,
   :spin/body       {:rdf/type :sp/Select,
                     :sp/resultVariables [{:sp/varName "result"}],
                     :sp/where [{:rdf/type      :sp/Bind,
                                 :sp/expression {:rdf/type :sp/if,
                                                 :sp/arg1  {:rdf/type :sp/gt,
                                                            :sp/arg1
                                                            :spin/_arg1,
                                                            :sp/arg2
                                                            :spin/_arg2},
                                                 :sp/arg2  :spin/_arg1,
                                                 :sp/arg3  :spin/_arg2},
                                 :sp/variable   {:sp/varName "result"}}]},
   :spin/constraint [{:rdf/type      :spl/Argument,
                      :rdfs/comment  "The first argument.",
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdfs/Literal}
                     {:rdf/type      :spl/Argument,
                      :rdfs/comment  "The second argument.",
                      :spl/predicate :sp/arg2,
                      :spl/valueType :rdfs/Literal}],
   :spin/returnType :rdfs/Literal})

(def maxCount
  {:db/ident :spl/maxCount,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf :spl/count})

(def min
  "Takes two arguments and returns the smaller one of them."
  {:db/ident        :spl/min,
   :rdf/type        :spin/Function,
   :rdfs/comment    "Takes two arguments and returns the smaller one of them.",
   :rdfs/label      "min",
   :rdfs/subClassOf :spl/MathematicalFunctions,
   :spin/body       {:rdf/type :sp/Select,
                     :sp/resultVariables [{:sp/varName "result"}],
                     :sp/where [{:rdf/type      :sp/Bind,
                                 :sp/expression {:rdf/type :sp/if,
                                                 :sp/arg1  {:rdf/type :sp/lt,
                                                            :sp/arg1
                                                            :spin/_arg1,
                                                            :sp/arg2
                                                            :spin/_arg2},
                                                 :sp/arg2  :spin/_arg1,
                                                 :sp/arg3  :spin/_arg2},
                                 :sp/variable   {:sp/varName "result"}}]},
   :spin/constraint [{:rdf/type      :spl/Argument,
                      :rdfs/comment  "The first argument.",
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdfs/Literal}
                     {:rdf/type      :spl/Argument,
                      :rdfs/comment  "The second argument.",
                      :spl/predicate :sp/arg2,
                      :spl/valueType :rdfs/Literal}],
   :spin/returnType :rdfs/Literal})

(def minCount
  {:db/ident :spl/minCount,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf :spl/count})

(def object
  "Gets the object of a given subject (?arg1) / predicate (?arg2) combination. Note that if multiple values are present then the result might be unpredictably random. Furthermore, if one of the arguments is unbound, it will return the first match of the resulting SPO pattern. These scenarios are strongly discouraged but remain left supported for backward compatibility reasons."
  {:db/ident :spl/object,
   :owl/versionInfo
   "Note that in TopBraid this function has been implemented in native Java code, for performance reasons.",
   :rdf/type :spin/Function,
   :rdfs/comment
   "Gets the object of a given subject (?arg1) / predicate (?arg2) combination.\n\nNote that if multiple values are present then the result might be unpredictably random. Furthermore, if one of the arguments is unbound, it will return the first match of the resulting SPO pattern. These scenarios are strongly discouraged but remain left supported for backward compatibility reasons.",
   :rdfs/label "object",
   :rdfs/subClassOf :spl/OntologyFunctions,
   :spin/body {:rdf/type :sp/Select,
               :sp/resultVariables [{:sp/varName "object"}],
               :sp/where [{:sp/object    {:sp/varName "object"},
                           :sp/predicate :spin/_arg2,
                           :sp/subject   :spin/_arg1}]},
   :spin/constraint [{:rdf/type      :spl/Argument,
                      :rdfs/comment  "The subject to get the object from.",
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdfs/Resource}
                     {:rdf/type      :spl/Argument,
                      :rdfs/comment  "The predicate to get the object of.",
                      :spl/predicate :sp/arg2,
                      :spl/valueType :rdf/Property}]})

(def objectCount
  "Gets the number of values of a given property (?arg2) at a given subject (?arg1). The result is the number of matches of (?arg1, ?arg2, ?object)."
  {:db/ident :spl/objectCount,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Gets the number of values of a given property (?arg2) at a given subject (?arg1). The result is the number of matches of (?arg1, ?arg2, ?object).",
   :rdfs/label "objectCount",
   :rdfs/subClassOf :spl/OntologyFunctions,
   :spin/body {:rdf/type :sp/Select,
               :sp/resultVariables [{:sp/expression {:rdf/type      :sp/Count,
                                                     :sp/expression {:sp/varName
                                                                     "object"}},
                                     :sp/varName    "result"}],
               :sp/where [{:sp/object    {:sp/varName "object"},
                           :sp/predicate :spin/_arg2,
                           :sp/subject   :spin/_arg1}]},
   :spin/constraint
   [{:rdf/type      :spl/Argument,
     :rdfs/comment  "the subject to get the number of objects of",
     :spl/predicate :sp/arg1,
     :spl/valueType :rdfs/Resource}
    {:rdf/type      :spl/Argument,
     :rdfs/comment  "the property to get the number of values of",
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
   :rdfs/subClassOf :spl/OntologyFunctions,
   :spin/body {:rdf/type :sp/Select,
               :sp/resultVariables [{:sp/varName "object"}],
               :sp/where [{:rdf/type         :sp/NamedGraph,
                           :sp/elements      [{:sp/object    {:sp/varName
                                                              "object"},
                                               :sp/predicate :spin/_arg2,
                                               :sp/subject   :spin/_arg1}],
                           :sp/graphNameNode :spin/_arg3}]},
   :spin/constraint [{:rdf/type      :spl/Argument,
                      :rdfs/comment  "The subject to get the object from.",
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdfs/Resource}
                     {:rdf/type      :spl/Argument,
                      :rdfs/comment  "The predicate to get the object of.",
                      :spl/predicate :sp/arg2,
                      :spl/valueType :rdf/Property}
                     {:rdf/type      :spl/Argument,
                      :rdfs/comment  "The graph to query in.",
                      :spl/predicate :sp/arg3,
                      :spl/valueType :rdfs/Resource}]})

(def objectSubProp
  "Gets the object of a given subject (?arg1) / predicate (?arg2) combination, also taking the sub-properties of ?arg2 into account. Note that if multiple values are present then the result might be unpredictably random."
  {:db/ident :spl/objectSubProp,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Gets the object of a given subject (?arg1) / predicate (?arg2) combination, also taking the sub-properties of ?arg2 into account. Note that if multiple values are present then the result might be unpredictably random.",
   :rdfs/label "object sub prop",
   :rdfs/subClassOf :spl/OntologyFunctions,
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
   [{:rdf/type      :spl/Argument,
     :rdfs/comment  "The subject to get the object from.",
     :spl/predicate :sp/arg1,
     :spl/valueType :rdfs/Resource}
    {:rdf/type :spl/Argument,
     :rdfs/comment
     "The predicate to get the object of (including sub-properties of it).",
     :spl/predicate :sp/arg2,
     :spl/valueType :rdf/Property}]})

(def optional
  "optional"
  {:db/ident           :spl/optional,
   :rdf/type           :rdf/Property,
   :rdfs/label         "optional",
   :rdfs/range         :xsd/boolean,
   :rdfs/subPropertyOf :sp/arg})

(def predicate
  "predicate"
  {:db/ident           :spl/predicate,
   :rdf/type           :rdf/Property,
   :rdfs/label         "predicate",
   :rdfs/subPropertyOf :sp/arg})

(def primaryKeyProperty
  "Gets the primary key property declared for a given class, using spl:PrimaryKeyPropertyConstraint."
  {:db/ident :spl/primaryKeyProperty,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Gets the primary key property declared for a given class, using spl:PrimaryKeyPropertyConstraint.",
   :rdfs/label "primary key property",
   :rdfs/subClassOf :spl/OntologyFunctions,
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
                           :sp/predicate :sp/arg,
                           :sp/subject   {:sp/varName "constraint"}}]},
   :spin/constraint {:rdf/type      :spl/Argument,
                     :rdfs/comment  "The class to get the primary key of.",
                     :spl/predicate :spl/class,
                     :spl/valueType :rdfs/Class},
   :spin/returnType :rdf/Property})

(def primaryKeyURIStart
  "Gets the URI start declared as part of a primary key declaration for a given class, using spl:PrimaryKeyPropertyConstraint."
  {:db/ident :spl/primaryKeyURIStart,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Gets the URI start declared as part of a primary key declaration for a given class, using spl:PrimaryKeyPropertyConstraint.",
   :rdfs/label "primary key URI start",
   :rdfs/subClassOf :spl/OntologyFunctions,
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
                           :sp/predicate :sp/arg,
                           :sp/subject   {:sp/varName "constraint"}}]},
   :spin/constraint {:rdf/type      :spl/Argument,
                     :rdfs/comment  "The class to get the primary key of.",
                     :spl/predicate :spl/class,
                     :spl/valueType :rdfs/Class},
   :spin/returnType :rdf/Property})

(def relevantPropertyAtClass
  "A magic property that establishes a relationship between properties (left) and classes (right) to determine which properties are \"relevant\" for the class. Relevant means that they have the class in their domain and/or restrictions, including superclasses and sub-properties (unless they define their own domain). Domains consisting of an owl:unionOf are also handled. Note that the performance of the body of this magic property has been optimized for the case in which the class is given, so ideally use this for queries such as ?property spl:relevantPropertyAtClass skos:Concept ."
  {:db/ident :spl/relevantPropertyAtClass,
   :rdf/type :spin/MagicProperty,
   :rdfs/comment
   "A magic property that establishes a relationship between properties (left) and classes (right) to determine which properties are \"relevant\" for the class. Relevant means that they have the class in their domain and/or restrictions, including superclasses and sub-properties (unless they define their own domain). Domains consisting of an owl:unionOf are also handled.\n\nNote that the performance of the body of this magic property has been optimized for the case in which the class is given, so ideally use this for queries such as  ?property spl:relevantPropertyAtClass skos:Concept .",
   :rdfs/label "relevant property at class",
   :rdfs/subClassOf :spin/MagicProperties,
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
      :sp/expression {:rdf/type :sp/or,
                      :sp/arg1  {:rdf/type :sp/eq,
                                 :sp/arg1  :spin/_arg1,
                                 :sp/arg2  {:sp/varName "property"}},
                      :sp/arg2  {:rdf/type    :sp/notExists,
                                 :sp/elements [{:sp/object    {:sp/varName
                                                               "anyDomain"},
                                                :sp/predicate :rdfs/domain,
                                                :sp/subject   :spin/_arg1}]}}}
     {:rdf/type      :sp/Filter,
      :sp/expression {:rdf/type :sp/isIRI,
                      :sp/arg1  {:sp/varName "class"}}}]},
   :spin/constraint {:rdf/type      :spl/Argument,
                     :rdfs/comment  "The property.",
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
   :rdfs/subClassOf :spl/OntologyFunctions,
   :spin/body {:rdf/type :sp/Ask,
               :sp/where [{:rdf/type   :sp/TriplePath,
                           :sp/object  :spin/_arg2,
                           :sp/path    {:rdf/type   :sp/ModPath,
                                        :sp/modMax  -2,
                                        :sp/modMin  0,
                                        :sp/subPath :rdfs/subClassOf},
                           :sp/subject :spin/_arg1}]},
   :spin/constraint [{:rdf/type      :spl/Argument,
                      :rdfs/comment  "The potential sub-class.",
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdfs/Class}
                     {:rdf/type      :spl/Argument,
                      :rdfs/comment  "The potential super-class.",
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
   :rdfs/subClassOf :spl/OntologyFunctions,
   :spin/body {:rdf/type :sp/Ask,
               :sp/where [{:rdf/type   :sp/TriplePath,
                           :sp/object  :spin/_arg2,
                           :sp/path    {:rdf/type   :sp/ModPath,
                                        :sp/modMax  -2,
                                        :sp/modMin  0,
                                        :sp/subPath :rdfs/subPropertyOf},
                           :sp/subject :spin/_arg1}]},
   :spin/constraint [{:rdf/type      :spl/Argument,
                      :rdfs/comment  "The potential sub-property.",
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdf/Property}
                     {:rdf/type      :spl/Argument,
                      :rdfs/comment  "The potential super-property.",
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
   :rdfs/subClassOf :spl/OntologyFunctions,
   :spin/body {:rdf/type :sp/Select,
               :sp/resultVariables [{:sp/varName "subject"}],
               :sp/where [{:sp/object    :spin/_arg2,
                           :sp/predicate :spin/_arg1,
                           :sp/subject   {:sp/varName "subject"}}]},
   :spin/constraint [{:rdf/type      :spl/Argument,
                      :rdfs/comment  "The predicate.",
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdf/Property}
                     {:rdf/type      :spl/Argument,
                      :rdfs/comment  "The object.",
                      :spl/predicate :sp/arg2}]})

(def subjectCount
  "Gets the number of values of a given property (?arg1) at a given object (?arg2). The result is the number of matches of (?subject, ?arg1, ?arg2)."
  {:db/ident :spl/subjectCount,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Gets the number of values of a given property (?arg1) at a given object (?arg2). The result is the number of matches of (?subject, ?arg1, ?arg2).",
   :rdfs/label "subjectCount",
   :rdfs/subClassOf :spl/OntologyFunctions,
   :spin/body {:rdf/type :sp/Select,
               :sp/resultVariables [{:sp/expression {:rdf/type :sp/Count,
                                                     :sp/expression
                                                     {:sp/varName "subject"}},
                                     :sp/varName    "result"}],
               :sp/where [{:sp/object    :spin/_arg2,
                           :sp/predicate :spin/_arg1,
                           :sp/subject   {:sp/varName "subject"}}]},
   :spin/constraint
   [{:rdf/type      :spl/Argument,
     :rdfs/comment  "the predicate to get the number of subjects of",
     :spl/predicate :sp/arg1,
     :spl/valueType :rdf/Property}
    {:rdf/type      :spl/Argument,
     :rdfs/comment  "the object to get the number of subjects of",
     :spl/predicate :sp/arg2}],
   :spin/returnType :xsd/integer})

(def subjectInGraph
  "Gets the \"first\" subject of a given predicate (?arg1)/object (?arg2) combination in a given graph (?arg3). Note that if multiple values are present then the result might be unpredictably random."
  {:db/ident :spl/subjectInGraph,
   :rdf/type :spin/Function,
   :rdfs/comment
   "Gets the \"first\" subject of a given predicate (?arg1)/object (?arg2) combination in a given graph (?arg3). Note that if multiple values are present then the result might be unpredictably random.",
   :rdfs/label "subject in graph",
   :rdfs/subClassOf :spl/OntologyFunctions,
   :spin/body {:rdf/type :sp/Select,
               :sp/resultVariables [{:sp/varName "subject"}],
               :sp/where [{:rdf/type         :sp/NamedGraph,
                           :sp/elements      [{:sp/object    :spin/_arg2,
                                               :sp/predicate :spin/_arg1,
                                               :sp/subject   {:sp/varName
                                                              "subject"}}],
                           :sp/graphNameNode :spin/_arg3}]},
   :spin/constraint [{:rdf/type      :spl/Argument,
                      :rdfs/comment  "The predicate.",
                      :spl/predicate :sp/arg1,
                      :spl/valueType :rdf/Property}
                     {:rdf/type      :spl/Argument,
                      :rdfs/comment  "The object.",
                      :spl/predicate :sp/arg2}
                     {:rdf/type      :spl/Argument,
                      :rdfs/comment  "The graph to operate on.",
                      :spl/predicate :sp/arg3,
                      :spl/valueType :rdfs/Resource}]})

(def testExpression
  "test expression"
  {:db/ident           :spl/testExpression,
   :rdf/type           :rdf/Property,
   :rdfs/label         "test expression",
   :rdfs/subPropertyOf :sp/arg})

(def testResult
  "testResult"
  {:db/ident           :spl/testResult,
   :rdf/type           :rdf/Property,
   :rdfs/label         "testResult",
   :rdfs/subPropertyOf :sp/arg})

(def valueType
  "value type"
  {:db/ident           :spl/valueType,
   :rdf/type           :rdf/Property,
   :rdfs/label         "value type",
   :rdfs/subPropertyOf :sp/arg})
