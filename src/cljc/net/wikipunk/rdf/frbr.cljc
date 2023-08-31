(ns net.wikipunk.rdf.frbr
  "\n      This vocabulary is a work in progress, it includes RDF classes for the group 1, 2 and 3 entities\n      described by the FRBR report and properties corresponding to the core relationships between\n      those entities. It does not yet describe attributes of the entities. Where possible, appropriate \n      relationships with other vocabularies are included in order to place this vocabulary in the \n      context of existing RDF work.\n    "
  {:dc11/contributor "Bruce D'Arcus",
   :dc11/creator #{"Ian Davis <http://purl.org/NET/iand>" "Richard Newman"},
   :dc11/date #inst "2005-08-10T00:00:00.000-00:00",
   :dc11/identifier "http://purl.org/vocab/frbr/frbr-core-20050810",
   :dc11/rights "Copyright © 2005 Richard Newman and Ian Davis",
   :dc11/title {:rdf/language "en",
                :rdf/value    "Expression of Core FRBR Concepts in RDF"},
   :dcat/downloadURL "resources/frbr-core-20050810.rdf",
   :dcterms/hasFormat
   #{{:rdfa/uri "http://purl.org/vocab/frbr/frbr-core-20050810.rdf"}
     {:rdfa/uri "http://purl.org/vocab/frbr/frbr-core-20050810.html"}},
   :dcterms/issued #inst "2005-07-15T00:00:00.000-00:00",
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
   #{{:rdf/language "en",
      :rdf/value
      "\n      This vocabulary is a work in progress, it includes RDF classes for the group 1, 2 and 3 entities\n      described by the FRBR report and properties corresponding to the core relationships between\n      those entities. It does not yet describe attributes of the entities. Where possible, appropriate \n      relationships with other vocabularies are included in order to place this vocabulary in the \n      context of existing RDF work.\n    "}
     {:rdf/language "en",
      :rdf/value
      "\n      This vocabulary is an expression in RDF of the concepts and relations described in the\n      IFLA report on the Functional Requirements for Bibliographic Records (FRBR). \n    "}},
   :vann/preferredNamespacePrefix "frbr",
   :vann/preferredNamespaceUri "http://purl.org/vocab/frbr/core#"}
  (:refer-clojure :exclude [complement]))

(def Concept
  "This class corresponds to the FRBR group three entity 'Concept'."
  {:db/ident :frbr/Concept,
   :owl/disjointWith #{:frbr/Place :frbr/Event :frbr/Object},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This class corresponds to the FRBR group three entity 'Concept'."},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "concept"},
   :rdfs/subClassOf #{:frbr/Subject :skos/Concept},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An abstract idea or notion."}})

(def CorporateBody
  "This class corresponds to the FRBR group two entity 'Corporate Body'."
  {:db/ident :frbr/CorporateBody,
   :owl/equivalentClass {:owl/unionOf [:foaf/Organization :foaf/Group],
                         :rdf/type    :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This class corresponds to the FRBR group two entity 'Corporate Body'."},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "corporate body"},
   :rdfs/subClassOf :frbr/ResponsibleEntity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An organization or group of individuals and/or other organizations."}})

(def Endeavour
  "This class represents any one of the FRBR group one entities."
  {:db/ident :frbr/Endeavour,
   :owl/disjointWith #{:frbr/ResponsibleEntity :frbr/Subject},
   :owl/equivalentClass
   {:owl/unionOf [:frbr/Expression :frbr/Item :frbr/Manifestation :frbr/Work],
    :rdf/type    :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "This class represents any one of the FRBR group one entities."},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "endeavour"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Any of the products of artistic or creative endeavour."}})

(def Event
  "This class corresponds to the FRBR group three entity 'Event'."
  {:db/ident :frbr/Event,
   :owl/disjointWith #{:frbr/Place :frbr/Concept :frbr/Object},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This class corresponds to the FRBR group three entity 'Event'."},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "event"},
   :rdfs/subClassOf #{{:rdfa/uri
                       "http://www.isi.edu/~pan/damltime/time-entry.owl#Event"}
                      :frbr/Subject},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An action or occurrence."}})

(def Expression
  "This class corresponds to the FRBR group one entity 'Expression'."
  {:db/ident :frbr/Expression,
   :owl/disjointWith #{:frbr/Item :frbr/Work :frbr/Manifestation},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This class corresponds to the FRBR group one entity 'Expression'."},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "expression"},
   :rdfs/subClassOf :frbr/Endeavour,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A realization of a single work usually in a physical form."}})

(def Item
  "This class corresponds to the FRBR group one entity 'Item'."
  {:db/ident :frbr/Item,
   :owl/disjointWith #{:frbr/Expression :frbr/Work :frbr/Manifestation},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "This class corresponds to the FRBR group one entity 'Item'."},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "item"},
   :rdfs/subClassOf :frbr/Endeavour,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An exemplar of a single manifestation."}})

(def Manifestation
  "This class corresponds to the FRBR group one entity 'Manifestation'."
  {:db/ident :frbr/Manifestation,
   :owl/disjointWith #{:frbr/Expression :frbr/Item :frbr/Work},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This class corresponds to the FRBR group one entity 'Manifestation'."},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "manifestation"},
   :rdfs/subClassOf :frbr/Endeavour,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The physical embodiment of one or more expressions."}})

(def ObjectClass
  "This class corresponds to the FRBR group three entity 'Object'."
  {:db/ident :frbr/Object,
   :owl/disjointWith #{:frbr/Place :frbr/Event :frbr/Concept},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This class corresponds to the FRBR group three entity 'Object'."},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "object"},
   :rdfs/subClassOf #{:frbr/Subject :geo/SpatialThing},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A tangible or material thing."}})

(def Person
  "This class corresponds to the FRBR group two entity 'Person'."
  {:db/ident :frbr/Person,
   :owl/disjointWith #{:frbr/Subject :frbr/Endeavour},
   :owl/equivalentClass :foaf/Person,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "This class corresponds to the FRBR group two entity 'Person'."},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "person"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A living or dead individual."}})

(def Place
  "This class corresponds to the FRBR group three entity 'Place'."
  {:db/ident :frbr/Place,
   :owl/disjointWith #{:frbr/Event :frbr/Concept :frbr/Object},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This class corresponds to the FRBR group three entity 'Place'."},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "place"},
   :rdfs/subClassOf #{:frbr/Subject :geo/SpatialThing},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A location."}})

(def ResponsibleEntity
  "This class represents any of the FRBR group two entities."
  {:db/ident :frbr/ResponsibleEntity,
   :owl/disjointWith #{:frbr/Subject :frbr/Endeavour},
   :owl/equivalentClass {:owl/unionOf [:frbr/CorporateBody :foaf/Person],
                         :rdf/type    :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "This class represents any of the FRBR group two entities."},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "responsible entity"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "One responsible for the creation, production, distribution or maintenance of artistic or creative content."}})

(def Subject
  "This class represents any of the FRBR group three entities."
  {:db/ident :frbr/Subject,
   :owl/disjointWith #{:frbr/ResponsibleEntity :frbr/Endeavour},
   :owl/equivalentClass
   {:owl/unionOf [:frbr/Event :frbr/Object :frbr/Place :frbr/Concept],
    :rdf/type    :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "This class represents any of the FRBR group three entities."},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subject"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Something that may serve as the subject of a work."}})

(def Work
  "This class corresponds to the FRBR group one entity 'Work'."
  {:db/ident :frbr/Work,
   :owl/disjointWith #{:frbr/Expression :frbr/Item :frbr/Manifestation},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "This class corresponds to the FRBR group one entity 'Work'."},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "work"},
   :rdfs/subClassOf #{:frbr/Endeavour
                      {:rdfa/uri "http://xmlns.com/wordnet/1.6/Work~2"}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "An abstract notion of an artistic or intellectual creation."}})

(def abridgement
  "abridgement"
  {:db/ident           :frbr/abridgement,
   :owl/inverseOf      :frbr/abridgementOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Expression,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "abridgement"},
   :rdfs/range         :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "An abridgment of an expression."}})

(def abridgementOf
  "abridgement of"
  {:db/ident           :frbr/abridgementOf,
   :owl/inverseOf      :frbr/abridgement,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Expression,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "abridgement of"},
   :rdfs/range         :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "An expression that is abridged."}})

(def adaption
  "adaption"
  {:db/ident           :frbr/adaption,
   :owl/inverseOf      :frbr/adaptionOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "adaption"},
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "An adaption of a work or expression."}})

(def adaptionOf
  "adaption of"
  {:db/ident           :frbr/adaptionOf,
   :owl/inverseOf      :frbr/adaption,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "adaption of"},
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "A work or expression that is adapted."}})

(def alternate
  "alternate"
  {:db/ident           :frbr/alternate,
   :owl/inverseOf      :frbr/alternateOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Manifestation,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "alternate"},
   :rdfs/range         :frbr/Manifestation,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "An alternative to a manifestation."}})

(def alternateOf
  "alternate of"
  {:db/ident           :frbr/alternateOf,
   :owl/inverseOf      :frbr/alternate,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Manifestation,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "alternate of"},
   :rdfs/range         :frbr/Manifestation,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "A manifestation that is alternated."}})

(def arrangement
  "arrangement"
  {:db/ident           :frbr/arrangement,
   :owl/inverseOf      :frbr/arrangementOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Expression,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "arrangement"},
   :rdfs/range         :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "An arrangement of an expression."}})

(def arrangementOf
  "arrangement of"
  {:db/ident           :frbr/arrangementOf,
   :owl/inverseOf      :frbr/arrangement,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Expression,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "arrangement of"},
   :rdfs/range         :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "An expression that is arranged."}})

(def complement
  "complement"
  {:db/ident           :frbr/complement,
   :owl/inverseOf      :frbr/complementOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "complement"},
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "A complement to a work or expression."}})

(def complementOf
  "complement of"
  {:db/ident           :frbr/complementOf,
   :owl/inverseOf      :frbr/complement,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "complement of"},
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value
                        "A work or expression that is complemented."}})

(def creator
  "creator"
  {:db/ident :frbr/creator,
   :owl/inverseOf :frbr/creatorOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Work,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "creator"},
   :rdfs/range :frbr/ResponsibleEntity,
   :rdfs/subPropertyOf :frbr/responsibleEntity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An entity in some way responsible for the creation of a work."}})

(def creatorOf
  "creator of"
  {:db/ident :frbr/creatorOf,
   :owl/inverseOf :frbr/creator,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/ResponsibleEntity,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "creator of"},
   :rdfs/range :frbr/Work,
   :rdfs/subPropertyOf :frbr/responsibleEntityOf,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A work that was in some way created by of an entity."}})

(def embodiment
  "embodiment"
  {:db/ident           :frbr/embodiment,
   :owl/inverseOf      :frbr/embodimentOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Expression,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "embodiment"},
   :rdfs/range         :frbr/Manifestation,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value
                        "A manifestation that embodies an expression."}})

(def embodimentOf
  "embodiment of"
  {:db/ident           :frbr/embodimentOf,
   :owl/inverseOf      :frbr/embodiment,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Manifestation,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "embodiment of"},
   :rdfs/range         :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value
                        "An expression that is embodied by a manifestation."}})

(def exemplar
  "exemplar"
  {:db/ident           :frbr/exemplar,
   :owl/inverseOf      :frbr/exemplarOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Manifestation,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "exemplar"},
   :rdfs/range         :frbr/Item,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value
                        "An item that is an exemplar of a manifestation."}})

(def exemplarOf
  "exemplar of"
  {:db/ident           :frbr/exemplarOf,
   :owl/inverseOf      :frbr/exemplar,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Item,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "exemplar of"},
   :rdfs/range         :frbr/Manifestation,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value
                        "The manifestation that is exemplified by a item."}})

(def imitation
  "imitation"
  {:db/ident           :frbr/imitation,
   :owl/inverseOf      :frbr/imitationOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "imitation"},
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "An imitation of a work or expression."}})

(def imitationOf
  "imitation of"
  {:db/ident           :frbr/imitationOf,
   :owl/inverseOf      :frbr/imitation,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "imitation of"},
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value "A work or expression that is imitated."}})

(def owner
  "owner"
  {:db/ident           :frbr/owner,
   :owl/inverseOf      :frbr/ownerOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Item,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "owner"},
   :rdfs/range         :frbr/ResponsibleEntity,
   :rdfs/subPropertyOf :frbr/responsibleEntity,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "An entity that owns an item."}})

(def ownerOf
  "owner of"
  {:db/ident           :frbr/ownerOf,
   :owl/inverseOf      :frbr/owner,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/ResponsibleEntity,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "owner of"},
   :rdfs/range         :frbr/Item,
   :rdfs/subPropertyOf :frbr/responsibleEntityOf,
   :skos/definition    {:rdf/language "en",
                        :rdf/value
                        "An item that is in some way owned an entity."}})

(def part
  "part"
  {:db/ident           :frbr/part,
   :owl/inverseOf      :frbr/partOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "part"},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "A part of an endeavour."}})

(def partOf
  "part of"
  {:db/ident           :frbr/partOf,
   :owl/inverseOf      :frbr/part,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "part of"},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value "An endeavour incorporating an endeavour."}})

(def producer
  "producer"
  {:db/ident :frbr/producer,
   :owl/inverseOf :frbr/producerOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Manifestation,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "producer"},
   :rdfs/range :frbr/ResponsibleEntity,
   :rdfs/subPropertyOf :frbr/responsibleEntity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An entity in some way responsible for producing a manifestation."}})

(def producerOf
  "producer of"
  {:db/ident :frbr/producerOf,
   :owl/inverseOf :frbr/producer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/ResponsibleEntity,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "producer of"},
   :rdfs/range :frbr/Manifestation,
   :rdfs/subPropertyOf :frbr/responsibleEntityOf,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "A manifestation that was in some way produced an entity."}})

(def realization
  "realization"
  {:db/ident :frbr/realization,
   :owl/inverseOf :frbr/realizationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Work,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "realization"},
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An expression that is an intellectual or artistic realization of a work."}})

(def realizationOf
  "realization of"
  {:db/ident           :frbr/realizationOf,
   :owl/inverseOf      :frbr/realization,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Expression,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "realization of"},
   :rdfs/range         :frbr/Work,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value
                        "The work that has been realized by an expression."}})

(def realizer
  "realizer"
  {:db/ident :frbr/realizer,
   :owl/inverseOf :frbr/realizerOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "realizer"},
   :rdfs/range :frbr/ResponsibleEntity,
   :rdfs/subPropertyOf :frbr/responsibleEntity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An entity in some way responsible for realizing an expression."}})

(def realizerOf
  "realizer of"
  {:db/ident :frbr/realizerOf,
   :owl/inverseOf :frbr/realizer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/ResponsibleEntity,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "realizer of"},
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/responsibleEntityOf,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "An expression that was in some way realized by an entity."}})

(def reconfiguration
  "reconfiguration"
  {:db/ident           :frbr/reconfiguration,
   :owl/inverseOf      :frbr/reconfigurationOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Item,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "reconfiguration"},
   :rdfs/range         :frbr/Item,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "A recongifuration of an item."}})

(def reconfigurationOf
  "reconfiguration of"
  {:db/ident           :frbr/reconfigurationOf,
   :owl/inverseOf      :frbr/reconfiguration,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Item,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "reconfiguration of"},
   :rdfs/range         :frbr/Item,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "An item that is reconfigured."}})

(def relatedEndeavour
  "related endeavour"
  {:db/ident :frbr/relatedEndeavour,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Endeavour,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "related endeavour"},
   :rdfs/range :frbr/Endeavour,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Another endeavour that is related in some way to an endeavour."}})

(def reproduction
  "reproduction"
  {:db/ident           :frbr/reproduction,
   :owl/inverseOf      :frbr/reproductionOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Manifestation :frbr/Item],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "reproduction"},
   :rdfs/range         {:owl/unionOf [:frbr/Manifestation :frbr/Item],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value
                        "A reproduction of a manifestation or item."}})

(def reproductionOf
  "reproduction of"
  {:db/ident           :frbr/reproductionOf,
   :owl/inverseOf      :frbr/reproduction,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Manifestation :frbr/Item],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "reproduction of"},
   :rdfs/range         {:owl/unionOf [:frbr/Manifestation :frbr/Item],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value
                        "A manifestation or item that is reproduced."}})

(def responsibleEntity
  "responsible entity"
  {:db/ident         :frbr/responsibleEntity,
   :owl/inverseOf    :frbr/responsibleEntityOf,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :frbr/Endeavour,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "responsible entity"},
   :rdfs/range       :frbr/ResponsibleEntity,
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "An entity in some way responsible for an endeavour."}})

(def responsibleEntityOf
  "responsible entity of"
  {:db/ident         :frbr/responsibleEntityOf,
   :owl/inverseOf    :frbr/responsibleEntity,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :frbr/ResponsibleEntity,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "responsible entity of"},
   :rdfs/range       :frbr/Endeavour,
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "An endeavour that is the responsibility of an entity."}})

(def revision
  "revision"
  {:db/ident           :frbr/revision,
   :owl/inverseOf      :frbr/revisionOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Expression,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "revision"},
   :rdfs/range         :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "A revision of an expression."}})

(def revisionOf
  "revision of"
  {:db/ident           :frbr/revisionOf,
   :owl/inverseOf      :frbr/revision,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Expression,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "revision of"},
   :rdfs/range         :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "An expression that is revised."}})

(def subject
  "subject"
  {:db/ident         :frbr/subject,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :frbr/Work,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "subject"},
   :rdfs/range       {:owl/unionOf [:frbr/Endeavour
                                    :frbr/ResponsibleEntity
                                    :frbr/Subject],
                      :rdf/type    :owl/Class},
   :skos/definition  {:rdf/language "en",
                      :rdf/value    "The subject of a work."}})

(def successor
  "successor"
  {:db/ident           :frbr/successor,
   :owl/inverseOf      :frbr/successorOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "successor"},
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "A successor to a work or expression."}})

(def successorOf
  "successor of"
  {:db/ident           :frbr/successorOf,
   :owl/inverseOf      :frbr/successor,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "successor of"},
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value "A work or expression that is succeeded."}})

(def summarization
  "summarization"
  {:db/ident           :frbr/summarization,
   :owl/inverseOf      :frbr/summarizationOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "summarization"},
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value "A summarization of a work or expression."}})

(def summarizationOf
  "summarization of"
  {:db/ident           :frbr/summarizationOf,
   :owl/inverseOf      :frbr/summarization,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "summarization of"},
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value "A work or expression that is summarized."}})

(def supplement
  "supplement"
  {:db/ident           :frbr/supplement,
   :owl/inverseOf      :frbr/supplementOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "supplement"},
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "A supplement to a work or expression."}})

(def supplementOf
  "supplement of"
  {:db/ident           :frbr/supplementOf,
   :owl/inverseOf      :frbr/supplement,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "supplement of"},
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value
                        "A work or expression that is supplemented."}})

(def transformation
  "transformation"
  {:db/ident           :frbr/transformation,
   :owl/inverseOf      :frbr/transformationOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "transformation"},
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value
                        "A transformation of a work or expression."}})

(def transformationOf
  "transformation of"
  {:db/ident           :frbr/transformationOf,
   :owl/inverseOf      :frbr/transformation,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "transformation of"},
   :rdfs/range         {:owl/unionOf [:frbr/Work :frbr/Expression],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value
                        "A work or expression that is transformed."}})

(def translation
  "translation"
  {:db/ident           :frbr/translation,
   :owl/inverseOf      :frbr/translationOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Expression,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "translation"},
   :rdfs/range         :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "A translation of an expression."}})

(def translationOf
  "translation of"
  {:db/ident           :frbr/translationOf,
   :owl/inverseOf      :frbr/translation,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Expression,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/frbr/core#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "translation of"},
   :rdfs/range         :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "An expression that is translated."}})