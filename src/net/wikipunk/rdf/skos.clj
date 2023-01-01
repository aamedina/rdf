(ns net.wikipunk.rdf.skos
  "An RDF vocabulary for describing the basic structure and content of concept schemes such as thesauri, classification schemes, subject heading lists, taxonomies, 'folksonomies', other types of controlled vocabulary, and also concept schemes embedded in glossaries and terminologies."
  {:dcterms/contributor
   ["Participants in W3C's Semantic Web Deployment Working Group."
    "Nikki Rogers"
    "Dave Beckett"],
   :dcterms/creator ["Sean Bechhofer" "Alistair Miles"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An RDF vocabulary for describing the basic structure and content of concept schemes such as thesauri, classification schemes, subject heading lists, taxonomies, 'folksonomies', other types of controlled vocabulary, and also concept schemes embedded in glossaries and terminologies."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "SKOS Vocabulary"},
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "skos",
   :rdfa/uri "http://www.w3.org/2004/02/skos/core#",
   :rdfs/isDefinedBy {:rdf/uri
                      "http://www.w3.org/TR/2009/REC-skos-reference-20090818/"},
   :rdfs/seeAlso "http://www.w3.org/TR/skos-reference/"})

(def Collection
  "A meaningful collection of concepts."
  {:db/ident :skos/Collection,
   :owl/disjointWith [:skos/ConceptScheme :skos/Concept],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Collection"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A meaningful collection of concepts."},
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Labelled collections can be used where you would like a set of concepts to be displayed under a 'node label' in the hierarchy."}})

(def Concept
  "An idea or notion; a unit of thought."
  {:db/ident         :skos/Concept,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Concept"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value    "An idea or notion; a unit of thought."}})

(def ConceptScheme
  "A set of concepts, optionally including statements about semantic relationships between those concepts."
  {:db/ident :skos/ConceptScheme,
   :owl/disjointWith :skos/Concept,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Concept Scheme"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A set of concepts, optionally including statements about semantic relationships between those concepts."},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Thesauri, classification schemes, subject heading lists, taxonomies, 'folksonomies', and other types of controlled vocabulary are all examples of concept schemes. Concept schemes are also embedded in glossaries and terminologies."},
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "A concept scheme may be defined to include concepts from different sources."}})

(def OrderedCollection
  "An ordered collection of concepts, where both the grouping and the ordering are meaningful."
  {:db/ident :skos/OrderedCollection,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ordered Collection"},
   :rdfs/subClassOf :skos/Collection,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An ordered collection of concepts, where both the grouping and the ordering are meaningful."},
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Ordered collections can be used where you would like a set of concepts to be displayed in a specific order, and optionally under a 'node label'."}})

(def altLabel
  "An alternative lexical label for a resource."
  {:db/ident :skos/altLabel,
   :rdf/type [:rdf/Property :owl/AnnotationProperty],
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "skos:prefLabel, skos:altLabel and skos:hiddenLabel are pairwise disjoint properties."}
    {:rdf/language "en",
     :rdf/value
     "The range of skos:altLabel is the class of RDF plain literals."}],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "alternative label"},
   :rdfs/subPropertyOf :rdfs/label,
   :skos/definition {:rdf/language "en",
                     :rdf/value "An alternative lexical label for a resource."},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Acronyms, abbreviations, spelling variants, and irregular plural/singular forms may be included among the alternative labels for a concept. Mis-spelled terms are normally included as hidden labels (see skos:hiddenLabel)."}})

(def broadMatch
  "skos:broadMatch is used to state a hierarchical mapping link between two conceptual resources in different concept schemes."
  {:db/ident :skos/broadMatch,
   :owl/inverseOf :skos/narrowMatch,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has broader match"},
   :rdfs/subPropertyOf [:skos/broader :skos/mappingRelation],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "skos:broadMatch is used to state a hierarchical mapping link between two conceptual resources in different concept schemes."}})

(def broader
  "Relates a concept to a concept that is more general in meaning."
  {:db/ident :skos/broader,
   :owl/inverseOf :skos/narrower,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Broader concepts are typically rendered as parents in a concept hierarchy (tree)."},
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has broader"},
   :rdfs/subPropertyOf :skos/broaderTransitive,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relates a concept to a concept that is more general in meaning."},
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "By convention, skos:broader is only used to assert an immediate (i.e. direct) hierarchical link between two conceptual resources."}})

(def broaderTransitive
  "skos:broaderTransitive is a transitive superproperty of skos:broader."
  {:db/ident :skos/broaderTransitive,
   :owl/inverseOf :skos/narrowerTransitive,
   :rdf/type [:rdf/Property :owl/TransitiveProperty :owl/ObjectProperty],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has broader transitive"},
   :rdfs/subPropertyOf :skos/semanticRelation,
   :skos/definition
   "skos:broaderTransitive is a transitive superproperty of skos:broader.",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "By convention, skos:broaderTransitive is not used to make assertions. Rather, the properties can be used to draw inferences about the transitive closure of the hierarchical relation, which is useful e.g. when implementing a simple query expansion algorithm in a search application."}})

(def changeNote
  "A note about a modification to a concept."
  {:db/ident           :skos/changeNote,
   :rdf/type           [:rdf/Property :owl/AnnotationProperty],
   :rdfs/isDefinedBy   "http://www.w3.org/2004/02/skos/core",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "change note"},
   :rdfs/subPropertyOf :skos/note,
   :skos/definition    {:rdf/language "en",
                        :rdf/value
                        "A note about a modification to a concept."}})

(def closeMatch
  "skos:closeMatch is used to link two concepts that are sufficiently similar that they can be used interchangeably in some information retrieval applications. In order to avoid the possibility of \"compound errors\" when combining mappings across more than two concept schemes, skos:closeMatch is not declared to be a transitive property."
  {:db/ident :skos/closeMatch,
   :rdf/type [:rdf/Property :owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has close match"},
   :rdfs/subPropertyOf :skos/mappingRelation,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "skos:closeMatch is used to link two concepts that are sufficiently similar that they can be used interchangeably in some information retrieval applications. In order to avoid the possibility of \"compound errors\" when combining mappings across more than two concept schemes, skos:closeMatch is not declared to be a transitive property."}})

(def definition
  "A statement or formal explanation of the meaning of a concept."
  {:db/ident :skos/definition,
   :rdf/type [:rdf/Property :owl/AnnotationProperty],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "definition"},
   :rdfs/subPropertyOf :skos/note,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A statement or formal explanation of the meaning of a concept."}})

(def editorialNote
  "A note for an editor, translator or maintainer of the vocabulary."
  {:db/ident :skos/editorialNote,
   :rdf/type [:rdf/Property :owl/AnnotationProperty],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "editorial note"},
   :rdfs/subPropertyOf :skos/note,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A note for an editor, translator or maintainer of the vocabulary."}})

(def exactMatch
  "skos:exactMatch is used to link two concepts, indicating a high degree of confidence that the concepts can be used interchangeably across a wide range of information retrieval applications. skos:exactMatch is a transitive property, and is a sub-property of skos:closeMatch."
  {:db/ident :skos/exactMatch,
   :rdf/type [:rdf/Property
              :owl/TransitiveProperty
              :owl/SymmetricProperty
              :owl/ObjectProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "skos:exactMatch is disjoint with each of the properties skos:broadMatch and skos:relatedMatch."},
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has exact match"},
   :rdfs/subPropertyOf :skos/closeMatch,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "skos:exactMatch is used to link two concepts, indicating a high degree of confidence that the concepts can be used interchangeably across a wide range of information retrieval applications. skos:exactMatch is a transitive property, and is a sub-property of skos:closeMatch."}})

(def example
  "An example of the use of a concept."
  {:db/ident           :skos/example,
   :rdf/type           [:rdf/Property :owl/AnnotationProperty],
   :rdfs/isDefinedBy   "http://www.w3.org/2004/02/skos/core",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "example"},
   :rdfs/subPropertyOf :skos/note,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "An example of the use of a concept."}})

(def hasTopConcept
  "Relates, by convention, a concept scheme to a concept which is topmost in the broader/narrower concept hierarchies for that scheme, providing an entry point to these hierarchies."
  {:db/ident :skos/hasTopConcept,
   :owl/inverseOf :skos/topConceptOf,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :skos/ConceptScheme,
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has top concept"},
   :rdfs/range :skos/Concept,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relates, by convention, a concept scheme to a concept which is topmost in the broader/narrower concept hierarchies for that scheme, providing an entry point to these hierarchies."}})

(def hiddenLabel
  "A lexical label for a resource that should be hidden when generating visual displays of the resource, but should still be accessible to free text search operations."
  {:db/ident :skos/hiddenLabel,
   :rdf/type [:rdf/Property :owl/AnnotationProperty],
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "skos:prefLabel, skos:altLabel and skos:hiddenLabel are pairwise disjoint properties."}
    {:rdf/language "en",
     :rdf/value
     "The range of skos:hiddenLabel is the class of RDF plain literals."}],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "hidden label"},
   :rdfs/subPropertyOf :rdfs/label,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A lexical label for a resource that should be hidden when generating visual displays of the resource, but should still be accessible to free text search operations."}})

(def historyNote
  "A note about the past state/use/meaning of a concept."
  {:db/ident :skos/historyNote,
   :rdf/type [:rdf/Property :owl/AnnotationProperty],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "history note"},
   :rdfs/subPropertyOf :skos/note,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A note about the past state/use/meaning of a concept."}})

(def inScheme
  "Relates a resource (for example a concept) to a concept scheme in which it is included."
  {:db/ident :skos/inScheme,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is in scheme"},
   :rdfs/range :skos/ConceptScheme,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relates a resource (for example a concept) to a concept scheme in which it is included."},
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value "A concept may be a member of more than one concept scheme."}})

(def mappingRelation
  "Relates two concepts coming, by convention, from different schemes, and that have comparable meanings"
  {:db/ident :skos/mappingRelation,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "These concept mapping relations mirror semantic relations, and the data model defined below is similar (with the exception of skos:exactMatch) to the data model defined for semantic relations. A distinct vocabulary is provided for concept mapping relations, to provide a convenient way to differentiate links within a concept scheme from links between concept schemes. However, this pattern of usage is not a formal requirement of the SKOS data model, and relies on informal definitions of best practice."},
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is in mapping relation with"},
   :rdfs/subPropertyOf :skos/semanticRelation,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relates two concepts coming, by convention, from different schemes, and that have comparable meanings"}})

(def member
  "Relates a collection to one of its members."
  {:db/ident         :skos/member,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain      :skos/Collection,
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has member"},
   :rdfs/range       {:owl/unionOf [:skos/Concept :skos/Collection],
                      :rdf/type    :owl/Class},
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "Relates a collection to one of its members."}})

(def memberList
  "Relates an ordered collection to the RDF list containing its members."
  {:db/ident :skos/memberList,
   :rdf/type [:rdf/Property :owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For any resource, every item in the list given as the value of the\n      skos:memberList property is also a value of the skos:member property."},
   :rdfs/domain :skos/OrderedCollection,
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has member list"},
   :rdfs/range :rdf/List,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relates an ordered collection to the RDF list containing its members."}})

(def narrowMatch
  "skos:narrowMatch is used to state a hierarchical mapping link between two conceptual resources in different concept schemes."
  {:db/ident :skos/narrowMatch,
   :owl/inverseOf :skos/broadMatch,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has narrower match"},
   :rdfs/subPropertyOf [:skos/narrower :skos/mappingRelation],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "skos:narrowMatch is used to state a hierarchical mapping link between two conceptual resources in different concept schemes."}})

(def narrower
  "Relates a concept to a concept that is more specific in meaning."
  {:db/ident :skos/narrower,
   :owl/inverseOf :skos/broader,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Narrower concepts are typically rendered as children in a concept hierarchy (tree)."},
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has narrower"},
   :rdfs/subPropertyOf :skos/narrowerTransitive,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relates a concept to a concept that is more specific in meaning."},
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "By convention, skos:broader is only used to assert an immediate (i.e. direct) hierarchical link between two conceptual resources."}})

(def narrowerTransitive
  "skos:narrowerTransitive is a transitive superproperty of skos:narrower."
  {:db/ident :skos/narrowerTransitive,
   :owl/inverseOf :skos/broaderTransitive,
   :rdf/type [:rdf/Property :owl/TransitiveProperty :owl/ObjectProperty],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has narrower transitive"},
   :rdfs/subPropertyOf :skos/semanticRelation,
   :skos/definition
   "skos:narrowerTransitive is a transitive superproperty of skos:narrower.",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "By convention, skos:narrowerTransitive is not used to make assertions. Rather, the properties can be used to draw inferences about the transitive closure of the hierarchical relation, which is useful e.g. when implementing a simple query expansion algorithm in a search application."}})

(def notation
  "A notation, also known as classification code, is a string of characters such as \"T58.5\" or \"303.4833\" used to uniquely identify a concept within the scope of a given concept scheme."
  {:db/ident :skos/notation,
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "notation"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A notation, also known as classification code, is a string of characters such as \"T58.5\" or \"303.4833\" used to uniquely identify a concept within the scope of a given concept scheme."},
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "By convention, skos:notation is used with a typed literal in the object position of the triple."}})

(def note
  "A general note, for any purpose."
  {:db/ident :skos/note,
   :rdf/type [:rdf/Property :owl/AnnotationProperty],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "note"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A general note, for any purpose."},
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "This property may be used directly, or as a super-property for more specific note types."}})

(def prefLabel
  "The preferred lexical label for a resource, in a given language."
  {:db/ident :skos/prefLabel,
   :rdf/type [:rdf/Property :owl/AnnotationProperty],
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "skos:prefLabel, skos:altLabel and skos:hiddenLabel are pairwise\n      disjoint properties."}
    {:rdf/language "en",
     :rdf/value
     "The range of skos:prefLabel is the class of RDF plain literals."}
    {:rdf/language "en",
     :rdf/value
     "A resource has no more than one value of skos:prefLabel per language tag, and no more than one value of skos:prefLabel without language tag."}],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "preferred label"},
   :rdfs/subPropertyOf :rdfs/label,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The preferred lexical label for a resource, in a given language."}})

(def related
  "Relates a concept to a concept with which there is an associative semantic relationship."
  {:db/ident :skos/related,
   :rdf/type [:rdf/Property :owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "skos:related is disjoint with skos:broaderTransitive"},
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has related"},
   :rdfs/subPropertyOf :skos/semanticRelation,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relates a concept to a concept with which there is an associative semantic relationship."}})

(def relatedMatch
  "skos:relatedMatch is used to state an associative mapping link between two conceptual resources in different concept schemes."
  {:db/ident :skos/relatedMatch,
   :rdf/type [:rdf/Property :owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has related match"},
   :rdfs/subPropertyOf [:skos/related :skos/mappingRelation],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "skos:relatedMatch is used to state an associative mapping link between two conceptual resources in different concept schemes."}})

(def scopeNote
  "A note that helps to clarify the meaning and/or the use of a concept."
  {:db/ident :skos/scopeNote,
   :rdf/type [:rdf/Property :owl/AnnotationProperty],
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "scope note"},
   :rdfs/subPropertyOf :skos/note,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A note that helps to clarify the meaning and/or the use of a concept."}})

(def semanticRelation
  "Links a concept to a concept related by meaning."
  {:db/ident :skos/semanticRelation,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :skos/Concept,
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is in semantic relation with"},
   :rdfs/range :skos/Concept,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Links a concept to a concept related by meaning."},
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "This property should not be used directly, but as a super-property for all properties denoting a relationship of meaning between concepts."}})

(def topConceptOf
  "Relates a concept to the concept scheme that it is a top level concept of."
  {:db/ident :skos/topConceptOf,
   :owl/inverseOf :skos/hasTopConcept,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :skos/Concept,
   :rdfs/isDefinedBy "http://www.w3.org/2004/02/skos/core",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is top concept in scheme"},
   :rdfs/range :skos/ConceptScheme,
   :rdfs/subPropertyOf :skos/inScheme,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relates a concept to the concept scheme that it is a top level concept of."}})