(ns net.wikipunk.ontology.owl-rl-axioms
  "Built-in OWL RL/RDFS axioms + helpers to assert them into Datomic.

  This namespace only provides data and install helpers. It does not run
  automatically. Ensure OWL/RDFS predicate attributes exist first."
  (:require [clojure.set :as set]
            [datomic.client.api :as d]))

;; --- RDFS axioms -----------------------------------------------------------

(def ^{:doc "RDF list/property typing axioms."}
  rdfs-simple
  [[:rdf/type     :rdf/type  :rdf/Property]
   [:rdf/subject  :rdf/type  :rdf/Property]
   [:rdf/predicate :rdf/type :rdf/Property]
   [:rdf/object   :rdf/type  :rdf/Property]
   [:rdf/first    :rdf/type  :rdf/Property]
   [:rdf/rest     :rdf/type  :rdf/Property]
   [:rdf/value    :rdf/type  :rdf/Property]
   [:rdf/nil      :rdf/type  :rdf/List]])

(def ^{:doc "Core RDFS domain/range and class/property typing axioms."}
  rdfs-core
  [[:rdf/type                :rdfs/domain :rdfs/Resource]
   [:rdfs/domain             :rdfs/domain :rdf/Property]
   [:rdfs/range              :rdfs/domain :rdf/Property]
   [:rdfs/subPropertyOf      :rdfs/domain :rdf/Property]
   [:rdfs/subClassOf         :rdfs/domain :rdfs/Class]
   [:rdf/subject             :rdfs/domain :rdf/Statement]
   [:rdf/predicate           :rdfs/domain :rdf/Statement]
   [:rdf/object              :rdfs/domain :rdf/Statement]
   [:rdfs/member             :rdfs/domain :rdfs/Resource]
   [:rdf/first               :rdfs/domain :rdf/List]
   [:rdf/rest                :rdfs/domain :rdf/List]
   [:rdfs/seeAlso            :rdfs/domain :rdfs/Resource]
   [:rdfs/isDefinedBy        :rdfs/domain :rdfs/Resource]
   [:rdfs/comment            :rdfs/domain :rdfs/Resource]
   [:rdfs/label              :rdfs/domain :rdfs/Resource]
   [:rdf/value               :rdfs/domain :rdfs/Resource]

   [:rdf/Property            :rdf/type    :rdfs/Class]
   [:rdf/type                :rdfs/range  :rdfs/Class]
   [:rdfs/domain             :rdfs/range  :rdfs/Class]
   [:rdfs/range              :rdfs/range  :rdfs/Class]
   [:rdfs/subPropertyOf      :rdfs/range  :rdf/Property]
   [:rdfs/subClassOf         :rdfs/range  :rdfs/Class]
   [:rdf/subject             :rdfs/range  :rdfs/Resource]
   [:rdf/predicate           :rdfs/range  :rdfs/Resource]
   [:rdf/object              :rdfs/range  :rdfs/Resource]
   [:rdfs/member             :rdfs/range  :rdfs/Resource]
   [:rdf/first               :rdfs/range  :rdfs/Resource]
   [:rdf/rest                :rdfs/range  :rdf/List]
   [:rdfs/seeAlso            :rdfs/range  :rdfs/Resource]
   [:rdfs/isDefinedBy        :rdfs/range  :rdfs/Resource]
   [:rdfs/comment            :rdfs/range  :rdfs/Literal]
   [:rdfs/label              :rdfs/range  :rdfs/Literal]
   [:rdf/value               :rdfs/range  :rdfs/Resource]

   [:rdf/Alt                 :rdfs/subClassOf :rdfs/Container]
   [:rdf/Bag                 :rdfs/subClassOf :rdfs/Container]
   [:rdf/Seq                 :rdfs/subClassOf :rdfs/Container]
   [:rdfs/ContainerMembershipProperty :rdfs/subClassOf :rdf/Property]
   [:rdfs/isDefinedBy        :rdfs/subPropertyOf :rdfs/seeAlso]
   [:rdf/XMLLiteral          :rdf/type    :rdfs/Datatype]
   [:rdf/XMLLiteral          :rdfs/subClassOf :rdfs/Literal]
   [:rdfs/Datatype           :rdfs/subClassOf :rdfs/Class]

   ;; Valid triples (pre-materialize common ones)
   [:rdfs/Resource           :rdf/type :rdfs/Class]
   [:rdfs/Class              :rdf/type :rdfs/Class]
   [:rdfs/Literal            :rdf/type :rdfs/Class]
   [:rdf/XMLLiteral          :rdf/type :rdfs/Class]
   [:rdfs/Datatype           :rdf/type :rdfs/Class]
   [:rdf/Seq                 :rdf/type :rdfs/Class]
   [:rdf/Bag                 :rdf/type :rdfs/Class]
   [:rdf/Alt                 :rdf/type :rdfs/Class]
   [:rdfs/Container          :rdf/type :rdfs/Class]
   [:rdf/List                :rdf/type :rdfs/Class]
   [:rdfs/ContainerMembershipProperty :rdf/type :rdfs/Class]
   [:rdf/Property            :rdf/type :rdfs/Class]
   [:rdf/Statement           :rdf/type :rdfs/Class]
   [:rdfs/domain             :rdf/type :rdf/Property]
   [:rdfs/range              :rdf/type :rdf/Property]
   [:rdfs/subPropertyOf      :rdf/type :rdf/Property]
   [:rdfs/subClassOf         :rdf/type :rdf/Property]
   [:rdfs/member             :rdf/type :rdf/Property]
   [:rdfs/seeAlso            :rdf/type :rdf/Property]
   [:rdfs/isDefinedBy        :rdf/type :rdf/Property]
   [:rdfs/comment            :rdf/type :rdf/Property]
   [:rdfs/label              :rdf/type :rdf/Property]])

(def ^{:doc "XSD datatype hierarchy and datatype typing axioms."}
  rdfs-d-types
  [[:xsd/integer   :rdfs/subClassOf :rdfs/Literal]
   [:xsd/decimal   :rdfs/subClassOf :rdfs/Literal]
   [:xsd/nonPositiveInteger :rdfs/subClassOf :xsd/integer]
   [:xsd/positiveInteger    :rdfs/subClassOf :xsd/nonNegativeInteger]
   [:xsd/long      :rdfs/subClassOf :xsd/integer]
   [:xsd/int       :rdfs/subClassOf :xsd/long]
   [:xsd/short     :rdfs/subClassOf :xsd/int]
   [:xsd/byte      :rdfs/subClassOf :xsd/short]
   [:xsd/unsignedLong  :rdfs/subClassOf :xsd/nonNegativeInteger]
   [:xsd/unsignedInt   :rdfs/subClassOf :xsd/unsignedLong]
   [:xsd/unsignedShort :rdfs/subClassOf :xsd/unsignedInt]
   [:xsd/unsignedByte  :rdfs/subClassOf :xsd/unsignedShort]
   [:xsd/nonNegativeInteger :rdfs/subClassOf :xsd/integer]
   [:xsd/negativeInteger    :rdfs/subClassOf :xsd/nonPositiveInteger]
   [:xsd/normalizedString   :rdfs/subClassOf :xsd/string]
   [:xsd/token              :rdfs/subClassOf :xsd/normalizedString]
   [:xsd/language           :rdfs/subClassOf :xsd/token]
   [:xsd/Name               :rdfs/subClassOf :xsd/token]
   [:xsd/NMTOKEN            :rdfs/subClassOf :xsd/token]
   [:xsd/NCName             :rdfs/subClassOf :xsd/Name]
   [:xsd/dateTimeStamp      :rdfs/subClassOf :xsd/dateTime]

   [:xsd/integer  :rdf/type :rdfs/Datatype]
   [:xsd/decimal  :rdf/type :rdfs/Datatype]
   [:xsd/nonPositiveInteger :rdf/type :rdfs/Datatype]
   [:xsd/positiveInteger    :rdf/type :rdfs/Datatype]
   [:xsd/long     :rdf/type :rdfs/Datatype]
   [:xsd/int      :rdf/type :rdfs/Datatype]
   [:xsd/short    :rdf/type :rdfs/Datatype]
   [:xsd/byte     :rdf/type :rdfs/Datatype]
   [:xsd/unsignedLong  :rdf/type :rdfs/Datatype]
   [:xsd/unsignedInt   :rdf/type :rdfs/Datatype]
   [:xsd/unsignedShort :rdf/type :rdfs/Datatype]
   [:xsd/unsignedByte  :rdf/type :rdfs/Datatype]
   [:xsd/float    :rdf/type :rdfs/Datatype]
   [:xsd/double   :rdf/type :rdfs/Datatype]
   [:xsd/string   :rdf/type :rdfs/Datatype]
   [:xsd/normalizedString :rdf/type :rdfs/Datatype]
   [:xsd/token    :rdf/type :rdfs/Datatype]
   [:xsd/language :rdf/type :rdfs/Datatype]
   [:xsd/Name     :rdf/type :rdfs/Datatype]
   [:xsd/NCName   :rdf/type :rdfs/Datatype]
   [:xsd/NMTOKEN  :rdf/type :rdfs/Datatype]
   [:xsd/boolean  :rdf/type :rdfs/Datatype]
   [:xsd/hexBinary :rdf/type :rdfs/Datatype]
   [:xsd/base64Binary :rdf/type :rdfs/Datatype]
   [:xsd/anyURI   :rdf/type :rdfs/Datatype]
   [:xsd/dateTimeStamp :rdf/type :rdfs/Datatype]
   [:xsd/dateTime :rdf/type :rdfs/Datatype]
   [:rdfs/Literal :rdf/type :rdfs/Datatype]
   [:rdf/XMLLiteral :rdf/type :rdfs/Datatype]])

(def ^{:doc "Convenience vector of rdfs-simple + rdfs-core."}
  rdfs-axioms
  (into [] (concat rdfs-simple rdfs-core)))

;; --- OWL axioms ------------------------------------------------------------

(def ^{:doc "OWL class typing axioms (meta-classes and built-ins)."}
  owl-class-axioms
  [[:owl/AllDifferent              :rdf/type :rdfs/Class]
   [:owl/AllDifferent              :rdfs/subClassOf :rdfs/Resource]
   [:owl/AllDisjointClasses        :rdf/type :rdfs/Class]
   [:owl/AllDisjointClasses        :rdfs/subClassOf :rdfs/Resource]
   [:owl/AllDisjointProperties     :rdf/type :rdfs/Class]
   [:owl/AllDisjointProperties     :rdfs/subClassOf :rdfs/Resource]
   [:owl/Annotation                :rdf/type :rdfs/Class]
   [:owl/Annotation                :rdfs/subClassOf :rdfs/Resource]
   [:owl/AnnotationProperty        :rdf/type :rdfs/Class]
   [:owl/AnnotationProperty        :rdfs/subClassOf :rdf/Property]
   [:owl/AsymmetricProperty        :rdf/type :rdfs/Class]
   [:owl/AsymmetricProperty        :rdfs/subClassOf :rdf/Property]
   [:owl/Class                     :rdf/type :rdfs/Class]
   [:owl/Class                     :owl/equivalentClass :rdfs/Class]
   [:rdfs/Datatype                 :rdf/type :rdfs/Class]
   [:owl/DatatypeProperty          :rdf/type :rdfs/Class]
   [:owl/DatatypeProperty          :rdfs/subClassOf :rdf/Property]
   [:owl/DeprecatedClass           :rdf/type :rdfs/Class]
   [:owl/DeprecatedClass           :rdfs/subClassOf :rdfs/Class]
   [:owl/DeprecatedProperty        :rdf/type :rdfs/Class]
   [:owl/DeprecatedProperty        :rdfs/subClassOf :rdf/Property]
   [:owl/FunctionalProperty        :rdf/type :rdfs/Class]
   [:owl/FunctionalProperty        :rdfs/subClassOf :rdf/Property]
   [:owl/InverseFunctionalProperty :rdf/type :rdfs/Class]
   [:owl/InverseFunctionalProperty :rdfs/subClassOf :rdf/Property]
   [:owl/IrreflexiveProperty       :rdf/type :rdfs/Class]
   [:owl/IrreflexiveProperty       :rdfs/subClassOf :rdf/Property]
   [:rdfs/Literal                  :rdf/type :rdfs/Datatype]
   [:owl/NegativePropertyAssertion :rdf/type :rdfs/Class]
   [:owl/NegativePropertyAssertion :rdfs/subClassOf :rdfs/Resource]
   [:owl/Nothing                   :rdf/type :rdfs/Class]
   [:owl/Nothing                   :rdfs/subClassOf :owl/Thing]
   [:owl/ObjectProperty            :rdf/type :rdfs/Class]
   [:owl/ObjectProperty            :owl/equivalentClass :rdf/Property]
   [:owl/Ontology                  :rdf/type :rdfs/Class]
   [:owl/Ontology                  :rdfs/subClassOf :rdfs/Resource]
   [:owl/OntologyProperty          :rdf/type :rdfs/Class]
   [:owl/OntologyProperty          :rdfs/subClassOf :rdf/Property]
   [:rdf/Property                  :rdf/type :rdfs/Class]
   [:owl/ReflexiveProperty         :rdf/type :rdfs/Class]
   [:owl/ReflexiveProperty         :rdfs/subClassOf :rdf/Property]
   [:owl/Restriction               :rdf/type :rdfs/Class]
   [:owl/Restriction               :rdfs/subClassOf :rdfs/Class]
   [:owl/SymmetricProperty         :rdf/type :rdfs/Class]
   [:owl/SymmetricProperty         :rdfs/subClassOf :rdf/Property]
   [:owl/Thing                     :rdf/type :rdfs/Class]
   [:owl/Thing                     :rdfs/subClassOf :rdfs/Resource]
   [:owl/TransitiveProperty        :rdf/type :rdfs/Class]
   [:owl/TransitiveProperty        :rdfs/subClassOf :rdf/Property]
   ;; Valid OWL class typings
   [:owl/AllDisjointProperties     :rdf/type :owl/Class]
   [:owl/AllDisjointClasses        :rdf/type :owl/Class]
   [:owl/Annotation                :rdf/type :owl/Class]
   [:owl/AsymmetricProperty        :rdf/type :owl/Class]
   [:owl/Axiom                     :rdf/type :owl/Class]
   [:owl/DataRange                 :rdf/type :owl/Class]
   [:rdfs/Datatype                 :rdf/type :owl/Class]
   [:owl/DatatypeProperty          :rdf/type :owl/Class]
   [:owl/DeprecatedClass           :rdf/type :owl/Class]
   [:owl/DeprecatedClass           :rdfs/subClassOf :owl/Class]
   [:owl/DeprecatedProperty        :rdf/type :owl/Class]
   [:owl/FunctionalProperty        :rdf/type :owl/Class]
   [:owl/InverseFunctionalProperty :rdf/type :owl/Class]
   [:owl/IrreflexiveProperty       :rdf/type :owl/Class]
   [:owl/NamedIndividual           :rdf/type :owl/Class]
   [:owl/NegativePropertyAssertion :rdf/type :owl/Class]
   [:owl/Nothing                   :rdf/type :owl/Class]
   [:owl/ObjectProperty            :rdf/type :owl/Class]
   [:owl/Ontology                  :rdf/type :owl/Class]
   [:owl/OntologyProperty          :rdf/type :owl/Class]
   [:rdf/Property                  :rdf/type :owl/Class]
   [:owl/ReflexiveProperty         :rdf/type :owl/Class]
   [:owl/Restriction               :rdf/type :owl/Class]
   [:owl/Restriction               :rdfs/subClassOf :owl/Class]
   [:owl/SymmetricProperty         :rdf/type :owl/Class]
   [:owl/Thing                     :rdf/type :owl/Class]
   [:owl/TransitiveProperty        :rdf/type :owl/Class]])

(def ^{:doc "OWL property typing axioms (meta-properties and built-ins)."}
  owl-prop-axioms
  [[:owl/allValuesFrom        :rdf/type :rdf/Property]
   [:owl/allValuesFrom        :rdfs/domain :owl/Restriction]
   [:owl/allValuesFrom        :rdfs/range  :rdfs/Class]
   [:owl/assertionProperty    :rdf/type :rdf/Property]
   [:owl/assertionProperty    :rdfs/domain :owl/NegativePropertyAssertion]
   [:owl/assertionProperty    :rdfs/range  :rdf/Property]
   [:owl/backwardCompatibleWith :rdf/type :owl/OntologyProperty]
   [:owl/backwardCompatibleWith :rdf/type :owl/AnnotationProperty]
   [:owl/backwardCompatibleWith :rdfs/domain :owl/Ontology]
   [:owl/backwardCompatibleWith :rdfs/range  :owl/Ontology]
   [:rdfs/comment             :rdf/type :owl/AnnotationProperty]
   [:rdfs/comment             :rdfs/domain :rdfs/Resource]
   [:rdfs/comment             :rdfs/range  :rdfs/Literal]
   [:owl/complementOf         :rdf/type :rdf/Property]
   [:owl/complementOf         :rdfs/domain :rdfs/Class]
   [:owl/complementOf         :rdfs/range  :rdfs/Class]
   [:owl/deprecated           :rdf/type :owl/AnnotationProperty]
   [:owl/deprecated           :rdfs/domain :rdfs/Resource]
   [:owl/deprecated           :rdfs/range  :rdfs/Resource]
   [:owl/differentFrom        :rdf/type :rdf/Property]
   [:owl/differentFrom        :rdfs/domain :rdfs/Resource]
   [:owl/differentFrom        :rdfs/range  :rdfs/Resource]
   [:owl/disjointWith         :rdf/type :rdf/Property]
   [:owl/disjointWith         :rdfs/domain :rdfs/Class]
   [:owl/disjointWith         :rdfs/range  :rdfs/Class]
   [:owl/distinctMembers      :rdf/type :rdf/Property]
   [:owl/distinctMembers      :rdfs/domain :owl/AllDifferent]
   [:owl/distinctMembers      :rdfs/range  :rdf/List]
   [:owl/equivalentClass      :rdf/type :rdf/Property]
   [:owl/equivalentClass      :rdfs/domain :rdfs/Class]
   [:owl/equivalentClass      :rdfs/range  :rdfs/Class]
   [:owl/equivalentProperty   :rdf/type :rdf/Property]
   [:owl/equivalentProperty   :rdfs/domain :rdf/Property]
   [:owl/equivalentProperty   :rdfs/range  :rdf/Property]
   [:owl/hasKey               :rdf/type :rdf/Property]
   [:owl/hasKey               :rdfs/domain :rdfs/Class]
   [:owl/hasKey               :rdfs/range  :rdf/List]
   [:owl/hasValue             :rdf/type :rdf/Property]
   [:owl/hasValue             :rdfs/domain :owl/Restriction]
   [:owl/hasValue             :rdfs/range  :rdfs/Resource]
   [:owl/imports              :rdf/type :owl/OntologyProperty]
   [:owl/imports              :rdfs/domain :owl/Ontology]
   [:owl/imports              :rdfs/range  :owl/Ontology]
   [:owl/incompatibleWith     :rdf/type :owl/OntologyProperty]
   [:owl/incompatibleWith     :rdf/type :owl/AnnotationProperty]
   [:owl/incompatibleWith     :rdfs/domain :owl/Ontology]
   [:owl/incompatibleWith     :rdfs/range  :owl/Ontology]
   [:owl/intersectionOf       :rdf/type :rdf/Property]
   [:owl/intersectionOf       :rdfs/domain :rdfs/Class]
   [:owl/intersectionOf       :rdfs/range  :rdf/List]
   [:owl/inverseOf            :rdf/type :rdf/Property]
   [:owl/inverseOf            :rdfs/domain :rdf/Property]
   [:owl/inverseOf            :rdfs/range  :rdf/Property]
   [:rdfs/isDefinedBy         :rdf/type :owl/AnnotationProperty]
   [:rdfs/isDefinedBy         :rdfs/domain :rdfs/Resource]
   [:rdfs/isDefinedBy         :rdfs/range  :rdfs/Resource]
   [:rdfs/label               :rdf/type :owl/AnnotationProperty]
   [:rdfs/label               :rdfs/domain :rdfs/Resource]
   [:rdfs/label               :rdfs/range  :rdfs/Literal]
   [:owl/maxCardinality       :rdf/type :rdf/Property]
   [:owl/maxCardinality       :rdfs/domain :owl/Restriction]
   [:owl/maxCardinality       :rdfs/range  :xsd/nonNegativeInteger]
   [:owl/maxQualifiedCardinality :rdf/type :rdf/Property]
   [:owl/maxQualifiedCardinality :rdfs/domain :owl/Restriction]
   [:owl/maxQualifiedCardinality :rdfs/range  :xsd/nonNegativeInteger]
   [:owl/members              :rdf/type :rdf/Property]
   [:owl/members              :rdfs/domain :rdfs/Resource]
   [:owl/members              :rdfs/range  :rdf/List]
   [:owl/onClass              :rdf/type :rdf/Property]
   [:owl/onClass              :rdfs/domain :owl/Restriction]
   [:owl/onClass              :rdfs/range  :rdfs/Class]
   [:owl/onDatatype           :rdf/type :rdf/Property]
   [:owl/onDatatype           :rdfs/domain :rdfs/Datatype]
   [:owl/onDatatype           :rdfs/range  :rdfs/Datatype]
   [:owl/oneOf                :rdf/type :rdf/Property]
   [:owl/oneOf                :rdfs/domain :rdfs/Class]
   [:owl/oneOf                :rdfs/range  :rdf/List]
   [:owl/onProperty           :rdf/type :rdf/Property]
   [:owl/onProperty           :rdfs/domain :owl/Restriction]
   [:owl/onProperty           :rdfs/range  :rdf/Property]
   [:owl/priorVersion         :rdf/type :owl/OntologyProperty]
   [:owl/priorVersion         :rdf/type :owl/AnnotationProperty]
   [:owl/priorVersion         :rdfs/domain :owl/Ontology]
   [:owl/priorVersion         :rdfs/range  :owl/Ontology]
   [:owl/propertyChainAxiom   :rdf/type :rdf/Property]
   [:owl/propertyChainAxiom   :rdfs/domain :rdf/Property]
   [:owl/propertyChainAxiom   :rdfs/range  :rdf/List]
   [:owl/sameAs               :rdf/type :rdf/Property]
   [:owl/sameAs               :rdfs/domain :rdfs/Resource]
   [:owl/sameAs               :rdfs/range  :rdfs/Resource]
   [:rdfs/seeAlso             :rdf/type :owl/AnnotationProperty]
   [:rdfs/seeAlso             :rdfs/domain :rdfs/Resource]
   [:rdfs/seeAlso             :rdfs/range  :rdfs/Resource]
   [:owl/someValuesFrom       :rdf/type :rdf/Property]
   [:owl/someValuesFrom       :rdfs/domain :owl/Restriction]
   [:owl/someValuesFrom       :rdfs/range  :rdfs/Class]
   [:owl/sourceIndividual     :rdf/type :rdf/Property]
   [:owl/sourceIndividual     :rdfs/domain :owl/NegativePropertyAssertion]
   [:owl/sourceIndividual     :rdfs/range  :rdfs/Resource]
   [:owl/targetIndividual     :rdf/type :rdf/Property]
   [:owl/targetIndividual     :rdfs/domain :owl/NegativePropertyAssertion]
   [:owl/targetIndividual     :rdfs/range  :rdfs/Resource]
   [:owl/targetValue          :rdf/type :rdf/Property]
   [:owl/targetValue          :rdfs/domain :owl/NegativePropertyAssertion]
   [:owl/targetValue          :rdfs/range  :rdfs/Literal]
   [:owl/unionOf              :rdf/type :rdf/Property]
   [:owl/unionOf              :rdfs/domain :rdfs/Class]
   [:owl/unionOf              :rdfs/range  :rdf/List]
   [:owl/versionInfo          :rdf/type :owl/AnnotationProperty]
   [:owl/versionInfo          :rdfs/domain :rdfs/Resource]
   [:owl/versionInfo          :rdfs/range  :rdfs/Resource]
   [:owl/versionIRI           :rdf/type :owl/AnnotationProperty]
   [:owl/versionIRI           :rdfs/domain :rdfs/Resource]
   [:owl/versionIRI           :rdfs/range  :rdfs/Resource]
   [:owl/withRestrictions     :rdf/type :rdf/Property]
   [:owl/withRestrictions     :rdfs/domain :rdfs/Datatype]
   [:owl/withRestrictions     :rdfs/range  :rdf/List]
   ;; Helpful additional ranges/domains
   [:owl/allValuesFrom        :rdfs/range :owl/Class]
   [:owl/complementOf         :rdfs/domain :owl/Class]
   [:owl/complementOf         :rdfs/range  :owl/Class]
   [:owl/disjointUnionOf      :rdfs/domain :owl/Class]
   [:owl/disjointWith         :rdfs/domain :owl/Class]
   [:owl/disjointWith         :rdfs/range  :owl/Class]
   [:owl/equivalentClass      :rdfs/domain :owl/Class]
   [:owl/equivalentClass      :rdfs/range  :owl/Class]
   [:owl/hasKey               :rdfs/domain :owl/Class]
   [:owl/intersectionOf       :rdfs/domain :owl/Class]
   [:owl/onClass              :rdfs/range  :owl/Class]
   [:owl/onDatatype           :rdfs/domain :owl/DataRange]
   [:owl/onDatatype           :rdfs/range  :owl/DataRange]
   [:owl/oneOf                :rdfs/domain :owl/Class]
   [:owl/someValuesFrom       :rdfs/range  :owl/Class]
   [:owl/unionOf              :rdfs/range  :owl/Class]
   ;; beyond OWL RL
   [:owl/hasSelf              :rdf/type    :rdf/Property]
   [:owl/hasSelf              :rdfs/domain :owl/Restriction]
   [:owl/hasSelf              :rdfs/range  :xsd/boolean]
   [:owl/minCardinality          :rdf/type    :rdf/Property]
   [:owl/minCardinality          :rdfs/domain :owl/Restriction]
   [:owl/minCardinality          :rdfs/range  :xsd/nonNegativeInteger]
   [:owl/minQualifiedCardinality :rdf/type    :rdf/Property]
   [:owl/minQualifiedCardinality :rdfs/domain :owl/Restriction]
   [:owl/minQualifiedCardinality :rdfs/range  :xsd/nonNegativeInteger]
   [:owl/cardinality             :rdf/type    :rdf/Property]
   [:owl/cardinality             :rdfs/domain :owl/Restriction]
   [:owl/cardinality             :rdfs/range  :xsd/nonNegativeInteger]
   [:owl/disjointUnionOf         :rdf/type    :rdf/Property]
   [:owl/disjointUnionOf         :rdfs/domain :owl/Class]
   [:owl/disjointUnionOf         :rdfs/range  :rdf/List]
   [:owl/propertyDisjointWith    :rdf/type    :rdf/Property]
   [:owl/propertyDisjointWith    :rdfs/domain :rdf/Property]
   [:owl/propertyDisjointWith    :rdfs/range  :rdf/Property]])

(def ^{:doc "Combined OWL RL axioms (OWL class/property axioms)."}
  owlrl-axioms
  (into [] (concat owl-class-axioms owl-prop-axioms)))

(def ^{:doc "Datatype property typing axioms for OWL RL."}
  owld-types
  [[:rdf/PlainLiteral :rdf/type :rdfs/Datatype]
   [:rdf/PlainLiteral :rdfs/subClassOf :rdfs/Literal]])

(def ^{:doc "Datatype subclass axioms for OWL RL."}
  owld-subclasses
  [[:xsd/string           :rdfs/subClassOf :rdf/PlainLiteral]
   [:xsd/normalizedString :rdfs/subClassOf :rdf/PlainLiteral]
   [:xsd/token            :rdfs/subClassOf :rdf/PlainLiteral]
   [:xsd/Name             :rdfs/subClassOf :rdf/PlainLiteral]
   [:xsd/NCName           :rdfs/subClassOf :rdf/PlainLiteral]
   [:xsd/NMTOKEN          :rdfs/subClassOf :rdf/PlainLiteral]])

(def ^{:doc "Datatype disjointness axioms for OWL RL."}
  owld-disjoint
  [[:xsd/anyURI      :owl/disjointWith :xsd/base64Binary]
   [:xsd/anyURI      :owl/disjointWith :xsd/boolean]
   [:xsd/anyURI      :owl/disjointWith :xsd/dateTime]
   [:xsd/anyURI      :owl/disjointWith :xsd/decimal]
   [:xsd/anyURI      :owl/disjointWith :xsd/double]
   [:xsd/anyURI      :owl/disjointWith :xsd/float]
   [:xsd/anyURI      :owl/disjointWith :xsd/hexBinary]
   [:xsd/anyURI      :owl/disjointWith :xsd/string]
   [:xsd/anyURI      :owl/disjointWith :rdf/PlainLiteral]
   [:xsd/anyURI      :owl/disjointWith :rdf/XMLLiteral]
   [:xsd/base64Binary :owl/disjointWith :xsd/boolean]
   [:xsd/base64Binary :owl/disjointWith :xsd/dateTime]
   [:xsd/base64Binary :owl/disjointWith :xsd/decimal]
   [:xsd/base64Binary :owl/disjointWith :xsd/double]
   [:xsd/base64Binary :owl/disjointWith :xsd/float]
   [:xsd/base64Binary :owl/disjointWith :xsd/hexBinary]
   [:xsd/base64Binary :owl/disjointWith :xsd/string]
   [:xsd/base64Binary :owl/disjointWith :rdf/PlainLiteral]
   [:xsd/base64Binary :owl/disjointWith :rdf/XMLLiteral]
   [:xsd/boolean      :owl/disjointWith :xsd/dateTime]
   [:xsd/boolean      :owl/disjointWith :xsd/decimal]
   [:xsd/boolean      :owl/disjointWith :xsd/double]
   [:xsd/boolean      :owl/disjointWith :xsd/float]
   [:xsd/boolean      :owl/disjointWith :xsd/hexBinary]
   [:xsd/boolean      :owl/disjointWith :xsd/string]
   [:xsd/boolean      :owl/disjointWith :rdf/PlainLiteral]
   [:xsd/boolean      :owl/disjointWith :rdf/XMLLiteral]
   [:xsd/dateTime     :owl/disjointWith :xsd/decimal]
   [:xsd/dateTime     :owl/disjointWith :xsd/double]
   [:xsd/dateTime     :owl/disjointWith :xsd/float]
   [:xsd/dateTime     :owl/disjointWith :xsd/hexBinary]
   [:xsd/dateTime     :owl/disjointWith :xsd/string]
   [:xsd/dateTime     :owl/disjointWith :rdf/PlainLiteral]
   [:xsd/dateTime     :owl/disjointWith :rdf/XMLLiteral]
   [:xsd/decimal      :owl/disjointWith :xsd/double]
   [:xsd/decimal      :owl/disjointWith :xsd/float]
   [:xsd/decimal      :owl/disjointWith :xsd/hexBinary]
   [:xsd/decimal      :owl/disjointWith :xsd/string]
   [:xsd/decimal      :owl/disjointWith :rdf/PlainLiteral]
   [:xsd/decimal      :owl/disjointWith :rdf/XMLLiteral]
   [:xsd/double       :owl/disjointWith :xsd/float]
   [:xsd/double       :owl/disjointWith :xsd/hexBinary]
   [:xsd/double       :owl/disjointWith :xsd/string]
   [:xsd/double       :owl/disjointWith :rdf/PlainLiteral]
   [:xsd/double       :owl/disjointWith :rdf/XMLLiteral]
   [:xsd/float        :owl/disjointWith :xsd/hexBinary]
   [:xsd/float        :owl/disjointWith :xsd/string]
   [:xsd/float        :owl/disjointWith :rdf/PlainLiteral]
   [:xsd/float        :owl/disjointWith :rdf/XMLLiteral]
   [:xsd/hexBinary    :owl/disjointWith :xsd/string]
   [:xsd/hexBinary    :owl/disjointWith :rdf/PlainLiteral]
   [:xsd/hexBinary    :owl/disjointWith :rdf/XMLLiteral]
   [:xsd/string       :owl/disjointWith :rdf/XMLLiteral]])

(def ^{:doc "Combined OWL RL datatype axioms (RDFS + OWL datatype axioms)."}
  owlrl-d-axioms
  (into [] (concat rdfs-d-types owld-types owld-subclasses owld-disjoint)))

;; --- Utilities -------------------------------------------------------------

(defn- collect-idents
  [triples]
  (reduce (fn [acc [s p o]]
            (cond-> acc
              (keyword? s) (conj s)
              (keyword? p) (conj p)
              (keyword? o) (conj o)))
          #{} triples))

(defn- stub-idents! [conn idents]
  (when (seq idents)
    (let [db       (d/db conn)
          existing (set (map first (d/q '[:find ?ident :where [?e :db/ident ?ident]] db)))
          missing  (->> idents (remove existing) vec)]
      (doseq [batch (partition-all 512 missing)]
        (d/transact conn {:tx-data (mapv (fn [k] {:db/ident k}) batch)})))))

(def ^:private pred-order
  {:rdf/type 0 :rdfs/subClassOf 1 :rdfs/subPropertyOf 1 :rdfs/domain 2 :rdfs/range 2})

(defn- prioritize
  [triples]
  (sort-by (fn [[_ p _]] (get pred-order p 5)) triples))

(defn triples->tx
  "Convert triples to :db/add operations using lookup-refs by ident."
  [triples]
  (mapv (fn [[s p o]]
          [:db/add [:db/ident s] p (if (keyword? o) [:db/ident o] o)])
        triples))

(defn assert-triples!
  "Assert triples into Datomic in batches. Ensures idents exist first, then
   transacts in prioritized order. Options: {:batch-size 256}."
  ([conn triples] (assert-triples! conn triples {:batch-size 256}))
  ([conn triples {:keys [batch-size] :or {batch-size 256}}]
   (let [triples (vec (prioritize triples))
         idents  (collect-idents triples)]
     (stub-idents! conn idents)
     (doseq [batch (partition-all batch-size triples)]
       (d/transact conn {:tx-data (triples->tx batch)})))))

(defn assert-axioms!
  "Install selected axiomatic triples into Datomic. Pass a vector of sections
   from #{:rdfs :owlrl :owlrl-d}; defaults to all. Example:
   (assert-axioms! conn [:rdfs])
   (assert-axioms! conn [:rdfs :owlrl])"
  ([conn] (assert-axioms! conn [:rdfs :owlrl :owlrl-d]))
  ([conn sections]
   (let [m       {:rdfs    rdfs-axioms
                  :owlrl   owlrl-axioms
                  :owlrl-d owlrl-d-axioms}
         triples (->> sections (map m) (apply concat) vec)]
     (assert-triples! conn triples))))
