# VoID

## Dataset
The `:void/Dataset` class represents a collection of RDF triples that are published, maintained, or aggregated by a single provider. It's like a container for data in the Linked Data Platform. Here's a breakdown of its properties:

1. **:void/class**: This property indicates the type of all entities in a class-based partition of the dataset.

2. **:void/distinctSubjects**: This property gives the total number of unique subjects in the dataset. A subject is the first part of a triple, representing the entity that the triple is about.

3. **:void/properties**: This property gives the total number of unique properties in the dataset. A property is the second part of a triple, representing the characteristic of the subject that the triple describes.

4. **:void/uriLookupEndpoint**: This property defines a simple URI look-up protocol for accessing a dataset.

5. **:void/property**: This property indicates the predicate of all triples in a property-based partition of the dataset.

6. **:void/triples**: This property gives the total number of triples contained in the dataset.

7. **:void/distinctObjects**: This property gives the total number of unique objects in the dataset. An object is the third part of a triple, representing the value of the property for the subject.

8. **:void/rootResource**: This property indicates a top concept or entry point for a dataset that is structured in a tree-like fashion.

9. **:void/documents**: This property gives the total number of documents, for datasets that are published as a set of individual documents.

10. **:void/sparqlEndpoint**: This property indicates the SPARQL endpoint for the dataset.

11. **:void/vocabulary**: This property indicates a vocabulary that is used in the dataset.

12. **:void/dataDump**: This property indicates an RDF dump, partial or complete, of a dataset.

13. **:void/exampleResource**: This property gives an example resource of the dataset.

14. **:void/feature**: This property indicates a feature of the dataset.

15. **:void/classes**: This property gives the total number of distinct classes in the dataset.

16. **:void/classPartition**: This property indicates a subset of a dataset that contains only the entities of a certain class.

17. **:void/propertyPartition**: This property indicates a subset of a dataset that contains only the triples of a certain property.

18. **:void/subset**: This property indicates a subset of a dataset.

19. **:void/entities**: This property gives the total number of entities that are described in a dataset.

20. **:void/uriSpace**: This property gives a URI that is a common string prefix of all the entity URIs in a dataset.

In a Datomic-based Linked Data Platform, you would use these properties to manage your datasets. For example, you could use `:void/triples` to keep track of the size of your datasets, `:void/classPartition` and `:void/propertyPartition` to organize your data, and `:void/sparqlEndpoint` to provide access to your data.

## Linkset

The `:void/Linkset` class represents a collection of RDF links between two datasets. It's a subclass of `:void/Dataset`, which means a linkset is a special kind of dataset where the data is specifically links between two other datasets. Here's a breakdown of its properties:

1. **:void/objectsTarget**: This property points to the dataset that describes the objects of the triples contained in the Linkset. In simpler terms, it's the dataset that provides information about the things that are being linked to.

2. **:void/subjectsTarget**: This property points to the dataset that describes the subjects of the triples contained in the Linkset. This is the dataset that provides information about the things that the links are coming from.

3. **:void/target**: This property is a more general version of the above two properties. It points to one of the two datasets that are being linked by the Linkset.

4. **:void/linkPredicate**: This property represents the type of link that the Linkset contains. For example, if the Linkset contains "friend" links between people in two different social network datasets, the `linkPredicate` would be something like `:foaf/knows`.

In a Datomic-based Linked Data Platform, you would use these properties to manage your linksets. For example, you could use `:void/objectsTarget` and `:void/subjectsTarget` to keep track of which datasets your linkset is connecting. You could use `:void/linkPredicate` to categorize your linksets based on the type of links they contain. This would allow you to query your data in complex ways, such as finding all the linksets that contain a certain type of link, or finding all the datasets that are connected by a certain linkset.

## Technical Feature
The `:void/TechnicalFeature` class represents a technical characteristic of a `:void/Dataset`. This could include supported RDF serialization formats, query languages, or other technical details that describe how the dataset can be accessed or used. 

For example, a dataset could have a `:void/TechnicalFeature` of `:formats/RDF_XML` to indicate that it supports the RDF/XML serialization format.

In a Datomic-based Linked Data Platform, you would use the `:void/TechnicalFeature` class to capture these kinds of technical details about your datasets. This would make it easier for users or applications to understand how they can interact with your data.

However, it's important to note that the `:void/TechnicalFeature` class does not have any direct slots. This means that it doesn't have any properties that are specific to it. Instead, you would typically use it as a value for the `:void/feature` property of a `:void/Dataset`.
