# Resource Description Framework
[:rdfs/seeAlso](https://www.w3.org/TR/rdf11-primer/)

## :rdf/Statement

The `:rdf/Statement` class in RDF represents a statement or a triple
that consists of a subject, a predicate, and an object. These are the
fundamental building blocks of RDF and are used to make assertions
about resources in a graph.

Here are the slots (properties) associated with the `:rdf/Statement`
class:

1. **:rdf/subject**: This property represents the subject of an RDF
   statement. The subject is the resource that the statement is
   about. It is defined by the RDF syntax namespace and is a
   subproperty of `:rdf/subject`. The domain of this property is
   `:rdf/Statement`, meaning it can be used with instances of this
   class. The range of this property is `:rdfs/Resource`, meaning the
   value of this property should be a resource.

2. **:rdf/predicate**: This property represents the predicate of an
   RDF statement. The predicate is the aspect or characteristic of the
   subject resource that the statement is asserting. It is defined by
   the RDF syntax namespace and is a subproperty of
   `:rdf/predicate`. The domain of this property is `:rdf/Statement`,
   and the range is `:rdfs/Resource`.

3. **:rdf/object**: This property represents the object of an RDF
   statement. The object is the value of the aspect or characteristic
   that the statement is asserting about the subject resource. It is
   defined by the RDF syntax namespace and is a subproperty of
   `:rdf/object`. The domain of this property is `:rdf/Statement`, and
   the range is `:rdfs/Resource`.

In the context of a Linked Data Platform using Datomic, these
properties can be used to create, query, and manipulate RDF triples in
the database. The `:rdf/Statement` class and its associated properties
provide a flexible and powerful framework for representing and working
with data in a graph format.

In Datomic, data is stored as datoms, which are similar to RDF triples
in that they represent facts about entities. A datom is a tuple that
consists of four components:

1. Entity ID (E): This is a unique identifier for the entity that the
   datom is about.

2. Attribute (A): This is the aspect or characteristic of the entity
   that the datom is asserting.

3. Value (V): This is the value of the aspect or characteristic that
   the datom is asserting about the entity.

4. Transaction ID (T): This is a unique identifier for the transaction
   that added the datom to the database.

This structure is similar to an RDF triple, which consists of a
subject, a predicate, and an object. In the context of RDF:

- The subject corresponds to the Entity ID in a datom.
- The predicate corresponds to the Attribute in a datom.
- The object corresponds to the Value in a datom.

The main difference is that Datomic datoms include a fourth component,
the Transaction ID, which provides information about when and in what
context the fact was added to the database. This allows Datomic to
maintain a complete history of the data, which is not typically part
of the RDF model.

In this way, Datomic's datom structure can be used to represent RDF
triples, with the added benefit of historical context and the ability
to track changes over time. This makes Datomic a powerful tool for
working with graph data and implementing systems based on the RDF
model.

## :rdf/List

The `:rdf/List` class in RDF is a construct used to represent ordered
collections of items. 

The `:rdf/List` class has two associated properties, or slots, which
are used to define the structure and content of the list:

1. **:rdf/first**: This property points to the first item in the RDF
   list. The domain of this property is `:rdf/List`, indicating that
   it can be used with instances of the `:rdf/List` class. The range
   of this property is `:rdfs/Resource`, which means the value of this
   property, i.e., the first item in the list, can be any resource.

2. **:rdf/rest**: This property points to the remainder of the RDF
   list after the first item. Like `:rdf/first`, the domain of this
   property is `:rdf/List`. The range of this property is also
   `:rdf/List`, indicating that the value of this property is another
   RDF list containing the remaining items.

In the context of a Linked Data Platform using Datomic, the
`:rdf/List` class and its associated properties can be used to
represent and manipulate ordered collections of items. By storing
these lists as entities in Datomic, you can leverage the power of the
RDF model to create complex, interconnected data structures. This
approach allows for the creation of rich, semantically meaningful data
models that can be easily queried and manipulated using Datomic's
powerful database capabilities.

## :rdf/Property

The `:rdf/Property` class in RDF is used to represent
properties. These properties are the predicates in RDF triples,
creating relationships between resources. Here are the associated
slots (properties) for the `:rdf/Property` class:

1. **:owl/propertyDisjointWith**: This property is used to assert that
   two properties are disjoint. In other words, if a resource has a
   property that is `:owl/propertyDisjointWith` another property, it
   cannot have that other property. The domain and range of this
   property are both `:rdf/Property`.

2. **:rdfs/subPropertyOf**: This property is used to assert a
   hierarchical relationship between two properties. If a property A
   is a `:rdfs/subPropertyOf` property B, then all resources that have
   property A also implicitly have property B with the same value. The
   domain and range of this property are both `:rdf/Property`.

3. **:rdfs/range**: This property is used to specify the permissible
   values for a property. If a property has a `:rdfs/range` of a
   certain class, then all values of that property must be instances
   of that class. The domain of this property is `:rdf/Property`, and
   the range is `:rdfs/Class`.

4. **:owl/equivalentProperty**: This property is used to assert that
   two properties are equivalennt. If a property A is
   `:owl/equivalentProperty` to property B, then any resource that has
   property A also implicitly has property B with the same value, and
   vice versa. The domain and range of this property are both
   `:rdf/Property`.

5. **:rdfs/domain**: This property is used to specify the class of
   resources that a property can be used with. If a property has a
   `:rdfs/domain` of a certain class, then all resources that have
   that property must be instances of that class. The domain of this
   property is `:rdf/Property`, and the range is `:rdfs/Class`.

In the context of a Linked Data Platform using Datomic, these
properties can be used to define and manipulate relationships between
resources. The `:rdf/Property` class and its associated properties
provide a flexible and powerful framework for representing and working
with data in a graph format.

## Datomic

Mapping Datomic schema attributes to RDF properties in a linked data
platform can be achieved by treating Datomic attributes as RDF
properties. 

1. **Identify Datomic Attributes**: In Datomic, attributes are used to
   describe entities. These attributes are similar to RDF properties,
   which are used to create relationships between resources. Identify
   the attributes in your Datomic schema that you want to map to RDF
   properties.

2. **Create RDF Properties**: For each Datomic attribute, create a
   corresponding RDF property. The identifier of the RDF property
   could be the same as the Datomic attribute, or it could be a
   transformation of the attribute identifier to fit the naming
   conventions of your RDF data.

3. **Define Domains and Ranges**: For each RDF property, define the
   domain and range. The domain is the class of resources that the
   property can be used with, and the range is the class of values
   that the property can have. In Datomic, the domain would correspond
   to the entity that the attribute describes, and the range would
   correspond to the type of the attribute.

4. **Create RDF Triples**: For each entity in your Datomic database,
   create an RDF triple for each attribute of the entity. The subject
   of the triple is the entity, the predicate is the RDF property
   corresponding to the attribute, and the object is the value of the
   attribute for the entity.

5. **Store RDF Data**: Store the RDF triples in a linked data
   platform. This could be a dedicated RDF store, or it could be a
   Datomic database with a schema designed to store RDF data.

By following these steps, you can create a mapping between Datomic
attributes and RDF properties, allowing you to represent your Datomic
data as RDF and leverage the power of linked data. This approach
provides a flexible and powerful framework for representing and
working with data in a graph format, and it allows you to take
advantage of the rich tooling and standards available for RDF and
linked data.

# RDF Schema (RDFS)

## :rdfs/Resource

The `:rdfs/Resource` class in RDF is the superclass of everything in
RDF, meaning all things described by RDF are resources.

Here are the associated slots (properties) for the `:rdfs/Resource`
class:

1. **:owl/annotatedTarget**: This property determines the object of an
   annotated axiom or annotated annotation. The domain and range of
   this property are both `:rdfs/Resource`.

2. **:rdfs/member**: This property indicates membership in a
   resource. The domain and range of this property are both
   `:rdfs/Resource`.

3. **:owl/annotatedSource**: This property determines the subject of
   an annotated axiom or annotated annotation. The domain and range of
   this property are both `:rdfs/Resource`.

4. **:rdfs/label**: This property provides a human-readable name for
   the subject. The domain of this property is `:rdfs/Resource`, and
   the range is `:rdfs/Literal`.

5. **:rdf/type**: This property is used to state that a resource is an
   instance of a class. The domain of this property is
   `:rdfs/Resource`, and the range is `:rdfs/Class`.

6. **:owl/members**: This property determines the collection of
   members in either a owl:AllDifferent, owl:AllDisjointClasses or
   owl:AllDisjointProperties axiom. The domain of this property is
   `:rdfs/Resource`, and the range is `:rdf/List`.

7. **:rdfs/isDefinedBy**: This property provides the definition of the
   subject resource. The domain and range of this property are both
   `:rdfs/Resource`.

8. **:owl/deprecated**: This property indicates that a given entity
   has been deprecated. The domain and range of this property are both
   `:rdfs/Resource`.

9. **:owl/versionInfo**: This property provides version information
   for an ontology or another OWL construct. The domain and range of
   this property are both `:rdfs/Resource`.

10. **:rdfs/seeAlso**: This property provides further information
    about the subject resource. The domain and range of this property
    are both `:rdfs/Resource`.

11. **:rdf/value**: This property is used for structured values. The
    domain and range of this property are both `:rdfs/Resource`.

12. **:rdfs/comment**: This property provides a description of the
    subject resource. The domain of this property is `:rdfs/Resource`,
    and the range is `:rdfs/Literal`.

13. **:owl/annotatedProperty**: This property determines the predicate
    of an annotated axiom or annotated annotation. The domain and
    range of this property are both `:rdfs/Resource`.

In Datomic, you can create entities that correspond to RDF resources,
and use Datomic attributes to represent RDF properties. The value of
the attribute would correspond to the object of the RDF triple. By
storing RDF data in this way, you can leverage Datomic's powerful
querying capabilities to explore your RDF data. For example, you could
use Datomic's pull syntax to retrieve all properties of a resource, or
use Datomic's datalog queries to perform more complex queries on your
data.

## :rdfs/Class

The `:rdfs/Class` class in RDF is used to represent classes. These
classes are used to group resources with similar characteristics. Here
are the associated slots (properties) for the `:rdfs/Class` class:

1. **:owl/unionOf**: This property determines the collection of
   classes or data ranges that form a union. The domain of this
   property is `:rdfs/Class`, and the range is `:rdf/List`, meaning
   the value of this property should be a list of classes or data
   ranges.

2. **:owl/equivalentClass**: This property determines that two given
   classes are equivalent. The domain and range of this property are
   both `:rdfs/Class`.

3. **:owl/oneOf**: This property determines the collection of
   individuals or data values that build an enumeration. The domain of
   this property is `:rdfs/Class`, and the range is `:rdf/List`.

4. **:owl/intersectionOf**: This property determines the collection of
   classes that build an intersection. The domain of this property is
   `:rdfs/Class`, and the range is `:rdf/List`.

5. **:rdfs/subClassOf**: This property indicates that the subject is a
   subclass of a class. The domain and range of this property are both
   `:rdfs/Class`.

In the context of a Linked Data Platform using Datomic, these
properties can be used to define and manipulate classes and their
relationships. The `:rdfs/Class` class and its associated properties
provide a flexible and powerful framework for representing and working
with data in a graph format.

## :rdfs/Literal

In RDF, the `:rdfs/Literal` class is used to represent literal
values. These are concrete values such as strings, numbers, and
booleans. They are the "leaf nodes" of your RDF graph, representing
the actual data you're working with.

For example, if you have a resource representing a person, you might
use literals to represent that person's name (a string), age (a
number), or whether they are currently employed (a boolean). These
literals would be the objects of RDF triples, with the person as the
subject and the appropriate property (like `:foaf/name`, `:foaf/age`,
or `:foaf/currentlyEmployed`) as the predicate.

In the context of a Linked Data Platform using Datomic, you would
typically represent RDF literals using Datomic's built-in types. For
example, a string literal in RDF would be represented as a string in
Datomic, a numeric literal would be represented as a long or double,
and a boolean literal would be represented as a boolean. These Datomic
values would be the values of Datomic attributes, which correspond to
RDF properties.

When designing your Datomic schema, it's important to choose the
appropriate Datomic type for each RDF literal. This will allow you to
leverage Datomic's querying capabilities to effectively query your
data. For example, if you choose the correct numeric type for a
numeric literal, you can use Datomic's numeric comparison functions in
your queries.

In summary, `:rdfs/Literal` is a fundamental part of RDF, representing
the actual data you're working with. When working with RDF in Datomic,
you'll typically represent literals using Datomic's built-in types,
choosing the appropriate type for each literal.

## :rdfs/Datatype

The `:rdfs/Datatype` class in RDF represents the class of RDF
datatypes. These datatypes are used to represent typed literal values,
such as integers, dates, and XML data.

Here are some of the associated slots (properties) for the `:rdfs/Datatype` class:

1. **:owl/withRestrictions**: This property determines the collection
   of facet-value pairs that define a datatype restriction. The domain
   of this property is `:rdfs/Datatype`, and the range is `:rdf/List`,
   meaning the value of this property should be a list of facet-value
   pairs.

2. **:owl/onDatatype**: This property determines the datatype that a
   datatype restriction refers to. The domain and range of this
   property are both `:rdfs/Datatype`.

3. **:owl/datatypeComplementOf**: This property determines that a
   given data range is the complement of another data range with
   respect to the data domain. The domain and range of this property
   are both `:rdfs/Datatype`.

In the context of a Linked Data Platform using Datomic, these
properties can be used to define and manipulate datatypes and their
restrictions. The `:rdfs/Datatype` class and its associated properties
provide a flexible and powerful framework for representing and working
with typed literal values.

In Datomic, you can create attributes with value types that correspond
to RDF datatypes. For example, a Datomic attribute with a value type
of `:db.type/long` could be used to represent an RDF datatype of
`xsd:integer`. These attributes can then be used to represent RDF
properties with typed literal values. For example, you could create a
Datomic attribute to represent the `:ex:age` property, with a value
type of `:db.type/long` to represent the age as an integer.
