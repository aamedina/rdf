# rdf
RDF models as Clojure(script) namespaces

### Schematic

``` clojure
{:asami  {:sc/create-fn net.wikipunk.asami/map->Connection
          :uri          "asami:mem://.vocab"}
 :vocab  {:sc/create-fn net.wikipunk.rdf/map->UniversalTranslator
          ;; add components that require RDF vocabulary and optionally
	      ;; provide asami or datomic as an environment
	      :sc/refs {:env :asami}
	      ;; the string to prefix the namespace generated for your rdf models
          :ns-prefix    "net.wikipunk.rdf." 
          ;; the project relative path to output the namespaces
	      :output-to    "src/cljc/net/wikipunk/rdf/"
          ;; used to declare what namespaces should be in the boot JSON-LD context
          ;; see below for more information
          :context      []}}
```

This is a [schematic](https://github.com/walmartlabs/schematic)
configuration map which is assembled and started using
[component](https://github.com/stuartsierra/component).

### :context
Provide a list of namespaces (tagged with :rdf/type :jsonld/Context in
their metadata) where its vars are `:rdfa/PrefixMapping` instances which can be emitted (via
`net.wikipunk.rdf/emit`). 

For an example see the `net.wikipunk.boot` namespace which corresponds
to the RDFa 1.1 initial context;

``` clojure
(def as
  "Activity Vocabulary"
  {:dcat/downloadURL "https://raw.githubusercontent.com/w3c/activitystreams/master/vocabulary/activitystreams2.owl"
   :rdfa/uri         "https://www.w3.org/ns/activitystreams#",
   :rdfa/prefix      "as",
   :rdfs/isDefinedBy {:rdfa/uri
                      "https://www.w3.org/TR/activitystreams-vocabulary/"},
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

### Boot namespace
The convention is to place a file containing the JSON-LD context for
your project organized into a Clojure namespace called boot.cljc. 

For example, for this project it is located at
src/cljc/net/wikipunk/boot.cljc.

### :dev

#### Requirements
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
{:db/ident :schema/Movie,
 :rdf/type :owl/Class,
 :rdfs/comment {:rdf/language "en", :rdf/value "A movie."},
 :rdfs/isDefinedBy "http://schema.org/Movie",
 :rdfs/label {:rdf/language "en", :rdf/value "Movie"},
 :rdfs/subClassOf :schema/CreativeWork}
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
;;     :owl/Class
;;      :rdfs/Class
```

Most methods in the metaobject protocol dispatch on the :rdf/type of
the object.

The following describes an anonymous :owl/Class with no properties:
``` clojure
{:rdf/type :owl/Class}
```

#### datafy
Use clojure.datafy/datafy to find out what a metaobject means by
providing a namespace qualified keyword to retrieve it from the
currently bound environment.

#### net.wikipunk.mop/*env*
The *env* variable holds the current environment in which metaobjects
are resolved. It can be one of three values:

1. nil -- When nil, metaobjects are resolved in Clojure namespaces by
   looking up the namespace as a prefix in a registry and then looking
   up the name in that namespace.
2. Asami -- When an Asami (`net.wikipunk.asami.Connection`) is bound
   to the environment metaobjects are resolved by looking the idents
   up using `asami.core/entity`.
3. Datomic -- When a `net.wikipunk.datomic.Connection` is bound to the
   environment metaobjects are resolved by looking up the idents using
   `datomic.client.api/pull`.


### credits
https://github.com/arachne-framework/aristotle

https://www.w3.org/DesignIssues/

https://wikipunk.net/

### License
Copyright 2023 Adrian Medina

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
