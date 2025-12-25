# rdf
Datomic-backed RDF/OWL tooling for Clojure.

![The Game](https://github.com/aamedina/rdf/assets/1291511/5f6f5455-6c4d-4871-ad92-9eddd017f2aa)

## What it does
Imports TTL/RDF/OWL into Datomic (idempotently), builds prefix maps + hierarchies
for `isa?` dispatch, and lets you `datafy` keywords/IRIs to explore the graph in
the REPL. The goal is coherent, inspectable state you can query like normal
Datomic data.

## Quick start
A minimal system config:

```clojure
{:client {:sc/create-fn datomic.client.api/client
          :system       "rdf"
          :server-type  :datomic-local}
 :db {:sc/create-fn net.wikipunk.datomic/map->Connection
      :sc/refs      [:client]
      :db-name      "rdf"}
 :db-migrate {:sc/create-fn net.wikipunk.datomic.migrate/map->Migrator
              :sc/refs      {:conn :db}
              :label        "RdfMigrator"
              :imports      [net.wikipunk.boot/dcterms
                             net.wikipunk.boot/skos
                             net.wikipunk.ext/d3f]
              :annotation-properties? true}
 :vocab {:sc/create-fn net.wikipunk.rdf/map->UniversalTranslator
         :sc/refs      {:env :db :env-migrate :db-migrate}
         :prefixes     {"rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
                        "rdfs" "http://www.w3.org/2000/01/rdf-schema#"
                        "owl"  "http://www.w3.org/2002/07/owl#"
                        "xsd"  "http://www.w3.org/2001/XMLSchema#"}}}
```

`:imports` accepts strings/URLs/classpath resources or vars from
`net.wikipunk.boot` / `net.wikipunk.ext`. Datomic local storage is configured in
`~/.datomic/local.edn` (recommended) or via `:storage-dir` in the client config.

## datafy
After the system is running:

```clojure
(require '[clojure.datafy :refer [datafy]])
(datafy :d3f/DefensiveTechnique)
```

`datafy` returns a normalized Datomic entity map for the ident or IRI.

## Multimethod dispatch
The translator installs derived hierarchies into Clojure’s global `isa?` tree.
Dispatch on `:rdf/type` naturally:

```clojure
(defmulti describe :rdf/type)
(defmethod describe :owl/Class [m] (:rdfs/label m))
```

## Development
Requirements: Clojure CLI, Datomic local.

Run:
```bash
clojure -M:dev
```

In the REPL:
```clojure
(reset)
```

## Tests
```bash
clojure -M:test
```

## License
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
