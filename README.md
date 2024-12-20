# rdf
**RDF models as Clojure(script) namespaces**

![The Game](https://github.com/aamedina/rdf/assets/1291511/5f6f5455-6c4d-4871-ad92-9eddd017f2aa)

## Overview
This project provides tools for managing RDF data using Apache Jena and Aristotle within Clojure(script), allowing easy manipulation and querying of RDF terms organized into multimethod hierarchies.

## Configuration
Below is a configuration example for setting up the Universal Translator, which facilitates RDF model management through a structured namespace.

```clojure
{:asami  {:sc/create-fn net.wikipunk.asami/map->Connection
          :uri          "asami:mem://.vocab"}
 :vocab  {:sc/create-fn net.wikipunk.rdf/map->UniversalTranslator
          ;; add components that require RDF vocabulary and optionally
          ;; provide asami or datomic as an environment
          :sc/refs      {:env :asami}
          ;; the string to prefix the namespace generated for your rdf models
          :ns-prefix    "net.wikipunk.rdf."
          ;; the project relative path to output the namespaces
          :output-to    "src/cljc/net/wikipunk/rdf/"
          :context      []
          ;; set to true to materialize MOP inferences in classes
          :finalize?    true
          ;; (optional) import private vars from one namespace as
          ;; public ones in another before starting the system
          :import-from  {net.wikipunk.rdf.aio net.wikipunk.rdf.obo}}}
```

This is a [schematic](https://github.com/walmartlabs/schematic)
configuration map which is assembled and started using
[component](https://github.com/stuartsierra/component).

### Boot namespace
The convention is to place a file containing the JSON-LD context for
your project organized into a Clojure namespace called boot.cljc. 

For example, for this project it is located at
`src/cljc/net/wikipunk/boot.cljc`.

### :context

Provide a list of namespaces that are tagged with :rdf/type :jsonld/Context in
their metadata. These namespaces contain defs of `:rdfa/PrefixMapping` instances
which can be emitted (via `net.wikipunk.rdf/emit`) to 
generate the Clojure namespaces from the provided metadata.

For an example see the `net.wikipunk.boot` namespace which corresponds
to the RDFa 1.1 initial context;

``` clojure
(def as
  "Activity Vocabulary"
  {:dcat/downloadURL "net/wikipunk/boot/activitystreams2.ttl"
   :rdfa/uri         "https://www.w3.org/ns/activitystreams#",
   :rdfa/prefix      "as",
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/TR/activitystreams-vocabulary/"},
   :rdf/type         :rdfa/PrefixMapping})
```

`:rdf/type` is `:rdfa/PrefixMapping` which has two slots:

`:rdfa/uri` contains the URI of the vocabulary
`:rdfa/prefix` contains the prefix string used which expands to the
uri 

`:dcat/downloadURL` is used to declare the location of the RDF
document to download when emitting a Clojure namespace and override
the value of `:rdfa/uri`.

`:emit` should be set to false if you do not want to emit this prefix
mapping as a Clojure namespace

`:private` should be set to true if you want to emit vars that are
declared in another RDF model, this should probably not be used unless
you know what you're doing and want to override other definitions

`:namespaces` should be provided if you want to manually override the
prefix mappings declared in the RDF model

## :dev
#### Requirement
* [Clojure CLI](https://clojure.org/guides/install_clojure)
* [Datomic local](https://docs.datomic.com/cloud/datomic-local.html)

``` shell
clojure -A:dev
```

``` clojure
(reset)
```

Assuming you have started the system and are in the dev namespace use
the following functions to explore the vocabulary:

Terms are identified by namespace-qualified keywords where the
namespace part is the prefix of the vocabulary and the name part is
the name of the term in that vocabulary.

For example, for the namespace "schema" and term "Movie", you can
treat the following keyword as its identifier:

``` clojure
:schema/Movie
```

All metaobjects that are available to the system must have a :db/ident
associated with them when the system is started.

``` clojure
(datafy :schema/Movie)
```

``` clojure
{:rdf/type :rdfs/Class,
 :rdfs/subClassOf :schema/CreativeWork,
 :mop/classPrecedenceList
 [:schema/Movie :schema/CreativeWork :schema/Thing :rdfs/Class],
 :rdfs/label "Movie",
 :rdfs/comment "A movie.",
 :mop/classDirectSlots
 #{:schema/director
   :schema/trailer
   :schema/productionCompany
   :schema/musicBy
   :schema/subtitleLanguage
   :schema/duration
   :schema/titleEIDR
   :schema/actors
   :schema/countryOfOrigin
   :schema/directors
   :schema/actor},
 :db/ident :schema/Movie}
```

``` clojure
(doc :schema/Movie)
```

``` clojure
;; -------------------------
;; :schema/Movie
;;    A movie.
;;   isa?
;;   :schema/CreativeWork
;;    :schema/Thing
;;      :rdfs/Class
```

### Metaobject Protocol
Most methods within the system dispatch based on the :rdf/type of the
object sorted by class precedence. This allows for dynamic method
resolution typical in object-oriented systems but implemented through
Clojure's multimethods.

The following describes an anonymous :owl/Class with no properties:
``` clojure
{:rdf/type :owl/Class}

;; Define a method that dispatches on the most specific :rdf/type of the object
(defmethod your-multimethod :your/Thing [args] ...)
```

#### datafy
Use `clojure.datafy/datafy` to find out what a metaobject means by
providing a namespace qualified keyword to retrieve it from the
currently bound environment (`net.wikipunk.mop/*env*`).

#### net.wikipunk.mop/*env*

The *env* variable holds the current environment in which metaobjects
are resolved. It can be one of three values:

1. nil -- When nil, metaobjects are resolved in Clojure namespaces by
   looking up the namespace as a prefix in a registry and then looking
   up the name in that namespace.
2. Asami -- When Asami (`net.wikipunk.asami.Connection`) is bound
   to the environment metaobjects are resolved by looking the idents
   up using `asami.core/entity`.
3. Datomic -- When Datomic (`net.wikipunk.datomic.Connection`) is
   bound to the environment metaobjects are resolved by looking up the
   idents using `datomic.client.api/pull`.


### credits
[Aristotle](https://github.com/arachne-framework/aristotle)

[Semantic Web](https://www.w3.org/DesignIssues/)

### rdfs:seeAlso

[wikipunk.net](https://wikipunk.net/)

### License
Copyright 2025 Adrian Medina

Permission to use, copy, modify, and/or distribute this software for
any purpose with or without fee is hereby granted, provided that the
above copyright notice and this permission notice appear in all
copies.

THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL
WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE
AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL
DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR
PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
PERFORMANCE OF THIS SOFTWARE.
