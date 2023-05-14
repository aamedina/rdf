(ns net.wikipunk.rdf.bibo
  "The Bibliographic Ontology describes bibliographic things on the semantic Web in RDF. This ontology can be used as a citation ontology, as a document classification ontology, or simply as a way to describe any kind of document in RDF. It has been inspired by many existing document description metadata formats, and can be used as a common ground for converting other bibliographic data sources."
  {:dcterms/creator [:bibo/fgiasson :bibo/bdarcus],
   :dcterms/description
   #voc/lstr
    "The Bibliographic Ontology describes\nbibliographic things on the semantic Web in RDF.  This ontology can be\nused as a citation ontology, as a document classification ontology, or\nsimply as a way to describe any kind of document in RDF. It has been\ninspired by many existing document description metadata formats, and\ncan be used as a common ground for converting other bibliographic data\nsources.@en",
   :dcterms/title "The Bibliographic Ontology",
   :owl/versionInfo "http://purl.org/ontology/bibo/1.3/",
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
   :rdfa/uri "http://purl.org/ontology/bibo/"}
  (:refer-clojure :exclude [agent time name]))

(def AcademicArticle
  "A scholarly academic article, typically published in a journal."
  {:db/ident :bibo/AcademicArticle,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A scholarly academic article, typically published in a journal.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Academic Article@en",
   :rdfs/subClassOf [:bibo/Article :bibo/AcademicArticle :bibo/Document],
   :vs/term_status "stable"})

(def Article
  "A written composition in prose, usually nonfiction, on a specific topic, forming an independent part of a book or other publication, as a newspaper or magazine."
  {:db/ident :bibo/Article,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A written composition in prose, usually nonfiction, on a specific topic, forming an independent part of a book or other publication, as a newspaper or magazine.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Article@en",
   :rdfs/subClassOf [:bibo/Document :bibo/Article],
   :vs/term_status "stable"})

(def AudioDocument
  "An audio document; aka record."
  {:db/ident         :bibo/AudioDocument,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "An audio document; aka record.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "audio document@en",
   :rdfs/subClassOf  [:bibo/Document :bibo/AudioDocument],
   :vs/term_status   "stable"})

(def AudioVisualDocument
  "An audio-visual document; film, video, and so forth."
  {:db/ident         :bibo/AudioVisualDocument,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr
                      "An audio-visual document; film, video, and so forth.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "audio-visual document@en",
   :rdfs/subClassOf  [:bibo/Document :bibo/AudioVisualDocument],
   :vs/term_status   "stable"})

(def Bill
  "Draft legislation presented for discussion to a legal body."
  {:db/ident :bibo/Bill,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr "Draft legislation presented for discussion to a legal body.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Bill@en",
   :rdfs/subClassOf
   [:bibo/Legislation :bibo/Bill :bibo/Document :bibo/LegalDocument],
   :vs/term_status "stable"})

(def Book
  "A written or printed work of fiction or nonfiction, usually on sheets of paper fastened or bound together within covers."
  {:db/ident :bibo/Book,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A written or printed work of fiction or nonfiction, usually on sheets of paper fastened or bound together within covers.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Book@en",
   :rdfs/subClassOf [:bibo/Document :bibo/Book],
   :vs/term_status "stable"})

(def BookSection
  "A section of a book."
  {:db/ident         :bibo/BookSection,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "A section of a book.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "Book Section@en",
   :rdfs/subClassOf  [:bibo/DocumentPart
                      :bibo/BookSection
                      :bibo/Document
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :dcterms/isPartOf,
                       :rdf/type           :owl/Restriction}],
   :vs/term_status   "unstable"})

(def Brief
  "A written argument submitted to a court."
  {:db/ident         :bibo/Brief,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "A written argument submitted to a court.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "Brief@en",
   :rdfs/subClassOf  [:bibo/LegalCaseDocument
                      :bibo/Brief
                      :bibo/Document
                      :bibo/LegalDocument],
   :vs/term_status   "unstable"})

(def Chapter
  "A chapter of a book."
  {:db/ident         :bibo/Chapter,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "A chapter of a book.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "Chapter@en",
   :rdfs/subClassOf  [:bibo/BookSection
                      :bibo/Chapter
                      :bibo/Document
                      :bibo/DocumentPart
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :dcterms/isPartOf,
                       :rdf/type           :owl/Restriction}],
   :vs/term_status   "unstable"})

(def Code
  "A collection of statutes."
  {:db/ident         :bibo/Code,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "A collection of statutes.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "Code@en",
   :rdfs/subClassOf  [{:owl/allValuesFrom :bibo/Legislation,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :dcterms/hasPart,
                       :rdf/type           :owl/Restriction}
                      :bibo/Periodical
                      :bibo/Code
                      {:owl/allValuesFrom :bibo/Issue,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :dcterms/hasPart,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom {:owl/unionOf [:bibo/Collection
                                                         :bibo/Document],
                                           :rdf/type    :owl/Class},
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      :bibo/Collection],
   :vs/term_status   "stable"})

(def CollectedDocument
  "A document that simultaneously contains other documents."
  {:db/ident :bibo/CollectedDocument,
   :rdf/type :owl/Class,
   :rdfs/comment #voc/lstr
                  "A document that simultaneously contains other documents.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Collected Document@en",
   :rdfs/subClassOf [{:owl/minCardinality 1,
                      :owl/onProperty     :dcterms/hasPart,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :bibo/Document,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     :bibo/Document
                     :bibo/CollectedDocument],
   :vs/term_status "stable"})

(def Collection
  "A collection of Documents or Collections"
  {:db/ident         :bibo/Collection,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "A collection of Documents or Collections@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "Collection@en",
   :rdfs/subClassOf  [{:owl/allValuesFrom {:owl/unionOf [:bibo/Collection
                                                         :bibo/Document],
                                           :rdf/type    :owl/Class},
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      :bibo/Collection],
   :vs/term_status   "stable"})

(def Conference
  "A meeting for consultation or discussion."
  {:db/ident         :bibo/Conference,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "A meeting for consultation or discussion.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "Conference@en",
   :rdfs/subClassOf  [:event/Event :bibo/Conference],
   :vs/term_status   "stable"})

(def CourtReporter
  "A collection of legal cases."
  {:db/ident         :bibo/CourtReporter,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "A collection of legal cases.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "Court Reporter@en",
   :rdfs/subClassOf  [{:owl/allValuesFrom :bibo/LegalDocument,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :dcterms/hasPart,
                       :rdf/type           :owl/Restriction}
                      :bibo/Periodical
                      :bibo/CourtReporter
                      {:owl/allValuesFrom :bibo/Issue,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :dcterms/hasPart,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom {:owl/unionOf [:bibo/Collection
                                                         :bibo/Document],
                                           :rdf/type    :owl/Class},
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      :bibo/Collection],
   :vs/term_status   "stable"})

(def Document
  "A document (noun) is a bounded physical representation of body of information designed with the capacity (and usually intent) to communicate. A document may manifest symbolic, diagrammatic or sensory-representational information."
  {:db/ident :bibo/Document,
   :owl/equivalentClass :foaf/Document,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A document (noun) is a bounded physical representation of body of information designed with the capacity (and usually intent) to communicate. A document may manifest symbolic, diagrammatic or sensory-representational information.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Document@en",
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status "stable"})

(def DocumentPart
  "a distinct part of a larger document or collected document."
  {:db/ident :bibo/DocumentPart,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr "a distinct part of a larger document or collected document.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "document part@en",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :dcterms/isPartOf,
                      :rdf/type           :owl/Restriction}
                     :bibo/Document
                     :bibo/DocumentPart],
   :vs/term_status "unstable"})

(def DocumentStatus
  "The status of the publication of a document."
  {:db/ident         :bibo/DocumentStatus,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr
                      "The status of the publication of a document.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "Document Status@en",
   :vs/term_status   "stable"})

(def EditedBook
  "An edited book."
  {:db/ident         :bibo/EditedBook,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "An edited book.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "Edited Book@en",
   :rdfs/subClassOf  [:bibo/CollectedDocument
                      :bibo/EditedBook
                      :bibo/Document
                      {:owl/minCardinality 1,
                       :owl/onProperty     :dcterms/hasPart,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :bibo/Document,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}],
   :vs/term_status   "stable"})

(def Email
  "A written communication addressed to a person or organization and transmitted electronically."
  {:db/ident :bibo/Email,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A written communication addressed to a person or organization and transmitted electronically.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "EMail@en",
   :rdfs/subClassOf
   [:bibo/PersonalCommunicationDocument :bibo/Email :bibo/Document],
   :vs/term_status "stable"})

(def Event
  {:db/ident :bibo/Event,
   :rdf/type :owl/Class})

(def Excerpt
  "A passage selected from a larger work."
  {:db/ident         :bibo/Excerpt,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "A passage selected from a larger work.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "Excerpt@en",
   :rdfs/subClassOf  [:bibo/DocumentPart
                      :bibo/Excerpt
                      :bibo/Document
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :dcterms/isPartOf,
                       :rdf/type           :owl/Restriction}],
   :vs/term_status   "stable"})

(def Film
  "aka movie."
  {:db/ident         :bibo/Film,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "aka movie.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "Film@en",
   :rdfs/subClassOf  [:bibo/AudioVisualDocument :bibo/Film :bibo/Document],
   :vs/term_status   "stable"})

(def Hearing
  "An instance or a session in which testimony and arguments are presented, esp. before an official, as a judge in a lawsuit."
  {:db/ident :bibo/Hearing,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "An instance or a session in which testimony and arguments are presented, esp. before an official, as a judge in a lawsuit.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Hearing@en",
   :rdfs/subClassOf [:event/Event :bibo/Hearing],
   :vs/term_status "stable"})

(def Image
  "A document that presents visual or diagrammatic information."
  {:db/ident :bibo/Image,
   :owl/equivalentClass :foaf/Image,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr "A document that presents visual or diagrammatic information.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Image@en",
   :rdfs/subClassOf [:bibo/Document :bibo/Image],
   :vs/term_status "stable"})

(def Interview
  "A formalized discussion between two or more people."
  {:db/ident         :bibo/Interview,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr
                      "A formalized discussion between two or more people.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "Interview@en",
   :rdfs/subClassOf  [:event/Event :bibo/Interview],
   :vs/term_status   "stable"})

(def Issue
  "something that is printed or published and distributed, esp. a given number of a periodical"
  {:db/ident :bibo/Issue,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "something that is printed or published and distributed, esp. a given number of a periodical@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Issue@en",
   :rdfs/subClassOf [{:owl/allValuesFrom :bibo/Article,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     {:owl/minCardinality 1,
                      :owl/onProperty     :dcterms/hasPart,
                      :rdf/type           :owl/Restriction}
                     :bibo/CollectedDocument
                     :bibo/Issue
                     :bibo/Document
                     {:owl/minCardinality 1,
                      :owl/onProperty     :dcterms/hasPart,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :bibo/Document,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}],
   :vs/term_status "stable"})

(def Journal
  "A periodical of scholarly journal Articles."
  {:db/ident         :bibo/Journal,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "A periodical of scholarly journal Articles.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "Journal@en",
   :rdfs/subClassOf  [{:owl/allValuesFrom :bibo/Issue,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :dcterms/hasPart,
                       :rdf/type           :owl/Restriction}
                      :bibo/Periodical
                      :bibo/Journal
                      {:owl/allValuesFrom :bibo/Issue,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :dcterms/hasPart,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom {:owl/unionOf [:bibo/Collection
                                                         :bibo/Document],
                                           :rdf/type    :owl/Class},
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      :bibo/Collection],
   :vs/term_status   "stable"})

(def LegalCaseDocument
  "A document accompanying a legal case."
  {:db/ident         :bibo/LegalCaseDocument,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "A document accompanying a legal case.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "Legal Case Document@en",
   :rdfs/subClassOf  [:bibo/LegalDocument
                      :bibo/LegalCaseDocument
                      :bibo/Document],
   :vs/term_status   "unstable"})

(def LegalDecision
  "A document containing an authoritative determination (as a decree or judgment) made after consideration of facts or law."
  {:db/ident :bibo/LegalDecision,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A document containing an authoritative determination (as a decree or judgment) made after consideration of facts or law.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Decision@en",
   :rdfs/subClassOf [:bibo/LegalCaseDocument
                     :bibo/LegalDecision
                     :bibo/Document
                     :bibo/LegalDocument],
   :vs/term_status "unstable"})

(def LegalDocument
  "A legal document; for example, a court decision, a brief, and so forth."
  {:db/ident :bibo/LegalDocument,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A legal document; for example, a court decision, a brief, and so forth.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Legal Document@en",
   :rdfs/subClassOf [:bibo/Document :bibo/LegalDocument],
   :vs/term_status "stable"})

(def Legislation
  "A legal document proposing or enacting a law or a group of laws."
  {:db/ident :bibo/Legislation,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A legal document proposing or enacting a law or a group of laws.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Legislation@en",
   :rdfs/subClassOf [:bibo/LegalDocument :bibo/Legislation :bibo/Document],
   :vs/term_status "unstable"})

(def Letter
  "A written or printed communication addressed to a person or organization and usually transmitted by mail."
  {:db/ident :bibo/Letter,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A written or printed communication addressed to a person or organization and usually transmitted by mail.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Letter@en",
   :rdfs/subClassOf
   [:bibo/PersonalCommunicationDocument :bibo/Letter :bibo/Document],
   :vs/term_status "stable"})

(def Magazine
  "A periodical of magazine Articles. A magazine is a publication that is issued periodically, usually bound in a paper cover, and typically contains essays, stories, poems, etc., by many writers, and often photographs and drawings, frequently specializing in a particular subject or area, as hobbies, news, or sports."
  {:db/ident :bibo/Magazine,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A periodical of magazine Articles. A magazine is a publication that is issued periodically, usually bound in a paper cover, and typically contains essays, stories, poems, etc., by many writers, and often photographs and drawings, frequently specializing in a particular subject or area, as hobbies, news, or sports.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Magazine@en",
   :rdfs/subClassOf [{:owl/allValuesFrom :bibo/Issue,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     {:owl/minCardinality 1,
                      :owl/onProperty     :dcterms/hasPart,
                      :rdf/type           :owl/Restriction}
                     :bibo/Periodical
                     :bibo/Magazine
                     {:owl/allValuesFrom :bibo/Issue,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     {:owl/minCardinality 1,
                      :owl/onProperty     :dcterms/hasPart,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom {:owl/unionOf [:bibo/Collection
                                                        :bibo/Document],
                                          :rdf/type    :owl/Class},
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     :bibo/Collection],
   :vs/term_status "stable"})

(def Manual
  "A small reference book, especially one giving instructions."
  {:db/ident :bibo/Manual,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr "A small reference book, especially one giving instructions.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Manual@en",
   :rdfs/subClassOf [:bibo/Document :bibo/Manual],
   :vs/term_status "unstable"})

(def Manuscript
  "An unpublished Document, which may also be submitted to a publisher for publication."
  {:db/ident :bibo/Manuscript,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "An unpublished Document, which may also be submitted to a publisher for publication.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Manuscript@en",
   :rdfs/subClassOf [:bibo/Document :bibo/Manuscript],
   :vs/term_status "stable"})

(def Map
  "A graphical depiction of geographic features."
  {:db/ident         :bibo/Map,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr
                      "A graphical depiction of geographic features.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "Map@en",
   :rdfs/subClassOf  [:bibo/Image :bibo/Map :bibo/Document],
   :vs/term_status   "unstable"})

(def MultiVolumeBook
  "A loose, thematic, collection of Documents, often Books."
  {:db/ident :bibo/MultiVolumeBook,
   :rdf/type :owl/Class,
   :rdfs/comment #voc/lstr
                  "A loose, thematic, collection of Documents, often Books.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Multivolume Book@en",
   :rdfs/subClassOf [{:owl/allValuesFrom :bibo/Book,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     :bibo/Collection
                     :bibo/MultiVolumeBook
                     {:owl/allValuesFrom {:owl/unionOf [:bibo/Collection
                                                        :bibo/Document],
                                          :rdf/type    :owl/Class},
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}],
   :vs/term_status "stable"})

(def Newspaper
  "A periodical of documents, usually issued daily or weekly, containing current news, editorials, feature articles, and usually advertising."
  {:db/ident :bibo/Newspaper,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A periodical of documents, usually issued daily or weekly, containing current news, editorials, feature articles, and usually advertising.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Newspaper@en",
   :rdfs/subClassOf [{:owl/allValuesFrom :bibo/Issue,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     {:owl/minCardinality 1,
                      :owl/onProperty     :dcterms/hasPart,
                      :rdf/type           :owl/Restriction}
                     :bibo/Periodical
                     :bibo/Newspaper
                     {:owl/allValuesFrom :bibo/Issue,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     {:owl/minCardinality 1,
                      :owl/onProperty     :dcterms/hasPart,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom {:owl/unionOf [:bibo/Collection
                                                        :bibo/Document],
                                          :rdf/type    :owl/Class},
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     :bibo/Collection],
   :vs/term_status "stable"})

(def Note
  "Notes or annotations about a resource."
  {:db/ident         :bibo/Note,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "Notes or annotations about a resource.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "Note@en",
   :rdfs/subClassOf  [:bibo/Document :bibo/Note],
   :vs/term_status   "stable"})

(def Patent
  "A document describing the exclusive right granted by a government to an inventor to manufacture, use, or sell an invention for a certain number of years."
  {:db/ident :bibo/Patent,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A document describing the exclusive right granted by a government to an inventor to manufacture, use, or sell an invention for a certain number of years.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Patent@en",
   :rdfs/subClassOf [:bibo/Document :bibo/Patent],
   :vs/term_status "stable"})

(def Performance
  "A public performance."
  {:db/ident         :bibo/Performance,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "A public performance.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "Performance@en",
   :rdfs/subClassOf  [:event/Event :bibo/Performance],
   :vs/term_status   "unstable"})

(def Periodical
  "A group of related documents issued at regular intervals."
  {:db/ident :bibo/Periodical,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr "A group of related documents issued at regular intervals.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Periodical@en",
   :rdfs/subClassOf [{:owl/allValuesFrom :bibo/Issue,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     {:owl/minCardinality 1,
                      :owl/onProperty     :dcterms/hasPart,
                      :rdf/type           :owl/Restriction}
                     :bibo/Collection
                     :bibo/Periodical
                     {:owl/allValuesFrom {:owl/unionOf [:bibo/Collection
                                                        :bibo/Document],
                                          :rdf/type    :owl/Class},
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}],
   :vs/term_status "stable"})

(def PersonalCommunication
  "A communication between an agent and one or more specific recipients."
  {:db/ident :bibo/PersonalCommunication,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A communication between an agent and one or more specific recipients.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Personal Communication@en",
   :rdfs/subClassOf [:event/Event :bibo/PersonalCommunication],
   :vs/term_status "stable"})

(def PersonalCommunicationDocument
  "A personal communication manifested in some document."
  {:db/ident :bibo/PersonalCommunicationDocument,
   :rdf/type :owl/Class,
   :rdfs/comment #voc/lstr
                  "A personal communication manifested in some document.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Personal Communication Document@en",
   :rdfs/subClassOf [:bibo/Document :bibo/PersonalCommunicationDocument],
   :vs/term_status "stable"})

(def Proceedings
  "A compilation of documents published from an event, such as a conference."
  {:db/ident :bibo/Proceedings,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A compilation of documents published from an event, such as a conference.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Proceedings@en",
   :rdfs/subClassOf [:bibo/Book :bibo/Proceedings :bibo/Document],
   :vs/term_status "unstable"})

(def Quote
  "An excerpted collection of words."
  {:db/ident         :bibo/Quote,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "An excerpted collection of words.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "Quote@en",
   :rdfs/subClassOf  [:bibo/Excerpt
                      :bibo/Quote
                      :bibo/Document
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :dcterms/isPartOf,
                       :rdf/type           :owl/Restriction}
                      :bibo/DocumentPart],
   :vs/term_status   "stable"})

(def ReferenceSource
  "A document that presents authoritative reference information, such as a dictionary or encylopedia ."
  {:db/ident :bibo/ReferenceSource,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A document that presents authoritative reference information, such as a dictionary or encylopedia .@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Reference Source@en",
   :rdfs/subClassOf [:bibo/Document :bibo/ReferenceSource],
   :vs/term_status "unstable"})

(def Report
  "A document describing an account or statement describing in detail an event, situation, or the like, usually as the result of observation, inquiry, etc.."
  {:db/ident :bibo/Report,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A document describing an account or statement describing in detail an event, situation, or the like, usually as the result of observation, inquiry, etc..@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Report@en",
   :rdfs/subClassOf [:bibo/Document :bibo/Report],
   :vs/term_status "stable"})

(def Series
  "A loose, thematic, collection of Documents, often Books."
  {:db/ident :bibo/Series,
   :rdf/type :owl/Class,
   :rdfs/comment #voc/lstr
                  "A loose, thematic, collection of Documents, often Books.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Series@en",
   :rdfs/subClassOf [{:owl/allValuesFrom :bibo/Document,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     :bibo/Collection
                     :bibo/Series
                     {:owl/allValuesFrom {:owl/unionOf [:bibo/Collection
                                                        :bibo/Document],
                                          :rdf/type    :owl/Class},
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}],
   :vs/term_status "stable"})

(def Slide
  "A slide in a slideshow"
  {:db/ident         :bibo/Slide,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "A slide in a slideshow@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "Slide@en",
   :rdfs/subClassOf  [:bibo/DocumentPart
                      :bibo/Slide
                      :bibo/Document
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :dcterms/isPartOf,
                       :rdf/type           :owl/Restriction}],
   :vs/term_status   "unstable"})

(def Slideshow
  "A presentation of a series of slides, usually presented in front of an audience with written text and images."
  {:db/ident :bibo/Slideshow,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A presentation of a series of slides, usually presented in front of an audience with written text and images.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Slideshow@en",
   :rdfs/subClassOf [{:owl/allValuesFrom :bibo/Slide,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     :bibo/Document
                     :bibo/Slideshow],
   :vs/term_status "stable"})

(def Specification
  "A document describing a specification."
  {:db/ident         :bibo/Specification,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "A document describing a specification.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "Specification@en",
   :rdfs/subClassOf  [:bibo/Document :bibo/Specification],
   :vs/term_status   "testing"})

(def Standard
  "A document describing a standard: a specification organized through a standards body."
  {:db/ident :bibo/Standard,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A document describing a standard: a specification organized through a standards body.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Standard@en",
   :rdfs/subClassOf [:bibo/Specification :bibo/Standard :bibo/Document],
   :vs/term_status "stable"})

(def Statute
  "A bill enacted into law."
  {:db/ident         :bibo/Statute,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "A bill enacted into law.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "Statute@en",
   :rdfs/subClassOf  [:bibo/Legislation
                      :bibo/Statute
                      :bibo/Document
                      :bibo/LegalDocument],
   :vs/term_status   "stable"})

(def Thesis
  "A document created to summarize research findings associated with the completion of an academic degree."
  {:db/ident :bibo/Thesis,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A document created to summarize research findings associated with the completion of an academic degree.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Thesis@en",
   :rdfs/subClassOf [:bibo/Document :bibo/Thesis],
   :vs/term_status "stable"})

(def ThesisDegree
  "The academic degree of a Thesis"
  {:db/ident         :bibo/ThesisDegree,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "The academic degree of a Thesis@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "Thesis degree@en",
   :vs/term_status   "stable"})

(def Webpage
  "A web page is an online document available (at least initially) on the world wide web. A web page is written first and foremost to appear on the web, as distinct from other online resources such as books, manuscripts or audio documents which use the web primarily as a distribution mechanism alongside other more traditional methods such as print."
  {:db/ident :bibo/Webpage,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A web page is an online document available (at least initially) on the world wide web. A web page is written first and foremost to appear on the web, as distinct from other online resources such as books, manuscripts or audio documents which use the web primarily as a distribution mechanism alongside other more traditional methods such as print.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Webpage@en",
   :rdfs/subClassOf [:bibo/Document :bibo/Webpage],
   :vs/term_status "unstable"})

(def Website
  "A group of Webpages accessible on the Web."
  {:db/ident         :bibo/Website,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "A group of Webpages accessible on the Web.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "Website@en",
   :rdfs/subClassOf  [{:owl/allValuesFrom :bibo/Webpage,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :dcterms/hasPart,
                       :rdf/type           :owl/Restriction}
                      :bibo/Collection
                      :bibo/Website
                      {:owl/allValuesFrom {:owl/unionOf [:bibo/Collection
                                                         :bibo/Document],
                                           :rdf/type    :owl/Class},
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}],
   :vs/term_status   "unstable"})

(def Workshop
  "A seminar, discussion group, or the like, that emphasizes zxchange of ideas and the demonstration and application of techniques, skills, etc."
  {:db/ident :bibo/Workshop,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A seminar, discussion group, or the like, that emphasizes zxchange of ideas and the demonstration and application of techniques, skills, etc.@en",
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "Workshop@en",
   :rdfs/subClassOf [:event/Event :bibo/Workshop],
   :vs/term_status "stable"})

(def abstract
  "A summary of the resource."
  {:db/ident         :bibo/abstract,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "A summary of the resource.",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       "abstract",
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   "stable"})

(def affirmedBy
  "A legal decision that affirms a ruling."
  {:db/ident           :bibo/affirmedBy,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       #voc/lstr "A legal decision that affirms a ruling.@en",
   :rdfs/domain        :bibo/LegalDecision,
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/range         :bibo/LegalDecision,
   :rdfs/subPropertyOf [:bibo/subsequentLegalDecision
                        :bibo/affirmedBy
                        :dcterms/isReferencedBy]})

(def annotates
  "Critical or explanatory note for a Document."
  {:db/ident           :bibo/annotates,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       #voc/lstr
                        "Critical or explanatory note for a Document.@en",
   :rdfs/domain        :bibo/Note,
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/label         #voc/lstr "annotates@en",
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf [:dcterms/relation :bibo/annotates],
   :vs/term_status     "stable"})

(def argued
  "The date on which a legal case is argued before a court. Date is of format xsd:date"
  {:db/ident :bibo/argued,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "The date on which a legal case is argued before a court. Date is of format xsd:date@en",
   :rdfs/domain :bibo/LegalDocument,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "date argued@en",
   :rdfs/range :rdfs/Literal,
   :vs/term_status "unstable"})

(def asin
  {:db/ident           :bibo/asin,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf [:bibo/identifier :bibo/asin]})

(def authorList
  "An ordered list of authors. Normally, this list is seen as a priority list that order authors by importance."
  {:db/ident :bibo/authorList,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "An ordered list of authors. Normally, this list is seen as a priority list that order authors by importance.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "list of authors@en",
   :rdfs/range {:owl/unionOf [:rdf/List :rdf/Seq],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf [:bibo/contributorList :bibo/authorList],
   :vs/term_status "stable"})

(def bdarcus
  {:db/ident         :bibo/bdarcus,
   :foaf/name        "Bruce D'Arcus",
   :rdf/type         [:foaf/Person :owl/NamedIndividual :owl/Thing],
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/seeAlso     ["http://purl.org/net/darcusb/info#me"]})

(def chapter
  "An chapter number"
  {:db/ident           :bibo/chapter,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       #voc/lstr "An chapter number@en",
   :rdfs/domain        :bibo/BookSection,
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/label         #voc/lstr "chapter@en",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf [:bibo/locator :bibo/chapter],
   :vs/term_status     "unstable"})

(def citedBy
  "Relates a document to another document that cites the first document."
  {:db/ident :bibo/citedBy,
   :owl/inverseOf :bibo/cites,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Relates a document to another document that cites the\nfirst document.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "cited by@en",
   :rdfs/range :bibo/Document,
   :vs/term_status "unstable"})

(def cites
  "Relates a document to another document that is cited by the first document as reference, comment, review, quotation or for another purpose."
  {:db/ident :bibo/cites,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Relates a document to another document that is cited\nby the first document as reference, comment, review, quotation or for\nanother purpose.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "cites@en",
   :rdfs/range :bibo/Document,
   :rdfs/subPropertyOf [:dcterms/references :bibo/cites],
   :vs/term_status "unstable"})

(def coden
  {:db/ident           :bibo/coden,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf [:bibo/identifier :bibo/coden]})

(def content
  "This property is for a plain-text rendering of the content of a Document. While the plain-text content of an entire document could be described by this property."
  {:db/ident :bibo/content,
   :owl/deprecated true,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "This property is for a plain-text rendering of the content of a Document. While the plain-text content of an entire document could be described by this property.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "content@en",
   :rdfs/range :rdfs/Literal,
   :skos/historyNote
   #voc/lstr
    "bibo:content has been deprecated; we recommend to use \"rdf:value\" for this purpose. Here is the rational behind this choice: http://www.w3.org/TR/2004/REC-rdf-primer-20040210/#rdfvalue@en",
   :vs/term_status "unstable"})

(def contributorList
  "An ordered list of contributors. Normally, this list is seen as a priority list that order contributors by importance."
  {:db/ident :bibo/contributorList,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "An ordered list of contributors. Normally, this list is seen as a priority list that order contributors by importance.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "list of contributors@en",
   :rdfs/range {:owl/unionOf [:rdf/List :rdf/Seq],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :bibo/contributorList,
   :vs/term_status "stable"})

(def court
  "A court associated with a legal document; for example, that which issues a decision."
  {:db/ident :bibo/court,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "A court associated with a legal document; for example, that which issues a decision.@en",
   :rdfs/domain :bibo/LegalDocument,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "court@en",
   :rdfs/range :foaf/Organization,
   :vs/term_status "unstable"})

(def degree
  "The thesis degree."
  {:db/ident :bibo/degree,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment #voc/lstr "The thesis degree.@en",
   :rdfs/domain :bibo/Thesis,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "degree@en",
   :rdfs/range :bibo/ThesisDegree,
   :skos/editorialNote
   #voc/lstr
    "We are not defining, using an enumeration, the range of the bibo:degree to the defined list of bibo:ThesisDegree. We won't do it because we want people to be able to define new degress if needed by some special usecases. Creating such an enumeration would restrict this to happen.@en",
   :vs/term_status "unstable"})

(def director
  "A Film director."
  {:db/ident           :bibo/director,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       #voc/lstr "A Film director.@en",
   :rdfs/domain        :bibo/AudioVisualDocument,
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/label         "director",
   :rdfs/range         :foaf/Agent,
   :rdfs/subPropertyOf [:dcterms/contributor :bibo/director],
   :vs/term_status     "stable"})

(def distributor
  "Distributor of a document or a collection of documents."
  {:db/ident :bibo/distributor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment #voc/lstr
                  "Distributor of a document or a collection of documents.@en",
   :rdfs/domain {:owl/unionOf [:bibo/Collection :bibo/Document],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "distributor@en",
   :rdfs/range :foaf/Agent,
   :vs/term_status "stable"})

(def doi
  {:db/ident           :bibo/doi,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf [:bibo/identifier :bibo/doi]})

(def eanucc13
  {:db/ident           :bibo/eanucc13,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf [:bibo/identifier :bibo/eanucc13]})

(def edition
  "The name defining a special edition of a document. Normally its a literal value composed of a version number and words."
  {:db/ident :bibo/edition,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "The name defining a special edition of a document. Normally its a literal value composed of a version number and words.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "edition@en",
   :rdfs/range :rdfs/Literal,
   :vs/term_status "stable"})

(def editor
  "A person having managerial and sometimes policy-making responsibility for the editorial part of a publishing firm or of a newspaper, magazine, or other publication."
  {:db/ident :bibo/editor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "A person having managerial and sometimes policy-making responsibility for the editorial part of a publishing firm or of a newspaper, magazine, or other publication.@en",
   :rdfs/domain {:owl/unionOf [:bibo/Collection :bibo/Document],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label "editor",
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf [:dcterms/contributor :bibo/editor],
   :vs/term_status "stable"})

(def editorList
  "An ordered list of editors. Normally, this list is seen as a priority list that order editors by importance."
  {:db/ident :bibo/editorList,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "An ordered list of editors. Normally, this list is seen as a priority list that order editors by importance.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "list of editors@en",
   :rdfs/range {:owl/unionOf [:rdf/List :rdf/Seq],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf [:bibo/contributorList :bibo/editorList],
   :vs/term_status "stable"})

(def eissn
  {:db/ident           :bibo/eissn,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        :bibo/Collection,
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf [:bibo/identifier :bibo/eissn]})

(def fgiasson
  {:db/ident         :bibo/fgiasson,
   :foaf/name        "Frederick Giasson",
   :rdf/type         [:foaf/Person :owl/NamedIndividual :owl/Thing],
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/seeAlso     ["http://fgiasson.com/me/"]})

(def gtin14
  {:db/ident           :bibo/gtin14,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf [:bibo/identifier :bibo/gtin14]})

(def handle
  {:db/ident           :bibo/handle,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf [:bibo/identifier :bibo/handle]})

(def identifier
  {:db/ident           :bibo/identifier,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def interviewee
  "An agent that is interviewed by another agent."
  {:db/ident           :bibo/interviewee,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       #voc/lstr
                        "An agent that is interviewed by another agent.@en",
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/label         "interviewee",
   :rdfs/range         :foaf/Agent,
   :rdfs/subPropertyOf [:dcterms/contributor :bibo/interviewee],
   :vs/term_status     "stable"})

(def interviewer
  "An agent that interview another agent."
  {:db/ident           :bibo/interviewer,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       #voc/lstr "An agent that interview another agent.@en",
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/label         "interviewer",
   :rdfs/range         :foaf/Agent,
   :rdfs/subPropertyOf [:dcterms/contributor :bibo/interviewer],
   :vs/term_status     "stable"})

(def isbn
  {:db/ident :bibo/isbn,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/subPropertyOf [:bibo/identifier :bibo/isbn]})

(def isbn10
  {:db/ident           :bibo/isbn10,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf [:bibo/isbn :bibo/isbn10 :bibo/identifier]})

(def isbn13
  {:db/ident           :bibo/isbn13,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf [:bibo/isbn :bibo/isbn13 :bibo/identifier]})

(def issn
  {:db/ident           :bibo/issn,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        :bibo/Collection,
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf [:bibo/identifier :bibo/issn]})

(def issue
  "An issue number"
  {:db/ident           :bibo/issue,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       #voc/lstr "An issue number@en",
   :rdfs/domain        :bibo/Issue,
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/label         #voc/lstr "issue@en",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf [:bibo/locator :bibo/issue],
   :vs/term_status     "stable"})

(def issuer
  "An entity responsible for issuing often informally published documents such as press releases, reports, etc."
  {:db/ident :bibo/issuer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "An entity responsible for issuing often informally published documents such as press releases, reports, etc.",
   :rdfs/domain {:owl/unionOf [:bibo/Collection :bibo/Document],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label "issuer",
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf [:dcterms/publisher :bibo/issuer],
   :vs/term_status "unstable"})

(def lccn
  {:db/ident           :bibo/lccn,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf [:bibo/identifier :bibo/lccn]})

(def locator
  "A description (often numeric) that locates an item within a containing document or collection."
  {:db/ident :bibo/locator,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "A description (often numeric) that locates an item within a containing document or collection.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "locator@en",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/locator,
   :vs/term_status "stable"})

(def numPages
  "The number of pages contained in a document"
  {:db/ident         :bibo/numPages,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #voc/lstr "The number of pages contained in a document@en",
   :rdfs/domain      :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "number of pages@en",
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   "stable"})

(def numVolumes
  "The number of volumes contained in a collection of documents (usually a series, periodical, etc.)."
  {:db/ident :bibo/numVolumes,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "The number of volumes contained in a collection of documents (usually a series, periodical, etc.).@en",
   :rdfs/domain :bibo/Collection,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "number of volumes@en",
   :rdfs/range :rdfs/Literal,
   :vs/term_status "stable"})

(def number
  "A generic item or document number. Not to be confused with issue number."
  {:db/ident :bibo/number,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "A generic item or document number. Not to be confused with issue number.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "number@en",
   :rdfs/range :rdfs/Literal,
   :vs/term_status "stable"})

(def oclcnum
  {:db/ident           :bibo/oclcnum,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf [:bibo/identifier :bibo/oclcnum]})

(def organizer
  "The organizer of an event; includes conference organizers, but also government agencies or other bodies that are responsible for conducting hearings."
  {:db/ident :bibo/organizer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "The organizer of an event; includes conference organizers, but also government agencies or other bodies that are responsible for conducting hearings.@en",
   :rdfs/domain :event/Event,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "organizer@en",
   :rdfs/range :foaf/Agent,
   :vs/term_status "unstable"})

(def owner
  "Owner of a document or a collection of documents."
  {:db/ident         :bibo/owner,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr
                      "Owner of a document or a collection of documents.@en",
   :rdfs/domain      {:owl/unionOf [:bibo/Collection :bibo/Document],
                      :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "owner@en",
   :rdfs/range       :foaf/Agent,
   :vs/term_status   "unstable"})

(def pageEnd
  "Ending page number within a continuous page range."
  {:db/ident           :bibo/pageEnd,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       #voc/lstr
                        "Ending page number within a continuous page range.@en",
   :rdfs/domain        :bibo/Document,
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/label         #voc/lstr "page end@en",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf [:bibo/locator :bibo/pageEnd],
   :vs/term_status     "stable"})

(def pageStart
  "Starting page number within a continuous page range."
  {:db/ident :bibo/pageStart,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment #voc/lstr
                  "Starting page number within a continuous page range.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "page start@en",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:bibo/locator :bibo/pageStart],
   :vs/term_status "stable"})

(def pages
  "A string of non-contiguous page spans that locate a Document within a Collection. Example: 23-25, 34, 54-56. For continuous page ranges, use the pageStart and pageEnd properties."
  {:db/ident :bibo/pages,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "A string of non-contiguous page spans that locate a Document within a Collection. Example: 23-25, 34, 54-56. For continuous page ranges, use the pageStart and pageEnd properties.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "pages@en",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:bibo/locator :bibo/pages],
   :vs/term_status "stable"})

(def performer
  "performer"
  {:db/ident           :bibo/performer,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :bibo/Performance,
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/label         "performer",
   :rdfs/range         :foaf/Agent,
   :rdfs/subPropertyOf [:dcterms/contributor :bibo/performer],
   :vs/term_status     "stable"})

(def pmid
  {:db/ident           :bibo/pmid,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf [:bibo/identifier :bibo/pmid]})

(def prefixName
  "The prefix of a name"
  {:db/ident         :bibo/prefixName,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #voc/lstr "The prefix of a name@en",
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "prefix name@en",
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   "stable"})

(def presentedAt
  "Relates a document to an event; for example, a paper to a conference."
  {:db/ident :bibo/presentedAt,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Relates a document to an event; for example, a paper to a conference.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "presented at@en",
   :rdfs/range :bibo/Event,
   :rdfs/subPropertyOf [:event/produced_in :bibo/presentedAt],
   :vs/term_status "unstable"})

(def presents
  "Relates an event to associated documents; for example, conference to a paper."
  {:db/ident :bibo/presents,
   :owl/inverseOf :bibo/presentedAt,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Relates an event to associated documents; for example, conference to a paper.@en",
   :rdfs/domain :bibo/Event,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "presents@en",
   :rdfs/range :bibo/Document,
   :rdfs/subPropertyOf [:event/product :bibo/presents],
   :vs/term_status "unstable"})

(def producer
  "Producer of a document or a collection of documents."
  {:db/ident         :bibo/producer,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr
                      "Producer of a document or a collection of documents.@en",
   :rdfs/domain      {:owl/unionOf [:bibo/Collection :bibo/Document],
                      :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "producer@en",
   :rdfs/range       :foaf/Agent,
   :vs/term_status   "stable"})

(def recipient
  "An agent that receives a communication document."
  {:db/ident         :bibo/recipient,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr
                      "An agent that receives a communication document.@en",
   :rdfs/domain      :bibo/PersonalCommunicationDocument,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       "recipient",
   :rdfs/range       :foaf/Agent,
   :vs/term_status   "stable"})

(def reproducedIn
  "The resource in which another resource is reproduced."
  {:db/ident :bibo/reproducedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment #voc/lstr
                  "The resource in which another resource is reproduced.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/range :bibo/Document,
   :rdfs/subPropertyOf [:dcterms/isPartOf :bibo/reproducedIn],
   :vs/term_status "unstable"})

(def reversedBy
  "A legal decision that reverses a ruling."
  {:db/ident           :bibo/reversedBy,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       #voc/lstr "A legal decision that reverses a ruling.@en",
   :rdfs/domain        :bibo/LegalDecision,
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/range         :bibo/LegalDecision,
   :rdfs/subPropertyOf [:bibo/subsequentLegalDecision
                        :bibo/reversedBy
                        :dcterms/isReferencedBy]})

(def reviewOf
  "Relates a review document to a reviewed thing (resource, item, etc.)."
  {:db/ident :bibo/reviewOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Relates a review document to a reviewed thing (resource, item, etc.).@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "review of@en",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf [:dcterms/relation :bibo/reviewOf],
   :vs/term_status "stable"})

(def section
  "A section number"
  {:db/ident :bibo/section,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment #voc/lstr "A section number@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "section@en",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:bibo/locator :bibo/section],
   :skos/example
   #voc/lstr
    "Di Rado, Alicia. 1995. Trekking through college: Classes explore\nmodern society using the world of Star trek. Los Angeles Times, March\n15, sec. A, p. 3.@en",
   :vs/term_status "unstable"})

(def shortDescription
  {:db/ident    :bibo/shortDescription,
   :rdf/type    :owl/DatatypeProperty,
   :rdfs/domain :bibo/Document,
   :rdfs/range  :rdfs/Literal})

(def shortTitle
  "The abbreviation of a title."
  {:db/ident         :bibo/shortTitle,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #voc/lstr "The abbreviation of a title.@en",
   :rdfs/domain      :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "short title@en",
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   "stable"})

(def sici
  {:db/ident           :bibo/sici,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf [:bibo/identifier :bibo/sici]})

(def status
  "The publication status of (typically academic) content."
  {:db/ident :bibo/status,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment #voc/lstr
                  "The publication status of (typically academic) content.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "status@en",
   :rdfs/range :bibo/DocumentStatus,
   :skos/editorialNote
   #voc/lstr
    "We are not defining, using an enumeration, the range of the bibo:status to the defined list of bibo:DocumentStatus. We won't do it because we want people to be able to define new status if needed by some special usecases. Creating such an enumeration would restrict this to happen.@en",
   :vs/term_status "stable"})

(def subsequentLegalDecision
  "A legal decision on appeal that takes action on a case (affirming it, reversing it, etc.)."
  {:db/ident :bibo/subsequentLegalDecision,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "A legal decision on appeal that takes action on a case (affirming it, reversing it, etc.).@en",
   :rdfs/domain :bibo/LegalDecision,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/range :bibo/LegalDecision,
   :rdfs/subPropertyOf [:dcterms/isReferencedBy :bibo/subsequentLegalDecision]})

(def suffixName
  "The suffix of a name"
  {:db/ident         :bibo/suffixName,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #voc/lstr "The suffix of a name@en",
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       #voc/lstr "suffix name@en",
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   "stable"})

(def transcriptOf
  "Relates a document to some transcribed original."
  {:db/ident           :bibo/transcriptOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       #voc/lstr
                        "Relates a document to some transcribed original.@en",
   :rdfs/domain        :bibo/Document,
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/label         #voc/lstr "transcript of@en",
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf [:dcterms/relation :bibo/transcriptOf],
   :vs/term_status     "unstable"})

(def translationOf
  "Relates a translated document to the original document."
  {:db/ident :bibo/translationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment #voc/lstr
                  "Relates a translated document to the original document.@en",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label #voc/lstr "translation of@en",
   :rdfs/range :bibo/Document,
   :rdfs/subPropertyOf [:dcterms/isVersionOf :bibo/translationOf],
   :vs/term_status "stable"})

(def translator
  "A person who translates written document from one language to another."
  {:db/ident :bibo/translator,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "A person who translates written document from one language to another.@en",
   :rdfs/domain {:owl/unionOf [:bibo/Collection :bibo/Document],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label "translator",
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf [:dcterms/contributor :bibo/translator],
   :vs/term_status "stable"})

(def upc
  {:db/ident           :bibo/upc,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf [:bibo/identifier :bibo/upc]})

(def uri
  "Universal Resource Identifier of a document"
  {:db/ident           :bibo/uri,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       #voc/lstr
                        "Universal Resource Identifier of a document@en",
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/label         #voc/lstr "uri@en",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf [:bibo/identifier :bibo/uri],
   :vs/term_status     "stable"})

(def volume
  "A volume number"
  {:db/ident           :bibo/volume,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       #voc/lstr "A volume number@en",
   :rdfs/domain        :bibo/Document,
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/label         #voc/lstr "volume@en",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf [:bibo/locator :bibo/volume],
   :vs/term_status     "stable"})

(def ^{:private true} ma
  "masters degree in arts"
  {:db/ident       :degrees/ma,
   :rdf/type       [:owl/NamedIndividual :bibo/ThesisDegree :owl/Thing],
   :rdfs/comment   #voc/lstr "masters degree in arts@en",
   :rdfs/label     #voc/lstr "M.A.@en",
   :vs/term_status "stable"})

(def ^{:private true} ms
  "masters degree in science"
  {:db/ident       :degrees/ms,
   :rdf/type       [:owl/NamedIndividual :bibo/ThesisDegree :owl/Thing],
   :rdfs/comment   #voc/lstr "masters degree in science@en",
   :rdfs/label     #voc/lstr "M.S.@en",
   :vs/term_status "stable"})

(def ^{:private true} phd
  "PhD degree"
  {:db/ident       :degrees/phd,
   :rdf/type       [:owl/NamedIndividual :bibo/ThesisDegree :owl/Thing],
   :rdfs/comment   #voc/lstr "PhD degree@en",
   :rdfs/label     #voc/lstr "PhD degree@en",
   :vs/term_status "stable"})

(def ^{:private true} Event
  {:db/ident :event/Event,
   :rdf/type :owl/Class,
   :rdfs/subClassOf :event/Event,
   :skos/scopeNote
   #voc/lstr
    "Used to describe bibliographic related events such as conferences, hearing, etc.@en"})

(def ^{:private true} agent
  {:db/ident :event/agent,
   :rdf/type :owl/ObjectProperty,
   :skos/changeNote
   #voc/lstr
    "Used to link an agent (a person) to an event (a conference, an hearing, etc.)@en"})

(def ^{:private true} place
  {:db/ident :event/place,
   :rdf/type :owl/ObjectProperty,
   :skos/scopeNote
   #voc/lstr
    "Used to relate an event such as a conference to the geographical place where it happens, for example Paris.@en"})

(def ^{:private true} produced_in
  {:db/ident :event/produced_in,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf :event/produced_in})

(def ^{:private true} product
  {:db/ident :event/product,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf :event/product,
   :skos/scopeNote
   #voc/lstr
    "Used to link an event such as a conference to an outcome (a product) of that event, for example, an article, a proceeding, etc.@en"})

(def ^{:private true} sub_event
  {:db/ident :event/sub_event,
   :rdf/type :owl/ObjectProperty,
   :skos/scopeNote
   #voc/lstr
    "Used to link big events with smaller events such as workshops that happen in the context of a conference.@en"})

(def ^{:private true} time
  {:db/ident :event/time,
   :rdf/type :owl/ObjectProperty,
   :skos/scopeNote
   #voc/lstr
    "Used to describe the timing of an event. For example, when a conference starts and stops.@en"})

(def ^{:private true} Agent
  {:db/ident :foaf/Agent,
   :rdf/type :owl/Class,
   :skos/scopeNote
   #voc/lstr
    "Used to describe any \"agent\" related to bibliographic items. Such agents can be persons, organizations or groups of any kind.@en"})

(def ^{:private true} Document
  {:db/ident :foaf/Document,
   :rdf/type :owl/Class})

(def ^{:private true} Image
  {:db/ident :foaf/Image,
   :rdf/type :owl/Class})

(def ^{:private true} Organization
  {:db/ident :foaf/Organization,
   :rdf/type :owl/Class,
   :skos/scopeNote
   #voc/lstr
    "Ued to describe an organization related to bibliographic items such as a publishing company, etc.@en"})

(def ^{:private true} Person
  {:db/ident :foaf/Person,
   :rdf/type :owl/Class,
   :skos/scopeNote
   #voc/lstr
    "Used to describe a Person related to a bibliographic ite such as an author, an editor, etc.@en"})

(def ^{:private true} based_near
  {:db/ident :foaf/based_near,
   :rdf/type :owl/ObjectProperty,
   :skos/scopeNote
   #voc/lstr
    "Used to link an agent, related to bibliographic things, to a place where it is based near: can be a city, a monument, a building, etc.@en"})

(def ^{:private true} depiction
  {:db/ident       :foaf/depiction,
   :rdf/type       :owl/ObjectProperty,
   :skos/scopeNote #voc/lstr
                    "Used to link an agent with an image that depict it.@en"})

(def ^{:private true} family_name
  {:db/ident :foaf/family_name,
   :rdf/type :owl/DatatypeProperty,
   :skos/scopeNote
   #voc/lstr
    "This is the property we choose to use to describe the family name of a person related to a bibliographic resource.@en"})

(def ^{:private true} givenname
  {:db/ident :foaf/givenname,
   :rdf/type :owl/DatatypeProperty,
   :skos/scopeNote
   #voc/lstr
    "This is the property we choose to describe the given name of a Person related to a bibliographic resource. This is the first name of a person.@en"})

(def ^{:private true} homepage
  {:db/ident :foaf/homepage,
   :rdf/type :owl/ObjectProperty,
   :skos/scopeNote
   #voc/lstr
    "Used to link an agent to its homepage (which is a web page accessible using a URL).@en"})

(def ^{:private true} name
  {:db/ident :foaf/name,
   :rdf/type :owl/DatatypeProperty})

(def ^{:private true} doi
  {:db/ident :prism/doi,
   :owl/equivalentProperty :bibo/doi,
   :rdf/type :owl/DatatypeProperty})

(def ^{:private true} eIssn
  {:db/ident :prism/eIssn,
   :owl/equivalentProperty :bibo/eissn,
   :rdf/type :owl/DatatypeProperty})

(def ^{:private true} edition
  {:db/ident :prism/edition,
   :owl/equivalentProperty :bibo/edition,
   :rdf/type :owl/DatatypeProperty})

(def ^{:private true} endingPage
  {:db/ident :prism/endingPage,
   :owl/equivalentProperty :bibo/pageEnd,
   :rdf/type :owl/DatatypeProperty})

(def ^{:private true} isbn
  {:db/ident :prism/isbn,
   :owl/equivalentProperty :bibo/isbn,
   :rdf/type :owl/DatatypeProperty})

(def ^{:private true} issn
  {:db/ident :prism/issn,
   :owl/equivalentProperty :bibo/issn,
   :rdf/type :owl/DatatypeProperty})

(def ^{:private true} issue
  {:db/ident :prism/issue,
   :owl/equivalentProperty :bibo/issue,
   :rdf/type :owl/DatatypeProperty})

(def ^{:private true} number
  {:db/ident :prism/number,
   :owl/equivalentProperty :bibo/locator,
   :rdf/type :owl/DatatypeProperty})

(def ^{:private true} startingPage
  {:db/ident :prism/startingPage,
   :owl/equivalentProperty :bibo/pageStart,
   :rdf/type :owl/DatatypeProperty})

(def ^{:private true} volume
  {:db/ident :prism/volume,
   :owl/equivalentProperty :bibo/volume,
   :rdf/type :owl/DatatypeProperty})

(def ^{:private true} localityName
  {:db/ident :schema/localityName,
   :rdf/type :owl/DatatypeProperty,
   :skos/scopeNote
   #voc/lstr "Used to name the locality of a publisher, an author, etc.@en"})

(def ^{:private true} changeNote
  {:db/ident :skos/changeNote,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} editorialNote
  {:db/ident :skos/editorialNote,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} example
  {:db/ident :skos/example,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} historyNote
  {:db/ident :skos/historyNote,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} note
  {:db/ident :skos/note,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} scopeNote
  {:db/ident :skos/scopeNote,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} accepted
  "Accepted for publication after peer reviewing."
  {:db/ident       :status/accepted,
   :rdf/type       [:owl/NamedIndividual :bibo/DocumentStatus :owl/Thing],
   :rdfs/comment   #voc/lstr
                    "Accepted for publication after peer reviewing.@en",
   :rdfs/label     #voc/lstr "accepted@en",
   :vs/term_status "stable"})

(def ^{:private true} draft
  "Document drafted"
  {:db/ident       :status/draft,
   :rdf/type       [:owl/NamedIndividual :bibo/DocumentStatus :owl/Thing],
   :rdfs/comment   #voc/lstr "Document drafted@en",
   :rdfs/label     #voc/lstr "draft@en",
   :vs/term_status "stable"})

(def ^{:private true} forthcoming
  "Document to be published"
  {:db/ident       :status/forthcoming,
   :rdf/type       [:owl/NamedIndividual :bibo/DocumentStatus :owl/Thing],
   :rdfs/comment   #voc/lstr "Document to be published@en",
   :rdfs/label     #voc/lstr "forthcoming@en",
   :vs/term_status "stable"})

(def ^{:private true} legal
  "Legal document"
  {:db/ident       :status/legal,
   :rdf/type       [:owl/NamedIndividual :bibo/DocumentStatus :owl/Thing],
   :rdfs/comment   #voc/lstr "Legal document@en",
   :rdfs/label     #voc/lstr "legal@en",
   :vs/term_status "stable"})

(def ^{:private true} nonPeerReviewed
  "A document that is not peer reviewed"
  {:db/ident       :status/nonPeerReviewed,
   :rdf/type       [:owl/NamedIndividual :bibo/DocumentStatus :owl/Thing],
   :rdfs/comment   #voc/lstr "A document that is not peer reviewed@en",
   :rdfs/label     #voc/lstr "non peer reviewed@en",
   :vs/term_status "stable"})

(def ^{:private true} peerReviewed
  "The process by which articles are chosen to be included in a refereed journal. An editorial board consisting of experts in the same field as the author review the article and decide if it is authoritative enough for publication."
  {:db/ident :status/peerReviewed,
   :rdf/type [:owl/NamedIndividual :bibo/DocumentStatus :owl/Thing],
   :rdfs/comment
   #voc/lstr
    "The process by which articles are chosen to be included in a refereed journal. An editorial board consisting of experts in the same field as the author review the article and decide if it is authoritative enough for publication.@en",
   :rdfs/label #voc/lstr "peer reviewed@en",
   :vs/term_status "stable"})

(def ^{:private true} published
  "Published document"
  {:db/ident       :status/published,
   :rdf/type       [:owl/NamedIndividual :bibo/DocumentStatus :owl/Thing],
   :rdfs/comment   #voc/lstr "Published document@en",
   :rdfs/label     #voc/lstr "published@en",
   :vs/term_status "stable"})

(def ^{:private true} rejected
  "Rejected for publication after peer reviewing."
  {:db/ident       :status/rejected,
   :rdf/type       [:owl/NamedIndividual :bibo/DocumentStatus :owl/Thing],
   :rdfs/comment   #voc/lstr
                    "Rejected for publication after peer reviewing.@en",
   :rdfs/label     #voc/lstr "rejected@en",
   :vs/term_status "stable"})

(def ^{:private true} unpublished
  "Unpublished document"
  {:db/ident       :status/unpublished,
   :rdf/type       [:owl/NamedIndividual :bibo/DocumentStatus :owl/Thing],
   :rdfs/comment   #voc/lstr "Unpublished document@en",
   :rdfs/label     #voc/lstr "unpublished@en",
   :vs/term_status "stable"})

(def ^{:private true} term_status
  {:db/ident :vs/term_status,
   :rdf/type :owl/AnnotationProperty})