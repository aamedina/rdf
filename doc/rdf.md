# Resource Description Framework

## :rdf/Statement

The `:rdf/Statement` class in RDF represents a statement or a triple
that consists of a subject, a predicate, and an object. These are the
fundamental building blocks of RDF and are used to make assertions
about resources in a graph. 

Here are the slots (properties) associated with the `:rdf/Statement` class:

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
   two properties are equivalent. If a property A is
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
