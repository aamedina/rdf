# rdf
RDF models as Clojure namespaces

## Universal Translator
A component should be configured for your system based on the following
example:

``` clojure
{:vocab  {:sc/create-fn net.wikipunk.rdf/map->UniversalTranslator
          :init-ns      net.wikipunk.temple.init
          :ns-prefix    "net.wikipunk.rdf."
          :boot         []
          :config       {:xtdb/index-store
                         {:kv-store
                          {:xtdb/module xtdb.lmdb/->kv-store
                           :db-dir      ".vocab/index-store"}}
                         :xtdb/tx-log
                         {:kv-store
                          {:xtdb/module xtdb.lmdb/->kv-store
                           :db-dir      ".vocab/tx-log"}}
                         :xtdb/document-store
                         {:kv-store
                          {:xtdb/module xtdb.lmdb/->kv-store
                           :db-dir      ".vocab/document-store"}}
                         :xtdb.lucene/lucene-store
                         {:db-dir ".vocab/lucene"}}}}
```

This is a [schematic](https://github.com/walmartlabs/schematic)
configuration map which is assembled and started using
[component](https://github.com/stuartsierra/component).

### :init-ns
the ns-name of a Clojure namespace to load to implement methods of the
[metaobject protocol](https://github.com/aamedina/mop).

### :ns-prefix 
the prefix string to use when locating metaobjects in your system
(optional, defaults to above)

### :target
the output directory where the Universal Translator should place
emitted Clojure namespaces from RDF models 
(optional, defaults to above)

### :boot
A list of namespace-qualified symbols resolving to vars with
:rdfa/prefix and :rdfa/uri mappings

(These vars should exist in in a 'boot' namespace with metadata of
{:rdf/type :jsonld/Context} where namespace prefixes for your system
should be looked up.)

### :config
[XTDB](https://github.com/xtdb/xtdb) node configuration to store the
loaded vocabulary in-memory or locally. (optional, defaults to above)

### :dev

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
use datafy on namespace qualified keywords to resolve metaobject data
without the properties added by the metaobject protocol
#### net.wikipunk.mop/find-class
use this to lookup the full classes by name including effective slots,
these maps can get pretty big, datafy is better for REPL use, but
find-class will give you everything
#### doc
Use the doc macro in the REPL to print the docstring on the Var
associated with the metaobject along with its computed
class-precedence-list. 

### Make a new vocabulary with deps-new
``` bash
clojure -Sdeps '{:deps {io.github.aamedina/vocab {:git/sha "cdcf68285dafc4a3be062d951153c0d0186bba19"}}}' -Tnew create :template aamedina/vocab :name net.wikipunk/example :rdfa/prefix "example" :rdfa/uri '"https://wikipunk.net/example/"' :git/sha '"2a7f7ac434e2dac11b48e8b9b09bb39c96c05e89"'
```

### :rdfa/prefix 
names the vocabulary
### :rdfa/uri
provide the URI for the vocabulary
### :git/sha
provide the :git/sha for io.github.aamedina/rdf in deps.edn

#### :rdfs/seeAlso 
https://github.com/seancorfield/deps-new

https://github.com/aamedina/vocab

## wikipunk.net extensions
* [net.wikipunk/mop](https://github.com/aamedina/mop)
* [net.wikipunk/temple](https://github.com/aamedina/temple)
* [net.wikipunk/openai](https://github.com/aamedina/openai)
* [net.wikipunk/db](https://github.com/aamedina/db)
* [net.wikipunk/punk](https://github.com/aamedina/punk)
* [net.wikipunk/punk.db](https://github.com/aamedina/punk.db)
* [net.wikipunk/punk.qudt](https://github.com/aamedina/punk.qudt)
* [net.wikipunk/punk.skos](https://github.com/aamedina/punk.skos)
* [net.wikipunk/punk.test](https://github.com/aamedina/punk.test)
* [net.wikipunk/abulafia](https://github.com/aamedina/abulafia)
* [net.wikipunk/OBO](https://github.com/aamedina/OBO)
* [net.wikipunk/loc](https://github.com/aamedina/loc)
* [net.wikipunk/fibo](https://github.com/aamedina/fibo)
* [net.wikipunk/auto](https://github.com/aamedina/auto)

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
