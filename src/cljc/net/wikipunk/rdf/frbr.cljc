(ns net.wikipunk.rdf.frbr
  "Expression of Core FRBR Concepts in RDF"
  {:dc11/contributor "Bruce D'Arcus",
   :dc11/creator ["Ian Davis <http://purl.org/NET/iand>" "Richard Newman"],
   :dc11/date #xsd/date #inst "2005-08-10T00:00:00.000-04:00",
   :dc11/identifier "http://purl.org/vocab/frbr/frbr-core-20050810",
   :dc11/rights "Copyright © 2005 Richard Newman and Ian Davis",
   :dc11/title #rdf/langString "Expression of Core FRBR Concepts in RDF@en",
   :dcat/downloadURL "resources/frbr-core-20050810.rdf",
   :dcterms/hasFormat
   [{:rdfa/uri "http://purl.org/vocab/frbr/frbr-core-20050810.html"}
    {:rdfa/uri "http://purl.org/vocab/frbr/frbr-core-20050810.rdf"}],
   :dcterms/issued #xsd/date #inst "2005-07-15T00:00:00.000-04:00",
   :dcterms/replaces {:rdfa/uri
                      "http://purl.org/vocab/frbr/frbr-core-20050809"},
   :rdf/ns-prefix-map {"cc"       "http://web.resource.org/cc/",
                       "dc11"     "http://purl.org/dc/elements/1.1/",
                       "dcmitype" "http://purl.org/dc/dcmitype/",
                       "dcterms"  "http://purl.org/dc/terms/",
                       "frbr"     "http://purl.org/vocab/frbr/core#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "skos"     "http://www.w3.org/2004/02/skos/core#",
                       "vann"     "http://purl.org/vocab/vann/",
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "frbr",
   :rdfa/uri "http://purl.org/vocab/frbr/core#",
   :rdfs/comment
   [#rdf/langString
     "\n      This vocabulary is an expression in RDF of the concepts and relations described in the\n      IFLA report on the Functional Requirements for Bibliographic Records (FRBR). \n    @en"
    #rdf/langString
     "\n      This vocabulary is a work in progress, it includes RDF classes for the group 1, 2 and 3 entities\n      described by the FRBR report and properties corresponding to the core relationships between\n      those entities. It does not yet describe attributes of the entities. Where possible, appropriate \n      relationships with other vocabularies are included in order to place this vocabulary in the \n      context of existing RDF work.\n    @en"],
   :vann/preferredNamespacePrefix "frbr",
   :vann/preferredNamespaceUri "http://purl.org/vocab/frbr/core#"}
  (:refer-clojure :exclude [complement]))

(def Concept
  "This class corresponds to the FRBR group three entity 'Concept'."
  {:db/ident :frbr/Concept,
   :owl/disjointWith [:frbr/Place :frbr/Object :frbr/Event],
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This class corresponds to the FRBR group three entity 'Concept'.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label #rdf/langString "concept@en",
   :rdfs/subClassOf [:frbr/Subject :skos/Concept],
   :skos/definition #rdf/langString "An abstract idea or notion.@en"})

(def CorporateBody
  "This class corresponds to the FRBR group two entity 'Corporate Body'."
  {:db/ident :frbr/CorporateBody,
   :owl/equivalentClass {:owl/unionOf [:foaf/Organization :foaf/Group],
                         :rdf/type    :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This class corresponds to the FRBR group two entity 'Corporate Body'.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label #rdf/langString "corporate body@en",
   :rdfs/subClassOf :frbr/ResponsibleEntity,
   :skos/definition
   #rdf/langString
    "An organization or group of individuals and/or other organizations.@en"})

(def Endeavour
  "This class represents any one of the FRBR group one entities."
  {:db/ident :frbr/Endeavour,
   :owl/disjointWith [:frbr/Subject :frbr/ResponsibleEntity],
   :owl/equivalentClass
   {:owl/unionOf [:frbr/Expression :frbr/Item :frbr/Manifestation :frbr/Work],
    :rdf/type    :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This class represents any one of the FRBR group one entities.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label #rdf/langString "endeavour@en",
   :skos/definition
   #rdf/langString "Any of the products of artistic or creative endeavour.@en"})

(def Event
  "This class corresponds to the FRBR group three entity 'Event'."
  {:db/ident :frbr/Event,
   :owl/disjointWith [:frbr/Concept :frbr/Object :frbr/Place],
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This class corresponds to the FRBR group three entity 'Event'.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label #rdf/langString "event@en",
   :rdfs/subClassOf [:frbr/Subject
                     {:rdfa/uri
                      "http://www.isi.edu/~pan/damltime/time-entry.owl#Event"}],
   :skos/definition #rdf/langString "An action or occurrence.@en"})

(def Expression
  "This class corresponds to the FRBR group one entity 'Expression'."
  {:db/ident :frbr/Expression,
   :owl/disjointWith [:frbr/Manifestation :frbr/Item :frbr/Work],
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This class corresponds to the FRBR group one entity 'Expression'.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label #rdf/langString "expression@en",
   :rdfs/subClassOf :frbr/Endeavour,
   :skos/definition
   #rdf/langString
    "A realization of a single work usually in a physical form.@en"})

(def Item
  "This class corresponds to the FRBR group one entity 'Item'."
  {:db/ident :frbr/Item,
   :owl/disjointWith [:frbr/Manifestation :frbr/Expression :frbr/Work],
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This class corresponds to the FRBR group one entity 'Item'.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label #rdf/langString "item@en",
   :rdfs/subClassOf :frbr/Endeavour,
   :skos/definition #rdf/langString
                     "An exemplar of a single manifestation.@en"})

(def Manifestation
  "This class corresponds to the FRBR group one entity 'Manifestation'."
  {:db/ident :frbr/Manifestation,
   :owl/disjointWith [:frbr/Item :frbr/Expression :frbr/Work],
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This class corresponds to the FRBR group one entity 'Manifestation'.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label #rdf/langString "manifestation@en",
   :rdfs/subClassOf :frbr/Endeavour,
   :skos/definition #rdf/langString
                     "The physical embodiment of one or more expressions.@en"})

(def ObjectClass
  "This class corresponds to the FRBR group three entity 'Object'."
  {:db/ident :frbr/Object,
   :owl/disjointWith [:frbr/Place :frbr/Event :frbr/Concept],
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This class corresponds to the FRBR group three entity 'Object'.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label #rdf/langString "object@en",
   :rdfs/subClassOf [:geo/SpatialThing :frbr/Subject],
   :skos/definition #rdf/langString "A tangible or material thing.@en"})

(def Person
  "This class corresponds to the FRBR group two entity 'Person'."
  {:db/ident :frbr/Person,
   :owl/disjointWith [:frbr/Subject :frbr/Endeavour],
   :owl/equivalentClass :foaf/Person,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This class corresponds to the FRBR group two entity 'Person'.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label #rdf/langString "person@en",
   :skos/definition #rdf/langString "A living or dead individual.@en"})

(def Place
  "This class corresponds to the FRBR group three entity 'Place'."
  {:db/ident :frbr/Place,
   :owl/disjointWith [:frbr/Concept :frbr/Object :frbr/Event],
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This class corresponds to the FRBR group three entity 'Place'.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label #rdf/langString "place@en",
   :rdfs/subClassOf [:geo/SpatialThing :frbr/Subject],
   :skos/definition #rdf/langString "A location.@en"})

(def ResponsibleEntity
  "This class represents any of the FRBR group two entities."
  {:db/ident :frbr/ResponsibleEntity,
   :owl/disjointWith [:frbr/Subject :frbr/Endeavour],
   :owl/equivalentClass {:owl/unionOf [:frbr/CorporateBody :foaf/Person],
                         :rdf/type    :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This class represents any of the FRBR group two entities.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label #rdf/langString "responsible entity@en",
   :skos/definition
   #rdf/langString
    "One responsible for the creation, production, distribution or maintenance of artistic or creative content.@en"})

(def Subject
  "This class represents any of the FRBR group three entities."
  {:db/ident :frbr/Subject,
   :owl/disjointWith [:frbr/Endeavour :frbr/ResponsibleEntity],
   :owl/equivalentClass
   {:owl/unionOf [:frbr/Event :frbr/Object :frbr/Place :frbr/Concept],
    :rdf/type    :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This class represents any of the FRBR group three entities.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label #rdf/langString "subject@en",
   :skos/definition #rdf/langString
                     "Something that may serve as the subject of a work.@en"})

(def Work
  "This class corresponds to the FRBR group one entity 'Work'."
  {:db/ident :frbr/Work,
   :owl/disjointWith [:frbr/Manifestation :frbr/Expression :frbr/Item],
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This class corresponds to the FRBR group one entity 'Work'.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label #rdf/langString "work@en",
   :rdfs/subClassOf [:frbr/Endeavour
                     {:rdfa/uri "http://xmlns.com/wordnet/1.6/Work~2"}],
   :skos/definition
   #rdf/langString
    "An abstract notion of an artistic or intellectual creation.@en"})

(def abridgement
  "abridgement"
  {:db/ident           :frbr/abridgement,
   :owl/inverseOf      :frbr/abridgementOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Expression,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "abridgement@en",
   :rdfs/range         :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString "An abridgment of an expression.@en"})

(def abridgementOf
  "abridgement of"
  {:db/ident           :frbr/abridgementOf,
   :owl/inverseOf      :frbr/abridgement,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Expression,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "abridgement of@en",
   :rdfs/range         :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString "An expression that is abridged.@en"})

(def adaption
  "adaption"
  {:db/ident           :frbr/adaption,
   :owl/inverseOf      :frbr/adaptionOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "adaption@en",
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString
                        "An adaption of a work or expression.@en"})

(def adaptionOf
  "adaption of"
  {:db/ident           :frbr/adaptionOf,
   :owl/inverseOf      :frbr/adaption,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "adaption of@en",
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString
                        "A work or expression that is adapted.@en"})

(def alternate
  "alternate"
  {:db/ident           :frbr/alternate,
   :owl/inverseOf      :frbr/alternateOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Manifestation,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "alternate@en",
   :rdfs/range         :frbr/Manifestation,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString "An alternative to a manifestation.@en"})

(def alternateOf
  "alternate of"
  {:db/ident           :frbr/alternateOf,
   :owl/inverseOf      :frbr/alternate,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Manifestation,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "alternate of@en",
   :rdfs/range         :frbr/Manifestation,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString
                        "A manifestation that is alternated.@en"})

(def arrangement
  "arrangement"
  {:db/ident           :frbr/arrangement,
   :owl/inverseOf      :frbr/arrangementOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Expression,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "arrangement@en",
   :rdfs/range         :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString "An arrangement of an expression.@en"})

(def arrangementOf
  "arrangement of"
  {:db/ident           :frbr/arrangementOf,
   :owl/inverseOf      :frbr/arrangement,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Expression,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "arrangement of@en",
   :rdfs/range         :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString "An expression that is arranged.@en"})

(def complement
  "complement"
  {:db/ident           :frbr/complement,
   :owl/inverseOf      :frbr/complementOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "complement@en",
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString
                        "A complement to a work or expression.@en"})

(def complementOf
  "complement of"
  {:db/ident           :frbr/complementOf,
   :owl/inverseOf      :frbr/complement,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "complement of@en",
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString
                        "A work or expression that is complemented.@en"})

(def creator
  "creator"
  {:db/ident :frbr/creator,
   :owl/inverseOf :frbr/creatorOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Work,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label #rdf/langString "creator@en",
   :rdfs/range :frbr/ResponsibleEntity,
   :rdfs/subPropertyOf :frbr/responsibleEntity,
   :skos/definition
   #rdf/langString
    "An entity in some way responsible for the creation of a work.@en"})

(def creatorOf
  "creator of"
  {:db/ident :frbr/creatorOf,
   :owl/inverseOf :frbr/creator,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/ResponsibleEntity,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label #rdf/langString "creator of@en",
   :rdfs/range :frbr/Work,
   :rdfs/subPropertyOf :frbr/responsibleEntityOf,
   :skos/definition #rdf/langString
                     "A work that was in some way created by of an entity.@en"})

(def embodiment
  "embodiment"
  {:db/ident           :frbr/embodiment,
   :owl/inverseOf      :frbr/embodimentOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Expression,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "embodiment@en",
   :rdfs/range         :frbr/Manifestation,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString
                        "A manifestation that embodies an expression.@en"})

(def embodimentOf
  "embodiment of"
  {:db/ident :frbr/embodimentOf,
   :owl/inverseOf :frbr/embodiment,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Manifestation,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label #rdf/langString "embodiment of@en",
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition #rdf/langString
                     "An expression that is embodied by a manifestation.@en"})

(def exemplar
  "exemplar"
  {:db/ident           :frbr/exemplar,
   :owl/inverseOf      :frbr/exemplarOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Manifestation,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "exemplar@en",
   :rdfs/range         :frbr/Item,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString
                        "An item that is an exemplar of a manifestation.@en"})

(def exemplarOf
  "exemplar of"
  {:db/ident           :frbr/exemplarOf,
   :owl/inverseOf      :frbr/exemplar,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Item,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "exemplar of@en",
   :rdfs/range         :frbr/Manifestation,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString
                        "The manifestation that is exemplified by a item.@en"})

(def imitation
  "imitation"
  {:db/ident           :frbr/imitation,
   :owl/inverseOf      :frbr/imitationOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "imitation@en",
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString
                        "An imitation of a work or expression.@en"})

(def imitationOf
  "imitation of"
  {:db/ident           :frbr/imitationOf,
   :owl/inverseOf      :frbr/imitation,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "imitation of@en",
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString
                        "A work or expression that is imitated.@en"})

(def owner
  "owner"
  {:db/ident           :frbr/owner,
   :owl/inverseOf      :frbr/ownerOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Item,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "owner@en",
   :rdfs/range         :frbr/ResponsibleEntity,
   :rdfs/subPropertyOf :frbr/responsibleEntity,
   :skos/definition    #rdf/langString "An entity that owns an item.@en"})

(def ownerOf
  "owner of"
  {:db/ident           :frbr/ownerOf,
   :owl/inverseOf      :frbr/owner,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/ResponsibleEntity,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "owner of@en",
   :rdfs/range         :frbr/Item,
   :rdfs/subPropertyOf :frbr/responsibleEntityOf,
   :skos/definition    #rdf/langString
                        "An item that is in some way owned an entity.@en"})

(def part
  "part"
  {:db/ident           :frbr/part,
   :owl/inverseOf      :frbr/partOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "part@en",
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString "A part of an endeavour.@en"})

(def partOf
  "part of"
  {:db/ident           :frbr/partOf,
   :owl/inverseOf      :frbr/part,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "part of@en",
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString
                        "An endeavour incorporating an endeavour.@en"})

(def producer
  "producer"
  {:db/ident :frbr/producer,
   :owl/inverseOf :frbr/producerOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Manifestation,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label #rdf/langString "producer@en",
   :rdfs/range :frbr/ResponsibleEntity,
   :rdfs/subPropertyOf :frbr/responsibleEntity,
   :skos/definition
   #rdf/langString
    "An entity in some way responsible for producing a manifestation.@en"})

(def producerOf
  "producer of"
  {:db/ident :frbr/producerOf,
   :owl/inverseOf :frbr/producer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/ResponsibleEntity,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label #rdf/langString "producer of@en",
   :rdfs/range :frbr/Manifestation,
   :rdfs/subPropertyOf :frbr/responsibleEntityOf,
   :skos/definition
   #rdf/langString
    "A manifestation that was in some way produced an entity.@en"})

(def realization
  "realization"
  {:db/ident :frbr/realization,
   :owl/inverseOf :frbr/realizationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Work,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label #rdf/langString "realization@en",
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition
   #rdf/langString
    "An expression that is an intellectual or artistic realization of a work.@en"})

(def realizationOf
  "realization of"
  {:db/ident           :frbr/realizationOf,
   :owl/inverseOf      :frbr/realization,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Expression,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "realization of@en",
   :rdfs/range         :frbr/Work,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString
                        "The work that has been realized by an expression.@en"})

(def realizer
  "realizer"
  {:db/ident :frbr/realizer,
   :owl/inverseOf :frbr/realizerOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label #rdf/langString "realizer@en",
   :rdfs/range :frbr/ResponsibleEntity,
   :rdfs/subPropertyOf :frbr/responsibleEntity,
   :skos/definition
   #rdf/langString
    "An entity in some way responsible for realizing an expression.@en"})

(def realizerOf
  "realizer of"
  {:db/ident :frbr/realizerOf,
   :owl/inverseOf :frbr/realizer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/ResponsibleEntity,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label #rdf/langString "realizer of@en",
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/responsibleEntityOf,
   :skos/definition
   #rdf/langString
    "An expression that was in some way realized by an entity.@en"})

(def reconfiguration
  "reconfiguration"
  {:db/ident           :frbr/reconfiguration,
   :owl/inverseOf      :frbr/reconfigurationOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Item,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "reconfiguration@en",
   :rdfs/range         :frbr/Item,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString "A recongifuration of an item.@en"})

(def reconfigurationOf
  "reconfiguration of"
  {:db/ident           :frbr/reconfigurationOf,
   :owl/inverseOf      :frbr/reconfiguration,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Item,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "reconfiguration of@en",
   :rdfs/range         :frbr/Item,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString "An item that is reconfigured.@en"})

(def relatedEndeavour
  "related endeavour"
  {:db/ident :frbr/relatedEndeavour,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Endeavour,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label #rdf/langString "related endeavour@en",
   :rdfs/range :frbr/Endeavour,
   :skos/definition
   #rdf/langString
    "Another endeavour that is related in some way to an endeavour.@en"})

(def reproduction
  "reproduction"
  {:db/ident           :frbr/reproduction,
   :owl/inverseOf      :frbr/reproductionOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Manifestation :frbr/Item],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "reproduction@en",
   :rdfs/range         {:owl/unionOf [:frbr/Manifestation :frbr/Item],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString
                        "A reproduction of a manifestation or item.@en"})

(def reproductionOf
  "reproduction of"
  {:db/ident           :frbr/reproductionOf,
   :owl/inverseOf      :frbr/reproduction,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Manifestation :frbr/Item],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "reproduction of@en",
   :rdfs/range         {:owl/unionOf [:frbr/Manifestation :frbr/Item],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString
                        "A manifestation or item that is reproduced.@en"})

(def responsibleEntity
  "responsible entity"
  {:db/ident         :frbr/responsibleEntity,
   :owl/inverseOf    :frbr/responsibleEntityOf,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :frbr/Endeavour,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label       #rdf/langString "responsible entity@en",
   :rdfs/range       :frbr/ResponsibleEntity,
   :skos/definition  #rdf/langString
                      "An entity in some way responsible for an endeavour.@en"})

(def responsibleEntityOf
  "responsible entity of"
  {:db/ident :frbr/responsibleEntityOf,
   :owl/inverseOf :frbr/responsibleEntity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/ResponsibleEntity,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label #rdf/langString "responsible entity of@en",
   :rdfs/range :frbr/Endeavour,
   :skos/definition
   #rdf/langString "An endeavour that is the responsibility of an entity.@en"})

(def revision
  "revision"
  {:db/ident           :frbr/revision,
   :owl/inverseOf      :frbr/revisionOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Expression,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "revision@en",
   :rdfs/range         :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString "A revision of an expression.@en"})

(def revisionOf
  "revision of"
  {:db/ident           :frbr/revisionOf,
   :owl/inverseOf      :frbr/revision,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Expression,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "revision of@en",
   :rdfs/range         :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString "An expression that is revised.@en"})

(def subject
  "subject"
  {:db/ident         :frbr/subject,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :frbr/Work,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label       #rdf/langString "subject@en",
   :rdfs/range       {:owl/unionOf [:frbr/Endeavour
                                    :frbr/ResponsibleEntity
                                    :frbr/Subject],
                      :rdf/type    :owl/Class},
   :skos/definition  #rdf/langString "The subject of a work.@en"})

(def successor
  "successor"
  {:db/ident           :frbr/successor,
   :owl/inverseOf      :frbr/successorOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "successor@en",
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString
                        "A successor to a work or expression.@en"})

(def successorOf
  "successor of"
  {:db/ident           :frbr/successorOf,
   :owl/inverseOf      :frbr/successor,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "successor of@en",
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString
                        "A work or expression that is succeeded.@en"})

(def summarization
  "summarization"
  {:db/ident           :frbr/summarization,
   :owl/inverseOf      :frbr/summarizationOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "summarization@en",
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString
                        "A summarization of a work or expression.@en"})

(def summarizationOf
  "summarization of"
  {:db/ident           :frbr/summarizationOf,
   :owl/inverseOf      :frbr/summarization,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "summarization of@en",
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString
                        "A work or expression that is summarized.@en"})

(def supplement
  "supplement"
  {:db/ident           :frbr/supplement,
   :owl/inverseOf      :frbr/supplementOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "supplement@en",
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString
                        "A supplement to a work or expression.@en"})

(def supplementOf
  "supplement of"
  {:db/ident           :frbr/supplementOf,
   :owl/inverseOf      :frbr/supplement,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "supplement of@en",
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString
                        "A work or expression that is supplemented.@en"})

(def transformation
  "transformation"
  {:db/ident           :frbr/transformation,
   :owl/inverseOf      :frbr/transformationOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "transformation@en",
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString
                        "A transformation of a work or expression.@en"})

(def transformationOf
  "transformation of"
  {:db/ident           :frbr/transformationOf,
   :owl/inverseOf      :frbr/transformation,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "transformation of@en",
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString
                        "A work or expression that is transformed.@en"})

(def translation
  "translation"
  {:db/ident           :frbr/translation,
   :owl/inverseOf      :frbr/translationOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Expression,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "translation@en",
   :rdfs/range         :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString "A translation of an expression.@en"})

(def translationOf
  "translation of"
  {:db/ident           :frbr/translationOf,
   :owl/inverseOf      :frbr/translation,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Expression,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         #rdf/langString "translation of@en",
   :rdfs/range         :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    #rdf/langString "An expression that is translated.@en"})
