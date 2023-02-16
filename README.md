# rdf
RDF models as Clojure namespaces

### Make a new vocabulary with deps-new
``` bash
clojure -Sdeps '{:deps {io.github.aamedina/vocab {:git/sha "9fe0fa56625b9a7ceaf92b9f285863678ad3d786"}}}' -Tnew create :template aamedina/vocab :name net.wikipunk/example :rdfa/prefix "example" :rdfa/uri '"https://wikipunk.net/example/"' :git/sha '"7e688f78c3bfb92fa735f0f11d1418cd73a5b20a"'
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
