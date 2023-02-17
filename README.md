# rdf
RDF models as Clojure namespaces

## Universal Translator
A component should be configured for your system based on the following
example:

``` clojure
{:vocab  {:sc/create-fn net.wikipunk.rdf/map->UniversalTranslator
          :init-ns      net.wikipunk.mop.init
          :ns-prefix    "net.wikipunk.rdf."
          :target       "src/net/wikipunk/rdf/"
          :boot         []}}
```

This is a [schematic](https://github.com/walmartlabs/schematic)
configuration map which is assembled and started using
[component](https://github.com/stuartsierra/component).

### :init-ns
the ns-name of a Clojure namespace to load to implement methods of the
metaobject protocol found in `net.wikipunk.mop`

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

### Make a new vocabulary with deps-new
``` bash
clojure -Sdeps '{:deps {io.github.aamedina/vocab {:git/sha "7c818fea5e709e16afa24f68d6d8098a75078948"}}}' -Tnew create :template aamedina/vocab :name net.wikipunk/example :rdfa/prefix "example" :rdfa/uri '"https://wikipunk.net/example/"' :git/sha '"7e688f78c3bfb92fa735f0f11d1418cd73a5b20a"'
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
