(ns net.wikipunk.rdf.rdfs
  ^{:base       "http://www.w3.org/2000/01/rdf-schema#",
    :namespaces {"dc11" "http://purl.org/dc/elements/1.1/",
                 "owl"  "http://www.w3.org/2002/07/owl#",
                 "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
    :prefix     "rdfs",
    :source     "http://www.w3.org/2000/01/rdf-schema#"}
  {:dc11/title   "The RDF Schema vocabulary (RDFS)",
   :rdf/type     :owl/Ontology,
   :rdfs/seeAlso {:xsd/anyURI "http://www.w3.org/2000/01/rdf-schema-more"},
   :xsd/anyURI   "http://www.w3.org/2000/01/rdf-schema#"}
  (:refer-clojure :exclude [comment range]))

(def T
  {:db/ident         :rdfs/Class,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of classes.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       "Class",
   :rdfs/subClassOf  :rdfs/Resource})

(def Container
  {:db/ident         :rdfs/Container,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of RDF containers.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       "Container",
   :rdfs/subClassOf  :rdfs/Resource})

(def ContainerMembershipProperty
  {:db/ident :rdfs/ContainerMembershipProperty,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The class of container membership properties, rdf:_1, rdf:_2, ...,\n                    all of which are sub-properties of 'member'.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label "ContainerMembershipProperty",
   :rdfs/subClassOf :rdf/Property})

(def Datatype
  {:db/ident         :rdfs/Datatype,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of RDF datatypes.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       "Datatype",
   :rdfs/subClassOf  :rdfs/Class})

(def Literal
  {:db/ident :rdfs/Literal,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The class of literal values, eg. textual strings and integers.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label "Literal",
   :rdfs/subClassOf :rdfs/Resource})

(def Resource
  {:db/ident         :rdfs/Resource,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class resource, everything.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       "Resource"})

(def comment
  {:db/ident         :rdfs/comment,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "A description of the subject resource.",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       "comment",
   :rdfs/range       :rdfs/Literal})

(def domain
  {:db/ident         :rdfs/domain,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "A domain of the subject property.",
   :rdfs/domain      :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       "domain",
   :rdfs/range       :rdfs/Class})

(def isDefinedBy
  {:db/ident           :rdfs/isDefinedBy,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The defininition of the subject resource.",
   :rdfs/domain        :rdfs/Resource,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label         "isDefinedBy",
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def label
  {:db/ident         :rdfs/label,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "A human-readable name for the subject.",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       "label",
   :rdfs/range       :rdfs/Literal})

(def member
  {:db/ident         :rdfs/member,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "A member of the subject resource.",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       "member",
   :rdfs/range       :rdfs/Resource})

(def range
  {:db/ident         :rdfs/range,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "A range of the subject property.",
   :rdfs/domain      :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       "range",
   :rdfs/range       :rdfs/Class})

(def seeAlso
  {:db/ident         :rdfs/seeAlso,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "Further information about the subject resource.",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       "seeAlso",
   :rdfs/range       :rdfs/Resource})

(def subClassOf
  {:db/ident         :rdfs/subClassOf,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "The subject is a subclass of a class.",
   :rdfs/domain      :rdfs/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       "subClassOf",
   :rdfs/range       :rdfs/Class})

(def subPropertyOf
  {:db/ident         :rdfs/subPropertyOf,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "The subject is a subproperty of a property.",
   :rdfs/domain      :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       "subPropertyOf",
   :rdfs/range       :rdf/Property})

(def urn:uuid:a0f79a94-ba29-5d80-b116-6f6bc02eeb2c112347
  {:dc11/title   "The RDF Schema vocabulary (RDFS)",
   :rdf/type     :owl/Ontology,
   :rdfs/seeAlso {:xsd/anyURI "http://www.w3.org/2000/01/rdf-schema-more"},
   :xsd/anyURI   "http://www.w3.org/2000/01/rdf-schema#"})