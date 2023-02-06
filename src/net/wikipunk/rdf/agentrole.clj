(ns net.wikipunk.rdf.agentrole
  "agent role"
  {:cpannotationschema/coversRequirements
   "which agent does play this role? \nwhat is the role that played by that agent?",
   :cpannotationschema/extractedFrom
   "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :cpannotationschema/hasConsequences
   "This CP allows designers to make assertions on roles played by agents without involving the agents that play that roles, and vice versa. It does not allow to express temporariness of roles.",
   :cpannotationschema/hasIntent "To represent agents and the roles they play.",
   :cpannotationschema/isSpecializationOf
   "http://www.ontologydesignpatterns.org/cp/owl/objectrole.owl",
   :cpannotationschema/relatedCPs
   "The time indexed person role CP available at http://www.ontologydesignpatterns.org/cp/owl/timeiindexedpersonrole.owl allows to represent temporariness of roles played by persons. It can be generalized for including objects or, alternatively the n-ary classification CP avaliable at http://www.ontologydesignpatterns.org/cp/owl/naryclassification.owl can be specialized in order to obtain the same expressivity.",
   :cpannotationschema/scenarios
   "She greeted us all in her various roles of mother, friend, and daughter.",
   :owl/imports
   ["http://www.ontologydesignpatterns.org/cp/owl/objectrole.owl"
    "http://www.ontologydesignpatterns.org/schemas/cpannotationschema.owl"],
   :owl/versionInfo ["1.1 added rdfs:isDefinedBy for all named entities"
                     "Created by Aldo Gangemi and Valentina Presutti"],
   :rdf/ns-prefix-map
   {"agentrole"  "http://www.ontologydesignpatterns.org/cp/owl/agentrole.owl#",
    "cpannotationschema"
    "http://www.ontologydesignpatterns.org/schemas/cpannotationschema.owl#",
    "objectrole" "http://www.ontologydesignpatterns.org/cp/owl/objectrole.owl#",
    "owl"        "http://www.w3.org/2002/07/owl#",
    "rdf"        "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"       "http://www.w3.org/2000/01/rdf-schema#",
    "xsd"        "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://www.ontologydesignpatterns.org/cp/owl/agentrole.owl",
   :rdfa/prefix "agentrole",
   :rdfa/uri "http://www.ontologydesignpatterns.org/cp/owl/agentrole.owl#",
   :rdfs/label "agent role"})

(def Agent
  "Any agentive Object , either physical, or social."
  {:cpannotationschema/isCloneOf
   "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl#Agent",
   :db/ident :agentrole/Agent,
   :owl/disjointWith :objectrole/Role,
   :rdf/type :owl/Class,
   :rdfs/comment "Any agentive Object , either physical, or social.",
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/agentrole.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Agente"}
                {:rdf/language "en",
                 :rdf/value    "Agent"}],
   :rdfs/subClassOf :objectrole/Object})

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

(def ^{:private true} isCloneOf
  {:db/ident :cpannotationschema/isCloneOf,
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

(def ^{:private true} ObjectClass
  {:db/ident :objectrole/Object,
   :rdf/type :owl/Class})

(def ^{:private true} Role
  {:db/ident :objectrole/Role,
   :rdf/type :owl/Class})
