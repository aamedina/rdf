### Make a new vocabulary with deps-new
``` bash
clojure -Sdeps '{:deps {io.github.aamedina/vocab {:git/sha "85455e9d83106e75bd2fe9d5c8b9e2cb56c19891"}}}' -Tnew create :template aamedina/vocab :name net.wikipunk/example :rdfa/prefix "example" :rdfa/uri '"https://wikipunk.net/example/"' :git/sha '"e54ec56c3c17d6b2f6534942e74e2021783885df"'
```

### :rdfa/prefix 
names the vocabulary
### :rdfa/uri
provide the URI for the vocabulary
### :git/sha
provide the :git/sha for io.github.aamedina/rdf in deps.edn
