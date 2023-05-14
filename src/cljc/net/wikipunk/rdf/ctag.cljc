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
   #voc/lstr
    "Common Tag RDF vocabulary, described using W3C RDF Schema. Common Tags allows documents and document fragments (any resource which can be identified by a URI) to be labeled with keywords and URIs, unambigiously idenfying the concepts covered by the resource.@en",
   :dc11/title #voc/lstr "Common Tag vocabulary@en",
   :dcat/downloadURL
   "https://lov.linkeddata.es/dataset/lov/vocabs/ctag/versions/2009-06-08.n3",
   :dcterms/issued "2009-06-08",
   :rdf/ns-prefix-map {"ctag"    "http://commontag.org/ns#",
                       "dc11"    "http://purl.org/dc/elements/1.1/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "ctag",
   :rdfa/uri "http://commontag.org/ns#",
   :rdfs/isDefinedBy {:rdf/uri "http://commontag.org/Specification"},
   :rdfs/label #voc/lstr "Common Tag vocabulary@en",
   :rdfs/seeAlso ["http://commontag.org/mappings"]})

(def AuthorTag
  "A Tag asserted by the author of a content resource."
  {:db/ident        :ctag/AuthorTag,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #voc/lstr
                     "A Tag asserted by the author of a content resource.@en",
   :rdfs/label      #voc/lstr "Author Tag@en",
   :rdfs/subClassOf [:ctag/Tag :ctag/AuthorTag :rdfs/Resource]})

(def AutoTag
  "A Tag asserted by an automated tool on a content resource."
  {:db/ident :ctag/AutoTag,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr "A Tag asserted by an automated tool on a content resource.@en",
   :rdfs/label #voc/lstr "Auto Tag@en",
   :rdfs/subClassOf [:ctag/Tag :ctag/AutoTag :rdfs/Resource]})

(def ReaderTag
  "A Tag asserted by the reader (consumer) of a content resource."
  {:db/ident :ctag/ReaderTag,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "A Tag asserted by the reader (consumer) of a content resource.@en",
   :rdfs/label #voc/lstr "Reader Tag@en",
   :rdfs/subClassOf [:ctag/Tag :ctag/ReaderTag :rdfs/Resource]})

(def Tag
  "A Common Tag associating a URI and a keyword to annotate a resource."
  {:db/ident :ctag/Tag,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "A Common Tag associating a URI and a keyword to annotate a resource.@en",
   :rdfs/label #voc/lstr "Tag@en",
   :rdfs/subClassOf [:rdfs/Resource :ctag/Tag]})

(def TaggedContent
  "Content which has one or more Common Tag."
  {:db/ident        :ctag/TaggedContent,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #voc/lstr "Content which has one or more Common Tag.@en",
   :rdfs/label      #voc/lstr "Tagged Content@en",
   :rdfs/subClassOf [:rdfs/Resource :ctag/TaggedContent]})

(def isAbout
  "A resource (URI) representing the concepts described by the content."
  {:db/ident :ctag/isAbout,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A resource (URI) representing the concepts described by the content.@en",
   :rdfs/domain :ctag/TaggedContent,
   :rdfs/label #voc/lstr "is about@en",
   :rdfs/subPropertyOf :ctag/isAbout})

(def label
  "A local, human-readable name for a Tag."
  {:db/ident           :ctag/label,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "A local, human-readable name for a Tag.@en",
   :rdfs/domain        :ctag/Tag,
   :rdfs/label         #voc/lstr "tag label@en",
   :rdfs/subPropertyOf [:rdfs/label :ctag/label]})

(def means
  "A a resource (URI) representing the conceptual meaning of a Tag."
  {:db/ident :ctag/means,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A a resource (URI) representing the conceptual meaning of a Tag.@en",
   :rdfs/domain :ctag/Tag,
   :rdfs/label #voc/lstr "means@en",
   :rdfs/subPropertyOf :ctag/means})

(def tagged
  "Links a resource to a Common Tag."
  {:db/ident           :ctag/tagged,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "Links a resource to a Common Tag.@en",
   :rdfs/domain        :ctag/TaggedContent,
   :rdfs/label         #voc/lstr "tagged@en",
   :rdfs/range         :ctag/Tag,
   :rdfs/subPropertyOf :ctag/tagged})

(def taggingDate
  "The date the Tag was assigned."
  {:db/ident           :ctag/taggingDate,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "The date the Tag was assigned.@en",
   :rdfs/domain        :ctag/Tag,
   :rdfs/label         #voc/lstr "tagging date@en",
   :rdfs/subPropertyOf [:dcterms/created :ctag/taggingDate]})