# dcat

## :dcat/Catalog

The `:dcat/Catalog` class in the DCAT ontology represents a curated collection of metadata about resources, such as datasets and data services, in the context of a data catalog. It is a subclass of `:rdfs/Resource`, `:dcat/Dataset`, `:dcat/Catalog`, and `:dcat/Resource`.

Here are the properties (slots) associated with `:dcat/Catalog`:

1. `:dcat/catalog`: This property connects a catalog to another catalog whose contents are of interest in the context of the first catalog. The range of this property is `:dcat/Catalog`.

2. `:dcat/record`: This property links a catalog to its records. A record describes the registration of a single dataset or data service that is part of the catalog. The range of this property is `:dcat/CatalogRecord`.

3. `:dcat/dataset`: This property connects a catalog to a dataset that is listed in the catalog. The range of this property is `:dcat/Dataset`.

4. `:dcat/themeTaxonomy`: This property links a catalog to the knowledge organization system (KOS) used to classify the catalog's datasets. The range of this property includes `:skos/ConceptScheme`, `:owl/Ontology`, `:skos/Collection`, and similar resources that allow each member of the taxonomy to be denoted by an IRI and published as linked data.

5. `:dcat/service`: This property links a catalog to a site or endpoint that is listed in the catalog. The range of this property is `:dcat/DataService`.

In a real-world scenario, you would use these properties to describe your data catalogs. For example, you could use the `:dcat/dataset` property to list all the datasets in your catalog, or the `:dcat/service` property to list all the data services provided by your catalog. When storing this data in Datomic with RDF, you would typically map these DCAT properties to RDF triples. Each DCAT catalog would become a set of RDF triples that share the same subject. The subject would be the IRI of the DCAT catalog, the predicate would be the IRI representing the property, and the object would be the value of the property. This way, you can leverage the power of RDF and SPARQL for querying your data, while still using the simplicity and flexibility of DCAT for data catalog representation.

## :dcat/Dataset

The `:dcat/Dataset` class in the DCAT ontology represents a collection of data, published or curated by a single source, and available for access or download in one or more representations. It is a subclass of `:rdfs/Resource`, `:dcat/Resource`, and `:dcat/Dataset`.

Here is the property (slot) associated with `:dcat/Dataset`:

1. `:dcat/distribution`: This property connects a dataset to its available distributions. A distribution represents a specific form of a dataset, such as a specific file format or access endpoint. The range of this property is `:dcat/Distribution`.

In a real-world scenario, you would use these properties to describe
your datasets. For example, you could use the `:dcat/distribution`
property to list all the available distributions of your dataset, such
as CSV files, JSON files, or API endpoints. When storing this data in
Datomic with RDF, you would typically map these DCAT properties to RDF
triples. Each DCAT dataset would become a set of RDF triples that
share the same subject. The subject would be the IRI of the DCAT
dataset, the predicate would be the IRI representing the property, and
the object would be the value of the property. This way, you can
leverage the power of RDF and SPARQL for querying your data, while
still using the simplicity and flexibility of DCAT for dataset
representation.

For instance, if you have a dataset about global temperatures, you
might have different distributions of this dataset available as a CSV
file, a JSON file, and an API endpoint. Each of these distributions
would be represented as a separate `:dcat/Distribution` instance, and
they would all be linked to the `:dcat/Dataset` instance representing
the global temperatures dataset using the `:dcat/distribution`
property.

## :dcat/Distribution

The `:dcat/Distribution` class represents a specific available form of a dataset. Each distribution corresponds to one access URL and/or download URL. The properties of this class include:

1. `:dcat/accessURL`: The URL of the distribution, which provides access to the dataset.
2. `:dcat/byteSize`: The size of the distribution in bytes.
3. `:dcat/downloadURL`: The URL of the downloadable file in a given format. E.g. CSV file or RDF file. The format is indicated by the distribution's dct:format and/or dcat:mediaType.
4. `:dcat/mediaType`: The media type of the distribution as defined by IANA.
5. `:dcat/packageFormat`: The package format of the distribution in which one or more data files are grouped together, e.g. to enable a set of related files to be downloaded together.

Unfortunately, I couldn't find information about `:dcat/conformsTo`, `:dcat/describedBy`, and `:dcat/describedByType` properties. They might not be defined in the current vocabulary.

In a real-world scenario, you would use these properties to describe the different ways a dataset can be accessed or downloaded. For example, if you have a dataset that is available as a CSV file and also as an API, you would create two `:dcat/Distribution` instances, one for each format. Each instance would have its own `:dcat/accessURL` and/or `:dcat/downloadURL`, and the `:dcat/mediaType` would be set to the appropriate media type for each format.
