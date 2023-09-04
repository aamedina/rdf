(ns net.wikipunk.rdf.bibo
  "The Bibliographic Ontology describes\nbibliographic things on the semantic Web in RDF.  This ontology can be\nused as a citation ontology, as a document classification ontology, or\nsimply as a way to describe any kind of document in RDF. It has been\ninspired by many existing document description metadata formats, and\ncan be used as a common ground for converting other bibliographic data\nsources."
  {:dcterms/creator #{:bibo/bdarcus :bibo/fgiasson},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Bibliographic Ontology describes\nbibliographic things on the semantic Web in RDF.  This ontology can be\nused as a citation ontology, as a document classification ontology, or\nsimply as a way to describe any kind of document in RDF. It has been\ninspired by many existing document description metadata formats, and\ncan be used as a common ground for converting other bibliographic data\nsources."},
   :dcterms/title "The Bibliographic Ontology",
   :namespaces {"bibo"    "http://purl.org/ontology/bibo/",
                "dcterms" "http://purl.org/dc/terms/",
                "degrees" "http://purl.org/ontology/bibo/degrees/",
                "event"   "http://purl.org/NET/c4dm/event.owl#",
                "foaf"    "http://xmlns.com/foaf/0.1/",
                "owl"     "http://www.w3.org/2002/07/owl#",
                "prism"   "http://prismstandard.org/namespaces/1.2/basic/",
                "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                "schema"  "http://schemas.talis.com/2005/address/schema#",
                "skos"    "http://www.w3.org/2004/02/skos/core#",
                "status"  "http://purl.org/ontology/bibo/status/",
                "vann"    "http://purl.org/vocab/vann/",
                "vs"      "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :owl/versionInfo "http://purl.org/ontology/bibo/1.3/",
   :rdf/type :owl/Ontology,
   :rdfa/prefix "bibo",
   :rdfa/uri "http://purl.org/ontology/bibo/",
   :xsd/anyURI "http://purl.org/ontology/bibo/"})

(def AcademicArticle
  {:db/ident :bibo/AcademicArticle,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A scholarly academic article, typically published in a journal."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Academic Article"},
   :rdfs/subClassOf :bibo/Article,
   :vs/term_status "stable"})

(def Article
  {:db/ident :bibo/Article,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A written composition in prose, usually nonfiction, on a specific topic, forming an independent part of a book or other publication, as a newspaper or magazine."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Article"},
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status "stable"})

(def AudioDocument
  {:db/ident         :bibo/AudioDocument,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "An audio document; aka record."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "audio document"},
   :rdfs/subClassOf  :bibo/Document,
   :vs/term_status   "stable"})

(def AudioVisualDocument
  {:db/ident         :bibo/AudioVisualDocument,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "An audio-visual document; film, video, and so forth."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "audio-visual document"},
   :rdfs/subClassOf  :bibo/Document,
   :vs/term_status   "stable"})

(def Bill
  {:db/ident :bibo/Bill,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Draft legislation presented for discussion to a legal body."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Bill"},
   :rdfs/subClassOf :bibo/Legislation,
   :vs/term_status "stable"})

(def Book
  {:db/ident :bibo/Book,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A written or printed work of fiction or nonfiction, usually on sheets of paper fastened or bound together within covers."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Book"},
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status "stable"})

(def BookSection
  {:db/ident         :bibo/BookSection,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A section of a book."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Book Section"},
   :rdfs/subClassOf  :bibo/DocumentPart,
   :vs/term_status   "unstable"})

(def Brief
  {:db/ident         :bibo/Brief,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A written argument submitted to a court."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Brief"},
   :rdfs/subClassOf  :bibo/LegalCaseDocument,
   :vs/term_status   "unstable"})

(def Chapter
  {:db/ident         :bibo/Chapter,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A chapter of a book."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Chapter"},
   :rdfs/subClassOf  :bibo/BookSection,
   :vs/term_status   "unstable"})

(def Code
  {:db/ident         :bibo/Code,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A collection of statutes."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Code"},
   :rdfs/subClassOf  #{{:owl/allValuesFrom :bibo/Legislation,
                        :owl/onProperty    :dcterms/hasPart,
                        :rdf/type          :owl/Restriction} :bibo/Periodical
                       {:owl/minCardinality 1,
                        :owl/onProperty     :dcterms/hasPart,
                        :rdf/type           :owl/Restriction}},
   :vs/term_status   "stable"})

(def CollectedDocument
  {:db/ident :bibo/CollectedDocument,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "A document that simultaneously contains other documents."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Collected Document"},
   :rdfs/subClassOf #{:bibo/Document
                      {:owl/allValuesFrom :bibo/Document,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :dcterms/hasPart,
                       :rdf/type           :owl/Restriction}},
   :vs/term_status "stable"})

(def Collection
  {:db/ident         :bibo/Collection,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A collection of Documents or Collections"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Collection"},
   :rdfs/subClassOf  {:owl/allValuesFrom {:owl/unionOf [:bibo/Collection
                                                        :bibo/Document],
                                          :rdf/type    :owl/Class},
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction},
   :vs/term_status   "stable"})

(def Conference
  {:db/ident         :bibo/Conference,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "A meeting for consultation or discussion."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Conference"},
   :rdfs/subClassOf  :event/Event,
   :vs/term_status   "stable"})

(def CourtReporter
  {:db/ident         :bibo/CourtReporter,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A collection of legal cases."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Court Reporter"},
   :rdfs/subClassOf  #{{:owl/allValuesFrom :bibo/LegalDocument,
                        :owl/onProperty    :dcterms/hasPart,
                        :rdf/type          :owl/Restriction} :bibo/Periodical
                       {:owl/minCardinality 1,
                        :owl/onProperty     :dcterms/hasPart,
                        :rdf/type           :owl/Restriction}},
   :vs/term_status   "stable"})

(def Document
  {:db/ident :bibo/Document,
   :owl/equivalentClass :foaf/Document,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A document (noun) is a bounded physical representation of body of information designed with the capacity (and usually intent) to communicate. A document may manifest symbolic, diagrammatic or sensory-representational information."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Document"},
   :vs/term_status "stable"})

(def DocumentPart
  {:db/ident :bibo/DocumentPart,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "a distinct part of a larger document or collected document."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "document part"},
   :rdfs/subClassOf #{:bibo/Document
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :dcterms/isPartOf,
                       :rdf/type           :owl/Restriction}},
   :vs/term_status "unstable"})

(def DocumentStatus
  {:db/ident         :bibo/DocumentStatus,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The status of the publication of a document."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Document Status"},
   :vs/term_status   "stable"})

(def EditedBook
  {:db/ident         :bibo/EditedBook,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "An edited book."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Edited Book"},
   :rdfs/subClassOf  :bibo/CollectedDocument,
   :vs/term_status   "stable"})

(def Email
  {:db/ident :bibo/Email,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A written communication addressed to a person or organization and transmitted electronically."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EMail"},
   :rdfs/subClassOf :bibo/PersonalCommunicationDocument,
   :vs/term_status "stable"})

(def Event
  {:db/ident :bibo/Event,
   :rdf/type :owl/Class})

(def Excerpt
  {:db/ident         :bibo/Excerpt,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A passage selected from a larger work."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Excerpt"},
   :rdfs/subClassOf  :bibo/DocumentPart,
   :vs/term_status   "stable"})

(def Film
  {:db/ident         :bibo/Film,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "aka movie."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Film"},
   :rdfs/subClassOf  :bibo/AudioVisualDocument,
   :vs/term_status   "stable"})

(def Hearing
  {:db/ident :bibo/Hearing,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance or a session in which testimony and arguments are presented, esp. before an official, as a judge in a lawsuit."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Hearing"},
   :rdfs/subClassOf :event/Event,
   :vs/term_status "stable"})

(def Image
  {:db/ident :bibo/Image,
   :owl/equivalentClass :foaf/Image,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "A document that presents visual or diagrammatic information."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Image"},
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status "stable"})

(def Interview
  {:db/ident         :bibo/Interview,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A formalized discussion between two or more people."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Interview"},
   :rdfs/subClassOf  :event/Event,
   :vs/term_status   "stable"})

(def Issue
  {:db/ident :bibo/Issue,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "something that is printed or published and distributed, esp. a given number of a periodical"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Issue"},
   :rdfs/subClassOf #{:bibo/CollectedDocument
                      {:owl/allValuesFrom :bibo/Article,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :dcterms/hasPart,
                       :rdf/type           :owl/Restriction}},
   :vs/term_status "stable"})

(def Journal
  {:db/ident         :bibo/Journal,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "A periodical of scholarly journal Articles."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Journal"},
   :rdfs/subClassOf  #{:bibo/Periodical
                       {:owl/allValuesFrom :bibo/Issue,
                        :owl/onProperty    :dcterms/hasPart,
                        :rdf/type          :owl/Restriction}
                       {:owl/minCardinality 1,
                        :owl/onProperty     :dcterms/hasPart,
                        :rdf/type           :owl/Restriction}},
   :vs/term_status   "stable"})

(def LegalCaseDocument
  {:db/ident         :bibo/LegalCaseDocument,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A document accompanying a legal case."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Legal Case Document"},
   :rdfs/subClassOf  :bibo/LegalDocument,
   :vs/term_status   "unstable"})

(def LegalDecision
  {:db/ident :bibo/LegalDecision,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A document containing an authoritative determination (as a decree or judgment) made after consideration of facts or law."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Decision"},
   :rdfs/subClassOf :bibo/LegalCaseDocument,
   :vs/term_status "unstable"})

(def LegalDocument
  {:db/ident :bibo/LegalDocument,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A legal document; for example, a court decision, a brief, and so forth."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Legal Document"},
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status "stable"})

(def Legislation
  {:db/ident :bibo/Legislation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A legal document proposing or enacting a law or a group of laws."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Legislation"},
   :rdfs/subClassOf :bibo/LegalDocument,
   :vs/term_status "unstable"})

(def Letter
  {:db/ident :bibo/Letter,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A written or printed communication addressed to a person or organization and usually transmitted by mail."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Letter"},
   :rdfs/subClassOf :bibo/PersonalCommunicationDocument,
   :vs/term_status "stable"})

(def Magazine
  {:db/ident :bibo/Magazine,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A periodical of magazine Articles. A magazine is a publication that is issued periodically, usually bound in a paper cover, and typically contains essays, stories, poems, etc., by many writers, and often photographs and drawings, frequently specializing in a particular subject or area, as hobbies, news, or sports."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Magazine"},
   :rdfs/subClassOf #{:bibo/Periodical
                      {:owl/allValuesFrom :bibo/Issue,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :dcterms/hasPart,
                       :rdf/type           :owl/Restriction}},
   :vs/term_status "stable"})

(def Manual
  {:db/ident :bibo/Manual,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "A small reference book, especially one giving instructions."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Manual"},
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status "unstable"})

(def Manuscript
  {:db/ident :bibo/Manuscript,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An unpublished Document, which may also be submitted to a publisher for publication."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Manuscript"},
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status "stable"})

(def Map
  {:db/ident         :bibo/Map,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A graphical depiction of geographic features."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Map"},
   :rdfs/subClassOf  :bibo/Image,
   :vs/term_status   "unstable"})

(def MultiVolumeBook
  {:db/ident :bibo/MultiVolumeBook,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "A loose, thematic, collection of Documents, often Books."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Multivolume Book"},
   :rdfs/subClassOf #{:bibo/Collection
                      {:owl/allValuesFrom :bibo/Book,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}},
   :vs/term_status "stable"})

(def Newspaper
  {:db/ident :bibo/Newspaper,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A periodical of documents, usually issued daily or weekly, containing current news, editorials, feature articles, and usually advertising."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Newspaper"},
   :rdfs/subClassOf #{:bibo/Periodical
                      {:owl/allValuesFrom :bibo/Issue,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :dcterms/hasPart,
                       :rdf/type           :owl/Restriction}},
   :vs/term_status "stable"})

(def Note
  {:db/ident         :bibo/Note,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Notes or annotations about a resource."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Note"},
   :rdfs/subClassOf  :bibo/Document,
   :vs/term_status   "stable"})

(def Patent
  {:db/ident :bibo/Patent,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A document describing the exclusive right granted by a government to an inventor to manufacture, use, or sell an invention for a certain number of years."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Patent"},
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status "stable"})

(def Performance
  {:db/ident         :bibo/Performance,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A public performance."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Performance"},
   :rdfs/subClassOf  :event/Event,
   :vs/term_status   "unstable"})

(def Periodical
  {:db/ident :bibo/Periodical,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "A group of related documents issued at regular intervals."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Periodical"},
   :rdfs/subClassOf #{{:owl/allValuesFrom :bibo/Issue,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction} :bibo/Collection
                      {:owl/minCardinality 1,
                       :owl/onProperty     :dcterms/hasPart,
                       :rdf/type           :owl/Restriction}},
   :vs/term_status "stable"})

(def PersonalCommunication
  {:db/ident :bibo/PersonalCommunication,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A communication between an agent and one or more specific recipients."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personal Communication"},
   :rdfs/subClassOf :event/Event,
   :vs/term_status "stable"})

(def PersonalCommunicationDocument
  {:db/ident         :bibo/PersonalCommunicationDocument,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A personal communication manifested in some document."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Personal Communication Document"},
   :rdfs/subClassOf  :bibo/Document,
   :vs/term_status   "stable"})

(def Proceedings
  {:db/ident :bibo/Proceedings,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A compilation of documents published from an event, such as a conference."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Proceedings"},
   :rdfs/subClassOf :bibo/Book,
   :vs/term_status "unstable"})

(def Quote
  {:db/ident         :bibo/Quote,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "An excerpted collection of words."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Quote"},
   :rdfs/subClassOf  :bibo/Excerpt,
   :vs/term_status   "stable"})

(def ReferenceSource
  {:db/ident :bibo/ReferenceSource,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A document that presents authoritative reference information, such as a dictionary or encylopedia ."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Reference Source"},
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status "unstable"})

(def Report
  {:db/ident :bibo/Report,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A document describing an account or statement describing in detail an event, situation, or the like, usually as the result of observation, inquiry, etc.."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Report"},
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status "stable"})

(def Series
  {:db/ident :bibo/Series,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "A loose, thematic, collection of Documents, often Books."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Series"},
   :rdfs/subClassOf #{{:owl/allValuesFrom :bibo/Document,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction} :bibo/Collection},
   :vs/term_status "stable"})

(def Slide
  {:db/ident         :bibo/Slide,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A slide in a slideshow"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Slide"},
   :rdfs/subClassOf  :bibo/DocumentPart,
   :vs/term_status   "unstable"})

(def Slideshow
  {:db/ident :bibo/Slideshow,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A presentation of a series of slides, usually presented in front of an audience with written text and images."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Slideshow"},
   :rdfs/subClassOf #{{:owl/allValuesFrom :bibo/Slide,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction} :bibo/Document},
   :vs/term_status "stable"})

(def Specification
  {:db/ident         :bibo/Specification,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A document describing a specification."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Specification"},
   :rdfs/subClassOf  :bibo/Document,
   :vs/term_status   "testing"})

(def Standard
  {:db/ident :bibo/Standard,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A document describing a standard: a specification organized through a standards body."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Standard"},
   :rdfs/subClassOf :bibo/Specification,
   :vs/term_status "stable"})

(def Statute
  {:db/ident         :bibo/Statute,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A bill enacted into law."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Statute"},
   :rdfs/subClassOf  :bibo/Legislation,
   :vs/term_status   "stable"})

(def Thesis
  {:db/ident :bibo/Thesis,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A document created to summarize research findings associated with the completion of an academic degree."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Thesis"},
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status "stable"})

(def ThesisDegree
  {:db/ident         :bibo/ThesisDegree,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The academic degree of a Thesis"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Thesis degree"},
   :vs/term_status   "stable"})

(def Webpage
  {:db/ident :bibo/Webpage,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A web page is an online document available (at least initially) on the world wide web. A web page is written first and foremost to appear on the web, as distinct from other online resources such as books, manuscripts or audio documents which use the web primarily as a distribution mechanism alongside other more traditional methods such as print."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Webpage"},
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status "unstable"})

(def Website
  {:db/ident         :bibo/Website,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "A group of Webpages accessible on the Web."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Website"},
   :rdfs/subClassOf  #{:bibo/Collection
                       {:owl/minCardinality 1,
                        :owl/onProperty     :dcterms/hasPart,
                        :rdf/type           :owl/Restriction}
                       {:owl/allValuesFrom :bibo/Webpage,
                        :owl/onProperty    :dcterms/hasPart,
                        :rdf/type          :owl/Restriction}},
   :vs/term_status   "unstable"})

(def Workshop
  {:db/ident :bibo/Workshop,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A seminar, discussion group, or the like, that emphasizes zxchange of ideas and the demonstration and application of techniques, skills, etc."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Workshop"},
   :rdfs/subClassOf :event/Event,
   :vs/term_status "stable"})

(def abstract
  {:db/ident         :bibo/abstract,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "A summary of the resource.",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       "abstract",
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   "stable"})

(def affirmedBy
  {:db/ident           :bibo/affirmedBy,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value "A legal decision that affirms a ruling."},
   :rdfs/domain        :bibo/LegalDecision,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/range         :bibo/LegalDecision,
   :rdfs/subPropertyOf :bibo/subsequentLegalDecision})

(def annotates
  {:db/ident           :bibo/annotates,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "Critical or explanatory note for a Document."},
   :rdfs/domain        :bibo/Note,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "annotates"},
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :dcterms/relation,
   :vs/term_status     "stable"})

(def argued
  {:db/ident :bibo/argued,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The date on which a legal case is argued before a court. Date is of format xsd:date"},
   :rdfs/domain :bibo/LegalDocument,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "date argued"},
   :rdfs/range :rdfs/Literal,
   :vs/term_status "unstable"})

(def asin
  {:db/ident           :bibo/asin,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def authorList
  {:db/ident :bibo/authorList,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An ordered list of authors. Normally, this list is seen as a priority list that order authors by importance."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "list of authors"},
   :rdfs/range {:owl/unionOf [:rdf/List :rdf/Seq],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :bibo/contributorList,
   :vs/term_status "stable"})

(def bdarcus
  {:db/ident         :bibo/bdarcus,
   :foaf/name        "Bruce D'Arcus",
   :rdf/type         #{:owl/Thing :foaf/Person :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/seeAlso     {:xsd/anyURI "http://purl.org/net/darcusb/info#me"}})

(def chapter
  {:db/ident           :bibo/chapter,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "An chapter number"},
   :rdfs/domain        :bibo/BookSection,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "chapter"},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/locator,
   :vs/term_status     "unstable"})

(def citedBy
  {:db/ident :bibo/citedBy,
   :owl/inverseOf :bibo/cites,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Relates a document to another document that cites the\nfirst document."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cited by"},
   :rdfs/range :bibo/Document,
   :vs/term_status "unstable"})

(def cites
  {:db/ident :bibo/cites,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Relates a document to another document that is cited\nby the first document as reference, comment, review, quotation or for\nanother purpose."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cites"},
   :rdfs/range :bibo/Document,
   :rdfs/subPropertyOf :dcterms/references,
   :vs/term_status "unstable"})

(def coden
  {:db/ident           :bibo/coden,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def content
  {:db/ident :bibo/content,
   :owl/deprecated true,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property is for a plain-text rendering of the content of a Document. While the plain-text content of an entire document could be described by this property."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "content"},
   :rdfs/range :rdfs/Literal,
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "bibo:content has been deprecated; we recommend to use \"rdf:value\" for this purpose. Here is the rational behind this choice: http://www.w3.org/TR/2004/REC-rdf-primer-20040210/#rdfvalue"},
   :vs/term_status "unstable"})

(def contributorList
  {:db/ident :bibo/contributorList,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An ordered list of contributors. Normally, this list is seen as a priority list that order contributors by importance."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "list of contributors"},
   :rdfs/range {:owl/unionOf [:rdf/List :rdf/Seq],
                :rdf/type    :owl/Class},
   :vs/term_status "stable"})

(def court
  {:db/ident :bibo/court,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A court associated with a legal document; for example, that which issues a decision."},
   :rdfs/domain :bibo/LegalDocument,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "court"},
   :rdfs/range :foaf/Organization,
   :vs/term_status "unstable"})

(def degree
  {:db/ident :bibo/degree,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The thesis degree."},
   :rdfs/domain :bibo/Thesis,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "degree"},
   :rdfs/range :bibo/ThesisDegree,
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "We are not defining, using an enumeration, the range of the bibo:degree to the defined list of bibo:ThesisDegree. We won't do it because we want people to be able to define new degress if needed by some special usecases. Creating such an enumeration would restrict this to happen."},
   :vs/term_status "unstable"})

(def director
  {:db/ident           :bibo/director,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "A Film director."},
   :rdfs/domain        :bibo/AudioVisualDocument,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label         "director",
   :rdfs/range         :foaf/Agent,
   :rdfs/subPropertyOf :dcterms/contributor,
   :vs/term_status     "stable"})

(def distributor
  {:db/ident :bibo/distributor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Distributor of a document or a collection of documents."},
   :rdfs/domain {:owl/unionOf [:bibo/Collection :bibo/Document],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "distributor"},
   :rdfs/range :foaf/Agent,
   :vs/term_status "stable"})

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
  {:db/ident :bibo/edition,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The name defining a special edition of a document. Normally its a literal value composed of a version number and words."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "edition"},
   :rdfs/range :rdfs/Literal,
   :vs/term_status "stable"})

(def editor
  {:db/ident :bibo/editor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A person having managerial and sometimes policy-making responsibility for the editorial part of a publishing firm or of a newspaper, magazine, or other publication."},
   :rdfs/domain {:owl/unionOf [:bibo/Collection :bibo/Document],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label "editor",
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf :dcterms/contributor,
   :vs/term_status "stable"})

(def editorList
  {:db/ident :bibo/editorList,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An ordered list of editors. Normally, this list is seen as a priority list that order editors by importance."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "list of editors"},
   :rdfs/range {:owl/unionOf [:rdf/List :rdf/Seq],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :bibo/contributorList,
   :vs/term_status "stable"})

(def eissn
  {:db/ident           :bibo/eissn,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        :bibo/Collection,
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def fgiasson
  {:db/ident         :bibo/fgiasson,
   :foaf/name        "Frederick Giasson",
   :rdf/type         #{:owl/Thing :foaf/Person :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/seeAlso     {:xsd/anyURI "http://fgiasson.com/me/"}})

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
  {:db/ident           :bibo/interviewee,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "An agent that is interviewed by another agent."},
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label         "interviewee",
   :rdfs/range         :foaf/Agent,
   :rdfs/subPropertyOf :dcterms/contributor,
   :vs/term_status     "stable"})

(def interviewer
  {:db/ident           :bibo/interviewer,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "An agent that interview another agent."},
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label         "interviewer",
   :rdfs/range         :foaf/Agent,
   :rdfs/subPropertyOf :dcterms/contributor,
   :vs/term_status     "stable"})

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
   :rdfs/subPropertyOf :bibo/isbn})

(def isbn13
  {:db/ident           :bibo/isbn13,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/isbn})

(def issn
  {:db/ident           :bibo/issn,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        :bibo/Collection,
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def issue
  {:db/ident           :bibo/issue,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "An issue number"},
   :rdfs/domain        :bibo/Issue,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "issue"},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/locator,
   :vs/term_status     "stable"})

(def issuer
  {:db/ident :bibo/issuer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "An entity responsible for issuing often informally published documents such as press releases, reports, etc.",
   :rdfs/domain {:owl/unionOf [:bibo/Collection :bibo/Document],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label "issuer",
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf :dcterms/publisher,
   :vs/term_status "unstable"})

(def lccn
  {:db/ident           :bibo/lccn,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def locator
  {:db/ident :bibo/locator,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A description (often numeric) that locates an item within a containing document or collection."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "locator"},
   :rdfs/range :rdfs/Literal,
   :vs/term_status "stable"})

(def numPages
  {:db/ident         :bibo/numPages,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "The number of pages contained in a document"},
   :rdfs/domain      :bibo/Document,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "number of pages"},
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   "stable"})

(def numVolumes
  {:db/ident :bibo/numVolumes,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The number of volumes contained in a collection of documents (usually a series, periodical, etc.)."},
   :rdfs/domain :bibo/Collection,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "number of volumes"},
   :rdfs/range :rdfs/Literal,
   :vs/term_status "stable"})

(def number
  {:db/ident :bibo/number,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A generic item or document number. Not to be confused with issue number."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "number"},
   :rdfs/range :rdfs/Literal,
   :vs/term_status "stable"})

(def oclcnum
  {:db/ident           :bibo/oclcnum,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def organizer
  {:db/ident :bibo/organizer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The organizer of an event; includes conference organizers, but also government agencies or other bodies that are responsible for conducting hearings."},
   :rdfs/domain :event/Event,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "organizer"},
   :rdfs/range :foaf/Agent,
   :vs/term_status "unstable"})

(def owner
  {:db/ident         :bibo/owner,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Owner of a document or a collection of documents."},
   :rdfs/domain      {:owl/unionOf [:bibo/Collection :bibo/Document],
                      :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "owner"},
   :rdfs/range       :foaf/Agent,
   :vs/term_status   "unstable"})

(def pageEnd
  {:db/ident           :bibo/pageEnd,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "Ending page number within a continuous page range."},
   :rdfs/domain        :bibo/Document,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "page end"},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/locator,
   :vs/term_status     "stable"})

(def pageStart
  {:db/ident           :bibo/pageStart,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "Starting page number within a continuous page range."},
   :rdfs/domain        :bibo/Document,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "page start"},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/locator,
   :vs/term_status     "stable"})

(def pages
  {:db/ident :bibo/pages,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A string of non-contiguous page spans that locate a Document within a Collection. Example: 23-25, 34, 54-56. For continuous page ranges, use the pageStart and pageEnd properties."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pages"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/locator,
   :vs/term_status "stable"})

(def performer
  {:db/ident           :bibo/performer,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :bibo/Performance,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label         "performer",
   :rdfs/range         :foaf/Agent,
   :rdfs/subPropertyOf :dcterms/contributor,
   :vs/term_status     "stable"})

(def pmid
  {:db/ident           :bibo/pmid,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def prefixName
  {:db/ident         :bibo/prefixName,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The prefix of a name"},
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "prefix name"},
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   "stable"})

(def presentedAt
  {:db/ident :bibo/presentedAt,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Relates a document to an event; for example, a paper to a conference."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "presented at"},
   :rdfs/range :bibo/Event,
   :rdfs/subPropertyOf :event/produced_in,
   :vs/term_status "unstable"})

(def presents
  {:db/ident :bibo/presents,
   :owl/inverseOf :bibo/presentedAt,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Relates an event to associated documents; for example, conference to a paper."},
   :rdfs/domain :bibo/Event,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "presents"},
   :rdfs/range :bibo/Document,
   :rdfs/subPropertyOf :event/product,
   :vs/term_status "unstable"})

(def producer
  {:db/ident         :bibo/producer,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Producer of a document or a collection of documents."},
   :rdfs/domain      {:owl/unionOf [:bibo/Collection :bibo/Document],
                      :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "producer"},
   :rdfs/range       :foaf/Agent,
   :vs/term_status   "stable"})

(def recipient
  {:db/ident         :bibo/recipient,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "An agent that receives a communication document."},
   :rdfs/domain      :bibo/PersonalCommunicationDocument,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       "recipient",
   :rdfs/range       :foaf/Agent,
   :vs/term_status   "stable"})

(def reproducedIn
  {:db/ident :bibo/reproducedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The resource in which another resource is reproduced."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/range :bibo/Document,
   :rdfs/subPropertyOf :dcterms/isPartOf,
   :vs/term_status "unstable"})

(def reversedBy
  {:db/ident           :bibo/reversedBy,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value "A legal decision that reverses a ruling."},
   :rdfs/domain        :bibo/LegalDecision,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/range         :bibo/LegalDecision,
   :rdfs/subPropertyOf :bibo/subsequentLegalDecision})

(def reviewOf
  {:db/ident :bibo/reviewOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Relates a review document to a reviewed thing (resource, item, etc.)."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "review of"},
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :dcterms/relation,
   :vs/term_status "stable"})

(def section
  {:db/ident :bibo/section,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A section number"},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "section"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/locator,
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Di Rado, Alicia. 1995. Trekking through college: Classes explore\nmodern society using the world of Star trek. Los Angeles Times, March\n15, sec. A, p. 3."},
   :vs/term_status "unstable"})

(def shortDescription
  {:db/ident    :bibo/shortDescription,
   :rdf/type    :owl/DatatypeProperty,
   :rdfs/domain :bibo/Document,
   :rdfs/range  :rdfs/Literal})

(def shortTitle
  {:db/ident         :bibo/shortTitle,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The abbreviation of a title."},
   :rdfs/domain      :bibo/Document,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "short title"},
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   "stable"})

(def sici
  {:db/ident           :bibo/sici,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def status
  {:db/ident :bibo/status,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The publication status of (typically academic) content."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "status"},
   :rdfs/range :bibo/DocumentStatus,
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "We are not defining, using an enumeration, the range of the bibo:status to the defined list of bibo:DocumentStatus. We won't do it because we want people to be able to define new status if needed by some special usecases. Creating such an enumeration would restrict this to happen."},
   :vs/term_status "stable"})

(def subsequentLegalDecision
  {:db/ident :bibo/subsequentLegalDecision,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A legal decision on appeal that takes action on a case (affirming it, reversing it, etc.)."},
   :rdfs/domain :bibo/LegalDecision,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/range :bibo/LegalDecision,
   :rdfs/subPropertyOf :dcterms/isReferencedBy})

(def suffixName
  {:db/ident         :bibo/suffixName,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The suffix of a name"},
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "suffix name"},
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   "stable"})

(def transcriptOf
  {:db/ident           :bibo/transcriptOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "Relates a document to some transcribed original."},
   :rdfs/domain        :bibo/Document,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "transcript of"},
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :dcterms/relation,
   :vs/term_status     "unstable"})

(def translationOf
  {:db/ident :bibo/translationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Relates a translated document to the original document."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "translation of"},
   :rdfs/range :bibo/Document,
   :rdfs/subPropertyOf :dcterms/isVersionOf,
   :vs/term_status "stable"})

(def translator
  {:db/ident :bibo/translator,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A person who translates written document from one language to another."},
   :rdfs/domain {:owl/unionOf [:bibo/Collection :bibo/Document],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label "translator",
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf :dcterms/contributor,
   :vs/term_status "stable"})

(def upc
  {:db/ident           :bibo/upc,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def uri
  {:db/ident           :bibo/uri,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "Universal Resource Identifier of a document"},
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "uri"},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier,
   :vs/term_status     "stable"})

(def volume
  {:db/ident           :bibo/volume,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "A volume number"},
   :rdfs/domain        :bibo/Document,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/ontology/bibo/"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "volume"},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/locator,
   :vs/term_status     "stable"})