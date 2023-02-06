(ns net.wikipunk.rdf.cpannotationschema
  "http://www.ontologydesignpatterns.org/schemas/cpannotationschema.owl#"
  {:rdf/ns-prefix-map
   {"cpannotationschema"
    "http://www.ontologydesignpatterns.org/schemas/cpannotationschema.owl#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "owl2xml" "http://www.w3.org/2006/12/owl2-xml#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "http://www.ontologydesignpatterns.org/schemas/cpannotationschema.owl",
   :rdfa/prefix "cpannotationschema",
   :rdfa/uri
   "http://www.ontologydesignpatterns.org/schemas/cpannotationschema.owl#"})

(def coversRequirements
  "This annotation property is used for exemplifying possible requirements the content pattern provides a solution for. Requirements are expressed as natural language competency questions."
  {:db/ident :cpannotationschema/coversRequirements,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "This annotation property is used for exemplifying possible requirements the content pattern provides a solution for. Requirements are expressed as natural language competency questions."})

(def extractedFrom
  "This annotation property should be assigned with a URI, which points to the possible reference ontology which the annotated pattern was extracted from (i.e. the reference ontology that the ontology elements have been deeply or partially cloned by). The range is not explicit in the definition of the annotation property because it would turn the ontology to OWL Full. E.g. The participation pattern is extracted from the Dolce Ultra Lite ontology, hence the value for this annotation property is http://www.ontologydesignpatterns.org/ont/dul/DUL.owl"
  {:db/ident :cpannotationschema/extractedFrom,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "This annotation property should be assigned with a URI, which points to the possible reference ontology which the annotated pattern was extracted from (i.e. the reference ontology that the ontology elements have been deeply or partially cloned by). The range is not explicit in the definition of the annotation property because it would turn the ontology to OWL Full. E.g. The participation pattern is extracted from the Dolce Ultra Lite ontology, hence the value for this annotation property is http://www.ontologydesignpatterns.org/ont/dul/DUL.owl"})

(def hasComponent
  "This annotation property is useful for content ontology design patterns. Its value is a URI, which refers to another content ontology design pattern which is a component of the annotated one."
  {:db/ident :cpannotationschema/hasComponent,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "This annotation property is useful for content ontology design patterns. Its value is a URI, which refers to another content ontology design pattern which is a component of the annotated one."})

(def hasConsequences
  "This annotation property is used for briefly describing the benefits and/or possible trade-offs when using the CP."
  {:db/ident :cpannotationschema/hasConsequences,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "This annotation property is used for briefly describing the benefits and/or possible trade-offs when using the CP."})

(def hasIntent
  "This annotation property is used in order to describe the intent of the content pattern."
  {:db/ident :cpannotationschema/hasIntent,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "This annotation property is used in order to describe the intent of the content pattern."})

(def hasUnitTest
  "This property can be used to annotate a unit test (e.g. in the form of a SPARQL query) to be launched to evaluate an ontology against a requirement-based task."
  {:db/ident :cpannotationschema/hasUnitTest,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "This property can be used to annotate a unit test (e.g. in the form of a SPARQL query) to be launched to evaluate an ontology against a requirement-based task."})

(def isCloneOf
  "This annotation property is used for referring a cloned ontology entity to its cloning source."
  {:db/ident :cpannotationschema/isCloneOf,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "This annotation property is used for referring a cloned ontology entity to its cloning source."})

(def isSpecializationOf
  "This annotation property is useful for content ontology design patterns and its elements. Its value is a URI, which refers either to a content ontology design pattern that is specialized by the annotated one, or to an ontology element that is specialized by the annotated one."
  {:db/ident :cpannotationschema/isSpecializationOf,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "This annotation property is useful for content ontology design patterns and its elements. Its value is a URI, which refers either to a content ontology design pattern that is specialized by the annotated one, or to an ontology element that is specialized by the annotated one."})

(def reengineeredFrom
  "This annotation property should be assigned with a URI, which points to the concept schema, page, or anything else from which the annotated pattern was reengineered. If the source does not have any URI e.g., a printed book, this property value should provide information as precise as possible in order to identify the source. This property is alternative to the extractedFrom property because it is used when the pattern come from a concept schema which is not an owl ontology. For example content ontology design patterns, which are reengineered from data model patterns, rdf schemas, etc. should be annotatd with this property. E.g. The basicpersonalfoaf pattern is extracted from the rdf FOAF specification, hence the value for this annotation property is http://xmlns.com/foaf/spec/20071002.rdf"
  {:db/ident :cpannotationschema/reengineeredFrom,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "This annotation property should be assigned with a URI, which points to the concept schema, page, or anything else from which the annotated pattern was reengineered.  If the source does not have any URI e.g., a printed book, this property value should provide information as precise as possible in order to identify the source. This property is alternative to the extractedFrom property because it is used when the pattern come from a concept schema which is not an owl ontology. For example content ontology design patterns, which are reengineered from data model patterns, rdf schemas, etc. should be annotatd with this property. E.g. The basicpersonalfoaf pattern is extracted from the rdf FOAF specification, hence the value for this annotation property is http://xmlns.com/foaf/spec/20071002.rdf"})

(def relatedCPs
  "This annotation property can be used to indicate other CPs (if any) that specialize, generalize, inlcude, or are components of the CP. Furthermore, this field may indicate other CPs that are typically used in conjunction with the described one. Important similarities and differences with other patterns can be also described here."
  {:db/ident :cpannotationschema/relatedCPs,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "This annotation property can be used to indicate other CPs (if any) that specialize, generalize, inlcude, or are components of the CP. Furthermore, this field may indicate other CPs that are typically used in conjunction with the described one. Important similarities and differences with other patterns can be also described here."})

(def scenarios
  "This annotation property is used for describing examples of instantiation of the Content OP. For example, for the part-of Content OP (which represents part-whole relations) a possible scenario is the sentence: \"the brain is part of the human body\". Scenarios are expressed as natural language sentences."
  {:db/ident :cpannotationschema/scenarios,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "This annotation property is used for describing examples of instantiation of the Content OP. For example, for the part-of Content OP (which represents part-whole relations) a possible scenario is the sentence: \"the brain is part of the human body\". Scenarios are expressed as natural language sentences."})