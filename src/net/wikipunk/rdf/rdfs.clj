(ns net.wikipunk.rdf.rdfs
  "The RDF Schema vocabulary (RDFS)"
  {:dcterms/title     "The RDF Schema vocabulary (RDFS)",
   :rdf/ns-prefix-map {"dc11" "http://purl.org/dc/elements/1.1/",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type          :owl/Ontology,
   :rdf/uri           "http://www.w3.org/2000/01/rdf-schema#",
   :rdfa/prefix       "rdfs",
   :rdfa/uri          "http://www.w3.org/2000/01/rdf-schema#",
   :rdfs/isDefinedBy  {:rdf/uri
                       "http://www.w3.org/TR/2004/REC-rdf-mt-20040210/"},
   :rdfs/seeAlso      "http://www.w3.org/2000/01/rdf-schema-more"}
  (:refer-clojure :exclude [comment range]))

(def T
  "The class of classes."
  {:db/ident         :rdfs/Class,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of classes.",
   :rdfs/isDefinedBy "http://www.w3.org/2000/01/rdf-schema#",
   :rdfs/label       "Class",
   :rdfs/subClassOf  :rdfs/Resource})

(def Container
  "The class of RDF containers."
  {:db/ident         :rdfs/Container,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of RDF containers.",
   :rdfs/isDefinedBy "http://www.w3.org/2000/01/rdf-schema#",
   :rdfs/label       "Container",
   :rdfs/subClassOf  :rdfs/Resource})

(def ContainerMembershipProperty
  "The class of container membership properties, rdf:_1, rdf:_2, ..., all of which are sub-properties of 'member'."
  {:db/ident         :rdfs/ContainerMembershipProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/comment
   "The class of container membership properties, rdf:_1, rdf:_2, ...,\n                    all of which are sub-properties of 'member'.",
   :rdfs/isDefinedBy "http://www.w3.org/2000/01/rdf-schema#",
   :rdfs/label       "ContainerMembershipProperty",
   :rdfs/subClassOf  :rdf/Property})

(def Datatype
  "The class of RDF datatypes."
  {:db/ident         :rdfs/Datatype,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of RDF datatypes.",
   :rdfs/isDefinedBy "http://www.w3.org/2000/01/rdf-schema#",
   :rdfs/label       "Datatype",
   :rdfs/subClassOf  :rdfs/Class})

(def Literal
  "The class of literal values, eg. textual strings and integers."
  {:db/ident         :rdfs/Literal,
   :rdf/type         :rdfs/Class,
   :rdfs/comment
   "The class of literal values, eg. textual strings and integers.",
   :rdfs/isDefinedBy "http://www.w3.org/2000/01/rdf-schema#",
   :rdfs/label       "Literal",
   :rdfs/subClassOf  :rdfs/Resource})

(def Resource
  "The class resource, everything."
  {:db/ident         :rdfs/Resource,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class resource, everything.",
   :rdfs/isDefinedBy "http://www.w3.org/2000/01/rdf-schema#",
   :rdfs/label       "Resource"})

(def comment
  "A description of the subject resource."
  {:db/ident         :rdfs/comment,
   :db/cardinality   :db.cardinality/many
   :db/valueType     :db.type/string
   :rdf/type         :rdf/Property,
   :rdfs/comment     "A description of the subject resource.",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy "http://www.w3.org/2000/01/rdf-schema#",
   :rdfs/label       "comment",
   :rdfs/range       :rdfs/Literal})

(def domain
  "A domain of the subject property."
  {:db/ident         :rdfs/domain,
   :db/cardinality   :db.cardinality/many
   :db/valueType     :db.type/ref
   :rdf/type         :rdf/Property,
   :rdfs/comment     "A domain of the subject property.",
   :rdfs/domain      :rdf/Property,
   :rdfs/isDefinedBy "http://www.w3.org/2000/01/rdf-schema#",
   :rdfs/label       "domain",
   :rdfs/range       :rdfs/Class})

(def isDefinedBy
  "The defininition of the subject resource."
  {:db/ident           :rdfs/isDefinedBy,
   :db/cardinality     :db.cardinality/many
   :db/valueType       :db.type/ref
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The defininition of the subject resource.",
   :rdfs/domain        :rdfs/Resource,
   :rdfs/isDefinedBy   "http://www.w3.org/2000/01/rdf-schema#",
   :rdfs/label         "isDefinedBy",
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def label
  "A human-readable name for the subject."
  {:db/ident         :rdfs/label,
   :db/cardinality   :db.cardinality/many
   :db/valueType     :db.type/string
   :rdf/type         :rdf/Property,
   :rdfs/comment     "A human-readable name for the subject.",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy "http://www.w3.org/2000/01/rdf-schema#",
   :rdfs/label       "label",
   :rdfs/range       :rdfs/Literal})

(def member
  "A member of the subject resource."
  {:db/ident         :rdfs/member,
   :db/cardinality   :db.cardinality/many
   :db/valueType     :db.type/ref
   :rdf/type         :rdf/Property,
   :rdfs/comment     "A member of the subject resource.",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy "http://www.w3.org/2000/01/rdf-schema#",
   :rdfs/label       "member",
   :rdfs/range       :rdfs/Resource})

(def range
  "A range of the subject property."
  {:db/ident         :rdfs/range,
   :db/cardinality   :db.cardinality/many
   :db/valueType     :db.type/ref
   :rdf/type         :rdf/Property,
   :rdfs/comment     "A range of the subject property.",
   :rdfs/domain      :rdf/Property,
   :rdfs/isDefinedBy "http://www.w3.org/2000/01/rdf-schema#",
   :rdfs/label       "range",
   :rdfs/range       :rdfs/Class})

(def seeAlso
  "Further information about the subject resource."
  {:db/ident         :rdfs/seeAlso,
   :db/cardinality   :db.cardinality/many
   :db/valueType     :db.type/string
   :rdf/type         :rdf/Property,
   :rdfs/comment     "Further information about the subject resource.",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy "http://www.w3.org/2000/01/rdf-schema#",
   :rdfs/label       "seeAlso",
   :rdfs/range       :rdfs/Resource})

(def subClassOf
  "The subject is a subclass of a class."
  {:db/ident         :rdfs/subClassOf,
   :db/cardinality   :db.cardinality/many
   :db/valueType     :db.type/ref
   :rdf/type         :rdf/Property,
   :rdfs/comment     "The subject is a subclass of a class.",
   :rdfs/domain      :rdfs/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2000/01/rdf-schema#",
   :rdfs/label       "subClassOf",
   :rdfs/range       :rdfs/Class})

(def subPropertyOf
  "The subject is a subproperty of a property."
  {:db/ident         :rdfs/subPropertyOf,
   :db/cardinality   :db.cardinality/many
   :db/valueType     :db.type/ref
   :rdf/type         :rdf/Property,
   :rdfs/comment     "The subject is a subproperty of a property.",
   :rdfs/domain      :rdf/Property,
   :rdfs/isDefinedBy "http://www.w3.org/2000/01/rdf-schema#",
   :rdfs/label       "subPropertyOf",
   :rdfs/range       :rdf/Property})
