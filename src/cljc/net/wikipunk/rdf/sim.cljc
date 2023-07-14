(ns net.wikipunk.rdf.sim
  {:dcat/downloadURL
   "https://lov.linkeddata.es/dataset/lov/vocabs/sim/versions/2010-03-10.n3",
   :rdf/ns-prefix-map {"dc11" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "log" "http://www.w3.org/2000/10/swap/log#",
                       "mo" "http://purl.org/ontology/mo/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "owl2xml" "http://www.w3.org/2006/12/owl2-xml#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "sim" "http://purl.org/ontology/similarity/",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "wordnet" "http://xmlns.com/wordnet/1.6/",
                       "xml" "http://www.w3.org/XML/1998/namespace",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "sim",
   :rdfa/uri "http://purl.org/ontology/similarity/"}
  (:refer-clojure :exclude [range]))

(def Association
  "An abstract class to define some association between things.  Entities share an association if they are somehow inter-connected.  Generally a <b>directed association</b> should have at lease one <code>sim:subject</code> property and one <code>sim:object</code> property <b>or</b> an <b>undirected association</b> should have at least two <code>sim:element</code> properties, however this is not a requirement and intentionally left out of the model."
  {:db/ident :sim/Association,
   :owl/equivalentClass [{:owl/maxCardinality #xsd/integer 1,
                          :owl/onProperty     :sim/method,
                          :rdf/type           :owl/Restriction}
                         {:owl/maxCardinality #xsd/integer 1,
                          :owl/onProperty     :sim/method,
                          :rdf/type           :owl/Restriction}],
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/langString
    "An abstract class to define some association between things.  Entities share an association if they are somehow inter-connected.  Generally a <b>directed association</b> should have at lease one <code>sim:subject</code> property and one <code>sim:object</code> property <b>or</b> an <b>undirected association</b> should have at least two <code>sim:element</code> properties, however this is not a requirement and intentionally left out of the model.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/similarity/"},
   :rdfs/label #xsd/string "Association",
   :rdfs/subClassOf [:rdfs/Resource :owl/Thing],
   :vs/term_status #xsd/string "testing"})

(def AssociationMethod
  "A concept for representing the method used to derive association or similarity statements."
  {:db/ident :sim/AssociationMethod,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/langString
    "A concept for representing the method used to derive association or similarity statements.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/similarity/"},
   :rdfs/label #xsd/string "Association Method",
   :rdfs/subClassOf [:rdfs/Resource :owl/Thing],
   :vs/term_status #xsd/string "testing"})

(def Influence
  "An abstract class indicating a directed association of influence where the subject entity has influenced the object entity."
  {:db/ident :sim/Influence,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/langString
    "An abstract class indicating a directed association of influence where the subject entity has influenced the object entity.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/similarity/"},
   :rdfs/label #xsd/string "Influence",
   :rdfs/subClassOf [:sim/Association :owl/Thing :rdfs/Resource],
   :vs/term_status #xsd/string "testing"})

(def Network
  "A network is a grouping of <code>sim:Association</code>s.  The associations that comprise a network are specified using a series of <code>sim:edge</code> predicates."
  {:db/ident :sim/Network,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/langString
    "A network is a grouping of <code>sim:Association</code>s.  The associations that comprise a network are specified using a series of <code>sim:edge</code> predicates.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/similarity/"},
   :rdfs/label #xsd/string "Network",
   :rdfs/subClassOf [:rdfs/Resource :owl/Thing],
   :vs/term_status #xsd/string "testing"})

(def Similarity
  "An abstract class to define similarity between two or more things.  Entities share a similarity if they share some common characteristics of interest.  A similarity is a special type of association."
  {:db/ident :sim/Similarity,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/langString
    "An abstract class to define similarity between two or more things.  Entities share a similarity if they share some common characteristics of interest.  A similarity is a special type of association.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/similarity/"},
   :rdfs/label #xsd/string "Similarity",
   :rdfs/subClassOf [:sim/Association :owl/Thing :rdfs/Resource],
   :vs/term_status #xsd/string "testing"})

(def association
  "Binds a sim:Association to an arbitrary thing."
  {:db/ident         :sim/association,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #xsd/langString
                      "Binds a sim:Association to an arbitrary thing.@en",
   :rdfs/domain      :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/similarity/"},
   :rdfs/label       #xsd/string "association",
   :rdfs/range       :sim/Association,
   :vs/term_status   #xsd/string "testing"})

(def description
  "Specifies some description that discloses the process or set of processes used to derive association statements for the given <code>AssociationMethod</code>.  This property is depricated in favor of the more appropriately named <code>sim:workflow</code> property."
  {:db/ident :sim/description,
   :owl/equivalentProperty :sim/workflow,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Specifies some description that discloses the process or set of processes used to derive association statements for the given <code>AssociationMethod</code>.  This property is depricated in favor of the more appropriately named <code>sim:workflow</code> property.@en",
   :rdfs/domain :sim/AssociationMethod,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/similarity/"},
   :rdfs/label #xsd/string "description",
   :vs/term_status #xsd/string "depricated"})

(def distance
  "A weighting value for an Association where a value of 0 implies two elements are the same individual."
  {:db/ident :sim/distance,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "A weighting value for an Association where a value of 0 implies two elements are the same individual.@en",
   :rdfs/domain :sim/Association,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/similarity/"},
   :rdfs/label #xsd/string "distance",
   :vs/term_status #xsd/string "testing"})

(def domain
  "Specifies appropriate object types for the <code>sim:subject</code> predicate for <code>sim:Association</code>s bound to the given <code>sim:AssociationMethod</code>.  The presence of this predicate implies the given <code>sim:AssociationMethod</code> begets <i>directed</i> associations."
  {:db/ident :sim/domain,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Specifies appropriate object types for the <code>sim:subject</code> predicate for <code>sim:Association</code>s bound to the given <code>sim:AssociationMethod</code>.  The presence of this predicate implies the given <code>sim:AssociationMethod</code> begets <i>directed</i> associations.",
   :rdfs/domain :sim/AssociationMethod,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/similarity/"},
   :rdfs/label #xsd/string "domain",
   :rdfs/range :owl/Thing,
   :vs/term_status #xsd/string "testing"})

(def edge
  "Specifies an edge in a <code>sim:Network</code>"
  {:db/ident         :sim/edge,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #xsd/langString
                      "Specifies an edge in a <code>sim:Network</code>@en",
   :rdfs/domain      :sim/Network,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/similarity/"},
   :rdfs/label       #xsd/string "edge",
   :rdfs/range       :sim/Association,
   :vs/term_status   #xsd/string "testing"})

(def element
  "Specifies an entity involved in the given <code>sim:Association</code> and implies the given association is undirected."
  {:db/ident :sim/element,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Specifies an entity involved in the given <code>sim:Association</code> and implies the given association is undirected.@en",
   :rdfs/domain :sim/Association,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/similarity/"},
   :rdfs/label #xsd/string "element",
   :vs/term_status #xsd/string "testing"})

(def grounding
  "Binds an <code>sim:Association</code> statement directly instantiated N3-Tr formulae or some other workflow graph which enabled the association derivation."
  {:db/ident :sim/grounding,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Binds an <code>sim:Association</code> statement directly instantiated N3-Tr formulae or some other workflow graph which enabled the association derivation.@en",
   :rdfs/domain :sim/Association,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/similarity/"},
   :rdfs/label #xsd/string "grounding",
   :vs/term_status #xsd/string "testing"})

(def method
  "Specifies the <code>sim:AssociationMethod</code> used to derive a particular Association statement.  This should be used when the process for deriving association statements can be described further."
  {:db/ident :sim/method,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Specifies the <code>sim:AssociationMethod</code> used to derive a particular Association statement.  This should be used when the process for deriving association statements can be described further.@en",
   :rdfs/domain :sim/Association,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/similarity/"},
   :rdfs/label #xsd/string "method",
   :rdfs/range :sim/AssociationMethod,
   :vs/term_status #xsd/string "testing"})

(def object
  "Specifies the object of a <code>sim:Association</code> implying a directed association where \"subject is associated to object\" but the reverse association does not necessarily exist, and if it does exist, it is not an equivalent association."
  {:db/ident :sim/object,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Specifies the object of a <code>sim:Association</code> implying a directed association where \"subject is associated to object\" but the reverse association does not necessarily exist, and if it does exist, it is not an equivalent association.@en",
   :rdfs/domain :sim/Association,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/similarity/"},
   :rdfs/label #xsd/string "object",
   :rdfs/subPropertyOf :sim/element,
   :vs/term_status #xsd/string "testing"})

(def range
  "Specifies appropriate object types for the <code>sim:object</code> predicate for <code>sim:Association</code>s bound to the given <code>sim:AssociationMethod</code>.  The presence of this predicate implies the given <code>sim:AssociationMethod</code> begets <i>directed</i> associations."
  {:db/ident :sim/range,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Specifies appropriate object types for the <code>sim:object</code> predicate for <code>sim:Association</code>s bound to the given <code>sim:AssociationMethod</code>.  The presence of this predicate implies the given <code>sim:AssociationMethod</code> begets <i>directed</i> associations.",
   :rdfs/domain :sim/AssociationMethod,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/similarity/"},
   :rdfs/label #xsd/string "domain",
   :rdfs/range :owl/Thing,
   :vs/term_status #xsd/string "testing"})

(def scope
  "Specifies appropriate object types for the <code>sim:element</code> predicate for <code>sim:Association</code>s bound to the given <code>sim:AssociationMethod</code>.  The presence of this predicate implies the given <code>sim:AssociationMethod</code> begets <i>undirected</i> associations."
  {:db/ident :sim/scope,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Specifies appropriate object types for the <code>sim:element</code> predicate for <code>sim:Association</code>s bound to the given <code>sim:AssociationMethod</code>.  The presence of this predicate implies the given <code>sim:AssociationMethod</code> begets <i>undirected</i> associations.",
   :rdfs/domain :sim/AssociationMethod,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/similarity/"},
   :rdfs/label #xsd/string "domain",
   :rdfs/range :owl/Thing,
   :vs/term_status #xsd/string "testing"})

(def subject
  "Specifies the subject of an <code>sim:Association</code> implying a directed association where \"subject is associated to object\" but the reverse association does not necessarily exist, and if it does exist, it is not an equivalent association."
  {:db/ident :sim/subject,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Specifies the subject of an <code>sim:Association</code> implying a directed association where \"subject is associated to object\" but the reverse association does not necessarily exist, and if it does exist, it is not an equivalent association.@en",
   :rdfs/domain :sim/Association,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/similarity/"},
   :rdfs/label #xsd/string "subject",
   :rdfs/subPropertyOf :sim/element,
   :vs/term_status #xsd/string "testing"})

(def weight
  "A weighting value bound to a <code>sim:Association</code> where a value of 0 implies two elements are not at all associated and a higher value implies a closer association."
  {:db/ident :sim/weight,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "A weighting value bound to a <code>sim:Association</code> where a value of 0 implies two elements are not at all associated and a higher value implies a closer association.@en",
   :rdfs/domain :sim/Association,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/similarity/"},
   :rdfs/label #xsd/string "weight",
   :vs/term_status #xsd/string "testing"})

(def workflow
  "Specifies a workflow that discloses the process or set of processes used to derive association statements for the given <code>sim:AssociationMethod</code>"
  {:db/ident :sim/workflow,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Specifies a workflow that discloses the process or set of processes used to derive association statements for the given <code>sim:AssociationMethod</code>@en",
   :rdfs/domain :sim/AssociationMethod,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/similarity/"},
   :rdfs/label #xsd/string "workflow",
   :vs/term_status #xsd/string "testing"})