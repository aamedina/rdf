(ns net.wikipunk.rdf.mop
  "RDF vocabulary for the Metaobject Protocol."
  {:rdf/type :owl/Ontology}
  (:refer-clojure :exclude [class]))

(def StandardObject
  "Standard object instances are Clojure reference types that implement clojure.lang.IReference at a minimum."
  {:db/ident :mop/StandardObject
   :rdf/type :owl/Class})

(def Metaobject
  "A metaobject represents one program element. Associated with each metaobject is the information required to serve its role. This includes information provided directly by a RDF model or computed indirectly from other relevant metaobjects related to its metaclass's initialization protocol."
  {:db/ident        :mop/Metaobject
   :rdf/type        :rdfs/Class
   :rdfs/subClassOf :mop/StandardObject})

(def SlotDefinition
  "A slot definition metaobject is any instance of :rdf/Property"
  {:db/ident        :mop/SlotDefinition
   :rdf/type        :rdfs/Class
   :rdfs/subClassOf :mop/Metaobject})

(def DirectSlotDefinition
  "A direct slot definition is an :rdf/Property that has been associated with a class via :rdfs/domain."
  {:db/ident        :mop/DirectSlotDefinition
   :rdf/type        :rdfs/Class
   :rdfs/subClassOf :mop/SlotDefinition})

(def EffectiveSlotDefinition
  "An effective slot definition metaobject is created when class slots are computed."
  {:db/ident        :mop/EffectiveSlotDefinition
   :rdf/type        :rdfs/Class
   :rdfs/subClassOf :mop/SlotDefinition})

(def StandardClass
  "A standard class metaobject is any instance of :rdfs/Class"
  {:db/ident        :mop/StandardClass
   :rdf/type        :rdfs/Class
   :rdfs/subClassOf :mop/Metaobject})

(def ClojureRef
  "Standard objects created using mop/make-instance are instances of clojure.lang.Ref."
  {:db/ident :mop/ClojureRef
   :rdf/type [:mop/StandardObject :owl/NamedIndividual]})

(def ClojureNamespace
  "clojure.lang.Namespace metaobjects are used to organize RDF vocabularies which are tagged with an :rdf/type of :owl/Ontology."
  {:db/ident :mop/ClojureNamespace
   :rdf/type [:mop/Metaobject :owl/NamedIndividual]})

(def ClojureVar
  "clojure.lang.Var objects are used to initialize and maintain persistent metaobject state during the metaobject initialization protocol."
  {:db/ident :mop/ClojureVar
   :rdf/type [:mop/Metaobject :owl/NamedIndividual]})

(def class-direct-subclasses
  "A class metaobject's direct subclasses."
  {:db/ident    :mop/class-direct-subclasses
   :rdf/type    :owl/ObjectProperty
   :rdfs/domain :mop/StandardClass
   :rdfs/range  :mop/StandardClass})

(def class-direct-superclasses
  "A class metaobject's direct superclasses."
  {:db/ident    :mop/class-direct-superclasses
   :rdf/type    :owl/ObjectProperty
   :rdfs/domain :mop/StandardClass
   :rdfs/range  :mop/StandardClass})

(def class-precedence-list
  "A list of classes sorted by most-specific-first where the first element is the class itself and the last element is :rdfs/Class."
  {:db/ident    :mop/class-precedence-list
   :rdf/type    :owl/ObjectProperty
   :rdfs/domain :mop/StandardClass
   :rdfs/range  :mop/StandardClass})

(def class-direct-slots
  ":rdf/Property metaobjects associated by :rdfs/domain to a class are available as a list of direct slot definition metaobjects."
  {:db/ident    :mop/class-direct-slots
   :rdf/type    :owl/ObjectProperty
   :rdfs/domain :mop/StandardClass
   :rdfs/range  :mop/DirectSlotDefinition})

(def class-effective-slots
  "The slots which are accessible in instances of the class are available as a list of effective slot definition metaobjects."
  {:db/ident    :mop/class-effective-slots
   :rdf/type    :owl/ObjectProperty
   :rdfs/domain :mop/StandardClass
   :rdfs/range  :mop/EffectiveSlotDefinition})

(def SlotAllocation
  "Slot allocation is one of :mop/instance or :mop/class"
  {:db/ident  :mop/SlotAllocation
   :rdf/type  [:owl/NamedIndividual :owl/Class]
   :owl/oneOf [:mop/instance :mop/class]})

(def instance
  ":mop/instance slot allocation"
  {:db/ident     :mop/instance
   :rdf/type     [:mop/SlotAllocation :owl/NamedIndividual]})

(def class
  ":mop/class slot allocation"
  {:db/ident     :mop/class
   :rdf/type     [:mop/SlotAllocation :owl/NamedIndividual]})

(def slot-allocation
  "Slot allocation is one of :mop/instance or :mop/class"
  {:db/ident    :mop/slot-allocation
   :rdf/type    :owl/ObjectProperty
   :rdfs/domain :mop/SlotDefinition
   :rdfs/range  :mop/SlotAllocation})

(def slot-initfunction
  "The initialization form, if there is one, is available as a form that could appear in a defclass form. The initialization form together with its lexical environment is available as a function of no arguments which, when called, returns the result of evaluating the initialization form in its lexical environment. This is called the initfunction of the slot."
  {:db/ident    :mop/slot-initfunction
   :db/doc      "The initialization form, if there is one, is available as a form that could appear in a defclass form. The initialization form together with its lexical environment is available as a function of no arguments which, when called, returns the result of evaluating the initialization form in its lexical environment. This is called the initfunction of the slot."
   :rdf/type    :owl/ObjectProperty
   :rdfs/domain :mop/SlotDefinition
   :rdfs/range  :db.type/fn})
