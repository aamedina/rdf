(ns net.wikipunk.rdf.sim
  "This is an ontology to express associations between entities whether artists, tracks, albums, compositional styles, sections of tracks, playing techniques or anything. It is designed with the hope of being easily extensible, extremely expressive, and still computationally reasonable."
  {:dc11/creator ["http://moustaki.org/foaf.rdf#moustaki"
                  "http://kurtisrandom.com/foaf.rdf#kurtjx"],
   :dc11/title "The Similarity Ontology",
   :dcat/downloadURL
   "https://lov.linkeddata.es/dataset/lov/vocabs/sim/versions/2010-03-10.n3",
   :owl/versionInfo "Revision: 0.2.02",
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "sim",
   :rdfa/uri "http://purl.org/ontology/similarity/",
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This is an ontology to express associations between entities whether artists, tracks, albums, compositional styles, sections of tracks, playing techniques or anything.  It is designed with the hope of being easily extensible, extremely expressive, and still computationally reasonable."},
   :vs/term_status "testing"}
  (:refer-clojure :exclude [range]))

(def Association
  "An abstract class to define some association between things. Entities share an association if they are somehow inter-connected. Generally a <b>directed association</b> should have at lease one <code>sim:subject</code> property and one <code>sim:object</code> property <b>or</b> an <b>undirected association</b> should have at least two <code>sim:element</code> properties, however this is not a requirement and intentionally left out of the model."
  {:db/ident :sim/Association,
   :owl/equivalentClass [{:owl/maxCardinality 1,
                          :owl/onProperty     :sim/method,
                          :rdf/type           :owl/Restriction}
                         {:owl/maxCardinality 1,
                          :owl/onProperty     :sim/method,
                          :rdf/type           :owl/Restriction}],
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An abstract class to define some association between things.  Entities share an association if they are somehow inter-connected.  Generally a <b>directed association</b> should have at lease one <code>sim:subject</code> property and one <code>sim:object</code> property <b>or</b> an <b>undirected association</b> should have at least two <code>sim:element</code> properties, however this is not a requirement and intentionally left out of the model."},
   :rdfs/isDefinedBy "http://purl.org/ontology/similarity/",
   :rdfs/label "Association",
   :rdfs/subClassOf :owl/Thing,
   :vs/term_status "testing"})

(def AssociationMethod
  "A concept for representing the method used to derive association or similarity statements."
  {:db/ident :sim/AssociationMethod,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A concept for representing the method used to derive association or similarity statements."},
   :rdfs/isDefinedBy "http://purl.org/ontology/similarity/",
   :rdfs/label "Association Method",
   :rdfs/subClassOf :owl/Thing,
   :vs/term_status "testing"})

(def Influence
  "An abstract class indicating a directed association of influence where the subject entity has influenced the object entity."
  {:db/ident :sim/Influence,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An abstract class indicating a directed association of influence where the subject entity has influenced the object entity."},
   :rdfs/isDefinedBy "http://purl.org/ontology/similarity/",
   :rdfs/label "Influence",
   :rdfs/subClassOf :sim/Association,
   :vs/term_status "testing"})

(def Network
  "A network is a grouping of <code>sim:Association</code>s. The associations that comprise a network are specified using a series of <code>sim:edge</code> predicates."
  {:db/ident :sim/Network,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A network is a grouping of <code>sim:Association</code>s.  The associations that comprise a network are specified using a series of <code>sim:edge</code> predicates."},
   :rdfs/isDefinedBy "http://purl.org/ontology/similarity/",
   :rdfs/label "Network",
   :rdfs/subClassOf :owl/Thing,
   :vs/term_status "testing"})

(def Similarity
  "An abstract class to define similarity between two or more things. Entities share a similarity if they share some common characteristics of interest. A similarity is a special type of association."
  {:db/ident :sim/Similarity,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An abstract class to define similarity between two or more things.  Entities share a similarity if they share some common characteristics of interest.  A similarity is a special type of association."},
   :rdfs/isDefinedBy "http://purl.org/ontology/similarity/",
   :rdfs/label "Similarity",
   :rdfs/subClassOf :sim/Association,
   :vs/term_status "testing"})

(def association
  "Binds a sim:Association to an arbitrary thing."
  {:db/ident         :sim/association,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Binds a sim:Association to an arbitrary thing."},
   :rdfs/domain      :owl/Thing,
   :rdfs/isDefinedBy "http://purl.org/ontology/similarity/",
   :rdfs/label       "association",
   :rdfs/range       :sim/Association,
   :vs/term_status   "testing"})

(def description
  "Specifies some description that discloses the process or set of processes used to derive association statements for the given <code>AssociationMethod</code>. This property is depricated in favor of the more appropriately named <code>sim:workflow</code> property."
  {:db/ident :sim/description,
   :owl/equivalentProperty :sim/workflow,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies some description that discloses the process or set of processes used to derive association statements for the given <code>AssociationMethod</code>.  This property is depricated in favor of the more appropriately named <code>sim:workflow</code> property."},
   :rdfs/domain :sim/AssociationMethod,
   :rdfs/isDefinedBy "http://purl.org/ontology/similarity/",
   :rdfs/label "description",
   :vs/term_status "depricated"})

(def distance
  "A weighting value for an Association where a value of 0 implies two elements are the same individual."
  {:db/ident :sim/distance,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A weighting value for an Association where a value of 0 implies two elements are the same individual."},
   :rdfs/domain :sim/Association,
   :rdfs/isDefinedBy "http://purl.org/ontology/similarity/",
   :rdfs/label "distance",
   :vs/term_status "testing"})

(def domain
  "Specifies appropriate object types for the <code>sim:subject</code> predicate for <code>sim:Association</code>s bound to the given <code>sim:AssociationMethod</code>. The presence of this predicate implies the given <code>sim:AssociationMethod</code> begets <i>directed</i> associations."
  {:db/ident :sim/domain,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Specifies appropriate object types for the <code>sim:subject</code> predicate for <code>sim:Association</code>s bound to the given <code>sim:AssociationMethod</code>.  The presence of this predicate implies the given <code>sim:AssociationMethod</code> begets <i>directed</i> associations.",
   :rdfs/domain :sim/AssociationMethod,
   :rdfs/isDefinedBy "http://purl.org/ontology/similarity/",
   :rdfs/label "domain",
   :rdfs/range :owl/Thing,
   :vs/term_status "testing"})

(def edge
  "Specifies an edge in a <code>sim:Network</code>"
  {:db/ident         :sim/edge,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Specifies an edge in a <code>sim:Network</code>"},
   :rdfs/domain      :sim/Network,
   :rdfs/isDefinedBy "http://purl.org/ontology/similarity/",
   :rdfs/label       "edge",
   :rdfs/range       :sim/Association,
   :vs/term_status   "testing"})

(def element
  "Specifies an entity involved in the given <code>sim:Association</code> and implies the given association is undirected."
  {:db/ident :sim/element,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies an entity involved in the given <code>sim:Association</code> and implies the given association is undirected."},
   :rdfs/domain :sim/Association,
   :rdfs/isDefinedBy "http://purl.org/ontology/similarity/",
   :rdfs/label "element",
   :vs/term_status "testing"})

(def grounding
  "Binds an <code>sim:Association</code> statement directly instantiated N3-Tr formulae or some other workflow graph which enabled the association derivation."
  {:db/ident :sim/grounding,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Binds an <code>sim:Association</code> statement directly instantiated N3-Tr formulae or some other workflow graph which enabled the association derivation."},
   :rdfs/domain :sim/Association,
   :rdfs/isDefinedBy "http://purl.org/ontology/similarity/",
   :rdfs/label "grounding",
   :vs/term_status "testing"})

(def method
  "Specifies the <code>sim:AssociationMethod</code> used to derive a particular Association statement. This should be used when the process for deriving association statements can be described further."
  {:db/ident :sim/method,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies the <code>sim:AssociationMethod</code> used to derive a particular Association statement.  This should be used when the process for deriving association statements can be described further."},
   :rdfs/domain :sim/Association,
   :rdfs/isDefinedBy "http://purl.org/ontology/similarity/",
   :rdfs/label "method",
   :rdfs/range :sim/AssociationMethod,
   :vs/term_status "testing"})

(def object
  "Specifies the object of a <code>sim:Association</code> implying a directed association where \"subject is associated to object\" but the reverse association does not necessarily exist, and if it does exist, it is not an equivalent association."
  {:db/ident :sim/object,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies the object of a <code>sim:Association</code> implying a directed association where \"subject is associated to object\" but the reverse association does not necessarily exist, and if it does exist, it is not an equivalent association."},
   :rdfs/domain :sim/Association,
   :rdfs/isDefinedBy "http://purl.org/ontology/similarity/",
   :rdfs/label "object",
   :rdfs/subPropertyOf :sim/element,
   :vs/term_status "testing"})

(def range
  "Specifies appropriate object types for the <code>sim:object</code> predicate for <code>sim:Association</code>s bound to the given <code>sim:AssociationMethod</code>. The presence of this predicate implies the given <code>sim:AssociationMethod</code> begets <i>directed</i> associations."
  {:db/ident :sim/range,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Specifies appropriate object types for the <code>sim:object</code> predicate for <code>sim:Association</code>s bound to the given <code>sim:AssociationMethod</code>.  The presence of this predicate implies the given <code>sim:AssociationMethod</code> begets <i>directed</i> associations.",
   :rdfs/domain :sim/AssociationMethod,
   :rdfs/isDefinedBy "http://purl.org/ontology/similarity/",
   :rdfs/label "domain",
   :rdfs/range :owl/Thing,
   :vs/term_status "testing"})

(def scope
  "Specifies appropriate object types for the <code>sim:element</code> predicate for <code>sim:Association</code>s bound to the given <code>sim:AssociationMethod</code>. The presence of this predicate implies the given <code>sim:AssociationMethod</code> begets <i>undirected</i> associations."
  {:db/ident :sim/scope,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Specifies appropriate object types for the <code>sim:element</code> predicate for <code>sim:Association</code>s bound to the given <code>sim:AssociationMethod</code>.  The presence of this predicate implies the given <code>sim:AssociationMethod</code> begets <i>undirected</i> associations.",
   :rdfs/domain :sim/AssociationMethod,
   :rdfs/isDefinedBy "http://purl.org/ontology/similarity/",
   :rdfs/label "domain",
   :rdfs/range :owl/Thing,
   :vs/term_status "testing"})

(def subject
  "Specifies the subject of an <code>sim:Association</code> implying a directed association where \"subject is associated to object\" but the reverse association does not necessarily exist, and if it does exist, it is not an equivalent association."
  {:db/ident :sim/subject,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies the subject of an <code>sim:Association</code> implying a directed association where \"subject is associated to object\" but the reverse association does not necessarily exist, and if it does exist, it is not an equivalent association."},
   :rdfs/domain :sim/Association,
   :rdfs/isDefinedBy "http://purl.org/ontology/similarity/",
   :rdfs/label "subject",
   :rdfs/subPropertyOf :sim/element,
   :vs/term_status "testing"})

(def weight
  "A weighting value bound to a <code>sim:Association</code> where a value of 0 implies two elements are not at all associated and a higher value implies a closer association."
  {:db/ident :sim/weight,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A weighting value bound to a <code>sim:Association</code> where a value of 0 implies two elements are not at all associated and a higher value implies a closer association."},
   :rdfs/domain :sim/Association,
   :rdfs/isDefinedBy "http://purl.org/ontology/similarity/",
   :rdfs/label "weight",
   :vs/term_status "testing"})

(def workflow
  "Specifies a workflow that discloses the process or set of processes used to derive association statements for the given <code>sim:AssociationMethod</code>"
  {:db/ident :sim/workflow,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies a workflow that discloses the process or set of processes used to derive association statements for the given <code>sim:AssociationMethod</code>"},
   :rdfs/domain :sim/AssociationMethod,
   :rdfs/isDefinedBy "http://purl.org/ontology/similarity/",
   :rdfs/label "workflow",
   :vs/term_status "testing"})

(def ^{:private true} Person
  {:db/ident         :foaf/Person,
   :rdf/type         [:rdfs/Class :owl/Class],
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/"})

(def ^{:private true} term_status
  {:db/ident         :vs/term_status,
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/isDefinedBy "http://www.w3.org/2003/06/sw-vocab-status/ns#"})