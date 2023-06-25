(ns net.wikipunk.rdf.skos
  "An RDF vocabulary for describing the basic structure and content of concept schemes such as thesauri, classification schemes, subject heading lists, taxonomies, 'folksonomies', other types of controlled vocabulary, and also concept schemes embedded in glossaries and terminologies."
  {:dcterms/contributor
   ["Participants in W3C's Semantic Web Deployment Working Group."
    "Nikki Rogers"
    "Dave Beckett"],
   :dcterms/creator ["Sean Bechhofer" "Alistair Miles"],
   :dcterms/description
   #voc/lstr
    "An RDF vocabulary for describing the basic structure and content of concept schemes such as thesauri, classification schemes, subject heading lists, taxonomies, 'folksonomies', other types of controlled vocabulary, and also concept schemes embedded in glossaries and terminologies.@en",
   :dcterms/title #voc/lstr "SKOS Vocabulary@en",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "skos",
   :rdfa/uri "http://www.w3.org/2004/02/skos/core",
   :rdfs/isDefinedBy {:rdf/uri
                      "http://www.w3.org/TR/2009/REC-skos-reference-20090818/"},
   :rdfs/seeAlso ["http://www.w3.org/TR/skos-reference/"]})

(def Collection
  "A meaningful collection of concepts."
  {:db/ident :skos/Collection,
   :owl/disjointWith [:skos/ConceptScheme :skos/Concept],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "Collection@en",
   :skos/definition #voc/lstr "A meaningful collection of concepts.@en",
   :skos/note
   [#voc/lstr "A meaningful collection of concepts.@en"
    #voc/lstr
     "Labelled collections can be used where you would like a set of concepts to be displayed under a 'node label' in the hierarchy.@en"],
   :skos/scopeNote
   #voc/lstr
    "Labelled collections can be used where you would like a set of concepts to be displayed under a 'node label' in the hierarchy.@en"})

(def Concept
  "An idea or notion; a unit of thought."
  {:db/ident         :skos/Concept,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label       #voc/lstr "Concept@en",
   :skos/definition  #voc/lstr "An idea or notion; a unit of thought.@en",
   :skos/note        #voc/lstr "An idea or notion; a unit of thought.@en"})

(def ConceptScheme
  "A set of concepts, optionally including statements about semantic relationships between those concepts."
  {:db/ident :skos/ConceptScheme,
   :owl/disjointWith :skos/Concept,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "Concept Scheme@en",
   :skos/definition
   #voc/lstr
    "A set of concepts, optionally including statements about semantic relationships between those concepts.@en",
   :skos/example
   #voc/lstr
    "Thesauri, classification schemes, subject heading lists, taxonomies, 'folksonomies', and other types of controlled vocabulary are all examples of concept schemes. Concept schemes are also embedded in glossaries and terminologies.@en",
   :skos/note
   [#voc/lstr
     "A set of concepts, optionally including statements about semantic relationships between those concepts.@en"
    #voc/lstr
     "A concept scheme may be defined to include concepts from different sources.@en"
    #voc/lstr
     "Thesauri, classification schemes, subject heading lists, taxonomies, 'folksonomies', and other types of controlled vocabulary are all examples of concept schemes. Concept schemes are also embedded in glossaries and terminologies.@en"],
   :skos/scopeNote
   #voc/lstr
    "A concept scheme may be defined to include concepts from different sources.@en"})

(def OrderedCollection
  "An ordered collection of concepts, where both the grouping and the ordering are meaningful."
  {:db/ident :skos/OrderedCollection,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "Ordered Collection@en",
   :rdfs/subClassOf :skos/Collection,
   :skos/definition
   #voc/lstr
    "An ordered collection of concepts, where both the grouping and the ordering are meaningful.@en",
   :skos/note
   [#voc/lstr
     "An ordered collection of concepts, where both the grouping and the ordering are meaningful.@en"
    #voc/lstr
     "Ordered collections can be used where you would like a set of concepts to be displayed in a specific order, and optionally under a 'node label'.@en"],
   :skos/scopeNote
   #voc/lstr
    "Ordered collections can be used where you would like a set of concepts to be displayed in a specific order, and optionally under a 'node label'.@en"})

(def altLabel
  "An alternative lexical label for a resource."
  {:db/ident :skos/altLabel,
   :db/cardinality :db.cardinality/many,
   :db/valueType :db.type/string,
   :rdf/type [:rdf/Property :owl/AnnotationProperty],
   :rdfs/comment
   [#voc/lstr
     "skos:prefLabel, skos:altLabel and skos:hiddenLabel are pairwise disjoint properties.@en"
    #voc/lstr
     "The range of skos:altLabel is the class of RDF plain literals.@en"],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "alternative label@en",
   :rdfs/subPropertyOf :rdfs/label,
   :skos/definition #voc/lstr "An alternative lexical label for a resource.@en",
   :skos/example
   #voc/lstr
    "Acronyms, abbreviations, spelling variants, and irregular plural/singular forms may be included among the alternative labels for a concept. Mis-spelled terms are normally included as hidden labels (see skos:hiddenLabel).@en",
   :skos/note
   [#voc/lstr "An alternative lexical label for a resource.@en"
    #voc/lstr
     "Acronyms, abbreviations, spelling variants, and irregular plural/singular forms may be included among the alternative labels for a concept. Mis-spelled terms are normally included as hidden labels (see skos:hiddenLabel).@en"]})

(def broadMatch
  "skos:broadMatch is used to state a hierarchical mapping link between two conceptual resources in different concept schemes."
  {:db/ident :skos/broadMatch,
   :db/cardinality :db.cardinality/many,
   :db/valueType :db.type/ref,
   :owl/inverseOf :skos/narrowMatch,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "has broader match@en",
   :rdfs/subPropertyOf [:skos/broader
                        :skos/mappingRelation
                        :skos/semanticRelation
                        :skos/broaderTransitive],
   :skos/definition
   #voc/lstr
    "skos:broadMatch is used to state a hierarchical mapping link between two conceptual resources in different concept schemes.@en",
   :skos/note
   #voc/lstr
    "skos:broadMatch is used to state a hierarchical mapping link between two conceptual resources in different concept schemes.@en"})

(def broader
  "Relates a concept to a concept that is more general in meaning."
  {:db/ident :skos/broader,
   :db/cardinality :db.cardinality/many,
   :db/valueType :db.type/ref,
   :owl/inverseOf :skos/narrower,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #voc/lstr
    "Broader concepts are typically rendered as parents in a concept hierarchy (tree).@en",
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "has broader@en",
   :rdfs/subPropertyOf [:skos/broaderTransitive :skos/semanticRelation],
   :skos/definition
   #voc/lstr
    "Relates a concept to a concept that is more general in meaning.@en",
   :skos/note
   [#voc/lstr
     "Relates a concept to a concept that is more general in meaning.@en"
    #voc/lstr
     "By convention, skos:broader is only used to assert an immediate (i.e. direct) hierarchical link between two conceptual resources.@en"],
   :skos/scopeNote
   #voc/lstr
    "By convention, skos:broader is only used to assert an immediate (i.e. direct) hierarchical link between two conceptual resources.@en"})

(def broaderTransitive
  "skos:broaderTransitive is a transitive superproperty of skos:broader."
  {:db/ident :skos/broaderTransitive,
   :owl/inverseOf :skos/narrowerTransitive,
   :rdf/type [:rdf/Property :owl/TransitiveProperty :owl/ObjectProperty],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "has broader transitive@en",
   :rdfs/subPropertyOf :skos/semanticRelation,
   :skos/definition
   "skos:broaderTransitive is a transitive superproperty of skos:broader.",
   :skos/note
   ["skos:broaderTransitive is a transitive superproperty of skos:broader."
    #voc/lstr
     "By convention, skos:broaderTransitive is not used to make assertions. Rather, the properties can be used to draw inferences about the transitive closure of the hierarchical relation, which is useful e.g. when implementing a simple query expansion algorithm in a search application.@en"],
   :skos/scopeNote
   #voc/lstr
    "By convention, skos:broaderTransitive is not used to make assertions. Rather, the properties can be used to draw inferences about the transitive closure of the hierarchical relation, which is useful e.g. when implementing a simple query expansion algorithm in a search application.@en"})

(def changeNote
  "A note about a modification to a concept."
  {:db/ident           :skos/changeNote,
   :rdf/type           [:rdf/Property :owl/AnnotationProperty],
   :rdfs/isDefinedBy   "http://www.w3.org/2004/02/skos/core",
   :rdfs/label         #voc/lstr "change note@en",
   :rdfs/subPropertyOf :skos/note,
   :skos/definition    #voc/lstr "A note about a modification to a concept.@en",
   :skos/note          #voc/lstr
                        "A note about a modification to a concept.@en"})

(def closeMatch
  "skos:closeMatch is used to link two concepts that are sufficiently similar that they can be used interchangeably in some information retrieval applications. In order to avoid the possibility of \"compound errors\" when combining mappings across more than two concept schemes, skos:closeMatch is not declared to be a transitive property."
  {:db/ident :skos/closeMatch,
   :rdf/type [:rdf/Property :owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "has close match@en",
   :rdfs/subPropertyOf [:skos/mappingRelation :skos/semanticRelation],
   :skos/definition
   #voc/lstr
    "skos:closeMatch is used to link two concepts that are sufficiently similar that they can be used interchangeably in some information retrieval applications. In order to avoid the possibility of \"compound errors\" when combining mappings across more than two concept schemes, skos:closeMatch is not declared to be a transitive property.@en",
   :skos/note
   #voc/lstr
    "skos:closeMatch is used to link two concepts that are sufficiently similar that they can be used interchangeably in some information retrieval applications. In order to avoid the possibility of \"compound errors\" when combining mappings across more than two concept schemes, skos:closeMatch is not declared to be a transitive property.@en"})

(def definition
  "A statement or formal explanation of the meaning of a concept."
  {:db/ident :skos/definition,
   :db/cardinality :db.cardinality/many,
   :db/valueType :db.type/string,
   :rdf/type [:rdf/Property :owl/AnnotationProperty],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "definition@en",
   :rdfs/subPropertyOf :skos/note,
   :skos/definition
   #voc/lstr
    "A statement or formal explanation of the meaning of a concept.@en",
   :skos/note
   #voc/lstr
    "A statement or formal explanation of the meaning of a concept.@en"})

(def editorialNote
  "A note for an editor, translator or maintainer of the vocabulary."
  {:db/ident :skos/editorialNote,
   :rdf/type [:rdf/Property :owl/AnnotationProperty],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "editorial note@en",
   :rdfs/subPropertyOf :skos/note,
   :skos/definition
   #voc/lstr
    "A note for an editor, translator or maintainer of the vocabulary.@en",
   :skos/note
   #voc/lstr
    "A note for an editor, translator or maintainer of the vocabulary.@en"})

(def exactMatch
  "skos:exactMatch is used to link two concepts, indicating a high degree of confidence that the concepts can be used interchangeably across a wide range of information retrieval applications. skos:exactMatch is a transitive property, and is a sub-property of skos:closeMatch."
  {:db/ident :skos/exactMatch,
   :rdf/type [:rdf/Property
              :owl/TransitiveProperty
              :owl/SymmetricProperty
              :owl/ObjectProperty],
   :rdfs/comment
   #voc/lstr
    "skos:exactMatch is disjoint with each of the properties skos:broadMatch and skos:relatedMatch.@en",
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "has exact match@en",
   :rdfs/subPropertyOf
   [:skos/closeMatch :skos/mappingRelation :skos/semanticRelation],
   :skos/definition
   #voc/lstr
    "skos:exactMatch is used to link two concepts, indicating a high degree of confidence that the concepts can be used interchangeably across a wide range of information retrieval applications. skos:exactMatch is a transitive property, and is a sub-property of skos:closeMatch.@en",
   :skos/note
   #voc/lstr
    "skos:exactMatch is used to link two concepts, indicating a high degree of confidence that the concepts can be used interchangeably across a wide range of information retrieval applications. skos:exactMatch is a transitive property, and is a sub-property of skos:closeMatch.@en"})

(def example
  "An example of the use of a concept."
  {:db/ident           :skos/example,
   :db/cardinality :db.cardinality/many,
   :db/valueType :db.type/string,
   :rdf/type           [:rdf/Property :owl/AnnotationProperty],
   :rdfs/isDefinedBy   "http://www.w3.org/2004/02/skos/core",
   :rdfs/label         #voc/lstr "example@en",
   :rdfs/subPropertyOf :skos/note,
   :skos/definition    #voc/lstr "An example of the use of a concept.@en",
   :skos/note          #voc/lstr "An example of the use of a concept.@en"})

(def hasTopConcept
  "Relates, by convention, a concept scheme to a concept which is topmost in the broader/narrower concept hierarchies for that scheme, providing an entry point to these hierarchies."
  {:db/ident :skos/hasTopConcept,
   :db/cardinality :db.cardinality/many,
   :db/valueType :db.type/ref,
   :owl/inverseOf :skos/topConceptOf,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :skos/ConceptScheme,
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "has top concept@en",
   :rdfs/range :skos/Concept,
   :skos/definition
   #voc/lstr
    "Relates, by convention, a concept scheme to a concept which is topmost in the broader/narrower concept hierarchies for that scheme, providing an entry point to these hierarchies.@en",
   :skos/note
   #voc/lstr
    "Relates, by convention, a concept scheme to a concept which is topmost in the broader/narrower concept hierarchies for that scheme, providing an entry point to these hierarchies.@en"})

(def hiddenLabel
  "A lexical label for a resource that should be hidden when generating visual displays of the resource, but should still be accessible to free text search operations."
  {:db/ident :skos/hiddenLabel,
   :db/cardinality :db.cardinality/many,
   :db/valueType :db.type/string,
   :rdf/type [:rdf/Property :owl/AnnotationProperty],
   :rdfs/comment
   [#voc/lstr
     "skos:prefLabel, skos:altLabel and skos:hiddenLabel are pairwise disjoint properties.@en"
    #voc/lstr
     "The range of skos:hiddenLabel is the class of RDF plain literals.@en"],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "hidden label@en",
   :rdfs/subPropertyOf :rdfs/label,
   :skos/definition
   #voc/lstr
    "A lexical label for a resource that should be hidden when generating visual displays of the resource, but should still be accessible to free text search operations.@en",
   :skos/note
   #voc/lstr
    "A lexical label for a resource that should be hidden when generating visual displays of the resource, but should still be accessible to free text search operations.@en"})

(def historyNote
  "A note about the past state/use/meaning of a concept."
  {:db/ident :skos/historyNote,
   :rdf/type [:rdf/Property :owl/AnnotationProperty],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "history note@en",
   :rdfs/subPropertyOf :skos/note,
   :skos/definition #voc/lstr
                     "A note about the past state/use/meaning of a concept.@en",
   :skos/note #voc/lstr
               "A note about the past state/use/meaning of a concept.@en"})

(def inScheme
  "Relates a resource (for example a concept) to a concept scheme in which it is included."
  {:db/ident :skos/inScheme,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "is in scheme@en",
   :rdfs/range :skos/ConceptScheme,
   :skos/definition
   #voc/lstr
    "Relates a resource (for example a concept) to a concept scheme in which it is included.@en",
   :skos/note
   [#voc/lstr
     "Relates a resource (for example a concept) to a concept scheme in which it is included.@en"
    #voc/lstr "A concept may be a member of more than one concept scheme.@en"],
   :skos/scopeNote
   #voc/lstr "A concept may be a member of more than one concept scheme.@en"})

(def mappingRelation
  "Relates two concepts coming, by convention, from different schemes, and that have comparable meanings"
  {:db/ident :skos/mappingRelation,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #voc/lstr
    "These concept mapping relations mirror semantic relations, and the data model defined below is similar (with the exception of skos:exactMatch) to the data model defined for semantic relations. A distinct vocabulary is provided for concept mapping relations, to provide a convenient way to differentiate links within a concept scheme from links between concept schemes. However, this pattern of usage is not a formal requirement of the SKOS data model, and relies on informal definitions of best practice.@en",
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "is in mapping relation with@en",
   :rdfs/subPropertyOf :skos/semanticRelation,
   :skos/definition
   #voc/lstr
    "Relates two concepts coming, by convention, from different schemes, and that have comparable meanings@en",
   :skos/note
   #voc/lstr
    "Relates two concepts coming, by convention, from different schemes, and that have comparable meanings@en"})

(def member
  "Relates a collection to one of its members."
  {:db/ident         :skos/member,
   :db/cardinality :db.cardinality/many,
   :db/valueType :db.type/ref,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain      :skos/Collection,
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label       #voc/lstr "has member@en",
   :rdfs/range       {:owl/unionOf [:skos/Concept :skos/Collection],
                      :rdf/type    :owl/Class},
   :skos/definition  #voc/lstr "Relates a collection to one of its members.@en",
   :skos/note        #voc/lstr
                      "Relates a collection to one of its members.@en"})

(def memberList
  "Relates an ordered collection to the RDF list containing its members."
  {:db/ident :skos/memberList,
   :rdf/type [:rdf/Property :owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment
   #voc/lstr
    "For any resource, every item in the list given as the value of the\n      skos:memberList property is also a value of the skos:member property.@en",
   :rdfs/domain :skos/OrderedCollection,
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "has member list@en",
   :rdfs/range :rdf/List,
   :skos/definition
   #voc/lstr
    "Relates an ordered collection to the RDF list containing its members.@en",
   :skos/note
   #voc/lstr
    "Relates an ordered collection to the RDF list containing its members.@en"})

(def narrowMatch
  "skos:narrowMatch is used to state a hierarchical mapping link between two conceptual resources in different concept schemes."
  {:db/ident :skos/narrowMatch,
   :owl/inverseOf :skos/broadMatch,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "has narrower match@en",
   :rdfs/subPropertyOf [:skos/narrower
                        :skos/mappingRelation
                        :skos/narrowerTransitive
                        :skos/semanticRelation],
   :skos/definition
   #voc/lstr
    "skos:narrowMatch is used to state a hierarchical mapping link between two conceptual resources in different concept schemes.@en",
   :skos/note
   #voc/lstr
    "skos:narrowMatch is used to state a hierarchical mapping link between two conceptual resources in different concept schemes.@en"})

(def narrower
  "Relates a concept to a concept that is more specific in meaning."
  {:db/ident :skos/narrower,
   :db/cardinality :db.cardinality/many,
   :db/valueType :db.type/ref,
   :owl/inverseOf :skos/broader,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #voc/lstr
    "Narrower concepts are typically rendered as children in a concept hierarchy (tree).@en",
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "has narrower@en",
   :rdfs/subPropertyOf [:skos/narrowerTransitive :skos/semanticRelation],
   :skos/definition
   #voc/lstr
    "Relates a concept to a concept that is more specific in meaning.@en",
   :skos/note
   [#voc/lstr
     "Relates a concept to a concept that is more specific in meaning.@en"
    #voc/lstr
     "By convention, skos:broader is only used to assert an immediate (i.e. direct) hierarchical link between two conceptual resources.@en"],
   :skos/scopeNote
   #voc/lstr
    "By convention, skos:broader is only used to assert an immediate (i.e. direct) hierarchical link between two conceptual resources.@en"})

(def narrowerTransitive
  "skos:narrowerTransitive is a transitive superproperty of skos:narrower."
  {:db/ident :skos/narrowerTransitive,
   :owl/inverseOf :skos/broaderTransitive,
   :rdf/type [:rdf/Property :owl/TransitiveProperty :owl/ObjectProperty],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "has narrower transitive@en",
   :rdfs/subPropertyOf :skos/semanticRelation,
   :skos/definition
   "skos:narrowerTransitive is a transitive superproperty of skos:narrower.",
   :skos/note
   ["skos:narrowerTransitive is a transitive superproperty of skos:narrower."
    #voc/lstr
     "By convention, skos:narrowerTransitive is not used to make assertions. Rather, the properties can be used to draw inferences about the transitive closure of the hierarchical relation, which is useful e.g. when implementing a simple query expansion algorithm in a search application.@en"],
   :skos/scopeNote
   #voc/lstr
    "By convention, skos:narrowerTransitive is not used to make assertions. Rather, the properties can be used to draw inferences about the transitive closure of the hierarchical relation, which is useful e.g. when implementing a simple query expansion algorithm in a search application.@en"})

(def notation
  "A notation, also known as classification code, is a string of characters such as \"T58.5\" or \"303.4833\" used to uniquely identify a concept within the scope of a given concept scheme."
  {:db/ident :skos/notation,
   :db/cardinality :db.cardinality/one,
   :db/valueType :db.type/string,
   :db/unique :db.unique/identity
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "notation@en",
   :skos/definition
   #voc/lstr
    "A notation, also known as classification code, is a string of characters such as \"T58.5\" or \"303.4833\" used to uniquely identify a concept within the scope of a given concept scheme.@en",
   :skos/note
   [#voc/lstr
     "A notation, also known as classification code, is a string of characters such as \"T58.5\" or \"303.4833\" used to uniquely identify a concept within the scope of a given concept scheme.@en"
    #voc/lstr
     "By convention, skos:notation is used with a typed literal in the object position of the triple.@en"],
   :skos/scopeNote
   #voc/lstr
    "By convention, skos:notation is used with a typed literal in the object position of the triple.@en"})

(def note
  "A general note, for any purpose."
  {:db/ident         :skos/note,
   :rdf/type         [:rdf/Property :owl/AnnotationProperty],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label       #voc/lstr "note@en",
   :skos/definition  #voc/lstr "A general note, for any purpose.@en",
   :skos/note
   [#voc/lstr "A general note, for any purpose.@en"
    #voc/lstr
    "This property may be used directly, or as a super-property for more specific note types.@en"],
   :skos/scopeNote
   #voc/lstr
   "This property may be used directly, or as a super-property for more specific note types.@en"})

(def prefLabel
  "The preferred lexical label for a resource, in a given language."
  {:db/ident :skos/prefLabel,
   :db/cardinality :db.cardinality/many,
   :db/valueType :db.type/string,
   :rdf/type [:rdf/Property :owl/AnnotationProperty],
   :rdfs/comment
   [#voc/lstr
     "skos:prefLabel, skos:altLabel and skos:hiddenLabel are pairwise\n      disjoint properties.@en"
    #voc/lstr
     "The range of skos:prefLabel is the class of RDF plain literals.@en"
    #voc/lstr
     "A resource has no more than one value of skos:prefLabel per language tag, and no more than one value of skos:prefLabel without language tag.@en"],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "preferred label@en",
   :rdfs/subPropertyOf :rdfs/label,
   :skos/definition
   #voc/lstr
    "The preferred lexical label for a resource, in a given language.@en",
   :skos/note
   #voc/lstr
    "The preferred lexical label for a resource, in a given language.@en"})

(def related
  "Relates a concept to a concept with which there is an associative semantic relationship."
  {:db/ident :skos/related,
   :db/cardinality :db.cardinality/many,
   :db/valueType :db.type/ref,
   :rdf/type [:rdf/Property :owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/comment #voc/lstr
                  "skos:related is disjoint with skos:broaderTransitive@en",
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "has related@en",
   :rdfs/subPropertyOf :skos/semanticRelation,
   :skos/definition
   #voc/lstr
    "Relates a concept to a concept with which there is an associative semantic relationship.@en",
   :skos/note
   #voc/lstr
    "Relates a concept to a concept with which there is an associative semantic relationship.@en"})

(def relatedMatch
  "skos:relatedMatch is used to state an associative mapping link between two conceptual resources in different concept schemes."
  {:db/ident :skos/relatedMatch,
   :rdf/type [:rdf/Property :owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "has related match@en",
   :rdfs/subPropertyOf
   [:skos/related :skos/mappingRelation :skos/semanticRelation],
   :skos/definition
   #voc/lstr
    "skos:relatedMatch is used to state an associative mapping link between two conceptual resources in different concept schemes.@en",
   :skos/note
   #voc/lstr
    "skos:relatedMatch is used to state an associative mapping link between two conceptual resources in different concept schemes.@en"})

(def scopeNote
  "A note that helps to clarify the meaning and/or the use of a concept."
  {:db/ident :skos/scopeNote,
   :rdf/type [:rdf/Property :owl/AnnotationProperty],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "scope note@en",
   :rdfs/subPropertyOf :skos/note,
   :skos/definition
   #voc/lstr
    "A note that helps to clarify the meaning and/or the use of a concept.@en",
   :skos/note
   #voc/lstr
    "A note that helps to clarify the meaning and/or the use of a concept.@en"})

(def semanticRelation
  "Links a concept to a concept related by meaning."
  {:db/ident :skos/semanticRelation,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :skos/Concept,
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "is in semantic relation with@en",
   :rdfs/range :skos/Concept,
   :skos/definition #voc/lstr
                     "Links a concept to a concept related by meaning.@en",
   :skos/note
   [#voc/lstr "Links a concept to a concept related by meaning.@en"
    #voc/lstr
     "This property should not be used directly, but as a super-property for all properties denoting a relationship of meaning between concepts.@en"],
   :skos/scopeNote
   #voc/lstr
    "This property should not be used directly, but as a super-property for all properties denoting a relationship of meaning between concepts.@en"})

(def topConceptOf
  "Relates a concept to the concept scheme that it is a top level concept of."
  {:db/ident :skos/topConceptOf,
   :db/cardinality :db.cardinality/many,
   :db/valueType :db.type/ref,
   :owl/inverseOf :skos/hasTopConcept,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :skos/Concept,
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label #voc/lstr "is top concept in scheme@en",
   :rdfs/range :skos/ConceptScheme,
   :rdfs/subPropertyOf :skos/inScheme,
   :skos/definition
   #voc/lstr
    "Relates a concept to the concept scheme that it is a top level concept of.@en",
   :skos/note
   #voc/lstr
    "Relates a concept to the concept scheme that it is a top level concept of.@en"})
