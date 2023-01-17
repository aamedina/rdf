(ns net.wikipunk.rdf.doap
  "The Description of a Project (DOAP) vocabulary, described using W3C RDF Schema and the Web Ontology Language."
  {:dcat/downloadURL
   "https://raw.githubusercontent.com/ewilderj/doap/master/schema/doap.rdf",
   :dcterms/creator "Edd Wilder-James",
   :dcterms/description
   [{:rdf/language "cs",
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
     "El vocabulario Description of a Project (DOAP, Descripción de un Proyecto), descrito usando RDF Schema de W3C\n\t\ty Web Ontology Language."}
    "The Description of a Project (DOAP) vocabulary, described using W3C RDF Schema and the Web Ontology Language."
    {:rdf/language "pt",
     :rdf/value
     "Vocabulário de descrição de um Projeto (DOAP - Description of a Project), descrito no esquema (schema) W3C RDF e na Web Ontology Language."}],
   :dcterms/format "application/rdf+xml",
   :dcterms/rights "Copyright © The DOAP Authors",
   :dcterms/title "Description of a Project (DOAP) vocabulary",
   :foaf/maker {:foaf/mbox "mailto:edd@usefulinc.com",
                :foaf/name "Edd Wilder-James",
                :rdf/type  :foaf/Person},
   :owl/imports :foaf/index.rdf,
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/elements/1.1/",
                       "doap" "http://usefulinc.com/ns/doap#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://usefulinc.com/ns/doap#",
   :rdfa/prefix "doap",
   :rdfa/uri "http://usefulinc.com/ns/doap#"}
  (:refer-clojure :exclude [name]))

(def ArchRepository
  "GNU Arch source code repository."
  {:db/ident         :doap/ArchRepository,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     [{:rdf/language "en",
                       :rdf/value    "GNU Arch source code repository."}
                      {:rdf/language "cs",
                       :rdf/value    "Úložiště zdrojových kódů GNU Arch."}
                      {:rdf/language "fr",
                       :rdf/value    "Dépôt GNU Arch du code source."}
                      {:rdf/language "es",
                       :rdf/value    "Repositorio GNU Arch del código fuente."}
                      {:rdf/language "pt",
                       :rdf/value    "Repositório GNU Arch do código fonte."}
                      {:rdf/language "de",
                       :rdf/value "GNU Arch Quellcode-Versionierungssystem."}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "fr",
                       :rdf/value    "Dépôt GNU Arch"}
                      {:rdf/language "pt",
                       :rdf/value    "Repositório GNU Arch"}
                      {:rdf/language "es",
                       :rdf/value    "Repositorio GNU Arch"}
                      {:rdf/language "cs",
                       :rdf/value    "Úložiště GNU Arch"}
                      {:rdf/language "de",
                       :rdf/value    "GNU Arch repository"}
                      {:rdf/language "en",
                       :rdf/value    "GNU Arch repository"}],
   :rdfs/subClassOf  :doap/Repository})

(def BKRepository
  "BitKeeper source code repository."
  {:db/ident         :doap/BKRepository,
   :rdf/type         [:rdfs/Class :owl/Class],
   :rdfs/comment     [{:rdf/language "fr",
                       :rdf/value    "Dépôt BitKeeper du code source."}
                      {:rdf/language "pt",
                       :rdf/value    "Repositório BitKeeper do código fonte."}
                      {:rdf/language "cs",
                       :rdf/value    "Úložiště zdrojových kódů BitKeeper."}
                      {:rdf/language "de",
                       :rdf/value "BitKeeper Quellcode-Versionierungssystem."}
                      {:rdf/language "es",
                       :rdf/value    "Repositorio BitKeeper del código fuente."}
                      {:rdf/language "en",
                       :rdf/value    "BitKeeper source code repository."}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "de",
                       :rdf/value    "BitKeeper Repository"}
                      {:rdf/language "en",
                       :rdf/value    "BitKeeper Repository"}
                      {:rdf/language "pt",
                       :rdf/value    "Repositório Bitkeeper"}
                      {:rdf/language "fr",
                       :rdf/value    "Dépôt BitKeeper"}
                      {:rdf/language "cs",
                       :rdf/value    "Úložiště BitKeeper"}
                      {:rdf/language "es",
                       :rdf/value    "Repositorio BitKeeper"}],
   :rdfs/subClassOf  :doap/Repository})

(def BazaarBranch
  "Bazaar source code branch."
  {:db/ident         :doap/BazaarBranch,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [{:rdf/language "pt",
                       :rdf/value    "Código fonte da ramificação Bazaar."}
                      {:rdf/language "en",
                       :rdf/value    "Bazaar source code branch."}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "pt",
                       :rdf/value    "Ramificação Bazaar"}
                      {:rdf/language "en",
                       :rdf/value    "Bazaar Branch"}],
   :rdfs/subClassOf  :doap/Repository})

(def CVSRepository
  "CVS source code repository."
  {:db/ident         :doap/CVSRepository,
   :rdf/type         [:rdfs/Class :owl/Class],
   :rdfs/comment     [{:rdf/language "fr",
                       :rdf/value    "Dépôt CVS du code source."}
                      {:rdf/language "cs",
                       :rdf/value    "Úložiště zdrojových kódů CVS."}
                      {:rdf/language "pt",
                       :rdf/value    "Repositório CVS do código fonte."}
                      {:rdf/language "de",
                       :rdf/value    "CVS Quellcode-Versionierungssystem."}
                      {:rdf/language "en",
                       :rdf/value    "CVS source code repository."}
                      {:rdf/language "es",
                       :rdf/value    "Repositorio CVS del código fuente."}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "de",
                       :rdf/value    "CVS Repository"}
                      {:rdf/language "en",
                       :rdf/value    "CVS Repository"}
                      {:rdf/language "cs",
                       :rdf/value    "Úložiště CVS"}
                      {:rdf/language "fr",
                       :rdf/value    "Dépôt CVS"}
                      {:rdf/language "pt",
                       :rdf/value    "Repositório CVS"}
                      {:rdf/language "es",
                       :rdf/value    "Repositorio CVS"}],
   :rdfs/subClassOf  :doap/Repository})

(def DarcsRepository
  "darcs source code repository."
  {:db/ident         :doap/DarcsRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [{:rdf/language "fr",
                       :rdf/value    "Dépôt darcs du code source."}
                      {:rdf/language "es",
                       :rdf/value    "Repositorio darcs del código fuente."}
                      {:rdf/language "pt",
                       :rdf/value    "Repositório darcs do código fonte."}
                      {:rdf/language "en",
                       :rdf/value    "darcs source code repository."}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "darcs Repository"}
                      {:rdf/language "fr",
                       :rdf/value    "Dépôt darcs"}
                      {:rdf/language "pt",
                       :rdf/value    "Repositório darcs"}
                      {:rdf/language "es",
                       :rdf/value    "Repositorio darcs"}],
   :rdfs/subClassOf  :doap/Repository})

(def GitBranch
  "Git source code branch."
  {:db/ident         :doap/GitBranch,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [{:rdf/language "pt",
                       :rdf/value    "Código fonte da ramificação Git."}
                      {:rdf/language "en",
                       :rdf/value    "Git source code branch."}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "pt",
                       :rdf/value    "Ramificação Git"}
                      {:rdf/language "en",
                       :rdf/value    "Git Branch"}],
   :rdfs/subClassOf  :doap/Repository})

(def GitRepository
  "Git source code repository."
  {:db/ident         :doap/GitRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [{:rdf/language "es",
                       :rdf/value    "Repositorio Git del código fuente."}
                      {:rdf/language "fr",
                       :rdf/value    "Dépôt Git du code source."}
                      {:rdf/language "cs",
                       :rdf/value    "Úložiště zdrojových kódů Git."}
                      {:rdf/language "pt",
                       :rdf/value    "Repositório Git do código fonte."}
                      {:rdf/language "en",
                       :rdf/value    "Git source code repository."}
                      {:rdf/language "de",
                       :rdf/value    "Git Quellcode-Versionierungssystem."}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "fr",
                       :rdf/value    "Dépôt Git"}
                      {:rdf/language "de",
                       :rdf/value    "Git Repository"}
                      {:rdf/language "en",
                       :rdf/value    "Git Repository"}
                      {:rdf/language "cs",
                       :rdf/value    "Úložiště Git"}
                      {:rdf/language "pt",
                       :rdf/value    "Repositório Git"}
                      {:rdf/language "es",
                       :rdf/value    "Repositorio Git"}],
   :rdfs/subClassOf  :doap/Repository})

(def HgRepository
  "Mercurial source code repository."
  {:db/ident         :doap/HgRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [{:rdf/language "pt",
                       :rdf/value    "Repositório Mercurial do código fonte."}
                      {:rdf/language "en",
                       :rdf/value    "Mercurial source code repository."}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "pt",
                       :rdf/value    "Repositório Mercurial"}
                      {:rdf/language "en",
                       :rdf/value    "Mercurial Repository"}],
   :rdfs/subClassOf  :doap/Repository})

(def Project
  "A project."
  {:db/ident         :doap/Project,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [{:rdf/language "pt",
                       :rdf/value    "Projeto."}
                      {:rdf/language "cs",
                       :rdf/value    "Projekt."}
                      {:rdf/language "es",
                       :rdf/value    "Un proyecto."}
                      {:rdf/language "de",
                       :rdf/value    "Ein Projekt."}
                      {:rdf/language "fr",
                       :rdf/value    "Un projet."}
                      {:rdf/language "en",
                       :rdf/value    "A project."}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "es",
                       :rdf/value    "Proyecto"}
                      {:rdf/language "pt",
                       :rdf/value    "Projeto"}
                      {:rdf/language "fr",
                       :rdf/value    "Projet"}
                      {:rdf/language "en",
                       :rdf/value    "Project"}
                      {:rdf/language "cs",
                       :rdf/value    "Projekt"}
                      {:rdf/language "de",
                       :rdf/value    "Projekt"}],
   :rdfs/subClassOf  [:foaf/Project]})

(def Repository
  "Source code repository."
  {:db/ident         :doap/Repository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [{:rdf/language "pt",
                       :rdf/value    "Repositório do código fonte."}
                      {:rdf/language "en",
                       :rdf/value    "Source code repository."}
                      {:rdf/language "fr",
                       :rdf/value    "Dépôt du code source."}
                      {:rdf/language "de",
                       :rdf/value    "Quellcode-Versionierungssystem."}
                      {:rdf/language "cs",
                       :rdf/value    "Úložiště zdrojových kódů."}
                      {:rdf/language "es",
                       :rdf/value    "Repositorio del código fuente."}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "cs",
                       :rdf/value    "Úložiště"}
                      {:rdf/language "de",
                       :rdf/value    "Repository"}
                      {:rdf/language "en",
                       :rdf/value    "Repository"}
                      {:rdf/language "pt",
                       :rdf/value    "Repositório"}
                      {:rdf/language "fr",
                       :rdf/value    "Dépôt"}
                      {:rdf/language "es",
                       :rdf/value    "Repositorio"}]})

(def SVNRepository
  "Subversion source code repository."
  {:db/ident         :doap/SVNRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [{:rdf/language "en",
                       :rdf/value    "Subversion source code repository."}
                      {:rdf/language "cs",
                       :rdf/value    "Úložiště zdrojových kódů Subversion."}
                      {:rdf/language "fr",
                       :rdf/value    "Dépôt Subversion du code source."}
                      {:rdf/language "pt",
                       :rdf/value    "Repositório Subversion do código fonte."}
                      {:rdf/language "de",
                       :rdf/value "Subversion Quellcode-Versionierungssystem."}
                      {:rdf/language "es",
                       :rdf/value "Repositorio Subversion del código fuente."}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "fr",
                       :rdf/value    "Dépôt Subversion"}
                      {:rdf/language "de",
                       :rdf/value    "Subversion Repository"}
                      {:rdf/language "en",
                       :rdf/value    "Subversion Repository"}
                      {:rdf/language "cs",
                       :rdf/value    "Úložiště Subversion"}
                      {:rdf/language "es",
                       :rdf/value    "Repositorio Subversion"}
                      {:rdf/language "pt",
                       :rdf/value    "Repositório Subversion"}],
   :rdfs/subClassOf  :doap/Repository})

(def Specification
  "A specification of a system's aspects, technical or otherwise."
  {:db/ident :doap/Specification,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   [{:rdf/language "pt",
     :rdf/value    "A especificação de aspetos, técnicas ou outros do sistema."}
    {:rdf/language "en",
     :rdf/value
     "A specification of a system's aspects, technical or otherwise."}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "pt",
                 :rdf/value    "Especificação"}
                {:rdf/language "en",
                 :rdf/value    "Specification"}],
   :rdfs/subClassOf :rdfs/Resource})

(def Version
  "Version information of a project release."
  {:db/ident :doap/Version,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value    "Información sobre la versión de un release del proyecto."}
    {:rdf/language "cs",
     :rdf/value    "Informace o uvolněné verzi projektu."}
    {:rdf/language "en",
     :rdf/value    "Version information of a project release."}
    {:rdf/language "de",
     :rdf/value    "Versionsinformation eines Projekt Releases."}
    {:rdf/language "pt",
     :rdf/value    "Informação sobre a versão do projeto lançado."}
    {:rdf/language "fr",
     :rdf/value    "Détails sur une version d'une release d'un projet."}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "pt",
                 :rdf/value    "Versão"}
                {:rdf/language "de",
                 :rdf/value    "Version"}
                {:rdf/language "fr",
                 :rdf/value    "Version"}
                {:rdf/language "en",
                 :rdf/value    "Version"}
                {:rdf/language "cs",
                 :rdf/value    "Verze"}
                {:rdf/language "es",
                 :rdf/value    "Versión"}]})

(def anon-root
  "Repository for anonymous access."
  {:db/ident         :doap/anon-root,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [{:rdf/language "de",
                       :rdf/value    "Repository für anonymen Zugriff"}
                      {:rdf/language "es",
                       :rdf/value    "Repositorio para acceso anónimo."}
                      {:rdf/language "cs",
                       :rdf/value    "Úložiště pro anonymní přístup."}
                      {:rdf/language "fr",
                       :rdf/value    "Dépôt pour accès anonyme."}
                      {:rdf/language "pt",
                       :rdf/value    "Repositório para acesso anónimo."}
                      {:rdf/language "en",
                       :rdf/value    "Repository for anonymous access."}],
   :rdfs/domain      :doap/Repository,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "pt",
                       :rdf/value    "raíz anónima"}
                      {:rdf/language "es",
                       :rdf/value    "raíz anónima"}
                      {:rdf/language "cs",
                       :rdf/value    "anonymní kořen"}
                      {:rdf/language "en",
                       :rdf/value    "anonymous root"}
                      {:rdf/language "fr",
                       :rdf/value    "racine anonyme"}
                      {:rdf/language "de",
                       :rdf/value    "Anonymes Root"}],
   :rdfs/range       :rdfs/Literal})

(def audience
  "Description of target user base"
  {:db/ident         :doap/audience,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [{:rdf/language "pt",
                       :rdf/value    "Descrição do utilizador base alvo"}
                      {:rdf/language "en",
                       :rdf/value    "Description of target user base"}],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "pt",
                       :rdf/value    "audiência"}
                      {:rdf/language "en",
                       :rdf/value    "audience"}],
   :rdfs/range       :rdfs/Literal})

(def blog
  "URI of a blog related to a project"
  {:db/ident         :doap/blog,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [{:rdf/language "pt",
                       :rdf/value "URI de um blog relacionado com um projeto"}
                      {:rdf/language "en",
                       :rdf/value    "URI of a blog related to a project"}],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "pt",
                       :rdf/value    "blog"}
                      {:rdf/language "en",
                       :rdf/value    "blog"}],
   :rdfs/range       [:sioc.types/Weblog :rdfs/Resource]})

(def browse
  "Web browser interface to repository."
  {:db/ident         :doap/browse,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [{:rdf/language "pt",
                       :rdf/value    "Interface web do repositório."}
                      {:rdf/language "cs",
                       :rdf/value    "Webové rozhraní pro prohlížení úložiště."}
                      {:rdf/language "en",
                       :rdf/value    "Web browser interface to repository."}
                      {:rdf/language "fr",
                       :rdf/value    "Interface web au dépôt."}
                      {:rdf/language "es",
                       :rdf/value    "Interface web del repositorio."}
                      {:rdf/language "de",
                       :rdf/value "Web-Browser Interface für das Repository."}],
   :rdfs/domain      :doap/Repository,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "browse"}
                      {:rdf/language "pt",
                       :rdf/value    "navegar"}
                      {:rdf/language "es",
                       :rdf/value    "navegar"}
                      {:rdf/language "fr",
                       :rdf/value    "visualiser"}
                      {:rdf/language "cs",
                       :rdf/value    "prohlížeč"}
                      {:rdf/language "de",
                       :rdf/value    "browse"}]})

(def bug-database
  "Bug tracker for a project."
  {:db/ident         :doap/bug-database,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [{:rdf/language "pt",
                       :rdf/value    "Bug tracker para um projeto."}
                      {:rdf/language "fr",
                       :rdf/value    "Suivi des bugs pour un projet."}
                      {:rdf/language "en",
                       :rdf/value    "Bug tracker for a project."}
                      {:rdf/language "de",
                       :rdf/value    "Fehlerdatenbank eines Projektes."}
                      {:rdf/language "es",
                       :rdf/value    "Bug tracker para un proyecto."}
                      {:rdf/language "cs",
                       :rdf/value    "Správa chyb projektu."}],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "cs",
                       :rdf/value    "databáze chyb"}
                      {:rdf/language "fr",
                       :rdf/value    "suivi des bugs"}
                      {:rdf/language "de",
                       :rdf/value    "Fehlerdatenbank"}
                      {:rdf/language "en",
                       :rdf/value    "bug database"}
                      {:rdf/language "es",
                       :rdf/value    "base de datos de bugs"}
                      {:rdf/language "pt",
                       :rdf/value    "base de dados de bugs"}]})

(def category
  "A category of project."
  {:db/ident         :doap/category,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [{:rdf/language "cs",
                       :rdf/value    "Kategorie projektu."}
                      {:rdf/language "de",
                       :rdf/value    "Eine Kategorie eines Projektes."}
                      {:rdf/language "en",
                       :rdf/value    "A category of project."}
                      {:rdf/language "es",
                       :rdf/value    "Una categoría de proyecto."}
                      {:rdf/language "pt",
                       :rdf/value    "Uma categoría de projeto."}
                      {:rdf/language "fr",
                       :rdf/value    "Une catégorie de projet."}],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "category"}
                      {:rdf/language "es",
                       :rdf/value    "categoría"}
                      {:rdf/language "cs",
                       :rdf/value    "kategorie"}
                      {:rdf/language "de",
                       :rdf/value    "Kategorie"}
                      {:rdf/language "fr",
                       :rdf/value    "catégorie"}
                      {:rdf/language "pt",
                       :rdf/value    "categoria"}]})

(def created
  "Date when something was created, in YYYY-MM-DD form. e.g. 2004-04-05"
  {:db/ident :doap/created,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [{:rdf/language "de",
     :rdf/value
     "Erstellungsdatum von Irgendwas, angegeben im YYYY-MM-DD Format, z.B. 2004-04-05."}
    {:rdf/language "cs",
     :rdf/value
     "Datum, kdy bylo něco vytvořeno ve formátu RRRR-MM-DD, např. 2004-04-05"}
    {:rdf/language "es",
     :rdf/value
     "Fecha en la que algo fue creado, en formato AAAA-MM-DD. e.g. 2004-04-05"}
    {:rdf/language "en",
     :rdf/value
     "Date when something was created, in YYYY-MM-DD form. e.g. 2004-04-05"}
    {:rdf/language "fr",
     :rdf/value
     "Date à laquelle a été créé quelque chose, au format AAAA-MM-JJ (par ex. 2004-04-05)"}
    {:rdf/language "pt",
     :rdf/value
     "Data em que algo foi criado, no formato AAAA-MM-DD. e.g. 2004-04-05"}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "created"}
                {:rdf/language "de",
                 :rdf/value    "erstellt"}
                {:rdf/language "cs",
                 :rdf/value    "vytvořeno"}
                {:rdf/language "pt",
                 :rdf/value    "criado"}
                {:rdf/language "es",
                 :rdf/value    "creado"}
                {:rdf/language "fr",
                 :rdf/value    "créé"}],
   :rdfs/range :rdfs/Literal})

(def description
  "Plain text description of a project, of 2-4 sentences in length."
  {:db/ident :doap/description,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [{:rdf/language "cs",
     :rdf/value    "Čistě textový, 2 až 4 věty dlouhý popis projektu."}
    {:rdf/language "fr",
     :rdf/value    "Texte descriptif d'un projet, long de 2 à 4 phrases."}
    {:rdf/language "pt",
     :rdf/value
     "Descrição de um projeto em texto apenas, com 2 a 4 frases de comprimento."}
    {:rdf/language "es",
     :rdf/value
     "Descripción en texto plano de un proyecto, de 2 a 4 enunciados de longitud."}
    {:rdf/language "de",
     :rdf/value
     "Beschreibung eines Projekts als einfacher Text mit der Länge von 2 bis 4 Sätzen."}
    {:rdf/language "en",
     :rdf/value
     "Plain text description of a project, of 2-4 sentences in length."}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "descripción"}
                {:rdf/language "cs",
                 :rdf/value    "popis"}
                {:rdf/language "en",
                 :rdf/value    "description"}
                {:rdf/language "fr",
                 :rdf/value    "description"}
                {:rdf/language "pt",
                 :rdf/value    "descrição"}
                {:rdf/language "de",
                 :rdf/value    "Beschreibung"}],
   :rdfs/range :rdfs/Literal})

(def developer
  "Developer of software for the project."
  {:db/ident         :doap/developer,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [{:rdf/language "cs",
                       :rdf/value    "Vývojář softwaru projektu."}
                      {:rdf/language "pt",
                       :rdf/value    "Programador de software para o projeto."}
                      {:rdf/language "es",
                       :rdf/value "Desarrollador de software para el proyecto."}
                      {:rdf/language "fr",
                       :rdf/value    "Développeur pour le projet."}
                      {:rdf/language "en",
                       :rdf/value    "Developer of software for the project."}
                      {:rdf/language "de",
                       :rdf/value    "Software-Entwickler für das Projekt."}],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "de",
                       :rdf/value    "Entwickler"}
                      {:rdf/language "cs",
                       :rdf/value    "vývojář"}
                      {:rdf/language "fr",
                       :rdf/value    "développeur"}
                      {:rdf/language "es",
                       :rdf/value    "desarrollador"}
                      {:rdf/language "pt",
                       :rdf/value    "programador"}
                      {:rdf/language "en",
                       :rdf/value    "developer"}],
   :rdfs/range       :foaf/Person})

(def developer-forum
  "A forum or community for developers of this project."
  {:db/ident         :doap/developer-forum,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A forum or community for developers of this project."},
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "developer forum"},
   :rdfs/range       :sioc/Container})

(def documentation
  "Documentation of the project."
  {:db/ident         :doap/documentation,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [{:rdf/language "fr",
                       :rdf/value    "Aide pour l’utilisation de ce projet."}
                      {:rdf/language "en",
                       :rdf/value    "Documentation of the project."}],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "fr",
                       :rdf/value    "aide"}
                      {:rdf/language "en",
                       :rdf/value    "documentation"}]})

(def documenter
  "Contributor of documentation to the project."
  {:db/ident         :doap/documenter,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [{:rdf/language "pt",
                       :rdf/value
                       "Contribuidor para a documentação do projeto."}
                      {:rdf/language "es",
                       :rdf/value
                       "Proveedor de documentación para el proyecto."}
                      {:rdf/language "fr",
                       :rdf/value "Collaborateur à la documentation du projet."}
                      {:rdf/language "cs",
                       :rdf/value    "Spoluautor dokumentace projektu."}
                      {:rdf/language "de",
                       :rdf/value
                       "Mitarbeiter an der Dokumentation des Projektes."}
                      {:rdf/language "en",
                       :rdf/value
                       "Contributor of documentation to the project."}],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "documenter"}
                      {:rdf/language "cs",
                       :rdf/value    "dokumentarista"}
                      {:rdf/language "de",
                       :rdf/value    "Dokumentator"}
                      {:rdf/language "es",
                       :rdf/value    "escritor de ayuda"}
                      {:rdf/language "fr",
                       :rdf/value    "rédacteur de l'aide"}
                      {:rdf/language "pt",
                       :rdf/value    "documentador"}],
   :rdfs/range       :foaf/Person})

(def download-mirror
  "Mirror of software download web page."
  {:db/ident :doap/download-mirror,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value    "Mirror of software download web page."}
    {:rdf/language "de",
     :rdf/value
     "Spiegel der Seite von die Projekt-Software heruntergeladen werden kann."}
    {:rdf/language "cs",
     :rdf/value    "Zrcadlo stránky pro stažení softwaru."}
    {:rdf/language "es",
     :rdf/value    "Mirror de la página web de descarga."}
    {:rdf/language "fr",
     :rdf/value    "Miroir de la page de téléchargement du programme."}
    {:rdf/language "pt",
     :rdf/value    "Mirror da página web para fazer download."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "cs",
                 :rdf/value    "zrcadlo stránky pro stažení"}
                {:rdf/language "fr",
                 :rdf/value    "miroir pour le téléchargement"}
                {:rdf/language "en",
                 :rdf/value    "download mirror"}
                {:rdf/language "pt",
                 :rdf/value    "mirror para download"}
                {:rdf/language "de",
                 :rdf/value    "Spiegel der Seite zum Herunterladen"}
                {:rdf/language "es",
                 :rdf/value    "mirror de descarga"}]})

(def download-page
  "Web page from which the project software can be downloaded."
  {:db/ident :doap/download-page,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [{:rdf/language "de",
     :rdf/value
     "Web-Seite von der die Projekt-Software heruntergeladen werden kann."}
    {:rdf/language "cs",
     :rdf/value    "Webová stránka, na které lze stáhnout projektový software."}
    {:rdf/language "en",
     :rdf/value "Web page from which the project software can be downloaded."}
    {:rdf/language "fr",
     :rdf/value
     "Page web à partir de laquelle on peut télécharger le programme."}
    {:rdf/language "pt",
     :rdf/value
     "Página web da qual o projeto de software pode ser descarregado."}
    {:rdf/language "es",
     :rdf/value    "Página web de la cuál se puede bajar el software."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "cs",
                 :rdf/value    "stránka pro stažení"}
                {:rdf/language "pt",
                 :rdf/value    "página para download"}
                {:rdf/language "fr",
                 :rdf/value    "page de téléchargement"}
                {:rdf/language "de",
                 :rdf/value    "Seite zum Herunterladen"}
                {:rdf/language "en",
                 :rdf/value    "download page"}
                {:rdf/language "es",
                 :rdf/value    "página de descarga"}]})

(def file-release
  "URI of download associated with this release."
  {:db/ident         :doap/file-release,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [{:rdf/language "pt",
                       :rdf/value
                       "URI para download associado com a publicação."}
                      {:rdf/language "cs",
                       :rdf/value    "URI adresa stažení asociované s revizí."}
                      {:rdf/language "en",
                       :rdf/value
                       "URI of download associated with this release."}],
   :rdfs/domain      :doap/Version,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "pt",
                       :rdf/value    "publicação do ficheiro"}
                      {:rdf/language "cs",
                       :rdf/value    "soubor revize"}
                      {:rdf/language "en",
                       :rdf/value    "file-release"}]})

(def helper
  "Project contributor."
  {:db/ident         :doap/helper,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [{:rdf/language "pt",
                       :rdf/value    "Ajudante ou colaborador do projeto."}
                      {:rdf/language "cs",
                       :rdf/value    "Spoluautor projektu."}
                      {:rdf/language "de",
                       :rdf/value    "Projekt-Mitarbeiter."}
                      {:rdf/language "fr",
                       :rdf/value    "Collaborateur au projet."}
                      {:rdf/language "en",
                       :rdf/value    "Project contributor."}
                      {:rdf/language "es",
                       :rdf/value    "Colaborador del proyecto."}],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "helper"}
                      {:rdf/language "fr",
                       :rdf/value    "collaborateur"}
                      {:rdf/language "pt",
                       :rdf/value    "colaborador"}
                      {:rdf/language "es",
                       :rdf/value    "colaborador"}
                      {:rdf/language "de",
                       :rdf/value    "Helfer"}
                      {:rdf/language "cs",
                       :rdf/value    "spoluautor"}],
   :rdfs/range       :foaf/Person})

(def homepage
  "URL of a project's homepage, associated with exactly one project."
  {:db/ident :doap/homepage,
   :rdf/type [:owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/comment
   [{:rdf/language "pt",
     :rdf/value
     "O URL da página de um projeto,\n\t\tasociada com exactamente um projeto."}
    {:rdf/language "es",
     :rdf/value
     "El URL de la página de un proyecto,\n\t\tasociada con exactamente un proyecto."}
    {:rdf/language "en",
     :rdf/value
     "URL of a project's homepage,\n\t\tassociated with exactly one project."}
    {:rdf/language "de",
     :rdf/value
     "URL der Projekt-Homepage,\n\t\tverbunden mit genau einem Projekt."}
    {:rdf/language "fr",
     :rdf/value
     "L'URL de la page web d'un projet,\n\t\tassociée avec un unique projet."}
    {:rdf/language "cs",
     :rdf/value
     "URL adresa domovské stránky projektu asociované s právě jedním projektem."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "page web"}
                {:rdf/language "de",
                 :rdf/value    "Homepage"}
                {:rdf/language "pt",
                 :rdf/value    "página web"}
                {:rdf/language "es",
                 :rdf/value    "página web"}
                {:rdf/language "en",
                 :rdf/value    "homepage"}
                {:rdf/language "cs",
                 :rdf/value    "domovská stránka"}],
   :rdfs/subPropertyOf :foaf/homepage})

(def implements
  "A specification that a project implements. Could be a standard, API or legally defined level of conformance."
  {:db/ident :doap/implements,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [{:rdf/language "pt",
     :rdf/value
     "Uma especificação que um projeto implementa. Pode ser uma padrão, API ou um nível de conformidade definida legalmente."}
    {:rdf/language "en",
     :rdf/value
     "A specification that a project implements. Could be a standard, API or legally defined level of conformance."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "pt",
                 :rdf/value    "Especificações para implementação"}
                {:rdf/language "en",
                 :rdf/value    "Implements specification"}],
   :rdfs/range :doap/Specification})

(def language
  "BCP47 language code a project has been translated into"
  {:db/ident :doap/language,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [{:rdf/language "pt",
     :rdf/value "Código de idioma BCP47 do projeto para o qual foi traduzido"}
    {:rdf/language "en",
     :rdf/value    "BCP47 language code a project has been translated into"}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "pt",
                 :rdf/value    "idioma"}
                {:rdf/language "en",
                 :rdf/value    "language"}],
   :rdfs/range :rdfs/Literal})

(def license
  "The URI of an RDF description of the license the software is distributed under. E.g. a SPDX reference"
  {:db/ident :doap/license,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [{:rdf/language "fr",
     :rdf/value
     "L'URI d'une description RDF de la licence sous laquelle le programme est distribué."}
    {:rdf/language "es",
     :rdf/value
     "El URI de una descripción RDF de la licencia bajo la cuál se distribuye el software."}
    {:rdf/language "pt",
     :rdf/value
     "O URI de uma descrição RDF da licença do software sob a qual é distribuída. Ex.: referência SPDX"}
    {:rdf/language "cs",
     :rdf/value
     "URI adresa RDF popisu licence, pod kterou je software distribuován."}
    {:rdf/language "de",
     :rdf/value
     "Die URI einer RDF-Beschreibung einer Lizenz unter der die Software herausgegeben wird. z.B. eine SPDX Referenz"}
    {:rdf/language "en",
     :rdf/value
     "The URI of an RDF description of the license the software is distributed under. E.g. a SPDX reference"}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "Lizenz"}
                {:rdf/language "cs",
                 :rdf/value    "licence"}
                {:rdf/language "fr",
                 :rdf/value    "licence"}
                {:rdf/language "en",
                 :rdf/value    "license"}
                {:rdf/language "es",
                 :rdf/value    "licencia"}
                {:rdf/language "pt",
                 :rdf/value    "licença"}]})

(def location
  "Location of a repository."
  {:db/ident         :doap/location,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [{:rdf/language "de",
                       :rdf/value    "Lokation eines Repositorys."}
                      {:rdf/language "en",
                       :rdf/value    "Location of a repository."}
                      {:rdf/language "es",
                       :rdf/value    "lugar de un repositorio."}
                      {:rdf/language "pt",
                       :rdf/value    "Localização de um repositório."}
                      {:rdf/language "fr",
                       :rdf/value    "Emplacement d'un dépôt."}
                      {:rdf/language "cs",
                       :rdf/value    "Umístění úložiště."}],
   :rdfs/domain      :doap/Repository,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "repository location"}
                      {:rdf/language "cs",
                       :rdf/value    "umístění úložiště"}
                      {:rdf/language "pt",
                       :rdf/value    "localização do respositório"}
                      {:rdf/language "es",
                       :rdf/value    "lugar del respositorio"}
                      {:rdf/language "fr",
                       :rdf/value    "emplacement du dépôt"}
                      {:rdf/language "de",
                       :rdf/value    "Repository Lokation"}]})

(def mailing-list
  "Mailing list home page or email address."
  {:db/ident :doap/mailing-list,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [{:rdf/language "cs",
     :rdf/value    "Domovská stránka nebo e–mailová adresa e–mailové diskuse."}
    {:rdf/language "de",
     :rdf/value    "Homepage der Mailing Liste oder E-Mail Adresse."}
    {:rdf/language "fr",
     :rdf/value    "Page web de la liste de diffusion, ou adresse de courriel."}
    {:rdf/language "pt",
     :rdf/value
     "Página web da lista de distribuição de e-mail ou dos endereços."}
    {:rdf/language "en",
     :rdf/value    "Mailing list home page or email address."}
    {:rdf/language "es",
     :rdf/value    "Página web de la lista de correo o dirección de correo."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "lista de correo"}
                {:rdf/language "pt",
                 :rdf/value    "lista de distribuição de e-mail"}
                {:rdf/language "en",
                 :rdf/value    "mailing list"}
                {:rdf/language "fr",
                 :rdf/value    "liste de diffusion"}
                {:rdf/language "de",
                 :rdf/value    "Mailing Liste"}
                {:rdf/language "cs",
                 :rdf/value    "e–mailová diskuse"}],
   :rdfs/range :sioc.types/MailingList})

(def maintainer
  "Maintainer of a project, a project leader."
  {:db/ident :doap/maintainer,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [{:rdf/language "cs",
     :rdf/value    "Správce projektu, vedoucí projektu."}
    {:rdf/language "fr",
     :rdf/value    "Développeur principal d'un projet, un meneur du projet."}
    {:rdf/language "de",
     :rdf/value    "Hauptentwickler eines Projektes, der Projektleiter"}
    {:rdf/language "es",
     :rdf/value "Desarrollador principal de un proyecto, un líder de proyecto."}
    {:rdf/language "pt",
     :rdf/value    "Programador principal de um projeto, um líder de projeto."}
    {:rdf/language "en",
     :rdf/value    "Maintainer of a project, a project leader."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "Projektverantwortlicher"}
                {:rdf/language "fr",
                 :rdf/value    "développeur principal"}
                {:rdf/language "cs",
                 :rdf/value    "správce"}
                {:rdf/language "en",
                 :rdf/value    "maintainer"}
                {:rdf/language "es",
                 :rdf/value    "desarrollador principal"}
                {:rdf/language "pt",
                 :rdf/value    "programador principal"}],
   :rdfs/range :foaf/Person})

(def module
  "Module name of a Subversion, CVS, BitKeeper or Arch repository."
  {:db/ident :doap/module,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [{:rdf/language "fr",
     :rdf/value "Nom du module d'un dépôt Subversion, CVS, BitKeeper ou Arch."}
    {:rdf/language "de",
     :rdf/value
     "Modul-Name eines Subversion, CVS, BitKeeper oder Arch Repositorys."}
    {:rdf/language "cs",
     :rdf/value    "Jméno modulu v CVS, BitKeeper nebo Arch úložišti."}
    {:rdf/language "en",
     :rdf/value
     "Module name of a Subversion, CVS, BitKeeper or Arch repository."}
    {:rdf/language "es",
     :rdf/value
     "Nombre del módulo de un repositorio Subversion, CVS, BitKeeper o Arch."}
    {:rdf/language "pt",
     :rdf/value
     "Nome do módulo de um repositório Subversion, CVS, BitKeeper ou Arch."}],
   :rdfs/domain
   {:owl/unionOf [:doap/CVSRepository :doap/ArchRepository :doap/BKRepository],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "module"}
                {:rdf/language "en",
                 :rdf/value    "module"}
                {:rdf/language "cs",
                 :rdf/value    "modul"}
                {:rdf/language "de",
                 :rdf/value    "Modul"}
                {:rdf/language "pt",
                 :rdf/value    "módulo"}
                {:rdf/language "es",
                 :rdf/value    "módulo"}]})

(def name
  "A name of something."
  {:db/ident           :doap/name,
   :rdf/type           :rdf/Property,
   :rdfs/comment       [{:rdf/language "pt",
                         :rdf/value    "O nome de alguma coisa."}
                        {:rdf/language "en",
                         :rdf/value    "A name of something."}
                        {:rdf/language "de",
                         :rdf/value    "Der Name von Irgendwas"}
                        {:rdf/language "es",
                         :rdf/value    "El nombre de algo."}
                        {:rdf/language "cs",
                         :rdf/value    "Jméno něčeho."}
                        {:rdf/language "fr",
                         :rdf/value    "Le nom de quelque chose."}],
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         [{:rdf/language "es",
                         :rdf/value    "nombre"}
                        {:rdf/language "fr",
                         :rdf/value    "nom"}
                        {:rdf/language "pt",
                         :rdf/value    "nome"}
                        {:rdf/language "de",
                         :rdf/value    "Name"}
                        {:rdf/language "en",
                         :rdf/value    "name"}
                        {:rdf/language "cs",
                         :rdf/value    "jméno"}],
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :rdfs/label})

(def old-homepage
  "URL of a project's past homepage, associated with exactly one project."
  {:db/ident :doap/old-homepage,
   :rdf/type [:owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/comment
   [{:rdf/language "cs",
     :rdf/value
     "URL adresa předešlé domovské stránky projektu asociované s právě jedním projektem."}
    {:rdf/language "en",
     :rdf/value
     "URL of a project's past homepage,\n\t\tassociated with exactly one project."}
    {:rdf/language "fr",
     :rdf/value
     "L'URL d'une ancienne page web d'un\n\t\tprojet, associée avec un unique projet."}
    {:rdf/language "pt",
     :rdf/value
     "O URL antigo da página de um projeto,\n\t\tassociada com exactamente um projeto."}
    {:rdf/language "de",
     :rdf/value
     "URL der letzten Projekt-Homepage,\n\t\tverbunden mit genau einem Projekt."}
    {:rdf/language "es",
     :rdf/value
     "El URL de la antigua página de un proyecto,\n\t\tasociada con exactamente un proyecto."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "cs",
                 :rdf/value    "stará domovská stránka"}
                {:rdf/language "fr",
                 :rdf/value    "ancienne page web"}
                {:rdf/language "de",
                 :rdf/value    "Alte Homepage"}
                {:rdf/language "pt",
                 :rdf/value    "página web antiga"}
                {:rdf/language "en",
                 :rdf/value    "old homepage"}
                {:rdf/language "es",
                 :rdf/value    "página web antigua"}],
   :rdfs/subPropertyOf :foaf/homepage})

(def os
  "Sistema operativo a que o projeto está limitado. Omita esta propriedade se o projeto não é condicionado pelo SO usado."
  {:db/ident :doap/os,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [{:rdf/language "fr",
     :rdf/value
     "Système d'exploitation auquel est limité le projet. Omettez cette propriété si le\n\t\tprojet n'est pas limité à un système d'exploitation."}
    {:rdf/language "en",
     :rdf/value
     "Sistema operativo a que o projeto está limitado. Omita esta propriedade se o projeto não é condicionado pelo SO usado."}
    {:rdf/language "es",
     :rdf/value
     "Sistema opertivo al cuál está limitado el proyecto.  Omita esta propiedad si el proyecto no es específico\n\t\tde un sistema opertaivo en particular."}
    {:rdf/language "de",
     :rdf/value
     "Betriebssystem auf dem das Projekt eingesetzt werden kann. Diese Eigenschaft kann ausgelassen werden, wenn das Projekt nicht BS-spezifisch ist."}
    {:rdf/language "cs",
     :rdf/value
     "Operační systém, na jehož použití je projekt limitován. Vynechejte tuto vlastnost, pokud je projekt nezávislý na operačním systému."}
    {:rdf/language "en",
     :rdf/value
     "Operating system that a project is limited to.  Omit this property if the project is not OS-specific."}],
   :rdfs/domain [:doap/Project :doap/Version],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "cs",
                 :rdf/value    "operační systém"}
                {:rdf/language "fr",
                 :rdf/value    "système d'exploitation"}
                {:rdf/language "de",
                 :rdf/value    "Betriebssystem"}
                {:rdf/language "pt",
                 :rdf/value    "sistema operativo"}
                {:rdf/language "es",
                 :rdf/value    "sistema operativo"}
                {:rdf/language "en",
                 :rdf/value    "operating system"}],
   :rdfs/range :rdfs/Literal})

(def platform
  "Indicator of software platform (non-OS specific), e.g. Java, Firefox, ECMA CLR"
  {:db/ident :doap/platform,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [{:rdf/language "pt",
     :rdf/value
     "Indicador da plataforma do software (não específico a nenhum SO), ex.: Java, Firefox, ECMA CLR"}
    {:rdf/language "en",
     :rdf/value
     "Indicator of software platform (non-OS specific), e.g. Java, Firefox, ECMA CLR"}],
   :rdfs/domain [:doap/Version :doap/Project],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "pt",
                 :rdf/value    "plataforma"}
                {:rdf/language "en",
                 :rdf/value    "platform"}],
   :rdfs/range :rdfs/Literal})

(def programming-language
  "Programming language a project is implemented in or intended for use with."
  {:db/ident :doap/programming-language,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "Programming language a project is implemented in or intended for use with."}
    {:rdf/language "es",
     :rdf/value
     "Lenguaje de programación en el que un proyecto es implementado o con el cuál pretende usarse."}
    {:rdf/language "de",
     :rdf/value
     "Programmiersprache in der ein Projekt implementiert ist oder intendiert wird zu benutzen."}
    {:rdf/language "fr",
     :rdf/value
     "Langage de programmation avec lequel un projet est implémenté,\n\t\tou avec lequel il est prévu de l'utiliser."}
    {:rdf/language "cs",
     :rdf/value
     "Programovací jazyk, ve kterém je projekt implementován nebo pro který je zamýšlen k použití."}
    {:rdf/language "pt",
     :rdf/value
     "Linguagem de programação que o projeto usa ou é para ser utilizada."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "cs",
                 :rdf/value    "programovací jazyk"}
                {:rdf/language "fr",
                 :rdf/value    "langage de programmation"}
                {:rdf/language "en",
                 :rdf/value    "programming language"}
                {:rdf/language "es",
                 :rdf/value    "lenguaje de programación"}
                {:rdf/language "de",
                 :rdf/value    "Programmiersprache"}
                {:rdf/language "pt",
                 :rdf/value    "linguagem de programação"}],
   :rdfs/range :rdfs/Literal})

(def release
  "A project release."
  {:db/ident         :doap/release,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [{:rdf/language "es",
                       :rdf/value    "Un release (versión) de un proyecto."}
                      {:rdf/language "fr",
                       :rdf/value    "Une release (révision) d'un projet."}
                      {:rdf/language "en",
                       :rdf/value    "A project release."}
                      {:rdf/language "cs",
                       :rdf/value    "Relase (verze) projektu."}
                      {:rdf/language "pt",
                       :rdf/value    "A publicação de um projeto."}
                      {:rdf/language "de",
                       :rdf/value    "Ein Release (Version) eines Projekts."}],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "de",
                       :rdf/value    "Release"}
                      {:rdf/language "cs",
                       :rdf/value    "release"}
                      {:rdf/language "es",
                       :rdf/value    "release"}
                      {:rdf/language "fr",
                       :rdf/value    "release"}
                      {:rdf/language "en",
                       :rdf/value    "release"}
                      {:rdf/language "pt",
                       :rdf/value    "publicação"}],
   :rdfs/range       :doap/Version})

(def repository
  "Source code repository."
  {:db/ident         :doap/repository,
   :owl/inverseOf    :doap/repositoryOf,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [{:rdf/language "es",
                       :rdf/value    "Repositorio del código fuente."}
                      {:rdf/language "cs",
                       :rdf/value    "Úložiště zdrojových kódů."}
                      {:rdf/language "en",
                       :rdf/value    "Source code repository."}
                      {:rdf/language "pt",
                       :rdf/value    "Repositório do código fonte."}
                      {:rdf/language "fr",
                       :rdf/value    "Dépôt du code source."}
                      {:rdf/language "de",
                       :rdf/value    "Quellcode-Versionierungssystem."}],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "repository"}
                      {:rdf/language "es",
                       :rdf/value    "repositorio"}
                      {:rdf/language "pt",
                       :rdf/value    "repositório"}
                      {:rdf/language "fr",
                       :rdf/value    "dépôt"}
                      {:rdf/language "de",
                       :rdf/value    "Repository"}
                      {:rdf/language "cs",
                       :rdf/value    "úložiště"}],
   :rdfs/range       :doap/Repository})

(def repositoryOf
  "The project that uses a repository."
  {:db/ident         :doap/repositoryOf,
   :owl/inverseOf    :doap/repository,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The project that uses a repository."},
   :rdfs/domain      :doap/Repository,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "repository of"},
   :rdfs/range       :doap/Project})

(def revision
  "Revision identifier of a software release."
  {:db/ident :doap/revision,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value    "Revision identifier of a software release."}
    {:rdf/language "es",
     :rdf/value    "Indentificador de la versión de un release de software."}
    {:rdf/language "pt",
     :rdf/value    "Identificador do lançamento da revisão do software."}
    {:rdf/language "cs",
     :rdf/value    "Identifikátor zpřístupněné revize softwaru."}
    {:rdf/language "de",
     :rdf/value    "Versionsidentifikator eines Software-Releases."}
    {:rdf/language "fr",
     :rdf/value    "Identifiant de révision d'une release du programme."}],
   :rdfs/domain :doap/Version,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "Version"}
                {:rdf/language "en",
                 :rdf/value    "revision"}
                {:rdf/language "pt",
                 :rdf/value    "revisão"}
                {:rdf/language "fr",
                 :rdf/value    "révision"}
                {:rdf/language "es",
                 :rdf/value    "versión"}
                {:rdf/language "cs",
                 :rdf/value    "verze"}],
   :rdfs/range :rdfs/Literal})

(def screenshots
  "Web page with screenshots of project."
  {:db/ident         :doap/screenshots,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [{:rdf/language "en",
                       :rdf/value    "Web page with screenshots of project."}
                      {:rdf/language "es",
                       :rdf/value
                       "Página web con capturas de pantalla del proyecto."}
                      {:rdf/language "fr",
                       :rdf/value
                       "Page web avec des captures d'écran du projet."}
                      {:rdf/language "pt",
                       :rdf/value
                       "Página web com as capturas de ecrãn do projeto."}
                      {:rdf/language "cs",
                       :rdf/value
                       "Webová stránka projektu se snímky obrazovky."}
                      {:rdf/language "de",
                       :rdf/value
                       "Web-Seite mit Screenshots eines Projektes."}],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "cs",
                       :rdf/value    "snímek obrazovky"}
                      {:rdf/language "pt",
                       :rdf/value    "capturas de ecrãs"}
                      {:rdf/language "de",
                       :rdf/value    "Screenshots"}
                      {:rdf/language "en",
                       :rdf/value    "screenshots"}
                      {:rdf/language "fr",
                       :rdf/value    "captures d'écran"}
                      {:rdf/language "es",
                       :rdf/value    "capturas de pantalla"}]})

(def security-contact
  "The Agent that should be contacted if security issues are found with the project."
  {:db/ident :doap/security-contact,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The Agent that should be contacted\n\tif security issues are found with the project."},
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "security contact"},
   :rdfs/range :foaf/Agent})

(def security-policy
  "URL of the security policy of a project."
  {:db/ident           :doap/security-policy,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value "URL of the security policy of a project."},
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "security policy"},
   :rdfs/subPropertyOf :foaf/page})

(def service-endpoint
  "The URI of a web service endpoint where software as a service may be accessed"
  {:db/ident :doap/service-endpoint,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The URI of a web service endpoint where software as a service may be accessed"},
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "service endpoint"},
   :rdfs/range :rdfs/Resource})

(def shortdesc
  "Short (8 or 9 words) plain text description of a project."
  {:db/ident :doap/shortdesc,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Descripción corta (8 o 9 palabras) en texto plano de un proyecto."}
    {:rdf/language "en",
     :rdf/value    "Short (8 or 9 words) plain text description of a project."}
    {:rdf/language "de",
     :rdf/value
     "Kurzbeschreibung (8 oder 9 Wörter) eines Projekts als einfacher Text."}
    {:rdf/language "pt",
     :rdf/value
     "Descrição curta (com 8 ou 9 palavras) de um projeto em texto apenas."}
    {:rdf/language "cs",
     :rdf/value    "Krátký (8 nebo 9 slov) čistě textový popis projektu."}
    {:rdf/language "fr",
     :rdf/value    "Texte descriptif concis (8 ou 9 mots) d'un projet."}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "Kurzbeschreibung"}
                {:rdf/language "fr",
                 :rdf/value    "description courte"}
                {:rdf/language "pt",
                 :rdf/value    "descrição curta"}
                {:rdf/language "es",
                 :rdf/value    "descripción corta"}
                {:rdf/language "cs",
                 :rdf/value    "krátký popis"}
                {:rdf/language "en",
                 :rdf/value    "short description"}],
   :rdfs/range :rdfs/Literal})

(def support-forum
  "A forum or community that supports this project."
  {:db/ident         :doap/support-forum,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A forum or community that supports this project."},
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "supporting forum"},
   :rdfs/range       :sioc/Container})

(def tester
  "A tester or other quality control contributor."
  {:db/ident :doap/tester,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [{:rdf/language "cs",
     :rdf/value    "Tester nebo jiný spoluautor kontrolující kvalitu."}
    {:rdf/language "de",
     :rdf/value "Ein Tester oder anderer Mitarbeiter der Qualitätskontrolle."}
    {:rdf/language "fr",
     :rdf/value    "Un testeur ou un collaborateur au contrôle qualité."}
    {:rdf/language "en",
     :rdf/value    "A tester or other quality control contributor."}
    {:rdf/language "pt",
     :rdf/value
     "Um controlador ou outro contribuidor para o controlo de qualidade."}
    {:rdf/language "es",
     :rdf/value    "Un tester u otro proveedor de control de calidad."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "testeur"}
                {:rdf/language "de",
                 :rdf/value    "Tester"}
                {:rdf/language "pt",
                 :rdf/value    "controlador"}
                {:rdf/language "cs",
                 :rdf/value    "tester"}
                {:rdf/language "es",
                 :rdf/value    "tester"}
                {:rdf/language "en",
                 :rdf/value    "tester"}],
   :rdfs/range :foaf/Person})

(def translator
  "Contributor of translations to the project."
  {:db/ident         :doap/translator,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [{:rdf/language "pt",
                       :rdf/value "Contribuidor das traduções para o projeto."}
                      {:rdf/language "es",
                       :rdf/value    "Proveedor de traducciones al proyecto."}
                      {:rdf/language "de",
                       :rdf/value
                       "Mitarbeiter an den Übersetzungen des Projektes."}
                      {:rdf/language "en",
                       :rdf/value "Contributor of translations to the project."}
                      {:rdf/language "fr",
                       :rdf/value    "Collaborateur à la traduction du projet."}
                      {:rdf/language "cs",
                       :rdf/value    "Spoluautor překladu projektu."}],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "es",
                       :rdf/value    "traductor"}
                      {:rdf/language "en",
                       :rdf/value    "translator"}
                      {:rdf/language "pt",
                       :rdf/value    "tradutor"}
                      {:rdf/language "de",
                       :rdf/value    "Übersetzer"}
                      {:rdf/language "fr",
                       :rdf/value    "traducteur"}
                      {:rdf/language "cs",
                       :rdf/value    "překladatel"}],
   :rdfs/range       :foaf/Person})

(def vendor
  "Vendor organization: commercial, free or otherwise"
  {:db/ident         :doap/vendor,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Vendor organization: commercial, free or otherwise"},
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "vendor"},
   :rdfs/range       :foaf/Organization})

(def wiki
  "URL of Wiki for collaborative discussion of project."
  {:db/ident :doap/wiki,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [{:rdf/language "fr",
     :rdf/value "L'URL du Wiki pour la discussion collaborative sur le projet."}
    {:rdf/language "en",
     :rdf/value    "URL of Wiki for collaborative discussion of project."}
    {:rdf/language "cs",
     :rdf/value    "URL adresa wiki projektu pro společné diskuse."}
    {:rdf/language "de",
     :rdf/value    "Wiki-URL für die kollaborative Dikussion eines Projektes."}
    {:rdf/language "pt",
     :rdf/value    "URL da Wiki para discussão em grupo do projeto."}
    {:rdf/language "es",
     :rdf/value    "URL del Wiki para discusión colaborativa del proyecto."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "Wiki"}
                {:rdf/language "pt",
                 :rdf/value    "wiki"}
                {:rdf/language "cs",
                 :rdf/value    "wiki"}
                {:rdf/language "es",
                 :rdf/value    "wiki"}
                {:rdf/language "fr",
                 :rdf/value    "wiki"}
                {:rdf/language "en",
                 :rdf/value    "wiki"}],
   :rdfs/range :sioc.types/Wiki})
