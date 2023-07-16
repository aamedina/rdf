# rdf
RDF models as Clojure(script) namespaces

## Universal Translator
A component should be configured for your system based on the following
example:

``` clojure
{:vocab  {:sc/create-fn net.wikipunk.rdf/map->UniversalTranslator
          :init-ns      net.wikipunk.mop.init
          :ns-prefix    "net.wikipunk.rdf."
          :boot         []
          :config       {:xtdb.lucene/lucene-store
                         {:db-dir ".vocab/lucene"}}}}
```

This is a [schematic](https://github.com/walmartlabs/schematic)
configuration map which is assembled and started using
[component](https://github.com/stuartsierra/component).

### :init-ns
the ns-name of a Clojure namespace to load to implement methods of the
[metaobject protocol](http://www.lispworks.com/documentation/lw80/MOP/mop/index.html).

### :ns-prefix 
the prefix string to use when locating metaobjects in your system
(optional, defaults to above)

### :target
the output directory where the Universal Translator should place
emitted Clojure namespaces from RDF models 
(optional, defaults to above)

### :boot
Provide a list of namespaces (instances of :jsonld/Context) where vars
are `:rdfa/PrefixMapping` instances which can be emitted (via
`net.wikipunk.rdf/emit`). For example in the `net.wikipunk.boot`
namespace which corresponds to the RDFa 1.1 initial context;

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

`:dcat/downloadURL` is used to declare the location of the RDF/OWL
document to download when emitting a Clojure namespace and override
the value of `:rdfa/uri`.

### :config
[XTDB](https://github.com/xtdb/xtdb) node configuration to store the
loaded vocabulary in-memory or locally. (optional, required to create
an environment to bootstrap a Datomic Cloud or dev-local database)

### Boot namespace
The convention is to place a file containing the JSON-LD context for
your project organized into a Clojure namespace called boot.cljc. 

For example, for this project it is located at
src/cljc/net/wikipunk/boot.cljc.

### :dev

#### Requirements
* [Clojure CLI](https://clojure.org/guides/install_clojure)
* [Datomic dev-local](https://docs.datomic.com/cloud/dev-local.html)

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
;;       :rdfs/Resource
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
2. XTDB node -- When an XTDB node is bound to the environment
   metaobjects are resolved by looking the idents up using
   xtdb.api/entity.
3. Datomic -- When a net.wikipunk.datomic.Connection is bound to the
   environment metaobjects are resolved by looking up the idents using
   datomic.client.api/pull.

## wikipunk.net extensions
* [net.wikipunk/openai](https://github.com/aamedina/openai)
* [net.wikipunk/qdrant](https://github.com/aamedina/qdrant)
* [net.wikipunk/punk.qudt](https://github.com/aamedina/punk.qudt)
* [net.wikipunk/fibo](https://github.com/aamedina/fibo)
* [net.wikipunk/ssvc](https://github.com/aamedina/ssvc)
* [net.wikipunk/lv2](https://github.com/aamedina/lv2)

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
