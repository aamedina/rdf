(ns net.wikipunk.rdf.frbr
  "Expression of Core FRBR Concepts in RDF"
  {:cc/license "http://creativecommons.org/licenses/by/2.0/uk/",
   :dcat/downloadURL "https://vocab.org/frbr/frbr-core-20050810.rdf",
   :dcterms/contributor "Bruce D'Arcus",
   :dcterms/creator ["Richard Newman" "Ian Davis <http://purl.org/NET/iand>"],
   :dcterms/date "2005-08-10",
   :dcterms/hasFormat ["http://purl.org/vocab/frbr/frbr-core-20050810.rdf"
                       "http://purl.org/vocab/frbr/frbr-core-20050810.html"],
   :dcterms/identifier "http://purl.org/vocab/frbr/frbr-core-20050810",
   :dcterms/isVersionOf "http://purl.org/vocab/frbr/core#",
   :dcterms/issued "2005-07-15",
   :dcterms/replaces "http://purl.org/vocab/frbr/frbr-core-20050809",
   :dcterms/rights "Copyright © 2005 Richard Newman and Ian Davis",
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Expression of Core FRBR Concepts in RDF"},
   :rdf/ns-prefix-map {"cc"       "http://web.resource.org/cc/",
                       "dcmitype" "http://purl.org/dc/dcmitype/",
                       "dcterms"  "http://purl.org/dc/terms/",
                       "frbr"     "http://purl.org/vocab/frbr/core#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "skos"     "http://www.w3.org/2004/02/skos/core#",
                       "vann"     "http://purl.org/vocab/vann/"},
   :rdf/type [:owl/Ontology :cc/Work],
   :rdf/uri "https://vocab.org/frbr/frbr-core-20050810.rdf",
   :rdfa/prefix "frbr",
   :rdfa/uri "http://purl.org/vocab/frbr/core#",
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "\n      This vocabulary is an expression in RDF of the concepts and relations described in the\n      IFLA report on the Functional Requirements for Bibliographic Records (FRBR). \n    "}
    {:rdf/language "en",
     :rdf/value
     "\n      This vocabulary is a work in progress, it includes RDF classes for the group 1, 2 and 3 entities\n      described by the FRBR report and properties corresponding to the core relationships between\n      those entities. It does not yet describe attributes of the entities. Where possible, appropriate \n      relationships with other vocabularies are included in order to place this vocabulary in the \n      context of existing RDF work.\n    "}],
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-10",
     :rdf/value
     "Added experimental paraphrases to property and class descriptions"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-10",
     :rdf/value       "Fixed type in film example and added creator and date"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-10",
     :rdf/value       "Sorted properties and classes alphabetically by URI"}],
   :skos/example "https://vocab.org/frbr/frbr-example-film-20050809.html",
   :skos/historyNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-10",
     :rdf/value       "Item is now not a subclass of geo:SpatialThing"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-10",
     :rdf/value "Made domains and ranges of many properties more specific"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-10",
     :rdf/value
     "Added alternate, alternateOf, reconfiguration, reconfigurationOf properties"}],
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
   {:rdf/language "en",
    :rdf/value
    "This class corresponds to the FRBR group three entity 'Concept'."},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "concept"},
   :rdfs/subClassOf [:frbr/Subject :skos/Concept],
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Extracted definition from existing comment"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-08",
     :rdf/value       "Added comment"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An abstract idea or notion."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date    "2005-08-08",
                      :rdf/value       "Made subclass of skos:Concept"}})

(def CorporateBody
  "An organization or group of individuals and/or other organizations."
  {:db/ident :frbr/CorporateBody,
   :dcterms/issued "2005-07-15",
   :owl/equivalentClass {:owl/unionOf [:foaf/Organization :foaf/Group],
                         :rdf/type    :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This class corresponds to the FRBR group two entity 'Corporate Body'."},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "corporate body"},
   :rdfs/subClassOf :frbr/ResponsibleEntity,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-08",
     :rdf/value       "Added comment"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Extracted definition from existing comment"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An organization or group of individuals and/or other organizations."}})

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
   {:rdf/language "en",
    :rdf/value "This class represents any one of the FRBR group one entities."},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "endeavour"},
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-08",
     :rdf/value       "Added comment"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Extracted definition from existing comment"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Any of the products of artistic or creative endeavour."}})

(def Event
  "An action or occurrence."
  {:db/ident :frbr/Event,
   :dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Concept :frbr/Object :frbr/Place],
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This class corresponds to the FRBR group three entity 'Event'."},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "event"},
   :rdfs/subClassOf [:frbr/Subject
                     "http://www.isi.edu/~pan/damltime/time-entry.owl#Event"],
   :skos/changeNote [{:dcterms/creator "Ian Davis",
                      :dcterms/date "2005-08-09",
                      :rdf/value "Extracted definition from existing comment"}
                     {:dcterms/creator "Ian Davis",
                      :dcterms/date    "2005-08-08",
                      :rdf/value       "Added comment"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An action or occurrence."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date    "2005-08-08",
                      :rdf/value       "Made subclass of owltime:Event"}})

(def Expression
  "A realization of a single work usually in a physical form."
  {:db/ident :frbr/Expression,
   :dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Manifestation :frbr/Work :frbr/Item],
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This class corresponds to the FRBR group one entity 'Expression'."},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "expression"},
   :rdfs/subClassOf :frbr/Endeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-08",
     :rdf/value       "Added comment"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Extracted definition from existing comment"}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A realization of a single work usually in a physical form."}})

(def Item
  "An exemplar of a single manifestation."
  {:db/ident :frbr/Item,
   :dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Manifestation :frbr/Work :frbr/Expression],
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "This class corresponds to the FRBR group one entity 'Item'."},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "item"},
   :rdfs/subClassOf :frbr/Endeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Extracted definition from existing comment"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-08",
     :rdf/value       "Added comment"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An exemplar of a single manifestation."},
   :skos/historyNote [{:dcterms/creator "Ian Davis",
                       :dcterms/date    "2005-08-08",
                       :rdf/value       "Made subclass of geo:SpatialThing"}
                      {:dcterms/creator "Ian Davis",
                       :dcterms/date "2005-08-10",
                       :rdf/value "Removed subclass of geo:SpatialThing"}]})

(def Manifestation
  "The physical embodiment of one or more expressions."
  {:db/ident :frbr/Manifestation,
   :dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Work :frbr/Expression :frbr/Item],
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This class corresponds to the FRBR group one entity 'Manifestation'."},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "manifestation"},
   :rdfs/subClassOf :frbr/Endeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-08",
     :rdf/value       "Added comment"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Extracted definition from existing comment"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The physical embodiment of one or more expressions."}})

(def ObjectClass
  "A tangible or material thing."
  {:db/ident :frbr/Object,
   :dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Place :frbr/Event :frbr/Concept],
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This class corresponds to the FRBR group three entity 'Object'."},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "object"},
   :rdfs/subClassOf [:geo/SpatialThing :frbr/Subject],
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-08",
     :rdf/value       "Added comment"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Extracted definition from existing comment"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A tangible or material thing."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date    "2005-08-08",
                      :rdf/value       "Made subclass of geo:SpatialThing"}})

(def Person
  "A living or dead individual."
  {:db/ident :frbr/Person,
   :dcterms/issued "2005-08-08",
   :owl/disjointWith [:frbr/Subject :frbr/Endeavour],
   :owl/equivalentClass :foaf/Person,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "This class corresponds to the FRBR group two entity 'Person'."},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "person"},
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Extracted definition from existing comment"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-08",
     :rdf/value       "Added comment"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A living or dead individual."}})

(def Place
  "A location."
  {:db/ident :frbr/Place,
   :dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Concept :frbr/Object :frbr/Event],
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This class corresponds to the FRBR group three entity 'Place'."},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "place"},
   :rdfs/subClassOf [:geo/SpatialThing :frbr/Subject],
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Extracted definition from existing comment"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-08",
     :rdf/value       "Added comment"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A location."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date    "2005-08-08",
                      :rdf/value       "Made subclass of geo:SpatialThing"}})

(def ResponsibleEntity
  "One responsible for the creation, production, distribution or maintenance of artistic or creative content."
  {:db/ident :frbr/ResponsibleEntity,
   :dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Endeavour :frbr/Subject],
   :owl/equivalentClass {:owl/unionOf [:frbr/CorporateBody :foaf/Person],
                         :rdf/type    :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "This class represents any of the FRBR group two entities."},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "responsible entity"},
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-08",
     :rdf/value       "Added comment"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Extracted definition from existing comment"}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "One responsible for the creation, production, distribution or maintenance of artistic or creative content."}})

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
   {:rdf/language "en",
    :rdf/value "This class represents any of the FRBR group three entities."},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subject"},
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Extracted definition from existing comment"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-08",
     :rdf/value       "Added comment"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Something that may serve as the subject of a work."}})

(def Work
  "An abstract notion of an artistic or intellectual creation."
  {:db/ident :frbr/Work,
   :dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Manifestation :frbr/Expression :frbr/Item],
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "This class corresponds to the FRBR group one entity 'Work'."},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "work"},
   :rdfs/subClassOf [:frbr/Endeavour "http://xmlns.com/wordnet/1.6/Work~2"],
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-08",
     :rdf/value       "Added comment"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Extracted definition from existing comment"}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "An abstract notion of an artistic or intellectual creation."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date    "2005-08-08",
                      :rdf/value       "Made subclass of wordnet:Work~2"}})

(def abridgement
  "An abridgment of an expression."
  {:db/ident :frbr/abridgement,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/abridgementOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "abridgement"},
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An abridgment of an expression."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date    "2005-08-10",
                      :rdf/value       "Added domain and range of Expression"}})

(def abridgementOf
  "An expression that is abridged."
  {:db/ident :frbr/abridgementOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/abridgement,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "abridgement of"},
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An expression that is abridged."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date    "2005-08-10",
                      :rdf/value       "Added domain and range of Expression"}})

(def adaption
  "An adaption of a work or expression."
  {:db/ident :frbr/adaption,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/adaptionOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "adaption"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An adaption of a work or expression."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date "2005-08-10",
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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "adaption of"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A work or expression that is adapted."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date "2005-08-10",
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
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "alternate"},
   :rdfs/range         :frbr/Manifestation,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "An alternative to a manifestation."}})

(def alternateOf
  "A manifestation that is alternated."
  {:db/ident           :frbr/alternateOf,
   :dcterms/issued     "2005-08-10",
   :owl/inverseOf      :frbr/alternate,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Manifestation,
   :rdfs/isDefinedBy   "http://purl.org/vocab/frbr/core#",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "alternate of"},
   :rdfs/range         :frbr/Manifestation,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "A manifestation that is alternated."}})

(def arrangement
  "An arrangement of an expression."
  {:db/ident :frbr/arrangement,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/arrangementOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "arrangement"},
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An arrangement of an expression."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date    "2005-08-10",
                      :rdf/value       "Added domain and range of Expression"}})

(def arrangementOf
  "An expression that is arranged."
  {:db/ident :frbr/arrangementOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/arrangement,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "arrangement of"},
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An expression that is arranged."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date    "2005-08-10",
                      :rdf/value       "Added domain and range of Expression"}})

(def complement
  "A complement to a work or expression."
  {:db/ident :frbr/complement,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/complementOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "complement"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A complement to a work or expression."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date "2005-08-10",
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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "complement of"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "A work or expression that is complemented."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date "2005-08-10",
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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "creator"},
   :rdfs/range :frbr/ResponsibleEntity,
   :rdfs/subPropertyOf :frbr/responsibleEntity,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An entity in some way responsible for the creation of a work."}})

(def creatorOf
  "A work that was in some way created by of an entity."
  {:db/ident :frbr/creatorOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/creator,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/ResponsibleEntity,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "creator of"},
   :rdfs/range :frbr/Work,
   :rdfs/subPropertyOf :frbr/responsibleEntityOf,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A work that was in some way created by of an entity."}})

(def embodiment
  "A manifestation that embodies an expression."
  {:db/ident :frbr/embodiment,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/embodimentOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "embodiment"},
   :rdfs/range :frbr/Manifestation,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A manifestation that embodies an expression."}})

(def embodimentOf
  "An expression that is embodied by a manifestation."
  {:db/ident :frbr/embodimentOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/embodiment,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Manifestation,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "embodiment of"},
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An expression that is embodied by a manifestation."}})

(def exemplar
  "An item that is an exemplar of a manifestation."
  {:db/ident :frbr/exemplar,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/exemplarOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Manifestation,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "exemplar"},
   :rdfs/range :frbr/Item,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An item that is an exemplar of a manifestation."}})

(def exemplarOf
  "The manifestation that is exemplified by a item."
  {:db/ident :frbr/exemplarOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/exemplar,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Item,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "exemplar of"},
   :rdfs/range :frbr/Manifestation,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The manifestation that is exemplified by a item."}})

(def imitation
  "An imitation of a work or expression."
  {:db/ident :frbr/imitation,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/imitationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "imitation"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An imitation of a work or expression."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date "2005-08-10",
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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "imitation of"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A work or expression that is imitated."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date "2005-08-10",
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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "owner"},
   :rdfs/range :frbr/ResponsibleEntity,
   :rdfs/subPropertyOf :frbr/responsibleEntity,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An entity that owns an item."}})

(def ownerOf
  "An item that is in some way owned an entity."
  {:db/ident :frbr/ownerOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/owner,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/ResponsibleEntity,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "owner of"},
   :rdfs/range :frbr/Item,
   :rdfs/subPropertyOf :frbr/responsibleEntityOf,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An item that is in some way owned an entity."}})

(def part
  "A part of an endeavour."
  {:db/ident :frbr/part,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/partOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "part"},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A part of an endeavour."}})

(def partOf
  "An endeavour incorporating an endeavour."
  {:db/ident :frbr/partOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/part,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "part of"},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An endeavour incorporating an endeavour."}})

(def producer
  "An entity in some way responsible for producing a manifestation."
  {:db/ident :frbr/producer,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/producerOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Manifestation,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "producer"},
   :rdfs/range :frbr/ResponsibleEntity,
   :rdfs/subPropertyOf :frbr/responsibleEntity,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An entity in some way responsible for producing a manifestation."}})

(def producerOf
  "A manifestation that was in some way produced an entity."
  {:db/ident :frbr/producerOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/producer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/ResponsibleEntity,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "producer of"},
   :rdfs/range :frbr/Manifestation,
   :rdfs/subPropertyOf :frbr/responsibleEntityOf,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "A manifestation that was in some way produced an entity."}})

(def realization
  "An expression that is an intellectual or artistic realization of a work."
  {:db/ident :frbr/realization,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/realizationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Work,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "realization"},
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An expression that is an intellectual or artistic realization of a work."}})

(def realizationOf
  "The work that has been realized by an expression."
  {:db/ident :frbr/realizationOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/realization,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "realization of"},
   :rdfs/range :frbr/Work,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The work that has been realized by an expression."}})

(def realizer
  "An entity in some way responsible for realizing an expression."
  {:db/ident :frbr/realizer,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/realizerOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "realizer"},
   :rdfs/range :frbr/ResponsibleEntity,
   :rdfs/subPropertyOf :frbr/responsibleEntity,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An entity in some way responsible for realizing an expression."}})

(def realizerOf
  "An expression that was in some way realized by an entity."
  {:db/ident :frbr/realizerOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/realizer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/ResponsibleEntity,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "realizer of"},
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/responsibleEntityOf,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "An expression that was in some way realized by an entity."}})

(def reconfiguration
  "A recongifuration of an item."
  {:db/ident           :frbr/reconfiguration,
   :dcterms/issued     "2005-08-10",
   :owl/inverseOf      :frbr/reconfigurationOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Item,
   :rdfs/isDefinedBy   "http://purl.org/vocab/frbr/core#",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "reconfiguration"},
   :rdfs/range         :frbr/Item,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "A recongifuration of an item."}})

(def reconfigurationOf
  "An item that is reconfigured."
  {:db/ident           :frbr/reconfigurationOf,
   :dcterms/issued     "2005-08-10",
   :owl/inverseOf      :frbr/reconfiguration,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Item,
   :rdfs/isDefinedBy   "http://purl.org/vocab/frbr/core#",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "reconfiguration of"},
   :rdfs/range         :frbr/Item,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "An item that is reconfigured."}})

(def relatedEndeavour
  "Another endeavour that is related in some way to an endeavour."
  {:db/ident :frbr/relatedEndeavour,
   :dcterms/issued "2005-07-15",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Endeavour,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "related endeavour"},
   :rdfs/range :frbr/Endeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Another endeavour that is related in some way to an endeavour."}})

(def reproduction
  "A reproduction of a manifestation or item."
  {:db/ident :frbr/reproduction,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/reproductionOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Manifestation :frbr/Item],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "reproduction"},
   :rdfs/range {:owl/unionOf [:frbr/Manifestation :frbr/Item],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "A reproduction of a manifestation or item."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date "2005-08-10",
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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "reproduction of"},
   :rdfs/range {:owl/unionOf [:frbr/Manifestation :frbr/Item],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "A manifestation or item that is reproduced."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date "2005-08-10",
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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "responsible entity"},
   :rdfs/range :frbr/ResponsibleEntity,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An entity in some way responsible for an endeavour."}})

(def responsibleEntityOf
  "An endeavour that is the responsibility of an entity."
  {:db/ident :frbr/responsibleEntityOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/responsibleEntity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/ResponsibleEntity,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "responsible entity of"},
   :rdfs/range :frbr/Endeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An endeavour that is the responsibility of an entity."}})

(def revision
  "A revision of an expression."
  {:db/ident :frbr/revision,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/revisionOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "revision"},
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A revision of an expression."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date    "2005-08-10",
                      :rdf/value       "Added domain and range of Expression"}})

(def revisionOf
  "An expression that is revised."
  {:db/ident :frbr/revisionOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/revision,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "revision of"},
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An expression that is revised."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date    "2005-08-10",
                      :rdf/value       "Added domain and range of Expression"}})

(def subject
  "The subject of a work."
  {:db/ident :frbr/subject,
   :dcterms/issued "2005-07-15",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Work,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subject"},
   :rdfs/range
   {:owl/unionOf [:frbr/Endeavour :frbr/ResponsibleEntity :frbr/Subject],
    :rdf/type    :owl/Class},
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The subject of a work."}})

(def successor
  "A successor to a work or expression."
  {:db/ident :frbr/successor,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/successorOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "successor"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A successor to a work or expression."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date "2005-08-10",
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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "successor of"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A work or expression that is succeeded."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date "2005-08-10",
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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "summarization"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A summarization of a work or expression."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date "2005-08-10",
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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "summarization of"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A work or expression that is summarized."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date "2005-08-10",
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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "supplement"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A supplement to a work or expression."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date "2005-08-10",
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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "supplement of"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "A work or expression that is supplemented."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date "2005-08-10",
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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transformation"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A transformation of a work or expression."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date "2005-08-10",
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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transformation of"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A work or expression that is transformed."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date "2005-08-10",
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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "translation"},
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A translation of an expression."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date    "2005-08-10",
                      :rdf/value       "Added domain and range of Expression"}})

(def translationOf
  "An expression that is translated."
  {:db/ident :frbr/translationOf,
   :dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/translation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "translation of"},
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date "2005-08-08",
     :rdf/value "Added isDefinedBy property referring to FRBR core namespace"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2005-08-09",
     :rdf/value       "Added definition"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An expression that is translated."},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date    "2005-08-10",
                      :rdf/value       "Added domain and range of Expression"}})