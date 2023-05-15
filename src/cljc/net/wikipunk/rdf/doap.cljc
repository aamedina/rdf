(ns net.wikipunk.rdf.doap
  "http://usefulinc.com/ns/doap#"
  {:dc11/creator "Edd Wilder-James",
   :dc11/description
   [#voc/lstr
     "Slovník Description of a Project (DOAP, Popis projektu), popsaný použitím W3C RDF Schema a Web Ontology Language.@cs"
    #voc/lstr
     "Das Vokabular \"Description of a Project (DOAP)\", beschrieben durch W3C RDF Schema and the Web Ontology Language.@de"
    #voc/lstr
     "Le vocabulaire Description Of A Project (DOAP, Description D'Un Projet),\n\t\tdécrit en utilisant RDF Schema du W3C et OWL.@fr"
    #voc/lstr
     "El vocabulario Description of a Project (DOAP, Descripción de un Proyecto), descrito usando RDF Schema de W3C\n\t\ty Web Ontology Language.@es"
    "The Description of a Project (DOAP) vocabulary, described using W3C RDF Schema and the Web Ontology Language."
    #voc/lstr
     "Vocabulário de descrição de um Projeto (DOAP - Description of a Project), descrito no esquema (schema) W3C RDF e na Web Ontology Language.@pt"],
   :dc11/format "application/rdf+xml",
   :dc11/rights "Copyright © The DOAP Authors",
   :dc11/title "Description of a Project (DOAP) vocabulary",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/ewilderj/doap/master/schema/doap.rdf",
   :foaf/maker {:foaf/mbox "mailto:edd@usefulinc.com",
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
   :rdfa/uri "http://usefulinc.com/ns/doap#"}
  (:refer-clojure :exclude [name]))

(def ArchRepository
  "GNU Arch source code repository."
  {:db/ident         :doap/ArchRepository,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     [#voc/lstr "GNU Arch source code repository.@en"
                      #voc/lstr "Úložiště zdrojových kódů GNU Arch.@cs"
                      #voc/lstr "Dépôt GNU Arch du code source.@fr"
                      #voc/lstr "Repositorio GNU Arch del código fuente.@es"
                      #voc/lstr "Repositório GNU Arch do código fonte.@pt"
                      #voc/lstr "GNU Arch Quellcode-Versionierungssystem.@de"],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [#voc/lstr "Dépôt GNU Arch@fr"
                      #voc/lstr "Repositório GNU Arch@pt"
                      #voc/lstr "Repositorio GNU Arch@es"
                      #voc/lstr "Úložiště GNU Arch@cs"
                      #voc/lstr "GNU Arch repository@de"
                      #voc/lstr "GNU Arch repository@en"],
   :rdfs/subClassOf  [:doap/Repository :doap/ArchRepository :rdfs/Resource]})

(def BKRepository
  "BitKeeper source code repository."
  {:db/ident         :doap/BKRepository,
   :rdf/type         [:rdfs/Class :owl/Class],
   :rdfs/comment     [#voc/lstr "Dépôt BitKeeper du code source.@fr"
                      #voc/lstr "Repositório BitKeeper do código fonte.@pt"
                      #voc/lstr "Úložiště zdrojových kódů BitKeeper.@cs"
                      #voc/lstr "BitKeeper Quellcode-Versionierungssystem.@de"
                      #voc/lstr "Repositorio BitKeeper del código fuente.@es"
                      #voc/lstr "BitKeeper source code repository.@en"],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [#voc/lstr "BitKeeper Repository@de"
                      #voc/lstr "BitKeeper Repository@en"
                      #voc/lstr "Repositório Bitkeeper@pt"
                      #voc/lstr "Dépôt BitKeeper@fr"
                      #voc/lstr "Úložiště BitKeeper@cs"
                      #voc/lstr "Repositorio BitKeeper@es"],
   :rdfs/subClassOf  [:doap/Repository :doap/BKRepository :rdfs/Resource]})

(def BazaarBranch
  "Bazaar source code branch."
  {:db/ident         :doap/BazaarBranch,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [#voc/lstr "Código fonte da ramificação Bazaar.@pt"
                      #voc/lstr "Bazaar source code branch.@en"],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [#voc/lstr "Ramificação Bazaar@pt"
                      #voc/lstr "Bazaar Branch@en"],
   :rdfs/subClassOf  [:doap/Repository :doap/BazaarBranch :rdfs/Resource]})

(def CVSRepository
  "CVS source code repository."
  {:db/ident         :doap/CVSRepository,
   :rdf/type         [:rdfs/Class :owl/Class],
   :rdfs/comment     [#voc/lstr "Dépôt CVS du code source.@fr"
                      #voc/lstr "Úložiště zdrojových kódů CVS.@cs"
                      #voc/lstr "Repositório CVS do código fonte.@pt"
                      #voc/lstr "CVS Quellcode-Versionierungssystem.@de"
                      #voc/lstr "CVS source code repository.@en"
                      #voc/lstr "Repositorio CVS del código fuente.@es"],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [#voc/lstr "CVS Repository@de"
                      #voc/lstr "CVS Repository@en"
                      #voc/lstr "Úložiště CVS@cs"
                      #voc/lstr "Dépôt CVS@fr"
                      #voc/lstr "Repositório CVS@pt"
                      #voc/lstr "Repositorio CVS@es"],
   :rdfs/subClassOf  [:doap/Repository :doap/CVSRepository :rdfs/Resource]})

(def DarcsRepository
  "darcs source code repository."
  {:db/ident         :doap/DarcsRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [#voc/lstr "Dépôt darcs du code source.@fr"
                      #voc/lstr "Repositorio darcs del código fuente.@es"
                      #voc/lstr "Repositório darcs do código fonte.@pt"
                      #voc/lstr "darcs source code repository.@en"],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [#voc/lstr "darcs Repository@en"
                      #voc/lstr "Dépôt darcs@fr"
                      #voc/lstr "Repositório darcs@pt"
                      #voc/lstr "Repositorio darcs@es"],
   :rdfs/subClassOf  [:doap/Repository :doap/DarcsRepository :rdfs/Resource]})

(def GitBranch
  "Git source code branch."
  {:db/ident         :doap/GitBranch,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [#voc/lstr "Código fonte da ramificação Git.@pt"
                      #voc/lstr "Git source code branch.@en"],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [#voc/lstr "Ramificação Git@pt" #voc/lstr "Git Branch@en"],
   :rdfs/subClassOf  [:doap/Repository :doap/GitBranch :rdfs/Resource]})

(def GitRepository
  "Git source code repository."
  {:db/ident         :doap/GitRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [#voc/lstr "Repositorio Git del código fuente.@es"
                      #voc/lstr "Dépôt Git du code source.@fr"
                      #voc/lstr "Úložiště zdrojových kódů Git.@cs"
                      #voc/lstr "Repositório Git do código fonte.@pt"
                      #voc/lstr "Git source code repository.@en"
                      #voc/lstr "Git Quellcode-Versionierungssystem.@de"],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [#voc/lstr "Dépôt Git@fr"
                      #voc/lstr "Git Repository@de"
                      #voc/lstr "Git Repository@en"
                      #voc/lstr "Úložiště Git@cs"
                      #voc/lstr "Repositório Git@pt"
                      #voc/lstr "Repositorio Git@es"],
   :rdfs/subClassOf  [:doap/Repository :doap/GitRepository :rdfs/Resource]})

(def HgRepository
  "Mercurial source code repository."
  {:db/ident         :doap/HgRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [#voc/lstr "Repositório Mercurial do código fonte.@pt"
                      #voc/lstr "Mercurial source code repository.@en"],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [#voc/lstr "Repositório Mercurial@pt"
                      #voc/lstr "Mercurial Repository@en"],
   :rdfs/subClassOf  [:doap/Repository :doap/HgRepository :rdfs/Resource]})

(def Project
  "A project."
  {:db/ident         :doap/Project,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [#voc/lstr "Projeto.@pt"
                      #voc/lstr "Projekt.@cs"
                      #voc/lstr "Un proyecto.@es"
                      #voc/lstr "Ein Projekt.@de"
                      #voc/lstr "Un projet.@fr"
                      #voc/lstr "A project.@en"],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [#voc/lstr "Proyecto@es"
                      #voc/lstr "Projeto@pt"
                      #voc/lstr "Projet@fr"
                      #voc/lstr "Project@en"
                      #voc/lstr "Projekt@cs"
                      #voc/lstr "Projekt@de"],
   :rdfs/subClassOf  [:rdfs/Resource
                      "http://xmlns.com/wordnet/1.6/Project"
                      :foaf/Project
                      :doap/Project]})

(def Repository
  "Source code repository."
  {:db/ident         :doap/Repository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [#voc/lstr "Repositório do código fonte.@pt"
                      #voc/lstr "Source code repository.@en"
                      #voc/lstr "Dépôt du code source.@fr"
                      #voc/lstr "Quellcode-Versionierungssystem.@de"
                      #voc/lstr "Úložiště zdrojových kódů.@cs"
                      #voc/lstr "Repositorio del código fuente.@es"],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [#voc/lstr "Úložiště@cs"
                      #voc/lstr "Repository@de"
                      #voc/lstr "Repository@en"
                      #voc/lstr "Repositório@pt"
                      #voc/lstr "Dépôt@fr"
                      #voc/lstr "Repositorio@es"],
   :rdfs/subClassOf  [:rdfs/Resource :doap/Repository]})

(def SVNRepository
  "Subversion source code repository."
  {:db/ident         :doap/SVNRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [#voc/lstr "Subversion source code repository.@en"
                      #voc/lstr "Úložiště zdrojových kódů Subversion.@cs"
                      #voc/lstr "Dépôt Subversion du code source.@fr"
                      #voc/lstr "Repositório Subversion do código fonte.@pt"
                      #voc/lstr "Subversion Quellcode-Versionierungssystem.@de"
                      #voc/lstr "Repositorio Subversion del código fuente.@es"],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [#voc/lstr "Dépôt Subversion@fr"
                      #voc/lstr "Subversion Repository@de"
                      #voc/lstr "Subversion Repository@en"
                      #voc/lstr "Úložiště Subversion@cs"
                      #voc/lstr "Repositorio Subversion@es"
                      #voc/lstr "Repositório Subversion@pt"],
   :rdfs/subClassOf  [:doap/Repository :doap/SVNRepository :rdfs/Resource]})

(def Specification
  "A specification of a system's aspects, technical or otherwise."
  {:db/ident :doap/Specification,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   [#voc/lstr "A especificação de aspetos, técnicas ou outros do sistema.@pt"
    #voc/lstr
     "A specification of a system's aspects, technical or otherwise.@en"],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [#voc/lstr "Especificação@pt" #voc/lstr "Specification@en"],
   :rdfs/subClassOf [:rdfs/Resource :doap/Specification]})

(def Version
  "Version information of a project release."
  {:db/ident :doap/Version,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   [#voc/lstr "Información sobre la versión de un release del proyecto.@es"
    #voc/lstr "Informace o uvolněné verzi projektu.@cs"
    #voc/lstr "Version information of a project release.@en"
    #voc/lstr "Versionsinformation eines Projekt Releases.@de"
    #voc/lstr "Informação sobre a versão do projeto lançado.@pt"
    #voc/lstr "Détails sur une version d'une release d'un projet.@fr"],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [#voc/lstr "Versão@pt"
                #voc/lstr "Version@de"
                #voc/lstr "Version@fr"
                #voc/lstr "Version@en"
                #voc/lstr "Verze@cs"
                #voc/lstr "Versión@es"],
   :rdfs/subClassOf [:rdfs/Resource :doap/Version]})

(def anon-root
  "Repository for anonymous access."
  {:db/ident           :doap/anon-root,
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr "Repository für anonymen Zugriff@de"
                        #voc/lstr "Repositorio para acceso anónimo.@es"
                        #voc/lstr "Úložiště pro anonymní přístup.@cs"
                        #voc/lstr "Dépôt pour accès anonyme.@fr"
                        #voc/lstr "Repositório para acesso anónimo.@pt"
                        #voc/lstr "Repository for anonymous access.@en"],
   :rdfs/domain        :doap/Repository,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         [#voc/lstr "raíz anónima@pt"
                        #voc/lstr "raíz anónima@es"
                        #voc/lstr "anonymní kořen@cs"
                        #voc/lstr "anonymous root@en"
                        #voc/lstr "racine anonyme@fr"
                        #voc/lstr "Anonymes Root@de"],
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :doap/anon-root})

(def audience
  "Description of target user base"
  {:db/ident           :doap/audience,
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr "Descrição do utilizador base alvo@pt"
                        #voc/lstr "Description of target user base@en"],
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         [#voc/lstr "audiência@pt" #voc/lstr "audience@en"],
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :doap/audience})

(def blog
  "URI of a blog related to a project"
  {:db/ident           :doap/blog,
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr "URI de um blog relacionado com um projeto@pt"
                        #voc/lstr "URI of a blog related to a project@en"],
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         [#voc/lstr "blog@pt" #voc/lstr "blog@en"],
   :rdfs/range         [:sioc.types/Weblog :rdfs/Resource],
   :rdfs/subPropertyOf :doap/blog})

(def browse
  "Web browser interface to repository."
  {:db/ident           :doap/browse,
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr "Interface web do repositório.@pt"
                        #voc/lstr "Webové rozhraní pro prohlížení úložiště.@cs"
                        #voc/lstr "Web browser interface to repository.@en"
                        #voc/lstr "Interface web au dépôt.@fr"
                        #voc/lstr "Interface web del repositorio.@es"
                        #voc/lstr
                         "Web-Browser Interface für das Repository.@de"],
   :rdfs/domain        :doap/Repository,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         [#voc/lstr "browse@en"
                        #voc/lstr "navegar@pt"
                        #voc/lstr "navegar@es"
                        #voc/lstr "visualiser@fr"
                        #voc/lstr "prohlížeč@cs"
                        #voc/lstr "browse@de"],
   :rdfs/subPropertyOf :doap/browse})

(def bug-database
  "Bug tracker for a project."
  {:db/ident           :doap/bug-database,
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr "Bug tracker para um projeto.@pt"
                        #voc/lstr "Suivi des bugs pour un projet.@fr"
                        #voc/lstr "Bug tracker for a project.@en"
                        #voc/lstr "Fehlerdatenbank eines Projektes.@de"
                        #voc/lstr "Bug tracker para un proyecto.@es"
                        #voc/lstr "Správa chyb projektu.@cs"],
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         [#voc/lstr "databáze chyb@cs"
                        #voc/lstr "suivi des bugs@fr"
                        #voc/lstr "Fehlerdatenbank@de"
                        #voc/lstr "bug database@en"
                        #voc/lstr "base de datos de bugs@es"
                        #voc/lstr "base de dados de bugs@pt"],
   :rdfs/subPropertyOf :doap/bug-database})

(def category
  "A category of project."
  {:db/ident           :doap/category,
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr "Kategorie projektu.@cs"
                        #voc/lstr "Eine Kategorie eines Projektes.@de"
                        #voc/lstr "A category of project.@en"
                        #voc/lstr "Una categoría de proyecto.@es"
                        #voc/lstr "Uma categoría de projeto.@pt"
                        #voc/lstr "Une catégorie de projet.@fr"],
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         [#voc/lstr "category@en"
                        #voc/lstr "categoría@es"
                        #voc/lstr "kategorie@cs"
                        #voc/lstr "Kategorie@de"
                        #voc/lstr "catégorie@fr"
                        #voc/lstr "categoria@pt"],
   :rdfs/subPropertyOf :doap/category})

(def created
  "Date when something was created, in YYYY-MM-DD form. e.g. 2004-04-05"
  {:db/ident :doap/created,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr
     "Erstellungsdatum von Irgendwas, angegeben im YYYY-MM-DD Format, z.B. 2004-04-05.@de"
    #voc/lstr
     "Datum, kdy bylo něco vytvořeno ve formátu RRRR-MM-DD, např. 2004-04-05@cs"
    #voc/lstr
     "Fecha en la que algo fue creado, en formato AAAA-MM-DD. e.g. 2004-04-05@es"
    #voc/lstr
     "Date when something was created, in YYYY-MM-DD form. e.g. 2004-04-05@en"
    #voc/lstr
     "Date à laquelle a été créé quelque chose, au format AAAA-MM-JJ (par ex. 2004-04-05)@fr"
    #voc/lstr
     "Data em que algo foi criado, no formato AAAA-MM-DD. e.g. 2004-04-05@pt"],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [#voc/lstr "created@en"
                #voc/lstr "erstellt@de"
                #voc/lstr "vytvořeno@cs"
                #voc/lstr "criado@pt"
                #voc/lstr "creado@es"
                #voc/lstr "créé@fr"],
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :doap/created})

(def description
  "Plain text description of a project, of 2-4 sentences in length."
  {:db/ident :doap/description,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "Čistě textový, 2 až 4 věty dlouhý popis projektu.@cs"
    #voc/lstr "Texte descriptif d'un projet, long de 2 à 4 phrases.@fr"
    #voc/lstr
     "Descrição de um projeto em texto apenas, com 2 a 4 frases de comprimento.@pt"
    #voc/lstr
     "Descripción en texto plano de un proyecto, de 2 a 4 enunciados de longitud.@es"
    #voc/lstr
     "Beschreibung eines Projekts als einfacher Text mit der Länge von 2 bis 4 Sätzen.@de"
    #voc/lstr
     "Plain text description of a project, of 2-4 sentences in length.@en"],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [#voc/lstr "descripción@es"
                #voc/lstr "popis@cs"
                #voc/lstr "description@en"
                #voc/lstr "description@fr"
                #voc/lstr "descrição@pt"
                #voc/lstr "Beschreibung@de"],
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :doap/description})

(def developer
  "Developer of software for the project."
  {:db/ident           :doap/developer,
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr "Vývojář softwaru projektu.@cs"
                        #voc/lstr "Programador de software para o projeto.@pt"
                        #voc/lstr
                         "Desarrollador de software para el proyecto.@es"
                        #voc/lstr "Développeur pour le projet.@fr"
                        #voc/lstr "Developer of software for the project.@en"
                        #voc/lstr "Software-Entwickler für das Projekt.@de"],
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         [#voc/lstr "Entwickler@de"
                        #voc/lstr "vývojář@cs"
                        #voc/lstr "développeur@fr"
                        #voc/lstr "desarrollador@es"
                        #voc/lstr "programador@pt"
                        #voc/lstr "developer@en"],
   :rdfs/range         :foaf/Person,
   :rdfs/subPropertyOf :doap/developer})

(def developer-forum
  "A forum or community for developers of this project."
  {:db/ident :doap/developer-forum,
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr
                  "A forum or community for developers of this project.@en",
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label #voc/lstr "developer forum@en",
   :rdfs/range :sioc/Container,
   :rdfs/subPropertyOf :doap/developer-forum})

(def documentation
  "Documentation of the project."
  {:db/ident           :doap/documentation,
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr "Aide pour l’utilisation de ce projet.@fr"
                        #voc/lstr "Documentation of the project.@en"],
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         [#voc/lstr "aide@fr" #voc/lstr "documentation@en"],
   :rdfs/subPropertyOf :doap/documentation})

(def documenter
  "Contributor of documentation to the project."
  {:db/ident           :doap/documenter,
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr
                         "Contribuidor para a documentação do projeto.@pt"
                        #voc/lstr
                         "Proveedor de documentación para el proyecto.@es"
                        #voc/lstr
                         "Collaborateur à la documentation du projet.@fr"
                        #voc/lstr "Spoluautor dokumentace projektu.@cs"
                        #voc/lstr
                         "Mitarbeiter an der Dokumentation des Projektes.@de"
                        #voc/lstr
                         "Contributor of documentation to the project.@en"],
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         [#voc/lstr "documenter@en"
                        #voc/lstr "dokumentarista@cs"
                        #voc/lstr "Dokumentator@de"
                        #voc/lstr "escritor de ayuda@es"
                        #voc/lstr "rédacteur de l'aide@fr"
                        #voc/lstr "documentador@pt"],
   :rdfs/range         :foaf/Person,
   :rdfs/subPropertyOf :doap/documenter})

(def download-mirror
  "Mirror of software download web page."
  {:db/ident :doap/download-mirror,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "Mirror of software download web page.@en"
    #voc/lstr
     "Spiegel der Seite von die Projekt-Software heruntergeladen werden kann.@de"
    #voc/lstr "Zrcadlo stránky pro stažení softwaru.@cs"
    #voc/lstr "Mirror de la página web de descarga.@es"
    #voc/lstr "Miroir de la page de téléchargement du programme.@fr"
    #voc/lstr "Mirror da página web para fazer download.@pt"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [#voc/lstr "zrcadlo stránky pro stažení@cs"
                #voc/lstr "miroir pour le téléchargement@fr"
                #voc/lstr "download mirror@en"
                #voc/lstr "mirror para download@pt"
                #voc/lstr "Spiegel der Seite zum Herunterladen@de"
                #voc/lstr "mirror de descarga@es"],
   :rdfs/subPropertyOf :doap/download-mirror})

(def download-page
  "Web page from which the project software can be downloaded."
  {:db/ident :doap/download-page,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr
     "Web-Seite von der die Projekt-Software heruntergeladen werden kann.@de"
    #voc/lstr "Webová stránka, na které lze stáhnout projektový software.@cs"
    #voc/lstr "Web page from which the project software can be downloaded.@en"
    #voc/lstr
     "Page web à partir de laquelle on peut télécharger le programme.@fr"
    #voc/lstr
     "Página web da qual o projeto de software pode ser descarregado.@pt"
    #voc/lstr "Página web de la cuál se puede bajar el software.@es"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [#voc/lstr "stránka pro stažení@cs"
                #voc/lstr "página para download@pt"
                #voc/lstr "page de téléchargement@fr"
                #voc/lstr "Seite zum Herunterladen@de"
                #voc/lstr "download page@en"
                #voc/lstr "página de descarga@es"],
   :rdfs/subPropertyOf :doap/download-page})

(def file-release
  "URI of download associated with this release."
  {:db/ident           :doap/file-release,
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr
                         "URI para download associado com a publicação.@pt"
                        #voc/lstr "URI adresa stažení asociované s revizí.@cs"
                        #voc/lstr
                         "URI of download associated with this release.@en"],
   :rdfs/domain        :doap/Version,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         [#voc/lstr "publicação do ficheiro@pt"
                        #voc/lstr "soubor revize@cs"
                        #voc/lstr "file-release@en"],
   :rdfs/subPropertyOf :doap/file-release})

(def helper
  "Project contributor."
  {:db/ident           :doap/helper,
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr "Ajudante ou colaborador do projeto.@pt"
                        #voc/lstr "Spoluautor projektu.@cs"
                        #voc/lstr "Projekt-Mitarbeiter.@de"
                        #voc/lstr "Collaborateur au projet.@fr"
                        #voc/lstr "Project contributor.@en"
                        #voc/lstr "Colaborador del proyecto.@es"],
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         [#voc/lstr "helper@en"
                        #voc/lstr "collaborateur@fr"
                        #voc/lstr "colaborador@pt"
                        #voc/lstr "colaborador@es"
                        #voc/lstr "Helfer@de"
                        #voc/lstr "spoluautor@cs"],
   :rdfs/range         :foaf/Person,
   :rdfs/subPropertyOf :doap/helper})

(def homepage
  "URL of a project's homepage, associated with exactly one project."
  {:db/ident :doap/homepage,
   :rdf/type [:owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/comment
   [#voc/lstr
     "O URL da página de um projeto,\n\t\tasociada com exactamente um projeto.@pt"
    #voc/lstr
     "El URL de la página de un proyecto,\n\t\tasociada con exactamente un proyecto.@es"
    #voc/lstr
     "URL of a project's homepage,\n\t\tassociated with exactly one project.@en"
    #voc/lstr
     "URL der Projekt-Homepage,\n\t\tverbunden mit genau einem Projekt.@de"
    #voc/lstr
     "L'URL de la page web d'un projet,\n\t\tassociée avec un unique projet.@fr"
    #voc/lstr
     "URL adresa domovské stránky projektu asociované s právě jedním projektem.@cs"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [#voc/lstr "page web@fr"
                #voc/lstr "Homepage@de"
                #voc/lstr "página web@pt"
                #voc/lstr "página web@es"
                #voc/lstr "homepage@en"
                #voc/lstr "domovská stránka@cs"],
   :rdfs/subPropertyOf [:foaf/homepage :doap/homepage]})

(def implements
  "A specification that a project implements. Could be a standard, API or legally defined level of conformance."
  {:db/ident :doap/implements,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr
     "Uma especificação que um projeto implementa. Pode ser uma padrão, API ou um nível de conformidade definida legalmente.@pt"
    #voc/lstr
     "A specification that a project implements. Could be a standard, API or legally defined level of conformance.@en"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [#voc/lstr "Especificações para implementação@pt"
                #voc/lstr "Implements specification@en"],
   :rdfs/range :doap/Specification,
   :rdfs/subPropertyOf :doap/implements})

(def language
  "BCP47 language code a project has been translated into"
  {:db/ident :doap/language,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "Código de idioma BCP47 do projeto para o qual foi traduzido@pt"
    #voc/lstr "BCP47 language code a project has been translated into@en"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [#voc/lstr "idioma@pt" #voc/lstr "language@en"],
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :doap/language})

(def license
  "The URI of an RDF description of the license the software is distributed under. E.g. a SPDX reference"
  {:db/ident :doap/license,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr
     "L'URI d'une description RDF de la licence sous laquelle le programme est distribué.@fr"
    #voc/lstr
     "El URI de una descripción RDF de la licencia bajo la cuál se distribuye el software.@es"
    #voc/lstr
     "O URI de uma descrição RDF da licença do software sob a qual é distribuída. Ex.: referência SPDX@pt"
    #voc/lstr
     "URI adresa RDF popisu licence, pod kterou je software distribuován.@cs"
    #voc/lstr
     "Die URI einer RDF-Beschreibung einer Lizenz unter der die Software herausgegeben wird. z.B. eine SPDX Referenz@de"
    #voc/lstr
     "The URI of an RDF description of the license the software is distributed under. E.g. a SPDX reference@en"],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [#voc/lstr "Lizenz@de"
                #voc/lstr "licence@cs"
                #voc/lstr "licence@fr"
                #voc/lstr "license@en"
                #voc/lstr "licencia@es"
                #voc/lstr "licença@pt"],
   :rdfs/subPropertyOf :doap/license})

(def location
  "Location of a repository."
  {:db/ident           :doap/location,
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr "Lokation eines Repositorys.@de"
                        #voc/lstr "Location of a repository.@en"
                        #voc/lstr "lugar de un repositorio.@es"
                        #voc/lstr "Localização de um repositório.@pt"
                        #voc/lstr "Emplacement d'un dépôt.@fr"
                        #voc/lstr "Umístění úložiště.@cs"],
   :rdfs/domain        :doap/Repository,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         [#voc/lstr "repository location@en"
                        #voc/lstr "umístění úložiště@cs"
                        #voc/lstr "localização do respositório@pt"
                        #voc/lstr "lugar del respositorio@es"
                        #voc/lstr "emplacement du dépôt@fr"
                        #voc/lstr "Repository Lokation@de"],
   :rdfs/subPropertyOf :doap/location})

(def mailing-list
  "Mailing list home page or email address."
  {:db/ident :doap/mailing-list,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "Domovská stránka nebo e–mailová adresa e–mailové diskuse.@cs"
    #voc/lstr "Homepage der Mailing Liste oder E-Mail Adresse.@de"
    #voc/lstr "Page web de la liste de diffusion, ou adresse de courriel.@fr"
    #voc/lstr
     "Página web da lista de distribuição de e-mail ou dos endereços.@pt"
    #voc/lstr "Mailing list home page or email address.@en"
    #voc/lstr "Página web de la lista de correo o dirección de correo.@es"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [#voc/lstr "lista de correo@es"
                #voc/lstr "lista de distribuição de e-mail@pt"
                #voc/lstr "mailing list@en"
                #voc/lstr "liste de diffusion@fr"
                #voc/lstr "Mailing Liste@de"
                #voc/lstr "e–mailová diskuse@cs"],
   :rdfs/range :sioc.types/MailingList,
   :rdfs/subPropertyOf :doap/mailing-list})

(def maintainer
  "Maintainer of a project, a project leader."
  {:db/ident :doap/maintainer,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "Správce projektu, vedoucí projektu.@cs"
    #voc/lstr "Développeur principal d'un projet, un meneur du projet.@fr"
    #voc/lstr "Hauptentwickler eines Projektes, der Projektleiter@de"
    #voc/lstr "Desarrollador principal de un proyecto, un líder de proyecto.@es"
    #voc/lstr "Programador principal de um projeto, um líder de projeto.@pt"
    #voc/lstr "Maintainer of a project, a project leader.@en"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [#voc/lstr "Projektverantwortlicher@de"
                #voc/lstr "développeur principal@fr"
                #voc/lstr "správce@cs"
                #voc/lstr "maintainer@en"
                #voc/lstr "desarrollador principal@es"
                #voc/lstr "programador principal@pt"],
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :doap/maintainer})

(def module
  "Module name of a Subversion, CVS, BitKeeper or Arch repository."
  {:db/ident :doap/module,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "Nom du module d'un dépôt Subversion, CVS, BitKeeper ou Arch.@fr"
    #voc/lstr
     "Modul-Name eines Subversion, CVS, BitKeeper oder Arch Repositorys.@de"
    #voc/lstr "Jméno modulu v CVS, BitKeeper nebo Arch úložišti.@cs"
    #voc/lstr
     "Module name of a Subversion, CVS, BitKeeper or Arch repository.@en"
    #voc/lstr
     "Nombre del módulo de un repositorio Subversion, CVS, BitKeeper o Arch.@es"
    #voc/lstr
     "Nome do módulo de um repositório Subversion, CVS, BitKeeper ou Arch.@pt"],
   :rdfs/domain
   {:owl/unionOf [:doap/CVSRepository :doap/ArchRepository :doap/BKRepository],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [#voc/lstr "module@fr"
                #voc/lstr "module@en"
                #voc/lstr "modul@cs"
                #voc/lstr "Modul@de"
                #voc/lstr "módulo@pt"
                #voc/lstr "módulo@es"],
   :rdfs/subPropertyOf :doap/module})

(def name
  "A name of something."
  {:db/ident           :doap/name,
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr "O nome de alguma coisa.@pt"
                        #voc/lstr "A name of something.@en"
                        #voc/lstr "Der Name von Irgendwas@de"
                        #voc/lstr "El nombre de algo.@es"
                        #voc/lstr "Jméno něčeho.@cs"
                        #voc/lstr "Le nom de quelque chose.@fr"],
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         [#voc/lstr "nombre@es"
                        #voc/lstr "nom@fr"
                        #voc/lstr "nome@pt"
                        #voc/lstr "Name@de"
                        #voc/lstr "name@en"
                        #voc/lstr "jméno@cs"],
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf [:rdfs/label :doap/name]})

(def old-homepage
  "URL of a project's past homepage, associated with exactly one project."
  {:db/ident :doap/old-homepage,
   :rdf/type [:owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/comment
   [#voc/lstr
     "URL adresa předešlé domovské stránky projektu asociované s právě jedním projektem.@cs"
    #voc/lstr
     "URL of a project's past homepage,\n\t\tassociated with exactly one project.@en"
    #voc/lstr
     "L'URL d'une ancienne page web d'un\n\t\tprojet, associée avec un unique projet.@fr"
    #voc/lstr
     "O URL antigo da página de um projeto,\n\t\tassociada com exactamente um projeto.@pt"
    #voc/lstr
     "URL der letzten Projekt-Homepage,\n\t\tverbunden mit genau einem Projekt.@de"
    #voc/lstr
     "El URL de la antigua página de un proyecto,\n\t\tasociada con exactamente un proyecto.@es"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [#voc/lstr "stará domovská stránka@cs"
                #voc/lstr "ancienne page web@fr"
                #voc/lstr "Alte Homepage@de"
                #voc/lstr "página web antiga@pt"
                #voc/lstr "old homepage@en"
                #voc/lstr "página web antigua@es"],
   :rdfs/subPropertyOf [:foaf/homepage :doap/old-homepage]})

(def os
  "Sistema operativo a que o projeto está limitado. Omita esta propriedade se o projeto não é condicionado pelo SO usado."
  {:db/ident :doap/os,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr
     "Système d'exploitation auquel est limité le projet. Omettez cette propriété si le\n\t\tprojet n'est pas limité à un système d'exploitation.@fr"
    #voc/lstr
     "Sistema operativo a que o projeto está limitado. Omita esta propriedade se o projeto não é condicionado pelo SO usado.@en"
    #voc/lstr
     "Sistema opertivo al cuál está limitado el proyecto.  Omita esta propiedad si el proyecto no es específico\n\t\tde un sistema opertaivo en particular.@es"
    #voc/lstr
     "Betriebssystem auf dem das Projekt eingesetzt werden kann. Diese Eigenschaft kann ausgelassen werden, wenn das Projekt nicht BS-spezifisch ist.@de"
    #voc/lstr
     "Operační systém, na jehož použití je projekt limitován. Vynechejte tuto vlastnost, pokud je projekt nezávislý na operačním systému.@cs"
    #voc/lstr
     "Operating system that a project is limited to.  Omit this property if the project is not OS-specific.@en"],
   :rdfs/domain [:doap/Project :doap/Version],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [#voc/lstr "operační systém@cs"
                #voc/lstr "système d'exploitation@fr"
                #voc/lstr "Betriebssystem@de"
                #voc/lstr "sistema operativo@pt"
                #voc/lstr "sistema operativo@es"
                #voc/lstr "operating system@en"],
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :doap/os})

(def platform
  "Indicator of software platform (non-OS specific), e.g. Java, Firefox, ECMA CLR"
  {:db/ident :doap/platform,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr
     "Indicador da plataforma do software (não específico a nenhum SO), ex.: Java, Firefox, ECMA CLR@pt"
    #voc/lstr
     "Indicator of software platform (non-OS specific), e.g. Java, Firefox, ECMA CLR@en"],
   :rdfs/domain [:doap/Version :doap/Project],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [#voc/lstr "plataforma@pt" #voc/lstr "platform@en"],
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :doap/platform})

(def programming-language
  "Programming language a project is implemented in or intended for use with."
  {:db/ident :doap/programming-language,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr
     "Programming language a project is implemented in or intended for use with.@en"
    #voc/lstr
     "Lenguaje de programación en el que un proyecto es implementado o con el cuál pretende usarse.@es"
    #voc/lstr
     "Programmiersprache in der ein Projekt implementiert ist oder intendiert wird zu benutzen.@de"
    #voc/lstr
     "Langage de programmation avec lequel un projet est implémenté,\n\t\tou avec lequel il est prévu de l'utiliser.@fr"
    #voc/lstr
     "Programovací jazyk, ve kterém je projekt implementován nebo pro který je zamýšlen k použití.@cs"
    #voc/lstr
     "Linguagem de programação que o projeto usa ou é para ser utilizada.@pt"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [#voc/lstr "programovací jazyk@cs"
                #voc/lstr "langage de programmation@fr"
                #voc/lstr "programming language@en"
                #voc/lstr "lenguaje de programación@es"
                #voc/lstr "Programmiersprache@de"
                #voc/lstr "linguagem de programação@pt"],
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :doap/programming-language})

(def release
  "A project release."
  {:db/ident           :doap/release,
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr "Un release (versión) de un proyecto.@es"
                        #voc/lstr "Une release (révision) d'un projet.@fr"
                        #voc/lstr "A project release.@en"
                        #voc/lstr "Relase (verze) projektu.@cs"
                        #voc/lstr "A publicação de um projeto.@pt"
                        #voc/lstr "Ein Release (Version) eines Projekts.@de"],
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         [#voc/lstr "Release@de"
                        #voc/lstr "release@cs"
                        #voc/lstr "release@es"
                        #voc/lstr "release@fr"
                        #voc/lstr "release@en"
                        #voc/lstr "publicação@pt"],
   :rdfs/range         :doap/Version,
   :rdfs/subPropertyOf :doap/release})

(def repository
  "Source code repository."
  {:db/ident           :doap/repository,
   :owl/inverseOf      :doap/repositoryOf,
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr "Repositorio del código fuente.@es"
                        #voc/lstr "Úložiště zdrojových kódů.@cs"
                        #voc/lstr "Source code repository.@en"
                        #voc/lstr "Repositório do código fonte.@pt"
                        #voc/lstr "Dépôt du code source.@fr"
                        #voc/lstr "Quellcode-Versionierungssystem.@de"],
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         [#voc/lstr "repository@en"
                        #voc/lstr "repositorio@es"
                        #voc/lstr "repositório@pt"
                        #voc/lstr "dépôt@fr"
                        #voc/lstr "Repository@de"
                        #voc/lstr "úložiště@cs"],
   :rdfs/range         :doap/Repository,
   :rdfs/subPropertyOf :doap/repository})

(def repositoryOf
  "The project that uses a repository."
  {:db/ident           :doap/repositoryOf,
   :owl/inverseOf      :doap/repository,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "The project that uses a repository.@en",
   :rdfs/domain        :doap/Repository,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         #voc/lstr "repository of@en",
   :rdfs/range         :doap/Project,
   :rdfs/subPropertyOf :doap/repositoryOf})

(def revision
  "Revision identifier of a software release."
  {:db/ident :doap/revision,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "Revision identifier of a software release.@en"
    #voc/lstr "Indentificador de la versión de un release de software.@es"
    #voc/lstr "Identificador do lançamento da revisão do software.@pt"
    #voc/lstr "Identifikátor zpřístupněné revize softwaru.@cs"
    #voc/lstr "Versionsidentifikator eines Software-Releases.@de"
    #voc/lstr "Identifiant de révision d'une release du programme.@fr"],
   :rdfs/domain :doap/Version,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [#voc/lstr "Version@de"
                #voc/lstr "revision@en"
                #voc/lstr "revisão@pt"
                #voc/lstr "révision@fr"
                #voc/lstr "versión@es"
                #voc/lstr "verze@cs"],
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :doap/revision})

(def screenshots
  "Web page with screenshots of project."
  {:db/ident           :doap/screenshots,
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr "Web page with screenshots of project.@en"
                        #voc/lstr
                         "Página web con capturas de pantalla del proyecto.@es"
                        #voc/lstr
                         "Page web avec des captures d'écran du projet.@fr"
                        #voc/lstr
                         "Página web com as capturas de ecrãn do projeto.@pt"
                        #voc/lstr
                         "Webová stránka projektu se snímky obrazovky.@cs"
                        #voc/lstr
                         "Web-Seite mit Screenshots eines Projektes.@de"],
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         [#voc/lstr "snímek obrazovky@cs"
                        #voc/lstr "capturas de ecrãs@pt"
                        #voc/lstr "Screenshots@de"
                        #voc/lstr "screenshots@en"
                        #voc/lstr "captures d'écran@fr"
                        #voc/lstr "capturas de pantalla@es"],
   :rdfs/subPropertyOf :doap/screenshots})

(def security-contact
  "The Agent that should be contacted if security issues are found with the project."
  {:db/ident :doap/security-contact,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The Agent that should be contacted\n\tif security issues are found with the project.@en",
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label #voc/lstr "security contact@en",
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf :doap/security-contact})

(def security-policy
  "URL of the security policy of a project."
  {:db/ident           :doap/security-policy,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "URL of the security policy of a project.@en",
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         #voc/lstr "security policy@en",
   :rdfs/subPropertyOf [:foaf/page :doap/security-policy]})

(def service-endpoint
  "The URI of a web service endpoint where software as a service may be accessed"
  {:db/ident :doap/service-endpoint,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The URI of a web service endpoint where software as a service may be accessed@en",
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label #voc/lstr "service endpoint@en",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :doap/service-endpoint})

(def shortdesc
  "Short (8 or 9 words) plain text description of a project."
  {:db/ident :doap/shortdesc,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr
     "Descripción corta (8 o 9 palabras) en texto plano de un proyecto.@es"
    #voc/lstr "Short (8 or 9 words) plain text description of a project.@en"
    #voc/lstr
     "Kurzbeschreibung (8 oder 9 Wörter) eines Projekts als einfacher Text.@de"
    #voc/lstr
     "Descrição curta (com 8 ou 9 palavras) de um projeto em texto apenas.@pt"
    #voc/lstr "Krátký (8 nebo 9 slov) čistě textový popis projektu.@cs"
    #voc/lstr "Texte descriptif concis (8 ou 9 mots) d'un projet.@fr"],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [#voc/lstr "Kurzbeschreibung@de"
                #voc/lstr "description courte@fr"
                #voc/lstr "descrição curta@pt"
                #voc/lstr "descripción corta@es"
                #voc/lstr "krátký popis@cs"
                #voc/lstr "short description@en"],
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :doap/shortdesc})

(def support-forum
  "A forum or community that supports this project."
  {:db/ident           :doap/support-forum,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr
                        "A forum or community that supports this project.@en",
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         #voc/lstr "supporting forum@en",
   :rdfs/range         :sioc/Container,
   :rdfs/subPropertyOf :doap/support-forum})

(def tester
  "A tester or other quality control contributor."
  {:db/ident :doap/tester,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "Tester nebo jiný spoluautor kontrolující kvalitu.@cs"
    #voc/lstr "Ein Tester oder anderer Mitarbeiter der Qualitätskontrolle.@de"
    #voc/lstr "Un testeur ou un collaborateur au contrôle qualité.@fr"
    #voc/lstr "A tester or other quality control contributor.@en"
    #voc/lstr
     "Um controlador ou outro contribuidor para o controlo de qualidade.@pt"
    #voc/lstr "Un tester u otro proveedor de control de calidad.@es"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [#voc/lstr "testeur@fr"
                #voc/lstr "Tester@de"
                #voc/lstr "controlador@pt"
                #voc/lstr "tester@cs"
                #voc/lstr "tester@es"
                #voc/lstr "tester@en"],
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :doap/tester})

(def translator
  "Contributor of translations to the project."
  {:db/ident           :doap/translator,
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr
                         "Contribuidor das traduções para o projeto.@pt"
                        #voc/lstr "Proveedor de traducciones al proyecto.@es"
                        #voc/lstr
                         "Mitarbeiter an den Übersetzungen des Projektes.@de"
                        #voc/lstr
                         "Contributor of translations to the project.@en"
                        #voc/lstr "Collaborateur à la traduction du projet.@fr"
                        #voc/lstr "Spoluautor překladu projektu.@cs"],
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         [#voc/lstr "traductor@es"
                        #voc/lstr "translator@en"
                        #voc/lstr "tradutor@pt"
                        #voc/lstr "Übersetzer@de"
                        #voc/lstr "traducteur@fr"
                        #voc/lstr "překladatel@cs"],
   :rdfs/range         :foaf/Person,
   :rdfs/subPropertyOf :doap/translator})

(def vendor
  "Vendor organization: commercial, free or otherwise"
  {:db/ident           :doap/vendor,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr
                        "Vendor organization: commercial, free or otherwise@en",
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         #voc/lstr "vendor@en",
   :rdfs/range         :foaf/Organization,
   :rdfs/subPropertyOf :doap/vendor})

(def wiki
  "URL of Wiki for collaborative discussion of project."
  {:db/ident :doap/wiki,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "L'URL du Wiki pour la discussion collaborative sur le projet.@fr"
    #voc/lstr "URL of Wiki for collaborative discussion of project.@en"
    #voc/lstr "URL adresa wiki projektu pro společné diskuse.@cs"
    #voc/lstr "Wiki-URL für die kollaborative Dikussion eines Projektes.@de"
    #voc/lstr "URL da Wiki para discussão em grupo do projeto.@pt"
    #voc/lstr "URL del Wiki para discusión colaborativa del proyecto.@es"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [#voc/lstr "Wiki@de"
                #voc/lstr "wiki@pt"
                #voc/lstr "wiki@cs"
                #voc/lstr "wiki@es"
                #voc/lstr "wiki@fr"
                #voc/lstr "wiki@en"],
   :rdfs/range :sioc.types/Wiki,
   :rdfs/subPropertyOf :doap/wiki})

;; (def ^{:private true} Project
;;   {:db/ident        :foaf/Project,
;;    :rdf/type        :rdfs/Class,
;;    :rdfs/subClassOf :foaf/Project})

;; (def ^{:private true} homepage
;;   {:db/ident :foaf/homepage,
;;    :rdf/type :rdf/Property,
;;    :rdfs/subPropertyOf :foaf/homepage})

;; (def ^{:private true} page
;;   {:db/ident :foaf/page,
;;    :rdf/type :rdf/Property,
;;    :rdfs/subPropertyOf :foaf/page})
