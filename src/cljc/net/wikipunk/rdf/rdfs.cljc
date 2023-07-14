(ns net.wikipunk.rdf.rdfs
  "The RDF Schema vocabulary (RDFS)"
  {:dc11/title        #xsd/string "The RDF Schema vocabulary (RDFS)",
   :rdf/ns-prefix-map {"dc11" "http://purl.org/dc/elements/1.1/",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "rdfs",
   :rdfa/uri          "http://www.w3.org/2000/01/rdf-schema#",
   :rdfs/isDefinedBy  {:rdfa/uri
                       "http://www.w3.org/TR/2004/REC-rdf-mt-20040210/"},
   :rdfs/seeAlso      {:rdfa/uri "http://www.w3.org/2000/01/rdf-schema-more"},
   :reasoner          nil}
  (:refer-clojure :exclude [comment range]))

(def T
  "The class of classes."
  {:db/ident         :rdfs/Class,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #xsd/string "The class of classes.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       #xsd/string "Class",
   :rdfs/subClassOf  :rdfs/Resource})

(def Container
  "The class of RDF containers."
  {:db/ident         :rdfs/Container,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #xsd/string "The class of RDF containers.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       #xsd/string "Container",
   :rdfs/subClassOf  :rdfs/Resource})

(def ContainerMembershipProperty
  "The class of container membership properties, rdf:_1, rdf:_2, ...,\n                    all of which are sub-properties of 'member'."
  {:db/ident :rdfs/ContainerMembershipProperty,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "The class of container membership properties, rdf:_1, rdf:_2, ...,\n                    all of which are sub-properties of 'member'.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label #xsd/string "ContainerMembershipProperty",
   :rdfs/subClassOf :rdf/Property})

(def Datatype
  "The class of RDF datatypes."
  {:db/ident         :rdfs/Datatype,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #xsd/string "The class of RDF datatypes.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       #xsd/string "Datatype",
   :rdfs/subClassOf  :rdfs/Class})

(def Literal
  "The class of literal values, eg. textual strings and integers."
  {:db/ident :rdfs/Literal,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string "The class of literal values, eg. textual strings and integers.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label #xsd/string "Literal",
   :rdfs/subClassOf :rdfs/Resource})

(def Resource
  "The class resource, everything."
  {:db/ident         :rdfs/Resource,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #xsd/string "The class resource, everything.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       #xsd/string "Resource"})

(def comment
  "A description of the subject resource."
  {:db/ident         :rdfs/comment,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/string "A description of the subject resource.",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       #xsd/string "comment",
   :rdfs/range       :rdfs/Literal})

(def domain
  "A domain of the subject property."
  {:db/ident         :rdfs/domain,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/string "A domain of the subject property.",
   :rdfs/domain      :rdf/Property,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       #xsd/string "domain",
   :rdfs/range       :rdfs/Class})

(def isDefinedBy
  "The defininition of the subject resource."
  {:db/ident           :rdfs/isDefinedBy,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/string "The defininition of the subject resource.",
   :rdfs/domain        :rdfs/Resource,
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label         #xsd/string "isDefinedBy",
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def label
  "A human-readable name for the subject."
  {:db/ident         :rdfs/label,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/string "A human-readable name for the subject.",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       #xsd/string "label",
   :rdfs/range       :rdfs/Literal})

(def member
  "A member of the subject resource."
  {:db/ident         :rdfs/member,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/string "A member of the subject resource.",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       #xsd/string "member",
   :rdfs/range       :rdfs/Resource})

(def range
  "A range of the subject property."
  {:db/ident         :rdfs/range,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/string "A range of the subject property.",
   :rdfs/domain      :rdf/Property,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       #xsd/string "range",
   :rdfs/range       :rdfs/Class})

(def seeAlso
  "Further information about the subject resource."
  {:db/ident         :rdfs/seeAlso,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/string
                      "Further information about the subject resource.",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       #xsd/string "seeAlso",
   :rdfs/range       :rdfs/Resource})

(def subClassOf
  "The subject is a subclass of a class."
  {:db/ident         :rdfs/subClassOf,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/string "The subject is a subclass of a class.",
   :rdfs/domain      :rdfs/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       #xsd/string "subClassOf",
   :rdfs/range       :rdfs/Class})

(def subPropertyOf
  "The subject is a subproperty of a property."
  {:db/ident         :rdfs/subPropertyOf,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/string "The subject is a subproperty of a property.",
   :rdfs/domain      :rdf/Property,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       #xsd/string "subPropertyOf",
   :rdfs/range       :rdf/Property})