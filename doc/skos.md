# Simple Knowledge Organization System
An RDF vocabulary for describing the basic structure and content of
concept schemes such as thesauri, classification schemes, subject
heading lists, taxonomies, 'folksonomies', other types of controlled
vocabulary, and also concept schemes embedded in glossaries and
terminologies.

## Introduction

The Simple Knowledge Organization System (SKOS) is a powerful tool for
representing and organizing knowledge in a structured, interoperable
format. In the context of a Linked Data Platform using Datomic, SKOS
can be used to model a wide range of knowledge organization systems,
including controlled vocabularies, taxonomies, thesauri, and more.

### Key Classes and Properties

SKOS provides several key classes and properties that can be used to
model the structure and content of a knowledge organization system:

- `:skos/ConceptScheme`: Represents a set of concepts, optionally including statements about semantic relationships between those concepts.
- `:skos/Concept`: Represents an idea or notion; a unit of thought.
- `:skos/Collection`: Represents a meaningful collection of concepts.
- `:skos/semanticRelation`: Represents a semantic relationship between concepts.

### Hierarchical and Non-Hierarchical Relationships

SKOS supports the representation of both hierarchical and
non-hierarchical relationships between concepts. The `:skos/broader`
and `:skos/narrower` properties can be used to represent broader and
narrower term relationships, while the `:skos/related` property can be
used to represent non-hierarchical relationships such as equivalence,
similarity, or association.

### Multilingual Labels

SKOS supports the use of labels in different languages through the
`:skos/prefLabel`, `:skos/altLabel`, and `:skos/hiddenLabel`
properties. This allows for the representation of a concept in
multiple languages within the same ConceptScheme.

### Multiple ConceptSchemes

The `:skos/inScheme` property allows a Concept to be associated with
multiple ConceptSchemes, facilitating the reuse of concepts across
different schemes.

### Modelling Concepts and Collections as Entities

When working with SKOS within a Linked Data Platform using Datomic, it
is important to consider the modelling of concepts and collections as
entities. An entity representing a Concept could have attributes such
as its label, definition, and any broader or narrower relationships,
while a Collection entity could have attributes such as its label,
member Concepts, and any semantic relationships to other Collections
or Concepts.

Understanding the full range of SKOS properties and how they relate to
modelling entities in Datomic is crucial when designing and building a
SKOS-based knowledge organization system. With its powerful querying
capabilities and support for ACID transactions, Datomic is well-suited
to managing the complex, interconnected data structures that can be
modeled using SKOS.

## Semantic Relations
The `:skos/semanticRelation` property is a superclass of several other
properties, which represent different types of semantic relationships
between concepts. These include:

- `:skos/closeMatch`: Indicates that two concepts are sufficiently
  similar that they can be used interchangeably in some information
  retrieval applications.
- `:skos/mappingRelation`: A general mapping link between the subjects
  of two concept schemes.
- `:skos/exactMatch`: Indicates that two concepts are equivalent in
  meaning.
- `:skos/broader`: Indicates that one concept is more general than
  another.
- `:skos/narrower`: Indicates that one concept is more specific than
  another.
- `:skos/narrowerTransitive`: A transitive property that is a
  subproperty of `:skos/narrower`.
- `:skos/narrowMatch`: Indicates a mapping from a concept in one
  scheme to a more specific concept in another scheme.
- `:skos/relatedMatch`: Indicates a mapping from a concept in one
  scheme to a related concept in another scheme.
- `:skos/related`: Indicates that two concepts are related, without
  specifying the nature of the relationship.
- `:skos/broadMatch`: Indicates a mapping from a concept in one scheme
  to a more general concept in another scheme.
- `:skos/broaderTransitive`: A transitive property that is a
  subproperty of `:skos/broader`.

These properties can be used to express a wide range of semantic
relationships between concepts, allowing for a rich and nuanced
representation of the structure of a knowledge organization system.

## :skos/ConceptScheme

The `:skos/ConceptScheme` class represents a set of concepts,
optionally including statements about semantic relationships between
those concepts. The `:owl/disjointWith` property indicates that this
class is disjoint with the `:skos/Concept` class.

The properties associated with this class include:

- `:skos/hasTopConcept`

In the context of a Linked Data Platform using Datomic, a
`:skos/ConceptScheme` could represent a controlled vocabulary, a
taxonomy, a thesaurus, or any other type of knowledge organization
system. The `:skos/hasTopConcept` property could be used to link the
concept scheme to the `:skos/Concept` instances that are considered to
be the top-level concepts in the scheme.

The Simple Knowledge Organization System (SKOS) provides a standard,
interoperable way to represent and link knowledge organization
systems, making it easier to share and reuse these systems across
different applications and platforms.

## :skos/Concept

The `:skos/Concept` class represents an idea or notion; a unit of
thought.

The properties associated with this class include:

- `:skos/topConceptOf`
- `:skos/semanticRelation`
- `:foaf/focus`

In the context of a Linked Data Platform using Datomic, a
`:skos/Concept` could represent a concept or term in a controlled
vocabulary, a taxonomy, a thesaurus, or any other type of knowledge
organization system. The `:skos/topConceptOf` property could be used
to link the concept to the `:skos/ConceptScheme` instances that
consider it to be a top-level concept. The `:skos/semanticRelation`
property could be used to link the concept to other `:skos/Concept`
instances that it has a semantic relationship with. The `:foaf/focus`
property could be used to link the concept to the thing that the
concept is about.

## :skos/Collection

The `:skos/Collection` class represents a meaningful collection of
concepts. The `:owl/disjointWith` property indicates that this class
is disjoint with the `:skos/ConceptScheme` and `:skos/Concept`
classes.

The properties associated with this class include:

- `:skos/member`

In the context of a Linked Data Platform using Datomic, a
`:skos/Collection` could represent a group of `:skos/Concept`
instances that are meaningfully related. The `:skos/member` property
could be used to link the collection to its member concepts.

## :skos/OrderedCollection
The `:skos/OrderedCollection` class represents an ordered collection
of concepts, where both the grouping and the ordering are
meaningful. It is a subclass of `:skos/Collection`.

The properties associated with this class include:

- `:skos/memberList`

In the context of a Linked Data Platform using Datomic, a
`:skos/OrderedCollection` could represent a sequence of
`:skos/Concept` instances that are meaningfully related and
ordered. The `:skos/memberList` property could be used to link the
ordered collection to its member concepts in a specific order. This
could be useful in scenarios where the order of concepts is
significant, such as a step-by-step guide or a chronological timeline.
