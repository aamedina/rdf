(ns net.wikipunk.rdf.doap
  "The Description of a Project (DOAP) vocabulary, described using W3C RDF Schema and the Web Ontology Language."
  {:dc11/creator "Edd Wilder-James",
   :dc11/description
   #{"The Description of a Project (DOAP) vocabulary, described using W3C RDF Schema and the Web Ontology Language."
     {:rdf/language "pt",
      :rdf/value
      "Vocabulário de descrição de um Projeto (DOAP - Description of a Project), descrito no esquema (schema) W3C RDF e na Web Ontology Language."}
     {:rdf/language "cs",
      :rdf/value
      "Slovník Description of a Project (DOAP, Popis projektu), popsaný použitím W3C RDF Schema a Web Ontology Language."}
     {:rdf/language "de",
      :rdf/value
      "Das Vokabular \"Description of a Project (DOAP)\", beschrieben durch W3C RDF Schema and the Web Ontology Language."}
     {:rdf/language "fr",
      :rdf/value
      "Le vocabulaire Description Of A Project (DOAP, Description D'Un Projet),\n\t\tdécrit en utilisant RDF Schema du W3C et OWL."}
     {:rdf/language "es",
      :rdf/value
      "El vocabulario Description of a Project (DOAP, Descripción de un Proyecto), descrito usando RDF Schema de W3C\n\t\ty Web Ontology Language."}},
   :dc11/format "application/rdf+xml",
   :dc11/rights "Copyright © The DOAP Authors",
   :dc11/title "Description of a Project (DOAP) vocabulary",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/ewilderj/doap/master/schema/doap.rdf",
   :foaf/maker {:foaf/mbox {:xsd/anyURI "mailto:edd@usefulinc.com"},
                :foaf/name "Edd Wilder-James",
                :rdf/type  :foaf/Person},
   :owl/imports :foaf/index.rdf,
   :rdf/ns-prefix-map {"dc11" "http://purl.org/dc/elements/1.1/",
                       "doap" "http://usefulinc.com/ns/doap#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vs"   "http://www.w3.org/2003/06/sw-vocab-status/ns#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "doap",
   :rdfa/uri "http://usefulinc.com/ns/doap#",
   :xsd/anyURI "http://usefulinc.com/ns/doap#"}
  (:refer-clojure :exclude [name]))

(def ArchRepository
  {:db/ident         :doap/ArchRepository,
   :rdf/type         #{:rdfs/Class :owl/Class},
   :rdfs/comment     #{{:rdf/language "cs",
                        :rdf/value    "Úložiště zdrojových kódů GNU Arch."}
                       {:rdf/language "es",
                        :rdf/value    "Repositorio GNU Arch del código fuente."}
                       {:rdf/language "en",
                        :rdf/value    "GNU Arch source code repository."}
                       {:rdf/language "pt",
                        :rdf/value    "Repositório GNU Arch do código fonte."}
                       {:rdf/language "fr",
                        :rdf/value    "Dépôt GNU Arch du code source."}
                       {:rdf/language "de",
                        :rdf/value "GNU Arch Quellcode-Versionierungssystem."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "es",
                        :rdf/value    "Repositorio GNU Arch"}
                       {:rdf/language "de",
                        :rdf/value    "GNU Arch repository"}
                       {:rdf/language "en",
                        :rdf/value    "GNU Arch repository"}
                       {:rdf/language "pt",
                        :rdf/value    "Repositório GNU Arch"}
                       {:rdf/language "fr",
                        :rdf/value    "Dépôt GNU Arch"}
                       {:rdf/language "cs",
                        :rdf/value    "Úložiště GNU Arch"}},
   :rdfs/subClassOf  :doap/Repository})

(def BKRepository
  {:db/ident         :doap/BKRepository,
   :rdf/type         #{:rdfs/Class :owl/Class},
   :rdfs/comment     #{{:rdf/language "de",
                        :rdf/value "BitKeeper Quellcode-Versionierungssystem."}
                       {:rdf/language "cs",
                        :rdf/value    "Úložiště zdrojových kódů BitKeeper."}
                       {:rdf/language "en",
                        :rdf/value    "BitKeeper source code repository."}
                       {:rdf/language "fr",
                        :rdf/value    "Dépôt BitKeeper du code source."}
                       {:rdf/language "pt",
                        :rdf/value    "Repositório BitKeeper do código fonte."}
                       {:rdf/language "es",
                        :rdf/value "Repositorio BitKeeper del código fuente."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "de",
                        :rdf/value    "BitKeeper Repository"}
                       {:rdf/language "fr",
                        :rdf/value    "Dépôt BitKeeper"}
                       {:rdf/language "cs",
                        :rdf/value    "Úložiště BitKeeper"}
                       {:rdf/language "en",
                        :rdf/value    "BitKeeper Repository"}
                       {:rdf/language "pt",
                        :rdf/value    "Repositório Bitkeeper"}
                       {:rdf/language "es",
                        :rdf/value    "Repositorio BitKeeper"}},
   :rdfs/subClassOf  :doap/Repository})

(def BazaarBranch
  {:db/ident         :doap/BazaarBranch,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #{{:rdf/language "en",
                        :rdf/value    "Bazaar source code branch."}
                       {:rdf/language "pt",
                        :rdf/value    "Código fonte da ramificação Bazaar."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "pt",
                        :rdf/value    "Ramificação Bazaar"}
                       {:rdf/language "en",
                        :rdf/value    "Bazaar Branch"}},
   :rdfs/subClassOf  :doap/Repository})

(def CVSRepository
  {:db/ident         :doap/CVSRepository,
   :rdf/type         #{:rdfs/Class :owl/Class},
   :rdfs/comment     #{{:rdf/language "pt",
                        :rdf/value    "Repositório CVS do código fonte."}
                       {:rdf/language "cs",
                        :rdf/value    "Úložiště zdrojových kódů CVS."}
                       {:rdf/language "fr",
                        :rdf/value    "Dépôt CVS du code source."}
                       {:rdf/language "es",
                        :rdf/value    "Repositorio CVS del código fuente."}
                       {:rdf/language "en",
                        :rdf/value    "CVS source code repository."}
                       {:rdf/language "de",
                        :rdf/value    "CVS Quellcode-Versionierungssystem."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "cs",
                        :rdf/value    "Úložiště CVS"}
                       {:rdf/language "es",
                        :rdf/value    "Repositorio CVS"}
                       {:rdf/language "pt",
                        :rdf/value    "Repositório CVS"}
                       {:rdf/language "en",
                        :rdf/value    "CVS Repository"}
                       {:rdf/language "de",
                        :rdf/value    "CVS Repository"}
                       {:rdf/language "fr",
                        :rdf/value    "Dépôt CVS"}},
   :rdfs/subClassOf  :doap/Repository})

(def DarcsRepository
  {:db/ident         :doap/DarcsRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #{{:rdf/language "es",
                        :rdf/value    "Repositorio darcs del código fuente."}
                       {:rdf/language "pt",
                        :rdf/value    "Repositório darcs do código fonte."}
                       {:rdf/language "en",
                        :rdf/value    "darcs source code repository."}
                       {:rdf/language "fr",
                        :rdf/value    "Dépôt darcs du code source."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "es",
                        :rdf/value    "Repositorio darcs"}
                       {:rdf/language "fr",
                        :rdf/value    "Dépôt darcs"}
                       {:rdf/language "en",
                        :rdf/value    "darcs Repository"}
                       {:rdf/language "pt",
                        :rdf/value    "Repositório darcs"}},
   :rdfs/subClassOf  :doap/Repository})

(def GitBranch
  {:db/ident         :doap/GitBranch,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #{{:rdf/language "en",
                        :rdf/value    "Git source code branch."}
                       {:rdf/language "pt",
                        :rdf/value    "Código fonte da ramificação Git."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "en",
                        :rdf/value    "Git Branch"}
                       {:rdf/language "pt",
                        :rdf/value    "Ramificação Git"}},
   :rdfs/subClassOf  :doap/Repository})

(def GitRepository
  {:db/ident         :doap/GitRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #{{:rdf/language "cs",
                        :rdf/value    "Úložiště zdrojových kódů Git."}
                       {:rdf/language "fr",
                        :rdf/value    "Dépôt Git du code source."}
                       {:rdf/language "es",
                        :rdf/value    "Repositorio Git del código fuente."}
                       {:rdf/language "en",
                        :rdf/value    "Git source code repository."}
                       {:rdf/language "pt",
                        :rdf/value    "Repositório Git do código fonte."}
                       {:rdf/language "de",
                        :rdf/value    "Git Quellcode-Versionierungssystem."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "pt",
                        :rdf/value    "Repositório Git"}
                       {:rdf/language "fr",
                        :rdf/value    "Dépôt Git"}
                       {:rdf/language "de",
                        :rdf/value    "Git Repository"}
                       {:rdf/language "es",
                        :rdf/value    "Repositorio Git"}
                       {:rdf/language "en",
                        :rdf/value    "Git Repository"}
                       {:rdf/language "cs",
                        :rdf/value    "Úložiště Git"}},
   :rdfs/subClassOf  :doap/Repository})

(def HgRepository
  {:db/ident         :doap/HgRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #{{:rdf/language "pt",
                        :rdf/value    "Repositório Mercurial do código fonte."}
                       {:rdf/language "en",
                        :rdf/value    "Mercurial source code repository."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "pt",
                        :rdf/value    "Repositório Mercurial"}
                       {:rdf/language "en",
                        :rdf/value    "Mercurial Repository"}},
   :rdfs/subClassOf  :doap/Repository})

(def Project
  {:db/ident         :doap/Project,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #{{:rdf/language "es",
                        :rdf/value    "Un proyecto."}
                       {:rdf/language "pt",
                        :rdf/value    "Projeto."}
                       {:rdf/language "fr",
                        :rdf/value    "Un projet."}
                       {:rdf/language "de",
                        :rdf/value    "Ein Projekt."}
                       {:rdf/language "cs",
                        :rdf/value    "Projekt."}
                       {:rdf/language "en",
                        :rdf/value    "A project."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "de",
                        :rdf/value    "Projekt"}
                       {:rdf/language "cs",
                        :rdf/value    "Projekt"}
                       {:rdf/language "en",
                        :rdf/value    "Project"}
                       {:rdf/language "fr",
                        :rdf/value    "Projet"}
                       {:rdf/language "es",
                        :rdf/value    "Proyecto"}
                       {:rdf/language "pt",
                        :rdf/value    "Projeto"}},
   :rdfs/subClassOf  #{{:xsd/anyURI "http://xmlns.com/wordnet/1.6/Project"}
                       :foaf/Project}})

(def Repository
  {:db/ident         :doap/Repository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #{{:rdf/language "en",
                        :rdf/value    "Source code repository."}
                       {:rdf/language "cs",
                        :rdf/value    "Úložiště zdrojových kódů."}
                       {:rdf/language "pt",
                        :rdf/value    "Repositório do código fonte."}
                       {:rdf/language "es",
                        :rdf/value    "Repositorio del código fuente."}
                       {:rdf/language "fr",
                        :rdf/value    "Dépôt du code source."}
                       {:rdf/language "de",
                        :rdf/value    "Quellcode-Versionierungssystem."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "de",
                        :rdf/value    "Repository"}
                       {:rdf/language "fr",
                        :rdf/value    "Dépôt"}
                       {:rdf/language "en",
                        :rdf/value    "Repository"}
                       {:rdf/language "pt",
                        :rdf/value    "Repositório"}
                       {:rdf/language "es",
                        :rdf/value    "Repositorio"}
                       {:rdf/language "cs",
                        :rdf/value    "Úložiště"}}})

(def SVNRepository
  {:db/ident         :doap/SVNRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #{{:rdf/language "fr",
                        :rdf/value    "Dépôt Subversion du code source."}
                       {:rdf/language "en",
                        :rdf/value    "Subversion source code repository."}
                       {:rdf/language "de",
                        :rdf/value "Subversion Quellcode-Versionierungssystem."}
                       {:rdf/language "es",
                        :rdf/value "Repositorio Subversion del código fuente."}
                       {:rdf/language "pt",
                        :rdf/value    "Repositório Subversion do código fonte."}
                       {:rdf/language "cs",
                        :rdf/value    "Úložiště zdrojových kódů Subversion."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "fr",
                        :rdf/value    "Dépôt Subversion"}
                       {:rdf/language "pt",
                        :rdf/value    "Repositório Subversion"}
                       {:rdf/language "de",
                        :rdf/value    "Subversion Repository"}
                       {:rdf/language "cs",
                        :rdf/value    "Úložiště Subversion"}
                       {:rdf/language "es",
                        :rdf/value    "Repositorio Subversion"}
                       {:rdf/language "en",
                        :rdf/value    "Subversion Repository"}},
   :rdfs/subClassOf  :doap/Repository})

(def Specification
  {:db/ident :doap/Specification,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #{{:rdf/language "pt",
      :rdf/value "A especificação de aspetos, técnicas ou outros do sistema."}
     {:rdf/language "en",
      :rdf/value
      "A specification of a system's aspects, technical or otherwise."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label #{{:rdf/language "pt",
                  :rdf/value    "Especificação"}
                 {:rdf/language "en",
                  :rdf/value    "Specification"}},
   :rdfs/subClassOf :rdfs/Resource})

(def Version
  {:db/ident :doap/Version,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value    "Version information of a project release."}
     {:rdf/language "cs",
      :rdf/value    "Informace o uvolněné verzi projektu."}
     {:rdf/language "fr",
      :rdf/value    "Détails sur une version d'une release d'un projet."}
     {:rdf/language "pt",
      :rdf/value    "Informação sobre a versão do projeto lançado."}
     {:rdf/language "es",
      :rdf/value    "Información sobre la versión de un release del proyecto."}
     {:rdf/language "de",
      :rdf/value    "Versionsinformation eines Projekt Releases."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label #{{:rdf/language "de",
                  :rdf/value    "Version"}
                 {:rdf/language "cs",
                  :rdf/value    "Verze"}
                 {:rdf/language "en",
                  :rdf/value    "Version"}
                 {:rdf/language "pt",
                  :rdf/value    "Versão"}
                 {:rdf/language "es",
                  :rdf/value    "Versión"}
                 {:rdf/language "fr",
                  :rdf/value    "Version"}}})

(def anon-root
  {:db/ident         :doap/anon-root,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #{{:rdf/language "cs",
                        :rdf/value    "Úložiště pro anonymní přístup."}
                       {:rdf/language "en",
                        :rdf/value    "Repository for anonymous access."}
                       {:rdf/language "pt",
                        :rdf/value    "Repositório para acesso anónimo."}
                       {:rdf/language "es",
                        :rdf/value    "Repositorio para acceso anónimo."}
                       {:rdf/language "de",
                        :rdf/value    "Repository für anonymen Zugriff"}
                       {:rdf/language "fr",
                        :rdf/value    "Dépôt pour accès anonyme."}},
   :rdfs/domain      :doap/Repository,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "en",
                        :rdf/value    "anonymous root"}
                       {:rdf/language "es",
                        :rdf/value    "raíz anónima"}
                       {:rdf/language "de",
                        :rdf/value    "Anonymes Root"}
                       {:rdf/language "pt",
                        :rdf/value    "raíz anónima"}
                       {:rdf/language "fr",
                        :rdf/value    "racine anonyme"}
                       {:rdf/language "cs",
                        :rdf/value    "anonymní kořen"}},
   :rdfs/range       :rdfs/Literal})

(def audience
  {:db/ident         :doap/audience,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #{{:rdf/language "pt",
                        :rdf/value    "Descrição do utilizador base alvo"}
                       {:rdf/language "en",
                        :rdf/value    "Description of target user base"}},
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "pt",
                        :rdf/value    "audiência"}
                       {:rdf/language "en",
                        :rdf/value    "audience"}},
   :rdfs/range       :rdfs/Literal})

(def blog
  {:db/ident         :doap/blog,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #{{:rdf/language "en",
                        :rdf/value    "URI of a blog related to a project"}
                       {:rdf/language "pt",
                        :rdf/value
                        "URI de um blog relacionado com um projeto"}},
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "en",
                        :rdf/value    "blog"}
                       {:rdf/language "pt",
                        :rdf/value    "blog"}},
   :rdfs/range       #{:rdfs/Resource :sioc.types/Weblog}})

(def browse
  {:db/ident         :doap/browse,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #{{:rdf/language "es",
                        :rdf/value    "Interface web del repositorio."}
                       {:rdf/language "fr",
                        :rdf/value    "Interface web au dépôt."}
                       {:rdf/language "de",
                        :rdf/value "Web-Browser Interface für das Repository."}
                       {:rdf/language "cs",
                        :rdf/value "Webové rozhraní pro prohlížení úložiště."}
                       {:rdf/language "pt",
                        :rdf/value    "Interface web do repositório."}
                       {:rdf/language "en",
                        :rdf/value    "Web browser interface to repository."}},
   :rdfs/domain      :doap/Repository,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "pt",
                        :rdf/value    "navegar"}
                       {:rdf/language "en",
                        :rdf/value    "browse"}
                       {:rdf/language "fr",
                        :rdf/value    "visualiser"}
                       {:rdf/language "es",
                        :rdf/value    "navegar"}
                       {:rdf/language "cs",
                        :rdf/value    "prohlížeč"}
                       {:rdf/language "de",
                        :rdf/value    "browse"}}})

(def bug-database
  {:db/ident         :doap/bug-database,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #{{:rdf/language "fr",
                        :rdf/value    "Suivi des bugs pour un projet."}
                       {:rdf/language "en",
                        :rdf/value    "Bug tracker for a project."}
                       {:rdf/language "pt",
                        :rdf/value    "Bug tracker para um projeto."}
                       {:rdf/language "de",
                        :rdf/value    "Fehlerdatenbank eines Projektes."}
                       {:rdf/language "es",
                        :rdf/value    "Bug tracker para un proyecto."}
                       {:rdf/language "cs",
                        :rdf/value    "Správa chyb projektu."}},
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "cs",
                        :rdf/value    "databáze chyb"}
                       {:rdf/language "es",
                        :rdf/value    "base de datos de bugs"}
                       {:rdf/language "de",
                        :rdf/value    "Fehlerdatenbank"}
                       {:rdf/language "fr",
                        :rdf/value    "suivi des bugs"}
                       {:rdf/language "pt",
                        :rdf/value    "base de dados de bugs"}
                       {:rdf/language "en",
                        :rdf/value    "bug database"}}})

(def category
  {:db/ident         :doap/category,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #{{:rdf/language "de",
                        :rdf/value    "Eine Kategorie eines Projektes."}
                       {:rdf/language "cs",
                        :rdf/value    "Kategorie projektu."}
                       {:rdf/language "fr",
                        :rdf/value    "Une catégorie de projet."}
                       {:rdf/language "pt",
                        :rdf/value    "Uma categoría de projeto."}
                       {:rdf/language "en",
                        :rdf/value    "A category of project."}
                       {:rdf/language "es",
                        :rdf/value    "Una categoría de proyecto."}},
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "cs",
                        :rdf/value    "kategorie"}
                       {:rdf/language "de",
                        :rdf/value    "Kategorie"}
                       {:rdf/language "es",
                        :rdf/value    "categoría"}
                       {:rdf/language "pt",
                        :rdf/value    "categoria"}
                       {:rdf/language "fr",
                        :rdf/value    "catégorie"}
                       {:rdf/language "en",
                        :rdf/value    "category"}}})

(def created
  {:db/ident :doap/created,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "Date when something was created, in YYYY-MM-DD form. e.g. 2004-04-05"}
     {:rdf/language "fr",
      :rdf/value
      "Date à laquelle a été créé quelque chose, au format AAAA-MM-JJ (par ex. 2004-04-05)"}
     {:rdf/language "pt",
      :rdf/value
      "Data em que algo foi criado, no formato AAAA-MM-DD. e.g. 2004-04-05"}
     {:rdf/language "cs",
      :rdf/value
      "Datum, kdy bylo něco vytvořeno ve formátu RRRR-MM-DD, např. 2004-04-05"}
     {:rdf/language "de",
      :rdf/value
      "Erstellungsdatum von Irgendwas, angegeben im YYYY-MM-DD Format, z.B. 2004-04-05."}
     {:rdf/language "es",
      :rdf/value
      "Fecha en la que algo fue creado, en formato AAAA-MM-DD. e.g. 2004-04-05"}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label #{{:rdf/language "pt",
                  :rdf/value    "criado"}
                 {:rdf/language "en",
                  :rdf/value    "created"}
                 {:rdf/language "cs",
                  :rdf/value    "vytvořeno"}
                 {:rdf/language "fr",
                  :rdf/value    "créé"}
                 {:rdf/language "de",
                  :rdf/value    "erstellt"}
                 {:rdf/language "es",
                  :rdf/value    "creado"}},
   :rdfs/range :rdfs/Literal})

(def description
  {:db/ident :doap/description,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "es",
      :rdf/value
      "Descripción en texto plano de un proyecto, de 2 a 4 enunciados de longitud."}
     {:rdf/language "cs",
      :rdf/value    "Čistě textový, 2 až 4 věty dlouhý popis projektu."}
     {:rdf/language "pt",
      :rdf/value
      "Descrição de um projeto em texto apenas, com 2 a 4 frases de comprimento."}
     {:rdf/language "en",
      :rdf/value
      "Plain text description of a project, of 2-4 sentences in length."}
     {:rdf/language "de",
      :rdf/value
      "Beschreibung eines Projekts als einfacher Text mit der Länge von 2 bis 4 Sätzen."}
     {:rdf/language "fr",
      :rdf/value    "Texte descriptif d'un projet, long de 2 à 4 phrases."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label #{{:rdf/language "pt",
                  :rdf/value    "descrição"}
                 {:rdf/language "cs",
                  :rdf/value    "popis"}
                 {:rdf/language "fr",
                  :rdf/value    "description"}
                 {:rdf/language "en",
                  :rdf/value    "description"}
                 {:rdf/language "es",
                  :rdf/value    "descripción"}
                 {:rdf/language "de",
                  :rdf/value    "Beschreibung"}},
   :rdfs/range :rdfs/Literal})

(def developer
  {:db/ident         :doap/developer,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #{{:rdf/language "de",
                        :rdf/value    "Software-Entwickler für das Projekt."}
                       {:rdf/language "es",
                        :rdf/value
                        "Desarrollador de software para el proyecto."}
                       {:rdf/language "fr",
                        :rdf/value    "Développeur pour le projet."}
                       {:rdf/language "pt",
                        :rdf/value    "Programador de software para o projeto."}
                       {:rdf/language "en",
                        :rdf/value    "Developer of software for the project."}
                       {:rdf/language "cs",
                        :rdf/value    "Vývojář softwaru projektu."}},
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "de",
                        :rdf/value    "Entwickler"}
                       {:rdf/language "fr",
                        :rdf/value    "développeur"}
                       {:rdf/language "cs",
                        :rdf/value    "vývojář"}
                       {:rdf/language "es",
                        :rdf/value    "desarrollador"}
                       {:rdf/language "pt",
                        :rdf/value    "programador"}
                       {:rdf/language "en",
                        :rdf/value    "developer"}},
   :rdfs/range       :foaf/Person})

(def developer-forum
  {:db/ident         :doap/developer-forum,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A forum or community for developers of this project."},
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "developer forum"},
   :rdfs/range       :sioc/Container})

(def documentation
  {:db/ident         :doap/documentation,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #{{:rdf/language "en",
                        :rdf/value    "Documentation of the project."}
                       {:rdf/language "fr",
                        :rdf/value    "Aide pour l’utilisation de ce projet."}},
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "en",
                        :rdf/value    "documentation"}
                       {:rdf/language "fr",
                        :rdf/value    "aide"}}})

(def documenter
  {:db/ident         :doap/documenter,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #{{:rdf/language "es",
                        :rdf/value
                        "Proveedor de documentación para el proyecto."}
                       {:rdf/language "cs",
                        :rdf/value    "Spoluautor dokumentace projektu."}
                       {:rdf/language "en",
                        :rdf/value
                        "Contributor of documentation to the project."}
                       {:rdf/language "fr",
                        :rdf/value
                        "Collaborateur à la documentation du projet."}
                       {:rdf/language "de",
                        :rdf/value
                        "Mitarbeiter an der Dokumentation des Projektes."}
                       {:rdf/language "pt",
                        :rdf/value
                        "Contribuidor para a documentação do projeto."}},
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "en",
                        :rdf/value    "documenter"}
                       {:rdf/language "de",
                        :rdf/value    "Dokumentator"}
                       {:rdf/language "pt",
                        :rdf/value    "documentador"}
                       {:rdf/language "fr",
                        :rdf/value    "rédacteur de l'aide"}
                       {:rdf/language "cs",
                        :rdf/value    "dokumentarista"}
                       {:rdf/language "es",
                        :rdf/value    "escritor de ayuda"}},
   :rdfs/range       :foaf/Person})

(def download-mirror
  {:db/ident :doap/download-mirror,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value    "Mirror of software download web page."}
     {:rdf/language "es",
      :rdf/value    "Mirror de la página web de descarga."}
     {:rdf/language "cs",
      :rdf/value    "Zrcadlo stránky pro stažení softwaru."}
     {:rdf/language "pt",
      :rdf/value    "Mirror da página web para fazer download."}
     {:rdf/language "de",
      :rdf/value
      "Spiegel der Seite von die Projekt-Software heruntergeladen werden kann."}
     {:rdf/language "fr",
      :rdf/value    "Miroir de la page de téléchargement du programme."}},
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "download mirror"}
                 {:rdf/language "pt",
                  :rdf/value    "mirror para download"}
                 {:rdf/language "es",
                  :rdf/value    "mirror de descarga"}
                 {:rdf/language "fr",
                  :rdf/value    "miroir pour le téléchargement"}
                 {:rdf/language "de",
                  :rdf/value    "Spiegel der Seite zum Herunterladen"}
                 {:rdf/language "cs",
                  :rdf/value    "zrcadlo stránky pro stažení"}}})

(def download-page
  {:db/ident :doap/download-page,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "pt",
      :rdf/value
      "Página web da qual o projeto de software pode ser descarregado."}
     {:rdf/language "cs",
      :rdf/value "Webová stránka, na které lze stáhnout projektový software."}
     {:rdf/language "en",
      :rdf/value "Web page from which the project software can be downloaded."}
     {:rdf/language "es",
      :rdf/value    "Página web de la cuál se puede bajar el software."}
     {:rdf/language "de",
      :rdf/value
      "Web-Seite von der die Projekt-Software heruntergeladen werden kann."}
     {:rdf/language "fr",
      :rdf/value
      "Page web à partir de laquelle on peut télécharger le programme."}},
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label #{{:rdf/language "cs",
                  :rdf/value    "stránka pro stažení"}
                 {:rdf/language "es",
                  :rdf/value    "página de descarga"}
                 {:rdf/language "fr",
                  :rdf/value    "page de téléchargement"}
                 {:rdf/language "pt",
                  :rdf/value    "página para download"}
                 {:rdf/language "en",
                  :rdf/value    "download page"}
                 {:rdf/language "de",
                  :rdf/value    "Seite zum Herunterladen"}}})

(def file-release
  {:db/ident         :doap/file-release,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #{{:rdf/language "pt",
                        :rdf/value
                        "URI para download associado com a publicação."}
                       {:rdf/language "en",
                        :rdf/value
                        "URI of download associated with this release."}
                       {:rdf/language "cs",
                        :rdf/value "URI adresa stažení asociované s revizí."}},
   :rdfs/domain      :doap/Version,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "en",
                        :rdf/value    "file-release"}
                       {:rdf/language "pt",
                        :rdf/value    "publicação do ficheiro"}
                       {:rdf/language "cs",
                        :rdf/value    "soubor revize"}}})

(def helper
  {:db/ident         :doap/helper,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #{{:rdf/language "es",
                        :rdf/value    "Colaborador del proyecto."}
                       {:rdf/language "en",
                        :rdf/value    "Project contributor."}
                       {:rdf/language "pt",
                        :rdf/value    "Ajudante ou colaborador do projeto."}
                       {:rdf/language "fr",
                        :rdf/value    "Collaborateur au projet."}
                       {:rdf/language "cs",
                        :rdf/value    "Spoluautor projektu."}
                       {:rdf/language "de",
                        :rdf/value    "Projekt-Mitarbeiter."}},
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "en",
                        :rdf/value    "helper"}
                       {:rdf/language "pt",
                        :rdf/value    "colaborador"}
                       {:rdf/language "es",
                        :rdf/value    "colaborador"}
                       {:rdf/language "de",
                        :rdf/value    "Helfer"}
                       {:rdf/language "cs",
                        :rdf/value    "spoluautor"}
                       {:rdf/language "fr",
                        :rdf/value    "collaborateur"}},
   :rdfs/range       :foaf/Person})

(def homepage
  {:db/ident :doap/homepage,
   :rdf/type #{:rdf/Property :owl/InverseFunctionalProperty},
   :rdfs/comment
   #{{:rdf/language "de",
      :rdf/value
      "URL der Projekt-Homepage,\n\t\tverbunden mit genau einem Projekt."}
     {:rdf/language "es",
      :rdf/value
      "El URL de la página de un proyecto,\n\t\tasociada con exactamente un proyecto."}
     {:rdf/language "pt",
      :rdf/value
      "O URL da página de um projeto,\n\t\tasociada com exactamente um projeto."}
     {:rdf/language "en",
      :rdf/value
      "URL of a project's homepage,\n\t\tassociated with exactly one project."}
     {:rdf/language "fr",
      :rdf/value
      "L'URL de la page web d'un projet,\n\t\tassociée avec un unique projet."}
     {:rdf/language "cs",
      :rdf/value
      "URL adresa domovské stránky projektu asociované s právě jedním projektem."}},
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "page web"}
                 {:rdf/language "cs",
                  :rdf/value    "domovská stránka"}
                 {:rdf/language "es",
                  :rdf/value    "página web"}
                 {:rdf/language "de",
                  :rdf/value    "Homepage"}
                 {:rdf/language "en",
                  :rdf/value    "homepage"}
                 {:rdf/language "pt",
                  :rdf/value    "página web"}},
   :rdfs/subPropertyOf :foaf/homepage})

(def implements
  {:db/ident :doap/implements,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "pt",
      :rdf/value
      "Uma especificação que um projeto implementa. Pode ser uma padrão, API ou um nível de conformidade definida legalmente."}
     {:rdf/language "en",
      :rdf/value
      "A specification that a project implements. Could be a standard, API or legally defined level of conformance."}},
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Implements specification"}
                 {:rdf/language "pt",
                  :rdf/value    "Especificações para implementação"}},
   :rdfs/range :doap/Specification})

(def language
  {:db/ident :doap/language,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value    "BCP47 language code a project has been translated into"}
     {:rdf/language "pt",
      :rdf/value
      "Código de idioma BCP47 do projeto para o qual foi traduzido"}},
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "language"}
                 {:rdf/language "pt",
                  :rdf/value    "idioma"}},
   :rdfs/range :rdfs/Literal})

(def license
  {:db/ident :doap/license,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The URI of an RDF description of the license the software is distributed under. E.g. a SPDX reference"}
     {:rdf/language "pt",
      :rdf/value
      "O URI de uma descrição RDF da licença do software sob a qual é distribuída. Ex.: referência SPDX"}
     {:rdf/language "cs",
      :rdf/value
      "URI adresa RDF popisu licence, pod kterou je software distribuován."}
     {:rdf/language "es",
      :rdf/value
      "El URI de una descripción RDF de la licencia bajo la cuál se distribuye el software."}
     {:rdf/language "de",
      :rdf/value
      "Die URI einer RDF-Beschreibung einer Lizenz unter der die Software herausgegeben wird. z.B. eine SPDX Referenz"}
     {:rdf/language "fr",
      :rdf/value
      "L'URI d'une description RDF de la licence sous laquelle le programme est distribué."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "licencia"}
                 {:rdf/language "pt",
                  :rdf/value    "licença"}
                 {:rdf/language "cs",
                  :rdf/value    "licence"}
                 {:rdf/language "de",
                  :rdf/value    "Lizenz"}
                 {:rdf/language "en",
                  :rdf/value    "license"}
                 {:rdf/language "fr",
                  :rdf/value    "licence"}}})

(def location
  {:db/ident         :doap/location,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #{{:rdf/language "pt",
                        :rdf/value    "Localização de um repositório."}
                       {:rdf/language "es",
                        :rdf/value    "lugar de un repositorio."}
                       {:rdf/language "fr",
                        :rdf/value    "Emplacement d'un dépôt."}
                       {:rdf/language "cs",
                        :rdf/value    "Umístění úložiště."}
                       {:rdf/language "en",
                        :rdf/value    "Location of a repository."}
                       {:rdf/language "de",
                        :rdf/value    "Lokation eines Repositorys."}},
   :rdfs/domain      :doap/Repository,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "pt",
                        :rdf/value    "localização do respositório"}
                       {:rdf/language "cs",
                        :rdf/value    "umístění úložiště"}
                       {:rdf/language "en",
                        :rdf/value    "repository location"}
                       {:rdf/language "es",
                        :rdf/value    "lugar del respositorio"}
                       {:rdf/language "de",
                        :rdf/value    "Repository Lokation"}
                       {:rdf/language "fr",
                        :rdf/value    "emplacement du dépôt"}}})

(def mailing-list
  {:db/ident :doap/mailing-list,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "cs",
      :rdf/value    "Domovská stránka nebo e–mailová adresa e–mailové diskuse."}
     {:rdf/language "de",
      :rdf/value    "Homepage der Mailing Liste oder E-Mail Adresse."}
     {:rdf/language "fr",
      :rdf/value "Page web de la liste de diffusion, ou adresse de courriel."}
     {:rdf/language "en",
      :rdf/value    "Mailing list home page or email address."}
     {:rdf/language "es",
      :rdf/value    "Página web de la lista de correo o dirección de correo."}
     {:rdf/language "pt",
      :rdf/value
      "Página web da lista de distribuição de e-mail ou dos endereços."}},
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label #{{:rdf/language "pt",
                  :rdf/value    "lista de distribuição de e-mail"}
                 {:rdf/language "fr",
                  :rdf/value    "liste de diffusion"}
                 {:rdf/language "es",
                  :rdf/value    "lista de correo"}
                 {:rdf/language "de",
                  :rdf/value    "Mailing Liste"}
                 {:rdf/language "en",
                  :rdf/value    "mailing list"}
                 {:rdf/language "cs",
                  :rdf/value    "e–mailová diskuse"}},
   :rdfs/range :sioc.types/MailingList})

(def maintainer
  {:db/ident :doap/maintainer,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "fr",
      :rdf/value    "Développeur principal d'un projet, un meneur du projet."}
     {:rdf/language "cs",
      :rdf/value    "Správce projektu, vedoucí projektu."}
     {:rdf/language "es",
      :rdf/value
      "Desarrollador principal de un proyecto, un líder de proyecto."}
     {:rdf/language "de",
      :rdf/value    "Hauptentwickler eines Projektes, der Projektleiter"}
     {:rdf/language "en",
      :rdf/value    "Maintainer of a project, a project leader."}
     {:rdf/language "pt",
      :rdf/value "Programador principal de um projeto, um líder de projeto."}},
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label #{{:rdf/language "de",
                  :rdf/value    "Projektverantwortlicher"}
                 {:rdf/language "cs",
                  :rdf/value    "správce"}
                 {:rdf/language "en",
                  :rdf/value    "maintainer"}
                 {:rdf/language "pt",
                  :rdf/value    "programador principal"}
                 {:rdf/language "fr",
                  :rdf/value    "développeur principal"}
                 {:rdf/language "es",
                  :rdf/value    "desarrollador principal"}},
   :rdfs/range :foaf/Person})

(def module
  {:db/ident :doap/module,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "fr",
      :rdf/value "Nom du module d'un dépôt Subversion, CVS, BitKeeper ou Arch."}
     {:rdf/language "cs",
      :rdf/value    "Jméno modulu v CVS, BitKeeper nebo Arch úložišti."}
     {:rdf/language "de",
      :rdf/value
      "Modul-Name eines Subversion, CVS, BitKeeper oder Arch Repositorys."}
     {:rdf/language "pt",
      :rdf/value
      "Nome do módulo de um repositório Subversion, CVS, BitKeeper ou Arch."}
     {:rdf/language "en",
      :rdf/value
      "Module name of a Subversion, CVS, BitKeeper or Arch repository."}
     {:rdf/language "es",
      :rdf/value
      "Nombre del módulo de un repositorio Subversion, CVS, BitKeeper o Arch."}},
   :rdfs/domain
   {:owl/unionOf [:doap/CVSRepository :doap/ArchRepository :doap/BKRepository],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label #{{:rdf/language "de",
                  :rdf/value    "Modul"}
                 {:rdf/language "en",
                  :rdf/value    "module"}
                 {:rdf/language "fr",
                  :rdf/value    "module"}
                 {:rdf/language "cs",
                  :rdf/value    "modul"}
                 {:rdf/language "es",
                  :rdf/value    "módulo"}
                 {:rdf/language "pt",
                  :rdf/value    "módulo"}}})

(def name
  {:db/ident           :doap/name,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #{{:rdf/language "cs",
                          :rdf/value    "Jméno něčeho."}
                         {:rdf/language "de",
                          :rdf/value    "Der Name von Irgendwas"}
                         {:rdf/language "pt",
                          :rdf/value    "O nome de alguma coisa."}
                         {:rdf/language "en",
                          :rdf/value    "A name of something."}
                         {:rdf/language "es",
                          :rdf/value    "El nombre de algo."}
                         {:rdf/language "fr",
                          :rdf/value    "Le nom de quelque chose."}},
   :rdfs/isDefinedBy   {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label         #{{:rdf/language "pt",
                          :rdf/value    "nome"}
                         {:rdf/language "es",
                          :rdf/value    "nombre"}
                         {:rdf/language "de",
                          :rdf/value    "Name"}
                         {:rdf/language "en",
                          :rdf/value    "name"}
                         {:rdf/language "fr",
                          :rdf/value    "nom"}
                         {:rdf/language "cs",
                          :rdf/value    "jméno"}},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :rdfs/label})

(def old-homepage
  {:db/ident :doap/old-homepage,
   :rdf/type #{:rdf/Property :owl/InverseFunctionalProperty},
   :rdfs/comment
   #{{:rdf/language "pt",
      :rdf/value
      "O URL antigo da página de um projeto,\n\t\tassociada com exactamente um projeto."}
     {:rdf/language "en",
      :rdf/value
      "URL of a project's past homepage,\n\t\tassociated with exactly one project."}
     {:rdf/language "fr",
      :rdf/value
      "L'URL d'une ancienne page web d'un\n\t\tprojet, associée avec un unique projet."}
     {:rdf/language "es",
      :rdf/value
      "El URL de la antigua página de un proyecto,\n\t\tasociada con exactamente un proyecto."}
     {:rdf/language "de",
      :rdf/value
      "URL der letzten Projekt-Homepage,\n\t\tverbunden mit genau einem Projekt."}
     {:rdf/language "cs",
      :rdf/value
      "URL adresa předešlé domovské stránky projektu asociované s právě jedním projektem."}},
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label #{{:rdf/language "pt",
                  :rdf/value    "página web antiga"}
                 {:rdf/language "en",
                  :rdf/value    "old homepage"}
                 {:rdf/language "es",
                  :rdf/value    "página web antigua"}
                 {:rdf/language "cs",
                  :rdf/value    "stará domovská stránka"}
                 {:rdf/language "fr",
                  :rdf/value    "ancienne page web"}
                 {:rdf/language "de",
                  :rdf/value    "Alte Homepage"}},
   :rdfs/subPropertyOf :foaf/homepage})

(def os
  {:db/ident :doap/os,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "Operating system that a project is limited to.  Omit this property if the project is not OS-specific."}
     {:rdf/language "cs",
      :rdf/value
      "Operační systém, na jehož použití je projekt limitován. Vynechejte tuto vlastnost, pokud je projekt nezávislý na operačním systému."}
     {:rdf/language "fr",
      :rdf/value
      "Système d'exploitation auquel est limité le projet. Omettez cette propriété si le\n\t\tprojet n'est pas limité à un système d'exploitation."}
     {:rdf/language "es",
      :rdf/value
      "Sistema opertivo al cuál está limitado el proyecto.  Omita esta propiedad si el proyecto no es específico\n\t\tde un sistema opertaivo en particular."}
     {:rdf/language "en",
      :rdf/value
      "Sistema operativo a que o projeto está limitado. Omita esta propriedade se o projeto não é condicionado pelo SO usado."}
     {:rdf/language "de",
      :rdf/value
      "Betriebssystem auf dem das Projekt eingesetzt werden kann. Diese Eigenschaft kann ausgelassen werden, wenn das Projekt nicht BS-spezifisch ist."}},
   :rdfs/domain #{:doap/Project :doap/Version},
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "système d'exploitation"}
                 {:rdf/language "en",
                  :rdf/value    "operating system"}
                 {:rdf/language "pt",
                  :rdf/value    "sistema operativo"}
                 {:rdf/language "es",
                  :rdf/value    "sistema operativo"}
                 {:rdf/language "cs",
                  :rdf/value    "operační systém"}
                 {:rdf/language "de",
                  :rdf/value    "Betriebssystem"}},
   :rdfs/range :rdfs/Literal})

(def platform
  {:db/ident :doap/platform,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "Indicator of software platform (non-OS specific), e.g. Java, Firefox, ECMA CLR"}
     {:rdf/language "pt",
      :rdf/value
      "Indicador da plataforma do software (não específico a nenhum SO), ex.: Java, Firefox, ECMA CLR"}},
   :rdfs/domain #{:doap/Project :doap/Version},
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label #{{:rdf/language "pt",
                  :rdf/value    "plataforma"}
                 {:rdf/language "en",
                  :rdf/value    "platform"}},
   :rdfs/range :rdfs/Literal})

(def programming-language
  {:db/ident :doap/programming-language,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "pt",
      :rdf/value
      "Linguagem de programação que o projeto usa ou é para ser utilizada."}
     {:rdf/language "es",
      :rdf/value
      "Lenguaje de programación en el que un proyecto es implementado o con el cuál pretende usarse."}
     {:rdf/language "de",
      :rdf/value
      "Programmiersprache in der ein Projekt implementiert ist oder intendiert wird zu benutzen."}
     {:rdf/language "cs",
      :rdf/value
      "Programovací jazyk, ve kterém je projekt implementován nebo pro který je zamýšlen k použití."}
     {:rdf/language "fr",
      :rdf/value
      "Langage de programmation avec lequel un projet est implémenté,\n\t\tou avec lequel il est prévu de l'utiliser."}
     {:rdf/language "en",
      :rdf/value
      "Programming language a project is implemented in or intended for use with."}},
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "lenguaje de programación"}
                 {:rdf/language "en",
                  :rdf/value    "programming language"}
                 {:rdf/language "de",
                  :rdf/value    "Programmiersprache"}
                 {:rdf/language "pt",
                  :rdf/value    "linguagem de programação"}
                 {:rdf/language "fr",
                  :rdf/value    "langage de programmation"}
                 {:rdf/language "cs",
                  :rdf/value    "programovací jazyk"}},
   :rdfs/range :rdfs/Literal})

(def release
  {:db/ident         :doap/release,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #{{:rdf/language "en",
                        :rdf/value    "A project release."}
                       {:rdf/language "de",
                        :rdf/value    "Ein Release (Version) eines Projekts."}
                       {:rdf/language "cs",
                        :rdf/value    "Relase (verze) projektu."}
                       {:rdf/language "pt",
                        :rdf/value    "A publicação de um projeto."}
                       {:rdf/language "fr",
                        :rdf/value    "Une release (révision) d'un projet."}
                       {:rdf/language "es",
                        :rdf/value    "Un release (versión) de un proyecto."}},
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "en",
                        :rdf/value    "release"}
                       {:rdf/language "es",
                        :rdf/value    "release"}
                       {:rdf/language "de",
                        :rdf/value    "Release"}
                       {:rdf/language "cs",
                        :rdf/value    "release"}
                       {:rdf/language "fr",
                        :rdf/value    "release"}
                       {:rdf/language "pt",
                        :rdf/value    "publicação"}},
   :rdfs/range       :doap/Version})

(def repository
  {:db/ident         :doap/repository,
   :owl/inverseOf    :doap/repositoryOf,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #{{:rdf/language "en",
                        :rdf/value    "Source code repository."}
                       {:rdf/language "cs",
                        :rdf/value    "Úložiště zdrojových kódů."}
                       {:rdf/language "pt",
                        :rdf/value    "Repositório do código fonte."}
                       {:rdf/language "es",
                        :rdf/value    "Repositorio del código fuente."}
                       {:rdf/language "fr",
                        :rdf/value    "Dépôt du code source."}
                       {:rdf/language "de",
                        :rdf/value    "Quellcode-Versionierungssystem."}},
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "de",
                        :rdf/value    "Repository"}
                       {:rdf/language "cs",
                        :rdf/value    "úložiště"}
                       {:rdf/language "fr",
                        :rdf/value    "dépôt"}
                       {:rdf/language "es",
                        :rdf/value    "repositorio"}
                       {:rdf/language "pt",
                        :rdf/value    "repositório"}
                       {:rdf/language "en",
                        :rdf/value    "repository"}},
   :rdfs/range       :doap/Repository})

(def repositoryOf
  {:db/ident         :doap/repositoryOf,
   :owl/inverseOf    :doap/repository,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The project that uses a repository."},
   :rdfs/domain      :doap/Repository,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "repository of"},
   :rdfs/range       :doap/Project})

(def revision
  {:db/ident :doap/revision,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "es",
      :rdf/value    "Indentificador de la versión de un release de software."}
     {:rdf/language "fr",
      :rdf/value    "Identifiant de révision d'une release du programme."}
     {:rdf/language "cs",
      :rdf/value    "Identifikátor zpřístupněné revize softwaru."}
     {:rdf/language "en",
      :rdf/value    "Revision identifier of a software release."}
     {:rdf/language "de",
      :rdf/value    "Versionsidentifikator eines Software-Releases."}
     {:rdf/language "pt",
      :rdf/value    "Identificador do lançamento da revisão do software."}},
   :rdfs/domain :doap/Version,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label #{{:rdf/language "de",
                  :rdf/value    "Version"}
                 {:rdf/language "cs",
                  :rdf/value    "verze"}
                 {:rdf/language "fr",
                  :rdf/value    "révision"}
                 {:rdf/language "pt",
                  :rdf/value    "revisão"}
                 {:rdf/language "en",
                  :rdf/value    "revision"}
                 {:rdf/language "es",
                  :rdf/value    "versión"}},
   :rdfs/range :rdfs/Literal})

(def screenshots
  {:db/ident         :doap/screenshots,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #{{:rdf/language "fr",
                        :rdf/value
                        "Page web avec des captures d'écran du projet."}
                       {:rdf/language "en",
                        :rdf/value    "Web page with screenshots of project."}
                       {:rdf/language "pt",
                        :rdf/value
                        "Página web com as capturas de ecrãn do projeto."}
                       {:rdf/language "es",
                        :rdf/value
                        "Página web con capturas de pantalla del proyecto."}
                       {:rdf/language "cs",
                        :rdf/value
                        "Webová stránka projektu se snímky obrazovky."}
                       {:rdf/language "de",
                        :rdf/value
                        "Web-Seite mit Screenshots eines Projektes."}},
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "de",
                        :rdf/value    "Screenshots"}
                       {:rdf/language "fr",
                        :rdf/value    "captures d'écran"}
                       {:rdf/language "en",
                        :rdf/value    "screenshots"}
                       {:rdf/language "es",
                        :rdf/value    "capturas de pantalla"}
                       {:rdf/language "cs",
                        :rdf/value    "snímek obrazovky"}
                       {:rdf/language "pt",
                        :rdf/value    "capturas de ecrãs"}}})

(def security-contact
  {:db/ident :doap/security-contact,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The Agent that should be contacted\n\tif security issues are found with the project."},
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "security contact"},
   :rdfs/range :foaf/Agent})

(def security-policy
  {:db/ident           :doap/security-policy,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value "URL of the security policy of a project."},
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "security policy"},
   :rdfs/subPropertyOf :foaf/page})

(def service-endpoint
  {:db/ident :doap/service-endpoint,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The URI of a web service endpoint where software as a service may be accessed"},
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "service endpoint"},
   :rdfs/range :rdfs/Resource})

(def shortdesc
  {:db/ident :doap/shortdesc,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "es",
      :rdf/value
      "Descripción corta (8 o 9 palabras) en texto plano de un proyecto."}
     {:rdf/language "cs",
      :rdf/value    "Krátký (8 nebo 9 slov) čistě textový popis projektu."}
     {:rdf/language "pt",
      :rdf/value
      "Descrição curta (com 8 ou 9 palavras) de um projeto em texto apenas."}
     {:rdf/language "de",
      :rdf/value
      "Kurzbeschreibung (8 oder 9 Wörter) eines Projekts als einfacher Text."}
     {:rdf/language "fr",
      :rdf/value    "Texte descriptif concis (8 ou 9 mots) d'un projet."}
     {:rdf/language "en",
      :rdf/value "Short (8 or 9 words) plain text description of a project."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label #{{:rdf/language "pt",
                  :rdf/value    "descrição curta"}
                 {:rdf/language "cs",
                  :rdf/value    "krátký popis"}
                 {:rdf/language "en",
                  :rdf/value    "short description"}
                 {:rdf/language "de",
                  :rdf/value    "Kurzbeschreibung"}
                 {:rdf/language "es",
                  :rdf/value    "descripción corta"}
                 {:rdf/language "fr",
                  :rdf/value    "description courte"}},
   :rdfs/range :rdfs/Literal})

(def support-forum
  {:db/ident         :doap/support-forum,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A forum or community that supports this project."},
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "supporting forum"},
   :rdfs/range       :sioc/Container})

(def tester
  {:db/ident :doap/tester,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "cs",
      :rdf/value    "Tester nebo jiný spoluautor kontrolující kvalitu."}
     {:rdf/language "pt",
      :rdf/value
      "Um controlador ou outro contribuidor para o controlo de qualidade."}
     {:rdf/language "en",
      :rdf/value    "A tester or other quality control contributor."}
     {:rdf/language "de",
      :rdf/value "Ein Tester oder anderer Mitarbeiter der Qualitätskontrolle."}
     {:rdf/language "fr",
      :rdf/value    "Un testeur ou un collaborateur au contrôle qualité."}
     {:rdf/language "es",
      :rdf/value    "Un tester u otro proveedor de control de calidad."}},
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label #{{:rdf/language "pt",
                  :rdf/value    "controlador"}
                 {:rdf/language "cs",
                  :rdf/value    "tester"}
                 {:rdf/language "es",
                  :rdf/value    "tester"}
                 {:rdf/language "en",
                  :rdf/value    "tester"}
                 {:rdf/language "de",
                  :rdf/value    "Tester"}
                 {:rdf/language "fr",
                  :rdf/value    "testeur"}},
   :rdfs/range :foaf/Person})

(def translator
  {:db/ident         :doap/translator,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #{{:rdf/language "de",
                        :rdf/value
                        "Mitarbeiter an den Übersetzungen des Projektes."}
                       {:rdf/language "cs",
                        :rdf/value    "Spoluautor překladu projektu."}
                       {:rdf/language "fr",
                        :rdf/value "Collaborateur à la traduction du projet."}
                       {:rdf/language "en",
                        :rdf/value
                        "Contributor of translations to the project."}
                       {:rdf/language "es",
                        :rdf/value    "Proveedor de traducciones al proyecto."}
                       {:rdf/language "pt",
                        :rdf/value
                        "Contribuidor das traduções para o projeto."}},
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #{{:rdf/language "en",
                        :rdf/value    "translator"}
                       {:rdf/language "pt",
                        :rdf/value    "tradutor"}
                       {:rdf/language "es",
                        :rdf/value    "traductor"}
                       {:rdf/language "fr",
                        :rdf/value    "traducteur"}
                       {:rdf/language "cs",
                        :rdf/value    "překladatel"}
                       {:rdf/language "de",
                        :rdf/value    "Übersetzer"}},
   :rdfs/range       :foaf/Person})

(def vendor
  {:db/ident         :doap/vendor,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Vendor organization: commercial, free or otherwise"},
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "vendor"},
   :rdfs/range       :foaf/Organization})

(def wiki
  {:db/ident :doap/wiki,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value    "URL of Wiki for collaborative discussion of project."}
     {:rdf/language "de",
      :rdf/value    "Wiki-URL für die kollaborative Dikussion eines Projektes."}
     {:rdf/language "pt",
      :rdf/value    "URL da Wiki para discussão em grupo do projeto."}
     {:rdf/language "fr",
      :rdf/value
      "L'URL du Wiki pour la discussion collaborative sur le projet."}
     {:rdf/language "cs",
      :rdf/value    "URL adresa wiki projektu pro společné diskuse."}
     {:rdf/language "es",
      :rdf/value    "URL del Wiki para discusión colaborativa del proyecto."}},
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:xsd/anyURI "http://usefulinc.com/ns/doap#"},
   :rdfs/label #{{:rdf/language "cs",
                  :rdf/value    "wiki"}
                 {:rdf/language "en",
                  :rdf/value    "wiki"}
                 {:rdf/language "es",
                  :rdf/value    "wiki"}
                 {:rdf/language "fr",
                  :rdf/value    "wiki"}
                 {:rdf/language "pt",
                  :rdf/value    "wiki"}
                 {:rdf/language "de",
                  :rdf/value    "Wiki"}},
   :rdfs/range :sioc.types/Wiki})