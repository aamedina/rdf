(ns net.wikipunk.rdf.skos
  {:dcterms/contributor
   [#xsd/string "Participants in W3C's Semantic Web Deployment Working Group."
    #xsd/string "Nikki Rogers"
    #xsd/string "Dave Beckett"],
   :dcterms/creator [#xsd/string "Sean Bechhofer" #xsd/string "Alistair Miles"],
   :dcterms/description
   #xsd/langString
    "An RDF vocabulary for describing the basic structure and content of concept schemes such as thesauri, classification schemes, subject heading lists, taxonomies, 'folksonomies', other types of controlled vocabulary, and also concept schemes embedded in glossaries and terminologies.@en",
   :dcterms/title #xsd/langString "SKOS Vocabulary@en",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "skos",
   :rdfa/uri "http://www.w3.org/2004/02/skos/core",
   :rdfs/isDefinedBy {:rdfa/uri
                      "http://www.w3.org/TR/2009/REC-skos-reference-20090818/"},
   :rdfs/seeAlso {:rdfa/uri "http://www.w3.org/TR/skos-reference/"}})

(def Collection
  {:db/ident :skos/Collection,
   :owl/disjointWith [:skos/ConceptScheme :skos/Concept],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "Collection@en",
   :skos/definition #xsd/langString "A meaningful collection of concepts.@en",
   :skos/note
   [#xsd/langString "A meaningful collection of concepts.@en"
    #xsd/langString
     "Labelled collections can be used where you would like a set of concepts to be displayed under a 'node label' in the hierarchy.@en"],
   :skos/scopeNote
   #xsd/langString
    "Labelled collections can be used where you would like a set of concepts to be displayed under a 'node label' in the hierarchy.@en"})

(def Concept
  {:db/ident         :skos/Concept,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label       #xsd/langString "Concept@en",
   :skos/definition  #xsd/langString "An idea or notion; a unit of thought.@en",
   :skos/note        #xsd/langString
                      "An idea or notion; a unit of thought.@en"})

(def ConceptScheme
  {:db/ident :skos/ConceptScheme,
   :owl/disjointWith :skos/Concept,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "Concept Scheme@en",
   :skos/definition
   #xsd/langString
    "A set of concepts, optionally including statements about semantic relationships between those concepts.@en",
   :skos/example
   #xsd/langString
    "Thesauri, classification schemes, subject heading lists, taxonomies, 'folksonomies', and other types of controlled vocabulary are all examples of concept schemes. Concept schemes are also embedded in glossaries and terminologies.@en",
   :skos/note
   [#xsd/langString
     "A set of concepts, optionally including statements about semantic relationships between those concepts.@en"
    #xsd/langString
     "A concept scheme may be defined to include concepts from different sources.@en"
    #xsd/langString
     "Thesauri, classification schemes, subject heading lists, taxonomies, 'folksonomies', and other types of controlled vocabulary are all examples of concept schemes. Concept schemes are also embedded in glossaries and terminologies.@en"],
   :skos/scopeNote
   #xsd/langString
    "A concept scheme may be defined to include concepts from different sources.@en"})

(def OrderedCollection
  {:db/ident :skos/OrderedCollection,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "Ordered Collection@en",
   :rdfs/subClassOf :skos/Collection,
   :skos/definition
   #xsd/langString
    "An ordered collection of concepts, where both the grouping and the ordering are meaningful.@en",
   :skos/note
   [#xsd/langString
     "An ordered collection of concepts, where both the grouping and the ordering are meaningful.@en"
    #xsd/langString
     "Ordered collections can be used where you would like a set of concepts to be displayed in a specific order, and optionally under a 'node label'.@en"],
   :skos/scopeNote
   #xsd/langString
    "Ordered collections can be used where you would like a set of concepts to be displayed in a specific order, and optionally under a 'node label'.@en"})

(def altLabel
  {:db/ident :skos/altLabel,
   :rdf/type [:rdf/Property :owl/AnnotationProperty],
   :rdfs/comment
   [#xsd/langString
     "skos:prefLabel, skos:altLabel and skos:hiddenLabel are pairwise disjoint properties.@en"
    #xsd/langString
     "The range of skos:altLabel is the class of RDF plain literals.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "alternative label@en",
   :rdfs/subPropertyOf :rdfs/label,
   :skos/definition #xsd/langString
                     "An alternative lexical label for a resource.@en",
   :skos/example
   #xsd/langString
    "Acronyms, abbreviations, spelling variants, and irregular plural/singular forms may be included among the alternative labels for a concept. Mis-spelled terms are normally included as hidden labels (see skos:hiddenLabel).@en",
   :skos/note
   [#xsd/langString "An alternative lexical label for a resource.@en"
    #xsd/langString
     "Acronyms, abbreviations, spelling variants, and irregular plural/singular forms may be included among the alternative labels for a concept. Mis-spelled terms are normally included as hidden labels (see skos:hiddenLabel).@en"]})

(def broadMatch
  {:db/ident :skos/broadMatch,
   :owl/inverseOf :skos/narrowMatch,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "has broader match@en",
   :rdfs/subPropertyOf [:skos/broader
                        :skos/mappingRelation
                        :skos/broaderTransitive
                        :skos/semanticRelation],
   :skos/definition
   #xsd/langString
    "skos:broadMatch is used to state a hierarchical mapping link between two conceptual resources in different concept schemes.@en",
   :skos/note
   #xsd/langString
    "skos:broadMatch is used to state a hierarchical mapping link between two conceptual resources in different concept schemes.@en"})

(def broader
  {:db/ident :skos/broader,
   :owl/inverseOf :skos/narrower,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #xsd/langString
    "Broader concepts are typically rendered as parents in a concept hierarchy (tree).@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "has broader@en",
   :rdfs/subPropertyOf [:skos/broaderTransitive :skos/semanticRelation],
   :skos/definition
   #xsd/langString
    "Relates a concept to a concept that is more general in meaning.@en",
   :skos/note
   [#xsd/langString
     "Relates a concept to a concept that is more general in meaning.@en"
    #xsd/langString
     "By convention, skos:broader is only used to assert an immediate (i.e. direct) hierarchical link between two conceptual resources.@en"],
   :skos/scopeNote
   #xsd/langString
    "By convention, skos:broader is only used to assert an immediate (i.e. direct) hierarchical link between two conceptual resources.@en"})

(def broaderTransitive
  {:db/ident :skos/broaderTransitive,
   :owl/inverseOf :skos/narrowerTransitive,
   :rdf/type [:rdf/Property :owl/TransitiveProperty :owl/ObjectProperty],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "has broader transitive@en",
   :rdfs/subPropertyOf :skos/semanticRelation,
   :skos/definition
   #xsd/string
    "skos:broaderTransitive is a transitive superproperty of skos:broader.",
   :skos/note
   [#xsd/string
     "skos:broaderTransitive is a transitive superproperty of skos:broader."
    #xsd/langString
     "By convention, skos:broaderTransitive is not used to make assertions. Rather, the properties can be used to draw inferences about the transitive closure of the hierarchical relation, which is useful e.g. when implementing a simple query expansion algorithm in a search application.@en"],
   :skos/scopeNote
   #xsd/langString
    "By convention, skos:broaderTransitive is not used to make assertions. Rather, the properties can be used to draw inferences about the transitive closure of the hierarchical relation, which is useful e.g. when implementing a simple query expansion algorithm in a search application.@en"})

(def changeNote
  {:db/ident           :skos/changeNote,
   :rdf/type           [:rdf/Property :owl/AnnotationProperty],
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label         #xsd/langString "change note@en",
   :rdfs/subPropertyOf :skos/note,
   :skos/definition    #xsd/langString
                        "A note about a modification to a concept.@en",
   :skos/note          #xsd/langString
                        "A note about a modification to a concept.@en"})

(def closeMatch
  {:db/ident :skos/closeMatch,
   :rdf/type [:rdf/Property :owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "has close match@en",
   :rdfs/subPropertyOf [:skos/mappingRelation :skos/semanticRelation],
   :skos/definition
   #xsd/langString
    "skos:closeMatch is used to link two concepts that are sufficiently similar that they can be used interchangeably in some information retrieval applications. In order to avoid the possibility of \"compound errors\" when combining mappings across more than two concept schemes, skos:closeMatch is not declared to be a transitive property.@en",
   :skos/note
   #xsd/langString
    "skos:closeMatch is used to link two concepts that are sufficiently similar that they can be used interchangeably in some information retrieval applications. In order to avoid the possibility of \"compound errors\" when combining mappings across more than two concept schemes, skos:closeMatch is not declared to be a transitive property.@en"})

(def definition
  {:db/ident :skos/definition,
   :rdf/type [:rdf/Property :owl/AnnotationProperty],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "definition@en",
   :rdfs/subPropertyOf :skos/note,
   :skos/definition
   #xsd/langString
    "A statement or formal explanation of the meaning of a concept.@en",
   :skos/note
   #xsd/langString
    "A statement or formal explanation of the meaning of a concept.@en"})

(def editorialNote
  {:db/ident :skos/editorialNote,
   :rdf/type [:rdf/Property :owl/AnnotationProperty],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "editorial note@en",
   :rdfs/subPropertyOf :skos/note,
   :skos/definition
   #xsd/langString
    "A note for an editor, translator or maintainer of the vocabulary.@en",
   :skos/note
   #xsd/langString
    "A note for an editor, translator or maintainer of the vocabulary.@en"})

(def exactMatch
  {:db/ident :skos/exactMatch,
   :rdf/type [:rdf/Property
              :owl/TransitiveProperty
              :owl/SymmetricProperty
              :owl/ObjectProperty],
   :rdfs/comment
   #xsd/langString
    "skos:exactMatch is disjoint with each of the properties skos:broadMatch and skos:relatedMatch.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "has exact match@en",
   :rdfs/subPropertyOf
   [:skos/closeMatch :skos/semanticRelation :skos/mappingRelation],
   :skos/definition
   #xsd/langString
    "skos:exactMatch is used to link two concepts, indicating a high degree of confidence that the concepts can be used interchangeably across a wide range of information retrieval applications. skos:exactMatch is a transitive property, and is a sub-property of skos:closeMatch.@en",
   :skos/note
   #xsd/langString
    "skos:exactMatch is used to link two concepts, indicating a high degree of confidence that the concepts can be used interchangeably across a wide range of information retrieval applications. skos:exactMatch is a transitive property, and is a sub-property of skos:closeMatch.@en"})

(def example
  {:db/ident           :skos/example,
   :rdf/type           [:rdf/Property :owl/AnnotationProperty],
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label         #xsd/langString "example@en",
   :rdfs/subPropertyOf :skos/note,
   :skos/definition    #xsd/langString "An example of the use of a concept.@en",
   :skos/note          #xsd/langString
                        "An example of the use of a concept.@en"})

(def hasTopConcept
  {:db/ident :skos/hasTopConcept,
   :owl/inverseOf :skos/topConceptOf,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :skos/ConceptScheme,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "has top concept@en",
   :rdfs/range :skos/Concept,
   :skos/definition
   #xsd/langString
    "Relates, by convention, a concept scheme to a concept which is topmost in the broader/narrower concept hierarchies for that scheme, providing an entry point to these hierarchies.@en",
   :skos/note
   #xsd/langString
    "Relates, by convention, a concept scheme to a concept which is topmost in the broader/narrower concept hierarchies for that scheme, providing an entry point to these hierarchies.@en"})

(def hiddenLabel
  {:db/ident :skos/hiddenLabel,
   :rdf/type [:rdf/Property :owl/AnnotationProperty],
   :rdfs/comment
   [#xsd/langString
     "skos:prefLabel, skos:altLabel and skos:hiddenLabel are pairwise disjoint properties.@en"
    #xsd/langString
     "The range of skos:hiddenLabel is the class of RDF plain literals.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "hidden label@en",
   :rdfs/subPropertyOf :rdfs/label,
   :skos/definition
   #xsd/langString
    "A lexical label for a resource that should be hidden when generating visual displays of the resource, but should still be accessible to free text search operations.@en",
   :skos/note
   #xsd/langString
    "A lexical label for a resource that should be hidden when generating visual displays of the resource, but should still be accessible to free text search operations.@en"})

(def historyNote
  {:db/ident :skos/historyNote,
   :rdf/type [:rdf/Property :owl/AnnotationProperty],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "history note@en",
   :rdfs/subPropertyOf :skos/note,
   :skos/definition #xsd/langString
                     "A note about the past state/use/meaning of a concept.@en",
   :skos/note #xsd/langString
               "A note about the past state/use/meaning of a concept.@en"})

(def inScheme
  {:db/ident :skos/inScheme,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "is in scheme@en",
   :rdfs/range :skos/ConceptScheme,
   :skos/definition
   #xsd/langString
    "Relates a resource (for example a concept) to a concept scheme in which it is included.@en",
   :skos/note
   [#xsd/langString
     "Relates a resource (for example a concept) to a concept scheme in which it is included.@en"
    #xsd/langString
     "A concept may be a member of more than one concept scheme.@en"],
   :skos/scopeNote
   #xsd/langString
    "A concept may be a member of more than one concept scheme.@en"})

(def mappingRelation
  {:db/ident :skos/mappingRelation,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #xsd/langString
    "These concept mapping relations mirror semantic relations, and the data model defined below is similar (with the exception of skos:exactMatch) to the data model defined for semantic relations. A distinct vocabulary is provided for concept mapping relations, to provide a convenient way to differentiate links within a concept scheme from links between concept schemes. However, this pattern of usage is not a formal requirement of the SKOS data model, and relies on informal definitions of best practice.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "is in mapping relation with@en",
   :rdfs/subPropertyOf :skos/semanticRelation,
   :skos/definition
   #xsd/langString
    "Relates two concepts coming, by convention, from different schemes, and that have comparable meanings@en",
   :skos/note
   #xsd/langString
    "Relates two concepts coming, by convention, from different schemes, and that have comparable meanings@en"})

(def member
  {:db/ident         :skos/member,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain      :skos/Collection,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label       #xsd/langString "has member@en",
   :rdfs/range       {:owl/unionOf [:skos/Concept :skos/Collection],
                      :rdf/type    :owl/Class},
   :skos/definition  #xsd/langString
                      "Relates a collection to one of its members.@en",
   :skos/note        #xsd/langString
                      "Relates a collection to one of its members.@en"})

(def memberList
  {:db/ident :skos/memberList,
   :rdf/type [:rdf/Property :owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment
   #xsd/langString
    "For any resource, every item in the list given as the value of the\n      skos:memberList property is also a value of the skos:member property.@en",
   :rdfs/domain :skos/OrderedCollection,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "has member list@en",
   :rdfs/range :rdf/List,
   :skos/definition
   #xsd/langString
    "Relates an ordered collection to the RDF list containing its members.@en",
   :skos/note
   #xsd/langString
    "Relates an ordered collection to the RDF list containing its members.@en"})

(def narrowMatch
  {:db/ident :skos/narrowMatch,
   :owl/inverseOf :skos/broadMatch,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "has narrower match@en",
   :rdfs/subPropertyOf [:skos/narrower
                        :skos/mappingRelation
                        :skos/narrowerTransitive
                        :skos/semanticRelation],
   :skos/definition
   #xsd/langString
    "skos:narrowMatch is used to state a hierarchical mapping link between two conceptual resources in different concept schemes.@en",
   :skos/note
   #xsd/langString
    "skos:narrowMatch is used to state a hierarchical mapping link between two conceptual resources in different concept schemes.@en"})

(def narrower
  {:db/ident :skos/narrower,
   :owl/inverseOf :skos/broader,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #xsd/langString
    "Narrower concepts are typically rendered as children in a concept hierarchy (tree).@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "has narrower@en",
   :rdfs/subPropertyOf [:skos/narrowerTransitive :skos/semanticRelation],
   :skos/definition
   #xsd/langString
    "Relates a concept to a concept that is more specific in meaning.@en",
   :skos/note
   [#xsd/langString
     "Relates a concept to a concept that is more specific in meaning.@en"
    #xsd/langString
     "By convention, skos:broader is only used to assert an immediate (i.e. direct) hierarchical link between two conceptual resources.@en"],
   :skos/scopeNote
   #xsd/langString
    "By convention, skos:broader is only used to assert an immediate (i.e. direct) hierarchical link between two conceptual resources.@en"})

(def narrowerTransitive
  {:db/ident :skos/narrowerTransitive,
   :owl/inverseOf :skos/broaderTransitive,
   :rdf/type [:rdf/Property :owl/TransitiveProperty :owl/ObjectProperty],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "has narrower transitive@en",
   :rdfs/subPropertyOf :skos/semanticRelation,
   :skos/definition
   #xsd/string
    "skos:narrowerTransitive is a transitive superproperty of skos:narrower.",
   :skos/note
   [#xsd/string
     "skos:narrowerTransitive is a transitive superproperty of skos:narrower."
    #xsd/langString
     "By convention, skos:narrowerTransitive is not used to make assertions. Rather, the properties can be used to draw inferences about the transitive closure of the hierarchical relation, which is useful e.g. when implementing a simple query expansion algorithm in a search application.@en"],
   :skos/scopeNote
   #xsd/langString
    "By convention, skos:narrowerTransitive is not used to make assertions. Rather, the properties can be used to draw inferences about the transitive closure of the hierarchical relation, which is useful e.g. when implementing a simple query expansion algorithm in a search application.@en"})

(def notation
  {:db/ident :skos/notation,
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "notation@en",
   :skos/definition
   #xsd/langString
    "A notation, also known as classification code, is a string of characters such as \"T58.5\" or \"303.4833\" used to uniquely identify a concept within the scope of a given concept scheme.@en",
   :skos/note
   [#xsd/langString
     "A notation, also known as classification code, is a string of characters such as \"T58.5\" or \"303.4833\" used to uniquely identify a concept within the scope of a given concept scheme.@en"
    #xsd/langString
     "By convention, skos:notation is used with a typed literal in the object position of the triple.@en"],
   :skos/scopeNote
   #xsd/langString
    "By convention, skos:notation is used with a typed literal in the object position of the triple.@en"})

(def note
  {:db/ident :skos/note,
   :rdf/type [:rdf/Property :owl/AnnotationProperty],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "note@en",
   :skos/definition #xsd/langString "A general note, for any purpose.@en",
   :skos/note
   [#xsd/langString "A general note, for any purpose.@en"
    #xsd/langString
     "This property may be used directly, or as a super-property for more specific note types.@en"],
   :skos/scopeNote
   #xsd/langString
    "This property may be used directly, or as a super-property for more specific note types.@en"})

(def prefLabel
  {:db/ident :skos/prefLabel,
   :rdf/type [:rdf/Property :owl/AnnotationProperty],
   :rdfs/comment
   [#xsd/langString
     "skos:prefLabel, skos:altLabel and skos:hiddenLabel are pairwise\n      disjoint properties.@en"
    #xsd/langString
     "The range of skos:prefLabel is the class of RDF plain literals.@en"
    #xsd/langString
     "A resource has no more than one value of skos:prefLabel per language tag, and no more than one value of skos:prefLabel without language tag.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "preferred label@en",
   :rdfs/subPropertyOf :rdfs/label,
   :skos/definition
   #xsd/langString
    "The preferred lexical label for a resource, in a given language.@en",
   :skos/note
   #xsd/langString
    "The preferred lexical label for a resource, in a given language.@en"})

(def related
  {:db/ident :skos/related,
   :rdf/type [:rdf/Property :owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/comment #xsd/langString
                  "skos:related is disjoint with skos:broaderTransitive@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "has related@en",
   :rdfs/subPropertyOf :skos/semanticRelation,
   :skos/definition
   #xsd/langString
    "Relates a concept to a concept with which there is an associative semantic relationship.@en",
   :skos/note
   #xsd/langString
    "Relates a concept to a concept with which there is an associative semantic relationship.@en"})

(def relatedMatch
  {:db/ident :skos/relatedMatch,
   :rdf/type [:rdf/Property :owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "has related match@en",
   :rdfs/subPropertyOf
   [:skos/related :skos/mappingRelation :skos/semanticRelation],
   :skos/definition
   #xsd/langString
    "skos:relatedMatch is used to state an associative mapping link between two conceptual resources in different concept schemes.@en",
   :skos/note
   #xsd/langString
    "skos:relatedMatch is used to state an associative mapping link between two conceptual resources in different concept schemes.@en"})

(def scopeNote
  {:db/ident :skos/scopeNote,
   :rdf/type [:rdf/Property :owl/AnnotationProperty],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "scope note@en",
   :rdfs/subPropertyOf :skos/note,
   :skos/definition
   #xsd/langString
    "A note that helps to clarify the meaning and/or the use of a concept.@en",
   :skos/note
   #xsd/langString
    "A note that helps to clarify the meaning and/or the use of a concept.@en"})

(def semanticRelation
  {:db/ident :skos/semanticRelation,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :skos/Concept,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "is in semantic relation with@en",
   :rdfs/range :skos/Concept,
   :skos/definition #xsd/langString
                     "Links a concept to a concept related by meaning.@en",
   :skos/note
   [#xsd/langString "Links a concept to a concept related by meaning.@en"
    #xsd/langString
     "This property should not be used directly, but as a super-property for all properties denoting a relationship of meaning between concepts.@en"],
   :skos/scopeNote
   #xsd/langString
    "This property should not be used directly, but as a super-property for all properties denoting a relationship of meaning between concepts.@en"})

(def topConceptOf
  {:db/ident :skos/topConceptOf,
   :owl/inverseOf :skos/hasTopConcept,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :skos/Concept,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2004/02/skos/core"},
   :rdfs/label #xsd/langString "is top concept in scheme@en",
   :rdfs/range :skos/ConceptScheme,
   :rdfs/subPropertyOf :skos/inScheme,
   :skos/definition
   #xsd/langString
    "Relates a concept to the concept scheme that it is a top level concept of.@en",
   :skos/note
   #xsd/langString
    "Relates a concept to the concept scheme that it is a top level concept of.@en"})