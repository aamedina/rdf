(ns net.wikipunk.rdf.objectrole
  "It is extracted from DOLCE Ultra Lite ontology and specialize the classification CP. Object is an Entity, and Role is a Concept. The hasRole relation specializes the classifies relation, while the isRoleOf specializes the isClassifiedBy relation."
  {:cpannotationschema/coversRequirements
   "What role does this object play? which objects do play that role?",
   :cpannotationschema/extractedFrom
   "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :cpannotationschema/hasConsequences
   "It is possible to make asser tions about roles, which are typically considered at the meta-level of an ontology. Instances of Role reify such elements, which are therefore put in the ordinar y domain of an ontology. It is not possible to parametrize the classiﬁcation over different dimensions e.g., time, space, etc.",
   :cpannotationschema/hasIntent
   "To represents objects and the roles they play.",
   :cpannotationschema/isSpecializationOf
   "http://www.ontologydesignpatterns.org/cp/owl/classification.owl",
   :cpannotationschema/relatedCPs
   "It specializes the classiﬁcation CP. It is specialized by agent role.",
   :cpannotationschema/scenarios "This old glass is used as a ﬂower pot.",
   :owl/imports
   ["http://www.ontologydesignpatterns.org/cp/owl/classification.owl"
    "http://www.ontologydesignpatterns.org/schemas/cpannotationschema.owl"],
   :owl/versionInfo ["1.1 added rdfs:isDefinedBy for all named entities"
                     "Created by Valentina Presutti"],
   :rdf/ns-prefix-map
   {"classification"
    "http://www.ontologydesignpatterns.org/cp/owl/classification.owl#",
    "cpannotationschema"
    "http://www.ontologydesignpatterns.org/schemas/cpannotationschema.owl#",
    "objectrole" "http://www.ontologydesignpatterns.org/cp/owl/objectrole.owl#",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://www.ontologydesignpatterns.org/cp/owl/objectrole.owl",
   :rdfa/prefix "objectrole",
   :rdfa/uri "http://www.ontologydesignpatterns.org/cp/owl/objectrole.owl#",
   :rdfs/comment
   "It is extracted from DOLCE Ultra Lite ontology and specialize the classification CP. Object is an Entity, and Role is a Concept. The hasRole relation specializes the classifies relation, while the isRoleOf specializes the isClassifiedBy relation."})

(def ObjectClass
  "Any physical, social, or mental object, or a substance"
  {:db/ident :objectrole/Object,
   :rdf/type :owl/Class,
   :rdfs/comment "Any physical, social, or mental object, or a substance",
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/objectrole.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Oggetto"}
                {:rdf/language "en",
                 :rdf/value    "Object"}]})

(def Role
  "A Concept that classifies an Object"
  {:db/ident :objectrole/Role,
   :rdf/type :owl/Class,
   :rdfs/comment "A Concept that classifies an Object",
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/objectrole.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Ruolo"}
                {:rdf/language "en",
                 :rdf/value    "Role"}],
   :rdfs/subClassOf :classification/Concept})

(def hasRole
  "A relation between an object and a role, e.g. the person 'John' has role 'student'."
  {:db/ident :objectrole/hasRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between an object and a role, e.g. the person 'John' has role 'student'.",
   :rdfs/domain :objectrole/Object,
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/objectrole.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "ha ruolo"}
                {:rdf/language "en",
                 :rdf/value    "has role"}],
   :rdfs/range :objectrole/Role,
   :rdfs/subPropertyOf :classification/isClassifiedBy})

(def isRoleOf
  "A relation between an object and a role, e.g. the 'student' is the role of 'John'."
  {:db/ident :objectrole/isRoleOf,
   :owl/inverseOf :objectrole/hasRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between an object and a role, e.g. the 'student' is the role of 'John'.",
   :rdfs/domain :objectrole/Role,
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/objectrole.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è un ruolo di"}
                {:rdf/language "en",
                 :rdf/value    "is role of"}],
   :rdfs/range :objectrole/Object,
   :rdfs/subPropertyOf :classification/classifies})

(def ^{:private true} Concept
  {:db/ident :classification/Concept,
   :rdf/type :owl/Class})

(def ^{:private true} classifies
  {:db/ident :classification/classifies,
   :rdf/type :owl/ObjectProperty})

(def ^{:private true} isClassifiedBy
  {:db/ident :classification/isClassifiedBy,
   :rdf/type :owl/ObjectProperty})

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

(def ^{:private true} isSpecializationOf
  {:db/ident :cpannotationschema/isSpecializationOf,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} relatedCPs
  {:db/ident :cpannotationschema/relatedCPs,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} scenarios
  {:db/ident :cpannotationschema/scenarios,
   :rdf/type :owl/AnnotationProperty})