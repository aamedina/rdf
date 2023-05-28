# Web Ontology Language (OWL)

## :owl/Class

The `:owl/Class` class in RDF represents the class of OWL
classes. This is a subclass of `:rdfs/Class`, meaning that all OWL
classes are also RDF classes.

Here are the associated slots (properties) for the `:owl/Class` class:

1. **:owl/complementOf**: This property determines that a given class
   is the complement of another class. The domain and range of this
   property are both `:owl/Class`, meaning it can be used to relate
   two OWL classes.

2. **:owl/hasKey**: This property determines the collection of
   properties that jointly build a key. The domain of this property is
   `:owl/Class`, and the range is `:rdf/List`, meaning the value of
   this property should be a list of properties.

3. **:owl/disjointWith**: This property determines that two given
   classes are disjoint. The domain and range of this property are
   both `:owl/Class`.

4. **:owl/disjointUnionOf**: This property determines that a given
   class is equivalent to the disjoint union of a collection of other
   classes. The domain of this property is `:owl/Class`, and the range
   is `:rdf/List`, meaning the value of this property should be a list
   of classes.

In the context of a Linked Data Platform using Datomic, these
properties can be used to define and manipulate OWL classes and their
relationships. For example, you could use the `:owl/complementOf`
property to define a class that includes all resources that are not
members of another class, or use the `:owl/hasKey` property to define
a key for a class based on a combination of properties.

## :owl/ObjectProperty

The `:owl/ObjectProperty` class in RDF represents the class of object
properties. These are properties that link individuals to
individuals. This is a subclass of `:rdf/Property`, meaning that all
object properties are also RDF properties.

Here are the associated slots (properties) for the
`:owl/ObjectProperty` class:

1. **:owl/propertyChainAxiom**: This property determines the n-tuple
   of properties that build a sub property chain of a given
   property. The domain of this property is `:owl/ObjectProperty`, and
   the range is `:rdf/List`, meaning the value of this property should
   be a list of properties.

2. **:owl/inverseOf**: This property determines that two given
   properties are inverse. The domain and range of this property are
   both `:owl/ObjectProperty`.

In the context of a Linked Data Platform, these properties can be used
to define and manipulate object properties and their
relationships. For example, you could use the
`:owl/propertyChainAxiom` property to define a chain of properties
that together form a subproperty of another property. Or you could use
the `:owl/inverseOf` property to define two properties that are
inverses of each other, meaning that if one property links individual
A to individual B, then the other property links individual B to
individual A.

## :owl/DatatypeProperty

The `:owl/DatatypeProperty` class in RDF represents the class of data
properties. These are properties that link individuals to data
values. This is a subclass of `:rdf/Property`, meaning that all data
properties are also RDF properties.

The `:owl/DatatypeProperty` class does not have any direct slots
(properties) associated with it. However, being a subclass of
`:rdf/Property`, it inherits all the slots of `:rdf/Property`.

In the context of a Linked Data Platform, data properties can be used
to assign data values to individuals. For example, you could use a
data property to assign a name to a person, a price to a product, or a
date to an event. The value of a data property is always a literal,
such as a string, number, or boolean.

In contrast to object properties, which link individuals to
individuals, data properties link individuals to data values. This
allows you to represent information about individuals in a structured
and queryable way.
