(ns net.wikipunk.rdf.informationrealization
  "information realization"
  {:cpannotationschema/coversRequirements
   "what are the physical realizations of this information object?, what information objects are realized by this physical object?",
   :cpannotationschema/extractedFrom
   "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :cpannotationschema/hasConsequences
   "This CP allows designers to model information objects and their realizations. This allows to reason about physical objects and the information they realize, by keeping them distinguished.",
   :cpannotationschema/hasIntent
   "To represent information objects and physical entities that realize them.",
   :cpannotationschema/relatedCPs
   "It is specialized by multimedia data segment decomposition.",
   :cpannotationschema/scenarios
   "John Lennon’s biography I Me Mine has been realized in a limited 2000-copy edition.",
   :owl/imports
   "http://www.ontologydesignpatterns.org/schemas/cpannotationschema.owl",
   :owl/versionInfo ["Created by Aldo Gangemi and Valentina Presutti"
                     "1.1 added rdfs:isDefinedBy for all named entities"],
   :rdf/ns-prefix-map
   {"cpannotationschema"
    "http://www.ontologydesignpatterns.org/schemas/cpannotationschema.owl#",
    "informationrealization"
    "http://www.ontologydesignpatterns.org/cp/owl/informationrealization.owl#",
    "owl"  "http://www.w3.org/2002/07/owl#",
    "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "http://www.ontologydesignpatterns.org/cp/owl/informationrealization.owl",
   :rdfa/prefix "informationrealization",
   :rdfa/uri
   "http://www.ontologydesignpatterns.org/cp/owl/informationrealization.owl#",
   :rdfs/label "information realization"})

(def InformationObject
  "A piece of information, such as a musical composition, a text, a word, a picture, independently from how it is concretely realized."
  {:db/ident :informationrealization/InformationObject,
   :owl/disjointWith :informationrealization/InformationRealization,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A piece of information, such as a musical composition, a text, a word, a picture, independently from how it is concretely realized.",
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/informationrealization.owl",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Information object"},
   :rdfs/subClassOf
   [{:owl/onProperty     :informationrealization/isRealizedBy,
     :owl/someValuesFrom :informationrealization/InformationRealization,
     :rdf/type           :owl/Restriction}
    {:owl/allValuesFrom :informationrealization/InformationRealization,
     :owl/onProperty    :informationrealization/isRealizedBy,
     :rdf/type          :owl/Restriction}]})

(def InformationRealization
  "A concrete realization of an information object, e.g. the written document containing the text of a law."
  {:db/ident :informationrealization/InformationRealization,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A concrete realization of an information object, e.g. the written document containing the text of a law.",
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/informationrealization.owl",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Information realization"},
   :rdfs/subClassOf {:owl/onProperty :informationrealization/realizes,
                     :owl/someValuesFrom
                     :informationrealization/InformationObject,
                     :rdf/type :owl/Restriction}})

(def isRealizedBy
  "A relation between an information realization and an information object, e.g. the paper copy of the Italian Constitution realizes the text of the Constitution."
  {:db/ident :informationrealization/isRealizedBy,
   :owl/inverseOf :informationrealization/realizes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between an information realization and an information object, e.g. the paper copy of the Italian Constitution realizes the text of the Constitution.",
   :rdfs/domain :informationrealization/InformationObject,
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/informationrealization.owl",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is realized by"},
   :rdfs/range :informationrealization/InformationRealization})

(def realizes
  "A relation between an information realization and an information object, e.g. the paper copy of the Italian Constitution realizes the text of the Constitution."
  {:db/ident :informationrealization/realizes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between an information realization and an information object, e.g. the paper copy of the Italian Constitution realizes the text of the Constitution.",
   :rdfs/domain :informationrealization/InformationRealization,
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/informationrealization.owl",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "realizes"},
   :rdfs/range :informationrealization/InformationObject})

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