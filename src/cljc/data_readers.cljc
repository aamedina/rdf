{rdf/langString #?(:clj net.wikipunk.rdf/read-langString
                   :cljs  clojure.core/identity)
 rdf/blank      #?(:clj net.wikipunk.rdf/read-blank
                   :cljs  clojure.core/identity)
 xsd/anyURI     #?(:clj net.wikipunk.rdf/read-anyURI
                   :cljs  clojure.core/identity)
 rdf/HTML       #?(:clj net.wikipunk.rdf/read-html
                   :cljs  clojure.core/identity)
 rdf/JSON       #?(:clj net.wikipunk.rdf/read-json
                   :cljs  clojure.core/identity)
 rdf/XMLLiteral #?(:clj net.wikipunk.rdf/read-xml
                   :cljs  clojure.core/identity)
 a/n            asami.graph/node-read}
