# rdf
RDF models as Clojure namespaces

### Make a new vocabulary with deps-new
``` bash
clojure -Sdeps '{:deps {io.github.aamedina/vocab {:git/sha "9fe0fa56625b9a7ceaf92b9f285863678ad3d786"}}}' -Tnew create :template aamedina/vocab :name net.wikipunk/example :rdfa/prefix "example" :rdfa/uri '"https://wikipunk.net/example/"' :git/sha '"7e688f78c3bfb92fa735f0f11d1418cd73a5b20a"'
```

### :rdfs/seeAlso 
https://github.com/seancorfield/deps-new

https://github.com/aamedina/vocab

## credits
https://github.com/arachne-framework/aristotle

https://www.w3.org/DesignIssues/

https://wikipunk.net/
