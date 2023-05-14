(ns net.wikipunk.rdf.frbr
  "This vocabulary is an expression in RDF of the concepts and relations described in the IFLA report on the Functional Requirements for Bibliographic Records (FRBR)."
  {:cc/license "http://creativecommons.org/licenses/by/2.0/uk/",
   :dc11/contributor "Bruce D'Arcus",
   :dc11/creator ["Richard Newman" "Ian Davis <http://purl.org/NET/iand>"],
   :dc11/date "2005-08-10",
   :dc11/identifier "http://purl.org/vocab/frbr/frbr-core-20050810",
   :dc11/rights "Copyright © 2005 Richard Newman and Ian Davis",
   :dc11/title #voc/lstr "Expression of Core FRBR Concepts in RDF@en",
   :dcat/downloadURL "https://vocab.org/frbr/frbr-core-20050810.rdf",
   :dcterms/hasFormat ["http://purl.org/vocab/frbr/frbr-core-20050810.rdf"
                       "http://purl.org/vocab/frbr/frbr-core-20050810.html"],
   :dcterms/isVersionOf "http://purl.org/vocab/frbr/core#",
   :dcterms/issued "2005-07-15",
   :dcterms/replaces "http://purl.org/vocab/frbr/frbr-core-20050809",
   :rdf/ns-prefix-map {"cc"       "http://web.resource.org/cc/",
                       "dc11"     "http://purl.org/dc/elements/1.1/",
                       "dcmitype" "http://purl.org/dc/dcmitype/",
                       "dcterms"  "http://purl.org/dc/terms/",
                       "frbr"     "http://purl.org/vocab/frbr/core#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "skos"     "http://www.w3.org/2004/02/skos/core#",
                       "vann"     "http://purl.org/vocab/vann/"},
   :rdf/type [:owl/Ontology :cc/Work],
   :rdfa/prefix "frbr",
   :rdfa/uri "https://vocab.org/frbr/frbr-core-20050810.rdf",
   :rdfs/comment
   [#voc/lstr
     "\n      This vocabulary is an expression in RDF of the concepts and relations described in the\n      IFLA report on the Functional Requirements for Bibliographic Records (FRBR). \n    @en"
    #voc/lstr
     "\n      This vocabulary is a work in progress, it includes RDF classes for the group 1, 2 and 3 entities\n      described by the FRBR report and properties corresponding to the core relationships between\n      those entities. It does not yet describe attributes of the entities. Where possible, appropriate \n      relationships with other vocabularies are included in order to place this vocabulary in the \n      context of existing RDF work.\n    @en"],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-10",
     :rdf/value
     "Added experimental paraphrases to property and class descriptions"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-10",
     :rdf/value    "Fixed type in film example and added creator and date"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-10",
     :rdf/value    "Sorted properties and classes alphabetically by URI"}],
   :skos/example "https://vocab.org/frbr/frbr-example-film-20050809.html",
   :skos/historyNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-10",
     :rdf/value
     "Added alternate, alternateOf, reconfiguration, reconfigurationOf properties"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-10",
     :rdf/value    "Item is now not a subclass of geo:SpatialThing"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-10",
     :rdf/value    "Made domains and ranges of many properties more specific"}],
   :vann/preferredNamespacePrefix "frbr",
   :vann/preferredNamespaceUri "http://purl.org/vocab/frbr/core#"}
  (:refer-clojure :exclude [complement]))

(def Concept
  "An abstract idea or notion."
  {:db/ident :frbr/Concept,
   :dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Place :frbr/Object :frbr/Event],
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "This class corresponds to the FRBR group three entity 'Concept'.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "concept@en",
   :rdfs/subClassOf [:frbr/Subject :skos/Concept :frbr/Concept],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Extracted definition from existing comment"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-08",
     :rdf/value    "Added comment"}],
   :skos/definition #voc/lstr "An abstract idea or notion.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date    "2005-08-08",
                      :rdf/value    "Made subclass of skos:Concept"}})

(def CorporateBody
  "An organization or group of individuals and/or other organizations."
  {:db/ident :frbr/CorporateBody,
   :dcterms/issued "2005-07-15",
   :owl/equivalentClass {:owl/unionOf [:foaf/Organization :foaf/Group],
                         :rdf/type    :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "This class corresponds to the FRBR group two entity 'Corporate Body'.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "corporate body@en",
   :rdfs/subClassOf [:frbr/ResponsibleEntity :frbr/CorporateBody],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-08",
     :rdf/value    "Added comment"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Extracted definition from existing comment"}],
   :skos/definition
   #voc/lstr
    "An organization or group of individuals and/or other organizations.@en"})

(def Endeavour
  "Any of the products of artistic or creative endeavour."
  {:db/ident :frbr/Endeavour,
   :dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/ResponsibleEntity :frbr/Subject],
   :owl/equivalentClass
   {:owl/unionOf [:frbr/Expression :frbr/Item :frbr/Manifestation :frbr/Work],
    :rdf/type    :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr "This class represents any one of the FRBR group one entities.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "endeavour@en",
   :rdfs/subClassOf :frbr/Endeavour,
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Extracted definition from existing comment"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-08",
     :rdf/value    "Added comment"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition
   #voc/lstr "Any of the products of artistic or creative endeavour.@en"})

(def Event
  "An action or occurrence."
  {:db/ident :frbr/Event,
   :dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Concept :frbr/Object :frbr/Place],
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "This class corresponds to the FRBR group three entity 'Event'.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "event@en",
   :rdfs/subClassOf [:frbr/Subject
                     "http://www.isi.edu/~pan/damltime/time-entry.owl#Event"
                     :frbr/Event],
   :skos/changeNote [{:dc11/creator "Ian Davis",
                      :dc11/date "2005-08-09",
                      :rdf/value "Extracted definition from existing comment"}
                     {:dc11/creator "Ian Davis",
                      :dc11/date    "2005-08-08",
                      :rdf/value    "Added comment"}],
   :skos/definition #voc/lstr "An action or occurrence.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date    "2005-08-08",
                      :rdf/value    "Made subclass of owltime:Event"}})

(def Expression
  "A realization of a single work usually in a physical form."
  {:db/ident :frbr/Expression,
   :dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Manifestation :frbr/Work :frbr/Item],
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "This class corresponds to the FRBR group one entity 'Expression'.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "expression@en",
   :rdfs/subClassOf [:frbr/Endeavour :frbr/Expression],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Extracted definition from existing comment"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-08",
     :rdf/value    "Added comment"}],
   :skos/definition
   #voc/lstr "A realization of a single work usually in a physical form.@en"})

(def Item
  "An exemplar of a single manifestation."
  {:db/ident :frbr/Item,
   :dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Manifestation :frbr/Work :frbr/Expression],
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr "This class corresponds to the FRBR group one entity 'Item'.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "item@en",
   :rdfs/subClassOf [:frbr/Endeavour :frbr/Item],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-08",
     :rdf/value    "Added comment"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Extracted definition from existing comment"}],
   :skos/definition #voc/lstr "An exemplar of a single manifestation.@en",
   :skos/historyNote [{:dc11/creator "Ian Davis",
                       :dc11/date    "2005-08-08",
                       :rdf/value    "Made subclass of geo:SpatialThing"}
                      {:dc11/creator "Ian Davis",
                       :dc11/date    "2005-08-10",
                       :rdf/value    "Removed subclass of geo:SpatialThing"}]})

(def Manifestation
  "The physical embodiment of one or more expressions."
  {:db/ident :frbr/Manifestation,
   :dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Work :frbr/Expression :frbr/Item],
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "This class corresponds to the FRBR group one entity 'Manifestation'.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "manifestation@en",
   :rdfs/subClassOf [:frbr/Endeavour :frbr/Manifestation],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-08",
     :rdf/value    "Added comment"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Extracted definition from existing comment"}],
   :skos/definition #voc/lstr
                     "The physical embodiment of one or more expressions.@en"})

(def ObjectClass
  "A tangible or material thing."
  {:db/ident :frbr/Object,
   :dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Place :frbr/Event :frbr/Concept],
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "This class corresponds to the FRBR group three entity 'Object'.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "object@en",
   :rdfs/subClassOf [:geo/SpatialThing :frbr/Subject :frbr/Object],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-08",
     :rdf/value    "Added comment"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Extracted definition from existing comment"}],
   :skos/definition #voc/lstr "A tangible or material thing.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date    "2005-08-08",
                      :rdf/value    "Made subclass of geo:SpatialThing"}})

(def Person
  "A living or dead individual."
  {:db/ident :frbr/Person,
   :dcterms/issued "2005-08-08",
   :owl/disjointWith [:frbr/Subject :frbr/Endeavour],
   :owl/equivalentClass :foaf/Person,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr "This class corresponds to the FRBR group two entity 'Person'.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "person@en",
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Extracted definition from existing comment"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-08",
     :rdf/value    "Added comment"}],
   :skos/definition #voc/lstr "A living or dead individual.@en"})

(def Place
  "A location."
  {:db/ident :frbr/Place,
   :dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Concept :frbr/Object :frbr/Event],
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "This class corresponds to the FRBR group three entity 'Place'.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "place@en",
   :rdfs/subClassOf [:geo/SpatialThing :frbr/Subject :frbr/Place],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-08",
     :rdf/value    "Added comment"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Extracted definition from existing comment"}],
   :skos/definition #voc/lstr "A location.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date    "2005-08-08",
                      :rdf/value    "Made subclass of geo:SpatialThing"}})

(def ResponsibleEntity
  "One responsible for the creation, production, distribution or maintenance of artistic or creative content."
  {:db/ident :frbr/ResponsibleEntity,
   :dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Endeavour :frbr/Subject],
   :owl/equivalentClass {:owl/unionOf [:frbr/CorporateBody :foaf/Person],
                         :rdf/type    :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr "This class represents any of the FRBR group two entities.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "responsible entity@en",
   :rdfs/subClassOf :frbr/ResponsibleEntity,
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Extracted definition from existing comment"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-08",
     :rdf/value    "Added comment"}],
   :skos/definition
   #voc/lstr
    "One responsible for the creation, production, distribution or maintenance of artistic or creative content.@en"})

(def Subject
  "Something that may serve as the subject of a work."
  {:db/ident :frbr/Subject,
   :dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Endeavour :frbr/ResponsibleEntity],
   :owl/equivalentClass
   {:owl/unionOf [:frbr/Event :frbr/Object :frbr/Place :frbr/Concept],
    :rdf/type    :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr "This class represents any of the FRBR group three entities.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "subject@en",
   :rdfs/subClassOf :frbr/Subject,
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-08",
     :rdf/value    "Added comment"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Extracted definition from existing comment"}],
   :skos/definition #voc/lstr
                     "Something that may serve as the subject of a work.@en"})

(def Work
  "An abstract notion of an artistic or intellectual creation."
  {:db/ident :frbr/Work,
   :dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Manifestation :frbr/Expression :frbr/Item],
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr "This class corresponds to the FRBR group one entity 'Work'.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "work@en",
   :rdfs/subClassOf
   [:frbr/Endeavour "http://xmlns.com/wordnet/1.6/Work~2" :frbr/Work],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-08",
     :rdf/value    "Added comment"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Extracted definition from existing comment"}],
   :skos/definition
   #voc/lstr "An abstract notion of an artistic or intellectual creation.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date    "2005-08-08",
                      :rdf/value    "Made subclass of wordnet:Work~2"}})

(def abridgement
  "An abridgment of an expression."
  {:db/ident :frbr/abridgement,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/abridgementOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "abridgement@en",
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/abridgement],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition #voc/lstr "An abridgment of an expression.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date    "2005-08-10",
                      :rdf/value    "Added domain and range of Expression"}})

(def abridgementOf
  "An expression that is abridged."
  {:db/ident :frbr/abridgementOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/abridgement,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "abridgement of@en",
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/abridgementOf],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}],
   :skos/definition #voc/lstr "An expression that is abridged.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date    "2005-08-10",
                      :rdf/value    "Added domain and range of Expression"}})

(def adaption
  "An adaption of a work or expression."
  {:db/ident :frbr/adaption,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/adaptionOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "adaption@en",
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/adaption],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition #voc/lstr "An adaption of a work or expression.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date "2005-08-10",
                      :rdf/value
                      "Added domain and range of Work or Expression"}})

(def adaptionOf
  "A work or expression that is adapted."
  {:db/ident :frbr/adaptionOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/adaption,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "adaption of@en",
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/adaptionOf],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition #voc/lstr "A work or expression that is adapted.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date "2005-08-10",
                      :rdf/value
                      "Added domain and range of Work or Expression"}})

(def alternate
  "An alternative to a manifestation."
  {:db/ident           :frbr/alternate,
   :dcterms/issued     "2005-08-10",
   :owl/inverseOf      :frbr/alternateOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Manifestation,
   :rdfs/isDefinedBy   "http://purl.org/vocab/frbr/core#",
   :rdfs/label         #voc/lstr "alternate@en",
   :rdfs/range         :frbr/Manifestation,
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/alternate],
   :skos/definition    #voc/lstr "An alternative to a manifestation.@en"})

(def alternateOf
  "A manifestation that is alternated."
  {:db/ident           :frbr/alternateOf,
   :dcterms/issued     "2005-08-10",
   :owl/inverseOf      :frbr/alternate,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Manifestation,
   :rdfs/isDefinedBy   "http://purl.org/vocab/frbr/core#",
   :rdfs/label         #voc/lstr "alternate of@en",
   :rdfs/range         :frbr/Manifestation,
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/alternateOf],
   :skos/definition    #voc/lstr "A manifestation that is alternated.@en"})

(def arrangement
  "An arrangement of an expression."
  {:db/ident :frbr/arrangement,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/arrangementOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "arrangement@en",
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/arrangement],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition #voc/lstr "An arrangement of an expression.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date    "2005-08-10",
                      :rdf/value    "Added domain and range of Expression"}})

(def arrangementOf
  "An expression that is arranged."
  {:db/ident :frbr/arrangementOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/arrangement,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "arrangement of@en",
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/arrangementOf],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition #voc/lstr "An expression that is arranged.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date    "2005-08-10",
                      :rdf/value    "Added domain and range of Expression"}})

(def complement
  "A complement to a work or expression."
  {:db/ident :frbr/complement,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/complementOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "complement@en",
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/complement],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}],
   :skos/definition #voc/lstr "A complement to a work or expression.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date "2005-08-10",
                      :rdf/value
                      "Added domain and range of Work or Expression"}})

(def complementOf
  "A work or expression that is complemented."
  {:db/ident :frbr/complementOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/complement,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "complement of@en",
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/complementOf],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition #voc/lstr "A work or expression that is complemented.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date "2005-08-10",
                      :rdf/value
                      "Added domain and range of Work or Expression"}})

(def creator
  "An entity in some way responsible for the creation of a work."
  {:db/ident :frbr/creator,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/creatorOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Work,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "creator@en",
   :rdfs/range :frbr/ResponsibleEntity,
   :rdfs/subPropertyOf [:frbr/responsibleEntity :frbr/creator],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}],
   :skos/definition
   #voc/lstr
    "An entity in some way responsible for the creation of a work.@en"})

(def creatorOf
  "A work that was in some way created by of an entity."
  {:db/ident :frbr/creatorOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/creator,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/ResponsibleEntity,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "creator of@en",
   :rdfs/range :frbr/Work,
   :rdfs/subPropertyOf [:frbr/responsibleEntityOf :frbr/creatorOf],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}],
   :skos/definition #voc/lstr
                     "A work that was in some way created by of an entity.@en"})

(def embodiment
  "A manifestation that embodies an expression."
  {:db/ident :frbr/embodiment,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/embodimentOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "embodiment@en",
   :rdfs/range :frbr/Manifestation,
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/embodiment],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}],
   :skos/definition #voc/lstr
                     "A manifestation that embodies an expression.@en"})

(def embodimentOf
  "An expression that is embodied by a manifestation."
  {:db/ident :frbr/embodimentOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/embodiment,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Manifestation,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "embodiment of@en",
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/embodimentOf],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}],
   :skos/definition #voc/lstr
                     "An expression that is embodied by a manifestation.@en"})

(def exemplar
  "An item that is an exemplar of a manifestation."
  {:db/ident :frbr/exemplar,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/exemplarOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Manifestation,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "exemplar@en",
   :rdfs/range :frbr/Item,
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/exemplar],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}],
   :skos/definition #voc/lstr
                     "An item that is an exemplar of a manifestation.@en"})

(def exemplarOf
  "The manifestation that is exemplified by a item."
  {:db/ident :frbr/exemplarOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/exemplar,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Item,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "exemplar of@en",
   :rdfs/range :frbr/Manifestation,
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/exemplarOf],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}],
   :skos/definition #voc/lstr
                     "The manifestation that is exemplified by a item.@en"})

(def imitation
  "An imitation of a work or expression."
  {:db/ident :frbr/imitation,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/imitationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "imitation@en",
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/imitation],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition #voc/lstr "An imitation of a work or expression.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date "2005-08-10",
                      :rdf/value
                      "Added domain and range of Work or Expression"}})

(def imitationOf
  "A work or expression that is imitated."
  {:db/ident :frbr/imitationOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/imitation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "imitation of@en",
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/imitationOf],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}],
   :skos/definition #voc/lstr "A work or expression that is imitated.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date "2005-08-10",
                      :rdf/value
                      "Added domain and range of Work or Expression"}})

(def owner
  "An entity that owns an item."
  {:db/ident :frbr/owner,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/ownerOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Item,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "owner@en",
   :rdfs/range :frbr/ResponsibleEntity,
   :rdfs/subPropertyOf [:frbr/responsibleEntity :frbr/owner],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition #voc/lstr "An entity that owns an item.@en"})

(def ownerOf
  "An item that is in some way owned an entity."
  {:db/ident :frbr/ownerOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/owner,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/ResponsibleEntity,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "owner of@en",
   :rdfs/range :frbr/Item,
   :rdfs/subPropertyOf [:frbr/responsibleEntityOf :frbr/ownerOf],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition #voc/lstr
                     "An item that is in some way owned an entity.@en"})

(def part
  "A part of an endeavour."
  {:db/ident :frbr/part,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/partOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "part@en",
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/part],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition #voc/lstr "A part of an endeavour.@en"})

(def partOf
  "An endeavour incorporating an endeavour."
  {:db/ident :frbr/partOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/part,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "part of@en",
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/partOf],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition #voc/lstr "An endeavour incorporating an endeavour.@en"})

(def producer
  "An entity in some way responsible for producing a manifestation."
  {:db/ident :frbr/producer,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/producerOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Manifestation,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "producer@en",
   :rdfs/range :frbr/ResponsibleEntity,
   :rdfs/subPropertyOf [:frbr/responsibleEntity :frbr/producer],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}],
   :skos/definition
   #voc/lstr
    "An entity in some way responsible for producing a manifestation.@en"})

(def producerOf
  "A manifestation that was in some way produced an entity."
  {:db/ident :frbr/producerOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/producer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/ResponsibleEntity,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "producer of@en",
   :rdfs/range :frbr/Manifestation,
   :rdfs/subPropertyOf [:frbr/responsibleEntityOf :frbr/producerOf],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition
   #voc/lstr "A manifestation that was in some way produced an entity.@en"})

(def realization
  "An expression that is an intellectual or artistic realization of a work."
  {:db/ident :frbr/realization,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/realizationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Work,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "realization@en",
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/realization],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}],
   :skos/definition
   #voc/lstr
    "An expression that is an intellectual or artistic realization of a work.@en"})

(def realizationOf
  "The work that has been realized by an expression."
  {:db/ident :frbr/realizationOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/realization,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "realization of@en",
   :rdfs/range :frbr/Work,
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/realizationOf],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}],
   :skos/definition #voc/lstr
                     "The work that has been realized by an expression.@en"})

(def realizer
  "An entity in some way responsible for realizing an expression."
  {:db/ident :frbr/realizer,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/realizerOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "realizer@en",
   :rdfs/range :frbr/ResponsibleEntity,
   :rdfs/subPropertyOf [:frbr/responsibleEntity :frbr/realizer],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition
   #voc/lstr
    "An entity in some way responsible for realizing an expression.@en"})

(def realizerOf
  "An expression that was in some way realized by an entity."
  {:db/ident :frbr/realizerOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/realizer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/ResponsibleEntity,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "realizer of@en",
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf [:frbr/responsibleEntityOf :frbr/realizerOf],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}],
   :skos/definition
   #voc/lstr "An expression that was in some way realized by an entity.@en"})

(def reconfiguration
  "A recongifuration of an item."
  {:db/ident           :frbr/reconfiguration,
   :dcterms/issued     "2005-08-10",
   :owl/inverseOf      :frbr/reconfigurationOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Item,
   :rdfs/isDefinedBy   "http://purl.org/vocab/frbr/core#",
   :rdfs/label         #voc/lstr "reconfiguration@en",
   :rdfs/range         :frbr/Item,
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/reconfiguration],
   :skos/definition    #voc/lstr "A recongifuration of an item.@en"})

(def reconfigurationOf
  "An item that is reconfigured."
  {:db/ident           :frbr/reconfigurationOf,
   :dcterms/issued     "2005-08-10",
   :owl/inverseOf      :frbr/reconfiguration,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Item,
   :rdfs/isDefinedBy   "http://purl.org/vocab/frbr/core#",
   :rdfs/label         #voc/lstr "reconfiguration of@en",
   :rdfs/range         :frbr/Item,
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/reconfigurationOf],
   :skos/definition    #voc/lstr "An item that is reconfigured.@en"})

(def relatedEndeavour
  "Another endeavour that is related in some way to an endeavour."
  {:db/ident :frbr/relatedEndeavour,
   :dcterms/issued "2005-07-15",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Endeavour,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "related endeavour@en",
   :rdfs/range :frbr/Endeavour,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition
   #voc/lstr
    "Another endeavour that is related in some way to an endeavour.@en"})

(def reproduction
  "A reproduction of a manifestation or item."
  {:db/ident :frbr/reproduction,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/reproductionOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Manifestation :frbr/Item],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "reproduction@en",
   :rdfs/range {:owl/unionOf [:frbr/Manifestation :frbr/Item],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/reproduction],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}],
   :skos/definition #voc/lstr "A reproduction of a manifestation or item.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date "2005-08-10",
                      :rdf/value
                      "Added domain and range of Manifestation or Item"}})

(def reproductionOf
  "A manifestation or item that is reproduced."
  {:db/ident :frbr/reproductionOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/reproduction,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Manifestation :frbr/Item],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "reproduction of@en",
   :rdfs/range {:owl/unionOf [:frbr/Manifestation :frbr/Item],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/reproductionOf],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition #voc/lstr "A manifestation or item that is reproduced.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date "2005-08-10",
                      :rdf/value
                      "Added domain and range of Manifestation or Item"}})

(def responsibleEntity
  "An entity in some way responsible for an endeavour."
  {:db/ident :frbr/responsibleEntity,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/responsibleEntityOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Endeavour,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "responsible entity@en",
   :rdfs/range :frbr/ResponsibleEntity,
   :rdfs/subPropertyOf :frbr/responsibleEntity,
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition #voc/lstr
                     "An entity in some way responsible for an endeavour.@en"})

(def responsibleEntityOf
  "An endeavour that is the responsibility of an entity."
  {:db/ident :frbr/responsibleEntityOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/responsibleEntity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/ResponsibleEntity,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "responsible entity of@en",
   :rdfs/range :frbr/Endeavour,
   :rdfs/subPropertyOf :frbr/responsibleEntityOf,
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}],
   :skos/definition
   #voc/lstr "An endeavour that is the responsibility of an entity.@en"})

(def revision
  "A revision of an expression."
  {:db/ident :frbr/revision,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/revisionOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "revision@en",
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/revision],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition #voc/lstr "A revision of an expression.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date    "2005-08-10",
                      :rdf/value    "Added domain and range of Expression"}})

(def revisionOf
  "An expression that is revised."
  {:db/ident :frbr/revisionOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/revision,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "revision of@en",
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/revisionOf],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}],
   :skos/definition #voc/lstr "An expression that is revised.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date    "2005-08-10",
                      :rdf/value    "Added domain and range of Expression"}})

(def subject
  "The subject of a work."
  {:db/ident :frbr/subject,
   :dcterms/issued "2005-07-15",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Work,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "subject@en",
   :rdfs/range
   {:owl/unionOf [:frbr/Endeavour :frbr/ResponsibleEntity :frbr/Subject],
    :rdf/type    :owl/Class},
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition #voc/lstr "The subject of a work.@en"})

(def successor
  "A successor to a work or expression."
  {:db/ident :frbr/successor,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/successorOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "successor@en",
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/successor],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition #voc/lstr "A successor to a work or expression.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date "2005-08-10",
                      :rdf/value
                      "Added domain and range of Work or Expression"}})

(def successorOf
  "A work or expression that is succeeded."
  {:db/ident :frbr/successorOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/successor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "successor of@en",
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/successorOf],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}],
   :skos/definition #voc/lstr "A work or expression that is succeeded.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date "2005-08-10",
                      :rdf/value
                      "Added domain and range of Work or Expression"}})

(def summarization
  "A summarization of a work or expression."
  {:db/ident :frbr/summarization,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/summarizationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "summarization@en",
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/summarization],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition #voc/lstr "A summarization of a work or expression.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date "2005-08-10",
                      :rdf/value
                      "Added domain and range of Work or Expression"}})

(def summarizationOf
  "A work or expression that is summarized."
  {:db/ident :frbr/summarizationOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/summarization,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "summarization of@en",
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/summarizationOf],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}],
   :skos/definition #voc/lstr "A work or expression that is summarized.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date "2005-08-10",
                      :rdf/value
                      "Added domain and range of Work or Expression"}})

(def supplement
  "A supplement to a work or expression."
  {:db/ident :frbr/supplement,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/supplementOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "supplement@en",
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/supplement],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}],
   :skos/definition #voc/lstr "A supplement to a work or expression.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date "2005-08-10",
                      :rdf/value
                      "Added domain and range of Work or Expression"}})

(def supplementOf
  "A work or expression that is supplemented."
  {:db/ident :frbr/supplementOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/supplement,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "supplement of@en",
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/supplementOf],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition #voc/lstr "A work or expression that is supplemented.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date "2005-08-10",
                      :rdf/value
                      "Added domain and range of Work or Expression"}})

(def transformation
  "A transformation of a work or expression."
  {:db/ident :frbr/transformation,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/transformationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "transformation@en",
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/transformation],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition #voc/lstr "A transformation of a work or expression.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date "2005-08-10",
                      :rdf/value
                      "Added domain and range of Work or Expression"}})

(def transformationOf
  "A work or expression that is transformed."
  {:db/ident :frbr/transformationOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/transformation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "transformation of@en",
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/transformationOf],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}],
   :skos/definition #voc/lstr "A work or expression that is transformed.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date "2005-08-10",
                      :rdf/value
                      "Added domain and range of Work or Expression"}})

(def translation
  "A translation of an expression."
  {:db/ident :frbr/translation,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/translationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "translation@en",
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/translation],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition #voc/lstr "A translation of an expression.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date    "2005-08-10",
                      :rdf/value    "Added domain and range of Expression"}})

(def translationOf
  "An expression that is translated."
  {:db/ident :frbr/translationOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/translation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label #voc/lstr "translation of@en",
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf [:frbr/relatedEndeavour :frbr/translationOf],
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-09",
     :rdf/value    "Added definition"}],
   :skos/definition #voc/lstr "An expression that is translated.@en",
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date    "2005-08-10",
                      :rdf/value    "Added domain and range of Expression"}})

(def ^{:private true} Attribution
  {:db/ident :cc/Attribution,
   :rdf/type :cc/Requirement})

(def ^{:private true} DerivativeWorks
  {:db/ident :cc/DerivativeWorks,
   :rdf/type :cc/Permission})

(def ^{:private true} Distribution
  {:db/ident :cc/Distribution,
   :rdf/type :cc/Permission})

(def ^{:private true} License
  {:db/ident :cc/License,
   :rdf/type :owl/Class})

(def ^{:private true} Notice
  {:db/ident :cc/Notice,
   :rdf/type :cc/Requirement})

(def ^{:private true} Permission
  {:db/ident :cc/Permission,
   :rdf/type :owl/Class})

(def ^{:private true} Reproduction
  {:db/ident :cc/Reproduction,
   :rdf/type :cc/Permission})

(def ^{:private true} Requirement
  {:db/ident :cc/Requirement,
   :rdf/type :owl/Class})

(def ^{:private true} license
  {:db/ident :cc/license,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} permits
  {:db/ident :cc/permits,
   :rdf/type :owl/ObjectProperty})

(def ^{:private true} requires
  {:db/ident :cc/requires,
   :rdf/type :owl/ObjectProperty})

(def ^{:private true} Text
  {:db/ident :dcmitype/Text,
   :rdf/type :owl/Class})

(def ^{:private true} Group
  {:db/ident        :foaf/Group,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:frbr/CorporateBody :foaf/Group :frbr/ResponsibleEntity]})

(def ^{:private true} Organization
  {:db/ident        :foaf/Organization,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:frbr/CorporateBody
                     :foaf/Organization
                     :frbr/ResponsibleEntity]})

(def ^{:private true} Person
  {:db/ident        :foaf/Person,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:frbr/ResponsibleEntity :foaf/Person]})

(def ^{:private true} SpatialThing
  {:db/ident        :geo/SpatialThing,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :geo/SpatialThing})

(def ^{:private true} Concept
  {:db/ident        :skos/Concept,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :skos/Concept})

(def ^{:private true} changes
  {:db/ident :vann/changes,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} preferredNamespacePrefix
  {:db/ident :vann/preferredNamespacePrefix,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} preferredNamespaceUri
  {:db/ident :vann/preferredNamespaceUri,
   :rdf/type :owl/AnnotationProperty})