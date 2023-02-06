(ns net.wikipunk.rdf.classification
  "The classification content ontology design pattern. This CP represents the realtions between concepts e.g., roles, task, and entities to which concepts are assigned to e.g., person, activities. The CP is extracted form DOLCE Ultra Lite ontology."
  {:cpannotationschema/coversRequirements
   "What concept is assigned to this entity? Which category does this entity belong to?",
   :cpannotationschema/extractedFrom
   "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :cpannotationschema/hasConsequences
   "It is possible to make asser tions about e.g., categories, types, roles, which are typically considered at the meta-level of an ontology. Instances of Concept reify such elements, which are therefore put in the ordinary domain of an ontology. It is not possible to parametrize the classiﬁcation over different dimensions e.g., time, space, etc. ",
   :cpannotationschema/hasIntent
   "To represent the relations between concepts (roles, task, parameters) and entities (person, events, values), which concepts can be assigned to. To formalize the application (e.g. tagging) of informal knowledge \norganization systems such as lexica, thesauri, subject directories, folksonomies, etc., where concepts are ﬁrst-order elements.",
   :cpannotationschema/relatedCPs
   "Typically combined with descriptionandsituation. It is specialized by cat:objectrole. The n-ary classiﬁcation CP provides an alternative to this if classiﬁcation has to be qualiﬁed over different dimensions.",
   :cpannotationschema/scenarios
   "Mac OSX 10.5 is classiﬁed as an an operating system in the Fujitsu-Siemens product catalog.",
   :owl/imports
   "http://www.ontologydesignpatterns.org/schemas/cpannotationschema.owl",
   :owl/versionInfo ["1.1 added rdfs:isDefinedBy for all named entities"
                     "Created by Valentina Presutti"],
   :rdf/ns-prefix-map
   {"classification"
    "http://www.ontologydesignpatterns.org/cp/owl/classification.owl#",
    "cpannotationschema"
    "http://www.ontologydesignpatterns.org/schemas/cpannotationschema.owl#",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://www.ontologydesignpatterns.org/cp/owl/classification.owl",
   :rdfa/prefix "classification",
   :rdfa/uri "http://www.ontologydesignpatterns.org/cp/owl/classification.owl#",
   :rdfs/comment
   "The classification content ontology design pattern. This CP represents the realtions between concepts e.g., roles, task, and entities to which concepts are assigned to e.g., person, activities. The CP is extracted form DOLCE Ultra Lite ontology.",
   :rdfs/label "classification"})

(def Concept
  "A concept is a Social Object. The classifies relation relates concepts to entities at some time, but time can only be expressed in the alternative pattern: timeindexedclassification."
  {:db/ident :classification/Concept,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A concept is a Social Object. \nThe classifies relation relates concepts to entities at some time, but time can only be expressed in the alternative pattern: timeindexedclassification.",
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/classification.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Concetto"}
                {:rdf/language "en",
                 :rdf/value    "Concept"}]})

(def classifies
  "A relation between a Concept and an Entity, e.g. the Role 'student' classifies a Person 'John'."
  {:db/ident :classification/classifies,
   :owl/inverseOf :classification/isClassifiedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between a Concept and an Entity, e.g. the Role 'student' classifies a Person 'John'.",
   :rdfs/domain :classification/Concept,
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/classification.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "classifica"}
                {:rdf/language "en",
                 :rdf/value    "classifies"}],
   :rdfs/range :owl/Thing})

(def isClassifiedBy
  "A relation between a Concept and an Entity, e.g. 'John is considered a typical rude man'; your last concert constitutes the achievement of a lifetime; '20-year-old means she's mature enough'."
  {:db/ident :classification/isClassifiedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between a Concept and an Entity, e.g. 'John is considered a typical rude man'; your last concert constitutes the achievement of a lifetime; '20-year-old means she's mature enough'.",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/classification.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è classificato da"}
                {:rdf/language "en",
                 :rdf/value    "is classified by"}],
   :rdfs/range :classification/Concept})

(def ^{:private true} coversRequirements
  {:db/ident :cpannotationschema/coversRequirements,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} extractedFrom
  {:db/ident :cpannotationschema/extractedFrom,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} hasConsequences
  {:db/ident :cpannotationschema/hasConsequences,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} hasIntent
  {:db/ident :cpannotationschema/hasIntent,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} relatedCPs
  {:db/ident :cpannotationschema/relatedCPs,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} scenarios
  {:db/ident :cpannotationschema/scenarios,
   :rdf/type :owl/AnnotationProperty})