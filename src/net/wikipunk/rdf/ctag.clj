(ns net.wikipunk.rdf.ctag
  "Common Tag vocabulary"
  {:dc11/contributor ["Jamie Taylor"
                      "Andraz Tori"
                      "Alexandre Passant"
                      "Peter Mika"
                      "Vuk Milicic"
                      "Scott Montgomerie"
                      "Alex Iskold"],
   :dc11/description
   {:rdf/language "en",
    :rdf/value
    "Common Tag RDF vocabulary, described using W3C RDF Schema. Common Tags allows documents and document fragments (any resource which can be identified by a URI) to be labeled with keywords and URIs, unambigiously idenfying the concepts covered by the resource."},
   :dc11/title {:rdf/language "en",
                :rdf/value    "Common Tag vocabulary"},
   :dcat/downloadURL
   "https://lov.linkeddata.es/dataset/lov/vocabs/ctag/versions/2009-06-08.n3",
   :dcterms/issued "2009-06-08",
   :rdf/ns-prefix-map {"ctag"    "http://commontag.org/ns#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://commontag.org/ns#",
   :rdfa/prefix "ctag",
   :rdfa/uri "http://commontag.org/ns#",
   :rdfs/isDefinedBy {:rdf/uri "http://commontag.org/Specification"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Common Tag vocabulary"},
   :rdfs/seeAlso "http://commontag.org/mappings"})

(def AuthorTag
  "A Tag asserted by the author of a content resource."
  {:db/ident        :ctag/AuthorTag,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value
                     "A Tag asserted by the author of a content resource."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Author Tag"},
   :rdfs/subClassOf :ctag/Tag})

(def AutoTag
  "A Tag asserted by an automated tool on a content resource."
  {:db/ident :ctag/AutoTag,
   :rdf/type :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "A Tag asserted by an automated tool on a content resource."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Auto Tag"},
   :rdfs/subClassOf :ctag/Tag})

(def ReaderTag
  "A Tag asserted by the reader (consumer) of a content resource."
  {:db/ident :ctag/ReaderTag,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Tag asserted by the reader (consumer) of a content resource."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Reader Tag"},
   :rdfs/subClassOf :ctag/Tag})

(def Tag
  "A Common Tag associating a URI and a keyword to annotate a resource."
  {:db/ident :ctag/Tag,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Common Tag associating a URI and a keyword to annotate a resource."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tag"}})

(def TaggedContent
  "Content which has one or more Common Tag."
  {:db/ident     :ctag/TaggedContent,
   :rdf/type     :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Content which has one or more Common Tag."},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Tagged Content"}})

(def isAbout
  "A resource (URI) representing the concepts described by the content."
  {:db/ident :ctag/isAbout,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A resource (URI) representing the concepts described by the content."},
   :rdfs/domain :ctag/TaggedContent,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is about"}})

(def label
  "A local, human-readable name for a Tag."
  {:db/ident           :ctag/label,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value "A local, human-readable name for a Tag."},
   :rdfs/domain        :ctag/Tag,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "tag label"},
   :rdfs/subPropertyOf :rdfs/label})

(def means
  "A a resource (URI) representing the conceptual meaning of a Tag."
  {:db/ident :ctag/means,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A a resource (URI) representing the conceptual meaning of a Tag."},
   :rdfs/domain :ctag/Tag,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "means"}})

(def tagged
  "Links a resource to a Common Tag."
  {:db/ident     :ctag/tagged,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Links a resource to a Common Tag."},
   :rdfs/domain  :ctag/TaggedContent,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "tagged"},
   :rdfs/range   :ctag/Tag})

(def taggingDate
  "The date the Tag was assigned."
  {:db/ident           :ctag/taggingDate,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "The date the Tag was assigned."},
   :rdfs/domain        :ctag/Tag,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "tagging date"},
   :rdfs/subPropertyOf :dcterms/created})