(ns net.wikipunk.rdf.bibo
  "The Bibliographic Ontology describes\nbibliographic things on the semantic Web in RDF.  This ontology can be\nused as a citation ontology, as a document classification ontology, or\nsimply as a way to describe any kind of document in RDF. It has been\ninspired by many existing document description metadata formats, and\ncan be used as a common ground for converting other bibliographic data\nsources."
  {:dcterms/creator [:bibo/fgiasson :bibo/bdarcus],
   :dcterms/description
   #xsd/langString
    "The Bibliographic Ontology describes\nbibliographic things on the semantic Web in RDF.  This ontology can be\nused as a citation ontology, as a document classification ontology, or\nsimply as a way to describe any kind of document in RDF. It has been\ninspired by many existing document description metadata formats, and\ncan be used as a common ground for converting other bibliographic data\nsources.@en",
   :dcterms/title #xsd/string "The Bibliographic Ontology",
   :owl/versionInfo #xsd/string "http://purl.org/ontology/bibo/1.3/",
   :rdf/ns-prefix-map {"bibo" "http://purl.org/ontology/bibo/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "degrees" "http://purl.org/ontology/bibo/degrees/",
                       "event" "http://purl.org/NET/c4dm/event.owl#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "prism" "http://prismstandard.org/namespaces/1.2/basic/",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "schema" "http://schemas.talis.com/2005/address/schema#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "status" "http://purl.org/ontology/bibo/status/",
                       "vann" "http://purl.org/vocab/vann/",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "bibo",
   :rdfa/uri "http://purl.org/ontology/bibo/"})

(def AcademicArticle
  "A scholarly academic article, typically published in a journal."
  {:db/ident :bibo/AcademicArticle,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A scholarly academic article, typically published in a journal.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Academic Article@en",
   :rdfs/subClassOf [:bibo/Article :bibo/Document],
   :vs/term_status #xsd/string "stable"})

(def Article
  "A written composition in prose, usually nonfiction, on a specific topic, forming an independent part of a book or other publication, as a newspaper or magazine."
  {:db/ident :bibo/Article,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A written composition in prose, usually nonfiction, on a specific topic, forming an independent part of a book or other publication, as a newspaper or magazine.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Article@en",
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status #xsd/string "stable"})

(def AudioDocument
  "An audio document; aka record."
  {:db/ident         :bibo/AudioDocument,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "An audio document; aka record.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "audio document@en",
   :rdfs/subClassOf  :bibo/Document,
   :vs/term_status   #xsd/string "stable"})

(def AudioVisualDocument
  "An audio-visual document; film, video, and so forth."
  {:db/ident         :bibo/AudioVisualDocument,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString
                      "An audio-visual document; film, video, and so forth.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "audio-visual document@en",
   :rdfs/subClassOf  :bibo/Document,
   :vs/term_status   #xsd/string "stable"})

(def Bill
  "Draft legislation presented for discussion to a legal body."
  {:db/ident :bibo/Bill,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Draft legislation presented for discussion to a legal body.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Bill@en",
   :rdfs/subClassOf [:bibo/Legislation :bibo/LegalDocument :bibo/Document],
   :vs/term_status #xsd/string "stable"})

(def Book
  "A written or printed work of fiction or nonfiction, usually on sheets of paper fastened or bound together within covers."
  {:db/ident :bibo/Book,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A written or printed work of fiction or nonfiction, usually on sheets of paper fastened or bound together within covers.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Book@en",
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status #xsd/string "stable"})

(def BookSection
  "A section of a book."
  {:db/ident         :bibo/BookSection,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "A section of a book.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "Book Section@en",
   :rdfs/subClassOf  [:bibo/DocumentPart
                      {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                       :owl/onProperty     :dcterms/isPartOf,
                       :rdf/type           :owl/Restriction}
                      :bibo/Document],
   :vs/term_status   #xsd/string "unstable"})

(def Brief
  "A written argument submitted to a court."
  {:db/ident         :bibo/Brief,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString
                      "A written argument submitted to a court.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "Brief@en",
   :rdfs/subClassOf  [:bibo/LegalCaseDocument
                      :bibo/LegalDocument
                      :bibo/Document],
   :vs/term_status   #xsd/string "unstable"})

(def Chapter
  "A chapter of a book."
  {:db/ident         :bibo/Chapter,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "A chapter of a book.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "Chapter@en",
   :rdfs/subClassOf  [:bibo/BookSection
                      :bibo/DocumentPart
                      {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                       :owl/onProperty     :dcterms/isPartOf,
                       :rdf/type           :owl/Restriction}
                      :bibo/Document],
   :vs/term_status   #xsd/string "unstable"})

(def Code
  "A collection of statutes."
  {:db/ident         :bibo/Code,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "A collection of statutes.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "Code@en",
   :rdfs/subClassOf  [{:owl/allValuesFrom :bibo/Legislation,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality #xsd/nonNegativeInteger 1,
                       :owl/onProperty     :dcterms/hasPart,
                       :rdf/type           :owl/Restriction}
                      :bibo/Periodical
                      {:owl/allValuesFrom {:owl/unionOf [:bibo/Collection
                                                         :bibo/Document],
                                           :rdf/type    :owl/Class},
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality #xsd/nonNegativeInteger 1,
                       :owl/onProperty     :dcterms/hasPart,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :bibo/Issue,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      :bibo/Collection],
   :vs/term_status   #xsd/string "stable"})

(def CollectedDocument
  "A document that simultaneously contains other documents."
  {:db/ident :bibo/CollectedDocument,
   :rdf/type :owl/Class,
   :rdfs/comment #xsd/langString
                  "A document that simultaneously contains other documents.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Collected Document@en",
   :rdfs/subClassOf [{:owl/minCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :dcterms/hasPart,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :bibo/Document,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     :bibo/Document],
   :vs/term_status #xsd/string "stable"})

(def Collection
  "A collection of Documents or Collections"
  {:db/ident         :bibo/Collection,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString
                      "A collection of Documents or Collections@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "Collection@en",
   :rdfs/subClassOf  {:owl/allValuesFrom {:owl/unionOf [:bibo/Collection
                                                        :bibo/Document],
                                          :rdf/type    :owl/Class},
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction},
   :vs/term_status   #xsd/string "stable"})

(def Conference
  "A meeting for consultation or discussion."
  {:db/ident         :bibo/Conference,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString
                      "A meeting for consultation or discussion.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "Conference@en",
   :rdfs/subClassOf  :event/Event,
   :vs/term_status   #xsd/string "stable"})

(def CourtReporter
  "A collection of legal cases."
  {:db/ident         :bibo/CourtReporter,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "A collection of legal cases.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "Court Reporter@en",
   :rdfs/subClassOf  [{:owl/allValuesFrom :bibo/LegalDocument,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality #xsd/nonNegativeInteger 1,
                       :owl/onProperty     :dcterms/hasPart,
                       :rdf/type           :owl/Restriction}
                      :bibo/Periodical
                      {:owl/allValuesFrom {:owl/unionOf [:bibo/Collection
                                                         :bibo/Document],
                                           :rdf/type    :owl/Class},
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality #xsd/nonNegativeInteger 1,
                       :owl/onProperty     :dcterms/hasPart,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :bibo/Issue,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      :bibo/Collection],
   :vs/term_status   #xsd/string "stable"})

(def Document
  "A document (noun) is a bounded physical representation of body of information designed with the capacity (and usually intent) to communicate. A document may manifest symbolic, diagrammatic or sensory-representational information."
  {:db/ident :bibo/Document,
   :owl/equivalentClass :foaf/Document,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A document (noun) is a bounded physical representation of body of information designed with the capacity (and usually intent) to communicate. A document may manifest symbolic, diagrammatic or sensory-representational information.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Document@en",
   :vs/term_status #xsd/string "stable"})

(def DocumentPart
  "a distinct part of a larger document or collected document."
  {:db/ident :bibo/DocumentPart,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "a distinct part of a larger document or collected document.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "document part@en",
   :rdfs/subClassOf [{:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :dcterms/isPartOf,
                      :rdf/type           :owl/Restriction}
                     :bibo/Document],
   :vs/term_status #xsd/string "unstable"})

(def DocumentStatus
  "The status of the publication of a document."
  {:db/ident         :bibo/DocumentStatus,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString
                      "The status of the publication of a document.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "Document Status@en",
   :vs/term_status   #xsd/string "stable"})

(def EditedBook
  "An edited book."
  {:db/ident         :bibo/EditedBook,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "An edited book.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "Edited Book@en",
   :rdfs/subClassOf  [:bibo/CollectedDocument
                      {:owl/minCardinality #xsd/nonNegativeInteger 1,
                       :owl/onProperty     :dcterms/hasPart,
                       :rdf/type           :owl/Restriction}
                      :bibo/Document
                      {:owl/allValuesFrom :bibo/Document,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}],
   :vs/term_status   #xsd/string "stable"})

(def Email
  "A written communication addressed to a person or organization and transmitted electronically."
  {:db/ident :bibo/Email,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A written communication addressed to a person or organization and transmitted electronically.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "EMail@en",
   :rdfs/subClassOf [:bibo/PersonalCommunicationDocument :bibo/Document],
   :vs/term_status #xsd/string "stable"})

(def Event
  {:db/ident :bibo/Event,
   :rdf/type :owl/Class})

(def Excerpt
  "A passage selected from a larger work."
  {:db/ident         :bibo/Excerpt,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString
                      "A passage selected from a larger work.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "Excerpt@en",
   :rdfs/subClassOf  [:bibo/DocumentPart
                      {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                       :owl/onProperty     :dcterms/isPartOf,
                       :rdf/type           :owl/Restriction}
                      :bibo/Document],
   :vs/term_status   #xsd/string "stable"})

(def Film
  "aka movie."
  {:db/ident         :bibo/Film,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "aka movie.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "Film@en",
   :rdfs/subClassOf  [:bibo/AudioVisualDocument :bibo/Document],
   :vs/term_status   #xsd/string "stable"})

(def Hearing
  "An instance or a session in which testimony and arguments are presented, esp. before an official, as a judge in a lawsuit."
  {:db/ident :bibo/Hearing,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "An instance or a session in which testimony and arguments are presented, esp. before an official, as a judge in a lawsuit.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Hearing@en",
   :rdfs/subClassOf :event/Event,
   :vs/term_status #xsd/string "stable"})

(def Image
  "A document that presents visual or diagrammatic information."
  {:db/ident :bibo/Image,
   :owl/equivalentClass :foaf/Image,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A document that presents visual or diagrammatic information.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Image@en",
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status #xsd/string "stable"})

(def Interview
  "A formalized discussion between two or more people."
  {:db/ident         :bibo/Interview,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString
                      "A formalized discussion between two or more people.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "Interview@en",
   :rdfs/subClassOf  :event/Event,
   :vs/term_status   #xsd/string "stable"})

(def Issue
  "something that is printed or published and distributed, esp. a given number of a periodical"
  {:db/ident :bibo/Issue,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "something that is printed or published and distributed, esp. a given number of a periodical@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Issue@en",
   :rdfs/subClassOf [{:owl/allValuesFrom :bibo/Article,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     {:owl/minCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :dcterms/hasPart,
                      :rdf/type           :owl/Restriction}
                     :bibo/CollectedDocument
                     {:owl/minCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :dcterms/hasPart,
                      :rdf/type           :owl/Restriction}
                     :bibo/Document
                     {:owl/allValuesFrom :bibo/Document,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}],
   :vs/term_status #xsd/string "stable"})

(def Journal
  "A periodical of scholarly journal Articles."
  {:db/ident         :bibo/Journal,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString
                      "A periodical of scholarly journal Articles.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "Journal@en",
   :rdfs/subClassOf  [{:owl/allValuesFrom :bibo/Issue,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality #xsd/nonNegativeInteger 1,
                       :owl/onProperty     :dcterms/hasPart,
                       :rdf/type           :owl/Restriction}
                      :bibo/Periodical
                      {:owl/allValuesFrom {:owl/unionOf [:bibo/Collection
                                                         :bibo/Document],
                                           :rdf/type    :owl/Class},
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality #xsd/nonNegativeInteger 1,
                       :owl/onProperty     :dcterms/hasPart,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :bibo/Issue,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      :bibo/Collection],
   :vs/term_status   #xsd/string "stable"})

(def LegalCaseDocument
  "A document accompanying a legal case."
  {:db/ident         :bibo/LegalCaseDocument,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "A document accompanying a legal case.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "Legal Case Document@en",
   :rdfs/subClassOf  [:bibo/LegalDocument :bibo/Document],
   :vs/term_status   #xsd/string "unstable"})

(def LegalDecision
  "A document containing an authoritative determination (as a decree or judgment) made after consideration of facts or law."
  {:db/ident :bibo/LegalDecision,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A document containing an authoritative determination (as a decree or judgment) made after consideration of facts or law.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Decision@en",
   :rdfs/subClassOf
   [:bibo/LegalCaseDocument :bibo/LegalDocument :bibo/Document],
   :vs/term_status #xsd/string "unstable"})

(def LegalDocument
  "A legal document; for example, a court decision, a brief, and so forth."
  {:db/ident :bibo/LegalDocument,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A legal document; for example, a court decision, a brief, and so forth.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Legal Document@en",
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status #xsd/string "stable"})

(def Legislation
  "A legal document proposing or enacting a law or a group of laws."
  {:db/ident :bibo/Legislation,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A legal document proposing or enacting a law or a group of laws.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Legislation@en",
   :rdfs/subClassOf [:bibo/LegalDocument :bibo/Document],
   :vs/term_status #xsd/string "unstable"})

(def Letter
  "A written or printed communication addressed to a person or organization and usually transmitted by mail."
  {:db/ident :bibo/Letter,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A written or printed communication addressed to a person or organization and usually transmitted by mail.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Letter@en",
   :rdfs/subClassOf [:bibo/PersonalCommunicationDocument :bibo/Document],
   :vs/term_status #xsd/string "stable"})

(def Magazine
  "A periodical of magazine Articles. A magazine is a publication that is issued periodically, usually bound in a paper cover, and typically contains essays, stories, poems, etc., by many writers, and often photographs and drawings, frequently specializing in a particular subject or area, as hobbies, news, or sports."
  {:db/ident :bibo/Magazine,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A periodical of magazine Articles. A magazine is a publication that is issued periodically, usually bound in a paper cover, and typically contains essays, stories, poems, etc., by many writers, and often photographs and drawings, frequently specializing in a particular subject or area, as hobbies, news, or sports.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Magazine@en",
   :rdfs/subClassOf [{:owl/allValuesFrom :bibo/Issue,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     {:owl/minCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :dcterms/hasPart,
                      :rdf/type           :owl/Restriction}
                     :bibo/Periodical
                     {:owl/allValuesFrom {:owl/unionOf [:bibo/Collection
                                                        :bibo/Document],
                                          :rdf/type    :owl/Class},
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     {:owl/minCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :dcterms/hasPart,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :bibo/Issue,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     :bibo/Collection],
   :vs/term_status #xsd/string "stable"})

(def Manual
  "A small reference book, especially one giving instructions."
  {:db/ident :bibo/Manual,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A small reference book, especially one giving instructions.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Manual@en",
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status #xsd/string "unstable"})

(def Manuscript
  "An unpublished Document, which may also be submitted to a publisher for publication."
  {:db/ident :bibo/Manuscript,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "An unpublished Document, which may also be submitted to a publisher for publication.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Manuscript@en",
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status #xsd/string "stable"})

(def Map
  "A graphical depiction of geographic features."
  {:db/ident         :bibo/Map,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString
                      "A graphical depiction of geographic features.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "Map@en",
   :rdfs/subClassOf  [:bibo/Image :bibo/Document],
   :vs/term_status   #xsd/string "unstable"})

(def MultiVolumeBook
  "A loose, thematic, collection of Documents, often Books."
  {:db/ident :bibo/MultiVolumeBook,
   :rdf/type :owl/Class,
   :rdfs/comment #xsd/langString
                  "A loose, thematic, collection of Documents, often Books.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Multivolume Book@en",
   :rdfs/subClassOf [{:owl/allValuesFrom :bibo/Book,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     :bibo/Collection
                     {:owl/allValuesFrom {:owl/unionOf [:bibo/Collection
                                                        :bibo/Document],
                                          :rdf/type    :owl/Class},
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}],
   :vs/term_status #xsd/string "stable"})

(def Newspaper
  "A periodical of documents, usually issued daily or weekly, containing current news, editorials, feature articles, and usually advertising."
  {:db/ident :bibo/Newspaper,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A periodical of documents, usually issued daily or weekly, containing current news, editorials, feature articles, and usually advertising.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Newspaper@en",
   :rdfs/subClassOf [{:owl/allValuesFrom :bibo/Issue,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     {:owl/minCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :dcterms/hasPart,
                      :rdf/type           :owl/Restriction}
                     :bibo/Periodical
                     {:owl/allValuesFrom {:owl/unionOf [:bibo/Collection
                                                        :bibo/Document],
                                          :rdf/type    :owl/Class},
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     {:owl/minCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :dcterms/hasPart,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :bibo/Issue,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     :bibo/Collection],
   :vs/term_status #xsd/string "stable"})

(def Note
  "Notes or annotations about a resource."
  {:db/ident         :bibo/Note,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString
                      "Notes or annotations about a resource.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "Note@en",
   :rdfs/subClassOf  :bibo/Document,
   :vs/term_status   #xsd/string "stable"})

(def Patent
  "A document describing the exclusive right granted by a government to an inventor to manufacture, use, or sell an invention for a certain number of years."
  {:db/ident :bibo/Patent,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A document describing the exclusive right granted by a government to an inventor to manufacture, use, or sell an invention for a certain number of years.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Patent@en",
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status #xsd/string "stable"})

(def Performance
  "A public performance."
  {:db/ident         :bibo/Performance,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "A public performance.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "Performance@en",
   :rdfs/subClassOf  :event/Event,
   :vs/term_status   #xsd/string "unstable"})

(def Periodical
  "A group of related documents issued at regular intervals."
  {:db/ident :bibo/Periodical,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A group of related documents issued at regular intervals.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Periodical@en",
   :rdfs/subClassOf [{:owl/allValuesFrom :bibo/Issue,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     {:owl/minCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :dcterms/hasPart,
                      :rdf/type           :owl/Restriction}
                     :bibo/Collection
                     {:owl/allValuesFrom {:owl/unionOf [:bibo/Collection
                                                        :bibo/Document],
                                          :rdf/type    :owl/Class},
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}],
   :vs/term_status #xsd/string "stable"})

(def PersonalCommunication
  "A communication between an agent and one or more specific recipients."
  {:db/ident :bibo/PersonalCommunication,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A communication between an agent and one or more specific recipients.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Personal Communication@en",
   :rdfs/subClassOf :event/Event,
   :vs/term_status #xsd/string "stable"})

(def PersonalCommunicationDocument
  "A personal communication manifested in some document."
  {:db/ident :bibo/PersonalCommunicationDocument,
   :rdf/type :owl/Class,
   :rdfs/comment #xsd/langString
                  "A personal communication manifested in some document.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Personal Communication Document@en",
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status #xsd/string "stable"})

(def Proceedings
  "A compilation of documents published from an event, such as a conference."
  {:db/ident :bibo/Proceedings,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A compilation of documents published from an event, such as a conference.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Proceedings@en",
   :rdfs/subClassOf [:bibo/Book :bibo/Document],
   :vs/term_status #xsd/string "unstable"})

(def Quote
  "An excerpted collection of words."
  {:db/ident         :bibo/Quote,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "An excerpted collection of words.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "Quote@en",
   :rdfs/subClassOf  [:bibo/Excerpt
                      :bibo/DocumentPart
                      {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                       :owl/onProperty     :dcterms/isPartOf,
                       :rdf/type           :owl/Restriction}
                      :bibo/Document],
   :vs/term_status   #xsd/string "stable"})

(def ReferenceSource
  "A document that presents authoritative reference information, such as a dictionary or encylopedia ."
  {:db/ident :bibo/ReferenceSource,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A document that presents authoritative reference information, such as a dictionary or encylopedia .@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Reference Source@en",
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status #xsd/string "unstable"})

(def Report
  "A document describing an account or statement describing in detail an event, situation, or the like, usually as the result of observation, inquiry, etc.."
  {:db/ident :bibo/Report,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A document describing an account or statement describing in detail an event, situation, or the like, usually as the result of observation, inquiry, etc..@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Report@en",
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status #xsd/string "stable"})

(def Series
  "A loose, thematic, collection of Documents, often Books."
  {:db/ident :bibo/Series,
   :rdf/type :owl/Class,
   :rdfs/comment #xsd/langString
                  "A loose, thematic, collection of Documents, often Books.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Series@en",
   :rdfs/subClassOf [{:owl/allValuesFrom :bibo/Document,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     :bibo/Collection
                     {:owl/allValuesFrom {:owl/unionOf [:bibo/Collection
                                                        :bibo/Document],
                                          :rdf/type    :owl/Class},
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}],
   :vs/term_status #xsd/string "stable"})

(def Slide
  "A slide in a slideshow"
  {:db/ident         :bibo/Slide,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "A slide in a slideshow@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "Slide@en",
   :rdfs/subClassOf  [:bibo/DocumentPart
                      {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                       :owl/onProperty     :dcterms/isPartOf,
                       :rdf/type           :owl/Restriction}
                      :bibo/Document],
   :vs/term_status   #xsd/string "unstable"})

(def Slideshow
  "A presentation of a series of slides, usually presented in front of an audience with written text and images."
  {:db/ident :bibo/Slideshow,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A presentation of a series of slides, usually presented in front of an audience with written text and images.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Slideshow@en",
   :rdfs/subClassOf [{:owl/allValuesFrom :bibo/Slide,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     :bibo/Document],
   :vs/term_status #xsd/string "stable"})

(def Specification
  "A document describing a specification."
  {:db/ident         :bibo/Specification,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString
                      "A document describing a specification.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "Specification@en",
   :rdfs/subClassOf  :bibo/Document,
   :vs/term_status   #xsd/string "testing"})

(def Standard
  "A document describing a standard: a specification organized through a standards body."
  {:db/ident :bibo/Standard,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A document describing a standard: a specification organized through a standards body.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Standard@en",
   :rdfs/subClassOf [:bibo/Specification :bibo/Document],
   :vs/term_status #xsd/string "stable"})

(def Statute
  "A bill enacted into law."
  {:db/ident         :bibo/Statute,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "A bill enacted into law.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "Statute@en",
   :rdfs/subClassOf  [:bibo/Legislation :bibo/LegalDocument :bibo/Document],
   :vs/term_status   #xsd/string "stable"})

(def Thesis
  "A document created to summarize research findings associated with the completion of an academic degree."
  {:db/ident :bibo/Thesis,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A document created to summarize research findings associated with the completion of an academic degree.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Thesis@en",
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status #xsd/string "stable"})

(def ThesisDegree
  "The academic degree of a Thesis"
  {:db/ident         :bibo/ThesisDegree,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "The academic degree of a Thesis@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "Thesis degree@en",
   :vs/term_status   #xsd/string "stable"})

(def Webpage
  "A web page is an online document available (at least initially) on the world wide web. A web page is written first and foremost to appear on the web, as distinct from other online resources such as books, manuscripts or audio documents which use the web primarily as a distribution mechanism alongside other more traditional methods such as print."
  {:db/ident :bibo/Webpage,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A web page is an online document available (at least initially) on the world wide web. A web page is written first and foremost to appear on the web, as distinct from other online resources such as books, manuscripts or audio documents which use the web primarily as a distribution mechanism alongside other more traditional methods such as print.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Webpage@en",
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status #xsd/string "unstable"})

(def Website
  "A group of Webpages accessible on the Web."
  {:db/ident         :bibo/Website,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString
                      "A group of Webpages accessible on the Web.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "Website@en",
   :rdfs/subClassOf  [{:owl/allValuesFrom :bibo/Webpage,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality #xsd/nonNegativeInteger 1,
                       :owl/onProperty     :dcterms/hasPart,
                       :rdf/type           :owl/Restriction}
                      :bibo/Collection
                      {:owl/allValuesFrom {:owl/unionOf [:bibo/Collection
                                                         :bibo/Document],
                                           :rdf/type    :owl/Class},
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}],
   :vs/term_status   #xsd/string "unstable"})

(def Workshop
  "A seminar, discussion group, or the like, that emphasizes zxchange of ideas and the demonstration and application of techniques, skills, etc."
  {:db/ident :bibo/Workshop,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A seminar, discussion group, or the like, that emphasizes zxchange of ideas and the demonstration and application of techniques, skills, etc.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "Workshop@en",
   :rdfs/subClassOf :event/Event,
   :vs/term_status #xsd/string "stable"})

(def abstract
  "A summary of the resource."
  {:db/ident         :bibo/abstract,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #xsd/string "A summary of the resource.",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/string "abstract",
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   #xsd/string "stable"})

(def affirmedBy
  "A legal decision that affirms a ruling."
  {:db/ident           :bibo/affirmedBy,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       #xsd/langString
                        "A legal decision that affirms a ruling.@en",
   :rdfs/domain        :bibo/LegalDecision,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/range         :bibo/LegalDecision,
   :rdfs/subPropertyOf [:bibo/subsequentLegalDecision :dcterms/isReferencedBy]})

(def annotates
  "Critical or explanatory note for a Document."
  {:db/ident           :bibo/annotates,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       #xsd/langString
                        "Critical or explanatory note for a Document.@en",
   :rdfs/domain        :bibo/Note,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label         #xsd/langString "annotates@en",
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :dcterms/relation,
   :vs/term_status     #xsd/string "stable"})

(def argued
  "The date on which a legal case is argued before a court. Date is of format xsd:date"
  {:db/ident :bibo/argued,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The date on which a legal case is argued before a court. Date is of format xsd:date@en",
   :rdfs/domain :bibo/LegalDocument,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "date argued@en",
   :rdfs/range :rdfs/Literal,
   :vs/term_status #xsd/string "unstable"})

(def asin
  {:db/ident           :bibo/asin,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def authorList
  "An ordered list of authors. Normally, this list is seen as a priority list that order authors by importance."
  {:db/ident :bibo/authorList,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "An ordered list of authors. Normally, this list is seen as a priority list that order authors by importance.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "list of authors@en",
   :rdfs/range {:owl/unionOf [:rdf/List :rdf/Seq],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :bibo/contributorList,
   :vs/term_status #xsd/string "stable"})

(def bdarcus
  "Bruce D'Arcus"
  {:db/ident         :bibo/bdarcus,
   :foaf/name        #xsd/string "Bruce D'Arcus",
   :rdf/type         [:foaf/Person :owl/NamedIndividual :owl/Thing],
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/seeAlso     {:rdfa/uri "http://purl.org/net/darcusb/info#me"}})

(def chapter
  "An chapter number"
  {:db/ident           :bibo/chapter,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       #xsd/langString "An chapter number@en",
   :rdfs/domain        :bibo/BookSection,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label         #xsd/langString "chapter@en",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/locator,
   :vs/term_status     #xsd/string "unstable"})

(def citedBy
  "Relates a document to another document that cites the\nfirst document."
  {:db/ident :bibo/citedBy,
   :owl/inverseOf :bibo/cites,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relates a document to another document that cites the\nfirst document.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "cited by@en",
   :rdfs/range :bibo/Document,
   :vs/term_status #xsd/string "unstable"})

(def cites
  "Relates a document to another document that is cited\nby the first document as reference, comment, review, quotation or for\nanother purpose."
  {:db/ident :bibo/cites,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relates a document to another document that is cited\nby the first document as reference, comment, review, quotation or for\nanother purpose.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "cites@en",
   :rdfs/range :bibo/Document,
   :rdfs/subPropertyOf :dcterms/references,
   :vs/term_status #xsd/string "unstable"})

(def coden
  {:db/ident           :bibo/coden,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def content
  "This property is for a plain-text rendering of the content of a Document. While the plain-text content of an entire document could be described by this property."
  {:db/ident :bibo/content,
   :owl/deprecated true,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "This property is for a plain-text rendering of the content of a Document. While the plain-text content of an entire document could be described by this property.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "content@en",
   :rdfs/range :rdfs/Literal,
   :skos/historyNote
   #xsd/langString
    "bibo:content has been deprecated; we recommend to use \"rdf:value\" for this purpose. Here is the rational behind this choice: http://www.w3.org/TR/2004/REC-rdf-primer-20040210/#rdfvalue@en",
   :vs/term_status #xsd/string "unstable"})

(def contributorList
  "An ordered list of contributors. Normally, this list is seen as a priority list that order contributors by importance."
  {:db/ident :bibo/contributorList,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "An ordered list of contributors. Normally, this list is seen as a priority list that order contributors by importance.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "list of contributors@en",
   :rdfs/range {:owl/unionOf [:rdf/List :rdf/Seq],
                :rdf/type    :owl/Class},
   :vs/term_status #xsd/string "stable"})

(def court
  "A court associated with a legal document; for example, that which issues a decision."
  {:db/ident :bibo/court,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "A court associated with a legal document; for example, that which issues a decision.@en",
   :rdfs/domain :bibo/LegalDocument,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "court@en",
   :rdfs/range :foaf/Organization,
   :vs/term_status #xsd/string "unstable"})

(def degree
  "The thesis degree."
  {:db/ident :bibo/degree,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment #xsd/langString "The thesis degree.@en",
   :rdfs/domain :bibo/Thesis,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "degree@en",
   :rdfs/range :bibo/ThesisDegree,
   :skos/editorialNote
   #xsd/langString
    "We are not defining, using an enumeration, the range of the bibo:degree to the defined list of bibo:ThesisDegree. We won't do it because we want people to be able to define new degress if needed by some special usecases. Creating such an enumeration would restrict this to happen.@en",
   :vs/term_status #xsd/string "unstable"})

(def director
  "A Film director."
  {:db/ident           :bibo/director,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       #xsd/langString "A Film director.@en",
   :rdfs/domain        :bibo/AudioVisualDocument,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label         #xsd/string "director",
   :rdfs/range         :foaf/Agent,
   :rdfs/subPropertyOf :dcterms/contributor,
   :vs/term_status     #xsd/string "stable"})

(def distributor
  "Distributor of a document or a collection of documents."
  {:db/ident :bibo/distributor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment #xsd/langString
                  "Distributor of a document or a collection of documents.@en",
   :rdfs/domain {:owl/unionOf [:bibo/Collection :bibo/Document],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "distributor@en",
   :rdfs/range :foaf/Agent,
   :vs/term_status #xsd/string "stable"})

(def doi
  {:db/ident           :bibo/doi,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def eanucc13
  {:db/ident           :bibo/eanucc13,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def edition
  "The name defining a special edition of a document. Normally its a literal value composed of a version number and words."
  {:db/ident :bibo/edition,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The name defining a special edition of a document. Normally its a literal value composed of a version number and words.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "edition@en",
   :rdfs/range :rdfs/Literal,
   :vs/term_status #xsd/string "stable"})

(def editor
  "A person having managerial and sometimes policy-making responsibility for the editorial part of a publishing firm or of a newspaper, magazine, or other publication."
  {:db/ident :bibo/editor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "A person having managerial and sometimes policy-making responsibility for the editorial part of a publishing firm or of a newspaper, magazine, or other publication.@en",
   :rdfs/domain {:owl/unionOf [:bibo/Collection :bibo/Document],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/string "editor",
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf :dcterms/contributor,
   :vs/term_status #xsd/string "stable"})

(def editorList
  "An ordered list of editors. Normally, this list is seen as a priority list that order editors by importance."
  {:db/ident :bibo/editorList,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "An ordered list of editors. Normally, this list is seen as a priority list that order editors by importance.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "list of editors@en",
   :rdfs/range {:owl/unionOf [:rdf/List :rdf/Seq],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :bibo/contributorList,
   :vs/term_status #xsd/string "stable"})

(def eissn
  {:db/ident           :bibo/eissn,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        :bibo/Collection,
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def fgiasson
  "Frederick Giasson"
  {:db/ident         :bibo/fgiasson,
   :foaf/name        #xsd/string "Frederick Giasson",
   :rdf/type         [:foaf/Person :owl/NamedIndividual :owl/Thing],
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/seeAlso     {:rdfa/uri "http://fgiasson.com/me/"}})

(def gtin14
  {:db/ident           :bibo/gtin14,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def handle
  {:db/ident           :bibo/handle,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def identifier
  {:db/ident    :bibo/identifier,
   :rdf/type    :owl/DatatypeProperty,
   :rdfs/domain {:owl/unionOf [:bibo/Collection :bibo/Document],
                 :rdf/type    :owl/Class},
   :rdfs/range  :rdfs/Literal})

(def interviewee
  "An agent that is interviewed by another agent."
  {:db/ident           :bibo/interviewee,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       #xsd/langString
                        "An agent that is interviewed by another agent.@en",
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label         #xsd/string "interviewee",
   :rdfs/range         :foaf/Agent,
   :rdfs/subPropertyOf :dcterms/contributor,
   :vs/term_status     #xsd/string "stable"})

(def interviewer
  "An agent that interview another agent."
  {:db/ident           :bibo/interviewer,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       #xsd/langString
                        "An agent that interview another agent.@en",
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label         #xsd/string "interviewer",
   :rdfs/range         :foaf/Agent,
   :rdfs/subPropertyOf :dcterms/contributor,
   :vs/term_status     #xsd/string "stable"})

(def isbn
  {:db/ident :bibo/isbn,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/subPropertyOf :bibo/identifier})

(def isbn10
  {:db/ident           :bibo/isbn10,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf [:bibo/isbn :bibo/identifier]})

(def isbn13
  {:db/ident           :bibo/isbn13,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf [:bibo/isbn :bibo/identifier]})

(def issn
  {:db/ident           :bibo/issn,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        :bibo/Collection,
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def issue
  "An issue number"
  {:db/ident           :bibo/issue,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       #xsd/langString "An issue number@en",
   :rdfs/domain        :bibo/Issue,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label         #xsd/langString "issue@en",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/locator,
   :vs/term_status     #xsd/string "stable"})

(def issuer
  "An entity responsible for issuing often informally published documents such as press releases, reports, etc."
  {:db/ident :bibo/issuer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "An entity responsible for issuing often informally published documents such as press releases, reports, etc.",
   :rdfs/domain {:owl/unionOf [:bibo/Collection :bibo/Document],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/string "issuer",
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf :dcterms/publisher,
   :vs/term_status #xsd/string "unstable"})

(def lccn
  {:db/ident           :bibo/lccn,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def locator
  "A description (often numeric) that locates an item within a containing document or collection."
  {:db/ident :bibo/locator,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "A description (often numeric) that locates an item within a containing document or collection.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "locator@en",
   :rdfs/range :rdfs/Literal,
   :vs/term_status #xsd/string "stable"})

(def numPages
  "The number of pages contained in a document"
  {:db/ident         :bibo/numPages,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #xsd/langString
                      "The number of pages contained in a document@en",
   :rdfs/domain      :bibo/Document,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "number of pages@en",
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   #xsd/string "stable"})

(def numVolumes
  "The number of volumes contained in a collection of documents (usually a series, periodical, etc.)."
  {:db/ident :bibo/numVolumes,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The number of volumes contained in a collection of documents (usually a series, periodical, etc.).@en",
   :rdfs/domain :bibo/Collection,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "number of volumes@en",
   :rdfs/range :rdfs/Literal,
   :vs/term_status #xsd/string "stable"})

(def number
  "A generic item or document number. Not to be confused with issue number."
  {:db/ident :bibo/number,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "A generic item or document number. Not to be confused with issue number.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "number@en",
   :rdfs/range :rdfs/Literal,
   :vs/term_status #xsd/string "stable"})

(def oclcnum
  {:db/ident           :bibo/oclcnum,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def organizer
  "The organizer of an event; includes conference organizers, but also government agencies or other bodies that are responsible for conducting hearings."
  {:db/ident :bibo/organizer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "The organizer of an event; includes conference organizers, but also government agencies or other bodies that are responsible for conducting hearings.@en",
   :rdfs/domain :event/Event,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "organizer@en",
   :rdfs/range :foaf/Agent,
   :vs/term_status #xsd/string "unstable"})

(def owner
  "Owner of a document or a collection of documents."
  {:db/ident         :bibo/owner,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #xsd/langString
                      "Owner of a document or a collection of documents.@en",
   :rdfs/domain      {:owl/unionOf [:bibo/Collection :bibo/Document],
                      :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "owner@en",
   :rdfs/range       :foaf/Agent,
   :vs/term_status   #xsd/string "unstable"})

(def pageEnd
  "Ending page number within a continuous page range."
  {:db/ident           :bibo/pageEnd,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       #xsd/langString
                        "Ending page number within a continuous page range.@en",
   :rdfs/domain        :bibo/Document,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label         #xsd/langString "page end@en",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/locator,
   :vs/term_status     #xsd/string "stable"})

(def pageStart
  "Starting page number within a continuous page range."
  {:db/ident :bibo/pageStart,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment #xsd/langString
                  "Starting page number within a continuous page range.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "page start@en",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/locator,
   :vs/term_status #xsd/string "stable"})

(def pages
  "A string of non-contiguous page spans that locate a Document within a Collection. Example: 23-25, 34, 54-56. For continuous page ranges, use the pageStart and pageEnd properties."
  {:db/ident :bibo/pages,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "A string of non-contiguous page spans that locate a Document within a Collection. Example: 23-25, 34, 54-56. For continuous page ranges, use the pageStart and pageEnd properties.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "pages@en",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/locator,
   :vs/term_status #xsd/string "stable"})

(def performer
  "performer"
  {:db/ident           :bibo/performer,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :bibo/Performance,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label         #xsd/string "performer",
   :rdfs/range         :foaf/Agent,
   :rdfs/subPropertyOf :dcterms/contributor,
   :vs/term_status     #xsd/string "stable"})

(def pmid
  {:db/ident           :bibo/pmid,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def prefixName
  "The prefix of a name"
  {:db/ident         :bibo/prefixName,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #xsd/langString "The prefix of a name@en",
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "prefix name@en",
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   #xsd/string "stable"})

(def presentedAt
  "Relates a document to an event; for example, a paper to a conference."
  {:db/ident :bibo/presentedAt,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relates a document to an event; for example, a paper to a conference.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "presented at@en",
   :rdfs/range :bibo/Event,
   :rdfs/subPropertyOf :event/produced_in,
   :vs/term_status #xsd/string "unstable"})

(def presents
  "Relates an event to associated documents; for example, conference to a paper."
  {:db/ident :bibo/presents,
   :owl/inverseOf :bibo/presentedAt,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relates an event to associated documents; for example, conference to a paper.@en",
   :rdfs/domain :bibo/Event,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "presents@en",
   :rdfs/range :bibo/Document,
   :rdfs/subPropertyOf :event/product,
   :vs/term_status #xsd/string "unstable"})

(def producer
  "Producer of a document or a collection of documents."
  {:db/ident         :bibo/producer,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #xsd/langString
                      "Producer of a document or a collection of documents.@en",
   :rdfs/domain      {:owl/unionOf [:bibo/Collection :bibo/Document],
                      :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "producer@en",
   :rdfs/range       :foaf/Agent,
   :vs/term_status   #xsd/string "stable"})

(def recipient
  "An agent that receives a communication document."
  {:db/ident         :bibo/recipient,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #xsd/langString
                      "An agent that receives a communication document.@en",
   :rdfs/domain      :bibo/PersonalCommunicationDocument,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/string "recipient",
   :rdfs/range       :foaf/Agent,
   :vs/term_status   #xsd/string "stable"})

(def reproducedIn
  "The resource in which another resource is reproduced."
  {:db/ident :bibo/reproducedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment #xsd/langString
                  "The resource in which another resource is reproduced.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/range :bibo/Document,
   :rdfs/subPropertyOf :dcterms/isPartOf,
   :vs/term_status #xsd/string "unstable"})

(def reversedBy
  "A legal decision that reverses a ruling."
  {:db/ident           :bibo/reversedBy,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       #xsd/langString
                        "A legal decision that reverses a ruling.@en",
   :rdfs/domain        :bibo/LegalDecision,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/range         :bibo/LegalDecision,
   :rdfs/subPropertyOf [:bibo/subsequentLegalDecision :dcterms/isReferencedBy]})

(def reviewOf
  "Relates a review document to a reviewed thing (resource, item, etc.)."
  {:db/ident :bibo/reviewOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relates a review document to a reviewed thing (resource, item, etc.).@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "review of@en",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :dcterms/relation,
   :vs/term_status #xsd/string "stable"})

(def section
  "A section number"
  {:db/ident :bibo/section,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment #xsd/langString "A section number@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "section@en",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/locator,
   :skos/example
   #xsd/langString
    "Di Rado, Alicia. 1995. Trekking through college: Classes explore\nmodern society using the world of Star trek. Los Angeles Times, March\n15, sec. A, p. 3.@en",
   :vs/term_status #xsd/string "unstable"})

(def shortDescription
  {:db/ident    :bibo/shortDescription,
   :rdf/type    :owl/DatatypeProperty,
   :rdfs/domain :bibo/Document,
   :rdfs/range  :rdfs/Literal})

(def shortTitle
  "The abbreviation of a title."
  {:db/ident         :bibo/shortTitle,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #xsd/langString "The abbreviation of a title.@en",
   :rdfs/domain      :bibo/Document,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "short title@en",
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   #xsd/string "stable"})

(def sici
  {:db/ident           :bibo/sici,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def status
  "The publication status of (typically academic) content."
  {:db/ident :bibo/status,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment #xsd/langString
                  "The publication status of (typically academic) content.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "status@en",
   :rdfs/range :bibo/DocumentStatus,
   :skos/editorialNote
   #xsd/langString
    "We are not defining, using an enumeration, the range of the bibo:status to the defined list of bibo:DocumentStatus. We won't do it because we want people to be able to define new status if needed by some special usecases. Creating such an enumeration would restrict this to happen.@en",
   :vs/term_status #xsd/string "stable"})

(def subsequentLegalDecision
  "A legal decision on appeal that takes action on a case (affirming it, reversing it, etc.)."
  {:db/ident :bibo/subsequentLegalDecision,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "A legal decision on appeal that takes action on a case (affirming it, reversing it, etc.).@en",
   :rdfs/domain :bibo/LegalDecision,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/range :bibo/LegalDecision,
   :rdfs/subPropertyOf :dcterms/isReferencedBy})

(def suffixName
  "The suffix of a name"
  {:db/ident         :bibo/suffixName,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #xsd/langString "The suffix of a name@en",
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label       #xsd/langString "suffix name@en",
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   #xsd/string "stable"})

(def transcriptOf
  "Relates a document to some transcribed original."
  {:db/ident           :bibo/transcriptOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       #xsd/langString
                        "Relates a document to some transcribed original.@en",
   :rdfs/domain        :bibo/Document,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label         #xsd/langString "transcript of@en",
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :dcterms/relation,
   :vs/term_status     #xsd/string "unstable"})

(def translationOf
  "Relates a translated document to the original document."
  {:db/ident :bibo/translationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment #xsd/langString
                  "Relates a translated document to the original document.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/langString "translation of@en",
   :rdfs/range :bibo/Document,
   :rdfs/subPropertyOf :dcterms/isVersionOf,
   :vs/term_status #xsd/string "stable"})

(def translator
  "A person who translates written document from one language to another."
  {:db/ident :bibo/translator,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "A person who translates written document from one language to another.@en",
   :rdfs/domain {:owl/unionOf [:bibo/Collection :bibo/Document],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label #xsd/string "translator",
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf :dcterms/contributor,
   :vs/term_status #xsd/string "stable"})

(def upc
  {:db/ident           :bibo/upc,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def uri
  "Universal Resource Identifier of a document"
  {:db/ident           :bibo/uri,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       #xsd/langString
                        "Universal Resource Identifier of a document@en",
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label         #xsd/langString "uri@en",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier,
   :vs/term_status     #xsd/string "stable"})

(def volume
  "A volume number"
  {:db/ident           :bibo/volume,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       #xsd/langString "A volume number@en",
   :rdfs/domain        :bibo/Document,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/bibo/"},
   :rdfs/label         #xsd/langString "volume@en",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/locator,
   :vs/term_status     #xsd/string "stable"})