(ns net.wikipunk.rdf.situation
  "situation"
  {:cpannotationschema/coversRequirements
   "What is the context or situation of something? What are the things present in this context or situation?",
   :cpannotationschema/extractedFrom
   "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :cpannotationschema/hasAuthor "Aldo Gangemi",
   :cpannotationschema/hasConsequences
   "We can contextualize things that have something in common, or are associated: a same place, time, view, causal link, systemic dependence, etc.\nWe can also reify n-ary relations as situations.",
   :cpannotationschema/hasIntent
   "To represent contexts or situations, and the things that are contextualized.",
   :cpannotationschema/scenarios
   "The lecture was held in January 1921 by Bela Fleck, with some physicians in the audience making questions, in a very relaxed athmosphere.",
   :owl/imports
   "http://www.ontologydesignpatterns.org/schemas/cpannotationschema.owl",
   :owl/versionInfo ["Created by Aldo Gangemi and Valentina Presutti"
                     "1.1 added rdfs:isDefinedBy for all named entities"],
   :rdf/ns-prefix-map
   {"cpannotationschema"
    "http://www.ontologydesignpatterns.org/schemas/cpannotationschema.owl#",
    "owl"       "http://www.w3.org/2002/07/owl#",
    "rdf"       "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"      "http://www.w3.org/2000/01/rdf-schema#",
    "situation" "http://www.ontologydesignpatterns.org/cp/owl/situation.owl#",
    "xsd"       "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://www.ontologydesignpatterns.org/cp/owl/situation.owl",
   :rdfa/prefix "situation",
   :rdfa/uri "http://www.ontologydesignpatterns.org/cp/owl/situation.owl#",
   :rdfs/label "situation"})

(def Situation
  "A view on a set of entities. It can be seen as a 'relational context', reifying a relation. For example, a PlanExecution is a context including some actions executed by agents according to certain parameters and expected tasks to be achieved from a Plan; a DiagnosedSituation is a context of observed entities that is interpreted on the basis of a Diagnosis, etc. Situation is also able to represent reified n-ary relations, where isSettingFor is the top-level relation for all binary projections of the n-ary relation. If used in a transformation pattern for n-ary relations, the designer should take care of: - creating only one situation for each instance of an n-ary relation, otherwise the 'identification constraint' (Calvanese et al., IJCAI 2001) could be violated - adding an 'exact cardinality' restriction corresponding to the arity of the n-ary relation, otherwise the designer would actually represent a polymorphic relation."
  {:db/ident :situation/Situation,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A view on a set of entities. It can be seen as a 'relational context', reifying a relation.\nFor example, a PlanExecution is a context including some actions executed by agents according to certain parameters and expected tasks to be achieved from a Plan; a DiagnosedSituation is a context of observed entities that is interpreted on the basis of a Diagnosis, etc.\nSituation is also able to represent reified n-ary relations, where isSettingFor is the top-level relation for all binary projections of the n-ary relation. If used in a transformation pattern for n-ary relations, the designer should take care of:\n- creating only one situation for each instance of an n-ary relation, otherwise the 'identification constraint' (Calvanese et al., IJCAI 2001) could be violated\n- adding an 'exact cardinality' restriction corresponding to the arity of the n-ary relation, otherwise the designer would actually represent a polymorphic relation.",
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/situation.owl",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Situation"},
   :rdfs/subClassOf {:owl/minCardinality 1,
                     :owl/onProperty     :situation/isSettingFor,
                     :rdf/type           :owl/Restriction}})

(def hasSetting
  "A relation between entities and situations, e.g. 'this morning I've prepared my coffee with a new fantastic Arabica' (i.e.: (an amount of) a new fantastic Arabica hasSetting the preparation of my coffee this morning)."
  {:db/ident :situation/hasSetting,
   :owl/inverseOf :situation/isSettingFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between entities and situations, e.g. 'this morning I've prepared my coffee with a new fantastic Arabica' (i.e.: (an amount of) a new fantastic Arabica hasSetting the preparation of my coffee this morning).",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/situation.owl",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has setting"},
   :rdfs/range :situation/Situation})

(def isSettingFor
  "is setting for"
  {:db/ident :situation/isSettingFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :situation/Situation,
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/situation.owl",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is setting for"},
   :rdfs/range :owl/Thing})

(def ^{:private true} coversRequirements
  {:db/ident :cpannotationschema/coversRequirements,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} extractedFrom
  {:db/ident :cpannotationschema/extractedFrom,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} hasAuthor
  {:db/ident :cpannotationschema/hasAuthor,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} hasConsequences
  {:db/ident :cpannotationschema/hasConsequences,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} hasIntent
  {:db/ident :cpannotationschema/hasIntent,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} scenarios
  {:db/ident :cpannotationschema/scenarios,
   :rdf/type :owl/AnnotationProperty})