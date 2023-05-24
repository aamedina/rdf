# JSON-LD

## :jsonld/Context
The `:jsonld/Context` class in the JSON-LD ontology is a crucial component that defines term definitions and other aspects of a JSON-LD `Context`. It is a subclass of `:rdfs/Resource` and `:jsonld/Context` itself. 

Here are the properties (slots) associated with `:jsonld/Context`:

1. `:jsonld/type`: This property is applicable to both `:jsonld/TermDefinition` and `:jsonld/Context`. Its value must be a map with only the entry `@container` set to `@set`, and optionally an entry `@protected`. If the expanded term definition contains the `@type` keyword, its value must be an IRI reference, a term, `null`, or one of the keywords `@id`, `@json`, `@none`, or `@vocab`.

2. `:jsonld/base`: The value of this property must be an IRI reference or `null` if the context definition has an `@base` key.

3. `:jsonld/definition`: This property is associated with term definitions in the context.

4. `:jsonld/propagate`: If the context definition contains the `@propagate` keyword, its value must be `true` or `false`.

5. `:jsonld/import`: If the context definition contains the `@import` keyword, its value must be an IRI reference. The referenced context definition must not include an `@import` key itself.

6. `:jsonld/direction`: If the context definition has an `@direction` key, its value must be one of `"ltr"` or `"rtl"`, or be `null`.

7. `:jsonld/protected`: If the context definition contains the `@protected` keyword, its value must be `true` or `false`.

8. `:jsonld/language`: The default language is set in the context using the `@language` key whose value must be a string representing a BCP47 language code or null.

9. `:jsonld/vocab`: This property is used to expand properties and values in `@type` with a common prefix IRI.

10. `:jsonld/version`: The processing mode defines how a JSON-LD document is processed. By default, all documents are assumed to be conformant with JSON-LD 1.1. By defining a different version via explicit API option, other processing modes can be accessed.

In a real-world scenario, you would use these properties to define the context of your JSON-LD documents. This context is crucial as it provides the necessary information to interpret the JSON-LD document correctly. For example, you could use the `@vocab` keyword to define a common prefix IRI for your document, or the `@language` keyword to specify the default language for the values of your properties.

When storing this data in Datomic with RDF, you would typically map these JSON-LD properties to RDF triples. Each JSON-LD document would become a set of RDF triples that share the same subject. The subject would be the IRI of the JSON-LD document, the predicate would be the IRI representing the property, and the object would be the value of the property. This way, you can leverage the power of RDF and SPARQL for querying your data, while still using the simplicity and flexibility of JSON-LD for data representation.
